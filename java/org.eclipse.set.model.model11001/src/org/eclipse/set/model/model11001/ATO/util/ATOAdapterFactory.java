/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.ATO.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.ATO.*;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.ATO.ATOPackage
 * @generated
 */
public class ATOAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ATOPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATOAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ATOPackage.eINSTANCE;
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
	protected ATOSwitch<Adapter> modelSwitch =
		new ATOSwitch<Adapter>() {
			@Override
			public Adapter caseAbstand_ATO_Halt_Vor_EoA_TypeClass(Abstand_ATO_Halt_Vor_EoA_TypeClass object) {
				return createAbstand_ATO_Halt_Vor_EoA_TypeClassAdapter();
			}
			@Override
			public Adapter caseATO_Segment_Profile(ATO_Segment_Profile object) {
				return createATO_Segment_ProfileAdapter();
			}
			@Override
			public Adapter caseATO_Segment_Profile_Bezeichnung_AttributeGroup(ATO_Segment_Profile_Bezeichnung_AttributeGroup object) {
				return createATO_Segment_Profile_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseATO_Timing_Point(ATO_Timing_Point object) {
				return createATO_Timing_PointAdapter();
			}
			@Override
			public Adapter caseATO_Timing_Point_Allg_AttributeGroup(ATO_Timing_Point_Allg_AttributeGroup object) {
				return createATO_Timing_Point_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseATO_Timing_Point_Bezeichnung_AttributeGroup(ATO_Timing_Point_Bezeichnung_AttributeGroup object) {
				return createATO_Timing_Point_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseATO_TS_Instanz(ATO_TS_Instanz object) {
				return createATO_TS_InstanzAdapter();
			}
			@Override
			public Adapter caseATO_TS_Instanz_Adresse_AttributeGroup(ATO_TS_Instanz_Adresse_AttributeGroup object) {
				return createATO_TS_Instanz_Adresse_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBezeichnung_ATO_TP_TypeClass(Bezeichnung_ATO_TP_TypeClass object) {
				return createBezeichnung_ATO_TP_TypeClassAdapter();
			}
			@Override
			public Adapter caseErreichungstoleranz_TypeClass(Erreichungstoleranz_TypeClass object) {
				return createErreichungstoleranz_TypeClassAdapter();
			}
			@Override
			public Adapter caseHaltetoleranz_TypeClass(Haltetoleranz_TypeClass object) {
				return createHaltetoleranz_TypeClassAdapter();
			}
			@Override
			public Adapter caseNID_ATOTS_TypeClass(NID_ATOTS_TypeClass object) {
				return createNID_ATOTS_TypeClassAdapter();
			}
			@Override
			public Adapter caseNID_C_ATOTS_TypeClass(NID_C_ATOTS_TypeClass object) {
				return createNID_C_ATOTS_TypeClassAdapter();
			}
			@Override
			public Adapter caseNID_SP_TypeClass(NID_SP_TypeClass object) {
				return createNID_SP_TypeClassAdapter();
			}
			@Override
			public Adapter caseNID_TP_TypeClass(NID_TP_TypeClass object) {
				return createNID_TP_TypeClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.Abstand_ATO_Halt_Vor_EoA_TypeClass <em>Abstand ATO Halt Vor Eo AType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.Abstand_ATO_Halt_Vor_EoA_TypeClass
	 * @generated
	 */
	public Adapter createAbstand_ATO_Halt_Vor_EoA_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile <em>ATO Segment Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile
	 * @generated
	 */
	public Adapter createATO_Segment_ProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile_Bezeichnung_AttributeGroup <em>ATO Segment Profile Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createATO_Segment_Profile_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.ATO_Timing_Point <em>ATO Timing Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.ATO_Timing_Point
	 * @generated
	 */
	public Adapter createATO_Timing_PointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.ATO_Timing_Point_Allg_AttributeGroup <em>ATO Timing Point Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.ATO_Timing_Point_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createATO_Timing_Point_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.ATO_Timing_Point_Bezeichnung_AttributeGroup <em>ATO Timing Point Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.ATO_Timing_Point_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createATO_Timing_Point_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.ATO_TS_Instanz <em>ATO TS Instanz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.ATO_TS_Instanz
	 * @generated
	 */
	public Adapter createATO_TS_InstanzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.ATO_TS_Instanz_Adresse_AttributeGroup <em>ATO TS Instanz Adresse Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.ATO_TS_Instanz_Adresse_AttributeGroup
	 * @generated
	 */
	public Adapter createATO_TS_Instanz_Adresse_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.Bezeichnung_ATO_TP_TypeClass <em>Bezeichnung ATO TP Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.Bezeichnung_ATO_TP_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_ATO_TP_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.Erreichungstoleranz_TypeClass <em>Erreichungstoleranz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.Erreichungstoleranz_TypeClass
	 * @generated
	 */
	public Adapter createErreichungstoleranz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.Haltetoleranz_TypeClass <em>Haltetoleranz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.Haltetoleranz_TypeClass
	 * @generated
	 */
	public Adapter createHaltetoleranz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.NID_ATOTS_TypeClass <em>NID ATOTS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.NID_ATOTS_TypeClass
	 * @generated
	 */
	public Adapter createNID_ATOTS_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.NID_C_ATOTS_TypeClass <em>NID CATOTS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.NID_C_ATOTS_TypeClass
	 * @generated
	 */
	public Adapter createNID_C_ATOTS_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.NID_SP_TypeClass <em>NID SP Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.NID_SP_TypeClass
	 * @generated
	 */
	public Adapter createNID_SP_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.ATO.NID_TP_TypeClass <em>NID TP Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.ATO.NID_TP_TypeClass
	 * @generated
	 */
	public Adapter createNID_TP_TypeClassAdapter() {
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

} //ATOAdapterFactory
