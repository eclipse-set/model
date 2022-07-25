/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Medien_und_Trassen.impl;

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

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model1902.Medien_und_Trassen.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Medien_und_TrassenFactoryImpl extends EFactoryImpl implements Medien_und_TrassenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Medien_und_TrassenFactory init() {
		try {
			Medien_und_TrassenFactory theMedien_und_TrassenFactory = (Medien_und_TrassenFactory)EPackage.Registry.INSTANCE.getEFactory(Medien_und_TrassenPackage.eNS_URI);
			if (theMedien_und_TrassenFactory != null) {
				return theMedien_und_TrassenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Medien_und_TrassenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medien_und_TrassenFactoryImpl() {
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
			case Medien_und_TrassenPackage.ADER_DURCHMESSER_TYPE_CLASS: return createAder_Durchmesser_TypeClass();
			case Medien_und_TrassenPackage.ADER_QUERSCHNITT_TYPE_CLASS: return createAder_Querschnitt_TypeClass();
			case Medien_und_TrassenPackage.ADER_RESERVE_TYPE_CLASS: return createAder_Reserve_TypeClass();
			case Medien_und_TrassenPackage.ANZAHL_VERSEILELEMENTE_TYPE_CLASS: return createAnzahl_Verseilelemente_TypeClass();
			case Medien_und_TrassenPackage.BEZEICHNUNG_KABEL_TYPE_CLASS: return createBezeichnung_Kabel_TypeClass();
			case Medien_und_TrassenPackage.BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE_CLASS: return createBezeichnung_Kabel_Verteilpunkt_TypeClass();
			case Medien_und_TrassenPackage.KABEL: return createKabel();
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP: return createKabel_Allg_AttributeGroup();
			case Medien_und_TrassenPackage.KABEL_ART_TYPE_CLASS: return createKabel_Art_TypeClass();
			case Medien_und_TrassenPackage.KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP: return createKabel_Bezeichnung_AttributeGroup();
			case Medien_und_TrassenPackage.KABEL_LAENGE_TYPE_CLASS: return createKabel_Laenge_TypeClass();
			case Medien_und_TrassenPackage.KABEL_TYP_TYPE_CLASS: return createKabel_Typ_TypeClass();
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT: return createKabel_Verteilpunkt();
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_ART_TYPE_CLASS: return createKabel_Verteilpunkt_Art_TypeClass();
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP: return createKabel_Verteilpunkt_Bezeichnung_AttributeGroup();
			case Medien_und_TrassenPackage.TRASSE_KANTE: return createTrasse_Kante();
			case Medien_und_TrassenPackage.TRASSE_KANTE_ART_TYPE_CLASS: return createTrasse_Kante_Art_TypeClass();
			case Medien_und_TrassenPackage.TRASSE_KNOTEN: return createTrasse_Knoten();
			case Medien_und_TrassenPackage.TRASSE_KNOTEN_ART_TYPE_CLASS: return createTrasse_Knoten_Art_TypeClass();
			case Medien_und_TrassenPackage.TRASSE_NUTZER_TYPE_CLASS: return createTrasse_Nutzer_TypeClass();
			case Medien_und_TrassenPackage.VERSEILART_TYPE_CLASS: return createVerseilart_TypeClass();
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
			case Medien_und_TrassenPackage.ENUM_KABEL_ART:
				return createENUMKabelArtFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.ENUM_KABEL_VERTEILPUNKT_ART:
				return createENUMKabelVerteilpunktArtFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.ENUM_TRASSE_KANTE_ART:
				return createENUMTrasseKanteArtFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.ENUM_TRASSE_KNOTEN_ART:
				return createENUMTrasseKnotenArtFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.ENUM_TRASSE_NUTZER:
				return createENUMTrasseNutzerFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.ADER_DURCHMESSER_TYPE:
				return createAder_Durchmesser_TypeFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.ADER_QUERSCHNITT_TYPE:
				return createAder_Querschnitt_TypeFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.ADER_RESERVE_TYPE:
				return createAder_Reserve_TypeFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.ANZAHL_VERSEILELEMENTE_TYPE:
				return createAnzahl_Verseilelemente_TypeFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.BEZEICHNUNG_KABEL_TYPE:
				return createBezeichnung_Kabel_TypeFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE:
				return createBezeichnung_Kabel_Verteilpunkt_TypeFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.ENUM_KABEL_ART_OBJECT:
				return createENUMKabelArtObjectFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.ENUM_KABEL_VERTEILPUNKT_ART_OBJECT:
				return createENUMKabelVerteilpunktArtObjectFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.ENUM_TRASSE_KANTE_ART_OBJECT:
				return createENUMTrasseKanteArtObjectFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.ENUM_TRASSE_KNOTEN_ART_OBJECT:
				return createENUMTrasseKnotenArtObjectFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.ENUM_TRASSE_NUTZER_OBJECT:
				return createENUMTrasseNutzerObjectFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.KABEL_LAENGE_TYPE:
				return createKabel_Laenge_TypeFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.KABEL_TYP_TYPE:
				return createKabel_Typ_TypeFromString(eDataType, initialValue);
			case Medien_und_TrassenPackage.VERSEILART_TYPE:
				return createVerseilart_TypeFromString(eDataType, initialValue);
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
			case Medien_und_TrassenPackage.ENUM_KABEL_ART:
				return convertENUMKabelArtToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.ENUM_KABEL_VERTEILPUNKT_ART:
				return convertENUMKabelVerteilpunktArtToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.ENUM_TRASSE_KANTE_ART:
				return convertENUMTrasseKanteArtToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.ENUM_TRASSE_KNOTEN_ART:
				return convertENUMTrasseKnotenArtToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.ENUM_TRASSE_NUTZER:
				return convertENUMTrasseNutzerToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.ADER_DURCHMESSER_TYPE:
				return convertAder_Durchmesser_TypeToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.ADER_QUERSCHNITT_TYPE:
				return convertAder_Querschnitt_TypeToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.ADER_RESERVE_TYPE:
				return convertAder_Reserve_TypeToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.ANZAHL_VERSEILELEMENTE_TYPE:
				return convertAnzahl_Verseilelemente_TypeToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.BEZEICHNUNG_KABEL_TYPE:
				return convertBezeichnung_Kabel_TypeToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE:
				return convertBezeichnung_Kabel_Verteilpunkt_TypeToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.ENUM_KABEL_ART_OBJECT:
				return convertENUMKabelArtObjectToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.ENUM_KABEL_VERTEILPUNKT_ART_OBJECT:
				return convertENUMKabelVerteilpunktArtObjectToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.ENUM_TRASSE_KANTE_ART_OBJECT:
				return convertENUMTrasseKanteArtObjectToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.ENUM_TRASSE_KNOTEN_ART_OBJECT:
				return convertENUMTrasseKnotenArtObjectToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.ENUM_TRASSE_NUTZER_OBJECT:
				return convertENUMTrasseNutzerObjectToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.KABEL_LAENGE_TYPE:
				return convertKabel_Laenge_TypeToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.KABEL_TYP_TYPE:
				return convertKabel_Typ_TypeToString(eDataType, instanceValue);
			case Medien_und_TrassenPackage.VERSEILART_TYPE:
				return convertVerseilart_TypeToString(eDataType, instanceValue);
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
	public Ader_Durchmesser_TypeClass createAder_Durchmesser_TypeClass() {
		Ader_Durchmesser_TypeClassImpl ader_Durchmesser_TypeClass = new Ader_Durchmesser_TypeClassImpl();
		return ader_Durchmesser_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ader_Querschnitt_TypeClass createAder_Querschnitt_TypeClass() {
		Ader_Querschnitt_TypeClassImpl ader_Querschnitt_TypeClass = new Ader_Querschnitt_TypeClassImpl();
		return ader_Querschnitt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ader_Reserve_TypeClass createAder_Reserve_TypeClass() {
		Ader_Reserve_TypeClassImpl ader_Reserve_TypeClass = new Ader_Reserve_TypeClassImpl();
		return ader_Reserve_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anzahl_Verseilelemente_TypeClass createAnzahl_Verseilelemente_TypeClass() {
		Anzahl_Verseilelemente_TypeClassImpl anzahl_Verseilelemente_TypeClass = new Anzahl_Verseilelemente_TypeClassImpl();
		return anzahl_Verseilelemente_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Kabel_TypeClass createBezeichnung_Kabel_TypeClass() {
		Bezeichnung_Kabel_TypeClassImpl bezeichnung_Kabel_TypeClass = new Bezeichnung_Kabel_TypeClassImpl();
		return bezeichnung_Kabel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Kabel_Verteilpunkt_TypeClass createBezeichnung_Kabel_Verteilpunkt_TypeClass() {
		Bezeichnung_Kabel_Verteilpunkt_TypeClassImpl bezeichnung_Kabel_Verteilpunkt_TypeClass = new Bezeichnung_Kabel_Verteilpunkt_TypeClassImpl();
		return bezeichnung_Kabel_Verteilpunkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel createKabel() {
		KabelImpl kabel = new KabelImpl();
		return kabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Allg_AttributeGroup createKabel_Allg_AttributeGroup() {
		Kabel_Allg_AttributeGroupImpl kabel_Allg_AttributeGroup = new Kabel_Allg_AttributeGroupImpl();
		return kabel_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Art_TypeClass createKabel_Art_TypeClass() {
		Kabel_Art_TypeClassImpl kabel_Art_TypeClass = new Kabel_Art_TypeClassImpl();
		return kabel_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Bezeichnung_AttributeGroup createKabel_Bezeichnung_AttributeGroup() {
		Kabel_Bezeichnung_AttributeGroupImpl kabel_Bezeichnung_AttributeGroup = new Kabel_Bezeichnung_AttributeGroupImpl();
		return kabel_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Laenge_TypeClass createKabel_Laenge_TypeClass() {
		Kabel_Laenge_TypeClassImpl kabel_Laenge_TypeClass = new Kabel_Laenge_TypeClassImpl();
		return kabel_Laenge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Typ_TypeClass createKabel_Typ_TypeClass() {
		Kabel_Typ_TypeClassImpl kabel_Typ_TypeClass = new Kabel_Typ_TypeClassImpl();
		return kabel_Typ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Verteilpunkt createKabel_Verteilpunkt() {
		Kabel_VerteilpunktImpl kabel_Verteilpunkt = new Kabel_VerteilpunktImpl();
		return kabel_Verteilpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Verteilpunkt_Art_TypeClass createKabel_Verteilpunkt_Art_TypeClass() {
		Kabel_Verteilpunkt_Art_TypeClassImpl kabel_Verteilpunkt_Art_TypeClass = new Kabel_Verteilpunkt_Art_TypeClassImpl();
		return kabel_Verteilpunkt_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Verteilpunkt_Bezeichnung_AttributeGroup createKabel_Verteilpunkt_Bezeichnung_AttributeGroup() {
		Kabel_Verteilpunkt_Bezeichnung_AttributeGroupImpl kabel_Verteilpunkt_Bezeichnung_AttributeGroup = new Kabel_Verteilpunkt_Bezeichnung_AttributeGroupImpl();
		return kabel_Verteilpunkt_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trasse_Kante createTrasse_Kante() {
		Trasse_KanteImpl trasse_Kante = new Trasse_KanteImpl();
		return trasse_Kante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trasse_Kante_Art_TypeClass createTrasse_Kante_Art_TypeClass() {
		Trasse_Kante_Art_TypeClassImpl trasse_Kante_Art_TypeClass = new Trasse_Kante_Art_TypeClassImpl();
		return trasse_Kante_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trasse_Knoten createTrasse_Knoten() {
		Trasse_KnotenImpl trasse_Knoten = new Trasse_KnotenImpl();
		return trasse_Knoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trasse_Knoten_Art_TypeClass createTrasse_Knoten_Art_TypeClass() {
		Trasse_Knoten_Art_TypeClassImpl trasse_Knoten_Art_TypeClass = new Trasse_Knoten_Art_TypeClassImpl();
		return trasse_Knoten_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trasse_Nutzer_TypeClass createTrasse_Nutzer_TypeClass() {
		Trasse_Nutzer_TypeClassImpl trasse_Nutzer_TypeClass = new Trasse_Nutzer_TypeClassImpl();
		return trasse_Nutzer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verseilart_TypeClass createVerseilart_TypeClass() {
		Verseilart_TypeClassImpl verseilart_TypeClass = new Verseilart_TypeClassImpl();
		return verseilart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMKabelArt createENUMKabelArtFromString(EDataType eDataType, String initialValue) {
		ENUMKabelArt result = ENUMKabelArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMKabelArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMKabelVerteilpunktArt createENUMKabelVerteilpunktArtFromString(EDataType eDataType, String initialValue) {
		ENUMKabelVerteilpunktArt result = ENUMKabelVerteilpunktArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMKabelVerteilpunktArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTrasseKanteArt createENUMTrasseKanteArtFromString(EDataType eDataType, String initialValue) {
		ENUMTrasseKanteArt result = ENUMTrasseKanteArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTrasseKanteArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTrasseKnotenArt createENUMTrasseKnotenArtFromString(EDataType eDataType, String initialValue) {
		ENUMTrasseKnotenArt result = ENUMTrasseKnotenArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTrasseKnotenArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTrasseNutzer createENUMTrasseNutzerFromString(EDataType eDataType, String initialValue) {
		ENUMTrasseNutzer result = ENUMTrasseNutzer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTrasseNutzerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAder_Durchmesser_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAder_Durchmesser_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAder_Querschnitt_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAder_Querschnitt_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createAder_Reserve_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAder_Reserve_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createAnzahl_Verseilelemente_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnzahl_Verseilelemente_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Kabel_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Kabel_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Kabel_Verteilpunkt_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Kabel_Verteilpunkt_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMKabelArt createENUMKabelArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMKabelArtFromString(Medien_und_TrassenPackage.Literals.ENUM_KABEL_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMKabelArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMKabelArtToString(Medien_und_TrassenPackage.Literals.ENUM_KABEL_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMKabelVerteilpunktArt createENUMKabelVerteilpunktArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMKabelVerteilpunktArtFromString(Medien_und_TrassenPackage.Literals.ENUM_KABEL_VERTEILPUNKT_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMKabelVerteilpunktArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMKabelVerteilpunktArtToString(Medien_und_TrassenPackage.Literals.ENUM_KABEL_VERTEILPUNKT_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTrasseKanteArt createENUMTrasseKanteArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMTrasseKanteArtFromString(Medien_und_TrassenPackage.Literals.ENUM_TRASSE_KANTE_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTrasseKanteArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMTrasseKanteArtToString(Medien_und_TrassenPackage.Literals.ENUM_TRASSE_KANTE_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTrasseKnotenArt createENUMTrasseKnotenArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMTrasseKnotenArtFromString(Medien_und_TrassenPackage.Literals.ENUM_TRASSE_KNOTEN_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTrasseKnotenArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMTrasseKnotenArtToString(Medien_und_TrassenPackage.Literals.ENUM_TRASSE_KNOTEN_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTrasseNutzer createENUMTrasseNutzerObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMTrasseNutzerFromString(Medien_und_TrassenPackage.Literals.ENUM_TRASSE_NUTZER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTrasseNutzerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMTrasseNutzerToString(Medien_und_TrassenPackage.Literals.ENUM_TRASSE_NUTZER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createKabel_Laenge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKabel_Laenge_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKabel_Typ_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKabel_Typ_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVerseilart_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerseilart_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Medien_und_TrassenPackage getMedien_und_TrassenPackage() {
		return (Medien_und_TrassenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Medien_und_TrassenPackage getPackage() {
		return Medien_und_TrassenPackage.eINSTANCE;
	}

} //Medien_und_TrassenFactoryImpl
