/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zuglenkung.impl;

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

import org.eclipse.set.model.planpro.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.planpro.Zuglenkung.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZuglenkungFactoryImpl extends EFactoryImpl implements ZuglenkungFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ZuglenkungFactory init() {
		try {
			ZuglenkungFactory theZuglenkungFactory = (ZuglenkungFactory)EPackage.Registry.INSTANCE.getEFactory(ZuglenkungPackage.eNS_URI);
			if (theZuglenkungFactory != null) {
				return theZuglenkungFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ZuglenkungFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZuglenkungFactoryImpl() {
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
			case ZuglenkungPackage.ANNAEHERUNGSGESCHWINDIGKEIT_TYPE_CLASS: return createAnnaeherungsgeschwindigkeit_TypeClass();
			case ZuglenkungPackage.ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE_CLASS: return createAnzahl_Wiederhol_ZL_Anstoesse_TypeClass();
			case ZuglenkungPackage.DEADLOCKPRUEFUNG_TYPE_CLASS: return createDeadlockpruefung_TypeClass();
			case ZuglenkungPackage.DWEG_PRIO_TYPE_CLASS: return createDWeg_Prio_TypeClass();
			case ZuglenkungPackage.EINSTELLKONTROLLZEIT_TYPE_CLASS: return createEinstellkontrollzeit_TypeClass();
			case ZuglenkungPackage.FSTR_BILDEZEIT_TYPE_CLASS: return createFstr_Bildezeit_TypeClass();
			case ZuglenkungPackage.FUEM_AUSWERTUNG_TYPE_CLASS: return createFUEM_Auswertung_TypeClass();
			case ZuglenkungPackage.GK_TYPE_CLASS: return createGK_TypeClass();
			case ZuglenkungPackage.GKZSS_TYPE_CLASS: return createGKZSS_TypeClass();
			case ZuglenkungPackage.LENKABBRUCHZEIT_TYPE_CLASS: return createLenkabbruchzeit_TypeClass();
			case ZuglenkungPackage.LENKZIFFERNSTELLEN_TYPE_CLASS: return createLenkziffernstellen_TypeClass();
			case ZuglenkungPackage.PERSONAL_REAKTIONSZEIT_TYPE_CLASS: return createPersonal_Reaktionszeit_TypeClass();
			case ZuglenkungPackage.SICHTZEIT_VORSIGNAL_TYPE_CLASS: return createSichtzeit_Vorsignal_TypeClass();
			case ZuglenkungPackage.SIGNALGRUPPE_BEZEICHNER_TYPE_CLASS: return createSignalgruppe_Bezeichner_TypeClass();
			case ZuglenkungPackage.TV_GK_TYPE_CLASS: return createTv_GK_TypeClass();
			case ZuglenkungPackage.VMAX_ANNAEHERUNG_TYPE_CLASS: return createVmax_Annaeherung_TypeClass();
			case ZuglenkungPackage.ZL: return createZL();
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP: return createZL_Allg_AttributeGroup();
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT: return createZL_DLP_Abschnitt();
			case ZuglenkungPackage.ZL_DLP_FSTR: return createZL_DLP_Fstr();
			case ZuglenkungPackage.ZL_FSTR: return createZL_Fstr();
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP: return createZL_Fstr_Allg_AttributeGroup();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS: return createZL_Fstr_Anstoss();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP: return createZL_Fstr_Anstoss_Allg_AttributeGroup();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP: return createZL_Fstr_Anstoss_GK_AttributeGroup();
			case ZuglenkungPackage.ZL_FSTR_ZUSCHLAG_TYPE_CLASS: return createZL_Fstr_Zuschlag_TypeClass();
			case ZuglenkungPackage.ZL_SIGNALGRUPPE: return createZL_Signalgruppe();
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP: return createZL_Signalgruppe_Allg_AttributeGroup();
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG: return createZL_Signalgruppe_Zuordnung();
			case ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP: return createZL_ZN_AttributeGroup();
			case ZuglenkungPackage.ZN_STELLEN_TYPE_CLASS: return createZN_Stellen_TypeClass();
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
			case ZuglenkungPackage.ENUM_LENKZIFFERNSTELLEN:
				return createENUMLenkziffernstellenFromString(eDataType, initialValue);
			case ZuglenkungPackage.ENUMZN_STELLEN:
				return createENUMZNStellenFromString(eDataType, initialValue);
			case ZuglenkungPackage.ANNAEHERUNGSGESCHWINDIGKEIT_TYPE:
				return createAnnaeherungsgeschwindigkeit_TypeFromString(eDataType, initialValue);
			case ZuglenkungPackage.ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE:
				return createAnzahl_Wiederhol_ZL_Anstoesse_TypeFromString(eDataType, initialValue);
			case ZuglenkungPackage.DWEG_PRIO_TYPE:
				return createDWeg_Prio_TypeFromString(eDataType, initialValue);
			case ZuglenkungPackage.EINSTELLKONTROLLZEIT_TYPE:
				return createEinstellkontrollzeit_TypeFromString(eDataType, initialValue);
			case ZuglenkungPackage.ENUM_LENKZIFFERNSTELLEN_OBJECT:
				return createENUMLenkziffernstellenObjectFromString(eDataType, initialValue);
			case ZuglenkungPackage.ENUMZN_STELLEN_OBJECT:
				return createENUMZNStellenObjectFromString(eDataType, initialValue);
			case ZuglenkungPackage.FSTR_BILDEZEIT_TYPE:
				return createFstr_Bildezeit_TypeFromString(eDataType, initialValue);
			case ZuglenkungPackage.GK_TYPE:
				return createGK_TypeFromString(eDataType, initialValue);
			case ZuglenkungPackage.LENKABBRUCHZEIT_TYPE:
				return createLenkabbruchzeit_TypeFromString(eDataType, initialValue);
			case ZuglenkungPackage.PERSONAL_REAKTIONSZEIT_TYPE:
				return createPersonal_Reaktionszeit_TypeFromString(eDataType, initialValue);
			case ZuglenkungPackage.SICHTZEIT_VORSIGNAL_TYPE:
				return createSichtzeit_Vorsignal_TypeFromString(eDataType, initialValue);
			case ZuglenkungPackage.SIGNALGRUPPE_BEZEICHNER_TYPE:
				return createSignalgruppe_Bezeichner_TypeFromString(eDataType, initialValue);
			case ZuglenkungPackage.TV_GK_TYPE:
				return createTv_GK_TypeFromString(eDataType, initialValue);
			case ZuglenkungPackage.VMAX_ANNAEHERUNG_TYPE:
				return createVmax_Annaeherung_TypeFromString(eDataType, initialValue);
			case ZuglenkungPackage.ZL_FSTR_ZUSCHLAG_TYPE:
				return createZL_Fstr_Zuschlag_TypeFromString(eDataType, initialValue);
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
			case ZuglenkungPackage.ENUM_LENKZIFFERNSTELLEN:
				return convertENUMLenkziffernstellenToString(eDataType, instanceValue);
			case ZuglenkungPackage.ENUMZN_STELLEN:
				return convertENUMZNStellenToString(eDataType, instanceValue);
			case ZuglenkungPackage.ANNAEHERUNGSGESCHWINDIGKEIT_TYPE:
				return convertAnnaeherungsgeschwindigkeit_TypeToString(eDataType, instanceValue);
			case ZuglenkungPackage.ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE:
				return convertAnzahl_Wiederhol_ZL_Anstoesse_TypeToString(eDataType, instanceValue);
			case ZuglenkungPackage.DWEG_PRIO_TYPE:
				return convertDWeg_Prio_TypeToString(eDataType, instanceValue);
			case ZuglenkungPackage.EINSTELLKONTROLLZEIT_TYPE:
				return convertEinstellkontrollzeit_TypeToString(eDataType, instanceValue);
			case ZuglenkungPackage.ENUM_LENKZIFFERNSTELLEN_OBJECT:
				return convertENUMLenkziffernstellenObjectToString(eDataType, instanceValue);
			case ZuglenkungPackage.ENUMZN_STELLEN_OBJECT:
				return convertENUMZNStellenObjectToString(eDataType, instanceValue);
			case ZuglenkungPackage.FSTR_BILDEZEIT_TYPE:
				return convertFstr_Bildezeit_TypeToString(eDataType, instanceValue);
			case ZuglenkungPackage.GK_TYPE:
				return convertGK_TypeToString(eDataType, instanceValue);
			case ZuglenkungPackage.LENKABBRUCHZEIT_TYPE:
				return convertLenkabbruchzeit_TypeToString(eDataType, instanceValue);
			case ZuglenkungPackage.PERSONAL_REAKTIONSZEIT_TYPE:
				return convertPersonal_Reaktionszeit_TypeToString(eDataType, instanceValue);
			case ZuglenkungPackage.SICHTZEIT_VORSIGNAL_TYPE:
				return convertSichtzeit_Vorsignal_TypeToString(eDataType, instanceValue);
			case ZuglenkungPackage.SIGNALGRUPPE_BEZEICHNER_TYPE:
				return convertSignalgruppe_Bezeichner_TypeToString(eDataType, instanceValue);
			case ZuglenkungPackage.TV_GK_TYPE:
				return convertTv_GK_TypeToString(eDataType, instanceValue);
			case ZuglenkungPackage.VMAX_ANNAEHERUNG_TYPE:
				return convertVmax_Annaeherung_TypeToString(eDataType, instanceValue);
			case ZuglenkungPackage.ZL_FSTR_ZUSCHLAG_TYPE:
				return convertZL_Fstr_Zuschlag_TypeToString(eDataType, instanceValue);
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
	public Annaeherungsgeschwindigkeit_TypeClass createAnnaeherungsgeschwindigkeit_TypeClass() {
		Annaeherungsgeschwindigkeit_TypeClassImpl annaeherungsgeschwindigkeit_TypeClass = new Annaeherungsgeschwindigkeit_TypeClassImpl();
		return annaeherungsgeschwindigkeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anzahl_Wiederhol_ZL_Anstoesse_TypeClass createAnzahl_Wiederhol_ZL_Anstoesse_TypeClass() {
		Anzahl_Wiederhol_ZL_Anstoesse_TypeClassImpl anzahl_Wiederhol_ZL_Anstoesse_TypeClass = new Anzahl_Wiederhol_ZL_Anstoesse_TypeClassImpl();
		return anzahl_Wiederhol_ZL_Anstoesse_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deadlockpruefung_TypeClass createDeadlockpruefung_TypeClass() {
		Deadlockpruefung_TypeClassImpl deadlockpruefung_TypeClass = new Deadlockpruefung_TypeClassImpl();
		return deadlockpruefung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_Prio_TypeClass createDWeg_Prio_TypeClass() {
		DWeg_Prio_TypeClassImpl dWeg_Prio_TypeClass = new DWeg_Prio_TypeClassImpl();
		return dWeg_Prio_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einstellkontrollzeit_TypeClass createEinstellkontrollzeit_TypeClass() {
		Einstellkontrollzeit_TypeClassImpl einstellkontrollzeit_TypeClass = new Einstellkontrollzeit_TypeClassImpl();
		return einstellkontrollzeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Bildezeit_TypeClass createFstr_Bildezeit_TypeClass() {
		Fstr_Bildezeit_TypeClassImpl fstr_Bildezeit_TypeClass = new Fstr_Bildezeit_TypeClassImpl();
		return fstr_Bildezeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FUEM_Auswertung_TypeClass createFUEM_Auswertung_TypeClass() {
		FUEM_Auswertung_TypeClassImpl fueM_Auswertung_TypeClass = new FUEM_Auswertung_TypeClassImpl();
		return fueM_Auswertung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GK_TypeClass createGK_TypeClass() {
		GK_TypeClassImpl gK_TypeClass = new GK_TypeClassImpl();
		return gK_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GKZSS_TypeClass createGKZSS_TypeClass() {
		GKZSS_TypeClassImpl gkzsS_TypeClass = new GKZSS_TypeClassImpl();
		return gkzsS_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lenkabbruchzeit_TypeClass createLenkabbruchzeit_TypeClass() {
		Lenkabbruchzeit_TypeClassImpl lenkabbruchzeit_TypeClass = new Lenkabbruchzeit_TypeClassImpl();
		return lenkabbruchzeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lenkziffernstellen_TypeClass createLenkziffernstellen_TypeClass() {
		Lenkziffernstellen_TypeClassImpl lenkziffernstellen_TypeClass = new Lenkziffernstellen_TypeClassImpl();
		return lenkziffernstellen_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Personal_Reaktionszeit_TypeClass createPersonal_Reaktionszeit_TypeClass() {
		Personal_Reaktionszeit_TypeClassImpl personal_Reaktionszeit_TypeClass = new Personal_Reaktionszeit_TypeClassImpl();
		return personal_Reaktionszeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sichtzeit_Vorsignal_TypeClass createSichtzeit_Vorsignal_TypeClass() {
		Sichtzeit_Vorsignal_TypeClassImpl sichtzeit_Vorsignal_TypeClass = new Sichtzeit_Vorsignal_TypeClassImpl();
		return sichtzeit_Vorsignal_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalgruppe_Bezeichner_TypeClass createSignalgruppe_Bezeichner_TypeClass() {
		Signalgruppe_Bezeichner_TypeClassImpl signalgruppe_Bezeichner_TypeClass = new Signalgruppe_Bezeichner_TypeClassImpl();
		return signalgruppe_Bezeichner_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tv_GK_TypeClass createTv_GK_TypeClass() {
		Tv_GK_TypeClassImpl tv_GK_TypeClass = new Tv_GK_TypeClassImpl();
		return tv_GK_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vmax_Annaeherung_TypeClass createVmax_Annaeherung_TypeClass() {
		Vmax_Annaeherung_TypeClassImpl vmax_Annaeherung_TypeClass = new Vmax_Annaeherung_TypeClassImpl();
		return vmax_Annaeherung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL createZL() {
		ZLImpl zl = new ZLImpl();
		return zl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Allg_AttributeGroup createZL_Allg_AttributeGroup() {
		ZL_Allg_AttributeGroupImpl zL_Allg_AttributeGroup = new ZL_Allg_AttributeGroupImpl();
		return zL_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_DLP_Abschnitt createZL_DLP_Abschnitt() {
		ZL_DLP_AbschnittImpl zL_DLP_Abschnitt = new ZL_DLP_AbschnittImpl();
		return zL_DLP_Abschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_DLP_Fstr createZL_DLP_Fstr() {
		ZL_DLP_FstrImpl zL_DLP_Fstr = new ZL_DLP_FstrImpl();
		return zL_DLP_Fstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Fstr createZL_Fstr() {
		ZL_FstrImpl zL_Fstr = new ZL_FstrImpl();
		return zL_Fstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Fstr_Allg_AttributeGroup createZL_Fstr_Allg_AttributeGroup() {
		ZL_Fstr_Allg_AttributeGroupImpl zL_Fstr_Allg_AttributeGroup = new ZL_Fstr_Allg_AttributeGroupImpl();
		return zL_Fstr_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Fstr_Anstoss createZL_Fstr_Anstoss() {
		ZL_Fstr_AnstossImpl zL_Fstr_Anstoss = new ZL_Fstr_AnstossImpl();
		return zL_Fstr_Anstoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Fstr_Anstoss_Allg_AttributeGroup createZL_Fstr_Anstoss_Allg_AttributeGroup() {
		ZL_Fstr_Anstoss_Allg_AttributeGroupImpl zL_Fstr_Anstoss_Allg_AttributeGroup = new ZL_Fstr_Anstoss_Allg_AttributeGroupImpl();
		return zL_Fstr_Anstoss_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Fstr_Anstoss_GK_AttributeGroup createZL_Fstr_Anstoss_GK_AttributeGroup() {
		ZL_Fstr_Anstoss_GK_AttributeGroupImpl zL_Fstr_Anstoss_GK_AttributeGroup = new ZL_Fstr_Anstoss_GK_AttributeGroupImpl();
		return zL_Fstr_Anstoss_GK_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Fstr_Zuschlag_TypeClass createZL_Fstr_Zuschlag_TypeClass() {
		ZL_Fstr_Zuschlag_TypeClassImpl zL_Fstr_Zuschlag_TypeClass = new ZL_Fstr_Zuschlag_TypeClassImpl();
		return zL_Fstr_Zuschlag_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Signalgruppe createZL_Signalgruppe() {
		ZL_SignalgruppeImpl zL_Signalgruppe = new ZL_SignalgruppeImpl();
		return zL_Signalgruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Signalgruppe_Allg_AttributeGroup createZL_Signalgruppe_Allg_AttributeGroup() {
		ZL_Signalgruppe_Allg_AttributeGroupImpl zL_Signalgruppe_Allg_AttributeGroup = new ZL_Signalgruppe_Allg_AttributeGroupImpl();
		return zL_Signalgruppe_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Signalgruppe_Zuordnung createZL_Signalgruppe_Zuordnung() {
		ZL_Signalgruppe_ZuordnungImpl zL_Signalgruppe_Zuordnung = new ZL_Signalgruppe_ZuordnungImpl();
		return zL_Signalgruppe_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_ZN_AttributeGroup createZL_ZN_AttributeGroup() {
		ZL_ZN_AttributeGroupImpl zL_ZN_AttributeGroup = new ZL_ZN_AttributeGroupImpl();
		return zL_ZN_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Stellen_TypeClass createZN_Stellen_TypeClass() {
		ZN_Stellen_TypeClassImpl zN_Stellen_TypeClass = new ZN_Stellen_TypeClassImpl();
		return zN_Stellen_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLenkziffernstellen createENUMLenkziffernstellenFromString(EDataType eDataType, String initialValue) {
		ENUMLenkziffernstellen result = ENUMLenkziffernstellen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLenkziffernstellenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZNStellen createENUMZNStellenFromString(EDataType eDataType, String initialValue) {
		ENUMZNStellen result = ENUMZNStellen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZNStellenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createAnnaeherungsgeschwindigkeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnnaeherungsgeschwindigkeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createAnzahl_Wiederhol_ZL_Anstoesse_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnzahl_Wiederhol_ZL_Anstoesse_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createDWeg_Prio_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDWeg_Prio_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createEinstellkontrollzeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEinstellkontrollzeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLenkziffernstellen createENUMLenkziffernstellenObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMLenkziffernstellenFromString(ZuglenkungPackage.Literals.ENUM_LENKZIFFERNSTELLEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLenkziffernstellenObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMLenkziffernstellenToString(ZuglenkungPackage.Literals.ENUM_LENKZIFFERNSTELLEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZNStellen createENUMZNStellenObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMZNStellenFromString(ZuglenkungPackage.Literals.ENUMZN_STELLEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZNStellenObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMZNStellenToString(ZuglenkungPackage.Literals.ENUMZN_STELLEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createFstr_Bildezeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFstr_Bildezeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createGK_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGK_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLenkabbruchzeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLenkabbruchzeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createPersonal_Reaktionszeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonal_Reaktionszeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSichtzeit_Vorsignal_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSichtzeit_Vorsignal_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSignalgruppe_Bezeichner_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalgruppe_Bezeichner_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTv_GK_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTv_GK_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVmax_Annaeherung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVmax_Annaeherung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createZL_Fstr_Zuschlag_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZL_Fstr_Zuschlag_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZuglenkungPackage getZuglenkungPackage() {
		return (ZuglenkungPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ZuglenkungPackage getPackage() {
		return ZuglenkungPackage.eINSTANCE;
	}

} //ZuglenkungFactoryImpl
