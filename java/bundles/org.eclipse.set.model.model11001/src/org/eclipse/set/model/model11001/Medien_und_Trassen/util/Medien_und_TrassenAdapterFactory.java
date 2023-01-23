/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Medien_und_Trassen.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.Medien_und_Trassen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Medien_und_TrassenPackage
 * @generated
 */
public class Medien_und_TrassenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Medien_und_TrassenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medien_und_TrassenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Medien_und_TrassenPackage.eINSTANCE;
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
	protected Medien_und_TrassenSwitch<Adapter> modelSwitch =
		new Medien_und_TrassenSwitch<Adapter>() {
			@Override
			public Adapter caseAder_Durchmesser_TypeClass(Ader_Durchmesser_TypeClass object) {
				return createAder_Durchmesser_TypeClassAdapter();
			}
			@Override
			public Adapter caseAder_Querschnitt_TypeClass(Ader_Querschnitt_TypeClass object) {
				return createAder_Querschnitt_TypeClassAdapter();
			}
			@Override
			public Adapter caseAder_Reserve_TypeClass(Ader_Reserve_TypeClass object) {
				return createAder_Reserve_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnzahl_Verseilelemente_TypeClass(Anzahl_Verseilelemente_TypeClass object) {
				return createAnzahl_Verseilelemente_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Kabel_TypeClass(Bezeichnung_Kabel_TypeClass object) {
				return createBezeichnung_Kabel_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Kabel_Verteilpunkt_TypeClass(Bezeichnung_Kabel_Verteilpunkt_TypeClass object) {
				return createBezeichnung_Kabel_Verteilpunkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseInduktionsschutz_TypeClass(Induktionsschutz_TypeClass object) {
				return createInduktionsschutz_TypeClassAdapter();
			}
			@Override
			public Adapter caseKabel(Kabel object) {
				return createKabelAdapter();
			}
			@Override
			public Adapter caseKabel_Allg_AttributeGroup(Kabel_Allg_AttributeGroup object) {
				return createKabel_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseKabel_Art_TypeClass(Kabel_Art_TypeClass object) {
				return createKabel_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseKabel_Bezeichnung_AttributeGroup(Kabel_Bezeichnung_AttributeGroup object) {
				return createKabel_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseKabel_Element_AttributeGroup(Kabel_Element_AttributeGroup object) {
				return createKabel_Element_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseKabel_Laenge_TypeClass(Kabel_Laenge_TypeClass object) {
				return createKabel_Laenge_TypeClassAdapter();
			}
			@Override
			public Adapter caseKabel_Typ_TypeClass(Kabel_Typ_TypeClass object) {
				return createKabel_Typ_TypeClassAdapter();
			}
			@Override
			public Adapter caseKabel_Verteilpunkt(Kabel_Verteilpunkt object) {
				return createKabel_VerteilpunktAdapter();
			}
			@Override
			public Adapter caseKabel_Verteilpunkt_Art_TypeClass(Kabel_Verteilpunkt_Art_TypeClass object) {
				return createKabel_Verteilpunkt_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseKabel_Verteilpunkt_Bezeichnung_AttributeGroup(Kabel_Verteilpunkt_Bezeichnung_AttributeGroup object) {
				return createKabel_Verteilpunkt_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseNagetierschutz_TypeClass(Nagetierschutz_TypeClass object) {
				return createNagetierschutz_TypeClassAdapter();
			}
			@Override
			public Adapter caseTrasse_Kante(Trasse_Kante object) {
				return createTrasse_KanteAdapter();
			}
			@Override
			public Adapter caseTrasse_Kante_Art_TypeClass(Trasse_Kante_Art_TypeClass object) {
				return createTrasse_Kante_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseTrasse_Knoten(Trasse_Knoten object) {
				return createTrasse_KnotenAdapter();
			}
			@Override
			public Adapter caseTrasse_Knoten_Art_TypeClass(Trasse_Knoten_Art_TypeClass object) {
				return createTrasse_Knoten_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseTrasse_Nutzer_TypeClass(Trasse_Nutzer_TypeClass object) {
				return createTrasse_Nutzer_TypeClassAdapter();
			}
			@Override
			public Adapter caseVerseilart_TypeClass(Verseilart_TypeClass object) {
				return createVerseilart_TypeClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Durchmesser_TypeClass <em>Ader Durchmesser Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Durchmesser_TypeClass
	 * @generated
	 */
	public Adapter createAder_Durchmesser_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Querschnitt_TypeClass <em>Ader Querschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Querschnitt_TypeClass
	 * @generated
	 */
	public Adapter createAder_Querschnitt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Reserve_TypeClass <em>Ader Reserve Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Reserve_TypeClass
	 * @generated
	 */
	public Adapter createAder_Reserve_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Anzahl_Verseilelemente_TypeClass <em>Anzahl Verseilelemente Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Anzahl_Verseilelemente_TypeClass
	 * @generated
	 */
	public Adapter createAnzahl_Verseilelemente_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_TypeClass <em>Bezeichnung Kabel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Kabel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_Verteilpunkt_TypeClass <em>Bezeichnung Kabel Verteilpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_Verteilpunkt_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Kabel_Verteilpunkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Induktionsschutz_TypeClass <em>Induktionsschutz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Induktionsschutz_TypeClass
	 * @generated
	 */
	public Adapter createInduktionsschutz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel <em>Kabel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel
	 * @generated
	 */
	public Adapter createKabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup <em>Kabel Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createKabel_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Art_TypeClass <em>Kabel Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Art_TypeClass
	 * @generated
	 */
	public Adapter createKabel_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Bezeichnung_AttributeGroup <em>Kabel Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createKabel_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup <em>Kabel Element Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup
	 * @generated
	 */
	public Adapter createKabel_Element_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Laenge_TypeClass <em>Kabel Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Laenge_TypeClass
	 * @generated
	 */
	public Adapter createKabel_Laenge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Typ_TypeClass <em>Kabel Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Typ_TypeClass
	 * @generated
	 */
	public Adapter createKabel_Typ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt <em>Kabel Verteilpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt
	 * @generated
	 */
	public Adapter createKabel_VerteilpunktAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Art_TypeClass <em>Kabel Verteilpunkt Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Art_TypeClass
	 * @generated
	 */
	public Adapter createKabel_Verteilpunkt_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Bezeichnung_AttributeGroup <em>Kabel Verteilpunkt Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createKabel_Verteilpunkt_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Nagetierschutz_TypeClass <em>Nagetierschutz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Nagetierschutz_TypeClass
	 * @generated
	 */
	public Adapter createNagetierschutz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante <em>Trasse Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante
	 * @generated
	 */
	public Adapter createTrasse_KanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante_Art_TypeClass <em>Trasse Kante Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante_Art_TypeClass
	 * @generated
	 */
	public Adapter createTrasse_Kante_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten <em>Trasse Knoten</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten
	 * @generated
	 */
	public Adapter createTrasse_KnotenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten_Art_TypeClass <em>Trasse Knoten Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten_Art_TypeClass
	 * @generated
	 */
	public Adapter createTrasse_Knoten_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Nutzer_TypeClass <em>Trasse Nutzer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Nutzer_TypeClass
	 * @generated
	 */
	public Adapter createTrasse_Nutzer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Verseilart_TypeClass <em>Verseilart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Verseilart_TypeClass
	 * @generated
	 */
	public Adapter createVerseilart_TypeClassAdapter() {
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

} //Medien_und_TrassenAdapterFactory
