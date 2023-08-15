/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Layoutinformationen.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.Layoutinformationen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage
 * @generated
 */
public class LayoutinformationenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LayoutinformationenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutinformationenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LayoutinformationenPackage.eINSTANCE;
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
	protected LayoutinformationenSwitch<Adapter> modelSwitch =
		new LayoutinformationenSwitch<Adapter>() {
			@Override
			public Adapter caseBez_Lageplan_Blattschnitt_TypeClass(Bez_Lageplan_Blattschnitt_TypeClass object) {
				return createBez_Lageplan_Blattschnitt_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Lageplan_TypeClass(Bezeichnung_Lageplan_TypeClass object) {
				return createBezeichnung_Lageplan_TypeClassAdapter();
			}
			@Override
			public Adapter caseDarstellung_GEO_Punkt_TypeClass(Darstellung_GEO_Punkt_TypeClass object) {
				return createDarstellung_GEO_Punkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseDarstellung_Polygonzug_TypeClass(Darstellung_Polygonzug_TypeClass object) {
				return createDarstellung_Polygonzug_TypeClassAdapter();
			}
			@Override
			public Adapter caseDarstellung_Richtungswinkel_TypeClass(Darstellung_Richtungswinkel_TypeClass object) {
				return createDarstellung_Richtungswinkel_TypeClassAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseElement_Position(Element_Position object) {
				return createElement_PositionAdapter();
			}
			@Override
			public Adapter caseElement_Position_Allg_AttributeGroup(Element_Position_Allg_AttributeGroup object) {
				return createElement_Position_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseElement_Stil(Element_Stil object) {
				return createElement_StilAdapter();
			}
			@Override
			public Adapter caseElement_Stil_Allg_AttributeGroup(Element_Stil_Allg_AttributeGroup object) {
				return createElement_Stil_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFuellung_TypeClass(Fuellung_TypeClass object) {
				return createFuellung_TypeClassAdapter();
			}
			@Override
			public Adapter caseLageplan(Lageplan object) {
				return createLageplanAdapter();
			}
			@Override
			public Adapter caseLageplan_Art_TypeClass(Lageplan_Art_TypeClass object) {
				return createLageplan_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseLageplan_Bezeichnung_AttributeGroup(Lageplan_Bezeichnung_AttributeGroup object) {
				return createLageplan_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLageplan_Blattschnitt(Lageplan_Blattschnitt object) {
				return createLageplan_BlattschnittAdapter();
			}
			@Override
			public Adapter caseLageplan_Blattschnitt_Bezeichnung_AttributeGroup(Lageplan_Blattschnitt_Bezeichnung_AttributeGroup object) {
				return createLageplan_Blattschnitt_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLageplan_Zustand(Lageplan_Zustand object) {
				return createLageplan_ZustandAdapter();
			}
			@Override
			public Adapter caseLinie_Art_TypeClass(Linie_Art_TypeClass object) {
				return createLinie_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseLinie_Farbwert_TypeClass(Linie_Farbwert_TypeClass object) {
				return createLinie_Farbwert_TypeClassAdapter();
			}
			@Override
			public Adapter caseLinie_Subart_TypeClass(Linie_Subart_TypeClass object) {
				return createLinie_Subart_TypeClassAdapter();
			}
			@Override
			public Adapter casePlanPro_Layoutinfo(PlanPro_Layoutinfo object) {
				return createPlanPro_LayoutinfoAdapter();
			}
			@Override
			public Adapter casePolygonzug_Ausrichtung_TypeClass(Polygonzug_Ausrichtung_TypeClass object) {
				return createPolygonzug_Ausrichtung_TypeClassAdapter();
			}
			@Override
			public Adapter casePolygonzug_Blattschnitt_TypeClass(Polygonzug_Blattschnitt_TypeClass object) {
				return createPolygonzug_Blattschnitt_TypeClassAdapter();
			}
			@Override
			public Adapter caseReferenz_LST_Zustand_TypeClass(Referenz_LST_Zustand_TypeClass object) {
				return createReferenz_LST_Zustand_TypeClassAdapter();
			}
			@Override
			public Adapter caseReferenz_Objekt_Darstellung_TypeClass(Referenz_Objekt_Darstellung_TypeClass object) {
				return createReferenz_Objekt_Darstellung_TypeClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Bez_Lageplan_Blattschnitt_TypeClass <em>Bez Lageplan Blattschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Bez_Lageplan_Blattschnitt_TypeClass
	 * @generated
	 */
	public Adapter createBez_Lageplan_Blattschnitt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Bezeichnung_Lageplan_TypeClass <em>Bezeichnung Lageplan Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Bezeichnung_Lageplan_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Lageplan_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Darstellung_GEO_Punkt_TypeClass <em>Darstellung GEO Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Darstellung_GEO_Punkt_TypeClass
	 * @generated
	 */
	public Adapter createDarstellung_GEO_Punkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Darstellung_Polygonzug_TypeClass <em>Darstellung Polygonzug Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Darstellung_Polygonzug_TypeClass
	 * @generated
	 */
	public Adapter createDarstellung_Polygonzug_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Darstellung_Richtungswinkel_TypeClass <em>Darstellung Richtungswinkel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Darstellung_Richtungswinkel_TypeClass
	 * @generated
	 */
	public Adapter createDarstellung_Richtungswinkel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position <em>Element Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Element_Position
	 * @generated
	 */
	public Adapter createElement_PositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position_Allg_AttributeGroup <em>Element Position Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Element_Position_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createElement_Position_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Stil <em>Element Stil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Element_Stil
	 * @generated
	 */
	public Adapter createElement_StilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Stil_Allg_AttributeGroup <em>Element Stil Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Element_Stil_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createElement_Stil_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Fuellung_TypeClass <em>Fuellung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Fuellung_TypeClass
	 * @generated
	 */
	public Adapter createFuellung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan <em>Lageplan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Lageplan
	 * @generated
	 */
	public Adapter createLageplanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Art_TypeClass <em>Lageplan Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Art_TypeClass
	 * @generated
	 */
	public Adapter createLageplan_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Bezeichnung_AttributeGroup <em>Lageplan Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createLageplan_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Blattschnitt <em>Lageplan Blattschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Blattschnitt
	 * @generated
	 */
	public Adapter createLageplan_BlattschnittAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Blattschnitt_Bezeichnung_AttributeGroup <em>Lageplan Blattschnitt Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Blattschnitt_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createLageplan_Blattschnitt_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Zustand <em>Lageplan Zustand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Zustand
	 * @generated
	 */
	public Adapter createLageplan_ZustandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Linie_Art_TypeClass <em>Linie Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Linie_Art_TypeClass
	 * @generated
	 */
	public Adapter createLinie_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Linie_Farbwert_TypeClass <em>Linie Farbwert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Linie_Farbwert_TypeClass
	 * @generated
	 */
	public Adapter createLinie_Farbwert_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Linie_Subart_TypeClass <em>Linie Subart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Linie_Subart_TypeClass
	 * @generated
	 */
	public Adapter createLinie_Subart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.PlanPro_Layoutinfo <em>Plan Pro Layoutinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.PlanPro_Layoutinfo
	 * @generated
	 */
	public Adapter createPlanPro_LayoutinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Polygonzug_Ausrichtung_TypeClass <em>Polygonzug Ausrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Polygonzug_Ausrichtung_TypeClass
	 * @generated
	 */
	public Adapter createPolygonzug_Ausrichtung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Polygonzug_Blattschnitt_TypeClass <em>Polygonzug Blattschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Polygonzug_Blattschnitt_TypeClass
	 * @generated
	 */
	public Adapter createPolygonzug_Blattschnitt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Referenz_LST_Zustand_TypeClass <em>Referenz LST Zustand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Referenz_LST_Zustand_TypeClass
	 * @generated
	 */
	public Adapter createReferenz_LST_Zustand_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Layoutinformationen.Referenz_Objekt_Darstellung_TypeClass <em>Referenz Objekt Darstellung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.Referenz_Objekt_Darstellung_TypeClass
	 * @generated
	 */
	public Adapter createReferenz_Objekt_Darstellung_TypeClassAdapter() {
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

} //LayoutinformationenAdapterFactory
