/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Block.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Block.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Block.BlockPackage
 * @generated
 */
public class BlockAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BlockPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BlockPackage.eINSTANCE;
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
	protected BlockSwitch<Adapter> modelSwitch =
		new BlockSwitch<Adapter>() {
			@Override
			public Adapter caseAuto_Erlaubnisholen_TypeClass(Auto_Erlaubnisholen_TypeClass object) {
				return createAuto_Erlaubnisholen_TypeClassAdapter();
			}
			@Override
			public Adapter caseAuto_Erlaubnisruecklauf_TypeClass(Auto_Erlaubnisruecklauf_TypeClass object) {
				return createAuto_Erlaubnisruecklauf_TypeClassAdapter();
			}
			@Override
			public Adapter caseBetriebsfuehrung_TypeClass(Betriebsfuehrung_TypeClass object) {
				return createBetriebsfuehrung_TypeClassAdapter();
			}
			@Override
			public Adapter caseBlock_Anlage(Block_Anlage object) {
				return createBlock_AnlageAdapter();
			}
			@Override
			public Adapter caseBlock_Anlage_Allg_AttributeGroup(Block_Anlage_Allg_AttributeGroup object) {
				return createBlock_Anlage_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBlock_Bauform_TypeClass(Block_Bauform_TypeClass object) {
				return createBlock_Bauform_TypeClassAdapter();
			}
			@Override
			public Adapter caseBlock_Element(Block_Element object) {
				return createBlock_ElementAdapter();
			}
			@Override
			public Adapter caseBlock_Element_Allg_AttributeGroup(Block_Element_Allg_AttributeGroup object) {
				return createBlock_Element_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBlock_Element_Erlaubnis_AttributeGroup(Block_Element_Erlaubnis_AttributeGroup object) {
				return createBlock_Element_Erlaubnis_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBlock_Strecke(Block_Strecke object) {
				return createBlock_StreckeAdapter();
			}
			@Override
			public Adapter caseBlock_Strecke_Allg_AttributeGroup(Block_Strecke_Allg_AttributeGroup object) {
				return createBlock_Strecke_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBremsweg_TypeClass(Bremsweg_TypeClass object) {
				return createBremsweg_TypeClassAdapter();
			}
			@Override
			public Adapter caseErlaubnis_Staendig_Vorhanden_TypeClass(Erlaubnis_Staendig_Vorhanden_TypeClass object) {
				return createErlaubnis_Staendig_Vorhanden_TypeClassAdapter();
			}
			@Override
			public Adapter caseErlaubnisabgabespeicherung_TypeClass(Erlaubnisabgabespeicherung_TypeClass object) {
				return createErlaubnisabgabespeicherung_TypeClassAdapter();
			}
			@Override
			public Adapter caseErlaubnisholen_TypeClass(Erlaubnisholen_TypeClass object) {
				return createErlaubnisholen_TypeClassAdapter();
			}
			@Override
			public Adapter caseRueckblockwecker_TypeClass(Rueckblockwecker_TypeClass object) {
				return createRueckblockwecker_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchaltung_TypeClass(Schaltung_TypeClass object) {
				return createSchaltung_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchutzuebertrager_TypeClass(Schutzuebertrager_TypeClass object) {
				return createSchutzuebertrager_TypeClassAdapter();
			}
			@Override
			public Adapter caseStrecke_Art_TypeClass(Strecke_Art_TypeClass object) {
				return createStrecke_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseStreckengeschwindigkeit_TypeClass(Streckengeschwindigkeit_TypeClass object) {
				return createStreckengeschwindigkeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseTraktion_Art_Elektrisch_TypeClass(Traktion_Art_Elektrisch_TypeClass object) {
				return createTraktion_Art_Elektrisch_TypeClassAdapter();
			}
			@Override
			public Adapter caseVorblockwecker_TypeClass(Vorblockwecker_TypeClass object) {
				return createVorblockwecker_TypeClassAdapter();
			}
			@Override
			public Adapter caseZugbeeinflussung_Art_TypeClass(Zugbeeinflussung_Art_TypeClass object) {
				return createZugbeeinflussung_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseZusatzinformation_TypeClass(Zusatzinformation_TypeClass object) {
				return createZusatzinformation_TypeClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Auto_Erlaubnisholen_TypeClass <em>Auto Erlaubnisholen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Auto_Erlaubnisholen_TypeClass
	 * @generated
	 */
	public Adapter createAuto_Erlaubnisholen_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Auto_Erlaubnisruecklauf_TypeClass <em>Auto Erlaubnisruecklauf Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Auto_Erlaubnisruecklauf_TypeClass
	 * @generated
	 */
	public Adapter createAuto_Erlaubnisruecklauf_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Betriebsfuehrung_TypeClass <em>Betriebsfuehrung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Betriebsfuehrung_TypeClass
	 * @generated
	 */
	public Adapter createBetriebsfuehrung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Block_Anlage <em>Block Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Block_Anlage
	 * @generated
	 */
	public Adapter createBlock_AnlageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Block_Anlage_Allg_AttributeGroup <em>Block Anlage Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Block_Anlage_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBlock_Anlage_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Block_Bauform_TypeClass <em>Block Bauform Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Block_Bauform_TypeClass
	 * @generated
	 */
	public Adapter createBlock_Bauform_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Block_Element <em>Block Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element
	 * @generated
	 */
	public Adapter createBlock_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Block_Element_Allg_AttributeGroup <em>Block Element Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBlock_Element_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup <em>Block Element Erlaubnis Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup
	 * @generated
	 */
	public Adapter createBlock_Element_Erlaubnis_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Block_Strecke <em>Block Strecke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke
	 * @generated
	 */
	public Adapter createBlock_StreckeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup <em>Block Strecke Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBlock_Strecke_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Bremsweg_TypeClass <em>Bremsweg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Bremsweg_TypeClass
	 * @generated
	 */
	public Adapter createBremsweg_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Erlaubnis_Staendig_Vorhanden_TypeClass <em>Erlaubnis Staendig Vorhanden Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Erlaubnis_Staendig_Vorhanden_TypeClass
	 * @generated
	 */
	public Adapter createErlaubnis_Staendig_Vorhanden_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Erlaubnisabgabespeicherung_TypeClass <em>Erlaubnisabgabespeicherung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Erlaubnisabgabespeicherung_TypeClass
	 * @generated
	 */
	public Adapter createErlaubnisabgabespeicherung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Erlaubnisholen_TypeClass <em>Erlaubnisholen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Erlaubnisholen_TypeClass
	 * @generated
	 */
	public Adapter createErlaubnisholen_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Rueckblockwecker_TypeClass <em>Rueckblockwecker Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Rueckblockwecker_TypeClass
	 * @generated
	 */
	public Adapter createRueckblockwecker_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Schaltung_TypeClass <em>Schaltung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Schaltung_TypeClass
	 * @generated
	 */
	public Adapter createSchaltung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Schutzuebertrager_TypeClass <em>Schutzuebertrager Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Schutzuebertrager_TypeClass
	 * @generated
	 */
	public Adapter createSchutzuebertrager_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Strecke_Art_TypeClass <em>Strecke Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Strecke_Art_TypeClass
	 * @generated
	 */
	public Adapter createStrecke_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Streckengeschwindigkeit_TypeClass <em>Streckengeschwindigkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Streckengeschwindigkeit_TypeClass
	 * @generated
	 */
	public Adapter createStreckengeschwindigkeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Traktion_Art_Elektrisch_TypeClass <em>Traktion Art Elektrisch Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Traktion_Art_Elektrisch_TypeClass
	 * @generated
	 */
	public Adapter createTraktion_Art_Elektrisch_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Vorblockwecker_TypeClass <em>Vorblockwecker Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Vorblockwecker_TypeClass
	 * @generated
	 */
	public Adapter createVorblockwecker_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Zugbeeinflussung_Art_TypeClass <em>Zugbeeinflussung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Zugbeeinflussung_Art_TypeClass
	 * @generated
	 */
	public Adapter createZugbeeinflussung_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Block.Zusatzinformation_TypeClass <em>Zusatzinformation Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Block.Zusatzinformation_TypeClass
	 * @generated
	 */
	public Adapter createZusatzinformation_TypeClassAdapter() {
		return null;
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt <em>Ur Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt
	 * @generated
	 */
	public Adapter createUr_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt <em>Basis Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt
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

} //BlockAdapterFactory
