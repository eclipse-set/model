/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen;

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
 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenFactory
 * @model kind="package"
 * @generated
 */
public interface LayoutinformationenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Layoutinformationen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Layoutinformationen/1.10.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsLayoutinformationen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LayoutinformationenPackage eINSTANCE = org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Bez_Lageplan_Blattschnitt_TypeClassImpl <em>Bez Lageplan Blattschnitt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Bez_Lageplan_Blattschnitt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getBez_Lageplan_Blattschnitt_TypeClass()
	 * @generated
	 */
	int BEZ_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bez Lageplan Blattschnitt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Bezeichnung_Lageplan_TypeClassImpl <em>Bezeichnung Lageplan Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Bezeichnung_Lageplan_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getBezeichnung_Lageplan_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_LAGEPLAN_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_LAGEPLAN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_LAGEPLAN_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Lageplan Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_LAGEPLAN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Darstellung_GEO_Punkt_TypeClassImpl <em>Darstellung GEO Punkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Darstellung_GEO_Punkt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDarstellung_GEO_Punkt_TypeClass()
	 * @generated
	 */
	int DARSTELLUNG_GEO_PUNKT_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARSTELLUNG_GEO_PUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARSTELLUNG_GEO_PUNKT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Darstellung GEO Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARSTELLUNG_GEO_PUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Darstellung_Polygonzug_TypeClassImpl <em>Darstellung Polygonzug Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Darstellung_Polygonzug_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDarstellung_Polygonzug_TypeClass()
	 * @generated
	 */
	int DARSTELLUNG_POLYGONZUG_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARSTELLUNG_POLYGONZUG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARSTELLUNG_POLYGONZUG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Darstellung Polygonzug Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARSTELLUNG_POLYGONZUG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Darstellung_Richtungswinkel_TypeClassImpl <em>Darstellung Richtungswinkel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Darstellung_Richtungswinkel_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDarstellung_Richtungswinkel_TypeClass()
	 * @generated
	 */
	int DARSTELLUNG_RICHTUNGSWINKEL_TYPE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARSTELLUNG_RICHTUNGSWINKEL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARSTELLUNG_RICHTUNGSWINKEL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Darstellung Richtungswinkel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARSTELLUNG_RICHTUNGSWINKEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.DocumentRootImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Plan Pro Layoutinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLAN_PRO_LAYOUTINFO = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_PositionImpl <em>Element Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_PositionImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getElement_Position()
	 * @generated
	 */
	int ELEMENT_POSITION = 6;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_POSITION__IDENTITAET = BasisobjektePackage.UR_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Element Position Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_POSITION__ELEMENT_POSITION_ALLG = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Lageplan Zustand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_POSITION__ID_LAGEPLAN_ZUSTAND = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referenz Objekt Darstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_POSITION__REFERENZ_OBJEKT_DARSTELLUNG = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_POSITION_FEATURE_COUNT = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Position_Allg_AttributeGroupImpl <em>Element Position Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Position_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getElement_Position_Allg_AttributeGroup()
	 * @generated
	 */
	int ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Darstellung Richtungswinkel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_RICHTUNGSWINKEL = 0;

	/**
	 * The feature id for the '<em><b>Darstellung GEO Punkt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_GEO_PUNKT = 1;

	/**
	 * The feature id for the '<em><b>Darstellung Polygonzug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_POLYGONZUG = 2;

	/**
	 * The number of structural features of the '<em>Element Position Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_StilImpl <em>Element Stil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_StilImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getElement_Stil()
	 * @generated
	 */
	int ELEMENT_STIL = 8;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STIL__IDENTITAET = BasisobjektePackage.UR_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Element Stil Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STIL__ELEMENT_STIL_ALLG = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Lageplan Zustand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STIL__ID_LAGEPLAN_ZUSTAND = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referenz Objekt Darstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STIL__REFERENZ_OBJEKT_DARSTELLUNG = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Stil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STIL_FEATURE_COUNT = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Stil_Allg_AttributeGroupImpl <em>Element Stil Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Stil_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getElement_Stil_Allg_AttributeGroup()
	 * @generated
	 */
	int ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Fuellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__FUELLUNG = 0;

	/**
	 * The feature id for the '<em><b>Linie Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_ART = 1;

	/**
	 * The feature id for the '<em><b>Linie Farbwert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_FARBWERT = 2;

	/**
	 * The feature id for the '<em><b>Linie Subart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_SUBART = 3;

	/**
	 * The number of structural features of the '<em>Element Stil Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Fuellung_TypeClassImpl <em>Fuellung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Fuellung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getFuellung_TypeClass()
	 * @generated
	 */
	int FUELLUNG_TYPE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELLUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELLUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuellung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELLUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.LageplanImpl <em>Lageplan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LageplanImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLageplan()
	 * @generated
	 */
	int LAGEPLAN = 11;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN__IDENTITAET = BasisobjektePackage.UR_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN__BEZEICHNUNG = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Lageplan Blattschnitt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN__ID_LAGEPLAN_BLATTSCHNITT = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lageplan Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN__LAGEPLAN_ART = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lageplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_FEATURE_COUNT = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Art_TypeClassImpl <em>Lageplan Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLageplan_Art_TypeClass()
	 * @generated
	 */
	int LAGEPLAN_ART_TYPE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lageplan Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Bezeichnung_AttributeGroupImpl <em>Lageplan Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLageplan_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP = 13;

	/**
	 * The feature id for the '<em><b>Bezeichnung Lageplan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN = 0;

	/**
	 * The number of structural features of the '<em>Lageplan Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_BlattschnittImpl <em>Lageplan Blattschnitt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_BlattschnittImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLageplan_Blattschnitt()
	 * @generated
	 */
	int LAGEPLAN_BLATTSCHNITT = 14;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_BLATTSCHNITT__IDENTITAET = BasisobjektePackage.UR_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Polygonzug Ausrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Polygonzug Blattschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lageplan Blattschnitt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_BLATTSCHNITT_FEATURE_COUNT = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Blattschnitt_Bezeichnung_AttributeGroupImpl <em>Lageplan Blattschnitt Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Blattschnitt_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLageplan_Blattschnitt_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Bez Lageplan Blattschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_LAGEPLAN_BLATTSCHNITT = 0;

	/**
	 * The number of structural features of the '<em>Lageplan Blattschnitt Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_ZustandImpl <em>Lageplan Zustand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_ZustandImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLageplan_Zustand()
	 * @generated
	 */
	int LAGEPLAN_ZUSTAND = 16;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_ZUSTAND__IDENTITAET = BasisobjektePackage.UR_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>ID Lageplan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_ZUSTAND__ID_LAGEPLAN = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenz LST Zustand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lageplan Zustand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGEPLAN_ZUSTAND_FEATURE_COUNT = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Linie_Art_TypeClassImpl <em>Linie Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Linie_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLinie_Art_TypeClass()
	 * @generated
	 */
	int LINIE_ART_TYPE_CLASS = 17;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINIE_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINIE_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linie Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINIE_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Linie_Farbwert_TypeClassImpl <em>Linie Farbwert Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Linie_Farbwert_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLinie_Farbwert_TypeClass()
	 * @generated
	 */
	int LINIE_FARBWERT_TYPE_CLASS = 18;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINIE_FARBWERT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINIE_FARBWERT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linie Farbwert Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINIE_FARBWERT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Linie_Subart_TypeClassImpl <em>Linie Subart Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Linie_Subart_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLinie_Subart_TypeClass()
	 * @generated
	 */
	int LINIE_SUBART_TYPE_CLASS = 19;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINIE_SUBART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINIE_SUBART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linie Subart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINIE_SUBART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.PlanPro_LayoutinfoImpl <em>Plan Pro Layoutinfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.PlanPro_LayoutinfoImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getPlanPro_Layoutinfo()
	 * @generated
	 */
	int PLAN_PRO_LAYOUTINFO = 20;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_PRO_LAYOUTINFO__IDENTITAET = BasisobjektePackage.UR_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Element Position</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_PRO_LAYOUTINFO__ELEMENT_POSITION = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Stil</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_PRO_LAYOUTINFO__ELEMENT_STIL = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lageplan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_PRO_LAYOUTINFO__LAGEPLAN = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lageplan Blattschnitt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_PRO_LAYOUTINFO__LAGEPLAN_BLATTSCHNITT = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lageplan Zustand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_PRO_LAYOUTINFO__LAGEPLAN_ZUSTAND = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Plan Pro Layoutinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_PRO_LAYOUTINFO_FEATURE_COUNT = BasisobjektePackage.UR_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Polygonzug_Ausrichtung_TypeClassImpl <em>Polygonzug Ausrichtung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Polygonzug_Ausrichtung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getPolygonzug_Ausrichtung_TypeClass()
	 * @generated
	 */
	int POLYGONZUG_AUSRICHTUNG_TYPE_CLASS = 21;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONZUG_AUSRICHTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONZUG_AUSRICHTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polygonzug Ausrichtung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONZUG_AUSRICHTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Polygonzug_Blattschnitt_TypeClassImpl <em>Polygonzug Blattschnitt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Polygonzug_Blattschnitt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getPolygonzug_Blattschnitt_TypeClass()
	 * @generated
	 */
	int POLYGONZUG_BLATTSCHNITT_TYPE_CLASS = 22;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONZUG_BLATTSCHNITT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONZUG_BLATTSCHNITT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polygonzug Blattschnitt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONZUG_BLATTSCHNITT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Referenz_LST_Zustand_TypeClassImpl <em>Referenz LST Zustand Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Referenz_LST_Zustand_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getReferenz_LST_Zustand_TypeClass()
	 * @generated
	 */
	int REFERENZ_LST_ZUSTAND_TYPE_CLASS = 23;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZ_LST_ZUSTAND_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZ_LST_ZUSTAND_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referenz LST Zustand Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZ_LST_ZUSTAND_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Referenz_Objekt_Darstellung_TypeClassImpl <em>Referenz Objekt Darstellung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Referenz_Objekt_Darstellung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getReferenz_Objekt_Darstellung_TypeClass()
	 * @generated
	 */
	int REFERENZ_OBJEKT_DARSTELLUNG_TYPE_CLASS = 24;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZ_OBJEKT_DARSTELLUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZ_OBJEKT_DARSTELLUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referenz Objekt Darstellung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENZ_OBJEKT_DARSTELLUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMFuellung <em>ENUM Fuellung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMFuellung
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMFuellung()
	 * @generated
	 */
	int ENUM_FUELLUNG = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMLageplanArt <em>ENUM Lageplan Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLageplanArt
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMLageplanArt()
	 * @generated
	 */
	int ENUM_LAGEPLAN_ART = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieArt <em>ENUM Linie Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieArt
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMLinieArt()
	 * @generated
	 */
	int ENUM_LINIE_ART = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieSubart <em>ENUM Linie Subart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieSubart
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMLinieSubart()
	 * @generated
	 */
	int ENUM_LINIE_SUBART = 28;

	/**
	 * The meta object id for the '<em>Bez Lageplan Blattschnitt Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getBez_Lageplan_Blattschnitt_Type()
	 * @generated
	 */
	int BEZ_LAGEPLAN_BLATTSCHNITT_TYPE = 29;

	/**
	 * The meta object id for the '<em>Bezeichnung Lageplan Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getBezeichnung_Lageplan_Type()
	 * @generated
	 */
	int BEZEICHNUNG_LAGEPLAN_TYPE = 30;

	/**
	 * The meta object id for the '<em>Darstellung GEO Punkt Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDarstellung_GEO_Punkt_Type()
	 * @generated
	 */
	int DARSTELLUNG_GEO_PUNKT_TYPE = 31;

	/**
	 * The meta object id for the '<em>Darstellung Polygonzug Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDarstellung_Polygonzug_Type()
	 * @generated
	 */
	int DARSTELLUNG_POLYGONZUG_TYPE = 32;

	/**
	 * The meta object id for the '<em>Darstellung Richtungswinkel Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDarstellung_Richtungswinkel_Type()
	 * @generated
	 */
	int DARSTELLUNG_RICHTUNGSWINKEL_TYPE = 33;

	/**
	 * The meta object id for the '<em>ENUM Fuellung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMFuellung
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMFuellungObject()
	 * @generated
	 */
	int ENUM_FUELLUNG_OBJECT = 34;

	/**
	 * The meta object id for the '<em>ENUM Lageplan Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLageplanArt
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMLageplanArtObject()
	 * @generated
	 */
	int ENUM_LAGEPLAN_ART_OBJECT = 35;

	/**
	 * The meta object id for the '<em>ENUM Linie Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieArt
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMLinieArtObject()
	 * @generated
	 */
	int ENUM_LINIE_ART_OBJECT = 36;

	/**
	 * The meta object id for the '<em>ENUM Linie Subart Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieSubart
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMLinieSubartObject()
	 * @generated
	 */
	int ENUM_LINIE_SUBART_OBJECT = 37;

	/**
	 * The meta object id for the '<em>Linie Farbwert Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLinie_Farbwert_Type()
	 * @generated
	 */
	int LINIE_FARBWERT_TYPE = 38;

	/**
	 * The meta object id for the '<em>Polygonzug Ausrichtung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getPolygonzug_Ausrichtung_Type()
	 * @generated
	 */
	int POLYGONZUG_AUSRICHTUNG_TYPE = 39;

	/**
	 * The meta object id for the '<em>Polygonzug Blattschnitt Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getPolygonzug_Blattschnitt_Type()
	 * @generated
	 */
	int POLYGONZUG_BLATTSCHNITT_TYPE = 40;

	/**
	 * The meta object id for the '<em>Referenz LST Zustand Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getReferenz_LST_Zustand_Type()
	 * @generated
	 */
	int REFERENZ_LST_ZUSTAND_TYPE = 41;

	/**
	 * The meta object id for the '<em>Referenz Objekt Darstellung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getReferenz_Objekt_Darstellung_Type()
	 * @generated
	 */
	int REFERENZ_OBJEKT_DARSTELLUNG_TYPE = 42;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Bez_Lageplan_Blattschnitt_TypeClass <em>Bez Lageplan Blattschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bez Lageplan Blattschnitt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Bez_Lageplan_Blattschnitt_TypeClass
	 * @generated
	 */
	EClass getBez_Lageplan_Blattschnitt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Bez_Lageplan_Blattschnitt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Bez_Lageplan_Blattschnitt_TypeClass#getWert()
	 * @see #getBez_Lageplan_Blattschnitt_TypeClass()
	 * @generated
	 */
	EAttribute getBez_Lageplan_Blattschnitt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Bezeichnung_Lageplan_TypeClass <em>Bezeichnung Lageplan Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Lageplan Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Bezeichnung_Lageplan_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Lageplan_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Bezeichnung_Lageplan_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Bezeichnung_Lageplan_TypeClass#getWert()
	 * @see #getBezeichnung_Lageplan_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Lageplan_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_GEO_Punkt_TypeClass <em>Darstellung GEO Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Darstellung GEO Punkt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_GEO_Punkt_TypeClass
	 * @generated
	 */
	EClass getDarstellung_GEO_Punkt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_GEO_Punkt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_GEO_Punkt_TypeClass#getWert()
	 * @see #getDarstellung_GEO_Punkt_TypeClass()
	 * @generated
	 */
	EAttribute getDarstellung_GEO_Punkt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_Polygonzug_TypeClass <em>Darstellung Polygonzug Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Darstellung Polygonzug Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_Polygonzug_TypeClass
	 * @generated
	 */
	EClass getDarstellung_Polygonzug_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_Polygonzug_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_Polygonzug_TypeClass#getWert()
	 * @see #getDarstellung_Polygonzug_TypeClass()
	 * @generated
	 */
	EAttribute getDarstellung_Polygonzug_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_Richtungswinkel_TypeClass <em>Darstellung Richtungswinkel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Darstellung Richtungswinkel Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_Richtungswinkel_TypeClass
	 * @generated
	 */
	EClass getDarstellung_Richtungswinkel_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_Richtungswinkel_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_Richtungswinkel_TypeClass#getWert()
	 * @see #getDarstellung_Richtungswinkel_TypeClass()
	 * @generated
	 */
	EAttribute getDarstellung_Richtungswinkel_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.set.model.planpro.Layoutinformationen.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.set.model.planpro.Layoutinformationen.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.set.model.planpro.Layoutinformationen.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.DocumentRoot#getPlanProLayoutinfo <em>Plan Pro Layoutinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Pro Layoutinfo</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.DocumentRoot#getPlanProLayoutinfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PlanProLayoutinfo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Position <em>Element Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Position</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Position
	 * @generated
	 */
	EClass getElement_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Position#getElementPositionAllg <em>Element Position Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Position Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Position#getElementPositionAllg()
	 * @see #getElement_Position()
	 * @generated
	 */
	EReference getElement_Position_ElementPositionAllg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Position#getIDLageplanZustand <em>ID Lageplan Zustand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Lageplan Zustand</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Position#getIDLageplanZustand()
	 * @see #getElement_Position()
	 * @generated
	 */
	EReference getElement_Position_IDLageplanZustand();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Position#getReferenzObjektDarstellung <em>Referenz Objekt Darstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenz Objekt Darstellung</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Position#getReferenzObjektDarstellung()
	 * @see #getElement_Position()
	 * @generated
	 */
	EReference getElement_Position_ReferenzObjektDarstellung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Position_Allg_AttributeGroup <em>Element Position Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Position Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Position_Allg_AttributeGroup
	 * @generated
	 */
	EClass getElement_Position_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Position_Allg_AttributeGroup#getDarstellungRichtungswinkel <em>Darstellung Richtungswinkel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Darstellung Richtungswinkel</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Position_Allg_AttributeGroup#getDarstellungRichtungswinkel()
	 * @see #getElement_Position_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getElement_Position_Allg_AttributeGroup_DarstellungRichtungswinkel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Position_Allg_AttributeGroup#getDarstellungGEOPunkt <em>Darstellung GEO Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Darstellung GEO Punkt</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Position_Allg_AttributeGroup#getDarstellungGEOPunkt()
	 * @see #getElement_Position_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getElement_Position_Allg_AttributeGroup_DarstellungGEOPunkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Position_Allg_AttributeGroup#getDarstellungPolygonzug <em>Darstellung Polygonzug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Darstellung Polygonzug</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Position_Allg_AttributeGroup#getDarstellungPolygonzug()
	 * @see #getElement_Position_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getElement_Position_Allg_AttributeGroup_DarstellungPolygonzug();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil <em>Element Stil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Stil</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil
	 * @generated
	 */
	EClass getElement_Stil();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil#getElementStilAllg <em>Element Stil Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Stil Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil#getElementStilAllg()
	 * @see #getElement_Stil()
	 * @generated
	 */
	EReference getElement_Stil_ElementStilAllg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil#getIDLageplanZustand <em>ID Lageplan Zustand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Lageplan Zustand</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil#getIDLageplanZustand()
	 * @see #getElement_Stil()
	 * @generated
	 */
	EReference getElement_Stil_IDLageplanZustand();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil#getReferenzObjektDarstellung <em>Referenz Objekt Darstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenz Objekt Darstellung</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil#getReferenzObjektDarstellung()
	 * @see #getElement_Stil()
	 * @generated
	 */
	EReference getElement_Stil_ReferenzObjektDarstellung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup <em>Element Stil Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Stil Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup
	 * @generated
	 */
	EClass getElement_Stil_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getFuellung <em>Fuellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fuellung</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getFuellung()
	 * @see #getElement_Stil_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getElement_Stil_Allg_AttributeGroup_Fuellung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getLinieArt <em>Linie Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linie Art</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getLinieArt()
	 * @see #getElement_Stil_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getElement_Stil_Allg_AttributeGroup_LinieArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getLinieFarbwert <em>Linie Farbwert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linie Farbwert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getLinieFarbwert()
	 * @see #getElement_Stil_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getElement_Stil_Allg_AttributeGroup_LinieFarbwert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getLinieSubart <em>Linie Subart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linie Subart</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getLinieSubart()
	 * @see #getElement_Stil_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getElement_Stil_Allg_AttributeGroup_LinieSubart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Fuellung_TypeClass <em>Fuellung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuellung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Fuellung_TypeClass
	 * @generated
	 */
	EClass getFuellung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Fuellung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Fuellung_TypeClass#getWert()
	 * @see #getFuellung_TypeClass()
	 * @generated
	 */
	EAttribute getFuellung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan <em>Lageplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lageplan</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan
	 * @generated
	 */
	EClass getLageplan();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan#getBezeichnung()
	 * @see #getLageplan()
	 * @generated
	 */
	EReference getLageplan_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan#getIDLageplanBlattschnitt <em>ID Lageplan Blattschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Lageplan Blattschnitt</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan#getIDLageplanBlattschnitt()
	 * @see #getLageplan()
	 * @generated
	 */
	EReference getLageplan_IDLageplanBlattschnitt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan#getLageplanArt <em>Lageplan Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lageplan Art</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan#getLageplanArt()
	 * @see #getLageplan()
	 * @generated
	 */
	EReference getLageplan_LageplanArt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Art_TypeClass <em>Lageplan Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lageplan Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Art_TypeClass
	 * @generated
	 */
	EClass getLageplan_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Art_TypeClass#getWert()
	 * @see #getLageplan_Art_TypeClass()
	 * @generated
	 */
	EAttribute getLageplan_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Bezeichnung_AttributeGroup <em>Lageplan Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lageplan Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getLageplan_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Bezeichnung_AttributeGroup#getBezeichnungLageplan <em>Bezeichnung Lageplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Lageplan</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Bezeichnung_AttributeGroup#getBezeichnungLageplan()
	 * @see #getLageplan_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getLageplan_Bezeichnung_AttributeGroup_BezeichnungLageplan();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt <em>Lageplan Blattschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lageplan Blattschnitt</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt
	 * @generated
	 */
	EClass getLageplan_Blattschnitt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt#getBezeichnung()
	 * @see #getLageplan_Blattschnitt()
	 * @generated
	 */
	EReference getLageplan_Blattschnitt_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt#getPolygonzugAusrichtung <em>Polygonzug Ausrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polygonzug Ausrichtung</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt#getPolygonzugAusrichtung()
	 * @see #getLageplan_Blattschnitt()
	 * @generated
	 */
	EReference getLageplan_Blattschnitt_PolygonzugAusrichtung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt#getPolygonzugBlattschnitt <em>Polygonzug Blattschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polygonzug Blattschnitt</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt#getPolygonzugBlattschnitt()
	 * @see #getLageplan_Blattschnitt()
	 * @generated
	 */
	EReference getLageplan_Blattschnitt_PolygonzugBlattschnitt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt_Bezeichnung_AttributeGroup <em>Lageplan Blattschnitt Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lageplan Blattschnitt Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getLageplan_Blattschnitt_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt_Bezeichnung_AttributeGroup#getBezLageplanBlattschnitt <em>Bez Lageplan Blattschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bez Lageplan Blattschnitt</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt_Bezeichnung_AttributeGroup#getBezLageplanBlattschnitt()
	 * @see #getLageplan_Blattschnitt_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getLageplan_Blattschnitt_Bezeichnung_AttributeGroup_BezLageplanBlattschnitt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Zustand <em>Lageplan Zustand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lageplan Zustand</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Zustand
	 * @generated
	 */
	EClass getLageplan_Zustand();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Zustand#getIDLageplan <em>ID Lageplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Lageplan</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Zustand#getIDLageplan()
	 * @see #getLageplan_Zustand()
	 * @generated
	 */
	EReference getLageplan_Zustand_IDLageplan();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Zustand#getReferenzLSTZustand <em>Referenz LST Zustand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referenz LST Zustand</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Zustand#getReferenzLSTZustand()
	 * @see #getLageplan_Zustand()
	 * @generated
	 */
	EReference getLageplan_Zustand_ReferenzLSTZustand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Linie_Art_TypeClass <em>Linie Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linie Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Linie_Art_TypeClass
	 * @generated
	 */
	EClass getLinie_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Linie_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Linie_Art_TypeClass#getWert()
	 * @see #getLinie_Art_TypeClass()
	 * @generated
	 */
	EAttribute getLinie_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Linie_Farbwert_TypeClass <em>Linie Farbwert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linie Farbwert Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Linie_Farbwert_TypeClass
	 * @generated
	 */
	EClass getLinie_Farbwert_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Linie_Farbwert_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Linie_Farbwert_TypeClass#getWert()
	 * @see #getLinie_Farbwert_TypeClass()
	 * @generated
	 */
	EAttribute getLinie_Farbwert_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Linie_Subart_TypeClass <em>Linie Subart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linie Subart Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Linie_Subart_TypeClass
	 * @generated
	 */
	EClass getLinie_Subart_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Linie_Subart_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Linie_Subart_TypeClass#getWert()
	 * @see #getLinie_Subart_TypeClass()
	 * @generated
	 */
	EAttribute getLinie_Subart_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo <em>Plan Pro Layoutinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Pro Layoutinfo</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo
	 * @generated
	 */
	EClass getPlanPro_Layoutinfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getElementPosition <em>Element Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Position</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getElementPosition()
	 * @see #getPlanPro_Layoutinfo()
	 * @generated
	 */
	EReference getPlanPro_Layoutinfo_ElementPosition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getElementStil <em>Element Stil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Stil</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getElementStil()
	 * @see #getPlanPro_Layoutinfo()
	 * @generated
	 */
	EReference getPlanPro_Layoutinfo_ElementStil();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getLageplan <em>Lageplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lageplan</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getLageplan()
	 * @see #getPlanPro_Layoutinfo()
	 * @generated
	 */
	EReference getPlanPro_Layoutinfo_Lageplan();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getLageplanBlattschnitt <em>Lageplan Blattschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lageplan Blattschnitt</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getLageplanBlattschnitt()
	 * @see #getPlanPro_Layoutinfo()
	 * @generated
	 */
	EReference getPlanPro_Layoutinfo_LageplanBlattschnitt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getLageplanZustand <em>Lageplan Zustand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lageplan Zustand</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getLageplanZustand()
	 * @see #getPlanPro_Layoutinfo()
	 * @generated
	 */
	EReference getPlanPro_Layoutinfo_LageplanZustand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Polygonzug_Ausrichtung_TypeClass <em>Polygonzug Ausrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygonzug Ausrichtung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Polygonzug_Ausrichtung_TypeClass
	 * @generated
	 */
	EClass getPolygonzug_Ausrichtung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Polygonzug_Ausrichtung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Polygonzug_Ausrichtung_TypeClass#getWert()
	 * @see #getPolygonzug_Ausrichtung_TypeClass()
	 * @generated
	 */
	EAttribute getPolygonzug_Ausrichtung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Polygonzug_Blattschnitt_TypeClass <em>Polygonzug Blattschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygonzug Blattschnitt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Polygonzug_Blattschnitt_TypeClass
	 * @generated
	 */
	EClass getPolygonzug_Blattschnitt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Polygonzug_Blattschnitt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Polygonzug_Blattschnitt_TypeClass#getWert()
	 * @see #getPolygonzug_Blattschnitt_TypeClass()
	 * @generated
	 */
	EAttribute getPolygonzug_Blattschnitt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Referenz_LST_Zustand_TypeClass <em>Referenz LST Zustand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenz LST Zustand Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Referenz_LST_Zustand_TypeClass
	 * @generated
	 */
	EClass getReferenz_LST_Zustand_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Referenz_LST_Zustand_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Referenz_LST_Zustand_TypeClass#getWert()
	 * @see #getReferenz_LST_Zustand_TypeClass()
	 * @generated
	 */
	EAttribute getReferenz_LST_Zustand_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Layoutinformationen.Referenz_Objekt_Darstellung_TypeClass <em>Referenz Objekt Darstellung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenz Objekt Darstellung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Referenz_Objekt_Darstellung_TypeClass
	 * @generated
	 */
	EClass getReferenz_Objekt_Darstellung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Layoutinformationen.Referenz_Objekt_Darstellung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.Referenz_Objekt_Darstellung_TypeClass#getWert()
	 * @see #getReferenz_Objekt_Darstellung_TypeClass()
	 * @generated
	 */
	EAttribute getReferenz_Objekt_Darstellung_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMFuellung <em>ENUM Fuellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Fuellung</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMFuellung
	 * @generated
	 */
	EEnum getENUMFuellung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMLageplanArt <em>ENUM Lageplan Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Lageplan Art</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLageplanArt
	 * @generated
	 */
	EEnum getENUMLageplanArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieArt <em>ENUM Linie Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Linie Art</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieArt
	 * @generated
	 */
	EEnum getENUMLinieArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieSubart <em>ENUM Linie Subart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Linie Subart</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieSubart
	 * @generated
	 */
	EEnum getENUMLinieSubart();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Bez Lageplan Blattschnitt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bez Lageplan Blattschnitt Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TBez_Lageplan_Blattschnitt' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getBez_Lageplan_Blattschnitt_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Lageplan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Lageplan Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Lageplan' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText'"
	 * @generated
	 */
	EDataType getBezeichnung_Lageplan_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Darstellung GEO Punkt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Darstellung GEO Punkt Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TDarstellung_GEO_Punkt' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDarstellung_GEO_Punkt_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Darstellung Polygonzug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Darstellung Polygonzug Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TDarstellung_Polygonzug' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TFreiText'"
	 * @generated
	 */
	EDataType getDarstellung_Polygonzug_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Darstellung Richtungswinkel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Darstellung Richtungswinkel Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TDarstellung_Richtungswinkel' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal'"
	 * @generated
	 */
	EDataType getDarstellung_Richtungswinkel_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMFuellung <em>ENUM Fuellung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Fuellung Object</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMFuellung
	 * @model instanceClass="org.eclipse.set.model.planpro.Layoutinformationen.ENUMFuellung"
	 *        extendedMetaData="name='ENUMFuellung:Object' baseType='ENUMFuellung'"
	 * @generated
	 */
	EDataType getENUMFuellungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMLageplanArt <em>ENUM Lageplan Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Lageplan Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLageplanArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Layoutinformationen.ENUMLageplanArt"
	 *        extendedMetaData="name='ENUMLageplan_Art:Object' baseType='ENUMLageplan_Art'"
	 * @generated
	 */
	EDataType getENUMLageplanArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieArt <em>ENUM Linie Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Linie Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieArt"
	 *        extendedMetaData="name='ENUMLinie_Art:Object' baseType='ENUMLinie_Art'"
	 * @generated
	 */
	EDataType getENUMLinieArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieSubart <em>ENUM Linie Subart Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Linie Subart Object</em>'.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieSubart
	 * @model instanceClass="org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieSubart"
	 *        extendedMetaData="name='ENUMLinie_Subart:Object' baseType='ENUMLinie_Subart'"
	 * @generated
	 */
	EDataType getENUMLinieSubartObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Linie Farbwert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Linie Farbwert Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TLinie_Farbwert' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='[a-fA-F0-9]{6}'"
	 * @generated
	 */
	EDataType getLinie_Farbwert_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Polygonzug Ausrichtung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Polygonzug Ausrichtung Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TPolygonzug_Ausrichtung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TFreiText'"
	 * @generated
	 */
	EDataType getPolygonzug_Ausrichtung_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Polygonzug Blattschnitt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Polygonzug Blattschnitt Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TPolygonzug_Blattschnitt' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TFreiText'"
	 * @generated
	 */
	EDataType getPolygonzug_Blattschnitt_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Referenz LST Zustand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Referenz LST Zustand Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TReferenz_LST_Zustand' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGUID'"
	 * @generated
	 */
	EDataType getReferenz_LST_Zustand_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Referenz Objekt Darstellung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Referenz Objekt Darstellung Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TReferenz_Objekt_Darstellung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGUID'"
	 * @generated
	 */
	EDataType getReferenz_Objekt_Darstellung_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LayoutinformationenFactory getLayoutinformationenFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Bez_Lageplan_Blattschnitt_TypeClassImpl <em>Bez Lageplan Blattschnitt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Bez_Lageplan_Blattschnitt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getBez_Lageplan_Blattschnitt_TypeClass()
		 * @generated
		 */
		EClass BEZ_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS = eINSTANCE.getBez_Lageplan_Blattschnitt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZ_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS__WERT = eINSTANCE.getBez_Lageplan_Blattschnitt_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Bezeichnung_Lageplan_TypeClassImpl <em>Bezeichnung Lageplan Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Bezeichnung_Lageplan_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getBezeichnung_Lageplan_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_LAGEPLAN_TYPE_CLASS = eINSTANCE.getBezeichnung_Lageplan_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_LAGEPLAN_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Lageplan_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Darstellung_GEO_Punkt_TypeClassImpl <em>Darstellung GEO Punkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Darstellung_GEO_Punkt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDarstellung_GEO_Punkt_TypeClass()
		 * @generated
		 */
		EClass DARSTELLUNG_GEO_PUNKT_TYPE_CLASS = eINSTANCE.getDarstellung_GEO_Punkt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DARSTELLUNG_GEO_PUNKT_TYPE_CLASS__WERT = eINSTANCE.getDarstellung_GEO_Punkt_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Darstellung_Polygonzug_TypeClassImpl <em>Darstellung Polygonzug Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Darstellung_Polygonzug_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDarstellung_Polygonzug_TypeClass()
		 * @generated
		 */
		EClass DARSTELLUNG_POLYGONZUG_TYPE_CLASS = eINSTANCE.getDarstellung_Polygonzug_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DARSTELLUNG_POLYGONZUG_TYPE_CLASS__WERT = eINSTANCE.getDarstellung_Polygonzug_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Darstellung_Richtungswinkel_TypeClassImpl <em>Darstellung Richtungswinkel Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Darstellung_Richtungswinkel_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDarstellung_Richtungswinkel_TypeClass()
		 * @generated
		 */
		EClass DARSTELLUNG_RICHTUNGSWINKEL_TYPE_CLASS = eINSTANCE.getDarstellung_Richtungswinkel_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DARSTELLUNG_RICHTUNGSWINKEL_TYPE_CLASS__WERT = eINSTANCE.getDarstellung_Richtungswinkel_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.DocumentRootImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Plan Pro Layoutinfo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PLAN_PRO_LAYOUTINFO = eINSTANCE.getDocumentRoot_PlanProLayoutinfo();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_PositionImpl <em>Element Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_PositionImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getElement_Position()
		 * @generated
		 */
		EClass ELEMENT_POSITION = eINSTANCE.getElement_Position();

		/**
		 * The meta object literal for the '<em><b>Element Position Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_POSITION__ELEMENT_POSITION_ALLG = eINSTANCE.getElement_Position_ElementPositionAllg();

		/**
		 * The meta object literal for the '<em><b>ID Lageplan Zustand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_POSITION__ID_LAGEPLAN_ZUSTAND = eINSTANCE.getElement_Position_IDLageplanZustand();

		/**
		 * The meta object literal for the '<em><b>Referenz Objekt Darstellung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_POSITION__REFERENZ_OBJEKT_DARSTELLUNG = eINSTANCE.getElement_Position_ReferenzObjektDarstellung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Position_Allg_AttributeGroupImpl <em>Element Position Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Position_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getElement_Position_Allg_AttributeGroup()
		 * @generated
		 */
		EClass ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getElement_Position_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Darstellung Richtungswinkel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_RICHTUNGSWINKEL = eINSTANCE.getElement_Position_Allg_AttributeGroup_DarstellungRichtungswinkel();

		/**
		 * The meta object literal for the '<em><b>Darstellung GEO Punkt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_GEO_PUNKT = eINSTANCE.getElement_Position_Allg_AttributeGroup_DarstellungGEOPunkt();

		/**
		 * The meta object literal for the '<em><b>Darstellung Polygonzug</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_POLYGONZUG = eINSTANCE.getElement_Position_Allg_AttributeGroup_DarstellungPolygonzug();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_StilImpl <em>Element Stil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_StilImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getElement_Stil()
		 * @generated
		 */
		EClass ELEMENT_STIL = eINSTANCE.getElement_Stil();

		/**
		 * The meta object literal for the '<em><b>Element Stil Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_STIL__ELEMENT_STIL_ALLG = eINSTANCE.getElement_Stil_ElementStilAllg();

		/**
		 * The meta object literal for the '<em><b>ID Lageplan Zustand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_STIL__ID_LAGEPLAN_ZUSTAND = eINSTANCE.getElement_Stil_IDLageplanZustand();

		/**
		 * The meta object literal for the '<em><b>Referenz Objekt Darstellung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_STIL__REFERENZ_OBJEKT_DARSTELLUNG = eINSTANCE.getElement_Stil_ReferenzObjektDarstellung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Stil_Allg_AttributeGroupImpl <em>Element Stil Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Stil_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getElement_Stil_Allg_AttributeGroup()
		 * @generated
		 */
		EClass ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getElement_Stil_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Fuellung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__FUELLUNG = eINSTANCE.getElement_Stil_Allg_AttributeGroup_Fuellung();

		/**
		 * The meta object literal for the '<em><b>Linie Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_ART = eINSTANCE.getElement_Stil_Allg_AttributeGroup_LinieArt();

		/**
		 * The meta object literal for the '<em><b>Linie Farbwert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_FARBWERT = eINSTANCE.getElement_Stil_Allg_AttributeGroup_LinieFarbwert();

		/**
		 * The meta object literal for the '<em><b>Linie Subart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_SUBART = eINSTANCE.getElement_Stil_Allg_AttributeGroup_LinieSubart();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Fuellung_TypeClassImpl <em>Fuellung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Fuellung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getFuellung_TypeClass()
		 * @generated
		 */
		EClass FUELLUNG_TYPE_CLASS = eINSTANCE.getFuellung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUELLUNG_TYPE_CLASS__WERT = eINSTANCE.getFuellung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.LageplanImpl <em>Lageplan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LageplanImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLageplan()
		 * @generated
		 */
		EClass LAGEPLAN = eINSTANCE.getLageplan();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAGEPLAN__BEZEICHNUNG = eINSTANCE.getLageplan_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Lageplan Blattschnitt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAGEPLAN__ID_LAGEPLAN_BLATTSCHNITT = eINSTANCE.getLageplan_IDLageplanBlattschnitt();

		/**
		 * The meta object literal for the '<em><b>Lageplan Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAGEPLAN__LAGEPLAN_ART = eINSTANCE.getLageplan_LageplanArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Art_TypeClassImpl <em>Lageplan Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLageplan_Art_TypeClass()
		 * @generated
		 */
		EClass LAGEPLAN_ART_TYPE_CLASS = eINSTANCE.getLageplan_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAGEPLAN_ART_TYPE_CLASS__WERT = eINSTANCE.getLageplan_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Bezeichnung_AttributeGroupImpl <em>Lageplan Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLageplan_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getLageplan_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Lageplan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN = eINSTANCE.getLageplan_Bezeichnung_AttributeGroup_BezeichnungLageplan();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_BlattschnittImpl <em>Lageplan Blattschnitt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_BlattschnittImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLageplan_Blattschnitt()
		 * @generated
		 */
		EClass LAGEPLAN_BLATTSCHNITT = eINSTANCE.getLageplan_Blattschnitt();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG = eINSTANCE.getLageplan_Blattschnitt_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>Polygonzug Ausrichtung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG = eINSTANCE.getLageplan_Blattschnitt_PolygonzugAusrichtung();

		/**
		 * The meta object literal for the '<em><b>Polygonzug Blattschnitt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT = eINSTANCE.getLageplan_Blattschnitt_PolygonzugBlattschnitt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Blattschnitt_Bezeichnung_AttributeGroupImpl <em>Lageplan Blattschnitt Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Blattschnitt_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLageplan_Blattschnitt_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getLageplan_Blattschnitt_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bez Lageplan Blattschnitt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_LAGEPLAN_BLATTSCHNITT = eINSTANCE.getLageplan_Blattschnitt_Bezeichnung_AttributeGroup_BezLageplanBlattschnitt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_ZustandImpl <em>Lageplan Zustand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_ZustandImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLageplan_Zustand()
		 * @generated
		 */
		EClass LAGEPLAN_ZUSTAND = eINSTANCE.getLageplan_Zustand();

		/**
		 * The meta object literal for the '<em><b>ID Lageplan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAGEPLAN_ZUSTAND__ID_LAGEPLAN = eINSTANCE.getLageplan_Zustand_IDLageplan();

		/**
		 * The meta object literal for the '<em><b>Referenz LST Zustand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND = eINSTANCE.getLageplan_Zustand_ReferenzLSTZustand();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Linie_Art_TypeClassImpl <em>Linie Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Linie_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLinie_Art_TypeClass()
		 * @generated
		 */
		EClass LINIE_ART_TYPE_CLASS = eINSTANCE.getLinie_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINIE_ART_TYPE_CLASS__WERT = eINSTANCE.getLinie_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Linie_Farbwert_TypeClassImpl <em>Linie Farbwert Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Linie_Farbwert_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLinie_Farbwert_TypeClass()
		 * @generated
		 */
		EClass LINIE_FARBWERT_TYPE_CLASS = eINSTANCE.getLinie_Farbwert_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINIE_FARBWERT_TYPE_CLASS__WERT = eINSTANCE.getLinie_Farbwert_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Linie_Subart_TypeClassImpl <em>Linie Subart Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Linie_Subart_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLinie_Subart_TypeClass()
		 * @generated
		 */
		EClass LINIE_SUBART_TYPE_CLASS = eINSTANCE.getLinie_Subart_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINIE_SUBART_TYPE_CLASS__WERT = eINSTANCE.getLinie_Subart_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.PlanPro_LayoutinfoImpl <em>Plan Pro Layoutinfo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.PlanPro_LayoutinfoImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getPlanPro_Layoutinfo()
		 * @generated
		 */
		EClass PLAN_PRO_LAYOUTINFO = eINSTANCE.getPlanPro_Layoutinfo();

		/**
		 * The meta object literal for the '<em><b>Element Position</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_PRO_LAYOUTINFO__ELEMENT_POSITION = eINSTANCE.getPlanPro_Layoutinfo_ElementPosition();

		/**
		 * The meta object literal for the '<em><b>Element Stil</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_PRO_LAYOUTINFO__ELEMENT_STIL = eINSTANCE.getPlanPro_Layoutinfo_ElementStil();

		/**
		 * The meta object literal for the '<em><b>Lageplan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_PRO_LAYOUTINFO__LAGEPLAN = eINSTANCE.getPlanPro_Layoutinfo_Lageplan();

		/**
		 * The meta object literal for the '<em><b>Lageplan Blattschnitt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_PRO_LAYOUTINFO__LAGEPLAN_BLATTSCHNITT = eINSTANCE.getPlanPro_Layoutinfo_LageplanBlattschnitt();

		/**
		 * The meta object literal for the '<em><b>Lageplan Zustand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_PRO_LAYOUTINFO__LAGEPLAN_ZUSTAND = eINSTANCE.getPlanPro_Layoutinfo_LageplanZustand();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Polygonzug_Ausrichtung_TypeClassImpl <em>Polygonzug Ausrichtung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Polygonzug_Ausrichtung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getPolygonzug_Ausrichtung_TypeClass()
		 * @generated
		 */
		EClass POLYGONZUG_AUSRICHTUNG_TYPE_CLASS = eINSTANCE.getPolygonzug_Ausrichtung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGONZUG_AUSRICHTUNG_TYPE_CLASS__WERT = eINSTANCE.getPolygonzug_Ausrichtung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Polygonzug_Blattschnitt_TypeClassImpl <em>Polygonzug Blattschnitt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Polygonzug_Blattschnitt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getPolygonzug_Blattschnitt_TypeClass()
		 * @generated
		 */
		EClass POLYGONZUG_BLATTSCHNITT_TYPE_CLASS = eINSTANCE.getPolygonzug_Blattschnitt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGONZUG_BLATTSCHNITT_TYPE_CLASS__WERT = eINSTANCE.getPolygonzug_Blattschnitt_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Referenz_LST_Zustand_TypeClassImpl <em>Referenz LST Zustand Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Referenz_LST_Zustand_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getReferenz_LST_Zustand_TypeClass()
		 * @generated
		 */
		EClass REFERENZ_LST_ZUSTAND_TYPE_CLASS = eINSTANCE.getReferenz_LST_Zustand_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENZ_LST_ZUSTAND_TYPE_CLASS__WERT = eINSTANCE.getReferenz_LST_Zustand_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Referenz_Objekt_Darstellung_TypeClassImpl <em>Referenz Objekt Darstellung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.Referenz_Objekt_Darstellung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getReferenz_Objekt_Darstellung_TypeClass()
		 * @generated
		 */
		EClass REFERENZ_OBJEKT_DARSTELLUNG_TYPE_CLASS = eINSTANCE.getReferenz_Objekt_Darstellung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENZ_OBJEKT_DARSTELLUNG_TYPE_CLASS__WERT = eINSTANCE.getReferenz_Objekt_Darstellung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMFuellung <em>ENUM Fuellung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMFuellung
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMFuellung()
		 * @generated
		 */
		EEnum ENUM_FUELLUNG = eINSTANCE.getENUMFuellung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMLageplanArt <em>ENUM Lageplan Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLageplanArt
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMLageplanArt()
		 * @generated
		 */
		EEnum ENUM_LAGEPLAN_ART = eINSTANCE.getENUMLageplanArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieArt <em>ENUM Linie Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieArt
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMLinieArt()
		 * @generated
		 */
		EEnum ENUM_LINIE_ART = eINSTANCE.getENUMLinieArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieSubart <em>ENUM Linie Subart</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieSubart
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMLinieSubart()
		 * @generated
		 */
		EEnum ENUM_LINIE_SUBART = eINSTANCE.getENUMLinieSubart();

		/**
		 * The meta object literal for the '<em>Bez Lageplan Blattschnitt Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getBez_Lageplan_Blattschnitt_Type()
		 * @generated
		 */
		EDataType BEZ_LAGEPLAN_BLATTSCHNITT_TYPE = eINSTANCE.getBez_Lageplan_Blattschnitt_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung Lageplan Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getBezeichnung_Lageplan_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_LAGEPLAN_TYPE = eINSTANCE.getBezeichnung_Lageplan_Type();

		/**
		 * The meta object literal for the '<em>Darstellung GEO Punkt Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDarstellung_GEO_Punkt_Type()
		 * @generated
		 */
		EDataType DARSTELLUNG_GEO_PUNKT_TYPE = eINSTANCE.getDarstellung_GEO_Punkt_Type();

		/**
		 * The meta object literal for the '<em>Darstellung Polygonzug Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDarstellung_Polygonzug_Type()
		 * @generated
		 */
		EDataType DARSTELLUNG_POLYGONZUG_TYPE = eINSTANCE.getDarstellung_Polygonzug_Type();

		/**
		 * The meta object literal for the '<em>Darstellung Richtungswinkel Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getDarstellung_Richtungswinkel_Type()
		 * @generated
		 */
		EDataType DARSTELLUNG_RICHTUNGSWINKEL_TYPE = eINSTANCE.getDarstellung_Richtungswinkel_Type();

		/**
		 * The meta object literal for the '<em>ENUM Fuellung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMFuellung
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMFuellungObject()
		 * @generated
		 */
		EDataType ENUM_FUELLUNG_OBJECT = eINSTANCE.getENUMFuellungObject();

		/**
		 * The meta object literal for the '<em>ENUM Lageplan Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLageplanArt
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMLageplanArtObject()
		 * @generated
		 */
		EDataType ENUM_LAGEPLAN_ART_OBJECT = eINSTANCE.getENUMLageplanArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Linie Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieArt
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMLinieArtObject()
		 * @generated
		 */
		EDataType ENUM_LINIE_ART_OBJECT = eINSTANCE.getENUMLinieArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Linie Subart Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieSubart
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getENUMLinieSubartObject()
		 * @generated
		 */
		EDataType ENUM_LINIE_SUBART_OBJECT = eINSTANCE.getENUMLinieSubartObject();

		/**
		 * The meta object literal for the '<em>Linie Farbwert Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getLinie_Farbwert_Type()
		 * @generated
		 */
		EDataType LINIE_FARBWERT_TYPE = eINSTANCE.getLinie_Farbwert_Type();

		/**
		 * The meta object literal for the '<em>Polygonzug Ausrichtung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getPolygonzug_Ausrichtung_Type()
		 * @generated
		 */
		EDataType POLYGONZUG_AUSRICHTUNG_TYPE = eINSTANCE.getPolygonzug_Ausrichtung_Type();

		/**
		 * The meta object literal for the '<em>Polygonzug Blattschnitt Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getPolygonzug_Blattschnitt_Type()
		 * @generated
		 */
		EDataType POLYGONZUG_BLATTSCHNITT_TYPE = eINSTANCE.getPolygonzug_Blattschnitt_Type();

		/**
		 * The meta object literal for the '<em>Referenz LST Zustand Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getReferenz_LST_Zustand_Type()
		 * @generated
		 */
		EDataType REFERENZ_LST_ZUSTAND_TYPE = eINSTANCE.getReferenz_LST_Zustand_Type();

		/**
		 * The meta object literal for the '<em>Referenz Objekt Darstellung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl#getReferenz_Objekt_Darstellung_Type()
		 * @generated
		 */
		EDataType REFERENZ_OBJEKT_DARSTELLUNG_TYPE = eINSTANCE.getReferenz_Objekt_Darstellung_Type();

	}

} //LayoutinformationenPackage
