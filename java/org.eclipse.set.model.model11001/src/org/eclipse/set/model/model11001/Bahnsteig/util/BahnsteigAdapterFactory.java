/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnsteig.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Bahnsteig.*;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Bahnsteig.BahnsteigPackage
 * @generated
 */
public class BahnsteigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BahnsteigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BahnsteigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BahnsteigPackage.eINSTANCE;
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
	protected BahnsteigSwitch<Adapter> modelSwitch =
		new BahnsteigSwitch<Adapter>() {
			@Override
			public Adapter caseBahnsteig_Anlage(Bahnsteig_Anlage object) {
				return createBahnsteig_AnlageAdapter();
			}
			@Override
			public Adapter caseBahnsteig_Anlage_Bezeichnung_AttributeGroup(Bahnsteig_Anlage_Bezeichnung_AttributeGroup object) {
				return createBahnsteig_Anlage_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBahnsteig_Dach(Bahnsteig_Dach object) {
				return createBahnsteig_DachAdapter();
			}
			@Override
			public Adapter caseBahnsteig_Kante(Bahnsteig_Kante object) {
				return createBahnsteig_KanteAdapter();
			}
			@Override
			public Adapter caseBahnsteig_Kante_Allg_AttributeGroup(Bahnsteig_Kante_Allg_AttributeGroup object) {
				return createBahnsteig_Kante_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBahnsteig_Kante_Bezeichnung_AttributeGroup(Bahnsteig_Kante_Bezeichnung_AttributeGroup object) {
				return createBahnsteig_Kante_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBahnsteig_Zugang(Bahnsteig_Zugang object) {
				return createBahnsteig_ZugangAdapter();
			}
			@Override
			public Adapter caseBahnsteig_Zugang_Allg_AttributeGroup(Bahnsteig_Zugang_Allg_AttributeGroup object) {
				return createBahnsteig_Zugang_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBahnsteig_Zugang_Art_TypeClass(Bahnsteig_Zugang_Art_TypeClass object) {
				return createBahnsteig_Zugang_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Bahnsteig_Anlage_TypeClass(Bezeichnung_Bahnsteig_Anlage_TypeClass object) {
				return createBezeichnung_Bahnsteig_Anlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Bahnsteig_Kante_TypeClass(Bezeichnung_Bahnsteig_Kante_TypeClass object) {
				return createBezeichnung_Bahnsteig_Kante_TypeClassAdapter();
			}
			@Override
			public Adapter caseHauptzugang_TypeClass(Hauptzugang_TypeClass object) {
				return createHauptzugang_TypeClassAdapter();
			}
			@Override
			public Adapter caseLage_Zum_Gleis_TypeClass(Lage_Zum_Gleis_TypeClass object) {
				return createLage_Zum_Gleis_TypeClassAdapter();
			}
			@Override
			public Adapter caseSystemhoehe_TypeClass(Systemhoehe_TypeClass object) {
				return createSystemhoehe_TypeClassAdapter();
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
			public Adapter casePunkt_Objekt(Punkt_Objekt object) {
				return createPunkt_ObjektAdapter();
			}
			@Override
			public Adapter caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
				return createBasisAttribut_AttributeGroupAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Anlage <em>Bahnsteig Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Anlage
	 * @generated
	 */
	public Adapter createBahnsteig_AnlageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Anlage_Bezeichnung_AttributeGroup <em>Bahnsteig Anlage Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Anlage_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createBahnsteig_Anlage_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Dach <em>Bahnsteig Dach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Dach
	 * @generated
	 */
	public Adapter createBahnsteig_DachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante <em>Bahnsteig Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante
	 * @generated
	 */
	public Adapter createBahnsteig_KanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup <em>Bahnsteig Kante Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBahnsteig_Kante_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante_Bezeichnung_AttributeGroup <em>Bahnsteig Kante Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createBahnsteig_Kante_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Zugang <em>Bahnsteig Zugang</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Zugang
	 * @generated
	 */
	public Adapter createBahnsteig_ZugangAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup <em>Bahnsteig Zugang Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBahnsteig_Zugang_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Zugang_Art_TypeClass <em>Bahnsteig Zugang Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Zugang_Art_TypeClass
	 * @generated
	 */
	public Adapter createBahnsteig_Zugang_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Bezeichnung_Bahnsteig_Anlage_TypeClass <em>Bezeichnung Bahnsteig Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Bezeichnung_Bahnsteig_Anlage_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Bahnsteig_Anlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Bezeichnung_Bahnsteig_Kante_TypeClass <em>Bezeichnung Bahnsteig Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Bezeichnung_Bahnsteig_Kante_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Bahnsteig_Kante_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Hauptzugang_TypeClass <em>Hauptzugang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Hauptzugang_TypeClass
	 * @generated
	 */
	public Adapter createHauptzugang_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Lage_Zum_Gleis_TypeClass <em>Lage Zum Gleis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Lage_Zum_Gleis_TypeClass
	 * @generated
	 */
	public Adapter createLage_Zum_Gleis_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Bahnsteig.Systemhoehe_TypeClass <em>Systemhoehe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Bahnsteig.Systemhoehe_TypeClass
	 * @generated
	 */
	public Adapter createSystemhoehe_TypeClassAdapter() {
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

} //BahnsteigAdapterFactory
