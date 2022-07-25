/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bedienung.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage;

import org.eclipse.set.model.model1902.Ansteuerung_Element.impl.Ansteuerung_ElementPackageImpl;

import org.eclipse.set.model.model1902.Bahnsteig.BahnsteigPackage;

import org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl;

import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Balisentechnik_ETCSPackageImpl;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model1902.BasisTypen.impl.BasisTypenPackageImpl;

import org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage;

import org.eclipse.set.model.model1902.Basisobjekte.impl.BasisobjektePackageImpl;

import org.eclipse.set.model.model1902.Bedienung.A_Wert_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Anbindung_IB2_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Anbindung_IB3_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.BSO_IP_Adressblock_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.BSO_Teilsystem_Art_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.B_Wert_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Anrueckabschnitt;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Anzeige_Element;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Anzeige_Element_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Einricht_Bauart_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Einricht_Oertl_Bez_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Einrichtung_Oertlich;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_GBT;
import org.eclipse.set.model.model1902.Bedienung.Bedien_GBT_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche_Bild;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Oertlichkeit;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Platz;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Platz_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Platz_Art_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Standort;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Standort_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Zentrale;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Zentrale_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedienplatzbezeichnung_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Bedienplatznummer_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Bedienraumnummer_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.BedienungFactory;
import org.eclipse.set.model.model1902.Bedienung.BedienungPackage;
import org.eclipse.set.model.model1902.Bedienung.Betriebsstellenbezeichner_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Bez_Bed_Anrueckabschnitt_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Bez_Bed_Anzeige_Element_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Bez_Bed_Zentrale_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Bezeichnung_BSO_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.C_Wert_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.DD_Wert_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.ENUMAWert;
import org.eclipse.set.model.model1902.Bedienung.ENUMBSOTeilsystemArt;
import org.eclipse.set.model.model1902.Bedienung.ENUMBedienEinrichtBauart;
import org.eclipse.set.model.model1902.Bedienung.ENUMBedienPlatzArt;
import org.eclipse.set.model.model1902.Bedienung.ENUMCWert;
import org.eclipse.set.model.model1902.Bedienung.ENUMMelder;
import org.eclipse.set.model.model1902.Bedienung.ENUMOberflaecheBildart;
import org.eclipse.set.model.model1902.Bedienung.ENUMSchalter;
import org.eclipse.set.model.model1902.Bedienung.ENUMTaste;
import org.eclipse.set.model.model1902.Bedienung.ENUMXWert;
import org.eclipse.set.model.model1902.Bedienung.Hersteller_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Hupe_Anschaltzeit_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.IP_Adressblock_Blau_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.IP_Adressblock_Blau_V4_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.IP_Adressblock_Blau_V6_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.IP_Adressblock_Grau_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.IP_Adressblock_Grau_V4_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.IP_Adressblock_Grau_V6_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Kennzahl_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Melder_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Oberflaeche_Bildart_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Oberflaeche_Zustaendigkeit_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Regionalbereich_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Rueckschauzeit_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Schalter_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Schrankreihe_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Steuerbezirksname_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Steuerbezirksnummer_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Taste_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Vorschauzeit_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.X_Wert_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.YY_Wert_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Y_Wert_TypeClass;

import org.eclipse.set.model.model1902.Bedienung.util.BedienungValidator;

import org.eclipse.set.model.model1902.Block.BlockPackage;

import org.eclipse.set.model.model1902.Block.impl.BlockPackageImpl;

import org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage;

import org.eclipse.set.model.model1902.Fahrstrasse.impl.FahrstrassePackageImpl;

import org.eclipse.set.model.model1902.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.model1902.Flankenschutz.impl.FlankenschutzPackageImpl;

import org.eclipse.set.model.model1902.Geodaten.GeodatenPackage;

import org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl;

import org.eclipse.set.model.model1902.Gleis.GleisPackage;

import org.eclipse.set.model.model1902.Gleis.impl.GleisPackageImpl;

import org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage;

import org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl;

import org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage;

import org.eclipse.set.model.model1902.Nahbedienbereich.impl.NahbedienbereichPackageImpl;

import org.eclipse.set.model.model1902.Ortung.OrtungPackage;

import org.eclipse.set.model.model1902.Ortung.impl.OrtungPackageImpl;

import org.eclipse.set.model.model1902.PZB.PZBPackage;

import org.eclipse.set.model.model1902.PZB.impl.PZBPackageImpl;

import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;

import org.eclipse.set.model.model1902.PlanPro.impl.PlanProPackageImpl;

import org.eclipse.set.model.model1902.Regelzeichnung.RegelzeichnungPackage;

import org.eclipse.set.model.model1902.Regelzeichnung.impl.RegelzeichnungPackageImpl;

import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl;

import org.eclipse.set.model.model1902.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

import org.eclipse.set.model.model1902.Signalbegriffe_Struktur.impl.Signalbegriffe_StrukturPackageImpl;

import org.eclipse.set.model.model1902.Signale.SignalePackage;

import org.eclipse.set.model.model1902.Signale.impl.SignalePackageImpl;

import org.eclipse.set.model.model1902.Verweise.VerweisePackage;

import org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl;

import org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage;

import org.eclipse.set.model.model1902.Zuglenkung.impl.ZuglenkungPackageImpl;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZugnummernmeldeanlagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BedienungPackageImpl extends EPackageImpl implements BedienungPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a_Wert_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anbindung_IB2_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anbindung_IB3_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass b_Wert_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_AnrueckabschnittEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Anzeige_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Anzeige_Element_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Anzeige_Element_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_BezirkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Bezirk_Adressformel_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Bezirk_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Bezirk_Anhaenge_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Einricht_Bauart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Einricht_Oertl_Bez_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Einricht_Oertlich_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Einrichtung_OertlichEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_GBTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_GBT_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_OberflaecheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Oberflaeche_Anhaenge_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Oberflaeche_BildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Oberflaeche_Bild_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_OertlichkeitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Oertlichkeit_Kennzahlen_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_PlatzEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Platz_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Platz_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_StandortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Standort_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_ZentraleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedien_Zentrale_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedienplatzbezeichnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedienplatznummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedienraumnummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass betriebsstellenbezeichner_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bez_Bed_Anrueckabschnitt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bez_Bed_Anzeige_Element_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bez_Bed_Zentrale_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_BSO_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsO_IP_AB_Teilsystem_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsO_IP_Adressblock_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsO_Teilsystem_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c_Wert_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dD_Wert_TypeClassEClass = null;

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
	private EClass hupe_Anschaltzeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iP_Adressblock_Blau_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iP_Adressblock_Blau_V4_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iP_Adressblock_Blau_V6_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iP_Adressblock_Grau_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iP_Adressblock_Grau_V4_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iP_Adressblock_Grau_V6_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kennzahl_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass melder_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oberflaeche_Bildart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oberflaeche_Zustaendigkeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionalbereich_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rueckschauzeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schalter_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schrankreihe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass steuerbezirksname_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass steuerbezirksnummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taste_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vorschauzeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x_Wert_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass y_Wert_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yY_Wert_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumaWertEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBedienEinrichtBauartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBedienPlatzArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumbsoTeilsystemArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumcWertEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumMelderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumOberflaecheBildartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSchalterEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTasteEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumxWertEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType b_Wert_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bedien_Einricht_Oertl_Bez_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bedienplatzbezeichnung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bedienplatznummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bedienraumnummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType betriebsstellenbezeichner_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bez_Bed_Anrueckabschnitt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bez_Bed_Anzeige_Element_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bez_Bed_Zentrale_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_BSO_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dD_Wert_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumaWertObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBedienEinrichtBauartObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBedienPlatzArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumbsoTeilsystemArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumcWertObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumMelderObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumOberflaecheBildartObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSchalterObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumTasteObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumxWertObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hupe_Anschaltzeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iP_Adressblock_Blau_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iP_Adressblock_Blau_V4_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iP_Adressblock_Blau_V6_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iP_Adressblock_Grau_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iP_Adressblock_Grau_V4_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iP_Adressblock_Grau_V6_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oberflaeche_Zustaendigkeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rueckschauzeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType schrankreihe_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType steuerbezirksname_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType steuerbezirksnummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vorschauzeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType y_Wert_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yY_Wert_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BedienungPackageImpl() {
		super(eNS_URI, BedienungFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BedienungPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BedienungPackage init() {
		if (isInited) return (BedienungPackage)EPackage.Registry.INSTANCE.getEPackage(BedienungPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBedienungPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BedienungPackageImpl theBedienungPackage = registeredBedienungPackage instanceof BedienungPackageImpl ? (BedienungPackageImpl)registeredBedienungPackage : new BedienungPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);
		VerweisePackageImpl theVerweisePackage = (VerweisePackageImpl)(registeredPackage instanceof VerweisePackageImpl ? registeredPackage : VerweisePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ansteuerung_ElementPackage.eNS_URI);
		Ansteuerung_ElementPackageImpl theAnsteuerung_ElementPackage = (Ansteuerung_ElementPackageImpl)(registeredPackage instanceof Ansteuerung_ElementPackageImpl ? registeredPackage : Ansteuerung_ElementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BahnsteigPackage.eNS_URI);
		BahnsteigPackageImpl theBahnsteigPackage = (BahnsteigPackageImpl)(registeredPackage instanceof BahnsteigPackageImpl ? registeredPackage : BahnsteigPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI);
		Balisentechnik_ETCSPackageImpl theBalisentechnik_ETCSPackage = (Balisentechnik_ETCSPackageImpl)(registeredPackage instanceof Balisentechnik_ETCSPackageImpl ? registeredPackage : Balisentechnik_ETCSPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BlockPackage.eNS_URI);
		BlockPackageImpl theBlockPackage = (BlockPackageImpl)(registeredPackage instanceof BlockPackageImpl ? registeredPackage : BlockPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI);
		BahnuebergangPackageImpl theBahnuebergangPackage = (BahnuebergangPackageImpl)(registeredPackage instanceof BahnuebergangPackageImpl ? registeredPackage : BahnuebergangPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NahbedienbereichPackage.eNS_URI);
		NahbedienbereichPackageImpl theNahbedienbereichPackage = (NahbedienbereichPackageImpl)(registeredPackage instanceof NahbedienbereichPackageImpl ? registeredPackage : NahbedienbereichPackage.eINSTANCE);
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

		// Load packages
		thePlanProPackage.loadPackage();
		theBalisentechnik_ETCSPackage.loadPackage();
		theBahnuebergangPackage.loadPackage();

		// Create package meta-data objects
		theBedienungPackage.createPackageContents();
		theBasisobjektePackage.createPackageContents();
		theBasisTypenPackage.createPackageContents();
		theVerweisePackage.createPackageContents();
		theAnsteuerung_ElementPackage.createPackageContents();
		theBahnsteigPackage.createPackageContents();
		theBlockPackage.createPackageContents();
		theFlankenschutzPackage.createPackageContents();
		theOrtungPackage.createPackageContents();
		theFahrstrassePackage.createPackageContents();
		theGeodatenPackage.createPackageContents();
		theWeichen_und_GleissperrenPackage.createPackageContents();
		theGleisPackage.createPackageContents();
		theMedien_und_TrassenPackage.createPackageContents();
		theNahbedienbereichPackage.createPackageContents();
		thePZBPackage.createPackageContents();
		theRegelzeichnungPackage.createPackageContents();
		theSchluesselabhaengigkeitenPackage.createPackageContents();
		theSignalePackage.createPackageContents();
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();

		// Initialize created meta-data
		theBedienungPackage.initializePackageContents();
		theBasisobjektePackage.initializePackageContents();
		theBasisTypenPackage.initializePackageContents();
		theVerweisePackage.initializePackageContents();
		theAnsteuerung_ElementPackage.initializePackageContents();
		theBahnsteigPackage.initializePackageContents();
		theBlockPackage.initializePackageContents();
		theFlankenschutzPackage.initializePackageContents();
		theOrtungPackage.initializePackageContents();
		theFahrstrassePackage.initializePackageContents();
		theGeodatenPackage.initializePackageContents();
		theWeichen_und_GleissperrenPackage.initializePackageContents();
		theGleisPackage.initializePackageContents();
		theMedien_und_TrassenPackage.initializePackageContents();
		theNahbedienbereichPackage.initializePackageContents();
		thePZBPackage.initializePackageContents();
		theRegelzeichnungPackage.initializePackageContents();
		theSchluesselabhaengigkeitenPackage.initializePackageContents();
		theSignalePackage.initializePackageContents();
		theSignalbegriffe_StrukturPackage.initializePackageContents();
		theZuglenkungPackage.initializePackageContents();
		theZugnummernmeldeanlagePackage.initializePackageContents();

		// Fix loaded packages
		thePlanProPackage.fixPackageContents();
		theBalisentechnik_ETCSPackage.fixPackageContents();
		theBahnuebergangPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBedienungPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return BedienungValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBedienungPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BedienungPackage.eNS_URI, theBedienungPackage);
		return theBedienungPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getA_Wert_TypeClass() {
		return a_Wert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getA_Wert_TypeClass_Wert() {
		return (EAttribute)a_Wert_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnbindung_IB2_TypeClass() {
		return anbindung_IB2_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnbindung_IB2_TypeClass_Wert() {
		return (EAttribute)anbindung_IB2_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnbindung_IB3_TypeClass() {
		return anbindung_IB3_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnbindung_IB3_TypeClass_Wert() {
		return (EAttribute)anbindung_IB3_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getB_Wert_TypeClass() {
		return b_Wert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getB_Wert_TypeClass_Wert() {
		return (EAttribute)b_Wert_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Anrueckabschnitt() {
		return bedien_AnrueckabschnittEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Anrueckabschnitt_IDGleisAbschnittPosition() {
		return (EReference)bedien_AnrueckabschnittEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Anrueckabschnitt_Bezeichnung() {
		return (EReference)bedien_AnrueckabschnittEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Anrueckabschnitt_IDGleisAbschnittDarstellen() {
		return (EReference)bedien_AnrueckabschnittEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup() {
		return bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup_BezBedAnrueckabschnitt() {
		return (EReference)bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Anzeige_Element() {
		return bedien_Anzeige_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Anzeige_Element_BedienAnzeigeElementAllg() {
		return (EReference)bedien_Anzeige_ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Anzeige_Element_Bezeichnung() {
		return (EReference)bedien_Anzeige_ElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Anzeige_Element_IDBedienEinrichtungOertlich() {
		return (EReference)bedien_Anzeige_ElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Anzeige_Element_IDVerknuepftesElement() {
		return (EReference)bedien_Anzeige_ElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Anzeige_Element_Allg_AttributeGroup() {
		return bedien_Anzeige_Element_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Anzeige_Element_Allg_AttributeGroup_Melder() {
		return (EReference)bedien_Anzeige_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Anzeige_Element_Allg_AttributeGroup_Schalter() {
		return (EReference)bedien_Anzeige_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Anzeige_Element_Allg_AttributeGroup_Taste() {
		return (EReference)bedien_Anzeige_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Anzeige_Element_Bezeichnung_AttributeGroup() {
		return bedien_Anzeige_Element_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Anzeige_Element_Bezeichnung_AttributeGroup_BezBedAnzeigeElement() {
		return (EReference)bedien_Anzeige_Element_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Bezirk() {
		return bedien_BezirkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_BedienBezirkAdressformel() {
		return (EReference)bedien_BezirkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_BedienBezirkAllg() {
		return (EReference)bedien_BezirkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_BedienBezirkAnhaenge() {
		return (EReference)bedien_BezirkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_IDBedienZentrale() {
		return (EReference)bedien_BezirkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Bezirk_Adressformel_AttributeGroup() {
		return bedien_Bezirk_Adressformel_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Adressformel_AttributeGroup_AWert() {
		return (EReference)bedien_Bezirk_Adressformel_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Adressformel_AttributeGroup_BWert() {
		return (EReference)bedien_Bezirk_Adressformel_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Adressformel_AttributeGroup_CWert() {
		return (EReference)bedien_Bezirk_Adressformel_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Adressformel_AttributeGroup_DDWert() {
		return (EReference)bedien_Bezirk_Adressformel_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Adressformel_AttributeGroup_XWert() {
		return (EReference)bedien_Bezirk_Adressformel_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Adressformel_AttributeGroup_YWert() {
		return (EReference)bedien_Bezirk_Adressformel_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Adressformel_AttributeGroup_YYWert() {
		return (EReference)bedien_Bezirk_Adressformel_AttributeGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Bezirk_Allg_AttributeGroup() {
		return bedien_Bezirk_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB2() {
		return (EReference)bedien_Bezirk_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB3() {
		return (EReference)bedien_Bezirk_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Allg_AttributeGroup_Hersteller() {
		return (EReference)bedien_Bezirk_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Allg_AttributeGroup_Schrankreihe() {
		return (EReference)bedien_Bezirk_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksname() {
		return (EReference)bedien_Bezirk_Allg_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksnummer() {
		return (EReference)bedien_Bezirk_Allg_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Bezirk_Anhaenge_AttributeGroup() {
		return bedien_Bezirk_Anhaenge_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB2() {
		return (EReference)bedien_Bezirk_Anhaenge_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB3() {
		return (EReference)bedien_Bezirk_Anhaenge_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangSteuerbezUebersicht() {
		return (EReference)bedien_Bezirk_Anhaenge_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Einricht_Bauart_TypeClass() {
		return bedien_Einricht_Bauart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBedien_Einricht_Bauart_TypeClass_Wert() {
		return (EAttribute)bedien_Einricht_Bauart_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Einricht_Oertl_Bez_TypeClass() {
		return bedien_Einricht_Oertl_Bez_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBedien_Einricht_Oertl_Bez_TypeClass_Wert() {
		return (EAttribute)bedien_Einricht_Oertl_Bez_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Einricht_Oertlich_Allg_AttributeGroup() {
		return bedien_Einricht_Oertlich_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Einricht_Oertlich_Allg_AttributeGroup_BedienEinrichtBauart() {
		return (EReference)bedien_Einricht_Oertlich_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Einricht_Oertlich_Allg_AttributeGroup_HupeAnschaltzeit() {
		return (EReference)bedien_Einricht_Oertlich_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Einrichtung_Oertlich() {
		return bedien_Einrichtung_OertlichEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Einrichtung_Oertlich_BedienEinrichtOertlichAllg() {
		return (EReference)bedien_Einrichtung_OertlichEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Einrichtung_Oertlich_Bezeichnung() {
		return (EReference)bedien_Einrichtung_OertlichEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Einrichtung_Oertlich_IDAnhangBenutzeroberflaeche() {
		return (EReference)bedien_Einrichtung_OertlichEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Einrichtung_Oertlich_IDAussenelementansteuerung() {
		return (EReference)bedien_Einrichtung_OertlichEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Einrichtung_Oertlich_IDUnterbringung() {
		return (EReference)bedien_Einrichtung_OertlichEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup() {
		return bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup_BedienEinrichtOertlBez() {
		return (EReference)bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_GBT() {
		return bedien_GBTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_GBT_BedienGBTAllg() {
		return (EReference)bedien_GBTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_GBT_IDAnhangVorgabeGBT() {
		return (EReference)bedien_GBTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_GBT_IDBedienBezirk() {
		return (EReference)bedien_GBTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_GBT_Allg_AttributeGroup() {
		return bedien_GBT_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_GBT_Allg_AttributeGroup_Rueckschauzeit() {
		return (EReference)bedien_GBT_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_GBT_Allg_AttributeGroup_Vorschauzeit() {
		return (EReference)bedien_GBT_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Oberflaeche() {
		return bedien_OberflaecheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oberflaeche_BedienOberflaecheAnhaenge() {
		return (EReference)bedien_OberflaecheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oberflaeche_IDBedienBezirk() {
		return (EReference)bedien_OberflaecheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Oberflaeche_Anhaenge_AttributeGroup() {
		return bedien_Oberflaeche_Anhaenge_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangMonitoraufteilung() {
		return (EReference)bedien_Oberflaeche_Anhaenge_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangRichtungssinn() {
		return (EReference)bedien_Oberflaeche_Anhaenge_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangVorgabeBELU() {
		return (EReference)bedien_Oberflaeche_Anhaenge_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Oberflaeche_Bild() {
		return bedien_Oberflaeche_BildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oberflaeche_Bild_BedienOberflaecheBildAllg() {
		return (EReference)bedien_Oberflaeche_BildEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oberflaeche_Bild_IDBedienOberflaeche() {
		return (EReference)bedien_Oberflaeche_BildEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oberflaeche_Bild_IDOertlichkeit() {
		return (EReference)bedien_Oberflaeche_BildEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Oberflaeche_Bild_Allg_AttributeGroup() {
		return bedien_Oberflaeche_Bild_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheBildart() {
		return (EReference)bedien_Oberflaeche_Bild_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheZustaendigkeit() {
		return (EReference)bedien_Oberflaeche_Bild_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Oertlichkeit() {
		return bedien_OertlichkeitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oertlichkeit_BedienOertlichkeitKennzahlen() {
		return (EReference)bedien_OertlichkeitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oertlichkeit_IDBedienBezirk() {
		return (EReference)bedien_OertlichkeitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oertlichkeit_IDOertlichkeit() {
		return (EReference)bedien_OertlichkeitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Oertlichkeit_Kennzahlen_AttributeGroup() {
		return bedien_Oertlichkeit_Kennzahlen_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Betriebsstellenbezeichner() {
		return (EReference)bedien_Oertlichkeit_Kennzahlen_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Kennzahl() {
		return (EReference)bedien_Oertlichkeit_Kennzahlen_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Platz() {
		return bedien_PlatzEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Platz_BedienPlatzAllg() {
		return (EReference)bedien_PlatzEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Platz_IDAnhangMoebelplanAufriss() {
		return (EReference)bedien_PlatzEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Platz_IDAnhangMoebelplanGrundriss() {
		return (EReference)bedien_PlatzEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Platz_IDUnterbringung() {
		return (EReference)bedien_PlatzEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Platz_IDBedienBezirk() {
		return (EReference)bedien_PlatzEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Platz_IDESTWZentraleinheit() {
		return (EReference)bedien_PlatzEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Platz_Allg_AttributeGroup() {
		return bedien_Platz_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Platz_Allg_AttributeGroup_BedienPlatzArt() {
		return (EReference)bedien_Platz_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Platz_Allg_AttributeGroup_Bedienplatzbezeichnung() {
		return (EReference)bedien_Platz_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Platz_Allg_AttributeGroup_Bedienplatznummer() {
		return (EReference)bedien_Platz_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Platz_Allg_AttributeGroup_Bedienraumnummer() {
		return (EReference)bedien_Platz_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Platz_Art_TypeClass() {
		return bedien_Platz_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBedien_Platz_Art_TypeClass_Wert() {
		return (EAttribute)bedien_Platz_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Standort() {
		return bedien_StandortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Standort_Bezeichnung() {
		return (EReference)bedien_StandortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Standort_BSOIPAdressblock() {
		return (EReference)bedien_StandortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Standort_IDUnterbringung() {
		return (EReference)bedien_StandortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Standort_Bezeichnung_AttributeGroup() {
		return bedien_Standort_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Standort_Bezeichnung_AttributeGroup_BezeichnungBSO() {
		return (EReference)bedien_Standort_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Zentrale() {
		return bedien_ZentraleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Zentrale_IDAnhangPlanBedienraum() {
		return (EReference)bedien_ZentraleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Zentrale_IDAnhangPlanRechnerraum() {
		return (EReference)bedien_ZentraleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Zentrale_IDStrecke() {
		return (EReference)bedien_ZentraleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Zentrale_Bezeichnung() {
		return (EReference)bedien_ZentraleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Zentrale_IDOertlichkeit() {
		return (EReference)bedien_ZentraleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedien_Zentrale_Bezeichnung_AttributeGroup() {
		return bedien_Zentrale_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedien_Zentrale_Bezeichnung_AttributeGroup_BezBedZentrale() {
		return (EReference)bedien_Zentrale_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedienplatzbezeichnung_TypeClass() {
		return bedienplatzbezeichnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBedienplatzbezeichnung_TypeClass_Wert() {
		return (EAttribute)bedienplatzbezeichnung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedienplatznummer_TypeClass() {
		return bedienplatznummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBedienplatznummer_TypeClass_Wert() {
		return (EAttribute)bedienplatznummer_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedienraumnummer_TypeClass() {
		return bedienraumnummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBedienraumnummer_TypeClass_Wert() {
		return (EAttribute)bedienraumnummer_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBetriebsstellenbezeichner_TypeClass() {
		return betriebsstellenbezeichner_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBetriebsstellenbezeichner_TypeClass_Wert() {
		return (EAttribute)betriebsstellenbezeichner_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBez_Bed_Anrueckabschnitt_TypeClass() {
		return bez_Bed_Anrueckabschnitt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBez_Bed_Anrueckabschnitt_TypeClass_Wert() {
		return (EAttribute)bez_Bed_Anrueckabschnitt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBez_Bed_Anzeige_Element_TypeClass() {
		return bez_Bed_Anzeige_Element_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBez_Bed_Anzeige_Element_TypeClass_Wert() {
		return (EAttribute)bez_Bed_Anzeige_Element_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBez_Bed_Zentrale_TypeClass() {
		return bez_Bed_Zentrale_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBez_Bed_Zentrale_TypeClass_Wert() {
		return (EAttribute)bez_Bed_Zentrale_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_BSO_TypeClass() {
		return bezeichnung_BSO_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_BSO_TypeClass_Wert() {
		return (EAttribute)bezeichnung_BSO_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBSO_IP_AB_Teilsystem_AttributeGroup() {
		return bsO_IP_AB_Teilsystem_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBSO_IP_AB_Teilsystem_AttributeGroup_BSOTeilsystemArt() {
		return (EReference)bsO_IP_AB_Teilsystem_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockBlau() {
		return (EReference)bsO_IP_AB_Teilsystem_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockGrau() {
		return (EReference)bsO_IP_AB_Teilsystem_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBSO_IP_Adressblock_AttributeGroup() {
		return bsO_IP_Adressblock_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBSO_IP_Adressblock_AttributeGroup_BSOIPABTeilsystem() {
		return (EReference)bsO_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4() {
		return (EReference)bsO_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6() {
		return (EReference)bsO_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4() {
		return (EReference)bsO_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6() {
		return (EReference)bsO_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBSO_IP_Adressblock_AttributeGroup_Regionalbereich() {
		return (EReference)bsO_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBSO_Teilsystem_Art_TypeClass() {
		return bsO_Teilsystem_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBSO_Teilsystem_Art_TypeClass_Wert() {
		return (EAttribute)bsO_Teilsystem_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getC_Wert_TypeClass() {
		return c_Wert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getC_Wert_TypeClass_Wert() {
		return (EAttribute)c_Wert_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDD_Wert_TypeClass() {
		return dD_Wert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDD_Wert_TypeClass_Wert() {
		return (EAttribute)dD_Wert_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHersteller_TypeClass() {
		return hersteller_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHersteller_TypeClass_Wert() {
		return (EAttribute)hersteller_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHupe_Anschaltzeit_TypeClass() {
		return hupe_Anschaltzeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHupe_Anschaltzeit_TypeClass_Wert() {
		return (EAttribute)hupe_Anschaltzeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIP_Adressblock_Blau_TypeClass() {
		return iP_Adressblock_Blau_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIP_Adressblock_Blau_TypeClass_Wert() {
		return (EAttribute)iP_Adressblock_Blau_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIP_Adressblock_Blau_V4_TypeClass() {
		return iP_Adressblock_Blau_V4_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIP_Adressblock_Blau_V4_TypeClass_Wert() {
		return (EAttribute)iP_Adressblock_Blau_V4_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIP_Adressblock_Blau_V6_TypeClass() {
		return iP_Adressblock_Blau_V6_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIP_Adressblock_Blau_V6_TypeClass_Wert() {
		return (EAttribute)iP_Adressblock_Blau_V6_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIP_Adressblock_Grau_TypeClass() {
		return iP_Adressblock_Grau_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIP_Adressblock_Grau_TypeClass_Wert() {
		return (EAttribute)iP_Adressblock_Grau_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIP_Adressblock_Grau_V4_TypeClass() {
		return iP_Adressblock_Grau_V4_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIP_Adressblock_Grau_V4_TypeClass_Wert() {
		return (EAttribute)iP_Adressblock_Grau_V4_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIP_Adressblock_Grau_V6_TypeClass() {
		return iP_Adressblock_Grau_V6_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIP_Adressblock_Grau_V6_TypeClass_Wert() {
		return (EAttribute)iP_Adressblock_Grau_V6_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKennzahl_TypeClass() {
		return kennzahl_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKennzahl_TypeClass_Wert() {
		return (EAttribute)kennzahl_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMelder_TypeClass() {
		return melder_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMelder_TypeClass_Wert() {
		return (EAttribute)melder_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOberflaeche_Bildart_TypeClass() {
		return oberflaeche_Bildart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOberflaeche_Bildart_TypeClass_Wert() {
		return (EAttribute)oberflaeche_Bildart_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOberflaeche_Zustaendigkeit_TypeClass() {
		return oberflaeche_Zustaendigkeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOberflaeche_Zustaendigkeit_TypeClass_Wert() {
		return (EAttribute)oberflaeche_Zustaendigkeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegionalbereich_TypeClass() {
		return regionalbereich_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionalbereich_TypeClass_Wert() {
		return (EAttribute)regionalbereich_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRueckschauzeit_TypeClass() {
		return rueckschauzeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRueckschauzeit_TypeClass_Wert() {
		return (EAttribute)rueckschauzeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchalter_TypeClass() {
		return schalter_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchalter_TypeClass_Wert() {
		return (EAttribute)schalter_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchrankreihe_TypeClass() {
		return schrankreihe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchrankreihe_TypeClass_Wert() {
		return (EAttribute)schrankreihe_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSteuerbezirksname_TypeClass() {
		return steuerbezirksname_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSteuerbezirksname_TypeClass_Wert() {
		return (EAttribute)steuerbezirksname_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSteuerbezirksnummer_TypeClass() {
		return steuerbezirksnummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSteuerbezirksnummer_TypeClass_Wert() {
		return (EAttribute)steuerbezirksnummer_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaste_TypeClass() {
		return taste_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaste_TypeClass_Wert() {
		return (EAttribute)taste_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVorschauzeit_TypeClass() {
		return vorschauzeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVorschauzeit_TypeClass_Wert() {
		return (EAttribute)vorschauzeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getX_Wert_TypeClass() {
		return x_Wert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getX_Wert_TypeClass_Wert() {
		return (EAttribute)x_Wert_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getY_Wert_TypeClass() {
		return y_Wert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getY_Wert_TypeClass_Wert() {
		return (EAttribute)y_Wert_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getYY_Wert_TypeClass() {
		return yY_Wert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYY_Wert_TypeClass_Wert() {
		return (EAttribute)yY_Wert_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMAWert() {
		return enumaWertEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBedienEinrichtBauart() {
		return enumBedienEinrichtBauartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBedienPlatzArt() {
		return enumBedienPlatzArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBSOTeilsystemArt() {
		return enumbsoTeilsystemArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMCWert() {
		return enumcWertEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMMelder() {
		return enumMelderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMOberflaecheBildart() {
		return enumOberflaecheBildartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSchalter() {
		return enumSchalterEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMTaste() {
		return enumTasteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMXWert() {
		return enumxWertEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getB_Wert_Type() {
		return b_Wert_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBedien_Einricht_Oertl_Bez_Type() {
		return bedien_Einricht_Oertl_Bez_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBedienplatzbezeichnung_Type() {
		return bedienplatzbezeichnung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBedienplatznummer_Type() {
		return bedienplatznummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBedienraumnummer_Type() {
		return bedienraumnummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBetriebsstellenbezeichner_Type() {
		return betriebsstellenbezeichner_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBez_Bed_Anrueckabschnitt_Type() {
		return bez_Bed_Anrueckabschnitt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBez_Bed_Anzeige_Element_Type() {
		return bez_Bed_Anzeige_Element_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBez_Bed_Zentrale_Type() {
		return bez_Bed_Zentrale_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_BSO_Type() {
		return bezeichnung_BSO_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDD_Wert_Type() {
		return dD_Wert_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMAWertObject() {
		return enumaWertObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBedienEinrichtBauartObject() {
		return enumBedienEinrichtBauartObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBedienPlatzArtObject() {
		return enumBedienPlatzArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBSOTeilsystemArtObject() {
		return enumbsoTeilsystemArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMCWertObject() {
		return enumcWertObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMMelderObject() {
		return enumMelderObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMOberflaecheBildartObject() {
		return enumOberflaecheBildartObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSchalterObject() {
		return enumSchalterObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMTasteObject() {
		return enumTasteObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMXWertObject() {
		return enumxWertObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHupe_Anschaltzeit_Type() {
		return hupe_Anschaltzeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIP_Adressblock_Blau_Type() {
		return iP_Adressblock_Blau_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIP_Adressblock_Blau_V4_Type() {
		return iP_Adressblock_Blau_V4_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIP_Adressblock_Blau_V6_Type() {
		return iP_Adressblock_Blau_V6_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIP_Adressblock_Grau_Type() {
		return iP_Adressblock_Grau_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIP_Adressblock_Grau_V4_Type() {
		return iP_Adressblock_Grau_V4_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIP_Adressblock_Grau_V6_Type() {
		return iP_Adressblock_Grau_V6_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOberflaeche_Zustaendigkeit_Type() {
		return oberflaeche_Zustaendigkeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRueckschauzeit_Type() {
		return rueckschauzeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSchrankreihe_Type() {
		return schrankreihe_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSteuerbezirksname_Type() {
		return steuerbezirksname_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSteuerbezirksnummer_Type() {
		return steuerbezirksnummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVorschauzeit_Type() {
		return vorschauzeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getY_Wert_Type() {
		return y_Wert_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getYY_Wert_Type() {
		return yY_Wert_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BedienungFactory getBedienungFactory() {
		return (BedienungFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		a_Wert_TypeClassEClass = createEClass(AWERT_TYPE_CLASS);
		createEAttribute(a_Wert_TypeClassEClass, AWERT_TYPE_CLASS__WERT);

		anbindung_IB2_TypeClassEClass = createEClass(ANBINDUNG_IB2_TYPE_CLASS);
		createEAttribute(anbindung_IB2_TypeClassEClass, ANBINDUNG_IB2_TYPE_CLASS__WERT);

		anbindung_IB3_TypeClassEClass = createEClass(ANBINDUNG_IB3_TYPE_CLASS);
		createEAttribute(anbindung_IB3_TypeClassEClass, ANBINDUNG_IB3_TYPE_CLASS__WERT);

		b_Wert_TypeClassEClass = createEClass(BWERT_TYPE_CLASS);
		createEAttribute(b_Wert_TypeClassEClass, BWERT_TYPE_CLASS__WERT);

		bedien_AnrueckabschnittEClass = createEClass(BEDIEN_ANRUECKABSCHNITT);
		createEReference(bedien_AnrueckabschnittEClass, BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION);
		createEReference(bedien_AnrueckabschnittEClass, BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG);
		createEReference(bedien_AnrueckabschnittEClass, BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN);

		bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupEClass = createEClass(BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupEClass, BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANRUECKABSCHNITT);

		bedien_Anzeige_ElementEClass = createEClass(BEDIEN_ANZEIGE_ELEMENT);
		createEReference(bedien_Anzeige_ElementEClass, BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG);
		createEReference(bedien_Anzeige_ElementEClass, BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG);
		createEReference(bedien_Anzeige_ElementEClass, BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH);
		createEReference(bedien_Anzeige_ElementEClass, BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT);

		bedien_Anzeige_Element_Allg_AttributeGroupEClass = createEClass(BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP);
		createEReference(bedien_Anzeige_Element_Allg_AttributeGroupEClass, BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__MELDER);
		createEReference(bedien_Anzeige_Element_Allg_AttributeGroupEClass, BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__SCHALTER);
		createEReference(bedien_Anzeige_Element_Allg_AttributeGroupEClass, BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__TASTE);

		bedien_Anzeige_Element_Bezeichnung_AttributeGroupEClass = createEClass(BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(bedien_Anzeige_Element_Bezeichnung_AttributeGroupEClass, BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT);

		bedien_BezirkEClass = createEClass(BEDIEN_BEZIRK);
		createEReference(bedien_BezirkEClass, BEDIEN_BEZIRK__BEDIEN_BEZIRK_ADRESSFORMEL);
		createEReference(bedien_BezirkEClass, BEDIEN_BEZIRK__BEDIEN_BEZIRK_ALLG);
		createEReference(bedien_BezirkEClass, BEDIEN_BEZIRK__BEDIEN_BEZIRK_ANHAENGE);
		createEReference(bedien_BezirkEClass, BEDIEN_BEZIRK__ID_BEDIEN_ZENTRALE);

		bedien_Bezirk_Adressformel_AttributeGroupEClass = createEClass(BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP);
		createEReference(bedien_Bezirk_Adressformel_AttributeGroupEClass, BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__AWERT);
		createEReference(bedien_Bezirk_Adressformel_AttributeGroupEClass, BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__BWERT);
		createEReference(bedien_Bezirk_Adressformel_AttributeGroupEClass, BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__CWERT);
		createEReference(bedien_Bezirk_Adressformel_AttributeGroupEClass, BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__DD_WERT);
		createEReference(bedien_Bezirk_Adressformel_AttributeGroupEClass, BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__XWERT);
		createEReference(bedien_Bezirk_Adressformel_AttributeGroupEClass, BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YWERT);
		createEReference(bedien_Bezirk_Adressformel_AttributeGroupEClass, BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YY_WERT);

		bedien_Bezirk_Allg_AttributeGroupEClass = createEClass(BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP);
		createEReference(bedien_Bezirk_Allg_AttributeGroupEClass, BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB2);
		createEReference(bedien_Bezirk_Allg_AttributeGroupEClass, BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB3);
		createEReference(bedien_Bezirk_Allg_AttributeGroupEClass, BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__HERSTELLER);
		createEReference(bedien_Bezirk_Allg_AttributeGroupEClass, BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__SCHRANKREIHE);
		createEReference(bedien_Bezirk_Allg_AttributeGroupEClass, BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNAME);
		createEReference(bedien_Bezirk_Allg_AttributeGroupEClass, BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNUMMER);

		bedien_Bezirk_Anhaenge_AttributeGroupEClass = createEClass(BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP);
		createEReference(bedien_Bezirk_Anhaenge_AttributeGroupEClass, BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2);
		createEReference(bedien_Bezirk_Anhaenge_AttributeGroupEClass, BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3);
		createEReference(bedien_Bezirk_Anhaenge_AttributeGroupEClass, BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT);

		bedien_Einricht_Bauart_TypeClassEClass = createEClass(BEDIEN_EINRICHT_BAUART_TYPE_CLASS);
		createEAttribute(bedien_Einricht_Bauart_TypeClassEClass, BEDIEN_EINRICHT_BAUART_TYPE_CLASS__WERT);

		bedien_Einricht_Oertl_Bez_TypeClassEClass = createEClass(BEDIEN_EINRICHT_OERTL_BEZ_TYPE_CLASS);
		createEAttribute(bedien_Einricht_Oertl_Bez_TypeClassEClass, BEDIEN_EINRICHT_OERTL_BEZ_TYPE_CLASS__WERT);

		bedien_Einricht_Oertlich_Allg_AttributeGroupEClass = createEClass(BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP);
		createEReference(bedien_Einricht_Oertlich_Allg_AttributeGroupEClass, BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_BAUART);
		createEReference(bedien_Einricht_Oertlich_Allg_AttributeGroupEClass, BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__HUPE_ANSCHALTZEIT);

		bedien_Einrichtung_OertlichEClass = createEClass(BEDIEN_EINRICHTUNG_OERTLICH);
		createEReference(bedien_Einrichtung_OertlichEClass, BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG);
		createEReference(bedien_Einrichtung_OertlichEClass, BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG);
		createEReference(bedien_Einrichtung_OertlichEClass, BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE);
		createEReference(bedien_Einrichtung_OertlichEClass, BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG);
		createEReference(bedien_Einrichtung_OertlichEClass, BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG);

		bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupEClass = createEClass(BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupEClass, BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_OERTL_BEZ);

		bedien_GBTEClass = createEClass(BEDIEN_GBT);
		createEReference(bedien_GBTEClass, BEDIEN_GBT__BEDIEN_GBT_ALLG);
		createEReference(bedien_GBTEClass, BEDIEN_GBT__ID_ANHANG_VORGABE_GBT);
		createEReference(bedien_GBTEClass, BEDIEN_GBT__ID_BEDIEN_BEZIRK);

		bedien_GBT_Allg_AttributeGroupEClass = createEClass(BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP);
		createEReference(bedien_GBT_Allg_AttributeGroupEClass, BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__RUECKSCHAUZEIT);
		createEReference(bedien_GBT_Allg_AttributeGroupEClass, BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__VORSCHAUZEIT);

		bedien_OberflaecheEClass = createEClass(BEDIEN_OBERFLAECHE);
		createEReference(bedien_OberflaecheEClass, BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE);
		createEReference(bedien_OberflaecheEClass, BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK);

		bedien_Oberflaeche_Anhaenge_AttributeGroupEClass = createEClass(BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP);
		createEReference(bedien_Oberflaeche_Anhaenge_AttributeGroupEClass, BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG);
		createEReference(bedien_Oberflaeche_Anhaenge_AttributeGroupEClass, BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN);
		createEReference(bedien_Oberflaeche_Anhaenge_AttributeGroupEClass, BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU);

		bedien_Oberflaeche_BildEClass = createEClass(BEDIEN_OBERFLAECHE_BILD);
		createEReference(bedien_Oberflaeche_BildEClass, BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG);
		createEReference(bedien_Oberflaeche_BildEClass, BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE);
		createEReference(bedien_Oberflaeche_BildEClass, BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT);

		bedien_Oberflaeche_Bild_Allg_AttributeGroupEClass = createEClass(BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP);
		createEReference(bedien_Oberflaeche_Bild_Allg_AttributeGroupEClass, BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_BILDART);
		createEReference(bedien_Oberflaeche_Bild_Allg_AttributeGroupEClass, BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_ZUSTAENDIGKEIT);

		bedien_OertlichkeitEClass = createEClass(BEDIEN_OERTLICHKEIT);
		createEReference(bedien_OertlichkeitEClass, BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN);
		createEReference(bedien_OertlichkeitEClass, BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK);
		createEReference(bedien_OertlichkeitEClass, BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT);

		bedien_Oertlichkeit_Kennzahlen_AttributeGroupEClass = createEClass(BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP);
		createEReference(bedien_Oertlichkeit_Kennzahlen_AttributeGroupEClass, BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__BETRIEBSSTELLENBEZEICHNER);
		createEReference(bedien_Oertlichkeit_Kennzahlen_AttributeGroupEClass, BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__KENNZAHL);

		bedien_PlatzEClass = createEClass(BEDIEN_PLATZ);
		createEReference(bedien_PlatzEClass, BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG);
		createEReference(bedien_PlatzEClass, BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS);
		createEReference(bedien_PlatzEClass, BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS);
		createEReference(bedien_PlatzEClass, BEDIEN_PLATZ__ID_UNTERBRINGUNG);
		createEReference(bedien_PlatzEClass, BEDIEN_PLATZ__ID_BEDIEN_BEZIRK);
		createEReference(bedien_PlatzEClass, BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT);

		bedien_Platz_Allg_AttributeGroupEClass = createEClass(BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP);
		createEReference(bedien_Platz_Allg_AttributeGroupEClass, BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIEN_PLATZ_ART);
		createEReference(bedien_Platz_Allg_AttributeGroupEClass, BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZBEZEICHNUNG);
		createEReference(bedien_Platz_Allg_AttributeGroupEClass, BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZNUMMER);
		createEReference(bedien_Platz_Allg_AttributeGroupEClass, BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENRAUMNUMMER);

		bedien_Platz_Art_TypeClassEClass = createEClass(BEDIEN_PLATZ_ART_TYPE_CLASS);
		createEAttribute(bedien_Platz_Art_TypeClassEClass, BEDIEN_PLATZ_ART_TYPE_CLASS__WERT);

		bedien_StandortEClass = createEClass(BEDIEN_STANDORT);
		createEReference(bedien_StandortEClass, BEDIEN_STANDORT__BEZEICHNUNG);
		createEReference(bedien_StandortEClass, BEDIEN_STANDORT__BSOIP_ADRESSBLOCK);
		createEReference(bedien_StandortEClass, BEDIEN_STANDORT__ID_UNTERBRINGUNG);

		bedien_Standort_Bezeichnung_AttributeGroupEClass = createEClass(BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(bedien_Standort_Bezeichnung_AttributeGroupEClass, BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BSO);

		bedien_ZentraleEClass = createEClass(BEDIEN_ZENTRALE);
		createEReference(bedien_ZentraleEClass, BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM);
		createEReference(bedien_ZentraleEClass, BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM);
		createEReference(bedien_ZentraleEClass, BEDIEN_ZENTRALE__ID_STRECKE);
		createEReference(bedien_ZentraleEClass, BEDIEN_ZENTRALE__BEZEICHNUNG);
		createEReference(bedien_ZentraleEClass, BEDIEN_ZENTRALE__ID_OERTLICHKEIT);

		bedien_Zentrale_Bezeichnung_AttributeGroupEClass = createEClass(BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(bedien_Zentrale_Bezeichnung_AttributeGroupEClass, BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ZENTRALE);

		bedienplatzbezeichnung_TypeClassEClass = createEClass(BEDIENPLATZBEZEICHNUNG_TYPE_CLASS);
		createEAttribute(bedienplatzbezeichnung_TypeClassEClass, BEDIENPLATZBEZEICHNUNG_TYPE_CLASS__WERT);

		bedienplatznummer_TypeClassEClass = createEClass(BEDIENPLATZNUMMER_TYPE_CLASS);
		createEAttribute(bedienplatznummer_TypeClassEClass, BEDIENPLATZNUMMER_TYPE_CLASS__WERT);

		bedienraumnummer_TypeClassEClass = createEClass(BEDIENRAUMNUMMER_TYPE_CLASS);
		createEAttribute(bedienraumnummer_TypeClassEClass, BEDIENRAUMNUMMER_TYPE_CLASS__WERT);

		betriebsstellenbezeichner_TypeClassEClass = createEClass(BETRIEBSSTELLENBEZEICHNER_TYPE_CLASS);
		createEAttribute(betriebsstellenbezeichner_TypeClassEClass, BETRIEBSSTELLENBEZEICHNER_TYPE_CLASS__WERT);

		bez_Bed_Anrueckabschnitt_TypeClassEClass = createEClass(BEZ_BED_ANRUECKABSCHNITT_TYPE_CLASS);
		createEAttribute(bez_Bed_Anrueckabschnitt_TypeClassEClass, BEZ_BED_ANRUECKABSCHNITT_TYPE_CLASS__WERT);

		bez_Bed_Anzeige_Element_TypeClassEClass = createEClass(BEZ_BED_ANZEIGE_ELEMENT_TYPE_CLASS);
		createEAttribute(bez_Bed_Anzeige_Element_TypeClassEClass, BEZ_BED_ANZEIGE_ELEMENT_TYPE_CLASS__WERT);

		bez_Bed_Zentrale_TypeClassEClass = createEClass(BEZ_BED_ZENTRALE_TYPE_CLASS);
		createEAttribute(bez_Bed_Zentrale_TypeClassEClass, BEZ_BED_ZENTRALE_TYPE_CLASS__WERT);

		bezeichnung_BSO_TypeClassEClass = createEClass(BEZEICHNUNG_BSO_TYPE_CLASS);
		createEAttribute(bezeichnung_BSO_TypeClassEClass, BEZEICHNUNG_BSO_TYPE_CLASS__WERT);

		bsO_IP_AB_Teilsystem_AttributeGroupEClass = createEClass(BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP);
		createEReference(bsO_IP_AB_Teilsystem_AttributeGroupEClass, BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__BSO_TEILSYSTEM_ART);
		createEReference(bsO_IP_AB_Teilsystem_AttributeGroupEClass, BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU);
		createEReference(bsO_IP_AB_Teilsystem_AttributeGroupEClass, BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU);

		bsO_IP_Adressblock_AttributeGroupEClass = createEClass(BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP);
		createEReference(bsO_IP_Adressblock_AttributeGroupEClass, BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__BSOIPAB_TEILSYSTEM);
		createEReference(bsO_IP_Adressblock_AttributeGroupEClass, BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4);
		createEReference(bsO_IP_Adressblock_AttributeGroupEClass, BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6);
		createEReference(bsO_IP_Adressblock_AttributeGroupEClass, BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4);
		createEReference(bsO_IP_Adressblock_AttributeGroupEClass, BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6);
		createEReference(bsO_IP_Adressblock_AttributeGroupEClass, BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH);

		bsO_Teilsystem_Art_TypeClassEClass = createEClass(BSO_TEILSYSTEM_ART_TYPE_CLASS);
		createEAttribute(bsO_Teilsystem_Art_TypeClassEClass, BSO_TEILSYSTEM_ART_TYPE_CLASS__WERT);

		c_Wert_TypeClassEClass = createEClass(CWERT_TYPE_CLASS);
		createEAttribute(c_Wert_TypeClassEClass, CWERT_TYPE_CLASS__WERT);

		dD_Wert_TypeClassEClass = createEClass(DD_WERT_TYPE_CLASS);
		createEAttribute(dD_Wert_TypeClassEClass, DD_WERT_TYPE_CLASS__WERT);

		hersteller_TypeClassEClass = createEClass(HERSTELLER_TYPE_CLASS);
		createEAttribute(hersteller_TypeClassEClass, HERSTELLER_TYPE_CLASS__WERT);

		hupe_Anschaltzeit_TypeClassEClass = createEClass(HUPE_ANSCHALTZEIT_TYPE_CLASS);
		createEAttribute(hupe_Anschaltzeit_TypeClassEClass, HUPE_ANSCHALTZEIT_TYPE_CLASS__WERT);

		iP_Adressblock_Blau_TypeClassEClass = createEClass(IP_ADRESSBLOCK_BLAU_TYPE_CLASS);
		createEAttribute(iP_Adressblock_Blau_TypeClassEClass, IP_ADRESSBLOCK_BLAU_TYPE_CLASS__WERT);

		iP_Adressblock_Blau_V4_TypeClassEClass = createEClass(IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS);
		createEAttribute(iP_Adressblock_Blau_V4_TypeClassEClass, IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS__WERT);

		iP_Adressblock_Blau_V6_TypeClassEClass = createEClass(IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS);
		createEAttribute(iP_Adressblock_Blau_V6_TypeClassEClass, IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS__WERT);

		iP_Adressblock_Grau_TypeClassEClass = createEClass(IP_ADRESSBLOCK_GRAU_TYPE_CLASS);
		createEAttribute(iP_Adressblock_Grau_TypeClassEClass, IP_ADRESSBLOCK_GRAU_TYPE_CLASS__WERT);

		iP_Adressblock_Grau_V4_TypeClassEClass = createEClass(IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS);
		createEAttribute(iP_Adressblock_Grau_V4_TypeClassEClass, IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS__WERT);

		iP_Adressblock_Grau_V6_TypeClassEClass = createEClass(IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS);
		createEAttribute(iP_Adressblock_Grau_V6_TypeClassEClass, IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS__WERT);

		kennzahl_TypeClassEClass = createEClass(KENNZAHL_TYPE_CLASS);
		createEAttribute(kennzahl_TypeClassEClass, KENNZAHL_TYPE_CLASS__WERT);

		melder_TypeClassEClass = createEClass(MELDER_TYPE_CLASS);
		createEAttribute(melder_TypeClassEClass, MELDER_TYPE_CLASS__WERT);

		oberflaeche_Bildart_TypeClassEClass = createEClass(OBERFLAECHE_BILDART_TYPE_CLASS);
		createEAttribute(oberflaeche_Bildart_TypeClassEClass, OBERFLAECHE_BILDART_TYPE_CLASS__WERT);

		oberflaeche_Zustaendigkeit_TypeClassEClass = createEClass(OBERFLAECHE_ZUSTAENDIGKEIT_TYPE_CLASS);
		createEAttribute(oberflaeche_Zustaendigkeit_TypeClassEClass, OBERFLAECHE_ZUSTAENDIGKEIT_TYPE_CLASS__WERT);

		regionalbereich_TypeClassEClass = createEClass(REGIONALBEREICH_TYPE_CLASS);
		createEAttribute(regionalbereich_TypeClassEClass, REGIONALBEREICH_TYPE_CLASS__WERT);

		rueckschauzeit_TypeClassEClass = createEClass(RUECKSCHAUZEIT_TYPE_CLASS);
		createEAttribute(rueckschauzeit_TypeClassEClass, RUECKSCHAUZEIT_TYPE_CLASS__WERT);

		schalter_TypeClassEClass = createEClass(SCHALTER_TYPE_CLASS);
		createEAttribute(schalter_TypeClassEClass, SCHALTER_TYPE_CLASS__WERT);

		schrankreihe_TypeClassEClass = createEClass(SCHRANKREIHE_TYPE_CLASS);
		createEAttribute(schrankreihe_TypeClassEClass, SCHRANKREIHE_TYPE_CLASS__WERT);

		steuerbezirksname_TypeClassEClass = createEClass(STEUERBEZIRKSNAME_TYPE_CLASS);
		createEAttribute(steuerbezirksname_TypeClassEClass, STEUERBEZIRKSNAME_TYPE_CLASS__WERT);

		steuerbezirksnummer_TypeClassEClass = createEClass(STEUERBEZIRKSNUMMER_TYPE_CLASS);
		createEAttribute(steuerbezirksnummer_TypeClassEClass, STEUERBEZIRKSNUMMER_TYPE_CLASS__WERT);

		taste_TypeClassEClass = createEClass(TASTE_TYPE_CLASS);
		createEAttribute(taste_TypeClassEClass, TASTE_TYPE_CLASS__WERT);

		vorschauzeit_TypeClassEClass = createEClass(VORSCHAUZEIT_TYPE_CLASS);
		createEAttribute(vorschauzeit_TypeClassEClass, VORSCHAUZEIT_TYPE_CLASS__WERT);

		x_Wert_TypeClassEClass = createEClass(XWERT_TYPE_CLASS);
		createEAttribute(x_Wert_TypeClassEClass, XWERT_TYPE_CLASS__WERT);

		y_Wert_TypeClassEClass = createEClass(YWERT_TYPE_CLASS);
		createEAttribute(y_Wert_TypeClassEClass, YWERT_TYPE_CLASS__WERT);

		yY_Wert_TypeClassEClass = createEClass(YY_WERT_TYPE_CLASS);
		createEAttribute(yY_Wert_TypeClassEClass, YY_WERT_TYPE_CLASS__WERT);

		// Create enums
		enumaWertEEnum = createEEnum(ENUMA_WERT);
		enumBedienEinrichtBauartEEnum = createEEnum(ENUM_BEDIEN_EINRICHT_BAUART);
		enumBedienPlatzArtEEnum = createEEnum(ENUM_BEDIEN_PLATZ_ART);
		enumbsoTeilsystemArtEEnum = createEEnum(ENUMBSO_TEILSYSTEM_ART);
		enumcWertEEnum = createEEnum(ENUMC_WERT);
		enumMelderEEnum = createEEnum(ENUM_MELDER);
		enumOberflaecheBildartEEnum = createEEnum(ENUM_OBERFLAECHE_BILDART);
		enumSchalterEEnum = createEEnum(ENUM_SCHALTER);
		enumTasteEEnum = createEEnum(ENUM_TASTE);
		enumxWertEEnum = createEEnum(ENUMX_WERT);

		// Create data types
		b_Wert_TypeEDataType = createEDataType(BWERT_TYPE);
		bedien_Einricht_Oertl_Bez_TypeEDataType = createEDataType(BEDIEN_EINRICHT_OERTL_BEZ_TYPE);
		bedienplatzbezeichnung_TypeEDataType = createEDataType(BEDIENPLATZBEZEICHNUNG_TYPE);
		bedienplatznummer_TypeEDataType = createEDataType(BEDIENPLATZNUMMER_TYPE);
		bedienraumnummer_TypeEDataType = createEDataType(BEDIENRAUMNUMMER_TYPE);
		betriebsstellenbezeichner_TypeEDataType = createEDataType(BETRIEBSSTELLENBEZEICHNER_TYPE);
		bez_Bed_Anrueckabschnitt_TypeEDataType = createEDataType(BEZ_BED_ANRUECKABSCHNITT_TYPE);
		bez_Bed_Anzeige_Element_TypeEDataType = createEDataType(BEZ_BED_ANZEIGE_ELEMENT_TYPE);
		bez_Bed_Zentrale_TypeEDataType = createEDataType(BEZ_BED_ZENTRALE_TYPE);
		bezeichnung_BSO_TypeEDataType = createEDataType(BEZEICHNUNG_BSO_TYPE);
		dD_Wert_TypeEDataType = createEDataType(DD_WERT_TYPE);
		enumaWertObjectEDataType = createEDataType(ENUMA_WERT_OBJECT);
		enumBedienEinrichtBauartObjectEDataType = createEDataType(ENUM_BEDIEN_EINRICHT_BAUART_OBJECT);
		enumBedienPlatzArtObjectEDataType = createEDataType(ENUM_BEDIEN_PLATZ_ART_OBJECT);
		enumbsoTeilsystemArtObjectEDataType = createEDataType(ENUMBSO_TEILSYSTEM_ART_OBJECT);
		enumcWertObjectEDataType = createEDataType(ENUMC_WERT_OBJECT);
		enumMelderObjectEDataType = createEDataType(ENUM_MELDER_OBJECT);
		enumOberflaecheBildartObjectEDataType = createEDataType(ENUM_OBERFLAECHE_BILDART_OBJECT);
		enumSchalterObjectEDataType = createEDataType(ENUM_SCHALTER_OBJECT);
		enumTasteObjectEDataType = createEDataType(ENUM_TASTE_OBJECT);
		enumxWertObjectEDataType = createEDataType(ENUMX_WERT_OBJECT);
		hupe_Anschaltzeit_TypeEDataType = createEDataType(HUPE_ANSCHALTZEIT_TYPE);
		iP_Adressblock_Blau_TypeEDataType = createEDataType(IP_ADRESSBLOCK_BLAU_TYPE);
		iP_Adressblock_Blau_V4_TypeEDataType = createEDataType(IP_ADRESSBLOCK_BLAU_V4_TYPE);
		iP_Adressblock_Blau_V6_TypeEDataType = createEDataType(IP_ADRESSBLOCK_BLAU_V6_TYPE);
		iP_Adressblock_Grau_TypeEDataType = createEDataType(IP_ADRESSBLOCK_GRAU_TYPE);
		iP_Adressblock_Grau_V4_TypeEDataType = createEDataType(IP_ADRESSBLOCK_GRAU_V4_TYPE);
		iP_Adressblock_Grau_V6_TypeEDataType = createEDataType(IP_ADRESSBLOCK_GRAU_V6_TYPE);
		oberflaeche_Zustaendigkeit_TypeEDataType = createEDataType(OBERFLAECHE_ZUSTAENDIGKEIT_TYPE);
		rueckschauzeit_TypeEDataType = createEDataType(RUECKSCHAUZEIT_TYPE);
		schrankreihe_TypeEDataType = createEDataType(SCHRANKREIHE_TYPE);
		steuerbezirksname_TypeEDataType = createEDataType(STEUERBEZIRKSNAME_TYPE);
		steuerbezirksnummer_TypeEDataType = createEDataType(STEUERBEZIRKSNUMMER_TYPE);
		vorschauzeit_TypeEDataType = createEDataType(VORSCHAUZEIT_TYPE);
		y_Wert_TypeEDataType = createEDataType(YWERT_TYPE);
		yY_Wert_TypeEDataType = createEDataType(YY_WERT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasisTypenPackage theBasisTypenPackage = (BasisTypenPackage)EPackage.Registry.INSTANCE.getEPackage(BasisTypenPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		BasisobjektePackage theBasisobjektePackage = (BasisobjektePackage)EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		VerweisePackage theVerweisePackage = (VerweisePackage)EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		a_Wert_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		anbindung_IB2_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		anbindung_IB3_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		b_Wert_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bedien_AnrueckabschnittEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bedien_Anzeige_ElementEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bedien_BezirkEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bedien_Einricht_Bauart_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bedien_Einricht_Oertl_Bez_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bedien_Einrichtung_OertlichEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bedien_GBTEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bedien_OberflaecheEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bedien_Oberflaeche_BildEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bedien_OertlichkeitEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bedien_PlatzEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bedien_Platz_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bedien_StandortEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bedien_ZentraleEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bedienplatzbezeichnung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bedienplatznummer_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bedienraumnummer_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		betriebsstellenbezeichner_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bez_Bed_Anrueckabschnitt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bez_Bed_Anzeige_Element_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bez_Bed_Zentrale_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_BSO_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bsO_Teilsystem_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		c_Wert_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		dD_Wert_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		hersteller_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		hupe_Anschaltzeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		iP_Adressblock_Blau_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		iP_Adressblock_Blau_V4_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		iP_Adressblock_Blau_V6_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		iP_Adressblock_Grau_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		iP_Adressblock_Grau_V4_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		iP_Adressblock_Grau_V6_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		kennzahl_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		melder_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		oberflaeche_Bildart_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		oberflaeche_Zustaendigkeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		regionalbereich_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		rueckschauzeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		schalter_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		schrankreihe_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		steuerbezirksname_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		steuerbezirksnummer_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		taste_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		vorschauzeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		x_Wert_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		y_Wert_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		yY_Wert_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(a_Wert_TypeClassEClass, A_Wert_TypeClass.class, "A_Wert_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA_Wert_TypeClass_Wert(), this.getENUMAWertObject(), "wert", null, 1, 1, A_Wert_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anbindung_IB2_TypeClassEClass, Anbindung_IB2_TypeClass.class, "Anbindung_IB2_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnbindung_IB2_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Anbindung_IB2_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anbindung_IB3_TypeClassEClass, Anbindung_IB3_TypeClass.class, "Anbindung_IB3_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnbindung_IB3_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Anbindung_IB3_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(b_Wert_TypeClassEClass, B_Wert_TypeClass.class, "B_Wert_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getB_Wert_TypeClass_Wert(), this.getB_Wert_Type(), "wert", null, 1, 1, B_Wert_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_AnrueckabschnittEClass, Bedien_Anrueckabschnitt.class, "Bedien_Anrueckabschnitt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Anrueckabschnitt_IDGleisAbschnittPosition(), theVerweisePackage.getID_Gleis_Abschnitt_TypeClass(), null, "iDGleisAbschnittPosition", null, 1, 1, Bedien_Anrueckabschnitt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Anrueckabschnitt_Bezeichnung(), this.getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 0, 1, Bedien_Anrueckabschnitt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Anrueckabschnitt_IDGleisAbschnittDarstellen(), theVerweisePackage.getID_Gleis_Abschnitt_TypeClass(), null, "iDGleisAbschnittDarstellen", null, 0, 1, Bedien_Anrueckabschnitt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupEClass, Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup.class, "Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup_BezBedAnrueckabschnitt(), this.getBez_Bed_Anrueckabschnitt_TypeClass(), null, "bezBedAnrueckabschnitt", null, 1, 1, Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Anzeige_ElementEClass, Bedien_Anzeige_Element.class, "Bedien_Anzeige_Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Anzeige_Element_BedienAnzeigeElementAllg(), this.getBedien_Anzeige_Element_Allg_AttributeGroup(), null, "bedienAnzeigeElementAllg", null, 1, 1, Bedien_Anzeige_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Anzeige_Element_Bezeichnung(), this.getBedien_Anzeige_Element_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 0, 1, Bedien_Anzeige_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Anzeige_Element_IDBedienEinrichtungOertlich(), theVerweisePackage.getID_Bedien_Einrichtung_Oertlich_TypeClass(), null, "iDBedienEinrichtungOertlich", null, 1, 1, Bedien_Anzeige_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Anzeige_Element_IDVerknuepftesElement(), theVerweisePackage.getID_Verknuepftes_Element_TypeClass(), null, "iDVerknuepftesElement", null, 0, 1, Bedien_Anzeige_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Anzeige_Element_Allg_AttributeGroupEClass, Bedien_Anzeige_Element_Allg_AttributeGroup.class, "Bedien_Anzeige_Element_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Anzeige_Element_Allg_AttributeGroup_Melder(), this.getMelder_TypeClass(), null, "melder", null, 0, 1, Bedien_Anzeige_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Anzeige_Element_Allg_AttributeGroup_Schalter(), this.getSchalter_TypeClass(), null, "schalter", null, 0, 1, Bedien_Anzeige_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Anzeige_Element_Allg_AttributeGroup_Taste(), this.getTaste_TypeClass(), null, "taste", null, 0, 1, Bedien_Anzeige_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Anzeige_Element_Bezeichnung_AttributeGroupEClass, Bedien_Anzeige_Element_Bezeichnung_AttributeGroup.class, "Bedien_Anzeige_Element_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Anzeige_Element_Bezeichnung_AttributeGroup_BezBedAnzeigeElement(), this.getBez_Bed_Anzeige_Element_TypeClass(), null, "bezBedAnzeigeElement", null, 1, 1, Bedien_Anzeige_Element_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_BezirkEClass, Bedien_Bezirk.class, "Bedien_Bezirk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Bezirk_BedienBezirkAdressformel(), this.getBedien_Bezirk_Adressformel_AttributeGroup(), null, "bedienBezirkAdressformel", null, 1, 1, Bedien_Bezirk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_BedienBezirkAllg(), this.getBedien_Bezirk_Allg_AttributeGroup(), null, "bedienBezirkAllg", null, 1, 1, Bedien_Bezirk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_BedienBezirkAnhaenge(), this.getBedien_Bezirk_Anhaenge_AttributeGroup(), null, "bedienBezirkAnhaenge", null, 1, 1, Bedien_Bezirk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_IDBedienZentrale(), theVerweisePackage.getID_Bedien_Zentrale_TypeClass(), null, "iDBedienZentrale", null, 1, 1, Bedien_Bezirk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Bezirk_Adressformel_AttributeGroupEClass, Bedien_Bezirk_Adressformel_AttributeGroup.class, "Bedien_Bezirk_Adressformel_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Bezirk_Adressformel_AttributeGroup_AWert(), this.getA_Wert_TypeClass(), null, "aWert", null, 1, 1, Bedien_Bezirk_Adressformel_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_Adressformel_AttributeGroup_BWert(), this.getB_Wert_TypeClass(), null, "bWert", null, 1, 1, Bedien_Bezirk_Adressformel_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_Adressformel_AttributeGroup_CWert(), this.getC_Wert_TypeClass(), null, "cWert", null, 1, 1, Bedien_Bezirk_Adressformel_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_Adressformel_AttributeGroup_DDWert(), this.getDD_Wert_TypeClass(), null, "dDWert", null, 1, 1, Bedien_Bezirk_Adressformel_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_Adressformel_AttributeGroup_XWert(), this.getX_Wert_TypeClass(), null, "xWert", null, 1, 1, Bedien_Bezirk_Adressformel_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_Adressformel_AttributeGroup_YWert(), this.getY_Wert_TypeClass(), null, "yWert", null, 1, 1, Bedien_Bezirk_Adressformel_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_Adressformel_AttributeGroup_YYWert(), this.getYY_Wert_TypeClass(), null, "yYWert", null, 1, 1, Bedien_Bezirk_Adressformel_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Bezirk_Allg_AttributeGroupEClass, Bedien_Bezirk_Allg_AttributeGroup.class, "Bedien_Bezirk_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB2(), this.getAnbindung_IB2_TypeClass(), null, "anbindungIB2", null, 0, 1, Bedien_Bezirk_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB3(), this.getAnbindung_IB3_TypeClass(), null, "anbindungIB3", null, 0, 1, Bedien_Bezirk_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_Allg_AttributeGroup_Hersteller(), this.getHersteller_TypeClass(), null, "hersteller", null, 0, 1, Bedien_Bezirk_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_Allg_AttributeGroup_Schrankreihe(), this.getSchrankreihe_TypeClass(), null, "schrankreihe", null, 0, 1, Bedien_Bezirk_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksname(), this.getSteuerbezirksname_TypeClass(), null, "steuerbezirksname", null, 0, 1, Bedien_Bezirk_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksnummer(), this.getSteuerbezirksnummer_TypeClass(), null, "steuerbezirksnummer", null, 0, 1, Bedien_Bezirk_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Bezirk_Anhaenge_AttributeGroupEClass, Bedien_Bezirk_Anhaenge_AttributeGroup.class, "Bedien_Bezirk_Anhaenge_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB2(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangAnbindungIB2", null, 0, 1, Bedien_Bezirk_Anhaenge_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB3(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangAnbindungIB3", null, 0, 1, Bedien_Bezirk_Anhaenge_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangSteuerbezUebersicht(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangSteuerbezUebersicht", null, 0, 1, Bedien_Bezirk_Anhaenge_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Einricht_Bauart_TypeClassEClass, Bedien_Einricht_Bauart_TypeClass.class, "Bedien_Einricht_Bauart_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBedien_Einricht_Bauart_TypeClass_Wert(), this.getENUMBedienEinrichtBauartObject(), "wert", null, 1, 1, Bedien_Einricht_Bauart_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Einricht_Oertl_Bez_TypeClassEClass, Bedien_Einricht_Oertl_Bez_TypeClass.class, "Bedien_Einricht_Oertl_Bez_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBedien_Einricht_Oertl_Bez_TypeClass_Wert(), this.getBedien_Einricht_Oertl_Bez_Type(), "wert", null, 1, 1, Bedien_Einricht_Oertl_Bez_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Einricht_Oertlich_Allg_AttributeGroupEClass, Bedien_Einricht_Oertlich_Allg_AttributeGroup.class, "Bedien_Einricht_Oertlich_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Einricht_Oertlich_Allg_AttributeGroup_BedienEinrichtBauart(), this.getBedien_Einricht_Bauart_TypeClass(), null, "bedienEinrichtBauart", null, 1, 1, Bedien_Einricht_Oertlich_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Einricht_Oertlich_Allg_AttributeGroup_HupeAnschaltzeit(), this.getHupe_Anschaltzeit_TypeClass(), null, "hupeAnschaltzeit", null, 0, 1, Bedien_Einricht_Oertlich_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Einrichtung_OertlichEClass, Bedien_Einrichtung_Oertlich.class, "Bedien_Einrichtung_Oertlich", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Einrichtung_Oertlich_BedienEinrichtOertlichAllg(), this.getBedien_Einricht_Oertlich_Allg_AttributeGroup(), null, "bedienEinrichtOertlichAllg", null, 1, 1, Bedien_Einrichtung_Oertlich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Einrichtung_Oertlich_Bezeichnung(), this.getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 0, 1, Bedien_Einrichtung_Oertlich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Einrichtung_Oertlich_IDAnhangBenutzeroberflaeche(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangBenutzeroberflaeche", null, 0, 1, Bedien_Einrichtung_Oertlich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Einrichtung_Oertlich_IDAussenelementansteuerung(), theVerweisePackage.getID_Aussenelementansteuerung_TypeClass(), null, "iDAussenelementansteuerung", null, 0, 1, Bedien_Einrichtung_Oertlich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Einrichtung_Oertlich_IDUnterbringung(), theVerweisePackage.getID_Unterbringung_TypeClass(), null, "iDUnterbringung", null, 1, 1, Bedien_Einrichtung_Oertlich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupEClass, Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup.class, "Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup_BedienEinrichtOertlBez(), this.getBedien_Einricht_Oertl_Bez_TypeClass(), null, "bedienEinrichtOertlBez", null, 1, 1, Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_GBTEClass, Bedien_GBT.class, "Bedien_GBT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_GBT_BedienGBTAllg(), this.getBedien_GBT_Allg_AttributeGroup(), null, "bedienGBTAllg", null, 1, 1, Bedien_GBT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_GBT_IDAnhangVorgabeGBT(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangVorgabeGBT", null, 0, 1, Bedien_GBT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_GBT_IDBedienBezirk(), theVerweisePackage.getID_Bedien_Bezirk_TypeClass(), null, "iDBedienBezirk", null, 1, 1, Bedien_GBT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_GBT_Allg_AttributeGroupEClass, Bedien_GBT_Allg_AttributeGroup.class, "Bedien_GBT_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_GBT_Allg_AttributeGroup_Rueckschauzeit(), this.getRueckschauzeit_TypeClass(), null, "rueckschauzeit", null, 0, 1, Bedien_GBT_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_GBT_Allg_AttributeGroup_Vorschauzeit(), this.getVorschauzeit_TypeClass(), null, "vorschauzeit", null, 0, 1, Bedien_GBT_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_OberflaecheEClass, Bedien_Oberflaeche.class, "Bedien_Oberflaeche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Oberflaeche_BedienOberflaecheAnhaenge(), this.getBedien_Oberflaeche_Anhaenge_AttributeGroup(), null, "bedienOberflaecheAnhaenge", null, 1, 1, Bedien_Oberflaeche.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Oberflaeche_IDBedienBezirk(), theVerweisePackage.getID_Bedien_Bezirk_TypeClass(), null, "iDBedienBezirk", null, 1, 1, Bedien_Oberflaeche.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Oberflaeche_Anhaenge_AttributeGroupEClass, Bedien_Oberflaeche_Anhaenge_AttributeGroup.class, "Bedien_Oberflaeche_Anhaenge_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangMonitoraufteilung(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangMonitoraufteilung", null, 0, 1, Bedien_Oberflaeche_Anhaenge_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangRichtungssinn(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangRichtungssinn", null, 0, 1, Bedien_Oberflaeche_Anhaenge_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangVorgabeBELU(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangVorgabeBELU", null, 0, 1, Bedien_Oberflaeche_Anhaenge_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Oberflaeche_BildEClass, Bedien_Oberflaeche_Bild.class, "Bedien_Oberflaeche_Bild", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Oberflaeche_Bild_BedienOberflaecheBildAllg(), this.getBedien_Oberflaeche_Bild_Allg_AttributeGroup(), null, "bedienOberflaecheBildAllg", null, 1, 1, Bedien_Oberflaeche_Bild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Oberflaeche_Bild_IDBedienOberflaeche(), theVerweisePackage.getID_Bedien_Oberflaeche_TypeClass(), null, "iDBedienOberflaeche", null, 1, 1, Bedien_Oberflaeche_Bild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Oberflaeche_Bild_IDOertlichkeit(), theVerweisePackage.getID_Oertlichkeit_Proxy_TypeClass(), null, "iDOertlichkeit", null, 1, 1, Bedien_Oberflaeche_Bild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Oberflaeche_Bild_Allg_AttributeGroupEClass, Bedien_Oberflaeche_Bild_Allg_AttributeGroup.class, "Bedien_Oberflaeche_Bild_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheBildart(), this.getOberflaeche_Bildart_TypeClass(), null, "oberflaecheBildart", null, 0, 1, Bedien_Oberflaeche_Bild_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheZustaendigkeit(), this.getOberflaeche_Zustaendigkeit_TypeClass(), null, "oberflaecheZustaendigkeit", null, 0, 1, Bedien_Oberflaeche_Bild_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_OertlichkeitEClass, Bedien_Oertlichkeit.class, "Bedien_Oertlichkeit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Oertlichkeit_BedienOertlichkeitKennzahlen(), this.getBedien_Oertlichkeit_Kennzahlen_AttributeGroup(), null, "bedienOertlichkeitKennzahlen", null, 1, 1, Bedien_Oertlichkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Oertlichkeit_IDBedienBezirk(), theVerweisePackage.getID_Bedien_Bezirk_TypeClass(), null, "iDBedienBezirk", null, 1, 1, Bedien_Oertlichkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Oertlichkeit_IDOertlichkeit(), theVerweisePackage.getID_Oertlichkeit_Proxy_TypeClass(), null, "iDOertlichkeit", null, 1, 1, Bedien_Oertlichkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Oertlichkeit_Kennzahlen_AttributeGroupEClass, Bedien_Oertlichkeit_Kennzahlen_AttributeGroup.class, "Bedien_Oertlichkeit_Kennzahlen_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Betriebsstellenbezeichner(), this.getBetriebsstellenbezeichner_TypeClass(), null, "betriebsstellenbezeichner", null, 1, 1, Bedien_Oertlichkeit_Kennzahlen_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Kennzahl(), this.getKennzahl_TypeClass(), null, "kennzahl", null, 1, 1, Bedien_Oertlichkeit_Kennzahlen_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_PlatzEClass, Bedien_Platz.class, "Bedien_Platz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Platz_BedienPlatzAllg(), this.getBedien_Platz_Allg_AttributeGroup(), null, "bedienPlatzAllg", null, 1, 1, Bedien_Platz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Platz_IDAnhangMoebelplanAufriss(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangMoebelplanAufriss", null, 0, 1, Bedien_Platz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Platz_IDAnhangMoebelplanGrundriss(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangMoebelplanGrundriss", null, 0, 1, Bedien_Platz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Platz_IDUnterbringung(), theVerweisePackage.getID_Unterbringung_TypeClass(), null, "iDUnterbringung", null, 1, 1, Bedien_Platz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Platz_IDBedienBezirk(), theVerweisePackage.getID_Bedien_Bezirk_TypeClass(), null, "iDBedienBezirk", null, 0, 1, Bedien_Platz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Platz_IDESTWZentraleinheit(), theVerweisePackage.getID_ESTW_Zentraleinheit_TypeClass(), null, "iDESTWZentraleinheit", null, 0, 1, Bedien_Platz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Platz_Allg_AttributeGroupEClass, Bedien_Platz_Allg_AttributeGroup.class, "Bedien_Platz_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Platz_Allg_AttributeGroup_BedienPlatzArt(), this.getBedien_Platz_Art_TypeClass(), null, "bedienPlatzArt", null, 1, 1, Bedien_Platz_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Platz_Allg_AttributeGroup_Bedienplatzbezeichnung(), this.getBedienplatzbezeichnung_TypeClass(), null, "bedienplatzbezeichnung", null, 0, 1, Bedien_Platz_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Platz_Allg_AttributeGroup_Bedienplatznummer(), this.getBedienplatznummer_TypeClass(), null, "bedienplatznummer", null, 0, 1, Bedien_Platz_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Platz_Allg_AttributeGroup_Bedienraumnummer(), this.getBedienraumnummer_TypeClass(), null, "bedienraumnummer", null, 0, 1, Bedien_Platz_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Platz_Art_TypeClassEClass, Bedien_Platz_Art_TypeClass.class, "Bedien_Platz_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBedien_Platz_Art_TypeClass_Wert(), this.getENUMBedienPlatzArtObject(), "wert", null, 1, 1, Bedien_Platz_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_StandortEClass, Bedien_Standort.class, "Bedien_Standort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Standort_Bezeichnung(), this.getBedien_Standort_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, Bedien_Standort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Standort_BSOIPAdressblock(), this.getBSO_IP_Adressblock_AttributeGroup(), null, "bSOIPAdressblock", null, 0, 1, Bedien_Standort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Standort_IDUnterbringung(), theVerweisePackage.getID_Unterbringung_TypeClass(), null, "iDUnterbringung", null, 1, 1, Bedien_Standort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Standort_Bezeichnung_AttributeGroupEClass, Bedien_Standort_Bezeichnung_AttributeGroup.class, "Bedien_Standort_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Standort_Bezeichnung_AttributeGroup_BezeichnungBSO(), this.getBezeichnung_BSO_TypeClass(), null, "bezeichnungBSO", null, 1, 1, Bedien_Standort_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_ZentraleEClass, Bedien_Zentrale.class, "Bedien_Zentrale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Zentrale_IDAnhangPlanBedienraum(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangPlanBedienraum", null, 0, 1, Bedien_Zentrale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Zentrale_IDAnhangPlanRechnerraum(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangPlanRechnerraum", null, 0, 1, Bedien_Zentrale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Zentrale_IDStrecke(), theVerweisePackage.getID_Strecke_TypeClass(), null, "iDStrecke", null, 0, 1, Bedien_Zentrale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Zentrale_Bezeichnung(), this.getBedien_Zentrale_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 0, 1, Bedien_Zentrale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBedien_Zentrale_IDOertlichkeit(), theVerweisePackage.getID_Oertlichkeit_Proxy_TypeClass(), null, "iDOertlichkeit", null, 0, 1, Bedien_Zentrale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedien_Zentrale_Bezeichnung_AttributeGroupEClass, Bedien_Zentrale_Bezeichnung_AttributeGroup.class, "Bedien_Zentrale_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBedien_Zentrale_Bezeichnung_AttributeGroup_BezBedZentrale(), this.getBez_Bed_Zentrale_TypeClass(), null, "bezBedZentrale", null, 1, 1, Bedien_Zentrale_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedienplatzbezeichnung_TypeClassEClass, Bedienplatzbezeichnung_TypeClass.class, "Bedienplatzbezeichnung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBedienplatzbezeichnung_TypeClass_Wert(), this.getBedienplatzbezeichnung_Type(), "wert", null, 1, 1, Bedienplatzbezeichnung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedienplatznummer_TypeClassEClass, Bedienplatznummer_TypeClass.class, "Bedienplatznummer_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBedienplatznummer_TypeClass_Wert(), this.getBedienplatznummer_Type(), "wert", null, 1, 1, Bedienplatznummer_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedienraumnummer_TypeClassEClass, Bedienraumnummer_TypeClass.class, "Bedienraumnummer_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBedienraumnummer_TypeClass_Wert(), this.getBedienraumnummer_Type(), "wert", null, 1, 1, Bedienraumnummer_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(betriebsstellenbezeichner_TypeClassEClass, Betriebsstellenbezeichner_TypeClass.class, "Betriebsstellenbezeichner_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBetriebsstellenbezeichner_TypeClass_Wert(), this.getBetriebsstellenbezeichner_Type(), "wert", null, 1, 1, Betriebsstellenbezeichner_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bez_Bed_Anrueckabschnitt_TypeClassEClass, Bez_Bed_Anrueckabschnitt_TypeClass.class, "Bez_Bed_Anrueckabschnitt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBez_Bed_Anrueckabschnitt_TypeClass_Wert(), this.getBez_Bed_Anrueckabschnitt_Type(), "wert", null, 1, 1, Bez_Bed_Anrueckabschnitt_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bez_Bed_Anzeige_Element_TypeClassEClass, Bez_Bed_Anzeige_Element_TypeClass.class, "Bez_Bed_Anzeige_Element_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBez_Bed_Anzeige_Element_TypeClass_Wert(), this.getBez_Bed_Anzeige_Element_Type(), "wert", null, 1, 1, Bez_Bed_Anzeige_Element_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bez_Bed_Zentrale_TypeClassEClass, Bez_Bed_Zentrale_TypeClass.class, "Bez_Bed_Zentrale_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBez_Bed_Zentrale_TypeClass_Wert(), this.getBez_Bed_Zentrale_Type(), "wert", null, 1, 1, Bez_Bed_Zentrale_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_BSO_TypeClassEClass, Bezeichnung_BSO_TypeClass.class, "Bezeichnung_BSO_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_BSO_TypeClass_Wert(), this.getBezeichnung_BSO_Type(), "wert", null, 1, 1, Bezeichnung_BSO_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsO_IP_AB_Teilsystem_AttributeGroupEClass, BSO_IP_AB_Teilsystem_AttributeGroup.class, "BSO_IP_AB_Teilsystem_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBSO_IP_AB_Teilsystem_AttributeGroup_BSOTeilsystemArt(), this.getBSO_Teilsystem_Art_TypeClass(), null, "bSOTeilsystemArt", null, 1, 1, BSO_IP_AB_Teilsystem_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockBlau(), this.getIP_Adressblock_Blau_TypeClass(), null, "iPAdressblockBlau", null, 1, 1, BSO_IP_AB_Teilsystem_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockGrau(), this.getIP_Adressblock_Grau_TypeClass(), null, "iPAdressblockGrau", null, 1, 1, BSO_IP_AB_Teilsystem_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsO_IP_Adressblock_AttributeGroupEClass, BSO_IP_Adressblock_AttributeGroup.class, "BSO_IP_Adressblock_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBSO_IP_Adressblock_AttributeGroup_BSOIPABTeilsystem(), this.getBSO_IP_AB_Teilsystem_AttributeGroup(), null, "bSOIPABTeilsystem", null, 0, -1, BSO_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4(), this.getIP_Adressblock_Blau_V4_TypeClass(), null, "iPAdressblockBlauV4", null, 1, 1, BSO_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6(), this.getIP_Adressblock_Blau_V6_TypeClass(), null, "iPAdressblockBlauV6", null, 1, 1, BSO_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4(), this.getIP_Adressblock_Grau_V4_TypeClass(), null, "iPAdressblockGrauV4", null, 1, 1, BSO_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6(), this.getIP_Adressblock_Grau_V6_TypeClass(), null, "iPAdressblockGrauV6", null, 1, 1, BSO_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBSO_IP_Adressblock_AttributeGroup_Regionalbereich(), this.getRegionalbereich_TypeClass(), null, "regionalbereich", null, 1, 1, BSO_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsO_Teilsystem_Art_TypeClassEClass, BSO_Teilsystem_Art_TypeClass.class, "BSO_Teilsystem_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBSO_Teilsystem_Art_TypeClass_Wert(), this.getENUMBSOTeilsystemArtObject(), "wert", null, 1, 1, BSO_Teilsystem_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c_Wert_TypeClassEClass, C_Wert_TypeClass.class, "C_Wert_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC_Wert_TypeClass_Wert(), this.getENUMCWertObject(), "wert", null, 1, 1, C_Wert_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dD_Wert_TypeClassEClass, DD_Wert_TypeClass.class, "DD_Wert_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDD_Wert_TypeClass_Wert(), this.getDD_Wert_Type(), "wert", null, 1, 1, DD_Wert_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hersteller_TypeClassEClass, Hersteller_TypeClass.class, "Hersteller_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHersteller_TypeClass_Wert(), theBasisTypenPackage.getHersteller_Type(), "wert", null, 1, 1, Hersteller_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hupe_Anschaltzeit_TypeClassEClass, Hupe_Anschaltzeit_TypeClass.class, "Hupe_Anschaltzeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHupe_Anschaltzeit_TypeClass_Wert(), this.getHupe_Anschaltzeit_Type(), "wert", null, 1, 1, Hupe_Anschaltzeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iP_Adressblock_Blau_TypeClassEClass, IP_Adressblock_Blau_TypeClass.class, "IP_Adressblock_Blau_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Adressblock_Blau_TypeClass_Wert(), this.getIP_Adressblock_Blau_Type(), "wert", null, 1, 1, IP_Adressblock_Blau_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iP_Adressblock_Blau_V4_TypeClassEClass, IP_Adressblock_Blau_V4_TypeClass.class, "IP_Adressblock_Blau_V4_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Adressblock_Blau_V4_TypeClass_Wert(), this.getIP_Adressblock_Blau_V4_Type(), "wert", null, 1, 1, IP_Adressblock_Blau_V4_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iP_Adressblock_Blau_V6_TypeClassEClass, IP_Adressblock_Blau_V6_TypeClass.class, "IP_Adressblock_Blau_V6_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Adressblock_Blau_V6_TypeClass_Wert(), this.getIP_Adressblock_Blau_V6_Type(), "wert", null, 1, 1, IP_Adressblock_Blau_V6_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iP_Adressblock_Grau_TypeClassEClass, IP_Adressblock_Grau_TypeClass.class, "IP_Adressblock_Grau_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Adressblock_Grau_TypeClass_Wert(), this.getIP_Adressblock_Grau_Type(), "wert", null, 1, 1, IP_Adressblock_Grau_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iP_Adressblock_Grau_V4_TypeClassEClass, IP_Adressblock_Grau_V4_TypeClass.class, "IP_Adressblock_Grau_V4_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Adressblock_Grau_V4_TypeClass_Wert(), this.getIP_Adressblock_Grau_V4_Type(), "wert", null, 1, 1, IP_Adressblock_Grau_V4_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iP_Adressblock_Grau_V6_TypeClassEClass, IP_Adressblock_Grau_V6_TypeClass.class, "IP_Adressblock_Grau_V6_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Adressblock_Grau_V6_TypeClass_Wert(), this.getIP_Adressblock_Grau_V6_Type(), "wert", null, 1, 1, IP_Adressblock_Grau_V6_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kennzahl_TypeClassEClass, Kennzahl_TypeClass.class, "Kennzahl_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKennzahl_TypeClass_Wert(), theBasisTypenPackage.getKennzahl_Type(), "wert", null, 1, 1, Kennzahl_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(melder_TypeClassEClass, Melder_TypeClass.class, "Melder_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMelder_TypeClass_Wert(), this.getENUMMelderObject(), "wert", null, 1, 1, Melder_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oberflaeche_Bildart_TypeClassEClass, Oberflaeche_Bildart_TypeClass.class, "Oberflaeche_Bildart_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOberflaeche_Bildart_TypeClass_Wert(), this.getENUMOberflaecheBildartObject(), "wert", null, 1, 1, Oberflaeche_Bildart_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oberflaeche_Zustaendigkeit_TypeClassEClass, Oberflaeche_Zustaendigkeit_TypeClass.class, "Oberflaeche_Zustaendigkeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOberflaeche_Zustaendigkeit_TypeClass_Wert(), this.getOberflaeche_Zustaendigkeit_Type(), "wert", null, 1, 1, Oberflaeche_Zustaendigkeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionalbereich_TypeClassEClass, Regionalbereich_TypeClass.class, "Regionalbereich_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegionalbereich_TypeClass_Wert(), theBasisTypenPackage.getRegionalbereich_Type(), "wert", null, 1, 1, Regionalbereich_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rueckschauzeit_TypeClassEClass, Rueckschauzeit_TypeClass.class, "Rueckschauzeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRueckschauzeit_TypeClass_Wert(), this.getRueckschauzeit_Type(), "wert", null, 1, 1, Rueckschauzeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schalter_TypeClassEClass, Schalter_TypeClass.class, "Schalter_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchalter_TypeClass_Wert(), this.getENUMSchalterObject(), "wert", null, 1, 1, Schalter_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schrankreihe_TypeClassEClass, Schrankreihe_TypeClass.class, "Schrankreihe_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchrankreihe_TypeClass_Wert(), this.getSchrankreihe_Type(), "wert", null, 1, 1, Schrankreihe_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(steuerbezirksname_TypeClassEClass, Steuerbezirksname_TypeClass.class, "Steuerbezirksname_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSteuerbezirksname_TypeClass_Wert(), this.getSteuerbezirksname_Type(), "wert", null, 1, 1, Steuerbezirksname_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(steuerbezirksnummer_TypeClassEClass, Steuerbezirksnummer_TypeClass.class, "Steuerbezirksnummer_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSteuerbezirksnummer_TypeClass_Wert(), this.getSteuerbezirksnummer_Type(), "wert", null, 1, 1, Steuerbezirksnummer_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taste_TypeClassEClass, Taste_TypeClass.class, "Taste_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaste_TypeClass_Wert(), this.getENUMTasteObject(), "wert", null, 1, 1, Taste_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vorschauzeit_TypeClassEClass, Vorschauzeit_TypeClass.class, "Vorschauzeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVorschauzeit_TypeClass_Wert(), this.getVorschauzeit_Type(), "wert", null, 1, 1, Vorschauzeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x_Wert_TypeClassEClass, X_Wert_TypeClass.class, "X_Wert_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX_Wert_TypeClass_Wert(), this.getENUMXWertObject(), "wert", null, 1, 1, X_Wert_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(y_Wert_TypeClassEClass, Y_Wert_TypeClass.class, "Y_Wert_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getY_Wert_TypeClass_Wert(), this.getY_Wert_Type(), "wert", null, 1, 1, Y_Wert_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yY_Wert_TypeClassEClass, YY_Wert_TypeClass.class, "YY_Wert_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYY_Wert_TypeClass_Wert(), this.getYY_Wert_Type(), "wert", null, 1, 1, YY_Wert_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumaWertEEnum, ENUMAWert.class, "ENUMAWert");
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_16);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_32);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_48);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_64);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_80);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_96);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_112);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_128);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_144);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_160);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_176);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_192);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_208);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_224);
		addEEnumLiteral(enumaWertEEnum, ENUMAWert.ENUMA_WERT_240);

		initEEnum(enumBedienEinrichtBauartEEnum, ENUMBedienEinrichtBauart.class, "ENUMBedienEinrichtBauart");
		addEEnumLiteral(enumBedienEinrichtBauartEEnum, ENUMBedienEinrichtBauart.ENUM_BEDIEN_EINRICHT_BAUART_BEDIENPULT);
		addEEnumLiteral(enumBedienEinrichtBauartEEnum, ENUMBedienEinrichtBauart.ENUM_BEDIEN_EINRICHT_BAUART_BEDIENSAEULE);
		addEEnumLiteral(enumBedienEinrichtBauartEEnum, ENUMBedienEinrichtBauart.ENUM_BEDIEN_EINRICHT_BAUART_BEDIENTABLETT);
		addEEnumLiteral(enumBedienEinrichtBauartEEnum, ENUMBedienEinrichtBauart.ENUM_BEDIEN_EINRICHT_BAUART_BEDIENTAFEL);
		addEEnumLiteral(enumBedienEinrichtBauartEEnum, ENUMBedienEinrichtBauart.ENUM_BEDIEN_EINRICHT_BAUART_STELLPULT);
		addEEnumLiteral(enumBedienEinrichtBauartEEnum, ENUMBedienEinrichtBauart.ENUM_BEDIEN_EINRICHT_BAUART_STELLTISCH);
		addEEnumLiteral(enumBedienEinrichtBauartEEnum, ENUMBedienEinrichtBauart.ENUM_BEDIEN_EINRICHT_BAUART_SONSTIGE);

		initEEnum(enumBedienPlatzArtEEnum, ENUMBedienPlatzArt.class, "ENUMBedienPlatzArt");
		addEEnumLiteral(enumBedienPlatzArtEEnum, ENUMBedienPlatzArt.ENUM_BEDIEN_PLATZ_ART_NOT_BPS);
		addEEnumLiteral(enumBedienPlatzArtEEnum, ENUMBedienPlatzArt.ENUM_BEDIEN_PLATZ_ART_NOT_BPS_ABGESETZT);
		addEEnumLiteral(enumBedienPlatzArtEEnum, ENUMBedienPlatzArt.ENUM_BEDIEN_PLATZ_ART_SONSTIGE);
		addEEnumLiteral(enumBedienPlatzArtEEnum, ENUMBedienPlatzArt.ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS);
		addEEnumLiteral(enumBedienPlatzArtEEnum, ENUMBedienPlatzArt.ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS_ABGESETZT);

		initEEnum(enumbsoTeilsystemArtEEnum, ENUMBSOTeilsystemArt.class, "ENUMBSOTeilsystemArt");
		addEEnumLiteral(enumbsoTeilsystemArtEEnum, ENUMBSOTeilsystemArt.ENUMBSO_TEILSYSTEM_ART_IBS);
		addEEnumLiteral(enumbsoTeilsystemArtEEnum, ENUMBSOTeilsystemArt.ENUMBSO_TEILSYSTEM_ART_TRANSFERNETZ_BEDIENUNG);

		initEEnum(enumcWertEEnum, ENUMCWert.class, "ENUMCWert");
		addEEnumLiteral(enumcWertEEnum, ENUMCWert.ENUMC_WERT_0);
		addEEnumLiteral(enumcWertEEnum, ENUMCWert.ENUMC_WERT_64);
		addEEnumLiteral(enumcWertEEnum, ENUMCWert.ENUMC_WERT_128);
		addEEnumLiteral(enumcWertEEnum, ENUMCWert.ENUMC_WERT_192);

		initEEnum(enumMelderEEnum, ENUMMelder.class, "ENUMMelder");
		addEEnumLiteral(enumMelderEEnum, ENUMMelder.ENUM_MELDER_ANFORDERUNGSEMPFANG);
		addEEnumLiteral(enumMelderEEnum, ENUMMelder.ENUM_MELDER_ANZEIGE_BETRIEBSZUSTAND);
		addEEnumLiteral(enumMelderEEnum, ENUMMelder.ENUM_MELDER_LEUCHTMELDER_ZP_10);
		addEEnumLiteral(enumMelderEEnum, ENUMMelder.ENUM_MELDER_LEUCHTMELDER_ZP_9);
		addEEnumLiteral(enumMelderEEnum, ENUMMelder.ENUM_MELDER_SIGNALANFORDERUNG_EMPFANGEN);
		addEEnumLiteral(enumMelderEEnum, ENUMMelder.ENUM_MELDER_SIGNALFAHRTMELDER);
		addEEnumLiteral(enumMelderEEnum, ENUMMelder.ENUM_MELDER_SIGNALHALTMELDER);
		addEEnumLiteral(enumMelderEEnum, ENUMMelder.ENUM_MELDER_SONSTIGE);
		addEEnumLiteral(enumMelderEEnum, ENUMMelder.ENUM_MELDER_SPERRMELDER);
		addEEnumLiteral(enumMelderEEnum, ENUMMelder.ENUM_MELDER_VORBEREITUNGSMELDUNG);
		addEEnumLiteral(enumMelderEEnum, ENUMMelder.ENUM_MELDER_WEICHENMELDER);
		addEEnumLiteral(enumMelderEEnum, ENUMMelder.ENUM_MELDER_ZIELMELDER);

		initEEnum(enumOberflaecheBildartEEnum, ENUMOberflaecheBildart.class, "ENUMOberflaecheBildart");
		addEEnumLiteral(enumOberflaecheBildartEEnum, ENUMOberflaecheBildart.ENUM_OBERFLAECHE_BILDART_BERUE);
		addEEnumLiteral(enumOberflaecheBildartEEnum, ENUMOberflaecheBildart.ENUM_OBERFLAECHE_BILDART_LUPE);
		addEEnumLiteral(enumOberflaecheBildartEEnum, ENUMOberflaecheBildart.ENUM_OBERFLAECHE_BILDART_SONSTIGE);

		initEEnum(enumSchalterEEnum, ENUMSchalter.class, "ENUMSchalter");
		addEEnumLiteral(enumSchalterEEnum, ENUMSchalter.ENUM_SCHALTER_SCHALTER_EIN_AUS);
		addEEnumLiteral(enumSchalterEEnum, ENUMSchalter.ENUM_SCHALTER_SCHLUESSELSCHALTER_DB_21);
		addEEnumLiteral(enumSchalterEEnum, ENUMSchalter.ENUM_SCHALTER_SCHLUESSELSCHALTER_VIERKANT);
		addEEnumLiteral(enumSchalterEEnum, ENUMSchalter.ENUM_SCHALTER_SONSTIGE);
		addEEnumLiteral(enumSchalterEEnum, ENUMSchalter.ENUM_SCHALTER_VORBEREITUNGSMELDUNG);
		addEEnumLiteral(enumSchalterEEnum, ENUMSchalter.ENUM_SCHALTER_ZUSTIMMUNGSTASTE);

		initEEnum(enumTasteEEnum, ENUMTaste.class, "ENUMTaste");
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_AUSFAHRGRUPPENTASTE_ZP_910);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_BEDIENTASTE_ZP_10);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_BEDIENTASTE_ZP_9);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_FAHRSTRASSENANFORDERUNG);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_FAHRSTRASSENZUSTIMMUNG);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_FREIMELDETASTE);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_GRUPPENTASTE);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_HILFSTASTE);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_LOESCHTASTE);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_RUECKGABETASTE);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_SCHLUESSELTASTE_DB_21);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_SCHLUESSELTASTE_STRECKENSCHLUESSEL);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_SCHLUESSELTASTE_VIERKANT);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_SIGNALANFORDERUNG);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_SONSTIGE);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_UMSTELLTASTE);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_WEICHENAUFFAHRTASTE);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_ZIELTASTE);
		addEEnumLiteral(enumTasteEEnum, ENUMTaste.ENUM_TASTE_ZUGSCHLUSSMELDUNG);

		initEEnum(enumxWertEEnum, ENUMXWert.class, "ENUMXWert");
		addEEnumLiteral(enumxWertEEnum, ENUMXWert.ENUMX_WERT_0);
		addEEnumLiteral(enumxWertEEnum, ENUMXWert.ENUMX_WERT_1);
		addEEnumLiteral(enumxWertEEnum, ENUMXWert.ENUMX_WERT_5);
		addEEnumLiteral(enumxWertEEnum, ENUMXWert.ENUMX_WERT_8);
		addEEnumLiteral(enumxWertEEnum, ENUMXWert.ENUMX_WERT_11);
		addEEnumLiteral(enumxWertEEnum, ENUMXWert.ENUMX_WERT_12);
		addEEnumLiteral(enumxWertEEnum, ENUMXWert.ENUMX_WERT_13);
		addEEnumLiteral(enumxWertEEnum, ENUMXWert.ENUMX_WERT_15);

		// Initialize data types
		initEDataType(b_Wert_TypeEDataType, BigInteger.class, "B_Wert_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bedien_Einricht_Oertl_Bez_TypeEDataType, String.class, "Bedien_Einricht_Oertl_Bez_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bedienplatzbezeichnung_TypeEDataType, String.class, "Bedienplatzbezeichnung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bedienplatznummer_TypeEDataType, String.class, "Bedienplatznummer_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bedienraumnummer_TypeEDataType, String.class, "Bedienraumnummer_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(betriebsstellenbezeichner_TypeEDataType, String.class, "Betriebsstellenbezeichner_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bez_Bed_Anrueckabschnitt_TypeEDataType, String.class, "Bez_Bed_Anrueckabschnitt_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bez_Bed_Anzeige_Element_TypeEDataType, String.class, "Bez_Bed_Anzeige_Element_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bez_Bed_Zentrale_TypeEDataType, String.class, "Bez_Bed_Zentrale_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_BSO_TypeEDataType, String.class, "Bezeichnung_BSO_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dD_Wert_TypeEDataType, BigInteger.class, "DD_Wert_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumaWertObjectEDataType, ENUMAWert.class, "ENUMAWertObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBedienEinrichtBauartObjectEDataType, ENUMBedienEinrichtBauart.class, "ENUMBedienEinrichtBauartObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBedienPlatzArtObjectEDataType, ENUMBedienPlatzArt.class, "ENUMBedienPlatzArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumbsoTeilsystemArtObjectEDataType, ENUMBSOTeilsystemArt.class, "ENUMBSOTeilsystemArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumcWertObjectEDataType, ENUMCWert.class, "ENUMCWertObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumMelderObjectEDataType, ENUMMelder.class, "ENUMMelderObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumOberflaecheBildartObjectEDataType, ENUMOberflaecheBildart.class, "ENUMOberflaecheBildartObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSchalterObjectEDataType, ENUMSchalter.class, "ENUMSchalterObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumTasteObjectEDataType, ENUMTaste.class, "ENUMTasteObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumxWertObjectEDataType, ENUMXWert.class, "ENUMXWertObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hupe_Anschaltzeit_TypeEDataType, BigDecimal.class, "Hupe_Anschaltzeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iP_Adressblock_Blau_TypeEDataType, String.class, "IP_Adressblock_Blau_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iP_Adressblock_Blau_V4_TypeEDataType, String.class, "IP_Adressblock_Blau_V4_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iP_Adressblock_Blau_V6_TypeEDataType, String.class, "IP_Adressblock_Blau_V6_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iP_Adressblock_Grau_TypeEDataType, String.class, "IP_Adressblock_Grau_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iP_Adressblock_Grau_V4_TypeEDataType, String.class, "IP_Adressblock_Grau_V4_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iP_Adressblock_Grau_V6_TypeEDataType, String.class, "IP_Adressblock_Grau_V6_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oberflaeche_Zustaendigkeit_TypeEDataType, String.class, "Oberflaeche_Zustaendigkeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rueckschauzeit_TypeEDataType, BigDecimal.class, "Rueckschauzeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(schrankreihe_TypeEDataType, String.class, "Schrankreihe_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(steuerbezirksname_TypeEDataType, String.class, "Steuerbezirksname_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(steuerbezirksnummer_TypeEDataType, String.class, "Steuerbezirksnummer_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vorschauzeit_TypeEDataType, BigDecimal.class, "Vorschauzeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(y_Wert_TypeEDataType, BigInteger.class, "Y_Wert_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(yY_Wert_TypeEDataType, BigInteger.class, "YY_Wert_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nF\u00fcr Fragen zum Schema wenden Sie sich bitte an Herrn :\n\nReiner Br\u00f6del (reiner.broedel@deutschebahn.com, +49 30 297-57123)\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nF\u00fcr Fragen zum Schema wenden Sie sich bitte an Herrn :\n\nReiner Br\u00f6del (reiner.broedel@deutschebahn.com, +49 30 297-57123)\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nF\u00fcr Fragen zum Schema wenden Sie sich bitte an Herrn :\n\nReiner Br\u00f6del (reiner.broedel@deutschebahn.com, +49 30 297-57123)\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nF\u00fcr Fragen zum Schema wenden Sie sich bitte an Herrn :\n\nReiner Br\u00f6del (reiner.broedel@deutschebahn.com, +49 30 297-57123)\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (bedien_AnrueckabschnittEClass,
		   source,
		   new String[] {
			   "documentation", "Darstellung der Anr\u00fcckmeldung Auf der Bedienoberfl\u00e4che wird bei in den Steuerbereich einfahrenden Z\u00fcgen die Zugnummer oder, wenn diese nicht vorhanden ist, der vom anr\u00fcckenden Zug belegte Gleisabschnitt angezeigt. Die Anr\u00fcckmeldung wird aus der ZL generiert. Es wird festgelegt, in der N\u00e4he welchen Gleisabschnittes auf der Bedienoberfl\u00e4che die Zugnummer bzw. der Gleisabschnitt angezeigt werden soll. Der Gleisabschnitt kann au\u00dferhalb des Planungsbereiches liegen. Es muss nicht der direkte Nachbarabschnitt sein, denn z.B. bei Strecken mit hoher Geschwindigkeit wird als Anr\u00fcckabschnitt auch ein weiter entfernter Gleisabschnitt des Nachbarstellwerks genommen. DB-Regelwerk 819.0603 A2, Tabelle 3, Seite 208 "
		   });
		addAnnotation
		  (getBedien_Anrueckabschnitt_IDGleisAbschnittPosition(),
		   source,
		   new String[] {
			   "documentation", "Angabe des Gleisabschnitts, in dessen N\u00e4he auf der Bedienoberfl\u00e4che die Anzeige des darzustellenden Gleisabschnitts (Anr\u00fcckabschnitt) positioniert werden soll. "
		   });
		addAnnotation
		  (getBedien_Anrueckabschnitt_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getBedien_Anrueckabschnitt_IDGleisAbschnittDarstellen(),
		   source,
		   new String[] {
			   "documentation", "Gleisabschnitt, dessen Belegung auf der Bedien Oberflaeche als Anr\u00fcckabschnitt dargestellt werden soll. Liegt dieser au\u00dferhalb des Planungsbereichs, wird statt des Verweises das Attribut Bez Bed Anrueckabschnitt gef\u00fcllt."
		   });
		addAnnotation
		  (getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup_BezBedAnrueckabschnitt(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des Bedien-Anr\u00fcckabschnitts. Wenn ein Bedien_Anrueckabschnitt nicht verlinkt werden kann (beispielsweise weil er au\u00dferhalb des zu bearbeitenden Planungsdatensatzes liegt), wird als Ersatz die Bezeichnung des Gleisabschnitts gef\u00fcllt, dessen Belegung als Anr\u00fcckmeldung in der Bedienoberfl\u00e4che gespiegelt werden soll."
		   });
		addAnnotation
		  (bedien_Anzeige_ElementEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnung von Stellelementen zu einer \u00f6rtlichen Bedieneinrichtung und Abbildung von Meldern, Tasten und Schaltern einer \u00f6rtlichen Bedieneinrichtung. "
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_IDBedienEinrichtungOertlich(),
		   source,
		   new String[] {
			   "documentation", "Mit diesem Verweis erfolgt die Verbindung eines Objekts zu seiner \u00f6rtlichen Bedieneinrichtung."
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_IDVerknuepftesElement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein Signal oder W Kr Gsp Element, f\u00fcr das eine Abh\u00e4ngigkeit zu einem Schalter, Melder oder einer Taste besteht. "
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_Allg_AttributeGroup_Melder(),
		   source,
		   new String[] {
			   "documentation", "Art des Melders f\u00fcr eine \u00f6rtliche Bedieneinrichtung. Anwendungsbeispiele: Melder an Abfertigungss\u00e4ulen, Zustimmungseinrichtungen f\u00fcr den Zugleitbetrieb, Bedieneinrichtungen von (tempor\u00e4r) \u00f6rtlich bedienten stellwerksgesteuerten Stellelementen. F\u00fcr Bedieneinrichtungen von Nahbedienbereichen und Bahn\u00fcberg\u00e4ngen werden die Melder im Objekt BUE Bedien Anzeige Element bzw. NB Bedien Anzeige Element geplant. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. "
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_Allg_AttributeGroup_Schalter(),
		   source,
		   new String[] {
			   "documentation", "Art des Schalters f\u00fcr eine \u00f6rtliche Bedieneinrichtung. Anwendungsbeispiele: Schalter an Abfertigungss\u00e4ulen, Zustimmungseinrichtungen f\u00fcr den Zugleitbetrieb, Bedieneinrichtungen von (tempor\u00e4r) \u00f6rtlich bedienten stellwerksgesteuerten Stellelementen. F\u00fcr Bedieneinrichtungen von Nahbedienbereichen und Bahn\u00fcberg\u00e4ngen werden die Schalter im Objekt BUE Bedien Anzeige Element bzw. NB Bedien Anzeige Element geplant. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. "
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_Allg_AttributeGroup_Taste(),
		   source,
		   new String[] {
			   "documentation", "Art der Taste f\u00fcr eine \u00f6rtliche Bedieneinrichtung, au\u00dfer solchen mit B\u00dc- und NB-Funktionen. F\u00fcr Bedieneinrichtungen von Bahn\u00fcberg\u00e4ngen und Nahbedienbereichen werden die Tasten im Objekt BUE Bedien Anzeige Element bzw. NB Bedien Anzeige Element geplant. Anwendungsbeispiele: Tasten an Abfertigungss\u00e4ulen, Zustimmungseinrichtungen f\u00fcr den Zugleitbetrieb, Bedieneinrichtungen von (tempor\u00e4r) \u00f6rtlich bedienten stellwerksgesteuerten Stellelementen. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. "
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_Bezeichnung_AttributeGroup_BezBedAnzeigeElement(),
		   source,
		   new String[] {
			   "documentation", "Beschriftung des Melders, der Taste oder des Schalters auf der Bedien Einrichtung Oertlich (Bezeichnungsschild)."
		   });
		addAnnotation
		  (bedien_BezirkEClass,
		   source,
		   new String[] {
			   "documentation", "Bedienung von mehreren ESTW-Zentraleinheiten. Das Objekt Bedien_Bezirk erm\u00f6glicht den Anschluss mehrerer ESTW-Zentraleinheiten an einen Bedien_Bezirk z. B. in einer Bedien_Zentrale. F\u00fcr einen Bedien_Bezirk gibt es zwei Modellierungen / Auspr\u00e4gungen. 1.) Reell in einer Bedien_Zentrale, Regio-BZ oder sonstigem Technikstandort errichteter Bedien_Bezirk mit angeschalteten ESTW_Zentraleinheiten (mindestens einer) ==\\u0026gt; zentraler Bedien_Bezirk 2.) Geplante, auf die Streckeninfrastruktur bezogene, logische Zusammenfassung von betrieblich und geographisch zusammenh\u00e4ngenden Strecken. ==\\u0026gt; virtueller Bedien_Bezirk Beispiele: Siehe auch Anlage Media:Bedien Bezirk Typ.pdf 1.) Zentraler Bedien_Bezirk Das Konzept der zentralen Betriebsf\u00fchrung sieht vor, die Bedienung hochwertiger Strecken von ESTW, durch Bedien_Zentralen (Betriebszentralen) zu b\u00fcndeln. Besonderheit dabei ist, dass in den Bedien_Zentralen selbst keine ESTW_Zentraleinheiten aus Verf\u00fcgbarkeitsgr\u00fcnden aufgebaut werden d\u00fcrfen. Das hei\u00dft, in den Betriebszentralen sind keine ESTW_Zentraleinheiten sondern nur Bedien_Pl\u00e4tze und Bedien_Bezirke errichtet. Diese Bedien_Bezirke, die die Bedienung hochwertiger Strecken b\u00fcndeln, sind \u201ezentrale Bedien_Bezirke\u201c. Die Einschr\u00e4nkung, ESTW_Zentraleinheiten nicht im selben Geb\u00e4ude wie ESTW_Bedien_Bezirke aufzubauen, gilt nicht f\u00fcr eine Regio-BZ oder sonstige Technikstandorte. Auch im Regionalnetz werden ESTW_Zentraleinheiten errichtet. Bisher sind diese \u00f6rtlich besetzt. Unter anderem ist geplant bzw. in Realisierung, die Geb\u00e4ude in denen bereits eine Regio-ESTW_Zentraleinheit errichtet ist, eine weitere Regio-ESTW_Zentraleinheit einzubauen. Um auch hier Redundanzen und Synergien nutzen zu k\u00f6nnen, ist geplant auch hier einen Bedien_Bezirk \u00fcber die ESTW_Zentraleinheiten zu installieren. Der entscheidende Unterschied zur Bedienzentrale ist hier, dass Bedien_Bezirk und ESTW_Zentraleinheit in einem Geb\u00e4ude untergebracht sind. Da Strecken sowohl das Regionalnetz und das Fern- und Ballungsnetz durchlaufen k\u00f6nnen, m\u00fcssen die Kennzahlenplanungen ebenfalls Netzart\u00fcbergreifend sein. Siehe auch Attribut \u201eKennzahl\u201c. 2.) Virtueller Bedienbezirk Als Zweites ist die Option des virtuellen Bedien_Bezirks zu modellieren. Da ein Bedien_Bezirk ja nicht von Heute auf Morgen in ESTW-Technik da steht, m\u00fcssen \u00dcbergangsregelungen geschaffen werden. Auch wenn Stellwerke in einem Bedien_Bezirk (noch) nicht in ESTW-Technik realisiert sind oder die Zuordnung zum Regionalnetz oder Fern- und Ballungsnetz noch offen ist gilt: Die Stw sind einem Bedien_Bezirk zuzuordnen um jegliche sp\u00e4tere Realisierungsform zu erm\u00f6glichen und so auch die Kennzahlenvergabe sicher zu gestalten. Siehe auch Attribut \u201eKennzahl\u201c. Am Beispiel der Bedien_Bezirke 08 und 11 in der BZ Hannover sieht man, dass auch Stellwerke, die (noch) nicht an einen Bedien_Bezirk angebunden sind, eine Zuordnung erfahren m\u00fcssen. Alle Stellwerke (HORX, HK, Sarstedt und Barnten) liegen in einem betrieblich zusammenh\u00e4ngenden Bezirk. N\u00e4mlich auf den Nord-S\u00fcd Strecken von Hannover Richtung G\u00f6ttingen. Die Stellwerke HK, Sarstedt und Barnten sogar auf derselben Strecke 1732. Aktuell sind die Stellwerke Sarstedt und Barnten noch nicht an einen Bedien_Bezirk angebunden. In den Planungen und betrieblichen Vorgaben des Regionalbereichs aber f\u00fcr eine Zuordnung zum Bedien_Bezirk 11 vorgesehen. Daher muss schon jetzt der Bedienbezirk den Stw zugeordnet werden k\u00f6nnen, auch wenn sie ggf. trotz ESTW-Aufbau, \u00f6rtlich besetzt werden. Durch die Darstellung in dem Verweis \u201ezentral\u201c oder \u201evirtuell\u201c l\u00e4sst sich die aktuelle und geplante Anbindung darstellen. Im Verst\u00e4ndnis der Betriebszentralen entspricht das Objekt Bedien_Bezirk dem Steuerbezirk. Das Objekt kann im LST-Datenmodell jedoch auch als virtueller Bedien_Bezirk vorkommen. Jeder ESTW-Zentraleinheit wird auch ein Bedien_Bezirk zugeordnet. In der Regel der, der in der Kennzahlenplanung vorgesehen ist. Also auch dann, wenn physisch kein Bedienbezirk (Steuerbezirk) oder eine vergleichbare Einheit vorhanden ist (z. B. Regionale Bedienzentrale mit nur einer ESTW-Zentraleinheit), aber bestimmte Eigenschaften mehrerer gemeinsam gesteuerter ESTW-Zentraleinheiten \u00fcbergreifend geplant werden m\u00fcssen (z.B. Richtungssinn und Kennzahlen). Gem\u00e4\u00df Richtlinie 819.0603 m\u00fcssen Kennzahlen und Betriebsstellenbezeichner im Steuerbezirk und an seinen Grenzen eindeutig (einmalig) sein. Diese Regel kann nicht \u00fcber das Modell abgebildet werden, sondern muss in der Plausibilit\u00e4ts- und Zul\u00e4ssigkeitspr\u00fcfung (PlaZ) abgefangen werden. Die Vorgabe f\u00fcr den Richtungssinn bezieht sich immer auf einen kompletten Steuerbezirk. Sie ist jedoch als Eigenschaft der Bedienoberfl\u00e4che modelliert. Gegebenenfalls m\u00fcssen hier Zul\u00e4ssigkeitspr\u00fcfungen ablaufen. Im Bedienbezirk werden au\u00dferdem die Angaben f\u00fcr die Datenkommunikation mit den zugeordneten ESTW-Zentraleinheiten geplant. Die Werte A, B und C werden nach Ril 819.0705A01 von der DB Netz festgelegt. Der Ansprechpartner findet sich in der Ril. Alle weiteren Werte lassen sich anhand dieser Unterlage bestimmen. Siehe Anlage Media:ipadr namensv ib1.pdf DB-Regelwerk 819.0603 819.0705A01 "
		   });
		addAnnotation
		  (getBedien_Bezirk_IDBedienZentrale(),
		   source,
		   new String[] {
			   "documentation", "Verweis vom Bedienbezirk auf die Bedienzentrale. Der Verweis ist auch f\u00fcr virtuelle Bedienbezirke zu f\u00fcllen."
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_AWert(),
		   source,
		   new String[] {
			   "documentation", "Vorgabewert f\u00fcr Rechneradressen gem\u00e4\u00df Adressformel f\u00fcr die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der A-Wert wird gem\u00e4\u00df 819.0705 Abschnitt 6 (9) und (10) gebildet."
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_BWert(),
		   source,
		   new String[] {
			   "documentation", "Vorgabewert f\u00fcr Rechneradressen gem\u00e4\u00df Adressformel f\u00fcr die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der B-Wert wird gem\u00e4\u00df 819.0705 Abschnitt 6 (9) und (10) gebildet. "
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_CWert(),
		   source,
		   new String[] {
			   "documentation", "Vorgabewert f\u00fcr Rechneradressen gem\u00e4\u00df Adressformel f\u00fcr die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der C-Wert wird gem\u00e4\u00df 819.0705 Abschnitt 6 (8) gebildet. "
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_DDWert(),
		   source,
		   new String[] {
			   "documentation", "Vorgabewert f\u00fcr Rechneradressen gem\u00e4\u00df Adressformel f\u00fcr die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der DD-Wert wird gem\u00e4\u00df 819.0705 Abschnitt 6 (11) gebildet. "
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_XWert(),
		   source,
		   new String[] {
			   "documentation", "Vorgabewert f\u00fcr Rechneradressen gem\u00e4\u00df Adressformel f\u00fcr die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der X-Wert wird gem\u00e4\u00df 819.0705 Abschnitt 6 (5) und (7) gebildet. "
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_YWert(),
		   source,
		   new String[] {
			   "documentation", "Vorgabewert f\u00fcr Rechneradressen gem\u00e4\u00df Adressformel f\u00fcr die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der Y-Wert wird gem\u00e4\u00df 819.0705 Abschnitt 6 (5) und (7) gebildet. "
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_YYWert(),
		   source,
		   new String[] {
			   "documentation", "Vorgabewert f\u00fcr Rechneradressen gem\u00e4\u00df Adressformel f\u00fcr die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der YY-Wert wird gem\u00e4\u00df 819.0705 Abschnitt 6 (8) gebildet. "
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB2(),
		   source,
		   new String[] {
			   "documentation", "Verbindung IB 1 zu IB 2. Angabe, ob der jeweilige Bedien Bezirk (Steuerbezirk) eine Anbindung zum Integrit\u00e4tsbereich 2 (IB II) hat (true) oder nicht (false). Die Planungsdaten f\u00fcr die IB I-IB II-Kopplung werden \u00fcber ID Anhang Anbindung IB2 im PDF-Format als Anhang beigegeben."
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB3(),
		   source,
		   new String[] {
			   "documentation", "Verbindung IB 1 zu IB 3. Angabe, ob der jeweilige Bedien Bezirk (Steuerbezirk) eine Anbindung zum Integrit\u00e4tsbereich 3 (IB III) hat (true) oder nicht (false). Die Planungsdaten f\u00fcr die IB III-Anbindung werden \u00fcber ID Anhang Anbindung IB3 im PDF-Format als Anhang beigegeben."
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_Hersteller(),
		   source,
		   new String[] {
			   "documentation", "Unternehmen, das die Funktionsf\u00e4higkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im R\u00fccklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme g\u00fcltige Firmierung zu verwenden. DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_Schrankreihe(),
		   source,
		   new String[] {
			   "documentation", "Ordnungskriterium eines Bedien_Bezirkes im Rechnerraum. Das Attribut kann, in Abh\u00e4ngigkeit von den \u00f6rtlichen Gepflogenheiten, aus mehreren alphanumerischen und Sonderzeichen bestehen."
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksname(),
		   source,
		   new String[] {
			   "documentation", "Angabe des regional \u00fcbliche Namen des Bedienbezirks (Steuerbezirks) in der BZ-Planung (AP PT 1 BZ). Beispiele sind: \\\"Rechter Rhein\\\", \\\"Allg\u00e4u/Fichtelgebirge\\\", etc."
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksnummer(),
		   source,
		   new String[] {
			   "documentation", "Ordnungskriterium des Bedien-Bezirks in den Planunterlagen. Die Steuerbezirksnummer besteht in der Regel aus einem numerischen Zeichen, ggf. aus einer Ganzzahl. Da regional Abweichungen m\u00f6glich sind, wurde der Basistyp offen gehalten."
		   });
		addAnnotation
		  (getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB2(),
		   source,
		   new String[] {
			   "documentation", "Plan zur Kabel-/Trassen-/Datenanbindung. Pl\u00e4ne k\u00f6nnen z. B. zur Darstellung der Kabelverbindungen vom IB 1 zum IB 2 angef\u00fcgt werden. Die Unterlagen sind in den Standorten unterschiedlich oder gar nicht vorhanden und werden ggf. als Anlage der AP PT 1 beigef\u00fcgt. "
		   });
		addAnnotation
		  (getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB3(),
		   source,
		   new String[] {
			   "documentation", "Plan zur Kabel-/Trassen-/Datenanbindung. Pl\u00e4ne k\u00f6nnen z. B. zur Darstellung der Kabelverbindungen vom IB 1 zum IB 3 angef\u00fcgt werden. Die Unterlagen sind in den Standorten unterschiedlich oder gar nicht vorhanden und werden ggf. als Anlage der AP PT 1 beigef\u00fcgt. "
		   });
		addAnnotation
		  (getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangSteuerbezUebersicht(),
		   source,
		   new String[] {
			   "documentation", "In diesen Anhang wird die Steuerbezirks\u00fcbersicht gem\u00e4\u00df 819.0603 als PDF eingebettet. Beispiel: Media:Steuerbezirksuebersicht.pdf DB-Regelwerk 819.0603 "
		   });
		addAnnotation
		  (getBedien_Einricht_Oertlich_Allg_AttributeGroup_BedienEinrichtBauart(),
		   source,
		   new String[] {
			   "documentation", "Bauart der Bedieneinrichtung. Je nach Art und Anzahl der bedienbaren Elemente werden die erforderlichen Bedieneinrichtungen ausgebildet. F\u00fcr Nahbedienungen gilt au\u00dferdem: NB_Art W: Bedienpult oder Bediens\u00e4ule; NB_Art R: Bedientablett, Stelltisch- oder -pult. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. "
		   });
		addAnnotation
		  (getBedien_Einricht_Oertlich_Allg_AttributeGroup_HupeAnschaltzeit(),
		   source,
		   new String[] {
			   "documentation", "Angabe der Hupdauer in Sekunden. Das Attribut wird nur gef\u00fcllt, wenn es sich um eine Bedieneinrichtung f\u00fcr die Nahbedienung handelt. Wird auf die Hupe einer NB-Bedieneinrichtung verzichtet, ist eine Anschaltdauer von Null Sekunden zu planen. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es findet sich im zugeh\u00f6rigen Lastenheft sowie in firmenspezifischen Projektierungsunterlagen, die jedoch dem LST-Fachplaner nicht zur Verf\u00fcgung stehen. "
		   });
		addAnnotation
		  (bedien_Einrichtung_OertlichEClass,
		   source,
		   new String[] {
			   "documentation", "Abbildung einer \u00f6rtlichen Bedieneinrichtung (Stelltafel, Bedienpult etc.) als physisches Element der Au\u00dfenanlage. Bedienbare Elemente, die nicht von einer ESTW-Bedienoberfl\u00e4che bedient werden, sind durch eine entsprechende Bedieneinrichtung umstellbar. Weiterhin sind in der Bedieneinrichtung Tasten f\u00fcr die Kommunikation zwischen \u00f6zF und Bediener untergebracht. Im Objekt Bedien_Einrichtung_Oertlich wird die physische Ausbildung der Bedieneinrichtung abgebildet. Die dazugeh\u00f6rigen Melder, Schalter und Taster sind im Objekt Bedien Anzeige Element modelliert. Die logischen Funktionen einer Bedieneinrichtung f\u00fcr Nahbedienbereiche und Bahn\u00fcberg\u00e4nge befinden sich in den Objekten \u201eBUE Bedien Anzeige Element\u201c oder \u201eNB Bedien Anzeige Element\u201c. Die Bedien_Einrichtung_Oertlich kommt zur Anwendung bei: Nahbedienbereichen Bahn\u00fcberg\u00e4ngen (HET, UT, etc.) Gefahrschaltern (Berliner S-Bahn) (noch nicht abschlie\u00dfend modelliert) Schl\u00fcsselschaltern- und Tastern (Zustimmung, Gleisfreimeldung, Zugschlussmeldung, etc.) ZP 10/9 \u2013Bediens\u00e4ulen \u00f6rtliche Abgabe von Zugschlussmeldungen und Bedieneinrichtungen an Schnittstellen zum Zugleitbetrieb. Bedieneinrichtungen von elektrisch ortsgestellten Weichen (EOW) werden mit diesem Objekt nicht modelliert. "
		   });
		addAnnotation
		  (getBedien_Einrichtung_Oertlich_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getBedien_Einrichtung_Oertlich_IDAnhangBenutzeroberflaeche(),
		   source,
		   new String[] {
			   "documentation", "Anhang zur Darstellung der Benutzeroberflaeche der Bedieneinrichtung. Beispielsweise kann eine Skizze f\u00fcr eine Gleisbilddarstellung oder die Anordnung der Schalter und Tasten beigef\u00fcgt werden. "
		   });
		addAnnotation
		  (getBedien_Einrichtung_Oertlich_IDAussenelementansteuerung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Au\u00dfenelementansteuerung, von der die \u00f6rtliche Bedieneinrichtung angesteuert wird. "
		   });
		addAnnotation
		  (getBedien_Einrichtung_Oertlich_IDUnterbringung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. F\u00fcr das PZB Element wird der Verweis nur f\u00fcr eine G\u00dc gef\u00fcllt - mit der Bedeutung: G\u00dc-Schaltkasten. F\u00fcr die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Bef\u00fcllung aller der f\u00fcr die Unterbringung notwendigen Attribute m\u00f6glich ist. DB-Regelwerk Darstellung des Geb\u00e4udes, der Bediens\u00e4ule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erl\u00e4uterungsbericht."
		   });
		addAnnotation
		  (getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup_BedienEinrichtOertlBez(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung der \u00f6rtlichen Bedieneinrichtung. \u00d6rtliche Bedieneinrichtungen haben in der Regel keine eigene Bezeichnung in der Au\u00dfenanlage. Das Attribut wird daher nur gef\u00fcllt, wenn davon abweichend die Bedieneinrichtung eine Bezeichnung erhalten soll. Die Bezeichnung der jeweils zu bedienenden Elemente f\u00fcr die Beschriftung auf der \u00f6rtlichen Bedieneinrichtung ist den Elementen oder dem Anhang Benutzeroberfl\u00e4che zu entnehmen."
		   });
		addAnnotation
		  (bedien_GBTEClass,
		   source,
		   new String[] {
			   "documentation", "Planung aller Parameter, die f\u00fcr die Darstellung der Gleisbenutzungstabelle (GBT) auf dem Bedienplatz f\u00fcr den Nutzer erforderlich sind."
		   });
		addAnnotation
		  (getBedien_GBT_IDAnhangVorgabeGBT(),
		   source,
		   new String[] {
			   "documentation", "Anhang mit Parametern f\u00fcr die Anzahl und Anordnung der Zuglenkbetriebsstellen in der Gleisbenutzungstabelle (GBT). Die konkreten Inhalte werden derzeit abgestimmt. "
		   });
		addAnnotation
		  (getBedien_GBT_IDBedienBezirk(),
		   source,
		   new String[] {
			   "documentation", "Die Eigenschaften der Gleisbelegungstabelle als Element der Bedienoberfl\u00e4che werden derzeit noch modelliert. Deshalb erfolgt eine Beschreibung aller damit zusammenh\u00e4ngender Eigenschaften und Verweise erst nach Abschluss dieser Konsolidierungsphase. "
		   });
		addAnnotation
		  (getBedien_GBT_Allg_AttributeGroup_Rueckschauzeit(),
		   source,
		   new String[] {
			   "documentation", "Angabe der Zeit, in der die GBT f\u00fcr Fahrplanzeiten der Vergangenheit gesehen und editiert werden kann."
		   });
		addAnnotation
		  (getBedien_GBT_Allg_AttributeGroup_Vorschauzeit(),
		   source,
		   new String[] {
			   "documentation", "Angabe der Zeit, in der die GBT f\u00fcr Fahrplanzeiten der Zukunft gesehen und editiert werden kann."
		   });
		addAnnotation
		  (bedien_OberflaecheEClass,
		   source,
		   new String[] {
			   "documentation", "Topologisches Abbild der f\u00fcr die Bedienung und Anzeige eines ESTW relevanten sicherungstechnischen Anlagen. Dies wird in Form von Meldebildern mit unterschiedlicher Informationstiefe dargestellt. Dar\u00fcber hinaus gibt es weitere zum Bedienplatzsystem geh\u00f6rende Meldebilder. Folgende Meldebildtypen stehen an einem Bedienplatzsystem (BPS) zur Verf\u00fcgung: Bereichs\u00fcbersicht (Ber\u00fc), Bereichs\u00fcbergreifende Ber\u00fc, Lupe, Gleisbenutzungstabelle (GBT), Kommunikationsanzeige (KA), KA-Bild 1 (PSI-Spiegel), KA-Bild 2 (ESTW-St\u00f6rungsmeldungen), Betriebsstatus (Rechnerst\u00f6rungen), Sammelmelderbild (SM-Bild), Dokumentation (Doku), Integrierte Bedienerf\u00fchrung. An anderen Bedienplatzsystemen k\u00f6nnen andere Meldebildtypen m\u00f6glich sein. Die Eigenschaften eines Bildes sind unter dem Objekt Bedien Oberflaeche Bild zusammengefasst. Mehrere Bilder verweisen auf das Objekt Bedien_Oberflaeche. Die M\u00f6glichkeiten der Aufschaltung der jeweiligen Bedienoberfl\u00e4chen auf den Bedienpl\u00e4tzen sind implizite Stellwerksfunktion. Die dazu notwendigen Berechtigungen sind Betriebsdaten der Instandhaltung. Diese Parameter werden im PT I nicht geplant und im Datenmodell nicht abgebildet. Sondern von der \u00f6rtlichen Instandhaltung in die Systeme eingegeben. Die Bildbezeichnung des jeweiligen Oberfl\u00e4chenbildes nach der signifikanten (also der bedeutenstenten) Betriebsstelle entsprechend Richtlinie 819.0603 in der Form \\\"(Bildart)_(Ril 100 Abk)\\\" wird \u00fcber die Attribute Oberflaeche Bildart und ID Oertlichkeit gebildet. "
		   });
		addAnnotation
		  (getBedien_Oberflaeche_IDBedienBezirk(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf einen Bedien_Bezirk zur Zuordnung der Bedienoberfl\u00e4chen eines Steuerbereiches und der f\u00fcr Ihre Darstellung notwendigen Parameter. "
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangMonitoraufteilung(),
		   source,
		   new String[] {
			   "documentation", "Anhang mit der vom Nutzer gew\u00fcnschten groben Aufteilung der Infrastruktur (z. B. Stellelemente) auf die jeweils anzuzeigenden Bildinhalte der Bedienoberfl\u00e4che des IB I als Realisierungsvorgabe im Rahmen der AP PT 1 BZ, sofern keine Funktionale und Betriebliche Pr\u00fcfung (BEST) stattfindet. Eine Monitoraufteilung im Sinne einer Benutzung der Monitore f\u00fcr bestimmte Segmente des Standardbedienplatzes (IB I, IB II, IB III, TK), also die Anordnung der Monitore selbst am Bedienplatz, ist hier nicht gemeint. Diese wird im Attribut ID Anhang Moebelaufstellplan Aufriss verwaltet. Beispiel: Media:Monitoraufteilung.pdf. Wird eine Funktionale und Betriebliche Pr\u00fcfung durchgef\u00fchrt (BEST), werden die Vorgaben \u00fcber ID Anhang Vorgabe BELU \u00fcbergeben."
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangRichtungssinn(),
		   source,
		   new String[] {
			   "documentation", "Anhang zur Erl\u00e4uterung des Richtungssinns. Der Richtungssinn ist eine Realisierungsvorgabe der AP PT 1 BZ und wird vom Nutzer vorgegeben. Er muss unter Beachtung der Richtlinie 819.0603 innerhalb des Steuerbezirkes und an den Grenzen einschlie\u00dflich aller dargestellten abzweigenden Strecken eindeutig sein. Die Vorgaben f\u00fcr den Richtungssinn beziehen sich zumindest immer auf einen kompletten Steuerbezirk. Eine Angabe f\u00fcr den gesamten Bereich einer Betriebszentrale ist ebenfalls m\u00f6glich (BZ Hannover). Somit k\u00f6nnen einzelne ESTW-Zentraleinheiten bei Bedarf ohne \u00c4nderung des Richtungssinnes in einen anderen Bedienbezirk (Steuerbezirk) umgesetzt werden. Die Vorgabe f\u00fcr den Richtungssinn ist jedoch als Eigenschaft der Bedienoberfl\u00e4che modelliert. Gegebenenfalls m\u00fcssen hier Zul\u00e4ssigkeitspr\u00fcfungen ablaufen. Beispiele: UZ Elsterwerda und UZ Dresden-Neustadt Media:Richtungssinn.pdf, BZ Hannover Media:Richtungssinn BZ Hannover.pdf. DB Regelwerk Richtlinie 819.0603 "
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangVorgabeBELU(),
		   source,
		   new String[] {
			   "documentation", "In diesem Anhang werden die Realisierungsvorgaben f\u00fcr die Bedienoberfl\u00e4chen in Form von Bildern der jeweiligen Bereichs\u00fcbersichten und Lupen im PDF-Format geliefert. Diese Realisierungsvorgaben werden in BEST erzeugt, wenn das ESTW einer Funktionalen und Betrieblichen Pr\u00fcfung unterzogen wurde. Wenn keine Funktionale und Betriebliche Pr\u00fcfung (BEST) erstellt wurde, werden diese Bilder auch vom Auftragnehmer auf Grundlage von ID Anhang Monitoraufteilung erstellt und dem Auftraggeber zur Pr\u00fcfung \u00fcbergeben. In der Regel werden diese Bilder dann vom zust\u00e4ndigen Leiter Fahrdienst gepr\u00fcft und frei gegeben. Beispiel: Media:BELUVorgabe.pdf. DB-Regelwerk Wenn keine Funktionale und Betriebliche Pr\u00fcfung stattfindet, werden die Realisierungsvorgaben im Rahmen des PT 1 BZ \u00fcbergeben (Monitoraufteilung). "
		   });
		addAnnotation
		  (bedien_Oberflaeche_BildEClass,
		   source,
		   new String[] {
			   "documentation", "Zusammenfassung der Eigenschaften, die sich jeweils nur auf ein Bild der Bedienoberfl\u00e4che beziehen. Eigenschaften, die alle Bilder betreffen, sind unter Bedien Oberflaeche eingebunden. "
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Bild_IDBedienOberflaeche(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung eines Bildes zur zugeh\u00f6rigen Bedienoberfl\u00e4che. Die verschiedenen Bedienoberfl\u00e4chenbilder werden zu einem sogenannten \\\"Aufschaltbereich\\\" zusammengefasst. Dieser kann dann auf verschiedenen Bedienpl\u00e4tze aufgeschaltet werden. Die Aufschaltung ist Stellwerksfunktion und wird im LST-Datenmodell nicht abgebildet. "
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Bild_IDOertlichkeit(),
		   source,
		   new String[] {
			   "documentation", "Verweis zur Ermittlung der Ril 100-Abk\u00fcrzung f\u00fcr die Bildbezeichnung nach der signifikanten Betriebsstelle des jeweiligen Bildes. Signifikant deshalb, weil von einer ESTW Zentraleinheit, die einer Ril 100 zugeordnet ist, mehrere Aussenelementansteuerungen bedient werden k\u00f6nnen, die ggf. weitere Ril 100-Bezeichnungen haben. Siehe Beispiel Media:Lupen HBS1.pdf \u00dcber die Lupe \\\"L_HBS1\\\", die zur ESTW-Zentraleinheit \\\"ESTW Braunschweig HBS\\\" geh\u00f6rt, werden Aussenelementansteuerungen in den Bereichen der \u00d6rtlichkeiten \\\"HSMK\\\" und \\\"HBUH\\\" mit bedient. Die Lupe tr\u00e4gt aber die Bezeichnung der signifikanten ESTW-Zentraleinheit ESTW Braunschweig. "
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheBildart(),
		   source,
		   new String[] {
			   "documentation", "Bildart Ber\u00fc oder Lupe. Mit dem Attribut Bildart wird zwischen Ber\u00fc und Lupe unterschieden. Eine Beschreibung des Zust\u00e4ndigkeitsbereiches der einzelnen Bilder erfolgt im Rahmen eines anderen Attributs."
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheZustaendigkeit(),
		   source,
		   new String[] {
			   "documentation", "Verbale Beschreibung, welche zu steuernden Anteile des ESTW auf diesem Oberfl\u00e4chenbild dargestellt werden sollen. Beispiel aus herk\u00f6mmlicher Planung (F\u00fcr das Beispiel dieses Attributes ist nur die zweite Spalte der Tabelle relevant, die erste Spalte wird neu durch die Attribute Bildart und Bildbezeichnung ersetzt.): Media:Zustaendigkeit.pdf."
		   });
		addAnnotation
		  (bedien_OertlichkeitEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnung einer Oertlichkeit zum Bedien Bezirk, aus dem sie bedient wird. Dabei werden in diesem Zuordnungsobjekt die vorhandenen Angaben aus dem Objekt \u00d6rtlichkeit der jeweiligen Betriebsstelle um weitere Angaben wie beispielsweise die ESTW-Kennzahl oder den Betriebsstellenbezeichner (Streckenziel) planerisch angereichert. Gem\u00e4\u00df Richtlinie 819.0603 m\u00fcssen die ESTW-Kennzahlen und Betriebsstellenbezeichner im Steuerbezirk und an seinen Grenzen eindeutig (einmalig) sein. Diese Regel kann nicht \u00fcber das Modell abgebildet werden, sondern muss in der Plausibilit\u00e4ts- und Zul\u00e4ssigkeitspr\u00fcfung (PlaZ) abgefangen werden. Siehe Beispiel Media:Lupen HBS1.pdf \\\"Bf Braunschweig Hbf (HBS) 30\\\": Betriebsstellenbezeichner ==\\u0026gt; \\\"Bf Braunschweig Hbf\\\", Oertlichkeit ==\\u0026gt; \\\"HBS\\\", Kennzahl ==\\u0026gt; \\\"30\\\". DB-Regelwerk 819.0603 "
		   });
		addAnnotation
		  (getBedien_Oertlichkeit_IDBedienBezirk(),
		   source,
		   new String[] {
			   "documentation", "Mit diesem Verweis werden alle aus einem Bedienbezirk steuerbaren \u00d6rtlichkeiten diesem planerisch zugeordnet. Heute erfolgt dies implizit \u00fcber die Kennzahlentabelle, Steuerbezirksgrafiken oder die Beschreibung im Erl\u00e4uterungsbericht. "
		   });
		addAnnotation
		  (getBedien_Oertlichkeit_IDOertlichkeit(),
		   source,
		   new String[] {
			   "documentation", "Verweis zur Ermittlung der Ril 100-Abk\u00fcrzung f\u00fcr die jeweils im Bedienbezirk bedienten Betriebsstellen. "
		   });
		addAnnotation
		  (getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Betriebsstellenbezeichner(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung der Betriebsstellenbezeichner und somit der Ausfahrziele, die vom Nutzer vorzugeben ist. Da eine ESTW Zentraleinheit mehrere \u00d6rtlichkeiten bedienen kann (siehe Kennzahl), ist es m\u00f6glich, dass eine Kennzahl unterschiedliche Betriebsstellen als Ausfahrziele anfahren kann. Daher muss hier der Betriebsstellenbezeichner extra erfasst werden. DB-Regelwerk 819.0603 Anhang 3 "
		   });
		addAnnotation
		  (getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Kennzahl(),
		   source,
		   new String[] {
			   "documentation", "Eindeutige Kennzahl der Sicherungstechnik bzw. operativen Leittechnik innerhalb eines Bedienbezirks f\u00fcr eine Betriebsstelle. Die ESTW-Kennzahl kennzeichnet eine Betriebsstelle oder einen Betriebsstellenteil. Sie darf nicht mit der Bahnhofsnummer der Zugnummernmeldeanlage (Ril 819.0731) verwechselt werden. Die Kennzahl wird im Elementnamen verwendet. Zuteilung Eine Betriebsstelle kann mehrere Kennzahlen erhalten; vor allem dann, wenn es sich um eine Betriebsstelle mit vielen Elementen handelt. Durch den LST-Planer werden die Gebiete der Kennzahlen sinnvoll aufgeteilt. Eine weitere M\u00f6glichkeit besteht darin, dass in einem Geb\u00e4ude zwei ESTW-Zentraleinheiten untergebracht sind (Beispiel: Hannover Hbf mit den ESTW-Zentraleinheiten \u201eHH Kennzahl 06\u201c und \u201eHHZX Kennzahl 30\u201c). Eine Kennzahl kann aber auch mehrere Betriebsstellen beinhalten, insbesondere bei Betriebsstellen mit wenigen Elementen. Dies kommt zur Anwendung, wenn eine ESTW-Zentraleinheit zwei \u00dcberleitstellen steuert (Beispiel: ESTW-Zentraleinheit Giften HGIF Kennzahl 71 mit \u201e\u00dcst Giften HGIF\u201c und \u201e\u00dcst Ritterkamp HRIT\u201c. In Stellbereichen von Bedienbezirken werden f\u00fcr Betriebsstellen (z. B. Bahnh\u00f6fe, Abzweigstellen, Anschlussstellen) Kennzahlen von 01 bis 99 vergeben. Diese Kennzahl muss im Bedienbezirk eindeutig sein. Eindeutigkeit der Kennzahlen bei angrenzenden Bedienbezirken entlang einer Strecke Innerhalb eines Bedienbezirks und f\u00fcr benachbarte Betriebsstellen eines angrenzenden Bedienbezirks entlang einer Strecke darf eine Kennzahl nur einmal verwendet werden. Beispiel: Media:Bedien Oertlichkeit Kennzahl 131121.pdf F\u00fcr alle im jeweiligen Bereich befindlichen Stellelemente der Betriebsstellen und Strecken wird die Kennzahl Bestandteil der ausf\u00fchrlichen Elementbezeichnung. Hierdurch er\u00fcbrigt sich in einem gr\u00f6\u00dferen Bereich der Infrastruktur die Mitf\u00fchrung eines Ortsbezeichners. Zentrale Vergabe von Kennzahlen auch ohne Anbindung an Bedien_Zentralen Unabnh\u00e4ngig ob eine ESTW-Zentraleinheit aus einer Bedien_Zentrale gesteuert wird oder nur \u00f6rtlich eingerichtet ist, soll die Kennzahlenvergabe zentral im Sinne einer m\u00f6glichen Konzentration von ESTW-Zentraleinheiten in Bedienbezirken geplant und vergeben werden. DB-Regelwerk Kennzahltabelle oder Kennzaheln\u00fcbersichtsplan im PT 1, 819.0603 2, 819.9001 1 (5). "
		   });
		addAnnotation
		  (bedien_PlatzEClass,
		   source,
		   new String[] {
			   "documentation", "\u00d6rtliche Anordnung der Bedien- und Meldeeinrichtungen zur betrieblichen Nutzung eines elektronischen Stellwerks. Der Bedien_Platz kann sowohl an einem Bedien_Bezirk wie auch an einer ESTW_Zentraleinheit angeschaltet sein. Der Aufstellungsort muss aber nicht zwingend der Anschalteort sein. Der Bedien_Platz kann auch als abgesetzter Bedien_Platz an abweichenden Orten untergebracht sein. Z.B. wenn im Modulgeb\u00e4ude der ESTW_Zentraleinheit nicht ausreichend Platz ist und der Bedien_Platz im benachbartem alten Stellwerksgeb\u00e4ude untergebracht werden soll. Um dem Lieferanten die allgemeine Auspr\u00e4gung des Bedien_Platzes im PT 1 zu beschreiben, ist noch der Hinweis zu erbringen, ob es sich um einen Not-Bedien_Platz oder einen Standard-Bedien_Platz handelt. Da es verschiedne Kombinationen und mehere Instanzen von Bedien_Platz geben kann, hier noch mal Beispielhafte Varianten: ESTW_Zentraleinheit mit Anbindung an einen Bedien_Bezirk mit \u00f6rtlichem Notbedienplatz im Modulgeb\u00e4ude und Standardbedienpl\u00e4tzen in der Bedien_Zentrale (z.B. ESTW Orxhausen/Siemens) ESTW_Zentraleinheit mit abgesetzten Standardbedienpl\u00e4tzen und mit \u00f6rtlichem Notbedienplatz im Modulgeb\u00e4ude (z.B. ESTW Kreiensen/Bombardier) ESTW_Zentraleinheit mit Anbindung an einen Bedien_Bezirk mit abgesetztem Notbedienplatz im Altstellwerk und Standardbedienpl\u00e4tzen in der Bedien_Zentrale (z.B. ESTW Oldenburg Nord/Siemens) Aus diesem Zusammenhang entstehen vier Typen von Bedienpl\u00e4tzen. Standard-Bedienplatz-System (Standard_BPS) Standard-Bedienplatz-System abgesetzt (Standard_BPS_Abgesetzt) Not-Bedienplatz Not-BPS-System (Not_BPS) Not-Bedienplatz Not-BPS-System abgesetzt (Not_BPS_Abgesetzt) Im PT 1 BZ werden f\u00fcr den Bedienplatz die Aufstellung im Raum, die Ausstattung und Ausr\u00fcstung sowie die Versorgung mit elektrischer Energie und Daten geplant. Siehe Beispiel der BZ Hannover: Plan der Bedienebene: Media:Plan Bedieneben BZH.pdf, Schematischer Plan der Strom- und Datenversorgung am Bedienplatz: Media:Plan Stromversorgung BPL BZH.pdf. "
		   });
		addAnnotation
		  (getBedien_Platz_IDAnhangMoebelplanAufriss(),
		   source,
		   new String[] {
			   "documentation", "Anhang im PDF-Format, der den horizontalen Aufbau der Bedienm\u00f6bel einer Bedienzentrale beschreibt. Der Ein- und Ausbau der Ausr\u00fcstung erfolgt in der \u00fcblichen Rot/Gelb-Darstellung. "
		   });
		addAnnotation
		  (getBedien_Platz_IDAnhangMoebelplanGrundriss(),
		   source,
		   new String[] {
			   "documentation", "Anhang im PDF-Format, der die Aufstellfl\u00e4che und die Anschl\u00fcsse f\u00fcr elektrische Energie und Daten der Bedienpl\u00e4tze einer Bedienzentrale beschreibt. Der Ein- und Ausbau von Bedienpl\u00e4tzen und Anschl\u00fcssen erfolgt in der \u00fcblichen Rot/Gelb-Darstellung."
		   });
		addAnnotation
		  (getBedien_Platz_IDUnterbringung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. F\u00fcr das PZB Element wird der Verweis nur f\u00fcr eine G\u00dc gef\u00fcllt - mit der Bedeutung: G\u00dc-Schaltkasten. F\u00fcr die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Bef\u00fcllung aller der f\u00fcr die Unterbringung notwendigen Attribute m\u00f6glich ist. DB-Regelwerk Darstellung des Geb\u00e4udes, der Bediens\u00e4ule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erl\u00e4uterungsbericht."
		   });
		addAnnotation
		  (getBedien_Platz_IDBedienBezirk(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf einen Bedien_Bezirk zur Zuordnung der Bedienpl\u00e4tze eines Steuerbereiches und der f\u00fcr Ihre Darstellung notwendigen Parameter (z.Zt. noch \u00fcber PDF-Anh\u00e4nge). "
		   });
		addAnnotation
		  (getBedien_Platz_IDESTWZentraleinheit(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung des Bedienplatzes zu einer ESTW_Zentraleinheit, wenn der Bedienplatz nicht an einen Bedien_Bezirk, sondern direkt an die ESTW_Zentraleinheit angeschaltet ist (z. B. Notbedienplatz). "
		   });
		addAnnotation
		  (getBedien_Platz_Allg_AttributeGroup_BedienPlatzArt(),
		   source,
		   new String[] {
			   "documentation", "Auspr\u00e4gung des Bedienplatzes. Da es verschiedne Kombinationen und mehere Instanzen von Bedien_Platz geben kann, sind nachfolgend beispielhafte Varianten aufgef\u00fchrt: ESTW Zentraleinheit mit Anbindung an einen Bedien Bezirk, \u00f6rtlichem Notbedienplatz im Modulgeb\u00e4ude und Standardbedienpl\u00e4tzen in der Bedien Zentrale (z.B. ESTW Orxhausen/Siemens); ESTW_Zentraleinheit mit abgesetzten Standardbedienpl\u00e4tzen und \u00f6rtlichem Notbedienplatz im Modulgeb\u00e4ude (z.B. ESTW Kreiensen/Bombardier); ESTW_Zentraleinheit mit Anbindung an einen Bedien_Bezirk mit abgesetztem Notbedienplatz im Altstellwerk und Standardbedienpl\u00e4tzen in der Bedien_Zentrale (z.B. ESTW Oldenburg Nord/Siemens). Aus diesem Zusammenhang entstehen vier Arten von Bedienpl\u00e4tzen. Standard-Bedienplatz-System (Standard_BPS); Standard-Bedienplatz-System abgesetzt (Standard_BPS_abgesetzt); Not-Bedienplatz-System (Not_BPS); Not-Bedienplatz-System abgesetzt (Not_BPS_Abgesetzt). "
		   });
		addAnnotation
		  (getBedien_Platz_Allg_AttributeGroup_Bedienplatzbezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des Bedienplatzes. Regional abh\u00e4ngig sind Folgen von alphanumerischen- und Sonderzeichen gebr\u00e4uchlich. Gemeint ist die orts\u00fcbliche Bezeichnung eines Arbeittsplatzes z.B. in einer Bedieninsel. Siehe Beispiel der BZ Hannover: Plan der Bedienebene: Media:Plan Bedieneben BZH.pdf, Raster X22. Dort befindet sich der Bedienplatz \u201e82\u201c mit der Bezeichnung \u201e\u00f6zF Celle S\u00fcd\u201c. Daraus ergibt sich: Bedienplatzbezeichnung: \u00f6zF Celle S\u00fcd Bedienplatznummer: 82 M\u00f6gliche weitere Bezeichnungen w\u00e4ren z.B. Bedienplatzbezeichnung \u00f6zF Celle (S\u00fcd) Bedienplatznummer: HC_2 oder HC_S Nicht gemeint ist diese technische Bezeichnung des Systemherstellers, z.B. die fortlaufende Nummer eines Standardbedienplatzes in einem Steuerbezirk, die nicht aus dem PT1 kommt sondern im PT2 von der SBI geliefert wird. Siehe Media:Bedienplatzbezeichnung Nummer.pdf. Hier wird der im Siemens-Bedien_Bezirk angeschaltete Bedienplatz wie folgt erfasst: Bedienplatzbezeichnung: BPS0112 (n\u00e4mlich der erste Bedienplatz im Bedienbezirk 12) Bedienplatznummer: 1 (n\u00e4mlich in der Schrankbezeichnung erfasst!) "
		   });
		addAnnotation
		  (getBedien_Platz_Allg_AttributeGroup_Bedienplatznummer(),
		   source,
		   new String[] {
			   "documentation", "Nummer oder Kurzbezeichnung des Bedienplatzes. Regional abh\u00e4ngig sind Folgen von alphanumerischen- und Sonderzeichen gebr\u00e4uchlich. Gemeint ist die Nummer oder Kurzbezeichnung eines Arbeittsplatzes z.B. in einer Bedieninsel. Siehe Beispiel der BZ Hannover: Plan der Bedienebene: Media:Plan Bedieneben BZH.pdf, Raster X22. Dort befindet sich der Bedienplatz \u201e82\u201cmit der Bezeichnung \u201e\u00f6zF Celle S\u00fcd\u201c. Daraus ergibt sich: Bedienplatzbezeichnung: \u00f6zF Celle S\u00fcd Bedienplatznummer: 82 M\u00f6gliche weitere Bezeichnungen w\u00e4ren z.B. Bedienplatzbezeichnung \u00f6zF Celle (S\u00fcd) Bedienplatznummer: HC_2 oder HC_S Nicht gemeint ist diese technische Bezeichnung des Systemherstellers, z.B. die fortlaufende Nummer eines Standardbedienplatzes in einem Steuerbezirk, die nicht aus dem PT1 kommt sondern im PT2 von der SBI geliefert wird. Siehe Media:Bedienplatzbezeichnung Nummer.pdf. Hier wird der im Siemens-Bedien_Bezirk angeschaltete Bedienplatz wie folgt erfasst: Bedienplatzbezeichnung: BPS0112 (n\u00e4mlich der erste Bedienplatz im Bedienbezirk 12) Bedienplatznummer: 1 (n\u00e4mlich in der Schrankbezeichnung erfasst!) "
		   });
		addAnnotation
		  (getBedien_Platz_Allg_AttributeGroup_Bedienraumnummer(),
		   source,
		   new String[] {
			   "documentation", "Nummer oder Bezeichnung des Raumes, in dem der Bedienplatz untergebracht ist. Regional abh\u00e4ngig sind Folgen von alphanumerischen- und Sonderzeichen gebr\u00e4uchlich."
		   });
		addAnnotation
		  (bedien_StandortEClass,
		   source,
		   new String[] {
			   "documentation", "Bei DSTW: Standort, von dem die Bedienung der DSTW erfolgt. Von einem Bedienstandort k\u00f6nnen mehrere Technikstandorte bedient werden."
		   });
		addAnnotation
		  (getBedien_Standort_IDUnterbringung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Unterbringung (Geb\u00e4ude), in der der Bedien-Standort untergebracht ist."
		   });
		addAnnotation
		  (getBedien_Standort_Bezeichnung_AttributeGroup_BezeichnungBSO(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des Bedien-Standorts."
		   });
		addAnnotation
		  (bedien_ZentraleEClass,
		   source,
		   new String[] {
			   "documentation", "Betriebsleitstelle eines EIU, aus der die Leit- und Sicherungstechnik von zentral gesteuerten ESTW planm\u00e4\u00dfig bedient wird. Die Betriebsleitstelle kann eine Betriebszentrale (BZ) der DB Netz oder auch eine zentrale Bedienstelle der Regionalnetze sein. Da die Bedien_Zentrale nicht notwendigerweise in der N\u00e4he von Gleisen liegt, wird kein unmittelbarer Bezug zu einer Strecke hergestellt. Eine \u00d6rtlichkeit wird jedoch nach Ril 100 f\u00fcr den Standort festgelegt. In der Bedien_Zentrale sind die spezifischen Anh\u00e4nge dargestellt. Weitere Pl\u00e4ne aus dem PT I BZ, wie beispielsweise Belegungspl\u00e4ne f\u00fcr Bodentanks, Kabel\u00fcbersichtspl\u00e4ne, Verteilerbelegungspl\u00e4ne, Schrankpl\u00e4ne, H\u00f6heneinheiten und Patchfeldbelegungen in den Schr\u00e4nken f\u00fcr die BZ, werden als allgemeiner Anhang f\u00fcr die vererbten Eigenschaften aus dem Basisobjekt (Attribut Anhang) im Objekt Bedien_Zentrale angeh\u00e4ngt."
		   });
		addAnnotation
		  (getBedien_Zentrale_IDAnhangPlanBedienraum(),
		   source,
		   new String[] {
			   "documentation", "Raumplan der Bedienr\u00e4ume als PDF-Anhang. Der Anhang beschreibt die Anordnung aller Bedienm\u00f6bel einer Bedienzentrale in den Bedienr\u00e4umen zueinander sowie deren Anschl\u00fcsse f\u00fcr elektrische Energie, Potentialausgleich und Daten. Der Ein- und Ausbau von Bedienpl\u00e4tzen erfolgt in der \u00fcblichen Rot/Gelb-Darstellung. Beispiel: Media:Plan Bedieneben BZH.pdf "
		   });
		addAnnotation
		  (getBedien_Zentrale_IDAnhangPlanRechnerraum(),
		   source,
		   new String[] {
			   "documentation", "Raumplan der Rechnerr\u00e4ume als PDF-Anhang. Der Anhang beschreibt die Anordnung aller Rechnerschr\u00e4nke einer Bedienzentrale in den Rechnerr\u00e4umen zueinander sowie deren Anschl\u00fcsse f\u00fcr elektrische Energie, Potentialausgleich und Daten. Der Ein- und Ausbau von Rechnerschr\u00e4nken erfolgt in der \u00fcblichen Rot/Gelb-Darstellung. Beispiel: Media:Plan Keller BZH.pdf"
		   });
		addAnnotation
		  (getBedien_Zentrale_IDStrecke(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung einer Bedienzentrale zu einer Streckennummer. Bedienzentralen (Betriebszentralen) der DB Netz AG werden willk\u00fcrlich einer Strecke zugeordnet, um den Anforderungen der Richtlinie 100 minimal zu gen\u00fcgen. Diese Zuordnung ist auf die \u201eH\u00fclle\u201c der Zentrale bezogen, nicht auf die aus ihr gesteuerte Infrastruktur. "
		   });
		addAnnotation
		  (getBedien_Zentrale_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getBedien_Zentrale_IDOertlichkeit(),
		   source,
		   new String[] {
			   "documentation", "Verweis zur Ermittlung des Ril 100-Bezeichners bei Bedienzentralen ohne abweichenden Namen. "
		   });
		addAnnotation
		  (getBedien_Zentrale_Bezeichnung_AttributeGroup_BezBedZentrale(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung einer Betriebszentrale, die nicht gem\u00e4\u00df Richtlinie 100 bezeichnet ist (z. B. eine regionale Bedienzentrale) und deren Name somit nicht \u00fcber den Verweis auf eine \u00d6rtlichkeit ermittelt werden kann. Derzeit wird noch gepr\u00fcft, ob auch regionale Bedienzentralen gem\u00e4\u00df Ril 100 bezeichnet werden m\u00fcssen. Entsprechend kann dieses Attribut ggf. entfallen oder als \\\"nicht Pflicht\\\" anderweitig verwendet werden."
		   });
		addAnnotation
		  (getBSO_IP_AB_Teilsystem_AttributeGroup_BSOTeilsystemArt(),
		   source,
		   new String[] {
			   "documentation", "Art des BSO-Teilsystems (integriertes Bediensystem (iBS) oder Transfernetz Bedienung)."
		   });
		addAnnotation
		  (getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockBlau(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr das Teilsystem reservierter Adressblock im blauen Weg des bbIP-Netzes. "
		   });
		addAnnotation
		  (getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockGrau(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr das Teilsystem reservierter Adressblock im grauen Weg des bbIP-Netzes. "
		   });
		addAnnotation
		  (getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4(),
		   source,
		   new String[] {
			   "documentation", "Reservierter IPv4-Adressblock f\u00fcr den blauen Weg des bbIP-Netzes."
		   });
		addAnnotation
		  (getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6(),
		   source,
		   new String[] {
			   "documentation", "Reservierter IPv6-Adressblock f\u00fcr den blauen Weg des bbIP-Netzes."
		   });
		addAnnotation
		  (getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4(),
		   source,
		   new String[] {
			   "documentation", "Reservierter IPv4-Adressblock f\u00fcr den grauen Weg des bbIP-Netzes."
		   });
		addAnnotation
		  (getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6(),
		   source,
		   new String[] {
			   "documentation", "Reservierter IPv6-Adressblock f\u00fcr den grauen Weg des bbIP-Netzes."
		   });
		addAnnotation
		  (getBSO_IP_Adressblock_AttributeGroup_Regionalbereich(),
		   source,
		   new String[] {
			   "documentation", "Regionalbereich, dem der Bedien-Standort zugewiesen ist."
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (a_Wert_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCA_Wert",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getA_Wert_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (anbindung_IB2_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAnbindung_IB2",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnbindung_IB2_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (anbindung_IB3_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAnbindung_IB3",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnbindung_IB3_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (b_Wert_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TB_Wert",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9]|1[0-6]"
		   });
		addAnnotation
		  (b_Wert_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCB_Wert",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getB_Wert_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bedien_AnrueckabschnittEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Anrueckabschnitt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Anrueckabschnitt_IDGleisAbschnittPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Gleis_Abschnitt_Position"
		   });
		addAnnotation
		  (getBedien_Anrueckabschnitt_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getBedien_Anrueckabschnitt_IDGleisAbschnittDarstellen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Gleis_Abschnitt_Darstellen"
		   });
		addAnnotation
		  (bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Anrueckabschnitt_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup_BezBedAnrueckabschnitt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bez_Bed_Anrueckabschnitt"
		   });
		addAnnotation
		  (bedien_Anzeige_ElementEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Anzeige_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_BedienAnzeigeElementAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedien_Anzeige_Element_Allg"
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_IDBedienEinrichtungOertlich(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bedien_Einrichtung_Oertlich"
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_IDVerknuepftesElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Verknuepftes_Element"
		   });
		addAnnotation
		  (bedien_Anzeige_Element_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Anzeige_Element_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_Allg_AttributeGroup_Melder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Melder"
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_Allg_AttributeGroup_Schalter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schalter"
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_Allg_AttributeGroup_Taste(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Taste"
		   });
		addAnnotation
		  (bedien_Anzeige_Element_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Anzeige_Element_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Anzeige_Element_Bezeichnung_AttributeGroup_BezBedAnzeigeElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bez_Bed_Anzeige_Element"
		   });
		addAnnotation
		  (bedien_BezirkEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Bezirk",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Bezirk_BedienBezirkAdressformel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedien_Bezirk_Adressformel"
		   });
		addAnnotation
		  (getBedien_Bezirk_BedienBezirkAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedien_Bezirk_Allg"
		   });
		addAnnotation
		  (getBedien_Bezirk_BedienBezirkAnhaenge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedien_Bezirk_Anhaenge"
		   });
		addAnnotation
		  (getBedien_Bezirk_IDBedienZentrale(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bedien_Zentrale"
		   });
		addAnnotation
		  (bedien_Bezirk_Adressformel_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Bezirk_Adressformel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_AWert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "A_Wert"
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_BWert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "B_Wert"
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_CWert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "C_Wert"
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_DDWert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DD_Wert"
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_XWert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "X_Wert"
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_YWert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Y_Wert"
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_YYWert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "YY_Wert"
		   });
		addAnnotation
		  (bedien_Bezirk_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Bezirk_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Anbindung_IB2"
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Anbindung_IB3"
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_Hersteller(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hersteller"
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_Schrankreihe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schrankreihe"
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Steuerbezirksname"
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Steuerbezirksnummer"
		   });
		addAnnotation
		  (bedien_Bezirk_Anhaenge_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Bezirk_Anhaenge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_Anbindung_IB2"
		   });
		addAnnotation
		  (getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_Anbindung_IB3"
		   });
		addAnnotation
		  (getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangSteuerbezUebersicht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_Steuerbez_Uebersicht"
		   });
		addAnnotation
		  (bedien_Einricht_Bauart_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBedien_Einricht_Bauart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Einricht_Bauart_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bedien_Einricht_Oertl_Bez_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBedien_Einricht_Oertl_Bez",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (bedien_Einricht_Oertl_Bez_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBedien_Einricht_Oertl_Bez",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Einricht_Oertl_Bez_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bedien_Einricht_Oertlich_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Einricht_Oertlich_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Einricht_Oertlich_Allg_AttributeGroup_BedienEinrichtBauart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedien_Einricht_Bauart"
		   });
		addAnnotation
		  (getBedien_Einricht_Oertlich_Allg_AttributeGroup_HupeAnschaltzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hupe_Anschaltzeit"
		   });
		addAnnotation
		  (bedien_Einrichtung_OertlichEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Einrichtung_Oertlich",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Einrichtung_Oertlich_BedienEinrichtOertlichAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedien_Einricht_Oertlich_Allg"
		   });
		addAnnotation
		  (getBedien_Einrichtung_Oertlich_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getBedien_Einrichtung_Oertlich_IDAnhangBenutzeroberflaeche(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_Benutzeroberflaeche"
		   });
		addAnnotation
		  (getBedien_Einrichtung_Oertlich_IDAussenelementansteuerung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Aussenelementansteuerung"
		   });
		addAnnotation
		  (getBedien_Einrichtung_Oertlich_IDUnterbringung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Unterbringung"
		   });
		addAnnotation
		  (bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Einrichtung_Oertlich_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup_BedienEinrichtOertlBez(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedien_Einricht_Oertl_Bez"
		   });
		addAnnotation
		  (bedien_GBTEClass,
		   source,
		   new String[] {
			   "name", "CBedien_GBT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_GBT_BedienGBTAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedien_GBT_Allg"
		   });
		addAnnotation
		  (getBedien_GBT_IDAnhangVorgabeGBT(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_Vorgabe_GBT"
		   });
		addAnnotation
		  (getBedien_GBT_IDBedienBezirk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bedien_Bezirk"
		   });
		addAnnotation
		  (bedien_GBT_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_GBT_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_GBT_Allg_AttributeGroup_Rueckschauzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Rueckschauzeit"
		   });
		addAnnotation
		  (getBedien_GBT_Allg_AttributeGroup_Vorschauzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Vorschauzeit"
		   });
		addAnnotation
		  (bedien_OberflaecheEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Oberflaeche",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Oberflaeche_BedienOberflaecheAnhaenge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedien_Oberflaeche_Anhaenge"
		   });
		addAnnotation
		  (getBedien_Oberflaeche_IDBedienBezirk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bedien_Bezirk"
		   });
		addAnnotation
		  (bedien_Oberflaeche_Anhaenge_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Oberflaeche_Anhaenge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangMonitoraufteilung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_Monitoraufteilung"
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangRichtungssinn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_Richtungssinn"
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangVorgabeBELU(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_Vorgabe_BELU"
		   });
		addAnnotation
		  (bedien_Oberflaeche_BildEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Oberflaeche_Bild",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Bild_BedienOberflaecheBildAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedien_Oberflaeche_Bild_Allg"
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Bild_IDBedienOberflaeche(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bedien_Oberflaeche"
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Bild_IDOertlichkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Oertlichkeit"
		   });
		addAnnotation
		  (bedien_Oberflaeche_Bild_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Oberflaeche_Bild_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheBildart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Oberflaeche_Bildart"
		   });
		addAnnotation
		  (getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheZustaendigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Oberflaeche_Zustaendigkeit"
		   });
		addAnnotation
		  (bedien_OertlichkeitEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Oertlichkeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Oertlichkeit_BedienOertlichkeitKennzahlen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedien_Oertlichkeit_Kennzahlen"
		   });
		addAnnotation
		  (getBedien_Oertlichkeit_IDBedienBezirk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bedien_Bezirk"
		   });
		addAnnotation
		  (getBedien_Oertlichkeit_IDOertlichkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Oertlichkeit"
		   });
		addAnnotation
		  (bedien_Oertlichkeit_Kennzahlen_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Oertlichkeit_Kennzahlen",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Betriebsstellenbezeichner(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Betriebsstellenbezeichner"
		   });
		addAnnotation
		  (getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Kennzahl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kennzahl"
		   });
		addAnnotation
		  (bedien_PlatzEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Platz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Platz_BedienPlatzAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedien_Platz_Allg"
		   });
		addAnnotation
		  (getBedien_Platz_IDAnhangMoebelplanAufriss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_Moebelplan_Aufriss"
		   });
		addAnnotation
		  (getBedien_Platz_IDAnhangMoebelplanGrundriss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_Moebelplan_Grundriss"
		   });
		addAnnotation
		  (getBedien_Platz_IDUnterbringung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Unterbringung"
		   });
		addAnnotation
		  (getBedien_Platz_IDBedienBezirk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bedien_Bezirk"
		   });
		addAnnotation
		  (getBedien_Platz_IDESTWZentraleinheit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ESTW_Zentraleinheit"
		   });
		addAnnotation
		  (bedien_Platz_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Platz_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Platz_Allg_AttributeGroup_BedienPlatzArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedien_Platz_Art"
		   });
		addAnnotation
		  (getBedien_Platz_Allg_AttributeGroup_Bedienplatzbezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedienplatzbezeichnung"
		   });
		addAnnotation
		  (getBedien_Platz_Allg_AttributeGroup_Bedienplatznummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedienplatznummer"
		   });
		addAnnotation
		  (getBedien_Platz_Allg_AttributeGroup_Bedienraumnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedienraumnummer"
		   });
		addAnnotation
		  (bedien_Platz_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBedien_Platz_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Platz_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bedien_StandortEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Standort",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Standort_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getBedien_Standort_BSOIPAdressblock(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BSO_IP_Adressblock"
		   });
		addAnnotation
		  (getBedien_Standort_IDUnterbringung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Unterbringung"
		   });
		addAnnotation
		  (bedien_Standort_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Standort_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Standort_Bezeichnung_AttributeGroup_BezeichnungBSO(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_BSO"
		   });
		addAnnotation
		  (bedien_ZentraleEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Zentrale",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Zentrale_IDAnhangPlanBedienraum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_Plan_Bedienraum"
		   });
		addAnnotation
		  (getBedien_Zentrale_IDAnhangPlanRechnerraum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_Plan_Rechnerraum"
		   });
		addAnnotation
		  (getBedien_Zentrale_IDStrecke(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Strecke"
		   });
		addAnnotation
		  (getBedien_Zentrale_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getBedien_Zentrale_IDOertlichkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Oertlichkeit"
		   });
		addAnnotation
		  (bedien_Zentrale_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBedien_Zentrale_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedien_Zentrale_Bezeichnung_AttributeGroup_BezBedZentrale(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bez_Bed_Zentrale"
		   });
		addAnnotation
		  (bedienplatzbezeichnung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBedienplatzbezeichnung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (bedienplatzbezeichnung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBedienplatzbezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedienplatzbezeichnung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bedienplatznummer_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBedienplatznummer",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (bedienplatznummer_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBedienplatznummer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedienplatznummer_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bedienraumnummer_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBedienraumnummer",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (bedienraumnummer_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBedienraumnummer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedienraumnummer_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (betriebsstellenbezeichner_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBetriebsstellenbezeichner",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TZeichenkette",
			   "pattern", "[a-zA-Z]{2}"
		   });
		addAnnotation
		  (betriebsstellenbezeichner_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBetriebsstellenbezeichner",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBetriebsstellenbezeichner_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bez_Bed_Anrueckabschnitt_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBez_Bed_Anrueckabschnitt",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TZeichenkette"
		   });
		addAnnotation
		  (bez_Bed_Anrueckabschnitt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBez_Bed_Anrueckabschnitt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBez_Bed_Anrueckabschnitt_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bez_Bed_Anzeige_Element_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBez_Bed_Anzeige_Element",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (bez_Bed_Anzeige_Element_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBez_Bed_Anzeige_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBez_Bed_Anzeige_Element_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bez_Bed_Zentrale_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBez_Bed_Zentrale",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (bez_Bed_Zentrale_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBez_Bed_Zentrale",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBez_Bed_Zentrale_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_BSO_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_BSO",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (bezeichnung_BSO_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_BSO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_BSO_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bsO_IP_AB_Teilsystem_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBSO_IP_AB_Teilsystem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBSO_IP_AB_Teilsystem_AttributeGroup_BSOTeilsystemArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BSO_Teilsystem_Art"
		   });
		addAnnotation
		  (getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockBlau(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Blau"
		   });
		addAnnotation
		  (getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockGrau(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Grau"
		   });
		addAnnotation
		  (bsO_IP_Adressblock_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBSO_IP_Adressblock",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBSO_IP_Adressblock_AttributeGroup_BSOIPABTeilsystem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BSO_IP_AB_Teilsystem"
		   });
		addAnnotation
		  (getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Blau_V4"
		   });
		addAnnotation
		  (getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Blau_V6"
		   });
		addAnnotation
		  (getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Grau_V4"
		   });
		addAnnotation
		  (getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Grau_V6"
		   });
		addAnnotation
		  (getBSO_IP_Adressblock_AttributeGroup_Regionalbereich(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Regionalbereich"
		   });
		addAnnotation
		  (bsO_Teilsystem_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBSO_Teilsystem_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBSO_Teilsystem_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (c_Wert_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCC_Wert",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getC_Wert_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (dD_Wert_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TDD_Wert",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9]|10"
		   });
		addAnnotation
		  (dD_Wert_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDD_Wert",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDD_Wert_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumaWertEEnum,
		   source,
		   new String[] {
			   "name", "ENUMA_Wert"
		   });
		addAnnotation
		  (enumaWertObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMA_Wert:Object",
			   "baseType", "ENUMA_Wert"
		   });
		addAnnotation
		  (enumBedienEinrichtBauartEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBedien_Einricht_Bauart"
		   });
		addAnnotation
		  (enumBedienEinrichtBauartObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBedien_Einricht_Bauart:Object",
			   "baseType", "ENUMBedien_Einricht_Bauart"
		   });
		addAnnotation
		  (enumBedienPlatzArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBedien_Platz_Art"
		   });
		addAnnotation
		  (enumBedienPlatzArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBedien_Platz_Art:Object",
			   "baseType", "ENUMBedien_Platz_Art"
		   });
		addAnnotation
		  (enumbsoTeilsystemArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBSO_Teilsystem_Art"
		   });
		addAnnotation
		  (enumbsoTeilsystemArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBSO_Teilsystem_Art:Object",
			   "baseType", "ENUMBSO_Teilsystem_Art"
		   });
		addAnnotation
		  (enumcWertEEnum,
		   source,
		   new String[] {
			   "name", "ENUMC_Wert"
		   });
		addAnnotation
		  (enumcWertObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMC_Wert:Object",
			   "baseType", "ENUMC_Wert"
		   });
		addAnnotation
		  (enumMelderEEnum,
		   source,
		   new String[] {
			   "name", "ENUMMelder"
		   });
		addAnnotation
		  (enumMelderObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMMelder:Object",
			   "baseType", "ENUMMelder"
		   });
		addAnnotation
		  (enumOberflaecheBildartEEnum,
		   source,
		   new String[] {
			   "name", "ENUMOberflaeche_Bildart"
		   });
		addAnnotation
		  (enumOberflaecheBildartObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMOberflaeche_Bildart:Object",
			   "baseType", "ENUMOberflaeche_Bildart"
		   });
		addAnnotation
		  (enumSchalterEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSchalter"
		   });
		addAnnotation
		  (enumSchalterObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSchalter:Object",
			   "baseType", "ENUMSchalter"
		   });
		addAnnotation
		  (enumTasteEEnum,
		   source,
		   new String[] {
			   "name", "ENUMTaste"
		   });
		addAnnotation
		  (enumTasteObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMTaste:Object",
			   "baseType", "ENUMTaste"
		   });
		addAnnotation
		  (enumxWertEEnum,
		   source,
		   new String[] {
			   "name", "ENUMX_Wert"
		   });
		addAnnotation
		  (enumxWertObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMX_Wert:Object",
			   "baseType", "ENUMX_Wert"
		   });
		addAnnotation
		  (hersteller_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHersteller",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHersteller_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (hupe_Anschaltzeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "THupe_Anschaltzeit",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde",
			   "pattern", "0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5]"
		   });
		addAnnotation
		  (hupe_Anschaltzeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHupe_Anschaltzeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHupe_Anschaltzeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (iP_Adressblock_Blau_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIP_Adressblock_Blau",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (iP_Adressblock_Blau_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIP_Adressblock_Blau",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIP_Adressblock_Blau_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (iP_Adressblock_Blau_V4_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIP_Adressblock_Blau_V4",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (iP_Adressblock_Blau_V4_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIP_Adressblock_Blau_V4",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIP_Adressblock_Blau_V4_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (iP_Adressblock_Blau_V6_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIP_Adressblock_Blau_V6",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (iP_Adressblock_Blau_V6_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIP_Adressblock_Blau_V6",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIP_Adressblock_Blau_V6_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (iP_Adressblock_Grau_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIP_Adressblock_Grau",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (iP_Adressblock_Grau_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIP_Adressblock_Grau",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIP_Adressblock_Grau_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (iP_Adressblock_Grau_V4_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIP_Adressblock_Grau_V4",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (iP_Adressblock_Grau_V4_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIP_Adressblock_Grau_V4",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIP_Adressblock_Grau_V4_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (iP_Adressblock_Grau_V6_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIP_Adressblock_Grau_V6",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (iP_Adressblock_Grau_V6_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIP_Adressblock_Grau_V6",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIP_Adressblock_Grau_V6_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kennzahl_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKennzahl",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKennzahl_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (melder_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCMelder",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMelder_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (oberflaeche_Bildart_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCOberflaeche_Bildart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOberflaeche_Bildart_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (oberflaeche_Zustaendigkeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TOberflaeche_Zustaendigkeit",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (oberflaeche_Zustaendigkeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCOberflaeche_Zustaendigkeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOberflaeche_Zustaendigkeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (regionalbereich_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRegionalbereich",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRegionalbereich_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (rueckschauzeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TRueckschauzeit",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde"
		   });
		addAnnotation
		  (rueckschauzeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRueckschauzeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRueckschauzeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (schalter_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSchalter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchalter_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (schrankreihe_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TSchrankreihe",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (schrankreihe_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSchrankreihe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchrankreihe_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (steuerbezirksname_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TSteuerbezirksname",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (steuerbezirksname_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSteuerbezirksname",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSteuerbezirksname_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (steuerbezirksnummer_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TSteuerbezirksnummer",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (steuerbezirksnummer_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSteuerbezirksnummer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSteuerbezirksnummer_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (taste_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTaste",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTaste_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (vorschauzeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TVorschauzeit",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde"
		   });
		addAnnotation
		  (vorschauzeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCVorschauzeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVorschauzeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (x_Wert_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCX_Wert",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getX_Wert_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (y_Wert_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TY_Wert",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9]|1[0-5]"
		   });
		addAnnotation
		  (y_Wert_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCY_Wert",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getY_Wert_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (yY_Wert_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TYY_Wert",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9]|1[0-5]"
		   });
		addAnnotation
		  (yY_Wert_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCYY_Wert",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getYY_Wert_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (bedien_AnrueckabschnittEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (bedien_Anzeige_ElementEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (bedien_BezirkEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_BWert(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:Patternbeschreibung>[1..16] </ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_DDWert(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:Patternbeschreibung>[1..10] </ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_YWert(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:Patternbeschreibung>[1..15] </ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBedien_Bezirk_Adressformel_AttributeGroup_YYWert(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:Patternbeschreibung>[1..15] </ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB2(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>false</ppi:ProposedValue>\r\n                     <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB3(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>false</ppi:ProposedValue>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBedien_Bezirk_Allg_AttributeGroup_Hersteller(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:PlanningStage>PT2</ppi:PlanningStage>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBedien_Einricht_Oertlich_Allg_AttributeGroup_HupeAnschaltzeit(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:Patternbeschreibung>[0..65535]</ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (bedien_Einrichtung_OertlichEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (bedien_GBTEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (bedien_OberflaecheEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (bedien_Oberflaeche_BildEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (bedien_OertlichkeitEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Betriebsstellenbezeichner(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:Patternbeschreibung> [2] Die Bezeichner f\u00fcr die Ausfahrziele (Betriebsstellenbezeichner) bestehen in der Regel aus den ersten beiden Buchstaben des Namens der n\u00e4chsten Betriebsstelle. Sie sind so zu w\u00e4hlen, dass sie im Steuerbezirk einer BZ eindeutig sind. Dazu kann es notwendig sein, dass f\u00fcr den 2. Buchstaben ein anderer gew\u00e4hlt werden muss. Diese Vorgabe ist im PT 1 BZ niedergelegt und somit Planungsdatum des LST-Datenmodells. Auf der Bedienoberfl\u00e4che werden duch den Hersteller entsprechend des g\u00fcltigen Regelwerks folgende Erg\u00e4nzungen vorgenommen: Eine Ziffer ist nur bei parallel gef\u00fchrten Gleisen/Strecken zwischen benachbarten Betriebsstellen (Bf, Abzw, Awanst) zu vergeben. Bei parallel gef\u00fchrten Strecken mit 3 Gleisen sind nur dann alle Gleise mittels Ziffern zu nummerieren, wenn die signaltechnische Ausr\u00fcstung aller Gleise gleich ist und alle Gleise gleichberechtigt betrieblich genutzt werden k\u00f6nnen. Bei parallel gef\u00fchrten Strecken mit mehr als 3 Gleisen sind alle Gleise mittels Ziffern zu bezeichnen. Bei 2 x zweigleisiger Streckenf\u00fchrung kann zus\u00e4tzlich zur Nummerierung eine Gegengleiskennung mit \u201eG\u201c sinnvoll sein. Bei 2 x zweigleisiger Streckenf\u00fchrung mit spezifischerNutzung, wie z.B. durch Fernbahn bzw. S-Bahn, kann es sinnvoll sein, die Ausfahrzielbezeichnungen f\u00fcr eine oder beide Strecken an Stelle der fortlaufenden Ziffer mit einem Buchstaben, wie z.B. \u201eF\u201c bzw. \u201eS\u201c, zu bezeichnen. Diese Erg\u00e4nzungen sind nicht Bestandteile des LST-Datenmodells. \\r\\n</ppi:Patternbeschreibung>\r\n                     <ppi:Patternbeschreibung_Abweichend>[2] zwei Gro\u00df oder Kleinbuchstaben ohne Umlaute</ppi:Patternbeschreibung_Abweichend>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (bedien_PlatzEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (bedien_StandortEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (bedien_ZentraleEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
	}

} //BedienungPackageImpl
