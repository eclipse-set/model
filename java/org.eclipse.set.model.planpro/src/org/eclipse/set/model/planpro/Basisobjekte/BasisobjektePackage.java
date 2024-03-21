/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjekteFactory
 * @model kind="package"
 * @generated
 */
public interface BasisobjektePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Basisobjekte";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Basisobjekte/1.10.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsBasisobjekte";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasisobjektePackage eINSTANCE = org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Abstand_TypeClassImpl <em>Abstand Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Abstand_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getAbstand_TypeClass()
	 * @generated
	 */
	int ABSTAND_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTAND_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTAND_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstand Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTAND_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Ur_ObjektImpl <em>Ur Objekt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Ur_ObjektImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getUr_Objekt()
	 * @generated
	 */
	int UR_OBJEKT = 47;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_OBJEKT__IDENTITAET = 0;

	/**
	 * The number of structural features of the '<em>Ur Objekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_OBJEKT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.AnhangImpl <em>Anhang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.AnhangImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getAnhang()
	 * @generated
	 */
	int ANHANG = 1;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANHANG__IDENTITAET = UR_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Anhang Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANHANG__ANHANG_ALLG = UR_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anhang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANHANG_FEATURE_COUNT = UR_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Anhang_Allg_AttributeGroupImpl <em>Anhang Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Anhang_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getAnhang_Allg_AttributeGroup()
	 * @generated
	 */
	int ANHANG_ALLG_ATTRIBUTE_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Anhang Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANHANG_ALLG_ATTRIBUTE_GROUP__ANHANG_ART = 0;

	/**
	 * The feature id for the '<em><b>Dateiname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANHANG_ALLG_ATTRIBUTE_GROUP__DATEINAME = 1;

	/**
	 * The feature id for the '<em><b>Dateityp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANHANG_ALLG_ATTRIBUTE_GROUP__DATEITYP = 2;

	/**
	 * The number of structural features of the '<em>Anhang Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANHANG_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Anhang_Art_TypeClassImpl <em>Anhang Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Anhang_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getAnhang_Art_TypeClass()
	 * @generated
	 */
	int ANHANG_ART_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANHANG_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANHANG_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anhang Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANHANG_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl <em>Basis Objekt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBasis_Objekt()
	 * @generated
	 */
	int BASIS_OBJEKT = 4;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_OBJEKT__IDENTITAET = UR_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_OBJEKT__BASIS_OBJEKT_ALLG = UR_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK = UR_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE = UR_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_OBJEKT__OBJEKTREFERENZEN = UR_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Basis Objekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_OBJEKT_FEATURE_COUNT = UR_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_Objekt_Allg_AttributeGroupImpl <em>Basis Objekt Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_Objekt_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBasis_Objekt_Allg_AttributeGroup()
	 * @generated
	 */
	int BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Bestandsschutz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ = 0;

	/**
	 * The feature id for the '<em><b>Objektzustand Besonders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS = 1;

	/**
	 * The feature id for the '<em><b>Datum Regelwerk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK = 2;

	/**
	 * The feature id for the '<em><b>ID Anhang Regelwerk Besonders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__ID_ANHANG_REGELWERK_BESONDERS = 3;

	/**
	 * The number of structural features of the '<em>Basis Objekt Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.BearbeitungsvermerkImpl <em>Bearbeitungsvermerk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BearbeitungsvermerkImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBearbeitungsvermerk()
	 * @generated
	 */
	int BEARBEITUNGSVERMERK = 6;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK__IDENTITAET = UR_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Bearbeitungsvermerk Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG = UR_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Anhang</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK__ID_ANHANG = UR_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bearbeitungsvermerk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK_FEATURE_COUNT = UR_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl <em>Bearbeitungsvermerk Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBearbeitungsvermerk_Allg_AttributeGroup()
	 * @generated
	 */
	int BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Bearbeitungsvermerk Rolle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE = 0;

	/**
	 * The feature id for the '<em><b>Bestandsrelevanz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ = 1;

	/**
	 * The feature id for the '<em><b>BV Darstellung In Plan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_DARSTELLUNG_IN_PLAN = 2;

	/**
	 * The feature id for the '<em><b>BV Kategorie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_KATEGORIE = 3;

	/**
	 * The feature id for the '<em><b>Kommentar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KOMMENTAR = 4;

	/**
	 * The feature id for the '<em><b>Kurztext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KURZTEXT = 5;

	/**
	 * The feature id for the '<em><b>Zeit Bearbeitungsvermerk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__ZEIT_BEARBEITUNGSVERMERK = 6;

	/**
	 * The number of structural features of the '<em>Bearbeitungsvermerk Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Rolle_TypeClassImpl <em>Bearbeitungsvermerk Rolle Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Rolle_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBearbeitungsvermerk_Rolle_TypeClass()
	 * @generated
	 */
	int BEARBEITUNGSVERMERK_ROLLE_TYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK_ROLLE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK_ROLLE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bearbeitungsvermerk Rolle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNGSVERMERK_ROLLE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Begrenzung_A_TypeClassImpl <em>Begrenzung AType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Begrenzung_A_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBegrenzung_A_TypeClass()
	 * @generated
	 */
	int BEGRENZUNG_ATYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGRENZUNG_ATYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGRENZUNG_ATYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Begrenzung AType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGRENZUNG_ATYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Begrenzung_B_TypeClassImpl <em>Begrenzung BType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Begrenzung_B_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBegrenzung_B_TypeClass()
	 * @generated
	 */
	int BEGRENZUNG_BTYPE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGRENZUNG_BTYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGRENZUNG_BTYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Begrenzung BType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGRENZUNG_BTYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_ObjektImpl <em>Bereich Objekt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_ObjektImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBereich_Objekt()
	 * @generated
	 */
	int BEREICH_OBJEKT = 11;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEREICH_OBJEKT__IDENTITAET = BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEREICH_OBJEKT__BASIS_OBJEKT_ALLG = BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK = BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEREICH_OBJEKT__ID_OERTLICHKEIT_AUSGABE = BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEREICH_OBJEKT__OBJEKTREFERENZEN = BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH = BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bereich Objekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEREICH_OBJEKT_FEATURE_COUNT = BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_Objekt_Teilbereich_AttributeGroupImpl <em>Bereich Objekt Teilbereich Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_Objekt_Teilbereich_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBereich_Objekt_Teilbereich_AttributeGroup()
	 * @generated
	 */
	int BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Begrenzung A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_A = 0;

	/**
	 * The feature id for the '<em><b>Begrenzung B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_B = 1;

	/**
	 * The feature id for the '<em><b>IDTOP Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__IDTOP_KANTE = 2;

	/**
	 * The feature id for the '<em><b>Richtungsbezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__RICHTUNGSBEZUG = 3;

	/**
	 * The number of structural features of the '<em>Bereich Objekt Teilbereich Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Beschreibung_TypeClassImpl <em>Beschreibung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Beschreibung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBeschreibung_TypeClass()
	 * @generated
	 */
	int BESCHREIBUNG_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESCHREIBUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESCHREIBUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Beschreibung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESCHREIBUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bestandsrelevanz_TypeClassImpl <em>Bestandsrelevanz Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Bestandsrelevanz_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBestandsrelevanz_TypeClass()
	 * @generated
	 */
	int BESTANDSRELEVANZ_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTANDSRELEVANZ_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTANDSRELEVANZ_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bestandsrelevanz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTANDSRELEVANZ_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bestandsschutz_TypeClassImpl <em>Bestandsschutz Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Bestandsschutz_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBestandsschutz_TypeClass()
	 * @generated
	 */
	int BESTANDSSCHUTZ_TYPE_CLASS = 15;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTANDSSCHUTZ_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTANDSSCHUTZ_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bestandsschutz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTANDSSCHUTZ_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.BV_Darstellung_In_Plan_TypeClassImpl <em>BV Darstellung In Plan Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BV_Darstellung_In_Plan_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBV_Darstellung_In_Plan_TypeClass()
	 * @generated
	 */
	int BV_DARSTELLUNG_IN_PLAN_TYPE_CLASS = 16;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BV_DARSTELLUNG_IN_PLAN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BV_DARSTELLUNG_IN_PLAN_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BV Darstellung In Plan Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BV_DARSTELLUNG_IN_PLAN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.BV_Kategorie_TypeClassImpl <em>BV Kategorie Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BV_Kategorie_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBV_Kategorie_TypeClass()
	 * @generated
	 */
	int BV_KATEGORIE_TYPE_CLASS = 17;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BV_KATEGORIE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BV_KATEGORIE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BV Kategorie Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BV_KATEGORIE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Dateiname_TypeClassImpl <em>Dateiname Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Dateiname_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getDateiname_TypeClass()
	 * @generated
	 */
	int DATEINAME_TYPE_CLASS = 18;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEINAME_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEINAME_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dateiname Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEINAME_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Dateityp_TypeClassImpl <em>Dateityp Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Dateityp_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getDateityp_TypeClass()
	 * @generated
	 */
	int DATEITYP_TYPE_CLASS = 19;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEITYP_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEITYP_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dateityp Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEITYP_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Datum_Regelwerk_TypeClassImpl <em>Datum Regelwerk Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Datum_Regelwerk_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getDatum_Regelwerk_TypeClass()
	 * @generated
	 */
	int DATUM_REGELWERK_TYPE_CLASS = 20;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATUM_REGELWERK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATUM_REGELWERK_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datum Regelwerk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATUM_REGELWERK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.DB_GDI_Referenz_TypeClassImpl <em>DB GDI Referenz Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.DB_GDI_Referenz_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getDB_GDI_Referenz_TypeClass()
	 * @generated
	 */
	int DB_GDI_REFERENZ_TYPE_CLASS = 21;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_GDI_REFERENZ_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_GDI_REFERENZ_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DB GDI Referenz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_GDI_REFERENZ_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Identitaet_TypeClassImpl <em>Identitaet Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Identitaet_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getIdentitaet_TypeClass()
	 * @generated
	 */
	int IDENTITAET_TYPE_CLASS = 22;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITAET_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITAET_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identitaet Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITAET_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Km_Massgebend_TypeClassImpl <em>Km Massgebend Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Km_Massgebend_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getKm_Massgebend_TypeClass()
	 * @generated
	 */
	int KM_MASSGEBEND_TYPE_CLASS = 23;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM_MASSGEBEND_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM_MASSGEBEND_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Km Massgebend Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KM_MASSGEBEND_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Kommentar_TypeClassImpl <em>Kommentar Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Kommentar_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getKommentar_TypeClass()
	 * @generated
	 */
	int KOMMENTAR_TYPE_CLASS = 24;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMENTAR_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMENTAR_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kommentar Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMENTAR_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Kurztext_TypeClassImpl <em>Kurztext Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Kurztext_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getKurztext_TypeClass()
	 * @generated
	 */
	int KURZTEXT_TYPE_CLASS = 25;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KURZTEXT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KURZTEXT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kurztext Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KURZTEXT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LieferobjektImpl <em>Lieferobjekt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LieferobjektImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLieferobjekt()
	 * @generated
	 */
	int LIEFEROBJEKT = 26;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFEROBJEKT__IDENTITAET = BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFEROBJEKT__BASIS_OBJEKT_ALLG = BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFEROBJEKT__ID_BEARBEITUNGSVERMERK = BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFEROBJEKT__ID_OERTLICHKEIT_AUSGABE = BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFEROBJEKT__OBJEKTREFERENZEN = BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFEROBJEKT__BESCHREIBUNG = BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDGEO Punkt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFEROBJEKT__IDGEO_PUNKT = BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDLO Einbau</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFEROBJEKT__IDLO_EINBAU = BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>LO Ersatz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFEROBJEKT__LO_ERSATZ = BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>LO Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFEROBJEKT__LO_MATERIAL = BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lieferobjekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEFEROBJEKT_FEATURE_COUNT = BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Ausgabestand_TypeClassImpl <em>LO Ausgabestand Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Ausgabestand_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Ausgabestand_TypeClass()
	 * @generated
	 */
	int LO_AUSGABESTAND_TYPE_CLASS = 27;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_AUSGABESTAND_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_AUSGABESTAND_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LO Ausgabestand Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_AUSGABESTAND_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Datum_Herstellung_TypeClassImpl <em>LO Datum Herstellung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Datum_Herstellung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Datum_Herstellung_TypeClass()
	 * @generated
	 */
	int LO_DATUM_HERSTELLUNG_TYPE_CLASS = 28;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_DATUM_HERSTELLUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_DATUM_HERSTELLUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LO Datum Herstellung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_DATUM_HERSTELLUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_DB_Freigabe_TypeClassImpl <em>LO DB Freigabe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_DB_Freigabe_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_DB_Freigabe_TypeClass()
	 * @generated
	 */
	int LO_DB_FREIGABE_TYPE_CLASS = 29;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_DB_FREIGABE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_DB_FREIGABE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LO DB Freigabe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_DB_FREIGABE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_EMA_Nr_TypeClassImpl <em>LO EMA Nr Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_EMA_Nr_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_EMA_Nr_TypeClass()
	 * @generated
	 */
	int LO_EMA_NR_TYPE_CLASS = 30;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_EMA_NR_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_EMA_NR_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LO EMA Nr Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_EMA_NR_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Ersatz_TypeClassImpl <em>LO Ersatz Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Ersatz_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Ersatz_TypeClass()
	 * @generated
	 */
	int LO_ERSATZ_TYPE_CLASS = 31;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_ERSATZ_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_ERSATZ_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LO Ersatz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_ERSATZ_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Firmensachnummer_TypeClassImpl <em>LO Firmensachnummer Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Firmensachnummer_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Firmensachnummer_TypeClass()
	 * @generated
	 */
	int LO_FIRMENSACHNUMMER_TYPE_CLASS = 32;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_FIRMENSACHNUMMER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_FIRMENSACHNUMMER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LO Firmensachnummer Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_FIRMENSACHNUMMER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Material_AttributeGroupImpl <em>LO Material Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Material_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Material_AttributeGroup()
	 * @generated
	 */
	int LO_MATERIAL_ATTRIBUTE_GROUP = 33;

	/**
	 * The feature id for the '<em><b>LO Ausgabestand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND = 0;

	/**
	 * The feature id for the '<em><b>LO Datum Herstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG = 1;

	/**
	 * The feature id for the '<em><b>LODB Freigabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE = 2;

	/**
	 * The feature id for the '<em><b>LOEMA Nr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR = 3;

	/**
	 * The feature id for the '<em><b>LO Firmensachnummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER = 4;

	/**
	 * The feature id for the '<em><b>LO Seriennummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER = 5;

	/**
	 * The number of structural features of the '<em>LO Material Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_MATERIAL_ATTRIBUTE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Seriennummer_TypeClassImpl <em>LO Seriennummer Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Seriennummer_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Seriennummer_TypeClass()
	 * @generated
	 */
	int LO_SERIENNUMMER_TYPE_CLASS = 34;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_SERIENNUMMER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_SERIENNUMMER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LO Seriennummer Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_SERIENNUMMER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LST_Objekt_Art_TypeClassImpl <em>LST Objekt Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LST_Objekt_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLST_Objekt_Art_TypeClass()
	 * @generated
	 */
	int LST_OBJEKT_ART_TYPE_CLASS = 35;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LST_OBJEKT_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LST_OBJEKT_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LST Objekt Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LST_OBJEKT_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Objektreferenzen_AttributeGroupImpl <em>Objektreferenzen Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Objektreferenzen_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getObjektreferenzen_AttributeGroup()
	 * @generated
	 */
	int OBJEKTREFERENZEN_ATTRIBUTE_GROUP = 36;

	/**
	 * The feature id for the '<em><b>DBGDI Referenz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKTREFERENZEN_ATTRIBUTE_GROUP__DBGDI_REFERENZ = 0;

	/**
	 * The feature id for the '<em><b>Technischer Platz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKTREFERENZEN_ATTRIBUTE_GROUP__TECHNISCHER_PLATZ = 1;

	/**
	 * The number of structural features of the '<em>Objektreferenzen Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKTREFERENZEN_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Objektzustand_Besonders_TypeClassImpl <em>Objektzustand Besonders Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Objektzustand_Besonders_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getObjektzustand_Besonders_TypeClass()
	 * @generated
	 */
	int OBJEKTZUSTAND_BESONDERS_TYPE_CLASS = 37;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKTZUSTAND_BESONDERS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKTZUSTAND_BESONDERS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Objektzustand Besonders Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKTZUSTAND_BESONDERS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Proxy_ObjektImpl <em>Proxy Objekt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Proxy_ObjektImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getProxy_Objekt()
	 * @generated
	 */
	int PROXY_OBJEKT = 38;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OBJEKT__IDENTITAET = UR_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>LST Objekt Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OBJEKT__LST_OBJEKT_ART = UR_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proxy Objekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OBJEKT_FEATURE_COUNT = UR_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl <em>Punkt Objekt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getPunkt_Objekt()
	 * @generated
	 */
	int PUNKT_OBJEKT = 39;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT__IDENTITAET = BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT__BASIS_OBJEKT_ALLG = BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK = BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT__ID_OERTLICHKEIT_AUSGABE = BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT__OBJEKTREFERENZEN = BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE = BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE = BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Punkt Objekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT_FEATURE_COUNT = BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_Objekt_Strecke_AttributeGroupImpl <em>Punkt Objekt Strecke Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_Objekt_Strecke_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getPunkt_Objekt_Strecke_AttributeGroup()
	 * @generated
	 */
	int PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP = 40;

	/**
	 * The feature id for the '<em><b>ID Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__ID_STRECKE = 0;

	/**
	 * The feature id for the '<em><b>Km Massgebend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__KM_MASSGEBEND = 1;

	/**
	 * The feature id for the '<em><b>Strecke Km</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM = 2;

	/**
	 * The number of structural features of the '<em>Punkt Objekt Strecke Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_Objekt_TOP_Kante_AttributeGroupImpl <em>Punkt Objekt TOP Kante Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_Objekt_TOP_Kante_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getPunkt_Objekt_TOP_Kante_AttributeGroup()
	 * @generated
	 */
	int PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP = 41;

	/**
	 * The feature id for the '<em><b>Abstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND = 0;

	/**
	 * The feature id for the '<em><b>IDGEO Punkt Berechnet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDGEO_PUNKT_BERECHNET = 1;

	/**
	 * The feature id for the '<em><b>IDTOP Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDTOP_KANTE = 2;

	/**
	 * The feature id for the '<em><b>Wirkrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG = 3;

	/**
	 * The feature id for the '<em><b>Seitliche Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE = 4;

	/**
	 * The feature id for the '<em><b>Seitlicher Abstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND = 5;

	/**
	 * The number of structural features of the '<em>Punkt Objekt TOP Kante Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Richtungsbezug_TypeClassImpl <em>Richtungsbezug Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Richtungsbezug_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getRichtungsbezug_TypeClass()
	 * @generated
	 */
	int RICHTUNGSBEZUG_TYPE_CLASS = 42;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICHTUNGSBEZUG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICHTUNGSBEZUG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Richtungsbezug Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICHTUNGSBEZUG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Seitliche_Lage_TypeClassImpl <em>Seitliche Lage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Seitliche_Lage_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getSeitliche_Lage_TypeClass()
	 * @generated
	 */
	int SEITLICHE_LAGE_TYPE_CLASS = 43;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEITLICHE_LAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEITLICHE_LAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Seitliche Lage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEITLICHE_LAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Seitlicher_Abstand_TypeClassImpl <em>Seitlicher Abstand Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Seitlicher_Abstand_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getSeitlicher_Abstand_TypeClass()
	 * @generated
	 */
	int SEITLICHER_ABSTAND_TYPE_CLASS = 44;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEITLICHER_ABSTAND_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEITLICHER_ABSTAND_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Seitlicher Abstand Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEITLICHER_ABSTAND_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Strecke_Km_TypeClassImpl <em>Strecke Km Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Strecke_Km_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getStrecke_Km_TypeClass()
	 * @generated
	 */
	int STRECKE_KM_TYPE_CLASS = 45;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_KM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_KM_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strecke Km Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_KM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Technischer_Platz_TypeClassImpl <em>Technischer Platz Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Technischer_Platz_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getTechnischer_Platz_TypeClass()
	 * @generated
	 */
	int TECHNISCHER_PLATZ_TYPE_CLASS = 46;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_PLATZ_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_PLATZ_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Technischer Platz Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_PLATZ_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Wirkrichtung_TypeClassImpl <em>Wirkrichtung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Wirkrichtung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getWirkrichtung_TypeClass()
	 * @generated
	 */
	int WIRKRICHTUNG_TYPE_CLASS = 48;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRKRICHTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRKRICHTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wirkrichtung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRKRICHTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Zeit_Bearbeitungsvermerk_TypeClassImpl <em>Zeit Bearbeitungsvermerk Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Zeit_Bearbeitungsvermerk_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getZeit_Bearbeitungsvermerk_TypeClass()
	 * @generated
	 */
	int ZEIT_BEARBEITUNGSVERMERK_TYPE_CLASS = 49;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEIT_BEARBEITUNGSVERMERK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEIT_BEARBEITUNGSVERMERK_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zeit Bearbeitungsvermerk Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEIT_BEARBEITUNGSVERMERK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMAnhangArt <em>ENUM Anhang Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMAnhangArt
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMAnhangArt()
	 * @generated
	 */
	int ENUM_ANHANG_ART = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMBestandsrelevanz <em>ENUM Bestandsrelevanz</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMBestandsrelevanz
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMBestandsrelevanz()
	 * @generated
	 */
	int ENUM_BESTANDSRELEVANZ = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMBVDarstellungInPlan <em>ENUMBV Darstellung In Plan</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMBVDarstellungInPlan
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMBVDarstellungInPlan()
	 * @generated
	 */
	int ENUMBV_DARSTELLUNG_IN_PLAN = 52;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMDateityp <em>ENUM Dateityp</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMDateityp
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMDateityp()
	 * @generated
	 */
	int ENUM_DATEITYP = 53;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMLSTObjektArt <em>ENUMLST Objekt Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMLSTObjektArt
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMLSTObjektArt()
	 * @generated
	 */
	int ENUMLST_OBJEKT_ART = 54;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMObjektzustandBesonders <em>ENUM Objektzustand Besonders</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMObjektzustandBesonders
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMObjektzustandBesonders()
	 * @generated
	 */
	int ENUM_OBJEKTZUSTAND_BESONDERS = 55;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMRolle <em>ENUM Rolle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMRolle
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMRolle()
	 * @generated
	 */
	int ENUM_ROLLE = 56;

	/**
	 * The meta object id for the '<em>Abstand Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getAbstand_Type()
	 * @generated
	 */
	int ABSTAND_TYPE = 57;

	/**
	 * The meta object id for the '<em>Begrenzung AType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBegrenzung_A_Type()
	 * @generated
	 */
	int BEGRENZUNG_ATYPE = 58;

	/**
	 * The meta object id for the '<em>Begrenzung BType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBegrenzung_B_Type()
	 * @generated
	 */
	int BEGRENZUNG_BTYPE = 59;

	/**
	 * The meta object id for the '<em>Beschreibung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBeschreibung_Type()
	 * @generated
	 */
	int BESCHREIBUNG_TYPE = 60;

	/**
	 * The meta object id for the '<em>BV Kategorie Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBV_Kategorie_Type()
	 * @generated
	 */
	int BV_KATEGORIE_TYPE = 61;

	/**
	 * The meta object id for the '<em>DB GDI Referenz Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getDB_GDI_Referenz_Type()
	 * @generated
	 */
	int DB_GDI_REFERENZ_TYPE = 62;

	/**
	 * The meta object id for the '<em>ENUM Anhang Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMAnhangArt
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMAnhangArtObject()
	 * @generated
	 */
	int ENUM_ANHANG_ART_OBJECT = 63;

	/**
	 * The meta object id for the '<em>ENUM Bestandsrelevanz Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMBestandsrelevanz
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMBestandsrelevanzObject()
	 * @generated
	 */
	int ENUM_BESTANDSRELEVANZ_OBJECT = 64;

	/**
	 * The meta object id for the '<em>ENUMBV Darstellung In Plan Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMBVDarstellungInPlan
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMBVDarstellungInPlanObject()
	 * @generated
	 */
	int ENUMBV_DARSTELLUNG_IN_PLAN_OBJECT = 65;

	/**
	 * The meta object id for the '<em>ENUM Dateityp Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMDateityp
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMDateitypObject()
	 * @generated
	 */
	int ENUM_DATEITYP_OBJECT = 66;

	/**
	 * The meta object id for the '<em>ENUMLST Objekt Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMLSTObjektArt
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMLSTObjektArtObject()
	 * @generated
	 */
	int ENUMLST_OBJEKT_ART_OBJECT = 67;

	/**
	 * The meta object id for the '<em>ENUM Objektzustand Besonders Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMObjektzustandBesonders
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMObjektzustandBesondersObject()
	 * @generated
	 */
	int ENUM_OBJEKTZUSTAND_BESONDERS_OBJECT = 68;

	/**
	 * The meta object id for the '<em>ENUM Rolle Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMRolle
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMRolleObject()
	 * @generated
	 */
	int ENUM_ROLLE_OBJECT = 69;

	/**
	 * The meta object id for the '<em>Identitaet Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getIdentitaet_Type()
	 * @generated
	 */
	int IDENTITAET_TYPE = 70;

	/**
	 * The meta object id for the '<em>Kommentar Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getKommentar_Type()
	 * @generated
	 */
	int KOMMENTAR_TYPE = 71;

	/**
	 * The meta object id for the '<em>Kurztext Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getKurztext_Type()
	 * @generated
	 */
	int KURZTEXT_TYPE = 72;

	/**
	 * The meta object id for the '<em>LO Ausgabestand Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Ausgabestand_Type()
	 * @generated
	 */
	int LO_AUSGABESTAND_TYPE = 73;

	/**
	 * The meta object id for the '<em>LO DB Freigabe Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_DB_Freigabe_Type()
	 * @generated
	 */
	int LO_DB_FREIGABE_TYPE = 74;

	/**
	 * The meta object id for the '<em>LO EMA Nr Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_EMA_Nr_Type()
	 * @generated
	 */
	int LO_EMA_NR_TYPE = 75;

	/**
	 * The meta object id for the '<em>LO Firmensachnummer Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Firmensachnummer_Type()
	 * @generated
	 */
	int LO_FIRMENSACHNUMMER_TYPE = 76;

	/**
	 * The meta object id for the '<em>LO Seriennummer Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Seriennummer_Type()
	 * @generated
	 */
	int LO_SERIENNUMMER_TYPE = 77;

	/**
	 * The meta object id for the '<em>Richtungsbezug Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.BasisTypen.ENUMWirkrichtung
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getRichtungsbezug_Type()
	 * @generated
	 */
	int RICHTUNGSBEZUG_TYPE = 78;

	/**
	 * The meta object id for the '<em>Seitliche Lage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getSeitliche_Lage_Type()
	 * @generated
	 */
	int SEITLICHE_LAGE_TYPE = 79;

	/**
	 * The meta object id for the '<em>Seitlicher Abstand Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getSeitlicher_Abstand_Type()
	 * @generated
	 */
	int SEITLICHER_ABSTAND_TYPE = 80;

	/**
	 * The meta object id for the '<em>Strecke Km Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getStrecke_Km_Type()
	 * @generated
	 */
	int STRECKE_KM_TYPE = 81;

	/**
	 * The meta object id for the '<em>Technischer Platz Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getTechnischer_Platz_Type()
	 * @generated
	 */
	int TECHNISCHER_PLATZ_TYPE = 82;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Abstand_TypeClass <em>Abstand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstand Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Abstand_TypeClass
	 * @generated
	 */
	EClass getAbstand_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Abstand_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Abstand_TypeClass#getWert()
	 * @see #getAbstand_TypeClass()
	 * @generated
	 */
	EAttribute getAbstand_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang <em>Anhang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anhang</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Anhang
	 * @generated
	 */
	EClass getAnhang();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang#getAnhangAllg <em>Anhang Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anhang Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Anhang#getAnhangAllg()
	 * @see #getAnhang()
	 * @generated
	 */
	EReference getAnhang_AnhangAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup <em>Anhang Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anhang Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup
	 * @generated
	 */
	EClass getAnhang_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup#getAnhangArt <em>Anhang Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anhang Art</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup#getAnhangArt()
	 * @see #getAnhang_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getAnhang_Allg_AttributeGroup_AnhangArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup#getDateiname <em>Dateiname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dateiname</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup#getDateiname()
	 * @see #getAnhang_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getAnhang_Allg_AttributeGroup_Dateiname();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup#getDateityp <em>Dateityp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dateityp</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup#getDateityp()
	 * @see #getAnhang_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getAnhang_Allg_AttributeGroup_Dateityp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Art_TypeClass <em>Anhang Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anhang Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Anhang_Art_TypeClass
	 * @generated
	 */
	EClass getAnhang_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Anhang_Art_TypeClass#getWert()
	 * @see #getAnhang_Art_TypeClass()
	 * @generated
	 */
	EAttribute getAnhang_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt <em>Basis Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basis Objekt</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt
	 * @generated
	 */
	EClass getBasis_Objekt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt#getBasisObjektAllg <em>Basis Objekt Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basis Objekt Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt#getBasisObjektAllg()
	 * @see #getBasis_Objekt()
	 * @generated
	 */
	EReference getBasis_Objekt_BasisObjektAllg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt#getIDBearbeitungsvermerk <em>ID Bearbeitungsvermerk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Bearbeitungsvermerk</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt#getIDBearbeitungsvermerk()
	 * @see #getBasis_Objekt()
	 * @generated
	 */
	EReference getBasis_Objekt_IDBearbeitungsvermerk();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt#getIDOertlichkeitAusgabe <em>ID Oertlichkeit Ausgabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Oertlichkeit Ausgabe</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt#getIDOertlichkeitAusgabe()
	 * @see #getBasis_Objekt()
	 * @generated
	 */
	EReference getBasis_Objekt_IDOertlichkeitAusgabe();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt#getObjektreferenzen <em>Objektreferenzen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objektreferenzen</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt#getObjektreferenzen()
	 * @see #getBasis_Objekt()
	 * @generated
	 */
	EReference getBasis_Objekt_Objektreferenzen();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup <em>Basis Objekt Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basis Objekt Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBasis_Objekt_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getBestandsschutz <em>Bestandsschutz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bestandsschutz</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getBestandsschutz()
	 * @see #getBasis_Objekt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBasis_Objekt_Allg_AttributeGroup_Bestandsschutz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getObjektzustandBesonders <em>Objektzustand Besonders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objektzustand Besonders</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getObjektzustandBesonders()
	 * @see #getBasis_Objekt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBasis_Objekt_Allg_AttributeGroup_ObjektzustandBesonders();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getDatumRegelwerk <em>Datum Regelwerk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datum Regelwerk</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getDatumRegelwerk()
	 * @see #getBasis_Objekt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBasis_Objekt_Allg_AttributeGroup_DatumRegelwerk();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getIDAnhangRegelwerkBesonders <em>ID Anhang Regelwerk Besonders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Regelwerk Besonders</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getIDAnhangRegelwerkBesonders()
	 * @see #getBasis_Objekt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBasis_Objekt_Allg_AttributeGroup_IDAnhangRegelwerkBesonders();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk <em>Bearbeitungsvermerk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bearbeitungsvermerk</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk
	 * @generated
	 */
	EClass getBearbeitungsvermerk();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk#getBearbeitungsvermerkAllg <em>Bearbeitungsvermerk Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bearbeitungsvermerk Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk#getBearbeitungsvermerkAllg()
	 * @see #getBearbeitungsvermerk()
	 * @generated
	 */
	EReference getBearbeitungsvermerk_BearbeitungsvermerkAllg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk#getIDAnhang <em>ID Anhang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Anhang</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk#getIDAnhang()
	 * @see #getBearbeitungsvermerk()
	 * @generated
	 */
	EReference getBearbeitungsvermerk_IDAnhang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup <em>Bearbeitungsvermerk Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bearbeitungsvermerk Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBearbeitungsvermerk_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBearbeitungsvermerkRolle <em>Bearbeitungsvermerk Rolle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bearbeitungsvermerk Rolle</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBearbeitungsvermerkRolle()
	 * @see #getBearbeitungsvermerk_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBearbeitungsvermerk_Allg_AttributeGroup_BearbeitungsvermerkRolle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBestandsrelevanz <em>Bestandsrelevanz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bestandsrelevanz</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBestandsrelevanz()
	 * @see #getBearbeitungsvermerk_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBearbeitungsvermerk_Allg_AttributeGroup_Bestandsrelevanz();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBVDarstellungInPlan <em>BV Darstellung In Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BV Darstellung In Plan</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBVDarstellungInPlan()
	 * @see #getBearbeitungsvermerk_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBearbeitungsvermerk_Allg_AttributeGroup_BVDarstellungInPlan();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBVKategorie <em>BV Kategorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BV Kategorie</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBVKategorie()
	 * @see #getBearbeitungsvermerk_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBearbeitungsvermerk_Allg_AttributeGroup_BVKategorie();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getKommentar <em>Kommentar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kommentar</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getKommentar()
	 * @see #getBearbeitungsvermerk_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBearbeitungsvermerk_Allg_AttributeGroup_Kommentar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getKurztext <em>Kurztext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kurztext</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getKurztext()
	 * @see #getBearbeitungsvermerk_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBearbeitungsvermerk_Allg_AttributeGroup_Kurztext();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getZeitBearbeitungsvermerk <em>Zeit Bearbeitungsvermerk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zeit Bearbeitungsvermerk</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getZeitBearbeitungsvermerk()
	 * @see #getBearbeitungsvermerk_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBearbeitungsvermerk_Allg_AttributeGroup_ZeitBearbeitungsvermerk();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Rolle_TypeClass <em>Bearbeitungsvermerk Rolle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bearbeitungsvermerk Rolle Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Rolle_TypeClass
	 * @generated
	 */
	EClass getBearbeitungsvermerk_Rolle_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Rolle_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Rolle_TypeClass#getWert()
	 * @see #getBearbeitungsvermerk_Rolle_TypeClass()
	 * @generated
	 */
	EAttribute getBearbeitungsvermerk_Rolle_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Begrenzung_A_TypeClass <em>Begrenzung AType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Begrenzung AType Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Begrenzung_A_TypeClass
	 * @generated
	 */
	EClass getBegrenzung_A_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Begrenzung_A_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Begrenzung_A_TypeClass#getWert()
	 * @see #getBegrenzung_A_TypeClass()
	 * @generated
	 */
	EAttribute getBegrenzung_A_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Begrenzung_B_TypeClass <em>Begrenzung BType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Begrenzung BType Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Begrenzung_B_TypeClass
	 * @generated
	 */
	EClass getBegrenzung_B_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Begrenzung_B_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Begrenzung_B_TypeClass#getWert()
	 * @see #getBegrenzung_B_TypeClass()
	 * @generated
	 */
	EAttribute getBegrenzung_B_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt <em>Bereich Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bereich Objekt</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt
	 * @generated
	 */
	EClass getBereich_Objekt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt#getBereichObjektTeilbereich <em>Bereich Objekt Teilbereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bereich Objekt Teilbereich</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt#getBereichObjektTeilbereich()
	 * @see #getBereich_Objekt()
	 * @generated
	 */
	EReference getBereich_Objekt_BereichObjektTeilbereich();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup <em>Bereich Objekt Teilbereich Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bereich Objekt Teilbereich Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup
	 * @generated
	 */
	EClass getBereich_Objekt_Teilbereich_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getBegrenzungA <em>Begrenzung A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begrenzung A</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getBegrenzungA()
	 * @see #getBereich_Objekt_Teilbereich_AttributeGroup()
	 * @generated
	 */
	EReference getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getBegrenzungB <em>Begrenzung B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begrenzung B</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getBegrenzungB()
	 * @see #getBereich_Objekt_Teilbereich_AttributeGroup()
	 * @generated
	 */
	EReference getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungB();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getIDTOPKante <em>IDTOP Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDTOP Kante</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getIDTOPKante()
	 * @see #getBereich_Objekt_Teilbereich_AttributeGroup()
	 * @generated
	 */
	EReference getBereich_Objekt_Teilbereich_AttributeGroup_IDTOPKante();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getRichtungsbezug <em>Richtungsbezug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Richtungsbezug</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getRichtungsbezug()
	 * @see #getBereich_Objekt_Teilbereich_AttributeGroup()
	 * @generated
	 */
	EReference getBereich_Objekt_Teilbereich_AttributeGroup_Richtungsbezug();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Beschreibung_TypeClass <em>Beschreibung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beschreibung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Beschreibung_TypeClass
	 * @generated
	 */
	EClass getBeschreibung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Beschreibung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Beschreibung_TypeClass#getWert()
	 * @see #getBeschreibung_TypeClass()
	 * @generated
	 */
	EAttribute getBeschreibung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bestandsrelevanz_TypeClass <em>Bestandsrelevanz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bestandsrelevanz Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bestandsrelevanz_TypeClass
	 * @generated
	 */
	EClass getBestandsrelevanz_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Bestandsrelevanz_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bestandsrelevanz_TypeClass#getWert()
	 * @see #getBestandsrelevanz_TypeClass()
	 * @generated
	 */
	EAttribute getBestandsrelevanz_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bestandsschutz_TypeClass <em>Bestandsschutz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bestandsschutz Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bestandsschutz_TypeClass
	 * @generated
	 */
	EClass getBestandsschutz_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Bestandsschutz_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bestandsschutz_TypeClass#getWert()
	 * @see #getBestandsschutz_TypeClass()
	 * @generated
	 */
	EAttribute getBestandsschutz_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.BV_Darstellung_In_Plan_TypeClass <em>BV Darstellung In Plan Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BV Darstellung In Plan Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BV_Darstellung_In_Plan_TypeClass
	 * @generated
	 */
	EClass getBV_Darstellung_In_Plan_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.BV_Darstellung_In_Plan_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BV_Darstellung_In_Plan_TypeClass#getWert()
	 * @see #getBV_Darstellung_In_Plan_TypeClass()
	 * @generated
	 */
	EAttribute getBV_Darstellung_In_Plan_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.BV_Kategorie_TypeClass <em>BV Kategorie Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BV Kategorie Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BV_Kategorie_TypeClass
	 * @generated
	 */
	EClass getBV_Kategorie_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.BV_Kategorie_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BV_Kategorie_TypeClass#getWert()
	 * @see #getBV_Kategorie_TypeClass()
	 * @generated
	 */
	EAttribute getBV_Kategorie_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Dateiname_TypeClass <em>Dateiname Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dateiname Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Dateiname_TypeClass
	 * @generated
	 */
	EClass getDateiname_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Dateiname_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Dateiname_TypeClass#getWert()
	 * @see #getDateiname_TypeClass()
	 * @generated
	 */
	EAttribute getDateiname_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Dateityp_TypeClass <em>Dateityp Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dateityp Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Dateityp_TypeClass
	 * @generated
	 */
	EClass getDateityp_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Dateityp_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Dateityp_TypeClass#getWert()
	 * @see #getDateityp_TypeClass()
	 * @generated
	 */
	EAttribute getDateityp_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Datum_Regelwerk_TypeClass <em>Datum Regelwerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datum Regelwerk Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Datum_Regelwerk_TypeClass
	 * @generated
	 */
	EClass getDatum_Regelwerk_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Datum_Regelwerk_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Datum_Regelwerk_TypeClass#getWert()
	 * @see #getDatum_Regelwerk_TypeClass()
	 * @generated
	 */
	EAttribute getDatum_Regelwerk_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.DB_GDI_Referenz_TypeClass <em>DB GDI Referenz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB GDI Referenz Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.DB_GDI_Referenz_TypeClass
	 * @generated
	 */
	EClass getDB_GDI_Referenz_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.DB_GDI_Referenz_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.DB_GDI_Referenz_TypeClass#getWert()
	 * @see #getDB_GDI_Referenz_TypeClass()
	 * @generated
	 */
	EAttribute getDB_GDI_Referenz_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Identitaet_TypeClass <em>Identitaet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identitaet Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Identitaet_TypeClass
	 * @generated
	 */
	EClass getIdentitaet_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Identitaet_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Identitaet_TypeClass#getWert()
	 * @see #getIdentitaet_TypeClass()
	 * @generated
	 */
	EAttribute getIdentitaet_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Km_Massgebend_TypeClass <em>Km Massgebend Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Km Massgebend Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Km_Massgebend_TypeClass
	 * @generated
	 */
	EClass getKm_Massgebend_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Km_Massgebend_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Km_Massgebend_TypeClass#getWert()
	 * @see #getKm_Massgebend_TypeClass()
	 * @generated
	 */
	EAttribute getKm_Massgebend_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Kommentar_TypeClass <em>Kommentar Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kommentar Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Kommentar_TypeClass
	 * @generated
	 */
	EClass getKommentar_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Kommentar_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Kommentar_TypeClass#getWert()
	 * @see #getKommentar_TypeClass()
	 * @generated
	 */
	EAttribute getKommentar_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Kurztext_TypeClass <em>Kurztext Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kurztext Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Kurztext_TypeClass
	 * @generated
	 */
	EClass getKurztext_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Kurztext_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Kurztext_TypeClass#getWert()
	 * @see #getKurztext_TypeClass()
	 * @generated
	 */
	EAttribute getKurztext_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt <em>Lieferobjekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lieferobjekt</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt
	 * @generated
	 */
	EClass getLieferobjekt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beschreibung</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt#getBeschreibung()
	 * @see #getLieferobjekt()
	 * @generated
	 */
	EReference getLieferobjekt_Beschreibung();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt#getIDGEOPunkt <em>IDGEO Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IDGEO Punkt</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt#getIDGEOPunkt()
	 * @see #getLieferobjekt()
	 * @generated
	 */
	EReference getLieferobjekt_IDGEOPunkt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt#getIDLOEinbau <em>IDLO Einbau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IDLO Einbau</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt#getIDLOEinbau()
	 * @see #getLieferobjekt()
	 * @generated
	 */
	EReference getLieferobjekt_IDLOEinbau();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt#getLOErsatz <em>LO Ersatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LO Ersatz</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt#getLOErsatz()
	 * @see #getLieferobjekt()
	 * @generated
	 */
	EReference getLieferobjekt_LOErsatz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt#getLOMaterial <em>LO Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LO Material</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt#getLOMaterial()
	 * @see #getLieferobjekt()
	 * @generated
	 */
	EReference getLieferobjekt_LOMaterial();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Ausgabestand_TypeClass <em>LO Ausgabestand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LO Ausgabestand Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Ausgabestand_TypeClass
	 * @generated
	 */
	EClass getLO_Ausgabestand_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Ausgabestand_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Ausgabestand_TypeClass#getWert()
	 * @see #getLO_Ausgabestand_TypeClass()
	 * @generated
	 */
	EAttribute getLO_Ausgabestand_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Datum_Herstellung_TypeClass <em>LO Datum Herstellung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LO Datum Herstellung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Datum_Herstellung_TypeClass
	 * @generated
	 */
	EClass getLO_Datum_Herstellung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Datum_Herstellung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Datum_Herstellung_TypeClass#getWert()
	 * @see #getLO_Datum_Herstellung_TypeClass()
	 * @generated
	 */
	EAttribute getLO_Datum_Herstellung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_DB_Freigabe_TypeClass <em>LO DB Freigabe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LO DB Freigabe Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_DB_Freigabe_TypeClass
	 * @generated
	 */
	EClass getLO_DB_Freigabe_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_DB_Freigabe_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_DB_Freigabe_TypeClass#getWert()
	 * @see #getLO_DB_Freigabe_TypeClass()
	 * @generated
	 */
	EAttribute getLO_DB_Freigabe_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_EMA_Nr_TypeClass <em>LO EMA Nr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LO EMA Nr Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_EMA_Nr_TypeClass
	 * @generated
	 */
	EClass getLO_EMA_Nr_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_EMA_Nr_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_EMA_Nr_TypeClass#getWert()
	 * @see #getLO_EMA_Nr_TypeClass()
	 * @generated
	 */
	EAttribute getLO_EMA_Nr_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Ersatz_TypeClass <em>LO Ersatz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LO Ersatz Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Ersatz_TypeClass
	 * @generated
	 */
	EClass getLO_Ersatz_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Ersatz_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Ersatz_TypeClass#getWert()
	 * @see #getLO_Ersatz_TypeClass()
	 * @generated
	 */
	EAttribute getLO_Ersatz_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Firmensachnummer_TypeClass <em>LO Firmensachnummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LO Firmensachnummer Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Firmensachnummer_TypeClass
	 * @generated
	 */
	EClass getLO_Firmensachnummer_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Firmensachnummer_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Firmensachnummer_TypeClass#getWert()
	 * @see #getLO_Firmensachnummer_TypeClass()
	 * @generated
	 */
	EAttribute getLO_Firmensachnummer_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup <em>LO Material Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LO Material Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup
	 * @generated
	 */
	EClass getLO_Material_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOAusgabestand <em>LO Ausgabestand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LO Ausgabestand</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOAusgabestand()
	 * @see #getLO_Material_AttributeGroup()
	 * @generated
	 */
	EReference getLO_Material_AttributeGroup_LOAusgabestand();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLODatumHerstellung <em>LO Datum Herstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LO Datum Herstellung</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLODatumHerstellung()
	 * @see #getLO_Material_AttributeGroup()
	 * @generated
	 */
	EReference getLO_Material_AttributeGroup_LODatumHerstellung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLODBFreigabe <em>LODB Freigabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LODB Freigabe</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLODBFreigabe()
	 * @see #getLO_Material_AttributeGroup()
	 * @generated
	 */
	EReference getLO_Material_AttributeGroup_LODBFreigabe();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOEMANr <em>LOEMA Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LOEMA Nr</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOEMANr()
	 * @see #getLO_Material_AttributeGroup()
	 * @generated
	 */
	EReference getLO_Material_AttributeGroup_LOEMANr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOFirmensachnummer <em>LO Firmensachnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LO Firmensachnummer</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOFirmensachnummer()
	 * @see #getLO_Material_AttributeGroup()
	 * @generated
	 */
	EReference getLO_Material_AttributeGroup_LOFirmensachnummer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOSeriennummer <em>LO Seriennummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LO Seriennummer</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOSeriennummer()
	 * @see #getLO_Material_AttributeGroup()
	 * @generated
	 */
	EReference getLO_Material_AttributeGroup_LOSeriennummer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Seriennummer_TypeClass <em>LO Seriennummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LO Seriennummer Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Seriennummer_TypeClass
	 * @generated
	 */
	EClass getLO_Seriennummer_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Seriennummer_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LO_Seriennummer_TypeClass#getWert()
	 * @see #getLO_Seriennummer_TypeClass()
	 * @generated
	 */
	EAttribute getLO_Seriennummer_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.LST_Objekt_Art_TypeClass <em>LST Objekt Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LST Objekt Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LST_Objekt_Art_TypeClass
	 * @generated
	 */
	EClass getLST_Objekt_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.LST_Objekt_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.LST_Objekt_Art_TypeClass#getWert()
	 * @see #getLST_Objekt_Art_TypeClass()
	 * @generated
	 */
	EAttribute getLST_Objekt_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Objektreferenzen_AttributeGroup <em>Objektreferenzen Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objektreferenzen Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Objektreferenzen_AttributeGroup
	 * @generated
	 */
	EClass getObjektreferenzen_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Objektreferenzen_AttributeGroup#getDBGDIReferenz <em>DBGDI Referenz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DBGDI Referenz</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Objektreferenzen_AttributeGroup#getDBGDIReferenz()
	 * @see #getObjektreferenzen_AttributeGroup()
	 * @generated
	 */
	EReference getObjektreferenzen_AttributeGroup_DBGDIReferenz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Objektreferenzen_AttributeGroup#getTechnischerPlatz <em>Technischer Platz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technischer Platz</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Objektreferenzen_AttributeGroup#getTechnischerPlatz()
	 * @see #getObjektreferenzen_AttributeGroup()
	 * @generated
	 */
	EReference getObjektreferenzen_AttributeGroup_TechnischerPlatz();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Objektzustand_Besonders_TypeClass <em>Objektzustand Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objektzustand Besonders Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Objektzustand_Besonders_TypeClass
	 * @generated
	 */
	EClass getObjektzustand_Besonders_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Objektzustand_Besonders_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Objektzustand_Besonders_TypeClass#getWert()
	 * @see #getObjektzustand_Besonders_TypeClass()
	 * @generated
	 */
	EAttribute getObjektzustand_Besonders_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Proxy_Objekt <em>Proxy Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Objekt</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Proxy_Objekt
	 * @generated
	 */
	EClass getProxy_Objekt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Proxy_Objekt#getLSTObjektArt <em>LST Objekt Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LST Objekt Art</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Proxy_Objekt#getLSTObjektArt()
	 * @see #getProxy_Objekt()
	 * @generated
	 */
	EReference getProxy_Objekt_LSTObjektArt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt <em>Punkt Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Punkt Objekt</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt
	 * @generated
	 */
	EClass getPunkt_Objekt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt#getPunktObjektStrecke <em>Punkt Objekt Strecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Punkt Objekt Strecke</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt#getPunktObjektStrecke()
	 * @see #getPunkt_Objekt()
	 * @generated
	 */
	EReference getPunkt_Objekt_PunktObjektStrecke();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt#getPunktObjektTOPKante <em>Punkt Objekt TOP Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Punkt Objekt TOP Kante</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt#getPunktObjektTOPKante()
	 * @see #getPunkt_Objekt()
	 * @generated
	 */
	EReference getPunkt_Objekt_PunktObjektTOPKante();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup <em>Punkt Objekt Strecke Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Punkt Objekt Strecke Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup
	 * @generated
	 */
	EClass getPunkt_Objekt_Strecke_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getIDStrecke <em>ID Strecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Strecke</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getIDStrecke()
	 * @see #getPunkt_Objekt_Strecke_AttributeGroup()
	 * @generated
	 */
	EReference getPunkt_Objekt_Strecke_AttributeGroup_IDStrecke();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getKmMassgebend <em>Km Massgebend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Km Massgebend</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getKmMassgebend()
	 * @see #getPunkt_Objekt_Strecke_AttributeGroup()
	 * @generated
	 */
	EReference getPunkt_Objekt_Strecke_AttributeGroup_KmMassgebend();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getStreckeKm <em>Strecke Km</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strecke Km</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getStreckeKm()
	 * @see #getPunkt_Objekt_Strecke_AttributeGroup()
	 * @generated
	 */
	EReference getPunkt_Objekt_Strecke_AttributeGroup_StreckeKm();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup <em>Punkt Objekt TOP Kante Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Punkt Objekt TOP Kante Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup
	 * @generated
	 */
	EClass getPunkt_Objekt_TOP_Kante_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getAbstand <em>Abstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstand</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getAbstand()
	 * @see #getPunkt_Objekt_TOP_Kante_AttributeGroup()
	 * @generated
	 */
	EReference getPunkt_Objekt_TOP_Kante_AttributeGroup_Abstand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getIDGEOPunktBerechnet <em>IDGEO Punkt Berechnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IDGEO Punkt Berechnet</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getIDGEOPunktBerechnet()
	 * @see #getPunkt_Objekt_TOP_Kante_AttributeGroup()
	 * @generated
	 */
	EReference getPunkt_Objekt_TOP_Kante_AttributeGroup_IDGEOPunktBerechnet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getIDTOPKante <em>IDTOP Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDTOP Kante</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getIDTOPKante()
	 * @see #getPunkt_Objekt_TOP_Kante_AttributeGroup()
	 * @generated
	 */
	EReference getPunkt_Objekt_TOP_Kante_AttributeGroup_IDTOPKante();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getWirkrichtung <em>Wirkrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wirkrichtung</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getWirkrichtung()
	 * @see #getPunkt_Objekt_TOP_Kante_AttributeGroup()
	 * @generated
	 */
	EReference getPunkt_Objekt_TOP_Kante_AttributeGroup_Wirkrichtung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getSeitlicheLage <em>Seitliche Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seitliche Lage</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getSeitlicheLage()
	 * @see #getPunkt_Objekt_TOP_Kante_AttributeGroup()
	 * @generated
	 */
	EReference getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicheLage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getSeitlicherAbstand <em>Seitlicher Abstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seitlicher Abstand</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getSeitlicherAbstand()
	 * @see #getPunkt_Objekt_TOP_Kante_AttributeGroup()
	 * @generated
	 */
	EReference getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicherAbstand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Richtungsbezug_TypeClass <em>Richtungsbezug Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Richtungsbezug Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Richtungsbezug_TypeClass
	 * @generated
	 */
	EClass getRichtungsbezug_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Richtungsbezug_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Richtungsbezug_TypeClass#getWert()
	 * @see #getRichtungsbezug_TypeClass()
	 * @generated
	 */
	EAttribute getRichtungsbezug_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Seitliche_Lage_TypeClass <em>Seitliche Lage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seitliche Lage Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Seitliche_Lage_TypeClass
	 * @generated
	 */
	EClass getSeitliche_Lage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Seitliche_Lage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Seitliche_Lage_TypeClass#getWert()
	 * @see #getSeitliche_Lage_TypeClass()
	 * @generated
	 */
	EAttribute getSeitliche_Lage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Seitlicher_Abstand_TypeClass <em>Seitlicher Abstand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seitlicher Abstand Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Seitlicher_Abstand_TypeClass
	 * @generated
	 */
	EClass getSeitlicher_Abstand_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Seitlicher_Abstand_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Seitlicher_Abstand_TypeClass#getWert()
	 * @see #getSeitlicher_Abstand_TypeClass()
	 * @generated
	 */
	EAttribute getSeitlicher_Abstand_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Strecke_Km_TypeClass <em>Strecke Km Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strecke Km Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Strecke_Km_TypeClass
	 * @generated
	 */
	EClass getStrecke_Km_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Strecke_Km_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Strecke_Km_TypeClass#getWert()
	 * @see #getStrecke_Km_TypeClass()
	 * @generated
	 */
	EAttribute getStrecke_Km_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Technischer_Platz_TypeClass <em>Technischer Platz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technischer Platz Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Technischer_Platz_TypeClass
	 * @generated
	 */
	EClass getTechnischer_Platz_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Technischer_Platz_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Technischer_Platz_TypeClass#getWert()
	 * @see #getTechnischer_Platz_TypeClass()
	 * @generated
	 */
	EAttribute getTechnischer_Platz_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt <em>Ur Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ur Objekt</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt
	 * @generated
	 */
	EClass getUr_Objekt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt#getIdentitaet <em>Identitaet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identitaet</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt#getIdentitaet()
	 * @see #getUr_Objekt()
	 * @generated
	 */
	EReference getUr_Objekt_Identitaet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Wirkrichtung_TypeClass <em>Wirkrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wirkrichtung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Wirkrichtung_TypeClass
	 * @generated
	 */
	EClass getWirkrichtung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Wirkrichtung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Wirkrichtung_TypeClass#getWert()
	 * @see #getWirkrichtung_TypeClass()
	 * @generated
	 */
	EAttribute getWirkrichtung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Basisobjekte.Zeit_Bearbeitungsvermerk_TypeClass <em>Zeit Bearbeitungsvermerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zeit Bearbeitungsvermerk Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Zeit_Bearbeitungsvermerk_TypeClass
	 * @generated
	 */
	EClass getZeit_Bearbeitungsvermerk_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Basisobjekte.Zeit_Bearbeitungsvermerk_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Zeit_Bearbeitungsvermerk_TypeClass#getWert()
	 * @see #getZeit_Bearbeitungsvermerk_TypeClass()
	 * @generated
	 */
	EAttribute getZeit_Bearbeitungsvermerk_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMAnhangArt <em>ENUM Anhang Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Anhang Art</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMAnhangArt
	 * @generated
	 */
	EEnum getENUMAnhangArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMBestandsrelevanz <em>ENUM Bestandsrelevanz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Bestandsrelevanz</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMBestandsrelevanz
	 * @generated
	 */
	EEnum getENUMBestandsrelevanz();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMBVDarstellungInPlan <em>ENUMBV Darstellung In Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMBV Darstellung In Plan</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMBVDarstellungInPlan
	 * @generated
	 */
	EEnum getENUMBVDarstellungInPlan();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMDateityp <em>ENUM Dateityp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Dateityp</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMDateityp
	 * @generated
	 */
	EEnum getENUMDateityp();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMLSTObjektArt <em>ENUMLST Objekt Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMLST Objekt Art</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMLSTObjektArt
	 * @generated
	 */
	EEnum getENUMLSTObjektArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMObjektzustandBesonders <em>ENUM Objektzustand Besonders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Objektzustand Besonders</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMObjektzustandBesonders
	 * @generated
	 */
	EEnum getENUMObjektzustandBesonders();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMRolle <em>ENUM Rolle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Rolle</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMRolle
	 * @generated
	 */
	EEnum getENUMRolle();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Abstand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abstand Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TAbstand' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter' pattern='(0|[1-9][0-9]{0,4})\\.[0-9]{3}'"
	 * @generated
	 */
	EDataType getAbstand_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Begrenzung AType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Begrenzung AType</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TBegrenzung_A' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter' pattern='(0|[1-9][0-9]{0,4})\\.[0-9]{3}'"
	 * @generated
	 */
	EDataType getBegrenzung_A_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Begrenzung BType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Begrenzung BType</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TBegrenzung_B' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter' pattern='(0|[1-9][0-9]{0,4})\\.[0-9]{3}'"
	 * @generated
	 */
	EDataType getBegrenzung_B_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Beschreibung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Beschreibung Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBeschreibung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText'"
	 * @generated
	 */
	EDataType getBeschreibung_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>BV Kategorie Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BV Kategorie Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBV_Kategorie' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText'"
	 * @generated
	 */
	EDataType getBV_Kategorie_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>DB GDI Referenz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DB GDI Referenz Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TDB_GDI_Referenz' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{1,20}'"
	 * @generated
	 */
	EDataType getDB_GDI_Referenz_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMAnhangArt <em>ENUM Anhang Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Anhang Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMAnhangArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Basisobjekte.ENUMAnhangArt"
	 *        extendedMetaData="name='ENUMAnhang_Art:Object' baseType='ENUMAnhang_Art'"
	 * @generated
	 */
	EDataType getENUMAnhangArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMBestandsrelevanz <em>ENUM Bestandsrelevanz Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Bestandsrelevanz Object</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMBestandsrelevanz
	 * @model instanceClass="org.eclipse.set.model.planpro.Basisobjekte.ENUMBestandsrelevanz"
	 *        extendedMetaData="name='ENUMBestandsrelevanz:Object' baseType='ENUMBestandsrelevanz'"
	 * @generated
	 */
	EDataType getENUMBestandsrelevanzObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMBVDarstellungInPlan <em>ENUMBV Darstellung In Plan Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMBV Darstellung In Plan Object</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMBVDarstellungInPlan
	 * @model instanceClass="org.eclipse.set.model.planpro.Basisobjekte.ENUMBVDarstellungInPlan"
	 *        extendedMetaData="name='ENUMBV_Darstellung_In_Plan:Object' baseType='ENUMBV_Darstellung_In_Plan'"
	 * @generated
	 */
	EDataType getENUMBVDarstellungInPlanObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMDateityp <em>ENUM Dateityp Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Dateityp Object</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMDateityp
	 * @model instanceClass="org.eclipse.set.model.planpro.Basisobjekte.ENUMDateityp"
	 *        extendedMetaData="name='ENUMDateityp:Object' baseType='ENUMDateityp'"
	 * @generated
	 */
	EDataType getENUMDateitypObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMLSTObjektArt <em>ENUMLST Objekt Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMLST Objekt Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMLSTObjektArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Basisobjekte.ENUMLSTObjektArt"
	 *        extendedMetaData="name='ENUMLST_Objekt_Art:Object' baseType='ENUMLST_Objekt_Art'"
	 * @generated
	 */
	EDataType getENUMLSTObjektArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMObjektzustandBesonders <em>ENUM Objektzustand Besonders Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Objektzustand Besonders Object</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMObjektzustandBesonders
	 * @model instanceClass="org.eclipse.set.model.planpro.Basisobjekte.ENUMObjektzustandBesonders"
	 *        extendedMetaData="name='ENUMObjektzustand_Besonders:Object' baseType='ENUMObjektzustand_Besonders'"
	 * @generated
	 */
	EDataType getENUMObjektzustandBesondersObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMRolle <em>ENUM Rolle Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Rolle Object</em>'.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMRolle
	 * @model instanceClass="org.eclipse.set.model.planpro.Basisobjekte.ENUMRolle"
	 *        extendedMetaData="name='ENUMRolle:Object' baseType='ENUMRolle'"
	 * @generated
	 */
	EDataType getENUMRolleObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Identitaet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identitaet Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TIdentitaet' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGUID'"
	 * @generated
	 */
	EDataType getIdentitaet_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Kommentar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kommentar Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TKommentar' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TFreiText'"
	 * @generated
	 */
	EDataType getKommentar_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Kurztext Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kurztext Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TKurztext' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{1,100}'"
	 * @generated
	 */
	EDataType getKurztext_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>LO Ausgabestand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LO Ausgabestand Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TLO_Ausgabestand' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText'"
	 * @generated
	 */
	EDataType getLO_Ausgabestand_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>LO DB Freigabe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LO DB Freigabe Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TLO_DB_Freigabe' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText'"
	 * @generated
	 */
	EDataType getLO_DB_Freigabe_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>LO EMA Nr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LO EMA Nr Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TLO_EMA_Nr' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText'"
	 * @generated
	 */
	EDataType getLO_EMA_Nr_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>LO Firmensachnummer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LO Firmensachnummer Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TLO_Firmensachnummer' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText'"
	 * @generated
	 */
	EDataType getLO_Firmensachnummer_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>LO Seriennummer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LO Seriennummer Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TLO_Seriennummer' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText'"
	 * @generated
	 */
	EDataType getLO_Seriennummer_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.BasisTypen.ENUMWirkrichtung <em>Richtungsbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Richtungsbezug Type</em>'.
	 * @see org.eclipse.set.model.planpro.BasisTypen.ENUMWirkrichtung
	 * @model instanceClass="org.eclipse.set.model.planpro.BasisTypen.ENUMWirkrichtung"
	 *        extendedMetaData="name='TRichtungsbezug' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TWirkrichtung'"
	 * @generated
	 */
	EDataType getRichtungsbezug_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts <em>Seitliche Lage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Seitliche Lage Type</em>'.
	 * @see org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts
	 * @model instanceClass="org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts"
	 *        extendedMetaData="name='TSeitliche_Lage' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts'"
	 * @generated
	 */
	EDataType getSeitliche_Lage_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Seitlicher Abstand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Seitlicher Abstand Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TSeitlicher_Abstand' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter' pattern='(-?[1-9][0-9]{0,4}\\.[0-9]{3})|(-?0\\.[89][0-9]{2})|0.000'"
	 * @generated
	 */
	EDataType getSeitlicher_Abstand_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Strecke Km Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Strecke Km Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TStrecke_Km' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TKilometrierung'"
	 * @generated
	 */
	EDataType getStrecke_Km_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Technischer Platz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Technischer Platz Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TTechnischer_Platz' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='[A-Z0-9\\-]{30}'"
	 * @generated
	 */
	EDataType getTechnischer_Platz_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasisobjekteFactory getBasisobjekteFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Abstand_TypeClassImpl <em>Abstand Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Abstand_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getAbstand_TypeClass()
		 * @generated
		 */
		EClass ABSTAND_TYPE_CLASS = eINSTANCE.getAbstand_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTAND_TYPE_CLASS__WERT = eINSTANCE.getAbstand_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.AnhangImpl <em>Anhang</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.AnhangImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getAnhang()
		 * @generated
		 */
		EClass ANHANG = eINSTANCE.getAnhang();

		/**
		 * The meta object literal for the '<em><b>Anhang Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANHANG__ANHANG_ALLG = eINSTANCE.getAnhang_AnhangAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Anhang_Allg_AttributeGroupImpl <em>Anhang Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Anhang_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getAnhang_Allg_AttributeGroup()
		 * @generated
		 */
		EClass ANHANG_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getAnhang_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Anhang Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANHANG_ALLG_ATTRIBUTE_GROUP__ANHANG_ART = eINSTANCE.getAnhang_Allg_AttributeGroup_AnhangArt();

		/**
		 * The meta object literal for the '<em><b>Dateiname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANHANG_ALLG_ATTRIBUTE_GROUP__DATEINAME = eINSTANCE.getAnhang_Allg_AttributeGroup_Dateiname();

		/**
		 * The meta object literal for the '<em><b>Dateityp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANHANG_ALLG_ATTRIBUTE_GROUP__DATEITYP = eINSTANCE.getAnhang_Allg_AttributeGroup_Dateityp();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Anhang_Art_TypeClassImpl <em>Anhang Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Anhang_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getAnhang_Art_TypeClass()
		 * @generated
		 */
		EClass ANHANG_ART_TYPE_CLASS = eINSTANCE.getAnhang_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANHANG_ART_TYPE_CLASS__WERT = eINSTANCE.getAnhang_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl <em>Basis Objekt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBasis_Objekt()
		 * @generated
		 */
		EClass BASIS_OBJEKT = eINSTANCE.getBasis_Objekt();

		/**
		 * The meta object literal for the '<em><b>Basis Objekt Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIS_OBJEKT__BASIS_OBJEKT_ALLG = eINSTANCE.getBasis_Objekt_BasisObjektAllg();

		/**
		 * The meta object literal for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK = eINSTANCE.getBasis_Objekt_IDBearbeitungsvermerk();

		/**
		 * The meta object literal for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE = eINSTANCE.getBasis_Objekt_IDOertlichkeitAusgabe();

		/**
		 * The meta object literal for the '<em><b>Objektreferenzen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIS_OBJEKT__OBJEKTREFERENZEN = eINSTANCE.getBasis_Objekt_Objektreferenzen();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_Objekt_Allg_AttributeGroupImpl <em>Basis Objekt Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_Objekt_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBasis_Objekt_Allg_AttributeGroup()
		 * @generated
		 */
		EClass BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getBasis_Objekt_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bestandsschutz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ = eINSTANCE.getBasis_Objekt_Allg_AttributeGroup_Bestandsschutz();

		/**
		 * The meta object literal for the '<em><b>Objektzustand Besonders</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS = eINSTANCE.getBasis_Objekt_Allg_AttributeGroup_ObjektzustandBesonders();

		/**
		 * The meta object literal for the '<em><b>Datum Regelwerk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK = eINSTANCE.getBasis_Objekt_Allg_AttributeGroup_DatumRegelwerk();

		/**
		 * The meta object literal for the '<em><b>ID Anhang Regelwerk Besonders</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__ID_ANHANG_REGELWERK_BESONDERS = eINSTANCE.getBasis_Objekt_Allg_AttributeGroup_IDAnhangRegelwerkBesonders();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.BearbeitungsvermerkImpl <em>Bearbeitungsvermerk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BearbeitungsvermerkImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBearbeitungsvermerk()
		 * @generated
		 */
		EClass BEARBEITUNGSVERMERK = eINSTANCE.getBearbeitungsvermerk();

		/**
		 * The meta object literal for the '<em><b>Bearbeitungsvermerk Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG = eINSTANCE.getBearbeitungsvermerk_BearbeitungsvermerkAllg();

		/**
		 * The meta object literal for the '<em><b>ID Anhang</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEARBEITUNGSVERMERK__ID_ANHANG = eINSTANCE.getBearbeitungsvermerk_IDAnhang();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl <em>Bearbeitungsvermerk Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBearbeitungsvermerk_Allg_AttributeGroup()
		 * @generated
		 */
		EClass BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getBearbeitungsvermerk_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bearbeitungsvermerk Rolle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE = eINSTANCE.getBearbeitungsvermerk_Allg_AttributeGroup_BearbeitungsvermerkRolle();

		/**
		 * The meta object literal for the '<em><b>Bestandsrelevanz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ = eINSTANCE.getBearbeitungsvermerk_Allg_AttributeGroup_Bestandsrelevanz();

		/**
		 * The meta object literal for the '<em><b>BV Darstellung In Plan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_DARSTELLUNG_IN_PLAN = eINSTANCE.getBearbeitungsvermerk_Allg_AttributeGroup_BVDarstellungInPlan();

		/**
		 * The meta object literal for the '<em><b>BV Kategorie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_KATEGORIE = eINSTANCE.getBearbeitungsvermerk_Allg_AttributeGroup_BVKategorie();

		/**
		 * The meta object literal for the '<em><b>Kommentar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KOMMENTAR = eINSTANCE.getBearbeitungsvermerk_Allg_AttributeGroup_Kommentar();

		/**
		 * The meta object literal for the '<em><b>Kurztext</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KURZTEXT = eINSTANCE.getBearbeitungsvermerk_Allg_AttributeGroup_Kurztext();

		/**
		 * The meta object literal for the '<em><b>Zeit Bearbeitungsvermerk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__ZEIT_BEARBEITUNGSVERMERK = eINSTANCE.getBearbeitungsvermerk_Allg_AttributeGroup_ZeitBearbeitungsvermerk();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Rolle_TypeClassImpl <em>Bearbeitungsvermerk Rolle Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Rolle_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBearbeitungsvermerk_Rolle_TypeClass()
		 * @generated
		 */
		EClass BEARBEITUNGSVERMERK_ROLLE_TYPE_CLASS = eINSTANCE.getBearbeitungsvermerk_Rolle_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARBEITUNGSVERMERK_ROLLE_TYPE_CLASS__WERT = eINSTANCE.getBearbeitungsvermerk_Rolle_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Begrenzung_A_TypeClassImpl <em>Begrenzung AType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Begrenzung_A_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBegrenzung_A_TypeClass()
		 * @generated
		 */
		EClass BEGRENZUNG_ATYPE_CLASS = eINSTANCE.getBegrenzung_A_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEGRENZUNG_ATYPE_CLASS__WERT = eINSTANCE.getBegrenzung_A_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Begrenzung_B_TypeClassImpl <em>Begrenzung BType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Begrenzung_B_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBegrenzung_B_TypeClass()
		 * @generated
		 */
		EClass BEGRENZUNG_BTYPE_CLASS = eINSTANCE.getBegrenzung_B_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEGRENZUNG_BTYPE_CLASS__WERT = eINSTANCE.getBegrenzung_B_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_ObjektImpl <em>Bereich Objekt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_ObjektImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBereich_Objekt()
		 * @generated
		 */
		EClass BEREICH_OBJEKT = eINSTANCE.getBereich_Objekt();

		/**
		 * The meta object literal for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH = eINSTANCE.getBereich_Objekt_BereichObjektTeilbereich();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_Objekt_Teilbereich_AttributeGroupImpl <em>Bereich Objekt Teilbereich Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_Objekt_Teilbereich_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBereich_Objekt_Teilbereich_AttributeGroup()
		 * @generated
		 */
		EClass BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP = eINSTANCE.getBereich_Objekt_Teilbereich_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Begrenzung A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_A = eINSTANCE.getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungA();

		/**
		 * The meta object literal for the '<em><b>Begrenzung B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_B = eINSTANCE.getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungB();

		/**
		 * The meta object literal for the '<em><b>IDTOP Kante</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__IDTOP_KANTE = eINSTANCE.getBereich_Objekt_Teilbereich_AttributeGroup_IDTOPKante();

		/**
		 * The meta object literal for the '<em><b>Richtungsbezug</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__RICHTUNGSBEZUG = eINSTANCE.getBereich_Objekt_Teilbereich_AttributeGroup_Richtungsbezug();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Beschreibung_TypeClassImpl <em>Beschreibung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Beschreibung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBeschreibung_TypeClass()
		 * @generated
		 */
		EClass BESCHREIBUNG_TYPE_CLASS = eINSTANCE.getBeschreibung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BESCHREIBUNG_TYPE_CLASS__WERT = eINSTANCE.getBeschreibung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bestandsrelevanz_TypeClassImpl <em>Bestandsrelevanz Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Bestandsrelevanz_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBestandsrelevanz_TypeClass()
		 * @generated
		 */
		EClass BESTANDSRELEVANZ_TYPE_CLASS = eINSTANCE.getBestandsrelevanz_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BESTANDSRELEVANZ_TYPE_CLASS__WERT = eINSTANCE.getBestandsrelevanz_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bestandsschutz_TypeClassImpl <em>Bestandsschutz Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Bestandsschutz_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBestandsschutz_TypeClass()
		 * @generated
		 */
		EClass BESTANDSSCHUTZ_TYPE_CLASS = eINSTANCE.getBestandsschutz_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BESTANDSSCHUTZ_TYPE_CLASS__WERT = eINSTANCE.getBestandsschutz_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.BV_Darstellung_In_Plan_TypeClassImpl <em>BV Darstellung In Plan Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BV_Darstellung_In_Plan_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBV_Darstellung_In_Plan_TypeClass()
		 * @generated
		 */
		EClass BV_DARSTELLUNG_IN_PLAN_TYPE_CLASS = eINSTANCE.getBV_Darstellung_In_Plan_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BV_DARSTELLUNG_IN_PLAN_TYPE_CLASS__WERT = eINSTANCE.getBV_Darstellung_In_Plan_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.BV_Kategorie_TypeClassImpl <em>BV Kategorie Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BV_Kategorie_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBV_Kategorie_TypeClass()
		 * @generated
		 */
		EClass BV_KATEGORIE_TYPE_CLASS = eINSTANCE.getBV_Kategorie_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BV_KATEGORIE_TYPE_CLASS__WERT = eINSTANCE.getBV_Kategorie_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Dateiname_TypeClassImpl <em>Dateiname Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Dateiname_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getDateiname_TypeClass()
		 * @generated
		 */
		EClass DATEINAME_TYPE_CLASS = eINSTANCE.getDateiname_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATEINAME_TYPE_CLASS__WERT = eINSTANCE.getDateiname_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Dateityp_TypeClassImpl <em>Dateityp Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Dateityp_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getDateityp_TypeClass()
		 * @generated
		 */
		EClass DATEITYP_TYPE_CLASS = eINSTANCE.getDateityp_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATEITYP_TYPE_CLASS__WERT = eINSTANCE.getDateityp_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Datum_Regelwerk_TypeClassImpl <em>Datum Regelwerk Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Datum_Regelwerk_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getDatum_Regelwerk_TypeClass()
		 * @generated
		 */
		EClass DATUM_REGELWERK_TYPE_CLASS = eINSTANCE.getDatum_Regelwerk_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATUM_REGELWERK_TYPE_CLASS__WERT = eINSTANCE.getDatum_Regelwerk_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.DB_GDI_Referenz_TypeClassImpl <em>DB GDI Referenz Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.DB_GDI_Referenz_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getDB_GDI_Referenz_TypeClass()
		 * @generated
		 */
		EClass DB_GDI_REFERENZ_TYPE_CLASS = eINSTANCE.getDB_GDI_Referenz_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_GDI_REFERENZ_TYPE_CLASS__WERT = eINSTANCE.getDB_GDI_Referenz_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Identitaet_TypeClassImpl <em>Identitaet Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Identitaet_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getIdentitaet_TypeClass()
		 * @generated
		 */
		EClass IDENTITAET_TYPE_CLASS = eINSTANCE.getIdentitaet_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTITAET_TYPE_CLASS__WERT = eINSTANCE.getIdentitaet_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Km_Massgebend_TypeClassImpl <em>Km Massgebend Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Km_Massgebend_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getKm_Massgebend_TypeClass()
		 * @generated
		 */
		EClass KM_MASSGEBEND_TYPE_CLASS = eINSTANCE.getKm_Massgebend_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KM_MASSGEBEND_TYPE_CLASS__WERT = eINSTANCE.getKm_Massgebend_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Kommentar_TypeClassImpl <em>Kommentar Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Kommentar_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getKommentar_TypeClass()
		 * @generated
		 */
		EClass KOMMENTAR_TYPE_CLASS = eINSTANCE.getKommentar_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KOMMENTAR_TYPE_CLASS__WERT = eINSTANCE.getKommentar_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Kurztext_TypeClassImpl <em>Kurztext Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Kurztext_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getKurztext_TypeClass()
		 * @generated
		 */
		EClass KURZTEXT_TYPE_CLASS = eINSTANCE.getKurztext_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KURZTEXT_TYPE_CLASS__WERT = eINSTANCE.getKurztext_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LieferobjektImpl <em>Lieferobjekt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LieferobjektImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLieferobjekt()
		 * @generated
		 */
		EClass LIEFEROBJEKT = eINSTANCE.getLieferobjekt();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEFEROBJEKT__BESCHREIBUNG = eINSTANCE.getLieferobjekt_Beschreibung();

		/**
		 * The meta object literal for the '<em><b>IDGEO Punkt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEFEROBJEKT__IDGEO_PUNKT = eINSTANCE.getLieferobjekt_IDGEOPunkt();

		/**
		 * The meta object literal for the '<em><b>IDLO Einbau</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEFEROBJEKT__IDLO_EINBAU = eINSTANCE.getLieferobjekt_IDLOEinbau();

		/**
		 * The meta object literal for the '<em><b>LO Ersatz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEFEROBJEKT__LO_ERSATZ = eINSTANCE.getLieferobjekt_LOErsatz();

		/**
		 * The meta object literal for the '<em><b>LO Material</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEFEROBJEKT__LO_MATERIAL = eINSTANCE.getLieferobjekt_LOMaterial();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Ausgabestand_TypeClassImpl <em>LO Ausgabestand Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Ausgabestand_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Ausgabestand_TypeClass()
		 * @generated
		 */
		EClass LO_AUSGABESTAND_TYPE_CLASS = eINSTANCE.getLO_Ausgabestand_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LO_AUSGABESTAND_TYPE_CLASS__WERT = eINSTANCE.getLO_Ausgabestand_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Datum_Herstellung_TypeClassImpl <em>LO Datum Herstellung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Datum_Herstellung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Datum_Herstellung_TypeClass()
		 * @generated
		 */
		EClass LO_DATUM_HERSTELLUNG_TYPE_CLASS = eINSTANCE.getLO_Datum_Herstellung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LO_DATUM_HERSTELLUNG_TYPE_CLASS__WERT = eINSTANCE.getLO_Datum_Herstellung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_DB_Freigabe_TypeClassImpl <em>LO DB Freigabe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_DB_Freigabe_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_DB_Freigabe_TypeClass()
		 * @generated
		 */
		EClass LO_DB_FREIGABE_TYPE_CLASS = eINSTANCE.getLO_DB_Freigabe_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LO_DB_FREIGABE_TYPE_CLASS__WERT = eINSTANCE.getLO_DB_Freigabe_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_EMA_Nr_TypeClassImpl <em>LO EMA Nr Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_EMA_Nr_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_EMA_Nr_TypeClass()
		 * @generated
		 */
		EClass LO_EMA_NR_TYPE_CLASS = eINSTANCE.getLO_EMA_Nr_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LO_EMA_NR_TYPE_CLASS__WERT = eINSTANCE.getLO_EMA_Nr_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Ersatz_TypeClassImpl <em>LO Ersatz Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Ersatz_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Ersatz_TypeClass()
		 * @generated
		 */
		EClass LO_ERSATZ_TYPE_CLASS = eINSTANCE.getLO_Ersatz_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LO_ERSATZ_TYPE_CLASS__WERT = eINSTANCE.getLO_Ersatz_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Firmensachnummer_TypeClassImpl <em>LO Firmensachnummer Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Firmensachnummer_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Firmensachnummer_TypeClass()
		 * @generated
		 */
		EClass LO_FIRMENSACHNUMMER_TYPE_CLASS = eINSTANCE.getLO_Firmensachnummer_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LO_FIRMENSACHNUMMER_TYPE_CLASS__WERT = eINSTANCE.getLO_Firmensachnummer_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Material_AttributeGroupImpl <em>LO Material Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Material_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Material_AttributeGroup()
		 * @generated
		 */
		EClass LO_MATERIAL_ATTRIBUTE_GROUP = eINSTANCE.getLO_Material_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>LO Ausgabestand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND = eINSTANCE.getLO_Material_AttributeGroup_LOAusgabestand();

		/**
		 * The meta object literal for the '<em><b>LO Datum Herstellung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG = eINSTANCE.getLO_Material_AttributeGroup_LODatumHerstellung();

		/**
		 * The meta object literal for the '<em><b>LODB Freigabe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE = eINSTANCE.getLO_Material_AttributeGroup_LODBFreigabe();

		/**
		 * The meta object literal for the '<em><b>LOEMA Nr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR = eINSTANCE.getLO_Material_AttributeGroup_LOEMANr();

		/**
		 * The meta object literal for the '<em><b>LO Firmensachnummer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER = eINSTANCE.getLO_Material_AttributeGroup_LOFirmensachnummer();

		/**
		 * The meta object literal for the '<em><b>LO Seriennummer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER = eINSTANCE.getLO_Material_AttributeGroup_LOSeriennummer();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Seriennummer_TypeClassImpl <em>LO Seriennummer Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LO_Seriennummer_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Seriennummer_TypeClass()
		 * @generated
		 */
		EClass LO_SERIENNUMMER_TYPE_CLASS = eINSTANCE.getLO_Seriennummer_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LO_SERIENNUMMER_TYPE_CLASS__WERT = eINSTANCE.getLO_Seriennummer_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LST_Objekt_Art_TypeClassImpl <em>LST Objekt Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.LST_Objekt_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLST_Objekt_Art_TypeClass()
		 * @generated
		 */
		EClass LST_OBJEKT_ART_TYPE_CLASS = eINSTANCE.getLST_Objekt_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LST_OBJEKT_ART_TYPE_CLASS__WERT = eINSTANCE.getLST_Objekt_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Objektreferenzen_AttributeGroupImpl <em>Objektreferenzen Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Objektreferenzen_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getObjektreferenzen_AttributeGroup()
		 * @generated
		 */
		EClass OBJEKTREFERENZEN_ATTRIBUTE_GROUP = eINSTANCE.getObjektreferenzen_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>DBGDI Referenz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJEKTREFERENZEN_ATTRIBUTE_GROUP__DBGDI_REFERENZ = eINSTANCE.getObjektreferenzen_AttributeGroup_DBGDIReferenz();

		/**
		 * The meta object literal for the '<em><b>Technischer Platz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJEKTREFERENZEN_ATTRIBUTE_GROUP__TECHNISCHER_PLATZ = eINSTANCE.getObjektreferenzen_AttributeGroup_TechnischerPlatz();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Objektzustand_Besonders_TypeClassImpl <em>Objektzustand Besonders Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Objektzustand_Besonders_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getObjektzustand_Besonders_TypeClass()
		 * @generated
		 */
		EClass OBJEKTZUSTAND_BESONDERS_TYPE_CLASS = eINSTANCE.getObjektzustand_Besonders_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJEKTZUSTAND_BESONDERS_TYPE_CLASS__WERT = eINSTANCE.getObjektzustand_Besonders_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Proxy_ObjektImpl <em>Proxy Objekt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Proxy_ObjektImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getProxy_Objekt()
		 * @generated
		 */
		EClass PROXY_OBJEKT = eINSTANCE.getProxy_Objekt();

		/**
		 * The meta object literal for the '<em><b>LST Objekt Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_OBJEKT__LST_OBJEKT_ART = eINSTANCE.getProxy_Objekt_LSTObjektArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl <em>Punkt Objekt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getPunkt_Objekt()
		 * @generated
		 */
		EClass PUNKT_OBJEKT = eINSTANCE.getPunkt_Objekt();

		/**
		 * The meta object literal for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE = eINSTANCE.getPunkt_Objekt_PunktObjektStrecke();

		/**
		 * The meta object literal for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE = eINSTANCE.getPunkt_Objekt_PunktObjektTOPKante();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_Objekt_Strecke_AttributeGroupImpl <em>Punkt Objekt Strecke Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_Objekt_Strecke_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getPunkt_Objekt_Strecke_AttributeGroup()
		 * @generated
		 */
		EClass PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP = eINSTANCE.getPunkt_Objekt_Strecke_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>ID Strecke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__ID_STRECKE = eINSTANCE.getPunkt_Objekt_Strecke_AttributeGroup_IDStrecke();

		/**
		 * The meta object literal for the '<em><b>Km Massgebend</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__KM_MASSGEBEND = eINSTANCE.getPunkt_Objekt_Strecke_AttributeGroup_KmMassgebend();

		/**
		 * The meta object literal for the '<em><b>Strecke Km</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM = eINSTANCE.getPunkt_Objekt_Strecke_AttributeGroup_StreckeKm();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_Objekt_TOP_Kante_AttributeGroupImpl <em>Punkt Objekt TOP Kante Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_Objekt_TOP_Kante_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getPunkt_Objekt_TOP_Kante_AttributeGroup()
		 * @generated
		 */
		EClass PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP = eINSTANCE.getPunkt_Objekt_TOP_Kante_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Abstand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND = eINSTANCE.getPunkt_Objekt_TOP_Kante_AttributeGroup_Abstand();

		/**
		 * The meta object literal for the '<em><b>IDGEO Punkt Berechnet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDGEO_PUNKT_BERECHNET = eINSTANCE.getPunkt_Objekt_TOP_Kante_AttributeGroup_IDGEOPunktBerechnet();

		/**
		 * The meta object literal for the '<em><b>IDTOP Kante</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDTOP_KANTE = eINSTANCE.getPunkt_Objekt_TOP_Kante_AttributeGroup_IDTOPKante();

		/**
		 * The meta object literal for the '<em><b>Wirkrichtung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG = eINSTANCE.getPunkt_Objekt_TOP_Kante_AttributeGroup_Wirkrichtung();

		/**
		 * The meta object literal for the '<em><b>Seitliche Lage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE = eINSTANCE.getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicheLage();

		/**
		 * The meta object literal for the '<em><b>Seitlicher Abstand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND = eINSTANCE.getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicherAbstand();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Richtungsbezug_TypeClassImpl <em>Richtungsbezug Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Richtungsbezug_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getRichtungsbezug_TypeClass()
		 * @generated
		 */
		EClass RICHTUNGSBEZUG_TYPE_CLASS = eINSTANCE.getRichtungsbezug_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICHTUNGSBEZUG_TYPE_CLASS__WERT = eINSTANCE.getRichtungsbezug_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Seitliche_Lage_TypeClassImpl <em>Seitliche Lage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Seitliche_Lage_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getSeitliche_Lage_TypeClass()
		 * @generated
		 */
		EClass SEITLICHE_LAGE_TYPE_CLASS = eINSTANCE.getSeitliche_Lage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEITLICHE_LAGE_TYPE_CLASS__WERT = eINSTANCE.getSeitliche_Lage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Seitlicher_Abstand_TypeClassImpl <em>Seitlicher Abstand Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Seitlicher_Abstand_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getSeitlicher_Abstand_TypeClass()
		 * @generated
		 */
		EClass SEITLICHER_ABSTAND_TYPE_CLASS = eINSTANCE.getSeitlicher_Abstand_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEITLICHER_ABSTAND_TYPE_CLASS__WERT = eINSTANCE.getSeitlicher_Abstand_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Strecke_Km_TypeClassImpl <em>Strecke Km Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Strecke_Km_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getStrecke_Km_TypeClass()
		 * @generated
		 */
		EClass STRECKE_KM_TYPE_CLASS = eINSTANCE.getStrecke_Km_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRECKE_KM_TYPE_CLASS__WERT = eINSTANCE.getStrecke_Km_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Technischer_Platz_TypeClassImpl <em>Technischer Platz Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Technischer_Platz_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getTechnischer_Platz_TypeClass()
		 * @generated
		 */
		EClass TECHNISCHER_PLATZ_TYPE_CLASS = eINSTANCE.getTechnischer_Platz_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNISCHER_PLATZ_TYPE_CLASS__WERT = eINSTANCE.getTechnischer_Platz_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Ur_ObjektImpl <em>Ur Objekt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Ur_ObjektImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getUr_Objekt()
		 * @generated
		 */
		EClass UR_OBJEKT = eINSTANCE.getUr_Objekt();

		/**
		 * The meta object literal for the '<em><b>Identitaet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UR_OBJEKT__IDENTITAET = eINSTANCE.getUr_Objekt_Identitaet();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Wirkrichtung_TypeClassImpl <em>Wirkrichtung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Wirkrichtung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getWirkrichtung_TypeClass()
		 * @generated
		 */
		EClass WIRKRICHTUNG_TYPE_CLASS = eINSTANCE.getWirkrichtung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRKRICHTUNG_TYPE_CLASS__WERT = eINSTANCE.getWirkrichtung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Zeit_Bearbeitungsvermerk_TypeClassImpl <em>Zeit Bearbeitungsvermerk Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.Zeit_Bearbeitungsvermerk_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getZeit_Bearbeitungsvermerk_TypeClass()
		 * @generated
		 */
		EClass ZEIT_BEARBEITUNGSVERMERK_TYPE_CLASS = eINSTANCE.getZeit_Bearbeitungsvermerk_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZEIT_BEARBEITUNGSVERMERK_TYPE_CLASS__WERT = eINSTANCE.getZeit_Bearbeitungsvermerk_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMAnhangArt <em>ENUM Anhang Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMAnhangArt
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMAnhangArt()
		 * @generated
		 */
		EEnum ENUM_ANHANG_ART = eINSTANCE.getENUMAnhangArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMBestandsrelevanz <em>ENUM Bestandsrelevanz</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMBestandsrelevanz
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMBestandsrelevanz()
		 * @generated
		 */
		EEnum ENUM_BESTANDSRELEVANZ = eINSTANCE.getENUMBestandsrelevanz();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMBVDarstellungInPlan <em>ENUMBV Darstellung In Plan</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMBVDarstellungInPlan
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMBVDarstellungInPlan()
		 * @generated
		 */
		EEnum ENUMBV_DARSTELLUNG_IN_PLAN = eINSTANCE.getENUMBVDarstellungInPlan();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMDateityp <em>ENUM Dateityp</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMDateityp
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMDateityp()
		 * @generated
		 */
		EEnum ENUM_DATEITYP = eINSTANCE.getENUMDateityp();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMLSTObjektArt <em>ENUMLST Objekt Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMLSTObjektArt
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMLSTObjektArt()
		 * @generated
		 */
		EEnum ENUMLST_OBJEKT_ART = eINSTANCE.getENUMLSTObjektArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMObjektzustandBesonders <em>ENUM Objektzustand Besonders</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMObjektzustandBesonders
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMObjektzustandBesonders()
		 * @generated
		 */
		EEnum ENUM_OBJEKTZUSTAND_BESONDERS = eINSTANCE.getENUMObjektzustandBesonders();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Basisobjekte.ENUMRolle <em>ENUM Rolle</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMRolle
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMRolle()
		 * @generated
		 */
		EEnum ENUM_ROLLE = eINSTANCE.getENUMRolle();

		/**
		 * The meta object literal for the '<em>Abstand Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getAbstand_Type()
		 * @generated
		 */
		EDataType ABSTAND_TYPE = eINSTANCE.getAbstand_Type();

		/**
		 * The meta object literal for the '<em>Begrenzung AType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBegrenzung_A_Type()
		 * @generated
		 */
		EDataType BEGRENZUNG_ATYPE = eINSTANCE.getBegrenzung_A_Type();

		/**
		 * The meta object literal for the '<em>Begrenzung BType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBegrenzung_B_Type()
		 * @generated
		 */
		EDataType BEGRENZUNG_BTYPE = eINSTANCE.getBegrenzung_B_Type();

		/**
		 * The meta object literal for the '<em>Beschreibung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBeschreibung_Type()
		 * @generated
		 */
		EDataType BESCHREIBUNG_TYPE = eINSTANCE.getBeschreibung_Type();

		/**
		 * The meta object literal for the '<em>BV Kategorie Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getBV_Kategorie_Type()
		 * @generated
		 */
		EDataType BV_KATEGORIE_TYPE = eINSTANCE.getBV_Kategorie_Type();

		/**
		 * The meta object literal for the '<em>DB GDI Referenz Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getDB_GDI_Referenz_Type()
		 * @generated
		 */
		EDataType DB_GDI_REFERENZ_TYPE = eINSTANCE.getDB_GDI_Referenz_Type();

		/**
		 * The meta object literal for the '<em>ENUM Anhang Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMAnhangArt
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMAnhangArtObject()
		 * @generated
		 */
		EDataType ENUM_ANHANG_ART_OBJECT = eINSTANCE.getENUMAnhangArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Bestandsrelevanz Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMBestandsrelevanz
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMBestandsrelevanzObject()
		 * @generated
		 */
		EDataType ENUM_BESTANDSRELEVANZ_OBJECT = eINSTANCE.getENUMBestandsrelevanzObject();

		/**
		 * The meta object literal for the '<em>ENUMBV Darstellung In Plan Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMBVDarstellungInPlan
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMBVDarstellungInPlanObject()
		 * @generated
		 */
		EDataType ENUMBV_DARSTELLUNG_IN_PLAN_OBJECT = eINSTANCE.getENUMBVDarstellungInPlanObject();

		/**
		 * The meta object literal for the '<em>ENUM Dateityp Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMDateityp
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMDateitypObject()
		 * @generated
		 */
		EDataType ENUM_DATEITYP_OBJECT = eINSTANCE.getENUMDateitypObject();

		/**
		 * The meta object literal for the '<em>ENUMLST Objekt Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMLSTObjektArt
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMLSTObjektArtObject()
		 * @generated
		 */
		EDataType ENUMLST_OBJEKT_ART_OBJECT = eINSTANCE.getENUMLSTObjektArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Objektzustand Besonders Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMObjektzustandBesonders
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMObjektzustandBesondersObject()
		 * @generated
		 */
		EDataType ENUM_OBJEKTZUSTAND_BESONDERS_OBJECT = eINSTANCE.getENUMObjektzustandBesondersObject();

		/**
		 * The meta object literal for the '<em>ENUM Rolle Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Basisobjekte.ENUMRolle
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getENUMRolleObject()
		 * @generated
		 */
		EDataType ENUM_ROLLE_OBJECT = eINSTANCE.getENUMRolleObject();

		/**
		 * The meta object literal for the '<em>Identitaet Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getIdentitaet_Type()
		 * @generated
		 */
		EDataType IDENTITAET_TYPE = eINSTANCE.getIdentitaet_Type();

		/**
		 * The meta object literal for the '<em>Kommentar Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getKommentar_Type()
		 * @generated
		 */
		EDataType KOMMENTAR_TYPE = eINSTANCE.getKommentar_Type();

		/**
		 * The meta object literal for the '<em>Kurztext Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getKurztext_Type()
		 * @generated
		 */
		EDataType KURZTEXT_TYPE = eINSTANCE.getKurztext_Type();

		/**
		 * The meta object literal for the '<em>LO Ausgabestand Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Ausgabestand_Type()
		 * @generated
		 */
		EDataType LO_AUSGABESTAND_TYPE = eINSTANCE.getLO_Ausgabestand_Type();

		/**
		 * The meta object literal for the '<em>LO DB Freigabe Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_DB_Freigabe_Type()
		 * @generated
		 */
		EDataType LO_DB_FREIGABE_TYPE = eINSTANCE.getLO_DB_Freigabe_Type();

		/**
		 * The meta object literal for the '<em>LO EMA Nr Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_EMA_Nr_Type()
		 * @generated
		 */
		EDataType LO_EMA_NR_TYPE = eINSTANCE.getLO_EMA_Nr_Type();

		/**
		 * The meta object literal for the '<em>LO Firmensachnummer Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Firmensachnummer_Type()
		 * @generated
		 */
		EDataType LO_FIRMENSACHNUMMER_TYPE = eINSTANCE.getLO_Firmensachnummer_Type();

		/**
		 * The meta object literal for the '<em>LO Seriennummer Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getLO_Seriennummer_Type()
		 * @generated
		 */
		EDataType LO_SERIENNUMMER_TYPE = eINSTANCE.getLO_Seriennummer_Type();

		/**
		 * The meta object literal for the '<em>Richtungsbezug Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.BasisTypen.ENUMWirkrichtung
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getRichtungsbezug_Type()
		 * @generated
		 */
		EDataType RICHTUNGSBEZUG_TYPE = eINSTANCE.getRichtungsbezug_Type();

		/**
		 * The meta object literal for the '<em>Seitliche Lage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getSeitliche_Lage_Type()
		 * @generated
		 */
		EDataType SEITLICHE_LAGE_TYPE = eINSTANCE.getSeitliche_Lage_Type();

		/**
		 * The meta object literal for the '<em>Seitlicher Abstand Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getSeitlicher_Abstand_Type()
		 * @generated
		 */
		EDataType SEITLICHER_ABSTAND_TYPE = eINSTANCE.getSeitlicher_Abstand_Type();

		/**
		 * The meta object literal for the '<em>Strecke Km Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getStrecke_Km_Type()
		 * @generated
		 */
		EDataType STRECKE_KM_TYPE = eINSTANCE.getStrecke_Km_Type();

		/**
		 * The meta object literal for the '<em>Technischer Platz Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl#getTechnischer_Platz_Type()
		 * @generated
		 */
		EDataType TECHNISCHER_PLATZ_TYPE = eINSTANCE.getTechnischer_Platz_Type();

	}

} //BasisobjektePackage
