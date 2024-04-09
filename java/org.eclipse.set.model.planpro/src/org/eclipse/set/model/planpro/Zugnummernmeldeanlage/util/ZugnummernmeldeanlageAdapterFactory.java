/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage
 * @generated
 */
public class ZugnummernmeldeanlageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ZugnummernmeldeanlagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZugnummernmeldeanlageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ZugnummernmeldeanlagePackage.eINSTANCE;
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
	protected ZugnummernmeldeanlageSwitch<Adapter> modelSwitch =
		new ZugnummernmeldeanlageSwitch<Adapter>() {
			@Override
			public Adapter caseAkustikdauer_Anb_Ann_TypeClass(Akustikdauer_Anb_Ann_TypeClass object) {
				return createAkustikdauer_Anb_Ann_TypeClassAdapter();
			}
			@Override
			public Adapter caseAkustikdauer_Sonst_TypeClass(Akustikdauer_Sonst_TypeClass object) {
				return createAkustikdauer_Sonst_TypeClassAdapter();
			}
			@Override
			public Adapter caseAkustikdauer_Voranz_TypeClass(Akustikdauer_Voranz_TypeClass object) {
				return createAkustikdauer_Voranz_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnschlussnummer_TypeClass(Anschlussnummer_TypeClass object) {
				return createAnschlussnummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseAusfahrdruck_Gegengleis_TypeClass(Ausfahrdruck_Gegengleis_TypeClass object) {
				return createAusfahrdruck_Gegengleis_TypeClassAdapter();
			}
			@Override
			public Adapter caseAusfahrdruck_TypeClass(Ausfahrdruck_TypeClass object) {
				return createAusfahrdruck_TypeClassAdapter();
			}
			@Override
			public Adapter caseBedienbarkeit_Anzeigefeld_TypeClass(Bedienbarkeit_Anzeigefeld_TypeClass object) {
				return createBedienbarkeit_Anzeigefeld_TypeClassAdapter();
			}
			@Override
			public Adapter caseBesonderes_Schaltkriterium_TypeClass(Besonderes_Schaltkriterium_TypeClass object) {
				return createBesonderes_Schaltkriterium_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Besondere_Anlage_TypeClass(Bezeichnung_Besondere_Anlage_TypeClass object) {
				return createBezeichnung_Besondere_Anlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseBf_Kennung_TypeClass(Bf_Kennung_TypeClass object) {
				return createBf_Kennung_TypeClassAdapter();
			}
			@Override
			public Adapter caseBf_Nr_ANB_TypeClass(Bf_Nr_ANB_TypeClass object) {
				return createBf_Nr_ANB_TypeClassAdapter();
			}
			@Override
			public Adapter caseBf_Nr_TypeClass(Bf_Nr_TypeClass object) {
				return createBf_Nr_TypeClassAdapter();
			}
			@Override
			public Adapter caseBf_Nr_ZN_A_TypeClass(Bf_Nr_ZN_A_TypeClass object) {
				return createBf_Nr_ZN_A_TypeClassAdapter();
			}
			@Override
			public Adapter caseDurchfahrdruck_TypeClass(Durchfahrdruck_TypeClass object) {
				return createDurchfahrdruck_TypeClassAdapter();
			}
			@Override
			public Adapter caseEinfahrdruck_Gegengleis_TypeClass(Einfahrdruck_Gegengleis_TypeClass object) {
				return createEinfahrdruck_Gegengleis_TypeClassAdapter();
			}
			@Override
			public Adapter caseEinfahrdruck_TypeClass(Einfahrdruck_TypeClass object) {
				return createEinfahrdruck_TypeClassAdapter();
			}
			@Override
			public Adapter caseEinwahlstelle_TypeClass(Einwahlstelle_TypeClass object) {
				return createEinwahlstelle_TypeClassAdapter();
			}
			@Override
			public Adapter caseFunktionalitaet_Anzeigefeld_TypeClass(Funktionalitaet_Anzeigefeld_TypeClass object) {
				return createFunktionalitaet_Anzeigefeld_TypeClassAdapter();
			}
			@Override
			public Adapter caseHOA_TypeClass(HOA_TypeClass object) {
				return createHOA_TypeClassAdapter();
			}
			@Override
			public Adapter caseIP_Adresse_TypeClass(IP_Adresse_TypeClass object) {
				return createIP_Adresse_TypeClassAdapter();
			}
			@Override
			public Adapter caseKoppelunterstation_TypeClass(Koppelunterstation_TypeClass object) {
				return createKoppelunterstation_TypeClassAdapter();
			}
			@Override
			public Adapter caseKUs_Zeittelegramm_TypeClass(KUs_Zeittelegramm_TypeClass object) {
				return createKUs_Zeittelegramm_TypeClassAdapter();
			}
			@Override
			public Adapter caseMeldedruck_TypeClass(Meldedruck_TypeClass object) {
				return createMeldedruck_TypeClassAdapter();
			}
			@Override
			public Adapter casePrioritaet_TypeClass(Prioritaet_TypeClass object) {
				return createPrioritaet_TypeClassAdapter();
			}
			@Override
			public Adapter caseReaktivierungsfunktion_TypeClass(Reaktivierungsfunktion_TypeClass object) {
				return createReaktivierungsfunktion_TypeClassAdapter();
			}
			@Override
			public Adapter caseSichtbarkeit_Anzeigefeld_TypeClass(Sichtbarkeit_Anzeigefeld_TypeClass object) {
				return createSichtbarkeit_Anzeigefeld_TypeClassAdapter();
			}
			@Override
			public Adapter caseTelegramm_02_TypeClass(Telegramm_02_TypeClass object) {
				return createTelegramm_02_TypeClassAdapter();
			}
			@Override
			public Adapter caseTelegramm_03_TypeClass(Telegramm_03_TypeClass object) {
				return createTelegramm_03_TypeClassAdapter();
			}
			@Override
			public Adapter caseTelegramm_04_TypeClass(Telegramm_04_TypeClass object) {
				return createTelegramm_04_TypeClassAdapter();
			}
			@Override
			public Adapter caseTelegramm_10_TypeClass(Telegramm_10_TypeClass object) {
				return createTelegramm_10_TypeClassAdapter();
			}
			@Override
			public Adapter caseTelegramm_21_TypeClass(Telegramm_21_TypeClass object) {
				return createTelegramm_21_TypeClassAdapter();
			}
			@Override
			public Adapter caseTelegramm_30_TypeClass(Telegramm_30_TypeClass object) {
				return createTelegramm_30_TypeClassAdapter();
			}
			@Override
			public Adapter caseTelegramm_84_Alle_Fstr_AttributeGroup(Telegramm_84_Alle_Fstr_AttributeGroup object) {
				return createTelegramm_84_Alle_Fstr_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseTelegramm_84_Einzelne_Fstr_AttributeGroup(Telegramm_84_Einzelne_Fstr_AttributeGroup object) {
				return createTelegramm_84_Einzelne_Fstr_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseTelegramm_84_Fuer_Alle_Fstr_TypeClass(Telegramm_84_Fuer_Alle_Fstr_TypeClass object) {
				return createTelegramm_84_Fuer_Alle_Fstr_TypeClassAdapter();
			}
			@Override
			public Adapter caseTelegramm_84_Verzicht_TypeClass(Telegramm_84_Verzicht_TypeClass object) {
				return createTelegramm_84_Verzicht_TypeClassAdapter();
			}
			@Override
			public Adapter caseTelegramm_85_Alle_Fstr_AttributeGroup(Telegramm_85_Alle_Fstr_AttributeGroup object) {
				return createTelegramm_85_Alle_Fstr_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseTelegramm_85_Einzelne_Fstr_AttributeGroup(Telegramm_85_Einzelne_Fstr_AttributeGroup object) {
				return createTelegramm_85_Einzelne_Fstr_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseTelegramm_85_Fuer_Alle_Fstr_TypeClass(Telegramm_85_Fuer_Alle_Fstr_TypeClass object) {
				return createTelegramm_85_Fuer_Alle_Fstr_TypeClassAdapter();
			}
			@Override
			public Adapter caseTelegrammwiederholung_TypeClass(Telegrammwiederholung_TypeClass object) {
				return createTelegrammwiederholung_TypeClassAdapter();
			}
			@Override
			public Adapter caseUnterstation_Max_TypeClass(Unterstation_Max_TypeClass object) {
				return createUnterstation_Max_TypeClassAdapter();
			}
			@Override
			public Adapter caseUnterstation_Nr_TypeClass(Unterstation_Nr_TypeClass object) {
				return createUnterstation_Nr_TypeClassAdapter();
			}
			@Override
			public Adapter caseVerzoegerung_Manuell_Loeschung_TypeClass(Verzoegerung_Manuell_Loeschung_TypeClass object) {
				return createVerzoegerung_Manuell_Loeschung_TypeClassAdapter();
			}
			@Override
			public Adapter caseVormeldestart_TypeClass(Vormeldestart_TypeClass object) {
				return createVormeldestart_TypeClassAdapter();
			}
			@Override
			public Adapter caseZBS_Adresse_TypeClass(ZBS_Adresse_TypeClass object) {
				return createZBS_Adresse_TypeClassAdapter();
			}
			@Override
			public Adapter caseZBS_Anbindung_TypeClass(ZBS_Anbindung_TypeClass object) {
				return createZBS_Anbindung_TypeClassAdapter();
			}
			@Override
			public Adapter caseZBS_Schnittstelle_TypeClass(ZBS_Schnittstelle_TypeClass object) {
				return createZBS_Schnittstelle_TypeClassAdapter();
			}
			@Override
			public Adapter caseZeitsynchronisation_Funkuhr_TypeClass(Zeitsynchronisation_Funkuhr_TypeClass object) {
				return createZeitsynchronisation_Funkuhr_TypeClassAdapter();
			}
			@Override
			public Adapter caseZLV_Bus(ZLV_Bus object) {
				return createZLV_BusAdapter();
			}
			@Override
			public Adapter caseZLV_Bus_Allg_AttributeGroup(ZLV_Bus_Allg_AttributeGroup object) {
				return createZLV_Bus_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZLV_Bus_Besondere_Anlage(ZLV_Bus_Besondere_Anlage object) {
				return createZLV_Bus_Besondere_AnlageAdapter();
			}
			@Override
			public Adapter caseZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup(ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup object) {
				return createZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZLV_Bus_Bezeichnung_AttributeGroup(ZLV_Bus_Bezeichnung_AttributeGroup object) {
				return createZLV_Bus_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZLV_Bus_Nr_TypeClass(ZLV_Bus_Nr_TypeClass object) {
				return createZLV_Bus_Nr_TypeClassAdapter();
			}
			@Override
			public Adapter caseZLV_Bus_US_Zuordnung(ZLV_Bus_US_Zuordnung object) {
				return createZLV_Bus_US_ZuordnungAdapter();
			}
			@Override
			public Adapter caseZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup(ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup object) {
				return createZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZLV_Bus_Zuordnung_Allg_AttributeGroup(ZLV_Bus_Zuordnung_Allg_AttributeGroup object) {
				return createZLV_Bus_Zuordnung_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZN(ZN object) {
				return createZNAdapter();
			}
			@Override
			public Adapter caseZN_A_Bedienbezeichner_Frei_TypeClass(ZN_A_Bedienbezeichner_Frei_TypeClass object) {
				return createZN_A_Bedienbezeichner_Frei_TypeClassAdapter();
			}
			@Override
			public Adapter caseZN_A_Bezeichner_TypeClass(ZN_A_Bezeichner_TypeClass object) {
				return createZN_A_Bezeichner_TypeClassAdapter();
			}
			@Override
			public Adapter caseZN_Akustik(ZN_Akustik object) {
				return createZN_AkustikAdapter();
			}
			@Override
			public Adapter caseZN_Akustik_Anzeigefeld_AttributeGroup(ZN_Akustik_Anzeigefeld_AttributeGroup object) {
				return createZN_Akustik_Anzeigefeld_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZN_Allg_AttributeGroup(ZN_Allg_AttributeGroup object) {
				return createZN_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZN_Anlagentyp_TypeClass(ZN_Anlagentyp_TypeClass object) {
				return createZN_Anlagentyp_TypeClassAdapter();
			}
			@Override
			public Adapter caseZN_Anzeigefeld(ZN_Anzeigefeld object) {
				return createZN_AnzeigefeldAdapter();
			}
			@Override
			public Adapter caseZN_Anzeigefeld_Allg_AttributeGroup(ZN_Anzeigefeld_Allg_AttributeGroup object) {
				return createZN_Anzeigefeld_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZN_Anzeigefeld_Bezeichnung_AttributeGroup(ZN_Anzeigefeld_Bezeichnung_AttributeGroup object) {
				return createZN_Anzeigefeld_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZN_Anzeigefeld_Loeschkriterium_TypeClass(ZN_Anzeigefeld_Loeschkriterium_TypeClass object) {
				return createZN_Anzeigefeld_Loeschkriterium_TypeClassAdapter();
			}
			@Override
			public Adapter caseZN_Feld_Ohne_Anzeige_TypeClass(ZN_Feld_Ohne_Anzeige_TypeClass object) {
				return createZN_Feld_Ohne_Anzeige_TypeClassAdapter();
			}
			@Override
			public Adapter caseZN_Fortschalt_Krit_Druck_AttributeGroup(ZN_Fortschalt_Krit_Druck_AttributeGroup object) {
				return createZN_Fortschalt_Krit_Druck_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZN_Fortschalt_Krit_Schalt_AttributeGroup(ZN_Fortschalt_Krit_Schalt_AttributeGroup object) {
				return createZN_Fortschalt_Krit_Schalt_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZN_Fortschalt_Kriterium(ZN_Fortschalt_Kriterium object) {
				return createZN_Fortschalt_KriteriumAdapter();
			}
			@Override
			public Adapter caseZN_Modem_TypeClass(ZN_Modem_TypeClass object) {
				return createZN_Modem_TypeClassAdapter();
			}
			@Override
			public Adapter caseZN_Schaltkriterium_TypeClass(ZN_Schaltkriterium_TypeClass object) {
				return createZN_Schaltkriterium_TypeClassAdapter();
			}
			@Override
			public Adapter caseZN_Telegramm_84_Zuordnung(ZN_Telegramm_84_Zuordnung object) {
				return createZN_Telegramm_84_ZuordnungAdapter();
			}
			@Override
			public Adapter caseZN_Telegramm_85_Zuordnung(ZN_Telegramm_85_Zuordnung object) {
				return createZN_Telegramm_85_ZuordnungAdapter();
			}
			@Override
			public Adapter caseZN_Unterstation(ZN_Unterstation object) {
				return createZN_UnterstationAdapter();
			}
			@Override
			public Adapter caseZN_Unterstation_Allg_AttributeGroup(ZN_Unterstation_Allg_AttributeGroup object) {
				return createZN_Unterstation_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZN_Unterstation_Bf_Nr_AttributeGroup(ZN_Unterstation_Bf_Nr_AttributeGroup object) {
				return createZN_Unterstation_Bf_Nr_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZN_ZBS(ZN_ZBS object) {
				return createZN_ZBSAdapter();
			}
			@Override
			public Adapter caseZugvorbereitungsmeldung_TypeClass(Zugvorbereitungsmeldung_TypeClass object) {
				return createZugvorbereitungsmeldung_TypeClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Akustikdauer_Anb_Ann_TypeClass <em>Akustikdauer Anb Ann Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Akustikdauer_Anb_Ann_TypeClass
	 * @generated
	 */
	public Adapter createAkustikdauer_Anb_Ann_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Akustikdauer_Sonst_TypeClass <em>Akustikdauer Sonst Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Akustikdauer_Sonst_TypeClass
	 * @generated
	 */
	public Adapter createAkustikdauer_Sonst_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Akustikdauer_Voranz_TypeClass <em>Akustikdauer Voranz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Akustikdauer_Voranz_TypeClass
	 * @generated
	 */
	public Adapter createAkustikdauer_Voranz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Anschlussnummer_TypeClass <em>Anschlussnummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Anschlussnummer_TypeClass
	 * @generated
	 */
	public Adapter createAnschlussnummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Ausfahrdruck_Gegengleis_TypeClass <em>Ausfahrdruck Gegengleis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Ausfahrdruck_Gegengleis_TypeClass
	 * @generated
	 */
	public Adapter createAusfahrdruck_Gegengleis_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Ausfahrdruck_TypeClass <em>Ausfahrdruck Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Ausfahrdruck_TypeClass
	 * @generated
	 */
	public Adapter createAusfahrdruck_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bedienbarkeit_Anzeigefeld_TypeClass <em>Bedienbarkeit Anzeigefeld Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bedienbarkeit_Anzeigefeld_TypeClass
	 * @generated
	 */
	public Adapter createBedienbarkeit_Anzeigefeld_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Besonderes_Schaltkriterium_TypeClass <em>Besonderes Schaltkriterium Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Besonderes_Schaltkriterium_TypeClass
	 * @generated
	 */
	public Adapter createBesonderes_Schaltkriterium_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bezeichnung_Besondere_Anlage_TypeClass <em>Bezeichnung Besondere Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bezeichnung_Besondere_Anlage_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Besondere_Anlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Kennung_TypeClass <em>Bf Kennung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Kennung_TypeClass
	 * @generated
	 */
	public Adapter createBf_Kennung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Nr_ANB_TypeClass <em>Bf Nr ANB Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Nr_ANB_TypeClass
	 * @generated
	 */
	public Adapter createBf_Nr_ANB_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Nr_TypeClass <em>Bf Nr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Nr_TypeClass
	 * @generated
	 */
	public Adapter createBf_Nr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Nr_ZN_A_TypeClass <em>Bf Nr ZN AType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Nr_ZN_A_TypeClass
	 * @generated
	 */
	public Adapter createBf_Nr_ZN_A_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Durchfahrdruck_TypeClass <em>Durchfahrdruck Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Durchfahrdruck_TypeClass
	 * @generated
	 */
	public Adapter createDurchfahrdruck_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Einfahrdruck_Gegengleis_TypeClass <em>Einfahrdruck Gegengleis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Einfahrdruck_Gegengleis_TypeClass
	 * @generated
	 */
	public Adapter createEinfahrdruck_Gegengleis_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Einfahrdruck_TypeClass <em>Einfahrdruck Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Einfahrdruck_TypeClass
	 * @generated
	 */
	public Adapter createEinfahrdruck_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Einwahlstelle_TypeClass <em>Einwahlstelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Einwahlstelle_TypeClass
	 * @generated
	 */
	public Adapter createEinwahlstelle_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Funktionalitaet_Anzeigefeld_TypeClass <em>Funktionalitaet Anzeigefeld Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Funktionalitaet_Anzeigefeld_TypeClass
	 * @generated
	 */
	public Adapter createFunktionalitaet_Anzeigefeld_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.HOA_TypeClass <em>HOA Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.HOA_TypeClass
	 * @generated
	 */
	public Adapter createHOA_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.IP_Adresse_TypeClass <em>IP Adresse Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.IP_Adresse_TypeClass
	 * @generated
	 */
	public Adapter createIP_Adresse_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Koppelunterstation_TypeClass <em>Koppelunterstation Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Koppelunterstation_TypeClass
	 * @generated
	 */
	public Adapter createKoppelunterstation_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.KUs_Zeittelegramm_TypeClass <em>KUs Zeittelegramm Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.KUs_Zeittelegramm_TypeClass
	 * @generated
	 */
	public Adapter createKUs_Zeittelegramm_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Meldedruck_TypeClass <em>Meldedruck Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Meldedruck_TypeClass
	 * @generated
	 */
	public Adapter createMeldedruck_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Prioritaet_TypeClass <em>Prioritaet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Prioritaet_TypeClass
	 * @generated
	 */
	public Adapter createPrioritaet_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Reaktivierungsfunktion_TypeClass <em>Reaktivierungsfunktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Reaktivierungsfunktion_TypeClass
	 * @generated
	 */
	public Adapter createReaktivierungsfunktion_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Sichtbarkeit_Anzeigefeld_TypeClass <em>Sichtbarkeit Anzeigefeld Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Sichtbarkeit_Anzeigefeld_TypeClass
	 * @generated
	 */
	public Adapter createSichtbarkeit_Anzeigefeld_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_02_TypeClass <em>Telegramm 02 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_02_TypeClass
	 * @generated
	 */
	public Adapter createTelegramm_02_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_03_TypeClass <em>Telegramm 03 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_03_TypeClass
	 * @generated
	 */
	public Adapter createTelegramm_03_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_04_TypeClass <em>Telegramm 04 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_04_TypeClass
	 * @generated
	 */
	public Adapter createTelegramm_04_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_10_TypeClass <em>Telegramm 10 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_10_TypeClass
	 * @generated
	 */
	public Adapter createTelegramm_10_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_21_TypeClass <em>Telegramm 21 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_21_TypeClass
	 * @generated
	 */
	public Adapter createTelegramm_21_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_30_TypeClass <em>Telegramm 30 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_30_TypeClass
	 * @generated
	 */
	public Adapter createTelegramm_30_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Alle_Fstr_AttributeGroup <em>Telegramm 84 Alle Fstr Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Alle_Fstr_AttributeGroup
	 * @generated
	 */
	public Adapter createTelegramm_84_Alle_Fstr_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Einzelne_Fstr_AttributeGroup <em>Telegramm 84 Einzelne Fstr Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Einzelne_Fstr_AttributeGroup
	 * @generated
	 */
	public Adapter createTelegramm_84_Einzelne_Fstr_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Fuer_Alle_Fstr_TypeClass <em>Telegramm 84 Fuer Alle Fstr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Fuer_Alle_Fstr_TypeClass
	 * @generated
	 */
	public Adapter createTelegramm_84_Fuer_Alle_Fstr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Verzicht_TypeClass <em>Telegramm 84 Verzicht Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Verzicht_TypeClass
	 * @generated
	 */
	public Adapter createTelegramm_84_Verzicht_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_85_Alle_Fstr_AttributeGroup <em>Telegramm 85 Alle Fstr Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_85_Alle_Fstr_AttributeGroup
	 * @generated
	 */
	public Adapter createTelegramm_85_Alle_Fstr_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_85_Einzelne_Fstr_AttributeGroup <em>Telegramm 85 Einzelne Fstr Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_85_Einzelne_Fstr_AttributeGroup
	 * @generated
	 */
	public Adapter createTelegramm_85_Einzelne_Fstr_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_85_Fuer_Alle_Fstr_TypeClass <em>Telegramm 85 Fuer Alle Fstr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_85_Fuer_Alle_Fstr_TypeClass
	 * @generated
	 */
	public Adapter createTelegramm_85_Fuer_Alle_Fstr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegrammwiederholung_TypeClass <em>Telegrammwiederholung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegrammwiederholung_TypeClass
	 * @generated
	 */
	public Adapter createTelegrammwiederholung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Unterstation_Max_TypeClass <em>Unterstation Max Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Unterstation_Max_TypeClass
	 * @generated
	 */
	public Adapter createUnterstation_Max_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Unterstation_Nr_TypeClass <em>Unterstation Nr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Unterstation_Nr_TypeClass
	 * @generated
	 */
	public Adapter createUnterstation_Nr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Verzoegerung_Manuell_Loeschung_TypeClass <em>Verzoegerung Manuell Loeschung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Verzoegerung_Manuell_Loeschung_TypeClass
	 * @generated
	 */
	public Adapter createVerzoegerung_Manuell_Loeschung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Vormeldestart_TypeClass <em>Vormeldestart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Vormeldestart_TypeClass
	 * @generated
	 */
	public Adapter createVormeldestart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZBS_Adresse_TypeClass <em>ZBS Adresse Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZBS_Adresse_TypeClass
	 * @generated
	 */
	public Adapter createZBS_Adresse_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZBS_Anbindung_TypeClass <em>ZBS Anbindung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZBS_Anbindung_TypeClass
	 * @generated
	 */
	public Adapter createZBS_Anbindung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZBS_Schnittstelle_TypeClass <em>ZBS Schnittstelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZBS_Schnittstelle_TypeClass
	 * @generated
	 */
	public Adapter createZBS_Schnittstelle_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Zeitsynchronisation_Funkuhr_TypeClass <em>Zeitsynchronisation Funkuhr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Zeitsynchronisation_Funkuhr_TypeClass
	 * @generated
	 */
	public Adapter createZeitsynchronisation_Funkuhr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus <em>ZLV Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus
	 * @generated
	 */
	public Adapter createZLV_BusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Allg_AttributeGroup <em>ZLV Bus Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createZLV_Bus_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage <em>ZLV Bus Besondere Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage
	 * @generated
	 */
	public Adapter createZLV_Bus_Besondere_AnlageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup <em>ZLV Bus Besondere Anlage Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Bezeichnung_AttributeGroup <em>ZLV Bus Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createZLV_Bus_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Nr_TypeClass <em>ZLV Bus Nr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Nr_TypeClass
	 * @generated
	 */
	public Adapter createZLV_Bus_Nr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung <em>ZLV Bus US Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung
	 * @generated
	 */
	public Adapter createZLV_Bus_US_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup <em>ZLV Bus US Zuordnung Telegramm Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup
	 * @generated
	 */
	public Adapter createZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Zuordnung_Allg_AttributeGroup <em>ZLV Bus Zuordnung Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Zuordnung_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createZLV_Bus_Zuordnung_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN <em>ZN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN
	 * @generated
	 */
	public Adapter createZNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_A_Bedienbezeichner_Frei_TypeClass <em>ZN ABedienbezeichner Frei Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_A_Bedienbezeichner_Frei_TypeClass
	 * @generated
	 */
	public Adapter createZN_A_Bedienbezeichner_Frei_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_A_Bezeichner_TypeClass <em>ZN ABezeichner Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_A_Bezeichner_TypeClass
	 * @generated
	 */
	public Adapter createZN_A_Bezeichner_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Akustik <em>ZN Akustik</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Akustik
	 * @generated
	 */
	public Adapter createZN_AkustikAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Akustik_Anzeigefeld_AttributeGroup <em>ZN Akustik Anzeigefeld Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Akustik_Anzeigefeld_AttributeGroup
	 * @generated
	 */
	public Adapter createZN_Akustik_Anzeigefeld_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Allg_AttributeGroup <em>ZN Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createZN_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anlagentyp_TypeClass <em>ZN Anlagentyp Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anlagentyp_TypeClass
	 * @generated
	 */
	public Adapter createZN_Anlagentyp_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld <em>ZN Anzeigefeld</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld
	 * @generated
	 */
	public Adapter createZN_AnzeigefeldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup <em>ZN Anzeigefeld Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createZN_Anzeigefeld_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld_Bezeichnung_AttributeGroup <em>ZN Anzeigefeld Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createZN_Anzeigefeld_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld_Loeschkriterium_TypeClass <em>ZN Anzeigefeld Loeschkriterium Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld_Loeschkriterium_TypeClass
	 * @generated
	 */
	public Adapter createZN_Anzeigefeld_Loeschkriterium_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Feld_Ohne_Anzeige_TypeClass <em>ZN Feld Ohne Anzeige Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Feld_Ohne_Anzeige_TypeClass
	 * @generated
	 */
	public Adapter createZN_Feld_Ohne_Anzeige_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup <em>ZN Fortschalt Krit Druck Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup
	 * @generated
	 */
	public Adapter createZN_Fortschalt_Krit_Druck_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup <em>ZN Fortschalt Krit Schalt Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup
	 * @generated
	 */
	public Adapter createZN_Fortschalt_Krit_Schalt_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium <em>ZN Fortschalt Kriterium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium
	 * @generated
	 */
	public Adapter createZN_Fortschalt_KriteriumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Modem_TypeClass <em>ZN Modem Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Modem_TypeClass
	 * @generated
	 */
	public Adapter createZN_Modem_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Schaltkriterium_TypeClass <em>ZN Schaltkriterium Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Schaltkriterium_TypeClass
	 * @generated
	 */
	public Adapter createZN_Schaltkriterium_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Telegramm_84_Zuordnung <em>ZN Telegramm 84 Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Telegramm_84_Zuordnung
	 * @generated
	 */
	public Adapter createZN_Telegramm_84_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung <em>ZN Telegramm 85 Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung
	 * @generated
	 */
	public Adapter createZN_Telegramm_85_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Unterstation <em>ZN Unterstation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Unterstation
	 * @generated
	 */
	public Adapter createZN_UnterstationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup <em>ZN Unterstation Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createZN_Unterstation_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Unterstation_Bf_Nr_AttributeGroup <em>ZN Unterstation Bf Nr Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Unterstation_Bf_Nr_AttributeGroup
	 * @generated
	 */
	public Adapter createZN_Unterstation_Bf_Nr_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_ZBS <em>ZN ZBS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_ZBS
	 * @generated
	 */
	public Adapter createZN_ZBSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Zugvorbereitungsmeldung_TypeClass <em>Zugvorbereitungsmeldung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Zugvorbereitungsmeldung_TypeClass
	 * @generated
	 */
	public Adapter createZugvorbereitungsmeldung_TypeClassAdapter() {
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

} //ZugnummernmeldeanlageAdapterFactory
