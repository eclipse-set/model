/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PZB.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.PZB.*;

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
 * @see org.eclipse.set.model.planpro.PZB.PZBPackage
 * @generated
 */
public class PZBSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PZBPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PZBSwitch() {
		if (modelPackage == null) {
			modelPackage = PZBPackage.eINSTANCE;
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
			case PZBPackage.GUE_ABSTAND_ABWEICHEND_TYPE_CLASS: {
				GUE_Abstand_Abweichend_TypeClass guE_Abstand_Abweichend_TypeClass = (GUE_Abstand_Abweichend_TypeClass)theEObject;
				T result = caseGUE_Abstand_Abweichend_TypeClass(guE_Abstand_Abweichend_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(guE_Abstand_Abweichend_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.GUE_ANORDNUNG_TYPE_CLASS: {
				GUE_Anordnung_TypeClass guE_Anordnung_TypeClass = (GUE_Anordnung_TypeClass)theEObject;
				T result = caseGUE_Anordnung_TypeClass(guE_Anordnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(guE_Anordnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.GUE_BAUART_TYPE_CLASS: {
				GUE_Bauart_TypeClass guE_Bauart_TypeClass = (GUE_Bauart_TypeClass)theEObject;
				T result = caseGUE_Bauart_TypeClass(guE_Bauart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(guE_Bauart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.GUE_ENERGIEVERSORGUNG_TYPE_CLASS: {
				GUE_Energieversorgung_TypeClass guE_Energieversorgung_TypeClass = (GUE_Energieversorgung_TypeClass)theEObject;
				T result = caseGUE_Energieversorgung_TypeClass(guE_Energieversorgung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(guE_Energieversorgung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.GUE_MESSSTRECKE_TYPE_CLASS: {
				GUE_Messstrecke_TypeClass guE_Messstrecke_TypeClass = (GUE_Messstrecke_TypeClass)theEObject;
				T result = caseGUE_Messstrecke_TypeClass(guE_Messstrecke_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(guE_Messstrecke_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP: {
				INA_Gefahrstelle_AttributeGroup inA_Gefahrstelle_AttributeGroup = (INA_Gefahrstelle_AttributeGroup)theEObject;
				T result = caseINA_Gefahrstelle_AttributeGroup(inA_Gefahrstelle_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.MESSFEHLER_TYPE_CLASS: {
				Messfehler_TypeClass messfehler_TypeClass = (Messfehler_TypeClass)theEObject;
				T result = caseMessfehler_TypeClass(messfehler_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(messfehler_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PRIORITAET_GEFAHRSTELLE_TYPE_CLASS: {
				Prioritaet_Gefahrstelle_TypeClass prioritaet_Gefahrstelle_TypeClass = (Prioritaet_Gefahrstelle_TypeClass)theEObject;
				T result = casePrioritaet_Gefahrstelle_TypeClass(prioritaet_Gefahrstelle_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(prioritaet_Gefahrstelle_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PRUEFGESCHWINDIGKEIT_TYPE_CLASS: {
				Pruefgeschwindigkeit_TypeClass pruefgeschwindigkeit_TypeClass = (Pruefgeschwindigkeit_TypeClass)theEObject;
				T result = casePruefgeschwindigkeit_TypeClass(pruefgeschwindigkeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(pruefgeschwindigkeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PRUEFZEIT_TYPE_CLASS: {
				Pruefzeit_TypeClass pruefzeit_TypeClass = (Pruefzeit_TypeClass)theEObject;
				T result = casePruefzeit_TypeClass(pruefzeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(pruefzeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PZB_ABSTAND_GM_TYPE_CLASS: {
				PZB_Abstand_GM_TypeClass pzB_Abstand_GM_TypeClass = (PZB_Abstand_GM_TypeClass)theEObject;
				T result = casePZB_Abstand_GM_TypeClass(pzB_Abstand_GM_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(pzB_Abstand_GM_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PZB_ART_TYPE_CLASS: {
				PZB_Art_TypeClass pzB_Art_TypeClass = (PZB_Art_TypeClass)theEObject;
				T result = casePZB_Art_TypeClass(pzB_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(pzB_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PZB_ELEMENT: {
				PZB_Element pzB_Element = (PZB_Element)theEObject;
				T result = casePZB_Element(pzB_Element);
				if (result == null) result = casePunkt_Objekt(pzB_Element);
				if (result == null) result = caseBasis_Objekt(pzB_Element);
				if (result == null) result = caseUr_Objekt(pzB_Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP: {
				PZB_Element_GM_AttributeGroup pzB_Element_GM_AttributeGroup = (PZB_Element_GM_AttributeGroup)theEObject;
				T result = casePZB_Element_GM_AttributeGroup(pzB_Element_GM_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP: {
				PZB_Element_GUE_AttributeGroup pzB_Element_GUE_AttributeGroup = (PZB_Element_GUE_AttributeGroup)theEObject;
				T result = casePZB_Element_GUE_AttributeGroup(pzB_Element_GUE_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG: {
				PZB_Element_Zuordnung pzB_Element_Zuordnung = (PZB_Element_Zuordnung)theEObject;
				T result = casePZB_Element_Zuordnung(pzB_Element_Zuordnung);
				if (result == null) result = caseBasis_Objekt(pzB_Element_Zuordnung);
				if (result == null) result = caseUr_Objekt(pzB_Element_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP: {
				PZB_Element_Zuordnung_BP_AttributeGroup pzB_Element_Zuordnung_BP_AttributeGroup = (PZB_Element_Zuordnung_BP_AttributeGroup)theEObject;
				T result = casePZB_Element_Zuordnung_BP_AttributeGroup(pzB_Element_Zuordnung_BP_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP: {
				PZB_Element_Zuordnung_Fstr_AttributeGroup pzB_Element_Zuordnung_Fstr_AttributeGroup = (PZB_Element_Zuordnung_Fstr_AttributeGroup)theEObject;
				T result = casePZB_Element_Zuordnung_Fstr_AttributeGroup(pzB_Element_Zuordnung_Fstr_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP: {
				PZB_Element_Zuordnung_INA_AttributeGroup pzB_Element_Zuordnung_INA_AttributeGroup = (PZB_Element_Zuordnung_INA_AttributeGroup)theEObject;
				T result = casePZB_Element_Zuordnung_INA_AttributeGroup(pzB_Element_Zuordnung_INA_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PZB_INA_TYPE_CLASS: {
				PZB_INA_TypeClass pzB_INA_TypeClass = (PZB_INA_TypeClass)theEObject;
				T result = casePZB_INA_TypeClass(pzB_INA_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(pzB_INA_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL: {
				PZB_Zuordnung_Signal pzB_Zuordnung_Signal = (PZB_Zuordnung_Signal)theEObject;
				T result = casePZB_Zuordnung_Signal(pzB_Zuordnung_Signal);
				if (result == null) result = caseBasis_Objekt(pzB_Zuordnung_Signal);
				if (result == null) result = caseUr_Objekt(pzB_Zuordnung_Signal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.WIRKSAMKEIT_FSTR_TYPE_CLASS: {
				Wirksamkeit_Fstr_TypeClass wirksamkeit_Fstr_TypeClass = (Wirksamkeit_Fstr_TypeClass)theEObject;
				T result = caseWirksamkeit_Fstr_TypeClass(wirksamkeit_Fstr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(wirksamkeit_Fstr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PZBPackage.WIRKSAMKEIT_TYPE_CLASS: {
				Wirksamkeit_TypeClass wirksamkeit_TypeClass = (Wirksamkeit_TypeClass)theEObject;
				T result = caseWirksamkeit_TypeClass(wirksamkeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(wirksamkeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUE Abstand Abweichend Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUE Abstand Abweichend Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUE_Abstand_Abweichend_TypeClass(GUE_Abstand_Abweichend_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUE Anordnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUE Anordnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUE_Anordnung_TypeClass(GUE_Anordnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUE Bauart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUE Bauart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUE_Bauart_TypeClass(GUE_Bauart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUE Energieversorgung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUE Energieversorgung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUE_Energieversorgung_TypeClass(GUE_Energieversorgung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUE Messstrecke Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUE Messstrecke Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUE_Messstrecke_TypeClass(GUE_Messstrecke_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INA Gefahrstelle Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INA Gefahrstelle Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINA_Gefahrstelle_AttributeGroup(INA_Gefahrstelle_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Messfehler Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Messfehler Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessfehler_TypeClass(Messfehler_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prioritaet Gefahrstelle Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prioritaet Gefahrstelle Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrioritaet_Gefahrstelle_TypeClass(Prioritaet_Gefahrstelle_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pruefgeschwindigkeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pruefgeschwindigkeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePruefgeschwindigkeit_TypeClass(Pruefgeschwindigkeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pruefzeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pruefzeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePruefzeit_TypeClass(Pruefzeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PZB Abstand GM Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PZB Abstand GM Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePZB_Abstand_GM_TypeClass(PZB_Abstand_GM_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PZB Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PZB Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePZB_Art_TypeClass(PZB_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PZB Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PZB Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePZB_Element(PZB_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PZB Element GM Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PZB Element GM Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePZB_Element_GM_AttributeGroup(PZB_Element_GM_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PZB Element GUE Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PZB Element GUE Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePZB_Element_GUE_AttributeGroup(PZB_Element_GUE_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PZB Element Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PZB Element Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePZB_Element_Zuordnung(PZB_Element_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PZB Element Zuordnung BP Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PZB Element Zuordnung BP Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePZB_Element_Zuordnung_BP_AttributeGroup(PZB_Element_Zuordnung_BP_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PZB Element Zuordnung Fstr Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PZB Element Zuordnung Fstr Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePZB_Element_Zuordnung_Fstr_AttributeGroup(PZB_Element_Zuordnung_Fstr_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PZB Element Zuordnung INA Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PZB Element Zuordnung INA Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePZB_Element_Zuordnung_INA_AttributeGroup(PZB_Element_Zuordnung_INA_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PZB INA Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PZB INA Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePZB_INA_TypeClass(PZB_INA_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PZB Zuordnung Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PZB Zuordnung Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePZB_Zuordnung_Signal(PZB_Zuordnung_Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wirksamkeit Fstr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wirksamkeit Fstr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWirksamkeit_Fstr_TypeClass(Wirksamkeit_Fstr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wirksamkeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wirksamkeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWirksamkeit_TypeClass(Wirksamkeit_TypeClass object) {
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

} //PZBSwitch
