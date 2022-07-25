/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Regelzeichnung.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model1902.Regelzeichnung.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegelzeichnungFactoryImpl extends EFactoryImpl implements RegelzeichnungFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RegelzeichnungFactory init() {
		try {
			RegelzeichnungFactory theRegelzeichnungFactory = (RegelzeichnungFactory)EPackage.Registry.INSTANCE.getEFactory(RegelzeichnungPackage.eNS_URI);
			if (theRegelzeichnungFactory != null) {
				return theRegelzeichnungFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RegelzeichnungFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegelzeichnungFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RegelzeichnungPackage.BILD_TYPE_CLASS: return createBild_TypeClass();
			case RegelzeichnungPackage.REGELZEICHNUNG: return createRegelzeichnung();
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP: return createRegelzeichnung_Allg_AttributeGroup();
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER: return createRegelzeichnung_Parameter();
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP: return createRegelzeichnung_Parameter_Allg_AttributeGroup();
			case RegelzeichnungPackage.RZ_NUMMER_TYPE_CLASS: return createRZ_Nummer_TypeClass();
			case RegelzeichnungPackage.RZ_PARAMETER_NAME_TYPE_CLASS: return createRZ_Parameter_Name_TypeClass();
			case RegelzeichnungPackage.RZ_PARAMETER_WERT_TYPE_CLASS: return createRZ_Parameter_Wert_TypeClass();
			case RegelzeichnungPackage.TITEL_TYPE_CLASS: return createTitel_TypeClass();
			case RegelzeichnungPackage.UNTERTITEL_TYPE_CLASS: return createUntertitel_TypeClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RegelzeichnungPackage.BILD_TYPE:
				return createBild_TypeFromString(eDataType, initialValue);
			case RegelzeichnungPackage.RZ_NUMMER_TYPE:
				return createRZ_Nummer_TypeFromString(eDataType, initialValue);
			case RegelzeichnungPackage.RZ_PARAMETER_NAME_TYPE:
				return createRZ_Parameter_Name_TypeFromString(eDataType, initialValue);
			case RegelzeichnungPackage.RZ_PARAMETER_WERT_TYPE:
				return createRZ_Parameter_Wert_TypeFromString(eDataType, initialValue);
			case RegelzeichnungPackage.TITEL_TYPE:
				return createTitel_TypeFromString(eDataType, initialValue);
			case RegelzeichnungPackage.UNTERTITEL_TYPE:
				return createUntertitel_TypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RegelzeichnungPackage.BILD_TYPE:
				return convertBild_TypeToString(eDataType, instanceValue);
			case RegelzeichnungPackage.RZ_NUMMER_TYPE:
				return convertRZ_Nummer_TypeToString(eDataType, instanceValue);
			case RegelzeichnungPackage.RZ_PARAMETER_NAME_TYPE:
				return convertRZ_Parameter_Name_TypeToString(eDataType, instanceValue);
			case RegelzeichnungPackage.RZ_PARAMETER_WERT_TYPE:
				return convertRZ_Parameter_Wert_TypeToString(eDataType, instanceValue);
			case RegelzeichnungPackage.TITEL_TYPE:
				return convertTitel_TypeToString(eDataType, instanceValue);
			case RegelzeichnungPackage.UNTERTITEL_TYPE:
				return convertUntertitel_TypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bild_TypeClass createBild_TypeClass() {
		Bild_TypeClassImpl bild_TypeClass = new Bild_TypeClassImpl();
		return bild_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regelzeichnung createRegelzeichnung() {
		RegelzeichnungImpl regelzeichnung = new RegelzeichnungImpl();
		return regelzeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regelzeichnung_Allg_AttributeGroup createRegelzeichnung_Allg_AttributeGroup() {
		Regelzeichnung_Allg_AttributeGroupImpl regelzeichnung_Allg_AttributeGroup = new Regelzeichnung_Allg_AttributeGroupImpl();
		return regelzeichnung_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regelzeichnung_Parameter createRegelzeichnung_Parameter() {
		Regelzeichnung_ParameterImpl regelzeichnung_Parameter = new Regelzeichnung_ParameterImpl();
		return regelzeichnung_Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regelzeichnung_Parameter_Allg_AttributeGroup createRegelzeichnung_Parameter_Allg_AttributeGroup() {
		Regelzeichnung_Parameter_Allg_AttributeGroupImpl regelzeichnung_Parameter_Allg_AttributeGroup = new Regelzeichnung_Parameter_Allg_AttributeGroupImpl();
		return regelzeichnung_Parameter_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RZ_Nummer_TypeClass createRZ_Nummer_TypeClass() {
		RZ_Nummer_TypeClassImpl rZ_Nummer_TypeClass = new RZ_Nummer_TypeClassImpl();
		return rZ_Nummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RZ_Parameter_Name_TypeClass createRZ_Parameter_Name_TypeClass() {
		RZ_Parameter_Name_TypeClassImpl rZ_Parameter_Name_TypeClass = new RZ_Parameter_Name_TypeClassImpl();
		return rZ_Parameter_Name_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RZ_Parameter_Wert_TypeClass createRZ_Parameter_Wert_TypeClass() {
		RZ_Parameter_Wert_TypeClassImpl rZ_Parameter_Wert_TypeClass = new RZ_Parameter_Wert_TypeClassImpl();
		return rZ_Parameter_Wert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Titel_TypeClass createTitel_TypeClass() {
		Titel_TypeClassImpl titel_TypeClass = new Titel_TypeClassImpl();
		return titel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Untertitel_TypeClass createUntertitel_TypeClass() {
		Untertitel_TypeClassImpl untertitel_TypeClass = new Untertitel_TypeClassImpl();
		return untertitel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBild_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBild_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRZ_Nummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRZ_Nummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRZ_Parameter_Name_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRZ_Parameter_Name_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRZ_Parameter_Wert_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRZ_Parameter_Wert_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTitel_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTitel_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUntertitel_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUntertitel_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegelzeichnungPackage getRegelzeichnungPackage() {
		return (RegelzeichnungPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RegelzeichnungPackage getPackage() {
		return RegelzeichnungPackage.eINSTANCE;
	}

} //RegelzeichnungFactoryImpl
