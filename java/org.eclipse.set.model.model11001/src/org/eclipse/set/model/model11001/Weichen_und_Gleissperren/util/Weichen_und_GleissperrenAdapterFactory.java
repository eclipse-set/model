/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Weichen_und_Gleissperren.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage
 * @generated
 */
public class Weichen_und_GleissperrenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Weichen_und_GleissperrenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weichen_und_GleissperrenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Weichen_und_GleissperrenPackage.eINSTANCE;
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
	protected Weichen_und_GleissperrenSwitch<Adapter> modelSwitch =
		new Weichen_und_GleissperrenSwitch<Adapter>() {
			@Override
			public Adapter caseAuffahrortung_TypeClass(Auffahrortung_TypeClass object) {
				return createAuffahrortung_TypeClassAdapter();
			}
			@Override
			public Adapter caseAustausch_Antriebe_TypeClass(Austausch_Antriebe_TypeClass object) {
				return createAustausch_Antriebe_TypeClassAdapter();
			}
			@Override
			public Adapter caseAuswurfrichtung_TypeClass(Auswurfrichtung_TypeClass object) {
				return createAuswurfrichtung_TypeClassAdapter();
			}
			@Override
			public Adapter caseBesonderes_Fahrwegelement_TypeClass(Besonderes_Fahrwegelement_TypeClass object) {
				return createBesonderes_Fahrwegelement_TypeClassAdapter();
			}
			@Override
			public Adapter caseElektrischer_Antrieb_Anzahl_TypeClass(Elektrischer_Antrieb_Anzahl_TypeClass object) {
				return createElektrischer_Antrieb_Anzahl_TypeClassAdapter();
			}
			@Override
			public Adapter caseElektrischer_Antrieb_Lage_TypeClass(Elektrischer_Antrieb_Lage_TypeClass object) {
				return createElektrischer_Antrieb_Lage_TypeClassAdapter();
			}
			@Override
			public Adapter caseElement_Lage_TypeClass(Element_Lage_TypeClass object) {
				return createElement_Lage_TypeClassAdapter();
			}
			@Override
			public Adapter caseEntgleisungsschuh_AttributeGroup(Entgleisungsschuh_AttributeGroup object) {
				return createEntgleisungsschuh_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseGeschwindigkeit_L_TypeClass(Geschwindigkeit_L_TypeClass object) {
				return createGeschwindigkeit_L_TypeClassAdapter();
			}
			@Override
			public Adapter caseGeschwindigkeit_R_TypeClass(Geschwindigkeit_R_TypeClass object) {
				return createGeschwindigkeit_R_TypeClassAdapter();
			}
			@Override
			public Adapter caseGleis_Abschluss(Gleis_Abschluss object) {
				return createGleis_AbschlussAdapter();
			}
			@Override
			public Adapter caseGleis_Abschluss_Art_TypeClass(Gleis_Abschluss_Art_TypeClass object) {
				return createGleis_Abschluss_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseGleissperre_Betriebsart_TypeClass(Gleissperre_Betriebsart_TypeClass object) {
				return createGleissperre_Betriebsart_TypeClassAdapter();
			}
			@Override
			public Adapter caseGleissperre_Element_AttributeGroup(Gleissperre_Element_AttributeGroup object) {
				return createGleissperre_Element_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseGleissperre_Vorzugslage_TypeClass(Gleissperre_Vorzugslage_TypeClass object) {
				return createGleissperre_Vorzugslage_TypeClassAdapter();
			}
			@Override
			public Adapter caseGleissperrensignal_TypeClass(Gleissperrensignal_TypeClass object) {
				return createGleissperrensignal_TypeClassAdapter();
			}
			@Override
			public Adapter caseGZ_Freimeldung_L_AttributeGroup(GZ_Freimeldung_L_AttributeGroup object) {
				return createGZ_Freimeldung_L_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseGZ_Freimeldung_R_AttributeGroup(GZ_Freimeldung_R_AttributeGroup object) {
				return createGZ_Freimeldung_R_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseHerzstueck_Antriebe_TypeClass(Herzstueck_Antriebe_TypeClass object) {
				return createHerzstueck_Antriebe_TypeClassAdapter();
			}
			@Override
			public Adapter caseIsolierfall_TypeClass(Isolierfall_TypeClass object) {
				return createIsolierfall_TypeClassAdapter();
			}
			@Override
			public Adapter caseKr_KrW_Seitenzuordnung_TypeClass(Kr_KrW_Seitenzuordnung_TypeClass object) {
				return createKr_KrW_Seitenzuordnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseKreuzung_AttributeGroup(Kreuzung_AttributeGroup object) {
				return createKreuzung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseKreuzungsgleis_TypeClass(Kreuzungsgleis_TypeClass object) {
				return createKreuzungsgleis_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchutzschiene_TypeClass(Schutzschiene_TypeClass object) {
				return createSchutzschiene_TypeClassAdapter();
			}
			@Override
			public Adapter caseStammgleis_TypeClass(Stammgleis_TypeClass object) {
				return createStammgleis_TypeClassAdapter();
			}
			@Override
			public Adapter caseVorzugslage_Automatik_TypeClass(Vorzugslage_Automatik_TypeClass object) {
				return createVorzugslage_Automatik_TypeClassAdapter();
			}
			@Override
			public Adapter caseW_Kr_Anlage(W_Kr_Anlage object) {
				return createW_Kr_AnlageAdapter();
			}
			@Override
			public Adapter caseW_Kr_Anlage_Allg_AttributeGroup(W_Kr_Anlage_Allg_AttributeGroup object) {
				return createW_Kr_Anlage_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseW_Kr_Art_TypeClass(W_Kr_Art_TypeClass object) {
				return createW_Kr_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseW_Kr_Grundform_TypeClass(W_Kr_Grundform_TypeClass object) {
				return createW_Kr_Grundform_TypeClassAdapter();
			}
			@Override
			public Adapter caseW_Kr_Gsp_Element(W_Kr_Gsp_Element object) {
				return createW_Kr_Gsp_ElementAdapter();
			}
			@Override
			public Adapter caseW_Kr_Gsp_Element_Allg_AttributeGroup(W_Kr_Gsp_Element_Allg_AttributeGroup object) {
				return createW_Kr_Gsp_Element_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseW_Kr_Gsp_Komponente(W_Kr_Gsp_Komponente object) {
				return createW_Kr_Gsp_KomponenteAdapter();
			}
			@Override
			public Adapter caseW_Kr_Gsp_Stellart_TypeClass(W_Kr_Gsp_Stellart_TypeClass object) {
				return createW_Kr_Gsp_Stellart_TypeClassAdapter();
			}
			@Override
			public Adapter caseWeiche_Betriebsart_TypeClass(Weiche_Betriebsart_TypeClass object) {
				return createWeiche_Betriebsart_TypeClassAdapter();
			}
			@Override
			public Adapter caseWeiche_Element_AttributeGroup(Weiche_Element_AttributeGroup object) {
				return createWeiche_Element_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseWeiche_Vorzugslage_TypeClass(Weiche_Vorzugslage_TypeClass object) {
				return createWeiche_Vorzugslage_TypeClassAdapter();
			}
			@Override
			public Adapter caseWeichenlaufkette(Weichenlaufkette object) {
				return createWeichenlaufketteAdapter();
			}
			@Override
			public Adapter caseWeichenlaufkette_Zuordnung(Weichenlaufkette_Zuordnung object) {
				return createWeichenlaufkette_ZuordnungAdapter();
			}
			@Override
			public Adapter caseWeichensignal_TypeClass(Weichensignal_TypeClass object) {
				return createWeichensignal_TypeClassAdapter();
			}
			@Override
			public Adapter caseZungenpaar_AttributeGroup(Zungenpaar_AttributeGroup object) {
				return createZungenpaar_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZungenpruefkontakt_Anzahl_TypeClass(Zungenpruefkontakt_Anzahl_TypeClass object) {
				return createZungenpruefkontakt_Anzahl_TypeClassAdapter();
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
			public Adapter casePunkt_Objekt(Punkt_Objekt object) {
				return createPunkt_ObjektAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Auffahrortung_TypeClass <em>Auffahrortung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Auffahrortung_TypeClass
	 * @generated
	 */
	public Adapter createAuffahrortung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Austausch_Antriebe_TypeClass <em>Austausch Antriebe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Austausch_Antriebe_TypeClass
	 * @generated
	 */
	public Adapter createAustausch_Antriebe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Auswurfrichtung_TypeClass <em>Auswurfrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Auswurfrichtung_TypeClass
	 * @generated
	 */
	public Adapter createAuswurfrichtung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Besonderes_Fahrwegelement_TypeClass <em>Besonderes Fahrwegelement Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Besonderes_Fahrwegelement_TypeClass
	 * @generated
	 */
	public Adapter createBesonderes_Fahrwegelement_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Elektrischer_Antrieb_Anzahl_TypeClass <em>Elektrischer Antrieb Anzahl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Elektrischer_Antrieb_Anzahl_TypeClass
	 * @generated
	 */
	public Adapter createElektrischer_Antrieb_Anzahl_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Elektrischer_Antrieb_Lage_TypeClass <em>Elektrischer Antrieb Lage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Elektrischer_Antrieb_Lage_TypeClass
	 * @generated
	 */
	public Adapter createElektrischer_Antrieb_Lage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Element_Lage_TypeClass <em>Element Lage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Element_Lage_TypeClass
	 * @generated
	 */
	public Adapter createElement_Lage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup <em>Entgleisungsschuh Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup
	 * @generated
	 */
	public Adapter createEntgleisungsschuh_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Geschwindigkeit_L_TypeClass <em>Geschwindigkeit LType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Geschwindigkeit_L_TypeClass
	 * @generated
	 */
	public Adapter createGeschwindigkeit_L_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Geschwindigkeit_R_TypeClass <em>Geschwindigkeit RType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Geschwindigkeit_R_TypeClass
	 * @generated
	 */
	public Adapter createGeschwindigkeit_R_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss <em>Gleis Abschluss</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss
	 * @generated
	 */
	public Adapter createGleis_AbschlussAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss_Art_TypeClass <em>Gleis Abschluss Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss_Art_TypeClass
	 * @generated
	 */
	public Adapter createGleis_Abschluss_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Betriebsart_TypeClass <em>Gleissperre Betriebsart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Betriebsart_TypeClass
	 * @generated
	 */
	public Adapter createGleissperre_Betriebsart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup <em>Gleissperre Element Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup
	 * @generated
	 */
	public Adapter createGleissperre_Element_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Vorzugslage_TypeClass <em>Gleissperre Vorzugslage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Vorzugslage_TypeClass
	 * @generated
	 */
	public Adapter createGleissperre_Vorzugslage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperrensignal_TypeClass <em>Gleissperrensignal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperrensignal_TypeClass
	 * @generated
	 */
	public Adapter createGleissperrensignal_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_L_AttributeGroup <em>GZ Freimeldung LAttribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_L_AttributeGroup
	 * @generated
	 */
	public Adapter createGZ_Freimeldung_L_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup <em>GZ Freimeldung RAttribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup
	 * @generated
	 */
	public Adapter createGZ_Freimeldung_R_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Herzstueck_Antriebe_TypeClass <em>Herzstueck Antriebe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Herzstueck_Antriebe_TypeClass
	 * @generated
	 */
	public Adapter createHerzstueck_Antriebe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Isolierfall_TypeClass <em>Isolierfall Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Isolierfall_TypeClass
	 * @generated
	 */
	public Adapter createIsolierfall_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kr_KrW_Seitenzuordnung_TypeClass <em>Kr Kr WSeitenzuordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kr_KrW_Seitenzuordnung_TypeClass
	 * @generated
	 */
	public Adapter createKr_KrW_Seitenzuordnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup <em>Kreuzung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup
	 * @generated
	 */
	public Adapter createKreuzung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzungsgleis_TypeClass <em>Kreuzungsgleis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzungsgleis_TypeClass
	 * @generated
	 */
	public Adapter createKreuzungsgleis_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Schutzschiene_TypeClass <em>Schutzschiene Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Schutzschiene_TypeClass
	 * @generated
	 */
	public Adapter createSchutzschiene_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Stammgleis_TypeClass <em>Stammgleis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Stammgleis_TypeClass
	 * @generated
	 */
	public Adapter createStammgleis_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Vorzugslage_Automatik_TypeClass <em>Vorzugslage Automatik Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Vorzugslage_Automatik_TypeClass
	 * @generated
	 */
	public Adapter createVorzugslage_Automatik_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage <em>WKr Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage
	 * @generated
	 */
	public Adapter createW_Kr_AnlageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup <em>WKr Anlage Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createW_Kr_Anlage_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Art_TypeClass <em>WKr Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Art_TypeClass
	 * @generated
	 */
	public Adapter createW_Kr_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Grundform_TypeClass <em>WKr Grundform Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Grundform_TypeClass
	 * @generated
	 */
	public Adapter createW_Kr_Grundform_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element <em>WKr Gsp Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element
	 * @generated
	 */
	public Adapter createW_Kr_Gsp_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup <em>WKr Gsp Element Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createW_Kr_Gsp_Element_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente <em>WKr Gsp Komponente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente
	 * @generated
	 */
	public Adapter createW_Kr_Gsp_KomponenteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Stellart_TypeClass <em>WKr Gsp Stellart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Stellart_TypeClass
	 * @generated
	 */
	public Adapter createW_Kr_Gsp_Stellart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Betriebsart_TypeClass <em>Weiche Betriebsart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Betriebsart_TypeClass
	 * @generated
	 */
	public Adapter createWeiche_Betriebsart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup <em>Weiche Element Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup
	 * @generated
	 */
	public Adapter createWeiche_Element_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Vorzugslage_TypeClass <em>Weiche Vorzugslage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Vorzugslage_TypeClass
	 * @generated
	 */
	public Adapter createWeiche_Vorzugslage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette <em>Weichenlaufkette</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette
	 * @generated
	 */
	public Adapter createWeichenlaufketteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung <em>Weichenlaufkette Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung
	 * @generated
	 */
	public Adapter createWeichenlaufkette_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichensignal_TypeClass <em>Weichensignal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichensignal_TypeClass
	 * @generated
	 */
	public Adapter createWeichensignal_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup <em>Zungenpaar Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup
	 * @generated
	 */
	public Adapter createZungenpaar_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpruefkontakt_Anzahl_TypeClass <em>Zungenpruefkontakt Anzahl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpruefkontakt_Anzahl_TypeClass
	 * @generated
	 */
	public Adapter createZungenpruefkontakt_Anzahl_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup <em>Basis Attribut Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup
	 * @generated
	 */
	public Adapter createBasisAttribut_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt <em>Ur Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt
	 * @generated
	 */
	public Adapter createUr_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt <em>Basis Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt
	 * @generated
	 */
	public Adapter createBasis_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt <em>Punkt Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt
	 * @generated
	 */
	public Adapter createPunkt_ObjektAdapter() {
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

} //Weichen_und_GleissperrenAdapterFactory
