/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PZB.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.PZB.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.PZB.PZBPackage
 * @generated
 */
public class PZBAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PZBPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PZBAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PZBPackage.eINSTANCE;
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
	protected PZBSwitch<Adapter> modelSwitch =
		new PZBSwitch<Adapter>() {
			@Override
			public Adapter caseGUE_Abstand_Abweichend_TypeClass(GUE_Abstand_Abweichend_TypeClass object) {
				return createGUE_Abstand_Abweichend_TypeClassAdapter();
			}
			@Override
			public Adapter caseGUE_Anordnung_TypeClass(GUE_Anordnung_TypeClass object) {
				return createGUE_Anordnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseGUE_Bauart_TypeClass(GUE_Bauart_TypeClass object) {
				return createGUE_Bauart_TypeClassAdapter();
			}
			@Override
			public Adapter caseGUE_Energieversorgung_TypeClass(GUE_Energieversorgung_TypeClass object) {
				return createGUE_Energieversorgung_TypeClassAdapter();
			}
			@Override
			public Adapter caseGUE_Messstrecke_TypeClass(GUE_Messstrecke_TypeClass object) {
				return createGUE_Messstrecke_TypeClassAdapter();
			}
			@Override
			public Adapter caseINA_Gefahrstelle_AttributeGroup(INA_Gefahrstelle_AttributeGroup object) {
				return createINA_Gefahrstelle_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseMessfehler_TypeClass(Messfehler_TypeClass object) {
				return createMessfehler_TypeClassAdapter();
			}
			@Override
			public Adapter casePrioritaet_Gefahrstelle_TypeClass(Prioritaet_Gefahrstelle_TypeClass object) {
				return createPrioritaet_Gefahrstelle_TypeClassAdapter();
			}
			@Override
			public Adapter casePruefgeschwindigkeit_TypeClass(Pruefgeschwindigkeit_TypeClass object) {
				return createPruefgeschwindigkeit_TypeClassAdapter();
			}
			@Override
			public Adapter casePruefzeit_TypeClass(Pruefzeit_TypeClass object) {
				return createPruefzeit_TypeClassAdapter();
			}
			@Override
			public Adapter casePZB_Abstand_GM_TypeClass(PZB_Abstand_GM_TypeClass object) {
				return createPZB_Abstand_GM_TypeClassAdapter();
			}
			@Override
			public Adapter casePZB_Art_TypeClass(PZB_Art_TypeClass object) {
				return createPZB_Art_TypeClassAdapter();
			}
			@Override
			public Adapter casePZB_Element(PZB_Element object) {
				return createPZB_ElementAdapter();
			}
			@Override
			public Adapter casePZB_Element_GM_AttributeGroup(PZB_Element_GM_AttributeGroup object) {
				return createPZB_Element_GM_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePZB_Element_GUE_AttributeGroup(PZB_Element_GUE_AttributeGroup object) {
				return createPZB_Element_GUE_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePZB_Element_Zuordnung(PZB_Element_Zuordnung object) {
				return createPZB_Element_ZuordnungAdapter();
			}
			@Override
			public Adapter casePZB_Element_Zuordnung_BP_AttributeGroup(PZB_Element_Zuordnung_BP_AttributeGroup object) {
				return createPZB_Element_Zuordnung_BP_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePZB_Element_Zuordnung_Fstr_AttributeGroup(PZB_Element_Zuordnung_Fstr_AttributeGroup object) {
				return createPZB_Element_Zuordnung_Fstr_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePZB_Element_Zuordnung_INA_AttributeGroup(PZB_Element_Zuordnung_INA_AttributeGroup object) {
				return createPZB_Element_Zuordnung_INA_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePZB_INA_TypeClass(PZB_INA_TypeClass object) {
				return createPZB_INA_TypeClassAdapter();
			}
			@Override
			public Adapter casePZB_Zuordnung_Signal(PZB_Zuordnung_Signal object) {
				return createPZB_Zuordnung_SignalAdapter();
			}
			@Override
			public Adapter caseWirksamkeit_Fstr_TypeClass(Wirksamkeit_Fstr_TypeClass object) {
				return createWirksamkeit_Fstr_TypeClassAdapter();
			}
			@Override
			public Adapter caseWirksamkeit_TypeClass(Wirksamkeit_TypeClass object) {
				return createWirksamkeit_TypeClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.GUE_Abstand_Abweichend_TypeClass <em>GUE Abstand Abweichend Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.GUE_Abstand_Abweichend_TypeClass
	 * @generated
	 */
	public Adapter createGUE_Abstand_Abweichend_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.GUE_Anordnung_TypeClass <em>GUE Anordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.GUE_Anordnung_TypeClass
	 * @generated
	 */
	public Adapter createGUE_Anordnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.GUE_Bauart_TypeClass <em>GUE Bauart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.GUE_Bauart_TypeClass
	 * @generated
	 */
	public Adapter createGUE_Bauart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.GUE_Energieversorgung_TypeClass <em>GUE Energieversorgung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.GUE_Energieversorgung_TypeClass
	 * @generated
	 */
	public Adapter createGUE_Energieversorgung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.GUE_Messstrecke_TypeClass <em>GUE Messstrecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.GUE_Messstrecke_TypeClass
	 * @generated
	 */
	public Adapter createGUE_Messstrecke_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.INA_Gefahrstelle_AttributeGroup <em>INA Gefahrstelle Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.INA_Gefahrstelle_AttributeGroup
	 * @generated
	 */
	public Adapter createINA_Gefahrstelle_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.Messfehler_TypeClass <em>Messfehler Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.Messfehler_TypeClass
	 * @generated
	 */
	public Adapter createMessfehler_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.Prioritaet_Gefahrstelle_TypeClass <em>Prioritaet Gefahrstelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.Prioritaet_Gefahrstelle_TypeClass
	 * @generated
	 */
	public Adapter createPrioritaet_Gefahrstelle_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.Pruefgeschwindigkeit_TypeClass <em>Pruefgeschwindigkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.Pruefgeschwindigkeit_TypeClass
	 * @generated
	 */
	public Adapter createPruefgeschwindigkeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.Pruefzeit_TypeClass <em>Pruefzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.Pruefzeit_TypeClass
	 * @generated
	 */
	public Adapter createPruefzeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.PZB_Abstand_GM_TypeClass <em>PZB Abstand GM Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.PZB_Abstand_GM_TypeClass
	 * @generated
	 */
	public Adapter createPZB_Abstand_GM_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.PZB_Art_TypeClass <em>PZB Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.PZB_Art_TypeClass
	 * @generated
	 */
	public Adapter createPZB_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.PZB_Element <em>PZB Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.PZB_Element
	 * @generated
	 */
	public Adapter createPZB_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.PZB_Element_GM_AttributeGroup <em>PZB Element GM Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.PZB_Element_GM_AttributeGroup
	 * @generated
	 */
	public Adapter createPZB_Element_GM_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.PZB_Element_GUE_AttributeGroup <em>PZB Element GUE Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.PZB_Element_GUE_AttributeGroup
	 * @generated
	 */
	public Adapter createPZB_Element_GUE_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung <em>PZB Element Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung
	 * @generated
	 */
	public Adapter createPZB_Element_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_BP_AttributeGroup <em>PZB Element Zuordnung BP Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_BP_AttributeGroup
	 * @generated
	 */
	public Adapter createPZB_Element_Zuordnung_BP_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup <em>PZB Element Zuordnung Fstr Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup
	 * @generated
	 */
	public Adapter createPZB_Element_Zuordnung_Fstr_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_INA_AttributeGroup <em>PZB Element Zuordnung INA Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_INA_AttributeGroup
	 * @generated
	 */
	public Adapter createPZB_Element_Zuordnung_INA_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.PZB_INA_TypeClass <em>PZB INA Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.PZB_INA_TypeClass
	 * @generated
	 */
	public Adapter createPZB_INA_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.PZB_Zuordnung_Signal <em>PZB Zuordnung Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.PZB_Zuordnung_Signal
	 * @generated
	 */
	public Adapter createPZB_Zuordnung_SignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.Wirksamkeit_Fstr_TypeClass <em>Wirksamkeit Fstr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.Wirksamkeit_Fstr_TypeClass
	 * @generated
	 */
	public Adapter createWirksamkeit_Fstr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.PZB.Wirksamkeit_TypeClass <em>Wirksamkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.PZB.Wirksamkeit_TypeClass
	 * @generated
	 */
	public Adapter createWirksamkeit_TypeClassAdapter() {
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

} //PZBAdapterFactory
