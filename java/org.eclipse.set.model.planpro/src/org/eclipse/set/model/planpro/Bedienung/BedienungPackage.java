/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung;

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
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.planpro.Bedienung.BedienungFactory
 * @model kind="package"
 * @generated
 */
public interface BedienungPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Bedienung";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Bedienung/1.10.0.3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsBedienung";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BedienungPackage eINSTANCE = org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.A_Wert_TypeClassImpl <em>AWert Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.A_Wert_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getA_Wert_TypeClass()
	 * @generated
	 */
	int AWERT_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWERT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWERT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AWert Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWERT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Anbindung_IB2_TypeClassImpl <em>Anbindung IB2 Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Anbindung_IB2_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getAnbindung_IB2_TypeClass()
	 * @generated
	 */
	int ANBINDUNG_IB2_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANBINDUNG_IB2_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANBINDUNG_IB2_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anbindung IB2 Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANBINDUNG_IB2_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Anbindung_IB3_TypeClassImpl <em>Anbindung IB3 Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Anbindung_IB3_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getAnbindung_IB3_TypeClass()
	 * @generated
	 */
	int ANBINDUNG_IB3_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANBINDUNG_IB3_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANBINDUNG_IB3_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anbindung IB3 Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANBINDUNG_IB3_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.B_Wert_TypeClassImpl <em>BWert Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.B_Wert_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getB_Wert_TypeClass()
	 * @generated
	 */
	int BWERT_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWERT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWERT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BWert Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWERT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_AnrueckabschnittImpl <em>Bedien Anrueckabschnitt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_AnrueckabschnittImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Anrueckabschnitt()
	 * @generated
	 */
	int BEDIEN_ANRUECKABSCHNITT = 4;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANRUECKABSCHNITT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANRUECKABSCHNITT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANRUECKABSCHNITT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANRUECKABSCHNITT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANRUECKABSCHNITT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Gleis Abschnitt Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Gleis Abschnitt Darstellen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bedien Anrueckabschnitt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANRUECKABSCHNITT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupImpl <em>Bedien Anrueckabschnitt Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Bez Bed Anrueckabschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANRUECKABSCHNITT = 0;

	/**
	 * The number of structural features of the '<em>Bedien Anrueckabschnitt Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anzeige_ElementImpl <em>Bedien Anzeige Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anzeige_ElementImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Anzeige_Element()
	 * @generated
	 */
	int BEDIEN_ANZEIGE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bedien Anzeige Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Bedien Einrichtung Oertlich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID Verknuepftes Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bedien Anzeige Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anzeige_Element_Allg_AttributeGroupImpl <em>Bedien Anzeige Element Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anzeige_Element_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Anzeige_Element_Allg_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Melder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__MELDER = 0;

	/**
	 * The feature id for the '<em><b>Schalter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__SCHALTER = 1;

	/**
	 * The feature id for the '<em><b>Taste</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__TASTE = 2;

	/**
	 * The number of structural features of the '<em>Bedien Anzeige Element Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anzeige_Element_Bezeichnung_AttributeGroupImpl <em>Bedien Anzeige Element Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anzeige_Element_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Anzeige_Element_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Bez Bed Anzeige Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Bedien Anzeige Element Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_BezirkImpl <em>Bedien Bezirk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_BezirkImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Bezirk()
	 * @generated
	 */
	int BEDIEN_BEZIRK = 9;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bedien Bezirk Adressformel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK__BEDIEN_BEZIRK_ADRESSFORMEL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bedien Bezirk Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK__BEDIEN_BEZIRK_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bedien Bezirk Anhaenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK__BEDIEN_BEZIRK_ANHAENGE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID Bedien Zentrale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK__ID_BEDIEN_ZENTRALE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bedien Bezirk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Adressformel_AttributeGroupImpl <em>Bedien Bezirk Adressformel Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Adressformel_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Bezirk_Adressformel_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP = 10;

	/**
	 * The feature id for the '<em><b>AWert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__AWERT = 0;

	/**
	 * The feature id for the '<em><b>BWert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__BWERT = 1;

	/**
	 * The feature id for the '<em><b>CWert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__CWERT = 2;

	/**
	 * The feature id for the '<em><b>DD Wert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__DD_WERT = 3;

	/**
	 * The feature id for the '<em><b>XWert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__XWERT = 4;

	/**
	 * The feature id for the '<em><b>YWert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YWERT = 5;

	/**
	 * The feature id for the '<em><b>YY Wert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YY_WERT = 6;

	/**
	 * The number of structural features of the '<em>Bedien Bezirk Adressformel Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Allg_AttributeGroupImpl <em>Bedien Bezirk Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Bezirk_Allg_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Anbindung IB2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB2 = 0;

	/**
	 * The feature id for the '<em><b>Anbindung IB3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB3 = 1;

	/**
	 * The feature id for the '<em><b>Hersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__HERSTELLER = 2;

	/**
	 * The feature id for the '<em><b>Schrankreihe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__SCHRANKREIHE = 3;

	/**
	 * The feature id for the '<em><b>Steuerbezirksname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNAME = 4;

	/**
	 * The feature id for the '<em><b>Steuerbezirksnummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNUMMER = 5;

	/**
	 * The number of structural features of the '<em>Bedien Bezirk Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Anhaenge_AttributeGroupImpl <em>Bedien Bezirk Anhaenge Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Anhaenge_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Bezirk_Anhaenge_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP = 12;

	/**
	 * The feature id for the '<em><b>ID Anhang Anbindung IB2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2 = 0;

	/**
	 * The feature id for the '<em><b>ID Anhang Anbindung IB3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3 = 1;

	/**
	 * The feature id for the '<em><b>ID Anhang Steuerbez Uebersicht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT = 2;

	/**
	 * The number of structural features of the '<em>Bedien Bezirk Anhaenge Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Bauart_TypeClassImpl <em>Bedien Einricht Bauart Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Bauart_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Einricht_Bauart_TypeClass()
	 * @generated
	 */
	int BEDIEN_EINRICHT_BAUART_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHT_BAUART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHT_BAUART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bedien Einricht Bauart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHT_BAUART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Oertl_Bez_TypeClassImpl <em>Bedien Einricht Oertl Bez Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Oertl_Bez_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Einricht_Oertl_Bez_TypeClass()
	 * @generated
	 */
	int BEDIEN_EINRICHT_OERTL_BEZ_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHT_OERTL_BEZ_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHT_OERTL_BEZ_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bedien Einricht Oertl Bez Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHT_OERTL_BEZ_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Oertlich_Allg_AttributeGroupImpl <em>Bedien Einricht Oertlich Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Oertlich_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Einricht_Oertlich_Allg_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Bedien Einricht Bauart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_BAUART = 0;

	/**
	 * The feature id for the '<em><b>Hupe Anschaltzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__HUPE_ANSCHALTZEIT = 1;

	/**
	 * The number of structural features of the '<em>Bedien Einricht Oertlich Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einrichtung_OertlichImpl <em>Bedien Einrichtung Oertlich</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einrichtung_OertlichImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Einrichtung_Oertlich()
	 * @generated
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH = 16;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bedien Einricht Oertlich Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Anhang Benutzeroberflaeche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID Aussenelementansteuerung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bedien Einrichtung Oertlich</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupImpl <em>Bedien Einrichtung Oertlich Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Bedien Einricht Oertl Bez</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_OERTL_BEZ = 0;

	/**
	 * The number of structural features of the '<em>Bedien Einrichtung Oertlich Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_GBTImpl <em>Bedien GBT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_GBTImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_GBT()
	 * @generated
	 */
	int BEDIEN_GBT = 18;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_GBT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_GBT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_GBT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_GBT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_GBT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bedien GBT Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_GBT__BEDIEN_GBT_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Anhang Vorgabe GBT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_GBT__ID_ANHANG_VORGABE_GBT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Bedien Bezirk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_GBT__ID_BEDIEN_BEZIRK = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bedien GBT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_GBT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_GBT_Allg_AttributeGroupImpl <em>Bedien GBT Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_GBT_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_GBT_Allg_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP = 19;

	/**
	 * The feature id for the '<em><b>Rueckschauzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__RUECKSCHAUZEIT = 0;

	/**
	 * The feature id for the '<em><b>Vorschauzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__VORSCHAUZEIT = 1;

	/**
	 * The number of structural features of the '<em>Bedien GBT Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_OberflaecheImpl <em>Bedien Oberflaeche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_OberflaecheImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Oberflaeche()
	 * @generated
	 */
	int BEDIEN_OBERFLAECHE = 20;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bedien Oberflaeche Anhaenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Bedien Bezirk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bedien Oberflaeche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl <em>Bedien Oberflaeche Anhaenge Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Oberflaeche_Anhaenge_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP = 21;

	/**
	 * The feature id for the '<em><b>ID Anhang Monitoraufteilung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG = 0;

	/**
	 * The feature id for the '<em><b>ID Anhang Richtungssinn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN = 1;

	/**
	 * The feature id for the '<em><b>ID Anhang Vorgabe BELU</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU = 2;

	/**
	 * The number of structural features of the '<em>Bedien Oberflaeche Anhaenge Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_BildImpl <em>Bedien Oberflaeche Bild</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_BildImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Oberflaeche_Bild()
	 * @generated
	 */
	int BEDIEN_OBERFLAECHE_BILD = 22;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_BILD__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_BILD__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_BILD__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_BILD__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bedien Oberflaeche Bild Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Bedien Oberflaeche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bedien Oberflaeche Bild</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_BILD_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_Bild_Allg_AttributeGroupImpl <em>Bedien Oberflaeche Bild Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_Bild_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Oberflaeche_Bild_Allg_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP = 23;

	/**
	 * The feature id for the '<em><b>Oberflaeche Bildart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_BILDART = 0;

	/**
	 * The feature id for the '<em><b>Oberflaeche Zustaendigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_ZUSTAENDIGKEIT = 1;

	/**
	 * The number of structural features of the '<em>Bedien Oberflaeche Bild Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_OertlichkeitImpl <em>Bedien Oertlichkeit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_OertlichkeitImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Oertlichkeit()
	 * @generated
	 */
	int BEDIEN_OERTLICHKEIT = 24;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OERTLICHKEIT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OERTLICHKEIT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OERTLICHKEIT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OERTLICHKEIT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bedien Oertlichkeit Kennzahlen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Bedien Bezirk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bedien Oertlichkeit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OERTLICHKEIT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oertlichkeit_Kennzahlen_AttributeGroupImpl <em>Bedien Oertlichkeit Kennzahlen Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oertlichkeit_Kennzahlen_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Oertlichkeit_Kennzahlen_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP = 25;

	/**
	 * The feature id for the '<em><b>Betriebsstellenbezeichner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__BETRIEBSSTELLENBEZEICHNER = 0;

	/**
	 * The feature id for the '<em><b>Kennzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__KENNZAHL = 1;

	/**
	 * The number of structural features of the '<em>Bedien Oertlichkeit Kennzahlen Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_PlatzImpl <em>Bedien Platz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_PlatzImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Platz()
	 * @generated
	 */
	int BEDIEN_PLATZ = 26;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bedien Platz Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Anhang Moebelplan Aufriss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Anhang Moebelplan Grundriss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ__ID_UNTERBRINGUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ID Bedien Bezirk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ__ID_BEDIEN_BEZIRK = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>IDESTW Zentraleinheit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Bedien Platz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Platz_Allg_AttributeGroupImpl <em>Bedien Platz Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Platz_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Platz_Allg_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP = 27;

	/**
	 * The feature id for the '<em><b>Bedien Platz Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIEN_PLATZ_ART = 0;

	/**
	 * The feature id for the '<em><b>Bedienplatzbezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZBEZEICHNUNG = 1;

	/**
	 * The feature id for the '<em><b>Bedienplatznummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZNUMMER = 2;

	/**
	 * The feature id for the '<em><b>Bedienraumnummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENRAUMNUMMER = 3;

	/**
	 * The number of structural features of the '<em>Bedien Platz Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Platz_Art_TypeClassImpl <em>Bedien Platz Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Platz_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Platz_Art_TypeClass()
	 * @generated
	 */
	int BEDIEN_PLATZ_ART_TYPE_CLASS = 28;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bedien Platz Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_PLATZ_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_StandortImpl <em>Bedien Standort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_StandortImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Standort()
	 * @generated
	 */
	int BEDIEN_STANDORT = 29;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_STANDORT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_STANDORT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_STANDORT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_STANDORT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_STANDORT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_STANDORT__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BSOIP Adressblock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_STANDORT__BSOIP_ADRESSBLOCK = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_STANDORT__ID_UNTERBRINGUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bedien Standort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_STANDORT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Standort_Bezeichnung_AttributeGroupImpl <em>Bedien Standort Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Standort_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Standort_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP = 30;

	/**
	 * The feature id for the '<em><b>Bezeichnung BSO</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BSO = 0;

	/**
	 * The number of structural features of the '<em>Bedien Standort Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_ZentraleImpl <em>Bedien Zentrale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_ZentraleImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Zentrale()
	 * @generated
	 */
	int BEDIEN_ZENTRALE = 31;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ZENTRALE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ZENTRALE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ZENTRALE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ZENTRALE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ZENTRALE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Anhang Plan Bedienraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Anhang Plan Rechnerraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ZENTRALE__ID_STRECKE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ZENTRALE__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ZENTRALE__ID_OERTLICHKEIT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bedien Zentrale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ZENTRALE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Zentrale_Bezeichnung_AttributeGroupImpl <em>Bedien Zentrale Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Zentrale_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Zentrale_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP = 32;

	/**
	 * The feature id for the '<em><b>Bez Bed Zentrale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ZENTRALE = 0;

	/**
	 * The number of structural features of the '<em>Bedien Zentrale Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedienplatzbezeichnung_TypeClassImpl <em>Bedienplatzbezeichnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedienplatzbezeichnung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedienplatzbezeichnung_TypeClass()
	 * @generated
	 */
	int BEDIENPLATZBEZEICHNUNG_TYPE_CLASS = 33;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIENPLATZBEZEICHNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIENPLATZBEZEICHNUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bedienplatzbezeichnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIENPLATZBEZEICHNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedienplatznummer_TypeClassImpl <em>Bedienplatznummer Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedienplatznummer_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedienplatznummer_TypeClass()
	 * @generated
	 */
	int BEDIENPLATZNUMMER_TYPE_CLASS = 34;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIENPLATZNUMMER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIENPLATZNUMMER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bedienplatznummer Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIENPLATZNUMMER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedienraumnummer_TypeClassImpl <em>Bedienraumnummer Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedienraumnummer_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedienraumnummer_TypeClass()
	 * @generated
	 */
	int BEDIENRAUMNUMMER_TYPE_CLASS = 35;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIENRAUMNUMMER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIENRAUMNUMMER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bedienraumnummer Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDIENRAUMNUMMER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Betriebsstellenbezeichner_TypeClassImpl <em>Betriebsstellenbezeichner Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Betriebsstellenbezeichner_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBetriebsstellenbezeichner_TypeClass()
	 * @generated
	 */
	int BETRIEBSSTELLENBEZEICHNER_TYPE_CLASS = 36;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETRIEBSSTELLENBEZEICHNER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETRIEBSSTELLENBEZEICHNER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Betriebsstellenbezeichner Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETRIEBSSTELLENBEZEICHNER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bez_Bed_Anrueckabschnitt_TypeClassImpl <em>Bez Bed Anrueckabschnitt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bez_Bed_Anrueckabschnitt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBez_Bed_Anrueckabschnitt_TypeClass()
	 * @generated
	 */
	int BEZ_BED_ANRUECKABSCHNITT_TYPE_CLASS = 37;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_BED_ANRUECKABSCHNITT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_BED_ANRUECKABSCHNITT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bez Bed Anrueckabschnitt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_BED_ANRUECKABSCHNITT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bez_Bed_Anzeige_Element_TypeClassImpl <em>Bez Bed Anzeige Element Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bez_Bed_Anzeige_Element_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBez_Bed_Anzeige_Element_TypeClass()
	 * @generated
	 */
	int BEZ_BED_ANZEIGE_ELEMENT_TYPE_CLASS = 38;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_BED_ANZEIGE_ELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_BED_ANZEIGE_ELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bez Bed Anzeige Element Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_BED_ANZEIGE_ELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bez_Bed_Zentrale_TypeClassImpl <em>Bez Bed Zentrale Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bez_Bed_Zentrale_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBez_Bed_Zentrale_TypeClass()
	 * @generated
	 */
	int BEZ_BED_ZENTRALE_TYPE_CLASS = 39;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_BED_ZENTRALE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_BED_ZENTRALE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bez Bed Zentrale Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_BED_ZENTRALE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bezeichnung_BSO_TypeClassImpl <em>Bezeichnung BSO Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bezeichnung_BSO_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBezeichnung_BSO_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_BSO_TYPE_CLASS = 40;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BSO_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BSO_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung BSO Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BSO_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.BSO_IP_AB_Teilsystem_AttributeGroupImpl <em>BSO IP AB Teilsystem Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BSO_IP_AB_Teilsystem_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBSO_IP_AB_Teilsystem_AttributeGroup()
	 * @generated
	 */
	int BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP = 41;

	/**
	 * The feature id for the '<em><b>BSO Teilsystem Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__BSO_TEILSYSTEM_ART = 0;

	/**
	 * The feature id for the '<em><b>IP Adressblock Blau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU = 1;

	/**
	 * The feature id for the '<em><b>IP Adressblock Grau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU = 2;

	/**
	 * The number of structural features of the '<em>BSO IP AB Teilsystem Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.BSO_IP_Adressblock_AttributeGroupImpl <em>BSO IP Adressblock Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BSO_IP_Adressblock_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBSO_IP_Adressblock_AttributeGroup()
	 * @generated
	 */
	int BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP = 42;

	/**
	 * The feature id for the '<em><b>BSOIPAB Teilsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__BSOIPAB_TEILSYSTEM = 0;

	/**
	 * The feature id for the '<em><b>IP Adressblock Blau V4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4 = 1;

	/**
	 * The feature id for the '<em><b>IP Adressblock Blau V6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6 = 2;

	/**
	 * The feature id for the '<em><b>IP Adressblock Grau V4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4 = 3;

	/**
	 * The feature id for the '<em><b>IP Adressblock Grau V6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6 = 4;

	/**
	 * The feature id for the '<em><b>Regionalbereich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH = 5;

	/**
	 * The number of structural features of the '<em>BSO IP Adressblock Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.BSO_Teilsystem_Art_TypeClassImpl <em>BSO Teilsystem Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BSO_Teilsystem_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBSO_Teilsystem_Art_TypeClass()
	 * @generated
	 */
	int BSO_TEILSYSTEM_ART_TYPE_CLASS = 43;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_TEILSYSTEM_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_TEILSYSTEM_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BSO Teilsystem Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSO_TEILSYSTEM_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.C_Wert_TypeClassImpl <em>CWert Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.C_Wert_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getC_Wert_TypeClass()
	 * @generated
	 */
	int CWERT_TYPE_CLASS = 44;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWERT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWERT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CWert Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWERT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.DD_Wert_TypeClassImpl <em>DD Wert Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.DD_Wert_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getDD_Wert_TypeClass()
	 * @generated
	 */
	int DD_WERT_TYPE_CLASS = 45;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_WERT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_WERT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DD Wert Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_WERT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Hersteller_TypeClassImpl <em>Hersteller Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Hersteller_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getHersteller_TypeClass()
	 * @generated
	 */
	int HERSTELLER_TYPE_CLASS = 46;

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
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Hupe_Anschaltzeit_TypeClassImpl <em>Hupe Anschaltzeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Hupe_Anschaltzeit_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getHupe_Anschaltzeit_TypeClass()
	 * @generated
	 */
	int HUPE_ANSCHALTZEIT_TYPE_CLASS = 47;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUPE_ANSCHALTZEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUPE_ANSCHALTZEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hupe Anschaltzeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUPE_ANSCHALTZEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Blau_TypeClassImpl <em>IP Adressblock Blau Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Blau_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Blau_TypeClass()
	 * @generated
	 */
	int IP_ADRESSBLOCK_BLAU_TYPE_CLASS = 48;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_BLAU_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_BLAU_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IP Adressblock Blau Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_BLAU_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Blau_V4_TypeClassImpl <em>IP Adressblock Blau V4 Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Blau_V4_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Blau_V4_TypeClass()
	 * @generated
	 */
	int IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS = 49;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IP Adressblock Blau V4 Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Blau_V6_TypeClassImpl <em>IP Adressblock Blau V6 Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Blau_V6_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Blau_V6_TypeClass()
	 * @generated
	 */
	int IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS = 50;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IP Adressblock Blau V6 Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Grau_TypeClassImpl <em>IP Adressblock Grau Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Grau_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Grau_TypeClass()
	 * @generated
	 */
	int IP_ADRESSBLOCK_GRAU_TYPE_CLASS = 51;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_GRAU_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_GRAU_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IP Adressblock Grau Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_GRAU_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Grau_V4_TypeClassImpl <em>IP Adressblock Grau V4 Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Grau_V4_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Grau_V4_TypeClass()
	 * @generated
	 */
	int IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS = 52;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IP Adressblock Grau V4 Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Grau_V6_TypeClassImpl <em>IP Adressblock Grau V6 Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Grau_V6_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Grau_V6_TypeClass()
	 * @generated
	 */
	int IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS = 53;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IP Adressblock Grau V6 Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Kennzahl_TypeClassImpl <em>Kennzahl Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Kennzahl_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getKennzahl_TypeClass()
	 * @generated
	 */
	int KENNZAHL_TYPE_CLASS = 54;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENNZAHL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENNZAHL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kennzahl Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KENNZAHL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Melder_TypeClassImpl <em>Melder Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Melder_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getMelder_TypeClass()
	 * @generated
	 */
	int MELDER_TYPE_CLASS = 55;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Melder Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Oberflaeche_Bildart_TypeClassImpl <em>Oberflaeche Bildart Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Oberflaeche_Bildart_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getOberflaeche_Bildart_TypeClass()
	 * @generated
	 */
	int OBERFLAECHE_BILDART_TYPE_CLASS = 56;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBERFLAECHE_BILDART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBERFLAECHE_BILDART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Oberflaeche Bildart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBERFLAECHE_BILDART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Oberflaeche_Zustaendigkeit_TypeClassImpl <em>Oberflaeche Zustaendigkeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Oberflaeche_Zustaendigkeit_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getOberflaeche_Zustaendigkeit_TypeClass()
	 * @generated
	 */
	int OBERFLAECHE_ZUSTAENDIGKEIT_TYPE_CLASS = 57;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBERFLAECHE_ZUSTAENDIGKEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBERFLAECHE_ZUSTAENDIGKEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Oberflaeche Zustaendigkeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBERFLAECHE_ZUSTAENDIGKEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Regionalbereich_TypeClassImpl <em>Regionalbereich Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Regionalbereich_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getRegionalbereich_TypeClass()
	 * @generated
	 */
	int REGIONALBEREICH_TYPE_CLASS = 58;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONALBEREICH_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONALBEREICH_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regionalbereich Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONALBEREICH_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Rueckschauzeit_TypeClassImpl <em>Rueckschauzeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Rueckschauzeit_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getRueckschauzeit_TypeClass()
	 * @generated
	 */
	int RUECKSCHAUZEIT_TYPE_CLASS = 59;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKSCHAUZEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKSCHAUZEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rueckschauzeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKSCHAUZEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Schalter_TypeClassImpl <em>Schalter Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Schalter_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSchalter_TypeClass()
	 * @generated
	 */
	int SCHALTER_TYPE_CLASS = 60;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schalter Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHALTER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Schrankreihe_TypeClassImpl <em>Schrankreihe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Schrankreihe_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSchrankreihe_TypeClass()
	 * @generated
	 */
	int SCHRANKREIHE_TYPE_CLASS = 61;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKREIHE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKREIHE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schrankreihe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRANKREIHE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Steuerbezirksname_TypeClassImpl <em>Steuerbezirksname Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Steuerbezirksname_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSteuerbezirksname_TypeClass()
	 * @generated
	 */
	int STEUERBEZIRKSNAME_TYPE_CLASS = 62;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEUERBEZIRKSNAME_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEUERBEZIRKSNAME_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Steuerbezirksname Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEUERBEZIRKSNAME_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Steuerbezirksnummer_TypeClassImpl <em>Steuerbezirksnummer Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Steuerbezirksnummer_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSteuerbezirksnummer_TypeClass()
	 * @generated
	 */
	int STEUERBEZIRKSNUMMER_TYPE_CLASS = 63;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEUERBEZIRKSNUMMER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEUERBEZIRKSNUMMER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Steuerbezirksnummer Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEUERBEZIRKSNUMMER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Taste_TypeClassImpl <em>Taste Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Taste_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getTaste_TypeClass()
	 * @generated
	 */
	int TASTE_TYPE_CLASS = 64;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Taste Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Vorschauzeit_TypeClassImpl <em>Vorschauzeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Vorschauzeit_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getVorschauzeit_TypeClass()
	 * @generated
	 */
	int VORSCHAUZEIT_TYPE_CLASS = 65;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORSCHAUZEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORSCHAUZEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vorschauzeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORSCHAUZEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.X_Wert_TypeClassImpl <em>XWert Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.X_Wert_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getX_Wert_TypeClass()
	 * @generated
	 */
	int XWERT_TYPE_CLASS = 66;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWERT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWERT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XWert Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWERT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Y_Wert_TypeClassImpl <em>YWert Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.Y_Wert_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getY_Wert_TypeClass()
	 * @generated
	 */
	int YWERT_TYPE_CLASS = 67;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YWERT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YWERT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YWert Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YWERT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.YY_Wert_TypeClassImpl <em>YY Wert Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.YY_Wert_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getYY_Wert_TypeClass()
	 * @generated
	 */
	int YY_WERT_TYPE_CLASS = 68;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YY_WERT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YY_WERT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YY Wert Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YY_WERT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMAWert <em>ENUMA Wert</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMAWert
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMAWert()
	 * @generated
	 */
	int ENUMA_WERT = 69;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMBedienEinrichtBauart <em>ENUM Bedien Einricht Bauart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBedienEinrichtBauart
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMBedienEinrichtBauart()
	 * @generated
	 */
	int ENUM_BEDIEN_EINRICHT_BAUART = 70;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMBedienPlatzArt <em>ENUM Bedien Platz Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBedienPlatzArt
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMBedienPlatzArt()
	 * @generated
	 */
	int ENUM_BEDIEN_PLATZ_ART = 71;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMBSOTeilsystemArt <em>ENUMBSO Teilsystem Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBSOTeilsystemArt
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMBSOTeilsystemArt()
	 * @generated
	 */
	int ENUMBSO_TEILSYSTEM_ART = 72;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMCWert <em>ENUMC Wert</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMCWert
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMCWert()
	 * @generated
	 */
	int ENUMC_WERT = 73;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMMelder <em>ENUM Melder</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMMelder
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMMelder()
	 * @generated
	 */
	int ENUM_MELDER = 74;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMOberflaecheBildart <em>ENUM Oberflaeche Bildart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMOberflaecheBildart
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMOberflaecheBildart()
	 * @generated
	 */
	int ENUM_OBERFLAECHE_BILDART = 75;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMSchalter <em>ENUM Schalter</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMSchalter
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMSchalter()
	 * @generated
	 */
	int ENUM_SCHALTER = 76;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMTaste <em>ENUM Taste</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMTaste
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMTaste()
	 * @generated
	 */
	int ENUM_TASTE = 77;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMXWert <em>ENUMX Wert</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMXWert
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMXWert()
	 * @generated
	 */
	int ENUMX_WERT = 78;

	/**
	 * The meta object id for the '<em>BWert Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getB_Wert_Type()
	 * @generated
	 */
	int BWERT_TYPE = 79;

	/**
	 * The meta object id for the '<em>Bedien Einricht Oertl Bez Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Einricht_Oertl_Bez_Type()
	 * @generated
	 */
	int BEDIEN_EINRICHT_OERTL_BEZ_TYPE = 80;

	/**
	 * The meta object id for the '<em>Bedienplatzbezeichnung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedienplatzbezeichnung_Type()
	 * @generated
	 */
	int BEDIENPLATZBEZEICHNUNG_TYPE = 81;

	/**
	 * The meta object id for the '<em>Bedienplatznummer Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedienplatznummer_Type()
	 * @generated
	 */
	int BEDIENPLATZNUMMER_TYPE = 82;

	/**
	 * The meta object id for the '<em>Bedienraumnummer Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedienraumnummer_Type()
	 * @generated
	 */
	int BEDIENRAUMNUMMER_TYPE = 83;

	/**
	 * The meta object id for the '<em>Betriebsstellenbezeichner Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBetriebsstellenbezeichner_Type()
	 * @generated
	 */
	int BETRIEBSSTELLENBEZEICHNER_TYPE = 84;

	/**
	 * The meta object id for the '<em>Bez Bed Anrueckabschnitt Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBez_Bed_Anrueckabschnitt_Type()
	 * @generated
	 */
	int BEZ_BED_ANRUECKABSCHNITT_TYPE = 85;

	/**
	 * The meta object id for the '<em>Bez Bed Anzeige Element Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBez_Bed_Anzeige_Element_Type()
	 * @generated
	 */
	int BEZ_BED_ANZEIGE_ELEMENT_TYPE = 86;

	/**
	 * The meta object id for the '<em>Bez Bed Zentrale Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBez_Bed_Zentrale_Type()
	 * @generated
	 */
	int BEZ_BED_ZENTRALE_TYPE = 87;

	/**
	 * The meta object id for the '<em>Bezeichnung BSO Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBezeichnung_BSO_Type()
	 * @generated
	 */
	int BEZEICHNUNG_BSO_TYPE = 88;

	/**
	 * The meta object id for the '<em>DD Wert Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getDD_Wert_Type()
	 * @generated
	 */
	int DD_WERT_TYPE = 89;

	/**
	 * The meta object id for the '<em>ENUMA Wert Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMAWert
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMAWertObject()
	 * @generated
	 */
	int ENUMA_WERT_OBJECT = 90;

	/**
	 * The meta object id for the '<em>ENUM Bedien Einricht Bauart Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBedienEinrichtBauart
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMBedienEinrichtBauartObject()
	 * @generated
	 */
	int ENUM_BEDIEN_EINRICHT_BAUART_OBJECT = 91;

	/**
	 * The meta object id for the '<em>ENUM Bedien Platz Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBedienPlatzArt
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMBedienPlatzArtObject()
	 * @generated
	 */
	int ENUM_BEDIEN_PLATZ_ART_OBJECT = 92;

	/**
	 * The meta object id for the '<em>ENUMBSO Teilsystem Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBSOTeilsystemArt
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMBSOTeilsystemArtObject()
	 * @generated
	 */
	int ENUMBSO_TEILSYSTEM_ART_OBJECT = 93;

	/**
	 * The meta object id for the '<em>ENUMC Wert Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMCWert
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMCWertObject()
	 * @generated
	 */
	int ENUMC_WERT_OBJECT = 94;

	/**
	 * The meta object id for the '<em>ENUM Melder Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMMelder
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMMelderObject()
	 * @generated
	 */
	int ENUM_MELDER_OBJECT = 95;

	/**
	 * The meta object id for the '<em>ENUM Oberflaeche Bildart Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMOberflaecheBildart
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMOberflaecheBildartObject()
	 * @generated
	 */
	int ENUM_OBERFLAECHE_BILDART_OBJECT = 96;

	/**
	 * The meta object id for the '<em>ENUM Schalter Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMSchalter
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMSchalterObject()
	 * @generated
	 */
	int ENUM_SCHALTER_OBJECT = 97;

	/**
	 * The meta object id for the '<em>ENUM Taste Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMTaste
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMTasteObject()
	 * @generated
	 */
	int ENUM_TASTE_OBJECT = 98;

	/**
	 * The meta object id for the '<em>ENUMX Wert Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMXWert
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMXWertObject()
	 * @generated
	 */
	int ENUMX_WERT_OBJECT = 99;

	/**
	 * The meta object id for the '<em>Hupe Anschaltzeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getHupe_Anschaltzeit_Type()
	 * @generated
	 */
	int HUPE_ANSCHALTZEIT_TYPE = 100;

	/**
	 * The meta object id for the '<em>IP Adressblock Blau Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Blau_Type()
	 * @generated
	 */
	int IP_ADRESSBLOCK_BLAU_TYPE = 101;

	/**
	 * The meta object id for the '<em>IP Adressblock Blau V4 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Blau_V4_Type()
	 * @generated
	 */
	int IP_ADRESSBLOCK_BLAU_V4_TYPE = 102;

	/**
	 * The meta object id for the '<em>IP Adressblock Blau V6 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Blau_V6_Type()
	 * @generated
	 */
	int IP_ADRESSBLOCK_BLAU_V6_TYPE = 103;

	/**
	 * The meta object id for the '<em>IP Adressblock Grau Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Grau_Type()
	 * @generated
	 */
	int IP_ADRESSBLOCK_GRAU_TYPE = 104;

	/**
	 * The meta object id for the '<em>IP Adressblock Grau V4 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Grau_V4_Type()
	 * @generated
	 */
	int IP_ADRESSBLOCK_GRAU_V4_TYPE = 105;

	/**
	 * The meta object id for the '<em>IP Adressblock Grau V6 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Grau_V6_Type()
	 * @generated
	 */
	int IP_ADRESSBLOCK_GRAU_V6_TYPE = 106;

	/**
	 * The meta object id for the '<em>Oberflaeche Zustaendigkeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getOberflaeche_Zustaendigkeit_Type()
	 * @generated
	 */
	int OBERFLAECHE_ZUSTAENDIGKEIT_TYPE = 107;

	/**
	 * The meta object id for the '<em>Rueckschauzeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getRueckschauzeit_Type()
	 * @generated
	 */
	int RUECKSCHAUZEIT_TYPE = 108;

	/**
	 * The meta object id for the '<em>Schrankreihe Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSchrankreihe_Type()
	 * @generated
	 */
	int SCHRANKREIHE_TYPE = 109;

	/**
	 * The meta object id for the '<em>Steuerbezirksname Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSteuerbezirksname_Type()
	 * @generated
	 */
	int STEUERBEZIRKSNAME_TYPE = 110;

	/**
	 * The meta object id for the '<em>Steuerbezirksnummer Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSteuerbezirksnummer_Type()
	 * @generated
	 */
	int STEUERBEZIRKSNUMMER_TYPE = 111;

	/**
	 * The meta object id for the '<em>Vorschauzeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getVorschauzeit_Type()
	 * @generated
	 */
	int VORSCHAUZEIT_TYPE = 112;

	/**
	 * The meta object id for the '<em>YWert Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getY_Wert_Type()
	 * @generated
	 */
	int YWERT_TYPE = 113;

	/**
	 * The meta object id for the '<em>YY Wert Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getYY_Wert_Type()
	 * @generated
	 */
	int YY_WERT_TYPE = 114;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.A_Wert_TypeClass <em>AWert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AWert Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.A_Wert_TypeClass
	 * @generated
	 */
	EClass getA_Wert_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.A_Wert_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.A_Wert_TypeClass#getWert()
	 * @see #getA_Wert_TypeClass()
	 * @generated
	 */
	EAttribute getA_Wert_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Anbindung_IB2_TypeClass <em>Anbindung IB2 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anbindung IB2 Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Anbindung_IB2_TypeClass
	 * @generated
	 */
	EClass getAnbindung_IB2_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Anbindung_IB2_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Anbindung_IB2_TypeClass#getWert()
	 * @see #getAnbindung_IB2_TypeClass()
	 * @generated
	 */
	EAttribute getAnbindung_IB2_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Anbindung_IB3_TypeClass <em>Anbindung IB3 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anbindung IB3 Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Anbindung_IB3_TypeClass
	 * @generated
	 */
	EClass getAnbindung_IB3_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Anbindung_IB3_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Anbindung_IB3_TypeClass#getWert()
	 * @see #getAnbindung_IB3_TypeClass()
	 * @generated
	 */
	EAttribute getAnbindung_IB3_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.B_Wert_TypeClass <em>BWert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BWert Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.B_Wert_TypeClass
	 * @generated
	 */
	EClass getB_Wert_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.B_Wert_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.B_Wert_TypeClass#getWert()
	 * @see #getB_Wert_TypeClass()
	 * @generated
	 */
	EAttribute getB_Wert_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt <em>Bedien Anrueckabschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Anrueckabschnitt</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt
	 * @generated
	 */
	EClass getBedien_Anrueckabschnitt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt#getIDGleisAbschnittPosition <em>ID Gleis Abschnitt Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Gleis Abschnitt Position</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt#getIDGleisAbschnittPosition()
	 * @see #getBedien_Anrueckabschnitt()
	 * @generated
	 */
	EReference getBedien_Anrueckabschnitt_IDGleisAbschnittPosition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt#getBezeichnung()
	 * @see #getBedien_Anrueckabschnitt()
	 * @generated
	 */
	EReference getBedien_Anrueckabschnitt_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt#getIDGleisAbschnittDarstellen <em>ID Gleis Abschnitt Darstellen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Gleis Abschnitt Darstellen</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt#getIDGleisAbschnittDarstellen()
	 * @see #getBedien_Anrueckabschnitt()
	 * @generated
	 */
	EReference getBedien_Anrueckabschnitt_IDGleisAbschnittDarstellen();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup <em>Bedien Anrueckabschnitt Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Anrueckabschnitt Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup#getBezBedAnrueckabschnitt <em>Bez Bed Anrueckabschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bez Bed Anrueckabschnitt</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup#getBezBedAnrueckabschnitt()
	 * @see #getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup_BezBedAnrueckabschnitt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element <em>Bedien Anzeige Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Anzeige Element</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element
	 * @generated
	 */
	EClass getBedien_Anzeige_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element#getBedienAnzeigeElementAllg <em>Bedien Anzeige Element Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedien Anzeige Element Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element#getBedienAnzeigeElementAllg()
	 * @see #getBedien_Anzeige_Element()
	 * @generated
	 */
	EReference getBedien_Anzeige_Element_BedienAnzeigeElementAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element#getBezeichnung()
	 * @see #getBedien_Anzeige_Element()
	 * @generated
	 */
	EReference getBedien_Anzeige_Element_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element#getIDBedienEinrichtungOertlich <em>ID Bedien Einrichtung Oertlich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bedien Einrichtung Oertlich</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element#getIDBedienEinrichtungOertlich()
	 * @see #getBedien_Anzeige_Element()
	 * @generated
	 */
	EReference getBedien_Anzeige_Element_IDBedienEinrichtungOertlich();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element#getIDVerknuepftesElement <em>ID Verknuepftes Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Verknuepftes Element</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element#getIDVerknuepftesElement()
	 * @see #getBedien_Anzeige_Element()
	 * @generated
	 */
	EReference getBedien_Anzeige_Element_IDVerknuepftesElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup <em>Bedien Anzeige Element Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Anzeige Element Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Anzeige_Element_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup#getMelder <em>Melder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Melder</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup#getMelder()
	 * @see #getBedien_Anzeige_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Anzeige_Element_Allg_AttributeGroup_Melder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup#getSchalter <em>Schalter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schalter</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup#getSchalter()
	 * @see #getBedien_Anzeige_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Anzeige_Element_Allg_AttributeGroup_Schalter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup#getTaste <em>Taste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Taste</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup#getTaste()
	 * @see #getBedien_Anzeige_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Anzeige_Element_Allg_AttributeGroup_Taste();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Bezeichnung_AttributeGroup <em>Bedien Anzeige Element Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Anzeige Element Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Anzeige_Element_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Bezeichnung_AttributeGroup#getBezBedAnzeigeElement <em>Bez Bed Anzeige Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bez Bed Anzeige Element</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Bezeichnung_AttributeGroup#getBezBedAnzeigeElement()
	 * @see #getBedien_Anzeige_Element_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Anzeige_Element_Bezeichnung_AttributeGroup_BezBedAnzeigeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk <em>Bedien Bezirk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Bezirk</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk
	 * @generated
	 */
	EClass getBedien_Bezirk();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk#getBedienBezirkAdressformel <em>Bedien Bezirk Adressformel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedien Bezirk Adressformel</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk#getBedienBezirkAdressformel()
	 * @see #getBedien_Bezirk()
	 * @generated
	 */
	EReference getBedien_Bezirk_BedienBezirkAdressformel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk#getBedienBezirkAllg <em>Bedien Bezirk Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedien Bezirk Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk#getBedienBezirkAllg()
	 * @see #getBedien_Bezirk()
	 * @generated
	 */
	EReference getBedien_Bezirk_BedienBezirkAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk#getBedienBezirkAnhaenge <em>Bedien Bezirk Anhaenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedien Bezirk Anhaenge</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk#getBedienBezirkAnhaenge()
	 * @see #getBedien_Bezirk()
	 * @generated
	 */
	EReference getBedien_Bezirk_BedienBezirkAnhaenge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk#getIDBedienZentrale <em>ID Bedien Zentrale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bedien Zentrale</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk#getIDBedienZentrale()
	 * @see #getBedien_Bezirk()
	 * @generated
	 */
	EReference getBedien_Bezirk_IDBedienZentrale();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup <em>Bedien Bezirk Adressformel Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Bezirk Adressformel Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Bezirk_Adressformel_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getAWert <em>AWert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>AWert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getAWert()
	 * @see #getBedien_Bezirk_Adressformel_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Adressformel_AttributeGroup_AWert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getBWert <em>BWert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BWert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getBWert()
	 * @see #getBedien_Bezirk_Adressformel_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Adressformel_AttributeGroup_BWert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getCWert <em>CWert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CWert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getCWert()
	 * @see #getBedien_Bezirk_Adressformel_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Adressformel_AttributeGroup_CWert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getDDWert <em>DD Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DD Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getDDWert()
	 * @see #getBedien_Bezirk_Adressformel_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Adressformel_AttributeGroup_DDWert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getXWert <em>XWert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XWert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getXWert()
	 * @see #getBedien_Bezirk_Adressformel_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Adressformel_AttributeGroup_XWert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getYWert <em>YWert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>YWert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getYWert()
	 * @see #getBedien_Bezirk_Adressformel_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Adressformel_AttributeGroup_YWert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getYYWert <em>YY Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>YY Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getYYWert()
	 * @see #getBedien_Bezirk_Adressformel_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Adressformel_AttributeGroup_YYWert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup <em>Bedien Bezirk Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Bezirk Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Bezirk_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getAnbindungIB2 <em>Anbindung IB2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anbindung IB2</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getAnbindungIB2()
	 * @see #getBedien_Bezirk_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB2();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getAnbindungIB3 <em>Anbindung IB3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anbindung IB3</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getAnbindungIB3()
	 * @see #getBedien_Bezirk_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB3();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hersteller</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getHersteller()
	 * @see #getBedien_Bezirk_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Allg_AttributeGroup_Hersteller();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getSchrankreihe <em>Schrankreihe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schrankreihe</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getSchrankreihe()
	 * @see #getBedien_Bezirk_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Allg_AttributeGroup_Schrankreihe();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getSteuerbezirksname <em>Steuerbezirksname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Steuerbezirksname</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getSteuerbezirksname()
	 * @see #getBedien_Bezirk_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksname();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getSteuerbezirksnummer <em>Steuerbezirksnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Steuerbezirksnummer</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getSteuerbezirksnummer()
	 * @see #getBedien_Bezirk_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksnummer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup <em>Bedien Bezirk Anhaenge Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Bezirk Anhaenge Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Bezirk_Anhaenge_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB2 <em>ID Anhang Anbindung IB2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Anbindung IB2</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB2()
	 * @see #getBedien_Bezirk_Anhaenge_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB2();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB3 <em>ID Anhang Anbindung IB3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Anbindung IB3</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB3()
	 * @see #getBedien_Bezirk_Anhaenge_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB3();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangSteuerbezUebersicht <em>ID Anhang Steuerbez Uebersicht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Steuerbez Uebersicht</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangSteuerbezUebersicht()
	 * @see #getBedien_Bezirk_Anhaenge_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangSteuerbezUebersicht();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Bauart_TypeClass <em>Bedien Einricht Bauart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Einricht Bauart Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Bauart_TypeClass
	 * @generated
	 */
	EClass getBedien_Einricht_Bauart_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Bauart_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Bauart_TypeClass#getWert()
	 * @see #getBedien_Einricht_Bauart_TypeClass()
	 * @generated
	 */
	EAttribute getBedien_Einricht_Bauart_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertl_Bez_TypeClass <em>Bedien Einricht Oertl Bez Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Einricht Oertl Bez Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertl_Bez_TypeClass
	 * @generated
	 */
	EClass getBedien_Einricht_Oertl_Bez_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertl_Bez_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertl_Bez_TypeClass#getWert()
	 * @see #getBedien_Einricht_Oertl_Bez_TypeClass()
	 * @generated
	 */
	EAttribute getBedien_Einricht_Oertl_Bez_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup <em>Bedien Einricht Oertlich Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Einricht Oertlich Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Einricht_Oertlich_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup#getBedienEinrichtBauart <em>Bedien Einricht Bauart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedien Einricht Bauart</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup#getBedienEinrichtBauart()
	 * @see #getBedien_Einricht_Oertlich_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Einricht_Oertlich_Allg_AttributeGroup_BedienEinrichtBauart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup#getHupeAnschaltzeit <em>Hupe Anschaltzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hupe Anschaltzeit</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup#getHupeAnschaltzeit()
	 * @see #getBedien_Einricht_Oertlich_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Einricht_Oertlich_Allg_AttributeGroup_HupeAnschaltzeit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich <em>Bedien Einrichtung Oertlich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Einrichtung Oertlich</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich
	 * @generated
	 */
	EClass getBedien_Einrichtung_Oertlich();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich#getBedienEinrichtOertlichAllg <em>Bedien Einricht Oertlich Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedien Einricht Oertlich Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich#getBedienEinrichtOertlichAllg()
	 * @see #getBedien_Einrichtung_Oertlich()
	 * @generated
	 */
	EReference getBedien_Einrichtung_Oertlich_BedienEinrichtOertlichAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich#getBezeichnung()
	 * @see #getBedien_Einrichtung_Oertlich()
	 * @generated
	 */
	EReference getBedien_Einrichtung_Oertlich_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich#getIDAnhangBenutzeroberflaeche <em>ID Anhang Benutzeroberflaeche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Benutzeroberflaeche</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich#getIDAnhangBenutzeroberflaeche()
	 * @see #getBedien_Einrichtung_Oertlich()
	 * @generated
	 */
	EReference getBedien_Einrichtung_Oertlich_IDAnhangBenutzeroberflaeche();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Aussenelementansteuerung</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich#getIDAussenelementansteuerung()
	 * @see #getBedien_Einrichtung_Oertlich()
	 * @generated
	 */
	EReference getBedien_Einrichtung_Oertlich_IDAussenelementansteuerung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich#getIDUnterbringung <em>ID Unterbringung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Unterbringung</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich#getIDUnterbringung()
	 * @see #getBedien_Einrichtung_Oertlich()
	 * @generated
	 */
	EReference getBedien_Einrichtung_Oertlich_IDUnterbringung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup <em>Bedien Einrichtung Oertlich Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Einrichtung Oertlich Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup#getBedienEinrichtOertlBez <em>Bedien Einricht Oertl Bez</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedien Einricht Oertl Bez</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup#getBedienEinrichtOertlBez()
	 * @see #getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup_BedienEinrichtOertlBez();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_GBT <em>Bedien GBT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien GBT</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_GBT
	 * @generated
	 */
	EClass getBedien_GBT();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_GBT#getBedienGBTAllg <em>Bedien GBT Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedien GBT Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_GBT#getBedienGBTAllg()
	 * @see #getBedien_GBT()
	 * @generated
	 */
	EReference getBedien_GBT_BedienGBTAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_GBT#getIDAnhangVorgabeGBT <em>ID Anhang Vorgabe GBT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Vorgabe GBT</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_GBT#getIDAnhangVorgabeGBT()
	 * @see #getBedien_GBT()
	 * @generated
	 */
	EReference getBedien_GBT_IDAnhangVorgabeGBT();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_GBT#getIDBedienBezirk <em>ID Bedien Bezirk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bedien Bezirk</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_GBT#getIDBedienBezirk()
	 * @see #getBedien_GBT()
	 * @generated
	 */
	EReference getBedien_GBT_IDBedienBezirk();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_GBT_Allg_AttributeGroup <em>Bedien GBT Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien GBT Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_GBT_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBedien_GBT_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_GBT_Allg_AttributeGroup#getRueckschauzeit <em>Rueckschauzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rueckschauzeit</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_GBT_Allg_AttributeGroup#getRueckschauzeit()
	 * @see #getBedien_GBT_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_GBT_Allg_AttributeGroup_Rueckschauzeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_GBT_Allg_AttributeGroup#getVorschauzeit <em>Vorschauzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vorschauzeit</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_GBT_Allg_AttributeGroup#getVorschauzeit()
	 * @see #getBedien_GBT_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_GBT_Allg_AttributeGroup_Vorschauzeit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche <em>Bedien Oberflaeche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Oberflaeche</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche
	 * @generated
	 */
	EClass getBedien_Oberflaeche();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche#getBedienOberflaecheAnhaenge <em>Bedien Oberflaeche Anhaenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedien Oberflaeche Anhaenge</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche#getBedienOberflaecheAnhaenge()
	 * @see #getBedien_Oberflaeche()
	 * @generated
	 */
	EReference getBedien_Oberflaeche_BedienOberflaecheAnhaenge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche#getIDBedienBezirk <em>ID Bedien Bezirk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bedien Bezirk</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche#getIDBedienBezirk()
	 * @see #getBedien_Oberflaeche()
	 * @generated
	 */
	EReference getBedien_Oberflaeche_IDBedienBezirk();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup <em>Bedien Oberflaeche Anhaenge Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Oberflaeche Anhaenge Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Oberflaeche_Anhaenge_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup#getIDAnhangMonitoraufteilung <em>ID Anhang Monitoraufteilung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Monitoraufteilung</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup#getIDAnhangMonitoraufteilung()
	 * @see #getBedien_Oberflaeche_Anhaenge_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangMonitoraufteilung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup#getIDAnhangRichtungssinn <em>ID Anhang Richtungssinn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Richtungssinn</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup#getIDAnhangRichtungssinn()
	 * @see #getBedien_Oberflaeche_Anhaenge_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangRichtungssinn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup#getIDAnhangVorgabeBELU <em>ID Anhang Vorgabe BELU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Vorgabe BELU</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup#getIDAnhangVorgabeBELU()
	 * @see #getBedien_Oberflaeche_Anhaenge_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangVorgabeBELU();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild <em>Bedien Oberflaeche Bild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Oberflaeche Bild</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild
	 * @generated
	 */
	EClass getBedien_Oberflaeche_Bild();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild#getBedienOberflaecheBildAllg <em>Bedien Oberflaeche Bild Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedien Oberflaeche Bild Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild#getBedienOberflaecheBildAllg()
	 * @see #getBedien_Oberflaeche_Bild()
	 * @generated
	 */
	EReference getBedien_Oberflaeche_Bild_BedienOberflaecheBildAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild#getIDBedienOberflaeche <em>ID Bedien Oberflaeche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bedien Oberflaeche</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild#getIDBedienOberflaeche()
	 * @see #getBedien_Oberflaeche_Bild()
	 * @generated
	 */
	EReference getBedien_Oberflaeche_Bild_IDBedienOberflaeche();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild#getIDOertlichkeit <em>ID Oertlichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Oertlichkeit</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild#getIDOertlichkeit()
	 * @see #getBedien_Oberflaeche_Bild()
	 * @generated
	 */
	EReference getBedien_Oberflaeche_Bild_IDOertlichkeit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup <em>Bedien Oberflaeche Bild Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Oberflaeche Bild Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Oberflaeche_Bild_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup#getOberflaecheBildart <em>Oberflaeche Bildart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oberflaeche Bildart</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup#getOberflaecheBildart()
	 * @see #getBedien_Oberflaeche_Bild_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheBildart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup#getOberflaecheZustaendigkeit <em>Oberflaeche Zustaendigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oberflaeche Zustaendigkeit</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup#getOberflaecheZustaendigkeit()
	 * @see #getBedien_Oberflaeche_Bild_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheZustaendigkeit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit <em>Bedien Oertlichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Oertlichkeit</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit
	 * @generated
	 */
	EClass getBedien_Oertlichkeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit#getBedienOertlichkeitKennzahlen <em>Bedien Oertlichkeit Kennzahlen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedien Oertlichkeit Kennzahlen</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit#getBedienOertlichkeitKennzahlen()
	 * @see #getBedien_Oertlichkeit()
	 * @generated
	 */
	EReference getBedien_Oertlichkeit_BedienOertlichkeitKennzahlen();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit#getIDBedienBezirk <em>ID Bedien Bezirk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bedien Bezirk</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit#getIDBedienBezirk()
	 * @see #getBedien_Oertlichkeit()
	 * @generated
	 */
	EReference getBedien_Oertlichkeit_IDBedienBezirk();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit#getIDOertlichkeit <em>ID Oertlichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Oertlichkeit</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit#getIDOertlichkeit()
	 * @see #getBedien_Oertlichkeit()
	 * @generated
	 */
	EReference getBedien_Oertlichkeit_IDOertlichkeit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup <em>Bedien Oertlichkeit Kennzahlen Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Oertlichkeit Kennzahlen Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Oertlichkeit_Kennzahlen_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup#getBetriebsstellenbezeichner <em>Betriebsstellenbezeichner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Betriebsstellenbezeichner</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup#getBetriebsstellenbezeichner()
	 * @see #getBedien_Oertlichkeit_Kennzahlen_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Betriebsstellenbezeichner();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup#getKennzahl <em>Kennzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kennzahl</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup#getKennzahl()
	 * @see #getBedien_Oertlichkeit_Kennzahlen_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Kennzahl();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz <em>Bedien Platz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Platz</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz
	 * @generated
	 */
	EClass getBedien_Platz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz#getBedienPlatzAllg <em>Bedien Platz Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedien Platz Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz#getBedienPlatzAllg()
	 * @see #getBedien_Platz()
	 * @generated
	 */
	EReference getBedien_Platz_BedienPlatzAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz#getIDAnhangMoebelplanAufriss <em>ID Anhang Moebelplan Aufriss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Moebelplan Aufriss</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz#getIDAnhangMoebelplanAufriss()
	 * @see #getBedien_Platz()
	 * @generated
	 */
	EReference getBedien_Platz_IDAnhangMoebelplanAufriss();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz#getIDAnhangMoebelplanGrundriss <em>ID Anhang Moebelplan Grundriss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Moebelplan Grundriss</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz#getIDAnhangMoebelplanGrundriss()
	 * @see #getBedien_Platz()
	 * @generated
	 */
	EReference getBedien_Platz_IDAnhangMoebelplanGrundriss();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz#getIDUnterbringung <em>ID Unterbringung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Unterbringung</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz#getIDUnterbringung()
	 * @see #getBedien_Platz()
	 * @generated
	 */
	EReference getBedien_Platz_IDUnterbringung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz#getIDBedienBezirk <em>ID Bedien Bezirk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bedien Bezirk</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz#getIDBedienBezirk()
	 * @see #getBedien_Platz()
	 * @generated
	 */
	EReference getBedien_Platz_IDBedienBezirk();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDESTW Zentraleinheit</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz#getIDESTWZentraleinheit()
	 * @see #getBedien_Platz()
	 * @generated
	 */
	EReference getBedien_Platz_IDESTWZentraleinheit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Allg_AttributeGroup <em>Bedien Platz Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Platz Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Platz_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienPlatzArt <em>Bedien Platz Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedien Platz Art</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienPlatzArt()
	 * @see #getBedien_Platz_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Platz_Allg_AttributeGroup_BedienPlatzArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienplatzbezeichnung <em>Bedienplatzbezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedienplatzbezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienplatzbezeichnung()
	 * @see #getBedien_Platz_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Platz_Allg_AttributeGroup_Bedienplatzbezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienplatznummer <em>Bedienplatznummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedienplatznummer</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienplatznummer()
	 * @see #getBedien_Platz_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Platz_Allg_AttributeGroup_Bedienplatznummer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienraumnummer <em>Bedienraumnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bedienraumnummer</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienraumnummer()
	 * @see #getBedien_Platz_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Platz_Allg_AttributeGroup_Bedienraumnummer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Art_TypeClass <em>Bedien Platz Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Platz Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Art_TypeClass
	 * @generated
	 */
	EClass getBedien_Platz_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Art_TypeClass#getWert()
	 * @see #getBedien_Platz_Art_TypeClass()
	 * @generated
	 */
	EAttribute getBedien_Platz_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Standort <em>Bedien Standort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Standort</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Standort
	 * @generated
	 */
	EClass getBedien_Standort();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Standort#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Standort#getBezeichnung()
	 * @see #getBedien_Standort()
	 * @generated
	 */
	EReference getBedien_Standort_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Standort#getBSOIPAdressblock <em>BSOIP Adressblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BSOIP Adressblock</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Standort#getBSOIPAdressblock()
	 * @see #getBedien_Standort()
	 * @generated
	 */
	EReference getBedien_Standort_BSOIPAdressblock();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Standort#getIDUnterbringung <em>ID Unterbringung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Unterbringung</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Standort#getIDUnterbringung()
	 * @see #getBedien_Standort()
	 * @generated
	 */
	EReference getBedien_Standort_IDUnterbringung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Standort_Bezeichnung_AttributeGroup <em>Bedien Standort Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Standort Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Standort_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Standort_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Standort_Bezeichnung_AttributeGroup#getBezeichnungBSO <em>Bezeichnung BSO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung BSO</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Standort_Bezeichnung_AttributeGroup#getBezeichnungBSO()
	 * @see #getBedien_Standort_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Standort_Bezeichnung_AttributeGroup_BezeichnungBSO();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale <em>Bedien Zentrale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Zentrale</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale
	 * @generated
	 */
	EClass getBedien_Zentrale();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale#getIDAnhangPlanBedienraum <em>ID Anhang Plan Bedienraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Plan Bedienraum</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale#getIDAnhangPlanBedienraum()
	 * @see #getBedien_Zentrale()
	 * @generated
	 */
	EReference getBedien_Zentrale_IDAnhangPlanBedienraum();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale#getIDAnhangPlanRechnerraum <em>ID Anhang Plan Rechnerraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang Plan Rechnerraum</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale#getIDAnhangPlanRechnerraum()
	 * @see #getBedien_Zentrale()
	 * @generated
	 */
	EReference getBedien_Zentrale_IDAnhangPlanRechnerraum();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale#getIDStrecke <em>ID Strecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Strecke</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale#getIDStrecke()
	 * @see #getBedien_Zentrale()
	 * @generated
	 */
	EReference getBedien_Zentrale_IDStrecke();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale#getBezeichnung()
	 * @see #getBedien_Zentrale()
	 * @generated
	 */
	EReference getBedien_Zentrale_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale#getIDOertlichkeit <em>ID Oertlichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Oertlichkeit</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale#getIDOertlichkeit()
	 * @see #getBedien_Zentrale()
	 * @generated
	 */
	EReference getBedien_Zentrale_IDOertlichkeit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale_Bezeichnung_AttributeGroup <em>Bedien Zentrale Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedien Zentrale Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getBedien_Zentrale_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale_Bezeichnung_AttributeGroup#getBezBedZentrale <em>Bez Bed Zentrale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bez Bed Zentrale</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale_Bezeichnung_AttributeGroup#getBezBedZentrale()
	 * @see #getBedien_Zentrale_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getBedien_Zentrale_Bezeichnung_AttributeGroup_BezBedZentrale();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedienplatzbezeichnung_TypeClass <em>Bedienplatzbezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedienplatzbezeichnung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedienplatzbezeichnung_TypeClass
	 * @generated
	 */
	EClass getBedienplatzbezeichnung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Bedienplatzbezeichnung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedienplatzbezeichnung_TypeClass#getWert()
	 * @see #getBedienplatzbezeichnung_TypeClass()
	 * @generated
	 */
	EAttribute getBedienplatzbezeichnung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedienplatznummer_TypeClass <em>Bedienplatznummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedienplatznummer Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedienplatznummer_TypeClass
	 * @generated
	 */
	EClass getBedienplatznummer_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Bedienplatznummer_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedienplatznummer_TypeClass#getWert()
	 * @see #getBedienplatznummer_TypeClass()
	 * @generated
	 */
	EAttribute getBedienplatznummer_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bedienraumnummer_TypeClass <em>Bedienraumnummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedienraumnummer Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedienraumnummer_TypeClass
	 * @generated
	 */
	EClass getBedienraumnummer_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Bedienraumnummer_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bedienraumnummer_TypeClass#getWert()
	 * @see #getBedienraumnummer_TypeClass()
	 * @generated
	 */
	EAttribute getBedienraumnummer_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Betriebsstellenbezeichner_TypeClass <em>Betriebsstellenbezeichner Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Betriebsstellenbezeichner Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Betriebsstellenbezeichner_TypeClass
	 * @generated
	 */
	EClass getBetriebsstellenbezeichner_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Betriebsstellenbezeichner_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Betriebsstellenbezeichner_TypeClass#getWert()
	 * @see #getBetriebsstellenbezeichner_TypeClass()
	 * @generated
	 */
	EAttribute getBetriebsstellenbezeichner_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anrueckabschnitt_TypeClass <em>Bez Bed Anrueckabschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bez Bed Anrueckabschnitt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anrueckabschnitt_TypeClass
	 * @generated
	 */
	EClass getBez_Bed_Anrueckabschnitt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anrueckabschnitt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anrueckabschnitt_TypeClass#getWert()
	 * @see #getBez_Bed_Anrueckabschnitt_TypeClass()
	 * @generated
	 */
	EAttribute getBez_Bed_Anrueckabschnitt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anzeige_Element_TypeClass <em>Bez Bed Anzeige Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bez Bed Anzeige Element Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anzeige_Element_TypeClass
	 * @generated
	 */
	EClass getBez_Bed_Anzeige_Element_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anzeige_Element_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anzeige_Element_TypeClass#getWert()
	 * @see #getBez_Bed_Anzeige_Element_TypeClass()
	 * @generated
	 */
	EAttribute getBez_Bed_Anzeige_Element_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Zentrale_TypeClass <em>Bez Bed Zentrale Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bez Bed Zentrale Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Zentrale_TypeClass
	 * @generated
	 */
	EClass getBez_Bed_Zentrale_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Zentrale_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Zentrale_TypeClass#getWert()
	 * @see #getBez_Bed_Zentrale_TypeClass()
	 * @generated
	 */
	EAttribute getBez_Bed_Zentrale_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Bezeichnung_BSO_TypeClass <em>Bezeichnung BSO Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung BSO Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bezeichnung_BSO_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_BSO_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Bezeichnung_BSO_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Bezeichnung_BSO_TypeClass#getWert()
	 * @see #getBezeichnung_BSO_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_BSO_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup <em>BSO IP AB Teilsystem Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSO IP AB Teilsystem Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup
	 * @generated
	 */
	EClass getBSO_IP_AB_Teilsystem_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup#getBSOTeilsystemArt <em>BSO Teilsystem Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BSO Teilsystem Art</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup#getBSOTeilsystemArt()
	 * @see #getBSO_IP_AB_Teilsystem_AttributeGroup()
	 * @generated
	 */
	EReference getBSO_IP_AB_Teilsystem_AttributeGroup_BSOTeilsystemArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup#getIPAdressblockBlau <em>IP Adressblock Blau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IP Adressblock Blau</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup#getIPAdressblockBlau()
	 * @see #getBSO_IP_AB_Teilsystem_AttributeGroup()
	 * @generated
	 */
	EReference getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockBlau();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup#getIPAdressblockGrau <em>IP Adressblock Grau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IP Adressblock Grau</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup#getIPAdressblockGrau()
	 * @see #getBSO_IP_AB_Teilsystem_AttributeGroup()
	 * @generated
	 */
	EReference getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockGrau();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup <em>BSO IP Adressblock Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSO IP Adressblock Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup
	 * @generated
	 */
	EClass getBSO_IP_Adressblock_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup#getBSOIPABTeilsystem <em>BSOIPAB Teilsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BSOIPAB Teilsystem</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup#getBSOIPABTeilsystem()
	 * @see #getBSO_IP_Adressblock_AttributeGroup()
	 * @generated
	 */
	EReference getBSO_IP_Adressblock_AttributeGroup_BSOIPABTeilsystem();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockBlauV4 <em>IP Adressblock Blau V4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IP Adressblock Blau V4</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockBlauV4()
	 * @see #getBSO_IP_Adressblock_AttributeGroup()
	 * @generated
	 */
	EReference getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockBlauV6 <em>IP Adressblock Blau V6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IP Adressblock Blau V6</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockBlauV6()
	 * @see #getBSO_IP_Adressblock_AttributeGroup()
	 * @generated
	 */
	EReference getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockGrauV4 <em>IP Adressblock Grau V4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IP Adressblock Grau V4</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockGrauV4()
	 * @see #getBSO_IP_Adressblock_AttributeGroup()
	 * @generated
	 */
	EReference getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockGrauV6 <em>IP Adressblock Grau V6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IP Adressblock Grau V6</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockGrauV6()
	 * @see #getBSO_IP_Adressblock_AttributeGroup()
	 * @generated
	 */
	EReference getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup#getRegionalbereich <em>Regionalbereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regionalbereich</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup#getRegionalbereich()
	 * @see #getBSO_IP_Adressblock_AttributeGroup()
	 * @generated
	 */
	EReference getBSO_IP_Adressblock_AttributeGroup_Regionalbereich();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.BSO_Teilsystem_Art_TypeClass <em>BSO Teilsystem Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSO Teilsystem Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_Teilsystem_Art_TypeClass
	 * @generated
	 */
	EClass getBSO_Teilsystem_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.BSO_Teilsystem_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.BSO_Teilsystem_Art_TypeClass#getWert()
	 * @see #getBSO_Teilsystem_Art_TypeClass()
	 * @generated
	 */
	EAttribute getBSO_Teilsystem_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.C_Wert_TypeClass <em>CWert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CWert Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.C_Wert_TypeClass
	 * @generated
	 */
	EClass getC_Wert_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.C_Wert_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.C_Wert_TypeClass#getWert()
	 * @see #getC_Wert_TypeClass()
	 * @generated
	 */
	EAttribute getC_Wert_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.DD_Wert_TypeClass <em>DD Wert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DD Wert Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.DD_Wert_TypeClass
	 * @generated
	 */
	EClass getDD_Wert_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.DD_Wert_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.DD_Wert_TypeClass#getWert()
	 * @see #getDD_Wert_TypeClass()
	 * @generated
	 */
	EAttribute getDD_Wert_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Hersteller_TypeClass <em>Hersteller Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hersteller Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Hersteller_TypeClass
	 * @generated
	 */
	EClass getHersteller_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Hersteller_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Hersteller_TypeClass#getWert()
	 * @see #getHersteller_TypeClass()
	 * @generated
	 */
	EAttribute getHersteller_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Hupe_Anschaltzeit_TypeClass <em>Hupe Anschaltzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hupe Anschaltzeit Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Hupe_Anschaltzeit_TypeClass
	 * @generated
	 */
	EClass getHupe_Anschaltzeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Hupe_Anschaltzeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Hupe_Anschaltzeit_TypeClass#getWert()
	 * @see #getHupe_Anschaltzeit_TypeClass()
	 * @generated
	 */
	EAttribute getHupe_Anschaltzeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_TypeClass <em>IP Adressblock Blau Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IP Adressblock Blau Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_TypeClass
	 * @generated
	 */
	EClass getIP_Adressblock_Blau_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_TypeClass#getWert()
	 * @see #getIP_Adressblock_Blau_TypeClass()
	 * @generated
	 */
	EAttribute getIP_Adressblock_Blau_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_V4_TypeClass <em>IP Adressblock Blau V4 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IP Adressblock Blau V4 Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_V4_TypeClass
	 * @generated
	 */
	EClass getIP_Adressblock_Blau_V4_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_V4_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_V4_TypeClass#getWert()
	 * @see #getIP_Adressblock_Blau_V4_TypeClass()
	 * @generated
	 */
	EAttribute getIP_Adressblock_Blau_V4_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_V6_TypeClass <em>IP Adressblock Blau V6 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IP Adressblock Blau V6 Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_V6_TypeClass
	 * @generated
	 */
	EClass getIP_Adressblock_Blau_V6_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_V6_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_V6_TypeClass#getWert()
	 * @see #getIP_Adressblock_Blau_V6_TypeClass()
	 * @generated
	 */
	EAttribute getIP_Adressblock_Blau_V6_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_TypeClass <em>IP Adressblock Grau Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IP Adressblock Grau Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_TypeClass
	 * @generated
	 */
	EClass getIP_Adressblock_Grau_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_TypeClass#getWert()
	 * @see #getIP_Adressblock_Grau_TypeClass()
	 * @generated
	 */
	EAttribute getIP_Adressblock_Grau_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_V4_TypeClass <em>IP Adressblock Grau V4 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IP Adressblock Grau V4 Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_V4_TypeClass
	 * @generated
	 */
	EClass getIP_Adressblock_Grau_V4_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_V4_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_V4_TypeClass#getWert()
	 * @see #getIP_Adressblock_Grau_V4_TypeClass()
	 * @generated
	 */
	EAttribute getIP_Adressblock_Grau_V4_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_V6_TypeClass <em>IP Adressblock Grau V6 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IP Adressblock Grau V6 Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_V6_TypeClass
	 * @generated
	 */
	EClass getIP_Adressblock_Grau_V6_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_V6_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_V6_TypeClass#getWert()
	 * @see #getIP_Adressblock_Grau_V6_TypeClass()
	 * @generated
	 */
	EAttribute getIP_Adressblock_Grau_V6_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Kennzahl_TypeClass <em>Kennzahl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kennzahl Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Kennzahl_TypeClass
	 * @generated
	 */
	EClass getKennzahl_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Kennzahl_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Kennzahl_TypeClass#getWert()
	 * @see #getKennzahl_TypeClass()
	 * @generated
	 */
	EAttribute getKennzahl_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Melder_TypeClass <em>Melder Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Melder Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Melder_TypeClass
	 * @generated
	 */
	EClass getMelder_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Melder_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Melder_TypeClass#getWert()
	 * @see #getMelder_TypeClass()
	 * @generated
	 */
	EAttribute getMelder_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Oberflaeche_Bildart_TypeClass <em>Oberflaeche Bildart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oberflaeche Bildart Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Oberflaeche_Bildart_TypeClass
	 * @generated
	 */
	EClass getOberflaeche_Bildart_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Oberflaeche_Bildart_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Oberflaeche_Bildart_TypeClass#getWert()
	 * @see #getOberflaeche_Bildart_TypeClass()
	 * @generated
	 */
	EAttribute getOberflaeche_Bildart_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Oberflaeche_Zustaendigkeit_TypeClass <em>Oberflaeche Zustaendigkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oberflaeche Zustaendigkeit Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Oberflaeche_Zustaendigkeit_TypeClass
	 * @generated
	 */
	EClass getOberflaeche_Zustaendigkeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Oberflaeche_Zustaendigkeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Oberflaeche_Zustaendigkeit_TypeClass#getWert()
	 * @see #getOberflaeche_Zustaendigkeit_TypeClass()
	 * @generated
	 */
	EAttribute getOberflaeche_Zustaendigkeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Regionalbereich_TypeClass <em>Regionalbereich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regionalbereich Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Regionalbereich_TypeClass
	 * @generated
	 */
	EClass getRegionalbereich_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Regionalbereich_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Regionalbereich_TypeClass#getWert()
	 * @see #getRegionalbereich_TypeClass()
	 * @generated
	 */
	EAttribute getRegionalbereich_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Rueckschauzeit_TypeClass <em>Rueckschauzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rueckschauzeit Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Rueckschauzeit_TypeClass
	 * @generated
	 */
	EClass getRueckschauzeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Rueckschauzeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Rueckschauzeit_TypeClass#getWert()
	 * @see #getRueckschauzeit_TypeClass()
	 * @generated
	 */
	EAttribute getRueckschauzeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Schalter_TypeClass <em>Schalter Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schalter Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Schalter_TypeClass
	 * @generated
	 */
	EClass getSchalter_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Schalter_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Schalter_TypeClass#getWert()
	 * @see #getSchalter_TypeClass()
	 * @generated
	 */
	EAttribute getSchalter_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Schrankreihe_TypeClass <em>Schrankreihe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schrankreihe Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Schrankreihe_TypeClass
	 * @generated
	 */
	EClass getSchrankreihe_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Schrankreihe_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Schrankreihe_TypeClass#getWert()
	 * @see #getSchrankreihe_TypeClass()
	 * @generated
	 */
	EAttribute getSchrankreihe_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Steuerbezirksname_TypeClass <em>Steuerbezirksname Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steuerbezirksname Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Steuerbezirksname_TypeClass
	 * @generated
	 */
	EClass getSteuerbezirksname_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Steuerbezirksname_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Steuerbezirksname_TypeClass#getWert()
	 * @see #getSteuerbezirksname_TypeClass()
	 * @generated
	 */
	EAttribute getSteuerbezirksname_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Steuerbezirksnummer_TypeClass <em>Steuerbezirksnummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steuerbezirksnummer Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Steuerbezirksnummer_TypeClass
	 * @generated
	 */
	EClass getSteuerbezirksnummer_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Steuerbezirksnummer_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Steuerbezirksnummer_TypeClass#getWert()
	 * @see #getSteuerbezirksnummer_TypeClass()
	 * @generated
	 */
	EAttribute getSteuerbezirksnummer_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Taste_TypeClass <em>Taste Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taste Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Taste_TypeClass
	 * @generated
	 */
	EClass getTaste_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Taste_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Taste_TypeClass#getWert()
	 * @see #getTaste_TypeClass()
	 * @generated
	 */
	EAttribute getTaste_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Vorschauzeit_TypeClass <em>Vorschauzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vorschauzeit Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Vorschauzeit_TypeClass
	 * @generated
	 */
	EClass getVorschauzeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Vorschauzeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Vorschauzeit_TypeClass#getWert()
	 * @see #getVorschauzeit_TypeClass()
	 * @generated
	 */
	EAttribute getVorschauzeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.X_Wert_TypeClass <em>XWert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XWert Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.X_Wert_TypeClass
	 * @generated
	 */
	EClass getX_Wert_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.X_Wert_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.X_Wert_TypeClass#getWert()
	 * @see #getX_Wert_TypeClass()
	 * @generated
	 */
	EAttribute getX_Wert_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.Y_Wert_TypeClass <em>YWert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YWert Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Y_Wert_TypeClass
	 * @generated
	 */
	EClass getY_Wert_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.Y_Wert_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.Y_Wert_TypeClass#getWert()
	 * @see #getY_Wert_TypeClass()
	 * @generated
	 */
	EAttribute getY_Wert_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Bedienung.YY_Wert_TypeClass <em>YY Wert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YY Wert Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.YY_Wert_TypeClass
	 * @generated
	 */
	EClass getYY_Wert_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Bedienung.YY_Wert_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.YY_Wert_TypeClass#getWert()
	 * @see #getYY_Wert_TypeClass()
	 * @generated
	 */
	EAttribute getYY_Wert_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Bedienung.ENUMAWert <em>ENUMA Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMA Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMAWert
	 * @generated
	 */
	EEnum getENUMAWert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Bedienung.ENUMBedienEinrichtBauart <em>ENUM Bedien Einricht Bauart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Bedien Einricht Bauart</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBedienEinrichtBauart
	 * @generated
	 */
	EEnum getENUMBedienEinrichtBauart();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Bedienung.ENUMBedienPlatzArt <em>ENUM Bedien Platz Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Bedien Platz Art</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBedienPlatzArt
	 * @generated
	 */
	EEnum getENUMBedienPlatzArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Bedienung.ENUMBSOTeilsystemArt <em>ENUMBSO Teilsystem Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMBSO Teilsystem Art</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBSOTeilsystemArt
	 * @generated
	 */
	EEnum getENUMBSOTeilsystemArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Bedienung.ENUMCWert <em>ENUMC Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMC Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMCWert
	 * @generated
	 */
	EEnum getENUMCWert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Bedienung.ENUMMelder <em>ENUM Melder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Melder</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMMelder
	 * @generated
	 */
	EEnum getENUMMelder();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Bedienung.ENUMOberflaecheBildart <em>ENUM Oberflaeche Bildart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Oberflaeche Bildart</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMOberflaecheBildart
	 * @generated
	 */
	EEnum getENUMOberflaecheBildart();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Bedienung.ENUMSchalter <em>ENUM Schalter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Schalter</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMSchalter
	 * @generated
	 */
	EEnum getENUMSchalter();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Bedienung.ENUMTaste <em>ENUM Taste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Taste</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMTaste
	 * @generated
	 */
	EEnum getENUMTaste();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Bedienung.ENUMXWert <em>ENUMX Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMX Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMXWert
	 * @generated
	 */
	EEnum getENUMXWert();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>BWert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BWert Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TB_Wert' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9]|1[0-6]'"
	 * @generated
	 */
	EDataType getB_Wert_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bedien Einricht Oertl Bez Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bedien Einricht Oertl Bez Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBedien_Einricht_Oertl_Bez' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getBedien_Einricht_Oertl_Bez_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bedienplatzbezeichnung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bedienplatzbezeichnung Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBedienplatzbezeichnung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getBedienplatzbezeichnung_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bedienplatznummer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bedienplatznummer Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBedienplatznummer' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getBedienplatznummer_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bedienraumnummer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bedienraumnummer Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBedienraumnummer' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getBedienraumnummer_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Betriebsstellenbezeichner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Betriebsstellenbezeichner Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBetriebsstellenbezeichner' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TZeichenkette' pattern='[a-zA-Z]{2}'"
	 * @generated
	 */
	EDataType getBetriebsstellenbezeichner_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bez Bed Anrueckabschnitt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bez Bed Anrueckabschnitt Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBez_Bed_Anrueckabschnitt' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TZeichenkette'"
	 * @generated
	 */
	EDataType getBez_Bed_Anrueckabschnitt_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bez Bed Anzeige Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bez Bed Anzeige Element Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBez_Bed_Anzeige_Element' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getBez_Bed_Anzeige_Element_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bez Bed Zentrale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bez Bed Zentrale Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBez_Bed_Zentrale' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getBez_Bed_Zentrale_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung BSO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung BSO Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_BSO' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getBezeichnung_BSO_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>DD Wert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DD Wert Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TDD_Wert' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9]|10'"
	 * @generated
	 */
	EDataType getDD_Wert_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Bedienung.ENUMAWert <em>ENUMA Wert Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMA Wert Object</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMAWert
	 * @model instanceClass="org.eclipse.set.model.planpro.Bedienung.ENUMAWert"
	 *        extendedMetaData="name='ENUMA_Wert:Object' baseType='ENUMA_Wert'"
	 * @generated
	 */
	EDataType getENUMAWertObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Bedienung.ENUMBedienEinrichtBauart <em>ENUM Bedien Einricht Bauart Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Bedien Einricht Bauart Object</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBedienEinrichtBauart
	 * @model instanceClass="org.eclipse.set.model.planpro.Bedienung.ENUMBedienEinrichtBauart"
	 *        extendedMetaData="name='ENUMBedien_Einricht_Bauart:Object' baseType='ENUMBedien_Einricht_Bauart'"
	 * @generated
	 */
	EDataType getENUMBedienEinrichtBauartObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Bedienung.ENUMBedienPlatzArt <em>ENUM Bedien Platz Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Bedien Platz Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBedienPlatzArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Bedienung.ENUMBedienPlatzArt"
	 *        extendedMetaData="name='ENUMBedien_Platz_Art:Object' baseType='ENUMBedien_Platz_Art'"
	 * @generated
	 */
	EDataType getENUMBedienPlatzArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Bedienung.ENUMBSOTeilsystemArt <em>ENUMBSO Teilsystem Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMBSO Teilsystem Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBSOTeilsystemArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Bedienung.ENUMBSOTeilsystemArt"
	 *        extendedMetaData="name='ENUMBSO_Teilsystem_Art:Object' baseType='ENUMBSO_Teilsystem_Art'"
	 * @generated
	 */
	EDataType getENUMBSOTeilsystemArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Bedienung.ENUMCWert <em>ENUMC Wert Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMC Wert Object</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMCWert
	 * @model instanceClass="org.eclipse.set.model.planpro.Bedienung.ENUMCWert"
	 *        extendedMetaData="name='ENUMC_Wert:Object' baseType='ENUMC_Wert'"
	 * @generated
	 */
	EDataType getENUMCWertObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Bedienung.ENUMMelder <em>ENUM Melder Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Melder Object</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMMelder
	 * @model instanceClass="org.eclipse.set.model.planpro.Bedienung.ENUMMelder"
	 *        extendedMetaData="name='ENUMMelder:Object' baseType='ENUMMelder'"
	 * @generated
	 */
	EDataType getENUMMelderObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Bedienung.ENUMOberflaecheBildart <em>ENUM Oberflaeche Bildart Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Oberflaeche Bildart Object</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMOberflaecheBildart
	 * @model instanceClass="org.eclipse.set.model.planpro.Bedienung.ENUMOberflaecheBildart"
	 *        extendedMetaData="name='ENUMOberflaeche_Bildart:Object' baseType='ENUMOberflaeche_Bildart'"
	 * @generated
	 */
	EDataType getENUMOberflaecheBildartObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Bedienung.ENUMSchalter <em>ENUM Schalter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Schalter Object</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMSchalter
	 * @model instanceClass="org.eclipse.set.model.planpro.Bedienung.ENUMSchalter"
	 *        extendedMetaData="name='ENUMSchalter:Object' baseType='ENUMSchalter'"
	 * @generated
	 */
	EDataType getENUMSchalterObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Bedienung.ENUMTaste <em>ENUM Taste Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Taste Object</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMTaste
	 * @model instanceClass="org.eclipse.set.model.planpro.Bedienung.ENUMTaste"
	 *        extendedMetaData="name='ENUMTaste:Object' baseType='ENUMTaste'"
	 * @generated
	 */
	EDataType getENUMTasteObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Bedienung.ENUMXWert <em>ENUMX Wert Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMX Wert Object</em>'.
	 * @see org.eclipse.set.model.planpro.Bedienung.ENUMXWert
	 * @model instanceClass="org.eclipse.set.model.planpro.Bedienung.ENUMXWert"
	 *        extendedMetaData="name='ENUMX_Wert:Object' baseType='ENUMX_Wert'"
	 * @generated
	 */
	EDataType getENUMXWertObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Hupe Anschaltzeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hupe Anschaltzeit Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='THupe_Anschaltzeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TSekunde' pattern='0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5]'"
	 * @generated
	 */
	EDataType getHupe_Anschaltzeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>IP Adressblock Blau Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IP Adressblock Blau Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TIP_Adressblock_Blau' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getIP_Adressblock_Blau_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>IP Adressblock Blau V4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IP Adressblock Blau V4 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TIP_Adressblock_Blau_V4' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getIP_Adressblock_Blau_V4_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>IP Adressblock Blau V6 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IP Adressblock Blau V6 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TIP_Adressblock_Blau_V6' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getIP_Adressblock_Blau_V6_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>IP Adressblock Grau Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IP Adressblock Grau Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TIP_Adressblock_Grau' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getIP_Adressblock_Grau_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>IP Adressblock Grau V4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IP Adressblock Grau V4 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TIP_Adressblock_Grau_V4' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getIP_Adressblock_Grau_V4_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>IP Adressblock Grau V6 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IP Adressblock Grau V6 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TIP_Adressblock_Grau_V6' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getIP_Adressblock_Grau_V6_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oberflaeche Zustaendigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Oberflaeche Zustaendigkeit Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TOberflaeche_Zustaendigkeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getOberflaeche_Zustaendigkeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Rueckschauzeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rueckschauzeit Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TRueckschauzeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TSekunde'"
	 * @generated
	 */
	EDataType getRueckschauzeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Schrankreihe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Schrankreihe Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TSchrankreihe' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getSchrankreihe_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Steuerbezirksname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Steuerbezirksname Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TSteuerbezirksname' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getSteuerbezirksname_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Steuerbezirksnummer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Steuerbezirksnummer Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TSteuerbezirksnummer' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getSteuerbezirksnummer_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Vorschauzeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vorschauzeit Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TVorschauzeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TSekunde'"
	 * @generated
	 */
	EDataType getVorschauzeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>YWert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>YWert Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TY_Wert' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9]|1[0-5]'"
	 * @generated
	 */
	EDataType getY_Wert_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>YY Wert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>YY Wert Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TYY_Wert' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9]|1[0-5]'"
	 * @generated
	 */
	EDataType getYY_Wert_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BedienungFactory getBedienungFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.A_Wert_TypeClassImpl <em>AWert Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.A_Wert_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getA_Wert_TypeClass()
		 * @generated
		 */
		EClass AWERT_TYPE_CLASS = eINSTANCE.getA_Wert_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWERT_TYPE_CLASS__WERT = eINSTANCE.getA_Wert_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Anbindung_IB2_TypeClassImpl <em>Anbindung IB2 Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Anbindung_IB2_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getAnbindung_IB2_TypeClass()
		 * @generated
		 */
		EClass ANBINDUNG_IB2_TYPE_CLASS = eINSTANCE.getAnbindung_IB2_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANBINDUNG_IB2_TYPE_CLASS__WERT = eINSTANCE.getAnbindung_IB2_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Anbindung_IB3_TypeClassImpl <em>Anbindung IB3 Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Anbindung_IB3_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getAnbindung_IB3_TypeClass()
		 * @generated
		 */
		EClass ANBINDUNG_IB3_TYPE_CLASS = eINSTANCE.getAnbindung_IB3_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANBINDUNG_IB3_TYPE_CLASS__WERT = eINSTANCE.getAnbindung_IB3_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.B_Wert_TypeClassImpl <em>BWert Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.B_Wert_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getB_Wert_TypeClass()
		 * @generated
		 */
		EClass BWERT_TYPE_CLASS = eINSTANCE.getB_Wert_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWERT_TYPE_CLASS__WERT = eINSTANCE.getB_Wert_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_AnrueckabschnittImpl <em>Bedien Anrueckabschnitt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_AnrueckabschnittImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Anrueckabschnitt()
		 * @generated
		 */
		EClass BEDIEN_ANRUECKABSCHNITT = eINSTANCE.getBedien_Anrueckabschnitt();

		/**
		 * The meta object literal for the '<em><b>ID Gleis Abschnitt Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION = eINSTANCE.getBedien_Anrueckabschnitt_IDGleisAbschnittPosition();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG = eINSTANCE.getBedien_Anrueckabschnitt_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Gleis Abschnitt Darstellen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN = eINSTANCE.getBedien_Anrueckabschnitt_IDGleisAbschnittDarstellen();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupImpl <em>Bedien Anrueckabschnitt Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bez Bed Anrueckabschnitt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANRUECKABSCHNITT = eINSTANCE.getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup_BezBedAnrueckabschnitt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anzeige_ElementImpl <em>Bedien Anzeige Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anzeige_ElementImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Anzeige_Element()
		 * @generated
		 */
		EClass BEDIEN_ANZEIGE_ELEMENT = eINSTANCE.getBedien_Anzeige_Element();

		/**
		 * The meta object literal for the '<em><b>Bedien Anzeige Element Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG = eINSTANCE.getBedien_Anzeige_Element_BedienAnzeigeElementAllg();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG = eINSTANCE.getBedien_Anzeige_Element_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Bedien Einrichtung Oertlich</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH = eINSTANCE.getBedien_Anzeige_Element_IDBedienEinrichtungOertlich();

		/**
		 * The meta object literal for the '<em><b>ID Verknuepftes Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT = eINSTANCE.getBedien_Anzeige_Element_IDVerknuepftesElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anzeige_Element_Allg_AttributeGroupImpl <em>Bedien Anzeige Element Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anzeige_Element_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Anzeige_Element_Allg_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Anzeige_Element_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Melder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__MELDER = eINSTANCE.getBedien_Anzeige_Element_Allg_AttributeGroup_Melder();

		/**
		 * The meta object literal for the '<em><b>Schalter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__SCHALTER = eINSTANCE.getBedien_Anzeige_Element_Allg_AttributeGroup_Schalter();

		/**
		 * The meta object literal for the '<em><b>Taste</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__TASTE = eINSTANCE.getBedien_Anzeige_Element_Allg_AttributeGroup_Taste();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anzeige_Element_Bezeichnung_AttributeGroupImpl <em>Bedien Anzeige Element Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anzeige_Element_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Anzeige_Element_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Anzeige_Element_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bez Bed Anzeige Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT = eINSTANCE.getBedien_Anzeige_Element_Bezeichnung_AttributeGroup_BezBedAnzeigeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_BezirkImpl <em>Bedien Bezirk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_BezirkImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Bezirk()
		 * @generated
		 */
		EClass BEDIEN_BEZIRK = eINSTANCE.getBedien_Bezirk();

		/**
		 * The meta object literal for the '<em><b>Bedien Bezirk Adressformel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK__BEDIEN_BEZIRK_ADRESSFORMEL = eINSTANCE.getBedien_Bezirk_BedienBezirkAdressformel();

		/**
		 * The meta object literal for the '<em><b>Bedien Bezirk Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK__BEDIEN_BEZIRK_ALLG = eINSTANCE.getBedien_Bezirk_BedienBezirkAllg();

		/**
		 * The meta object literal for the '<em><b>Bedien Bezirk Anhaenge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK__BEDIEN_BEZIRK_ANHAENGE = eINSTANCE.getBedien_Bezirk_BedienBezirkAnhaenge();

		/**
		 * The meta object literal for the '<em><b>ID Bedien Zentrale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK__ID_BEDIEN_ZENTRALE = eINSTANCE.getBedien_Bezirk_IDBedienZentrale();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Adressformel_AttributeGroupImpl <em>Bedien Bezirk Adressformel Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Adressformel_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Bezirk_Adressformel_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Bezirk_Adressformel_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>AWert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__AWERT = eINSTANCE.getBedien_Bezirk_Adressformel_AttributeGroup_AWert();

		/**
		 * The meta object literal for the '<em><b>BWert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__BWERT = eINSTANCE.getBedien_Bezirk_Adressformel_AttributeGroup_BWert();

		/**
		 * The meta object literal for the '<em><b>CWert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__CWERT = eINSTANCE.getBedien_Bezirk_Adressformel_AttributeGroup_CWert();

		/**
		 * The meta object literal for the '<em><b>DD Wert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__DD_WERT = eINSTANCE.getBedien_Bezirk_Adressformel_AttributeGroup_DDWert();

		/**
		 * The meta object literal for the '<em><b>XWert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__XWERT = eINSTANCE.getBedien_Bezirk_Adressformel_AttributeGroup_XWert();

		/**
		 * The meta object literal for the '<em><b>YWert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YWERT = eINSTANCE.getBedien_Bezirk_Adressformel_AttributeGroup_YWert();

		/**
		 * The meta object literal for the '<em><b>YY Wert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YY_WERT = eINSTANCE.getBedien_Bezirk_Adressformel_AttributeGroup_YYWert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Allg_AttributeGroupImpl <em>Bedien Bezirk Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Bezirk_Allg_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Bezirk_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Anbindung IB2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB2 = eINSTANCE.getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB2();

		/**
		 * The meta object literal for the '<em><b>Anbindung IB3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB3 = eINSTANCE.getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB3();

		/**
		 * The meta object literal for the '<em><b>Hersteller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__HERSTELLER = eINSTANCE.getBedien_Bezirk_Allg_AttributeGroup_Hersteller();

		/**
		 * The meta object literal for the '<em><b>Schrankreihe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__SCHRANKREIHE = eINSTANCE.getBedien_Bezirk_Allg_AttributeGroup_Schrankreihe();

		/**
		 * The meta object literal for the '<em><b>Steuerbezirksname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNAME = eINSTANCE.getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksname();

		/**
		 * The meta object literal for the '<em><b>Steuerbezirksnummer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNUMMER = eINSTANCE.getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksnummer();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Anhaenge_AttributeGroupImpl <em>Bedien Bezirk Anhaenge Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Anhaenge_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Bezirk_Anhaenge_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Bezirk_Anhaenge_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>ID Anhang Anbindung IB2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2 = eINSTANCE.getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB2();

		/**
		 * The meta object literal for the '<em><b>ID Anhang Anbindung IB3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3 = eINSTANCE.getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB3();

		/**
		 * The meta object literal for the '<em><b>ID Anhang Steuerbez Uebersicht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT = eINSTANCE.getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangSteuerbezUebersicht();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Bauart_TypeClassImpl <em>Bedien Einricht Bauart Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Bauart_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Einricht_Bauart_TypeClass()
		 * @generated
		 */
		EClass BEDIEN_EINRICHT_BAUART_TYPE_CLASS = eINSTANCE.getBedien_Einricht_Bauart_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEDIEN_EINRICHT_BAUART_TYPE_CLASS__WERT = eINSTANCE.getBedien_Einricht_Bauart_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Oertl_Bez_TypeClassImpl <em>Bedien Einricht Oertl Bez Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Oertl_Bez_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Einricht_Oertl_Bez_TypeClass()
		 * @generated
		 */
		EClass BEDIEN_EINRICHT_OERTL_BEZ_TYPE_CLASS = eINSTANCE.getBedien_Einricht_Oertl_Bez_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEDIEN_EINRICHT_OERTL_BEZ_TYPE_CLASS__WERT = eINSTANCE.getBedien_Einricht_Oertl_Bez_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Oertlich_Allg_AttributeGroupImpl <em>Bedien Einricht Oertlich Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Oertlich_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Einricht_Oertlich_Allg_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Einricht_Oertlich_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bedien Einricht Bauart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_BAUART = eINSTANCE.getBedien_Einricht_Oertlich_Allg_AttributeGroup_BedienEinrichtBauart();

		/**
		 * The meta object literal for the '<em><b>Hupe Anschaltzeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__HUPE_ANSCHALTZEIT = eINSTANCE.getBedien_Einricht_Oertlich_Allg_AttributeGroup_HupeAnschaltzeit();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einrichtung_OertlichImpl <em>Bedien Einrichtung Oertlich</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einrichtung_OertlichImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Einrichtung_Oertlich()
		 * @generated
		 */
		EClass BEDIEN_EINRICHTUNG_OERTLICH = eINSTANCE.getBedien_Einrichtung_Oertlich();

		/**
		 * The meta object literal for the '<em><b>Bedien Einricht Oertlich Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG = eINSTANCE.getBedien_Einrichtung_Oertlich_BedienEinrichtOertlichAllg();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG = eINSTANCE.getBedien_Einrichtung_Oertlich_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Anhang Benutzeroberflaeche</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE = eINSTANCE.getBedien_Einrichtung_Oertlich_IDAnhangBenutzeroberflaeche();

		/**
		 * The meta object literal for the '<em><b>ID Aussenelementansteuerung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG = eINSTANCE.getBedien_Einrichtung_Oertlich_IDAussenelementansteuerung();

		/**
		 * The meta object literal for the '<em><b>ID Unterbringung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG = eINSTANCE.getBedien_Einrichtung_Oertlich_IDUnterbringung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupImpl <em>Bedien Einrichtung Oertlich Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bedien Einricht Oertl Bez</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_OERTL_BEZ = eINSTANCE.getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup_BedienEinrichtOertlBez();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_GBTImpl <em>Bedien GBT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_GBTImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_GBT()
		 * @generated
		 */
		EClass BEDIEN_GBT = eINSTANCE.getBedien_GBT();

		/**
		 * The meta object literal for the '<em><b>Bedien GBT Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_GBT__BEDIEN_GBT_ALLG = eINSTANCE.getBedien_GBT_BedienGBTAllg();

		/**
		 * The meta object literal for the '<em><b>ID Anhang Vorgabe GBT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_GBT__ID_ANHANG_VORGABE_GBT = eINSTANCE.getBedien_GBT_IDAnhangVorgabeGBT();

		/**
		 * The meta object literal for the '<em><b>ID Bedien Bezirk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_GBT__ID_BEDIEN_BEZIRK = eINSTANCE.getBedien_GBT_IDBedienBezirk();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_GBT_Allg_AttributeGroupImpl <em>Bedien GBT Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_GBT_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_GBT_Allg_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getBedien_GBT_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Rueckschauzeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__RUECKSCHAUZEIT = eINSTANCE.getBedien_GBT_Allg_AttributeGroup_Rueckschauzeit();

		/**
		 * The meta object literal for the '<em><b>Vorschauzeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__VORSCHAUZEIT = eINSTANCE.getBedien_GBT_Allg_AttributeGroup_Vorschauzeit();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_OberflaecheImpl <em>Bedien Oberflaeche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_OberflaecheImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Oberflaeche()
		 * @generated
		 */
		EClass BEDIEN_OBERFLAECHE = eINSTANCE.getBedien_Oberflaeche();

		/**
		 * The meta object literal for the '<em><b>Bedien Oberflaeche Anhaenge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE = eINSTANCE.getBedien_Oberflaeche_BedienOberflaecheAnhaenge();

		/**
		 * The meta object literal for the '<em><b>ID Bedien Bezirk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK = eINSTANCE.getBedien_Oberflaeche_IDBedienBezirk();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl <em>Bedien Oberflaeche Anhaenge Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Oberflaeche_Anhaenge_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Oberflaeche_Anhaenge_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>ID Anhang Monitoraufteilung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG = eINSTANCE.getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangMonitoraufteilung();

		/**
		 * The meta object literal for the '<em><b>ID Anhang Richtungssinn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN = eINSTANCE.getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangRichtungssinn();

		/**
		 * The meta object literal for the '<em><b>ID Anhang Vorgabe BELU</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU = eINSTANCE.getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangVorgabeBELU();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_BildImpl <em>Bedien Oberflaeche Bild</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_BildImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Oberflaeche_Bild()
		 * @generated
		 */
		EClass BEDIEN_OBERFLAECHE_BILD = eINSTANCE.getBedien_Oberflaeche_Bild();

		/**
		 * The meta object literal for the '<em><b>Bedien Oberflaeche Bild Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG = eINSTANCE.getBedien_Oberflaeche_Bild_BedienOberflaecheBildAllg();

		/**
		 * The meta object literal for the '<em><b>ID Bedien Oberflaeche</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE = eINSTANCE.getBedien_Oberflaeche_Bild_IDBedienOberflaeche();

		/**
		 * The meta object literal for the '<em><b>ID Oertlichkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT = eINSTANCE.getBedien_Oberflaeche_Bild_IDOertlichkeit();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_Bild_Allg_AttributeGroupImpl <em>Bedien Oberflaeche Bild Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_Bild_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Oberflaeche_Bild_Allg_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Oberflaeche_Bild_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Oberflaeche Bildart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_BILDART = eINSTANCE.getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheBildart();

		/**
		 * The meta object literal for the '<em><b>Oberflaeche Zustaendigkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_ZUSTAENDIGKEIT = eINSTANCE.getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheZustaendigkeit();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_OertlichkeitImpl <em>Bedien Oertlichkeit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_OertlichkeitImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Oertlichkeit()
		 * @generated
		 */
		EClass BEDIEN_OERTLICHKEIT = eINSTANCE.getBedien_Oertlichkeit();

		/**
		 * The meta object literal for the '<em><b>Bedien Oertlichkeit Kennzahlen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN = eINSTANCE.getBedien_Oertlichkeit_BedienOertlichkeitKennzahlen();

		/**
		 * The meta object literal for the '<em><b>ID Bedien Bezirk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK = eINSTANCE.getBedien_Oertlichkeit_IDBedienBezirk();

		/**
		 * The meta object literal for the '<em><b>ID Oertlichkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT = eINSTANCE.getBedien_Oertlichkeit_IDOertlichkeit();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oertlichkeit_Kennzahlen_AttributeGroupImpl <em>Bedien Oertlichkeit Kennzahlen Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oertlichkeit_Kennzahlen_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Oertlichkeit_Kennzahlen_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Oertlichkeit_Kennzahlen_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Betriebsstellenbezeichner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__BETRIEBSSTELLENBEZEICHNER = eINSTANCE.getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Betriebsstellenbezeichner();

		/**
		 * The meta object literal for the '<em><b>Kennzahl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__KENNZAHL = eINSTANCE.getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Kennzahl();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_PlatzImpl <em>Bedien Platz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_PlatzImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Platz()
		 * @generated
		 */
		EClass BEDIEN_PLATZ = eINSTANCE.getBedien_Platz();

		/**
		 * The meta object literal for the '<em><b>Bedien Platz Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG = eINSTANCE.getBedien_Platz_BedienPlatzAllg();

		/**
		 * The meta object literal for the '<em><b>ID Anhang Moebelplan Aufriss</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS = eINSTANCE.getBedien_Platz_IDAnhangMoebelplanAufriss();

		/**
		 * The meta object literal for the '<em><b>ID Anhang Moebelplan Grundriss</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS = eINSTANCE.getBedien_Platz_IDAnhangMoebelplanGrundriss();

		/**
		 * The meta object literal for the '<em><b>ID Unterbringung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_PLATZ__ID_UNTERBRINGUNG = eINSTANCE.getBedien_Platz_IDUnterbringung();

		/**
		 * The meta object literal for the '<em><b>ID Bedien Bezirk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_PLATZ__ID_BEDIEN_BEZIRK = eINSTANCE.getBedien_Platz_IDBedienBezirk();

		/**
		 * The meta object literal for the '<em><b>IDESTW Zentraleinheit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT = eINSTANCE.getBedien_Platz_IDESTWZentraleinheit();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Platz_Allg_AttributeGroupImpl <em>Bedien Platz Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Platz_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Platz_Allg_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Platz_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bedien Platz Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIEN_PLATZ_ART = eINSTANCE.getBedien_Platz_Allg_AttributeGroup_BedienPlatzArt();

		/**
		 * The meta object literal for the '<em><b>Bedienplatzbezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZBEZEICHNUNG = eINSTANCE.getBedien_Platz_Allg_AttributeGroup_Bedienplatzbezeichnung();

		/**
		 * The meta object literal for the '<em><b>Bedienplatznummer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZNUMMER = eINSTANCE.getBedien_Platz_Allg_AttributeGroup_Bedienplatznummer();

		/**
		 * The meta object literal for the '<em><b>Bedienraumnummer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENRAUMNUMMER = eINSTANCE.getBedien_Platz_Allg_AttributeGroup_Bedienraumnummer();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Platz_Art_TypeClassImpl <em>Bedien Platz Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Platz_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Platz_Art_TypeClass()
		 * @generated
		 */
		EClass BEDIEN_PLATZ_ART_TYPE_CLASS = eINSTANCE.getBedien_Platz_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEDIEN_PLATZ_ART_TYPE_CLASS__WERT = eINSTANCE.getBedien_Platz_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_StandortImpl <em>Bedien Standort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_StandortImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Standort()
		 * @generated
		 */
		EClass BEDIEN_STANDORT = eINSTANCE.getBedien_Standort();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_STANDORT__BEZEICHNUNG = eINSTANCE.getBedien_Standort_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>BSOIP Adressblock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_STANDORT__BSOIP_ADRESSBLOCK = eINSTANCE.getBedien_Standort_BSOIPAdressblock();

		/**
		 * The meta object literal for the '<em><b>ID Unterbringung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_STANDORT__ID_UNTERBRINGUNG = eINSTANCE.getBedien_Standort_IDUnterbringung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Standort_Bezeichnung_AttributeGroupImpl <em>Bedien Standort Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Standort_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Standort_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Standort_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung BSO</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BSO = eINSTANCE.getBedien_Standort_Bezeichnung_AttributeGroup_BezeichnungBSO();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_ZentraleImpl <em>Bedien Zentrale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_ZentraleImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Zentrale()
		 * @generated
		 */
		EClass BEDIEN_ZENTRALE = eINSTANCE.getBedien_Zentrale();

		/**
		 * The meta object literal for the '<em><b>ID Anhang Plan Bedienraum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM = eINSTANCE.getBedien_Zentrale_IDAnhangPlanBedienraum();

		/**
		 * The meta object literal for the '<em><b>ID Anhang Plan Rechnerraum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM = eINSTANCE.getBedien_Zentrale_IDAnhangPlanRechnerraum();

		/**
		 * The meta object literal for the '<em><b>ID Strecke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ZENTRALE__ID_STRECKE = eINSTANCE.getBedien_Zentrale_IDStrecke();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ZENTRALE__BEZEICHNUNG = eINSTANCE.getBedien_Zentrale_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Oertlichkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ZENTRALE__ID_OERTLICHKEIT = eINSTANCE.getBedien_Zentrale_IDOertlichkeit();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Zentrale_Bezeichnung_AttributeGroupImpl <em>Bedien Zentrale Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Zentrale_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Zentrale_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getBedien_Zentrale_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bez Bed Zentrale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ZENTRALE = eINSTANCE.getBedien_Zentrale_Bezeichnung_AttributeGroup_BezBedZentrale();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedienplatzbezeichnung_TypeClassImpl <em>Bedienplatzbezeichnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedienplatzbezeichnung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedienplatzbezeichnung_TypeClass()
		 * @generated
		 */
		EClass BEDIENPLATZBEZEICHNUNG_TYPE_CLASS = eINSTANCE.getBedienplatzbezeichnung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEDIENPLATZBEZEICHNUNG_TYPE_CLASS__WERT = eINSTANCE.getBedienplatzbezeichnung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedienplatznummer_TypeClassImpl <em>Bedienplatznummer Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedienplatznummer_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedienplatznummer_TypeClass()
		 * @generated
		 */
		EClass BEDIENPLATZNUMMER_TYPE_CLASS = eINSTANCE.getBedienplatznummer_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEDIENPLATZNUMMER_TYPE_CLASS__WERT = eINSTANCE.getBedienplatznummer_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedienraumnummer_TypeClassImpl <em>Bedienraumnummer Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bedienraumnummer_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedienraumnummer_TypeClass()
		 * @generated
		 */
		EClass BEDIENRAUMNUMMER_TYPE_CLASS = eINSTANCE.getBedienraumnummer_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEDIENRAUMNUMMER_TYPE_CLASS__WERT = eINSTANCE.getBedienraumnummer_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Betriebsstellenbezeichner_TypeClassImpl <em>Betriebsstellenbezeichner Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Betriebsstellenbezeichner_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBetriebsstellenbezeichner_TypeClass()
		 * @generated
		 */
		EClass BETRIEBSSTELLENBEZEICHNER_TYPE_CLASS = eINSTANCE.getBetriebsstellenbezeichner_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BETRIEBSSTELLENBEZEICHNER_TYPE_CLASS__WERT = eINSTANCE.getBetriebsstellenbezeichner_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bez_Bed_Anrueckabschnitt_TypeClassImpl <em>Bez Bed Anrueckabschnitt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bez_Bed_Anrueckabschnitt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBez_Bed_Anrueckabschnitt_TypeClass()
		 * @generated
		 */
		EClass BEZ_BED_ANRUECKABSCHNITT_TYPE_CLASS = eINSTANCE.getBez_Bed_Anrueckabschnitt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZ_BED_ANRUECKABSCHNITT_TYPE_CLASS__WERT = eINSTANCE.getBez_Bed_Anrueckabschnitt_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bez_Bed_Anzeige_Element_TypeClassImpl <em>Bez Bed Anzeige Element Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bez_Bed_Anzeige_Element_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBez_Bed_Anzeige_Element_TypeClass()
		 * @generated
		 */
		EClass BEZ_BED_ANZEIGE_ELEMENT_TYPE_CLASS = eINSTANCE.getBez_Bed_Anzeige_Element_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZ_BED_ANZEIGE_ELEMENT_TYPE_CLASS__WERT = eINSTANCE.getBez_Bed_Anzeige_Element_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bez_Bed_Zentrale_TypeClassImpl <em>Bez Bed Zentrale Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bez_Bed_Zentrale_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBez_Bed_Zentrale_TypeClass()
		 * @generated
		 */
		EClass BEZ_BED_ZENTRALE_TYPE_CLASS = eINSTANCE.getBez_Bed_Zentrale_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZ_BED_ZENTRALE_TYPE_CLASS__WERT = eINSTANCE.getBez_Bed_Zentrale_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Bezeichnung_BSO_TypeClassImpl <em>Bezeichnung BSO Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Bezeichnung_BSO_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBezeichnung_BSO_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_BSO_TYPE_CLASS = eINSTANCE.getBezeichnung_BSO_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_BSO_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_BSO_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.BSO_IP_AB_Teilsystem_AttributeGroupImpl <em>BSO IP AB Teilsystem Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BSO_IP_AB_Teilsystem_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBSO_IP_AB_Teilsystem_AttributeGroup()
		 * @generated
		 */
		EClass BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP = eINSTANCE.getBSO_IP_AB_Teilsystem_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>BSO Teilsystem Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__BSO_TEILSYSTEM_ART = eINSTANCE.getBSO_IP_AB_Teilsystem_AttributeGroup_BSOTeilsystemArt();

		/**
		 * The meta object literal for the '<em><b>IP Adressblock Blau</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU = eINSTANCE.getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockBlau();

		/**
		 * The meta object literal for the '<em><b>IP Adressblock Grau</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU = eINSTANCE.getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockGrau();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.BSO_IP_Adressblock_AttributeGroupImpl <em>BSO IP Adressblock Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BSO_IP_Adressblock_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBSO_IP_Adressblock_AttributeGroup()
		 * @generated
		 */
		EClass BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP = eINSTANCE.getBSO_IP_Adressblock_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>BSOIPAB Teilsystem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__BSOIPAB_TEILSYSTEM = eINSTANCE.getBSO_IP_Adressblock_AttributeGroup_BSOIPABTeilsystem();

		/**
		 * The meta object literal for the '<em><b>IP Adressblock Blau V4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4 = eINSTANCE.getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4();

		/**
		 * The meta object literal for the '<em><b>IP Adressblock Blau V6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6 = eINSTANCE.getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6();

		/**
		 * The meta object literal for the '<em><b>IP Adressblock Grau V4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4 = eINSTANCE.getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4();

		/**
		 * The meta object literal for the '<em><b>IP Adressblock Grau V6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6 = eINSTANCE.getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6();

		/**
		 * The meta object literal for the '<em><b>Regionalbereich</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH = eINSTANCE.getBSO_IP_Adressblock_AttributeGroup_Regionalbereich();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.BSO_Teilsystem_Art_TypeClassImpl <em>BSO Teilsystem Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BSO_Teilsystem_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBSO_Teilsystem_Art_TypeClass()
		 * @generated
		 */
		EClass BSO_TEILSYSTEM_ART_TYPE_CLASS = eINSTANCE.getBSO_Teilsystem_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSO_TEILSYSTEM_ART_TYPE_CLASS__WERT = eINSTANCE.getBSO_Teilsystem_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.C_Wert_TypeClassImpl <em>CWert Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.C_Wert_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getC_Wert_TypeClass()
		 * @generated
		 */
		EClass CWERT_TYPE_CLASS = eINSTANCE.getC_Wert_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CWERT_TYPE_CLASS__WERT = eINSTANCE.getC_Wert_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.DD_Wert_TypeClassImpl <em>DD Wert Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.DD_Wert_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getDD_Wert_TypeClass()
		 * @generated
		 */
		EClass DD_WERT_TYPE_CLASS = eINSTANCE.getDD_Wert_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD_WERT_TYPE_CLASS__WERT = eINSTANCE.getDD_Wert_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Hersteller_TypeClassImpl <em>Hersteller Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Hersteller_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getHersteller_TypeClass()
		 * @generated
		 */
		EClass HERSTELLER_TYPE_CLASS = eINSTANCE.getHersteller_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERSTELLER_TYPE_CLASS__WERT = eINSTANCE.getHersteller_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Hupe_Anschaltzeit_TypeClassImpl <em>Hupe Anschaltzeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Hupe_Anschaltzeit_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getHupe_Anschaltzeit_TypeClass()
		 * @generated
		 */
		EClass HUPE_ANSCHALTZEIT_TYPE_CLASS = eINSTANCE.getHupe_Anschaltzeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUPE_ANSCHALTZEIT_TYPE_CLASS__WERT = eINSTANCE.getHupe_Anschaltzeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Blau_TypeClassImpl <em>IP Adressblock Blau Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Blau_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Blau_TypeClass()
		 * @generated
		 */
		EClass IP_ADRESSBLOCK_BLAU_TYPE_CLASS = eINSTANCE.getIP_Adressblock_Blau_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_ADRESSBLOCK_BLAU_TYPE_CLASS__WERT = eINSTANCE.getIP_Adressblock_Blau_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Blau_V4_TypeClassImpl <em>IP Adressblock Blau V4 Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Blau_V4_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Blau_V4_TypeClass()
		 * @generated
		 */
		EClass IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS = eINSTANCE.getIP_Adressblock_Blau_V4_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS__WERT = eINSTANCE.getIP_Adressblock_Blau_V4_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Blau_V6_TypeClassImpl <em>IP Adressblock Blau V6 Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Blau_V6_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Blau_V6_TypeClass()
		 * @generated
		 */
		EClass IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS = eINSTANCE.getIP_Adressblock_Blau_V6_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS__WERT = eINSTANCE.getIP_Adressblock_Blau_V6_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Grau_TypeClassImpl <em>IP Adressblock Grau Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Grau_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Grau_TypeClass()
		 * @generated
		 */
		EClass IP_ADRESSBLOCK_GRAU_TYPE_CLASS = eINSTANCE.getIP_Adressblock_Grau_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_ADRESSBLOCK_GRAU_TYPE_CLASS__WERT = eINSTANCE.getIP_Adressblock_Grau_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Grau_V4_TypeClassImpl <em>IP Adressblock Grau V4 Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Grau_V4_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Grau_V4_TypeClass()
		 * @generated
		 */
		EClass IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS = eINSTANCE.getIP_Adressblock_Grau_V4_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS__WERT = eINSTANCE.getIP_Adressblock_Grau_V4_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Grau_V6_TypeClassImpl <em>IP Adressblock Grau V6 Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.IP_Adressblock_Grau_V6_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Grau_V6_TypeClass()
		 * @generated
		 */
		EClass IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS = eINSTANCE.getIP_Adressblock_Grau_V6_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS__WERT = eINSTANCE.getIP_Adressblock_Grau_V6_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Kennzahl_TypeClassImpl <em>Kennzahl Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Kennzahl_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getKennzahl_TypeClass()
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
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Melder_TypeClassImpl <em>Melder Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Melder_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getMelder_TypeClass()
		 * @generated
		 */
		EClass MELDER_TYPE_CLASS = eINSTANCE.getMelder_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELDER_TYPE_CLASS__WERT = eINSTANCE.getMelder_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Oberflaeche_Bildart_TypeClassImpl <em>Oberflaeche Bildart Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Oberflaeche_Bildart_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getOberflaeche_Bildart_TypeClass()
		 * @generated
		 */
		EClass OBERFLAECHE_BILDART_TYPE_CLASS = eINSTANCE.getOberflaeche_Bildart_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBERFLAECHE_BILDART_TYPE_CLASS__WERT = eINSTANCE.getOberflaeche_Bildart_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Oberflaeche_Zustaendigkeit_TypeClassImpl <em>Oberflaeche Zustaendigkeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Oberflaeche_Zustaendigkeit_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getOberflaeche_Zustaendigkeit_TypeClass()
		 * @generated
		 */
		EClass OBERFLAECHE_ZUSTAENDIGKEIT_TYPE_CLASS = eINSTANCE.getOberflaeche_Zustaendigkeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBERFLAECHE_ZUSTAENDIGKEIT_TYPE_CLASS__WERT = eINSTANCE.getOberflaeche_Zustaendigkeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Regionalbereich_TypeClassImpl <em>Regionalbereich Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Regionalbereich_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getRegionalbereich_TypeClass()
		 * @generated
		 */
		EClass REGIONALBEREICH_TYPE_CLASS = eINSTANCE.getRegionalbereich_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONALBEREICH_TYPE_CLASS__WERT = eINSTANCE.getRegionalbereich_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Rueckschauzeit_TypeClassImpl <em>Rueckschauzeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Rueckschauzeit_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getRueckschauzeit_TypeClass()
		 * @generated
		 */
		EClass RUECKSCHAUZEIT_TYPE_CLASS = eINSTANCE.getRueckschauzeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUECKSCHAUZEIT_TYPE_CLASS__WERT = eINSTANCE.getRueckschauzeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Schalter_TypeClassImpl <em>Schalter Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Schalter_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSchalter_TypeClass()
		 * @generated
		 */
		EClass SCHALTER_TYPE_CLASS = eINSTANCE.getSchalter_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHALTER_TYPE_CLASS__WERT = eINSTANCE.getSchalter_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Schrankreihe_TypeClassImpl <em>Schrankreihe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Schrankreihe_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSchrankreihe_TypeClass()
		 * @generated
		 */
		EClass SCHRANKREIHE_TYPE_CLASS = eINSTANCE.getSchrankreihe_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHRANKREIHE_TYPE_CLASS__WERT = eINSTANCE.getSchrankreihe_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Steuerbezirksname_TypeClassImpl <em>Steuerbezirksname Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Steuerbezirksname_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSteuerbezirksname_TypeClass()
		 * @generated
		 */
		EClass STEUERBEZIRKSNAME_TYPE_CLASS = eINSTANCE.getSteuerbezirksname_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEUERBEZIRKSNAME_TYPE_CLASS__WERT = eINSTANCE.getSteuerbezirksname_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Steuerbezirksnummer_TypeClassImpl <em>Steuerbezirksnummer Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Steuerbezirksnummer_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSteuerbezirksnummer_TypeClass()
		 * @generated
		 */
		EClass STEUERBEZIRKSNUMMER_TYPE_CLASS = eINSTANCE.getSteuerbezirksnummer_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEUERBEZIRKSNUMMER_TYPE_CLASS__WERT = eINSTANCE.getSteuerbezirksnummer_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Taste_TypeClassImpl <em>Taste Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Taste_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getTaste_TypeClass()
		 * @generated
		 */
		EClass TASTE_TYPE_CLASS = eINSTANCE.getTaste_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASTE_TYPE_CLASS__WERT = eINSTANCE.getTaste_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Vorschauzeit_TypeClassImpl <em>Vorschauzeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Vorschauzeit_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getVorschauzeit_TypeClass()
		 * @generated
		 */
		EClass VORSCHAUZEIT_TYPE_CLASS = eINSTANCE.getVorschauzeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORSCHAUZEIT_TYPE_CLASS__WERT = eINSTANCE.getVorschauzeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.X_Wert_TypeClassImpl <em>XWert Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.X_Wert_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getX_Wert_TypeClass()
		 * @generated
		 */
		EClass XWERT_TYPE_CLASS = eINSTANCE.getX_Wert_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XWERT_TYPE_CLASS__WERT = eINSTANCE.getX_Wert_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.Y_Wert_TypeClassImpl <em>YWert Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.Y_Wert_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getY_Wert_TypeClass()
		 * @generated
		 */
		EClass YWERT_TYPE_CLASS = eINSTANCE.getY_Wert_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YWERT_TYPE_CLASS__WERT = eINSTANCE.getY_Wert_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.impl.YY_Wert_TypeClassImpl <em>YY Wert Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.YY_Wert_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getYY_Wert_TypeClass()
		 * @generated
		 */
		EClass YY_WERT_TYPE_CLASS = eINSTANCE.getYY_Wert_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YY_WERT_TYPE_CLASS__WERT = eINSTANCE.getYY_Wert_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMAWert <em>ENUMA Wert</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMAWert
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMAWert()
		 * @generated
		 */
		EEnum ENUMA_WERT = eINSTANCE.getENUMAWert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMBedienEinrichtBauart <em>ENUM Bedien Einricht Bauart</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBedienEinrichtBauart
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMBedienEinrichtBauart()
		 * @generated
		 */
		EEnum ENUM_BEDIEN_EINRICHT_BAUART = eINSTANCE.getENUMBedienEinrichtBauart();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMBedienPlatzArt <em>ENUM Bedien Platz Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBedienPlatzArt
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMBedienPlatzArt()
		 * @generated
		 */
		EEnum ENUM_BEDIEN_PLATZ_ART = eINSTANCE.getENUMBedienPlatzArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMBSOTeilsystemArt <em>ENUMBSO Teilsystem Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBSOTeilsystemArt
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMBSOTeilsystemArt()
		 * @generated
		 */
		EEnum ENUMBSO_TEILSYSTEM_ART = eINSTANCE.getENUMBSOTeilsystemArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMCWert <em>ENUMC Wert</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMCWert
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMCWert()
		 * @generated
		 */
		EEnum ENUMC_WERT = eINSTANCE.getENUMCWert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMMelder <em>ENUM Melder</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMMelder
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMMelder()
		 * @generated
		 */
		EEnum ENUM_MELDER = eINSTANCE.getENUMMelder();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMOberflaecheBildart <em>ENUM Oberflaeche Bildart</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMOberflaecheBildart
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMOberflaecheBildart()
		 * @generated
		 */
		EEnum ENUM_OBERFLAECHE_BILDART = eINSTANCE.getENUMOberflaecheBildart();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMSchalter <em>ENUM Schalter</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMSchalter
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMSchalter()
		 * @generated
		 */
		EEnum ENUM_SCHALTER = eINSTANCE.getENUMSchalter();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMTaste <em>ENUM Taste</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMTaste
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMTaste()
		 * @generated
		 */
		EEnum ENUM_TASTE = eINSTANCE.getENUMTaste();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Bedienung.ENUMXWert <em>ENUMX Wert</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMXWert
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMXWert()
		 * @generated
		 */
		EEnum ENUMX_WERT = eINSTANCE.getENUMXWert();

		/**
		 * The meta object literal for the '<em>BWert Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getB_Wert_Type()
		 * @generated
		 */
		EDataType BWERT_TYPE = eINSTANCE.getB_Wert_Type();

		/**
		 * The meta object literal for the '<em>Bedien Einricht Oertl Bez Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedien_Einricht_Oertl_Bez_Type()
		 * @generated
		 */
		EDataType BEDIEN_EINRICHT_OERTL_BEZ_TYPE = eINSTANCE.getBedien_Einricht_Oertl_Bez_Type();

		/**
		 * The meta object literal for the '<em>Bedienplatzbezeichnung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedienplatzbezeichnung_Type()
		 * @generated
		 */
		EDataType BEDIENPLATZBEZEICHNUNG_TYPE = eINSTANCE.getBedienplatzbezeichnung_Type();

		/**
		 * The meta object literal for the '<em>Bedienplatznummer Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedienplatznummer_Type()
		 * @generated
		 */
		EDataType BEDIENPLATZNUMMER_TYPE = eINSTANCE.getBedienplatznummer_Type();

		/**
		 * The meta object literal for the '<em>Bedienraumnummer Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBedienraumnummer_Type()
		 * @generated
		 */
		EDataType BEDIENRAUMNUMMER_TYPE = eINSTANCE.getBedienraumnummer_Type();

		/**
		 * The meta object literal for the '<em>Betriebsstellenbezeichner Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBetriebsstellenbezeichner_Type()
		 * @generated
		 */
		EDataType BETRIEBSSTELLENBEZEICHNER_TYPE = eINSTANCE.getBetriebsstellenbezeichner_Type();

		/**
		 * The meta object literal for the '<em>Bez Bed Anrueckabschnitt Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBez_Bed_Anrueckabschnitt_Type()
		 * @generated
		 */
		EDataType BEZ_BED_ANRUECKABSCHNITT_TYPE = eINSTANCE.getBez_Bed_Anrueckabschnitt_Type();

		/**
		 * The meta object literal for the '<em>Bez Bed Anzeige Element Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBez_Bed_Anzeige_Element_Type()
		 * @generated
		 */
		EDataType BEZ_BED_ANZEIGE_ELEMENT_TYPE = eINSTANCE.getBez_Bed_Anzeige_Element_Type();

		/**
		 * The meta object literal for the '<em>Bez Bed Zentrale Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBez_Bed_Zentrale_Type()
		 * @generated
		 */
		EDataType BEZ_BED_ZENTRALE_TYPE = eINSTANCE.getBez_Bed_Zentrale_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung BSO Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getBezeichnung_BSO_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_BSO_TYPE = eINSTANCE.getBezeichnung_BSO_Type();

		/**
		 * The meta object literal for the '<em>DD Wert Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getDD_Wert_Type()
		 * @generated
		 */
		EDataType DD_WERT_TYPE = eINSTANCE.getDD_Wert_Type();

		/**
		 * The meta object literal for the '<em>ENUMA Wert Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMAWert
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMAWertObject()
		 * @generated
		 */
		EDataType ENUMA_WERT_OBJECT = eINSTANCE.getENUMAWertObject();

		/**
		 * The meta object literal for the '<em>ENUM Bedien Einricht Bauart Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBedienEinrichtBauart
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMBedienEinrichtBauartObject()
		 * @generated
		 */
		EDataType ENUM_BEDIEN_EINRICHT_BAUART_OBJECT = eINSTANCE.getENUMBedienEinrichtBauartObject();

		/**
		 * The meta object literal for the '<em>ENUM Bedien Platz Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBedienPlatzArt
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMBedienPlatzArtObject()
		 * @generated
		 */
		EDataType ENUM_BEDIEN_PLATZ_ART_OBJECT = eINSTANCE.getENUMBedienPlatzArtObject();

		/**
		 * The meta object literal for the '<em>ENUMBSO Teilsystem Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMBSOTeilsystemArt
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMBSOTeilsystemArtObject()
		 * @generated
		 */
		EDataType ENUMBSO_TEILSYSTEM_ART_OBJECT = eINSTANCE.getENUMBSOTeilsystemArtObject();

		/**
		 * The meta object literal for the '<em>ENUMC Wert Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMCWert
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMCWertObject()
		 * @generated
		 */
		EDataType ENUMC_WERT_OBJECT = eINSTANCE.getENUMCWertObject();

		/**
		 * The meta object literal for the '<em>ENUM Melder Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMMelder
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMMelderObject()
		 * @generated
		 */
		EDataType ENUM_MELDER_OBJECT = eINSTANCE.getENUMMelderObject();

		/**
		 * The meta object literal for the '<em>ENUM Oberflaeche Bildart Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMOberflaecheBildart
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMOberflaecheBildartObject()
		 * @generated
		 */
		EDataType ENUM_OBERFLAECHE_BILDART_OBJECT = eINSTANCE.getENUMOberflaecheBildartObject();

		/**
		 * The meta object literal for the '<em>ENUM Schalter Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMSchalter
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMSchalterObject()
		 * @generated
		 */
		EDataType ENUM_SCHALTER_OBJECT = eINSTANCE.getENUMSchalterObject();

		/**
		 * The meta object literal for the '<em>ENUM Taste Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMTaste
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMTasteObject()
		 * @generated
		 */
		EDataType ENUM_TASTE_OBJECT = eINSTANCE.getENUMTasteObject();

		/**
		 * The meta object literal for the '<em>ENUMX Wert Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Bedienung.ENUMXWert
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getENUMXWertObject()
		 * @generated
		 */
		EDataType ENUMX_WERT_OBJECT = eINSTANCE.getENUMXWertObject();

		/**
		 * The meta object literal for the '<em>Hupe Anschaltzeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getHupe_Anschaltzeit_Type()
		 * @generated
		 */
		EDataType HUPE_ANSCHALTZEIT_TYPE = eINSTANCE.getHupe_Anschaltzeit_Type();

		/**
		 * The meta object literal for the '<em>IP Adressblock Blau Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Blau_Type()
		 * @generated
		 */
		EDataType IP_ADRESSBLOCK_BLAU_TYPE = eINSTANCE.getIP_Adressblock_Blau_Type();

		/**
		 * The meta object literal for the '<em>IP Adressblock Blau V4 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Blau_V4_Type()
		 * @generated
		 */
		EDataType IP_ADRESSBLOCK_BLAU_V4_TYPE = eINSTANCE.getIP_Adressblock_Blau_V4_Type();

		/**
		 * The meta object literal for the '<em>IP Adressblock Blau V6 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Blau_V6_Type()
		 * @generated
		 */
		EDataType IP_ADRESSBLOCK_BLAU_V6_TYPE = eINSTANCE.getIP_Adressblock_Blau_V6_Type();

		/**
		 * The meta object literal for the '<em>IP Adressblock Grau Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Grau_Type()
		 * @generated
		 */
		EDataType IP_ADRESSBLOCK_GRAU_TYPE = eINSTANCE.getIP_Adressblock_Grau_Type();

		/**
		 * The meta object literal for the '<em>IP Adressblock Grau V4 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Grau_V4_Type()
		 * @generated
		 */
		EDataType IP_ADRESSBLOCK_GRAU_V4_TYPE = eINSTANCE.getIP_Adressblock_Grau_V4_Type();

		/**
		 * The meta object literal for the '<em>IP Adressblock Grau V6 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getIP_Adressblock_Grau_V6_Type()
		 * @generated
		 */
		EDataType IP_ADRESSBLOCK_GRAU_V6_TYPE = eINSTANCE.getIP_Adressblock_Grau_V6_Type();

		/**
		 * The meta object literal for the '<em>Oberflaeche Zustaendigkeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getOberflaeche_Zustaendigkeit_Type()
		 * @generated
		 */
		EDataType OBERFLAECHE_ZUSTAENDIGKEIT_TYPE = eINSTANCE.getOberflaeche_Zustaendigkeit_Type();

		/**
		 * The meta object literal for the '<em>Rueckschauzeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getRueckschauzeit_Type()
		 * @generated
		 */
		EDataType RUECKSCHAUZEIT_TYPE = eINSTANCE.getRueckschauzeit_Type();

		/**
		 * The meta object literal for the '<em>Schrankreihe Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSchrankreihe_Type()
		 * @generated
		 */
		EDataType SCHRANKREIHE_TYPE = eINSTANCE.getSchrankreihe_Type();

		/**
		 * The meta object literal for the '<em>Steuerbezirksname Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSteuerbezirksname_Type()
		 * @generated
		 */
		EDataType STEUERBEZIRKSNAME_TYPE = eINSTANCE.getSteuerbezirksname_Type();

		/**
		 * The meta object literal for the '<em>Steuerbezirksnummer Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getSteuerbezirksnummer_Type()
		 * @generated
		 */
		EDataType STEUERBEZIRKSNUMMER_TYPE = eINSTANCE.getSteuerbezirksnummer_Type();

		/**
		 * The meta object literal for the '<em>Vorschauzeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getVorschauzeit_Type()
		 * @generated
		 */
		EDataType VORSCHAUZEIT_TYPE = eINSTANCE.getVorschauzeit_Type();

		/**
		 * The meta object literal for the '<em>YWert Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getY_Wert_Type()
		 * @generated
		 */
		EDataType YWERT_TYPE = eINSTANCE.getY_Wert_Type();

		/**
		 * The meta object literal for the '<em>YY Wert Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl#getYY_Wert_Type()
		 * @generated
		 */
		EDataType YY_WERT_TYPE = eINSTANCE.getYY_Wert_Type();

	}

} //BedienungPackage
