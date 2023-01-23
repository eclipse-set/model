/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Flankenschutz.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.Flankenschutz.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Flankenschutz.FlankenschutzPackage
 * @generated
 */
public class FlankenschutzAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlankenschutzPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlankenschutzAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FlankenschutzPackage.eINSTANCE;
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
	protected FlankenschutzSwitch<Adapter> modelSwitch =
		new FlankenschutzSwitch<Adapter>() {
			@Override
			public Adapter caseEKW_Kr_Anteil_TypeClass(EKW_Kr_Anteil_TypeClass object) {
				return createEKW_Kr_Anteil_TypeClassAdapter();
			}
			@Override
			public Adapter caseFahrt_Ueber_TypeClass(Fahrt_Ueber_TypeClass object) {
				return createFahrt_Ueber_TypeClassAdapter();
			}
			@Override
			public Adapter caseFla_Freimelde_Zuordnung(Fla_Freimelde_Zuordnung object) {
				return createFla_Freimelde_ZuordnungAdapter();
			}
			@Override
			public Adapter caseFla_Raum_Freimeldung_TypeClass(Fla_Raum_Freimeldung_TypeClass object) {
				return createFla_Raum_Freimeldung_TypeClassAdapter();
			}
			@Override
			public Adapter caseFla_Schutz(Fla_Schutz object) {
				return createFla_SchutzAdapter();
			}
			@Override
			public Adapter caseFla_Schutz_Anforderer_AttributeGroup(Fla_Schutz_Anforderer_AttributeGroup object) {
				return createFla_Schutz_Anforderer_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFla_Schutz_Signal_AttributeGroup(Fla_Schutz_Signal_AttributeGroup object) {
				return createFla_Schutz_Signal_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFla_Schutz_W_Gsp_AttributeGroup(Fla_Schutz_W_Gsp_AttributeGroup object) {
				return createFla_Schutz_W_Gsp_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFla_Schutz_Weitergabe_AttributeGroup(Fla_Schutz_Weitergabe_AttributeGroup object) {
				return createFla_Schutz_Weitergabe_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFla_Signal_Zielsperrung_TypeClass(Fla_Signal_Zielsperrung_TypeClass object) {
				return createFla_Signal_Zielsperrung_TypeClassAdapter();
			}
			@Override
			public Adapter caseFla_Verzicht_TypeClass(Fla_Verzicht_TypeClass object) {
				return createFla_Verzicht_TypeClassAdapter();
			}
			@Override
			public Adapter caseFla_W_Lage_TypeClass(Fla_W_Lage_TypeClass object) {
				return createFla_W_Lage_TypeClassAdapter();
			}
			@Override
			public Adapter caseFla_Zwieschutz(Fla_Zwieschutz object) {
				return createFla_ZwieschutzAdapter();
			}
			@Override
			public Adapter caseFla_Zwieschutz_Element_AttributeGroup(Fla_Zwieschutz_Element_AttributeGroup object) {
				return createFla_Zwieschutz_Element_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseMassnahme_TypeClass(Massnahme_TypeClass object) {
				return createMassnahme_TypeClassAdapter();
			}
			@Override
			public Adapter caseNachlaufverhinderung_TypeClass(Nachlaufverhinderung_TypeClass object) {
				return createNachlaufverhinderung_TypeClassAdapter();
			}
			@Override
			public Adapter caseZwieschutz_Art_TypeClass(Zwieschutz_Art_TypeClass object) {
				return createZwieschutz_Art_TypeClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.EKW_Kr_Anteil_TypeClass <em>EKW Kr Anteil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.EKW_Kr_Anteil_TypeClass
	 * @generated
	 */
	public Adapter createEKW_Kr_Anteil_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Fahrt_Ueber_TypeClass <em>Fahrt Ueber Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Fahrt_Ueber_TypeClass
	 * @generated
	 */
	public Adapter createFahrt_Ueber_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Fla_Freimelde_Zuordnung <em>Fla Freimelde Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Fla_Freimelde_Zuordnung
	 * @generated
	 */
	public Adapter createFla_Freimelde_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Fla_Raum_Freimeldung_TypeClass <em>Fla Raum Freimeldung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Fla_Raum_Freimeldung_TypeClass
	 * @generated
	 */
	public Adapter createFla_Raum_Freimeldung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz <em>Fla Schutz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz
	 * @generated
	 */
	public Adapter createFla_SchutzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup <em>Fla Schutz Anforderer Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup
	 * @generated
	 */
	public Adapter createFla_Schutz_Anforderer_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz_Signal_AttributeGroup <em>Fla Schutz Signal Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz_Signal_AttributeGroup
	 * @generated
	 */
	public Adapter createFla_Schutz_Signal_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup <em>Fla Schutz WGsp Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup
	 * @generated
	 */
	public Adapter createFla_Schutz_W_Gsp_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup <em>Fla Schutz Weitergabe Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup
	 * @generated
	 */
	public Adapter createFla_Schutz_Weitergabe_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Fla_Signal_Zielsperrung_TypeClass <em>Fla Signal Zielsperrung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Fla_Signal_Zielsperrung_TypeClass
	 * @generated
	 */
	public Adapter createFla_Signal_Zielsperrung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Fla_Verzicht_TypeClass <em>Fla Verzicht Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Fla_Verzicht_TypeClass
	 * @generated
	 */
	public Adapter createFla_Verzicht_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Fla_W_Lage_TypeClass <em>Fla WLage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Fla_W_Lage_TypeClass
	 * @generated
	 */
	public Adapter createFla_W_Lage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Fla_Zwieschutz <em>Fla Zwieschutz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Fla_Zwieschutz
	 * @generated
	 */
	public Adapter createFla_ZwieschutzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup <em>Fla Zwieschutz Element Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup
	 * @generated
	 */
	public Adapter createFla_Zwieschutz_Element_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Massnahme_TypeClass <em>Massnahme Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Massnahme_TypeClass
	 * @generated
	 */
	public Adapter createMassnahme_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Nachlaufverhinderung_TypeClass <em>Nachlaufverhinderung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Nachlaufverhinderung_TypeClass
	 * @generated
	 */
	public Adapter createNachlaufverhinderung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Flankenschutz.Zwieschutz_Art_TypeClass <em>Zwieschutz Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Flankenschutz.Zwieschutz_Art_TypeClass
	 * @generated
	 */
	public Adapter createZwieschutz_Art_TypeClassAdapter() {
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

} //FlankenschutzAdapterFactory
