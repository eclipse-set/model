/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl;

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

import org.eclipse.set.model.planpro.ATO.ATOPackage;

import org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl;

import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;

import org.eclipse.set.model.planpro.Ansteuerung_Element.impl.Ansteuerung_ElementPackageImpl;

import org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage;

import org.eclipse.set.model.planpro.Bahnsteig.impl.BahnsteigPackageImpl;

import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.planpro.Bahnuebergang.impl.BahnuebergangPackageImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Balisentechnik_ETCSPackageImpl;

import org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts;

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

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Auffahrortung_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Austausch_Antriebe_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Auswurfrichtung_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Besonderes_Fahrwegelement_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.ENUMBesonderesFahrwegelement;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.ENUMElektrischerAntriebLage;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.ENUMElementLage;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.ENUMGleisAbschlussArt;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.ENUMGleissperreBetriebsart;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.ENUMGleissperreVorzugslage;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.ENUMGleissperrensignal;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.ENUMWKrArt;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.ENUMWKrGspStellart;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.ENUMWeicheBetriebsart;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.ENUMWeichensignal;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Elektrischer_Antrieb_Anzahl_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Elektrischer_Antrieb_Lage_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Element_Lage_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.GZ_Freimeldung_L_AttributeGroup;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Geschwindigkeit_L_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Geschwindigkeit_R_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleis_Abschluss;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleis_Abschluss_Art_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleissperre_Betriebsart_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleissperre_Vorzugslage_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleissperrensignal_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Herzstueck_Antriebe_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Isolierfall_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Kr_KrW_Seitenzuordnung_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Kreuzung_AttributeGroup;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Kreuzungsgleis_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Schutzschiene_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Stammgleis_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Vorzugslage_Automatik_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Anlage;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Art_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Grundform_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Gsp_Element;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Gsp_Stellart_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weiche_Betriebsart_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weiche_Vorzugslage_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenFactory;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichenlaufkette;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichensignal_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Zungenpruefkontakt_Anzahl_TypeClass;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.util.Weichen_und_GleissperrenValidator;

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
public class Weichen_und_GleissperrenPackageImpl extends EPackageImpl implements Weichen_und_GleissperrenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auffahrortung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass austausch_Antriebe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auswurfrichtung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass besonderes_Fahrwegelement_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elektrischer_Antrieb_Anzahl_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elektrischer_Antrieb_Lage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass element_Lage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entgleisungsschuh_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geschwindigkeit_L_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geschwindigkeit_R_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleis_AbschlussEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleis_Abschluss_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleissperre_Betriebsart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleissperre_Element_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleissperre_Vorzugslage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleissperrensignal_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gZ_Freimeldung_L_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gZ_Freimeldung_R_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass herzstueck_Antriebe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isolierfall_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kr_KrW_Seitenzuordnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kreuzung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kreuzungsgleis_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schutzschiene_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stammgleis_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vorzugslage_Automatik_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass w_Kr_AnlageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass w_Kr_Anlage_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass w_Kr_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass w_Kr_Grundform_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass w_Kr_Gsp_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass w_Kr_Gsp_Element_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass w_Kr_Gsp_KomponenteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass w_Kr_Gsp_Stellart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weiche_Betriebsart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weiche_Element_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weiche_Vorzugslage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weichenlaufketteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weichenlaufkette_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weichensignal_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zungenpaar_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zungenpruefkontakt_Anzahl_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBesonderesFahrwegelementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumElektrischerAntriebLageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumElementLageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumGleisAbschlussArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumGleissperreBetriebsartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumGleissperrensignalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumGleissperreVorzugslageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumWeicheBetriebsartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumWeichensignalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumwKrArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumwKrGspStellartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cAuswurfrichtungEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType elektrischer_Antrieb_Anzahl_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBesonderesFahrwegelementObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumElektrischerAntriebLageObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumElementLageObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumGleisAbschlussArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumGleissperreBetriebsartObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumGleissperrensignalObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumGleissperreVorzugslageObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumWeicheBetriebsartObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumWeichensignalObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumwKrArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumwKrGspStellartObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geschwindigkeit_L_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geschwindigkeit_R_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType herzstueck_Antriebe_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType isolierfall_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kr_KrW_Seitenzuordnung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kreuzungsgleis_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stammgleis_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType w_Kr_Grundform_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType weiche_Vorzugslage_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zungenpruefkontakt_Anzahl_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Weichen_und_GleissperrenPackageImpl() {
		super(eNS_URI, Weichen_und_GleissperrenFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Weichen_und_GleissperrenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Weichen_und_GleissperrenPackage init() {
		if (isInited) return (Weichen_und_GleissperrenPackage)EPackage.Registry.INSTANCE.getEPackage(Weichen_und_GleissperrenPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWeichen_und_GleissperrenPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Weichen_und_GleissperrenPackageImpl theWeichen_und_GleissperrenPackage = registeredWeichen_und_GleissperrenPackage instanceof Weichen_und_GleissperrenPackageImpl ? (Weichen_und_GleissperrenPackageImpl)registeredWeichen_und_GleissperrenPackage : new Weichen_und_GleissperrenPackageImpl();

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
		thePlanProPackage.loadPackage();
		theBalisentechnik_ETCSPackage.loadPackage();
		theBahnuebergangPackage.loadPackage();
		theSignalbegriffe_Ril_301Package.loadPackage();

		// Create package meta-data objects
		theWeichen_und_GleissperrenPackage.createPackageContents();
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
		theWeichen_und_GleissperrenPackage.initializePackageContents();
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
		thePlanProPackage.fixPackageContents();
		theBalisentechnik_ETCSPackage.fixPackageContents();
		theBahnuebergangPackage.fixPackageContents();
		theSignalbegriffe_Ril_301Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWeichen_und_GleissperrenPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return Weichen_und_GleissperrenValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWeichen_und_GleissperrenPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Weichen_und_GleissperrenPackage.eNS_URI, theWeichen_und_GleissperrenPackage);
		return theWeichen_und_GleissperrenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuffahrortung_TypeClass() {
		return auffahrortung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuffahrortung_TypeClass_Wert() {
		return (EAttribute)auffahrortung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAustausch_Antriebe_TypeClass() {
		return austausch_Antriebe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAustausch_Antriebe_TypeClass_Wert() {
		return (EAttribute)austausch_Antriebe_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuswurfrichtung_TypeClass() {
		return auswurfrichtung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuswurfrichtung_TypeClass_Wert() {
		return (EAttribute)auswurfrichtung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBesonderes_Fahrwegelement_TypeClass() {
		return besonderes_Fahrwegelement_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBesonderes_Fahrwegelement_TypeClass_Wert() {
		return (EAttribute)besonderes_Fahrwegelement_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElektrischer_Antrieb_Anzahl_TypeClass() {
		return elektrischer_Antrieb_Anzahl_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElektrischer_Antrieb_Anzahl_TypeClass_Wert() {
		return (EAttribute)elektrischer_Antrieb_Anzahl_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElektrischer_Antrieb_Lage_TypeClass() {
		return elektrischer_Antrieb_Lage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElektrischer_Antrieb_Lage_TypeClass_Wert() {
		return (EAttribute)elektrischer_Antrieb_Lage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement_Lage_TypeClass() {
		return element_Lage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Lage_TypeClass_Wert() {
		return (EAttribute)element_Lage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntgleisungsschuh_AttributeGroup() {
		return entgleisungsschuh_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntgleisungsschuh_AttributeGroup_Auswurfrichtung() {
		return (EReference)entgleisungsschuh_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntgleisungsschuh_AttributeGroup_Gleissperrensignal() {
		return (EReference)entgleisungsschuh_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntgleisungsschuh_AttributeGroup_Schutzschiene() {
		return (EReference)entgleisungsschuh_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeschwindigkeit_L_TypeClass() {
		return geschwindigkeit_L_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeschwindigkeit_L_TypeClass_Wert() {
		return (EAttribute)geschwindigkeit_L_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeschwindigkeit_R_TypeClass() {
		return geschwindigkeit_R_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeschwindigkeit_R_TypeClass_Wert() {
		return (EAttribute)geschwindigkeit_R_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleis_Abschluss() {
		return gleis_AbschlussEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGleis_Abschluss_GleisAbschlussArt() {
		return (EReference)gleis_AbschlussEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleis_Abschluss_Art_TypeClass() {
		return gleis_Abschluss_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGleis_Abschluss_Art_TypeClass_Wert() {
		return (EAttribute)gleis_Abschluss_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleissperre_Betriebsart_TypeClass() {
		return gleissperre_Betriebsart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGleissperre_Betriebsart_TypeClass_Wert() {
		return (EAttribute)gleissperre_Betriebsart_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleissperre_Element_AttributeGroup() {
		return gleissperre_Element_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGleissperre_Element_AttributeGroup_GleissperreBetriebsart() {
		return (EReference)gleissperre_Element_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGleissperre_Element_AttributeGroup_GleissperreVorzugslage() {
		return (EReference)gleissperre_Element_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleissperre_Vorzugslage_TypeClass() {
		return gleissperre_Vorzugslage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGleissperre_Vorzugslage_TypeClass_Wert() {
		return (EAttribute)gleissperre_Vorzugslage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleissperrensignal_TypeClass() {
		return gleissperrensignal_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGleissperrensignal_TypeClass_Wert() {
		return (EAttribute)gleissperrensignal_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGZ_Freimeldung_L_AttributeGroup() {
		return gZ_Freimeldung_L_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGZ_Freimeldung_L_AttributeGroup_ElementLage() {
		return (EReference)gZ_Freimeldung_L_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGZ_Freimeldung_L_AttributeGroup_IDElement() {
		return (EReference)gZ_Freimeldung_L_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGZ_Freimeldung_R_AttributeGroup() {
		return gZ_Freimeldung_R_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGZ_Freimeldung_R_AttributeGroup_ElementLage() {
		return (EReference)gZ_Freimeldung_R_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGZ_Freimeldung_R_AttributeGroup_IDElement() {
		return (EReference)gZ_Freimeldung_R_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHerzstueck_Antriebe_TypeClass() {
		return herzstueck_Antriebe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHerzstueck_Antriebe_TypeClass_Wert() {
		return (EAttribute)herzstueck_Antriebe_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsolierfall_TypeClass() {
		return isolierfall_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsolierfall_TypeClass_Wert() {
		return (EAttribute)isolierfall_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKr_KrW_Seitenzuordnung_TypeClass() {
		return kr_KrW_Seitenzuordnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKr_KrW_Seitenzuordnung_TypeClass_Wert() {
		return (EAttribute)kr_KrW_Seitenzuordnung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKreuzung_AttributeGroup() {
		return kreuzung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKreuzung_AttributeGroup_ElektrischerAntriebAnzahl() {
		return (EReference)kreuzung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKreuzung_AttributeGroup_ElektrischerAntriebLage() {
		return (EReference)kreuzung_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKreuzung_AttributeGroup_GeschwindigkeitL() {
		return (EReference)kreuzung_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKreuzung_AttributeGroup_GeschwindigkeitR() {
		return (EReference)kreuzung_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKreuzungsgleis_TypeClass() {
		return kreuzungsgleis_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKreuzungsgleis_TypeClass_Wert() {
		return (EAttribute)kreuzungsgleis_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchutzschiene_TypeClass() {
		return schutzschiene_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchutzschiene_TypeClass_Wert() {
		return (EAttribute)schutzschiene_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStammgleis_TypeClass() {
		return stammgleis_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStammgleis_TypeClass_Wert() {
		return (EAttribute)stammgleis_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVorzugslage_Automatik_TypeClass() {
		return vorzugslage_Automatik_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVorzugslage_Automatik_TypeClass_Wert() {
		return (EAttribute)vorzugslage_Automatik_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW_Kr_Anlage() {
		return w_Kr_AnlageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Anlage_IDAnhangDWS() {
		return (EReference)w_Kr_AnlageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Anlage_IDSignal() {
		return (EReference)w_Kr_AnlageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Anlage_WKrAnlageAllg() {
		return (EReference)w_Kr_AnlageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW_Kr_Anlage_Allg_AttributeGroup() {
		return w_Kr_Anlage_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Anlage_Allg_AttributeGroup_Isolierfall() {
		return (EReference)w_Kr_Anlage_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Anlage_Allg_AttributeGroup_WKrArt() {
		return (EReference)w_Kr_Anlage_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Anlage_Allg_AttributeGroup_WKrGrundform() {
		return (EReference)w_Kr_Anlage_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW_Kr_Art_TypeClass() {
		return w_Kr_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getW_Kr_Art_TypeClass_Wert() {
		return (EAttribute)w_Kr_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW_Kr_Grundform_TypeClass() {
		return w_Kr_Grundform_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getW_Kr_Grundform_TypeClass_Wert() {
		return (EAttribute)w_Kr_Grundform_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW_Kr_Gsp_Element() {
		return w_Kr_Gsp_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Element_Bezeichnung() {
		return (EReference)w_Kr_Gsp_ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Element_IDRegelzeichnung() {
		return (EReference)w_Kr_Gsp_ElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Element_IDStellelement() {
		return (EReference)w_Kr_Gsp_ElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Element_IDWKrAnlage() {
		return (EReference)w_Kr_Gsp_ElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Element_IDWeichenlaufkette() {
		return (EReference)w_Kr_Gsp_ElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Element_WKrGspElementAllg() {
		return (EReference)w_Kr_Gsp_ElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Element_GleissperreElement() {
		return (EReference)w_Kr_Gsp_ElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Element_WeicheElement() {
		return (EReference)w_Kr_Gsp_ElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW_Kr_Gsp_Element_Allg_AttributeGroup() {
		return w_Kr_Gsp_Element_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Element_Allg_AttributeGroup_KrKrWSeitenzuordnung() {
		return (EReference)w_Kr_Gsp_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Element_Allg_AttributeGroup_VorzugslageAutomatik() {
		return (EReference)w_Kr_Gsp_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Element_Allg_AttributeGroup_WKrGspStellart() {
		return (EReference)w_Kr_Gsp_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW_Kr_Gsp_Komponente() {
		return w_Kr_Gsp_KomponenteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Komponente_AustauschAntriebe() {
		return (EReference)w_Kr_Gsp_KomponenteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Komponente_IDRegelzeichnung() {
		return (EReference)w_Kr_Gsp_KomponenteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Komponente_IDWKrGspElement() {
		return (EReference)w_Kr_Gsp_KomponenteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Komponente_BesonderesFahrwegelement() {
		return (EReference)w_Kr_Gsp_KomponenteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Komponente_Entgleisungsschuh() {
		return (EReference)w_Kr_Gsp_KomponenteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Komponente_Kreuzung() {
		return (EReference)w_Kr_Gsp_KomponenteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getW_Kr_Gsp_Komponente_Zungenpaar() {
		return (EReference)w_Kr_Gsp_KomponenteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW_Kr_Gsp_Stellart_TypeClass() {
		return w_Kr_Gsp_Stellart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getW_Kr_Gsp_Stellart_TypeClass_Wert() {
		return (EAttribute)w_Kr_Gsp_Stellart_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeiche_Betriebsart_TypeClass() {
		return weiche_Betriebsart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeiche_Betriebsart_TypeClass_Wert() {
		return (EAttribute)weiche_Betriebsart_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeiche_Element_AttributeGroup() {
		return weiche_Element_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeiche_Element_AttributeGroup_Auffahrortung() {
		return (EReference)weiche_Element_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeiche_Element_AttributeGroup_GZFreimeldungL() {
		return (EReference)weiche_Element_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeiche_Element_AttributeGroup_GZFreimeldungR() {
		return (EReference)weiche_Element_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeiche_Element_AttributeGroup_IDGrenzzeichen() {
		return (EReference)weiche_Element_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeiche_Element_AttributeGroup_IDSignal() {
		return (EReference)weiche_Element_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeiche_Element_AttributeGroup_WeicheBetriebsart() {
		return (EReference)weiche_Element_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeiche_Element_AttributeGroup_WeicheVorzugslage() {
		return (EReference)weiche_Element_AttributeGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeiche_Vorzugslage_TypeClass() {
		return weiche_Vorzugslage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeiche_Vorzugslage_TypeClass_Wert() {
		return (EAttribute)weiche_Vorzugslage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeichenlaufkette() {
		return weichenlaufketteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeichenlaufkette_Bezeichnung() {
		return (EReference)weichenlaufketteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeichenlaufkette_Zuordnung() {
		return weichenlaufkette_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeichenlaufkette_Zuordnung_IDSignal() {
		return (EReference)weichenlaufkette_ZuordnungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeichenlaufkette_Zuordnung_IDWeichenlaufkette() {
		return (EReference)weichenlaufkette_ZuordnungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeichensignal_TypeClass() {
		return weichensignal_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeichensignal_TypeClass_Wert() {
		return (EAttribute)weichensignal_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZungenpaar_AttributeGroup() {
		return zungenpaar_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZungenpaar_AttributeGroup_ElektrischerAntriebAnzahl() {
		return (EReference)zungenpaar_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZungenpaar_AttributeGroup_ElektrischerAntriebLage() {
		return (EReference)zungenpaar_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZungenpaar_AttributeGroup_GeschwindigkeitL() {
		return (EReference)zungenpaar_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZungenpaar_AttributeGroup_GeschwindigkeitR() {
		return (EReference)zungenpaar_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZungenpaar_AttributeGroup_HerzstueckAntriebe() {
		return (EReference)zungenpaar_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZungenpaar_AttributeGroup_Kreuzungsgleis() {
		return (EReference)zungenpaar_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZungenpaar_AttributeGroup_Stammgleis() {
		return (EReference)zungenpaar_AttributeGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZungenpaar_AttributeGroup_Weichensignal() {
		return (EReference)zungenpaar_AttributeGroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZungenpaar_AttributeGroup_ZungenpruefkontaktAnzahl() {
		return (EReference)zungenpaar_AttributeGroupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZungenpruefkontakt_Anzahl_TypeClass() {
		return zungenpruefkontakt_Anzahl_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZungenpruefkontakt_Anzahl_TypeClass_Wert() {
		return (EAttribute)zungenpruefkontakt_Anzahl_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBesonderesFahrwegelement() {
		return enumBesonderesFahrwegelementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMElektrischerAntriebLage() {
		return enumElektrischerAntriebLageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMElementLage() {
		return enumElementLageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGleisAbschlussArt() {
		return enumGleisAbschlussArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGleissperreBetriebsart() {
		return enumGleissperreBetriebsartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGleissperrensignal() {
		return enumGleissperrensignalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGleissperreVorzugslage() {
		return enumGleissperreVorzugslageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMWeicheBetriebsart() {
		return enumWeicheBetriebsartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMWeichensignal() {
		return enumWeichensignalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMWKrArt() {
		return enumwKrArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMWKrGspStellart() {
		return enumwKrGspStellartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCAuswurfrichtung() {
		return cAuswurfrichtungEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getElektrischer_Antrieb_Anzahl_Type() {
		return elektrischer_Antrieb_Anzahl_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBesonderesFahrwegelementObject() {
		return enumBesonderesFahrwegelementObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMElektrischerAntriebLageObject() {
		return enumElektrischerAntriebLageObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMElementLageObject() {
		return enumElementLageObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGleisAbschlussArtObject() {
		return enumGleisAbschlussArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGleissperreBetriebsartObject() {
		return enumGleissperreBetriebsartObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGleissperrensignalObject() {
		return enumGleissperrensignalObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGleissperreVorzugslageObject() {
		return enumGleissperreVorzugslageObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMWeicheBetriebsartObject() {
		return enumWeicheBetriebsartObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMWeichensignalObject() {
		return enumWeichensignalObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMWKrArtObject() {
		return enumwKrArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMWKrGspStellartObject() {
		return enumwKrGspStellartObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGeschwindigkeit_L_Type() {
		return geschwindigkeit_L_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGeschwindigkeit_R_Type() {
		return geschwindigkeit_R_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHerzstueck_Antriebe_Type() {
		return herzstueck_Antriebe_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIsolierfall_Type() {
		return isolierfall_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKr_KrW_Seitenzuordnung_Type() {
		return kr_KrW_Seitenzuordnung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKreuzungsgleis_Type() {
		return kreuzungsgleis_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStammgleis_Type() {
		return stammgleis_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getW_Kr_Grundform_Type() {
		return w_Kr_Grundform_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getWeiche_Vorzugslage_Type() {
		return weiche_Vorzugslage_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZungenpruefkontakt_Anzahl_Type() {
		return zungenpruefkontakt_Anzahl_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weichen_und_GleissperrenFactory getWeichen_und_GleissperrenFactory() {
		return (Weichen_und_GleissperrenFactory)getEFactoryInstance();
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
		auffahrortung_TypeClassEClass = createEClass(AUFFAHRORTUNG_TYPE_CLASS);
		createEAttribute(auffahrortung_TypeClassEClass, AUFFAHRORTUNG_TYPE_CLASS__WERT);

		austausch_Antriebe_TypeClassEClass = createEClass(AUSTAUSCH_ANTRIEBE_TYPE_CLASS);
		createEAttribute(austausch_Antriebe_TypeClassEClass, AUSTAUSCH_ANTRIEBE_TYPE_CLASS__WERT);

		auswurfrichtung_TypeClassEClass = createEClass(AUSWURFRICHTUNG_TYPE_CLASS);
		createEAttribute(auswurfrichtung_TypeClassEClass, AUSWURFRICHTUNG_TYPE_CLASS__WERT);

		besonderes_Fahrwegelement_TypeClassEClass = createEClass(BESONDERES_FAHRWEGELEMENT_TYPE_CLASS);
		createEAttribute(besonderes_Fahrwegelement_TypeClassEClass, BESONDERES_FAHRWEGELEMENT_TYPE_CLASS__WERT);

		elektrischer_Antrieb_Anzahl_TypeClassEClass = createEClass(ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE_CLASS);
		createEAttribute(elektrischer_Antrieb_Anzahl_TypeClassEClass, ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE_CLASS__WERT);

		elektrischer_Antrieb_Lage_TypeClassEClass = createEClass(ELEKTRISCHER_ANTRIEB_LAGE_TYPE_CLASS);
		createEAttribute(elektrischer_Antrieb_Lage_TypeClassEClass, ELEKTRISCHER_ANTRIEB_LAGE_TYPE_CLASS__WERT);

		element_Lage_TypeClassEClass = createEClass(ELEMENT_LAGE_TYPE_CLASS);
		createEAttribute(element_Lage_TypeClassEClass, ELEMENT_LAGE_TYPE_CLASS__WERT);

		entgleisungsschuh_AttributeGroupEClass = createEClass(ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP);
		createEReference(entgleisungsschuh_AttributeGroupEClass, ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__AUSWURFRICHTUNG);
		createEReference(entgleisungsschuh_AttributeGroupEClass, ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__GLEISSPERRENSIGNAL);
		createEReference(entgleisungsschuh_AttributeGroupEClass, ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__SCHUTZSCHIENE);

		geschwindigkeit_L_TypeClassEClass = createEClass(GESCHWINDIGKEIT_LTYPE_CLASS);
		createEAttribute(geschwindigkeit_L_TypeClassEClass, GESCHWINDIGKEIT_LTYPE_CLASS__WERT);

		geschwindigkeit_R_TypeClassEClass = createEClass(GESCHWINDIGKEIT_RTYPE_CLASS);
		createEAttribute(geschwindigkeit_R_TypeClassEClass, GESCHWINDIGKEIT_RTYPE_CLASS__WERT);

		gleis_AbschlussEClass = createEClass(GLEIS_ABSCHLUSS);
		createEReference(gleis_AbschlussEClass, GLEIS_ABSCHLUSS__GLEIS_ABSCHLUSS_ART);

		gleis_Abschluss_Art_TypeClassEClass = createEClass(GLEIS_ABSCHLUSS_ART_TYPE_CLASS);
		createEAttribute(gleis_Abschluss_Art_TypeClassEClass, GLEIS_ABSCHLUSS_ART_TYPE_CLASS__WERT);

		gleissperre_Betriebsart_TypeClassEClass = createEClass(GLEISSPERRE_BETRIEBSART_TYPE_CLASS);
		createEAttribute(gleissperre_Betriebsart_TypeClassEClass, GLEISSPERRE_BETRIEBSART_TYPE_CLASS__WERT);

		gleissperre_Element_AttributeGroupEClass = createEClass(GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP);
		createEReference(gleissperre_Element_AttributeGroupEClass, GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_BETRIEBSART);
		createEReference(gleissperre_Element_AttributeGroupEClass, GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_VORZUGSLAGE);

		gleissperre_Vorzugslage_TypeClassEClass = createEClass(GLEISSPERRE_VORZUGSLAGE_TYPE_CLASS);
		createEAttribute(gleissperre_Vorzugslage_TypeClassEClass, GLEISSPERRE_VORZUGSLAGE_TYPE_CLASS__WERT);

		gleissperrensignal_TypeClassEClass = createEClass(GLEISSPERRENSIGNAL_TYPE_CLASS);
		createEAttribute(gleissperrensignal_TypeClassEClass, GLEISSPERRENSIGNAL_TYPE_CLASS__WERT);

		gZ_Freimeldung_L_AttributeGroupEClass = createEClass(GZ_FREIMELDUNG_LATTRIBUTE_GROUP);
		createEReference(gZ_Freimeldung_L_AttributeGroupEClass, GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ELEMENT_LAGE);
		createEReference(gZ_Freimeldung_L_AttributeGroupEClass, GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ID_ELEMENT);

		gZ_Freimeldung_R_AttributeGroupEClass = createEClass(GZ_FREIMELDUNG_RATTRIBUTE_GROUP);
		createEReference(gZ_Freimeldung_R_AttributeGroupEClass, GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ELEMENT_LAGE);
		createEReference(gZ_Freimeldung_R_AttributeGroupEClass, GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ID_ELEMENT);

		herzstueck_Antriebe_TypeClassEClass = createEClass(HERZSTUECK_ANTRIEBE_TYPE_CLASS);
		createEAttribute(herzstueck_Antriebe_TypeClassEClass, HERZSTUECK_ANTRIEBE_TYPE_CLASS__WERT);

		isolierfall_TypeClassEClass = createEClass(ISOLIERFALL_TYPE_CLASS);
		createEAttribute(isolierfall_TypeClassEClass, ISOLIERFALL_TYPE_CLASS__WERT);

		kr_KrW_Seitenzuordnung_TypeClassEClass = createEClass(KR_KR_WSEITENZUORDNUNG_TYPE_CLASS);
		createEAttribute(kr_KrW_Seitenzuordnung_TypeClassEClass, KR_KR_WSEITENZUORDNUNG_TYPE_CLASS__WERT);

		kreuzung_AttributeGroupEClass = createEClass(KREUZUNG_ATTRIBUTE_GROUP);
		createEReference(kreuzung_AttributeGroupEClass, KREUZUNG_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL);
		createEReference(kreuzung_AttributeGroupEClass, KREUZUNG_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE);
		createEReference(kreuzung_AttributeGroupEClass, KREUZUNG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L);
		createEReference(kreuzung_AttributeGroupEClass, KREUZUNG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R);

		kreuzungsgleis_TypeClassEClass = createEClass(KREUZUNGSGLEIS_TYPE_CLASS);
		createEAttribute(kreuzungsgleis_TypeClassEClass, KREUZUNGSGLEIS_TYPE_CLASS__WERT);

		schutzschiene_TypeClassEClass = createEClass(SCHUTZSCHIENE_TYPE_CLASS);
		createEAttribute(schutzschiene_TypeClassEClass, SCHUTZSCHIENE_TYPE_CLASS__WERT);

		stammgleis_TypeClassEClass = createEClass(STAMMGLEIS_TYPE_CLASS);
		createEAttribute(stammgleis_TypeClassEClass, STAMMGLEIS_TYPE_CLASS__WERT);

		vorzugslage_Automatik_TypeClassEClass = createEClass(VORZUGSLAGE_AUTOMATIK_TYPE_CLASS);
		createEAttribute(vorzugslage_Automatik_TypeClassEClass, VORZUGSLAGE_AUTOMATIK_TYPE_CLASS__WERT);

		w_Kr_AnlageEClass = createEClass(WKR_ANLAGE);
		createEReference(w_Kr_AnlageEClass, WKR_ANLAGE__ID_ANHANG_DWS);
		createEReference(w_Kr_AnlageEClass, WKR_ANLAGE__ID_SIGNAL);
		createEReference(w_Kr_AnlageEClass, WKR_ANLAGE__WKR_ANLAGE_ALLG);

		w_Kr_Anlage_Allg_AttributeGroupEClass = createEClass(WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP);
		createEReference(w_Kr_Anlage_Allg_AttributeGroupEClass, WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__ISOLIERFALL);
		createEReference(w_Kr_Anlage_Allg_AttributeGroupEClass, WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_ART);
		createEReference(w_Kr_Anlage_Allg_AttributeGroupEClass, WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_GRUNDFORM);

		w_Kr_Art_TypeClassEClass = createEClass(WKR_ART_TYPE_CLASS);
		createEAttribute(w_Kr_Art_TypeClassEClass, WKR_ART_TYPE_CLASS__WERT);

		w_Kr_Grundform_TypeClassEClass = createEClass(WKR_GRUNDFORM_TYPE_CLASS);
		createEAttribute(w_Kr_Grundform_TypeClassEClass, WKR_GRUNDFORM_TYPE_CLASS__WERT);

		w_Kr_Gsp_ElementEClass = createEClass(WKR_GSP_ELEMENT);
		createEReference(w_Kr_Gsp_ElementEClass, WKR_GSP_ELEMENT__BEZEICHNUNG);
		createEReference(w_Kr_Gsp_ElementEClass, WKR_GSP_ELEMENT__ID_REGELZEICHNUNG);
		createEReference(w_Kr_Gsp_ElementEClass, WKR_GSP_ELEMENT__ID_STELLELEMENT);
		createEReference(w_Kr_Gsp_ElementEClass, WKR_GSP_ELEMENT__IDW_KR_ANLAGE);
		createEReference(w_Kr_Gsp_ElementEClass, WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE);
		createEReference(w_Kr_Gsp_ElementEClass, WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG);
		createEReference(w_Kr_Gsp_ElementEClass, WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT);
		createEReference(w_Kr_Gsp_ElementEClass, WKR_GSP_ELEMENT__WEICHE_ELEMENT);

		w_Kr_Gsp_Element_Allg_AttributeGroupEClass = createEClass(WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP);
		createEReference(w_Kr_Gsp_Element_Allg_AttributeGroupEClass, WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__KR_KR_WSEITENZUORDNUNG);
		createEReference(w_Kr_Gsp_Element_Allg_AttributeGroupEClass, WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORZUGSLAGE_AUTOMATIK);
		createEReference(w_Kr_Gsp_Element_Allg_AttributeGroupEClass, WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__WKR_GSP_STELLART);

		w_Kr_Gsp_KomponenteEClass = createEClass(WKR_GSP_KOMPONENTE);
		createEReference(w_Kr_Gsp_KomponenteEClass, WKR_GSP_KOMPONENTE__AUSTAUSCH_ANTRIEBE);
		createEReference(w_Kr_Gsp_KomponenteEClass, WKR_GSP_KOMPONENTE__ID_REGELZEICHNUNG);
		createEReference(w_Kr_Gsp_KomponenteEClass, WKR_GSP_KOMPONENTE__IDW_KR_GSP_ELEMENT);
		createEReference(w_Kr_Gsp_KomponenteEClass, WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT);
		createEReference(w_Kr_Gsp_KomponenteEClass, WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH);
		createEReference(w_Kr_Gsp_KomponenteEClass, WKR_GSP_KOMPONENTE__KREUZUNG);
		createEReference(w_Kr_Gsp_KomponenteEClass, WKR_GSP_KOMPONENTE__ZUNGENPAAR);

		w_Kr_Gsp_Stellart_TypeClassEClass = createEClass(WKR_GSP_STELLART_TYPE_CLASS);
		createEAttribute(w_Kr_Gsp_Stellart_TypeClassEClass, WKR_GSP_STELLART_TYPE_CLASS__WERT);

		weiche_Betriebsart_TypeClassEClass = createEClass(WEICHE_BETRIEBSART_TYPE_CLASS);
		createEAttribute(weiche_Betriebsart_TypeClassEClass, WEICHE_BETRIEBSART_TYPE_CLASS__WERT);

		weiche_Element_AttributeGroupEClass = createEClass(WEICHE_ELEMENT_ATTRIBUTE_GROUP);
		createEReference(weiche_Element_AttributeGroupEClass, WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG);
		createEReference(weiche_Element_AttributeGroupEClass, WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L);
		createEReference(weiche_Element_AttributeGroupEClass, WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R);
		createEReference(weiche_Element_AttributeGroupEClass, WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_GRENZZEICHEN);
		createEReference(weiche_Element_AttributeGroupEClass, WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_SIGNAL);
		createEReference(weiche_Element_AttributeGroupEClass, WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART);
		createEReference(weiche_Element_AttributeGroupEClass, WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE);

		weiche_Vorzugslage_TypeClassEClass = createEClass(WEICHE_VORZUGSLAGE_TYPE_CLASS);
		createEAttribute(weiche_Vorzugslage_TypeClassEClass, WEICHE_VORZUGSLAGE_TYPE_CLASS__WERT);

		weichenlaufketteEClass = createEClass(WEICHENLAUFKETTE);
		createEReference(weichenlaufketteEClass, WEICHENLAUFKETTE__BEZEICHNUNG);

		weichenlaufkette_ZuordnungEClass = createEClass(WEICHENLAUFKETTE_ZUORDNUNG);
		createEReference(weichenlaufkette_ZuordnungEClass, WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL);
		createEReference(weichenlaufkette_ZuordnungEClass, WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE);

		weichensignal_TypeClassEClass = createEClass(WEICHENSIGNAL_TYPE_CLASS);
		createEAttribute(weichensignal_TypeClassEClass, WEICHENSIGNAL_TYPE_CLASS__WERT);

		zungenpaar_AttributeGroupEClass = createEClass(ZUNGENPAAR_ATTRIBUTE_GROUP);
		createEReference(zungenpaar_AttributeGroupEClass, ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL);
		createEReference(zungenpaar_AttributeGroupEClass, ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE);
		createEReference(zungenpaar_AttributeGroupEClass, ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L);
		createEReference(zungenpaar_AttributeGroupEClass, ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R);
		createEReference(zungenpaar_AttributeGroupEClass, ZUNGENPAAR_ATTRIBUTE_GROUP__HERZSTUECK_ANTRIEBE);
		createEReference(zungenpaar_AttributeGroupEClass, ZUNGENPAAR_ATTRIBUTE_GROUP__KREUZUNGSGLEIS);
		createEReference(zungenpaar_AttributeGroupEClass, ZUNGENPAAR_ATTRIBUTE_GROUP__STAMMGLEIS);
		createEReference(zungenpaar_AttributeGroupEClass, ZUNGENPAAR_ATTRIBUTE_GROUP__WEICHENSIGNAL);
		createEReference(zungenpaar_AttributeGroupEClass, ZUNGENPAAR_ATTRIBUTE_GROUP__ZUNGENPRUEFKONTAKT_ANZAHL);

		zungenpruefkontakt_Anzahl_TypeClassEClass = createEClass(ZUNGENPRUEFKONTAKT_ANZAHL_TYPE_CLASS);
		createEAttribute(zungenpruefkontakt_Anzahl_TypeClassEClass, ZUNGENPRUEFKONTAKT_ANZAHL_TYPE_CLASS__WERT);

		// Create enums
		enumBesonderesFahrwegelementEEnum = createEEnum(ENUM_BESONDERES_FAHRWEGELEMENT);
		enumElektrischerAntriebLageEEnum = createEEnum(ENUM_ELEKTRISCHER_ANTRIEB_LAGE);
		enumElementLageEEnum = createEEnum(ENUM_ELEMENT_LAGE);
		enumGleisAbschlussArtEEnum = createEEnum(ENUM_GLEIS_ABSCHLUSS_ART);
		enumGleissperreBetriebsartEEnum = createEEnum(ENUM_GLEISSPERRE_BETRIEBSART);
		enumGleissperrensignalEEnum = createEEnum(ENUM_GLEISSPERRENSIGNAL);
		enumGleissperreVorzugslageEEnum = createEEnum(ENUM_GLEISSPERRE_VORZUGSLAGE);
		enumWeicheBetriebsartEEnum = createEEnum(ENUM_WEICHE_BETRIEBSART);
		enumWeichensignalEEnum = createEEnum(ENUM_WEICHENSIGNAL);
		enumwKrArtEEnum = createEEnum(ENUMW_KR_ART);
		enumwKrGspStellartEEnum = createEEnum(ENUMW_KR_GSP_STELLART);

		// Create data types
		cAuswurfrichtungEDataType = createEDataType(CAUSWURFRICHTUNG);
		elektrischer_Antrieb_Anzahl_TypeEDataType = createEDataType(ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE);
		enumBesonderesFahrwegelementObjectEDataType = createEDataType(ENUM_BESONDERES_FAHRWEGELEMENT_OBJECT);
		enumElektrischerAntriebLageObjectEDataType = createEDataType(ENUM_ELEKTRISCHER_ANTRIEB_LAGE_OBJECT);
		enumElementLageObjectEDataType = createEDataType(ENUM_ELEMENT_LAGE_OBJECT);
		enumGleisAbschlussArtObjectEDataType = createEDataType(ENUM_GLEIS_ABSCHLUSS_ART_OBJECT);
		enumGleissperreBetriebsartObjectEDataType = createEDataType(ENUM_GLEISSPERRE_BETRIEBSART_OBJECT);
		enumGleissperrensignalObjectEDataType = createEDataType(ENUM_GLEISSPERRENSIGNAL_OBJECT);
		enumGleissperreVorzugslageObjectEDataType = createEDataType(ENUM_GLEISSPERRE_VORZUGSLAGE_OBJECT);
		enumWeicheBetriebsartObjectEDataType = createEDataType(ENUM_WEICHE_BETRIEBSART_OBJECT);
		enumWeichensignalObjectEDataType = createEDataType(ENUM_WEICHENSIGNAL_OBJECT);
		enumwKrArtObjectEDataType = createEDataType(ENUMW_KR_ART_OBJECT);
		enumwKrGspStellartObjectEDataType = createEDataType(ENUMW_KR_GSP_STELLART_OBJECT);
		geschwindigkeit_L_TypeEDataType = createEDataType(GESCHWINDIGKEIT_LTYPE);
		geschwindigkeit_R_TypeEDataType = createEDataType(GESCHWINDIGKEIT_RTYPE);
		herzstueck_Antriebe_TypeEDataType = createEDataType(HERZSTUECK_ANTRIEBE_TYPE);
		isolierfall_TypeEDataType = createEDataType(ISOLIERFALL_TYPE);
		kr_KrW_Seitenzuordnung_TypeEDataType = createEDataType(KR_KR_WSEITENZUORDNUNG_TYPE);
		kreuzungsgleis_TypeEDataType = createEDataType(KREUZUNGSGLEIS_TYPE);
		stammgleis_TypeEDataType = createEDataType(STAMMGLEIS_TYPE);
		w_Kr_Grundform_TypeEDataType = createEDataType(WKR_GRUNDFORM_TYPE);
		weiche_Vorzugslage_TypeEDataType = createEDataType(WEICHE_VORZUGSLAGE_TYPE);
		zungenpruefkontakt_Anzahl_TypeEDataType = createEDataType(ZUNGENPRUEFKONTAKT_ANZAHL_TYPE);
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
		auffahrortung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		austausch_Antriebe_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		auswurfrichtung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		besonderes_Fahrwegelement_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		elektrischer_Antrieb_Anzahl_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		elektrischer_Antrieb_Lage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		element_Lage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geschwindigkeit_L_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geschwindigkeit_R_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		gleis_AbschlussEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		gleis_Abschluss_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		gleissperre_Betriebsart_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		gleissperre_Vorzugslage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		gleissperrensignal_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		herzstueck_Antriebe_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		isolierfall_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		kr_KrW_Seitenzuordnung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		kreuzungsgleis_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		schutzschiene_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		stammgleis_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		vorzugslage_Automatik_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		w_Kr_AnlageEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		w_Kr_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		w_Kr_Grundform_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		w_Kr_Gsp_ElementEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		w_Kr_Gsp_KomponenteEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		w_Kr_Gsp_Stellart_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		weiche_Betriebsart_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		weiche_Vorzugslage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		weichenlaufketteEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		weichenlaufkette_ZuordnungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		weichensignal_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zungenpruefkontakt_Anzahl_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(auffahrortung_TypeClassEClass, Auffahrortung_TypeClass.class, "Auffahrortung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuffahrortung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Auffahrortung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(austausch_Antriebe_TypeClassEClass, Austausch_Antriebe_TypeClass.class, "Austausch_Antriebe_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAustausch_Antriebe_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Austausch_Antriebe_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auswurfrichtung_TypeClassEClass, Auswurfrichtung_TypeClass.class, "Auswurfrichtung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuswurfrichtung_TypeClass_Wert(), this.getCAuswurfrichtung(), "wert", null, 1, 1, Auswurfrichtung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(besonderes_Fahrwegelement_TypeClassEClass, Besonderes_Fahrwegelement_TypeClass.class, "Besonderes_Fahrwegelement_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBesonderes_Fahrwegelement_TypeClass_Wert(), this.getENUMBesonderesFahrwegelementObject(), "wert", null, 1, 1, Besonderes_Fahrwegelement_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elektrischer_Antrieb_Anzahl_TypeClassEClass, Elektrischer_Antrieb_Anzahl_TypeClass.class, "Elektrischer_Antrieb_Anzahl_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElektrischer_Antrieb_Anzahl_TypeClass_Wert(), this.getElektrischer_Antrieb_Anzahl_Type(), "wert", null, 1, 1, Elektrischer_Antrieb_Anzahl_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elektrischer_Antrieb_Lage_TypeClassEClass, Elektrischer_Antrieb_Lage_TypeClass.class, "Elektrischer_Antrieb_Lage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElektrischer_Antrieb_Lage_TypeClass_Wert(), this.getENUMElektrischerAntriebLageObject(), "wert", null, 1, 1, Elektrischer_Antrieb_Lage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(element_Lage_TypeClassEClass, Element_Lage_TypeClass.class, "Element_Lage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Lage_TypeClass_Wert(), this.getENUMElementLageObject(), "wert", null, 1, 1, Element_Lage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entgleisungsschuh_AttributeGroupEClass, Entgleisungsschuh_AttributeGroup.class, "Entgleisungsschuh_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntgleisungsschuh_AttributeGroup_Auswurfrichtung(), this.getAuswurfrichtung_TypeClass(), null, "auswurfrichtung", null, 0, 1, Entgleisungsschuh_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntgleisungsschuh_AttributeGroup_Gleissperrensignal(), this.getGleissperrensignal_TypeClass(), null, "gleissperrensignal", null, 0, 1, Entgleisungsschuh_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntgleisungsschuh_AttributeGroup_Schutzschiene(), this.getSchutzschiene_TypeClass(), null, "schutzschiene", null, 1, 1, Entgleisungsschuh_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geschwindigkeit_L_TypeClassEClass, Geschwindigkeit_L_TypeClass.class, "Geschwindigkeit_L_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeschwindigkeit_L_TypeClass_Wert(), this.getGeschwindigkeit_L_Type(), "wert", null, 1, 1, Geschwindigkeit_L_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geschwindigkeit_R_TypeClassEClass, Geschwindigkeit_R_TypeClass.class, "Geschwindigkeit_R_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeschwindigkeit_R_TypeClass_Wert(), this.getGeschwindigkeit_R_Type(), "wert", null, 1, 1, Geschwindigkeit_R_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleis_AbschlussEClass, Gleis_Abschluss.class, "Gleis_Abschluss", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGleis_Abschluss_GleisAbschlussArt(), this.getGleis_Abschluss_Art_TypeClass(), null, "gleisAbschlussArt", null, 1, 1, Gleis_Abschluss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleis_Abschluss_Art_TypeClassEClass, Gleis_Abschluss_Art_TypeClass.class, "Gleis_Abschluss_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGleis_Abschluss_Art_TypeClass_Wert(), this.getENUMGleisAbschlussArtObject(), "wert", null, 1, 1, Gleis_Abschluss_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleissperre_Betriebsart_TypeClassEClass, Gleissperre_Betriebsart_TypeClass.class, "Gleissperre_Betriebsart_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGleissperre_Betriebsart_TypeClass_Wert(), this.getENUMGleissperreBetriebsartObject(), "wert", null, 1, 1, Gleissperre_Betriebsart_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleissperre_Element_AttributeGroupEClass, Gleissperre_Element_AttributeGroup.class, "Gleissperre_Element_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGleissperre_Element_AttributeGroup_GleissperreBetriebsart(), this.getGleissperre_Betriebsart_TypeClass(), null, "gleissperreBetriebsart", null, 0, 1, Gleissperre_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGleissperre_Element_AttributeGroup_GleissperreVorzugslage(), this.getGleissperre_Vorzugslage_TypeClass(), null, "gleissperreVorzugslage", null, 0, 1, Gleissperre_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleissperre_Vorzugslage_TypeClassEClass, Gleissperre_Vorzugslage_TypeClass.class, "Gleissperre_Vorzugslage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGleissperre_Vorzugslage_TypeClass_Wert(), this.getENUMGleissperreVorzugslageObject(), "wert", null, 1, 1, Gleissperre_Vorzugslage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleissperrensignal_TypeClassEClass, Gleissperrensignal_TypeClass.class, "Gleissperrensignal_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGleissperrensignal_TypeClass_Wert(), this.getENUMGleissperrensignalObject(), "wert", null, 1, 1, Gleissperrensignal_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gZ_Freimeldung_L_AttributeGroupEClass, GZ_Freimeldung_L_AttributeGroup.class, "GZ_Freimeldung_L_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGZ_Freimeldung_L_AttributeGroup_ElementLage(), this.getElement_Lage_TypeClass(), null, "elementLage", null, 1, 1, GZ_Freimeldung_L_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGZ_Freimeldung_L_AttributeGroup_IDElement(), theVerweisePackage.getID_Element_TypeClass(), null, "iDElement", null, 1, 1, GZ_Freimeldung_L_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gZ_Freimeldung_R_AttributeGroupEClass, GZ_Freimeldung_R_AttributeGroup.class, "GZ_Freimeldung_R_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGZ_Freimeldung_R_AttributeGroup_ElementLage(), this.getElement_Lage_TypeClass(), null, "elementLage", null, 1, 1, GZ_Freimeldung_R_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGZ_Freimeldung_R_AttributeGroup_IDElement(), theVerweisePackage.getID_Element_TypeClass(), null, "iDElement", null, 1, 1, GZ_Freimeldung_R_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(herzstueck_Antriebe_TypeClassEClass, Herzstueck_Antriebe_TypeClass.class, "Herzstueck_Antriebe_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHerzstueck_Antriebe_TypeClass_Wert(), this.getHerzstueck_Antriebe_Type(), "wert", null, 1, 1, Herzstueck_Antriebe_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isolierfall_TypeClassEClass, Isolierfall_TypeClass.class, "Isolierfall_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsolierfall_TypeClass_Wert(), this.getIsolierfall_Type(), "wert", null, 1, 1, Isolierfall_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kr_KrW_Seitenzuordnung_TypeClassEClass, Kr_KrW_Seitenzuordnung_TypeClass.class, "Kr_KrW_Seitenzuordnung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKr_KrW_Seitenzuordnung_TypeClass_Wert(), this.getKr_KrW_Seitenzuordnung_Type(), "wert", null, 1, 1, Kr_KrW_Seitenzuordnung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kreuzung_AttributeGroupEClass, Kreuzung_AttributeGroup.class, "Kreuzung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKreuzung_AttributeGroup_ElektrischerAntriebAnzahl(), this.getElektrischer_Antrieb_Anzahl_TypeClass(), null, "elektrischerAntriebAnzahl", null, 1, 1, Kreuzung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKreuzung_AttributeGroup_ElektrischerAntriebLage(), this.getElektrischer_Antrieb_Lage_TypeClass(), null, "elektrischerAntriebLage", null, 0, 1, Kreuzung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKreuzung_AttributeGroup_GeschwindigkeitL(), this.getGeschwindigkeit_L_TypeClass(), null, "geschwindigkeitL", null, 1, 1, Kreuzung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKreuzung_AttributeGroup_GeschwindigkeitR(), this.getGeschwindigkeit_R_TypeClass(), null, "geschwindigkeitR", null, 1, 1, Kreuzung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kreuzungsgleis_TypeClassEClass, Kreuzungsgleis_TypeClass.class, "Kreuzungsgleis_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKreuzungsgleis_TypeClass_Wert(), this.getKreuzungsgleis_Type(), "wert", null, 1, 1, Kreuzungsgleis_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schutzschiene_TypeClassEClass, Schutzschiene_TypeClass.class, "Schutzschiene_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchutzschiene_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Schutzschiene_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stammgleis_TypeClassEClass, Stammgleis_TypeClass.class, "Stammgleis_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStammgleis_TypeClass_Wert(), this.getStammgleis_Type(), "wert", null, 1, 1, Stammgleis_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vorzugslage_Automatik_TypeClassEClass, Vorzugslage_Automatik_TypeClass.class, "Vorzugslage_Automatik_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVorzugslage_Automatik_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Vorzugslage_Automatik_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(w_Kr_AnlageEClass, W_Kr_Anlage.class, "W_Kr_Anlage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getW_Kr_Anlage_IDAnhangDWS(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangDWS", null, 0, 1, W_Kr_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Anlage_IDSignal(), theVerweisePackage.getID_Signal_TypeClass(), null, "iDSignal", null, 0, 1, W_Kr_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Anlage_WKrAnlageAllg(), this.getW_Kr_Anlage_Allg_AttributeGroup(), null, "wKrAnlageAllg", null, 1, 1, W_Kr_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(w_Kr_Anlage_Allg_AttributeGroupEClass, W_Kr_Anlage_Allg_AttributeGroup.class, "W_Kr_Anlage_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getW_Kr_Anlage_Allg_AttributeGroup_Isolierfall(), this.getIsolierfall_TypeClass(), null, "isolierfall", null, 0, 1, W_Kr_Anlage_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Anlage_Allg_AttributeGroup_WKrArt(), this.getW_Kr_Art_TypeClass(), null, "wKrArt", null, 1, 1, W_Kr_Anlage_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Anlage_Allg_AttributeGroup_WKrGrundform(), this.getW_Kr_Grundform_TypeClass(), null, "wKrGrundform", null, 1, 1, W_Kr_Anlage_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(w_Kr_Art_TypeClassEClass, W_Kr_Art_TypeClass.class, "W_Kr_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getW_Kr_Art_TypeClass_Wert(), this.getENUMWKrArtObject(), "wert", null, 1, 1, W_Kr_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(w_Kr_Grundform_TypeClassEClass, W_Kr_Grundform_TypeClass.class, "W_Kr_Grundform_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getW_Kr_Grundform_TypeClass_Wert(), this.getW_Kr_Grundform_Type(), "wert", null, 1, 1, W_Kr_Grundform_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(w_Kr_Gsp_ElementEClass, W_Kr_Gsp_Element.class, "W_Kr_Gsp_Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getW_Kr_Gsp_Element_Bezeichnung(), theBasisTypenPackage.getBezeichnung_Element_AttributeGroup(), null, "bezeichnung", null, 1, 1, W_Kr_Gsp_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Element_IDRegelzeichnung(), theVerweisePackage.getID_Regelzeichnung_TypeClass(), null, "iDRegelzeichnung", null, 0, 1, W_Kr_Gsp_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Element_IDStellelement(), theVerweisePackage.getID_Stellelement_TypeClass(), null, "iDStellelement", null, 0, 1, W_Kr_Gsp_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Element_IDWKrAnlage(), theVerweisePackage.getID_W_Kr_Anlage_TypeClass(), null, "iDWKrAnlage", null, 0, 1, W_Kr_Gsp_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Element_IDWeichenlaufkette(), theVerweisePackage.getID_Weichenlaufkette_TypeClass(), null, "iDWeichenlaufkette", null, 0, 1, W_Kr_Gsp_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Element_WKrGspElementAllg(), this.getW_Kr_Gsp_Element_Allg_AttributeGroup(), null, "wKrGspElementAllg", null, 1, 1, W_Kr_Gsp_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Element_GleissperreElement(), this.getGleissperre_Element_AttributeGroup(), null, "gleissperreElement", null, 0, 1, W_Kr_Gsp_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Element_WeicheElement(), this.getWeiche_Element_AttributeGroup(), null, "weicheElement", null, 0, 1, W_Kr_Gsp_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(w_Kr_Gsp_Element_Allg_AttributeGroupEClass, W_Kr_Gsp_Element_Allg_AttributeGroup.class, "W_Kr_Gsp_Element_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getW_Kr_Gsp_Element_Allg_AttributeGroup_KrKrWSeitenzuordnung(), this.getKr_KrW_Seitenzuordnung_TypeClass(), null, "krKrWSeitenzuordnung", null, 0, 1, W_Kr_Gsp_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Element_Allg_AttributeGroup_VorzugslageAutomatik(), this.getVorzugslage_Automatik_TypeClass(), null, "vorzugslageAutomatik", null, 0, 1, W_Kr_Gsp_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Element_Allg_AttributeGroup_WKrGspStellart(), this.getW_Kr_Gsp_Stellart_TypeClass(), null, "wKrGspStellart", null, 1, 1, W_Kr_Gsp_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(w_Kr_Gsp_KomponenteEClass, W_Kr_Gsp_Komponente.class, "W_Kr_Gsp_Komponente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getW_Kr_Gsp_Komponente_AustauschAntriebe(), this.getAustausch_Antriebe_TypeClass(), null, "austauschAntriebe", null, 0, 1, W_Kr_Gsp_Komponente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Komponente_IDRegelzeichnung(), theVerweisePackage.getID_Regelzeichnung_TypeClass(), null, "iDRegelzeichnung", null, 0, -1, W_Kr_Gsp_Komponente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Komponente_IDWKrGspElement(), theVerweisePackage.getID_W_Kr_Gsp_Element_TypeClass(), null, "iDWKrGspElement", null, 1, 1, W_Kr_Gsp_Komponente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Komponente_BesonderesFahrwegelement(), this.getBesonderes_Fahrwegelement_TypeClass(), null, "besonderesFahrwegelement", null, 0, 1, W_Kr_Gsp_Komponente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Komponente_Entgleisungsschuh(), this.getEntgleisungsschuh_AttributeGroup(), null, "entgleisungsschuh", null, 0, 1, W_Kr_Gsp_Komponente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Komponente_Kreuzung(), this.getKreuzung_AttributeGroup(), null, "kreuzung", null, 0, 1, W_Kr_Gsp_Komponente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Kr_Gsp_Komponente_Zungenpaar(), this.getZungenpaar_AttributeGroup(), null, "zungenpaar", null, 0, 1, W_Kr_Gsp_Komponente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(w_Kr_Gsp_Stellart_TypeClassEClass, W_Kr_Gsp_Stellart_TypeClass.class, "W_Kr_Gsp_Stellart_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getW_Kr_Gsp_Stellart_TypeClass_Wert(), this.getENUMWKrGspStellartObject(), "wert", null, 1, 1, W_Kr_Gsp_Stellart_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weiche_Betriebsart_TypeClassEClass, Weiche_Betriebsart_TypeClass.class, "Weiche_Betriebsart_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeiche_Betriebsart_TypeClass_Wert(), this.getENUMWeicheBetriebsartObject(), "wert", null, 1, 1, Weiche_Betriebsart_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weiche_Element_AttributeGroupEClass, Weiche_Element_AttributeGroup.class, "Weiche_Element_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeiche_Element_AttributeGroup_Auffahrortung(), this.getAuffahrortung_TypeClass(), null, "auffahrortung", null, 0, 1, Weiche_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeiche_Element_AttributeGroup_GZFreimeldungL(), this.getGZ_Freimeldung_L_AttributeGroup(), null, "gZFreimeldungL", null, 0, 1, Weiche_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeiche_Element_AttributeGroup_GZFreimeldungR(), this.getGZ_Freimeldung_R_AttributeGroup(), null, "gZFreimeldungR", null, 0, 1, Weiche_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeiche_Element_AttributeGroup_IDGrenzzeichen(), theVerweisePackage.getID_Grenzzeichen_TypeClass(), null, "iDGrenzzeichen", null, 0, 1, Weiche_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeiche_Element_AttributeGroup_IDSignal(), theVerweisePackage.getID_Signal_TypeClass(), null, "iDSignal", null, 0, 1, Weiche_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeiche_Element_AttributeGroup_WeicheBetriebsart(), this.getWeiche_Betriebsart_TypeClass(), null, "weicheBetriebsart", null, 0, 1, Weiche_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeiche_Element_AttributeGroup_WeicheVorzugslage(), this.getWeiche_Vorzugslage_TypeClass(), null, "weicheVorzugslage", null, 0, 1, Weiche_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weiche_Vorzugslage_TypeClassEClass, Weiche_Vorzugslage_TypeClass.class, "Weiche_Vorzugslage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeiche_Vorzugslage_TypeClass_Wert(), this.getWeiche_Vorzugslage_Type(), "wert", null, 1, 1, Weiche_Vorzugslage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weichenlaufketteEClass, Weichenlaufkette.class, "Weichenlaufkette", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeichenlaufkette_Bezeichnung(), theBasisTypenPackage.getBezeichnung_Element_AttributeGroup(), null, "bezeichnung", null, 1, 1, Weichenlaufkette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weichenlaufkette_ZuordnungEClass, Weichenlaufkette_Zuordnung.class, "Weichenlaufkette_Zuordnung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeichenlaufkette_Zuordnung_IDSignal(), theVerweisePackage.getID_Signal_TypeClass(), null, "iDSignal", null, 1, 1, Weichenlaufkette_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeichenlaufkette_Zuordnung_IDWeichenlaufkette(), theVerweisePackage.getID_Weichenlaufkette_TypeClass(), null, "iDWeichenlaufkette", null, 1, 1, Weichenlaufkette_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weichensignal_TypeClassEClass, Weichensignal_TypeClass.class, "Weichensignal_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeichensignal_TypeClass_Wert(), this.getENUMWeichensignalObject(), "wert", null, 1, 1, Weichensignal_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zungenpaar_AttributeGroupEClass, Zungenpaar_AttributeGroup.class, "Zungenpaar_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZungenpaar_AttributeGroup_ElektrischerAntriebAnzahl(), this.getElektrischer_Antrieb_Anzahl_TypeClass(), null, "elektrischerAntriebAnzahl", null, 1, 1, Zungenpaar_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZungenpaar_AttributeGroup_ElektrischerAntriebLage(), this.getElektrischer_Antrieb_Lage_TypeClass(), null, "elektrischerAntriebLage", null, 0, 1, Zungenpaar_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZungenpaar_AttributeGroup_GeschwindigkeitL(), this.getGeschwindigkeit_L_TypeClass(), null, "geschwindigkeitL", null, 1, 1, Zungenpaar_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZungenpaar_AttributeGroup_GeschwindigkeitR(), this.getGeschwindigkeit_R_TypeClass(), null, "geschwindigkeitR", null, 1, 1, Zungenpaar_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZungenpaar_AttributeGroup_HerzstueckAntriebe(), this.getHerzstueck_Antriebe_TypeClass(), null, "herzstueckAntriebe", null, 0, 1, Zungenpaar_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZungenpaar_AttributeGroup_Kreuzungsgleis(), this.getKreuzungsgleis_TypeClass(), null, "kreuzungsgleis", null, 0, 1, Zungenpaar_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZungenpaar_AttributeGroup_Stammgleis(), this.getStammgleis_TypeClass(), null, "stammgleis", null, 0, 1, Zungenpaar_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZungenpaar_AttributeGroup_Weichensignal(), this.getWeichensignal_TypeClass(), null, "weichensignal", null, 0, 1, Zungenpaar_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZungenpaar_AttributeGroup_ZungenpruefkontaktAnzahl(), this.getZungenpruefkontakt_Anzahl_TypeClass(), null, "zungenpruefkontaktAnzahl", null, 1, 1, Zungenpaar_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zungenpruefkontakt_Anzahl_TypeClassEClass, Zungenpruefkontakt_Anzahl_TypeClass.class, "Zungenpruefkontakt_Anzahl_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZungenpruefkontakt_Anzahl_TypeClass_Wert(), this.getZungenpruefkontakt_Anzahl_Type(), "wert", null, 1, 1, Zungenpruefkontakt_Anzahl_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumBesonderesFahrwegelementEEnum, ENUMBesonderesFahrwegelement.class, "ENUMBesonderesFahrwegelement");
		addEEnumLiteral(enumBesonderesFahrwegelementEEnum, ENUMBesonderesFahrwegelement.ENUM_BESONDERES_FAHRWEGELEMENT_ABKLAPPBARER_PRELLBOCK);
		addEEnumLiteral(enumBesonderesFahrwegelementEEnum, ENUMBesonderesFahrwegelement.ENUM_BESONDERES_FAHRWEGELEMENT_BEWEGLICHE_BRÜCKE);
		addEEnumLiteral(enumBesonderesFahrwegelementEEnum, ENUMBesonderesFahrwegelement.ENUM_BESONDERES_FAHRWEGELEMENT_SONSTIGE);
		addEEnumLiteral(enumBesonderesFahrwegelementEEnum, ENUMBesonderesFahrwegelement.ENUM_BESONDERES_FAHRWEGELEMENT_WEHRKAMMERTOR);

		initEEnum(enumElektrischerAntriebLageEEnum, ENUMElektrischerAntriebLage.class, "ENUMElektrischerAntriebLage");
		addEEnumLiteral(enumElektrischerAntriebLageEEnum, ENUMElektrischerAntriebLage.ENUM_ELEKTRISCHER_ANTRIEB_LAGE_LINKS);
		addEEnumLiteral(enumElektrischerAntriebLageEEnum, ENUMElektrischerAntriebLage.ENUM_ELEKTRISCHER_ANTRIEB_LAGE_MITTIG);
		addEEnumLiteral(enumElektrischerAntriebLageEEnum, ENUMElektrischerAntriebLage.ENUM_ELEKTRISCHER_ANTRIEB_LAGE_RECHTS);
		addEEnumLiteral(enumElektrischerAntriebLageEEnum, ENUMElektrischerAntriebLage.ENUM_ELEKTRISCHER_ANTRIEB_LAGE_SONSTIGE);

		initEEnum(enumElementLageEEnum, ENUMElementLage.class, "ENUMElementLage");
		addEEnumLiteral(enumElementLageEEnum, ENUMElementLage.ENUM_ELEMENT_LAGE_ABSCHNITT);
		addEEnumLiteral(enumElementLageEEnum, ENUMElementLage.ENUM_ELEMENT_LAGE_WEICHE);
		addEEnumLiteral(enumElementLageEEnum, ENUMElementLage.ENUM_ELEMENT_LAGE_WEICHE_L);
		addEEnumLiteral(enumElementLageEEnum, ENUMElementLage.ENUM_ELEMENT_LAGE_WEICHE_R);

		initEEnum(enumGleisAbschlussArtEEnum, ENUMGleisAbschlussArt.class, "ENUMGleisAbschlussArt");
		addEEnumLiteral(enumGleisAbschlussArtEEnum, ENUMGleisAbschlussArt.ENUM_GLEIS_ABSCHLUSS_ART_BREMSPRELLBOCK);
		addEEnumLiteral(enumGleisAbschlussArtEEnum, ENUMGleisAbschlussArt.ENUM_GLEIS_ABSCHLUSS_ART_DREHSCHEIBE);
		addEEnumLiteral(enumGleisAbschlussArtEEnum, ENUMGleisAbschlussArt.ENUM_GLEIS_ABSCHLUSS_ART_FAEHRANLEGER);
		addEEnumLiteral(enumGleisAbschlussArtEEnum, ENUMGleisAbschlussArt.ENUM_GLEIS_ABSCHLUSS_ART_FESTPRELLBOCK);
		addEEnumLiteral(enumGleisAbschlussArtEEnum, ENUMGleisAbschlussArt.ENUM_GLEIS_ABSCHLUSS_ART_INFRASTRUKTURGRENZE);
		addEEnumLiteral(enumGleisAbschlussArtEEnum, ENUMGleisAbschlussArt.ENUM_GLEIS_ABSCHLUSS_ART_KOPFRAMPE);
		addEEnumLiteral(enumGleisAbschlussArtEEnum, ENUMGleisAbschlussArt.ENUM_GLEIS_ABSCHLUSS_ART_SCHIEBEBUEHNE);
		addEEnumLiteral(enumGleisAbschlussArtEEnum, ENUMGleisAbschlussArt.ENUM_GLEIS_ABSCHLUSS_ART_SCHWELLENKREUZ);
		addEEnumLiteral(enumGleisAbschlussArtEEnum, ENUMGleisAbschlussArt.ENUM_GLEIS_ABSCHLUSS_ART_SONSTIGE);

		initEEnum(enumGleissperreBetriebsartEEnum, ENUMGleissperreBetriebsart.class, "ENUMGleissperreBetriebsart");
		addEEnumLiteral(enumGleissperreBetriebsartEEnum, ENUMGleissperreBetriebsart.ENUM_GLEISSPERRE_BETRIEBSART_ABGELEGT);
		addEEnumLiteral(enumGleissperreBetriebsartEEnum, ENUMGleissperreBetriebsart.ENUM_GLEISSPERRE_BETRIEBSART_AUFGELEGT);
		addEEnumLiteral(enumGleissperreBetriebsartEEnum, ENUMGleissperreBetriebsart.ENUM_GLEISSPERRE_BETRIEBSART_BETRIEB);

		initEEnum(enumGleissperrensignalEEnum, ENUMGleissperrensignal.class, "ENUMGleissperrensignal");
		addEEnumLiteral(enumGleissperrensignalEEnum, ENUMGleissperrensignal.ENUM_GLEISSPERRENSIGNAL_INNENBELEUCHTET_BEIDSEITIG);
		addEEnumLiteral(enumGleissperrensignalEEnum, ENUMGleissperrensignal.ENUM_GLEISSPERRENSIGNAL_INNENBELEUCHTET_EINSEITIG);
		addEEnumLiteral(enumGleissperrensignalEEnum, ENUMGleissperrensignal.ENUM_GLEISSPERRENSIGNAL_REFLEKTIEREND_BEIDSEITIG);
		addEEnumLiteral(enumGleissperrensignalEEnum, ENUMGleissperrensignal.ENUM_GLEISSPERRENSIGNAL_REFLEKTIEREND_EINSEITIG);

		initEEnum(enumGleissperreVorzugslageEEnum, ENUMGleissperreVorzugslage.class, "ENUMGleissperreVorzugslage");
		addEEnumLiteral(enumGleissperreVorzugslageEEnum, ENUMGleissperreVorzugslage.ENUM_GLEISSPERRE_VORZUGSLAGE_ABGELEGT);
		addEEnumLiteral(enumGleissperreVorzugslageEEnum, ENUMGleissperreVorzugslage.ENUM_GLEISSPERRE_VORZUGSLAGE_AUFGELEGT);

		initEEnum(enumWeicheBetriebsartEEnum, ENUMWeicheBetriebsart.class, "ENUMWeicheBetriebsart");
		addEEnumLiteral(enumWeicheBetriebsartEEnum, ENUMWeicheBetriebsart.ENUM_WEICHE_BETRIEBSART_BETRIEB);
		addEEnumLiteral(enumWeicheBetriebsartEEnum, ENUMWeicheBetriebsart.ENUM_WEICHE_BETRIEBSART_LINKS);
		addEEnumLiteral(enumWeicheBetriebsartEEnum, ENUMWeicheBetriebsart.ENUM_WEICHE_BETRIEBSART_RECHTS);

		initEEnum(enumWeichensignalEEnum, ENUMWeichensignal.class, "ENUMWeichensignal");
		addEEnumLiteral(enumWeichensignalEEnum, ENUMWeichensignal.ENUM_WEICHENSIGNAL_INNENBELEUCHTET);
		addEEnumLiteral(enumWeichensignalEEnum, ENUMWeichensignal.ENUM_WEICHENSIGNAL_REFLEKTIEREND);

		initEEnum(enumwKrArtEEnum, ENUMWKrArt.class, "ENUMWKrArt");
		addEEnumLiteral(enumwKrArtEEnum, ENUMWKrArt.ENUMW_KR_ART_ABW);
		addEEnumLiteral(enumwKrArtEEnum, ENUMWKrArt.ENUMW_KR_ART_DKW);
		addEEnumLiteral(enumwKrArtEEnum, ENUMWKrArt.ENUMW_KR_ART_DW);
		addEEnumLiteral(enumwKrArtEEnum, ENUMWKrArt.ENUMW_KR_ART_EKW);
		addEEnumLiteral(enumwKrArtEEnum, ENUMWKrArt.ENUMW_KR_ART_EW);
		addEEnumLiteral(enumwKrArtEEnum, ENUMWKrArt.ENUMW_KR_ART_FLACHKREUZUNG);
		addEEnumLiteral(enumwKrArtEEnum, ENUMWKrArt.ENUMW_KR_ART_IBW);
		addEEnumLiteral(enumwKrArtEEnum, ENUMWKrArt.ENUMW_KR_ART_KLOTHOIDENWEICHE);
		addEEnumLiteral(enumwKrArtEEnum, ENUMWKrArt.ENUMW_KR_ART_KORBBOGENWEICHE);
		addEEnumLiteral(enumwKrArtEEnum, ENUMWKrArt.ENUMW_KR_ART_KR);
		addEEnumLiteral(enumwKrArtEEnum, ENUMWKrArt.ENUMW_KR_ART_SONSTIGE);

		initEEnum(enumwKrGspStellartEEnum, ENUMWKrGspStellart.class, "ENUMWKrGspStellart");
		addEEnumLiteral(enumwKrGspStellartEEnum, ENUMWKrGspStellart.ENUMW_KR_GSP_STELLART_ELEKTRISCH_FERNGESTELLT);
		addEEnumLiteral(enumwKrGspStellartEEnum, ENUMWKrGspStellart.ENUMW_KR_GSP_STELLART_ELEKTRISCH_ORTSGESTELLT);
		addEEnumLiteral(enumwKrGspStellartEEnum, ENUMWKrGspStellart.ENUMW_KR_GSP_STELLART_MECHANISCH_FERNGESTELLT);
		addEEnumLiteral(enumwKrGspStellartEEnum, ENUMWKrGspStellart.ENUMW_KR_GSP_STELLART_MECHANISCH_ORTSGESTELLT);
		addEEnumLiteral(enumwKrGspStellartEEnum, ENUMWKrGspStellart.ENUMW_KR_GSP_STELLART_NICHT_STELLBAR);
		addEEnumLiteral(enumwKrGspStellartEEnum, ENUMWKrGspStellart.ENUMW_KR_GSP_STELLART_RUECKFALLWEICHE);
		addEEnumLiteral(enumwKrGspStellartEEnum, ENUMWKrGspStellart.ENUMW_KR_GSP_STELLART_SONSTIGE);
		addEEnumLiteral(enumwKrGspStellartEEnum, ENUMWKrGspStellart.ENUMW_KR_GSP_STELLART_STILLGELEGT_LINKS);
		addEEnumLiteral(enumwKrGspStellartEEnum, ENUMWKrGspStellart.ENUMW_KR_GSP_STELLART_STILLGELEGT_RECHTS);
		addEEnumLiteral(enumwKrGspStellartEEnum, ENUMWKrGspStellart.ENUMW_KR_GSP_STELLART_UNBESTIMMT);

		// Initialize data types
		initEDataType(cAuswurfrichtungEDataType, ENUMLinksRechts.class, "CAuswurfrichtung", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(elektrischer_Antrieb_Anzahl_TypeEDataType, BigInteger.class, "Elektrischer_Antrieb_Anzahl_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBesonderesFahrwegelementObjectEDataType, ENUMBesonderesFahrwegelement.class, "ENUMBesonderesFahrwegelementObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumElektrischerAntriebLageObjectEDataType, ENUMElektrischerAntriebLage.class, "ENUMElektrischerAntriebLageObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumElementLageObjectEDataType, ENUMElementLage.class, "ENUMElementLageObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumGleisAbschlussArtObjectEDataType, ENUMGleisAbschlussArt.class, "ENUMGleisAbschlussArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumGleissperreBetriebsartObjectEDataType, ENUMGleissperreBetriebsart.class, "ENUMGleissperreBetriebsartObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumGleissperrensignalObjectEDataType, ENUMGleissperrensignal.class, "ENUMGleissperrensignalObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumGleissperreVorzugslageObjectEDataType, ENUMGleissperreVorzugslage.class, "ENUMGleissperreVorzugslageObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumWeicheBetriebsartObjectEDataType, ENUMWeicheBetriebsart.class, "ENUMWeicheBetriebsartObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumWeichensignalObjectEDataType, ENUMWeichensignal.class, "ENUMWeichensignalObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumwKrArtObjectEDataType, ENUMWKrArt.class, "ENUMWKrArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumwKrGspStellartObjectEDataType, ENUMWKrGspStellart.class, "ENUMWKrGspStellartObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geschwindigkeit_L_TypeEDataType, BigInteger.class, "Geschwindigkeit_L_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geschwindigkeit_R_TypeEDataType, BigInteger.class, "Geschwindigkeit_R_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(herzstueck_Antriebe_TypeEDataType, BigInteger.class, "Herzstueck_Antriebe_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(isolierfall_TypeEDataType, String.class, "Isolierfall_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kr_KrW_Seitenzuordnung_TypeEDataType, ENUMLinksRechts.class, "Kr_KrW_Seitenzuordnung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kreuzungsgleis_TypeEDataType, ENUMLinksRechts.class, "Kreuzungsgleis_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stammgleis_TypeEDataType, ENUMLinksRechts.class, "Stammgleis_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(w_Kr_Grundform_TypeEDataType, String.class, "W_Kr_Grundform_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(weiche_Vorzugslage_TypeEDataType, ENUMLinksRechts.class, "Weiche_Vorzugslage_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zungenpruefkontakt_Anzahl_TypeEDataType, BigInteger.class, "Zungenpruefkontakt_Anzahl_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (getEntgleisungsschuh_AttributeGroup_Auswurfrichtung(),
		   source,
		   new String[] {
			   "documentation", "Entgleisungsrichtung eines Fahrzeugs, das \u00fcber den Entgleisungsschuh f\u00e4hrt. Die Entgleisungsrichtung ist in Bewegungsrichtung des Fahrzeuges auf den Entgleisungsschuhs zu sehen und ist nicht auf die Wirkrichtung der topologischen Kante bezogen. Da das zugeh\u00f6rige Objekt (W_Kr_Gsp_Komponente) als Punktobjekt auf eine Fahrschiene des Gleises (Topologiekante) verortet ist, kann daraus ebenfalls die Auswurfrichtung ermittelt werden. Achtung: Die Angabe ist redundant zu den Angaben im Punktobjekt bez\u00fcglich der Attribute Seitliche Lage und Wirkrichtung und soll daher zuk\u00fcnftig entfallen."
		   });
		addAnnotation
		  (getEntgleisungsschuh_AttributeGroup_Gleissperrensignal(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob und in welcher Auspr\u00e4gung ein Gleissperrensignal vorzusehen ist."
		   });
		addAnnotation
		  (getEntgleisungsschuh_AttributeGroup_Schutzschiene(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr die Gleissperre ist eine Schutzschiene vorgesehen."
		   });
		addAnnotation
		  (gleis_AbschlussEClass,
		   source,
		   new String[] {
			   "documentation", "St\u00e4ndig vorhandenes Ende eines betrieblich nutzbaren Gleises (z. B. Prellbock oder Schwellenkreuz). Der Gleisabschluss ist ein Punkt Objekt. Die TOP Kante kann hinter dem Gleisabschluss bis zum baulichen Ende des Gleises weitergef\u00fchrt sein. Er wird auf den Punkt verortet, der die Grenze der m\u00f6glichen Fahrzeugbewegung darstellt. Da das bauliche Ende konstruktiv hinter diesem Punkt liegt, f\u00e4llt der Gleisabschluss in der Regel nicht mit einem TOP Knoten zusammen. Der Gleisabschluss ist vom klappbaren Prellbock (und anderen beweglichen Elementen) zu unterscheiden. Diese besonderen beweglichen Fahrwegelemente sind als Gleissperre mit einem erg\u00e4nzenden Bearbeitungsvermerk zu planen. Der Gleisabschluss ist in der Regel auch Grenze eines Gleisabschnittes. Die Wirkrichtung entspricht der Richtung der m\u00f6glichen Fahrzeugbewegung auf den Gleisabschluss. Der Gleisabschluss ist mittig angeordnet, sodass die Angabe des seitlichen Abstands bzw. der seitlichen Lage entf\u00e4llt."
		   });
		addAnnotation
		  (getGleis_Abschluss_GleisAbschlussArt(),
		   source,
		   new String[] {
			   "documentation", "Technische Ausbildung des Gleisabschlusses. Falls als ENUM-Wert \\\"sonstige\\\" angegeben wird, ist der Gleisabschluss mittels eines Bearbeitungsvermerks gesondert zu erl\u00e4utern. Ein abklappbarer Prellbock ist ein bewegliches Fahwegelement und wird hier nicht modelliert. Das den Gleisabschluss kennzeichnende Signal wird als solches gesondert modelliert. "
		   });
		addAnnotation
		  (getGleissperre_Element_AttributeGroup_GleissperreBetriebsart(),
		   source,
		   new String[] {
			   "documentation", "Neben dem Normalbetrieb (Element ist stellbar) kann das Element durch den Betriebsartenstecker in einer definierten Lage festgelegt werden."
		   });
		addAnnotation
		  (getGleissperre_Element_AttributeGroup_GleissperreVorzugslage(),
		   source,
		   new String[] {
			   "documentation", "Vorzugslage der Gleissperre (Grundstellung). Dieses Attribut enth\u00e4lt den Eintrag abgelegt oder aufgelegt. Mit dem Attribut Vorzugslage Automatik kann festgelegt werden, dass diese Vorzugslage automatisch hergestellt wird. In gro\u00dfen Rangierbahnh\u00f6fen wird u. U. auf die Festlegung einer Vorzugslage verzichtet."
		   });
		addAnnotation
		  (getGZ_Freimeldung_L_AttributeGroup_ElementLage(),
		   source,
		   new String[] {
			   "documentation", "Angabe bei nicht grenzzeichenfreier Freimeldung eines Weichenschenkels, in welcher Lage das angrenzende Fahrwegelement (Gleis oder Weiche) zur Freipr\u00fcfung herangezogen wird. Wenn die Grenzzeichenfreiheit durch die Freipr\u00fcfung eines angrenzenden Fahrwegelementes erkannt wird, das ein Gleisabschnitt ist, wird Abschnitt, eine Weiche ist, die unabh\u00e4ngig von ihrer Lage herangezogen wird, wird Weiche, eine Weiche ist, die nur in Linkslage herangezogen wird, wird WeicheL, eine Weiche ist, die nur in Rechtslage herangezogen wird, wird WeicheR als ENUM-Wert verwendet."
		   });
		addAnnotation
		  (getGZ_Freimeldung_L_AttributeGroup_IDElement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das angrenzende W_Kr_Gsp_Element bzw. den angrenzenden Gleis_Abschnitt, das/der zum Pr\u00fcfen der Grenzzeichenfreiheit des rechten bzw. linken Weichenschenkels herangezogen wird."
		   });
		addAnnotation
		  (getGZ_Freimeldung_R_AttributeGroup_ElementLage(),
		   source,
		   new String[] {
			   "documentation", "Angabe bei nicht grenzzeichenfreier Freimeldung eines Weichenschenkels, in welcher Lage das angrenzende Fahrwegelement (Gleis oder Weiche) zur Freipr\u00fcfung herangezogen wird. Wenn die Grenzzeichenfreiheit durch die Freipr\u00fcfung eines angrenzenden Fahrwegelementes erkannt wird, das ein Gleisabschnitt ist, wird Abschnitt, eine Weiche ist, die unabh\u00e4ngig von ihrer Lage herangezogen wird, wird Weiche, eine Weiche ist, die nur in Linkslage herangezogen wird, wird WeicheL, eine Weiche ist, die nur in Rechtslage herangezogen wird, wird WeicheR als ENUM-Wert verwendet."
		   });
		addAnnotation
		  (getGZ_Freimeldung_R_AttributeGroup_IDElement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das angrenzende W_Kr_Gsp_Element bzw. den angrenzenden Gleis_Abschnitt, das/der zum Pr\u00fcfen der Grenzzeichenfreiheit des rechten bzw. linken Weichenschenkels herangezogen wird."
		   });
		addAnnotation
		  (getKreuzung_AttributeGroup_ElektrischerAntriebAnzahl(),
		   source,
		   new String[] {
			   "documentation", "Anzahl der f\u00fcr die W Kr Gsp Komponente vorgesehenen elektrischen Antriebe. Die Anordnung der Weichenantriebe erfolgt nach der angegebenen Regelzeichnung. Mechanische Weichenantriebe sind durch die Stellart bestimmt. Die Anzahl der elektrischen Antribe w\u00e4re dann 0! Mechanische Pr\u00fcfer und Riegel werden durch die entsprechende Regelzeichnung zugeordnet. F\u00fcr eine Kreuzung ist die Anzahl der elektrischen Antrieb mit 0 anzugeben. Bei einer Flachkreuzung, die aus 2 Kreuzungsseiten besteht, werden die Antriebe den jeweiligen Kreuzungsseiten A und B beiden zugeordnet, die jeweils 0 oder 1 Antrieb haben k\u00f6nnen. Die Lage der Antriebe ergibt sich aus der Regelzeichnung. F\u00fcr eine EKW werden die Antriebe ebenfalls f\u00fcr die beiden Kreuzungsseiten A und B getrennt (0 oder 1) angegeben. Die konkrete Lage der Antriebe ergibt sich aus der Regelzeichnung. F\u00fcr eine DKW werden die Antriebe f\u00fcr die Seiten AB und CD getrennt angegeben. Da im allgemeinen die Zungenpaare (W_Kr_Gsp_Komponente) einer Kreuzungsseite gemeinsam angetrieben werden, ist es bedeutungslos, ob der zugeh\u00f6rige Antrieb an dem Zungenpaar A oder B bzw. C oder D angeordnet wird. Die konkrete Lage der Antrieb ergibt sich aus der Regelzeichnung. "
		   });
		addAnnotation
		  (getKreuzung_AttributeGroup_ElektrischerAntriebLage(),
		   source,
		   new String[] {
			   "documentation", "Lage des Antriebs vom Kreuzungsmittelpunkt aus gesehen."
		   });
		addAnnotation
		  (getKreuzung_AttributeGroup_GeschwindigkeitL(),
		   source,
		   new String[] {
			   "documentation", "Zul\u00e4ssige Geschwindigkeit \u00fcber den linken Weichenschenkel. Die Geschwindigkeit kann geringer sein als die aus der Weichengeometrie abgeleitete. Die Angabe erfolgt in km/h."
		   });
		addAnnotation
		  (getKreuzung_AttributeGroup_GeschwindigkeitR(),
		   source,
		   new String[] {
			   "documentation", "Zul\u00e4ssige Geschwindigkeit \u00fcber den rechten Weichenschenkel. Die Geschwindigkeit kann geringer sein als die aus der Weichengeometrie abgeleitete. Die Angabe erfolgt in km/h."
		   });
		addAnnotation
		  (w_Kr_AnlageEClass,
		   source,
		   new String[] {
			   "documentation", "Bauliche Gesamtheit des Objektes Weiche oder Kreuzung einschlie\u00dflich der f\u00fcr seine Funktion unmittelbar und in der N\u00e4he vorhandenen Stell-, Steuer- und \u00dcberwachungseinrichtungen. Typische Grundformen der Weichenanlagen sind: einfache Weiche (EW), einfache Kreuzungsweiche (EKW), doppelte Kreuzungsweiche (DKW), starre Kreuzung (KR) und Flachkreuzungen mit doppelten Herzst\u00fccken und beweglichen Spitzen (KR). Grundlage der Bezeichnungen ist die Ril 800.0120 in Verbindung mit den zugeh\u00f6rigen Anlagen. Weichenanlagen werden unterteilt in die einzelnen Elemente (Weichenelement). Die Elemente besitzen eine oder mehrere Komponenten (Weichenkomponente). Diese Objekte beschreiben in Verbindung mit Regelzeichnungen weitere Eigenschaften (z.B. Antriebe und Endlagenpr\u00fcfer) der Weichenanlage. Siehe auch Modellierung Weichen. DB-Regelwerk Ril 800.0120 "
		   });
		addAnnotation
		  (getW_Kr_Anlage_IDAnhangDWS(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die zugeh\u00f6rige Digitale Weichenskizze, die als Dateianhang mittels des Objektes Anhang eingebunden wird. DB-Regelwerk Die Digitale Weichenskizze wird f\u00fcr alle neu zu beschaffenden Weichen nach Ril 823.0700 erstellt. Sie enth\u00e4lt alle konstruktiven Daten der zu beschaffenden Weiche. Die relevanten Daten f\u00fcr die signaltechnischen Planungen werden k\u00fcnftig der DWS entnommen bzw. mit dieser Datei abgeglichen. Die f\u00fcr die LST-Planung relevanten Daten werden in entsprechende Attribute der allgemeinen Merkmale eingetragen. "
		   });
		addAnnotation
		  (getW_Kr_Anlage_IDSignal(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein Signal, welches den Zustand der W_Kr_Anlage signalisiert (z. B. R\u00fcckfallweichensignal)."
		   });
		addAnnotation
		  (getW_Kr_Anlage_Allg_AttributeGroup_Isolierfall(),
		   source,
		   new String[] {
			   "documentation", "Art der Isolierung der Weiche. Es wird bei der Verwendung von Gleisstromkreisen zur Freimeldung die Bezeichnung des Isolierfalls gem\u00e4\u00df dem Katalog der Weichenisolierung angegeben."
		   });
		addAnnotation
		  (getW_Kr_Anlage_Allg_AttributeGroup_WKrArt(),
		   source,
		   new String[] {
			   "documentation", "Beschreibt die W Kr Anlage bez\u00fcglich ihrer konstruktiven Art. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. "
		   });
		addAnnotation
		  (getW_Kr_Anlage_Allg_AttributeGroup_WKrGrundform(),
		   source,
		   new String[] {
			   "documentation", "Angabe der vollst\u00e4ndigen Weichengrundform gem\u00e4\u00df Ril. 800.0120. Die Schreibweise erfolgt grunds\u00e4tzlich mit Leerzeichen! Beispiele: EW 60 - 1200 - 1:18,5 - fb; Kr 54 - 1:18,5; DKW 49 - 190 - 1:9. DB-Regerwerk Ril. 800.0120 "
		   });
		addAnnotation
		  (w_Kr_Gsp_ElementEClass,
		   source,
		   new String[] {
			   "documentation", "Einzeln stellbarer Teil einer Weichenanlage oder einer Gleissperre, der h\u00f6chstens zwei Stellungen (Fahrrichtung rechts oder links bzw. Entgleisungsschuh aufgelegt oder abgelegt) annehmen kann. Weichenanlagen bekommen 1 bzw. 2 Weichenelemente zugeordnet. Jedes Weichenelement besteht aus mindestens einer (ggf. mehreren) Komponenten (Zungenpaare), die die technische Sicht darstellen. Eine Kreuzung hat zwei Weichenelemente (A- und B-Seite). Im Fall beweglicher doppelter Herzst\u00fcckspitzen hat die Kreuzung auch zwei Endlagen. Eine starre Kreuzung hat keine Regelzeichnung, da diese keinen Antrieb besitzt. Gleissperren haben kein Objekt im Sinn einer Anlage. Die Attributgruppen GZ_Freimeldung_R bzw. GZ_Freimeldung_L werden nur angegeben, wenn der rechte bzw. linke Schenkel einer Weiche nicht grenzzeichenfrei freigemeldet ist. Wenn das Element weder f\u00fcr eine Weiche oder Gleissperre genutzt wird (z.B. Verrrieglung einer beweglichen Br\u00fccke oder eines Tors), werden die Attributgruppen Gleissperre_Element und Weiche_Element nicht verwendet (optionale Choice). Siehe auch Modellierung Weichen. DB-Regelwerk Weichen werden gem\u00e4\u00df Richtlinie 800.0120 gebaut. F\u00fcr die Anordnung der Bauteile (einschlie\u00dflich Antriebe) an einer Weiche und der Gleissperren existieren Regelzeichnungen der Gruppe S 73xx. F\u00fcr die Planung von Weichen ist das Regelwerk 819.0401 zu beachten."
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_IDRegelzeichnung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein Objekt Regelzeichnung, sofern bei einer Weiche (z. B. DKW) oder Gleissperre (z. B. gekuppelte Gleissperre) mehrere Komponenten in einer Regelzeichnung zusammengefasst sind. "
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_IDStellelement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Objekt Stellelement zur Zusammenfassung von Eigenschaften der Objekte BUE Schnittstelle, PZB Element, Schluesselsperre, Signal, W Kr Gsp Element. Das Stellelement enth\u00e4lt Informationen \u00fcber den energetischen und logischen Anschluss der Objekte. F\u00fcr das PZB Element ist der Verweis nur zu f\u00fcllen, wenn das PZB_Element eine G\u00dc ist. DB-Regelwerk Bisher ohne eindeutige Darstellung "
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_IDWKrAnlage(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die W_Kr_Anlage, deren Bestandteil das W_Kr_Gsp_Element ist. Der Verweis wird nur f\u00fcr Weichen und Keuzungen verwendet. Er darf nicht bei Gleissperren verwendet werden."
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_IDWeichenlaufkette(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Weichenlaufkette, in der das Weichenelement enthalten ist. "
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_Allg_AttributeGroup_KrKrWSeitenzuordnung(),
		   source,
		   new String[] {
			   "documentation", "Bei unsymmetrischen Kreuzungen (Kr) und Kreuzungsweichen (KrW): Zuordnung der Seite Links/Rechts gem\u00e4\u00df Ril 800.0120. Die Angabe wird nachfolgend f\u00fcr das korrekte Zeichnen der Weichendreiecke in ma\u00dfst\u00e4blichen Lagepl\u00e4nen ben\u00f6tigt."
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_Allg_AttributeGroup_VorzugslageAutomatik(),
		   source,
		   new String[] {
			   "documentation", "Automatischer R\u00fccklauf des Elements (Weiche oder Gleissperre) in seine Vorzugslage, sobald die Beanspruchung durch eine Fahrstra\u00dfe endet. Zus\u00e4tzlich muss auch das Attribut Weiche Vorzugslage oder Gleissperre Vorzugslage angegeben werden."
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_Allg_AttributeGroup_WKrGspStellart(),
		   source,
		   new String[] {
			   "documentation", "Art, wie das W Kr Gsp Element zu stellen ist. Der ENUM-Wert \\\"nicht_stellbar\\\" wird f\u00fcr die Abbildung der Kreuzung verwendet. F\u00fcr stillgelegte Weichen gem\u00e4\u00df Iow wird die befahrbare Weichenlage angegeben. "
		   });
		addAnnotation
		  (w_Kr_Gsp_KomponenteEClass,
		   source,
		   new String[] {
			   "documentation", "Einzelner Teil der Weichenanlage (Zungenpaar) oder konstruktiver Mittelpunkt einer Kreuzung in Form von 2 Kreuzungsseiten. Mit Hilfe der W_Kr_Gsp_Komponente als punktf\u00f6rmiges Objekt wird die Verkn\u00fcpfung mit dem Knoten im Topologischen Modell hergestellt. Als Zuordnungspunkte f\u00fcr die Topologie und die Topographie werden Weichenknoten definiert. Die Verortung der Weichenkomponente ist in f\u00fcr die typischen Anwendungsf\u00e4lle in der Modellierung Weichen dargestellt. Bei einfachen Weichen entspricht der Weichenknoten dem Weichenanfang. Bei EKW und DKW entspricht der Weichenknoten dem Anfang der entsprechenden Zungenpaare (auch hier einheitlich als Weichenanfang bezeichnet). Bei einer Kreuzung wird der Mittelpunkt der Kreuzung als Weichenknoten verwendet. Beide Kreuzungsseiten werden jeweils auf die beiden sich kreuzenden TOP-Kanten verortet. Der Mittelpunkt einer Kreuzung ist kein TOP-Knoten und kein GEO-Knoten. Bei Gleissperren wird die Lage des Entgleisungsschuhs verortet. \u00dcber die Seitliche Lage im Punkt Objekt wird die Schiene bestimmt, an der der Entgleisungsschuh angebracht ist. Die seitliche Lage wird im Bezug auf die Richtung der TOP_Kante angegeben und stellt nicht die Entgleisungsrichtung dar! Wenn die Weichenkomponente mit einem nicht mechanisch mit der Weiche verbundenen (Weichen-)Signal (z. B. R\u00fcckfallweichensignal, Weichenlagemelder) ausger\u00fcstet werden soll, erfolgt die Modellierung dieses Signals als ein gesondertes Objekt Signal. Auf dieses Signal wird von W Kr Anlage (wenn die Anlage ein Signal hat) bzw. W Kr Gsp Element (wenn mehrere Elemete vorhanden sind und diese unterschiedliche Signale haben) verwiesen. Der Weichelagemelder einer DKW wird von den beiden W_Kr_Gsp_Element gesteuert, aber in einem Signal angezeigt. Er wird deshalb nur als ein Signal in der Weichenanlage modelliert. Ein mit der Weichenkomponente mechanisch verbundenes Weichensignal wird gem\u00e4\u00df Regelzeichnung errichtet, wenn das Attribut Weichensignal gesetzt ist. Es wird dann kein gesondertes Signal modelliert. Siehe auch Modellierung Weichen. Die im Glossar mit (E) gekennzeichneten Attribute Radius_L und Radius_R sollen nicht mehr bef\u00fcllt werden, da ein k\u00fcnftiger Entfall vorgesehen ist."
		   });
		addAnnotation
		  (getW_Kr_Gsp_Komponente_AustauschAntriebe(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob die vorhandenen Antriebe ausgetauscht werden soll (true). Der Wert \\\"false\\\" wird nicht verwendet."
		   });
		addAnnotation
		  (getW_Kr_Gsp_Komponente_IDRegelzeichnung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein Objekt Regelzeichnung. F\u00fcr Weichen, Kreuzungen und Gleissperren werden die Regelzeichnungen der Gruppe S73xx.yy verwendet. Die Regelzeichnung wird f\u00fcr die W_Kr_Gsp_Komponente angegeben und enth\u00e4lt u. a. auch die Anordnung der Antriebe und Endlagenpr\u00fcfer. Die Lage ist durch unterschiedliche Bilder in der Regelzeichnung spezifiziert, so dass auch das Bild mit angegeben werden muss. Nur dann, wenn in einer Regelzeichnung mehrere Komponenten zusammengefasst sind (z. B. bei der DKW und der gekuppelten Gleissperre), wird der Eintrag bei W Kr Gsp Element vorgenommen. "
		   });
		addAnnotation
		  (getW_Kr_Gsp_Komponente_IDWKrGspElement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das zugeh\u00f6rige Weichen-, Kreuzungs- oder Gleissperrenelement. "
		   });
		addAnnotation
		  (getW_Kr_Gsp_Komponente_BesonderesFahrwegelement(),
		   source,
		   new String[] {
			   "documentation", "Abbildung besonderer Fahrwegelemente wie Wehrkammtertor, bewegliche Br\u00fccke oder abklappbarer Prellbock."
		   });
		addAnnotation
		  (getW_Kr_Gsp_Komponente_Kreuzung(),
		   source,
		   new String[] {
			   "documentation", "Fahrwegelement, an dem sich zwei Gleise h\u00f6hengleich kreuzen, ohne dass ein \u00dcbergang zwischen den Gleisen m\u00f6glich ist. Einfache Kreuzungen sind in der Regel nicht stellbar. Kreuzungen, die einen besonders spitzen Winkel haben (Kreuzungen mit beweglichen Doppelherzst\u00fcckspitzen, auch Flachkreuzung genannt) sind stellbar und besitzen mindestens einen, vorzugsweise zwei gleichlaufende Antriebe"
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_Auffahrortung(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr das technisch nicht auffahrbare Weichenelement sind spezielle Sensoren zur Auffahrortung anzubringen. Ist diese Funktionalit\u00e4t erforderlich ist, wird das Attribut auf true gesetzt. Ansonsten entf\u00e4llt es. "
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_GZFreimeldungL(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob die Freimeldung im linken Weichenschenkel grenzzeichenfrei realisiert ist (true) oder nicht (false)."
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_GZFreimeldungR(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob die Freimeldung im rechten Weichenschenkel grenzzeichenfrei realisiert ist (true) oder nicht (false)."
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_IDGrenzzeichen(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein Signal, was das zugeh\u00f6rige Grenzzeichen dieser Weiche ist."
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_IDSignal(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein Signal, welches den Zustand des W_Kr_Gsp_Element signalisiert (z. B. Weichenlagemelder)."
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_WeicheBetriebsart(),
		   source,
		   new String[] {
			   "documentation", "Neben dem Normalbetrieb (Element ist stellbar) kann das Element durch den Betriebsartenstecker in einer definierten Lage festgelegt werden."
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_WeicheVorzugslage(),
		   source,
		   new String[] {
			   "documentation", "Vorzugslage des Weichenelements. Sofern die Angabe erforderlich ist, enth\u00e4lt dieses Attribut den Eintrag links oder rechts bez\u00fcglich der Fahrtrichtung mit Blick von der Weichenspitze. Ist dieses Attribut nicht angegeben, so ist auch keine Vorzugslage vorhanden. Das Attribut Vorzugslage Automatik darf dann nicht bef\u00fcllt sein. "
		   });
		addAnnotation
		  (weichenlaufketteEClass,
		   source,
		   new String[] {
			   "documentation", "Logisches Objekt von mehreren durch Antriebe stellbaren Fahrwegelementen (Weichen, Gleissperren, sonstigen stellbaren Elementen), deren Umlauf automatisch bei einer entsprechenden Anforderung (z.B. Fahrstra\u00dfe) erfolgt. Diese stellbaren Elemente k\u00f6nnen nur dann automatisch gestellt werden, wenn sie auch einer Weichenlaufkette (WLK) zugeordnet sind. Jedes stellbare Element wird genau einer WLK zugeordnet. Durch Sperren der WLK kann dieser automatische Umlauf verhindert werden. Innerhalb von Weichenlaufketten sind dabei folgende Elemente zul\u00e4ssig: Weichen, Gleissperren und Sonderelemente, die automatisch umlaufen sollen. F\u00fcr die Bedienung von Ersatzauftr\u00e4gen des Typs 2 (EE2, VE2, LE2) an Hauptsignalen m\u00fcssen eine oder mehrere Weichenlaufketten gesperrt werden. Zur Reduzierung betrieblicher Behinderungen werden oftmals mehrere Weichenlaufketten in einer Betriebsstelle eingerichtet. DB-Regelwerk Die Bezeichnung der Weichenlaufkette wird gem\u00e4\u00df Ril 819.0603 in der Form LKn (n = laufende Nummer) gebildet und in der Attributgruppe Bezeichnung abgebildet."
		   });
		addAnnotation
		  (getWeichenlaufkette_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (weichenlaufkette_ZuordnungEClass,
		   source,
		   new String[] {
			   "documentation", "Logisches Objekt f\u00fcr die Zuordnung zwischen Weichenlaufketten und Signalen. Das Objekt ist in der Realit\u00e4t des Stellwerkes nicht vorhanden. Die Weichenlaufkette_Zuordnung hat keine Attributgruppe \\\"..._Allgemeine_Merkmale\\\"."
		   });
		addAnnotation
		  (getWeichenlaufkette_Zuordnung_IDSignal(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Signal, dem die Weichenlaufkette zugeordnet wird."
		   });
		addAnnotation
		  (getWeichenlaufkette_Zuordnung_IDWeichenlaufkette(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Weichenlaufkette, die dem Signal zugeordnet wird. "
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_ElektrischerAntriebAnzahl(),
		   source,
		   new String[] {
			   "documentation", "Anzahl der f\u00fcr die W Kr Gsp Komponente vorgesehenen elektrischen Antriebe. Die Anordnung der Weichenantriebe erfolgt nach der angegebenen Regelzeichnung. Mechanische Weichenantriebe sind durch die Stellart bestimmt. Die Anzahl der elektrischen Antribe w\u00e4re dann 0! Mechanische Pr\u00fcfer und Riegel werden durch die entsprechende Regelzeichnung zugeordnet. F\u00fcr eine Kreuzung ist die Anzahl der elektrischen Antrieb mit 0 anzugeben. Bei einer Flachkreuzung, die aus 2 Kreuzungsseiten besteht, werden die Antriebe den jeweiligen Kreuzungsseiten A und B beiden zugeordnet, die jeweils 0 oder 1 Antrieb haben k\u00f6nnen. Die Lage der Antriebe ergibt sich aus der Regelzeichnung. F\u00fcr eine EKW werden die Antriebe ebenfalls f\u00fcr die beiden Kreuzungsseiten A und B getrennt (0 oder 1) angegeben. Die konkrete Lage der Antriebe ergibt sich aus der Regelzeichnung. F\u00fcr eine DKW werden die Antriebe f\u00fcr die Seiten AB und CD getrennt angegeben. Da im allgemeinen die Zungenpaare (W_Kr_Gsp_Komponente) einer Kreuzungsseite gemeinsam angetrieben werden, ist es bedeutungslos, ob der zugeh\u00f6rige Antrieb an dem Zungenpaar A oder B bzw. C oder D angeordnet wird. Die konkrete Lage der Antrieb ergibt sich aus der Regelzeichnung. "
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_ElektrischerAntriebLage(),
		   source,
		   new String[] {
			   "documentation", "Lage des Antriebs von der Weichenspitze aus gesehen."
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_GeschwindigkeitL(),
		   source,
		   new String[] {
			   "documentation", "Zul\u00e4ssige Geschwindigkeit \u00fcber den linken Weichenschenkel. Die Geschwindigkeit kann geringer sein als die aus der Weichengeometrie abgeleitete. Die Angabe erfolgt in km/h."
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_GeschwindigkeitR(),
		   source,
		   new String[] {
			   "documentation", "Zul\u00e4ssige Geschwindigkeit \u00fcber den rechten Weichenschenkel. Die Geschwindigkeit kann geringer sein als die aus der Weichengeometrie abgeleitete. Die Angabe erfolgt in km/h."
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_HerzstueckAntriebe(),
		   source,
		   new String[] {
			   "documentation", "Anzahl der Antriebe am Herzst\u00fcck einer Weiche. Das Attribut entf\u00e4llt, wenn keine bewegliche Herzst\u00fcckspitze vorhanden ist."
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_Kreuzungsgleis(),
		   source,
		   new String[] {
			   "documentation", "Lage der TOP Kante, die bei EKW und DKW vom zugeh\u00f6rigen Zungenpaar in Richtung des Kreuzungsmittelpunktes f\u00fchrt. Das Attribut muss bei EKW und DKW angegeben werden, um eine lagerichtige Zuordnung der Kanteneigenschaften in dem Ausgabetabellen sicherzustellen. "
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_Stammgleis(),
		   source,
		   new String[] {
			   "documentation", "Lage der TOP Kante, die das Stammgleis repr\u00e4sentiert (Blickrichtung von der Weichenspitze zum Weichenstumpf bzw. Kreuzungsmittelpunkt)."
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_Weichensignal(),
		   source,
		   new String[] {
			   "documentation", "Existenz eines (Weichen)-Signals, was konstruktiv (mechanisch) mit der Weichenkomponente verbunden ist. Der Begriff, der am Weichensignal anzeigbar ist, wird nicht modelliert. Die konstruktive Ausbildung des Weichensignals wird dem ENUM entnommen. Bei EKW und DKW wird f\u00fcr alle Weichenkomponenten das Attribut gef\u00fcllt, auch wenn die Lage der Zungenpaare in einem Anzeiger abgebildet werden. Kreuzungen und Kreuzungen mit beweglichen Doppelherzst\u00fcckspitzen (auch Flachkreuzungen genannt) haben grunds\u00e4tzlich kein Weichensignal. Wenn die Weichenanlage ein gesondertes (Weichen)-Signal besitzt (z. B. Weichenlagemelder mit Lichtpunkten oder R\u00fcckfallweichensignale), wird ein eigenes Signal modelliert. Die Weichenanlage bzw. das Weichenelement hat dann einen Elementbezug zum entsprechenden Signal. Als Punkt Objekt wird das Signal gesondert verortet. Achtung: Weichensignale mit Lichtpunkten sind nur in EOW-Bereichen zul\u00e4ssig. F\u00fcr diese Signale existieren keine Regelzeichnungen! DB-Regelwerk Regelzeichnungen "
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_ZungenpruefkontaktAnzahl(),
		   source,
		   new String[] {
			   "documentation", "Anzahl der f\u00fcr diese Komponente vorgesehenen elektrischen Zungenpr\u00fcfkontakte (Zprk). Ein Zungenpr\u00fcfer innerhalb eines Weichenantriebes wird nicht ber\u00fccksichtigt. Die Anordnung der Zungenpr\u00fcfkontakte erfolgt nach der angegebenen Regelzeichnung. Mechanische Weichenantriebe sind durch die Stellart bestimmt. Mechanische Pr\u00fcfer und Riegel werden durch die entsprechende Regelzeichnung zugeordnet."
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
		  (auffahrortung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAuffahrortung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAuffahrortung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (austausch_Antriebe_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAustausch_Antriebe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAustausch_Antriebe_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (auswurfrichtung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAuswurfrichtung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAuswurfrichtung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (besonderes_Fahrwegelement_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBesonderes_Fahrwegelement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBesonderes_Fahrwegelement_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (cAuswurfrichtungEDataType,
		   source,
		   new String[] {
			   "name", "CAuswurfrichtung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts"
		   });
		addAnnotation
		  (elektrischer_Antrieb_Anzahl_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TElektrischer_Antrieb_Anzahl",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[0-9]|1[0-5]"
		   });
		addAnnotation
		  (elektrischer_Antrieb_Anzahl_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCElektrischer_Antrieb_Anzahl",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getElektrischer_Antrieb_Anzahl_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (elektrischer_Antrieb_Lage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCElektrischer_Antrieb_Lage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getElektrischer_Antrieb_Lage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (element_Lage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCElement_Lage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getElement_Lage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (entgleisungsschuh_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CEntgleisungsschuh",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEntgleisungsschuh_AttributeGroup_Auswurfrichtung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Auswurfrichtung"
		   });
		addAnnotation
		  (getEntgleisungsschuh_AttributeGroup_Gleissperrensignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Gleissperrensignal"
		   });
		addAnnotation
		  (getEntgleisungsschuh_AttributeGroup_Schutzschiene(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schutzschiene"
		   });
		addAnnotation
		  (enumBesonderesFahrwegelementEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBesonderes_Fahrwegelement"
		   });
		addAnnotation
		  (enumBesonderesFahrwegelementObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBesonderes_Fahrwegelement:Object",
			   "baseType", "ENUMBesonderes_Fahrwegelement"
		   });
		addAnnotation
		  (enumElektrischerAntriebLageEEnum,
		   source,
		   new String[] {
			   "name", "ENUMElektrischer_Antrieb_Lage"
		   });
		addAnnotation
		  (enumElektrischerAntriebLageObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMElektrischer_Antrieb_Lage:Object",
			   "baseType", "ENUMElektrischer_Antrieb_Lage"
		   });
		addAnnotation
		  (enumElementLageEEnum,
		   source,
		   new String[] {
			   "name", "ENUMElement_Lage"
		   });
		addAnnotation
		  (enumElementLageObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMElement_Lage:Object",
			   "baseType", "ENUMElement_Lage"
		   });
		addAnnotation
		  (enumGleisAbschlussArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMGleis_Abschluss_Art"
		   });
		addAnnotation
		  (enumGleisAbschlussArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMGleis_Abschluss_Art:Object",
			   "baseType", "ENUMGleis_Abschluss_Art"
		   });
		addAnnotation
		  (enumGleissperreBetriebsartEEnum,
		   source,
		   new String[] {
			   "name", "ENUMGleissperre_Betriebsart"
		   });
		addAnnotation
		  (enumGleissperreBetriebsartObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMGleissperre_Betriebsart:Object",
			   "baseType", "ENUMGleissperre_Betriebsart"
		   });
		addAnnotation
		  (enumGleissperrensignalEEnum,
		   source,
		   new String[] {
			   "name", "ENUMGleissperrensignal"
		   });
		addAnnotation
		  (enumGleissperrensignalObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMGleissperrensignal:Object",
			   "baseType", "ENUMGleissperrensignal"
		   });
		addAnnotation
		  (enumGleissperreVorzugslageEEnum,
		   source,
		   new String[] {
			   "name", "ENUMGleissperre_Vorzugslage"
		   });
		addAnnotation
		  (enumGleissperreVorzugslageObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMGleissperre_Vorzugslage:Object",
			   "baseType", "ENUMGleissperre_Vorzugslage"
		   });
		addAnnotation
		  (enumWeicheBetriebsartEEnum,
		   source,
		   new String[] {
			   "name", "ENUMWeiche_Betriebsart"
		   });
		addAnnotation
		  (enumWeicheBetriebsartObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMWeiche_Betriebsart:Object",
			   "baseType", "ENUMWeiche_Betriebsart"
		   });
		addAnnotation
		  (enumWeichensignalEEnum,
		   source,
		   new String[] {
			   "name", "ENUMWeichensignal"
		   });
		addAnnotation
		  (enumWeichensignalObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMWeichensignal:Object",
			   "baseType", "ENUMWeichensignal"
		   });
		addAnnotation
		  (enumwKrArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMW_Kr_Art"
		   });
		addAnnotation
		  (enumwKrArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMW_Kr_Art:Object",
			   "baseType", "ENUMW_Kr_Art"
		   });
		addAnnotation
		  (enumwKrGspStellartEEnum,
		   source,
		   new String[] {
			   "name", "ENUMW_Kr_Gsp_Stellart"
		   });
		addAnnotation
		  (enumwKrGspStellartObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMW_Kr_Gsp_Stellart:Object",
			   "baseType", "ENUMW_Kr_Gsp_Stellart"
		   });
		addAnnotation
		  (geschwindigkeit_L_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGeschwindigkeit_L",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit"
		   });
		addAnnotation
		  (geschwindigkeit_L_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGeschwindigkeit_L",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeschwindigkeit_L_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (geschwindigkeit_R_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGeschwindigkeit_R",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit"
		   });
		addAnnotation
		  (geschwindigkeit_R_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGeschwindigkeit_R",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeschwindigkeit_R_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (gleis_AbschlussEClass,
		   source,
		   new String[] {
			   "name", "CGleis_Abschluss",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleis_Abschluss_GleisAbschlussArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Gleis_Abschluss_Art"
		   });
		addAnnotation
		  (gleis_Abschluss_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGleis_Abschluss_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleis_Abschluss_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (gleissperre_Betriebsart_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGleissperre_Betriebsart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleissperre_Betriebsart_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (gleissperre_Element_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CGleissperre_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleissperre_Element_AttributeGroup_GleissperreBetriebsart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Gleissperre_Betriebsart"
		   });
		addAnnotation
		  (getGleissperre_Element_AttributeGroup_GleissperreVorzugslage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Gleissperre_Vorzugslage"
		   });
		addAnnotation
		  (gleissperre_Vorzugslage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGleissperre_Vorzugslage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleissperre_Vorzugslage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (gleissperrensignal_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGleissperrensignal",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleissperrensignal_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (gZ_Freimeldung_L_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CGZ_Freimeldung_L",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGZ_Freimeldung_L_AttributeGroup_ElementLage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Element_Lage"
		   });
		addAnnotation
		  (getGZ_Freimeldung_L_AttributeGroup_IDElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Element"
		   });
		addAnnotation
		  (gZ_Freimeldung_R_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CGZ_Freimeldung_R",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGZ_Freimeldung_R_AttributeGroup_ElementLage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Element_Lage"
		   });
		addAnnotation
		  (getGZ_Freimeldung_R_AttributeGroup_IDElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Element"
		   });
		addAnnotation
		  (herzstueck_Antriebe_TypeEDataType,
		   source,
		   new String[] {
			   "name", "THerzstueck_Antriebe",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9]|1[0-5]"
		   });
		addAnnotation
		  (herzstueck_Antriebe_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHerzstueck_Antriebe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHerzstueck_Antriebe_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (isolierfall_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIsolierfall",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{1,20}"
		   });
		addAnnotation
		  (isolierfall_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIsolierfall",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIsolierfall_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kr_KrW_Seitenzuordnung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TKr_KrW_Seitenzuordnung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts"
		   });
		addAnnotation
		  (kr_KrW_Seitenzuordnung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKr_KrW_Seitenzuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKr_KrW_Seitenzuordnung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kreuzung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CKreuzung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKreuzung_AttributeGroup_ElektrischerAntriebAnzahl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Elektrischer_Antrieb_Anzahl"
		   });
		addAnnotation
		  (getKreuzung_AttributeGroup_ElektrischerAntriebLage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Elektrischer_Antrieb_Lage"
		   });
		addAnnotation
		  (getKreuzung_AttributeGroup_GeschwindigkeitL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Geschwindigkeit_L"
		   });
		addAnnotation
		  (getKreuzung_AttributeGroup_GeschwindigkeitR(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Geschwindigkeit_R"
		   });
		addAnnotation
		  (kreuzungsgleis_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TKreuzungsgleis",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts"
		   });
		addAnnotation
		  (kreuzungsgleis_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKreuzungsgleis",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKreuzungsgleis_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (schutzschiene_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSchutzschiene",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchutzschiene_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (stammgleis_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TStammgleis",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts"
		   });
		addAnnotation
		  (stammgleis_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCStammgleis",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStammgleis_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (vorzugslage_Automatik_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCVorzugslage_Automatik",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVorzugslage_Automatik_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (w_Kr_AnlageEClass,
		   source,
		   new String[] {
			   "name", "CW_Kr_Anlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getW_Kr_Anlage_IDAnhangDWS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_DWS"
		   });
		addAnnotation
		  (getW_Kr_Anlage_IDSignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal"
		   });
		addAnnotation
		  (getW_Kr_Anlage_WKrAnlageAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "W_Kr_Anlage_Allg"
		   });
		addAnnotation
		  (w_Kr_Anlage_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CW_Kr_Anlage_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getW_Kr_Anlage_Allg_AttributeGroup_Isolierfall(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Isolierfall"
		   });
		addAnnotation
		  (getW_Kr_Anlage_Allg_AttributeGroup_WKrArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "W_Kr_Art"
		   });
		addAnnotation
		  (getW_Kr_Anlage_Allg_AttributeGroup_WKrGrundform(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "W_Kr_Grundform"
		   });
		addAnnotation
		  (w_Kr_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCW_Kr_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getW_Kr_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (w_Kr_Grundform_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TW_Kr_Grundform",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{1,50}"
		   });
		addAnnotation
		  (w_Kr_Grundform_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCW_Kr_Grundform",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getW_Kr_Grundform_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (w_Kr_Gsp_ElementEClass,
		   source,
		   new String[] {
			   "name", "CW_Kr_Gsp_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_IDRegelzeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Regelzeichnung"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_IDStellelement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Stellelement"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_IDWKrAnlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_W_Kr_Anlage"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_IDWeichenlaufkette(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Weichenlaufkette"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_WKrGspElementAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "W_Kr_Gsp_Element_Allg"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_GleissperreElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Gleissperre_Element"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_WeicheElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Weiche_Element"
		   });
		addAnnotation
		  (w_Kr_Gsp_Element_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CW_Kr_Gsp_Element_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_Allg_AttributeGroup_KrKrWSeitenzuordnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kr_KrW_Seitenzuordnung"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_Allg_AttributeGroup_VorzugslageAutomatik(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Vorzugslage_Automatik"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_Allg_AttributeGroup_WKrGspStellart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "W_Kr_Gsp_Stellart"
		   });
		addAnnotation
		  (w_Kr_Gsp_KomponenteEClass,
		   source,
		   new String[] {
			   "name", "CW_Kr_Gsp_Komponente",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Komponente_AustauschAntriebe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Austausch_Antriebe"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Komponente_IDRegelzeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Regelzeichnung"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Komponente_IDWKrGspElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_W_Kr_Gsp_Element"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Komponente_BesonderesFahrwegelement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Besonderes_Fahrwegelement"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Komponente_Entgleisungsschuh(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Entgleisungsschuh"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Komponente_Kreuzung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kreuzung"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Komponente_Zungenpaar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zungenpaar"
		   });
		addAnnotation
		  (w_Kr_Gsp_Stellart_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCW_Kr_Gsp_Stellart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Stellart_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (weiche_Betriebsart_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCWeiche_Betriebsart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWeiche_Betriebsart_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (weiche_Element_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CWeiche_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_Auffahrortung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Auffahrortung"
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_GZFreimeldungL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GZ_Freimeldung_L"
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_GZFreimeldungR(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GZ_Freimeldung_R"
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_IDGrenzzeichen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Grenzzeichen"
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_IDSignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal"
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_WeicheBetriebsart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Weiche_Betriebsart"
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_WeicheVorzugslage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Weiche_Vorzugslage"
		   });
		addAnnotation
		  (weiche_Vorzugslage_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TWeiche_Vorzugslage",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts"
		   });
		addAnnotation
		  (weiche_Vorzugslage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCWeiche_Vorzugslage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWeiche_Vorzugslage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (weichenlaufketteEClass,
		   source,
		   new String[] {
			   "name", "CWeichenlaufkette",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWeichenlaufkette_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (weichenlaufkette_ZuordnungEClass,
		   source,
		   new String[] {
			   "name", "CWeichenlaufkette_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWeichenlaufkette_Zuordnung_IDSignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal"
		   });
		addAnnotation
		  (getWeichenlaufkette_Zuordnung_IDWeichenlaufkette(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Weichenlaufkette"
		   });
		addAnnotation
		  (weichensignal_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCWeichensignal",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWeichensignal_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zungenpaar_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZungenpaar",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_ElektrischerAntriebAnzahl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Elektrischer_Antrieb_Anzahl"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_ElektrischerAntriebLage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Elektrischer_Antrieb_Lage"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_GeschwindigkeitL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Geschwindigkeit_L"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_GeschwindigkeitR(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Geschwindigkeit_R"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_HerzstueckAntriebe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Herzstueck_Antriebe"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_Kreuzungsgleis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kreuzungsgleis"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_Stammgleis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Stammgleis"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_Weichensignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Weichensignal"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_ZungenpruefkontaktAnzahl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zungenpruefkontakt_Anzahl"
		   });
		addAnnotation
		  (zungenpruefkontakt_Anzahl_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TZungenpruefkontakt_Anzahl",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[0-9]|1[0-5]"
		   });
		addAnnotation
		  (zungenpruefkontakt_Anzahl_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZungenpruefkontakt_Anzahl",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZungenpruefkontakt_Anzahl_TypeClass_Wert(),
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
		  (getEntgleisungsschuh_AttributeGroup_Gleissperrensignal(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>reflektierend_beidseitig</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (gleis_AbschlussEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getGleis_Abschluss_GleisAbschlussArt(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:ProposedValue>Bremsprellbock</ppi:ProposedValue>\n                               \n    <ppi:PlanningStage>PT1</ppi:PlanningStage>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
		addAnnotation
		  (getGleissperre_Element_AttributeGroup_GleissperreBetriebsart(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>Betrieb</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getKreuzung_AttributeGroup_ElektrischerAntriebAnzahl(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>0</ppi:ProposedValue>\n                         \n    <ppi:Patternbeschreibung>[0..15]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (w_Kr_AnlageEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getW_Kr_Anlage_Allg_AttributeGroup_Isolierfall(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..20] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getW_Kr_Anlage_Allg_AttributeGroup_WKrGrundform(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:PlanningStage>EP</ppi:PlanningStage>\n                         \n    <ppi:Patternbeschreibung>[1..50]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (w_Kr_Gsp_ElementEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_Allg_AttributeGroup_VorzugslageAutomatik(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>true</ppi:ProposedValue>\n                         \n    <ppi:PlanningStage>PT1</ppi:PlanningStage>\n                         \n    <ppi:ExampleValue>links</ppi:ExampleValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Element_Allg_AttributeGroup_WKrGspStellart(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>elektrisch_ferngestellt</ppi:ProposedValue>\n                         \n    <ppi:PlanningStage>PT1</ppi:PlanningStage>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (w_Kr_Gsp_KomponenteEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getW_Kr_Gsp_Komponente_AustauschAntriebe(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:ProposedValue>true</ppi:ProposedValue>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_Auffahrortung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>true</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_WeicheBetriebsart(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>Betrieb</ppi:ProposedValue>\n                         \n    <ppi:PlanningStage>PT1</ppi:PlanningStage>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getWeiche_Element_AttributeGroup_WeicheVorzugslage(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:PlanningStage>PT1</ppi:PlanningStage>\n                         \n    <ppi:ExampleValue>links</ppi:ExampleValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (weichenlaufketteEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (weichenlaufkette_ZuordnungEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_ElektrischerAntriebAnzahl(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>1</ppi:ProposedValue>\n                         \n    <ppi:Patternbeschreibung> [0..15] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_GeschwindigkeitL(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:PlanningStage>PT1:MUSS</ppi:PlanningStage>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_GeschwindigkeitR(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:PlanningStage>PT1:MUSS</ppi:PlanningStage>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_HerzstueckAntriebe(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1..15]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_Weichensignal(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>reflektierend</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZungenpaar_AttributeGroup_ZungenpruefkontaktAnzahl(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [0..15] </ppi:Patternbeschreibung>\n                         \n    <ppi:ProposedValue>0</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
	}

} //Weichen_und_GleissperrenPackageImpl
