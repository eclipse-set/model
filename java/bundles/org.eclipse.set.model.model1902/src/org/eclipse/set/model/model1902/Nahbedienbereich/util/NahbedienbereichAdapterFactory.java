/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Nahbedienbereich.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model1902.Nahbedienbereich.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage
 * @generated
 */
public class NahbedienbereichAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NahbedienbereichPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NahbedienbereichAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NahbedienbereichPackage.eINSTANCE;
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
	protected NahbedienbereichSwitch<Adapter> modelSwitch =
		new NahbedienbereichSwitch<Adapter>() {
			@Override
			public Adapter caseAWU_TypeClass(AWU_TypeClass object) {
				return createAWU_TypeClassAdapter();
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
			public Adapter caseNB(NB object) {
				return createNBAdapter();
			}
			@Override
			public Adapter caseNB_Allg_AttributeGroup(NB_Allg_AttributeGroup object) {
				return createNB_Allg_AttributeGroupAdapter();
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
			public Adapter caseNB_Bezeichnung_TypeClass(NB_Bezeichnung_TypeClass object) {
				return createNB_Bezeichnung_TypeClassAdapter();
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
			public Adapter caseNB_Zone_Bezeichnung_TypeClass(NB_Zone_Bezeichnung_TypeClass object) {
				return createNB_Zone_Bezeichnung_TypeClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.AWU_TypeClass <em>AWU Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.AWU_TypeClass
	 * @generated
	 */
	public Adapter createAWU_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.F_ST_Z_TypeClass <em>FST ZType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.F_ST_Z_TypeClass
	 * @generated
	 */
	public Adapter createF_ST_Z_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.FA_FAE_TypeClass <em>FA FAE Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.FA_FAE_TypeClass
	 * @generated
	 */
	public Adapter createFA_FAE_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.Freie_Stellbarkeit_TypeClass <em>Freie Stellbarkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.Freie_Stellbarkeit_TypeClass
	 * @generated
	 */
	public Adapter createFreie_Stellbarkeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB <em>NB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB
	 * @generated
	 */
	public Adapter createNBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Allg_AttributeGroup <em>NB Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createNB_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Art_TypeClass <em>NB Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Art_TypeClass
	 * @generated
	 */
	public Adapter createNB_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Bedien_Anzeige_Element <em>NB Bedien Anzeige Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Bedien_Anzeige_Element
	 * @generated
	 */
	public Adapter createNB_Bedien_Anzeige_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Bedien_Anzeige_Funktionen_AttributeGroup <em>NB Bedien Anzeige Funktionen Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Bedien_Anzeige_Funktionen_AttributeGroup
	 * @generated
	 */
	public Adapter createNB_Bedien_Anzeige_Funktionen_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Bezeichnung_TypeClass <em>NB Bezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Bezeichnung_TypeClass
	 * @generated
	 */
	public Adapter createNB_Bezeichnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup <em>NB Funktionalitaet NB RAttribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup
	 * @generated
	 */
	public Adapter createNB_Funktionalitaet_NB_R_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Grenze_Art_TypeClass <em>NB Grenze Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Grenze_Art_TypeClass
	 * @generated
	 */
	public Adapter createNB_Grenze_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Rueckgabevoraussetzung_TypeClass <em>NB Rueckgabevoraussetzung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Rueckgabevoraussetzung_TypeClass
	 * @generated
	 */
	public Adapter createNB_Rueckgabevoraussetzung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Verhaeltnis_Besonders_TypeClass <em>NB Verhaeltnis Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Verhaeltnis_Besonders_TypeClass
	 * @generated
	 */
	public Adapter createNB_Verhaeltnis_Besonders_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone <em>NB Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone
	 * @generated
	 */
	public Adapter createNB_ZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Allg_AttributeGroup <em>NB Zone Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createNB_Zone_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Allg_TypeClass <em>NB Zone Allg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Allg_TypeClass
	 * @generated
	 */
	public Adapter createNB_Zone_Allg_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Bezeichnung_TypeClass <em>NB Zone Bezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Bezeichnung_TypeClass
	 * @generated
	 */
	public Adapter createNB_Zone_Bezeichnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Element <em>NB Zone Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Element
	 * @generated
	 */
	public Adapter createNB_Zone_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Element_Allg_AttributeGroup <em>NB Zone Element Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Element_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createNB_Zone_Element_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Grenze <em>NB Zone Grenze</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Grenze
	 * @generated
	 */
	public Adapter createNB_Zone_GrenzeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Reihenfolgezwang_AttributeGroup <em>NB Zone Reihenfolgezwang Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Reihenfolgezwang_AttributeGroup
	 * @generated
	 */
	public Adapter createNB_Zone_Reihenfolgezwang_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.Rang_TypeClass <em>Rang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.Rang_TypeClass
	 * @generated
	 */
	public Adapter createRang_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.SBUE_TypeClass <em>SBUE Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.SBUE_TypeClass
	 * @generated
	 */
	public Adapter createSBUE_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.SLE_SLS_TypeClass <em>SLE SLS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.SLE_SLS_TypeClass
	 * @generated
	 */
	public Adapter createSLE_SLS_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.Taste_ANF_TypeClass <em>Taste ANF Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.Taste_ANF_TypeClass
	 * @generated
	 */
	public Adapter createTaste_ANF_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.Taste_FGT_TypeClass <em>Taste FGT Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.Taste_FGT_TypeClass
	 * @generated
	 */
	public Adapter createTaste_FGT_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.Taste_WGT_TypeClass <em>Taste WGT Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.Taste_WGT_TypeClass
	 * @generated
	 */
	public Adapter createTaste_WGT_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.WHU_TypeClass <em>WHU Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.WHU_TypeClass
	 * @generated
	 */
	public Adapter createWHU_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Nahbedienbereich.WUS_TypeClass <em>WUS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.WUS_TypeClass
	 * @generated
	 */
	public Adapter createWUS_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup <em>Basis Attribut Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup
	 * @generated
	 */
	public Adapter createBasisAttribut_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt <em>Ur Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt
	 * @generated
	 */
	public Adapter createUr_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt <em>Basis Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt
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

} //NahbedienbereichAdapterFactory
