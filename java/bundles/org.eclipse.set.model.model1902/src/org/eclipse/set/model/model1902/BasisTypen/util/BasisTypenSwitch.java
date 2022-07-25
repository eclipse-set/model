/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.BasisTypen.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model1902.BasisTypen.*;

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
 * @see org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage
 * @generated
 */
public class BasisTypenSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasisTypenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisTypenSwitch() {
		if (modelPackage == null) {
			modelPackage = BasisTypenPackage.eINSTANCE;
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
			case BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP: {
				BasisAttribut_AttributeGroup basisAttribut_AttributeGroup = (BasisAttribut_AttributeGroup)theEObject;
				T result = caseBasisAttribut_AttributeGroup(basisAttribut_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisTypenPackage.BEZEICHNUNG_AUSSENANLAGE_TYPE_CLASS: {
				Bezeichnung_Aussenanlage_TypeClass bezeichnung_Aussenanlage_TypeClass = (Bezeichnung_Aussenanlage_TypeClass)theEObject;
				T result = caseBezeichnung_Aussenanlage_TypeClass(bezeichnung_Aussenanlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Aussenanlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP: {
				Bezeichnung_Element_AttributeGroup bezeichnung_Element_AttributeGroup = (Bezeichnung_Element_AttributeGroup)theEObject;
				T result = caseBezeichnung_Element_AttributeGroup(bezeichnung_Element_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisTypenPackage.BEZEICHNUNG_LAGEPLAN_KURZ_TYPE_CLASS: {
				Bezeichnung_Lageplan_Kurz_TypeClass bezeichnung_Lageplan_Kurz_TypeClass = (Bezeichnung_Lageplan_Kurz_TypeClass)theEObject;
				T result = caseBezeichnung_Lageplan_Kurz_TypeClass(bezeichnung_Lageplan_Kurz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Lageplan_Kurz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisTypenPackage.BEZEICHNUNG_LAGEPLAN_LANG_TYPE_CLASS: {
				Bezeichnung_Lageplan_Lang_TypeClass bezeichnung_Lageplan_Lang_TypeClass = (Bezeichnung_Lageplan_Lang_TypeClass)theEObject;
				T result = caseBezeichnung_Lageplan_Lang_TypeClass(bezeichnung_Lageplan_Lang_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Lageplan_Lang_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisTypenPackage.BEZEICHNUNG_TABELLE_TYPE_CLASS: {
				Bezeichnung_Tabelle_TypeClass bezeichnung_Tabelle_TypeClass = (Bezeichnung_Tabelle_TypeClass)theEObject;
				T result = caseBezeichnung_Tabelle_TypeClass(bezeichnung_Tabelle_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Tabelle_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisTypenPackage.DATUM_AUSLIEFERUNG_TYPE_CLASS: {
				Datum_Auslieferung_TypeClass datum_Auslieferung_TypeClass = (Datum_Auslieferung_TypeClass)theEObject;
				T result = caseDatum_Auslieferung_TypeClass(datum_Auslieferung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(datum_Auslieferung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisTypenPackage.EIGENSCHAFTEN_DATEI_ATTRIBUTE_GROUP: {
				Eigenschaften_Datei_AttributeGroup eigenschaften_Datei_AttributeGroup = (Eigenschaften_Datei_AttributeGroup)theEObject;
				T result = caseEigenschaften_Datei_AttributeGroup(eigenschaften_Datei_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisTypenPackage.KENNZAHL_TYPE_CLASS: {
				Kennzahl_TypeClass kennzahl_TypeClass = (Kennzahl_TypeClass)theEObject;
				T result = caseKennzahl_TypeClass(kennzahl_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kennzahl_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisTypenPackage.OERTLICHER_ELEMENTNAME_TYPE_CLASS: {
				Oertlicher_Elementname_TypeClass oertlicher_Elementname_TypeClass = (Oertlicher_Elementname_TypeClass)theEObject;
				T result = caseOertlicher_Elementname_TypeClass(oertlicher_Elementname_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(oertlicher_Elementname_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisTypenPackage.PRUEFSUMME_ART_TYPE_CLASS: {
				Pruefsumme_Art_TypeClass pruefsumme_Art_TypeClass = (Pruefsumme_Art_TypeClass)theEObject;
				T result = casePruefsumme_Art_TypeClass(pruefsumme_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(pruefsumme_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisTypenPackage.PRUEFSUMME_TYPE_CLASS: {
				Pruefsumme_TypeClass pruefsumme_TypeClass = (Pruefsumme_TypeClass)theEObject;
				T result = casePruefsumme_TypeClass(pruefsumme_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(pruefsumme_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisTypenPackage.VERSION_AUSLIEFERUNG_TYPE_CLASS: {
				Version_Auslieferung_TypeClass version_Auslieferung_TypeClass = (Version_Auslieferung_TypeClass)theEObject;
				T result = caseVersion_Auslieferung_TypeClass(version_Auslieferung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(version_Auslieferung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisTypenPackage.ZEIGER_TYPE_CLASS: {
				Zeiger_TypeClass zeiger_TypeClass = (Zeiger_TypeClass)theEObject;
				T result = caseZeiger_TypeClass(zeiger_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zeiger_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Aussenanlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Aussenanlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Aussenanlage_TypeClass(Bezeichnung_Aussenanlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Element Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Element Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Element_AttributeGroup(Bezeichnung_Element_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Lageplan Kurz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Lageplan Kurz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Lageplan_Kurz_TypeClass(Bezeichnung_Lageplan_Kurz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Lageplan Lang Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Lageplan Lang Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Lageplan_Lang_TypeClass(Bezeichnung_Lageplan_Lang_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Tabelle Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Tabelle Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Tabelle_TypeClass(Bezeichnung_Tabelle_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datum Auslieferung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datum Auslieferung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatum_Auslieferung_TypeClass(Datum_Auslieferung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eigenschaften Datei Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eigenschaften Datei Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEigenschaften_Datei_AttributeGroup(Eigenschaften_Datei_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kennzahl Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kennzahl Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKennzahl_TypeClass(Kennzahl_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oertlicher Elementname Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oertlicher Elementname Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOertlicher_Elementname_TypeClass(Oertlicher_Elementname_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pruefsumme Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pruefsumme Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePruefsumme_Art_TypeClass(Pruefsumme_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pruefsumme Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pruefsumme Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePruefsumme_TypeClass(Pruefsumme_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Auslieferung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Auslieferung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion_Auslieferung_TypeClass(Version_Auslieferung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zeiger Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zeiger Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZeiger_TypeClass(Zeiger_TypeClass object) {
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

} //BasisTypenSwitch
