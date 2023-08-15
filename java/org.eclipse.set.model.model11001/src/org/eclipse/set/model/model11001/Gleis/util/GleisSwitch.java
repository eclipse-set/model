/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Gleis.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.Gleis.*;

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
 * @see org.eclipse.set.model.model11001.Gleis.GleisPackage
 * @generated
 */
public class GleisSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GleisPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GleisSwitch() {
		if (modelPackage == null) {
			modelPackage = GleisPackage.eINSTANCE;
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
			case GleisPackage.BAUBEREICH_ART_TYPE_CLASS: {
				Baubereich_Art_TypeClass baubereich_Art_TypeClass = (Baubereich_Art_TypeClass)theEObject;
				T result = caseBaubereich_Art_TypeClass(baubereich_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(baubereich_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.BEZ_GLEIS_BEZEICHNUNG_TYPE_CLASS: {
				Bez_Gleis_Bezeichnung_TypeClass bez_Gleis_Bezeichnung_TypeClass = (Bez_Gleis_Bezeichnung_TypeClass)theEObject;
				T result = caseBez_Gleis_Bezeichnung_TypeClass(bez_Gleis_Bezeichnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bez_Gleis_Bezeichnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.FAHRSTROM_TYPE_CLASS: {
				Fahrstrom_TypeClass fahrstrom_TypeClass = (Fahrstrom_TypeClass)theEObject;
				T result = caseFahrstrom_TypeClass(fahrstrom_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fahrstrom_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.GESCHWINDIGKEIT_TYPE_CLASS: {
				Geschwindigkeit_TypeClass geschwindigkeit_TypeClass = (Geschwindigkeit_TypeClass)theEObject;
				T result = caseGeschwindigkeit_TypeClass(geschwindigkeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geschwindigkeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.GLEIS_ABSCHNITT: {
				Gleis_Abschnitt gleis_Abschnitt = (Gleis_Abschnitt)theEObject;
				T result = caseGleis_Abschnitt(gleis_Abschnitt);
				if (result == null) result = caseBereich_Objekt(gleis_Abschnitt);
				if (result == null) result = caseBasis_Objekt(gleis_Abschnitt);
				if (result == null) result = caseUr_Objekt(gleis_Abschnitt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.GLEIS_ART: {
				Gleis_Art gleis_Art = (Gleis_Art)theEObject;
				T result = caseGleis_Art(gleis_Art);
				if (result == null) result = caseBereich_Objekt(gleis_Art);
				if (result == null) result = caseBasis_Objekt(gleis_Art);
				if (result == null) result = caseUr_Objekt(gleis_Art);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.GLEIS_BAUBEREICH: {
				Gleis_Baubereich gleis_Baubereich = (Gleis_Baubereich)theEObject;
				T result = caseGleis_Baubereich(gleis_Baubereich);
				if (result == null) result = caseBereich_Objekt(gleis_Baubereich);
				if (result == null) result = caseBasis_Objekt(gleis_Baubereich);
				if (result == null) result = caseUr_Objekt(gleis_Baubereich);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.GLEIS_BEZEICHNUNG: {
				Gleis_Bezeichnung gleis_Bezeichnung = (Gleis_Bezeichnung)theEObject;
				T result = caseGleis_Bezeichnung(gleis_Bezeichnung);
				if (result == null) result = caseBereich_Objekt(gleis_Bezeichnung);
				if (result == null) result = caseBasis_Objekt(gleis_Bezeichnung);
				if (result == null) result = caseUr_Objekt(gleis_Bezeichnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Gleis_Bezeichnung_Bezeichnung_AttributeGroup gleis_Bezeichnung_Bezeichnung_AttributeGroup = (Gleis_Bezeichnung_Bezeichnung_AttributeGroup)theEObject;
				T result = caseGleis_Bezeichnung_Bezeichnung_AttributeGroup(gleis_Bezeichnung_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.GLEIS_FAHRBAHN: {
				Gleis_Fahrbahn gleis_Fahrbahn = (Gleis_Fahrbahn)theEObject;
				T result = caseGleis_Fahrbahn(gleis_Fahrbahn);
				if (result == null) result = caseBereich_Objekt(gleis_Fahrbahn);
				if (result == null) result = caseBasis_Objekt(gleis_Fahrbahn);
				if (result == null) result = caseUr_Objekt(gleis_Fahrbahn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.GLEIS_LICHTRAUM: {
				Gleis_Lichtraum gleis_Lichtraum = (Gleis_Lichtraum)theEObject;
				T result = caseGleis_Lichtraum(gleis_Lichtraum);
				if (result == null) result = caseBereich_Objekt(gleis_Lichtraum);
				if (result == null) result = caseBasis_Objekt(gleis_Lichtraum);
				if (result == null) result = caseUr_Objekt(gleis_Lichtraum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.GLEIS_SCHALTGRUPPE: {
				Gleis_Schaltgruppe gleis_Schaltgruppe = (Gleis_Schaltgruppe)theEObject;
				T result = caseGleis_Schaltgruppe(gleis_Schaltgruppe);
				if (result == null) result = caseBereich_Objekt(gleis_Schaltgruppe);
				if (result == null) result = caseBasis_Objekt(gleis_Schaltgruppe);
				if (result == null) result = caseUr_Objekt(gleis_Schaltgruppe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.GLEISART_TYPE_CLASS: {
				Gleisart_TypeClass gleisart_TypeClass = (Gleisart_TypeClass)theEObject;
				T result = caseGleisart_TypeClass(gleisart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gleisart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.KONSTRUKTION_TYPE_CLASS: {
				Konstruktion_TypeClass konstruktion_TypeClass = (Konstruktion_TypeClass)theEObject;
				T result = caseKonstruktion_TypeClass(konstruktion_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(konstruktion_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GleisPackage.LICHTRAUMPROFIL_TYPE_CLASS: {
				Lichtraumprofil_TypeClass lichtraumprofil_TypeClass = (Lichtraumprofil_TypeClass)theEObject;
				T result = caseLichtraumprofil_TypeClass(lichtraumprofil_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lichtraumprofil_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baubereich Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baubereich Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaubereich_Art_TypeClass(Baubereich_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bez Gleis Bezeichnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bez Gleis Bezeichnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBez_Gleis_Bezeichnung_TypeClass(Bez_Gleis_Bezeichnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fahrstrom Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fahrstrom Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFahrstrom_TypeClass(Fahrstrom_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geschwindigkeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geschwindigkeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeschwindigkeit_TypeClass(Geschwindigkeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleis Abschnitt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleis Abschnitt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleis_Abschnitt(Gleis_Abschnitt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleis Art</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleis Art</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleis_Art(Gleis_Art object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleis Baubereich</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleis Baubereich</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleis_Baubereich(Gleis_Baubereich object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleis Bezeichnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleis Bezeichnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleis_Bezeichnung(Gleis_Bezeichnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleis Bezeichnung Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleis Bezeichnung Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleis_Bezeichnung_Bezeichnung_AttributeGroup(Gleis_Bezeichnung_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleis Fahrbahn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleis Fahrbahn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleis_Fahrbahn(Gleis_Fahrbahn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleis Lichtraum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleis Lichtraum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleis_Lichtraum(Gleis_Lichtraum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleis Schaltgruppe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleis Schaltgruppe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleis_Schaltgruppe(Gleis_Schaltgruppe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleisart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleisart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleisart_TypeClass(Gleisart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Konstruktion Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Konstruktion Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKonstruktion_TypeClass(Konstruktion_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lichtraumprofil Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lichtraumprofil Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLichtraumprofil_TypeClass(Lichtraumprofil_TypeClass object) {
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

} //GleisSwitch
