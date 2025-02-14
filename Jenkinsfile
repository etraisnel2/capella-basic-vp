pipeline {
  agent { label 'migration' }
  
  tools {
        maven 'apache-maven-latest'
        jdk 'openjdk-jdk14-latest'
  }
  environment {
		JACOCO_VERSION = "0.8.6"
		MVN_QUALITY_PROFILES = '-Pfull'
		JACOCO_EXEC_FILE_PATH = '${WORKSPACE}/jacoco.exec'
  }
  stages {
    stage('Package basic vp') {
      steps {
        wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
          script {
			def jacocoPrepareAgent = "-Djacoco.destFile=$JACOCO_EXEC_FILE_PATH -Djacoco.append=true org.jacoco:jacoco-maven-plugin:$JACOCO_VERSION:prepare-agent"
			sh "mvn ${jacocoPrepareAgent} clean verify -Pfull -Psign -e -f pom.xml"					    
		  }
        }
      }
    }
    stage('Archive artifacts') {
      steps {
        archiveArtifacts artifacts: 'releng/org.polarsys.capella.basic.mass.viewpoint.site/target/BasicMass-*.zip,releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/BasicPerfo-*.zip,releng/org.polarsys.capella.basic.price.viewpoint.site/target/BasicPrice-*.zip,releng/org.polarsys.capella.basic.mass.viewpoint.site/target/repository/**,releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/repository/**,releng/org.polarsys.capella.basic.price.viewpoint.site/target/repository/**'
      }
    }
    stage('Deploy') {
	  when {
		  not { changeRequest() }
	  }
      steps {
          sshagent ( ['projects-storage.eclipse.org-bot-ssh']) {
            sh '''
              echo "publish mass update site"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicmass/updates/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicmass/updates/nightly/master
              scp -r releng/org.polarsys.capella.basic.mass.viewpoint.site/target/repository/* genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicmass/updates/nightly/master/
  
              echo "publish mass dropins"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicmass/dropins/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicmass/dropins/nightly/master
              scp -r releng/org.polarsys.capella.basic.mass.viewpoint.site/target/BasicMass-dropins*.zip genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicmass/dropins/nightly/master/
 
              echo "publish perfo update site"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicperfo/updates/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicperfo/updates/nightly/master
              scp -r releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/repository/* genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicperfo/updates/nightly/master/
  
              echo "publish perfo dropins"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicperfo/dropins/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicperfo/dropins/nightly/master
              scp -r releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/BasicPerfo-dropins*.zip genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicperfo/dropins/nightly/master/

              echo "publish price update site"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicprice/updates/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicprice/updates/nightly/master
              scp -r releng/org.polarsys.capella.basic.price.viewpoint.site/target/repository/* genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicprice/updates/nightly/master/
  
              echo "publish price dropins"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicprice/dropins/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicprice/dropins/nightly/master
              scp -r releng/org.polarsys.capella.basic.price.viewpoint.site/target/BasicPrice-dropins*.zip genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicprice/dropins/nightly/master/
			  
            '''
        }
      }
    }
    stage('Publish tests results') {
      steps {
        junit allowEmptyResults: true, testResults: '*.xml,**/target/surefire-reports/*.xml'
        sh "mvn -Djacoco.dataFile=$JACOCO_EXEC_FILE_PATH org.jacoco:jacoco-maven-plugin:$JACOCO_VERSION:report $MVN_QUALITY_PROFILES -e -f pom.xml"
	  }
    }
    stage('Perform Sonar analysis') {
      environment {
          PROJECT_NAME = 'capella-basic-vp'
          SONARCLOUD_TOKEN = credentials('sonar-token-capella-basic-vp')
          SONAR_PROJECT_KEY = 'eclipse_capella-basic-vp'
      }
      steps {
        withEnv(['MAVEN_OPTS=-Xmx4g']) {
          script {
            def jacocoParameters = "-Dsonar.coverage.jacoco.xmlReportPaths='target/site/jacoco/jacoco.xml,target/surefire-reports/TEST*.xml' -Dsonar.java.coveragePlugin=jacoco -Dsonar.core.codeCoveragePlugin=jacoco "
            def sonarExclusions = "-Dsonar.exclusions='**/generated/**/*.java,**/src-gen/**/*.java' "
            def javaVersion = "8"
            def sonarCommon = "sonar:sonar -Dsonar.projectKey=$SONAR_PROJECT_KEY -Dsonar.organization=eclipse -Dsonar.host.url=https://sonarcloud.io -Dsonar.login='$SONARCLOUD_TOKEN' -Dsonar.skipDesign=true -Dsonar.dynamic=reuseReports -Dsonar.java.source=${javaVersion} -Dsonar.scanner.force-deprecated-java-version=true "
            def sonarBranchAnalysis = "-Dsonar.branch.name=${BRANCH_NAME}"
            def sonarPullRequestAnalysis = ("${BRANCH_NAME}".contains('PR-') ? "-Dsonar.pullrequest.provider=GitHub -Dsonar.pullrequest.github.repository=eclipse/$PROJECT_NAME -Dsonar.pullrequest.key=${CHANGE_ID} -Dsonar.pullrequest.branch=${CHANGE_BRANCH}" : "" )
            def sonar = sonarCommon + jacocoParameters + sonarExclusions + ("${BRANCH_NAME}".contains('PR-') ? sonarPullRequestAnalysis : sonarBranchAnalysis)
            sh "mvn ${sonar} $MVN_QUALITY_PROFILES -e -f pom.xml"
          }
        }
      }
	}
  }
}