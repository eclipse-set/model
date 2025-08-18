/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale;

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
 * @see org.eclipse.set.model.planpro.Signale.SignaleFactory
 * @model kind="package"
 * @generated
 */
public interface SignalePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Signale";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Signale/1.10.0.3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsSignale";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SignalePackage eINSTANCE = org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Anschaltdauer_TypeClassImpl <em>Anschaltdauer Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Anschaltdauer_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getAnschaltdauer_TypeClass()
	 * @generated
	 */
	int ANSCHALTDAUER_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHALTDAUER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHALTDAUER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anschaltdauer Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHALTDAUER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Auto_Einstellung_TypeClassImpl <em>Auto Einstellung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Auto_Einstellung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getAuto_Einstellung_TypeClass()
	 * @generated
	 */
	int AUTO_EINSTELLUNG_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_EINSTELLUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_EINSTELLUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auto Einstellung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_EINSTELLUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Befestigung_Art_TypeClassImpl <em>Befestigung Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Befestigung_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getBefestigung_Art_TypeClass()
	 * @generated
	 */
	int BEFESTIGUNG_ART_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFESTIGUNG_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFESTIGUNG_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Befestigung Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFESTIGUNG_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Beleuchtet_TypeClassImpl <em>Beleuchtet Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Beleuchtet_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getBeleuchtet_TypeClass()
	 * @generated
	 */
	int BELEUCHTET_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELEUCHTET_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELEUCHTET_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Beleuchtet Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELEUCHTET_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Besetzte_Ausfahrt_TypeClassImpl <em>Besetzte Ausfahrt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Besetzte_Ausfahrt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getBesetzte_Ausfahrt_TypeClass()
	 * @generated
	 */
	int BESETZTE_AUSFAHRT_TYPE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESETZTE_AUSFAHRT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESETZTE_AUSFAHRT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Besetzte Ausfahrt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESETZTE_AUSFAHRT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.DA_Manuell_TypeClassImpl <em>DA Manuell Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.DA_Manuell_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getDA_Manuell_TypeClass()
	 * @generated
	 */
	int DA_MANUELL_TYPE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_MANUELL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_MANUELL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DA Manuell Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_MANUELL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Dunkelschaltung_TypeClassImpl <em>Dunkelschaltung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Dunkelschaltung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getDunkelschaltung_TypeClass()
	 * @generated
	 */
	int DUNKELSCHALTUNG_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNKELSCHALTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNKELSCHALTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dunkelschaltung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNKELSCHALTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Durchfahrt_TypeClassImpl <em>Durchfahrt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Durchfahrt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getDurchfahrt_TypeClass()
	 * @generated
	 */
	int DURCHFAHRT_TYPE_CLASS = 7;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURCHFAHRT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURCHFAHRT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Durchfahrt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURCHFAHRT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Fiktives_Signal_Funktion_TypeClassImpl <em>Fiktives Signal Funktion Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Fiktives_Signal_Funktion_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getFiktives_Signal_Funktion_TypeClass()
	 * @generated
	 */
	int FIKTIVES_SIGNAL_FUNKTION_TYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIKTIVES_SIGNAL_FUNKTION_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIKTIVES_SIGNAL_FUNKTION_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fiktives Signal Funktion Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIKTIVES_SIGNAL_FUNKTION_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Fundament_Art_TypeClassImpl <em>Fundament Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Fundament_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getFundament_Art_TypeClass()
	 * @generated
	 */
	int FUNDAMENT_ART_TYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENT_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENT_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fundament Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENT_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Funktion_Ohne_Signal_TypeClassImpl <em>Funktion Ohne Signal Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Funktion_Ohne_Signal_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getFunktion_Ohne_Signal_TypeClass()
	 * @generated
	 */
	int FUNKTION_OHNE_SIGNAL_TYPE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNKTION_OHNE_SIGNAL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNKTION_OHNE_SIGNAL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Funktion Ohne Signal Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNKTION_OHNE_SIGNAL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Gegengleis_TypeClassImpl <em>Gegengleis Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Gegengleis_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getGegengleis_TypeClass()
	 * @generated
	 */
	int GEGENGLEIS_TYPE_CLASS = 11;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEGENGLEIS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEGENGLEIS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gegengleis Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEGENGLEIS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Geltungsbereich_TypeClassImpl <em>Geltungsbereich Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Geltungsbereich_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getGeltungsbereich_TypeClass()
	 * @generated
	 */
	int GELTUNGSBEREICH_TYPE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GELTUNGSBEREICH_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GELTUNGSBEREICH_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geltungsbereich Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GELTUNGSBEREICH_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Geschaltet_TypeClassImpl <em>Geschaltet Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Geschaltet_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getGeschaltet_TypeClass()
	 * @generated
	 */
	int GESCHALTET_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHALTET_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHALTET_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geschaltet Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHALTET_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Hoehe_Fundamentoberkante_TypeClassImpl <em>Hoehe Fundamentoberkante Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Hoehe_Fundamentoberkante_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getHoehe_Fundamentoberkante_TypeClass()
	 * @generated
	 */
	int HOEHE_FUNDAMENTOBERKANTE_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHE_FUNDAMENTOBERKANTE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHE_FUNDAMENTOBERKANTE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hoehe Fundamentoberkante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHE_FUNDAMENTOBERKANTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Obere_Lichtpunkthoehe_TypeClassImpl <em>Obere Lichtpunkthoehe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Obere_Lichtpunkthoehe_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getObere_Lichtpunkthoehe_TypeClass()
	 * @generated
	 */
	int OBERE_LICHTPUNKTHOEHE_TYPE_CLASS = 15;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBERE_LICHTPUNKTHOEHE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBERE_LICHTPUNKTHOEHE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Obere Lichtpunkthoehe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBERE_LICHTPUNKTHOEHE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.PZB_Schutzstrecke_Soll_TypeClassImpl <em>PZB Schutzstrecke Soll Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.PZB_Schutzstrecke_Soll_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getPZB_Schutzstrecke_Soll_TypeClass()
	 * @generated
	 */
	int PZB_SCHUTZSTRECKE_SOLL_TYPE_CLASS = 16;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_SCHUTZSTRECKE_SOLL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_SCHUTZSTRECKE_SOLL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PZB Schutzstrecke Soll Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_SCHUTZSTRECKE_SOLL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Rahmen_Art_TypeClassImpl <em>Rahmen Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Rahmen_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRahmen_Art_TypeClass()
	 * @generated
	 */
	int RAHMEN_ART_TYPE_CLASS = 17;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAHMEN_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAHMEN_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rahmen Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAHMEN_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Rahmen_Hoehe_TypeClassImpl <em>Rahmen Hoehe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Rahmen_Hoehe_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRahmen_Hoehe_TypeClass()
	 * @generated
	 */
	int RAHMEN_HOEHE_TYPE_CLASS = 18;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAHMEN_HOEHE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAHMEN_HOEHE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rahmen Hoehe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAHMEN_HOEHE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Rangierstrasse_Restaufloesung_TypeClassImpl <em>Rangierstrasse Restaufloesung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Rangierstrasse_Restaufloesung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRangierstrasse_Restaufloesung_TypeClass()
	 * @generated
	 */
	int RANGIERSTRASSE_RESTAUFLOESUNG_TYPE_CLASS = 19;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGIERSTRASSE_RESTAUFLOESUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGIERSTRASSE_RESTAUFLOESUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rangierstrasse Restaufloesung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGIERSTRASSE_RESTAUFLOESUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Richtpunkt_TypeClassImpl <em>Richtpunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Richtpunkt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRichtpunkt_TypeClass()
	 * @generated
	 */
	int RICHTPUNKT_TYPE_CLASS = 20;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICHTPUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICHTPUNKT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Richtpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICHTPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Richtpunktentfernung_TypeClassImpl <em>Richtpunktentfernung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Richtpunktentfernung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRichtpunktentfernung_TypeClass()
	 * @generated
	 */
	int RICHTPUNKTENTFERNUNG_TYPE_CLASS = 21;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICHTPUNKTENTFERNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICHTPUNKTENTFERNUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Richtpunktentfernung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICHTPUNKTENTFERNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 22;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.PUNKT_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__BEZEICHNUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PZB Schutzstrecke Soll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__PZB_SCHUTZSTRECKE_SOLL = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signal Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SIGNAL_FSTR = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signal Fstr Aus Inselgleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Signal Fstr S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SIGNAL_FSTR_S = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Signal Fiktiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SIGNAL_FIKTIV = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Signal Real</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SIGNAL_REAL = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Art_TypeClassImpl <em>Signal Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Art_TypeClass()
	 * @generated
	 */
	int SIGNAL_ART_TYPE_CLASS = 23;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_BefestigungImpl <em>Signal Befestigung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_BefestigungImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Befestigung()
	 * @generated
	 */
	int SIGNAL_BEFESTIGUNG = 24;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.PUNKT_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>ID Regelzeichnung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Befestigung Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Befestigung Bauwerk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG__ID_BEFESTIGUNG_BAUWERK = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID Signal Befestigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Signal Befestigung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Befestigung_Allg_AttributeGroupImpl <em>Signal Befestigung Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Befestigung_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Befestigung_Allg_AttributeGroup()
	 * @generated
	 */
	int SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP = 25;

	/**
	 * The feature id for the '<em><b>Befestigung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__BEFESTIGUNG_ART = 0;

	/**
	 * The feature id for the '<em><b>Fundament Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__FUNDAMENT_ART = 1;

	/**
	 * The feature id for the '<em><b>Hoehe Fundamentoberkante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__HOEHE_FUNDAMENTOBERKANTE = 2;

	/**
	 * The feature id for the '<em><b>Obere Lichtpunkthoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__OBERE_LICHTPUNKTHOEHE = 3;

	/**
	 * The number of structural features of the '<em>Signal Befestigung Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Befestigungsart_TypeClassImpl <em>Signal Befestigungsart Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Befestigungsart_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Befestigungsart_TypeClass()
	 * @generated
	 */
	int SIGNAL_BEFESTIGUNGSART_TYPE_CLASS = 26;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNGSART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNGSART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal Befestigungsart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_BEFESTIGUNGSART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fank_ZuordnungImpl <em>Signal Fank Zuordnung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Fank_ZuordnungImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Fank_Zuordnung()
	 * @generated
	 */
	int SIGNAL_FANK_ZUORDNUNG = 27;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FANK_ZUORDNUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FANK_ZUORDNUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FANK_ZUORDNUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FANK_ZUORDNUNG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FANK_ZUORDNUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Signal Fank</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Signal Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal Fank Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FANK_ZUORDNUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fiktiv_AttributeGroupImpl <em>Signal Fiktiv Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Fiktiv_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Fiktiv_AttributeGroup()
	 * @generated
	 */
	int SIGNAL_FIKTIV_ATTRIBUTE_GROUP = 28;

	/**
	 * The feature id for the '<em><b>Auto Einstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FIKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG = 0;

	/**
	 * The feature id for the '<em><b>Fiktives Signal Funktion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FIKTIV_ATTRIBUTE_GROUP__FIKTIVES_SIGNAL_FUNKTION = 1;

	/**
	 * The number of structural features of the '<em>Signal Fiktiv Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FIKTIV_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_AttributeGroupImpl <em>Signal Fstr Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Fstr_AttributeGroup()
	 * @generated
	 */
	int SIGNAL_FSTR_ATTRIBUTE_GROUP = 29;

	/**
	 * The feature id for the '<em><b>Besetzte Ausfahrt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FSTR_ATTRIBUTE_GROUP__BESETZTE_AUSFAHRT = 0;

	/**
	 * The feature id for the '<em><b>DA Manuell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FSTR_ATTRIBUTE_GROUP__DA_MANUELL = 1;

	/**
	 * The feature id for the '<em><b>Durchfahrt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FSTR_ATTRIBUTE_GROUP__DURCHFAHRT = 2;

	/**
	 * The feature id for the '<em><b>ID Ra Ziel Erlaubnisabhaengig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FSTR_ATTRIBUTE_GROUP__ID_RA_ZIEL_ERLAUBNISABHAENGIG = 3;

	/**
	 * The feature id for the '<em><b>Rangierstrasse Restaufloesung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FSTR_ATTRIBUTE_GROUP__RANGIERSTRASSE_RESTAUFLOESUNG = 4;

	/**
	 * The number of structural features of the '<em>Signal Fstr Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FSTR_ATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl <em>Signal Fstr Aus Inselgleis Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Fstr_Aus_Inselgleis_AttributeGroup()
	 * @generated
	 */
	int SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP = 30;

	/**
	 * The feature id for the '<em><b>ID Ra Fahrt Gleichzeitig Verbot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT = 0;

	/**
	 * The feature id for the '<em><b>ID Zg Fahrt Gleichzeitig Verbot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT = 1;

	/**
	 * The number of structural features of the '<em>Signal Fstr Aus Inselgleis Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_S_AttributeGroupImpl <em>Signal Fstr SAttribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_S_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Fstr_S_AttributeGroup()
	 * @generated
	 */
	int SIGNAL_FSTR_SATTRIBUTE_GROUP = 31;

	/**
	 * The feature id for the '<em><b>Gegengleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS = 0;

	/**
	 * The feature id for the '<em><b>ID Anrueckverschluss</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS = 1;

	/**
	 * The feature id for the '<em><b>ID Zweites Haltfallkriterium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM = 2;

	/**
	 * The number of structural features of the '<em>Signal Fstr SAttribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FSTR_SATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Funktion_TypeClassImpl <em>Signal Funktion Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Funktion_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Funktion_TypeClass()
	 * @generated
	 */
	int SIGNAL_FUNKTION_TYPE_CLASS = 32;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNKTION_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNKTION_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal Funktion Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNKTION_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_RahmenImpl <em>Signal Rahmen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_RahmenImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Rahmen()
	 * @generated
	 */
	int SIGNAL_RAHMEN = 33;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RAHMEN__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RAHMEN__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RAHMEN__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RAHMEN__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RAHMEN__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Regelzeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RAHMEN__ID_REGELZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RAHMEN__ID_SIGNAL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Signal Befestigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID Signal Nachordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rahmen Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RAHMEN__RAHMEN_ART = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rahmen Hoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RAHMEN__RAHMEN_HOEHE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Signal Rahmen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_RAHMEN_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl <em>Signal Real Aktiv Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Real_Aktiv_AttributeGroup()
	 * @generated
	 */
	int SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP = 34;

	/**
	 * The feature id for the '<em><b>Auto Einstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG = 0;

	/**
	 * The feature id for the '<em><b>ID Stellelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__ID_STELLELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Sonstige Zulaessige Anordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SONSTIGE_ZULAESSIGE_ANORDNUNG = 2;

	/**
	 * The feature id for the '<em><b>Tunnelsignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__TUNNELSIGNAL = 3;

	/**
	 * The number of structural features of the '<em>Signal Real Aktiv Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_Schirm_AttributeGroupImpl <em>Signal Real Aktiv Schirm Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_Schirm_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Real_Aktiv_Schirm_AttributeGroup()
	 * @generated
	 */
	int SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP = 35;

	/**
	 * The feature id for the '<em><b>Richtpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKT = 0;

	/**
	 * The feature id for the '<em><b>Richtpunktentfernung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKTENTFERNUNG = 1;

	/**
	 * The feature id for the '<em><b>Signal Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNAL_ART = 2;

	/**
	 * The feature id for the '<em><b>Signalsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNALSYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Streuscheibe Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_ART = 4;

	/**
	 * The feature id for the '<em><b>Streuscheibe Betriebsstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_BETRIEBSSTELLUNG = 5;

	/**
	 * The number of structural features of the '<em>Signal Real Aktiv Schirm Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Real_AttributeGroupImpl <em>Signal Real Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Real_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Real_AttributeGroup()
	 * @generated
	 */
	int SIGNAL_REAL_ATTRIBUTE_GROUP = 36;

	/**
	 * The feature id for the '<em><b>Dunkelschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_ATTRIBUTE_GROUP__DUNKELSCHALTUNG = 0;

	/**
	 * The feature id for the '<em><b>Funktion Ohne Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_ATTRIBUTE_GROUP__FUNKTION_OHNE_SIGNAL = 1;

	/**
	 * The feature id for the '<em><b>Geltungsbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH = 2;

	/**
	 * The feature id for the '<em><b>Signal Befestigungsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART = 3;

	/**
	 * The feature id for the '<em><b>Signal Funktion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_FUNKTION = 4;

	/**
	 * The feature id for the '<em><b>Signal Real Aktiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV = 5;

	/**
	 * The feature id for the '<em><b>Signal Real Aktiv Schirm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM = 6;

	/**
	 * The feature id for the '<em><b>Signalsicht Erreichbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR = 7;

	/**
	 * The feature id for the '<em><b>Signalsicht Mindest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST = 8;

	/**
	 * The feature id for the '<em><b>Signalsicht Soll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL = 9;

	/**
	 * The number of structural features of the '<em>Signal Real Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_REAL_ATTRIBUTE_GROUP_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_SignalbegriffImpl <em>Signal Signalbegriff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_SignalbegriffImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Signalbegriff()
	 * @generated
	 */
	int SIGNAL_SIGNALBEGRIFF = 37;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Signal Rahmen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Signalbegriff Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signalbegriff ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Signal Signalbegriff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Signalbegriff_Allg_AttributeGroupImpl <em>Signal Signalbegriff Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Signalbegriff_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Signalbegriff_Allg_AttributeGroup()
	 * @generated
	 */
	int SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP = 38;

	/**
	 * The feature id for the '<em><b>Anschaltdauer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ANSCHALTDAUER = 0;

	/**
	 * The feature id for the '<em><b>Beleuchtet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__BELEUCHTET = 1;

	/**
	 * The feature id for the '<em><b>Geschaltet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__GESCHALTET = 2;

	/**
	 * The feature id for the '<em><b>Zs2 Ueberwacht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ZS2_UEBERWACHT = 3;

	/**
	 * The number of structural features of the '<em>Signal Signalbegriff Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signalsicht_Erreichbar_TypeClassImpl <em>Signalsicht Erreichbar Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signalsicht_Erreichbar_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsicht_Erreichbar_TypeClass()
	 * @generated
	 */
	int SIGNALSICHT_ERREICHBAR_TYPE_CLASS = 39;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALSICHT_ERREICHBAR_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALSICHT_ERREICHBAR_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signalsicht Erreichbar Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALSICHT_ERREICHBAR_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signalsicht_Mindest_TypeClassImpl <em>Signalsicht Mindest Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signalsicht_Mindest_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsicht_Mindest_TypeClass()
	 * @generated
	 */
	int SIGNALSICHT_MINDEST_TYPE_CLASS = 40;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALSICHT_MINDEST_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALSICHT_MINDEST_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signalsicht Mindest Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALSICHT_MINDEST_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signalsicht_Soll_TypeClassImpl <em>Signalsicht Soll Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signalsicht_Soll_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsicht_Soll_TypeClass()
	 * @generated
	 */
	int SIGNALSICHT_SOLL_TYPE_CLASS = 41;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALSICHT_SOLL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALSICHT_SOLL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signalsicht Soll Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALSICHT_SOLL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signalsystem_TypeClassImpl <em>Signalsystem Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Signalsystem_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsystem_TypeClass()
	 * @generated
	 */
	int SIGNALSYSTEM_TYPE_CLASS = 42;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALSYSTEM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALSYSTEM_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signalsystem Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALSYSTEM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Sonstige_Zulaessige_Anordnung_TypeClassImpl <em>Sonstige Zulaessige Anordnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Sonstige_Zulaessige_Anordnung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSonstige_Zulaessige_Anordnung_TypeClass()
	 * @generated
	 */
	int SONSTIGE_ZULAESSIGE_ANORDNUNG_TYPE_CLASS = 43;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_ZULAESSIGE_ANORDNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_ZULAESSIGE_ANORDNUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sonstige Zulaessige Anordnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_ZULAESSIGE_ANORDNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Streuscheibe_Art_TypeClassImpl <em>Streuscheibe Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Streuscheibe_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getStreuscheibe_Art_TypeClass()
	 * @generated
	 */
	int STREUSCHEIBE_ART_TYPE_CLASS = 44;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREUSCHEIBE_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREUSCHEIBE_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Streuscheibe Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREUSCHEIBE_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Streuscheibe_Betriebsstellung_TypeClassImpl <em>Streuscheibe Betriebsstellung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Streuscheibe_Betriebsstellung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getStreuscheibe_Betriebsstellung_TypeClass()
	 * @generated
	 */
	int STREUSCHEIBE_BETRIEBSSTELLUNG_TYPE_CLASS = 45;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREUSCHEIBE_BETRIEBSSTELLUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREUSCHEIBE_BETRIEBSSTELLUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Streuscheibe Betriebsstellung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREUSCHEIBE_BETRIEBSSTELLUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Tunnelsignal_TypeClassImpl <em>Tunnelsignal Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Tunnelsignal_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getTunnelsignal_TypeClass()
	 * @generated
	 */
	int TUNNELSIGNAL_TYPE_CLASS = 46;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNNELSIGNAL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNNELSIGNAL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tunnelsignal Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNNELSIGNAL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.impl.Zs2_Ueberwacht_TypeClassImpl <em>Zs2 Ueberwacht Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.impl.Zs2_Ueberwacht_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getZs2_Ueberwacht_TypeClass()
	 * @generated
	 */
	int ZS2_UEBERWACHT_TYPE_CLASS = 47;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2_UEBERWACHT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2_UEBERWACHT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zs2 Ueberwacht Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2_UEBERWACHT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMAnschaltdauer <em>ENUM Anschaltdauer</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMAnschaltdauer
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMAnschaltdauer()
	 * @generated
	 */
	int ENUM_ANSCHALTDAUER = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMAutoEinstellung <em>ENUM Auto Einstellung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMAutoEinstellung
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMAutoEinstellung()
	 * @generated
	 */
	int ENUM_AUTO_EINSTELLUNG = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMBefestigungArt <em>ENUM Befestigung Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMBefestigungArt
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMBefestigungArt()
	 * @generated
	 */
	int ENUM_BEFESTIGUNG_ART = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMBeleuchtet <em>ENUM Beleuchtet</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMBeleuchtet
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMBeleuchtet()
	 * @generated
	 */
	int ENUM_BELEUCHTET = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMDurchfahrt <em>ENUM Durchfahrt</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMDurchfahrt
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMDurchfahrt()
	 * @generated
	 */
	int ENUM_DURCHFAHRT = 52;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMFiktivesSignalFunktion <em>ENUM Fiktives Signal Funktion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMFiktivesSignalFunktion
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMFiktivesSignalFunktion()
	 * @generated
	 */
	int ENUM_FIKTIVES_SIGNAL_FUNKTION = 53;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMFundamentArt <em>ENUM Fundament Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMFundamentArt
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMFundamentArt()
	 * @generated
	 */
	int ENUM_FUNDAMENT_ART = 54;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMFunktionOhneSignal <em>ENUM Funktion Ohne Signal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMFunktionOhneSignal
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMFunktionOhneSignal()
	 * @generated
	 */
	int ENUM_FUNKTION_OHNE_SIGNAL = 55;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMGeltungsbereich <em>ENUM Geltungsbereich</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMGeltungsbereich
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMGeltungsbereich()
	 * @generated
	 */
	int ENUM_GELTUNGSBEREICH = 56;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMRahmenArt <em>ENUM Rahmen Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMRahmenArt
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMRahmenArt()
	 * @generated
	 */
	int ENUM_RAHMEN_ART = 57;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalArt <em>ENUM Signal Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalArt
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalArt()
	 * @generated
	 */
	int ENUM_SIGNAL_ART = 58;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalBefestigungsart <em>ENUM Signal Befestigungsart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalBefestigungsart
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalBefestigungsart()
	 * @generated
	 */
	int ENUM_SIGNAL_BEFESTIGUNGSART = 59;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalFunktion <em>ENUM Signal Funktion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalFunktion
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalFunktion()
	 * @generated
	 */
	int ENUM_SIGNAL_FUNKTION = 60;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalsystem <em>ENUM Signalsystem</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalsystem
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalsystem()
	 * @generated
	 */
	int ENUM_SIGNALSYSTEM = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMSonstigeZulaessigeAnordnung <em>ENUM Sonstige Zulaessige Anordnung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSonstigeZulaessigeAnordnung
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSonstigeZulaessigeAnordnung()
	 * @generated
	 */
	int ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG = 62;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeArt <em>ENUM Streuscheibe Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeArt
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMStreuscheibeArt()
	 * @generated
	 */
	int ENUM_STREUSCHEIBE_ART = 63;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeBetriebsstellung <em>ENUM Streuscheibe Betriebsstellung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeBetriebsstellung
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMStreuscheibeBetriebsstellung()
	 * @generated
	 */
	int ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG = 64;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signale.ENUMTunnelsignal <em>ENUM Tunnelsignal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMTunnelsignal
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMTunnelsignal()
	 * @generated
	 */
	int ENUM_TUNNELSIGNAL = 65;

	/**
	 * The meta object id for the '<em>ENUM Anschaltdauer Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMAnschaltdauer
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMAnschaltdauerObject()
	 * @generated
	 */
	int ENUM_ANSCHALTDAUER_OBJECT = 66;

	/**
	 * The meta object id for the '<em>ENUM Auto Einstellung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMAutoEinstellung
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMAutoEinstellungObject()
	 * @generated
	 */
	int ENUM_AUTO_EINSTELLUNG_OBJECT = 67;

	/**
	 * The meta object id for the '<em>ENUM Befestigung Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMBefestigungArt
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMBefestigungArtObject()
	 * @generated
	 */
	int ENUM_BEFESTIGUNG_ART_OBJECT = 68;

	/**
	 * The meta object id for the '<em>ENUM Beleuchtet Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMBeleuchtet
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMBeleuchtetObject()
	 * @generated
	 */
	int ENUM_BELEUCHTET_OBJECT = 69;

	/**
	 * The meta object id for the '<em>ENUM Durchfahrt Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMDurchfahrt
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMDurchfahrtObject()
	 * @generated
	 */
	int ENUM_DURCHFAHRT_OBJECT = 70;

	/**
	 * The meta object id for the '<em>ENUM Fiktives Signal Funktion Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMFiktivesSignalFunktion
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMFiktivesSignalFunktionObject()
	 * @generated
	 */
	int ENUM_FIKTIVES_SIGNAL_FUNKTION_OBJECT = 71;

	/**
	 * The meta object id for the '<em>ENUM Fundament Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMFundamentArt
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMFundamentArtObject()
	 * @generated
	 */
	int ENUM_FUNDAMENT_ART_OBJECT = 72;

	/**
	 * The meta object id for the '<em>ENUM Funktion Ohne Signal Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMFunktionOhneSignal
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMFunktionOhneSignalObject()
	 * @generated
	 */
	int ENUM_FUNKTION_OHNE_SIGNAL_OBJECT = 73;

	/**
	 * The meta object id for the '<em>ENUM Geltungsbereich Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMGeltungsbereich
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMGeltungsbereichObject()
	 * @generated
	 */
	int ENUM_GELTUNGSBEREICH_OBJECT = 74;

	/**
	 * The meta object id for the '<em>ENUM Rahmen Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMRahmenArt
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMRahmenArtObject()
	 * @generated
	 */
	int ENUM_RAHMEN_ART_OBJECT = 75;

	/**
	 * The meta object id for the '<em>ENUM Signal Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalArt
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalArtObject()
	 * @generated
	 */
	int ENUM_SIGNAL_ART_OBJECT = 76;

	/**
	 * The meta object id for the '<em>ENUM Signal Befestigungsart Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalBefestigungsart
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalBefestigungsartObject()
	 * @generated
	 */
	int ENUM_SIGNAL_BEFESTIGUNGSART_OBJECT = 77;

	/**
	 * The meta object id for the '<em>ENUM Signal Funktion Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalFunktion
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalFunktionObject()
	 * @generated
	 */
	int ENUM_SIGNAL_FUNKTION_OBJECT = 78;

	/**
	 * The meta object id for the '<em>ENUM Signalsystem Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalsystem
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalsystemObject()
	 * @generated
	 */
	int ENUM_SIGNALSYSTEM_OBJECT = 79;

	/**
	 * The meta object id for the '<em>ENUM Sonstige Zulaessige Anordnung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSonstigeZulaessigeAnordnung
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSonstigeZulaessigeAnordnungObject()
	 * @generated
	 */
	int ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG_OBJECT = 80;

	/**
	 * The meta object id for the '<em>ENUM Streuscheibe Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeArt
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMStreuscheibeArtObject()
	 * @generated
	 */
	int ENUM_STREUSCHEIBE_ART_OBJECT = 81;

	/**
	 * The meta object id for the '<em>ENUM Streuscheibe Betriebsstellung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeBetriebsstellung
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMStreuscheibeBetriebsstellungObject()
	 * @generated
	 */
	int ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_OBJECT = 82;

	/**
	 * The meta object id for the '<em>ENUM Tunnelsignal Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signale.ENUMTunnelsignal
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMTunnelsignalObject()
	 * @generated
	 */
	int ENUM_TUNNELSIGNAL_OBJECT = 83;

	/**
	 * The meta object id for the '<em>Hoehe Fundamentoberkante Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getHoehe_Fundamentoberkante_Type()
	 * @generated
	 */
	int HOEHE_FUNDAMENTOBERKANTE_TYPE = 84;

	/**
	 * The meta object id for the '<em>Obere Lichtpunkthoehe Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getObere_Lichtpunkthoehe_Type()
	 * @generated
	 */
	int OBERE_LICHTPUNKTHOEHE_TYPE = 85;

	/**
	 * The meta object id for the '<em>PZB Schutzstrecke Soll Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getPZB_Schutzstrecke_Soll_Type()
	 * @generated
	 */
	int PZB_SCHUTZSTRECKE_SOLL_TYPE = 86;

	/**
	 * The meta object id for the '<em>Rahmen Hoehe Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRahmen_Hoehe_Type()
	 * @generated
	 */
	int RAHMEN_HOEHE_TYPE = 87;

	/**
	 * The meta object id for the '<em>Richtpunkt Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRichtpunkt_Type()
	 * @generated
	 */
	int RICHTPUNKT_TYPE = 88;

	/**
	 * The meta object id for the '<em>Richtpunktentfernung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRichtpunktentfernung_Type()
	 * @generated
	 */
	int RICHTPUNKTENTFERNUNG_TYPE = 89;

	/**
	 * The meta object id for the '<em>Signalsicht Erreichbar Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsicht_Erreichbar_Type()
	 * @generated
	 */
	int SIGNALSICHT_ERREICHBAR_TYPE = 90;

	/**
	 * The meta object id for the '<em>Signalsicht Mindest Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsicht_Mindest_Type()
	 * @generated
	 */
	int SIGNALSICHT_MINDEST_TYPE = 91;

	/**
	 * The meta object id for the '<em>Signalsicht Soll Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsicht_Soll_Type()
	 * @generated
	 */
	int SIGNALSICHT_SOLL_TYPE = 92;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Anschaltdauer_TypeClass <em>Anschaltdauer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anschaltdauer Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Anschaltdauer_TypeClass
	 * @generated
	 */
	EClass getAnschaltdauer_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Anschaltdauer_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Anschaltdauer_TypeClass#getWert()
	 * @see #getAnschaltdauer_TypeClass()
	 * @generated
	 */
	EAttribute getAnschaltdauer_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Auto_Einstellung_TypeClass <em>Auto Einstellung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Einstellung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Auto_Einstellung_TypeClass
	 * @generated
	 */
	EClass getAuto_Einstellung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Auto_Einstellung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Auto_Einstellung_TypeClass#getWert()
	 * @see #getAuto_Einstellung_TypeClass()
	 * @generated
	 */
	EAttribute getAuto_Einstellung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Befestigung_Art_TypeClass <em>Befestigung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Befestigung Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Befestigung_Art_TypeClass
	 * @generated
	 */
	EClass getBefestigung_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Befestigung_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Befestigung_Art_TypeClass#getWert()
	 * @see #getBefestigung_Art_TypeClass()
	 * @generated
	 */
	EAttribute getBefestigung_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Beleuchtet_TypeClass <em>Beleuchtet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beleuchtet Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Beleuchtet_TypeClass
	 * @generated
	 */
	EClass getBeleuchtet_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Beleuchtet_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Beleuchtet_TypeClass#getWert()
	 * @see #getBeleuchtet_TypeClass()
	 * @generated
	 */
	EAttribute getBeleuchtet_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Besetzte_Ausfahrt_TypeClass <em>Besetzte Ausfahrt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Besetzte Ausfahrt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Besetzte_Ausfahrt_TypeClass
	 * @generated
	 */
	EClass getBesetzte_Ausfahrt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Besetzte_Ausfahrt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Besetzte_Ausfahrt_TypeClass#getWert()
	 * @see #getBesetzte_Ausfahrt_TypeClass()
	 * @generated
	 */
	EAttribute getBesetzte_Ausfahrt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.DA_Manuell_TypeClass <em>DA Manuell Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DA Manuell Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.DA_Manuell_TypeClass
	 * @generated
	 */
	EClass getDA_Manuell_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.DA_Manuell_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.DA_Manuell_TypeClass#getWert()
	 * @see #getDA_Manuell_TypeClass()
	 * @generated
	 */
	EAttribute getDA_Manuell_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Dunkelschaltung_TypeClass <em>Dunkelschaltung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dunkelschaltung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Dunkelschaltung_TypeClass
	 * @generated
	 */
	EClass getDunkelschaltung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Dunkelschaltung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Dunkelschaltung_TypeClass#getWert()
	 * @see #getDunkelschaltung_TypeClass()
	 * @generated
	 */
	EAttribute getDunkelschaltung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Durchfahrt_TypeClass <em>Durchfahrt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Durchfahrt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Durchfahrt_TypeClass
	 * @generated
	 */
	EClass getDurchfahrt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Durchfahrt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Durchfahrt_TypeClass#getWert()
	 * @see #getDurchfahrt_TypeClass()
	 * @generated
	 */
	EAttribute getDurchfahrt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Fiktives_Signal_Funktion_TypeClass <em>Fiktives Signal Funktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fiktives Signal Funktion Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Fiktives_Signal_Funktion_TypeClass
	 * @generated
	 */
	EClass getFiktives_Signal_Funktion_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Fiktives_Signal_Funktion_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Fiktives_Signal_Funktion_TypeClass#getWert()
	 * @see #getFiktives_Signal_Funktion_TypeClass()
	 * @generated
	 */
	EAttribute getFiktives_Signal_Funktion_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Fundament_Art_TypeClass <em>Fundament Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fundament Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Fundament_Art_TypeClass
	 * @generated
	 */
	EClass getFundament_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Fundament_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Fundament_Art_TypeClass#getWert()
	 * @see #getFundament_Art_TypeClass()
	 * @generated
	 */
	EAttribute getFundament_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Funktion_Ohne_Signal_TypeClass <em>Funktion Ohne Signal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funktion Ohne Signal Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Funktion_Ohne_Signal_TypeClass
	 * @generated
	 */
	EClass getFunktion_Ohne_Signal_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Funktion_Ohne_Signal_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Funktion_Ohne_Signal_TypeClass#getWert()
	 * @see #getFunktion_Ohne_Signal_TypeClass()
	 * @generated
	 */
	EAttribute getFunktion_Ohne_Signal_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Gegengleis_TypeClass <em>Gegengleis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gegengleis Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Gegengleis_TypeClass
	 * @generated
	 */
	EClass getGegengleis_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Gegengleis_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Gegengleis_TypeClass#getWert()
	 * @see #getGegengleis_TypeClass()
	 * @generated
	 */
	EAttribute getGegengleis_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Geltungsbereich_TypeClass <em>Geltungsbereich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geltungsbereich Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Geltungsbereich_TypeClass
	 * @generated
	 */
	EClass getGeltungsbereich_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Geltungsbereich_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Geltungsbereich_TypeClass#getWert()
	 * @see #getGeltungsbereich_TypeClass()
	 * @generated
	 */
	EAttribute getGeltungsbereich_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Geschaltet_TypeClass <em>Geschaltet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geschaltet Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Geschaltet_TypeClass
	 * @generated
	 */
	EClass getGeschaltet_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Geschaltet_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Geschaltet_TypeClass#getWert()
	 * @see #getGeschaltet_TypeClass()
	 * @generated
	 */
	EAttribute getGeschaltet_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Hoehe_Fundamentoberkante_TypeClass <em>Hoehe Fundamentoberkante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hoehe Fundamentoberkante Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Hoehe_Fundamentoberkante_TypeClass
	 * @generated
	 */
	EClass getHoehe_Fundamentoberkante_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Hoehe_Fundamentoberkante_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Hoehe_Fundamentoberkante_TypeClass#getWert()
	 * @see #getHoehe_Fundamentoberkante_TypeClass()
	 * @generated
	 */
	EAttribute getHoehe_Fundamentoberkante_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Obere_Lichtpunkthoehe_TypeClass <em>Obere Lichtpunkthoehe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obere Lichtpunkthoehe Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Obere_Lichtpunkthoehe_TypeClass
	 * @generated
	 */
	EClass getObere_Lichtpunkthoehe_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Obere_Lichtpunkthoehe_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Obere_Lichtpunkthoehe_TypeClass#getWert()
	 * @see #getObere_Lichtpunkthoehe_TypeClass()
	 * @generated
	 */
	EAttribute getObere_Lichtpunkthoehe_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.PZB_Schutzstrecke_Soll_TypeClass <em>PZB Schutzstrecke Soll Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PZB Schutzstrecke Soll Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.PZB_Schutzstrecke_Soll_TypeClass
	 * @generated
	 */
	EClass getPZB_Schutzstrecke_Soll_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.PZB_Schutzstrecke_Soll_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.PZB_Schutzstrecke_Soll_TypeClass#getWert()
	 * @see #getPZB_Schutzstrecke_Soll_TypeClass()
	 * @generated
	 */
	EAttribute getPZB_Schutzstrecke_Soll_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Rahmen_Art_TypeClass <em>Rahmen Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rahmen Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Rahmen_Art_TypeClass
	 * @generated
	 */
	EClass getRahmen_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Rahmen_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Rahmen_Art_TypeClass#getWert()
	 * @see #getRahmen_Art_TypeClass()
	 * @generated
	 */
	EAttribute getRahmen_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Rahmen_Hoehe_TypeClass <em>Rahmen Hoehe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rahmen Hoehe Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Rahmen_Hoehe_TypeClass
	 * @generated
	 */
	EClass getRahmen_Hoehe_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Rahmen_Hoehe_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Rahmen_Hoehe_TypeClass#getWert()
	 * @see #getRahmen_Hoehe_TypeClass()
	 * @generated
	 */
	EAttribute getRahmen_Hoehe_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Rangierstrasse_Restaufloesung_TypeClass <em>Rangierstrasse Restaufloesung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rangierstrasse Restaufloesung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Rangierstrasse_Restaufloesung_TypeClass
	 * @generated
	 */
	EClass getRangierstrasse_Restaufloesung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Rangierstrasse_Restaufloesung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Rangierstrasse_Restaufloesung_TypeClass#getWert()
	 * @see #getRangierstrasse_Restaufloesung_TypeClass()
	 * @generated
	 */
	EAttribute getRangierstrasse_Restaufloesung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Richtpunkt_TypeClass <em>Richtpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Richtpunkt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Richtpunkt_TypeClass
	 * @generated
	 */
	EClass getRichtpunkt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Richtpunkt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Richtpunkt_TypeClass#getWert()
	 * @see #getRichtpunkt_TypeClass()
	 * @generated
	 */
	EAttribute getRichtpunkt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Richtpunktentfernung_TypeClass <em>Richtpunktentfernung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Richtpunktentfernung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Richtpunktentfernung_TypeClass
	 * @generated
	 */
	EClass getRichtpunktentfernung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Richtpunktentfernung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Richtpunktentfernung_TypeClass#getWert()
	 * @see #getRichtpunktentfernung_TypeClass()
	 * @generated
	 */
	EAttribute getRichtpunktentfernung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal#getBezeichnung()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal#getPZBSchutzstreckeSoll <em>PZB Schutzstrecke Soll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PZB Schutzstrecke Soll</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal#getPZBSchutzstreckeSoll()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_PZBSchutzstreckeSoll();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal#getSignalFstr <em>Signal Fstr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Fstr</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal#getSignalFstr()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_SignalFstr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal#getSignalFstrAusInselgleis <em>Signal Fstr Aus Inselgleis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Fstr Aus Inselgleis</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal#getSignalFstrAusInselgleis()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_SignalFstrAusInselgleis();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal#getSignalFstrS <em>Signal Fstr S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Fstr S</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal#getSignalFstrS()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_SignalFstrS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal#getSignalFiktiv <em>Signal Fiktiv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Fiktiv</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal#getSignalFiktiv()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_SignalFiktiv();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal#getSignalReal <em>Signal Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Real</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal#getSignalReal()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_SignalReal();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Art_TypeClass <em>Signal Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Art_TypeClass
	 * @generated
	 */
	EClass getSignal_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Signal_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Art_TypeClass#getWert()
	 * @see #getSignal_Art_TypeClass()
	 * @generated
	 */
	EAttribute getSignal_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung <em>Signal Befestigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Befestigung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Befestigung
	 * @generated
	 */
	EClass getSignal_Befestigung();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getIDRegelzeichnung <em>ID Regelzeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Regelzeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getIDRegelzeichnung()
	 * @see #getSignal_Befestigung()
	 * @generated
	 */
	EReference getSignal_Befestigung_IDRegelzeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getSignalBefestigungAllg <em>Signal Befestigung Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Befestigung Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getSignalBefestigungAllg()
	 * @see #getSignal_Befestigung()
	 * @generated
	 */
	EReference getSignal_Befestigung_SignalBefestigungAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getIDBefestigungBauwerk <em>ID Befestigung Bauwerk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Befestigung Bauwerk</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getIDBefestigungBauwerk()
	 * @see #getSignal_Befestigung()
	 * @generated
	 */
	EReference getSignal_Befestigung_IDBefestigungBauwerk();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getIDSignalBefestigung <em>ID Signal Befestigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal Befestigung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getIDSignalBefestigung()
	 * @see #getSignal_Befestigung()
	 * @generated
	 */
	EReference getSignal_Befestigung_IDSignalBefestigung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup <em>Signal Befestigung Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Befestigung Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup
	 * @generated
	 */
	EClass getSignal_Befestigung_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getBefestigungArt <em>Befestigung Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Befestigung Art</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getBefestigungArt()
	 * @see #getSignal_Befestigung_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Befestigung_Allg_AttributeGroup_BefestigungArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getFundamentArt <em>Fundament Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fundament Art</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getFundamentArt()
	 * @see #getSignal_Befestigung_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Befestigung_Allg_AttributeGroup_FundamentArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getHoeheFundamentoberkante <em>Hoehe Fundamentoberkante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hoehe Fundamentoberkante</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getHoeheFundamentoberkante()
	 * @see #getSignal_Befestigung_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Befestigung_Allg_AttributeGroup_HoeheFundamentoberkante();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getObereLichtpunkthoehe <em>Obere Lichtpunkthoehe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obere Lichtpunkthoehe</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getObereLichtpunkthoehe()
	 * @see #getSignal_Befestigung_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Befestigung_Allg_AttributeGroup_ObereLichtpunkthoehe();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigungsart_TypeClass <em>Signal Befestigungsart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Befestigungsart Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Befestigungsart_TypeClass
	 * @generated
	 */
	EClass getSignal_Befestigungsart_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigungsart_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Befestigungsart_TypeClass#getWert()
	 * @see #getSignal_Befestigungsart_TypeClass()
	 * @generated
	 */
	EAttribute getSignal_Befestigungsart_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Fank_Zuordnung <em>Signal Fank Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Fank Zuordnung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fank_Zuordnung
	 * @generated
	 */
	EClass getSignal_Fank_Zuordnung();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Signale.Signal_Fank_Zuordnung#getIDSignalFank <em>ID Signal Fank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Signal Fank</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fank_Zuordnung#getIDSignalFank()
	 * @see #getSignal_Fank_Zuordnung()
	 * @generated
	 */
	EReference getSignal_Fank_Zuordnung_IDSignalFank();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Signale.Signal_Fank_Zuordnung#getIDSignalStart <em>ID Signal Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Signal Start</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fank_Zuordnung#getIDSignalStart()
	 * @see #getSignal_Fank_Zuordnung()
	 * @generated
	 */
	EReference getSignal_Fank_Zuordnung_IDSignalStart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Fiktiv_AttributeGroup <em>Signal Fiktiv Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Fiktiv Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fiktiv_AttributeGroup
	 * @generated
	 */
	EClass getSignal_Fiktiv_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Fiktiv_AttributeGroup#getAutoEinstellung <em>Auto Einstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Einstellung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fiktiv_AttributeGroup#getAutoEinstellung()
	 * @see #getSignal_Fiktiv_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Fiktiv_AttributeGroup_AutoEinstellung();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Signale.Signal_Fiktiv_AttributeGroup#getFiktivesSignalFunktion <em>Fiktives Signal Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fiktives Signal Funktion</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fiktiv_AttributeGroup#getFiktivesSignalFunktion()
	 * @see #getSignal_Fiktiv_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Fiktiv_AttributeGroup_FiktivesSignalFunktion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup <em>Signal Fstr Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Fstr Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup
	 * @generated
	 */
	EClass getSignal_Fstr_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getBesetzteAusfahrt <em>Besetzte Ausfahrt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Besetzte Ausfahrt</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getBesetzteAusfahrt()
	 * @see #getSignal_Fstr_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Fstr_AttributeGroup_BesetzteAusfahrt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getDAManuell <em>DA Manuell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DA Manuell</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getDAManuell()
	 * @see #getSignal_Fstr_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Fstr_AttributeGroup_DAManuell();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getDurchfahrt <em>Durchfahrt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Durchfahrt</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getDurchfahrt()
	 * @see #getSignal_Fstr_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Fstr_AttributeGroup_Durchfahrt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getIDRaZielErlaubnisabhaengig <em>ID Ra Ziel Erlaubnisabhaengig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Ra Ziel Erlaubnisabhaengig</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getIDRaZielErlaubnisabhaengig()
	 * @see #getSignal_Fstr_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Fstr_AttributeGroup_IDRaZielErlaubnisabhaengig();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getRangierstrasseRestaufloesung <em>Rangierstrasse Restaufloesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rangierstrasse Restaufloesung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getRangierstrasseRestaufloesung()
	 * @see #getSignal_Fstr_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Fstr_AttributeGroup_RangierstrasseRestaufloesung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup <em>Signal Fstr Aus Inselgleis Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Fstr Aus Inselgleis Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup
	 * @generated
	 */
	EClass getSignal_Fstr_Aus_Inselgleis_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup#getIDRaFahrtGleichzeitigVerbot <em>ID Ra Fahrt Gleichzeitig Verbot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Ra Fahrt Gleichzeitig Verbot</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup#getIDRaFahrtGleichzeitigVerbot()
	 * @see #getSignal_Fstr_Aus_Inselgleis_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDRaFahrtGleichzeitigVerbot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup#getIDZgFahrtGleichzeitigVerbot <em>ID Zg Fahrt Gleichzeitig Verbot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Zg Fahrt Gleichzeitig Verbot</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup#getIDZgFahrtGleichzeitigVerbot()
	 * @see #getSignal_Fstr_Aus_Inselgleis_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDZgFahrtGleichzeitigVerbot();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_S_AttributeGroup <em>Signal Fstr SAttribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Fstr SAttribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fstr_S_AttributeGroup
	 * @generated
	 */
	EClass getSignal_Fstr_S_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_S_AttributeGroup#getGegengleis <em>Gegengleis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gegengleis</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fstr_S_AttributeGroup#getGegengleis()
	 * @see #getSignal_Fstr_S_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Fstr_S_AttributeGroup_Gegengleis();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_S_AttributeGroup#getIDAnrueckverschluss <em>ID Anrueckverschluss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Anrueckverschluss</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fstr_S_AttributeGroup#getIDAnrueckverschluss()
	 * @see #getSignal_Fstr_S_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Fstr_S_AttributeGroup_IDAnrueckverschluss();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_S_AttributeGroup#getIDZweitesHaltfallkriterium <em>ID Zweites Haltfallkriterium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Zweites Haltfallkriterium</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Fstr_S_AttributeGroup#getIDZweitesHaltfallkriterium()
	 * @see #getSignal_Fstr_S_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Fstr_S_AttributeGroup_IDZweitesHaltfallkriterium();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Funktion_TypeClass <em>Signal Funktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Funktion Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Funktion_TypeClass
	 * @generated
	 */
	EClass getSignal_Funktion_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Signal_Funktion_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Funktion_TypeClass#getWert()
	 * @see #getSignal_Funktion_TypeClass()
	 * @generated
	 */
	EAttribute getSignal_Funktion_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen <em>Signal Rahmen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Rahmen</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Rahmen
	 * @generated
	 */
	EClass getSignal_Rahmen();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDRegelzeichnung <em>ID Regelzeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Regelzeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDRegelzeichnung()
	 * @see #getSignal_Rahmen()
	 * @generated
	 */
	EReference getSignal_Rahmen_IDRegelzeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDSignal <em>ID Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDSignal()
	 * @see #getSignal_Rahmen()
	 * @generated
	 */
	EReference getSignal_Rahmen_IDSignal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDSignalBefestigung <em>ID Signal Befestigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal Befestigung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDSignalBefestigung()
	 * @see #getSignal_Rahmen()
	 * @generated
	 */
	EReference getSignal_Rahmen_IDSignalBefestigung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDSignalNachordnung <em>ID Signal Nachordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal Nachordnung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDSignalNachordnung()
	 * @see #getSignal_Rahmen()
	 * @generated
	 */
	EReference getSignal_Rahmen_IDSignalNachordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getRahmenArt <em>Rahmen Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rahmen Art</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getRahmenArt()
	 * @see #getSignal_Rahmen()
	 * @generated
	 */
	EReference getSignal_Rahmen_RahmenArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getRahmenHoehe <em>Rahmen Hoehe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rahmen Hoehe</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getRahmenHoehe()
	 * @see #getSignal_Rahmen()
	 * @generated
	 */
	EReference getSignal_Rahmen_RahmenHoehe();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_AttributeGroup <em>Signal Real Aktiv Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Real Aktiv Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_AttributeGroup
	 * @generated
	 */
	EClass getSignal_Real_Aktiv_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_AttributeGroup#getAutoEinstellung <em>Auto Einstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Einstellung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_AttributeGroup#getAutoEinstellung()
	 * @see #getSignal_Real_Aktiv_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_Aktiv_AttributeGroup_AutoEinstellung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_AttributeGroup#getIDStellelement <em>ID Stellelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Stellelement</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_AttributeGroup#getIDStellelement()
	 * @see #getSignal_Real_Aktiv_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_Aktiv_AttributeGroup_IDStellelement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_AttributeGroup#getSonstigeZulaessigeAnordnung <em>Sonstige Zulaessige Anordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sonstige Zulaessige Anordnung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_AttributeGroup#getSonstigeZulaessigeAnordnung()
	 * @see #getSignal_Real_Aktiv_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_Aktiv_AttributeGroup_SonstigeZulaessigeAnordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_AttributeGroup#getTunnelsignal <em>Tunnelsignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tunnelsignal</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_AttributeGroup#getTunnelsignal()
	 * @see #getSignal_Real_Aktiv_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_Aktiv_AttributeGroup_Tunnelsignal();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup <em>Signal Real Aktiv Schirm Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Real Aktiv Schirm Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup
	 * @generated
	 */
	EClass getSignal_Real_Aktiv_Schirm_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getRichtpunkt <em>Richtpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Richtpunkt</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getRichtpunkt()
	 * @see #getSignal_Real_Aktiv_Schirm_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getRichtpunktentfernung <em>Richtpunktentfernung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Richtpunktentfernung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getRichtpunktentfernung()
	 * @see #getSignal_Real_Aktiv_Schirm_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunktentfernung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getSignalArt <em>Signal Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Art</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getSignalArt()
	 * @see #getSignal_Real_Aktiv_Schirm_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_Aktiv_Schirm_AttributeGroup_SignalArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getSignalsystem <em>Signalsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signalsystem</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getSignalsystem()
	 * @see #getSignal_Real_Aktiv_Schirm_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_Aktiv_Schirm_AttributeGroup_Signalsystem();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getStreuscheibeArt <em>Streuscheibe Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Streuscheibe Art</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getStreuscheibeArt()
	 * @see #getSignal_Real_Aktiv_Schirm_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getStreuscheibeBetriebsstellung <em>Streuscheibe Betriebsstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Streuscheibe Betriebsstellung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getStreuscheibeBetriebsstellung()
	 * @see #getSignal_Real_Aktiv_Schirm_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeBetriebsstellung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup <em>Signal Real Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Real Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup
	 * @generated
	 */
	EClass getSignal_Real_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getDunkelschaltung <em>Dunkelschaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dunkelschaltung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getDunkelschaltung()
	 * @see #getSignal_Real_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_AttributeGroup_Dunkelschaltung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getFunktionOhneSignal <em>Funktion Ohne Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Funktion Ohne Signal</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getFunktionOhneSignal()
	 * @see #getSignal_Real_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_AttributeGroup_FunktionOhneSignal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getGeltungsbereich <em>Geltungsbereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geltungsbereich</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getGeltungsbereich()
	 * @see #getSignal_Real_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_AttributeGroup_Geltungsbereich();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalBefestigungsart <em>Signal Befestigungsart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Befestigungsart</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalBefestigungsart()
	 * @see #getSignal_Real_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_AttributeGroup_SignalBefestigungsart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalFunktion <em>Signal Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Funktion</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalFunktion()
	 * @see #getSignal_Real_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_AttributeGroup_SignalFunktion();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalRealAktiv <em>Signal Real Aktiv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Real Aktiv</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalRealAktiv()
	 * @see #getSignal_Real_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_AttributeGroup_SignalRealAktiv();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalRealAktivSchirm <em>Signal Real Aktiv Schirm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Real Aktiv Schirm</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalRealAktivSchirm()
	 * @see #getSignal_Real_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_AttributeGroup_SignalRealAktivSchirm();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalsichtErreichbar <em>Signalsicht Erreichbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signalsicht Erreichbar</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalsichtErreichbar()
	 * @see #getSignal_Real_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_AttributeGroup_SignalsichtErreichbar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalsichtMindest <em>Signalsicht Mindest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signalsicht Mindest</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalsichtMindest()
	 * @see #getSignal_Real_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_AttributeGroup_SignalsichtMindest();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalsichtSoll <em>Signalsicht Soll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signalsicht Soll</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalsichtSoll()
	 * @see #getSignal_Real_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Real_AttributeGroup_SignalsichtSoll();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff <em>Signal Signalbegriff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Signalbegriff</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff
	 * @generated
	 */
	EClass getSignal_Signalbegriff();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff#getIDSignalRahmen <em>ID Signal Rahmen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal Rahmen</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff#getIDSignalRahmen()
	 * @see #getSignal_Signalbegriff()
	 * @generated
	 */
	EReference getSignal_Signalbegriff_IDSignalRahmen();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff#getSignalSignalbegriffAllg <em>Signal Signalbegriff Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Signalbegriff Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff#getSignalSignalbegriffAllg()
	 * @see #getSignal_Signalbegriff()
	 * @generated
	 */
	EReference getSignal_Signalbegriff_SignalSignalbegriffAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff#getSignalbegriffID <em>Signalbegriff ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signalbegriff ID</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff#getSignalbegriffID()
	 * @see #getSignal_Signalbegriff()
	 * @generated
	 */
	EReference getSignal_Signalbegriff_SignalbegriffID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup <em>Signal Signalbegriff Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Signalbegriff Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup
	 * @generated
	 */
	EClass getSignal_Signalbegriff_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getAnschaltdauer <em>Anschaltdauer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschaltdauer</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getAnschaltdauer()
	 * @see #getSignal_Signalbegriff_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Signalbegriff_Allg_AttributeGroup_Anschaltdauer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getBeleuchtet <em>Beleuchtet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beleuchtet</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getBeleuchtet()
	 * @see #getSignal_Signalbegriff_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Signalbegriff_Allg_AttributeGroup_Beleuchtet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getGeschaltet <em>Geschaltet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschaltet</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getGeschaltet()
	 * @see #getSignal_Signalbegriff_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Signalbegriff_Allg_AttributeGroup_Geschaltet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getZs2Ueberwacht <em>Zs2 Ueberwacht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zs2 Ueberwacht</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getZs2Ueberwacht()
	 * @see #getSignal_Signalbegriff_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getSignal_Signalbegriff_Allg_AttributeGroup_Zs2Ueberwacht();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signalsicht_Erreichbar_TypeClass <em>Signalsicht Erreichbar Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signalsicht Erreichbar Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signalsicht_Erreichbar_TypeClass
	 * @generated
	 */
	EClass getSignalsicht_Erreichbar_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Signalsicht_Erreichbar_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signalsicht_Erreichbar_TypeClass#getWert()
	 * @see #getSignalsicht_Erreichbar_TypeClass()
	 * @generated
	 */
	EAttribute getSignalsicht_Erreichbar_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signalsicht_Mindest_TypeClass <em>Signalsicht Mindest Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signalsicht Mindest Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signalsicht_Mindest_TypeClass
	 * @generated
	 */
	EClass getSignalsicht_Mindest_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Signalsicht_Mindest_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signalsicht_Mindest_TypeClass#getWert()
	 * @see #getSignalsicht_Mindest_TypeClass()
	 * @generated
	 */
	EAttribute getSignalsicht_Mindest_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signalsicht_Soll_TypeClass <em>Signalsicht Soll Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signalsicht Soll Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signalsicht_Soll_TypeClass
	 * @generated
	 */
	EClass getSignalsicht_Soll_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Signalsicht_Soll_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signalsicht_Soll_TypeClass#getWert()
	 * @see #getSignalsicht_Soll_TypeClass()
	 * @generated
	 */
	EAttribute getSignalsicht_Soll_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Signalsystem_TypeClass <em>Signalsystem Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signalsystem Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signalsystem_TypeClass
	 * @generated
	 */
	EClass getSignalsystem_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Signalsystem_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Signalsystem_TypeClass#getWert()
	 * @see #getSignalsystem_TypeClass()
	 * @generated
	 */
	EAttribute getSignalsystem_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Sonstige_Zulaessige_Anordnung_TypeClass <em>Sonstige Zulaessige Anordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sonstige Zulaessige Anordnung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Sonstige_Zulaessige_Anordnung_TypeClass
	 * @generated
	 */
	EClass getSonstige_Zulaessige_Anordnung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Sonstige_Zulaessige_Anordnung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Sonstige_Zulaessige_Anordnung_TypeClass#getWert()
	 * @see #getSonstige_Zulaessige_Anordnung_TypeClass()
	 * @generated
	 */
	EAttribute getSonstige_Zulaessige_Anordnung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Streuscheibe_Art_TypeClass <em>Streuscheibe Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streuscheibe Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Streuscheibe_Art_TypeClass
	 * @generated
	 */
	EClass getStreuscheibe_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Streuscheibe_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Streuscheibe_Art_TypeClass#getWert()
	 * @see #getStreuscheibe_Art_TypeClass()
	 * @generated
	 */
	EAttribute getStreuscheibe_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Streuscheibe_Betriebsstellung_TypeClass <em>Streuscheibe Betriebsstellung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streuscheibe Betriebsstellung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Streuscheibe_Betriebsstellung_TypeClass
	 * @generated
	 */
	EClass getStreuscheibe_Betriebsstellung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Streuscheibe_Betriebsstellung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Streuscheibe_Betriebsstellung_TypeClass#getWert()
	 * @see #getStreuscheibe_Betriebsstellung_TypeClass()
	 * @generated
	 */
	EAttribute getStreuscheibe_Betriebsstellung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Tunnelsignal_TypeClass <em>Tunnelsignal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tunnelsignal Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Tunnelsignal_TypeClass
	 * @generated
	 */
	EClass getTunnelsignal_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Tunnelsignal_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Tunnelsignal_TypeClass#getWert()
	 * @see #getTunnelsignal_TypeClass()
	 * @generated
	 */
	EAttribute getTunnelsignal_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signale.Zs2_Ueberwacht_TypeClass <em>Zs2 Ueberwacht Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs2 Ueberwacht Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Zs2_Ueberwacht_TypeClass
	 * @generated
	 */
	EClass getZs2_Ueberwacht_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signale.Zs2_Ueberwacht_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.Zs2_Ueberwacht_TypeClass#getWert()
	 * @see #getZs2_Ueberwacht_TypeClass()
	 * @generated
	 */
	EAttribute getZs2_Ueberwacht_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMAnschaltdauer <em>ENUM Anschaltdauer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Anschaltdauer</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMAnschaltdauer
	 * @generated
	 */
	EEnum getENUMAnschaltdauer();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMAutoEinstellung <em>ENUM Auto Einstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Auto Einstellung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMAutoEinstellung
	 * @generated
	 */
	EEnum getENUMAutoEinstellung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMBefestigungArt <em>ENUM Befestigung Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Befestigung Art</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMBefestigungArt
	 * @generated
	 */
	EEnum getENUMBefestigungArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMBeleuchtet <em>ENUM Beleuchtet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Beleuchtet</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMBeleuchtet
	 * @generated
	 */
	EEnum getENUMBeleuchtet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMDurchfahrt <em>ENUM Durchfahrt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Durchfahrt</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMDurchfahrt
	 * @generated
	 */
	EEnum getENUMDurchfahrt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMFiktivesSignalFunktion <em>ENUM Fiktives Signal Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Fiktives Signal Funktion</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMFiktivesSignalFunktion
	 * @generated
	 */
	EEnum getENUMFiktivesSignalFunktion();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMFundamentArt <em>ENUM Fundament Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Fundament Art</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMFundamentArt
	 * @generated
	 */
	EEnum getENUMFundamentArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMFunktionOhneSignal <em>ENUM Funktion Ohne Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Funktion Ohne Signal</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMFunktionOhneSignal
	 * @generated
	 */
	EEnum getENUMFunktionOhneSignal();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMGeltungsbereich <em>ENUM Geltungsbereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Geltungsbereich</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMGeltungsbereich
	 * @generated
	 */
	EEnum getENUMGeltungsbereich();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMRahmenArt <em>ENUM Rahmen Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Rahmen Art</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMRahmenArt
	 * @generated
	 */
	EEnum getENUMRahmenArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalArt <em>ENUM Signal Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Signal Art</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalArt
	 * @generated
	 */
	EEnum getENUMSignalArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalBefestigungsart <em>ENUM Signal Befestigungsart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Signal Befestigungsart</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalBefestigungsart
	 * @generated
	 */
	EEnum getENUMSignalBefestigungsart();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalFunktion <em>ENUM Signal Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Signal Funktion</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalFunktion
	 * @generated
	 */
	EEnum getENUMSignalFunktion();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalsystem <em>ENUM Signalsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Signalsystem</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalsystem
	 * @generated
	 */
	EEnum getENUMSignalsystem();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMSonstigeZulaessigeAnordnung <em>ENUM Sonstige Zulaessige Anordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Sonstige Zulaessige Anordnung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSonstigeZulaessigeAnordnung
	 * @generated
	 */
	EEnum getENUMSonstigeZulaessigeAnordnung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeArt <em>ENUM Streuscheibe Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Streuscheibe Art</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeArt
	 * @generated
	 */
	EEnum getENUMStreuscheibeArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeBetriebsstellung <em>ENUM Streuscheibe Betriebsstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Streuscheibe Betriebsstellung</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeBetriebsstellung
	 * @generated
	 */
	EEnum getENUMStreuscheibeBetriebsstellung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signale.ENUMTunnelsignal <em>ENUM Tunnelsignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Tunnelsignal</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMTunnelsignal
	 * @generated
	 */
	EEnum getENUMTunnelsignal();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMAnschaltdauer <em>ENUM Anschaltdauer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Anschaltdauer Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMAnschaltdauer
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMAnschaltdauer"
	 *        extendedMetaData="name='ENUMAnschaltdauer:Object' baseType='ENUMAnschaltdauer'"
	 * @generated
	 */
	EDataType getENUMAnschaltdauerObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMAutoEinstellung <em>ENUM Auto Einstellung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Auto Einstellung Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMAutoEinstellung
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMAutoEinstellung"
	 *        extendedMetaData="name='ENUMAuto_Einstellung:Object' baseType='ENUMAuto_Einstellung'"
	 * @generated
	 */
	EDataType getENUMAutoEinstellungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMBefestigungArt <em>ENUM Befestigung Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Befestigung Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMBefestigungArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMBefestigungArt"
	 *        extendedMetaData="name='ENUMBefestigung_Art:Object' baseType='ENUMBefestigung_Art'"
	 * @generated
	 */
	EDataType getENUMBefestigungArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMBeleuchtet <em>ENUM Beleuchtet Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Beleuchtet Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMBeleuchtet
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMBeleuchtet"
	 *        extendedMetaData="name='ENUMBeleuchtet:Object' baseType='ENUMBeleuchtet'"
	 * @generated
	 */
	EDataType getENUMBeleuchtetObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMDurchfahrt <em>ENUM Durchfahrt Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Durchfahrt Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMDurchfahrt
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMDurchfahrt"
	 *        extendedMetaData="name='ENUMDurchfahrt:Object' baseType='ENUMDurchfahrt'"
	 * @generated
	 */
	EDataType getENUMDurchfahrtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMFiktivesSignalFunktion <em>ENUM Fiktives Signal Funktion Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Fiktives Signal Funktion Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMFiktivesSignalFunktion
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMFiktivesSignalFunktion"
	 *        extendedMetaData="name='ENUMFiktives_Signal_Funktion:Object' baseType='ENUMFiktives_Signal_Funktion'"
	 * @generated
	 */
	EDataType getENUMFiktivesSignalFunktionObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMFundamentArt <em>ENUM Fundament Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Fundament Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMFundamentArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMFundamentArt"
	 *        extendedMetaData="name='ENUMFundament_Art:Object' baseType='ENUMFundament_Art'"
	 * @generated
	 */
	EDataType getENUMFundamentArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMFunktionOhneSignal <em>ENUM Funktion Ohne Signal Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Funktion Ohne Signal Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMFunktionOhneSignal
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMFunktionOhneSignal"
	 *        extendedMetaData="name='ENUMFunktion_Ohne_Signal:Object' baseType='ENUMFunktion_Ohne_Signal'"
	 * @generated
	 */
	EDataType getENUMFunktionOhneSignalObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMGeltungsbereich <em>ENUM Geltungsbereich Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Geltungsbereich Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMGeltungsbereich
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMGeltungsbereich"
	 *        extendedMetaData="name='ENUMGeltungsbereich:Object' baseType='ENUMGeltungsbereich'"
	 * @generated
	 */
	EDataType getENUMGeltungsbereichObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMRahmenArt <em>ENUM Rahmen Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Rahmen Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMRahmenArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMRahmenArt"
	 *        extendedMetaData="name='ENUMRahmen_Art:Object' baseType='ENUMRahmen_Art'"
	 * @generated
	 */
	EDataType getENUMRahmenArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalArt <em>ENUM Signal Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Signal Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMSignalArt"
	 *        extendedMetaData="name='ENUMSignal_Art:Object' baseType='ENUMSignal_Art'"
	 * @generated
	 */
	EDataType getENUMSignalArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalBefestigungsart <em>ENUM Signal Befestigungsart Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Signal Befestigungsart Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalBefestigungsart
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMSignalBefestigungsart"
	 *        extendedMetaData="name='ENUMSignal_Befestigungsart:Object' baseType='ENUMSignal_Befestigungsart'"
	 * @generated
	 */
	EDataType getENUMSignalBefestigungsartObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalFunktion <em>ENUM Signal Funktion Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Signal Funktion Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalFunktion
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMSignalFunktion"
	 *        extendedMetaData="name='ENUMSignal_Funktion:Object' baseType='ENUMSignal_Funktion'"
	 * @generated
	 */
	EDataType getENUMSignalFunktionObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalsystem <em>ENUM Signalsystem Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Signalsystem Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalsystem
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMSignalsystem"
	 *        extendedMetaData="name='ENUMSignalsystem:Object' baseType='ENUMSignalsystem'"
	 * @generated
	 */
	EDataType getENUMSignalsystemObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMSonstigeZulaessigeAnordnung <em>ENUM Sonstige Zulaessige Anordnung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Sonstige Zulaessige Anordnung Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMSonstigeZulaessigeAnordnung
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMSonstigeZulaessigeAnordnung"
	 *        extendedMetaData="name='ENUMSonstige_Zulaessige_Anordnung:Object' baseType='ENUMSonstige_Zulaessige_Anordnung'"
	 * @generated
	 */
	EDataType getENUMSonstigeZulaessigeAnordnungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeArt <em>ENUM Streuscheibe Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Streuscheibe Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeArt"
	 *        extendedMetaData="name='ENUMStreuscheibe_Art:Object' baseType='ENUMStreuscheibe_Art'"
	 * @generated
	 */
	EDataType getENUMStreuscheibeArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeBetriebsstellung <em>ENUM Streuscheibe Betriebsstellung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Streuscheibe Betriebsstellung Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeBetriebsstellung
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeBetriebsstellung"
	 *        extendedMetaData="name='ENUMStreuscheibe_Betriebsstellung:Object' baseType='ENUMStreuscheibe_Betriebsstellung'"
	 * @generated
	 */
	EDataType getENUMStreuscheibeBetriebsstellungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signale.ENUMTunnelsignal <em>ENUM Tunnelsignal Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Tunnelsignal Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signale.ENUMTunnelsignal
	 * @model instanceClass="org.eclipse.set.model.planpro.Signale.ENUMTunnelsignal"
	 *        extendedMetaData="name='ENUMTunnelsignal:Object' baseType='ENUMTunnelsignal'"
	 * @generated
	 */
	EDataType getENUMTunnelsignalObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Hoehe Fundamentoberkante Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hoehe Fundamentoberkante Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='THoehe_Fundamentoberkante' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter' pattern='(-?((1\\.(250|2[0-4][0-9]|[01][0-9]{2}))|(0\\.([1-9][0-9]{2}|0[0-9][1-9]|0[1-9]0))))|0\\.000'"
	 * @generated
	 */
	EDataType getHoehe_Fundamentoberkante_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Obere Lichtpunkthoehe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Obere Lichtpunkthoehe Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TObere_Lichtpunkthoehe' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter' pattern='0\\.(22[5-9]|2[3-9][0-9]|[3-9][0-9]{2})|([1-9]|1[0-4])\\.[0-9]{3}|15.000'"
	 * @generated
	 */
	EDataType getObere_Lichtpunkthoehe_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>PZB Schutzstrecke Soll Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>PZB Schutzstrecke Soll Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TPZB_Schutzstrecke_Soll' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter' pattern='2[0-9][0-9]|[34][0-9]{2}|5[0-4][0-9]|550'"
	 * @generated
	 */
	EDataType getPZB_Schutzstrecke_Soll_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Rahmen Hoehe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rahmen Hoehe Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TRahmen_Hoehe' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter'"
	 * @generated
	 */
	EDataType getRahmen_Hoehe_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Richtpunkt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Richtpunkt Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TRichtpunkt' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText' pattern='.{1,16}'"
	 * @generated
	 */
	EDataType getRichtpunkt_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Richtpunktentfernung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Richtpunktentfernung Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TRichtpunktentfernung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter' pattern='[1-9][0-9]{0,1}|[1-4][0-9]{2}|500'"
	 * @generated
	 */
	EDataType getRichtpunktentfernung_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Signalsicht Erreichbar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signalsicht Erreichbar Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TSignalsicht_Erreichbar' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter' pattern='[1-9][0-9]{0,1}|[1-4][0-9]{2}|500'"
	 * @generated
	 */
	EDataType getSignalsicht_Erreichbar_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Signalsicht Mindest Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signalsicht Mindest Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TSignalsicht_Mindest' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter' pattern='[1-9][0-9]{0,1}|[1-2][0-9]{2}|300'"
	 * @generated
	 */
	EDataType getSignalsicht_Mindest_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Signalsicht Soll Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signalsicht Soll Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TSignalsicht_Soll' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter' pattern='[1-9][0-9]{0,1}|[1-4][0-9]{2}|500'"
	 * @generated
	 */
	EDataType getSignalsicht_Soll_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SignaleFactory getSignaleFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Anschaltdauer_TypeClassImpl <em>Anschaltdauer Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Anschaltdauer_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getAnschaltdauer_TypeClass()
		 * @generated
		 */
		EClass ANSCHALTDAUER_TYPE_CLASS = eINSTANCE.getAnschaltdauer_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSCHALTDAUER_TYPE_CLASS__WERT = eINSTANCE.getAnschaltdauer_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Auto_Einstellung_TypeClassImpl <em>Auto Einstellung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Auto_Einstellung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getAuto_Einstellung_TypeClass()
		 * @generated
		 */
		EClass AUTO_EINSTELLUNG_TYPE_CLASS = eINSTANCE.getAuto_Einstellung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_EINSTELLUNG_TYPE_CLASS__WERT = eINSTANCE.getAuto_Einstellung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Befestigung_Art_TypeClassImpl <em>Befestigung Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Befestigung_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getBefestigung_Art_TypeClass()
		 * @generated
		 */
		EClass BEFESTIGUNG_ART_TYPE_CLASS = eINSTANCE.getBefestigung_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEFESTIGUNG_ART_TYPE_CLASS__WERT = eINSTANCE.getBefestigung_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Beleuchtet_TypeClassImpl <em>Beleuchtet Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Beleuchtet_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getBeleuchtet_TypeClass()
		 * @generated
		 */
		EClass BELEUCHTET_TYPE_CLASS = eINSTANCE.getBeleuchtet_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BELEUCHTET_TYPE_CLASS__WERT = eINSTANCE.getBeleuchtet_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Besetzte_Ausfahrt_TypeClassImpl <em>Besetzte Ausfahrt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Besetzte_Ausfahrt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getBesetzte_Ausfahrt_TypeClass()
		 * @generated
		 */
		EClass BESETZTE_AUSFAHRT_TYPE_CLASS = eINSTANCE.getBesetzte_Ausfahrt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BESETZTE_AUSFAHRT_TYPE_CLASS__WERT = eINSTANCE.getBesetzte_Ausfahrt_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.DA_Manuell_TypeClassImpl <em>DA Manuell Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.DA_Manuell_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getDA_Manuell_TypeClass()
		 * @generated
		 */
		EClass DA_MANUELL_TYPE_CLASS = eINSTANCE.getDA_Manuell_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_MANUELL_TYPE_CLASS__WERT = eINSTANCE.getDA_Manuell_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Dunkelschaltung_TypeClassImpl <em>Dunkelschaltung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Dunkelschaltung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getDunkelschaltung_TypeClass()
		 * @generated
		 */
		EClass DUNKELSCHALTUNG_TYPE_CLASS = eINSTANCE.getDunkelschaltung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUNKELSCHALTUNG_TYPE_CLASS__WERT = eINSTANCE.getDunkelschaltung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Durchfahrt_TypeClassImpl <em>Durchfahrt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Durchfahrt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getDurchfahrt_TypeClass()
		 * @generated
		 */
		EClass DURCHFAHRT_TYPE_CLASS = eINSTANCE.getDurchfahrt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURCHFAHRT_TYPE_CLASS__WERT = eINSTANCE.getDurchfahrt_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Fiktives_Signal_Funktion_TypeClassImpl <em>Fiktives Signal Funktion Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Fiktives_Signal_Funktion_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getFiktives_Signal_Funktion_TypeClass()
		 * @generated
		 */
		EClass FIKTIVES_SIGNAL_FUNKTION_TYPE_CLASS = eINSTANCE.getFiktives_Signal_Funktion_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIKTIVES_SIGNAL_FUNKTION_TYPE_CLASS__WERT = eINSTANCE.getFiktives_Signal_Funktion_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Fundament_Art_TypeClassImpl <em>Fundament Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Fundament_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getFundament_Art_TypeClass()
		 * @generated
		 */
		EClass FUNDAMENT_ART_TYPE_CLASS = eINSTANCE.getFundament_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNDAMENT_ART_TYPE_CLASS__WERT = eINSTANCE.getFundament_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Funktion_Ohne_Signal_TypeClassImpl <em>Funktion Ohne Signal Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Funktion_Ohne_Signal_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getFunktion_Ohne_Signal_TypeClass()
		 * @generated
		 */
		EClass FUNKTION_OHNE_SIGNAL_TYPE_CLASS = eINSTANCE.getFunktion_Ohne_Signal_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNKTION_OHNE_SIGNAL_TYPE_CLASS__WERT = eINSTANCE.getFunktion_Ohne_Signal_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Gegengleis_TypeClassImpl <em>Gegengleis Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Gegengleis_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getGegengleis_TypeClass()
		 * @generated
		 */
		EClass GEGENGLEIS_TYPE_CLASS = eINSTANCE.getGegengleis_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEGENGLEIS_TYPE_CLASS__WERT = eINSTANCE.getGegengleis_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Geltungsbereich_TypeClassImpl <em>Geltungsbereich Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Geltungsbereich_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getGeltungsbereich_TypeClass()
		 * @generated
		 */
		EClass GELTUNGSBEREICH_TYPE_CLASS = eINSTANCE.getGeltungsbereich_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GELTUNGSBEREICH_TYPE_CLASS__WERT = eINSTANCE.getGeltungsbereich_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Geschaltet_TypeClassImpl <em>Geschaltet Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Geschaltet_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getGeschaltet_TypeClass()
		 * @generated
		 */
		EClass GESCHALTET_TYPE_CLASS = eINSTANCE.getGeschaltet_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GESCHALTET_TYPE_CLASS__WERT = eINSTANCE.getGeschaltet_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Hoehe_Fundamentoberkante_TypeClassImpl <em>Hoehe Fundamentoberkante Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Hoehe_Fundamentoberkante_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getHoehe_Fundamentoberkante_TypeClass()
		 * @generated
		 */
		EClass HOEHE_FUNDAMENTOBERKANTE_TYPE_CLASS = eINSTANCE.getHoehe_Fundamentoberkante_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOEHE_FUNDAMENTOBERKANTE_TYPE_CLASS__WERT = eINSTANCE.getHoehe_Fundamentoberkante_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Obere_Lichtpunkthoehe_TypeClassImpl <em>Obere Lichtpunkthoehe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Obere_Lichtpunkthoehe_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getObere_Lichtpunkthoehe_TypeClass()
		 * @generated
		 */
		EClass OBERE_LICHTPUNKTHOEHE_TYPE_CLASS = eINSTANCE.getObere_Lichtpunkthoehe_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBERE_LICHTPUNKTHOEHE_TYPE_CLASS__WERT = eINSTANCE.getObere_Lichtpunkthoehe_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.PZB_Schutzstrecke_Soll_TypeClassImpl <em>PZB Schutzstrecke Soll Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.PZB_Schutzstrecke_Soll_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getPZB_Schutzstrecke_Soll_TypeClass()
		 * @generated
		 */
		EClass PZB_SCHUTZSTRECKE_SOLL_TYPE_CLASS = eINSTANCE.getPZB_Schutzstrecke_Soll_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PZB_SCHUTZSTRECKE_SOLL_TYPE_CLASS__WERT = eINSTANCE.getPZB_Schutzstrecke_Soll_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Rahmen_Art_TypeClassImpl <em>Rahmen Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Rahmen_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRahmen_Art_TypeClass()
		 * @generated
		 */
		EClass RAHMEN_ART_TYPE_CLASS = eINSTANCE.getRahmen_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAHMEN_ART_TYPE_CLASS__WERT = eINSTANCE.getRahmen_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Rahmen_Hoehe_TypeClassImpl <em>Rahmen Hoehe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Rahmen_Hoehe_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRahmen_Hoehe_TypeClass()
		 * @generated
		 */
		EClass RAHMEN_HOEHE_TYPE_CLASS = eINSTANCE.getRahmen_Hoehe_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAHMEN_HOEHE_TYPE_CLASS__WERT = eINSTANCE.getRahmen_Hoehe_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Rangierstrasse_Restaufloesung_TypeClassImpl <em>Rangierstrasse Restaufloesung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Rangierstrasse_Restaufloesung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRangierstrasse_Restaufloesung_TypeClass()
		 * @generated
		 */
		EClass RANGIERSTRASSE_RESTAUFLOESUNG_TYPE_CLASS = eINSTANCE.getRangierstrasse_Restaufloesung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGIERSTRASSE_RESTAUFLOESUNG_TYPE_CLASS__WERT = eINSTANCE.getRangierstrasse_Restaufloesung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Richtpunkt_TypeClassImpl <em>Richtpunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Richtpunkt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRichtpunkt_TypeClass()
		 * @generated
		 */
		EClass RICHTPUNKT_TYPE_CLASS = eINSTANCE.getRichtpunkt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICHTPUNKT_TYPE_CLASS__WERT = eINSTANCE.getRichtpunkt_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Richtpunktentfernung_TypeClassImpl <em>Richtpunktentfernung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Richtpunktentfernung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRichtpunktentfernung_TypeClass()
		 * @generated
		 */
		EClass RICHTPUNKTENTFERNUNG_TYPE_CLASS = eINSTANCE.getRichtpunktentfernung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICHTPUNKTENTFERNUNG_TYPE_CLASS__WERT = eINSTANCE.getRichtpunktentfernung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__BEZEICHNUNG = eINSTANCE.getSignal_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>PZB Schutzstrecke Soll</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__PZB_SCHUTZSTRECKE_SOLL = eINSTANCE.getSignal_PZBSchutzstreckeSoll();

		/**
		 * The meta object literal for the '<em><b>Signal Fstr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__SIGNAL_FSTR = eINSTANCE.getSignal_SignalFstr();

		/**
		 * The meta object literal for the '<em><b>Signal Fstr Aus Inselgleis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS = eINSTANCE.getSignal_SignalFstrAusInselgleis();

		/**
		 * The meta object literal for the '<em><b>Signal Fstr S</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__SIGNAL_FSTR_S = eINSTANCE.getSignal_SignalFstrS();

		/**
		 * The meta object literal for the '<em><b>Signal Fiktiv</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__SIGNAL_FIKTIV = eINSTANCE.getSignal_SignalFiktiv();

		/**
		 * The meta object literal for the '<em><b>Signal Real</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__SIGNAL_REAL = eINSTANCE.getSignal_SignalReal();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Art_TypeClassImpl <em>Signal Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Art_TypeClass()
		 * @generated
		 */
		EClass SIGNAL_ART_TYPE_CLASS = eINSTANCE.getSignal_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_ART_TYPE_CLASS__WERT = eINSTANCE.getSignal_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_BefestigungImpl <em>Signal Befestigung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_BefestigungImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Befestigung()
		 * @generated
		 */
		EClass SIGNAL_BEFESTIGUNG = eINSTANCE.getSignal_Befestigung();

		/**
		 * The meta object literal for the '<em><b>ID Regelzeichnung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG = eINSTANCE.getSignal_Befestigung_IDRegelzeichnung();

		/**
		 * The meta object literal for the '<em><b>Signal Befestigung Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG = eINSTANCE.getSignal_Befestigung_SignalBefestigungAllg();

		/**
		 * The meta object literal for the '<em><b>ID Befestigung Bauwerk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_BEFESTIGUNG__ID_BEFESTIGUNG_BAUWERK = eINSTANCE.getSignal_Befestigung_IDBefestigungBauwerk();

		/**
		 * The meta object literal for the '<em><b>ID Signal Befestigung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG = eINSTANCE.getSignal_Befestigung_IDSignalBefestigung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Befestigung_Allg_AttributeGroupImpl <em>Signal Befestigung Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Befestigung_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Befestigung_Allg_AttributeGroup()
		 * @generated
		 */
		EClass SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getSignal_Befestigung_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Befestigung Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__BEFESTIGUNG_ART = eINSTANCE.getSignal_Befestigung_Allg_AttributeGroup_BefestigungArt();

		/**
		 * The meta object literal for the '<em><b>Fundament Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__FUNDAMENT_ART = eINSTANCE.getSignal_Befestigung_Allg_AttributeGroup_FundamentArt();

		/**
		 * The meta object literal for the '<em><b>Hoehe Fundamentoberkante</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__HOEHE_FUNDAMENTOBERKANTE = eINSTANCE.getSignal_Befestigung_Allg_AttributeGroup_HoeheFundamentoberkante();

		/**
		 * The meta object literal for the '<em><b>Obere Lichtpunkthoehe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__OBERE_LICHTPUNKTHOEHE = eINSTANCE.getSignal_Befestigung_Allg_AttributeGroup_ObereLichtpunkthoehe();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Befestigungsart_TypeClassImpl <em>Signal Befestigungsart Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Befestigungsart_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Befestigungsart_TypeClass()
		 * @generated
		 */
		EClass SIGNAL_BEFESTIGUNGSART_TYPE_CLASS = eINSTANCE.getSignal_Befestigungsart_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_BEFESTIGUNGSART_TYPE_CLASS__WERT = eINSTANCE.getSignal_Befestigungsart_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fank_ZuordnungImpl <em>Signal Fank Zuordnung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Fank_ZuordnungImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Fank_Zuordnung()
		 * @generated
		 */
		EClass SIGNAL_FANK_ZUORDNUNG = eINSTANCE.getSignal_Fank_Zuordnung();

		/**
		 * The meta object literal for the '<em><b>ID Signal Fank</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK = eINSTANCE.getSignal_Fank_Zuordnung_IDSignalFank();

		/**
		 * The meta object literal for the '<em><b>ID Signal Start</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START = eINSTANCE.getSignal_Fank_Zuordnung_IDSignalStart();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fiktiv_AttributeGroupImpl <em>Signal Fiktiv Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Fiktiv_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Fiktiv_AttributeGroup()
		 * @generated
		 */
		EClass SIGNAL_FIKTIV_ATTRIBUTE_GROUP = eINSTANCE.getSignal_Fiktiv_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Auto Einstellung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FIKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG = eINSTANCE.getSignal_Fiktiv_AttributeGroup_AutoEinstellung();

		/**
		 * The meta object literal for the '<em><b>Fiktives Signal Funktion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FIKTIV_ATTRIBUTE_GROUP__FIKTIVES_SIGNAL_FUNKTION = eINSTANCE.getSignal_Fiktiv_AttributeGroup_FiktivesSignalFunktion();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_AttributeGroupImpl <em>Signal Fstr Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Fstr_AttributeGroup()
		 * @generated
		 */
		EClass SIGNAL_FSTR_ATTRIBUTE_GROUP = eINSTANCE.getSignal_Fstr_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Besetzte Ausfahrt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FSTR_ATTRIBUTE_GROUP__BESETZTE_AUSFAHRT = eINSTANCE.getSignal_Fstr_AttributeGroup_BesetzteAusfahrt();

		/**
		 * The meta object literal for the '<em><b>DA Manuell</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FSTR_ATTRIBUTE_GROUP__DA_MANUELL = eINSTANCE.getSignal_Fstr_AttributeGroup_DAManuell();

		/**
		 * The meta object literal for the '<em><b>Durchfahrt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FSTR_ATTRIBUTE_GROUP__DURCHFAHRT = eINSTANCE.getSignal_Fstr_AttributeGroup_Durchfahrt();

		/**
		 * The meta object literal for the '<em><b>ID Ra Ziel Erlaubnisabhaengig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FSTR_ATTRIBUTE_GROUP__ID_RA_ZIEL_ERLAUBNISABHAENGIG = eINSTANCE.getSignal_Fstr_AttributeGroup_IDRaZielErlaubnisabhaengig();

		/**
		 * The meta object literal for the '<em><b>Rangierstrasse Restaufloesung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FSTR_ATTRIBUTE_GROUP__RANGIERSTRASSE_RESTAUFLOESUNG = eINSTANCE.getSignal_Fstr_AttributeGroup_RangierstrasseRestaufloesung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl <em>Signal Fstr Aus Inselgleis Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Fstr_Aus_Inselgleis_AttributeGroup()
		 * @generated
		 */
		EClass SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP = eINSTANCE.getSignal_Fstr_Aus_Inselgleis_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>ID Ra Fahrt Gleichzeitig Verbot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT = eINSTANCE.getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDRaFahrtGleichzeitigVerbot();

		/**
		 * The meta object literal for the '<em><b>ID Zg Fahrt Gleichzeitig Verbot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT = eINSTANCE.getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDZgFahrtGleichzeitigVerbot();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_S_AttributeGroupImpl <em>Signal Fstr SAttribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_S_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Fstr_S_AttributeGroup()
		 * @generated
		 */
		EClass SIGNAL_FSTR_SATTRIBUTE_GROUP = eINSTANCE.getSignal_Fstr_S_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Gegengleis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS = eINSTANCE.getSignal_Fstr_S_AttributeGroup_Gegengleis();

		/**
		 * The meta object literal for the '<em><b>ID Anrueckverschluss</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS = eINSTANCE.getSignal_Fstr_S_AttributeGroup_IDAnrueckverschluss();

		/**
		 * The meta object literal for the '<em><b>ID Zweites Haltfallkriterium</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM = eINSTANCE.getSignal_Fstr_S_AttributeGroup_IDZweitesHaltfallkriterium();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Funktion_TypeClassImpl <em>Signal Funktion Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Funktion_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Funktion_TypeClass()
		 * @generated
		 */
		EClass SIGNAL_FUNKTION_TYPE_CLASS = eINSTANCE.getSignal_Funktion_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_FUNKTION_TYPE_CLASS__WERT = eINSTANCE.getSignal_Funktion_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_RahmenImpl <em>Signal Rahmen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_RahmenImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Rahmen()
		 * @generated
		 */
		EClass SIGNAL_RAHMEN = eINSTANCE.getSignal_Rahmen();

		/**
		 * The meta object literal for the '<em><b>ID Regelzeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_RAHMEN__ID_REGELZEICHNUNG = eINSTANCE.getSignal_Rahmen_IDRegelzeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Signal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_RAHMEN__ID_SIGNAL = eINSTANCE.getSignal_Rahmen_IDSignal();

		/**
		 * The meta object literal for the '<em><b>ID Signal Befestigung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG = eINSTANCE.getSignal_Rahmen_IDSignalBefestigung();

		/**
		 * The meta object literal for the '<em><b>ID Signal Nachordnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG = eINSTANCE.getSignal_Rahmen_IDSignalNachordnung();

		/**
		 * The meta object literal for the '<em><b>Rahmen Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_RAHMEN__RAHMEN_ART = eINSTANCE.getSignal_Rahmen_RahmenArt();

		/**
		 * The meta object literal for the '<em><b>Rahmen Hoehe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_RAHMEN__RAHMEN_HOEHE = eINSTANCE.getSignal_Rahmen_RahmenHoehe();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl <em>Signal Real Aktiv Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Real_Aktiv_AttributeGroup()
		 * @generated
		 */
		EClass SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP = eINSTANCE.getSignal_Real_Aktiv_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Auto Einstellung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG = eINSTANCE.getSignal_Real_Aktiv_AttributeGroup_AutoEinstellung();

		/**
		 * The meta object literal for the '<em><b>ID Stellelement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__ID_STELLELEMENT = eINSTANCE.getSignal_Real_Aktiv_AttributeGroup_IDStellelement();

		/**
		 * The meta object literal for the '<em><b>Sonstige Zulaessige Anordnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SONSTIGE_ZULAESSIGE_ANORDNUNG = eINSTANCE.getSignal_Real_Aktiv_AttributeGroup_SonstigeZulaessigeAnordnung();

		/**
		 * The meta object literal for the '<em><b>Tunnelsignal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__TUNNELSIGNAL = eINSTANCE.getSignal_Real_Aktiv_AttributeGroup_Tunnelsignal();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_Schirm_AttributeGroupImpl <em>Signal Real Aktiv Schirm Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_Schirm_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Real_Aktiv_Schirm_AttributeGroup()
		 * @generated
		 */
		EClass SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP = eINSTANCE.getSignal_Real_Aktiv_Schirm_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Richtpunkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKT = eINSTANCE.getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunkt();

		/**
		 * The meta object literal for the '<em><b>Richtpunktentfernung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKTENTFERNUNG = eINSTANCE.getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunktentfernung();

		/**
		 * The meta object literal for the '<em><b>Signal Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNAL_ART = eINSTANCE.getSignal_Real_Aktiv_Schirm_AttributeGroup_SignalArt();

		/**
		 * The meta object literal for the '<em><b>Signalsystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNALSYSTEM = eINSTANCE.getSignal_Real_Aktiv_Schirm_AttributeGroup_Signalsystem();

		/**
		 * The meta object literal for the '<em><b>Streuscheibe Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_ART = eINSTANCE.getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeArt();

		/**
		 * The meta object literal for the '<em><b>Streuscheibe Betriebsstellung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_BETRIEBSSTELLUNG = eINSTANCE.getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeBetriebsstellung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Real_AttributeGroupImpl <em>Signal Real Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Real_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Real_AttributeGroup()
		 * @generated
		 */
		EClass SIGNAL_REAL_ATTRIBUTE_GROUP = eINSTANCE.getSignal_Real_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Dunkelschaltung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_ATTRIBUTE_GROUP__DUNKELSCHALTUNG = eINSTANCE.getSignal_Real_AttributeGroup_Dunkelschaltung();

		/**
		 * The meta object literal for the '<em><b>Funktion Ohne Signal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_ATTRIBUTE_GROUP__FUNKTION_OHNE_SIGNAL = eINSTANCE.getSignal_Real_AttributeGroup_FunktionOhneSignal();

		/**
		 * The meta object literal for the '<em><b>Geltungsbereich</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH = eINSTANCE.getSignal_Real_AttributeGroup_Geltungsbereich();

		/**
		 * The meta object literal for the '<em><b>Signal Befestigungsart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART = eINSTANCE.getSignal_Real_AttributeGroup_SignalBefestigungsart();

		/**
		 * The meta object literal for the '<em><b>Signal Funktion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_FUNKTION = eINSTANCE.getSignal_Real_AttributeGroup_SignalFunktion();

		/**
		 * The meta object literal for the '<em><b>Signal Real Aktiv</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV = eINSTANCE.getSignal_Real_AttributeGroup_SignalRealAktiv();

		/**
		 * The meta object literal for the '<em><b>Signal Real Aktiv Schirm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM = eINSTANCE.getSignal_Real_AttributeGroup_SignalRealAktivSchirm();

		/**
		 * The meta object literal for the '<em><b>Signalsicht Erreichbar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR = eINSTANCE.getSignal_Real_AttributeGroup_SignalsichtErreichbar();

		/**
		 * The meta object literal for the '<em><b>Signalsicht Mindest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST = eINSTANCE.getSignal_Real_AttributeGroup_SignalsichtMindest();

		/**
		 * The meta object literal for the '<em><b>Signalsicht Soll</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL = eINSTANCE.getSignal_Real_AttributeGroup_SignalsichtSoll();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_SignalbegriffImpl <em>Signal Signalbegriff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_SignalbegriffImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Signalbegriff()
		 * @generated
		 */
		EClass SIGNAL_SIGNALBEGRIFF = eINSTANCE.getSignal_Signalbegriff();

		/**
		 * The meta object literal for the '<em><b>ID Signal Rahmen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN = eINSTANCE.getSignal_Signalbegriff_IDSignalRahmen();

		/**
		 * The meta object literal for the '<em><b>Signal Signalbegriff Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG = eINSTANCE.getSignal_Signalbegriff_SignalSignalbegriffAllg();

		/**
		 * The meta object literal for the '<em><b>Signalbegriff ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID = eINSTANCE.getSignal_Signalbegriff_SignalbegriffID();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Signalbegriff_Allg_AttributeGroupImpl <em>Signal Signalbegriff Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signal_Signalbegriff_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignal_Signalbegriff_Allg_AttributeGroup()
		 * @generated
		 */
		EClass SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getSignal_Signalbegriff_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Anschaltdauer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ANSCHALTDAUER = eINSTANCE.getSignal_Signalbegriff_Allg_AttributeGroup_Anschaltdauer();

		/**
		 * The meta object literal for the '<em><b>Beleuchtet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__BELEUCHTET = eINSTANCE.getSignal_Signalbegriff_Allg_AttributeGroup_Beleuchtet();

		/**
		 * The meta object literal for the '<em><b>Geschaltet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__GESCHALTET = eINSTANCE.getSignal_Signalbegriff_Allg_AttributeGroup_Geschaltet();

		/**
		 * The meta object literal for the '<em><b>Zs2 Ueberwacht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ZS2_UEBERWACHT = eINSTANCE.getSignal_Signalbegriff_Allg_AttributeGroup_Zs2Ueberwacht();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signalsicht_Erreichbar_TypeClassImpl <em>Signalsicht Erreichbar Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signalsicht_Erreichbar_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsicht_Erreichbar_TypeClass()
		 * @generated
		 */
		EClass SIGNALSICHT_ERREICHBAR_TYPE_CLASS = eINSTANCE.getSignalsicht_Erreichbar_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALSICHT_ERREICHBAR_TYPE_CLASS__WERT = eINSTANCE.getSignalsicht_Erreichbar_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signalsicht_Mindest_TypeClassImpl <em>Signalsicht Mindest Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signalsicht_Mindest_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsicht_Mindest_TypeClass()
		 * @generated
		 */
		EClass SIGNALSICHT_MINDEST_TYPE_CLASS = eINSTANCE.getSignalsicht_Mindest_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALSICHT_MINDEST_TYPE_CLASS__WERT = eINSTANCE.getSignalsicht_Mindest_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signalsicht_Soll_TypeClassImpl <em>Signalsicht Soll Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signalsicht_Soll_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsicht_Soll_TypeClass()
		 * @generated
		 */
		EClass SIGNALSICHT_SOLL_TYPE_CLASS = eINSTANCE.getSignalsicht_Soll_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALSICHT_SOLL_TYPE_CLASS__WERT = eINSTANCE.getSignalsicht_Soll_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Signalsystem_TypeClassImpl <em>Signalsystem Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Signalsystem_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsystem_TypeClass()
		 * @generated
		 */
		EClass SIGNALSYSTEM_TYPE_CLASS = eINSTANCE.getSignalsystem_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALSYSTEM_TYPE_CLASS__WERT = eINSTANCE.getSignalsystem_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Sonstige_Zulaessige_Anordnung_TypeClassImpl <em>Sonstige Zulaessige Anordnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Sonstige_Zulaessige_Anordnung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSonstige_Zulaessige_Anordnung_TypeClass()
		 * @generated
		 */
		EClass SONSTIGE_ZULAESSIGE_ANORDNUNG_TYPE_CLASS = eINSTANCE.getSonstige_Zulaessige_Anordnung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONSTIGE_ZULAESSIGE_ANORDNUNG_TYPE_CLASS__WERT = eINSTANCE.getSonstige_Zulaessige_Anordnung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Streuscheibe_Art_TypeClassImpl <em>Streuscheibe Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Streuscheibe_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getStreuscheibe_Art_TypeClass()
		 * @generated
		 */
		EClass STREUSCHEIBE_ART_TYPE_CLASS = eINSTANCE.getStreuscheibe_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREUSCHEIBE_ART_TYPE_CLASS__WERT = eINSTANCE.getStreuscheibe_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Streuscheibe_Betriebsstellung_TypeClassImpl <em>Streuscheibe Betriebsstellung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Streuscheibe_Betriebsstellung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getStreuscheibe_Betriebsstellung_TypeClass()
		 * @generated
		 */
		EClass STREUSCHEIBE_BETRIEBSSTELLUNG_TYPE_CLASS = eINSTANCE.getStreuscheibe_Betriebsstellung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREUSCHEIBE_BETRIEBSSTELLUNG_TYPE_CLASS__WERT = eINSTANCE.getStreuscheibe_Betriebsstellung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Tunnelsignal_TypeClassImpl <em>Tunnelsignal Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Tunnelsignal_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getTunnelsignal_TypeClass()
		 * @generated
		 */
		EClass TUNNELSIGNAL_TYPE_CLASS = eINSTANCE.getTunnelsignal_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUNNELSIGNAL_TYPE_CLASS__WERT = eINSTANCE.getTunnelsignal_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.impl.Zs2_Ueberwacht_TypeClassImpl <em>Zs2 Ueberwacht Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.impl.Zs2_Ueberwacht_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getZs2_Ueberwacht_TypeClass()
		 * @generated
		 */
		EClass ZS2_UEBERWACHT_TYPE_CLASS = eINSTANCE.getZs2_Ueberwacht_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZS2_UEBERWACHT_TYPE_CLASS__WERT = eINSTANCE.getZs2_Ueberwacht_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMAnschaltdauer <em>ENUM Anschaltdauer</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMAnschaltdauer
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMAnschaltdauer()
		 * @generated
		 */
		EEnum ENUM_ANSCHALTDAUER = eINSTANCE.getENUMAnschaltdauer();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMAutoEinstellung <em>ENUM Auto Einstellung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMAutoEinstellung
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMAutoEinstellung()
		 * @generated
		 */
		EEnum ENUM_AUTO_EINSTELLUNG = eINSTANCE.getENUMAutoEinstellung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMBefestigungArt <em>ENUM Befestigung Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMBefestigungArt
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMBefestigungArt()
		 * @generated
		 */
		EEnum ENUM_BEFESTIGUNG_ART = eINSTANCE.getENUMBefestigungArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMBeleuchtet <em>ENUM Beleuchtet</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMBeleuchtet
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMBeleuchtet()
		 * @generated
		 */
		EEnum ENUM_BELEUCHTET = eINSTANCE.getENUMBeleuchtet();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMDurchfahrt <em>ENUM Durchfahrt</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMDurchfahrt
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMDurchfahrt()
		 * @generated
		 */
		EEnum ENUM_DURCHFAHRT = eINSTANCE.getENUMDurchfahrt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMFiktivesSignalFunktion <em>ENUM Fiktives Signal Funktion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMFiktivesSignalFunktion
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMFiktivesSignalFunktion()
		 * @generated
		 */
		EEnum ENUM_FIKTIVES_SIGNAL_FUNKTION = eINSTANCE.getENUMFiktivesSignalFunktion();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMFundamentArt <em>ENUM Fundament Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMFundamentArt
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMFundamentArt()
		 * @generated
		 */
		EEnum ENUM_FUNDAMENT_ART = eINSTANCE.getENUMFundamentArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMFunktionOhneSignal <em>ENUM Funktion Ohne Signal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMFunktionOhneSignal
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMFunktionOhneSignal()
		 * @generated
		 */
		EEnum ENUM_FUNKTION_OHNE_SIGNAL = eINSTANCE.getENUMFunktionOhneSignal();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMGeltungsbereich <em>ENUM Geltungsbereich</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMGeltungsbereich
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMGeltungsbereich()
		 * @generated
		 */
		EEnum ENUM_GELTUNGSBEREICH = eINSTANCE.getENUMGeltungsbereich();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMRahmenArt <em>ENUM Rahmen Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMRahmenArt
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMRahmenArt()
		 * @generated
		 */
		EEnum ENUM_RAHMEN_ART = eINSTANCE.getENUMRahmenArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalArt <em>ENUM Signal Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalArt
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalArt()
		 * @generated
		 */
		EEnum ENUM_SIGNAL_ART = eINSTANCE.getENUMSignalArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalBefestigungsart <em>ENUM Signal Befestigungsart</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalBefestigungsart
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalBefestigungsart()
		 * @generated
		 */
		EEnum ENUM_SIGNAL_BEFESTIGUNGSART = eINSTANCE.getENUMSignalBefestigungsart();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalFunktion <em>ENUM Signal Funktion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalFunktion
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalFunktion()
		 * @generated
		 */
		EEnum ENUM_SIGNAL_FUNKTION = eINSTANCE.getENUMSignalFunktion();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMSignalsystem <em>ENUM Signalsystem</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalsystem
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalsystem()
		 * @generated
		 */
		EEnum ENUM_SIGNALSYSTEM = eINSTANCE.getENUMSignalsystem();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMSonstigeZulaessigeAnordnung <em>ENUM Sonstige Zulaessige Anordnung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMSonstigeZulaessigeAnordnung
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSonstigeZulaessigeAnordnung()
		 * @generated
		 */
		EEnum ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG = eINSTANCE.getENUMSonstigeZulaessigeAnordnung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeArt <em>ENUM Streuscheibe Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeArt
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMStreuscheibeArt()
		 * @generated
		 */
		EEnum ENUM_STREUSCHEIBE_ART = eINSTANCE.getENUMStreuscheibeArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeBetriebsstellung <em>ENUM Streuscheibe Betriebsstellung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeBetriebsstellung
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMStreuscheibeBetriebsstellung()
		 * @generated
		 */
		EEnum ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG = eINSTANCE.getENUMStreuscheibeBetriebsstellung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Signale.ENUMTunnelsignal <em>ENUM Tunnelsignal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMTunnelsignal
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMTunnelsignal()
		 * @generated
		 */
		EEnum ENUM_TUNNELSIGNAL = eINSTANCE.getENUMTunnelsignal();

		/**
		 * The meta object literal for the '<em>ENUM Anschaltdauer Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMAnschaltdauer
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMAnschaltdauerObject()
		 * @generated
		 */
		EDataType ENUM_ANSCHALTDAUER_OBJECT = eINSTANCE.getENUMAnschaltdauerObject();

		/**
		 * The meta object literal for the '<em>ENUM Auto Einstellung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMAutoEinstellung
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMAutoEinstellungObject()
		 * @generated
		 */
		EDataType ENUM_AUTO_EINSTELLUNG_OBJECT = eINSTANCE.getENUMAutoEinstellungObject();

		/**
		 * The meta object literal for the '<em>ENUM Befestigung Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMBefestigungArt
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMBefestigungArtObject()
		 * @generated
		 */
		EDataType ENUM_BEFESTIGUNG_ART_OBJECT = eINSTANCE.getENUMBefestigungArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Beleuchtet Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMBeleuchtet
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMBeleuchtetObject()
		 * @generated
		 */
		EDataType ENUM_BELEUCHTET_OBJECT = eINSTANCE.getENUMBeleuchtetObject();

		/**
		 * The meta object literal for the '<em>ENUM Durchfahrt Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMDurchfahrt
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMDurchfahrtObject()
		 * @generated
		 */
		EDataType ENUM_DURCHFAHRT_OBJECT = eINSTANCE.getENUMDurchfahrtObject();

		/**
		 * The meta object literal for the '<em>ENUM Fiktives Signal Funktion Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMFiktivesSignalFunktion
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMFiktivesSignalFunktionObject()
		 * @generated
		 */
		EDataType ENUM_FIKTIVES_SIGNAL_FUNKTION_OBJECT = eINSTANCE.getENUMFiktivesSignalFunktionObject();

		/**
		 * The meta object literal for the '<em>ENUM Fundament Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMFundamentArt
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMFundamentArtObject()
		 * @generated
		 */
		EDataType ENUM_FUNDAMENT_ART_OBJECT = eINSTANCE.getENUMFundamentArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Funktion Ohne Signal Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMFunktionOhneSignal
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMFunktionOhneSignalObject()
		 * @generated
		 */
		EDataType ENUM_FUNKTION_OHNE_SIGNAL_OBJECT = eINSTANCE.getENUMFunktionOhneSignalObject();

		/**
		 * The meta object literal for the '<em>ENUM Geltungsbereich Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMGeltungsbereich
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMGeltungsbereichObject()
		 * @generated
		 */
		EDataType ENUM_GELTUNGSBEREICH_OBJECT = eINSTANCE.getENUMGeltungsbereichObject();

		/**
		 * The meta object literal for the '<em>ENUM Rahmen Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMRahmenArt
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMRahmenArtObject()
		 * @generated
		 */
		EDataType ENUM_RAHMEN_ART_OBJECT = eINSTANCE.getENUMRahmenArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Signal Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalArt
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalArtObject()
		 * @generated
		 */
		EDataType ENUM_SIGNAL_ART_OBJECT = eINSTANCE.getENUMSignalArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Signal Befestigungsart Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalBefestigungsart
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalBefestigungsartObject()
		 * @generated
		 */
		EDataType ENUM_SIGNAL_BEFESTIGUNGSART_OBJECT = eINSTANCE.getENUMSignalBefestigungsartObject();

		/**
		 * The meta object literal for the '<em>ENUM Signal Funktion Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalFunktion
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalFunktionObject()
		 * @generated
		 */
		EDataType ENUM_SIGNAL_FUNKTION_OBJECT = eINSTANCE.getENUMSignalFunktionObject();

		/**
		 * The meta object literal for the '<em>ENUM Signalsystem Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMSignalsystem
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSignalsystemObject()
		 * @generated
		 */
		EDataType ENUM_SIGNALSYSTEM_OBJECT = eINSTANCE.getENUMSignalsystemObject();

		/**
		 * The meta object literal for the '<em>ENUM Sonstige Zulaessige Anordnung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMSonstigeZulaessigeAnordnung
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMSonstigeZulaessigeAnordnungObject()
		 * @generated
		 */
		EDataType ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG_OBJECT = eINSTANCE.getENUMSonstigeZulaessigeAnordnungObject();

		/**
		 * The meta object literal for the '<em>ENUM Streuscheibe Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeArt
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMStreuscheibeArtObject()
		 * @generated
		 */
		EDataType ENUM_STREUSCHEIBE_ART_OBJECT = eINSTANCE.getENUMStreuscheibeArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Streuscheibe Betriebsstellung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMStreuscheibeBetriebsstellung
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMStreuscheibeBetriebsstellungObject()
		 * @generated
		 */
		EDataType ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_OBJECT = eINSTANCE.getENUMStreuscheibeBetriebsstellungObject();

		/**
		 * The meta object literal for the '<em>ENUM Tunnelsignal Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Signale.ENUMTunnelsignal
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getENUMTunnelsignalObject()
		 * @generated
		 */
		EDataType ENUM_TUNNELSIGNAL_OBJECT = eINSTANCE.getENUMTunnelsignalObject();

		/**
		 * The meta object literal for the '<em>Hoehe Fundamentoberkante Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getHoehe_Fundamentoberkante_Type()
		 * @generated
		 */
		EDataType HOEHE_FUNDAMENTOBERKANTE_TYPE = eINSTANCE.getHoehe_Fundamentoberkante_Type();

		/**
		 * The meta object literal for the '<em>Obere Lichtpunkthoehe Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getObere_Lichtpunkthoehe_Type()
		 * @generated
		 */
		EDataType OBERE_LICHTPUNKTHOEHE_TYPE = eINSTANCE.getObere_Lichtpunkthoehe_Type();

		/**
		 * The meta object literal for the '<em>PZB Schutzstrecke Soll Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getPZB_Schutzstrecke_Soll_Type()
		 * @generated
		 */
		EDataType PZB_SCHUTZSTRECKE_SOLL_TYPE = eINSTANCE.getPZB_Schutzstrecke_Soll_Type();

		/**
		 * The meta object literal for the '<em>Rahmen Hoehe Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRahmen_Hoehe_Type()
		 * @generated
		 */
		EDataType RAHMEN_HOEHE_TYPE = eINSTANCE.getRahmen_Hoehe_Type();

		/**
		 * The meta object literal for the '<em>Richtpunkt Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRichtpunkt_Type()
		 * @generated
		 */
		EDataType RICHTPUNKT_TYPE = eINSTANCE.getRichtpunkt_Type();

		/**
		 * The meta object literal for the '<em>Richtpunktentfernung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getRichtpunktentfernung_Type()
		 * @generated
		 */
		EDataType RICHTPUNKTENTFERNUNG_TYPE = eINSTANCE.getRichtpunktentfernung_Type();

		/**
		 * The meta object literal for the '<em>Signalsicht Erreichbar Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsicht_Erreichbar_Type()
		 * @generated
		 */
		EDataType SIGNALSICHT_ERREICHBAR_TYPE = eINSTANCE.getSignalsicht_Erreichbar_Type();

		/**
		 * The meta object literal for the '<em>Signalsicht Mindest Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsicht_Mindest_Type()
		 * @generated
		 */
		EDataType SIGNALSICHT_MINDEST_TYPE = eINSTANCE.getSignalsicht_Mindest_Type();

		/**
		 * The meta object literal for the '<em>Signalsicht Soll Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl#getSignalsicht_Soll_Type()
		 * @generated
		 */
		EDataType SIGNALSICHT_SOLL_TYPE = eINSTANCE.getSignalsicht_Soll_Type();

	}

} //SignalePackage
