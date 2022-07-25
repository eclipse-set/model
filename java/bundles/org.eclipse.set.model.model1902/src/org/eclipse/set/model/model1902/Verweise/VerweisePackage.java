/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Verweise;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
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
 * Für Fragen zum Schema wenden Sie sich bitte an Herrn :
 * 
 * Reiner Brödel (reiner.broedel@deutschebahn.com, +49 30 297-57123)
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
 * Für Fragen zum Schema wenden Sie sich bitte an Herrn :
 * 
 * Reiner Brödel (reiner.broedel@deutschebahn.com, +49 30 297-57123)
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
 * @see org.eclipse.set.model.model1902.Verweise.VerweiseFactory
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
	String eNS_URI = "http://www.plan-pro.org/modell/Verweise/1.9.0.2";

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
	VerweisePackage eINSTANCE = org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Anforderer_Element_TypeClassImpl <em>ID Anforderer Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Anforderer_Element_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Anforderer_Element_TypeClass()
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
	 * The number of structural features of the '<em>ID Anforderer Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERER_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Anforderer Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERER_ELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Anforderung_TypeClassImpl <em>ID Anforderung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Anforderung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Anforderung_TypeClass()
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
	 * The number of structural features of the '<em>ID Anforderung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Anforderung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANFORDERUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Anhang_ohne_Proxy_TypeClassImpl <em>ID Anhang ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Anhang_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Anhang_ohne_Proxy_TypeClass()
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
	 * The number of structural features of the '<em>ID Anhang ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Anhang ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Anhang_TypeClassImpl <em>ID Anhang Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Anhang_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Anhang_TypeClass()
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
	 * The number of structural features of the '<em>ID Anhang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Anhang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANHANG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Anschluss_Element_TypeClassImpl <em>ID Anschluss Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Anschluss_Element_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Anschluss_Element_TypeClass()
	 * @generated
	 */
	int ID_ANSCHLUSS_ELEMENT_TYPE_CLASS = 4;

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
	 * The number of structural features of the '<em>ID Anschluss Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANSCHLUSS_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Anschluss Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ANSCHLUSS_ELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClassImpl <em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS = 5;

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
	 * The number of structural features of the '<em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Aussenelementansteuerung_TypeClassImpl <em>ID Aussenelementansteuerung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Aussenelementansteuerung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Aussenelementansteuerung_TypeClass()
	 * @generated
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS = 6;

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
	 * The number of structural features of the '<em>ID Aussenelementansteuerung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Aussenelementansteuerung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bahnsteig_Anlage_TypeClassImpl <em>ID Bahnsteig Anlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bahnsteig_Anlage_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bahnsteig_Anlage_TypeClass()
	 * @generated
	 */
	int ID_BAHNSTEIG_ANLAGE_TYPE_CLASS = 7;

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
	 * The number of structural features of the '<em>ID Bahnsteig Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_ANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Bahnsteig Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_ANLAGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bahnsteig_Kante_ohne_Proxy_TypeClassImpl <em>ID Bahnsteig Kante ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bahnsteig_Kante_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bahnsteig_Kante_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS = 8;

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
	 * The number of structural features of the '<em>ID Bahnsteig Kante ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Bahnsteig Kante ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bahnsteig_Kante_TypeClassImpl <em>ID Bahnsteig Kante Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bahnsteig_Kante_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bahnsteig_Kante_TypeClass()
	 * @generated
	 */
	int ID_BAHNSTEIG_KANTE_TYPE_CLASS = 9;

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
	 * The number of structural features of the '<em>ID Bahnsteig Kante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Bahnsteig Kante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAHNSTEIG_KANTE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Balise_ohne_Proxy_TypeClassImpl <em>ID Balise ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Balise_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Balise_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_BALISE_OHNE_PROXY_TYPE_CLASS = 10;

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
	 * The number of structural features of the '<em>ID Balise ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Balise ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Balise_TypeClassImpl <em>ID Balise Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Balise_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Balise_TypeClass()
	 * @generated
	 */
	int ID_BALISE_TYPE_CLASS = 11;

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
	 * The number of structural features of the '<em>ID Balise Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Balise Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BALISE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Basis_Objekt_TypeClassImpl <em>ID Basis Objekt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Basis_Objekt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Basis_Objekt_TypeClass()
	 * @generated
	 */
	int ID_BASIS_OBJEKT_TYPE_CLASS = 12;

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
	 * The number of structural features of the '<em>ID Basis Objekt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BASIS_OBJEKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Basis Objekt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BASIS_OBJEKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bearbeitungsvermerk_TypeClassImpl <em>ID Bearbeitungsvermerk Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bearbeitungsvermerk_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bearbeitungsvermerk_TypeClass()
	 * @generated
	 */
	int ID_BEARBEITUNGSVERMERK_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEARBEITUNGSVERMERK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEARBEITUNGSVERMERK_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The number of structural features of the '<em>ID Bearbeitungsvermerk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEARBEITUNGSVERMERK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Bearbeitungsvermerk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEARBEITUNGSVERMERK_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Anzeige_Element_TypeClassImpl <em>ID Bedien Anzeige Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Anzeige_Element_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bedien_Anzeige_Element_TypeClass()
	 * @generated
	 */
	int ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS = 14;

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
	 * The number of structural features of the '<em>ID Bedien Anzeige Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Bedien Anzeige Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Bezirk_TypeClassImpl <em>ID Bedien Bezirk Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Bezirk_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bedien_Bezirk_TypeClass()
	 * @generated
	 */
	int ID_BEDIEN_BEZIRK_TYPE_CLASS = 15;

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
	 * The number of structural features of the '<em>ID Bedien Bezirk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_BEZIRK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Bedien Bezirk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_BEZIRK_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Einrichtung_Oertlich_TypeClassImpl <em>ID Bedien Einrichtung Oertlich Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Einrichtung_Oertlich_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bedien_Einrichtung_Oertlich_TypeClass()
	 * @generated
	 */
	int ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS = 16;

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
	 * The number of structural features of the '<em>ID Bedien Einrichtung Oertlich Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Bedien Einrichtung Oertlich Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Oberflaeche_TypeClassImpl <em>ID Bedien Oberflaeche Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Oberflaeche_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bedien_Oberflaeche_TypeClass()
	 * @generated
	 */
	int ID_BEDIEN_OBERFLAECHE_TYPE_CLASS = 17;

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
	 * The number of structural features of the '<em>ID Bedien Oberflaeche Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_OBERFLAECHE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Bedien Oberflaeche Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_OBERFLAECHE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Standort_TypeClassImpl <em>ID Bedien Standort Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Standort_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bedien_Standort_TypeClass()
	 * @generated
	 */
	int ID_BEDIEN_STANDORT_TYPE_CLASS = 18;

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
	 * The number of structural features of the '<em>ID Bedien Standort Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_STANDORT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Bedien Standort Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_STANDORT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Zentrale_TypeClassImpl <em>ID Bedien Zentrale Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Zentrale_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bedien_Zentrale_TypeClass()
	 * @generated
	 */
	int ID_BEDIEN_ZENTRALE_TYPE_CLASS = 19;

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
	 * The number of structural features of the '<em>ID Bedien Zentrale Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ZENTRALE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Bedien Zentrale Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEDIEN_ZENTRALE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Beginn_Bereich_TypeClassImpl <em>ID Beginn Bereich Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Beginn_Bereich_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Beginn_Bereich_TypeClass()
	 * @generated
	 */
	int ID_BEGINN_BEREICH_TYPE_CLASS = 20;

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
	 * The number of structural features of the '<em>ID Beginn Bereich Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEGINN_BEREICH_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Beginn Bereich Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEGINN_BEREICH_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Binaerdatei_ohne_Proxy_TypeClassImpl <em>ID Binaerdatei ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Binaerdatei_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Binaerdatei_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_BINAERDATEI_OHNE_PROXY_TYPE_CLASS = 21;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BINAERDATEI_OHNE_PROXY_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BINAERDATEI_OHNE_PROXY_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The number of structural features of the '<em>ID Binaerdatei ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BINAERDATEI_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Binaerdatei ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BINAERDATEI_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Block_Anlage_TypeClassImpl <em>ID Block Anlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Block_Anlage_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Block_Anlage_TypeClass()
	 * @generated
	 */
	int ID_BLOCK_ANLAGE_TYPE_CLASS = 22;

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
	 * The number of structural features of the '<em>ID Block Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Block Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ANLAGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Block_Element_TypeClassImpl <em>ID Block Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Block_Element_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Block_Element_TypeClass()
	 * @generated
	 */
	int ID_BLOCK_ELEMENT_TYPE_CLASS = 23;

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
	 * The number of structural features of the '<em>ID Block Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Block Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_ELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Block_Strecke_TypeClassImpl <em>ID Block Strecke Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Block_Strecke_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Block_Strecke_TypeClass()
	 * @generated
	 */
	int ID_BLOCK_STRECKE_TYPE_CLASS = 24;

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
	 * The number of structural features of the '<em>ID Block Strecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_STRECKE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Block Strecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BLOCK_STRECKE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Anlage_ohne_Proxy_TypeClassImpl <em>ID BUE Anlage ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Anlage_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS = 25;

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
	 * The number of structural features of the '<em>ID BUE Anlage ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID BUE Anlage ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Anlage_TypeClassImpl <em>ID BUE Anlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Anlage_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_Anlage_TypeClass()
	 * @generated
	 */
	int ID_BUE_ANLAGE_TYPE_CLASS = 26;

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
	 * The number of structural features of the '<em>ID BUE Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID BUE Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_ANLAGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Bedien_Anzeige_Element_TypeClassImpl <em>ID BUE Bedien Anzeige Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Bedien_Anzeige_Element_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_Bedien_Anzeige_Element_TypeClass()
	 * @generated
	 */
	int ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS = 27;

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
	 * The number of structural features of the '<em>ID BUE Bedien Anzeige Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID BUE Bedien Anzeige Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Einschaltung_TypeClassImpl <em>ID BUE Einschaltung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Einschaltung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_Einschaltung_TypeClass()
	 * @generated
	 */
	int ID_BUE_EINSCHALTUNG_TYPE_CLASS = 28;

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
	 * The number of structural features of the '<em>ID BUE Einschaltung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_EINSCHALTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID BUE Einschaltung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_EINSCHALTUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Gleisbezogener_Gefahrraum_TypeClassImpl <em>ID BUE Gleisbezogener Gefahrraum Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Gleisbezogener_Gefahrraum_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_Gleisbezogener_Gefahrraum_TypeClass()
	 * @generated
	 */
	int ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS = 29;

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
	 * The number of structural features of the '<em>ID BUE Gleisbezogener Gefahrraum Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID BUE Gleisbezogener Gefahrraum Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Schnittstelle_TypeClassImpl <em>ID BUE Schnittstelle Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Schnittstelle_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_Schnittstelle_TypeClass()
	 * @generated
	 */
	int ID_BUE_SCHNITTSTELLE_TYPE_CLASS = 30;

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
	 * The number of structural features of the '<em>ID BUE Schnittstelle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_SCHNITTSTELLE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID BUE Schnittstelle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_SCHNITTSTELLE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_WS_Fstr_Zuordnung_TypeClassImpl <em>ID BUE WS Fstr Zuordnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_WS_Fstr_Zuordnung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_WS_Fstr_Zuordnung_TypeClass()
	 * @generated
	 */
	int ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS = 31;

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
	 * The number of structural features of the '<em>ID BUE WS Fstr Zuordnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID BUE WS Fstr Zuordnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Datenpunkt_ohne_Proxy_TypeClassImpl <em>ID Datenpunkt ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Datenpunkt_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Datenpunkt_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS = 32;

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
	 * The number of structural features of the '<em>ID Datenpunkt ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Datenpunkt ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Datenpunkt_TypeClassImpl <em>ID Datenpunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Datenpunkt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Datenpunkt_TypeClass()
	 * @generated
	 */
	int ID_DATENPUNKT_TYPE_CLASS = 33;

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
	 * The number of structural features of the '<em>ID Datenpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Datenpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DATENPUNKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_DP_Bezugspunkt_TypeClassImpl <em>ID DP Bezugspunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_DP_Bezugspunkt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_DP_Bezugspunkt_TypeClass()
	 * @generated
	 */
	int ID_DP_BEZUGSPUNKT_TYPE_CLASS = 34;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DP_BEZUGSPUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DP_BEZUGSPUNKT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The number of structural features of the '<em>ID DP Bezugspunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DP_BEZUGSPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID DP Bezugspunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DP_BEZUGSPUNKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Einschaltpunkt_TypeClassImpl <em>ID Einschaltpunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Einschaltpunkt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Einschaltpunkt_TypeClass()
	 * @generated
	 */
	int ID_EINSCHALTPUNKT_TYPE_CLASS = 35;

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
	 * The number of structural features of the '<em>ID Einschaltpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EINSCHALTPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Einschaltpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EINSCHALTPUNKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Element_Grenze_TypeClassImpl <em>ID Element Grenze Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Element_Grenze_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Element_Grenze_TypeClass()
	 * @generated
	 */
	int ID_ELEMENT_GRENZE_TYPE_CLASS = 36;

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
	 * The number of structural features of the '<em>ID Element Grenze Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_GRENZE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Element Grenze Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_GRENZE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Element_TypeClassImpl <em>ID Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Element_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Element_TypeClass()
	 * @generated
	 */
	int ID_ELEMENT_TYPE_CLASS = 37;

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
	 * The number of structural features of the '<em>ID Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Element_Unterbringung_TypeClassImpl <em>ID Element Unterbringung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Element_Unterbringung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Element_Unterbringung_TypeClass()
	 * @generated
	 */
	int ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS = 38;

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
	 * The number of structural features of the '<em>ID Element Unterbringung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Element Unterbringung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Energie_Eingang_TypeClassImpl <em>ID Energie Eingang Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Energie_Eingang_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Energie_Eingang_TypeClass()
	 * @generated
	 */
	int ID_ENERGIE_EINGANG_TYPE_CLASS = 39;

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
	 * The number of structural features of the '<em>ID Energie Eingang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_EINGANG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Energie Eingang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_EINGANG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Energie_Primaer_TypeClassImpl <em>ID Energie Primaer Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Energie_Primaer_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Energie_Primaer_TypeClass()
	 * @generated
	 */
	int ID_ENERGIE_PRIMAER_TYPE_CLASS = 40;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_PRIMAER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_PRIMAER_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The number of structural features of the '<em>ID Energie Primaer Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_PRIMAER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Energie Primaer Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENERGIE_PRIMAER_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ESTW_Zentraleinheit_TypeClassImpl <em>ID ESTW Zentraleinheit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ESTW_Zentraleinheit_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ESTW_Zentraleinheit_TypeClass()
	 * @generated
	 */
	int ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS = 41;

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
	 * The number of structural features of the '<em>ID ESTW Zentraleinheit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ESTW Zentraleinheit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ETCS_Knoten_ohne_Proxy_TypeClassImpl <em>ID ETCS Knoten ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ETCS_Knoten_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ETCS_Knoten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS = 42;

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
	 * The number of structural features of the '<em>ID ETCS Knoten ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ETCS Knoten ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ETCS_Knoten_TypeClassImpl <em>ID ETCS Knoten Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ETCS_Knoten_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ETCS_Knoten_TypeClass()
	 * @generated
	 */
	int ID_ETCS_KNOTEN_TYPE_CLASS = 43;

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
	 * The number of structural features of the '<em>ID ETCS Knoten Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ETCS Knoten Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ETCS_KNOTEN_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_EV_Modul_TypeClassImpl <em>ID EV Modul Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_EV_Modul_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_EV_Modul_TypeClass()
	 * @generated
	 */
	int ID_EV_MODUL_TYPE_CLASS = 44;

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
	 * The number of structural features of the '<em>ID EV Modul Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EV_MODUL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID EV Modul Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EV_MODUL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fachtelegramm_TypeClassImpl <em>ID Fachtelegramm Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fachtelegramm_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fachtelegramm_TypeClass()
	 * @generated
	 */
	int ID_FACHTELEGRAMM_TYPE_CLASS = 45;

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
	 * The number of structural features of the '<em>ID Fachtelegramm Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FACHTELEGRAMM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Fachtelegramm Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FACHTELEGRAMM_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fla_Schutz_TypeClassImpl <em>ID Fla Schutz Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fla_Schutz_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fla_Schutz_TypeClass()
	 * @generated
	 */
	int ID_FLA_SCHUTZ_TYPE_CLASS = 46;

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
	 * The number of structural features of the '<em>ID Fla Schutz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FLA_SCHUTZ_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Fla Schutz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FLA_SCHUTZ_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Anlage_Rangier_Frei_TypeClassImpl <em>ID FMA Anlage Rangier Frei Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Anlage_Rangier_Frei_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_FMA_Anlage_Rangier_Frei_TypeClass()
	 * @generated
	 */
	int ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS = 47;

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
	 * The number of structural features of the '<em>ID FMA Anlage Rangier Frei Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID FMA Anlage Rangier Frei Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Anlage_TypeClassImpl <em>ID FMA Anlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Anlage_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_FMA_Anlage_TypeClass()
	 * @generated
	 */
	int ID_FMA_ANLAGE_TYPE_CLASS = 48;

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
	 * The number of structural features of the '<em>ID FMA Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID FMA Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ANLAGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Element_TypeClassImpl <em>ID FMA Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Element_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_FMA_Element_TypeClass()
	 * @generated
	 */
	int ID_FMA_ELEMENT_TYPE_CLASS = 49;

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
	 * The number of structural features of the '<em>ID FMA Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID FMA Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_ELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Komponente_TypeClassImpl <em>ID FMA Komponente Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Komponente_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_FMA_Komponente_TypeClass()
	 * @generated
	 */
	int ID_FMA_KOMPONENTE_TYPE_CLASS = 50;

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
	 * The number of structural features of the '<em>ID FMA Komponente Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_KOMPONENTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID FMA Komponente Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FMA_KOMPONENTE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fortschaltung_Start_TypeClassImpl <em>ID Fortschaltung Start Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fortschaltung_Start_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fortschaltung_Start_TypeClass()
	 * @generated
	 */
	int ID_FORTSCHALTUNG_START_TYPE_CLASS = 51;

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
	 * The number of structural features of the '<em>ID Fortschaltung Start Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FORTSCHALTUNG_START_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Fortschaltung Start Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FORTSCHALTUNG_START_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Aneinander_TypeClassImpl <em>ID Fstr Aneinander Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Aneinander_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fstr_Aneinander_TypeClass()
	 * @generated
	 */
	int ID_FSTR_ANEINANDER_TYPE_CLASS = 52;

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
	 * The number of structural features of the '<em>ID Fstr Aneinander Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ANEINANDER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Fstr Aneinander Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ANEINANDER_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Ausschluss_Besonders_TypeClassImpl <em>ID Fstr Ausschluss Besonders Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Ausschluss_Besonders_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fstr_Ausschluss_Besonders_TypeClass()
	 * @generated
	 */
	int ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS = 53;

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
	 * The number of structural features of the '<em>ID Fstr Ausschluss Besonders Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Fstr Ausschluss Besonders Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_DWeg_TypeClassImpl <em>ID Fstr DWeg Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_DWeg_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fstr_DWeg_TypeClass()
	 * @generated
	 */
	int ID_FSTR_DWEG_TYPE_CLASS = 54;

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
	 * The number of structural features of the '<em>ID Fstr DWeg Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_DWEG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Fstr DWeg Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_DWEG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Fahrweg_TypeClassImpl <em>ID Fstr Fahrweg Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Fahrweg_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fstr_Fahrweg_TypeClass()
	 * @generated
	 */
	int ID_FSTR_FAHRWEG_TYPE_CLASS = 55;

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
	 * The number of structural features of the '<em>ID Fstr Fahrweg Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_FAHRWEG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Fstr Fahrweg Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_FAHRWEG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Zug_Rangier_TypeClassImpl <em>ID Fstr Zug Rangier Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Zug_Rangier_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fstr_Zug_Rangier_TypeClass()
	 * @generated
	 */
	int ID_FSTR_ZUG_RANGIER_TYPE_CLASS = 56;

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
	 * The number of structural features of the '<em>ID Fstr Zug Rangier Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ZUG_RANGIER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Fstr Zug Rangier Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FSTR_ZUG_RANGIER_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_FT_Anschaltbedingung_TypeClassImpl <em>ID FT Anschaltbedingung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_FT_Anschaltbedingung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_FT_Anschaltbedingung_TypeClass()
	 * @generated
	 */
	int ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS = 57;

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
	 * The number of structural features of the '<em>ID FT Anschaltbedingung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID FT Anschaltbedingung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_FT_Fahrweg_Teil_TypeClassImpl <em>ID FT Fahrweg Teil Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_FT_Fahrweg_Teil_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_FT_Fahrweg_Teil_TypeClass()
	 * @generated
	 */
	int ID_FT_FAHRWEG_TEIL_TYPE_CLASS = 58;

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
	 * The number of structural features of the '<em>ID FT Fahrweg Teil Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_FAHRWEG_TEIL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID FT Fahrweg Teil Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FT_FAHRWEG_TEIL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Art_TypeClassImpl <em>ID GEO Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_GEO_Art_TypeClass()
	 * @generated
	 */
	int ID_GEO_ART_TYPE_CLASS = 59;

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
	 * The number of structural features of the '<em>ID GEO Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID GEO Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_ART_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Knoten_TypeClassImpl <em>ID GEO Knoten Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Knoten_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_GEO_Knoten_TypeClass()
	 * @generated
	 */
	int ID_GEO_KNOTEN_TYPE_CLASS = 60;

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
	 * The number of structural features of the '<em>ID GEO Knoten Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_KNOTEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID GEO Knoten Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_KNOTEN_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Punkt_ohne_Proxy_TypeClassImpl <em>ID GEO Punkt ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Punkt_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_GEO_Punkt_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS = 61;

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
	 * The number of structural features of the '<em>ID GEO Punkt ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID GEO Punkt ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Punkt_TypeClassImpl <em>ID GEO Punkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Punkt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_GEO_Punkt_TypeClass()
	 * @generated
	 */
	int ID_GEO_PUNKT_TYPE_CLASS = 62;

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
	 * The number of structural features of the '<em>ID GEO Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID GEO Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GEO_PUNKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Geraet_Programmiert_TypeClassImpl <em>ID Geraet Programmiert Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Geraet_Programmiert_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Geraet_Programmiert_TypeClass()
	 * @generated
	 */
	int ID_GERAET_PROGRAMMIERT_TYPE_CLASS = 63;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GERAET_PROGRAMMIERT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GERAET_PROGRAMMIERT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The number of structural features of the '<em>ID Geraet Programmiert Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GERAET_PROGRAMMIERT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Geraet Programmiert Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GERAET_PROGRAMMIERT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_GFR_Anlage_ohne_Proxy_TypeClassImpl <em>ID GFR Anlage ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_GFR_Anlage_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_GFR_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS = 64;

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
	 * The number of structural features of the '<em>ID GFR Anlage ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID GFR Anlage ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Gleis_Abschnitt_TypeClassImpl <em>ID Gleis Abschnitt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Gleis_Abschnitt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Gleis_Abschnitt_TypeClass()
	 * @generated
	 */
	int ID_GLEIS_ABSCHNITT_TYPE_CLASS = 65;

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
	 * The number of structural features of the '<em>ID Gleis Abschnitt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_ABSCHNITT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Gleis Abschnitt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_ABSCHNITT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Gleis_Bezeichnung_TypeClassImpl <em>ID Gleis Bezeichnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Gleis_Bezeichnung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Gleis_Bezeichnung_TypeClass()
	 * @generated
	 */
	int ID_GLEIS_BEZEICHNUNG_TYPE_CLASS = 66;

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
	 * The number of structural features of the '<em>ID Gleis Bezeichnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_BEZEICHNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Gleis Bezeichnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GLEIS_BEZEICHNUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Grenzzeichen_TypeClassImpl <em>ID Grenzzeichen Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Grenzzeichen_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Grenzzeichen_TypeClass()
	 * @generated
	 */
	int ID_GRENZZEICHEN_TYPE_CLASS = 67;

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
	 * The number of structural features of the '<em>ID Grenzzeichen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GRENZZEICHEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Grenzzeichen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_GRENZZEICHEN_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Handschalt_Wirkfunktion_TypeClassImpl <em>ID Handschalt Wirkfunktion Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Handschalt_Wirkfunktion_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Handschalt_Wirkfunktion_TypeClass()
	 * @generated
	 */
	int ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS = 68;

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
	 * The number of structural features of the '<em>ID Handschalt Wirkfunktion Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Handschalt Wirkfunktion Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Hoehenpunkt_TypeClassImpl <em>ID Hoehenpunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Hoehenpunkt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Hoehenpunkt_TypeClass()
	 * @generated
	 */
	int ID_HOEHENPUNKT_TYPE_CLASS = 69;

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
	 * The number of structural features of the '<em>ID Hoehenpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HOEHENPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Hoehenpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_HOEHENPUNKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Information_Eingang_TypeClassImpl <em>ID Information Eingang Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Information_Eingang_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Information_Eingang_TypeClass()
	 * @generated
	 */
	int ID_INFORMATION_EINGANG_TYPE_CLASS = 70;

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
	 * The number of structural features of the '<em>ID Information Eingang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_EINGANG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Information Eingang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_EINGANG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Information_Primaer_TypeClassImpl <em>ID Information Primaer Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Information_Primaer_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Information_Primaer_TypeClass()
	 * @generated
	 */
	int ID_INFORMATION_PRIMAER_TYPE_CLASS = 71;

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
	 * The number of structural features of the '<em>ID Information Primaer Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_PRIMAER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Information Primaer Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_INFORMATION_PRIMAER_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Anlage_ohne_Proxy_TypeClassImpl <em>ID LEU Anlage ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Anlage_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_LEU_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS = 72;

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
	 * The number of structural features of the '<em>ID LEU Anlage ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID LEU Anlage ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Anlage_TypeClassImpl <em>ID LEU Anlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Anlage_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_LEU_Anlage_TypeClass()
	 * @generated
	 */
	int ID_LEU_ANLAGE_TYPE_CLASS = 73;

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
	 * The number of structural features of the '<em>ID LEU Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID LEU Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_ANLAGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Bezugspunkt_TypeClassImpl <em>ID LEU Bezugspunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Bezugspunkt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_LEU_Bezugspunkt_TypeClass()
	 * @generated
	 */
	int ID_LEU_BEZUGSPUNKT_TYPE_CLASS = 74;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_BEZUGSPUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_BEZUGSPUNKT_TYPE_CLASS__WERT = BasisTypenPackage.ZEIGER_TYPE_CLASS__WERT;

	/**
	 * The number of structural features of the '<em>ID LEU Bezugspunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_BEZUGSPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID LEU Bezugspunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_BEZUGSPUNKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Schaltkasten_ohne_Proxy_TypeClassImpl <em>ID LEU Schaltkasten ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Schaltkasten_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_LEU_Schaltkasten_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS = 75;

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
	 * The number of structural features of the '<em>ID LEU Schaltkasten ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID LEU Schaltkasten ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_LO_Einbau_TypeClassImpl <em>ID LO Einbau Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_LO_Einbau_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_LO_Einbau_TypeClass()
	 * @generated
	 */
	int ID_LO_EINBAU_TYPE_CLASS = 76;

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
	 * The number of structural features of the '<em>ID LO Einbau Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LO_EINBAU_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID LO Einbau Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LO_EINBAU_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Markante_Stelle_TypeClassImpl <em>ID Markante Stelle Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Markante_Stelle_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Markante_Stelle_TypeClass()
	 * @generated
	 */
	int ID_MARKANTE_STELLE_TYPE_CLASS = 77;

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
	 * The number of structural features of the '<em>ID Markante Stelle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTE_STELLE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Markante Stelle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTE_STELLE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Markanter_Punkt_TypeClassImpl <em>ID Markanter Punkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Markanter_Punkt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Markanter_Punkt_TypeClass()
	 * @generated
	 */
	int ID_MARKANTER_PUNKT_TYPE_CLASS = 78;

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
	 * The number of structural features of the '<em>ID Markanter Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTER_PUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Markanter Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_MARKANTER_PUNKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_NB_Element_TypeClassImpl <em>ID NB Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_NB_Element_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_NB_Element_TypeClass()
	 * @generated
	 */
	int ID_NB_ELEMENT_TYPE_CLASS = 79;

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
	 * The number of structural features of the '<em>ID NB Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID NB Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_NB_TypeClassImpl <em>ID NB Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_NB_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_NB_TypeClass()
	 * @generated
	 */
	int ID_NB_TYPE_CLASS = 80;

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
	 * The number of structural features of the '<em>ID NB Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID NB Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_NB_Zone_TypeClassImpl <em>ID NB Zone Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_NB_Zone_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_NB_Zone_TypeClass()
	 * @generated
	 */
	int ID_NB_ZONE_TYPE_CLASS = 81;

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
	 * The number of structural features of the '<em>ID NB Zone Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ZONE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID NB Zone Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NB_ZONE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Oertlichkeit_Proxy_TypeClassImpl <em>ID Oertlichkeit Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Oertlichkeit_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Oertlichkeit_Proxy_TypeClass()
	 * @generated
	 */
	int ID_OERTLICHKEIT_PROXY_TYPE_CLASS = 82;

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
	 * The number of structural features of the '<em>ID Oertlichkeit Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Oertlichkeit Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Oertlichkeit_TypeClassImpl <em>ID Oertlichkeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Oertlichkeit_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Oertlichkeit_TypeClass()
	 * @generated
	 */
	int ID_OERTLICHKEIT_TYPE_CLASS = 83;

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
	 * The number of structural features of the '<em>ID Oertlichkeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Oertlichkeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OERTLICHKEIT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_PlanPro_Schnittstelle_TypeClassImpl <em>ID Plan Pro Schnittstelle Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_PlanPro_Schnittstelle_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_PlanPro_Schnittstelle_TypeClass()
	 * @generated
	 */
	int ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS = 84;

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
	 * The number of structural features of the '<em>ID Plan Pro Schnittstelle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Plan Pro Schnittstelle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Planung_Einzel_TypeClassImpl <em>ID Planung Einzel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Planung_Einzel_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Planung_Einzel_TypeClass()
	 * @generated
	 */
	int ID_PLANUNG_EINZEL_TYPE_CLASS = 85;

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
	 * The number of structural features of the '<em>ID Planung Einzel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNG_EINZEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Planung Einzel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNG_EINZEL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Planungsgrundlage_TypeClassImpl <em>ID Planungsgrundlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Planungsgrundlage_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Planungsgrundlage_TypeClass()
	 * @generated
	 */
	int ID_PLANUNGSGRUNDLAGE_TYPE_CLASS = 86;

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
	 * The number of structural features of the '<em>ID Planungsgrundlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNGSGRUNDLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Planungsgrundlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PLANUNGSGRUNDLAGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_Bezugspunkt_TypeClassImpl <em>ID PZB Element Bezugspunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_Bezugspunkt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_Bezugspunkt_TypeClass()
	 * @generated
	 */
	int ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS = 87;

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
	 * The number of structural features of the '<em>ID PZB Element Bezugspunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID PZB Element Bezugspunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_Mitnutzung_TypeClassImpl <em>ID PZB Element Mitnutzung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_Mitnutzung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_Mitnutzung_TypeClass()
	 * @generated
	 */
	int ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS = 88;

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
	 * The number of structural features of the '<em>ID PZB Element Mitnutzung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID PZB Element Mitnutzung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_TypeClassImpl <em>ID PZB Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_TypeClass()
	 * @generated
	 */
	int ID_PZB_ELEMENT_TYPE_CLASS = 89;

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
	 * The number of structural features of the '<em>ID PZB Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID PZB Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_Zuordnung_TypeClassImpl <em>ID PZB Element Zuordnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_Zuordnung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_Zuordnung_TypeClass()
	 * @generated
	 */
	int ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS = 90;

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
	 * The number of structural features of the '<em>ID PZB Element Zuordnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID PZB Element Zuordnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Quellelement_TypeClassImpl <em>ID Quellelement Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Quellelement_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Quellelement_TypeClass()
	 * @generated
	 */
	int ID_QUELLELEMENT_TYPE_CLASS = 91;

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
	 * The number of structural features of the '<em>ID Quellelement Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_QUELLELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Quellelement Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_QUELLELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_RBC_TypeClassImpl <em>ID RBC Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_RBC_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_RBC_TypeClass()
	 * @generated
	 */
	int ID_RBC_TYPE_CLASS = 92;

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
	 * The number of structural features of the '<em>ID RBC Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_RBC_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID RBC Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_RBC_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Regelzeichnung_TypeClassImpl <em>ID Regelzeichnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Regelzeichnung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Regelzeichnung_TypeClass()
	 * @generated
	 */
	int ID_REGELZEICHNUNG_TYPE_CLASS = 93;

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
	 * The number of structural features of the '<em>ID Regelzeichnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REGELZEICHNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Regelzeichnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REGELZEICHNUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Schalter_TypeClassImpl <em>ID Schalter Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Schalter_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Schalter_TypeClass()
	 * @generated
	 */
	int ID_SCHALTER_TYPE_CLASS = 94;

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
	 * The number of structural features of the '<em>ID Schalter Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Schalter Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTER_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Schaltmittel_Zuordnung_TypeClassImpl <em>ID Schaltmittel Zuordnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Schaltmittel_Zuordnung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Schaltmittel_Zuordnung_TypeClass()
	 * @generated
	 */
	int ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS = 95;

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
	 * The number of structural features of the '<em>ID Schaltmittel Zuordnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Schaltmittel Zuordnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Schlosskombination_TypeClassImpl <em>ID Schlosskombination Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Schlosskombination_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Schlosskombination_TypeClass()
	 * @generated
	 */
	int ID_SCHLOSSKOMBINATION_TYPE_CLASS = 96;

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
	 * The number of structural features of the '<em>ID Schlosskombination Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLOSSKOMBINATION_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Schlosskombination Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLOSSKOMBINATION_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Schluessel_TypeClassImpl <em>ID Schluessel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Schluessel_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Schluessel_TypeClass()
	 * @generated
	 */
	int ID_SCHLUESSEL_TYPE_CLASS = 97;

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
	 * The number of structural features of the '<em>ID Schluessel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Schluessel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSEL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Schluesselsperre_TypeClassImpl <em>ID Schluesselsperre Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Schluesselsperre_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Schluesselsperre_TypeClass()
	 * @generated
	 */
	int ID_SCHLUESSELSPERRE_TYPE_CLASS = 98;

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
	 * The number of structural features of the '<em>ID Schluesselsperre Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSELSPERRE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Schluesselsperre Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHLUESSELSPERRE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Befestigung_TypeClassImpl <em>ID Signal Befestigung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Befestigung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_Befestigung_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS = 99;

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
	 * The number of structural features of the '<em>ID Signal Befestigung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Signal Befestigung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Fank_TypeClassImpl <em>ID Signal Fank Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Fank_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_Fank_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_FANK_TYPE_CLASS = 100;

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
	 * The number of structural features of the '<em>ID Signal Fank Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_FANK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Signal Fank Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_FANK_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Gleisbezechnung_TypeClassImpl <em>ID Signal Gleisbezechnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Gleisbezechnung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_Gleisbezechnung_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS = 101;

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
	 * The number of structural features of the '<em>ID Signal Gleisbezechnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Signal Gleisbezechnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_ohne_Proxy_TypeClassImpl <em>ID Signal ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_OHNE_PROXY_TYPE_CLASS = 102;

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
	 * The number of structural features of the '<em>ID Signal ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Signal ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Rahmen_TypeClassImpl <em>ID Signal Rahmen Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Rahmen_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_Rahmen_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_RAHMEN_TYPE_CLASS = 103;

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
	 * The number of structural features of the '<em>ID Signal Rahmen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_RAHMEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Signal Rahmen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_RAHMEN_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Signalbegriff_TypeClassImpl <em>ID Signal Signalbegriff Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Signalbegriff_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_Signalbegriff_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS = 104;

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
	 * The number of structural features of the '<em>ID Signal Signalbegriff Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Signal Signalbegriff Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Start_TypeClassImpl <em>ID Signal Start Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Start_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_Start_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_START_TYPE_CLASS = 105;

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
	 * The number of structural features of the '<em>ID Signal Start Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_START_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Signal Start Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_START_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_TypeClassImpl <em>ID Signal Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_TypeClass()
	 * @generated
	 */
	int ID_SIGNAL_TYPE_CLASS = 106;

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
	 * The number of structural features of the '<em>ID Signal Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Signal Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SIGNAL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Sonderanlage_TypeClassImpl <em>ID Sonderanlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Sonderanlage_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Sonderanlage_TypeClass()
	 * @generated
	 */
	int ID_SONDERANLAGE_TYPE_CLASS = 107;

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
	 * The number of structural features of the '<em>ID Sonderanlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SONDERANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Sonderanlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SONDERANLAGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Stellelement_TypeClassImpl <em>ID Stellelement Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Stellelement_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Stellelement_TypeClass()
	 * @generated
	 */
	int ID_STELLELEMENT_TYPE_CLASS = 108;

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
	 * The number of structural features of the '<em>ID Stellelement Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Stellelement Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Stellwerk_TypeClassImpl <em>ID Stellwerk Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Stellwerk_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Stellwerk_TypeClass()
	 * @generated
	 */
	int ID_STELLWERK_TYPE_CLASS = 109;

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
	 * The number of structural features of the '<em>ID Stellwerk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLWERK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Stellwerk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STELLWERK_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Strecke_Punkt_TypeClassImpl <em>ID Strecke Punkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Strecke_Punkt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Strecke_Punkt_TypeClass()
	 * @generated
	 */
	int ID_STRECKE_PUNKT_TYPE_CLASS = 110;

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
	 * The number of structural features of the '<em>ID Strecke Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_PUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Strecke Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_PUNKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Strecke_TypeClassImpl <em>ID Strecke Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Strecke_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Strecke_TypeClass()
	 * @generated
	 */
	int ID_STRECKE_TYPE_CLASS = 111;

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
	 * The number of structural features of the '<em>ID Strecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Strecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_STRECKE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Technischer_Punkt_TypeClassImpl <em>ID Technischer Punkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Technischer_Punkt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Technischer_Punkt_TypeClass()
	 * @generated
	 */
	int ID_TECHNISCHER_PUNKT_TYPE_CLASS = 112;

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
	 * The number of structural features of the '<em>ID Technischer Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TECHNISCHER_PUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Technischer Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TECHNISCHER_PUNKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_TOP_Kante_ohne_Proxy_TypeClassImpl <em>ID TOP Kante ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_TOP_Kante_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_TOP_Kante_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS = 113;

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
	 * The number of structural features of the '<em>ID TOP Kante ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID TOP Kante ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_TOP_Kante_TypeClassImpl <em>ID TOP Kante Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_TOP_Kante_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_TOP_Kante_TypeClass()
	 * @generated
	 */
	int ID_TOP_KANTE_TYPE_CLASS = 114;

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
	 * The number of structural features of the '<em>ID TOP Kante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID TOP Kante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KANTE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_TOP_Knoten_TypeClassImpl <em>ID TOP Knoten Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_TOP_Knoten_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_TOP_Knoten_TypeClass()
	 * @generated
	 */
	int ID_TOP_KNOTEN_TYPE_CLASS = 115;

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
	 * The number of structural features of the '<em>ID TOP Knoten Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KNOTEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID TOP Knoten Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TOP_KNOTEN_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Trasse_Kante_TypeClassImpl <em>ID Trasse Kante Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Trasse_Kante_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Trasse_Kante_TypeClass()
	 * @generated
	 */
	int ID_TRASSE_KANTE_TYPE_CLASS = 116;

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
	 * The number of structural features of the '<em>ID Trasse Kante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KANTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Trasse Kante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KANTE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Trasse_Knoten_TypeClassImpl <em>ID Trasse Knoten Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Trasse_Knoten_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Trasse_Knoten_TypeClass()
	 * @generated
	 */
	int ID_TRASSE_KNOTEN_TYPE_CLASS = 117;

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
	 * The number of structural features of the '<em>ID Trasse Knoten Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KNOTEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Trasse Knoten Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TRASSE_KNOTEN_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Ueberhoehung_TypeClassImpl <em>ID Ueberhoehung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Ueberhoehung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Ueberhoehung_TypeClass()
	 * @generated
	 */
	int ID_UEBERHOEHUNG_TYPE_CLASS = 118;

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
	 * The number of structural features of the '<em>ID Ueberhoehung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERHOEHUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Ueberhoehung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERHOEHUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Uebertragungsweg_Nach_TypeClassImpl <em>ID Uebertragungsweg Nach Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Uebertragungsweg_Nach_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Uebertragungsweg_Nach_TypeClass()
	 * @generated
	 */
	int ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS = 119;

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
	 * The number of structural features of the '<em>ID Uebertragungsweg Nach Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Uebertragungsweg Nach Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Uebertragungsweg_Von_TypeClassImpl <em>ID Uebertragungsweg Von Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Uebertragungsweg_Von_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Uebertragungsweg_Von_TypeClass()
	 * @generated
	 */
	int ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS = 120;

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
	 * The number of structural features of the '<em>ID Uebertragungsweg Von Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Uebertragungsweg Von Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Umfahrpunkt_TypeClassImpl <em>ID Umfahrpunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Umfahrpunkt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Umfahrpunkt_TypeClass()
	 * @generated
	 */
	int ID_UMFAHRPUNKT_TYPE_CLASS = 121;

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
	 * The number of structural features of the '<em>ID Umfahrpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UMFAHRPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Umfahrpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UMFAHRPUNKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Unterbringung_ohne_Proxy_TypeClassImpl <em>ID Unterbringung ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Unterbringung_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Unterbringung_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS = 122;

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
	 * The number of structural features of the '<em>ID Unterbringung ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Unterbringung ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Unterbringung_Technik_TypeClassImpl <em>ID Unterbringung Technik Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Unterbringung_Technik_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Unterbringung_Technik_TypeClass()
	 * @generated
	 */
	int ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS = 123;

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
	 * The number of structural features of the '<em>ID Unterbringung Technik Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Unterbringung Technik Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Unterbringung_TypeClassImpl <em>ID Unterbringung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Unterbringung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Unterbringung_TypeClass()
	 * @generated
	 */
	int ID_UNTERBRINGUNG_TYPE_CLASS = 124;

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
	 * The number of structural features of the '<em>ID Unterbringung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Unterbringung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UNTERBRINGUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Ur_Objekt_TypeClassImpl <em>ID Ur Objekt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Ur_Objekt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Ur_Objekt_TypeClass()
	 * @generated
	 */
	int ID_UR_OBJEKT_TYPE_CLASS = 125;

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
	 * The number of structural features of the '<em>ID Ur Objekt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UR_OBJEKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Ur Objekt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_UR_OBJEKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Verknuepftes_Element_TypeClassImpl <em>ID Verknuepftes Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Verknuepftes_Element_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Verknuepftes_Element_TypeClass()
	 * @generated
	 */
	int ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS = 126;

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
	 * The number of structural features of the '<em>ID Verknuepftes Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Verknuepftes Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Anlage_ohne_Proxy_TypeClassImpl <em>ID WKr Anlage ohne Proxy Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Anlage_ohne_Proxy_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Anlage_ohne_Proxy_TypeClass()
	 * @generated
	 */
	int ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS = 127;

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
	 * The number of structural features of the '<em>ID WKr Anlage ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID WKr Anlage ohne Proxy Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Anlage_TypeClassImpl <em>ID WKr Anlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Anlage_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Anlage_TypeClass()
	 * @generated
	 */
	int ID_WKR_ANLAGE_TYPE_CLASS = 128;

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
	 * The number of structural features of the '<em>ID WKr Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID WKr Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_ANLAGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Gsp_Element_TypeClassImpl <em>ID WKr Gsp Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Gsp_Element_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Gsp_Element_TypeClass()
	 * @generated
	 */
	int ID_WKR_GSP_ELEMENT_TYPE_CLASS = 129;

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
	 * The number of structural features of the '<em>ID WKr Gsp Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID WKr Gsp Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_ELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Gsp_Komponente_TypeClassImpl <em>ID WKr Gsp Komponente Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Gsp_Komponente_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Gsp_Komponente_TypeClass()
	 * @generated
	 */
	int ID_WKR_GSP_KOMPONENTE_TYPE_CLASS = 130;

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
	 * The number of structural features of the '<em>ID WKr Gsp Komponente Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_KOMPONENTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID WKr Gsp Komponente Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WKR_GSP_KOMPONENTE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Weichenlaufkette_TypeClassImpl <em>ID Weichenlaufkette Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Weichenlaufkette_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Weichenlaufkette_TypeClass()
	 * @generated
	 */
	int ID_WEICHENLAUFKETTE_TYPE_CLASS = 131;

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
	 * The number of structural features of the '<em>ID Weichenlaufkette Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WEICHENLAUFKETTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Weichenlaufkette Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_WEICHENLAUFKETTE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Ziel_TypeClassImpl <em>ID Ziel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Ziel_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Ziel_TypeClass()
	 * @generated
	 */
	int ID_ZIEL_TYPE_CLASS = 132;

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
	 * The number of structural features of the '<em>ID Ziel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZIEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Ziel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZIEL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_DLP_Fstr_TypeClassImpl <em>ID ZL DLP Fstr Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_DLP_Fstr_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZL_DLP_Fstr_TypeClass()
	 * @generated
	 */
	int ID_ZL_DLP_FSTR_TYPE_CLASS = 133;

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
	 * The number of structural features of the '<em>ID ZL DLP Fstr Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_DLP_FSTR_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ZL DLP Fstr Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_DLP_FSTR_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_Fstr_TypeClassImpl <em>ID ZL Fstr Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_Fstr_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZL_Fstr_TypeClass()
	 * @generated
	 */
	int ID_ZL_FSTR_TYPE_CLASS = 134;

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
	 * The number of structural features of the '<em>ID ZL Fstr Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_FSTR_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ZL Fstr Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_FSTR_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_Signalgruppe_TypeClassImpl <em>ID ZL Signalgruppe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_Signalgruppe_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZL_Signalgruppe_TypeClass()
	 * @generated
	 */
	int ID_ZL_SIGNALGRUPPE_TYPE_CLASS = 135;

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
	 * The number of structural features of the '<em>ID ZL Signalgruppe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_SIGNALGRUPPE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ZL Signalgruppe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_SIGNALGRUPPE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_TypeClassImpl <em>ID ZL Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZL_TypeClass()
	 * @generated
	 */
	int ID_ZL_TYPE_CLASS = 136;

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
	 * The number of structural features of the '<em>ID ZL Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ZL Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZLV_Bus_TypeClassImpl <em>ID ZLV Bus Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZLV_Bus_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZLV_Bus_TypeClass()
	 * @generated
	 */
	int ID_ZLV_BUS_TYPE_CLASS = 137;

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
	 * The number of structural features of the '<em>ID ZLV Bus Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZLV_BUS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ZLV Bus Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZLV_BUS_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Anzeigefeld_Anstoss_TypeClassImpl <em>ID ZN Anzeigefeld Anstoss Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Anzeigefeld_Anstoss_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZN_Anzeigefeld_Anstoss_TypeClass()
	 * @generated
	 */
	int ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS = 138;

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
	 * The number of structural features of the '<em>ID ZN Anzeigefeld Anstoss Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ZN Anzeigefeld Anstoss Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Anzeigefeld_TypeClassImpl <em>ID ZN Anzeigefeld Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Anzeigefeld_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZN_Anzeigefeld_TypeClass()
	 * @generated
	 */
	int ID_ZN_ANZEIGEFELD_TYPE_CLASS = 139;

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
	 * The number of structural features of the '<em>ID ZN Anzeigefeld Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ZN Anzeigefeld Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ANZEIGEFELD_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Fortschalt_Kriterium_TypeClassImpl <em>ID ZN Fortschalt Kriterium Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Fortschalt_Kriterium_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZN_Fortschalt_Kriterium_TypeClass()
	 * @generated
	 */
	int ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS = 140;

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
	 * The number of structural features of the '<em>ID ZN Fortschalt Kriterium Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ZN Fortschalt Kriterium Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_TypeClassImpl <em>ID ZN Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZN_TypeClass()
	 * @generated
	 */
	int ID_ZN_TYPE_CLASS = 141;

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
	 * The number of structural features of the '<em>ID ZN Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ZN Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Unterstation_TypeClassImpl <em>ID ZN Unterstation Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Unterstation_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZN_Unterstation_TypeClass()
	 * @generated
	 */
	int ID_ZN_UNTERSTATION_TYPE_CLASS = 142;

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
	 * The number of structural features of the '<em>ID ZN Unterstation Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_UNTERSTATION_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ZN Unterstation Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_UNTERSTATION_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_ZBS_TypeClassImpl <em>ID ZN ZBS Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_ZBS_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZN_ZBS_TypeClass()
	 * @generated
	 */
	int ID_ZN_ZBS_TYPE_CLASS = 143;

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
	 * The number of structural features of the '<em>ID ZN ZBS Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ZBS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID ZN ZBS Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZN_ZBS_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Zugeinwirkung_TypeClassImpl <em>ID Zugeinwirkung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Zugeinwirkung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Zugeinwirkung_TypeClass()
	 * @generated
	 */
	int ID_ZUGEINWIRKUNG_TYPE_CLASS = 144;

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
	 * The number of structural features of the '<em>ID Zugeinwirkung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZUGEINWIRKUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Zugeinwirkung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZUGEINWIRKUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Zweites_Haltfallkriterium_TypeClassImpl <em>ID Zweites Haltfallkriterium Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Zweites_Haltfallkriterium_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Zweites_Haltfallkriterium_TypeClass()
	 * @generated
	 */
	int ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS = 145;

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
	 * The number of structural features of the '<em>ID Zweites Haltfallkriterium Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID Zweites Haltfallkriterium Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.ZEIGER_TYPE_CLASS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Anforderer_Element_TypeClass <em>ID Anforderer Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Anforderer Element Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Anforderer_Element_TypeClass
	 * @generated
	 */
	EClass getID_Anforderer_Element_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Anforderung_TypeClass <em>ID Anforderung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Anforderung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Anforderung_TypeClass
	 * @generated
	 */
	EClass getID_Anforderung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Anhang_ohne_Proxy_TypeClass <em>ID Anhang ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Anhang ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Anhang_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Anhang_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass <em>ID Anhang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Anhang Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass
	 * @generated
	 */
	EClass getID_Anhang_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Anschluss_Element_TypeClass <em>ID Anschluss Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Anschluss Element Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Anschluss_Element_TypeClass
	 * @generated
	 */
	EClass getID_Anschluss_Element_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass <em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Aussenelementansteuerung_TypeClass <em>ID Aussenelementansteuerung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Aussenelementansteuerung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Aussenelementansteuerung_TypeClass
	 * @generated
	 */
	EClass getID_Aussenelementansteuerung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Bahnsteig_Anlage_TypeClass <em>ID Bahnsteig Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bahnsteig Anlage Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Bahnsteig_Anlage_TypeClass
	 * @generated
	 */
	EClass getID_Bahnsteig_Anlage_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Bahnsteig_Kante_ohne_Proxy_TypeClass <em>ID Bahnsteig Kante ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bahnsteig Kante ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Bahnsteig_Kante_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Bahnsteig_Kante_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Bahnsteig_Kante_TypeClass <em>ID Bahnsteig Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bahnsteig Kante Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Bahnsteig_Kante_TypeClass
	 * @generated
	 */
	EClass getID_Bahnsteig_Kante_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Balise_ohne_Proxy_TypeClass <em>ID Balise ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Balise ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Balise_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Balise_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Balise_TypeClass <em>ID Balise Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Balise Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Balise_TypeClass
	 * @generated
	 */
	EClass getID_Balise_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Basis_Objekt_TypeClass <em>ID Basis Objekt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Basis Objekt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Basis_Objekt_TypeClass
	 * @generated
	 */
	EClass getID_Basis_Objekt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Bearbeitungsvermerk_TypeClass <em>ID Bearbeitungsvermerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bearbeitungsvermerk Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Bearbeitungsvermerk_TypeClass
	 * @generated
	 */
	EClass getID_Bearbeitungsvermerk_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Bedien_Anzeige_Element_TypeClass <em>ID Bedien Anzeige Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bedien Anzeige Element Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Bedien_Anzeige_Element_TypeClass
	 * @generated
	 */
	EClass getID_Bedien_Anzeige_Element_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Bedien_Bezirk_TypeClass <em>ID Bedien Bezirk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bedien Bezirk Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Bedien_Bezirk_TypeClass
	 * @generated
	 */
	EClass getID_Bedien_Bezirk_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Bedien_Einrichtung_Oertlich_TypeClass <em>ID Bedien Einrichtung Oertlich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bedien Einrichtung Oertlich Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Bedien_Einrichtung_Oertlich_TypeClass
	 * @generated
	 */
	EClass getID_Bedien_Einrichtung_Oertlich_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Bedien_Oberflaeche_TypeClass <em>ID Bedien Oberflaeche Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bedien Oberflaeche Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Bedien_Oberflaeche_TypeClass
	 * @generated
	 */
	EClass getID_Bedien_Oberflaeche_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Bedien_Standort_TypeClass <em>ID Bedien Standort Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bedien Standort Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Bedien_Standort_TypeClass
	 * @generated
	 */
	EClass getID_Bedien_Standort_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Bedien_Zentrale_TypeClass <em>ID Bedien Zentrale Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bedien Zentrale Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Bedien_Zentrale_TypeClass
	 * @generated
	 */
	EClass getID_Bedien_Zentrale_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Beginn_Bereich_TypeClass <em>ID Beginn Bereich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Beginn Bereich Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Beginn_Bereich_TypeClass
	 * @generated
	 */
	EClass getID_Beginn_Bereich_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Binaerdatei_ohne_Proxy_TypeClass <em>ID Binaerdatei ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Binaerdatei ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Binaerdatei_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Binaerdatei_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Block_Anlage_TypeClass <em>ID Block Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Block Anlage Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Block_Anlage_TypeClass
	 * @generated
	 */
	EClass getID_Block_Anlage_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Block_Element_TypeClass <em>ID Block Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Block Element Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Block_Element_TypeClass
	 * @generated
	 */
	EClass getID_Block_Element_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Block_Strecke_TypeClass <em>ID Block Strecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Block Strecke Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Block_Strecke_TypeClass
	 * @generated
	 */
	EClass getID_Block_Strecke_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass <em>ID BUE Anlage ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE Anlage ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_BUE_Anlage_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_BUE_Anlage_TypeClass <em>ID BUE Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE Anlage Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_BUE_Anlage_TypeClass
	 * @generated
	 */
	EClass getID_BUE_Anlage_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_BUE_Bedien_Anzeige_Element_TypeClass <em>ID BUE Bedien Anzeige Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE Bedien Anzeige Element Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_BUE_Bedien_Anzeige_Element_TypeClass
	 * @generated
	 */
	EClass getID_BUE_Bedien_Anzeige_Element_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_BUE_Einschaltung_TypeClass <em>ID BUE Einschaltung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE Einschaltung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_BUE_Einschaltung_TypeClass
	 * @generated
	 */
	EClass getID_BUE_Einschaltung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass <em>ID BUE Gleisbezogener Gefahrraum Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE Gleisbezogener Gefahrraum Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass
	 * @generated
	 */
	EClass getID_BUE_Gleisbezogener_Gefahrraum_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_BUE_Schnittstelle_TypeClass <em>ID BUE Schnittstelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE Schnittstelle Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_BUE_Schnittstelle_TypeClass
	 * @generated
	 */
	EClass getID_BUE_Schnittstelle_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_BUE_WS_Fstr_Zuordnung_TypeClass <em>ID BUE WS Fstr Zuordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID BUE WS Fstr Zuordnung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_BUE_WS_Fstr_Zuordnung_TypeClass
	 * @generated
	 */
	EClass getID_BUE_WS_Fstr_Zuordnung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Datenpunkt_ohne_Proxy_TypeClass <em>ID Datenpunkt ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Datenpunkt ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Datenpunkt_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Datenpunkt_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Datenpunkt_TypeClass <em>ID Datenpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Datenpunkt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Datenpunkt_TypeClass
	 * @generated
	 */
	EClass getID_Datenpunkt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_DP_Bezugspunkt_TypeClass <em>ID DP Bezugspunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID DP Bezugspunkt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_DP_Bezugspunkt_TypeClass
	 * @generated
	 */
	EClass getID_DP_Bezugspunkt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Einschaltpunkt_TypeClass <em>ID Einschaltpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Einschaltpunkt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Einschaltpunkt_TypeClass
	 * @generated
	 */
	EClass getID_Einschaltpunkt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Element_Grenze_TypeClass <em>ID Element Grenze Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Element Grenze Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Element_Grenze_TypeClass
	 * @generated
	 */
	EClass getID_Element_Grenze_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Element_TypeClass <em>ID Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Element Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Element_TypeClass
	 * @generated
	 */
	EClass getID_Element_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Element_Unterbringung_TypeClass <em>ID Element Unterbringung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Element Unterbringung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Element_Unterbringung_TypeClass
	 * @generated
	 */
	EClass getID_Element_Unterbringung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Energie_Eingang_TypeClass <em>ID Energie Eingang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Energie Eingang Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Energie_Eingang_TypeClass
	 * @generated
	 */
	EClass getID_Energie_Eingang_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Energie_Primaer_TypeClass <em>ID Energie Primaer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Energie Primaer Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Energie_Primaer_TypeClass
	 * @generated
	 */
	EClass getID_Energie_Primaer_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ESTW_Zentraleinheit_TypeClass <em>ID ESTW Zentraleinheit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ESTW Zentraleinheit Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ESTW_Zentraleinheit_TypeClass
	 * @generated
	 */
	EClass getID_ESTW_Zentraleinheit_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass <em>ID ETCS Knoten ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ETCS Knoten ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_ETCS_Knoten_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ETCS_Knoten_TypeClass <em>ID ETCS Knoten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ETCS Knoten Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ETCS_Knoten_TypeClass
	 * @generated
	 */
	EClass getID_ETCS_Knoten_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_EV_Modul_TypeClass <em>ID EV Modul Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID EV Modul Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_EV_Modul_TypeClass
	 * @generated
	 */
	EClass getID_EV_Modul_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Fachtelegramm_TypeClass <em>ID Fachtelegramm Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fachtelegramm Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Fachtelegramm_TypeClass
	 * @generated
	 */
	EClass getID_Fachtelegramm_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Fla_Schutz_TypeClass <em>ID Fla Schutz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fla Schutz Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Fla_Schutz_TypeClass
	 * @generated
	 */
	EClass getID_Fla_Schutz_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass <em>ID FMA Anlage Rangier Frei Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID FMA Anlage Rangier Frei Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass
	 * @generated
	 */
	EClass getID_FMA_Anlage_Rangier_Frei_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_FMA_Anlage_TypeClass <em>ID FMA Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID FMA Anlage Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_FMA_Anlage_TypeClass
	 * @generated
	 */
	EClass getID_FMA_Anlage_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_FMA_Element_TypeClass <em>ID FMA Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID FMA Element Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_FMA_Element_TypeClass
	 * @generated
	 */
	EClass getID_FMA_Element_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_FMA_Komponente_TypeClass <em>ID FMA Komponente Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID FMA Komponente Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_FMA_Komponente_TypeClass
	 * @generated
	 */
	EClass getID_FMA_Komponente_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Fortschaltung_Start_TypeClass <em>ID Fortschaltung Start Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fortschaltung Start Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Fortschaltung_Start_TypeClass
	 * @generated
	 */
	EClass getID_Fortschaltung_Start_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Fstr_Aneinander_TypeClass <em>ID Fstr Aneinander Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fstr Aneinander Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Fstr_Aneinander_TypeClass
	 * @generated
	 */
	EClass getID_Fstr_Aneinander_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Fstr_Ausschluss_Besonders_TypeClass <em>ID Fstr Ausschluss Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fstr Ausschluss Besonders Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Fstr_Ausschluss_Besonders_TypeClass
	 * @generated
	 */
	EClass getID_Fstr_Ausschluss_Besonders_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Fstr_DWeg_TypeClass <em>ID Fstr DWeg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fstr DWeg Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Fstr_DWeg_TypeClass
	 * @generated
	 */
	EClass getID_Fstr_DWeg_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Fstr_Fahrweg_TypeClass <em>ID Fstr Fahrweg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fstr Fahrweg Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Fstr_Fahrweg_TypeClass
	 * @generated
	 */
	EClass getID_Fstr_Fahrweg_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Fstr_Zug_Rangier_TypeClass <em>ID Fstr Zug Rangier Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Fstr Zug Rangier Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Fstr_Zug_Rangier_TypeClass
	 * @generated
	 */
	EClass getID_Fstr_Zug_Rangier_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_FT_Anschaltbedingung_TypeClass <em>ID FT Anschaltbedingung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID FT Anschaltbedingung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_FT_Anschaltbedingung_TypeClass
	 * @generated
	 */
	EClass getID_FT_Anschaltbedingung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_FT_Fahrweg_Teil_TypeClass <em>ID FT Fahrweg Teil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID FT Fahrweg Teil Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_FT_Fahrweg_Teil_TypeClass
	 * @generated
	 */
	EClass getID_FT_Fahrweg_Teil_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_GEO_Art_TypeClass <em>ID GEO Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID GEO Art Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_GEO_Art_TypeClass
	 * @generated
	 */
	EClass getID_GEO_Art_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_GEO_Knoten_TypeClass <em>ID GEO Knoten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID GEO Knoten Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_GEO_Knoten_TypeClass
	 * @generated
	 */
	EClass getID_GEO_Knoten_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass <em>ID GEO Punkt ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID GEO Punkt ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_GEO_Punkt_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_GEO_Punkt_TypeClass <em>ID GEO Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID GEO Punkt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_GEO_Punkt_TypeClass
	 * @generated
	 */
	EClass getID_GEO_Punkt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Geraet_Programmiert_TypeClass <em>ID Geraet Programmiert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Geraet Programmiert Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Geraet_Programmiert_TypeClass
	 * @generated
	 */
	EClass getID_Geraet_Programmiert_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass <em>ID GFR Anlage ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID GFR Anlage ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_GFR_Anlage_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Gleis_Abschnitt_TypeClass <em>ID Gleis Abschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Gleis Abschnitt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Gleis_Abschnitt_TypeClass
	 * @generated
	 */
	EClass getID_Gleis_Abschnitt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Gleis_Bezeichnung_TypeClass <em>ID Gleis Bezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Gleis Bezeichnung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Gleis_Bezeichnung_TypeClass
	 * @generated
	 */
	EClass getID_Gleis_Bezeichnung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Grenzzeichen_TypeClass <em>ID Grenzzeichen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Grenzzeichen Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Grenzzeichen_TypeClass
	 * @generated
	 */
	EClass getID_Grenzzeichen_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Handschalt_Wirkfunktion_TypeClass <em>ID Handschalt Wirkfunktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Handschalt Wirkfunktion Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Handschalt_Wirkfunktion_TypeClass
	 * @generated
	 */
	EClass getID_Handschalt_Wirkfunktion_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Hoehenpunkt_TypeClass <em>ID Hoehenpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Hoehenpunkt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Hoehenpunkt_TypeClass
	 * @generated
	 */
	EClass getID_Hoehenpunkt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Information_Eingang_TypeClass <em>ID Information Eingang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Information Eingang Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Information_Eingang_TypeClass
	 * @generated
	 */
	EClass getID_Information_Eingang_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Information_Primaer_TypeClass <em>ID Information Primaer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Information Primaer Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Information_Primaer_TypeClass
	 * @generated
	 */
	EClass getID_Information_Primaer_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_LEU_Anlage_ohne_Proxy_TypeClass <em>ID LEU Anlage ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID LEU Anlage ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_LEU_Anlage_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_LEU_Anlage_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_LEU_Anlage_TypeClass <em>ID LEU Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID LEU Anlage Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_LEU_Anlage_TypeClass
	 * @generated
	 */
	EClass getID_LEU_Anlage_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_LEU_Bezugspunkt_TypeClass <em>ID LEU Bezugspunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID LEU Bezugspunkt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_LEU_Bezugspunkt_TypeClass
	 * @generated
	 */
	EClass getID_LEU_Bezugspunkt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_LEU_Schaltkasten_ohne_Proxy_TypeClass <em>ID LEU Schaltkasten ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID LEU Schaltkasten ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_LEU_Schaltkasten_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_LEU_Schaltkasten_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_LO_Einbau_TypeClass <em>ID LO Einbau Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID LO Einbau Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_LO_Einbau_TypeClass
	 * @generated
	 */
	EClass getID_LO_Einbau_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Markante_Stelle_TypeClass <em>ID Markante Stelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Markante Stelle Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Markante_Stelle_TypeClass
	 * @generated
	 */
	EClass getID_Markante_Stelle_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Markanter_Punkt_TypeClass <em>ID Markanter Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Markanter Punkt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Markanter_Punkt_TypeClass
	 * @generated
	 */
	EClass getID_Markanter_Punkt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_NB_Element_TypeClass <em>ID NB Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID NB Element Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_NB_Element_TypeClass
	 * @generated
	 */
	EClass getID_NB_Element_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_NB_TypeClass <em>ID NB Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID NB Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_NB_TypeClass
	 * @generated
	 */
	EClass getID_NB_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_NB_Zone_TypeClass <em>ID NB Zone Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID NB Zone Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_NB_Zone_TypeClass
	 * @generated
	 */
	EClass getID_NB_Zone_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Oertlichkeit_Proxy_TypeClass <em>ID Oertlichkeit Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Oertlichkeit Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Oertlichkeit_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Oertlichkeit_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Oertlichkeit_TypeClass <em>ID Oertlichkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Oertlichkeit Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Oertlichkeit_TypeClass
	 * @generated
	 */
	EClass getID_Oertlichkeit_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_PlanPro_Schnittstelle_TypeClass <em>ID Plan Pro Schnittstelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Plan Pro Schnittstelle Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_PlanPro_Schnittstelle_TypeClass
	 * @generated
	 */
	EClass getID_PlanPro_Schnittstelle_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Planung_Einzel_TypeClass <em>ID Planung Einzel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Planung Einzel Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Planung_Einzel_TypeClass
	 * @generated
	 */
	EClass getID_Planung_Einzel_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Planungsgrundlage_TypeClass <em>ID Planungsgrundlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Planungsgrundlage Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Planungsgrundlage_TypeClass
	 * @generated
	 */
	EClass getID_Planungsgrundlage_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass <em>ID PZB Element Bezugspunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID PZB Element Bezugspunkt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass
	 * @generated
	 */
	EClass getID_PZB_Element_Bezugspunkt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_PZB_Element_Mitnutzung_TypeClass <em>ID PZB Element Mitnutzung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID PZB Element Mitnutzung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_PZB_Element_Mitnutzung_TypeClass
	 * @generated
	 */
	EClass getID_PZB_Element_Mitnutzung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_PZB_Element_TypeClass <em>ID PZB Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID PZB Element Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_PZB_Element_TypeClass
	 * @generated
	 */
	EClass getID_PZB_Element_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_PZB_Element_Zuordnung_TypeClass <em>ID PZB Element Zuordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID PZB Element Zuordnung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_PZB_Element_Zuordnung_TypeClass
	 * @generated
	 */
	EClass getID_PZB_Element_Zuordnung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Quellelement_TypeClass <em>ID Quellelement Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Quellelement Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Quellelement_TypeClass
	 * @generated
	 */
	EClass getID_Quellelement_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_RBC_TypeClass <em>ID RBC Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID RBC Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_RBC_TypeClass
	 * @generated
	 */
	EClass getID_RBC_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Regelzeichnung_TypeClass <em>ID Regelzeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Regelzeichnung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Regelzeichnung_TypeClass
	 * @generated
	 */
	EClass getID_Regelzeichnung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Schalter_TypeClass <em>ID Schalter Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Schalter Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Schalter_TypeClass
	 * @generated
	 */
	EClass getID_Schalter_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Schaltmittel_Zuordnung_TypeClass <em>ID Schaltmittel Zuordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Schaltmittel Zuordnung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Schaltmittel_Zuordnung_TypeClass
	 * @generated
	 */
	EClass getID_Schaltmittel_Zuordnung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Schlosskombination_TypeClass <em>ID Schlosskombination Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Schlosskombination Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Schlosskombination_TypeClass
	 * @generated
	 */
	EClass getID_Schlosskombination_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Schluessel_TypeClass <em>ID Schluessel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Schluessel Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Schluessel_TypeClass
	 * @generated
	 */
	EClass getID_Schluessel_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Schluesselsperre_TypeClass <em>ID Schluesselsperre Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Schluesselsperre Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Schluesselsperre_TypeClass
	 * @generated
	 */
	EClass getID_Schluesselsperre_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Signal_Befestigung_TypeClass <em>ID Signal Befestigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Befestigung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Signal_Befestigung_TypeClass
	 * @generated
	 */
	EClass getID_Signal_Befestigung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Signal_Fank_TypeClass <em>ID Signal Fank Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Fank Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Signal_Fank_TypeClass
	 * @generated
	 */
	EClass getID_Signal_Fank_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Signal_Gleisbezechnung_TypeClass <em>ID Signal Gleisbezechnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Gleisbezechnung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Signal_Gleisbezechnung_TypeClass
	 * @generated
	 */
	EClass getID_Signal_Gleisbezechnung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Signal_ohne_Proxy_TypeClass <em>ID Signal ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Signal_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Signal_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Signal_Rahmen_TypeClass <em>ID Signal Rahmen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Rahmen Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Signal_Rahmen_TypeClass
	 * @generated
	 */
	EClass getID_Signal_Rahmen_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Signal_Signalbegriff_TypeClass <em>ID Signal Signalbegriff Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Signalbegriff Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Signal_Signalbegriff_TypeClass
	 * @generated
	 */
	EClass getID_Signal_Signalbegriff_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Signal_Start_TypeClass <em>ID Signal Start Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Start Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Signal_Start_TypeClass
	 * @generated
	 */
	EClass getID_Signal_Start_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass <em>ID Signal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Signal Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass
	 * @generated
	 */
	EClass getID_Signal_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Sonderanlage_TypeClass <em>ID Sonderanlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Sonderanlage Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Sonderanlage_TypeClass
	 * @generated
	 */
	EClass getID_Sonderanlage_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Stellelement_TypeClass <em>ID Stellelement Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Stellelement Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Stellelement_TypeClass
	 * @generated
	 */
	EClass getID_Stellelement_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Stellwerk_TypeClass <em>ID Stellwerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Stellwerk Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Stellwerk_TypeClass
	 * @generated
	 */
	EClass getID_Stellwerk_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Strecke_Punkt_TypeClass <em>ID Strecke Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Strecke Punkt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Strecke_Punkt_TypeClass
	 * @generated
	 */
	EClass getID_Strecke_Punkt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Strecke_TypeClass <em>ID Strecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Strecke Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Strecke_TypeClass
	 * @generated
	 */
	EClass getID_Strecke_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Technischer_Punkt_TypeClass <em>ID Technischer Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Technischer Punkt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Technischer_Punkt_TypeClass
	 * @generated
	 */
	EClass getID_Technischer_Punkt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass <em>ID TOP Kante ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID TOP Kante ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_TOP_Kante_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_TOP_Kante_TypeClass <em>ID TOP Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID TOP Kante Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_TOP_Kante_TypeClass
	 * @generated
	 */
	EClass getID_TOP_Kante_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_TOP_Knoten_TypeClass <em>ID TOP Knoten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID TOP Knoten Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_TOP_Knoten_TypeClass
	 * @generated
	 */
	EClass getID_TOP_Knoten_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Trasse_Kante_TypeClass <em>ID Trasse Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Trasse Kante Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Trasse_Kante_TypeClass
	 * @generated
	 */
	EClass getID_Trasse_Kante_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Trasse_Knoten_TypeClass <em>ID Trasse Knoten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Trasse Knoten Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Trasse_Knoten_TypeClass
	 * @generated
	 */
	EClass getID_Trasse_Knoten_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Ueberhoehung_TypeClass <em>ID Ueberhoehung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Ueberhoehung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Ueberhoehung_TypeClass
	 * @generated
	 */
	EClass getID_Ueberhoehung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Uebertragungsweg_Nach_TypeClass <em>ID Uebertragungsweg Nach Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Uebertragungsweg Nach Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Uebertragungsweg_Nach_TypeClass
	 * @generated
	 */
	EClass getID_Uebertragungsweg_Nach_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Uebertragungsweg_Von_TypeClass <em>ID Uebertragungsweg Von Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Uebertragungsweg Von Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Uebertragungsweg_Von_TypeClass
	 * @generated
	 */
	EClass getID_Uebertragungsweg_Von_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Umfahrpunkt_TypeClass <em>ID Umfahrpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Umfahrpunkt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Umfahrpunkt_TypeClass
	 * @generated
	 */
	EClass getID_Umfahrpunkt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass <em>ID Unterbringung ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Unterbringung ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_Unterbringung_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_Technik_TypeClass <em>ID Unterbringung Technik Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Unterbringung Technik Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_Technik_TypeClass
	 * @generated
	 */
	EClass getID_Unterbringung_Technik_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_TypeClass <em>ID Unterbringung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Unterbringung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_TypeClass
	 * @generated
	 */
	EClass getID_Unterbringung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Ur_Objekt_TypeClass <em>ID Ur Objekt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Ur Objekt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Ur_Objekt_TypeClass
	 * @generated
	 */
	EClass getID_Ur_Objekt_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Verknuepftes_Element_TypeClass <em>ID Verknuepftes Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Verknuepftes Element Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Verknuepftes_Element_TypeClass
	 * @generated
	 */
	EClass getID_Verknuepftes_Element_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Anlage_ohne_Proxy_TypeClass <em>ID WKr Anlage ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID WKr Anlage ohne Proxy Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Anlage_ohne_Proxy_TypeClass
	 * @generated
	 */
	EClass getID_W_Kr_Anlage_ohne_Proxy_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Anlage_TypeClass <em>ID WKr Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID WKr Anlage Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Anlage_TypeClass
	 * @generated
	 */
	EClass getID_W_Kr_Anlage_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Gsp_Element_TypeClass <em>ID WKr Gsp Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID WKr Gsp Element Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Gsp_Element_TypeClass
	 * @generated
	 */
	EClass getID_W_Kr_Gsp_Element_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Gsp_Komponente_TypeClass <em>ID WKr Gsp Komponente Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID WKr Gsp Komponente Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Gsp_Komponente_TypeClass
	 * @generated
	 */
	EClass getID_W_Kr_Gsp_Komponente_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Weichenlaufkette_TypeClass <em>ID Weichenlaufkette Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Weichenlaufkette Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Weichenlaufkette_TypeClass
	 * @generated
	 */
	EClass getID_Weichenlaufkette_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Ziel_TypeClass <em>ID Ziel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Ziel Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Ziel_TypeClass
	 * @generated
	 */
	EClass getID_Ziel_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ZL_DLP_Fstr_TypeClass <em>ID ZL DLP Fstr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZL DLP Fstr Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ZL_DLP_Fstr_TypeClass
	 * @generated
	 */
	EClass getID_ZL_DLP_Fstr_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ZL_Fstr_TypeClass <em>ID ZL Fstr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZL Fstr Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ZL_Fstr_TypeClass
	 * @generated
	 */
	EClass getID_ZL_Fstr_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ZL_Signalgruppe_TypeClass <em>ID ZL Signalgruppe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZL Signalgruppe Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ZL_Signalgruppe_TypeClass
	 * @generated
	 */
	EClass getID_ZL_Signalgruppe_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ZL_TypeClass <em>ID ZL Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZL Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ZL_TypeClass
	 * @generated
	 */
	EClass getID_ZL_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ZLV_Bus_TypeClass <em>ID ZLV Bus Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZLV Bus Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ZLV_Bus_TypeClass
	 * @generated
	 */
	EClass getID_ZLV_Bus_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ZN_Anzeigefeld_Anstoss_TypeClass <em>ID ZN Anzeigefeld Anstoss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZN Anzeigefeld Anstoss Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ZN_Anzeigefeld_Anstoss_TypeClass
	 * @generated
	 */
	EClass getID_ZN_Anzeigefeld_Anstoss_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ZN_Anzeigefeld_TypeClass <em>ID ZN Anzeigefeld Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZN Anzeigefeld Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ZN_Anzeigefeld_TypeClass
	 * @generated
	 */
	EClass getID_ZN_Anzeigefeld_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ZN_Fortschalt_Kriterium_TypeClass <em>ID ZN Fortschalt Kriterium Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZN Fortschalt Kriterium Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ZN_Fortschalt_Kriterium_TypeClass
	 * @generated
	 */
	EClass getID_ZN_Fortschalt_Kriterium_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ZN_TypeClass <em>ID ZN Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZN Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ZN_TypeClass
	 * @generated
	 */
	EClass getID_ZN_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ZN_Unterstation_TypeClass <em>ID ZN Unterstation Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZN Unterstation Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ZN_Unterstation_TypeClass
	 * @generated
	 */
	EClass getID_ZN_Unterstation_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_ZN_ZBS_TypeClass <em>ID ZN ZBS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID ZN ZBS Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_ZN_ZBS_TypeClass
	 * @generated
	 */
	EClass getID_ZN_ZBS_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Zugeinwirkung_TypeClass <em>ID Zugeinwirkung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Zugeinwirkung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Zugeinwirkung_TypeClass
	 * @generated
	 */
	EClass getID_Zugeinwirkung_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Verweise.ID_Zweites_Haltfallkriterium_TypeClass <em>ID Zweites Haltfallkriterium Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Zweites Haltfallkriterium Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Verweise.ID_Zweites_Haltfallkriterium_TypeClass
	 * @generated
	 */
	EClass getID_Zweites_Haltfallkriterium_TypeClass();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Anforderer_Element_TypeClassImpl <em>ID Anforderer Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Anforderer_Element_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Anforderer_Element_TypeClass()
		 * @generated
		 */
		EClass ID_ANFORDERER_ELEMENT_TYPE_CLASS = eINSTANCE.getID_Anforderer_Element_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Anforderung_TypeClassImpl <em>ID Anforderung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Anforderung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Anforderung_TypeClass()
		 * @generated
		 */
		EClass ID_ANFORDERUNG_TYPE_CLASS = eINSTANCE.getID_Anforderung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Anhang_ohne_Proxy_TypeClassImpl <em>ID Anhang ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Anhang_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Anhang_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_ANHANG_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Anhang_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Anhang_TypeClassImpl <em>ID Anhang Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Anhang_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Anhang_TypeClass()
		 * @generated
		 */
		EClass ID_ANHANG_TYPE_CLASS = eINSTANCE.getID_Anhang_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Anschluss_Element_TypeClassImpl <em>ID Anschluss Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Anschluss_Element_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Anschluss_Element_TypeClass()
		 * @generated
		 */
		EClass ID_ANSCHLUSS_ELEMENT_TYPE_CLASS = eINSTANCE.getID_Anschluss_Element_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClassImpl <em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Aussenelementansteuerung_TypeClassImpl <em>ID Aussenelementansteuerung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Aussenelementansteuerung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Aussenelementansteuerung_TypeClass()
		 * @generated
		 */
		EClass ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS = eINSTANCE.getID_Aussenelementansteuerung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bahnsteig_Anlage_TypeClassImpl <em>ID Bahnsteig Anlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bahnsteig_Anlage_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bahnsteig_Anlage_TypeClass()
		 * @generated
		 */
		EClass ID_BAHNSTEIG_ANLAGE_TYPE_CLASS = eINSTANCE.getID_Bahnsteig_Anlage_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bahnsteig_Kante_ohne_Proxy_TypeClassImpl <em>ID Bahnsteig Kante ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bahnsteig_Kante_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bahnsteig_Kante_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Bahnsteig_Kante_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bahnsteig_Kante_TypeClassImpl <em>ID Bahnsteig Kante Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bahnsteig_Kante_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bahnsteig_Kante_TypeClass()
		 * @generated
		 */
		EClass ID_BAHNSTEIG_KANTE_TYPE_CLASS = eINSTANCE.getID_Bahnsteig_Kante_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Balise_ohne_Proxy_TypeClassImpl <em>ID Balise ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Balise_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Balise_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_BALISE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Balise_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Balise_TypeClassImpl <em>ID Balise Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Balise_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Balise_TypeClass()
		 * @generated
		 */
		EClass ID_BALISE_TYPE_CLASS = eINSTANCE.getID_Balise_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Basis_Objekt_TypeClassImpl <em>ID Basis Objekt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Basis_Objekt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Basis_Objekt_TypeClass()
		 * @generated
		 */
		EClass ID_BASIS_OBJEKT_TYPE_CLASS = eINSTANCE.getID_Basis_Objekt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bearbeitungsvermerk_TypeClassImpl <em>ID Bearbeitungsvermerk Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bearbeitungsvermerk_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bearbeitungsvermerk_TypeClass()
		 * @generated
		 */
		EClass ID_BEARBEITUNGSVERMERK_TYPE_CLASS = eINSTANCE.getID_Bearbeitungsvermerk_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Anzeige_Element_TypeClassImpl <em>ID Bedien Anzeige Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Anzeige_Element_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bedien_Anzeige_Element_TypeClass()
		 * @generated
		 */
		EClass ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS = eINSTANCE.getID_Bedien_Anzeige_Element_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Bezirk_TypeClassImpl <em>ID Bedien Bezirk Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Bezirk_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bedien_Bezirk_TypeClass()
		 * @generated
		 */
		EClass ID_BEDIEN_BEZIRK_TYPE_CLASS = eINSTANCE.getID_Bedien_Bezirk_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Einrichtung_Oertlich_TypeClassImpl <em>ID Bedien Einrichtung Oertlich Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Einrichtung_Oertlich_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bedien_Einrichtung_Oertlich_TypeClass()
		 * @generated
		 */
		EClass ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS = eINSTANCE.getID_Bedien_Einrichtung_Oertlich_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Oberflaeche_TypeClassImpl <em>ID Bedien Oberflaeche Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Oberflaeche_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bedien_Oberflaeche_TypeClass()
		 * @generated
		 */
		EClass ID_BEDIEN_OBERFLAECHE_TYPE_CLASS = eINSTANCE.getID_Bedien_Oberflaeche_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Standort_TypeClassImpl <em>ID Bedien Standort Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Standort_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bedien_Standort_TypeClass()
		 * @generated
		 */
		EClass ID_BEDIEN_STANDORT_TYPE_CLASS = eINSTANCE.getID_Bedien_Standort_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Zentrale_TypeClassImpl <em>ID Bedien Zentrale Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Bedien_Zentrale_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Bedien_Zentrale_TypeClass()
		 * @generated
		 */
		EClass ID_BEDIEN_ZENTRALE_TYPE_CLASS = eINSTANCE.getID_Bedien_Zentrale_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Beginn_Bereich_TypeClassImpl <em>ID Beginn Bereich Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Beginn_Bereich_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Beginn_Bereich_TypeClass()
		 * @generated
		 */
		EClass ID_BEGINN_BEREICH_TYPE_CLASS = eINSTANCE.getID_Beginn_Bereich_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Binaerdatei_ohne_Proxy_TypeClassImpl <em>ID Binaerdatei ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Binaerdatei_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Binaerdatei_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_BINAERDATEI_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Binaerdatei_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Block_Anlage_TypeClassImpl <em>ID Block Anlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Block_Anlage_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Block_Anlage_TypeClass()
		 * @generated
		 */
		EClass ID_BLOCK_ANLAGE_TYPE_CLASS = eINSTANCE.getID_Block_Anlage_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Block_Element_TypeClassImpl <em>ID Block Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Block_Element_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Block_Element_TypeClass()
		 * @generated
		 */
		EClass ID_BLOCK_ELEMENT_TYPE_CLASS = eINSTANCE.getID_Block_Element_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Block_Strecke_TypeClassImpl <em>ID Block Strecke Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Block_Strecke_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Block_Strecke_TypeClass()
		 * @generated
		 */
		EClass ID_BLOCK_STRECKE_TYPE_CLASS = eINSTANCE.getID_Block_Strecke_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Anlage_ohne_Proxy_TypeClassImpl <em>ID BUE Anlage ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Anlage_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_Anlage_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_BUE_Anlage_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Anlage_TypeClassImpl <em>ID BUE Anlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Anlage_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_Anlage_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_ANLAGE_TYPE_CLASS = eINSTANCE.getID_BUE_Anlage_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Bedien_Anzeige_Element_TypeClassImpl <em>ID BUE Bedien Anzeige Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Bedien_Anzeige_Element_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_Bedien_Anzeige_Element_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS = eINSTANCE.getID_BUE_Bedien_Anzeige_Element_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Einschaltung_TypeClassImpl <em>ID BUE Einschaltung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Einschaltung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_Einschaltung_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_EINSCHALTUNG_TYPE_CLASS = eINSTANCE.getID_BUE_Einschaltung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Gleisbezogener_Gefahrraum_TypeClassImpl <em>ID BUE Gleisbezogener Gefahrraum Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Gleisbezogener_Gefahrraum_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_Gleisbezogener_Gefahrraum_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS = eINSTANCE.getID_BUE_Gleisbezogener_Gefahrraum_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Schnittstelle_TypeClassImpl <em>ID BUE Schnittstelle Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_Schnittstelle_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_Schnittstelle_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_SCHNITTSTELLE_TYPE_CLASS = eINSTANCE.getID_BUE_Schnittstelle_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_WS_Fstr_Zuordnung_TypeClassImpl <em>ID BUE WS Fstr Zuordnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_BUE_WS_Fstr_Zuordnung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_BUE_WS_Fstr_Zuordnung_TypeClass()
		 * @generated
		 */
		EClass ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS = eINSTANCE.getID_BUE_WS_Fstr_Zuordnung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Datenpunkt_ohne_Proxy_TypeClassImpl <em>ID Datenpunkt ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Datenpunkt_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Datenpunkt_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Datenpunkt_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Datenpunkt_TypeClassImpl <em>ID Datenpunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Datenpunkt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Datenpunkt_TypeClass()
		 * @generated
		 */
		EClass ID_DATENPUNKT_TYPE_CLASS = eINSTANCE.getID_Datenpunkt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_DP_Bezugspunkt_TypeClassImpl <em>ID DP Bezugspunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_DP_Bezugspunkt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_DP_Bezugspunkt_TypeClass()
		 * @generated
		 */
		EClass ID_DP_BEZUGSPUNKT_TYPE_CLASS = eINSTANCE.getID_DP_Bezugspunkt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Einschaltpunkt_TypeClassImpl <em>ID Einschaltpunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Einschaltpunkt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Einschaltpunkt_TypeClass()
		 * @generated
		 */
		EClass ID_EINSCHALTPUNKT_TYPE_CLASS = eINSTANCE.getID_Einschaltpunkt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Element_Grenze_TypeClassImpl <em>ID Element Grenze Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Element_Grenze_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Element_Grenze_TypeClass()
		 * @generated
		 */
		EClass ID_ELEMENT_GRENZE_TYPE_CLASS = eINSTANCE.getID_Element_Grenze_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Element_TypeClassImpl <em>ID Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Element_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Element_TypeClass()
		 * @generated
		 */
		EClass ID_ELEMENT_TYPE_CLASS = eINSTANCE.getID_Element_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Element_Unterbringung_TypeClassImpl <em>ID Element Unterbringung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Element_Unterbringung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Element_Unterbringung_TypeClass()
		 * @generated
		 */
		EClass ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS = eINSTANCE.getID_Element_Unterbringung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Energie_Eingang_TypeClassImpl <em>ID Energie Eingang Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Energie_Eingang_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Energie_Eingang_TypeClass()
		 * @generated
		 */
		EClass ID_ENERGIE_EINGANG_TYPE_CLASS = eINSTANCE.getID_Energie_Eingang_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Energie_Primaer_TypeClassImpl <em>ID Energie Primaer Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Energie_Primaer_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Energie_Primaer_TypeClass()
		 * @generated
		 */
		EClass ID_ENERGIE_PRIMAER_TYPE_CLASS = eINSTANCE.getID_Energie_Primaer_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ESTW_Zentraleinheit_TypeClassImpl <em>ID ESTW Zentraleinheit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ESTW_Zentraleinheit_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ESTW_Zentraleinheit_TypeClass()
		 * @generated
		 */
		EClass ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS = eINSTANCE.getID_ESTW_Zentraleinheit_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ETCS_Knoten_ohne_Proxy_TypeClassImpl <em>ID ETCS Knoten ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ETCS_Knoten_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ETCS_Knoten_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_ETCS_Knoten_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ETCS_Knoten_TypeClassImpl <em>ID ETCS Knoten Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ETCS_Knoten_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ETCS_Knoten_TypeClass()
		 * @generated
		 */
		EClass ID_ETCS_KNOTEN_TYPE_CLASS = eINSTANCE.getID_ETCS_Knoten_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_EV_Modul_TypeClassImpl <em>ID EV Modul Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_EV_Modul_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_EV_Modul_TypeClass()
		 * @generated
		 */
		EClass ID_EV_MODUL_TYPE_CLASS = eINSTANCE.getID_EV_Modul_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fachtelegramm_TypeClassImpl <em>ID Fachtelegramm Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fachtelegramm_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fachtelegramm_TypeClass()
		 * @generated
		 */
		EClass ID_FACHTELEGRAMM_TYPE_CLASS = eINSTANCE.getID_Fachtelegramm_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fla_Schutz_TypeClassImpl <em>ID Fla Schutz Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fla_Schutz_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fla_Schutz_TypeClass()
		 * @generated
		 */
		EClass ID_FLA_SCHUTZ_TYPE_CLASS = eINSTANCE.getID_Fla_Schutz_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Anlage_Rangier_Frei_TypeClassImpl <em>ID FMA Anlage Rangier Frei Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Anlage_Rangier_Frei_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_FMA_Anlage_Rangier_Frei_TypeClass()
		 * @generated
		 */
		EClass ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS = eINSTANCE.getID_FMA_Anlage_Rangier_Frei_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Anlage_TypeClassImpl <em>ID FMA Anlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Anlage_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_FMA_Anlage_TypeClass()
		 * @generated
		 */
		EClass ID_FMA_ANLAGE_TYPE_CLASS = eINSTANCE.getID_FMA_Anlage_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Element_TypeClassImpl <em>ID FMA Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Element_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_FMA_Element_TypeClass()
		 * @generated
		 */
		EClass ID_FMA_ELEMENT_TYPE_CLASS = eINSTANCE.getID_FMA_Element_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Komponente_TypeClassImpl <em>ID FMA Komponente Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_FMA_Komponente_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_FMA_Komponente_TypeClass()
		 * @generated
		 */
		EClass ID_FMA_KOMPONENTE_TYPE_CLASS = eINSTANCE.getID_FMA_Komponente_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fortschaltung_Start_TypeClassImpl <em>ID Fortschaltung Start Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fortschaltung_Start_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fortschaltung_Start_TypeClass()
		 * @generated
		 */
		EClass ID_FORTSCHALTUNG_START_TYPE_CLASS = eINSTANCE.getID_Fortschaltung_Start_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Aneinander_TypeClassImpl <em>ID Fstr Aneinander Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Aneinander_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fstr_Aneinander_TypeClass()
		 * @generated
		 */
		EClass ID_FSTR_ANEINANDER_TYPE_CLASS = eINSTANCE.getID_Fstr_Aneinander_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Ausschluss_Besonders_TypeClassImpl <em>ID Fstr Ausschluss Besonders Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Ausschluss_Besonders_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fstr_Ausschluss_Besonders_TypeClass()
		 * @generated
		 */
		EClass ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS = eINSTANCE.getID_Fstr_Ausschluss_Besonders_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_DWeg_TypeClassImpl <em>ID Fstr DWeg Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_DWeg_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fstr_DWeg_TypeClass()
		 * @generated
		 */
		EClass ID_FSTR_DWEG_TYPE_CLASS = eINSTANCE.getID_Fstr_DWeg_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Fahrweg_TypeClassImpl <em>ID Fstr Fahrweg Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Fahrweg_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fstr_Fahrweg_TypeClass()
		 * @generated
		 */
		EClass ID_FSTR_FAHRWEG_TYPE_CLASS = eINSTANCE.getID_Fstr_Fahrweg_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Zug_Rangier_TypeClassImpl <em>ID Fstr Zug Rangier Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Fstr_Zug_Rangier_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Fstr_Zug_Rangier_TypeClass()
		 * @generated
		 */
		EClass ID_FSTR_ZUG_RANGIER_TYPE_CLASS = eINSTANCE.getID_Fstr_Zug_Rangier_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_FT_Anschaltbedingung_TypeClassImpl <em>ID FT Anschaltbedingung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_FT_Anschaltbedingung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_FT_Anschaltbedingung_TypeClass()
		 * @generated
		 */
		EClass ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS = eINSTANCE.getID_FT_Anschaltbedingung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_FT_Fahrweg_Teil_TypeClassImpl <em>ID FT Fahrweg Teil Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_FT_Fahrweg_Teil_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_FT_Fahrweg_Teil_TypeClass()
		 * @generated
		 */
		EClass ID_FT_FAHRWEG_TEIL_TYPE_CLASS = eINSTANCE.getID_FT_Fahrweg_Teil_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Art_TypeClassImpl <em>ID GEO Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_GEO_Art_TypeClass()
		 * @generated
		 */
		EClass ID_GEO_ART_TYPE_CLASS = eINSTANCE.getID_GEO_Art_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Knoten_TypeClassImpl <em>ID GEO Knoten Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Knoten_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_GEO_Knoten_TypeClass()
		 * @generated
		 */
		EClass ID_GEO_KNOTEN_TYPE_CLASS = eINSTANCE.getID_GEO_Knoten_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Punkt_ohne_Proxy_TypeClassImpl <em>ID GEO Punkt ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Punkt_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_GEO_Punkt_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_GEO_Punkt_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Punkt_TypeClassImpl <em>ID GEO Punkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_GEO_Punkt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_GEO_Punkt_TypeClass()
		 * @generated
		 */
		EClass ID_GEO_PUNKT_TYPE_CLASS = eINSTANCE.getID_GEO_Punkt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Geraet_Programmiert_TypeClassImpl <em>ID Geraet Programmiert Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Geraet_Programmiert_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Geraet_Programmiert_TypeClass()
		 * @generated
		 */
		EClass ID_GERAET_PROGRAMMIERT_TYPE_CLASS = eINSTANCE.getID_Geraet_Programmiert_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_GFR_Anlage_ohne_Proxy_TypeClassImpl <em>ID GFR Anlage ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_GFR_Anlage_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_GFR_Anlage_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_GFR_Anlage_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Gleis_Abschnitt_TypeClassImpl <em>ID Gleis Abschnitt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Gleis_Abschnitt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Gleis_Abschnitt_TypeClass()
		 * @generated
		 */
		EClass ID_GLEIS_ABSCHNITT_TYPE_CLASS = eINSTANCE.getID_Gleis_Abschnitt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Gleis_Bezeichnung_TypeClassImpl <em>ID Gleis Bezeichnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Gleis_Bezeichnung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Gleis_Bezeichnung_TypeClass()
		 * @generated
		 */
		EClass ID_GLEIS_BEZEICHNUNG_TYPE_CLASS = eINSTANCE.getID_Gleis_Bezeichnung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Grenzzeichen_TypeClassImpl <em>ID Grenzzeichen Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Grenzzeichen_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Grenzzeichen_TypeClass()
		 * @generated
		 */
		EClass ID_GRENZZEICHEN_TYPE_CLASS = eINSTANCE.getID_Grenzzeichen_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Handschalt_Wirkfunktion_TypeClassImpl <em>ID Handschalt Wirkfunktion Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Handschalt_Wirkfunktion_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Handschalt_Wirkfunktion_TypeClass()
		 * @generated
		 */
		EClass ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS = eINSTANCE.getID_Handschalt_Wirkfunktion_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Hoehenpunkt_TypeClassImpl <em>ID Hoehenpunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Hoehenpunkt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Hoehenpunkt_TypeClass()
		 * @generated
		 */
		EClass ID_HOEHENPUNKT_TYPE_CLASS = eINSTANCE.getID_Hoehenpunkt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Information_Eingang_TypeClassImpl <em>ID Information Eingang Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Information_Eingang_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Information_Eingang_TypeClass()
		 * @generated
		 */
		EClass ID_INFORMATION_EINGANG_TYPE_CLASS = eINSTANCE.getID_Information_Eingang_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Information_Primaer_TypeClassImpl <em>ID Information Primaer Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Information_Primaer_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Information_Primaer_TypeClass()
		 * @generated
		 */
		EClass ID_INFORMATION_PRIMAER_TYPE_CLASS = eINSTANCE.getID_Information_Primaer_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Anlage_ohne_Proxy_TypeClassImpl <em>ID LEU Anlage ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Anlage_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_LEU_Anlage_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_LEU_Anlage_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Anlage_TypeClassImpl <em>ID LEU Anlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Anlage_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_LEU_Anlage_TypeClass()
		 * @generated
		 */
		EClass ID_LEU_ANLAGE_TYPE_CLASS = eINSTANCE.getID_LEU_Anlage_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Bezugspunkt_TypeClassImpl <em>ID LEU Bezugspunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Bezugspunkt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_LEU_Bezugspunkt_TypeClass()
		 * @generated
		 */
		EClass ID_LEU_BEZUGSPUNKT_TYPE_CLASS = eINSTANCE.getID_LEU_Bezugspunkt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Schaltkasten_ohne_Proxy_TypeClassImpl <em>ID LEU Schaltkasten ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_LEU_Schaltkasten_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_LEU_Schaltkasten_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_LEU_Schaltkasten_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_LO_Einbau_TypeClassImpl <em>ID LO Einbau Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_LO_Einbau_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_LO_Einbau_TypeClass()
		 * @generated
		 */
		EClass ID_LO_EINBAU_TYPE_CLASS = eINSTANCE.getID_LO_Einbau_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Markante_Stelle_TypeClassImpl <em>ID Markante Stelle Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Markante_Stelle_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Markante_Stelle_TypeClass()
		 * @generated
		 */
		EClass ID_MARKANTE_STELLE_TYPE_CLASS = eINSTANCE.getID_Markante_Stelle_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Markanter_Punkt_TypeClassImpl <em>ID Markanter Punkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Markanter_Punkt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Markanter_Punkt_TypeClass()
		 * @generated
		 */
		EClass ID_MARKANTER_PUNKT_TYPE_CLASS = eINSTANCE.getID_Markanter_Punkt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_NB_Element_TypeClassImpl <em>ID NB Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_NB_Element_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_NB_Element_TypeClass()
		 * @generated
		 */
		EClass ID_NB_ELEMENT_TYPE_CLASS = eINSTANCE.getID_NB_Element_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_NB_TypeClassImpl <em>ID NB Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_NB_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_NB_TypeClass()
		 * @generated
		 */
		EClass ID_NB_TYPE_CLASS = eINSTANCE.getID_NB_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_NB_Zone_TypeClassImpl <em>ID NB Zone Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_NB_Zone_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_NB_Zone_TypeClass()
		 * @generated
		 */
		EClass ID_NB_ZONE_TYPE_CLASS = eINSTANCE.getID_NB_Zone_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Oertlichkeit_Proxy_TypeClassImpl <em>ID Oertlichkeit Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Oertlichkeit_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Oertlichkeit_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_OERTLICHKEIT_PROXY_TYPE_CLASS = eINSTANCE.getID_Oertlichkeit_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Oertlichkeit_TypeClassImpl <em>ID Oertlichkeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Oertlichkeit_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Oertlichkeit_TypeClass()
		 * @generated
		 */
		EClass ID_OERTLICHKEIT_TYPE_CLASS = eINSTANCE.getID_Oertlichkeit_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_PlanPro_Schnittstelle_TypeClassImpl <em>ID Plan Pro Schnittstelle Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_PlanPro_Schnittstelle_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_PlanPro_Schnittstelle_TypeClass()
		 * @generated
		 */
		EClass ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS = eINSTANCE.getID_PlanPro_Schnittstelle_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Planung_Einzel_TypeClassImpl <em>ID Planung Einzel Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Planung_Einzel_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Planung_Einzel_TypeClass()
		 * @generated
		 */
		EClass ID_PLANUNG_EINZEL_TYPE_CLASS = eINSTANCE.getID_Planung_Einzel_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Planungsgrundlage_TypeClassImpl <em>ID Planungsgrundlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Planungsgrundlage_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Planungsgrundlage_TypeClass()
		 * @generated
		 */
		EClass ID_PLANUNGSGRUNDLAGE_TYPE_CLASS = eINSTANCE.getID_Planungsgrundlage_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_Bezugspunkt_TypeClassImpl <em>ID PZB Element Bezugspunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_Bezugspunkt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_Bezugspunkt_TypeClass()
		 * @generated
		 */
		EClass ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS = eINSTANCE.getID_PZB_Element_Bezugspunkt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_Mitnutzung_TypeClassImpl <em>ID PZB Element Mitnutzung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_Mitnutzung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_Mitnutzung_TypeClass()
		 * @generated
		 */
		EClass ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS = eINSTANCE.getID_PZB_Element_Mitnutzung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_TypeClassImpl <em>ID PZB Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_TypeClass()
		 * @generated
		 */
		EClass ID_PZB_ELEMENT_TYPE_CLASS = eINSTANCE.getID_PZB_Element_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_Zuordnung_TypeClassImpl <em>ID PZB Element Zuordnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_PZB_Element_Zuordnung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_PZB_Element_Zuordnung_TypeClass()
		 * @generated
		 */
		EClass ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS = eINSTANCE.getID_PZB_Element_Zuordnung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Quellelement_TypeClassImpl <em>ID Quellelement Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Quellelement_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Quellelement_TypeClass()
		 * @generated
		 */
		EClass ID_QUELLELEMENT_TYPE_CLASS = eINSTANCE.getID_Quellelement_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_RBC_TypeClassImpl <em>ID RBC Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_RBC_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_RBC_TypeClass()
		 * @generated
		 */
		EClass ID_RBC_TYPE_CLASS = eINSTANCE.getID_RBC_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Regelzeichnung_TypeClassImpl <em>ID Regelzeichnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Regelzeichnung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Regelzeichnung_TypeClass()
		 * @generated
		 */
		EClass ID_REGELZEICHNUNG_TYPE_CLASS = eINSTANCE.getID_Regelzeichnung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Schalter_TypeClassImpl <em>ID Schalter Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Schalter_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Schalter_TypeClass()
		 * @generated
		 */
		EClass ID_SCHALTER_TYPE_CLASS = eINSTANCE.getID_Schalter_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Schaltmittel_Zuordnung_TypeClassImpl <em>ID Schaltmittel Zuordnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Schaltmittel_Zuordnung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Schaltmittel_Zuordnung_TypeClass()
		 * @generated
		 */
		EClass ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS = eINSTANCE.getID_Schaltmittel_Zuordnung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Schlosskombination_TypeClassImpl <em>ID Schlosskombination Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Schlosskombination_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Schlosskombination_TypeClass()
		 * @generated
		 */
		EClass ID_SCHLOSSKOMBINATION_TYPE_CLASS = eINSTANCE.getID_Schlosskombination_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Schluessel_TypeClassImpl <em>ID Schluessel Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Schluessel_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Schluessel_TypeClass()
		 * @generated
		 */
		EClass ID_SCHLUESSEL_TYPE_CLASS = eINSTANCE.getID_Schluessel_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Schluesselsperre_TypeClassImpl <em>ID Schluesselsperre Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Schluesselsperre_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Schluesselsperre_TypeClass()
		 * @generated
		 */
		EClass ID_SCHLUESSELSPERRE_TYPE_CLASS = eINSTANCE.getID_Schluesselsperre_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Befestigung_TypeClassImpl <em>ID Signal Befestigung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Befestigung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_Befestigung_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS = eINSTANCE.getID_Signal_Befestigung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Fank_TypeClassImpl <em>ID Signal Fank Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Fank_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_Fank_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_FANK_TYPE_CLASS = eINSTANCE.getID_Signal_Fank_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Gleisbezechnung_TypeClassImpl <em>ID Signal Gleisbezechnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Gleisbezechnung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_Gleisbezechnung_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS = eINSTANCE.getID_Signal_Gleisbezechnung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_ohne_Proxy_TypeClassImpl <em>ID Signal ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Signal_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Rahmen_TypeClassImpl <em>ID Signal Rahmen Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Rahmen_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_Rahmen_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_RAHMEN_TYPE_CLASS = eINSTANCE.getID_Signal_Rahmen_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Signalbegriff_TypeClassImpl <em>ID Signal Signalbegriff Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Signalbegriff_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_Signalbegriff_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS = eINSTANCE.getID_Signal_Signalbegriff_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Start_TypeClassImpl <em>ID Signal Start Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_Start_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_Start_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_START_TYPE_CLASS = eINSTANCE.getID_Signal_Start_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_TypeClassImpl <em>ID Signal Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Signal_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Signal_TypeClass()
		 * @generated
		 */
		EClass ID_SIGNAL_TYPE_CLASS = eINSTANCE.getID_Signal_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Sonderanlage_TypeClassImpl <em>ID Sonderanlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Sonderanlage_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Sonderanlage_TypeClass()
		 * @generated
		 */
		EClass ID_SONDERANLAGE_TYPE_CLASS = eINSTANCE.getID_Sonderanlage_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Stellelement_TypeClassImpl <em>ID Stellelement Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Stellelement_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Stellelement_TypeClass()
		 * @generated
		 */
		EClass ID_STELLELEMENT_TYPE_CLASS = eINSTANCE.getID_Stellelement_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Stellwerk_TypeClassImpl <em>ID Stellwerk Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Stellwerk_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Stellwerk_TypeClass()
		 * @generated
		 */
		EClass ID_STELLWERK_TYPE_CLASS = eINSTANCE.getID_Stellwerk_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Strecke_Punkt_TypeClassImpl <em>ID Strecke Punkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Strecke_Punkt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Strecke_Punkt_TypeClass()
		 * @generated
		 */
		EClass ID_STRECKE_PUNKT_TYPE_CLASS = eINSTANCE.getID_Strecke_Punkt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Strecke_TypeClassImpl <em>ID Strecke Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Strecke_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Strecke_TypeClass()
		 * @generated
		 */
		EClass ID_STRECKE_TYPE_CLASS = eINSTANCE.getID_Strecke_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Technischer_Punkt_TypeClassImpl <em>ID Technischer Punkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Technischer_Punkt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Technischer_Punkt_TypeClass()
		 * @generated
		 */
		EClass ID_TECHNISCHER_PUNKT_TYPE_CLASS = eINSTANCE.getID_Technischer_Punkt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_TOP_Kante_ohne_Proxy_TypeClassImpl <em>ID TOP Kante ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_TOP_Kante_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_TOP_Kante_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_TOP_Kante_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_TOP_Kante_TypeClassImpl <em>ID TOP Kante Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_TOP_Kante_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_TOP_Kante_TypeClass()
		 * @generated
		 */
		EClass ID_TOP_KANTE_TYPE_CLASS = eINSTANCE.getID_TOP_Kante_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_TOP_Knoten_TypeClassImpl <em>ID TOP Knoten Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_TOP_Knoten_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_TOP_Knoten_TypeClass()
		 * @generated
		 */
		EClass ID_TOP_KNOTEN_TYPE_CLASS = eINSTANCE.getID_TOP_Knoten_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Trasse_Kante_TypeClassImpl <em>ID Trasse Kante Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Trasse_Kante_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Trasse_Kante_TypeClass()
		 * @generated
		 */
		EClass ID_TRASSE_KANTE_TYPE_CLASS = eINSTANCE.getID_Trasse_Kante_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Trasse_Knoten_TypeClassImpl <em>ID Trasse Knoten Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Trasse_Knoten_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Trasse_Knoten_TypeClass()
		 * @generated
		 */
		EClass ID_TRASSE_KNOTEN_TYPE_CLASS = eINSTANCE.getID_Trasse_Knoten_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Ueberhoehung_TypeClassImpl <em>ID Ueberhoehung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Ueberhoehung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Ueberhoehung_TypeClass()
		 * @generated
		 */
		EClass ID_UEBERHOEHUNG_TYPE_CLASS = eINSTANCE.getID_Ueberhoehung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Uebertragungsweg_Nach_TypeClassImpl <em>ID Uebertragungsweg Nach Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Uebertragungsweg_Nach_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Uebertragungsweg_Nach_TypeClass()
		 * @generated
		 */
		EClass ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS = eINSTANCE.getID_Uebertragungsweg_Nach_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Uebertragungsweg_Von_TypeClassImpl <em>ID Uebertragungsweg Von Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Uebertragungsweg_Von_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Uebertragungsweg_Von_TypeClass()
		 * @generated
		 */
		EClass ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS = eINSTANCE.getID_Uebertragungsweg_Von_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Umfahrpunkt_TypeClassImpl <em>ID Umfahrpunkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Umfahrpunkt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Umfahrpunkt_TypeClass()
		 * @generated
		 */
		EClass ID_UMFAHRPUNKT_TYPE_CLASS = eINSTANCE.getID_Umfahrpunkt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Unterbringung_ohne_Proxy_TypeClassImpl <em>ID Unterbringung ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Unterbringung_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Unterbringung_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_Unterbringung_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Unterbringung_Technik_TypeClassImpl <em>ID Unterbringung Technik Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Unterbringung_Technik_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Unterbringung_Technik_TypeClass()
		 * @generated
		 */
		EClass ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS = eINSTANCE.getID_Unterbringung_Technik_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Unterbringung_TypeClassImpl <em>ID Unterbringung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Unterbringung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Unterbringung_TypeClass()
		 * @generated
		 */
		EClass ID_UNTERBRINGUNG_TYPE_CLASS = eINSTANCE.getID_Unterbringung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Ur_Objekt_TypeClassImpl <em>ID Ur Objekt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Ur_Objekt_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Ur_Objekt_TypeClass()
		 * @generated
		 */
		EClass ID_UR_OBJEKT_TYPE_CLASS = eINSTANCE.getID_Ur_Objekt_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Verknuepftes_Element_TypeClassImpl <em>ID Verknuepftes Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Verknuepftes_Element_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Verknuepftes_Element_TypeClass()
		 * @generated
		 */
		EClass ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS = eINSTANCE.getID_Verknuepftes_Element_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Anlage_ohne_Proxy_TypeClassImpl <em>ID WKr Anlage ohne Proxy Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Anlage_ohne_Proxy_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Anlage_ohne_Proxy_TypeClass()
		 * @generated
		 */
		EClass ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS = eINSTANCE.getID_W_Kr_Anlage_ohne_Proxy_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Anlage_TypeClassImpl <em>ID WKr Anlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Anlage_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Anlage_TypeClass()
		 * @generated
		 */
		EClass ID_WKR_ANLAGE_TYPE_CLASS = eINSTANCE.getID_W_Kr_Anlage_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Gsp_Element_TypeClassImpl <em>ID WKr Gsp Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Gsp_Element_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Gsp_Element_TypeClass()
		 * @generated
		 */
		EClass ID_WKR_GSP_ELEMENT_TYPE_CLASS = eINSTANCE.getID_W_Kr_Gsp_Element_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Gsp_Komponente_TypeClassImpl <em>ID WKr Gsp Komponente Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_W_Kr_Gsp_Komponente_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_W_Kr_Gsp_Komponente_TypeClass()
		 * @generated
		 */
		EClass ID_WKR_GSP_KOMPONENTE_TYPE_CLASS = eINSTANCE.getID_W_Kr_Gsp_Komponente_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Weichenlaufkette_TypeClassImpl <em>ID Weichenlaufkette Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Weichenlaufkette_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Weichenlaufkette_TypeClass()
		 * @generated
		 */
		EClass ID_WEICHENLAUFKETTE_TYPE_CLASS = eINSTANCE.getID_Weichenlaufkette_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Ziel_TypeClassImpl <em>ID Ziel Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Ziel_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Ziel_TypeClass()
		 * @generated
		 */
		EClass ID_ZIEL_TYPE_CLASS = eINSTANCE.getID_Ziel_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_DLP_Fstr_TypeClassImpl <em>ID ZL DLP Fstr Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_DLP_Fstr_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZL_DLP_Fstr_TypeClass()
		 * @generated
		 */
		EClass ID_ZL_DLP_FSTR_TYPE_CLASS = eINSTANCE.getID_ZL_DLP_Fstr_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_Fstr_TypeClassImpl <em>ID ZL Fstr Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_Fstr_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZL_Fstr_TypeClass()
		 * @generated
		 */
		EClass ID_ZL_FSTR_TYPE_CLASS = eINSTANCE.getID_ZL_Fstr_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_Signalgruppe_TypeClassImpl <em>ID ZL Signalgruppe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_Signalgruppe_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZL_Signalgruppe_TypeClass()
		 * @generated
		 */
		EClass ID_ZL_SIGNALGRUPPE_TYPE_CLASS = eINSTANCE.getID_ZL_Signalgruppe_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_TypeClassImpl <em>ID ZL Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZL_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZL_TypeClass()
		 * @generated
		 */
		EClass ID_ZL_TYPE_CLASS = eINSTANCE.getID_ZL_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZLV_Bus_TypeClassImpl <em>ID ZLV Bus Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZLV_Bus_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZLV_Bus_TypeClass()
		 * @generated
		 */
		EClass ID_ZLV_BUS_TYPE_CLASS = eINSTANCE.getID_ZLV_Bus_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Anzeigefeld_Anstoss_TypeClassImpl <em>ID ZN Anzeigefeld Anstoss Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Anzeigefeld_Anstoss_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZN_Anzeigefeld_Anstoss_TypeClass()
		 * @generated
		 */
		EClass ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS = eINSTANCE.getID_ZN_Anzeigefeld_Anstoss_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Anzeigefeld_TypeClassImpl <em>ID ZN Anzeigefeld Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Anzeigefeld_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZN_Anzeigefeld_TypeClass()
		 * @generated
		 */
		EClass ID_ZN_ANZEIGEFELD_TYPE_CLASS = eINSTANCE.getID_ZN_Anzeigefeld_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Fortschalt_Kriterium_TypeClassImpl <em>ID ZN Fortschalt Kriterium Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Fortschalt_Kriterium_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZN_Fortschalt_Kriterium_TypeClass()
		 * @generated
		 */
		EClass ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS = eINSTANCE.getID_ZN_Fortschalt_Kriterium_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_TypeClassImpl <em>ID ZN Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZN_TypeClass()
		 * @generated
		 */
		EClass ID_ZN_TYPE_CLASS = eINSTANCE.getID_ZN_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Unterstation_TypeClassImpl <em>ID ZN Unterstation Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_Unterstation_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZN_Unterstation_TypeClass()
		 * @generated
		 */
		EClass ID_ZN_UNTERSTATION_TYPE_CLASS = eINSTANCE.getID_ZN_Unterstation_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_ZBS_TypeClassImpl <em>ID ZN ZBS Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_ZN_ZBS_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_ZN_ZBS_TypeClass()
		 * @generated
		 */
		EClass ID_ZN_ZBS_TYPE_CLASS = eINSTANCE.getID_ZN_ZBS_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Zugeinwirkung_TypeClassImpl <em>ID Zugeinwirkung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Zugeinwirkung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Zugeinwirkung_TypeClass()
		 * @generated
		 */
		EClass ID_ZUGEINWIRKUNG_TYPE_CLASS = eINSTANCE.getID_Zugeinwirkung_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Verweise.impl.ID_Zweites_Haltfallkriterium_TypeClassImpl <em>ID Zweites Haltfallkriterium Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Verweise.impl.ID_Zweites_Haltfallkriterium_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl#getID_Zweites_Haltfallkriterium_TypeClass()
		 * @generated
		 */
		EClass ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS = eINSTANCE.getID_Zweites_Haltfallkriterium_TypeClass();

	}

} //VerweisePackage
