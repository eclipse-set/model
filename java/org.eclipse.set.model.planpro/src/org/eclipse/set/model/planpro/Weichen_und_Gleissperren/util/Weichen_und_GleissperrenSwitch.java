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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.*;

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
 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage
 * @generated
 */
public class Weichen_und_GleissperrenSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Weichen_und_GleissperrenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weichen_und_GleissperrenSwitch() {
		if (modelPackage == null) {
			modelPackage = Weichen_und_GleissperrenPackage.eINSTANCE;
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
			case Weichen_und_GleissperrenPackage.AUFFAHRORTUNG_TYPE_CLASS: {
				Auffahrortung_TypeClass auffahrortung_TypeClass = (Auffahrortung_TypeClass)theEObject;
				T result = caseAuffahrortung_TypeClass(auffahrortung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(auffahrortung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.AUSTAUSCH_ANTRIEBE_TYPE_CLASS: {
				Austausch_Antriebe_TypeClass austausch_Antriebe_TypeClass = (Austausch_Antriebe_TypeClass)theEObject;
				T result = caseAustausch_Antriebe_TypeClass(austausch_Antriebe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(austausch_Antriebe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.AUSWURFRICHTUNG_TYPE_CLASS: {
				Auswurfrichtung_TypeClass auswurfrichtung_TypeClass = (Auswurfrichtung_TypeClass)theEObject;
				T result = caseAuswurfrichtung_TypeClass(auswurfrichtung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(auswurfrichtung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.BESONDERES_FAHRWEGELEMENT_TYPE_CLASS: {
				Besonderes_Fahrwegelement_TypeClass besonderes_Fahrwegelement_TypeClass = (Besonderes_Fahrwegelement_TypeClass)theEObject;
				T result = caseBesonderes_Fahrwegelement_TypeClass(besonderes_Fahrwegelement_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(besonderes_Fahrwegelement_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE_CLASS: {
				Elektrischer_Antrieb_Anzahl_TypeClass elektrischer_Antrieb_Anzahl_TypeClass = (Elektrischer_Antrieb_Anzahl_TypeClass)theEObject;
				T result = caseElektrischer_Antrieb_Anzahl_TypeClass(elektrischer_Antrieb_Anzahl_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(elektrischer_Antrieb_Anzahl_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.ELEKTRISCHER_ANTRIEB_LAGE_TYPE_CLASS: {
				Elektrischer_Antrieb_Lage_TypeClass elektrischer_Antrieb_Lage_TypeClass = (Elektrischer_Antrieb_Lage_TypeClass)theEObject;
				T result = caseElektrischer_Antrieb_Lage_TypeClass(elektrischer_Antrieb_Lage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(elektrischer_Antrieb_Lage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.ELEMENT_LAGE_TYPE_CLASS: {
				Element_Lage_TypeClass element_Lage_TypeClass = (Element_Lage_TypeClass)theEObject;
				T result = caseElement_Lage_TypeClass(element_Lage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(element_Lage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP: {
				Entgleisungsschuh_AttributeGroup entgleisungsschuh_AttributeGroup = (Entgleisungsschuh_AttributeGroup)theEObject;
				T result = caseEntgleisungsschuh_AttributeGroup(entgleisungsschuh_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.GESCHWINDIGKEIT_LTYPE_CLASS: {
				Geschwindigkeit_L_TypeClass geschwindigkeit_L_TypeClass = (Geschwindigkeit_L_TypeClass)theEObject;
				T result = caseGeschwindigkeit_L_TypeClass(geschwindigkeit_L_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geschwindigkeit_L_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.GESCHWINDIGKEIT_RTYPE_CLASS: {
				Geschwindigkeit_R_TypeClass geschwindigkeit_R_TypeClass = (Geschwindigkeit_R_TypeClass)theEObject;
				T result = caseGeschwindigkeit_R_TypeClass(geschwindigkeit_R_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geschwindigkeit_R_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS: {
				Gleis_Abschluss gleis_Abschluss = (Gleis_Abschluss)theEObject;
				T result = caseGleis_Abschluss(gleis_Abschluss);
				if (result == null) result = casePunkt_Objekt(gleis_Abschluss);
				if (result == null) result = caseBasis_Objekt(gleis_Abschluss);
				if (result == null) result = caseUr_Objekt(gleis_Abschluss);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS_ART_TYPE_CLASS: {
				Gleis_Abschluss_Art_TypeClass gleis_Abschluss_Art_TypeClass = (Gleis_Abschluss_Art_TypeClass)theEObject;
				T result = caseGleis_Abschluss_Art_TypeClass(gleis_Abschluss_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gleis_Abschluss_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_BETRIEBSART_TYPE_CLASS: {
				Gleissperre_Betriebsart_TypeClass gleissperre_Betriebsart_TypeClass = (Gleissperre_Betriebsart_TypeClass)theEObject;
				T result = caseGleissperre_Betriebsart_TypeClass(gleissperre_Betriebsart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gleissperre_Betriebsart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP: {
				Gleissperre_Element_AttributeGroup gleissperre_Element_AttributeGroup = (Gleissperre_Element_AttributeGroup)theEObject;
				T result = caseGleissperre_Element_AttributeGroup(gleissperre_Element_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_VORZUGSLAGE_TYPE_CLASS: {
				Gleissperre_Vorzugslage_TypeClass gleissperre_Vorzugslage_TypeClass = (Gleissperre_Vorzugslage_TypeClass)theEObject;
				T result = caseGleissperre_Vorzugslage_TypeClass(gleissperre_Vorzugslage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gleissperre_Vorzugslage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.GLEISSPERRENSIGNAL_TYPE_CLASS: {
				Gleissperrensignal_TypeClass gleissperrensignal_TypeClass = (Gleissperrensignal_TypeClass)theEObject;
				T result = caseGleissperrensignal_TypeClass(gleissperrensignal_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gleissperrensignal_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP: {
				GZ_Freimeldung_L_AttributeGroup gZ_Freimeldung_L_AttributeGroup = (GZ_Freimeldung_L_AttributeGroup)theEObject;
				T result = caseGZ_Freimeldung_L_AttributeGroup(gZ_Freimeldung_L_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP: {
				GZ_Freimeldung_R_AttributeGroup gZ_Freimeldung_R_AttributeGroup = (GZ_Freimeldung_R_AttributeGroup)theEObject;
				T result = caseGZ_Freimeldung_R_AttributeGroup(gZ_Freimeldung_R_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.HERZSTUECK_ANTRIEBE_TYPE_CLASS: {
				Herzstueck_Antriebe_TypeClass herzstueck_Antriebe_TypeClass = (Herzstueck_Antriebe_TypeClass)theEObject;
				T result = caseHerzstueck_Antriebe_TypeClass(herzstueck_Antriebe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(herzstueck_Antriebe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.ISOLIERFALL_TYPE_CLASS: {
				Isolierfall_TypeClass isolierfall_TypeClass = (Isolierfall_TypeClass)theEObject;
				T result = caseIsolierfall_TypeClass(isolierfall_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(isolierfall_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.KR_KR_WSEITENZUORDNUNG_TYPE_CLASS: {
				Kr_KrW_Seitenzuordnung_TypeClass kr_KrW_Seitenzuordnung_TypeClass = (Kr_KrW_Seitenzuordnung_TypeClass)theEObject;
				T result = caseKr_KrW_Seitenzuordnung_TypeClass(kr_KrW_Seitenzuordnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kr_KrW_Seitenzuordnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.KREUZUNG_ATTRIBUTE_GROUP: {
				Kreuzung_AttributeGroup kreuzung_AttributeGroup = (Kreuzung_AttributeGroup)theEObject;
				T result = caseKreuzung_AttributeGroup(kreuzung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.KREUZUNGSGLEIS_TYPE_CLASS: {
				Kreuzungsgleis_TypeClass kreuzungsgleis_TypeClass = (Kreuzungsgleis_TypeClass)theEObject;
				T result = caseKreuzungsgleis_TypeClass(kreuzungsgleis_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kreuzungsgleis_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.SCHUTZSCHIENE_TYPE_CLASS: {
				Schutzschiene_TypeClass schutzschiene_TypeClass = (Schutzschiene_TypeClass)theEObject;
				T result = caseSchutzschiene_TypeClass(schutzschiene_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schutzschiene_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.STAMMGLEIS_TYPE_CLASS: {
				Stammgleis_TypeClass stammgleis_TypeClass = (Stammgleis_TypeClass)theEObject;
				T result = caseStammgleis_TypeClass(stammgleis_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(stammgleis_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.VORZUGSLAGE_AUTOMATIK_TYPE_CLASS: {
				Vorzugslage_Automatik_TypeClass vorzugslage_Automatik_TypeClass = (Vorzugslage_Automatik_TypeClass)theEObject;
				T result = caseVorzugslage_Automatik_TypeClass(vorzugslage_Automatik_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(vorzugslage_Automatik_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE: {
				W_Kr_Anlage w_Kr_Anlage = (W_Kr_Anlage)theEObject;
				T result = caseW_Kr_Anlage(w_Kr_Anlage);
				if (result == null) result = caseBasis_Objekt(w_Kr_Anlage);
				if (result == null) result = caseUr_Objekt(w_Kr_Anlage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP: {
				W_Kr_Anlage_Allg_AttributeGroup w_Kr_Anlage_Allg_AttributeGroup = (W_Kr_Anlage_Allg_AttributeGroup)theEObject;
				T result = caseW_Kr_Anlage_Allg_AttributeGroup(w_Kr_Anlage_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WKR_ART_TYPE_CLASS: {
				W_Kr_Art_TypeClass w_Kr_Art_TypeClass = (W_Kr_Art_TypeClass)theEObject;
				T result = caseW_Kr_Art_TypeClass(w_Kr_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(w_Kr_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WKR_GRUNDFORM_TYPE_CLASS: {
				W_Kr_Grundform_TypeClass w_Kr_Grundform_TypeClass = (W_Kr_Grundform_TypeClass)theEObject;
				T result = caseW_Kr_Grundform_TypeClass(w_Kr_Grundform_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(w_Kr_Grundform_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT: {
				W_Kr_Gsp_Element w_Kr_Gsp_Element = (W_Kr_Gsp_Element)theEObject;
				T result = caseW_Kr_Gsp_Element(w_Kr_Gsp_Element);
				if (result == null) result = caseBasis_Objekt(w_Kr_Gsp_Element);
				if (result == null) result = caseUr_Objekt(w_Kr_Gsp_Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP: {
				W_Kr_Gsp_Element_Allg_AttributeGroup w_Kr_Gsp_Element_Allg_AttributeGroup = (W_Kr_Gsp_Element_Allg_AttributeGroup)theEObject;
				T result = caseW_Kr_Gsp_Element_Allg_AttributeGroup(w_Kr_Gsp_Element_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE: {
				W_Kr_Gsp_Komponente w_Kr_Gsp_Komponente = (W_Kr_Gsp_Komponente)theEObject;
				T result = caseW_Kr_Gsp_Komponente(w_Kr_Gsp_Komponente);
				if (result == null) result = casePunkt_Objekt(w_Kr_Gsp_Komponente);
				if (result == null) result = caseBasis_Objekt(w_Kr_Gsp_Komponente);
				if (result == null) result = caseUr_Objekt(w_Kr_Gsp_Komponente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WKR_GSP_STELLART_TYPE_CLASS: {
				W_Kr_Gsp_Stellart_TypeClass w_Kr_Gsp_Stellart_TypeClass = (W_Kr_Gsp_Stellart_TypeClass)theEObject;
				T result = caseW_Kr_Gsp_Stellart_TypeClass(w_Kr_Gsp_Stellart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(w_Kr_Gsp_Stellart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WEICHE_BETRIEBSART_TYPE_CLASS: {
				Weiche_Betriebsart_TypeClass weiche_Betriebsart_TypeClass = (Weiche_Betriebsart_TypeClass)theEObject;
				T result = caseWeiche_Betriebsart_TypeClass(weiche_Betriebsart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(weiche_Betriebsart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP: {
				Weiche_Element_AttributeGroup weiche_Element_AttributeGroup = (Weiche_Element_AttributeGroup)theEObject;
				T result = caseWeiche_Element_AttributeGroup(weiche_Element_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WEICHE_VORZUGSLAGE_TYPE_CLASS: {
				Weiche_Vorzugslage_TypeClass weiche_Vorzugslage_TypeClass = (Weiche_Vorzugslage_TypeClass)theEObject;
				T result = caseWeiche_Vorzugslage_TypeClass(weiche_Vorzugslage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(weiche_Vorzugslage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE: {
				Weichenlaufkette weichenlaufkette = (Weichenlaufkette)theEObject;
				T result = caseWeichenlaufkette(weichenlaufkette);
				if (result == null) result = caseBasis_Objekt(weichenlaufkette);
				if (result == null) result = caseUr_Objekt(weichenlaufkette);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG: {
				Weichenlaufkette_Zuordnung weichenlaufkette_Zuordnung = (Weichenlaufkette_Zuordnung)theEObject;
				T result = caseWeichenlaufkette_Zuordnung(weichenlaufkette_Zuordnung);
				if (result == null) result = caseBasis_Objekt(weichenlaufkette_Zuordnung);
				if (result == null) result = caseUr_Objekt(weichenlaufkette_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.WEICHENSIGNAL_TYPE_CLASS: {
				Weichensignal_TypeClass weichensignal_TypeClass = (Weichensignal_TypeClass)theEObject;
				T result = caseWeichensignal_TypeClass(weichensignal_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(weichensignal_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP: {
				Zungenpaar_AttributeGroup zungenpaar_AttributeGroup = (Zungenpaar_AttributeGroup)theEObject;
				T result = caseZungenpaar_AttributeGroup(zungenpaar_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Weichen_und_GleissperrenPackage.ZUNGENPRUEFKONTAKT_ANZAHL_TYPE_CLASS: {
				Zungenpruefkontakt_Anzahl_TypeClass zungenpruefkontakt_Anzahl_TypeClass = (Zungenpruefkontakt_Anzahl_TypeClass)theEObject;
				T result = caseZungenpruefkontakt_Anzahl_TypeClass(zungenpruefkontakt_Anzahl_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zungenpruefkontakt_Anzahl_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auffahrortung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auffahrortung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuffahrortung_TypeClass(Auffahrortung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Austausch Antriebe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Austausch Antriebe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAustausch_Antriebe_TypeClass(Austausch_Antriebe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auswurfrichtung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auswurfrichtung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuswurfrichtung_TypeClass(Auswurfrichtung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Besonderes Fahrwegelement Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Besonderes Fahrwegelement Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBesonderes_Fahrwegelement_TypeClass(Besonderes_Fahrwegelement_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elektrischer Antrieb Anzahl Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elektrischer Antrieb Anzahl Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElektrischer_Antrieb_Anzahl_TypeClass(Elektrischer_Antrieb_Anzahl_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elektrischer Antrieb Lage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elektrischer Antrieb Lage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElektrischer_Antrieb_Lage_TypeClass(Elektrischer_Antrieb_Lage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Lage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Lage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement_Lage_TypeClass(Element_Lage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entgleisungsschuh Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entgleisungsschuh Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntgleisungsschuh_AttributeGroup(Entgleisungsschuh_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geschwindigkeit LType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geschwindigkeit LType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeschwindigkeit_L_TypeClass(Geschwindigkeit_L_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geschwindigkeit RType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geschwindigkeit RType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeschwindigkeit_R_TypeClass(Geschwindigkeit_R_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleis Abschluss</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleis Abschluss</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleis_Abschluss(Gleis_Abschluss object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleis Abschluss Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleis Abschluss Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleis_Abschluss_Art_TypeClass(Gleis_Abschluss_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleissperre Betriebsart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleissperre Betriebsart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleissperre_Betriebsart_TypeClass(Gleissperre_Betriebsart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleissperre Element Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleissperre Element Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleissperre_Element_AttributeGroup(Gleissperre_Element_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleissperre Vorzugslage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleissperre Vorzugslage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleissperre_Vorzugslage_TypeClass(Gleissperre_Vorzugslage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleissperrensignal Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleissperrensignal Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleissperrensignal_TypeClass(Gleissperrensignal_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GZ Freimeldung LAttribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GZ Freimeldung LAttribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGZ_Freimeldung_L_AttributeGroup(GZ_Freimeldung_L_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GZ Freimeldung RAttribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GZ Freimeldung RAttribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGZ_Freimeldung_R_AttributeGroup(GZ_Freimeldung_R_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Herzstueck Antriebe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Herzstueck Antriebe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHerzstueck_Antriebe_TypeClass(Herzstueck_Antriebe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Isolierfall Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Isolierfall Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsolierfall_TypeClass(Isolierfall_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kr Kr WSeitenzuordnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kr Kr WSeitenzuordnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKr_KrW_Seitenzuordnung_TypeClass(Kr_KrW_Seitenzuordnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kreuzung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kreuzung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKreuzung_AttributeGroup(Kreuzung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kreuzungsgleis Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kreuzungsgleis Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKreuzungsgleis_TypeClass(Kreuzungsgleis_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schutzschiene Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schutzschiene Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchutzschiene_TypeClass(Schutzschiene_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stammgleis Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stammgleis Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStammgleis_TypeClass(Stammgleis_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vorzugslage Automatik Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vorzugslage Automatik Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVorzugslage_Automatik_TypeClass(Vorzugslage_Automatik_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WKr Anlage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WKr Anlage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW_Kr_Anlage(W_Kr_Anlage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WKr Anlage Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WKr Anlage Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW_Kr_Anlage_Allg_AttributeGroup(W_Kr_Anlage_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WKr Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WKr Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW_Kr_Art_TypeClass(W_Kr_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WKr Grundform Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WKr Grundform Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW_Kr_Grundform_TypeClass(W_Kr_Grundform_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WKr Gsp Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WKr Gsp Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW_Kr_Gsp_Element(W_Kr_Gsp_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WKr Gsp Element Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WKr Gsp Element Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW_Kr_Gsp_Element_Allg_AttributeGroup(W_Kr_Gsp_Element_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WKr Gsp Komponente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WKr Gsp Komponente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW_Kr_Gsp_Komponente(W_Kr_Gsp_Komponente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WKr Gsp Stellart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WKr Gsp Stellart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW_Kr_Gsp_Stellart_TypeClass(W_Kr_Gsp_Stellart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weiche Betriebsart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weiche Betriebsart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeiche_Betriebsart_TypeClass(Weiche_Betriebsart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weiche Element Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weiche Element Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeiche_Element_AttributeGroup(Weiche_Element_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weiche Vorzugslage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weiche Vorzugslage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeiche_Vorzugslage_TypeClass(Weiche_Vorzugslage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weichenlaufkette</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weichenlaufkette</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeichenlaufkette(Weichenlaufkette object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weichenlaufkette Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weichenlaufkette Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeichenlaufkette_Zuordnung(Weichenlaufkette_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weichensignal Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weichensignal Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeichensignal_TypeClass(Weichensignal_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zungenpaar Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zungenpaar Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZungenpaar_AttributeGroup(Zungenpaar_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zungenpruefkontakt Anzahl Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zungenpruefkontakt Anzahl Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZungenpruefkontakt_Anzahl_TypeClass(Zungenpruefkontakt_Anzahl_TypeClass object) {
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

} //Weichen_und_GleissperrenSwitch
