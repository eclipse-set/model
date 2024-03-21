/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.set.model.planpro.ATO.ATOPackage;

import org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl;

import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;

import org.eclipse.set.model.planpro.Ansteuerung_Element.impl.Ansteuerung_ElementPackageImpl;

import org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage;

import org.eclipse.set.model.planpro.Bahnsteig.impl.BahnsteigPackageImpl;

import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangFactory;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.planpro.Bahnuebergang.util.BahnuebergangValidator;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Balisentechnik_ETCSPackageImpl;

import org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.planpro.BasisTypen.impl.BasisTypenPackageImpl;

import org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage;

import org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl;

import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;

import org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl;

import org.eclipse.set.model.planpro.Block.BlockPackage;

import org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl;

import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;

import org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl;

import org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl;

import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;

import org.eclipse.set.model.planpro.Geodaten.impl.GeodatenPackageImpl;

import org.eclipse.set.model.planpro.Gleis.GleisPackage;

import org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl;

import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage;

import org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl;

import org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage;

import org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl;

import org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage;

import org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl;

import org.eclipse.set.model.planpro.Ortung.OrtungPackage;

import org.eclipse.set.model.planpro.Ortung.impl.OrtungPackageImpl;

import org.eclipse.set.model.planpro.PZB.PZBPackage;

import org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl;

import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;

import org.eclipse.set.model.planpro.PlanPro.impl.PlanProPackageImpl;

import org.eclipse.set.model.planpro.Regelzeichnung.RegelzeichnungPackage;

import org.eclipse.set.model.planpro.Regelzeichnung.impl.RegelzeichnungPackageImpl;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl;

import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package;

import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriffe_StrukturPackageImpl;

import org.eclipse.set.model.planpro.Signale.SignalePackage;

import org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl;

import org.eclipse.set.model.planpro.Verweise.VerweisePackage;

import org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl;

import org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage;

import org.eclipse.set.model.planpro.Zuglenkung.impl.ZuglenkungPackageImpl;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZugnummernmeldeanlagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BahnuebergangPackageImpl extends EPackageImpl implements BahnuebergangPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "Bahnuebergang.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstand_Gehweg_Fahrbahn_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass akustik_Fussgaenger_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ausrichtung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ausrichtung_Winkel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auto_Het_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baulast_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baumprofil_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beeinflussung_Strassenverkehr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bez_Schrankenantrieb_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_BUE_GFR_Eckpunkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_GFR_Element_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_GFR_Tripelspiegel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Verkehrszeichen_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blitzpfeil_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Abhaengigkeit_Fue_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_AnlageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Anlage_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Anlage_Fuss_Rad_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Anlage_StrasseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Anlage_Strasse_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Anlage_VEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Anlage_V_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_AusschaltungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Bauart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Bedien_Anz_Element_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Bedien_Anzeige_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Buestra_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Deckendes_Signal_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_EinschaltungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Einschaltung_Hp_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Einschaltung_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Funktionsueberwachung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Gefahrraum_EckpunktEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Gleisbezogener_GefahrraumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Handschalteinrichtung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_KanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_KreuzungsplanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Kreuzungsplan_Koordinaten_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Mit_GFR_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Nachlaufzeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Neigung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_SchnittstelleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Schnittstelle_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Sicherungsart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Sicherungszeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Spezifisches_SignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Strasse_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Technik_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Vorlaufzeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_WS_Fstr_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einschaltverz_Errechnet_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einschaltverz_Gewaehlt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ersatzstecker_Gleisbezogen_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fahrbahn_Befestigung_Gleis_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fahrbahn_Befestigung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fahrbahn_Breite_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fue_Schaltfall_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuss_Radweg_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuss_Radweg_Seite_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gfR_AnlageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gfR_Anlage_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gfR_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gfR_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gfR_Element_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gfR_Neigung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gfR_TripelspiegelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gfR_Tripelspiegel_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gfR_Tripelspiegel_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gfR_Typ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gitterbehang_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleis_Am_Bue_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass haltezeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hersteller_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hp_Ersatzstecker_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass klassifizierung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kontrastblende_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kreuzungswinkel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kurzzugschaltung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lagerung_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lfuE_Impuls_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lieferlaenge_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass montage_Ausgleichsgewichte_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass montage_Besonders_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass montagehoehe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optik_Durchmesser_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optik_Symbolmaske_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pegel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pixel_Koordinate_X_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pixel_Koordinate_Y_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raeumstrecke_DAB_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raeumstrecke_DBK_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raeumstrecke_DCK_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raeumstrecke_DSK_Strich_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raeumstrecke_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richtungspfeil_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sA_Schrankenbaum_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schaltgruppe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schaltmittel_Fstr_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schrankenantriebEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schrankenantrieb_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schrankenantrieb_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schutzbuegel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sicherheitsabstand_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalverz_Errechnet_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalverz_Gewaehlt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sperrlaenge_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sperrstrecke_Fussgaenger_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sperrstrecke_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stoerhalt_Haltfall_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stoerhalt_Merkhinweis_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teilsperrstrecke_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teilvorgabezeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tragkopf_Verstellbar_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Max_Schiene_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Max_Strasse_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Min_Fussweg_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Min_Schiene_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Min_Strasse_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verkehrszeichenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verkehrszeichen_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verkehrszeichen_Andreaskreuz_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verkehrszeichen_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verkehrszeichen_Lz_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vorgeschaltet_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vz_Sperrstrecke_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vz_Sperrstrecke_Schranke_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vz_Sperrstrecke_Vorgeschaltet_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass winkel_Alpha_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zeitueberschreitungsmeldung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zusatzschild_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBaumprofilEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumbueBauartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumbueFunktionsueberwachungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumbueHandschalteinrichtungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumbueSicherungsartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumbueTechnikEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumFueSchaltfallEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumFussRadwegArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumFussRadwegSeiteEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumgfrArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumHpErsatzsteckerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumKlassifizierungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLagerungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumlfueImpulsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumMontageAusgleichsgewichteEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumOptikSymbolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumRichtungspfeilEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abstand_Gehweg_Fahrbahn_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType akustik_Fussgaenger_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType akustik_Fussgaenger_TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ausrichtung_Winkel_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType baulast_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType beeinflussung_Strassenverkehr_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bez_Schrankenantrieb_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_BUE_GFR_Eckpunkt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_GFR_Element_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_GFR_Tripelspiegel_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Verkehrszeichen_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType blitzpfeil_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType blitzpfeil_TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buE_Nachlaufzeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buE_Neigung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buE_Sicherungszeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buE_Strasse_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buE_Vorlaufzeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType einschaltverz_Errechnet_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType einschaltverz_Gewaehlt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBaumprofilObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumbueBauartObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumbueFunktionsueberwachungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumbueHandschalteinrichtungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumbueSicherungsartObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumbueTechnikObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumFueSchaltfallObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumFussRadwegArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumFussRadwegSeiteObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumgfrArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumHpErsatzsteckerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumKlassifizierungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumLagerungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumlfueImpulsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumMontageAusgleichsgewichteObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumOptikSymbolObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumRichtungspfeilObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fahrbahn_Befestigung_Gleis_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fahrbahn_Befestigung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fahrbahn_Breite_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gfR_Neigung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gfR_Typ_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gleis_Am_Bue_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType haltezeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kontrastblende_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kontrastblende_TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kreuzungswinkel_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lieferlaenge_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType montage_Besonders_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType montagehoehe_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType optik_Durchmesser_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pegel_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pixel_Koordinate_X_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pixel_Koordinate_Y_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType raeumstrecke_DAB_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType raeumstrecke_DBK_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType raeumstrecke_DCK_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType raeumstrecke_DSK_Strich_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType raeumstrecke_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType schaltgruppe_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType schutzbuegel_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType schutzbuegel_TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sicherheitsabstand_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signalverz_Errechnet_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signalverz_Gewaehlt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sperrlaenge_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sperrstrecke_Fussgaenger_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sperrstrecke_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType teilsperrstrecke_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType teilvorgabezeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tragkopf_Verstellbar_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tragkopf_Verstellbar_TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType v_Max_Schiene_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType v_Max_Strasse_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType v_Min_Fussweg_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType v_Min_Schiene_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType v_Min_Strasse_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vorgeschaltet_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vorgeschaltet_TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType winkel_Alpha_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zeitueberschreitungsmeldung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zusatzschild_TypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BahnuebergangPackageImpl() {
		super(eNS_URI, BahnuebergangFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BahnuebergangPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static BahnuebergangPackage init() {
		if (isInited) return (BahnuebergangPackage)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBahnuebergangPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BahnuebergangPackageImpl theBahnuebergangPackage = registeredBahnuebergangPackage instanceof BahnuebergangPackageImpl ? (BahnuebergangPackageImpl)registeredBahnuebergangPackage : new BahnuebergangPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI);
		PlanProPackageImpl thePlanProPackage = (PlanProPackageImpl)(registeredPackage instanceof PlanProPackageImpl ? registeredPackage : PlanProPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		BasisobjektePackageImpl theBasisobjektePackage = (BasisobjektePackageImpl)(registeredPackage instanceof BasisobjektePackageImpl ? registeredPackage : BasisobjektePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisTypenPackage.eNS_URI);
		BasisTypenPackageImpl theBasisTypenPackage = (BasisTypenPackageImpl)(registeredPackage instanceof BasisTypenPackageImpl ? registeredPackage : BasisTypenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ATOPackage.eNS_URI);
		ATOPackageImpl theATOPackage = (ATOPackageImpl)(registeredPackage instanceof ATOPackageImpl ? registeredPackage : ATOPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);
		VerweisePackageImpl theVerweisePackage = (VerweisePackageImpl)(registeredPackage instanceof VerweisePackageImpl ? registeredPackage : VerweisePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ansteuerung_ElementPackage.eNS_URI);
		Ansteuerung_ElementPackageImpl theAnsteuerung_ElementPackage = (Ansteuerung_ElementPackageImpl)(registeredPackage instanceof Ansteuerung_ElementPackageImpl ? registeredPackage : Ansteuerung_ElementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BahnsteigPackage.eNS_URI);
		BahnsteigPackageImpl theBahnsteigPackage = (BahnsteigPackageImpl)(registeredPackage instanceof BahnsteigPackageImpl ? registeredPackage : BahnsteigPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI);
		Balisentechnik_ETCSPackageImpl theBalisentechnik_ETCSPackage = (Balisentechnik_ETCSPackageImpl)(registeredPackage instanceof Balisentechnik_ETCSPackageImpl ? registeredPackage : Balisentechnik_ETCSPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BedienungPackage.eNS_URI);
		BedienungPackageImpl theBedienungPackage = (BedienungPackageImpl)(registeredPackage instanceof BedienungPackageImpl ? registeredPackage : BedienungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BlockPackage.eNS_URI);
		BlockPackageImpl theBlockPackage = (BlockPackageImpl)(registeredPackage instanceof BlockPackageImpl ? registeredPackage : BlockPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FlankenschutzPackage.eNS_URI);
		FlankenschutzPackageImpl theFlankenschutzPackage = (FlankenschutzPackageImpl)(registeredPackage instanceof FlankenschutzPackageImpl ? registeredPackage : FlankenschutzPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OrtungPackage.eNS_URI);
		OrtungPackageImpl theOrtungPackage = (OrtungPackageImpl)(registeredPackage instanceof OrtungPackageImpl ? registeredPackage : OrtungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FahrstrassePackage.eNS_URI);
		FahrstrassePackageImpl theFahrstrassePackage = (FahrstrassePackageImpl)(registeredPackage instanceof FahrstrassePackageImpl ? registeredPackage : FahrstrassePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeodatenPackage.eNS_URI);
		GeodatenPackageImpl theGeodatenPackage = (GeodatenPackageImpl)(registeredPackage instanceof GeodatenPackageImpl ? registeredPackage : GeodatenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Weichen_und_GleissperrenPackage.eNS_URI);
		Weichen_und_GleissperrenPackageImpl theWeichen_und_GleissperrenPackage = (Weichen_und_GleissperrenPackageImpl)(registeredPackage instanceof Weichen_und_GleissperrenPackageImpl ? registeredPackage : Weichen_und_GleissperrenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GleisPackage.eNS_URI);
		GleisPackageImpl theGleisPackage = (GleisPackageImpl)(registeredPackage instanceof GleisPackageImpl ? registeredPackage : GleisPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Medien_und_TrassenPackage.eNS_URI);
		Medien_und_TrassenPackageImpl theMedien_und_TrassenPackage = (Medien_und_TrassenPackageImpl)(registeredPackage instanceof Medien_und_TrassenPackageImpl ? registeredPackage : Medien_und_TrassenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NahbedienungPackage.eNS_URI);
		NahbedienungPackageImpl theNahbedienungPackage = (NahbedienungPackageImpl)(registeredPackage instanceof NahbedienungPackageImpl ? registeredPackage : NahbedienungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PZBPackage.eNS_URI);
		PZBPackageImpl thePZBPackage = (PZBPackageImpl)(registeredPackage instanceof PZBPackageImpl ? registeredPackage : PZBPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RegelzeichnungPackage.eNS_URI);
		RegelzeichnungPackageImpl theRegelzeichnungPackage = (RegelzeichnungPackageImpl)(registeredPackage instanceof RegelzeichnungPackageImpl ? registeredPackage : RegelzeichnungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchluesselabhaengigkeitenPackage.eNS_URI);
		SchluesselabhaengigkeitenPackageImpl theSchluesselabhaengigkeitenPackage = (SchluesselabhaengigkeitenPackageImpl)(registeredPackage instanceof SchluesselabhaengigkeitenPackageImpl ? registeredPackage : SchluesselabhaengigkeitenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SignalePackage.eNS_URI);
		SignalePackageImpl theSignalePackage = (SignalePackageImpl)(registeredPackage instanceof SignalePackageImpl ? registeredPackage : SignalePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Signalbegriffe_StrukturPackage.eNS_URI);
		Signalbegriffe_StrukturPackageImpl theSignalbegriffe_StrukturPackage = (Signalbegriffe_StrukturPackageImpl)(registeredPackage instanceof Signalbegriffe_StrukturPackageImpl ? registeredPackage : Signalbegriffe_StrukturPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ZuglenkungPackage.eNS_URI);
		ZuglenkungPackageImpl theZuglenkungPackage = (ZuglenkungPackageImpl)(registeredPackage instanceof ZuglenkungPackageImpl ? registeredPackage : ZuglenkungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ZugnummernmeldeanlagePackage.eNS_URI);
		ZugnummernmeldeanlagePackageImpl theZugnummernmeldeanlagePackage = (ZugnummernmeldeanlagePackageImpl)(registeredPackage instanceof ZugnummernmeldeanlagePackageImpl ? registeredPackage : ZugnummernmeldeanlagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Signalbegriffe_Ril_301Package.eNS_URI);
		Signalbegriffe_Ril_301PackageImpl theSignalbegriffe_Ril_301Package = (Signalbegriffe_Ril_301PackageImpl)(registeredPackage instanceof Signalbegriffe_Ril_301PackageImpl ? registeredPackage : Signalbegriffe_Ril_301Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LayoutinformationenPackage.eNS_URI);
		LayoutinformationenPackageImpl theLayoutinformationenPackage = (LayoutinformationenPackageImpl)(registeredPackage instanceof LayoutinformationenPackageImpl ? registeredPackage : LayoutinformationenPackage.eINSTANCE);

		// Load packages
		theBahnuebergangPackage.loadPackage();
		thePlanProPackage.loadPackage();
		theBalisentechnik_ETCSPackage.loadPackage();
		theSignalbegriffe_Ril_301Package.loadPackage();

		// Create package meta-data objects
		theBasisobjektePackage.createPackageContents();
		theBasisTypenPackage.createPackageContents();
		theATOPackage.createPackageContents();
		theVerweisePackage.createPackageContents();
		theAnsteuerung_ElementPackage.createPackageContents();
		theBahnsteigPackage.createPackageContents();
		theBedienungPackage.createPackageContents();
		theBlockPackage.createPackageContents();
		theFlankenschutzPackage.createPackageContents();
		theOrtungPackage.createPackageContents();
		theFahrstrassePackage.createPackageContents();
		theGeodatenPackage.createPackageContents();
		theWeichen_und_GleissperrenPackage.createPackageContents();
		theGleisPackage.createPackageContents();
		theMedien_und_TrassenPackage.createPackageContents();
		theNahbedienungPackage.createPackageContents();
		thePZBPackage.createPackageContents();
		theRegelzeichnungPackage.createPackageContents();
		theSchluesselabhaengigkeitenPackage.createPackageContents();
		theSignalePackage.createPackageContents();
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();
		theLayoutinformationenPackage.createPackageContents();

		// Initialize created meta-data
		theBasisobjektePackage.initializePackageContents();
		theBasisTypenPackage.initializePackageContents();
		theATOPackage.initializePackageContents();
		theVerweisePackage.initializePackageContents();
		theAnsteuerung_ElementPackage.initializePackageContents();
		theBahnsteigPackage.initializePackageContents();
		theBedienungPackage.initializePackageContents();
		theBlockPackage.initializePackageContents();
		theFlankenschutzPackage.initializePackageContents();
		theOrtungPackage.initializePackageContents();
		theFahrstrassePackage.initializePackageContents();
		theGeodatenPackage.initializePackageContents();
		theWeichen_und_GleissperrenPackage.initializePackageContents();
		theGleisPackage.initializePackageContents();
		theMedien_und_TrassenPackage.initializePackageContents();
		theNahbedienungPackage.initializePackageContents();
		thePZBPackage.initializePackageContents();
		theRegelzeichnungPackage.initializePackageContents();
		theSchluesselabhaengigkeitenPackage.initializePackageContents();
		theSignalePackage.initializePackageContents();
		theSignalbegriffe_StrukturPackage.initializePackageContents();
		theZuglenkungPackage.initializePackageContents();
		theZugnummernmeldeanlagePackage.initializePackageContents();
		theLayoutinformationenPackage.initializePackageContents();

		// Fix loaded packages
		theBahnuebergangPackage.fixPackageContents();
		thePlanProPackage.fixPackageContents();
		theBalisentechnik_ETCSPackage.fixPackageContents();
		theSignalbegriffe_Ril_301Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBahnuebergangPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return BahnuebergangValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBahnuebergangPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BahnuebergangPackage.eNS_URI, theBahnuebergangPackage);
		return theBahnuebergangPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstand_Gehweg_Fahrbahn_TypeClass() {
		if (abstand_Gehweg_Fahrbahn_TypeClassEClass == null) {
			abstand_Gehweg_Fahrbahn_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(1);
		}
		return abstand_Gehweg_Fahrbahn_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstand_Gehweg_Fahrbahn_TypeClass_Wert() {
        return (EAttribute)getAbstand_Gehweg_Fahrbahn_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAkustik_Fussgaenger_TypeClass() {
		if (akustik_Fussgaenger_TypeClassEClass == null) {
			akustik_Fussgaenger_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(3);
		}
		return akustik_Fussgaenger_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAkustik_Fussgaenger_TypeClass_Wert() {
        return (EAttribute)getAkustik_Fussgaenger_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAusrichtung_TypeClass() {
		if (ausrichtung_TypeClassEClass == null) {
			ausrichtung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(5);
		}
		return ausrichtung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAusrichtung_TypeClass_Wert() {
        return (EAttribute)getAusrichtung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAusrichtung_Winkel_TypeClass() {
		if (ausrichtung_Winkel_TypeClassEClass == null) {
			ausrichtung_Winkel_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(7);
		}
		return ausrichtung_Winkel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAusrichtung_Winkel_TypeClass_Wert() {
        return (EAttribute)getAusrichtung_Winkel_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuto_Het_TypeClass() {
		if (auto_Het_TypeClassEClass == null) {
			auto_Het_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(8);
		}
		return auto_Het_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuto_Het_TypeClass_Wert() {
        return (EAttribute)getAuto_Het_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaulast_TypeClass() {
		if (baulast_TypeClassEClass == null) {
			baulast_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(10);
		}
		return baulast_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaulast_TypeClass_Wert() {
        return (EAttribute)getBaulast_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaumprofil_TypeClass() {
		if (baumprofil_TypeClassEClass == null) {
			baumprofil_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(11);
		}
		return baumprofil_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaumprofil_TypeClass_Wert() {
        return (EAttribute)getBaumprofil_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeeinflussung_Strassenverkehr_TypeClass() {
		if (beeinflussung_Strassenverkehr_TypeClassEClass == null) {
			beeinflussung_Strassenverkehr_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(13);
		}
		return beeinflussung_Strassenverkehr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeeinflussung_Strassenverkehr_TypeClass_Wert() {
        return (EAttribute)getBeeinflussung_Strassenverkehr_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBez_Schrankenantrieb_TypeClass() {
		if (bez_Schrankenantrieb_TypeClassEClass == null) {
			bez_Schrankenantrieb_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(15);
		}
		return bez_Schrankenantrieb_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBez_Schrankenantrieb_TypeClass_Wert() {
        return (EAttribute)getBez_Schrankenantrieb_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_BUE_GFR_Eckpunkt_TypeClass() {
		if (bezeichnung_BUE_GFR_Eckpunkt_TypeClassEClass == null) {
			bezeichnung_BUE_GFR_Eckpunkt_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(17);
		}
		return bezeichnung_BUE_GFR_Eckpunkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_BUE_GFR_Eckpunkt_TypeClass_Wert() {
        return (EAttribute)getBezeichnung_BUE_GFR_Eckpunkt_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_GFR_Element_TypeClass() {
		if (bezeichnung_GFR_Element_TypeClassEClass == null) {
			bezeichnung_GFR_Element_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(19);
		}
		return bezeichnung_GFR_Element_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_GFR_Element_TypeClass_Wert() {
        return (EAttribute)getBezeichnung_GFR_Element_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_GFR_Tripelspiegel_TypeClass() {
		if (bezeichnung_GFR_Tripelspiegel_TypeClassEClass == null) {
			bezeichnung_GFR_Tripelspiegel_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(21);
		}
		return bezeichnung_GFR_Tripelspiegel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_GFR_Tripelspiegel_TypeClass_Wert() {
        return (EAttribute)getBezeichnung_GFR_Tripelspiegel_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Verkehrszeichen_TypeClass() {
		if (bezeichnung_Verkehrszeichen_TypeClassEClass == null) {
			bezeichnung_Verkehrszeichen_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(23);
		}
		return bezeichnung_Verkehrszeichen_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Verkehrszeichen_TypeClass_Wert() {
        return (EAttribute)getBezeichnung_Verkehrszeichen_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlitzpfeil_TypeClass() {
		if (blitzpfeil_TypeClassEClass == null) {
			blitzpfeil_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(25);
		}
		return blitzpfeil_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlitzpfeil_TypeClass_Wert() {
        return (EAttribute)getBlitzpfeil_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Abhaengigkeit_Fue_AttributeGroup() {
		if (buE_Abhaengigkeit_Fue_AttributeGroupEClass == null) {
			buE_Abhaengigkeit_Fue_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(27);
		}
		return buE_Abhaengigkeit_Fue_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Abhaengigkeit_Fue_AttributeGroup_AutoHet() {
        return (EReference)getBUE_Abhaengigkeit_Fue_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Abhaengigkeit_Fue_AttributeGroup_FueSchaltfall() {
        return (EReference)getBUE_Abhaengigkeit_Fue_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Abhaengigkeit_Fue_AttributeGroup_StoerhaltHaltfall() {
        return (EReference)getBUE_Abhaengigkeit_Fue_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Abhaengigkeit_Fue_AttributeGroup_StoerhaltMerkhinweis() {
        return (EReference)getBUE_Abhaengigkeit_Fue_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Abhaengigkeit_Fue_AttributeGroup_Zeitueberschreitungsmeldung() {
        return (EReference)getBUE_Abhaengigkeit_Fue_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Anlage() {
		if (buE_AnlageEClass == null) {
			buE_AnlageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(28);
		}
		return buE_AnlageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Bezeichnung() {
        return (EReference)getBUE_Anlage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_BUEAnlageAllg() {
        return (EReference)getBUE_Anlage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_IDAEABUEAnschaltung() {
        return (EReference)getBUE_Anlage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_IDBUESchnittstelle() {
        return (EReference)getBUE_Anlage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Anlage_Allg_AttributeGroup() {
		if (buE_Anlage_Allg_AttributeGroupEClass == null) {
			buE_Anlage_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(29);
		}
		return buE_Anlage_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Allg_AttributeGroup_BUEBauart() {
        return (EReference)getBUE_Anlage_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Allg_AttributeGroup_BUEBuestra() {
        return (EReference)getBUE_Anlage_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Allg_AttributeGroup_BUEMitGFR() {
        return (EReference)getBUE_Anlage_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Allg_AttributeGroup_BUESicherungsart() {
        return (EReference)getBUE_Anlage_Allg_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Allg_AttributeGroup_BUEStrasse() {
        return (EReference)getBUE_Anlage_Allg_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Allg_AttributeGroup_BUETechnik() {
        return (EReference)getBUE_Anlage_Allg_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Anlage_Fuss_Rad_AttributeGroup() {
		if (buE_Anlage_Fuss_Rad_AttributeGroupEClass == null) {
			buE_Anlage_Fuss_Rad_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(30);
		}
		return buE_Anlage_Fuss_Rad_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Fuss_Rad_AttributeGroup_FussRadwegArt() {
        return (EReference)getBUE_Anlage_Fuss_Rad_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Fuss_Rad_AttributeGroup_FussRadwegSeite() {
        return (EReference)getBUE_Anlage_Fuss_Rad_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Anlage_Strasse() {
		if (buE_Anlage_StrasseEClass == null) {
			buE_Anlage_StrasseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(31);
		}
		return buE_Anlage_StrasseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Strasse_BUEAnlageFussRad() {
        return (EReference)getBUE_Anlage_Strasse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Strasse_BUEAnlageStrasseAllg() {
        return (EReference)getBUE_Anlage_Strasse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Strasse_IDBUEAnlage() {
        return (EReference)getBUE_Anlage_Strasse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Anlage_Strasse_Allg_AttributeGroup() {
		if (buE_Anlage_Strasse_Allg_AttributeGroupEClass == null) {
			buE_Anlage_Strasse_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(32);
		}
		return buE_Anlage_Strasse_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Strasse_Allg_AttributeGroup_Baulast() {
        return (EReference)getBUE_Anlage_Strasse_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Strasse_Allg_AttributeGroup_FahrbahnBefestigung() {
        return (EReference)getBUE_Anlage_Strasse_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Strasse_Allg_AttributeGroup_FahrbahnBefestigungGleis() {
        return (EReference)getBUE_Anlage_Strasse_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Strasse_Allg_AttributeGroup_FahrbahnBreite() {
        return (EReference)getBUE_Anlage_Strasse_Allg_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Strasse_Allg_AttributeGroup_Klassifizierung() {
        return (EReference)getBUE_Anlage_Strasse_Allg_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_Strasse_Allg_AttributeGroup_Kreuzungswinkel() {
        return (EReference)getBUE_Anlage_Strasse_Allg_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Anlage_V() {
		if (buE_Anlage_VEClass == null) {
			buE_Anlage_VEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(33);
		}
		return buE_Anlage_VEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_V_BUEAnlageVAllg() {
        return (EReference)getBUE_Anlage_V().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_V_IDBUEAnlage() {
        return (EReference)getBUE_Anlage_V().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Anlage_V_Allg_AttributeGroup() {
		if (buE_Anlage_V_Allg_AttributeGroupEClass == null) {
			buE_Anlage_V_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(34);
		}
		return buE_Anlage_V_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_V_Allg_AttributeGroup_VMaxSchiene() {
        return (EReference)getBUE_Anlage_V_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_V_Allg_AttributeGroup_VMaxStrasse() {
        return (EReference)getBUE_Anlage_V_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_V_Allg_AttributeGroup_VMinFussweg() {
        return (EReference)getBUE_Anlage_V_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_V_Allg_AttributeGroup_VMinSchiene() {
        return (EReference)getBUE_Anlage_V_Allg_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Anlage_V_Allg_AttributeGroup_VMinStrasse() {
        return (EReference)getBUE_Anlage_V_Allg_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Ausschaltung() {
		if (buE_AusschaltungEClass == null) {
			buE_AusschaltungEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(35);
		}
		return buE_AusschaltungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Ausschaltung_IDBUEGleisbezGefahrraum() {
        return (EReference)getBUE_Ausschaltung().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Bauart_TypeClass() {
		if (buE_Bauart_TypeClassEClass == null) {
			buE_Bauart_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(36);
		}
		return buE_Bauart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBUE_Bauart_TypeClass_Wert() {
        return (EAttribute)getBUE_Bauart_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Bedien_Anz_Element_Allg_AttributeGroup() {
		if (buE_Bedien_Anz_Element_Allg_AttributeGroupEClass == null) {
			buE_Bedien_Anz_Element_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(37);
		}
		return buE_Bedien_Anz_Element_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Bedien_Anz_Element_Allg_AttributeGroup_BUEHandschalteinrichtung() {
        return (EReference)getBUE_Bedien_Anz_Element_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Bedien_Anz_Element_Allg_AttributeGroup_IDBedienAnzeigeElement() {
        return (EReference)getBUE_Bedien_Anz_Element_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Bedien_Anz_Element_Allg_AttributeGroup_IDHandschaltWirkfunktion() {
        return (EReference)getBUE_Bedien_Anz_Element_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Bedien_Anzeige_Element() {
		if (buE_Bedien_Anzeige_ElementEClass == null) {
			buE_Bedien_Anzeige_ElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(38);
		}
		return buE_Bedien_Anzeige_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Bedien_Anzeige_Element_BUEBedienAnzElementAllg() {
        return (EReference)getBUE_Bedien_Anzeige_Element().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Buestra_TypeClass() {
		if (buE_Buestra_TypeClassEClass == null) {
			buE_Buestra_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(39);
		}
		return buE_Buestra_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBUE_Buestra_TypeClass_Wert() {
        return (EAttribute)getBUE_Buestra_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Deckendes_Signal_Zuordnung() {
		if (buE_Deckendes_Signal_ZuordnungEClass == null) {
			buE_Deckendes_Signal_ZuordnungEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(40);
		}
		return buE_Deckendes_Signal_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Deckendes_Signal_Zuordnung_IDBUEEinschaltung() {
        return (EReference)getBUE_Deckendes_Signal_Zuordnung().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Deckendes_Signal_Zuordnung_IDSignal() {
        return (EReference)getBUE_Deckendes_Signal_Zuordnung().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Deckendes_Signal_Zuordnung_Sicherheitsabstand() {
        return (EReference)getBUE_Deckendes_Signal_Zuordnung().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Einschaltung() {
		if (buE_EinschaltungEClass == null) {
			buE_EinschaltungEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(41);
		}
		return buE_EinschaltungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Einschaltung_BUEEinschaltungHp() {
        return (EReference)getBUE_Einschaltung().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Einschaltung_BUEFunktionsueberwachung() {
        return (EReference)getBUE_Einschaltung().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Einschaltung_Hp_AttributeGroup() {
		if (buE_Einschaltung_Hp_AttributeGroupEClass == null) {
			buE_Einschaltung_Hp_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(42);
		}
		return buE_Einschaltung_Hp_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Einschaltung_Hp_AttributeGroup_EinschaltverzErrechnet() {
        return (EReference)getBUE_Einschaltung_Hp_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Einschaltung_Hp_AttributeGroup_EinschaltverzGewaehlt() {
        return (EReference)getBUE_Einschaltung_Hp_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Einschaltung_Hp_AttributeGroup_Haltezeit() {
        return (EReference)getBUE_Einschaltung_Hp_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Einschaltung_Hp_AttributeGroup_Kurzzugschaltung() {
        return (EReference)getBUE_Einschaltung_Hp_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Einschaltung_Hp_AttributeGroup_SignalverzErrechnet() {
        return (EReference)getBUE_Einschaltung_Hp_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Einschaltung_Hp_AttributeGroup_SignalverzGewaehlt() {
        return (EReference)getBUE_Einschaltung_Hp_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Einschaltung_Hp_AttributeGroup_Teilvorgabezeit() {
        return (EReference)getBUE_Einschaltung_Hp_AttributeGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Einschaltung_Zuordnung() {
		if (buE_Einschaltung_ZuordnungEClass == null) {
			buE_Einschaltung_ZuordnungEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(43);
		}
		return buE_Einschaltung_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Einschaltung_Zuordnung_IDBUEEinschaltung() {
        return (EReference)getBUE_Einschaltung_Zuordnung().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Einschaltung_Zuordnung_IDBUEGleisbezGefahrraum() {
        return (EReference)getBUE_Einschaltung_Zuordnung().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Funktionsueberwachung_TypeClass() {
		if (buE_Funktionsueberwachung_TypeClassEClass == null) {
			buE_Funktionsueberwachung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(44);
		}
		return buE_Funktionsueberwachung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBUE_Funktionsueberwachung_TypeClass_Wert() {
        return (EAttribute)getBUE_Funktionsueberwachung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Gefahrraum_Eckpunkt() {
		if (buE_Gefahrraum_EckpunktEClass == null) {
			buE_Gefahrraum_EckpunktEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(45);
		}
		return buE_Gefahrraum_EckpunktEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Gefahrraum_Eckpunkt_Bezeichnung() {
        return (EReference)getBUE_Gefahrraum_Eckpunkt().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Gefahrraum_Eckpunkt_IDBUEAnlage() {
        return (EReference)getBUE_Gefahrraum_Eckpunkt().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup() {
		if (buE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupEClass == null) {
			buE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(46);
		}
		return buE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup_BezeichnungBUEGFREckpunkt() {
        return (EReference)getBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Gleisbezogener_Gefahrraum() {
		if (buE_Gleisbezogener_GefahrraumEClass == null) {
			buE_Gleisbezogener_GefahrraumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(47);
		}
		return buE_Gleisbezogener_GefahrraumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Gleisbezogener_Gefahrraum_ErsatzsteckerGleisbezogen() {
        return (EReference)getBUE_Gleisbezogener_Gefahrraum().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Gleisbezogener_Gefahrraum_GleisAmBue() {
        return (EReference)getBUE_Gleisbezogener_Gefahrraum().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Gleisbezogener_Gefahrraum_IDBUEAnlage() {
        return (EReference)getBUE_Gleisbezogener_Gefahrraum().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Handschalteinrichtung_TypeClass() {
		if (buE_Handschalteinrichtung_TypeClassEClass == null) {
			buE_Handschalteinrichtung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(48);
		}
		return buE_Handschalteinrichtung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBUE_Handschalteinrichtung_TypeClass_Wert() {
        return (EAttribute)getBUE_Handschalteinrichtung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Kante() {
		if (buE_KanteEClass == null) {
			buE_KanteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(49);
		}
		return buE_KanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Kante_IDBUEAnlage() {
        return (EReference)getBUE_Kante().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Kreuzungsplan() {
		if (buE_KreuzungsplanEClass == null) {
			buE_KreuzungsplanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(50);
		}
		return buE_KreuzungsplanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Kreuzungsplan_BUEKreuzungsplanKoordinaten() {
        return (EReference)getBUE_Kreuzungsplan().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Kreuzungsplan_IDAnhangKreuzungsplan() {
        return (EReference)getBUE_Kreuzungsplan().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Kreuzungsplan_IDBUEAnlage() {
        return (EReference)getBUE_Kreuzungsplan().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Kreuzungsplan_Koordinaten_AttributeGroup() {
		if (buE_Kreuzungsplan_Koordinaten_AttributeGroupEClass == null) {
			buE_Kreuzungsplan_Koordinaten_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(51);
		}
		return buE_Kreuzungsplan_Koordinaten_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Kreuzungsplan_Koordinaten_AttributeGroup_IDGEOPunkt() {
        return (EReference)getBUE_Kreuzungsplan_Koordinaten_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Kreuzungsplan_Koordinaten_AttributeGroup_PixelKoordinateX() {
        return (EReference)getBUE_Kreuzungsplan_Koordinaten_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Kreuzungsplan_Koordinaten_AttributeGroup_PixelKoordinateY() {
        return (EReference)getBUE_Kreuzungsplan_Koordinaten_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Mit_GFR_TypeClass() {
		if (buE_Mit_GFR_TypeClassEClass == null) {
			buE_Mit_GFR_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(52);
		}
		return buE_Mit_GFR_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBUE_Mit_GFR_TypeClass_Wert() {
        return (EAttribute)getBUE_Mit_GFR_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Nachlaufzeit_TypeClass() {
		if (buE_Nachlaufzeit_TypeClassEClass == null) {
			buE_Nachlaufzeit_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(54);
		}
		return buE_Nachlaufzeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBUE_Nachlaufzeit_TypeClass_Wert() {
        return (EAttribute)getBUE_Nachlaufzeit_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Neigung_TypeClass() {
		if (buE_Neigung_TypeClassEClass == null) {
			buE_Neigung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(56);
		}
		return buE_Neigung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBUE_Neigung_TypeClass_Wert() {
        return (EAttribute)getBUE_Neigung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Schnittstelle() {
		if (buE_SchnittstelleEClass == null) {
			buE_SchnittstelleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(57);
		}
		return buE_SchnittstelleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Schnittstelle_BUEAbhaengigkeitFue() {
        return (EReference)getBUE_Schnittstelle().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Schnittstelle_BUESchnittstelleAllg() {
        return (EReference)getBUE_Schnittstelle().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Schnittstelle_IDStellelement() {
        return (EReference)getBUE_Schnittstelle().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Schnittstelle_Allg_AttributeGroup() {
		if (buE_Schnittstelle_Allg_AttributeGroupEClass == null) {
			buE_Schnittstelle_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(58);
		}
		return buE_Schnittstelle_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Schnittstelle_Allg_AttributeGroup_BUENachlaufzeit() {
        return (EReference)getBUE_Schnittstelle_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Schnittstelle_Allg_AttributeGroup_BUEVorlaufzeit() {
        return (EReference)getBUE_Schnittstelle_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Schnittstelle_Allg_AttributeGroup_HpErsatzstecker() {
        return (EReference)getBUE_Schnittstelle_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Schnittstelle_Allg_AttributeGroup_LFUEImpuls() {
        return (EReference)getBUE_Schnittstelle_Allg_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Sicherungsart_TypeClass() {
		if (buE_Sicherungsart_TypeClassEClass == null) {
			buE_Sicherungsart_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(59);
		}
		return buE_Sicherungsart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBUE_Sicherungsart_TypeClass_Wert() {
        return (EAttribute)getBUE_Sicherungsart_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Sicherungszeit_TypeClass() {
		if (buE_Sicherungszeit_TypeClassEClass == null) {
			buE_Sicherungszeit_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(61);
		}
		return buE_Sicherungszeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBUE_Sicherungszeit_TypeClass_Wert() {
        return (EAttribute)getBUE_Sicherungszeit_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Spezifisches_Signal() {
		if (buE_Spezifisches_SignalEClass == null) {
			buE_Spezifisches_SignalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(62);
		}
		return buE_Spezifisches_SignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Spezifisches_Signal_IDSignal() {
        return (EReference)getBUE_Spezifisches_Signal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Spezifisches_Signal_IDBUEAnlage() {
        return (EReference)getBUE_Spezifisches_Signal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_Spezifisches_Signal_IDBUEEinschaltung() {
        return (EReference)getBUE_Spezifisches_Signal().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Strasse_TypeClass() {
		if (buE_Strasse_TypeClassEClass == null) {
			buE_Strasse_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(64);
		}
		return buE_Strasse_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBUE_Strasse_TypeClass_Wert() {
        return (EAttribute)getBUE_Strasse_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Technik_TypeClass() {
		if (buE_Technik_TypeClassEClass == null) {
			buE_Technik_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(65);
		}
		return buE_Technik_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBUE_Technik_TypeClass_Wert() {
        return (EAttribute)getBUE_Technik_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Vorlaufzeit_TypeClass() {
		if (buE_Vorlaufzeit_TypeClassEClass == null) {
			buE_Vorlaufzeit_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(67);
		}
		return buE_Vorlaufzeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBUE_Vorlaufzeit_TypeClass_Wert() {
        return (EAttribute)getBUE_Vorlaufzeit_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_WS_Fstr_Zuordnung() {
		if (buE_WS_Fstr_ZuordnungEClass == null) {
			buE_WS_Fstr_ZuordnungEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(68);
		}
		return buE_WS_Fstr_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_WS_Fstr_Zuordnung_IDBUEEinschaltung() {
        return (EReference)getBUE_WS_Fstr_Zuordnung().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBUE_WS_Fstr_Zuordnung_IDFstrZugRangier() {
        return (EReference)getBUE_WS_Fstr_Zuordnung().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinschaltverz_Errechnet_TypeClass() {
		if (einschaltverz_Errechnet_TypeClassEClass == null) {
			einschaltverz_Errechnet_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(70);
		}
		return einschaltverz_Errechnet_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinschaltverz_Errechnet_TypeClass_Wert() {
        return (EAttribute)getEinschaltverz_Errechnet_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinschaltverz_Gewaehlt_TypeClass() {
		if (einschaltverz_Gewaehlt_TypeClassEClass == null) {
			einschaltverz_Gewaehlt_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(72);
		}
		return einschaltverz_Gewaehlt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinschaltverz_Gewaehlt_TypeClass_Wert() {
        return (EAttribute)getEinschaltverz_Gewaehlt_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErsatzstecker_Gleisbezogen_TypeClass() {
		if (ersatzstecker_Gleisbezogen_TypeClassEClass == null) {
			ersatzstecker_Gleisbezogen_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(107);
		}
		return ersatzstecker_Gleisbezogen_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErsatzstecker_Gleisbezogen_TypeClass_Wert() {
        return (EAttribute)getErsatzstecker_Gleisbezogen_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFahrbahn_Befestigung_Gleis_TypeClass() {
		if (fahrbahn_Befestigung_Gleis_TypeClassEClass == null) {
			fahrbahn_Befestigung_Gleis_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(109);
		}
		return fahrbahn_Befestigung_Gleis_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFahrbahn_Befestigung_Gleis_TypeClass_Wert() {
        return (EAttribute)getFahrbahn_Befestigung_Gleis_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFahrbahn_Befestigung_TypeClass() {
		if (fahrbahn_Befestigung_TypeClassEClass == null) {
			fahrbahn_Befestigung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(111);
		}
		return fahrbahn_Befestigung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFahrbahn_Befestigung_TypeClass_Wert() {
        return (EAttribute)getFahrbahn_Befestigung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFahrbahn_Breite_TypeClass() {
		if (fahrbahn_Breite_TypeClassEClass == null) {
			fahrbahn_Breite_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(113);
		}
		return fahrbahn_Breite_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFahrbahn_Breite_TypeClass_Wert() {
        return (EAttribute)getFahrbahn_Breite_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFue_Schaltfall_TypeClass() {
		if (fue_Schaltfall_TypeClassEClass == null) {
			fue_Schaltfall_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(114);
		}
		return fue_Schaltfall_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFue_Schaltfall_TypeClass_Wert() {
        return (EAttribute)getFue_Schaltfall_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFuss_Radweg_Art_TypeClass() {
		if (fuss_Radweg_Art_TypeClassEClass == null) {
			fuss_Radweg_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(115);
		}
		return fuss_Radweg_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFuss_Radweg_Art_TypeClass_Wert() {
        return (EAttribute)getFuss_Radweg_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFuss_Radweg_Seite_TypeClass() {
		if (fuss_Radweg_Seite_TypeClassEClass == null) {
			fuss_Radweg_Seite_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(116);
		}
		return fuss_Radweg_Seite_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFuss_Radweg_Seite_TypeClass_Wert() {
        return (EAttribute)getFuss_Radweg_Seite_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGFR_Anlage() {
		if (gfR_AnlageEClass == null) {
			gfR_AnlageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(117);
		}
		return gfR_AnlageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Anlage_GFRAnlageAllg() {
        return (EReference)getGFR_Anlage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Anlage_IDBUEAnlage() {
        return (EReference)getGFR_Anlage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGFR_Anlage_Allg_AttributeGroup() {
		if (gfR_Anlage_Allg_AttributeGroupEClass == null) {
			gfR_Anlage_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(118);
		}
		return gfR_Anlage_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Anlage_Allg_AttributeGroup_BUESicherungszeit() {
        return (EReference)getGFR_Anlage_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Anlage_Allg_AttributeGroup_GFRArt() {
        return (EReference)getGFR_Anlage_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Anlage_Allg_AttributeGroup_GFRTyp() {
        return (EReference)getGFR_Anlage_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Anlage_Allg_AttributeGroup_Hersteller() {
        return (EReference)getGFR_Anlage_Allg_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGFR_Art_TypeClass() {
		if (gfR_Art_TypeClassEClass == null) {
			gfR_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(119);
		}
		return gfR_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGFR_Art_TypeClass_Wert() {
        return (EAttribute)getGFR_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGFR_Element() {
		if (gfR_ElementEClass == null) {
			gfR_ElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(120);
		}
		return gfR_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Element_Bezeichnung() {
        return (EReference)getGFR_Element().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Element_IDGFRAnlage() {
        return (EReference)getGFR_Element().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Element_IDUnterbringung() {
        return (EReference)getGFR_Element().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Element_BUENeigung() {
        return (EReference)getGFR_Element().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Element_GFRNeigung() {
        return (EReference)getGFR_Element().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGFR_Element_Bezeichnung_AttributeGroup() {
		if (gfR_Element_Bezeichnung_AttributeGroupEClass == null) {
			gfR_Element_Bezeichnung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(121);
		}
		return gfR_Element_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Element_Bezeichnung_AttributeGroup_BezeichnungGFRElement() {
        return (EReference)getGFR_Element_Bezeichnung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGFR_Neigung_TypeClass() {
		if (gfR_Neigung_TypeClassEClass == null) {
			gfR_Neigung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(123);
		}
		return gfR_Neigung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGFR_Neigung_TypeClass_Wert() {
        return (EAttribute)getGFR_Neigung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGFR_Tripelspiegel() {
		if (gfR_TripelspiegelEClass == null) {
			gfR_TripelspiegelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(124);
		}
		return gfR_TripelspiegelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Tripelspiegel_Bezeichnung() {
        return (EReference)getGFR_Tripelspiegel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Tripelspiegel_GFRTripelspiegelAllg() {
        return (EReference)getGFR_Tripelspiegel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Tripelspiegel_IDGFRAnlage() {
        return (EReference)getGFR_Tripelspiegel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGFR_Tripelspiegel_Allg_AttributeGroup() {
		if (gfR_Tripelspiegel_Allg_AttributeGroupEClass == null) {
			gfR_Tripelspiegel_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(125);
		}
		return gfR_Tripelspiegel_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Tripelspiegel_Allg_AttributeGroup_Montagehoehe() {
        return (EReference)getGFR_Tripelspiegel_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Tripelspiegel_Allg_AttributeGroup_Pegel() {
        return (EReference)getGFR_Tripelspiegel_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Tripelspiegel_Allg_AttributeGroup_WinkelAlpha() {
        return (EReference)getGFR_Tripelspiegel_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGFR_Tripelspiegel_Bezeichnung_AttributeGroup() {
		if (gfR_Tripelspiegel_Bezeichnung_AttributeGroupEClass == null) {
			gfR_Tripelspiegel_Bezeichnung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(126);
		}
		return gfR_Tripelspiegel_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGFR_Tripelspiegel_Bezeichnung_AttributeGroup_BezeichnungGFRTripelspiegel() {
        return (EReference)getGFR_Tripelspiegel_Bezeichnung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGFR_Typ_TypeClass() {
		if (gfR_Typ_TypeClassEClass == null) {
			gfR_Typ_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(128);
		}
		return gfR_Typ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGFR_Typ_TypeClass_Wert() {
        return (EAttribute)getGFR_Typ_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGitterbehang_TypeClass() {
		if (gitterbehang_TypeClassEClass == null) {
			gitterbehang_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(129);
		}
		return gitterbehang_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGitterbehang_TypeClass_Wert() {
        return (EAttribute)getGitterbehang_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleis_Am_Bue_TypeClass() {
		if (gleis_Am_Bue_TypeClassEClass == null) {
			gleis_Am_Bue_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(131);
		}
		return gleis_Am_Bue_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGleis_Am_Bue_TypeClass_Wert() {
        return (EAttribute)getGleis_Am_Bue_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHaltezeit_TypeClass() {
		if (haltezeit_TypeClassEClass == null) {
			haltezeit_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(133);
		}
		return haltezeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaltezeit_TypeClass_Wert() {
        return (EAttribute)getHaltezeit_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHersteller_TypeClass() {
		if (hersteller_TypeClassEClass == null) {
			hersteller_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(134);
		}
		return hersteller_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHersteller_TypeClass_Wert() {
        return (EAttribute)getHersteller_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHp_Ersatzstecker_TypeClass() {
		if (hp_Ersatzstecker_TypeClassEClass == null) {
			hp_Ersatzstecker_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(135);
		}
		return hp_Ersatzstecker_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHp_Ersatzstecker_TypeClass_Wert() {
        return (EAttribute)getHp_Ersatzstecker_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKlassifizierung_TypeClass() {
		if (klassifizierung_TypeClassEClass == null) {
			klassifizierung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(136);
		}
		return klassifizierung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKlassifizierung_TypeClass_Wert() {
        return (EAttribute)getKlassifizierung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKontrastblende_TypeClass() {
		if (kontrastblende_TypeClassEClass == null) {
			kontrastblende_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(138);
		}
		return kontrastblende_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKontrastblende_TypeClass_Wert() {
        return (EAttribute)getKontrastblende_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKreuzungswinkel_TypeClass() {
		if (kreuzungswinkel_TypeClassEClass == null) {
			kreuzungswinkel_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(141);
		}
		return kreuzungswinkel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKreuzungswinkel_TypeClass_Wert() {
        return (EAttribute)getKreuzungswinkel_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKurzzugschaltung_TypeClass() {
		if (kurzzugschaltung_TypeClassEClass == null) {
			kurzzugschaltung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(142);
		}
		return kurzzugschaltung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKurzzugschaltung_TypeClass_Wert() {
        return (EAttribute)getKurzzugschaltung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLagerung_Art_TypeClass() {
		if (lagerung_Art_TypeClassEClass == null) {
			lagerung_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(143);
		}
		return lagerung_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLagerung_Art_TypeClass_Wert() {
        return (EAttribute)getLagerung_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLFUE_Impuls_TypeClass() {
		if (lfuE_Impuls_TypeClassEClass == null) {
			lfuE_Impuls_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(144);
		}
		return lfuE_Impuls_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLFUE_Impuls_TypeClass_Wert() {
        return (EAttribute)getLFUE_Impuls_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLieferlaenge_TypeClass() {
		if (lieferlaenge_TypeClassEClass == null) {
			lieferlaenge_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(146);
		}
		return lieferlaenge_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLieferlaenge_TypeClass_Wert() {
        return (EAttribute)getLieferlaenge_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMontage_Ausgleichsgewichte_TypeClass() {
		if (montage_Ausgleichsgewichte_TypeClassEClass == null) {
			montage_Ausgleichsgewichte_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(147);
		}
		return montage_Ausgleichsgewichte_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMontage_Ausgleichsgewichte_TypeClass_Wert() {
        return (EAttribute)getMontage_Ausgleichsgewichte_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMontage_Besonders_TypeClass() {
		if (montage_Besonders_TypeClassEClass == null) {
			montage_Besonders_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(149);
		}
		return montage_Besonders_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMontage_Besonders_TypeClass_Wert() {
        return (EAttribute)getMontage_Besonders_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMontagehoehe_TypeClass() {
		if (montagehoehe_TypeClassEClass == null) {
			montagehoehe_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(151);
		}
		return montagehoehe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMontagehoehe_TypeClass_Wert() {
        return (EAttribute)getMontagehoehe_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptik_Durchmesser_TypeClass() {
		if (optik_Durchmesser_TypeClassEClass == null) {
			optik_Durchmesser_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(153);
		}
		return optik_Durchmesser_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOptik_Durchmesser_TypeClass_Wert() {
        return (EAttribute)getOptik_Durchmesser_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptik_Symbolmaske_TypeClass() {
		if (optik_Symbolmaske_TypeClassEClass == null) {
			optik_Symbolmaske_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(154);
		}
		return optik_Symbolmaske_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOptik_Symbolmaske_TypeClass_Wert() {
        return (EAttribute)getOptik_Symbolmaske_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPegel_TypeClass() {
		if (pegel_TypeClassEClass == null) {
			pegel_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(156);
		}
		return pegel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPegel_TypeClass_Wert() {
        return (EAttribute)getPegel_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPixel_Koordinate_X_TypeClass() {
		if (pixel_Koordinate_X_TypeClassEClass == null) {
			pixel_Koordinate_X_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(158);
		}
		return pixel_Koordinate_X_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixel_Koordinate_X_TypeClass_Wert() {
        return (EAttribute)getPixel_Koordinate_X_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPixel_Koordinate_Y_TypeClass() {
		if (pixel_Koordinate_Y_TypeClassEClass == null) {
			pixel_Koordinate_Y_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(160);
		}
		return pixel_Koordinate_Y_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixel_Koordinate_Y_TypeClass_Wert() {
        return (EAttribute)getPixel_Koordinate_Y_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRaeumstrecke_DAB_TypeClass() {
		if (raeumstrecke_DAB_TypeClassEClass == null) {
			raeumstrecke_DAB_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(162);
		}
		return raeumstrecke_DAB_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRaeumstrecke_DAB_TypeClass_Wert() {
        return (EAttribute)getRaeumstrecke_DAB_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRaeumstrecke_DBK_TypeClass() {
		if (raeumstrecke_DBK_TypeClassEClass == null) {
			raeumstrecke_DBK_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(164);
		}
		return raeumstrecke_DBK_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRaeumstrecke_DBK_TypeClass_Wert() {
        return (EAttribute)getRaeumstrecke_DBK_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRaeumstrecke_DCK_TypeClass() {
		if (raeumstrecke_DCK_TypeClassEClass == null) {
			raeumstrecke_DCK_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(166);
		}
		return raeumstrecke_DCK_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRaeumstrecke_DCK_TypeClass_Wert() {
        return (EAttribute)getRaeumstrecke_DCK_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRaeumstrecke_DSK_Strich_TypeClass() {
		if (raeumstrecke_DSK_Strich_TypeClassEClass == null) {
			raeumstrecke_DSK_Strich_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(168);
		}
		return raeumstrecke_DSK_Strich_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRaeumstrecke_DSK_Strich_TypeClass_Wert() {
        return (EAttribute)getRaeumstrecke_DSK_Strich_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRaeumstrecke_TypeClass() {
		if (raeumstrecke_TypeClassEClass == null) {
			raeumstrecke_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(170);
		}
		return raeumstrecke_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRaeumstrecke_TypeClass_Wert() {
        return (EAttribute)getRaeumstrecke_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRichtungspfeil_TypeClass() {
		if (richtungspfeil_TypeClassEClass == null) {
			richtungspfeil_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(171);
		}
		return richtungspfeil_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRichtungspfeil_TypeClass_Wert() {
        return (EAttribute)getRichtungspfeil_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSA_Schrankenbaum_AttributeGroup() {
		if (sA_Schrankenbaum_AttributeGroupEClass == null) {
			sA_Schrankenbaum_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(172);
		}
		return sA_Schrankenbaum_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSA_Schrankenbaum_AttributeGroup_Ausrichtung() {
        return (EReference)getSA_Schrankenbaum_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSA_Schrankenbaum_AttributeGroup_AusrichtungWinkel() {
        return (EReference)getSA_Schrankenbaum_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSA_Schrankenbaum_AttributeGroup_Baumprofil() {
        return (EReference)getSA_Schrankenbaum_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSA_Schrankenbaum_AttributeGroup_Gitterbehang() {
        return (EReference)getSA_Schrankenbaum_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSA_Schrankenbaum_AttributeGroup_LagerungArt() {
        return (EReference)getSA_Schrankenbaum_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSA_Schrankenbaum_AttributeGroup_Lieferlaenge() {
        return (EReference)getSA_Schrankenbaum_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSA_Schrankenbaum_AttributeGroup_MontageAusgleichsgewichte() {
        return (EReference)getSA_Schrankenbaum_AttributeGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSA_Schrankenbaum_AttributeGroup_Sperrlaenge() {
        return (EReference)getSA_Schrankenbaum_AttributeGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchaltgruppe_TypeClass() {
		if (schaltgruppe_TypeClassEClass == null) {
			schaltgruppe_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(174);
		}
		return schaltgruppe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchaltgruppe_TypeClass_Wert() {
        return (EAttribute)getSchaltgruppe_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchaltmittel_Fstr_Zuordnung() {
		if (schaltmittel_Fstr_ZuordnungEClass == null) {
			schaltmittel_Fstr_ZuordnungEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(175);
		}
		return schaltmittel_Fstr_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchaltmittel_Fstr_Zuordnung_IDBUEWSFstrZuordnung() {
        return (EReference)getSchaltmittel_Fstr_Zuordnung().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchaltmittel_Fstr_Zuordnung_IDSchaltmittelZuordnung() {
        return (EReference)getSchaltmittel_Fstr_Zuordnung().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchrankenantrieb() {
		if (schrankenantriebEClass == null) {
			schrankenantriebEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(176);
		}
		return schrankenantriebEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchrankenantrieb_Bezeichnung() {
        return (EReference)getSchrankenantrieb().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchrankenantrieb_IDBUEAnlage() {
        return (EReference)getSchrankenantrieb().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchrankenantrieb_SASchrankenbaum() {
        return (EReference)getSchrankenantrieb().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchrankenantrieb_SchrankenantriebAllg() {
        return (EReference)getSchrankenantrieb().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchrankenantrieb_Allg_AttributeGroup() {
		if (schrankenantrieb_Allg_AttributeGroupEClass == null) {
			schrankenantrieb_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(177);
		}
		return schrankenantrieb_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchrankenantrieb_Allg_AttributeGroup_AbstandGehwegFahrbahn() {
        return (EReference)getSchrankenantrieb_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchrankenantrieb_Allg_AttributeGroup_Hersteller() {
        return (EReference)getSchrankenantrieb_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchrankenantrieb_Allg_AttributeGroup_Schaltgruppe() {
        return (EReference)getSchrankenantrieb_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchrankenantrieb_Bezeichnung_AttributeGroup() {
		if (schrankenantrieb_Bezeichnung_AttributeGroupEClass == null) {
			schrankenantrieb_Bezeichnung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(178);
		}
		return schrankenantrieb_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchrankenantrieb_Bezeichnung_AttributeGroup_BezSchrankenantrieb() {
        return (EReference)getSchrankenantrieb_Bezeichnung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchutzbuegel_TypeClass() {
		if (schutzbuegel_TypeClassEClass == null) {
			schutzbuegel_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(180);
		}
		return schutzbuegel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchutzbuegel_TypeClass_Wert() {
        return (EAttribute)getSchutzbuegel_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSicherheitsabstand_TypeClass() {
		if (sicherheitsabstand_TypeClassEClass == null) {
			sicherheitsabstand_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(183);
		}
		return sicherheitsabstand_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSicherheitsabstand_TypeClass_Wert() {
        return (EAttribute)getSicherheitsabstand_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignalverz_Errechnet_TypeClass() {
		if (signalverz_Errechnet_TypeClassEClass == null) {
			signalverz_Errechnet_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(185);
		}
		return signalverz_Errechnet_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalverz_Errechnet_TypeClass_Wert() {
        return (EAttribute)getSignalverz_Errechnet_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignalverz_Gewaehlt_TypeClass() {
		if (signalverz_Gewaehlt_TypeClassEClass == null) {
			signalverz_Gewaehlt_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(187);
		}
		return signalverz_Gewaehlt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalverz_Gewaehlt_TypeClass_Wert() {
        return (EAttribute)getSignalverz_Gewaehlt_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSperrlaenge_TypeClass() {
		if (sperrlaenge_TypeClassEClass == null) {
			sperrlaenge_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(189);
		}
		return sperrlaenge_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSperrlaenge_TypeClass_Wert() {
        return (EAttribute)getSperrlaenge_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSperrstrecke_Fussgaenger_TypeClass() {
		if (sperrstrecke_Fussgaenger_TypeClassEClass == null) {
			sperrstrecke_Fussgaenger_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(191);
		}
		return sperrstrecke_Fussgaenger_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSperrstrecke_Fussgaenger_TypeClass_Wert() {
        return (EAttribute)getSperrstrecke_Fussgaenger_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSperrstrecke_TypeClass() {
		if (sperrstrecke_TypeClassEClass == null) {
			sperrstrecke_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(193);
		}
		return sperrstrecke_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSperrstrecke_TypeClass_Wert() {
        return (EAttribute)getSperrstrecke_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoerhalt_Haltfall_TypeClass() {
		if (stoerhalt_Haltfall_TypeClassEClass == null) {
			stoerhalt_Haltfall_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(194);
		}
		return stoerhalt_Haltfall_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoerhalt_Haltfall_TypeClass_Wert() {
        return (EAttribute)getStoerhalt_Haltfall_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoerhalt_Merkhinweis_TypeClass() {
		if (stoerhalt_Merkhinweis_TypeClassEClass == null) {
			stoerhalt_Merkhinweis_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(195);
		}
		return stoerhalt_Merkhinweis_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoerhalt_Merkhinweis_TypeClass_Wert() {
        return (EAttribute)getStoerhalt_Merkhinweis_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeilsperrstrecke_TypeClass() {
		if (teilsperrstrecke_TypeClassEClass == null) {
			teilsperrstrecke_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(197);
		}
		return teilsperrstrecke_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeilsperrstrecke_TypeClass_Wert() {
        return (EAttribute)getTeilsperrstrecke_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeilvorgabezeit_TypeClass() {
		if (teilvorgabezeit_TypeClassEClass == null) {
			teilvorgabezeit_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(199);
		}
		return teilvorgabezeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeilvorgabezeit_TypeClass_Wert() {
        return (EAttribute)getTeilvorgabezeit_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTragkopf_Verstellbar_TypeClass() {
		if (tragkopf_Verstellbar_TypeClassEClass == null) {
			tragkopf_Verstellbar_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(201);
		}
		return tragkopf_Verstellbar_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTragkopf_Verstellbar_TypeClass_Wert() {
        return (EAttribute)getTragkopf_Verstellbar_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Max_Schiene_TypeClass() {
		if (v_Max_Schiene_TypeClassEClass == null) {
			v_Max_Schiene_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(204);
		}
		return v_Max_Schiene_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getV_Max_Schiene_TypeClass_Wert() {
        return (EAttribute)getV_Max_Schiene_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Max_Strasse_TypeClass() {
		if (v_Max_Strasse_TypeClassEClass == null) {
			v_Max_Strasse_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(206);
		}
		return v_Max_Strasse_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getV_Max_Strasse_TypeClass_Wert() {
        return (EAttribute)getV_Max_Strasse_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Min_Fussweg_TypeClass() {
		if (v_Min_Fussweg_TypeClassEClass == null) {
			v_Min_Fussweg_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(208);
		}
		return v_Min_Fussweg_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getV_Min_Fussweg_TypeClass_Wert() {
        return (EAttribute)getV_Min_Fussweg_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Min_Schiene_TypeClass() {
		if (v_Min_Schiene_TypeClassEClass == null) {
			v_Min_Schiene_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(210);
		}
		return v_Min_Schiene_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getV_Min_Schiene_TypeClass_Wert() {
        return (EAttribute)getV_Min_Schiene_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Min_Strasse_TypeClass() {
		if (v_Min_Strasse_TypeClassEClass == null) {
			v_Min_Strasse_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(212);
		}
		return v_Min_Strasse_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getV_Min_Strasse_TypeClass_Wert() {
        return (EAttribute)getV_Min_Strasse_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerkehrszeichen() {
		if (verkehrszeichenEClass == null) {
			verkehrszeichenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(213);
		}
		return verkehrszeichenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Bezeichnung() {
        return (EReference)getVerkehrszeichen().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_IDBUEAnlage() {
        return (EReference)getVerkehrszeichen().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_IDUnterbringung() {
        return (EReference)getVerkehrszeichen().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_VerkehrszeichenAllg() {
        return (EReference)getVerkehrszeichen().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_VerkehrszeichenAndreaskreuz() {
        return (EReference)getVerkehrszeichen().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_VerkehrszeichenLz() {
        return (EReference)getVerkehrszeichen().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_VzSperrstrecke() {
        return (EReference)getVerkehrszeichen().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerkehrszeichen_Allg_AttributeGroup() {
		if (verkehrszeichen_Allg_AttributeGroupEClass == null) {
			verkehrszeichen_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(214);
		}
		return verkehrszeichen_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Allg_AttributeGroup_AbstandGehwegFahrbahn() {
        return (EReference)getVerkehrszeichen_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Allg_AttributeGroup_Ausrichtung() {
        return (EReference)getVerkehrszeichen_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Allg_AttributeGroup_AusrichtungWinkel() {
        return (EReference)getVerkehrszeichen_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerkehrszeichen_Andreaskreuz_AttributeGroup() {
		if (verkehrszeichen_Andreaskreuz_AttributeGroupEClass == null) {
			verkehrszeichen_Andreaskreuz_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(215);
		}
		return verkehrszeichen_Andreaskreuz_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Andreaskreuz_AttributeGroup_Blitzpfeil() {
        return (EReference)getVerkehrszeichen_Andreaskreuz_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Andreaskreuz_AttributeGroup_MontageBesonders() {
        return (EReference)getVerkehrszeichen_Andreaskreuz_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Andreaskreuz_AttributeGroup_Richtungspfeil() {
        return (EReference)getVerkehrszeichen_Andreaskreuz_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Andreaskreuz_AttributeGroup_Schutzbuegel() {
        return (EReference)getVerkehrszeichen_Andreaskreuz_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Andreaskreuz_AttributeGroup_Zusatzschild() {
        return (EReference)getVerkehrszeichen_Andreaskreuz_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerkehrszeichen_Bezeichnung_AttributeGroup() {
		if (verkehrszeichen_Bezeichnung_AttributeGroupEClass == null) {
			verkehrszeichen_Bezeichnung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(216);
		}
		return verkehrszeichen_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Bezeichnung_AttributeGroup_BezeichnungVerkehrszeichen() {
        return (EReference)getVerkehrszeichen_Bezeichnung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerkehrszeichen_Lz_AttributeGroup() {
		if (verkehrszeichen_Lz_AttributeGroupEClass == null) {
			verkehrszeichen_Lz_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(217);
		}
		return verkehrszeichen_Lz_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Lz_AttributeGroup_AkustikFussgaenger() {
        return (EReference)getVerkehrszeichen_Lz_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Lz_AttributeGroup_Kontrastblende() {
        return (EReference)getVerkehrszeichen_Lz_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Lz_AttributeGroup_OptikDurchmesser() {
        return (EReference)getVerkehrszeichen_Lz_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Lz_AttributeGroup_OptikSymbolmaske() {
        return (EReference)getVerkehrszeichen_Lz_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Lz_AttributeGroup_Schaltgruppe() {
        return (EReference)getVerkehrszeichen_Lz_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Lz_AttributeGroup_TragkopfVerstellbar() {
        return (EReference)getVerkehrszeichen_Lz_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerkehrszeichen_Lz_AttributeGroup_Vorgeschaltet() {
        return (EReference)getVerkehrszeichen_Lz_AttributeGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVorgeschaltet_TypeClass() {
		if (vorgeschaltet_TypeClassEClass == null) {
			vorgeschaltet_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(219);
		}
		return vorgeschaltet_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVorgeschaltet_TypeClass_Wert() {
        return (EAttribute)getVorgeschaltet_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVz_Sperrstrecke_AttributeGroup() {
		if (vz_Sperrstrecke_AttributeGroupEClass == null) {
			vz_Sperrstrecke_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(221);
		}
		return vz_Sperrstrecke_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVz_Sperrstrecke_AttributeGroup_VzSperrstreckeVorgeschaltet() {
        return (EReference)getVz_Sperrstrecke_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVz_Sperrstrecke_AttributeGroup_Sperrstrecke() {
        return (EReference)getVz_Sperrstrecke_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVz_Sperrstrecke_AttributeGroup_SperrstreckeFussgaenger() {
        return (EReference)getVz_Sperrstrecke_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVz_Sperrstrecke_AttributeGroup_VzSperrstreckeSchranke() {
        return (EReference)getVz_Sperrstrecke_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVz_Sperrstrecke_Schranke_AttributeGroup() {
		if (vz_Sperrstrecke_Schranke_AttributeGroupEClass == null) {
			vz_Sperrstrecke_Schranke_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(222);
		}
		return vz_Sperrstrecke_Schranke_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVz_Sperrstrecke_Schranke_AttributeGroup_Raeumstrecke() {
        return (EReference)getVz_Sperrstrecke_Schranke_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVz_Sperrstrecke_Schranke_AttributeGroup_Teilsperrstrecke() {
        return (EReference)getVz_Sperrstrecke_Schranke_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup() {
		if (vz_Sperrstrecke_Vorgeschaltet_AttributeGroupEClass == null) {
			vz_Sperrstrecke_Vorgeschaltet_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(223);
		}
		return vz_Sperrstrecke_Vorgeschaltet_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_BeeinflussungStrassenverkehr() {
        return (EReference)getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDAB() {
        return (EReference)getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDBK() {
        return (EReference)getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDCK() {
        return (EReference)getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDSKStrich() {
        return (EReference)getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWinkel_Alpha_TypeClass() {
		if (winkel_Alpha_TypeClassEClass == null) {
			winkel_Alpha_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(225);
		}
		return winkel_Alpha_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWinkel_Alpha_TypeClass_Wert() {
        return (EAttribute)getWinkel_Alpha_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZeitueberschreitungsmeldung_TypeClass() {
		if (zeitueberschreitungsmeldung_TypeClassEClass == null) {
			zeitueberschreitungsmeldung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(227);
		}
		return zeitueberschreitungsmeldung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZeitueberschreitungsmeldung_TypeClass_Wert() {
        return (EAttribute)getZeitueberschreitungsmeldung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZusatzschild_TypeClass() {
		if (zusatzschild_TypeClassEClass == null) {
			zusatzschild_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(229);
		}
		return zusatzschild_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZusatzschild_TypeClass_Wert() {
        return (EAttribute)getZusatzschild_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBaumprofil() {
		if (enumBaumprofilEEnum == null) {
			enumBaumprofilEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(73);
		}
		return enumBaumprofilEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBUEBauart() {
		if (enumbueBauartEEnum == null) {
			enumbueBauartEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(75);
		}
		return enumbueBauartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBUEFunktionsueberwachung() {
		if (enumbueFunktionsueberwachungEEnum == null) {
			enumbueFunktionsueberwachungEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(77);
		}
		return enumbueFunktionsueberwachungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBUEHandschalteinrichtung() {
		if (enumbueHandschalteinrichtungEEnum == null) {
			enumbueHandschalteinrichtungEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(79);
		}
		return enumbueHandschalteinrichtungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBUESicherungsart() {
		if (enumbueSicherungsartEEnum == null) {
			enumbueSicherungsartEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(81);
		}
		return enumbueSicherungsartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBUETechnik() {
		if (enumbueTechnikEEnum == null) {
			enumbueTechnikEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(83);
		}
		return enumbueTechnikEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFueSchaltfall() {
		if (enumFueSchaltfallEEnum == null) {
			enumFueSchaltfallEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(85);
		}
		return enumFueSchaltfallEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFussRadwegArt() {
		if (enumFussRadwegArtEEnum == null) {
			enumFussRadwegArtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(87);
		}
		return enumFussRadwegArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFussRadwegSeite() {
		if (enumFussRadwegSeiteEEnum == null) {
			enumFussRadwegSeiteEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(89);
		}
		return enumFussRadwegSeiteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGFRArt() {
		if (enumgfrArtEEnum == null) {
			enumgfrArtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(91);
		}
		return enumgfrArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMHpErsatzstecker() {
		if (enumHpErsatzsteckerEEnum == null) {
			enumHpErsatzsteckerEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(93);
		}
		return enumHpErsatzsteckerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMKlassifizierung() {
		if (enumKlassifizierungEEnum == null) {
			enumKlassifizierungEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(95);
		}
		return enumKlassifizierungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMLagerung() {
		if (enumLagerungEEnum == null) {
			enumLagerungEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(97);
		}
		return enumLagerungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMLFUEImpuls() {
		if (enumlfueImpulsEEnum == null) {
			enumlfueImpulsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(99);
		}
		return enumlfueImpulsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMMontageAusgleichsgewichte() {
		if (enumMontageAusgleichsgewichteEEnum == null) {
			enumMontageAusgleichsgewichteEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(101);
		}
		return enumMontageAusgleichsgewichteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMOptikSymbol() {
		if (enumOptikSymbolEEnum == null) {
			enumOptikSymbolEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(103);
		}
		return enumOptikSymbolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMRichtungspfeil() {
		if (enumRichtungspfeilEEnum == null) {
			enumRichtungspfeilEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(105);
		}
		return enumRichtungspfeilEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAbstand_Gehweg_Fahrbahn_Type() {
		if (abstand_Gehweg_Fahrbahn_TypeEDataType == null) {
			abstand_Gehweg_Fahrbahn_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(0);
		}
		return abstand_Gehweg_Fahrbahn_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAkustik_Fussgaenger_Type() {
		if (akustik_Fussgaenger_TypeEDataType == null) {
			akustik_Fussgaenger_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(2);
		}
		return akustik_Fussgaenger_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAkustik_Fussgaenger_TypeObject() {
		if (akustik_Fussgaenger_TypeObjectEDataType == null) {
			akustik_Fussgaenger_TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(4);
		}
		return akustik_Fussgaenger_TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAusrichtung_Winkel_Type() {
		if (ausrichtung_Winkel_TypeEDataType == null) {
			ausrichtung_Winkel_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(6);
		}
		return ausrichtung_Winkel_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBaulast_Type() {
		if (baulast_TypeEDataType == null) {
			baulast_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(9);
		}
		return baulast_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBeeinflussung_Strassenverkehr_Type() {
		if (beeinflussung_Strassenverkehr_TypeEDataType == null) {
			beeinflussung_Strassenverkehr_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(12);
		}
		return beeinflussung_Strassenverkehr_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBez_Schrankenantrieb_Type() {
		if (bez_Schrankenantrieb_TypeEDataType == null) {
			bez_Schrankenantrieb_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(14);
		}
		return bez_Schrankenantrieb_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_BUE_GFR_Eckpunkt_Type() {
		if (bezeichnung_BUE_GFR_Eckpunkt_TypeEDataType == null) {
			bezeichnung_BUE_GFR_Eckpunkt_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(16);
		}
		return bezeichnung_BUE_GFR_Eckpunkt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_GFR_Element_Type() {
		if (bezeichnung_GFR_Element_TypeEDataType == null) {
			bezeichnung_GFR_Element_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(18);
		}
		return bezeichnung_GFR_Element_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_GFR_Tripelspiegel_Type() {
		if (bezeichnung_GFR_Tripelspiegel_TypeEDataType == null) {
			bezeichnung_GFR_Tripelspiegel_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(20);
		}
		return bezeichnung_GFR_Tripelspiegel_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Verkehrszeichen_Type() {
		if (bezeichnung_Verkehrszeichen_TypeEDataType == null) {
			bezeichnung_Verkehrszeichen_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(22);
		}
		return bezeichnung_Verkehrszeichen_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBlitzpfeil_Type() {
		if (blitzpfeil_TypeEDataType == null) {
			blitzpfeil_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(24);
		}
		return blitzpfeil_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBlitzpfeil_TypeObject() {
		if (blitzpfeil_TypeObjectEDataType == null) {
			blitzpfeil_TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(26);
		}
		return blitzpfeil_TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBUE_Nachlaufzeit_Type() {
		if (buE_Nachlaufzeit_TypeEDataType == null) {
			buE_Nachlaufzeit_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(53);
		}
		return buE_Nachlaufzeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBUE_Neigung_Type() {
		if (buE_Neigung_TypeEDataType == null) {
			buE_Neigung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(55);
		}
		return buE_Neigung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBUE_Sicherungszeit_Type() {
		if (buE_Sicherungszeit_TypeEDataType == null) {
			buE_Sicherungszeit_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(60);
		}
		return buE_Sicherungszeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBUE_Strasse_Type() {
		if (buE_Strasse_TypeEDataType == null) {
			buE_Strasse_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(63);
		}
		return buE_Strasse_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBUE_Vorlaufzeit_Type() {
		if (buE_Vorlaufzeit_TypeEDataType == null) {
			buE_Vorlaufzeit_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(66);
		}
		return buE_Vorlaufzeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEinschaltverz_Errechnet_Type() {
		if (einschaltverz_Errechnet_TypeEDataType == null) {
			einschaltverz_Errechnet_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(69);
		}
		return einschaltverz_Errechnet_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEinschaltverz_Gewaehlt_Type() {
		if (einschaltverz_Gewaehlt_TypeEDataType == null) {
			einschaltverz_Gewaehlt_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(71);
		}
		return einschaltverz_Gewaehlt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBaumprofilObject() {
		if (enumBaumprofilObjectEDataType == null) {
			enumBaumprofilObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(74);
		}
		return enumBaumprofilObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBUEBauartObject() {
		if (enumbueBauartObjectEDataType == null) {
			enumbueBauartObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(76);
		}
		return enumbueBauartObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBUEFunktionsueberwachungObject() {
		if (enumbueFunktionsueberwachungObjectEDataType == null) {
			enumbueFunktionsueberwachungObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(78);
		}
		return enumbueFunktionsueberwachungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBUEHandschalteinrichtungObject() {
		if (enumbueHandschalteinrichtungObjectEDataType == null) {
			enumbueHandschalteinrichtungObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(80);
		}
		return enumbueHandschalteinrichtungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBUESicherungsartObject() {
		if (enumbueSicherungsartObjectEDataType == null) {
			enumbueSicherungsartObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(82);
		}
		return enumbueSicherungsartObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBUETechnikObject() {
		if (enumbueTechnikObjectEDataType == null) {
			enumbueTechnikObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(84);
		}
		return enumbueTechnikObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFueSchaltfallObject() {
		if (enumFueSchaltfallObjectEDataType == null) {
			enumFueSchaltfallObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(86);
		}
		return enumFueSchaltfallObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFussRadwegArtObject() {
		if (enumFussRadwegArtObjectEDataType == null) {
			enumFussRadwegArtObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(88);
		}
		return enumFussRadwegArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFussRadwegSeiteObject() {
		if (enumFussRadwegSeiteObjectEDataType == null) {
			enumFussRadwegSeiteObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(90);
		}
		return enumFussRadwegSeiteObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGFRArtObject() {
		if (enumgfrArtObjectEDataType == null) {
			enumgfrArtObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(92);
		}
		return enumgfrArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMHpErsatzsteckerObject() {
		if (enumHpErsatzsteckerObjectEDataType == null) {
			enumHpErsatzsteckerObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(94);
		}
		return enumHpErsatzsteckerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMKlassifizierungObject() {
		if (enumKlassifizierungObjectEDataType == null) {
			enumKlassifizierungObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(96);
		}
		return enumKlassifizierungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMLagerungObject() {
		if (enumLagerungObjectEDataType == null) {
			enumLagerungObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(98);
		}
		return enumLagerungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMLFUEImpulsObject() {
		if (enumlfueImpulsObjectEDataType == null) {
			enumlfueImpulsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(100);
		}
		return enumlfueImpulsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMMontageAusgleichsgewichteObject() {
		if (enumMontageAusgleichsgewichteObjectEDataType == null) {
			enumMontageAusgleichsgewichteObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(102);
		}
		return enumMontageAusgleichsgewichteObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMOptikSymbolObject() {
		if (enumOptikSymbolObjectEDataType == null) {
			enumOptikSymbolObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(104);
		}
		return enumOptikSymbolObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMRichtungspfeilObject() {
		if (enumRichtungspfeilObjectEDataType == null) {
			enumRichtungspfeilObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(106);
		}
		return enumRichtungspfeilObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFahrbahn_Befestigung_Gleis_Type() {
		if (fahrbahn_Befestigung_Gleis_TypeEDataType == null) {
			fahrbahn_Befestigung_Gleis_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(108);
		}
		return fahrbahn_Befestigung_Gleis_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFahrbahn_Befestigung_Type() {
		if (fahrbahn_Befestigung_TypeEDataType == null) {
			fahrbahn_Befestigung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(110);
		}
		return fahrbahn_Befestigung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFahrbahn_Breite_Type() {
		if (fahrbahn_Breite_TypeEDataType == null) {
			fahrbahn_Breite_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(112);
		}
		return fahrbahn_Breite_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGFR_Neigung_Type() {
		if (gfR_Neigung_TypeEDataType == null) {
			gfR_Neigung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(122);
		}
		return gfR_Neigung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGFR_Typ_Type() {
		if (gfR_Typ_TypeEDataType == null) {
			gfR_Typ_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(127);
		}
		return gfR_Typ_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGleis_Am_Bue_Type() {
		if (gleis_Am_Bue_TypeEDataType == null) {
			gleis_Am_Bue_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(130);
		}
		return gleis_Am_Bue_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHaltezeit_Type() {
		if (haltezeit_TypeEDataType == null) {
			haltezeit_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(132);
		}
		return haltezeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKontrastblende_Type() {
		if (kontrastblende_TypeEDataType == null) {
			kontrastblende_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(137);
		}
		return kontrastblende_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKontrastblende_TypeObject() {
		if (kontrastblende_TypeObjectEDataType == null) {
			kontrastblende_TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(139);
		}
		return kontrastblende_TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKreuzungswinkel_Type() {
		if (kreuzungswinkel_TypeEDataType == null) {
			kreuzungswinkel_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(140);
		}
		return kreuzungswinkel_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLieferlaenge_Type() {
		if (lieferlaenge_TypeEDataType == null) {
			lieferlaenge_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(145);
		}
		return lieferlaenge_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMontage_Besonders_Type() {
		if (montage_Besonders_TypeEDataType == null) {
			montage_Besonders_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(148);
		}
		return montage_Besonders_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMontagehoehe_Type() {
		if (montagehoehe_TypeEDataType == null) {
			montagehoehe_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(150);
		}
		return montagehoehe_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOptik_Durchmesser_Type() {
		if (optik_Durchmesser_TypeEDataType == null) {
			optik_Durchmesser_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(152);
		}
		return optik_Durchmesser_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPegel_Type() {
		if (pegel_TypeEDataType == null) {
			pegel_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(155);
		}
		return pegel_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPixel_Koordinate_X_Type() {
		if (pixel_Koordinate_X_TypeEDataType == null) {
			pixel_Koordinate_X_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(157);
		}
		return pixel_Koordinate_X_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPixel_Koordinate_Y_Type() {
		if (pixel_Koordinate_Y_TypeEDataType == null) {
			pixel_Koordinate_Y_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(159);
		}
		return pixel_Koordinate_Y_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRaeumstrecke_DAB_Type() {
		if (raeumstrecke_DAB_TypeEDataType == null) {
			raeumstrecke_DAB_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(161);
		}
		return raeumstrecke_DAB_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRaeumstrecke_DBK_Type() {
		if (raeumstrecke_DBK_TypeEDataType == null) {
			raeumstrecke_DBK_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(163);
		}
		return raeumstrecke_DBK_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRaeumstrecke_DCK_Type() {
		if (raeumstrecke_DCK_TypeEDataType == null) {
			raeumstrecke_DCK_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(165);
		}
		return raeumstrecke_DCK_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRaeumstrecke_DSK_Strich_Type() {
		if (raeumstrecke_DSK_Strich_TypeEDataType == null) {
			raeumstrecke_DSK_Strich_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(167);
		}
		return raeumstrecke_DSK_Strich_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRaeumstrecke_Type() {
		if (raeumstrecke_TypeEDataType == null) {
			raeumstrecke_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(169);
		}
		return raeumstrecke_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSchaltgruppe_Type() {
		if (schaltgruppe_TypeEDataType == null) {
			schaltgruppe_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(173);
		}
		return schaltgruppe_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSchutzbuegel_Type() {
		if (schutzbuegel_TypeEDataType == null) {
			schutzbuegel_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(179);
		}
		return schutzbuegel_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSchutzbuegel_TypeObject() {
		if (schutzbuegel_TypeObjectEDataType == null) {
			schutzbuegel_TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(181);
		}
		return schutzbuegel_TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSicherheitsabstand_Type() {
		if (sicherheitsabstand_TypeEDataType == null) {
			sicherheitsabstand_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(182);
		}
		return sicherheitsabstand_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSignalverz_Errechnet_Type() {
		if (signalverz_Errechnet_TypeEDataType == null) {
			signalverz_Errechnet_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(184);
		}
		return signalverz_Errechnet_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSignalverz_Gewaehlt_Type() {
		if (signalverz_Gewaehlt_TypeEDataType == null) {
			signalverz_Gewaehlt_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(186);
		}
		return signalverz_Gewaehlt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSperrlaenge_Type() {
		if (sperrlaenge_TypeEDataType == null) {
			sperrlaenge_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(188);
		}
		return sperrlaenge_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSperrstrecke_Fussgaenger_Type() {
		if (sperrstrecke_Fussgaenger_TypeEDataType == null) {
			sperrstrecke_Fussgaenger_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(190);
		}
		return sperrstrecke_Fussgaenger_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSperrstrecke_Type() {
		if (sperrstrecke_TypeEDataType == null) {
			sperrstrecke_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(192);
		}
		return sperrstrecke_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTeilsperrstrecke_Type() {
		if (teilsperrstrecke_TypeEDataType == null) {
			teilsperrstrecke_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(196);
		}
		return teilsperrstrecke_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTeilvorgabezeit_Type() {
		if (teilvorgabezeit_TypeEDataType == null) {
			teilvorgabezeit_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(198);
		}
		return teilvorgabezeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTragkopf_Verstellbar_Type() {
		if (tragkopf_Verstellbar_TypeEDataType == null) {
			tragkopf_Verstellbar_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(200);
		}
		return tragkopf_Verstellbar_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTragkopf_Verstellbar_TypeObject() {
		if (tragkopf_Verstellbar_TypeObjectEDataType == null) {
			tragkopf_Verstellbar_TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(202);
		}
		return tragkopf_Verstellbar_TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getV_Max_Schiene_Type() {
		if (v_Max_Schiene_TypeEDataType == null) {
			v_Max_Schiene_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(203);
		}
		return v_Max_Schiene_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getV_Max_Strasse_Type() {
		if (v_Max_Strasse_TypeEDataType == null) {
			v_Max_Strasse_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(205);
		}
		return v_Max_Strasse_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getV_Min_Fussweg_Type() {
		if (v_Min_Fussweg_TypeEDataType == null) {
			v_Min_Fussweg_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(207);
		}
		return v_Min_Fussweg_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getV_Min_Schiene_Type() {
		if (v_Min_Schiene_TypeEDataType == null) {
			v_Min_Schiene_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(209);
		}
		return v_Min_Schiene_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getV_Min_Strasse_Type() {
		if (v_Min_Strasse_TypeEDataType == null) {
			v_Min_Strasse_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(211);
		}
		return v_Min_Strasse_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVorgeschaltet_Type() {
		if (vorgeschaltet_TypeEDataType == null) {
			vorgeschaltet_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(218);
		}
		return vorgeschaltet_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVorgeschaltet_TypeObject() {
		if (vorgeschaltet_TypeObjectEDataType == null) {
			vorgeschaltet_TypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(220);
		}
		return vorgeschaltet_TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getWinkel_Alpha_Type() {
		if (winkel_Alpha_TypeEDataType == null) {
			winkel_Alpha_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(224);
		}
		return winkel_Alpha_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZeitueberschreitungsmeldung_Type() {
		if (zeitueberschreitungsmeldung_TypeEDataType == null) {
			zeitueberschreitungsmeldung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(226);
		}
		return zeitueberschreitungsmeldung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZusatzschild_Type() {
		if (zusatzschild_TypeEDataType == null) {
			zusatzschild_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI).getEClassifiers().get(228);
		}
		return zusatzschild_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BahnuebergangFactory getBahnuebergangFactory() {
		return (BahnuebergangFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.eclipse.set.model.planpro.Bahnuebergang." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //BahnuebergangPackageImpl
