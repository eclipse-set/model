/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Ansteuerung_Element.*;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage
 * @generated
 */
public class Ansteuerung_ElementAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ansteuerung_ElementPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ansteuerung_ElementAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Ansteuerung_ElementPackage.eINSTANCE;
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
	protected Ansteuerung_ElementSwitch<Adapter> modelSwitch =
		new Ansteuerung_ElementSwitch<Adapter>() {
			@Override
			public Adapter caseAEA_Allg_AttributeGroup(AEA_Allg_AttributeGroup object) {
				return createAEA_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseAEA_Energieversorgung_AttributeGroup(AEA_Energieversorgung_AttributeGroup object) {
				return createAEA_Energieversorgung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseAEA_GFK_IP_Adressblock_AttributeGroup(AEA_GFK_IP_Adressblock_AttributeGroup object) {
				return createAEA_GFK_IP_Adressblock_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseAussenelementansteuerung(Aussenelementansteuerung object) {
				return createAussenelementansteuerungAdapter();
			}
			@Override
			public Adapter caseAussenelementansteuerung_Art_TypeClass(Aussenelementansteuerung_Art_TypeClass object) {
				return createAussenelementansteuerung_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseAussenelementansteuerung_Bezeichnung_AttributeGroup(Aussenelementansteuerung_Bezeichnung_AttributeGroup object) {
				return createAussenelementansteuerung_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBandbreite_TypeClass(Bandbreite_TypeClass object) {
				return createBandbreite_TypeClassAdapter();
			}
			@Override
			public Adapter caseBauart_TypeClass(Bauart_TypeClass object) {
				return createBauart_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_AEA_TypeClass(Bezeichnung_AEA_TypeClass object) {
				return createBezeichnung_AEA_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_ESTW_ZE_TypeClass(Bezeichnung_ESTW_ZE_TypeClass object) {
				return createBezeichnung_ESTW_ZE_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Stellwerk_TypeClass(Bezeichnung_Stellwerk_TypeClass object) {
				return createBezeichnung_Stellwerk_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_TSO_TypeClass(Bezeichnung_TSO_TypeClass object) {
				return createBezeichnung_TSO_TypeClassAdapter();
			}
			@Override
			public Adapter caseEnergieversorgung_Art_Ersatz_TypeClass(Energieversorgung_Art_Ersatz_TypeClass object) {
				return createEnergieversorgung_Art_Ersatz_TypeClassAdapter();
			}
			@Override
			public Adapter caseEnergieversorgung_Art_TypeClass(Energieversorgung_Art_TypeClass object) {
				return createEnergieversorgung_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseESTW_ZE_Energieversorgung_AttributeGroup(ESTW_ZE_Energieversorgung_AttributeGroup object) {
				return createESTW_ZE_Energieversorgung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseESTW_Zentraleinheit(ESTW_Zentraleinheit object) {
				return createESTW_ZentraleinheitAdapter();
			}
			@Override
			public Adapter caseESTW_Zentraleinheit_Allg_AttributeGroup(ESTW_Zentraleinheit_Allg_AttributeGroup object) {
				return createESTW_Zentraleinheit_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseESTW_Zentraleinheit_Bezeichnung_AttributeGroup(ESTW_Zentraleinheit_Bezeichnung_AttributeGroup object) {
				return createESTW_Zentraleinheit_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseGFK_Kategorie_TypeClass(GFK_Kategorie_TypeClass object) {
				return createGFK_Kategorie_TypeClassAdapter();
			}
			@Override
			public Adapter caseHersteller_TypeClass(Hersteller_TypeClass object) {
				return createHersteller_TypeClassAdapter();
			}
			@Override
			public Adapter caseIP_Adressblock_Blau_TypeClass(IP_Adressblock_Blau_TypeClass object) {
				return createIP_Adressblock_Blau_TypeClassAdapter();
			}
			@Override
			public Adapter caseIP_Adressblock_Blau_V4_TypeClass(IP_Adressblock_Blau_V4_TypeClass object) {
				return createIP_Adressblock_Blau_V4_TypeClassAdapter();
			}
			@Override
			public Adapter caseIP_Adressblock_Blau_V6_TypeClass(IP_Adressblock_Blau_V6_TypeClass object) {
				return createIP_Adressblock_Blau_V6_TypeClassAdapter();
			}
			@Override
			public Adapter caseIP_Adressblock_Grau_TypeClass(IP_Adressblock_Grau_TypeClass object) {
				return createIP_Adressblock_Grau_TypeClassAdapter();
			}
			@Override
			public Adapter caseIP_Adressblock_Grau_V4_TypeClass(IP_Adressblock_Grau_V4_TypeClass object) {
				return createIP_Adressblock_Grau_V4_TypeClassAdapter();
			}
			@Override
			public Adapter caseIP_Adressblock_Grau_V6_TypeClass(IP_Adressblock_Grau_V6_TypeClass object) {
				return createIP_Adressblock_Grau_V6_TypeClassAdapter();
			}
			@Override
			public Adapter caseMedium_Art_TypeClass(Medium_Art_TypeClass object) {
				return createMedium_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseNetz_Art_TypeClass(Netz_Art_TypeClass object) {
				return createNetz_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseRegionalbereich_TypeClass(Regionalbereich_TypeClass object) {
				return createRegionalbereich_TypeClassAdapter();
			}
			@Override
			public Adapter caseStandort_Beschreibung_TypeClass(Standort_Beschreibung_TypeClass object) {
				return createStandort_Beschreibung_TypeClassAdapter();
			}
			@Override
			public Adapter caseStell_Bereich(Stell_Bereich object) {
				return createStell_BereichAdapter();
			}
			@Override
			public Adapter caseStellelement(Stellelement object) {
				return createStellelementAdapter();
			}
			@Override
			public Adapter caseTechnik_Art_TypeClass(Technik_Art_TypeClass object) {
				return createTechnik_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseTechnik_Beschreibung_TypeClass(Technik_Beschreibung_TypeClass object) {
				return createTechnik_Beschreibung_TypeClassAdapter();
			}
			@Override
			public Adapter caseTechnik_Standort(Technik_Standort object) {
				return createTechnik_StandortAdapter();
			}
			@Override
			public Adapter caseTechnik_Standort_Bezeichnung_AttributeGroup(Technik_Standort_Bezeichnung_AttributeGroup object) {
				return createTechnik_Standort_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseTSO_IP_AB_Teilsystem_AttributeGroup(TSO_IP_AB_Teilsystem_AttributeGroup object) {
				return createTSO_IP_AB_Teilsystem_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseTSO_IP_Adressblock_AttributeGroup(TSO_IP_Adressblock_AttributeGroup object) {
				return createTSO_IP_Adressblock_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseTSO_Teilsystem_Art_TypeClass(TSO_Teilsystem_Art_TypeClass object) {
				return createTSO_Teilsystem_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseTueranschlag_TypeClass(Tueranschlag_TypeClass object) {
				return createTueranschlag_TypeClassAdapter();
			}
			@Override
			public Adapter caseUebertragungsweg(Uebertragungsweg object) {
				return createUebertragungswegAdapter();
			}
			@Override
			public Adapter caseUebertragungsweg_Art_TypeClass(Uebertragungsweg_Art_TypeClass object) {
				return createUebertragungsweg_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseUebertragungsweg_Technik_AttributeGroup(Uebertragungsweg_Technik_AttributeGroup object) {
				return createUebertragungsweg_Technik_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseUnterbringung(Unterbringung object) {
				return createUnterbringungAdapter();
			}
			@Override
			public Adapter caseUnterbringung_Allg_AttributeGroup(Unterbringung_Allg_AttributeGroup object) {
				return createUnterbringung_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseUnterbringung_Art_TypeClass(Unterbringung_Art_TypeClass object) {
				return createUnterbringung_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseUnterbringung_Befestigung_TypeClass(Unterbringung_Befestigung_TypeClass object) {
				return createUnterbringung_Befestigung_TypeClassAdapter();
			}
			@Override
			public Adapter caseUnterbringung_Polygonzug_TypeClass(Unterbringung_Polygonzug_TypeClass object) {
				return createUnterbringung_Polygonzug_TypeClassAdapter();
			}
			@Override
			public Adapter caseZusatzinformation_Stellwerk_TypeClass(Zusatzinformation_Stellwerk_TypeClass object) {
				return createZusatzinformation_Stellwerk_TypeClassAdapter();
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
			public Adapter caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
				return createBasisAttribut_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBereich_Objekt(Bereich_Objekt object) {
				return createBereich_ObjektAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.AEA_Allg_AttributeGroup <em>AEA Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.AEA_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createAEA_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.AEA_Energieversorgung_AttributeGroup <em>AEA Energieversorgung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.AEA_Energieversorgung_AttributeGroup
	 * @generated
	 */
	public Adapter createAEA_Energieversorgung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.AEA_GFK_IP_Adressblock_AttributeGroup <em>AEA GFK IP Adressblock Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.AEA_GFK_IP_Adressblock_AttributeGroup
	 * @generated
	 */
	public Adapter createAEA_GFK_IP_Adressblock_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Aussenelementansteuerung <em>Aussenelementansteuerung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Aussenelementansteuerung
	 * @generated
	 */
	public Adapter createAussenelementansteuerungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Aussenelementansteuerung_Art_TypeClass <em>Aussenelementansteuerung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Aussenelementansteuerung_Art_TypeClass
	 * @generated
	 */
	public Adapter createAussenelementansteuerung_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Aussenelementansteuerung_Bezeichnung_AttributeGroup <em>Aussenelementansteuerung Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Aussenelementansteuerung_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createAussenelementansteuerung_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Bandbreite_TypeClass <em>Bandbreite Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Bandbreite_TypeClass
	 * @generated
	 */
	public Adapter createBandbreite_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Bauart_TypeClass <em>Bauart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Bauart_TypeClass
	 * @generated
	 */
	public Adapter createBauart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Bezeichnung_AEA_TypeClass <em>Bezeichnung AEA Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Bezeichnung_AEA_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_AEA_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Bezeichnung_ESTW_ZE_TypeClass <em>Bezeichnung ESTW ZE Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Bezeichnung_ESTW_ZE_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_ESTW_ZE_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Bezeichnung_Stellwerk_TypeClass <em>Bezeichnung Stellwerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Bezeichnung_Stellwerk_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Stellwerk_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Bezeichnung_TSO_TypeClass <em>Bezeichnung TSO Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Bezeichnung_TSO_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_TSO_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Energieversorgung_Art_Ersatz_TypeClass <em>Energieversorgung Art Ersatz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Energieversorgung_Art_Ersatz_TypeClass
	 * @generated
	 */
	public Adapter createEnergieversorgung_Art_Ersatz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Energieversorgung_Art_TypeClass <em>Energieversorgung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Energieversorgung_Art_TypeClass
	 * @generated
	 */
	public Adapter createEnergieversorgung_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup <em>ESTW ZE Energieversorgung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup
	 * @generated
	 */
	public Adapter createESTW_ZE_Energieversorgung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_Zentraleinheit <em>ESTW Zentraleinheit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_Zentraleinheit
	 * @generated
	 */
	public Adapter createESTW_ZentraleinheitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup <em>ESTW Zentraleinheit Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createESTW_Zentraleinheit_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_Zentraleinheit_Bezeichnung_AttributeGroup <em>ESTW Zentraleinheit Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_Zentraleinheit_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createESTW_Zentraleinheit_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.GFK_Kategorie_TypeClass <em>GFK Kategorie Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.GFK_Kategorie_TypeClass
	 * @generated
	 */
	public Adapter createGFK_Kategorie_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Hersteller_TypeClass <em>Hersteller Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Hersteller_TypeClass
	 * @generated
	 */
	public Adapter createHersteller_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Blau_TypeClass <em>IP Adressblock Blau Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Blau_TypeClass
	 * @generated
	 */
	public Adapter createIP_Adressblock_Blau_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Blau_V4_TypeClass <em>IP Adressblock Blau V4 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Blau_V4_TypeClass
	 * @generated
	 */
	public Adapter createIP_Adressblock_Blau_V4_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Blau_V6_TypeClass <em>IP Adressblock Blau V6 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Blau_V6_TypeClass
	 * @generated
	 */
	public Adapter createIP_Adressblock_Blau_V6_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Grau_TypeClass <em>IP Adressblock Grau Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Grau_TypeClass
	 * @generated
	 */
	public Adapter createIP_Adressblock_Grau_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Grau_V4_TypeClass <em>IP Adressblock Grau V4 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Grau_V4_TypeClass
	 * @generated
	 */
	public Adapter createIP_Adressblock_Grau_V4_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Grau_V6_TypeClass <em>IP Adressblock Grau V6 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Grau_V6_TypeClass
	 * @generated
	 */
	public Adapter createIP_Adressblock_Grau_V6_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Medium_Art_TypeClass <em>Medium Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Medium_Art_TypeClass
	 * @generated
	 */
	public Adapter createMedium_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Netz_Art_TypeClass <em>Netz Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Netz_Art_TypeClass
	 * @generated
	 */
	public Adapter createNetz_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Regionalbereich_TypeClass <em>Regionalbereich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Regionalbereich_TypeClass
	 * @generated
	 */
	public Adapter createRegionalbereich_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Standort_Beschreibung_TypeClass <em>Standort Beschreibung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Standort_Beschreibung_TypeClass
	 * @generated
	 */
	public Adapter createStandort_Beschreibung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Stell_Bereich <em>Stell Bereich</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Stell_Bereich
	 * @generated
	 */
	public Adapter createStell_BereichAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Stellelement <em>Stellelement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Stellelement
	 * @generated
	 */
	public Adapter createStellelementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Technik_Art_TypeClass <em>Technik Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Technik_Art_TypeClass
	 * @generated
	 */
	public Adapter createTechnik_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Technik_Beschreibung_TypeClass <em>Technik Beschreibung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Technik_Beschreibung_TypeClass
	 * @generated
	 */
	public Adapter createTechnik_Beschreibung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Technik_Standort <em>Technik Standort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Technik_Standort
	 * @generated
	 */
	public Adapter createTechnik_StandortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Technik_Standort_Bezeichnung_AttributeGroup <em>Technik Standort Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Technik_Standort_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createTechnik_Standort_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.TSO_IP_AB_Teilsystem_AttributeGroup <em>TSO IP AB Teilsystem Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.TSO_IP_AB_Teilsystem_AttributeGroup
	 * @generated
	 */
	public Adapter createTSO_IP_AB_Teilsystem_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.TSO_IP_Adressblock_AttributeGroup <em>TSO IP Adressblock Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.TSO_IP_Adressblock_AttributeGroup
	 * @generated
	 */
	public Adapter createTSO_IP_Adressblock_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.TSO_Teilsystem_Art_TypeClass <em>TSO Teilsystem Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.TSO_Teilsystem_Art_TypeClass
	 * @generated
	 */
	public Adapter createTSO_Teilsystem_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Tueranschlag_TypeClass <em>Tueranschlag Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Tueranschlag_TypeClass
	 * @generated
	 */
	public Adapter createTueranschlag_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg <em>Uebertragungsweg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg
	 * @generated
	 */
	public Adapter createUebertragungswegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Art_TypeClass <em>Uebertragungsweg Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Art_TypeClass
	 * @generated
	 */
	public Adapter createUebertragungsweg_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup <em>Uebertragungsweg Technik Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup
	 * @generated
	 */
	public Adapter createUebertragungsweg_Technik_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung <em>Unterbringung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung
	 * @generated
	 */
	public Adapter createUnterbringungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung_Allg_AttributeGroup <em>Unterbringung Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createUnterbringung_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung_Art_TypeClass <em>Unterbringung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung_Art_TypeClass
	 * @generated
	 */
	public Adapter createUnterbringung_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung_Befestigung_TypeClass <em>Unterbringung Befestigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung_Befestigung_TypeClass
	 * @generated
	 */
	public Adapter createUnterbringung_Befestigung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung_Polygonzug_TypeClass <em>Unterbringung Polygonzug Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung_Polygonzug_TypeClass
	 * @generated
	 */
	public Adapter createUnterbringung_Polygonzug_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Zusatzinformation_Stellwerk_TypeClass <em>Zusatzinformation Stellwerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Zusatzinformation_Stellwerk_TypeClass
	 * @generated
	 */
	public Adapter createZusatzinformation_Stellwerk_TypeClassAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt <em>Bereich Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt
	 * @generated
	 */
	public Adapter createBereich_ObjektAdapter() {
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

} //Ansteuerung_ElementAdapterFactory
