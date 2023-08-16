/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Block.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.set.model.model11001.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model11001.Block.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockFactoryImpl extends EFactoryImpl implements BlockFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlockFactory init() {
		try {
			BlockFactory theBlockFactory = (BlockFactory)EPackage.Registry.INSTANCE.getEFactory(BlockPackage.eNS_URI);
			if (theBlockFactory != null) {
				return theBlockFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BlockFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockFactoryImpl() {
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
			case BlockPackage.AUTO_ERLAUBNISHOLEN_TYPE_CLASS: return createAuto_Erlaubnisholen_TypeClass();
			case BlockPackage.AUTO_ERLAUBNISRUECKLAUF_TYPE_CLASS: return createAuto_Erlaubnisruecklauf_TypeClass();
			case BlockPackage.BETRIEBSFUEHRUNG_TYPE_CLASS: return createBetriebsfuehrung_TypeClass();
			case BlockPackage.BLOCK_ANLAGE: return createBlock_Anlage();
			case BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP: return createBlock_Anlage_Allg_AttributeGroup();
			case BlockPackage.BLOCK_BAUFORM_TYPE_CLASS: return createBlock_Bauform_TypeClass();
			case BlockPackage.BLOCK_ELEMENT: return createBlock_Element();
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP: return createBlock_Element_Allg_AttributeGroup();
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP: return createBlock_Element_Erlaubnis_AttributeGroup();
			case BlockPackage.BLOCK_STRECKE: return createBlock_Strecke();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP: return createBlock_Strecke_Allg_AttributeGroup();
			case BlockPackage.BREMSWEG_TYPE_CLASS: return createBremsweg_TypeClass();
			case BlockPackage.ERLAUBNIS_STAENDIG_VORHANDEN_TYPE_CLASS: return createErlaubnis_Staendig_Vorhanden_TypeClass();
			case BlockPackage.ERLAUBNISABGABESPEICHERUNG_TYPE_CLASS: return createErlaubnisabgabespeicherung_TypeClass();
			case BlockPackage.ERLAUBNISHOLEN_TYPE_CLASS: return createErlaubnisholen_TypeClass();
			case BlockPackage.RUECKBLOCKWECKER_TYPE_CLASS: return createRueckblockwecker_TypeClass();
			case BlockPackage.SCHALTUNG_TYPE_CLASS: return createSchaltung_TypeClass();
			case BlockPackage.SCHUTZUEBERTRAGER_TYPE_CLASS: return createSchutzuebertrager_TypeClass();
			case BlockPackage.STRECKE_ART_TYPE_CLASS: return createStrecke_Art_TypeClass();
			case BlockPackage.STRECKENGESCHWINDIGKEIT_TYPE_CLASS: return createStreckengeschwindigkeit_TypeClass();
			case BlockPackage.TRAKTION_ART_ELEKTRISCH_TYPE_CLASS: return createTraktion_Art_Elektrisch_TypeClass();
			case BlockPackage.VORBLOCKWECKER_TYPE_CLASS: return createVorblockwecker_TypeClass();
			case BlockPackage.ZUGBEEINFLUSSUNG_ART_TYPE_CLASS: return createZugbeeinflussung_Art_TypeClass();
			case BlockPackage.ZUSATZINFORMATION_TYPE_CLASS: return createZusatzinformation_TypeClass();
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
			case BlockPackage.ENUM_BETRIEBSFUEHRUNG:
				return createENUMBetriebsfuehrungFromString(eDataType, initialValue);
			case BlockPackage.ENUM_BLOCK_BAUFORM:
				return createENUMBlockBauformFromString(eDataType, initialValue);
			case BlockPackage.ENUM_SCHALTUNG:
				return createENUMSchaltungFromString(eDataType, initialValue);
			case BlockPackage.ENUM_STRECKE_ART:
				return createENUMStreckeArtFromString(eDataType, initialValue);
			case BlockPackage.ENUM_BETRIEBSFUEHRUNG_OBJECT:
				return createENUMBetriebsfuehrungObjectFromString(eDataType, initialValue);
			case BlockPackage.ENUM_BLOCK_BAUFORM_OBJECT:
				return createENUMBlockBauformObjectFromString(eDataType, initialValue);
			case BlockPackage.ENUM_SCHALTUNG_OBJECT:
				return createENUMSchaltungObjectFromString(eDataType, initialValue);
			case BlockPackage.ENUM_STRECKE_ART_OBJECT:
				return createENUMStreckeArtObjectFromString(eDataType, initialValue);
			case BlockPackage.STRECKENGESCHWINDIGKEIT_TYPE:
				return createStreckengeschwindigkeit_TypeFromString(eDataType, initialValue);
			case BlockPackage.ZUSATZINFORMATION_TYPE:
				return createZusatzinformation_TypeFromString(eDataType, initialValue);
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
			case BlockPackage.ENUM_BETRIEBSFUEHRUNG:
				return convertENUMBetriebsfuehrungToString(eDataType, instanceValue);
			case BlockPackage.ENUM_BLOCK_BAUFORM:
				return convertENUMBlockBauformToString(eDataType, instanceValue);
			case BlockPackage.ENUM_SCHALTUNG:
				return convertENUMSchaltungToString(eDataType, instanceValue);
			case BlockPackage.ENUM_STRECKE_ART:
				return convertENUMStreckeArtToString(eDataType, instanceValue);
			case BlockPackage.ENUM_BETRIEBSFUEHRUNG_OBJECT:
				return convertENUMBetriebsfuehrungObjectToString(eDataType, instanceValue);
			case BlockPackage.ENUM_BLOCK_BAUFORM_OBJECT:
				return convertENUMBlockBauformObjectToString(eDataType, instanceValue);
			case BlockPackage.ENUM_SCHALTUNG_OBJECT:
				return convertENUMSchaltungObjectToString(eDataType, instanceValue);
			case BlockPackage.ENUM_STRECKE_ART_OBJECT:
				return convertENUMStreckeArtObjectToString(eDataType, instanceValue);
			case BlockPackage.STRECKENGESCHWINDIGKEIT_TYPE:
				return convertStreckengeschwindigkeit_TypeToString(eDataType, instanceValue);
			case BlockPackage.ZUSATZINFORMATION_TYPE:
				return convertZusatzinformation_TypeToString(eDataType, instanceValue);
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
	public Auto_Erlaubnisholen_TypeClass createAuto_Erlaubnisholen_TypeClass() {
		Auto_Erlaubnisholen_TypeClassImpl auto_Erlaubnisholen_TypeClass = new Auto_Erlaubnisholen_TypeClassImpl();
		return auto_Erlaubnisholen_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Auto_Erlaubnisruecklauf_TypeClass createAuto_Erlaubnisruecklauf_TypeClass() {
		Auto_Erlaubnisruecklauf_TypeClassImpl auto_Erlaubnisruecklauf_TypeClass = new Auto_Erlaubnisruecklauf_TypeClassImpl();
		return auto_Erlaubnisruecklauf_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Betriebsfuehrung_TypeClass createBetriebsfuehrung_TypeClass() {
		Betriebsfuehrung_TypeClassImpl betriebsfuehrung_TypeClass = new Betriebsfuehrung_TypeClassImpl();
		return betriebsfuehrung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Anlage createBlock_Anlage() {
		Block_AnlageImpl block_Anlage = new Block_AnlageImpl();
		return block_Anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Anlage_Allg_AttributeGroup createBlock_Anlage_Allg_AttributeGroup() {
		Block_Anlage_Allg_AttributeGroupImpl block_Anlage_Allg_AttributeGroup = new Block_Anlage_Allg_AttributeGroupImpl();
		return block_Anlage_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Bauform_TypeClass createBlock_Bauform_TypeClass() {
		Block_Bauform_TypeClassImpl block_Bauform_TypeClass = new Block_Bauform_TypeClassImpl();
		return block_Bauform_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Element createBlock_Element() {
		Block_ElementImpl block_Element = new Block_ElementImpl();
		return block_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Element_Allg_AttributeGroup createBlock_Element_Allg_AttributeGroup() {
		Block_Element_Allg_AttributeGroupImpl block_Element_Allg_AttributeGroup = new Block_Element_Allg_AttributeGroupImpl();
		return block_Element_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Element_Erlaubnis_AttributeGroup createBlock_Element_Erlaubnis_AttributeGroup() {
		Block_Element_Erlaubnis_AttributeGroupImpl block_Element_Erlaubnis_AttributeGroup = new Block_Element_Erlaubnis_AttributeGroupImpl();
		return block_Element_Erlaubnis_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Strecke createBlock_Strecke() {
		Block_StreckeImpl block_Strecke = new Block_StreckeImpl();
		return block_Strecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Strecke_Allg_AttributeGroup createBlock_Strecke_Allg_AttributeGroup() {
		Block_Strecke_Allg_AttributeGroupImpl block_Strecke_Allg_AttributeGroup = new Block_Strecke_Allg_AttributeGroupImpl();
		return block_Strecke_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bremsweg_TypeClass createBremsweg_TypeClass() {
		Bremsweg_TypeClassImpl bremsweg_TypeClass = new Bremsweg_TypeClassImpl();
		return bremsweg_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Erlaubnis_Staendig_Vorhanden_TypeClass createErlaubnis_Staendig_Vorhanden_TypeClass() {
		Erlaubnis_Staendig_Vorhanden_TypeClassImpl erlaubnis_Staendig_Vorhanden_TypeClass = new Erlaubnis_Staendig_Vorhanden_TypeClassImpl();
		return erlaubnis_Staendig_Vorhanden_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Erlaubnisabgabespeicherung_TypeClass createErlaubnisabgabespeicherung_TypeClass() {
		Erlaubnisabgabespeicherung_TypeClassImpl erlaubnisabgabespeicherung_TypeClass = new Erlaubnisabgabespeicherung_TypeClassImpl();
		return erlaubnisabgabespeicherung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Erlaubnisholen_TypeClass createErlaubnisholen_TypeClass() {
		Erlaubnisholen_TypeClassImpl erlaubnisholen_TypeClass = new Erlaubnisholen_TypeClassImpl();
		return erlaubnisholen_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rueckblockwecker_TypeClass createRueckblockwecker_TypeClass() {
		Rueckblockwecker_TypeClassImpl rueckblockwecker_TypeClass = new Rueckblockwecker_TypeClassImpl();
		return rueckblockwecker_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schaltung_TypeClass createSchaltung_TypeClass() {
		Schaltung_TypeClassImpl schaltung_TypeClass = new Schaltung_TypeClassImpl();
		return schaltung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schutzuebertrager_TypeClass createSchutzuebertrager_TypeClass() {
		Schutzuebertrager_TypeClassImpl schutzuebertrager_TypeClass = new Schutzuebertrager_TypeClassImpl();
		return schutzuebertrager_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Art_TypeClass createStrecke_Art_TypeClass() {
		Strecke_Art_TypeClassImpl strecke_Art_TypeClass = new Strecke_Art_TypeClassImpl();
		return strecke_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Streckengeschwindigkeit_TypeClass createStreckengeschwindigkeit_TypeClass() {
		Streckengeschwindigkeit_TypeClassImpl streckengeschwindigkeit_TypeClass = new Streckengeschwindigkeit_TypeClassImpl();
		return streckengeschwindigkeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Traktion_Art_Elektrisch_TypeClass createTraktion_Art_Elektrisch_TypeClass() {
		Traktion_Art_Elektrisch_TypeClassImpl traktion_Art_Elektrisch_TypeClass = new Traktion_Art_Elektrisch_TypeClassImpl();
		return traktion_Art_Elektrisch_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vorblockwecker_TypeClass createVorblockwecker_TypeClass() {
		Vorblockwecker_TypeClassImpl vorblockwecker_TypeClass = new Vorblockwecker_TypeClassImpl();
		return vorblockwecker_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zugbeeinflussung_Art_TypeClass createZugbeeinflussung_Art_TypeClass() {
		Zugbeeinflussung_Art_TypeClassImpl zugbeeinflussung_Art_TypeClass = new Zugbeeinflussung_Art_TypeClassImpl();
		return zugbeeinflussung_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zusatzinformation_TypeClass createZusatzinformation_TypeClass() {
		Zusatzinformation_TypeClassImpl zusatzinformation_TypeClass = new Zusatzinformation_TypeClassImpl();
		return zusatzinformation_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBetriebsfuehrung createENUMBetriebsfuehrungFromString(EDataType eDataType, String initialValue) {
		ENUMBetriebsfuehrung result = ENUMBetriebsfuehrung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBetriebsfuehrungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBlockBauform createENUMBlockBauformFromString(EDataType eDataType, String initialValue) {
		ENUMBlockBauform result = ENUMBlockBauform.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBlockBauformToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchaltung createENUMSchaltungFromString(EDataType eDataType, String initialValue) {
		ENUMSchaltung result = ENUMSchaltung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchaltungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMStreckeArt createENUMStreckeArtFromString(EDataType eDataType, String initialValue) {
		ENUMStreckeArt result = ENUMStreckeArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMStreckeArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBetriebsfuehrung createENUMBetriebsfuehrungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBetriebsfuehrungFromString(BlockPackage.Literals.ENUM_BETRIEBSFUEHRUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBetriebsfuehrungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBetriebsfuehrungToString(BlockPackage.Literals.ENUM_BETRIEBSFUEHRUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBlockBauform createENUMBlockBauformObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBlockBauformFromString(BlockPackage.Literals.ENUM_BLOCK_BAUFORM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBlockBauformObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBlockBauformToString(BlockPackage.Literals.ENUM_BLOCK_BAUFORM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchaltung createENUMSchaltungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSchaltungFromString(BlockPackage.Literals.ENUM_SCHALTUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchaltungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSchaltungToString(BlockPackage.Literals.ENUM_SCHALTUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMStreckeArt createENUMStreckeArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMStreckeArtFromString(BlockPackage.Literals.ENUM_STRECKE_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMStreckeArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMStreckeArtToString(BlockPackage.Literals.ENUM_STRECKE_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createStreckengeschwindigkeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStreckengeschwindigkeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createZusatzinformation_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZusatzinformation_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockPackage getBlockPackage() {
		return (BlockPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BlockPackage getPackage() {
		return BlockPackage.eINSTANCE;
	}

} //BlockFactoryImpl
