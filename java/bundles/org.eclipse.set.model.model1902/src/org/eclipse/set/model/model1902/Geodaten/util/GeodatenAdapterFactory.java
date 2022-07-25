/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model1902.Geodaten.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage
 * @generated
 */
public class GeodatenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeodatenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeodatenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GeodatenPackage.eINSTANCE;
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
	protected GeodatenSwitch<Adapter> modelSwitch =
		new GeodatenSwitch<Adapter>() {
			@Override
			public Adapter caseBezeichnung_Strecke_TypeClass(Bezeichnung_Strecke_TypeClass object) {
				return createBezeichnung_Strecke_TypeClassAdapter();
			}
			@Override
			public Adapter caseGEO_Form_TypeClass(GEO_Form_TypeClass object) {
				return createGEO_Form_TypeClassAdapter();
			}
			@Override
			public Adapter caseGEO_Kante(GEO_Kante object) {
				return createGEO_KanteAdapter();
			}
			@Override
			public Adapter caseGEO_Kante_Allg_AttributeGroup(GEO_Kante_Allg_AttributeGroup object) {
				return createGEO_Kante_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseGEO_Knoten(GEO_Knoten object) {
				return createGEO_KnotenAdapter();
			}
			@Override
			public Adapter caseGEO_KoordinatenSystem_LSys_TypeClass(GEO_KoordinatenSystem_LSys_TypeClass object) {
				return createGEO_KoordinatenSystem_LSys_TypeClassAdapter();
			}
			@Override
			public Adapter caseGEO_KoordinatenSystem_Sonstige_TypeClass(GEO_KoordinatenSystem_Sonstige_TypeClass object) {
				return createGEO_KoordinatenSystem_Sonstige_TypeClassAdapter();
			}
			@Override
			public Adapter caseGEO_Laenge_TypeClass(GEO_Laenge_TypeClass object) {
				return createGEO_Laenge_TypeClassAdapter();
			}
			@Override
			public Adapter caseGEO_PAD_TypeClass(GEO_PAD_TypeClass object) {
				return createGEO_PAD_TypeClassAdapter();
			}
			@Override
			public Adapter caseGEO_Punkt(GEO_Punkt object) {
				return createGEO_PunktAdapter();
			}
			@Override
			public Adapter caseGEO_Punkt_Allg_AttributeGroup(GEO_Punkt_Allg_AttributeGroup object) {
				return createGEO_Punkt_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseGEO_Radius_A_TypeClass(GEO_Radius_A_TypeClass object) {
				return createGEO_Radius_A_TypeClassAdapter();
			}
			@Override
			public Adapter caseGEO_Radius_B_TypeClass(GEO_Radius_B_TypeClass object) {
				return createGEO_Radius_B_TypeClassAdapter();
			}
			@Override
			public Adapter caseGEO_Richtungswinkel_TypeClass(GEO_Richtungswinkel_TypeClass object) {
				return createGEO_Richtungswinkel_TypeClassAdapter();
			}
			@Override
			public Adapter caseGeschwindigkeit_TypeClass(Geschwindigkeit_TypeClass object) {
				return createGeschwindigkeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseGeschwindigkeitsprofil(Geschwindigkeitsprofil object) {
				return createGeschwindigkeitsprofilAdapter();
			}
			@Override
			public Adapter caseGeschwindigkeitsprofil_Allg_AttributeGroup(Geschwindigkeitsprofil_Allg_AttributeGroup object) {
				return createGeschwindigkeitsprofil_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseGK_X_TypeClass(GK_X_TypeClass object) {
				return createGK_X_TypeClassAdapter();
			}
			@Override
			public Adapter caseGK_Y_TypeClass(GK_Y_TypeClass object) {
				return createGK_Y_TypeClassAdapter();
			}
			@Override
			public Adapter caseGK_Z_TypeClass(GK_Z_TypeClass object) {
				return createGK_Z_TypeClassAdapter();
			}
			@Override
			public Adapter caseHoehenlinie(Hoehenlinie object) {
				return createHoehenlinieAdapter();
			}
			@Override
			public Adapter caseHoehenlinie_Allg_AttributeGroup(Hoehenlinie_Allg_AttributeGroup object) {
				return createHoehenlinie_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseHoehenlinie_Form_TypeClass(Hoehenlinie_Form_TypeClass object) {
				return createHoehenlinie_Form_TypeClassAdapter();
			}
			@Override
			public Adapter caseHoehenlinie_Laenge_TypeClass(Hoehenlinie_Laenge_TypeClass object) {
				return createHoehenlinie_Laenge_TypeClassAdapter();
			}
			@Override
			public Adapter caseHoehenpunkt(Hoehenpunkt object) {
				return createHoehenpunktAdapter();
			}
			@Override
			public Adapter caseHoehenpunkt_Allg_AttributeGroup(Hoehenpunkt_Allg_AttributeGroup object) {
				return createHoehenpunkt_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseHoehenpunkt_Datum_TypeClass(Hoehenpunkt_Datum_TypeClass object) {
				return createHoehenpunkt_Datum_TypeClassAdapter();
			}
			@Override
			public Adapter caseHoehenpunkt_Hoehe_TypeClass(Hoehenpunkt_Hoehe_TypeClass object) {
				return createHoehenpunkt_Hoehe_TypeClassAdapter();
			}
			@Override
			public Adapter caseHSystem_TypeClass(HSystem_TypeClass object) {
				return createHSystem_TypeClassAdapter();
			}
			@Override
			public Adapter caseKnotenname_TypeClass(Knotenname_TypeClass object) {
				return createKnotenname_TypeClassAdapter();
			}
			@Override
			public Adapter caseNeigung_TypeClass(Neigung_TypeClass object) {
				return createNeigung_TypeClassAdapter();
			}
			@Override
			public Adapter caseOertlichkeit(Oertlichkeit object) {
				return createOertlichkeitAdapter();
			}
			@Override
			public Adapter caseOertlichkeit_Abkuerzung_TypeClass(Oertlichkeit_Abkuerzung_TypeClass object) {
				return createOertlichkeit_Abkuerzung_TypeClassAdapter();
			}
			@Override
			public Adapter caseOertlichkeit_Allg_AttributeGroup(Oertlichkeit_Allg_AttributeGroup object) {
				return createOertlichkeit_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseOertlichkeit_Art_TypeClass(Oertlichkeit_Art_TypeClass object) {
				return createOertlichkeit_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseOertlichkeit_Bezeichnung_AttributeGroup(Oertlichkeit_Bezeichnung_AttributeGroup object) {
				return createOertlichkeit_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseOertlichkeit_Gueltig_Ab_TypeClass(Oertlichkeit_Gueltig_Ab_TypeClass object) {
				return createOertlichkeit_Gueltig_Ab_TypeClassAdapter();
			}
			@Override
			public Adapter caseOertlichkeit_Gueltig_Bis_TypeClass(Oertlichkeit_Gueltig_Bis_TypeClass object) {
				return createOertlichkeit_Gueltig_Bis_TypeClassAdapter();
			}
			@Override
			public Adapter caseOertlichkeit_Kurzname_TypeClass(Oertlichkeit_Kurzname_TypeClass object) {
				return createOertlichkeit_Kurzname_TypeClassAdapter();
			}
			@Override
			public Adapter caseOertlichkeit_Langname_TypeClass(Oertlichkeit_Langname_TypeClass object) {
				return createOertlichkeit_Langname_TypeClassAdapter();
			}
			@Override
			public Adapter casePlan_Quelle_TypeClass(Plan_Quelle_TypeClass object) {
				return createPlan_Quelle_TypeClassAdapter();
			}
			@Override
			public Adapter caseStrecke(Strecke object) {
				return createStreckeAdapter();
			}
			@Override
			public Adapter caseStrecke_Bezeichnung_AttributeGroup(Strecke_Bezeichnung_AttributeGroup object) {
				return createStrecke_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseStrecke_Meter_TypeClass(Strecke_Meter_TypeClass object) {
				return createStrecke_Meter_TypeClassAdapter();
			}
			@Override
			public Adapter caseStrecke_Punkt(Strecke_Punkt object) {
				return createStrecke_PunktAdapter();
			}
			@Override
			public Adapter caseTB_Art_TypeClass(TB_Art_TypeClass object) {
				return createTB_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseTB_Beschreibung_TypeClass(TB_Beschreibung_TypeClass object) {
				return createTB_Beschreibung_TypeClassAdapter();
			}
			@Override
			public Adapter caseTechnischer_Bereich(Technischer_Bereich object) {
				return createTechnischer_BereichAdapter();
			}
			@Override
			public Adapter caseTechnischer_Punkt(Technischer_Punkt object) {
				return createTechnischer_PunktAdapter();
			}
			@Override
			public Adapter caseTOP_Anschluss_A_TypeClass(TOP_Anschluss_A_TypeClass object) {
				return createTOP_Anschluss_A_TypeClassAdapter();
			}
			@Override
			public Adapter caseTOP_Anschluss_B_TypeClass(TOP_Anschluss_B_TypeClass object) {
				return createTOP_Anschluss_B_TypeClassAdapter();
			}
			@Override
			public Adapter caseTOP_Kante(TOP_Kante object) {
				return createTOP_KanteAdapter();
			}
			@Override
			public Adapter caseTOP_Kante_Allg_AttributeGroup(TOP_Kante_Allg_AttributeGroup object) {
				return createTOP_Kante_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseTOP_Knoten(TOP_Knoten object) {
				return createTOP_KnotenAdapter();
			}
			@Override
			public Adapter caseTOP_Laenge_TypeClass(TOP_Laenge_TypeClass object) {
				return createTOP_Laenge_TypeClassAdapter();
			}
			@Override
			public Adapter caseTP_Art_TypeClass(TP_Art_TypeClass object) {
				return createTP_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseTP_Beschreibung_TypeClass(TP_Beschreibung_TypeClass object) {
				return createTP_Beschreibung_TypeClassAdapter();
			}
			@Override
			public Adapter caseUeberhoehung(Ueberhoehung object) {
				return createUeberhoehungAdapter();
			}
			@Override
			public Adapter caseUeberhoehung_Allg_AttributeGroup(Ueberhoehung_Allg_AttributeGroup object) {
				return createUeberhoehung_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseUeberhoehung_Datum_TypeClass(Ueberhoehung_Datum_TypeClass object) {
				return createUeberhoehung_Datum_TypeClassAdapter();
			}
			@Override
			public Adapter caseUeberhoehung_Hoehe_TypeClass(Ueberhoehung_Hoehe_TypeClass object) {
				return createUeberhoehung_Hoehe_TypeClassAdapter();
			}
			@Override
			public Adapter caseUeberhoehungslinie(Ueberhoehungslinie object) {
				return createUeberhoehungslinieAdapter();
			}
			@Override
			public Adapter caseUeberhoehungslinie_Allg_AttributeGroup(Ueberhoehungslinie_Allg_AttributeGroup object) {
				return createUeberhoehungslinie_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseUeberhoehungslinie_Form_TypeClass(Ueberhoehungslinie_Form_TypeClass object) {
				return createUeberhoehungslinie_Form_TypeClassAdapter();
			}
			@Override
			public Adapter caseUeberhoehungslinie_Laenge_TypeClass(Ueberhoehungslinie_Laenge_TypeClass object) {
				return createUeberhoehungslinie_Laenge_TypeClassAdapter();
			}
			@Override
			public Adapter caseV_Profil_Art_TypeClass(V_Profil_Art_TypeClass object) {
				return createV_Profil_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseWirkrichtung_TypeClass(Wirkrichtung_TypeClass object) {
				return createWirkrichtung_TypeClassAdapter();
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
			public Adapter caseBereich_Objekt(Bereich_Objekt object) {
				return createBereich_ObjektAdapter();
			}
			@Override
			public Adapter casePunkt_Objekt(Punkt_Objekt object) {
				return createPunkt_ObjektAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Bezeichnung_Strecke_TypeClass <em>Bezeichnung Strecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Bezeichnung_Strecke_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Strecke_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Form_TypeClass <em>GEO Form Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Form_TypeClass
	 * @generated
	 */
	public Adapter createGEO_Form_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante <em>GEO Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante
	 * @generated
	 */
	public Adapter createGEO_KanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup <em>GEO Kante Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createGEO_Kante_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Knoten <em>GEO Knoten</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Knoten
	 * @generated
	 */
	public Adapter createGEO_KnotenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_LSys_TypeClass <em>GEO Koordinaten System LSys Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_LSys_TypeClass
	 * @generated
	 */
	public Adapter createGEO_KoordinatenSystem_LSys_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_Sonstige_TypeClass <em>GEO Koordinaten System Sonstige Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_Sonstige_TypeClass
	 * @generated
	 */
	public Adapter createGEO_KoordinatenSystem_Sonstige_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Laenge_TypeClass <em>GEO Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Laenge_TypeClass
	 * @generated
	 */
	public Adapter createGEO_Laenge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_PAD_TypeClass <em>GEO PAD Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_PAD_TypeClass
	 * @generated
	 */
	public Adapter createGEO_PAD_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt <em>GEO Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Punkt
	 * @generated
	 */
	public Adapter createGEO_PunktAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup <em>GEO Punkt Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createGEO_Punkt_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Radius_A_TypeClass <em>GEO Radius AType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Radius_A_TypeClass
	 * @generated
	 */
	public Adapter createGEO_Radius_A_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Radius_B_TypeClass <em>GEO Radius BType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Radius_B_TypeClass
	 * @generated
	 */
	public Adapter createGEO_Radius_B_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Richtungswinkel_TypeClass <em>GEO Richtungswinkel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Richtungswinkel_TypeClass
	 * @generated
	 */
	public Adapter createGEO_Richtungswinkel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeit_TypeClass <em>Geschwindigkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Geschwindigkeit_TypeClass
	 * @generated
	 */
	public Adapter createGeschwindigkeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil <em>Geschwindigkeitsprofil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil
	 * @generated
	 */
	public Adapter createGeschwindigkeitsprofilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup <em>Geschwindigkeitsprofil Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createGeschwindigkeitsprofil_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GK_X_TypeClass <em>GK XType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GK_X_TypeClass
	 * @generated
	 */
	public Adapter createGK_X_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GK_Y_TypeClass <em>GK YType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GK_Y_TypeClass
	 * @generated
	 */
	public Adapter createGK_Y_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.GK_Z_TypeClass <em>GK ZType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.GK_Z_TypeClass
	 * @generated
	 */
	public Adapter createGK_Z_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie <em>Hoehenlinie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie
	 * @generated
	 */
	public Adapter createHoehenlinieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Allg_AttributeGroup <em>Hoehenlinie Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createHoehenlinie_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Form_TypeClass <em>Hoehenlinie Form Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Form_TypeClass
	 * @generated
	 */
	public Adapter createHoehenlinie_Form_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Laenge_TypeClass <em>Hoehenlinie Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Laenge_TypeClass
	 * @generated
	 */
	public Adapter createHoehenlinie_Laenge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt <em>Hoehenpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt
	 * @generated
	 */
	public Adapter createHoehenpunktAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup <em>Hoehenpunkt Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createHoehenpunkt_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Datum_TypeClass <em>Hoehenpunkt Datum Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Datum_TypeClass
	 * @generated
	 */
	public Adapter createHoehenpunkt_Datum_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Hoehe_TypeClass <em>Hoehenpunkt Hoehe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Hoehe_TypeClass
	 * @generated
	 */
	public Adapter createHoehenpunkt_Hoehe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.HSystem_TypeClass <em>HSystem Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.HSystem_TypeClass
	 * @generated
	 */
	public Adapter createHSystem_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Knotenname_TypeClass <em>Knotenname Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Knotenname_TypeClass
	 * @generated
	 */
	public Adapter createKnotenname_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Neigung_TypeClass <em>Neigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Neigung_TypeClass
	 * @generated
	 */
	public Adapter createNeigung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit <em>Oertlichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit
	 * @generated
	 */
	public Adapter createOertlichkeitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Abkuerzung_TypeClass <em>Oertlichkeit Abkuerzung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Abkuerzung_TypeClass
	 * @generated
	 */
	public Adapter createOertlichkeit_Abkuerzung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Allg_AttributeGroup <em>Oertlichkeit Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createOertlichkeit_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Art_TypeClass <em>Oertlichkeit Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Art_TypeClass
	 * @generated
	 */
	public Adapter createOertlichkeit_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup <em>Oertlichkeit Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createOertlichkeit_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Ab_TypeClass <em>Oertlichkeit Gueltig Ab Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Ab_TypeClass
	 * @generated
	 */
	public Adapter createOertlichkeit_Gueltig_Ab_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Bis_TypeClass <em>Oertlichkeit Gueltig Bis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Bis_TypeClass
	 * @generated
	 */
	public Adapter createOertlichkeit_Gueltig_Bis_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Kurzname_TypeClass <em>Oertlichkeit Kurzname Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Kurzname_TypeClass
	 * @generated
	 */
	public Adapter createOertlichkeit_Kurzname_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Langname_TypeClass <em>Oertlichkeit Langname Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Langname_TypeClass
	 * @generated
	 */
	public Adapter createOertlichkeit_Langname_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Plan_Quelle_TypeClass <em>Plan Quelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Plan_Quelle_TypeClass
	 * @generated
	 */
	public Adapter createPlan_Quelle_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Strecke <em>Strecke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke
	 * @generated
	 */
	public Adapter createStreckeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Bezeichnung_AttributeGroup <em>Strecke Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createStrecke_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Meter_TypeClass <em>Strecke Meter Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke_Meter_TypeClass
	 * @generated
	 */
	public Adapter createStrecke_Meter_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt <em>Strecke Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt
	 * @generated
	 */
	public Adapter createStrecke_PunktAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.TB_Art_TypeClass <em>TB Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.TB_Art_TypeClass
	 * @generated
	 */
	public Adapter createTB_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.TB_Beschreibung_TypeClass <em>TB Beschreibung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.TB_Beschreibung_TypeClass
	 * @generated
	 */
	public Adapter createTB_Beschreibung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Technischer_Bereich <em>Technischer Bereich</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Technischer_Bereich
	 * @generated
	 */
	public Adapter createTechnischer_BereichAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt <em>Technischer Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt
	 * @generated
	 */
	public Adapter createTechnischer_PunktAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Anschluss_A_TypeClass <em>TOP Anschluss AType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Anschluss_A_TypeClass
	 * @generated
	 */
	public Adapter createTOP_Anschluss_A_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Anschluss_B_TypeClass <em>TOP Anschluss BType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Anschluss_B_TypeClass
	 * @generated
	 */
	public Adapter createTOP_Anschluss_B_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante <em>TOP Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Kante
	 * @generated
	 */
	public Adapter createTOP_KanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup <em>TOP Kante Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createTOP_Kante_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Knoten <em>TOP Knoten</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Knoten
	 * @generated
	 */
	public Adapter createTOP_KnotenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Laenge_TypeClass <em>TOP Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Laenge_TypeClass
	 * @generated
	 */
	public Adapter createTOP_Laenge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.TP_Art_TypeClass <em>TP Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.TP_Art_TypeClass
	 * @generated
	 */
	public Adapter createTP_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.TP_Beschreibung_TypeClass <em>TP Beschreibung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.TP_Beschreibung_TypeClass
	 * @generated
	 */
	public Adapter createTP_Beschreibung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung <em>Ueberhoehung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung
	 * @generated
	 */
	public Adapter createUeberhoehungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup <em>Ueberhoehung Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createUeberhoehung_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Datum_TypeClass <em>Ueberhoehung Datum Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Datum_TypeClass
	 * @generated
	 */
	public Adapter createUeberhoehung_Datum_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Hoehe_TypeClass <em>Ueberhoehung Hoehe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Hoehe_TypeClass
	 * @generated
	 */
	public Adapter createUeberhoehung_Hoehe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie <em>Ueberhoehungslinie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie
	 * @generated
	 */
	public Adapter createUeberhoehungslinieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup <em>Ueberhoehungslinie Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createUeberhoehungslinie_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Form_TypeClass <em>Ueberhoehungslinie Form Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Form_TypeClass
	 * @generated
	 */
	public Adapter createUeberhoehungslinie_Form_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Laenge_TypeClass <em>Ueberhoehungslinie Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Laenge_TypeClass
	 * @generated
	 */
	public Adapter createUeberhoehungslinie_Laenge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.V_Profil_Art_TypeClass <em>VProfil Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.V_Profil_Art_TypeClass
	 * @generated
	 */
	public Adapter createV_Profil_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Geodaten.Wirkrichtung_TypeClass <em>Wirkrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Geodaten.Wirkrichtung_TypeClass
	 * @generated
	 */
	public Adapter createWirkrichtung_TypeClassAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt <em>Bereich Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt
	 * @generated
	 */
	public Adapter createBereich_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt <em>Punkt Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt
	 * @generated
	 */
	public Adapter createPunkt_ObjektAdapter() {
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

} //GeodatenAdapterFactory
