/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ortung.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model1902.Ortung.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage
 * @generated
 */
public class OrtungAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrtungPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrtungAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OrtungPackage.eINSTANCE;
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
	protected OrtungSwitch<Adapter> modelSwitch =
		new OrtungSwitch<Adapter>() {
			@Override
			public Adapter caseBettungswiderstand_TypeClass(Bettungswiderstand_TypeClass object) {
				return createBettungswiderstand_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Kennbuchstabe_TypeClass(Bezeichnung_Kennbuchstabe_TypeClass object) {
				return createBezeichnung_Kennbuchstabe_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Anlage(FMA_Anlage object) {
				return createFMA_AnlageAdapter();
			}
			@Override
			public Adapter caseFMA_Anlage_Allg_AttributeGroup(FMA_Anlage_Allg_AttributeGroup object) {
				return createFMA_Anlage_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFMA_Anlage_Bezeichnung_AttributeGroup(FMA_Anlage_Bezeichnung_AttributeGroup object) {
				return createFMA_Anlage_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFMA_Anlage_Elektr_Merkmale_AttributeGroup(FMA_Anlage_Elektr_Merkmale_AttributeGroup object) {
				return createFMA_Anlage_Elektr_Merkmale_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFMA_Anlage_Kaskade_AttributeGroup(FMA_Anlage_Kaskade_AttributeGroup object) {
				return createFMA_Anlage_Kaskade_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFMA_Anlage_Uebertragung_FMinfo_AttributeGroup(FMA_Anlage_Uebertragung_FMinfo_AttributeGroup object) {
				return createFMA_Anlage_Uebertragung_FMinfo_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFMA_Anschluss_Bezeichnung_TypeClass(FMA_Anschluss_Bezeichnung_TypeClass object) {
				return createFMA_Anschluss_Bezeichnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Anschluss_Speiserichtung_TypeClass(FMA_Anschluss_Speiserichtung_TypeClass object) {
				return createFMA_Anschluss_Speiserichtung_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Art_TypeClass(FMA_Art_TypeClass object) {
				return createFMA_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Element(FMA_Element object) {
				return createFMA_ElementAdapter();
			}
			@Override
			public Adapter caseFMA_Element_Allg_AttributeGroup(FMA_Element_Allg_AttributeGroup object) {
				return createFMA_Element_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFMA_Element_Anschluss_AttributeGroup(FMA_Element_Anschluss_AttributeGroup object) {
				return createFMA_Element_Anschluss_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFMA_Element_Art_TypeClass(FMA_Element_Art_TypeClass object) {
				return createFMA_Element_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Element_Seilanzahl_TypeClass(FMA_Element_Seilanzahl_TypeClass object) {
				return createFMA_Element_Seilanzahl_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Element_Seiltyp_TypeClass(FMA_Element_Seiltyp_TypeClass object) {
				return createFMA_Element_Seiltyp_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Hilffreimeldung_TypeClass(FMA_Hilffreimeldung_TypeClass object) {
				return createFMA_Hilffreimeldung_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Isolierung_TypeClass(FMA_Isolierung_TypeClass object) {
				return createFMA_Isolierung_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Kaskade_Bezeichnung_TypeClass(FMA_Kaskade_Bezeichnung_TypeClass object) {
				return createFMA_Kaskade_Bezeichnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Kaskade_Einzelauswertung_TypeClass(FMA_Kaskade_Einzelauswertung_TypeClass object) {
				return createFMA_Kaskade_Einzelauswertung_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Komponente(FMA_Komponente object) {
				return createFMA_KomponenteAdapter();
			}
			@Override
			public Adapter caseFMA_Komponente_Achszaehlpunkt_AttributeGroup(FMA_Komponente_Achszaehlpunkt_AttributeGroup object) {
				return createFMA_Komponente_Achszaehlpunkt_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFMA_Komponente_Art_TypeClass(FMA_Komponente_Art_TypeClass object) {
				return createFMA_Komponente_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Komponente_Schienenprofil_TypeClass(FMA_Komponente_Schienenprofil_TypeClass object) {
				return createFMA_Komponente_Schienenprofil_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Komponente_Stromversorgung_TypeClass(FMA_Komponente_Stromversorgung_TypeClass object) {
				return createFMA_Komponente_Stromversorgung_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Komponente_Typ_TypeClass(FMA_Komponente_Typ_TypeClass object) {
				return createFMA_Komponente_Typ_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Laenge_Beeinflusst_TypeClass(FMA_Laenge_Beeinflusst_TypeClass object) {
				return createFMA_Laenge_Beeinflusst_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Laenge_E1_TypeClass(FMA_Laenge_E1_TypeClass object) {
				return createFMA_Laenge_E1_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Laenge_E2_TypeClass(FMA_Laenge_E2_TypeClass object) {
				return createFMA_Laenge_E2_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Laenge_E3_TypeClass(FMA_Laenge_E3_TypeClass object) {
				return createFMA_Laenge_E3_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Laenge_S_TypeClass(FMA_Laenge_S_TypeClass object) {
				return createFMA_Laenge_S_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Laenge_TypeClass(FMA_Laenge_TypeClass object) {
				return createFMA_Laenge_TypeClassAdapter();
			}
			@Override
			public Adapter caseFMA_Typ_TypeClass(FMA_Typ_TypeClass object) {
				return createFMA_Typ_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchaltmittel_Funktion_TypeClass(Schaltmittel_Funktion_TypeClass object) {
				return createSchaltmittel_Funktion_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchaltmittel_Zuordnung(Schaltmittel_Zuordnung object) {
				return createSchaltmittel_ZuordnungAdapter();
			}
			@Override
			public Adapter caseUebertragung_FMinfo_Richtung_TypeClass(Uebertragung_FMinfo_Richtung_TypeClass object) {
				return createUebertragung_FMinfo_Richtung_TypeClassAdapter();
			}
			@Override
			public Adapter caseUebertragung_FMinfo_Typ_TypeClass(Uebertragung_FMinfo_Typ_TypeClass object) {
				return createUebertragung_FMinfo_Typ_TypeClassAdapter();
			}
			@Override
			public Adapter caseZugeinwirkung(Zugeinwirkung object) {
				return createZugeinwirkungAdapter();
			}
			@Override
			public Adapter caseZugeinwirkung_Allg_AttributeGroup(Zugeinwirkung_Allg_AttributeGroup object) {
				return createZugeinwirkung_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZugeinwirkung_Art_TypeClass(Zugeinwirkung_Art_TypeClass object) {
				return createZugeinwirkung_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseZugeinwirkung_Typ_TypeClass(Zugeinwirkung_Typ_TypeClass object) {
				return createZugeinwirkung_Typ_TypeClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.Bettungswiderstand_TypeClass <em>Bettungswiderstand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.Bettungswiderstand_TypeClass
	 * @generated
	 */
	public Adapter createBettungswiderstand_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.Bezeichnung_Kennbuchstabe_TypeClass <em>Bezeichnung Kennbuchstabe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.Bezeichnung_Kennbuchstabe_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Kennbuchstabe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage <em>FMA Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Anlage
	 * @generated
	 */
	public Adapter createFMA_AnlageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Allg_AttributeGroup <em>FMA Anlage Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createFMA_Anlage_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Bezeichnung_AttributeGroup <em>FMA Anlage Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createFMA_Anlage_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup <em>FMA Anlage Elektr Merkmale Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup
	 * @generated
	 */
	public Adapter createFMA_Anlage_Elektr_Merkmale_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Kaskade_AttributeGroup <em>FMA Anlage Kaskade Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Kaskade_AttributeGroup
	 * @generated
	 */
	public Adapter createFMA_Anlage_Kaskade_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup <em>FMA Anlage Uebertragung FMinfo Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup
	 * @generated
	 */
	public Adapter createFMA_Anlage_Uebertragung_FMinfo_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anschluss_Bezeichnung_TypeClass <em>FMA Anschluss Bezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Anschluss_Bezeichnung_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Anschluss_Bezeichnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anschluss_Speiserichtung_TypeClass <em>FMA Anschluss Speiserichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Anschluss_Speiserichtung_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Anschluss_Speiserichtung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Art_TypeClass <em>FMA Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Art_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Element <em>FMA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Element
	 * @generated
	 */
	public Adapter createFMA_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Element_Allg_AttributeGroup <em>FMA Element Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Element_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createFMA_Element_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Element_Anschluss_AttributeGroup <em>FMA Element Anschluss Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Element_Anschluss_AttributeGroup
	 * @generated
	 */
	public Adapter createFMA_Element_Anschluss_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Element_Art_TypeClass <em>FMA Element Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Element_Art_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Element_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Element_Seilanzahl_TypeClass <em>FMA Element Seilanzahl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Element_Seilanzahl_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Element_Seilanzahl_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Element_Seiltyp_TypeClass <em>FMA Element Seiltyp Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Element_Seiltyp_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Element_Seiltyp_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Hilffreimeldung_TypeClass <em>FMA Hilffreimeldung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Hilffreimeldung_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Hilffreimeldung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Isolierung_TypeClass <em>FMA Isolierung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Isolierung_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Isolierung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Kaskade_Bezeichnung_TypeClass <em>FMA Kaskade Bezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Kaskade_Bezeichnung_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Kaskade_Bezeichnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Kaskade_Einzelauswertung_TypeClass <em>FMA Kaskade Einzelauswertung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Kaskade_Einzelauswertung_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Kaskade_Einzelauswertung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Komponente <em>FMA Komponente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Komponente
	 * @generated
	 */
	public Adapter createFMA_KomponenteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup <em>FMA Komponente Achszaehlpunkt Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup
	 * @generated
	 */
	public Adapter createFMA_Komponente_Achszaehlpunkt_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Komponente_Art_TypeClass <em>FMA Komponente Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Komponente_Art_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Komponente_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Komponente_Schienenprofil_TypeClass <em>FMA Komponente Schienenprofil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Komponente_Schienenprofil_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Komponente_Schienenprofil_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Komponente_Stromversorgung_TypeClass <em>FMA Komponente Stromversorgung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Komponente_Stromversorgung_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Komponente_Stromversorgung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Komponente_Typ_TypeClass <em>FMA Komponente Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Komponente_Typ_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Komponente_Typ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Laenge_Beeinflusst_TypeClass <em>FMA Laenge Beeinflusst Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Laenge_Beeinflusst_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Laenge_Beeinflusst_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Laenge_E1_TypeClass <em>FMA Laenge E1 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Laenge_E1_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Laenge_E1_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Laenge_E2_TypeClass <em>FMA Laenge E2 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Laenge_E2_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Laenge_E2_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Laenge_E3_TypeClass <em>FMA Laenge E3 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Laenge_E3_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Laenge_E3_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Laenge_S_TypeClass <em>FMA Laenge SType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Laenge_S_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Laenge_S_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Laenge_TypeClass <em>FMA Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Laenge_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Laenge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.FMA_Typ_TypeClass <em>FMA Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.FMA_Typ_TypeClass
	 * @generated
	 */
	public Adapter createFMA_Typ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.Schaltmittel_Funktion_TypeClass <em>Schaltmittel Funktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.Schaltmittel_Funktion_TypeClass
	 * @generated
	 */
	public Adapter createSchaltmittel_Funktion_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.Schaltmittel_Zuordnung <em>Schaltmittel Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.Schaltmittel_Zuordnung
	 * @generated
	 */
	public Adapter createSchaltmittel_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.Uebertragung_FMinfo_Richtung_TypeClass <em>Uebertragung FMinfo Richtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.Uebertragung_FMinfo_Richtung_TypeClass
	 * @generated
	 */
	public Adapter createUebertragung_FMinfo_Richtung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.Uebertragung_FMinfo_Typ_TypeClass <em>Uebertragung FMinfo Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.Uebertragung_FMinfo_Typ_TypeClass
	 * @generated
	 */
	public Adapter createUebertragung_FMinfo_Typ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.Zugeinwirkung <em>Zugeinwirkung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.Zugeinwirkung
	 * @generated
	 */
	public Adapter createZugeinwirkungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.Zugeinwirkung_Allg_AttributeGroup <em>Zugeinwirkung Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.Zugeinwirkung_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createZugeinwirkung_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.Zugeinwirkung_Art_TypeClass <em>Zugeinwirkung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.Zugeinwirkung_Art_TypeClass
	 * @generated
	 */
	public Adapter createZugeinwirkung_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Ortung.Zugeinwirkung_Typ_TypeClass <em>Zugeinwirkung Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Ortung.Zugeinwirkung_Typ_TypeClass
	 * @generated
	 */
	public Adapter createZugeinwirkung_Typ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup <em>Basis Attribut Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup
	 * @generated
	 */
	public Adapter createBasisAttribut_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt <em>Ur Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt
	 * @generated
	 */
	public Adapter createUr_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt <em>Basis Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt
	 * @generated
	 */
	public Adapter createBasis_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt <em>Punkt Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt
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

} //OrtungAdapterFactory
