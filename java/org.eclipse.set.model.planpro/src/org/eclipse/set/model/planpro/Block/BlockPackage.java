/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Block;

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
 * @see org.eclipse.set.model.planpro.Block.BlockFactory
 * @model kind="package"
 * @generated
 */
public interface BlockPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Block";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Block/1.10.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsBlock";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockPackage eINSTANCE = org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Auto_Erlaubnisholen_TypeClassImpl <em>Auto Erlaubnisholen Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Auto_Erlaubnisholen_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getAuto_Erlaubnisholen_TypeClass()
	 * @generated
	 */
	int AUTO_ERLAUBNISHOLEN_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ERLAUBNISHOLEN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ERLAUBNISHOLEN_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auto Erlaubnisholen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ERLAUBNISHOLEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Auto_Erlaubnisruecklauf_TypeClassImpl <em>Auto Erlaubnisruecklauf Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Auto_Erlaubnisruecklauf_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getAuto_Erlaubnisruecklauf_TypeClass()
	 * @generated
	 */
	int AUTO_ERLAUBNISRUECKLAUF_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ERLAUBNISRUECKLAUF_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ERLAUBNISRUECKLAUF_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auto Erlaubnisruecklauf Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ERLAUBNISRUECKLAUF_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Betriebsfuehrung_TypeClassImpl <em>Betriebsfuehrung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Betriebsfuehrung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBetriebsfuehrung_TypeClass()
	 * @generated
	 */
	int BETRIEBSFUEHRUNG_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETRIEBSFUEHRUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETRIEBSFUEHRUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Betriebsfuehrung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETRIEBSFUEHRUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_AnlageImpl <em>Block Anlage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Block_AnlageImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Anlage()
	 * @generated
	 */
	int BLOCK_ANLAGE = 3;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ANLAGE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ANLAGE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ANLAGE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ANLAGE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ANLAGE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Block Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Block Element A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Block Element B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID Gleis Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Block Anlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ANLAGE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_Anlage_Allg_AttributeGroupImpl <em>Block Anlage Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Block_Anlage_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	int BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Schaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHALTUNG = 0;

	/**
	 * The feature id for the '<em><b>Schutzuebertrager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHUTZUEBERTRAGER = 1;

	/**
	 * The number of structural features of the '<em>Block Anlage Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_Bauform_TypeClassImpl <em>Block Bauform Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Block_Bauform_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Bauform_TypeClass()
	 * @generated
	 */
	int BLOCK_BAUFORM_TYPE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_BAUFORM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_BAUFORM_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Bauform Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_BAUFORM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_ElementImpl <em>Block Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Block_ElementImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Element()
	 * @generated
	 */
	int BLOCK_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Block Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block Element Erlaubnis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Block Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT__ID_BLOCK_STRECKE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID Raeumungspruefung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT__ID_SIGNAL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ID Zugschlussmeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Block Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_Element_Allg_AttributeGroupImpl <em>Block Element Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Block_Element_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Element_Allg_AttributeGroup()
	 * @generated
	 */
	int BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Block Bauform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__BLOCK_BAUFORM = 0;

	/**
	 * The feature id for the '<em><b>Rueckblockwecker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__RUECKBLOCKWECKER = 1;

	/**
	 * The feature id for the '<em><b>Vorblockwecker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORBLOCKWECKER = 2;

	/**
	 * The number of structural features of the '<em>Block Element Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_Element_Erlaubnis_AttributeGroupImpl <em>Block Element Erlaubnis Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Block_Element_Erlaubnis_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Element_Erlaubnis_AttributeGroup()
	 * @generated
	 */
	int BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Auto Erlaubnisholen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISHOLEN = 0;

	/**
	 * The feature id for the '<em><b>Auto Erlaubnisruecklauf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISRUECKLAUF = 1;

	/**
	 * The feature id for the '<em><b>Erlaubnis Staendig Vorhanden</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNIS_STAENDIG_VORHANDEN = 2;

	/**
	 * The feature id for the '<em><b>Erlaubnisabgabespeicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISABGABESPEICHERUNG = 3;

	/**
	 * The feature id for the '<em><b>Erlaubnisholen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISHOLEN = 4;

	/**
	 * The number of structural features of the '<em>Block Element Erlaubnis Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_StreckeImpl <em>Block Strecke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Block_StreckeImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Strecke()
	 * @generated
	 */
	int BLOCK_STRECKE = 9;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Block Strecke Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE__BLOCK_STRECKE_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Betriebsstelle Nachbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Knotenbahnhof</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE__ID_KNOTENBAHNHOF = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE__ID_STRECKE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ID Strecke Bremsweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE__ID_STRECKE_BREMSWEG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Block Strecke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_Strecke_Allg_AttributeGroupImpl <em>Block Strecke Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Block_Strecke_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Strecke_Allg_AttributeGroup()
	 * @generated
	 */
	int BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Betriebsfuehrung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG = 0;

	/**
	 * The feature id for the '<em><b>Bremsweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG = 1;

	/**
	 * The feature id for the '<em><b>Strecke Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART = 2;

	/**
	 * The feature id for the '<em><b>Streckengeschwindigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKENGESCHWINDIGKEIT = 3;

	/**
	 * The feature id for the '<em><b>Traktion Art Elektrisch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART_ELEKTRISCH = 4;

	/**
	 * The feature id for the '<em><b>Zugbeeinflussung Art</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART = 5;

	/**
	 * The feature id for the '<em><b>Zusatzinformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION = 6;

	/**
	 * The number of structural features of the '<em>Block Strecke Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Bremsweg_TypeClassImpl <em>Bremsweg Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Bremsweg_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBremsweg_TypeClass()
	 * @generated
	 */
	int BREMSWEG_TYPE_CLASS = 11;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREMSWEG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREMSWEG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bremsweg Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREMSWEG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Erlaubnis_Staendig_Vorhanden_TypeClassImpl <em>Erlaubnis Staendig Vorhanden Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Erlaubnis_Staendig_Vorhanden_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getErlaubnis_Staendig_Vorhanden_TypeClass()
	 * @generated
	 */
	int ERLAUBNIS_STAENDIG_VORHANDEN_TYPE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLAUBNIS_STAENDIG_VORHANDEN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLAUBNIS_STAENDIG_VORHANDEN_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erlaubnis Staendig Vorhanden Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLAUBNIS_STAENDIG_VORHANDEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Erlaubnisabgabespeicherung_TypeClassImpl <em>Erlaubnisabgabespeicherung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Erlaubnisabgabespeicherung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getErlaubnisabgabespeicherung_TypeClass()
	 * @generated
	 */
	int ERLAUBNISABGABESPEICHERUNG_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLAUBNISABGABESPEICHERUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLAUBNISABGABESPEICHERUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erlaubnisabgabespeicherung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLAUBNISABGABESPEICHERUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Erlaubnisholen_TypeClassImpl <em>Erlaubnisholen Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Erlaubnisholen_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getErlaubnisholen_TypeClass()
	 * @generated
	 */
	int ERLAUBNISHOLEN_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLAUBNISHOLEN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLAUBNISHOLEN_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erlaubnisholen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLAUBNISHOLEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Rueckblockwecker_TypeClassImpl <em>Rueckblockwecker Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Rueckblockwecker_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getRueckblockwecker_TypeClass()
	 * @generated
	 */
	int RUECKBLOCKWECKER_TYPE_CLASS = 15;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKBLOCKWECKER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKBLOCKWECKER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rueckblockwecker Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKBLOCKWECKER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Schaltung_TypeClassImpl <em>Schaltung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Schaltung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getSchaltung_TypeClass()
	 * @generated
	 */
	int SCHALTUNG_TYPE_CLASS = 16;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schaltung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Schutzuebertrager_TypeClassImpl <em>Schutzuebertrager Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Schutzuebertrager_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getSchutzuebertrager_TypeClass()
	 * @generated
	 */
	int SCHUTZUEBERTRAGER_TYPE_CLASS = 17;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUTZUEBERTRAGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUTZUEBERTRAGER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schutzuebertrager Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUTZUEBERTRAGER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Strecke_Art_TypeClassImpl <em>Strecke Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Strecke_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getStrecke_Art_TypeClass()
	 * @generated
	 */
	int STRECKE_ART_TYPE_CLASS = 18;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strecke Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Streckengeschwindigkeit_TypeClassImpl <em>Streckengeschwindigkeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Streckengeschwindigkeit_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getStreckengeschwindigkeit_TypeClass()
	 * @generated
	 */
	int STRECKENGESCHWINDIGKEIT_TYPE_CLASS = 19;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKENGESCHWINDIGKEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKENGESCHWINDIGKEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Streckengeschwindigkeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKENGESCHWINDIGKEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Traktion_Art_Elektrisch_TypeClassImpl <em>Traktion Art Elektrisch Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Traktion_Art_Elektrisch_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getTraktion_Art_Elektrisch_TypeClass()
	 * @generated
	 */
	int TRAKTION_ART_ELEKTRISCH_TYPE_CLASS = 20;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAKTION_ART_ELEKTRISCH_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAKTION_ART_ELEKTRISCH_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traktion Art Elektrisch Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAKTION_ART_ELEKTRISCH_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Vorblockwecker_TypeClassImpl <em>Vorblockwecker Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Vorblockwecker_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getVorblockwecker_TypeClass()
	 * @generated
	 */
	int VORBLOCKWECKER_TYPE_CLASS = 21;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORBLOCKWECKER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORBLOCKWECKER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vorblockwecker Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORBLOCKWECKER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Zugbeeinflussung_Art_TypeClassImpl <em>Zugbeeinflussung Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Zugbeeinflussung_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getZugbeeinflussung_Art_TypeClass()
	 * @generated
	 */
	int ZUGBEEINFLUSSUNG_ART_TYPE_CLASS = 22;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGBEEINFLUSSUNG_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGBEEINFLUSSUNG_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zugbeeinflussung Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGBEEINFLUSSUNG_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.impl.Zusatzinformation_TypeClassImpl <em>Zusatzinformation Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.impl.Zusatzinformation_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getZusatzinformation_TypeClass()
	 * @generated
	 */
	int ZUSATZINFORMATION_TYPE_CLASS = 23;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZINFORMATION_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZINFORMATION_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zusatzinformation Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZINFORMATION_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.ENUMBetriebsfuehrung <em>ENUM Betriebsfuehrung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.ENUMBetriebsfuehrung
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMBetriebsfuehrung()
	 * @generated
	 */
	int ENUM_BETRIEBSFUEHRUNG = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.ENUMBlockBauform <em>ENUM Block Bauform</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.ENUMBlockBauform
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMBlockBauform()
	 * @generated
	 */
	int ENUM_BLOCK_BAUFORM = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.ENUMSchaltung <em>ENUM Schaltung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.ENUMSchaltung
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMSchaltung()
	 * @generated
	 */
	int ENUM_SCHALTUNG = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Block.ENUMStreckeArt <em>ENUM Strecke Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.ENUMStreckeArt
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMStreckeArt()
	 * @generated
	 */
	int ENUM_STRECKE_ART = 27;

	/**
	 * The meta object id for the '<em>ENUM Betriebsfuehrung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.ENUMBetriebsfuehrung
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMBetriebsfuehrungObject()
	 * @generated
	 */
	int ENUM_BETRIEBSFUEHRUNG_OBJECT = 28;

	/**
	 * The meta object id for the '<em>ENUM Block Bauform Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.ENUMBlockBauform
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMBlockBauformObject()
	 * @generated
	 */
	int ENUM_BLOCK_BAUFORM_OBJECT = 29;

	/**
	 * The meta object id for the '<em>ENUM Schaltung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.ENUMSchaltung
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMSchaltungObject()
	 * @generated
	 */
	int ENUM_SCHALTUNG_OBJECT = 30;

	/**
	 * The meta object id for the '<em>ENUM Strecke Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Block.ENUMStreckeArt
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMStreckeArtObject()
	 * @generated
	 */
	int ENUM_STRECKE_ART_OBJECT = 31;

	/**
	 * The meta object id for the '<em>Streckengeschwindigkeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getStreckengeschwindigkeit_Type()
	 * @generated
	 */
	int STRECKENGESCHWINDIGKEIT_TYPE = 32;

	/**
	 * The meta object id for the '<em>Zusatzinformation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getZusatzinformation_Type()
	 * @generated
	 */
	int ZUSATZINFORMATION_TYPE = 33;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Auto_Erlaubnisholen_TypeClass <em>Auto Erlaubnisholen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Erlaubnisholen Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Auto_Erlaubnisholen_TypeClass
	 * @generated
	 */
	EClass getAuto_Erlaubnisholen_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Auto_Erlaubnisholen_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Auto_Erlaubnisholen_TypeClass#getWert()
	 * @see #getAuto_Erlaubnisholen_TypeClass()
	 * @generated
	 */
	EAttribute getAuto_Erlaubnisholen_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Auto_Erlaubnisruecklauf_TypeClass <em>Auto Erlaubnisruecklauf Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Erlaubnisruecklauf Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Auto_Erlaubnisruecklauf_TypeClass
	 * @generated
	 */
	EClass getAuto_Erlaubnisruecklauf_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Auto_Erlaubnisruecklauf_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Auto_Erlaubnisruecklauf_TypeClass#getWert()
	 * @see #getAuto_Erlaubnisruecklauf_TypeClass()
	 * @generated
	 */
	EAttribute getAuto_Erlaubnisruecklauf_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Betriebsfuehrung_TypeClass <em>Betriebsfuehrung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Betriebsfuehrung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Betriebsfuehrung_TypeClass
	 * @generated
	 */
	EClass getBetriebsfuehrung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Betriebsfuehrung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Betriebsfuehrung_TypeClass#getWert()
	 * @see #getBetriebsfuehrung_TypeClass()
	 * @generated
	 */
	EAttribute getBetriebsfuehrung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Block_Anlage <em>Block Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Anlage</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Anlage
	 * @generated
	 */
	EClass getBlock_Anlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Anlage#getBlockAnlageAllg <em>Block Anlage Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block Anlage Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Anlage#getBlockAnlageAllg()
	 * @see #getBlock_Anlage()
	 * @generated
	 */
	EReference getBlock_Anlage_BlockAnlageAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Anlage#getIDBlockElementA <em>ID Block Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Block Element A</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Anlage#getIDBlockElementA()
	 * @see #getBlock_Anlage()
	 * @generated
	 */
	EReference getBlock_Anlage_IDBlockElementA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Anlage#getIDBlockElementB <em>ID Block Element B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Block Element B</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Anlage#getIDBlockElementB()
	 * @see #getBlock_Anlage()
	 * @generated
	 */
	EReference getBlock_Anlage_IDBlockElementB();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Anlage#getIDGleisBezeichnung <em>ID Gleis Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Gleis Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Anlage#getIDGleisBezeichnung()
	 * @see #getBlock_Anlage()
	 * @generated
	 */
	EReference getBlock_Anlage_IDGleisBezeichnung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Block_Anlage_Allg_AttributeGroup <em>Block Anlage Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Anlage Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Anlage_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBlock_Anlage_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Anlage_Allg_AttributeGroup#getSchaltung <em>Schaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schaltung</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Anlage_Allg_AttributeGroup#getSchaltung()
	 * @see #getBlock_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Anlage_Allg_AttributeGroup_Schaltung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Anlage_Allg_AttributeGroup#getSchutzuebertrager <em>Schutzuebertrager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schutzuebertrager</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Anlage_Allg_AttributeGroup#getSchutzuebertrager()
	 * @see #getBlock_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Anlage_Allg_AttributeGroup_Schutzuebertrager();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Block_Bauform_TypeClass <em>Block Bauform Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Bauform Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Bauform_TypeClass
	 * @generated
	 */
	EClass getBlock_Bauform_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Block_Bauform_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Bauform_TypeClass#getWert()
	 * @see #getBlock_Bauform_TypeClass()
	 * @generated
	 */
	EAttribute getBlock_Bauform_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Block_Element <em>Block Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Element</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element
	 * @generated
	 */
	EClass getBlock_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element#getBlockElementAllg <em>Block Element Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block Element Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element#getBlockElementAllg()
	 * @see #getBlock_Element()
	 * @generated
	 */
	EReference getBlock_Element_BlockElementAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element#getBlockElementErlaubnis <em>Block Element Erlaubnis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block Element Erlaubnis</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element#getBlockElementErlaubnis()
	 * @see #getBlock_Element()
	 * @generated
	 */
	EReference getBlock_Element_BlockElementErlaubnis();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element#getIDBlockStrecke <em>ID Block Strecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Block Strecke</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element#getIDBlockStrecke()
	 * @see #getBlock_Element()
	 * @generated
	 */
	EReference getBlock_Element_IDBlockStrecke();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element#getIDRaeumungspruefung <em>ID Raeumungspruefung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Raeumungspruefung</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element#getIDRaeumungspruefung()
	 * @see #getBlock_Element()
	 * @generated
	 */
	EReference getBlock_Element_IDRaeumungspruefung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element#getIDSignal <em>ID Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element#getIDSignal()
	 * @see #getBlock_Element()
	 * @generated
	 */
	EReference getBlock_Element_IDSignal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element#getIDZugschlussmeldung <em>ID Zugschlussmeldung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Zugschlussmeldung</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element#getIDZugschlussmeldung()
	 * @see #getBlock_Element()
	 * @generated
	 */
	EReference getBlock_Element_IDZugschlussmeldung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Block_Element_Allg_AttributeGroup <em>Block Element Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Element Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBlock_Element_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element_Allg_AttributeGroup#getBlockBauform <em>Block Bauform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block Bauform</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element_Allg_AttributeGroup#getBlockBauform()
	 * @see #getBlock_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Element_Allg_AttributeGroup_BlockBauform();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element_Allg_AttributeGroup#getRueckblockwecker <em>Rueckblockwecker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rueckblockwecker</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element_Allg_AttributeGroup#getRueckblockwecker()
	 * @see #getBlock_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Element_Allg_AttributeGroup_Rueckblockwecker();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element_Allg_AttributeGroup#getVorblockwecker <em>Vorblockwecker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vorblockwecker</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element_Allg_AttributeGroup#getVorblockwecker()
	 * @see #getBlock_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Element_Allg_AttributeGroup_Vorblockwecker();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup <em>Block Element Erlaubnis Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Element Erlaubnis Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup
	 * @generated
	 */
	EClass getBlock_Element_Erlaubnis_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup#getAutoErlaubnisholen <em>Auto Erlaubnisholen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Erlaubnisholen</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup#getAutoErlaubnisholen()
	 * @see #getBlock_Element_Erlaubnis_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisholen();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup#getAutoErlaubnisruecklauf <em>Auto Erlaubnisruecklauf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Erlaubnisruecklauf</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup#getAutoErlaubnisruecklauf()
	 * @see #getBlock_Element_Erlaubnis_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisruecklauf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup#getErlaubnisStaendigVorhanden <em>Erlaubnis Staendig Vorhanden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Erlaubnis Staendig Vorhanden</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup#getErlaubnisStaendigVorhanden()
	 * @see #getBlock_Element_Erlaubnis_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Element_Erlaubnis_AttributeGroup_ErlaubnisStaendigVorhanden();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup#getErlaubnisabgabespeicherung <em>Erlaubnisabgabespeicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Erlaubnisabgabespeicherung</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup#getErlaubnisabgabespeicherung()
	 * @see #getBlock_Element_Erlaubnis_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisabgabespeicherung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup#getErlaubnisholen <em>Erlaubnisholen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Erlaubnisholen</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup#getErlaubnisholen()
	 * @see #getBlock_Element_Erlaubnis_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisholen();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Block_Strecke <em>Block Strecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Strecke</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke
	 * @generated
	 */
	EClass getBlock_Strecke();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getBlockStreckeAllg <em>Block Strecke Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block Strecke Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke#getBlockStreckeAllg()
	 * @see #getBlock_Strecke()
	 * @generated
	 */
	EReference getBlock_Strecke_BlockStreckeAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getIDBetriebsstelleNachbar <em>ID Betriebsstelle Nachbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Betriebsstelle Nachbar</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke#getIDBetriebsstelleNachbar()
	 * @see #getBlock_Strecke()
	 * @generated
	 */
	EReference getBlock_Strecke_IDBetriebsstelleNachbar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getIDKnotenbahnhof <em>ID Knotenbahnhof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Knotenbahnhof</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke#getIDKnotenbahnhof()
	 * @see #getBlock_Strecke()
	 * @generated
	 */
	EReference getBlock_Strecke_IDKnotenbahnhof();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getIDStrecke <em>ID Strecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Strecke</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke#getIDStrecke()
	 * @see #getBlock_Strecke()
	 * @generated
	 */
	EReference getBlock_Strecke_IDStrecke();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getIDStreckeBremsweg <em>ID Strecke Bremsweg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Strecke Bremsweg</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke#getIDStreckeBremsweg()
	 * @see #getBlock_Strecke()
	 * @generated
	 */
	EReference getBlock_Strecke_IDStreckeBremsweg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup <em>Block Strecke Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Strecke Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBlock_Strecke_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getBetriebsfuehrung <em>Betriebsfuehrung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Betriebsfuehrung</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getBetriebsfuehrung()
	 * @see #getBlock_Strecke_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Strecke_Allg_AttributeGroup_Betriebsfuehrung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getBremsweg <em>Bremsweg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bremsweg</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getBremsweg()
	 * @see #getBlock_Strecke_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Strecke_Allg_AttributeGroup_Bremsweg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getStreckeArt <em>Strecke Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strecke Art</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getStreckeArt()
	 * @see #getBlock_Strecke_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Strecke_Allg_AttributeGroup_StreckeArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getStreckengeschwindigkeit <em>Streckengeschwindigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Streckengeschwindigkeit</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getStreckengeschwindigkeit()
	 * @see #getBlock_Strecke_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Strecke_Allg_AttributeGroup_Streckengeschwindigkeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getTraktionArtElektrisch <em>Traktion Art Elektrisch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Traktion Art Elektrisch</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getTraktionArtElektrisch()
	 * @see #getBlock_Strecke_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Strecke_Allg_AttributeGroup_TraktionArtElektrisch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getZugbeeinflussungArt <em>Zugbeeinflussung Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zugbeeinflussung Art</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getZugbeeinflussungArt()
	 * @see #getBlock_Strecke_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Strecke_Allg_AttributeGroup_ZugbeeinflussungArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getZusatzinformation <em>Zusatzinformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zusatzinformation</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getZusatzinformation()
	 * @see #getBlock_Strecke_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBlock_Strecke_Allg_AttributeGroup_Zusatzinformation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Bremsweg_TypeClass <em>Bremsweg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bremsweg Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Bremsweg_TypeClass
	 * @generated
	 */
	EClass getBremsweg_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Bremsweg_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Bremsweg_TypeClass#getWert()
	 * @see #getBremsweg_TypeClass()
	 * @generated
	 */
	EAttribute getBremsweg_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Erlaubnis_Staendig_Vorhanden_TypeClass <em>Erlaubnis Staendig Vorhanden Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erlaubnis Staendig Vorhanden Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Erlaubnis_Staendig_Vorhanden_TypeClass
	 * @generated
	 */
	EClass getErlaubnis_Staendig_Vorhanden_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Erlaubnis_Staendig_Vorhanden_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Erlaubnis_Staendig_Vorhanden_TypeClass#getWert()
	 * @see #getErlaubnis_Staendig_Vorhanden_TypeClass()
	 * @generated
	 */
	EAttribute getErlaubnis_Staendig_Vorhanden_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Erlaubnisabgabespeicherung_TypeClass <em>Erlaubnisabgabespeicherung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erlaubnisabgabespeicherung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Erlaubnisabgabespeicherung_TypeClass
	 * @generated
	 */
	EClass getErlaubnisabgabespeicherung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Erlaubnisabgabespeicherung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Erlaubnisabgabespeicherung_TypeClass#getWert()
	 * @see #getErlaubnisabgabespeicherung_TypeClass()
	 * @generated
	 */
	EAttribute getErlaubnisabgabespeicherung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Erlaubnisholen_TypeClass <em>Erlaubnisholen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erlaubnisholen Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Erlaubnisholen_TypeClass
	 * @generated
	 */
	EClass getErlaubnisholen_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Erlaubnisholen_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Erlaubnisholen_TypeClass#getWert()
	 * @see #getErlaubnisholen_TypeClass()
	 * @generated
	 */
	EAttribute getErlaubnisholen_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Rueckblockwecker_TypeClass <em>Rueckblockwecker Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rueckblockwecker Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Rueckblockwecker_TypeClass
	 * @generated
	 */
	EClass getRueckblockwecker_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Rueckblockwecker_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Rueckblockwecker_TypeClass#getWert()
	 * @see #getRueckblockwecker_TypeClass()
	 * @generated
	 */
	EAttribute getRueckblockwecker_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Schaltung_TypeClass <em>Schaltung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schaltung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Schaltung_TypeClass
	 * @generated
	 */
	EClass getSchaltung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Schaltung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Schaltung_TypeClass#getWert()
	 * @see #getSchaltung_TypeClass()
	 * @generated
	 */
	EAttribute getSchaltung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Schutzuebertrager_TypeClass <em>Schutzuebertrager Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schutzuebertrager Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Schutzuebertrager_TypeClass
	 * @generated
	 */
	EClass getSchutzuebertrager_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Schutzuebertrager_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Schutzuebertrager_TypeClass#getWert()
	 * @see #getSchutzuebertrager_TypeClass()
	 * @generated
	 */
	EAttribute getSchutzuebertrager_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Strecke_Art_TypeClass <em>Strecke Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strecke Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Strecke_Art_TypeClass
	 * @generated
	 */
	EClass getStrecke_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Strecke_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Strecke_Art_TypeClass#getWert()
	 * @see #getStrecke_Art_TypeClass()
	 * @generated
	 */
	EAttribute getStrecke_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Streckengeschwindigkeit_TypeClass <em>Streckengeschwindigkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streckengeschwindigkeit Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Streckengeschwindigkeit_TypeClass
	 * @generated
	 */
	EClass getStreckengeschwindigkeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Streckengeschwindigkeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Streckengeschwindigkeit_TypeClass#getWert()
	 * @see #getStreckengeschwindigkeit_TypeClass()
	 * @generated
	 */
	EAttribute getStreckengeschwindigkeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Traktion_Art_Elektrisch_TypeClass <em>Traktion Art Elektrisch Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traktion Art Elektrisch Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Traktion_Art_Elektrisch_TypeClass
	 * @generated
	 */
	EClass getTraktion_Art_Elektrisch_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Traktion_Art_Elektrisch_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Traktion_Art_Elektrisch_TypeClass#getWert()
	 * @see #getTraktion_Art_Elektrisch_TypeClass()
	 * @generated
	 */
	EAttribute getTraktion_Art_Elektrisch_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Vorblockwecker_TypeClass <em>Vorblockwecker Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vorblockwecker Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Vorblockwecker_TypeClass
	 * @generated
	 */
	EClass getVorblockwecker_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Vorblockwecker_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Vorblockwecker_TypeClass#getWert()
	 * @see #getVorblockwecker_TypeClass()
	 * @generated
	 */
	EAttribute getVorblockwecker_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Zugbeeinflussung_Art_TypeClass <em>Zugbeeinflussung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zugbeeinflussung Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Zugbeeinflussung_Art_TypeClass
	 * @generated
	 */
	EClass getZugbeeinflussung_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Zugbeeinflussung_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Zugbeeinflussung_Art_TypeClass#getWert()
	 * @see #getZugbeeinflussung_Art_TypeClass()
	 * @generated
	 */
	EAttribute getZugbeeinflussung_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Block.Zusatzinformation_TypeClass <em>Zusatzinformation Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zusatzinformation Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Zusatzinformation_TypeClass
	 * @generated
	 */
	EClass getZusatzinformation_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Block.Zusatzinformation_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Block.Zusatzinformation_TypeClass#getWert()
	 * @see #getZusatzinformation_TypeClass()
	 * @generated
	 */
	EAttribute getZusatzinformation_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Block.ENUMBetriebsfuehrung <em>ENUM Betriebsfuehrung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Betriebsfuehrung</em>'.
	 * @see org.eclipse.set.model.planpro.Block.ENUMBetriebsfuehrung
	 * @generated
	 */
	EEnum getENUMBetriebsfuehrung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Block.ENUMBlockBauform <em>ENUM Block Bauform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Block Bauform</em>'.
	 * @see org.eclipse.set.model.planpro.Block.ENUMBlockBauform
	 * @generated
	 */
	EEnum getENUMBlockBauform();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Block.ENUMSchaltung <em>ENUM Schaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Schaltung</em>'.
	 * @see org.eclipse.set.model.planpro.Block.ENUMSchaltung
	 * @generated
	 */
	EEnum getENUMSchaltung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Block.ENUMStreckeArt <em>ENUM Strecke Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Strecke Art</em>'.
	 * @see org.eclipse.set.model.planpro.Block.ENUMStreckeArt
	 * @generated
	 */
	EEnum getENUMStreckeArt();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Block.ENUMBetriebsfuehrung <em>ENUM Betriebsfuehrung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Betriebsfuehrung Object</em>'.
	 * @see org.eclipse.set.model.planpro.Block.ENUMBetriebsfuehrung
	 * @model instanceClass="org.eclipse.set.model.planpro.Block.ENUMBetriebsfuehrung"
	 *        extendedMetaData="name='ENUMBetriebsfuehrung:Object' baseType='ENUMBetriebsfuehrung'"
	 * @generated
	 */
	EDataType getENUMBetriebsfuehrungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Block.ENUMBlockBauform <em>ENUM Block Bauform Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Block Bauform Object</em>'.
	 * @see org.eclipse.set.model.planpro.Block.ENUMBlockBauform
	 * @model instanceClass="org.eclipse.set.model.planpro.Block.ENUMBlockBauform"
	 *        extendedMetaData="name='ENUMBlock_Bauform:Object' baseType='ENUMBlock_Bauform'"
	 * @generated
	 */
	EDataType getENUMBlockBauformObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Block.ENUMSchaltung <em>ENUM Schaltung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Schaltung Object</em>'.
	 * @see org.eclipse.set.model.planpro.Block.ENUMSchaltung
	 * @model instanceClass="org.eclipse.set.model.planpro.Block.ENUMSchaltung"
	 *        extendedMetaData="name='ENUMSchaltung:Object' baseType='ENUMSchaltung'"
	 * @generated
	 */
	EDataType getENUMSchaltungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Block.ENUMStreckeArt <em>ENUM Strecke Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Strecke Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Block.ENUMStreckeArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Block.ENUMStreckeArt"
	 *        extendedMetaData="name='ENUMStrecke_Art:Object' baseType='ENUMStrecke_Art'"
	 * @generated
	 */
	EDataType getENUMStreckeArtObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Streckengeschwindigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Streckengeschwindigkeit Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TStreckengeschwindigkeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit'"
	 * @generated
	 */
	EDataType getStreckengeschwindigkeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Zusatzinformation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Zusatzinformation Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TZusatzinformation' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{1,50}'"
	 * @generated
	 */
	EDataType getZusatzinformation_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BlockFactory getBlockFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Auto_Erlaubnisholen_TypeClassImpl <em>Auto Erlaubnisholen Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Auto_Erlaubnisholen_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getAuto_Erlaubnisholen_TypeClass()
		 * @generated
		 */
		EClass AUTO_ERLAUBNISHOLEN_TYPE_CLASS = eINSTANCE.getAuto_Erlaubnisholen_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_ERLAUBNISHOLEN_TYPE_CLASS__WERT = eINSTANCE.getAuto_Erlaubnisholen_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Auto_Erlaubnisruecklauf_TypeClassImpl <em>Auto Erlaubnisruecklauf Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Auto_Erlaubnisruecklauf_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getAuto_Erlaubnisruecklauf_TypeClass()
		 * @generated
		 */
		EClass AUTO_ERLAUBNISRUECKLAUF_TYPE_CLASS = eINSTANCE.getAuto_Erlaubnisruecklauf_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_ERLAUBNISRUECKLAUF_TYPE_CLASS__WERT = eINSTANCE.getAuto_Erlaubnisruecklauf_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Betriebsfuehrung_TypeClassImpl <em>Betriebsfuehrung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Betriebsfuehrung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBetriebsfuehrung_TypeClass()
		 * @generated
		 */
		EClass BETRIEBSFUEHRUNG_TYPE_CLASS = eINSTANCE.getBetriebsfuehrung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BETRIEBSFUEHRUNG_TYPE_CLASS__WERT = eINSTANCE.getBetriebsfuehrung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_AnlageImpl <em>Block Anlage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Block_AnlageImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Anlage()
		 * @generated
		 */
		EClass BLOCK_ANLAGE = eINSTANCE.getBlock_Anlage();

		/**
		 * The meta object literal for the '<em><b>Block Anlage Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG = eINSTANCE.getBlock_Anlage_BlockAnlageAllg();

		/**
		 * The meta object literal for the '<em><b>ID Block Element A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A = eINSTANCE.getBlock_Anlage_IDBlockElementA();

		/**
		 * The meta object literal for the '<em><b>ID Block Element B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B = eINSTANCE.getBlock_Anlage_IDBlockElementB();

		/**
		 * The meta object literal for the '<em><b>ID Gleis Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG = eINSTANCE.getBlock_Anlage_IDGleisBezeichnung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_Anlage_Allg_AttributeGroupImpl <em>Block Anlage Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Block_Anlage_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Anlage_Allg_AttributeGroup()
		 * @generated
		 */
		EClass BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getBlock_Anlage_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Schaltung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHALTUNG = eINSTANCE.getBlock_Anlage_Allg_AttributeGroup_Schaltung();

		/**
		 * The meta object literal for the '<em><b>Schutzuebertrager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHUTZUEBERTRAGER = eINSTANCE.getBlock_Anlage_Allg_AttributeGroup_Schutzuebertrager();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_Bauform_TypeClassImpl <em>Block Bauform Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Block_Bauform_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Bauform_TypeClass()
		 * @generated
		 */
		EClass BLOCK_BAUFORM_TYPE_CLASS = eINSTANCE.getBlock_Bauform_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_BAUFORM_TYPE_CLASS__WERT = eINSTANCE.getBlock_Bauform_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_ElementImpl <em>Block Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Block_ElementImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Element()
		 * @generated
		 */
		EClass BLOCK_ELEMENT = eINSTANCE.getBlock_Element();

		/**
		 * The meta object literal for the '<em><b>Block Element Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG = eINSTANCE.getBlock_Element_BlockElementAllg();

		/**
		 * The meta object literal for the '<em><b>Block Element Erlaubnis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS = eINSTANCE.getBlock_Element_BlockElementErlaubnis();

		/**
		 * The meta object literal for the '<em><b>ID Block Strecke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT__ID_BLOCK_STRECKE = eINSTANCE.getBlock_Element_IDBlockStrecke();

		/**
		 * The meta object literal for the '<em><b>ID Raeumungspruefung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG = eINSTANCE.getBlock_Element_IDRaeumungspruefung();

		/**
		 * The meta object literal for the '<em><b>ID Signal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT__ID_SIGNAL = eINSTANCE.getBlock_Element_IDSignal();

		/**
		 * The meta object literal for the '<em><b>ID Zugschlussmeldung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG = eINSTANCE.getBlock_Element_IDZugschlussmeldung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_Element_Allg_AttributeGroupImpl <em>Block Element Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Block_Element_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Element_Allg_AttributeGroup()
		 * @generated
		 */
		EClass BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getBlock_Element_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Block Bauform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__BLOCK_BAUFORM = eINSTANCE.getBlock_Element_Allg_AttributeGroup_BlockBauform();

		/**
		 * The meta object literal for the '<em><b>Rueckblockwecker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__RUECKBLOCKWECKER = eINSTANCE.getBlock_Element_Allg_AttributeGroup_Rueckblockwecker();

		/**
		 * The meta object literal for the '<em><b>Vorblockwecker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORBLOCKWECKER = eINSTANCE.getBlock_Element_Allg_AttributeGroup_Vorblockwecker();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_Element_Erlaubnis_AttributeGroupImpl <em>Block Element Erlaubnis Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Block_Element_Erlaubnis_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Element_Erlaubnis_AttributeGroup()
		 * @generated
		 */
		EClass BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP = eINSTANCE.getBlock_Element_Erlaubnis_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Auto Erlaubnisholen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISHOLEN = eINSTANCE.getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisholen();

		/**
		 * The meta object literal for the '<em><b>Auto Erlaubnisruecklauf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISRUECKLAUF = eINSTANCE.getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisruecklauf();

		/**
		 * The meta object literal for the '<em><b>Erlaubnis Staendig Vorhanden</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNIS_STAENDIG_VORHANDEN = eINSTANCE.getBlock_Element_Erlaubnis_AttributeGroup_ErlaubnisStaendigVorhanden();

		/**
		 * The meta object literal for the '<em><b>Erlaubnisabgabespeicherung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISABGABESPEICHERUNG = eINSTANCE.getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisabgabespeicherung();

		/**
		 * The meta object literal for the '<em><b>Erlaubnisholen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISHOLEN = eINSTANCE.getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisholen();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_StreckeImpl <em>Block Strecke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Block_StreckeImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Strecke()
		 * @generated
		 */
		EClass BLOCK_STRECKE = eINSTANCE.getBlock_Strecke();

		/**
		 * The meta object literal for the '<em><b>Block Strecke Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STRECKE__BLOCK_STRECKE_ALLG = eINSTANCE.getBlock_Strecke_BlockStreckeAllg();

		/**
		 * The meta object literal for the '<em><b>ID Betriebsstelle Nachbar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR = eINSTANCE.getBlock_Strecke_IDBetriebsstelleNachbar();

		/**
		 * The meta object literal for the '<em><b>ID Knotenbahnhof</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STRECKE__ID_KNOTENBAHNHOF = eINSTANCE.getBlock_Strecke_IDKnotenbahnhof();

		/**
		 * The meta object literal for the '<em><b>ID Strecke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STRECKE__ID_STRECKE = eINSTANCE.getBlock_Strecke_IDStrecke();

		/**
		 * The meta object literal for the '<em><b>ID Strecke Bremsweg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STRECKE__ID_STRECKE_BREMSWEG = eINSTANCE.getBlock_Strecke_IDStreckeBremsweg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Block_Strecke_Allg_AttributeGroupImpl <em>Block Strecke Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Block_Strecke_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBlock_Strecke_Allg_AttributeGroup()
		 * @generated
		 */
		EClass BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getBlock_Strecke_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Betriebsfuehrung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG = eINSTANCE.getBlock_Strecke_Allg_AttributeGroup_Betriebsfuehrung();

		/**
		 * The meta object literal for the '<em><b>Bremsweg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG = eINSTANCE.getBlock_Strecke_Allg_AttributeGroup_Bremsweg();

		/**
		 * The meta object literal for the '<em><b>Strecke Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART = eINSTANCE.getBlock_Strecke_Allg_AttributeGroup_StreckeArt();

		/**
		 * The meta object literal for the '<em><b>Streckengeschwindigkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKENGESCHWINDIGKEIT = eINSTANCE.getBlock_Strecke_Allg_AttributeGroup_Streckengeschwindigkeit();

		/**
		 * The meta object literal for the '<em><b>Traktion Art Elektrisch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART_ELEKTRISCH = eINSTANCE.getBlock_Strecke_Allg_AttributeGroup_TraktionArtElektrisch();

		/**
		 * The meta object literal for the '<em><b>Zugbeeinflussung Art</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART = eINSTANCE.getBlock_Strecke_Allg_AttributeGroup_ZugbeeinflussungArt();

		/**
		 * The meta object literal for the '<em><b>Zusatzinformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION = eINSTANCE.getBlock_Strecke_Allg_AttributeGroup_Zusatzinformation();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Bremsweg_TypeClassImpl <em>Bremsweg Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Bremsweg_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getBremsweg_TypeClass()
		 * @generated
		 */
		EClass BREMSWEG_TYPE_CLASS = eINSTANCE.getBremsweg_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREMSWEG_TYPE_CLASS__WERT = eINSTANCE.getBremsweg_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Erlaubnis_Staendig_Vorhanden_TypeClassImpl <em>Erlaubnis Staendig Vorhanden Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Erlaubnis_Staendig_Vorhanden_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getErlaubnis_Staendig_Vorhanden_TypeClass()
		 * @generated
		 */
		EClass ERLAUBNIS_STAENDIG_VORHANDEN_TYPE_CLASS = eINSTANCE.getErlaubnis_Staendig_Vorhanden_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERLAUBNIS_STAENDIG_VORHANDEN_TYPE_CLASS__WERT = eINSTANCE.getErlaubnis_Staendig_Vorhanden_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Erlaubnisabgabespeicherung_TypeClassImpl <em>Erlaubnisabgabespeicherung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Erlaubnisabgabespeicherung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getErlaubnisabgabespeicherung_TypeClass()
		 * @generated
		 */
		EClass ERLAUBNISABGABESPEICHERUNG_TYPE_CLASS = eINSTANCE.getErlaubnisabgabespeicherung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERLAUBNISABGABESPEICHERUNG_TYPE_CLASS__WERT = eINSTANCE.getErlaubnisabgabespeicherung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Erlaubnisholen_TypeClassImpl <em>Erlaubnisholen Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Erlaubnisholen_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getErlaubnisholen_TypeClass()
		 * @generated
		 */
		EClass ERLAUBNISHOLEN_TYPE_CLASS = eINSTANCE.getErlaubnisholen_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERLAUBNISHOLEN_TYPE_CLASS__WERT = eINSTANCE.getErlaubnisholen_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Rueckblockwecker_TypeClassImpl <em>Rueckblockwecker Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Rueckblockwecker_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getRueckblockwecker_TypeClass()
		 * @generated
		 */
		EClass RUECKBLOCKWECKER_TYPE_CLASS = eINSTANCE.getRueckblockwecker_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUECKBLOCKWECKER_TYPE_CLASS__WERT = eINSTANCE.getRueckblockwecker_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Schaltung_TypeClassImpl <em>Schaltung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Schaltung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getSchaltung_TypeClass()
		 * @generated
		 */
		EClass SCHALTUNG_TYPE_CLASS = eINSTANCE.getSchaltung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHALTUNG_TYPE_CLASS__WERT = eINSTANCE.getSchaltung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Schutzuebertrager_TypeClassImpl <em>Schutzuebertrager Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Schutzuebertrager_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getSchutzuebertrager_TypeClass()
		 * @generated
		 */
		EClass SCHUTZUEBERTRAGER_TYPE_CLASS = eINSTANCE.getSchutzuebertrager_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHUTZUEBERTRAGER_TYPE_CLASS__WERT = eINSTANCE.getSchutzuebertrager_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Strecke_Art_TypeClassImpl <em>Strecke Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Strecke_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getStrecke_Art_TypeClass()
		 * @generated
		 */
		EClass STRECKE_ART_TYPE_CLASS = eINSTANCE.getStrecke_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRECKE_ART_TYPE_CLASS__WERT = eINSTANCE.getStrecke_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Streckengeschwindigkeit_TypeClassImpl <em>Streckengeschwindigkeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Streckengeschwindigkeit_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getStreckengeschwindigkeit_TypeClass()
		 * @generated
		 */
		EClass STRECKENGESCHWINDIGKEIT_TYPE_CLASS = eINSTANCE.getStreckengeschwindigkeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRECKENGESCHWINDIGKEIT_TYPE_CLASS__WERT = eINSTANCE.getStreckengeschwindigkeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Traktion_Art_Elektrisch_TypeClassImpl <em>Traktion Art Elektrisch Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Traktion_Art_Elektrisch_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getTraktion_Art_Elektrisch_TypeClass()
		 * @generated
		 */
		EClass TRAKTION_ART_ELEKTRISCH_TYPE_CLASS = eINSTANCE.getTraktion_Art_Elektrisch_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAKTION_ART_ELEKTRISCH_TYPE_CLASS__WERT = eINSTANCE.getTraktion_Art_Elektrisch_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Vorblockwecker_TypeClassImpl <em>Vorblockwecker Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Vorblockwecker_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getVorblockwecker_TypeClass()
		 * @generated
		 */
		EClass VORBLOCKWECKER_TYPE_CLASS = eINSTANCE.getVorblockwecker_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORBLOCKWECKER_TYPE_CLASS__WERT = eINSTANCE.getVorblockwecker_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Zugbeeinflussung_Art_TypeClassImpl <em>Zugbeeinflussung Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Zugbeeinflussung_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getZugbeeinflussung_Art_TypeClass()
		 * @generated
		 */
		EClass ZUGBEEINFLUSSUNG_ART_TYPE_CLASS = eINSTANCE.getZugbeeinflussung_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUGBEEINFLUSSUNG_ART_TYPE_CLASS__WERT = eINSTANCE.getZugbeeinflussung_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.impl.Zusatzinformation_TypeClassImpl <em>Zusatzinformation Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.impl.Zusatzinformation_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getZusatzinformation_TypeClass()
		 * @generated
		 */
		EClass ZUSATZINFORMATION_TYPE_CLASS = eINSTANCE.getZusatzinformation_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSATZINFORMATION_TYPE_CLASS__WERT = eINSTANCE.getZusatzinformation_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.ENUMBetriebsfuehrung <em>ENUM Betriebsfuehrung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.ENUMBetriebsfuehrung
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMBetriebsfuehrung()
		 * @generated
		 */
		EEnum ENUM_BETRIEBSFUEHRUNG = eINSTANCE.getENUMBetriebsfuehrung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.ENUMBlockBauform <em>ENUM Block Bauform</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.ENUMBlockBauform
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMBlockBauform()
		 * @generated
		 */
		EEnum ENUM_BLOCK_BAUFORM = eINSTANCE.getENUMBlockBauform();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.ENUMSchaltung <em>ENUM Schaltung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.ENUMSchaltung
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMSchaltung()
		 * @generated
		 */
		EEnum ENUM_SCHALTUNG = eINSTANCE.getENUMSchaltung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Block.ENUMStreckeArt <em>ENUM Strecke Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.ENUMStreckeArt
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMStreckeArt()
		 * @generated
		 */
		EEnum ENUM_STRECKE_ART = eINSTANCE.getENUMStreckeArt();

		/**
		 * The meta object literal for the '<em>ENUM Betriebsfuehrung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.ENUMBetriebsfuehrung
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMBetriebsfuehrungObject()
		 * @generated
		 */
		EDataType ENUM_BETRIEBSFUEHRUNG_OBJECT = eINSTANCE.getENUMBetriebsfuehrungObject();

		/**
		 * The meta object literal for the '<em>ENUM Block Bauform Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.ENUMBlockBauform
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMBlockBauformObject()
		 * @generated
		 */
		EDataType ENUM_BLOCK_BAUFORM_OBJECT = eINSTANCE.getENUMBlockBauformObject();

		/**
		 * The meta object literal for the '<em>ENUM Schaltung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.ENUMSchaltung
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMSchaltungObject()
		 * @generated
		 */
		EDataType ENUM_SCHALTUNG_OBJECT = eINSTANCE.getENUMSchaltungObject();

		/**
		 * The meta object literal for the '<em>ENUM Strecke Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Block.ENUMStreckeArt
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getENUMStreckeArtObject()
		 * @generated
		 */
		EDataType ENUM_STRECKE_ART_OBJECT = eINSTANCE.getENUMStreckeArtObject();

		/**
		 * The meta object literal for the '<em>Streckengeschwindigkeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getStreckengeschwindigkeit_Type()
		 * @generated
		 */
		EDataType STRECKENGESCHWINDIGKEIT_TYPE = eINSTANCE.getStreckengeschwindigkeit_Type();

		/**
		 * The meta object literal for the '<em>Zusatzinformation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl#getZusatzinformation_Type()
		 * @generated
		 */
		EDataType ZUSATZINFORMATION_TYPE = eINSTANCE.getZusatzinformation_Type();

	}

} //BlockPackage
