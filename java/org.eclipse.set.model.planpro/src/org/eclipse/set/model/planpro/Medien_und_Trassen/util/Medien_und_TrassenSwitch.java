/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Medien_und_Trassen.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Medien_und_Trassen.*;

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
 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage
 * @generated
 */
public class Medien_und_TrassenSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Medien_und_TrassenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medien_und_TrassenSwitch() {
		if (modelPackage == null) {
			modelPackage = Medien_und_TrassenPackage.eINSTANCE;
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
			case Medien_und_TrassenPackage.ADER_DURCHMESSER_TYPE_CLASS: {
				Ader_Durchmesser_TypeClass ader_Durchmesser_TypeClass = (Ader_Durchmesser_TypeClass)theEObject;
				T result = caseAder_Durchmesser_TypeClass(ader_Durchmesser_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ader_Durchmesser_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.ADER_QUERSCHNITT_TYPE_CLASS: {
				Ader_Querschnitt_TypeClass ader_Querschnitt_TypeClass = (Ader_Querschnitt_TypeClass)theEObject;
				T result = caseAder_Querschnitt_TypeClass(ader_Querschnitt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ader_Querschnitt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.ADER_RESERVE_TYPE_CLASS: {
				Ader_Reserve_TypeClass ader_Reserve_TypeClass = (Ader_Reserve_TypeClass)theEObject;
				T result = caseAder_Reserve_TypeClass(ader_Reserve_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ader_Reserve_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.ANZAHL_VERSEILELEMENTE_TYPE_CLASS: {
				Anzahl_Verseilelemente_TypeClass anzahl_Verseilelemente_TypeClass = (Anzahl_Verseilelemente_TypeClass)theEObject;
				T result = caseAnzahl_Verseilelemente_TypeClass(anzahl_Verseilelemente_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(anzahl_Verseilelemente_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.BEZEICHNUNG_KABEL_TYPE_CLASS: {
				Bezeichnung_Kabel_TypeClass bezeichnung_Kabel_TypeClass = (Bezeichnung_Kabel_TypeClass)theEObject;
				T result = caseBezeichnung_Kabel_TypeClass(bezeichnung_Kabel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Kabel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE_CLASS: {
				Bezeichnung_Kabel_Verteilpunkt_TypeClass bezeichnung_Kabel_Verteilpunkt_TypeClass = (Bezeichnung_Kabel_Verteilpunkt_TypeClass)theEObject;
				T result = caseBezeichnung_Kabel_Verteilpunkt_TypeClass(bezeichnung_Kabel_Verteilpunkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Kabel_Verteilpunkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.INDUKTIONSSCHUTZ_TYPE_CLASS: {
				Induktionsschutz_TypeClass induktionsschutz_TypeClass = (Induktionsschutz_TypeClass)theEObject;
				T result = caseInduktionsschutz_TypeClass(induktionsschutz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(induktionsschutz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.KABEL: {
				Kabel kabel = (Kabel)theEObject;
				T result = caseKabel(kabel);
				if (result == null) result = caseBasis_Objekt(kabel);
				if (result == null) result = caseUr_Objekt(kabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP: {
				Kabel_Allg_AttributeGroup kabel_Allg_AttributeGroup = (Kabel_Allg_AttributeGroup)theEObject;
				T result = caseKabel_Allg_AttributeGroup(kabel_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.KABEL_ART_TYPE_CLASS: {
				Kabel_Art_TypeClass kabel_Art_TypeClass = (Kabel_Art_TypeClass)theEObject;
				T result = caseKabel_Art_TypeClass(kabel_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kabel_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Kabel_Bezeichnung_AttributeGroup kabel_Bezeichnung_AttributeGroup = (Kabel_Bezeichnung_AttributeGroup)theEObject;
				T result = caseKabel_Bezeichnung_AttributeGroup(kabel_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP: {
				Kabel_Element_AttributeGroup kabel_Element_AttributeGroup = (Kabel_Element_AttributeGroup)theEObject;
				T result = caseKabel_Element_AttributeGroup(kabel_Element_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.KABEL_LAENGE_TYPE_CLASS: {
				Kabel_Laenge_TypeClass kabel_Laenge_TypeClass = (Kabel_Laenge_TypeClass)theEObject;
				T result = caseKabel_Laenge_TypeClass(kabel_Laenge_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kabel_Laenge_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.KABEL_TYP_TYPE_CLASS: {
				Kabel_Typ_TypeClass kabel_Typ_TypeClass = (Kabel_Typ_TypeClass)theEObject;
				T result = caseKabel_Typ_TypeClass(kabel_Typ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kabel_Typ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT: {
				Kabel_Verteilpunkt kabel_Verteilpunkt = (Kabel_Verteilpunkt)theEObject;
				T result = caseKabel_Verteilpunkt(kabel_Verteilpunkt);
				if (result == null) result = caseBasis_Objekt(kabel_Verteilpunkt);
				if (result == null) result = caseUr_Objekt(kabel_Verteilpunkt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_ART_TYPE_CLASS: {
				Kabel_Verteilpunkt_Art_TypeClass kabel_Verteilpunkt_Art_TypeClass = (Kabel_Verteilpunkt_Art_TypeClass)theEObject;
				T result = caseKabel_Verteilpunkt_Art_TypeClass(kabel_Verteilpunkt_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kabel_Verteilpunkt_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Kabel_Verteilpunkt_Bezeichnung_AttributeGroup kabel_Verteilpunkt_Bezeichnung_AttributeGroup = (Kabel_Verteilpunkt_Bezeichnung_AttributeGroup)theEObject;
				T result = caseKabel_Verteilpunkt_Bezeichnung_AttributeGroup(kabel_Verteilpunkt_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.NAGETIERSCHUTZ_TYPE_CLASS: {
				Nagetierschutz_TypeClass nagetierschutz_TypeClass = (Nagetierschutz_TypeClass)theEObject;
				T result = caseNagetierschutz_TypeClass(nagetierschutz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(nagetierschutz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.TRASSE_KANTE: {
				Trasse_Kante trasse_Kante = (Trasse_Kante)theEObject;
				T result = caseTrasse_Kante(trasse_Kante);
				if (result == null) result = caseBasis_Objekt(trasse_Kante);
				if (result == null) result = caseUr_Objekt(trasse_Kante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.TRASSE_KANTE_ART_TYPE_CLASS: {
				Trasse_Kante_Art_TypeClass trasse_Kante_Art_TypeClass = (Trasse_Kante_Art_TypeClass)theEObject;
				T result = caseTrasse_Kante_Art_TypeClass(trasse_Kante_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(trasse_Kante_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.TRASSE_KNOTEN: {
				Trasse_Knoten trasse_Knoten = (Trasse_Knoten)theEObject;
				T result = caseTrasse_Knoten(trasse_Knoten);
				if (result == null) result = caseBasis_Objekt(trasse_Knoten);
				if (result == null) result = caseUr_Objekt(trasse_Knoten);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.TRASSE_KNOTEN_ART_TYPE_CLASS: {
				Trasse_Knoten_Art_TypeClass trasse_Knoten_Art_TypeClass = (Trasse_Knoten_Art_TypeClass)theEObject;
				T result = caseTrasse_Knoten_Art_TypeClass(trasse_Knoten_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(trasse_Knoten_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.TRASSE_NUTZER_TYPE_CLASS: {
				Trasse_Nutzer_TypeClass trasse_Nutzer_TypeClass = (Trasse_Nutzer_TypeClass)theEObject;
				T result = caseTrasse_Nutzer_TypeClass(trasse_Nutzer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(trasse_Nutzer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Medien_und_TrassenPackage.VERSEILART_TYPE_CLASS: {
				Verseilart_TypeClass verseilart_TypeClass = (Verseilart_TypeClass)theEObject;
				T result = caseVerseilart_TypeClass(verseilart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(verseilart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ader Durchmesser Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ader Durchmesser Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAder_Durchmesser_TypeClass(Ader_Durchmesser_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ader Querschnitt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ader Querschnitt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAder_Querschnitt_TypeClass(Ader_Querschnitt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ader Reserve Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ader Reserve Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAder_Reserve_TypeClass(Ader_Reserve_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anzahl Verseilelemente Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anzahl Verseilelemente Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnzahl_Verseilelemente_TypeClass(Anzahl_Verseilelemente_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Kabel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Kabel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Kabel_TypeClass(Bezeichnung_Kabel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Kabel Verteilpunkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Kabel Verteilpunkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Kabel_Verteilpunkt_TypeClass(Bezeichnung_Kabel_Verteilpunkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Induktionsschutz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Induktionsschutz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInduktionsschutz_TypeClass(Induktionsschutz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kabel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kabel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKabel(Kabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kabel Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kabel Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKabel_Allg_AttributeGroup(Kabel_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kabel Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kabel Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKabel_Art_TypeClass(Kabel_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kabel Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kabel Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKabel_Bezeichnung_AttributeGroup(Kabel_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kabel Element Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kabel Element Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKabel_Element_AttributeGroup(Kabel_Element_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kabel Laenge Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kabel Laenge Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKabel_Laenge_TypeClass(Kabel_Laenge_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kabel Typ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kabel Typ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKabel_Typ_TypeClass(Kabel_Typ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kabel Verteilpunkt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kabel Verteilpunkt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKabel_Verteilpunkt(Kabel_Verteilpunkt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kabel Verteilpunkt Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kabel Verteilpunkt Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKabel_Verteilpunkt_Art_TypeClass(Kabel_Verteilpunkt_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kabel Verteilpunkt Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kabel Verteilpunkt Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKabel_Verteilpunkt_Bezeichnung_AttributeGroup(Kabel_Verteilpunkt_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nagetierschutz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nagetierschutz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNagetierschutz_TypeClass(Nagetierschutz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trasse Kante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trasse Kante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrasse_Kante(Trasse_Kante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trasse Kante Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trasse Kante Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrasse_Kante_Art_TypeClass(Trasse_Kante_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trasse Knoten</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trasse Knoten</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrasse_Knoten(Trasse_Knoten object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trasse Knoten Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trasse Knoten Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrasse_Knoten_Art_TypeClass(Trasse_Knoten_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trasse Nutzer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trasse Nutzer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrasse_Nutzer_TypeClass(Trasse_Nutzer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verseilart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verseilart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerseilart_TypeClass(Verseilart_TypeClass object) {
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

} //Medien_und_TrassenSwitch
