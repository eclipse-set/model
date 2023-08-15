/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Nahbedienung.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.Nahbedienung.*;

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
 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage
 * @generated
 */
public class NahbedienungSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NahbedienungPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NahbedienungSwitch() {
		if (modelPackage == null) {
			modelPackage = NahbedienungPackage.eINSTANCE;
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
			case NahbedienungPackage.AWU_TYPE_CLASS: {
				AWU_TypeClass awU_TypeClass = (AWU_TypeClass)theEObject;
				T result = caseAWU_TypeClass(awU_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(awU_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.BEZEICHNUNG_NB_TYPE_CLASS: {
				Bezeichnung_NB_TypeClass bezeichnung_NB_TypeClass = (Bezeichnung_NB_TypeClass)theEObject;
				T result = caseBezeichnung_NB_TypeClass(bezeichnung_NB_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_NB_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.BEZEICHNUNG_NB_ZONE_TYPE_CLASS: {
				Bezeichnung_NB_Zone_TypeClass bezeichnung_NB_Zone_TypeClass = (Bezeichnung_NB_Zone_TypeClass)theEObject;
				T result = caseBezeichnung_NB_Zone_TypeClass(bezeichnung_NB_Zone_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_NB_Zone_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.FST_ZTYPE_CLASS: {
				F_ST_Z_TypeClass f_ST_Z_TypeClass = (F_ST_Z_TypeClass)theEObject;
				T result = caseF_ST_Z_TypeClass(f_ST_Z_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(f_ST_Z_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.FA_FAE_TYPE_CLASS: {
				FA_FAE_TypeClass fA_FAE_TypeClass = (FA_FAE_TypeClass)theEObject;
				T result = caseFA_FAE_TypeClass(fA_FAE_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fA_FAE_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.FREIE_STELLBARKEIT_TYPE_CLASS: {
				Freie_Stellbarkeit_TypeClass freie_Stellbarkeit_TypeClass = (Freie_Stellbarkeit_TypeClass)theEObject;
				T result = caseFreie_Stellbarkeit_TypeClass(freie_Stellbarkeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(freie_Stellbarkeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.KENNZAHL_TYPE_CLASS: {
				Kennzahl_TypeClass kennzahl_TypeClass = (Kennzahl_TypeClass)theEObject;
				T result = caseKennzahl_TypeClass(kennzahl_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kennzahl_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB: {
				NB nb = (NB)theEObject;
				T result = caseNB(nb);
				if (result == null) result = caseBasis_Objekt(nb);
				if (result == null) result = caseUr_Objekt(nb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_ART_TYPE_CLASS: {
				NB_Art_TypeClass nB_Art_TypeClass = (NB_Art_TypeClass)theEObject;
				T result = caseNB_Art_TypeClass(nB_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(nB_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT: {
				NB_Bedien_Anzeige_Element nB_Bedien_Anzeige_Element = (NB_Bedien_Anzeige_Element)theEObject;
				T result = caseNB_Bedien_Anzeige_Element(nB_Bedien_Anzeige_Element);
				if (result == null) result = caseBasis_Objekt(nB_Bedien_Anzeige_Element);
				if (result == null) result = caseUr_Objekt(nB_Bedien_Anzeige_Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP: {
				NB_Bedien_Anzeige_Funktionen_AttributeGroup nB_Bedien_Anzeige_Funktionen_AttributeGroup = (NB_Bedien_Anzeige_Funktionen_AttributeGroup)theEObject;
				T result = caseNB_Bedien_Anzeige_Funktionen_AttributeGroup(nB_Bedien_Anzeige_Funktionen_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				NB_Bezeichnung_AttributeGroup nB_Bezeichnung_AttributeGroup = (NB_Bezeichnung_AttributeGroup)theEObject;
				T result = caseNB_Bezeichnung_AttributeGroup(nB_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP: {
				NB_Funktionalitaet_NB_R_AttributeGroup nB_Funktionalitaet_NB_R_AttributeGroup = (NB_Funktionalitaet_NB_R_AttributeGroup)theEObject;
				T result = caseNB_Funktionalitaet_NB_R_AttributeGroup(nB_Funktionalitaet_NB_R_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_GRENZE_ART_TYPE_CLASS: {
				NB_Grenze_Art_TypeClass nB_Grenze_Art_TypeClass = (NB_Grenze_Art_TypeClass)theEObject;
				T result = caseNB_Grenze_Art_TypeClass(nB_Grenze_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(nB_Grenze_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_RUECKGABEVORAUSSETZUNG_TYPE_CLASS: {
				NB_Rueckgabevoraussetzung_TypeClass nB_Rueckgabevoraussetzung_TypeClass = (NB_Rueckgabevoraussetzung_TypeClass)theEObject;
				T result = caseNB_Rueckgabevoraussetzung_TypeClass(nB_Rueckgabevoraussetzung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(nB_Rueckgabevoraussetzung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_VERHAELTNIS_BESONDERS_TYPE_CLASS: {
				NB_Verhaeltnis_Besonders_TypeClass nB_Verhaeltnis_Besonders_TypeClass = (NB_Verhaeltnis_Besonders_TypeClass)theEObject;
				T result = caseNB_Verhaeltnis_Besonders_TypeClass(nB_Verhaeltnis_Besonders_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(nB_Verhaeltnis_Besonders_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_ZONE: {
				NB_Zone nB_Zone = (NB_Zone)theEObject;
				T result = caseNB_Zone(nB_Zone);
				if (result == null) result = caseBasis_Objekt(nB_Zone);
				if (result == null) result = caseUr_Objekt(nB_Zone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP: {
				NB_Zone_Allg_AttributeGroup nB_Zone_Allg_AttributeGroup = (NB_Zone_Allg_AttributeGroup)theEObject;
				T result = caseNB_Zone_Allg_AttributeGroup(nB_Zone_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_ZONE_ALLG_TYPE_CLASS: {
				NB_Zone_Allg_TypeClass nB_Zone_Allg_TypeClass = (NB_Zone_Allg_TypeClass)theEObject;
				T result = caseNB_Zone_Allg_TypeClass(nB_Zone_Allg_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(nB_Zone_Allg_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				NB_Zone_Bezeichnung_AttributeGroup nB_Zone_Bezeichnung_AttributeGroup = (NB_Zone_Bezeichnung_AttributeGroup)theEObject;
				T result = caseNB_Zone_Bezeichnung_AttributeGroup(nB_Zone_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_ZONE_ELEMENT: {
				NB_Zone_Element nB_Zone_Element = (NB_Zone_Element)theEObject;
				T result = caseNB_Zone_Element(nB_Zone_Element);
				if (result == null) result = caseBasis_Objekt(nB_Zone_Element);
				if (result == null) result = caseUr_Objekt(nB_Zone_Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP: {
				NB_Zone_Element_Allg_AttributeGroup nB_Zone_Element_Allg_AttributeGroup = (NB_Zone_Element_Allg_AttributeGroup)theEObject;
				T result = caseNB_Zone_Element_Allg_AttributeGroup(nB_Zone_Element_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_ZONE_GRENZE: {
				NB_Zone_Grenze nB_Zone_Grenze = (NB_Zone_Grenze)theEObject;
				T result = caseNB_Zone_Grenze(nB_Zone_Grenze);
				if (result == null) result = caseBasis_Objekt(nB_Zone_Grenze);
				if (result == null) result = caseUr_Objekt(nB_Zone_Grenze);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP: {
				NB_Zone_Reihenfolgezwang_AttributeGroup nB_Zone_Reihenfolgezwang_AttributeGroup = (NB_Zone_Reihenfolgezwang_AttributeGroup)theEObject;
				T result = caseNB_Zone_Reihenfolgezwang_AttributeGroup(nB_Zone_Reihenfolgezwang_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.RANG_TYPE_CLASS: {
				Rang_TypeClass rang_TypeClass = (Rang_TypeClass)theEObject;
				T result = caseRang_TypeClass(rang_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rang_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.SBUE_TYPE_CLASS: {
				SBUE_TypeClass sbuE_TypeClass = (SBUE_TypeClass)theEObject;
				T result = caseSBUE_TypeClass(sbuE_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(sbuE_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.SLE_SLS_TYPE_CLASS: {
				SLE_SLS_TypeClass slE_SLS_TypeClass = (SLE_SLS_TypeClass)theEObject;
				T result = caseSLE_SLS_TypeClass(slE_SLS_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(slE_SLS_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.TASTE_ANF_TYPE_CLASS: {
				Taste_ANF_TypeClass taste_ANF_TypeClass = (Taste_ANF_TypeClass)theEObject;
				T result = caseTaste_ANF_TypeClass(taste_ANF_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(taste_ANF_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.TASTE_FGT_TYPE_CLASS: {
				Taste_FGT_TypeClass taste_FGT_TypeClass = (Taste_FGT_TypeClass)theEObject;
				T result = caseTaste_FGT_TypeClass(taste_FGT_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(taste_FGT_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.TASTE_WGT_TYPE_CLASS: {
				Taste_WGT_TypeClass taste_WGT_TypeClass = (Taste_WGT_TypeClass)theEObject;
				T result = caseTaste_WGT_TypeClass(taste_WGT_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(taste_WGT_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.WGSP_LAGE_TYPE_CLASS: {
				W_Gsp_Lage_TypeClass w_Gsp_Lage_TypeClass = (W_Gsp_Lage_TypeClass)theEObject;
				T result = caseW_Gsp_Lage_TypeClass(w_Gsp_Lage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(w_Gsp_Lage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.WHU_TYPE_CLASS: {
				WHU_TypeClass whU_TypeClass = (WHU_TypeClass)theEObject;
				T result = caseWHU_TypeClass(whU_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(whU_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NahbedienungPackage.WUS_TYPE_CLASS: {
				WUS_TypeClass wuS_TypeClass = (WUS_TypeClass)theEObject;
				T result = caseWUS_TypeClass(wuS_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(wuS_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AWU Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AWU Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAWU_TypeClass(AWU_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung NB Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung NB Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_NB_TypeClass(Bezeichnung_NB_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung NB Zone Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung NB Zone Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_NB_Zone_TypeClass(Bezeichnung_NB_Zone_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FST ZType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FST ZType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseF_ST_Z_TypeClass(F_ST_Z_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FA FAE Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FA FAE Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFA_FAE_TypeClass(FA_FAE_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Freie Stellbarkeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Freie Stellbarkeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreie_Stellbarkeit_TypeClass(Freie_Stellbarkeit_TypeClass object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>NB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB(NB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Art_TypeClass(NB_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Bedien Anzeige Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Bedien Anzeige Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Bedien_Anzeige_Element(NB_Bedien_Anzeige_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Bedien Anzeige Funktionen Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Bedien Anzeige Funktionen Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Bedien_Anzeige_Funktionen_AttributeGroup(NB_Bedien_Anzeige_Funktionen_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Bezeichnung_AttributeGroup(NB_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Funktionalitaet NB RAttribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Funktionalitaet NB RAttribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Funktionalitaet_NB_R_AttributeGroup(NB_Funktionalitaet_NB_R_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Grenze Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Grenze Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Grenze_Art_TypeClass(NB_Grenze_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Rueckgabevoraussetzung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Rueckgabevoraussetzung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Rueckgabevoraussetzung_TypeClass(NB_Rueckgabevoraussetzung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Verhaeltnis Besonders Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Verhaeltnis Besonders Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Verhaeltnis_Besonders_TypeClass(NB_Verhaeltnis_Besonders_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Zone(NB_Zone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Zone Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Zone Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Zone_Allg_AttributeGroup(NB_Zone_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Zone Allg Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Zone Allg Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Zone_Allg_TypeClass(NB_Zone_Allg_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Zone Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Zone Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Zone_Bezeichnung_AttributeGroup(NB_Zone_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Zone Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Zone Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Zone_Element(NB_Zone_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Zone Element Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Zone Element Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Zone_Element_Allg_AttributeGroup(NB_Zone_Element_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Zone Grenze</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Zone Grenze</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Zone_Grenze(NB_Zone_Grenze object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Zone Reihenfolgezwang Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Zone Reihenfolgezwang Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNB_Zone_Reihenfolgezwang_AttributeGroup(NB_Zone_Reihenfolgezwang_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rang Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rang Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRang_TypeClass(Rang_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SBUE Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SBUE Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSBUE_TypeClass(SBUE_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLE SLS Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLE SLS Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLE_SLS_TypeClass(SLE_SLS_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Taste ANF Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Taste ANF Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaste_ANF_TypeClass(Taste_ANF_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Taste FGT Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Taste FGT Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaste_FGT_TypeClass(Taste_FGT_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Taste WGT Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Taste WGT Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaste_WGT_TypeClass(Taste_WGT_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WGsp Lage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WGsp Lage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW_Gsp_Lage_TypeClass(W_Gsp_Lage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WHU Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WHU Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWHU_TypeClass(WHU_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WUS Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WUS Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWUS_TypeClass(WUS_TypeClass object) {
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

} //NahbedienungSwitch
