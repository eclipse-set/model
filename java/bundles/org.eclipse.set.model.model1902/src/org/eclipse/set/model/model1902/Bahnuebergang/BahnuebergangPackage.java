/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage;

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
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangFactory
 * @model kind="package"
 * @generated
 */
public interface BahnuebergangPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Bahnuebergang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Bahnuebergang/1.9.0.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsBahnuebergang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BahnuebergangPackage eINSTANCE = org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Abstand_Gehweg_Fahrbahn_TypeClassImpl <em>Abstand Gehweg Fahrbahn Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Abstand_Gehweg_Fahrbahn_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getAbstand_Gehweg_Fahrbahn_TypeClass()
	 * @generated
	 */
	int ABSTAND_GEHWEG_FAHRBAHN_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTAND_GEHWEG_FAHRBAHN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTAND_GEHWEG_FAHRBAHN_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstand Gehweg Fahrbahn Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTAND_GEHWEG_FAHRBAHN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstand Gehweg Fahrbahn Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTAND_GEHWEG_FAHRBAHN_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Akustik_Fussgaenger_TypeClassImpl <em>Akustik Fussgaenger Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Akustik_Fussgaenger_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getAkustik_Fussgaenger_TypeClass()
	 * @generated
	 */
	int AKUSTIK_FUSSGAENGER_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKUSTIK_FUSSGAENGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKUSTIK_FUSSGAENGER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Akustik Fussgaenger Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKUSTIK_FUSSGAENGER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Akustik Fussgaenger Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKUSTIK_FUSSGAENGER_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Ausrichtung_TypeClassImpl <em>Ausrichtung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Ausrichtung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getAusrichtung_TypeClass()
	 * @generated
	 */
	int AUSRICHTUNG_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSRICHTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSRICHTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ausrichtung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSRICHTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ausrichtung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSRICHTUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Ausrichtung_Winkel_TypeClassImpl <em>Ausrichtung Winkel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Ausrichtung_Winkel_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getAusrichtung_Winkel_TypeClass()
	 * @generated
	 */
	int AUSRICHTUNG_WINKEL_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSRICHTUNG_WINKEL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSRICHTUNG_WINKEL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ausrichtung Winkel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSRICHTUNG_WINKEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ausrichtung Winkel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSRICHTUNG_WINKEL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Auto_Het_TypeClassImpl <em>Auto Het Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Auto_Het_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getAuto_Het_TypeClass()
	 * @generated
	 */
	int AUTO_HET_TYPE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_HET_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_HET_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auto Het Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_HET_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Auto Het Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_HET_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Baulast_TypeClassImpl <em>Baulast Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Baulast_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBaulast_TypeClass()
	 * @generated
	 */
	int BAULAST_TYPE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAULAST_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAULAST_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Baulast Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAULAST_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Baulast Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAULAST_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Baumprofil_TypeClassImpl <em>Baumprofil Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Baumprofil_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBaumprofil_TypeClass()
	 * @generated
	 */
	int BAUMPROFIL_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUMPROFIL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUMPROFIL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Baumprofil Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUMPROFIL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Baumprofil Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUMPROFIL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Beeinflussung_Strassenverkehr_TypeClassImpl <em>Beeinflussung Strassenverkehr Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Beeinflussung_Strassenverkehr_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBeeinflussung_Strassenverkehr_TypeClass()
	 * @generated
	 */
	int BEEINFLUSSUNG_STRASSENVERKEHR_TYPE_CLASS = 7;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEEINFLUSSUNG_STRASSENVERKEHR_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEEINFLUSSUNG_STRASSENVERKEHR_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Beeinflussung Strassenverkehr Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEEINFLUSSUNG_STRASSENVERKEHR_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Beeinflussung Strassenverkehr Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEEINFLUSSUNG_STRASSENVERKEHR_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Bez_Schrankenantrieb_TypeClassImpl <em>Bez Schrankenantrieb Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Bez_Schrankenantrieb_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBez_Schrankenantrieb_TypeClass()
	 * @generated
	 */
	int BEZ_SCHRANKENANTRIEB_TYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_SCHRANKENANTRIEB_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_SCHRANKENANTRIEB_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bez Schrankenantrieb Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_SCHRANKENANTRIEB_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bez Schrankenantrieb Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_SCHRANKENANTRIEB_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Bezeichnung_BUE_GFR_Eckpunkt_TypeClassImpl <em>Bezeichnung BUE GFR Eckpunkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Bezeichnung_BUE_GFR_Eckpunkt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBezeichnung_BUE_GFR_Eckpunkt_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_BUE_GFR_ECKPUNKT_TYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BUE_GFR_ECKPUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BUE_GFR_ECKPUNKT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung BUE GFR Eckpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BUE_GFR_ECKPUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bezeichnung BUE GFR Eckpunkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BUE_GFR_ECKPUNKT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Bezeichnung_GFR_Element_TypeClassImpl <em>Bezeichnung GFR Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Bezeichnung_GFR_Element_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBezeichnung_GFR_Element_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_GFR_ELEMENT_TYPE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_GFR_ELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_GFR_ELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung GFR Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_GFR_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bezeichnung GFR Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_GFR_ELEMENT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Bezeichnung_GFR_Tripelspiegel_TypeClassImpl <em>Bezeichnung GFR Tripelspiegel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Bezeichnung_GFR_Tripelspiegel_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBezeichnung_GFR_Tripelspiegel_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE_CLASS = 11;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung GFR Tripelspiegel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bezeichnung GFR Tripelspiegel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Bezeichnung_Verkehrszeichen_TypeClassImpl <em>Bezeichnung Verkehrszeichen Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Bezeichnung_Verkehrszeichen_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBezeichnung_Verkehrszeichen_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_VERKEHRSZEICHEN_TYPE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_VERKEHRSZEICHEN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_VERKEHRSZEICHEN_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Verkehrszeichen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_VERKEHRSZEICHEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bezeichnung Verkehrszeichen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_VERKEHRSZEICHEN_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Blitzpfeil_TypeClassImpl <em>Blitzpfeil Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Blitzpfeil_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBlitzpfeil_TypeClass()
	 * @generated
	 */
	int BLITZPFEIL_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITZPFEIL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITZPFEIL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blitzpfeil Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITZPFEIL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Blitzpfeil Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITZPFEIL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Abhaengigkeit_Fue_AttributeGroupImpl <em>BUE Abhaengigkeit Fue Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Abhaengigkeit_Fue_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Abhaengigkeit_Fue_AttributeGroup()
	 * @generated
	 */
	int BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Auto Het</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__AUTO_HET = 0;

	/**
	 * The feature id for the '<em><b>Fue Schaltfall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__FUE_SCHALTFALL = 1;

	/**
	 * The feature id for the '<em><b>Stoerhalt Haltfall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_HALTFALL = 2;

	/**
	 * The feature id for the '<em><b>Stoerhalt Merkhinweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_MERKHINWEIS = 3;

	/**
	 * The feature id for the '<em><b>Zeitueberschreitungsmeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__ZEITUEBERSCHREITUNGSMELDUNG = 4;

	/**
	 * The number of structural features of the '<em>BUE Abhaengigkeit Fue Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>BUE Abhaengigkeit Fue Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_AnlageImpl <em>BUE Anlage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_AnlageImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Anlage()
	 * @generated
	 */
	int BUE_ANLAGE = 15;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE__BEZEICHNUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BUE Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE__BUE_ANLAGE_ALLG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDBUE Schnittstelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE__IDBUE_SCHNITTSTELLE = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BUE Anlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BUE Anlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_OPERATION_COUNT = BasisobjektePackage.PUNKT_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_Allg_AttributeGroupImpl <em>BUE Anlage Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	int BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP = 16;

	/**
	 * The feature id for the '<em><b>BUE Bauart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BAUART = 0;

	/**
	 * The feature id for the '<em><b>BUE Buestra</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BUESTRA = 1;

	/**
	 * The feature id for the '<em><b>BUE Mit GFR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_MIT_GFR = 2;

	/**
	 * The feature id for the '<em><b>BUE Sicherungsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSART = 3;

	/**
	 * The feature id for the '<em><b>BUE Strasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_STRASSE = 4;

	/**
	 * The feature id for the '<em><b>BUE Technik</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_TECHNIK = 5;

	/**
	 * The number of structural features of the '<em>BUE Anlage Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>BUE Anlage Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_Fuss_Rad_AttributeGroupImpl <em>BUE Anlage Fuss Rad Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_Fuss_Rad_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Anlage_Fuss_Rad_AttributeGroup()
	 * @generated
	 */
	int BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Fuss Radweg Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_ART = 0;

	/**
	 * The feature id for the '<em><b>Fuss Radweg Seite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_SEITE = 1;

	/**
	 * The number of structural features of the '<em>BUE Anlage Fuss Rad Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BUE Anlage Fuss Rad Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_StrasseImpl <em>BUE Anlage Strasse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_StrasseImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Anlage_Strasse()
	 * @generated
	 */
	int BUE_ANLAGE_STRASSE = 18;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>BUE Anlage Fuss Rad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE__BUE_ANLAGE_FUSS_RAD = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BUE Anlage Strasse Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE__BUE_ANLAGE_STRASSE_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE__IDBUE_ANLAGE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BUE Anlage Strasse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BUE Anlage Strasse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_Strasse_Allg_AttributeGroupImpl <em>BUE Anlage Strasse Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_Strasse_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Anlage_Strasse_Allg_AttributeGroup()
	 * @generated
	 */
	int BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP = 19;

	/**
	 * The feature id for the '<em><b>Baulast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__BAULAST = 0;

	/**
	 * The feature id for the '<em><b>Fahrbahn Befestigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG = 1;

	/**
	 * The feature id for the '<em><b>Fahrbahn Befestigung Gleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG_GLEIS = 2;

	/**
	 * The feature id for the '<em><b>Fahrbahn Breite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BREITE = 3;

	/**
	 * The feature id for the '<em><b>Klassifizierung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KLASSIFIZIERUNG = 4;

	/**
	 * The feature id for the '<em><b>Kreuzungswinkel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KREUZUNGSWINKEL = 5;

	/**
	 * The number of structural features of the '<em>BUE Anlage Strasse Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>BUE Anlage Strasse Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_VImpl <em>BUE Anlage V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_VImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Anlage_V()
	 * @generated
	 */
	int BUE_ANLAGE_V = 20;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_V__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_V__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_V__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_V__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>BUE Anlage VAllg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_V__BUE_ANLAGE_VALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_V__IDBUE_ANLAGE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BUE Anlage V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_V_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BUE Anlage V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_V_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_V_Allg_AttributeGroupImpl <em>BUE Anlage VAllg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_V_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Anlage_V_Allg_AttributeGroup()
	 * @generated
	 */
	int BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP = 21;

	/**
	 * The feature id for the '<em><b>VMax Schiene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_SCHIENE = 0;

	/**
	 * The feature id for the '<em><b>VMax Strasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_STRASSE = 1;

	/**
	 * The feature id for the '<em><b>VMin Fussweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_FUSSWEG = 2;

	/**
	 * The feature id for the '<em><b>VMin Schiene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_SCHIENE = 3;

	/**
	 * The feature id for the '<em><b>VMin Strasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_STRASSE = 4;

	/**
	 * The number of structural features of the '<em>BUE Anlage VAllg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>BUE Anlage VAllg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_AusschaltungImpl <em>BUE Ausschaltung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_AusschaltungImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Ausschaltung()
	 * @generated
	 */
	int BUE_AUSSCHALTUNG = 22;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AUSSCHALTUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AUSSCHALTUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AUSSCHALTUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AUSSCHALTUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDBUE Gleisbez Gefahrraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Ausschaltung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AUSSCHALTUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Ausschaltung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AUSSCHALTUNG_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Bauart_TypeClassImpl <em>BUE Bauart Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Bauart_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Bauart_TypeClass()
	 * @generated
	 */
	int BUE_BAUART_TYPE_CLASS = 23;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BAUART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BAUART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Bauart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BAUART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Bauart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BAUART_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl <em>BUE Bedien Anz Element Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Bedien_Anz_Element_Allg_AttributeGroup()
	 * @generated
	 */
	int BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP = 24;

	/**
	 * The feature id for the '<em><b>BUE Handschalteinrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG = 0;

	/**
	 * The feature id for the '<em><b>ID Bedien Anzeige Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>ID Handschalt Wirkfunktion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION = 2;

	/**
	 * The number of structural features of the '<em>BUE Bedien Anz Element Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BUE Bedien Anz Element Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Bedien_Anzeige_ElementImpl <em>BUE Bedien Anzeige Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Bedien_Anzeige_ElementImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Bedien_Anzeige_Element()
	 * @generated
	 */
	int BUE_BEDIEN_ANZEIGE_ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BEDIEN_ANZEIGE_ELEMENT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BEDIEN_ANZEIGE_ELEMENT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BEDIEN_ANZEIGE_ELEMENT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BEDIEN_ANZEIGE_ELEMENT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>BUE Bedien Anz Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BEDIEN_ANZEIGE_ELEMENT__BUE_BEDIEN_ANZ_ELEMENT_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Bedien Anzeige Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BEDIEN_ANZEIGE_ELEMENT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Bedien Anzeige Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BEDIEN_ANZEIGE_ELEMENT_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Buestra_TypeClassImpl <em>BUE Buestra Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Buestra_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Buestra_TypeClass()
	 * @generated
	 */
	int BUE_BUESTRA_TYPE_CLASS = 26;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BUESTRA_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BUESTRA_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Buestra Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BUESTRA_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Buestra Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_BUESTRA_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Deckendes_Signal_ZuordnungImpl <em>BUE Deckendes Signal Zuordnung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Deckendes_Signal_ZuordnungImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Deckendes_Signal_Zuordnung()
	 * @generated
	 */
	int BUE_DECKENDES_SIGNAL_ZUORDNUNG = 27;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_DECKENDES_SIGNAL_ZUORDNUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_DECKENDES_SIGNAL_ZUORDNUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDBUE Einschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sicherheitsabstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BUE Deckendes Signal Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_DECKENDES_SIGNAL_ZUORDNUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BUE Deckendes Signal Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_DECKENDES_SIGNAL_ZUORDNUNG_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_EinschaltungImpl <em>BUE Einschaltung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_EinschaltungImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Einschaltung()
	 * @generated
	 */
	int BUE_EINSCHALTUNG = 28;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>BUE Einschaltung Hp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG__BUE_EINSCHALTUNG_HP = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BUE Funktionsueberwachung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG__BUE_FUNKTIONSUEBERWACHUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BUE Einschaltung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BUE Einschaltung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Einschaltung_Hp_AttributeGroupImpl <em>BUE Einschaltung Hp Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Einschaltung_Hp_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Einschaltung_Hp_AttributeGroup()
	 * @generated
	 */
	int BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP = 29;

	/**
	 * The feature id for the '<em><b>Einschaltverz Errechnet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_ERRECHNET = 0;

	/**
	 * The feature id for the '<em><b>Einschaltverz Gewaehlt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_GEWAEHLT = 1;

	/**
	 * The feature id for the '<em><b>Kurzzugschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__KURZZUGSCHALTUNG = 2;

	/**
	 * The feature id for the '<em><b>Signalverz Errechnet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_ERRECHNET = 3;

	/**
	 * The feature id for the '<em><b>Signalverz Gewaehlt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_GEWAEHLT = 4;

	/**
	 * The feature id for the '<em><b>Teilvorgabezeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__TEILVORGABEZEIT = 5;

	/**
	 * The number of structural features of the '<em>BUE Einschaltung Hp Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>BUE Einschaltung Hp Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Einschaltung_ZuordnungImpl <em>BUE Einschaltung Zuordnung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Einschaltung_ZuordnungImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Einschaltung_Zuordnung()
	 * @generated
	 */
	int BUE_EINSCHALTUNG_ZUORDNUNG = 30;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_ZUORDNUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_ZUORDNUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_ZUORDNUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_ZUORDNUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDBUE Einschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDBUE Gleisbez Gefahrraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BUE Einschaltung Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_ZUORDNUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BUE Einschaltung Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_EINSCHALTUNG_ZUORDNUNG_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Funktionsueberwachung_TypeClassImpl <em>BUE Funktionsueberwachung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Funktionsueberwachung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Funktionsueberwachung_TypeClass()
	 * @generated
	 */
	int BUE_FUNKTIONSUEBERWACHUNG_TYPE_CLASS = 31;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_FUNKTIONSUEBERWACHUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_FUNKTIONSUEBERWACHUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Funktionsueberwachung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_FUNKTIONSUEBERWACHUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Funktionsueberwachung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_FUNKTIONSUEBERWACHUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Gefahrraum_EckpunktImpl <em>BUE Gefahrraum Eckpunkt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Gefahrraum_EckpunktImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Gefahrraum_Eckpunkt()
	 * @generated
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT = 32;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT__BEZEICHNUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT__IDBUE_ANLAGE = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BUE Gefahrraum Eckpunkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BUE Gefahrraum Eckpunkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT_OPERATION_COUNT = BasisobjektePackage.PUNKT_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupImpl <em>BUE Gefahrraum Eckpunkt Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP = 33;

	/**
	 * The feature id for the '<em><b>Bezeichnung BUEGFR Eckpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BUEGFR_ECKPUNKT = 0;

	/**
	 * The number of structural features of the '<em>BUE Gefahrraum Eckpunkt Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BUE Gefahrraum Eckpunkt Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Gleisbezogener_GefahrraumImpl <em>BUE Gleisbezogener Gefahrraum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Gleisbezogener_GefahrraumImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Gleisbezogener_Gefahrraum()
	 * @generated
	 */
	int BUE_GLEISBEZOGENER_GEFAHRRAUM = 34;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GLEISBEZOGENER_GEFAHRRAUM__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GLEISBEZOGENER_GEFAHRRAUM__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GLEISBEZOGENER_GEFAHRRAUM__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GLEISBEZOGENER_GEFAHRRAUM__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GLEISBEZOGENER_GEFAHRRAUM__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>Ersatzstecker Gleisbezogen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GLEISBEZOGENER_GEFAHRRAUM__ERSATZSTECKER_GLEISBEZOGEN = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gleis Am Bue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GLEISBEZOGENER_GEFAHRRAUM__GLEIS_AM_BUE = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GLEISBEZOGENER_GEFAHRRAUM__IDBUE_ANLAGE = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BUE Gleisbezogener Gefahrraum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GLEISBEZOGENER_GEFAHRRAUM_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BUE Gleisbezogener Gefahrraum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_GLEISBEZOGENER_GEFAHRRAUM_OPERATION_COUNT = BasisobjektePackage.BEREICH_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Handschalteinrichtung_TypeClassImpl <em>BUE Handschalteinrichtung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Handschalteinrichtung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Handschalteinrichtung_TypeClass()
	 * @generated
	 */
	int BUE_HANDSCHALTEINRICHTUNG_TYPE_CLASS = 35;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_HANDSCHALTEINRICHTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_HANDSCHALTEINRICHTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Handschalteinrichtung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_HANDSCHALTEINRICHTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Handschalteinrichtung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_HANDSCHALTEINRICHTUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_KanteImpl <em>BUE Kante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_KanteImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Kante()
	 * @generated
	 */
	int BUE_KANTE = 36;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KANTE__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KANTE__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KANTE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KANTE__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KANTE__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KANTE__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KANTE__IDBUE_ANLAGE = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Kante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KANTE_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Kante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KANTE_OPERATION_COUNT = BasisobjektePackage.PUNKT_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_KreuzungsplanImpl <em>BUE Kreuzungsplan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_KreuzungsplanImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Kreuzungsplan()
	 * @generated
	 */
	int BUE_KREUZUNGSPLAN = 37;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KREUZUNGSPLAN__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KREUZUNGSPLAN__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KREUZUNGSPLAN__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KREUZUNGSPLAN__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>BUE Kreuzungsplan Koordinaten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Anhang Kreuzungsplan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BUE Kreuzungsplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KREUZUNGSPLAN_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BUE Kreuzungsplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KREUZUNGSPLAN_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl <em>BUE Kreuzungsplan Koordinaten Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Kreuzungsplan_Koordinaten_AttributeGroup()
	 * @generated
	 */
	int BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP = 38;

	/**
	 * The feature id for the '<em><b>IDGEO Punkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT = 0;

	/**
	 * The feature id for the '<em><b>Pixel Koordinate X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X = 1;

	/**
	 * The feature id for the '<em><b>Pixel Koordinate Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y = 2;

	/**
	 * The number of structural features of the '<em>BUE Kreuzungsplan Koordinaten Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BUE Kreuzungsplan Koordinaten Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Mit_GFR_TypeClassImpl <em>BUE Mit GFR Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Mit_GFR_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Mit_GFR_TypeClass()
	 * @generated
	 */
	int BUE_MIT_GFR_TYPE_CLASS = 39;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_MIT_GFR_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_MIT_GFR_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Mit GFR Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_MIT_GFR_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Mit GFR Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_MIT_GFR_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Nachlaufzeit_TypeClassImpl <em>BUE Nachlaufzeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Nachlaufzeit_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Nachlaufzeit_TypeClass()
	 * @generated
	 */
	int BUE_NACHLAUFZEIT_TYPE_CLASS = 40;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_NACHLAUFZEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_NACHLAUFZEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Nachlaufzeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_NACHLAUFZEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Nachlaufzeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_NACHLAUFZEIT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Neigung_TypeClassImpl <em>BUE Neigung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Neigung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Neigung_TypeClass()
	 * @generated
	 */
	int BUE_NEIGUNG_TYPE_CLASS = 41;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_NEIGUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_NEIGUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Neigung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_NEIGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Neigung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_NEIGUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_SchnittstelleImpl <em>BUE Schnittstelle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_SchnittstelleImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Schnittstelle()
	 * @generated
	 */
	int BUE_SCHNITTSTELLE = 42;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>BUE Abhaengigkeit Fue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE__BUE_ABHAENGIGKEIT_FUE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BUE Schnittstelle Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE__BUE_SCHNITTSTELLE_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Stellelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE__ID_STELLELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BUE Schnittstelle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BUE Schnittstelle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Schnittstelle_Allg_AttributeGroupImpl <em>BUE Schnittstelle Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Schnittstelle_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Schnittstelle_Allg_AttributeGroup()
	 * @generated
	 */
	int BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP = 43;

	/**
	 * The feature id for the '<em><b>BUE Nachlaufzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_NACHLAUFZEIT = 0;

	/**
	 * The feature id for the '<em><b>BUE Vorlaufzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_VORLAUFZEIT = 1;

	/**
	 * The feature id for the '<em><b>Hp Ersatzstecker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__HP_ERSATZSTECKER = 2;

	/**
	 * The feature id for the '<em><b>LFUE Impuls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__LFUE_IMPULS = 3;

	/**
	 * The number of structural features of the '<em>BUE Schnittstelle Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>BUE Schnittstelle Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Sicherungsart_TypeClassImpl <em>BUE Sicherungsart Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Sicherungsart_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Sicherungsart_TypeClass()
	 * @generated
	 */
	int BUE_SICHERUNGSART_TYPE_CLASS = 44;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SICHERUNGSART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SICHERUNGSART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Sicherungsart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SICHERUNGSART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Sicherungsart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SICHERUNGSART_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Sicherungszeit_TypeClassImpl <em>BUE Sicherungszeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Sicherungszeit_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Sicherungszeit_TypeClass()
	 * @generated
	 */
	int BUE_SICHERUNGSZEIT_TYPE_CLASS = 45;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SICHERUNGSZEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SICHERUNGSZEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Sicherungszeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SICHERUNGSZEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Sicherungszeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SICHERUNGSZEIT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Spezifisches_SignalImpl <em>BUE Spezifisches Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Spezifisches_SignalImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Spezifisches_Signal()
	 * @generated
	 */
	int BUE_SPEZIFISCHES_SIGNAL = 46;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SPEZIFISCHES_SIGNAL__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SPEZIFISCHES_SIGNAL__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SPEZIFISCHES_SIGNAL__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SPEZIFISCHES_SIGNAL__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SPEZIFISCHES_SIGNAL__ID_SIGNAL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SPEZIFISCHES_SIGNAL__IDBUE_ANLAGE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDBUE Einschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SPEZIFISCHES_SIGNAL__IDBUE_EINSCHALTUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BUE Spezifisches Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SPEZIFISCHES_SIGNAL_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BUE Spezifisches Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_SPEZIFISCHES_SIGNAL_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Strasse_TypeClassImpl <em>BUE Strasse Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Strasse_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Strasse_TypeClass()
	 * @generated
	 */
	int BUE_STRASSE_TYPE_CLASS = 47;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_STRASSE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_STRASSE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Strasse Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_STRASSE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Strasse Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_STRASSE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Technik_TypeClassImpl <em>BUE Technik Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Technik_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Technik_TypeClass()
	 * @generated
	 */
	int BUE_TECHNIK_TYPE_CLASS = 48;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_TECHNIK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_TECHNIK_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Technik Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_TECHNIK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Technik Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_TECHNIK_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Vorlaufzeit_TypeClassImpl <em>BUE Vorlaufzeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Vorlaufzeit_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Vorlaufzeit_TypeClass()
	 * @generated
	 */
	int BUE_VORLAUFZEIT_TYPE_CLASS = 49;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_VORLAUFZEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_VORLAUFZEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Vorlaufzeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_VORLAUFZEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BUE Vorlaufzeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_VORLAUFZEIT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_WS_Fstr_ZuordnungImpl <em>BUE WS Fstr Zuordnung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_WS_Fstr_ZuordnungImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_WS_Fstr_Zuordnung()
	 * @generated
	 */
	int BUE_WS_FSTR_ZUORDNUNG = 50;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_WS_FSTR_ZUORDNUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_WS_FSTR_ZUORDNUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_WS_FSTR_ZUORDNUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_WS_FSTR_ZUORDNUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDBUE Einschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BUE WS Fstr Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_WS_FSTR_ZUORDNUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BUE WS Fstr Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_WS_FSTR_ZUORDNUNG_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Einschaltverz_Errechnet_TypeClassImpl <em>Einschaltverz Errechnet Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Einschaltverz_Errechnet_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getEinschaltverz_Errechnet_TypeClass()
	 * @generated
	 */
	int EINSCHALTVERZ_ERRECHNET_TYPE_CLASS = 51;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSCHALTVERZ_ERRECHNET_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSCHALTVERZ_ERRECHNET_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Einschaltverz Errechnet Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSCHALTVERZ_ERRECHNET_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Einschaltverz Errechnet Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSCHALTVERZ_ERRECHNET_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Einschaltverz_Gewaehlt_TypeClassImpl <em>Einschaltverz Gewaehlt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Einschaltverz_Gewaehlt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getEinschaltverz_Gewaehlt_TypeClass()
	 * @generated
	 */
	int EINSCHALTVERZ_GEWAEHLT_TYPE_CLASS = 52;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSCHALTVERZ_GEWAEHLT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSCHALTVERZ_GEWAEHLT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Einschaltverz Gewaehlt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSCHALTVERZ_GEWAEHLT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Einschaltverz Gewaehlt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSCHALTVERZ_GEWAEHLT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Ersatzstecker_Gleisbezogen_TypeClassImpl <em>Ersatzstecker Gleisbezogen Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Ersatzstecker_Gleisbezogen_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getErsatzstecker_Gleisbezogen_TypeClass()
	 * @generated
	 */
	int ERSATZSTECKER_GLEISBEZOGEN_TYPE_CLASS = 53;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERSATZSTECKER_GLEISBEZOGEN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERSATZSTECKER_GLEISBEZOGEN_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ersatzstecker Gleisbezogen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERSATZSTECKER_GLEISBEZOGEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ersatzstecker Gleisbezogen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERSATZSTECKER_GLEISBEZOGEN_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Fahrbahn_Befestigung_Gleis_TypeClassImpl <em>Fahrbahn Befestigung Gleis Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Fahrbahn_Befestigung_Gleis_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getFahrbahn_Befestigung_Gleis_TypeClass()
	 * @generated
	 */
	int FAHRBAHN_BEFESTIGUNG_GLEIS_TYPE_CLASS = 54;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRBAHN_BEFESTIGUNG_GLEIS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRBAHN_BEFESTIGUNG_GLEIS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fahrbahn Befestigung Gleis Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRBAHN_BEFESTIGUNG_GLEIS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fahrbahn Befestigung Gleis Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRBAHN_BEFESTIGUNG_GLEIS_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Fahrbahn_Befestigung_TypeClassImpl <em>Fahrbahn Befestigung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Fahrbahn_Befestigung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getFahrbahn_Befestigung_TypeClass()
	 * @generated
	 */
	int FAHRBAHN_BEFESTIGUNG_TYPE_CLASS = 55;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRBAHN_BEFESTIGUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRBAHN_BEFESTIGUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fahrbahn Befestigung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRBAHN_BEFESTIGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fahrbahn Befestigung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRBAHN_BEFESTIGUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Fahrbahn_Breite_TypeClassImpl <em>Fahrbahn Breite Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Fahrbahn_Breite_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getFahrbahn_Breite_TypeClass()
	 * @generated
	 */
	int FAHRBAHN_BREITE_TYPE_CLASS = 56;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRBAHN_BREITE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRBAHN_BREITE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fahrbahn Breite Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRBAHN_BREITE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fahrbahn Breite Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRBAHN_BREITE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Fue_Schaltfall_TypeClassImpl <em>Fue Schaltfall Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Fue_Schaltfall_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getFue_Schaltfall_TypeClass()
	 * @generated
	 */
	int FUE_SCHALTFALL_TYPE_CLASS = 57;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUE_SCHALTFALL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUE_SCHALTFALL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fue Schaltfall Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUE_SCHALTFALL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fue Schaltfall Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUE_SCHALTFALL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Fuss_Radweg_Art_TypeClassImpl <em>Fuss Radweg Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Fuss_Radweg_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getFuss_Radweg_Art_TypeClass()
	 * @generated
	 */
	int FUSS_RADWEG_ART_TYPE_CLASS = 58;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSS_RADWEG_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSS_RADWEG_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuss Radweg Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSS_RADWEG_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fuss Radweg Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSS_RADWEG_ART_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Fuss_Radweg_Seite_TypeClassImpl <em>Fuss Radweg Seite Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Fuss_Radweg_Seite_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getFuss_Radweg_Seite_TypeClass()
	 * @generated
	 */
	int FUSS_RADWEG_SEITE_TYPE_CLASS = 59;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSS_RADWEG_SEITE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSS_RADWEG_SEITE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuss Radweg Seite Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSS_RADWEG_SEITE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fuss Radweg Seite Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSS_RADWEG_SEITE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_AnlageImpl <em>GFR Anlage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_AnlageImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGFR_Anlage()
	 * @generated
	 */
	int GFR_ANLAGE = 60;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>GFR Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE__GFR_ANLAGE_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE__IDBUE_ANLAGE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GFR Anlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GFR Anlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Anlage_Allg_AttributeGroupImpl <em>GFR Anlage Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Anlage_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGFR_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	int GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP = 61;

	/**
	 * The feature id for the '<em><b>BUE Sicherungszeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSZEIT = 0;

	/**
	 * The feature id for the '<em><b>GFR Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_ART = 1;

	/**
	 * The feature id for the '<em><b>GFR Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_TYP = 2;

	/**
	 * The feature id for the '<em><b>Hersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__HERSTELLER = 3;

	/**
	 * The number of structural features of the '<em>GFR Anlage Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GFR Anlage Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Art_TypeClassImpl <em>GFR Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGFR_Art_TypeClass()
	 * @generated
	 */
	int GFR_ART_TYPE_CLASS = 62;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GFR Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GFR Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ART_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_ElementImpl <em>GFR Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_ElementImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGFR_Element()
	 * @generated
	 */
	int GFR_ELEMENT = 63;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDGFR Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT__IDGFR_ANLAGE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT__ID_UNTERBRINGUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>BUE Neigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT__BUE_NEIGUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>GFR Neigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT__GFR_NEIGUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>GFR Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>GFR Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Element_Bezeichnung_AttributeGroupImpl <em>GFR Element Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Element_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGFR_Element_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP = 64;

	/**
	 * The feature id for the '<em><b>Bezeichnung GFR Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>GFR Element Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GFR Element Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Neigung_TypeClassImpl <em>GFR Neigung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Neigung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGFR_Neigung_TypeClass()
	 * @generated
	 */
	int GFR_NEIGUNG_TYPE_CLASS = 65;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_NEIGUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_NEIGUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GFR Neigung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_NEIGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GFR Neigung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_NEIGUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_TripelspiegelImpl <em>GFR Tripelspiegel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_TripelspiegelImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGFR_Tripelspiegel()
	 * @generated
	 */
	int GFR_TRIPELSPIEGEL = 66;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL__BEZEICHNUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>GFR Tripelspiegel Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDGFR Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL__IDGFR_ANLAGE = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>GFR Tripelspiegel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>GFR Tripelspiegel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL_OPERATION_COUNT = BasisobjektePackage.PUNKT_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Tripelspiegel_Allg_AttributeGroupImpl <em>GFR Tripelspiegel Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Tripelspiegel_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGFR_Tripelspiegel_Allg_AttributeGroup()
	 * @generated
	 */
	int GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP = 67;

	/**
	 * The feature id for the '<em><b>Montagehoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__MONTAGEHOEHE = 0;

	/**
	 * The feature id for the '<em><b>Pegel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__PEGEL = 1;

	/**
	 * The feature id for the '<em><b>Winkel Alpha</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__WINKEL_ALPHA = 2;

	/**
	 * The number of structural features of the '<em>GFR Tripelspiegel Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GFR Tripelspiegel Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Tripelspiegel_Bezeichnung_AttributeGroupImpl <em>GFR Tripelspiegel Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Tripelspiegel_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGFR_Tripelspiegel_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP = 68;

	/**
	 * The feature id for the '<em><b>Bezeichnung GFR Tripelspiegel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_TRIPELSPIEGEL = 0;

	/**
	 * The number of structural features of the '<em>GFR Tripelspiegel Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GFR Tripelspiegel Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Typ_TypeClassImpl <em>GFR Typ Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_Typ_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGFR_Typ_TypeClass()
	 * @generated
	 */
	int GFR_TYP_TYPE_CLASS = 69;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TYP_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TYP_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GFR Typ Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TYP_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GFR Typ Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFR_TYP_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Gitterbehang_TypeClassImpl <em>Gitterbehang Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Gitterbehang_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGitterbehang_TypeClass()
	 * @generated
	 */
	int GITTERBEHANG_TYPE_CLASS = 70;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITTERBEHANG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITTERBEHANG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gitterbehang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITTERBEHANG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gitterbehang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITTERBEHANG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Gleis_Am_Bue_TypeClassImpl <em>Gleis Am Bue Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Gleis_Am_Bue_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGleis_Am_Bue_TypeClass()
	 * @generated
	 */
	int GLEIS_AM_BUE_TYPE_CLASS = 71;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_AM_BUE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_AM_BUE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gleis Am Bue Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_AM_BUE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gleis Am Bue Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_AM_BUE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Hersteller_TypeClassImpl <em>Hersteller Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Hersteller_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getHersteller_TypeClass()
	 * @generated
	 */
	int HERSTELLER_TYPE_CLASS = 72;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERSTELLER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERSTELLER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hersteller Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERSTELLER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hersteller Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERSTELLER_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Hp_Ersatzstecker_TypeClassImpl <em>Hp Ersatzstecker Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Hp_Ersatzstecker_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getHp_Ersatzstecker_TypeClass()
	 * @generated
	 */
	int HP_ERSATZSTECKER_TYPE_CLASS = 73;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_ERSATZSTECKER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_ERSATZSTECKER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hp Ersatzstecker Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_ERSATZSTECKER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hp Ersatzstecker Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_ERSATZSTECKER_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Klassifizierung_TypeClassImpl <em>Klassifizierung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Klassifizierung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getKlassifizierung_TypeClass()
	 * @generated
	 */
	int KLASSIFIZIERUNG_TYPE_CLASS = 74;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLASSIFIZIERUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLASSIFIZIERUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Klassifizierung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLASSIFIZIERUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Klassifizierung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLASSIFIZIERUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Kontrastblende_TypeClassImpl <em>Kontrastblende Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Kontrastblende_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getKontrastblende_TypeClass()
	 * @generated
	 */
	int KONTRASTBLENDE_TYPE_CLASS = 75;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTRASTBLENDE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTRASTBLENDE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kontrastblende Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTRASTBLENDE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Kontrastblende Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTRASTBLENDE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Kreuzungswinkel_TypeClassImpl <em>Kreuzungswinkel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Kreuzungswinkel_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getKreuzungswinkel_TypeClass()
	 * @generated
	 */
	int KREUZUNGSWINKEL_TYPE_CLASS = 76;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREUZUNGSWINKEL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREUZUNGSWINKEL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kreuzungswinkel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREUZUNGSWINKEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Kreuzungswinkel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREUZUNGSWINKEL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Kurzzugschaltung_TypeClassImpl <em>Kurzzugschaltung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Kurzzugschaltung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getKurzzugschaltung_TypeClass()
	 * @generated
	 */
	int KURZZUGSCHALTUNG_TYPE_CLASS = 77;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KURZZUGSCHALTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KURZZUGSCHALTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kurzzugschaltung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KURZZUGSCHALTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Kurzzugschaltung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KURZZUGSCHALTUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Lagerung_Art_TypeClassImpl <em>Lagerung Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Lagerung_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getLagerung_Art_TypeClass()
	 * @generated
	 */
	int LAGERUNG_ART_TYPE_CLASS = 78;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGERUNG_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGERUNG_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lagerung Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGERUNG_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lagerung Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGERUNG_ART_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.LFUE_Impuls_TypeClassImpl <em>LFUE Impuls Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.LFUE_Impuls_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getLFUE_Impuls_TypeClass()
	 * @generated
	 */
	int LFUE_IMPULS_TYPE_CLASS = 79;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFUE_IMPULS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFUE_IMPULS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LFUE Impuls Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFUE_IMPULS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>LFUE Impuls Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFUE_IMPULS_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Lieferlaenge_TypeClassImpl <em>Lieferlaenge Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Lieferlaenge_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getLieferlaenge_TypeClass()
	 * @generated
	 */
	int LIEFERLAENGE_TYPE_CLASS = 80;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFERLAENGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFERLAENGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lieferlaenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFERLAENGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lieferlaenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFERLAENGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Montage_Ausgleichsgewichte_TypeClassImpl <em>Montage Ausgleichsgewichte Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Montage_Ausgleichsgewichte_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getMontage_Ausgleichsgewichte_TypeClass()
	 * @generated
	 */
	int MONTAGE_AUSGLEICHSGEWICHTE_TYPE_CLASS = 81;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTAGE_AUSGLEICHSGEWICHTE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTAGE_AUSGLEICHSGEWICHTE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Montage Ausgleichsgewichte Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTAGE_AUSGLEICHSGEWICHTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Montage Ausgleichsgewichte Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTAGE_AUSGLEICHSGEWICHTE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Montage_Besonders_TypeClassImpl <em>Montage Besonders Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Montage_Besonders_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getMontage_Besonders_TypeClass()
	 * @generated
	 */
	int MONTAGE_BESONDERS_TYPE_CLASS = 82;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTAGE_BESONDERS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTAGE_BESONDERS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Montage Besonders Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTAGE_BESONDERS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Montage Besonders Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTAGE_BESONDERS_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Montagehoehe_TypeClassImpl <em>Montagehoehe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Montagehoehe_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getMontagehoehe_TypeClass()
	 * @generated
	 */
	int MONTAGEHOEHE_TYPE_CLASS = 83;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTAGEHOEHE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTAGEHOEHE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Montagehoehe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTAGEHOEHE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Montagehoehe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTAGEHOEHE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Optik_Durchmesser_TypeClassImpl <em>Optik Durchmesser Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Optik_Durchmesser_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getOptik_Durchmesser_TypeClass()
	 * @generated
	 */
	int OPTIK_DURCHMESSER_TYPE_CLASS = 84;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIK_DURCHMESSER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIK_DURCHMESSER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Optik Durchmesser Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIK_DURCHMESSER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Optik Durchmesser Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIK_DURCHMESSER_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Optik_Symbolmaske_TypeClassImpl <em>Optik Symbolmaske Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Optik_Symbolmaske_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getOptik_Symbolmaske_TypeClass()
	 * @generated
	 */
	int OPTIK_SYMBOLMASKE_TYPE_CLASS = 85;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIK_SYMBOLMASKE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIK_SYMBOLMASKE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Optik Symbolmaske Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIK_SYMBOLMASKE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Optik Symbolmaske Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIK_SYMBOLMASKE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Pegel_TypeClassImpl <em>Pegel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Pegel_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getPegel_TypeClass()
	 * @generated
	 */
	int PEGEL_TYPE_CLASS = 86;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGEL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGEL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pegel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pegel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEGEL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Pixel_Koordinate_X_TypeClassImpl <em>Pixel Koordinate XType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Pixel_Koordinate_X_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getPixel_Koordinate_X_TypeClass()
	 * @generated
	 */
	int PIXEL_KOORDINATE_XTYPE_CLASS = 87;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXEL_KOORDINATE_XTYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXEL_KOORDINATE_XTYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pixel Koordinate XType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXEL_KOORDINATE_XTYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pixel Koordinate XType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXEL_KOORDINATE_XTYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Pixel_Koordinate_Y_TypeClassImpl <em>Pixel Koordinate YType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Pixel_Koordinate_Y_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getPixel_Koordinate_Y_TypeClass()
	 * @generated
	 */
	int PIXEL_KOORDINATE_YTYPE_CLASS = 88;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXEL_KOORDINATE_YTYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXEL_KOORDINATE_YTYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pixel Koordinate YType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXEL_KOORDINATE_YTYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pixel Koordinate YType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIXEL_KOORDINATE_YTYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Raeumstrecke_DAB_TypeClassImpl <em>Raeumstrecke DAB Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Raeumstrecke_DAB_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getRaeumstrecke_DAB_TypeClass()
	 * @generated
	 */
	int RAEUMSTRECKE_DAB_TYPE_CLASS = 89;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DAB_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DAB_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raeumstrecke DAB Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DAB_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raeumstrecke DAB Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DAB_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Raeumstrecke_DBK_TypeClassImpl <em>Raeumstrecke DBK Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Raeumstrecke_DBK_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getRaeumstrecke_DBK_TypeClass()
	 * @generated
	 */
	int RAEUMSTRECKE_DBK_TYPE_CLASS = 90;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DBK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DBK_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raeumstrecke DBK Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DBK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raeumstrecke DBK Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DBK_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Raeumstrecke_DCK_TypeClassImpl <em>Raeumstrecke DCK Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Raeumstrecke_DCK_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getRaeumstrecke_DCK_TypeClass()
	 * @generated
	 */
	int RAEUMSTRECKE_DCK_TYPE_CLASS = 91;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DCK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DCK_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raeumstrecke DCK Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DCK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raeumstrecke DCK Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DCK_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Raeumstrecke_DSK_Strich_TypeClassImpl <em>Raeumstrecke DSK Strich Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Raeumstrecke_DSK_Strich_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getRaeumstrecke_DSK_Strich_TypeClass()
	 * @generated
	 */
	int RAEUMSTRECKE_DSK_STRICH_TYPE_CLASS = 92;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DSK_STRICH_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DSK_STRICH_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raeumstrecke DSK Strich Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DSK_STRICH_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raeumstrecke DSK Strich Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_DSK_STRICH_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Raeumstrecke_TypeClassImpl <em>Raeumstrecke Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Raeumstrecke_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getRaeumstrecke_TypeClass()
	 * @generated
	 */
	int RAEUMSTRECKE_TYPE_CLASS = 93;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raeumstrecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raeumstrecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAEUMSTRECKE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Richtungspfeil_TypeClassImpl <em>Richtungspfeil Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Richtungspfeil_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getRichtungspfeil_TypeClass()
	 * @generated
	 */
	int RICHTUNGSPFEIL_TYPE_CLASS = 94;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICHTUNGSPFEIL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICHTUNGSPFEIL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Richtungspfeil Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICHTUNGSPFEIL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Richtungspfeil Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICHTUNGSPFEIL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.SA_Schrankenbaum_AttributeGroupImpl <em>SA Schrankenbaum Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.SA_Schrankenbaum_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSA_Schrankenbaum_AttributeGroup()
	 * @generated
	 */
	int SA_SCHRANKENBAUM_ATTRIBUTE_GROUP = 95;

	/**
	 * The feature id for the '<em><b>Ausrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG = 0;

	/**
	 * The feature id for the '<em><b>Ausrichtung Winkel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL = 1;

	/**
	 * The feature id for the '<em><b>Baumprofil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__BAUMPROFIL = 2;

	/**
	 * The feature id for the '<em><b>Gitterbehang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__GITTERBEHANG = 3;

	/**
	 * The feature id for the '<em><b>Lagerung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LAGERUNG_ART = 4;

	/**
	 * The feature id for the '<em><b>Lieferlaenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LIEFERLAENGE = 5;

	/**
	 * The feature id for the '<em><b>Montage Ausgleichsgewichte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__MONTAGE_AUSGLEICHSGEWICHTE = 6;

	/**
	 * The feature id for the '<em><b>Sperrlaenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__SPERRLAENGE = 7;

	/**
	 * The number of structural features of the '<em>SA Schrankenbaum Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_SCHRANKENBAUM_ATTRIBUTE_GROUP_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>SA Schrankenbaum Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_SCHRANKENBAUM_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Schaltgruppe_TypeClassImpl <em>Schaltgruppe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Schaltgruppe_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSchaltgruppe_TypeClass()
	 * @generated
	 */
	int SCHALTGRUPPE_TYPE_CLASS = 96;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTGRUPPE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTGRUPPE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schaltgruppe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTGRUPPE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schaltgruppe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTGRUPPE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Schaltmittel_Fstr_ZuordnungImpl <em>Schaltmittel Fstr Zuordnung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Schaltmittel_Fstr_ZuordnungImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSchaltmittel_Fstr_Zuordnung()
	 * @generated
	 */
	int SCHALTMITTEL_FSTR_ZUORDNUNG = 97;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_FSTR_ZUORDNUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_FSTR_ZUORDNUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_FSTR_ZUORDNUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_FSTR_ZUORDNUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDBUEWS Fstr Zuordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Schaltmittel Zuordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schaltmittel Fstr Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_FSTR_ZUORDNUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Schaltmittel Fstr Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_FSTR_ZUORDNUNG_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.SchrankenantriebImpl <em>Schrankenantrieb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.SchrankenantriebImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSchrankenantrieb()
	 * @generated
	 */
	int SCHRANKENANTRIEB = 98;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB__BEZEICHNUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB__IDBUE_ANLAGE = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>SA Schrankenbaum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB__SA_SCHRANKENBAUM = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schrankenantrieb Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB__SCHRANKENANTRIEB_ALLG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Schrankenantrieb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Schrankenantrieb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB_OPERATION_COUNT = BasisobjektePackage.PUNKT_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Schrankenantrieb_Allg_AttributeGroupImpl <em>Schrankenantrieb Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Schrankenantrieb_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSchrankenantrieb_Allg_AttributeGroup()
	 * @generated
	 */
	int SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP = 99;

	/**
	 * The feature id for the '<em><b>Abstand Gehweg Fahrbahn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN = 0;

	/**
	 * The feature id for the '<em><b>Hersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__HERSTELLER = 1;

	/**
	 * The feature id for the '<em><b>Schaltgruppe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__SCHALTGRUPPE = 2;

	/**
	 * The number of structural features of the '<em>Schrankenantrieb Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Schrankenantrieb Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Schrankenantrieb_Bezeichnung_AttributeGroupImpl <em>Schrankenantrieb Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Schrankenantrieb_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSchrankenantrieb_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP = 100;

	/**
	 * The feature id for the '<em><b>Bez Schrankenantrieb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_SCHRANKENANTRIEB = 0;

	/**
	 * The number of structural features of the '<em>Schrankenantrieb Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Schrankenantrieb Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Schutzbuegel_TypeClassImpl <em>Schutzbuegel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Schutzbuegel_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSchutzbuegel_TypeClass()
	 * @generated
	 */
	int SCHUTZBUEGEL_TYPE_CLASS = 101;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUTZBUEGEL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUTZBUEGEL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schutzbuegel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUTZBUEGEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schutzbuegel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUTZBUEGEL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Sicherheitsabstand_TypeClassImpl <em>Sicherheitsabstand Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Sicherheitsabstand_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSicherheitsabstand_TypeClass()
	 * @generated
	 */
	int SICHERHEITSABSTAND_TYPE_CLASS = 102;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SICHERHEITSABSTAND_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SICHERHEITSABSTAND_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sicherheitsabstand Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SICHERHEITSABSTAND_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sicherheitsabstand Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SICHERHEITSABSTAND_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Signalverz_Errechnet_TypeClassImpl <em>Signalverz Errechnet Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Signalverz_Errechnet_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSignalverz_Errechnet_TypeClass()
	 * @generated
	 */
	int SIGNALVERZ_ERRECHNET_TYPE_CLASS = 103;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALVERZ_ERRECHNET_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALVERZ_ERRECHNET_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signalverz Errechnet Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALVERZ_ERRECHNET_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signalverz Errechnet Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALVERZ_ERRECHNET_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Signalverz_Gewaehlt_TypeClassImpl <em>Signalverz Gewaehlt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Signalverz_Gewaehlt_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSignalverz_Gewaehlt_TypeClass()
	 * @generated
	 */
	int SIGNALVERZ_GEWAEHLT_TYPE_CLASS = 104;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALVERZ_GEWAEHLT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALVERZ_GEWAEHLT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signalverz Gewaehlt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALVERZ_GEWAEHLT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signalverz Gewaehlt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALVERZ_GEWAEHLT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Sperrlaenge_TypeClassImpl <em>Sperrlaenge Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Sperrlaenge_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSperrlaenge_TypeClass()
	 * @generated
	 */
	int SPERRLAENGE_TYPE_CLASS = 105;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPERRLAENGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPERRLAENGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sperrlaenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPERRLAENGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sperrlaenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPERRLAENGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Sperrstrecke_Fussgaenger_TypeClassImpl <em>Sperrstrecke Fussgaenger Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Sperrstrecke_Fussgaenger_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSperrstrecke_Fussgaenger_TypeClass()
	 * @generated
	 */
	int SPERRSTRECKE_FUSSGAENGER_TYPE_CLASS = 106;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPERRSTRECKE_FUSSGAENGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPERRSTRECKE_FUSSGAENGER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sperrstrecke Fussgaenger Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPERRSTRECKE_FUSSGAENGER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sperrstrecke Fussgaenger Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPERRSTRECKE_FUSSGAENGER_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Sperrstrecke_TypeClassImpl <em>Sperrstrecke Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Sperrstrecke_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSperrstrecke_TypeClass()
	 * @generated
	 */
	int SPERRSTRECKE_TYPE_CLASS = 107;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPERRSTRECKE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPERRSTRECKE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sperrstrecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPERRSTRECKE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sperrstrecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPERRSTRECKE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Stoerhalt_Haltfall_TypeClassImpl <em>Stoerhalt Haltfall Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Stoerhalt_Haltfall_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getStoerhalt_Haltfall_TypeClass()
	 * @generated
	 */
	int STOERHALT_HALTFALL_TYPE_CLASS = 108;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOERHALT_HALTFALL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOERHALT_HALTFALL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stoerhalt Haltfall Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOERHALT_HALTFALL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stoerhalt Haltfall Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOERHALT_HALTFALL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Stoerhalt_Merkhinweis_TypeClassImpl <em>Stoerhalt Merkhinweis Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Stoerhalt_Merkhinweis_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getStoerhalt_Merkhinweis_TypeClass()
	 * @generated
	 */
	int STOERHALT_MERKHINWEIS_TYPE_CLASS = 109;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOERHALT_MERKHINWEIS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOERHALT_MERKHINWEIS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stoerhalt Merkhinweis Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOERHALT_MERKHINWEIS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stoerhalt Merkhinweis Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOERHALT_MERKHINWEIS_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Teilsperrstrecke_TypeClassImpl <em>Teilsperrstrecke Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Teilsperrstrecke_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getTeilsperrstrecke_TypeClass()
	 * @generated
	 */
	int TEILSPERRSTRECKE_TYPE_CLASS = 110;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILSPERRSTRECKE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILSPERRSTRECKE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Teilsperrstrecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILSPERRSTRECKE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Teilsperrstrecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILSPERRSTRECKE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Teilvorgabezeit_TypeClassImpl <em>Teilvorgabezeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Teilvorgabezeit_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getTeilvorgabezeit_TypeClass()
	 * @generated
	 */
	int TEILVORGABEZEIT_TYPE_CLASS = 111;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILVORGABEZEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILVORGABEZEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Teilvorgabezeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILVORGABEZEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Teilvorgabezeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILVORGABEZEIT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Tragkopf_Verstellbar_TypeClassImpl <em>Tragkopf Verstellbar Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Tragkopf_Verstellbar_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getTragkopf_Verstellbar_TypeClass()
	 * @generated
	 */
	int TRAGKOPF_VERSTELLBAR_TYPE_CLASS = 112;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAGKOPF_VERSTELLBAR_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAGKOPF_VERSTELLBAR_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tragkopf Verstellbar Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAGKOPF_VERSTELLBAR_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tragkopf Verstellbar Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAGKOPF_VERSTELLBAR_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.V_Max_Schiene_TypeClassImpl <em>VMax Schiene Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.V_Max_Schiene_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getV_Max_Schiene_TypeClass()
	 * @generated
	 */
	int VMAX_SCHIENE_TYPE_CLASS = 113;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMAX_SCHIENE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMAX_SCHIENE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VMax Schiene Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMAX_SCHIENE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VMax Schiene Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMAX_SCHIENE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.V_Max_Strasse_TypeClassImpl <em>VMax Strasse Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.V_Max_Strasse_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getV_Max_Strasse_TypeClass()
	 * @generated
	 */
	int VMAX_STRASSE_TYPE_CLASS = 114;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMAX_STRASSE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMAX_STRASSE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VMax Strasse Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMAX_STRASSE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VMax Strasse Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMAX_STRASSE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.V_Min_Fussweg_TypeClassImpl <em>VMin Fussweg Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.V_Min_Fussweg_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getV_Min_Fussweg_TypeClass()
	 * @generated
	 */
	int VMIN_FUSSWEG_TYPE_CLASS = 115;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIN_FUSSWEG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIN_FUSSWEG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VMin Fussweg Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIN_FUSSWEG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VMin Fussweg Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIN_FUSSWEG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.V_Min_Schiene_TypeClassImpl <em>VMin Schiene Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.V_Min_Schiene_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getV_Min_Schiene_TypeClass()
	 * @generated
	 */
	int VMIN_SCHIENE_TYPE_CLASS = 116;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIN_SCHIENE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIN_SCHIENE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VMin Schiene Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIN_SCHIENE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VMin Schiene Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIN_SCHIENE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.V_Min_Strasse_TypeClassImpl <em>VMin Strasse Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.V_Min_Strasse_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getV_Min_Strasse_TypeClass()
	 * @generated
	 */
	int VMIN_STRASSE_TYPE_CLASS = 117;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIN_STRASSE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIN_STRASSE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VMin Strasse Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIN_STRASSE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VMin Strasse Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIN_STRASSE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.VerkehrszeichenImpl <em>Verkehrszeichen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.VerkehrszeichenImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getVerkehrszeichen()
	 * @generated
	 */
	int VERKEHRSZEICHEN = 118;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN__IDBUE_ANLAGE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN__ID_UNTERBRINGUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Verkehrszeichen Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Verkehrszeichen Andreaskreuz</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Verkehrszeichen Lz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vz Sperrstrecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN__VZ_SPERRSTRECKE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Verkehrszeichen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Verkehrszeichen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Verkehrszeichen_Allg_AttributeGroupImpl <em>Verkehrszeichen Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Verkehrszeichen_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getVerkehrszeichen_Allg_AttributeGroup()
	 * @generated
	 */
	int VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP = 119;

	/**
	 * The feature id for the '<em><b>Abstand Gehweg Fahrbahn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN = 0;

	/**
	 * The feature id for the '<em><b>Ausrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG = 1;

	/**
	 * The feature id for the '<em><b>Ausrichtung Winkel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL = 2;

	/**
	 * The number of structural features of the '<em>Verkehrszeichen Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Verkehrszeichen Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Verkehrszeichen_Andreaskreuz_AttributeGroupImpl <em>Verkehrszeichen Andreaskreuz Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Verkehrszeichen_Andreaskreuz_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getVerkehrszeichen_Andreaskreuz_AttributeGroup()
	 * @generated
	 */
	int VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP = 120;

	/**
	 * The feature id for the '<em><b>Blitzpfeil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__BLITZPFEIL = 0;

	/**
	 * The feature id for the '<em><b>Montage Besonders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__MONTAGE_BESONDERS = 1;

	/**
	 * The feature id for the '<em><b>Richtungspfeil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__RICHTUNGSPFEIL = 2;

	/**
	 * The feature id for the '<em><b>Schutzbuegel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__SCHUTZBUEGEL = 3;

	/**
	 * The feature id for the '<em><b>Zusatzschild</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__ZUSATZSCHILD = 4;

	/**
	 * The number of structural features of the '<em>Verkehrszeichen Andreaskreuz Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Verkehrszeichen Andreaskreuz Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Verkehrszeichen_Bezeichnung_AttributeGroupImpl <em>Verkehrszeichen Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Verkehrszeichen_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getVerkehrszeichen_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP = 121;

	/**
	 * The feature id for the '<em><b>Bezeichnung Verkehrszeichen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_VERKEHRSZEICHEN = 0;

	/**
	 * The number of structural features of the '<em>Verkehrszeichen Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Verkehrszeichen Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Verkehrszeichen_Lz_AttributeGroupImpl <em>Verkehrszeichen Lz Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Verkehrszeichen_Lz_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getVerkehrszeichen_Lz_AttributeGroup()
	 * @generated
	 */
	int VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP = 122;

	/**
	 * The feature id for the '<em><b>Akustik Fussgaenger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__AKUSTIK_FUSSGAENGER = 0;

	/**
	 * The feature id for the '<em><b>Kontrastblende</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__KONTRASTBLENDE = 1;

	/**
	 * The feature id for the '<em><b>Optik Durchmesser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_DURCHMESSER = 2;

	/**
	 * The feature id for the '<em><b>Optik Symbolmaske</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_SYMBOLMASKE = 3;

	/**
	 * The feature id for the '<em><b>Schaltgruppe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__SCHALTGRUPPE = 4;

	/**
	 * The feature id for the '<em><b>Tragkopf Verstellbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__TRAGKOPF_VERSTELLBAR = 5;

	/**
	 * The feature id for the '<em><b>Vorgeschaltet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__VORGESCHALTET = 6;

	/**
	 * The number of structural features of the '<em>Verkehrszeichen Lz Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Verkehrszeichen Lz Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Vorgeschaltet_TypeClassImpl <em>Vorgeschaltet Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Vorgeschaltet_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getVorgeschaltet_TypeClass()
	 * @generated
	 */
	int VORGESCHALTET_TYPE_CLASS = 123;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGESCHALTET_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGESCHALTET_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vorgeschaltet Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGESCHALTET_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vorgeschaltet Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGESCHALTET_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Vz_Sperrstrecke_AttributeGroupImpl <em>Vz Sperrstrecke Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Vz_Sperrstrecke_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getVz_Sperrstrecke_AttributeGroup()
	 * @generated
	 */
	int VZ_SPERRSTRECKE_ATTRIBUTE_GROUP = 124;

	/**
	 * The feature id for the '<em><b>Vz Sperrstrecke Vorgeschaltet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_VORGESCHALTET = 0;

	/**
	 * The feature id for the '<em><b>Sperrstrecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE = 1;

	/**
	 * The feature id for the '<em><b>Sperrstrecke Fussgaenger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE_FUSSGAENGER = 2;

	/**
	 * The feature id for the '<em><b>Vz Sperrstrecke Schranke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_SCHRANKE = 3;

	/**
	 * The number of structural features of the '<em>Vz Sperrstrecke Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Vz Sperrstrecke Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Vz_Sperrstrecke_Schranke_AttributeGroupImpl <em>Vz Sperrstrecke Schranke Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Vz_Sperrstrecke_Schranke_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getVz_Sperrstrecke_Schranke_AttributeGroup()
	 * @generated
	 */
	int VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP = 125;

	/**
	 * The feature id for the '<em><b>Raeumstrecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__RAEUMSTRECKE = 0;

	/**
	 * The feature id for the '<em><b>Teilsperrstrecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__TEILSPERRSTRECKE = 1;

	/**
	 * The number of structural features of the '<em>Vz Sperrstrecke Schranke Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vz Sperrstrecke Schranke Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupImpl <em>Vz Sperrstrecke Vorgeschaltet Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup()
	 * @generated
	 */
	int VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP = 126;

	/**
	 * The feature id for the '<em><b>Beeinflussung Strassenverkehr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__BEEINFLUSSUNG_STRASSENVERKEHR = 0;

	/**
	 * The feature id for the '<em><b>Raeumstrecke DAB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DAB = 1;

	/**
	 * The feature id for the '<em><b>Raeumstrecke DBK</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DBK = 2;

	/**
	 * The feature id for the '<em><b>Raeumstrecke DCK</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DCK = 3;

	/**
	 * The feature id for the '<em><b>Raeumstrecke DSK Strich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DSK_STRICH = 4;

	/**
	 * The number of structural features of the '<em>Vz Sperrstrecke Vorgeschaltet Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Vz Sperrstrecke Vorgeschaltet Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Winkel_Alpha_TypeClassImpl <em>Winkel Alpha Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Winkel_Alpha_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getWinkel_Alpha_TypeClass()
	 * @generated
	 */
	int WINKEL_ALPHA_TYPE_CLASS = 127;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINKEL_ALPHA_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINKEL_ALPHA_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Winkel Alpha Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINKEL_ALPHA_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Winkel Alpha Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINKEL_ALPHA_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Zeitueberschreitungsmeldung_TypeClassImpl <em>Zeitueberschreitungsmeldung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Zeitueberschreitungsmeldung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getZeitueberschreitungsmeldung_TypeClass()
	 * @generated
	 */
	int ZEITUEBERSCHREITUNGSMELDUNG_TYPE_CLASS = 128;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEITUEBERSCHREITUNGSMELDUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEITUEBERSCHREITUNGSMELDUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zeitueberschreitungsmeldung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEITUEBERSCHREITUNGSMELDUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Zeitueberschreitungsmeldung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEITUEBERSCHREITUNGSMELDUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Zusatzschild_TypeClassImpl <em>Zusatzschild Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.Zusatzschild_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getZusatzschild_TypeClass()
	 * @generated
	 */
	int ZUSATZSCHILD_TYPE_CLASS = 129;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZSCHILD_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZSCHILD_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zusatzschild Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZSCHILD_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Zusatzschild Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZSCHILD_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBaumprofil <em>ENUM Baumprofil</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBaumprofil
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMBaumprofil()
	 * @generated
	 */
	int ENUM_BAUMPROFIL = 130;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEBauart <em>ENUMBUE Bauart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEBauart
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMBUEBauart()
	 * @generated
	 */
	int ENUMBUE_BAUART = 131;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEFunktionsueberwachung <em>ENUMBUE Funktionsueberwachung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEFunktionsueberwachung
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMBUEFunktionsueberwachung()
	 * @generated
	 */
	int ENUMBUE_FUNKTIONSUEBERWACHUNG = 132;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEHandschalteinrichtung <em>ENUMBUE Handschalteinrichtung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEHandschalteinrichtung
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMBUEHandschalteinrichtung()
	 * @generated
	 */
	int ENUMBUE_HANDSCHALTEINRICHTUNG = 133;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUESicherungsart <em>ENUMBUE Sicherungsart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUESicherungsart
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMBUESicherungsart()
	 * @generated
	 */
	int ENUMBUE_SICHERUNGSART = 134;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUETechnik <em>ENUMBUE Technik</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUETechnik
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMBUETechnik()
	 * @generated
	 */
	int ENUMBUE_TECHNIK = 135;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMFueSchaltfall <em>ENUM Fue Schaltfall</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMFueSchaltfall
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMFueSchaltfall()
	 * @generated
	 */
	int ENUM_FUE_SCHALTFALL = 136;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegArt <em>ENUM Fuss Radweg Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegArt
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMFussRadwegArt()
	 * @generated
	 */
	int ENUM_FUSS_RADWEG_ART = 137;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegSeite <em>ENUM Fuss Radweg Seite</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegSeite
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMFussRadwegSeite()
	 * @generated
	 */
	int ENUM_FUSS_RADWEG_SEITE = 138;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMGFRArt <em>ENUMGFR Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMGFRArt
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMGFRArt()
	 * @generated
	 */
	int ENUMGFR_ART = 139;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMHpErsatzstecker <em>ENUM Hp Ersatzstecker</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMHpErsatzstecker
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMHpErsatzstecker()
	 * @generated
	 */
	int ENUM_HP_ERSATZSTECKER = 140;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMKlassifizierung <em>ENUM Klassifizierung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMKlassifizierung
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMKlassifizierung()
	 * @generated
	 */
	int ENUM_KLASSIFIZIERUNG = 141;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMLagerung <em>ENUM Lagerung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMLagerung
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMLagerung()
	 * @generated
	 */
	int ENUM_LAGERUNG = 142;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMLFUEImpuls <em>ENUMLFUE Impuls</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMLFUEImpuls
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMLFUEImpuls()
	 * @generated
	 */
	int ENUMLFUE_IMPULS = 143;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMMontageAusgleichsgewichte <em>ENUM Montage Ausgleichsgewichte</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMMontageAusgleichsgewichte
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMMontageAusgleichsgewichte()
	 * @generated
	 */
	int ENUM_MONTAGE_AUSGLEICHSGEWICHTE = 144;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMOptikSymbol <em>ENUM Optik Symbol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMOptikSymbol
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMOptikSymbol()
	 * @generated
	 */
	int ENUM_OPTIK_SYMBOL = 145;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMRichtungspfeil <em>ENUM Richtungspfeil</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMRichtungspfeil
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMRichtungspfeil()
	 * @generated
	 */
	int ENUM_RICHTUNGSPFEIL = 146;

	/**
	 * The meta object id for the '<em>Abstand Gehweg Fahrbahn Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getAbstand_Gehweg_Fahrbahn_Type()
	 * @generated
	 */
	int ABSTAND_GEHWEG_FAHRBAHN_TYPE = 147;

	/**
	 * The meta object id for the '<em>Akustik Fussgaenger Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getAkustik_Fussgaenger_Type()
	 * @generated
	 */
	int AKUSTIK_FUSSGAENGER_TYPE = 148;

	/**
	 * The meta object id for the '<em>Akustik Fussgaenger Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getAkustik_Fussgaenger_TypeObject()
	 * @generated
	 */
	int AKUSTIK_FUSSGAENGER_TYPE_OBJECT = 149;

	/**
	 * The meta object id for the '<em>Ausrichtung Winkel Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getAusrichtung_Winkel_Type()
	 * @generated
	 */
	int AUSRICHTUNG_WINKEL_TYPE = 150;

	/**
	 * The meta object id for the '<em>Baulast Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBaulast_Type()
	 * @generated
	 */
	int BAULAST_TYPE = 151;

	/**
	 * The meta object id for the '<em>Beeinflussung Strassenverkehr Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBeeinflussung_Strassenverkehr_Type()
	 * @generated
	 */
	int BEEINFLUSSUNG_STRASSENVERKEHR_TYPE = 152;

	/**
	 * The meta object id for the '<em>Bez Schrankenantrieb Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBez_Schrankenantrieb_Type()
	 * @generated
	 */
	int BEZ_SCHRANKENANTRIEB_TYPE = 153;

	/**
	 * The meta object id for the '<em>Bezeichnung BUE GFR Eckpunkt Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBezeichnung_BUE_GFR_Eckpunkt_Type()
	 * @generated
	 */
	int BEZEICHNUNG_BUE_GFR_ECKPUNKT_TYPE = 154;

	/**
	 * The meta object id for the '<em>Bezeichnung GFR Element Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBezeichnung_GFR_Element_Type()
	 * @generated
	 */
	int BEZEICHNUNG_GFR_ELEMENT_TYPE = 155;

	/**
	 * The meta object id for the '<em>Bezeichnung GFR Tripelspiegel Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBezeichnung_GFR_Tripelspiegel_Type()
	 * @generated
	 */
	int BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE = 156;

	/**
	 * The meta object id for the '<em>Bezeichnung Verkehrszeichen Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBezeichnung_Verkehrszeichen_Type()
	 * @generated
	 */
	int BEZEICHNUNG_VERKEHRSZEICHEN_TYPE = 157;

	/**
	 * The meta object id for the '<em>Blitzpfeil Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBlitzpfeil_Type()
	 * @generated
	 */
	int BLITZPFEIL_TYPE = 158;

	/**
	 * The meta object id for the '<em>Blitzpfeil Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBlitzpfeil_TypeObject()
	 * @generated
	 */
	int BLITZPFEIL_TYPE_OBJECT = 159;

	/**
	 * The meta object id for the '<em>BUE Nachlaufzeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Nachlaufzeit_Type()
	 * @generated
	 */
	int BUE_NACHLAUFZEIT_TYPE = 160;

	/**
	 * The meta object id for the '<em>BUE Neigung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Neigung_Type()
	 * @generated
	 */
	int BUE_NEIGUNG_TYPE = 161;

	/**
	 * The meta object id for the '<em>BUE Sicherungszeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Sicherungszeit_Type()
	 * @generated
	 */
	int BUE_SICHERUNGSZEIT_TYPE = 162;

	/**
	 * The meta object id for the '<em>BUE Strasse Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Strasse_Type()
	 * @generated
	 */
	int BUE_STRASSE_TYPE = 163;

	/**
	 * The meta object id for the '<em>BUE Vorlaufzeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getBUE_Vorlaufzeit_Type()
	 * @generated
	 */
	int BUE_VORLAUFZEIT_TYPE = 164;

	/**
	 * The meta object id for the '<em>Einschaltverz Errechnet Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getEinschaltverz_Errechnet_Type()
	 * @generated
	 */
	int EINSCHALTVERZ_ERRECHNET_TYPE = 165;

	/**
	 * The meta object id for the '<em>Einschaltverz Gewaehlt Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getEinschaltverz_Gewaehlt_Type()
	 * @generated
	 */
	int EINSCHALTVERZ_GEWAEHLT_TYPE = 166;

	/**
	 * The meta object id for the '<em>ENUM Baumprofil Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBaumprofil
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMBaumprofilObject()
	 * @generated
	 */
	int ENUM_BAUMPROFIL_OBJECT = 167;

	/**
	 * The meta object id for the '<em>ENUMBUE Bauart Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEBauart
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMBUEBauartObject()
	 * @generated
	 */
	int ENUMBUE_BAUART_OBJECT = 168;

	/**
	 * The meta object id for the '<em>ENUMBUE Funktionsueberwachung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEFunktionsueberwachung
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMBUEFunktionsueberwachungObject()
	 * @generated
	 */
	int ENUMBUE_FUNKTIONSUEBERWACHUNG_OBJECT = 169;

	/**
	 * The meta object id for the '<em>ENUMBUE Handschalteinrichtung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEHandschalteinrichtung
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMBUEHandschalteinrichtungObject()
	 * @generated
	 */
	int ENUMBUE_HANDSCHALTEINRICHTUNG_OBJECT = 170;

	/**
	 * The meta object id for the '<em>ENUMBUE Sicherungsart Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUESicherungsart
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMBUESicherungsartObject()
	 * @generated
	 */
	int ENUMBUE_SICHERUNGSART_OBJECT = 171;

	/**
	 * The meta object id for the '<em>ENUMBUE Technik Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUETechnik
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMBUETechnikObject()
	 * @generated
	 */
	int ENUMBUE_TECHNIK_OBJECT = 172;

	/**
	 * The meta object id for the '<em>ENUM Fue Schaltfall Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMFueSchaltfall
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMFueSchaltfallObject()
	 * @generated
	 */
	int ENUM_FUE_SCHALTFALL_OBJECT = 173;

	/**
	 * The meta object id for the '<em>ENUM Fuss Radweg Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegArt
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMFussRadwegArtObject()
	 * @generated
	 */
	int ENUM_FUSS_RADWEG_ART_OBJECT = 174;

	/**
	 * The meta object id for the '<em>ENUM Fuss Radweg Seite Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegSeite
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMFussRadwegSeiteObject()
	 * @generated
	 */
	int ENUM_FUSS_RADWEG_SEITE_OBJECT = 175;

	/**
	 * The meta object id for the '<em>ENUMGFR Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMGFRArt
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMGFRArtObject()
	 * @generated
	 */
	int ENUMGFR_ART_OBJECT = 176;

	/**
	 * The meta object id for the '<em>ENUM Hp Ersatzstecker Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMHpErsatzstecker
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMHpErsatzsteckerObject()
	 * @generated
	 */
	int ENUM_HP_ERSATZSTECKER_OBJECT = 177;

	/**
	 * The meta object id for the '<em>ENUM Klassifizierung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMKlassifizierung
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMKlassifizierungObject()
	 * @generated
	 */
	int ENUM_KLASSIFIZIERUNG_OBJECT = 178;

	/**
	 * The meta object id for the '<em>ENUM Lagerung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMLagerung
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMLagerungObject()
	 * @generated
	 */
	int ENUM_LAGERUNG_OBJECT = 179;

	/**
	 * The meta object id for the '<em>ENUMLFUE Impuls Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMLFUEImpuls
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMLFUEImpulsObject()
	 * @generated
	 */
	int ENUMLFUE_IMPULS_OBJECT = 180;

	/**
	 * The meta object id for the '<em>ENUM Montage Ausgleichsgewichte Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMMontageAusgleichsgewichte
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMMontageAusgleichsgewichteObject()
	 * @generated
	 */
	int ENUM_MONTAGE_AUSGLEICHSGEWICHTE_OBJECT = 181;

	/**
	 * The meta object id for the '<em>ENUM Optik Symbol Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMOptikSymbol
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMOptikSymbolObject()
	 * @generated
	 */
	int ENUM_OPTIK_SYMBOL_OBJECT = 182;

	/**
	 * The meta object id for the '<em>ENUM Richtungspfeil Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMRichtungspfeil
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getENUMRichtungspfeilObject()
	 * @generated
	 */
	int ENUM_RICHTUNGSPFEIL_OBJECT = 183;

	/**
	 * The meta object id for the '<em>Fahrbahn Befestigung Gleis Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getFahrbahn_Befestigung_Gleis_Type()
	 * @generated
	 */
	int FAHRBAHN_BEFESTIGUNG_GLEIS_TYPE = 184;

	/**
	 * The meta object id for the '<em>Fahrbahn Befestigung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getFahrbahn_Befestigung_Type()
	 * @generated
	 */
	int FAHRBAHN_BEFESTIGUNG_TYPE = 185;

	/**
	 * The meta object id for the '<em>Fahrbahn Breite Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getFahrbahn_Breite_Type()
	 * @generated
	 */
	int FAHRBAHN_BREITE_TYPE = 186;

	/**
	 * The meta object id for the '<em>GFR Neigung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGFR_Neigung_Type()
	 * @generated
	 */
	int GFR_NEIGUNG_TYPE = 187;

	/**
	 * The meta object id for the '<em>GFR Typ Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGFR_Typ_Type()
	 * @generated
	 */
	int GFR_TYP_TYPE = 188;

	/**
	 * The meta object id for the '<em>Gleis Am Bue Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getGleis_Am_Bue_Type()
	 * @generated
	 */
	int GLEIS_AM_BUE_TYPE = 189;

	/**
	 * The meta object id for the '<em>Kontrastblende Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getKontrastblende_Type()
	 * @generated
	 */
	int KONTRASTBLENDE_TYPE = 190;

	/**
	 * The meta object id for the '<em>Kontrastblende Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getKontrastblende_TypeObject()
	 * @generated
	 */
	int KONTRASTBLENDE_TYPE_OBJECT = 191;

	/**
	 * The meta object id for the '<em>Kreuzungswinkel Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getKreuzungswinkel_Type()
	 * @generated
	 */
	int KREUZUNGSWINKEL_TYPE = 192;

	/**
	 * The meta object id for the '<em>Lieferlaenge Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getLieferlaenge_Type()
	 * @generated
	 */
	int LIEFERLAENGE_TYPE = 193;

	/**
	 * The meta object id for the '<em>Montage Besonders Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getMontage_Besonders_Type()
	 * @generated
	 */
	int MONTAGE_BESONDERS_TYPE = 194;

	/**
	 * The meta object id for the '<em>Montagehoehe Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getMontagehoehe_Type()
	 * @generated
	 */
	int MONTAGEHOEHE_TYPE = 195;

	/**
	 * The meta object id for the '<em>Optik Durchmesser Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getOptik_Durchmesser_Type()
	 * @generated
	 */
	int OPTIK_DURCHMESSER_TYPE = 196;

	/**
	 * The meta object id for the '<em>Pegel Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getPegel_Type()
	 * @generated
	 */
	int PEGEL_TYPE = 197;

	/**
	 * The meta object id for the '<em>Pixel Koordinate XType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getPixel_Koordinate_X_Type()
	 * @generated
	 */
	int PIXEL_KOORDINATE_XTYPE = 198;

	/**
	 * The meta object id for the '<em>Pixel Koordinate YType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getPixel_Koordinate_Y_Type()
	 * @generated
	 */
	int PIXEL_KOORDINATE_YTYPE = 199;

	/**
	 * The meta object id for the '<em>Raeumstrecke DAB Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getRaeumstrecke_DAB_Type()
	 * @generated
	 */
	int RAEUMSTRECKE_DAB_TYPE = 200;

	/**
	 * The meta object id for the '<em>Raeumstrecke DBK Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getRaeumstrecke_DBK_Type()
	 * @generated
	 */
	int RAEUMSTRECKE_DBK_TYPE = 201;

	/**
	 * The meta object id for the '<em>Raeumstrecke DCK Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getRaeumstrecke_DCK_Type()
	 * @generated
	 */
	int RAEUMSTRECKE_DCK_TYPE = 202;

	/**
	 * The meta object id for the '<em>Raeumstrecke DSK Strich Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getRaeumstrecke_DSK_Strich_Type()
	 * @generated
	 */
	int RAEUMSTRECKE_DSK_STRICH_TYPE = 203;

	/**
	 * The meta object id for the '<em>Raeumstrecke Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getRaeumstrecke_Type()
	 * @generated
	 */
	int RAEUMSTRECKE_TYPE = 204;

	/**
	 * The meta object id for the '<em>Schaltgruppe Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSchaltgruppe_Type()
	 * @generated
	 */
	int SCHALTGRUPPE_TYPE = 205;

	/**
	 * The meta object id for the '<em>Schutzbuegel Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSchutzbuegel_Type()
	 * @generated
	 */
	int SCHUTZBUEGEL_TYPE = 206;

	/**
	 * The meta object id for the '<em>Schutzbuegel Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSchutzbuegel_TypeObject()
	 * @generated
	 */
	int SCHUTZBUEGEL_TYPE_OBJECT = 207;

	/**
	 * The meta object id for the '<em>Sicherheitsabstand Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSicherheitsabstand_Type()
	 * @generated
	 */
	int SICHERHEITSABSTAND_TYPE = 208;

	/**
	 * The meta object id for the '<em>Signalverz Errechnet Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSignalverz_Errechnet_Type()
	 * @generated
	 */
	int SIGNALVERZ_ERRECHNET_TYPE = 209;

	/**
	 * The meta object id for the '<em>Signalverz Gewaehlt Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSignalverz_Gewaehlt_Type()
	 * @generated
	 */
	int SIGNALVERZ_GEWAEHLT_TYPE = 210;

	/**
	 * The meta object id for the '<em>Sperrlaenge Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSperrlaenge_Type()
	 * @generated
	 */
	int SPERRLAENGE_TYPE = 211;

	/**
	 * The meta object id for the '<em>Sperrstrecke Fussgaenger Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSperrstrecke_Fussgaenger_Type()
	 * @generated
	 */
	int SPERRSTRECKE_FUSSGAENGER_TYPE = 212;

	/**
	 * The meta object id for the '<em>Sperrstrecke Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getSperrstrecke_Type()
	 * @generated
	 */
	int SPERRSTRECKE_TYPE = 213;

	/**
	 * The meta object id for the '<em>Teilsperrstrecke Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getTeilsperrstrecke_Type()
	 * @generated
	 */
	int TEILSPERRSTRECKE_TYPE = 214;

	/**
	 * The meta object id for the '<em>Teilvorgabezeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getTeilvorgabezeit_Type()
	 * @generated
	 */
	int TEILVORGABEZEIT_TYPE = 215;

	/**
	 * The meta object id for the '<em>Tragkopf Verstellbar Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getTragkopf_Verstellbar_Type()
	 * @generated
	 */
	int TRAGKOPF_VERSTELLBAR_TYPE = 216;

	/**
	 * The meta object id for the '<em>Tragkopf Verstellbar Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getTragkopf_Verstellbar_TypeObject()
	 * @generated
	 */
	int TRAGKOPF_VERSTELLBAR_TYPE_OBJECT = 217;

	/**
	 * The meta object id for the '<em>VMax Schiene Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getV_Max_Schiene_Type()
	 * @generated
	 */
	int VMAX_SCHIENE_TYPE = 218;

	/**
	 * The meta object id for the '<em>VMax Strasse Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getV_Max_Strasse_Type()
	 * @generated
	 */
	int VMAX_STRASSE_TYPE = 219;

	/**
	 * The meta object id for the '<em>VMin Fussweg Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getV_Min_Fussweg_Type()
	 * @generated
	 */
	int VMIN_FUSSWEG_TYPE = 220;

	/**
	 * The meta object id for the '<em>VMin Schiene Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getV_Min_Schiene_Type()
	 * @generated
	 */
	int VMIN_SCHIENE_TYPE = 221;

	/**
	 * The meta object id for the '<em>VMin Strasse Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getV_Min_Strasse_Type()
	 * @generated
	 */
	int VMIN_STRASSE_TYPE = 222;

	/**
	 * The meta object id for the '<em>Vorgeschaltet Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getVorgeschaltet_Type()
	 * @generated
	 */
	int VORGESCHALTET_TYPE = 223;

	/**
	 * The meta object id for the '<em>Vorgeschaltet Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getVorgeschaltet_TypeObject()
	 * @generated
	 */
	int VORGESCHALTET_TYPE_OBJECT = 224;

	/**
	 * The meta object id for the '<em>Winkel Alpha Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getWinkel_Alpha_Type()
	 * @generated
	 */
	int WINKEL_ALPHA_TYPE = 225;

	/**
	 * The meta object id for the '<em>Zeitueberschreitungsmeldung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getZeitueberschreitungsmeldung_Type()
	 * @generated
	 */
	int ZEITUEBERSCHREITUNGSMELDUNG_TYPE = 226;

	/**
	 * The meta object id for the '<em>Zusatzschild Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl#getZusatzschild_Type()
	 * @generated
	 */
	int ZUSATZSCHILD_TYPE = 227;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Abstand_Gehweg_Fahrbahn_TypeClass <em>Abstand Gehweg Fahrbahn Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstand Gehweg Fahrbahn Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Abstand_Gehweg_Fahrbahn_TypeClass
	 * @generated
	 */
	EClass getAbstand_Gehweg_Fahrbahn_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Abstand_Gehweg_Fahrbahn_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Abstand_Gehweg_Fahrbahn_TypeClass#getWert()
	 * @see #getAbstand_Gehweg_Fahrbahn_TypeClass()
	 * @generated
	 */
	EAttribute getAbstand_Gehweg_Fahrbahn_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Akustik_Fussgaenger_TypeClass <em>Akustik Fussgaenger Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Akustik Fussgaenger Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Akustik_Fussgaenger_TypeClass
	 * @generated
	 */
	EClass getAkustik_Fussgaenger_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Akustik_Fussgaenger_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Akustik_Fussgaenger_TypeClass#getWert()
	 * @see #getAkustik_Fussgaenger_TypeClass()
	 * @generated
	 */
	EAttribute getAkustik_Fussgaenger_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Ausrichtung_TypeClass <em>Ausrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ausrichtung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Ausrichtung_TypeClass
	 * @generated
	 */
	EClass getAusrichtung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Ausrichtung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Ausrichtung_TypeClass#getWert()
	 * @see #getAusrichtung_TypeClass()
	 * @generated
	 */
	EAttribute getAusrichtung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Ausrichtung_Winkel_TypeClass <em>Ausrichtung Winkel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ausrichtung Winkel Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Ausrichtung_Winkel_TypeClass
	 * @generated
	 */
	EClass getAusrichtung_Winkel_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Ausrichtung_Winkel_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Ausrichtung_Winkel_TypeClass#getWert()
	 * @see #getAusrichtung_Winkel_TypeClass()
	 * @generated
	 */
	EAttribute getAusrichtung_Winkel_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Auto_Het_TypeClass <em>Auto Het Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Het Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Auto_Het_TypeClass
	 * @generated
	 */
	EClass getAuto_Het_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Auto_Het_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Auto_Het_TypeClass#getWert()
	 * @see #getAuto_Het_TypeClass()
	 * @generated
	 */
	EAttribute getAuto_Het_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Baulast_TypeClass <em>Baulast Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baulast Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Baulast_TypeClass
	 * @generated
	 */
	EClass getBaulast_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Baulast_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Baulast_TypeClass#getWert()
	 * @see #getBaulast_TypeClass()
	 * @generated
	 */
	EAttribute getBaulast_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Baumprofil_TypeClass <em>Baumprofil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baumprofil Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Baumprofil_TypeClass
	 * @generated
	 */
	EClass getBaumprofil_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Baumprofil_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Baumprofil_TypeClass#getWert()
	 * @see #getBaumprofil_TypeClass()
	 * @generated
	 */
	EAttribute getBaumprofil_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Beeinflussung_Strassenverkehr_TypeClass <em>Beeinflussung Strassenverkehr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beeinflussung Strassenverkehr Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Beeinflussung_Strassenverkehr_TypeClass
	 * @generated
	 */
	EClass getBeeinflussung_Strassenverkehr_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Beeinflussung_Strassenverkehr_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Beeinflussung_Strassenverkehr_TypeClass#getWert()
	 * @see #getBeeinflussung_Strassenverkehr_TypeClass()
	 * @generated
	 */
	EAttribute getBeeinflussung_Strassenverkehr_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Bez_Schrankenantrieb_TypeClass <em>Bez Schrankenantrieb Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bez Schrankenantrieb Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Bez_Schrankenantrieb_TypeClass
	 * @generated
	 */
	EClass getBez_Schrankenantrieb_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Bez_Schrankenantrieb_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Bez_Schrankenantrieb_TypeClass#getWert()
	 * @see #getBez_Schrankenantrieb_TypeClass()
	 * @generated
	 */
	EAttribute getBez_Schrankenantrieb_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_BUE_GFR_Eckpunkt_TypeClass <em>Bezeichnung BUE GFR Eckpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung BUE GFR Eckpunkt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_BUE_GFR_Eckpunkt_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_BUE_GFR_Eckpunkt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_BUE_GFR_Eckpunkt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_BUE_GFR_Eckpunkt_TypeClass#getWert()
	 * @see #getBezeichnung_BUE_GFR_Eckpunkt_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_BUE_GFR_Eckpunkt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_GFR_Element_TypeClass <em>Bezeichnung GFR Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung GFR Element Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_GFR_Element_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_GFR_Element_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_GFR_Element_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_GFR_Element_TypeClass#getWert()
	 * @see #getBezeichnung_GFR_Element_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_GFR_Element_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_GFR_Tripelspiegel_TypeClass <em>Bezeichnung GFR Tripelspiegel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung GFR Tripelspiegel Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_GFR_Tripelspiegel_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_GFR_Tripelspiegel_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_GFR_Tripelspiegel_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_GFR_Tripelspiegel_TypeClass#getWert()
	 * @see #getBezeichnung_GFR_Tripelspiegel_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_GFR_Tripelspiegel_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_Verkehrszeichen_TypeClass <em>Bezeichnung Verkehrszeichen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Verkehrszeichen Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_Verkehrszeichen_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Verkehrszeichen_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_Verkehrszeichen_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_Verkehrszeichen_TypeClass#getWert()
	 * @see #getBezeichnung_Verkehrszeichen_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Verkehrszeichen_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Blitzpfeil_TypeClass <em>Blitzpfeil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blitzpfeil Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Blitzpfeil_TypeClass
	 * @generated
	 */
	EClass getBlitzpfeil_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Blitzpfeil_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Blitzpfeil_TypeClass#getWert()
	 * @see #getBlitzpfeil_TypeClass()
	 * @generated
	 */
	EAttribute getBlitzpfeil_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup <em>BUE Abhaengigkeit Fue Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Abhaengigkeit Fue Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup
	 * @generated
	 */
	EClass getBUE_Abhaengigkeit_Fue_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getAutoHet <em>Auto Het</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Het</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getAutoHet()
	 * @see #getBUE_Abhaengigkeit_Fue_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Abhaengigkeit_Fue_AttributeGroup_AutoHet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getFueSchaltfall <em>Fue Schaltfall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fue Schaltfall</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getFueSchaltfall()
	 * @see #getBUE_Abhaengigkeit_Fue_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Abhaengigkeit_Fue_AttributeGroup_FueSchaltfall();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getStoerhaltHaltfall <em>Stoerhalt Haltfall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stoerhalt Haltfall</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getStoerhaltHaltfall()
	 * @see #getBUE_Abhaengigkeit_Fue_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Abhaengigkeit_Fue_AttributeGroup_StoerhaltHaltfall();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getStoerhaltMerkhinweis <em>Stoerhalt Merkhinweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stoerhalt Merkhinweis</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getStoerhaltMerkhinweis()
	 * @see #getBUE_Abhaengigkeit_Fue_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Abhaengigkeit_Fue_AttributeGroup_StoerhaltMerkhinweis();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getZeitueberschreitungsmeldung <em>Zeitueberschreitungsmeldung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zeitueberschreitungsmeldung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getZeitueberschreitungsmeldung()
	 * @see #getBUE_Abhaengigkeit_Fue_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Abhaengigkeit_Fue_AttributeGroup_Zeitueberschreitungsmeldung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage <em>BUE Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage
	 * @generated
	 */
	EClass getBUE_Anlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage#getBezeichnung()
	 * @see #getBUE_Anlage()
	 * @generated
	 */
	EReference getBUE_Anlage_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage#getBUEAnlageAllg <em>BUE Anlage Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Anlage Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage#getBUEAnlageAllg()
	 * @see #getBUE_Anlage()
	 * @generated
	 */
	EReference getBUE_Anlage_BUEAnlageAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage#getIDBUESchnittstelle <em>IDBUE Schnittstelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Schnittstelle</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage#getIDBUESchnittstelle()
	 * @see #getBUE_Anlage()
	 * @generated
	 */
	EReference getBUE_Anlage_IDBUESchnittstelle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup <em>BUE Anlage Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Anlage Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBUE_Anlage_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEBauart <em>BUE Bauart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Bauart</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEBauart()
	 * @see #getBUE_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Allg_AttributeGroup_BUEBauart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEBuestra <em>BUE Buestra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Buestra</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEBuestra()
	 * @see #getBUE_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Allg_AttributeGroup_BUEBuestra();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEMitGFR <em>BUE Mit GFR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Mit GFR</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEMitGFR()
	 * @see #getBUE_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Allg_AttributeGroup_BUEMitGFR();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUESicherungsart <em>BUE Sicherungsart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Sicherungsart</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUESicherungsart()
	 * @see #getBUE_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Allg_AttributeGroup_BUESicherungsart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEStrasse <em>BUE Strasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Strasse</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEStrasse()
	 * @see #getBUE_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Allg_AttributeGroup_BUEStrasse();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUETechnik <em>BUE Technik</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Technik</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUETechnik()
	 * @see #getBUE_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Allg_AttributeGroup_BUETechnik();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup <em>BUE Anlage Fuss Rad Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Anlage Fuss Rad Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup
	 * @generated
	 */
	EClass getBUE_Anlage_Fuss_Rad_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup#getFussRadwegArt <em>Fuss Radweg Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fuss Radweg Art</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup#getFussRadwegArt()
	 * @see #getBUE_Anlage_Fuss_Rad_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Fuss_Rad_AttributeGroup_FussRadwegArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup#getFussRadwegSeite <em>Fuss Radweg Seite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fuss Radweg Seite</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup#getFussRadwegSeite()
	 * @see #getBUE_Anlage_Fuss_Rad_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Fuss_Rad_AttributeGroup_FussRadwegSeite();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse <em>BUE Anlage Strasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Anlage Strasse</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse
	 * @generated
	 */
	EClass getBUE_Anlage_Strasse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse#getBUEAnlageFussRad <em>BUE Anlage Fuss Rad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BUE Anlage Fuss Rad</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse#getBUEAnlageFussRad()
	 * @see #getBUE_Anlage_Strasse()
	 * @generated
	 */
	EReference getBUE_Anlage_Strasse_BUEAnlageFussRad();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse#getBUEAnlageStrasseAllg <em>BUE Anlage Strasse Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Anlage Strasse Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse#getBUEAnlageStrasseAllg()
	 * @see #getBUE_Anlage_Strasse()
	 * @generated
	 */
	EReference getBUE_Anlage_Strasse_BUEAnlageStrasseAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse#getIDBUEAnlage <em>IDBUE Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse#getIDBUEAnlage()
	 * @see #getBUE_Anlage_Strasse()
	 * @generated
	 */
	EReference getBUE_Anlage_Strasse_IDBUEAnlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup <em>BUE Anlage Strasse Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Anlage Strasse Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBUE_Anlage_Strasse_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getBaulast <em>Baulast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Baulast</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getBaulast()
	 * @see #getBUE_Anlage_Strasse_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Strasse_Allg_AttributeGroup_Baulast();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getFahrbahnBefestigung <em>Fahrbahn Befestigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fahrbahn Befestigung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getFahrbahnBefestigung()
	 * @see #getBUE_Anlage_Strasse_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Strasse_Allg_AttributeGroup_FahrbahnBefestigung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getFahrbahnBefestigungGleis <em>Fahrbahn Befestigung Gleis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fahrbahn Befestigung Gleis</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getFahrbahnBefestigungGleis()
	 * @see #getBUE_Anlage_Strasse_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Strasse_Allg_AttributeGroup_FahrbahnBefestigungGleis();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getFahrbahnBreite <em>Fahrbahn Breite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fahrbahn Breite</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getFahrbahnBreite()
	 * @see #getBUE_Anlage_Strasse_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Strasse_Allg_AttributeGroup_FahrbahnBreite();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getKlassifizierung <em>Klassifizierung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Klassifizierung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getKlassifizierung()
	 * @see #getBUE_Anlage_Strasse_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Strasse_Allg_AttributeGroup_Klassifizierung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getKreuzungswinkel <em>Kreuzungswinkel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kreuzungswinkel</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getKreuzungswinkel()
	 * @see #getBUE_Anlage_Strasse_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_Strasse_Allg_AttributeGroup_Kreuzungswinkel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V <em>BUE Anlage V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Anlage V</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V
	 * @generated
	 */
	EClass getBUE_Anlage_V();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V#getBUEAnlageVAllg <em>BUE Anlage VAllg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Anlage VAllg</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V#getBUEAnlageVAllg()
	 * @see #getBUE_Anlage_V()
	 * @generated
	 */
	EReference getBUE_Anlage_V_BUEAnlageVAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V#getIDBUEAnlage <em>IDBUE Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V#getIDBUEAnlage()
	 * @see #getBUE_Anlage_V()
	 * @generated
	 */
	EReference getBUE_Anlage_V_IDBUEAnlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup <em>BUE Anlage VAllg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Anlage VAllg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBUE_Anlage_V_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMaxSchiene <em>VMax Schiene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VMax Schiene</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMaxSchiene()
	 * @see #getBUE_Anlage_V_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_V_Allg_AttributeGroup_VMaxSchiene();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMaxStrasse <em>VMax Strasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VMax Strasse</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMaxStrasse()
	 * @see #getBUE_Anlage_V_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_V_Allg_AttributeGroup_VMaxStrasse();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMinFussweg <em>VMin Fussweg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VMin Fussweg</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMinFussweg()
	 * @see #getBUE_Anlage_V_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_V_Allg_AttributeGroup_VMinFussweg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMinSchiene <em>VMin Schiene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VMin Schiene</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMinSchiene()
	 * @see #getBUE_Anlage_V_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_V_Allg_AttributeGroup_VMinSchiene();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMinStrasse <em>VMin Strasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VMin Strasse</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMinStrasse()
	 * @see #getBUE_Anlage_V_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Anlage_V_Allg_AttributeGroup_VMinStrasse();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Ausschaltung <em>BUE Ausschaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Ausschaltung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Ausschaltung
	 * @generated
	 */
	EClass getBUE_Ausschaltung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Ausschaltung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Gleisbez Gefahrraum</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Ausschaltung#getIDBUEGleisbezGefahrraum()
	 * @see #getBUE_Ausschaltung()
	 * @generated
	 */
	EReference getBUE_Ausschaltung_IDBUEGleisbezGefahrraum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bauart_TypeClass <em>BUE Bauart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Bauart Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bauart_TypeClass
	 * @generated
	 */
	EClass getBUE_Bauart_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bauart_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bauart_TypeClass#getWert()
	 * @see #getBUE_Bauart_TypeClass()
	 * @generated
	 */
	EAttribute getBUE_Bauart_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup <em>BUE Bedien Anz Element Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Bedien Anz Element Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBUE_Bedien_Anz_Element_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getBUEHandschalteinrichtung <em>BUE Handschalteinrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Handschalteinrichtung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getBUEHandschalteinrichtung()
	 * @see #getBUE_Bedien_Anz_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Bedien_Anz_Element_Allg_AttributeGroup_BUEHandschalteinrichtung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bedien Anzeige Element</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDBedienAnzeigeElement()
	 * @see #getBUE_Bedien_Anz_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Bedien_Anz_Element_Allg_AttributeGroup_IDBedienAnzeigeElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDHandschaltWirkfunktion <em>ID Handschalt Wirkfunktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Handschalt Wirkfunktion</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDHandschaltWirkfunktion()
	 * @see #getBUE_Bedien_Anz_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Bedien_Anz_Element_Allg_AttributeGroup_IDHandschaltWirkfunktion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anzeige_Element <em>BUE Bedien Anzeige Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Bedien Anzeige Element</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anzeige_Element
	 * @generated
	 */
	EClass getBUE_Bedien_Anzeige_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anzeige_Element#getBUEBedienAnzElementAllg <em>BUE Bedien Anz Element Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Bedien Anz Element Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anzeige_Element#getBUEBedienAnzElementAllg()
	 * @see #getBUE_Bedien_Anzeige_Element()
	 * @generated
	 */
	EReference getBUE_Bedien_Anzeige_Element_BUEBedienAnzElementAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Buestra_TypeClass <em>BUE Buestra Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Buestra Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Buestra_TypeClass
	 * @generated
	 */
	EClass getBUE_Buestra_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Buestra_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Buestra_TypeClass#getWert()
	 * @see #getBUE_Buestra_TypeClass()
	 * @generated
	 */
	EAttribute getBUE_Buestra_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung <em>BUE Deckendes Signal Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Deckendes Signal Zuordnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung
	 * @generated
	 */
	EClass getBUE_Deckendes_Signal_Zuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Einschaltung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDBUEEinschaltung()
	 * @see #getBUE_Deckendes_Signal_Zuordnung()
	 * @generated
	 */
	EReference getBUE_Deckendes_Signal_Zuordnung_IDBUEEinschaltung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDSignal <em>ID Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDSignal()
	 * @see #getBUE_Deckendes_Signal_Zuordnung()
	 * @generated
	 */
	EReference getBUE_Deckendes_Signal_Zuordnung_IDSignal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getSicherheitsabstand <em>Sicherheitsabstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sicherheitsabstand</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getSicherheitsabstand()
	 * @see #getBUE_Deckendes_Signal_Zuordnung()
	 * @generated
	 */
	EReference getBUE_Deckendes_Signal_Zuordnung_Sicherheitsabstand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung <em>BUE Einschaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Einschaltung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung
	 * @generated
	 */
	EClass getBUE_Einschaltung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung#getBUEEinschaltungHp <em>BUE Einschaltung Hp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Einschaltung Hp</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung#getBUEEinschaltungHp()
	 * @see #getBUE_Einschaltung()
	 * @generated
	 */
	EReference getBUE_Einschaltung_BUEEinschaltungHp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung#getBUEFunktionsueberwachung <em>BUE Funktionsueberwachung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Funktionsueberwachung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung#getBUEFunktionsueberwachung()
	 * @see #getBUE_Einschaltung()
	 * @generated
	 */
	EReference getBUE_Einschaltung_BUEFunktionsueberwachung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup <em>BUE Einschaltung Hp Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Einschaltung Hp Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup
	 * @generated
	 */
	EClass getBUE_Einschaltung_Hp_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getEinschaltverzErrechnet <em>Einschaltverz Errechnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einschaltverz Errechnet</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getEinschaltverzErrechnet()
	 * @see #getBUE_Einschaltung_Hp_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Einschaltung_Hp_AttributeGroup_EinschaltverzErrechnet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getEinschaltverzGewaehlt <em>Einschaltverz Gewaehlt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einschaltverz Gewaehlt</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getEinschaltverzGewaehlt()
	 * @see #getBUE_Einschaltung_Hp_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Einschaltung_Hp_AttributeGroup_EinschaltverzGewaehlt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getKurzzugschaltung <em>Kurzzugschaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kurzzugschaltung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getKurzzugschaltung()
	 * @see #getBUE_Einschaltung_Hp_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Einschaltung_Hp_AttributeGroup_Kurzzugschaltung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getSignalverzErrechnet <em>Signalverz Errechnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signalverz Errechnet</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getSignalverzErrechnet()
	 * @see #getBUE_Einschaltung_Hp_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Einschaltung_Hp_AttributeGroup_SignalverzErrechnet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getSignalverzGewaehlt <em>Signalverz Gewaehlt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signalverz Gewaehlt</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getSignalverzGewaehlt()
	 * @see #getBUE_Einschaltung_Hp_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Einschaltung_Hp_AttributeGroup_SignalverzGewaehlt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getTeilvorgabezeit <em>Teilvorgabezeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Teilvorgabezeit</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getTeilvorgabezeit()
	 * @see #getBUE_Einschaltung_Hp_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Einschaltung_Hp_AttributeGroup_Teilvorgabezeit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Zuordnung <em>BUE Einschaltung Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Einschaltung Zuordnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Zuordnung
	 * @generated
	 */
	EClass getBUE_Einschaltung_Zuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Einschaltung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEEinschaltung()
	 * @see #getBUE_Einschaltung_Zuordnung()
	 * @generated
	 */
	EReference getBUE_Einschaltung_Zuordnung_IDBUEEinschaltung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Gleisbez Gefahrraum</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEGleisbezGefahrraum()
	 * @see #getBUE_Einschaltung_Zuordnung()
	 * @generated
	 */
	EReference getBUE_Einschaltung_Zuordnung_IDBUEGleisbezGefahrraum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Funktionsueberwachung_TypeClass <em>BUE Funktionsueberwachung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Funktionsueberwachung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Funktionsueberwachung_TypeClass
	 * @generated
	 */
	EClass getBUE_Funktionsueberwachung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Funktionsueberwachung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Funktionsueberwachung_TypeClass#getWert()
	 * @see #getBUE_Funktionsueberwachung_TypeClass()
	 * @generated
	 */
	EAttribute getBUE_Funktionsueberwachung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gefahrraum_Eckpunkt <em>BUE Gefahrraum Eckpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Gefahrraum Eckpunkt</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gefahrraum_Eckpunkt
	 * @generated
	 */
	EClass getBUE_Gefahrraum_Eckpunkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gefahrraum_Eckpunkt#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gefahrraum_Eckpunkt#getBezeichnung()
	 * @see #getBUE_Gefahrraum_Eckpunkt()
	 * @generated
	 */
	EReference getBUE_Gefahrraum_Eckpunkt_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gefahrraum_Eckpunkt#getIDBUEAnlage <em>IDBUE Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gefahrraum_Eckpunkt#getIDBUEAnlage()
	 * @see #getBUE_Gefahrraum_Eckpunkt()
	 * @generated
	 */
	EReference getBUE_Gefahrraum_Eckpunkt_IDBUEAnlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup <em>BUE Gefahrraum Eckpunkt Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Gefahrraum Eckpunkt Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup#getBezeichnungBUEGFREckpunkt <em>Bezeichnung BUEGFR Eckpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung BUEGFR Eckpunkt</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup#getBezeichnungBUEGFREckpunkt()
	 * @see #getBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup_BezeichnungBUEGFREckpunkt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum <em>BUE Gleisbezogener Gefahrraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Gleisbezogener Gefahrraum</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum
	 * @generated
	 */
	EClass getBUE_Gleisbezogener_Gefahrraum();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum#getErsatzsteckerGleisbezogen <em>Ersatzstecker Gleisbezogen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ersatzstecker Gleisbezogen</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum#getErsatzsteckerGleisbezogen()
	 * @see #getBUE_Gleisbezogener_Gefahrraum()
	 * @generated
	 */
	EReference getBUE_Gleisbezogener_Gefahrraum_ErsatzsteckerGleisbezogen();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum#getGleisAmBue <em>Gleis Am Bue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gleis Am Bue</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum#getGleisAmBue()
	 * @see #getBUE_Gleisbezogener_Gefahrraum()
	 * @generated
	 */
	EReference getBUE_Gleisbezogener_Gefahrraum_GleisAmBue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum#getIDBUEAnlage <em>IDBUE Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum#getIDBUEAnlage()
	 * @see #getBUE_Gleisbezogener_Gefahrraum()
	 * @generated
	 */
	EReference getBUE_Gleisbezogener_Gefahrraum_IDBUEAnlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Handschalteinrichtung_TypeClass <em>BUE Handschalteinrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Handschalteinrichtung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Handschalteinrichtung_TypeClass
	 * @generated
	 */
	EClass getBUE_Handschalteinrichtung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Handschalteinrichtung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Handschalteinrichtung_TypeClass#getWert()
	 * @see #getBUE_Handschalteinrichtung_TypeClass()
	 * @generated
	 */
	EAttribute getBUE_Handschalteinrichtung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kante <em>BUE Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Kante</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kante
	 * @generated
	 */
	EClass getBUE_Kante();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kante#getIDBUEAnlage <em>IDBUE Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kante#getIDBUEAnlage()
	 * @see #getBUE_Kante()
	 * @generated
	 */
	EReference getBUE_Kante_IDBUEAnlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan <em>BUE Kreuzungsplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Kreuzungsplan</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan
	 * @generated
	 */
	EClass getBUE_Kreuzungsplan();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan#getBUEKreuzungsplanKoordinaten <em>BUE Kreuzungsplan Koordinaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BUE Kreuzungsplan Koordinaten</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan#getBUEKreuzungsplanKoordinaten()
	 * @see #getBUE_Kreuzungsplan()
	 * @generated
	 */
	EReference getBUE_Kreuzungsplan_BUEKreuzungsplanKoordinaten();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Kreuzungsplan</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan()
	 * @see #getBUE_Kreuzungsplan()
	 * @generated
	 */
	EReference getBUE_Kreuzungsplan_IDAnhangKreuzungsplan();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup <em>BUE Kreuzungsplan Koordinaten Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Kreuzungsplan Koordinaten Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup
	 * @generated
	 */
	EClass getBUE_Kreuzungsplan_Koordinaten_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup#getIDGEOPunkt <em>IDGEO Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDGEO Punkt</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup#getIDGEOPunkt()
	 * @see #getBUE_Kreuzungsplan_Koordinaten_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Kreuzungsplan_Koordinaten_AttributeGroup_IDGEOPunkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup#getPixelKoordinateX <em>Pixel Koordinate X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pixel Koordinate X</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup#getPixelKoordinateX()
	 * @see #getBUE_Kreuzungsplan_Koordinaten_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Kreuzungsplan_Koordinaten_AttributeGroup_PixelKoordinateX();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup#getPixelKoordinateY <em>Pixel Koordinate Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pixel Koordinate Y</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup#getPixelKoordinateY()
	 * @see #getBUE_Kreuzungsplan_Koordinaten_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Kreuzungsplan_Koordinaten_AttributeGroup_PixelKoordinateY();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Mit_GFR_TypeClass <em>BUE Mit GFR Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Mit GFR Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Mit_GFR_TypeClass
	 * @generated
	 */
	EClass getBUE_Mit_GFR_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Mit_GFR_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Mit_GFR_TypeClass#getWert()
	 * @see #getBUE_Mit_GFR_TypeClass()
	 * @generated
	 */
	EAttribute getBUE_Mit_GFR_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Nachlaufzeit_TypeClass <em>BUE Nachlaufzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Nachlaufzeit Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Nachlaufzeit_TypeClass
	 * @generated
	 */
	EClass getBUE_Nachlaufzeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Nachlaufzeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Nachlaufzeit_TypeClass#getWert()
	 * @see #getBUE_Nachlaufzeit_TypeClass()
	 * @generated
	 */
	EAttribute getBUE_Nachlaufzeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Neigung_TypeClass <em>BUE Neigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Neigung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Neigung_TypeClass
	 * @generated
	 */
	EClass getBUE_Neigung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Neigung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Neigung_TypeClass#getWert()
	 * @see #getBUE_Neigung_TypeClass()
	 * @generated
	 */
	EAttribute getBUE_Neigung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle <em>BUE Schnittstelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Schnittstelle</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle
	 * @generated
	 */
	EClass getBUE_Schnittstelle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle#getBUEAbhaengigkeitFue <em>BUE Abhaengigkeit Fue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Abhaengigkeit Fue</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle#getBUEAbhaengigkeitFue()
	 * @see #getBUE_Schnittstelle()
	 * @generated
	 */
	EReference getBUE_Schnittstelle_BUEAbhaengigkeitFue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle#getBUESchnittstelleAllg <em>BUE Schnittstelle Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Schnittstelle Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle#getBUESchnittstelleAllg()
	 * @see #getBUE_Schnittstelle()
	 * @generated
	 */
	EReference getBUE_Schnittstelle_BUESchnittstelleAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle#getIDStellelement <em>ID Stellelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Stellelement</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle#getIDStellelement()
	 * @see #getBUE_Schnittstelle()
	 * @generated
	 */
	EReference getBUE_Schnittstelle_IDStellelement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup <em>BUE Schnittstelle Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Schnittstelle Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBUE_Schnittstelle_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getBUENachlaufzeit <em>BUE Nachlaufzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Nachlaufzeit</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getBUENachlaufzeit()
	 * @see #getBUE_Schnittstelle_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Schnittstelle_Allg_AttributeGroup_BUENachlaufzeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getBUEVorlaufzeit <em>BUE Vorlaufzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Vorlaufzeit</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getBUEVorlaufzeit()
	 * @see #getBUE_Schnittstelle_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Schnittstelle_Allg_AttributeGroup_BUEVorlaufzeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getHpErsatzstecker <em>Hp Ersatzstecker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hp Ersatzstecker</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getHpErsatzstecker()
	 * @see #getBUE_Schnittstelle_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Schnittstelle_Allg_AttributeGroup_HpErsatzstecker();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getLFUEImpuls <em>LFUE Impuls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LFUE Impuls</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getLFUEImpuls()
	 * @see #getBUE_Schnittstelle_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBUE_Schnittstelle_Allg_AttributeGroup_LFUEImpuls();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Sicherungsart_TypeClass <em>BUE Sicherungsart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Sicherungsart Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Sicherungsart_TypeClass
	 * @generated
	 */
	EClass getBUE_Sicherungsart_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Sicherungsart_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Sicherungsart_TypeClass#getWert()
	 * @see #getBUE_Sicherungsart_TypeClass()
	 * @generated
	 */
	EAttribute getBUE_Sicherungsart_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Sicherungszeit_TypeClass <em>BUE Sicherungszeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Sicherungszeit Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Sicherungszeit_TypeClass
	 * @generated
	 */
	EClass getBUE_Sicherungszeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Sicherungszeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Sicherungszeit_TypeClass#getWert()
	 * @see #getBUE_Sicherungszeit_TypeClass()
	 * @generated
	 */
	EAttribute getBUE_Sicherungszeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Spezifisches_Signal <em>BUE Spezifisches Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Spezifisches Signal</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Spezifisches_Signal
	 * @generated
	 */
	EClass getBUE_Spezifisches_Signal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Spezifisches_Signal#getIDSignal <em>ID Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Spezifisches_Signal#getIDSignal()
	 * @see #getBUE_Spezifisches_Signal()
	 * @generated
	 */
	EReference getBUE_Spezifisches_Signal_IDSignal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEAnlage <em>IDBUE Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEAnlage()
	 * @see #getBUE_Spezifisches_Signal()
	 * @generated
	 */
	EReference getBUE_Spezifisches_Signal_IDBUEAnlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Einschaltung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEEinschaltung()
	 * @see #getBUE_Spezifisches_Signal()
	 * @generated
	 */
	EReference getBUE_Spezifisches_Signal_IDBUEEinschaltung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Strasse_TypeClass <em>BUE Strasse Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Strasse Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Strasse_TypeClass
	 * @generated
	 */
	EClass getBUE_Strasse_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Strasse_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Strasse_TypeClass#getWert()
	 * @see #getBUE_Strasse_TypeClass()
	 * @generated
	 */
	EAttribute getBUE_Strasse_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Technik_TypeClass <em>BUE Technik Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Technik Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Technik_TypeClass
	 * @generated
	 */
	EClass getBUE_Technik_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Technik_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Technik_TypeClass#getWert()
	 * @see #getBUE_Technik_TypeClass()
	 * @generated
	 */
	EAttribute getBUE_Technik_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Vorlaufzeit_TypeClass <em>BUE Vorlaufzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Vorlaufzeit Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Vorlaufzeit_TypeClass
	 * @generated
	 */
	EClass getBUE_Vorlaufzeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Vorlaufzeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_Vorlaufzeit_TypeClass#getWert()
	 * @see #getBUE_Vorlaufzeit_TypeClass()
	 * @generated
	 */
	EAttribute getBUE_Vorlaufzeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_WS_Fstr_Zuordnung <em>BUE WS Fstr Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE WS Fstr Zuordnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_WS_Fstr_Zuordnung
	 * @generated
	 */
	EClass getBUE_WS_Fstr_Zuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Einschaltung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDBUEEinschaltung()
	 * @see #getBUE_WS_Fstr_Zuordnung()
	 * @generated
	 */
	EReference getBUE_WS_Fstr_Zuordnung_IDBUEEinschaltung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr Zug Rangier</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDFstrZugRangier()
	 * @see #getBUE_WS_Fstr_Zuordnung()
	 * @generated
	 */
	EReference getBUE_WS_Fstr_Zuordnung_IDFstrZugRangier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Einschaltverz_Errechnet_TypeClass <em>Einschaltverz Errechnet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einschaltverz Errechnet Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Einschaltverz_Errechnet_TypeClass
	 * @generated
	 */
	EClass getEinschaltverz_Errechnet_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Einschaltverz_Errechnet_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Einschaltverz_Errechnet_TypeClass#getWert()
	 * @see #getEinschaltverz_Errechnet_TypeClass()
	 * @generated
	 */
	EAttribute getEinschaltverz_Errechnet_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Einschaltverz_Gewaehlt_TypeClass <em>Einschaltverz Gewaehlt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einschaltverz Gewaehlt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Einschaltverz_Gewaehlt_TypeClass
	 * @generated
	 */
	EClass getEinschaltverz_Gewaehlt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Einschaltverz_Gewaehlt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Einschaltverz_Gewaehlt_TypeClass#getWert()
	 * @see #getEinschaltverz_Gewaehlt_TypeClass()
	 * @generated
	 */
	EAttribute getEinschaltverz_Gewaehlt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Ersatzstecker_Gleisbezogen_TypeClass <em>Ersatzstecker Gleisbezogen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ersatzstecker Gleisbezogen Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Ersatzstecker_Gleisbezogen_TypeClass
	 * @generated
	 */
	EClass getErsatzstecker_Gleisbezogen_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Ersatzstecker_Gleisbezogen_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Ersatzstecker_Gleisbezogen_TypeClass#getWert()
	 * @see #getErsatzstecker_Gleisbezogen_TypeClass()
	 * @generated
	 */
	EAttribute getErsatzstecker_Gleisbezogen_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Fahrbahn_Befestigung_Gleis_TypeClass <em>Fahrbahn Befestigung Gleis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fahrbahn Befestigung Gleis Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Fahrbahn_Befestigung_Gleis_TypeClass
	 * @generated
	 */
	EClass getFahrbahn_Befestigung_Gleis_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Fahrbahn_Befestigung_Gleis_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Fahrbahn_Befestigung_Gleis_TypeClass#getWert()
	 * @see #getFahrbahn_Befestigung_Gleis_TypeClass()
	 * @generated
	 */
	EAttribute getFahrbahn_Befestigung_Gleis_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Fahrbahn_Befestigung_TypeClass <em>Fahrbahn Befestigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fahrbahn Befestigung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Fahrbahn_Befestigung_TypeClass
	 * @generated
	 */
	EClass getFahrbahn_Befestigung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Fahrbahn_Befestigung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Fahrbahn_Befestigung_TypeClass#getWert()
	 * @see #getFahrbahn_Befestigung_TypeClass()
	 * @generated
	 */
	EAttribute getFahrbahn_Befestigung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Fahrbahn_Breite_TypeClass <em>Fahrbahn Breite Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fahrbahn Breite Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Fahrbahn_Breite_TypeClass
	 * @generated
	 */
	EClass getFahrbahn_Breite_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Fahrbahn_Breite_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Fahrbahn_Breite_TypeClass#getWert()
	 * @see #getFahrbahn_Breite_TypeClass()
	 * @generated
	 */
	EAttribute getFahrbahn_Breite_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Fue_Schaltfall_TypeClass <em>Fue Schaltfall Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fue Schaltfall Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Fue_Schaltfall_TypeClass
	 * @generated
	 */
	EClass getFue_Schaltfall_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Fue_Schaltfall_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Fue_Schaltfall_TypeClass#getWert()
	 * @see #getFue_Schaltfall_TypeClass()
	 * @generated
	 */
	EAttribute getFue_Schaltfall_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Fuss_Radweg_Art_TypeClass <em>Fuss Radweg Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuss Radweg Art Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Fuss_Radweg_Art_TypeClass
	 * @generated
	 */
	EClass getFuss_Radweg_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Fuss_Radweg_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Fuss_Radweg_Art_TypeClass#getWert()
	 * @see #getFuss_Radweg_Art_TypeClass()
	 * @generated
	 */
	EAttribute getFuss_Radweg_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Fuss_Radweg_Seite_TypeClass <em>Fuss Radweg Seite Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuss Radweg Seite Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Fuss_Radweg_Seite_TypeClass
	 * @generated
	 */
	EClass getFuss_Radweg_Seite_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Fuss_Radweg_Seite_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Fuss_Radweg_Seite_TypeClass#getWert()
	 * @see #getFuss_Radweg_Seite_TypeClass()
	 * @generated
	 */
	EAttribute getFuss_Radweg_Seite_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage <em>GFR Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GFR Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage
	 * @generated
	 */
	EClass getGFR_Anlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage#getGFRAnlageAllg <em>GFR Anlage Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GFR Anlage Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage#getGFRAnlageAllg()
	 * @see #getGFR_Anlage()
	 * @generated
	 */
	EReference getGFR_Anlage_GFRAnlageAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage#getIDBUEAnlage <em>IDBUE Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage#getIDBUEAnlage()
	 * @see #getGFR_Anlage()
	 * @generated
	 */
	EReference getGFR_Anlage_IDBUEAnlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup <em>GFR Anlage Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GFR Anlage Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup
	 * @generated
	 */
	EClass getGFR_Anlage_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getBUESicherungszeit <em>BUE Sicherungszeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Sicherungszeit</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getBUESicherungszeit()
	 * @see #getGFR_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGFR_Anlage_Allg_AttributeGroup_BUESicherungszeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getGFRArt <em>GFR Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GFR Art</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getGFRArt()
	 * @see #getGFR_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGFR_Anlage_Allg_AttributeGroup_GFRArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getGFRTyp <em>GFR Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GFR Typ</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getGFRTyp()
	 * @see #getGFR_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGFR_Anlage_Allg_AttributeGroup_GFRTyp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hersteller</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getHersteller()
	 * @see #getGFR_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGFR_Anlage_Allg_AttributeGroup_Hersteller();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Art_TypeClass <em>GFR Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GFR Art Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Art_TypeClass
	 * @generated
	 */
	EClass getGFR_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Art_TypeClass#getWert()
	 * @see #getGFR_Art_TypeClass()
	 * @generated
	 */
	EAttribute getGFR_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element <em>GFR Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GFR Element</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element
	 * @generated
	 */
	EClass getGFR_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element#getBezeichnung()
	 * @see #getGFR_Element()
	 * @generated
	 */
	EReference getGFR_Element_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element#getIDGFRAnlage <em>IDGFR Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDGFR Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element#getIDGFRAnlage()
	 * @see #getGFR_Element()
	 * @generated
	 */
	EReference getGFR_Element_IDGFRAnlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element#getIDUnterbringung <em>ID Unterbringung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Unterbringung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element#getIDUnterbringung()
	 * @see #getGFR_Element()
	 * @generated
	 */
	EReference getGFR_Element_IDUnterbringung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element#getBUENeigung <em>BUE Neigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Neigung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element#getBUENeigung()
	 * @see #getGFR_Element()
	 * @generated
	 */
	EReference getGFR_Element_BUENeigung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element#getGFRNeigung <em>GFR Neigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GFR Neigung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element#getGFRNeigung()
	 * @see #getGFR_Element()
	 * @generated
	 */
	EReference getGFR_Element_GFRNeigung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element_Bezeichnung_AttributeGroup <em>GFR Element Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GFR Element Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getGFR_Element_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element_Bezeichnung_AttributeGroup#getBezeichnungGFRElement <em>Bezeichnung GFR Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung GFR Element</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element_Bezeichnung_AttributeGroup#getBezeichnungGFRElement()
	 * @see #getGFR_Element_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getGFR_Element_Bezeichnung_AttributeGroup_BezeichnungGFRElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Neigung_TypeClass <em>GFR Neigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GFR Neigung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Neigung_TypeClass
	 * @generated
	 */
	EClass getGFR_Neigung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Neigung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Neigung_TypeClass#getWert()
	 * @see #getGFR_Neigung_TypeClass()
	 * @generated
	 */
	EAttribute getGFR_Neigung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel <em>GFR Tripelspiegel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GFR Tripelspiegel</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel
	 * @generated
	 */
	EClass getGFR_Tripelspiegel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel#getBezeichnung()
	 * @see #getGFR_Tripelspiegel()
	 * @generated
	 */
	EReference getGFR_Tripelspiegel_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel#getGFRTripelspiegelAllg <em>GFR Tripelspiegel Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GFR Tripelspiegel Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel#getGFRTripelspiegelAllg()
	 * @see #getGFR_Tripelspiegel()
	 * @generated
	 */
	EReference getGFR_Tripelspiegel_GFRTripelspiegelAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel#getIDGFRAnlage <em>IDGFR Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDGFR Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel#getIDGFRAnlage()
	 * @see #getGFR_Tripelspiegel()
	 * @generated
	 */
	EReference getGFR_Tripelspiegel_IDGFRAnlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup <em>GFR Tripelspiegel Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GFR Tripelspiegel Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup
	 * @generated
	 */
	EClass getGFR_Tripelspiegel_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup#getMontagehoehe <em>Montagehoehe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Montagehoehe</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup#getMontagehoehe()
	 * @see #getGFR_Tripelspiegel_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGFR_Tripelspiegel_Allg_AttributeGroup_Montagehoehe();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup#getPegel <em>Pegel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pegel</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup#getPegel()
	 * @see #getGFR_Tripelspiegel_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGFR_Tripelspiegel_Allg_AttributeGroup_Pegel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup#getWinkelAlpha <em>Winkel Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Winkel Alpha</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup#getWinkelAlpha()
	 * @see #getGFR_Tripelspiegel_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGFR_Tripelspiegel_Allg_AttributeGroup_WinkelAlpha();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Bezeichnung_AttributeGroup <em>GFR Tripelspiegel Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GFR Tripelspiegel Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getGFR_Tripelspiegel_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Bezeichnung_AttributeGroup#getBezeichnungGFRTripelspiegel <em>Bezeichnung GFR Tripelspiegel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung GFR Tripelspiegel</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Bezeichnung_AttributeGroup#getBezeichnungGFRTripelspiegel()
	 * @see #getGFR_Tripelspiegel_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getGFR_Tripelspiegel_Bezeichnung_AttributeGroup_BezeichnungGFRTripelspiegel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Typ_TypeClass <em>GFR Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GFR Typ Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Typ_TypeClass
	 * @generated
	 */
	EClass getGFR_Typ_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Typ_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.GFR_Typ_TypeClass#getWert()
	 * @see #getGFR_Typ_TypeClass()
	 * @generated
	 */
	EAttribute getGFR_Typ_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Gitterbehang_TypeClass <em>Gitterbehang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gitterbehang Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Gitterbehang_TypeClass
	 * @generated
	 */
	EClass getGitterbehang_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Gitterbehang_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Gitterbehang_TypeClass#getWert()
	 * @see #getGitterbehang_TypeClass()
	 * @generated
	 */
	EAttribute getGitterbehang_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Gleis_Am_Bue_TypeClass <em>Gleis Am Bue Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleis Am Bue Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Gleis_Am_Bue_TypeClass
	 * @generated
	 */
	EClass getGleis_Am_Bue_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Gleis_Am_Bue_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Gleis_Am_Bue_TypeClass#getWert()
	 * @see #getGleis_Am_Bue_TypeClass()
	 * @generated
	 */
	EAttribute getGleis_Am_Bue_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Hersteller_TypeClass <em>Hersteller Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hersteller Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Hersteller_TypeClass
	 * @generated
	 */
	EClass getHersteller_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Hersteller_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Hersteller_TypeClass#getWert()
	 * @see #getHersteller_TypeClass()
	 * @generated
	 */
	EAttribute getHersteller_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Hp_Ersatzstecker_TypeClass <em>Hp Ersatzstecker Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp Ersatzstecker Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Hp_Ersatzstecker_TypeClass
	 * @generated
	 */
	EClass getHp_Ersatzstecker_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Hp_Ersatzstecker_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Hp_Ersatzstecker_TypeClass#getWert()
	 * @see #getHp_Ersatzstecker_TypeClass()
	 * @generated
	 */
	EAttribute getHp_Ersatzstecker_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Klassifizierung_TypeClass <em>Klassifizierung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Klassifizierung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Klassifizierung_TypeClass
	 * @generated
	 */
	EClass getKlassifizierung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Klassifizierung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Klassifizierung_TypeClass#getWert()
	 * @see #getKlassifizierung_TypeClass()
	 * @generated
	 */
	EAttribute getKlassifizierung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Kontrastblende_TypeClass <em>Kontrastblende Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kontrastblende Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Kontrastblende_TypeClass
	 * @generated
	 */
	EClass getKontrastblende_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Kontrastblende_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Kontrastblende_TypeClass#getWert()
	 * @see #getKontrastblende_TypeClass()
	 * @generated
	 */
	EAttribute getKontrastblende_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Kreuzungswinkel_TypeClass <em>Kreuzungswinkel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kreuzungswinkel Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Kreuzungswinkel_TypeClass
	 * @generated
	 */
	EClass getKreuzungswinkel_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Kreuzungswinkel_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Kreuzungswinkel_TypeClass#getWert()
	 * @see #getKreuzungswinkel_TypeClass()
	 * @generated
	 */
	EAttribute getKreuzungswinkel_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Kurzzugschaltung_TypeClass <em>Kurzzugschaltung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kurzzugschaltung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Kurzzugschaltung_TypeClass
	 * @generated
	 */
	EClass getKurzzugschaltung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Kurzzugschaltung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Kurzzugschaltung_TypeClass#getWert()
	 * @see #getKurzzugschaltung_TypeClass()
	 * @generated
	 */
	EAttribute getKurzzugschaltung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Lagerung_Art_TypeClass <em>Lagerung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lagerung Art Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Lagerung_Art_TypeClass
	 * @generated
	 */
	EClass getLagerung_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Lagerung_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Lagerung_Art_TypeClass#getWert()
	 * @see #getLagerung_Art_TypeClass()
	 * @generated
	 */
	EAttribute getLagerung_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.LFUE_Impuls_TypeClass <em>LFUE Impuls Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LFUE Impuls Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.LFUE_Impuls_TypeClass
	 * @generated
	 */
	EClass getLFUE_Impuls_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.LFUE_Impuls_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.LFUE_Impuls_TypeClass#getWert()
	 * @see #getLFUE_Impuls_TypeClass()
	 * @generated
	 */
	EAttribute getLFUE_Impuls_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Lieferlaenge_TypeClass <em>Lieferlaenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lieferlaenge Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Lieferlaenge_TypeClass
	 * @generated
	 */
	EClass getLieferlaenge_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Lieferlaenge_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Lieferlaenge_TypeClass#getWert()
	 * @see #getLieferlaenge_TypeClass()
	 * @generated
	 */
	EAttribute getLieferlaenge_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Montage_Ausgleichsgewichte_TypeClass <em>Montage Ausgleichsgewichte Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Montage Ausgleichsgewichte Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Montage_Ausgleichsgewichte_TypeClass
	 * @generated
	 */
	EClass getMontage_Ausgleichsgewichte_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Montage_Ausgleichsgewichte_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Montage_Ausgleichsgewichte_TypeClass#getWert()
	 * @see #getMontage_Ausgleichsgewichte_TypeClass()
	 * @generated
	 */
	EAttribute getMontage_Ausgleichsgewichte_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Montage_Besonders_TypeClass <em>Montage Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Montage Besonders Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Montage_Besonders_TypeClass
	 * @generated
	 */
	EClass getMontage_Besonders_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Montage_Besonders_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Montage_Besonders_TypeClass#getWert()
	 * @see #getMontage_Besonders_TypeClass()
	 * @generated
	 */
	EAttribute getMontage_Besonders_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Montagehoehe_TypeClass <em>Montagehoehe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Montagehoehe Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Montagehoehe_TypeClass
	 * @generated
	 */
	EClass getMontagehoehe_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Montagehoehe_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Montagehoehe_TypeClass#getWert()
	 * @see #getMontagehoehe_TypeClass()
	 * @generated
	 */
	EAttribute getMontagehoehe_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Optik_Durchmesser_TypeClass <em>Optik Durchmesser Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optik Durchmesser Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Optik_Durchmesser_TypeClass
	 * @generated
	 */
	EClass getOptik_Durchmesser_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Optik_Durchmesser_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Optik_Durchmesser_TypeClass#getWert()
	 * @see #getOptik_Durchmesser_TypeClass()
	 * @generated
	 */
	EAttribute getOptik_Durchmesser_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Optik_Symbolmaske_TypeClass <em>Optik Symbolmaske Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optik Symbolmaske Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Optik_Symbolmaske_TypeClass
	 * @generated
	 */
	EClass getOptik_Symbolmaske_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Optik_Symbolmaske_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Optik_Symbolmaske_TypeClass#getWert()
	 * @see #getOptik_Symbolmaske_TypeClass()
	 * @generated
	 */
	EAttribute getOptik_Symbolmaske_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Pegel_TypeClass <em>Pegel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pegel Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Pegel_TypeClass
	 * @generated
	 */
	EClass getPegel_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Pegel_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Pegel_TypeClass#getWert()
	 * @see #getPegel_TypeClass()
	 * @generated
	 */
	EAttribute getPegel_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Pixel_Koordinate_X_TypeClass <em>Pixel Koordinate XType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pixel Koordinate XType Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Pixel_Koordinate_X_TypeClass
	 * @generated
	 */
	EClass getPixel_Koordinate_X_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Pixel_Koordinate_X_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Pixel_Koordinate_X_TypeClass#getWert()
	 * @see #getPixel_Koordinate_X_TypeClass()
	 * @generated
	 */
	EAttribute getPixel_Koordinate_X_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Pixel_Koordinate_Y_TypeClass <em>Pixel Koordinate YType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pixel Koordinate YType Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Pixel_Koordinate_Y_TypeClass
	 * @generated
	 */
	EClass getPixel_Koordinate_Y_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Pixel_Koordinate_Y_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Pixel_Koordinate_Y_TypeClass#getWert()
	 * @see #getPixel_Koordinate_Y_TypeClass()
	 * @generated
	 */
	EAttribute getPixel_Koordinate_Y_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DAB_TypeClass <em>Raeumstrecke DAB Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raeumstrecke DAB Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DAB_TypeClass
	 * @generated
	 */
	EClass getRaeumstrecke_DAB_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DAB_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DAB_TypeClass#getWert()
	 * @see #getRaeumstrecke_DAB_TypeClass()
	 * @generated
	 */
	EAttribute getRaeumstrecke_DAB_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DBK_TypeClass <em>Raeumstrecke DBK Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raeumstrecke DBK Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DBK_TypeClass
	 * @generated
	 */
	EClass getRaeumstrecke_DBK_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DBK_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DBK_TypeClass#getWert()
	 * @see #getRaeumstrecke_DBK_TypeClass()
	 * @generated
	 */
	EAttribute getRaeumstrecke_DBK_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DCK_TypeClass <em>Raeumstrecke DCK Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raeumstrecke DCK Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DCK_TypeClass
	 * @generated
	 */
	EClass getRaeumstrecke_DCK_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DCK_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DCK_TypeClass#getWert()
	 * @see #getRaeumstrecke_DCK_TypeClass()
	 * @generated
	 */
	EAttribute getRaeumstrecke_DCK_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DSK_Strich_TypeClass <em>Raeumstrecke DSK Strich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raeumstrecke DSK Strich Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DSK_Strich_TypeClass
	 * @generated
	 */
	EClass getRaeumstrecke_DSK_Strich_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DSK_Strich_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_DSK_Strich_TypeClass#getWert()
	 * @see #getRaeumstrecke_DSK_Strich_TypeClass()
	 * @generated
	 */
	EAttribute getRaeumstrecke_DSK_Strich_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_TypeClass <em>Raeumstrecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raeumstrecke Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_TypeClass
	 * @generated
	 */
	EClass getRaeumstrecke_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Raeumstrecke_TypeClass#getWert()
	 * @see #getRaeumstrecke_TypeClass()
	 * @generated
	 */
	EAttribute getRaeumstrecke_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Richtungspfeil_TypeClass <em>Richtungspfeil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Richtungspfeil Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Richtungspfeil_TypeClass
	 * @generated
	 */
	EClass getRichtungspfeil_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Richtungspfeil_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Richtungspfeil_TypeClass#getWert()
	 * @see #getRichtungspfeil_TypeClass()
	 * @generated
	 */
	EAttribute getRichtungspfeil_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup <em>SA Schrankenbaum Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SA Schrankenbaum Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup
	 * @generated
	 */
	EClass getSA_Schrankenbaum_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getAusrichtung <em>Ausrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ausrichtung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getAusrichtung()
	 * @see #getSA_Schrankenbaum_AttributeGroup()
	 * @generated
	 */
	EReference getSA_Schrankenbaum_AttributeGroup_Ausrichtung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getAusrichtungWinkel <em>Ausrichtung Winkel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ausrichtung Winkel</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getAusrichtungWinkel()
	 * @see #getSA_Schrankenbaum_AttributeGroup()
	 * @generated
	 */
	EReference getSA_Schrankenbaum_AttributeGroup_AusrichtungWinkel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getBaumprofil <em>Baumprofil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Baumprofil</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getBaumprofil()
	 * @see #getSA_Schrankenbaum_AttributeGroup()
	 * @generated
	 */
	EReference getSA_Schrankenbaum_AttributeGroup_Baumprofil();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getGitterbehang <em>Gitterbehang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gitterbehang</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getGitterbehang()
	 * @see #getSA_Schrankenbaum_AttributeGroup()
	 * @generated
	 */
	EReference getSA_Schrankenbaum_AttributeGroup_Gitterbehang();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getLagerungArt <em>Lagerung Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lagerung Art</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getLagerungArt()
	 * @see #getSA_Schrankenbaum_AttributeGroup()
	 * @generated
	 */
	EReference getSA_Schrankenbaum_AttributeGroup_LagerungArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getLieferlaenge <em>Lieferlaenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lieferlaenge</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getLieferlaenge()
	 * @see #getSA_Schrankenbaum_AttributeGroup()
	 * @generated
	 */
	EReference getSA_Schrankenbaum_AttributeGroup_Lieferlaenge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getMontageAusgleichsgewichte <em>Montage Ausgleichsgewichte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Montage Ausgleichsgewichte</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getMontageAusgleichsgewichte()
	 * @see #getSA_Schrankenbaum_AttributeGroup()
	 * @generated
	 */
	EReference getSA_Schrankenbaum_AttributeGroup_MontageAusgleichsgewichte();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getSperrlaenge <em>Sperrlaenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sperrlaenge</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getSperrlaenge()
	 * @see #getSA_Schrankenbaum_AttributeGroup()
	 * @generated
	 */
	EReference getSA_Schrankenbaum_AttributeGroup_Sperrlaenge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schaltgruppe_TypeClass <em>Schaltgruppe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schaltgruppe Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schaltgruppe_TypeClass
	 * @generated
	 */
	EClass getSchaltgruppe_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schaltgruppe_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schaltgruppe_TypeClass#getWert()
	 * @see #getSchaltgruppe_TypeClass()
	 * @generated
	 */
	EAttribute getSchaltgruppe_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schaltmittel_Fstr_Zuordnung <em>Schaltmittel Fstr Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schaltmittel Fstr Zuordnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schaltmittel_Fstr_Zuordnung
	 * @generated
	 */
	EClass getSchaltmittel_Fstr_Zuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDBUEWSFstrZuordnung <em>IDBUEWS Fstr Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUEWS Fstr Zuordnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDBUEWSFstrZuordnung()
	 * @see #getSchaltmittel_Fstr_Zuordnung()
	 * @generated
	 */
	EReference getSchaltmittel_Fstr_Zuordnung_IDBUEWSFstrZuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDSchaltmittelZuordnung <em>ID Schaltmittel Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Schaltmittel Zuordnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDSchaltmittelZuordnung()
	 * @see #getSchaltmittel_Fstr_Zuordnung()
	 * @generated
	 */
	EReference getSchaltmittel_Fstr_Zuordnung_IDSchaltmittelZuordnung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb <em>Schrankenantrieb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schrankenantrieb</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb
	 * @generated
	 */
	EClass getSchrankenantrieb();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb#getBezeichnung()
	 * @see #getSchrankenantrieb()
	 * @generated
	 */
	EReference getSchrankenantrieb_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb#getIDBUEAnlage <em>IDBUE Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb#getIDBUEAnlage()
	 * @see #getSchrankenantrieb()
	 * @generated
	 */
	EReference getSchrankenantrieb_IDBUEAnlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb#getSASchrankenbaum <em>SA Schrankenbaum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SA Schrankenbaum</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb#getSASchrankenbaum()
	 * @see #getSchrankenantrieb()
	 * @generated
	 */
	EReference getSchrankenantrieb_SASchrankenbaum();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb#getSchrankenantriebAllg <em>Schrankenantrieb Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schrankenantrieb Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb#getSchrankenantriebAllg()
	 * @see #getSchrankenantrieb()
	 * @generated
	 */
	EReference getSchrankenantrieb_SchrankenantriebAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup <em>Schrankenantrieb Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schrankenantrieb Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup
	 * @generated
	 */
	EClass getSchrankenantrieb_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup#getAbstandGehwegFahrbahn <em>Abstand Gehweg Fahrbahn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstand Gehweg Fahrbahn</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup#getAbstandGehwegFahrbahn()
	 * @see #getSchrankenantrieb_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getSchrankenantrieb_Allg_AttributeGroup_AbstandGehwegFahrbahn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hersteller</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup#getHersteller()
	 * @see #getSchrankenantrieb_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getSchrankenantrieb_Allg_AttributeGroup_Hersteller();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup#getSchaltgruppe <em>Schaltgruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schaltgruppe</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup#getSchaltgruppe()
	 * @see #getSchrankenantrieb_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getSchrankenantrieb_Allg_AttributeGroup_Schaltgruppe();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Bezeichnung_AttributeGroup <em>Schrankenantrieb Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schrankenantrieb Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getSchrankenantrieb_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Bezeichnung_AttributeGroup#getBezSchrankenantrieb <em>Bez Schrankenantrieb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bez Schrankenantrieb</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Bezeichnung_AttributeGroup#getBezSchrankenantrieb()
	 * @see #getSchrankenantrieb_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getSchrankenantrieb_Bezeichnung_AttributeGroup_BezSchrankenantrieb();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schutzbuegel_TypeClass <em>Schutzbuegel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schutzbuegel Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schutzbuegel_TypeClass
	 * @generated
	 */
	EClass getSchutzbuegel_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schutzbuegel_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Schutzbuegel_TypeClass#getWert()
	 * @see #getSchutzbuegel_TypeClass()
	 * @generated
	 */
	EAttribute getSchutzbuegel_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Sicherheitsabstand_TypeClass <em>Sicherheitsabstand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sicherheitsabstand Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Sicherheitsabstand_TypeClass
	 * @generated
	 */
	EClass getSicherheitsabstand_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Sicherheitsabstand_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Sicherheitsabstand_TypeClass#getWert()
	 * @see #getSicherheitsabstand_TypeClass()
	 * @generated
	 */
	EAttribute getSicherheitsabstand_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Signalverz_Errechnet_TypeClass <em>Signalverz Errechnet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signalverz Errechnet Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Signalverz_Errechnet_TypeClass
	 * @generated
	 */
	EClass getSignalverz_Errechnet_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Signalverz_Errechnet_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Signalverz_Errechnet_TypeClass#getWert()
	 * @see #getSignalverz_Errechnet_TypeClass()
	 * @generated
	 */
	EAttribute getSignalverz_Errechnet_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Signalverz_Gewaehlt_TypeClass <em>Signalverz Gewaehlt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signalverz Gewaehlt Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Signalverz_Gewaehlt_TypeClass
	 * @generated
	 */
	EClass getSignalverz_Gewaehlt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Signalverz_Gewaehlt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Signalverz_Gewaehlt_TypeClass#getWert()
	 * @see #getSignalverz_Gewaehlt_TypeClass()
	 * @generated
	 */
	EAttribute getSignalverz_Gewaehlt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Sperrlaenge_TypeClass <em>Sperrlaenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sperrlaenge Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Sperrlaenge_TypeClass
	 * @generated
	 */
	EClass getSperrlaenge_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Sperrlaenge_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Sperrlaenge_TypeClass#getWert()
	 * @see #getSperrlaenge_TypeClass()
	 * @generated
	 */
	EAttribute getSperrlaenge_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Sperrstrecke_Fussgaenger_TypeClass <em>Sperrstrecke Fussgaenger Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sperrstrecke Fussgaenger Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Sperrstrecke_Fussgaenger_TypeClass
	 * @generated
	 */
	EClass getSperrstrecke_Fussgaenger_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Sperrstrecke_Fussgaenger_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Sperrstrecke_Fussgaenger_TypeClass#getWert()
	 * @see #getSperrstrecke_Fussgaenger_TypeClass()
	 * @generated
	 */
	EAttribute getSperrstrecke_Fussgaenger_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Sperrstrecke_TypeClass <em>Sperrstrecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sperrstrecke Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Sperrstrecke_TypeClass
	 * @generated
	 */
	EClass getSperrstrecke_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Sperrstrecke_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Sperrstrecke_TypeClass#getWert()
	 * @see #getSperrstrecke_TypeClass()
	 * @generated
	 */
	EAttribute getSperrstrecke_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Stoerhalt_Haltfall_TypeClass <em>Stoerhalt Haltfall Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stoerhalt Haltfall Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Stoerhalt_Haltfall_TypeClass
	 * @generated
	 */
	EClass getStoerhalt_Haltfall_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Stoerhalt_Haltfall_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Stoerhalt_Haltfall_TypeClass#getWert()
	 * @see #getStoerhalt_Haltfall_TypeClass()
	 * @generated
	 */
	EAttribute getStoerhalt_Haltfall_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Stoerhalt_Merkhinweis_TypeClass <em>Stoerhalt Merkhinweis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stoerhalt Merkhinweis Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Stoerhalt_Merkhinweis_TypeClass
	 * @generated
	 */
	EClass getStoerhalt_Merkhinweis_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Stoerhalt_Merkhinweis_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Stoerhalt_Merkhinweis_TypeClass#getWert()
	 * @see #getStoerhalt_Merkhinweis_TypeClass()
	 * @generated
	 */
	EAttribute getStoerhalt_Merkhinweis_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Teilsperrstrecke_TypeClass <em>Teilsperrstrecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teilsperrstrecke Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Teilsperrstrecke_TypeClass
	 * @generated
	 */
	EClass getTeilsperrstrecke_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Teilsperrstrecke_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Teilsperrstrecke_TypeClass#getWert()
	 * @see #getTeilsperrstrecke_TypeClass()
	 * @generated
	 */
	EAttribute getTeilsperrstrecke_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Teilvorgabezeit_TypeClass <em>Teilvorgabezeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teilvorgabezeit Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Teilvorgabezeit_TypeClass
	 * @generated
	 */
	EClass getTeilvorgabezeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Teilvorgabezeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Teilvorgabezeit_TypeClass#getWert()
	 * @see #getTeilvorgabezeit_TypeClass()
	 * @generated
	 */
	EAttribute getTeilvorgabezeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Tragkopf_Verstellbar_TypeClass <em>Tragkopf Verstellbar Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tragkopf Verstellbar Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Tragkopf_Verstellbar_TypeClass
	 * @generated
	 */
	EClass getTragkopf_Verstellbar_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Tragkopf_Verstellbar_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Tragkopf_Verstellbar_TypeClass#getWert()
	 * @see #getTragkopf_Verstellbar_TypeClass()
	 * @generated
	 */
	EAttribute getTragkopf_Verstellbar_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.V_Max_Schiene_TypeClass <em>VMax Schiene Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VMax Schiene Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.V_Max_Schiene_TypeClass
	 * @generated
	 */
	EClass getV_Max_Schiene_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.V_Max_Schiene_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.V_Max_Schiene_TypeClass#getWert()
	 * @see #getV_Max_Schiene_TypeClass()
	 * @generated
	 */
	EAttribute getV_Max_Schiene_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.V_Max_Strasse_TypeClass <em>VMax Strasse Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VMax Strasse Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.V_Max_Strasse_TypeClass
	 * @generated
	 */
	EClass getV_Max_Strasse_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.V_Max_Strasse_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.V_Max_Strasse_TypeClass#getWert()
	 * @see #getV_Max_Strasse_TypeClass()
	 * @generated
	 */
	EAttribute getV_Max_Strasse_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Fussweg_TypeClass <em>VMin Fussweg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VMin Fussweg Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Fussweg_TypeClass
	 * @generated
	 */
	EClass getV_Min_Fussweg_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Fussweg_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Fussweg_TypeClass#getWert()
	 * @see #getV_Min_Fussweg_TypeClass()
	 * @generated
	 */
	EAttribute getV_Min_Fussweg_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Schiene_TypeClass <em>VMin Schiene Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VMin Schiene Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Schiene_TypeClass
	 * @generated
	 */
	EClass getV_Min_Schiene_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Schiene_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Schiene_TypeClass#getWert()
	 * @see #getV_Min_Schiene_TypeClass()
	 * @generated
	 */
	EAttribute getV_Min_Schiene_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Strasse_TypeClass <em>VMin Strasse Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VMin Strasse Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Strasse_TypeClass
	 * @generated
	 */
	EClass getV_Min_Strasse_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Strasse_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Strasse_TypeClass#getWert()
	 * @see #getV_Min_Strasse_TypeClass()
	 * @generated
	 */
	EAttribute getV_Min_Strasse_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen <em>Verkehrszeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verkehrszeichen</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen
	 * @generated
	 */
	EClass getVerkehrszeichen();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getBezeichnung()
	 * @see #getVerkehrszeichen()
	 * @generated
	 */
	EReference getVerkehrszeichen_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getIDBUEAnlage <em>IDBUE Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getIDBUEAnlage()
	 * @see #getVerkehrszeichen()
	 * @generated
	 */
	EReference getVerkehrszeichen_IDBUEAnlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getIDUnterbringung <em>ID Unterbringung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Unterbringung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getIDUnterbringung()
	 * @see #getVerkehrszeichen()
	 * @generated
	 */
	EReference getVerkehrszeichen_IDUnterbringung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenAllg <em>Verkehrszeichen Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verkehrszeichen Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenAllg()
	 * @see #getVerkehrszeichen()
	 * @generated
	 */
	EReference getVerkehrszeichen_VerkehrszeichenAllg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenAndreaskreuz <em>Verkehrszeichen Andreaskreuz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verkehrszeichen Andreaskreuz</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenAndreaskreuz()
	 * @see #getVerkehrszeichen()
	 * @generated
	 */
	EReference getVerkehrszeichen_VerkehrszeichenAndreaskreuz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenLz <em>Verkehrszeichen Lz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verkehrszeichen Lz</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenLz()
	 * @see #getVerkehrszeichen()
	 * @generated
	 */
	EReference getVerkehrszeichen_VerkehrszeichenLz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVzSperrstrecke <em>Vz Sperrstrecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vz Sperrstrecke</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVzSperrstrecke()
	 * @see #getVerkehrszeichen()
	 * @generated
	 */
	EReference getVerkehrszeichen_VzSperrstrecke();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup <em>Verkehrszeichen Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verkehrszeichen Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup
	 * @generated
	 */
	EClass getVerkehrszeichen_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup#getAbstandGehwegFahrbahn <em>Abstand Gehweg Fahrbahn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstand Gehweg Fahrbahn</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup#getAbstandGehwegFahrbahn()
	 * @see #getVerkehrszeichen_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Allg_AttributeGroup_AbstandGehwegFahrbahn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup#getAusrichtung <em>Ausrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ausrichtung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup#getAusrichtung()
	 * @see #getVerkehrszeichen_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Allg_AttributeGroup_Ausrichtung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup#getAusrichtungWinkel <em>Ausrichtung Winkel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ausrichtung Winkel</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup#getAusrichtungWinkel()
	 * @see #getVerkehrszeichen_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Allg_AttributeGroup_AusrichtungWinkel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup <em>Verkehrszeichen Andreaskreuz Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verkehrszeichen Andreaskreuz Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup
	 * @generated
	 */
	EClass getVerkehrszeichen_Andreaskreuz_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getBlitzpfeil <em>Blitzpfeil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Blitzpfeil</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getBlitzpfeil()
	 * @see #getVerkehrszeichen_Andreaskreuz_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Andreaskreuz_AttributeGroup_Blitzpfeil();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getMontageBesonders <em>Montage Besonders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Montage Besonders</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getMontageBesonders()
	 * @see #getVerkehrszeichen_Andreaskreuz_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Andreaskreuz_AttributeGroup_MontageBesonders();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getRichtungspfeil <em>Richtungspfeil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Richtungspfeil</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getRichtungspfeil()
	 * @see #getVerkehrszeichen_Andreaskreuz_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Andreaskreuz_AttributeGroup_Richtungspfeil();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getSchutzbuegel <em>Schutzbuegel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schutzbuegel</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getSchutzbuegel()
	 * @see #getVerkehrszeichen_Andreaskreuz_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Andreaskreuz_AttributeGroup_Schutzbuegel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getZusatzschild <em>Zusatzschild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zusatzschild</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getZusatzschild()
	 * @see #getVerkehrszeichen_Andreaskreuz_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Andreaskreuz_AttributeGroup_Zusatzschild();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Bezeichnung_AttributeGroup <em>Verkehrszeichen Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verkehrszeichen Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getVerkehrszeichen_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Bezeichnung_AttributeGroup#getBezeichnungVerkehrszeichen <em>Bezeichnung Verkehrszeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Verkehrszeichen</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Bezeichnung_AttributeGroup#getBezeichnungVerkehrszeichen()
	 * @see #getVerkehrszeichen_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Bezeichnung_AttributeGroup_BezeichnungVerkehrszeichen();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup <em>Verkehrszeichen Lz Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verkehrszeichen Lz Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup
	 * @generated
	 */
	EClass getVerkehrszeichen_Lz_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getAkustikFussgaenger <em>Akustik Fussgaenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Akustik Fussgaenger</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getAkustikFussgaenger()
	 * @see #getVerkehrszeichen_Lz_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Lz_AttributeGroup_AkustikFussgaenger();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getKontrastblende <em>Kontrastblende</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kontrastblende</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getKontrastblende()
	 * @see #getVerkehrszeichen_Lz_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Lz_AttributeGroup_Kontrastblende();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getOptikDurchmesser <em>Optik Durchmesser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optik Durchmesser</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getOptikDurchmesser()
	 * @see #getVerkehrszeichen_Lz_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Lz_AttributeGroup_OptikDurchmesser();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getOptikSymbolmaske <em>Optik Symbolmaske</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optik Symbolmaske</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getOptikSymbolmaske()
	 * @see #getVerkehrszeichen_Lz_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Lz_AttributeGroup_OptikSymbolmaske();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getSchaltgruppe <em>Schaltgruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schaltgruppe</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getSchaltgruppe()
	 * @see #getVerkehrszeichen_Lz_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Lz_AttributeGroup_Schaltgruppe();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getTragkopfVerstellbar <em>Tragkopf Verstellbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tragkopf Verstellbar</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getTragkopfVerstellbar()
	 * @see #getVerkehrszeichen_Lz_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Lz_AttributeGroup_TragkopfVerstellbar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getVorgeschaltet <em>Vorgeschaltet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vorgeschaltet</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getVorgeschaltet()
	 * @see #getVerkehrszeichen_Lz_AttributeGroup()
	 * @generated
	 */
	EReference getVerkehrszeichen_Lz_AttributeGroup_Vorgeschaltet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vorgeschaltet_TypeClass <em>Vorgeschaltet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vorgeschaltet Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vorgeschaltet_TypeClass
	 * @generated
	 */
	EClass getVorgeschaltet_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vorgeschaltet_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vorgeschaltet_TypeClass#getWert()
	 * @see #getVorgeschaltet_TypeClass()
	 * @generated
	 */
	EAttribute getVorgeschaltet_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup <em>Vz Sperrstrecke Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vz Sperrstrecke Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup
	 * @generated
	 */
	EClass getVz_Sperrstrecke_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getVzSperrstreckeVorgeschaltet <em>Vz Sperrstrecke Vorgeschaltet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vz Sperrstrecke Vorgeschaltet</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getVzSperrstreckeVorgeschaltet()
	 * @see #getVz_Sperrstrecke_AttributeGroup()
	 * @generated
	 */
	EReference getVz_Sperrstrecke_AttributeGroup_VzSperrstreckeVorgeschaltet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getSperrstrecke <em>Sperrstrecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sperrstrecke</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getSperrstrecke()
	 * @see #getVz_Sperrstrecke_AttributeGroup()
	 * @generated
	 */
	EReference getVz_Sperrstrecke_AttributeGroup_Sperrstrecke();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getSperrstreckeFussgaenger <em>Sperrstrecke Fussgaenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sperrstrecke Fussgaenger</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getSperrstreckeFussgaenger()
	 * @see #getVz_Sperrstrecke_AttributeGroup()
	 * @generated
	 */
	EReference getVz_Sperrstrecke_AttributeGroup_SperrstreckeFussgaenger();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getVzSperrstreckeSchranke <em>Vz Sperrstrecke Schranke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vz Sperrstrecke Schranke</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getVzSperrstreckeSchranke()
	 * @see #getVz_Sperrstrecke_AttributeGroup()
	 * @generated
	 */
	EReference getVz_Sperrstrecke_AttributeGroup_VzSperrstreckeSchranke();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup <em>Vz Sperrstrecke Schranke Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vz Sperrstrecke Schranke Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup
	 * @generated
	 */
	EClass getVz_Sperrstrecke_Schranke_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup#getRaeumstrecke <em>Raeumstrecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raeumstrecke</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup#getRaeumstrecke()
	 * @see #getVz_Sperrstrecke_Schranke_AttributeGroup()
	 * @generated
	 */
	EReference getVz_Sperrstrecke_Schranke_AttributeGroup_Raeumstrecke();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup#getTeilsperrstrecke <em>Teilsperrstrecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Teilsperrstrecke</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup#getTeilsperrstrecke()
	 * @see #getVz_Sperrstrecke_Schranke_AttributeGroup()
	 * @generated
	 */
	EReference getVz_Sperrstrecke_Schranke_AttributeGroup_Teilsperrstrecke();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup <em>Vz Sperrstrecke Vorgeschaltet Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vz Sperrstrecke Vorgeschaltet Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup
	 * @generated
	 */
	EClass getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getBeeinflussungStrassenverkehr <em>Beeinflussung Strassenverkehr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beeinflussung Strassenverkehr</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getBeeinflussungStrassenverkehr()
	 * @see #getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup()
	 * @generated
	 */
	EReference getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_BeeinflussungStrassenverkehr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDAB <em>Raeumstrecke DAB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raeumstrecke DAB</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDAB()
	 * @see #getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup()
	 * @generated
	 */
	EReference getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDAB();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDBK <em>Raeumstrecke DBK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raeumstrecke DBK</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDBK()
	 * @see #getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup()
	 * @generated
	 */
	EReference getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDBK();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDCK <em>Raeumstrecke DCK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raeumstrecke DCK</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDCK()
	 * @see #getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup()
	 * @generated
	 */
	EReference getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDCK();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDSKStrich <em>Raeumstrecke DSK Strich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raeumstrecke DSK Strich</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDSKStrich()
	 * @see #getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup()
	 * @generated
	 */
	EReference getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDSKStrich();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Winkel_Alpha_TypeClass <em>Winkel Alpha Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Winkel Alpha Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Winkel_Alpha_TypeClass
	 * @generated
	 */
	EClass getWinkel_Alpha_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Winkel_Alpha_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Winkel_Alpha_TypeClass#getWert()
	 * @see #getWinkel_Alpha_TypeClass()
	 * @generated
	 */
	EAttribute getWinkel_Alpha_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Zeitueberschreitungsmeldung_TypeClass <em>Zeitueberschreitungsmeldung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zeitueberschreitungsmeldung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Zeitueberschreitungsmeldung_TypeClass
	 * @generated
	 */
	EClass getZeitueberschreitungsmeldung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Zeitueberschreitungsmeldung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Zeitueberschreitungsmeldung_TypeClass#getWert()
	 * @see #getZeitueberschreitungsmeldung_TypeClass()
	 * @generated
	 */
	EAttribute getZeitueberschreitungsmeldung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnuebergang.Zusatzschild_TypeClass <em>Zusatzschild Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zusatzschild Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Zusatzschild_TypeClass
	 * @generated
	 */
	EClass getZusatzschild_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnuebergang.Zusatzschild_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.Zusatzschild_TypeClass#getWert()
	 * @see #getZusatzschild_TypeClass()
	 * @generated
	 */
	EAttribute getZusatzschild_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBaumprofil <em>ENUM Baumprofil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Baumprofil</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBaumprofil
	 * @generated
	 */
	EEnum getENUMBaumprofil();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEBauart <em>ENUMBUE Bauart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMBUE Bauart</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEBauart
	 * @generated
	 */
	EEnum getENUMBUEBauart();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEFunktionsueberwachung <em>ENUMBUE Funktionsueberwachung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMBUE Funktionsueberwachung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEFunktionsueberwachung
	 * @generated
	 */
	EEnum getENUMBUEFunktionsueberwachung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEHandschalteinrichtung <em>ENUMBUE Handschalteinrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMBUE Handschalteinrichtung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEHandschalteinrichtung
	 * @generated
	 */
	EEnum getENUMBUEHandschalteinrichtung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUESicherungsart <em>ENUMBUE Sicherungsart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMBUE Sicherungsart</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUESicherungsart
	 * @generated
	 */
	EEnum getENUMBUESicherungsart();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUETechnik <em>ENUMBUE Technik</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMBUE Technik</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUETechnik
	 * @generated
	 */
	EEnum getENUMBUETechnik();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMFueSchaltfall <em>ENUM Fue Schaltfall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Fue Schaltfall</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMFueSchaltfall
	 * @generated
	 */
	EEnum getENUMFueSchaltfall();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegArt <em>ENUM Fuss Radweg Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Fuss Radweg Art</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegArt
	 * @generated
	 */
	EEnum getENUMFussRadwegArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegSeite <em>ENUM Fuss Radweg Seite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Fuss Radweg Seite</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegSeite
	 * @generated
	 */
	EEnum getENUMFussRadwegSeite();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMGFRArt <em>ENUMGFR Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMGFR Art</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMGFRArt
	 * @generated
	 */
	EEnum getENUMGFRArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMHpErsatzstecker <em>ENUM Hp Ersatzstecker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Hp Ersatzstecker</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMHpErsatzstecker
	 * @generated
	 */
	EEnum getENUMHpErsatzstecker();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMKlassifizierung <em>ENUM Klassifizierung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Klassifizierung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMKlassifizierung
	 * @generated
	 */
	EEnum getENUMKlassifizierung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMLagerung <em>ENUM Lagerung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Lagerung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMLagerung
	 * @generated
	 */
	EEnum getENUMLagerung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMLFUEImpuls <em>ENUMLFUE Impuls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMLFUE Impuls</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMLFUEImpuls
	 * @generated
	 */
	EEnum getENUMLFUEImpuls();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMMontageAusgleichsgewichte <em>ENUM Montage Ausgleichsgewichte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Montage Ausgleichsgewichte</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMMontageAusgleichsgewichte
	 * @generated
	 */
	EEnum getENUMMontageAusgleichsgewichte();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMOptikSymbol <em>ENUM Optik Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Optik Symbol</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMOptikSymbol
	 * @generated
	 */
	EEnum getENUMOptikSymbol();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMRichtungspfeil <em>ENUM Richtungspfeil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Richtungspfeil</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMRichtungspfeil
	 * @generated
	 */
	EEnum getENUMRichtungspfeil();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Abstand Gehweg Fahrbahn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abstand Gehweg Fahrbahn Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TAbstand_Gehweg_Fahrbahn' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter'"
	 * @generated
	 */
	EDataType getAbstand_Gehweg_Fahrbahn_Type();

	/**
	 * Returns the meta object for data type '<em>Akustik Fussgaenger Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Akustik Fussgaenger Type</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='TAkustik_Fussgaenger' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean'"
	 * @generated
	 */
	EDataType getAkustik_Fussgaenger_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Akustik Fussgaenger Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Akustik Fussgaenger Type Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='TAkustik_Fussgaenger:Object' baseType='TAkustik_Fussgaenger'"
	 * @generated
	 */
	EDataType getAkustik_Fussgaenger_TypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Ausrichtung Winkel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ausrichtung Winkel Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TAusrichtung_Winkel' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='-?([1-8]?[0-9]|90)'"
	 * @generated
	 */
	EDataType getAusrichtung_Winkel_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Baulast Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Baulast Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBaulast' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText'"
	 * @generated
	 */
	EDataType getBaulast_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Beeinflussung Strassenverkehr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Beeinflussung Strassenverkehr Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TBeeinflussung_Strassenverkehr' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde'"
	 * @generated
	 */
	EDataType getBeeinflussung_Strassenverkehr_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bez Schrankenantrieb Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bez Schrankenantrieb Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBez_Schrankenantrieb' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TZeichenkette' pattern='.{2,3}'"
	 * @generated
	 */
	EDataType getBez_Schrankenantrieb_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung BUE GFR Eckpunkt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung BUE GFR Eckpunkt Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_BUE_GFR_Eckpunkt' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TZeichenkette'"
	 * @generated
	 */
	EDataType getBezeichnung_BUE_GFR_Eckpunkt_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung GFR Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung GFR Element Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_GFR_Element' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TZeichenkette'"
	 * @generated
	 */
	EDataType getBezeichnung_GFR_Element_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Bezeichnung GFR Tripelspiegel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung GFR Tripelspiegel Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TBezeichnung_GFR_Tripelspiegel' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9]'"
	 * @generated
	 */
	EDataType getBezeichnung_GFR_Tripelspiegel_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Verkehrszeichen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Verkehrszeichen Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Verkehrszeichen' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TZeichenkette'"
	 * @generated
	 */
	EDataType getBezeichnung_Verkehrszeichen_Type();

	/**
	 * Returns the meta object for data type '<em>Blitzpfeil Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Blitzpfeil Type</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='TBlitzpfeil' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean'"
	 * @generated
	 */
	EDataType getBlitzpfeil_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Blitzpfeil Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Blitzpfeil Type Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='TBlitzpfeil:Object' baseType='TBlitzpfeil'"
	 * @generated
	 */
	EDataType getBlitzpfeil_TypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>BUE Nachlaufzeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BUE Nachlaufzeit Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TBUE_Nachlaufzeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde' pattern='(0|[1-9][0-9]{0,4})\\.[0-9]{2}'"
	 * @generated
	 */
	EDataType getBUE_Nachlaufzeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>BUE Neigung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BUE Neigung Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TBUE_Neigung' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal'"
	 * @generated
	 */
	EDataType getBUE_Neigung_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>BUE Sicherungszeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BUE Sicherungszeit Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TBUE_Sicherungszeit' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getBUE_Sicherungszeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>BUE Strasse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BUE Strasse Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='TBUE_Strasse' itemType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText'"
	 * @generated
	 */
	EDataType getBUE_Strasse_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>BUE Vorlaufzeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BUE Vorlaufzeit Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TBUE_Vorlaufzeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde' pattern='(0|[1-9][0-9]{0,4})\\.[0-9]{2}'"
	 * @generated
	 */
	EDataType getBUE_Vorlaufzeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Einschaltverz Errechnet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Einschaltverz Errechnet Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TEinschaltverz_Errechnet' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde' pattern='(0|[1-9][0-9]{0,4})\\.[0-9]{2}'"
	 * @generated
	 */
	EDataType getEinschaltverz_Errechnet_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Einschaltverz Gewaehlt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Einschaltverz Gewaehlt Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TEinschaltverz_Gewaehlt' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde' pattern='(0|[1-9][0-9]{0,4})\\.[0-9]{2}'"
	 * @generated
	 */
	EDataType getEinschaltverz_Gewaehlt_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBaumprofil <em>ENUM Baumprofil Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Baumprofil Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBaumprofil
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMBaumprofil"
	 *        extendedMetaData="name='ENUMBaumprofil:Object' baseType='ENUMBaumprofil'"
	 * @generated
	 */
	EDataType getENUMBaumprofilObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEBauart <em>ENUMBUE Bauart Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMBUE Bauart Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEBauart
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEBauart"
	 *        extendedMetaData="name='ENUMBUE_Bauart:Object' baseType='ENUMBUE_Bauart'"
	 * @generated
	 */
	EDataType getENUMBUEBauartObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEFunktionsueberwachung <em>ENUMBUE Funktionsueberwachung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMBUE Funktionsueberwachung Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEFunktionsueberwachung
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEFunktionsueberwachung"
	 *        extendedMetaData="name='ENUMBUE_Funktionsueberwachung:Object' baseType='ENUMBUE_Funktionsueberwachung'"
	 * @generated
	 */
	EDataType getENUMBUEFunktionsueberwachungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEHandschalteinrichtung <em>ENUMBUE Handschalteinrichtung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMBUE Handschalteinrichtung Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEHandschalteinrichtung
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUEHandschalteinrichtung"
	 *        extendedMetaData="name='ENUMBUE_Handschalteinrichtung:Object' baseType='ENUMBUE_Handschalteinrichtung'"
	 * @generated
	 */
	EDataType getENUMBUEHandschalteinrichtungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUESicherungsart <em>ENUMBUE Sicherungsart Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMBUE Sicherungsart Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUESicherungsart
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUESicherungsart"
	 *        extendedMetaData="name='ENUMBUE_Sicherungsart:Object' baseType='ENUMBUE_Sicherungsart'"
	 * @generated
	 */
	EDataType getENUMBUESicherungsartObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUETechnik <em>ENUMBUE Technik Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMBUE Technik Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUETechnik
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMBUETechnik"
	 *        extendedMetaData="name='ENUMBUE_Technik:Object' baseType='ENUMBUE_Technik'"
	 * @generated
	 */
	EDataType getENUMBUETechnikObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMFueSchaltfall <em>ENUM Fue Schaltfall Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Fue Schaltfall Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMFueSchaltfall
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMFueSchaltfall"
	 *        extendedMetaData="name='ENUMFue_Schaltfall:Object' baseType='ENUMFue_Schaltfall'"
	 * @generated
	 */
	EDataType getENUMFueSchaltfallObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegArt <em>ENUM Fuss Radweg Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Fuss Radweg Art Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegArt
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegArt"
	 *        extendedMetaData="name='ENUMFuss_Radweg_Art:Object' baseType='ENUMFuss_Radweg_Art'"
	 * @generated
	 */
	EDataType getENUMFussRadwegArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegSeite <em>ENUM Fuss Radweg Seite Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Fuss Radweg Seite Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegSeite
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMFussRadwegSeite"
	 *        extendedMetaData="name='ENUMFuss_Radweg_Seite:Object' baseType='ENUMFuss_Radweg_Seite'"
	 * @generated
	 */
	EDataType getENUMFussRadwegSeiteObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMGFRArt <em>ENUMGFR Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMGFR Art Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMGFRArt
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMGFRArt"
	 *        extendedMetaData="name='ENUMGFR_Art:Object' baseType='ENUMGFR_Art'"
	 * @generated
	 */
	EDataType getENUMGFRArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMHpErsatzstecker <em>ENUM Hp Ersatzstecker Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Hp Ersatzstecker Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMHpErsatzstecker
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMHpErsatzstecker"
	 *        extendedMetaData="name='ENUMHp_Ersatzstecker:Object' baseType='ENUMHp_Ersatzstecker'"
	 * @generated
	 */
	EDataType getENUMHpErsatzsteckerObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMKlassifizierung <em>ENUM Klassifizierung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Klassifizierung Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMKlassifizierung
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMKlassifizierung"
	 *        extendedMetaData="name='ENUMKlassifizierung:Object' baseType='ENUMKlassifizierung'"
	 * @generated
	 */
	EDataType getENUMKlassifizierungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMLagerung <em>ENUM Lagerung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Lagerung Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMLagerung
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMLagerung"
	 *        extendedMetaData="name='ENUMLagerung:Object' baseType='ENUMLagerung'"
	 * @generated
	 */
	EDataType getENUMLagerungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMLFUEImpuls <em>ENUMLFUE Impuls Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMLFUE Impuls Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMLFUEImpuls
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMLFUEImpuls"
	 *        extendedMetaData="name='ENUMLFUE_Impuls:Object' baseType='ENUMLFUE_Impuls'"
	 * @generated
	 */
	EDataType getENUMLFUEImpulsObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMMontageAusgleichsgewichte <em>ENUM Montage Ausgleichsgewichte Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Montage Ausgleichsgewichte Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMMontageAusgleichsgewichte
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMMontageAusgleichsgewichte"
	 *        extendedMetaData="name='ENUMMontage_Ausgleichsgewichte:Object' baseType='ENUMMontage_Ausgleichsgewichte'"
	 * @generated
	 */
	EDataType getENUMMontageAusgleichsgewichteObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMOptikSymbol <em>ENUM Optik Symbol Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Optik Symbol Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMOptikSymbol
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMOptikSymbol"
	 *        extendedMetaData="name='ENUMOptik_Symbol:Object' baseType='ENUMOptik_Symbol'"
	 * @generated
	 */
	EDataType getENUMOptikSymbolObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnuebergang.ENUMRichtungspfeil <em>ENUM Richtungspfeil Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Richtungspfeil Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.ENUMRichtungspfeil
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnuebergang.ENUMRichtungspfeil"
	 *        extendedMetaData="name='ENUMRichtungspfeil:Object' baseType='ENUMRichtungspfeil'"
	 * @generated
	 */
	EDataType getENUMRichtungspfeilObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fahrbahn Befestigung Gleis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fahrbahn Befestigung Gleis Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TFahrbahn_Befestigung_Gleis' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText'"
	 * @generated
	 */
	EDataType getFahrbahn_Befestigung_Gleis_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fahrbahn Befestigung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fahrbahn Befestigung Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TFahrbahn_Befestigung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText'"
	 * @generated
	 */
	EDataType getFahrbahn_Befestigung_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Fahrbahn Breite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fahrbahn Breite Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TFahrbahn_Breite' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter'"
	 * @generated
	 */
	EDataType getFahrbahn_Breite_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>GFR Neigung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GFR Neigung Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TGFR_Neigung' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal'"
	 * @generated
	 */
	EDataType getGFR_Neigung_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>GFR Typ Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GFR Typ Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TGFR_Typ' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText'"
	 * @generated
	 */
	EDataType getGFR_Typ_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Gleis Am Bue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gleis Am Bue Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TGleis_Am_Bue' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TZeichenkette' pattern='[a-z]'"
	 * @generated
	 */
	EDataType getGleis_Am_Bue_Type();

	/**
	 * Returns the meta object for data type '<em>Kontrastblende Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kontrastblende Type</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='TKontrastblende' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean'"
	 * @generated
	 */
	EDataType getKontrastblende_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Kontrastblende Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kontrastblende Type Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='TKontrastblende:Object' baseType='TKontrastblende'"
	 * @generated
	 */
	EDataType getKontrastblende_TypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Kreuzungswinkel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kreuzungswinkel Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TKreuzungswinkel' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getKreuzungswinkel_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Lieferlaenge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lieferlaenge Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TLieferlaenge' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter' pattern='1[0-9]|20|[1-9]'"
	 * @generated
	 */
	EDataType getLieferlaenge_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Montage Besonders Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Montage Besonders Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TMontage_Besonders' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText'"
	 * @generated
	 */
	EDataType getMontage_Besonders_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Montagehoehe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Montagehoehe Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TMontagehoehe' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter'"
	 * @generated
	 */
	EDataType getMontagehoehe_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Optik Durchmesser Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Optik Durchmesser Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TOptik_Durchmesser' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='200|300'"
	 * @generated
	 */
	EDataType getOptik_Durchmesser_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Pegel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pegel Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TPegel' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getPegel_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Pixel Koordinate XType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pixel Koordinate XType</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TPixel_Koordinate_X' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getPixel_Koordinate_X_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Pixel Koordinate YType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pixel Koordinate YType</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TPixel_Koordinate_Y' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getPixel_Koordinate_Y_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Raeumstrecke DAB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Raeumstrecke DAB Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TRaeumstrecke_DAB' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter'"
	 * @generated
	 */
	EDataType getRaeumstrecke_DAB_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Raeumstrecke DBK Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Raeumstrecke DBK Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TRaeumstrecke_DBK' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter'"
	 * @generated
	 */
	EDataType getRaeumstrecke_DBK_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Raeumstrecke DCK Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Raeumstrecke DCK Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TRaeumstrecke_DCK' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter'"
	 * @generated
	 */
	EDataType getRaeumstrecke_DCK_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Raeumstrecke DSK Strich Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Raeumstrecke DSK Strich Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TRaeumstrecke_DSK_Strich' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter'"
	 * @generated
	 */
	EDataType getRaeumstrecke_DSK_Strich_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Raeumstrecke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Raeumstrecke Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TRaeumstrecke' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter'"
	 * @generated
	 */
	EDataType getRaeumstrecke_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Schaltgruppe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Schaltgruppe Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TSchaltgruppe' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9]|10'"
	 * @generated
	 */
	EDataType getSchaltgruppe_Type();

	/**
	 * Returns the meta object for data type '<em>Schutzbuegel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Schutzbuegel Type</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='TSchutzbuegel' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean'"
	 * @generated
	 */
	EDataType getSchutzbuegel_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Schutzbuegel Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Schutzbuegel Type Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='TSchutzbuegel:Object' baseType='TSchutzbuegel'"
	 * @generated
	 */
	EDataType getSchutzbuegel_TypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Sicherheitsabstand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sicherheitsabstand Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TSicherheitsabstand' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter'"
	 * @generated
	 */
	EDataType getSicherheitsabstand_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Signalverz Errechnet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signalverz Errechnet Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TSignalverz_Errechnet' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde' pattern='(0|[1-9][0-9]{0,4})\\.[0-9]{2}'"
	 * @generated
	 */
	EDataType getSignalverz_Errechnet_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Signalverz Gewaehlt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signalverz Gewaehlt Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TSignalverz_Gewaehlt' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde' pattern='(0|[1-9][0-9]{0,4})\\.[0-9]{2}'"
	 * @generated
	 */
	EDataType getSignalverz_Gewaehlt_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Sperrlaenge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sperrlaenge Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TSperrlaenge' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter' pattern='1[0-9]|20|[1-9]'"
	 * @generated
	 */
	EDataType getSperrlaenge_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Sperrstrecke Fussgaenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sperrstrecke Fussgaenger Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TSperrstrecke_Fussgaenger' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter'"
	 * @generated
	 */
	EDataType getSperrstrecke_Fussgaenger_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Sperrstrecke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sperrstrecke Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TSperrstrecke' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter'"
	 * @generated
	 */
	EDataType getSperrstrecke_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Teilsperrstrecke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Teilsperrstrecke Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TTeilsperrstrecke' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter'"
	 * @generated
	 */
	EDataType getTeilsperrstrecke_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Teilvorgabezeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Teilvorgabezeit Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TTeilvorgabezeit' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getTeilvorgabezeit_Type();

	/**
	 * Returns the meta object for data type '<em>Tragkopf Verstellbar Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tragkopf Verstellbar Type</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='TTragkopf_Verstellbar' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean'"
	 * @generated
	 */
	EDataType getTragkopf_Verstellbar_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Tragkopf Verstellbar Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tragkopf Verstellbar Type Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='TTragkopf_Verstellbar:Object' baseType='TTragkopf_Verstellbar'"
	 * @generated
	 */
	EDataType getTragkopf_Verstellbar_TypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>VMax Schiene Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>VMax Schiene Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TV_Max_Schiene' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TGeschwindigkeit'"
	 * @generated
	 */
	EDataType getV_Max_Schiene_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>VMax Strasse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>VMax Strasse Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TV_Max_Strasse' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TGeschwindigkeit'"
	 * @generated
	 */
	EDataType getV_Max_Strasse_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>VMin Fussweg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>VMin Fussweg Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TV_Min_Fussweg' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='0\\.[5-9]|1\\.[0-5]'"
	 * @generated
	 */
	EDataType getV_Min_Fussweg_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>VMin Schiene Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>VMin Schiene Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TV_Min_Schiene' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TGeschwindigkeit'"
	 * @generated
	 */
	EDataType getV_Min_Schiene_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>VMin Strasse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>VMin Strasse Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TV_Min_Strasse' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TGeschwindigkeit' pattern='5|10'"
	 * @generated
	 */
	EDataType getV_Min_Strasse_Type();

	/**
	 * Returns the meta object for data type '<em>Vorgeschaltet Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vorgeschaltet Type</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='TVorgeschaltet' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean'"
	 * @generated
	 */
	EDataType getVorgeschaltet_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Vorgeschaltet Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vorgeschaltet Type Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='TVorgeschaltet:Object' baseType='TVorgeschaltet'"
	 * @generated
	 */
	EDataType getVorgeschaltet_TypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Winkel Alpha Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Winkel Alpha Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TWinkel_Alpha' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getWinkel_Alpha_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Zeitueberschreitungsmeldung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Zeitueberschreitungsmeldung Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TZeitueberschreitungsmeldung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde' pattern='[1-9][0-9]{0,4}'"
	 * @generated
	 */
	EDataType getZeitueberschreitungsmeldung_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Zusatzschild Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Zusatzschild Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TZusatzschild' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText'"
	 * @generated
	 */
	EDataType getZusatzschild_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BahnuebergangFactory getBahnuebergangFactory();

} //BahnuebergangPackage
