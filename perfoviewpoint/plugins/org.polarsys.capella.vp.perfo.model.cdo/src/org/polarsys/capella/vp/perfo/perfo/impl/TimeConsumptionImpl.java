
package org.polarsys.capella.vp.perfo.perfo.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.vp.perfo.perfo.PerfoPackage;
import org.polarsys.capella.vp.perfo.perfo.TimeConsumption;
import org.polarsys.capella.vp.perfo.perfo.UnityElement;
import org.polarsys.capella.vp.perfo.perfo.measurementUnit_Type;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Consumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.perfo.perfo.impl.TimeConsumptionImpl#getMeasurementUnit <em>Measurement Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeConsumptionImpl extends PerformanceConsumptionImpl implements TimeConsumption {

	/**
	 * The default value of the '{@link #getMeasurementUnit() <em>Measurement Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementUnit()
	 * @generated
	 * @ordered
	 */
	protected static final measurementUnit_Type MEASUREMENT_UNIT_EDEFAULT = measurementUnit_Type.MILLISECOND;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeConsumptionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PerfoPackage.Literals.TIME_CONSUMPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public measurementUnit_Type getMeasurementUnit() {

		return (measurementUnit_Type) eDynamicGet(PerfoPackage.TIME_CONSUMPTION__MEASUREMENT_UNIT,
				PerfoPackage.Literals.UNITY_ELEMENT__MEASUREMENT_UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMeasurementUnit(measurementUnit_Type newMeasurementUnit) {

		eDynamicSet(PerfoPackage.TIME_CONSUMPTION__MEASUREMENT_UNIT,
				PerfoPackage.Literals.UNITY_ELEMENT__MEASUREMENT_UNIT, newMeasurementUnit);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PerfoPackage.TIME_CONSUMPTION__MEASUREMENT_UNIT:
			return getMeasurementUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PerfoPackage.TIME_CONSUMPTION__MEASUREMENT_UNIT:
			setMeasurementUnit((measurementUnit_Type) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PerfoPackage.TIME_CONSUMPTION__MEASUREMENT_UNIT:
			setMeasurementUnit(MEASUREMENT_UNIT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PerfoPackage.TIME_CONSUMPTION__MEASUREMENT_UNIT:
			return getMeasurementUnit() != MEASUREMENT_UNIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UnityElement.class) {
			switch (derivedFeatureID) {
			case PerfoPackage.TIME_CONSUMPTION__MEASUREMENT_UNIT:
				return PerfoPackage.UNITY_ELEMENT__MEASUREMENT_UNIT;
			default:
				return -1;
			}
		}
		if (baseClass == ElementExtension.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == UnityElement.class) {
			switch (baseFeatureID) {
			case PerfoPackage.UNITY_ELEMENT__MEASUREMENT_UNIT:
				return PerfoPackage.TIME_CONSUMPTION__MEASUREMENT_UNIT;
			default:
				return -1;
			}
		}
		if (baseClass == ElementExtension.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TimeConsumptionImpl