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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.*;

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
 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage
 * @generated
 */
public class BasisobjekteSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasisobjektePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisobjekteSwitch() {
		if (modelPackage == null) {
			modelPackage = BasisobjektePackage.eINSTANCE;
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
			case BasisobjektePackage.ABSTAND_TYPE_CLASS: {
				Abstand_TypeClass abstand_TypeClass = (Abstand_TypeClass)theEObject;
				T result = caseAbstand_TypeClass(abstand_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(abstand_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.ANHANG: {
				Anhang anhang = (Anhang)theEObject;
				T result = caseAnhang(anhang);
				if (result == null) result = caseUr_Objekt(anhang);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP: {
				Anhang_Allg_AttributeGroup anhang_Allg_AttributeGroup = (Anhang_Allg_AttributeGroup)theEObject;
				T result = caseAnhang_Allg_AttributeGroup(anhang_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.ANHANG_ART_TYPE_CLASS: {
				Anhang_Art_TypeClass anhang_Art_TypeClass = (Anhang_Art_TypeClass)theEObject;
				T result = caseAnhang_Art_TypeClass(anhang_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(anhang_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BASIS_OBJEKT: {
				Basis_Objekt basis_Objekt = (Basis_Objekt)theEObject;
				T result = caseBasis_Objekt(basis_Objekt);
				if (result == null) result = caseUr_Objekt(basis_Objekt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP: {
				Basis_Objekt_Allg_AttributeGroup basis_Objekt_Allg_AttributeGroup = (Basis_Objekt_Allg_AttributeGroup)theEObject;
				T result = caseBasis_Objekt_Allg_AttributeGroup(basis_Objekt_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BEARBEITUNGSVERMERK: {
				Bearbeitungsvermerk bearbeitungsvermerk = (Bearbeitungsvermerk)theEObject;
				T result = caseBearbeitungsvermerk(bearbeitungsvermerk);
				if (result == null) result = caseUr_Objekt(bearbeitungsvermerk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP: {
				Bearbeitungsvermerk_Allg_AttributeGroup bearbeitungsvermerk_Allg_AttributeGroup = (Bearbeitungsvermerk_Allg_AttributeGroup)theEObject;
				T result = caseBearbeitungsvermerk_Allg_AttributeGroup(bearbeitungsvermerk_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ROLLE_TYPE_CLASS: {
				Bearbeitungsvermerk_Rolle_TypeClass bearbeitungsvermerk_Rolle_TypeClass = (Bearbeitungsvermerk_Rolle_TypeClass)theEObject;
				T result = caseBearbeitungsvermerk_Rolle_TypeClass(bearbeitungsvermerk_Rolle_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bearbeitungsvermerk_Rolle_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BEGRENZUNG_ATYPE_CLASS: {
				Begrenzung_A_TypeClass begrenzung_A_TypeClass = (Begrenzung_A_TypeClass)theEObject;
				T result = caseBegrenzung_A_TypeClass(begrenzung_A_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(begrenzung_A_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BEGRENZUNG_BTYPE_CLASS: {
				Begrenzung_B_TypeClass begrenzung_B_TypeClass = (Begrenzung_B_TypeClass)theEObject;
				T result = caseBegrenzung_B_TypeClass(begrenzung_B_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(begrenzung_B_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BEREICH_OBJEKT: {
				Bereich_Objekt bereich_Objekt = (Bereich_Objekt)theEObject;
				T result = caseBereich_Objekt(bereich_Objekt);
				if (result == null) result = caseBasis_Objekt(bereich_Objekt);
				if (result == null) result = caseUr_Objekt(bereich_Objekt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP: {
				Bereich_Objekt_Teilbereich_AttributeGroup bereich_Objekt_Teilbereich_AttributeGroup = (Bereich_Objekt_Teilbereich_AttributeGroup)theEObject;
				T result = caseBereich_Objekt_Teilbereich_AttributeGroup(bereich_Objekt_Teilbereich_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BESCHREIBUNG_TYPE_CLASS: {
				Beschreibung_TypeClass beschreibung_TypeClass = (Beschreibung_TypeClass)theEObject;
				T result = caseBeschreibung_TypeClass(beschreibung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(beschreibung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BESTANDSRELEVANZ_TYPE_CLASS: {
				Bestandsrelevanz_TypeClass bestandsrelevanz_TypeClass = (Bestandsrelevanz_TypeClass)theEObject;
				T result = caseBestandsrelevanz_TypeClass(bestandsrelevanz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bestandsrelevanz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BESTANDSSCHUTZ_TYPE_CLASS: {
				Bestandsschutz_TypeClass bestandsschutz_TypeClass = (Bestandsschutz_TypeClass)theEObject;
				T result = caseBestandsschutz_TypeClass(bestandsschutz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bestandsschutz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BV_DARSTELLUNG_IN_PLAN_TYPE_CLASS: {
				BV_Darstellung_In_Plan_TypeClass bV_Darstellung_In_Plan_TypeClass = (BV_Darstellung_In_Plan_TypeClass)theEObject;
				T result = caseBV_Darstellung_In_Plan_TypeClass(bV_Darstellung_In_Plan_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bV_Darstellung_In_Plan_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.BV_KATEGORIE_TYPE_CLASS: {
				BV_Kategorie_TypeClass bV_Kategorie_TypeClass = (BV_Kategorie_TypeClass)theEObject;
				T result = caseBV_Kategorie_TypeClass(bV_Kategorie_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bV_Kategorie_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.DATEINAME_TYPE_CLASS: {
				Dateiname_TypeClass dateiname_TypeClass = (Dateiname_TypeClass)theEObject;
				T result = caseDateiname_TypeClass(dateiname_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dateiname_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.DATEITYP_TYPE_CLASS: {
				Dateityp_TypeClass dateityp_TypeClass = (Dateityp_TypeClass)theEObject;
				T result = caseDateityp_TypeClass(dateityp_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dateityp_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.DATUM_REGELWERK_TYPE_CLASS: {
				Datum_Regelwerk_TypeClass datum_Regelwerk_TypeClass = (Datum_Regelwerk_TypeClass)theEObject;
				T result = caseDatum_Regelwerk_TypeClass(datum_Regelwerk_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(datum_Regelwerk_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.DB_GDI_REFERENZ_TYPE_CLASS: {
				DB_GDI_Referenz_TypeClass dB_GDI_Referenz_TypeClass = (DB_GDI_Referenz_TypeClass)theEObject;
				T result = caseDB_GDI_Referenz_TypeClass(dB_GDI_Referenz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dB_GDI_Referenz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.IDENTITAET_TYPE_CLASS: {
				Identitaet_TypeClass identitaet_TypeClass = (Identitaet_TypeClass)theEObject;
				T result = caseIdentitaet_TypeClass(identitaet_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(identitaet_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.KM_MASSGEBEND_TYPE_CLASS: {
				Km_Massgebend_TypeClass km_Massgebend_TypeClass = (Km_Massgebend_TypeClass)theEObject;
				T result = caseKm_Massgebend_TypeClass(km_Massgebend_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(km_Massgebend_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.KOMMENTAR_TYPE_CLASS: {
				Kommentar_TypeClass kommentar_TypeClass = (Kommentar_TypeClass)theEObject;
				T result = caseKommentar_TypeClass(kommentar_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kommentar_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.KURZTEXT_TYPE_CLASS: {
				Kurztext_TypeClass kurztext_TypeClass = (Kurztext_TypeClass)theEObject;
				T result = caseKurztext_TypeClass(kurztext_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kurztext_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.LIEFEROBJEKT: {
				Lieferobjekt lieferobjekt = (Lieferobjekt)theEObject;
				T result = caseLieferobjekt(lieferobjekt);
				if (result == null) result = caseBasis_Objekt(lieferobjekt);
				if (result == null) result = caseUr_Objekt(lieferobjekt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.LO_AUSGABESTAND_TYPE_CLASS: {
				LO_Ausgabestand_TypeClass lO_Ausgabestand_TypeClass = (LO_Ausgabestand_TypeClass)theEObject;
				T result = caseLO_Ausgabestand_TypeClass(lO_Ausgabestand_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lO_Ausgabestand_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.LO_DATUM_HERSTELLUNG_TYPE_CLASS: {
				LO_Datum_Herstellung_TypeClass lO_Datum_Herstellung_TypeClass = (LO_Datum_Herstellung_TypeClass)theEObject;
				T result = caseLO_Datum_Herstellung_TypeClass(lO_Datum_Herstellung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lO_Datum_Herstellung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.LO_DB_FREIGABE_TYPE_CLASS: {
				LO_DB_Freigabe_TypeClass lO_DB_Freigabe_TypeClass = (LO_DB_Freigabe_TypeClass)theEObject;
				T result = caseLO_DB_Freigabe_TypeClass(lO_DB_Freigabe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lO_DB_Freigabe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.LO_EMA_NR_TYPE_CLASS: {
				LO_EMA_Nr_TypeClass lO_EMA_Nr_TypeClass = (LO_EMA_Nr_TypeClass)theEObject;
				T result = caseLO_EMA_Nr_TypeClass(lO_EMA_Nr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lO_EMA_Nr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.LO_ERSATZ_TYPE_CLASS: {
				LO_Ersatz_TypeClass lO_Ersatz_TypeClass = (LO_Ersatz_TypeClass)theEObject;
				T result = caseLO_Ersatz_TypeClass(lO_Ersatz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lO_Ersatz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.LO_FIRMENSACHNUMMER_TYPE_CLASS: {
				LO_Firmensachnummer_TypeClass lO_Firmensachnummer_TypeClass = (LO_Firmensachnummer_TypeClass)theEObject;
				T result = caseLO_Firmensachnummer_TypeClass(lO_Firmensachnummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lO_Firmensachnummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP: {
				LO_Material_AttributeGroup lO_Material_AttributeGroup = (LO_Material_AttributeGroup)theEObject;
				T result = caseLO_Material_AttributeGroup(lO_Material_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.LO_SERIENNUMMER_TYPE_CLASS: {
				LO_Seriennummer_TypeClass lO_Seriennummer_TypeClass = (LO_Seriennummer_TypeClass)theEObject;
				T result = caseLO_Seriennummer_TypeClass(lO_Seriennummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lO_Seriennummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.LST_OBJEKT_ART_TYPE_CLASS: {
				LST_Objekt_Art_TypeClass lsT_Objekt_Art_TypeClass = (LST_Objekt_Art_TypeClass)theEObject;
				T result = caseLST_Objekt_Art_TypeClass(lsT_Objekt_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lsT_Objekt_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP: {
				Objektreferenzen_AttributeGroup objektreferenzen_AttributeGroup = (Objektreferenzen_AttributeGroup)theEObject;
				T result = caseObjektreferenzen_AttributeGroup(objektreferenzen_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.OBJEKTZUSTAND_BESONDERS_TYPE_CLASS: {
				Objektzustand_Besonders_TypeClass objektzustand_Besonders_TypeClass = (Objektzustand_Besonders_TypeClass)theEObject;
				T result = caseObjektzustand_Besonders_TypeClass(objektzustand_Besonders_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(objektzustand_Besonders_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.PROXY_OBJEKT: {
				Proxy_Objekt proxy_Objekt = (Proxy_Objekt)theEObject;
				T result = caseProxy_Objekt(proxy_Objekt);
				if (result == null) result = caseUr_Objekt(proxy_Objekt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.PUNKT_OBJEKT: {
				Punkt_Objekt punkt_Objekt = (Punkt_Objekt)theEObject;
				T result = casePunkt_Objekt(punkt_Objekt);
				if (result == null) result = caseBasis_Objekt(punkt_Objekt);
				if (result == null) result = caseUr_Objekt(punkt_Objekt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP: {
				Punkt_Objekt_Strecke_AttributeGroup punkt_Objekt_Strecke_AttributeGroup = (Punkt_Objekt_Strecke_AttributeGroup)theEObject;
				T result = casePunkt_Objekt_Strecke_AttributeGroup(punkt_Objekt_Strecke_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP: {
				Punkt_Objekt_TOP_Kante_AttributeGroup punkt_Objekt_TOP_Kante_AttributeGroup = (Punkt_Objekt_TOP_Kante_AttributeGroup)theEObject;
				T result = casePunkt_Objekt_TOP_Kante_AttributeGroup(punkt_Objekt_TOP_Kante_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.RICHTUNGSBEZUG_TYPE_CLASS: {
				Richtungsbezug_TypeClass richtungsbezug_TypeClass = (Richtungsbezug_TypeClass)theEObject;
				T result = caseRichtungsbezug_TypeClass(richtungsbezug_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(richtungsbezug_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.SEITLICHE_LAGE_TYPE_CLASS: {
				Seitliche_Lage_TypeClass seitliche_Lage_TypeClass = (Seitliche_Lage_TypeClass)theEObject;
				T result = caseSeitliche_Lage_TypeClass(seitliche_Lage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(seitliche_Lage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.SEITLICHER_ABSTAND_TYPE_CLASS: {
				Seitlicher_Abstand_TypeClass seitlicher_Abstand_TypeClass = (Seitlicher_Abstand_TypeClass)theEObject;
				T result = caseSeitlicher_Abstand_TypeClass(seitlicher_Abstand_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(seitlicher_Abstand_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.STRECKE_KM_TYPE_CLASS: {
				Strecke_Km_TypeClass strecke_Km_TypeClass = (Strecke_Km_TypeClass)theEObject;
				T result = caseStrecke_Km_TypeClass(strecke_Km_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(strecke_Km_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.TECHNISCHER_PLATZ_TYPE_CLASS: {
				Technischer_Platz_TypeClass technischer_Platz_TypeClass = (Technischer_Platz_TypeClass)theEObject;
				T result = caseTechnischer_Platz_TypeClass(technischer_Platz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(technischer_Platz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.UR_OBJEKT: {
				Ur_Objekt ur_Objekt = (Ur_Objekt)theEObject;
				T result = caseUr_Objekt(ur_Objekt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.WIRKRICHTUNG_TYPE_CLASS: {
				Wirkrichtung_TypeClass wirkrichtung_TypeClass = (Wirkrichtung_TypeClass)theEObject;
				T result = caseWirkrichtung_TypeClass(wirkrichtung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(wirkrichtung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasisobjektePackage.ZEIT_BEARBEITUNGSVERMERK_TYPE_CLASS: {
				Zeit_Bearbeitungsvermerk_TypeClass zeit_Bearbeitungsvermerk_TypeClass = (Zeit_Bearbeitungsvermerk_TypeClass)theEObject;
				T result = caseZeit_Bearbeitungsvermerk_TypeClass(zeit_Bearbeitungsvermerk_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zeit_Bearbeitungsvermerk_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstand Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstand Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstand_TypeClass(Abstand_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anhang</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anhang</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnhang(Anhang object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anhang Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anhang Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnhang_Allg_AttributeGroup(Anhang_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anhang Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anhang Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnhang_Art_TypeClass(Anhang_Art_TypeClass object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Basis Objekt Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basis Objekt Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasis_Objekt_Allg_AttributeGroup(Basis_Objekt_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bearbeitungsvermerk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bearbeitungsvermerk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBearbeitungsvermerk(Bearbeitungsvermerk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bearbeitungsvermerk Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bearbeitungsvermerk Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBearbeitungsvermerk_Allg_AttributeGroup(Bearbeitungsvermerk_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bearbeitungsvermerk Rolle Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bearbeitungsvermerk Rolle Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBearbeitungsvermerk_Rolle_TypeClass(Bearbeitungsvermerk_Rolle_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Begrenzung AType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Begrenzung AType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBegrenzung_A_TypeClass(Begrenzung_A_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Begrenzung BType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Begrenzung BType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBegrenzung_B_TypeClass(Begrenzung_B_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bereich Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bereich Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBereich_Objekt(Bereich_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bereich Objekt Teilbereich Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bereich Objekt Teilbereich Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBereich_Objekt_Teilbereich_AttributeGroup(Bereich_Objekt_Teilbereich_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beschreibung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beschreibung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeschreibung_TypeClass(Beschreibung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bestandsrelevanz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bestandsrelevanz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBestandsrelevanz_TypeClass(Bestandsrelevanz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bestandsschutz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bestandsschutz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBestandsschutz_TypeClass(Bestandsschutz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BV Darstellung In Plan Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BV Darstellung In Plan Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBV_Darstellung_In_Plan_TypeClass(BV_Darstellung_In_Plan_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BV Kategorie Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BV Kategorie Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBV_Kategorie_TypeClass(BV_Kategorie_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dateiname Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dateiname Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateiname_TypeClass(Dateiname_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dateityp Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dateityp Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateityp_TypeClass(Dateityp_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datum Regelwerk Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datum Regelwerk Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatum_Regelwerk_TypeClass(Datum_Regelwerk_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB GDI Referenz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB GDI Referenz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDB_GDI_Referenz_TypeClass(DB_GDI_Referenz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identitaet Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identitaet Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentitaet_TypeClass(Identitaet_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Km Massgebend Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Km Massgebend Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKm_Massgebend_TypeClass(Km_Massgebend_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kommentar Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kommentar Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKommentar_TypeClass(Kommentar_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kurztext Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kurztext Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKurztext_TypeClass(Kurztext_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lieferobjekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lieferobjekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLieferobjekt(Lieferobjekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LO Ausgabestand Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LO Ausgabestand Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLO_Ausgabestand_TypeClass(LO_Ausgabestand_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LO Datum Herstellung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LO Datum Herstellung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLO_Datum_Herstellung_TypeClass(LO_Datum_Herstellung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LO DB Freigabe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LO DB Freigabe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLO_DB_Freigabe_TypeClass(LO_DB_Freigabe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LO EMA Nr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LO EMA Nr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLO_EMA_Nr_TypeClass(LO_EMA_Nr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LO Ersatz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LO Ersatz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLO_Ersatz_TypeClass(LO_Ersatz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LO Firmensachnummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LO Firmensachnummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLO_Firmensachnummer_TypeClass(LO_Firmensachnummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LO Material Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LO Material Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLO_Material_AttributeGroup(LO_Material_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LO Seriennummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LO Seriennummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLO_Seriennummer_TypeClass(LO_Seriennummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LST Objekt Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LST Objekt Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLST_Objekt_Art_TypeClass(LST_Objekt_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objektreferenzen Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objektreferenzen Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjektreferenzen_AttributeGroup(Objektreferenzen_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objektzustand Besonders Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objektzustand Besonders Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjektzustand_Besonders_TypeClass(Objektzustand_Besonders_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxy Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxy Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProxy_Objekt(Proxy_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Punkt Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Punkt Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePunkt_Objekt(Punkt_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Punkt Objekt Strecke Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Punkt Objekt Strecke Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePunkt_Objekt_Strecke_AttributeGroup(Punkt_Objekt_Strecke_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Punkt Objekt TOP Kante Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Punkt Objekt TOP Kante Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePunkt_Objekt_TOP_Kante_AttributeGroup(Punkt_Objekt_TOP_Kante_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Richtungsbezug Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Richtungsbezug Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichtungsbezug_TypeClass(Richtungsbezug_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seitliche Lage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seitliche Lage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeitliche_Lage_TypeClass(Seitliche_Lage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seitlicher Abstand Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seitlicher Abstand Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeitlicher_Abstand_TypeClass(Seitlicher_Abstand_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strecke Km Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strecke Km Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrecke_Km_TypeClass(Strecke_Km_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technischer Platz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technischer Platz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnischer_Platz_TypeClass(Technischer_Platz_TypeClass object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Wirkrichtung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wirkrichtung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWirkrichtung_TypeClass(Wirkrichtung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zeit Bearbeitungsvermerk Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zeit Bearbeitungsvermerk Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZeit_Bearbeitungsvermerk_TypeClass(Zeit_Bearbeitungsvermerk_TypeClass object) {
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

} //BasisobjekteSwitch
