/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.BasisTypen.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.BasisTypen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage
 * @generated
 */
public class BasisTypenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasisTypenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisTypenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BasisTypenPackage.eINSTANCE;
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
	protected BasisTypenSwitch<Adapter> modelSwitch =
		new BasisTypenSwitch<Adapter>() {
			@Override
			public Adapter caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
				return createBasisAttribut_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Aussenanlage_TypeClass(Bezeichnung_Aussenanlage_TypeClass object) {
				return createBezeichnung_Aussenanlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Element_AttributeGroup(Bezeichnung_Element_AttributeGroup object) {
				return createBezeichnung_Element_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Lageplan_Kurz_TypeClass(Bezeichnung_Lageplan_Kurz_TypeClass object) {
				return createBezeichnung_Lageplan_Kurz_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Lageplan_Lang_TypeClass(Bezeichnung_Lageplan_Lang_TypeClass object) {
				return createBezeichnung_Lageplan_Lang_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Tabelle_TypeClass(Bezeichnung_Tabelle_TypeClass object) {
				return createBezeichnung_Tabelle_TypeClassAdapter();
			}
			@Override
			public Adapter caseDatum_Auslieferung_TypeClass(Datum_Auslieferung_TypeClass object) {
				return createDatum_Auslieferung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Bearbeitungsvermerk_TypeClass(ID_Bearbeitungsvermerk_TypeClass object) {
				return createID_Bearbeitungsvermerk_TypeClassAdapter();
			}
			@Override
			public Adapter caseKennzahl_TypeClass(Kennzahl_TypeClass object) {
				return createKennzahl_TypeClassAdapter();
			}
			@Override
			public Adapter caseOertlicher_Elementname_TypeClass(Oertlicher_Elementname_TypeClass object) {
				return createOertlicher_Elementname_TypeClassAdapter();
			}
			@Override
			public Adapter casePruefmerkmale_Daten_AttributeGroup(Pruefmerkmale_Daten_AttributeGroup object) {
				return createPruefmerkmale_Daten_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePruefsumme_Art_TypeClass(Pruefsumme_Art_TypeClass object) {
				return createPruefsumme_Art_TypeClassAdapter();
			}
			@Override
			public Adapter casePruefsumme_TypeClass(Pruefsumme_TypeClass object) {
				return createPruefsumme_TypeClassAdapter();
			}
			@Override
			public Adapter caseVersion_Auslieferung_TypeClass(Version_Auslieferung_TypeClass object) {
				return createVersion_Auslieferung_TypeClassAdapter();
			}
			@Override
			public Adapter caseZeiger_TypeClass(Zeiger_TypeClass object) {
				return createZeiger_TypeClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup <em>Basis Attribut Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup
	 * @generated
	 */
	public Adapter createBasisAttribut_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Aussenanlage_TypeClass <em>Bezeichnung Aussenanlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Aussenanlage_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Aussenanlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Element_AttributeGroup <em>Bezeichnung Element Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Element_AttributeGroup
	 * @generated
	 */
	public Adapter createBezeichnung_Element_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Lageplan_Kurz_TypeClass <em>Bezeichnung Lageplan Kurz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Lageplan_Kurz_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Lageplan_Kurz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Lageplan_Lang_TypeClass <em>Bezeichnung Lageplan Lang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Lageplan_Lang_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Lageplan_Lang_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Tabelle_TypeClass <em>Bezeichnung Tabelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Tabelle_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Tabelle_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Datum_Auslieferung_TypeClass <em>Datum Auslieferung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Datum_Auslieferung_TypeClass
	 * @generated
	 */
	public Adapter createDatum_Auslieferung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.ID_Bearbeitungsvermerk_TypeClass <em>ID Bearbeitungsvermerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.ID_Bearbeitungsvermerk_TypeClass
	 * @generated
	 */
	public Adapter createID_Bearbeitungsvermerk_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Kennzahl_TypeClass <em>Kennzahl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Kennzahl_TypeClass
	 * @generated
	 */
	public Adapter createKennzahl_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Oertlicher_Elementname_TypeClass <em>Oertlicher Elementname Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Oertlicher_Elementname_TypeClass
	 * @generated
	 */
	public Adapter createOertlicher_Elementname_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Pruefmerkmale_Daten_AttributeGroup <em>Pruefmerkmale Daten Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Pruefmerkmale_Daten_AttributeGroup
	 * @generated
	 */
	public Adapter createPruefmerkmale_Daten_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Pruefsumme_Art_TypeClass <em>Pruefsumme Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Pruefsumme_Art_TypeClass
	 * @generated
	 */
	public Adapter createPruefsumme_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Pruefsumme_TypeClass <em>Pruefsumme Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Pruefsumme_TypeClass
	 * @generated
	 */
	public Adapter createPruefsumme_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Version_Auslieferung_TypeClass <em>Version Auslieferung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Version_Auslieferung_TypeClass
	 * @generated
	 */
	public Adapter createVersion_Auslieferung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Zeiger_TypeClass <em>Zeiger Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Zeiger_TypeClass
	 * @generated
	 */
	public Adapter createZeiger_TypeClassAdapter() {
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

} //BasisTypenAdapterFactory
