/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.ATO.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model11001.ATO.*;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.ATO.ATOPackage
 * @generated
 */
public class ATOSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ATOPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATOSwitch() {
		if (modelPackage == null) {
			modelPackage = ATOPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ATOPackage.ABSTAND_ATO_HALT_VOR_EO_ATYPE_CLASS: {
				Abstand_ATO_Halt_Vor_EoA_TypeClass abstand_ATO_Halt_Vor_EoA_TypeClass = (Abstand_ATO_Halt_Vor_EoA_TypeClass)theEObject;
				T result = caseAbstand_ATO_Halt_Vor_EoA_TypeClass(abstand_ATO_Halt_Vor_EoA_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(abstand_ATO_Halt_Vor_EoA_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.ATO_SEGMENT_PROFILE: {
				ATO_Segment_Profile atO_Segment_Profile = (ATO_Segment_Profile)theEObject;
				T result = caseATO_Segment_Profile(atO_Segment_Profile);
				if (result == null) result = caseBasis_Objekt(atO_Segment_Profile);
				if (result == null) result = caseUr_Objekt(atO_Segment_Profile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				ATO_Segment_Profile_Bezeichnung_AttributeGroup atO_Segment_Profile_Bezeichnung_AttributeGroup = (ATO_Segment_Profile_Bezeichnung_AttributeGroup)theEObject;
				T result = caseATO_Segment_Profile_Bezeichnung_AttributeGroup(atO_Segment_Profile_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.ATO_TIMING_POINT: {
				ATO_Timing_Point atO_Timing_Point = (ATO_Timing_Point)theEObject;
				T result = caseATO_Timing_Point(atO_Timing_Point);
				if (result == null) result = casePunkt_Objekt(atO_Timing_Point);
				if (result == null) result = caseBasis_Objekt(atO_Timing_Point);
				if (result == null) result = caseUr_Objekt(atO_Timing_Point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP: {
				ATO_Timing_Point_Allg_AttributeGroup atO_Timing_Point_Allg_AttributeGroup = (ATO_Timing_Point_Allg_AttributeGroup)theEObject;
				T result = caseATO_Timing_Point_Allg_AttributeGroup(atO_Timing_Point_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				ATO_Timing_Point_Bezeichnung_AttributeGroup atO_Timing_Point_Bezeichnung_AttributeGroup = (ATO_Timing_Point_Bezeichnung_AttributeGroup)theEObject;
				T result = caseATO_Timing_Point_Bezeichnung_AttributeGroup(atO_Timing_Point_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.ATO_TS_INSTANZ: {
				ATO_TS_Instanz atO_TS_Instanz = (ATO_TS_Instanz)theEObject;
				T result = caseATO_TS_Instanz(atO_TS_Instanz);
				if (result == null) result = caseBasis_Objekt(atO_TS_Instanz);
				if (result == null) result = caseUr_Objekt(atO_TS_Instanz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP: {
				ATO_TS_Instanz_Adresse_AttributeGroup atO_TS_Instanz_Adresse_AttributeGroup = (ATO_TS_Instanz_Adresse_AttributeGroup)theEObject;
				T result = caseATO_TS_Instanz_Adresse_AttributeGroup(atO_TS_Instanz_Adresse_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.BEZEICHNUNG_ATO_TP_TYPE_CLASS: {
				Bezeichnung_ATO_TP_TypeClass bezeichnung_ATO_TP_TypeClass = (Bezeichnung_ATO_TP_TypeClass)theEObject;
				T result = caseBezeichnung_ATO_TP_TypeClass(bezeichnung_ATO_TP_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_ATO_TP_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.ERREICHUNGSTOLERANZ_TYPE_CLASS: {
				Erreichungstoleranz_TypeClass erreichungstoleranz_TypeClass = (Erreichungstoleranz_TypeClass)theEObject;
				T result = caseErreichungstoleranz_TypeClass(erreichungstoleranz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(erreichungstoleranz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.HALTETOLERANZ_TYPE_CLASS: {
				Haltetoleranz_TypeClass haltetoleranz_TypeClass = (Haltetoleranz_TypeClass)theEObject;
				T result = caseHaltetoleranz_TypeClass(haltetoleranz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(haltetoleranz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.NID_ATOTS_TYPE_CLASS: {
				NID_ATOTS_TypeClass niD_ATOTS_TypeClass = (NID_ATOTS_TypeClass)theEObject;
				T result = caseNID_ATOTS_TypeClass(niD_ATOTS_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(niD_ATOTS_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.NID_CATOTS_TYPE_CLASS: {
				NID_C_ATOTS_TypeClass niD_C_ATOTS_TypeClass = (NID_C_ATOTS_TypeClass)theEObject;
				T result = caseNID_C_ATOTS_TypeClass(niD_C_ATOTS_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(niD_C_ATOTS_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.NID_SP_TYPE_CLASS: {
				NID_SP_TypeClass niD_SP_TypeClass = (NID_SP_TypeClass)theEObject;
				T result = caseNID_SP_TypeClass(niD_SP_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(niD_SP_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATOPackage.NID_TP_TYPE_CLASS: {
				NID_TP_TypeClass niD_TP_TypeClass = (NID_TP_TypeClass)theEObject;
				T result = caseNID_TP_TypeClass(niD_TP_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(niD_TP_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstand ATO Halt Vor Eo AType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstand ATO Halt Vor Eo AType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstand_ATO_Halt_Vor_EoA_TypeClass(Abstand_ATO_Halt_Vor_EoA_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATO Segment Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATO Segment Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATO_Segment_Profile(ATO_Segment_Profile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATO Segment Profile Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATO Segment Profile Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATO_Segment_Profile_Bezeichnung_AttributeGroup(ATO_Segment_Profile_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATO Timing Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATO Timing Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATO_Timing_Point(ATO_Timing_Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATO Timing Point Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATO Timing Point Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATO_Timing_Point_Allg_AttributeGroup(ATO_Timing_Point_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATO Timing Point Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATO Timing Point Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATO_Timing_Point_Bezeichnung_AttributeGroup(ATO_Timing_Point_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATO TS Instanz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATO TS Instanz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATO_TS_Instanz(ATO_TS_Instanz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATO TS Instanz Adresse Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATO TS Instanz Adresse Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATO_TS_Instanz_Adresse_AttributeGroup(ATO_TS_Instanz_Adresse_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung ATO TP Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung ATO TP Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_ATO_TP_TypeClass(Bezeichnung_ATO_TP_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erreichungstoleranz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erreichungstoleranz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErreichungstoleranz_TypeClass(Erreichungstoleranz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Haltetoleranz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Haltetoleranz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHaltetoleranz_TypeClass(Haltetoleranz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NID ATOTS Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NID ATOTS Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNID_ATOTS_TypeClass(NID_ATOTS_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NID CATOTS Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NID CATOTS Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNID_C_ATOTS_TypeClass(NID_C_ATOTS_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NID SP Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NID SP Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNID_SP_TypeClass(NID_SP_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NID TP Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NID TP Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNID_TP_TypeClass(NID_TP_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basis Attribut Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basis Attribut Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ur Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ur Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUr_Objekt(Ur_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basis Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basis Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasis_Objekt(Basis_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Punkt Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Punkt Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePunkt_Objekt(Punkt_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ATOSwitch
