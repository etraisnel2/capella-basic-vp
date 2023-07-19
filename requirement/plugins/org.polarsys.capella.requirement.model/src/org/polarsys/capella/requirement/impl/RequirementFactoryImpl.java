

package org.polarsys.capella.requirement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.common.lib.IdGenerator;

import org.polarsys.capella.requirement.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementFactoryImpl extends EFactoryImpl implements RequirementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequirementFactory init() {
		try {
			RequirementFactory theRequirementFactory = (RequirementFactory)EPackage.Registry.INSTANCE.getEFactory(RequirementPackage.eNS_URI);
			if (theRequirementFactory != null) {
				return theRequirementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequirementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RequirementPackage.REQUIREMENTS_PKG: return createRequirementsPkg();
			case RequirementPackage.REQUIREMENTS_TRACE: return createRequirementsTrace();
			case RequirementPackage.SYSTEM_FUNCTIONAL_INTERFACE_REQUIREMENT: return createSystemFunctionalInterfaceRequirement();
			case RequirementPackage.SYSTEM_FUNCTIONAL_REQUIREMENT: return createSystemFunctionalRequirement();
			case RequirementPackage.SYSTEM_NON_FUNCTIONAL_INTERFACE_REQUIREMENT: return createSystemNonFunctionalInterfaceRequirement();
			case RequirementPackage.SYSTEM_NON_FUNCTIONAL_REQUIREMENT: return createSystemNonFunctionalRequirement();
			case RequirementPackage.SYSTEM_USER_REQUIREMENT: return createSystemUserRequirement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsPkg createRequirementsPkg() {
		RequirementsPkgImpl requirementsPkg = new RequirementsPkgImpl();
    //begin-capella-code
    requirementsPkg.setId(IdGenerator.createId());
    //end-capella-code
		return requirementsPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsTrace createRequirementsTrace() {
		RequirementsTraceImpl requirementsTrace = new RequirementsTraceImpl();
    //begin-capella-code
    requirementsTrace.setId(IdGenerator.createId());
    //end-capella-code
		return requirementsTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemFunctionalInterfaceRequirement createSystemFunctionalInterfaceRequirement() {
		SystemFunctionalInterfaceRequirementImpl systemFunctionalInterfaceRequirement = new SystemFunctionalInterfaceRequirementImpl();
    //begin-capella-code
    systemFunctionalInterfaceRequirement.setId(IdGenerator.createId());
    //end-capella-code
		return systemFunctionalInterfaceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemFunctionalRequirement createSystemFunctionalRequirement() {
		SystemFunctionalRequirementImpl systemFunctionalRequirement = new SystemFunctionalRequirementImpl();
    //begin-capella-code
    systemFunctionalRequirement.setId(IdGenerator.createId());
    //end-capella-code
		return systemFunctionalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemNonFunctionalInterfaceRequirement createSystemNonFunctionalInterfaceRequirement() {
		SystemNonFunctionalInterfaceRequirementImpl systemNonFunctionalInterfaceRequirement = new SystemNonFunctionalInterfaceRequirementImpl();
    //begin-capella-code
    systemNonFunctionalInterfaceRequirement.setId(IdGenerator.createId());
    //end-capella-code
		return systemNonFunctionalInterfaceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemNonFunctionalRequirement createSystemNonFunctionalRequirement() {
		SystemNonFunctionalRequirementImpl systemNonFunctionalRequirement = new SystemNonFunctionalRequirementImpl();
    //begin-capella-code
    systemNonFunctionalRequirement.setId(IdGenerator.createId());
    //end-capella-code
		return systemNonFunctionalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemUserRequirement createSystemUserRequirement() {
		SystemUserRequirementImpl systemUserRequirement = new SystemUserRequirementImpl();
    //begin-capella-code
    systemUserRequirement.setId(IdGenerator.createId());
    //end-capella-code
		return systemUserRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementPackage getRequirementPackage() {
		return (RequirementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequirementPackage getPackage() {
		return RequirementPackage.eINSTANCE;
	}

	//begin-capella-code
	
		
	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public RequirementsPkg createRequirementsPkg(String name_p) {
		RequirementsPkg requirementsPkg = createRequirementsPkg();
		requirementsPkg.setName(name_p);	  
		return requirementsPkg;
	}

		
	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public SystemFunctionalInterfaceRequirement createSystemFunctionalInterfaceRequirement(String name_p) {
		SystemFunctionalInterfaceRequirement systemFunctionalInterfaceRequirement = createSystemFunctionalInterfaceRequirement();
		systemFunctionalInterfaceRequirement.setName(name_p);	  
		return systemFunctionalInterfaceRequirement;
	}

		
	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public SystemFunctionalRequirement createSystemFunctionalRequirement(String name_p) {
		SystemFunctionalRequirement systemFunctionalRequirement = createSystemFunctionalRequirement();
		systemFunctionalRequirement.setName(name_p);	  
		return systemFunctionalRequirement;
	}

		
	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public SystemNonFunctionalInterfaceRequirement createSystemNonFunctionalInterfaceRequirement(String name_p) {
		SystemNonFunctionalInterfaceRequirement systemNonFunctionalInterfaceRequirement = createSystemNonFunctionalInterfaceRequirement();
		systemNonFunctionalInterfaceRequirement.setName(name_p);	  
		return systemNonFunctionalInterfaceRequirement;
	}

		
	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public SystemNonFunctionalRequirement createSystemNonFunctionalRequirement(String name_p) {
		SystemNonFunctionalRequirement systemNonFunctionalRequirement = createSystemNonFunctionalRequirement();
		systemNonFunctionalRequirement.setName(name_p);	  
		return systemNonFunctionalRequirement;
	}

		
	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public SystemUserRequirement createSystemUserRequirement(String name_p) {
		SystemUserRequirement systemUserRequirement = createSystemUserRequirement();
		systemUserRequirement.setName(name_p);	  
		return systemUserRequirement;
	}

	//end-capella-code
} //RequirementFactoryImpl