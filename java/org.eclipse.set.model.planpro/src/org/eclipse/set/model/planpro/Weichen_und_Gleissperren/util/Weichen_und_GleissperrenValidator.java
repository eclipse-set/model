/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Weichen_und_Gleissperren.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts;

import org.eclipse.set.model.planpro.BasisTypen.util.BasisTypenValidator;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage
 * @generated
 */
public class Weichen_und_GleissperrenValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Weichen_und_GleissperrenValidator INSTANCE = new Weichen_und_GleissperrenValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.planpro.Weichen_und_Gleissperren";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasisTypenValidator basisTypenValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weichen_und_GleissperrenValidator() {
		super();
		basisTypenValidator = BasisTypenValidator.INSTANCE;
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Weichen_und_GleissperrenPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Weichen_und_GleissperrenPackage.AUFFAHRORTUNG_TYPE_CLASS:
				return validateAuffahrortung_TypeClass((Auffahrortung_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.AUSTAUSCH_ANTRIEBE_TYPE_CLASS:
				return validateAustausch_Antriebe_TypeClass((Austausch_Antriebe_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.AUSWURFRICHTUNG_TYPE_CLASS:
				return validateAuswurfrichtung_TypeClass((Auswurfrichtung_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.BESONDERES_FAHRWEGELEMENT_TYPE_CLASS:
				return validateBesonderes_Fahrwegelement_TypeClass((Besonderes_Fahrwegelement_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE_CLASS:
				return validateElektrischer_Antrieb_Anzahl_TypeClass((Elektrischer_Antrieb_Anzahl_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ELEKTRISCHER_ANTRIEB_LAGE_TYPE_CLASS:
				return validateElektrischer_Antrieb_Lage_TypeClass((Elektrischer_Antrieb_Lage_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ELEMENT_LAGE_TYPE_CLASS:
				return validateElement_Lage_TypeClass((Element_Lage_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP:
				return validateEntgleisungsschuh_AttributeGroup((Entgleisungsschuh_AttributeGroup)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.GESCHWINDIGKEIT_LTYPE_CLASS:
				return validateGeschwindigkeit_L_TypeClass((Geschwindigkeit_L_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.GESCHWINDIGKEIT_RTYPE_CLASS:
				return validateGeschwindigkeit_R_TypeClass((Geschwindigkeit_R_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS:
				return validateGleis_Abschluss((Gleis_Abschluss)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS_ART_TYPE_CLASS:
				return validateGleis_Abschluss_Art_TypeClass((Gleis_Abschluss_Art_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_BETRIEBSART_TYPE_CLASS:
				return validateGleissperre_Betriebsart_TypeClass((Gleissperre_Betriebsart_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP:
				return validateGleissperre_Element_AttributeGroup((Gleissperre_Element_AttributeGroup)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_VORZUGSLAGE_TYPE_CLASS:
				return validateGleissperre_Vorzugslage_TypeClass((Gleissperre_Vorzugslage_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.GLEISSPERRENSIGNAL_TYPE_CLASS:
				return validateGleissperrensignal_TypeClass((Gleissperrensignal_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP:
				return validateGZ_Freimeldung_L_AttributeGroup((GZ_Freimeldung_L_AttributeGroup)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP:
				return validateGZ_Freimeldung_R_AttributeGroup((GZ_Freimeldung_R_AttributeGroup)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.HERZSTUECK_ANTRIEBE_TYPE_CLASS:
				return validateHerzstueck_Antriebe_TypeClass((Herzstueck_Antriebe_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ISOLIERFALL_TYPE_CLASS:
				return validateIsolierfall_TypeClass((Isolierfall_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.KR_KR_WSEITENZUORDNUNG_TYPE_CLASS:
				return validateKr_KrW_Seitenzuordnung_TypeClass((Kr_KrW_Seitenzuordnung_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.KREUZUNG_ATTRIBUTE_GROUP:
				return validateKreuzung_AttributeGroup((Kreuzung_AttributeGroup)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.KREUZUNGSGLEIS_TYPE_CLASS:
				return validateKreuzungsgleis_TypeClass((Kreuzungsgleis_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.SCHUTZSCHIENE_TYPE_CLASS:
				return validateSchutzschiene_TypeClass((Schutzschiene_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.STAMMGLEIS_TYPE_CLASS:
				return validateStammgleis_TypeClass((Stammgleis_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.VORZUGSLAGE_AUTOMATIK_TYPE_CLASS:
				return validateVorzugslage_Automatik_TypeClass((Vorzugslage_Automatik_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE:
				return validateW_Kr_Anlage((W_Kr_Anlage)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP:
				return validateW_Kr_Anlage_Allg_AttributeGroup((W_Kr_Anlage_Allg_AttributeGroup)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WKR_ART_TYPE_CLASS:
				return validateW_Kr_Art_TypeClass((W_Kr_Art_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WKR_GRUNDFORM_TYPE_CLASS:
				return validateW_Kr_Grundform_TypeClass((W_Kr_Grundform_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT:
				return validateW_Kr_Gsp_Element((W_Kr_Gsp_Element)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP:
				return validateW_Kr_Gsp_Element_Allg_AttributeGroup((W_Kr_Gsp_Element_Allg_AttributeGroup)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE:
				return validateW_Kr_Gsp_Komponente((W_Kr_Gsp_Komponente)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WKR_GSP_STELLART_TYPE_CLASS:
				return validateW_Kr_Gsp_Stellart_TypeClass((W_Kr_Gsp_Stellart_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WEICHE_BETRIEBSART_TYPE_CLASS:
				return validateWeiche_Betriebsart_TypeClass((Weiche_Betriebsart_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP:
				return validateWeiche_Element_AttributeGroup((Weiche_Element_AttributeGroup)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WEICHE_VORZUGSLAGE_TYPE_CLASS:
				return validateWeiche_Vorzugslage_TypeClass((Weiche_Vorzugslage_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE:
				return validateWeichenlaufkette((Weichenlaufkette)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG:
				return validateWeichenlaufkette_Zuordnung((Weichenlaufkette_Zuordnung)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WEICHENSIGNAL_TYPE_CLASS:
				return validateWeichensignal_TypeClass((Weichensignal_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP:
				return validateZungenpaar_AttributeGroup((Zungenpaar_AttributeGroup)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ZUNGENPRUEFKONTAKT_ANZAHL_TYPE_CLASS:
				return validateZungenpruefkontakt_Anzahl_TypeClass((Zungenpruefkontakt_Anzahl_TypeClass)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_BESONDERES_FAHRWEGELEMENT:
				return validateENUMBesonderesFahrwegelement((ENUMBesonderesFahrwegelement)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_ELEKTRISCHER_ANTRIEB_LAGE:
				return validateENUMElektrischerAntriebLage((ENUMElektrischerAntriebLage)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_ELEMENT_LAGE:
				return validateENUMElementLage((ENUMElementLage)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_GLEIS_ABSCHLUSS_ART:
				return validateENUMGleisAbschlussArt((ENUMGleisAbschlussArt)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRE_BETRIEBSART:
				return validateENUMGleissperreBetriebsart((ENUMGleissperreBetriebsart)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRENSIGNAL:
				return validateENUMGleissperrensignal((ENUMGleissperrensignal)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRE_VORZUGSLAGE:
				return validateENUMGleissperreVorzugslage((ENUMGleissperreVorzugslage)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_WEICHE_BETRIEBSART:
				return validateENUMWeicheBetriebsart((ENUMWeicheBetriebsart)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_WEICHENSIGNAL:
				return validateENUMWeichensignal((ENUMWeichensignal)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUMW_KR_ART:
				return validateENUMWKrArt((ENUMWKrArt)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUMW_KR_GSP_STELLART:
				return validateENUMWKrGspStellart((ENUMWKrGspStellart)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.CAUSWURFRICHTUNG:
				return validateCAuswurfrichtung((ENUMLinksRechts)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE:
				return validateElektrischer_Antrieb_Anzahl_Type((BigInteger)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_BESONDERES_FAHRWEGELEMENT_OBJECT:
				return validateENUMBesonderesFahrwegelementObject((ENUMBesonderesFahrwegelement)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_ELEKTRISCHER_ANTRIEB_LAGE_OBJECT:
				return validateENUMElektrischerAntriebLageObject((ENUMElektrischerAntriebLage)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_ELEMENT_LAGE_OBJECT:
				return validateENUMElementLageObject((ENUMElementLage)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_GLEIS_ABSCHLUSS_ART_OBJECT:
				return validateENUMGleisAbschlussArtObject((ENUMGleisAbschlussArt)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRE_BETRIEBSART_OBJECT:
				return validateENUMGleissperreBetriebsartObject((ENUMGleissperreBetriebsart)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRENSIGNAL_OBJECT:
				return validateENUMGleissperrensignalObject((ENUMGleissperrensignal)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_GLEISSPERRE_VORZUGSLAGE_OBJECT:
				return validateENUMGleissperreVorzugslageObject((ENUMGleissperreVorzugslage)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_WEICHE_BETRIEBSART_OBJECT:
				return validateENUMWeicheBetriebsartObject((ENUMWeicheBetriebsart)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUM_WEICHENSIGNAL_OBJECT:
				return validateENUMWeichensignalObject((ENUMWeichensignal)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUMW_KR_ART_OBJECT:
				return validateENUMWKrArtObject((ENUMWKrArt)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ENUMW_KR_GSP_STELLART_OBJECT:
				return validateENUMWKrGspStellartObject((ENUMWKrGspStellart)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.GESCHWINDIGKEIT_LTYPE:
				return validateGeschwindigkeit_L_Type((BigInteger)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.GESCHWINDIGKEIT_RTYPE:
				return validateGeschwindigkeit_R_Type((BigInteger)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.HERZSTUECK_ANTRIEBE_TYPE:
				return validateHerzstueck_Antriebe_Type((BigInteger)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ISOLIERFALL_TYPE:
				return validateIsolierfall_Type((String)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.KR_KR_WSEITENZUORDNUNG_TYPE:
				return validateKr_KrW_Seitenzuordnung_Type((ENUMLinksRechts)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.KREUZUNGSGLEIS_TYPE:
				return validateKreuzungsgleis_Type((ENUMLinksRechts)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.STAMMGLEIS_TYPE:
				return validateStammgleis_Type((ENUMLinksRechts)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WKR_GRUNDFORM_TYPE:
				return validateW_Kr_Grundform_Type((String)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.WEICHE_VORZUGSLAGE_TYPE:
				return validateWeiche_Vorzugslage_Type((ENUMLinksRechts)value, diagnostics, context);
			case Weichen_und_GleissperrenPackage.ZUNGENPRUEFKONTAKT_ANZAHL_TYPE:
				return validateZungenpruefkontakt_Anzahl_Type((BigInteger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuffahrortung_TypeClass(Auffahrortung_TypeClass auffahrortung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auffahrortung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAustausch_Antriebe_TypeClass(Austausch_Antriebe_TypeClass austausch_Antriebe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(austausch_Antriebe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuswurfrichtung_TypeClass(Auswurfrichtung_TypeClass auswurfrichtung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auswurfrichtung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBesonderes_Fahrwegelement_TypeClass(Besonderes_Fahrwegelement_TypeClass besonderes_Fahrwegelement_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(besonderes_Fahrwegelement_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElektrischer_Antrieb_Anzahl_TypeClass(Elektrischer_Antrieb_Anzahl_TypeClass elektrischer_Antrieb_Anzahl_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elektrischer_Antrieb_Anzahl_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElektrischer_Antrieb_Lage_TypeClass(Elektrischer_Antrieb_Lage_TypeClass elektrischer_Antrieb_Lage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elektrischer_Antrieb_Lage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_Lage_TypeClass(Element_Lage_TypeClass element_Lage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element_Lage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntgleisungsschuh_AttributeGroup(Entgleisungsschuh_AttributeGroup entgleisungsschuh_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entgleisungsschuh_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschwindigkeit_L_TypeClass(Geschwindigkeit_L_TypeClass geschwindigkeit_L_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geschwindigkeit_L_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschwindigkeit_R_TypeClass(Geschwindigkeit_R_TypeClass geschwindigkeit_R_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geschwindigkeit_R_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGleis_Abschluss(Gleis_Abschluss gleis_Abschluss, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gleis_Abschluss, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGleis_Abschluss_Art_TypeClass(Gleis_Abschluss_Art_TypeClass gleis_Abschluss_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gleis_Abschluss_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGleissperre_Betriebsart_TypeClass(Gleissperre_Betriebsart_TypeClass gleissperre_Betriebsart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gleissperre_Betriebsart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGleissperre_Element_AttributeGroup(Gleissperre_Element_AttributeGroup gleissperre_Element_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gleissperre_Element_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGleissperre_Vorzugslage_TypeClass(Gleissperre_Vorzugslage_TypeClass gleissperre_Vorzugslage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gleissperre_Vorzugslage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGleissperrensignal_TypeClass(Gleissperrensignal_TypeClass gleissperrensignal_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gleissperrensignal_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGZ_Freimeldung_L_AttributeGroup(GZ_Freimeldung_L_AttributeGroup gZ_Freimeldung_L_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gZ_Freimeldung_L_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGZ_Freimeldung_R_AttributeGroup(GZ_Freimeldung_R_AttributeGroup gZ_Freimeldung_R_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gZ_Freimeldung_R_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHerzstueck_Antriebe_TypeClass(Herzstueck_Antriebe_TypeClass herzstueck_Antriebe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(herzstueck_Antriebe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsolierfall_TypeClass(Isolierfall_TypeClass isolierfall_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isolierfall_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKr_KrW_Seitenzuordnung_TypeClass(Kr_KrW_Seitenzuordnung_TypeClass kr_KrW_Seitenzuordnung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kr_KrW_Seitenzuordnung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKreuzung_AttributeGroup(Kreuzung_AttributeGroup kreuzung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kreuzung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKreuzungsgleis_TypeClass(Kreuzungsgleis_TypeClass kreuzungsgleis_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kreuzungsgleis_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchutzschiene_TypeClass(Schutzschiene_TypeClass schutzschiene_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schutzschiene_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStammgleis_TypeClass(Stammgleis_TypeClass stammgleis_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stammgleis_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVorzugslage_Automatik_TypeClass(Vorzugslage_Automatik_TypeClass vorzugslage_Automatik_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vorzugslage_Automatik_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Kr_Anlage(W_Kr_Anlage w_Kr_Anlage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(w_Kr_Anlage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Kr_Anlage_Allg_AttributeGroup(W_Kr_Anlage_Allg_AttributeGroup w_Kr_Anlage_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(w_Kr_Anlage_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Kr_Art_TypeClass(W_Kr_Art_TypeClass w_Kr_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(w_Kr_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Kr_Grundform_TypeClass(W_Kr_Grundform_TypeClass w_Kr_Grundform_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(w_Kr_Grundform_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Kr_Gsp_Element(W_Kr_Gsp_Element w_Kr_Gsp_Element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(w_Kr_Gsp_Element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Kr_Gsp_Element_Allg_AttributeGroup(W_Kr_Gsp_Element_Allg_AttributeGroup w_Kr_Gsp_Element_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(w_Kr_Gsp_Element_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Kr_Gsp_Komponente(W_Kr_Gsp_Komponente w_Kr_Gsp_Komponente, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(w_Kr_Gsp_Komponente, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Kr_Gsp_Stellart_TypeClass(W_Kr_Gsp_Stellart_TypeClass w_Kr_Gsp_Stellart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(w_Kr_Gsp_Stellart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeiche_Betriebsart_TypeClass(Weiche_Betriebsart_TypeClass weiche_Betriebsart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weiche_Betriebsart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeiche_Element_AttributeGroup(Weiche_Element_AttributeGroup weiche_Element_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weiche_Element_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeiche_Vorzugslage_TypeClass(Weiche_Vorzugslage_TypeClass weiche_Vorzugslage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weiche_Vorzugslage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeichenlaufkette(Weichenlaufkette weichenlaufkette, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weichenlaufkette, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeichenlaufkette_Zuordnung(Weichenlaufkette_Zuordnung weichenlaufkette_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weichenlaufkette_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeichensignal_TypeClass(Weichensignal_TypeClass weichensignal_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weichensignal_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZungenpaar_AttributeGroup(Zungenpaar_AttributeGroup zungenpaar_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zungenpaar_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZungenpruefkontakt_Anzahl_TypeClass(Zungenpruefkontakt_Anzahl_TypeClass zungenpruefkontakt_Anzahl_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zungenpruefkontakt_Anzahl_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBesonderesFahrwegelement(ENUMBesonderesFahrwegelement enumBesonderesFahrwegelement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMElektrischerAntriebLage(ENUMElektrischerAntriebLage enumElektrischerAntriebLage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMElementLage(ENUMElementLage enumElementLage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGleisAbschlussArt(ENUMGleisAbschlussArt enumGleisAbschlussArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGleissperreBetriebsart(ENUMGleissperreBetriebsart enumGleissperreBetriebsart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGleissperrensignal(ENUMGleissperrensignal enumGleissperrensignal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGleissperreVorzugslage(ENUMGleissperreVorzugslage enumGleissperreVorzugslage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWeicheBetriebsart(ENUMWeicheBetriebsart enumWeicheBetriebsart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWeichensignal(ENUMWeichensignal enumWeichensignal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWKrArt(ENUMWKrArt enumwKrArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWKrGspStellart(ENUMWKrGspStellart enumwKrGspStellart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAuswurfrichtung(ENUMLinksRechts cAuswurfrichtung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElektrischer_Antrieb_Anzahl_Type(BigInteger elektrischer_Antrieb_Anzahl_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateElektrischer_Antrieb_Anzahl_Type_Pattern(elektrischer_Antrieb_Anzahl_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateElektrischer_Antrieb_Anzahl_Type_Pattern
	 */
	public static final  PatternMatcher [][] ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]|1[0-5]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Elektrischer Antrieb Anzahl Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElektrischer_Antrieb_Anzahl_Type_Pattern(BigInteger elektrischer_Antrieb_Anzahl_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Weichen_und_GleissperrenPackage.Literals.ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE, elektrischer_Antrieb_Anzahl_Type, ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBesonderesFahrwegelementObject(ENUMBesonderesFahrwegelement enumBesonderesFahrwegelementObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMElektrischerAntriebLageObject(ENUMElektrischerAntriebLage enumElektrischerAntriebLageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMElementLageObject(ENUMElementLage enumElementLageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGleisAbschlussArtObject(ENUMGleisAbschlussArt enumGleisAbschlussArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGleissperreBetriebsartObject(ENUMGleissperreBetriebsart enumGleissperreBetriebsartObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGleissperrensignalObject(ENUMGleissperrensignal enumGleissperrensignalObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGleissperreVorzugslageObject(ENUMGleissperreVorzugslage enumGleissperreVorzugslageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWeicheBetriebsartObject(ENUMWeicheBetriebsart enumWeicheBetriebsartObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWeichensignalObject(ENUMWeichensignal enumWeichensignalObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWKrArtObject(ENUMWKrArt enumwKrArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWKrGspStellartObject(ENUMWKrGspStellart enumwKrGspStellartObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschwindigkeit_L_Type(BigInteger geschwindigkeit_L_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(geschwindigkeit_L_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschwindigkeit_R_Type(BigInteger geschwindigkeit_R_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(geschwindigkeit_R_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHerzstueck_Antriebe_Type(BigInteger herzstueck_Antriebe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHerzstueck_Antriebe_Type_Pattern(herzstueck_Antriebe_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHerzstueck_Antriebe_Type_Pattern
	 */
	public static final  PatternMatcher [][] HERZSTUECK_ANTRIEBE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9]|1[0-5]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Herzstueck Antriebe Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHerzstueck_Antriebe_Type_Pattern(BigInteger herzstueck_Antriebe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Weichen_und_GleissperrenPackage.Literals.HERZSTUECK_ANTRIEBE_TYPE, herzstueck_Antriebe_Type, HERZSTUECK_ANTRIEBE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsolierfall_Type(String isolierfall_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIsolierfall_Type_Pattern(isolierfall_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIsolierfall_Type_Pattern
	 */
	public static final  PatternMatcher [][] ISOLIERFALL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Isolierfall Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsolierfall_Type_Pattern(String isolierfall_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Weichen_und_GleissperrenPackage.Literals.ISOLIERFALL_TYPE, isolierfall_Type, ISOLIERFALL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKr_KrW_Seitenzuordnung_Type(ENUMLinksRechts kr_KrW_Seitenzuordnung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKreuzungsgleis_Type(ENUMLinksRechts kreuzungsgleis_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStammgleis_Type(ENUMLinksRechts stammgleis_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Kr_Grundform_Type(String w_Kr_Grundform_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateW_Kr_Grundform_Type_Pattern(w_Kr_Grundform_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateW_Kr_Grundform_Type_Pattern
	 */
	public static final  PatternMatcher [][] WKR_GRUNDFORM_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,50}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>WKr Grundform Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Kr_Grundform_Type_Pattern(String w_Kr_Grundform_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Weichen_und_GleissperrenPackage.Literals.WKR_GRUNDFORM_TYPE, w_Kr_Grundform_Type, WKR_GRUNDFORM_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeiche_Vorzugslage_Type(ENUMLinksRechts weiche_Vorzugslage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZungenpruefkontakt_Anzahl_Type(BigInteger zungenpruefkontakt_Anzahl_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZungenpruefkontakt_Anzahl_Type_Pattern(zungenpruefkontakt_Anzahl_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateZungenpruefkontakt_Anzahl_Type_Pattern
	 */
	public static final  PatternMatcher [][] ZUNGENPRUEFKONTAKT_ANZAHL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]|1[0-5]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Zungenpruefkontakt Anzahl Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZungenpruefkontakt_Anzahl_Type_Pattern(BigInteger zungenpruefkontakt_Anzahl_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Weichen_und_GleissperrenPackage.Literals.ZUNGENPRUEFKONTAKT_ANZAHL_TYPE, zungenpruefkontakt_Anzahl_Type, ZUNGENPRUEFKONTAKT_ANZAHL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Weichen_und_GleissperrenValidator
