/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.set.model.planpro.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchluesselabhaengigkeitenFactoryImpl extends EFactoryImpl implements SchluesselabhaengigkeitenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchluesselabhaengigkeitenFactory init() {
		try {
			SchluesselabhaengigkeitenFactory theSchluesselabhaengigkeitenFactory = (SchluesselabhaengigkeitenFactory)EPackage.Registry.INSTANCE.getEFactory(SchluesselabhaengigkeitenPackage.eNS_URI);
			if (theSchluesselabhaengigkeitenFactory != null) {
				return theSchluesselabhaengigkeitenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SchluesselabhaengigkeitenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchluesselabhaengigkeitenFactoryImpl() {
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
			case SchluesselabhaengigkeitenPackage.BEDIENUNG_ART_TYPE_CLASS: return createBedienung_Art_TypeClass();
			case SchluesselabhaengigkeitenPackage.BESCHREIBUNG_SONDERANLAGE_TYPE_CLASS: return createBeschreibung_Sonderanlage_TypeClass();
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SCHLOSS_TYPE_CLASS: return createBezeichnung_Schloss_TypeClass();
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SCHLUESSEL_TYPE_CLASS: return createBezeichnung_Schluessel_TypeClass();
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SK_TYPE_CLASS: return createBezeichnung_Sk_TypeClass();
			case SchluesselabhaengigkeitenPackage.BUE_LAGE_TYPE_CLASS: return createBUE_Lage_TypeClass();
			case SchluesselabhaengigkeitenPackage.GSP_LAGE_TYPE_CLASS: return createGsp_Lage_TypeClass();
			case SchluesselabhaengigkeitenPackage.HAUPTSCHLOSS_TYPE_CLASS: return createHauptschloss_TypeClass();
			case SchluesselabhaengigkeitenPackage.SCHLOSS: return createSchloss();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_ART_TYPE_CLASS: return createSchloss_Art_TypeClass();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP: return createSchloss_Bezeichnung_AttributeGroup();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_BUE_ATTRIBUTE_GROUP: return createSchloss_BUE_AttributeGroup();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP: return createSchloss_Gsp_AttributeGroup();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP: return createSchloss_Sk_AttributeGroup();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP: return createSchloss_Sonderanlage_AttributeGroup();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SSP_ATTRIBUTE_GROUP: return createSchloss_Ssp_AttributeGroup();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP: return createSchloss_W_AttributeGroup();
			case SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION: return createSchlosskombination();
			case SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP: return createSchlosskombination_Bezeichnung_AttributeGroup();
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL: return createSchluessel();
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP: return createSchluessel_Allg_AttributeGroup();
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_BARTFORM_TYPE_CLASS: return createSchluessel_Bartform_TypeClass();
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP: return createSchluessel_Bezeichnung_AttributeGroup();
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_GRUPPE_TYPE_CLASS: return createSchluessel_Gruppe_TypeClass();
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_IN_GRDST_EINGESCHL_TYPE_CLASS: return createSchluessel_In_Grdst_Eingeschl_TypeClass();
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE: return createSchluesselsperre();
			case SchluesselabhaengigkeitenPackage.SONDERANLAGE_LAGE_TYPE_CLASS: return createSonderanlage_Lage_TypeClass();
			case SchluesselabhaengigkeitenPackage.TECHNISCH_BERECHTIGTER_TYPE_CLASS: return createTechnisch_Berechtigter_TypeClass();
			case SchluesselabhaengigkeitenPackage.VERSCHLUSS_ORT_TYPE_CLASS: return createVerschluss_Ort_TypeClass();
			case SchluesselabhaengigkeitenPackage.WANBAULAGE_TYPE_CLASS: return createW_Anbaulage_TypeClass();
			case SchluesselabhaengigkeitenPackage.WLAGE_TYPE_CLASS: return createW_Lage_TypeClass();
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
			case SchluesselabhaengigkeitenPackage.ENUM_BEDIENUNG_ART:
				return createENUMBedienungArtFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUMBUE_LAGE:
				return createENUMBUELageFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUM_GSP_LAGE:
				return createENUMGspLageFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLOSS_ART:
				return createENUMSchlossArtFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLUESSEL_BARTFORM:
				return createENUMSchluesselBartformFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLUESSEL_GRUPPE:
				return createENUMSchluesselGruppeFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SONDERANLAGE_LAGE:
				return createENUMSonderanlageLageFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUM_VERSCHLUSS_ORT:
				return createENUMVerschlussOrtFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.BESCHREIBUNG_SONDERANLAGE_TYPE:
				return createBeschreibung_Sonderanlage_TypeFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SCHLOSS_TYPE:
				return createBezeichnung_Schloss_TypeFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SCHLUESSEL_TYPE:
				return createBezeichnung_Schluessel_TypeFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SK_TYPE:
				return createBezeichnung_Sk_TypeFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUM_BEDIENUNG_ART_OBJECT:
				return createENUMBedienungArtObjectFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUMBUE_LAGE_OBJECT:
				return createENUMBUELageObjectFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUM_GSP_LAGE_OBJECT:
				return createENUMGspLageObjectFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLOSS_ART_OBJECT:
				return createENUMSchlossArtObjectFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLUESSEL_BARTFORM_OBJECT:
				return createENUMSchluesselBartformObjectFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLUESSEL_GRUPPE_OBJECT:
				return createENUMSchluesselGruppeObjectFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SONDERANLAGE_LAGE_OBJECT:
				return createENUMSonderanlageLageObjectFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.ENUM_VERSCHLUSS_ORT_OBJECT:
				return createENUMVerschlussOrtObjectFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.WANBAULAGE_TYPE:
				return createW_Anbaulage_TypeFromString(eDataType, initialValue);
			case SchluesselabhaengigkeitenPackage.WLAGE_TYPE:
				return createW_Lage_TypeFromString(eDataType, initialValue);
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
			case SchluesselabhaengigkeitenPackage.ENUM_BEDIENUNG_ART:
				return convertENUMBedienungArtToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUMBUE_LAGE:
				return convertENUMBUELageToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUM_GSP_LAGE:
				return convertENUMGspLageToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLOSS_ART:
				return convertENUMSchlossArtToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLUESSEL_BARTFORM:
				return convertENUMSchluesselBartformToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLUESSEL_GRUPPE:
				return convertENUMSchluesselGruppeToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SONDERANLAGE_LAGE:
				return convertENUMSonderanlageLageToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUM_VERSCHLUSS_ORT:
				return convertENUMVerschlussOrtToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.BESCHREIBUNG_SONDERANLAGE_TYPE:
				return convertBeschreibung_Sonderanlage_TypeToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SCHLOSS_TYPE:
				return convertBezeichnung_Schloss_TypeToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SCHLUESSEL_TYPE:
				return convertBezeichnung_Schluessel_TypeToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SK_TYPE:
				return convertBezeichnung_Sk_TypeToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUM_BEDIENUNG_ART_OBJECT:
				return convertENUMBedienungArtObjectToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUMBUE_LAGE_OBJECT:
				return convertENUMBUELageObjectToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUM_GSP_LAGE_OBJECT:
				return convertENUMGspLageObjectToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLOSS_ART_OBJECT:
				return convertENUMSchlossArtObjectToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLUESSEL_BARTFORM_OBJECT:
				return convertENUMSchluesselBartformObjectToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLUESSEL_GRUPPE_OBJECT:
				return convertENUMSchluesselGruppeObjectToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUM_SONDERANLAGE_LAGE_OBJECT:
				return convertENUMSonderanlageLageObjectToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.ENUM_VERSCHLUSS_ORT_OBJECT:
				return convertENUMVerschlussOrtObjectToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.WANBAULAGE_TYPE:
				return convertW_Anbaulage_TypeToString(eDataType, instanceValue);
			case SchluesselabhaengigkeitenPackage.WLAGE_TYPE:
				return convertW_Lage_TypeToString(eDataType, instanceValue);
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
	public Bedienung_Art_TypeClass createBedienung_Art_TypeClass() {
		Bedienung_Art_TypeClassImpl bedienung_Art_TypeClass = new Bedienung_Art_TypeClassImpl();
		return bedienung_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Beschreibung_Sonderanlage_TypeClass createBeschreibung_Sonderanlage_TypeClass() {
		Beschreibung_Sonderanlage_TypeClassImpl beschreibung_Sonderanlage_TypeClass = new Beschreibung_Sonderanlage_TypeClassImpl();
		return beschreibung_Sonderanlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Schloss_TypeClass createBezeichnung_Schloss_TypeClass() {
		Bezeichnung_Schloss_TypeClassImpl bezeichnung_Schloss_TypeClass = new Bezeichnung_Schloss_TypeClassImpl();
		return bezeichnung_Schloss_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Schluessel_TypeClass createBezeichnung_Schluessel_TypeClass() {
		Bezeichnung_Schluessel_TypeClassImpl bezeichnung_Schluessel_TypeClass = new Bezeichnung_Schluessel_TypeClassImpl();
		return bezeichnung_Schluessel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Sk_TypeClass createBezeichnung_Sk_TypeClass() {
		Bezeichnung_Sk_TypeClassImpl bezeichnung_Sk_TypeClass = new Bezeichnung_Sk_TypeClassImpl();
		return bezeichnung_Sk_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Lage_TypeClass createBUE_Lage_TypeClass() {
		BUE_Lage_TypeClassImpl buE_Lage_TypeClass = new BUE_Lage_TypeClassImpl();
		return buE_Lage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gsp_Lage_TypeClass createGsp_Lage_TypeClass() {
		Gsp_Lage_TypeClassImpl gsp_Lage_TypeClass = new Gsp_Lage_TypeClassImpl();
		return gsp_Lage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hauptschloss_TypeClass createHauptschloss_TypeClass() {
		Hauptschloss_TypeClassImpl hauptschloss_TypeClass = new Hauptschloss_TypeClassImpl();
		return hauptschloss_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss createSchloss() {
		SchlossImpl schloss = new SchlossImpl();
		return schloss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_Art_TypeClass createSchloss_Art_TypeClass() {
		Schloss_Art_TypeClassImpl schloss_Art_TypeClass = new Schloss_Art_TypeClassImpl();
		return schloss_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_Bezeichnung_AttributeGroup createSchloss_Bezeichnung_AttributeGroup() {
		Schloss_Bezeichnung_AttributeGroupImpl schloss_Bezeichnung_AttributeGroup = new Schloss_Bezeichnung_AttributeGroupImpl();
		return schloss_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_BUE_AttributeGroup createSchloss_BUE_AttributeGroup() {
		Schloss_BUE_AttributeGroupImpl schloss_BUE_AttributeGroup = new Schloss_BUE_AttributeGroupImpl();
		return schloss_BUE_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_Gsp_AttributeGroup createSchloss_Gsp_AttributeGroup() {
		Schloss_Gsp_AttributeGroupImpl schloss_Gsp_AttributeGroup = new Schloss_Gsp_AttributeGroupImpl();
		return schloss_Gsp_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_Sk_AttributeGroup createSchloss_Sk_AttributeGroup() {
		Schloss_Sk_AttributeGroupImpl schloss_Sk_AttributeGroup = new Schloss_Sk_AttributeGroupImpl();
		return schloss_Sk_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_Sonderanlage_AttributeGroup createSchloss_Sonderanlage_AttributeGroup() {
		Schloss_Sonderanlage_AttributeGroupImpl schloss_Sonderanlage_AttributeGroup = new Schloss_Sonderanlage_AttributeGroupImpl();
		return schloss_Sonderanlage_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_Ssp_AttributeGroup createSchloss_Ssp_AttributeGroup() {
		Schloss_Ssp_AttributeGroupImpl schloss_Ssp_AttributeGroup = new Schloss_Ssp_AttributeGroupImpl();
		return schloss_Ssp_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_W_AttributeGroup createSchloss_W_AttributeGroup() {
		Schloss_W_AttributeGroupImpl schloss_W_AttributeGroup = new Schloss_W_AttributeGroupImpl();
		return schloss_W_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schlosskombination createSchlosskombination() {
		SchlosskombinationImpl schlosskombination = new SchlosskombinationImpl();
		return schlosskombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schlosskombination_Bezeichnung_AttributeGroup createSchlosskombination_Bezeichnung_AttributeGroup() {
		Schlosskombination_Bezeichnung_AttributeGroupImpl schlosskombination_Bezeichnung_AttributeGroup = new Schlosskombination_Bezeichnung_AttributeGroupImpl();
		return schlosskombination_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluessel createSchluessel() {
		SchluesselImpl schluessel = new SchluesselImpl();
		return schluessel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluessel_Allg_AttributeGroup createSchluessel_Allg_AttributeGroup() {
		Schluessel_Allg_AttributeGroupImpl schluessel_Allg_AttributeGroup = new Schluessel_Allg_AttributeGroupImpl();
		return schluessel_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluessel_Bartform_TypeClass createSchluessel_Bartform_TypeClass() {
		Schluessel_Bartform_TypeClassImpl schluessel_Bartform_TypeClass = new Schluessel_Bartform_TypeClassImpl();
		return schluessel_Bartform_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluessel_Bezeichnung_AttributeGroup createSchluessel_Bezeichnung_AttributeGroup() {
		Schluessel_Bezeichnung_AttributeGroupImpl schluessel_Bezeichnung_AttributeGroup = new Schluessel_Bezeichnung_AttributeGroupImpl();
		return schluessel_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluessel_Gruppe_TypeClass createSchluessel_Gruppe_TypeClass() {
		Schluessel_Gruppe_TypeClassImpl schluessel_Gruppe_TypeClass = new Schluessel_Gruppe_TypeClassImpl();
		return schluessel_Gruppe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluessel_In_Grdst_Eingeschl_TypeClass createSchluessel_In_Grdst_Eingeschl_TypeClass() {
		Schluessel_In_Grdst_Eingeschl_TypeClassImpl schluessel_In_Grdst_Eingeschl_TypeClass = new Schluessel_In_Grdst_Eingeschl_TypeClassImpl();
		return schluessel_In_Grdst_Eingeschl_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluesselsperre createSchluesselsperre() {
		SchluesselsperreImpl schluesselsperre = new SchluesselsperreImpl();
		return schluesselsperre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sonderanlage_Lage_TypeClass createSonderanlage_Lage_TypeClass() {
		Sonderanlage_Lage_TypeClassImpl sonderanlage_Lage_TypeClass = new Sonderanlage_Lage_TypeClassImpl();
		return sonderanlage_Lage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technisch_Berechtigter_TypeClass createTechnisch_Berechtigter_TypeClass() {
		Technisch_Berechtigter_TypeClassImpl technisch_Berechtigter_TypeClass = new Technisch_Berechtigter_TypeClassImpl();
		return technisch_Berechtigter_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verschluss_Ort_TypeClass createVerschluss_Ort_TypeClass() {
		Verschluss_Ort_TypeClassImpl verschluss_Ort_TypeClass = new Verschluss_Ort_TypeClassImpl();
		return verschluss_Ort_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Anbaulage_TypeClass createW_Anbaulage_TypeClass() {
		W_Anbaulage_TypeClassImpl w_Anbaulage_TypeClass = new W_Anbaulage_TypeClassImpl();
		return w_Anbaulage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Lage_TypeClass createW_Lage_TypeClass() {
		W_Lage_TypeClassImpl w_Lage_TypeClass = new W_Lage_TypeClassImpl();
		return w_Lage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBedienungArt createENUMBedienungArtFromString(EDataType eDataType, String initialValue) {
		ENUMBedienungArt result = ENUMBedienungArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBedienungArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBUELage createENUMBUELageFromString(EDataType eDataType, String initialValue) {
		ENUMBUELage result = ENUMBUELage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBUELageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGspLage createENUMGspLageFromString(EDataType eDataType, String initialValue) {
		ENUMGspLage result = ENUMGspLage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGspLageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchlossArt createENUMSchlossArtFromString(EDataType eDataType, String initialValue) {
		ENUMSchlossArt result = ENUMSchlossArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchlossArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchluesselBartform createENUMSchluesselBartformFromString(EDataType eDataType, String initialValue) {
		ENUMSchluesselBartform result = ENUMSchluesselBartform.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchluesselBartformToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchluesselGruppe createENUMSchluesselGruppeFromString(EDataType eDataType, String initialValue) {
		ENUMSchluesselGruppe result = ENUMSchluesselGruppe.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchluesselGruppeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSonderanlageLage createENUMSonderanlageLageFromString(EDataType eDataType, String initialValue) {
		ENUMSonderanlageLage result = ENUMSonderanlageLage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSonderanlageLageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMVerschlussOrt createENUMVerschlussOrtFromString(EDataType eDataType, String initialValue) {
		ENUMVerschlussOrt result = ENUMVerschlussOrt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMVerschlussOrtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBeschreibung_Sonderanlage_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBeschreibung_Sonderanlage_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Schloss_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Schloss_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Schluessel_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Schluessel_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Sk_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Sk_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBedienungArt createENUMBedienungArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBedienungArtFromString(SchluesselabhaengigkeitenPackage.Literals.ENUM_BEDIENUNG_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBedienungArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBedienungArtToString(SchluesselabhaengigkeitenPackage.Literals.ENUM_BEDIENUNG_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBUELage createENUMBUELageObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBUELageFromString(SchluesselabhaengigkeitenPackage.Literals.ENUMBUE_LAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBUELageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBUELageToString(SchluesselabhaengigkeitenPackage.Literals.ENUMBUE_LAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGspLage createENUMGspLageObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGspLageFromString(SchluesselabhaengigkeitenPackage.Literals.ENUM_GSP_LAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGspLageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGspLageToString(SchluesselabhaengigkeitenPackage.Literals.ENUM_GSP_LAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchlossArt createENUMSchlossArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSchlossArtFromString(SchluesselabhaengigkeitenPackage.Literals.ENUM_SCHLOSS_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchlossArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSchlossArtToString(SchluesselabhaengigkeitenPackage.Literals.ENUM_SCHLOSS_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchluesselBartform createENUMSchluesselBartformObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSchluesselBartformFromString(SchluesselabhaengigkeitenPackage.Literals.ENUM_SCHLUESSEL_BARTFORM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchluesselBartformObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSchluesselBartformToString(SchluesselabhaengigkeitenPackage.Literals.ENUM_SCHLUESSEL_BARTFORM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchluesselGruppe createENUMSchluesselGruppeObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSchluesselGruppeFromString(SchluesselabhaengigkeitenPackage.Literals.ENUM_SCHLUESSEL_GRUPPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchluesselGruppeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSchluesselGruppeToString(SchluesselabhaengigkeitenPackage.Literals.ENUM_SCHLUESSEL_GRUPPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSonderanlageLage createENUMSonderanlageLageObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSonderanlageLageFromString(SchluesselabhaengigkeitenPackage.Literals.ENUM_SONDERANLAGE_LAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSonderanlageLageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSonderanlageLageToString(SchluesselabhaengigkeitenPackage.Literals.ENUM_SONDERANLAGE_LAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMVerschlussOrt createENUMVerschlussOrtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMVerschlussOrtFromString(SchluesselabhaengigkeitenPackage.Literals.ENUM_VERSCHLUSS_ORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMVerschlussOrtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMVerschlussOrtToString(SchluesselabhaengigkeitenPackage.Literals.ENUM_VERSCHLUSS_ORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinksRechts createW_Anbaulage_TypeFromString(EDataType eDataType, String initialValue) {
		return (ENUMLinksRechts)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertW_Anbaulage_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinksRechts createW_Lage_TypeFromString(EDataType eDataType, String initialValue) {
		return (ENUMLinksRechts)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertW_Lage_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchluesselabhaengigkeitenPackage getSchluesselabhaengigkeitenPackage() {
		return (SchluesselabhaengigkeitenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SchluesselabhaengigkeitenPackage getPackage() {
		return SchluesselabhaengigkeitenPackage.eINSTANCE;
	}

} //SchluesselabhaengigkeitenFactoryImpl
