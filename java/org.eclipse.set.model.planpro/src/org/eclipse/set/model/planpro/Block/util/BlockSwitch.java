/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Block.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Block.*;

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
 * @see org.eclipse.set.model.planpro.Block.BlockPackage
 * @generated
 */
public class BlockSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BlockPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockSwitch() {
		if (modelPackage == null) {
			modelPackage = BlockPackage.eINSTANCE;
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
			case BlockPackage.AUTO_ERLAUBNISHOLEN_TYPE_CLASS: {
				Auto_Erlaubnisholen_TypeClass auto_Erlaubnisholen_TypeClass = (Auto_Erlaubnisholen_TypeClass)theEObject;
				T result = caseAuto_Erlaubnisholen_TypeClass(auto_Erlaubnisholen_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(auto_Erlaubnisholen_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.AUTO_ERLAUBNISRUECKLAUF_TYPE_CLASS: {
				Auto_Erlaubnisruecklauf_TypeClass auto_Erlaubnisruecklauf_TypeClass = (Auto_Erlaubnisruecklauf_TypeClass)theEObject;
				T result = caseAuto_Erlaubnisruecklauf_TypeClass(auto_Erlaubnisruecklauf_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(auto_Erlaubnisruecklauf_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.BETRIEBSFUEHRUNG_TYPE_CLASS: {
				Betriebsfuehrung_TypeClass betriebsfuehrung_TypeClass = (Betriebsfuehrung_TypeClass)theEObject;
				T result = caseBetriebsfuehrung_TypeClass(betriebsfuehrung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(betriebsfuehrung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.BLOCK_ANLAGE: {
				Block_Anlage block_Anlage = (Block_Anlage)theEObject;
				T result = caseBlock_Anlage(block_Anlage);
				if (result == null) result = caseBasis_Objekt(block_Anlage);
				if (result == null) result = caseUr_Objekt(block_Anlage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP: {
				Block_Anlage_Allg_AttributeGroup block_Anlage_Allg_AttributeGroup = (Block_Anlage_Allg_AttributeGroup)theEObject;
				T result = caseBlock_Anlage_Allg_AttributeGroup(block_Anlage_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.BLOCK_BAUFORM_TYPE_CLASS: {
				Block_Bauform_TypeClass block_Bauform_TypeClass = (Block_Bauform_TypeClass)theEObject;
				T result = caseBlock_Bauform_TypeClass(block_Bauform_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(block_Bauform_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.BLOCK_ELEMENT: {
				Block_Element block_Element = (Block_Element)theEObject;
				T result = caseBlock_Element(block_Element);
				if (result == null) result = caseBasis_Objekt(block_Element);
				if (result == null) result = caseUr_Objekt(block_Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP: {
				Block_Element_Allg_AttributeGroup block_Element_Allg_AttributeGroup = (Block_Element_Allg_AttributeGroup)theEObject;
				T result = caseBlock_Element_Allg_AttributeGroup(block_Element_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP: {
				Block_Element_Erlaubnis_AttributeGroup block_Element_Erlaubnis_AttributeGroup = (Block_Element_Erlaubnis_AttributeGroup)theEObject;
				T result = caseBlock_Element_Erlaubnis_AttributeGroup(block_Element_Erlaubnis_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.BLOCK_STRECKE: {
				Block_Strecke block_Strecke = (Block_Strecke)theEObject;
				T result = caseBlock_Strecke(block_Strecke);
				if (result == null) result = caseBasis_Objekt(block_Strecke);
				if (result == null) result = caseUr_Objekt(block_Strecke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP: {
				Block_Strecke_Allg_AttributeGroup block_Strecke_Allg_AttributeGroup = (Block_Strecke_Allg_AttributeGroup)theEObject;
				T result = caseBlock_Strecke_Allg_AttributeGroup(block_Strecke_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.BREMSWEG_TYPE_CLASS: {
				Bremsweg_TypeClass bremsweg_TypeClass = (Bremsweg_TypeClass)theEObject;
				T result = caseBremsweg_TypeClass(bremsweg_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bremsweg_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.ERLAUBNIS_STAENDIG_VORHANDEN_TYPE_CLASS: {
				Erlaubnis_Staendig_Vorhanden_TypeClass erlaubnis_Staendig_Vorhanden_TypeClass = (Erlaubnis_Staendig_Vorhanden_TypeClass)theEObject;
				T result = caseErlaubnis_Staendig_Vorhanden_TypeClass(erlaubnis_Staendig_Vorhanden_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(erlaubnis_Staendig_Vorhanden_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.ERLAUBNISABGABESPEICHERUNG_TYPE_CLASS: {
				Erlaubnisabgabespeicherung_TypeClass erlaubnisabgabespeicherung_TypeClass = (Erlaubnisabgabespeicherung_TypeClass)theEObject;
				T result = caseErlaubnisabgabespeicherung_TypeClass(erlaubnisabgabespeicherung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(erlaubnisabgabespeicherung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.ERLAUBNISHOLEN_TYPE_CLASS: {
				Erlaubnisholen_TypeClass erlaubnisholen_TypeClass = (Erlaubnisholen_TypeClass)theEObject;
				T result = caseErlaubnisholen_TypeClass(erlaubnisholen_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(erlaubnisholen_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.RUECKBLOCKWECKER_TYPE_CLASS: {
				Rueckblockwecker_TypeClass rueckblockwecker_TypeClass = (Rueckblockwecker_TypeClass)theEObject;
				T result = caseRueckblockwecker_TypeClass(rueckblockwecker_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rueckblockwecker_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.SCHALTUNG_TYPE_CLASS: {
				Schaltung_TypeClass schaltung_TypeClass = (Schaltung_TypeClass)theEObject;
				T result = caseSchaltung_TypeClass(schaltung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schaltung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.SCHUTZUEBERTRAGER_TYPE_CLASS: {
				Schutzuebertrager_TypeClass schutzuebertrager_TypeClass = (Schutzuebertrager_TypeClass)theEObject;
				T result = caseSchutzuebertrager_TypeClass(schutzuebertrager_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schutzuebertrager_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.STRECKE_ART_TYPE_CLASS: {
				Strecke_Art_TypeClass strecke_Art_TypeClass = (Strecke_Art_TypeClass)theEObject;
				T result = caseStrecke_Art_TypeClass(strecke_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(strecke_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.STRECKENGESCHWINDIGKEIT_TYPE_CLASS: {
				Streckengeschwindigkeit_TypeClass streckengeschwindigkeit_TypeClass = (Streckengeschwindigkeit_TypeClass)theEObject;
				T result = caseStreckengeschwindigkeit_TypeClass(streckengeschwindigkeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(streckengeschwindigkeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.TRAKTION_ART_ELEKTRISCH_TYPE_CLASS: {
				Traktion_Art_Elektrisch_TypeClass traktion_Art_Elektrisch_TypeClass = (Traktion_Art_Elektrisch_TypeClass)theEObject;
				T result = caseTraktion_Art_Elektrisch_TypeClass(traktion_Art_Elektrisch_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(traktion_Art_Elektrisch_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.VORBLOCKWECKER_TYPE_CLASS: {
				Vorblockwecker_TypeClass vorblockwecker_TypeClass = (Vorblockwecker_TypeClass)theEObject;
				T result = caseVorblockwecker_TypeClass(vorblockwecker_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(vorblockwecker_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.ZUGBEEINFLUSSUNG_ART_TYPE_CLASS: {
				Zugbeeinflussung_Art_TypeClass zugbeeinflussung_Art_TypeClass = (Zugbeeinflussung_Art_TypeClass)theEObject;
				T result = caseZugbeeinflussung_Art_TypeClass(zugbeeinflussung_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zugbeeinflussung_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockPackage.ZUSATZINFORMATION_TYPE_CLASS: {
				Zusatzinformation_TypeClass zusatzinformation_TypeClass = (Zusatzinformation_TypeClass)theEObject;
				T result = caseZusatzinformation_TypeClass(zusatzinformation_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zusatzinformation_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Erlaubnisholen Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Erlaubnisholen Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuto_Erlaubnisholen_TypeClass(Auto_Erlaubnisholen_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Erlaubnisruecklauf Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Erlaubnisruecklauf Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuto_Erlaubnisruecklauf_TypeClass(Auto_Erlaubnisruecklauf_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Betriebsfuehrung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Betriebsfuehrung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBetriebsfuehrung_TypeClass(Betriebsfuehrung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Anlage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Anlage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock_Anlage(Block_Anlage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Anlage Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Anlage Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock_Anlage_Allg_AttributeGroup(Block_Anlage_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Bauform Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Bauform Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock_Bauform_TypeClass(Block_Bauform_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock_Element(Block_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Element Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Element Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock_Element_Allg_AttributeGroup(Block_Element_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Element Erlaubnis Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Element Erlaubnis Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock_Element_Erlaubnis_AttributeGroup(Block_Element_Erlaubnis_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Strecke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Strecke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock_Strecke(Block_Strecke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Strecke Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Strecke Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock_Strecke_Allg_AttributeGroup(Block_Strecke_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bremsweg Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bremsweg Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBremsweg_TypeClass(Bremsweg_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erlaubnis Staendig Vorhanden Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erlaubnis Staendig Vorhanden Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErlaubnis_Staendig_Vorhanden_TypeClass(Erlaubnis_Staendig_Vorhanden_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erlaubnisabgabespeicherung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erlaubnisabgabespeicherung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErlaubnisabgabespeicherung_TypeClass(Erlaubnisabgabespeicherung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erlaubnisholen Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erlaubnisholen Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErlaubnisholen_TypeClass(Erlaubnisholen_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rueckblockwecker Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rueckblockwecker Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRueckblockwecker_TypeClass(Rueckblockwecker_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schaltung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schaltung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchaltung_TypeClass(Schaltung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schutzuebertrager Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schutzuebertrager Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchutzuebertrager_TypeClass(Schutzuebertrager_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strecke Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strecke Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrecke_Art_TypeClass(Strecke_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Streckengeschwindigkeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Streckengeschwindigkeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreckengeschwindigkeit_TypeClass(Streckengeschwindigkeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traktion Art Elektrisch Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traktion Art Elektrisch Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraktion_Art_Elektrisch_TypeClass(Traktion_Art_Elektrisch_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vorblockwecker Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vorblockwecker Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVorblockwecker_TypeClass(Vorblockwecker_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zugbeeinflussung Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zugbeeinflussung Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZugbeeinflussung_Art_TypeClass(Zugbeeinflussung_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zusatzinformation Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zusatzinformation Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZusatzinformation_TypeClass(Zusatzinformation_TypeClass object) {
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

} //BlockSwitch
