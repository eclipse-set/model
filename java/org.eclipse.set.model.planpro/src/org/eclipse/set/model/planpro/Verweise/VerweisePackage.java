/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Verweise;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage;

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
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.planpro.Verweise.VerweiseFactory
 * @model kind="package"
 * @generated
 */
public interface VerweisePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Verweise";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Verweise/1.10.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsVerweise";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VerweisePackage eINSTANCE = org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Anforderer_Element_TypeClassImpl <em>ID Anforderer Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Anforderer_Element_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Anforderer_Element_TypeClass()
	 * @generated
	 */
	int ID_ANFORDERER_ELEMENT_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERER_ELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERER_ELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERER_ELEMENT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERER_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Anforderer Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERER_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Anforderung_TypeClassImpl <em>ID Anforderung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Anforderung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Anforderung_TypeClass()
	 * @generated
	 */
	int ID_ANFORDERUNG_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Anforderung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Anhang_ohne_Proxy_TypeClassImpl <em>ID Anhang ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Anhang_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Anhang_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_ANHANG_OHNE_PROXY_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Anhang ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Anhang_TypeClassImpl <em>ID Anhang Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Anhang_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Anhang_TypeClass()
	 * @generated
	 */
	int ID_ANHANG_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Anhang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_AnhangBearbeitungsvermerk_TypeClassImpl <em>ID Anhang Bearbeitungsvermerk Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_AnhangBearbeitungsvermerk_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_AnhangBearbeitungsvermerk_TypeClass()
	 * @generated
	 */
	int ID_ANHANG_BEARBEITUNGSVERMERK_TYPE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_BEARBEITUNGSVERMERK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_BEARBEITUNGSVERMERK_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_BEARBEITUNGSVERMERK_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_BEARBEITUNGSVERMERK_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Anhang Bearbeitungsvermerk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_BEARBEITUNGSVERMERK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Anschluss_Element_TypeClassImpl <em>ID Anschluss Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Anschluss_Element_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Anschluss_Element_TypeClass()
	 * @generated
	 */
	int ID_ANSCHLUSS_ELEMENT_TYPE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANSCHLUSS_ELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANSCHLUSS_ELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANSCHLUSS_ELEMENT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANSCHLUSS_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Anschluss Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANSCHLUSS_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ATO_TS_Instanz_ohne_Proxy_TypeClassImpl <em>ID ATO TS Instanz ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ATO_TS_Instanz_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ATO_TS_Instanz_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_ATO_TS_INSTANZ_OHNE_PROXY_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ATO_TS_INSTANZ_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ATO_TS_INSTANZ_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ATO_TS_INSTANZ_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ATO_TS_INSTANZ_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ATO TS Instanz ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ATO_TS_INSTANZ_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ATO_TS_Instanz_TypeClassImpl <em>ID ATO TS Instanz Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ATO_TS_Instanz_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ATO_TS_Instanz_TypeClass()
	 * @generated
	 */
	int ID_ATO_TS_INSTANZ_TYPE_CLASS = 7;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ATO_TS_INSTANZ_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ATO_TS_INSTANZ_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ATO_TS_INSTANZ_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ATO_TS_INSTANZ_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ATO TS Instanz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ATO_TS_INSTANZ_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClassImpl <em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Aussenelementansteuerung_ohne_Proxy_TypeClassImpl <em>ID Aussenelementansteuerung ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Aussenelementansteuerung_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Aussenelementansteuerung_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Aussenelementansteuerung ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Aussenelementansteuerung_TypeClassImpl <em>ID Aussenelementansteuerung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Aussenelementansteuerung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Aussenelementansteuerung_TypeClass()
	 * @generated
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Aussenelementansteuerung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bahnsteig_Anlage_TypeClassImpl <em>ID Bahnsteig Anlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bahnsteig_Anlage_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bahnsteig_Anlage_TypeClass()
	 * @generated
	 */
	int ID_BAHNSTEIG_ANLAGE_TYPE_CLASS = 11;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_ANLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_ANLAGE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_ANLAGE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_ANLAGE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Bahnsteig Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_ANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bahnsteig_Kante_ohne_Proxy_TypeClassImpl <em>ID Bahnsteig Kante ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bahnsteig_Kante_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bahnsteig_Kante_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Bahnsteig Kante ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bahnsteig_Kante_TypeClassImpl <em>ID Bahnsteig Kante Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bahnsteig_Kante_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bahnsteig_Kante_TypeClass()
	 * @generated
	 */
	int ID_BAHNSTEIG_KANTE_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Bahnsteig Kante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Balise_ohne_Proxy_TypeClassImpl <em>ID Balise ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Balise_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Balise_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_BALISE_OHNE_PROXY_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Balise ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Balise_TypeClassImpl <em>ID Balise Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Balise_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Balise_TypeClass()
	 * @generated
	 */
	int ID_BALISE_TYPE_CLASS = 15;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Balise Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Basis_Objekt_TypeClassImpl <em>ID Basis Objekt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Basis_Objekt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Basis_Objekt_TypeClass()
	 * @generated
	 */
	int ID_BASIS_OBJEKT_TYPE_CLASS = 16;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BASIS_OBJEKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BASIS_OBJEKT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BASIS_OBJEKT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BASIS_OBJEKT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Basis Objekt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BASIS_OBJEKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Anzeige_Element_TypeClassImpl <em>ID Bedien Anzeige Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Anzeige_Element_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bedien_Anzeige_Element_TypeClass()
	 * @generated
	 */
	int ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS = 17;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Bedien Anzeige Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Bezirk_TypeClassImpl <em>ID Bedien Bezirk Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Bezirk_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bedien_Bezirk_TypeClass()
	 * @generated
	 */
	int ID_BEDIEN_BEZIRK_TYPE_CLASS = 18;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_BEZIRK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_BEZIRK_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_BEZIRK_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_BEZIRK_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Bedien Bezirk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_BEZIRK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Einrichtung_Oertlich_TypeClassImpl <em>ID Bedien Einrichtung Oertlich Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Einrichtung_Oertlich_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bedien_Einrichtung_Oertlich_TypeClass()
	 * @generated
	 */
	int ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS = 19;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Bedien Einrichtung Oertlich Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Oberflaeche_TypeClassImpl <em>ID Bedien Oberflaeche Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Oberflaeche_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bedien_Oberflaeche_TypeClass()
	 * @generated
	 */
	int ID_BEDIEN_OBERFLAECHE_TYPE_CLASS = 20;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_OBERFLAECHE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_OBERFLAECHE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_OBERFLAECHE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_OBERFLAECHE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Bedien Oberflaeche Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_OBERFLAECHE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Standort_TypeClassImpl <em>ID Bedien Standort Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Standort_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bedien_Standort_TypeClass()
	 * @generated
	 */
	int ID_BEDIEN_STANDORT_TYPE_CLASS = 21;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_STANDORT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_STANDORT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_STANDORT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_STANDORT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Bedien Standort Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_STANDORT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Zentrale_TypeClassImpl <em>ID Bedien Zentrale Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Zentrale_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bedien_Zentrale_TypeClass()
	 * @generated
	 */
	int ID_BEDIEN_ZENTRALE_TYPE_CLASS = 22;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ZENTRALE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ZENTRALE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ZENTRALE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ZENTRALE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Bedien Zentrale Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ZENTRALE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Befestigung_Bauwerk_TypeClassImpl <em>ID Befestigung Bauwerk Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Befestigung_Bauwerk_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Befestigung_Bauwerk_TypeClass()
	 * @generated
	 */
	int ID_BEFESTIGUNG_BAUWERK_TYPE_CLASS = 23;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEFESTIGUNG_BAUWERK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEFESTIGUNG_BAUWERK_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEFESTIGUNG_BAUWERK_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEFESTIGUNG_BAUWERK_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Befestigung Bauwerk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEFESTIGUNG_BAUWERK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Beginn_Bereich_TypeClassImpl <em>ID Beginn Bereich Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Beginn_Bereich_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Beginn_Bereich_TypeClass()
	 * @generated
	 */
	int ID_BEGINN_BEREICH_TYPE_CLASS = 24;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEGINN_BEREICH_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEGINN_BEREICH_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEGINN_BEREICH_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEGINN_BEREICH_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Beginn Bereich Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEGINN_BEREICH_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bezugspunkt_Positionierung_TypeClassImpl <em>ID Bezugspunkt Positionierung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bezugspunkt_Positionierung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bezugspunkt_Positionierung_TypeClass()
	 * @generated
	 */
	int ID_BEZUGSPUNKT_POSITIONIERUNG_TYPE_CLASS = 25;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEZUGSPUNKT_POSITIONIERUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEZUGSPUNKT_POSITIONIERUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEZUGSPUNKT_POSITIONIERUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEZUGSPUNKT_POSITIONIERUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Bezugspunkt Positionierung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEZUGSPUNKT_POSITIONIERUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Binaerdaten_ohne_Proxy_TypeClassImpl <em>ID Binaerdaten ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Binaerdaten_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Binaerdaten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_BINAERDATEN_OHNE_PROXY_TYPE_CLASS = 26;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BINAERDATEN_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BINAERDATEN_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BINAERDATEN_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BINAERDATEN_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Binaerdaten ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BINAERDATEN_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Block_Anlage_TypeClassImpl <em>ID Block Anlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Block_Anlage_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Block_Anlage_TypeClass()
	 * @generated
	 */
	int ID_BLOCK_ANLAGE_TYPE_CLASS = 27;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ANLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ANLAGE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ANLAGE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ANLAGE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Block Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Block_Element_TypeClassImpl <em>ID Block Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Block_Element_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Block_Element_TypeClass()
	 * @generated
	 */
	int ID_BLOCK_ELEMENT_TYPE_CLASS = 28;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ELEMENT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Block Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Block_Strecke_TypeClassImpl <em>ID Block Strecke Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Block_Strecke_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Block_Strecke_TypeClass()
	 * @generated
	 */
	int ID_BLOCK_STRECKE_TYPE_CLASS = 29;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_STRECKE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_STRECKE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_STRECKE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_STRECKE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Block Strecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_STRECKE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Anlage_ohne_Proxy_TypeClassImpl <em>ID BUE Anlage ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Anlage_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS = 30;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID BUE Anlage ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Anlage_TypeClassImpl <em>ID BUE Anlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Anlage_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_Anlage_TypeClass()
	 * @generated
	 */
	int ID_BUE_ANLAGE_TYPE_CLASS = 31;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID BUE Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Bedien_Anzeige_Element_TypeClassImpl <em>ID BUE Bedien Anzeige Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Bedien_Anzeige_Element_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_Bedien_Anzeige_Element_TypeClass()
	 * @generated
	 */
	int ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS = 32;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID BUE Bedien Anzeige Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Einschaltung_TypeClassImpl <em>ID BUE Einschaltung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Einschaltung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_Einschaltung_TypeClass()
	 * @generated
	 */
	int ID_BUE_EINSCHALTUNG_TYPE_CLASS = 33;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_EINSCHALTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_EINSCHALTUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_EINSCHALTUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_EINSCHALTUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID BUE Einschaltung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_EINSCHALTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Gleisbezogener_Gefahrraum_TypeClassImpl <em>ID BUE Gleisbezogener Gefahrraum Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Gleisbezogener_Gefahrraum_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_Gleisbezogener_Gefahrraum_TypeClass()
	 * @generated
	 */
	int ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS = 34;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID BUE Gleisbezogener Gefahrraum Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Schnittstelle_TypeClassImpl <em>ID BUE Schnittstelle Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Schnittstelle_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_Schnittstelle_TypeClass()
	 * @generated
	 */
	int ID_BUE_SCHNITTSTELLE_TYPE_CLASS = 35;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_SCHNITTSTELLE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_SCHNITTSTELLE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_SCHNITTSTELLE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_SCHNITTSTELLE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID BUE Schnittstelle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_SCHNITTSTELLE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_WS_Fstr_Zuordnung_TypeClassImpl <em>ID BUE WS Fstr Zuordnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_WS_Fstr_Zuordnung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_WS_Fstr_Zuordnung_TypeClass()
	 * @generated
	 */
	int ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS = 36;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID BUE WS Fstr Zuordnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Datenpunkt_ohne_Proxy_TypeClassImpl <em>ID Datenpunkt ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Datenpunkt_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Datenpunkt_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS = 37;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Datenpunkt ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Datenpunkt_TypeClassImpl <em>ID Datenpunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Datenpunkt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Datenpunkt_TypeClass()
	 * @generated
	 */
	int ID_DATENPUNKT_TYPE_CLASS = 38;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Datenpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_DP_Bezug_Funktional_TypeClassImpl <em>ID DP Bezug Funktional Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_DP_Bezug_Funktional_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_DP_Bezug_Funktional_TypeClass()
	 * @generated
	 */
	int ID_DP_BEZUG_FUNKTIONAL_TYPE_CLASS = 39;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DP_BEZUG_FUNKTIONAL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DP_BEZUG_FUNKTIONAL_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DP_BEZUG_FUNKTIONAL_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DP_BEZUG_FUNKTIONAL_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID DP Bezug Funktional Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DP_BEZUG_FUNKTIONAL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Einschaltpunkt_TypeClassImpl <em>ID Einschaltpunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Einschaltpunkt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Einschaltpunkt_TypeClass()
	 * @generated
	 */
	int ID_EINSCHALTPUNKT_TYPE_CLASS = 40;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EINSCHALTPUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EINSCHALTPUNKT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EINSCHALTPUNKT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EINSCHALTPUNKT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Einschaltpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EINSCHALTPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Element_Grenze_TypeClassImpl <em>ID Element Grenze Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Element_Grenze_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Element_Grenze_TypeClass()
	 * @generated
	 */
	int ID_ELEMENT_GRENZE_TYPE_CLASS = 41;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_GRENZE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_GRENZE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_GRENZE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_GRENZE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Element Grenze Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_GRENZE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Element_TypeClassImpl <em>ID Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Element_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Element_TypeClass()
	 * @generated
	 */
	int ID_ELEMENT_TYPE_CLASS = 42;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Element_Unterbringung_TypeClassImpl <em>ID Element Unterbringung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Element_Unterbringung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Element_Unterbringung_TypeClass()
	 * @generated
	 */
	int ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS = 43;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Element Unterbringung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Energie_Eingang_TypeClassImpl <em>ID Energie Eingang Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Energie_Eingang_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Energie_Eingang_TypeClass()
	 * @generated
	 */
	int ID_ENERGIE_EINGANG_TYPE_CLASS = 44;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_EINGANG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_EINGANG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_EINGANG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_EINGANG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Energie Eingang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_EINGANG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Energie_TypeClassImpl <em>ID Energie Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Energie_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Energie_TypeClass()
	 * @generated
	 */
	int ID_ENERGIE_TYPE_CLASS = 45;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Energie Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ESTW_Zentraleinheit_TypeClassImpl <em>ID ESTW Zentraleinheit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ESTW_Zentraleinheit_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ESTW_Zentraleinheit_TypeClass()
	 * @generated
	 */
	int ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS = 46;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ESTW Zentraleinheit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ETCS_Kante_TypeClassImpl <em>ID ETCS Kante Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ETCS_Kante_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ETCS_Kante_TypeClass()
	 * @generated
	 */
	int ID_ETCS_KANTE_TYPE_CLASS = 47;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KANTE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KANTE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KANTE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KANTE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ETCS Kante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KANTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ETCS_Knoten_ohne_Proxy_TypeClassImpl <em>ID ETCS Knoten ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ETCS_Knoten_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ETCS_Knoten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS = 48;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ETCS Knoten ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ETCS_Knoten_TypeClassImpl <em>ID ETCS Knoten Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ETCS_Knoten_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ETCS_Knoten_TypeClass()
	 * @generated
	 */
	int ID_ETCS_KNOTEN_TYPE_CLASS = 49;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ETCS Knoten Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_EV_Modul_TypeClassImpl <em>ID EV Modul Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_EV_Modul_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_EV_Modul_TypeClass()
	 * @generated
	 */
	int ID_EV_MODUL_TYPE_CLASS = 50;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EV_MODUL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EV_MODUL_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EV_MODUL_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EV_MODUL_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID EV Modul Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EV_MODUL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fachtelegramm_ohne_Proxy_TypeClassImpl <em>ID Fachtelegramm ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fachtelegramm_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fachtelegramm_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_FACHTELEGRAMM_OHNE_PROXY_TYPE_CLASS = 51;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FACHTELEGRAMM_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FACHTELEGRAMM_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FACHTELEGRAMM_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FACHTELEGRAMM_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Fachtelegramm ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FACHTELEGRAMM_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fachtelegramm_TypeClassImpl <em>ID Fachtelegramm Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fachtelegramm_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fachtelegramm_TypeClass()
	 * @generated
	 */
	int ID_FACHTELEGRAMM_TYPE_CLASS = 52;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FACHTELEGRAMM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FACHTELEGRAMM_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FACHTELEGRAMM_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FACHTELEGRAMM_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Fachtelegramm Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FACHTELEGRAMM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fla_Schutz_TypeClassImpl <em>ID Fla Schutz Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fla_Schutz_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fla_Schutz_TypeClass()
	 * @generated
	 */
	int ID_FLA_SCHUTZ_TYPE_CLASS = 53;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FLA_SCHUTZ_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FLA_SCHUTZ_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FLA_SCHUTZ_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FLA_SCHUTZ_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Fla Schutz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FLA_SCHUTZ_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Anlage_Rangier_Frei_TypeClassImpl <em>ID FMA Anlage Rangier Frei Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Anlage_Rangier_Frei_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_FMA_Anlage_Rangier_Frei_TypeClass()
	 * @generated
	 */
	int ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS = 54;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID FMA Anlage Rangier Frei Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Anlage_TypeClassImpl <em>ID FMA Anlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Anlage_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_FMA_Anlage_TypeClass()
	 * @generated
	 */
	int ID_FMA_ANLAGE_TYPE_CLASS = 55;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID FMA Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Element_TypeClassImpl <em>ID FMA Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Element_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_FMA_Element_TypeClass()
	 * @generated
	 */
	int ID_FMA_ELEMENT_TYPE_CLASS = 56;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ELEMENT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID FMA Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Komponente_TypeClassImpl <em>ID FMA Komponente Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Komponente_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_FMA_Komponente_TypeClass()
	 * @generated
	 */
	int ID_FMA_KOMPONENTE_TYPE_CLASS = 57;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_KOMPONENTE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_KOMPONENTE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_KOMPONENTE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_KOMPONENTE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID FMA Komponente Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_KOMPONENTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fortschaltung_Start_TypeClassImpl <em>ID Fortschaltung Start Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fortschaltung_Start_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fortschaltung_Start_TypeClass()
	 * @generated
	 */
	int ID_FORTSCHALTUNG_START_TYPE_CLASS = 58;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FORTSCHALTUNG_START_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FORTSCHALTUNG_START_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FORTSCHALTUNG_START_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FORTSCHALTUNG_START_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Fortschaltung Start Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FORTSCHALTUNG_START_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Aneinander_TypeClassImpl <em>ID Fstr Aneinander Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Aneinander_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_Aneinander_TypeClass()
	 * @generated
	 */
	int ID_FSTR_ANEINANDER_TYPE_CLASS = 59;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ANEINANDER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ANEINANDER_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ANEINANDER_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ANEINANDER_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Fstr Aneinander Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ANEINANDER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Ausschluss_Besonders_TypeClassImpl <em>ID Fstr Ausschluss Besonders Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Ausschluss_Besonders_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_Ausschluss_Besonders_TypeClass()
	 * @generated
	 */
	int ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS = 60;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Fstr Ausschluss Besonders Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_DWeg_ohne_Proxy_TypeClassImpl <em>ID Fstr DWeg ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_DWeg_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_DWeg_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_FSTR_DWEG_OHNE_PROXY_TYPE_CLASS = 61;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_DWEG_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_DWEG_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_DWEG_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_DWEG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Fstr DWeg ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_DWEG_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_DWeg_TypeClassImpl <em>ID Fstr DWeg Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_DWeg_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_DWeg_TypeClass()
	 * @generated
	 */
	int ID_FSTR_DWEG_TYPE_CLASS = 62;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_DWEG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_DWEG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_DWEG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_DWEG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Fstr DWeg Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_DWEG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Fahrweg_ohne_Proxy_TypeClassImpl <em>ID Fstr Fahrweg ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Fahrweg_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_Fahrweg_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_FSTR_FAHRWEG_OHNE_PROXY_TYPE_CLASS = 63;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_FAHRWEG_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_FAHRWEG_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_FAHRWEG_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_FAHRWEG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Fstr Fahrweg ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_FAHRWEG_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Fahrweg_TypeClassImpl <em>ID Fstr Fahrweg Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Fahrweg_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_Fahrweg_TypeClass()
	 * @generated
	 */
	int ID_FSTR_FAHRWEG_TYPE_CLASS = 64;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_FAHRWEG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_FAHRWEG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_FAHRWEG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_FAHRWEG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Fstr Fahrweg Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_FAHRWEG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Zug_Rangier_TypeClassImpl <em>ID Fstr Zug Rangier Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Zug_Rangier_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_Zug_Rangier_TypeClass()
	 * @generated
	 */
	int ID_FSTR_ZUG_RANGIER_TYPE_CLASS = 65;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ZUG_RANGIER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ZUG_RANGIER_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ZUG_RANGIER_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ZUG_RANGIER_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Fstr Zug Rangier Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ZUG_RANGIER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_FT_Anschaltbedingung_TypeClassImpl <em>ID FT Anschaltbedingung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_FT_Anschaltbedingung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_FT_Anschaltbedingung_TypeClass()
	 * @generated
	 */
	int ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS = 66;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID FT Anschaltbedingung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_FT_Fahrweg_Teil_TypeClassImpl <em>ID FT Fahrweg Teil Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_FT_Fahrweg_Teil_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_FT_Fahrweg_Teil_TypeClass()
	 * @generated
	 */
	int ID_FT_FAHRWEG_TEIL_TYPE_CLASS = 67;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_FAHRWEG_TEIL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_FAHRWEG_TEIL_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_FAHRWEG_TEIL_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_FAHRWEG_TEIL_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID FT Fahrweg Teil Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_FAHRWEG_TEIL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Art_TypeClassImpl <em>ID GEO Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_GEO_Art_TypeClass()
	 * @generated
	 */
	int ID_GEO_ART_TYPE_CLASS = 68;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_ART_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_ART_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_ART_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID GEO Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Kante_TypeClassImpl <em>ID GEO Kante Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Kante_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_GEO_Kante_TypeClass()
	 * @generated
	 */
	int ID_GEO_KANTE_TYPE_CLASS = 69;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_KANTE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_KANTE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_KANTE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_KANTE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID GEO Kante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_KANTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Knoten_TypeClassImpl <em>ID GEO Knoten Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Knoten_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_GEO_Knoten_TypeClass()
	 * @generated
	 */
	int ID_GEO_KNOTEN_TYPE_CLASS = 70;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_KNOTEN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_KNOTEN_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_KNOTEN_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_KNOTEN_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID GEO Knoten Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_KNOTEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Punkt_ohne_Proxy_TypeClassImpl <em>ID GEO Punkt ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Punkt_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_GEO_Punkt_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS = 71;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID GEO Punkt ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Punkt_TypeClassImpl <em>ID GEO Punkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Punkt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_GEO_Punkt_TypeClass()
	 * @generated
	 */
	int ID_GEO_PUNKT_TYPE_CLASS = 72;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID GEO Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_GFR_Anlage_ohne_Proxy_TypeClassImpl <em>ID GFR Anlage ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_GFR_Anlage_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_GFR_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS = 73;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID GFR Anlage ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Gleis_Abschnitt_TypeClassImpl <em>ID Gleis Abschnitt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Gleis_Abschnitt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Gleis_Abschnitt_TypeClass()
	 * @generated
	 */
	int ID_GLEIS_ABSCHNITT_TYPE_CLASS = 74;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_ABSCHNITT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_ABSCHNITT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_ABSCHNITT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_ABSCHNITT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Gleis Abschnitt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_ABSCHNITT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Gleis_Bezeichnung_TypeClassImpl <em>ID Gleis Bezeichnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Gleis_Bezeichnung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Gleis_Bezeichnung_TypeClass()
	 * @generated
	 */
	int ID_GLEIS_BEZEICHNUNG_TYPE_CLASS = 75;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_BEZEICHNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_BEZEICHNUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_BEZEICHNUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_BEZEICHNUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Gleis Bezeichnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_BEZEICHNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Grenzzeichen_TypeClassImpl <em>ID Grenzzeichen Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Grenzzeichen_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Grenzzeichen_TypeClass()
	 * @generated
	 */
	int ID_GRENZZEICHEN_TYPE_CLASS = 76;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GRENZZEICHEN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GRENZZEICHEN_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GRENZZEICHEN_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GRENZZEICHEN_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Grenzzeichen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GRENZZEICHEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Handschalt_Wirkfunktion_TypeClassImpl <em>ID Handschalt Wirkfunktion Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Handschalt_Wirkfunktion_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Handschalt_Wirkfunktion_TypeClass()
	 * @generated
	 */
	int ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS = 77;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Handschalt Wirkfunktion Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Hoehenpunkt_TypeClassImpl <em>ID Hoehenpunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Hoehenpunkt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Hoehenpunkt_TypeClass()
	 * @generated
	 */
	int ID_HOEHENPUNKT_TYPE_CLASS = 78;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HOEHENPUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HOEHENPUNKT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HOEHENPUNKT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HOEHENPUNKT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Hoehenpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HOEHENPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Information_Eingang_TypeClassImpl <em>ID Information Eingang Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Information_Eingang_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Information_Eingang_TypeClass()
	 * @generated
	 */
	int ID_INFORMATION_EINGANG_TYPE_CLASS = 79;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_EINGANG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_EINGANG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_EINGANG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_EINGANG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Information Eingang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_EINGANG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Information_Primaer_TypeClassImpl <em>ID Information Primaer Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Information_Primaer_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Information_Primaer_TypeClass()
	 * @generated
	 */
	int ID_INFORMATION_PRIMAER_TYPE_CLASS = 80;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_PRIMAER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_PRIMAER_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_PRIMAER_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_PRIMAER_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Information Primaer Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_PRIMAER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Komponente_Programmiert_TypeClassImpl <em>ID Komponente Programmiert Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Komponente_Programmiert_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Komponente_Programmiert_TypeClass()
	 * @generated
	 */
	int ID_KOMPONENTE_PROGRAMMIERT_TYPE_CLASS = 81;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_KOMPONENTE_PROGRAMMIERT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_KOMPONENTE_PROGRAMMIERT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_KOMPONENTE_PROGRAMMIERT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_KOMPONENTE_PROGRAMMIERT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Komponente Programmiert Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_KOMPONENTE_PROGRAMMIERT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Lageplan_Blattschnitt_TypeClassImpl <em>ID Lageplan Blattschnitt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Lageplan_Blattschnitt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Lageplan_Blattschnitt_TypeClass()
	 * @generated
	 */
	int ID_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS = 82;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Lageplan Blattschnitt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Lageplan_TypeClassImpl <em>ID Lageplan Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Lageplan_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Lageplan_TypeClass()
	 * @generated
	 */
	int ID_LAGEPLAN_TYPE_CLASS = 83;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Lageplan Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Lageplan_Zustand_TypeClassImpl <em>ID Lageplan Zustand Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Lageplan_Zustand_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Lageplan_Zustand_TypeClass()
	 * @generated
	 */
	int ID_LAGEPLAN_ZUSTAND_TYPE_CLASS = 84;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_ZUSTAND_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_ZUSTAND_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_ZUSTAND_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_ZUSTAND_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Lageplan Zustand Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LAGEPLAN_ZUSTAND_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Anlage_ohne_Proxy_TypeClassImpl <em>ID LEU Anlage ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Anlage_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_LEU_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS = 85;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID LEU Anlage ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Anlage_TypeClassImpl <em>ID LEU Anlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Anlage_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_LEU_Anlage_TypeClass()
	 * @generated
	 */
	int ID_LEU_ANLAGE_TYPE_CLASS = 86;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID LEU Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Bezug_Funktional_TypeClassImpl <em>ID LEU Bezug Funktional Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Bezug_Funktional_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_LEU_Bezug_Funktional_TypeClass()
	 * @generated
	 */
	int ID_LEU_BEZUG_FUNKTIONAL_TYPE_CLASS = 87;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_BEZUG_FUNKTIONAL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_BEZUG_FUNKTIONAL_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_BEZUG_FUNKTIONAL_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_BEZUG_FUNKTIONAL_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID LEU Bezug Funktional Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_BEZUG_FUNKTIONAL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Schaltkasten_ohne_Proxy_TypeClassImpl <em>ID LEU Schaltkasten ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Schaltkasten_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_LEU_Schaltkasten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS = 88;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID LEU Schaltkasten ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_LO_Einbau_TypeClassImpl <em>ID LO Einbau Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_LO_Einbau_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_LO_Einbau_TypeClass()
	 * @generated
	 */
	int ID_LO_EINBAU_TYPE_CLASS = 89;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LO_EINBAU_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LO_EINBAU_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LO_EINBAU_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LO_EINBAU_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID LO Einbau Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LO_EINBAU_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Markante_Stelle_TypeClassImpl <em>ID Markante Stelle Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Markante_Stelle_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Markante_Stelle_TypeClass()
	 * @generated
	 */
	int ID_MARKANTE_STELLE_TYPE_CLASS = 90;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTE_STELLE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTE_STELLE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTE_STELLE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTE_STELLE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Markante Stelle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTE_STELLE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Markanter_Punkt_Gleis_Abschluss_TypeClassImpl <em>ID Markanter Punkt Gleis Abschluss Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Markanter_Punkt_Gleis_Abschluss_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Markanter_Punkt_Gleis_Abschluss_TypeClass()
	 * @generated
	 */
	int ID_MARKANTER_PUNKT_GLEIS_ABSCHLUSS_TYPE_CLASS = 91;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTER_PUNKT_GLEIS_ABSCHLUSS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTER_PUNKT_GLEIS_ABSCHLUSS_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTER_PUNKT_GLEIS_ABSCHLUSS_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTER_PUNKT_GLEIS_ABSCHLUSS_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Markanter Punkt Gleis Abschluss Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTER_PUNKT_GLEIS_ABSCHLUSS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Markanter_Punkt_TypeClassImpl <em>ID Markanter Punkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Markanter_Punkt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Markanter_Punkt_TypeClass()
	 * @generated
	 */
	int ID_MARKANTER_PUNKT_TYPE_CLASS = 92;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTER_PUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTER_PUNKT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTER_PUNKT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTER_PUNKT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Markanter Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTER_PUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_NB_Element_TypeClassImpl <em>ID NB Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_NB_Element_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_NB_Element_TypeClass()
	 * @generated
	 */
	int ID_NB_ELEMENT_TYPE_CLASS = 93;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ELEMENT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID NB Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_NB_TypeClassImpl <em>ID NB Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_NB_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_NB_TypeClass()
	 * @generated
	 */
	int ID_NB_TYPE_CLASS = 94;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID NB Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_NB_Zone_TypeClassImpl <em>ID NB Zone Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_NB_Zone_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_NB_Zone_TypeClass()
	 * @generated
	 */
	int ID_NB_ZONE_TYPE_CLASS = 95;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ZONE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ZONE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ZONE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ZONE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID NB Zone Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ZONE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Oertlichkeit_Ausgabe_TypeClassImpl <em>ID Oertlichkeit Ausgabe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Oertlichkeit_Ausgabe_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Oertlichkeit_Ausgabe_TypeClass()
	 * @generated
	 */
	int ID_OERTLICHKEIT_AUSGABE_TYPE_CLASS = 96;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_AUSGABE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_AUSGABE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_AUSGABE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_AUSGABE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Oertlichkeit Ausgabe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_AUSGABE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Oertlichkeit_Proxy_TypeClassImpl <em>ID Oertlichkeit Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Oertlichkeit_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Oertlichkeit_Proxy_TypeClass()
	 * @generated
	 */
	int ID_OERTLICHKEIT_PROXY_TYPE_CLASS = 97;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Oertlichkeit Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Oertlichkeit_TypeClassImpl <em>ID Oertlichkeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Oertlichkeit_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Oertlichkeit_TypeClass()
	 * @generated
	 */
	int ID_OERTLICHKEIT_TYPE_CLASS = 98;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Oertlichkeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_PlanPro_Schnittstelle_TypeClassImpl <em>ID Plan Pro Schnittstelle Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_PlanPro_Schnittstelle_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_PlanPro_Schnittstelle_TypeClass()
	 * @generated
	 */
	int ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS = 99;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Plan Pro Schnittstelle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Planung_Einzel_TypeClassImpl <em>ID Planung Einzel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Planung_Einzel_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Planung_Einzel_TypeClass()
	 * @generated
	 */
	int ID_PLANUNG_EINZEL_TYPE_CLASS = 100;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNG_EINZEL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNG_EINZEL_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNG_EINZEL_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNG_EINZEL_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Planung Einzel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNG_EINZEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Planungsgrundlage_TypeClassImpl <em>ID Planungsgrundlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Planungsgrundlage_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Planungsgrundlage_TypeClass()
	 * @generated
	 */
	int ID_PLANUNGSGRUNDLAGE_TYPE_CLASS = 101;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNGSGRUNDLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNGSGRUNDLAGE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNGSGRUNDLAGE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNGSGRUNDLAGE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Planungsgrundlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNGSGRUNDLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_Bezugspunkt_TypeClassImpl <em>ID PZB Element Bezugspunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_Bezugspunkt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_Bezugspunkt_TypeClass()
	 * @generated
	 */
	int ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS = 102;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID PZB Element Bezugspunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_Mitnutzung_TypeClassImpl <em>ID PZB Element Mitnutzung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_Mitnutzung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_Mitnutzung_TypeClass()
	 * @generated
	 */
	int ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS = 103;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID PZB Element Mitnutzung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_TypeClassImpl <em>ID PZB Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_TypeClass()
	 * @generated
	 */
	int ID_PZB_ELEMENT_TYPE_CLASS = 104;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID PZB Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_Zuordnung_TypeClassImpl <em>ID PZB Element Zuordnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_Zuordnung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_Zuordnung_TypeClass()
	 * @generated
	 */
	int ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS = 105;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID PZB Element Zuordnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Quellelement_TypeClassImpl <em>ID Quellelement Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Quellelement_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Quellelement_TypeClass()
	 * @generated
	 */
	int ID_QUELLELEMENT_TYPE_CLASS = 106;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_QUELLELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_QUELLELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_QUELLELEMENT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_QUELLELEMENT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Quellelement Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_QUELLELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_RBC_TypeClassImpl <em>ID RBC Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_RBC_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_RBC_TypeClass()
	 * @generated
	 */
	int ID_RBC_TYPE_CLASS = 107;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_RBC_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_RBC_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_RBC_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_RBC_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID RBC Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_RBC_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Regelzeichnung_ohne_Proxy_TypeClassImpl <em>ID Regelzeichnung ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Regelzeichnung_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Regelzeichnung_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_REGELZEICHNUNG_OHNE_PROXY_TYPE_CLASS = 108;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REGELZEICHNUNG_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REGELZEICHNUNG_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REGELZEICHNUNG_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REGELZEICHNUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Regelzeichnung ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REGELZEICHNUNG_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Regelzeichnung_TypeClassImpl <em>ID Regelzeichnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Regelzeichnung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Regelzeichnung_TypeClass()
	 * @generated
	 */
	int ID_REGELZEICHNUNG_TYPE_CLASS = 109;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REGELZEICHNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REGELZEICHNUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REGELZEICHNUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REGELZEICHNUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Regelzeichnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REGELZEICHNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Schalter_TypeClassImpl <em>ID Schalter Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Schalter_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Schalter_TypeClass()
	 * @generated
	 */
	int ID_SCHALTER_TYPE_CLASS = 110;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTER_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTER_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTER_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Schalter Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Schaltmittel_Zuordnung_TypeClassImpl <em>ID Schaltmittel Zuordnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Schaltmittel_Zuordnung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Schaltmittel_Zuordnung_TypeClass()
	 * @generated
	 */
	int ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS = 111;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Schaltmittel Zuordnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Schlosskombination_TypeClassImpl <em>ID Schlosskombination Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Schlosskombination_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Schlosskombination_TypeClass()
	 * @generated
	 */
	int ID_SCHLOSSKOMBINATION_TYPE_CLASS = 112;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLOSSKOMBINATION_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLOSSKOMBINATION_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLOSSKOMBINATION_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLOSSKOMBINATION_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Schlosskombination Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLOSSKOMBINATION_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Schluessel_TypeClassImpl <em>ID Schluessel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Schluessel_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Schluessel_TypeClass()
	 * @generated
	 */
	int ID_SCHLUESSEL_TYPE_CLASS = 113;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSEL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSEL_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSEL_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSEL_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Schluessel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Schluesselsperre_TypeClassImpl <em>ID Schluesselsperre Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Schluesselsperre_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Schluesselsperre_TypeClass()
	 * @generated
	 */
	int ID_SCHLUESSELSPERRE_TYPE_CLASS = 114;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSELSPERRE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSELSPERRE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSELSPERRE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSELSPERRE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Schluesselsperre Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSELSPERRE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Befestigung_TypeClassImpl <em>ID Signal Befestigung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Befestigung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_Befestigung_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS = 115;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Signal Befestigung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Fank_TypeClassImpl <em>ID Signal Fank Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Fank_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_Fank_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_FANK_TYPE_CLASS = 116;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_FANK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_FANK_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_FANK_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_FANK_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Signal Fank Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_FANK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Gleisbezechnung_TypeClassImpl <em>ID Signal Gleisbezechnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Gleisbezechnung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_Gleisbezechnung_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS = 117;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Signal Gleisbezechnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_ohne_Proxy_TypeClassImpl <em>ID Signal ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_OHNE_PROXY_TYPE_CLASS = 118;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Signal ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Rahmen_TypeClassImpl <em>ID Signal Rahmen Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Rahmen_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_Rahmen_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_RAHMEN_TYPE_CLASS = 119;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_RAHMEN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_RAHMEN_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_RAHMEN_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_RAHMEN_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Signal Rahmen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_RAHMEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Signalbegriff_TypeClassImpl <em>ID Signal Signalbegriff Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Signalbegriff_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_Signalbegriff_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS = 120;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Signal Signalbegriff Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Start_TypeClassImpl <em>ID Signal Start Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Start_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_Start_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_START_TYPE_CLASS = 121;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_START_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_START_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_START_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_START_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Signal Start Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_START_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_TypeClassImpl <em>ID Signal Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_TYPE_CLASS = 122;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Signal Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Sonderanlage_TypeClassImpl <em>ID Sonderanlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Sonderanlage_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Sonderanlage_TypeClass()
	 * @generated
	 */
	int ID_SONDERANLAGE_TYPE_CLASS = 123;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SONDERANLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SONDERANLAGE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SONDERANLAGE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SONDERANLAGE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Sonderanlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SONDERANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Stellelement_TypeClassImpl <em>ID Stellelement Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Stellelement_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Stellelement_TypeClass()
	 * @generated
	 */
	int ID_STELLELEMENT_TYPE_CLASS = 124;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLELEMENT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLELEMENT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Stellelement Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Stellwerk_TypeClassImpl <em>ID Stellwerk Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Stellwerk_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Stellwerk_TypeClass()
	 * @generated
	 */
	int ID_STELLWERK_TYPE_CLASS = 125;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLWERK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLWERK_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLWERK_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLWERK_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Stellwerk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLWERK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Strecke_Bremsweg_ohne_Proxy_TypeClassImpl <em>ID Strecke Bremsweg ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Strecke_Bremsweg_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Strecke_Bremsweg_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_STRECKE_BREMSWEG_OHNE_PROXY_TYPE_CLASS = 126;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_BREMSWEG_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_BREMSWEG_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_BREMSWEG_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_BREMSWEG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Strecke Bremsweg ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_BREMSWEG_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Strecke_Punkt_TypeClassImpl <em>ID Strecke Punkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Strecke_Punkt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Strecke_Punkt_TypeClass()
	 * @generated
	 */
	int ID_STRECKE_PUNKT_TYPE_CLASS = 127;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_PUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_PUNKT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_PUNKT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_PUNKT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Strecke Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_PUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Strecke_TypeClassImpl <em>ID Strecke Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Strecke_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Strecke_TypeClass()
	 * @generated
	 */
	int ID_STRECKE_TYPE_CLASS = 128;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Strecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Technischer_Punkt_TypeClassImpl <em>ID Technischer Punkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Technischer_Punkt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Technischer_Punkt_TypeClass()
	 * @generated
	 */
	int ID_TECHNISCHER_PUNKT_TYPE_CLASS = 129;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TECHNISCHER_PUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TECHNISCHER_PUNKT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TECHNISCHER_PUNKT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TECHNISCHER_PUNKT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Technischer Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TECHNISCHER_PUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_TOP_Kante_ohne_Proxy_TypeClassImpl <em>ID TOP Kante ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_TOP_Kante_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_TOP_Kante_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS = 130;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID TOP Kante ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_TOP_Kante_TypeClassImpl <em>ID TOP Kante Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_TOP_Kante_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_TOP_Kante_TypeClass()
	 * @generated
	 */
	int ID_TOP_KANTE_TYPE_CLASS = 131;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID TOP Kante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_TOP_Knoten_TypeClassImpl <em>ID TOP Knoten Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_TOP_Knoten_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_TOP_Knoten_TypeClass()
	 * @generated
	 */
	int ID_TOP_KNOTEN_TYPE_CLASS = 132;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KNOTEN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KNOTEN_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KNOTEN_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KNOTEN_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID TOP Knoten Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KNOTEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Trasse_Kante_TypeClassImpl <em>ID Trasse Kante Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Trasse_Kante_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Trasse_Kante_TypeClass()
	 * @generated
	 */
	int ID_TRASSE_KANTE_TYPE_CLASS = 133;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KANTE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KANTE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KANTE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KANTE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Trasse Kante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KANTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Trasse_Knoten_TypeClassImpl <em>ID Trasse Knoten Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Trasse_Knoten_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Trasse_Knoten_TypeClass()
	 * @generated
	 */
	int ID_TRASSE_KNOTEN_TYPE_CLASS = 134;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KNOTEN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KNOTEN_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KNOTEN_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KNOTEN_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Trasse Knoten Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KNOTEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Ueberhoehung_TypeClassImpl <em>ID Ueberhoehung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Ueberhoehung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Ueberhoehung_TypeClass()
	 * @generated
	 */
	int ID_UEBERHOEHUNG_TYPE_CLASS = 135;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERHOEHUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERHOEHUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERHOEHUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERHOEHUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Ueberhoehung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERHOEHUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Uebertragungsweg_Nach_TypeClassImpl <em>ID Uebertragungsweg Nach Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Uebertragungsweg_Nach_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Uebertragungsweg_Nach_TypeClass()
	 * @generated
	 */
	int ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS = 136;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Uebertragungsweg Nach Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Uebertragungsweg_Von_TypeClassImpl <em>ID Uebertragungsweg Von Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Uebertragungsweg_Von_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Uebertragungsweg_Von_TypeClass()
	 * @generated
	 */
	int ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS = 137;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Uebertragungsweg Von Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Umfahrpunkt_TypeClassImpl <em>ID Umfahrpunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Umfahrpunkt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Umfahrpunkt_TypeClass()
	 * @generated
	 */
	int ID_UMFAHRPUNKT_TYPE_CLASS = 138;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UMFAHRPUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UMFAHRPUNKT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UMFAHRPUNKT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UMFAHRPUNKT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Umfahrpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UMFAHRPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Unterbringung_ohne_Proxy_TypeClassImpl <em>ID Unterbringung ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Unterbringung_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Unterbringung_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS = 139;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Unterbringung ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Unterbringung_Technik_TypeClassImpl <em>ID Unterbringung Technik Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Unterbringung_Technik_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Unterbringung_Technik_TypeClass()
	 * @generated
	 */
	int ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS = 140;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Unterbringung Technik Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Unterbringung_TypeClassImpl <em>ID Unterbringung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Unterbringung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Unterbringung_TypeClass()
	 * @generated
	 */
	int ID_UNTERBRINGUNG_TYPE_CLASS = 141;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Unterbringung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Ur_Objekt_TypeClassImpl <em>ID Ur Objekt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Ur_Objekt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Ur_Objekt_TypeClass()
	 * @generated
	 */
	int ID_UR_OBJEKT_TYPE_CLASS = 142;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UR_OBJEKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UR_OBJEKT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UR_OBJEKT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UR_OBJEKT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Ur Objekt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UR_OBJEKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Verknuepftes_Element_TypeClassImpl <em>ID Verknuepftes Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Verknuepftes_Element_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Verknuepftes_Element_TypeClass()
	 * @generated
	 */
	int ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS = 143;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Verknuepftes Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Anlage_ohne_Proxy_TypeClassImpl <em>ID WKr Anlage ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Anlage_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS = 144;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID WKr Anlage ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Anlage_TypeClassImpl <em>ID WKr Anlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Anlage_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Anlage_TypeClass()
	 * @generated
	 */
	int ID_WKR_ANLAGE_TYPE_CLASS = 145;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID WKr Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Gsp_Element_TypeClassImpl <em>ID WKr Gsp Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Gsp_Element_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Gsp_Element_TypeClass()
	 * @generated
	 */
	int ID_WKR_GSP_ELEMENT_TYPE_CLASS = 146;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_ELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_ELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_ELEMENT_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID WKr Gsp Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Gsp_Komponente_TypeClassImpl <em>ID WKr Gsp Komponente Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Gsp_Komponente_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Gsp_Komponente_TypeClass()
	 * @generated
	 */
	int ID_WKR_GSP_KOMPONENTE_TYPE_CLASS = 147;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_KOMPONENTE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_KOMPONENTE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_KOMPONENTE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_KOMPONENTE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID WKr Gsp Komponente Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_KOMPONENTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Weichenlaufkette_TypeClassImpl <em>ID Weichenlaufkette Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Weichenlaufkette_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Weichenlaufkette_TypeClass()
	 * @generated
	 */
	int ID_WEICHENLAUFKETTE_TYPE_CLASS = 148;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WEICHENLAUFKETTE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WEICHENLAUFKETTE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WEICHENLAUFKETTE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WEICHENLAUFKETTE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Weichenlaufkette Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WEICHENLAUFKETTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Ziel_TypeClassImpl <em>ID Ziel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Ziel_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Ziel_TypeClass()
	 * @generated
	 */
	int ID_ZIEL_TYPE_CLASS = 149;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZIEL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZIEL_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZIEL_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZIEL_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Ziel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZIEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_DLP_Fstr_TypeClassImpl <em>ID ZL DLP Fstr Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_DLP_Fstr_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZL_DLP_Fstr_TypeClass()
	 * @generated
	 */
	int ID_ZL_DLP_FSTR_TYPE_CLASS = 150;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_DLP_FSTR_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_DLP_FSTR_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_DLP_FSTR_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_DLP_FSTR_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ZL DLP Fstr Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_DLP_FSTR_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_Fstr_TypeClassImpl <em>ID ZL Fstr Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_Fstr_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZL_Fstr_TypeClass()
	 * @generated
	 */
	int ID_ZL_FSTR_TYPE_CLASS = 151;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_FSTR_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_FSTR_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_FSTR_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_FSTR_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ZL Fstr Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_FSTR_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_Signalgruppe_TypeClassImpl <em>ID ZL Signalgruppe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_Signalgruppe_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZL_Signalgruppe_TypeClass()
	 * @generated
	 */
	int ID_ZL_SIGNALGRUPPE_TYPE_CLASS = 152;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_SIGNALGRUPPE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_SIGNALGRUPPE_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_SIGNALGRUPPE_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_SIGNALGRUPPE_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ZL Signalgruppe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_SIGNALGRUPPE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_TypeClassImpl <em>ID ZL Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZL_TypeClass()
	 * @generated
	 */
	int ID_ZL_TYPE_CLASS = 153;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ZL Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZLV_Bus_ohne_Proxy_TypeClassImpl <em>ID ZLV Bus ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZLV_Bus_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZLV_Bus_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_ZLV_BUS_OHNE_PROXY_TYPE_CLASS = 154;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZLV_BUS_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZLV_BUS_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZLV_BUS_OHNE_PROXY_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZLV_BUS_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ZLV Bus ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZLV_BUS_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZLV_Bus_TypeClassImpl <em>ID ZLV Bus Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZLV_Bus_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZLV_Bus_TypeClass()
	 * @generated
	 */
	int ID_ZLV_BUS_TYPE_CLASS = 155;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZLV_BUS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZLV_BUS_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZLV_BUS_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZLV_BUS_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ZLV Bus Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZLV_BUS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Anzeigefeld_Anstoss_TypeClassImpl <em>ID ZN Anzeigefeld Anstoss Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Anzeigefeld_Anstoss_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZN_Anzeigefeld_Anstoss_TypeClass()
	 * @generated
	 */
	int ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS = 156;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ZN Anzeigefeld Anstoss Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Anzeigefeld_TypeClassImpl <em>ID ZN Anzeigefeld Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Anzeigefeld_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZN_Anzeigefeld_TypeClass()
	 * @generated
	 */
	int ID_ZN_ANZEIGEFELD_TYPE_CLASS = 157;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ZN Anzeigefeld Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Fortschalt_Kriterium_TypeClassImpl <em>ID ZN Fortschalt Kriterium Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Fortschalt_Kriterium_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZN_Fortschalt_Kriterium_TypeClass()
	 * @generated
	 */
	int ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS = 158;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ZN Fortschalt Kriterium Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_TypeClassImpl <em>ID ZN Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZN_TypeClass()
	 * @generated
	 */
	int ID_ZN_TYPE_CLASS = 159;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ZN Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Unterstation_TypeClassImpl <em>ID ZN Unterstation Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Unterstation_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZN_Unterstation_TypeClass()
	 * @generated
	 */
	int ID_ZN_UNTERSTATION_TYPE_CLASS = 160;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_UNTERSTATION_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_UNTERSTATION_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_UNTERSTATION_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_UNTERSTATION_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ZN Unterstation Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_UNTERSTATION_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_ZBS_TypeClassImpl <em>ID ZN ZBS Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_ZBS_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZN_ZBS_TypeClass()
	 * @generated
	 */
	int ID_ZN_ZBS_TYPE_CLASS = 161;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ZBS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ZBS_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ZBS_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ZBS_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID ZN ZBS Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ZBS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Zugeinwirkung_TypeClassImpl <em>ID Zugeinwirkung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Zugeinwirkung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Zugeinwirkung_TypeClass()
	 * @generated
	 */
	int ID_ZUGEINWIRKUNG_TYPE_CLASS = 162;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZUGEINWIRKUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZUGEINWIRKUNG_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZUGEINWIRKUNG_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZUGEINWIRKUNG_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Zugeinwirkung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZUGEINWIRKUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Zweites_Haltfallkriterium_TypeClassImpl <em>ID Zweites Haltfallkriterium Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Zweites_Haltfallkriterium_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Zweites_Haltfallkriterium_TypeClass()
	 * @generated
	 */
	int ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS = 163;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS__VALUE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invalid Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS__INVALID_REFERENCE = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ID Zweites Haltfallkriterium Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Anforderer_Element_TypeClass <em>ID Anforderer Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Anforderer Element Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anforderer_Element_TypeClass
	 * @generated
	 */
	EClass getID_Anforderer_Element_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Anforderer_Element_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anforderer_Element_TypeClass#getValue()
	 * @see #getID_Anforderer_Element_TypeClass()
	 * @generated
	 */
	EReference getID_Anforderer_Element_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Anforderer_Element_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anforderer_Element_TypeClass#isInvalidReference()
	 * @see #getID_Anforderer_Element_TypeClass()
	 * @generated
	 */
	EAttribute getID_Anforderer_Element_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Anforderung_TypeClass <em>ID Anforderung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Anforderung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anforderung_TypeClass
	 * @generated
	 */
	EClass getID_Anforderung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Anforderung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anforderung_TypeClass#getValue()
	 * @see #getID_Anforderung_TypeClass()
	 * @generated
	 */
	EReference getID_Anforderung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Anforderung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anforderung_TypeClass#isInvalidReference()
	 * @see #getID_Anforderung_TypeClass()
	 * @generated
	 */
	EAttribute getID_Anforderung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Anhang_ohne_Proxy_TypeClass <em>ID Anhang ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Anhang ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anhang_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Anhang_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Anhang_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anhang_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Anhang_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Anhang_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Anhang_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anhang_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Anhang_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Anhang_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass <em>ID Anhang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Anhang Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass
	 * @generated
	 */
	EClass getID_Anhang_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass#getValue()
	 * @see #getID_Anhang_TypeClass()
	 * @generated
	 */
	EReference getID_Anhang_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass#isInvalidReference()
	 * @see #getID_Anhang_TypeClass()
	 * @generated
	 */
	EAttribute getID_Anhang_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_AnhangBearbeitungsvermerk_TypeClass <em>ID Anhang Bearbeitungsvermerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Anhang Bearbeitungsvermerk Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_AnhangBearbeitungsvermerk_TypeClass
	 * @generated
	 */
	EClass getID_AnhangBearbeitungsvermerk_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_AnhangBearbeitungsvermerk_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_AnhangBearbeitungsvermerk_TypeClass#getValue()
	 * @see #getID_AnhangBearbeitungsvermerk_TypeClass()
	 * @generated
	 */
	EReference getID_AnhangBearbeitungsvermerk_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_AnhangBearbeitungsvermerk_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_AnhangBearbeitungsvermerk_TypeClass#isInvalidReference()
	 * @see #getID_AnhangBearbeitungsvermerk_TypeClass()
	 * @generated
	 */
	EAttribute getID_AnhangBearbeitungsvermerk_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Anschluss_Element_TypeClass <em>ID Anschluss Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Anschluss Element Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anschluss_Element_TypeClass
	 * @generated
	 */
	EClass getID_Anschluss_Element_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Anschluss_Element_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anschluss_Element_TypeClass#getValue()
	 * @see #getID_Anschluss_Element_TypeClass()
	 * @generated
	 */
	EReference getID_Anschluss_Element_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Anschluss_Element_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anschluss_Element_TypeClass#isInvalidReference()
	 * @see #getID_Anschluss_Element_TypeClass()
	 * @generated
	 */
	EAttribute getID_Anschluss_Element_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_ohne_Proxy_TypeClass <em>ID ATO TS Instanz ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ATO TS Instanz ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_ATO_TS_Instanz_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_ATO_TS_Instanz_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_ATO_TS_Instanz_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_ATO_TS_Instanz_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_ATO_TS_Instanz_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_TypeClass <em>ID ATO TS Instanz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ATO TS Instanz Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_TypeClass
	 * @generated
	 */
	EClass getID_ATO_TS_Instanz_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_TypeClass#getValue()
	 * @see #getID_ATO_TS_Instanz_TypeClass()
	 * @generated
	 */
	EReference getID_ATO_TS_Instanz_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_TypeClass#isInvalidReference()
	 * @see #getID_ATO_TS_Instanz_TypeClass()
	 * @generated
	 */
	EAttribute getID_ATO_TS_Instanz_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass <em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_ohne_Proxy_TypeClass <em>ID Aussenelementansteuerung ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Aussenelementansteuerung ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Aussenelementansteuerung_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Aussenelementansteuerung_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Aussenelementansteuerung_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Aussenelementansteuerung_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Aussenelementansteuerung_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass <em>ID Aussenelementansteuerung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Aussenelementansteuerung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass
	 * @generated
	 */
	EClass getID_Aussenelementansteuerung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass#getValue()
	 * @see #getID_Aussenelementansteuerung_TypeClass()
	 * @generated
	 */
	EReference getID_Aussenelementansteuerung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass#isInvalidReference()
	 * @see #getID_Aussenelementansteuerung_TypeClass()
	 * @generated
	 */
	EAttribute getID_Aussenelementansteuerung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Anlage_TypeClass <em>ID Bahnsteig Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bahnsteig Anlage Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Anlage_TypeClass
	 * @generated
	 */
	EClass getID_Bahnsteig_Anlage_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Anlage_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Anlage_TypeClass#getValue()
	 * @see #getID_Bahnsteig_Anlage_TypeClass()
	 * @generated
	 */
	EReference getID_Bahnsteig_Anlage_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Anlage_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Anlage_TypeClass#isInvalidReference()
	 * @see #getID_Bahnsteig_Anlage_TypeClass()
	 * @generated
	 */
	EAttribute getID_Bahnsteig_Anlage_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_ohne_Proxy_TypeClass <em>ID Bahnsteig Kante ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bahnsteig Kante ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Bahnsteig_Kante_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Bahnsteig_Kante_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Bahnsteig_Kante_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Bahnsteig_Kante_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Bahnsteig_Kante_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_TypeClass <em>ID Bahnsteig Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bahnsteig Kante Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_TypeClass
	 * @generated
	 */
	EClass getID_Bahnsteig_Kante_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_TypeClass#getValue()
	 * @see #getID_Bahnsteig_Kante_TypeClass()
	 * @generated
	 */
	EReference getID_Bahnsteig_Kante_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_TypeClass#isInvalidReference()
	 * @see #getID_Bahnsteig_Kante_TypeClass()
	 * @generated
	 */
	EAttribute getID_Bahnsteig_Kante_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Balise_ohne_Proxy_TypeClass <em>ID Balise ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Balise ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Balise_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Balise_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Balise_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Balise_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Balise_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Balise_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Balise_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Balise_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Balise_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Balise_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Balise_TypeClass <em>ID Balise Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Balise Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Balise_TypeClass
	 * @generated
	 */
	EClass getID_Balise_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Balise_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Balise_TypeClass#getValue()
	 * @see #getID_Balise_TypeClass()
	 * @generated
	 */
	EReference getID_Balise_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Balise_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Balise_TypeClass#isInvalidReference()
	 * @see #getID_Balise_TypeClass()
	 * @generated
	 */
	EAttribute getID_Balise_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Basis_Objekt_TypeClass <em>ID Basis Objekt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Basis Objekt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Basis_Objekt_TypeClass
	 * @generated
	 */
	EClass getID_Basis_Objekt_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Basis_Objekt_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Basis_Objekt_TypeClass#getValue()
	 * @see #getID_Basis_Objekt_TypeClass()
	 * @generated
	 */
	EReference getID_Basis_Objekt_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Basis_Objekt_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Basis_Objekt_TypeClass#isInvalidReference()
	 * @see #getID_Basis_Objekt_TypeClass()
	 * @generated
	 */
	EAttribute getID_Basis_Objekt_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Anzeige_Element_TypeClass <em>ID Bedien Anzeige Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bedien Anzeige Element Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Anzeige_Element_TypeClass
	 * @generated
	 */
	EClass getID_Bedien_Anzeige_Element_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Anzeige_Element_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Anzeige_Element_TypeClass#getValue()
	 * @see #getID_Bedien_Anzeige_Element_TypeClass()
	 * @generated
	 */
	EReference getID_Bedien_Anzeige_Element_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Anzeige_Element_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Anzeige_Element_TypeClass#isInvalidReference()
	 * @see #getID_Bedien_Anzeige_Element_TypeClass()
	 * @generated
	 */
	EAttribute getID_Bedien_Anzeige_Element_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Bezirk_TypeClass <em>ID Bedien Bezirk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bedien Bezirk Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Bezirk_TypeClass
	 * @generated
	 */
	EClass getID_Bedien_Bezirk_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Bezirk_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Bezirk_TypeClass#getValue()
	 * @see #getID_Bedien_Bezirk_TypeClass()
	 * @generated
	 */
	EReference getID_Bedien_Bezirk_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Bezirk_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Bezirk_TypeClass#isInvalidReference()
	 * @see #getID_Bedien_Bezirk_TypeClass()
	 * @generated
	 */
	EAttribute getID_Bedien_Bezirk_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Einrichtung_Oertlich_TypeClass <em>ID Bedien Einrichtung Oertlich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bedien Einrichtung Oertlich Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Einrichtung_Oertlich_TypeClass
	 * @generated
	 */
	EClass getID_Bedien_Einrichtung_Oertlich_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Einrichtung_Oertlich_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Einrichtung_Oertlich_TypeClass#getValue()
	 * @see #getID_Bedien_Einrichtung_Oertlich_TypeClass()
	 * @generated
	 */
	EReference getID_Bedien_Einrichtung_Oertlich_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Einrichtung_Oertlich_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Einrichtung_Oertlich_TypeClass#isInvalidReference()
	 * @see #getID_Bedien_Einrichtung_Oertlich_TypeClass()
	 * @generated
	 */
	EAttribute getID_Bedien_Einrichtung_Oertlich_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Oberflaeche_TypeClass <em>ID Bedien Oberflaeche Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bedien Oberflaeche Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Oberflaeche_TypeClass
	 * @generated
	 */
	EClass getID_Bedien_Oberflaeche_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Oberflaeche_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Oberflaeche_TypeClass#getValue()
	 * @see #getID_Bedien_Oberflaeche_TypeClass()
	 * @generated
	 */
	EReference getID_Bedien_Oberflaeche_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Oberflaeche_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Oberflaeche_TypeClass#isInvalidReference()
	 * @see #getID_Bedien_Oberflaeche_TypeClass()
	 * @generated
	 */
	EAttribute getID_Bedien_Oberflaeche_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Standort_TypeClass <em>ID Bedien Standort Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bedien Standort Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Standort_TypeClass
	 * @generated
	 */
	EClass getID_Bedien_Standort_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Standort_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Standort_TypeClass#getValue()
	 * @see #getID_Bedien_Standort_TypeClass()
	 * @generated
	 */
	EReference getID_Bedien_Standort_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Standort_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Standort_TypeClass#isInvalidReference()
	 * @see #getID_Bedien_Standort_TypeClass()
	 * @generated
	 */
	EAttribute getID_Bedien_Standort_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Zentrale_TypeClass <em>ID Bedien Zentrale Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bedien Zentrale Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Zentrale_TypeClass
	 * @generated
	 */
	EClass getID_Bedien_Zentrale_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Zentrale_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Zentrale_TypeClass#getValue()
	 * @see #getID_Bedien_Zentrale_TypeClass()
	 * @generated
	 */
	EReference getID_Bedien_Zentrale_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Zentrale_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Zentrale_TypeClass#isInvalidReference()
	 * @see #getID_Bedien_Zentrale_TypeClass()
	 * @generated
	 */
	EAttribute getID_Bedien_Zentrale_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Befestigung_Bauwerk_TypeClass <em>ID Befestigung Bauwerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Befestigung Bauwerk Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Befestigung_Bauwerk_TypeClass
	 * @generated
	 */
	EClass getID_Befestigung_Bauwerk_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Befestigung_Bauwerk_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Befestigung_Bauwerk_TypeClass#getValue()
	 * @see #getID_Befestigung_Bauwerk_TypeClass()
	 * @generated
	 */
	EReference getID_Befestigung_Bauwerk_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Befestigung_Bauwerk_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Befestigung_Bauwerk_TypeClass#isInvalidReference()
	 * @see #getID_Befestigung_Bauwerk_TypeClass()
	 * @generated
	 */
	EAttribute getID_Befestigung_Bauwerk_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Beginn_Bereich_TypeClass <em>ID Beginn Bereich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Beginn Bereich Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Beginn_Bereich_TypeClass
	 * @generated
	 */
	EClass getID_Beginn_Bereich_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Beginn_Bereich_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Beginn_Bereich_TypeClass#getValue()
	 * @see #getID_Beginn_Bereich_TypeClass()
	 * @generated
	 */
	EReference getID_Beginn_Bereich_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Beginn_Bereich_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Beginn_Bereich_TypeClass#isInvalidReference()
	 * @see #getID_Beginn_Bereich_TypeClass()
	 * @generated
	 */
	EAttribute getID_Beginn_Bereich_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bezugspunkt_Positionierung_TypeClass <em>ID Bezugspunkt Positionierung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bezugspunkt Positionierung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bezugspunkt_Positionierung_TypeClass
	 * @generated
	 */
	EClass getID_Bezugspunkt_Positionierung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Bezugspunkt_Positionierung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bezugspunkt_Positionierung_TypeClass#getValue()
	 * @see #getID_Bezugspunkt_Positionierung_TypeClass()
	 * @generated
	 */
	EReference getID_Bezugspunkt_Positionierung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Bezugspunkt_Positionierung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bezugspunkt_Positionierung_TypeClass#isInvalidReference()
	 * @see #getID_Bezugspunkt_Positionierung_TypeClass()
	 * @generated
	 */
	EAttribute getID_Bezugspunkt_Positionierung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass <em>ID Binaerdaten ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Binaerdaten ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Binaerdaten_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Binaerdaten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Binaerdaten_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Binaerdaten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Binaerdaten_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Block_Anlage_TypeClass <em>ID Block Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Block Anlage Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Block_Anlage_TypeClass
	 * @generated
	 */
	EClass getID_Block_Anlage_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Block_Anlage_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Block_Anlage_TypeClass#getValue()
	 * @see #getID_Block_Anlage_TypeClass()
	 * @generated
	 */
	EReference getID_Block_Anlage_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Block_Anlage_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Block_Anlage_TypeClass#isInvalidReference()
	 * @see #getID_Block_Anlage_TypeClass()
	 * @generated
	 */
	EAttribute getID_Block_Anlage_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Block_Element_TypeClass <em>ID Block Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Block Element Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Block_Element_TypeClass
	 * @generated
	 */
	EClass getID_Block_Element_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Block_Element_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Block_Element_TypeClass#getValue()
	 * @see #getID_Block_Element_TypeClass()
	 * @generated
	 */
	EReference getID_Block_Element_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Block_Element_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Block_Element_TypeClass#isInvalidReference()
	 * @see #getID_Block_Element_TypeClass()
	 * @generated
	 */
	EAttribute getID_Block_Element_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Block_Strecke_TypeClass <em>ID Block Strecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Block Strecke Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Block_Strecke_TypeClass
	 * @generated
	 */
	EClass getID_Block_Strecke_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Block_Strecke_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Block_Strecke_TypeClass#getValue()
	 * @see #getID_Block_Strecke_TypeClass()
	 * @generated
	 */
	EReference getID_Block_Strecke_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Block_Strecke_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Block_Strecke_TypeClass#isInvalidReference()
	 * @see #getID_Block_Strecke_TypeClass()
	 * @generated
	 */
	EAttribute getID_Block_Strecke_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass <em>ID BUE Anlage ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE Anlage ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_BUE_Anlage_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_BUE_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_BUE_Anlage_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_BUE_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_BUE_Anlage_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_TypeClass <em>ID BUE Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE Anlage Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_TypeClass
	 * @generated
	 */
	EClass getID_BUE_Anlage_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_TypeClass#getValue()
	 * @see #getID_BUE_Anlage_TypeClass()
	 * @generated
	 */
	EReference getID_BUE_Anlage_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_TypeClass#isInvalidReference()
	 * @see #getID_BUE_Anlage_TypeClass()
	 * @generated
	 */
	EAttribute getID_BUE_Anlage_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Bedien_Anzeige_Element_TypeClass <em>ID BUE Bedien Anzeige Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE Bedien Anzeige Element Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Bedien_Anzeige_Element_TypeClass
	 * @generated
	 */
	EClass getID_BUE_Bedien_Anzeige_Element_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Bedien_Anzeige_Element_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Bedien_Anzeige_Element_TypeClass#getValue()
	 * @see #getID_BUE_Bedien_Anzeige_Element_TypeClass()
	 * @generated
	 */
	EReference getID_BUE_Bedien_Anzeige_Element_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Bedien_Anzeige_Element_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Bedien_Anzeige_Element_TypeClass#isInvalidReference()
	 * @see #getID_BUE_Bedien_Anzeige_Element_TypeClass()
	 * @generated
	 */
	EAttribute getID_BUE_Bedien_Anzeige_Element_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Einschaltung_TypeClass <em>ID BUE Einschaltung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE Einschaltung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Einschaltung_TypeClass
	 * @generated
	 */
	EClass getID_BUE_Einschaltung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Einschaltung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Einschaltung_TypeClass#getValue()
	 * @see #getID_BUE_Einschaltung_TypeClass()
	 * @generated
	 */
	EReference getID_BUE_Einschaltung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Einschaltung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Einschaltung_TypeClass#isInvalidReference()
	 * @see #getID_BUE_Einschaltung_TypeClass()
	 * @generated
	 */
	EAttribute getID_BUE_Einschaltung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass <em>ID BUE Gleisbezogener Gefahrraum Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE Gleisbezogener Gefahrraum Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass
	 * @generated
	 */
	EClass getID_BUE_Gleisbezogener_Gefahrraum_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass#getValue()
	 * @see #getID_BUE_Gleisbezogener_Gefahrraum_TypeClass()
	 * @generated
	 */
	EReference getID_BUE_Gleisbezogener_Gefahrraum_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass#isInvalidReference()
	 * @see #getID_BUE_Gleisbezogener_Gefahrraum_TypeClass()
	 * @generated
	 */
	EAttribute getID_BUE_Gleisbezogener_Gefahrraum_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Schnittstelle_TypeClass <em>ID BUE Schnittstelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE Schnittstelle Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Schnittstelle_TypeClass
	 * @generated
	 */
	EClass getID_BUE_Schnittstelle_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Schnittstelle_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Schnittstelle_TypeClass#getValue()
	 * @see #getID_BUE_Schnittstelle_TypeClass()
	 * @generated
	 */
	EReference getID_BUE_Schnittstelle_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Schnittstelle_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Schnittstelle_TypeClass#isInvalidReference()
	 * @see #getID_BUE_Schnittstelle_TypeClass()
	 * @generated
	 */
	EAttribute getID_BUE_Schnittstelle_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_WS_Fstr_Zuordnung_TypeClass <em>ID BUE WS Fstr Zuordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE WS Fstr Zuordnung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_WS_Fstr_Zuordnung_TypeClass
	 * @generated
	 */
	EClass getID_BUE_WS_Fstr_Zuordnung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_WS_Fstr_Zuordnung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_WS_Fstr_Zuordnung_TypeClass#getValue()
	 * @see #getID_BUE_WS_Fstr_Zuordnung_TypeClass()
	 * @generated
	 */
	EReference getID_BUE_WS_Fstr_Zuordnung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_WS_Fstr_Zuordnung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_WS_Fstr_Zuordnung_TypeClass#isInvalidReference()
	 * @see #getID_BUE_WS_Fstr_Zuordnung_TypeClass()
	 * @generated
	 */
	EAttribute getID_BUE_WS_Fstr_Zuordnung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_ohne_Proxy_TypeClass <em>ID Datenpunkt ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Datenpunkt ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Datenpunkt_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Datenpunkt_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Datenpunkt_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Datenpunkt_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Datenpunkt_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_TypeClass <em>ID Datenpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Datenpunkt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_TypeClass
	 * @generated
	 */
	EClass getID_Datenpunkt_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_TypeClass#getValue()
	 * @see #getID_Datenpunkt_TypeClass()
	 * @generated
	 */
	EReference getID_Datenpunkt_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_TypeClass#isInvalidReference()
	 * @see #getID_Datenpunkt_TypeClass()
	 * @generated
	 */
	EAttribute getID_Datenpunkt_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_DP_Bezug_Funktional_TypeClass <em>ID DP Bezug Funktional Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID DP Bezug Funktional Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_DP_Bezug_Funktional_TypeClass
	 * @generated
	 */
	EClass getID_DP_Bezug_Funktional_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_DP_Bezug_Funktional_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_DP_Bezug_Funktional_TypeClass#getValue()
	 * @see #getID_DP_Bezug_Funktional_TypeClass()
	 * @generated
	 */
	EReference getID_DP_Bezug_Funktional_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_DP_Bezug_Funktional_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_DP_Bezug_Funktional_TypeClass#isInvalidReference()
	 * @see #getID_DP_Bezug_Funktional_TypeClass()
	 * @generated
	 */
	EAttribute getID_DP_Bezug_Funktional_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Einschaltpunkt_TypeClass <em>ID Einschaltpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Einschaltpunkt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Einschaltpunkt_TypeClass
	 * @generated
	 */
	EClass getID_Einschaltpunkt_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Einschaltpunkt_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Einschaltpunkt_TypeClass#getValue()
	 * @see #getID_Einschaltpunkt_TypeClass()
	 * @generated
	 */
	EReference getID_Einschaltpunkt_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Einschaltpunkt_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Einschaltpunkt_TypeClass#isInvalidReference()
	 * @see #getID_Einschaltpunkt_TypeClass()
	 * @generated
	 */
	EAttribute getID_Einschaltpunkt_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Element_Grenze_TypeClass <em>ID Element Grenze Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Element Grenze Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Element_Grenze_TypeClass
	 * @generated
	 */
	EClass getID_Element_Grenze_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Element_Grenze_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Element_Grenze_TypeClass#getValue()
	 * @see #getID_Element_Grenze_TypeClass()
	 * @generated
	 */
	EReference getID_Element_Grenze_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Element_Grenze_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Element_Grenze_TypeClass#isInvalidReference()
	 * @see #getID_Element_Grenze_TypeClass()
	 * @generated
	 */
	EAttribute getID_Element_Grenze_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Element_TypeClass <em>ID Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Element Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Element_TypeClass
	 * @generated
	 */
	EClass getID_Element_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Element_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Element_TypeClass#getValue()
	 * @see #getID_Element_TypeClass()
	 * @generated
	 */
	EReference getID_Element_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Element_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Element_TypeClass#isInvalidReference()
	 * @see #getID_Element_TypeClass()
	 * @generated
	 */
	EAttribute getID_Element_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Element_Unterbringung_TypeClass <em>ID Element Unterbringung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Element Unterbringung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Element_Unterbringung_TypeClass
	 * @generated
	 */
	EClass getID_Element_Unterbringung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Element_Unterbringung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Element_Unterbringung_TypeClass#getValue()
	 * @see #getID_Element_Unterbringung_TypeClass()
	 * @generated
	 */
	EReference getID_Element_Unterbringung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Element_Unterbringung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Element_Unterbringung_TypeClass#isInvalidReference()
	 * @see #getID_Element_Unterbringung_TypeClass()
	 * @generated
	 */
	EAttribute getID_Element_Unterbringung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Energie_Eingang_TypeClass <em>ID Energie Eingang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Energie Eingang Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Energie_Eingang_TypeClass
	 * @generated
	 */
	EClass getID_Energie_Eingang_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Energie_Eingang_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Energie_Eingang_TypeClass#getValue()
	 * @see #getID_Energie_Eingang_TypeClass()
	 * @generated
	 */
	EReference getID_Energie_Eingang_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Energie_Eingang_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Energie_Eingang_TypeClass#isInvalidReference()
	 * @see #getID_Energie_Eingang_TypeClass()
	 * @generated
	 */
	EAttribute getID_Energie_Eingang_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Energie_TypeClass <em>ID Energie Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Energie Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Energie_TypeClass
	 * @generated
	 */
	EClass getID_Energie_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Energie_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Energie_TypeClass#getValue()
	 * @see #getID_Energie_TypeClass()
	 * @generated
	 */
	EReference getID_Energie_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Energie_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Energie_TypeClass#isInvalidReference()
	 * @see #getID_Energie_TypeClass()
	 * @generated
	 */
	EAttribute getID_Energie_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ESTW_Zentraleinheit_TypeClass <em>ID ESTW Zentraleinheit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ESTW Zentraleinheit Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ESTW_Zentraleinheit_TypeClass
	 * @generated
	 */
	EClass getID_ESTW_Zentraleinheit_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ESTW_Zentraleinheit_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ESTW_Zentraleinheit_TypeClass#getValue()
	 * @see #getID_ESTW_Zentraleinheit_TypeClass()
	 * @generated
	 */
	EReference getID_ESTW_Zentraleinheit_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ESTW_Zentraleinheit_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ESTW_Zentraleinheit_TypeClass#isInvalidReference()
	 * @see #getID_ESTW_Zentraleinheit_TypeClass()
	 * @generated
	 */
	EAttribute getID_ESTW_Zentraleinheit_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ETCS_Kante_TypeClass <em>ID ETCS Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ETCS Kante Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ETCS_Kante_TypeClass
	 * @generated
	 */
	EClass getID_ETCS_Kante_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ETCS_Kante_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ETCS_Kante_TypeClass#getValue()
	 * @see #getID_ETCS_Kante_TypeClass()
	 * @generated
	 */
	EReference getID_ETCS_Kante_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ETCS_Kante_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ETCS_Kante_TypeClass#isInvalidReference()
	 * @see #getID_ETCS_Kante_TypeClass()
	 * @generated
	 */
	EAttribute getID_ETCS_Kante_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass <em>ID ETCS Knoten ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ETCS Knoten ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_ETCS_Knoten_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_ETCS_Knoten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_ETCS_Knoten_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_ETCS_Knoten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_ETCS_Knoten_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_TypeClass <em>ID ETCS Knoten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ETCS Knoten Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_TypeClass
	 * @generated
	 */
	EClass getID_ETCS_Knoten_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_TypeClass#getValue()
	 * @see #getID_ETCS_Knoten_TypeClass()
	 * @generated
	 */
	EReference getID_ETCS_Knoten_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_TypeClass#isInvalidReference()
	 * @see #getID_ETCS_Knoten_TypeClass()
	 * @generated
	 */
	EAttribute getID_ETCS_Knoten_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_EV_Modul_TypeClass <em>ID EV Modul Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID EV Modul Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_EV_Modul_TypeClass
	 * @generated
	 */
	EClass getID_EV_Modul_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_EV_Modul_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_EV_Modul_TypeClass#getValue()
	 * @see #getID_EV_Modul_TypeClass()
	 * @generated
	 */
	EReference getID_EV_Modul_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_EV_Modul_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_EV_Modul_TypeClass#isInvalidReference()
	 * @see #getID_EV_Modul_TypeClass()
	 * @generated
	 */
	EAttribute getID_EV_Modul_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_ohne_Proxy_TypeClass <em>ID Fachtelegramm ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fachtelegramm ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Fachtelegramm_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Fachtelegramm_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Fachtelegramm_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Fachtelegramm_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Fachtelegramm_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_TypeClass <em>ID Fachtelegramm Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fachtelegramm Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_TypeClass
	 * @generated
	 */
	EClass getID_Fachtelegramm_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_TypeClass#getValue()
	 * @see #getID_Fachtelegramm_TypeClass()
	 * @generated
	 */
	EReference getID_Fachtelegramm_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_TypeClass#isInvalidReference()
	 * @see #getID_Fachtelegramm_TypeClass()
	 * @generated
	 */
	EAttribute getID_Fachtelegramm_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fla_Schutz_TypeClass <em>ID Fla Schutz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fla Schutz Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fla_Schutz_TypeClass
	 * @generated
	 */
	EClass getID_Fla_Schutz_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Fla_Schutz_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fla_Schutz_TypeClass#getValue()
	 * @see #getID_Fla_Schutz_TypeClass()
	 * @generated
	 */
	EReference getID_Fla_Schutz_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Fla_Schutz_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fla_Schutz_TypeClass#isInvalidReference()
	 * @see #getID_Fla_Schutz_TypeClass()
	 * @generated
	 */
	EAttribute getID_Fla_Schutz_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass <em>ID FMA Anlage Rangier Frei Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID FMA Anlage Rangier Frei Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass
	 * @generated
	 */
	EClass getID_FMA_Anlage_Rangier_Frei_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass#getValue()
	 * @see #getID_FMA_Anlage_Rangier_Frei_TypeClass()
	 * @generated
	 */
	EReference getID_FMA_Anlage_Rangier_Frei_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass#isInvalidReference()
	 * @see #getID_FMA_Anlage_Rangier_Frei_TypeClass()
	 * @generated
	 */
	EAttribute getID_FMA_Anlage_Rangier_Frei_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_TypeClass <em>ID FMA Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID FMA Anlage Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_TypeClass
	 * @generated
	 */
	EClass getID_FMA_Anlage_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_TypeClass#getValue()
	 * @see #getID_FMA_Anlage_TypeClass()
	 * @generated
	 */
	EReference getID_FMA_Anlage_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_TypeClass#isInvalidReference()
	 * @see #getID_FMA_Anlage_TypeClass()
	 * @generated
	 */
	EAttribute getID_FMA_Anlage_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Element_TypeClass <em>ID FMA Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID FMA Element Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Element_TypeClass
	 * @generated
	 */
	EClass getID_FMA_Element_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Element_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Element_TypeClass#getValue()
	 * @see #getID_FMA_Element_TypeClass()
	 * @generated
	 */
	EReference getID_FMA_Element_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Element_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Element_TypeClass#isInvalidReference()
	 * @see #getID_FMA_Element_TypeClass()
	 * @generated
	 */
	EAttribute getID_FMA_Element_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Komponente_TypeClass <em>ID FMA Komponente Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID FMA Komponente Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Komponente_TypeClass
	 * @generated
	 */
	EClass getID_FMA_Komponente_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Komponente_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Komponente_TypeClass#getValue()
	 * @see #getID_FMA_Komponente_TypeClass()
	 * @generated
	 */
	EReference getID_FMA_Komponente_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Komponente_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Komponente_TypeClass#isInvalidReference()
	 * @see #getID_FMA_Komponente_TypeClass()
	 * @generated
	 */
	EAttribute getID_FMA_Komponente_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fortschaltung_Start_TypeClass <em>ID Fortschaltung Start Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fortschaltung Start Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fortschaltung_Start_TypeClass
	 * @generated
	 */
	EClass getID_Fortschaltung_Start_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Fortschaltung_Start_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fortschaltung_Start_TypeClass#getValue()
	 * @see #getID_Fortschaltung_Start_TypeClass()
	 * @generated
	 */
	EReference getID_Fortschaltung_Start_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Fortschaltung_Start_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fortschaltung_Start_TypeClass#isInvalidReference()
	 * @see #getID_Fortschaltung_Start_TypeClass()
	 * @generated
	 */
	EAttribute getID_Fortschaltung_Start_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Aneinander_TypeClass <em>ID Fstr Aneinander Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fstr Aneinander Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Aneinander_TypeClass
	 * @generated
	 */
	EClass getID_Fstr_Aneinander_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Aneinander_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Aneinander_TypeClass#getValue()
	 * @see #getID_Fstr_Aneinander_TypeClass()
	 * @generated
	 */
	EReference getID_Fstr_Aneinander_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Aneinander_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Aneinander_TypeClass#isInvalidReference()
	 * @see #getID_Fstr_Aneinander_TypeClass()
	 * @generated
	 */
	EAttribute getID_Fstr_Aneinander_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Ausschluss_Besonders_TypeClass <em>ID Fstr Ausschluss Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fstr Ausschluss Besonders Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Ausschluss_Besonders_TypeClass
	 * @generated
	 */
	EClass getID_Fstr_Ausschluss_Besonders_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Ausschluss_Besonders_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Ausschluss_Besonders_TypeClass#getValue()
	 * @see #getID_Fstr_Ausschluss_Besonders_TypeClass()
	 * @generated
	 */
	EReference getID_Fstr_Ausschluss_Besonders_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Ausschluss_Besonders_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Ausschluss_Besonders_TypeClass#isInvalidReference()
	 * @see #getID_Fstr_Ausschluss_Besonders_TypeClass()
	 * @generated
	 */
	EAttribute getID_Fstr_Ausschluss_Besonders_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_ohne_Proxy_TypeClass <em>ID Fstr DWeg ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fstr DWeg ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Fstr_DWeg_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Fstr_DWeg_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Fstr_DWeg_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Fstr_DWeg_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Fstr_DWeg_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_TypeClass <em>ID Fstr DWeg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fstr DWeg Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_TypeClass
	 * @generated
	 */
	EClass getID_Fstr_DWeg_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_TypeClass#getValue()
	 * @see #getID_Fstr_DWeg_TypeClass()
	 * @generated
	 */
	EReference getID_Fstr_DWeg_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_TypeClass#isInvalidReference()
	 * @see #getID_Fstr_DWeg_TypeClass()
	 * @generated
	 */
	EAttribute getID_Fstr_DWeg_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_ohne_Proxy_TypeClass <em>ID Fstr Fahrweg ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fstr Fahrweg ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Fstr_Fahrweg_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Fstr_Fahrweg_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Fstr_Fahrweg_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Fstr_Fahrweg_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Fstr_Fahrweg_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_TypeClass <em>ID Fstr Fahrweg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fstr Fahrweg Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_TypeClass
	 * @generated
	 */
	EClass getID_Fstr_Fahrweg_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_TypeClass#getValue()
	 * @see #getID_Fstr_Fahrweg_TypeClass()
	 * @generated
	 */
	EReference getID_Fstr_Fahrweg_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_TypeClass#isInvalidReference()
	 * @see #getID_Fstr_Fahrweg_TypeClass()
	 * @generated
	 */
	EAttribute getID_Fstr_Fahrweg_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass <em>ID Fstr Zug Rangier Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fstr Zug Rangier Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass
	 * @generated
	 */
	EClass getID_Fstr_Zug_Rangier_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass#getValue()
	 * @see #getID_Fstr_Zug_Rangier_TypeClass()
	 * @generated
	 */
	EReference getID_Fstr_Zug_Rangier_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass#isInvalidReference()
	 * @see #getID_Fstr_Zug_Rangier_TypeClass()
	 * @generated
	 */
	EAttribute getID_Fstr_Zug_Rangier_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_FT_Anschaltbedingung_TypeClass <em>ID FT Anschaltbedingung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID FT Anschaltbedingung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FT_Anschaltbedingung_TypeClass
	 * @generated
	 */
	EClass getID_FT_Anschaltbedingung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_FT_Anschaltbedingung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FT_Anschaltbedingung_TypeClass#getValue()
	 * @see #getID_FT_Anschaltbedingung_TypeClass()
	 * @generated
	 */
	EReference getID_FT_Anschaltbedingung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_FT_Anschaltbedingung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FT_Anschaltbedingung_TypeClass#isInvalidReference()
	 * @see #getID_FT_Anschaltbedingung_TypeClass()
	 * @generated
	 */
	EAttribute getID_FT_Anschaltbedingung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_FT_Fahrweg_Teil_TypeClass <em>ID FT Fahrweg Teil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID FT Fahrweg Teil Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FT_Fahrweg_Teil_TypeClass
	 * @generated
	 */
	EClass getID_FT_Fahrweg_Teil_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_FT_Fahrweg_Teil_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FT_Fahrweg_Teil_TypeClass#getValue()
	 * @see #getID_FT_Fahrweg_Teil_TypeClass()
	 * @generated
	 */
	EReference getID_FT_Fahrweg_Teil_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_FT_Fahrweg_Teil_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FT_Fahrweg_Teil_TypeClass#isInvalidReference()
	 * @see #getID_FT_Fahrweg_Teil_TypeClass()
	 * @generated
	 */
	EAttribute getID_FT_Fahrweg_Teil_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Art_TypeClass <em>ID GEO Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID GEO Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Art_TypeClass
	 * @generated
	 */
	EClass getID_GEO_Art_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Art_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Art_TypeClass#getValue()
	 * @see #getID_GEO_Art_TypeClass()
	 * @generated
	 */
	EReference getID_GEO_Art_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Art_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Art_TypeClass#isInvalidReference()
	 * @see #getID_GEO_Art_TypeClass()
	 * @generated
	 */
	EAttribute getID_GEO_Art_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Kante_TypeClass <em>ID GEO Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID GEO Kante Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Kante_TypeClass
	 * @generated
	 */
	EClass getID_GEO_Kante_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Kante_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Kante_TypeClass#getValue()
	 * @see #getID_GEO_Kante_TypeClass()
	 * @generated
	 */
	EReference getID_GEO_Kante_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Kante_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Kante_TypeClass#isInvalidReference()
	 * @see #getID_GEO_Kante_TypeClass()
	 * @generated
	 */
	EAttribute getID_GEO_Kante_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass <em>ID GEO Knoten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID GEO Knoten Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass
	 * @generated
	 */
	EClass getID_GEO_Knoten_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass#getValue()
	 * @see #getID_GEO_Knoten_TypeClass()
	 * @generated
	 */
	EReference getID_GEO_Knoten_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass#isInvalidReference()
	 * @see #getID_GEO_Knoten_TypeClass()
	 * @generated
	 */
	EAttribute getID_GEO_Knoten_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass <em>ID GEO Punkt ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID GEO Punkt ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_GEO_Punkt_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_GEO_Punkt_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_GEO_Punkt_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_GEO_Punkt_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_GEO_Punkt_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_TypeClass <em>ID GEO Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID GEO Punkt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_TypeClass
	 * @generated
	 */
	EClass getID_GEO_Punkt_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_TypeClass#getValue()
	 * @see #getID_GEO_Punkt_TypeClass()
	 * @generated
	 */
	EReference getID_GEO_Punkt_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_TypeClass#isInvalidReference()
	 * @see #getID_GEO_Punkt_TypeClass()
	 * @generated
	 */
	EAttribute getID_GEO_Punkt_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass <em>ID GFR Anlage ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID GFR Anlage ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_GFR_Anlage_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_GFR_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_GFR_Anlage_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_GFR_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_GFR_Anlage_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Gleis_Abschnitt_TypeClass <em>ID Gleis Abschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Gleis Abschnitt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Gleis_Abschnitt_TypeClass
	 * @generated
	 */
	EClass getID_Gleis_Abschnitt_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Gleis_Abschnitt_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Gleis_Abschnitt_TypeClass#getValue()
	 * @see #getID_Gleis_Abschnitt_TypeClass()
	 * @generated
	 */
	EReference getID_Gleis_Abschnitt_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Gleis_Abschnitt_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Gleis_Abschnitt_TypeClass#isInvalidReference()
	 * @see #getID_Gleis_Abschnitt_TypeClass()
	 * @generated
	 */
	EAttribute getID_Gleis_Abschnitt_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Gleis_Bezeichnung_TypeClass <em>ID Gleis Bezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Gleis Bezeichnung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Gleis_Bezeichnung_TypeClass
	 * @generated
	 */
	EClass getID_Gleis_Bezeichnung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Gleis_Bezeichnung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Gleis_Bezeichnung_TypeClass#getValue()
	 * @see #getID_Gleis_Bezeichnung_TypeClass()
	 * @generated
	 */
	EReference getID_Gleis_Bezeichnung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Gleis_Bezeichnung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Gleis_Bezeichnung_TypeClass#isInvalidReference()
	 * @see #getID_Gleis_Bezeichnung_TypeClass()
	 * @generated
	 */
	EAttribute getID_Gleis_Bezeichnung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Grenzzeichen_TypeClass <em>ID Grenzzeichen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Grenzzeichen Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Grenzzeichen_TypeClass
	 * @generated
	 */
	EClass getID_Grenzzeichen_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Grenzzeichen_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Grenzzeichen_TypeClass#getValue()
	 * @see #getID_Grenzzeichen_TypeClass()
	 * @generated
	 */
	EReference getID_Grenzzeichen_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Grenzzeichen_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Grenzzeichen_TypeClass#isInvalidReference()
	 * @see #getID_Grenzzeichen_TypeClass()
	 * @generated
	 */
	EAttribute getID_Grenzzeichen_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Handschalt_Wirkfunktion_TypeClass <em>ID Handschalt Wirkfunktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Handschalt Wirkfunktion Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Handschalt_Wirkfunktion_TypeClass
	 * @generated
	 */
	EClass getID_Handschalt_Wirkfunktion_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Handschalt_Wirkfunktion_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Handschalt_Wirkfunktion_TypeClass#getValue()
	 * @see #getID_Handschalt_Wirkfunktion_TypeClass()
	 * @generated
	 */
	EReference getID_Handschalt_Wirkfunktion_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Handschalt_Wirkfunktion_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Handschalt_Wirkfunktion_TypeClass#isInvalidReference()
	 * @see #getID_Handschalt_Wirkfunktion_TypeClass()
	 * @generated
	 */
	EAttribute getID_Handschalt_Wirkfunktion_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Hoehenpunkt_TypeClass <em>ID Hoehenpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Hoehenpunkt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Hoehenpunkt_TypeClass
	 * @generated
	 */
	EClass getID_Hoehenpunkt_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Hoehenpunkt_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Hoehenpunkt_TypeClass#getValue()
	 * @see #getID_Hoehenpunkt_TypeClass()
	 * @generated
	 */
	EReference getID_Hoehenpunkt_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Hoehenpunkt_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Hoehenpunkt_TypeClass#isInvalidReference()
	 * @see #getID_Hoehenpunkt_TypeClass()
	 * @generated
	 */
	EAttribute getID_Hoehenpunkt_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Information_Eingang_TypeClass <em>ID Information Eingang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Information Eingang Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Information_Eingang_TypeClass
	 * @generated
	 */
	EClass getID_Information_Eingang_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Information_Eingang_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Information_Eingang_TypeClass#getValue()
	 * @see #getID_Information_Eingang_TypeClass()
	 * @generated
	 */
	EReference getID_Information_Eingang_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Information_Eingang_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Information_Eingang_TypeClass#isInvalidReference()
	 * @see #getID_Information_Eingang_TypeClass()
	 * @generated
	 */
	EAttribute getID_Information_Eingang_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Information_Primaer_TypeClass <em>ID Information Primaer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Information Primaer Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Information_Primaer_TypeClass
	 * @generated
	 */
	EClass getID_Information_Primaer_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Information_Primaer_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Information_Primaer_TypeClass#getValue()
	 * @see #getID_Information_Primaer_TypeClass()
	 * @generated
	 */
	EReference getID_Information_Primaer_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Information_Primaer_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Information_Primaer_TypeClass#isInvalidReference()
	 * @see #getID_Information_Primaer_TypeClass()
	 * @generated
	 */
	EAttribute getID_Information_Primaer_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Komponente_Programmiert_TypeClass <em>ID Komponente Programmiert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Komponente Programmiert Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Komponente_Programmiert_TypeClass
	 * @generated
	 */
	EClass getID_Komponente_Programmiert_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Komponente_Programmiert_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Komponente_Programmiert_TypeClass#getValue()
	 * @see #getID_Komponente_Programmiert_TypeClass()
	 * @generated
	 */
	EReference getID_Komponente_Programmiert_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Komponente_Programmiert_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Komponente_Programmiert_TypeClass#isInvalidReference()
	 * @see #getID_Komponente_Programmiert_TypeClass()
	 * @generated
	 */
	EAttribute getID_Komponente_Programmiert_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Blattschnitt_TypeClass <em>ID Lageplan Blattschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Lageplan Blattschnitt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Blattschnitt_TypeClass
	 * @generated
	 */
	EClass getID_Lageplan_Blattschnitt_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Blattschnitt_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Blattschnitt_TypeClass#getValue()
	 * @see #getID_Lageplan_Blattschnitt_TypeClass()
	 * @generated
	 */
	EReference getID_Lageplan_Blattschnitt_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Blattschnitt_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Blattschnitt_TypeClass#isInvalidReference()
	 * @see #getID_Lageplan_Blattschnitt_TypeClass()
	 * @generated
	 */
	EAttribute getID_Lageplan_Blattschnitt_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Lageplan_TypeClass <em>ID Lageplan Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Lageplan Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Lageplan_TypeClass
	 * @generated
	 */
	EClass getID_Lageplan_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Lageplan_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Lageplan_TypeClass#getValue()
	 * @see #getID_Lageplan_TypeClass()
	 * @generated
	 */
	EReference getID_Lageplan_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Lageplan_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Lageplan_TypeClass#isInvalidReference()
	 * @see #getID_Lageplan_TypeClass()
	 * @generated
	 */
	EAttribute getID_Lageplan_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Zustand_TypeClass <em>ID Lageplan Zustand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Lageplan Zustand Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Zustand_TypeClass
	 * @generated
	 */
	EClass getID_Lageplan_Zustand_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Zustand_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Zustand_TypeClass#getValue()
	 * @see #getID_Lageplan_Zustand_TypeClass()
	 * @generated
	 */
	EReference getID_Lageplan_Zustand_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Zustand_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Zustand_TypeClass#isInvalidReference()
	 * @see #getID_Lageplan_Zustand_TypeClass()
	 * @generated
	 */
	EAttribute getID_Lageplan_Zustand_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_ohne_Proxy_TypeClass <em>ID LEU Anlage ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID LEU Anlage ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_LEU_Anlage_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_LEU_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_LEU_Anlage_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_LEU_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_LEU_Anlage_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_TypeClass <em>ID LEU Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID LEU Anlage Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_TypeClass
	 * @generated
	 */
	EClass getID_LEU_Anlage_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_TypeClass#getValue()
	 * @see #getID_LEU_Anlage_TypeClass()
	 * @generated
	 */
	EReference getID_LEU_Anlage_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_TypeClass#isInvalidReference()
	 * @see #getID_LEU_Anlage_TypeClass()
	 * @generated
	 */
	EAttribute getID_LEU_Anlage_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Bezug_Funktional_TypeClass <em>ID LEU Bezug Funktional Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID LEU Bezug Funktional Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Bezug_Funktional_TypeClass
	 * @generated
	 */
	EClass getID_LEU_Bezug_Funktional_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Bezug_Funktional_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Bezug_Funktional_TypeClass#getValue()
	 * @see #getID_LEU_Bezug_Funktional_TypeClass()
	 * @generated
	 */
	EReference getID_LEU_Bezug_Funktional_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Bezug_Funktional_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Bezug_Funktional_TypeClass#isInvalidReference()
	 * @see #getID_LEU_Bezug_Funktional_TypeClass()
	 * @generated
	 */
	EAttribute getID_LEU_Bezug_Funktional_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Schaltkasten_ohne_Proxy_TypeClass <em>ID LEU Schaltkasten ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID LEU Schaltkasten ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Schaltkasten_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_LEU_Schaltkasten_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Schaltkasten_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Schaltkasten_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_LEU_Schaltkasten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_LEU_Schaltkasten_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Schaltkasten_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Schaltkasten_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_LEU_Schaltkasten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_LEU_Schaltkasten_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_LO_Einbau_TypeClass <em>ID LO Einbau Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID LO Einbau Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LO_Einbau_TypeClass
	 * @generated
	 */
	EClass getID_LO_Einbau_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_LO_Einbau_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LO_Einbau_TypeClass#getValue()
	 * @see #getID_LO_Einbau_TypeClass()
	 * @generated
	 */
	EReference getID_LO_Einbau_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_LO_Einbau_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LO_Einbau_TypeClass#isInvalidReference()
	 * @see #getID_LO_Einbau_TypeClass()
	 * @generated
	 */
	EAttribute getID_LO_Einbau_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Markante_Stelle_TypeClass <em>ID Markante Stelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Markante Stelle Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Markante_Stelle_TypeClass
	 * @generated
	 */
	EClass getID_Markante_Stelle_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Markante_Stelle_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Markante_Stelle_TypeClass#getValue()
	 * @see #getID_Markante_Stelle_TypeClass()
	 * @generated
	 */
	EReference getID_Markante_Stelle_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Markante_Stelle_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Markante_Stelle_TypeClass#isInvalidReference()
	 * @see #getID_Markante_Stelle_TypeClass()
	 * @generated
	 */
	EAttribute getID_Markante_Stelle_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_Gleis_Abschluss_TypeClass <em>ID Markanter Punkt Gleis Abschluss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Markanter Punkt Gleis Abschluss Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_Gleis_Abschluss_TypeClass
	 * @generated
	 */
	EClass getID_Markanter_Punkt_Gleis_Abschluss_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_Gleis_Abschluss_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_Gleis_Abschluss_TypeClass#getValue()
	 * @see #getID_Markanter_Punkt_Gleis_Abschluss_TypeClass()
	 * @generated
	 */
	EReference getID_Markanter_Punkt_Gleis_Abschluss_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_Gleis_Abschluss_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_Gleis_Abschluss_TypeClass#isInvalidReference()
	 * @see #getID_Markanter_Punkt_Gleis_Abschluss_TypeClass()
	 * @generated
	 */
	EAttribute getID_Markanter_Punkt_Gleis_Abschluss_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_TypeClass <em>ID Markanter Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Markanter Punkt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_TypeClass
	 * @generated
	 */
	EClass getID_Markanter_Punkt_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_TypeClass#getValue()
	 * @see #getID_Markanter_Punkt_TypeClass()
	 * @generated
	 */
	EReference getID_Markanter_Punkt_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_TypeClass#isInvalidReference()
	 * @see #getID_Markanter_Punkt_TypeClass()
	 * @generated
	 */
	EAttribute getID_Markanter_Punkt_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_NB_Element_TypeClass <em>ID NB Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID NB Element Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_NB_Element_TypeClass
	 * @generated
	 */
	EClass getID_NB_Element_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_NB_Element_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_NB_Element_TypeClass#getValue()
	 * @see #getID_NB_Element_TypeClass()
	 * @generated
	 */
	EReference getID_NB_Element_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_NB_Element_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_NB_Element_TypeClass#isInvalidReference()
	 * @see #getID_NB_Element_TypeClass()
	 * @generated
	 */
	EAttribute getID_NB_Element_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_NB_TypeClass <em>ID NB Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID NB Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_NB_TypeClass
	 * @generated
	 */
	EClass getID_NB_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_NB_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_NB_TypeClass#getValue()
	 * @see #getID_NB_TypeClass()
	 * @generated
	 */
	EReference getID_NB_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_NB_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_NB_TypeClass#isInvalidReference()
	 * @see #getID_NB_TypeClass()
	 * @generated
	 */
	EAttribute getID_NB_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_NB_Zone_TypeClass <em>ID NB Zone Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID NB Zone Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_NB_Zone_TypeClass
	 * @generated
	 */
	EClass getID_NB_Zone_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_NB_Zone_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_NB_Zone_TypeClass#getValue()
	 * @see #getID_NB_Zone_TypeClass()
	 * @generated
	 */
	EReference getID_NB_Zone_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_NB_Zone_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_NB_Zone_TypeClass#isInvalidReference()
	 * @see #getID_NB_Zone_TypeClass()
	 * @generated
	 */
	EAttribute getID_NB_Zone_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Ausgabe_TypeClass <em>ID Oertlichkeit Ausgabe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Oertlichkeit Ausgabe Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Ausgabe_TypeClass
	 * @generated
	 */
	EClass getID_Oertlichkeit_Ausgabe_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Ausgabe_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Ausgabe_TypeClass#getValue()
	 * @see #getID_Oertlichkeit_Ausgabe_TypeClass()
	 * @generated
	 */
	EReference getID_Oertlichkeit_Ausgabe_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Ausgabe_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Ausgabe_TypeClass#isInvalidReference()
	 * @see #getID_Oertlichkeit_Ausgabe_TypeClass()
	 * @generated
	 */
	EAttribute getID_Oertlichkeit_Ausgabe_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass <em>ID Oertlichkeit Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Oertlichkeit Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Oertlichkeit_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass#getValue()
	 * @see #getID_Oertlichkeit_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Oertlichkeit_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Oertlichkeit_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Oertlichkeit_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_TypeClass <em>ID Oertlichkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Oertlichkeit Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_TypeClass
	 * @generated
	 */
	EClass getID_Oertlichkeit_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_TypeClass#getValue()
	 * @see #getID_Oertlichkeit_TypeClass()
	 * @generated
	 */
	EReference getID_Oertlichkeit_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_TypeClass#isInvalidReference()
	 * @see #getID_Oertlichkeit_TypeClass()
	 * @generated
	 */
	EAttribute getID_Oertlichkeit_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_PlanPro_Schnittstelle_TypeClass <em>ID Plan Pro Schnittstelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Plan Pro Schnittstelle Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PlanPro_Schnittstelle_TypeClass
	 * @generated
	 */
	EClass getID_PlanPro_Schnittstelle_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_PlanPro_Schnittstelle_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PlanPro_Schnittstelle_TypeClass#getValue()
	 * @see #getID_PlanPro_Schnittstelle_TypeClass()
	 * @generated
	 */
	EReference getID_PlanPro_Schnittstelle_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_PlanPro_Schnittstelle_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PlanPro_Schnittstelle_TypeClass#isInvalidReference()
	 * @see #getID_PlanPro_Schnittstelle_TypeClass()
	 * @generated
	 */
	EAttribute getID_PlanPro_Schnittstelle_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Planung_Einzel_TypeClass <em>ID Planung Einzel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Planung Einzel Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Planung_Einzel_TypeClass
	 * @generated
	 */
	EClass getID_Planung_Einzel_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Planung_Einzel_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Planung_Einzel_TypeClass#getValue()
	 * @see #getID_Planung_Einzel_TypeClass()
	 * @generated
	 */
	EReference getID_Planung_Einzel_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Planung_Einzel_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Planung_Einzel_TypeClass#isInvalidReference()
	 * @see #getID_Planung_Einzel_TypeClass()
	 * @generated
	 */
	EAttribute getID_Planung_Einzel_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Planungsgrundlage_TypeClass <em>ID Planungsgrundlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Planungsgrundlage Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Planungsgrundlage_TypeClass
	 * @generated
	 */
	EClass getID_Planungsgrundlage_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Planungsgrundlage_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Planungsgrundlage_TypeClass#getValue()
	 * @see #getID_Planungsgrundlage_TypeClass()
	 * @generated
	 */
	EReference getID_Planungsgrundlage_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Planungsgrundlage_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Planungsgrundlage_TypeClass#isInvalidReference()
	 * @see #getID_Planungsgrundlage_TypeClass()
	 * @generated
	 */
	EAttribute getID_Planungsgrundlage_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass <em>ID PZB Element Bezugspunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID PZB Element Bezugspunkt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass
	 * @generated
	 */
	EClass getID_PZB_Element_Bezugspunkt_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass#getValue()
	 * @see #getID_PZB_Element_Bezugspunkt_TypeClass()
	 * @generated
	 */
	EReference getID_PZB_Element_Bezugspunkt_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass#isInvalidReference()
	 * @see #getID_PZB_Element_Bezugspunkt_TypeClass()
	 * @generated
	 */
	EAttribute getID_PZB_Element_Bezugspunkt_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Mitnutzung_TypeClass <em>ID PZB Element Mitnutzung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID PZB Element Mitnutzung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Mitnutzung_TypeClass
	 * @generated
	 */
	EClass getID_PZB_Element_Mitnutzung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Mitnutzung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Mitnutzung_TypeClass#getValue()
	 * @see #getID_PZB_Element_Mitnutzung_TypeClass()
	 * @generated
	 */
	EReference getID_PZB_Element_Mitnutzung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Mitnutzung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Mitnutzung_TypeClass#isInvalidReference()
	 * @see #getID_PZB_Element_Mitnutzung_TypeClass()
	 * @generated
	 */
	EAttribute getID_PZB_Element_Mitnutzung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_TypeClass <em>ID PZB Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID PZB Element Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_TypeClass
	 * @generated
	 */
	EClass getID_PZB_Element_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_TypeClass#getValue()
	 * @see #getID_PZB_Element_TypeClass()
	 * @generated
	 */
	EReference getID_PZB_Element_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_TypeClass#isInvalidReference()
	 * @see #getID_PZB_Element_TypeClass()
	 * @generated
	 */
	EAttribute getID_PZB_Element_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Zuordnung_TypeClass <em>ID PZB Element Zuordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID PZB Element Zuordnung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Zuordnung_TypeClass
	 * @generated
	 */
	EClass getID_PZB_Element_Zuordnung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Zuordnung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Zuordnung_TypeClass#getValue()
	 * @see #getID_PZB_Element_Zuordnung_TypeClass()
	 * @generated
	 */
	EReference getID_PZB_Element_Zuordnung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Zuordnung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Zuordnung_TypeClass#isInvalidReference()
	 * @see #getID_PZB_Element_Zuordnung_TypeClass()
	 * @generated
	 */
	EAttribute getID_PZB_Element_Zuordnung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Quellelement_TypeClass <em>ID Quellelement Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Quellelement Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Quellelement_TypeClass
	 * @generated
	 */
	EClass getID_Quellelement_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Quellelement_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Quellelement_TypeClass#getValue()
	 * @see #getID_Quellelement_TypeClass()
	 * @generated
	 */
	EReference getID_Quellelement_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Quellelement_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Quellelement_TypeClass#isInvalidReference()
	 * @see #getID_Quellelement_TypeClass()
	 * @generated
	 */
	EAttribute getID_Quellelement_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass <em>ID RBC Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID RBC Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass
	 * @generated
	 */
	EClass getID_RBC_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass#getValue()
	 * @see #getID_RBC_TypeClass()
	 * @generated
	 */
	EReference getID_RBC_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass#isInvalidReference()
	 * @see #getID_RBC_TypeClass()
	 * @generated
	 */
	EAttribute getID_RBC_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_ohne_Proxy_TypeClass <em>ID Regelzeichnung ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Regelzeichnung ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Regelzeichnung_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Regelzeichnung_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Regelzeichnung_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Regelzeichnung_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Regelzeichnung_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_TypeClass <em>ID Regelzeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Regelzeichnung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_TypeClass
	 * @generated
	 */
	EClass getID_Regelzeichnung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_TypeClass#getValue()
	 * @see #getID_Regelzeichnung_TypeClass()
	 * @generated
	 */
	EReference getID_Regelzeichnung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_TypeClass#isInvalidReference()
	 * @see #getID_Regelzeichnung_TypeClass()
	 * @generated
	 */
	EAttribute getID_Regelzeichnung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Schalter_TypeClass <em>ID Schalter Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Schalter Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schalter_TypeClass
	 * @generated
	 */
	EClass getID_Schalter_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Schalter_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schalter_TypeClass#getValue()
	 * @see #getID_Schalter_TypeClass()
	 * @generated
	 */
	EReference getID_Schalter_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Schalter_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schalter_TypeClass#isInvalidReference()
	 * @see #getID_Schalter_TypeClass()
	 * @generated
	 */
	EAttribute getID_Schalter_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Schaltmittel_Zuordnung_TypeClass <em>ID Schaltmittel Zuordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Schaltmittel Zuordnung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schaltmittel_Zuordnung_TypeClass
	 * @generated
	 */
	EClass getID_Schaltmittel_Zuordnung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Schaltmittel_Zuordnung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schaltmittel_Zuordnung_TypeClass#getValue()
	 * @see #getID_Schaltmittel_Zuordnung_TypeClass()
	 * @generated
	 */
	EReference getID_Schaltmittel_Zuordnung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Schaltmittel_Zuordnung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schaltmittel_Zuordnung_TypeClass#isInvalidReference()
	 * @see #getID_Schaltmittel_Zuordnung_TypeClass()
	 * @generated
	 */
	EAttribute getID_Schaltmittel_Zuordnung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Schlosskombination_TypeClass <em>ID Schlosskombination Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Schlosskombination Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schlosskombination_TypeClass
	 * @generated
	 */
	EClass getID_Schlosskombination_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Schlosskombination_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schlosskombination_TypeClass#getValue()
	 * @see #getID_Schlosskombination_TypeClass()
	 * @generated
	 */
	EReference getID_Schlosskombination_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Schlosskombination_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schlosskombination_TypeClass#isInvalidReference()
	 * @see #getID_Schlosskombination_TypeClass()
	 * @generated
	 */
	EAttribute getID_Schlosskombination_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Schluessel_TypeClass <em>ID Schluessel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Schluessel Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schluessel_TypeClass
	 * @generated
	 */
	EClass getID_Schluessel_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Schluessel_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schluessel_TypeClass#getValue()
	 * @see #getID_Schluessel_TypeClass()
	 * @generated
	 */
	EReference getID_Schluessel_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Schluessel_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schluessel_TypeClass#isInvalidReference()
	 * @see #getID_Schluessel_TypeClass()
	 * @generated
	 */
	EAttribute getID_Schluessel_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Schluesselsperre_TypeClass <em>ID Schluesselsperre Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Schluesselsperre Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schluesselsperre_TypeClass
	 * @generated
	 */
	EClass getID_Schluesselsperre_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Schluesselsperre_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schluesselsperre_TypeClass#getValue()
	 * @see #getID_Schluesselsperre_TypeClass()
	 * @generated
	 */
	EReference getID_Schluesselsperre_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Schluesselsperre_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schluesselsperre_TypeClass#isInvalidReference()
	 * @see #getID_Schluesselsperre_TypeClass()
	 * @generated
	 */
	EAttribute getID_Schluesselsperre_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Befestigung_TypeClass <em>ID Signal Befestigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Befestigung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Befestigung_TypeClass
	 * @generated
	 */
	EClass getID_Signal_Befestigung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Befestigung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Befestigung_TypeClass#getValue()
	 * @see #getID_Signal_Befestigung_TypeClass()
	 * @generated
	 */
	EReference getID_Signal_Befestigung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Befestigung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Befestigung_TypeClass#isInvalidReference()
	 * @see #getID_Signal_Befestigung_TypeClass()
	 * @generated
	 */
	EAttribute getID_Signal_Befestigung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Fank_TypeClass <em>ID Signal Fank Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Fank Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Fank_TypeClass
	 * @generated
	 */
	EClass getID_Signal_Fank_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Fank_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Fank_TypeClass#getValue()
	 * @see #getID_Signal_Fank_TypeClass()
	 * @generated
	 */
	EReference getID_Signal_Fank_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Fank_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Fank_TypeClass#isInvalidReference()
	 * @see #getID_Signal_Fank_TypeClass()
	 * @generated
	 */
	EAttribute getID_Signal_Fank_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Gleisbezechnung_TypeClass <em>ID Signal Gleisbezechnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Gleisbezechnung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Gleisbezechnung_TypeClass
	 * @generated
	 */
	EClass getID_Signal_Gleisbezechnung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Gleisbezechnung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Gleisbezechnung_TypeClass#getValue()
	 * @see #getID_Signal_Gleisbezechnung_TypeClass()
	 * @generated
	 */
	EReference getID_Signal_Gleisbezechnung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Gleisbezechnung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Gleisbezechnung_TypeClass#isInvalidReference()
	 * @see #getID_Signal_Gleisbezechnung_TypeClass()
	 * @generated
	 */
	EAttribute getID_Signal_Gleisbezechnung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_ohne_Proxy_TypeClass <em>ID Signal ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Signal_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Signal_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Signal_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Signal_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Signal_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Rahmen_TypeClass <em>ID Signal Rahmen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Rahmen Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Rahmen_TypeClass
	 * @generated
	 */
	EClass getID_Signal_Rahmen_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Rahmen_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Rahmen_TypeClass#getValue()
	 * @see #getID_Signal_Rahmen_TypeClass()
	 * @generated
	 */
	EReference getID_Signal_Rahmen_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Rahmen_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Rahmen_TypeClass#isInvalidReference()
	 * @see #getID_Signal_Rahmen_TypeClass()
	 * @generated
	 */
	EAttribute getID_Signal_Rahmen_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Signalbegriff_TypeClass <em>ID Signal Signalbegriff Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Signalbegriff Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Signalbegriff_TypeClass
	 * @generated
	 */
	EClass getID_Signal_Signalbegriff_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Signalbegriff_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Signalbegriff_TypeClass#getValue()
	 * @see #getID_Signal_Signalbegriff_TypeClass()
	 * @generated
	 */
	EReference getID_Signal_Signalbegriff_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Signalbegriff_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Signalbegriff_TypeClass#isInvalidReference()
	 * @see #getID_Signal_Signalbegriff_TypeClass()
	 * @generated
	 */
	EAttribute getID_Signal_Signalbegriff_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Start_TypeClass <em>ID Signal Start Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Start Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Start_TypeClass
	 * @generated
	 */
	EClass getID_Signal_Start_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Start_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Start_TypeClass#getValue()
	 * @see #getID_Signal_Start_TypeClass()
	 * @generated
	 */
	EReference getID_Signal_Start_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Start_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Start_TypeClass#isInvalidReference()
	 * @see #getID_Signal_Start_TypeClass()
	 * @generated
	 */
	EAttribute getID_Signal_Start_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass <em>ID Signal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass
	 * @generated
	 */
	EClass getID_Signal_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass#getValue()
	 * @see #getID_Signal_TypeClass()
	 * @generated
	 */
	EReference getID_Signal_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass#isInvalidReference()
	 * @see #getID_Signal_TypeClass()
	 * @generated
	 */
	EAttribute getID_Signal_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Sonderanlage_TypeClass <em>ID Sonderanlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Sonderanlage Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Sonderanlage_TypeClass
	 * @generated
	 */
	EClass getID_Sonderanlage_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Sonderanlage_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Sonderanlage_TypeClass#getValue()
	 * @see #getID_Sonderanlage_TypeClass()
	 * @generated
	 */
	EReference getID_Sonderanlage_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Sonderanlage_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Sonderanlage_TypeClass#isInvalidReference()
	 * @see #getID_Sonderanlage_TypeClass()
	 * @generated
	 */
	EAttribute getID_Sonderanlage_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Stellelement_TypeClass <em>ID Stellelement Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Stellelement Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Stellelement_TypeClass
	 * @generated
	 */
	EClass getID_Stellelement_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Stellelement_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Stellelement_TypeClass#getValue()
	 * @see #getID_Stellelement_TypeClass()
	 * @generated
	 */
	EReference getID_Stellelement_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Stellelement_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Stellelement_TypeClass#isInvalidReference()
	 * @see #getID_Stellelement_TypeClass()
	 * @generated
	 */
	EAttribute getID_Stellelement_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Stellwerk_TypeClass <em>ID Stellwerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Stellwerk Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Stellwerk_TypeClass
	 * @generated
	 */
	EClass getID_Stellwerk_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Stellwerk_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Stellwerk_TypeClass#getValue()
	 * @see #getID_Stellwerk_TypeClass()
	 * @generated
	 */
	EReference getID_Stellwerk_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Stellwerk_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Stellwerk_TypeClass#isInvalidReference()
	 * @see #getID_Stellwerk_TypeClass()
	 * @generated
	 */
	EAttribute getID_Stellwerk_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Strecke_Bremsweg_ohne_Proxy_TypeClass <em>ID Strecke Bremsweg ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Strecke Bremsweg ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Strecke_Bremsweg_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Strecke_Bremsweg_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Strecke_Bremsweg_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Strecke_Bremsweg_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Strecke_Bremsweg_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Strecke_Bremsweg_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Strecke_Bremsweg_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Strecke_Bremsweg_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Strecke_Bremsweg_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Strecke_Bremsweg_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Strecke_Punkt_TypeClass <em>ID Strecke Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Strecke Punkt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Strecke_Punkt_TypeClass
	 * @generated
	 */
	EClass getID_Strecke_Punkt_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Strecke_Punkt_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Strecke_Punkt_TypeClass#getValue()
	 * @see #getID_Strecke_Punkt_TypeClass()
	 * @generated
	 */
	EReference getID_Strecke_Punkt_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Strecke_Punkt_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Strecke_Punkt_TypeClass#isInvalidReference()
	 * @see #getID_Strecke_Punkt_TypeClass()
	 * @generated
	 */
	EAttribute getID_Strecke_Punkt_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Strecke_TypeClass <em>ID Strecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Strecke Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Strecke_TypeClass
	 * @generated
	 */
	EClass getID_Strecke_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Strecke_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Strecke_TypeClass#getValue()
	 * @see #getID_Strecke_TypeClass()
	 * @generated
	 */
	EReference getID_Strecke_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Strecke_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Strecke_TypeClass#isInvalidReference()
	 * @see #getID_Strecke_TypeClass()
	 * @generated
	 */
	EAttribute getID_Strecke_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Technischer_Punkt_TypeClass <em>ID Technischer Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Technischer Punkt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Technischer_Punkt_TypeClass
	 * @generated
	 */
	EClass getID_Technischer_Punkt_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Technischer_Punkt_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Technischer_Punkt_TypeClass#getValue()
	 * @see #getID_Technischer_Punkt_TypeClass()
	 * @generated
	 */
	EReference getID_Technischer_Punkt_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Technischer_Punkt_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Technischer_Punkt_TypeClass#isInvalidReference()
	 * @see #getID_Technischer_Punkt_TypeClass()
	 * @generated
	 */
	EAttribute getID_Technischer_Punkt_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass <em>ID TOP Kante ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID TOP Kante ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_TOP_Kante_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_TOP_Kante_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_TOP_Kante_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_TOP_Kante_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_TOP_Kante_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_TypeClass <em>ID TOP Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID TOP Kante Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_TypeClass
	 * @generated
	 */
	EClass getID_TOP_Kante_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_TypeClass#getValue()
	 * @see #getID_TOP_Kante_TypeClass()
	 * @generated
	 */
	EReference getID_TOP_Kante_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_TypeClass#isInvalidReference()
	 * @see #getID_TOP_Kante_TypeClass()
	 * @generated
	 */
	EAttribute getID_TOP_Kante_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_TOP_Knoten_TypeClass <em>ID TOP Knoten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID TOP Knoten Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_TOP_Knoten_TypeClass
	 * @generated
	 */
	EClass getID_TOP_Knoten_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_TOP_Knoten_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_TOP_Knoten_TypeClass#getValue()
	 * @see #getID_TOP_Knoten_TypeClass()
	 * @generated
	 */
	EReference getID_TOP_Knoten_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_TOP_Knoten_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_TOP_Knoten_TypeClass#isInvalidReference()
	 * @see #getID_TOP_Knoten_TypeClass()
	 * @generated
	 */
	EAttribute getID_TOP_Knoten_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Trasse_Kante_TypeClass <em>ID Trasse Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Trasse Kante Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Trasse_Kante_TypeClass
	 * @generated
	 */
	EClass getID_Trasse_Kante_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Trasse_Kante_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Trasse_Kante_TypeClass#getValue()
	 * @see #getID_Trasse_Kante_TypeClass()
	 * @generated
	 */
	EReference getID_Trasse_Kante_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Trasse_Kante_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Trasse_Kante_TypeClass#isInvalidReference()
	 * @see #getID_Trasse_Kante_TypeClass()
	 * @generated
	 */
	EAttribute getID_Trasse_Kante_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Trasse_Knoten_TypeClass <em>ID Trasse Knoten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Trasse Knoten Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Trasse_Knoten_TypeClass
	 * @generated
	 */
	EClass getID_Trasse_Knoten_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Trasse_Knoten_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Trasse_Knoten_TypeClass#getValue()
	 * @see #getID_Trasse_Knoten_TypeClass()
	 * @generated
	 */
	EReference getID_Trasse_Knoten_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Trasse_Knoten_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Trasse_Knoten_TypeClass#isInvalidReference()
	 * @see #getID_Trasse_Knoten_TypeClass()
	 * @generated
	 */
	EAttribute getID_Trasse_Knoten_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Ueberhoehung_TypeClass <em>ID Ueberhoehung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Ueberhoehung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ueberhoehung_TypeClass
	 * @generated
	 */
	EClass getID_Ueberhoehung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Ueberhoehung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ueberhoehung_TypeClass#getValue()
	 * @see #getID_Ueberhoehung_TypeClass()
	 * @generated
	 */
	EReference getID_Ueberhoehung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Ueberhoehung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ueberhoehung_TypeClass#isInvalidReference()
	 * @see #getID_Ueberhoehung_TypeClass()
	 * @generated
	 */
	EAttribute getID_Ueberhoehung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Nach_TypeClass <em>ID Uebertragungsweg Nach Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Uebertragungsweg Nach Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Nach_TypeClass
	 * @generated
	 */
	EClass getID_Uebertragungsweg_Nach_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Nach_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Nach_TypeClass#getValue()
	 * @see #getID_Uebertragungsweg_Nach_TypeClass()
	 * @generated
	 */
	EReference getID_Uebertragungsweg_Nach_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Nach_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Nach_TypeClass#isInvalidReference()
	 * @see #getID_Uebertragungsweg_Nach_TypeClass()
	 * @generated
	 */
	EAttribute getID_Uebertragungsweg_Nach_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Von_TypeClass <em>ID Uebertragungsweg Von Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Uebertragungsweg Von Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Von_TypeClass
	 * @generated
	 */
	EClass getID_Uebertragungsweg_Von_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Von_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Von_TypeClass#getValue()
	 * @see #getID_Uebertragungsweg_Von_TypeClass()
	 * @generated
	 */
	EReference getID_Uebertragungsweg_Von_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Von_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Von_TypeClass#isInvalidReference()
	 * @see #getID_Uebertragungsweg_Von_TypeClass()
	 * @generated
	 */
	EAttribute getID_Uebertragungsweg_Von_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Umfahrpunkt_TypeClass <em>ID Umfahrpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Umfahrpunkt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Umfahrpunkt_TypeClass
	 * @generated
	 */
	EClass getID_Umfahrpunkt_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Umfahrpunkt_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Umfahrpunkt_TypeClass#getValue()
	 * @see #getID_Umfahrpunkt_TypeClass()
	 * @generated
	 */
	EReference getID_Umfahrpunkt_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Umfahrpunkt_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Umfahrpunkt_TypeClass#isInvalidReference()
	 * @see #getID_Umfahrpunkt_TypeClass()
	 * @generated
	 */
	EAttribute getID_Umfahrpunkt_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass <em>ID Unterbringung ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Unterbringung ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Unterbringung_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_Unterbringung_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_Unterbringung_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_Unterbringung_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_Unterbringung_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_Technik_TypeClass <em>ID Unterbringung Technik Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Unterbringung Technik Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_Technik_TypeClass
	 * @generated
	 */
	EClass getID_Unterbringung_Technik_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_Technik_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_Technik_TypeClass#getValue()
	 * @see #getID_Unterbringung_Technik_TypeClass()
	 * @generated
	 */
	EReference getID_Unterbringung_Technik_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_Technik_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_Technik_TypeClass#isInvalidReference()
	 * @see #getID_Unterbringung_Technik_TypeClass()
	 * @generated
	 */
	EAttribute getID_Unterbringung_Technik_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_TypeClass <em>ID Unterbringung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Unterbringung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_TypeClass
	 * @generated
	 */
	EClass getID_Unterbringung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_TypeClass#getValue()
	 * @see #getID_Unterbringung_TypeClass()
	 * @generated
	 */
	EReference getID_Unterbringung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_TypeClass#isInvalidReference()
	 * @see #getID_Unterbringung_TypeClass()
	 * @generated
	 */
	EAttribute getID_Unterbringung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Ur_Objekt_TypeClass <em>ID Ur Objekt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Ur Objekt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ur_Objekt_TypeClass
	 * @generated
	 */
	EClass getID_Ur_Objekt_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Ur_Objekt_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ur_Objekt_TypeClass#getValue()
	 * @see #getID_Ur_Objekt_TypeClass()
	 * @generated
	 */
	EReference getID_Ur_Objekt_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Ur_Objekt_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ur_Objekt_TypeClass#isInvalidReference()
	 * @see #getID_Ur_Objekt_TypeClass()
	 * @generated
	 */
	EAttribute getID_Ur_Objekt_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Verknuepftes_Element_TypeClass <em>ID Verknuepftes Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Verknuepftes Element Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Verknuepftes_Element_TypeClass
	 * @generated
	 */
	EClass getID_Verknuepftes_Element_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Verknuepftes_Element_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Verknuepftes_Element_TypeClass#getValue()
	 * @see #getID_Verknuepftes_Element_TypeClass()
	 * @generated
	 */
	EReference getID_Verknuepftes_Element_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Verknuepftes_Element_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Verknuepftes_Element_TypeClass#isInvalidReference()
	 * @see #getID_Verknuepftes_Element_TypeClass()
	 * @generated
	 */
	EAttribute getID_Verknuepftes_Element_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_ohne_Proxy_TypeClass <em>ID WKr Anlage ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID WKr Anlage ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_W_Kr_Anlage_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_W_Kr_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_W_Kr_Anlage_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_W_Kr_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_W_Kr_Anlage_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_TypeClass <em>ID WKr Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID WKr Anlage Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_TypeClass
	 * @generated
	 */
	EClass getID_W_Kr_Anlage_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_TypeClass#getValue()
	 * @see #getID_W_Kr_Anlage_TypeClass()
	 * @generated
	 */
	EReference getID_W_Kr_Anlage_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_TypeClass#isInvalidReference()
	 * @see #getID_W_Kr_Anlage_TypeClass()
	 * @generated
	 */
	EAttribute getID_W_Kr_Anlage_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Element_TypeClass <em>ID WKr Gsp Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID WKr Gsp Element Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Element_TypeClass
	 * @generated
	 */
	EClass getID_W_Kr_Gsp_Element_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Element_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Element_TypeClass#getValue()
	 * @see #getID_W_Kr_Gsp_Element_TypeClass()
	 * @generated
	 */
	EReference getID_W_Kr_Gsp_Element_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Element_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Element_TypeClass#isInvalidReference()
	 * @see #getID_W_Kr_Gsp_Element_TypeClass()
	 * @generated
	 */
	EAttribute getID_W_Kr_Gsp_Element_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Komponente_TypeClass <em>ID WKr Gsp Komponente Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID WKr Gsp Komponente Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Komponente_TypeClass
	 * @generated
	 */
	EClass getID_W_Kr_Gsp_Komponente_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Komponente_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Komponente_TypeClass#getValue()
	 * @see #getID_W_Kr_Gsp_Komponente_TypeClass()
	 * @generated
	 */
	EReference getID_W_Kr_Gsp_Komponente_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Komponente_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Komponente_TypeClass#isInvalidReference()
	 * @see #getID_W_Kr_Gsp_Komponente_TypeClass()
	 * @generated
	 */
	EAttribute getID_W_Kr_Gsp_Komponente_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Weichenlaufkette_TypeClass <em>ID Weichenlaufkette Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Weichenlaufkette Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Weichenlaufkette_TypeClass
	 * @generated
	 */
	EClass getID_Weichenlaufkette_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Weichenlaufkette_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Weichenlaufkette_TypeClass#getValue()
	 * @see #getID_Weichenlaufkette_TypeClass()
	 * @generated
	 */
	EReference getID_Weichenlaufkette_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Weichenlaufkette_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Weichenlaufkette_TypeClass#isInvalidReference()
	 * @see #getID_Weichenlaufkette_TypeClass()
	 * @generated
	 */
	EAttribute getID_Weichenlaufkette_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Ziel_TypeClass <em>ID Ziel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Ziel Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ziel_TypeClass
	 * @generated
	 */
	EClass getID_Ziel_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Ziel_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ziel_TypeClass#getValue()
	 * @see #getID_Ziel_TypeClass()
	 * @generated
	 */
	EReference getID_Ziel_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Ziel_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ziel_TypeClass#isInvalidReference()
	 * @see #getID_Ziel_TypeClass()
	 * @generated
	 */
	EAttribute getID_Ziel_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass <em>ID ZL DLP Fstr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZL DLP Fstr Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass
	 * @generated
	 */
	EClass getID_ZL_DLP_Fstr_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass#getValue()
	 * @see #getID_ZL_DLP_Fstr_TypeClass()
	 * @generated
	 */
	EReference getID_ZL_DLP_Fstr_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass#isInvalidReference()
	 * @see #getID_ZL_DLP_Fstr_TypeClass()
	 * @generated
	 */
	EAttribute getID_ZL_DLP_Fstr_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_Fstr_TypeClass <em>ID ZL Fstr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZL Fstr Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_Fstr_TypeClass
	 * @generated
	 */
	EClass getID_ZL_Fstr_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_Fstr_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_Fstr_TypeClass#getValue()
	 * @see #getID_ZL_Fstr_TypeClass()
	 * @generated
	 */
	EReference getID_ZL_Fstr_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_Fstr_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_Fstr_TypeClass#isInvalidReference()
	 * @see #getID_ZL_Fstr_TypeClass()
	 * @generated
	 */
	EAttribute getID_ZL_Fstr_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_Signalgruppe_TypeClass <em>ID ZL Signalgruppe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZL Signalgruppe Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_Signalgruppe_TypeClass
	 * @generated
	 */
	EClass getID_ZL_Signalgruppe_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_Signalgruppe_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_Signalgruppe_TypeClass#getValue()
	 * @see #getID_ZL_Signalgruppe_TypeClass()
	 * @generated
	 */
	EReference getID_ZL_Signalgruppe_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_Signalgruppe_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_Signalgruppe_TypeClass#isInvalidReference()
	 * @see #getID_ZL_Signalgruppe_TypeClass()
	 * @generated
	 */
	EAttribute getID_ZL_Signalgruppe_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_TypeClass <em>ID ZL Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZL Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_TypeClass
	 * @generated
	 */
	EClass getID_ZL_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_TypeClass#getValue()
	 * @see #getID_ZL_TypeClass()
	 * @generated
	 */
	EReference getID_ZL_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_TypeClass#isInvalidReference()
	 * @see #getID_ZL_TypeClass()
	 * @generated
	 */
	EAttribute getID_ZL_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_ohne_Proxy_TypeClass <em>ID ZLV Bus ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZLV Bus ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_ZLV_Bus_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_ohne_Proxy_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_ohne_Proxy_TypeClass#getValue()
	 * @see #getID_ZLV_Bus_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EReference getID_ZLV_Bus_ohne_Proxy_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_ohne_Proxy_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_ohne_Proxy_TypeClass#isInvalidReference()
	 * @see #getID_ZLV_Bus_ohne_Proxy_TypeClass()
	 * @generated
	 */
	EAttribute getID_ZLV_Bus_ohne_Proxy_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_TypeClass <em>ID ZLV Bus Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZLV Bus Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_TypeClass
	 * @generated
	 */
	EClass getID_ZLV_Bus_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_TypeClass#getValue()
	 * @see #getID_ZLV_Bus_TypeClass()
	 * @generated
	 */
	EReference getID_ZLV_Bus_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_TypeClass#isInvalidReference()
	 * @see #getID_ZLV_Bus_TypeClass()
	 * @generated
	 */
	EAttribute getID_ZLV_Bus_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_Anstoss_TypeClass <em>ID ZN Anzeigefeld Anstoss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZN Anzeigefeld Anstoss Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_Anstoss_TypeClass
	 * @generated
	 */
	EClass getID_ZN_Anzeigefeld_Anstoss_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_Anstoss_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_Anstoss_TypeClass#getValue()
	 * @see #getID_ZN_Anzeigefeld_Anstoss_TypeClass()
	 * @generated
	 */
	EReference getID_ZN_Anzeigefeld_Anstoss_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_Anstoss_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_Anstoss_TypeClass#isInvalidReference()
	 * @see #getID_ZN_Anzeigefeld_Anstoss_TypeClass()
	 * @generated
	 */
	EAttribute getID_ZN_Anzeigefeld_Anstoss_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_TypeClass <em>ID ZN Anzeigefeld Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZN Anzeigefeld Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_TypeClass
	 * @generated
	 */
	EClass getID_ZN_Anzeigefeld_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_TypeClass#getValue()
	 * @see #getID_ZN_Anzeigefeld_TypeClass()
	 * @generated
	 */
	EReference getID_ZN_Anzeigefeld_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_TypeClass#isInvalidReference()
	 * @see #getID_ZN_Anzeigefeld_TypeClass()
	 * @generated
	 */
	EAttribute getID_ZN_Anzeigefeld_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Fortschalt_Kriterium_TypeClass <em>ID ZN Fortschalt Kriterium Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZN Fortschalt Kriterium Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Fortschalt_Kriterium_TypeClass
	 * @generated
	 */
	EClass getID_ZN_Fortschalt_Kriterium_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Fortschalt_Kriterium_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Fortschalt_Kriterium_TypeClass#getValue()
	 * @see #getID_ZN_Fortschalt_Kriterium_TypeClass()
	 * @generated
	 */
	EReference getID_ZN_Fortschalt_Kriterium_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Fortschalt_Kriterium_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Fortschalt_Kriterium_TypeClass#isInvalidReference()
	 * @see #getID_ZN_Fortschalt_Kriterium_TypeClass()
	 * @generated
	 */
	EAttribute getID_ZN_Fortschalt_Kriterium_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass <em>ID ZN Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZN Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass
	 * @generated
	 */
	EClass getID_ZN_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass#getValue()
	 * @see #getID_ZN_TypeClass()
	 * @generated
	 */
	EReference getID_ZN_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass#isInvalidReference()
	 * @see #getID_ZN_TypeClass()
	 * @generated
	 */
	EAttribute getID_ZN_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Unterstation_TypeClass <em>ID ZN Unterstation Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZN Unterstation Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Unterstation_TypeClass
	 * @generated
	 */
	EClass getID_ZN_Unterstation_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Unterstation_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Unterstation_TypeClass#getValue()
	 * @see #getID_ZN_Unterstation_TypeClass()
	 * @generated
	 */
	EReference getID_ZN_Unterstation_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Unterstation_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Unterstation_TypeClass#isInvalidReference()
	 * @see #getID_ZN_Unterstation_TypeClass()
	 * @generated
	 */
	EAttribute getID_ZN_Unterstation_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_ZBS_TypeClass <em>ID ZN ZBS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZN ZBS Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_ZBS_TypeClass
	 * @generated
	 */
	EClass getID_ZN_ZBS_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_ZBS_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_ZBS_TypeClass#getValue()
	 * @see #getID_ZN_ZBS_TypeClass()
	 * @generated
	 */
	EReference getID_ZN_ZBS_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_ZBS_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_ZBS_TypeClass#isInvalidReference()
	 * @see #getID_ZN_ZBS_TypeClass()
	 * @generated
	 */
	EAttribute getID_ZN_ZBS_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Zugeinwirkung_TypeClass <em>ID Zugeinwirkung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Zugeinwirkung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Zugeinwirkung_TypeClass
	 * @generated
	 */
	EClass getID_Zugeinwirkung_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Zugeinwirkung_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Zugeinwirkung_TypeClass#getValue()
	 * @see #getID_Zugeinwirkung_TypeClass()
	 * @generated
	 */
	EReference getID_Zugeinwirkung_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Zugeinwirkung_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Zugeinwirkung_TypeClass#isInvalidReference()
	 * @see #getID_Zugeinwirkung_TypeClass()
	 * @generated
	 */
	EAttribute getID_Zugeinwirkung_TypeClass_InvalidReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Verweise.ID_Zweites_Haltfallkriterium_TypeClass <em>ID Zweites Haltfallkriterium Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Zweites Haltfallkriterium Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Zweites_Haltfallkriterium_TypeClass
	 * @generated
	 */
	EClass getID_Zweites_Haltfallkriterium_TypeClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.set.model.planpro.Verweise.ID_Zweites_Haltfallkriterium_TypeClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Zweites_Haltfallkriterium_TypeClass#getValue()
	 * @see #getID_Zweites_Haltfallkriterium_TypeClass()
	 * @generated
	 */
	EReference getID_Zweites_Haltfallkriterium_TypeClass_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Verweise.ID_Zweites_Haltfallkriterium_TypeClass#isInvalidReference <em>Invalid Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Reference</em>'.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Zweites_Haltfallkriterium_TypeClass#isInvalidReference()
	 * @see #getID_Zweites_Haltfallkriterium_TypeClass()
	 * @generated
	 */
	EAttribute getID_Zweites_Haltfallkriterium_TypeClass_InvalidReference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VerweiseFactory getVerweiseFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Anforderer_Element_TypeClassImpl <em>ID Anforderer Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Anforderer_Element_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Anforderer_Element_TypeClass()
		 * @generated
		 */
		EClass ID_ANFORDERER_ELEMENT_TYPE_CLASS = eINSTANCE.getID_Anforderer_Element_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ANFORDERER_ELEMENT_TYPE_CLASS__VALUE = eINSTANCE.getID_Anforderer_Element_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ANFORDERER_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Anforderer_Element_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Anforderung_TypeClassImpl <em>ID Anforderung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Anforderung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Anforderung_TypeClass()
		 * @generated
		 */
		EClass ID_ANFORDERUNG_TYPE_CLASS = eINSTANCE.getID_Anforderung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ANFORDERUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_Anforderung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ANFORDERUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Anforderung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Anhang_ohne_Proxy_TypeClassImpl <em>ID Anhang ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Anhang_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Anhang_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_ANHANG_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Anhang_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ANHANG_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Anhang_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ANHANG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Anhang_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Anhang_TypeClassImpl <em>ID Anhang Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Anhang_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Anhang_TypeClass()
		 * @generated
		 */
		EClass ID_ANHANG_TYPE_CLASS = eINSTANCE.getID_Anhang_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ANHANG_TYPE_CLASS__VALUE = eINSTANCE.getID_Anhang_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ANHANG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Anhang_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_AnhangBearbeitungsvermerk_TypeClassImpl <em>ID Anhang Bearbeitungsvermerk Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_AnhangBearbeitungsvermerk_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_AnhangBearbeitungsvermerk_TypeClass()
		 * @generated
		 */
		EClass ID_ANHANG_BEARBEITUNGSVERMERK_TYPE_CLASS = eINSTANCE.getID_AnhangBearbeitungsvermerk_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ANHANG_BEARBEITUNGSVERMERK_TYPE_CLASS__VALUE = eINSTANCE.getID_AnhangBearbeitungsvermerk_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ANHANG_BEARBEITUNGSVERMERK_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_AnhangBearbeitungsvermerk_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Anschluss_Element_TypeClassImpl <em>ID Anschluss Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Anschluss_Element_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Anschluss_Element_TypeClass()
		 * @generated
		 */
		EClass ID_ANSCHLUSS_ELEMENT_TYPE_CLASS = eINSTANCE.getID_Anschluss_Element_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ANSCHLUSS_ELEMENT_TYPE_CLASS__VALUE = eINSTANCE.getID_Anschluss_Element_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ANSCHLUSS_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Anschluss_Element_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ATO_TS_Instanz_ohne_Proxy_TypeClassImpl <em>ID ATO TS Instanz ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ATO_TS_Instanz_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ATO_TS_Instanz_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_ATO_TS_INSTANZ_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_ATO_TS_Instanz_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ATO_TS_INSTANZ_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_ATO_TS_Instanz_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ATO_TS_INSTANZ_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ATO_TS_Instanz_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ATO_TS_Instanz_TypeClassImpl <em>ID ATO TS Instanz Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ATO_TS_Instanz_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ATO_TS_Instanz_TypeClass()
		 * @generated
		 */
		EClass ID_ATO_TS_INSTANZ_TYPE_CLASS = eINSTANCE.getID_ATO_TS_Instanz_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ATO_TS_INSTANZ_TYPE_CLASS__VALUE = eINSTANCE.getID_ATO_TS_Instanz_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ATO_TS_INSTANZ_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ATO_TS_Instanz_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClassImpl <em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Aussenelementansteuerung_ohne_Proxy_TypeClassImpl <em>ID Aussenelementansteuerung ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Aussenelementansteuerung_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Aussenelementansteuerung_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Aussenelementansteuerung_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Aussenelementansteuerung_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Aussenelementansteuerung_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Aussenelementansteuerung_TypeClassImpl <em>ID Aussenelementansteuerung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Aussenelementansteuerung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Aussenelementansteuerung_TypeClass()
		 * @generated
		 */
		EClass ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS = eINSTANCE.getID_Aussenelementansteuerung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_Aussenelementansteuerung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Aussenelementansteuerung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bahnsteig_Anlage_TypeClassImpl <em>ID Bahnsteig Anlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bahnsteig_Anlage_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bahnsteig_Anlage_TypeClass()
		 * @generated
		 */
		EClass ID_BAHNSTEIG_ANLAGE_TYPE_CLASS = eINSTANCE.getID_Bahnsteig_Anlage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BAHNSTEIG_ANLAGE_TYPE_CLASS__VALUE = eINSTANCE.getID_Bahnsteig_Anlage_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BAHNSTEIG_ANLAGE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Bahnsteig_Anlage_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bahnsteig_Kante_ohne_Proxy_TypeClassImpl <em>ID Bahnsteig Kante ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bahnsteig_Kante_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bahnsteig_Kante_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Bahnsteig_Kante_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Bahnsteig_Kante_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Bahnsteig_Kante_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bahnsteig_Kante_TypeClassImpl <em>ID Bahnsteig Kante Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bahnsteig_Kante_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bahnsteig_Kante_TypeClass()
		 * @generated
		 */
		EClass ID_BAHNSTEIG_KANTE_TYPE_CLASS = eINSTANCE.getID_Bahnsteig_Kante_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BAHNSTEIG_KANTE_TYPE_CLASS__VALUE = eINSTANCE.getID_Bahnsteig_Kante_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BAHNSTEIG_KANTE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Bahnsteig_Kante_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Balise_ohne_Proxy_TypeClassImpl <em>ID Balise ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Balise_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Balise_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_BALISE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Balise_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BALISE_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Balise_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BALISE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Balise_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Balise_TypeClassImpl <em>ID Balise Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Balise_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Balise_TypeClass()
		 * @generated
		 */
		EClass ID_BALISE_TYPE_CLASS = eINSTANCE.getID_Balise_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BALISE_TYPE_CLASS__VALUE = eINSTANCE.getID_Balise_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BALISE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Balise_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Basis_Objekt_TypeClassImpl <em>ID Basis Objekt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Basis_Objekt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Basis_Objekt_TypeClass()
		 * @generated
		 */
		EClass ID_BASIS_OBJEKT_TYPE_CLASS = eINSTANCE.getID_Basis_Objekt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BASIS_OBJEKT_TYPE_CLASS__VALUE = eINSTANCE.getID_Basis_Objekt_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BASIS_OBJEKT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Basis_Objekt_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Anzeige_Element_TypeClassImpl <em>ID Bedien Anzeige Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Anzeige_Element_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bedien_Anzeige_Element_TypeClass()
		 * @generated
		 */
		EClass ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS = eINSTANCE.getID_Bedien_Anzeige_Element_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__VALUE = eINSTANCE.getID_Bedien_Anzeige_Element_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Bedien_Anzeige_Element_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Bezirk_TypeClassImpl <em>ID Bedien Bezirk Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Bezirk_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bedien_Bezirk_TypeClass()
		 * @generated
		 */
		EClass ID_BEDIEN_BEZIRK_TYPE_CLASS = eINSTANCE.getID_Bedien_Bezirk_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BEDIEN_BEZIRK_TYPE_CLASS__VALUE = eINSTANCE.getID_Bedien_Bezirk_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BEDIEN_BEZIRK_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Bedien_Bezirk_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Einrichtung_Oertlich_TypeClassImpl <em>ID Bedien Einrichtung Oertlich Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Einrichtung_Oertlich_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bedien_Einrichtung_Oertlich_TypeClass()
		 * @generated
		 */
		EClass ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS = eINSTANCE.getID_Bedien_Einrichtung_Oertlich_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS__VALUE = eINSTANCE.getID_Bedien_Einrichtung_Oertlich_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Bedien_Einrichtung_Oertlich_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Oberflaeche_TypeClassImpl <em>ID Bedien Oberflaeche Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Oberflaeche_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bedien_Oberflaeche_TypeClass()
		 * @generated
		 */
		EClass ID_BEDIEN_OBERFLAECHE_TYPE_CLASS = eINSTANCE.getID_Bedien_Oberflaeche_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BEDIEN_OBERFLAECHE_TYPE_CLASS__VALUE = eINSTANCE.getID_Bedien_Oberflaeche_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BEDIEN_OBERFLAECHE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Bedien_Oberflaeche_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Standort_TypeClassImpl <em>ID Bedien Standort Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Standort_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bedien_Standort_TypeClass()
		 * @generated
		 */
		EClass ID_BEDIEN_STANDORT_TYPE_CLASS = eINSTANCE.getID_Bedien_Standort_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BEDIEN_STANDORT_TYPE_CLASS__VALUE = eINSTANCE.getID_Bedien_Standort_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BEDIEN_STANDORT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Bedien_Standort_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Zentrale_TypeClassImpl <em>ID Bedien Zentrale Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bedien_Zentrale_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bedien_Zentrale_TypeClass()
		 * @generated
		 */
		EClass ID_BEDIEN_ZENTRALE_TYPE_CLASS = eINSTANCE.getID_Bedien_Zentrale_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BEDIEN_ZENTRALE_TYPE_CLASS__VALUE = eINSTANCE.getID_Bedien_Zentrale_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BEDIEN_ZENTRALE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Bedien_Zentrale_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Befestigung_Bauwerk_TypeClassImpl <em>ID Befestigung Bauwerk Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Befestigung_Bauwerk_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Befestigung_Bauwerk_TypeClass()
		 * @generated
		 */
		EClass ID_BEFESTIGUNG_BAUWERK_TYPE_CLASS = eINSTANCE.getID_Befestigung_Bauwerk_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BEFESTIGUNG_BAUWERK_TYPE_CLASS__VALUE = eINSTANCE.getID_Befestigung_Bauwerk_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BEFESTIGUNG_BAUWERK_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Befestigung_Bauwerk_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Beginn_Bereich_TypeClassImpl <em>ID Beginn Bereich Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Beginn_Bereich_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Beginn_Bereich_TypeClass()
		 * @generated
		 */
		EClass ID_BEGINN_BEREICH_TYPE_CLASS = eINSTANCE.getID_Beginn_Bereich_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BEGINN_BEREICH_TYPE_CLASS__VALUE = eINSTANCE.getID_Beginn_Bereich_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BEGINN_BEREICH_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Beginn_Bereich_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Bezugspunkt_Positionierung_TypeClassImpl <em>ID Bezugspunkt Positionierung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Bezugspunkt_Positionierung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Bezugspunkt_Positionierung_TypeClass()
		 * @generated
		 */
		EClass ID_BEZUGSPUNKT_POSITIONIERUNG_TYPE_CLASS = eINSTANCE.getID_Bezugspunkt_Positionierung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BEZUGSPUNKT_POSITIONIERUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_Bezugspunkt_Positionierung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BEZUGSPUNKT_POSITIONIERUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Bezugspunkt_Positionierung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Binaerdaten_ohne_Proxy_TypeClassImpl <em>ID Binaerdaten ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Binaerdaten_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Binaerdaten_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_BINAERDATEN_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Binaerdaten_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BINAERDATEN_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Binaerdaten_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BINAERDATEN_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Binaerdaten_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Block_Anlage_TypeClassImpl <em>ID Block Anlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Block_Anlage_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Block_Anlage_TypeClass()
		 * @generated
		 */
		EClass ID_BLOCK_ANLAGE_TYPE_CLASS = eINSTANCE.getID_Block_Anlage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BLOCK_ANLAGE_TYPE_CLASS__VALUE = eINSTANCE.getID_Block_Anlage_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BLOCK_ANLAGE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Block_Anlage_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Block_Element_TypeClassImpl <em>ID Block Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Block_Element_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Block_Element_TypeClass()
		 * @generated
		 */
		EClass ID_BLOCK_ELEMENT_TYPE_CLASS = eINSTANCE.getID_Block_Element_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BLOCK_ELEMENT_TYPE_CLASS__VALUE = eINSTANCE.getID_Block_Element_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BLOCK_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Block_Element_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Block_Strecke_TypeClassImpl <em>ID Block Strecke Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Block_Strecke_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Block_Strecke_TypeClass()
		 * @generated
		 */
		EClass ID_BLOCK_STRECKE_TYPE_CLASS = eINSTANCE.getID_Block_Strecke_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BLOCK_STRECKE_TYPE_CLASS__VALUE = eINSTANCE.getID_Block_Strecke_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BLOCK_STRECKE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Block_Strecke_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Anlage_ohne_Proxy_TypeClassImpl <em>ID BUE Anlage ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Anlage_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_Anlage_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_BUE_Anlage_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_BUE_Anlage_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_BUE_Anlage_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Anlage_TypeClassImpl <em>ID BUE Anlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Anlage_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_Anlage_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_ANLAGE_TYPE_CLASS = eINSTANCE.getID_BUE_Anlage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BUE_ANLAGE_TYPE_CLASS__VALUE = eINSTANCE.getID_BUE_Anlage_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BUE_ANLAGE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_BUE_Anlage_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Bedien_Anzeige_Element_TypeClassImpl <em>ID BUE Bedien Anzeige Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Bedien_Anzeige_Element_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_Bedien_Anzeige_Element_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS = eINSTANCE.getID_BUE_Bedien_Anzeige_Element_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__VALUE = eINSTANCE.getID_BUE_Bedien_Anzeige_Element_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_BUE_Bedien_Anzeige_Element_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Einschaltung_TypeClassImpl <em>ID BUE Einschaltung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Einschaltung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_Einschaltung_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_EINSCHALTUNG_TYPE_CLASS = eINSTANCE.getID_BUE_Einschaltung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BUE_EINSCHALTUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_BUE_Einschaltung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BUE_EINSCHALTUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_BUE_Einschaltung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Gleisbezogener_Gefahrraum_TypeClassImpl <em>ID BUE Gleisbezogener Gefahrraum Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Gleisbezogener_Gefahrraum_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_Gleisbezogener_Gefahrraum_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS = eINSTANCE.getID_BUE_Gleisbezogener_Gefahrraum_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS__VALUE = eINSTANCE.getID_BUE_Gleisbezogener_Gefahrraum_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_BUE_Gleisbezogener_Gefahrraum_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Schnittstelle_TypeClassImpl <em>ID BUE Schnittstelle Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_Schnittstelle_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_Schnittstelle_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_SCHNITTSTELLE_TYPE_CLASS = eINSTANCE.getID_BUE_Schnittstelle_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BUE_SCHNITTSTELLE_TYPE_CLASS__VALUE = eINSTANCE.getID_BUE_Schnittstelle_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BUE_SCHNITTSTELLE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_BUE_Schnittstelle_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_WS_Fstr_Zuordnung_TypeClassImpl <em>ID BUE WS Fstr Zuordnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_BUE_WS_Fstr_Zuordnung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_BUE_WS_Fstr_Zuordnung_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS = eINSTANCE.getID_BUE_WS_Fstr_Zuordnung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_BUE_WS_Fstr_Zuordnung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_BUE_WS_Fstr_Zuordnung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Datenpunkt_ohne_Proxy_TypeClassImpl <em>ID Datenpunkt ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Datenpunkt_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Datenpunkt_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Datenpunkt_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Datenpunkt_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Datenpunkt_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Datenpunkt_TypeClassImpl <em>ID Datenpunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Datenpunkt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Datenpunkt_TypeClass()
		 * @generated
		 */
		EClass ID_DATENPUNKT_TYPE_CLASS = eINSTANCE.getID_Datenpunkt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_DATENPUNKT_TYPE_CLASS__VALUE = eINSTANCE.getID_Datenpunkt_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_DATENPUNKT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Datenpunkt_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_DP_Bezug_Funktional_TypeClassImpl <em>ID DP Bezug Funktional Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_DP_Bezug_Funktional_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_DP_Bezug_Funktional_TypeClass()
		 * @generated
		 */
		EClass ID_DP_BEZUG_FUNKTIONAL_TYPE_CLASS = eINSTANCE.getID_DP_Bezug_Funktional_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_DP_BEZUG_FUNKTIONAL_TYPE_CLASS__VALUE = eINSTANCE.getID_DP_Bezug_Funktional_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_DP_BEZUG_FUNKTIONAL_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_DP_Bezug_Funktional_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Einschaltpunkt_TypeClassImpl <em>ID Einschaltpunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Einschaltpunkt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Einschaltpunkt_TypeClass()
		 * @generated
		 */
		EClass ID_EINSCHALTPUNKT_TYPE_CLASS = eINSTANCE.getID_Einschaltpunkt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_EINSCHALTPUNKT_TYPE_CLASS__VALUE = eINSTANCE.getID_Einschaltpunkt_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_EINSCHALTPUNKT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Einschaltpunkt_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Element_Grenze_TypeClassImpl <em>ID Element Grenze Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Element_Grenze_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Element_Grenze_TypeClass()
		 * @generated
		 */
		EClass ID_ELEMENT_GRENZE_TYPE_CLASS = eINSTANCE.getID_Element_Grenze_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ELEMENT_GRENZE_TYPE_CLASS__VALUE = eINSTANCE.getID_Element_Grenze_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ELEMENT_GRENZE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Element_Grenze_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Element_TypeClassImpl <em>ID Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Element_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Element_TypeClass()
		 * @generated
		 */
		EClass ID_ELEMENT_TYPE_CLASS = eINSTANCE.getID_Element_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ELEMENT_TYPE_CLASS__VALUE = eINSTANCE.getID_Element_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Element_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Element_Unterbringung_TypeClassImpl <em>ID Element Unterbringung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Element_Unterbringung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Element_Unterbringung_TypeClass()
		 * @generated
		 */
		EClass ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS = eINSTANCE.getID_Element_Unterbringung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_Element_Unterbringung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Element_Unterbringung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Energie_Eingang_TypeClassImpl <em>ID Energie Eingang Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Energie_Eingang_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Energie_Eingang_TypeClass()
		 * @generated
		 */
		EClass ID_ENERGIE_EINGANG_TYPE_CLASS = eINSTANCE.getID_Energie_Eingang_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ENERGIE_EINGANG_TYPE_CLASS__VALUE = eINSTANCE.getID_Energie_Eingang_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ENERGIE_EINGANG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Energie_Eingang_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Energie_TypeClassImpl <em>ID Energie Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Energie_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Energie_TypeClass()
		 * @generated
		 */
		EClass ID_ENERGIE_TYPE_CLASS = eINSTANCE.getID_Energie_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ENERGIE_TYPE_CLASS__VALUE = eINSTANCE.getID_Energie_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ENERGIE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Energie_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ESTW_Zentraleinheit_TypeClassImpl <em>ID ESTW Zentraleinheit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ESTW_Zentraleinheit_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ESTW_Zentraleinheit_TypeClass()
		 * @generated
		 */
		EClass ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS = eINSTANCE.getID_ESTW_Zentraleinheit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS__VALUE = eINSTANCE.getID_ESTW_Zentraleinheit_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ESTW_Zentraleinheit_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ETCS_Kante_TypeClassImpl <em>ID ETCS Kante Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ETCS_Kante_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ETCS_Kante_TypeClass()
		 * @generated
		 */
		EClass ID_ETCS_KANTE_TYPE_CLASS = eINSTANCE.getID_ETCS_Kante_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ETCS_KANTE_TYPE_CLASS__VALUE = eINSTANCE.getID_ETCS_Kante_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ETCS_KANTE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ETCS_Kante_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ETCS_Knoten_ohne_Proxy_TypeClassImpl <em>ID ETCS Knoten ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ETCS_Knoten_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ETCS_Knoten_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_ETCS_Knoten_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_ETCS_Knoten_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ETCS_Knoten_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ETCS_Knoten_TypeClassImpl <em>ID ETCS Knoten Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ETCS_Knoten_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ETCS_Knoten_TypeClass()
		 * @generated
		 */
		EClass ID_ETCS_KNOTEN_TYPE_CLASS = eINSTANCE.getID_ETCS_Knoten_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ETCS_KNOTEN_TYPE_CLASS__VALUE = eINSTANCE.getID_ETCS_Knoten_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ETCS_KNOTEN_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ETCS_Knoten_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_EV_Modul_TypeClassImpl <em>ID EV Modul Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_EV_Modul_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_EV_Modul_TypeClass()
		 * @generated
		 */
		EClass ID_EV_MODUL_TYPE_CLASS = eINSTANCE.getID_EV_Modul_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_EV_MODUL_TYPE_CLASS__VALUE = eINSTANCE.getID_EV_Modul_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_EV_MODUL_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_EV_Modul_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fachtelegramm_ohne_Proxy_TypeClassImpl <em>ID Fachtelegramm ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fachtelegramm_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fachtelegramm_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_FACHTELEGRAMM_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Fachtelegramm_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FACHTELEGRAMM_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Fachtelegramm_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FACHTELEGRAMM_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Fachtelegramm_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fachtelegramm_TypeClassImpl <em>ID Fachtelegramm Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fachtelegramm_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fachtelegramm_TypeClass()
		 * @generated
		 */
		EClass ID_FACHTELEGRAMM_TYPE_CLASS = eINSTANCE.getID_Fachtelegramm_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FACHTELEGRAMM_TYPE_CLASS__VALUE = eINSTANCE.getID_Fachtelegramm_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FACHTELEGRAMM_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Fachtelegramm_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fla_Schutz_TypeClassImpl <em>ID Fla Schutz Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fla_Schutz_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fla_Schutz_TypeClass()
		 * @generated
		 */
		EClass ID_FLA_SCHUTZ_TYPE_CLASS = eINSTANCE.getID_Fla_Schutz_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FLA_SCHUTZ_TYPE_CLASS__VALUE = eINSTANCE.getID_Fla_Schutz_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FLA_SCHUTZ_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Fla_Schutz_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Anlage_Rangier_Frei_TypeClassImpl <em>ID FMA Anlage Rangier Frei Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Anlage_Rangier_Frei_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_FMA_Anlage_Rangier_Frei_TypeClass()
		 * @generated
		 */
		EClass ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS = eINSTANCE.getID_FMA_Anlage_Rangier_Frei_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS__VALUE = eINSTANCE.getID_FMA_Anlage_Rangier_Frei_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_FMA_Anlage_Rangier_Frei_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Anlage_TypeClassImpl <em>ID FMA Anlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Anlage_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_FMA_Anlage_TypeClass()
		 * @generated
		 */
		EClass ID_FMA_ANLAGE_TYPE_CLASS = eINSTANCE.getID_FMA_Anlage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FMA_ANLAGE_TYPE_CLASS__VALUE = eINSTANCE.getID_FMA_Anlage_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FMA_ANLAGE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_FMA_Anlage_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Element_TypeClassImpl <em>ID FMA Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Element_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_FMA_Element_TypeClass()
		 * @generated
		 */
		EClass ID_FMA_ELEMENT_TYPE_CLASS = eINSTANCE.getID_FMA_Element_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FMA_ELEMENT_TYPE_CLASS__VALUE = eINSTANCE.getID_FMA_Element_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FMA_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_FMA_Element_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Komponente_TypeClassImpl <em>ID FMA Komponente Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_FMA_Komponente_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_FMA_Komponente_TypeClass()
		 * @generated
		 */
		EClass ID_FMA_KOMPONENTE_TYPE_CLASS = eINSTANCE.getID_FMA_Komponente_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FMA_KOMPONENTE_TYPE_CLASS__VALUE = eINSTANCE.getID_FMA_Komponente_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FMA_KOMPONENTE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_FMA_Komponente_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fortschaltung_Start_TypeClassImpl <em>ID Fortschaltung Start Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fortschaltung_Start_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fortschaltung_Start_TypeClass()
		 * @generated
		 */
		EClass ID_FORTSCHALTUNG_START_TYPE_CLASS = eINSTANCE.getID_Fortschaltung_Start_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FORTSCHALTUNG_START_TYPE_CLASS__VALUE = eINSTANCE.getID_Fortschaltung_Start_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FORTSCHALTUNG_START_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Fortschaltung_Start_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Aneinander_TypeClassImpl <em>ID Fstr Aneinander Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Aneinander_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_Aneinander_TypeClass()
		 * @generated
		 */
		EClass ID_FSTR_ANEINANDER_TYPE_CLASS = eINSTANCE.getID_Fstr_Aneinander_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FSTR_ANEINANDER_TYPE_CLASS__VALUE = eINSTANCE.getID_Fstr_Aneinander_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FSTR_ANEINANDER_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Fstr_Aneinander_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Ausschluss_Besonders_TypeClassImpl <em>ID Fstr Ausschluss Besonders Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Ausschluss_Besonders_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_Ausschluss_Besonders_TypeClass()
		 * @generated
		 */
		EClass ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS = eINSTANCE.getID_Fstr_Ausschluss_Besonders_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS__VALUE = eINSTANCE.getID_Fstr_Ausschluss_Besonders_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Fstr_Ausschluss_Besonders_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_DWeg_ohne_Proxy_TypeClassImpl <em>ID Fstr DWeg ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_DWeg_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_DWeg_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_FSTR_DWEG_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Fstr_DWeg_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FSTR_DWEG_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Fstr_DWeg_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FSTR_DWEG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Fstr_DWeg_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_DWeg_TypeClassImpl <em>ID Fstr DWeg Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_DWeg_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_DWeg_TypeClass()
		 * @generated
		 */
		EClass ID_FSTR_DWEG_TYPE_CLASS = eINSTANCE.getID_Fstr_DWeg_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FSTR_DWEG_TYPE_CLASS__VALUE = eINSTANCE.getID_Fstr_DWeg_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FSTR_DWEG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Fstr_DWeg_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Fahrweg_ohne_Proxy_TypeClassImpl <em>ID Fstr Fahrweg ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Fahrweg_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_Fahrweg_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_FSTR_FAHRWEG_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Fstr_Fahrweg_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FSTR_FAHRWEG_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Fstr_Fahrweg_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FSTR_FAHRWEG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Fstr_Fahrweg_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Fahrweg_TypeClassImpl <em>ID Fstr Fahrweg Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Fahrweg_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_Fahrweg_TypeClass()
		 * @generated
		 */
		EClass ID_FSTR_FAHRWEG_TYPE_CLASS = eINSTANCE.getID_Fstr_Fahrweg_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FSTR_FAHRWEG_TYPE_CLASS__VALUE = eINSTANCE.getID_Fstr_Fahrweg_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FSTR_FAHRWEG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Fstr_Fahrweg_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Zug_Rangier_TypeClassImpl <em>ID Fstr Zug Rangier Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Fstr_Zug_Rangier_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Fstr_Zug_Rangier_TypeClass()
		 * @generated
		 */
		EClass ID_FSTR_ZUG_RANGIER_TYPE_CLASS = eINSTANCE.getID_Fstr_Zug_Rangier_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FSTR_ZUG_RANGIER_TYPE_CLASS__VALUE = eINSTANCE.getID_Fstr_Zug_Rangier_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FSTR_ZUG_RANGIER_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Fstr_Zug_Rangier_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_FT_Anschaltbedingung_TypeClassImpl <em>ID FT Anschaltbedingung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_FT_Anschaltbedingung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_FT_Anschaltbedingung_TypeClass()
		 * @generated
		 */
		EClass ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS = eINSTANCE.getID_FT_Anschaltbedingung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_FT_Anschaltbedingung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_FT_Anschaltbedingung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_FT_Fahrweg_Teil_TypeClassImpl <em>ID FT Fahrweg Teil Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_FT_Fahrweg_Teil_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_FT_Fahrweg_Teil_TypeClass()
		 * @generated
		 */
		EClass ID_FT_FAHRWEG_TEIL_TYPE_CLASS = eINSTANCE.getID_FT_Fahrweg_Teil_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_FT_FAHRWEG_TEIL_TYPE_CLASS__VALUE = eINSTANCE.getID_FT_Fahrweg_Teil_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_FT_FAHRWEG_TEIL_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_FT_Fahrweg_Teil_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Art_TypeClassImpl <em>ID GEO Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_GEO_Art_TypeClass()
		 * @generated
		 */
		EClass ID_GEO_ART_TYPE_CLASS = eINSTANCE.getID_GEO_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_GEO_ART_TYPE_CLASS__VALUE = eINSTANCE.getID_GEO_Art_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_GEO_ART_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_GEO_Art_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Kante_TypeClassImpl <em>ID GEO Kante Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Kante_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_GEO_Kante_TypeClass()
		 * @generated
		 */
		EClass ID_GEO_KANTE_TYPE_CLASS = eINSTANCE.getID_GEO_Kante_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_GEO_KANTE_TYPE_CLASS__VALUE = eINSTANCE.getID_GEO_Kante_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_GEO_KANTE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_GEO_Kante_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Knoten_TypeClassImpl <em>ID GEO Knoten Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Knoten_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_GEO_Knoten_TypeClass()
		 * @generated
		 */
		EClass ID_GEO_KNOTEN_TYPE_CLASS = eINSTANCE.getID_GEO_Knoten_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_GEO_KNOTEN_TYPE_CLASS__VALUE = eINSTANCE.getID_GEO_Knoten_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_GEO_KNOTEN_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_GEO_Knoten_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Punkt_ohne_Proxy_TypeClassImpl <em>ID GEO Punkt ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Punkt_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_GEO_Punkt_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_GEO_Punkt_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_GEO_Punkt_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_GEO_Punkt_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Punkt_TypeClassImpl <em>ID GEO Punkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_GEO_Punkt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_GEO_Punkt_TypeClass()
		 * @generated
		 */
		EClass ID_GEO_PUNKT_TYPE_CLASS = eINSTANCE.getID_GEO_Punkt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_GEO_PUNKT_TYPE_CLASS__VALUE = eINSTANCE.getID_GEO_Punkt_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_GEO_PUNKT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_GEO_Punkt_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_GFR_Anlage_ohne_Proxy_TypeClassImpl <em>ID GFR Anlage ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_GFR_Anlage_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_GFR_Anlage_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_GFR_Anlage_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_GFR_Anlage_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_GFR_Anlage_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Gleis_Abschnitt_TypeClassImpl <em>ID Gleis Abschnitt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Gleis_Abschnitt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Gleis_Abschnitt_TypeClass()
		 * @generated
		 */
		EClass ID_GLEIS_ABSCHNITT_TYPE_CLASS = eINSTANCE.getID_Gleis_Abschnitt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_GLEIS_ABSCHNITT_TYPE_CLASS__VALUE = eINSTANCE.getID_Gleis_Abschnitt_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_GLEIS_ABSCHNITT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Gleis_Abschnitt_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Gleis_Bezeichnung_TypeClassImpl <em>ID Gleis Bezeichnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Gleis_Bezeichnung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Gleis_Bezeichnung_TypeClass()
		 * @generated
		 */
		EClass ID_GLEIS_BEZEICHNUNG_TYPE_CLASS = eINSTANCE.getID_Gleis_Bezeichnung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_GLEIS_BEZEICHNUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_Gleis_Bezeichnung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_GLEIS_BEZEICHNUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Gleis_Bezeichnung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Grenzzeichen_TypeClassImpl <em>ID Grenzzeichen Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Grenzzeichen_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Grenzzeichen_TypeClass()
		 * @generated
		 */
		EClass ID_GRENZZEICHEN_TYPE_CLASS = eINSTANCE.getID_Grenzzeichen_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_GRENZZEICHEN_TYPE_CLASS__VALUE = eINSTANCE.getID_Grenzzeichen_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_GRENZZEICHEN_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Grenzzeichen_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Handschalt_Wirkfunktion_TypeClassImpl <em>ID Handschalt Wirkfunktion Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Handschalt_Wirkfunktion_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Handschalt_Wirkfunktion_TypeClass()
		 * @generated
		 */
		EClass ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS = eINSTANCE.getID_Handschalt_Wirkfunktion_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS__VALUE = eINSTANCE.getID_Handschalt_Wirkfunktion_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Handschalt_Wirkfunktion_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Hoehenpunkt_TypeClassImpl <em>ID Hoehenpunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Hoehenpunkt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Hoehenpunkt_TypeClass()
		 * @generated
		 */
		EClass ID_HOEHENPUNKT_TYPE_CLASS = eINSTANCE.getID_Hoehenpunkt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_HOEHENPUNKT_TYPE_CLASS__VALUE = eINSTANCE.getID_Hoehenpunkt_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_HOEHENPUNKT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Hoehenpunkt_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Information_Eingang_TypeClassImpl <em>ID Information Eingang Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Information_Eingang_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Information_Eingang_TypeClass()
		 * @generated
		 */
		EClass ID_INFORMATION_EINGANG_TYPE_CLASS = eINSTANCE.getID_Information_Eingang_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_INFORMATION_EINGANG_TYPE_CLASS__VALUE = eINSTANCE.getID_Information_Eingang_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_INFORMATION_EINGANG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Information_Eingang_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Information_Primaer_TypeClassImpl <em>ID Information Primaer Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Information_Primaer_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Information_Primaer_TypeClass()
		 * @generated
		 */
		EClass ID_INFORMATION_PRIMAER_TYPE_CLASS = eINSTANCE.getID_Information_Primaer_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_INFORMATION_PRIMAER_TYPE_CLASS__VALUE = eINSTANCE.getID_Information_Primaer_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_INFORMATION_PRIMAER_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Information_Primaer_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Komponente_Programmiert_TypeClassImpl <em>ID Komponente Programmiert Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Komponente_Programmiert_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Komponente_Programmiert_TypeClass()
		 * @generated
		 */
		EClass ID_KOMPONENTE_PROGRAMMIERT_TYPE_CLASS = eINSTANCE.getID_Komponente_Programmiert_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_KOMPONENTE_PROGRAMMIERT_TYPE_CLASS__VALUE = eINSTANCE.getID_Komponente_Programmiert_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_KOMPONENTE_PROGRAMMIERT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Komponente_Programmiert_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Lageplan_Blattschnitt_TypeClassImpl <em>ID Lageplan Blattschnitt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Lageplan_Blattschnitt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Lageplan_Blattschnitt_TypeClass()
		 * @generated
		 */
		EClass ID_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS = eINSTANCE.getID_Lageplan_Blattschnitt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS__VALUE = eINSTANCE.getID_Lageplan_Blattschnitt_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Lageplan_Blattschnitt_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Lageplan_TypeClassImpl <em>ID Lageplan Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Lageplan_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Lageplan_TypeClass()
		 * @generated
		 */
		EClass ID_LAGEPLAN_TYPE_CLASS = eINSTANCE.getID_Lageplan_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_LAGEPLAN_TYPE_CLASS__VALUE = eINSTANCE.getID_Lageplan_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_LAGEPLAN_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Lageplan_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Lageplan_Zustand_TypeClassImpl <em>ID Lageplan Zustand Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Lageplan_Zustand_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Lageplan_Zustand_TypeClass()
		 * @generated
		 */
		EClass ID_LAGEPLAN_ZUSTAND_TYPE_CLASS = eINSTANCE.getID_Lageplan_Zustand_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_LAGEPLAN_ZUSTAND_TYPE_CLASS__VALUE = eINSTANCE.getID_Lageplan_Zustand_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_LAGEPLAN_ZUSTAND_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Lageplan_Zustand_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Anlage_ohne_Proxy_TypeClassImpl <em>ID LEU Anlage ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Anlage_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_LEU_Anlage_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_LEU_Anlage_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_LEU_Anlage_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_LEU_Anlage_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Anlage_TypeClassImpl <em>ID LEU Anlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Anlage_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_LEU_Anlage_TypeClass()
		 * @generated
		 */
		EClass ID_LEU_ANLAGE_TYPE_CLASS = eINSTANCE.getID_LEU_Anlage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_LEU_ANLAGE_TYPE_CLASS__VALUE = eINSTANCE.getID_LEU_Anlage_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_LEU_ANLAGE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_LEU_Anlage_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Bezug_Funktional_TypeClassImpl <em>ID LEU Bezug Funktional Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Bezug_Funktional_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_LEU_Bezug_Funktional_TypeClass()
		 * @generated
		 */
		EClass ID_LEU_BEZUG_FUNKTIONAL_TYPE_CLASS = eINSTANCE.getID_LEU_Bezug_Funktional_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_LEU_BEZUG_FUNKTIONAL_TYPE_CLASS__VALUE = eINSTANCE.getID_LEU_Bezug_Funktional_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_LEU_BEZUG_FUNKTIONAL_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_LEU_Bezug_Funktional_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Schaltkasten_ohne_Proxy_TypeClassImpl <em>ID LEU Schaltkasten ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_LEU_Schaltkasten_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_LEU_Schaltkasten_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_LEU_Schaltkasten_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_LEU_Schaltkasten_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_LEU_Schaltkasten_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_LO_Einbau_TypeClassImpl <em>ID LO Einbau Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_LO_Einbau_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_LO_Einbau_TypeClass()
		 * @generated
		 */
		EClass ID_LO_EINBAU_TYPE_CLASS = eINSTANCE.getID_LO_Einbau_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_LO_EINBAU_TYPE_CLASS__VALUE = eINSTANCE.getID_LO_Einbau_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_LO_EINBAU_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_LO_Einbau_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Markante_Stelle_TypeClassImpl <em>ID Markante Stelle Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Markante_Stelle_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Markante_Stelle_TypeClass()
		 * @generated
		 */
		EClass ID_MARKANTE_STELLE_TYPE_CLASS = eINSTANCE.getID_Markante_Stelle_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_MARKANTE_STELLE_TYPE_CLASS__VALUE = eINSTANCE.getID_Markante_Stelle_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_MARKANTE_STELLE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Markante_Stelle_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Markanter_Punkt_Gleis_Abschluss_TypeClassImpl <em>ID Markanter Punkt Gleis Abschluss Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Markanter_Punkt_Gleis_Abschluss_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Markanter_Punkt_Gleis_Abschluss_TypeClass()
		 * @generated
		 */
		EClass ID_MARKANTER_PUNKT_GLEIS_ABSCHLUSS_TYPE_CLASS = eINSTANCE.getID_Markanter_Punkt_Gleis_Abschluss_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_MARKANTER_PUNKT_GLEIS_ABSCHLUSS_TYPE_CLASS__VALUE = eINSTANCE.getID_Markanter_Punkt_Gleis_Abschluss_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_MARKANTER_PUNKT_GLEIS_ABSCHLUSS_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Markanter_Punkt_Gleis_Abschluss_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Markanter_Punkt_TypeClassImpl <em>ID Markanter Punkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Markanter_Punkt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Markanter_Punkt_TypeClass()
		 * @generated
		 */
		EClass ID_MARKANTER_PUNKT_TYPE_CLASS = eINSTANCE.getID_Markanter_Punkt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_MARKANTER_PUNKT_TYPE_CLASS__VALUE = eINSTANCE.getID_Markanter_Punkt_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_MARKANTER_PUNKT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Markanter_Punkt_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_NB_Element_TypeClassImpl <em>ID NB Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_NB_Element_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_NB_Element_TypeClass()
		 * @generated
		 */
		EClass ID_NB_ELEMENT_TYPE_CLASS = eINSTANCE.getID_NB_Element_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_NB_ELEMENT_TYPE_CLASS__VALUE = eINSTANCE.getID_NB_Element_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_NB_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_NB_Element_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_NB_TypeClassImpl <em>ID NB Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_NB_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_NB_TypeClass()
		 * @generated
		 */
		EClass ID_NB_TYPE_CLASS = eINSTANCE.getID_NB_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_NB_TYPE_CLASS__VALUE = eINSTANCE.getID_NB_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_NB_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_NB_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_NB_Zone_TypeClassImpl <em>ID NB Zone Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_NB_Zone_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_NB_Zone_TypeClass()
		 * @generated
		 */
		EClass ID_NB_ZONE_TYPE_CLASS = eINSTANCE.getID_NB_Zone_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_NB_ZONE_TYPE_CLASS__VALUE = eINSTANCE.getID_NB_Zone_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_NB_ZONE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_NB_Zone_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Oertlichkeit_Ausgabe_TypeClassImpl <em>ID Oertlichkeit Ausgabe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Oertlichkeit_Ausgabe_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Oertlichkeit_Ausgabe_TypeClass()
		 * @generated
		 */
		EClass ID_OERTLICHKEIT_AUSGABE_TYPE_CLASS = eINSTANCE.getID_Oertlichkeit_Ausgabe_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_OERTLICHKEIT_AUSGABE_TYPE_CLASS__VALUE = eINSTANCE.getID_Oertlichkeit_Ausgabe_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_OERTLICHKEIT_AUSGABE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Oertlichkeit_Ausgabe_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Oertlichkeit_Proxy_TypeClassImpl <em>ID Oertlichkeit Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Oertlichkeit_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Oertlichkeit_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_OERTLICHKEIT_PROXY_TYPE_CLASS = eINSTANCE.getID_Oertlichkeit_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_OERTLICHKEIT_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Oertlichkeit_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_OERTLICHKEIT_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Oertlichkeit_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Oertlichkeit_TypeClassImpl <em>ID Oertlichkeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Oertlichkeit_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Oertlichkeit_TypeClass()
		 * @generated
		 */
		EClass ID_OERTLICHKEIT_TYPE_CLASS = eINSTANCE.getID_Oertlichkeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_OERTLICHKEIT_TYPE_CLASS__VALUE = eINSTANCE.getID_Oertlichkeit_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_OERTLICHKEIT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Oertlichkeit_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_PlanPro_Schnittstelle_TypeClassImpl <em>ID Plan Pro Schnittstelle Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_PlanPro_Schnittstelle_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_PlanPro_Schnittstelle_TypeClass()
		 * @generated
		 */
		EClass ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS = eINSTANCE.getID_PlanPro_Schnittstelle_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS__VALUE = eINSTANCE.getID_PlanPro_Schnittstelle_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_PlanPro_Schnittstelle_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Planung_Einzel_TypeClassImpl <em>ID Planung Einzel Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Planung_Einzel_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Planung_Einzel_TypeClass()
		 * @generated
		 */
		EClass ID_PLANUNG_EINZEL_TYPE_CLASS = eINSTANCE.getID_Planung_Einzel_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_PLANUNG_EINZEL_TYPE_CLASS__VALUE = eINSTANCE.getID_Planung_Einzel_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_PLANUNG_EINZEL_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Planung_Einzel_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Planungsgrundlage_TypeClassImpl <em>ID Planungsgrundlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Planungsgrundlage_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Planungsgrundlage_TypeClass()
		 * @generated
		 */
		EClass ID_PLANUNGSGRUNDLAGE_TYPE_CLASS = eINSTANCE.getID_Planungsgrundlage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_PLANUNGSGRUNDLAGE_TYPE_CLASS__VALUE = eINSTANCE.getID_Planungsgrundlage_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_PLANUNGSGRUNDLAGE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Planungsgrundlage_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_Bezugspunkt_TypeClassImpl <em>ID PZB Element Bezugspunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_Bezugspunkt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_Bezugspunkt_TypeClass()
		 * @generated
		 */
		EClass ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS = eINSTANCE.getID_PZB_Element_Bezugspunkt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS__VALUE = eINSTANCE.getID_PZB_Element_Bezugspunkt_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_PZB_Element_Bezugspunkt_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_Mitnutzung_TypeClassImpl <em>ID PZB Element Mitnutzung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_Mitnutzung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_Mitnutzung_TypeClass()
		 * @generated
		 */
		EClass ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS = eINSTANCE.getID_PZB_Element_Mitnutzung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_PZB_Element_Mitnutzung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_PZB_Element_Mitnutzung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_TypeClassImpl <em>ID PZB Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_TypeClass()
		 * @generated
		 */
		EClass ID_PZB_ELEMENT_TYPE_CLASS = eINSTANCE.getID_PZB_Element_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_PZB_ELEMENT_TYPE_CLASS__VALUE = eINSTANCE.getID_PZB_Element_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_PZB_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_PZB_Element_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_Zuordnung_TypeClassImpl <em>ID PZB Element Zuordnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_PZB_Element_Zuordnung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_Zuordnung_TypeClass()
		 * @generated
		 */
		EClass ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS = eINSTANCE.getID_PZB_Element_Zuordnung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_PZB_Element_Zuordnung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_PZB_Element_Zuordnung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Quellelement_TypeClassImpl <em>ID Quellelement Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Quellelement_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Quellelement_TypeClass()
		 * @generated
		 */
		EClass ID_QUELLELEMENT_TYPE_CLASS = eINSTANCE.getID_Quellelement_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_QUELLELEMENT_TYPE_CLASS__VALUE = eINSTANCE.getID_Quellelement_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_QUELLELEMENT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Quellelement_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_RBC_TypeClassImpl <em>ID RBC Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_RBC_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_RBC_TypeClass()
		 * @generated
		 */
		EClass ID_RBC_TYPE_CLASS = eINSTANCE.getID_RBC_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_RBC_TYPE_CLASS__VALUE = eINSTANCE.getID_RBC_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_RBC_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_RBC_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Regelzeichnung_ohne_Proxy_TypeClassImpl <em>ID Regelzeichnung ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Regelzeichnung_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Regelzeichnung_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_REGELZEICHNUNG_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Regelzeichnung_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_REGELZEICHNUNG_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Regelzeichnung_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_REGELZEICHNUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Regelzeichnung_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Regelzeichnung_TypeClassImpl <em>ID Regelzeichnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Regelzeichnung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Regelzeichnung_TypeClass()
		 * @generated
		 */
		EClass ID_REGELZEICHNUNG_TYPE_CLASS = eINSTANCE.getID_Regelzeichnung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_REGELZEICHNUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_Regelzeichnung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_REGELZEICHNUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Regelzeichnung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Schalter_TypeClassImpl <em>ID Schalter Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Schalter_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Schalter_TypeClass()
		 * @generated
		 */
		EClass ID_SCHALTER_TYPE_CLASS = eINSTANCE.getID_Schalter_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SCHALTER_TYPE_CLASS__VALUE = eINSTANCE.getID_Schalter_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SCHALTER_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Schalter_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Schaltmittel_Zuordnung_TypeClassImpl <em>ID Schaltmittel Zuordnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Schaltmittel_Zuordnung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Schaltmittel_Zuordnung_TypeClass()
		 * @generated
		 */
		EClass ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS = eINSTANCE.getID_Schaltmittel_Zuordnung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_Schaltmittel_Zuordnung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Schaltmittel_Zuordnung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Schlosskombination_TypeClassImpl <em>ID Schlosskombination Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Schlosskombination_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Schlosskombination_TypeClass()
		 * @generated
		 */
		EClass ID_SCHLOSSKOMBINATION_TYPE_CLASS = eINSTANCE.getID_Schlosskombination_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SCHLOSSKOMBINATION_TYPE_CLASS__VALUE = eINSTANCE.getID_Schlosskombination_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SCHLOSSKOMBINATION_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Schlosskombination_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Schluessel_TypeClassImpl <em>ID Schluessel Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Schluessel_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Schluessel_TypeClass()
		 * @generated
		 */
		EClass ID_SCHLUESSEL_TYPE_CLASS = eINSTANCE.getID_Schluessel_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SCHLUESSEL_TYPE_CLASS__VALUE = eINSTANCE.getID_Schluessel_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SCHLUESSEL_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Schluessel_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Schluesselsperre_TypeClassImpl <em>ID Schluesselsperre Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Schluesselsperre_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Schluesselsperre_TypeClass()
		 * @generated
		 */
		EClass ID_SCHLUESSELSPERRE_TYPE_CLASS = eINSTANCE.getID_Schluesselsperre_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SCHLUESSELSPERRE_TYPE_CLASS__VALUE = eINSTANCE.getID_Schluesselsperre_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SCHLUESSELSPERRE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Schluesselsperre_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Befestigung_TypeClassImpl <em>ID Signal Befestigung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Befestigung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_Befestigung_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS = eINSTANCE.getID_Signal_Befestigung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_Signal_Befestigung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Signal_Befestigung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Fank_TypeClassImpl <em>ID Signal Fank Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Fank_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_Fank_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_FANK_TYPE_CLASS = eINSTANCE.getID_Signal_Fank_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SIGNAL_FANK_TYPE_CLASS__VALUE = eINSTANCE.getID_Signal_Fank_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SIGNAL_FANK_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Signal_Fank_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Gleisbezechnung_TypeClassImpl <em>ID Signal Gleisbezechnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Gleisbezechnung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_Gleisbezechnung_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS = eINSTANCE.getID_Signal_Gleisbezechnung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_Signal_Gleisbezechnung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Signal_Gleisbezechnung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_ohne_Proxy_TypeClassImpl <em>ID Signal ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Signal_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SIGNAL_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Signal_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SIGNAL_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Signal_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Rahmen_TypeClassImpl <em>ID Signal Rahmen Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Rahmen_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_Rahmen_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_RAHMEN_TYPE_CLASS = eINSTANCE.getID_Signal_Rahmen_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SIGNAL_RAHMEN_TYPE_CLASS__VALUE = eINSTANCE.getID_Signal_Rahmen_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SIGNAL_RAHMEN_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Signal_Rahmen_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Signalbegriff_TypeClassImpl <em>ID Signal Signalbegriff Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Signalbegriff_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_Signalbegriff_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS = eINSTANCE.getID_Signal_Signalbegriff_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS__VALUE = eINSTANCE.getID_Signal_Signalbegriff_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Signal_Signalbegriff_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Start_TypeClassImpl <em>ID Signal Start Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_Start_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_Start_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_START_TYPE_CLASS = eINSTANCE.getID_Signal_Start_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SIGNAL_START_TYPE_CLASS__VALUE = eINSTANCE.getID_Signal_Start_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SIGNAL_START_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Signal_Start_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_TypeClassImpl <em>ID Signal Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Signal_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Signal_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_TYPE_CLASS = eINSTANCE.getID_Signal_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SIGNAL_TYPE_CLASS__VALUE = eINSTANCE.getID_Signal_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SIGNAL_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Signal_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Sonderanlage_TypeClassImpl <em>ID Sonderanlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Sonderanlage_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Sonderanlage_TypeClass()
		 * @generated
		 */
		EClass ID_SONDERANLAGE_TYPE_CLASS = eINSTANCE.getID_Sonderanlage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SONDERANLAGE_TYPE_CLASS__VALUE = eINSTANCE.getID_Sonderanlage_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SONDERANLAGE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Sonderanlage_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Stellelement_TypeClassImpl <em>ID Stellelement Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Stellelement_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Stellelement_TypeClass()
		 * @generated
		 */
		EClass ID_STELLELEMENT_TYPE_CLASS = eINSTANCE.getID_Stellelement_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_STELLELEMENT_TYPE_CLASS__VALUE = eINSTANCE.getID_Stellelement_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_STELLELEMENT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Stellelement_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Stellwerk_TypeClassImpl <em>ID Stellwerk Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Stellwerk_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Stellwerk_TypeClass()
		 * @generated
		 */
		EClass ID_STELLWERK_TYPE_CLASS = eINSTANCE.getID_Stellwerk_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_STELLWERK_TYPE_CLASS__VALUE = eINSTANCE.getID_Stellwerk_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_STELLWERK_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Stellwerk_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Strecke_Bremsweg_ohne_Proxy_TypeClassImpl <em>ID Strecke Bremsweg ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Strecke_Bremsweg_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Strecke_Bremsweg_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_STRECKE_BREMSWEG_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Strecke_Bremsweg_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_STRECKE_BREMSWEG_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Strecke_Bremsweg_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_STRECKE_BREMSWEG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Strecke_Bremsweg_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Strecke_Punkt_TypeClassImpl <em>ID Strecke Punkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Strecke_Punkt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Strecke_Punkt_TypeClass()
		 * @generated
		 */
		EClass ID_STRECKE_PUNKT_TYPE_CLASS = eINSTANCE.getID_Strecke_Punkt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_STRECKE_PUNKT_TYPE_CLASS__VALUE = eINSTANCE.getID_Strecke_Punkt_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_STRECKE_PUNKT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Strecke_Punkt_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Strecke_TypeClassImpl <em>ID Strecke Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Strecke_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Strecke_TypeClass()
		 * @generated
		 */
		EClass ID_STRECKE_TYPE_CLASS = eINSTANCE.getID_Strecke_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_STRECKE_TYPE_CLASS__VALUE = eINSTANCE.getID_Strecke_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_STRECKE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Strecke_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Technischer_Punkt_TypeClassImpl <em>ID Technischer Punkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Technischer_Punkt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Technischer_Punkt_TypeClass()
		 * @generated
		 */
		EClass ID_TECHNISCHER_PUNKT_TYPE_CLASS = eINSTANCE.getID_Technischer_Punkt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_TECHNISCHER_PUNKT_TYPE_CLASS__VALUE = eINSTANCE.getID_Technischer_Punkt_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_TECHNISCHER_PUNKT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Technischer_Punkt_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_TOP_Kante_ohne_Proxy_TypeClassImpl <em>ID TOP Kante ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_TOP_Kante_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_TOP_Kante_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_TOP_Kante_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_TOP_Kante_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_TOP_Kante_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_TOP_Kante_TypeClassImpl <em>ID TOP Kante Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_TOP_Kante_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_TOP_Kante_TypeClass()
		 * @generated
		 */
		EClass ID_TOP_KANTE_TYPE_CLASS = eINSTANCE.getID_TOP_Kante_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_TOP_KANTE_TYPE_CLASS__VALUE = eINSTANCE.getID_TOP_Kante_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_TOP_KANTE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_TOP_Kante_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_TOP_Knoten_TypeClassImpl <em>ID TOP Knoten Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_TOP_Knoten_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_TOP_Knoten_TypeClass()
		 * @generated
		 */
		EClass ID_TOP_KNOTEN_TYPE_CLASS = eINSTANCE.getID_TOP_Knoten_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_TOP_KNOTEN_TYPE_CLASS__VALUE = eINSTANCE.getID_TOP_Knoten_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_TOP_KNOTEN_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_TOP_Knoten_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Trasse_Kante_TypeClassImpl <em>ID Trasse Kante Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Trasse_Kante_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Trasse_Kante_TypeClass()
		 * @generated
		 */
		EClass ID_TRASSE_KANTE_TYPE_CLASS = eINSTANCE.getID_Trasse_Kante_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_TRASSE_KANTE_TYPE_CLASS__VALUE = eINSTANCE.getID_Trasse_Kante_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_TRASSE_KANTE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Trasse_Kante_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Trasse_Knoten_TypeClassImpl <em>ID Trasse Knoten Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Trasse_Knoten_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Trasse_Knoten_TypeClass()
		 * @generated
		 */
		EClass ID_TRASSE_KNOTEN_TYPE_CLASS = eINSTANCE.getID_Trasse_Knoten_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_TRASSE_KNOTEN_TYPE_CLASS__VALUE = eINSTANCE.getID_Trasse_Knoten_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_TRASSE_KNOTEN_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Trasse_Knoten_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Ueberhoehung_TypeClassImpl <em>ID Ueberhoehung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Ueberhoehung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Ueberhoehung_TypeClass()
		 * @generated
		 */
		EClass ID_UEBERHOEHUNG_TYPE_CLASS = eINSTANCE.getID_Ueberhoehung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_UEBERHOEHUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_Ueberhoehung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_UEBERHOEHUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Ueberhoehung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Uebertragungsweg_Nach_TypeClassImpl <em>ID Uebertragungsweg Nach Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Uebertragungsweg_Nach_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Uebertragungsweg_Nach_TypeClass()
		 * @generated
		 */
		EClass ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS = eINSTANCE.getID_Uebertragungsweg_Nach_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS__VALUE = eINSTANCE.getID_Uebertragungsweg_Nach_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Uebertragungsweg_Nach_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Uebertragungsweg_Von_TypeClassImpl <em>ID Uebertragungsweg Von Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Uebertragungsweg_Von_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Uebertragungsweg_Von_TypeClass()
		 * @generated
		 */
		EClass ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS = eINSTANCE.getID_Uebertragungsweg_Von_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS__VALUE = eINSTANCE.getID_Uebertragungsweg_Von_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Uebertragungsweg_Von_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Umfahrpunkt_TypeClassImpl <em>ID Umfahrpunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Umfahrpunkt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Umfahrpunkt_TypeClass()
		 * @generated
		 */
		EClass ID_UMFAHRPUNKT_TYPE_CLASS = eINSTANCE.getID_Umfahrpunkt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_UMFAHRPUNKT_TYPE_CLASS__VALUE = eINSTANCE.getID_Umfahrpunkt_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_UMFAHRPUNKT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Umfahrpunkt_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Unterbringung_ohne_Proxy_TypeClassImpl <em>ID Unterbringung ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Unterbringung_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Unterbringung_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Unterbringung_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_Unterbringung_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Unterbringung_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Unterbringung_Technik_TypeClassImpl <em>ID Unterbringung Technik Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Unterbringung_Technik_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Unterbringung_Technik_TypeClass()
		 * @generated
		 */
		EClass ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS = eINSTANCE.getID_Unterbringung_Technik_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS__VALUE = eINSTANCE.getID_Unterbringung_Technik_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Unterbringung_Technik_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Unterbringung_TypeClassImpl <em>ID Unterbringung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Unterbringung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Unterbringung_TypeClass()
		 * @generated
		 */
		EClass ID_UNTERBRINGUNG_TYPE_CLASS = eINSTANCE.getID_Unterbringung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_UNTERBRINGUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_Unterbringung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_UNTERBRINGUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Unterbringung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Ur_Objekt_TypeClassImpl <em>ID Ur Objekt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Ur_Objekt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Ur_Objekt_TypeClass()
		 * @generated
		 */
		EClass ID_UR_OBJEKT_TYPE_CLASS = eINSTANCE.getID_Ur_Objekt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_UR_OBJEKT_TYPE_CLASS__VALUE = eINSTANCE.getID_Ur_Objekt_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_UR_OBJEKT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Ur_Objekt_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Verknuepftes_Element_TypeClassImpl <em>ID Verknuepftes Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Verknuepftes_Element_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Verknuepftes_Element_TypeClass()
		 * @generated
		 */
		EClass ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS = eINSTANCE.getID_Verknuepftes_Element_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS__VALUE = eINSTANCE.getID_Verknuepftes_Element_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Verknuepftes_Element_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Anlage_ohne_Proxy_TypeClassImpl <em>ID WKr Anlage ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Anlage_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Anlage_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_W_Kr_Anlage_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_W_Kr_Anlage_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_W_Kr_Anlage_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Anlage_TypeClassImpl <em>ID WKr Anlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Anlage_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Anlage_TypeClass()
		 * @generated
		 */
		EClass ID_WKR_ANLAGE_TYPE_CLASS = eINSTANCE.getID_W_Kr_Anlage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_WKR_ANLAGE_TYPE_CLASS__VALUE = eINSTANCE.getID_W_Kr_Anlage_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_WKR_ANLAGE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_W_Kr_Anlage_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Gsp_Element_TypeClassImpl <em>ID WKr Gsp Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Gsp_Element_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Gsp_Element_TypeClass()
		 * @generated
		 */
		EClass ID_WKR_GSP_ELEMENT_TYPE_CLASS = eINSTANCE.getID_W_Kr_Gsp_Element_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_WKR_GSP_ELEMENT_TYPE_CLASS__VALUE = eINSTANCE.getID_W_Kr_Gsp_Element_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_WKR_GSP_ELEMENT_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_W_Kr_Gsp_Element_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Gsp_Komponente_TypeClassImpl <em>ID WKr Gsp Komponente Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_W_Kr_Gsp_Komponente_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Gsp_Komponente_TypeClass()
		 * @generated
		 */
		EClass ID_WKR_GSP_KOMPONENTE_TYPE_CLASS = eINSTANCE.getID_W_Kr_Gsp_Komponente_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_WKR_GSP_KOMPONENTE_TYPE_CLASS__VALUE = eINSTANCE.getID_W_Kr_Gsp_Komponente_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_WKR_GSP_KOMPONENTE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_W_Kr_Gsp_Komponente_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Weichenlaufkette_TypeClassImpl <em>ID Weichenlaufkette Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Weichenlaufkette_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Weichenlaufkette_TypeClass()
		 * @generated
		 */
		EClass ID_WEICHENLAUFKETTE_TYPE_CLASS = eINSTANCE.getID_Weichenlaufkette_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_WEICHENLAUFKETTE_TYPE_CLASS__VALUE = eINSTANCE.getID_Weichenlaufkette_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_WEICHENLAUFKETTE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Weichenlaufkette_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Ziel_TypeClassImpl <em>ID Ziel Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Ziel_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Ziel_TypeClass()
		 * @generated
		 */
		EClass ID_ZIEL_TYPE_CLASS = eINSTANCE.getID_Ziel_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZIEL_TYPE_CLASS__VALUE = eINSTANCE.getID_Ziel_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZIEL_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Ziel_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_DLP_Fstr_TypeClassImpl <em>ID ZL DLP Fstr Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_DLP_Fstr_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZL_DLP_Fstr_TypeClass()
		 * @generated
		 */
		EClass ID_ZL_DLP_FSTR_TYPE_CLASS = eINSTANCE.getID_ZL_DLP_Fstr_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZL_DLP_FSTR_TYPE_CLASS__VALUE = eINSTANCE.getID_ZL_DLP_Fstr_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZL_DLP_FSTR_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ZL_DLP_Fstr_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_Fstr_TypeClassImpl <em>ID ZL Fstr Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_Fstr_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZL_Fstr_TypeClass()
		 * @generated
		 */
		EClass ID_ZL_FSTR_TYPE_CLASS = eINSTANCE.getID_ZL_Fstr_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZL_FSTR_TYPE_CLASS__VALUE = eINSTANCE.getID_ZL_Fstr_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZL_FSTR_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ZL_Fstr_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_Signalgruppe_TypeClassImpl <em>ID ZL Signalgruppe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_Signalgruppe_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZL_Signalgruppe_TypeClass()
		 * @generated
		 */
		EClass ID_ZL_SIGNALGRUPPE_TYPE_CLASS = eINSTANCE.getID_ZL_Signalgruppe_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZL_SIGNALGRUPPE_TYPE_CLASS__VALUE = eINSTANCE.getID_ZL_Signalgruppe_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZL_SIGNALGRUPPE_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ZL_Signalgruppe_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_TypeClassImpl <em>ID ZL Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZL_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZL_TypeClass()
		 * @generated
		 */
		EClass ID_ZL_TYPE_CLASS = eINSTANCE.getID_ZL_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZL_TYPE_CLASS__VALUE = eINSTANCE.getID_ZL_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZL_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ZL_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZLV_Bus_ohne_Proxy_TypeClassImpl <em>ID ZLV Bus ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZLV_Bus_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZLV_Bus_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_ZLV_BUS_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_ZLV_Bus_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZLV_BUS_OHNE_PROXY_TYPE_CLASS__VALUE = eINSTANCE.getID_ZLV_Bus_ohne_Proxy_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZLV_BUS_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ZLV_Bus_ohne_Proxy_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZLV_Bus_TypeClassImpl <em>ID ZLV Bus Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZLV_Bus_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZLV_Bus_TypeClass()
		 * @generated
		 */
		EClass ID_ZLV_BUS_TYPE_CLASS = eINSTANCE.getID_ZLV_Bus_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZLV_BUS_TYPE_CLASS__VALUE = eINSTANCE.getID_ZLV_Bus_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZLV_BUS_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ZLV_Bus_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Anzeigefeld_Anstoss_TypeClassImpl <em>ID ZN Anzeigefeld Anstoss Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Anzeigefeld_Anstoss_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZN_Anzeigefeld_Anstoss_TypeClass()
		 * @generated
		 */
		EClass ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS = eINSTANCE.getID_ZN_Anzeigefeld_Anstoss_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS__VALUE = eINSTANCE.getID_ZN_Anzeigefeld_Anstoss_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ZN_Anzeigefeld_Anstoss_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Anzeigefeld_TypeClassImpl <em>ID ZN Anzeigefeld Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Anzeigefeld_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZN_Anzeigefeld_TypeClass()
		 * @generated
		 */
		EClass ID_ZN_ANZEIGEFELD_TYPE_CLASS = eINSTANCE.getID_ZN_Anzeigefeld_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZN_ANZEIGEFELD_TYPE_CLASS__VALUE = eINSTANCE.getID_ZN_Anzeigefeld_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZN_ANZEIGEFELD_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ZN_Anzeigefeld_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Fortschalt_Kriterium_TypeClassImpl <em>ID ZN Fortschalt Kriterium Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Fortschalt_Kriterium_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZN_Fortschalt_Kriterium_TypeClass()
		 * @generated
		 */
		EClass ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS = eINSTANCE.getID_ZN_Fortschalt_Kriterium_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS__VALUE = eINSTANCE.getID_ZN_Fortschalt_Kriterium_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ZN_Fortschalt_Kriterium_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_TypeClassImpl <em>ID ZN Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZN_TypeClass()
		 * @generated
		 */
		EClass ID_ZN_TYPE_CLASS = eINSTANCE.getID_ZN_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZN_TYPE_CLASS__VALUE = eINSTANCE.getID_ZN_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZN_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ZN_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Unterstation_TypeClassImpl <em>ID ZN Unterstation Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_Unterstation_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZN_Unterstation_TypeClass()
		 * @generated
		 */
		EClass ID_ZN_UNTERSTATION_TYPE_CLASS = eINSTANCE.getID_ZN_Unterstation_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZN_UNTERSTATION_TYPE_CLASS__VALUE = eINSTANCE.getID_ZN_Unterstation_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZN_UNTERSTATION_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ZN_Unterstation_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_ZBS_TypeClassImpl <em>ID ZN ZBS Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_ZN_ZBS_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_ZN_ZBS_TypeClass()
		 * @generated
		 */
		EClass ID_ZN_ZBS_TYPE_CLASS = eINSTANCE.getID_ZN_ZBS_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZN_ZBS_TYPE_CLASS__VALUE = eINSTANCE.getID_ZN_ZBS_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZN_ZBS_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_ZN_ZBS_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Zugeinwirkung_TypeClassImpl <em>ID Zugeinwirkung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Zugeinwirkung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Zugeinwirkung_TypeClass()
		 * @generated
		 */
		EClass ID_ZUGEINWIRKUNG_TYPE_CLASS = eINSTANCE.getID_Zugeinwirkung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZUGEINWIRKUNG_TYPE_CLASS__VALUE = eINSTANCE.getID_Zugeinwirkung_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZUGEINWIRKUNG_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Zugeinwirkung_TypeClass_InvalidReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Zweites_Haltfallkriterium_TypeClassImpl <em>ID Zweites Haltfallkriterium Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Verweise.impl.ID_Zweites_Haltfallkriterium_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl#getID_Zweites_Haltfallkriterium_TypeClass()
		 * @generated
		 */
		EClass ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS = eINSTANCE.getID_Zweites_Haltfallkriterium_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS__VALUE = eINSTANCE.getID_Zweites_Haltfallkriterium_TypeClass_Value();

		/**
		 * The meta object literal for the '<em><b>Invalid Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS__INVALID_REFERENCE = eINSTANCE.getID_Zweites_Haltfallkriterium_TypeClass_InvalidReference();

	}

} //VerweisePackage
