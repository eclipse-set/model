/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage
 * @generated
 */
public class SchluesselabhaengigkeitenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchluesselabhaengigkeitenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchluesselabhaengigkeitenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SchluesselabhaengigkeitenPackage.eINSTANCE;
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
	protected SchluesselabhaengigkeitenSwitch<Adapter> modelSwitch =
		new SchluesselabhaengigkeitenSwitch<Adapter>() {
			@Override
			public Adapter caseBedienung_Art_TypeClass(Bedienung_Art_TypeClass object) {
				return createBedienung_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseBeschreibung_Sonderanlage_TypeClass(Beschreibung_Sonderanlage_TypeClass object) {
				return createBeschreibung_Sonderanlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Schloss_TypeClass(Bezeichnung_Schloss_TypeClass object) {
				return createBezeichnung_Schloss_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Schluessel_TypeClass(Bezeichnung_Schluessel_TypeClass object) {
				return createBezeichnung_Schluessel_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Sk_TypeClass(Bezeichnung_Sk_TypeClass object) {
				return createBezeichnung_Sk_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_Lage_TypeClass(BUE_Lage_TypeClass object) {
				return createBUE_Lage_TypeClassAdapter();
			}
			@Override
			public Adapter caseGsp_Lage_TypeClass(Gsp_Lage_TypeClass object) {
				return createGsp_Lage_TypeClassAdapter();
			}
			@Override
			public Adapter caseHauptschloss_TypeClass(Hauptschloss_TypeClass object) {
				return createHauptschloss_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchloss(Schloss object) {
				return createSchlossAdapter();
			}
			@Override
			public Adapter caseSchloss_Art_TypeClass(Schloss_Art_TypeClass object) {
				return createSchloss_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchloss_Bezeichnung_AttributeGroup(Schloss_Bezeichnung_AttributeGroup object) {
				return createSchloss_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSchloss_BUE_AttributeGroup(Schloss_BUE_AttributeGroup object) {
				return createSchloss_BUE_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSchloss_Gsp_AttributeGroup(Schloss_Gsp_AttributeGroup object) {
				return createSchloss_Gsp_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSchloss_Sk_AttributeGroup(Schloss_Sk_AttributeGroup object) {
				return createSchloss_Sk_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSchloss_Sonderanlage_AttributeGroup(Schloss_Sonderanlage_AttributeGroup object) {
				return createSchloss_Sonderanlage_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSchloss_Ssp_AttributeGroup(Schloss_Ssp_AttributeGroup object) {
				return createSchloss_Ssp_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSchloss_W_AttributeGroup(Schloss_W_AttributeGroup object) {
				return createSchloss_W_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSchlosskombination(Schlosskombination object) {
				return createSchlosskombinationAdapter();
			}
			@Override
			public Adapter caseSchlosskombination_Bezeichnung_AttributeGroup(Schlosskombination_Bezeichnung_AttributeGroup object) {
				return createSchlosskombination_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSchluessel(Schluessel object) {
				return createSchluesselAdapter();
			}
			@Override
			public Adapter caseSchluessel_Allg_AttributeGroup(Schluessel_Allg_AttributeGroup object) {
				return createSchluessel_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSchluessel_Bartform_TypeClass(Schluessel_Bartform_TypeClass object) {
				return createSchluessel_Bartform_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchluessel_Bezeichnung_AttributeGroup(Schluessel_Bezeichnung_AttributeGroup object) {
				return createSchluessel_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSchluessel_Gruppe_TypeClass(Schluessel_Gruppe_TypeClass object) {
				return createSchluessel_Gruppe_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchluessel_In_Grdst_Eingeschl_TypeClass(Schluessel_In_Grdst_Eingeschl_TypeClass object) {
				return createSchluessel_In_Grdst_Eingeschl_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchluesselsperre(Schluesselsperre object) {
				return createSchluesselsperreAdapter();
			}
			@Override
			public Adapter caseTechnisch_Berechtigter_TypeClass(Technisch_Berechtigter_TypeClass object) {
				return createTechnisch_Berechtigter_TypeClassAdapter();
			}
			@Override
			public Adapter caseVerschluss_Herzstueck_TypeClass(Verschluss_Herzstueck_TypeClass object) {
				return createVerschluss_Herzstueck_TypeClassAdapter();
			}
			@Override
			public Adapter caseW_Anbaulage_TypeClass(W_Anbaulage_TypeClass object) {
				return createW_Anbaulage_TypeClassAdapter();
			}
			@Override
			public Adapter caseW_Lage_TypeClass(W_Lage_TypeClass object) {
				return createW_Lage_TypeClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Bedienung_Art_TypeClass <em>Bedienung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Bedienung_Art_TypeClass
	 * @generated
	 */
	public Adapter createBedienung_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Beschreibung_Sonderanlage_TypeClass <em>Beschreibung Sonderanlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Beschreibung_Sonderanlage_TypeClass
	 * @generated
	 */
	public Adapter createBeschreibung_Sonderanlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Bezeichnung_Schloss_TypeClass <em>Bezeichnung Schloss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Bezeichnung_Schloss_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Schloss_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Bezeichnung_Schluessel_TypeClass <em>Bezeichnung Schluessel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Bezeichnung_Schluessel_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Schluessel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Bezeichnung_Sk_TypeClass <em>Bezeichnung Sk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Bezeichnung_Sk_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Sk_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.BUE_Lage_TypeClass <em>BUE Lage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.BUE_Lage_TypeClass
	 * @generated
	 */
	public Adapter createBUE_Lage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Gsp_Lage_TypeClass <em>Gsp Lage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Gsp_Lage_TypeClass
	 * @generated
	 */
	public Adapter createGsp_Lage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Hauptschloss_TypeClass <em>Hauptschloss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Hauptschloss_TypeClass
	 * @generated
	 */
	public Adapter createHauptschloss_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss <em>Schloss</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss
	 * @generated
	 */
	public Adapter createSchlossAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Art_TypeClass <em>Schloss Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Art_TypeClass
	 * @generated
	 */
	public Adapter createSchloss_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Bezeichnung_AttributeGroup <em>Schloss Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createSchloss_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_BUE_AttributeGroup <em>Schloss BUE Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_BUE_AttributeGroup
	 * @generated
	 */
	public Adapter createSchloss_BUE_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup <em>Schloss Gsp Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup
	 * @generated
	 */
	public Adapter createSchloss_Gsp_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup <em>Schloss Sk Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup
	 * @generated
	 */
	public Adapter createSchloss_Sk_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup <em>Schloss Sonderanlage Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup
	 * @generated
	 */
	public Adapter createSchloss_Sonderanlage_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup <em>Schloss Ssp Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup
	 * @generated
	 */
	public Adapter createSchloss_Ssp_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup <em>Schloss WAttribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup
	 * @generated
	 */
	public Adapter createSchloss_W_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schlosskombination <em>Schlosskombination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schlosskombination
	 * @generated
	 */
	public Adapter createSchlosskombinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schlosskombination_Bezeichnung_AttributeGroup <em>Schlosskombination Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schlosskombination_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createSchlosskombination_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel <em>Schluessel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel
	 * @generated
	 */
	public Adapter createSchluesselAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup <em>Schluessel Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createSchluessel_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel_Bartform_TypeClass <em>Schluessel Bartform Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel_Bartform_TypeClass
	 * @generated
	 */
	public Adapter createSchluessel_Bartform_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel_Bezeichnung_AttributeGroup <em>Schluessel Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createSchluessel_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass <em>Schluessel Gruppe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass
	 * @generated
	 */
	public Adapter createSchluessel_Gruppe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel_In_Grdst_Eingeschl_TypeClass <em>Schluessel In Grdst Eingeschl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel_In_Grdst_Eingeschl_TypeClass
	 * @generated
	 */
	public Adapter createSchluessel_In_Grdst_Eingeschl_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluesselsperre <em>Schluesselsperre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluesselsperre
	 * @generated
	 */
	public Adapter createSchluesselsperreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Technisch_Berechtigter_TypeClass <em>Technisch Berechtigter Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Technisch_Berechtigter_TypeClass
	 * @generated
	 */
	public Adapter createTechnisch_Berechtigter_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Verschluss_Herzstueck_TypeClass <em>Verschluss Herzstueck Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Verschluss_Herzstueck_TypeClass
	 * @generated
	 */
	public Adapter createVerschluss_Herzstueck_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.W_Anbaulage_TypeClass <em>WAnbaulage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.W_Anbaulage_TypeClass
	 * @generated
	 */
	public Adapter createW_Anbaulage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.W_Lage_TypeClass <em>WLage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.W_Lage_TypeClass
	 * @generated
	 */
	public Adapter createW_Lage_TypeClassAdapter() {
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

} //SchluesselabhaengigkeitenAdapterFactory
