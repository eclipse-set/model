/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ortung;

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
 * @see org.eclipse.set.model.model11001.Ortung.OrtungFactory
 * @model kind="package"
 * @generated
 */
public interface OrtungPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Ortung";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Ortung/1.10.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsOrtung";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrtungPackage eINSTANCE = org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Bettungswiderstand_TypeClassImpl <em>Bettungswiderstand Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.Bettungswiderstand_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getBettungswiderstand_TypeClass()
	 * @generated
	 */
	int BETTUNGSWIDERSTAND_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETTUNGSWIDERSTAND_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETTUNGSWIDERSTAND_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bettungswiderstand Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETTUNGSWIDERSTAND_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Bezeichnung_Kennbuchstabe_TypeClassImpl <em>Bezeichnung Kennbuchstabe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.Bezeichnung_Kennbuchstabe_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getBezeichnung_Kennbuchstabe_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_KENNBUCHSTABE_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_KENNBUCHSTABE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_KENNBUCHSTABE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Kennbuchstabe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_KENNBUCHSTABE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_AnlageImpl <em>FMA Anlage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_AnlageImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anlage()
	 * @generated
	 */
	int FMA_ANLAGE = 2;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>FMA Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE__FMA_ANLAGE_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>FMA Anlage Elektr Merkmale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>FMA Anlage Kaskade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE__FMA_ANLAGE_KASKADE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>FMA Anlage Uebertragung FMinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ID Gleis Abschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE__ID_GLEIS_ABSCHNITT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>ID Gleisfreimelde Innenanlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>FMA Anlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Allg_AttributeGroupImpl <em>FMA Anlage Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	int FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>FMA Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ART = 0;

	/**
	 * The feature id for the '<em><b>FMA Hilffreimeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_HILFFREIMELDUNG = 1;

	/**
	 * The feature id for the '<em><b>FMA Isolierung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ISOLIERUNG = 2;

	/**
	 * The feature id for the '<em><b>FMA Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_TYP = 3;

	/**
	 * The number of structural features of the '<em>FMA Anlage Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Bezeichnung_AttributeGroupImpl <em>FMA Anlage Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anlage_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Bezeichnung Kennbuchstabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KENNBUCHSTABE = 0;

	/**
	 * The number of structural features of the '<em>FMA Anlage Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl <em>FMA Anlage Elektr Merkmale Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anlage_Elektr_Merkmale_AttributeGroup()
	 * @generated
	 */
	int FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Bettungswiderstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND = 0;

	/**
	 * The feature id for the '<em><b>FMA Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE = 1;

	/**
	 * The feature id for the '<em><b>FMA Laenge Beeinflusst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST = 2;

	/**
	 * The feature id for the '<em><b>FMA Laenge E1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1 = 3;

	/**
	 * The feature id for the '<em><b>FMA Laenge E2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2 = 4;

	/**
	 * The feature id for the '<em><b>FMA Laenge E3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3 = 5;

	/**
	 * The feature id for the '<em><b>FMA Laenge S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S = 6;

	/**
	 * The number of structural features of the '<em>FMA Anlage Elektr Merkmale Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Kaskade_AttributeGroupImpl <em>FMA Anlage Kaskade Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Kaskade_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anlage_Kaskade_AttributeGroup()
	 * @generated
	 */
	int FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP = 6;

	/**
	 * The feature id for the '<em><b>FMA Kaskade Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_BEZEICHNUNG = 0;

	/**
	 * The feature id for the '<em><b>FMA Kaskade Einzelauswertung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_EINZELAUSWERTUNG = 1;

	/**
	 * The number of structural features of the '<em>FMA Anlage Kaskade Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Uebertragung_FMinfo_AttributeGroupImpl <em>FMA Anlage Uebertragung FMinfo Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Uebertragung_FMinfo_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup()
	 * @generated
	 */
	int FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP = 7;

	/**
	 * The feature id for the '<em><b>ID Uebertragung FMinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__ID_UEBERTRAGUNG_FMINFO = 0;

	/**
	 * The feature id for the '<em><b>Uebertragung FMinfo Richtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_RICHTUNG = 1;

	/**
	 * The feature id for the '<em><b>Uebertragung FMinfo Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_TYP = 2;

	/**
	 * The number of structural features of the '<em>FMA Anlage Uebertragung FMinfo Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anschluss_Bezeichnung_TypeClassImpl <em>FMA Anschluss Bezeichnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anschluss_Bezeichnung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anschluss_Bezeichnung_TypeClass()
	 * @generated
	 */
	int FMA_ANSCHLUSS_BEZEICHNUNG_TYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANSCHLUSS_BEZEICHNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANSCHLUSS_BEZEICHNUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Anschluss Bezeichnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANSCHLUSS_BEZEICHNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anschluss_Speiserichtung_TypeClassImpl <em>FMA Anschluss Speiserichtung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anschluss_Speiserichtung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anschluss_Speiserichtung_TypeClass()
	 * @generated
	 */
	int FMA_ANSCHLUSS_SPEISERICHTUNG_TYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANSCHLUSS_SPEISERICHTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANSCHLUSS_SPEISERICHTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Anschluss Speiserichtung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ANSCHLUSS_SPEISERICHTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Art_TypeClassImpl <em>FMA Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Art_TypeClass()
	 * @generated
	 */
	int FMA_ART_TYPE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_ElementImpl <em>FMA Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_ElementImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element()
	 * @generated
	 */
	int FMA_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.PUNKT_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>FMA Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT__FMA_ELEMENT_ALLG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>FMA Element Anschluss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDFMA Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT__IDFMA_ANLAGE = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FMA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Allg_AttributeGroupImpl <em>FMA Element Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element_Allg_AttributeGroup()
	 * @generated
	 */
	int FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP = 12;

	/**
	 * The feature id for the '<em><b>FMA Element Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_ART = 0;

	/**
	 * The feature id for the '<em><b>FMA Element Seilanzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILANZAHL = 1;

	/**
	 * The feature id for the '<em><b>FMA Element Seiltyp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILTYP = 2;

	/**
	 * The number of structural features of the '<em>FMA Element Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Anschluss_AttributeGroupImpl <em>FMA Element Anschluss Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Anschluss_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element_Anschluss_AttributeGroup()
	 * @generated
	 */
	int FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP = 13;

	/**
	 * The feature id for the '<em><b>FMA Anschluss Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_BEZEICHNUNG = 0;

	/**
	 * The feature id for the '<em><b>FMA Anschluss Speiserichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_SPEISERICHTUNG = 1;

	/**
	 * The number of structural features of the '<em>FMA Element Anschluss Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Art_TypeClassImpl <em>FMA Element Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element_Art_TypeClass()
	 * @generated
	 */
	int FMA_ELEMENT_ART_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Element Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Seilanzahl_TypeClassImpl <em>FMA Element Seilanzahl Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Seilanzahl_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element_Seilanzahl_TypeClass()
	 * @generated
	 */
	int FMA_ELEMENT_SEILANZAHL_TYPE_CLASS = 15;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_SEILANZAHL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_SEILANZAHL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Element Seilanzahl Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_SEILANZAHL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Seiltyp_TypeClassImpl <em>FMA Element Seiltyp Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Seiltyp_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element_Seiltyp_TypeClass()
	 * @generated
	 */
	int FMA_ELEMENT_SEILTYP_TYPE_CLASS = 16;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_SEILTYP_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_SEILTYP_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Element Seiltyp Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ELEMENT_SEILTYP_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Hilffreimeldung_TypeClassImpl <em>FMA Hilffreimeldung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Hilffreimeldung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Hilffreimeldung_TypeClass()
	 * @generated
	 */
	int FMA_HILFFREIMELDUNG_TYPE_CLASS = 17;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_HILFFREIMELDUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_HILFFREIMELDUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Hilffreimeldung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_HILFFREIMELDUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Isolierung_TypeClassImpl <em>FMA Isolierung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Isolierung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Isolierung_TypeClass()
	 * @generated
	 */
	int FMA_ISOLIERUNG_TYPE_CLASS = 18;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ISOLIERUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ISOLIERUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Isolierung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_ISOLIERUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Kaskade_Bezeichnung_TypeClassImpl <em>FMA Kaskade Bezeichnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Kaskade_Bezeichnung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Kaskade_Bezeichnung_TypeClass()
	 * @generated
	 */
	int FMA_KASKADE_BEZEICHNUNG_TYPE_CLASS = 19;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KASKADE_BEZEICHNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KASKADE_BEZEICHNUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Kaskade Bezeichnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KASKADE_BEZEICHNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Kaskade_Einzelauswertung_TypeClassImpl <em>FMA Kaskade Einzelauswertung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Kaskade_Einzelauswertung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Kaskade_Einzelauswertung_TypeClass()
	 * @generated
	 */
	int FMA_KASKADE_EINZELAUSWERTUNG_TYPE_CLASS = 20;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KASKADE_EINZELAUSWERTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KASKADE_EINZELAUSWERTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Kaskade Einzelauswertung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KASKADE_EINZELAUSWERTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_KomponenteImpl <em>FMA Komponente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_KomponenteImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente()
	 * @generated
	 */
	int FMA_KOMPONENTE = 21;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.PUNKT_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE__BEZEICHNUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Bezugspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE__ID_BEZUGSPUNKT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDFM Agrenze</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE__IDFM_AGRENZE = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>FMA Komponente Achszaehlpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>FMA Komponente Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE__FMA_KOMPONENTE_ART = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>FMA Komponente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl <em>FMA Komponente Achszaehlpunkt Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente_Achszaehlpunkt_AttributeGroup()
	 * @generated
	 */
	int FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP = 22;

	/**
	 * The feature id for the '<em><b>FMA Komponente Schienenprofil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_SCHIENENPROFIL = 0;

	/**
	 * The feature id for the '<em><b>FMA Komponente Stromversorgung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_STROMVERSORGUNG = 1;

	/**
	 * The feature id for the '<em><b>FMA Komponente Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_TYP = 2;

	/**
	 * The feature id for the '<em><b>ID Energie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_ENERGIE = 3;

	/**
	 * The feature id for the '<em><b>ID Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_INFORMATION = 4;

	/**
	 * The number of structural features of the '<em>FMA Komponente Achszaehlpunkt Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Art_TypeClassImpl <em>FMA Komponente Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente_Art_TypeClass()
	 * @generated
	 */
	int FMA_KOMPONENTE_ART_TYPE_CLASS = 23;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Komponente Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Schienenprofil_TypeClassImpl <em>FMA Komponente Schienenprofil Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Schienenprofil_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente_Schienenprofil_TypeClass()
	 * @generated
	 */
	int FMA_KOMPONENTE_SCHIENENPROFIL_TYPE_CLASS = 24;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_SCHIENENPROFIL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_SCHIENENPROFIL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Komponente Schienenprofil Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_SCHIENENPROFIL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Stromversorgung_TypeClassImpl <em>FMA Komponente Stromversorgung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Stromversorgung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente_Stromversorgung_TypeClass()
	 * @generated
	 */
	int FMA_KOMPONENTE_STROMVERSORGUNG_TYPE_CLASS = 25;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_STROMVERSORGUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_STROMVERSORGUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Komponente Stromversorgung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_STROMVERSORGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Typ_TypeClassImpl <em>FMA Komponente Typ Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Typ_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente_Typ_TypeClass()
	 * @generated
	 */
	int FMA_KOMPONENTE_TYP_TYPE_CLASS = 26;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_TYP_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_TYP_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Komponente Typ Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_KOMPONENTE_TYP_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_Beeinflusst_TypeClassImpl <em>FMA Laenge Beeinflusst Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_Beeinflusst_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_Beeinflusst_TypeClass()
	 * @generated
	 */
	int FMA_LAENGE_BEEINFLUSST_TYPE_CLASS = 27;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_BEEINFLUSST_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_BEEINFLUSST_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Laenge Beeinflusst Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_BEEINFLUSST_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_E1_TypeClassImpl <em>FMA Laenge E1 Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_E1_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_E1_TypeClass()
	 * @generated
	 */
	int FMA_LAENGE_E1_TYPE_CLASS = 28;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_E1_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_E1_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Laenge E1 Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_E1_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_E2_TypeClassImpl <em>FMA Laenge E2 Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_E2_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_E2_TypeClass()
	 * @generated
	 */
	int FMA_LAENGE_E2_TYPE_CLASS = 29;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_E2_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_E2_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Laenge E2 Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_E2_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_E3_TypeClassImpl <em>FMA Laenge E3 Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_E3_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_E3_TypeClass()
	 * @generated
	 */
	int FMA_LAENGE_E3_TYPE_CLASS = 30;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_E3_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_E3_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Laenge E3 Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_E3_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_S_TypeClassImpl <em>FMA Laenge SType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_S_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_S_TypeClass()
	 * @generated
	 */
	int FMA_LAENGE_STYPE_CLASS = 31;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_STYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_STYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Laenge SType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_STYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_TypeClassImpl <em>FMA Laenge Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_TypeClass()
	 * @generated
	 */
	int FMA_LAENGE_TYPE_CLASS = 32;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Laenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_LAENGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Typ_TypeClassImpl <em>FMA Typ Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Typ_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Typ_TypeClass()
	 * @generated
	 */
	int FMA_TYP_TYPE_CLASS = 33;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_TYP_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_TYP_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMA Typ Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMA_TYP_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Schaltmittel_Funktion_TypeClassImpl <em>Schaltmittel Funktion Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.Schaltmittel_Funktion_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getSchaltmittel_Funktion_TypeClass()
	 * @generated
	 */
	int SCHALTMITTEL_FUNKTION_TYPE_CLASS = 34;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_FUNKTION_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_FUNKTION_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schaltmittel Funktion Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_FUNKTION_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Schaltmittel_ZuordnungImpl <em>Schaltmittel Zuordnung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.Schaltmittel_ZuordnungImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getSchaltmittel_Zuordnung()
	 * @generated
	 */
	int SCHALTMITTEL_ZUORDNUNG = 35;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_ZUORDNUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_ZUORDNUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_ZUORDNUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_ZUORDNUNG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_ZUORDNUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Anforderung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Schalter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schaltmittel Funktion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Schaltmittel Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTMITTEL_ZUORDNUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Uebertragung_FMinfo_Richtung_TypeClassImpl <em>Uebertragung FMinfo Richtung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.Uebertragung_FMinfo_Richtung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getUebertragung_FMinfo_Richtung_TypeClass()
	 * @generated
	 */
	int UEBERTRAGUNG_FMINFO_RICHTUNG_TYPE_CLASS = 36;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERTRAGUNG_FMINFO_RICHTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERTRAGUNG_FMINFO_RICHTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uebertragung FMinfo Richtung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERTRAGUNG_FMINFO_RICHTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Uebertragung_FMinfo_Typ_TypeClassImpl <em>Uebertragung FMinfo Typ Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.Uebertragung_FMinfo_Typ_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getUebertragung_FMinfo_Typ_TypeClass()
	 * @generated
	 */
	int UEBERTRAGUNG_FMINFO_TYP_TYPE_CLASS = 37;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERTRAGUNG_FMINFO_TYP_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERTRAGUNG_FMINFO_TYP_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uebertragung FMinfo Typ Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERTRAGUNG_FMINFO_TYP_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.ZugeinwirkungImpl <em>Zugeinwirkung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.ZugeinwirkungImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getZugeinwirkung()
	 * @generated
	 */
	int ZUGEINWIRKUNG = 38;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.PUNKT_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG__BEZEICHNUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Bezugspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG__ID_BEZUGSPUNKT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zugeinwirkung Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG__ZUGEINWIRKUNG_ALLG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Zugeinwirkung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Zugeinwirkung_Allg_AttributeGroupImpl <em>Zugeinwirkung Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.Zugeinwirkung_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getZugeinwirkung_Allg_AttributeGroup()
	 * @generated
	 */
	int ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP = 39;

	/**
	 * The feature id for the '<em><b>Zugeinwirkung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_ART = 0;

	/**
	 * The feature id for the '<em><b>Zugeinwirkung Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_TYP = 1;

	/**
	 * The number of structural features of the '<em>Zugeinwirkung Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Zugeinwirkung_Art_TypeClassImpl <em>Zugeinwirkung Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.Zugeinwirkung_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getZugeinwirkung_Art_TypeClass()
	 * @generated
	 */
	int ZUGEINWIRKUNG_ART_TYPE_CLASS = 40;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zugeinwirkung Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Zugeinwirkung_Typ_TypeClassImpl <em>Zugeinwirkung Typ Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.impl.Zugeinwirkung_Typ_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getZugeinwirkung_Typ_TypeClass()
	 * @generated
	 */
	int ZUGEINWIRKUNG_TYP_TYPE_CLASS = 41;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG_TYP_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG_TYP_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zugeinwirkung Typ Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUGEINWIRKUNG_TYP_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMBezeichnungKennbuchstabe <em>ENUM Bezeichnung Kennbuchstabe</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMBezeichnungKennbuchstabe
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMBezeichnungKennbuchstabe()
	 * @generated
	 */
	int ENUM_BEZEICHNUNG_KENNBUCHSTABE = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAAnschlussSpeiserichtung <em>ENUMFMA Anschluss Speiserichtung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAAnschlussSpeiserichtung
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAAnschlussSpeiserichtung()
	 * @generated
	 */
	int ENUMFMA_ANSCHLUSS_SPEISERICHTUNG = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAArt <em>ENUMFMA Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAArt
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAArt()
	 * @generated
	 */
	int ENUMFMA_ART = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAElementArt <em>ENUMFMA Element Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAElementArt
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAElementArt()
	 * @generated
	 */
	int ENUMFMA_ELEMENT_ART = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAElementSeilanzahl <em>ENUMFMA Element Seilanzahl</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAElementSeilanzahl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAElementSeilanzahl()
	 * @generated
	 */
	int ENUMFMA_ELEMENT_SEILANZAHL = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAKomponenteArt <em>ENUMFMA Komponente Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAKomponenteArt
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAKomponenteArt()
	 * @generated
	 */
	int ENUMFMA_KOMPONENTE_ART = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMIsolierung <em>ENUM Isolierung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMIsolierung
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMIsolierung()
	 * @generated
	 */
	int ENUM_ISOLIERUNG = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMSchaltmittelFunktion <em>ENUM Schaltmittel Funktion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMSchaltmittelFunktion
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMSchaltmittelFunktion()
	 * @generated
	 */
	int ENUM_SCHALTMITTEL_FUNKTION = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMSchienenprofil <em>ENUM Schienenprofil</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMSchienenprofil
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMSchienenprofil()
	 * @generated
	 */
	int ENUM_SCHIENENPROFIL = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMUebertragungFMinfoRichtung <em>ENUM Uebertragung FMinfo Richtung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMUebertragungFMinfoRichtung
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMUebertragungFMinfoRichtung()
	 * @generated
	 */
	int ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMZugeinwirkungArt <em>ENUM Zugeinwirkung Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMZugeinwirkungArt
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMZugeinwirkungArt()
	 * @generated
	 */
	int ENUM_ZUGEINWIRKUNG_ART = 52;

	/**
	 * The meta object id for the '<em>Bettungswiderstand Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getBettungswiderstand_Type()
	 * @generated
	 */
	int BETTUNGSWIDERSTAND_TYPE = 53;

	/**
	 * The meta object id for the '<em>ENUM Bezeichnung Kennbuchstabe Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMBezeichnungKennbuchstabe
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMBezeichnungKennbuchstabeObject()
	 * @generated
	 */
	int ENUM_BEZEICHNUNG_KENNBUCHSTABE_OBJECT = 54;

	/**
	 * The meta object id for the '<em>ENUMFMA Anschluss Speiserichtung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAAnschlussSpeiserichtung
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAAnschlussSpeiserichtungObject()
	 * @generated
	 */
	int ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_OBJECT = 55;

	/**
	 * The meta object id for the '<em>ENUMFMA Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAArt
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAArtObject()
	 * @generated
	 */
	int ENUMFMA_ART_OBJECT = 56;

	/**
	 * The meta object id for the '<em>ENUMFMA Element Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAElementArt
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAElementArtObject()
	 * @generated
	 */
	int ENUMFMA_ELEMENT_ART_OBJECT = 57;

	/**
	 * The meta object id for the '<em>ENUMFMA Element Seilanzahl Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAElementSeilanzahl
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAElementSeilanzahlObject()
	 * @generated
	 */
	int ENUMFMA_ELEMENT_SEILANZAHL_OBJECT = 58;

	/**
	 * The meta object id for the '<em>ENUMFMA Komponente Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAKomponenteArt
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAKomponenteArtObject()
	 * @generated
	 */
	int ENUMFMA_KOMPONENTE_ART_OBJECT = 59;

	/**
	 * The meta object id for the '<em>ENUM Isolierung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMIsolierung
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMIsolierungObject()
	 * @generated
	 */
	int ENUM_ISOLIERUNG_OBJECT = 60;

	/**
	 * The meta object id for the '<em>ENUM Schaltmittel Funktion Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMSchaltmittelFunktion
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMSchaltmittelFunktionObject()
	 * @generated
	 */
	int ENUM_SCHALTMITTEL_FUNKTION_OBJECT = 61;

	/**
	 * The meta object id for the '<em>ENUM Schienenprofil Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMSchienenprofil
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMSchienenprofilObject()
	 * @generated
	 */
	int ENUM_SCHIENENPROFIL_OBJECT = 62;

	/**
	 * The meta object id for the '<em>ENUM Uebertragung FMinfo Richtung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMUebertragungFMinfoRichtung
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMUebertragungFMinfoRichtungObject()
	 * @generated
	 */
	int ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_OBJECT = 63;

	/**
	 * The meta object id for the '<em>ENUM Zugeinwirkung Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMZugeinwirkungArt
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMZugeinwirkungArtObject()
	 * @generated
	 */
	int ENUM_ZUGEINWIRKUNG_ART_OBJECT = 64;

	/**
	 * The meta object id for the '<em>FMA Anschluss Bezeichnung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anschluss_Bezeichnung_Type()
	 * @generated
	 */
	int FMA_ANSCHLUSS_BEZEICHNUNG_TYPE = 65;

	/**
	 * The meta object id for the '<em>FMA Element Seiltyp Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element_Seiltyp_Type()
	 * @generated
	 */
	int FMA_ELEMENT_SEILTYP_TYPE = 66;

	/**
	 * The meta object id for the '<em>FMA Kaskade Bezeichnung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Kaskade_Bezeichnung_Type()
	 * @generated
	 */
	int FMA_KASKADE_BEZEICHNUNG_TYPE = 67;

	/**
	 * The meta object id for the '<em>FMA Komponente Typ Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente_Typ_Type()
	 * @generated
	 */
	int FMA_KOMPONENTE_TYP_TYPE = 68;

	/**
	 * The meta object id for the '<em>FMA Laenge Beeinflusst Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_Beeinflusst_Type()
	 * @generated
	 */
	int FMA_LAENGE_BEEINFLUSST_TYPE = 69;

	/**
	 * The meta object id for the '<em>FMA Laenge E1 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_E1_Type()
	 * @generated
	 */
	int FMA_LAENGE_E1_TYPE = 70;

	/**
	 * The meta object id for the '<em>FMA Laenge E2 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_E2_Type()
	 * @generated
	 */
	int FMA_LAENGE_E2_TYPE = 71;

	/**
	 * The meta object id for the '<em>FMA Laenge E3 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_E3_Type()
	 * @generated
	 */
	int FMA_LAENGE_E3_TYPE = 72;

	/**
	 * The meta object id for the '<em>FMA Laenge SType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_S_Type()
	 * @generated
	 */
	int FMA_LAENGE_STYPE = 73;

	/**
	 * The meta object id for the '<em>FMA Laenge Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_Type()
	 * @generated
	 */
	int FMA_LAENGE_TYPE = 74;

	/**
	 * The meta object id for the '<em>FMA Typ Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Typ_Type()
	 * @generated
	 */
	int FMA_TYP_TYPE = 75;

	/**
	 * The meta object id for the '<em>Uebertragung FMinfo Typ Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getUebertragung_FMinfo_Typ_Type()
	 * @generated
	 */
	int UEBERTRAGUNG_FMINFO_TYP_TYPE = 76;

	/**
	 * The meta object id for the '<em>Zugeinwirkung Typ Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getZugeinwirkung_Typ_Type()
	 * @generated
	 */
	int ZUGEINWIRKUNG_TYP_TYPE = 77;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.Bettungswiderstand_TypeClass <em>Bettungswiderstand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bettungswiderstand Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Bettungswiderstand_TypeClass
	 * @generated
	 */
	EClass getBettungswiderstand_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.Bettungswiderstand_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Bettungswiderstand_TypeClass#getWert()
	 * @see #getBettungswiderstand_TypeClass()
	 * @generated
	 */
	EAttribute getBettungswiderstand_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.Bezeichnung_Kennbuchstabe_TypeClass <em>Bezeichnung Kennbuchstabe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Kennbuchstabe Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Bezeichnung_Kennbuchstabe_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Kennbuchstabe_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.Bezeichnung_Kennbuchstabe_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Bezeichnung_Kennbuchstabe_TypeClass#getWert()
	 * @see #getBezeichnung_Kennbuchstabe_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Kennbuchstabe_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage <em>FMA Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Anlage</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage
	 * @generated
	 */
	EClass getFMA_Anlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getBezeichnung()
	 * @see #getFMA_Anlage()
	 * @generated
	 */
	EReference getFMA_Anlage_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageAllg <em>FMA Anlage Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Anlage Allg</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageAllg()
	 * @see #getFMA_Anlage()
	 * @generated
	 */
	EReference getFMA_Anlage_FMAAnlageAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageElektrMerkmale <em>FMA Anlage Elektr Merkmale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Anlage Elektr Merkmale</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageElektrMerkmale()
	 * @see #getFMA_Anlage()
	 * @generated
	 */
	EReference getFMA_Anlage_FMAAnlageElektrMerkmale();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageKaskade <em>FMA Anlage Kaskade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Anlage Kaskade</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageKaskade()
	 * @see #getFMA_Anlage()
	 * @generated
	 */
	EReference getFMA_Anlage_FMAAnlageKaskade();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageUebertragungFMinfo <em>FMA Anlage Uebertragung FMinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Anlage Uebertragung FMinfo</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageUebertragungFMinfo()
	 * @see #getFMA_Anlage()
	 * @generated
	 */
	EReference getFMA_Anlage_FMAAnlageUebertragungFMinfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Gleis Abschnitt</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getIDGleisAbschnitt()
	 * @see #getFMA_Anlage()
	 * @generated
	 */
	EReference getFMA_Anlage_IDGleisAbschnitt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getIDGleisfreimeldeInnenanlage <em>ID Gleisfreimelde Innenanlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Gleisfreimelde Innenanlage</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getIDGleisfreimeldeInnenanlage()
	 * @see #getFMA_Anlage()
	 * @generated
	 */
	EReference getFMA_Anlage_IDGleisfreimeldeInnenanlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Allg_AttributeGroup <em>FMA Anlage Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Anlage Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Allg_AttributeGroup
	 * @generated
	 */
	EClass getFMA_Anlage_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMAArt <em>FMA Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Art</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMAArt()
	 * @see #getFMA_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Allg_AttributeGroup_FMAArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMAHilffreimeldung <em>FMA Hilffreimeldung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Hilffreimeldung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMAHilffreimeldung()
	 * @see #getFMA_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Allg_AttributeGroup_FMAHilffreimeldung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMAIsolierung <em>FMA Isolierung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Isolierung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMAIsolierung()
	 * @see #getFMA_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Allg_AttributeGroup_FMAIsolierung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMATyp <em>FMA Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Typ</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMATyp()
	 * @see #getFMA_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Allg_AttributeGroup_FMATyp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Bezeichnung_AttributeGroup <em>FMA Anlage Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Anlage Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getFMA_Anlage_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Bezeichnung_AttributeGroup#getBezeichnungKennbuchstabe <em>Bezeichnung Kennbuchstabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Kennbuchstabe</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Bezeichnung_AttributeGroup#getBezeichnungKennbuchstabe()
	 * @see #getFMA_Anlage_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Bezeichnung_AttributeGroup_BezeichnungKennbuchstabe();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup <em>FMA Anlage Elektr Merkmale Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Anlage Elektr Merkmale Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup
	 * @generated
	 */
	EClass getFMA_Anlage_Elektr_Merkmale_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getBettungswiderstand <em>Bettungswiderstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bettungswiderstand</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getBettungswiderstand()
	 * @see #getFMA_Anlage_Elektr_Merkmale_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_Bettungswiderstand();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaenge <em>FMA Laenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Laenge</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaenge()
	 * @see #getFMA_Anlage_Elektr_Merkmale_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaenge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeBeeinflusst <em>FMA Laenge Beeinflusst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Laenge Beeinflusst</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeBeeinflusst()
	 * @see #getFMA_Anlage_Elektr_Merkmale_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeBeeinflusst();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeE1 <em>FMA Laenge E1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Laenge E1</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeE1()
	 * @see #getFMA_Anlage_Elektr_Merkmale_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE1();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeE2 <em>FMA Laenge E2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Laenge E2</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeE2()
	 * @see #getFMA_Anlage_Elektr_Merkmale_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE2();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeE3 <em>FMA Laenge E3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Laenge E3</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeE3()
	 * @see #getFMA_Anlage_Elektr_Merkmale_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE3();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeS <em>FMA Laenge S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Laenge S</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeS()
	 * @see #getFMA_Anlage_Elektr_Merkmale_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Kaskade_AttributeGroup <em>FMA Anlage Kaskade Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Anlage Kaskade Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Kaskade_AttributeGroup
	 * @generated
	 */
	EClass getFMA_Anlage_Kaskade_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Kaskade_AttributeGroup#getFMAKaskadeBezeichnung <em>FMA Kaskade Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Kaskade Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Kaskade_AttributeGroup#getFMAKaskadeBezeichnung()
	 * @see #getFMA_Anlage_Kaskade_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeBezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Kaskade_AttributeGroup#getFMAKaskadeEinzelauswertung <em>FMA Kaskade Einzelauswertung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Kaskade Einzelauswertung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Kaskade_AttributeGroup#getFMAKaskadeEinzelauswertung()
	 * @see #getFMA_Anlage_Kaskade_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeEinzelauswertung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup <em>FMA Anlage Uebertragung FMinfo Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Anlage Uebertragung FMinfo Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup
	 * @generated
	 */
	EClass getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup#getIDUebertragungFMinfo <em>ID Uebertragung FMinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Uebertragung FMinfo</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup#getIDUebertragungFMinfo()
	 * @see #getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_IDUebertragungFMinfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup#getUebertragungFMinfoRichtung <em>Uebertragung FMinfo Richtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uebertragung FMinfo Richtung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup#getUebertragungFMinfoRichtung()
	 * @see #getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoRichtung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup#getUebertragungFMinfoTyp <em>Uebertragung FMinfo Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uebertragung FMinfo Typ</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup#getUebertragungFMinfoTyp()
	 * @see #getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoTyp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anschluss_Bezeichnung_TypeClass <em>FMA Anschluss Bezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Anschluss Bezeichnung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anschluss_Bezeichnung_TypeClass
	 * @generated
	 */
	EClass getFMA_Anschluss_Bezeichnung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anschluss_Bezeichnung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anschluss_Bezeichnung_TypeClass#getWert()
	 * @see #getFMA_Anschluss_Bezeichnung_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Anschluss_Bezeichnung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anschluss_Speiserichtung_TypeClass <em>FMA Anschluss Speiserichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Anschluss Speiserichtung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anschluss_Speiserichtung_TypeClass
	 * @generated
	 */
	EClass getFMA_Anschluss_Speiserichtung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anschluss_Speiserichtung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Anschluss_Speiserichtung_TypeClass#getWert()
	 * @see #getFMA_Anschluss_Speiserichtung_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Anschluss_Speiserichtung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Art_TypeClass <em>FMA Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Art Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Art_TypeClass
	 * @generated
	 */
	EClass getFMA_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Art_TypeClass#getWert()
	 * @see #getFMA_Art_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element <em>FMA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Element</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element
	 * @generated
	 */
	EClass getFMA_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element#getFMAElementAllg <em>FMA Element Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Element Allg</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element#getFMAElementAllg()
	 * @see #getFMA_Element()
	 * @generated
	 */
	EReference getFMA_Element_FMAElementAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element#getFMAElementAnschluss <em>FMA Element Anschluss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Element Anschluss</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element#getFMAElementAnschluss()
	 * @see #getFMA_Element()
	 * @generated
	 */
	EReference getFMA_Element_FMAElementAnschluss();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element#getIDFMAAnlage <em>IDFMA Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDFMA Anlage</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element#getIDFMAAnlage()
	 * @see #getFMA_Element()
	 * @generated
	 */
	EReference getFMA_Element_IDFMAAnlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup <em>FMA Element Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Element Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup
	 * @generated
	 */
	EClass getFMA_Element_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup#getFMAElementArt <em>FMA Element Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Element Art</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup#getFMAElementArt()
	 * @see #getFMA_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Element_Allg_AttributeGroup_FMAElementArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup#getFMAElementSeilanzahl <em>FMA Element Seilanzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Element Seilanzahl</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup#getFMAElementSeilanzahl()
	 * @see #getFMA_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Element_Allg_AttributeGroup_FMAElementSeilanzahl();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup#getFMAElementSeiltyp <em>FMA Element Seiltyp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Element Seiltyp</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup#getFMAElementSeiltyp()
	 * @see #getFMA_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Element_Allg_AttributeGroup_FMAElementSeiltyp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Anschluss_AttributeGroup <em>FMA Element Anschluss Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Element Anschluss Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element_Anschluss_AttributeGroup
	 * @generated
	 */
	EClass getFMA_Element_Anschluss_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Anschluss_AttributeGroup#getFMAAnschlussBezeichnung <em>FMA Anschluss Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Anschluss Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element_Anschluss_AttributeGroup#getFMAAnschlussBezeichnung()
	 * @see #getFMA_Element_Anschluss_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussBezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Anschluss_AttributeGroup#getFMAAnschlussSpeiserichtung <em>FMA Anschluss Speiserichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Anschluss Speiserichtung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element_Anschluss_AttributeGroup#getFMAAnschlussSpeiserichtung()
	 * @see #getFMA_Element_Anschluss_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussSpeiserichtung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Art_TypeClass <em>FMA Element Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Element Art Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element_Art_TypeClass
	 * @generated
	 */
	EClass getFMA_Element_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element_Art_TypeClass#getWert()
	 * @see #getFMA_Element_Art_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Element_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Seilanzahl_TypeClass <em>FMA Element Seilanzahl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Element Seilanzahl Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element_Seilanzahl_TypeClass
	 * @generated
	 */
	EClass getFMA_Element_Seilanzahl_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Seilanzahl_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element_Seilanzahl_TypeClass#getWert()
	 * @see #getFMA_Element_Seilanzahl_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Element_Seilanzahl_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Seiltyp_TypeClass <em>FMA Element Seiltyp Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Element Seiltyp Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element_Seiltyp_TypeClass
	 * @generated
	 */
	EClass getFMA_Element_Seiltyp_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Seiltyp_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Element_Seiltyp_TypeClass#getWert()
	 * @see #getFMA_Element_Seiltyp_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Element_Seiltyp_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Hilffreimeldung_TypeClass <em>FMA Hilffreimeldung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Hilffreimeldung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Hilffreimeldung_TypeClass
	 * @generated
	 */
	EClass getFMA_Hilffreimeldung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Hilffreimeldung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Hilffreimeldung_TypeClass#getWert()
	 * @see #getFMA_Hilffreimeldung_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Hilffreimeldung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Isolierung_TypeClass <em>FMA Isolierung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Isolierung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Isolierung_TypeClass
	 * @generated
	 */
	EClass getFMA_Isolierung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Isolierung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Isolierung_TypeClass#getWert()
	 * @see #getFMA_Isolierung_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Isolierung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Kaskade_Bezeichnung_TypeClass <em>FMA Kaskade Bezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Kaskade Bezeichnung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Kaskade_Bezeichnung_TypeClass
	 * @generated
	 */
	EClass getFMA_Kaskade_Bezeichnung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Kaskade_Bezeichnung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Kaskade_Bezeichnung_TypeClass#getWert()
	 * @see #getFMA_Kaskade_Bezeichnung_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Kaskade_Bezeichnung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Kaskade_Einzelauswertung_TypeClass <em>FMA Kaskade Einzelauswertung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Kaskade Einzelauswertung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Kaskade_Einzelauswertung_TypeClass
	 * @generated
	 */
	EClass getFMA_Kaskade_Einzelauswertung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Kaskade_Einzelauswertung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Kaskade_Einzelauswertung_TypeClass#getWert()
	 * @see #getFMA_Kaskade_Einzelauswertung_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Kaskade_Einzelauswertung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente <em>FMA Komponente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Komponente</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente
	 * @generated
	 */
	EClass getFMA_Komponente();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getBezeichnung()
	 * @see #getFMA_Komponente()
	 * @generated
	 */
	EReference getFMA_Komponente_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getIDBezugspunkt <em>ID Bezugspunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bezugspunkt</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getIDBezugspunkt()
	 * @see #getFMA_Komponente()
	 * @generated
	 */
	EReference getFMA_Komponente_IDBezugspunkt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getIDFMAgrenze <em>IDFM Agrenze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IDFM Agrenze</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getIDFMAgrenze()
	 * @see #getFMA_Komponente()
	 * @generated
	 */
	EReference getFMA_Komponente_IDFMAgrenze();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getFMAKomponenteAchszaehlpunkt <em>FMA Komponente Achszaehlpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Komponente Achszaehlpunkt</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getFMAKomponenteAchszaehlpunkt()
	 * @see #getFMA_Komponente()
	 * @generated
	 */
	EReference getFMA_Komponente_FMAKomponenteAchszaehlpunkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getFMAKomponenteArt <em>FMA Komponente Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Komponente Art</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getFMAKomponenteArt()
	 * @see #getFMA_Komponente()
	 * @generated
	 */
	EReference getFMA_Komponente_FMAKomponenteArt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup <em>FMA Komponente Achszaehlpunkt Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Komponente Achszaehlpunkt Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup
	 * @generated
	 */
	EClass getFMA_Komponente_Achszaehlpunkt_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getFMAKomponenteSchienenprofil <em>FMA Komponente Schienenprofil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Komponente Schienenprofil</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getFMAKomponenteSchienenprofil()
	 * @see #getFMA_Komponente_Achszaehlpunkt_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteSchienenprofil();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getFMAKomponenteStromversorgung <em>FMA Komponente Stromversorgung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Komponente Stromversorgung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getFMAKomponenteStromversorgung()
	 * @see #getFMA_Komponente_Achszaehlpunkt_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteStromversorgung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getFMAKomponenteTyp <em>FMA Komponente Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FMA Komponente Typ</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getFMAKomponenteTyp()
	 * @see #getFMA_Komponente_Achszaehlpunkt_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteTyp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getIDEnergie <em>ID Energie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Energie</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getIDEnergie()
	 * @see #getFMA_Komponente_Achszaehlpunkt_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDEnergie();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getIDInformation <em>ID Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Information</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getIDInformation()
	 * @see #getFMA_Komponente_Achszaehlpunkt_AttributeGroup()
	 * @generated
	 */
	EReference getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDInformation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Art_TypeClass <em>FMA Komponente Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Komponente Art Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Art_TypeClass
	 * @generated
	 */
	EClass getFMA_Komponente_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Art_TypeClass#getWert()
	 * @see #getFMA_Komponente_Art_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Komponente_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Schienenprofil_TypeClass <em>FMA Komponente Schienenprofil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Komponente Schienenprofil Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Schienenprofil_TypeClass
	 * @generated
	 */
	EClass getFMA_Komponente_Schienenprofil_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Schienenprofil_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Schienenprofil_TypeClass#getWert()
	 * @see #getFMA_Komponente_Schienenprofil_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Komponente_Schienenprofil_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Stromversorgung_TypeClass <em>FMA Komponente Stromversorgung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Komponente Stromversorgung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Stromversorgung_TypeClass
	 * @generated
	 */
	EClass getFMA_Komponente_Stromversorgung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Stromversorgung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Stromversorgung_TypeClass#getWert()
	 * @see #getFMA_Komponente_Stromversorgung_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Komponente_Stromversorgung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Typ_TypeClass <em>FMA Komponente Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Komponente Typ Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Typ_TypeClass
	 * @generated
	 */
	EClass getFMA_Komponente_Typ_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Typ_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Typ_TypeClass#getWert()
	 * @see #getFMA_Komponente_Typ_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Komponente_Typ_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Laenge_Beeinflusst_TypeClass <em>FMA Laenge Beeinflusst Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Laenge Beeinflusst Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Laenge_Beeinflusst_TypeClass
	 * @generated
	 */
	EClass getFMA_Laenge_Beeinflusst_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Laenge_Beeinflusst_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Laenge_Beeinflusst_TypeClass#getWert()
	 * @see #getFMA_Laenge_Beeinflusst_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Laenge_Beeinflusst_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E1_TypeClass <em>FMA Laenge E1 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Laenge E1 Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E1_TypeClass
	 * @generated
	 */
	EClass getFMA_Laenge_E1_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E1_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E1_TypeClass#getWert()
	 * @see #getFMA_Laenge_E1_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Laenge_E1_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E2_TypeClass <em>FMA Laenge E2 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Laenge E2 Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E2_TypeClass
	 * @generated
	 */
	EClass getFMA_Laenge_E2_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E2_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E2_TypeClass#getWert()
	 * @see #getFMA_Laenge_E2_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Laenge_E2_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E3_TypeClass <em>FMA Laenge E3 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Laenge E3 Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E3_TypeClass
	 * @generated
	 */
	EClass getFMA_Laenge_E3_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E3_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E3_TypeClass#getWert()
	 * @see #getFMA_Laenge_E3_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Laenge_E3_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Laenge_S_TypeClass <em>FMA Laenge SType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Laenge SType Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Laenge_S_TypeClass
	 * @generated
	 */
	EClass getFMA_Laenge_S_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Laenge_S_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Laenge_S_TypeClass#getWert()
	 * @see #getFMA_Laenge_S_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Laenge_S_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Laenge_TypeClass <em>FMA Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Laenge Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Laenge_TypeClass
	 * @generated
	 */
	EClass getFMA_Laenge_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Laenge_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Laenge_TypeClass#getWert()
	 * @see #getFMA_Laenge_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Laenge_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.FMA_Typ_TypeClass <em>FMA Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMA Typ Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Typ_TypeClass
	 * @generated
	 */
	EClass getFMA_Typ_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.FMA_Typ_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.FMA_Typ_TypeClass#getWert()
	 * @see #getFMA_Typ_TypeClass()
	 * @generated
	 */
	EAttribute getFMA_Typ_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.Schaltmittel_Funktion_TypeClass <em>Schaltmittel Funktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schaltmittel Funktion Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Schaltmittel_Funktion_TypeClass
	 * @generated
	 */
	EClass getSchaltmittel_Funktion_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.Schaltmittel_Funktion_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Schaltmittel_Funktion_TypeClass#getWert()
	 * @see #getSchaltmittel_Funktion_TypeClass()
	 * @generated
	 */
	EAttribute getSchaltmittel_Funktion_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.Schaltmittel_Zuordnung <em>Schaltmittel Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schaltmittel Zuordnung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Schaltmittel_Zuordnung
	 * @generated
	 */
	EClass getSchaltmittel_Zuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.Schaltmittel_Zuordnung#getIDAnforderung <em>ID Anforderung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anforderung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Schaltmittel_Zuordnung#getIDAnforderung()
	 * @see #getSchaltmittel_Zuordnung()
	 * @generated
	 */
	EReference getSchaltmittel_Zuordnung_IDAnforderung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.Schaltmittel_Zuordnung#getIDSchalter <em>ID Schalter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Schalter</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Schaltmittel_Zuordnung#getIDSchalter()
	 * @see #getSchaltmittel_Zuordnung()
	 * @generated
	 */
	EReference getSchaltmittel_Zuordnung_IDSchalter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.Schaltmittel_Zuordnung#getSchaltmittelFunktion <em>Schaltmittel Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schaltmittel Funktion</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Schaltmittel_Zuordnung#getSchaltmittelFunktion()
	 * @see #getSchaltmittel_Zuordnung()
	 * @generated
	 */
	EReference getSchaltmittel_Zuordnung_SchaltmittelFunktion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.Uebertragung_FMinfo_Richtung_TypeClass <em>Uebertragung FMinfo Richtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uebertragung FMinfo Richtung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Uebertragung_FMinfo_Richtung_TypeClass
	 * @generated
	 */
	EClass getUebertragung_FMinfo_Richtung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.Uebertragung_FMinfo_Richtung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Uebertragung_FMinfo_Richtung_TypeClass#getWert()
	 * @see #getUebertragung_FMinfo_Richtung_TypeClass()
	 * @generated
	 */
	EAttribute getUebertragung_FMinfo_Richtung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.Uebertragung_FMinfo_Typ_TypeClass <em>Uebertragung FMinfo Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uebertragung FMinfo Typ Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Uebertragung_FMinfo_Typ_TypeClass
	 * @generated
	 */
	EClass getUebertragung_FMinfo_Typ_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.Uebertragung_FMinfo_Typ_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Uebertragung_FMinfo_Typ_TypeClass#getWert()
	 * @see #getUebertragung_FMinfo_Typ_TypeClass()
	 * @generated
	 */
	EAttribute getUebertragung_FMinfo_Typ_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung <em>Zugeinwirkung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zugeinwirkung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Zugeinwirkung
	 * @generated
	 */
	EClass getZugeinwirkung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Zugeinwirkung#getBezeichnung()
	 * @see #getZugeinwirkung()
	 * @generated
	 */
	EReference getZugeinwirkung_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung#getIDBezugspunkt <em>ID Bezugspunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bezugspunkt</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Zugeinwirkung#getIDBezugspunkt()
	 * @see #getZugeinwirkung()
	 * @generated
	 */
	EReference getZugeinwirkung_IDBezugspunkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung#getZugeinwirkungAllg <em>Zugeinwirkung Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zugeinwirkung Allg</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Zugeinwirkung#getZugeinwirkungAllg()
	 * @see #getZugeinwirkung()
	 * @generated
	 */
	EReference getZugeinwirkung_ZugeinwirkungAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Allg_AttributeGroup <em>Zugeinwirkung Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zugeinwirkung Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Allg_AttributeGroup
	 * @generated
	 */
	EClass getZugeinwirkung_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Allg_AttributeGroup#getZugeinwirkungArt <em>Zugeinwirkung Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zugeinwirkung Art</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Allg_AttributeGroup#getZugeinwirkungArt()
	 * @see #getZugeinwirkung_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Allg_AttributeGroup#getZugeinwirkungTyp <em>Zugeinwirkung Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zugeinwirkung Typ</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Allg_AttributeGroup#getZugeinwirkungTyp()
	 * @see #getZugeinwirkung_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungTyp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Art_TypeClass <em>Zugeinwirkung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zugeinwirkung Art Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Art_TypeClass
	 * @generated
	 */
	EClass getZugeinwirkung_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Art_TypeClass#getWert()
	 * @see #getZugeinwirkung_Art_TypeClass()
	 * @generated
	 */
	EAttribute getZugeinwirkung_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Typ_TypeClass <em>Zugeinwirkung Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zugeinwirkung Typ Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Typ_TypeClass
	 * @generated
	 */
	EClass getZugeinwirkung_Typ_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Typ_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Typ_TypeClass#getWert()
	 * @see #getZugeinwirkung_Typ_TypeClass()
	 * @generated
	 */
	EAttribute getZugeinwirkung_Typ_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Ortung.ENUMBezeichnungKennbuchstabe <em>ENUM Bezeichnung Kennbuchstabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Bezeichnung Kennbuchstabe</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMBezeichnungKennbuchstabe
	 * @generated
	 */
	EEnum getENUMBezeichnungKennbuchstabe();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAAnschlussSpeiserichtung <em>ENUMFMA Anschluss Speiserichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMFMA Anschluss Speiserichtung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAAnschlussSpeiserichtung
	 * @generated
	 */
	EEnum getENUMFMAAnschlussSpeiserichtung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAArt <em>ENUMFMA Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMFMA Art</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAArt
	 * @generated
	 */
	EEnum getENUMFMAArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAElementArt <em>ENUMFMA Element Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMFMA Element Art</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAElementArt
	 * @generated
	 */
	EEnum getENUMFMAElementArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAElementSeilanzahl <em>ENUMFMA Element Seilanzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMFMA Element Seilanzahl</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAElementSeilanzahl
	 * @generated
	 */
	EEnum getENUMFMAElementSeilanzahl();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAKomponenteArt <em>ENUMFMA Komponente Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMFMA Komponente Art</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAKomponenteArt
	 * @generated
	 */
	EEnum getENUMFMAKomponenteArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Ortung.ENUMIsolierung <em>ENUM Isolierung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Isolierung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMIsolierung
	 * @generated
	 */
	EEnum getENUMIsolierung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Ortung.ENUMSchaltmittelFunktion <em>ENUM Schaltmittel Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Schaltmittel Funktion</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMSchaltmittelFunktion
	 * @generated
	 */
	EEnum getENUMSchaltmittelFunktion();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Ortung.ENUMSchienenprofil <em>ENUM Schienenprofil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Schienenprofil</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMSchienenprofil
	 * @generated
	 */
	EEnum getENUMSchienenprofil();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Ortung.ENUMUebertragungFMinfoRichtung <em>ENUM Uebertragung FMinfo Richtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Uebertragung FMinfo Richtung</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMUebertragungFMinfoRichtung
	 * @generated
	 */
	EEnum getENUMUebertragungFMinfoRichtung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Ortung.ENUMZugeinwirkungArt <em>ENUM Zugeinwirkung Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Zugeinwirkung Art</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMZugeinwirkungArt
	 * @generated
	 */
	EEnum getENUMZugeinwirkungArt();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Bettungswiderstand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bettungswiderstand Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TBettungswiderstand' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='([0-4]\\.[0-9]{2})|(5\\.00)'"
	 * @generated
	 */
	EDataType getBettungswiderstand_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Ortung.ENUMBezeichnungKennbuchstabe <em>ENUM Bezeichnung Kennbuchstabe Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Bezeichnung Kennbuchstabe Object</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMBezeichnungKennbuchstabe
	 * @model instanceClass="org.eclipse.set.model.model11001.Ortung.ENUMBezeichnungKennbuchstabe"
	 *        extendedMetaData="name='ENUMBezeichnung_Kennbuchstabe:Object' baseType='ENUMBezeichnung_Kennbuchstabe'"
	 * @generated
	 */
	EDataType getENUMBezeichnungKennbuchstabeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAAnschlussSpeiserichtung <em>ENUMFMA Anschluss Speiserichtung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMFMA Anschluss Speiserichtung Object</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAAnschlussSpeiserichtung
	 * @model instanceClass="org.eclipse.set.model.model11001.Ortung.ENUMFMAAnschlussSpeiserichtung"
	 *        extendedMetaData="name='ENUMFMA_Anschluss_Speiserichtung:Object' baseType='ENUMFMA_Anschluss_Speiserichtung'"
	 * @generated
	 */
	EDataType getENUMFMAAnschlussSpeiserichtungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAArt <em>ENUMFMA Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMFMA Art Object</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAArt
	 * @model instanceClass="org.eclipse.set.model.model11001.Ortung.ENUMFMAArt"
	 *        extendedMetaData="name='ENUMFMA_Art:Object' baseType='ENUMFMA_Art'"
	 * @generated
	 */
	EDataType getENUMFMAArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAElementArt <em>ENUMFMA Element Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMFMA Element Art Object</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAElementArt
	 * @model instanceClass="org.eclipse.set.model.model11001.Ortung.ENUMFMAElementArt"
	 *        extendedMetaData="name='ENUMFMA_Element_Art:Object' baseType='ENUMFMA_Element_Art'"
	 * @generated
	 */
	EDataType getENUMFMAElementArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAElementSeilanzahl <em>ENUMFMA Element Seilanzahl Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMFMA Element Seilanzahl Object</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAElementSeilanzahl
	 * @model instanceClass="org.eclipse.set.model.model11001.Ortung.ENUMFMAElementSeilanzahl"
	 *        extendedMetaData="name='ENUMFMA_Element_Seilanzahl:Object' baseType='ENUMFMA_Element_Seilanzahl'"
	 * @generated
	 */
	EDataType getENUMFMAElementSeilanzahlObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAKomponenteArt <em>ENUMFMA Komponente Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMFMA Komponente Art Object</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAKomponenteArt
	 * @model instanceClass="org.eclipse.set.model.model11001.Ortung.ENUMFMAKomponenteArt"
	 *        extendedMetaData="name='ENUMFMA_Komponente_Art:Object' baseType='ENUMFMA_Komponente_Art'"
	 * @generated
	 */
	EDataType getENUMFMAKomponenteArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Ortung.ENUMIsolierung <em>ENUM Isolierung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Isolierung Object</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMIsolierung
	 * @model instanceClass="org.eclipse.set.model.model11001.Ortung.ENUMIsolierung"
	 *        extendedMetaData="name='ENUMIsolierung:Object' baseType='ENUMIsolierung'"
	 * @generated
	 */
	EDataType getENUMIsolierungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Ortung.ENUMSchaltmittelFunktion <em>ENUM Schaltmittel Funktion Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Schaltmittel Funktion Object</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMSchaltmittelFunktion
	 * @model instanceClass="org.eclipse.set.model.model11001.Ortung.ENUMSchaltmittelFunktion"
	 *        extendedMetaData="name='ENUMSchaltmittel_Funktion:Object' baseType='ENUMSchaltmittel_Funktion'"
	 * @generated
	 */
	EDataType getENUMSchaltmittelFunktionObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Ortung.ENUMSchienenprofil <em>ENUM Schienenprofil Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Schienenprofil Object</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMSchienenprofil
	 * @model instanceClass="org.eclipse.set.model.model11001.Ortung.ENUMSchienenprofil"
	 *        extendedMetaData="name='ENUMSchienenprofil:Object' baseType='ENUMSchienenprofil'"
	 * @generated
	 */
	EDataType getENUMSchienenprofilObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Ortung.ENUMUebertragungFMinfoRichtung <em>ENUM Uebertragung FMinfo Richtung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Uebertragung FMinfo Richtung Object</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMUebertragungFMinfoRichtung
	 * @model instanceClass="org.eclipse.set.model.model11001.Ortung.ENUMUebertragungFMinfoRichtung"
	 *        extendedMetaData="name='ENUMUebertragung_FMinfo_Richtung:Object' baseType='ENUMUebertragung_FMinfo_Richtung'"
	 * @generated
	 */
	EDataType getENUMUebertragungFMinfoRichtungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Ortung.ENUMZugeinwirkungArt <em>ENUM Zugeinwirkung Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Zugeinwirkung Art Object</em>'.
	 * @see org.eclipse.set.model.model11001.Ortung.ENUMZugeinwirkungArt
	 * @model instanceClass="org.eclipse.set.model.model11001.Ortung.ENUMZugeinwirkungArt"
	 *        extendedMetaData="name='ENUMZugeinwirkung_Art:Object' baseType='ENUMZugeinwirkung_Art'"
	 * @generated
	 */
	EDataType getENUMZugeinwirkungArtObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>FMA Anschluss Bezeichnung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FMA Anschluss Bezeichnung Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TFMA_Anschluss_Bezeichnung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{2,8}'"
	 * @generated
	 */
	EDataType getFMA_Anschluss_Bezeichnung_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>FMA Element Seiltyp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FMA Element Seiltyp Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TFMA_Element_Seiltyp' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{2,6}'"
	 * @generated
	 */
	EDataType getFMA_Element_Seiltyp_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>FMA Kaskade Bezeichnung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FMA Kaskade Bezeichnung Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TFMA_Kaskade_Bezeichnung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='[a-z]|[A-Z]|(I)|(II)|(III)|(IV)|(V)|(VI)|(VII)|(VIII)|(IX)|(X)|(XI)|(XII)|(\\.[1-9])'"
	 * @generated
	 */
	EDataType getFMA_Kaskade_Bezeichnung_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>FMA Komponente Typ Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FMA Komponente Typ Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TFMA_Komponente_Typ' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{1,16}'"
	 * @generated
	 */
	EDataType getFMA_Komponente_Typ_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>FMA Laenge Beeinflusst Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FMA Laenge Beeinflusst Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TFMA_Laenge_Beeinflusst' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter' pattern='[1-9][0-9]{0,2}|1[0-4][0-9]{2}|1500'"
	 * @generated
	 */
	EDataType getFMA_Laenge_Beeinflusst_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>FMA Laenge E1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FMA Laenge E1 Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TFMA_Laenge_E1' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter' pattern='[1-9][0-9]{0,2}|1[0-4][0-9]{2}'"
	 * @generated
	 */
	EDataType getFMA_Laenge_E1_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>FMA Laenge E2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FMA Laenge E2 Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TFMA_Laenge_E2' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter' pattern='[1-9][0-9]{0,2}|1[0-4][0-9]{2}'"
	 * @generated
	 */
	EDataType getFMA_Laenge_E2_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>FMA Laenge E3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FMA Laenge E3 Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TFMA_Laenge_E3' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter' pattern='[1-9][0-9]{0,2}|1[0-4][0-9]{2}'"
	 * @generated
	 */
	EDataType getFMA_Laenge_E3_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>FMA Laenge SType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FMA Laenge SType</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TFMA_Laenge_S' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter' pattern='[1-9][0-9]{0,2}|1[0-4][0-9]{2}'"
	 * @generated
	 */
	EDataType getFMA_Laenge_S_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>FMA Laenge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FMA Laenge Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TFMA_Laenge' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter' pattern='[1-9][0-9]{0,2}|1[0-4][0-9]{2}|1500'"
	 * @generated
	 */
	EDataType getFMA_Laenge_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>FMA Typ Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FMA Typ Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TFMA_Typ' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{1,16}'"
	 * @generated
	 */
	EDataType getFMA_Typ_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Uebertragung FMinfo Typ Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uebertragung FMinfo Typ Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TUebertragung_FMinfo_Typ' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{1,16}'"
	 * @generated
	 */
	EDataType getUebertragung_FMinfo_Typ_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Zugeinwirkung Typ Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Zugeinwirkung Typ Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TZugeinwirkung_Typ' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{1,16}'"
	 * @generated
	 */
	EDataType getZugeinwirkung_Typ_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrtungFactory getOrtungFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Bettungswiderstand_TypeClassImpl <em>Bettungswiderstand Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.Bettungswiderstand_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getBettungswiderstand_TypeClass()
		 * @generated
		 */
		EClass BETTUNGSWIDERSTAND_TYPE_CLASS = eINSTANCE.getBettungswiderstand_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BETTUNGSWIDERSTAND_TYPE_CLASS__WERT = eINSTANCE.getBettungswiderstand_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Bezeichnung_Kennbuchstabe_TypeClassImpl <em>Bezeichnung Kennbuchstabe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.Bezeichnung_Kennbuchstabe_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getBezeichnung_Kennbuchstabe_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_KENNBUCHSTABE_TYPE_CLASS = eINSTANCE.getBezeichnung_Kennbuchstabe_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_KENNBUCHSTABE_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Kennbuchstabe_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_AnlageImpl <em>FMA Anlage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_AnlageImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anlage()
		 * @generated
		 */
		EClass FMA_ANLAGE = eINSTANCE.getFMA_Anlage();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE__BEZEICHNUNG = eINSTANCE.getFMA_Anlage_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>FMA Anlage Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE__FMA_ANLAGE_ALLG = eINSTANCE.getFMA_Anlage_FMAAnlageAllg();

		/**
		 * The meta object literal for the '<em><b>FMA Anlage Elektr Merkmale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE = eINSTANCE.getFMA_Anlage_FMAAnlageElektrMerkmale();

		/**
		 * The meta object literal for the '<em><b>FMA Anlage Kaskade</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE__FMA_ANLAGE_KASKADE = eINSTANCE.getFMA_Anlage_FMAAnlageKaskade();

		/**
		 * The meta object literal for the '<em><b>FMA Anlage Uebertragung FMinfo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO = eINSTANCE.getFMA_Anlage_FMAAnlageUebertragungFMinfo();

		/**
		 * The meta object literal for the '<em><b>ID Gleis Abschnitt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE__ID_GLEIS_ABSCHNITT = eINSTANCE.getFMA_Anlage_IDGleisAbschnitt();

		/**
		 * The meta object literal for the '<em><b>ID Gleisfreimelde Innenanlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE = eINSTANCE.getFMA_Anlage_IDGleisfreimeldeInnenanlage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Allg_AttributeGroupImpl <em>FMA Anlage Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anlage_Allg_AttributeGroup()
		 * @generated
		 */
		EClass FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getFMA_Anlage_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>FMA Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ART = eINSTANCE.getFMA_Anlage_Allg_AttributeGroup_FMAArt();

		/**
		 * The meta object literal for the '<em><b>FMA Hilffreimeldung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_HILFFREIMELDUNG = eINSTANCE.getFMA_Anlage_Allg_AttributeGroup_FMAHilffreimeldung();

		/**
		 * The meta object literal for the '<em><b>FMA Isolierung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ISOLIERUNG = eINSTANCE.getFMA_Anlage_Allg_AttributeGroup_FMAIsolierung();

		/**
		 * The meta object literal for the '<em><b>FMA Typ</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_TYP = eINSTANCE.getFMA_Anlage_Allg_AttributeGroup_FMATyp();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Bezeichnung_AttributeGroupImpl <em>FMA Anlage Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anlage_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getFMA_Anlage_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Kennbuchstabe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KENNBUCHSTABE = eINSTANCE.getFMA_Anlage_Bezeichnung_AttributeGroup_BezeichnungKennbuchstabe();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl <em>FMA Anlage Elektr Merkmale Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anlage_Elektr_Merkmale_AttributeGroup()
		 * @generated
		 */
		EClass FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP = eINSTANCE.getFMA_Anlage_Elektr_Merkmale_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bettungswiderstand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND = eINSTANCE.getFMA_Anlage_Elektr_Merkmale_AttributeGroup_Bettungswiderstand();

		/**
		 * The meta object literal for the '<em><b>FMA Laenge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE = eINSTANCE.getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaenge();

		/**
		 * The meta object literal for the '<em><b>FMA Laenge Beeinflusst</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST = eINSTANCE.getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeBeeinflusst();

		/**
		 * The meta object literal for the '<em><b>FMA Laenge E1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1 = eINSTANCE.getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE1();

		/**
		 * The meta object literal for the '<em><b>FMA Laenge E2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2 = eINSTANCE.getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE2();

		/**
		 * The meta object literal for the '<em><b>FMA Laenge E3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3 = eINSTANCE.getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE3();

		/**
		 * The meta object literal for the '<em><b>FMA Laenge S</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S = eINSTANCE.getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeS();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Kaskade_AttributeGroupImpl <em>FMA Anlage Kaskade Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Kaskade_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anlage_Kaskade_AttributeGroup()
		 * @generated
		 */
		EClass FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP = eINSTANCE.getFMA_Anlage_Kaskade_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>FMA Kaskade Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_BEZEICHNUNG = eINSTANCE.getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeBezeichnung();

		/**
		 * The meta object literal for the '<em><b>FMA Kaskade Einzelauswertung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_EINZELAUSWERTUNG = eINSTANCE.getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeEinzelauswertung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Uebertragung_FMinfo_AttributeGroupImpl <em>FMA Anlage Uebertragung FMinfo Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anlage_Uebertragung_FMinfo_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup()
		 * @generated
		 */
		EClass FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP = eINSTANCE.getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>ID Uebertragung FMinfo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__ID_UEBERTRAGUNG_FMINFO = eINSTANCE.getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_IDUebertragungFMinfo();

		/**
		 * The meta object literal for the '<em><b>Uebertragung FMinfo Richtung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_RICHTUNG = eINSTANCE.getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoRichtung();

		/**
		 * The meta object literal for the '<em><b>Uebertragung FMinfo Typ</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_TYP = eINSTANCE.getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoTyp();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anschluss_Bezeichnung_TypeClassImpl <em>FMA Anschluss Bezeichnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anschluss_Bezeichnung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anschluss_Bezeichnung_TypeClass()
		 * @generated
		 */
		EClass FMA_ANSCHLUSS_BEZEICHNUNG_TYPE_CLASS = eINSTANCE.getFMA_Anschluss_Bezeichnung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_ANSCHLUSS_BEZEICHNUNG_TYPE_CLASS__WERT = eINSTANCE.getFMA_Anschluss_Bezeichnung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Anschluss_Speiserichtung_TypeClassImpl <em>FMA Anschluss Speiserichtung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Anschluss_Speiserichtung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anschluss_Speiserichtung_TypeClass()
		 * @generated
		 */
		EClass FMA_ANSCHLUSS_SPEISERICHTUNG_TYPE_CLASS = eINSTANCE.getFMA_Anschluss_Speiserichtung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_ANSCHLUSS_SPEISERICHTUNG_TYPE_CLASS__WERT = eINSTANCE.getFMA_Anschluss_Speiserichtung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Art_TypeClassImpl <em>FMA Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Art_TypeClass()
		 * @generated
		 */
		EClass FMA_ART_TYPE_CLASS = eINSTANCE.getFMA_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_ART_TYPE_CLASS__WERT = eINSTANCE.getFMA_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_ElementImpl <em>FMA Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_ElementImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element()
		 * @generated
		 */
		EClass FMA_ELEMENT = eINSTANCE.getFMA_Element();

		/**
		 * The meta object literal for the '<em><b>FMA Element Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ELEMENT__FMA_ELEMENT_ALLG = eINSTANCE.getFMA_Element_FMAElementAllg();

		/**
		 * The meta object literal for the '<em><b>FMA Element Anschluss</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS = eINSTANCE.getFMA_Element_FMAElementAnschluss();

		/**
		 * The meta object literal for the '<em><b>IDFMA Anlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ELEMENT__IDFMA_ANLAGE = eINSTANCE.getFMA_Element_IDFMAAnlage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Allg_AttributeGroupImpl <em>FMA Element Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element_Allg_AttributeGroup()
		 * @generated
		 */
		EClass FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getFMA_Element_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>FMA Element Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_ART = eINSTANCE.getFMA_Element_Allg_AttributeGroup_FMAElementArt();

		/**
		 * The meta object literal for the '<em><b>FMA Element Seilanzahl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILANZAHL = eINSTANCE.getFMA_Element_Allg_AttributeGroup_FMAElementSeilanzahl();

		/**
		 * The meta object literal for the '<em><b>FMA Element Seiltyp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILTYP = eINSTANCE.getFMA_Element_Allg_AttributeGroup_FMAElementSeiltyp();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Anschluss_AttributeGroupImpl <em>FMA Element Anschluss Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Anschluss_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element_Anschluss_AttributeGroup()
		 * @generated
		 */
		EClass FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP = eINSTANCE.getFMA_Element_Anschluss_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>FMA Anschluss Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_BEZEICHNUNG = eINSTANCE.getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussBezeichnung();

		/**
		 * The meta object literal for the '<em><b>FMA Anschluss Speiserichtung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_SPEISERICHTUNG = eINSTANCE.getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussSpeiserichtung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Art_TypeClassImpl <em>FMA Element Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element_Art_TypeClass()
		 * @generated
		 */
		EClass FMA_ELEMENT_ART_TYPE_CLASS = eINSTANCE.getFMA_Element_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_ELEMENT_ART_TYPE_CLASS__WERT = eINSTANCE.getFMA_Element_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Seilanzahl_TypeClassImpl <em>FMA Element Seilanzahl Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Seilanzahl_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element_Seilanzahl_TypeClass()
		 * @generated
		 */
		EClass FMA_ELEMENT_SEILANZAHL_TYPE_CLASS = eINSTANCE.getFMA_Element_Seilanzahl_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_ELEMENT_SEILANZAHL_TYPE_CLASS__WERT = eINSTANCE.getFMA_Element_Seilanzahl_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Seiltyp_TypeClassImpl <em>FMA Element Seiltyp Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Element_Seiltyp_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element_Seiltyp_TypeClass()
		 * @generated
		 */
		EClass FMA_ELEMENT_SEILTYP_TYPE_CLASS = eINSTANCE.getFMA_Element_Seiltyp_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_ELEMENT_SEILTYP_TYPE_CLASS__WERT = eINSTANCE.getFMA_Element_Seiltyp_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Hilffreimeldung_TypeClassImpl <em>FMA Hilffreimeldung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Hilffreimeldung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Hilffreimeldung_TypeClass()
		 * @generated
		 */
		EClass FMA_HILFFREIMELDUNG_TYPE_CLASS = eINSTANCE.getFMA_Hilffreimeldung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_HILFFREIMELDUNG_TYPE_CLASS__WERT = eINSTANCE.getFMA_Hilffreimeldung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Isolierung_TypeClassImpl <em>FMA Isolierung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Isolierung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Isolierung_TypeClass()
		 * @generated
		 */
		EClass FMA_ISOLIERUNG_TYPE_CLASS = eINSTANCE.getFMA_Isolierung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_ISOLIERUNG_TYPE_CLASS__WERT = eINSTANCE.getFMA_Isolierung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Kaskade_Bezeichnung_TypeClassImpl <em>FMA Kaskade Bezeichnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Kaskade_Bezeichnung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Kaskade_Bezeichnung_TypeClass()
		 * @generated
		 */
		EClass FMA_KASKADE_BEZEICHNUNG_TYPE_CLASS = eINSTANCE.getFMA_Kaskade_Bezeichnung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_KASKADE_BEZEICHNUNG_TYPE_CLASS__WERT = eINSTANCE.getFMA_Kaskade_Bezeichnung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Kaskade_Einzelauswertung_TypeClassImpl <em>FMA Kaskade Einzelauswertung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Kaskade_Einzelauswertung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Kaskade_Einzelauswertung_TypeClass()
		 * @generated
		 */
		EClass FMA_KASKADE_EINZELAUSWERTUNG_TYPE_CLASS = eINSTANCE.getFMA_Kaskade_Einzelauswertung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_KASKADE_EINZELAUSWERTUNG_TYPE_CLASS__WERT = eINSTANCE.getFMA_Kaskade_Einzelauswertung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_KomponenteImpl <em>FMA Komponente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_KomponenteImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente()
		 * @generated
		 */
		EClass FMA_KOMPONENTE = eINSTANCE.getFMA_Komponente();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_KOMPONENTE__BEZEICHNUNG = eINSTANCE.getFMA_Komponente_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Bezugspunkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_KOMPONENTE__ID_BEZUGSPUNKT = eINSTANCE.getFMA_Komponente_IDBezugspunkt();

		/**
		 * The meta object literal for the '<em><b>IDFM Agrenze</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_KOMPONENTE__IDFM_AGRENZE = eINSTANCE.getFMA_Komponente_IDFMAgrenze();

		/**
		 * The meta object literal for the '<em><b>FMA Komponente Achszaehlpunkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT = eINSTANCE.getFMA_Komponente_FMAKomponenteAchszaehlpunkt();

		/**
		 * The meta object literal for the '<em><b>FMA Komponente Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_KOMPONENTE__FMA_KOMPONENTE_ART = eINSTANCE.getFMA_Komponente_FMAKomponenteArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl <em>FMA Komponente Achszaehlpunkt Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente_Achszaehlpunkt_AttributeGroup()
		 * @generated
		 */
		EClass FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP = eINSTANCE.getFMA_Komponente_Achszaehlpunkt_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>FMA Komponente Schienenprofil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_SCHIENENPROFIL = eINSTANCE.getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteSchienenprofil();

		/**
		 * The meta object literal for the '<em><b>FMA Komponente Stromversorgung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_STROMVERSORGUNG = eINSTANCE.getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteStromversorgung();

		/**
		 * The meta object literal for the '<em><b>FMA Komponente Typ</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_TYP = eINSTANCE.getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteTyp();

		/**
		 * The meta object literal for the '<em><b>ID Energie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_ENERGIE = eINSTANCE.getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDEnergie();

		/**
		 * The meta object literal for the '<em><b>ID Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_INFORMATION = eINSTANCE.getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDInformation();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Art_TypeClassImpl <em>FMA Komponente Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente_Art_TypeClass()
		 * @generated
		 */
		EClass FMA_KOMPONENTE_ART_TYPE_CLASS = eINSTANCE.getFMA_Komponente_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_KOMPONENTE_ART_TYPE_CLASS__WERT = eINSTANCE.getFMA_Komponente_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Schienenprofil_TypeClassImpl <em>FMA Komponente Schienenprofil Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Schienenprofil_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente_Schienenprofil_TypeClass()
		 * @generated
		 */
		EClass FMA_KOMPONENTE_SCHIENENPROFIL_TYPE_CLASS = eINSTANCE.getFMA_Komponente_Schienenprofil_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_KOMPONENTE_SCHIENENPROFIL_TYPE_CLASS__WERT = eINSTANCE.getFMA_Komponente_Schienenprofil_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Stromversorgung_TypeClassImpl <em>FMA Komponente Stromversorgung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Stromversorgung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente_Stromversorgung_TypeClass()
		 * @generated
		 */
		EClass FMA_KOMPONENTE_STROMVERSORGUNG_TYPE_CLASS = eINSTANCE.getFMA_Komponente_Stromversorgung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_KOMPONENTE_STROMVERSORGUNG_TYPE_CLASS__WERT = eINSTANCE.getFMA_Komponente_Stromversorgung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Typ_TypeClassImpl <em>FMA Komponente Typ Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Komponente_Typ_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente_Typ_TypeClass()
		 * @generated
		 */
		EClass FMA_KOMPONENTE_TYP_TYPE_CLASS = eINSTANCE.getFMA_Komponente_Typ_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_KOMPONENTE_TYP_TYPE_CLASS__WERT = eINSTANCE.getFMA_Komponente_Typ_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_Beeinflusst_TypeClassImpl <em>FMA Laenge Beeinflusst Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_Beeinflusst_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_Beeinflusst_TypeClass()
		 * @generated
		 */
		EClass FMA_LAENGE_BEEINFLUSST_TYPE_CLASS = eINSTANCE.getFMA_Laenge_Beeinflusst_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_LAENGE_BEEINFLUSST_TYPE_CLASS__WERT = eINSTANCE.getFMA_Laenge_Beeinflusst_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_E1_TypeClassImpl <em>FMA Laenge E1 Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_E1_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_E1_TypeClass()
		 * @generated
		 */
		EClass FMA_LAENGE_E1_TYPE_CLASS = eINSTANCE.getFMA_Laenge_E1_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_LAENGE_E1_TYPE_CLASS__WERT = eINSTANCE.getFMA_Laenge_E1_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_E2_TypeClassImpl <em>FMA Laenge E2 Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_E2_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_E2_TypeClass()
		 * @generated
		 */
		EClass FMA_LAENGE_E2_TYPE_CLASS = eINSTANCE.getFMA_Laenge_E2_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_LAENGE_E2_TYPE_CLASS__WERT = eINSTANCE.getFMA_Laenge_E2_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_E3_TypeClassImpl <em>FMA Laenge E3 Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_E3_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_E3_TypeClass()
		 * @generated
		 */
		EClass FMA_LAENGE_E3_TYPE_CLASS = eINSTANCE.getFMA_Laenge_E3_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_LAENGE_E3_TYPE_CLASS__WERT = eINSTANCE.getFMA_Laenge_E3_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_S_TypeClassImpl <em>FMA Laenge SType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_S_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_S_TypeClass()
		 * @generated
		 */
		EClass FMA_LAENGE_STYPE_CLASS = eINSTANCE.getFMA_Laenge_S_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_LAENGE_STYPE_CLASS__WERT = eINSTANCE.getFMA_Laenge_S_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_TypeClassImpl <em>FMA Laenge Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Laenge_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_TypeClass()
		 * @generated
		 */
		EClass FMA_LAENGE_TYPE_CLASS = eINSTANCE.getFMA_Laenge_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_LAENGE_TYPE_CLASS__WERT = eINSTANCE.getFMA_Laenge_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_Typ_TypeClassImpl <em>FMA Typ Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.FMA_Typ_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Typ_TypeClass()
		 * @generated
		 */
		EClass FMA_TYP_TYPE_CLASS = eINSTANCE.getFMA_Typ_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMA_TYP_TYPE_CLASS__WERT = eINSTANCE.getFMA_Typ_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Schaltmittel_Funktion_TypeClassImpl <em>Schaltmittel Funktion Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.Schaltmittel_Funktion_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getSchaltmittel_Funktion_TypeClass()
		 * @generated
		 */
		EClass SCHALTMITTEL_FUNKTION_TYPE_CLASS = eINSTANCE.getSchaltmittel_Funktion_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHALTMITTEL_FUNKTION_TYPE_CLASS__WERT = eINSTANCE.getSchaltmittel_Funktion_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Schaltmittel_ZuordnungImpl <em>Schaltmittel Zuordnung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.Schaltmittel_ZuordnungImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getSchaltmittel_Zuordnung()
		 * @generated
		 */
		EClass SCHALTMITTEL_ZUORDNUNG = eINSTANCE.getSchaltmittel_Zuordnung();

		/**
		 * The meta object literal for the '<em><b>ID Anforderung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG = eINSTANCE.getSchaltmittel_Zuordnung_IDAnforderung();

		/**
		 * The meta object literal for the '<em><b>ID Schalter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER = eINSTANCE.getSchaltmittel_Zuordnung_IDSchalter();

		/**
		 * The meta object literal for the '<em><b>Schaltmittel Funktion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION = eINSTANCE.getSchaltmittel_Zuordnung_SchaltmittelFunktion();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Uebertragung_FMinfo_Richtung_TypeClassImpl <em>Uebertragung FMinfo Richtung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.Uebertragung_FMinfo_Richtung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getUebertragung_FMinfo_Richtung_TypeClass()
		 * @generated
		 */
		EClass UEBERTRAGUNG_FMINFO_RICHTUNG_TYPE_CLASS = eINSTANCE.getUebertragung_FMinfo_Richtung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UEBERTRAGUNG_FMINFO_RICHTUNG_TYPE_CLASS__WERT = eINSTANCE.getUebertragung_FMinfo_Richtung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Uebertragung_FMinfo_Typ_TypeClassImpl <em>Uebertragung FMinfo Typ Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.Uebertragung_FMinfo_Typ_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getUebertragung_FMinfo_Typ_TypeClass()
		 * @generated
		 */
		EClass UEBERTRAGUNG_FMINFO_TYP_TYPE_CLASS = eINSTANCE.getUebertragung_FMinfo_Typ_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UEBERTRAGUNG_FMINFO_TYP_TYPE_CLASS__WERT = eINSTANCE.getUebertragung_FMinfo_Typ_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.ZugeinwirkungImpl <em>Zugeinwirkung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.ZugeinwirkungImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getZugeinwirkung()
		 * @generated
		 */
		EClass ZUGEINWIRKUNG = eINSTANCE.getZugeinwirkung();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUGEINWIRKUNG__BEZEICHNUNG = eINSTANCE.getZugeinwirkung_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Bezugspunkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUGEINWIRKUNG__ID_BEZUGSPUNKT = eINSTANCE.getZugeinwirkung_IDBezugspunkt();

		/**
		 * The meta object literal for the '<em><b>Zugeinwirkung Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUGEINWIRKUNG__ZUGEINWIRKUNG_ALLG = eINSTANCE.getZugeinwirkung_ZugeinwirkungAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Zugeinwirkung_Allg_AttributeGroupImpl <em>Zugeinwirkung Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.Zugeinwirkung_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getZugeinwirkung_Allg_AttributeGroup()
		 * @generated
		 */
		EClass ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getZugeinwirkung_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Zugeinwirkung Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_ART = eINSTANCE.getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungArt();

		/**
		 * The meta object literal for the '<em><b>Zugeinwirkung Typ</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_TYP = eINSTANCE.getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungTyp();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Zugeinwirkung_Art_TypeClassImpl <em>Zugeinwirkung Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.Zugeinwirkung_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getZugeinwirkung_Art_TypeClass()
		 * @generated
		 */
		EClass ZUGEINWIRKUNG_ART_TYPE_CLASS = eINSTANCE.getZugeinwirkung_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUGEINWIRKUNG_ART_TYPE_CLASS__WERT = eINSTANCE.getZugeinwirkung_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.impl.Zugeinwirkung_Typ_TypeClassImpl <em>Zugeinwirkung Typ Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.impl.Zugeinwirkung_Typ_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getZugeinwirkung_Typ_TypeClass()
		 * @generated
		 */
		EClass ZUGEINWIRKUNG_TYP_TYPE_CLASS = eINSTANCE.getZugeinwirkung_Typ_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUGEINWIRKUNG_TYP_TYPE_CLASS__WERT = eINSTANCE.getZugeinwirkung_Typ_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMBezeichnungKennbuchstabe <em>ENUM Bezeichnung Kennbuchstabe</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMBezeichnungKennbuchstabe
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMBezeichnungKennbuchstabe()
		 * @generated
		 */
		EEnum ENUM_BEZEICHNUNG_KENNBUCHSTABE = eINSTANCE.getENUMBezeichnungKennbuchstabe();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAAnschlussSpeiserichtung <em>ENUMFMA Anschluss Speiserichtung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAAnschlussSpeiserichtung
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAAnschlussSpeiserichtung()
		 * @generated
		 */
		EEnum ENUMFMA_ANSCHLUSS_SPEISERICHTUNG = eINSTANCE.getENUMFMAAnschlussSpeiserichtung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAArt <em>ENUMFMA Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAArt
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAArt()
		 * @generated
		 */
		EEnum ENUMFMA_ART = eINSTANCE.getENUMFMAArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAElementArt <em>ENUMFMA Element Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAElementArt
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAElementArt()
		 * @generated
		 */
		EEnum ENUMFMA_ELEMENT_ART = eINSTANCE.getENUMFMAElementArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAElementSeilanzahl <em>ENUMFMA Element Seilanzahl</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAElementSeilanzahl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAElementSeilanzahl()
		 * @generated
		 */
		EEnum ENUMFMA_ELEMENT_SEILANZAHL = eINSTANCE.getENUMFMAElementSeilanzahl();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMFMAKomponenteArt <em>ENUMFMA Komponente Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAKomponenteArt
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAKomponenteArt()
		 * @generated
		 */
		EEnum ENUMFMA_KOMPONENTE_ART = eINSTANCE.getENUMFMAKomponenteArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMIsolierung <em>ENUM Isolierung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMIsolierung
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMIsolierung()
		 * @generated
		 */
		EEnum ENUM_ISOLIERUNG = eINSTANCE.getENUMIsolierung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMSchaltmittelFunktion <em>ENUM Schaltmittel Funktion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMSchaltmittelFunktion
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMSchaltmittelFunktion()
		 * @generated
		 */
		EEnum ENUM_SCHALTMITTEL_FUNKTION = eINSTANCE.getENUMSchaltmittelFunktion();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMSchienenprofil <em>ENUM Schienenprofil</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMSchienenprofil
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMSchienenprofil()
		 * @generated
		 */
		EEnum ENUM_SCHIENENPROFIL = eINSTANCE.getENUMSchienenprofil();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMUebertragungFMinfoRichtung <em>ENUM Uebertragung FMinfo Richtung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMUebertragungFMinfoRichtung
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMUebertragungFMinfoRichtung()
		 * @generated
		 */
		EEnum ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG = eINSTANCE.getENUMUebertragungFMinfoRichtung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Ortung.ENUMZugeinwirkungArt <em>ENUM Zugeinwirkung Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMZugeinwirkungArt
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMZugeinwirkungArt()
		 * @generated
		 */
		EEnum ENUM_ZUGEINWIRKUNG_ART = eINSTANCE.getENUMZugeinwirkungArt();

		/**
		 * The meta object literal for the '<em>Bettungswiderstand Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getBettungswiderstand_Type()
		 * @generated
		 */
		EDataType BETTUNGSWIDERSTAND_TYPE = eINSTANCE.getBettungswiderstand_Type();

		/**
		 * The meta object literal for the '<em>ENUM Bezeichnung Kennbuchstabe Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMBezeichnungKennbuchstabe
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMBezeichnungKennbuchstabeObject()
		 * @generated
		 */
		EDataType ENUM_BEZEICHNUNG_KENNBUCHSTABE_OBJECT = eINSTANCE.getENUMBezeichnungKennbuchstabeObject();

		/**
		 * The meta object literal for the '<em>ENUMFMA Anschluss Speiserichtung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAAnschlussSpeiserichtung
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAAnschlussSpeiserichtungObject()
		 * @generated
		 */
		EDataType ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_OBJECT = eINSTANCE.getENUMFMAAnschlussSpeiserichtungObject();

		/**
		 * The meta object literal for the '<em>ENUMFMA Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAArt
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAArtObject()
		 * @generated
		 */
		EDataType ENUMFMA_ART_OBJECT = eINSTANCE.getENUMFMAArtObject();

		/**
		 * The meta object literal for the '<em>ENUMFMA Element Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAElementArt
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAElementArtObject()
		 * @generated
		 */
		EDataType ENUMFMA_ELEMENT_ART_OBJECT = eINSTANCE.getENUMFMAElementArtObject();

		/**
		 * The meta object literal for the '<em>ENUMFMA Element Seilanzahl Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAElementSeilanzahl
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAElementSeilanzahlObject()
		 * @generated
		 */
		EDataType ENUMFMA_ELEMENT_SEILANZAHL_OBJECT = eINSTANCE.getENUMFMAElementSeilanzahlObject();

		/**
		 * The meta object literal for the '<em>ENUMFMA Komponente Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMFMAKomponenteArt
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMFMAKomponenteArtObject()
		 * @generated
		 */
		EDataType ENUMFMA_KOMPONENTE_ART_OBJECT = eINSTANCE.getENUMFMAKomponenteArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Isolierung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMIsolierung
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMIsolierungObject()
		 * @generated
		 */
		EDataType ENUM_ISOLIERUNG_OBJECT = eINSTANCE.getENUMIsolierungObject();

		/**
		 * The meta object literal for the '<em>ENUM Schaltmittel Funktion Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMSchaltmittelFunktion
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMSchaltmittelFunktionObject()
		 * @generated
		 */
		EDataType ENUM_SCHALTMITTEL_FUNKTION_OBJECT = eINSTANCE.getENUMSchaltmittelFunktionObject();

		/**
		 * The meta object literal for the '<em>ENUM Schienenprofil Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMSchienenprofil
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMSchienenprofilObject()
		 * @generated
		 */
		EDataType ENUM_SCHIENENPROFIL_OBJECT = eINSTANCE.getENUMSchienenprofilObject();

		/**
		 * The meta object literal for the '<em>ENUM Uebertragung FMinfo Richtung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMUebertragungFMinfoRichtung
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMUebertragungFMinfoRichtungObject()
		 * @generated
		 */
		EDataType ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_OBJECT = eINSTANCE.getENUMUebertragungFMinfoRichtungObject();

		/**
		 * The meta object literal for the '<em>ENUM Zugeinwirkung Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Ortung.ENUMZugeinwirkungArt
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getENUMZugeinwirkungArtObject()
		 * @generated
		 */
		EDataType ENUM_ZUGEINWIRKUNG_ART_OBJECT = eINSTANCE.getENUMZugeinwirkungArtObject();

		/**
		 * The meta object literal for the '<em>FMA Anschluss Bezeichnung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Anschluss_Bezeichnung_Type()
		 * @generated
		 */
		EDataType FMA_ANSCHLUSS_BEZEICHNUNG_TYPE = eINSTANCE.getFMA_Anschluss_Bezeichnung_Type();

		/**
		 * The meta object literal for the '<em>FMA Element Seiltyp Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Element_Seiltyp_Type()
		 * @generated
		 */
		EDataType FMA_ELEMENT_SEILTYP_TYPE = eINSTANCE.getFMA_Element_Seiltyp_Type();

		/**
		 * The meta object literal for the '<em>FMA Kaskade Bezeichnung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Kaskade_Bezeichnung_Type()
		 * @generated
		 */
		EDataType FMA_KASKADE_BEZEICHNUNG_TYPE = eINSTANCE.getFMA_Kaskade_Bezeichnung_Type();

		/**
		 * The meta object literal for the '<em>FMA Komponente Typ Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Komponente_Typ_Type()
		 * @generated
		 */
		EDataType FMA_KOMPONENTE_TYP_TYPE = eINSTANCE.getFMA_Komponente_Typ_Type();

		/**
		 * The meta object literal for the '<em>FMA Laenge Beeinflusst Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_Beeinflusst_Type()
		 * @generated
		 */
		EDataType FMA_LAENGE_BEEINFLUSST_TYPE = eINSTANCE.getFMA_Laenge_Beeinflusst_Type();

		/**
		 * The meta object literal for the '<em>FMA Laenge E1 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_E1_Type()
		 * @generated
		 */
		EDataType FMA_LAENGE_E1_TYPE = eINSTANCE.getFMA_Laenge_E1_Type();

		/**
		 * The meta object literal for the '<em>FMA Laenge E2 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_E2_Type()
		 * @generated
		 */
		EDataType FMA_LAENGE_E2_TYPE = eINSTANCE.getFMA_Laenge_E2_Type();

		/**
		 * The meta object literal for the '<em>FMA Laenge E3 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_E3_Type()
		 * @generated
		 */
		EDataType FMA_LAENGE_E3_TYPE = eINSTANCE.getFMA_Laenge_E3_Type();

		/**
		 * The meta object literal for the '<em>FMA Laenge SType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_S_Type()
		 * @generated
		 */
		EDataType FMA_LAENGE_STYPE = eINSTANCE.getFMA_Laenge_S_Type();

		/**
		 * The meta object literal for the '<em>FMA Laenge Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Laenge_Type()
		 * @generated
		 */
		EDataType FMA_LAENGE_TYPE = eINSTANCE.getFMA_Laenge_Type();

		/**
		 * The meta object literal for the '<em>FMA Typ Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getFMA_Typ_Type()
		 * @generated
		 */
		EDataType FMA_TYP_TYPE = eINSTANCE.getFMA_Typ_Type();

		/**
		 * The meta object literal for the '<em>Uebertragung FMinfo Typ Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getUebertragung_FMinfo_Typ_Type()
		 * @generated
		 */
		EDataType UEBERTRAGUNG_FMINFO_TYP_TYPE = eINSTANCE.getUebertragung_FMinfo_Typ_Type();

		/**
		 * The meta object literal for the '<em>Zugeinwirkung Typ Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl#getZugeinwirkung_Typ_Type()
		 * @generated
		 */
		EDataType ZUGEINWIRKUNG_TYP_TYPE = eINSTANCE.getZugeinwirkung_Typ_Type();

	}

} //OrtungPackage
