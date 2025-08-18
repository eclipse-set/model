/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale.impl;

import java.math.BigDecimal;

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

import org.eclipse.set.model.planpro.Signale.Anschaltdauer_TypeClass;
import org.eclipse.set.model.planpro.Signale.Auto_Einstellung_TypeClass;
import org.eclipse.set.model.planpro.Signale.Befestigung_Art_TypeClass;
import org.eclipse.set.model.planpro.Signale.Beleuchtet_TypeClass;
import org.eclipse.set.model.planpro.Signale.Besetzte_Ausfahrt_TypeClass;
import org.eclipse.set.model.planpro.Signale.DA_Manuell_TypeClass;
import org.eclipse.set.model.planpro.Signale.Dunkelschaltung_TypeClass;
import org.eclipse.set.model.planpro.Signale.Durchfahrt_TypeClass;
import org.eclipse.set.model.planpro.Signale.ENUMAnschaltdauer;
import org.eclipse.set.model.planpro.Signale.ENUMAutoEinstellung;
import org.eclipse.set.model.planpro.Signale.ENUMBefestigungArt;
import org.eclipse.set.model.planpro.Signale.ENUMBeleuchtet;
import org.eclipse.set.model.planpro.Signale.ENUMDurchfahrt;
import org.eclipse.set.model.planpro.Signale.ENUMFiktivesSignalFunktion;
import org.eclipse.set.model.planpro.Signale.ENUMFundamentArt;
import org.eclipse.set.model.planpro.Signale.ENUMFunktionOhneSignal;
import org.eclipse.set.model.planpro.Signale.ENUMGeltungsbereich;
import org.eclipse.set.model.planpro.Signale.ENUMRahmenArt;
import org.eclipse.set.model.planpro.Signale.ENUMSignalArt;
import org.eclipse.set.model.planpro.Signale.ENUMSignalBefestigungsart;
import org.eclipse.set.model.planpro.Signale.ENUMSignalFunktion;
import org.eclipse.set.model.planpro.Signale.ENUMSignalsystem;
import org.eclipse.set.model.planpro.Signale.ENUMSonstigeZulaessigeAnordnung;
import org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeArt;
import org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeBetriebsstellung;
import org.eclipse.set.model.planpro.Signale.ENUMTunnelsignal;
import org.eclipse.set.model.planpro.Signale.Fiktives_Signal_Funktion_TypeClass;
import org.eclipse.set.model.planpro.Signale.Fundament_Art_TypeClass;
import org.eclipse.set.model.planpro.Signale.Funktion_Ohne_Signal_TypeClass;
import org.eclipse.set.model.planpro.Signale.Gegengleis_TypeClass;
import org.eclipse.set.model.planpro.Signale.Geltungsbereich_TypeClass;
import org.eclipse.set.model.planpro.Signale.Geschaltet_TypeClass;
import org.eclipse.set.model.planpro.Signale.Hoehe_Fundamentoberkante_TypeClass;
import org.eclipse.set.model.planpro.Signale.Obere_Lichtpunkthoehe_TypeClass;
import org.eclipse.set.model.planpro.Signale.PZB_Schutzstrecke_Soll_TypeClass;
import org.eclipse.set.model.planpro.Signale.Rahmen_Art_TypeClass;
import org.eclipse.set.model.planpro.Signale.Rahmen_Hoehe_TypeClass;
import org.eclipse.set.model.planpro.Signale.Rangierstrasse_Restaufloesung_TypeClass;
import org.eclipse.set.model.planpro.Signale.Richtpunkt_TypeClass;
import org.eclipse.set.model.planpro.Signale.Richtpunktentfernung_TypeClass;
import org.eclipse.set.model.planpro.Signale.Signal;
import org.eclipse.set.model.planpro.Signale.Signal_Art_TypeClass;
import org.eclipse.set.model.planpro.Signale.Signal_Befestigung;
import org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.Signal_Befestigungsart_TypeClass;
import org.eclipse.set.model.planpro.Signale.Signal_Fank_Zuordnung;
import org.eclipse.set.model.planpro.Signale.Signal_Fiktiv_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.Signal_Fstr_S_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.Signal_Funktion_TypeClass;
import org.eclipse.set.model.planpro.Signale.Signal_Rahmen;
import org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff;
import org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.SignaleFactory;
import org.eclipse.set.model.planpro.Signale.SignalePackage;
import org.eclipse.set.model.planpro.Signale.Signalsicht_Erreichbar_TypeClass;
import org.eclipse.set.model.planpro.Signale.Signalsicht_Mindest_TypeClass;
import org.eclipse.set.model.planpro.Signale.Signalsicht_Soll_TypeClass;
import org.eclipse.set.model.planpro.Signale.Signalsystem_TypeClass;
import org.eclipse.set.model.planpro.Signale.Sonstige_Zulaessige_Anordnung_TypeClass;
import org.eclipse.set.model.planpro.Signale.Streuscheibe_Art_TypeClass;
import org.eclipse.set.model.planpro.Signale.Streuscheibe_Betriebsstellung_TypeClass;
import org.eclipse.set.model.planpro.Signale.Tunnelsignal_TypeClass;
import org.eclipse.set.model.planpro.Signale.Zs2_Ueberwacht_TypeClass;

import org.eclipse.set.model.planpro.Signale.util.SignaleValidator;

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
public class SignalePackageImpl extends EPackageImpl implements SignalePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anschaltdauer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auto_Einstellung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass befestigung_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beleuchtet_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass besetzte_Ausfahrt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dA_Manuell_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dunkelschaltung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durchfahrt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fiktives_Signal_Funktion_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fundament_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funktion_Ohne_Signal_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gegengleis_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geltungsbereich_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geschaltet_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoehe_Fundamentoberkante_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obere_Lichtpunkthoehe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pzB_Schutzstrecke_Soll_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rahmen_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rahmen_Hoehe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangierstrasse_Restaufloesung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richtpunkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richtpunktentfernung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_BefestigungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_Befestigung_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_Befestigungsart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_Fank_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_Fiktiv_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_Fstr_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_Fstr_Aus_Inselgleis_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_Fstr_S_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_Funktion_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_RahmenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_Real_Aktiv_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_Real_Aktiv_Schirm_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_Real_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_SignalbegriffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signal_Signalbegriff_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalsicht_Erreichbar_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalsicht_Mindest_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalsicht_Soll_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalsystem_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sonstige_Zulaessige_Anordnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streuscheibe_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streuscheibe_Betriebsstellung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tunnelsignal_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zs2_Ueberwacht_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAnschaltdauerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAutoEinstellungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBefestigungArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBeleuchtetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumDurchfahrtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumFiktivesSignalFunktionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumFundamentArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumFunktionOhneSignalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumGeltungsbereichEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumRahmenArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSignalArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSignalBefestigungsartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSignalFunktionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSignalsystemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSonstigeZulaessigeAnordnungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumStreuscheibeArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumStreuscheibeBetriebsstellungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTunnelsignalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumAnschaltdauerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumAutoEinstellungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBefestigungArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBeleuchtetObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumDurchfahrtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumFiktivesSignalFunktionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumFundamentArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumFunktionOhneSignalObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumGeltungsbereichObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumRahmenArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSignalArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSignalBefestigungsartObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSignalFunktionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSignalsystemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSonstigeZulaessigeAnordnungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumStreuscheibeArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumStreuscheibeBetriebsstellungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumTunnelsignalObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hoehe_Fundamentoberkante_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType obere_Lichtpunkthoehe_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pzB_Schutzstrecke_Soll_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rahmen_Hoehe_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType richtpunkt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType richtpunktentfernung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signalsicht_Erreichbar_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signalsicht_Mindest_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signalsicht_Soll_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SignalePackageImpl() {
		super(eNS_URI, SignaleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SignalePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SignalePackage init() {
		if (isInited) return (SignalePackage)EPackage.Registry.INSTANCE.getEPackage(SignalePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSignalePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SignalePackageImpl theSignalePackage = registeredSignalePackage instanceof SignalePackageImpl ? (SignalePackageImpl)registeredSignalePackage : new SignalePackageImpl();

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
		theSignalePackage.createPackageContents();
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
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();
		theLayoutinformationenPackage.createPackageContents();

		// Initialize created meta-data
		theSignalePackage.initializePackageContents();
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
			(theSignalePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return SignaleValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSignalePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SignalePackage.eNS_URI, theSignalePackage);
		return theSignalePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnschaltdauer_TypeClass() {
		return anschaltdauer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschaltdauer_TypeClass_Wert() {
		return (EAttribute)anschaltdauer_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuto_Einstellung_TypeClass() {
		return auto_Einstellung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuto_Einstellung_TypeClass_Wert() {
		return (EAttribute)auto_Einstellung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBefestigung_Art_TypeClass() {
		return befestigung_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBefestigung_Art_TypeClass_Wert() {
		return (EAttribute)befestigung_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeleuchtet_TypeClass() {
		return beleuchtet_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeleuchtet_TypeClass_Wert() {
		return (EAttribute)beleuchtet_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBesetzte_Ausfahrt_TypeClass() {
		return besetzte_Ausfahrt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBesetzte_Ausfahrt_TypeClass_Wert() {
		return (EAttribute)besetzte_Ausfahrt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDA_Manuell_TypeClass() {
		return dA_Manuell_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDA_Manuell_TypeClass_Wert() {
		return (EAttribute)dA_Manuell_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDunkelschaltung_TypeClass() {
		return dunkelschaltung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDunkelschaltung_TypeClass_Wert() {
		return (EAttribute)dunkelschaltung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDurchfahrt_TypeClass() {
		return durchfahrt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDurchfahrt_TypeClass_Wert() {
		return (EAttribute)durchfahrt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFiktives_Signal_Funktion_TypeClass() {
		return fiktives_Signal_Funktion_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFiktives_Signal_Funktion_TypeClass_Wert() {
		return (EAttribute)fiktives_Signal_Funktion_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFundament_Art_TypeClass() {
		return fundament_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFundament_Art_TypeClass_Wert() {
		return (EAttribute)fundament_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunktion_Ohne_Signal_TypeClass() {
		return funktion_Ohne_Signal_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunktion_Ohne_Signal_TypeClass_Wert() {
		return (EAttribute)funktion_Ohne_Signal_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGegengleis_TypeClass() {
		return gegengleis_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGegengleis_TypeClass_Wert() {
		return (EAttribute)gegengleis_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeltungsbereich_TypeClass() {
		return geltungsbereich_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeltungsbereich_TypeClass_Wert() {
		return (EAttribute)geltungsbereich_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeschaltet_TypeClass() {
		return geschaltet_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeschaltet_TypeClass_Wert() {
		return (EAttribute)geschaltet_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHoehe_Fundamentoberkante_TypeClass() {
		return hoehe_Fundamentoberkante_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHoehe_Fundamentoberkante_TypeClass_Wert() {
		return (EAttribute)hoehe_Fundamentoberkante_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObere_Lichtpunkthoehe_TypeClass() {
		return obere_Lichtpunkthoehe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObere_Lichtpunkthoehe_TypeClass_Wert() {
		return (EAttribute)obere_Lichtpunkthoehe_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPZB_Schutzstrecke_Soll_TypeClass() {
		return pzB_Schutzstrecke_Soll_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPZB_Schutzstrecke_Soll_TypeClass_Wert() {
		return (EAttribute)pzB_Schutzstrecke_Soll_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRahmen_Art_TypeClass() {
		return rahmen_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRahmen_Art_TypeClass_Wert() {
		return (EAttribute)rahmen_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRahmen_Hoehe_TypeClass() {
		return rahmen_Hoehe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRahmen_Hoehe_TypeClass_Wert() {
		return (EAttribute)rahmen_Hoehe_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRangierstrasse_Restaufloesung_TypeClass() {
		return rangierstrasse_Restaufloesung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangierstrasse_Restaufloesung_TypeClass_Wert() {
		return (EAttribute)rangierstrasse_Restaufloesung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRichtpunkt_TypeClass() {
		return richtpunkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRichtpunkt_TypeClass_Wert() {
		return (EAttribute)richtpunkt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRichtpunktentfernung_TypeClass() {
		return richtpunktentfernung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRichtpunktentfernung_TypeClass_Wert() {
		return (EAttribute)richtpunktentfernung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Bezeichnung() {
		return (EReference)signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_PZBSchutzstreckeSoll() {
		return (EReference)signalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_SignalFstr() {
		return (EReference)signalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_SignalFstrAusInselgleis() {
		return (EReference)signalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_SignalFstrS() {
		return (EReference)signalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_SignalFiktiv() {
		return (EReference)signalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_SignalReal() {
		return (EReference)signalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Art_TypeClass() {
		return signal_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignal_Art_TypeClass_Wert() {
		return (EAttribute)signal_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Befestigung() {
		return signal_BefestigungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Befestigung_IDRegelzeichnung() {
		return (EReference)signal_BefestigungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Befestigung_SignalBefestigungAllg() {
		return (EReference)signal_BefestigungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Befestigung_IDBefestigungBauwerk() {
		return (EReference)signal_BefestigungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Befestigung_IDSignalBefestigung() {
		return (EReference)signal_BefestigungEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Befestigung_Allg_AttributeGroup() {
		return signal_Befestigung_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Befestigung_Allg_AttributeGroup_BefestigungArt() {
		return (EReference)signal_Befestigung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Befestigung_Allg_AttributeGroup_FundamentArt() {
		return (EReference)signal_Befestigung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Befestigung_Allg_AttributeGroup_HoeheFundamentoberkante() {
		return (EReference)signal_Befestigung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Befestigung_Allg_AttributeGroup_ObereLichtpunkthoehe() {
		return (EReference)signal_Befestigung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Befestigungsart_TypeClass() {
		return signal_Befestigungsart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignal_Befestigungsart_TypeClass_Wert() {
		return (EAttribute)signal_Befestigungsart_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Fank_Zuordnung() {
		return signal_Fank_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fank_Zuordnung_IDSignalFank() {
		return (EReference)signal_Fank_ZuordnungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fank_Zuordnung_IDSignalStart() {
		return (EReference)signal_Fank_ZuordnungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Fiktiv_AttributeGroup() {
		return signal_Fiktiv_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fiktiv_AttributeGroup_AutoEinstellung() {
		return (EReference)signal_Fiktiv_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fiktiv_AttributeGroup_FiktivesSignalFunktion() {
		return (EReference)signal_Fiktiv_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Fstr_AttributeGroup() {
		return signal_Fstr_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fstr_AttributeGroup_BesetzteAusfahrt() {
		return (EReference)signal_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fstr_AttributeGroup_DAManuell() {
		return (EReference)signal_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fstr_AttributeGroup_Durchfahrt() {
		return (EReference)signal_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fstr_AttributeGroup_IDRaZielErlaubnisabhaengig() {
		return (EReference)signal_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fstr_AttributeGroup_RangierstrasseRestaufloesung() {
		return (EReference)signal_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Fstr_Aus_Inselgleis_AttributeGroup() {
		return signal_Fstr_Aus_Inselgleis_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDRaFahrtGleichzeitigVerbot() {
		return (EReference)signal_Fstr_Aus_Inselgleis_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDZgFahrtGleichzeitigVerbot() {
		return (EReference)signal_Fstr_Aus_Inselgleis_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Fstr_S_AttributeGroup() {
		return signal_Fstr_S_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fstr_S_AttributeGroup_Gegengleis() {
		return (EReference)signal_Fstr_S_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fstr_S_AttributeGroup_IDAnrueckverschluss() {
		return (EReference)signal_Fstr_S_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Fstr_S_AttributeGroup_IDZweitesHaltfallkriterium() {
		return (EReference)signal_Fstr_S_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Funktion_TypeClass() {
		return signal_Funktion_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignal_Funktion_TypeClass_Wert() {
		return (EAttribute)signal_Funktion_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Rahmen() {
		return signal_RahmenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Rahmen_IDRegelzeichnung() {
		return (EReference)signal_RahmenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Rahmen_IDSignal() {
		return (EReference)signal_RahmenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Rahmen_IDSignalBefestigung() {
		return (EReference)signal_RahmenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Rahmen_IDSignalNachordnung() {
		return (EReference)signal_RahmenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Rahmen_RahmenArt() {
		return (EReference)signal_RahmenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Rahmen_RahmenHoehe() {
		return (EReference)signal_RahmenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Real_Aktiv_AttributeGroup() {
		return signal_Real_Aktiv_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_Aktiv_AttributeGroup_AutoEinstellung() {
		return (EReference)signal_Real_Aktiv_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_Aktiv_AttributeGroup_IDStellelement() {
		return (EReference)signal_Real_Aktiv_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_Aktiv_AttributeGroup_SonstigeZulaessigeAnordnung() {
		return (EReference)signal_Real_Aktiv_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_Aktiv_AttributeGroup_Tunnelsignal() {
		return (EReference)signal_Real_Aktiv_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Real_Aktiv_Schirm_AttributeGroup() {
		return signal_Real_Aktiv_Schirm_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunkt() {
		return (EReference)signal_Real_Aktiv_Schirm_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunktentfernung() {
		return (EReference)signal_Real_Aktiv_Schirm_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_Aktiv_Schirm_AttributeGroup_SignalArt() {
		return (EReference)signal_Real_Aktiv_Schirm_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_Aktiv_Schirm_AttributeGroup_Signalsystem() {
		return (EReference)signal_Real_Aktiv_Schirm_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeArt() {
		return (EReference)signal_Real_Aktiv_Schirm_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeBetriebsstellung() {
		return (EReference)signal_Real_Aktiv_Schirm_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Real_AttributeGroup() {
		return signal_Real_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_AttributeGroup_Dunkelschaltung() {
		return (EReference)signal_Real_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_AttributeGroup_FunktionOhneSignal() {
		return (EReference)signal_Real_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_AttributeGroup_Geltungsbereich() {
		return (EReference)signal_Real_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_AttributeGroup_SignalBefestigungsart() {
		return (EReference)signal_Real_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_AttributeGroup_SignalFunktion() {
		return (EReference)signal_Real_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_AttributeGroup_SignalRealAktiv() {
		return (EReference)signal_Real_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_AttributeGroup_SignalRealAktivSchirm() {
		return (EReference)signal_Real_AttributeGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_AttributeGroup_SignalsichtErreichbar() {
		return (EReference)signal_Real_AttributeGroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_AttributeGroup_SignalsichtMindest() {
		return (EReference)signal_Real_AttributeGroupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Real_AttributeGroup_SignalsichtSoll() {
		return (EReference)signal_Real_AttributeGroupEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Signalbegriff() {
		return signal_SignalbegriffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Signalbegriff_IDSignalRahmen() {
		return (EReference)signal_SignalbegriffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Signalbegriff_SignalSignalbegriffAllg() {
		return (EReference)signal_SignalbegriffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Signalbegriff_SignalbegriffID() {
		return (EReference)signal_SignalbegriffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal_Signalbegriff_Allg_AttributeGroup() {
		return signal_Signalbegriff_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Signalbegriff_Allg_AttributeGroup_Anschaltdauer() {
		return (EReference)signal_Signalbegriff_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Signalbegriff_Allg_AttributeGroup_Beleuchtet() {
		return (EReference)signal_Signalbegriff_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Signalbegriff_Allg_AttributeGroup_Geschaltet() {
		return (EReference)signal_Signalbegriff_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignal_Signalbegriff_Allg_AttributeGroup_Zs2Ueberwacht() {
		return (EReference)signal_Signalbegriff_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignalsicht_Erreichbar_TypeClass() {
		return signalsicht_Erreichbar_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalsicht_Erreichbar_TypeClass_Wert() {
		return (EAttribute)signalsicht_Erreichbar_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignalsicht_Mindest_TypeClass() {
		return signalsicht_Mindest_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalsicht_Mindest_TypeClass_Wert() {
		return (EAttribute)signalsicht_Mindest_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignalsicht_Soll_TypeClass() {
		return signalsicht_Soll_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalsicht_Soll_TypeClass_Wert() {
		return (EAttribute)signalsicht_Soll_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignalsystem_TypeClass() {
		return signalsystem_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalsystem_TypeClass_Wert() {
		return (EAttribute)signalsystem_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSonstige_Zulaessige_Anordnung_TypeClass() {
		return sonstige_Zulaessige_Anordnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstige_Zulaessige_Anordnung_TypeClass_Wert() {
		return (EAttribute)sonstige_Zulaessige_Anordnung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStreuscheibe_Art_TypeClass() {
		return streuscheibe_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStreuscheibe_Art_TypeClass_Wert() {
		return (EAttribute)streuscheibe_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStreuscheibe_Betriebsstellung_TypeClass() {
		return streuscheibe_Betriebsstellung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStreuscheibe_Betriebsstellung_TypeClass_Wert() {
		return (EAttribute)streuscheibe_Betriebsstellung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTunnelsignal_TypeClass() {
		return tunnelsignal_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTunnelsignal_TypeClass_Wert() {
		return (EAttribute)tunnelsignal_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZs2_Ueberwacht_TypeClass() {
		return zs2_Ueberwacht_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZs2_Ueberwacht_TypeClass_Wert() {
		return (EAttribute)zs2_Ueberwacht_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMAnschaltdauer() {
		return enumAnschaltdauerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMAutoEinstellung() {
		return enumAutoEinstellungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBefestigungArt() {
		return enumBefestigungArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBeleuchtet() {
		return enumBeleuchtetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMDurchfahrt() {
		return enumDurchfahrtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFiktivesSignalFunktion() {
		return enumFiktivesSignalFunktionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFundamentArt() {
		return enumFundamentArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFunktionOhneSignal() {
		return enumFunktionOhneSignalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGeltungsbereich() {
		return enumGeltungsbereichEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMRahmenArt() {
		return enumRahmenArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSignalArt() {
		return enumSignalArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSignalBefestigungsart() {
		return enumSignalBefestigungsartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSignalFunktion() {
		return enumSignalFunktionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSignalsystem() {
		return enumSignalsystemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSonstigeZulaessigeAnordnung() {
		return enumSonstigeZulaessigeAnordnungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMStreuscheibeArt() {
		return enumStreuscheibeArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMStreuscheibeBetriebsstellung() {
		return enumStreuscheibeBetriebsstellungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMTunnelsignal() {
		return enumTunnelsignalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMAnschaltdauerObject() {
		return enumAnschaltdauerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMAutoEinstellungObject() {
		return enumAutoEinstellungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBefestigungArtObject() {
		return enumBefestigungArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBeleuchtetObject() {
		return enumBeleuchtetObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMDurchfahrtObject() {
		return enumDurchfahrtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFiktivesSignalFunktionObject() {
		return enumFiktivesSignalFunktionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFundamentArtObject() {
		return enumFundamentArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFunktionOhneSignalObject() {
		return enumFunktionOhneSignalObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGeltungsbereichObject() {
		return enumGeltungsbereichObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMRahmenArtObject() {
		return enumRahmenArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSignalArtObject() {
		return enumSignalArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSignalBefestigungsartObject() {
		return enumSignalBefestigungsartObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSignalFunktionObject() {
		return enumSignalFunktionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSignalsystemObject() {
		return enumSignalsystemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSonstigeZulaessigeAnordnungObject() {
		return enumSonstigeZulaessigeAnordnungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMStreuscheibeArtObject() {
		return enumStreuscheibeArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMStreuscheibeBetriebsstellungObject() {
		return enumStreuscheibeBetriebsstellungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMTunnelsignalObject() {
		return enumTunnelsignalObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHoehe_Fundamentoberkante_Type() {
		return hoehe_Fundamentoberkante_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getObere_Lichtpunkthoehe_Type() {
		return obere_Lichtpunkthoehe_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPZB_Schutzstrecke_Soll_Type() {
		return pzB_Schutzstrecke_Soll_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRahmen_Hoehe_Type() {
		return rahmen_Hoehe_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRichtpunkt_Type() {
		return richtpunkt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRichtpunktentfernung_Type() {
		return richtpunktentfernung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSignalsicht_Erreichbar_Type() {
		return signalsicht_Erreichbar_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSignalsicht_Mindest_Type() {
		return signalsicht_Mindest_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSignalsicht_Soll_Type() {
		return signalsicht_Soll_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignaleFactory getSignaleFactory() {
		return (SignaleFactory)getEFactoryInstance();
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
		anschaltdauer_TypeClassEClass = createEClass(ANSCHALTDAUER_TYPE_CLASS);
		createEAttribute(anschaltdauer_TypeClassEClass, ANSCHALTDAUER_TYPE_CLASS__WERT);

		auto_Einstellung_TypeClassEClass = createEClass(AUTO_EINSTELLUNG_TYPE_CLASS);
		createEAttribute(auto_Einstellung_TypeClassEClass, AUTO_EINSTELLUNG_TYPE_CLASS__WERT);

		befestigung_Art_TypeClassEClass = createEClass(BEFESTIGUNG_ART_TYPE_CLASS);
		createEAttribute(befestigung_Art_TypeClassEClass, BEFESTIGUNG_ART_TYPE_CLASS__WERT);

		beleuchtet_TypeClassEClass = createEClass(BELEUCHTET_TYPE_CLASS);
		createEAttribute(beleuchtet_TypeClassEClass, BELEUCHTET_TYPE_CLASS__WERT);

		besetzte_Ausfahrt_TypeClassEClass = createEClass(BESETZTE_AUSFAHRT_TYPE_CLASS);
		createEAttribute(besetzte_Ausfahrt_TypeClassEClass, BESETZTE_AUSFAHRT_TYPE_CLASS__WERT);

		dA_Manuell_TypeClassEClass = createEClass(DA_MANUELL_TYPE_CLASS);
		createEAttribute(dA_Manuell_TypeClassEClass, DA_MANUELL_TYPE_CLASS__WERT);

		dunkelschaltung_TypeClassEClass = createEClass(DUNKELSCHALTUNG_TYPE_CLASS);
		createEAttribute(dunkelschaltung_TypeClassEClass, DUNKELSCHALTUNG_TYPE_CLASS__WERT);

		durchfahrt_TypeClassEClass = createEClass(DURCHFAHRT_TYPE_CLASS);
		createEAttribute(durchfahrt_TypeClassEClass, DURCHFAHRT_TYPE_CLASS__WERT);

		fiktives_Signal_Funktion_TypeClassEClass = createEClass(FIKTIVES_SIGNAL_FUNKTION_TYPE_CLASS);
		createEAttribute(fiktives_Signal_Funktion_TypeClassEClass, FIKTIVES_SIGNAL_FUNKTION_TYPE_CLASS__WERT);

		fundament_Art_TypeClassEClass = createEClass(FUNDAMENT_ART_TYPE_CLASS);
		createEAttribute(fundament_Art_TypeClassEClass, FUNDAMENT_ART_TYPE_CLASS__WERT);

		funktion_Ohne_Signal_TypeClassEClass = createEClass(FUNKTION_OHNE_SIGNAL_TYPE_CLASS);
		createEAttribute(funktion_Ohne_Signal_TypeClassEClass, FUNKTION_OHNE_SIGNAL_TYPE_CLASS__WERT);

		gegengleis_TypeClassEClass = createEClass(GEGENGLEIS_TYPE_CLASS);
		createEAttribute(gegengleis_TypeClassEClass, GEGENGLEIS_TYPE_CLASS__WERT);

		geltungsbereich_TypeClassEClass = createEClass(GELTUNGSBEREICH_TYPE_CLASS);
		createEAttribute(geltungsbereich_TypeClassEClass, GELTUNGSBEREICH_TYPE_CLASS__WERT);

		geschaltet_TypeClassEClass = createEClass(GESCHALTET_TYPE_CLASS);
		createEAttribute(geschaltet_TypeClassEClass, GESCHALTET_TYPE_CLASS__WERT);

		hoehe_Fundamentoberkante_TypeClassEClass = createEClass(HOEHE_FUNDAMENTOBERKANTE_TYPE_CLASS);
		createEAttribute(hoehe_Fundamentoberkante_TypeClassEClass, HOEHE_FUNDAMENTOBERKANTE_TYPE_CLASS__WERT);

		obere_Lichtpunkthoehe_TypeClassEClass = createEClass(OBERE_LICHTPUNKTHOEHE_TYPE_CLASS);
		createEAttribute(obere_Lichtpunkthoehe_TypeClassEClass, OBERE_LICHTPUNKTHOEHE_TYPE_CLASS__WERT);

		pzB_Schutzstrecke_Soll_TypeClassEClass = createEClass(PZB_SCHUTZSTRECKE_SOLL_TYPE_CLASS);
		createEAttribute(pzB_Schutzstrecke_Soll_TypeClassEClass, PZB_SCHUTZSTRECKE_SOLL_TYPE_CLASS__WERT);

		rahmen_Art_TypeClassEClass = createEClass(RAHMEN_ART_TYPE_CLASS);
		createEAttribute(rahmen_Art_TypeClassEClass, RAHMEN_ART_TYPE_CLASS__WERT);

		rahmen_Hoehe_TypeClassEClass = createEClass(RAHMEN_HOEHE_TYPE_CLASS);
		createEAttribute(rahmen_Hoehe_TypeClassEClass, RAHMEN_HOEHE_TYPE_CLASS__WERT);

		rangierstrasse_Restaufloesung_TypeClassEClass = createEClass(RANGIERSTRASSE_RESTAUFLOESUNG_TYPE_CLASS);
		createEAttribute(rangierstrasse_Restaufloesung_TypeClassEClass, RANGIERSTRASSE_RESTAUFLOESUNG_TYPE_CLASS__WERT);

		richtpunkt_TypeClassEClass = createEClass(RICHTPUNKT_TYPE_CLASS);
		createEAttribute(richtpunkt_TypeClassEClass, RICHTPUNKT_TYPE_CLASS__WERT);

		richtpunktentfernung_TypeClassEClass = createEClass(RICHTPUNKTENTFERNUNG_TYPE_CLASS);
		createEAttribute(richtpunktentfernung_TypeClassEClass, RICHTPUNKTENTFERNUNG_TYPE_CLASS__WERT);

		signalEClass = createEClass(SIGNAL);
		createEReference(signalEClass, SIGNAL__BEZEICHNUNG);
		createEReference(signalEClass, SIGNAL__PZB_SCHUTZSTRECKE_SOLL);
		createEReference(signalEClass, SIGNAL__SIGNAL_FSTR);
		createEReference(signalEClass, SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS);
		createEReference(signalEClass, SIGNAL__SIGNAL_FSTR_S);
		createEReference(signalEClass, SIGNAL__SIGNAL_FIKTIV);
		createEReference(signalEClass, SIGNAL__SIGNAL_REAL);

		signal_Art_TypeClassEClass = createEClass(SIGNAL_ART_TYPE_CLASS);
		createEAttribute(signal_Art_TypeClassEClass, SIGNAL_ART_TYPE_CLASS__WERT);

		signal_BefestigungEClass = createEClass(SIGNAL_BEFESTIGUNG);
		createEReference(signal_BefestigungEClass, SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG);
		createEReference(signal_BefestigungEClass, SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG);
		createEReference(signal_BefestigungEClass, SIGNAL_BEFESTIGUNG__ID_BEFESTIGUNG_BAUWERK);
		createEReference(signal_BefestigungEClass, SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG);

		signal_Befestigung_Allg_AttributeGroupEClass = createEClass(SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP);
		createEReference(signal_Befestigung_Allg_AttributeGroupEClass, SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__BEFESTIGUNG_ART);
		createEReference(signal_Befestigung_Allg_AttributeGroupEClass, SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__FUNDAMENT_ART);
		createEReference(signal_Befestigung_Allg_AttributeGroupEClass, SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__HOEHE_FUNDAMENTOBERKANTE);
		createEReference(signal_Befestigung_Allg_AttributeGroupEClass, SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__OBERE_LICHTPUNKTHOEHE);

		signal_Befestigungsart_TypeClassEClass = createEClass(SIGNAL_BEFESTIGUNGSART_TYPE_CLASS);
		createEAttribute(signal_Befestigungsart_TypeClassEClass, SIGNAL_BEFESTIGUNGSART_TYPE_CLASS__WERT);

		signal_Fank_ZuordnungEClass = createEClass(SIGNAL_FANK_ZUORDNUNG);
		createEReference(signal_Fank_ZuordnungEClass, SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK);
		createEReference(signal_Fank_ZuordnungEClass, SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START);

		signal_Fiktiv_AttributeGroupEClass = createEClass(SIGNAL_FIKTIV_ATTRIBUTE_GROUP);
		createEReference(signal_Fiktiv_AttributeGroupEClass, SIGNAL_FIKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG);
		createEReference(signal_Fiktiv_AttributeGroupEClass, SIGNAL_FIKTIV_ATTRIBUTE_GROUP__FIKTIVES_SIGNAL_FUNKTION);

		signal_Fstr_AttributeGroupEClass = createEClass(SIGNAL_FSTR_ATTRIBUTE_GROUP);
		createEReference(signal_Fstr_AttributeGroupEClass, SIGNAL_FSTR_ATTRIBUTE_GROUP__BESETZTE_AUSFAHRT);
		createEReference(signal_Fstr_AttributeGroupEClass, SIGNAL_FSTR_ATTRIBUTE_GROUP__DA_MANUELL);
		createEReference(signal_Fstr_AttributeGroupEClass, SIGNAL_FSTR_ATTRIBUTE_GROUP__DURCHFAHRT);
		createEReference(signal_Fstr_AttributeGroupEClass, SIGNAL_FSTR_ATTRIBUTE_GROUP__ID_RA_ZIEL_ERLAUBNISABHAENGIG);
		createEReference(signal_Fstr_AttributeGroupEClass, SIGNAL_FSTR_ATTRIBUTE_GROUP__RANGIERSTRASSE_RESTAUFLOESUNG);

		signal_Fstr_Aus_Inselgleis_AttributeGroupEClass = createEClass(SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP);
		createEReference(signal_Fstr_Aus_Inselgleis_AttributeGroupEClass, SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT);
		createEReference(signal_Fstr_Aus_Inselgleis_AttributeGroupEClass, SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT);

		signal_Fstr_S_AttributeGroupEClass = createEClass(SIGNAL_FSTR_SATTRIBUTE_GROUP);
		createEReference(signal_Fstr_S_AttributeGroupEClass, SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS);
		createEReference(signal_Fstr_S_AttributeGroupEClass, SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS);
		createEReference(signal_Fstr_S_AttributeGroupEClass, SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM);

		signal_Funktion_TypeClassEClass = createEClass(SIGNAL_FUNKTION_TYPE_CLASS);
		createEAttribute(signal_Funktion_TypeClassEClass, SIGNAL_FUNKTION_TYPE_CLASS__WERT);

		signal_RahmenEClass = createEClass(SIGNAL_RAHMEN);
		createEReference(signal_RahmenEClass, SIGNAL_RAHMEN__ID_REGELZEICHNUNG);
		createEReference(signal_RahmenEClass, SIGNAL_RAHMEN__ID_SIGNAL);
		createEReference(signal_RahmenEClass, SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG);
		createEReference(signal_RahmenEClass, SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG);
		createEReference(signal_RahmenEClass, SIGNAL_RAHMEN__RAHMEN_ART);
		createEReference(signal_RahmenEClass, SIGNAL_RAHMEN__RAHMEN_HOEHE);

		signal_Real_Aktiv_AttributeGroupEClass = createEClass(SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP);
		createEReference(signal_Real_Aktiv_AttributeGroupEClass, SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG);
		createEReference(signal_Real_Aktiv_AttributeGroupEClass, SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__ID_STELLELEMENT);
		createEReference(signal_Real_Aktiv_AttributeGroupEClass, SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SONSTIGE_ZULAESSIGE_ANORDNUNG);
		createEReference(signal_Real_Aktiv_AttributeGroupEClass, SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__TUNNELSIGNAL);

		signal_Real_Aktiv_Schirm_AttributeGroupEClass = createEClass(SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP);
		createEReference(signal_Real_Aktiv_Schirm_AttributeGroupEClass, SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKT);
		createEReference(signal_Real_Aktiv_Schirm_AttributeGroupEClass, SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKTENTFERNUNG);
		createEReference(signal_Real_Aktiv_Schirm_AttributeGroupEClass, SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNAL_ART);
		createEReference(signal_Real_Aktiv_Schirm_AttributeGroupEClass, SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNALSYSTEM);
		createEReference(signal_Real_Aktiv_Schirm_AttributeGroupEClass, SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_ART);
		createEReference(signal_Real_Aktiv_Schirm_AttributeGroupEClass, SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_BETRIEBSSTELLUNG);

		signal_Real_AttributeGroupEClass = createEClass(SIGNAL_REAL_ATTRIBUTE_GROUP);
		createEReference(signal_Real_AttributeGroupEClass, SIGNAL_REAL_ATTRIBUTE_GROUP__DUNKELSCHALTUNG);
		createEReference(signal_Real_AttributeGroupEClass, SIGNAL_REAL_ATTRIBUTE_GROUP__FUNKTION_OHNE_SIGNAL);
		createEReference(signal_Real_AttributeGroupEClass, SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH);
		createEReference(signal_Real_AttributeGroupEClass, SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART);
		createEReference(signal_Real_AttributeGroupEClass, SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_FUNKTION);
		createEReference(signal_Real_AttributeGroupEClass, SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV);
		createEReference(signal_Real_AttributeGroupEClass, SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM);
		createEReference(signal_Real_AttributeGroupEClass, SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR);
		createEReference(signal_Real_AttributeGroupEClass, SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST);
		createEReference(signal_Real_AttributeGroupEClass, SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL);

		signal_SignalbegriffEClass = createEClass(SIGNAL_SIGNALBEGRIFF);
		createEReference(signal_SignalbegriffEClass, SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN);
		createEReference(signal_SignalbegriffEClass, SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG);
		createEReference(signal_SignalbegriffEClass, SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID);

		signal_Signalbegriff_Allg_AttributeGroupEClass = createEClass(SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP);
		createEReference(signal_Signalbegriff_Allg_AttributeGroupEClass, SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ANSCHALTDAUER);
		createEReference(signal_Signalbegriff_Allg_AttributeGroupEClass, SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__BELEUCHTET);
		createEReference(signal_Signalbegriff_Allg_AttributeGroupEClass, SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__GESCHALTET);
		createEReference(signal_Signalbegriff_Allg_AttributeGroupEClass, SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ZS2_UEBERWACHT);

		signalsicht_Erreichbar_TypeClassEClass = createEClass(SIGNALSICHT_ERREICHBAR_TYPE_CLASS);
		createEAttribute(signalsicht_Erreichbar_TypeClassEClass, SIGNALSICHT_ERREICHBAR_TYPE_CLASS__WERT);

		signalsicht_Mindest_TypeClassEClass = createEClass(SIGNALSICHT_MINDEST_TYPE_CLASS);
		createEAttribute(signalsicht_Mindest_TypeClassEClass, SIGNALSICHT_MINDEST_TYPE_CLASS__WERT);

		signalsicht_Soll_TypeClassEClass = createEClass(SIGNALSICHT_SOLL_TYPE_CLASS);
		createEAttribute(signalsicht_Soll_TypeClassEClass, SIGNALSICHT_SOLL_TYPE_CLASS__WERT);

		signalsystem_TypeClassEClass = createEClass(SIGNALSYSTEM_TYPE_CLASS);
		createEAttribute(signalsystem_TypeClassEClass, SIGNALSYSTEM_TYPE_CLASS__WERT);

		sonstige_Zulaessige_Anordnung_TypeClassEClass = createEClass(SONSTIGE_ZULAESSIGE_ANORDNUNG_TYPE_CLASS);
		createEAttribute(sonstige_Zulaessige_Anordnung_TypeClassEClass, SONSTIGE_ZULAESSIGE_ANORDNUNG_TYPE_CLASS__WERT);

		streuscheibe_Art_TypeClassEClass = createEClass(STREUSCHEIBE_ART_TYPE_CLASS);
		createEAttribute(streuscheibe_Art_TypeClassEClass, STREUSCHEIBE_ART_TYPE_CLASS__WERT);

		streuscheibe_Betriebsstellung_TypeClassEClass = createEClass(STREUSCHEIBE_BETRIEBSSTELLUNG_TYPE_CLASS);
		createEAttribute(streuscheibe_Betriebsstellung_TypeClassEClass, STREUSCHEIBE_BETRIEBSSTELLUNG_TYPE_CLASS__WERT);

		tunnelsignal_TypeClassEClass = createEClass(TUNNELSIGNAL_TYPE_CLASS);
		createEAttribute(tunnelsignal_TypeClassEClass, TUNNELSIGNAL_TYPE_CLASS__WERT);

		zs2_Ueberwacht_TypeClassEClass = createEClass(ZS2_UEBERWACHT_TYPE_CLASS);
		createEAttribute(zs2_Ueberwacht_TypeClassEClass, ZS2_UEBERWACHT_TYPE_CLASS__WERT);

		// Create enums
		enumAnschaltdauerEEnum = createEEnum(ENUM_ANSCHALTDAUER);
		enumAutoEinstellungEEnum = createEEnum(ENUM_AUTO_EINSTELLUNG);
		enumBefestigungArtEEnum = createEEnum(ENUM_BEFESTIGUNG_ART);
		enumBeleuchtetEEnum = createEEnum(ENUM_BELEUCHTET);
		enumDurchfahrtEEnum = createEEnum(ENUM_DURCHFAHRT);
		enumFiktivesSignalFunktionEEnum = createEEnum(ENUM_FIKTIVES_SIGNAL_FUNKTION);
		enumFundamentArtEEnum = createEEnum(ENUM_FUNDAMENT_ART);
		enumFunktionOhneSignalEEnum = createEEnum(ENUM_FUNKTION_OHNE_SIGNAL);
		enumGeltungsbereichEEnum = createEEnum(ENUM_GELTUNGSBEREICH);
		enumRahmenArtEEnum = createEEnum(ENUM_RAHMEN_ART);
		enumSignalArtEEnum = createEEnum(ENUM_SIGNAL_ART);
		enumSignalBefestigungsartEEnum = createEEnum(ENUM_SIGNAL_BEFESTIGUNGSART);
		enumSignalFunktionEEnum = createEEnum(ENUM_SIGNAL_FUNKTION);
		enumSignalsystemEEnum = createEEnum(ENUM_SIGNALSYSTEM);
		enumSonstigeZulaessigeAnordnungEEnum = createEEnum(ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG);
		enumStreuscheibeArtEEnum = createEEnum(ENUM_STREUSCHEIBE_ART);
		enumStreuscheibeBetriebsstellungEEnum = createEEnum(ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG);
		enumTunnelsignalEEnum = createEEnum(ENUM_TUNNELSIGNAL);

		// Create data types
		enumAnschaltdauerObjectEDataType = createEDataType(ENUM_ANSCHALTDAUER_OBJECT);
		enumAutoEinstellungObjectEDataType = createEDataType(ENUM_AUTO_EINSTELLUNG_OBJECT);
		enumBefestigungArtObjectEDataType = createEDataType(ENUM_BEFESTIGUNG_ART_OBJECT);
		enumBeleuchtetObjectEDataType = createEDataType(ENUM_BELEUCHTET_OBJECT);
		enumDurchfahrtObjectEDataType = createEDataType(ENUM_DURCHFAHRT_OBJECT);
		enumFiktivesSignalFunktionObjectEDataType = createEDataType(ENUM_FIKTIVES_SIGNAL_FUNKTION_OBJECT);
		enumFundamentArtObjectEDataType = createEDataType(ENUM_FUNDAMENT_ART_OBJECT);
		enumFunktionOhneSignalObjectEDataType = createEDataType(ENUM_FUNKTION_OHNE_SIGNAL_OBJECT);
		enumGeltungsbereichObjectEDataType = createEDataType(ENUM_GELTUNGSBEREICH_OBJECT);
		enumRahmenArtObjectEDataType = createEDataType(ENUM_RAHMEN_ART_OBJECT);
		enumSignalArtObjectEDataType = createEDataType(ENUM_SIGNAL_ART_OBJECT);
		enumSignalBefestigungsartObjectEDataType = createEDataType(ENUM_SIGNAL_BEFESTIGUNGSART_OBJECT);
		enumSignalFunktionObjectEDataType = createEDataType(ENUM_SIGNAL_FUNKTION_OBJECT);
		enumSignalsystemObjectEDataType = createEDataType(ENUM_SIGNALSYSTEM_OBJECT);
		enumSonstigeZulaessigeAnordnungObjectEDataType = createEDataType(ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG_OBJECT);
		enumStreuscheibeArtObjectEDataType = createEDataType(ENUM_STREUSCHEIBE_ART_OBJECT);
		enumStreuscheibeBetriebsstellungObjectEDataType = createEDataType(ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_OBJECT);
		enumTunnelsignalObjectEDataType = createEDataType(ENUM_TUNNELSIGNAL_OBJECT);
		hoehe_Fundamentoberkante_TypeEDataType = createEDataType(HOEHE_FUNDAMENTOBERKANTE_TYPE);
		obere_Lichtpunkthoehe_TypeEDataType = createEDataType(OBERE_LICHTPUNKTHOEHE_TYPE);
		pzB_Schutzstrecke_Soll_TypeEDataType = createEDataType(PZB_SCHUTZSTRECKE_SOLL_TYPE);
		rahmen_Hoehe_TypeEDataType = createEDataType(RAHMEN_HOEHE_TYPE);
		richtpunkt_TypeEDataType = createEDataType(RICHTPUNKT_TYPE);
		richtpunktentfernung_TypeEDataType = createEDataType(RICHTPUNKTENTFERNUNG_TYPE);
		signalsicht_Erreichbar_TypeEDataType = createEDataType(SIGNALSICHT_ERREICHBAR_TYPE);
		signalsicht_Mindest_TypeEDataType = createEDataType(SIGNALSICHT_MINDEST_TYPE);
		signalsicht_Soll_TypeEDataType = createEDataType(SIGNALSICHT_SOLL_TYPE);
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
		Signalbegriffe_StrukturPackage theSignalbegriffe_StrukturPackage = (Signalbegriffe_StrukturPackage)EPackage.Registry.INSTANCE.getEPackage(Signalbegriffe_StrukturPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		anschaltdauer_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		auto_Einstellung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		befestigung_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		beleuchtet_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		besetzte_Ausfahrt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		dA_Manuell_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		dunkelschaltung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		durchfahrt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fiktives_Signal_Funktion_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fundament_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		funktion_Ohne_Signal_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		gegengleis_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geltungsbereich_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geschaltet_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		hoehe_Fundamentoberkante_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		obere_Lichtpunkthoehe_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		pzB_Schutzstrecke_Soll_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		rahmen_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		rahmen_Hoehe_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		rangierstrasse_Restaufloesung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		richtpunkt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		richtpunktentfernung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		signalEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		signal_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		signal_BefestigungEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		signal_Befestigungsart_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		signal_Fank_ZuordnungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		signal_Funktion_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		signal_RahmenEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		signal_SignalbegriffEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		signalsicht_Erreichbar_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		signalsicht_Mindest_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		signalsicht_Soll_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		signalsystem_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		sonstige_Zulaessige_Anordnung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		streuscheibe_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		streuscheibe_Betriebsstellung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		tunnelsignal_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zs2_Ueberwacht_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(anschaltdauer_TypeClassEClass, Anschaltdauer_TypeClass.class, "Anschaltdauer_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnschaltdauer_TypeClass_Wert(), this.getENUMAnschaltdauerObject(), "wert", null, 1, 1, Anschaltdauer_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auto_Einstellung_TypeClassEClass, Auto_Einstellung_TypeClass.class, "Auto_Einstellung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuto_Einstellung_TypeClass_Wert(), this.getENUMAutoEinstellungObject(), "wert", null, 1, 1, Auto_Einstellung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(befestigung_Art_TypeClassEClass, Befestigung_Art_TypeClass.class, "Befestigung_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBefestigung_Art_TypeClass_Wert(), this.getENUMBefestigungArtObject(), "wert", null, 1, 1, Befestigung_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beleuchtet_TypeClassEClass, Beleuchtet_TypeClass.class, "Beleuchtet_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBeleuchtet_TypeClass_Wert(), this.getENUMBeleuchtetObject(), "wert", null, 1, 1, Beleuchtet_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(besetzte_Ausfahrt_TypeClassEClass, Besetzte_Ausfahrt_TypeClass.class, "Besetzte_Ausfahrt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBesetzte_Ausfahrt_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Besetzte_Ausfahrt_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dA_Manuell_TypeClassEClass, DA_Manuell_TypeClass.class, "DA_Manuell_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDA_Manuell_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, DA_Manuell_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dunkelschaltung_TypeClassEClass, Dunkelschaltung_TypeClass.class, "Dunkelschaltung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDunkelschaltung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Dunkelschaltung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durchfahrt_TypeClassEClass, Durchfahrt_TypeClass.class, "Durchfahrt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDurchfahrt_TypeClass_Wert(), this.getENUMDurchfahrtObject(), "wert", null, 1, 1, Durchfahrt_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fiktives_Signal_Funktion_TypeClassEClass, Fiktives_Signal_Funktion_TypeClass.class, "Fiktives_Signal_Funktion_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFiktives_Signal_Funktion_TypeClass_Wert(), this.getENUMFiktivesSignalFunktionObject(), "wert", null, 1, 1, Fiktives_Signal_Funktion_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fundament_Art_TypeClassEClass, Fundament_Art_TypeClass.class, "Fundament_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFundament_Art_TypeClass_Wert(), this.getENUMFundamentArtObject(), "wert", null, 1, 1, Fundament_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funktion_Ohne_Signal_TypeClassEClass, Funktion_Ohne_Signal_TypeClass.class, "Funktion_Ohne_Signal_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunktion_Ohne_Signal_TypeClass_Wert(), this.getENUMFunktionOhneSignalObject(), "wert", null, 1, 1, Funktion_Ohne_Signal_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gegengleis_TypeClassEClass, Gegengleis_TypeClass.class, "Gegengleis_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGegengleis_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Gegengleis_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geltungsbereich_TypeClassEClass, Geltungsbereich_TypeClass.class, "Geltungsbereich_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeltungsbereich_TypeClass_Wert(), this.getENUMGeltungsbereichObject(), "wert", null, 1, 1, Geltungsbereich_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geschaltet_TypeClassEClass, Geschaltet_TypeClass.class, "Geschaltet_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeschaltet_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Geschaltet_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hoehe_Fundamentoberkante_TypeClassEClass, Hoehe_Fundamentoberkante_TypeClass.class, "Hoehe_Fundamentoberkante_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHoehe_Fundamentoberkante_TypeClass_Wert(), this.getHoehe_Fundamentoberkante_Type(), "wert", null, 1, 1, Hoehe_Fundamentoberkante_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(obere_Lichtpunkthoehe_TypeClassEClass, Obere_Lichtpunkthoehe_TypeClass.class, "Obere_Lichtpunkthoehe_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObere_Lichtpunkthoehe_TypeClass_Wert(), this.getObere_Lichtpunkthoehe_Type(), "wert", null, 1, 1, Obere_Lichtpunkthoehe_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pzB_Schutzstrecke_Soll_TypeClassEClass, PZB_Schutzstrecke_Soll_TypeClass.class, "PZB_Schutzstrecke_Soll_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPZB_Schutzstrecke_Soll_TypeClass_Wert(), this.getPZB_Schutzstrecke_Soll_Type(), "wert", null, 1, 1, PZB_Schutzstrecke_Soll_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rahmen_Art_TypeClassEClass, Rahmen_Art_TypeClass.class, "Rahmen_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRahmen_Art_TypeClass_Wert(), this.getENUMRahmenArtObject(), "wert", null, 1, 1, Rahmen_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rahmen_Hoehe_TypeClassEClass, Rahmen_Hoehe_TypeClass.class, "Rahmen_Hoehe_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRahmen_Hoehe_TypeClass_Wert(), this.getRahmen_Hoehe_Type(), "wert", null, 1, 1, Rahmen_Hoehe_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangierstrasse_Restaufloesung_TypeClassEClass, Rangierstrasse_Restaufloesung_TypeClass.class, "Rangierstrasse_Restaufloesung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangierstrasse_Restaufloesung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Rangierstrasse_Restaufloesung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richtpunkt_TypeClassEClass, Richtpunkt_TypeClass.class, "Richtpunkt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichtpunkt_TypeClass_Wert(), this.getRichtpunkt_Type(), "wert", null, 1, 1, Richtpunkt_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richtpunktentfernung_TypeClassEClass, Richtpunktentfernung_TypeClass.class, "Richtpunktentfernung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichtpunktentfernung_TypeClass_Wert(), this.getRichtpunktentfernung_Type(), "wert", null, 1, 1, Richtpunktentfernung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Bezeichnung(), theBasisTypenPackage.getBezeichnung_Element_AttributeGroup(), null, "bezeichnung", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_PZBSchutzstreckeSoll(), this.getPZB_Schutzstrecke_Soll_TypeClass(), null, "pZBSchutzstreckeSoll", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_SignalFstr(), this.getSignal_Fstr_AttributeGroup(), null, "signalFstr", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_SignalFstrAusInselgleis(), this.getSignal_Fstr_Aus_Inselgleis_AttributeGroup(), null, "signalFstrAusInselgleis", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_SignalFstrS(), this.getSignal_Fstr_S_AttributeGroup(), null, "signalFstrS", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_SignalFiktiv(), this.getSignal_Fiktiv_AttributeGroup(), null, "signalFiktiv", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_SignalReal(), this.getSignal_Real_AttributeGroup(), null, "signalReal", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_Art_TypeClassEClass, Signal_Art_TypeClass.class, "Signal_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignal_Art_TypeClass_Wert(), this.getENUMSignalArtObject(), "wert", null, 1, 1, Signal_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_BefestigungEClass, Signal_Befestigung.class, "Signal_Befestigung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Befestigung_IDRegelzeichnung(), theVerweisePackage.getID_Regelzeichnung_TypeClass(), null, "iDRegelzeichnung", null, 0, -1, Signal_Befestigung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Befestigung_SignalBefestigungAllg(), this.getSignal_Befestigung_Allg_AttributeGroup(), null, "signalBefestigungAllg", null, 1, 1, Signal_Befestigung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Befestigung_IDBefestigungBauwerk(), theVerweisePackage.getID_Befestigung_Bauwerk_TypeClass(), null, "iDBefestigungBauwerk", null, 0, 1, Signal_Befestigung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Befestigung_IDSignalBefestigung(), theVerweisePackage.getID_Signal_Befestigung_TypeClass(), null, "iDSignalBefestigung", null, 0, 1, Signal_Befestigung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_Befestigung_Allg_AttributeGroupEClass, Signal_Befestigung_Allg_AttributeGroup.class, "Signal_Befestigung_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Befestigung_Allg_AttributeGroup_BefestigungArt(), this.getBefestigung_Art_TypeClass(), null, "befestigungArt", null, 1, 1, Signal_Befestigung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Befestigung_Allg_AttributeGroup_FundamentArt(), this.getFundament_Art_TypeClass(), null, "fundamentArt", null, 0, 1, Signal_Befestigung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Befestigung_Allg_AttributeGroup_HoeheFundamentoberkante(), this.getHoehe_Fundamentoberkante_TypeClass(), null, "hoeheFundamentoberkante", null, 0, 1, Signal_Befestigung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Befestigung_Allg_AttributeGroup_ObereLichtpunkthoehe(), this.getObere_Lichtpunkthoehe_TypeClass(), null, "obereLichtpunkthoehe", null, 0, 1, Signal_Befestigung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_Befestigungsart_TypeClassEClass, Signal_Befestigungsart_TypeClass.class, "Signal_Befestigungsart_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignal_Befestigungsart_TypeClass_Wert(), this.getENUMSignalBefestigungsartObject(), "wert", null, 1, 1, Signal_Befestigungsart_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_Fank_ZuordnungEClass, Signal_Fank_Zuordnung.class, "Signal_Fank_Zuordnung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Fank_Zuordnung_IDSignalFank(), theVerweisePackage.getID_Signal_Fank_TypeClass(), null, "iDSignalFank", null, 0, -1, Signal_Fank_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Fank_Zuordnung_IDSignalStart(), theVerweisePackage.getID_Signal_Start_TypeClass(), null, "iDSignalStart", null, 1, -1, Signal_Fank_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_Fiktiv_AttributeGroupEClass, Signal_Fiktiv_AttributeGroup.class, "Signal_Fiktiv_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Fiktiv_AttributeGroup_AutoEinstellung(), this.getAuto_Einstellung_TypeClass(), null, "autoEinstellung", null, 0, 1, Signal_Fiktiv_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Fiktiv_AttributeGroup_FiktivesSignalFunktion(), this.getFiktives_Signal_Funktion_TypeClass(), null, "fiktivesSignalFunktion", null, 1, -1, Signal_Fiktiv_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_Fstr_AttributeGroupEClass, Signal_Fstr_AttributeGroup.class, "Signal_Fstr_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Fstr_AttributeGroup_BesetzteAusfahrt(), this.getBesetzte_Ausfahrt_TypeClass(), null, "besetzteAusfahrt", null, 0, 1, Signal_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Fstr_AttributeGroup_DAManuell(), this.getDA_Manuell_TypeClass(), null, "dAManuell", null, 0, 1, Signal_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Fstr_AttributeGroup_Durchfahrt(), this.getDurchfahrt_TypeClass(), null, "durchfahrt", null, 0, 1, Signal_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Fstr_AttributeGroup_IDRaZielErlaubnisabhaengig(), theVerweisePackage.getID_Block_Element_TypeClass(), null, "iDRaZielErlaubnisabhaengig", null, 0, 1, Signal_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Fstr_AttributeGroup_RangierstrasseRestaufloesung(), this.getRangierstrasse_Restaufloesung_TypeClass(), null, "rangierstrasseRestaufloesung", null, 0, 1, Signal_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_Fstr_Aus_Inselgleis_AttributeGroupEClass, Signal_Fstr_Aus_Inselgleis_AttributeGroup.class, "Signal_Fstr_Aus_Inselgleis_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDRaFahrtGleichzeitigVerbot(), theVerweisePackage.getID_Signal_Gleisbezechnung_TypeClass(), null, "iDRaFahrtGleichzeitigVerbot", null, 0, -1, Signal_Fstr_Aus_Inselgleis_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDZgFahrtGleichzeitigVerbot(), theVerweisePackage.getID_Signal_Gleisbezechnung_TypeClass(), null, "iDZgFahrtGleichzeitigVerbot", null, 0, -1, Signal_Fstr_Aus_Inselgleis_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_Fstr_S_AttributeGroupEClass, Signal_Fstr_S_AttributeGroup.class, "Signal_Fstr_S_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Fstr_S_AttributeGroup_Gegengleis(), this.getGegengleis_TypeClass(), null, "gegengleis", null, 0, 1, Signal_Fstr_S_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Fstr_S_AttributeGroup_IDAnrueckverschluss(), theVerweisePackage.getID_Schaltmittel_Zuordnung_TypeClass(), null, "iDAnrueckverschluss", null, 0, -1, Signal_Fstr_S_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Fstr_S_AttributeGroup_IDZweitesHaltfallkriterium(), theVerweisePackage.getID_Zweites_Haltfallkriterium_TypeClass(), null, "iDZweitesHaltfallkriterium", null, 0, 1, Signal_Fstr_S_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_Funktion_TypeClassEClass, Signal_Funktion_TypeClass.class, "Signal_Funktion_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignal_Funktion_TypeClass_Wert(), this.getENUMSignalFunktionObject(), "wert", null, 1, 1, Signal_Funktion_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_RahmenEClass, Signal_Rahmen.class, "Signal_Rahmen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Rahmen_IDRegelzeichnung(), theVerweisePackage.getID_Regelzeichnung_ohne_Proxy_TypeClass(), null, "iDRegelzeichnung", null, 0, 1, Signal_Rahmen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Rahmen_IDSignal(), theVerweisePackage.getID_Signal_TypeClass(), null, "iDSignal", null, 1, 1, Signal_Rahmen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Rahmen_IDSignalBefestigung(), theVerweisePackage.getID_Signal_Befestigung_TypeClass(), null, "iDSignalBefestigung", null, 0, 1, Signal_Rahmen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Rahmen_IDSignalNachordnung(), theVerweisePackage.getID_Signal_TypeClass(), null, "iDSignalNachordnung", null, 0, 1, Signal_Rahmen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Rahmen_RahmenArt(), this.getRahmen_Art_TypeClass(), null, "rahmenArt", null, 1, 1, Signal_Rahmen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Rahmen_RahmenHoehe(), this.getRahmen_Hoehe_TypeClass(), null, "rahmenHoehe", null, 0, 1, Signal_Rahmen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_Real_Aktiv_AttributeGroupEClass, Signal_Real_Aktiv_AttributeGroup.class, "Signal_Real_Aktiv_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Real_Aktiv_AttributeGroup_AutoEinstellung(), this.getAuto_Einstellung_TypeClass(), null, "autoEinstellung", null, 0, 1, Signal_Real_Aktiv_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_Aktiv_AttributeGroup_IDStellelement(), theVerweisePackage.getID_Stellelement_TypeClass(), null, "iDStellelement", null, 1, 1, Signal_Real_Aktiv_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_Aktiv_AttributeGroup_SonstigeZulaessigeAnordnung(), this.getSonstige_Zulaessige_Anordnung_TypeClass(), null, "sonstigeZulaessigeAnordnung", null, 0, 1, Signal_Real_Aktiv_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_Aktiv_AttributeGroup_Tunnelsignal(), this.getTunnelsignal_TypeClass(), null, "tunnelsignal", null, 0, 1, Signal_Real_Aktiv_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_Real_Aktiv_Schirm_AttributeGroupEClass, Signal_Real_Aktiv_Schirm_AttributeGroup.class, "Signal_Real_Aktiv_Schirm_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunkt(), this.getRichtpunkt_TypeClass(), null, "richtpunkt", null, 0, 1, Signal_Real_Aktiv_Schirm_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunktentfernung(), this.getRichtpunktentfernung_TypeClass(), null, "richtpunktentfernung", null, 1, 1, Signal_Real_Aktiv_Schirm_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_Aktiv_Schirm_AttributeGroup_SignalArt(), this.getSignal_Art_TypeClass(), null, "signalArt", null, 1, 1, Signal_Real_Aktiv_Schirm_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_Aktiv_Schirm_AttributeGroup_Signalsystem(), this.getSignalsystem_TypeClass(), null, "signalsystem", null, 1, 1, Signal_Real_Aktiv_Schirm_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeArt(), this.getStreuscheibe_Art_TypeClass(), null, "streuscheibeArt", null, 0, 1, Signal_Real_Aktiv_Schirm_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeBetriebsstellung(), this.getStreuscheibe_Betriebsstellung_TypeClass(), null, "streuscheibeBetriebsstellung", null, 0, 1, Signal_Real_Aktiv_Schirm_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_Real_AttributeGroupEClass, Signal_Real_AttributeGroup.class, "Signal_Real_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Real_AttributeGroup_Dunkelschaltung(), this.getDunkelschaltung_TypeClass(), null, "dunkelschaltung", null, 0, 1, Signal_Real_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_AttributeGroup_FunktionOhneSignal(), this.getFunktion_Ohne_Signal_TypeClass(), null, "funktionOhneSignal", null, 0, 1, Signal_Real_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_AttributeGroup_Geltungsbereich(), this.getGeltungsbereich_TypeClass(), null, "geltungsbereich", null, 0, 2, Signal_Real_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_AttributeGroup_SignalBefestigungsart(), this.getSignal_Befestigungsart_TypeClass(), null, "signalBefestigungsart", null, 1, 1, Signal_Real_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_AttributeGroup_SignalFunktion(), this.getSignal_Funktion_TypeClass(), null, "signalFunktion", null, 0, 1, Signal_Real_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_AttributeGroup_SignalRealAktiv(), this.getSignal_Real_Aktiv_AttributeGroup(), null, "signalRealAktiv", null, 0, 1, Signal_Real_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_AttributeGroup_SignalRealAktivSchirm(), this.getSignal_Real_Aktiv_Schirm_AttributeGroup(), null, "signalRealAktivSchirm", null, 0, 1, Signal_Real_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_AttributeGroup_SignalsichtErreichbar(), this.getSignalsicht_Erreichbar_TypeClass(), null, "signalsichtErreichbar", null, 0, 1, Signal_Real_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_AttributeGroup_SignalsichtMindest(), this.getSignalsicht_Mindest_TypeClass(), null, "signalsichtMindest", null, 0, 1, Signal_Real_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Real_AttributeGroup_SignalsichtSoll(), this.getSignalsicht_Soll_TypeClass(), null, "signalsichtSoll", null, 0, 1, Signal_Real_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_SignalbegriffEClass, Signal_Signalbegriff.class, "Signal_Signalbegriff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Signalbegriff_IDSignalRahmen(), theVerweisePackage.getID_Signal_Rahmen_TypeClass(), null, "iDSignalRahmen", null, 1, 1, Signal_Signalbegriff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Signalbegriff_SignalSignalbegriffAllg(), this.getSignal_Signalbegriff_Allg_AttributeGroup(), null, "signalSignalbegriffAllg", null, 0, 1, Signal_Signalbegriff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Signalbegriff_SignalbegriffID(), theSignalbegriffe_StrukturPackage.getSignalbegriff_ID_TypeClass(), null, "signalbegriffID", null, 1, 1, Signal_Signalbegriff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signal_Signalbegriff_Allg_AttributeGroupEClass, Signal_Signalbegriff_Allg_AttributeGroup.class, "Signal_Signalbegriff_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Signalbegriff_Allg_AttributeGroup_Anschaltdauer(), this.getAnschaltdauer_TypeClass(), null, "anschaltdauer", null, 0, 1, Signal_Signalbegriff_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Signalbegriff_Allg_AttributeGroup_Beleuchtet(), this.getBeleuchtet_TypeClass(), null, "beleuchtet", null, 0, 1, Signal_Signalbegriff_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Signalbegriff_Allg_AttributeGroup_Geschaltet(), this.getGeschaltet_TypeClass(), null, "geschaltet", null, 0, 1, Signal_Signalbegriff_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Signalbegriff_Allg_AttributeGroup_Zs2Ueberwacht(), this.getZs2_Ueberwacht_TypeClass(), null, "zs2Ueberwacht", null, 0, 1, Signal_Signalbegriff_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalsicht_Erreichbar_TypeClassEClass, Signalsicht_Erreichbar_TypeClass.class, "Signalsicht_Erreichbar_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalsicht_Erreichbar_TypeClass_Wert(), this.getSignalsicht_Erreichbar_Type(), "wert", null, 1, 1, Signalsicht_Erreichbar_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalsicht_Mindest_TypeClassEClass, Signalsicht_Mindest_TypeClass.class, "Signalsicht_Mindest_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalsicht_Mindest_TypeClass_Wert(), this.getSignalsicht_Mindest_Type(), "wert", null, 1, 1, Signalsicht_Mindest_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalsicht_Soll_TypeClassEClass, Signalsicht_Soll_TypeClass.class, "Signalsicht_Soll_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalsicht_Soll_TypeClass_Wert(), this.getSignalsicht_Soll_Type(), "wert", null, 1, 1, Signalsicht_Soll_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalsystem_TypeClassEClass, Signalsystem_TypeClass.class, "Signalsystem_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalsystem_TypeClass_Wert(), this.getENUMSignalsystemObject(), "wert", null, 1, 1, Signalsystem_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sonstige_Zulaessige_Anordnung_TypeClassEClass, Sonstige_Zulaessige_Anordnung_TypeClass.class, "Sonstige_Zulaessige_Anordnung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSonstige_Zulaessige_Anordnung_TypeClass_Wert(), this.getENUMSonstigeZulaessigeAnordnungObject(), "wert", null, 1, 1, Sonstige_Zulaessige_Anordnung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streuscheibe_Art_TypeClassEClass, Streuscheibe_Art_TypeClass.class, "Streuscheibe_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStreuscheibe_Art_TypeClass_Wert(), this.getENUMStreuscheibeArtObject(), "wert", null, 1, 1, Streuscheibe_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streuscheibe_Betriebsstellung_TypeClassEClass, Streuscheibe_Betriebsstellung_TypeClass.class, "Streuscheibe_Betriebsstellung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStreuscheibe_Betriebsstellung_TypeClass_Wert(), this.getENUMStreuscheibeBetriebsstellungObject(), "wert", null, 1, 1, Streuscheibe_Betriebsstellung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tunnelsignal_TypeClassEClass, Tunnelsignal_TypeClass.class, "Tunnelsignal_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTunnelsignal_TypeClass_Wert(), this.getENUMTunnelsignalObject(), "wert", null, 1, 1, Tunnelsignal_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zs2_Ueberwacht_TypeClassEClass, Zs2_Ueberwacht_TypeClass.class, "Zs2_Ueberwacht_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZs2_Ueberwacht_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Zs2_Ueberwacht_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumAnschaltdauerEEnum, ENUMAnschaltdauer.class, "ENUMAnschaltdauer");
		addEEnumLiteral(enumAnschaltdauerEEnum, ENUMAnschaltdauer.ENUM_ANSCHALTDAUER_G);
		addEEnumLiteral(enumAnschaltdauerEEnum, ENUMAnschaltdauer.ENUM_ANSCHALTDAUER_T);
		addEEnumLiteral(enumAnschaltdauerEEnum, ENUMAnschaltdauer.ENUM_ANSCHALTDAUER_Z);

		initEEnum(enumAutoEinstellungEEnum, ENUMAutoEinstellung.class, "ENUMAutoEinstellung");
		addEEnumLiteral(enumAutoEinstellungEEnum, ENUMAutoEinstellung.ENUM_AUTO_EINSTELLUNG_SB);
		addEEnumLiteral(enumAutoEinstellungEEnum, ENUMAutoEinstellung.ENUM_AUTO_EINSTELLUNG_SONSTIGE);
		addEEnumLiteral(enumAutoEinstellungEEnum, ENUMAutoEinstellung.ENUM_AUTO_EINSTELLUNG_ZL);

		initEEnum(enumBefestigungArtEEnum, ENUMBefestigungArt.class, "ENUMBefestigungArt");
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_ANDERE);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_ANDERE_SONDERKONSTRUKTION);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_ARBEITSBUEHNE);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_BAHNSTEIG);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_DACH_DECKE);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_FUNDAMENT);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_KONSTRUKTIONSTEIL);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_OL_KETTENWERK);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_OL_MAST);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_PFAHL);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_PFOSTEN_HOCH);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_PFOSTEN_NIEDRIG);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_PRELLBOCK);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_RAHMEN);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_HOCH);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_NIEDRIG);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_HOCH);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_NIEDRIG);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_SCHIENENFUSS);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_SIGNALAUSLEGER);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_SIGNALBRUECKE);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_HOCH);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_NIEDRIG);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_SONSTIGE);
		addEEnumLiteral(enumBefestigungArtEEnum, ENUMBefestigungArt.ENUM_BEFESTIGUNG_ART_WAND);

		initEEnum(enumBeleuchtetEEnum, ENUMBeleuchtet.class, "ENUMBeleuchtet");
		addEEnumLiteral(enumBeleuchtetEEnum, ENUMBeleuchtet.ENUM_BELEUCHTET_ANGESTRAHLT);
		addEEnumLiteral(enumBeleuchtetEEnum, ENUMBeleuchtet.ENUM_BELEUCHTET_INNENBELEUCHTET);
		addEEnumLiteral(enumBeleuchtetEEnum, ENUMBeleuchtet.ENUM_BELEUCHTET_NEIN);

		initEEnum(enumDurchfahrtEEnum, ENUMDurchfahrt.class, "ENUMDurchfahrt");
		addEEnumLiteral(enumDurchfahrtEEnum, ENUMDurchfahrt.ENUM_DURCHFAHRT_ERLAUBT);
		addEEnumLiteral(enumDurchfahrtEEnum, ENUMDurchfahrt.ENUM_DURCHFAHRT_NUR_MIT_SH1);
		addEEnumLiteral(enumDurchfahrtEEnum, ENUMDurchfahrt.ENUM_DURCHFAHRT_VERBOTEN);

		initEEnum(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.class, "ENUMFiktivesSignalFunktion");
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_FAP_START);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_FAP_ZIEL);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_RANGIER_START_ZIEL_NE_14);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_RANGIER_START_ZIEL_OHNE_SIGNAL);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_SONSTIGE);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_VSIG_VIRTUELL);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZENTRALBLOCK_START);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZENTRALBLOCK_ZIEL);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZUG_START_AWANST);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZUG_START_MITTELWEICHE);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZUG_START_OHNE_SIGNAL);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZUG_ZIEL_AWANST);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZUG_ZIEL_OHNE_SIGNAL);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZUG_ZIEL_STRECKE);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZUG_START_ZIEL_BK);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZUG_START_ZIEL_BK_MIT_ZS_1);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZUG_START_ZIEL_BK_MIT_ZS_7);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZUG_START_ZIEL_NE_14);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZUG_START_ZIEL_NE_14_MIT_ZS_1);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZUG_START_ZIEL_NE_14_MIT_ZS_7);
		addEEnumLiteral(enumFiktivesSignalFunktionEEnum, ENUMFiktivesSignalFunktion.ENUM_FIKTIVES_SIGNAL_FUNKTION_ZUG_START_ZIEL_NE_14_MIT_ZS_8);

		initEEnum(enumFundamentArtEEnum, ENUMFundamentArt.class, "ENUMFundamentArt");
		addEEnumLiteral(enumFundamentArtEEnum, ENUMFundamentArt.ENUM_FUNDAMENT_ART_BETONMONOLITH_GROSS);
		addEEnumLiteral(enumFundamentArtEEnum, ENUMFundamentArt.ENUM_FUNDAMENT_ART_BETONMONOLITH_KLEIN);
		addEEnumLiteral(enumFundamentArtEEnum, ENUMFundamentArt.ENUM_FUNDAMENT_ART_GROSS);
		addEEnumLiteral(enumFundamentArtEEnum, ENUMFundamentArt.ENUM_FUNDAMENT_ART_KLEIN);
		addEEnumLiteral(enumFundamentArtEEnum, ENUMFundamentArt.ENUM_FUNDAMENT_ART_RAMMROHR_GROSS);
		addEEnumLiteral(enumFundamentArtEEnum, ENUMFundamentArt.ENUM_FUNDAMENT_ART_RAMMROHR_KLEIN);
		addEEnumLiteral(enumFundamentArtEEnum, ENUMFundamentArt.ENUM_FUNDAMENT_ART_SONSTIGE);

		initEEnum(enumFunktionOhneSignalEEnum, ENUMFunktionOhneSignal.class, "ENUMFunktionOhneSignal");
		addEEnumLiteral(enumFunktionOhneSignalEEnum, ENUMFunktionOhneSignal.ENUM_FUNKTION_OHNE_SIGNAL_RS);
		addEEnumLiteral(enumFunktionOhneSignalEEnum, ENUMFunktionOhneSignal.ENUM_FUNKTION_OHNE_SIGNAL_SONSTIGE);
		addEEnumLiteral(enumFunktionOhneSignalEEnum, ENUMFunktionOhneSignal.ENUM_FUNKTION_OHNE_SIGNAL_ZS);

		initEEnum(enumGeltungsbereichEEnum, ENUMGeltungsbereich.class, "ENUMGeltungsbereich");
		addEEnumLiteral(enumGeltungsbereichEEnum, ENUMGeltungsbereich.ENUM_GELTUNGSBEREICH_DS);
		addEEnumLiteral(enumGeltungsbereichEEnum, ENUMGeltungsbereich.ENUM_GELTUNGSBEREICH_DV);
		addEEnumLiteral(enumGeltungsbereichEEnum, ENUMGeltungsbereich.ENUM_GELTUNGSBEREICH_SBAHN_B);
		addEEnumLiteral(enumGeltungsbereichEEnum, ENUMGeltungsbereich.ENUM_GELTUNGSBEREICH_SBAHN_HH);

		initEEnum(enumRahmenArtEEnum, ENUMRahmenArt.class, "ENUMRahmenArt");
		addEEnumLiteral(enumRahmenArtEEnum, ENUMRahmenArt.ENUM_RAHMEN_ART_BEZEICHNUNGSSCHILD);
		addEEnumLiteral(enumRahmenArtEEnum, ENUMRahmenArt.ENUM_RAHMEN_ART_BLECHTAFEL);
		addEEnumLiteral(enumRahmenArtEEnum, ENUMRahmenArt.ENUM_RAHMEN_ART_KERAMIKKOERPER);
		addEEnumLiteral(enumRahmenArtEEnum, ENUMRahmenArt.ENUM_RAHMEN_ART_SCHIRM);
		addEEnumLiteral(enumRahmenArtEEnum, ENUMRahmenArt.ENUM_RAHMEN_ART_SONSTIGE);
		addEEnumLiteral(enumRahmenArtEEnum, ENUMRahmenArt.ENUM_RAHMEN_ART_ZUSATZANZEIGER);

		initEEnum(enumSignalArtEEnum, ENUMSignalArt.class, "ENUMSignalArt");
		addEEnumLiteral(enumSignalArtEEnum, ENUMSignalArt.ENUM_SIGNAL_ART_ANDERE);
		addEEnumLiteral(enumSignalArtEEnum, ENUMSignalArt.ENUM_SIGNAL_ART_HAUPTSIGNAL);
		addEEnumLiteral(enumSignalArtEEnum, ENUMSignalArt.ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL);
		addEEnumLiteral(enumSignalArtEEnum, ENUMSignalArt.ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL_NE_14_LS);
		addEEnumLiteral(enumSignalArtEEnum, ENUMSignalArt.ENUM_SIGNAL_ART_MEHRABSCHNITTSSIGNAL);
		addEEnumLiteral(enumSignalArtEEnum, ENUMSignalArt.ENUM_SIGNAL_ART_MEHRABSCHNITTSSPERRSIGNAL);
		addEEnumLiteral(enumSignalArtEEnum, ENUMSignalArt.ENUM_SIGNAL_ART_SPERRSIGNAL);
		addEEnumLiteral(enumSignalArtEEnum, ENUMSignalArt.ENUM_SIGNAL_ART_VORSIGNAL);
		addEEnumLiteral(enumSignalArtEEnum, ENUMSignalArt.ENUM_SIGNAL_ART_VORSIGNALWIEDERHOLER);
		addEEnumLiteral(enumSignalArtEEnum, ENUMSignalArt.ENUM_SIGNAL_ART_ZUGDECKUNGSSIGNAL);

		initEEnum(enumSignalBefestigungsartEEnum, ENUMSignalBefestigungsart.class, "ENUMSignalBefestigungsart");
		addEEnumLiteral(enumSignalBefestigungsartEEnum, ENUMSignalBefestigungsart.ENUM_SIGNAL_BEFESTIGUNGSART_ANDERE);
		addEEnumLiteral(enumSignalBefestigungsartEEnum, ENUMSignalBefestigungsart.ENUM_SIGNAL_BEFESTIGUNGSART_FUNDAMENT);
		addEEnumLiteral(enumSignalBefestigungsartEEnum, ENUMSignalBefestigungsart.ENUM_SIGNAL_BEFESTIGUNGSART_MAST);
		addEEnumLiteral(enumSignalBefestigungsartEEnum, ENUMSignalBefestigungsart.ENUM_SIGNAL_BEFESTIGUNGSART_SIGNALAUSLEGER);
		addEEnumLiteral(enumSignalBefestigungsartEEnum, ENUMSignalBefestigungsart.ENUM_SIGNAL_BEFESTIGUNGSART_SIGNALBRUECKE);
		addEEnumLiteral(enumSignalBefestigungsartEEnum, ENUMSignalBefestigungsart.ENUM_SIGNAL_BEFESTIGUNGSART_SONDERKONSTRUKTION);

		initEEnum(enumSignalFunktionEEnum, ENUMSignalFunktion.class, "ENUMSignalFunktion");
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_ALLEINSTEHENDES_ZUSATZSIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_ANDERE);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_AUSFAHR_SIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_AUSFAHR_ZWISCHEN_SIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_BLOCK_SIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_BUE_UEBERWACHUNGSSIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_DECKUNGS_SIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_EINFAHR_AUSFAHR_SIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_EINFAHR_BLOCK_SIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_EINFAHR_SIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_GRUPPENZWISCHEN_SIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_SIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_GRUPPENZWISCHEN_SIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_NACHRUECK_SIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_VORSIGNAL_VORSIGNALWIEDERHOLER);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_ZUGDECKUNGS_SIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_ZUG_ZIEL_SIGNAL);
		addEEnumLiteral(enumSignalFunktionEEnum, ENUMSignalFunktion.ENUM_SIGNAL_FUNKTION_ZWISCHEN_SIGNAL);

		initEEnum(enumSignalsystemEEnum, ENUMSignalsystem.class, "ENUMSignalsystem");
		addEEnumLiteral(enumSignalsystemEEnum, ENUMSignalsystem.ENUM_SIGNALSYSTEM_HL);
		addEEnumLiteral(enumSignalsystemEEnum, ENUMSignalsystem.ENUM_SIGNALSYSTEM_HV);
		addEEnumLiteral(enumSignalsystemEEnum, ENUMSignalsystem.ENUM_SIGNALSYSTEM_KS);
		addEEnumLiteral(enumSignalsystemEEnum, ENUMSignalsystem.ENUM_SIGNALSYSTEM_SONSTIGE);
		addEEnumLiteral(enumSignalsystemEEnum, ENUMSignalsystem.ENUM_SIGNALSYSTEM_SV);

		initEEnum(enumSonstigeZulaessigeAnordnungEEnum, ENUMSonstigeZulaessigeAnordnung.class, "ENUMSonstigeZulaessigeAnordnung");
		addEEnumLiteral(enumSonstigeZulaessigeAnordnungEEnum, ENUMSonstigeZulaessigeAnordnung.ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG_ANORDNUNG_DES_SIGNALS_RECHTS_AM_GLEIS);
		addEEnumLiteral(enumSonstigeZulaessigeAnordnungEEnum, ENUMSonstigeZulaessigeAnordnung.ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG_ANORDNUNG_DES_SIGNALS_RECHTS_AM_GLEIS_OHNE_SCHACHBRETTTAFEL);
		addEEnumLiteral(enumSonstigeZulaessigeAnordnungEEnum, ENUMSonstigeZulaessigeAnordnung.ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG_NICHTGELTUNG_FUER_FAHRTEN_AUF_DEM_GEGENGLEIS);

		initEEnum(enumStreuscheibeArtEEnum, ENUMStreuscheibeArt.class, "ENUMStreuscheibeArt");
		addEEnumLiteral(enumStreuscheibeArtEEnum, ENUMStreuscheibeArt.ENUM_STREUSCHEIBE_ART_HG);
		addEEnumLiteral(enumStreuscheibeArtEEnum, ENUMStreuscheibeArt.ENUM_STREUSCHEIBE_ART_HN);
		addEEnumLiteral(enumStreuscheibeArtEEnum, ENUMStreuscheibeArt.ENUM_STREUSCHEIBE_ART_HRL);
		addEEnumLiteral(enumStreuscheibeArtEEnum, ENUMStreuscheibeArt.ENUM_STREUSCHEIBE_ART_LED);
		addEEnumLiteral(enumStreuscheibeArtEEnum, ENUMStreuscheibeArt.ENUM_STREUSCHEIBE_ART_ORL);
		addEEnumLiteral(enumStreuscheibeArtEEnum, ENUMStreuscheibeArt.ENUM_STREUSCHEIBE_ART_SONSTIGE);
		addEEnumLiteral(enumStreuscheibeArtEEnum, ENUMStreuscheibeArt.ENUM_STREUSCHEIBE_ART_VRL);

		initEEnum(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.class, "ENUMStreuscheibeBetriebsstellung");
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_HG1);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_HG1_GW);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_HG2);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_HG2_GW);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_HG3);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_HG3_GW);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_HG4);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_HG4_GW);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_HL);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_HR);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_OL);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_OR);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_SONSTIGE);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_VL);
		addEEnumLiteral(enumStreuscheibeBetriebsstellungEEnum, ENUMStreuscheibeBetriebsstellung.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_VR);

		initEEnum(enumTunnelsignalEEnum, ENUMTunnelsignal.class, "ENUMTunnelsignal");
		addEEnumLiteral(enumTunnelsignalEEnum, ENUMTunnelsignal.ENUM_TUNNELSIGNAL_MIT_DAUERNACHTSCHALTUNG);
		addEEnumLiteral(enumTunnelsignalEEnum, ENUMTunnelsignal.ENUM_TUNNELSIGNAL_NEIN);
		addEEnumLiteral(enumTunnelsignalEEnum, ENUMTunnelsignal.ENUM_TUNNELSIGNAL_OHNE_DAUERNACHTSCHALTUNG);

		// Initialize data types
		initEDataType(enumAnschaltdauerObjectEDataType, ENUMAnschaltdauer.class, "ENUMAnschaltdauerObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumAutoEinstellungObjectEDataType, ENUMAutoEinstellung.class, "ENUMAutoEinstellungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBefestigungArtObjectEDataType, ENUMBefestigungArt.class, "ENUMBefestigungArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBeleuchtetObjectEDataType, ENUMBeleuchtet.class, "ENUMBeleuchtetObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumDurchfahrtObjectEDataType, ENUMDurchfahrt.class, "ENUMDurchfahrtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumFiktivesSignalFunktionObjectEDataType, ENUMFiktivesSignalFunktion.class, "ENUMFiktivesSignalFunktionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumFundamentArtObjectEDataType, ENUMFundamentArt.class, "ENUMFundamentArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumFunktionOhneSignalObjectEDataType, ENUMFunktionOhneSignal.class, "ENUMFunktionOhneSignalObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumGeltungsbereichObjectEDataType, ENUMGeltungsbereich.class, "ENUMGeltungsbereichObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumRahmenArtObjectEDataType, ENUMRahmenArt.class, "ENUMRahmenArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSignalArtObjectEDataType, ENUMSignalArt.class, "ENUMSignalArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSignalBefestigungsartObjectEDataType, ENUMSignalBefestigungsart.class, "ENUMSignalBefestigungsartObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSignalFunktionObjectEDataType, ENUMSignalFunktion.class, "ENUMSignalFunktionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSignalsystemObjectEDataType, ENUMSignalsystem.class, "ENUMSignalsystemObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSonstigeZulaessigeAnordnungObjectEDataType, ENUMSonstigeZulaessigeAnordnung.class, "ENUMSonstigeZulaessigeAnordnungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumStreuscheibeArtObjectEDataType, ENUMStreuscheibeArt.class, "ENUMStreuscheibeArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumStreuscheibeBetriebsstellungObjectEDataType, ENUMStreuscheibeBetriebsstellung.class, "ENUMStreuscheibeBetriebsstellungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumTunnelsignalObjectEDataType, ENUMTunnelsignal.class, "ENUMTunnelsignalObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hoehe_Fundamentoberkante_TypeEDataType, BigDecimal.class, "Hoehe_Fundamentoberkante_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(obere_Lichtpunkthoehe_TypeEDataType, BigDecimal.class, "Obere_Lichtpunkthoehe_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pzB_Schutzstrecke_Soll_TypeEDataType, BigDecimal.class, "PZB_Schutzstrecke_Soll_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rahmen_Hoehe_TypeEDataType, BigDecimal.class, "Rahmen_Hoehe_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(richtpunkt_TypeEDataType, String.class, "Richtpunkt_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(richtpunktentfernung_TypeEDataType, BigDecimal.class, "Richtpunktentfernung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalsicht_Erreichbar_TypeEDataType, BigDecimal.class, "Signalsicht_Erreichbar_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalsicht_Mindest_TypeEDataType, BigDecimal.class, "Signalsicht_Mindest_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalsicht_Soll_TypeEDataType, BigDecimal.class, "Signalsicht_Soll_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbinfrago.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.1.\n\nMore information about the license can be found on\nhttp://www.dbinfrago.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbinfrago.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.1.\n\nMore information about the license can be found on\nhttp://www.dbinfrago.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbinfrago.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.1.\n\nMore information about the license can be found on\nhttp://www.dbinfrago.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbinfrago.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.1.\n\nMore information about the license can be found on\nhttp://www.dbinfrago.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (enumStreuscheibeBetriebsstellungEEnum,
		   source,
		   new String[] {
			   "documentation", "HGx_gw=Erg\u00e4nzung gewendete Streuscheiben (Information zunehmend von SBI gefordert)"
		   });
		addAnnotation
		  (signalEClass,
		   source,
		   new String[] {
			   "documentation", "Technische, punktf\u00f6rmig verortete Einrichtung der Eisenbahninfrastruktur, die als Teil der Au\u00dfenanlage einer Au\u00dfenelement-Ansteuerung mit statischen oder dynamischen Signalbildern Anweisungen zur Fahrweise oder andere Verhaltensvorschriften an den Triebfahrzeugf\u00fchrer \u00fcbermittelt oder als Teil der Innenanlage einer Au\u00dfenelement-Ansteuerung mittels eines Bedienpunkts zur Behandlung von Fahrwegen als Start- oder Zielsignal dient. Steht ein Signal an einer Grenze zweier Bereiche, so ist es dem Bereich zuzuordnen, dem der vom Signal gedeckte Gleisabschnitt angeh\u00f6rt. Das Objekt Signal beinhaltet zentrale Eigenschaften, die bei Signalen der Au\u00dfenanlage in Signal-Befestigungen bzgl. der Konstruktion und in Signal-Rahmen bzgl. der zugeordneten Signalbegriffe erg\u00e4nzt werden. Je nach Ausf\u00fchrung eines Signals der Au\u00dfenanlage k\u00f6nnen daf\u00fcr mehrere Signal-Befestigungen erforderlich sein (z.B. \\u0027Fundament\\u0027 und \\u0027Signalanordnung\\u0027), daf\u00fcr mehrere Signal-Rahmen erforderlich sein (z.B. \\u0027Schirm\\u0027, 2x\\u0027Zusatzanzeiger\\u0027 und \\u0027Bezeichnungsschild\\u0027) und / oder zeitgleich mehrere Signalbegriffe angezeigt werden, die zu diesem Zeitpunkt f\u00fcr ein Gleis - meist nur in einer Fahrtrichtung - an einem Punkt g\u00fcltig sind und deren logische \u00dcberlagerung zur Handlungsanweisung f\u00fcr den Triebfahrzeugf\u00fchrer wird. Signalbilder, die zwar einem gemeinsamen Punkt zugeordnet sind, aber keiner gemeinsamen logischen Interpretation bed\u00fcrfen, werden unterschiedlichen Signalen zugeordnet. Kann ein Signal mehrere Signalbilder anzeigen, so werden diese in Gruppen (analog zur Konstruktion) zusammengefasst, jede dieser Gruppen bildet einen Signal-Rahmen. Zur ausf\u00fchrliche Beschreibung der Modellierung eines Signals s. Modellierung Signal. Besonderheiten zur Verortung von Signalen sind unter Punkt Objekt beschrieben. DB-Regelwerk 301, 819.02, Planungsdaten: Sicherungstechnischer Lageplan, statische Eigenschaften: Signaltabelle 1, dynamische Eigenschaften: Signaltabelle 2, vereinzelt sind einzelne Angaben auch anderen Fundorten zugeordnet, dies ist den jeweiligen Einzelbeitr\u00e4gen zu entnehmen. "
		   });
		addAnnotation
		  (getSignal_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getSignal_PZBSchutzstreckeSoll(),
		   source,
		   new String[] {
			   "documentation", "Solll\u00e4nge der PZB-Schutzstrecke eines Signals, sofern hinter diesem ein Gefahrpunktabstand vorgesehen ist. F\u00fcr Durchrutschwege wird die Solll\u00e4nge in Abh\u00e4ngigkeit der Geschwindigkeitsklasse berechnet."
		   });
		addAnnotation
		  (signal_BefestigungEClass,
		   source,
		   new String[] {
			   "documentation", "Konstruktionselement, das der baulichen Aufnahme eines oder mehrerer Signalrahmen dient. Die konkreten konstruktiven Merkmale sind in einer (oder im Bedarfsfall mehreren) Regelzeichnung(en) enthalten, auf die jeweils ein GUID-Verweis zeigt. Bei Sonderkonstruktionen wird die Regelzeichnung durch die zugeh\u00f6rigen Zulassungsdokumente ersetzt. Diese sind als Anhang mittels eines Bearbeitungsvermerks beizuf\u00fcgen. Signalbefestigungen k\u00f6nnen auch weitere Signalbefestigungen aufnehmen (z.B. tr\u00e4gt ein Signalausleger eine Arbeitsb\u00fchne). Einer Signalbefestigung ist mindestens ein Objekt Signal Rahmen oder Signal Befestigung zugeordnet. Ausf\u00fchrliche Beschreibung s. Modellierung Signal. DB-Regelwerk Regelzeichnungen "
		   });
		addAnnotation
		  (getSignal_Befestigung_IDRegelzeichnung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein Objekt Regelzeichnung. F\u00fcr Signale werden in der Regel die Regelzeichnungen der Gruppe S800x,yy verwendet, die die grunds\u00e4tzliche Anordnung am Gleis beschreiben. Die angegebene Regelzeichnung wird mittels Parametern (z. B.: \\\"Bild\\\") weiter spezifiziert. Der Verweis kann mehrfach verwendet werden, wenn die Zuordnung mehrerer Regelzeichnungen explizit erforderlich ist. "
		   });
		addAnnotation
		  (getSignal_Befestigung_IDBefestigungBauwerk(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein Nicht-LST-Objekt (OL-Mast, Br\u00fccke, St\u00fctzwand), an dem die Signalbefestigung befestigt ist."
		   });
		addAnnotation
		  (getSignal_Befestigung_IDSignalBefestigung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein zugeh\u00f6riges Objekt Signal Befestigung. Zur Anwendung siehe Modellierung Signal. DB-Regelwerk Im bisherigen PT1 keine eindeutige Darstellung, oft aus den Eintr\u00e4gen in der Signaltabelle1, Zeilen 4-6, 10, 13 und 24-28 zu erkennen. "
		   });
		addAnnotation
		  (getSignal_Befestigung_Allg_AttributeGroup_BefestigungArt(),
		   source,
		   new String[] {
			   "documentation", "Beschreibung der Signalbefestigung, um auch ohne Regelzeichnung die grunds\u00e4tzliche Art erkennen zu k\u00f6nnen.\nDie Werte \\\"Regelanordnung_Mast_...\\\" bilden Regel-Signalanordnungen am Mast ab. Mit den Werten \\\"Regelanordnung_Sonstige_...\\\" wird eine sonstige Regel-Anordnung beschrieben, z. B. am Pfosten (Lf). Sofern eine Sonderkonstruktion notwendig ist, sind die Werte \\\"Sonderanordnung_Mast_...\\\" und \\\"Pfosten_...\\\" zu nutzen. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk Im bisherigen PT1 keine eindeutige Darstellung, in der Regel aus den Eintr\u00e4gen in der Signaltabelle 1 zu erkennen."
		   });
		addAnnotation
		  (getSignal_Befestigung_Allg_AttributeGroup_FundamentArt(),
		   source,
		   new String[] {
			   "documentation", "Bei Fundament: Angabe der Fundamentart, da bei herstellerneutraler Planung noch keine Regelzeichnungsnummer bzw. kein Bild gew\u00e4hlt werden kann."
		   });
		addAnnotation
		  (getSignal_Befestigung_Allg_AttributeGroup_HoeheFundamentoberkante(),
		   source,
		   new String[] {
			   "documentation", "Tats\u00e4chliche H\u00f6he der Fundamentoberkante in Bezug zur Schienenoberkante (SO). Die H\u00f6he der Fundamentoberkante ist die Differenz der absoluten H\u00f6hen von der Schienenoberkante der nicht\u00fcberh\u00f6hten Schiene an dem Punkt, der von der Senkrechten auf die Gleisachse durch den Fundamentmittelpunkt bestimmt wird und der Fundamentoberkante (ohne Signalaufbau). Bei positiven Werten befindet sich die Fundamentoberkante unterhalb der Schienenoberkante (Standardanordnung). \u00dcbliche Werte sind 100 mm und 700 mm. Das Attribut ist f\u00fcr Fundamente immer anzugeben, f\u00fcr andere Befestigungstypen ist es gegenstandslos. Die hier angegebene H\u00f6he kann von der der Regelzeichnung abweichen, in diesem Fall gilt die Regelzeichnung nur f\u00fcr die anderen konstruktiven Merkmale. Die Angabe erfolgt im Modell in Meter mit drei Nachkommastellen. DB-Regelwerk Im bisherigen PT1 keine eindeutige Darstellung, in der Regel aus den Eintr\u00e4gen in der Signaltabelle1, Zeilen 4-6 zu erkennen."
		   });
		addAnnotation
		  (getSignal_Befestigung_Allg_AttributeGroup_ObereLichtpunkthoehe(),
		   source,
		   new String[] {
			   "documentation", "Bezugsh\u00f6he des ma\u00dfgebenden Lichtpunktes \u00fcber Schienenoberkante (SO). DB-Regelwerk Planungsdaten: Signaltabelle 1, Zeile 3; wird jedoch im Modell in Meter (mit drei Nachkommastellen) angegeben. "
		   });
		addAnnotation
		  (signal_Fank_ZuordnungEClass,
		   source,
		   new String[] {
			   "documentation", "Abbildung des Fahrtank\u00fcnders (Wei\u00dfes Dreieck) sowie Zuordnung der Startsignale, f\u00fcr die eine Fahrtank\u00fcndigung erfolgen soll. Ein physischer Fahrtank\u00fcnder (Anzeiger) wird als Signal abgebildet, wobei hierbei nur die Attributgruppen Bezeichnung sowie Signal_Real zu nutzen sind (nicht: Signal_Real_Aktiv, da kein Anschluss mittels ID_Stellelement an ein Stellwerk). Erfolgt die Fahrtank\u00fcndigung ausschlie\u00dflich auf mobilen Endger\u00e4ten, so entf\u00e4llt das Anlegen des Signals f\u00fcr den Fahrtank\u00fcnder."
		   });
		addAnnotation
		  (getSignal_Fank_Zuordnung_IDSignalFank(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den oder die Fahrtank\u00fcnder (\\\"Wei\u00dfes Dreieck\\\"), durch die eine Fahrtstellung der unter ID_Signal_Start angegebenen Startsignale angek\u00fcndigt werden soll. Der Verweis entf\u00e4llt, wenn die Anzeige ausschlie\u00dflich auf mobilen Endger\u00e4ten erfolgt."
		   });
		addAnnotation
		  (getSignal_Fank_Zuordnung_IDSignalStart(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Startsignal bzw. die Startsignale, deren Fahrtstellung angek\u00fcndigt werden soll."
		   });
		addAnnotation
		  (getSignal_Fiktiv_AttributeGroup_AutoEinstellung(),
		   source,
		   new String[] {
			   "documentation", "Art der automatischen Einstellung.\nDB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung."
		   });
		addAnnotation
		  (getSignal_Fiktiv_AttributeGroup_FiktivesSignalFunktion(),
		   source,
		   new String[] {
			   "documentation", "Funktion (Verwendungsm\u00f6glichkeit) eines fiktiven Signals. Sollen an einem Punkt mehrere Funktionen realisiert werden, ist das Attribut mehrfach einzubinden. DB-Regelwerk Fiktive Signale sind als Start- oder Zielpunkte in den Zug- oder Rangierstra\u00dfentabellen erkennbar. Ihre Funktion ist nicht unmittelbar dargestellt, sie ergibt sich aus der Verwendung."
		   });
		addAnnotation
		  (getSignal_Fstr_AttributeGroup_BesetzteAusfahrt(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob f\u00fcr das Startsignal im Stumpfgleis eine Besetzte Ausfahrt geplant ist (true) oder nicht (false). Im Planungs- bzw. Projektierungsfall \\\"Besetzte Ausfahrt\\\" m\u00fcssen die an das Stumpfgleis anschlie\u00dfenden Weichen oder Kreuzungen nicht freigemeldet sein, wenn sie durch die zuletzt in das Stumpfgleis eingestellte Fahrstra\u00dfe kontinuierlich besetzt wurden und besetzt geblieben sind. DB Regelwerk Lastenheft ESTW F1, Abschnitt 4.3.3"
		   });
		addAnnotation
		  (getSignal_Fstr_AttributeGroup_DAManuell(),
		   source,
		   new String[] {
			   "documentation", "Gibt an, ob eine manuelle Durchrutschwegaufl\u00f6sung m\u00f6glich ist. Die manuelle Durchrutschwegaufl\u00f6sung ist als M\u00f6glichkeit zur Regelbedienung zu planen. Sie ist nicht mit der Hilfsaufl\u00f6sung zu verwechseln, die als Grundfunktion keiner Planung bedarf. Im herk\u00f6mmlichen PT1 Inhalt der Durchrutschwegtabelle, gilt jedoch immer f\u00fcr alle Durchrutschwege eines Signals einheitlich. Wertzuordnung: true - manuelle Durchrutschwegaufl\u00f6sung ist m\u00f6glich, false - manuelle Durchrutschwegaufl\u00f6sung ist nicht m\u00f6glich. DB-Regelwerk Durchrutschwegtabelle, Spalte 15 "
		   });
		addAnnotation
		  (getSignal_Fstr_AttributeGroup_Durchfahrt(),
		   source,
		   new String[] {
			   "documentation", "Gibt an, ob und wie Weiterfahren ohne Halt \u00fcber das Zielsignal eines Fahrweges hinaus gestattet sind. Ist die Durchfahrt mittels aneinandergereihter Zugstra\u00dfen verboten, mittels einzeln angew\u00e4hlter Zugstra\u00dfen auf dieses Signal und von diesem Signal aber zu gestatten, so ist der Wert \\\"erlaubt\\\" zu verwenden. In diesem Fall wird allerdings kein Objekt Fstr Aneinander \u00fcber dieses Signal angelegt. Ist betrieblich die Weiterfahrt einer Zugfahrt als Rangierfahrt zu gestatten (diese \u00c4nderung der Ril 408 ist noch nicht Bestandteil des Lastenheftes ESTW), so ist der Wert \\\"nur_mit_Sh1\\\" zu verwenden. Technisch schlie\u00dft eine Zugfahrt mit Durchrutschweg D0 an, das Signal zeigt Hp 0 und Sh 1. DB-Regelwerk Im bisherigen PT 1 ohne eindeutige Darstellung. Die Symbolik im Sicherungstechnischen Lageplan gem\u00e4\u00dfe 819.9002 (11) ist f\u00fcr diesen Sachverhalt nicht ausreichend."
		   });
		addAnnotation
		  (getSignal_Fstr_AttributeGroup_IDRaZielErlaubnisabhaengig(),
		   source,
		   new String[] {
			   "documentation", "Eine Rangierstra\u00dfe mit diesem Zielsignal ist nur einstellbar, wenn die Erlaubnis des Streckenblocks in Richtung Strecke zeigt. Abh\u00e4ngigkeit einer auf ein Signal zuf\u00fchrenden Rangierstra\u00dfe von der Stellung der Erlaubnis einer Block Anlage. Das Attribut wird nur dann bef\u00fcllt, wenn eine Abh\u00e4ngigkeit besteht. DB-Regelwerk Planungsdaten: Rangierstra\u00dfentabelle, Spalte 7"
		   });
		addAnnotation
		  (getSignal_Fstr_AttributeGroup_RangierstrasseRestaufloesung(),
		   source,
		   new String[] {
			   "documentation", "Aufl\u00f6sung einer nicht angefahrenen Rangierstra\u00dfe bei einer wendenden Rangierfahrt \u00fcber mehrere Rangierstra\u00dfen. Es handelt sich hierbei um den durch die Planung festzulegenden Fall 2 der Rangierstra\u00dfenrestaufl\u00f6sung (RRAU) des Lastenheftes f\u00fcr das Elektronische Stellwerk, Teilheft F1. Die F\u00e4lle 1 RRAU und 3 RRAU gem\u00e4\u00df Lastenheft sind Grundfunktion eines ESTW und bed\u00fcrfen keiner Planung. Der Eintrag im Attribut Rangierstrasse_Restaufl\u00f6sung hat auf diese beiden F\u00e4lle keine Auswirkung. Das Attribut wird in den Signalen gef\u00fcllt, an dem nicht angefahrene, aufzul\u00f6sende Rangierstra\u00dfen beginnen. Wertzuordnung: true \u2013 Rangierstra\u00dfenrestaufl\u00f6sung erlaubt, false \u2013 Rangierstra\u00dfenrestaufl\u00f6sung verboten. DB-Regelwerk Planungsdaten: Rangierstra\u00dfentabelle, Spalte 12 "
		   });
		addAnnotation
		  (getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDRaFahrtGleichzeitigVerbot(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Gleis_Bezeichnung des Inselgleises, von dem aus eine gleichzeitige Rangierfahrt aus dem Inselgleis untersagt ist. Das Attribut ist f\u00fcr beide Signale erforderlich, die das Inselgleis begrenzen. Bei Inselgleisen mit mehreren Signalen (z. B. bei Kurz-Lang-Einfahrten) sind alle relevanten Gleisbezeichnungen anzugeben. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung. "
		   });
		addAnnotation
		  (getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDZgFahrtGleichzeitigVerbot(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Gleis_Bezeichnung des Inselgleises, von dem aus eine gleichzeitige Zugfahrt aus dem Inselgleis untersagt ist. Das Attribut ist f\u00fcr beide Signale erforderlich, die das Inselgleis begrenzen. Bei Inselgleisen mit mehreren Signalen (z. B. bei Kurz-Lang-Einfahrten) sind alle relevanten Gleisbezeichnungen anzugeben. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung. "
		   });
		addAnnotation
		  (getSignal_Fstr_S_AttributeGroup_Gegengleis(),
		   source,
		   new String[] {
			   "documentation", "Signal steht am Gegengleis. Das Gleis, das auf zweigleisiger, freier Strecke entgegen der gew\u00f6hnlichen Fahrtrichtung befahren wird (bei den EdB das linke Gleis), wird als Gegengleis bezeichnet. Das Attribut wird nur f\u00fcr (reale und fiktive) Signale an den Streckengleisen mit der Betriebsform \\\"zweigleisiger Betrieb\\\" ausgef\u00fcllt. Erf\u00fcllt ein Ausfahrziel die Bedingung Gegengleis = true, ist f\u00fcr die Zulassung einer Zugfahrt auf dieses Gleis ein Gegengleisanzeiger erforderlich. Im Beispiel sind die (realen) Signale 13 und AA sowie die fiktiven Signale HIDOG und DOHIG Signale, die am Gegengleis stehen. Media:Signale am Gegengleis.svg Wertzuordnung: true - Signal steht an einem Gegengleis, false - Signal steht nicht an einem Gegengleis. Hinweis: Dieses Attribut darf nicht verwechselt werden mit dem Attribut Wirkrichtung, das sich auf die topologische Richtung des Gleises bezieht. DB-Regelwerk Planungsdaten: Sicherungstechnischer Lageplan / B\u00dc-Lageplan "
		   });
		addAnnotation
		  (getSignal_Fstr_S_AttributeGroup_IDAnrueckverschluss(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf alle Gleisschaltmittel, bei dessen Befahrung der Anr\u00fcckverschluss wirkt. Der Anr\u00fcckverschluss eines Signals wird ben\u00f6tigt zur Stellbarkeit und L\u00f6schung eines Ersatzsignals, zur Verhinderung der Fahrstra\u00dfenhilfsaufl\u00f6sung, wenn sich ein Zug diesem Signal n\u00e4hert. Das Gleisschaltmittel ist in der Regel ein Freimeldeabschnitt. Das Signal ist in der Regel ein Einfahrsignal. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung."
		   });
		addAnnotation
		  (getSignal_Fstr_S_AttributeGroup_IDZweitesHaltfallkriterium(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein Gleisschaltmittel, dessen Befahrung als zweites Haltfallkriterium dient."
		   });
		addAnnotation
		  (signal_RahmenEClass,
		   source,
		   new String[] {
			   "documentation", "Fiktive Signale haben keinen Signalrahmen, da sie keinen Signalbegriff zeigen k\u00f6nnen. Reale Signale besitzen einen oder mehrere Signalrahmen. Die Gruppierung von Signalbegriffen innerhalb eines Signals zu Signalrahmen wird anhand der konstruktiven Gestaltung vorgenommen, z.B. werden alle Signalbegriffe des Hauptsignalschirms oder alle Signalbegriffe eines Zusatzanzeigers jeweils zu einem Signalrahmen zusammengefasst. Kann die Anzahl oder Art der Signalbegriffe eines Signalrahmens in Abh\u00e4ngigkeit vom betrieblichen Zustand ge\u00e4ndert werden, so wird dieser als schaltbar bezeichnet, andernfalls als fest. Im LST-Datenmodell ist diese Eigenschaft als Attribut zu den Signalbegriffen definiert; ein Signalrahmen ist danach genau dann schaltbar, wenn mindestens eines der enthaltenen Signalbegriffe schaltbar ist. Typische schaltbare Signalrahmen sind der Signalschirm eines Mehrabschnittssignals, das Lichtsignal eines Zusatzanzeigers und das Form- oder Lichtsignal eines Weichensignals. Typische feste Signalrahmen sind das Mastschild eines Hauptsignals, das Formsignal eines Zusatzanzeigers und die Haltetafel. \u00dcber den Signalrahmen erfolgt, sofern dies geplant ist, die Zuordnung von Signalbegriffen eines nachgeordneten Signals zu einem anderen Signal ohne Bezug zur Fahrstra\u00dfe, siehe dazu ID Signal Nachordnung Ausf\u00fchrliche Beschreibung s. Modellierung Signal. DB-Regelwerk Planungsdaten: im bisherigen PT1 ohne eindeutige Darstellung. In der Regel aus den Angaben in der Signaltabelle 1 zu erkennen. "
		   });
		addAnnotation
		  (getSignal_Rahmen_IDRegelzeichnung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf eine Regelzeichnung, sofern diese nur den Signalrahmen abbildet (z. B. Vorsignaltafel)."
		   });
		addAnnotation
		  (getSignal_Rahmen_IDSignal(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das zugeh\u00f6rige Objekt Signal."
		   });
		addAnnotation
		  (getSignal_Rahmen_IDSignalBefestigung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein zugeh\u00f6riges Objekt Signal Befestigung. Zur Anwendung siehe Modellierung Signal. DB-Regelwerk Im bisherigen PT1 keine eindeutige Darstellung, oft aus den Eintr\u00e4gen in der Signaltabelle1, Zeilen 4-6, 10, 13 und 24-28 zu erkennen. "
		   });
		addAnnotation
		  (getSignal_Rahmen_IDSignalNachordnung(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung von nachgeordneten Signalen. Die Zuordnung von Signalbegriffen eines nachgeordneten Signals zu einem anderen Signal ohne Bezug zur Fahrstra\u00dfe, wie bei Signalfahrtanzeigern, Signalhaltmeldern, Zugabfertigungssignalen Zp 9/10, erfolgt \u00fcber ID_Signal_Nachordnung. Signalbegriffe nachgeordneter Signale, die dabei n (n\\u0026gt;1) Signalen zugeordnet sind, erhalten n logische Signalrahmen mit den jeweils zutreffenden (ggf. identischen) Signalbegriffen, die je nach Hersteller mit n physischen Signalanzeigern (Signal_Befestigungen) oder gemeinsam in einem physischen Signalanzeiger realisiert werden. Zur ausf\u00fchrlichen Beschreibung der Modellierung eines Signals s. Modellierung Signal. DB-Regelwerk Sicherungstechnischer Lageplan, B\u00dc-Lageplan; oft als Bestandteil der Bezeichnung des Signals "
		   });
		addAnnotation
		  (getSignal_Rahmen_RahmenArt(),
		   source,
		   new String[] {
			   "documentation", "Beschreibung des Signalrahmens, um auch ohne Regelzeichnung die grunds\u00e4tzliche Art erkennen zu k\u00f6nnen. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk Im bisherigen PT 1 keine eindeutige Darstellung, in der Regel aus den Eintr\u00e4gen in der Signaltabelle1 zu erkennen. "
		   });
		addAnnotation
		  (getSignal_Rahmen_RahmenHoehe(),
		   source,
		   new String[] {
			   "documentation", "H\u00f6he des Rahmen-Mittelpunkts \u00fcber Schienenoberkante (SO). Die Angabe ist f\u00fcr die Zusammenstellung von Bauteilgruppen im BIM-Kontext relevant."
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_AttributeGroup_AutoEinstellung(),
		   source,
		   new String[] {
			   "documentation", "Art der automatischen Einstellung.\nDB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung; bei realen, aktiven Signalen mittelbar aus Angaben in der Zugstra\u00dfentabelle zu erkennen."
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_AttributeGroup_IDStellelement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Objekt Stellelement zur Zusammenfassung von Eigenschaften der Objekte BUE Schnittstelle, PZB Element, Schluesselsperre, Signal, W Kr Gsp Element. Das Stellelement enth\u00e4lt Informationen \u00fcber den energetischen und logischen Anschluss der Objekte. F\u00fcr das PZB Element ist der Verweis nur zu f\u00fcllen, wenn das PZB_Element eine G\u00dc ist. DB-Regelwerk Bisher ohne eindeutige Darstellung "
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_AttributeGroup_SonstigeZulaessigeAnordnung(),
		   source,
		   new String[] {
			   "documentation", "Anordnung von Aktiven Signalen bei mehreren parallelen Strecken oder beim Zusammenlauf von Strecken. DB-Regelwerk 819.0202 A03, Planungsdaten: Signaltabelle 1, Zeile 2. "
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_AttributeGroup_Tunnelsignal(),
		   source,
		   new String[] {
			   "documentation", "Enth\u00e4lt zus\u00e4tzliche Angaben zu Aktiven Signalen mit schaltbaren Signalbegriffen bez\u00fcglich der Nachtschaltung. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung. "
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunkt(),
		   source,
		   new String[] {
			   "documentation", "Punkt, auf den das Signal in besonderen F\u00e4llen ausgerichtet werden soll. Im Allgemeinen werden Signale auf einen Punkt ausgerichtet, der sich in der Richtpunktentfernung vor dem Signal in dem Gleis befindet, dem das Signal zugeordnet ist. In diesem Fall wird das Attribut nicht bef\u00fcllt. In besonderen F\u00e4llen (z.B. Gleisverzeigungen oder extreme Kurvenlagen im Ann\u00e4herungsbereich zum Signal) kann es jedoch erforderlich sein, explizit einen Richtpunkt au\u00dferhalb dieses Gleises festzulegen. "
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunktentfernung(),
		   source,
		   new String[] {
			   "documentation", "Entfernung des Ausrichtpunktes eines Schirm-Signals. Beschreibt den Schnittpunkt der Sichtachse der Signaloptiken mit dem Gleis, dem das Signal zugeordnet ist, die Angabe erfolgt in Meter. In der Regel werden daf\u00fcr 500 m f\u00fcr Haupt- und Mehrabschnittssignale und 300 m f\u00fcr Vorsignale und Vorsignalwiederholer verwendet. Entsprechend der Funktion des Signals und den \u00f6rtlichen Bedingungen k\u00f6nnen jedoch auch andere Werte verwendet werden. DB-Regelwerk Planungsdaten: Signaltabelle 1, Zeile 8 "
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_SignalArt(),
		   source,
		   new String[] {
			   "documentation", "Ausbildung des Signalschirms eines Schirm-Signals im Sicherungstechnischen Lageplan und in der Au\u00dfenanlage. Dieses Attribut erm\u00f6glicht bei allen Schirmsignalen (s. Modellierung Signal), die grunds\u00e4tzliche Art des Signals zu erkennen, ohne die zugeh\u00f6rige Regelzeichnung zu lesen. Eine Ausnahme bildet der ENUM-Wert \\\"andere\\\", hier muss die Art des Signals aus der Regelzeichnung entnommen werden. Dieser Wert wird bei allen realen Signalen verwendet, die keine Schirmsignale sind. Unter Mehrabschnittssignal wird dabei jegliche Kombination eines Hauptsignal- mit einem Vorsignalbegriff verstanden, unabh\u00e4ngig von der konkreten technischen Ausf\u00fchrung. So werden auch Signale des H/V-Signalsystems, die am Mast des Hauptsignals ein Vorsignal tragen, als Mehrabschnittssignale bezeichnet. Die Einf\u00fcgung der Silbe -sperr- bei Haupt- und Mehrabschnittssignalen bedeutet, dass an diesen Signalen zus\u00e4tzlich ein Rangierfahrtsignal angebracht ist. Dabei ist es irrelevant, ob dies in einem eigenen Bauteil am Signal erfolgt oder ob die Optiken im Signalschirm des Haupt- oder Mehrabschnittssignalen untergebracht sind. DB-Regelwerk Planungsdaten: Sicherungstechnischer Lageplan "
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_Signalsystem(),
		   source,
		   new String[] {
			   "documentation", "Zugeh\u00f6rigkeit eines Schirm-Signals zu einem der Signalsysteme. Dieses Attribut wird nur bei Haupt-, Vor- und Mehrabschnittssignalen sowie B\u00dc-Signalen belegt. DB-Regelwerk 301.0101-04, 301.0201, Planungsdaten: Sicherungstechnischer Lageplan, mittelbar aus den Angaben in den Signaltabellen 1 und 2 zu erkennen. "
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeArt(),
		   source,
		   new String[] {
			   "documentation", "Art und Bezeichnung der Streuscheibe eines Schirm-Signals, die der Signalsichtbestimmung zugrunde liegt. DB-Regelwerk Planungsdaten: Signaltabelle 1, Zeile 9 (erster Eintrag) "
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeBetriebsstellung(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung der Stellung der Streuscheibe eines Schirm-Signals, die der Signalsichtbestimmung zugrunde liegt. Bei der Betriebsstellung \\\"...gw\\\" ist die jeweilige Streuscheibe gewendet. DB-Regelwerk Planungsdaten: Signaltabelle 1, Zeile 9 (zweiter Eintrag) "
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_Dunkelschaltung(),
		   source,
		   new String[] {
			   "documentation", "Zusatzangabe, ob ein Schirm-Signal dunkel geschaltet werden kann. Die Dunkelschaltung ist z. B. bei Strecken mit LZB-gef\u00fchrten Zugfahrten und bei Schnittstellen zu SIL 2 - ESTW relevant. Die Angabe ist bei Haupt- und Vorsignalen erforderlich, nicht jedoch f\u00fcr Sperrsignale. Wertzuordnung: true - Signal muss dunkel geschaltet werden k\u00f6nnen, false - Signal muss nicht dunkel geschaltet werden k\u00f6nnen. DB-Regelwerk Planungsdaten: Signaltabelle 1, Zeile 40"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_FunktionOhneSignal(),
		   source,
		   new String[] {
			   "documentation", "Angabe zus\u00e4tzlicher Fahrstra\u00dfenfunktionen ohne Signal (RS = Rangierstra\u00dfenfunktion ohne Signal zur Anwendung bei Hauptsignalen ohne Ls-Anteil, ZS = Zugstra\u00dfenfunktion ohne Signal zur Anwendung bei Ls-Signalen)."
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_Geltungsbereich(),
		   source,
		   new String[] {
			   "documentation", "Geltungsbereich, dem das Signal zugeordnet wird (DS/DV). Die Angabe wird u. a. zur Unterscheidung Sh 1/Ra 12 vorgesehen. Eine Mehrfachangabe ist bei Mischbetrieb Fernbahn/S-Bahn erforderlich."
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalBefestigungsart(),
		   source,
		   new String[] {
			   "documentation", "Grunds\u00e4tzliche Art der Befestigung eines Signals. Einzelne Elemente des Signals (z. B. ein zum Hauptsignal geh\u00f6rendes, nicht am Hauptsignalmast angebrachtes Zusatzsignal) k\u00f6nnen von der grunds\u00e4tzlichen Befestigungsart abweichen, die exakte Konstruktion des Gesamtsignals ist im Modell in den Instanzen des Objekts Signal Befestigung dargestellt. DB-Regelwerk Signaltabelle 1, Zeile 12 "
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalFunktion(),
		   source,
		   new String[] {
			   "documentation", "Angabe der betrieblichen Funktion eines realen Signals f\u00fcr Zugfahrten. Hauptsignale und Mehrabschnittssignale bzw. entsprechende Tafeln werden dabei detailliert in Einfahr-, Ausfahr-, Zwischen-, Nachr\u00fcck-, Block-, Deckungs-, Zugdeckungs- oder Gruppensignale bzw. Kombinationen aus diesen betrieblichen Funktionen unterteilt. Von den anderen aktiven Signalen wird nur noch das Zugzielsignal (z.B. hohes Sperrsignal als Zielsignal bei Zugfahrten) sowie das alleinstehende Zusatzsignal mit einem eigenen Attributwert hervorgehoben, alle weiteren aktiven Signale werden unter \\\"andere\\\" zusammengefasst. F\u00fcr Gz, Tafeln und Vorsignalbaken etc. ist die Angabe nicht erforderlich. DB-Regelwerk 301, 819.20, Planungsdaten: im bisherigen PT 1 nur bei Signalen im Geltungsbereich der Ril 819.20, Tabelle f\u00fcr Signalabst\u00e4nde und Schutzstrecken, sonst ohne eindeutige Darstellung. "
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalsichtErreichbar(),
		   source,
		   new String[] {
			   "documentation", "Tats\u00e4chlich erreichbare Signalsicht innerhalb der Sollsignalsicht. Die Signalsicht beschreibt die Entfernung, ab der ein Aktives Signal eindeutig erkennbar sein soll (Sollsignalsicht) bzw. muss (Mindestsignalsicht), so dass vom Triebfahrzeugf\u00fchrer grunds\u00e4tzliche Handlungsweisen daraus ableitbar sind. Die erreichbare Signalsicht darf unter bestimmten Voraussetzungen kleiner als die Sollsignalsicht, jedoch nur mit besonderen Ma\u00dfnahmen kleiner als die Mindestsignalsicht sein. Die Signalsicht ist an das gesamte Signal gekoppelt, das bedeutet jedoch nicht, dass jeder Signalbegriff von Beginn der Signalsicht an vollst\u00e4ndig gelesen werden muss - die Festlegungen daf\u00fcr finden sich in den zugeh\u00f6rigen detaillierten Regelzeichnungen oder anderen Zulassungsdokumenten. DB-Regelwerk 819.02, 819.03, Planungsdaten: im bisherigen PT1 ohne eindeutige Darstellung, erg\u00e4nzt die Eintr\u00e4ge in Zeile 7 der Signaltabelle 1 um den Wert der am konkreten Ort erreichbaren Signalsicht "
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalsichtMindest(),
		   source,
		   new String[] {
			   "documentation", "Mindestsignalsicht gem\u00e4\u00df \u00f6rtlich zugelassener Geschwindigkeit vor dem Signal nach 6,75 s-Regel. Die Signalsicht beschreibt die Entfernung, ab der ein Aktives Signal eindeutig erkennbar sein soll (Sollsignalsicht) bzw. muss (Mindestsignalsicht), so dass vom Triebfahrzeugf\u00fchrer grunds\u00e4tzliche Handlungsweisen daraus ableitbar sind. Die erreichbare Signalsicht darf nur mit zus\u00e4tzlichen Ma\u00dfnahmen kleiner als die Mindestsignalsicht sein. Die Signalsicht ist an das gesamte Signal gekoppelt, das bedeutet jedoch nicht, dass jeder Signalbegriff von Beginn der Signalsicht an vollst\u00e4ndig gelesen werden muss - die Festlegungen daf\u00fcr finden sich in den zugeh\u00f6rigen detaillierten Regelzeichnungen oder anderen Zulassungsdokumenten. DB-Regelwerk 819.02, 819.03, Planungsdaten: entspricht dem zweiten (eingeklammerten) Eintrag in Zeile 7 der Signaltabelle 1. "
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalsichtSoll(),
		   source,
		   new String[] {
			   "documentation", "Sollsignalsicht gem\u00e4\u00df \u00f6rtlich zugelassener Geschwindigkeit vor dem Signal. Die Signalsicht beschreibt die Entfernung, ab der ein Aktives Signal eindeutig erkennbar sein soll (Sollsignalsicht) bzw. muss (Mindestsignalsicht), so dass vom Triebfahrzeugf\u00fchrer grunds\u00e4tzliche Handlungsweisen daraus ableitbar sind. Die erreichbare Signalsicht darf unter bestimmten Voraussetzungen kleiner als die Sollsignalsicht sein. Die Signalsicht ist an das gesamte Signal gekoppelt, das bedeutet jedoch nicht, dass jeder Signalbegriff von Beginn der Signalsicht an vollst\u00e4ndig gelesen werden muss - die Festlegungen daf\u00fcr finden sich in den zugeh\u00f6rigen detaillierten Regelzeichnungen oder anderen Zulassungsdokumenten. DB-Regelwerk 819.02, 819.03, Planungsdaten: entspricht dem ersten Eintrag in Zeile 7 der Signaltabelle 1. "
		   });
		addAnnotation
		  (signal_SignalbegriffEClass,
		   source,
		   new String[] {
			   "documentation", "Stellt eine Information optisch dar, die das Signal dem Triebfahrzeugf\u00fchrer \u00fcbermitteln soll. Signalbegriffe werden im Signalbuch (Ril 301) durch eine Kurzbezeichnung (z. B. \\\"Zs 1\\\") und / oder durch eine Langbezeichnung (z. B. \\\"Ersatzsignal\\\") beschrieben. Diese und weitere feste Eigenschaften wie der Wertevorrat der anzeigbaren Symbole eines Signalbegriffs sind im Objekt Signalbegriff definiert, das mittels des Attributes Signalbegriff ID eingebunden wird. Anschaltdauer, Beleuchtung und Schaltbarkeit sind nicht fest, sondern w\u00e4hlbar an den Signalbegriff nach Signalbuch gekoppelt und so Eigenschaft des Objekts Signal_Signalbegriff. Ein Signal_Signalbegriff befindet sich immer in einem Signal Rahmen. Ausf\u00fchrliche Beschreibung s. Modellierung Signal DB-Regelwerk Ril 301, Planungsdaten: Sicherungstechnischer Lageplan, statische Eigenschaften: Signaltabelle 1, dynamische Eigenschaften: Signaltabelle 2. "
		   });
		addAnnotation
		  (getSignal_Signalbegriff_IDSignalRahmen(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den den Signalbegriff beinhaltenden Signal Rahmen. "
		   });
		addAnnotation
		  (getSignal_Signalbegriff_SignalbegriffID(),
		   source,
		   new String[] {
			   "documentation", "Identifikator des einzubindenden Signalbegriffs. Der Wert f\u00fcr dieses Attribut ist aus einer vorgegebenen Liste (Objektnamen aus TCSignalbegriff) ausw\u00e4hlbar. Die Verkn\u00fcpfung unterscheidet sich von den sonst im Modell \u00fcblichen GUID-Verweisen, daher wurde bei der Bildung des Attributnamens auch von der Form \\\"ID_...\\\" abgewichen. DB-Regelwerk Signaltabelle 1, ist aus den Eintr\u00e4gen in Zeilen 14-27 zu erkennen. "
		   });
		addAnnotation
		  (getSignal_Signalbegriff_Allg_AttributeGroup_Anschaltdauer(),
		   source,
		   new String[] {
			   "documentation", "Anschaltdauer des Signalbegriffes. Eingetragen wird bei Ersatzsignal als Standardwert \\\"Z\\\" (zeitgesteuert - einheitlich 90 s); bei technisch abh\u00e4ngigen Signalbegriffen (z. B. Fahrtbegriffen) ein \\\"T\\\" sowie f\u00fcr Grundstellungsbegriffe ein \\\"G\\\". Es ist dabei unerheblich, wodurch die Abschaltung erzielt wird, z.B. sind auch mechanische Vorg\u00e4nge m\u00f6glich. Deswegen ist die Ausrichtung des Signalbegriffs mit zu betrachten, so leuchtet zwar ein Weichenlagemelder (z. B. Wn 1) st\u00e4ndig, der Signalbegriff ist aber nur angeschaltet, wenn er in der Richtung des Weichenanfangs zeigt. Weichenlagemelder haben deshalb die Anschaltdauer \\\"T\\\". DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung."
		   });
		addAnnotation
		  (getSignal_Signalbegriff_Allg_AttributeGroup_Beleuchtet(),
		   source,
		   new String[] {
			   "documentation", "Gibt an, ob ein beleuchtbarer Signalbegriff beleuchtet wird. Als \\\"Beleuchtet\\\" gilt, wenn zur besseren Erkennbarkeit eines Signalbegriffs eine zus\u00e4tzliche, signaltechnisch nicht \u00fcberwachte Lichtquelle angebracht ist. Das Attribut ist dann und nur dann erforderlich, wenn das Attribut \\\"Beleuchtbar\\\" im zugeh\u00f6rigen Signalbegriff den Wert \\\"true\\\" hat. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung."
		   });
		addAnnotation
		  (getSignal_Signalbegriff_Allg_AttributeGroup_Geschaltet(),
		   source,
		   new String[] {
			   "documentation", "Gibt an, ob ein schaltbarer Signalbegriff durch eine Au\u00dfenelement-Ansteuerung den betrieblichen Erfordernissen am Signal aktiv angepasst werden kann. Das Attribut ist dann und nur dann erforderlich, wenn das Attribut \\\"Schaltbar\\\" im zugeh\u00f6rigen Signalbegriff den Wert \\\"true\\\" hat. Wertzuordnung: true - Signalbegriff ist (schaltbar und) geschaltet, false - Signalbegriff ist (schaltbar, aber) nicht geschaltet. Beispiel: Zs 3 ist grunds\u00e4tzlich schaltbar (Schaltbar == \\\"true\\\"). Bei Ausf\u00fchrung aus Lichtsignal ist Geschaltet == \\\"true\\\", bei Ausf\u00fchrung als Blechtafel ist Geschaltet == \\\"false\\\". DB-Regelwerk Im bisherigen PT 1 ohne eindeutige Darstellung, oft aus dem Symbol des Signals im Sicherungstechnischen Lageplan / B\u00dc-Lageplan zu erkennen."
		   });
		addAnnotation
		  (getSignal_Signalbegriff_Allg_AttributeGroup_Zs2Ueberwacht(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob die Anschaltung von Zs 2 bzw. Zs 2v zu \u00fcberwachen ist (true) oder nicht (false). Die Angabe erfolgt nur f\u00fcr die Signalbegriffe Zs 2 und Zs 2v. \nDas Zs 2v wird i. d. R. \u00fcberwacht, wenn auch das zugeh\u00f6rige Zs 2 \u00fcberwacht wird. Ausnahmen sind m\u00f6glich, wenn f\u00fcr ein zwingend zu \u00fcberwachendes Zs 2 keine Vorsignalisierung erforderlich ist, diese aber auf Wunsch des Bestellers vorgesehen wird.\nDB-Regelwerk \nRil 819.0204 3 (2) Richtungsanzeiger anwenden Zwang"
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
		  (anschaltdauer_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAnschaltdauer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnschaltdauer_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (auto_Einstellung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAuto_Einstellung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAuto_Einstellung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (befestigung_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBefestigung_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBefestigung_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (beleuchtet_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBeleuchtet",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBeleuchtet_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (besetzte_Ausfahrt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBesetzte_Ausfahrt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBesetzte_Ausfahrt_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (dA_Manuell_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDA_Manuell",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDA_Manuell_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (dunkelschaltung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDunkelschaltung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDunkelschaltung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (durchfahrt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDurchfahrt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDurchfahrt_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumAnschaltdauerEEnum,
		   source,
		   new String[] {
			   "name", "ENUMAnschaltdauer"
		   });
		addAnnotation
		  (enumAnschaltdauerObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMAnschaltdauer:Object",
			   "baseType", "ENUMAnschaltdauer"
		   });
		addAnnotation
		  (enumAutoEinstellungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMAuto_Einstellung"
		   });
		addAnnotation
		  (enumAutoEinstellungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMAuto_Einstellung:Object",
			   "baseType", "ENUMAuto_Einstellung"
		   });
		addAnnotation
		  (enumBefestigungArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBefestigung_Art"
		   });
		addAnnotation
		  (enumBefestigungArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBefestigung_Art:Object",
			   "baseType", "ENUMBefestigung_Art"
		   });
		addAnnotation
		  (enumBeleuchtetEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBeleuchtet"
		   });
		addAnnotation
		  (enumBeleuchtetObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBeleuchtet:Object",
			   "baseType", "ENUMBeleuchtet"
		   });
		addAnnotation
		  (enumDurchfahrtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMDurchfahrt"
		   });
		addAnnotation
		  (enumDurchfahrtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMDurchfahrt:Object",
			   "baseType", "ENUMDurchfahrt"
		   });
		addAnnotation
		  (enumFiktivesSignalFunktionEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFiktives_Signal_Funktion"
		   });
		addAnnotation
		  (enumFiktivesSignalFunktionObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFiktives_Signal_Funktion:Object",
			   "baseType", "ENUMFiktives_Signal_Funktion"
		   });
		addAnnotation
		  (enumFundamentArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFundament_Art"
		   });
		addAnnotation
		  (enumFundamentArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFundament_Art:Object",
			   "baseType", "ENUMFundament_Art"
		   });
		addAnnotation
		  (enumFunktionOhneSignalEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFunktion_Ohne_Signal"
		   });
		addAnnotation
		  (enumFunktionOhneSignalObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFunktion_Ohne_Signal:Object",
			   "baseType", "ENUMFunktion_Ohne_Signal"
		   });
		addAnnotation
		  (enumGeltungsbereichEEnum,
		   source,
		   new String[] {
			   "name", "ENUMGeltungsbereich"
		   });
		addAnnotation
		  (enumGeltungsbereichObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMGeltungsbereich:Object",
			   "baseType", "ENUMGeltungsbereich"
		   });
		addAnnotation
		  (enumRahmenArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMRahmen_Art"
		   });
		addAnnotation
		  (enumRahmenArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMRahmen_Art:Object",
			   "baseType", "ENUMRahmen_Art"
		   });
		addAnnotation
		  (enumSignalArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSignal_Art"
		   });
		addAnnotation
		  (enumSignalArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSignal_Art:Object",
			   "baseType", "ENUMSignal_Art"
		   });
		addAnnotation
		  (enumSignalBefestigungsartEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSignal_Befestigungsart"
		   });
		addAnnotation
		  (enumSignalBefestigungsartObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSignal_Befestigungsart:Object",
			   "baseType", "ENUMSignal_Befestigungsart"
		   });
		addAnnotation
		  (enumSignalFunktionEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSignal_Funktion"
		   });
		addAnnotation
		  (enumSignalFunktionObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSignal_Funktion:Object",
			   "baseType", "ENUMSignal_Funktion"
		   });
		addAnnotation
		  (enumSignalsystemEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSignalsystem"
		   });
		addAnnotation
		  (enumSignalsystemObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSignalsystem:Object",
			   "baseType", "ENUMSignalsystem"
		   });
		addAnnotation
		  (enumSonstigeZulaessigeAnordnungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSonstige_Zulaessige_Anordnung"
		   });
		addAnnotation
		  (enumSonstigeZulaessigeAnordnungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSonstige_Zulaessige_Anordnung:Object",
			   "baseType", "ENUMSonstige_Zulaessige_Anordnung"
		   });
		addAnnotation
		  (enumStreuscheibeArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMStreuscheibe_Art"
		   });
		addAnnotation
		  (enumStreuscheibeArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMStreuscheibe_Art:Object",
			   "baseType", "ENUMStreuscheibe_Art"
		   });
		addAnnotation
		  (enumStreuscheibeBetriebsstellungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMStreuscheibe_Betriebsstellung"
		   });
		addAnnotation
		  (enumStreuscheibeBetriebsstellungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMStreuscheibe_Betriebsstellung:Object",
			   "baseType", "ENUMStreuscheibe_Betriebsstellung"
		   });
		addAnnotation
		  (enumTunnelsignalEEnum,
		   source,
		   new String[] {
			   "name", "ENUMTunnelsignal"
		   });
		addAnnotation
		  (enumTunnelsignalObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMTunnelsignal:Object",
			   "baseType", "ENUMTunnelsignal"
		   });
		addAnnotation
		  (fiktives_Signal_Funktion_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFiktives_Signal_Funktion",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFiktives_Signal_Funktion_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fundament_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFundament_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFundament_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (funktion_Ohne_Signal_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFunktion_Ohne_Signal",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunktion_Ohne_Signal_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (gegengleis_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGegengleis",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGegengleis_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (geltungsbereich_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGeltungsbereich",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeltungsbereich_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (geschaltet_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGeschaltet",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeschaltet_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (hoehe_Fundamentoberkante_TypeEDataType,
		   source,
		   new String[] {
			   "name", "THoehe_Fundamentoberkante",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter",
			   "pattern", "(-?((1\\.(250|2[0-4][0-9]|[01][0-9]{2}))|(0\\.([1-9][0-9]{2}|0[0-9][1-9]|0[1-9]0))))|0\\.000"
		   });
		addAnnotation
		  (hoehe_Fundamentoberkante_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHoehe_Fundamentoberkante",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHoehe_Fundamentoberkante_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (obere_Lichtpunkthoehe_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TObere_Lichtpunkthoehe",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter",
			   "pattern", "0\\.(22[5-9]|2[3-9][0-9]|[3-9][0-9]{2})|([1-9]|1[0-4])\\.[0-9]{3}|15.000"
		   });
		addAnnotation
		  (obere_Lichtpunkthoehe_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCObere_Lichtpunkthoehe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getObere_Lichtpunkthoehe_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (pzB_Schutzstrecke_Soll_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TPZB_Schutzstrecke_Soll",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter",
			   "pattern", "2[0-9][0-9]|[34][0-9]{2}|5[0-4][0-9]|550"
		   });
		addAnnotation
		  (pzB_Schutzstrecke_Soll_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPZB_Schutzstrecke_Soll",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPZB_Schutzstrecke_Soll_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (rahmen_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRahmen_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRahmen_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (rahmen_Hoehe_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TRahmen_Hoehe",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter"
		   });
		addAnnotation
		  (rahmen_Hoehe_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRahmen_Hoehe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRahmen_Hoehe_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (rangierstrasse_Restaufloesung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRangierstrasse_Restaufloesung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRangierstrasse_Restaufloesung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (richtpunkt_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TRichtpunkt",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText",
			   "pattern", ".{1,16}"
		   });
		addAnnotation
		  (richtpunkt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRichtpunkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRichtpunkt_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (richtpunktentfernung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TRichtpunktentfernung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter",
			   "pattern", "[1-9][0-9]{0,1}|[1-4][0-9]{2}|500"
		   });
		addAnnotation
		  (richtpunktentfernung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRichtpunktentfernung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRichtpunktentfernung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (signalEClass,
		   source,
		   new String[] {
			   "name", "CSignal",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getSignal_PZBSchutzstreckeSoll(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PZB_Schutzstrecke_Soll"
		   });
		addAnnotation
		  (getSignal_SignalFstr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signal_Fstr"
		   });
		addAnnotation
		  (getSignal_SignalFstrAusInselgleis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signal_Fstr_Aus_Inselgleis"
		   });
		addAnnotation
		  (getSignal_SignalFstrS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signal_Fstr_S"
		   });
		addAnnotation
		  (getSignal_SignalFiktiv(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signal_Fiktiv"
		   });
		addAnnotation
		  (getSignal_SignalReal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signal_Real"
		   });
		addAnnotation
		  (signal_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSignal_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (signal_BefestigungEClass,
		   source,
		   new String[] {
			   "name", "CSignal_Befestigung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Befestigung_IDRegelzeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Regelzeichnung"
		   });
		addAnnotation
		  (getSignal_Befestigung_SignalBefestigungAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signal_Befestigung_Allg"
		   });
		addAnnotation
		  (getSignal_Befestigung_IDBefestigungBauwerk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Befestigung_Bauwerk"
		   });
		addAnnotation
		  (getSignal_Befestigung_IDSignalBefestigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal_Befestigung"
		   });
		addAnnotation
		  (signal_Befestigung_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSignal_Befestigung_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Befestigung_Allg_AttributeGroup_BefestigungArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Befestigung_Art"
		   });
		addAnnotation
		  (getSignal_Befestigung_Allg_AttributeGroup_FundamentArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fundament_Art"
		   });
		addAnnotation
		  (getSignal_Befestigung_Allg_AttributeGroup_HoeheFundamentoberkante(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hoehe_Fundamentoberkante"
		   });
		addAnnotation
		  (getSignal_Befestigung_Allg_AttributeGroup_ObereLichtpunkthoehe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Obere_Lichtpunkthoehe"
		   });
		addAnnotation
		  (signal_Befestigungsart_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSignal_Befestigungsart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Befestigungsart_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (signal_Fank_ZuordnungEClass,
		   source,
		   new String[] {
			   "name", "CSignal_Fank_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Fank_Zuordnung_IDSignalFank(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal_Fank"
		   });
		addAnnotation
		  (getSignal_Fank_Zuordnung_IDSignalStart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal_Start"
		   });
		addAnnotation
		  (signal_Fiktiv_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSignal_Fiktiv",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Fiktiv_AttributeGroup_AutoEinstellung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Auto_Einstellung"
		   });
		addAnnotation
		  (getSignal_Fiktiv_AttributeGroup_FiktivesSignalFunktion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fiktives_Signal_Funktion"
		   });
		addAnnotation
		  (signal_Fstr_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSignal_Fstr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Fstr_AttributeGroup_BesetzteAusfahrt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Besetzte_Ausfahrt"
		   });
		addAnnotation
		  (getSignal_Fstr_AttributeGroup_DAManuell(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DA_Manuell"
		   });
		addAnnotation
		  (getSignal_Fstr_AttributeGroup_Durchfahrt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Durchfahrt"
		   });
		addAnnotation
		  (getSignal_Fstr_AttributeGroup_IDRaZielErlaubnisabhaengig(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_RaZiel_Erlaubnisabhaengig"
		   });
		addAnnotation
		  (getSignal_Fstr_AttributeGroup_RangierstrasseRestaufloesung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Rangierstrasse_Restaufloesung"
		   });
		addAnnotation
		  (signal_Fstr_Aus_Inselgleis_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSignal_Fstr_Aus_Inselgleis",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDRaFahrtGleichzeitigVerbot(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_RaFahrt_Gleichzeitig_Verbot"
		   });
		addAnnotation
		  (getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDZgFahrtGleichzeitigVerbot(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZgFahrt_Gleichzeitig_Verbot"
		   });
		addAnnotation
		  (signal_Fstr_S_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSignal_Fstr_S",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Fstr_S_AttributeGroup_Gegengleis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Gegengleis"
		   });
		addAnnotation
		  (getSignal_Fstr_S_AttributeGroup_IDAnrueckverschluss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anrueckverschluss"
		   });
		addAnnotation
		  (getSignal_Fstr_S_AttributeGroup_IDZweitesHaltfallkriterium(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Zweites_Haltfallkriterium"
		   });
		addAnnotation
		  (signal_Funktion_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSignal_Funktion",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Funktion_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (signal_RahmenEClass,
		   source,
		   new String[] {
			   "name", "CSignal_Rahmen",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Rahmen_IDRegelzeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Regelzeichnung"
		   });
		addAnnotation
		  (getSignal_Rahmen_IDSignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal"
		   });
		addAnnotation
		  (getSignal_Rahmen_IDSignalBefestigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal_Befestigung"
		   });
		addAnnotation
		  (getSignal_Rahmen_IDSignalNachordnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal_Nachordnung"
		   });
		addAnnotation
		  (getSignal_Rahmen_RahmenArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Rahmen_Art"
		   });
		addAnnotation
		  (getSignal_Rahmen_RahmenHoehe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Rahmen_Hoehe"
		   });
		addAnnotation
		  (signal_Real_Aktiv_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSignal_Real_Aktiv",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_AttributeGroup_AutoEinstellung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Auto_Einstellung"
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_AttributeGroup_IDStellelement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Stellelement"
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_AttributeGroup_SonstigeZulaessigeAnordnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sonstige_Zulaessige_Anordnung"
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_AttributeGroup_Tunnelsignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Tunnelsignal"
		   });
		addAnnotation
		  (signal_Real_Aktiv_Schirm_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSignal_Real_Aktiv_Schirm",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Richtpunkt"
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunktentfernung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Richtpunktentfernung"
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_SignalArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signal_Art"
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_Signalsystem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signalsystem"
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Streuscheibe_Art"
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeBetriebsstellung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Streuscheibe_Betriebsstellung"
		   });
		addAnnotation
		  (signal_Real_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSignal_Real",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_Dunkelschaltung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Dunkelschaltung"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_FunktionOhneSignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Funktion_Ohne_Signal"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_Geltungsbereich(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Geltungsbereich"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalBefestigungsart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signal_Befestigungsart"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalFunktion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signal_Funktion"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalRealAktiv(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signal_Real_Aktiv"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalRealAktivSchirm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signal_Real_Aktiv_Schirm"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalsichtErreichbar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signalsicht_Erreichbar"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalsichtMindest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signalsicht_Mindest"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalsichtSoll(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signalsicht_Soll"
		   });
		addAnnotation
		  (signal_SignalbegriffEClass,
		   source,
		   new String[] {
			   "name", "CSignal_Signalbegriff",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Signalbegriff_IDSignalRahmen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal_Rahmen"
		   });
		addAnnotation
		  (getSignal_Signalbegriff_SignalSignalbegriffAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signal_Signalbegriff_Allg"
		   });
		addAnnotation
		  (getSignal_Signalbegriff_SignalbegriffID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signalbegriff_ID"
		   });
		addAnnotation
		  (signal_Signalbegriff_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSignal_Signalbegriff_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignal_Signalbegriff_Allg_AttributeGroup_Anschaltdauer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Anschaltdauer"
		   });
		addAnnotation
		  (getSignal_Signalbegriff_Allg_AttributeGroup_Beleuchtet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Beleuchtet"
		   });
		addAnnotation
		  (getSignal_Signalbegriff_Allg_AttributeGroup_Geschaltet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Geschaltet"
		   });
		addAnnotation
		  (getSignal_Signalbegriff_Allg_AttributeGroup_Zs2Ueberwacht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zs2_Ueberwacht"
		   });
		addAnnotation
		  (signalsicht_Erreichbar_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TSignalsicht_Erreichbar",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter",
			   "pattern", "[1-9][0-9]{0,1}|[1-4][0-9]{2}|500"
		   });
		addAnnotation
		  (signalsicht_Erreichbar_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSignalsicht_Erreichbar",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignalsicht_Erreichbar_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (signalsicht_Mindest_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TSignalsicht_Mindest",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter",
			   "pattern", "[1-9][0-9]{0,1}|[1-2][0-9]{2}|300"
		   });
		addAnnotation
		  (signalsicht_Mindest_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSignalsicht_Mindest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignalsicht_Mindest_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (signalsicht_Soll_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TSignalsicht_Soll",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter",
			   "pattern", "[1-9][0-9]{0,1}|[1-4][0-9]{2}|500"
		   });
		addAnnotation
		  (signalsicht_Soll_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSignalsicht_Soll",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignalsicht_Soll_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (signalsystem_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSignalsystem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignalsystem_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (sonstige_Zulaessige_Anordnung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSonstige_Zulaessige_Anordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSonstige_Zulaessige_Anordnung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (streuscheibe_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCStreuscheibe_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStreuscheibe_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (streuscheibe_Betriebsstellung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCStreuscheibe_Betriebsstellung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStreuscheibe_Betriebsstellung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (tunnelsignal_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTunnelsignal",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTunnelsignal_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zs2_Ueberwacht_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZs2_Ueberwacht",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZs2_Ueberwacht_TypeClass_Wert(),
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
		  (signalEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n              \r\n  <ppi:WorkflowInformation>\r\n                   \r\n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n                   \r\n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\r\n                \r\n  </ppi:WorkflowInformation>\r\n           \r\n"
		   });
		addAnnotation
		  (getSignal_PZBSchutzstreckeSoll(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                          \r\n  <ppi:WorkflowInformation>\r\n                               \r\n    <ppi:Patternbeschreibung> [200..550]</ppi:Patternbeschreibung>\r\n                            \r\n  </ppi:WorkflowInformation>\r\n                       \r\n"
		   });
		addAnnotation
		  (signal_BefestigungEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n              \r\n  <ppi:WorkflowInformation>\r\n                   \r\n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n                   \r\n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\r\n                \r\n  </ppi:WorkflowInformation>\r\n           \r\n"
		   });
		addAnnotation
		  (getSignal_Befestigung_Allg_AttributeGroup_HoeheFundamentoberkante(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung>[-1.250..1.250], 3 Nachkommastellen</ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSignal_Befestigung_Allg_AttributeGroup_ObereLichtpunkthoehe(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung> [0.225..15.000], immer drei Stellen nach dem Dezimaltrennzeichen </ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (signal_Fank_ZuordnungEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n              \r\n  <ppi:WorkflowInformation>\r\n                   \r\n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n                   \r\n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\r\n                \r\n  </ppi:WorkflowInformation>\r\n           \r\n"
		   });
		addAnnotation
		  (getSignal_Fstr_AttributeGroup_BesetzteAusfahrt(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:ProposedValue>false</ppi:ProposedValue>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSignal_Fstr_AttributeGroup_Durchfahrt(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:ProposedValue>erlaubt</ppi:ProposedValue>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (signal_RahmenEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n              \r\n  <ppi:WorkflowInformation>\r\n                   \r\n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n                   \r\n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\r\n                \r\n  </ppi:WorkflowInformation>\r\n           \r\n"
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunkt(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung>[1..16]</ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunktentfernung(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung> [1..500] </ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSignal_Real_Aktiv_Schirm_AttributeGroup_Signalsystem(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:PlanningStage>EP</ppi:PlanningStage>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalBefestigungsart(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalFunktion(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:PlanningStage>EP</ppi:PlanningStage>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalsichtErreichbar(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung> [1..500] </ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalsichtMindest(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung> [1..300] </ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSignal_Real_AttributeGroup_SignalsichtSoll(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:PlanningStage>EP</ppi:PlanningStage>\r\n                         \r\n    <ppi:Patternbeschreibung> [1..500] </ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (signal_SignalbegriffEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n              \r\n  <ppi:WorkflowInformation>\r\n                   \r\n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n                   \r\n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\r\n                \r\n  </ppi:WorkflowInformation>\r\n           \r\n"
		   });
		addAnnotation
		  (getSignal_Signalbegriff_Allg_AttributeGroup_Anschaltdauer(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:ProposedValue>T</ppi:ProposedValue>\r\n                         \r\n    <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSignal_Signalbegriff_Allg_AttributeGroup_Beleuchtet(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:ProposedValue>nein</ppi:ProposedValue>\r\n                         \r\n    <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSignal_Signalbegriff_Allg_AttributeGroup_Geschaltet(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSignal_Signalbegriff_Allg_AttributeGroup_Zs2Ueberwacht(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:ProposedValue>true</ppi:ProposedValue>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
	}

} //SignalePackageImpl
