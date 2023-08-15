/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Gleis.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.Gleis.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Gleis.GleisPackage
 * @generated
 */
public class GleisAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GleisPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GleisAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GleisPackage.eINSTANCE;
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
	protected GleisSwitch<Adapter> modelSwitch =
		new GleisSwitch<Adapter>() {
			@Override
			public Adapter caseBaubereich_Art_TypeClass(Baubereich_Art_TypeClass object) {
				return createBaubereich_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseBez_Gleis_Bezeichnung_TypeClass(Bez_Gleis_Bezeichnung_TypeClass object) {
				return createBez_Gleis_Bezeichnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseFahrstrom_TypeClass(Fahrstrom_TypeClass object) {
				return createFahrstrom_TypeClassAdapter();
			}
			@Override
			public Adapter caseGeschwindigkeit_TypeClass(Geschwindigkeit_TypeClass object) {
				return createGeschwindigkeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseGleis_Abschnitt(Gleis_Abschnitt object) {
				return createGleis_AbschnittAdapter();
			}
			@Override
			public Adapter caseGleis_Art(Gleis_Art object) {
				return createGleis_ArtAdapter();
			}
			@Override
			public Adapter caseGleis_Baubereich(Gleis_Baubereich object) {
				return createGleis_BaubereichAdapter();
			}
			@Override
			public Adapter caseGleis_Bezeichnung(Gleis_Bezeichnung object) {
				return createGleis_BezeichnungAdapter();
			}
			@Override
			public Adapter caseGleis_Bezeichnung_Bezeichnung_AttributeGroup(Gleis_Bezeichnung_Bezeichnung_AttributeGroup object) {
				return createGleis_Bezeichnung_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseGleis_Fahrbahn(Gleis_Fahrbahn object) {
				return createGleis_FahrbahnAdapter();
			}
			@Override
			public Adapter caseGleis_Lichtraum(Gleis_Lichtraum object) {
				return createGleis_LichtraumAdapter();
			}
			@Override
			public Adapter caseGleis_Schaltgruppe(Gleis_Schaltgruppe object) {
				return createGleis_SchaltgruppeAdapter();
			}
			@Override
			public Adapter caseGleisart_TypeClass(Gleisart_TypeClass object) {
				return createGleisart_TypeClassAdapter();
			}
			@Override
			public Adapter caseKonstruktion_TypeClass(Konstruktion_TypeClass object) {
				return createKonstruktion_TypeClassAdapter();
			}
			@Override
			public Adapter caseLichtraumprofil_TypeClass(Lichtraumprofil_TypeClass object) {
				return createLichtraumprofil_TypeClassAdapter();
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
			public Adapter caseBereich_Objekt(Bereich_Objekt object) {
				return createBereich_ObjektAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Baubereich_Art_TypeClass <em>Baubereich Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Baubereich_Art_TypeClass
	 * @generated
	 */
	public Adapter createBaubereich_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Bez_Gleis_Bezeichnung_TypeClass <em>Bez Gleis Bezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Bez_Gleis_Bezeichnung_TypeClass
	 * @generated
	 */
	public Adapter createBez_Gleis_Bezeichnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Fahrstrom_TypeClass <em>Fahrstrom Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Fahrstrom_TypeClass
	 * @generated
	 */
	public Adapter createFahrstrom_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Geschwindigkeit_TypeClass <em>Geschwindigkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Geschwindigkeit_TypeClass
	 * @generated
	 */
	public Adapter createGeschwindigkeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Gleis_Abschnitt <em>Gleis Abschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Gleis_Abschnitt
	 * @generated
	 */
	public Adapter createGleis_AbschnittAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Gleis_Art <em>Gleis Art</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Gleis_Art
	 * @generated
	 */
	public Adapter createGleis_ArtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Gleis_Baubereich <em>Gleis Baubereich</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Gleis_Baubereich
	 * @generated
	 */
	public Adapter createGleis_BaubereichAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Gleis_Bezeichnung <em>Gleis Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Gleis_Bezeichnung
	 * @generated
	 */
	public Adapter createGleis_BezeichnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Gleis_Bezeichnung_Bezeichnung_AttributeGroup <em>Gleis Bezeichnung Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Gleis_Bezeichnung_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createGleis_Bezeichnung_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Gleis_Fahrbahn <em>Gleis Fahrbahn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Gleis_Fahrbahn
	 * @generated
	 */
	public Adapter createGleis_FahrbahnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Gleis_Lichtraum <em>Gleis Lichtraum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Gleis_Lichtraum
	 * @generated
	 */
	public Adapter createGleis_LichtraumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Gleis_Schaltgruppe <em>Gleis Schaltgruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Gleis_Schaltgruppe
	 * @generated
	 */
	public Adapter createGleis_SchaltgruppeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Gleisart_TypeClass <em>Gleisart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Gleisart_TypeClass
	 * @generated
	 */
	public Adapter createGleisart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Konstruktion_TypeClass <em>Konstruktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Konstruktion_TypeClass
	 * @generated
	 */
	public Adapter createKonstruktion_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Gleis.Lichtraumprofil_TypeClass <em>Lichtraumprofil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Gleis.Lichtraumprofil_TypeClass
	 * @generated
	 */
	public Adapter createLichtraumprofil_TypeClassAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Basisobjekte.Bereich_Objekt <em>Bereich Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Basisobjekte.Bereich_Objekt
	 * @generated
	 */
	public Adapter createBereich_ObjektAdapter() {
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

} //GleisAdapterFactory
