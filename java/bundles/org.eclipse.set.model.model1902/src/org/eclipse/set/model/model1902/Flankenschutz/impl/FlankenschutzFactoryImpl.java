/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Flankenschutz.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.model1902.BasisTypen.ENUMLinksRechts;

import org.eclipse.set.model.model1902.Flankenschutz.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlankenschutzFactoryImpl extends EFactoryImpl implements FlankenschutzFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FlankenschutzFactory init() {
		try {
			FlankenschutzFactory theFlankenschutzFactory = (FlankenschutzFactory)EPackage.Registry.INSTANCE.getEFactory(FlankenschutzPackage.eNS_URI);
			if (theFlankenschutzFactory != null) {
				return theFlankenschutzFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FlankenschutzFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlankenschutzFactoryImpl() {
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
			case FlankenschutzPackage.FAHRT_UEBER_TYPE_CLASS: return createFahrt_Ueber_TypeClass();
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG: return createFla_Freimelde_Zuordnung();
			case FlankenschutzPackage.FLA_RAUM_FREIMELDUNG_TYPE_CLASS: return createFla_Raum_Freimeldung_TypeClass();
			case FlankenschutzPackage.FLA_SCHUTZ: return createFla_Schutz();
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP: return createFla_Schutz_Anforderer_AttributeGroup();
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP: return createFla_Schutz_Signal_AttributeGroup();
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP: return createFla_Schutz_W_Gsp_AttributeGroup();
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP: return createFla_Schutz_Weitergabe_AttributeGroup();
			case FlankenschutzPackage.FLA_SIGNAL_ZIELSPERRUNG_TYPE_CLASS: return createFla_Signal_Zielsperrung_TypeClass();
			case FlankenschutzPackage.FLA_VERZICHT_TYPE_CLASS: return createFla_Verzicht_TypeClass();
			case FlankenschutzPackage.FLA_WLAGE_TYPE_CLASS: return createFla_W_Lage_TypeClass();
			case FlankenschutzPackage.FLA_ZWIESCHUTZ: return createFla_Zwieschutz();
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP: return createFla_Zwieschutz_Element_AttributeGroup();
			case FlankenschutzPackage.MASSNAHME_TYPE_CLASS: return createMassnahme_TypeClass();
			case FlankenschutzPackage.NACHLAUFVERHINDERUNG_TYPE_CLASS: return createNachlaufverhinderung_TypeClass();
			case FlankenschutzPackage.ZWIESCHUTZ_ART_TYPE_CLASS: return createZwieschutz_Art_TypeClass();
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
			case FlankenschutzPackage.ENUM_FAHRT_UEBER:
				return createENUMFahrtUeberFromString(eDataType, initialValue);
			case FlankenschutzPackage.ENUM_MASSNAHME:
				return createENUMMassnahmeFromString(eDataType, initialValue);
			case FlankenschutzPackage.ENUM_ZWIESCHUTZ_ART:
				return createENUMZwieschutzArtFromString(eDataType, initialValue);
			case FlankenschutzPackage.ENUM_FAHRT_UEBER_OBJECT:
				return createENUMFahrtUeberObjectFromString(eDataType, initialValue);
			case FlankenschutzPackage.ENUM_MASSNAHME_OBJECT:
				return createENUMMassnahmeObjectFromString(eDataType, initialValue);
			case FlankenschutzPackage.ENUM_ZWIESCHUTZ_ART_OBJECT:
				return createENUMZwieschutzArtObjectFromString(eDataType, initialValue);
			case FlankenschutzPackage.FLA_WLAGE_TYPE:
				return createFla_W_Lage_TypeFromString(eDataType, initialValue);
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
			case FlankenschutzPackage.ENUM_FAHRT_UEBER:
				return convertENUMFahrtUeberToString(eDataType, instanceValue);
			case FlankenschutzPackage.ENUM_MASSNAHME:
				return convertENUMMassnahmeToString(eDataType, instanceValue);
			case FlankenschutzPackage.ENUM_ZWIESCHUTZ_ART:
				return convertENUMZwieschutzArtToString(eDataType, instanceValue);
			case FlankenschutzPackage.ENUM_FAHRT_UEBER_OBJECT:
				return convertENUMFahrtUeberObjectToString(eDataType, instanceValue);
			case FlankenschutzPackage.ENUM_MASSNAHME_OBJECT:
				return convertENUMMassnahmeObjectToString(eDataType, instanceValue);
			case FlankenschutzPackage.ENUM_ZWIESCHUTZ_ART_OBJECT:
				return convertENUMZwieschutzArtObjectToString(eDataType, instanceValue);
			case FlankenschutzPackage.FLA_WLAGE_TYPE:
				return convertFla_W_Lage_TypeToString(eDataType, instanceValue);
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
	public Fahrt_Ueber_TypeClass createFahrt_Ueber_TypeClass() {
		Fahrt_Ueber_TypeClassImpl fahrt_Ueber_TypeClass = new Fahrt_Ueber_TypeClassImpl();
		return fahrt_Ueber_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Freimelde_Zuordnung createFla_Freimelde_Zuordnung() {
		Fla_Freimelde_ZuordnungImpl fla_Freimelde_Zuordnung = new Fla_Freimelde_ZuordnungImpl();
		return fla_Freimelde_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Raum_Freimeldung_TypeClass createFla_Raum_Freimeldung_TypeClass() {
		Fla_Raum_Freimeldung_TypeClassImpl fla_Raum_Freimeldung_TypeClass = new Fla_Raum_Freimeldung_TypeClassImpl();
		return fla_Raum_Freimeldung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz createFla_Schutz() {
		Fla_SchutzImpl fla_Schutz = new Fla_SchutzImpl();
		return fla_Schutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz_Anforderer_AttributeGroup createFla_Schutz_Anforderer_AttributeGroup() {
		Fla_Schutz_Anforderer_AttributeGroupImpl fla_Schutz_Anforderer_AttributeGroup = new Fla_Schutz_Anforderer_AttributeGroupImpl();
		return fla_Schutz_Anforderer_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz_Signal_AttributeGroup createFla_Schutz_Signal_AttributeGroup() {
		Fla_Schutz_Signal_AttributeGroupImpl fla_Schutz_Signal_AttributeGroup = new Fla_Schutz_Signal_AttributeGroupImpl();
		return fla_Schutz_Signal_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz_W_Gsp_AttributeGroup createFla_Schutz_W_Gsp_AttributeGroup() {
		Fla_Schutz_W_Gsp_AttributeGroupImpl fla_Schutz_W_Gsp_AttributeGroup = new Fla_Schutz_W_Gsp_AttributeGroupImpl();
		return fla_Schutz_W_Gsp_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz_Weitergabe_AttributeGroup createFla_Schutz_Weitergabe_AttributeGroup() {
		Fla_Schutz_Weitergabe_AttributeGroupImpl fla_Schutz_Weitergabe_AttributeGroup = new Fla_Schutz_Weitergabe_AttributeGroupImpl();
		return fla_Schutz_Weitergabe_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Signal_Zielsperrung_TypeClass createFla_Signal_Zielsperrung_TypeClass() {
		Fla_Signal_Zielsperrung_TypeClassImpl fla_Signal_Zielsperrung_TypeClass = new Fla_Signal_Zielsperrung_TypeClassImpl();
		return fla_Signal_Zielsperrung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Verzicht_TypeClass createFla_Verzicht_TypeClass() {
		Fla_Verzicht_TypeClassImpl fla_Verzicht_TypeClass = new Fla_Verzicht_TypeClassImpl();
		return fla_Verzicht_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_W_Lage_TypeClass createFla_W_Lage_TypeClass() {
		Fla_W_Lage_TypeClassImpl fla_W_Lage_TypeClass = new Fla_W_Lage_TypeClassImpl();
		return fla_W_Lage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Zwieschutz createFla_Zwieschutz() {
		Fla_ZwieschutzImpl fla_Zwieschutz = new Fla_ZwieschutzImpl();
		return fla_Zwieschutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Zwieschutz_Element_AttributeGroup createFla_Zwieschutz_Element_AttributeGroup() {
		Fla_Zwieschutz_Element_AttributeGroupImpl fla_Zwieschutz_Element_AttributeGroup = new Fla_Zwieschutz_Element_AttributeGroupImpl();
		return fla_Zwieschutz_Element_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massnahme_TypeClass createMassnahme_TypeClass() {
		Massnahme_TypeClassImpl massnahme_TypeClass = new Massnahme_TypeClassImpl();
		return massnahme_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nachlaufverhinderung_TypeClass createNachlaufverhinderung_TypeClass() {
		Nachlaufverhinderung_TypeClassImpl nachlaufverhinderung_TypeClass = new Nachlaufverhinderung_TypeClassImpl();
		return nachlaufverhinderung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zwieschutz_Art_TypeClass createZwieschutz_Art_TypeClass() {
		Zwieschutz_Art_TypeClassImpl zwieschutz_Art_TypeClass = new Zwieschutz_Art_TypeClassImpl();
		return zwieschutz_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFahrtUeber createENUMFahrtUeberFromString(EDataType eDataType, String initialValue) {
		ENUMFahrtUeber result = ENUMFahrtUeber.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFahrtUeberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMMassnahme createENUMMassnahmeFromString(EDataType eDataType, String initialValue) {
		ENUMMassnahme result = ENUMMassnahme.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMMassnahmeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZwieschutzArt createENUMZwieschutzArtFromString(EDataType eDataType, String initialValue) {
		ENUMZwieschutzArt result = ENUMZwieschutzArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZwieschutzArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFahrtUeber createENUMFahrtUeberObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFahrtUeberFromString(FlankenschutzPackage.Literals.ENUM_FAHRT_UEBER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFahrtUeberObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFahrtUeberToString(FlankenschutzPackage.Literals.ENUM_FAHRT_UEBER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMMassnahme createENUMMassnahmeObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMMassnahmeFromString(FlankenschutzPackage.Literals.ENUM_MASSNAHME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMMassnahmeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMMassnahmeToString(FlankenschutzPackage.Literals.ENUM_MASSNAHME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZwieschutzArt createENUMZwieschutzArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMZwieschutzArtFromString(FlankenschutzPackage.Literals.ENUM_ZWIESCHUTZ_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZwieschutzArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMZwieschutzArtToString(FlankenschutzPackage.Literals.ENUM_ZWIESCHUTZ_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinksRechts createFla_W_Lage_TypeFromString(EDataType eDataType, String initialValue) {
		return (ENUMLinksRechts)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFla_W_Lage_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlankenschutzPackage getFlankenschutzPackage() {
		return (FlankenschutzPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FlankenschutzPackage getPackage() {
		return FlankenschutzPackage.eINSTANCE;
	}

} //FlankenschutzFactoryImpl
