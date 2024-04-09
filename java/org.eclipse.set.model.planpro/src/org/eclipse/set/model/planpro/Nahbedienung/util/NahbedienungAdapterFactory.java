/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Nahbedienung.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Nahbedienung.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage
 * @generated
 */
public class NahbedienungAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NahbedienungPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NahbedienungAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NahbedienungPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NahbedienungSwitch<Adapter> modelSwitch =
		new NahbedienungSwitch<Adapter>() {
			@Override
			public Adapter caseAWU_TypeClass(AWU_TypeClass object) {
				return createAWU_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_NB_TypeClass(Bezeichnung_NB_TypeClass object) {
				return createBezeichnung_NB_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_NB_Zone_TypeClass(Bezeichnung_NB_Zone_TypeClass object) {
				return createBezeichnung_NB_Zone_TypeClassAdapter();
			}
			@Override
			public Adapter caseF_ST_Z_TypeClass(F_ST_Z_TypeClass object) {
				return createF_ST_Z_TypeClassAdapter();
			}
			@Override
			public Adapter caseFA_FAE_TypeClass(FA_FAE_TypeClass object) {
				return createFA_FAE_TypeClassAdapter();
			}
			@Override
			public Adapter caseFreie_Stellbarkeit_TypeClass(Freie_Stellbarkeit_TypeClass object) {
				return createFreie_Stellbarkeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseKennzahl_TypeClass(Kennzahl_TypeClass object) {
				return createKennzahl_TypeClassAdapter();
			}
			@Override
			public Adapter caseNB(NB object) {
				return createNBAdapter();
			}
			@Override
			public Adapter caseNB_Art_TypeClass(NB_Art_TypeClass object) {
				return createNB_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseNB_Bedien_Anzeige_Element(NB_Bedien_Anzeige_Element object) {
				return createNB_Bedien_Anzeige_ElementAdapter();
			}
			@Override
			public Adapter caseNB_Bedien_Anzeige_Funktionen_AttributeGroup(NB_Bedien_Anzeige_Funktionen_AttributeGroup object) {
				return createNB_Bedien_Anzeige_Funktionen_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseNB_Bezeichnung_AttributeGroup(NB_Bezeichnung_AttributeGroup object) {
				return createNB_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseNB_Funktionalitaet_NB_R_AttributeGroup(NB_Funktionalitaet_NB_R_AttributeGroup object) {
				return createNB_Funktionalitaet_NB_R_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseNB_Grenze_Art_TypeClass(NB_Grenze_Art_TypeClass object) {
				return createNB_Grenze_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseNB_Rueckgabevoraussetzung_TypeClass(NB_Rueckgabevoraussetzung_TypeClass object) {
				return createNB_Rueckgabevoraussetzung_TypeClassAdapter();
			}
			@Override
			public Adapter caseNB_Verhaeltnis_Besonders_TypeClass(NB_Verhaeltnis_Besonders_TypeClass object) {
				return createNB_Verhaeltnis_Besonders_TypeClassAdapter();
			}
			@Override
			public Adapter caseNB_Zone(NB_Zone object) {
				return createNB_ZoneAdapter();
			}
			@Override
			public Adapter caseNB_Zone_Allg_AttributeGroup(NB_Zone_Allg_AttributeGroup object) {
				return createNB_Zone_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseNB_Zone_Allg_TypeClass(NB_Zone_Allg_TypeClass object) {
				return createNB_Zone_Allg_TypeClassAdapter();
			}
			@Override
			public Adapter caseNB_Zone_Bezeichnung_AttributeGroup(NB_Zone_Bezeichnung_AttributeGroup object) {
				return createNB_Zone_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseNB_Zone_Element(NB_Zone_Element object) {
				return createNB_Zone_ElementAdapter();
			}
			@Override
			public Adapter caseNB_Zone_Element_Allg_AttributeGroup(NB_Zone_Element_Allg_AttributeGroup object) {
				return createNB_Zone_Element_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseNB_Zone_Grenze(NB_Zone_Grenze object) {
				return createNB_Zone_GrenzeAdapter();
			}
			@Override
			public Adapter caseNB_Zone_Reihenfolgezwang_AttributeGroup(NB_Zone_Reihenfolgezwang_AttributeGroup object) {
				return createNB_Zone_Reihenfolgezwang_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseRang_TypeClass(Rang_TypeClass object) {
				return createRang_TypeClassAdapter();
			}
			@Override
			public Adapter caseSBUE_TypeClass(SBUE_TypeClass object) {
				return createSBUE_TypeClassAdapter();
			}
			@Override
			public Adapter caseSLE_SLS_TypeClass(SLE_SLS_TypeClass object) {
				return createSLE_SLS_TypeClassAdapter();
			}
			@Override
			public Adapter caseTaste_ANF_TypeClass(Taste_ANF_TypeClass object) {
				return createTaste_ANF_TypeClassAdapter();
			}
			@Override
			public Adapter caseTaste_FGT_TypeClass(Taste_FGT_TypeClass object) {
				return createTaste_FGT_TypeClassAdapter();
			}
			@Override
			public Adapter caseTaste_WGT_TypeClass(Taste_WGT_TypeClass object) {
				return createTaste_WGT_TypeClassAdapter();
			}
			@Override
			public Adapter caseW_Gsp_Lage_TypeClass(W_Gsp_Lage_TypeClass object) {
				return createW_Gsp_Lage_TypeClassAdapter();
			}
			@Override
			public Adapter caseWHU_TypeClass(WHU_TypeClass object) {
				return createWHU_TypeClassAdapter();
			}
			@Override
			public Adapter caseWUS_TypeClass(WUS_TypeClass object) {
				return createWUS_TypeClassAdapter();
			}
			@Override
			public Adapter caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
				return createBasisAttribut_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseUr_Objekt(Ur_Objekt object) {
				return createUr_ObjektAdapter();
			}
			@Override
			public Adapter caseBasis_Objekt(Basis_Objekt object) {
				return createBasis_ObjektAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.AWU_TypeClass <em>AWU Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.AWU_TypeClass
	 * @generated
	 */
	public Adapter createAWU_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.Bezeichnung_NB_TypeClass <em>Bezeichnung NB Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Bezeichnung_NB_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_NB_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.Bezeichnung_NB_Zone_TypeClass <em>Bezeichnung NB Zone Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Bezeichnung_NB_Zone_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_NB_Zone_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.F_ST_Z_TypeClass <em>FST ZType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.F_ST_Z_TypeClass
	 * @generated
	 */
	public Adapter createF_ST_Z_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.FA_FAE_TypeClass <em>FA FAE Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.FA_FAE_TypeClass
	 * @generated
	 */
	public Adapter createFA_FAE_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.Freie_Stellbarkeit_TypeClass <em>Freie Stellbarkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Freie_Stellbarkeit_TypeClass
	 * @generated
	 */
	public Adapter createFreie_Stellbarkeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.Kennzahl_TypeClass <em>Kennzahl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Kennzahl_TypeClass
	 * @generated
	 */
	public Adapter createKennzahl_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB <em>NB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB
	 * @generated
	 */
	public Adapter createNBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Art_TypeClass <em>NB Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Art_TypeClass
	 * @generated
	 */
	public Adapter createNB_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element <em>NB Bedien Anzeige Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element
	 * @generated
	 */
	public Adapter createNB_Bedien_Anzeige_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup <em>NB Bedien Anzeige Funktionen Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup
	 * @generated
	 */
	public Adapter createNB_Bedien_Anzeige_Funktionen_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bezeichnung_AttributeGroup <em>NB Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createNB_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup <em>NB Funktionalitaet NB RAttribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup
	 * @generated
	 */
	public Adapter createNB_Funktionalitaet_NB_R_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Grenze_Art_TypeClass <em>NB Grenze Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Grenze_Art_TypeClass
	 * @generated
	 */
	public Adapter createNB_Grenze_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass <em>NB Rueckgabevoraussetzung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass
	 * @generated
	 */
	public Adapter createNB_Rueckgabevoraussetzung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Verhaeltnis_Besonders_TypeClass <em>NB Verhaeltnis Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Verhaeltnis_Besonders_TypeClass
	 * @generated
	 */
	public Adapter createNB_Verhaeltnis_Besonders_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone <em>NB Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone
	 * @generated
	 */
	public Adapter createNB_ZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_AttributeGroup <em>NB Zone Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createNB_Zone_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_TypeClass <em>NB Zone Allg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_TypeClass
	 * @generated
	 */
	public Adapter createNB_Zone_Allg_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup <em>NB Zone Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createNB_Zone_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element <em>NB Zone Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element
	 * @generated
	 */
	public Adapter createNB_Zone_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup <em>NB Zone Element Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createNB_Zone_Element_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Grenze <em>NB Zone Grenze</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Grenze
	 * @generated
	 */
	public Adapter createNB_Zone_GrenzeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Reihenfolgezwang_AttributeGroup <em>NB Zone Reihenfolgezwang Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Reihenfolgezwang_AttributeGroup
	 * @generated
	 */
	public Adapter createNB_Zone_Reihenfolgezwang_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.Rang_TypeClass <em>Rang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Rang_TypeClass
	 * @generated
	 */
	public Adapter createRang_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.SBUE_TypeClass <em>SBUE Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.SBUE_TypeClass
	 * @generated
	 */
	public Adapter createSBUE_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.SLE_SLS_TypeClass <em>SLE SLS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.SLE_SLS_TypeClass
	 * @generated
	 */
	public Adapter createSLE_SLS_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.Taste_ANF_TypeClass <em>Taste ANF Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Taste_ANF_TypeClass
	 * @generated
	 */
	public Adapter createTaste_ANF_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.Taste_FGT_TypeClass <em>Taste FGT Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Taste_FGT_TypeClass
	 * @generated
	 */
	public Adapter createTaste_FGT_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.Taste_WGT_TypeClass <em>Taste WGT Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Taste_WGT_TypeClass
	 * @generated
	 */
	public Adapter createTaste_WGT_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.W_Gsp_Lage_TypeClass <em>WGsp Lage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.W_Gsp_Lage_TypeClass
	 * @generated
	 */
	public Adapter createW_Gsp_Lage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.WHU_TypeClass <em>WHU Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.WHU_TypeClass
	 * @generated
	 */
	public Adapter createWHU_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Nahbedienung.WUS_TypeClass <em>WUS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.WUS_TypeClass
	 * @generated
	 */
	public Adapter createWUS_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup <em>Basis Attribut Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup
	 * @generated
	 */
	public Adapter createBasisAttribut_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt <em>Ur Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt
	 * @generated
	 */
	public Adapter createUr_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt <em>Basis Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt
	 * @generated
	 */
	public Adapter createBasis_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NahbedienungAdapterFactory
