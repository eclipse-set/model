/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Signale.impl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.set.model.model11001.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model11001.Signale.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SignaleFactoryImpl extends EFactoryImpl implements SignaleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SignaleFactory init() {
		try {
			SignaleFactory theSignaleFactory = (SignaleFactory)EPackage.Registry.INSTANCE.getEFactory(SignalePackage.eNS_URI);
			if (theSignaleFactory != null) {
				return theSignaleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SignaleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SignalePackage.ANSCHALTDAUER_TYPE_CLASS: return createAnschaltdauer_TypeClass();
			case SignalePackage.AUTO_EINSTELLUNG_TYPE_CLASS: return createAuto_Einstellung_TypeClass();
			case SignalePackage.BEFESTIGUNG_ART_TYPE_CLASS: return createBefestigung_Art_TypeClass();
			case SignalePackage.BELEUCHTET_TYPE_CLASS: return createBeleuchtet_TypeClass();
			case SignalePackage.BESETZTE_AUSFAHRT_TYPE_CLASS: return createBesetzte_Ausfahrt_TypeClass();
			case SignalePackage.DA_MANUELL_TYPE_CLASS: return createDA_Manuell_TypeClass();
			case SignalePackage.DUNKELSCHALTUNG_TYPE_CLASS: return createDunkelschaltung_TypeClass();
			case SignalePackage.DURCHFAHRT_TYPE_CLASS: return createDurchfahrt_TypeClass();
			case SignalePackage.FIKTIVES_SIGNAL_FUNKTION_TYPE_CLASS: return createFiktives_Signal_Funktion_TypeClass();
			case SignalePackage.FUNDAMENT_ART_TYPE_CLASS: return createFundament_Art_TypeClass();
			case SignalePackage.FUNKTION_OHNE_SIGNAL_TYPE_CLASS: return createFunktion_Ohne_Signal_TypeClass();
			case SignalePackage.GEGENGLEIS_TYPE_CLASS: return createGegengleis_TypeClass();
			case SignalePackage.GELTUNGSBEREICH_TYPE_CLASS: return createGeltungsbereich_TypeClass();
			case SignalePackage.GESCHALTET_TYPE_CLASS: return createGeschaltet_TypeClass();
			case SignalePackage.HOEHE_FUNDAMENTOBERKANTE_TYPE_CLASS: return createHoehe_Fundamentoberkante_TypeClass();
			case SignalePackage.OBERE_LICHTPUNKTHOEHE_TYPE_CLASS: return createObere_Lichtpunkthoehe_TypeClass();
			case SignalePackage.PZB_SCHUTZSTRECKE_SOLL_TYPE_CLASS: return createPZB_Schutzstrecke_Soll_TypeClass();
			case SignalePackage.RAHMEN_ART_TYPE_CLASS: return createRahmen_Art_TypeClass();
			case SignalePackage.RAHMEN_HOEHE_TYPE_CLASS: return createRahmen_Hoehe_TypeClass();
			case SignalePackage.RANGIERSTRASSE_RESTAUFLOESUNG_TYPE_CLASS: return createRangierstrasse_Restaufloesung_TypeClass();
			case SignalePackage.RICHTPUNKT_TYPE_CLASS: return createRichtpunkt_TypeClass();
			case SignalePackage.RICHTPUNKTENTFERNUNG_TYPE_CLASS: return createRichtpunktentfernung_TypeClass();
			case SignalePackage.SIGNAL: return createSignal();
			case SignalePackage.SIGNAL_ART_TYPE_CLASS: return createSignal_Art_TypeClass();
			case SignalePackage.SIGNAL_BEFESTIGUNG: return createSignal_Befestigung();
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP: return createSignal_Befestigung_Allg_AttributeGroup();
			case SignalePackage.SIGNAL_BEFESTIGUNGSART_TYPE_CLASS: return createSignal_Befestigungsart_TypeClass();
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG: return createSignal_Fank_Zuordnung();
			case SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP: return createSignal_Fiktiv_AttributeGroup();
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP: return createSignal_Fstr_AttributeGroup();
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP: return createSignal_Fstr_Aus_Inselgleis_AttributeGroup();
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP: return createSignal_Fstr_S_AttributeGroup();
			case SignalePackage.SIGNAL_FUNKTION_TYPE_CLASS: return createSignal_Funktion_TypeClass();
			case SignalePackage.SIGNAL_RAHMEN: return createSignal_Rahmen();
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP: return createSignal_Real_Aktiv_AttributeGroup();
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP: return createSignal_Real_Aktiv_Schirm_AttributeGroup();
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP: return createSignal_Real_AttributeGroup();
			case SignalePackage.SIGNAL_SIGNALBEGRIFF: return createSignal_Signalbegriff();
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP: return createSignal_Signalbegriff_Allg_AttributeGroup();
			case SignalePackage.SIGNALSICHT_ERREICHBAR_TYPE_CLASS: return createSignalsicht_Erreichbar_TypeClass();
			case SignalePackage.SIGNALSICHT_MINDEST_TYPE_CLASS: return createSignalsicht_Mindest_TypeClass();
			case SignalePackage.SIGNALSICHT_SOLL_TYPE_CLASS: return createSignalsicht_Soll_TypeClass();
			case SignalePackage.SIGNALSYSTEM_TYPE_CLASS: return createSignalsystem_TypeClass();
			case SignalePackage.SONSTIGE_ZULAESSIGE_ANORDNUNG_TYPE_CLASS: return createSonstige_Zulaessige_Anordnung_TypeClass();
			case SignalePackage.STREUSCHEIBE_ART_TYPE_CLASS: return createStreuscheibe_Art_TypeClass();
			case SignalePackage.STREUSCHEIBE_BETRIEBSSTELLUNG_TYPE_CLASS: return createStreuscheibe_Betriebsstellung_TypeClass();
			case SignalePackage.TUNNELSIGNAL_TYPE_CLASS: return createTunnelsignal_TypeClass();
			case SignalePackage.ZS2_UEBERWACHT_TYPE_CLASS: return createZs2_Ueberwacht_TypeClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SignalePackage.ENUM_ANSCHALTDAUER:
				return createENUMAnschaltdauerFromString(eDataType, initialValue);
			case SignalePackage.ENUM_AUTO_EINSTELLUNG:
				return createENUMAutoEinstellungFromString(eDataType, initialValue);
			case SignalePackage.ENUM_BEFESTIGUNG_ART:
				return createENUMBefestigungArtFromString(eDataType, initialValue);
			case SignalePackage.ENUM_BELEUCHTET:
				return createENUMBeleuchtetFromString(eDataType, initialValue);
			case SignalePackage.ENUM_DURCHFAHRT:
				return createENUMDurchfahrtFromString(eDataType, initialValue);
			case SignalePackage.ENUM_FIKTIVES_SIGNAL_FUNKTION:
				return createENUMFiktivesSignalFunktionFromString(eDataType, initialValue);
			case SignalePackage.ENUM_FUNDAMENT_ART:
				return createENUMFundamentArtFromString(eDataType, initialValue);
			case SignalePackage.ENUM_FUNKTION_OHNE_SIGNAL:
				return createENUMFunktionOhneSignalFromString(eDataType, initialValue);
			case SignalePackage.ENUM_GELTUNGSBEREICH:
				return createENUMGeltungsbereichFromString(eDataType, initialValue);
			case SignalePackage.ENUM_RAHMEN_ART:
				return createENUMRahmenArtFromString(eDataType, initialValue);
			case SignalePackage.ENUM_SIGNAL_ART:
				return createENUMSignalArtFromString(eDataType, initialValue);
			case SignalePackage.ENUM_SIGNAL_BEFESTIGUNGSART:
				return createENUMSignalBefestigungsartFromString(eDataType, initialValue);
			case SignalePackage.ENUM_SIGNAL_FUNKTION:
				return createENUMSignalFunktionFromString(eDataType, initialValue);
			case SignalePackage.ENUM_SIGNALSYSTEM:
				return createENUMSignalsystemFromString(eDataType, initialValue);
			case SignalePackage.ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG:
				return createENUMSonstigeZulaessigeAnordnungFromString(eDataType, initialValue);
			case SignalePackage.ENUM_STREUSCHEIBE_ART:
				return createENUMStreuscheibeArtFromString(eDataType, initialValue);
			case SignalePackage.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG:
				return createENUMStreuscheibeBetriebsstellungFromString(eDataType, initialValue);
			case SignalePackage.ENUM_TUNNELSIGNAL:
				return createENUMTunnelsignalFromString(eDataType, initialValue);
			case SignalePackage.ENUM_ANSCHALTDAUER_OBJECT:
				return createENUMAnschaltdauerObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_AUTO_EINSTELLUNG_OBJECT:
				return createENUMAutoEinstellungObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_BEFESTIGUNG_ART_OBJECT:
				return createENUMBefestigungArtObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_BELEUCHTET_OBJECT:
				return createENUMBeleuchtetObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_DURCHFAHRT_OBJECT:
				return createENUMDurchfahrtObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_FIKTIVES_SIGNAL_FUNKTION_OBJECT:
				return createENUMFiktivesSignalFunktionObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_FUNDAMENT_ART_OBJECT:
				return createENUMFundamentArtObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_FUNKTION_OHNE_SIGNAL_OBJECT:
				return createENUMFunktionOhneSignalObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_GELTUNGSBEREICH_OBJECT:
				return createENUMGeltungsbereichObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_RAHMEN_ART_OBJECT:
				return createENUMRahmenArtObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_SIGNAL_ART_OBJECT:
				return createENUMSignalArtObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_SIGNAL_BEFESTIGUNGSART_OBJECT:
				return createENUMSignalBefestigungsartObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_SIGNAL_FUNKTION_OBJECT:
				return createENUMSignalFunktionObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_SIGNALSYSTEM_OBJECT:
				return createENUMSignalsystemObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG_OBJECT:
				return createENUMSonstigeZulaessigeAnordnungObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_STREUSCHEIBE_ART_OBJECT:
				return createENUMStreuscheibeArtObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_OBJECT:
				return createENUMStreuscheibeBetriebsstellungObjectFromString(eDataType, initialValue);
			case SignalePackage.ENUM_TUNNELSIGNAL_OBJECT:
				return createENUMTunnelsignalObjectFromString(eDataType, initialValue);
			case SignalePackage.HOEHE_FUNDAMENTOBERKANTE_TYPE:
				return createHoehe_Fundamentoberkante_TypeFromString(eDataType, initialValue);
			case SignalePackage.OBERE_LICHTPUNKTHOEHE_TYPE:
				return createObere_Lichtpunkthoehe_TypeFromString(eDataType, initialValue);
			case SignalePackage.PZB_SCHUTZSTRECKE_SOLL_TYPE:
				return createPZB_Schutzstrecke_Soll_TypeFromString(eDataType, initialValue);
			case SignalePackage.RAHMEN_HOEHE_TYPE:
				return createRahmen_Hoehe_TypeFromString(eDataType, initialValue);
			case SignalePackage.RICHTPUNKT_TYPE:
				return createRichtpunkt_TypeFromString(eDataType, initialValue);
			case SignalePackage.RICHTPUNKTENTFERNUNG_TYPE:
				return createRichtpunktentfernung_TypeFromString(eDataType, initialValue);
			case SignalePackage.SIGNALSICHT_ERREICHBAR_TYPE:
				return createSignalsicht_Erreichbar_TypeFromString(eDataType, initialValue);
			case SignalePackage.SIGNALSICHT_MINDEST_TYPE:
				return createSignalsicht_Mindest_TypeFromString(eDataType, initialValue);
			case SignalePackage.SIGNALSICHT_SOLL_TYPE:
				return createSignalsicht_Soll_TypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SignalePackage.ENUM_ANSCHALTDAUER:
				return convertENUMAnschaltdauerToString(eDataType, instanceValue);
			case SignalePackage.ENUM_AUTO_EINSTELLUNG:
				return convertENUMAutoEinstellungToString(eDataType, instanceValue);
			case SignalePackage.ENUM_BEFESTIGUNG_ART:
				return convertENUMBefestigungArtToString(eDataType, instanceValue);
			case SignalePackage.ENUM_BELEUCHTET:
				return convertENUMBeleuchtetToString(eDataType, instanceValue);
			case SignalePackage.ENUM_DURCHFAHRT:
				return convertENUMDurchfahrtToString(eDataType, instanceValue);
			case SignalePackage.ENUM_FIKTIVES_SIGNAL_FUNKTION:
				return convertENUMFiktivesSignalFunktionToString(eDataType, instanceValue);
			case SignalePackage.ENUM_FUNDAMENT_ART:
				return convertENUMFundamentArtToString(eDataType, instanceValue);
			case SignalePackage.ENUM_FUNKTION_OHNE_SIGNAL:
				return convertENUMFunktionOhneSignalToString(eDataType, instanceValue);
			case SignalePackage.ENUM_GELTUNGSBEREICH:
				return convertENUMGeltungsbereichToString(eDataType, instanceValue);
			case SignalePackage.ENUM_RAHMEN_ART:
				return convertENUMRahmenArtToString(eDataType, instanceValue);
			case SignalePackage.ENUM_SIGNAL_ART:
				return convertENUMSignalArtToString(eDataType, instanceValue);
			case SignalePackage.ENUM_SIGNAL_BEFESTIGUNGSART:
				return convertENUMSignalBefestigungsartToString(eDataType, instanceValue);
			case SignalePackage.ENUM_SIGNAL_FUNKTION:
				return convertENUMSignalFunktionToString(eDataType, instanceValue);
			case SignalePackage.ENUM_SIGNALSYSTEM:
				return convertENUMSignalsystemToString(eDataType, instanceValue);
			case SignalePackage.ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG:
				return convertENUMSonstigeZulaessigeAnordnungToString(eDataType, instanceValue);
			case SignalePackage.ENUM_STREUSCHEIBE_ART:
				return convertENUMStreuscheibeArtToString(eDataType, instanceValue);
			case SignalePackage.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG:
				return convertENUMStreuscheibeBetriebsstellungToString(eDataType, instanceValue);
			case SignalePackage.ENUM_TUNNELSIGNAL:
				return convertENUMTunnelsignalToString(eDataType, instanceValue);
			case SignalePackage.ENUM_ANSCHALTDAUER_OBJECT:
				return convertENUMAnschaltdauerObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_AUTO_EINSTELLUNG_OBJECT:
				return convertENUMAutoEinstellungObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_BEFESTIGUNG_ART_OBJECT:
				return convertENUMBefestigungArtObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_BELEUCHTET_OBJECT:
				return convertENUMBeleuchtetObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_DURCHFAHRT_OBJECT:
				return convertENUMDurchfahrtObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_FIKTIVES_SIGNAL_FUNKTION_OBJECT:
				return convertENUMFiktivesSignalFunktionObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_FUNDAMENT_ART_OBJECT:
				return convertENUMFundamentArtObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_FUNKTION_OHNE_SIGNAL_OBJECT:
				return convertENUMFunktionOhneSignalObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_GELTUNGSBEREICH_OBJECT:
				return convertENUMGeltungsbereichObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_RAHMEN_ART_OBJECT:
				return convertENUMRahmenArtObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_SIGNAL_ART_OBJECT:
				return convertENUMSignalArtObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_SIGNAL_BEFESTIGUNGSART_OBJECT:
				return convertENUMSignalBefestigungsartObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_SIGNAL_FUNKTION_OBJECT:
				return convertENUMSignalFunktionObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_SIGNALSYSTEM_OBJECT:
				return convertENUMSignalsystemObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG_OBJECT:
				return convertENUMSonstigeZulaessigeAnordnungObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_STREUSCHEIBE_ART_OBJECT:
				return convertENUMStreuscheibeArtObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_OBJECT:
				return convertENUMStreuscheibeBetriebsstellungObjectToString(eDataType, instanceValue);
			case SignalePackage.ENUM_TUNNELSIGNAL_OBJECT:
				return convertENUMTunnelsignalObjectToString(eDataType, instanceValue);
			case SignalePackage.HOEHE_FUNDAMENTOBERKANTE_TYPE:
				return convertHoehe_Fundamentoberkante_TypeToString(eDataType, instanceValue);
			case SignalePackage.OBERE_LICHTPUNKTHOEHE_TYPE:
				return convertObere_Lichtpunkthoehe_TypeToString(eDataType, instanceValue);
			case SignalePackage.PZB_SCHUTZSTRECKE_SOLL_TYPE:
				return convertPZB_Schutzstrecke_Soll_TypeToString(eDataType, instanceValue);
			case SignalePackage.RAHMEN_HOEHE_TYPE:
				return convertRahmen_Hoehe_TypeToString(eDataType, instanceValue);
			case SignalePackage.RICHTPUNKT_TYPE:
				return convertRichtpunkt_TypeToString(eDataType, instanceValue);
			case SignalePackage.RICHTPUNKTENTFERNUNG_TYPE:
				return convertRichtpunktentfernung_TypeToString(eDataType, instanceValue);
			case SignalePackage.SIGNALSICHT_ERREICHBAR_TYPE:
				return convertSignalsicht_Erreichbar_TypeToString(eDataType, instanceValue);
			case SignalePackage.SIGNALSICHT_MINDEST_TYPE:
				return convertSignalsicht_Mindest_TypeToString(eDataType, instanceValue);
			case SignalePackage.SIGNALSICHT_SOLL_TYPE:
				return convertSignalsicht_Soll_TypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anschaltdauer_TypeClass createAnschaltdauer_TypeClass() {
		Anschaltdauer_TypeClassImpl anschaltdauer_TypeClass = new Anschaltdauer_TypeClassImpl();
		return anschaltdauer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Auto_Einstellung_TypeClass createAuto_Einstellung_TypeClass() {
		Auto_Einstellung_TypeClassImpl auto_Einstellung_TypeClass = new Auto_Einstellung_TypeClassImpl();
		return auto_Einstellung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Befestigung_Art_TypeClass createBefestigung_Art_TypeClass() {
		Befestigung_Art_TypeClassImpl befestigung_Art_TypeClass = new Befestigung_Art_TypeClassImpl();
		return befestigung_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Beleuchtet_TypeClass createBeleuchtet_TypeClass() {
		Beleuchtet_TypeClassImpl beleuchtet_TypeClass = new Beleuchtet_TypeClassImpl();
		return beleuchtet_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Besetzte_Ausfahrt_TypeClass createBesetzte_Ausfahrt_TypeClass() {
		Besetzte_Ausfahrt_TypeClassImpl besetzte_Ausfahrt_TypeClass = new Besetzte_Ausfahrt_TypeClassImpl();
		return besetzte_Ausfahrt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DA_Manuell_TypeClass createDA_Manuell_TypeClass() {
		DA_Manuell_TypeClassImpl dA_Manuell_TypeClass = new DA_Manuell_TypeClassImpl();
		return dA_Manuell_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dunkelschaltung_TypeClass createDunkelschaltung_TypeClass() {
		Dunkelschaltung_TypeClassImpl dunkelschaltung_TypeClass = new Dunkelschaltung_TypeClassImpl();
		return dunkelschaltung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Durchfahrt_TypeClass createDurchfahrt_TypeClass() {
		Durchfahrt_TypeClassImpl durchfahrt_TypeClass = new Durchfahrt_TypeClassImpl();
		return durchfahrt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fiktives_Signal_Funktion_TypeClass createFiktives_Signal_Funktion_TypeClass() {
		Fiktives_Signal_Funktion_TypeClassImpl fiktives_Signal_Funktion_TypeClass = new Fiktives_Signal_Funktion_TypeClassImpl();
		return fiktives_Signal_Funktion_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fundament_Art_TypeClass createFundament_Art_TypeClass() {
		Fundament_Art_TypeClassImpl fundament_Art_TypeClass = new Fundament_Art_TypeClassImpl();
		return fundament_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Funktion_Ohne_Signal_TypeClass createFunktion_Ohne_Signal_TypeClass() {
		Funktion_Ohne_Signal_TypeClassImpl funktion_Ohne_Signal_TypeClass = new Funktion_Ohne_Signal_TypeClassImpl();
		return funktion_Ohne_Signal_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gegengleis_TypeClass createGegengleis_TypeClass() {
		Gegengleis_TypeClassImpl gegengleis_TypeClass = new Gegengleis_TypeClassImpl();
		return gegengleis_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geltungsbereich_TypeClass createGeltungsbereich_TypeClass() {
		Geltungsbereich_TypeClassImpl geltungsbereich_TypeClass = new Geltungsbereich_TypeClassImpl();
		return geltungsbereich_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschaltet_TypeClass createGeschaltet_TypeClass() {
		Geschaltet_TypeClassImpl geschaltet_TypeClass = new Geschaltet_TypeClassImpl();
		return geschaltet_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehe_Fundamentoberkante_TypeClass createHoehe_Fundamentoberkante_TypeClass() {
		Hoehe_Fundamentoberkante_TypeClassImpl hoehe_Fundamentoberkante_TypeClass = new Hoehe_Fundamentoberkante_TypeClassImpl();
		return hoehe_Fundamentoberkante_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Obere_Lichtpunkthoehe_TypeClass createObere_Lichtpunkthoehe_TypeClass() {
		Obere_Lichtpunkthoehe_TypeClassImpl obere_Lichtpunkthoehe_TypeClass = new Obere_Lichtpunkthoehe_TypeClassImpl();
		return obere_Lichtpunkthoehe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Schutzstrecke_Soll_TypeClass createPZB_Schutzstrecke_Soll_TypeClass() {
		PZB_Schutzstrecke_Soll_TypeClassImpl pzB_Schutzstrecke_Soll_TypeClass = new PZB_Schutzstrecke_Soll_TypeClassImpl();
		return pzB_Schutzstrecke_Soll_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rahmen_Art_TypeClass createRahmen_Art_TypeClass() {
		Rahmen_Art_TypeClassImpl rahmen_Art_TypeClass = new Rahmen_Art_TypeClassImpl();
		return rahmen_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rahmen_Hoehe_TypeClass createRahmen_Hoehe_TypeClass() {
		Rahmen_Hoehe_TypeClassImpl rahmen_Hoehe_TypeClass = new Rahmen_Hoehe_TypeClassImpl();
		return rahmen_Hoehe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rangierstrasse_Restaufloesung_TypeClass createRangierstrasse_Restaufloesung_TypeClass() {
		Rangierstrasse_Restaufloesung_TypeClassImpl rangierstrasse_Restaufloesung_TypeClass = new Rangierstrasse_Restaufloesung_TypeClassImpl();
		return rangierstrasse_Restaufloesung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Richtpunkt_TypeClass createRichtpunkt_TypeClass() {
		Richtpunkt_TypeClassImpl richtpunkt_TypeClass = new Richtpunkt_TypeClassImpl();
		return richtpunkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Richtpunktentfernung_TypeClass createRichtpunktentfernung_TypeClass() {
		Richtpunktentfernung_TypeClassImpl richtpunktentfernung_TypeClass = new Richtpunktentfernung_TypeClassImpl();
		return richtpunktentfernung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Art_TypeClass createSignal_Art_TypeClass() {
		Signal_Art_TypeClassImpl signal_Art_TypeClass = new Signal_Art_TypeClassImpl();
		return signal_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Befestigung createSignal_Befestigung() {
		Signal_BefestigungImpl signal_Befestigung = new Signal_BefestigungImpl();
		return signal_Befestigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Befestigung_Allg_AttributeGroup createSignal_Befestigung_Allg_AttributeGroup() {
		Signal_Befestigung_Allg_AttributeGroupImpl signal_Befestigung_Allg_AttributeGroup = new Signal_Befestigung_Allg_AttributeGroupImpl();
		return signal_Befestigung_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Befestigungsart_TypeClass createSignal_Befestigungsart_TypeClass() {
		Signal_Befestigungsart_TypeClassImpl signal_Befestigungsart_TypeClass = new Signal_Befestigungsart_TypeClassImpl();
		return signal_Befestigungsart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Fank_Zuordnung createSignal_Fank_Zuordnung() {
		Signal_Fank_ZuordnungImpl signal_Fank_Zuordnung = new Signal_Fank_ZuordnungImpl();
		return signal_Fank_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Fiktiv_AttributeGroup createSignal_Fiktiv_AttributeGroup() {
		Signal_Fiktiv_AttributeGroupImpl signal_Fiktiv_AttributeGroup = new Signal_Fiktiv_AttributeGroupImpl();
		return signal_Fiktiv_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Fstr_AttributeGroup createSignal_Fstr_AttributeGroup() {
		Signal_Fstr_AttributeGroupImpl signal_Fstr_AttributeGroup = new Signal_Fstr_AttributeGroupImpl();
		return signal_Fstr_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Fstr_Aus_Inselgleis_AttributeGroup createSignal_Fstr_Aus_Inselgleis_AttributeGroup() {
		Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl signal_Fstr_Aus_Inselgleis_AttributeGroup = new Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl();
		return signal_Fstr_Aus_Inselgleis_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Fstr_S_AttributeGroup createSignal_Fstr_S_AttributeGroup() {
		Signal_Fstr_S_AttributeGroupImpl signal_Fstr_S_AttributeGroup = new Signal_Fstr_S_AttributeGroupImpl();
		return signal_Fstr_S_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Funktion_TypeClass createSignal_Funktion_TypeClass() {
		Signal_Funktion_TypeClassImpl signal_Funktion_TypeClass = new Signal_Funktion_TypeClassImpl();
		return signal_Funktion_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Rahmen createSignal_Rahmen() {
		Signal_RahmenImpl signal_Rahmen = new Signal_RahmenImpl();
		return signal_Rahmen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Real_Aktiv_AttributeGroup createSignal_Real_Aktiv_AttributeGroup() {
		Signal_Real_Aktiv_AttributeGroupImpl signal_Real_Aktiv_AttributeGroup = new Signal_Real_Aktiv_AttributeGroupImpl();
		return signal_Real_Aktiv_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Real_Aktiv_Schirm_AttributeGroup createSignal_Real_Aktiv_Schirm_AttributeGroup() {
		Signal_Real_Aktiv_Schirm_AttributeGroupImpl signal_Real_Aktiv_Schirm_AttributeGroup = new Signal_Real_Aktiv_Schirm_AttributeGroupImpl();
		return signal_Real_Aktiv_Schirm_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Real_AttributeGroup createSignal_Real_AttributeGroup() {
		Signal_Real_AttributeGroupImpl signal_Real_AttributeGroup = new Signal_Real_AttributeGroupImpl();
		return signal_Real_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Signalbegriff createSignal_Signalbegriff() {
		Signal_SignalbegriffImpl signal_Signalbegriff = new Signal_SignalbegriffImpl();
		return signal_Signalbegriff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Signalbegriff_Allg_AttributeGroup createSignal_Signalbegriff_Allg_AttributeGroup() {
		Signal_Signalbegriff_Allg_AttributeGroupImpl signal_Signalbegriff_Allg_AttributeGroup = new Signal_Signalbegriff_Allg_AttributeGroupImpl();
		return signal_Signalbegriff_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalsicht_Erreichbar_TypeClass createSignalsicht_Erreichbar_TypeClass() {
		Signalsicht_Erreichbar_TypeClassImpl signalsicht_Erreichbar_TypeClass = new Signalsicht_Erreichbar_TypeClassImpl();
		return signalsicht_Erreichbar_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalsicht_Mindest_TypeClass createSignalsicht_Mindest_TypeClass() {
		Signalsicht_Mindest_TypeClassImpl signalsicht_Mindest_TypeClass = new Signalsicht_Mindest_TypeClassImpl();
		return signalsicht_Mindest_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalsicht_Soll_TypeClass createSignalsicht_Soll_TypeClass() {
		Signalsicht_Soll_TypeClassImpl signalsicht_Soll_TypeClass = new Signalsicht_Soll_TypeClassImpl();
		return signalsicht_Soll_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalsystem_TypeClass createSignalsystem_TypeClass() {
		Signalsystem_TypeClassImpl signalsystem_TypeClass = new Signalsystem_TypeClassImpl();
		return signalsystem_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sonstige_Zulaessige_Anordnung_TypeClass createSonstige_Zulaessige_Anordnung_TypeClass() {
		Sonstige_Zulaessige_Anordnung_TypeClassImpl sonstige_Zulaessige_Anordnung_TypeClass = new Sonstige_Zulaessige_Anordnung_TypeClassImpl();
		return sonstige_Zulaessige_Anordnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Streuscheibe_Art_TypeClass createStreuscheibe_Art_TypeClass() {
		Streuscheibe_Art_TypeClassImpl streuscheibe_Art_TypeClass = new Streuscheibe_Art_TypeClassImpl();
		return streuscheibe_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Streuscheibe_Betriebsstellung_TypeClass createStreuscheibe_Betriebsstellung_TypeClass() {
		Streuscheibe_Betriebsstellung_TypeClassImpl streuscheibe_Betriebsstellung_TypeClass = new Streuscheibe_Betriebsstellung_TypeClassImpl();
		return streuscheibe_Betriebsstellung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tunnelsignal_TypeClass createTunnelsignal_TypeClass() {
		Tunnelsignal_TypeClassImpl tunnelsignal_TypeClass = new Tunnelsignal_TypeClassImpl();
		return tunnelsignal_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs2_Ueberwacht_TypeClass createZs2_Ueberwacht_TypeClass() {
		Zs2_Ueberwacht_TypeClassImpl zs2_Ueberwacht_TypeClass = new Zs2_Ueberwacht_TypeClassImpl();
		return zs2_Ueberwacht_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAnschaltdauer createENUMAnschaltdauerFromString(EDataType eDataType, String initialValue) {
		ENUMAnschaltdauer result = ENUMAnschaltdauer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAnschaltdauerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAutoEinstellung createENUMAutoEinstellungFromString(EDataType eDataType, String initialValue) {
		ENUMAutoEinstellung result = ENUMAutoEinstellung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAutoEinstellungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBefestigungArt createENUMBefestigungArtFromString(EDataType eDataType, String initialValue) {
		ENUMBefestigungArt result = ENUMBefestigungArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBefestigungArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBeleuchtet createENUMBeleuchtetFromString(EDataType eDataType, String initialValue) {
		ENUMBeleuchtet result = ENUMBeleuchtet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBeleuchtetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDurchfahrt createENUMDurchfahrtFromString(EDataType eDataType, String initialValue) {
		ENUMDurchfahrt result = ENUMDurchfahrt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDurchfahrtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFiktivesSignalFunktion createENUMFiktivesSignalFunktionFromString(EDataType eDataType, String initialValue) {
		ENUMFiktivesSignalFunktion result = ENUMFiktivesSignalFunktion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFiktivesSignalFunktionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFundamentArt createENUMFundamentArtFromString(EDataType eDataType, String initialValue) {
		ENUMFundamentArt result = ENUMFundamentArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFundamentArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFunktionOhneSignal createENUMFunktionOhneSignalFromString(EDataType eDataType, String initialValue) {
		ENUMFunktionOhneSignal result = ENUMFunktionOhneSignal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFunktionOhneSignalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGeltungsbereich createENUMGeltungsbereichFromString(EDataType eDataType, String initialValue) {
		ENUMGeltungsbereich result = ENUMGeltungsbereich.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGeltungsbereichToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMRahmenArt createENUMRahmenArtFromString(EDataType eDataType, String initialValue) {
		ENUMRahmenArt result = ENUMRahmenArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMRahmenArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSignalArt createENUMSignalArtFromString(EDataType eDataType, String initialValue) {
		ENUMSignalArt result = ENUMSignalArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSignalArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSignalBefestigungsart createENUMSignalBefestigungsartFromString(EDataType eDataType, String initialValue) {
		ENUMSignalBefestigungsart result = ENUMSignalBefestigungsart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSignalBefestigungsartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSignalFunktion createENUMSignalFunktionFromString(EDataType eDataType, String initialValue) {
		ENUMSignalFunktion result = ENUMSignalFunktion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSignalFunktionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSignalsystem createENUMSignalsystemFromString(EDataType eDataType, String initialValue) {
		ENUMSignalsystem result = ENUMSignalsystem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSignalsystemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSonstigeZulaessigeAnordnung createENUMSonstigeZulaessigeAnordnungFromString(EDataType eDataType, String initialValue) {
		ENUMSonstigeZulaessigeAnordnung result = ENUMSonstigeZulaessigeAnordnung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSonstigeZulaessigeAnordnungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMStreuscheibeArt createENUMStreuscheibeArtFromString(EDataType eDataType, String initialValue) {
		ENUMStreuscheibeArt result = ENUMStreuscheibeArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMStreuscheibeArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMStreuscheibeBetriebsstellung createENUMStreuscheibeBetriebsstellungFromString(EDataType eDataType, String initialValue) {
		ENUMStreuscheibeBetriebsstellung result = ENUMStreuscheibeBetriebsstellung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMStreuscheibeBetriebsstellungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTunnelsignal createENUMTunnelsignalFromString(EDataType eDataType, String initialValue) {
		ENUMTunnelsignal result = ENUMTunnelsignal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTunnelsignalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAnschaltdauer createENUMAnschaltdauerObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMAnschaltdauerFromString(SignalePackage.Literals.ENUM_ANSCHALTDAUER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAnschaltdauerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAnschaltdauerToString(SignalePackage.Literals.ENUM_ANSCHALTDAUER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAutoEinstellung createENUMAutoEinstellungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMAutoEinstellungFromString(SignalePackage.Literals.ENUM_AUTO_EINSTELLUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAutoEinstellungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAutoEinstellungToString(SignalePackage.Literals.ENUM_AUTO_EINSTELLUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBefestigungArt createENUMBefestigungArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBefestigungArtFromString(SignalePackage.Literals.ENUM_BEFESTIGUNG_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBefestigungArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBefestigungArtToString(SignalePackage.Literals.ENUM_BEFESTIGUNG_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBeleuchtet createENUMBeleuchtetObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBeleuchtetFromString(SignalePackage.Literals.ENUM_BELEUCHTET, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBeleuchtetObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBeleuchtetToString(SignalePackage.Literals.ENUM_BELEUCHTET, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDurchfahrt createENUMDurchfahrtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMDurchfahrtFromString(SignalePackage.Literals.ENUM_DURCHFAHRT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDurchfahrtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMDurchfahrtToString(SignalePackage.Literals.ENUM_DURCHFAHRT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFiktivesSignalFunktion createENUMFiktivesSignalFunktionObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFiktivesSignalFunktionFromString(SignalePackage.Literals.ENUM_FIKTIVES_SIGNAL_FUNKTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFiktivesSignalFunktionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFiktivesSignalFunktionToString(SignalePackage.Literals.ENUM_FIKTIVES_SIGNAL_FUNKTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFundamentArt createENUMFundamentArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFundamentArtFromString(SignalePackage.Literals.ENUM_FUNDAMENT_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFundamentArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFundamentArtToString(SignalePackage.Literals.ENUM_FUNDAMENT_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFunktionOhneSignal createENUMFunktionOhneSignalObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFunktionOhneSignalFromString(SignalePackage.Literals.ENUM_FUNKTION_OHNE_SIGNAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFunktionOhneSignalObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFunktionOhneSignalToString(SignalePackage.Literals.ENUM_FUNKTION_OHNE_SIGNAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGeltungsbereich createENUMGeltungsbereichObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGeltungsbereichFromString(SignalePackage.Literals.ENUM_GELTUNGSBEREICH, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGeltungsbereichObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGeltungsbereichToString(SignalePackage.Literals.ENUM_GELTUNGSBEREICH, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMRahmenArt createENUMRahmenArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMRahmenArtFromString(SignalePackage.Literals.ENUM_RAHMEN_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMRahmenArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMRahmenArtToString(SignalePackage.Literals.ENUM_RAHMEN_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSignalArt createENUMSignalArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSignalArtFromString(SignalePackage.Literals.ENUM_SIGNAL_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSignalArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSignalArtToString(SignalePackage.Literals.ENUM_SIGNAL_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSignalBefestigungsart createENUMSignalBefestigungsartObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSignalBefestigungsartFromString(SignalePackage.Literals.ENUM_SIGNAL_BEFESTIGUNGSART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSignalBefestigungsartObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSignalBefestigungsartToString(SignalePackage.Literals.ENUM_SIGNAL_BEFESTIGUNGSART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSignalFunktion createENUMSignalFunktionObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSignalFunktionFromString(SignalePackage.Literals.ENUM_SIGNAL_FUNKTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSignalFunktionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSignalFunktionToString(SignalePackage.Literals.ENUM_SIGNAL_FUNKTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSignalsystem createENUMSignalsystemObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSignalsystemFromString(SignalePackage.Literals.ENUM_SIGNALSYSTEM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSignalsystemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSignalsystemToString(SignalePackage.Literals.ENUM_SIGNALSYSTEM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSonstigeZulaessigeAnordnung createENUMSonstigeZulaessigeAnordnungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSonstigeZulaessigeAnordnungFromString(SignalePackage.Literals.ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSonstigeZulaessigeAnordnungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSonstigeZulaessigeAnordnungToString(SignalePackage.Literals.ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMStreuscheibeArt createENUMStreuscheibeArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMStreuscheibeArtFromString(SignalePackage.Literals.ENUM_STREUSCHEIBE_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMStreuscheibeArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMStreuscheibeArtToString(SignalePackage.Literals.ENUM_STREUSCHEIBE_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMStreuscheibeBetriebsstellung createENUMStreuscheibeBetriebsstellungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMStreuscheibeBetriebsstellungFromString(SignalePackage.Literals.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMStreuscheibeBetriebsstellungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMStreuscheibeBetriebsstellungToString(SignalePackage.Literals.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTunnelsignal createENUMTunnelsignalObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMTunnelsignalFromString(SignalePackage.Literals.ENUM_TUNNELSIGNAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTunnelsignalObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMTunnelsignalToString(SignalePackage.Literals.ENUM_TUNNELSIGNAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createHoehe_Fundamentoberkante_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHoehe_Fundamentoberkante_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createObere_Lichtpunkthoehe_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObere_Lichtpunkthoehe_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createPZB_Schutzstrecke_Soll_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPZB_Schutzstrecke_Soll_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createRahmen_Hoehe_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRahmen_Hoehe_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRichtpunkt_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRichtpunkt_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createRichtpunktentfernung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRichtpunktentfernung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSignalsicht_Erreichbar_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalsicht_Erreichbar_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSignalsicht_Mindest_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalsicht_Mindest_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSignalsicht_Soll_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalsicht_Soll_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalePackage getSignalePackage() {
		return (SignalePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SignalePackage getPackage() {
		return SignalePackage.eINSTANCE;
	}

} //SignaleFactoryImpl
