/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnsteig.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.set.model.model1902.Bahnsteig.*;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.model1902.BasisTypen.ENUMLinksRechts;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BahnsteigFactoryImpl extends EFactoryImpl implements BahnsteigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BahnsteigFactory init() {
		try {
			BahnsteigFactory theBahnsteigFactory = (BahnsteigFactory)EPackage.Registry.INSTANCE.getEFactory(BahnsteigPackage.eNS_URI);
			if (theBahnsteigFactory != null) {
				return theBahnsteigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BahnsteigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BahnsteigFactoryImpl() {
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
			case BahnsteigPackage.BAHNSTEIG_ANLAGE: return createBahnsteig_Anlage();
			case BahnsteigPackage.BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP: return createBahnsteig_Anlage_Bezeichnung_AttributeGroup();
			case BahnsteigPackage.BAHNSTEIG_DACH: return createBahnsteig_Dach();
			case BahnsteigPackage.BAHNSTEIG_KANTE: return createBahnsteig_Kante();
			case BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP: return createBahnsteig_Kante_Allg_AttributeGroup();
			case BahnsteigPackage.BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP: return createBahnsteig_Kante_Bezeichnung_AttributeGroup();
			case BahnsteigPackage.BAHNSTEIG_ZUGANG: return createBahnsteig_Zugang();
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP: return createBahnsteig_Zugang_Allg_AttributeGroup();
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ART_TYPE_CLASS: return createBahnsteig_Zugang_Art_TypeClass();
			case BahnsteigPackage.BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE_CLASS: return createBezeichnung_Bahnsteig_Anlage_TypeClass();
			case BahnsteigPackage.BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE_CLASS: return createBezeichnung_Bahnsteig_Kante_TypeClass();
			case BahnsteigPackage.HAUPTZUGANG_TYPE_CLASS: return createHauptzugang_TypeClass();
			case BahnsteigPackage.LAGE_ZUM_GLEIS_TYPE_CLASS: return createLage_Zum_Gleis_TypeClass();
			case BahnsteigPackage.SYSTEMHOEHE_TYPE_CLASS: return createSystemhoehe_TypeClass();
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
			case BahnsteigPackage.ENUM_BAHNSTEIG_ZUGANG_ART:
				return createENUMBahnsteigZugangArtFromString(eDataType, initialValue);
			case BahnsteigPackage.ENUM_SYSTEMHOEHE:
				return createENUMSystemhoeheFromString(eDataType, initialValue);
			case BahnsteigPackage.BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE:
				return createBezeichnung_Bahnsteig_Anlage_TypeFromString(eDataType, initialValue);
			case BahnsteigPackage.BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE:
				return createBezeichnung_Bahnsteig_Kante_TypeFromString(eDataType, initialValue);
			case BahnsteigPackage.ENUM_BAHNSTEIG_ZUGANG_ART_OBJECT:
				return createENUMBahnsteigZugangArtObjectFromString(eDataType, initialValue);
			case BahnsteigPackage.ENUM_SYSTEMHOEHE_OBJECT:
				return createENUMSystemhoeheObjectFromString(eDataType, initialValue);
			case BahnsteigPackage.HAUPTZUGANG_TYPE:
				return createHauptzugang_TypeFromString(eDataType, initialValue);
			case BahnsteigPackage.HAUPTZUGANG_TYPE_OBJECT:
				return createHauptzugang_TypeObjectFromString(eDataType, initialValue);
			case BahnsteigPackage.LAGE_ZUM_GLEIS_TYPE:
				return createLage_Zum_Gleis_TypeFromString(eDataType, initialValue);
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
			case BahnsteigPackage.ENUM_BAHNSTEIG_ZUGANG_ART:
				return convertENUMBahnsteigZugangArtToString(eDataType, instanceValue);
			case BahnsteigPackage.ENUM_SYSTEMHOEHE:
				return convertENUMSystemhoeheToString(eDataType, instanceValue);
			case BahnsteigPackage.BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE:
				return convertBezeichnung_Bahnsteig_Anlage_TypeToString(eDataType, instanceValue);
			case BahnsteigPackage.BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE:
				return convertBezeichnung_Bahnsteig_Kante_TypeToString(eDataType, instanceValue);
			case BahnsteigPackage.ENUM_BAHNSTEIG_ZUGANG_ART_OBJECT:
				return convertENUMBahnsteigZugangArtObjectToString(eDataType, instanceValue);
			case BahnsteigPackage.ENUM_SYSTEMHOEHE_OBJECT:
				return convertENUMSystemhoeheObjectToString(eDataType, instanceValue);
			case BahnsteigPackage.HAUPTZUGANG_TYPE:
				return convertHauptzugang_TypeToString(eDataType, instanceValue);
			case BahnsteigPackage.HAUPTZUGANG_TYPE_OBJECT:
				return convertHauptzugang_TypeObjectToString(eDataType, instanceValue);
			case BahnsteigPackage.LAGE_ZUM_GLEIS_TYPE:
				return convertLage_Zum_Gleis_TypeToString(eDataType, instanceValue);
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
	public Bahnsteig_Anlage createBahnsteig_Anlage() {
		Bahnsteig_AnlageImpl bahnsteig_Anlage = new Bahnsteig_AnlageImpl();
		return bahnsteig_Anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Anlage_Bezeichnung_AttributeGroup createBahnsteig_Anlage_Bezeichnung_AttributeGroup() {
		Bahnsteig_Anlage_Bezeichnung_AttributeGroupImpl bahnsteig_Anlage_Bezeichnung_AttributeGroup = new Bahnsteig_Anlage_Bezeichnung_AttributeGroupImpl();
		return bahnsteig_Anlage_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Dach createBahnsteig_Dach() {
		Bahnsteig_DachImpl bahnsteig_Dach = new Bahnsteig_DachImpl();
		return bahnsteig_Dach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Kante createBahnsteig_Kante() {
		Bahnsteig_KanteImpl bahnsteig_Kante = new Bahnsteig_KanteImpl();
		return bahnsteig_Kante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Kante_Allg_AttributeGroup createBahnsteig_Kante_Allg_AttributeGroup() {
		Bahnsteig_Kante_Allg_AttributeGroupImpl bahnsteig_Kante_Allg_AttributeGroup = new Bahnsteig_Kante_Allg_AttributeGroupImpl();
		return bahnsteig_Kante_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Kante_Bezeichnung_AttributeGroup createBahnsteig_Kante_Bezeichnung_AttributeGroup() {
		Bahnsteig_Kante_Bezeichnung_AttributeGroupImpl bahnsteig_Kante_Bezeichnung_AttributeGroup = new Bahnsteig_Kante_Bezeichnung_AttributeGroupImpl();
		return bahnsteig_Kante_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Zugang createBahnsteig_Zugang() {
		Bahnsteig_ZugangImpl bahnsteig_Zugang = new Bahnsteig_ZugangImpl();
		return bahnsteig_Zugang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Zugang_Allg_AttributeGroup createBahnsteig_Zugang_Allg_AttributeGroup() {
		Bahnsteig_Zugang_Allg_AttributeGroupImpl bahnsteig_Zugang_Allg_AttributeGroup = new Bahnsteig_Zugang_Allg_AttributeGroupImpl();
		return bahnsteig_Zugang_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Zugang_Art_TypeClass createBahnsteig_Zugang_Art_TypeClass() {
		Bahnsteig_Zugang_Art_TypeClassImpl bahnsteig_Zugang_Art_TypeClass = new Bahnsteig_Zugang_Art_TypeClassImpl();
		return bahnsteig_Zugang_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Bahnsteig_Anlage_TypeClass createBezeichnung_Bahnsteig_Anlage_TypeClass() {
		Bezeichnung_Bahnsteig_Anlage_TypeClassImpl bezeichnung_Bahnsteig_Anlage_TypeClass = new Bezeichnung_Bahnsteig_Anlage_TypeClassImpl();
		return bezeichnung_Bahnsteig_Anlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Bahnsteig_Kante_TypeClass createBezeichnung_Bahnsteig_Kante_TypeClass() {
		Bezeichnung_Bahnsteig_Kante_TypeClassImpl bezeichnung_Bahnsteig_Kante_TypeClass = new Bezeichnung_Bahnsteig_Kante_TypeClassImpl();
		return bezeichnung_Bahnsteig_Kante_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hauptzugang_TypeClass createHauptzugang_TypeClass() {
		Hauptzugang_TypeClassImpl hauptzugang_TypeClass = new Hauptzugang_TypeClassImpl();
		return hauptzugang_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lage_Zum_Gleis_TypeClass createLage_Zum_Gleis_TypeClass() {
		Lage_Zum_Gleis_TypeClassImpl lage_Zum_Gleis_TypeClass = new Lage_Zum_Gleis_TypeClassImpl();
		return lage_Zum_Gleis_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Systemhoehe_TypeClass createSystemhoehe_TypeClass() {
		Systemhoehe_TypeClassImpl systemhoehe_TypeClass = new Systemhoehe_TypeClassImpl();
		return systemhoehe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBahnsteigZugangArt createENUMBahnsteigZugangArtFromString(EDataType eDataType, String initialValue) {
		ENUMBahnsteigZugangArt result = ENUMBahnsteigZugangArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBahnsteigZugangArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSystemhoehe createENUMSystemhoeheFromString(EDataType eDataType, String initialValue) {
		ENUMSystemhoehe result = ENUMSystemhoehe.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSystemhoeheToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Bahnsteig_Anlage_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Bahnsteig_Anlage_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Bahnsteig_Kante_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Bahnsteig_Kante_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBahnsteigZugangArt createENUMBahnsteigZugangArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBahnsteigZugangArtFromString(BahnsteigPackage.Literals.ENUM_BAHNSTEIG_ZUGANG_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBahnsteigZugangArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBahnsteigZugangArtToString(BahnsteigPackage.Literals.ENUM_BAHNSTEIG_ZUGANG_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSystemhoehe createENUMSystemhoeheObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSystemhoeheFromString(BahnsteigPackage.Literals.ENUM_SYSTEMHOEHE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSystemhoeheObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSystemhoeheToString(BahnsteigPackage.Literals.ENUM_SYSTEMHOEHE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createHauptzugang_TypeFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHauptzugang_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createHauptzugang_TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHauptzugang_TypeFromString(BahnsteigPackage.Literals.HAUPTZUGANG_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHauptzugang_TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHauptzugang_TypeToString(BahnsteigPackage.Literals.HAUPTZUGANG_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinksRechts createLage_Zum_Gleis_TypeFromString(EDataType eDataType, String initialValue) {
		return (ENUMLinksRechts)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLage_Zum_Gleis_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BahnsteigPackage getBahnsteigPackage() {
		return (BahnsteigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BahnsteigPackage getPackage() {
		return BahnsteigPackage.eINSTANCE;
	}

} //BahnsteigFactoryImpl
