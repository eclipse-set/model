/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage
 * @generated
 */
public class BasisobjekteAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasisobjektePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisobjekteAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BasisobjektePackage.eINSTANCE;
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
	protected BasisobjekteSwitch<Adapter> modelSwitch =
		new BasisobjekteSwitch<Adapter>() {
			@Override
			public Adapter caseAbstand_TypeClass(Abstand_TypeClass object) {
				return createAbstand_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnhang(Anhang object) {
				return createAnhangAdapter();
			}
			@Override
			public Adapter caseAnhang_Allg_AttributeGroup(Anhang_Allg_AttributeGroup object) {
				return createAnhang_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseAnhang_Art_TypeClass(Anhang_Art_TypeClass object) {
				return createAnhang_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseBasis_Objekt(Basis_Objekt object) {
				return createBasis_ObjektAdapter();
			}
			@Override
			public Adapter caseBasis_Objekt_Allg_AttributeGroup(Basis_Objekt_Allg_AttributeGroup object) {
				return createBasis_Objekt_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBearbeitungsvermerk(Bearbeitungsvermerk object) {
				return createBearbeitungsvermerkAdapter();
			}
			@Override
			public Adapter caseBearbeitungsvermerk_Allg_AttributeGroup(Bearbeitungsvermerk_Allg_AttributeGroup object) {
				return createBearbeitungsvermerk_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBearbeitungsvermerk_Rolle_TypeClass(Bearbeitungsvermerk_Rolle_TypeClass object) {
				return createBearbeitungsvermerk_Rolle_TypeClassAdapter();
			}
			@Override
			public Adapter caseBegrenzung_A_TypeClass(Begrenzung_A_TypeClass object) {
				return createBegrenzung_A_TypeClassAdapter();
			}
			@Override
			public Adapter caseBegrenzung_B_TypeClass(Begrenzung_B_TypeClass object) {
				return createBegrenzung_B_TypeClassAdapter();
			}
			@Override
			public Adapter caseBereich_Objekt(Bereich_Objekt object) {
				return createBereich_ObjektAdapter();
			}
			@Override
			public Adapter caseBereich_Objekt_Teilbereich_AttributeGroup(Bereich_Objekt_Teilbereich_AttributeGroup object) {
				return createBereich_Objekt_Teilbereich_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBeschreibung_TypeClass(Beschreibung_TypeClass object) {
				return createBeschreibung_TypeClassAdapter();
			}
			@Override
			public Adapter caseBestandsrelevanz_TypeClass(Bestandsrelevanz_TypeClass object) {
				return createBestandsrelevanz_TypeClassAdapter();
			}
			@Override
			public Adapter caseBestandsschutz_TypeClass(Bestandsschutz_TypeClass object) {
				return createBestandsschutz_TypeClassAdapter();
			}
			@Override
			public Adapter caseBV_Darstellung_In_Plan_TypeClass(BV_Darstellung_In_Plan_TypeClass object) {
				return createBV_Darstellung_In_Plan_TypeClassAdapter();
			}
			@Override
			public Adapter caseBV_Kategorie_TypeClass(BV_Kategorie_TypeClass object) {
				return createBV_Kategorie_TypeClassAdapter();
			}
			@Override
			public Adapter caseDateiname_TypeClass(Dateiname_TypeClass object) {
				return createDateiname_TypeClassAdapter();
			}
			@Override
			public Adapter caseDateityp_TypeClass(Dateityp_TypeClass object) {
				return createDateityp_TypeClassAdapter();
			}
			@Override
			public Adapter caseDatum_Regelwerk_TypeClass(Datum_Regelwerk_TypeClass object) {
				return createDatum_Regelwerk_TypeClassAdapter();
			}
			@Override
			public Adapter caseDB_GDI_Referenz_TypeClass(DB_GDI_Referenz_TypeClass object) {
				return createDB_GDI_Referenz_TypeClassAdapter();
			}
			@Override
			public Adapter caseIdentitaet_TypeClass(Identitaet_TypeClass object) {
				return createIdentitaet_TypeClassAdapter();
			}
			@Override
			public Adapter caseKm_Massgebend_TypeClass(Km_Massgebend_TypeClass object) {
				return createKm_Massgebend_TypeClassAdapter();
			}
			@Override
			public Adapter caseKommentar_TypeClass(Kommentar_TypeClass object) {
				return createKommentar_TypeClassAdapter();
			}
			@Override
			public Adapter caseKurztext_TypeClass(Kurztext_TypeClass object) {
				return createKurztext_TypeClassAdapter();
			}
			@Override
			public Adapter caseLieferobjekt(Lieferobjekt object) {
				return createLieferobjektAdapter();
			}
			@Override
			public Adapter caseLO_Ausgabestand_TypeClass(LO_Ausgabestand_TypeClass object) {
				return createLO_Ausgabestand_TypeClassAdapter();
			}
			@Override
			public Adapter caseLO_Datum_Herstellung_TypeClass(LO_Datum_Herstellung_TypeClass object) {
				return createLO_Datum_Herstellung_TypeClassAdapter();
			}
			@Override
			public Adapter caseLO_DB_Freigabe_TypeClass(LO_DB_Freigabe_TypeClass object) {
				return createLO_DB_Freigabe_TypeClassAdapter();
			}
			@Override
			public Adapter caseLO_EMA_Nr_TypeClass(LO_EMA_Nr_TypeClass object) {
				return createLO_EMA_Nr_TypeClassAdapter();
			}
			@Override
			public Adapter caseLO_Ersatz_TypeClass(LO_Ersatz_TypeClass object) {
				return createLO_Ersatz_TypeClassAdapter();
			}
			@Override
			public Adapter caseLO_Firmensachnummer_TypeClass(LO_Firmensachnummer_TypeClass object) {
				return createLO_Firmensachnummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseLO_Material_AttributeGroup(LO_Material_AttributeGroup object) {
				return createLO_Material_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLO_Seriennummer_TypeClass(LO_Seriennummer_TypeClass object) {
				return createLO_Seriennummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseLST_Objekt_Art_TypeClass(LST_Objekt_Art_TypeClass object) {
				return createLST_Objekt_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseObjektreferenzen_AttributeGroup(Objektreferenzen_AttributeGroup object) {
				return createObjektreferenzen_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseObjektzustand_Besonders_TypeClass(Objektzustand_Besonders_TypeClass object) {
				return createObjektzustand_Besonders_TypeClassAdapter();
			}
			@Override
			public Adapter caseProxy_Objekt(Proxy_Objekt object) {
				return createProxy_ObjektAdapter();
			}
			@Override
			public Adapter casePunkt_Objekt(Punkt_Objekt object) {
				return createPunkt_ObjektAdapter();
			}
			@Override
			public Adapter casePunkt_Objekt_Strecke_AttributeGroup(Punkt_Objekt_Strecke_AttributeGroup object) {
				return createPunkt_Objekt_Strecke_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePunkt_Objekt_TOP_Kante_AttributeGroup(Punkt_Objekt_TOP_Kante_AttributeGroup object) {
				return createPunkt_Objekt_TOP_Kante_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseRichtungsbezug_TypeClass(Richtungsbezug_TypeClass object) {
				return createRichtungsbezug_TypeClassAdapter();
			}
			@Override
			public Adapter caseSeitliche_Lage_TypeClass(Seitliche_Lage_TypeClass object) {
				return createSeitliche_Lage_TypeClassAdapter();
			}
			@Override
			public Adapter caseSeitlicher_Abstand_TypeClass(Seitlicher_Abstand_TypeClass object) {
				return createSeitlicher_Abstand_TypeClassAdapter();
			}
			@Override
			public Adapter caseStrecke_Km_TypeClass(Strecke_Km_TypeClass object) {
				return createStrecke_Km_TypeClassAdapter();
			}
			@Override
			public Adapter caseTechnischer_Platz_TypeClass(Technischer_Platz_TypeClass object) {
				return createTechnischer_Platz_TypeClassAdapter();
			}
			@Override
			public Adapter caseUr_Objekt(Ur_Objekt object) {
				return createUr_ObjektAdapter();
			}
			@Override
			public Adapter caseWirkrichtung_TypeClass(Wirkrichtung_TypeClass object) {
				return createWirkrichtung_TypeClassAdapter();
			}
			@Override
			public Adapter caseZeit_Bearbeitungsvermerk_TypeClass(Zeit_Bearbeitungsvermerk_TypeClass object) {
				return createZeit_Bearbeitungsvermerk_TypeClassAdapter();
			}
			@Override
			public Adapter caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
				return createBasisAttribut_AttributeGroupAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Abstand_TypeClass <em>Abstand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Abstand_TypeClass
	 * @generated
	 */
	public Adapter createAbstand_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang <em>Anhang</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Anhang
	 * @generated
	 */
	public Adapter createAnhangAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup <em>Anhang Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createAnhang_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Art_TypeClass <em>Anhang Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Anhang_Art_TypeClass
	 * @generated
	 */
	public Adapter createAnhang_Art_TypeClassAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup <em>Basis Objekt Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBasis_Objekt_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk <em>Bearbeitungsvermerk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk
	 * @generated
	 */
	public Adapter createBearbeitungsvermerkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup <em>Bearbeitungsvermerk Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBearbeitungsvermerk_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Rolle_TypeClass <em>Bearbeitungsvermerk Rolle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Rolle_TypeClass
	 * @generated
	 */
	public Adapter createBearbeitungsvermerk_Rolle_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Begrenzung_A_TypeClass <em>Begrenzung AType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Begrenzung_A_TypeClass
	 * @generated
	 */
	public Adapter createBegrenzung_A_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Begrenzung_B_TypeClass <em>Begrenzung BType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Begrenzung_B_TypeClass
	 * @generated
	 */
	public Adapter createBegrenzung_B_TypeClassAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup <em>Bereich Objekt Teilbereich Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup
	 * @generated
	 */
	public Adapter createBereich_Objekt_Teilbereich_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Beschreibung_TypeClass <em>Beschreibung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Beschreibung_TypeClass
	 * @generated
	 */
	public Adapter createBeschreibung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bestandsrelevanz_TypeClass <em>Bestandsrelevanz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bestandsrelevanz_TypeClass
	 * @generated
	 */
	public Adapter createBestandsrelevanz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bestandsschutz_TypeClass <em>Bestandsschutz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bestandsschutz_TypeClass
	 * @generated
	 */
	public Adapter createBestandsschutz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.BV_Darstellung_In_Plan_TypeClass <em>BV Darstellung In Plan Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BV_Darstellung_In_Plan_TypeClass
	 * @generated
	 */
	public Adapter createBV_Darstellung_In_Plan_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.BV_Kategorie_TypeClass <em>BV Kategorie Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BV_Kategorie_TypeClass
	 * @generated
	 */
	public Adapter createBV_Kategorie_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Dateiname_TypeClass <em>Dateiname Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Dateiname_TypeClass
	 * @generated
	 */
	public Adapter createDateiname_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Dateityp_TypeClass <em>Dateityp Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Dateityp_TypeClass
	 * @generated
	 */
	public Adapter createDateityp_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Datum_Regelwerk_TypeClass <em>Datum Regelwerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Datum_Regelwerk_TypeClass
	 * @generated
	 */
	public Adapter createDatum_Regelwerk_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.DB_GDI_Referenz_TypeClass <em>DB GDI Referenz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.DB_GDI_Referenz_TypeClass
	 * @generated
	 */
	public Adapter createDB_GDI_Referenz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Identitaet_TypeClass <em>Identitaet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Identitaet_TypeClass
	 * @generated
	 */
	public Adapter createIdentitaet_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Km_Massgebend_TypeClass <em>Km Massgebend Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Km_Massgebend_TypeClass
	 * @generated
	 */
	public Adapter createKm_Massgebend_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Kommentar_TypeClass <em>Kommentar Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Kommentar_TypeClass
	 * @generated
	 */
	public Adapter createKommentar_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Kurztext_TypeClass <em>Kurztext Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Kurztext_TypeClass
	 * @generated
	 */
	public Adapter createKurztext_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt <em>Lieferobjekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt
	 * @generated
	 */
	public Adapter createLieferobjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Ausgabestand_TypeClass <em>LO Ausgabestand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Ausgabestand_TypeClass
	 * @generated
	 */
	public Adapter createLO_Ausgabestand_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Datum_Herstellung_TypeClass <em>LO Datum Herstellung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Datum_Herstellung_TypeClass
	 * @generated
	 */
	public Adapter createLO_Datum_Herstellung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_DB_Freigabe_TypeClass <em>LO DB Freigabe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_DB_Freigabe_TypeClass
	 * @generated
	 */
	public Adapter createLO_DB_Freigabe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_EMA_Nr_TypeClass <em>LO EMA Nr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_EMA_Nr_TypeClass
	 * @generated
	 */
	public Adapter createLO_EMA_Nr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Ersatz_TypeClass <em>LO Ersatz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Ersatz_TypeClass
	 * @generated
	 */
	public Adapter createLO_Ersatz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Firmensachnummer_TypeClass <em>LO Firmensachnummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Firmensachnummer_TypeClass
	 * @generated
	 */
	public Adapter createLO_Firmensachnummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup <em>LO Material Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup
	 * @generated
	 */
	public Adapter createLO_Material_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Seriennummer_TypeClass <em>LO Seriennummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Seriennummer_TypeClass
	 * @generated
	 */
	public Adapter createLO_Seriennummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.LST_Objekt_Art_TypeClass <em>LST Objekt Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LST_Objekt_Art_TypeClass
	 * @generated
	 */
	public Adapter createLST_Objekt_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Objektreferenzen_AttributeGroup <em>Objektreferenzen Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Objektreferenzen_AttributeGroup
	 * @generated
	 */
	public Adapter createObjektreferenzen_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Objektzustand_Besonders_TypeClass <em>Objektzustand Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Objektzustand_Besonders_TypeClass
	 * @generated
	 */
	public Adapter createObjektzustand_Besonders_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Proxy_Objekt <em>Proxy Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Proxy_Objekt
	 * @generated
	 */
	public Adapter createProxy_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt <em>Punkt Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt
	 * @generated
	 */
	public Adapter createPunkt_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup <em>Punkt Objekt Strecke Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup
	 * @generated
	 */
	public Adapter createPunkt_Objekt_Strecke_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup <em>Punkt Objekt TOP Kante Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup
	 * @generated
	 */
	public Adapter createPunkt_Objekt_TOP_Kante_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Richtungsbezug_TypeClass <em>Richtungsbezug Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Richtungsbezug_TypeClass
	 * @generated
	 */
	public Adapter createRichtungsbezug_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Seitliche_Lage_TypeClass <em>Seitliche Lage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Seitliche_Lage_TypeClass
	 * @generated
	 */
	public Adapter createSeitliche_Lage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Seitlicher_Abstand_TypeClass <em>Seitlicher Abstand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Seitlicher_Abstand_TypeClass
	 * @generated
	 */
	public Adapter createSeitlicher_Abstand_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Strecke_Km_TypeClass <em>Strecke Km Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Strecke_Km_TypeClass
	 * @generated
	 */
	public Adapter createStrecke_Km_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Technischer_Platz_TypeClass <em>Technischer Platz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Technischer_Platz_TypeClass
	 * @generated
	 */
	public Adapter createTechnischer_Platz_TypeClassAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Wirkrichtung_TypeClass <em>Wirkrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Wirkrichtung_TypeClass
	 * @generated
	 */
	public Adapter createWirkrichtung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Zeit_Bearbeitungsvermerk_TypeClass <em>Zeit Bearbeitungsvermerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Zeit_Bearbeitungsvermerk_TypeClass
	 * @generated
	 */
	public Adapter createZeit_Bearbeitungsvermerk_TypeClassAdapter() {
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

} //BasisobjekteAdapterFactory
