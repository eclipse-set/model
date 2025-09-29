/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Layoutinformationen.*;

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
 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage
 * @generated
 */
public class LayoutinformationenSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LayoutinformationenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutinformationenSwitch() {
		if (modelPackage == null) {
			modelPackage = LayoutinformationenPackage.eINSTANCE;
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
			case LayoutinformationenPackage.BEZ_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS: {
				Bez_Lageplan_Blattschnitt_TypeClass bez_Lageplan_Blattschnitt_TypeClass = (Bez_Lageplan_Blattschnitt_TypeClass)theEObject;
				T result = caseBez_Lageplan_Blattschnitt_TypeClass(bez_Lageplan_Blattschnitt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bez_Lageplan_Blattschnitt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.BEZEICHNUNG_LAGEPLAN_TYPE_CLASS: {
				Bezeichnung_Lageplan_TypeClass bezeichnung_Lageplan_TypeClass = (Bezeichnung_Lageplan_TypeClass)theEObject;
				T result = caseBezeichnung_Lageplan_TypeClass(bezeichnung_Lageplan_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Lageplan_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.DARSTELLUNG_POLYGONZUG_TYPE_CLASS: {
				Darstellung_Polygonzug_TypeClass darstellung_Polygonzug_TypeClass = (Darstellung_Polygonzug_TypeClass)theEObject;
				T result = caseDarstellung_Polygonzug_TypeClass(darstellung_Polygonzug_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(darstellung_Polygonzug_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.DARSTELLUNG_RICHTUNGSWINKEL_BEZEICHNUNG_TYPE_CLASS: {
				Darstellung_Richtungswinkel_Bezeichnung_TypeClass darstellung_Richtungswinkel_Bezeichnung_TypeClass = (Darstellung_Richtungswinkel_Bezeichnung_TypeClass)theEObject;
				T result = caseDarstellung_Richtungswinkel_Bezeichnung_TypeClass(darstellung_Richtungswinkel_Bezeichnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(darstellung_Richtungswinkel_Bezeichnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.DARSTELLUNG_RICHTUNGSWINKEL_TYPE_CLASS: {
				Darstellung_Richtungswinkel_TypeClass darstellung_Richtungswinkel_TypeClass = (Darstellung_Richtungswinkel_TypeClass)theEObject;
				T result = caseDarstellung_Richtungswinkel_TypeClass(darstellung_Richtungswinkel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(darstellung_Richtungswinkel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.ELEMENT_POSITION: {
				Element_Position element_Position = (Element_Position)theEObject;
				T result = caseElement_Position(element_Position);
				if (result == null) result = caseUr_Objekt(element_Position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP: {
				Element_Position_Allg_AttributeGroup element_Position_Allg_AttributeGroup = (Element_Position_Allg_AttributeGroup)theEObject;
				T result = caseElement_Position_Allg_AttributeGroup(element_Position_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.ELEMENT_STIL: {
				Element_Stil element_Stil = (Element_Stil)theEObject;
				T result = caseElement_Stil(element_Stil);
				if (result == null) result = caseUr_Objekt(element_Stil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP: {
				Element_Stil_Allg_AttributeGroup element_Stil_Allg_AttributeGroup = (Element_Stil_Allg_AttributeGroup)theEObject;
				T result = caseElement_Stil_Allg_AttributeGroup(element_Stil_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.FUELLUNG_TYPE_CLASS: {
				Fuellung_TypeClass fuellung_TypeClass = (Fuellung_TypeClass)theEObject;
				T result = caseFuellung_TypeClass(fuellung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fuellung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.LAGEPLAN: {
				Lageplan lageplan = (Lageplan)theEObject;
				T result = caseLageplan(lageplan);
				if (result == null) result = caseUr_Objekt(lageplan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.LAGEPLAN_ART_TYPE_CLASS: {
				Lageplan_Art_TypeClass lageplan_Art_TypeClass = (Lageplan_Art_TypeClass)theEObject;
				T result = caseLageplan_Art_TypeClass(lageplan_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lageplan_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Lageplan_Bezeichnung_AttributeGroup lageplan_Bezeichnung_AttributeGroup = (Lageplan_Bezeichnung_AttributeGroup)theEObject;
				T result = caseLageplan_Bezeichnung_AttributeGroup(lageplan_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT: {
				Lageplan_Blattschnitt lageplan_Blattschnitt = (Lageplan_Blattschnitt)theEObject;
				T result = caseLageplan_Blattschnitt(lageplan_Blattschnitt);
				if (result == null) result = caseUr_Objekt(lageplan_Blattschnitt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Lageplan_Blattschnitt_Bezeichnung_AttributeGroup lageplan_Blattschnitt_Bezeichnung_AttributeGroup = (Lageplan_Blattschnitt_Bezeichnung_AttributeGroup)theEObject;
				T result = caseLageplan_Blattschnitt_Bezeichnung_AttributeGroup(lageplan_Blattschnitt_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND: {
				Lageplan_Zustand lageplan_Zustand = (Lageplan_Zustand)theEObject;
				T result = caseLageplan_Zustand(lageplan_Zustand);
				if (result == null) result = caseUr_Objekt(lageplan_Zustand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.LINIE_ART_TYPE_CLASS: {
				Linie_Art_TypeClass linie_Art_TypeClass = (Linie_Art_TypeClass)theEObject;
				T result = caseLinie_Art_TypeClass(linie_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(linie_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.LINIE_FARBWERT_TYPE_CLASS: {
				Linie_Farbwert_TypeClass linie_Farbwert_TypeClass = (Linie_Farbwert_TypeClass)theEObject;
				T result = caseLinie_Farbwert_TypeClass(linie_Farbwert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(linie_Farbwert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.LINIE_SUBART_TYPE_CLASS: {
				Linie_Subart_TypeClass linie_Subart_TypeClass = (Linie_Subart_TypeClass)theEObject;
				T result = caseLinie_Subart_TypeClass(linie_Subart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(linie_Subart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO: {
				PlanPro_Layoutinfo planPro_Layoutinfo = (PlanPro_Layoutinfo)theEObject;
				T result = casePlanPro_Layoutinfo(planPro_Layoutinfo);
				if (result == null) result = caseUr_Objekt(planPro_Layoutinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.POLYGONZUG_AUSRICHTUNG_TYPE_CLASS: {
				Polygonzug_Ausrichtung_TypeClass polygonzug_Ausrichtung_TypeClass = (Polygonzug_Ausrichtung_TypeClass)theEObject;
				T result = casePolygonzug_Ausrichtung_TypeClass(polygonzug_Ausrichtung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(polygonzug_Ausrichtung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.POLYGONZUG_BLATTSCHNITT_TYPE_CLASS: {
				Polygonzug_Blattschnitt_TypeClass polygonzug_Blattschnitt_TypeClass = (Polygonzug_Blattschnitt_TypeClass)theEObject;
				T result = casePolygonzug_Blattschnitt_TypeClass(polygonzug_Blattschnitt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(polygonzug_Blattschnitt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.REFERENZ_LST_ZUSTAND_TYPE_CLASS: {
				Referenz_LST_Zustand_TypeClass referenz_LST_Zustand_TypeClass = (Referenz_LST_Zustand_TypeClass)theEObject;
				T result = caseReferenz_LST_Zustand_TypeClass(referenz_LST_Zustand_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(referenz_LST_Zustand_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutinformationenPackage.REFERENZ_OBJEKT_DARSTELLUNG_TYPE_CLASS: {
				Referenz_Objekt_Darstellung_TypeClass referenz_Objekt_Darstellung_TypeClass = (Referenz_Objekt_Darstellung_TypeClass)theEObject;
				T result = caseReferenz_Objekt_Darstellung_TypeClass(referenz_Objekt_Darstellung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(referenz_Objekt_Darstellung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bez Lageplan Blattschnitt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bez Lageplan Blattschnitt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBez_Lageplan_Blattschnitt_TypeClass(Bez_Lageplan_Blattschnitt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Lageplan Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Lageplan Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Lageplan_TypeClass(Bezeichnung_Lageplan_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Darstellung Polygonzug Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Darstellung Polygonzug Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDarstellung_Polygonzug_TypeClass(Darstellung_Polygonzug_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Darstellung Richtungswinkel Bezeichnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Darstellung Richtungswinkel Bezeichnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDarstellung_Richtungswinkel_Bezeichnung_TypeClass(Darstellung_Richtungswinkel_Bezeichnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Darstellung Richtungswinkel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Darstellung Richtungswinkel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDarstellung_Richtungswinkel_TypeClass(Darstellung_Richtungswinkel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement_Position(Element_Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Position Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Position Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement_Position_Allg_AttributeGroup(Element_Position_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Stil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Stil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement_Stil(Element_Stil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Stil Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Stil Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement_Stil_Allg_AttributeGroup(Element_Stil_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuellung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuellung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuellung_TypeClass(Fuellung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lageplan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lageplan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLageplan(Lageplan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lageplan Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lageplan Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLageplan_Art_TypeClass(Lageplan_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lageplan Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lageplan Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLageplan_Bezeichnung_AttributeGroup(Lageplan_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lageplan Blattschnitt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lageplan Blattschnitt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLageplan_Blattschnitt(Lageplan_Blattschnitt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lageplan Blattschnitt Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lageplan Blattschnitt Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLageplan_Blattschnitt_Bezeichnung_AttributeGroup(Lageplan_Blattschnitt_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lageplan Zustand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lageplan Zustand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLageplan_Zustand(Lageplan_Zustand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linie Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linie Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinie_Art_TypeClass(Linie_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linie Farbwert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linie Farbwert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinie_Farbwert_TypeClass(Linie_Farbwert_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linie Subart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linie Subart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinie_Subart_TypeClass(Linie_Subart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Pro Layoutinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Pro Layoutinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanPro_Layoutinfo(PlanPro_Layoutinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygonzug Ausrichtung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygonzug Ausrichtung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonzug_Ausrichtung_TypeClass(Polygonzug_Ausrichtung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygonzug Blattschnitt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygonzug Blattschnitt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonzug_Blattschnitt_TypeClass(Polygonzug_Blattschnitt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenz LST Zustand Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenz LST Zustand Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenz_LST_Zustand_TypeClass(Referenz_LST_Zustand_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenz Objekt Darstellung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenz Objekt Darstellung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenz_Objekt_Darstellung_TypeClass(Referenz_Objekt_Darstellung_TypeClass object) {
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

} //LayoutinformationenSwitch
