/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Regelzeichnung.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.Regelzeichnung.*;

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
 * @see org.eclipse.set.model.model11001.Regelzeichnung.RegelzeichnungPackage
 * @generated
 */
public class RegelzeichnungSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RegelzeichnungPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegelzeichnungSwitch() {
		if (modelPackage == null) {
			modelPackage = RegelzeichnungPackage.eINSTANCE;
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
			case RegelzeichnungPackage.BILD_TYPE_CLASS: {
				Bild_TypeClass bild_TypeClass = (Bild_TypeClass)theEObject;
				T result = caseBild_TypeClass(bild_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bild_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegelzeichnungPackage.REGELZEICHNUNG: {
				Regelzeichnung regelzeichnung = (Regelzeichnung)theEObject;
				T result = caseRegelzeichnung(regelzeichnung);
				if (result == null) result = caseBasis_Objekt(regelzeichnung);
				if (result == null) result = caseUr_Objekt(regelzeichnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP: {
				Regelzeichnung_Allg_AttributeGroup regelzeichnung_Allg_AttributeGroup = (Regelzeichnung_Allg_AttributeGroup)theEObject;
				T result = caseRegelzeichnung_Allg_AttributeGroup(regelzeichnung_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER: {
				Regelzeichnung_Parameter regelzeichnung_Parameter = (Regelzeichnung_Parameter)theEObject;
				T result = caseRegelzeichnung_Parameter(regelzeichnung_Parameter);
				if (result == null) result = caseBasis_Objekt(regelzeichnung_Parameter);
				if (result == null) result = caseUr_Objekt(regelzeichnung_Parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP: {
				Regelzeichnung_Parameter_Allg_AttributeGroup regelzeichnung_Parameter_Allg_AttributeGroup = (Regelzeichnung_Parameter_Allg_AttributeGroup)theEObject;
				T result = caseRegelzeichnung_Parameter_Allg_AttributeGroup(regelzeichnung_Parameter_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegelzeichnungPackage.RZ_NUMMER_TYPE_CLASS: {
				RZ_Nummer_TypeClass rZ_Nummer_TypeClass = (RZ_Nummer_TypeClass)theEObject;
				T result = caseRZ_Nummer_TypeClass(rZ_Nummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rZ_Nummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegelzeichnungPackage.RZ_PARAMETER_NAME_TYPE_CLASS: {
				RZ_Parameter_Name_TypeClass rZ_Parameter_Name_TypeClass = (RZ_Parameter_Name_TypeClass)theEObject;
				T result = caseRZ_Parameter_Name_TypeClass(rZ_Parameter_Name_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rZ_Parameter_Name_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegelzeichnungPackage.RZ_PARAMETER_WERT_TYPE_CLASS: {
				RZ_Parameter_Wert_TypeClass rZ_Parameter_Wert_TypeClass = (RZ_Parameter_Wert_TypeClass)theEObject;
				T result = caseRZ_Parameter_Wert_TypeClass(rZ_Parameter_Wert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rZ_Parameter_Wert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegelzeichnungPackage.TITEL_TYPE_CLASS: {
				Titel_TypeClass titel_TypeClass = (Titel_TypeClass)theEObject;
				T result = caseTitel_TypeClass(titel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(titel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegelzeichnungPackage.UNTERTITEL_TYPE_CLASS: {
				Untertitel_TypeClass untertitel_TypeClass = (Untertitel_TypeClass)theEObject;
				T result = caseUntertitel_TypeClass(untertitel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(untertitel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bild Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bild Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBild_TypeClass(Bild_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regelzeichnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regelzeichnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegelzeichnung(Regelzeichnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regelzeichnung Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regelzeichnung Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegelzeichnung_Allg_AttributeGroup(Regelzeichnung_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regelzeichnung Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regelzeichnung Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegelzeichnung_Parameter(Regelzeichnung_Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regelzeichnung Parameter Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regelzeichnung Parameter Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegelzeichnung_Parameter_Allg_AttributeGroup(Regelzeichnung_Parameter_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RZ Nummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RZ Nummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRZ_Nummer_TypeClass(RZ_Nummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RZ Parameter Name Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RZ Parameter Name Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRZ_Parameter_Name_TypeClass(RZ_Parameter_Name_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RZ Parameter Wert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RZ Parameter Wert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRZ_Parameter_Wert_TypeClass(RZ_Parameter_Wert_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitel_TypeClass(Titel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Untertitel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Untertitel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUntertitel_TypeClass(Untertitel_TypeClass object) {
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

} //RegelzeichnungSwitch
