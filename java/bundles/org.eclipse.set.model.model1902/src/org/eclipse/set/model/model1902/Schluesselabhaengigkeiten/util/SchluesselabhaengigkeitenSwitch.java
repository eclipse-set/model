/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.*;

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
 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage
 * @generated
 */
public class SchluesselabhaengigkeitenSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchluesselabhaengigkeitenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchluesselabhaengigkeitenSwitch() {
		if (modelPackage == null) {
			modelPackage = SchluesselabhaengigkeitenPackage.eINSTANCE;
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
			case SchluesselabhaengigkeitenPackage.BEDIENUNG_ART_TYPE_CLASS: {
				Bedienung_Art_TypeClass bedienung_Art_TypeClass = (Bedienung_Art_TypeClass)theEObject;
				T result = caseBedienung_Art_TypeClass(bedienung_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bedienung_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.BESCHREIBUNG_SONDERANLAGE_TYPE_CLASS: {
				Beschreibung_Sonderanlage_TypeClass beschreibung_Sonderanlage_TypeClass = (Beschreibung_Sonderanlage_TypeClass)theEObject;
				T result = caseBeschreibung_Sonderanlage_TypeClass(beschreibung_Sonderanlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(beschreibung_Sonderanlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SCHLOSS_TYPE_CLASS: {
				Bezeichnung_Schloss_TypeClass bezeichnung_Schloss_TypeClass = (Bezeichnung_Schloss_TypeClass)theEObject;
				T result = caseBezeichnung_Schloss_TypeClass(bezeichnung_Schloss_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Schloss_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SCHLUESSEL_TYPE_CLASS: {
				Bezeichnung_Schluessel_TypeClass bezeichnung_Schluessel_TypeClass = (Bezeichnung_Schluessel_TypeClass)theEObject;
				T result = caseBezeichnung_Schluessel_TypeClass(bezeichnung_Schluessel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Schluessel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SK_TYPE_CLASS: {
				Bezeichnung_Sk_TypeClass bezeichnung_Sk_TypeClass = (Bezeichnung_Sk_TypeClass)theEObject;
				T result = caseBezeichnung_Sk_TypeClass(bezeichnung_Sk_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Sk_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.BUE_LAGE_TYPE_CLASS: {
				BUE_Lage_TypeClass buE_Lage_TypeClass = (BUE_Lage_TypeClass)theEObject;
				T result = caseBUE_Lage_TypeClass(buE_Lage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(buE_Lage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.GSP_LAGE_TYPE_CLASS: {
				Gsp_Lage_TypeClass gsp_Lage_TypeClass = (Gsp_Lage_TypeClass)theEObject;
				T result = caseGsp_Lage_TypeClass(gsp_Lage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gsp_Lage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.HAUPTSCHLOSS_TYPE_CLASS: {
				Hauptschloss_TypeClass hauptschloss_TypeClass = (Hauptschloss_TypeClass)theEObject;
				T result = caseHauptschloss_TypeClass(hauptschloss_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hauptschloss_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLOSS: {
				Schloss schloss = (Schloss)theEObject;
				T result = caseSchloss(schloss);
				if (result == null) result = caseBasis_Objekt(schloss);
				if (result == null) result = caseUr_Objekt(schloss);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLOSS_ART_TYPE_CLASS: {
				Schloss_Art_TypeClass schloss_Art_TypeClass = (Schloss_Art_TypeClass)theEObject;
				T result = caseSchloss_Art_TypeClass(schloss_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schloss_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Schloss_Bezeichnung_AttributeGroup schloss_Bezeichnung_AttributeGroup = (Schloss_Bezeichnung_AttributeGroup)theEObject;
				T result = caseSchloss_Bezeichnung_AttributeGroup(schloss_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLOSS_BUE_ATTRIBUTE_GROUP: {
				Schloss_BUE_AttributeGroup schloss_BUE_AttributeGroup = (Schloss_BUE_AttributeGroup)theEObject;
				T result = caseSchloss_BUE_AttributeGroup(schloss_BUE_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP: {
				Schloss_Gsp_AttributeGroup schloss_Gsp_AttributeGroup = (Schloss_Gsp_AttributeGroup)theEObject;
				T result = caseSchloss_Gsp_AttributeGroup(schloss_Gsp_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP: {
				Schloss_Sk_AttributeGroup schloss_Sk_AttributeGroup = (Schloss_Sk_AttributeGroup)theEObject;
				T result = caseSchloss_Sk_AttributeGroup(schloss_Sk_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP: {
				Schloss_Sonderanlage_AttributeGroup schloss_Sonderanlage_AttributeGroup = (Schloss_Sonderanlage_AttributeGroup)theEObject;
				T result = caseSchloss_Sonderanlage_AttributeGroup(schloss_Sonderanlage_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SSP_ATTRIBUTE_GROUP: {
				Schloss_Ssp_AttributeGroup schloss_Ssp_AttributeGroup = (Schloss_Ssp_AttributeGroup)theEObject;
				T result = caseSchloss_Ssp_AttributeGroup(schloss_Ssp_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP: {
				Schloss_W_AttributeGroup schloss_W_AttributeGroup = (Schloss_W_AttributeGroup)theEObject;
				T result = caseSchloss_W_AttributeGroup(schloss_W_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION: {
				Schlosskombination schlosskombination = (Schlosskombination)theEObject;
				T result = caseSchlosskombination(schlosskombination);
				if (result == null) result = caseBasis_Objekt(schlosskombination);
				if (result == null) result = caseUr_Objekt(schlosskombination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Schlosskombination_Bezeichnung_AttributeGroup schlosskombination_Bezeichnung_AttributeGroup = (Schlosskombination_Bezeichnung_AttributeGroup)theEObject;
				T result = caseSchlosskombination_Bezeichnung_AttributeGroup(schlosskombination_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL: {
				Schluessel schluessel = (Schluessel)theEObject;
				T result = caseSchluessel(schluessel);
				if (result == null) result = caseBasis_Objekt(schluessel);
				if (result == null) result = caseUr_Objekt(schluessel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP: {
				Schluessel_Allg_AttributeGroup schluessel_Allg_AttributeGroup = (Schluessel_Allg_AttributeGroup)theEObject;
				T result = caseSchluessel_Allg_AttributeGroup(schluessel_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_BARTFORM_TYPE_CLASS: {
				Schluessel_Bartform_TypeClass schluessel_Bartform_TypeClass = (Schluessel_Bartform_TypeClass)theEObject;
				T result = caseSchluessel_Bartform_TypeClass(schluessel_Bartform_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schluessel_Bartform_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Schluessel_Bezeichnung_AttributeGroup schluessel_Bezeichnung_AttributeGroup = (Schluessel_Bezeichnung_AttributeGroup)theEObject;
				T result = caseSchluessel_Bezeichnung_AttributeGroup(schluessel_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_GRUPPE_TYPE_CLASS: {
				Schluessel_Gruppe_TypeClass schluessel_Gruppe_TypeClass = (Schluessel_Gruppe_TypeClass)theEObject;
				T result = caseSchluessel_Gruppe_TypeClass(schluessel_Gruppe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schluessel_Gruppe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_IN_GRDST_EINGESCHL_TYPE_CLASS: {
				Schluessel_In_Grdst_Eingeschl_TypeClass schluessel_In_Grdst_Eingeschl_TypeClass = (Schluessel_In_Grdst_Eingeschl_TypeClass)theEObject;
				T result = caseSchluessel_In_Grdst_Eingeschl_TypeClass(schluessel_In_Grdst_Eingeschl_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schluessel_In_Grdst_Eingeschl_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE: {
				Schluesselsperre schluesselsperre = (Schluesselsperre)theEObject;
				T result = caseSchluesselsperre(schluesselsperre);
				if (result == null) result = caseBasis_Objekt(schluesselsperre);
				if (result == null) result = caseUr_Objekt(schluesselsperre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.TECHNISCH_BERECHTIGTER_TYPE_CLASS: {
				Technisch_Berechtigter_TypeClass technisch_Berechtigter_TypeClass = (Technisch_Berechtigter_TypeClass)theEObject;
				T result = caseTechnisch_Berechtigter_TypeClass(technisch_Berechtigter_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(technisch_Berechtigter_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.VERSCHLUSS_HERZSTUECK_TYPE_CLASS: {
				Verschluss_Herzstueck_TypeClass verschluss_Herzstueck_TypeClass = (Verschluss_Herzstueck_TypeClass)theEObject;
				T result = caseVerschluss_Herzstueck_TypeClass(verschluss_Herzstueck_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(verschluss_Herzstueck_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.WANBAULAGE_TYPE_CLASS: {
				W_Anbaulage_TypeClass w_Anbaulage_TypeClass = (W_Anbaulage_TypeClass)theEObject;
				T result = caseW_Anbaulage_TypeClass(w_Anbaulage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(w_Anbaulage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchluesselabhaengigkeitenPackage.WLAGE_TYPE_CLASS: {
				W_Lage_TypeClass w_Lage_TypeClass = (W_Lage_TypeClass)theEObject;
				T result = caseW_Lage_TypeClass(w_Lage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(w_Lage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedienung Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedienung Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedienung_Art_TypeClass(Bedienung_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beschreibung Sonderanlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beschreibung Sonderanlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeschreibung_Sonderanlage_TypeClass(Beschreibung_Sonderanlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Schloss Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Schloss Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Schloss_TypeClass(Bezeichnung_Schloss_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Schluessel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Schluessel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Schluessel_TypeClass(Bezeichnung_Schluessel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Sk Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Sk Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Sk_TypeClass(Bezeichnung_Sk_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Lage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Lage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Lage_TypeClass(BUE_Lage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gsp Lage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gsp Lage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGsp_Lage_TypeClass(Gsp_Lage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hauptschloss Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hauptschloss Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHauptschloss_TypeClass(Hauptschloss_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schloss</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schloss</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchloss(Schloss object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schloss Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schloss Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchloss_Art_TypeClass(Schloss_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schloss Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schloss Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchloss_Bezeichnung_AttributeGroup(Schloss_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schloss BUE Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schloss BUE Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchloss_BUE_AttributeGroup(Schloss_BUE_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schloss Gsp Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schloss Gsp Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchloss_Gsp_AttributeGroup(Schloss_Gsp_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schloss Sk Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schloss Sk Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchloss_Sk_AttributeGroup(Schloss_Sk_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schloss Sonderanlage Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schloss Sonderanlage Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchloss_Sonderanlage_AttributeGroup(Schloss_Sonderanlage_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schloss Ssp Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schloss Ssp Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchloss_Ssp_AttributeGroup(Schloss_Ssp_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schloss WAttribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schloss WAttribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchloss_W_AttributeGroup(Schloss_W_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schlosskombination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schlosskombination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchlosskombination(Schlosskombination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schlosskombination Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schlosskombination Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchlosskombination_Bezeichnung_AttributeGroup(Schlosskombination_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schluessel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schluessel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchluessel(Schluessel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schluessel Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schluessel Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchluessel_Allg_AttributeGroup(Schluessel_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schluessel Bartform Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schluessel Bartform Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchluessel_Bartform_TypeClass(Schluessel_Bartform_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schluessel Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schluessel Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchluessel_Bezeichnung_AttributeGroup(Schluessel_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schluessel Gruppe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schluessel Gruppe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchluessel_Gruppe_TypeClass(Schluessel_Gruppe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schluessel In Grdst Eingeschl Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schluessel In Grdst Eingeschl Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchluessel_In_Grdst_Eingeschl_TypeClass(Schluessel_In_Grdst_Eingeschl_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schluesselsperre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schluesselsperre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchluesselsperre(Schluesselsperre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technisch Berechtigter Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technisch Berechtigter Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnisch_Berechtigter_TypeClass(Technisch_Berechtigter_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verschluss Herzstueck Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verschluss Herzstueck Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerschluss_Herzstueck_TypeClass(Verschluss_Herzstueck_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WAnbaulage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WAnbaulage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW_Anbaulage_TypeClass(W_Anbaulage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WLage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WLage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW_Lage_TypeClass(W_Lage_TypeClass object) {
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

} //SchluesselabhaengigkeitenSwitch
