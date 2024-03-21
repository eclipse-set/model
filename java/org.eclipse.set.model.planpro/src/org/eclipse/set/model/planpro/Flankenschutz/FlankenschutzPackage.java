/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Flankenschutz;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.
 * 
 * Weitere Informationen zur Lizenz finden Sie auf
 * http://www.dbnetze.com/planpro
 * 
 * Inhalt der Datei:
 * XML Schema für PlanPro Schnittstelle.
 * 
 * Bei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com
 * 
 * --------------------------------------------------------------------------------
 * 
 * This Document is licensed under the open source license RailPL V1.0.
 * 
 * More information about the license can be found on
 * http://www.dbnetze.com/planpro
 * 
 * Contents of the file:
 * XML Schema for PlanPro interface.
 * Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.
 * 
 * Weitere Informationen zur Lizenz finden Sie auf
 * http://www.dbnetze.com/planpro
 * 
 * Inhalt der Datei:
 * XML Schema für PlanPro Schnittstelle.
 * 
 * Bei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com
 * 
 * --------------------------------------------------------------------------------
 * 
 * This Document is licensed under the open source license RailPL V1.0.
 * 
 * More information about the license can be found on
 * http://www.dbnetze.com/planpro
 * 
 * Contents of the file:
 * XML Schema for PlanPro interface.
 * Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.
 * 
 * Weitere Informationen zur Lizenz finden Sie auf
 * http://www.dbnetze.com/planpro
 * 
 * Inhalt der Datei:
 * XML Schema für PlanPro Schnittstelle.
 * 
 * Bei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com
 * 
 * --------------------------------------------------------------------------------
 * 
 * This Document is licensed under the open source license RailPL V1.0.
 * 
 * More information about the license can be found on
 * http://www.dbnetze.com/planpro
 * 
 * Contents of the file:
 * XML Schema for PlanPro interface.
 * Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.
 * 
 * Weitere Informationen zur Lizenz finden Sie auf
 * http://www.dbnetze.com/planpro
 * 
 * Inhalt der Datei:
 * XML Schema für PlanPro Schnittstelle.
 * 
 * Bei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com
 * 
 * --------------------------------------------------------------------------------
 * 
 * This Document is licensed under the open source license RailPL V1.0.
 * 
 * More information about the license can be found on
 * http://www.dbnetze.com/planpro
 * 
 * Contents of the file:
 * XML Schema for PlanPro interface.
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzFactory
 * @model kind="package"
 * @generated
 */
public interface FlankenschutzPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Flankenschutz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Flankenschutz/1.10.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsFlankenschutz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlankenschutzPackage eINSTANCE = org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.EKW_Kr_Anteil_TypeClassImpl <em>EKW Kr Anteil Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.EKW_Kr_Anteil_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getEKW_Kr_Anteil_TypeClass()
	 * @generated
	 */
	int EKW_KR_ANTEIL_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EKW_KR_ANTEIL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EKW_KR_ANTEIL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EKW Kr Anteil Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EKW_KR_ANTEIL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fahrt_Ueber_TypeClassImpl <em>Fahrt Ueber Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fahrt_Ueber_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFahrt_Ueber_TypeClass()
	 * @generated
	 */
	int FAHRT_UEBER_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRT_UEBER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRT_UEBER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fahrt Ueber Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRT_UEBER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Freimelde_ZuordnungImpl <em>Fla Freimelde Zuordnung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Freimelde_ZuordnungImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Freimelde_Zuordnung()
	 * @generated
	 */
	int FLA_FREIMELDE_ZUORDNUNG = 2;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_FREIMELDE_ZUORDNUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_FREIMELDE_ZUORDNUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_FREIMELDE_ZUORDNUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_FREIMELDE_ZUORDNUNG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_FREIMELDE_ZUORDNUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Fla Raum Freimeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Fla Schutz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDFMA Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fla Freimelde Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_FREIMELDE_ZUORDNUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Raum_Freimeldung_TypeClassImpl <em>Fla Raum Freimeldung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Raum_Freimeldung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Raum_Freimeldung_TypeClass()
	 * @generated
	 */
	int FLA_RAUM_FREIMELDUNG_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_RAUM_FREIMELDUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_RAUM_FREIMELDUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fla Raum Freimeldung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_RAUM_FREIMELDUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_SchutzImpl <em>Fla Schutz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_SchutzImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Schutz()
	 * @generated
	 */
	int FLA_SCHUTZ = 4;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Fla Schutz Anforderer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ__FLA_SCHUTZ_ANFORDERER = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fla Schutz Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ__FLA_SCHUTZ_SIGNAL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fla Schutz WGsp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ__FLA_SCHUTZ_WGSP = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fla Schutz Weitergabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ__FLA_SCHUTZ_WEITERGABE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fla Verzicht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ__FLA_VERZICHT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Fla Schutz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Anforderer_AttributeGroupImpl <em>Fla Schutz Anforderer Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Anforderer_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Schutz_Anforderer_AttributeGroup()
	 * @generated
	 */
	int FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EKW Kr Anteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__EKW_KR_ANTEIL = 0;

	/**
	 * The feature id for the '<em><b>Fahrt Ueber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__FAHRT_UEBER = 1;

	/**
	 * The feature id for the '<em><b>ID Anforderer Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__ID_ANFORDERER_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Fla Schutz Anforderer Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Signal_AttributeGroupImpl <em>Fla Schutz Signal Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Signal_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Schutz_Signal_AttributeGroup()
	 * @generated
	 */
	int FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Fla Signal Zielsperrung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG = 0;

	/**
	 * The feature id for the '<em><b>ID Fla Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL = 1;

	/**
	 * The number of structural features of the '<em>Fla Schutz Signal Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_W_Gsp_AttributeGroupImpl <em>Fla Schutz WGsp Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_W_Gsp_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Schutz_W_Gsp_AttributeGroup()
	 * @generated
	 */
	int FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Fla WLage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE = 0;

	/**
	 * The feature id for the '<em><b>ID Fla WGsp Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Fla Schutz WGsp Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Weitergabe_AttributeGroupImpl <em>Fla Schutz Weitergabe Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Weitergabe_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Schutz_Weitergabe_AttributeGroup()
	 * @generated
	 */
	int FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP = 8;

	/**
	 * The feature id for the '<em><b>ID Fla Weitergabe L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L = 0;

	/**
	 * The feature id for the '<em><b>ID Fla Weitergabe R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R = 1;

	/**
	 * The number of structural features of the '<em>Fla Schutz Weitergabe Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Signal_Zielsperrung_TypeClassImpl <em>Fla Signal Zielsperrung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Signal_Zielsperrung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Signal_Zielsperrung_TypeClass()
	 * @generated
	 */
	int FLA_SIGNAL_ZIELSPERRUNG_TYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SIGNAL_ZIELSPERRUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SIGNAL_ZIELSPERRUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fla Signal Zielsperrung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_SIGNAL_ZIELSPERRUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Verzicht_TypeClassImpl <em>Fla Verzicht Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Verzicht_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Verzicht_TypeClass()
	 * @generated
	 */
	int FLA_VERZICHT_TYPE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_VERZICHT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_VERZICHT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fla Verzicht Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_VERZICHT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_W_Lage_TypeClassImpl <em>Fla WLage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_W_Lage_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_W_Lage_TypeClass()
	 * @generated
	 */
	int FLA_WLAGE_TYPE_CLASS = 11;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_WLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_WLAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fla WLage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_WLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_ZwieschutzImpl <em>Fla Zwieschutz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_ZwieschutzImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Zwieschutz()
	 * @generated
	 */
	int FLA_ZWIESCHUTZ = 12;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Fla Zwieschutz Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ__FLA_ZWIESCHUTZ_ELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDW Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ__IDW_ELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zwieschutz Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ__ZWIESCHUTZ_ART = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fla Zwieschutz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Zwieschutz_Element_AttributeGroupImpl <em>Fla Zwieschutz Element Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Zwieschutz_Element_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Zwieschutz_Element_AttributeGroup()
	 * @generated
	 */
	int FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP = 13;

	/**
	 * The feature id for the '<em><b>ID Fla Schutz L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L = 0;

	/**
	 * The feature id for the '<em><b>ID Fla Schutz R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R = 1;

	/**
	 * The feature id for the '<em><b>Massnahme L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L = 2;

	/**
	 * The feature id for the '<em><b>Massnahme R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R = 3;

	/**
	 * The feature id for the '<em><b>Nachlaufverhinderung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG = 4;

	/**
	 * The number of structural features of the '<em>Fla Zwieschutz Element Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Massnahme_TypeClassImpl <em>Massnahme Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Massnahme_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getMassnahme_TypeClass()
	 * @generated
	 */
	int MASSNAHME_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSNAHME_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSNAHME_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Massnahme Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSNAHME_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Nachlaufverhinderung_TypeClassImpl <em>Nachlaufverhinderung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Nachlaufverhinderung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getNachlaufverhinderung_TypeClass()
	 * @generated
	 */
	int NACHLAUFVERHINDERUNG_TYPE_CLASS = 15;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHLAUFVERHINDERUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHLAUFVERHINDERUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nachlaufverhinderung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHLAUFVERHINDERUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Zwieschutz_Art_TypeClassImpl <em>Zwieschutz Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Zwieschutz_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getZwieschutz_Art_TypeClass()
	 * @generated
	 */
	int ZWIESCHUTZ_ART_TYPE_CLASS = 16;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZWIESCHUTZ_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZWIESCHUTZ_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zwieschutz Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZWIESCHUTZ_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.ENUMFahrtUeber <em>ENUM Fahrt Ueber</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMFahrtUeber
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getENUMFahrtUeber()
	 * @generated
	 */
	int ENUM_FAHRT_UEBER = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.ENUMMassnahme <em>ENUM Massnahme</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMMassnahme
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getENUMMassnahme()
	 * @generated
	 */
	int ENUM_MASSNAHME = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Flankenschutz.ENUMZwieschutzArt <em>ENUM Zwieschutz Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMZwieschutzArt
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getENUMZwieschutzArt()
	 * @generated
	 */
	int ENUM_ZWIESCHUTZ_ART = 19;

	/**
	 * The meta object id for the '<em>ENUM Fahrt Ueber Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMFahrtUeber
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getENUMFahrtUeberObject()
	 * @generated
	 */
	int ENUM_FAHRT_UEBER_OBJECT = 20;

	/**
	 * The meta object id for the '<em>ENUM Massnahme Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMMassnahme
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getENUMMassnahmeObject()
	 * @generated
	 */
	int ENUM_MASSNAHME_OBJECT = 21;

	/**
	 * The meta object id for the '<em>ENUM Zwieschutz Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMZwieschutzArt
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getENUMZwieschutzArtObject()
	 * @generated
	 */
	int ENUM_ZWIESCHUTZ_ART_OBJECT = 22;

	/**
	 * The meta object id for the '<em>Fla WLage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts
	 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_W_Lage_Type()
	 * @generated
	 */
	int FLA_WLAGE_TYPE = 23;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.EKW_Kr_Anteil_TypeClass <em>EKW Kr Anteil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EKW Kr Anteil Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.EKW_Kr_Anteil_TypeClass
	 * @generated
	 */
	EClass getEKW_Kr_Anteil_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Flankenschutz.EKW_Kr_Anteil_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.EKW_Kr_Anteil_TypeClass#getWert()
	 * @see #getEKW_Kr_Anteil_TypeClass()
	 * @generated
	 */
	EAttribute getEKW_Kr_Anteil_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Fahrt_Ueber_TypeClass <em>Fahrt Ueber Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fahrt Ueber Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fahrt_Ueber_TypeClass
	 * @generated
	 */
	EClass getFahrt_Ueber_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Flankenschutz.Fahrt_Ueber_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fahrt_Ueber_TypeClass#getWert()
	 * @see #getFahrt_Ueber_TypeClass()
	 * @generated
	 */
	EAttribute getFahrt_Ueber_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung <em>Fla Freimelde Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fla Freimelde Zuordnung</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung
	 * @generated
	 */
	EClass getFla_Freimelde_Zuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung#getFlaRaumFreimeldung <em>Fla Raum Freimeldung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fla Raum Freimeldung</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung#getFlaRaumFreimeldung()
	 * @see #getFla_Freimelde_Zuordnung()
	 * @generated
	 */
	EReference getFla_Freimelde_Zuordnung_FlaRaumFreimeldung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fla Schutz</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFlaSchutz()
	 * @see #getFla_Freimelde_Zuordnung()
	 * @generated
	 */
	EReference getFla_Freimelde_Zuordnung_IDFlaSchutz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFMAAnlage <em>IDFMA Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDFMA Anlage</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFMAAnlage()
	 * @see #getFla_Freimelde_Zuordnung()
	 * @generated
	 */
	EReference getFla_Freimelde_Zuordnung_IDFMAAnlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Raum_Freimeldung_TypeClass <em>Fla Raum Freimeldung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fla Raum Freimeldung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Raum_Freimeldung_TypeClass
	 * @generated
	 */
	EClass getFla_Raum_Freimeldung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Raum_Freimeldung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Raum_Freimeldung_TypeClass#getWert()
	 * @see #getFla_Raum_Freimeldung_TypeClass()
	 * @generated
	 */
	EAttribute getFla_Raum_Freimeldung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz <em>Fla Schutz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fla Schutz</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz
	 * @generated
	 */
	EClass getFla_Schutz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzAnforderer <em>Fla Schutz Anforderer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fla Schutz Anforderer</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzAnforderer()
	 * @see #getFla_Schutz()
	 * @generated
	 */
	EReference getFla_Schutz_FlaSchutzAnforderer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzSignal <em>Fla Schutz Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fla Schutz Signal</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzSignal()
	 * @see #getFla_Schutz()
	 * @generated
	 */
	EReference getFla_Schutz_FlaSchutzSignal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzWGsp <em>Fla Schutz WGsp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fla Schutz WGsp</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzWGsp()
	 * @see #getFla_Schutz()
	 * @generated
	 */
	EReference getFla_Schutz_FlaSchutzWGsp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzWeitergabe <em>Fla Schutz Weitergabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fla Schutz Weitergabe</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzWeitergabe()
	 * @see #getFla_Schutz()
	 * @generated
	 */
	EReference getFla_Schutz_FlaSchutzWeitergabe();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaVerzicht <em>Fla Verzicht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fla Verzicht</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaVerzicht()
	 * @see #getFla_Schutz()
	 * @generated
	 */
	EReference getFla_Schutz_FlaVerzicht();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup <em>Fla Schutz Anforderer Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fla Schutz Anforderer Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup
	 * @generated
	 */
	EClass getFla_Schutz_Anforderer_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup#getEKWKrAnteil <em>EKW Kr Anteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EKW Kr Anteil</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup#getEKWKrAnteil()
	 * @see #getFla_Schutz_Anforderer_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Schutz_Anforderer_AttributeGroup_EKWKrAnteil();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup#getFahrtUeber <em>Fahrt Ueber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fahrt Ueber</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup#getFahrtUeber()
	 * @see #getFla_Schutz_Anforderer_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Schutz_Anforderer_AttributeGroup_FahrtUeber();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup#getIDAnfordererElement <em>ID Anforderer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anforderer Element</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup#getIDAnfordererElement()
	 * @see #getFla_Schutz_Anforderer_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Schutz_Anforderer_AttributeGroup_IDAnfordererElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Signal_AttributeGroup <em>Fla Schutz Signal Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fla Schutz Signal Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Signal_AttributeGroup
	 * @generated
	 */
	EClass getFla_Schutz_Signal_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Signal_AttributeGroup#getFlaSignalZielsperrung <em>Fla Signal Zielsperrung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fla Signal Zielsperrung</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Signal_AttributeGroup#getFlaSignalZielsperrung()
	 * @see #getFla_Schutz_Signal_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Schutz_Signal_AttributeGroup_FlaSignalZielsperrung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Signal_AttributeGroup#getIDFlaSignal <em>ID Fla Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fla Signal</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Signal_AttributeGroup#getIDFlaSignal()
	 * @see #getFla_Schutz_Signal_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Schutz_Signal_AttributeGroup_IDFlaSignal();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup <em>Fla Schutz WGsp Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fla Schutz WGsp Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup
	 * @generated
	 */
	EClass getFla_Schutz_W_Gsp_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getFlaWLage <em>Fla WLage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fla WLage</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getFlaWLage()
	 * @see #getFla_Schutz_W_Gsp_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Schutz_W_Gsp_AttributeGroup_FlaWLage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getIDFlaWGspElement <em>ID Fla WGsp Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fla WGsp Element</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getIDFlaWGspElement()
	 * @see #getFla_Schutz_W_Gsp_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Schutz_W_Gsp_AttributeGroup_IDFlaWGspElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup <em>Fla Schutz Weitergabe Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fla Schutz Weitergabe Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup
	 * @generated
	 */
	EClass getFla_Schutz_Weitergabe_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeL <em>ID Fla Weitergabe L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fla Weitergabe L</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeL()
	 * @see #getFla_Schutz_Weitergabe_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeR <em>ID Fla Weitergabe R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fla Weitergabe R</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeR()
	 * @see #getFla_Schutz_Weitergabe_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeR();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Signal_Zielsperrung_TypeClass <em>Fla Signal Zielsperrung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fla Signal Zielsperrung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Signal_Zielsperrung_TypeClass
	 * @generated
	 */
	EClass getFla_Signal_Zielsperrung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Signal_Zielsperrung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Signal_Zielsperrung_TypeClass#getWert()
	 * @see #getFla_Signal_Zielsperrung_TypeClass()
	 * @generated
	 */
	EAttribute getFla_Signal_Zielsperrung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Verzicht_TypeClass <em>Fla Verzicht Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fla Verzicht Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Verzicht_TypeClass
	 * @generated
	 */
	EClass getFla_Verzicht_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Verzicht_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Verzicht_TypeClass#getWert()
	 * @see #getFla_Verzicht_TypeClass()
	 * @generated
	 */
	EAttribute getFla_Verzicht_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_W_Lage_TypeClass <em>Fla WLage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fla WLage Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_W_Lage_TypeClass
	 * @generated
	 */
	EClass getFla_W_Lage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_W_Lage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_W_Lage_TypeClass#getWert()
	 * @see #getFla_W_Lage_TypeClass()
	 * @generated
	 */
	EAttribute getFla_W_Lage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz <em>Fla Zwieschutz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fla Zwieschutz</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz
	 * @generated
	 */
	EClass getFla_Zwieschutz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz#getFlaZwieschutzElement <em>Fla Zwieschutz Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fla Zwieschutz Element</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz#getFlaZwieschutzElement()
	 * @see #getFla_Zwieschutz()
	 * @generated
	 */
	EReference getFla_Zwieschutz_FlaZwieschutzElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz#getIDWElement <em>IDW Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDW Element</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz#getIDWElement()
	 * @see #getFla_Zwieschutz()
	 * @generated
	 */
	EReference getFla_Zwieschutz_IDWElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz#getZwieschutzArt <em>Zwieschutz Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zwieschutz Art</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz#getZwieschutzArt()
	 * @see #getFla_Zwieschutz()
	 * @generated
	 */
	EReference getFla_Zwieschutz_ZwieschutzArt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup <em>Fla Zwieschutz Element Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fla Zwieschutz Element Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup
	 * @generated
	 */
	EClass getFla_Zwieschutz_Element_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getIDFlaSchutzL <em>ID Fla Schutz L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fla Schutz L</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getIDFlaSchutzL()
	 * @see #getFla_Zwieschutz_Element_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getIDFlaSchutzR <em>ID Fla Schutz R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fla Schutz R</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getIDFlaSchutzR()
	 * @see #getFla_Zwieschutz_Element_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzR();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getMassnahmeL <em>Massnahme L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Massnahme L</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getMassnahmeL()
	 * @see #getFla_Zwieschutz_Element_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Zwieschutz_Element_AttributeGroup_MassnahmeL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getMassnahmeR <em>Massnahme R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Massnahme R</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getMassnahmeR()
	 * @see #getFla_Zwieschutz_Element_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Zwieschutz_Element_AttributeGroup_MassnahmeR();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getNachlaufverhinderung <em>Nachlaufverhinderung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachlaufverhinderung</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getNachlaufverhinderung()
	 * @see #getFla_Zwieschutz_Element_AttributeGroup()
	 * @generated
	 */
	EReference getFla_Zwieschutz_Element_AttributeGroup_Nachlaufverhinderung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Massnahme_TypeClass <em>Massnahme Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Massnahme Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Massnahme_TypeClass
	 * @generated
	 */
	EClass getMassnahme_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Flankenschutz.Massnahme_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Massnahme_TypeClass#getWert()
	 * @see #getMassnahme_TypeClass()
	 * @generated
	 */
	EAttribute getMassnahme_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Nachlaufverhinderung_TypeClass <em>Nachlaufverhinderung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachlaufverhinderung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Nachlaufverhinderung_TypeClass
	 * @generated
	 */
	EClass getNachlaufverhinderung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Flankenschutz.Nachlaufverhinderung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Nachlaufverhinderung_TypeClass#getWert()
	 * @see #getNachlaufverhinderung_TypeClass()
	 * @generated
	 */
	EAttribute getNachlaufverhinderung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Flankenschutz.Zwieschutz_Art_TypeClass <em>Zwieschutz Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zwieschutz Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Zwieschutz_Art_TypeClass
	 * @generated
	 */
	EClass getZwieschutz_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Flankenschutz.Zwieschutz_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.Zwieschutz_Art_TypeClass#getWert()
	 * @see #getZwieschutz_Art_TypeClass()
	 * @generated
	 */
	EAttribute getZwieschutz_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Flankenschutz.ENUMFahrtUeber <em>ENUM Fahrt Ueber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Fahrt Ueber</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMFahrtUeber
	 * @generated
	 */
	EEnum getENUMFahrtUeber();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Flankenschutz.ENUMMassnahme <em>ENUM Massnahme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Massnahme</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMMassnahme
	 * @generated
	 */
	EEnum getENUMMassnahme();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Flankenschutz.ENUMZwieschutzArt <em>ENUM Zwieschutz Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Zwieschutz Art</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMZwieschutzArt
	 * @generated
	 */
	EEnum getENUMZwieschutzArt();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Flankenschutz.ENUMFahrtUeber <em>ENUM Fahrt Ueber Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Fahrt Ueber Object</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMFahrtUeber
	 * @model instanceClass="org.eclipse.set.model.planpro.Flankenschutz.ENUMFahrtUeber"
	 *        extendedMetaData="name='ENUMFahrt_Ueber:Object' baseType='ENUMFahrt_Ueber'"
	 * @generated
	 */
	EDataType getENUMFahrtUeberObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Flankenschutz.ENUMMassnahme <em>ENUM Massnahme Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Massnahme Object</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMMassnahme
	 * @model instanceClass="org.eclipse.set.model.planpro.Flankenschutz.ENUMMassnahme"
	 *        extendedMetaData="name='ENUMMassnahme:Object' baseType='ENUMMassnahme'"
	 * @generated
	 */
	EDataType getENUMMassnahmeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Flankenschutz.ENUMZwieschutzArt <em>ENUM Zwieschutz Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Zwieschutz Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMZwieschutzArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Flankenschutz.ENUMZwieschutzArt"
	 *        extendedMetaData="name='ENUMZwieschutz_Art:Object' baseType='ENUMZwieschutz_Art'"
	 * @generated
	 */
	EDataType getENUMZwieschutzArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts <em>Fla WLage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fla WLage Type</em>'.
	 * @see org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts
	 * @model instanceClass="org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts"
	 *        extendedMetaData="name='TFla_W_Lage' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts'"
	 * @generated
	 */
	EDataType getFla_W_Lage_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlankenschutzFactory getFlankenschutzFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.EKW_Kr_Anteil_TypeClassImpl <em>EKW Kr Anteil Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.EKW_Kr_Anteil_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getEKW_Kr_Anteil_TypeClass()
		 * @generated
		 */
		EClass EKW_KR_ANTEIL_TYPE_CLASS = eINSTANCE.getEKW_Kr_Anteil_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EKW_KR_ANTEIL_TYPE_CLASS__WERT = eINSTANCE.getEKW_Kr_Anteil_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fahrt_Ueber_TypeClassImpl <em>Fahrt Ueber Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fahrt_Ueber_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFahrt_Ueber_TypeClass()
		 * @generated
		 */
		EClass FAHRT_UEBER_TYPE_CLASS = eINSTANCE.getFahrt_Ueber_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAHRT_UEBER_TYPE_CLASS__WERT = eINSTANCE.getFahrt_Ueber_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Freimelde_ZuordnungImpl <em>Fla Freimelde Zuordnung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Freimelde_ZuordnungImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Freimelde_Zuordnung()
		 * @generated
		 */
		EClass FLA_FREIMELDE_ZUORDNUNG = eINSTANCE.getFla_Freimelde_Zuordnung();

		/**
		 * The meta object literal for the '<em><b>Fla Raum Freimeldung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG = eINSTANCE.getFla_Freimelde_Zuordnung_FlaRaumFreimeldung();

		/**
		 * The meta object literal for the '<em><b>ID Fla Schutz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ = eINSTANCE.getFla_Freimelde_Zuordnung_IDFlaSchutz();

		/**
		 * The meta object literal for the '<em><b>IDFMA Anlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE = eINSTANCE.getFla_Freimelde_Zuordnung_IDFMAAnlage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Raum_Freimeldung_TypeClassImpl <em>Fla Raum Freimeldung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Raum_Freimeldung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Raum_Freimeldung_TypeClass()
		 * @generated
		 */
		EClass FLA_RAUM_FREIMELDUNG_TYPE_CLASS = eINSTANCE.getFla_Raum_Freimeldung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLA_RAUM_FREIMELDUNG_TYPE_CLASS__WERT = eINSTANCE.getFla_Raum_Freimeldung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_SchutzImpl <em>Fla Schutz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_SchutzImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Schutz()
		 * @generated
		 */
		EClass FLA_SCHUTZ = eINSTANCE.getFla_Schutz();

		/**
		 * The meta object literal for the '<em><b>Fla Schutz Anforderer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ__FLA_SCHUTZ_ANFORDERER = eINSTANCE.getFla_Schutz_FlaSchutzAnforderer();

		/**
		 * The meta object literal for the '<em><b>Fla Schutz Signal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ__FLA_SCHUTZ_SIGNAL = eINSTANCE.getFla_Schutz_FlaSchutzSignal();

		/**
		 * The meta object literal for the '<em><b>Fla Schutz WGsp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ__FLA_SCHUTZ_WGSP = eINSTANCE.getFla_Schutz_FlaSchutzWGsp();

		/**
		 * The meta object literal for the '<em><b>Fla Schutz Weitergabe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ__FLA_SCHUTZ_WEITERGABE = eINSTANCE.getFla_Schutz_FlaSchutzWeitergabe();

		/**
		 * The meta object literal for the '<em><b>Fla Verzicht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ__FLA_VERZICHT = eINSTANCE.getFla_Schutz_FlaVerzicht();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Anforderer_AttributeGroupImpl <em>Fla Schutz Anforderer Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Anforderer_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Schutz_Anforderer_AttributeGroup()
		 * @generated
		 */
		EClass FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP = eINSTANCE.getFla_Schutz_Anforderer_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>EKW Kr Anteil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__EKW_KR_ANTEIL = eINSTANCE.getFla_Schutz_Anforderer_AttributeGroup_EKWKrAnteil();

		/**
		 * The meta object literal for the '<em><b>Fahrt Ueber</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__FAHRT_UEBER = eINSTANCE.getFla_Schutz_Anforderer_AttributeGroup_FahrtUeber();

		/**
		 * The meta object literal for the '<em><b>ID Anforderer Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__ID_ANFORDERER_ELEMENT = eINSTANCE.getFla_Schutz_Anforderer_AttributeGroup_IDAnfordererElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Signal_AttributeGroupImpl <em>Fla Schutz Signal Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Signal_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Schutz_Signal_AttributeGroup()
		 * @generated
		 */
		EClass FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP = eINSTANCE.getFla_Schutz_Signal_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Fla Signal Zielsperrung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG = eINSTANCE.getFla_Schutz_Signal_AttributeGroup_FlaSignalZielsperrung();

		/**
		 * The meta object literal for the '<em><b>ID Fla Signal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL = eINSTANCE.getFla_Schutz_Signal_AttributeGroup_IDFlaSignal();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_W_Gsp_AttributeGroupImpl <em>Fla Schutz WGsp Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_W_Gsp_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Schutz_W_Gsp_AttributeGroup()
		 * @generated
		 */
		EClass FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP = eINSTANCE.getFla_Schutz_W_Gsp_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Fla WLage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE = eINSTANCE.getFla_Schutz_W_Gsp_AttributeGroup_FlaWLage();

		/**
		 * The meta object literal for the '<em><b>ID Fla WGsp Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT = eINSTANCE.getFla_Schutz_W_Gsp_AttributeGroup_IDFlaWGspElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Weitergabe_AttributeGroupImpl <em>Fla Schutz Weitergabe Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Weitergabe_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Schutz_Weitergabe_AttributeGroup()
		 * @generated
		 */
		EClass FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP = eINSTANCE.getFla_Schutz_Weitergabe_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>ID Fla Weitergabe L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L = eINSTANCE.getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeL();

		/**
		 * The meta object literal for the '<em><b>ID Fla Weitergabe R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R = eINSTANCE.getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeR();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Signal_Zielsperrung_TypeClassImpl <em>Fla Signal Zielsperrung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Signal_Zielsperrung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Signal_Zielsperrung_TypeClass()
		 * @generated
		 */
		EClass FLA_SIGNAL_ZIELSPERRUNG_TYPE_CLASS = eINSTANCE.getFla_Signal_Zielsperrung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLA_SIGNAL_ZIELSPERRUNG_TYPE_CLASS__WERT = eINSTANCE.getFla_Signal_Zielsperrung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Verzicht_TypeClassImpl <em>Fla Verzicht Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Verzicht_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Verzicht_TypeClass()
		 * @generated
		 */
		EClass FLA_VERZICHT_TYPE_CLASS = eINSTANCE.getFla_Verzicht_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLA_VERZICHT_TYPE_CLASS__WERT = eINSTANCE.getFla_Verzicht_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_W_Lage_TypeClassImpl <em>Fla WLage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_W_Lage_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_W_Lage_TypeClass()
		 * @generated
		 */
		EClass FLA_WLAGE_TYPE_CLASS = eINSTANCE.getFla_W_Lage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLA_WLAGE_TYPE_CLASS__WERT = eINSTANCE.getFla_W_Lage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_ZwieschutzImpl <em>Fla Zwieschutz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_ZwieschutzImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Zwieschutz()
		 * @generated
		 */
		EClass FLA_ZWIESCHUTZ = eINSTANCE.getFla_Zwieschutz();

		/**
		 * The meta object literal for the '<em><b>Fla Zwieschutz Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_ZWIESCHUTZ__FLA_ZWIESCHUTZ_ELEMENT = eINSTANCE.getFla_Zwieschutz_FlaZwieschutzElement();

		/**
		 * The meta object literal for the '<em><b>IDW Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_ZWIESCHUTZ__IDW_ELEMENT = eINSTANCE.getFla_Zwieschutz_IDWElement();

		/**
		 * The meta object literal for the '<em><b>Zwieschutz Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_ZWIESCHUTZ__ZWIESCHUTZ_ART = eINSTANCE.getFla_Zwieschutz_ZwieschutzArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Zwieschutz_Element_AttributeGroupImpl <em>Fla Zwieschutz Element Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Zwieschutz_Element_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_Zwieschutz_Element_AttributeGroup()
		 * @generated
		 */
		EClass FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP = eINSTANCE.getFla_Zwieschutz_Element_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>ID Fla Schutz L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L = eINSTANCE.getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzL();

		/**
		 * The meta object literal for the '<em><b>ID Fla Schutz R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R = eINSTANCE.getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzR();

		/**
		 * The meta object literal for the '<em><b>Massnahme L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L = eINSTANCE.getFla_Zwieschutz_Element_AttributeGroup_MassnahmeL();

		/**
		 * The meta object literal for the '<em><b>Massnahme R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R = eINSTANCE.getFla_Zwieschutz_Element_AttributeGroup_MassnahmeR();

		/**
		 * The meta object literal for the '<em><b>Nachlaufverhinderung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG = eINSTANCE.getFla_Zwieschutz_Element_AttributeGroup_Nachlaufverhinderung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Massnahme_TypeClassImpl <em>Massnahme Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Massnahme_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getMassnahme_TypeClass()
		 * @generated
		 */
		EClass MASSNAHME_TYPE_CLASS = eINSTANCE.getMassnahme_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASSNAHME_TYPE_CLASS__WERT = eINSTANCE.getMassnahme_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Nachlaufverhinderung_TypeClassImpl <em>Nachlaufverhinderung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Nachlaufverhinderung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getNachlaufverhinderung_TypeClass()
		 * @generated
		 */
		EClass NACHLAUFVERHINDERUNG_TYPE_CLASS = eINSTANCE.getNachlaufverhinderung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHLAUFVERHINDERUNG_TYPE_CLASS__WERT = eINSTANCE.getNachlaufverhinderung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Zwieschutz_Art_TypeClassImpl <em>Zwieschutz Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.Zwieschutz_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getZwieschutz_Art_TypeClass()
		 * @generated
		 */
		EClass ZWIESCHUTZ_ART_TYPE_CLASS = eINSTANCE.getZwieschutz_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZWIESCHUTZ_ART_TYPE_CLASS__WERT = eINSTANCE.getZwieschutz_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.ENUMFahrtUeber <em>ENUM Fahrt Ueber</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMFahrtUeber
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getENUMFahrtUeber()
		 * @generated
		 */
		EEnum ENUM_FAHRT_UEBER = eINSTANCE.getENUMFahrtUeber();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.ENUMMassnahme <em>ENUM Massnahme</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMMassnahme
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getENUMMassnahme()
		 * @generated
		 */
		EEnum ENUM_MASSNAHME = eINSTANCE.getENUMMassnahme();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Flankenschutz.ENUMZwieschutzArt <em>ENUM Zwieschutz Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMZwieschutzArt
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getENUMZwieschutzArt()
		 * @generated
		 */
		EEnum ENUM_ZWIESCHUTZ_ART = eINSTANCE.getENUMZwieschutzArt();

		/**
		 * The meta object literal for the '<em>ENUM Fahrt Ueber Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMFahrtUeber
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getENUMFahrtUeberObject()
		 * @generated
		 */
		EDataType ENUM_FAHRT_UEBER_OBJECT = eINSTANCE.getENUMFahrtUeberObject();

		/**
		 * The meta object literal for the '<em>ENUM Massnahme Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMMassnahme
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getENUMMassnahmeObject()
		 * @generated
		 */
		EDataType ENUM_MASSNAHME_OBJECT = eINSTANCE.getENUMMassnahmeObject();

		/**
		 * The meta object literal for the '<em>ENUM Zwieschutz Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Flankenschutz.ENUMZwieschutzArt
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getENUMZwieschutzArtObject()
		 * @generated
		 */
		EDataType ENUM_ZWIESCHUTZ_ART_OBJECT = eINSTANCE.getENUMZwieschutzArtObject();

		/**
		 * The meta object literal for the '<em>Fla WLage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts
		 * @see org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl#getFla_W_Lage_Type()
		 * @generated
		 */
		EDataType FLA_WLAGE_TYPE = eINSTANCE.getFla_W_Lage_Type();

	}

} //FlankenschutzPackage
