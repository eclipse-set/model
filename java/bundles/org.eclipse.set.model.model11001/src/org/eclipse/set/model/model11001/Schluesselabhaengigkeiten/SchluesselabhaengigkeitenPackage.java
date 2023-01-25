/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Schluesselabhaengigkeiten;

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
 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenFactory
 * @model kind="package"
 * @generated
 */
public interface SchluesselabhaengigkeitenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Schluesselabhaengigkeiten";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Schluesselabhaengigkeiten/1.10.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsSchluesselabhaengigkeiten";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchluesselabhaengigkeitenPackage eINSTANCE = org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bedienung_Art_TypeClassImpl <em>Bedienung Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bedienung_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBedienung_Art_TypeClass()
	 * @generated
	 */
	int BEDIENUNG_ART_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIENUNG_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIENUNG_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bedienung Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIENUNG_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Beschreibung_Sonderanlage_TypeClassImpl <em>Beschreibung Sonderanlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Beschreibung_Sonderanlage_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBeschreibung_Sonderanlage_TypeClass()
	 * @generated
	 */
	int BESCHREIBUNG_SONDERANLAGE_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESCHREIBUNG_SONDERANLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESCHREIBUNG_SONDERANLAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Beschreibung Sonderanlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESCHREIBUNG_SONDERANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bezeichnung_Schloss_TypeClassImpl <em>Bezeichnung Schloss Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bezeichnung_Schloss_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBezeichnung_Schloss_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_SCHLOSS_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_SCHLOSS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_SCHLOSS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Schloss Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_SCHLOSS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bezeichnung_Schluessel_TypeClassImpl <em>Bezeichnung Schluessel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bezeichnung_Schluessel_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBezeichnung_Schluessel_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_SCHLUESSEL_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_SCHLUESSEL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_SCHLUESSEL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Schluessel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_SCHLUESSEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bezeichnung_Sk_TypeClassImpl <em>Bezeichnung Sk Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bezeichnung_Sk_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBezeichnung_Sk_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_SK_TYPE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_SK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_SK_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Sk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_SK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.BUE_Lage_TypeClassImpl <em>BUE Lage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.BUE_Lage_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBUE_Lage_TypeClass()
	 * @generated
	 */
	int BUE_LAGE_TYPE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_LAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_LAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUE Lage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_LAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Gsp_Lage_TypeClassImpl <em>Gsp Lage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Gsp_Lage_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getGsp_Lage_TypeClass()
	 * @generated
	 */
	int GSP_LAGE_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSP_LAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSP_LAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gsp Lage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSP_LAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Hauptschloss_TypeClassImpl <em>Hauptschloss Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Hauptschloss_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getHauptschloss_TypeClass()
	 * @generated
	 */
	int HAUPTSCHLOSS_TYPE_CLASS = 7;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTSCHLOSS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTSCHLOSS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hauptschloss Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTSCHLOSS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl <em>Schloss</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss()
	 * @generated
	 */
	int SCHLOSS = 8;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Schluessel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__ID_SCHLUESSEL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schluessel In Grdst Eingeschl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schloss BUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__SCHLOSS_BUE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schloss Gsp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__SCHLOSS_GSP = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Schloss Sk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__SCHLOSS_SK = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Schloss Sonderanlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__SCHLOSS_SONDERANLAGE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Schloss Ssp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__SCHLOSS_SSP = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Schloss W</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__SCHLOSS_W = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Technisch Berechtigter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS__TECHNISCH_BERECHTIGTER = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Schloss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Art_TypeClassImpl <em>Schloss Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_Art_TypeClass()
	 * @generated
	 */
	int SCHLOSS_ART_TYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schloss Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Bezeichnung_AttributeGroupImpl <em>Schloss Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Bezeichnung Schloss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLOSS = 0;

	/**
	 * The number of structural features of the '<em>Schloss Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_BUE_AttributeGroupImpl <em>Schloss BUE Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_BUE_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_BUE_AttributeGroup()
	 * @generated
	 */
	int SCHLOSS_BUE_ATTRIBUTE_GROUP = 11;

	/**
	 * The feature id for the '<em><b>BUE Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_BUE_ATTRIBUTE_GROUP__BUE_LAGE = 0;

	/**
	 * The feature id for the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_BUE_ATTRIBUTE_GROUP__IDBUE_ANLAGE = 1;

	/**
	 * The number of structural features of the '<em>Schloss BUE Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_BUE_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Gsp_AttributeGroupImpl <em>Schloss Gsp Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Gsp_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_Gsp_AttributeGroup()
	 * @generated
	 */
	int SCHLOSS_GSP_ATTRIBUTE_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Gsp Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_GSP_ATTRIBUTE_GROUP__GSP_LAGE = 0;

	/**
	 * The feature id for the '<em><b>ID Gsp Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_GSP_ATTRIBUTE_GROUP__ID_GSP_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Schloss Gsp Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_GSP_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Sk_AttributeGroupImpl <em>Schloss Sk Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Sk_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_Sk_AttributeGroup()
	 * @generated
	 */
	int SCHLOSS_SK_ATTRIBUTE_GROUP = 13;

	/**
	 * The feature id for the '<em><b>Hauptschloss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS = 0;

	/**
	 * The feature id for the '<em><b>ID Schlosskombination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION = 1;

	/**
	 * The number of structural features of the '<em>Schloss Sk Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_SK_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Sonderanlage_AttributeGroupImpl <em>Schloss Sonderanlage Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Sonderanlage_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_Sonderanlage_AttributeGroup()
	 * @generated
	 */
	int SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Sonderanlage Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__SONDERANLAGE_LAGE = 0;

	/**
	 * The feature id for the '<em><b>Beschreibung Sonderanlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE = 1;

	/**
	 * The feature id for the '<em><b>ID Sonderanlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE = 2;

	/**
	 * The number of structural features of the '<em>Schloss Sonderanlage Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Ssp_AttributeGroupImpl <em>Schloss Ssp Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Ssp_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_Ssp_AttributeGroup()
	 * @generated
	 */
	int SCHLOSS_SSP_ATTRIBUTE_GROUP = 15;

	/**
	 * The feature id for the '<em><b>ID Schluesselsperre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE = 0;

	/**
	 * The number of structural features of the '<em>Schloss Ssp Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_SSP_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_W_AttributeGroupImpl <em>Schloss WAttribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_W_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_W_AttributeGroup()
	 * @generated
	 */
	int SCHLOSS_WATTRIBUTE_GROUP = 16;

	/**
	 * The feature id for the '<em><b>IDW Kr Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_WATTRIBUTE_GROUP__IDW_KR_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Schloss Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_WATTRIBUTE_GROUP__SCHLOSS_ART = 1;

	/**
	 * The feature id for the '<em><b>Verschluss Ort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_WATTRIBUTE_GROUP__VERSCHLUSS_ORT = 2;

	/**
	 * The feature id for the '<em><b>WAnbaulage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_WATTRIBUTE_GROUP__WANBAULAGE = 3;

	/**
	 * The feature id for the '<em><b>WLage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_WATTRIBUTE_GROUP__WLAGE = 4;

	/**
	 * The number of structural features of the '<em>Schloss WAttribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSS_WATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlosskombinationImpl <em>Schlosskombination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlosskombinationImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchlosskombination()
	 * @generated
	 */
	int SCHLOSSKOMBINATION = 17;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSSKOMBINATION__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSSKOMBINATION__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSSKOMBINATION__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSSKOMBINATION__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSSKOMBINATION__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSSKOMBINATION__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSSKOMBINATION__ID_UNTERBRINGUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schlosskombination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSSKOMBINATION_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schlosskombination_Bezeichnung_AttributeGroupImpl <em>Schlosskombination Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schlosskombination_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchlosskombination_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP = 18;

	/**
	 * The feature id for the '<em><b>Bezeichnung Sk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SK = 0;

	/**
	 * The number of structural features of the '<em>Schlosskombination Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselImpl <em>Schluessel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluessel()
	 * @generated
	 */
	int SCHLUESSEL = 19;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schluessel Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL__SCHLUESSEL_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schluessel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Allg_AttributeGroupImpl <em>Schluessel Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluessel_Allg_AttributeGroup()
	 * @generated
	 */
	int SCHLUESSEL_ALLG_ATTRIBUTE_GROUP = 20;

	/**
	 * The feature id for the '<em><b>Schluessel Bartform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_BARTFORM = 0;

	/**
	 * The feature id for the '<em><b>Schluessel Gruppe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_GRUPPE = 1;

	/**
	 * The number of structural features of the '<em>Schluessel Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Bartform_TypeClassImpl <em>Schluessel Bartform Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Bartform_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluessel_Bartform_TypeClass()
	 * @generated
	 */
	int SCHLUESSEL_BARTFORM_TYPE_CLASS = 21;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_BARTFORM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_BARTFORM_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schluessel Bartform Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_BARTFORM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Bezeichnung_AttributeGroupImpl <em>Schluessel Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluessel_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP = 22;

	/**
	 * The feature id for the '<em><b>Bezeichnung Schluessel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLUESSEL = 0;

	/**
	 * The number of structural features of the '<em>Schluessel Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Gruppe_TypeClassImpl <em>Schluessel Gruppe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Gruppe_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluessel_Gruppe_TypeClass()
	 * @generated
	 */
	int SCHLUESSEL_GRUPPE_TYPE_CLASS = 23;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_GRUPPE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_GRUPPE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schluessel Gruppe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_GRUPPE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_In_Grdst_Eingeschl_TypeClassImpl <em>Schluessel In Grdst Eingeschl Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_In_Grdst_Eingeschl_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluessel_In_Grdst_Eingeschl_TypeClass()
	 * @generated
	 */
	int SCHLUESSEL_IN_GRDST_EINGESCHL_TYPE_CLASS = 24;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_IN_GRDST_EINGESCHL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_IN_GRDST_EINGESCHL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schluessel In Grdst Eingeschl Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSEL_IN_GRDST_EINGESCHL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselsperreImpl <em>Schluesselsperre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselsperreImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluesselsperre()
	 * @generated
	 */
	int SCHLUESSELSPERRE = 25;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSELSPERRE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSELSPERRE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSELSPERRE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSELSPERRE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSELSPERRE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bedienung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSELSPERRE__BEDIENUNG_ART = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSELSPERRE__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Stellelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSELSPERRE__ID_STELLELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSELSPERRE__ID_UNTERBRINGUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Schluesselsperre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHLUESSELSPERRE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Sonderanlage_Lage_TypeClassImpl <em>Sonderanlage Lage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Sonderanlage_Lage_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSonderanlage_Lage_TypeClass()
	 * @generated
	 */
	int SONDERANLAGE_LAGE_TYPE_CLASS = 26;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONDERANLAGE_LAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONDERANLAGE_LAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sonderanlage Lage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONDERANLAGE_LAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Technisch_Berechtigter_TypeClassImpl <em>Technisch Berechtigter Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Technisch_Berechtigter_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getTechnisch_Berechtigter_TypeClass()
	 * @generated
	 */
	int TECHNISCH_BERECHTIGTER_TYPE_CLASS = 27;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCH_BERECHTIGTER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCH_BERECHTIGTER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Technisch Berechtigter Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCH_BERECHTIGTER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Verschluss_Ort_TypeClassImpl <em>Verschluss Ort Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Verschluss_Ort_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getVerschluss_Ort_TypeClass()
	 * @generated
	 */
	int VERSCHLUSS_ORT_TYPE_CLASS = 28;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSCHLUSS_ORT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSCHLUSS_ORT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verschluss Ort Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSCHLUSS_ORT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.W_Anbaulage_TypeClassImpl <em>WAnbaulage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.W_Anbaulage_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getW_Anbaulage_TypeClass()
	 * @generated
	 */
	int WANBAULAGE_TYPE_CLASS = 29;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANBAULAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANBAULAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WAnbaulage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANBAULAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.W_Lage_TypeClassImpl <em>WLage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.W_Lage_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getW_Lage_TypeClass()
	 * @generated
	 */
	int WLAGE_TYPE_CLASS = 30;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WLAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WLage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBedienungArt <em>ENUM Bedienung Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBedienungArt
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMBedienungArt()
	 * @generated
	 */
	int ENUM_BEDIENUNG_ART = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBUELage <em>ENUMBUE Lage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBUELage
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMBUELage()
	 * @generated
	 */
	int ENUMBUE_LAGE = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMGspLage <em>ENUM Gsp Lage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMGspLage
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMGspLage()
	 * @generated
	 */
	int ENUM_GSP_LAGE = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchlossArt <em>ENUM Schloss Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchlossArt
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSchlossArt()
	 * @generated
	 */
	int ENUM_SCHLOSS_ART = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselBartform <em>ENUM Schluessel Bartform</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselBartform
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSchluesselBartform()
	 * @generated
	 */
	int ENUM_SCHLUESSEL_BARTFORM = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselGruppe <em>ENUM Schluessel Gruppe</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselGruppe
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSchluesselGruppe()
	 * @generated
	 */
	int ENUM_SCHLUESSEL_GRUPPE = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSonderanlageLage <em>ENUM Sonderanlage Lage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSonderanlageLage
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSonderanlageLage()
	 * @generated
	 */
	int ENUM_SONDERANLAGE_LAGE = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMVerschlussOrt <em>ENUM Verschluss Ort</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMVerschlussOrt
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMVerschlussOrt()
	 * @generated
	 */
	int ENUM_VERSCHLUSS_ORT = 38;

	/**
	 * The meta object id for the '<em>Beschreibung Sonderanlage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBeschreibung_Sonderanlage_Type()
	 * @generated
	 */
	int BESCHREIBUNG_SONDERANLAGE_TYPE = 39;

	/**
	 * The meta object id for the '<em>Bezeichnung Schloss Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBezeichnung_Schloss_Type()
	 * @generated
	 */
	int BEZEICHNUNG_SCHLOSS_TYPE = 40;

	/**
	 * The meta object id for the '<em>Bezeichnung Schluessel Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBezeichnung_Schluessel_Type()
	 * @generated
	 */
	int BEZEICHNUNG_SCHLUESSEL_TYPE = 41;

	/**
	 * The meta object id for the '<em>Bezeichnung Sk Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBezeichnung_Sk_Type()
	 * @generated
	 */
	int BEZEICHNUNG_SK_TYPE = 42;

	/**
	 * The meta object id for the '<em>ENUM Bedienung Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBedienungArt
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMBedienungArtObject()
	 * @generated
	 */
	int ENUM_BEDIENUNG_ART_OBJECT = 43;

	/**
	 * The meta object id for the '<em>ENUMBUE Lage Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBUELage
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMBUELageObject()
	 * @generated
	 */
	int ENUMBUE_LAGE_OBJECT = 44;

	/**
	 * The meta object id for the '<em>ENUM Gsp Lage Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMGspLage
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMGspLageObject()
	 * @generated
	 */
	int ENUM_GSP_LAGE_OBJECT = 45;

	/**
	 * The meta object id for the '<em>ENUM Schloss Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchlossArt
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSchlossArtObject()
	 * @generated
	 */
	int ENUM_SCHLOSS_ART_OBJECT = 46;

	/**
	 * The meta object id for the '<em>ENUM Schluessel Bartform Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselBartform
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSchluesselBartformObject()
	 * @generated
	 */
	int ENUM_SCHLUESSEL_BARTFORM_OBJECT = 47;

	/**
	 * The meta object id for the '<em>ENUM Schluessel Gruppe Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselGruppe
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSchluesselGruppeObject()
	 * @generated
	 */
	int ENUM_SCHLUESSEL_GRUPPE_OBJECT = 48;

	/**
	 * The meta object id for the '<em>ENUM Sonderanlage Lage Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSonderanlageLage
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSonderanlageLageObject()
	 * @generated
	 */
	int ENUM_SONDERANLAGE_LAGE_OBJECT = 49;

	/**
	 * The meta object id for the '<em>ENUM Verschluss Ort Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMVerschlussOrt
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMVerschlussOrtObject()
	 * @generated
	 */
	int ENUM_VERSCHLUSS_ORT_OBJECT = 50;

	/**
	 * The meta object id for the '<em>WAnbaulage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getW_Anbaulage_Type()
	 * @generated
	 */
	int WANBAULAGE_TYPE = 51;

	/**
	 * The meta object id for the '<em>WLage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getW_Lage_Type()
	 * @generated
	 */
	int WLAGE_TYPE = 52;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bedienung_Art_TypeClass <em>Bedienung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedienung Art Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bedienung_Art_TypeClass
	 * @generated
	 */
	EClass getBedienung_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bedienung_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bedienung_Art_TypeClass#getWert()
	 * @see #getBedienung_Art_TypeClass()
	 * @generated
	 */
	EAttribute getBedienung_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Beschreibung_Sonderanlage_TypeClass <em>Beschreibung Sonderanlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beschreibung Sonderanlage Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Beschreibung_Sonderanlage_TypeClass
	 * @generated
	 */
	EClass getBeschreibung_Sonderanlage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Beschreibung_Sonderanlage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Beschreibung_Sonderanlage_TypeClass#getWert()
	 * @see #getBeschreibung_Sonderanlage_TypeClass()
	 * @generated
	 */
	EAttribute getBeschreibung_Sonderanlage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bezeichnung_Schloss_TypeClass <em>Bezeichnung Schloss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Schloss Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bezeichnung_Schloss_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Schloss_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bezeichnung_Schloss_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bezeichnung_Schloss_TypeClass#getWert()
	 * @see #getBezeichnung_Schloss_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Schloss_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bezeichnung_Schluessel_TypeClass <em>Bezeichnung Schluessel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Schluessel Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bezeichnung_Schluessel_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Schluessel_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bezeichnung_Schluessel_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bezeichnung_Schluessel_TypeClass#getWert()
	 * @see #getBezeichnung_Schluessel_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Schluessel_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bezeichnung_Sk_TypeClass <em>Bezeichnung Sk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Sk Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bezeichnung_Sk_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Sk_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bezeichnung_Sk_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Bezeichnung_Sk_TypeClass#getWert()
	 * @see #getBezeichnung_Sk_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Sk_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.BUE_Lage_TypeClass <em>BUE Lage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUE Lage Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.BUE_Lage_TypeClass
	 * @generated
	 */
	EClass getBUE_Lage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.BUE_Lage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.BUE_Lage_TypeClass#getWert()
	 * @see #getBUE_Lage_TypeClass()
	 * @generated
	 */
	EAttribute getBUE_Lage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Gsp_Lage_TypeClass <em>Gsp Lage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gsp Lage Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Gsp_Lage_TypeClass
	 * @generated
	 */
	EClass getGsp_Lage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Gsp_Lage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Gsp_Lage_TypeClass#getWert()
	 * @see #getGsp_Lage_TypeClass()
	 * @generated
	 */
	EAttribute getGsp_Lage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Hauptschloss_TypeClass <em>Hauptschloss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hauptschloss Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Hauptschloss_TypeClass
	 * @generated
	 */
	EClass getHauptschloss_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Hauptschloss_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Hauptschloss_TypeClass#getWert()
	 * @see #getHauptschloss_TypeClass()
	 * @generated
	 */
	EAttribute getHauptschloss_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss <em>Schloss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schloss</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss
	 * @generated
	 */
	EClass getSchloss();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getBezeichnung()
	 * @see #getSchloss()
	 * @generated
	 */
	EReference getSchloss_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getIDSchluessel <em>ID Schluessel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Schluessel</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getIDSchluessel()
	 * @see #getSchloss()
	 * @generated
	 */
	EReference getSchloss_IDSchluessel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchluesselInGrdstEingeschl <em>Schluessel In Grdst Eingeschl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schluessel In Grdst Eingeschl</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchluesselInGrdstEingeschl()
	 * @see #getSchloss()
	 * @generated
	 */
	EReference getSchloss_SchluesselInGrdstEingeschl();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchlossBUE <em>Schloss BUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schloss BUE</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchlossBUE()
	 * @see #getSchloss()
	 * @generated
	 */
	EReference getSchloss_SchlossBUE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchlossGsp <em>Schloss Gsp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schloss Gsp</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchlossGsp()
	 * @see #getSchloss()
	 * @generated
	 */
	EReference getSchloss_SchlossGsp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchlossSk <em>Schloss Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schloss Sk</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchlossSk()
	 * @see #getSchloss()
	 * @generated
	 */
	EReference getSchloss_SchlossSk();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchlossSonderanlage <em>Schloss Sonderanlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schloss Sonderanlage</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchlossSonderanlage()
	 * @see #getSchloss()
	 * @generated
	 */
	EReference getSchloss_SchlossSonderanlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchlossSsp <em>Schloss Ssp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schloss Ssp</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchlossSsp()
	 * @see #getSchloss()
	 * @generated
	 */
	EReference getSchloss_SchlossSsp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchlossW <em>Schloss W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schloss W</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getSchlossW()
	 * @see #getSchloss()
	 * @generated
	 */
	EReference getSchloss_SchlossW();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getTechnischBerechtigter <em>Technisch Berechtigter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technisch Berechtigter</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss#getTechnischBerechtigter()
	 * @see #getSchloss()
	 * @generated
	 */
	EReference getSchloss_TechnischBerechtigter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Art_TypeClass <em>Schloss Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schloss Art Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Art_TypeClass
	 * @generated
	 */
	EClass getSchloss_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Art_TypeClass#getWert()
	 * @see #getSchloss_Art_TypeClass()
	 * @generated
	 */
	EAttribute getSchloss_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Bezeichnung_AttributeGroup <em>Schloss Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schloss Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getSchloss_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Bezeichnung_AttributeGroup#getBezeichnungSchloss <em>Bezeichnung Schloss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Schloss</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Bezeichnung_AttributeGroup#getBezeichnungSchloss()
	 * @see #getSchloss_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_Bezeichnung_AttributeGroup_BezeichnungSchloss();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_BUE_AttributeGroup <em>Schloss BUE Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schloss BUE Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_BUE_AttributeGroup
	 * @generated
	 */
	EClass getSchloss_BUE_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_BUE_AttributeGroup#getBUELage <em>BUE Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BUE Lage</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_BUE_AttributeGroup#getBUELage()
	 * @see #getSchloss_BUE_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_BUE_AttributeGroup_BUELage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_BUE_AttributeGroup#getIDBUEAnlage <em>IDBUE Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDBUE Anlage</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_BUE_AttributeGroup#getIDBUEAnlage()
	 * @see #getSchloss_BUE_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_BUE_AttributeGroup_IDBUEAnlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup <em>Schloss Gsp Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schloss Gsp Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup
	 * @generated
	 */
	EClass getSchloss_Gsp_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getGspLage <em>Gsp Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gsp Lage</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getGspLage()
	 * @see #getSchloss_Gsp_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_Gsp_AttributeGroup_GspLage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getIDGspElement <em>ID Gsp Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Gsp Element</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getIDGspElement()
	 * @see #getSchloss_Gsp_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_Gsp_AttributeGroup_IDGspElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup <em>Schloss Sk Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schloss Sk Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup
	 * @generated
	 */
	EClass getSchloss_Sk_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getHauptschloss <em>Hauptschloss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hauptschloss</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getHauptschloss()
	 * @see #getSchloss_Sk_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_Sk_AttributeGroup_Hauptschloss();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getIDSchlosskombination <em>ID Schlosskombination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Schlosskombination</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getIDSchlosskombination()
	 * @see #getSchloss_Sk_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_Sk_AttributeGroup_IDSchlosskombination();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup <em>Schloss Sonderanlage Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schloss Sonderanlage Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup
	 * @generated
	 */
	EClass getSchloss_Sonderanlage_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getSonderanlageLage <em>Sonderanlage Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sonderanlage Lage</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getSonderanlageLage()
	 * @see #getSchloss_Sonderanlage_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_Sonderanlage_AttributeGroup_SonderanlageLage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getBeschreibungSonderanlage <em>Beschreibung Sonderanlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beschreibung Sonderanlage</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getBeschreibungSonderanlage()
	 * @see #getSchloss_Sonderanlage_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_Sonderanlage_AttributeGroup_BeschreibungSonderanlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getIDSonderanlage <em>ID Sonderanlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Sonderanlage</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getIDSonderanlage()
	 * @see #getSchloss_Sonderanlage_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_Sonderanlage_AttributeGroup_IDSonderanlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup <em>Schloss Ssp Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schloss Ssp Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup
	 * @generated
	 */
	EClass getSchloss_Ssp_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Schluesselsperre</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup#getIDSchluesselsperre()
	 * @see #getSchloss_Ssp_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_Ssp_AttributeGroup_IDSchluesselsperre();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup <em>Schloss WAttribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schloss WAttribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup
	 * @generated
	 */
	EClass getSchloss_W_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getIDWKrElement <em>IDW Kr Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDW Kr Element</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getIDWKrElement()
	 * @see #getSchloss_W_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_W_AttributeGroup_IDWKrElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getSchlossArt <em>Schloss Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schloss Art</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getSchlossArt()
	 * @see #getSchloss_W_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_W_AttributeGroup_SchlossArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getVerschlussOrt <em>Verschluss Ort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verschluss Ort</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getVerschlussOrt()
	 * @see #getSchloss_W_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_W_AttributeGroup_VerschlussOrt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getWAnbaulage <em>WAnbaulage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WAnbaulage</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getWAnbaulage()
	 * @see #getSchloss_W_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_W_AttributeGroup_WAnbaulage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getWLage <em>WLage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WLage</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getWLage()
	 * @see #getSchloss_W_AttributeGroup()
	 * @generated
	 */
	EReference getSchloss_W_AttributeGroup_WLage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schlosskombination <em>Schlosskombination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schlosskombination</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schlosskombination
	 * @generated
	 */
	EClass getSchlosskombination();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schlosskombination#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schlosskombination#getBezeichnung()
	 * @see #getSchlosskombination()
	 * @generated
	 */
	EReference getSchlosskombination_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schlosskombination#getIDUnterbringung <em>ID Unterbringung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Unterbringung</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schlosskombination#getIDUnterbringung()
	 * @see #getSchlosskombination()
	 * @generated
	 */
	EReference getSchlosskombination_IDUnterbringung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schlosskombination_Bezeichnung_AttributeGroup <em>Schlosskombination Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schlosskombination Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schlosskombination_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getSchlosskombination_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schlosskombination_Bezeichnung_AttributeGroup#getBezeichnungSk <em>Bezeichnung Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Sk</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schlosskombination_Bezeichnung_AttributeGroup#getBezeichnungSk()
	 * @see #getSchlosskombination_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getSchlosskombination_Bezeichnung_AttributeGroup_BezeichnungSk();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel <em>Schluessel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schluessel</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel
	 * @generated
	 */
	EClass getSchluessel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel#getBezeichnung()
	 * @see #getSchluessel()
	 * @generated
	 */
	EReference getSchluessel_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel#getSchluesselAllg <em>Schluessel Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schluessel Allg</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel#getSchluesselAllg()
	 * @see #getSchluessel()
	 * @generated
	 */
	EReference getSchluessel_SchluesselAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup <em>Schluessel Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schluessel Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup
	 * @generated
	 */
	EClass getSchluessel_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup#getSchluesselBartform <em>Schluessel Bartform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schluessel Bartform</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup#getSchluesselBartform()
	 * @see #getSchluessel_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getSchluessel_Allg_AttributeGroup_SchluesselBartform();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup#getSchluesselGruppe <em>Schluessel Gruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schluessel Gruppe</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup#getSchluesselGruppe()
	 * @see #getSchluessel_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getSchluessel_Allg_AttributeGroup_SchluesselGruppe();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Bartform_TypeClass <em>Schluessel Bartform Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schluessel Bartform Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Bartform_TypeClass
	 * @generated
	 */
	EClass getSchluessel_Bartform_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Bartform_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Bartform_TypeClass#getWert()
	 * @see #getSchluessel_Bartform_TypeClass()
	 * @generated
	 */
	EAttribute getSchluessel_Bartform_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Bezeichnung_AttributeGroup <em>Schluessel Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schluessel Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getSchluessel_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Bezeichnung_AttributeGroup#getBezeichnungSchluessel <em>Bezeichnung Schluessel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Schluessel</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Bezeichnung_AttributeGroup#getBezeichnungSchluessel()
	 * @see #getSchluessel_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getSchluessel_Bezeichnung_AttributeGroup_BezeichnungSchluessel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass <em>Schluessel Gruppe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schluessel Gruppe Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass
	 * @generated
	 */
	EClass getSchluessel_Gruppe_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass#getWert()
	 * @see #getSchluessel_Gruppe_TypeClass()
	 * @generated
	 */
	EAttribute getSchluessel_Gruppe_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_In_Grdst_Eingeschl_TypeClass <em>Schluessel In Grdst Eingeschl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schluessel In Grdst Eingeschl Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_In_Grdst_Eingeschl_TypeClass
	 * @generated
	 */
	EClass getSchluessel_In_Grdst_Eingeschl_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_In_Grdst_Eingeschl_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_In_Grdst_Eingeschl_TypeClass#getWert()
	 * @see #getSchluessel_In_Grdst_Eingeschl_TypeClass()
	 * @generated
	 */
	EAttribute getSchluessel_In_Grdst_Eingeschl_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluesselsperre <em>Schluesselsperre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schluesselsperre</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluesselsperre
	 * @generated
	 */
	EClass getSchluesselsperre();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluesselsperre#getBedienungArt <em>Bedienung Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedienung Art</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluesselsperre#getBedienungArt()
	 * @see #getSchluesselsperre()
	 * @generated
	 */
	EReference getSchluesselsperre_BedienungArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluesselsperre#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluesselsperre#getBezeichnung()
	 * @see #getSchluesselsperre()
	 * @generated
	 */
	EReference getSchluesselsperre_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluesselsperre#getIDStellelement <em>ID Stellelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Stellelement</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluesselsperre#getIDStellelement()
	 * @see #getSchluesselsperre()
	 * @generated
	 */
	EReference getSchluesselsperre_IDStellelement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluesselsperre#getIDUnterbringung <em>ID Unterbringung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Unterbringung</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluesselsperre#getIDUnterbringung()
	 * @see #getSchluesselsperre()
	 * @generated
	 */
	EReference getSchluesselsperre_IDUnterbringung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Sonderanlage_Lage_TypeClass <em>Sonderanlage Lage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sonderanlage Lage Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Sonderanlage_Lage_TypeClass
	 * @generated
	 */
	EClass getSonderanlage_Lage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Sonderanlage_Lage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Sonderanlage_Lage_TypeClass#getWert()
	 * @see #getSonderanlage_Lage_TypeClass()
	 * @generated
	 */
	EAttribute getSonderanlage_Lage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Technisch_Berechtigter_TypeClass <em>Technisch Berechtigter Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technisch Berechtigter Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Technisch_Berechtigter_TypeClass
	 * @generated
	 */
	EClass getTechnisch_Berechtigter_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Technisch_Berechtigter_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Technisch_Berechtigter_TypeClass#getWert()
	 * @see #getTechnisch_Berechtigter_TypeClass()
	 * @generated
	 */
	EAttribute getTechnisch_Berechtigter_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Verschluss_Ort_TypeClass <em>Verschluss Ort Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verschluss Ort Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Verschluss_Ort_TypeClass
	 * @generated
	 */
	EClass getVerschluss_Ort_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Verschluss_Ort_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Verschluss_Ort_TypeClass#getWert()
	 * @see #getVerschluss_Ort_TypeClass()
	 * @generated
	 */
	EAttribute getVerschluss_Ort_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.W_Anbaulage_TypeClass <em>WAnbaulage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WAnbaulage Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.W_Anbaulage_TypeClass
	 * @generated
	 */
	EClass getW_Anbaulage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.W_Anbaulage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.W_Anbaulage_TypeClass#getWert()
	 * @see #getW_Anbaulage_TypeClass()
	 * @generated
	 */
	EAttribute getW_Anbaulage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.W_Lage_TypeClass <em>WLage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WLage Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.W_Lage_TypeClass
	 * @generated
	 */
	EClass getW_Lage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.W_Lage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.W_Lage_TypeClass#getWert()
	 * @see #getW_Lage_TypeClass()
	 * @generated
	 */
	EAttribute getW_Lage_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBedienungArt <em>ENUM Bedienung Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Bedienung Art</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBedienungArt
	 * @generated
	 */
	EEnum getENUMBedienungArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBUELage <em>ENUMBUE Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMBUE Lage</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBUELage
	 * @generated
	 */
	EEnum getENUMBUELage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMGspLage <em>ENUM Gsp Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Gsp Lage</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMGspLage
	 * @generated
	 */
	EEnum getENUMGspLage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchlossArt <em>ENUM Schloss Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Schloss Art</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchlossArt
	 * @generated
	 */
	EEnum getENUMSchlossArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselBartform <em>ENUM Schluessel Bartform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Schluessel Bartform</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselBartform
	 * @generated
	 */
	EEnum getENUMSchluesselBartform();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselGruppe <em>ENUM Schluessel Gruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Schluessel Gruppe</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselGruppe
	 * @generated
	 */
	EEnum getENUMSchluesselGruppe();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSonderanlageLage <em>ENUM Sonderanlage Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Sonderanlage Lage</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSonderanlageLage
	 * @generated
	 */
	EEnum getENUMSonderanlageLage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMVerschlussOrt <em>ENUM Verschluss Ort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Verschluss Ort</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMVerschlussOrt
	 * @generated
	 */
	EEnum getENUMVerschlussOrt();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Beschreibung Sonderanlage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Beschreibung Sonderanlage Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBeschreibung_Sonderanlage' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{1,50}'"
	 * @generated
	 */
	EDataType getBeschreibung_Sonderanlage_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Schloss Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Schloss Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Schloss' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{1,20}'"
	 * @generated
	 */
	EDataType getBezeichnung_Schloss_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Schluessel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Schluessel Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Schluessel' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{1,20}'"
	 * @generated
	 */
	EDataType getBezeichnung_Schluessel_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Sk Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Sk Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Sk' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TZeichenkette'"
	 * @generated
	 */
	EDataType getBezeichnung_Sk_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBedienungArt <em>ENUM Bedienung Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Bedienung Art Object</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBedienungArt
	 * @model instanceClass="org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBedienungArt"
	 *        extendedMetaData="name='ENUMBedienung_Art:Object' baseType='ENUMBedienung_Art'"
	 * @generated
	 */
	EDataType getENUMBedienungArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBUELage <em>ENUMBUE Lage Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMBUE Lage Object</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBUELage
	 * @model instanceClass="org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBUELage"
	 *        extendedMetaData="name='ENUMBUE_Lage:Object' baseType='ENUMBUE_Lage'"
	 * @generated
	 */
	EDataType getENUMBUELageObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMGspLage <em>ENUM Gsp Lage Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Gsp Lage Object</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMGspLage
	 * @model instanceClass="org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMGspLage"
	 *        extendedMetaData="name='ENUMGsp_Lage:Object' baseType='ENUMGsp_Lage'"
	 * @generated
	 */
	EDataType getENUMGspLageObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchlossArt <em>ENUM Schloss Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Schloss Art Object</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchlossArt
	 * @model instanceClass="org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchlossArt"
	 *        extendedMetaData="name='ENUMSchloss_Art:Object' baseType='ENUMSchloss_Art'"
	 * @generated
	 */
	EDataType getENUMSchlossArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselBartform <em>ENUM Schluessel Bartform Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Schluessel Bartform Object</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselBartform
	 * @model instanceClass="org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselBartform"
	 *        extendedMetaData="name='ENUMSchluessel_Bartform:Object' baseType='ENUMSchluessel_Bartform'"
	 * @generated
	 */
	EDataType getENUMSchluesselBartformObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselGruppe <em>ENUM Schluessel Gruppe Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Schluessel Gruppe Object</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselGruppe
	 * @model instanceClass="org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselGruppe"
	 *        extendedMetaData="name='ENUMSchluessel_Gruppe:Object' baseType='ENUMSchluessel_Gruppe'"
	 * @generated
	 */
	EDataType getENUMSchluesselGruppeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSonderanlageLage <em>ENUM Sonderanlage Lage Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Sonderanlage Lage Object</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSonderanlageLage
	 * @model instanceClass="org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSonderanlageLage"
	 *        extendedMetaData="name='ENUMSonderanlage_Lage:Object' baseType='ENUMSonderanlage_Lage'"
	 * @generated
	 */
	EDataType getENUMSonderanlageLageObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMVerschlussOrt <em>ENUM Verschluss Ort Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Verschluss Ort Object</em>'.
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMVerschlussOrt
	 * @model instanceClass="org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMVerschlussOrt"
	 *        extendedMetaData="name='ENUMVerschluss_Ort:Object' baseType='ENUMVerschluss_Ort'"
	 * @generated
	 */
	EDataType getENUMVerschlussOrtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts <em>WAnbaulage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>WAnbaulage Type</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts"
	 *        extendedMetaData="name='TW_Anbaulage' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts'"
	 * @generated
	 */
	EDataType getW_Anbaulage_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts <em>WLage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>WLage Type</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts"
	 *        extendedMetaData="name='TW_Lage' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts'"
	 * @generated
	 */
	EDataType getW_Lage_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchluesselabhaengigkeitenFactory getSchluesselabhaengigkeitenFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bedienung_Art_TypeClassImpl <em>Bedienung Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bedienung_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBedienung_Art_TypeClass()
		 * @generated
		 */
		EClass BEDIENUNG_ART_TYPE_CLASS = eINSTANCE.getBedienung_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEDIENUNG_ART_TYPE_CLASS__WERT = eINSTANCE.getBedienung_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Beschreibung_Sonderanlage_TypeClassImpl <em>Beschreibung Sonderanlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Beschreibung_Sonderanlage_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBeschreibung_Sonderanlage_TypeClass()
		 * @generated
		 */
		EClass BESCHREIBUNG_SONDERANLAGE_TYPE_CLASS = eINSTANCE.getBeschreibung_Sonderanlage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BESCHREIBUNG_SONDERANLAGE_TYPE_CLASS__WERT = eINSTANCE.getBeschreibung_Sonderanlage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bezeichnung_Schloss_TypeClassImpl <em>Bezeichnung Schloss Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bezeichnung_Schloss_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBezeichnung_Schloss_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_SCHLOSS_TYPE_CLASS = eINSTANCE.getBezeichnung_Schloss_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_SCHLOSS_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Schloss_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bezeichnung_Schluessel_TypeClassImpl <em>Bezeichnung Schluessel Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bezeichnung_Schluessel_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBezeichnung_Schluessel_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_SCHLUESSEL_TYPE_CLASS = eINSTANCE.getBezeichnung_Schluessel_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_SCHLUESSEL_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Schluessel_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bezeichnung_Sk_TypeClassImpl <em>Bezeichnung Sk Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Bezeichnung_Sk_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBezeichnung_Sk_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_SK_TYPE_CLASS = eINSTANCE.getBezeichnung_Sk_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_SK_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Sk_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.BUE_Lage_TypeClassImpl <em>BUE Lage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.BUE_Lage_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBUE_Lage_TypeClass()
		 * @generated
		 */
		EClass BUE_LAGE_TYPE_CLASS = eINSTANCE.getBUE_Lage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUE_LAGE_TYPE_CLASS__WERT = eINSTANCE.getBUE_Lage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Gsp_Lage_TypeClassImpl <em>Gsp Lage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Gsp_Lage_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getGsp_Lage_TypeClass()
		 * @generated
		 */
		EClass GSP_LAGE_TYPE_CLASS = eINSTANCE.getGsp_Lage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSP_LAGE_TYPE_CLASS__WERT = eINSTANCE.getGsp_Lage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Hauptschloss_TypeClassImpl <em>Hauptschloss Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Hauptschloss_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getHauptschloss_TypeClass()
		 * @generated
		 */
		EClass HAUPTSCHLOSS_TYPE_CLASS = eINSTANCE.getHauptschloss_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAUPTSCHLOSS_TYPE_CLASS__WERT = eINSTANCE.getHauptschloss_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl <em>Schloss</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss()
		 * @generated
		 */
		EClass SCHLOSS = eINSTANCE.getSchloss();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS__BEZEICHNUNG = eINSTANCE.getSchloss_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Schluessel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS__ID_SCHLUESSEL = eINSTANCE.getSchloss_IDSchluessel();

		/**
		 * The meta object literal for the '<em><b>Schluessel In Grdst Eingeschl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL = eINSTANCE.getSchloss_SchluesselInGrdstEingeschl();

		/**
		 * The meta object literal for the '<em><b>Schloss BUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS__SCHLOSS_BUE = eINSTANCE.getSchloss_SchlossBUE();

		/**
		 * The meta object literal for the '<em><b>Schloss Gsp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS__SCHLOSS_GSP = eINSTANCE.getSchloss_SchlossGsp();

		/**
		 * The meta object literal for the '<em><b>Schloss Sk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS__SCHLOSS_SK = eINSTANCE.getSchloss_SchlossSk();

		/**
		 * The meta object literal for the '<em><b>Schloss Sonderanlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS__SCHLOSS_SONDERANLAGE = eINSTANCE.getSchloss_SchlossSonderanlage();

		/**
		 * The meta object literal for the '<em><b>Schloss Ssp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS__SCHLOSS_SSP = eINSTANCE.getSchloss_SchlossSsp();

		/**
		 * The meta object literal for the '<em><b>Schloss W</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS__SCHLOSS_W = eINSTANCE.getSchloss_SchlossW();

		/**
		 * The meta object literal for the '<em><b>Technisch Berechtigter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS__TECHNISCH_BERECHTIGTER = eINSTANCE.getSchloss_TechnischBerechtigter();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Art_TypeClassImpl <em>Schloss Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_Art_TypeClass()
		 * @generated
		 */
		EClass SCHLOSS_ART_TYPE_CLASS = eINSTANCE.getSchloss_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHLOSS_ART_TYPE_CLASS__WERT = eINSTANCE.getSchloss_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Bezeichnung_AttributeGroupImpl <em>Schloss Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getSchloss_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Schloss</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLOSS = eINSTANCE.getSchloss_Bezeichnung_AttributeGroup_BezeichnungSchloss();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_BUE_AttributeGroupImpl <em>Schloss BUE Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_BUE_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_BUE_AttributeGroup()
		 * @generated
		 */
		EClass SCHLOSS_BUE_ATTRIBUTE_GROUP = eINSTANCE.getSchloss_BUE_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>BUE Lage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_BUE_ATTRIBUTE_GROUP__BUE_LAGE = eINSTANCE.getSchloss_BUE_AttributeGroup_BUELage();

		/**
		 * The meta object literal for the '<em><b>IDBUE Anlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_BUE_ATTRIBUTE_GROUP__IDBUE_ANLAGE = eINSTANCE.getSchloss_BUE_AttributeGroup_IDBUEAnlage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Gsp_AttributeGroupImpl <em>Schloss Gsp Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Gsp_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_Gsp_AttributeGroup()
		 * @generated
		 */
		EClass SCHLOSS_GSP_ATTRIBUTE_GROUP = eINSTANCE.getSchloss_Gsp_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Gsp Lage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_GSP_ATTRIBUTE_GROUP__GSP_LAGE = eINSTANCE.getSchloss_Gsp_AttributeGroup_GspLage();

		/**
		 * The meta object literal for the '<em><b>ID Gsp Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_GSP_ATTRIBUTE_GROUP__ID_GSP_ELEMENT = eINSTANCE.getSchloss_Gsp_AttributeGroup_IDGspElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Sk_AttributeGroupImpl <em>Schloss Sk Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Sk_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_Sk_AttributeGroup()
		 * @generated
		 */
		EClass SCHLOSS_SK_ATTRIBUTE_GROUP = eINSTANCE.getSchloss_Sk_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Hauptschloss</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS = eINSTANCE.getSchloss_Sk_AttributeGroup_Hauptschloss();

		/**
		 * The meta object literal for the '<em><b>ID Schlosskombination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION = eINSTANCE.getSchloss_Sk_AttributeGroup_IDSchlosskombination();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Sonderanlage_AttributeGroupImpl <em>Schloss Sonderanlage Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Sonderanlage_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_Sonderanlage_AttributeGroup()
		 * @generated
		 */
		EClass SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP = eINSTANCE.getSchloss_Sonderanlage_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Sonderanlage Lage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__SONDERANLAGE_LAGE = eINSTANCE.getSchloss_Sonderanlage_AttributeGroup_SonderanlageLage();

		/**
		 * The meta object literal for the '<em><b>Beschreibung Sonderanlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE = eINSTANCE.getSchloss_Sonderanlage_AttributeGroup_BeschreibungSonderanlage();

		/**
		 * The meta object literal for the '<em><b>ID Sonderanlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE = eINSTANCE.getSchloss_Sonderanlage_AttributeGroup_IDSonderanlage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Ssp_AttributeGroupImpl <em>Schloss Ssp Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Ssp_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_Ssp_AttributeGroup()
		 * @generated
		 */
		EClass SCHLOSS_SSP_ATTRIBUTE_GROUP = eINSTANCE.getSchloss_Ssp_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>ID Schluesselsperre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE = eINSTANCE.getSchloss_Ssp_AttributeGroup_IDSchluesselsperre();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_W_AttributeGroupImpl <em>Schloss WAttribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_W_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchloss_W_AttributeGroup()
		 * @generated
		 */
		EClass SCHLOSS_WATTRIBUTE_GROUP = eINSTANCE.getSchloss_W_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>IDW Kr Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_WATTRIBUTE_GROUP__IDW_KR_ELEMENT = eINSTANCE.getSchloss_W_AttributeGroup_IDWKrElement();

		/**
		 * The meta object literal for the '<em><b>Schloss Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_WATTRIBUTE_GROUP__SCHLOSS_ART = eINSTANCE.getSchloss_W_AttributeGroup_SchlossArt();

		/**
		 * The meta object literal for the '<em><b>Verschluss Ort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_WATTRIBUTE_GROUP__VERSCHLUSS_ORT = eINSTANCE.getSchloss_W_AttributeGroup_VerschlussOrt();

		/**
		 * The meta object literal for the '<em><b>WAnbaulage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_WATTRIBUTE_GROUP__WANBAULAGE = eINSTANCE.getSchloss_W_AttributeGroup_WAnbaulage();

		/**
		 * The meta object literal for the '<em><b>WLage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSS_WATTRIBUTE_GROUP__WLAGE = eINSTANCE.getSchloss_W_AttributeGroup_WLage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlosskombinationImpl <em>Schlosskombination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlosskombinationImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchlosskombination()
		 * @generated
		 */
		EClass SCHLOSSKOMBINATION = eINSTANCE.getSchlosskombination();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSSKOMBINATION__BEZEICHNUNG = eINSTANCE.getSchlosskombination_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Unterbringung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSSKOMBINATION__ID_UNTERBRINGUNG = eINSTANCE.getSchlosskombination_IDUnterbringung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schlosskombination_Bezeichnung_AttributeGroupImpl <em>Schlosskombination Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schlosskombination_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchlosskombination_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getSchlosskombination_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Sk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SK = eINSTANCE.getSchlosskombination_Bezeichnung_AttributeGroup_BezeichnungSk();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselImpl <em>Schluessel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluessel()
		 * @generated
		 */
		EClass SCHLUESSEL = eINSTANCE.getSchluessel();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLUESSEL__BEZEICHNUNG = eINSTANCE.getSchluessel_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>Schluessel Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLUESSEL__SCHLUESSEL_ALLG = eINSTANCE.getSchluessel_SchluesselAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Allg_AttributeGroupImpl <em>Schluessel Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluessel_Allg_AttributeGroup()
		 * @generated
		 */
		EClass SCHLUESSEL_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getSchluessel_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Schluessel Bartform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_BARTFORM = eINSTANCE.getSchluessel_Allg_AttributeGroup_SchluesselBartform();

		/**
		 * The meta object literal for the '<em><b>Schluessel Gruppe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_GRUPPE = eINSTANCE.getSchluessel_Allg_AttributeGroup_SchluesselGruppe();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Bartform_TypeClassImpl <em>Schluessel Bartform Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Bartform_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluessel_Bartform_TypeClass()
		 * @generated
		 */
		EClass SCHLUESSEL_BARTFORM_TYPE_CLASS = eINSTANCE.getSchluessel_Bartform_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHLUESSEL_BARTFORM_TYPE_CLASS__WERT = eINSTANCE.getSchluessel_Bartform_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Bezeichnung_AttributeGroupImpl <em>Schluessel Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluessel_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getSchluessel_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Schluessel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLUESSEL = eINSTANCE.getSchluessel_Bezeichnung_AttributeGroup_BezeichnungSchluessel();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Gruppe_TypeClassImpl <em>Schluessel Gruppe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_Gruppe_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluessel_Gruppe_TypeClass()
		 * @generated
		 */
		EClass SCHLUESSEL_GRUPPE_TYPE_CLASS = eINSTANCE.getSchluessel_Gruppe_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHLUESSEL_GRUPPE_TYPE_CLASS__WERT = eINSTANCE.getSchluessel_Gruppe_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_In_Grdst_Eingeschl_TypeClassImpl <em>Schluessel In Grdst Eingeschl Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schluessel_In_Grdst_Eingeschl_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluessel_In_Grdst_Eingeschl_TypeClass()
		 * @generated
		 */
		EClass SCHLUESSEL_IN_GRDST_EINGESCHL_TYPE_CLASS = eINSTANCE.getSchluessel_In_Grdst_Eingeschl_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHLUESSEL_IN_GRDST_EINGESCHL_TYPE_CLASS__WERT = eINSTANCE.getSchluessel_In_Grdst_Eingeschl_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselsperreImpl <em>Schluesselsperre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselsperreImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSchluesselsperre()
		 * @generated
		 */
		EClass SCHLUESSELSPERRE = eINSTANCE.getSchluesselsperre();

		/**
		 * The meta object literal for the '<em><b>Bedienung Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLUESSELSPERRE__BEDIENUNG_ART = eINSTANCE.getSchluesselsperre_BedienungArt();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLUESSELSPERRE__BEZEICHNUNG = eINSTANCE.getSchluesselsperre_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Stellelement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLUESSELSPERRE__ID_STELLELEMENT = eINSTANCE.getSchluesselsperre_IDStellelement();

		/**
		 * The meta object literal for the '<em><b>ID Unterbringung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHLUESSELSPERRE__ID_UNTERBRINGUNG = eINSTANCE.getSchluesselsperre_IDUnterbringung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Sonderanlage_Lage_TypeClassImpl <em>Sonderanlage Lage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Sonderanlage_Lage_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getSonderanlage_Lage_TypeClass()
		 * @generated
		 */
		EClass SONDERANLAGE_LAGE_TYPE_CLASS = eINSTANCE.getSonderanlage_Lage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONDERANLAGE_LAGE_TYPE_CLASS__WERT = eINSTANCE.getSonderanlage_Lage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Technisch_Berechtigter_TypeClassImpl <em>Technisch Berechtigter Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Technisch_Berechtigter_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getTechnisch_Berechtigter_TypeClass()
		 * @generated
		 */
		EClass TECHNISCH_BERECHTIGTER_TYPE_CLASS = eINSTANCE.getTechnisch_Berechtigter_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNISCH_BERECHTIGTER_TYPE_CLASS__WERT = eINSTANCE.getTechnisch_Berechtigter_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Verschluss_Ort_TypeClassImpl <em>Verschluss Ort Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Verschluss_Ort_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getVerschluss_Ort_TypeClass()
		 * @generated
		 */
		EClass VERSCHLUSS_ORT_TYPE_CLASS = eINSTANCE.getVerschluss_Ort_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSCHLUSS_ORT_TYPE_CLASS__WERT = eINSTANCE.getVerschluss_Ort_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.W_Anbaulage_TypeClassImpl <em>WAnbaulage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.W_Anbaulage_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getW_Anbaulage_TypeClass()
		 * @generated
		 */
		EClass WANBAULAGE_TYPE_CLASS = eINSTANCE.getW_Anbaulage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WANBAULAGE_TYPE_CLASS__WERT = eINSTANCE.getW_Anbaulage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.W_Lage_TypeClassImpl <em>WLage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.W_Lage_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getW_Lage_TypeClass()
		 * @generated
		 */
		EClass WLAGE_TYPE_CLASS = eINSTANCE.getW_Lage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WLAGE_TYPE_CLASS__WERT = eINSTANCE.getW_Lage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBedienungArt <em>ENUM Bedienung Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBedienungArt
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMBedienungArt()
		 * @generated
		 */
		EEnum ENUM_BEDIENUNG_ART = eINSTANCE.getENUMBedienungArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBUELage <em>ENUMBUE Lage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBUELage
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMBUELage()
		 * @generated
		 */
		EEnum ENUMBUE_LAGE = eINSTANCE.getENUMBUELage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMGspLage <em>ENUM Gsp Lage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMGspLage
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMGspLage()
		 * @generated
		 */
		EEnum ENUM_GSP_LAGE = eINSTANCE.getENUMGspLage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchlossArt <em>ENUM Schloss Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchlossArt
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSchlossArt()
		 * @generated
		 */
		EEnum ENUM_SCHLOSS_ART = eINSTANCE.getENUMSchlossArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselBartform <em>ENUM Schluessel Bartform</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselBartform
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSchluesselBartform()
		 * @generated
		 */
		EEnum ENUM_SCHLUESSEL_BARTFORM = eINSTANCE.getENUMSchluesselBartform();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselGruppe <em>ENUM Schluessel Gruppe</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselGruppe
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSchluesselGruppe()
		 * @generated
		 */
		EEnum ENUM_SCHLUESSEL_GRUPPE = eINSTANCE.getENUMSchluesselGruppe();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSonderanlageLage <em>ENUM Sonderanlage Lage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSonderanlageLage
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSonderanlageLage()
		 * @generated
		 */
		EEnum ENUM_SONDERANLAGE_LAGE = eINSTANCE.getENUMSonderanlageLage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMVerschlussOrt <em>ENUM Verschluss Ort</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMVerschlussOrt
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMVerschlussOrt()
		 * @generated
		 */
		EEnum ENUM_VERSCHLUSS_ORT = eINSTANCE.getENUMVerschlussOrt();

		/**
		 * The meta object literal for the '<em>Beschreibung Sonderanlage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBeschreibung_Sonderanlage_Type()
		 * @generated
		 */
		EDataType BESCHREIBUNG_SONDERANLAGE_TYPE = eINSTANCE.getBeschreibung_Sonderanlage_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung Schloss Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBezeichnung_Schloss_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_SCHLOSS_TYPE = eINSTANCE.getBezeichnung_Schloss_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung Schluessel Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBezeichnung_Schluessel_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_SCHLUESSEL_TYPE = eINSTANCE.getBezeichnung_Schluessel_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung Sk Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getBezeichnung_Sk_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_SK_TYPE = eINSTANCE.getBezeichnung_Sk_Type();

		/**
		 * The meta object literal for the '<em>ENUM Bedienung Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBedienungArt
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMBedienungArtObject()
		 * @generated
		 */
		EDataType ENUM_BEDIENUNG_ART_OBJECT = eINSTANCE.getENUMBedienungArtObject();

		/**
		 * The meta object literal for the '<em>ENUMBUE Lage Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMBUELage
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMBUELageObject()
		 * @generated
		 */
		EDataType ENUMBUE_LAGE_OBJECT = eINSTANCE.getENUMBUELageObject();

		/**
		 * The meta object literal for the '<em>ENUM Gsp Lage Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMGspLage
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMGspLageObject()
		 * @generated
		 */
		EDataType ENUM_GSP_LAGE_OBJECT = eINSTANCE.getENUMGspLageObject();

		/**
		 * The meta object literal for the '<em>ENUM Schloss Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchlossArt
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSchlossArtObject()
		 * @generated
		 */
		EDataType ENUM_SCHLOSS_ART_OBJECT = eINSTANCE.getENUMSchlossArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Schluessel Bartform Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselBartform
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSchluesselBartformObject()
		 * @generated
		 */
		EDataType ENUM_SCHLUESSEL_BARTFORM_OBJECT = eINSTANCE.getENUMSchluesselBartformObject();

		/**
		 * The meta object literal for the '<em>ENUM Schluessel Gruppe Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSchluesselGruppe
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSchluesselGruppeObject()
		 * @generated
		 */
		EDataType ENUM_SCHLUESSEL_GRUPPE_OBJECT = eINSTANCE.getENUMSchluesselGruppeObject();

		/**
		 * The meta object literal for the '<em>ENUM Sonderanlage Lage Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMSonderanlageLage
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMSonderanlageLageObject()
		 * @generated
		 */
		EDataType ENUM_SONDERANLAGE_LAGE_OBJECT = eINSTANCE.getENUMSonderanlageLageObject();

		/**
		 * The meta object literal for the '<em>ENUM Verschluss Ort Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.ENUMVerschlussOrt
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getENUMVerschlussOrtObject()
		 * @generated
		 */
		EDataType ENUM_VERSCHLUSS_ORT_OBJECT = eINSTANCE.getENUMVerschlussOrtObject();

		/**
		 * The meta object literal for the '<em>WAnbaulage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getW_Anbaulage_Type()
		 * @generated
		 */
		EDataType WANBAULAGE_TYPE = eINSTANCE.getW_Anbaulage_Type();

		/**
		 * The meta object literal for the '<em>WLage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
		 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl#getW_Lage_Type()
		 * @generated
		 */
		EDataType WLAGE_TYPE = eINSTANCE.getW_Lage_Type();

	}

} //SchluesselabhaengigkeitenPackage
