/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.model1902.BasisTypen.ENUMLinksRechts;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Weichen_und_GleissperrenFactoryImpl extends EFactoryImpl implements Weichen_und_GleissperrenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Weichen_und_GleissperrenFactory init() {
		try {
			Weichen_und_GleissperrenFactory theWeichen_und_GleissperrenFactory = (Weichen_und_GleissperrenFactory)EPackage.Registry.INSTANCE.getEFactory(Weichen_und_GleissperrenPackage.eNS_URI);
			if (theWeichen_und_GleissperrenFactory != null) {
				return theWeichen_und_GleissperrenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Weichen_und_GleissperrenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weichen_und_GleissperrenFactoryImpl() {
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
			case Weichen_und_GleissperrenPackage.AUFFAHRORTUNG_TYPE_CLASS: return createAuffahrortung_TypeClass();
			case Weichen_und_GleissperrenPackage.AUSWURFRICHTUNG_TYPE_CLASS: return createAuswurfrichtung_TypeClass();
			case Weichen_und_GleissperrenPackage.BESONDERES_FAHRWEGELEMENT_TYPE_CLASS: return createBesonderes_Fahrwegelement_TypeClass();
			case Weichen_und_GleissperrenPackage.ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE_CLASS: return createElektrischer_Antrieb_Anzahl_TypeClass();
			case Weichen_und_GleissperrenPackage.ELEKTRISCHER_ANTRIEB_LAGE_TYPE_CLASS: return createElektrischer_Antrieb_Lage_TypeClass();
			case Weichen_und_GleissperrenPackage.ELEMENT_LAGE_TYPE_CLASS: return createElement_Lage_TypeClass();
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP: return createEntgleisungsschuh_AttributeGroup();
			case Weichen_und_GleissperrenPackage.GESCHWINDIGKEIT_LTYPE_CLASS: return createGeschwindigkeit_L_TypeClass();
			case Weichen_und_GleissperrenPackage.GESCHWINDIGKEIT_RTYPE_CLASS: return createGeschwindigkeit_R_TypeClass();
			case Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS: return createGleis_Abschluss();
			case Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS_ART_TYPE_CLASS: return createGleis_Abschluss_Art_TypeClass();
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_BETRIEBSART_TYPE_CLASS: return createGleissperre_Betriebsart_TypeClass();
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP: return createGleissperre_Element_AttributeGroup();
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_VORZUGSLAGE_TYPE_CLASS: return createGleissperre_Vorzugslage_TypeClass();
			case Weichen_und_GleissperrenPackage.GLEISSPERRENSIGNAL_TYPE_CLASS: return createGleissperrensignal_TypeClass();
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP: return createGZ_Freimeldung_L_AttributeGroup();
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP: return createGZ_Freimeldung_R_AttributeGroup();
			case Weichen_und_GleissperrenPackage.HERZSTUECK_ANTRIEBE_TYPE_CLASS: return createHerzstueck_Antriebe_TypeClass();
			case Weichen_und_GleissperrenPackage.ISOLIERFALL_TYPE_CLASS: return createIsolierfall_TypeClass();
			case Weichen_und_GleissperrenPackage.KREUZUNG_ATTRIBUTE_GROUP: return createKreuzung_AttributeGroup();
			case Weichen_und_GleissperrenPackage.KREUZUNGSGLEIS_TYPE_CLASS: return createKreuzungsgleis_TypeClass();
			case Weichen_und_GleissperrenPackage.SCHUTZSCHIENE_TYPE_CLASS: return createSchutzschiene_TypeClass();
			case Weichen_und_GleissperrenPackage.VORZUGSLAGE_AUTOMATIK_TYPE_CLASS: return createVorzugslage_Automatik_TypeClass();
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE: return createW_Kr_Anlage();
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP: return createW_Kr_Anlage_Allg_AttributeGroup();
			case Weichen_und_GleissperrenPackage.WKR_ART_TYPE_CLASS: return createW_Kr_Art_TypeClass();
			case Weichen_und_GleissperrenPackage.WKR_GRUNDFORM_TYPE_CLASS: return createW_Kr_Grundform_TypeClass();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT: return createW_Kr_Gsp_Element();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP: return createW_Kr_Gsp_Element_Allg_AttributeGroup();
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE: return createW_Kr_Gsp_Komponente();
			case Weichen_und_GleissperrenPackage.WKR_GSP_STELLART_TYPE_CLASS: return createW_Kr_Gsp_Stellart_TypeClass();
			case Weichen_und_GleissperrenPackage.WEICHE_BETRIEBSART_TYPE_CLASS: return createWeiche_Betriebsart_TypeClass();
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP: return createWeiche_Element_AttributeGroup();
			case Weichen_und_GleissperrenPackage.WEICHE_VORZUGSLAGE_TYPE_CLASS: return createWeiche_Vorzugslage_TypeClass();
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE: return createWeichenlaufkette();
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG: return createWeichenlaufkette_Zuordnung();
			case Weichen_und_GleissperrenPackage.WEICHENSIGNAL_TYPE_CLASS: return createWeichensignal_TypeClass();
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP: return createZungenpaar_AttributeGroup();
			case Weichen_und_GleissperrenPackage.ZUNGENPRUEFKONTAKT_ANZAHL_TYPE_CLASS: return createZungenpruefkontakt_Anzahl_TypeClass();
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
			case Weichen_und_GleissperrenPackage.ENUM_BESONDERES_FAHRWEGELEMENT:
				return createENUMBesonderesFahrwegelementFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_ELEMENT_LAGE:
				return createENUMElementLageFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEIS_ABSCHLUSS_ART:
				return createENUMGleisAbschlussArtFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRE_BETRIEBSART:
				return createENUMGleissperreBetriebsartFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRENSIGNAL:
				return createENUMGleissperrensignalFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRE_VORZUGSLAGE:
				return createENUMGleissperreVorzugslageFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_WEICHE_BETRIEBSART:
				return createENUMWeicheBetriebsartFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_WEICHENSIGNAL:
				return createENUMWeichensignalFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUMW_KR_ART:
				return createENUMWKrArtFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUMW_KR_GSP_STELLART:
				return createENUMWKrGspStellartFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.CAUSWURFRICHTUNG:
				return createCAuswurfrichtungFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE:
				return createElektrischer_Antrieb_Anzahl_TypeFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ELEKTRISCHER_ANTRIEB_LAGE_TYPE:
				return createElektrischer_Antrieb_Lage_TypeFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_BESONDERES_FAHRWEGELEMENT_OBJECT:
				return createENUMBesonderesFahrwegelementObjectFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_ELEMENT_LAGE_OBJECT:
				return createENUMElementLageObjectFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEIS_ABSCHLUSS_ART_OBJECT:
				return createENUMGleisAbschlussArtObjectFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRE_BETRIEBSART_OBJECT:
				return createENUMGleissperreBetriebsartObjectFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRENSIGNAL_OBJECT:
				return createENUMGleissperrensignalObjectFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRE_VORZUGSLAGE_OBJECT:
				return createENUMGleissperreVorzugslageObjectFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_WEICHE_BETRIEBSART_OBJECT:
				return createENUMWeicheBetriebsartObjectFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUM_WEICHENSIGNAL_OBJECT:
				return createENUMWeichensignalObjectFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUMW_KR_ART_OBJECT:
				return createENUMWKrArtObjectFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ENUMW_KR_GSP_STELLART_OBJECT:
				return createENUMWKrGspStellartObjectFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.GESCHWINDIGKEIT_LTYPE:
				return createGeschwindigkeit_L_TypeFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.GESCHWINDIGKEIT_RTYPE:
				return createGeschwindigkeit_R_TypeFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.HERZSTUECK_ANTRIEBE_TYPE:
				return createHerzstueck_Antriebe_TypeFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ISOLIERFALL_TYPE:
				return createIsolierfall_TypeFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.KREUZUNGSGLEIS_TYPE:
				return createKreuzungsgleis_TypeFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.WKR_GRUNDFORM_TYPE:
				return createW_Kr_Grundform_TypeFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.WEICHE_VORZUGSLAGE_TYPE:
				return createWeiche_Vorzugslage_TypeFromString(eDataType, initialValue);
			case Weichen_und_GleissperrenPackage.ZUNGENPRUEFKONTAKT_ANZAHL_TYPE:
				return createZungenpruefkontakt_Anzahl_TypeFromString(eDataType, initialValue);
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
			case Weichen_und_GleissperrenPackage.ENUM_BESONDERES_FAHRWEGELEMENT:
				return convertENUMBesonderesFahrwegelementToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_ELEMENT_LAGE:
				return convertENUMElementLageToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEIS_ABSCHLUSS_ART:
				return convertENUMGleisAbschlussArtToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRE_BETRIEBSART:
				return convertENUMGleissperreBetriebsartToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRENSIGNAL:
				return convertENUMGleissperrensignalToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRE_VORZUGSLAGE:
				return convertENUMGleissperreVorzugslageToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_WEICHE_BETRIEBSART:
				return convertENUMWeicheBetriebsartToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_WEICHENSIGNAL:
				return convertENUMWeichensignalToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUMW_KR_ART:
				return convertENUMWKrArtToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUMW_KR_GSP_STELLART:
				return convertENUMWKrGspStellartToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.CAUSWURFRICHTUNG:
				return convertCAuswurfrichtungToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE:
				return convertElektrischer_Antrieb_Anzahl_TypeToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ELEKTRISCHER_ANTRIEB_LAGE_TYPE:
				return convertElektrischer_Antrieb_Lage_TypeToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_BESONDERES_FAHRWEGELEMENT_OBJECT:
				return convertENUMBesonderesFahrwegelementObjectToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_ELEMENT_LAGE_OBJECT:
				return convertENUMElementLageObjectToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEIS_ABSCHLUSS_ART_OBJECT:
				return convertENUMGleisAbschlussArtObjectToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRE_BETRIEBSART_OBJECT:
				return convertENUMGleissperreBetriebsartObjectToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRENSIGNAL_OBJECT:
				return convertENUMGleissperrensignalObjectToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRE_VORZUGSLAGE_OBJECT:
				return convertENUMGleissperreVorzugslageObjectToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_WEICHE_BETRIEBSART_OBJECT:
				return convertENUMWeicheBetriebsartObjectToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUM_WEICHENSIGNAL_OBJECT:
				return convertENUMWeichensignalObjectToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUMW_KR_ART_OBJECT:
				return convertENUMWKrArtObjectToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ENUMW_KR_GSP_STELLART_OBJECT:
				return convertENUMWKrGspStellartObjectToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.GESCHWINDIGKEIT_LTYPE:
				return convertGeschwindigkeit_L_TypeToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.GESCHWINDIGKEIT_RTYPE:
				return convertGeschwindigkeit_R_TypeToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.HERZSTUECK_ANTRIEBE_TYPE:
				return convertHerzstueck_Antriebe_TypeToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ISOLIERFALL_TYPE:
				return convertIsolierfall_TypeToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.KREUZUNGSGLEIS_TYPE:
				return convertKreuzungsgleis_TypeToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.WKR_GRUNDFORM_TYPE:
				return convertW_Kr_Grundform_TypeToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.WEICHE_VORZUGSLAGE_TYPE:
				return convertWeiche_Vorzugslage_TypeToString(eDataType, instanceValue);
			case Weichen_und_GleissperrenPackage.ZUNGENPRUEFKONTAKT_ANZAHL_TYPE:
				return convertZungenpruefkontakt_Anzahl_TypeToString(eDataType, instanceValue);
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
	public Auffahrortung_TypeClass createAuffahrortung_TypeClass() {
		Auffahrortung_TypeClassImpl auffahrortung_TypeClass = new Auffahrortung_TypeClassImpl();
		return auffahrortung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Auswurfrichtung_TypeClass createAuswurfrichtung_TypeClass() {
		Auswurfrichtung_TypeClassImpl auswurfrichtung_TypeClass = new Auswurfrichtung_TypeClassImpl();
		return auswurfrichtung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Besonderes_Fahrwegelement_TypeClass createBesonderes_Fahrwegelement_TypeClass() {
		Besonderes_Fahrwegelement_TypeClassImpl besonderes_Fahrwegelement_TypeClass = new Besonderes_Fahrwegelement_TypeClassImpl();
		return besonderes_Fahrwegelement_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Elektrischer_Antrieb_Anzahl_TypeClass createElektrischer_Antrieb_Anzahl_TypeClass() {
		Elektrischer_Antrieb_Anzahl_TypeClassImpl elektrischer_Antrieb_Anzahl_TypeClass = new Elektrischer_Antrieb_Anzahl_TypeClassImpl();
		return elektrischer_Antrieb_Anzahl_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Elektrischer_Antrieb_Lage_TypeClass createElektrischer_Antrieb_Lage_TypeClass() {
		Elektrischer_Antrieb_Lage_TypeClassImpl elektrischer_Antrieb_Lage_TypeClass = new Elektrischer_Antrieb_Lage_TypeClassImpl();
		return elektrischer_Antrieb_Lage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element_Lage_TypeClass createElement_Lage_TypeClass() {
		Element_Lage_TypeClassImpl element_Lage_TypeClass = new Element_Lage_TypeClassImpl();
		return element_Lage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entgleisungsschuh_AttributeGroup createEntgleisungsschuh_AttributeGroup() {
		Entgleisungsschuh_AttributeGroupImpl entgleisungsschuh_AttributeGroup = new Entgleisungsschuh_AttributeGroupImpl();
		return entgleisungsschuh_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschwindigkeit_L_TypeClass createGeschwindigkeit_L_TypeClass() {
		Geschwindigkeit_L_TypeClassImpl geschwindigkeit_L_TypeClass = new Geschwindigkeit_L_TypeClassImpl();
		return geschwindigkeit_L_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschwindigkeit_R_TypeClass createGeschwindigkeit_R_TypeClass() {
		Geschwindigkeit_R_TypeClassImpl geschwindigkeit_R_TypeClass = new Geschwindigkeit_R_TypeClassImpl();
		return geschwindigkeit_R_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Abschluss createGleis_Abschluss() {
		Gleis_AbschlussImpl gleis_Abschluss = new Gleis_AbschlussImpl();
		return gleis_Abschluss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Abschluss_Art_TypeClass createGleis_Abschluss_Art_TypeClass() {
		Gleis_Abschluss_Art_TypeClassImpl gleis_Abschluss_Art_TypeClass = new Gleis_Abschluss_Art_TypeClassImpl();
		return gleis_Abschluss_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleissperre_Betriebsart_TypeClass createGleissperre_Betriebsart_TypeClass() {
		Gleissperre_Betriebsart_TypeClassImpl gleissperre_Betriebsart_TypeClass = new Gleissperre_Betriebsart_TypeClassImpl();
		return gleissperre_Betriebsart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleissperre_Element_AttributeGroup createGleissperre_Element_AttributeGroup() {
		Gleissperre_Element_AttributeGroupImpl gleissperre_Element_AttributeGroup = new Gleissperre_Element_AttributeGroupImpl();
		return gleissperre_Element_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleissperre_Vorzugslage_TypeClass createGleissperre_Vorzugslage_TypeClass() {
		Gleissperre_Vorzugslage_TypeClassImpl gleissperre_Vorzugslage_TypeClass = new Gleissperre_Vorzugslage_TypeClassImpl();
		return gleissperre_Vorzugslage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleissperrensignal_TypeClass createGleissperrensignal_TypeClass() {
		Gleissperrensignal_TypeClassImpl gleissperrensignal_TypeClass = new Gleissperrensignal_TypeClassImpl();
		return gleissperrensignal_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GZ_Freimeldung_L_AttributeGroup createGZ_Freimeldung_L_AttributeGroup() {
		GZ_Freimeldung_L_AttributeGroupImpl gZ_Freimeldung_L_AttributeGroup = new GZ_Freimeldung_L_AttributeGroupImpl();
		return gZ_Freimeldung_L_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GZ_Freimeldung_R_AttributeGroup createGZ_Freimeldung_R_AttributeGroup() {
		GZ_Freimeldung_R_AttributeGroupImpl gZ_Freimeldung_R_AttributeGroup = new GZ_Freimeldung_R_AttributeGroupImpl();
		return gZ_Freimeldung_R_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Herzstueck_Antriebe_TypeClass createHerzstueck_Antriebe_TypeClass() {
		Herzstueck_Antriebe_TypeClassImpl herzstueck_Antriebe_TypeClass = new Herzstueck_Antriebe_TypeClassImpl();
		return herzstueck_Antriebe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Isolierfall_TypeClass createIsolierfall_TypeClass() {
		Isolierfall_TypeClassImpl isolierfall_TypeClass = new Isolierfall_TypeClassImpl();
		return isolierfall_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kreuzung_AttributeGroup createKreuzung_AttributeGroup() {
		Kreuzung_AttributeGroupImpl kreuzung_AttributeGroup = new Kreuzung_AttributeGroupImpl();
		return kreuzung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kreuzungsgleis_TypeClass createKreuzungsgleis_TypeClass() {
		Kreuzungsgleis_TypeClassImpl kreuzungsgleis_TypeClass = new Kreuzungsgleis_TypeClassImpl();
		return kreuzungsgleis_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schutzschiene_TypeClass createSchutzschiene_TypeClass() {
		Schutzschiene_TypeClassImpl schutzschiene_TypeClass = new Schutzschiene_TypeClassImpl();
		return schutzschiene_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vorzugslage_Automatik_TypeClass createVorzugslage_Automatik_TypeClass() {
		Vorzugslage_Automatik_TypeClassImpl vorzugslage_Automatik_TypeClass = new Vorzugslage_Automatik_TypeClassImpl();
		return vorzugslage_Automatik_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Anlage createW_Kr_Anlage() {
		W_Kr_AnlageImpl w_Kr_Anlage = new W_Kr_AnlageImpl();
		return w_Kr_Anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Anlage_Allg_AttributeGroup createW_Kr_Anlage_Allg_AttributeGroup() {
		W_Kr_Anlage_Allg_AttributeGroupImpl w_Kr_Anlage_Allg_AttributeGroup = new W_Kr_Anlage_Allg_AttributeGroupImpl();
		return w_Kr_Anlage_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Art_TypeClass createW_Kr_Art_TypeClass() {
		W_Kr_Art_TypeClassImpl w_Kr_Art_TypeClass = new W_Kr_Art_TypeClassImpl();
		return w_Kr_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Grundform_TypeClass createW_Kr_Grundform_TypeClass() {
		W_Kr_Grundform_TypeClassImpl w_Kr_Grundform_TypeClass = new W_Kr_Grundform_TypeClassImpl();
		return w_Kr_Grundform_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element createW_Kr_Gsp_Element() {
		W_Kr_Gsp_ElementImpl w_Kr_Gsp_Element = new W_Kr_Gsp_ElementImpl();
		return w_Kr_Gsp_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element_Allg_AttributeGroup createW_Kr_Gsp_Element_Allg_AttributeGroup() {
		W_Kr_Gsp_Element_Allg_AttributeGroupImpl w_Kr_Gsp_Element_Allg_AttributeGroup = new W_Kr_Gsp_Element_Allg_AttributeGroupImpl();
		return w_Kr_Gsp_Element_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Komponente createW_Kr_Gsp_Komponente() {
		W_Kr_Gsp_KomponenteImpl w_Kr_Gsp_Komponente = new W_Kr_Gsp_KomponenteImpl();
		return w_Kr_Gsp_Komponente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Stellart_TypeClass createW_Kr_Gsp_Stellart_TypeClass() {
		W_Kr_Gsp_Stellart_TypeClassImpl w_Kr_Gsp_Stellart_TypeClass = new W_Kr_Gsp_Stellart_TypeClassImpl();
		return w_Kr_Gsp_Stellart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weiche_Betriebsart_TypeClass createWeiche_Betriebsart_TypeClass() {
		Weiche_Betriebsart_TypeClassImpl weiche_Betriebsart_TypeClass = new Weiche_Betriebsart_TypeClassImpl();
		return weiche_Betriebsart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weiche_Element_AttributeGroup createWeiche_Element_AttributeGroup() {
		Weiche_Element_AttributeGroupImpl weiche_Element_AttributeGroup = new Weiche_Element_AttributeGroupImpl();
		return weiche_Element_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weiche_Vorzugslage_TypeClass createWeiche_Vorzugslage_TypeClass() {
		Weiche_Vorzugslage_TypeClassImpl weiche_Vorzugslage_TypeClass = new Weiche_Vorzugslage_TypeClassImpl();
		return weiche_Vorzugslage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weichenlaufkette createWeichenlaufkette() {
		WeichenlaufketteImpl weichenlaufkette = new WeichenlaufketteImpl();
		return weichenlaufkette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weichenlaufkette_Zuordnung createWeichenlaufkette_Zuordnung() {
		Weichenlaufkette_ZuordnungImpl weichenlaufkette_Zuordnung = new Weichenlaufkette_ZuordnungImpl();
		return weichenlaufkette_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weichensignal_TypeClass createWeichensignal_TypeClass() {
		Weichensignal_TypeClassImpl weichensignal_TypeClass = new Weichensignal_TypeClassImpl();
		return weichensignal_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zungenpaar_AttributeGroup createZungenpaar_AttributeGroup() {
		Zungenpaar_AttributeGroupImpl zungenpaar_AttributeGroup = new Zungenpaar_AttributeGroupImpl();
		return zungenpaar_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zungenpruefkontakt_Anzahl_TypeClass createZungenpruefkontakt_Anzahl_TypeClass() {
		Zungenpruefkontakt_Anzahl_TypeClassImpl zungenpruefkontakt_Anzahl_TypeClass = new Zungenpruefkontakt_Anzahl_TypeClassImpl();
		return zungenpruefkontakt_Anzahl_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBesonderesFahrwegelement createENUMBesonderesFahrwegelementFromString(EDataType eDataType, String initialValue) {
		ENUMBesonderesFahrwegelement result = ENUMBesonderesFahrwegelement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBesonderesFahrwegelementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMElementLage createENUMElementLageFromString(EDataType eDataType, String initialValue) {
		ENUMElementLage result = ENUMElementLage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMElementLageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGleisAbschlussArt createENUMGleisAbschlussArtFromString(EDataType eDataType, String initialValue) {
		ENUMGleisAbschlussArt result = ENUMGleisAbschlussArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGleisAbschlussArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGleissperreBetriebsart createENUMGleissperreBetriebsartFromString(EDataType eDataType, String initialValue) {
		ENUMGleissperreBetriebsart result = ENUMGleissperreBetriebsart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGleissperreBetriebsartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGleissperrensignal createENUMGleissperrensignalFromString(EDataType eDataType, String initialValue) {
		ENUMGleissperrensignal result = ENUMGleissperrensignal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGleissperrensignalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGleissperreVorzugslage createENUMGleissperreVorzugslageFromString(EDataType eDataType, String initialValue) {
		ENUMGleissperreVorzugslage result = ENUMGleissperreVorzugslage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGleissperreVorzugslageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWeicheBetriebsart createENUMWeicheBetriebsartFromString(EDataType eDataType, String initialValue) {
		ENUMWeicheBetriebsart result = ENUMWeicheBetriebsart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWeicheBetriebsartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWeichensignal createENUMWeichensignalFromString(EDataType eDataType, String initialValue) {
		ENUMWeichensignal result = ENUMWeichensignal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWeichensignalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWKrArt createENUMWKrArtFromString(EDataType eDataType, String initialValue) {
		ENUMWKrArt result = ENUMWKrArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWKrArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWKrGspStellart createENUMWKrGspStellartFromString(EDataType eDataType, String initialValue) {
		ENUMWKrGspStellart result = ENUMWKrGspStellart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWKrGspStellartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinksRechts createCAuswurfrichtungFromString(EDataType eDataType, String initialValue) {
		return (ENUMLinksRechts)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCAuswurfrichtungToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createElektrischer_Antrieb_Anzahl_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElektrischer_Antrieb_Anzahl_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinksRechts createElektrischer_Antrieb_Lage_TypeFromString(EDataType eDataType, String initialValue) {
		return (ENUMLinksRechts)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElektrischer_Antrieb_Lage_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBesonderesFahrwegelement createENUMBesonderesFahrwegelementObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBesonderesFahrwegelementFromString(Weichen_und_GleissperrenPackage.Literals.ENUM_BESONDERES_FAHRWEGELEMENT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBesonderesFahrwegelementObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBesonderesFahrwegelementToString(Weichen_und_GleissperrenPackage.Literals.ENUM_BESONDERES_FAHRWEGELEMENT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMElementLage createENUMElementLageObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMElementLageFromString(Weichen_und_GleissperrenPackage.Literals.ENUM_ELEMENT_LAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMElementLageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMElementLageToString(Weichen_und_GleissperrenPackage.Literals.ENUM_ELEMENT_LAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGleisAbschlussArt createENUMGleisAbschlussArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGleisAbschlussArtFromString(Weichen_und_GleissperrenPackage.Literals.ENUM_GLEIS_ABSCHLUSS_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGleisAbschlussArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGleisAbschlussArtToString(Weichen_und_GleissperrenPackage.Literals.ENUM_GLEIS_ABSCHLUSS_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGleissperreBetriebsart createENUMGleissperreBetriebsartObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGleissperreBetriebsartFromString(Weichen_und_GleissperrenPackage.Literals.ENUM_GLEISSPERRE_BETRIEBSART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGleissperreBetriebsartObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGleissperreBetriebsartToString(Weichen_und_GleissperrenPackage.Literals.ENUM_GLEISSPERRE_BETRIEBSART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGleissperrensignal createENUMGleissperrensignalObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGleissperrensignalFromString(Weichen_und_GleissperrenPackage.Literals.ENUM_GLEISSPERRENSIGNAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGleissperrensignalObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGleissperrensignalToString(Weichen_und_GleissperrenPackage.Literals.ENUM_GLEISSPERRENSIGNAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGleissperreVorzugslage createENUMGleissperreVorzugslageObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGleissperreVorzugslageFromString(Weichen_und_GleissperrenPackage.Literals.ENUM_GLEISSPERRE_VORZUGSLAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGleissperreVorzugslageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGleissperreVorzugslageToString(Weichen_und_GleissperrenPackage.Literals.ENUM_GLEISSPERRE_VORZUGSLAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWeicheBetriebsart createENUMWeicheBetriebsartObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMWeicheBetriebsartFromString(Weichen_und_GleissperrenPackage.Literals.ENUM_WEICHE_BETRIEBSART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWeicheBetriebsartObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMWeicheBetriebsartToString(Weichen_und_GleissperrenPackage.Literals.ENUM_WEICHE_BETRIEBSART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWeichensignal createENUMWeichensignalObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMWeichensignalFromString(Weichen_und_GleissperrenPackage.Literals.ENUM_WEICHENSIGNAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWeichensignalObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMWeichensignalToString(Weichen_und_GleissperrenPackage.Literals.ENUM_WEICHENSIGNAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWKrArt createENUMWKrArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMWKrArtFromString(Weichen_und_GleissperrenPackage.Literals.ENUMW_KR_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWKrArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMWKrArtToString(Weichen_und_GleissperrenPackage.Literals.ENUMW_KR_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWKrGspStellart createENUMWKrGspStellartObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMWKrGspStellartFromString(Weichen_und_GleissperrenPackage.Literals.ENUMW_KR_GSP_STELLART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWKrGspStellartObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMWKrGspStellartToString(Weichen_und_GleissperrenPackage.Literals.ENUMW_KR_GSP_STELLART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createGeschwindigkeit_L_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeschwindigkeit_L_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createGeschwindigkeit_R_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeschwindigkeit_R_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createHerzstueck_Antriebe_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHerzstueck_Antriebe_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIsolierfall_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsolierfall_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinksRechts createKreuzungsgleis_TypeFromString(EDataType eDataType, String initialValue) {
		return (ENUMLinksRechts)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKreuzungsgleis_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createW_Kr_Grundform_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertW_Kr_Grundform_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinksRechts createWeiche_Vorzugslage_TypeFromString(EDataType eDataType, String initialValue) {
		return (ENUMLinksRechts)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeiche_Vorzugslage_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createZungenpruefkontakt_Anzahl_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZungenpruefkontakt_Anzahl_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weichen_und_GleissperrenPackage getWeichen_und_GleissperrenPackage() {
		return (Weichen_und_GleissperrenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Weichen_und_GleissperrenPackage getPackage() {
		return Weichen_und_GleissperrenPackage.eINSTANCE;
	}

} //Weichen_und_GleissperrenFactoryImpl
