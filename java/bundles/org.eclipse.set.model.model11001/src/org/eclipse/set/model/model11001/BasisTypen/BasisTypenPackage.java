/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.BasisTypen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenFactory
 * @model kind="package"
 * @generated
 */
public interface BasisTypenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BasisTypen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsBasisTypen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasisTypenPackage eINSTANCE = org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.BasisAttribut_AttributeGroupImpl <em>Basis Attribut Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisAttribut_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBasisAttribut_AttributeGroup()
	 * @generated
	 */
	int BASIS_ATTRIBUT_ATTRIBUTE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK = 0;

	/**
	 * The number of structural features of the '<em>Basis Attribut Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Aussenanlage_TypeClassImpl <em>Bezeichnung Aussenanlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Aussenanlage_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Aussenanlage_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_AUSSENANLAGE_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_AUSSENANLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_AUSSENANLAGE_TYPE_CLASS__WERT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Aussenanlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_AUSSENANLAGE_TYPE_CLASS_FEATURE_COUNT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Element_AttributeGroupImpl <em>Bezeichnung Element Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Element_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Element_AttributeGroup()
	 * @generated
	 */
	int BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Bezeichnung Aussenanlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_AUSSENANLAGE = 0;

	/**
	 * The feature id for the '<em><b>Bezeichnung Lageplan Kurz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_KURZ = 1;

	/**
	 * The feature id for the '<em><b>Bezeichnung Lageplan Lang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_LANG = 2;

	/**
	 * The feature id for the '<em><b>Bezeichnung Tabelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_TABELLE = 3;

	/**
	 * The feature id for the '<em><b>Kennzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__KENNZAHL = 4;

	/**
	 * The feature id for the '<em><b>Oertlicher Elementname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__OERTLICHER_ELEMENTNAME = 5;

	/**
	 * The number of structural features of the '<em>Bezeichnung Element Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Lageplan_Kurz_TypeClassImpl <em>Bezeichnung Lageplan Kurz Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Lageplan_Kurz_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Lageplan_Kurz_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_LAGEPLAN_KURZ_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_LAGEPLAN_KURZ_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_LAGEPLAN_KURZ_TYPE_CLASS__WERT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Lageplan Kurz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_LAGEPLAN_KURZ_TYPE_CLASS_FEATURE_COUNT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Lageplan_Lang_TypeClassImpl <em>Bezeichnung Lageplan Lang Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Lageplan_Lang_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Lageplan_Lang_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_LAGEPLAN_LANG_TYPE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_LAGEPLAN_LANG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_LAGEPLAN_LANG_TYPE_CLASS__WERT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Lageplan Lang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_LAGEPLAN_LANG_TYPE_CLASS_FEATURE_COUNT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Tabelle_TypeClassImpl <em>Bezeichnung Tabelle Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Tabelle_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Tabelle_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_TABELLE_TYPE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_TABELLE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_TABELLE_TYPE_CLASS__WERT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Tabelle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_TABELLE_TYPE_CLASS_FEATURE_COUNT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Datum_Auslieferung_TypeClassImpl <em>Datum Auslieferung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Datum_Auslieferung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getDatum_Auslieferung_TypeClass()
	 * @generated
	 */
	int DATUM_AUSLIEFERUNG_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATUM_AUSLIEFERUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATUM_AUSLIEFERUNG_TYPE_CLASS__WERT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datum Auslieferung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATUM_AUSLIEFERUNG_TYPE_CLASS_FEATURE_COUNT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.ID_Bearbeitungsvermerk_TypeClassImpl <em>ID Bearbeitungsvermerk Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.ID_Bearbeitungsvermerk_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getID_Bearbeitungsvermerk_TypeClass()
	 * @generated
	 */
	int ID_BEARBEITUNGSVERMERK_TYPE_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEARBEITUNGSVERMERK_TYPE_CLASS__WERT = 0;

	/**
	 * The number of structural features of the '<em>ID Bearbeitungsvermerk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BEARBEITUNGSVERMERK_TYPE_CLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Kennzahl_TypeClassImpl <em>Kennzahl Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Kennzahl_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getKennzahl_TypeClass()
	 * @generated
	 */
	int KENNZAHL_TYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENNZAHL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENNZAHL_TYPE_CLASS__WERT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kennzahl Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENNZAHL_TYPE_CLASS_FEATURE_COUNT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Oertlicher_Elementname_TypeClassImpl <em>Oertlicher Elementname Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Oertlicher_Elementname_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getOertlicher_Elementname_TypeClass()
	 * @generated
	 */
	int OERTLICHER_ELEMENTNAME_TYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHER_ELEMENTNAME_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHER_ELEMENTNAME_TYPE_CLASS__WERT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Oertlicher Elementname Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHER_ELEMENTNAME_TYPE_CLASS_FEATURE_COUNT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Pruefmerkmale_Daten_AttributeGroupImpl <em>Pruefmerkmale Daten Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Pruefmerkmale_Daten_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getPruefmerkmale_Daten_AttributeGroup()
	 * @generated
	 */
	int PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Datum Auslieferung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__DATUM_AUSLIEFERUNG = 0;

	/**
	 * The feature id for the '<em><b>Pruefsumme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME = 1;

	/**
	 * The feature id for the '<em><b>Pruefsumme Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME_ART = 2;

	/**
	 * The feature id for the '<em><b>Version Auslieferung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__VERSION_AUSLIEFERUNG = 3;

	/**
	 * The number of structural features of the '<em>Pruefmerkmale Daten Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Pruefsumme_Art_TypeClassImpl <em>Pruefsumme Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Pruefsumme_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getPruefsumme_Art_TypeClass()
	 * @generated
	 */
	int PRUEFSUMME_ART_TYPE_CLASS = 11;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFSUMME_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFSUMME_ART_TYPE_CLASS__WERT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pruefsumme Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFSUMME_ART_TYPE_CLASS_FEATURE_COUNT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Pruefsumme_TypeClassImpl <em>Pruefsumme Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Pruefsumme_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getPruefsumme_TypeClass()
	 * @generated
	 */
	int PRUEFSUMME_TYPE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFSUMME_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFSUMME_TYPE_CLASS__WERT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pruefsumme Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFSUMME_TYPE_CLASS_FEATURE_COUNT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Version_Auslieferung_TypeClassImpl <em>Version Auslieferung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Version_Auslieferung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getVersion_Auslieferung_TypeClass()
	 * @generated
	 */
	int VERSION_AUSLIEFERUNG_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_AUSLIEFERUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_AUSLIEFERUNG_TYPE_CLASS__WERT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Version Auslieferung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_AUSLIEFERUNG_TYPE_CLASS_FEATURE_COUNT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Zeiger_TypeClassImpl <em>Zeiger Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Zeiger_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getZeiger_TypeClass()
	 * @generated
	 */
	int ZEIGER_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEIGER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEIGER_TYPE_CLASS__WERT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zeiger Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEIGER_TYPE_CLASS_FEATURE_COUNT = BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem <em>ENUM Anwendungssystem</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMAnwendungssystem()
	 * @generated
	 */
	int ENUM_ANWENDUNGSSYSTEM = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung <em>ENUM Ausrichtung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMAusrichtung()
	 * @generated
	 */
	int ENUM_AUSRICHTUNG = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg <em>ENUM Bremsweg</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMBremsweg()
	 * @generated
	 */
	int ENUM_BREMSWEG = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom <em>ENUM Fahrstrom</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMFahrstrom()
	 * @generated
	 */
	int ENUM_FAHRSTROM = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts <em>ENUM Links Rechts</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMLinksRechts()
	 * @generated
	 */
	int ENUM_LINKS_RECHTS = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMPruefsummeArt <em>ENUM Pruefsumme Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMPruefsummeArt
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMPruefsummeArt()
	 * @generated
	 */
	int ENUM_PRUEFSUMME_ART = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich <em>ENUM Regionalbereich</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMRegionalbereich()
	 * @generated
	 */
	int ENUM_REGIONALBEREICH = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung <em>ENUM Wirkrichtung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMWirkrichtung()
	 * @generated
	 */
	int ENUM_WIRKRICHTUNG = 22;

	/**
	 * The meta object id for the '<em>Anwendungssystem Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getAnwendungssystem_Type()
	 * @generated
	 */
	int ANWENDUNGSSYSTEM_TYPE = 23;

	/**
	 * The meta object id for the '<em>Ausrichtung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getAusrichtung_Type()
	 * @generated
	 */
	int AUSRICHTUNG_TYPE = 24;

	/**
	 * The meta object id for the '<em>Bezeichnung Aussenanlage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Aussenanlage_Type()
	 * @generated
	 */
	int BEZEICHNUNG_AUSSENANLAGE_TYPE = 25;

	/**
	 * The meta object id for the '<em>Bezeichnung Lageplan Kurz Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Lageplan_Kurz_Type()
	 * @generated
	 */
	int BEZEICHNUNG_LAGEPLAN_KURZ_TYPE = 26;

	/**
	 * The meta object id for the '<em>Bezeichnung Lageplan Lang Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Lageplan_Lang_Type()
	 * @generated
	 */
	int BEZEICHNUNG_LAGEPLAN_LANG_TYPE = 27;

	/**
	 * The meta object id for the '<em>Bezeichnung Tabelle Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Tabelle_Type()
	 * @generated
	 */
	int BEZEICHNUNG_TABELLE_TYPE = 28;

	/**
	 * The meta object id for the '<em>Bremsweg Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBremsweg_Type()
	 * @generated
	 */
	int BREMSWEG_TYPE = 29;

	/**
	 * The meta object id for the '<em>Dateiname Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getDateiname_Type()
	 * @generated
	 */
	int DATEINAME_TYPE = 30;

	/**
	 * The meta object id for the '<em>Datum Auslieferung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getDatum_Auslieferung_Type()
	 * @generated
	 */
	int DATUM_AUSLIEFERUNG_TYPE = 31;

	/**
	 * The meta object id for the '<em>ENUM Anwendungssystem Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMAnwendungssystemObject()
	 * @generated
	 */
	int ENUM_ANWENDUNGSSYSTEM_OBJECT = 32;

	/**
	 * The meta object id for the '<em>ENUM Ausrichtung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMAusrichtungObject()
	 * @generated
	 */
	int ENUM_AUSRICHTUNG_OBJECT = 33;

	/**
	 * The meta object id for the '<em>ENUM Bremsweg Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMBremswegObject()
	 * @generated
	 */
	int ENUM_BREMSWEG_OBJECT = 34;

	/**
	 * The meta object id for the '<em>ENUM Fahrstrom Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMFahrstromObject()
	 * @generated
	 */
	int ENUM_FAHRSTROM_OBJECT = 35;

	/**
	 * The meta object id for the '<em>ENUM Links Rechts Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMLinksRechtsObject()
	 * @generated
	 */
	int ENUM_LINKS_RECHTS_OBJECT = 36;

	/**
	 * The meta object id for the '<em>ENUM Pruefsumme Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMPruefsummeArt
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMPruefsummeArtObject()
	 * @generated
	 */
	int ENUM_PRUEFSUMME_ART_OBJECT = 37;

	/**
	 * The meta object id for the '<em>ENUM Regionalbereich Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMRegionalbereichObject()
	 * @generated
	 */
	int ENUM_REGIONALBEREICH_OBJECT = 38;

	/**
	 * The meta object id for the '<em>ENUM Wirkrichtung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMWirkrichtungObject()
	 * @generated
	 */
	int ENUM_WIRKRICHTUNG_OBJECT = 39;

	/**
	 * The meta object id for the '<em>Fahrstrom Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getFahrstrom_Type()
	 * @generated
	 */
	int FAHRSTROM_TYPE = 40;

	/**
	 * The meta object id for the '<em>Frei Text Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getFreiText_Type()
	 * @generated
	 */
	int FREI_TEXT_TYPE = 41;

	/**
	 * The meta object id for the '<em>Geschwindigkeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getGeschwindigkeit_Type()
	 * @generated
	 */
	int GESCHWINDIGKEIT_TYPE = 42;

	/**
	 * The meta object id for the '<em>GUID Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getGUID_Type()
	 * @generated
	 */
	int GUID_TYPE = 43;

	/**
	 * The meta object id for the '<em>Hersteller Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getHersteller_Type()
	 * @generated
	 */
	int HERSTELLER_TYPE = 44;

	/**
	 * The meta object id for the '<em>Kennzahl Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getKennzahl_Type()
	 * @generated
	 */
	int KENNZAHL_TYPE = 45;

	/**
	 * The meta object id for the '<em>Kilometrierung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getKilometrierung_Type()
	 * @generated
	 */
	int KILOMETRIERUNG_TYPE = 46;

	/**
	 * The meta object id for the '<em>Links Rechts Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getLinksRechts_Type()
	 * @generated
	 */
	int LINKS_RECHTS_TYPE = 47;

	/**
	 * The meta object id for the '<em>Meter Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getMeter_Type()
	 * @generated
	 */
	int METER_TYPE = 48;

	/**
	 * The meta object id for the '<em>Objektname Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getObjektname_Type()
	 * @generated
	 */
	int OBJEKTNAME_TYPE = 49;

	/**
	 * The meta object id for the '<em>Oertlicher Elementname Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getOertlicher_Elementname_Type()
	 * @generated
	 */
	int OERTLICHER_ELEMENTNAME_TYPE = 50;

	/**
	 * The meta object id for the '<em>Regionalbereich Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getRegionalbereich_Type()
	 * @generated
	 */
	int REGIONALBEREICH_TYPE = 51;

	/**
	 * The meta object id for the '<em>Sekunde Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getSekunde_Type()
	 * @generated
	 */
	int SEKUNDE_TYPE = 52;

	/**
	 * The meta object id for the '<em>Text Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getText_Type()
	 * @generated
	 */
	int TEXT_TYPE = 53;

	/**
	 * The meta object id for the '<em>Version Auslieferung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getVersion_Auslieferung_Type()
	 * @generated
	 */
	int VERSION_AUSLIEFERUNG_TYPE = 54;

	/**
	 * The meta object id for the '<em>Wirkrichtung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getWirkrichtung_Type()
	 * @generated
	 */
	int WIRKRICHTUNG_TYPE = 55;

	/**
	 * The meta object id for the '<em>Zeichenkette Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getZeichenkette_Type()
	 * @generated
	 */
	int ZEICHENKETTE_TYPE = 56;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup <em>Basis Attribut Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basis Attribut Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup
	 * @generated
	 */
	EClass getBasisAttribut_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup#getIDBearbeitungsvermerk <em>ID Bearbeitungsvermerk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Bearbeitungsvermerk</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup#getIDBearbeitungsvermerk()
	 * @see #getBasisAttribut_AttributeGroup()
	 * @generated
	 */
	EReference getBasisAttribut_AttributeGroup_IDBearbeitungsvermerk();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Aussenanlage_TypeClass <em>Bezeichnung Aussenanlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Aussenanlage Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Aussenanlage_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Aussenanlage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Aussenanlage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Aussenanlage_TypeClass#getWert()
	 * @see #getBezeichnung_Aussenanlage_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Aussenanlage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup <em>Bezeichnung Element Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Element Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup
	 * @generated
	 */
	EClass getBezeichnung_Element_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungAussenanlage <em>Bezeichnung Aussenanlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Aussenanlage</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungAussenanlage()
	 * @see #getBezeichnung_Element_AttributeGroup()
	 * @generated
	 */
	EReference getBezeichnung_Element_AttributeGroup_BezeichnungAussenanlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungLageplanKurz <em>Bezeichnung Lageplan Kurz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Lageplan Kurz</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungLageplanKurz()
	 * @see #getBezeichnung_Element_AttributeGroup()
	 * @generated
	 */
	EReference getBezeichnung_Element_AttributeGroup_BezeichnungLageplanKurz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungLageplanLang <em>Bezeichnung Lageplan Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Lageplan Lang</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungLageplanLang()
	 * @see #getBezeichnung_Element_AttributeGroup()
	 * @generated
	 */
	EReference getBezeichnung_Element_AttributeGroup_BezeichnungLageplanLang();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungTabelle <em>Bezeichnung Tabelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Tabelle</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungTabelle()
	 * @see #getBezeichnung_Element_AttributeGroup()
	 * @generated
	 */
	EReference getBezeichnung_Element_AttributeGroup_BezeichnungTabelle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getKennzahl <em>Kennzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kennzahl</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getKennzahl()
	 * @see #getBezeichnung_Element_AttributeGroup()
	 * @generated
	 */
	EReference getBezeichnung_Element_AttributeGroup_Kennzahl();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getOertlicherElementname <em>Oertlicher Elementname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oertlicher Elementname</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getOertlicherElementname()
	 * @see #getBezeichnung_Element_AttributeGroup()
	 * @generated
	 */
	EReference getBezeichnung_Element_AttributeGroup_OertlicherElementname();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Lageplan_Kurz_TypeClass <em>Bezeichnung Lageplan Kurz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Lageplan Kurz Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Lageplan_Kurz_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Lageplan_Kurz_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Lageplan_Kurz_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Lageplan_Kurz_TypeClass#getWert()
	 * @see #getBezeichnung_Lageplan_Kurz_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Lageplan_Kurz_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Lageplan_Lang_TypeClass <em>Bezeichnung Lageplan Lang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Lageplan Lang Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Lageplan_Lang_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Lageplan_Lang_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Lageplan_Lang_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Lageplan_Lang_TypeClass#getWert()
	 * @see #getBezeichnung_Lageplan_Lang_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Lageplan_Lang_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Tabelle_TypeClass <em>Bezeichnung Tabelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Tabelle Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Tabelle_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Tabelle_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Tabelle_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Tabelle_TypeClass#getWert()
	 * @see #getBezeichnung_Tabelle_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Tabelle_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.Datum_Auslieferung_TypeClass <em>Datum Auslieferung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datum Auslieferung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Datum_Auslieferung_TypeClass
	 * @generated
	 */
	EClass getDatum_Auslieferung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.BasisTypen.Datum_Auslieferung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Datum_Auslieferung_TypeClass#getWert()
	 * @see #getDatum_Auslieferung_TypeClass()
	 * @generated
	 */
	EAttribute getDatum_Auslieferung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.ID_Bearbeitungsvermerk_TypeClass <em>ID Bearbeitungsvermerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Bearbeitungsvermerk Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ID_Bearbeitungsvermerk_TypeClass
	 * @generated
	 */
	EClass getID_Bearbeitungsvermerk_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.BasisTypen.ID_Bearbeitungsvermerk_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ID_Bearbeitungsvermerk_TypeClass#getWert()
	 * @see #getID_Bearbeitungsvermerk_TypeClass()
	 * @generated
	 */
	EAttribute getID_Bearbeitungsvermerk_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.Kennzahl_TypeClass <em>Kennzahl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kennzahl Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Kennzahl_TypeClass
	 * @generated
	 */
	EClass getKennzahl_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.BasisTypen.Kennzahl_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Kennzahl_TypeClass#getWert()
	 * @see #getKennzahl_TypeClass()
	 * @generated
	 */
	EAttribute getKennzahl_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.Oertlicher_Elementname_TypeClass <em>Oertlicher Elementname Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oertlicher Elementname Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Oertlicher_Elementname_TypeClass
	 * @generated
	 */
	EClass getOertlicher_Elementname_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.BasisTypen.Oertlicher_Elementname_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Oertlicher_Elementname_TypeClass#getWert()
	 * @see #getOertlicher_Elementname_TypeClass()
	 * @generated
	 */
	EAttribute getOertlicher_Elementname_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup <em>Pruefmerkmale Daten Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pruefmerkmale Daten Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup
	 * @generated
	 */
	EClass getPruefmerkmale_Daten_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getDatumAuslieferung <em>Datum Auslieferung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datum Auslieferung</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getDatumAuslieferung()
	 * @see #getPruefmerkmale_Daten_AttributeGroup()
	 * @generated
	 */
	EReference getPruefmerkmale_Daten_AttributeGroup_DatumAuslieferung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getPruefsumme <em>Pruefsumme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pruefsumme</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getPruefsumme()
	 * @see #getPruefmerkmale_Daten_AttributeGroup()
	 * @generated
	 */
	EReference getPruefmerkmale_Daten_AttributeGroup_Pruefsumme();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getPruefsummeArt <em>Pruefsumme Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pruefsumme Art</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getPruefsummeArt()
	 * @see #getPruefmerkmale_Daten_AttributeGroup()
	 * @generated
	 */
	EReference getPruefmerkmale_Daten_AttributeGroup_PruefsummeArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getVersionAuslieferung <em>Version Auslieferung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Auslieferung</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getVersionAuslieferung()
	 * @see #getPruefmerkmale_Daten_AttributeGroup()
	 * @generated
	 */
	EReference getPruefmerkmale_Daten_AttributeGroup_VersionAuslieferung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.Pruefsumme_Art_TypeClass <em>Pruefsumme Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pruefsumme Art Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Pruefsumme_Art_TypeClass
	 * @generated
	 */
	EClass getPruefsumme_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.BasisTypen.Pruefsumme_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Pruefsumme_Art_TypeClass#getWert()
	 * @see #getPruefsumme_Art_TypeClass()
	 * @generated
	 */
	EAttribute getPruefsumme_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.Pruefsumme_TypeClass <em>Pruefsumme Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pruefsumme Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Pruefsumme_TypeClass
	 * @generated
	 */
	EClass getPruefsumme_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.BasisTypen.Pruefsumme_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Pruefsumme_TypeClass#getWert()
	 * @see #getPruefsumme_TypeClass()
	 * @generated
	 */
	EAttribute getPruefsumme_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.Version_Auslieferung_TypeClass <em>Version Auslieferung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Auslieferung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Version_Auslieferung_TypeClass
	 * @generated
	 */
	EClass getVersion_Auslieferung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.BasisTypen.Version_Auslieferung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Version_Auslieferung_TypeClass#getWert()
	 * @see #getVersion_Auslieferung_TypeClass()
	 * @generated
	 */
	EAttribute getVersion_Auslieferung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.BasisTypen.Zeiger_TypeClass <em>Zeiger Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zeiger Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Zeiger_TypeClass
	 * @generated
	 */
	EClass getZeiger_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.BasisTypen.Zeiger_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.Zeiger_TypeClass#getWert()
	 * @see #getZeiger_TypeClass()
	 * @generated
	 */
	EAttribute getZeiger_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem <em>ENUM Anwendungssystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Anwendungssystem</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem
	 * @generated
	 */
	EEnum getENUMAnwendungssystem();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung <em>ENUM Ausrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Ausrichtung</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung
	 * @generated
	 */
	EEnum getENUMAusrichtung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg <em>ENUM Bremsweg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Bremsweg</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg
	 * @generated
	 */
	EEnum getENUMBremsweg();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom <em>ENUM Fahrstrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Fahrstrom</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom
	 * @generated
	 */
	EEnum getENUMFahrstrom();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts <em>ENUM Links Rechts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Links Rechts</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @generated
	 */
	EEnum getENUMLinksRechts();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMPruefsummeArt <em>ENUM Pruefsumme Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Pruefsumme Art</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMPruefsummeArt
	 * @generated
	 */
	EEnum getENUMPruefsummeArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich <em>ENUM Regionalbereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Regionalbereich</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich
	 * @generated
	 */
	EEnum getENUMRegionalbereich();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung <em>ENUM Wirkrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Wirkrichtung</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung
	 * @generated
	 */
	EEnum getENUMWirkrichtung();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem <em>Anwendungssystem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * System der Zugbeeinflussung bzw. -sicherung, mit dem ein bestimmter Streckenbereich ausgerüstet ist. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Anwendungssystem Type</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem"
	 *        extendedMetaData="name='TAnwendungssystem' baseType='ENUMAnwendungssystem'"
	 * @generated
	 */
	EDataType getAnwendungssystem_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung <em>Ausrichtung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ein Attribut diesen Typs wird verwendet, um die Ausrichtung eines Objekts in Bezug zur Topologierichtung anzuzeigen. Ein Attribut mit diesem Basistyp nimmt einen der ENUM-Werte \"gegen\", \"in\" und \"keine\" an.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Ausrichtung Type</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung"
	 *        extendedMetaData="name='TAusrichtung' baseType='ENUMAusrichtung'"
	 * @generated
	 */
	EDataType getAusrichtung_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Aussenanlage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Aussenanlage Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Aussenanlage' baseType='TText' pattern='.{1,36}'"
	 * @generated
	 */
	EDataType getBezeichnung_Aussenanlage_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Lageplan Kurz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Lageplan Kurz Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Lageplan_Kurz' baseType='TText' pattern='.{1,36}'"
	 * @generated
	 */
	EDataType getBezeichnung_Lageplan_Kurz_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Lageplan Lang Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Lageplan Lang Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Lageplan_Lang' baseType='TText' pattern='.{1,36}'"
	 * @generated
	 */
	EDataType getBezeichnung_Lageplan_Lang_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Tabelle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Tabelle Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Tabelle' baseType='TText' pattern='.{1,36}'"
	 * @generated
	 */
	EDataType getBezeichnung_Tabelle_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg <em>Bremsweg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bremsweg als Grundlage für die Dimensionierung der zugehörigen Strecke. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Bremsweg Type</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg"
	 *        extendedMetaData="name='TBremsweg' baseType='ENUMBremsweg'"
	 * @generated
	 */
	EDataType getBremsweg_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Dateiname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name einer Datei ohne Dateiformat bzw. -typ.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Dateiname Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TDateiname' baseType='TText' pattern='[^\\\\/?:\\*\\|\"&lt;&gt;]*'"
	 * @generated
	 */
	EDataType getDateiname_Type();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Datum Auslieferung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Datum, an dem die Binaerdatei vom Hersteller ausgeliefert wurde.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Datum Auslieferung Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='TDatum_Auslieferung' baseType='http://www.eclipse.org/emf/2003/XMLType#date'"
	 * @generated
	 */
	EDataType getDatum_Auslieferung_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem <em>ENUM Anwendungssystem Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Anwendungssystem Object</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem"
	 *        extendedMetaData="name='ENUMAnwendungssystem:Object' baseType='ENUMAnwendungssystem'"
	 * @generated
	 */
	EDataType getENUMAnwendungssystemObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung <em>ENUM Ausrichtung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Ausrichtung Object</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung"
	 *        extendedMetaData="name='ENUMAusrichtung:Object' baseType='ENUMAusrichtung'"
	 * @generated
	 */
	EDataType getENUMAusrichtungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg <em>ENUM Bremsweg Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Bremsweg Object</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg"
	 *        extendedMetaData="name='ENUMBremsweg:Object' baseType='ENUMBremsweg'"
	 * @generated
	 */
	EDataType getENUMBremswegObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom <em>ENUM Fahrstrom Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Fahrstrom Object</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom"
	 *        extendedMetaData="name='ENUMFahrstrom:Object' baseType='ENUMFahrstrom'"
	 * @generated
	 */
	EDataType getENUMFahrstromObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts <em>ENUM Links Rechts Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Links Rechts Object</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts"
	 *        extendedMetaData="name='ENUMLinksRechts:Object' baseType='ENUMLinksRechts'"
	 * @generated
	 */
	EDataType getENUMLinksRechtsObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMPruefsummeArt <em>ENUM Pruefsumme Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Pruefsumme Art Object</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMPruefsummeArt
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMPruefsummeArt"
	 *        extendedMetaData="name='ENUMPruefsumme_Art:Object' baseType='ENUMPruefsumme_Art'"
	 * @generated
	 */
	EDataType getENUMPruefsummeArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich <em>ENUM Regionalbereich Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Regionalbereich Object</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich"
	 *        extendedMetaData="name='ENUMRegionalbereich:Object' baseType='ENUMRegionalbereich'"
	 * @generated
	 */
	EDataType getENUMRegionalbereichObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung <em>ENUM Wirkrichtung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Wirkrichtung Object</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung"
	 *        extendedMetaData="name='ENUMWirkrichtung:Object' baseType='ENUMWirkrichtung'"
	 * @generated
	 */
	EDataType getENUMWirkrichtungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom <em>Fahrstrom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Art der Fahrstromversorgung (Stromart, Spannung, besondere Zuführung)
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Fahrstrom Type</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom"
	 *        extendedMetaData="name='TFahrstrom' baseType='ENUMFahrstrom'"
	 * @generated
	 */
	EDataType getFahrstrom_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Frei Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Beschränkt die Befüllung auf Fließtext inkl. Zahlen, Leerzeichen und Sonderzeichen aus den Zeichenvorat von UTF-8. Die Länge des Fließtextes ist unbeschränkt.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Frei Text Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TFreiText' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getFreiText_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Geschwindigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Von xs:integer abgeleitet mit der Bedeutung einer Geschwindigkeit in Kilometer pro Stunde (km/h) mit dem Wertebereich von 0 bis 500. Geschwindigkeitsangaben werden derzeit beispielsweise verwendet bei: Block Strecke, Gleis Abschnitt, W Kr Gsp Komponente.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Geschwindigkeit Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TGeschwindigkeit' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='0|[1-9][0-9]{0,1}|[1-4][0-9]{2}|500'"
	 * @generated
	 */
	EDataType getGeschwindigkeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>GUID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Beschränkt die Befüllung auf eine 32-stellige GUID in der Form 8-4-4-4-12 Zeichen unter Verwendung der Zahlen 0-9 und der Groß- und Kleinbuchstaben A-F/a-f.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>GUID Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TGUID' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}'"
	 * @generated
	 */
	EDataType getGUID_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hersteller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unternehmen, das die Funktionsfähigkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im Rücklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme gültige Firmierung zu verwenden. 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Hersteller Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='THersteller' baseType='TText'"
	 * @generated
	 */
	EDataType getHersteller_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Kennzahl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Eindeutige Kennzahl der operativen Sicherungstechnik innerhalb eines Bedienbezirks für eine Betriebsstelle.
     * 
     * Die ESTW-Kennzahl kennzeichnet eine Betriebsstelle oder einen Betriebsstellenteil. Es handelt sich nicht um die Bahnhofsnummer der Zugnummernmeldeanlage (Ril 819.0731)!
     * 
     * Eine Betriebsstelle kann mehrere Kennzahlen erhalten. Z.B. dann, wenn in einem Gebäude zwei ESTW-Zentraleinheiten untergebracht sind (Beispiel Hannover Hbf mit den ESTW-Zentraleinheiten \"HH Kennzahl 06\" und \"HHZX Kennzahl 30\").
     * 
     * Eine Kennzahl kann aber auch mehrere Betriebsstellen beinhalten. Z. B dann, wenn eine ESTW-Zentraleinheit zwei Überleitstellen steuert (Beispiel ESTW-Zentraleinheit Giften HGIF Kennzahl 71 mit \"Üst Giften HGIF\" und \"Üst Ritterkamp HRIT\".
     * 
     * In Stellbereichen von Bedienbezirken werden für Betriebsstellen (z. B. Bahnhöfe, Abzweigstellen, Anschlussstellen) Kennzahlen von 01 bis 99 vergeben. Diese Kennzahl muss im Bedienbezirk eindeutig sein.
     * 
     * Eindeutigkeit der Kennzahlen bei angrenzenden Bedienbezirken entlang einer Strecke:
     * 
     * Innerhalb eines Bedienbezirks und für benachbarte Betriebsstellen eines angrenzenden Bedienbezirks entlang einer Strecke darf eine Kennzahl nur einmal verwendet werden. Beispiel: Media:Bedien Oertlichkeit Kennzahl 131121.pdf
     * 
     * Für alle im jeweiligen Bereich befindlichen Stellelemente der Betriebsstellen und Strecken wird die Kennzahl Bestandteil der ausführlichen Elementbezeichnung. Hierdurch erübrigt sich in einem größeren Bereich der Infrastruktur die Mitführung eines Ortsbezeichners.
     * 
     * Zentrale Vergabe von Kennzahlen auch ohne Anbindung an Bedien_Zentralen:
     * 
     * Unabnhängig ob eine ESTW-Zentraleinheit aus einer Bedien_Zentrale gesteuert wird oder nur örtlich eingerichtet ist, soll die Kennzahlenvergabe zentral im Sinne einer möglichen Konzentration von ESTW-Zentraleinheiten in Bedienbezirken geplant und vergeben werden. 
     * 
     * DB-Regelwerk
     * • Kennzahltabelle oder Kennzahelnübersichtsplan im PT 1, 
     * • 819.0603 2, 
     * • 819.9001 1 (5).
     * 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Kennzahl Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TKennzahl' baseType='TZeichenkette' pattern='0[1-9]|[1-9][0-9]'"
	 * @generated
	 */
	EDataType getKennzahl_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Kilometrierung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Beschränkt die Befüllung auf einen String mit der Bedeutung eines kilometrischen Wertes in Kilometer (km).
     * 
     * Die Kilometrierung bildet sich aus: 
     * ¦ einem optionalen negativen Vorzeichen, 
     * ¦ der Ziffer 0 oder einer ein- bis dreistelligen Zahl ohne führende Nullen, 
     * ¦ einem Komma, 
     * 
     * dann entweder 
     * ¦ eine dreistellige Nachkommazahl, 
     * 
     * oder bei der Angabe von Mehr- oder Minderlängen 
     * ¦ ein Vorzeichen + oder - und 
     * ¦ eine bis zu fünfstellige Zahl ohne führende Nullen.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Kilometrierung Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TKilometrierung' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='-?(([1-9][0-9]{0,2})|0),([0-9]{3}|([0-9][\\+\\-][1-9][0-9]{0,4}))'"
	 * @generated
	 */
	EDataType getKilometrierung_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts <em>Links Rechts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Attribute dieses Basistyps können den ENUM-Wert \"links\" oder \"rechts\" annehmen.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Links Rechts Type</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts"
	 *        extendedMetaData="name='TLinksRechts' baseType='ENUMLinksRechts'"
	 * @generated
	 */
	EDataType getLinksRechts_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Meter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Von xs:decimal abgeleiteter Basistyp zur Angabe von Werten mit der Einheit Meter.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Meter Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TMeter' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal'"
	 * @generated
	 */
	EDataType getMeter_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Objektname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Der Typ wird im Modell verwendet, um GUID-Zeiger auf ein spezifisches Ziel-LST-Objekt zu konfigurieren.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Objektname Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TObjektname' baseType='TText'"
	 * @generated
	 */
	EDataType getObjektname_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oertlicher Elementname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kurzbezeichnung eines Elements. Der örtliche Elementbezeichner ist Bestandteil des Elementnamens und wird elementspezifisch gebildet. Bei Lichtsperrsignalen und anderen Elementen mit Richtungsbuchstaben (X, Y) kann dieser nicht immer eindeutig und automatisch aus einem Richtungsattribut abgeleitet werden. Er ist in jedem Fall vom Planer zu bestimmen und als Bestandteil des örtlichen Elementbezeichners abzuspeichern. Der örtliche Elementbezeichner wird üblicherweise im Lageplan verwendet. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk 819.0603 (Stellwerkseinrichtungen - Bedienoberflächen), 819.9001 (Symbolbezeichnungen sicherungstechnischer Pläne).
     * 
     * 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oertlicher Elementname Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TOertlicher_Elementname' baseType='TZeichenkette' pattern='.{1,6}'"
	 * @generated
	 */
	EDataType getOertlicher_Elementname_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich <em>Regionalbereich Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Regionalbereich der DB Netz AG, dem die Anlage zugewiesen ist.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Regionalbereich Type</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich"
	 *        extendedMetaData="name='TRegionalbereich' baseType='ENUMRegionalbereich'"
	 * @generated
	 */
	EDataType getRegionalbereich_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Sekunde Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Von xs:decimal abgeleiteter Basistyp zur Angabe von Werten mit der Einheit Sekunde im Format sssss[.zh] (s: Sekunde, z: Zehntel, h: Hundertstel).
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Sekunde Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TSekunde' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='[0-9]{1,5}(\\.[0-9]{2})?'"
	 * @generated
	 */
	EDataType getSekunde_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Beschränkt die Befüllung auf Fließtext inkl. Zahlen, Leerzeichen und Sonderzeichen aus den Zeichenvorat von UTF-8, wobei die Länge auf [1..250] Zeichen festgelegt ist.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Text Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TText' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='.{1,250}'"
	 * @generated
	 */
	EDataType getText_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Auslieferung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Version der Auslieferung vom Hersteller.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Version Auslieferung Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TVersion_Auslieferung' baseType='TText'"
	 * @generated
	 */
	EDataType getVersion_Auslieferung_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung <em>Wirkrichtung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ein Attribut diesen Typs wird verwendet, um die Wirkrichtung eines Objekts in Bezug zur Topologierichtung anzuzeigen. Ein Attribut mit diesem Basistyp nimmt einen der ENUM-Werte 'beide', 'gegen' und 'in' an.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Wirkrichtung Type</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung"
	 *        extendedMetaData="name='TWirkrichtung' baseType='ENUMWirkrichtung'"
	 * @generated
	 */
	EDataType getWirkrichtung_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Zeichenkette Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Beschränkt die Befüllung auf alphanumerische Zeichen und Unterstrich, wobei die Länge auf [1..250] Zeichen festgelegt ist.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Zeichenkette Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TZeichenkette' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[a-zA-Z_0-9]{1,250}'"
	 * @generated
	 */
	EDataType getZeichenkette_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasisTypenFactory getBasisTypenFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.BasisAttribut_AttributeGroupImpl <em>Basis Attribut Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisAttribut_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBasisAttribut_AttributeGroup()
		 * @generated
		 */
		EClass BASIS_ATTRIBUT_ATTRIBUTE_GROUP = eINSTANCE.getBasisAttribut_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK = eINSTANCE.getBasisAttribut_AttributeGroup_IDBearbeitungsvermerk();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Aussenanlage_TypeClassImpl <em>Bezeichnung Aussenanlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Aussenanlage_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Aussenanlage_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_AUSSENANLAGE_TYPE_CLASS = eINSTANCE.getBezeichnung_Aussenanlage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_AUSSENANLAGE_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Aussenanlage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Element_AttributeGroupImpl <em>Bezeichnung Element Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Element_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Element_AttributeGroup()
		 * @generated
		 */
		EClass BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP = eINSTANCE.getBezeichnung_Element_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Aussenanlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_AUSSENANLAGE = eINSTANCE.getBezeichnung_Element_AttributeGroup_BezeichnungAussenanlage();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Lageplan Kurz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_KURZ = eINSTANCE.getBezeichnung_Element_AttributeGroup_BezeichnungLageplanKurz();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Lageplan Lang</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_LANG = eINSTANCE.getBezeichnung_Element_AttributeGroup_BezeichnungLageplanLang();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Tabelle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_TABELLE = eINSTANCE.getBezeichnung_Element_AttributeGroup_BezeichnungTabelle();

		/**
		 * The meta object literal for the '<em><b>Kennzahl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__KENNZAHL = eINSTANCE.getBezeichnung_Element_AttributeGroup_Kennzahl();

		/**
		 * The meta object literal for the '<em><b>Oertlicher Elementname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__OERTLICHER_ELEMENTNAME = eINSTANCE.getBezeichnung_Element_AttributeGroup_OertlicherElementname();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Lageplan_Kurz_TypeClassImpl <em>Bezeichnung Lageplan Kurz Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Lageplan_Kurz_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Lageplan_Kurz_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_LAGEPLAN_KURZ_TYPE_CLASS = eINSTANCE.getBezeichnung_Lageplan_Kurz_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_LAGEPLAN_KURZ_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Lageplan_Kurz_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Lageplan_Lang_TypeClassImpl <em>Bezeichnung Lageplan Lang Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Lageplan_Lang_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Lageplan_Lang_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_LAGEPLAN_LANG_TYPE_CLASS = eINSTANCE.getBezeichnung_Lageplan_Lang_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_LAGEPLAN_LANG_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Lageplan_Lang_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Tabelle_TypeClassImpl <em>Bezeichnung Tabelle Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Bezeichnung_Tabelle_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Tabelle_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_TABELLE_TYPE_CLASS = eINSTANCE.getBezeichnung_Tabelle_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_TABELLE_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Tabelle_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Datum_Auslieferung_TypeClassImpl <em>Datum Auslieferung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Datum_Auslieferung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getDatum_Auslieferung_TypeClass()
		 * @generated
		 */
		EClass DATUM_AUSLIEFERUNG_TYPE_CLASS = eINSTANCE.getDatum_Auslieferung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATUM_AUSLIEFERUNG_TYPE_CLASS__WERT = eINSTANCE.getDatum_Auslieferung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.ID_Bearbeitungsvermerk_TypeClassImpl <em>ID Bearbeitungsvermerk Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.ID_Bearbeitungsvermerk_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getID_Bearbeitungsvermerk_TypeClass()
		 * @generated
		 */
		EClass ID_BEARBEITUNGSVERMERK_TYPE_CLASS = eINSTANCE.getID_Bearbeitungsvermerk_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BEARBEITUNGSVERMERK_TYPE_CLASS__WERT = eINSTANCE.getID_Bearbeitungsvermerk_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Kennzahl_TypeClassImpl <em>Kennzahl Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Kennzahl_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getKennzahl_TypeClass()
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
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Oertlicher_Elementname_TypeClassImpl <em>Oertlicher Elementname Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Oertlicher_Elementname_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getOertlicher_Elementname_TypeClass()
		 * @generated
		 */
		EClass OERTLICHER_ELEMENTNAME_TYPE_CLASS = eINSTANCE.getOertlicher_Elementname_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OERTLICHER_ELEMENTNAME_TYPE_CLASS__WERT = eINSTANCE.getOertlicher_Elementname_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Pruefmerkmale_Daten_AttributeGroupImpl <em>Pruefmerkmale Daten Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Pruefmerkmale_Daten_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getPruefmerkmale_Daten_AttributeGroup()
		 * @generated
		 */
		EClass PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP = eINSTANCE.getPruefmerkmale_Daten_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Datum Auslieferung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__DATUM_AUSLIEFERUNG = eINSTANCE.getPruefmerkmale_Daten_AttributeGroup_DatumAuslieferung();

		/**
		 * The meta object literal for the '<em><b>Pruefsumme</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME = eINSTANCE.getPruefmerkmale_Daten_AttributeGroup_Pruefsumme();

		/**
		 * The meta object literal for the '<em><b>Pruefsumme Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME_ART = eINSTANCE.getPruefmerkmale_Daten_AttributeGroup_PruefsummeArt();

		/**
		 * The meta object literal for the '<em><b>Version Auslieferung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__VERSION_AUSLIEFERUNG = eINSTANCE.getPruefmerkmale_Daten_AttributeGroup_VersionAuslieferung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Pruefsumme_Art_TypeClassImpl <em>Pruefsumme Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Pruefsumme_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getPruefsumme_Art_TypeClass()
		 * @generated
		 */
		EClass PRUEFSUMME_ART_TYPE_CLASS = eINSTANCE.getPruefsumme_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRUEFSUMME_ART_TYPE_CLASS__WERT = eINSTANCE.getPruefsumme_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Pruefsumme_TypeClassImpl <em>Pruefsumme Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Pruefsumme_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getPruefsumme_TypeClass()
		 * @generated
		 */
		EClass PRUEFSUMME_TYPE_CLASS = eINSTANCE.getPruefsumme_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRUEFSUMME_TYPE_CLASS__WERT = eINSTANCE.getPruefsumme_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Version_Auslieferung_TypeClassImpl <em>Version Auslieferung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Version_Auslieferung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getVersion_Auslieferung_TypeClass()
		 * @generated
		 */
		EClass VERSION_AUSLIEFERUNG_TYPE_CLASS = eINSTANCE.getVersion_Auslieferung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_AUSLIEFERUNG_TYPE_CLASS__WERT = eINSTANCE.getVersion_Auslieferung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.impl.Zeiger_TypeClassImpl <em>Zeiger Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.Zeiger_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getZeiger_TypeClass()
		 * @generated
		 */
		EClass ZEIGER_TYPE_CLASS = eINSTANCE.getZeiger_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZEIGER_TYPE_CLASS__WERT = eINSTANCE.getZeiger_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem <em>ENUM Anwendungssystem</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMAnwendungssystem()
		 * @generated
		 */
		EEnum ENUM_ANWENDUNGSSYSTEM = eINSTANCE.getENUMAnwendungssystem();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung <em>ENUM Ausrichtung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMAusrichtung()
		 * @generated
		 */
		EEnum ENUM_AUSRICHTUNG = eINSTANCE.getENUMAusrichtung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg <em>ENUM Bremsweg</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMBremsweg()
		 * @generated
		 */
		EEnum ENUM_BREMSWEG = eINSTANCE.getENUMBremsweg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom <em>ENUM Fahrstrom</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMFahrstrom()
		 * @generated
		 */
		EEnum ENUM_FAHRSTROM = eINSTANCE.getENUMFahrstrom();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts <em>ENUM Links Rechts</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMLinksRechts()
		 * @generated
		 */
		EEnum ENUM_LINKS_RECHTS = eINSTANCE.getENUMLinksRechts();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMPruefsummeArt <em>ENUM Pruefsumme Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMPruefsummeArt
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMPruefsummeArt()
		 * @generated
		 */
		EEnum ENUM_PRUEFSUMME_ART = eINSTANCE.getENUMPruefsummeArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich <em>ENUM Regionalbereich</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMRegionalbereich()
		 * @generated
		 */
		EEnum ENUM_REGIONALBEREICH = eINSTANCE.getENUMRegionalbereich();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung <em>ENUM Wirkrichtung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMWirkrichtung()
		 * @generated
		 */
		EEnum ENUM_WIRKRICHTUNG = eINSTANCE.getENUMWirkrichtung();

		/**
		 * The meta object literal for the '<em>Anwendungssystem Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getAnwendungssystem_Type()
		 * @generated
		 */
		EDataType ANWENDUNGSSYSTEM_TYPE = eINSTANCE.getAnwendungssystem_Type();

		/**
		 * The meta object literal for the '<em>Ausrichtung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getAusrichtung_Type()
		 * @generated
		 */
		EDataType AUSRICHTUNG_TYPE = eINSTANCE.getAusrichtung_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung Aussenanlage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Aussenanlage_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_AUSSENANLAGE_TYPE = eINSTANCE.getBezeichnung_Aussenanlage_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung Lageplan Kurz Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Lageplan_Kurz_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_LAGEPLAN_KURZ_TYPE = eINSTANCE.getBezeichnung_Lageplan_Kurz_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung Lageplan Lang Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Lageplan_Lang_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_LAGEPLAN_LANG_TYPE = eINSTANCE.getBezeichnung_Lageplan_Lang_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung Tabelle Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBezeichnung_Tabelle_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_TABELLE_TYPE = eINSTANCE.getBezeichnung_Tabelle_Type();

		/**
		 * The meta object literal for the '<em>Bremsweg Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getBremsweg_Type()
		 * @generated
		 */
		EDataType BREMSWEG_TYPE = eINSTANCE.getBremsweg_Type();

		/**
		 * The meta object literal for the '<em>Dateiname Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getDateiname_Type()
		 * @generated
		 */
		EDataType DATEINAME_TYPE = eINSTANCE.getDateiname_Type();

		/**
		 * The meta object literal for the '<em>Datum Auslieferung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getDatum_Auslieferung_Type()
		 * @generated
		 */
		EDataType DATUM_AUSLIEFERUNG_TYPE = eINSTANCE.getDatum_Auslieferung_Type();

		/**
		 * The meta object literal for the '<em>ENUM Anwendungssystem Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMAnwendungssystemObject()
		 * @generated
		 */
		EDataType ENUM_ANWENDUNGSSYSTEM_OBJECT = eINSTANCE.getENUMAnwendungssystemObject();

		/**
		 * The meta object literal for the '<em>ENUM Ausrichtung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMAusrichtungObject()
		 * @generated
		 */
		EDataType ENUM_AUSRICHTUNG_OBJECT = eINSTANCE.getENUMAusrichtungObject();

		/**
		 * The meta object literal for the '<em>ENUM Bremsweg Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMBremswegObject()
		 * @generated
		 */
		EDataType ENUM_BREMSWEG_OBJECT = eINSTANCE.getENUMBremswegObject();

		/**
		 * The meta object literal for the '<em>ENUM Fahrstrom Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMFahrstromObject()
		 * @generated
		 */
		EDataType ENUM_FAHRSTROM_OBJECT = eINSTANCE.getENUMFahrstromObject();

		/**
		 * The meta object literal for the '<em>ENUM Links Rechts Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMLinksRechtsObject()
		 * @generated
		 */
		EDataType ENUM_LINKS_RECHTS_OBJECT = eINSTANCE.getENUMLinksRechtsObject();

		/**
		 * The meta object literal for the '<em>ENUM Pruefsumme Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMPruefsummeArt
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMPruefsummeArtObject()
		 * @generated
		 */
		EDataType ENUM_PRUEFSUMME_ART_OBJECT = eINSTANCE.getENUMPruefsummeArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Regionalbereich Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMRegionalbereichObject()
		 * @generated
		 */
		EDataType ENUM_REGIONALBEREICH_OBJECT = eINSTANCE.getENUMRegionalbereichObject();

		/**
		 * The meta object literal for the '<em>ENUM Wirkrichtung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getENUMWirkrichtungObject()
		 * @generated
		 */
		EDataType ENUM_WIRKRICHTUNG_OBJECT = eINSTANCE.getENUMWirkrichtungObject();

		/**
		 * The meta object literal for the '<em>Fahrstrom Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getFahrstrom_Type()
		 * @generated
		 */
		EDataType FAHRSTROM_TYPE = eINSTANCE.getFahrstrom_Type();

		/**
		 * The meta object literal for the '<em>Frei Text Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getFreiText_Type()
		 * @generated
		 */
		EDataType FREI_TEXT_TYPE = eINSTANCE.getFreiText_Type();

		/**
		 * The meta object literal for the '<em>Geschwindigkeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getGeschwindigkeit_Type()
		 * @generated
		 */
		EDataType GESCHWINDIGKEIT_TYPE = eINSTANCE.getGeschwindigkeit_Type();

		/**
		 * The meta object literal for the '<em>GUID Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getGUID_Type()
		 * @generated
		 */
		EDataType GUID_TYPE = eINSTANCE.getGUID_Type();

		/**
		 * The meta object literal for the '<em>Hersteller Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getHersteller_Type()
		 * @generated
		 */
		EDataType HERSTELLER_TYPE = eINSTANCE.getHersteller_Type();

		/**
		 * The meta object literal for the '<em>Kennzahl Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getKennzahl_Type()
		 * @generated
		 */
		EDataType KENNZAHL_TYPE = eINSTANCE.getKennzahl_Type();

		/**
		 * The meta object literal for the '<em>Kilometrierung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getKilometrierung_Type()
		 * @generated
		 */
		EDataType KILOMETRIERUNG_TYPE = eINSTANCE.getKilometrierung_Type();

		/**
		 * The meta object literal for the '<em>Links Rechts Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getLinksRechts_Type()
		 * @generated
		 */
		EDataType LINKS_RECHTS_TYPE = eINSTANCE.getLinksRechts_Type();

		/**
		 * The meta object literal for the '<em>Meter Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getMeter_Type()
		 * @generated
		 */
		EDataType METER_TYPE = eINSTANCE.getMeter_Type();

		/**
		 * The meta object literal for the '<em>Objektname Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getObjektname_Type()
		 * @generated
		 */
		EDataType OBJEKTNAME_TYPE = eINSTANCE.getObjektname_Type();

		/**
		 * The meta object literal for the '<em>Oertlicher Elementname Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getOertlicher_Elementname_Type()
		 * @generated
		 */
		EDataType OERTLICHER_ELEMENTNAME_TYPE = eINSTANCE.getOertlicher_Elementname_Type();

		/**
		 * The meta object literal for the '<em>Regionalbereich Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getRegionalbereich_Type()
		 * @generated
		 */
		EDataType REGIONALBEREICH_TYPE = eINSTANCE.getRegionalbereich_Type();

		/**
		 * The meta object literal for the '<em>Sekunde Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getSekunde_Type()
		 * @generated
		 */
		EDataType SEKUNDE_TYPE = eINSTANCE.getSekunde_Type();

		/**
		 * The meta object literal for the '<em>Text Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getText_Type()
		 * @generated
		 */
		EDataType TEXT_TYPE = eINSTANCE.getText_Type();

		/**
		 * The meta object literal for the '<em>Version Auslieferung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getVersion_Auslieferung_Type()
		 * @generated
		 */
		EDataType VERSION_AUSLIEFERUNG_TYPE = eINSTANCE.getVersion_Auslieferung_Type();

		/**
		 * The meta object literal for the '<em>Wirkrichtung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getWirkrichtung_Type()
		 * @generated
		 */
		EDataType WIRKRICHTUNG_TYPE = eINSTANCE.getWirkrichtung_Type();

		/**
		 * The meta object literal for the '<em>Zeichenkette Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl#getZeichenkette_Type()
		 * @generated
		 */
		EDataType ZEICHENKETTE_TYPE = eINSTANCE.getZeichenkette_Type();

	}

} //BasisTypenPackage
