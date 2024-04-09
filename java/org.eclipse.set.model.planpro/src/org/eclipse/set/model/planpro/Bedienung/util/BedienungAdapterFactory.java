/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Bedienung.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage
 * @generated
 */
public class BedienungAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BedienungPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BedienungAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BedienungPackage.eINSTANCE;
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
	protected BedienungSwitch<Adapter> modelSwitch =
		new BedienungSwitch<Adapter>() {
			@Override
			public Adapter caseA_Wert_TypeClass(A_Wert_TypeClass object) {
				return createA_Wert_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnbindung_IB2_TypeClass(Anbindung_IB2_TypeClass object) {
				return createAnbindung_IB2_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnbindung_IB3_TypeClass(Anbindung_IB3_TypeClass object) {
				return createAnbindung_IB3_TypeClassAdapter();
			}
			@Override
			public Adapter caseB_Wert_TypeClass(B_Wert_TypeClass object) {
				return createB_Wert_TypeClassAdapter();
			}
			@Override
			public Adapter caseBedien_Anrueckabschnitt(Bedien_Anrueckabschnitt object) {
				return createBedien_AnrueckabschnittAdapter();
			}
			@Override
			public Adapter caseBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup(Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup object) {
				return createBedien_Anrueckabschnitt_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_Anzeige_Element(Bedien_Anzeige_Element object) {
				return createBedien_Anzeige_ElementAdapter();
			}
			@Override
			public Adapter caseBedien_Anzeige_Element_Allg_AttributeGroup(Bedien_Anzeige_Element_Allg_AttributeGroup object) {
				return createBedien_Anzeige_Element_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_Anzeige_Element_Bezeichnung_AttributeGroup(Bedien_Anzeige_Element_Bezeichnung_AttributeGroup object) {
				return createBedien_Anzeige_Element_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_Bezirk(Bedien_Bezirk object) {
				return createBedien_BezirkAdapter();
			}
			@Override
			public Adapter caseBedien_Bezirk_Adressformel_AttributeGroup(Bedien_Bezirk_Adressformel_AttributeGroup object) {
				return createBedien_Bezirk_Adressformel_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_Bezirk_Allg_AttributeGroup(Bedien_Bezirk_Allg_AttributeGroup object) {
				return createBedien_Bezirk_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_Bezirk_Anhaenge_AttributeGroup(Bedien_Bezirk_Anhaenge_AttributeGroup object) {
				return createBedien_Bezirk_Anhaenge_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_Einricht_Bauart_TypeClass(Bedien_Einricht_Bauart_TypeClass object) {
				return createBedien_Einricht_Bauart_TypeClassAdapter();
			}
			@Override
			public Adapter caseBedien_Einricht_Oertl_Bez_TypeClass(Bedien_Einricht_Oertl_Bez_TypeClass object) {
				return createBedien_Einricht_Oertl_Bez_TypeClassAdapter();
			}
			@Override
			public Adapter caseBedien_Einricht_Oertlich_Allg_AttributeGroup(Bedien_Einricht_Oertlich_Allg_AttributeGroup object) {
				return createBedien_Einricht_Oertlich_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_Einrichtung_Oertlich(Bedien_Einrichtung_Oertlich object) {
				return createBedien_Einrichtung_OertlichAdapter();
			}
			@Override
			public Adapter caseBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup(Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup object) {
				return createBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_GBT(Bedien_GBT object) {
				return createBedien_GBTAdapter();
			}
			@Override
			public Adapter caseBedien_GBT_Allg_AttributeGroup(Bedien_GBT_Allg_AttributeGroup object) {
				return createBedien_GBT_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_Oberflaeche(Bedien_Oberflaeche object) {
				return createBedien_OberflaecheAdapter();
			}
			@Override
			public Adapter caseBedien_Oberflaeche_Anhaenge_AttributeGroup(Bedien_Oberflaeche_Anhaenge_AttributeGroup object) {
				return createBedien_Oberflaeche_Anhaenge_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_Oberflaeche_Bild(Bedien_Oberflaeche_Bild object) {
				return createBedien_Oberflaeche_BildAdapter();
			}
			@Override
			public Adapter caseBedien_Oberflaeche_Bild_Allg_AttributeGroup(Bedien_Oberflaeche_Bild_Allg_AttributeGroup object) {
				return createBedien_Oberflaeche_Bild_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_Oertlichkeit(Bedien_Oertlichkeit object) {
				return createBedien_OertlichkeitAdapter();
			}
			@Override
			public Adapter caseBedien_Oertlichkeit_Kennzahlen_AttributeGroup(Bedien_Oertlichkeit_Kennzahlen_AttributeGroup object) {
				return createBedien_Oertlichkeit_Kennzahlen_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_Platz(Bedien_Platz object) {
				return createBedien_PlatzAdapter();
			}
			@Override
			public Adapter caseBedien_Platz_Allg_AttributeGroup(Bedien_Platz_Allg_AttributeGroup object) {
				return createBedien_Platz_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_Platz_Art_TypeClass(Bedien_Platz_Art_TypeClass object) {
				return createBedien_Platz_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseBedien_Standort(Bedien_Standort object) {
				return createBedien_StandortAdapter();
			}
			@Override
			public Adapter caseBedien_Standort_Bezeichnung_AttributeGroup(Bedien_Standort_Bezeichnung_AttributeGroup object) {
				return createBedien_Standort_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedien_Zentrale(Bedien_Zentrale object) {
				return createBedien_ZentraleAdapter();
			}
			@Override
			public Adapter caseBedien_Zentrale_Bezeichnung_AttributeGroup(Bedien_Zentrale_Bezeichnung_AttributeGroup object) {
				return createBedien_Zentrale_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedienplatzbezeichnung_TypeClass(Bedienplatzbezeichnung_TypeClass object) {
				return createBedienplatzbezeichnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseBedienplatznummer_TypeClass(Bedienplatznummer_TypeClass object) {
				return createBedienplatznummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseBedienraumnummer_TypeClass(Bedienraumnummer_TypeClass object) {
				return createBedienraumnummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseBetriebsstellenbezeichner_TypeClass(Betriebsstellenbezeichner_TypeClass object) {
				return createBetriebsstellenbezeichner_TypeClassAdapter();
			}
			@Override
			public Adapter caseBez_Bed_Anrueckabschnitt_TypeClass(Bez_Bed_Anrueckabschnitt_TypeClass object) {
				return createBez_Bed_Anrueckabschnitt_TypeClassAdapter();
			}
			@Override
			public Adapter caseBez_Bed_Anzeige_Element_TypeClass(Bez_Bed_Anzeige_Element_TypeClass object) {
				return createBez_Bed_Anzeige_Element_TypeClassAdapter();
			}
			@Override
			public Adapter caseBez_Bed_Zentrale_TypeClass(Bez_Bed_Zentrale_TypeClass object) {
				return createBez_Bed_Zentrale_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_BSO_TypeClass(Bezeichnung_BSO_TypeClass object) {
				return createBezeichnung_BSO_TypeClassAdapter();
			}
			@Override
			public Adapter caseBSO_IP_AB_Teilsystem_AttributeGroup(BSO_IP_AB_Teilsystem_AttributeGroup object) {
				return createBSO_IP_AB_Teilsystem_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBSO_IP_Adressblock_AttributeGroup(BSO_IP_Adressblock_AttributeGroup object) {
				return createBSO_IP_Adressblock_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBSO_Teilsystem_Art_TypeClass(BSO_Teilsystem_Art_TypeClass object) {
				return createBSO_Teilsystem_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseC_Wert_TypeClass(C_Wert_TypeClass object) {
				return createC_Wert_TypeClassAdapter();
			}
			@Override
			public Adapter caseDD_Wert_TypeClass(DD_Wert_TypeClass object) {
				return createDD_Wert_TypeClassAdapter();
			}
			@Override
			public Adapter caseHersteller_TypeClass(Hersteller_TypeClass object) {
				return createHersteller_TypeClassAdapter();
			}
			@Override
			public Adapter caseHupe_Anschaltzeit_TypeClass(Hupe_Anschaltzeit_TypeClass object) {
				return createHupe_Anschaltzeit_TypeClassAdapter();
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
			public Adapter caseKennzahl_TypeClass(Kennzahl_TypeClass object) {
				return createKennzahl_TypeClassAdapter();
			}
			@Override
			public Adapter caseMelder_TypeClass(Melder_TypeClass object) {
				return createMelder_TypeClassAdapter();
			}
			@Override
			public Adapter caseOberflaeche_Bildart_TypeClass(Oberflaeche_Bildart_TypeClass object) {
				return createOberflaeche_Bildart_TypeClassAdapter();
			}
			@Override
			public Adapter caseOberflaeche_Zustaendigkeit_TypeClass(Oberflaeche_Zustaendigkeit_TypeClass object) {
				return createOberflaeche_Zustaendigkeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseRegionalbereich_TypeClass(Regionalbereich_TypeClass object) {
				return createRegionalbereich_TypeClassAdapter();
			}
			@Override
			public Adapter caseRueckschauzeit_TypeClass(Rueckschauzeit_TypeClass object) {
				return createRueckschauzeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchalter_TypeClass(Schalter_TypeClass object) {
				return createSchalter_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchrankreihe_TypeClass(Schrankreihe_TypeClass object) {
				return createSchrankreihe_TypeClassAdapter();
			}
			@Override
			public Adapter caseSteuerbezirksname_TypeClass(Steuerbezirksname_TypeClass object) {
				return createSteuerbezirksname_TypeClassAdapter();
			}
			@Override
			public Adapter caseSteuerbezirksnummer_TypeClass(Steuerbezirksnummer_TypeClass object) {
				return createSteuerbezirksnummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseTaste_TypeClass(Taste_TypeClass object) {
				return createTaste_TypeClassAdapter();
			}
			@Override
			public Adapter caseVorschauzeit_TypeClass(Vorschauzeit_TypeClass object) {
				return createVorschauzeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseX_Wert_TypeClass(X_Wert_TypeClass object) {
				return createX_Wert_TypeClassAdapter();
			}
			@Override
			public Adapter caseY_Wert_TypeClass(Y_Wert_TypeClass object) {
				return createY_Wert_TypeClassAdapter();
			}
			@Override
			public Adapter caseYY_Wert_TypeClass(YY_Wert_TypeClass object) {
				return createYY_Wert_TypeClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.A_Wert_TypeClass <em>AWert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.A_Wert_TypeClass
	 * @generated
	 */
	public Adapter createA_Wert_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Anbindung_IB2_TypeClass <em>Anbindung IB2 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Anbindung_IB2_TypeClass
	 * @generated
	 */
	public Adapter createAnbindung_IB2_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Anbindung_IB3_TypeClass <em>Anbindung IB3 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Anbindung_IB3_TypeClass
	 * @generated
	 */
	public Adapter createAnbindung_IB3_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.B_Wert_TypeClass <em>BWert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.B_Wert_TypeClass
	 * @generated
	 */
	public Adapter createB_Wert_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt <em>Bedien Anrueckabschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt
	 * @generated
	 */
	public Adapter createBedien_AnrueckabschnittAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup <em>Bedien Anrueckabschnitt Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Anrueckabschnitt_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element <em>Bedien Anzeige Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element
	 * @generated
	 */
	public Adapter createBedien_Anzeige_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup <em>Bedien Anzeige Element Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Anzeige_Element_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Bezeichnung_AttributeGroup <em>Bedien Anzeige Element Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Anzeige_Element_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk <em>Bedien Bezirk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk
	 * @generated
	 */
	public Adapter createBedien_BezirkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup <em>Bedien Bezirk Adressformel Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Bezirk_Adressformel_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup <em>Bedien Bezirk Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Bezirk_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup <em>Bedien Bezirk Anhaenge Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Bezirk_Anhaenge_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Bauart_TypeClass <em>Bedien Einricht Bauart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Bauart_TypeClass
	 * @generated
	 */
	public Adapter createBedien_Einricht_Bauart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertl_Bez_TypeClass <em>Bedien Einricht Oertl Bez Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertl_Bez_TypeClass
	 * @generated
	 */
	public Adapter createBedien_Einricht_Oertl_Bez_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup <em>Bedien Einricht Oertlich Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Einricht_Oertlich_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich <em>Bedien Einrichtung Oertlich</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich
	 * @generated
	 */
	public Adapter createBedien_Einrichtung_OertlichAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup <em>Bedien Einrichtung Oertlich Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_GBT <em>Bedien GBT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_GBT
	 * @generated
	 */
	public Adapter createBedien_GBTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_GBT_Allg_AttributeGroup <em>Bedien GBT Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_GBT_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_GBT_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche <em>Bedien Oberflaeche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche
	 * @generated
	 */
	public Adapter createBedien_OberflaecheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup <em>Bedien Oberflaeche Anhaenge Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Oberflaeche_Anhaenge_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild <em>Bedien Oberflaeche Bild</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild
	 * @generated
	 */
	public Adapter createBedien_Oberflaeche_BildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup <em>Bedien Oberflaeche Bild Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Oberflaeche_Bild_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit <em>Bedien Oertlichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit
	 * @generated
	 */
	public Adapter createBedien_OertlichkeitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup <em>Bedien Oertlichkeit Kennzahlen Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Oertlichkeit_Kennzahlen_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz <em>Bedien Platz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz
	 * @generated
	 */
	public Adapter createBedien_PlatzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Allg_AttributeGroup <em>Bedien Platz Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Platz_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Art_TypeClass <em>Bedien Platz Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Art_TypeClass
	 * @generated
	 */
	public Adapter createBedien_Platz_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Standort <em>Bedien Standort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Standort
	 * @generated
	 */
	public Adapter createBedien_StandortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Standort_Bezeichnung_AttributeGroup <em>Bedien Standort Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Standort_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Standort_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale <em>Bedien Zentrale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale
	 * @generated
	 */
	public Adapter createBedien_ZentraleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale_Bezeichnung_AttributeGroup <em>Bedien Zentrale Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createBedien_Zentrale_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedienplatzbezeichnung_TypeClass <em>Bedienplatzbezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedienplatzbezeichnung_TypeClass
	 * @generated
	 */
	public Adapter createBedienplatzbezeichnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedienplatznummer_TypeClass <em>Bedienplatznummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedienplatznummer_TypeClass
	 * @generated
	 */
	public Adapter createBedienplatznummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bedienraumnummer_TypeClass <em>Bedienraumnummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedienraumnummer_TypeClass
	 * @generated
	 */
	public Adapter createBedienraumnummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Betriebsstellenbezeichner_TypeClass <em>Betriebsstellenbezeichner Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Betriebsstellenbezeichner_TypeClass
	 * @generated
	 */
	public Adapter createBetriebsstellenbezeichner_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anrueckabschnitt_TypeClass <em>Bez Bed Anrueckabschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anrueckabschnitt_TypeClass
	 * @generated
	 */
	public Adapter createBez_Bed_Anrueckabschnitt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anzeige_Element_TypeClass <em>Bez Bed Anzeige Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anzeige_Element_TypeClass
	 * @generated
	 */
	public Adapter createBez_Bed_Anzeige_Element_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Zentrale_TypeClass <em>Bez Bed Zentrale Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Zentrale_TypeClass
	 * @generated
	 */
	public Adapter createBez_Bed_Zentrale_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Bezeichnung_BSO_TypeClass <em>Bezeichnung BSO Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bezeichnung_BSO_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_BSO_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup <em>BSO IP AB Teilsystem Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup
	 * @generated
	 */
	public Adapter createBSO_IP_AB_Teilsystem_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup <em>BSO IP Adressblock Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup
	 * @generated
	 */
	public Adapter createBSO_IP_Adressblock_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.BSO_Teilsystem_Art_TypeClass <em>BSO Teilsystem Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_Teilsystem_Art_TypeClass
	 * @generated
	 */
	public Adapter createBSO_Teilsystem_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.C_Wert_TypeClass <em>CWert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.C_Wert_TypeClass
	 * @generated
	 */
	public Adapter createC_Wert_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.DD_Wert_TypeClass <em>DD Wert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.DD_Wert_TypeClass
	 * @generated
	 */
	public Adapter createDD_Wert_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Hersteller_TypeClass <em>Hersteller Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Hersteller_TypeClass
	 * @generated
	 */
	public Adapter createHersteller_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Hupe_Anschaltzeit_TypeClass <em>Hupe Anschaltzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Hupe_Anschaltzeit_TypeClass
	 * @generated
	 */
	public Adapter createHupe_Anschaltzeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_TypeClass <em>IP Adressblock Blau Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_TypeClass
	 * @generated
	 */
	public Adapter createIP_Adressblock_Blau_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_V4_TypeClass <em>IP Adressblock Blau V4 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_V4_TypeClass
	 * @generated
	 */
	public Adapter createIP_Adressblock_Blau_V4_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_V6_TypeClass <em>IP Adressblock Blau V6 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_V6_TypeClass
	 * @generated
	 */
	public Adapter createIP_Adressblock_Blau_V6_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_TypeClass <em>IP Adressblock Grau Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_TypeClass
	 * @generated
	 */
	public Adapter createIP_Adressblock_Grau_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_V4_TypeClass <em>IP Adressblock Grau V4 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_V4_TypeClass
	 * @generated
	 */
	public Adapter createIP_Adressblock_Grau_V4_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_V6_TypeClass <em>IP Adressblock Grau V6 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_V6_TypeClass
	 * @generated
	 */
	public Adapter createIP_Adressblock_Grau_V6_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Kennzahl_TypeClass <em>Kennzahl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Kennzahl_TypeClass
	 * @generated
	 */
	public Adapter createKennzahl_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Melder_TypeClass <em>Melder Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Melder_TypeClass
	 * @generated
	 */
	public Adapter createMelder_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Oberflaeche_Bildart_TypeClass <em>Oberflaeche Bildart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Oberflaeche_Bildart_TypeClass
	 * @generated
	 */
	public Adapter createOberflaeche_Bildart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Oberflaeche_Zustaendigkeit_TypeClass <em>Oberflaeche Zustaendigkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Oberflaeche_Zustaendigkeit_TypeClass
	 * @generated
	 */
	public Adapter createOberflaeche_Zustaendigkeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Regionalbereich_TypeClass <em>Regionalbereich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Regionalbereich_TypeClass
	 * @generated
	 */
	public Adapter createRegionalbereich_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Rueckschauzeit_TypeClass <em>Rueckschauzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Rueckschauzeit_TypeClass
	 * @generated
	 */
	public Adapter createRueckschauzeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Schalter_TypeClass <em>Schalter Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Schalter_TypeClass
	 * @generated
	 */
	public Adapter createSchalter_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Schrankreihe_TypeClass <em>Schrankreihe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Schrankreihe_TypeClass
	 * @generated
	 */
	public Adapter createSchrankreihe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Steuerbezirksname_TypeClass <em>Steuerbezirksname Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Steuerbezirksname_TypeClass
	 * @generated
	 */
	public Adapter createSteuerbezirksname_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Steuerbezirksnummer_TypeClass <em>Steuerbezirksnummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Steuerbezirksnummer_TypeClass
	 * @generated
	 */
	public Adapter createSteuerbezirksnummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Taste_TypeClass <em>Taste Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Taste_TypeClass
	 * @generated
	 */
	public Adapter createTaste_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Vorschauzeit_TypeClass <em>Vorschauzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Vorschauzeit_TypeClass
	 * @generated
	 */
	public Adapter createVorschauzeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.X_Wert_TypeClass <em>XWert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.X_Wert_TypeClass
	 * @generated
	 */
	public Adapter createX_Wert_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.Y_Wert_TypeClass <em>YWert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.Y_Wert_TypeClass
	 * @generated
	 */
	public Adapter createY_Wert_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bedienung.YY_Wert_TypeClass <em>YY Wert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bedienung.YY_Wert_TypeClass
	 * @generated
	 */
	public Adapter createYY_Wert_TypeClassAdapter() {
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

} //BedienungAdapterFactory
