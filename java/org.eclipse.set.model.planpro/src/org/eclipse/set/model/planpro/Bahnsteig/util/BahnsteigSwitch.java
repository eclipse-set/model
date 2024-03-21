/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnsteig.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.planpro.Bahnsteig.*;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

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
 * @see org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage
 * @generated
 */
public class BahnsteigSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BahnsteigPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BahnsteigSwitch() {
		if (modelPackage == null) {
			modelPackage = BahnsteigPackage.eINSTANCE;
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
			case BahnsteigPackage.BAHNSTEIG_ANLAGE: {
				Bahnsteig_Anlage bahnsteig_Anlage = (Bahnsteig_Anlage)theEObject;
				T result = caseBahnsteig_Anlage(bahnsteig_Anlage);
				if (result == null) result = caseBasis_Objekt(bahnsteig_Anlage);
				if (result == null) result = caseUr_Objekt(bahnsteig_Anlage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnsteigPackage.BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Bahnsteig_Anlage_Bezeichnung_AttributeGroup bahnsteig_Anlage_Bezeichnung_AttributeGroup = (Bahnsteig_Anlage_Bezeichnung_AttributeGroup)theEObject;
				T result = caseBahnsteig_Anlage_Bezeichnung_AttributeGroup(bahnsteig_Anlage_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnsteigPackage.BAHNSTEIG_DACH: {
				Bahnsteig_Dach bahnsteig_Dach = (Bahnsteig_Dach)theEObject;
				T result = caseBahnsteig_Dach(bahnsteig_Dach);
				if (result == null) result = caseBereich_Objekt(bahnsteig_Dach);
				if (result == null) result = caseBasis_Objekt(bahnsteig_Dach);
				if (result == null) result = caseUr_Objekt(bahnsteig_Dach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnsteigPackage.BAHNSTEIG_KANTE: {
				Bahnsteig_Kante bahnsteig_Kante = (Bahnsteig_Kante)theEObject;
				T result = caseBahnsteig_Kante(bahnsteig_Kante);
				if (result == null) result = caseBereich_Objekt(bahnsteig_Kante);
				if (result == null) result = caseBasis_Objekt(bahnsteig_Kante);
				if (result == null) result = caseUr_Objekt(bahnsteig_Kante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP: {
				Bahnsteig_Kante_Allg_AttributeGroup bahnsteig_Kante_Allg_AttributeGroup = (Bahnsteig_Kante_Allg_AttributeGroup)theEObject;
				T result = caseBahnsteig_Kante_Allg_AttributeGroup(bahnsteig_Kante_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnsteigPackage.BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Bahnsteig_Kante_Bezeichnung_AttributeGroup bahnsteig_Kante_Bezeichnung_AttributeGroup = (Bahnsteig_Kante_Bezeichnung_AttributeGroup)theEObject;
				T result = caseBahnsteig_Kante_Bezeichnung_AttributeGroup(bahnsteig_Kante_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnsteigPackage.BAHNSTEIG_ZUGANG: {
				Bahnsteig_Zugang bahnsteig_Zugang = (Bahnsteig_Zugang)theEObject;
				T result = caseBahnsteig_Zugang(bahnsteig_Zugang);
				if (result == null) result = casePunkt_Objekt(bahnsteig_Zugang);
				if (result == null) result = caseBasis_Objekt(bahnsteig_Zugang);
				if (result == null) result = caseUr_Objekt(bahnsteig_Zugang);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP: {
				Bahnsteig_Zugang_Allg_AttributeGroup bahnsteig_Zugang_Allg_AttributeGroup = (Bahnsteig_Zugang_Allg_AttributeGroup)theEObject;
				T result = caseBahnsteig_Zugang_Allg_AttributeGroup(bahnsteig_Zugang_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ART_TYPE_CLASS: {
				Bahnsteig_Zugang_Art_TypeClass bahnsteig_Zugang_Art_TypeClass = (Bahnsteig_Zugang_Art_TypeClass)theEObject;
				T result = caseBahnsteig_Zugang_Art_TypeClass(bahnsteig_Zugang_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bahnsteig_Zugang_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnsteigPackage.BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE_CLASS: {
				Bezeichnung_Bahnsteig_Anlage_TypeClass bezeichnung_Bahnsteig_Anlage_TypeClass = (Bezeichnung_Bahnsteig_Anlage_TypeClass)theEObject;
				T result = caseBezeichnung_Bahnsteig_Anlage_TypeClass(bezeichnung_Bahnsteig_Anlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Bahnsteig_Anlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnsteigPackage.BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE_CLASS: {
				Bezeichnung_Bahnsteig_Kante_TypeClass bezeichnung_Bahnsteig_Kante_TypeClass = (Bezeichnung_Bahnsteig_Kante_TypeClass)theEObject;
				T result = caseBezeichnung_Bahnsteig_Kante_TypeClass(bezeichnung_Bahnsteig_Kante_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Bahnsteig_Kante_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnsteigPackage.HAUPTZUGANG_TYPE_CLASS: {
				Hauptzugang_TypeClass hauptzugang_TypeClass = (Hauptzugang_TypeClass)theEObject;
				T result = caseHauptzugang_TypeClass(hauptzugang_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hauptzugang_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnsteigPackage.LAGE_ZUM_GLEIS_TYPE_CLASS: {
				Lage_Zum_Gleis_TypeClass lage_Zum_Gleis_TypeClass = (Lage_Zum_Gleis_TypeClass)theEObject;
				T result = caseLage_Zum_Gleis_TypeClass(lage_Zum_Gleis_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lage_Zum_Gleis_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnsteigPackage.SYSTEMHOEHE_TYPE_CLASS: {
				Systemhoehe_TypeClass systemhoehe_TypeClass = (Systemhoehe_TypeClass)theEObject;
				T result = caseSystemhoehe_TypeClass(systemhoehe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(systemhoehe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bahnsteig Anlage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bahnsteig Anlage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBahnsteig_Anlage(Bahnsteig_Anlage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bahnsteig Anlage Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bahnsteig Anlage Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBahnsteig_Anlage_Bezeichnung_AttributeGroup(Bahnsteig_Anlage_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bahnsteig Dach</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bahnsteig Dach</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBahnsteig_Dach(Bahnsteig_Dach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bahnsteig Kante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bahnsteig Kante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBahnsteig_Kante(Bahnsteig_Kante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bahnsteig Kante Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bahnsteig Kante Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBahnsteig_Kante_Allg_AttributeGroup(Bahnsteig_Kante_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bahnsteig Kante Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bahnsteig Kante Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBahnsteig_Kante_Bezeichnung_AttributeGroup(Bahnsteig_Kante_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bahnsteig Zugang</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bahnsteig Zugang</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBahnsteig_Zugang(Bahnsteig_Zugang object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bahnsteig Zugang Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bahnsteig Zugang Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBahnsteig_Zugang_Allg_AttributeGroup(Bahnsteig_Zugang_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bahnsteig Zugang Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bahnsteig Zugang Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBahnsteig_Zugang_Art_TypeClass(Bahnsteig_Zugang_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Bahnsteig Anlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Bahnsteig Anlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Bahnsteig_Anlage_TypeClass(Bezeichnung_Bahnsteig_Anlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Bahnsteig Kante Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Bahnsteig Kante Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Bahnsteig_Kante_TypeClass(Bezeichnung_Bahnsteig_Kante_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hauptzugang Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hauptzugang Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHauptzugang_TypeClass(Hauptzugang_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lage Zum Gleis Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lage Zum Gleis Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLage_Zum_Gleis_TypeClass(Lage_Zum_Gleis_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systemhoehe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systemhoehe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemhoehe_TypeClass(Systemhoehe_TypeClass object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Bereich Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bereich Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBereich_Objekt(Bereich_Objekt object) {
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

} //BahnsteigSwitch
