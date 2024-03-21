/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Nahbedienung;

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
 * @see org.eclipse.set.model.planpro.Nahbedienung.NahbedienungFactory
 * @model kind="package"
 * @generated
 */
public interface NahbedienungPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Nahbedienung";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Nahbedienung/1.10.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsNahbedienung";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NahbedienungPackage eINSTANCE = org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.AWU_TypeClassImpl <em>AWU Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.AWU_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getAWU_TypeClass()
	 * @generated
	 */
	int AWU_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWU_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWU_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AWU Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWU_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Bezeichnung_NB_TypeClassImpl <em>Bezeichnung NB Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Bezeichnung_NB_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getBezeichnung_NB_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_NB_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_NB_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_NB_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung NB Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_NB_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Bezeichnung_NB_Zone_TypeClassImpl <em>Bezeichnung NB Zone Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Bezeichnung_NB_Zone_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getBezeichnung_NB_Zone_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_NB_ZONE_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_NB_ZONE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_NB_ZONE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung NB Zone Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_NB_ZONE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.F_ST_Z_TypeClassImpl <em>FST ZType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.F_ST_Z_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getF_ST_Z_TypeClass()
	 * @generated
	 */
	int FST_ZTYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FST_ZTYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FST_ZTYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FST ZType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FST_ZTYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.FA_FAE_TypeClassImpl <em>FA FAE Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.FA_FAE_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getFA_FAE_TypeClass()
	 * @generated
	 */
	int FA_FAE_TYPE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FA_FAE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FA_FAE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FA FAE Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FA_FAE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Freie_Stellbarkeit_TypeClassImpl <em>Freie Stellbarkeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Freie_Stellbarkeit_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getFreie_Stellbarkeit_TypeClass()
	 * @generated
	 */
	int FREIE_STELLBARKEIT_TYPE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIE_STELLBARKEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIE_STELLBARKEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Freie Stellbarkeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIE_STELLBARKEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Kennzahl_TypeClassImpl <em>Kennzahl Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Kennzahl_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getKennzahl_TypeClass()
	 * @generated
	 */
	int KENNZAHL_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENNZAHL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENNZAHL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kennzahl Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENNZAHL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NBImpl <em>NB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NBImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB()
	 * @generated
	 */
	int NB = 7;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>NB Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__NB_ART = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>NB Funktionalitaet NBR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__NB_FUNKTIONALITAET_NBR = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>NB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Art_TypeClassImpl <em>NB Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Art_TypeClass()
	 * @generated
	 */
	int NB_ART_TYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NB Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_ElementImpl <em>NB Bedien Anzeige Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_ElementImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Bedien_Anzeige_Element()
	 * @generated
	 */
	int NB_BEDIEN_ANZEIGE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEDIEN_ANZEIGE_ELEMENT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEDIEN_ANZEIGE_ELEMENT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEDIEN_ANZEIGE_ELEMENT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEDIEN_ANZEIGE_ELEMENT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Bedien Anzeige Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDNB Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>NB Bedien Anzeige Funktionen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>NB Bedien Anzeige Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEDIEN_ANZEIGE_ELEMENT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_Funktionen_AttributeGroupImpl <em>NB Bedien Anzeige Funktionen Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_Funktionen_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Bedien_Anzeige_Funktionen_AttributeGroup()
	 * @generated
	 */
	int NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Taste ANF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_ANF = 0;

	/**
	 * The feature id for the '<em><b>Taste FGT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_FGT = 1;

	/**
	 * The feature id for the '<em><b>Taste WGT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_WGT = 2;

	/**
	 * The number of structural features of the '<em>NB Bedien Anzeige Funktionen Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bezeichnung_AttributeGroupImpl <em>NB Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int NB_BEZEICHNUNG_ATTRIBUTE_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Bezeichnung NB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB = 0;

	/**
	 * The feature id for the '<em><b>Kennzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEZEICHNUNG_ATTRIBUTE_GROUP__KENNZAHL = 1;

	/**
	 * The number of structural features of the '<em>NB Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Funktionalitaet_NB_R_AttributeGroupImpl <em>NB Funktionalitaet NB RAttribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Funktionalitaet_NB_R_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Funktionalitaet_NB_R_AttributeGroup()
	 * @generated
	 */
	int NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP = 12;

	/**
	 * The feature id for the '<em><b>AWU</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__AWU = 0;

	/**
	 * The feature id for the '<em><b>FSTZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FSTZ = 1;

	/**
	 * The feature id for the '<em><b>FAFAE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FAFAE = 2;

	/**
	 * The feature id for the '<em><b>SBUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SBUE = 3;

	/**
	 * The feature id for the '<em><b>SLESLS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SLESLS = 4;

	/**
	 * The feature id for the '<em><b>WHU</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WHU = 5;

	/**
	 * The feature id for the '<em><b>WUS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WUS = 6;

	/**
	 * The number of structural features of the '<em>NB Funktionalitaet NB RAttribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Grenze_Art_TypeClassImpl <em>NB Grenze Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Grenze_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Grenze_Art_TypeClass()
	 * @generated
	 */
	int NB_GRENZE_ART_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_GRENZE_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_GRENZE_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NB Grenze Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_GRENZE_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Rueckgabevoraussetzung_TypeClassImpl <em>NB Rueckgabevoraussetzung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Rueckgabevoraussetzung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Rueckgabevoraussetzung_TypeClass()
	 * @generated
	 */
	int NB_RUECKGABEVORAUSSETZUNG_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_RUECKGABEVORAUSSETZUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_RUECKGABEVORAUSSETZUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NB Rueckgabevoraussetzung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_RUECKGABEVORAUSSETZUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Verhaeltnis_Besonders_TypeClassImpl <em>NB Verhaeltnis Besonders Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Verhaeltnis_Besonders_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Verhaeltnis_Besonders_TypeClass()
	 * @generated
	 */
	int NB_VERHAELTNIS_BESONDERS_TYPE_CLASS = 15;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_VERHAELTNIS_BESONDERS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_VERHAELTNIS_BESONDERS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NB Verhaeltnis Besonders Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_VERHAELTNIS_BESONDERS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_ZoneImpl <em>NB Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_ZoneImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone()
	 * @generated
	 */
	int NB_ZONE = 16;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDNB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE__IDNB = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDNB Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE__IDNB_ZONE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>NB Zone Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE__NB_ZONE_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>NB Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Allg_AttributeGroupImpl <em>NB Zone Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Allg_AttributeGroup()
	 * @generated
	 */
	int NB_ZONE_ALLG_ATTRIBUTE_GROUP = 17;

	/**
	 * The feature id for the '<em><b>NB Verhaeltnis Besonders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_VERHAELTNIS_BESONDERS = 0;

	/**
	 * The feature id for the '<em><b>Rang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ALLG_ATTRIBUTE_GROUP__RANG = 1;

	/**
	 * The number of structural features of the '<em>NB Zone Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Allg_TypeClassImpl <em>NB Zone Allg Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Allg_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Allg_TypeClass()
	 * @generated
	 */
	int NB_ZONE_ALLG_TYPE_CLASS = 18;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ALLG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ALLG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NB Zone Allg Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ALLG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Bezeichnung_AttributeGroupImpl <em>NB Zone Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP = 19;

	/**
	 * The feature id for the '<em><b>Bezeichnung NB Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB_ZONE = 0;

	/**
	 * The number of structural features of the '<em>NB Zone Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_ElementImpl <em>NB Zone Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_ElementImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Element()
	 * @generated
	 */
	int NB_ZONE_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ELEMENT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ELEMENT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ELEMENT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ELEMENT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ELEMENT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDNB Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ELEMENT__IDNB_ELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDNB Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ELEMENT__IDNB_ZONE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>NB Zone Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>NB Zone Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ELEMENT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Element_Allg_AttributeGroupImpl <em>NB Zone Element Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Element_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Element_Allg_AttributeGroup()
	 * @generated
	 */
	int NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP = 21;

	/**
	 * The feature id for the '<em><b>Freie Stellbarkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__FREIE_STELLBARKEIT = 0;

	/**
	 * The feature id for the '<em><b>NB Rueckgabevoraussetzung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__NB_RUECKGABEVORAUSSETZUNG = 1;

	/**
	 * The feature id for the '<em><b>WGsp Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__WGSP_LAGE = 2;

	/**
	 * The number of structural features of the '<em>NB Zone Element Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_GrenzeImpl <em>NB Zone Grenze</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_GrenzeImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Grenze()
	 * @generated
	 */
	int NB_ZONE_GRENZE = 22;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_GRENZE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_GRENZE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_GRENZE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_GRENZE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_GRENZE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Markanter Punkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_GRENZE__ID_MARKANTER_PUNKT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDNB Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_GRENZE__IDNB_ZONE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>NB Grenze Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_GRENZE__NB_GRENZE_ART = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>NB Zone Grenze</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_GRENZE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Reihenfolgezwang_AttributeGroupImpl <em>NB Zone Reihenfolgezwang Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Reihenfolgezwang_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Reihenfolgezwang_AttributeGroup()
	 * @generated
	 */
	int NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP = 23;

	/**
	 * The feature id for the '<em><b>NB Zone Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP__NB_ZONE_ALLG = 0;

	/**
	 * The number of structural features of the '<em>NB Zone Reihenfolgezwang Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Rang_TypeClassImpl <em>Rang Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Rang_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getRang_TypeClass()
	 * @generated
	 */
	int RANG_TYPE_CLASS = 24;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.SBUE_TypeClassImpl <em>SBUE Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.SBUE_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getSBUE_TypeClass()
	 * @generated
	 */
	int SBUE_TYPE_CLASS = 25;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBUE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBUE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SBUE Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBUE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.SLE_SLS_TypeClassImpl <em>SLE SLS Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.SLE_SLS_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getSLE_SLS_TypeClass()
	 * @generated
	 */
	int SLE_SLS_TYPE_CLASS = 26;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLE_SLS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLE_SLS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SLE SLS Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLE_SLS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Taste_ANF_TypeClassImpl <em>Taste ANF Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Taste_ANF_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getTaste_ANF_TypeClass()
	 * @generated
	 */
	int TASTE_ANF_TYPE_CLASS = 27;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE_ANF_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE_ANF_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Taste ANF Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE_ANF_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Taste_FGT_TypeClassImpl <em>Taste FGT Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Taste_FGT_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getTaste_FGT_TypeClass()
	 * @generated
	 */
	int TASTE_FGT_TYPE_CLASS = 28;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE_FGT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE_FGT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Taste FGT Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE_FGT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Taste_WGT_TypeClassImpl <em>Taste WGT Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Taste_WGT_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getTaste_WGT_TypeClass()
	 * @generated
	 */
	int TASTE_WGT_TYPE_CLASS = 29;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE_WGT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE_WGT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Taste WGT Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE_WGT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.W_Gsp_Lage_TypeClassImpl <em>WGsp Lage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.W_Gsp_Lage_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getW_Gsp_Lage_TypeClass()
	 * @generated
	 */
	int WGSP_LAGE_TYPE_CLASS = 30;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGSP_LAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGSP_LAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WGsp Lage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WGSP_LAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.WHU_TypeClassImpl <em>WHU Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.WHU_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getWHU_TypeClass()
	 * @generated
	 */
	int WHU_TYPE_CLASS = 31;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHU_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHU_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WHU Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHU_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.WUS_TypeClassImpl <em>WUS Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.WUS_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getWUS_TypeClass()
	 * @generated
	 */
	int WUS_TYPE_CLASS = 32;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WUS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WUS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WUS Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WUS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBArt <em>ENUMNB Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBArt
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBArt()
	 * @generated
	 */
	int ENUMNB_ART = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBGrenzeArt <em>ENUMNB Grenze Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBGrenzeArt
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBGrenzeArt()
	 * @generated
	 */
	int ENUMNB_GRENZE_ART = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBRueckgabevoraussetzung <em>ENUMNB Rueckgabevoraussetzung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBRueckgabevoraussetzung
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBRueckgabevoraussetzung()
	 * @generated
	 */
	int ENUMNB_RUECKGABEVORAUSSETZUNG = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBVerhaeltnisBesonders <em>ENUMNB Verhaeltnis Besonders</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBVerhaeltnisBesonders
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBVerhaeltnisBesonders()
	 * @generated
	 */
	int ENUMNB_VERHAELTNIS_BESONDERS = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMWGspLage <em>ENUMW Gsp Lage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMWGspLage
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMWGspLage()
	 * @generated
	 */
	int ENUMW_GSP_LAGE = 37;

	/**
	 * The meta object id for the '<em>Bezeichnung NB Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getBezeichnung_NB_Type()
	 * @generated
	 */
	int BEZEICHNUNG_NB_TYPE = 38;

	/**
	 * The meta object id for the '<em>Bezeichnung NB Zone Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getBezeichnung_NB_Zone_Type()
	 * @generated
	 */
	int BEZEICHNUNG_NB_ZONE_TYPE = 39;

	/**
	 * The meta object id for the '<em>ENUMNB Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBArt
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBArtObject()
	 * @generated
	 */
	int ENUMNB_ART_OBJECT = 40;

	/**
	 * The meta object id for the '<em>ENUMNB Grenze Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBGrenzeArt
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBGrenzeArtObject()
	 * @generated
	 */
	int ENUMNB_GRENZE_ART_OBJECT = 41;

	/**
	 * The meta object id for the '<em>ENUMNB Rueckgabevoraussetzung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBRueckgabevoraussetzung
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBRueckgabevoraussetzungObject()
	 * @generated
	 */
	int ENUMNB_RUECKGABEVORAUSSETZUNG_OBJECT = 42;

	/**
	 * The meta object id for the '<em>ENUMNB Verhaeltnis Besonders Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBVerhaeltnisBesonders
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBVerhaeltnisBesondersObject()
	 * @generated
	 */
	int ENUMNB_VERHAELTNIS_BESONDERS_OBJECT = 43;

	/**
	 * The meta object id for the '<em>ENUMW Gsp Lage Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMWGspLage
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMWGspLageObject()
	 * @generated
	 */
	int ENUMW_GSP_LAGE_OBJECT = 44;

	/**
	 * The meta object id for the '<em>NB Zone Allg Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Allg_Type()
	 * @generated
	 */
	int NB_ZONE_ALLG_TYPE = 45;

	/**
	 * The meta object id for the '<em>Rang Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getRang_Type()
	 * @generated
	 */
	int RANG_TYPE = 46;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.AWU_TypeClass <em>AWU Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AWU Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.AWU_TypeClass
	 * @generated
	 */
	EClass getAWU_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.AWU_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.AWU_TypeClass#getWert()
	 * @see #getAWU_TypeClass()
	 * @generated
	 */
	EAttribute getAWU_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.Bezeichnung_NB_TypeClass <em>Bezeichnung NB Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung NB Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Bezeichnung_NB_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_NB_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.Bezeichnung_NB_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Bezeichnung_NB_TypeClass#getWert()
	 * @see #getBezeichnung_NB_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_NB_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.Bezeichnung_NB_Zone_TypeClass <em>Bezeichnung NB Zone Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung NB Zone Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Bezeichnung_NB_Zone_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_NB_Zone_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.Bezeichnung_NB_Zone_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Bezeichnung_NB_Zone_TypeClass#getWert()
	 * @see #getBezeichnung_NB_Zone_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_NB_Zone_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.F_ST_Z_TypeClass <em>FST ZType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FST ZType Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.F_ST_Z_TypeClass
	 * @generated
	 */
	EClass getF_ST_Z_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.F_ST_Z_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.F_ST_Z_TypeClass#getWert()
	 * @see #getF_ST_Z_TypeClass()
	 * @generated
	 */
	EAttribute getF_ST_Z_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.FA_FAE_TypeClass <em>FA FAE Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FA FAE Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.FA_FAE_TypeClass
	 * @generated
	 */
	EClass getFA_FAE_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.FA_FAE_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.FA_FAE_TypeClass#getWert()
	 * @see #getFA_FAE_TypeClass()
	 * @generated
	 */
	EAttribute getFA_FAE_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.Freie_Stellbarkeit_TypeClass <em>Freie Stellbarkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Freie Stellbarkeit Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Freie_Stellbarkeit_TypeClass
	 * @generated
	 */
	EClass getFreie_Stellbarkeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.Freie_Stellbarkeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Freie_Stellbarkeit_TypeClass#getWert()
	 * @see #getFreie_Stellbarkeit_TypeClass()
	 * @generated
	 */
	EAttribute getFreie_Stellbarkeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.Kennzahl_TypeClass <em>Kennzahl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kennzahl Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Kennzahl_TypeClass
	 * @generated
	 */
	EClass getKennzahl_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.Kennzahl_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Kennzahl_TypeClass#getWert()
	 * @see #getKennzahl_TypeClass()
	 * @generated
	 */
	EAttribute getKennzahl_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB <em>NB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB
	 * @generated
	 */
	EClass getNB();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB#getBezeichnung()
	 * @see #getNB()
	 * @generated
	 */
	EReference getNB_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB#getNBArt <em>NB Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NB Art</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB#getNBArt()
	 * @see #getNB()
	 * @generated
	 */
	EReference getNB_NBArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB#getNBFunktionalitaetNBR <em>NB Funktionalitaet NBR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NB Funktionalitaet NBR</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB#getNBFunktionalitaetNBR()
	 * @see #getNB()
	 * @generated
	 */
	EReference getNB_NBFunktionalitaetNBR();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Art_TypeClass <em>NB Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Art_TypeClass
	 * @generated
	 */
	EClass getNB_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Art_TypeClass#getWert()
	 * @see #getNB_Art_TypeClass()
	 * @generated
	 */
	EAttribute getNB_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element <em>NB Bedien Anzeige Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Bedien Anzeige Element</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element
	 * @generated
	 */
	EClass getNB_Bedien_Anzeige_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bedien Anzeige Element</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element#getIDBedienAnzeigeElement()
	 * @see #getNB_Bedien_Anzeige_Element()
	 * @generated
	 */
	EReference getNB_Bedien_Anzeige_Element_IDBedienAnzeigeElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element#getIDNBZone <em>IDNB Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDNB Zone</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element#getIDNBZone()
	 * @see #getNB_Bedien_Anzeige_Element()
	 * @generated
	 */
	EReference getNB_Bedien_Anzeige_Element_IDNBZone();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element#getNBBedienAnzeigeFunktionen <em>NB Bedien Anzeige Funktionen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NB Bedien Anzeige Funktionen</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element#getNBBedienAnzeigeFunktionen()
	 * @see #getNB_Bedien_Anzeige_Element()
	 * @generated
	 */
	EReference getNB_Bedien_Anzeige_Element_NBBedienAnzeigeFunktionen();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup <em>NB Bedien Anzeige Funktionen Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Bedien Anzeige Funktionen Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup
	 * @generated
	 */
	EClass getNB_Bedien_Anzeige_Funktionen_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup#getTasteANF <em>Taste ANF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taste ANF</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup#getTasteANF()
	 * @see #getNB_Bedien_Anzeige_Funktionen_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteANF();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup#getTasteFGT <em>Taste FGT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taste FGT</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup#getTasteFGT()
	 * @see #getNB_Bedien_Anzeige_Funktionen_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteFGT();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup#getTasteWGT <em>Taste WGT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taste WGT</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup#getTasteWGT()
	 * @see #getNB_Bedien_Anzeige_Funktionen_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteWGT();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bezeichnung_AttributeGroup <em>NB Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getNB_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bezeichnung_AttributeGroup#getBezeichnungNB <em>Bezeichnung NB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung NB</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bezeichnung_AttributeGroup#getBezeichnungNB()
	 * @see #getNB_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Bezeichnung_AttributeGroup_BezeichnungNB();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bezeichnung_AttributeGroup#getKennzahl <em>Kennzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kennzahl</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Bezeichnung_AttributeGroup#getKennzahl()
	 * @see #getNB_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Bezeichnung_AttributeGroup_Kennzahl();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup <em>NB Funktionalitaet NB RAttribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Funktionalitaet NB RAttribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup
	 * @generated
	 */
	EClass getNB_Funktionalitaet_NB_R_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getAWU <em>AWU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>AWU</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getAWU()
	 * @see #getNB_Funktionalitaet_NB_R_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Funktionalitaet_NB_R_AttributeGroup_AWU();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getFSTZ <em>FSTZ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FSTZ</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getFSTZ()
	 * @see #getNB_Funktionalitaet_NB_R_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Funktionalitaet_NB_R_AttributeGroup_FSTZ();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getFAFAE <em>FAFAE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FAFAE</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getFAFAE()
	 * @see #getNB_Funktionalitaet_NB_R_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Funktionalitaet_NB_R_AttributeGroup_FAFAE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getSBUE <em>SBUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SBUE</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getSBUE()
	 * @see #getNB_Funktionalitaet_NB_R_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Funktionalitaet_NB_R_AttributeGroup_SBUE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getSLESLS <em>SLESLS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SLESLS</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getSLESLS()
	 * @see #getNB_Funktionalitaet_NB_R_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Funktionalitaet_NB_R_AttributeGroup_SLESLS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getWHU <em>WHU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WHU</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getWHU()
	 * @see #getNB_Funktionalitaet_NB_R_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Funktionalitaet_NB_R_AttributeGroup_WHU();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getWUS <em>WUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WUS</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup#getWUS()
	 * @see #getNB_Funktionalitaet_NB_R_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Funktionalitaet_NB_R_AttributeGroup_WUS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Grenze_Art_TypeClass <em>NB Grenze Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Grenze Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Grenze_Art_TypeClass
	 * @generated
	 */
	EClass getNB_Grenze_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Grenze_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Grenze_Art_TypeClass#getWert()
	 * @see #getNB_Grenze_Art_TypeClass()
	 * @generated
	 */
	EAttribute getNB_Grenze_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass <em>NB Rueckgabevoraussetzung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Rueckgabevoraussetzung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass
	 * @generated
	 */
	EClass getNB_Rueckgabevoraussetzung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass#getWert()
	 * @see #getNB_Rueckgabevoraussetzung_TypeClass()
	 * @generated
	 */
	EAttribute getNB_Rueckgabevoraussetzung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Verhaeltnis_Besonders_TypeClass <em>NB Verhaeltnis Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Verhaeltnis Besonders Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Verhaeltnis_Besonders_TypeClass
	 * @generated
	 */
	EClass getNB_Verhaeltnis_Besonders_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Verhaeltnis_Besonders_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Verhaeltnis_Besonders_TypeClass#getWert()
	 * @see #getNB_Verhaeltnis_Besonders_TypeClass()
	 * @generated
	 */
	EAttribute getNB_Verhaeltnis_Besonders_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone <em>NB Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Zone</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone
	 * @generated
	 */
	EClass getNB_Zone();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone#getBezeichnung()
	 * @see #getNB_Zone()
	 * @generated
	 */
	EReference getNB_Zone_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone#getIDNB <em>IDNB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDNB</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone#getIDNB()
	 * @see #getNB_Zone()
	 * @generated
	 */
	EReference getNB_Zone_IDNB();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone#getIDNBZone <em>IDNB Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDNB Zone</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone#getIDNBZone()
	 * @see #getNB_Zone()
	 * @generated
	 */
	EReference getNB_Zone_IDNBZone();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone#getNBZoneAllg <em>NB Zone Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NB Zone Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone#getNBZoneAllg()
	 * @see #getNB_Zone()
	 * @generated
	 */
	EReference getNB_Zone_NBZoneAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_AttributeGroup <em>NB Zone Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Zone Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_AttributeGroup
	 * @generated
	 */
	EClass getNB_Zone_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_AttributeGroup#getNBVerhaeltnisBesonders <em>NB Verhaeltnis Besonders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NB Verhaeltnis Besonders</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_AttributeGroup#getNBVerhaeltnisBesonders()
	 * @see #getNB_Zone_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Zone_Allg_AttributeGroup_NBVerhaeltnisBesonders();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_AttributeGroup#getRang <em>Rang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rang</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_AttributeGroup#getRang()
	 * @see #getNB_Zone_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Zone_Allg_AttributeGroup_Rang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_TypeClass <em>NB Zone Allg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Zone Allg Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_TypeClass
	 * @generated
	 */
	EClass getNB_Zone_Allg_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_TypeClass#getWert()
	 * @see #getNB_Zone_Allg_TypeClass()
	 * @generated
	 */
	EAttribute getNB_Zone_Allg_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup <em>NB Zone Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Zone Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getNB_Zone_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup#getBezeichnungNBZone <em>Bezeichnung NB Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung NB Zone</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup#getBezeichnungNBZone()
	 * @see #getNB_Zone_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Zone_Bezeichnung_AttributeGroup_BezeichnungNBZone();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element <em>NB Zone Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Zone Element</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element
	 * @generated
	 */
	EClass getNB_Zone_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element#getIDNBElement <em>IDNB Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDNB Element</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element#getIDNBElement()
	 * @see #getNB_Zone_Element()
	 * @generated
	 */
	EReference getNB_Zone_Element_IDNBElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element#getIDNBZone <em>IDNB Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDNB Zone</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element#getIDNBZone()
	 * @see #getNB_Zone_Element()
	 * @generated
	 */
	EReference getNB_Zone_Element_IDNBZone();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element#getNBZoneElementAllg <em>NB Zone Element Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NB Zone Element Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element#getNBZoneElementAllg()
	 * @see #getNB_Zone_Element()
	 * @generated
	 */
	EReference getNB_Zone_Element_NBZoneElementAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup <em>NB Zone Element Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Zone Element Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup
	 * @generated
	 */
	EClass getNB_Zone_Element_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup#getFreieStellbarkeit <em>Freie Stellbarkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Freie Stellbarkeit</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup#getFreieStellbarkeit()
	 * @see #getNB_Zone_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Zone_Element_Allg_AttributeGroup_FreieStellbarkeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup#getNBRueckgabevoraussetzung <em>NB Rueckgabevoraussetzung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NB Rueckgabevoraussetzung</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup#getNBRueckgabevoraussetzung()
	 * @see #getNB_Zone_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Zone_Element_Allg_AttributeGroup_NBRueckgabevoraussetzung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup#getWGspLage <em>WGsp Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WGsp Lage</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup#getWGspLage()
	 * @see #getNB_Zone_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Zone_Element_Allg_AttributeGroup_WGspLage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Grenze <em>NB Zone Grenze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Zone Grenze</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Grenze
	 * @generated
	 */
	EClass getNB_Zone_Grenze();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Grenze#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Markanter Punkt</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Grenze#getIDMarkanterPunkt()
	 * @see #getNB_Zone_Grenze()
	 * @generated
	 */
	EReference getNB_Zone_Grenze_IDMarkanterPunkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Grenze#getIDNBZone <em>IDNB Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDNB Zone</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Grenze#getIDNBZone()
	 * @see #getNB_Zone_Grenze()
	 * @generated
	 */
	EReference getNB_Zone_Grenze_IDNBZone();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Grenze#getNBGrenzeArt <em>NB Grenze Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NB Grenze Art</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Grenze#getNBGrenzeArt()
	 * @see #getNB_Zone_Grenze()
	 * @generated
	 */
	EReference getNB_Zone_Grenze_NBGrenzeArt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Reihenfolgezwang_AttributeGroup <em>NB Zone Reihenfolgezwang Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Zone Reihenfolgezwang Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Reihenfolgezwang_AttributeGroup
	 * @generated
	 */
	EClass getNB_Zone_Reihenfolgezwang_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Reihenfolgezwang_AttributeGroup#getNBZoneAllg <em>NB Zone Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>NB Zone Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Reihenfolgezwang_AttributeGroup#getNBZoneAllg()
	 * @see #getNB_Zone_Reihenfolgezwang_AttributeGroup()
	 * @generated
	 */
	EReference getNB_Zone_Reihenfolgezwang_AttributeGroup_NBZoneAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.Rang_TypeClass <em>Rang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rang Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Rang_TypeClass
	 * @generated
	 */
	EClass getRang_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.Rang_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Rang_TypeClass#getWert()
	 * @see #getRang_TypeClass()
	 * @generated
	 */
	EAttribute getRang_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.SBUE_TypeClass <em>SBUE Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SBUE Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.SBUE_TypeClass
	 * @generated
	 */
	EClass getSBUE_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.SBUE_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.SBUE_TypeClass#getWert()
	 * @see #getSBUE_TypeClass()
	 * @generated
	 */
	EAttribute getSBUE_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.SLE_SLS_TypeClass <em>SLE SLS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLE SLS Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.SLE_SLS_TypeClass
	 * @generated
	 */
	EClass getSLE_SLS_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.SLE_SLS_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.SLE_SLS_TypeClass#getWert()
	 * @see #getSLE_SLS_TypeClass()
	 * @generated
	 */
	EAttribute getSLE_SLS_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.Taste_ANF_TypeClass <em>Taste ANF Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taste ANF Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Taste_ANF_TypeClass
	 * @generated
	 */
	EClass getTaste_ANF_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.Taste_ANF_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Taste_ANF_TypeClass#getWert()
	 * @see #getTaste_ANF_TypeClass()
	 * @generated
	 */
	EAttribute getTaste_ANF_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.Taste_FGT_TypeClass <em>Taste FGT Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taste FGT Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Taste_FGT_TypeClass
	 * @generated
	 */
	EClass getTaste_FGT_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.Taste_FGT_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Taste_FGT_TypeClass#getWert()
	 * @see #getTaste_FGT_TypeClass()
	 * @generated
	 */
	EAttribute getTaste_FGT_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.Taste_WGT_TypeClass <em>Taste WGT Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taste WGT Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Taste_WGT_TypeClass
	 * @generated
	 */
	EClass getTaste_WGT_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.Taste_WGT_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.Taste_WGT_TypeClass#getWert()
	 * @see #getTaste_WGT_TypeClass()
	 * @generated
	 */
	EAttribute getTaste_WGT_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.W_Gsp_Lage_TypeClass <em>WGsp Lage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WGsp Lage Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.W_Gsp_Lage_TypeClass
	 * @generated
	 */
	EClass getW_Gsp_Lage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.W_Gsp_Lage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.W_Gsp_Lage_TypeClass#getWert()
	 * @see #getW_Gsp_Lage_TypeClass()
	 * @generated
	 */
	EAttribute getW_Gsp_Lage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.WHU_TypeClass <em>WHU Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WHU Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.WHU_TypeClass
	 * @generated
	 */
	EClass getWHU_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.WHU_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.WHU_TypeClass#getWert()
	 * @see #getWHU_TypeClass()
	 * @generated
	 */
	EAttribute getWHU_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Nahbedienung.WUS_TypeClass <em>WUS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WUS Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.WUS_TypeClass
	 * @generated
	 */
	EClass getWUS_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Nahbedienung.WUS_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.WUS_TypeClass#getWert()
	 * @see #getWUS_TypeClass()
	 * @generated
	 */
	EAttribute getWUS_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBArt <em>ENUMNB Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMNB Art</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBArt
	 * @generated
	 */
	EEnum getENUMNBArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBGrenzeArt <em>ENUMNB Grenze Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMNB Grenze Art</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBGrenzeArt
	 * @generated
	 */
	EEnum getENUMNBGrenzeArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBRueckgabevoraussetzung <em>ENUMNB Rueckgabevoraussetzung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMNB Rueckgabevoraussetzung</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBRueckgabevoraussetzung
	 * @generated
	 */
	EEnum getENUMNBRueckgabevoraussetzung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBVerhaeltnisBesonders <em>ENUMNB Verhaeltnis Besonders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMNB Verhaeltnis Besonders</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBVerhaeltnisBesonders
	 * @generated
	 */
	EEnum getENUMNBVerhaeltnisBesonders();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMWGspLage <em>ENUMW Gsp Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMW Gsp Lage</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMWGspLage
	 * @generated
	 */
	EEnum getENUMWGspLage();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Bezeichnung NB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung NB Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TBezeichnung_NB' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9][0-9]?'"
	 * @generated
	 */
	EDataType getBezeichnung_NB_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Bezeichnung NB Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung NB Zone Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TBezeichnung_NB_Zone' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9][0-9]?'"
	 * @generated
	 */
	EDataType getBezeichnung_NB_Zone_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBArt <em>ENUMNB Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMNB Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Nahbedienung.ENUMNBArt"
	 *        extendedMetaData="name='ENUMNB_Art:Object' baseType='ENUMNB_Art'"
	 * @generated
	 */
	EDataType getENUMNBArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBGrenzeArt <em>ENUMNB Grenze Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMNB Grenze Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBGrenzeArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Nahbedienung.ENUMNBGrenzeArt"
	 *        extendedMetaData="name='ENUMNB_Grenze_Art:Object' baseType='ENUMNB_Grenze_Art'"
	 * @generated
	 */
	EDataType getENUMNBGrenzeArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBRueckgabevoraussetzung <em>ENUMNB Rueckgabevoraussetzung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMNB Rueckgabevoraussetzung Object</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBRueckgabevoraussetzung
	 * @model instanceClass="org.eclipse.set.model.planpro.Nahbedienung.ENUMNBRueckgabevoraussetzung"
	 *        extendedMetaData="name='ENUMNB_Rueckgabevoraussetzung:Object' baseType='ENUMNB_Rueckgabevoraussetzung'"
	 * @generated
	 */
	EDataType getENUMNBRueckgabevoraussetzungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBVerhaeltnisBesonders <em>ENUMNB Verhaeltnis Besonders Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMNB Verhaeltnis Besonders Object</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBVerhaeltnisBesonders
	 * @model instanceClass="org.eclipse.set.model.planpro.Nahbedienung.ENUMNBVerhaeltnisBesonders"
	 *        extendedMetaData="name='ENUMNB_Verhaeltnis_Besonders:Object' baseType='ENUMNB_Verhaeltnis_Besonders'"
	 * @generated
	 */
	EDataType getENUMNBVerhaeltnisBesondersObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMWGspLage <em>ENUMW Gsp Lage Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMW Gsp Lage Object</em>'.
	 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMWGspLage
	 * @model instanceClass="org.eclipse.set.model.planpro.Nahbedienung.ENUMWGspLage"
	 *        extendedMetaData="name='ENUMW_Gsp_Lage:Object' baseType='ENUMW_Gsp_Lage'"
	 * @generated
	 */
	EDataType getENUMWGspLageObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>NB Zone Allg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>NB Zone Allg Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TNB_Zone_Allg' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9][0-9]*'"
	 * @generated
	 */
	EDataType getNB_Zone_Allg_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Rang Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rang Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TRang' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9][0-9]{0,}'"
	 * @generated
	 */
	EDataType getRang_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NahbedienungFactory getNahbedienungFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.AWU_TypeClassImpl <em>AWU Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.AWU_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getAWU_TypeClass()
		 * @generated
		 */
		EClass AWU_TYPE_CLASS = eINSTANCE.getAWU_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWU_TYPE_CLASS__WERT = eINSTANCE.getAWU_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Bezeichnung_NB_TypeClassImpl <em>Bezeichnung NB Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Bezeichnung_NB_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getBezeichnung_NB_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_NB_TYPE_CLASS = eINSTANCE.getBezeichnung_NB_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_NB_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_NB_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Bezeichnung_NB_Zone_TypeClassImpl <em>Bezeichnung NB Zone Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Bezeichnung_NB_Zone_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getBezeichnung_NB_Zone_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_NB_ZONE_TYPE_CLASS = eINSTANCE.getBezeichnung_NB_Zone_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_NB_ZONE_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_NB_Zone_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.F_ST_Z_TypeClassImpl <em>FST ZType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.F_ST_Z_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getF_ST_Z_TypeClass()
		 * @generated
		 */
		EClass FST_ZTYPE_CLASS = eINSTANCE.getF_ST_Z_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FST_ZTYPE_CLASS__WERT = eINSTANCE.getF_ST_Z_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.FA_FAE_TypeClassImpl <em>FA FAE Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.FA_FAE_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getFA_FAE_TypeClass()
		 * @generated
		 */
		EClass FA_FAE_TYPE_CLASS = eINSTANCE.getFA_FAE_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FA_FAE_TYPE_CLASS__WERT = eINSTANCE.getFA_FAE_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Freie_Stellbarkeit_TypeClassImpl <em>Freie Stellbarkeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Freie_Stellbarkeit_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getFreie_Stellbarkeit_TypeClass()
		 * @generated
		 */
		EClass FREIE_STELLBARKEIT_TYPE_CLASS = eINSTANCE.getFreie_Stellbarkeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREIE_STELLBARKEIT_TYPE_CLASS__WERT = eINSTANCE.getFreie_Stellbarkeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Kennzahl_TypeClassImpl <em>Kennzahl Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Kennzahl_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getKennzahl_TypeClass()
		 * @generated
		 */
		EClass KENNZAHL_TYPE_CLASS = eINSTANCE.getKennzahl_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KENNZAHL_TYPE_CLASS__WERT = eINSTANCE.getKennzahl_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NBImpl <em>NB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NBImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB()
		 * @generated
		 */
		EClass NB = eINSTANCE.getNB();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB__BEZEICHNUNG = eINSTANCE.getNB_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>NB Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB__NB_ART = eINSTANCE.getNB_NBArt();

		/**
		 * The meta object literal for the '<em><b>NB Funktionalitaet NBR</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB__NB_FUNKTIONALITAET_NBR = eINSTANCE.getNB_NBFunktionalitaetNBR();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Art_TypeClassImpl <em>NB Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Art_TypeClass()
		 * @generated
		 */
		EClass NB_ART_TYPE_CLASS = eINSTANCE.getNB_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB_ART_TYPE_CLASS__WERT = eINSTANCE.getNB_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_ElementImpl <em>NB Bedien Anzeige Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_ElementImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Bedien_Anzeige_Element()
		 * @generated
		 */
		EClass NB_BEDIEN_ANZEIGE_ELEMENT = eINSTANCE.getNB_Bedien_Anzeige_Element();

		/**
		 * The meta object literal for the '<em><b>ID Bedien Anzeige Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT = eINSTANCE.getNB_Bedien_Anzeige_Element_IDBedienAnzeigeElement();

		/**
		 * The meta object literal for the '<em><b>IDNB Zone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE = eINSTANCE.getNB_Bedien_Anzeige_Element_IDNBZone();

		/**
		 * The meta object literal for the '<em><b>NB Bedien Anzeige Funktionen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN = eINSTANCE.getNB_Bedien_Anzeige_Element_NBBedienAnzeigeFunktionen();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_Funktionen_AttributeGroupImpl <em>NB Bedien Anzeige Funktionen Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_Funktionen_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Bedien_Anzeige_Funktionen_AttributeGroup()
		 * @generated
		 */
		EClass NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP = eINSTANCE.getNB_Bedien_Anzeige_Funktionen_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Taste ANF</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_ANF = eINSTANCE.getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteANF();

		/**
		 * The meta object literal for the '<em><b>Taste FGT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_FGT = eINSTANCE.getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteFGT();

		/**
		 * The meta object literal for the '<em><b>Taste WGT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_WGT = eINSTANCE.getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteWGT();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bezeichnung_AttributeGroupImpl <em>NB Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass NB_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getNB_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung NB</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB = eINSTANCE.getNB_Bezeichnung_AttributeGroup_BezeichnungNB();

		/**
		 * The meta object literal for the '<em><b>Kennzahl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_BEZEICHNUNG_ATTRIBUTE_GROUP__KENNZAHL = eINSTANCE.getNB_Bezeichnung_AttributeGroup_Kennzahl();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Funktionalitaet_NB_R_AttributeGroupImpl <em>NB Funktionalitaet NB RAttribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Funktionalitaet_NB_R_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Funktionalitaet_NB_R_AttributeGroup()
		 * @generated
		 */
		EClass NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP = eINSTANCE.getNB_Funktionalitaet_NB_R_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>AWU</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__AWU = eINSTANCE.getNB_Funktionalitaet_NB_R_AttributeGroup_AWU();

		/**
		 * The meta object literal for the '<em><b>FSTZ</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FSTZ = eINSTANCE.getNB_Funktionalitaet_NB_R_AttributeGroup_FSTZ();

		/**
		 * The meta object literal for the '<em><b>FAFAE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FAFAE = eINSTANCE.getNB_Funktionalitaet_NB_R_AttributeGroup_FAFAE();

		/**
		 * The meta object literal for the '<em><b>SBUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SBUE = eINSTANCE.getNB_Funktionalitaet_NB_R_AttributeGroup_SBUE();

		/**
		 * The meta object literal for the '<em><b>SLESLS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SLESLS = eINSTANCE.getNB_Funktionalitaet_NB_R_AttributeGroup_SLESLS();

		/**
		 * The meta object literal for the '<em><b>WHU</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WHU = eINSTANCE.getNB_Funktionalitaet_NB_R_AttributeGroup_WHU();

		/**
		 * The meta object literal for the '<em><b>WUS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WUS = eINSTANCE.getNB_Funktionalitaet_NB_R_AttributeGroup_WUS();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Grenze_Art_TypeClassImpl <em>NB Grenze Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Grenze_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Grenze_Art_TypeClass()
		 * @generated
		 */
		EClass NB_GRENZE_ART_TYPE_CLASS = eINSTANCE.getNB_Grenze_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB_GRENZE_ART_TYPE_CLASS__WERT = eINSTANCE.getNB_Grenze_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Rueckgabevoraussetzung_TypeClassImpl <em>NB Rueckgabevoraussetzung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Rueckgabevoraussetzung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Rueckgabevoraussetzung_TypeClass()
		 * @generated
		 */
		EClass NB_RUECKGABEVORAUSSETZUNG_TYPE_CLASS = eINSTANCE.getNB_Rueckgabevoraussetzung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB_RUECKGABEVORAUSSETZUNG_TYPE_CLASS__WERT = eINSTANCE.getNB_Rueckgabevoraussetzung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Verhaeltnis_Besonders_TypeClassImpl <em>NB Verhaeltnis Besonders Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Verhaeltnis_Besonders_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Verhaeltnis_Besonders_TypeClass()
		 * @generated
		 */
		EClass NB_VERHAELTNIS_BESONDERS_TYPE_CLASS = eINSTANCE.getNB_Verhaeltnis_Besonders_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB_VERHAELTNIS_BESONDERS_TYPE_CLASS__WERT = eINSTANCE.getNB_Verhaeltnis_Besonders_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_ZoneImpl <em>NB Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_ZoneImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone()
		 * @generated
		 */
		EClass NB_ZONE = eINSTANCE.getNB_Zone();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE__BEZEICHNUNG = eINSTANCE.getNB_Zone_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>IDNB</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE__IDNB = eINSTANCE.getNB_Zone_IDNB();

		/**
		 * The meta object literal for the '<em><b>IDNB Zone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE__IDNB_ZONE = eINSTANCE.getNB_Zone_IDNBZone();

		/**
		 * The meta object literal for the '<em><b>NB Zone Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE__NB_ZONE_ALLG = eINSTANCE.getNB_Zone_NBZoneAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Allg_AttributeGroupImpl <em>NB Zone Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Allg_AttributeGroup()
		 * @generated
		 */
		EClass NB_ZONE_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getNB_Zone_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>NB Verhaeltnis Besonders</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_VERHAELTNIS_BESONDERS = eINSTANCE.getNB_Zone_Allg_AttributeGroup_NBVerhaeltnisBesonders();

		/**
		 * The meta object literal for the '<em><b>Rang</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE_ALLG_ATTRIBUTE_GROUP__RANG = eINSTANCE.getNB_Zone_Allg_AttributeGroup_Rang();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Allg_TypeClassImpl <em>NB Zone Allg Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Allg_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Allg_TypeClass()
		 * @generated
		 */
		EClass NB_ZONE_ALLG_TYPE_CLASS = eINSTANCE.getNB_Zone_Allg_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB_ZONE_ALLG_TYPE_CLASS__WERT = eINSTANCE.getNB_Zone_Allg_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Bezeichnung_AttributeGroupImpl <em>NB Zone Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getNB_Zone_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung NB Zone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB_ZONE = eINSTANCE.getNB_Zone_Bezeichnung_AttributeGroup_BezeichnungNBZone();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_ElementImpl <em>NB Zone Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_ElementImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Element()
		 * @generated
		 */
		EClass NB_ZONE_ELEMENT = eINSTANCE.getNB_Zone_Element();

		/**
		 * The meta object literal for the '<em><b>IDNB Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE_ELEMENT__IDNB_ELEMENT = eINSTANCE.getNB_Zone_Element_IDNBElement();

		/**
		 * The meta object literal for the '<em><b>IDNB Zone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE_ELEMENT__IDNB_ZONE = eINSTANCE.getNB_Zone_Element_IDNBZone();

		/**
		 * The meta object literal for the '<em><b>NB Zone Element Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG = eINSTANCE.getNB_Zone_Element_NBZoneElementAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Element_Allg_AttributeGroupImpl <em>NB Zone Element Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Element_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Element_Allg_AttributeGroup()
		 * @generated
		 */
		EClass NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getNB_Zone_Element_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Freie Stellbarkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__FREIE_STELLBARKEIT = eINSTANCE.getNB_Zone_Element_Allg_AttributeGroup_FreieStellbarkeit();

		/**
		 * The meta object literal for the '<em><b>NB Rueckgabevoraussetzung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__NB_RUECKGABEVORAUSSETZUNG = eINSTANCE.getNB_Zone_Element_Allg_AttributeGroup_NBRueckgabevoraussetzung();

		/**
		 * The meta object literal for the '<em><b>WGsp Lage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__WGSP_LAGE = eINSTANCE.getNB_Zone_Element_Allg_AttributeGroup_WGspLage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_GrenzeImpl <em>NB Zone Grenze</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_GrenzeImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Grenze()
		 * @generated
		 */
		EClass NB_ZONE_GRENZE = eINSTANCE.getNB_Zone_Grenze();

		/**
		 * The meta object literal for the '<em><b>ID Markanter Punkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE_GRENZE__ID_MARKANTER_PUNKT = eINSTANCE.getNB_Zone_Grenze_IDMarkanterPunkt();

		/**
		 * The meta object literal for the '<em><b>IDNB Zone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE_GRENZE__IDNB_ZONE = eINSTANCE.getNB_Zone_Grenze_IDNBZone();

		/**
		 * The meta object literal for the '<em><b>NB Grenze Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE_GRENZE__NB_GRENZE_ART = eINSTANCE.getNB_Zone_Grenze_NBGrenzeArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Reihenfolgezwang_AttributeGroupImpl <em>NB Zone Reihenfolgezwang Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Reihenfolgezwang_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Reihenfolgezwang_AttributeGroup()
		 * @generated
		 */
		EClass NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP = eINSTANCE.getNB_Zone_Reihenfolgezwang_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>NB Zone Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP__NB_ZONE_ALLG = eINSTANCE.getNB_Zone_Reihenfolgezwang_AttributeGroup_NBZoneAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Rang_TypeClassImpl <em>Rang Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Rang_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getRang_TypeClass()
		 * @generated
		 */
		EClass RANG_TYPE_CLASS = eINSTANCE.getRang_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANG_TYPE_CLASS__WERT = eINSTANCE.getRang_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.SBUE_TypeClassImpl <em>SBUE Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.SBUE_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getSBUE_TypeClass()
		 * @generated
		 */
		EClass SBUE_TYPE_CLASS = eINSTANCE.getSBUE_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SBUE_TYPE_CLASS__WERT = eINSTANCE.getSBUE_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.SLE_SLS_TypeClassImpl <em>SLE SLS Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.SLE_SLS_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getSLE_SLS_TypeClass()
		 * @generated
		 */
		EClass SLE_SLS_TYPE_CLASS = eINSTANCE.getSLE_SLS_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLE_SLS_TYPE_CLASS__WERT = eINSTANCE.getSLE_SLS_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Taste_ANF_TypeClassImpl <em>Taste ANF Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Taste_ANF_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getTaste_ANF_TypeClass()
		 * @generated
		 */
		EClass TASTE_ANF_TYPE_CLASS = eINSTANCE.getTaste_ANF_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASTE_ANF_TYPE_CLASS__WERT = eINSTANCE.getTaste_ANF_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Taste_FGT_TypeClassImpl <em>Taste FGT Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Taste_FGT_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getTaste_FGT_TypeClass()
		 * @generated
		 */
		EClass TASTE_FGT_TYPE_CLASS = eINSTANCE.getTaste_FGT_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASTE_FGT_TYPE_CLASS__WERT = eINSTANCE.getTaste_FGT_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.Taste_WGT_TypeClassImpl <em>Taste WGT Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.Taste_WGT_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getTaste_WGT_TypeClass()
		 * @generated
		 */
		EClass TASTE_WGT_TYPE_CLASS = eINSTANCE.getTaste_WGT_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASTE_WGT_TYPE_CLASS__WERT = eINSTANCE.getTaste_WGT_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.W_Gsp_Lage_TypeClassImpl <em>WGsp Lage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.W_Gsp_Lage_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getW_Gsp_Lage_TypeClass()
		 * @generated
		 */
		EClass WGSP_LAGE_TYPE_CLASS = eINSTANCE.getW_Gsp_Lage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WGSP_LAGE_TYPE_CLASS__WERT = eINSTANCE.getW_Gsp_Lage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.WHU_TypeClassImpl <em>WHU Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.WHU_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getWHU_TypeClass()
		 * @generated
		 */
		EClass WHU_TYPE_CLASS = eINSTANCE.getWHU_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHU_TYPE_CLASS__WERT = eINSTANCE.getWHU_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.impl.WUS_TypeClassImpl <em>WUS Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.WUS_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getWUS_TypeClass()
		 * @generated
		 */
		EClass WUS_TYPE_CLASS = eINSTANCE.getWUS_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WUS_TYPE_CLASS__WERT = eINSTANCE.getWUS_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBArt <em>ENUMNB Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBArt
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBArt()
		 * @generated
		 */
		EEnum ENUMNB_ART = eINSTANCE.getENUMNBArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBGrenzeArt <em>ENUMNB Grenze Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBGrenzeArt
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBGrenzeArt()
		 * @generated
		 */
		EEnum ENUMNB_GRENZE_ART = eINSTANCE.getENUMNBGrenzeArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBRueckgabevoraussetzung <em>ENUMNB Rueckgabevoraussetzung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBRueckgabevoraussetzung
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBRueckgabevoraussetzung()
		 * @generated
		 */
		EEnum ENUMNB_RUECKGABEVORAUSSETZUNG = eINSTANCE.getENUMNBRueckgabevoraussetzung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMNBVerhaeltnisBesonders <em>ENUMNB Verhaeltnis Besonders</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBVerhaeltnisBesonders
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBVerhaeltnisBesonders()
		 * @generated
		 */
		EEnum ENUMNB_VERHAELTNIS_BESONDERS = eINSTANCE.getENUMNBVerhaeltnisBesonders();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Nahbedienung.ENUMWGspLage <em>ENUMW Gsp Lage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMWGspLage
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMWGspLage()
		 * @generated
		 */
		EEnum ENUMW_GSP_LAGE = eINSTANCE.getENUMWGspLage();

		/**
		 * The meta object literal for the '<em>Bezeichnung NB Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getBezeichnung_NB_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_NB_TYPE = eINSTANCE.getBezeichnung_NB_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung NB Zone Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getBezeichnung_NB_Zone_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_NB_ZONE_TYPE = eINSTANCE.getBezeichnung_NB_Zone_Type();

		/**
		 * The meta object literal for the '<em>ENUMNB Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBArt
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBArtObject()
		 * @generated
		 */
		EDataType ENUMNB_ART_OBJECT = eINSTANCE.getENUMNBArtObject();

		/**
		 * The meta object literal for the '<em>ENUMNB Grenze Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBGrenzeArt
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBGrenzeArtObject()
		 * @generated
		 */
		EDataType ENUMNB_GRENZE_ART_OBJECT = eINSTANCE.getENUMNBGrenzeArtObject();

		/**
		 * The meta object literal for the '<em>ENUMNB Rueckgabevoraussetzung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBRueckgabevoraussetzung
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBRueckgabevoraussetzungObject()
		 * @generated
		 */
		EDataType ENUMNB_RUECKGABEVORAUSSETZUNG_OBJECT = eINSTANCE.getENUMNBRueckgabevoraussetzungObject();

		/**
		 * The meta object literal for the '<em>ENUMNB Verhaeltnis Besonders Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMNBVerhaeltnisBesonders
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMNBVerhaeltnisBesondersObject()
		 * @generated
		 */
		EDataType ENUMNB_VERHAELTNIS_BESONDERS_OBJECT = eINSTANCE.getENUMNBVerhaeltnisBesondersObject();

		/**
		 * The meta object literal for the '<em>ENUMW Gsp Lage Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Nahbedienung.ENUMWGspLage
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getENUMWGspLageObject()
		 * @generated
		 */
		EDataType ENUMW_GSP_LAGE_OBJECT = eINSTANCE.getENUMWGspLageObject();

		/**
		 * The meta object literal for the '<em>NB Zone Allg Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getNB_Zone_Allg_Type()
		 * @generated
		 */
		EDataType NB_ZONE_ALLG_TYPE = eINSTANCE.getNB_Zone_Allg_Type();

		/**
		 * The meta object literal for the '<em>Rang Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl#getRang_Type()
		 * @generated
		 */
		EDataType RANG_TYPE = eINSTANCE.getRang_Type();

	}

} //NahbedienungPackage
