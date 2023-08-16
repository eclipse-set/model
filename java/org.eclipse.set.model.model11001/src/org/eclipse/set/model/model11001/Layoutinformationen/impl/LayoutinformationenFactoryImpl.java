/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Layoutinformationen.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.set.model.model11001.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model11001.Layoutinformationen.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutinformationenFactoryImpl extends EFactoryImpl implements LayoutinformationenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutinformationenFactory init() {
		try {
			LayoutinformationenFactory theLayoutinformationenFactory = (LayoutinformationenFactory)EPackage.Registry.INSTANCE.getEFactory(LayoutinformationenPackage.eNS_URI);
			if (theLayoutinformationenFactory != null) {
				return theLayoutinformationenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LayoutinformationenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutinformationenFactoryImpl() {
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
			case LayoutinformationenPackage.BEZ_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS: return createBez_Lageplan_Blattschnitt_TypeClass();
			case LayoutinformationenPackage.BEZEICHNUNG_LAGEPLAN_TYPE_CLASS: return createBezeichnung_Lageplan_TypeClass();
			case LayoutinformationenPackage.DARSTELLUNG_GEO_PUNKT_TYPE_CLASS: return createDarstellung_GEO_Punkt_TypeClass();
			case LayoutinformationenPackage.DARSTELLUNG_POLYGONZUG_TYPE_CLASS: return createDarstellung_Polygonzug_TypeClass();
			case LayoutinformationenPackage.DARSTELLUNG_RICHTUNGSWINKEL_TYPE_CLASS: return createDarstellung_Richtungswinkel_TypeClass();
			case LayoutinformationenPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case LayoutinformationenPackage.ELEMENT_POSITION: return createElement_Position();
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP: return createElement_Position_Allg_AttributeGroup();
			case LayoutinformationenPackage.ELEMENT_STIL: return createElement_Stil();
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP: return createElement_Stil_Allg_AttributeGroup();
			case LayoutinformationenPackage.FUELLUNG_TYPE_CLASS: return createFuellung_TypeClass();
			case LayoutinformationenPackage.LAGEPLAN: return createLageplan();
			case LayoutinformationenPackage.LAGEPLAN_ART_TYPE_CLASS: return createLageplan_Art_TypeClass();
			case LayoutinformationenPackage.LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP: return createLageplan_Bezeichnung_AttributeGroup();
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT: return createLageplan_Blattschnitt();
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP: return createLageplan_Blattschnitt_Bezeichnung_AttributeGroup();
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND: return createLageplan_Zustand();
			case LayoutinformationenPackage.LINIE_ART_TYPE_CLASS: return createLinie_Art_TypeClass();
			case LayoutinformationenPackage.LINIE_FARBWERT_TYPE_CLASS: return createLinie_Farbwert_TypeClass();
			case LayoutinformationenPackage.LINIE_SUBART_TYPE_CLASS: return createLinie_Subart_TypeClass();
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO: return createPlanPro_Layoutinfo();
			case LayoutinformationenPackage.POLYGONZUG_AUSRICHTUNG_TYPE_CLASS: return createPolygonzug_Ausrichtung_TypeClass();
			case LayoutinformationenPackage.POLYGONZUG_BLATTSCHNITT_TYPE_CLASS: return createPolygonzug_Blattschnitt_TypeClass();
			case LayoutinformationenPackage.REFERENZ_LST_ZUSTAND_TYPE_CLASS: return createReferenz_LST_Zustand_TypeClass();
			case LayoutinformationenPackage.REFERENZ_OBJEKT_DARSTELLUNG_TYPE_CLASS: return createReferenz_Objekt_Darstellung_TypeClass();
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
			case LayoutinformationenPackage.ENUM_FUELLUNG:
				return createENUMFuellungFromString(eDataType, initialValue);
			case LayoutinformationenPackage.ENUM_LAGEPLAN_ART:
				return createENUMLageplanArtFromString(eDataType, initialValue);
			case LayoutinformationenPackage.ENUM_LINIE_ART:
				return createENUMLinieArtFromString(eDataType, initialValue);
			case LayoutinformationenPackage.ENUM_LINIE_SUBART:
				return createENUMLinieSubartFromString(eDataType, initialValue);
			case LayoutinformationenPackage.BEZ_LAGEPLAN_BLATTSCHNITT_TYPE:
				return createBez_Lageplan_Blattschnitt_TypeFromString(eDataType, initialValue);
			case LayoutinformationenPackage.BEZEICHNUNG_LAGEPLAN_TYPE:
				return createBezeichnung_Lageplan_TypeFromString(eDataType, initialValue);
			case LayoutinformationenPackage.DARSTELLUNG_GEO_PUNKT_TYPE:
				return createDarstellung_GEO_Punkt_TypeFromString(eDataType, initialValue);
			case LayoutinformationenPackage.DARSTELLUNG_POLYGONZUG_TYPE:
				return createDarstellung_Polygonzug_TypeFromString(eDataType, initialValue);
			case LayoutinformationenPackage.DARSTELLUNG_RICHTUNGSWINKEL_TYPE:
				return createDarstellung_Richtungswinkel_TypeFromString(eDataType, initialValue);
			case LayoutinformationenPackage.ENUM_FUELLUNG_OBJECT:
				return createENUMFuellungObjectFromString(eDataType, initialValue);
			case LayoutinformationenPackage.ENUM_LAGEPLAN_ART_OBJECT:
				return createENUMLageplanArtObjectFromString(eDataType, initialValue);
			case LayoutinformationenPackage.ENUM_LINIE_ART_OBJECT:
				return createENUMLinieArtObjectFromString(eDataType, initialValue);
			case LayoutinformationenPackage.ENUM_LINIE_SUBART_OBJECT:
				return createENUMLinieSubartObjectFromString(eDataType, initialValue);
			case LayoutinformationenPackage.LINIE_FARBWERT_TYPE:
				return createLinie_Farbwert_TypeFromString(eDataType, initialValue);
			case LayoutinformationenPackage.POLYGONZUG_AUSRICHTUNG_TYPE:
				return createPolygonzug_Ausrichtung_TypeFromString(eDataType, initialValue);
			case LayoutinformationenPackage.POLYGONZUG_BLATTSCHNITT_TYPE:
				return createPolygonzug_Blattschnitt_TypeFromString(eDataType, initialValue);
			case LayoutinformationenPackage.REFERENZ_LST_ZUSTAND_TYPE:
				return createReferenz_LST_Zustand_TypeFromString(eDataType, initialValue);
			case LayoutinformationenPackage.REFERENZ_OBJEKT_DARSTELLUNG_TYPE:
				return createReferenz_Objekt_Darstellung_TypeFromString(eDataType, initialValue);
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
			case LayoutinformationenPackage.ENUM_FUELLUNG:
				return convertENUMFuellungToString(eDataType, instanceValue);
			case LayoutinformationenPackage.ENUM_LAGEPLAN_ART:
				return convertENUMLageplanArtToString(eDataType, instanceValue);
			case LayoutinformationenPackage.ENUM_LINIE_ART:
				return convertENUMLinieArtToString(eDataType, instanceValue);
			case LayoutinformationenPackage.ENUM_LINIE_SUBART:
				return convertENUMLinieSubartToString(eDataType, instanceValue);
			case LayoutinformationenPackage.BEZ_LAGEPLAN_BLATTSCHNITT_TYPE:
				return convertBez_Lageplan_Blattschnitt_TypeToString(eDataType, instanceValue);
			case LayoutinformationenPackage.BEZEICHNUNG_LAGEPLAN_TYPE:
				return convertBezeichnung_Lageplan_TypeToString(eDataType, instanceValue);
			case LayoutinformationenPackage.DARSTELLUNG_GEO_PUNKT_TYPE:
				return convertDarstellung_GEO_Punkt_TypeToString(eDataType, instanceValue);
			case LayoutinformationenPackage.DARSTELLUNG_POLYGONZUG_TYPE:
				return convertDarstellung_Polygonzug_TypeToString(eDataType, instanceValue);
			case LayoutinformationenPackage.DARSTELLUNG_RICHTUNGSWINKEL_TYPE:
				return convertDarstellung_Richtungswinkel_TypeToString(eDataType, instanceValue);
			case LayoutinformationenPackage.ENUM_FUELLUNG_OBJECT:
				return convertENUMFuellungObjectToString(eDataType, instanceValue);
			case LayoutinformationenPackage.ENUM_LAGEPLAN_ART_OBJECT:
				return convertENUMLageplanArtObjectToString(eDataType, instanceValue);
			case LayoutinformationenPackage.ENUM_LINIE_ART_OBJECT:
				return convertENUMLinieArtObjectToString(eDataType, instanceValue);
			case LayoutinformationenPackage.ENUM_LINIE_SUBART_OBJECT:
				return convertENUMLinieSubartObjectToString(eDataType, instanceValue);
			case LayoutinformationenPackage.LINIE_FARBWERT_TYPE:
				return convertLinie_Farbwert_TypeToString(eDataType, instanceValue);
			case LayoutinformationenPackage.POLYGONZUG_AUSRICHTUNG_TYPE:
				return convertPolygonzug_Ausrichtung_TypeToString(eDataType, instanceValue);
			case LayoutinformationenPackage.POLYGONZUG_BLATTSCHNITT_TYPE:
				return convertPolygonzug_Blattschnitt_TypeToString(eDataType, instanceValue);
			case LayoutinformationenPackage.REFERENZ_LST_ZUSTAND_TYPE:
				return convertReferenz_LST_Zustand_TypeToString(eDataType, instanceValue);
			case LayoutinformationenPackage.REFERENZ_OBJEKT_DARSTELLUNG_TYPE:
				return convertReferenz_Objekt_Darstellung_TypeToString(eDataType, instanceValue);
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
	public Bez_Lageplan_Blattschnitt_TypeClass createBez_Lageplan_Blattschnitt_TypeClass() {
		Bez_Lageplan_Blattschnitt_TypeClassImpl bez_Lageplan_Blattschnitt_TypeClass = new Bez_Lageplan_Blattschnitt_TypeClassImpl();
		return bez_Lageplan_Blattschnitt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Lageplan_TypeClass createBezeichnung_Lageplan_TypeClass() {
		Bezeichnung_Lageplan_TypeClassImpl bezeichnung_Lageplan_TypeClass = new Bezeichnung_Lageplan_TypeClassImpl();
		return bezeichnung_Lageplan_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Darstellung_GEO_Punkt_TypeClass createDarstellung_GEO_Punkt_TypeClass() {
		Darstellung_GEO_Punkt_TypeClassImpl darstellung_GEO_Punkt_TypeClass = new Darstellung_GEO_Punkt_TypeClassImpl();
		return darstellung_GEO_Punkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Darstellung_Polygonzug_TypeClass createDarstellung_Polygonzug_TypeClass() {
		Darstellung_Polygonzug_TypeClassImpl darstellung_Polygonzug_TypeClass = new Darstellung_Polygonzug_TypeClassImpl();
		return darstellung_Polygonzug_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Darstellung_Richtungswinkel_TypeClass createDarstellung_Richtungswinkel_TypeClass() {
		Darstellung_Richtungswinkel_TypeClassImpl darstellung_Richtungswinkel_TypeClass = new Darstellung_Richtungswinkel_TypeClassImpl();
		return darstellung_Richtungswinkel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element_Position createElement_Position() {
		Element_PositionImpl element_Position = new Element_PositionImpl();
		return element_Position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element_Position_Allg_AttributeGroup createElement_Position_Allg_AttributeGroup() {
		Element_Position_Allg_AttributeGroupImpl element_Position_Allg_AttributeGroup = new Element_Position_Allg_AttributeGroupImpl();
		return element_Position_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element_Stil createElement_Stil() {
		Element_StilImpl element_Stil = new Element_StilImpl();
		return element_Stil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element_Stil_Allg_AttributeGroup createElement_Stil_Allg_AttributeGroup() {
		Element_Stil_Allg_AttributeGroupImpl element_Stil_Allg_AttributeGroup = new Element_Stil_Allg_AttributeGroupImpl();
		return element_Stil_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fuellung_TypeClass createFuellung_TypeClass() {
		Fuellung_TypeClassImpl fuellung_TypeClass = new Fuellung_TypeClassImpl();
		return fuellung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lageplan createLageplan() {
		LageplanImpl lageplan = new LageplanImpl();
		return lageplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lageplan_Art_TypeClass createLageplan_Art_TypeClass() {
		Lageplan_Art_TypeClassImpl lageplan_Art_TypeClass = new Lageplan_Art_TypeClassImpl();
		return lageplan_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lageplan_Bezeichnung_AttributeGroup createLageplan_Bezeichnung_AttributeGroup() {
		Lageplan_Bezeichnung_AttributeGroupImpl lageplan_Bezeichnung_AttributeGroup = new Lageplan_Bezeichnung_AttributeGroupImpl();
		return lageplan_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lageplan_Blattschnitt createLageplan_Blattschnitt() {
		Lageplan_BlattschnittImpl lageplan_Blattschnitt = new Lageplan_BlattschnittImpl();
		return lageplan_Blattschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lageplan_Blattschnitt_Bezeichnung_AttributeGroup createLageplan_Blattschnitt_Bezeichnung_AttributeGroup() {
		Lageplan_Blattschnitt_Bezeichnung_AttributeGroupImpl lageplan_Blattschnitt_Bezeichnung_AttributeGroup = new Lageplan_Blattschnitt_Bezeichnung_AttributeGroupImpl();
		return lageplan_Blattschnitt_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lageplan_Zustand createLageplan_Zustand() {
		Lageplan_ZustandImpl lageplan_Zustand = new Lageplan_ZustandImpl();
		return lageplan_Zustand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Linie_Art_TypeClass createLinie_Art_TypeClass() {
		Linie_Art_TypeClassImpl linie_Art_TypeClass = new Linie_Art_TypeClassImpl();
		return linie_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Linie_Farbwert_TypeClass createLinie_Farbwert_TypeClass() {
		Linie_Farbwert_TypeClassImpl linie_Farbwert_TypeClass = new Linie_Farbwert_TypeClassImpl();
		return linie_Farbwert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Linie_Subart_TypeClass createLinie_Subart_TypeClass() {
		Linie_Subart_TypeClassImpl linie_Subart_TypeClass = new Linie_Subart_TypeClassImpl();
		return linie_Subart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanPro_Layoutinfo createPlanPro_Layoutinfo() {
		PlanPro_LayoutinfoImpl planPro_Layoutinfo = new PlanPro_LayoutinfoImpl();
		return planPro_Layoutinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Polygonzug_Ausrichtung_TypeClass createPolygonzug_Ausrichtung_TypeClass() {
		Polygonzug_Ausrichtung_TypeClassImpl polygonzug_Ausrichtung_TypeClass = new Polygonzug_Ausrichtung_TypeClassImpl();
		return polygonzug_Ausrichtung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Polygonzug_Blattschnitt_TypeClass createPolygonzug_Blattschnitt_TypeClass() {
		Polygonzug_Blattschnitt_TypeClassImpl polygonzug_Blattschnitt_TypeClass = new Polygonzug_Blattschnitt_TypeClassImpl();
		return polygonzug_Blattschnitt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Referenz_LST_Zustand_TypeClass createReferenz_LST_Zustand_TypeClass() {
		Referenz_LST_Zustand_TypeClassImpl referenz_LST_Zustand_TypeClass = new Referenz_LST_Zustand_TypeClassImpl();
		return referenz_LST_Zustand_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Referenz_Objekt_Darstellung_TypeClass createReferenz_Objekt_Darstellung_TypeClass() {
		Referenz_Objekt_Darstellung_TypeClassImpl referenz_Objekt_Darstellung_TypeClass = new Referenz_Objekt_Darstellung_TypeClassImpl();
		return referenz_Objekt_Darstellung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFuellung createENUMFuellungFromString(EDataType eDataType, String initialValue) {
		ENUMFuellung result = ENUMFuellung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFuellungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLageplanArt createENUMLageplanArtFromString(EDataType eDataType, String initialValue) {
		ENUMLageplanArt result = ENUMLageplanArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLageplanArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinieArt createENUMLinieArtFromString(EDataType eDataType, String initialValue) {
		ENUMLinieArt result = ENUMLinieArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLinieArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinieSubart createENUMLinieSubartFromString(EDataType eDataType, String initialValue) {
		ENUMLinieSubart result = ENUMLinieSubart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLinieSubartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createBez_Lageplan_Blattschnitt_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBez_Lageplan_Blattschnitt_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Lageplan_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Lageplan_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDarstellung_GEO_Punkt_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDarstellung_GEO_Punkt_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDarstellung_Polygonzug_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDarstellung_Polygonzug_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDarstellung_Richtungswinkel_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDarstellung_Richtungswinkel_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFuellung createENUMFuellungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFuellungFromString(LayoutinformationenPackage.Literals.ENUM_FUELLUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFuellungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFuellungToString(LayoutinformationenPackage.Literals.ENUM_FUELLUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLageplanArt createENUMLageplanArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMLageplanArtFromString(LayoutinformationenPackage.Literals.ENUM_LAGEPLAN_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLageplanArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMLageplanArtToString(LayoutinformationenPackage.Literals.ENUM_LAGEPLAN_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinieArt createENUMLinieArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMLinieArtFromString(LayoutinformationenPackage.Literals.ENUM_LINIE_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLinieArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMLinieArtToString(LayoutinformationenPackage.Literals.ENUM_LINIE_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinieSubart createENUMLinieSubartObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMLinieSubartFromString(LayoutinformationenPackage.Literals.ENUM_LINIE_SUBART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLinieSubartObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMLinieSubartToString(LayoutinformationenPackage.Literals.ENUM_LINIE_SUBART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLinie_Farbwert_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinie_Farbwert_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPolygonzug_Ausrichtung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolygonzug_Ausrichtung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPolygonzug_Blattschnitt_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolygonzug_Blattschnitt_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createReferenz_LST_Zustand_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GUID_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenz_LST_Zustand_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GUID_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createReferenz_Objekt_Darstellung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GUID_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenz_Objekt_Darstellung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GUID_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayoutinformationenPackage getLayoutinformationenPackage() {
		return (LayoutinformationenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LayoutinformationenPackage getPackage() {
		return LayoutinformationenPackage.eINSTANCE;
	}

} //LayoutinformationenFactoryImpl
