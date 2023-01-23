/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Medien_und_Trassen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage;

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
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Medien_und_TrassenFactory
 * @model kind="package"
 * @generated
 */
public interface Medien_und_TrassenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Medien_und_Trassen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Medien_und_Trassen/1.10.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsMedien_und_Trassen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Medien_und_TrassenPackage eINSTANCE = org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Ader_Durchmesser_TypeClassImpl <em>Ader Durchmesser Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Ader_Durchmesser_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAder_Durchmesser_TypeClass()
	 * @generated
	 */
	int ADER_DURCHMESSER_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADER_DURCHMESSER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADER_DURCHMESSER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ader Durchmesser Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADER_DURCHMESSER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Ader_Querschnitt_TypeClassImpl <em>Ader Querschnitt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Ader_Querschnitt_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAder_Querschnitt_TypeClass()
	 * @generated
	 */
	int ADER_QUERSCHNITT_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADER_QUERSCHNITT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADER_QUERSCHNITT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ader Querschnitt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADER_QUERSCHNITT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Ader_Reserve_TypeClassImpl <em>Ader Reserve Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Ader_Reserve_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAder_Reserve_TypeClass()
	 * @generated
	 */
	int ADER_RESERVE_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADER_RESERVE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADER_RESERVE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ader Reserve Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADER_RESERVE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Anzahl_Verseilelemente_TypeClassImpl <em>Anzahl Verseilelemente Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Anzahl_Verseilelemente_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAnzahl_Verseilelemente_TypeClass()
	 * @generated
	 */
	int ANZAHL_VERSEILELEMENTE_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANZAHL_VERSEILELEMENTE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANZAHL_VERSEILELEMENTE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anzahl Verseilelemente Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANZAHL_VERSEILELEMENTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Bezeichnung_Kabel_TypeClassImpl <em>Bezeichnung Kabel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Bezeichnung_Kabel_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getBezeichnung_Kabel_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_KABEL_TYPE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_KABEL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_KABEL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Kabel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_KABEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Bezeichnung_Kabel_Verteilpunkt_TypeClassImpl <em>Bezeichnung Kabel Verteilpunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Bezeichnung_Kabel_Verteilpunkt_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getBezeichnung_Kabel_Verteilpunkt_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Kabel Verteilpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Induktionsschutz_TypeClassImpl <em>Induktionsschutz Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Induktionsschutz_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getInduktionsschutz_TypeClass()
	 * @generated
	 */
	int INDUKTIONSSCHUTZ_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUKTIONSSCHUTZ_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUKTIONSSCHUTZ_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Induktionsschutz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUKTIONSSCHUTZ_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.KabelImpl <em>Kabel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.KabelImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel()
	 * @generated
	 */
	int KABEL = 7;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Trasse Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL__ID_TRASSE_KANTE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kabel Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL__KABEL_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kabel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL__KABEL_ELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Kabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl <em>Kabel Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Allg_AttributeGroup()
	 * @generated
	 */
	int KABEL_ALLG_ATTRIBUTE_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Induktionsschutz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ALLG_ATTRIBUTE_GROUP__INDUKTIONSSCHUTZ = 0;

	/**
	 * The feature id for the '<em><b>Kabel Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART = 1;

	/**
	 * The feature id for the '<em><b>Kabel Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE = 2;

	/**
	 * The feature id for the '<em><b>Kabel Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP = 3;

	/**
	 * The feature id for the '<em><b>Nagetierschutz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ALLG_ATTRIBUTE_GROUP__NAGETIERSCHUTZ = 4;

	/**
	 * The number of structural features of the '<em>Kabel Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Art_TypeClassImpl <em>Kabel Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Art_TypeClass()
	 * @generated
	 */
	int KABEL_ART_TYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kabel Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Bezeichnung_AttributeGroupImpl <em>Kabel Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Bezeichnung Kabel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL = 0;

	/**
	 * The number of structural features of the '<em>Kabel Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Element_AttributeGroupImpl <em>Kabel Element Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Element_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Element_AttributeGroup()
	 * @generated
	 */
	int KABEL_ELEMENT_ATTRIBUTE_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Ader Reserve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_RESERVE = 0;

	/**
	 * The feature id for the '<em><b>Anzahl Verseilelemente</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ELEMENT_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE = 1;

	/**
	 * The feature id for the '<em><b>Verseilart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ELEMENT_ATTRIBUTE_GROUP__VERSEILART = 2;

	/**
	 * The feature id for the '<em><b>Ader Durchmesser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_DURCHMESSER = 3;

	/**
	 * The feature id for the '<em><b>Ader Querschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_QUERSCHNITT = 4;

	/**
	 * The number of structural features of the '<em>Kabel Element Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_ELEMENT_ATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Laenge_TypeClassImpl <em>Kabel Laenge Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Laenge_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Laenge_TypeClass()
	 * @generated
	 */
	int KABEL_LAENGE_TYPE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_LAENGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_LAENGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kabel Laenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_LAENGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Typ_TypeClassImpl <em>Kabel Typ Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Typ_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Typ_TypeClass()
	 * @generated
	 */
	int KABEL_TYP_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_TYP_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_TYP_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kabel Typ Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_TYP_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_VerteilpunktImpl <em>Kabel Verteilpunkt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_VerteilpunktImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Verteilpunkt()
	 * @generated
	 */
	int KABEL_VERTEILPUNKT = 14;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT__ID_UNTERBRINGUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kabel Verteilpunkt Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT__KABEL_VERTEILPUNKT_ART = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Kabel Verteilpunkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Verteilpunkt_Art_TypeClassImpl <em>Kabel Verteilpunkt Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Verteilpunkt_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Verteilpunkt_Art_TypeClass()
	 * @generated
	 */
	int KABEL_VERTEILPUNKT_ART_TYPE_CLASS = 15;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kabel Verteilpunkt Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Verteilpunkt_Bezeichnung_AttributeGroupImpl <em>Kabel Verteilpunkt Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Verteilpunkt_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Verteilpunkt_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP = 16;

	/**
	 * The feature id for the '<em><b>Bezeichnung Kabel Verteilpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL_VERTEILPUNKT = 0;

	/**
	 * The number of structural features of the '<em>Kabel Verteilpunkt Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Nagetierschutz_TypeClassImpl <em>Nagetierschutz Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Nagetierschutz_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getNagetierschutz_TypeClass()
	 * @generated
	 */
	int NAGETIERSCHUTZ_TYPE_CLASS = 17;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAGETIERSCHUTZ_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAGETIERSCHUTZ_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nagetierschutz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAGETIERSCHUTZ_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_KanteImpl <em>Trasse Kante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_KanteImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getTrasse_Kante()
	 * @generated
	 */
	int TRASSE_KANTE = 18;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KANTE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KANTE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KANTE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KANTE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KANTE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Trasse Knoten A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KANTE__ID_TRASSE_KNOTEN_A = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Trasse Knoten B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KANTE__ID_TRASSE_KNOTEN_B = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trasse Kante Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KANTE__TRASSE_KANTE_ART = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trasse Nutzer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KANTE__TRASSE_NUTZER = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Trasse Kante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KANTE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_Kante_Art_TypeClassImpl <em>Trasse Kante Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_Kante_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getTrasse_Kante_Art_TypeClass()
	 * @generated
	 */
	int TRASSE_KANTE_ART_TYPE_CLASS = 19;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KANTE_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KANTE_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trasse Kante Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KANTE_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_KnotenImpl <em>Trasse Knoten</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_KnotenImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getTrasse_Knoten()
	 * @generated
	 */
	int TRASSE_KNOTEN = 20;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KNOTEN__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KNOTEN__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KNOTEN__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KNOTEN__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KNOTEN__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Anschluss Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDGEO Knoten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KNOTEN__IDGEO_KNOTEN = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trasse Knoten Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KNOTEN__TRASSE_KNOTEN_ART = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trasse Knoten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KNOTEN_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_Knoten_Art_TypeClassImpl <em>Trasse Knoten Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_Knoten_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getTrasse_Knoten_Art_TypeClass()
	 * @generated
	 */
	int TRASSE_KNOTEN_ART_TYPE_CLASS = 21;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KNOTEN_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KNOTEN_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trasse Knoten Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_KNOTEN_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_Nutzer_TypeClassImpl <em>Trasse Nutzer Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_Nutzer_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getTrasse_Nutzer_TypeClass()
	 * @generated
	 */
	int TRASSE_NUTZER_TYPE_CLASS = 22;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_NUTZER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_NUTZER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trasse Nutzer Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASSE_NUTZER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Verseilart_TypeClassImpl <em>Verseilart Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Verseilart_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getVerseilart_TypeClass()
	 * @generated
	 */
	int VERSEILART_TYPE_CLASS = 23;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSEILART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSEILART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verseilart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSEILART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelArt <em>ENUM Kabel Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelArt
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMKabelArt()
	 * @generated
	 */
	int ENUM_KABEL_ART = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelVerteilpunktArt <em>ENUM Kabel Verteilpunkt Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelVerteilpunktArt
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMKabelVerteilpunktArt()
	 * @generated
	 */
	int ENUM_KABEL_VERTEILPUNKT_ART = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKanteArt <em>ENUM Trasse Kante Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKanteArt
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMTrasseKanteArt()
	 * @generated
	 */
	int ENUM_TRASSE_KANTE_ART = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKnotenArt <em>ENUM Trasse Knoten Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKnotenArt
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMTrasseKnotenArt()
	 * @generated
	 */
	int ENUM_TRASSE_KNOTEN_ART = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseNutzer <em>ENUM Trasse Nutzer</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseNutzer
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMTrasseNutzer()
	 * @generated
	 */
	int ENUM_TRASSE_NUTZER = 28;

	/**
	 * The meta object id for the '<em>Ader Durchmesser Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAder_Durchmesser_Type()
	 * @generated
	 */
	int ADER_DURCHMESSER_TYPE = 29;

	/**
	 * The meta object id for the '<em>Ader Querschnitt Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAder_Querschnitt_Type()
	 * @generated
	 */
	int ADER_QUERSCHNITT_TYPE = 30;

	/**
	 * The meta object id for the '<em>Ader Reserve Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAder_Reserve_Type()
	 * @generated
	 */
	int ADER_RESERVE_TYPE = 31;

	/**
	 * The meta object id for the '<em>Anzahl Verseilelemente Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAnzahl_Verseilelemente_Type()
	 * @generated
	 */
	int ANZAHL_VERSEILELEMENTE_TYPE = 32;

	/**
	 * The meta object id for the '<em>Bezeichnung Kabel Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getBezeichnung_Kabel_Type()
	 * @generated
	 */
	int BEZEICHNUNG_KABEL_TYPE = 33;

	/**
	 * The meta object id for the '<em>Bezeichnung Kabel Verteilpunkt Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getBezeichnung_Kabel_Verteilpunkt_Type()
	 * @generated
	 */
	int BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE = 34;

	/**
	 * The meta object id for the '<em>ENUM Kabel Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelArt
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMKabelArtObject()
	 * @generated
	 */
	int ENUM_KABEL_ART_OBJECT = 35;

	/**
	 * The meta object id for the '<em>ENUM Kabel Verteilpunkt Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelVerteilpunktArt
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMKabelVerteilpunktArtObject()
	 * @generated
	 */
	int ENUM_KABEL_VERTEILPUNKT_ART_OBJECT = 36;

	/**
	 * The meta object id for the '<em>ENUM Trasse Kante Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKanteArt
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMTrasseKanteArtObject()
	 * @generated
	 */
	int ENUM_TRASSE_KANTE_ART_OBJECT = 37;

	/**
	 * The meta object id for the '<em>ENUM Trasse Knoten Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKnotenArt
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMTrasseKnotenArtObject()
	 * @generated
	 */
	int ENUM_TRASSE_KNOTEN_ART_OBJECT = 38;

	/**
	 * The meta object id for the '<em>ENUM Trasse Nutzer Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseNutzer
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMTrasseNutzerObject()
	 * @generated
	 */
	int ENUM_TRASSE_NUTZER_OBJECT = 39;

	/**
	 * The meta object id for the '<em>Induktionsschutz Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getInduktionsschutz_Type()
	 * @generated
	 */
	int INDUKTIONSSCHUTZ_TYPE = 40;

	/**
	 * The meta object id for the '<em>Kabel Laenge Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Laenge_Type()
	 * @generated
	 */
	int KABEL_LAENGE_TYPE = 41;

	/**
	 * The meta object id for the '<em>Kabel Typ Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Typ_Type()
	 * @generated
	 */
	int KABEL_TYP_TYPE = 42;

	/**
	 * The meta object id for the '<em>Verseilart Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getVerseilart_Type()
	 * @generated
	 */
	int VERSEILART_TYPE = 43;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Durchmesser_TypeClass <em>Ader Durchmesser Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ader Durchmesser Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Durchmesser_TypeClass
	 * @generated
	 */
	EClass getAder_Durchmesser_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Durchmesser_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Durchmesser_TypeClass#getWert()
	 * @see #getAder_Durchmesser_TypeClass()
	 * @generated
	 */
	EAttribute getAder_Durchmesser_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Querschnitt_TypeClass <em>Ader Querschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ader Querschnitt Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Querschnitt_TypeClass
	 * @generated
	 */
	EClass getAder_Querschnitt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Querschnitt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Querschnitt_TypeClass#getWert()
	 * @see #getAder_Querschnitt_TypeClass()
	 * @generated
	 */
	EAttribute getAder_Querschnitt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Reserve_TypeClass <em>Ader Reserve Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ader Reserve Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Reserve_TypeClass
	 * @generated
	 */
	EClass getAder_Reserve_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Reserve_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Reserve_TypeClass#getWert()
	 * @see #getAder_Reserve_TypeClass()
	 * @generated
	 */
	EAttribute getAder_Reserve_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Anzahl_Verseilelemente_TypeClass <em>Anzahl Verseilelemente Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anzahl Verseilelemente Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Anzahl_Verseilelemente_TypeClass
	 * @generated
	 */
	EClass getAnzahl_Verseilelemente_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Anzahl_Verseilelemente_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Anzahl_Verseilelemente_TypeClass#getWert()
	 * @see #getAnzahl_Verseilelemente_TypeClass()
	 * @generated
	 */
	EAttribute getAnzahl_Verseilelemente_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_TypeClass <em>Bezeichnung Kabel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Kabel Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Kabel_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_TypeClass#getWert()
	 * @see #getBezeichnung_Kabel_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Kabel_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_Verteilpunkt_TypeClass <em>Bezeichnung Kabel Verteilpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Kabel Verteilpunkt Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_Verteilpunkt_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Kabel_Verteilpunkt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_Verteilpunkt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_Verteilpunkt_TypeClass#getWert()
	 * @see #getBezeichnung_Kabel_Verteilpunkt_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Kabel_Verteilpunkt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Induktionsschutz_TypeClass <em>Induktionsschutz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Induktionsschutz Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Induktionsschutz_TypeClass
	 * @generated
	 */
	EClass getInduktionsschutz_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Induktionsschutz_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Induktionsschutz_TypeClass#getWert()
	 * @see #getInduktionsschutz_TypeClass()
	 * @generated
	 */
	EAttribute getInduktionsschutz_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel <em>Kabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kabel</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel
	 * @generated
	 */
	EClass getKabel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel#getBezeichnung()
	 * @see #getKabel()
	 * @generated
	 */
	EReference getKabel_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel#getIDTrasseKante <em>ID Trasse Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Trasse Kante</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel#getIDTrasseKante()
	 * @see #getKabel()
	 * @generated
	 */
	EReference getKabel_IDTrasseKante();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel#getKabelAllg <em>Kabel Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kabel Allg</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel#getKabelAllg()
	 * @see #getKabel()
	 * @generated
	 */
	EReference getKabel_KabelAllg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel#getKabelElement <em>Kabel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kabel Element</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel#getKabelElement()
	 * @see #getKabel()
	 * @generated
	 */
	EReference getKabel_KabelElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup <em>Kabel Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kabel Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup
	 * @generated
	 */
	EClass getKabel_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getInduktionsschutz <em>Induktionsschutz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Induktionsschutz</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getInduktionsschutz()
	 * @see #getKabel_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getKabel_Allg_AttributeGroup_Induktionsschutz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelArt <em>Kabel Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kabel Art</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelArt()
	 * @see #getKabel_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getKabel_Allg_AttributeGroup_KabelArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelLaenge <em>Kabel Laenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kabel Laenge</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelLaenge()
	 * @see #getKabel_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getKabel_Allg_AttributeGroup_KabelLaenge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelTyp <em>Kabel Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kabel Typ</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelTyp()
	 * @see #getKabel_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getKabel_Allg_AttributeGroup_KabelTyp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getNagetierschutz <em>Nagetierschutz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nagetierschutz</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getNagetierschutz()
	 * @see #getKabel_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getKabel_Allg_AttributeGroup_Nagetierschutz();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Art_TypeClass <em>Kabel Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kabel Art Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Art_TypeClass
	 * @generated
	 */
	EClass getKabel_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Art_TypeClass#getWert()
	 * @see #getKabel_Art_TypeClass()
	 * @generated
	 */
	EAttribute getKabel_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Bezeichnung_AttributeGroup <em>Kabel Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kabel Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getKabel_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Bezeichnung_AttributeGroup#getBezeichnungKabel <em>Bezeichnung Kabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Kabel</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Bezeichnung_AttributeGroup#getBezeichnungKabel()
	 * @see #getKabel_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getKabel_Bezeichnung_AttributeGroup_BezeichnungKabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup <em>Kabel Element Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kabel Element Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup
	 * @generated
	 */
	EClass getKabel_Element_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup#getAderReserve <em>Ader Reserve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ader Reserve</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup#getAderReserve()
	 * @see #getKabel_Element_AttributeGroup()
	 * @generated
	 */
	EReference getKabel_Element_AttributeGroup_AderReserve();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup#getAnzahlVerseilelemente <em>Anzahl Verseilelemente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anzahl Verseilelemente</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup#getAnzahlVerseilelemente()
	 * @see #getKabel_Element_AttributeGroup()
	 * @generated
	 */
	EReference getKabel_Element_AttributeGroup_AnzahlVerseilelemente();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup#getVerseilart <em>Verseilart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verseilart</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup#getVerseilart()
	 * @see #getKabel_Element_AttributeGroup()
	 * @generated
	 */
	EReference getKabel_Element_AttributeGroup_Verseilart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup#getAderDurchmesser <em>Ader Durchmesser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ader Durchmesser</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup#getAderDurchmesser()
	 * @see #getKabel_Element_AttributeGroup()
	 * @generated
	 */
	EReference getKabel_Element_AttributeGroup_AderDurchmesser();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup#getAderQuerschnitt <em>Ader Querschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ader Querschnitt</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup#getAderQuerschnitt()
	 * @see #getKabel_Element_AttributeGroup()
	 * @generated
	 */
	EReference getKabel_Element_AttributeGroup_AderQuerschnitt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Laenge_TypeClass <em>Kabel Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kabel Laenge Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Laenge_TypeClass
	 * @generated
	 */
	EClass getKabel_Laenge_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Laenge_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Laenge_TypeClass#getWert()
	 * @see #getKabel_Laenge_TypeClass()
	 * @generated
	 */
	EAttribute getKabel_Laenge_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Typ_TypeClass <em>Kabel Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kabel Typ Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Typ_TypeClass
	 * @generated
	 */
	EClass getKabel_Typ_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Typ_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Typ_TypeClass#getWert()
	 * @see #getKabel_Typ_TypeClass()
	 * @generated
	 */
	EAttribute getKabel_Typ_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt <em>Kabel Verteilpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kabel Verteilpunkt</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt
	 * @generated
	 */
	EClass getKabel_Verteilpunkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt#getBezeichnung()
	 * @see #getKabel_Verteilpunkt()
	 * @generated
	 */
	EReference getKabel_Verteilpunkt_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt#getIDUnterbringung <em>ID Unterbringung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Unterbringung</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt#getIDUnterbringung()
	 * @see #getKabel_Verteilpunkt()
	 * @generated
	 */
	EReference getKabel_Verteilpunkt_IDUnterbringung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt#getKabelVerteilpunktArt <em>Kabel Verteilpunkt Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kabel Verteilpunkt Art</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt#getKabelVerteilpunktArt()
	 * @see #getKabel_Verteilpunkt()
	 * @generated
	 */
	EReference getKabel_Verteilpunkt_KabelVerteilpunktArt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Art_TypeClass <em>Kabel Verteilpunkt Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kabel Verteilpunkt Art Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Art_TypeClass
	 * @generated
	 */
	EClass getKabel_Verteilpunkt_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Art_TypeClass#getWert()
	 * @see #getKabel_Verteilpunkt_Art_TypeClass()
	 * @generated
	 */
	EAttribute getKabel_Verteilpunkt_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Bezeichnung_AttributeGroup <em>Kabel Verteilpunkt Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kabel Verteilpunkt Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getKabel_Verteilpunkt_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Bezeichnung_AttributeGroup#getBezeichnungKabelVerteilpunkt <em>Bezeichnung Kabel Verteilpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Kabel Verteilpunkt</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Bezeichnung_AttributeGroup#getBezeichnungKabelVerteilpunkt()
	 * @see #getKabel_Verteilpunkt_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getKabel_Verteilpunkt_Bezeichnung_AttributeGroup_BezeichnungKabelVerteilpunkt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Nagetierschutz_TypeClass <em>Nagetierschutz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nagetierschutz Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Nagetierschutz_TypeClass
	 * @generated
	 */
	EClass getNagetierschutz_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Nagetierschutz_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Nagetierschutz_TypeClass#getWert()
	 * @see #getNagetierschutz_TypeClass()
	 * @generated
	 */
	EAttribute getNagetierschutz_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante <em>Trasse Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trasse Kante</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante
	 * @generated
	 */
	EClass getTrasse_Kante();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante#getIDTrasseKnotenA <em>ID Trasse Knoten A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Trasse Knoten A</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante#getIDTrasseKnotenA()
	 * @see #getTrasse_Kante()
	 * @generated
	 */
	EReference getTrasse_Kante_IDTrasseKnotenA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante#getIDTrasseKnotenB <em>ID Trasse Knoten B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Trasse Knoten B</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante#getIDTrasseKnotenB()
	 * @see #getTrasse_Kante()
	 * @generated
	 */
	EReference getTrasse_Kante_IDTrasseKnotenB();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante#getTrasseKanteArt <em>Trasse Kante Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trasse Kante Art</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante#getTrasseKanteArt()
	 * @see #getTrasse_Kante()
	 * @generated
	 */
	EReference getTrasse_Kante_TrasseKanteArt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante#getTrasseNutzer <em>Trasse Nutzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trasse Nutzer</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante#getTrasseNutzer()
	 * @see #getTrasse_Kante()
	 * @generated
	 */
	EReference getTrasse_Kante_TrasseNutzer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante_Art_TypeClass <em>Trasse Kante Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trasse Kante Art Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante_Art_TypeClass
	 * @generated
	 */
	EClass getTrasse_Kante_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante_Art_TypeClass#getWert()
	 * @see #getTrasse_Kante_Art_TypeClass()
	 * @generated
	 */
	EAttribute getTrasse_Kante_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten <em>Trasse Knoten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trasse Knoten</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten
	 * @generated
	 */
	EClass getTrasse_Knoten();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten#getIDAnschlussElement <em>ID Anschluss Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Anschluss Element</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten#getIDAnschlussElement()
	 * @see #getTrasse_Knoten()
	 * @generated
	 */
	EReference getTrasse_Knoten_IDAnschlussElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten#getIDGEOKnoten <em>IDGEO Knoten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDGEO Knoten</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten#getIDGEOKnoten()
	 * @see #getTrasse_Knoten()
	 * @generated
	 */
	EReference getTrasse_Knoten_IDGEOKnoten();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten#getTrasseKnotenArt <em>Trasse Knoten Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trasse Knoten Art</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten#getTrasseKnotenArt()
	 * @see #getTrasse_Knoten()
	 * @generated
	 */
	EReference getTrasse_Knoten_TrasseKnotenArt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten_Art_TypeClass <em>Trasse Knoten Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trasse Knoten Art Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten_Art_TypeClass
	 * @generated
	 */
	EClass getTrasse_Knoten_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten_Art_TypeClass#getWert()
	 * @see #getTrasse_Knoten_Art_TypeClass()
	 * @generated
	 */
	EAttribute getTrasse_Knoten_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Nutzer_TypeClass <em>Trasse Nutzer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trasse Nutzer Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Nutzer_TypeClass
	 * @generated
	 */
	EClass getTrasse_Nutzer_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Nutzer_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Nutzer_TypeClass#getWert()
	 * @see #getTrasse_Nutzer_TypeClass()
	 * @generated
	 */
	EAttribute getTrasse_Nutzer_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Verseilart_TypeClass <em>Verseilart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verseilart Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Verseilart_TypeClass
	 * @generated
	 */
	EClass getVerseilart_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.Verseilart_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Verseilart_TypeClass#getWert()
	 * @see #getVerseilart_TypeClass()
	 * @generated
	 */
	EAttribute getVerseilart_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelArt <em>ENUM Kabel Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Kabel Art</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelArt
	 * @generated
	 */
	EEnum getENUMKabelArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelVerteilpunktArt <em>ENUM Kabel Verteilpunkt Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Kabel Verteilpunkt Art</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelVerteilpunktArt
	 * @generated
	 */
	EEnum getENUMKabelVerteilpunktArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKanteArt <em>ENUM Trasse Kante Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Trasse Kante Art</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKanteArt
	 * @generated
	 */
	EEnum getENUMTrasseKanteArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKnotenArt <em>ENUM Trasse Knoten Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Trasse Knoten Art</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKnotenArt
	 * @generated
	 */
	EEnum getENUMTrasseKnotenArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseNutzer <em>ENUM Trasse Nutzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Trasse Nutzer</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseNutzer
	 * @generated
	 */
	EEnum getENUMTrasseNutzer();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Ader Durchmesser Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ader Durchmesser Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TAder_Durchmesser' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='[01][.][1-8]|[0][.][9]|[1][.][0]'"
	 * @generated
	 */
	EDataType getAder_Durchmesser_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Ader Querschnitt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ader Querschnitt Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TAder_Querschnitt' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='[1-9][0-9]?([.][1-9])?'"
	 * @generated
	 */
	EDataType getAder_Querschnitt_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Ader Reserve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ader Reserve Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TAder_Reserve' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9][0-9]{0,1}|[1][0-9]{2}|200'"
	 * @generated
	 */
	EDataType getAder_Reserve_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Anzahl Verseilelemente Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Anzahl Verseilelemente Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TAnzahl_Verseilelemente' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9][0-9]{0,1}|[1][0-9]{2}|200'"
	 * @generated
	 */
	EDataType getAnzahl_Verseilelemente_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Kabel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Kabel Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Kabel' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='[1-9]|1[0-6]'"
	 * @generated
	 */
	EDataType getBezeichnung_Kabel_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Kabel Verteilpunkt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Kabel Verteilpunkt Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Kabel_Verteilpunkt' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='[1-9]|1[0-9]|20'"
	 * @generated
	 */
	EDataType getBezeichnung_Kabel_Verteilpunkt_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelArt <em>ENUM Kabel Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Kabel Art Object</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelArt
	 * @model instanceClass="org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelArt"
	 *        extendedMetaData="name='ENUMKabel_Art:Object' baseType='ENUMKabel_Art'"
	 * @generated
	 */
	EDataType getENUMKabelArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelVerteilpunktArt <em>ENUM Kabel Verteilpunkt Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Kabel Verteilpunkt Art Object</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelVerteilpunktArt
	 * @model instanceClass="org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelVerteilpunktArt"
	 *        extendedMetaData="name='ENUMKabel_Verteilpunkt_Art:Object' baseType='ENUMKabel_Verteilpunkt_Art'"
	 * @generated
	 */
	EDataType getENUMKabelVerteilpunktArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKanteArt <em>ENUM Trasse Kante Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Trasse Kante Art Object</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKanteArt
	 * @model instanceClass="org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKanteArt"
	 *        extendedMetaData="name='ENUMTrasse_Kante_Art:Object' baseType='ENUMTrasse_Kante_Art'"
	 * @generated
	 */
	EDataType getENUMTrasseKanteArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKnotenArt <em>ENUM Trasse Knoten Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Trasse Knoten Art Object</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKnotenArt
	 * @model instanceClass="org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKnotenArt"
	 *        extendedMetaData="name='ENUMTrasse_Knoten_Art:Object' baseType='ENUMTrasse_Knoten_Art'"
	 * @generated
	 */
	EDataType getENUMTrasseKnotenArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseNutzer <em>ENUM Trasse Nutzer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Trasse Nutzer Object</em>'.
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseNutzer
	 * @model instanceClass="org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseNutzer"
	 *        extendedMetaData="name='ENUMTrasse_Nutzer:Object' baseType='ENUMTrasse_Nutzer'"
	 * @generated
	 */
	EDataType getENUMTrasseNutzerObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Induktionsschutz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Induktionsschutz Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TInduktionsschutz' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getInduktionsschutz_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Kabel Laenge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kabel Laenge Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TKabel_Laenge' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter' pattern='(-?[1-9][0-9]{0,})|0'"
	 * @generated
	 */
	EDataType getKabel_Laenge_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Kabel Typ Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kabel Typ Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TKabel_Typ' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText'"
	 * @generated
	 */
	EDataType getKabel_Typ_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Verseilart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Verseilart Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TVerseilart' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1|4]'"
	 * @generated
	 */
	EDataType getVerseilart_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Medien_und_TrassenFactory getMedien_und_TrassenFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Ader_Durchmesser_TypeClassImpl <em>Ader Durchmesser Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Ader_Durchmesser_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAder_Durchmesser_TypeClass()
		 * @generated
		 */
		EClass ADER_DURCHMESSER_TYPE_CLASS = eINSTANCE.getAder_Durchmesser_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADER_DURCHMESSER_TYPE_CLASS__WERT = eINSTANCE.getAder_Durchmesser_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Ader_Querschnitt_TypeClassImpl <em>Ader Querschnitt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Ader_Querschnitt_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAder_Querschnitt_TypeClass()
		 * @generated
		 */
		EClass ADER_QUERSCHNITT_TYPE_CLASS = eINSTANCE.getAder_Querschnitt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADER_QUERSCHNITT_TYPE_CLASS__WERT = eINSTANCE.getAder_Querschnitt_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Ader_Reserve_TypeClassImpl <em>Ader Reserve Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Ader_Reserve_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAder_Reserve_TypeClass()
		 * @generated
		 */
		EClass ADER_RESERVE_TYPE_CLASS = eINSTANCE.getAder_Reserve_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADER_RESERVE_TYPE_CLASS__WERT = eINSTANCE.getAder_Reserve_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Anzahl_Verseilelemente_TypeClassImpl <em>Anzahl Verseilelemente Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Anzahl_Verseilelemente_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAnzahl_Verseilelemente_TypeClass()
		 * @generated
		 */
		EClass ANZAHL_VERSEILELEMENTE_TYPE_CLASS = eINSTANCE.getAnzahl_Verseilelemente_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANZAHL_VERSEILELEMENTE_TYPE_CLASS__WERT = eINSTANCE.getAnzahl_Verseilelemente_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Bezeichnung_Kabel_TypeClassImpl <em>Bezeichnung Kabel Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Bezeichnung_Kabel_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getBezeichnung_Kabel_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_KABEL_TYPE_CLASS = eINSTANCE.getBezeichnung_Kabel_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_KABEL_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Kabel_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Bezeichnung_Kabel_Verteilpunkt_TypeClassImpl <em>Bezeichnung Kabel Verteilpunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Bezeichnung_Kabel_Verteilpunkt_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getBezeichnung_Kabel_Verteilpunkt_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE_CLASS = eINSTANCE.getBezeichnung_Kabel_Verteilpunkt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Kabel_Verteilpunkt_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Induktionsschutz_TypeClassImpl <em>Induktionsschutz Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Induktionsschutz_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getInduktionsschutz_TypeClass()
		 * @generated
		 */
		EClass INDUKTIONSSCHUTZ_TYPE_CLASS = eINSTANCE.getInduktionsschutz_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDUKTIONSSCHUTZ_TYPE_CLASS__WERT = eINSTANCE.getInduktionsschutz_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.KabelImpl <em>Kabel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.KabelImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel()
		 * @generated
		 */
		EClass KABEL = eINSTANCE.getKabel();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL__BEZEICHNUNG = eINSTANCE.getKabel_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Trasse Kante</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL__ID_TRASSE_KANTE = eINSTANCE.getKabel_IDTrasseKante();

		/**
		 * The meta object literal for the '<em><b>Kabel Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL__KABEL_ALLG = eINSTANCE.getKabel_KabelAllg();

		/**
		 * The meta object literal for the '<em><b>Kabel Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL__KABEL_ELEMENT = eINSTANCE.getKabel_KabelElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl <em>Kabel Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Allg_AttributeGroup()
		 * @generated
		 */
		EClass KABEL_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getKabel_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Induktionsschutz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_ALLG_ATTRIBUTE_GROUP__INDUKTIONSSCHUTZ = eINSTANCE.getKabel_Allg_AttributeGroup_Induktionsschutz();

		/**
		 * The meta object literal for the '<em><b>Kabel Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART = eINSTANCE.getKabel_Allg_AttributeGroup_KabelArt();

		/**
		 * The meta object literal for the '<em><b>Kabel Laenge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE = eINSTANCE.getKabel_Allg_AttributeGroup_KabelLaenge();

		/**
		 * The meta object literal for the '<em><b>Kabel Typ</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP = eINSTANCE.getKabel_Allg_AttributeGroup_KabelTyp();

		/**
		 * The meta object literal for the '<em><b>Nagetierschutz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_ALLG_ATTRIBUTE_GROUP__NAGETIERSCHUTZ = eINSTANCE.getKabel_Allg_AttributeGroup_Nagetierschutz();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Art_TypeClassImpl <em>Kabel Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Art_TypeClass()
		 * @generated
		 */
		EClass KABEL_ART_TYPE_CLASS = eINSTANCE.getKabel_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KABEL_ART_TYPE_CLASS__WERT = eINSTANCE.getKabel_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Bezeichnung_AttributeGroupImpl <em>Kabel Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getKabel_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Kabel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL = eINSTANCE.getKabel_Bezeichnung_AttributeGroup_BezeichnungKabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Element_AttributeGroupImpl <em>Kabel Element Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Element_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Element_AttributeGroup()
		 * @generated
		 */
		EClass KABEL_ELEMENT_ATTRIBUTE_GROUP = eINSTANCE.getKabel_Element_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Ader Reserve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_RESERVE = eINSTANCE.getKabel_Element_AttributeGroup_AderReserve();

		/**
		 * The meta object literal for the '<em><b>Anzahl Verseilelemente</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_ELEMENT_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE = eINSTANCE.getKabel_Element_AttributeGroup_AnzahlVerseilelemente();

		/**
		 * The meta object literal for the '<em><b>Verseilart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_ELEMENT_ATTRIBUTE_GROUP__VERSEILART = eINSTANCE.getKabel_Element_AttributeGroup_Verseilart();

		/**
		 * The meta object literal for the '<em><b>Ader Durchmesser</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_DURCHMESSER = eINSTANCE.getKabel_Element_AttributeGroup_AderDurchmesser();

		/**
		 * The meta object literal for the '<em><b>Ader Querschnitt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_QUERSCHNITT = eINSTANCE.getKabel_Element_AttributeGroup_AderQuerschnitt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Laenge_TypeClassImpl <em>Kabel Laenge Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Laenge_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Laenge_TypeClass()
		 * @generated
		 */
		EClass KABEL_LAENGE_TYPE_CLASS = eINSTANCE.getKabel_Laenge_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KABEL_LAENGE_TYPE_CLASS__WERT = eINSTANCE.getKabel_Laenge_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Typ_TypeClassImpl <em>Kabel Typ Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Typ_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Typ_TypeClass()
		 * @generated
		 */
		EClass KABEL_TYP_TYPE_CLASS = eINSTANCE.getKabel_Typ_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KABEL_TYP_TYPE_CLASS__WERT = eINSTANCE.getKabel_Typ_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_VerteilpunktImpl <em>Kabel Verteilpunkt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_VerteilpunktImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Verteilpunkt()
		 * @generated
		 */
		EClass KABEL_VERTEILPUNKT = eINSTANCE.getKabel_Verteilpunkt();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_VERTEILPUNKT__BEZEICHNUNG = eINSTANCE.getKabel_Verteilpunkt_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Unterbringung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_VERTEILPUNKT__ID_UNTERBRINGUNG = eINSTANCE.getKabel_Verteilpunkt_IDUnterbringung();

		/**
		 * The meta object literal for the '<em><b>Kabel Verteilpunkt Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_VERTEILPUNKT__KABEL_VERTEILPUNKT_ART = eINSTANCE.getKabel_Verteilpunkt_KabelVerteilpunktArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Verteilpunkt_Art_TypeClassImpl <em>Kabel Verteilpunkt Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Verteilpunkt_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Verteilpunkt_Art_TypeClass()
		 * @generated
		 */
		EClass KABEL_VERTEILPUNKT_ART_TYPE_CLASS = eINSTANCE.getKabel_Verteilpunkt_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KABEL_VERTEILPUNKT_ART_TYPE_CLASS__WERT = eINSTANCE.getKabel_Verteilpunkt_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Verteilpunkt_Bezeichnung_AttributeGroupImpl <em>Kabel Verteilpunkt Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Verteilpunkt_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Verteilpunkt_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getKabel_Verteilpunkt_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Kabel Verteilpunkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL_VERTEILPUNKT = eINSTANCE.getKabel_Verteilpunkt_Bezeichnung_AttributeGroup_BezeichnungKabelVerteilpunkt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Nagetierschutz_TypeClassImpl <em>Nagetierschutz Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Nagetierschutz_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getNagetierschutz_TypeClass()
		 * @generated
		 */
		EClass NAGETIERSCHUTZ_TYPE_CLASS = eINSTANCE.getNagetierschutz_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAGETIERSCHUTZ_TYPE_CLASS__WERT = eINSTANCE.getNagetierschutz_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_KanteImpl <em>Trasse Kante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_KanteImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getTrasse_Kante()
		 * @generated
		 */
		EClass TRASSE_KANTE = eINSTANCE.getTrasse_Kante();

		/**
		 * The meta object literal for the '<em><b>ID Trasse Knoten A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRASSE_KANTE__ID_TRASSE_KNOTEN_A = eINSTANCE.getTrasse_Kante_IDTrasseKnotenA();

		/**
		 * The meta object literal for the '<em><b>ID Trasse Knoten B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRASSE_KANTE__ID_TRASSE_KNOTEN_B = eINSTANCE.getTrasse_Kante_IDTrasseKnotenB();

		/**
		 * The meta object literal for the '<em><b>Trasse Kante Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRASSE_KANTE__TRASSE_KANTE_ART = eINSTANCE.getTrasse_Kante_TrasseKanteArt();

		/**
		 * The meta object literal for the '<em><b>Trasse Nutzer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRASSE_KANTE__TRASSE_NUTZER = eINSTANCE.getTrasse_Kante_TrasseNutzer();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_Kante_Art_TypeClassImpl <em>Trasse Kante Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_Kante_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getTrasse_Kante_Art_TypeClass()
		 * @generated
		 */
		EClass TRASSE_KANTE_ART_TYPE_CLASS = eINSTANCE.getTrasse_Kante_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRASSE_KANTE_ART_TYPE_CLASS__WERT = eINSTANCE.getTrasse_Kante_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_KnotenImpl <em>Trasse Knoten</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_KnotenImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getTrasse_Knoten()
		 * @generated
		 */
		EClass TRASSE_KNOTEN = eINSTANCE.getTrasse_Knoten();

		/**
		 * The meta object literal for the '<em><b>ID Anschluss Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT = eINSTANCE.getTrasse_Knoten_IDAnschlussElement();

		/**
		 * The meta object literal for the '<em><b>IDGEO Knoten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRASSE_KNOTEN__IDGEO_KNOTEN = eINSTANCE.getTrasse_Knoten_IDGEOKnoten();

		/**
		 * The meta object literal for the '<em><b>Trasse Knoten Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRASSE_KNOTEN__TRASSE_KNOTEN_ART = eINSTANCE.getTrasse_Knoten_TrasseKnotenArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_Knoten_Art_TypeClassImpl <em>Trasse Knoten Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_Knoten_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getTrasse_Knoten_Art_TypeClass()
		 * @generated
		 */
		EClass TRASSE_KNOTEN_ART_TYPE_CLASS = eINSTANCE.getTrasse_Knoten_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRASSE_KNOTEN_ART_TYPE_CLASS__WERT = eINSTANCE.getTrasse_Knoten_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_Nutzer_TypeClassImpl <em>Trasse Nutzer Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Trasse_Nutzer_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getTrasse_Nutzer_TypeClass()
		 * @generated
		 */
		EClass TRASSE_NUTZER_TYPE_CLASS = eINSTANCE.getTrasse_Nutzer_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRASSE_NUTZER_TYPE_CLASS__WERT = eINSTANCE.getTrasse_Nutzer_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Verseilart_TypeClassImpl <em>Verseilart Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Verseilart_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getVerseilart_TypeClass()
		 * @generated
		 */
		EClass VERSEILART_TYPE_CLASS = eINSTANCE.getVerseilart_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSEILART_TYPE_CLASS__WERT = eINSTANCE.getVerseilart_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelArt <em>ENUM Kabel Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelArt
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMKabelArt()
		 * @generated
		 */
		EEnum ENUM_KABEL_ART = eINSTANCE.getENUMKabelArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelVerteilpunktArt <em>ENUM Kabel Verteilpunkt Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelVerteilpunktArt
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMKabelVerteilpunktArt()
		 * @generated
		 */
		EEnum ENUM_KABEL_VERTEILPUNKT_ART = eINSTANCE.getENUMKabelVerteilpunktArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKanteArt <em>ENUM Trasse Kante Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKanteArt
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMTrasseKanteArt()
		 * @generated
		 */
		EEnum ENUM_TRASSE_KANTE_ART = eINSTANCE.getENUMTrasseKanteArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKnotenArt <em>ENUM Trasse Knoten Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKnotenArt
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMTrasseKnotenArt()
		 * @generated
		 */
		EEnum ENUM_TRASSE_KNOTEN_ART = eINSTANCE.getENUMTrasseKnotenArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseNutzer <em>ENUM Trasse Nutzer</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseNutzer
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMTrasseNutzer()
		 * @generated
		 */
		EEnum ENUM_TRASSE_NUTZER = eINSTANCE.getENUMTrasseNutzer();

		/**
		 * The meta object literal for the '<em>Ader Durchmesser Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAder_Durchmesser_Type()
		 * @generated
		 */
		EDataType ADER_DURCHMESSER_TYPE = eINSTANCE.getAder_Durchmesser_Type();

		/**
		 * The meta object literal for the '<em>Ader Querschnitt Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAder_Querschnitt_Type()
		 * @generated
		 */
		EDataType ADER_QUERSCHNITT_TYPE = eINSTANCE.getAder_Querschnitt_Type();

		/**
		 * The meta object literal for the '<em>Ader Reserve Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAder_Reserve_Type()
		 * @generated
		 */
		EDataType ADER_RESERVE_TYPE = eINSTANCE.getAder_Reserve_Type();

		/**
		 * The meta object literal for the '<em>Anzahl Verseilelemente Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getAnzahl_Verseilelemente_Type()
		 * @generated
		 */
		EDataType ANZAHL_VERSEILELEMENTE_TYPE = eINSTANCE.getAnzahl_Verseilelemente_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung Kabel Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getBezeichnung_Kabel_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_KABEL_TYPE = eINSTANCE.getBezeichnung_Kabel_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung Kabel Verteilpunkt Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getBezeichnung_Kabel_Verteilpunkt_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE = eINSTANCE.getBezeichnung_Kabel_Verteilpunkt_Type();

		/**
		 * The meta object literal for the '<em>ENUM Kabel Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelArt
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMKabelArtObject()
		 * @generated
		 */
		EDataType ENUM_KABEL_ART_OBJECT = eINSTANCE.getENUMKabelArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Kabel Verteilpunkt Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelVerteilpunktArt
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMKabelVerteilpunktArtObject()
		 * @generated
		 */
		EDataType ENUM_KABEL_VERTEILPUNKT_ART_OBJECT = eINSTANCE.getENUMKabelVerteilpunktArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Trasse Kante Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKanteArt
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMTrasseKanteArtObject()
		 * @generated
		 */
		EDataType ENUM_TRASSE_KANTE_ART_OBJECT = eINSTANCE.getENUMTrasseKanteArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Trasse Knoten Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKnotenArt
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMTrasseKnotenArtObject()
		 * @generated
		 */
		EDataType ENUM_TRASSE_KNOTEN_ART_OBJECT = eINSTANCE.getENUMTrasseKnotenArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Trasse Nutzer Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseNutzer
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getENUMTrasseNutzerObject()
		 * @generated
		 */
		EDataType ENUM_TRASSE_NUTZER_OBJECT = eINSTANCE.getENUMTrasseNutzerObject();

		/**
		 * The meta object literal for the '<em>Induktionsschutz Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getInduktionsschutz_Type()
		 * @generated
		 */
		EDataType INDUKTIONSSCHUTZ_TYPE = eINSTANCE.getInduktionsschutz_Type();

		/**
		 * The meta object literal for the '<em>Kabel Laenge Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Laenge_Type()
		 * @generated
		 */
		EDataType KABEL_LAENGE_TYPE = eINSTANCE.getKabel_Laenge_Type();

		/**
		 * The meta object literal for the '<em>Kabel Typ Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getKabel_Typ_Type()
		 * @generated
		 */
		EDataType KABEL_TYP_TYPE = eINSTANCE.getKabel_Typ_Type();

		/**
		 * The meta object literal for the '<em>Verseilart Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl#getVerseilart_Type()
		 * @generated
		 */
		EDataType VERSEILART_TYPE = eINSTANCE.getVerseilart_Type();

	}

} //Medien_und_TrassenPackage
