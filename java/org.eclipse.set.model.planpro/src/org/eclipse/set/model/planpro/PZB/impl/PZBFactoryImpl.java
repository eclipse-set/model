/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PZB.impl;

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

import org.eclipse.set.model.planpro.PZB.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PZBFactoryImpl extends EFactoryImpl implements PZBFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PZBFactory init() {
		try {
			PZBFactory thePZBFactory = (PZBFactory)EPackage.Registry.INSTANCE.getEFactory(PZBPackage.eNS_URI);
			if (thePZBFactory != null) {
				return thePZBFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PZBFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PZBFactoryImpl() {
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
			case PZBPackage.GUE_ABSTAND_ABWEICHEND_TYPE_CLASS: return createGUE_Abstand_Abweichend_TypeClass();
			case PZBPackage.GUE_ANORDNUNG_TYPE_CLASS: return createGUE_Anordnung_TypeClass();
			case PZBPackage.GUE_BAUART_TYPE_CLASS: return createGUE_Bauart_TypeClass();
			case PZBPackage.GUE_ENERGIEVERSORGUNG_TYPE_CLASS: return createGUE_Energieversorgung_TypeClass();
			case PZBPackage.GUE_MESSSTRECKE_TYPE_CLASS: return createGUE_Messstrecke_TypeClass();
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP: return createINA_Gefahrstelle_AttributeGroup();
			case PZBPackage.MESSFEHLER_TYPE_CLASS: return createMessfehler_TypeClass();
			case PZBPackage.PRIORITAET_GEFAHRSTELLE_TYPE_CLASS: return createPrioritaet_Gefahrstelle_TypeClass();
			case PZBPackage.PRUEFGESCHWINDIGKEIT_TYPE_CLASS: return createPruefgeschwindigkeit_TypeClass();
			case PZBPackage.PRUEFZEIT_TYPE_CLASS: return createPruefzeit_TypeClass();
			case PZBPackage.PZB_ABSTAND_GM_TYPE_CLASS: return createPZB_Abstand_GM_TypeClass();
			case PZBPackage.PZB_ART_TYPE_CLASS: return createPZB_Art_TypeClass();
			case PZBPackage.PZB_ELEMENT: return createPZB_Element();
			case PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP: return createPZB_Element_GM_AttributeGroup();
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP: return createPZB_Element_GUE_AttributeGroup();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG: return createPZB_Element_Zuordnung();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP: return createPZB_Element_Zuordnung_BP_AttributeGroup();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP: return createPZB_Element_Zuordnung_Fstr_AttributeGroup();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP: return createPZB_Element_Zuordnung_INA_AttributeGroup();
			case PZBPackage.PZB_INA_TYPE_CLASS: return createPZB_INA_TypeClass();
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL: return createPZB_Zuordnung_Signal();
			case PZBPackage.WIRKSAMKEIT_FSTR_TYPE_CLASS: return createWirksamkeit_Fstr_TypeClass();
			case PZBPackage.WIRKSAMKEIT_TYPE_CLASS: return createWirksamkeit_TypeClass();
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
			case PZBPackage.ENUMGUE_ANORDNUNG:
				return createENUMGUEAnordnungFromString(eDataType, initialValue);
			case PZBPackage.ENUMGUE_BAUART:
				return createENUMGUEBauartFromString(eDataType, initialValue);
			case PZBPackage.ENUMGUE_ENERGIEVERSORGUNG:
				return createENUMGUEEnergieversorgungFromString(eDataType, initialValue);
			case PZBPackage.ENUM_MESSFEHLER:
				return createENUMMessfehlerFromString(eDataType, initialValue);
			case PZBPackage.ENUMPZB_ART:
				return createENUMPZBArtFromString(eDataType, initialValue);
			case PZBPackage.ENUM_WIRKSAMKEIT:
				return createENUMWirksamkeitFromString(eDataType, initialValue);
			case PZBPackage.ENUM_WIRKSAMKEIT_FSTR:
				return createENUMWirksamkeitFstrFromString(eDataType, initialValue);
			case PZBPackage.ENUMGUE_ANORDNUNG_OBJECT:
				return createENUMGUEAnordnungObjectFromString(eDataType, initialValue);
			case PZBPackage.ENUMGUE_BAUART_OBJECT:
				return createENUMGUEBauartObjectFromString(eDataType, initialValue);
			case PZBPackage.ENUMGUE_ENERGIEVERSORGUNG_OBJECT:
				return createENUMGUEEnergieversorgungObjectFromString(eDataType, initialValue);
			case PZBPackage.ENUM_MESSFEHLER_OBJECT:
				return createENUMMessfehlerObjectFromString(eDataType, initialValue);
			case PZBPackage.ENUMPZB_ART_OBJECT:
				return createENUMPZBArtObjectFromString(eDataType, initialValue);
			case PZBPackage.ENUM_WIRKSAMKEIT_FSTR_OBJECT:
				return createENUMWirksamkeitFstrObjectFromString(eDataType, initialValue);
			case PZBPackage.ENUM_WIRKSAMKEIT_OBJECT:
				return createENUMWirksamkeitObjectFromString(eDataType, initialValue);
			case PZBPackage.GUE_ABSTAND_ABWEICHEND_TYPE:
				return createGUE_Abstand_Abweichend_TypeFromString(eDataType, initialValue);
			case PZBPackage.GUE_MESSSTRECKE_TYPE:
				return createGUE_Messstrecke_TypeFromString(eDataType, initialValue);
			case PZBPackage.PRIORITAET_GEFAHRSTELLE_TYPE:
				return createPrioritaet_Gefahrstelle_TypeFromString(eDataType, initialValue);
			case PZBPackage.PRUEFGESCHWINDIGKEIT_TYPE:
				return createPruefgeschwindigkeit_TypeFromString(eDataType, initialValue);
			case PZBPackage.PRUEFZEIT_TYPE:
				return createPruefzeit_TypeFromString(eDataType, initialValue);
			case PZBPackage.PZB_ABSTAND_GM_TYPE:
				return createPZB_Abstand_GM_TypeFromString(eDataType, initialValue);
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
			case PZBPackage.ENUMGUE_ANORDNUNG:
				return convertENUMGUEAnordnungToString(eDataType, instanceValue);
			case PZBPackage.ENUMGUE_BAUART:
				return convertENUMGUEBauartToString(eDataType, instanceValue);
			case PZBPackage.ENUMGUE_ENERGIEVERSORGUNG:
				return convertENUMGUEEnergieversorgungToString(eDataType, instanceValue);
			case PZBPackage.ENUM_MESSFEHLER:
				return convertENUMMessfehlerToString(eDataType, instanceValue);
			case PZBPackage.ENUMPZB_ART:
				return convertENUMPZBArtToString(eDataType, instanceValue);
			case PZBPackage.ENUM_WIRKSAMKEIT:
				return convertENUMWirksamkeitToString(eDataType, instanceValue);
			case PZBPackage.ENUM_WIRKSAMKEIT_FSTR:
				return convertENUMWirksamkeitFstrToString(eDataType, instanceValue);
			case PZBPackage.ENUMGUE_ANORDNUNG_OBJECT:
				return convertENUMGUEAnordnungObjectToString(eDataType, instanceValue);
			case PZBPackage.ENUMGUE_BAUART_OBJECT:
				return convertENUMGUEBauartObjectToString(eDataType, instanceValue);
			case PZBPackage.ENUMGUE_ENERGIEVERSORGUNG_OBJECT:
				return convertENUMGUEEnergieversorgungObjectToString(eDataType, instanceValue);
			case PZBPackage.ENUM_MESSFEHLER_OBJECT:
				return convertENUMMessfehlerObjectToString(eDataType, instanceValue);
			case PZBPackage.ENUMPZB_ART_OBJECT:
				return convertENUMPZBArtObjectToString(eDataType, instanceValue);
			case PZBPackage.ENUM_WIRKSAMKEIT_FSTR_OBJECT:
				return convertENUMWirksamkeitFstrObjectToString(eDataType, instanceValue);
			case PZBPackage.ENUM_WIRKSAMKEIT_OBJECT:
				return convertENUMWirksamkeitObjectToString(eDataType, instanceValue);
			case PZBPackage.GUE_ABSTAND_ABWEICHEND_TYPE:
				return convertGUE_Abstand_Abweichend_TypeToString(eDataType, instanceValue);
			case PZBPackage.GUE_MESSSTRECKE_TYPE:
				return convertGUE_Messstrecke_TypeToString(eDataType, instanceValue);
			case PZBPackage.PRIORITAET_GEFAHRSTELLE_TYPE:
				return convertPrioritaet_Gefahrstelle_TypeToString(eDataType, instanceValue);
			case PZBPackage.PRUEFGESCHWINDIGKEIT_TYPE:
				return convertPruefgeschwindigkeit_TypeToString(eDataType, instanceValue);
			case PZBPackage.PRUEFZEIT_TYPE:
				return convertPruefzeit_TypeToString(eDataType, instanceValue);
			case PZBPackage.PZB_ABSTAND_GM_TYPE:
				return convertPZB_Abstand_GM_TypeToString(eDataType, instanceValue);
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
	public GUE_Abstand_Abweichend_TypeClass createGUE_Abstand_Abweichend_TypeClass() {
		GUE_Abstand_Abweichend_TypeClassImpl guE_Abstand_Abweichend_TypeClass = new GUE_Abstand_Abweichend_TypeClassImpl();
		return guE_Abstand_Abweichend_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GUE_Anordnung_TypeClass createGUE_Anordnung_TypeClass() {
		GUE_Anordnung_TypeClassImpl guE_Anordnung_TypeClass = new GUE_Anordnung_TypeClassImpl();
		return guE_Anordnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GUE_Bauart_TypeClass createGUE_Bauart_TypeClass() {
		GUE_Bauart_TypeClassImpl guE_Bauart_TypeClass = new GUE_Bauart_TypeClassImpl();
		return guE_Bauart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GUE_Energieversorgung_TypeClass createGUE_Energieversorgung_TypeClass() {
		GUE_Energieversorgung_TypeClassImpl guE_Energieversorgung_TypeClass = new GUE_Energieversorgung_TypeClassImpl();
		return guE_Energieversorgung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GUE_Messstrecke_TypeClass createGUE_Messstrecke_TypeClass() {
		GUE_Messstrecke_TypeClassImpl guE_Messstrecke_TypeClass = new GUE_Messstrecke_TypeClassImpl();
		return guE_Messstrecke_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public INA_Gefahrstelle_AttributeGroup createINA_Gefahrstelle_AttributeGroup() {
		INA_Gefahrstelle_AttributeGroupImpl inA_Gefahrstelle_AttributeGroup = new INA_Gefahrstelle_AttributeGroupImpl();
		return inA_Gefahrstelle_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Messfehler_TypeClass createMessfehler_TypeClass() {
		Messfehler_TypeClassImpl messfehler_TypeClass = new Messfehler_TypeClassImpl();
		return messfehler_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prioritaet_Gefahrstelle_TypeClass createPrioritaet_Gefahrstelle_TypeClass() {
		Prioritaet_Gefahrstelle_TypeClassImpl prioritaet_Gefahrstelle_TypeClass = new Prioritaet_Gefahrstelle_TypeClassImpl();
		return prioritaet_Gefahrstelle_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefgeschwindigkeit_TypeClass createPruefgeschwindigkeit_TypeClass() {
		Pruefgeschwindigkeit_TypeClassImpl pruefgeschwindigkeit_TypeClass = new Pruefgeschwindigkeit_TypeClassImpl();
		return pruefgeschwindigkeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefzeit_TypeClass createPruefzeit_TypeClass() {
		Pruefzeit_TypeClassImpl pruefzeit_TypeClass = new Pruefzeit_TypeClassImpl();
		return pruefzeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Abstand_GM_TypeClass createPZB_Abstand_GM_TypeClass() {
		PZB_Abstand_GM_TypeClassImpl pzB_Abstand_GM_TypeClass = new PZB_Abstand_GM_TypeClassImpl();
		return pzB_Abstand_GM_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Art_TypeClass createPZB_Art_TypeClass() {
		PZB_Art_TypeClassImpl pzB_Art_TypeClass = new PZB_Art_TypeClassImpl();
		return pzB_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element createPZB_Element() {
		PZB_ElementImpl pzB_Element = new PZB_ElementImpl();
		return pzB_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_GM_AttributeGroup createPZB_Element_GM_AttributeGroup() {
		PZB_Element_GM_AttributeGroupImpl pzB_Element_GM_AttributeGroup = new PZB_Element_GM_AttributeGroupImpl();
		return pzB_Element_GM_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_GUE_AttributeGroup createPZB_Element_GUE_AttributeGroup() {
		PZB_Element_GUE_AttributeGroupImpl pzB_Element_GUE_AttributeGroup = new PZB_Element_GUE_AttributeGroupImpl();
		return pzB_Element_GUE_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_Zuordnung createPZB_Element_Zuordnung() {
		PZB_Element_ZuordnungImpl pzB_Element_Zuordnung = new PZB_Element_ZuordnungImpl();
		return pzB_Element_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_Zuordnung_BP_AttributeGroup createPZB_Element_Zuordnung_BP_AttributeGroup() {
		PZB_Element_Zuordnung_BP_AttributeGroupImpl pzB_Element_Zuordnung_BP_AttributeGroup = new PZB_Element_Zuordnung_BP_AttributeGroupImpl();
		return pzB_Element_Zuordnung_BP_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_Zuordnung_Fstr_AttributeGroup createPZB_Element_Zuordnung_Fstr_AttributeGroup() {
		PZB_Element_Zuordnung_Fstr_AttributeGroupImpl pzB_Element_Zuordnung_Fstr_AttributeGroup = new PZB_Element_Zuordnung_Fstr_AttributeGroupImpl();
		return pzB_Element_Zuordnung_Fstr_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_Zuordnung_INA_AttributeGroup createPZB_Element_Zuordnung_INA_AttributeGroup() {
		PZB_Element_Zuordnung_INA_AttributeGroupImpl pzB_Element_Zuordnung_INA_AttributeGroup = new PZB_Element_Zuordnung_INA_AttributeGroupImpl();
		return pzB_Element_Zuordnung_INA_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_INA_TypeClass createPZB_INA_TypeClass() {
		PZB_INA_TypeClassImpl pzB_INA_TypeClass = new PZB_INA_TypeClassImpl();
		return pzB_INA_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Zuordnung_Signal createPZB_Zuordnung_Signal() {
		PZB_Zuordnung_SignalImpl pzB_Zuordnung_Signal = new PZB_Zuordnung_SignalImpl();
		return pzB_Zuordnung_Signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirksamkeit_Fstr_TypeClass createWirksamkeit_Fstr_TypeClass() {
		Wirksamkeit_Fstr_TypeClassImpl wirksamkeit_Fstr_TypeClass = new Wirksamkeit_Fstr_TypeClassImpl();
		return wirksamkeit_Fstr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirksamkeit_TypeClass createWirksamkeit_TypeClass() {
		Wirksamkeit_TypeClassImpl wirksamkeit_TypeClass = new Wirksamkeit_TypeClassImpl();
		return wirksamkeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGUEAnordnung createENUMGUEAnordnungFromString(EDataType eDataType, String initialValue) {
		ENUMGUEAnordnung result = ENUMGUEAnordnung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGUEAnordnungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGUEBauart createENUMGUEBauartFromString(EDataType eDataType, String initialValue) {
		ENUMGUEBauart result = ENUMGUEBauart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGUEBauartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGUEEnergieversorgung createENUMGUEEnergieversorgungFromString(EDataType eDataType, String initialValue) {
		ENUMGUEEnergieversorgung result = ENUMGUEEnergieversorgung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGUEEnergieversorgungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMMessfehler createENUMMessfehlerFromString(EDataType eDataType, String initialValue) {
		ENUMMessfehler result = ENUMMessfehler.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMMessfehlerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPZBArt createENUMPZBArtFromString(EDataType eDataType, String initialValue) {
		ENUMPZBArt result = ENUMPZBArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPZBArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWirksamkeit createENUMWirksamkeitFromString(EDataType eDataType, String initialValue) {
		ENUMWirksamkeit result = ENUMWirksamkeit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWirksamkeitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWirksamkeitFstr createENUMWirksamkeitFstrFromString(EDataType eDataType, String initialValue) {
		ENUMWirksamkeitFstr result = ENUMWirksamkeitFstr.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWirksamkeitFstrToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGUEAnordnung createENUMGUEAnordnungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGUEAnordnungFromString(PZBPackage.Literals.ENUMGUE_ANORDNUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGUEAnordnungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGUEAnordnungToString(PZBPackage.Literals.ENUMGUE_ANORDNUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGUEBauart createENUMGUEBauartObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGUEBauartFromString(PZBPackage.Literals.ENUMGUE_BAUART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGUEBauartObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGUEBauartToString(PZBPackage.Literals.ENUMGUE_BAUART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGUEEnergieversorgung createENUMGUEEnergieversorgungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGUEEnergieversorgungFromString(PZBPackage.Literals.ENUMGUE_ENERGIEVERSORGUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGUEEnergieversorgungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGUEEnergieversorgungToString(PZBPackage.Literals.ENUMGUE_ENERGIEVERSORGUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMMessfehler createENUMMessfehlerObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMMessfehlerFromString(PZBPackage.Literals.ENUM_MESSFEHLER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMMessfehlerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMMessfehlerToString(PZBPackage.Literals.ENUM_MESSFEHLER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPZBArt createENUMPZBArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMPZBArtFromString(PZBPackage.Literals.ENUMPZB_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPZBArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMPZBArtToString(PZBPackage.Literals.ENUMPZB_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWirksamkeitFstr createENUMWirksamkeitFstrObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMWirksamkeitFstrFromString(PZBPackage.Literals.ENUM_WIRKSAMKEIT_FSTR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWirksamkeitFstrObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMWirksamkeitFstrToString(PZBPackage.Literals.ENUM_WIRKSAMKEIT_FSTR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWirksamkeit createENUMWirksamkeitObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMWirksamkeitFromString(PZBPackage.Literals.ENUM_WIRKSAMKEIT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWirksamkeitObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMWirksamkeitToString(PZBPackage.Literals.ENUM_WIRKSAMKEIT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createGUE_Abstand_Abweichend_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGUE_Abstand_Abweichend_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createGUE_Messstrecke_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGUE_Messstrecke_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPrioritaet_Gefahrstelle_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrioritaet_Gefahrstelle_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPruefgeschwindigkeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPruefgeschwindigkeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createPruefzeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPruefzeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createPZB_Abstand_GM_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPZB_Abstand_GM_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZBPackage getPZBPackage() {
		return (PZBPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PZBPackage getPackage() {
		return PZBPackage.eINSTANCE;
	}

} //PZBFactoryImpl
