/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.ATO;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.
 * 
 * Weitere Informationen zur Lizenz finden Sie auf
 * http://www.dbinfrago.com/planpro
 * 
 * Inhalt der Datei:
 * XML Schema für PlanPro Schnittstelle.
 * 
 * Bei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com
 * 
 * --------------------------------------------------------------------------------
 * 
 * This Document is licensed under the open source license RailPL V1.1.
 * 
 * More information about the license can be found on
 * http://www.dbinfrago.com/planpro
 * 
 * Contents of the file:
 * XML Schema for PlanPro interface.
 * Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.
 * 
 * Weitere Informationen zur Lizenz finden Sie auf
 * http://www.dbinfrago.com/planpro
 * 
 * Inhalt der Datei:
 * XML Schema für PlanPro Schnittstelle.
 * 
 * Bei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com
 * 
 * --------------------------------------------------------------------------------
 * 
 * This Document is licensed under the open source license RailPL V1.1.
 * 
 * More information about the license can be found on
 * http://www.dbinfrago.com/planpro
 * 
 * Contents of the file:
 * XML Schema for PlanPro interface.
 * Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.
 * 
 * Weitere Informationen zur Lizenz finden Sie auf
 * http://www.dbinfrago.com/planpro
 * 
 * Inhalt der Datei:
 * XML Schema für PlanPro Schnittstelle.
 * 
 * Bei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com
 * 
 * --------------------------------------------------------------------------------
 * 
 * This Document is licensed under the open source license RailPL V1.1.
 * 
 * More information about the license can be found on
 * http://www.dbinfrago.com/planpro
 * 
 * Contents of the file:
 * XML Schema for PlanPro interface.
 * Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.
 * 
 * Weitere Informationen zur Lizenz finden Sie auf
 * http://www.dbinfrago.com/planpro
 * 
 * Inhalt der Datei:
 * XML Schema für PlanPro Schnittstelle.
 * 
 * Bei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com
 * 
 * --------------------------------------------------------------------------------
 * 
 * This Document is licensed under the open source license RailPL V1.1.
 * 
 * More information about the license can be found on
 * http://www.dbinfrago.com/planpro
 * 
 * Contents of the file:
 * XML Schema for PlanPro interface.
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.planpro.ATO.ATOFactory
 * @model kind="package"
 * @generated
 */
public interface ATOPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ATO";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/ATO/1.10.0.3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsATO";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ATOPackage eINSTANCE = org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.Abstand_ATO_Halt_Vor_EoA_TypeClassImpl <em>Abstand ATO Halt Vor Eo AType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.Abstand_ATO_Halt_Vor_EoA_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getAbstand_ATO_Halt_Vor_EoA_TypeClass()
	 * @generated
	 */
	int ABSTAND_ATO_HALT_VOR_EO_ATYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTAND_ATO_HALT_VOR_EO_ATYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTAND_ATO_HALT_VOR_EO_ATYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstand ATO Halt Vor Eo AType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTAND_ATO_HALT_VOR_EO_ATYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_ProfileImpl <em>ATO Segment Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_ProfileImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_Segment_Profile()
	 * @generated
	 */
	int ATO_SEGMENT_PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Abstand ATO Halt Vor Eo A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDATOTS Instanz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>IDATOTS Instanz Nachbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>IDETCS Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE__IDETCS_KANTE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>ATO Segment Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_Profile_Bezeichnung_AttributeGroupImpl <em>ATO Segment Profile Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_Profile_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_Segment_Profile_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP = 2;

	/**
	 * The feature id for the '<em><b>NIDSP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP__NIDSP = 0;

	/**
	 * The number of structural features of the '<em>ATO Segment Profile Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_PointImpl <em>ATO Timing Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_PointImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_Timing_Point()
	 * @generated
	 */
	int ATO_TIMING_POINT = 3;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.PUNKT_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>ATO Timing Point Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT__BEZEICHNUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT__ID_SIGNAL = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ATO Timing Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_Point_Allg_AttributeGroupImpl <em>ATO Timing Point Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_Point_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_Timing_Point_Allg_AttributeGroup()
	 * @generated
	 */
	int ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Erreichungstoleranz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__ERREICHUNGSTOLERANZ = 0;

	/**
	 * The feature id for the '<em><b>Haltetoleranz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__HALTETOLERANZ = 1;

	/**
	 * The feature id for the '<em><b>NIDTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__NIDTP = 2;

	/**
	 * The number of structural features of the '<em>ATO Timing Point Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_Point_Bezeichnung_AttributeGroupImpl <em>ATO Timing Point Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_Point_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_Timing_Point_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Bezeichnung ATOTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ATOTP = 0;

	/**
	 * The number of structural features of the '<em>ATO Timing Point Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_TS_InstanzImpl <em>ATO TS Instanz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_TS_InstanzImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_TS_Instanz()
	 * @generated
	 */
	int ATO_TS_INSTANZ = 6;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TS_INSTANZ__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TS_INSTANZ__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TS_INSTANZ__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TS_INSTANZ__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TS_INSTANZ__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ATOTS Instanz Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TS_INSTANZ__ID_UNTERBRINGUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ATO TS Instanz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TS_INSTANZ_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_TS_Instanz_Adresse_AttributeGroupImpl <em>ATO TS Instanz Adresse Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_TS_Instanz_Adresse_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_TS_Instanz_Adresse_AttributeGroup()
	 * @generated
	 */
	int ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP = 7;

	/**
	 * The feature id for the '<em><b>NIDATOTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDATOTS = 0;

	/**
	 * The feature id for the '<em><b>NIDCATOTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDCATOTS = 1;

	/**
	 * The number of structural features of the '<em>ATO TS Instanz Adresse Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.Bezeichnung_ATO_TP_TypeClassImpl <em>Bezeichnung ATO TP Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.Bezeichnung_ATO_TP_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getBezeichnung_ATO_TP_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_ATO_TP_TYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_ATO_TP_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_ATO_TP_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung ATO TP Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_ATO_TP_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.Erreichungstoleranz_TypeClassImpl <em>Erreichungstoleranz Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.Erreichungstoleranz_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getErreichungstoleranz_TypeClass()
	 * @generated
	 */
	int ERREICHUNGSTOLERANZ_TYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHUNGSTOLERANZ_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHUNGSTOLERANZ_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erreichungstoleranz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHUNGSTOLERANZ_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.Haltetoleranz_TypeClassImpl <em>Haltetoleranz Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.Haltetoleranz_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getHaltetoleranz_TypeClass()
	 * @generated
	 */
	int HALTETOLERANZ_TYPE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTETOLERANZ_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTETOLERANZ_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Haltetoleranz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALTETOLERANZ_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.NID_ATOTS_TypeClassImpl <em>NID ATOTS Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.NID_ATOTS_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_ATOTS_TypeClass()
	 * @generated
	 */
	int NID_ATOTS_TYPE_CLASS = 11;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NID_ATOTS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NID_ATOTS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NID ATOTS Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NID_ATOTS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.NID_C_ATOTS_TypeClassImpl <em>NID CATOTS Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.NID_C_ATOTS_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_C_ATOTS_TypeClass()
	 * @generated
	 */
	int NID_CATOTS_TYPE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NID_CATOTS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NID_CATOTS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NID CATOTS Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NID_CATOTS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.NID_SP_TypeClassImpl <em>NID SP Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.NID_SP_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_SP_TypeClass()
	 * @generated
	 */
	int NID_SP_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NID_SP_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NID_SP_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NID SP Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NID_SP_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.ATO.impl.NID_TP_TypeClassImpl <em>NID TP Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.ATO.impl.NID_TP_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_TP_TypeClass()
	 * @generated
	 */
	int NID_TP_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NID_TP_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NID_TP_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NID TP Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NID_TP_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Abstand ATO Halt Vor Eo AType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getAbstand_ATO_Halt_Vor_EoA_Type()
	 * @generated
	 */
	int ABSTAND_ATO_HALT_VOR_EO_ATYPE = 15;

	/**
	 * The meta object id for the '<em>Bezeichnung ATO TP Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getBezeichnung_ATO_TP_Type()
	 * @generated
	 */
	int BEZEICHNUNG_ATO_TP_TYPE = 16;

	/**
	 * The meta object id for the '<em>Erreichungstoleranz Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getErreichungstoleranz_Type()
	 * @generated
	 */
	int ERREICHUNGSTOLERANZ_TYPE = 17;

	/**
	 * The meta object id for the '<em>Haltetoleranz Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getHaltetoleranz_Type()
	 * @generated
	 */
	int HALTETOLERANZ_TYPE = 18;

	/**
	 * The meta object id for the '<em>NID ATOTS Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_ATOTS_Type()
	 * @generated
	 */
	int NID_ATOTS_TYPE = 19;

	/**
	 * The meta object id for the '<em>NID CATOTS Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_C_ATOTS_Type()
	 * @generated
	 */
	int NID_CATOTS_TYPE = 20;

	/**
	 * The meta object id for the '<em>NID SP Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_SP_Type()
	 * @generated
	 */
	int NID_SP_TYPE = 21;

	/**
	 * The meta object id for the '<em>NID TP Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_TP_Type()
	 * @generated
	 */
	int NID_TP_TYPE = 22;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.Abstand_ATO_Halt_Vor_EoA_TypeClass <em>Abstand ATO Halt Vor Eo AType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstand ATO Halt Vor Eo AType Class</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.Abstand_ATO_Halt_Vor_EoA_TypeClass
	 * @generated
	 */
	EClass getAbstand_ATO_Halt_Vor_EoA_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.ATO.Abstand_ATO_Halt_Vor_EoA_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.Abstand_ATO_Halt_Vor_EoA_TypeClass#getWert()
	 * @see #getAbstand_ATO_Halt_Vor_EoA_TypeClass()
	 * @generated
	 */
	EAttribute getAbstand_ATO_Halt_Vor_EoA_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile <em>ATO Segment Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATO Segment Profile</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile
	 * @generated
	 */
	EClass getATO_Segment_Profile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile#getAbstandATOHaltVorEoA <em>Abstand ATO Halt Vor Eo A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstand ATO Halt Vor Eo A</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile#getAbstandATOHaltVorEoA()
	 * @see #getATO_Segment_Profile()
	 * @generated
	 */
	EReference getATO_Segment_Profile_AbstandATOHaltVorEoA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile#getBezeichnung()
	 * @see #getATO_Segment_Profile()
	 * @generated
	 */
	EReference getATO_Segment_Profile_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile#getIDATOTSInstanz <em>IDATOTS Instanz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDATOTS Instanz</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile#getIDATOTSInstanz()
	 * @see #getATO_Segment_Profile()
	 * @generated
	 */
	EReference getATO_Segment_Profile_IDATOTSInstanz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile#getIDATOTSInstanzNachbar <em>IDATOTS Instanz Nachbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDATOTS Instanz Nachbar</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile#getIDATOTSInstanzNachbar()
	 * @see #getATO_Segment_Profile()
	 * @generated
	 */
	EReference getATO_Segment_Profile_IDATOTSInstanzNachbar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile#getIDETCSKante <em>IDETCS Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDETCS Kante</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile#getIDETCSKante()
	 * @see #getATO_Segment_Profile()
	 * @generated
	 */
	EReference getATO_Segment_Profile_IDETCSKante();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile#getIDOertlichkeit <em>ID Oertlichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Oertlichkeit</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile#getIDOertlichkeit()
	 * @see #getATO_Segment_Profile()
	 * @generated
	 */
	EReference getATO_Segment_Profile_IDOertlichkeit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile_Bezeichnung_AttributeGroup <em>ATO Segment Profile Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATO Segment Profile Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getATO_Segment_Profile_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile_Bezeichnung_AttributeGroup#getNIDSP <em>NIDSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NIDSP</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile_Bezeichnung_AttributeGroup#getNIDSP()
	 * @see #getATO_Segment_Profile_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getATO_Segment_Profile_Bezeichnung_AttributeGroup_NIDSP();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point <em>ATO Timing Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATO Timing Point</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Timing_Point
	 * @generated
	 */
	EClass getATO_Timing_Point();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point#getATOTimingPointAllg <em>ATO Timing Point Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATO Timing Point Allg</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Timing_Point#getATOTimingPointAllg()
	 * @see #getATO_Timing_Point()
	 * @generated
	 */
	EReference getATO_Timing_Point_ATOTimingPointAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Timing_Point#getBezeichnung()
	 * @see #getATO_Timing_Point()
	 * @generated
	 */
	EReference getATO_Timing_Point_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point#getIDSignal <em>ID Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Timing_Point#getIDSignal()
	 * @see #getATO_Timing_Point()
	 * @generated
	 */
	EReference getATO_Timing_Point_IDSignal();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup <em>ATO Timing Point Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATO Timing Point Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup
	 * @generated
	 */
	EClass getATO_Timing_Point_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup#getErreichungstoleranz <em>Erreichungstoleranz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Erreichungstoleranz</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup#getErreichungstoleranz()
	 * @see #getATO_Timing_Point_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getATO_Timing_Point_Allg_AttributeGroup_Erreichungstoleranz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup#getHaltetoleranz <em>Haltetoleranz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Haltetoleranz</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup#getHaltetoleranz()
	 * @see #getATO_Timing_Point_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getATO_Timing_Point_Allg_AttributeGroup_Haltetoleranz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup#getNIDTP <em>NIDTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NIDTP</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup#getNIDTP()
	 * @see #getATO_Timing_Point_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getATO_Timing_Point_Allg_AttributeGroup_NIDTP();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Bezeichnung_AttributeGroup <em>ATO Timing Point Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATO Timing Point Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getATO_Timing_Point_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Bezeichnung_AttributeGroup#getBezeichnungATOTP <em>Bezeichnung ATOTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung ATOTP</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Bezeichnung_AttributeGroup#getBezeichnungATOTP()
	 * @see #getATO_Timing_Point_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getATO_Timing_Point_Bezeichnung_AttributeGroup_BezeichnungATOTP();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz <em>ATO TS Instanz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATO TS Instanz</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz
	 * @generated
	 */
	EClass getATO_TS_Instanz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz#getATOTSInstanzAdresse <em>ATOTS Instanz Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATOTS Instanz Adresse</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz#getATOTSInstanzAdresse()
	 * @see #getATO_TS_Instanz()
	 * @generated
	 */
	EReference getATO_TS_Instanz_ATOTSInstanzAdresse();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz#getIDUnterbringung <em>ID Unterbringung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Unterbringung</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz#getIDUnterbringung()
	 * @see #getATO_TS_Instanz()
	 * @generated
	 */
	EReference getATO_TS_Instanz_IDUnterbringung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz_Adresse_AttributeGroup <em>ATO TS Instanz Adresse Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATO TS Instanz Adresse Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz_Adresse_AttributeGroup
	 * @generated
	 */
	EClass getATO_TS_Instanz_Adresse_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz_Adresse_AttributeGroup#getNIDATOTS <em>NIDATOTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NIDATOTS</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz_Adresse_AttributeGroup#getNIDATOTS()
	 * @see #getATO_TS_Instanz_Adresse_AttributeGroup()
	 * @generated
	 */
	EReference getATO_TS_Instanz_Adresse_AttributeGroup_NIDATOTS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz_Adresse_AttributeGroup#getNIDCATOTS <em>NIDCATOTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NIDCATOTS</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz_Adresse_AttributeGroup#getNIDCATOTS()
	 * @see #getATO_TS_Instanz_Adresse_AttributeGroup()
	 * @generated
	 */
	EReference getATO_TS_Instanz_Adresse_AttributeGroup_NIDCATOTS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.Bezeichnung_ATO_TP_TypeClass <em>Bezeichnung ATO TP Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung ATO TP Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.Bezeichnung_ATO_TP_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_ATO_TP_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.ATO.Bezeichnung_ATO_TP_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.Bezeichnung_ATO_TP_TypeClass#getWert()
	 * @see #getBezeichnung_ATO_TP_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_ATO_TP_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.Erreichungstoleranz_TypeClass <em>Erreichungstoleranz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erreichungstoleranz Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.Erreichungstoleranz_TypeClass
	 * @generated
	 */
	EClass getErreichungstoleranz_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.ATO.Erreichungstoleranz_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.Erreichungstoleranz_TypeClass#getWert()
	 * @see #getErreichungstoleranz_TypeClass()
	 * @generated
	 */
	EAttribute getErreichungstoleranz_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.Haltetoleranz_TypeClass <em>Haltetoleranz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Haltetoleranz Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.Haltetoleranz_TypeClass
	 * @generated
	 */
	EClass getHaltetoleranz_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.ATO.Haltetoleranz_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.Haltetoleranz_TypeClass#getWert()
	 * @see #getHaltetoleranz_TypeClass()
	 * @generated
	 */
	EAttribute getHaltetoleranz_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.NID_ATOTS_TypeClass <em>NID ATOTS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NID ATOTS Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.NID_ATOTS_TypeClass
	 * @generated
	 */
	EClass getNID_ATOTS_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.ATO.NID_ATOTS_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.NID_ATOTS_TypeClass#getWert()
	 * @see #getNID_ATOTS_TypeClass()
	 * @generated
	 */
	EAttribute getNID_ATOTS_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.NID_C_ATOTS_TypeClass <em>NID CATOTS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NID CATOTS Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.NID_C_ATOTS_TypeClass
	 * @generated
	 */
	EClass getNID_C_ATOTS_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.ATO.NID_C_ATOTS_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.NID_C_ATOTS_TypeClass#getWert()
	 * @see #getNID_C_ATOTS_TypeClass()
	 * @generated
	 */
	EAttribute getNID_C_ATOTS_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.NID_SP_TypeClass <em>NID SP Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NID SP Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.NID_SP_TypeClass
	 * @generated
	 */
	EClass getNID_SP_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.ATO.NID_SP_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.NID_SP_TypeClass#getWert()
	 * @see #getNID_SP_TypeClass()
	 * @generated
	 */
	EAttribute getNID_SP_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.ATO.NID_TP_TypeClass <em>NID TP Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NID TP Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.NID_TP_TypeClass
	 * @generated
	 */
	EClass getNID_TP_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.ATO.NID_TP_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.ATO.NID_TP_TypeClass#getWert()
	 * @see #getNID_TP_TypeClass()
	 * @generated
	 */
	EAttribute getNID_TP_TypeClass_Wert();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Abstand ATO Halt Vor Eo AType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abstand ATO Halt Vor Eo AType</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TAbstand_ATO_Halt_Vor_EoA' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter'"
	 * @generated
	 */
	EDataType getAbstand_ATO_Halt_Vor_EoA_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung ATO TP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung ATO TP Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_ATO_TP' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getBezeichnung_ATO_TP_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Erreichungstoleranz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Erreichungstoleranz Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TErreichungstoleranz' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[0-9]|[12][0-9]|30|31'"
	 * @generated
	 */
	EDataType getErreichungstoleranz_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Haltetoleranz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Haltetoleranz Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='THaltetoleranz' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[0-9]|[12][0-9]|30|31'"
	 * @generated
	 */
	EDataType getHaltetoleranz_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>NID ATOTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>NID ATOTS Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TNID_ATOTS' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getNID_ATOTS_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>NID CATOTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>NID CATOTS Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TNID_C_ATOTS' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='102[0-3]|10[0-1][0-9]|[1-9][0-9]{2}|0|[1-9][0-9]{0,1}'"
	 * @generated
	 */
	EDataType getNID_C_ATOTS_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>NID SP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>NID SP Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TNID_SP' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getNID_SP_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>NID TP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>NID TP Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TNID_TP' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getNID_TP_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ATOFactory getATOFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.Abstand_ATO_Halt_Vor_EoA_TypeClassImpl <em>Abstand ATO Halt Vor Eo AType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.Abstand_ATO_Halt_Vor_EoA_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getAbstand_ATO_Halt_Vor_EoA_TypeClass()
		 * @generated
		 */
		EClass ABSTAND_ATO_HALT_VOR_EO_ATYPE_CLASS = eINSTANCE.getAbstand_ATO_Halt_Vor_EoA_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTAND_ATO_HALT_VOR_EO_ATYPE_CLASS__WERT = eINSTANCE.getAbstand_ATO_Halt_Vor_EoA_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_ProfileImpl <em>ATO Segment Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_ProfileImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_Segment_Profile()
		 * @generated
		 */
		EClass ATO_SEGMENT_PROFILE = eINSTANCE.getATO_Segment_Profile();

		/**
		 * The meta object literal for the '<em><b>Abstand ATO Halt Vor Eo A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A = eINSTANCE.getATO_Segment_Profile_AbstandATOHaltVorEoA();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_SEGMENT_PROFILE__BEZEICHNUNG = eINSTANCE.getATO_Segment_Profile_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>IDATOTS Instanz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ = eINSTANCE.getATO_Segment_Profile_IDATOTSInstanz();

		/**
		 * The meta object literal for the '<em><b>IDATOTS Instanz Nachbar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR = eINSTANCE.getATO_Segment_Profile_IDATOTSInstanzNachbar();

		/**
		 * The meta object literal for the '<em><b>IDETCS Kante</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_SEGMENT_PROFILE__IDETCS_KANTE = eINSTANCE.getATO_Segment_Profile_IDETCSKante();

		/**
		 * The meta object literal for the '<em><b>ID Oertlichkeit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT = eINSTANCE.getATO_Segment_Profile_IDOertlichkeit();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_Profile_Bezeichnung_AttributeGroupImpl <em>ATO Segment Profile Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_Profile_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_Segment_Profile_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getATO_Segment_Profile_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>NIDSP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP__NIDSP = eINSTANCE.getATO_Segment_Profile_Bezeichnung_AttributeGroup_NIDSP();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_PointImpl <em>ATO Timing Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_PointImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_Timing_Point()
		 * @generated
		 */
		EClass ATO_TIMING_POINT = eINSTANCE.getATO_Timing_Point();

		/**
		 * The meta object literal for the '<em><b>ATO Timing Point Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG = eINSTANCE.getATO_Timing_Point_ATOTimingPointAllg();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_TIMING_POINT__BEZEICHNUNG = eINSTANCE.getATO_Timing_Point_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Signal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_TIMING_POINT__ID_SIGNAL = eINSTANCE.getATO_Timing_Point_IDSignal();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_Point_Allg_AttributeGroupImpl <em>ATO Timing Point Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_Point_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_Timing_Point_Allg_AttributeGroup()
		 * @generated
		 */
		EClass ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getATO_Timing_Point_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Erreichungstoleranz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__ERREICHUNGSTOLERANZ = eINSTANCE.getATO_Timing_Point_Allg_AttributeGroup_Erreichungstoleranz();

		/**
		 * The meta object literal for the '<em><b>Haltetoleranz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__HALTETOLERANZ = eINSTANCE.getATO_Timing_Point_Allg_AttributeGroup_Haltetoleranz();

		/**
		 * The meta object literal for the '<em><b>NIDTP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__NIDTP = eINSTANCE.getATO_Timing_Point_Allg_AttributeGroup_NIDTP();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_Point_Bezeichnung_AttributeGroupImpl <em>ATO Timing Point Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_Point_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_Timing_Point_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getATO_Timing_Point_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung ATOTP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ATOTP = eINSTANCE.getATO_Timing_Point_Bezeichnung_AttributeGroup_BezeichnungATOTP();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_TS_InstanzImpl <em>ATO TS Instanz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_TS_InstanzImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_TS_Instanz()
		 * @generated
		 */
		EClass ATO_TS_INSTANZ = eINSTANCE.getATO_TS_Instanz();

		/**
		 * The meta object literal for the '<em><b>ATOTS Instanz Adresse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE = eINSTANCE.getATO_TS_Instanz_ATOTSInstanzAdresse();

		/**
		 * The meta object literal for the '<em><b>ID Unterbringung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_TS_INSTANZ__ID_UNTERBRINGUNG = eINSTANCE.getATO_TS_Instanz_IDUnterbringung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.ATO_TS_Instanz_Adresse_AttributeGroupImpl <em>ATO TS Instanz Adresse Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATO_TS_Instanz_Adresse_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getATO_TS_Instanz_Adresse_AttributeGroup()
		 * @generated
		 */
		EClass ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP = eINSTANCE.getATO_TS_Instanz_Adresse_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>NIDATOTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDATOTS = eINSTANCE.getATO_TS_Instanz_Adresse_AttributeGroup_NIDATOTS();

		/**
		 * The meta object literal for the '<em><b>NIDCATOTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDCATOTS = eINSTANCE.getATO_TS_Instanz_Adresse_AttributeGroup_NIDCATOTS();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.Bezeichnung_ATO_TP_TypeClassImpl <em>Bezeichnung ATO TP Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.Bezeichnung_ATO_TP_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getBezeichnung_ATO_TP_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_ATO_TP_TYPE_CLASS = eINSTANCE.getBezeichnung_ATO_TP_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_ATO_TP_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_ATO_TP_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.Erreichungstoleranz_TypeClassImpl <em>Erreichungstoleranz Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.Erreichungstoleranz_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getErreichungstoleranz_TypeClass()
		 * @generated
		 */
		EClass ERREICHUNGSTOLERANZ_TYPE_CLASS = eINSTANCE.getErreichungstoleranz_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERREICHUNGSTOLERANZ_TYPE_CLASS__WERT = eINSTANCE.getErreichungstoleranz_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.Haltetoleranz_TypeClassImpl <em>Haltetoleranz Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.Haltetoleranz_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getHaltetoleranz_TypeClass()
		 * @generated
		 */
		EClass HALTETOLERANZ_TYPE_CLASS = eINSTANCE.getHaltetoleranz_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HALTETOLERANZ_TYPE_CLASS__WERT = eINSTANCE.getHaltetoleranz_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.NID_ATOTS_TypeClassImpl <em>NID ATOTS Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.NID_ATOTS_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_ATOTS_TypeClass()
		 * @generated
		 */
		EClass NID_ATOTS_TYPE_CLASS = eINSTANCE.getNID_ATOTS_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NID_ATOTS_TYPE_CLASS__WERT = eINSTANCE.getNID_ATOTS_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.NID_C_ATOTS_TypeClassImpl <em>NID CATOTS Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.NID_C_ATOTS_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_C_ATOTS_TypeClass()
		 * @generated
		 */
		EClass NID_CATOTS_TYPE_CLASS = eINSTANCE.getNID_C_ATOTS_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NID_CATOTS_TYPE_CLASS__WERT = eINSTANCE.getNID_C_ATOTS_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.NID_SP_TypeClassImpl <em>NID SP Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.NID_SP_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_SP_TypeClass()
		 * @generated
		 */
		EClass NID_SP_TYPE_CLASS = eINSTANCE.getNID_SP_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NID_SP_TYPE_CLASS__WERT = eINSTANCE.getNID_SP_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.ATO.impl.NID_TP_TypeClassImpl <em>NID TP Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.ATO.impl.NID_TP_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_TP_TypeClass()
		 * @generated
		 */
		EClass NID_TP_TYPE_CLASS = eINSTANCE.getNID_TP_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NID_TP_TYPE_CLASS__WERT = eINSTANCE.getNID_TP_TypeClass_Wert();

		/**
		 * The meta object literal for the '<em>Abstand ATO Halt Vor Eo AType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getAbstand_ATO_Halt_Vor_EoA_Type()
		 * @generated
		 */
		EDataType ABSTAND_ATO_HALT_VOR_EO_ATYPE = eINSTANCE.getAbstand_ATO_Halt_Vor_EoA_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung ATO TP Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getBezeichnung_ATO_TP_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_ATO_TP_TYPE = eINSTANCE.getBezeichnung_ATO_TP_Type();

		/**
		 * The meta object literal for the '<em>Erreichungstoleranz Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getErreichungstoleranz_Type()
		 * @generated
		 */
		EDataType ERREICHUNGSTOLERANZ_TYPE = eINSTANCE.getErreichungstoleranz_Type();

		/**
		 * The meta object literal for the '<em>Haltetoleranz Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getHaltetoleranz_Type()
		 * @generated
		 */
		EDataType HALTETOLERANZ_TYPE = eINSTANCE.getHaltetoleranz_Type();

		/**
		 * The meta object literal for the '<em>NID ATOTS Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_ATOTS_Type()
		 * @generated
		 */
		EDataType NID_ATOTS_TYPE = eINSTANCE.getNID_ATOTS_Type();

		/**
		 * The meta object literal for the '<em>NID CATOTS Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_C_ATOTS_Type()
		 * @generated
		 */
		EDataType NID_CATOTS_TYPE = eINSTANCE.getNID_C_ATOTS_Type();

		/**
		 * The meta object literal for the '<em>NID SP Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_SP_Type()
		 * @generated
		 */
		EDataType NID_SP_TYPE = eINSTANCE.getNID_SP_Type();

		/**
		 * The meta object literal for the '<em>NID TP Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl#getNID_TP_Type()
		 * @generated
		 */
		EDataType NID_TP_TYPE = eINSTANCE.getNID_TP_Type();

	}

} //ATOPackage
