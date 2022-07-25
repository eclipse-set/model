/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Gleis.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model1902.Gleis.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GleisFactoryImpl extends EFactoryImpl implements GleisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GleisFactory init() {
		try {
			GleisFactory theGleisFactory = (GleisFactory)EPackage.Registry.INSTANCE.getEFactory(GleisPackage.eNS_URI);
			if (theGleisFactory != null) {
				return theGleisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GleisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GleisFactoryImpl() {
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
			case GleisPackage.BAUBEREICH_ART_TYPE_CLASS: return createBaubereich_Art_TypeClass();
			case GleisPackage.BEZ_GLEIS_BEZEICHNUNG_TYPE_CLASS: return createBez_Gleis_Bezeichnung_TypeClass();
			case GleisPackage.FAHRSTROM_TYPE_CLASS: return createFahrstrom_TypeClass();
			case GleisPackage.GESCHWINDIGKEIT_TYPE_CLASS: return createGeschwindigkeit_TypeClass();
			case GleisPackage.GLEIS_ABSCHNITT: return createGleis_Abschnitt();
			case GleisPackage.GLEIS_ART: return createGleis_Art();
			case GleisPackage.GLEIS_BAUBEREICH: return createGleis_Baubereich();
			case GleisPackage.GLEIS_BEZEICHNUNG: return createGleis_Bezeichnung();
			case GleisPackage.GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP: return createGleis_Bezeichnung_Bezeichnung_AttributeGroup();
			case GleisPackage.GLEIS_FAHRBAHN: return createGleis_Fahrbahn();
			case GleisPackage.GLEIS_LICHTRAUM: return createGleis_Lichtraum();
			case GleisPackage.GLEIS_SCHALTGRUPPE: return createGleis_Schaltgruppe();
			case GleisPackage.GLEISART_TYPE_CLASS: return createGleisart_TypeClass();
			case GleisPackage.KONSTRUKTION_TYPE_CLASS: return createKonstruktion_TypeClass();
			case GleisPackage.LICHTRAUMPROFIL_TYPE_CLASS: return createLichtraumprofil_TypeClass();
			case GleisPackage.NUTZUNG_GUETERZUG_TYPE_CLASS: return createNutzung_Gueterzug_TypeClass();
			case GleisPackage.NUTZUNG_RANGIER_TYPE_CLASS: return createNutzung_Rangier_TypeClass();
			case GleisPackage.NUTZUNG_REISEZUG_TYPE_CLASS: return createNutzung_Reisezug_TypeClass();
			case GleisPackage.NUTZUNG_SBAHN_TYPE_CLASS: return createNutzung_SBahn_TypeClass();
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
			case GleisPackage.ENUM_BAUBEREICH_ART:
				return createENUMBaubereichArtFromString(eDataType, initialValue);
			case GleisPackage.ENUM_GLEISART:
				return createENUMGleisartFromString(eDataType, initialValue);
			case GleisPackage.ENUM_KONSTRUKTION:
				return createENUMKonstruktionFromString(eDataType, initialValue);
			case GleisPackage.ENUM_LICHTRAUMPROFIL:
				return createENUMLichtraumprofilFromString(eDataType, initialValue);
			case GleisPackage.BEZ_GLEIS_BEZEICHNUNG_TYPE:
				return createBez_Gleis_Bezeichnung_TypeFromString(eDataType, initialValue);
			case GleisPackage.ENUM_BAUBEREICH_ART_OBJECT:
				return createENUMBaubereichArtObjectFromString(eDataType, initialValue);
			case GleisPackage.ENUM_GLEISART_OBJECT:
				return createENUMGleisartObjectFromString(eDataType, initialValue);
			case GleisPackage.ENUM_KONSTRUKTION_OBJECT:
				return createENUMKonstruktionObjectFromString(eDataType, initialValue);
			case GleisPackage.ENUM_LICHTRAUMPROFIL_OBJECT:
				return createENUMLichtraumprofilObjectFromString(eDataType, initialValue);
			case GleisPackage.GESCHWINDIGKEIT_TYPE:
				return createGeschwindigkeit_TypeFromString(eDataType, initialValue);
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
			case GleisPackage.ENUM_BAUBEREICH_ART:
				return convertENUMBaubereichArtToString(eDataType, instanceValue);
			case GleisPackage.ENUM_GLEISART:
				return convertENUMGleisartToString(eDataType, instanceValue);
			case GleisPackage.ENUM_KONSTRUKTION:
				return convertENUMKonstruktionToString(eDataType, instanceValue);
			case GleisPackage.ENUM_LICHTRAUMPROFIL:
				return convertENUMLichtraumprofilToString(eDataType, instanceValue);
			case GleisPackage.BEZ_GLEIS_BEZEICHNUNG_TYPE:
				return convertBez_Gleis_Bezeichnung_TypeToString(eDataType, instanceValue);
			case GleisPackage.ENUM_BAUBEREICH_ART_OBJECT:
				return convertENUMBaubereichArtObjectToString(eDataType, instanceValue);
			case GleisPackage.ENUM_GLEISART_OBJECT:
				return convertENUMGleisartObjectToString(eDataType, instanceValue);
			case GleisPackage.ENUM_KONSTRUKTION_OBJECT:
				return convertENUMKonstruktionObjectToString(eDataType, instanceValue);
			case GleisPackage.ENUM_LICHTRAUMPROFIL_OBJECT:
				return convertENUMLichtraumprofilObjectToString(eDataType, instanceValue);
			case GleisPackage.GESCHWINDIGKEIT_TYPE:
				return convertGeschwindigkeit_TypeToString(eDataType, instanceValue);
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
	public Baubereich_Art_TypeClass createBaubereich_Art_TypeClass() {
		Baubereich_Art_TypeClassImpl baubereich_Art_TypeClass = new Baubereich_Art_TypeClassImpl();
		return baubereich_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Gleis_Bezeichnung_TypeClass createBez_Gleis_Bezeichnung_TypeClass() {
		Bez_Gleis_Bezeichnung_TypeClassImpl bez_Gleis_Bezeichnung_TypeClass = new Bez_Gleis_Bezeichnung_TypeClassImpl();
		return bez_Gleis_Bezeichnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fahrstrom_TypeClass createFahrstrom_TypeClass() {
		Fahrstrom_TypeClassImpl fahrstrom_TypeClass = new Fahrstrom_TypeClassImpl();
		return fahrstrom_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschwindigkeit_TypeClass createGeschwindigkeit_TypeClass() {
		Geschwindigkeit_TypeClassImpl geschwindigkeit_TypeClass = new Geschwindigkeit_TypeClassImpl();
		return geschwindigkeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Abschnitt createGleis_Abschnitt() {
		Gleis_AbschnittImpl gleis_Abschnitt = new Gleis_AbschnittImpl();
		return gleis_Abschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Art createGleis_Art() {
		Gleis_ArtImpl gleis_Art = new Gleis_ArtImpl();
		return gleis_Art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Baubereich createGleis_Baubereich() {
		Gleis_BaubereichImpl gleis_Baubereich = new Gleis_BaubereichImpl();
		return gleis_Baubereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Bezeichnung createGleis_Bezeichnung() {
		Gleis_BezeichnungImpl gleis_Bezeichnung = new Gleis_BezeichnungImpl();
		return gleis_Bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Bezeichnung_Bezeichnung_AttributeGroup createGleis_Bezeichnung_Bezeichnung_AttributeGroup() {
		Gleis_Bezeichnung_Bezeichnung_AttributeGroupImpl gleis_Bezeichnung_Bezeichnung_AttributeGroup = new Gleis_Bezeichnung_Bezeichnung_AttributeGroupImpl();
		return gleis_Bezeichnung_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Fahrbahn createGleis_Fahrbahn() {
		Gleis_FahrbahnImpl gleis_Fahrbahn = new Gleis_FahrbahnImpl();
		return gleis_Fahrbahn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Lichtraum createGleis_Lichtraum() {
		Gleis_LichtraumImpl gleis_Lichtraum = new Gleis_LichtraumImpl();
		return gleis_Lichtraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Schaltgruppe createGleis_Schaltgruppe() {
		Gleis_SchaltgruppeImpl gleis_Schaltgruppe = new Gleis_SchaltgruppeImpl();
		return gleis_Schaltgruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleisart_TypeClass createGleisart_TypeClass() {
		Gleisart_TypeClassImpl gleisart_TypeClass = new Gleisart_TypeClassImpl();
		return gleisart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Konstruktion_TypeClass createKonstruktion_TypeClass() {
		Konstruktion_TypeClassImpl konstruktion_TypeClass = new Konstruktion_TypeClassImpl();
		return konstruktion_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lichtraumprofil_TypeClass createLichtraumprofil_TypeClass() {
		Lichtraumprofil_TypeClassImpl lichtraumprofil_TypeClass = new Lichtraumprofil_TypeClassImpl();
		return lichtraumprofil_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nutzung_Gueterzug_TypeClass createNutzung_Gueterzug_TypeClass() {
		Nutzung_Gueterzug_TypeClassImpl nutzung_Gueterzug_TypeClass = new Nutzung_Gueterzug_TypeClassImpl();
		return nutzung_Gueterzug_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nutzung_Rangier_TypeClass createNutzung_Rangier_TypeClass() {
		Nutzung_Rangier_TypeClassImpl nutzung_Rangier_TypeClass = new Nutzung_Rangier_TypeClassImpl();
		return nutzung_Rangier_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nutzung_Reisezug_TypeClass createNutzung_Reisezug_TypeClass() {
		Nutzung_Reisezug_TypeClassImpl nutzung_Reisezug_TypeClass = new Nutzung_Reisezug_TypeClassImpl();
		return nutzung_Reisezug_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nutzung_SBahn_TypeClass createNutzung_SBahn_TypeClass() {
		Nutzung_SBahn_TypeClassImpl nutzung_SBahn_TypeClass = new Nutzung_SBahn_TypeClassImpl();
		return nutzung_SBahn_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBaubereichArt createENUMBaubereichArtFromString(EDataType eDataType, String initialValue) {
		ENUMBaubereichArt result = ENUMBaubereichArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBaubereichArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGleisart createENUMGleisartFromString(EDataType eDataType, String initialValue) {
		ENUMGleisart result = ENUMGleisart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGleisartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMKonstruktion createENUMKonstruktionFromString(EDataType eDataType, String initialValue) {
		ENUMKonstruktion result = ENUMKonstruktion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMKonstruktionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLichtraumprofil createENUMLichtraumprofilFromString(EDataType eDataType, String initialValue) {
		ENUMLichtraumprofil result = ENUMLichtraumprofil.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLichtraumprofilToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBez_Gleis_Bezeichnung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBez_Gleis_Bezeichnung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBaubereichArt createENUMBaubereichArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBaubereichArtFromString(GleisPackage.Literals.ENUM_BAUBEREICH_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBaubereichArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBaubereichArtToString(GleisPackage.Literals.ENUM_BAUBEREICH_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGleisart createENUMGleisartObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGleisartFromString(GleisPackage.Literals.ENUM_GLEISART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGleisartObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGleisartToString(GleisPackage.Literals.ENUM_GLEISART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMKonstruktion createENUMKonstruktionObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMKonstruktionFromString(GleisPackage.Literals.ENUM_KONSTRUKTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMKonstruktionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMKonstruktionToString(GleisPackage.Literals.ENUM_KONSTRUKTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLichtraumprofil createENUMLichtraumprofilObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMLichtraumprofilFromString(GleisPackage.Literals.ENUM_LICHTRAUMPROFIL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLichtraumprofilObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMLichtraumprofilToString(GleisPackage.Literals.ENUM_LICHTRAUMPROFIL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createGeschwindigkeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeschwindigkeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GleisPackage getGleisPackage() {
		return (GleisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GleisPackage getPackage() {
		return GleisPackage.eINSTANCE;
	}

} //GleisFactoryImpl
