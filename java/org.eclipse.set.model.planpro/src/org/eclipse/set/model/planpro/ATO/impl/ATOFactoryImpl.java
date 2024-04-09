/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.ATO.impl;

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

import org.eclipse.set.model.planpro.ATO.*;

import org.eclipse.set.model.planpro.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ATOFactoryImpl extends EFactoryImpl implements ATOFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ATOFactory init() {
		try {
			ATOFactory theATOFactory = (ATOFactory)EPackage.Registry.INSTANCE.getEFactory(ATOPackage.eNS_URI);
			if (theATOFactory != null) {
				return theATOFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ATOFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATOFactoryImpl() {
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
			case ATOPackage.ABSTAND_ATO_HALT_VOR_EO_ATYPE_CLASS: return createAbstand_ATO_Halt_Vor_EoA_TypeClass();
			case ATOPackage.ATO_SEGMENT_PROFILE: return createATO_Segment_Profile();
			case ATOPackage.ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP: return createATO_Segment_Profile_Bezeichnung_AttributeGroup();
			case ATOPackage.ATO_TIMING_POINT: return createATO_Timing_Point();
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP: return createATO_Timing_Point_Allg_AttributeGroup();
			case ATOPackage.ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP: return createATO_Timing_Point_Bezeichnung_AttributeGroup();
			case ATOPackage.ATO_TS_INSTANZ: return createATO_TS_Instanz();
			case ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP: return createATO_TS_Instanz_Adresse_AttributeGroup();
			case ATOPackage.BEZEICHNUNG_ATO_TP_TYPE_CLASS: return createBezeichnung_ATO_TP_TypeClass();
			case ATOPackage.ERREICHUNGSTOLERANZ_TYPE_CLASS: return createErreichungstoleranz_TypeClass();
			case ATOPackage.HALTETOLERANZ_TYPE_CLASS: return createHaltetoleranz_TypeClass();
			case ATOPackage.NID_ATOTS_TYPE_CLASS: return createNID_ATOTS_TypeClass();
			case ATOPackage.NID_CATOTS_TYPE_CLASS: return createNID_C_ATOTS_TypeClass();
			case ATOPackage.NID_SP_TYPE_CLASS: return createNID_SP_TypeClass();
			case ATOPackage.NID_TP_TYPE_CLASS: return createNID_TP_TypeClass();
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
			case ATOPackage.ABSTAND_ATO_HALT_VOR_EO_ATYPE:
				return createAbstand_ATO_Halt_Vor_EoA_TypeFromString(eDataType, initialValue);
			case ATOPackage.BEZEICHNUNG_ATO_TP_TYPE:
				return createBezeichnung_ATO_TP_TypeFromString(eDataType, initialValue);
			case ATOPackage.ERREICHUNGSTOLERANZ_TYPE:
				return createErreichungstoleranz_TypeFromString(eDataType, initialValue);
			case ATOPackage.HALTETOLERANZ_TYPE:
				return createHaltetoleranz_TypeFromString(eDataType, initialValue);
			case ATOPackage.NID_ATOTS_TYPE:
				return createNID_ATOTS_TypeFromString(eDataType, initialValue);
			case ATOPackage.NID_CATOTS_TYPE:
				return createNID_C_ATOTS_TypeFromString(eDataType, initialValue);
			case ATOPackage.NID_SP_TYPE:
				return createNID_SP_TypeFromString(eDataType, initialValue);
			case ATOPackage.NID_TP_TYPE:
				return createNID_TP_TypeFromString(eDataType, initialValue);
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
			case ATOPackage.ABSTAND_ATO_HALT_VOR_EO_ATYPE:
				return convertAbstand_ATO_Halt_Vor_EoA_TypeToString(eDataType, instanceValue);
			case ATOPackage.BEZEICHNUNG_ATO_TP_TYPE:
				return convertBezeichnung_ATO_TP_TypeToString(eDataType, instanceValue);
			case ATOPackage.ERREICHUNGSTOLERANZ_TYPE:
				return convertErreichungstoleranz_TypeToString(eDataType, instanceValue);
			case ATOPackage.HALTETOLERANZ_TYPE:
				return convertHaltetoleranz_TypeToString(eDataType, instanceValue);
			case ATOPackage.NID_ATOTS_TYPE:
				return convertNID_ATOTS_TypeToString(eDataType, instanceValue);
			case ATOPackage.NID_CATOTS_TYPE:
				return convertNID_C_ATOTS_TypeToString(eDataType, instanceValue);
			case ATOPackage.NID_SP_TYPE:
				return convertNID_SP_TypeToString(eDataType, instanceValue);
			case ATOPackage.NID_TP_TYPE:
				return convertNID_TP_TypeToString(eDataType, instanceValue);
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
	public Abstand_ATO_Halt_Vor_EoA_TypeClass createAbstand_ATO_Halt_Vor_EoA_TypeClass() {
		Abstand_ATO_Halt_Vor_EoA_TypeClassImpl abstand_ATO_Halt_Vor_EoA_TypeClass = new Abstand_ATO_Halt_Vor_EoA_TypeClassImpl();
		return abstand_ATO_Halt_Vor_EoA_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_Segment_Profile createATO_Segment_Profile() {
		ATO_Segment_ProfileImpl atO_Segment_Profile = new ATO_Segment_ProfileImpl();
		return atO_Segment_Profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_Segment_Profile_Bezeichnung_AttributeGroup createATO_Segment_Profile_Bezeichnung_AttributeGroup() {
		ATO_Segment_Profile_Bezeichnung_AttributeGroupImpl atO_Segment_Profile_Bezeichnung_AttributeGroup = new ATO_Segment_Profile_Bezeichnung_AttributeGroupImpl();
		return atO_Segment_Profile_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_Timing_Point createATO_Timing_Point() {
		ATO_Timing_PointImpl atO_Timing_Point = new ATO_Timing_PointImpl();
		return atO_Timing_Point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_Timing_Point_Allg_AttributeGroup createATO_Timing_Point_Allg_AttributeGroup() {
		ATO_Timing_Point_Allg_AttributeGroupImpl atO_Timing_Point_Allg_AttributeGroup = new ATO_Timing_Point_Allg_AttributeGroupImpl();
		return atO_Timing_Point_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_Timing_Point_Bezeichnung_AttributeGroup createATO_Timing_Point_Bezeichnung_AttributeGroup() {
		ATO_Timing_Point_Bezeichnung_AttributeGroupImpl atO_Timing_Point_Bezeichnung_AttributeGroup = new ATO_Timing_Point_Bezeichnung_AttributeGroupImpl();
		return atO_Timing_Point_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_TS_Instanz createATO_TS_Instanz() {
		ATO_TS_InstanzImpl atO_TS_Instanz = new ATO_TS_InstanzImpl();
		return atO_TS_Instanz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_TS_Instanz_Adresse_AttributeGroup createATO_TS_Instanz_Adresse_AttributeGroup() {
		ATO_TS_Instanz_Adresse_AttributeGroupImpl atO_TS_Instanz_Adresse_AttributeGroup = new ATO_TS_Instanz_Adresse_AttributeGroupImpl();
		return atO_TS_Instanz_Adresse_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_ATO_TP_TypeClass createBezeichnung_ATO_TP_TypeClass() {
		Bezeichnung_ATO_TP_TypeClassImpl bezeichnung_ATO_TP_TypeClass = new Bezeichnung_ATO_TP_TypeClassImpl();
		return bezeichnung_ATO_TP_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Erreichungstoleranz_TypeClass createErreichungstoleranz_TypeClass() {
		Erreichungstoleranz_TypeClassImpl erreichungstoleranz_TypeClass = new Erreichungstoleranz_TypeClassImpl();
		return erreichungstoleranz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Haltetoleranz_TypeClass createHaltetoleranz_TypeClass() {
		Haltetoleranz_TypeClassImpl haltetoleranz_TypeClass = new Haltetoleranz_TypeClassImpl();
		return haltetoleranz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_ATOTS_TypeClass createNID_ATOTS_TypeClass() {
		NID_ATOTS_TypeClassImpl niD_ATOTS_TypeClass = new NID_ATOTS_TypeClassImpl();
		return niD_ATOTS_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_C_ATOTS_TypeClass createNID_C_ATOTS_TypeClass() {
		NID_C_ATOTS_TypeClassImpl niD_C_ATOTS_TypeClass = new NID_C_ATOTS_TypeClassImpl();
		return niD_C_ATOTS_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_SP_TypeClass createNID_SP_TypeClass() {
		NID_SP_TypeClassImpl niD_SP_TypeClass = new NID_SP_TypeClassImpl();
		return niD_SP_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_TP_TypeClass createNID_TP_TypeClass() {
		NID_TP_TypeClassImpl niD_TP_TypeClass = new NID_TP_TypeClassImpl();
		return niD_TP_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAbstand_ATO_Halt_Vor_EoA_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstand_ATO_Halt_Vor_EoA_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_ATO_TP_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_ATO_TP_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createErreichungstoleranz_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErreichungstoleranz_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createHaltetoleranz_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHaltetoleranz_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNID_ATOTS_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNID_ATOTS_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNID_C_ATOTS_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNID_C_ATOTS_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNID_SP_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNID_SP_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNID_TP_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNID_TP_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATOPackage getATOPackage() {
		return (ATOPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ATOPackage getPackage() {
		return ATOPackage.eINSTANCE;
	}

} //ATOFactoryImpl
