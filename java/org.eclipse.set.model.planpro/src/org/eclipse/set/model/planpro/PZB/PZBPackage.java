/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PZB;

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
 * @see org.eclipse.set.model.planpro.PZB.PZBFactory
 * @model kind="package"
 * @generated
 */
public interface PZBPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PZB";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/PZB/1.10.0.3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsPZB";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PZBPackage eINSTANCE = org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.GUE_Abstand_Abweichend_TypeClassImpl <em>GUE Abstand Abweichend Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.GUE_Abstand_Abweichend_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Abstand_Abweichend_TypeClass()
	 * @generated
	 */
	int GUE_ABSTAND_ABWEICHEND_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_ABSTAND_ABWEICHEND_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_ABSTAND_ABWEICHEND_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GUE Abstand Abweichend Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_ABSTAND_ABWEICHEND_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.GUE_Anordnung_TypeClassImpl <em>GUE Anordnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.GUE_Anordnung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Anordnung_TypeClass()
	 * @generated
	 */
	int GUE_ANORDNUNG_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_ANORDNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_ANORDNUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GUE Anordnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_ANORDNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.GUE_Bauart_TypeClassImpl <em>GUE Bauart Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.GUE_Bauart_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Bauart_TypeClass()
	 * @generated
	 */
	int GUE_BAUART_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_BAUART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_BAUART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GUE Bauart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_BAUART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.GUE_Energieversorgung_TypeClassImpl <em>GUE Energieversorgung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.GUE_Energieversorgung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Energieversorgung_TypeClass()
	 * @generated
	 */
	int GUE_ENERGIEVERSORGUNG_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_ENERGIEVERSORGUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_ENERGIEVERSORGUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GUE Energieversorgung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_ENERGIEVERSORGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.GUE_Messstrecke_TypeClassImpl <em>GUE Messstrecke Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.GUE_Messstrecke_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Messstrecke_TypeClass()
	 * @generated
	 */
	int GUE_MESSSTRECKE_TYPE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_MESSSTRECKE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_MESSSTRECKE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GUE Messstrecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUE_MESSSTRECKE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.INA_Gefahrstelle_AttributeGroupImpl <em>INA Gefahrstelle Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.INA_Gefahrstelle_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getINA_Gefahrstelle_AttributeGroup()
	 * @generated
	 */
	int INA_GEFAHRSTELLE_ATTRIBUTE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>ID Markanter Punkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT = 0;

	/**
	 * The feature id for the '<em><b>Prioritaet Gefahrstelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE = 1;

	/**
	 * The number of structural features of the '<em>INA Gefahrstelle Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INA_GEFAHRSTELLE_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.Messfehler_TypeClassImpl <em>Messfehler Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.Messfehler_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getMessfehler_TypeClass()
	 * @generated
	 */
	int MESSFEHLER_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSFEHLER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSFEHLER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Messfehler Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSFEHLER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.Prioritaet_Gefahrstelle_TypeClassImpl <em>Prioritaet Gefahrstelle Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.Prioritaet_Gefahrstelle_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPrioritaet_Gefahrstelle_TypeClass()
	 * @generated
	 */
	int PRIORITAET_GEFAHRSTELLE_TYPE_CLASS = 7;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITAET_GEFAHRSTELLE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITAET_GEFAHRSTELLE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prioritaet Gefahrstelle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITAET_GEFAHRSTELLE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.Pruefgeschwindigkeit_TypeClassImpl <em>Pruefgeschwindigkeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.Pruefgeschwindigkeit_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPruefgeschwindigkeit_TypeClass()
	 * @generated
	 */
	int PRUEFGESCHWINDIGKEIT_TYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFGESCHWINDIGKEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFGESCHWINDIGKEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pruefgeschwindigkeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFGESCHWINDIGKEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.Pruefzeit_TypeClassImpl <em>Pruefzeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.Pruefzeit_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPruefzeit_TypeClass()
	 * @generated
	 */
	int PRUEFZEIT_TYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFZEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFZEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pruefzeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEFZEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Abstand_GM_TypeClassImpl <em>PZB Abstand GM Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Abstand_GM_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Abstand_GM_TypeClass()
	 * @generated
	 */
	int PZB_ABSTAND_GM_TYPE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ABSTAND_GM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ABSTAND_GM_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PZB Abstand GM Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ABSTAND_GM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Art_TypeClassImpl <em>PZB Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Art_TypeClass()
	 * @generated
	 */
	int PZB_ART_TYPE_CLASS = 11;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PZB Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_ElementImpl <em>PZB Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_ElementImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element()
	 * @generated
	 */
	int PZB_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.PUNKT_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>IDPZB Element Zuordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PZB Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT__PZB_ART = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Stellelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT__ID_STELLELEMENT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT__ID_UNTERBRINGUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>PZB Element GM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT__PZB_ELEMENT_GM = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>PZB Element GUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT__PZB_ELEMENT_GUE = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>PZB Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_GM_AttributeGroupImpl <em>PZB Element GM Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Element_GM_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element_GM_AttributeGroup()
	 * @generated
	 */
	int PZB_ELEMENT_GM_ATTRIBUTE_GROUP = 13;

	/**
	 * The feature id for the '<em><b>PZB Abstand GM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZB_ABSTAND_GM = 0;

	/**
	 * The feature id for the '<em><b>PZBINA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZBINA = 1;

	/**
	 * The number of structural features of the '<em>PZB Element GM Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_GM_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_GUE_AttributeGroupImpl <em>PZB Element GUE Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Element_GUE_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element_GUE_AttributeGroup()
	 * @generated
	 */
	int PZB_ELEMENT_GUE_ATTRIBUTE_GROUP = 14;

	/**
	 * The feature id for the '<em><b>GUE Abstand Abweichend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ABSTAND_ABWEICHEND = 0;

	/**
	 * The feature id for the '<em><b>GUE Anordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ANORDNUNG = 1;

	/**
	 * The feature id for the '<em><b>GUE Bauart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_BAUART = 2;

	/**
	 * The feature id for the '<em><b>GUE Energieversorgung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ENERGIEVERSORGUNG = 3;

	/**
	 * The feature id for the '<em><b>GUE Messstrecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_MESSSTRECKE = 4;

	/**
	 * The feature id for the '<em><b>IDPZB Element Mitnutzung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__IDPZB_ELEMENT_MITNUTZUNG = 5;

	/**
	 * The feature id for the '<em><b>Messfehler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__MESSFEHLER = 6;

	/**
	 * The feature id for the '<em><b>Pruefgeschwindigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFGESCHWINDIGKEIT = 7;

	/**
	 * The feature id for the '<em><b>Pruefzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFZEIT = 8;

	/**
	 * The number of structural features of the '<em>PZB Element GUE Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_GUE_ATTRIBUTE_GROUP_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_ZuordnungImpl <em>PZB Element Zuordnung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Element_ZuordnungImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element_Zuordnung()
	 * @generated
	 */
	int PZB_ELEMENT_ZUORDNUNG = 15;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>PZB Element Zuordnung BP</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_BP = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PZB Element Zuordnung Fstr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_FSTR = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PZB Element Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_BP_AttributeGroupImpl <em>PZB Element Zuordnung BP Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_BP_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element_Zuordnung_BP_AttributeGroup()
	 * @generated
	 */
	int PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP = 16;

	/**
	 * The feature id for the '<em><b>IDPZB Element Bezugspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT = 0;

	/**
	 * The feature id for the '<em><b>INA Gefahrstelle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__INA_GEFAHRSTELLE = 1;

	/**
	 * The feature id for the '<em><b>PZB Element Zuordnung INA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA = 2;

	/**
	 * The feature id for the '<em><b>Wirksamkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT = 3;

	/**
	 * The number of structural features of the '<em>PZB Element Zuordnung BP Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_Fstr_AttributeGroupImpl <em>PZB Element Zuordnung Fstr Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_Fstr_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element_Zuordnung_Fstr_AttributeGroup()
	 * @generated
	 */
	int PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP = 17;

	/**
	 * The feature id for the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER = 0;

	/**
	 * The feature id for the '<em><b>Wirksamkeit Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR = 1;

	/**
	 * The number of structural features of the '<em>PZB Element Zuordnung Fstr Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl <em>PZB Element Zuordnung INA Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element_Zuordnung_INA_AttributeGroup()
	 * @generated
	 */
	int PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP = 18;

	/**
	 * The feature id for the '<em><b>ID Anhang INA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA = 0;

	/**
	 * The feature id for the '<em><b>ID Bahnsteig Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE = 1;

	/**
	 * The number of structural features of the '<em>PZB Element Zuordnung INA Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_INA_TypeClassImpl <em>PZB INA Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_INA_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_INA_TypeClass()
	 * @generated
	 */
	int PZB_INA_TYPE_CLASS = 19;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_INA_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_INA_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PZB INA Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_INA_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Zuordnung_SignalImpl <em>PZB Zuordnung Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Zuordnung_SignalImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Zuordnung_Signal()
	 * @generated
	 */
	int PZB_ZUORDNUNG_SIGNAL = 20;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ZUORDNUNG_SIGNAL__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ZUORDNUNG_SIGNAL__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ZUORDNUNG_SIGNAL__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ZUORDNUNG_SIGNAL__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ZUORDNUNG_SIGNAL__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDPZB Element Zuordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PZB Zuordnung Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZB_ZUORDNUNG_SIGNAL_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.Wirksamkeit_Fstr_TypeClassImpl <em>Wirksamkeit Fstr Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.Wirksamkeit_Fstr_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getWirksamkeit_Fstr_TypeClass()
	 * @generated
	 */
	int WIRKSAMKEIT_FSTR_TYPE_CLASS = 21;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRKSAMKEIT_FSTR_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRKSAMKEIT_FSTR_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wirksamkeit Fstr Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRKSAMKEIT_FSTR_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.impl.Wirksamkeit_TypeClassImpl <em>Wirksamkeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.impl.Wirksamkeit_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getWirksamkeit_TypeClass()
	 * @generated
	 */
	int WIRKSAMKEIT_TYPE_CLASS = 22;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRKSAMKEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRKSAMKEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wirksamkeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRKSAMKEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.ENUMGUEAnordnung <em>ENUMGUE Anordnung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEAnordnung
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMGUEAnordnung()
	 * @generated
	 */
	int ENUMGUE_ANORDNUNG = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.ENUMGUEBauart <em>ENUMGUE Bauart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEBauart
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMGUEBauart()
	 * @generated
	 */
	int ENUMGUE_BAUART = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.ENUMGUEEnergieversorgung <em>ENUMGUE Energieversorgung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEEnergieversorgung
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMGUEEnergieversorgung()
	 * @generated
	 */
	int ENUMGUE_ENERGIEVERSORGUNG = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.ENUMMessfehler <em>ENUM Messfehler</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMMessfehler
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMMessfehler()
	 * @generated
	 */
	int ENUM_MESSFEHLER = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.ENUMPZBArt <em>ENUMPZB Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMPZBArt
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMPZBArt()
	 * @generated
	 */
	int ENUMPZB_ART = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.ENUMWirksamkeit <em>ENUM Wirksamkeit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMWirksamkeit
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMWirksamkeit()
	 * @generated
	 */
	int ENUM_WIRKSAMKEIT = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.PZB.ENUMWirksamkeitFstr <em>ENUM Wirksamkeit Fstr</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMWirksamkeitFstr
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMWirksamkeitFstr()
	 * @generated
	 */
	int ENUM_WIRKSAMKEIT_FSTR = 29;

	/**
	 * The meta object id for the '<em>ENUMGUE Anordnung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEAnordnung
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMGUEAnordnungObject()
	 * @generated
	 */
	int ENUMGUE_ANORDNUNG_OBJECT = 30;

	/**
	 * The meta object id for the '<em>ENUMGUE Bauart Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEBauart
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMGUEBauartObject()
	 * @generated
	 */
	int ENUMGUE_BAUART_OBJECT = 31;

	/**
	 * The meta object id for the '<em>ENUMGUE Energieversorgung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEEnergieversorgung
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMGUEEnergieversorgungObject()
	 * @generated
	 */
	int ENUMGUE_ENERGIEVERSORGUNG_OBJECT = 32;

	/**
	 * The meta object id for the '<em>ENUM Messfehler Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMMessfehler
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMMessfehlerObject()
	 * @generated
	 */
	int ENUM_MESSFEHLER_OBJECT = 33;

	/**
	 * The meta object id for the '<em>ENUMPZB Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMPZBArt
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMPZBArtObject()
	 * @generated
	 */
	int ENUMPZB_ART_OBJECT = 34;

	/**
	 * The meta object id for the '<em>ENUM Wirksamkeit Fstr Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMWirksamkeitFstr
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMWirksamkeitFstrObject()
	 * @generated
	 */
	int ENUM_WIRKSAMKEIT_FSTR_OBJECT = 35;

	/**
	 * The meta object id for the '<em>ENUM Wirksamkeit Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.PZB.ENUMWirksamkeit
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMWirksamkeitObject()
	 * @generated
	 */
	int ENUM_WIRKSAMKEIT_OBJECT = 36;

	/**
	 * The meta object id for the '<em>GUE Abstand Abweichend Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Abstand_Abweichend_Type()
	 * @generated
	 */
	int GUE_ABSTAND_ABWEICHEND_TYPE = 37;

	/**
	 * The meta object id for the '<em>GUE Messstrecke Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Messstrecke_Type()
	 * @generated
	 */
	int GUE_MESSSTRECKE_TYPE = 38;

	/**
	 * The meta object id for the '<em>Prioritaet Gefahrstelle Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPrioritaet_Gefahrstelle_Type()
	 * @generated
	 */
	int PRIORITAET_GEFAHRSTELLE_TYPE = 39;

	/**
	 * The meta object id for the '<em>Pruefgeschwindigkeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPruefgeschwindigkeit_Type()
	 * @generated
	 */
	int PRUEFGESCHWINDIGKEIT_TYPE = 40;

	/**
	 * The meta object id for the '<em>Pruefzeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPruefzeit_Type()
	 * @generated
	 */
	int PRUEFZEIT_TYPE = 41;

	/**
	 * The meta object id for the '<em>PZB Abstand GM Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Abstand_GM_Type()
	 * @generated
	 */
	int PZB_ABSTAND_GM_TYPE = 42;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.GUE_Abstand_Abweichend_TypeClass <em>GUE Abstand Abweichend Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUE Abstand Abweichend Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.GUE_Abstand_Abweichend_TypeClass
	 * @generated
	 */
	EClass getGUE_Abstand_Abweichend_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.GUE_Abstand_Abweichend_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.GUE_Abstand_Abweichend_TypeClass#getWert()
	 * @see #getGUE_Abstand_Abweichend_TypeClass()
	 * @generated
	 */
	EAttribute getGUE_Abstand_Abweichend_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.GUE_Anordnung_TypeClass <em>GUE Anordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUE Anordnung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.GUE_Anordnung_TypeClass
	 * @generated
	 */
	EClass getGUE_Anordnung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.GUE_Anordnung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.GUE_Anordnung_TypeClass#getWert()
	 * @see #getGUE_Anordnung_TypeClass()
	 * @generated
	 */
	EAttribute getGUE_Anordnung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.GUE_Bauart_TypeClass <em>GUE Bauart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUE Bauart Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.GUE_Bauart_TypeClass
	 * @generated
	 */
	EClass getGUE_Bauart_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.GUE_Bauart_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.GUE_Bauart_TypeClass#getWert()
	 * @see #getGUE_Bauart_TypeClass()
	 * @generated
	 */
	EAttribute getGUE_Bauart_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.GUE_Energieversorgung_TypeClass <em>GUE Energieversorgung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUE Energieversorgung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.GUE_Energieversorgung_TypeClass
	 * @generated
	 */
	EClass getGUE_Energieversorgung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.GUE_Energieversorgung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.GUE_Energieversorgung_TypeClass#getWert()
	 * @see #getGUE_Energieversorgung_TypeClass()
	 * @generated
	 */
	EAttribute getGUE_Energieversorgung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.GUE_Messstrecke_TypeClass <em>GUE Messstrecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUE Messstrecke Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.GUE_Messstrecke_TypeClass
	 * @generated
	 */
	EClass getGUE_Messstrecke_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.GUE_Messstrecke_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.GUE_Messstrecke_TypeClass#getWert()
	 * @see #getGUE_Messstrecke_TypeClass()
	 * @generated
	 */
	EAttribute getGUE_Messstrecke_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.INA_Gefahrstelle_AttributeGroup <em>INA Gefahrstelle Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INA Gefahrstelle Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.INA_Gefahrstelle_AttributeGroup
	 * @generated
	 */
	EClass getINA_Gefahrstelle_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.INA_Gefahrstelle_AttributeGroup#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Markanter Punkt</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.INA_Gefahrstelle_AttributeGroup#getIDMarkanterPunkt()
	 * @see #getINA_Gefahrstelle_AttributeGroup()
	 * @generated
	 */
	EReference getINA_Gefahrstelle_AttributeGroup_IDMarkanterPunkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.INA_Gefahrstelle_AttributeGroup#getPrioritaetGefahrstelle <em>Prioritaet Gefahrstelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prioritaet Gefahrstelle</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.INA_Gefahrstelle_AttributeGroup#getPrioritaetGefahrstelle()
	 * @see #getINA_Gefahrstelle_AttributeGroup()
	 * @generated
	 */
	EReference getINA_Gefahrstelle_AttributeGroup_PrioritaetGefahrstelle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.Messfehler_TypeClass <em>Messfehler Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Messfehler Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.Messfehler_TypeClass
	 * @generated
	 */
	EClass getMessfehler_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.Messfehler_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.Messfehler_TypeClass#getWert()
	 * @see #getMessfehler_TypeClass()
	 * @generated
	 */
	EAttribute getMessfehler_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.Prioritaet_Gefahrstelle_TypeClass <em>Prioritaet Gefahrstelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prioritaet Gefahrstelle Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.Prioritaet_Gefahrstelle_TypeClass
	 * @generated
	 */
	EClass getPrioritaet_Gefahrstelle_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.Prioritaet_Gefahrstelle_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.Prioritaet_Gefahrstelle_TypeClass#getWert()
	 * @see #getPrioritaet_Gefahrstelle_TypeClass()
	 * @generated
	 */
	EAttribute getPrioritaet_Gefahrstelle_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.Pruefgeschwindigkeit_TypeClass <em>Pruefgeschwindigkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pruefgeschwindigkeit Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.Pruefgeschwindigkeit_TypeClass
	 * @generated
	 */
	EClass getPruefgeschwindigkeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.Pruefgeschwindigkeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.Pruefgeschwindigkeit_TypeClass#getWert()
	 * @see #getPruefgeschwindigkeit_TypeClass()
	 * @generated
	 */
	EAttribute getPruefgeschwindigkeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.Pruefzeit_TypeClass <em>Pruefzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pruefzeit Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.Pruefzeit_TypeClass
	 * @generated
	 */
	EClass getPruefzeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.Pruefzeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.Pruefzeit_TypeClass#getWert()
	 * @see #getPruefzeit_TypeClass()
	 * @generated
	 */
	EAttribute getPruefzeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.PZB_Abstand_GM_TypeClass <em>PZB Abstand GM Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PZB Abstand GM Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Abstand_GM_TypeClass
	 * @generated
	 */
	EClass getPZB_Abstand_GM_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.PZB_Abstand_GM_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Abstand_GM_TypeClass#getWert()
	 * @see #getPZB_Abstand_GM_TypeClass()
	 * @generated
	 */
	EAttribute getPZB_Abstand_GM_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.PZB_Art_TypeClass <em>PZB Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PZB Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Art_TypeClass
	 * @generated
	 */
	EClass getPZB_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.PZB_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Art_TypeClass#getWert()
	 * @see #getPZB_Art_TypeClass()
	 * @generated
	 */
	EAttribute getPZB_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.PZB_Element <em>PZB Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PZB Element</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element
	 * @generated
	 */
	EClass getPZB_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDPZB Element Zuordnung</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element#getIDPZBElementZuordnung()
	 * @see #getPZB_Element()
	 * @generated
	 */
	EReference getPZB_Element_IDPZBElementZuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element#getPZBArt <em>PZB Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PZB Art</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element#getPZBArt()
	 * @see #getPZB_Element()
	 * @generated
	 */
	EReference getPZB_Element_PZBArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element#getIDStellelement <em>ID Stellelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Stellelement</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element#getIDStellelement()
	 * @see #getPZB_Element()
	 * @generated
	 */
	EReference getPZB_Element_IDStellelement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element#getIDUnterbringung <em>ID Unterbringung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Unterbringung</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element#getIDUnterbringung()
	 * @see #getPZB_Element()
	 * @generated
	 */
	EReference getPZB_Element_IDUnterbringung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element#getPZBElementGM <em>PZB Element GM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PZB Element GM</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element#getPZBElementGM()
	 * @see #getPZB_Element()
	 * @generated
	 */
	EReference getPZB_Element_PZBElementGM();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element#getPZBElementGUE <em>PZB Element GUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PZB Element GUE</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element#getPZBElementGUE()
	 * @see #getPZB_Element()
	 * @generated
	 */
	EReference getPZB_Element_PZBElementGUE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GM_AttributeGroup <em>PZB Element GM Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PZB Element GM Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_GM_AttributeGroup
	 * @generated
	 */
	EClass getPZB_Element_GM_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GM_AttributeGroup#getPZBAbstandGM <em>PZB Abstand GM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PZB Abstand GM</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_GM_AttributeGroup#getPZBAbstandGM()
	 * @see #getPZB_Element_GM_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_GM_AttributeGroup_PZBAbstandGM();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GM_AttributeGroup#getPZBINA <em>PZBINA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PZBINA</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_GM_AttributeGroup#getPZBINA()
	 * @see #getPZB_Element_GM_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_GM_AttributeGroup_PZBINA();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup <em>PZB Element GUE Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PZB Element GUE Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup
	 * @generated
	 */
	EClass getPZB_Element_GUE_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEAbstandAbweichend <em>GUE Abstand Abweichend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GUE Abstand Abweichend</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEAbstandAbweichend()
	 * @see #getPZB_Element_GUE_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_GUE_AttributeGroup_GUEAbstandAbweichend();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEAnordnung <em>GUE Anordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GUE Anordnung</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEAnordnung()
	 * @see #getPZB_Element_GUE_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_GUE_AttributeGroup_GUEAnordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEBauart <em>GUE Bauart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GUE Bauart</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEBauart()
	 * @see #getPZB_Element_GUE_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_GUE_AttributeGroup_GUEBauart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEEnergieversorgung <em>GUE Energieversorgung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GUE Energieversorgung</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEEnergieversorgung()
	 * @see #getPZB_Element_GUE_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_GUE_AttributeGroup_GUEEnergieversorgung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEMessstrecke <em>GUE Messstrecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GUE Messstrecke</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEMessstrecke()
	 * @see #getPZB_Element_GUE_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_GUE_AttributeGroup_GUEMessstrecke();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getIDPZBElementMitnutzung <em>IDPZB Element Mitnutzung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDPZB Element Mitnutzung</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getIDPZBElementMitnutzung()
	 * @see #getPZB_Element_GUE_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_GUE_AttributeGroup_IDPZBElementMitnutzung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getMessfehler <em>Messfehler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Messfehler</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getMessfehler()
	 * @see #getPZB_Element_GUE_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_GUE_AttributeGroup_Messfehler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getPruefgeschwindigkeit <em>Pruefgeschwindigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pruefgeschwindigkeit</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getPruefgeschwindigkeit()
	 * @see #getPZB_Element_GUE_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_GUE_AttributeGroup_Pruefgeschwindigkeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getPruefzeit <em>Pruefzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pruefzeit</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getPruefzeit()
	 * @see #getPZB_Element_GUE_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_GUE_AttributeGroup_Pruefzeit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung <em>PZB Element Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PZB Element Zuordnung</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung
	 * @generated
	 */
	EClass getPZB_Element_Zuordnung();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung#getPZBElementZuordnungBP <em>PZB Element Zuordnung BP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>PZB Element Zuordnung BP</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung#getPZBElementZuordnungBP()
	 * @see #getPZB_Element_Zuordnung()
	 * @generated
	 */
	EReference getPZB_Element_Zuordnung_PZBElementZuordnungBP();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung#getPZBElementZuordnungFstr <em>PZB Element Zuordnung Fstr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>PZB Element Zuordnung Fstr</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung#getPZBElementZuordnungFstr()
	 * @see #getPZB_Element_Zuordnung()
	 * @generated
	 */
	EReference getPZB_Element_Zuordnung_PZBElementZuordnungFstr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup <em>PZB Element Zuordnung BP Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PZB Element Zuordnung BP Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup
	 * @generated
	 */
	EClass getPZB_Element_Zuordnung_BP_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getIDPZBElementBezugspunkt <em>IDPZB Element Bezugspunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDPZB Element Bezugspunkt</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getIDPZBElementBezugspunkt()
	 * @see #getPZB_Element_Zuordnung_BP_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_Zuordnung_BP_AttributeGroup_IDPZBElementBezugspunkt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getINAGefahrstelle <em>INA Gefahrstelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>INA Gefahrstelle</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getINAGefahrstelle()
	 * @see #getPZB_Element_Zuordnung_BP_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_Zuordnung_BP_AttributeGroup_INAGefahrstelle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getPZBElementZuordnungINA <em>PZB Element Zuordnung INA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PZB Element Zuordnung INA</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getPZBElementZuordnungINA()
	 * @see #getPZB_Element_Zuordnung_BP_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_Zuordnung_BP_AttributeGroup_PZBElementZuordnungINA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getWirksamkeit <em>Wirksamkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wirksamkeit</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getWirksamkeit()
	 * @see #getPZB_Element_Zuordnung_BP_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_Zuordnung_BP_AttributeGroup_Wirksamkeit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup <em>PZB Element Zuordnung Fstr Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PZB Element Zuordnung Fstr Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup
	 * @generated
	 */
	EClass getPZB_Element_Zuordnung_Fstr_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr Zug Rangier</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup#getIDFstrZugRangier()
	 * @see #getPZB_Element_Zuordnung_Fstr_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_Zuordnung_Fstr_AttributeGroup_IDFstrZugRangier();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup#getWirksamkeitFstr <em>Wirksamkeit Fstr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wirksamkeit Fstr</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup#getWirksamkeitFstr()
	 * @see #getPZB_Element_Zuordnung_Fstr_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_Zuordnung_Fstr_AttributeGroup_WirksamkeitFstr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_INA_AttributeGroup <em>PZB Element Zuordnung INA Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PZB Element Zuordnung INA Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_INA_AttributeGroup
	 * @generated
	 */
	EClass getPZB_Element_Zuordnung_INA_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDAnhangINA <em>ID Anhang INA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Anhang INA</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDAnhangINA()
	 * @see #getPZB_Element_Zuordnung_INA_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_Zuordnung_INA_AttributeGroup_IDAnhangINA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bahnsteig Kante</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDBahnsteigKante()
	 * @see #getPZB_Element_Zuordnung_INA_AttributeGroup()
	 * @generated
	 */
	EReference getPZB_Element_Zuordnung_INA_AttributeGroup_IDBahnsteigKante();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.PZB_INA_TypeClass <em>PZB INA Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PZB INA Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_INA_TypeClass
	 * @generated
	 */
	EClass getPZB_INA_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.PZB_INA_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_INA_TypeClass#getWert()
	 * @see #getPZB_INA_TypeClass()
	 * @generated
	 */
	EAttribute getPZB_INA_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.PZB_Zuordnung_Signal <em>PZB Zuordnung Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PZB Zuordnung Signal</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Zuordnung_Signal
	 * @generated
	 */
	EClass getPZB_Zuordnung_Signal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Zuordnung_Signal#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDPZB Element Zuordnung</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Zuordnung_Signal#getIDPZBElementZuordnung()
	 * @see #getPZB_Zuordnung_Signal()
	 * @generated
	 */
	EReference getPZB_Zuordnung_Signal_IDPZBElementZuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.PZB.PZB_Zuordnung_Signal#getIDSignal <em>ID Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.PZB_Zuordnung_Signal#getIDSignal()
	 * @see #getPZB_Zuordnung_Signal()
	 * @generated
	 */
	EReference getPZB_Zuordnung_Signal_IDSignal();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.Wirksamkeit_Fstr_TypeClass <em>Wirksamkeit Fstr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wirksamkeit Fstr Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.Wirksamkeit_Fstr_TypeClass
	 * @generated
	 */
	EClass getWirksamkeit_Fstr_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.Wirksamkeit_Fstr_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.Wirksamkeit_Fstr_TypeClass#getWert()
	 * @see #getWirksamkeit_Fstr_TypeClass()
	 * @generated
	 */
	EAttribute getWirksamkeit_Fstr_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.PZB.Wirksamkeit_TypeClass <em>Wirksamkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wirksamkeit Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.Wirksamkeit_TypeClass
	 * @generated
	 */
	EClass getWirksamkeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.PZB.Wirksamkeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.Wirksamkeit_TypeClass#getWert()
	 * @see #getWirksamkeit_TypeClass()
	 * @generated
	 */
	EAttribute getWirksamkeit_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.PZB.ENUMGUEAnordnung <em>ENUMGUE Anordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMGUE Anordnung</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEAnordnung
	 * @generated
	 */
	EEnum getENUMGUEAnordnung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.PZB.ENUMGUEBauart <em>ENUMGUE Bauart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMGUE Bauart</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEBauart
	 * @generated
	 */
	EEnum getENUMGUEBauart();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.PZB.ENUMGUEEnergieversorgung <em>ENUMGUE Energieversorgung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMGUE Energieversorgung</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEEnergieversorgung
	 * @generated
	 */
	EEnum getENUMGUEEnergieversorgung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.PZB.ENUMMessfehler <em>ENUM Messfehler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Messfehler</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMMessfehler
	 * @generated
	 */
	EEnum getENUMMessfehler();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.PZB.ENUMPZBArt <em>ENUMPZB Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMPZB Art</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMPZBArt
	 * @generated
	 */
	EEnum getENUMPZBArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.PZB.ENUMWirksamkeit <em>ENUM Wirksamkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Wirksamkeit</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMWirksamkeit
	 * @generated
	 */
	EEnum getENUMWirksamkeit();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.PZB.ENUMWirksamkeitFstr <em>ENUM Wirksamkeit Fstr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Wirksamkeit Fstr</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMWirksamkeitFstr
	 * @generated
	 */
	EEnum getENUMWirksamkeitFstr();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.PZB.ENUMGUEAnordnung <em>ENUMGUE Anordnung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMGUE Anordnung Object</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEAnordnung
	 * @model instanceClass="org.eclipse.set.model.planpro.PZB.ENUMGUEAnordnung"
	 *        extendedMetaData="name='ENUMGUE_Anordnung:Object' baseType='ENUMGUE_Anordnung'"
	 * @generated
	 */
	EDataType getENUMGUEAnordnungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.PZB.ENUMGUEBauart <em>ENUMGUE Bauart Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMGUE Bauart Object</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEBauart
	 * @model instanceClass="org.eclipse.set.model.planpro.PZB.ENUMGUEBauart"
	 *        extendedMetaData="name='ENUMGUE_Bauart:Object' baseType='ENUMGUE_Bauart'"
	 * @generated
	 */
	EDataType getENUMGUEBauartObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.PZB.ENUMGUEEnergieversorgung <em>ENUMGUE Energieversorgung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMGUE Energieversorgung Object</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEEnergieversorgung
	 * @model instanceClass="org.eclipse.set.model.planpro.PZB.ENUMGUEEnergieversorgung"
	 *        extendedMetaData="name='ENUMGUE_Energieversorgung:Object' baseType='ENUMGUE_Energieversorgung'"
	 * @generated
	 */
	EDataType getENUMGUEEnergieversorgungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.PZB.ENUMMessfehler <em>ENUM Messfehler Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Messfehler Object</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMMessfehler
	 * @model instanceClass="org.eclipse.set.model.planpro.PZB.ENUMMessfehler"
	 *        extendedMetaData="name='ENUMMessfehler:Object' baseType='ENUMMessfehler'"
	 * @generated
	 */
	EDataType getENUMMessfehlerObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.PZB.ENUMPZBArt <em>ENUMPZB Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMPZB Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMPZBArt
	 * @model instanceClass="org.eclipse.set.model.planpro.PZB.ENUMPZBArt"
	 *        extendedMetaData="name='ENUMPZB_Art:Object' baseType='ENUMPZB_Art'"
	 * @generated
	 */
	EDataType getENUMPZBArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.PZB.ENUMWirksamkeitFstr <em>ENUM Wirksamkeit Fstr Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Wirksamkeit Fstr Object</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMWirksamkeitFstr
	 * @model instanceClass="org.eclipse.set.model.planpro.PZB.ENUMWirksamkeitFstr"
	 *        extendedMetaData="name='ENUMWirksamkeit_Fstr:Object' baseType='ENUMWirksamkeit_Fstr'"
	 * @generated
	 */
	EDataType getENUMWirksamkeitFstrObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.PZB.ENUMWirksamkeit <em>ENUM Wirksamkeit Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Wirksamkeit Object</em>'.
	 * @see org.eclipse.set.model.planpro.PZB.ENUMWirksamkeit
	 * @model instanceClass="org.eclipse.set.model.planpro.PZB.ENUMWirksamkeit"
	 *        extendedMetaData="name='ENUMWirksamkeit:Object' baseType='ENUMWirksamkeit'"
	 * @generated
	 */
	EDataType getENUMWirksamkeitObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>GUE Abstand Abweichend Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GUE Abstand Abweichend Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TGUE_Abstand_Abweichend' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter'"
	 * @generated
	 */
	EDataType getGUE_Abstand_Abweichend_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>GUE Messstrecke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GUE Messstrecke Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TGUE_Messstrecke' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter' pattern='5\\.[89][0-9]|([6-9]|[1-6][0-9]|7[0-4])\\.[0-9]{2}|75\\.00'"
	 * @generated
	 */
	EDataType getGUE_Messstrecke_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Prioritaet Gefahrstelle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Prioritaet Gefahrstelle Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TPrioritaet_Gefahrstelle' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getPrioritaet_Gefahrstelle_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Pruefgeschwindigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pruefgeschwindigkeit Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TPruefgeschwindigkeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TGeschwindigkeit' pattern='[1-9][0-9]|1[0-4][0-9]|150'"
	 * @generated
	 */
	EDataType getPruefgeschwindigkeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Pruefzeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pruefzeit Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TPruefzeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TSekunde' pattern='(0|[1-9][0-9]{0,1})\\.[0-9]{2}'"
	 * @generated
	 */
	EDataType getPruefzeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>PZB Abstand GM Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>PZB Abstand GM Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TPZB_Abstand_GM' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TMeter' pattern='\\-[1-6]|[0-9]|[1-9][0-9]|[12][0-9]{2}|300'"
	 * @generated
	 */
	EDataType getPZB_Abstand_GM_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PZBFactory getPZBFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.GUE_Abstand_Abweichend_TypeClassImpl <em>GUE Abstand Abweichend Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.GUE_Abstand_Abweichend_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Abstand_Abweichend_TypeClass()
		 * @generated
		 */
		EClass GUE_ABSTAND_ABWEICHEND_TYPE_CLASS = eINSTANCE.getGUE_Abstand_Abweichend_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUE_ABSTAND_ABWEICHEND_TYPE_CLASS__WERT = eINSTANCE.getGUE_Abstand_Abweichend_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.GUE_Anordnung_TypeClassImpl <em>GUE Anordnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.GUE_Anordnung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Anordnung_TypeClass()
		 * @generated
		 */
		EClass GUE_ANORDNUNG_TYPE_CLASS = eINSTANCE.getGUE_Anordnung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUE_ANORDNUNG_TYPE_CLASS__WERT = eINSTANCE.getGUE_Anordnung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.GUE_Bauart_TypeClassImpl <em>GUE Bauart Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.GUE_Bauart_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Bauart_TypeClass()
		 * @generated
		 */
		EClass GUE_BAUART_TYPE_CLASS = eINSTANCE.getGUE_Bauart_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUE_BAUART_TYPE_CLASS__WERT = eINSTANCE.getGUE_Bauart_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.GUE_Energieversorgung_TypeClassImpl <em>GUE Energieversorgung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.GUE_Energieversorgung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Energieversorgung_TypeClass()
		 * @generated
		 */
		EClass GUE_ENERGIEVERSORGUNG_TYPE_CLASS = eINSTANCE.getGUE_Energieversorgung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUE_ENERGIEVERSORGUNG_TYPE_CLASS__WERT = eINSTANCE.getGUE_Energieversorgung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.GUE_Messstrecke_TypeClassImpl <em>GUE Messstrecke Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.GUE_Messstrecke_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Messstrecke_TypeClass()
		 * @generated
		 */
		EClass GUE_MESSSTRECKE_TYPE_CLASS = eINSTANCE.getGUE_Messstrecke_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUE_MESSSTRECKE_TYPE_CLASS__WERT = eINSTANCE.getGUE_Messstrecke_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.INA_Gefahrstelle_AttributeGroupImpl <em>INA Gefahrstelle Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.INA_Gefahrstelle_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getINA_Gefahrstelle_AttributeGroup()
		 * @generated
		 */
		EClass INA_GEFAHRSTELLE_ATTRIBUTE_GROUP = eINSTANCE.getINA_Gefahrstelle_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>ID Markanter Punkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT = eINSTANCE.getINA_Gefahrstelle_AttributeGroup_IDMarkanterPunkt();

		/**
		 * The meta object literal for the '<em><b>Prioritaet Gefahrstelle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE = eINSTANCE.getINA_Gefahrstelle_AttributeGroup_PrioritaetGefahrstelle();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.Messfehler_TypeClassImpl <em>Messfehler Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.Messfehler_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getMessfehler_TypeClass()
		 * @generated
		 */
		EClass MESSFEHLER_TYPE_CLASS = eINSTANCE.getMessfehler_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSFEHLER_TYPE_CLASS__WERT = eINSTANCE.getMessfehler_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.Prioritaet_Gefahrstelle_TypeClassImpl <em>Prioritaet Gefahrstelle Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.Prioritaet_Gefahrstelle_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPrioritaet_Gefahrstelle_TypeClass()
		 * @generated
		 */
		EClass PRIORITAET_GEFAHRSTELLE_TYPE_CLASS = eINSTANCE.getPrioritaet_Gefahrstelle_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITAET_GEFAHRSTELLE_TYPE_CLASS__WERT = eINSTANCE.getPrioritaet_Gefahrstelle_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.Pruefgeschwindigkeit_TypeClassImpl <em>Pruefgeschwindigkeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.Pruefgeschwindigkeit_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPruefgeschwindigkeit_TypeClass()
		 * @generated
		 */
		EClass PRUEFGESCHWINDIGKEIT_TYPE_CLASS = eINSTANCE.getPruefgeschwindigkeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRUEFGESCHWINDIGKEIT_TYPE_CLASS__WERT = eINSTANCE.getPruefgeschwindigkeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.Pruefzeit_TypeClassImpl <em>Pruefzeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.Pruefzeit_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPruefzeit_TypeClass()
		 * @generated
		 */
		EClass PRUEFZEIT_TYPE_CLASS = eINSTANCE.getPruefzeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRUEFZEIT_TYPE_CLASS__WERT = eINSTANCE.getPruefzeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Abstand_GM_TypeClassImpl <em>PZB Abstand GM Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Abstand_GM_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Abstand_GM_TypeClass()
		 * @generated
		 */
		EClass PZB_ABSTAND_GM_TYPE_CLASS = eINSTANCE.getPZB_Abstand_GM_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PZB_ABSTAND_GM_TYPE_CLASS__WERT = eINSTANCE.getPZB_Abstand_GM_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Art_TypeClassImpl <em>PZB Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Art_TypeClass()
		 * @generated
		 */
		EClass PZB_ART_TYPE_CLASS = eINSTANCE.getPZB_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PZB_ART_TYPE_CLASS__WERT = eINSTANCE.getPZB_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_ElementImpl <em>PZB Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_ElementImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element()
		 * @generated
		 */
		EClass PZB_ELEMENT = eINSTANCE.getPZB_Element();

		/**
		 * The meta object literal for the '<em><b>IDPZB Element Zuordnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG = eINSTANCE.getPZB_Element_IDPZBElementZuordnung();

		/**
		 * The meta object literal for the '<em><b>PZB Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT__PZB_ART = eINSTANCE.getPZB_Element_PZBArt();

		/**
		 * The meta object literal for the '<em><b>ID Stellelement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT__ID_STELLELEMENT = eINSTANCE.getPZB_Element_IDStellelement();

		/**
		 * The meta object literal for the '<em><b>ID Unterbringung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT__ID_UNTERBRINGUNG = eINSTANCE.getPZB_Element_IDUnterbringung();

		/**
		 * The meta object literal for the '<em><b>PZB Element GM</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT__PZB_ELEMENT_GM = eINSTANCE.getPZB_Element_PZBElementGM();

		/**
		 * The meta object literal for the '<em><b>PZB Element GUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT__PZB_ELEMENT_GUE = eINSTANCE.getPZB_Element_PZBElementGUE();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_GM_AttributeGroupImpl <em>PZB Element GM Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Element_GM_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element_GM_AttributeGroup()
		 * @generated
		 */
		EClass PZB_ELEMENT_GM_ATTRIBUTE_GROUP = eINSTANCE.getPZB_Element_GM_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>PZB Abstand GM</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZB_ABSTAND_GM = eINSTANCE.getPZB_Element_GM_AttributeGroup_PZBAbstandGM();

		/**
		 * The meta object literal for the '<em><b>PZBINA</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZBINA = eINSTANCE.getPZB_Element_GM_AttributeGroup_PZBINA();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_GUE_AttributeGroupImpl <em>PZB Element GUE Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Element_GUE_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element_GUE_AttributeGroup()
		 * @generated
		 */
		EClass PZB_ELEMENT_GUE_ATTRIBUTE_GROUP = eINSTANCE.getPZB_Element_GUE_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>GUE Abstand Abweichend</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ABSTAND_ABWEICHEND = eINSTANCE.getPZB_Element_GUE_AttributeGroup_GUEAbstandAbweichend();

		/**
		 * The meta object literal for the '<em><b>GUE Anordnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ANORDNUNG = eINSTANCE.getPZB_Element_GUE_AttributeGroup_GUEAnordnung();

		/**
		 * The meta object literal for the '<em><b>GUE Bauart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_BAUART = eINSTANCE.getPZB_Element_GUE_AttributeGroup_GUEBauart();

		/**
		 * The meta object literal for the '<em><b>GUE Energieversorgung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ENERGIEVERSORGUNG = eINSTANCE.getPZB_Element_GUE_AttributeGroup_GUEEnergieversorgung();

		/**
		 * The meta object literal for the '<em><b>GUE Messstrecke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_MESSSTRECKE = eINSTANCE.getPZB_Element_GUE_AttributeGroup_GUEMessstrecke();

		/**
		 * The meta object literal for the '<em><b>IDPZB Element Mitnutzung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__IDPZB_ELEMENT_MITNUTZUNG = eINSTANCE.getPZB_Element_GUE_AttributeGroup_IDPZBElementMitnutzung();

		/**
		 * The meta object literal for the '<em><b>Messfehler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__MESSFEHLER = eINSTANCE.getPZB_Element_GUE_AttributeGroup_Messfehler();

		/**
		 * The meta object literal for the '<em><b>Pruefgeschwindigkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFGESCHWINDIGKEIT = eINSTANCE.getPZB_Element_GUE_AttributeGroup_Pruefgeschwindigkeit();

		/**
		 * The meta object literal for the '<em><b>Pruefzeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFZEIT = eINSTANCE.getPZB_Element_GUE_AttributeGroup_Pruefzeit();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_ZuordnungImpl <em>PZB Element Zuordnung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Element_ZuordnungImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element_Zuordnung()
		 * @generated
		 */
		EClass PZB_ELEMENT_ZUORDNUNG = eINSTANCE.getPZB_Element_Zuordnung();

		/**
		 * The meta object literal for the '<em><b>PZB Element Zuordnung BP</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_BP = eINSTANCE.getPZB_Element_Zuordnung_PZBElementZuordnungBP();

		/**
		 * The meta object literal for the '<em><b>PZB Element Zuordnung Fstr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_FSTR = eINSTANCE.getPZB_Element_Zuordnung_PZBElementZuordnungFstr();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_BP_AttributeGroupImpl <em>PZB Element Zuordnung BP Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_BP_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element_Zuordnung_BP_AttributeGroup()
		 * @generated
		 */
		EClass PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP = eINSTANCE.getPZB_Element_Zuordnung_BP_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>IDPZB Element Bezugspunkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT = eINSTANCE.getPZB_Element_Zuordnung_BP_AttributeGroup_IDPZBElementBezugspunkt();

		/**
		 * The meta object literal for the '<em><b>INA Gefahrstelle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__INA_GEFAHRSTELLE = eINSTANCE.getPZB_Element_Zuordnung_BP_AttributeGroup_INAGefahrstelle();

		/**
		 * The meta object literal for the '<em><b>PZB Element Zuordnung INA</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA = eINSTANCE.getPZB_Element_Zuordnung_BP_AttributeGroup_PZBElementZuordnungINA();

		/**
		 * The meta object literal for the '<em><b>Wirksamkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT = eINSTANCE.getPZB_Element_Zuordnung_BP_AttributeGroup_Wirksamkeit();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_Fstr_AttributeGroupImpl <em>PZB Element Zuordnung Fstr Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_Fstr_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element_Zuordnung_Fstr_AttributeGroup()
		 * @generated
		 */
		EClass PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP = eINSTANCE.getPZB_Element_Zuordnung_Fstr_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER = eINSTANCE.getPZB_Element_Zuordnung_Fstr_AttributeGroup_IDFstrZugRangier();

		/**
		 * The meta object literal for the '<em><b>Wirksamkeit Fstr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR = eINSTANCE.getPZB_Element_Zuordnung_Fstr_AttributeGroup_WirksamkeitFstr();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl <em>PZB Element Zuordnung INA Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Element_Zuordnung_INA_AttributeGroup()
		 * @generated
		 */
		EClass PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP = eINSTANCE.getPZB_Element_Zuordnung_INA_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>ID Anhang INA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA = eINSTANCE.getPZB_Element_Zuordnung_INA_AttributeGroup_IDAnhangINA();

		/**
		 * The meta object literal for the '<em><b>ID Bahnsteig Kante</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE = eINSTANCE.getPZB_Element_Zuordnung_INA_AttributeGroup_IDBahnsteigKante();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_INA_TypeClassImpl <em>PZB INA Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_INA_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_INA_TypeClass()
		 * @generated
		 */
		EClass PZB_INA_TYPE_CLASS = eINSTANCE.getPZB_INA_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PZB_INA_TYPE_CLASS__WERT = eINSTANCE.getPZB_INA_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Zuordnung_SignalImpl <em>PZB Zuordnung Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZB_Zuordnung_SignalImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Zuordnung_Signal()
		 * @generated
		 */
		EClass PZB_ZUORDNUNG_SIGNAL = eINSTANCE.getPZB_Zuordnung_Signal();

		/**
		 * The meta object literal for the '<em><b>IDPZB Element Zuordnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG = eINSTANCE.getPZB_Zuordnung_Signal_IDPZBElementZuordnung();

		/**
		 * The meta object literal for the '<em><b>ID Signal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL = eINSTANCE.getPZB_Zuordnung_Signal_IDSignal();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.Wirksamkeit_Fstr_TypeClassImpl <em>Wirksamkeit Fstr Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.Wirksamkeit_Fstr_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getWirksamkeit_Fstr_TypeClass()
		 * @generated
		 */
		EClass WIRKSAMKEIT_FSTR_TYPE_CLASS = eINSTANCE.getWirksamkeit_Fstr_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRKSAMKEIT_FSTR_TYPE_CLASS__WERT = eINSTANCE.getWirksamkeit_Fstr_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.impl.Wirksamkeit_TypeClassImpl <em>Wirksamkeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.impl.Wirksamkeit_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getWirksamkeit_TypeClass()
		 * @generated
		 */
		EClass WIRKSAMKEIT_TYPE_CLASS = eINSTANCE.getWirksamkeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRKSAMKEIT_TYPE_CLASS__WERT = eINSTANCE.getWirksamkeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.ENUMGUEAnordnung <em>ENUMGUE Anordnung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEAnordnung
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMGUEAnordnung()
		 * @generated
		 */
		EEnum ENUMGUE_ANORDNUNG = eINSTANCE.getENUMGUEAnordnung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.ENUMGUEBauart <em>ENUMGUE Bauart</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEBauart
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMGUEBauart()
		 * @generated
		 */
		EEnum ENUMGUE_BAUART = eINSTANCE.getENUMGUEBauart();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.ENUMGUEEnergieversorgung <em>ENUMGUE Energieversorgung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEEnergieversorgung
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMGUEEnergieversorgung()
		 * @generated
		 */
		EEnum ENUMGUE_ENERGIEVERSORGUNG = eINSTANCE.getENUMGUEEnergieversorgung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.ENUMMessfehler <em>ENUM Messfehler</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMMessfehler
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMMessfehler()
		 * @generated
		 */
		EEnum ENUM_MESSFEHLER = eINSTANCE.getENUMMessfehler();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.ENUMPZBArt <em>ENUMPZB Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMPZBArt
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMPZBArt()
		 * @generated
		 */
		EEnum ENUMPZB_ART = eINSTANCE.getENUMPZBArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.ENUMWirksamkeit <em>ENUM Wirksamkeit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMWirksamkeit
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMWirksamkeit()
		 * @generated
		 */
		EEnum ENUM_WIRKSAMKEIT = eINSTANCE.getENUMWirksamkeit();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.PZB.ENUMWirksamkeitFstr <em>ENUM Wirksamkeit Fstr</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMWirksamkeitFstr
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMWirksamkeitFstr()
		 * @generated
		 */
		EEnum ENUM_WIRKSAMKEIT_FSTR = eINSTANCE.getENUMWirksamkeitFstr();

		/**
		 * The meta object literal for the '<em>ENUMGUE Anordnung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEAnordnung
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMGUEAnordnungObject()
		 * @generated
		 */
		EDataType ENUMGUE_ANORDNUNG_OBJECT = eINSTANCE.getENUMGUEAnordnungObject();

		/**
		 * The meta object literal for the '<em>ENUMGUE Bauart Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEBauart
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMGUEBauartObject()
		 * @generated
		 */
		EDataType ENUMGUE_BAUART_OBJECT = eINSTANCE.getENUMGUEBauartObject();

		/**
		 * The meta object literal for the '<em>ENUMGUE Energieversorgung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMGUEEnergieversorgung
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMGUEEnergieversorgungObject()
		 * @generated
		 */
		EDataType ENUMGUE_ENERGIEVERSORGUNG_OBJECT = eINSTANCE.getENUMGUEEnergieversorgungObject();

		/**
		 * The meta object literal for the '<em>ENUM Messfehler Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMMessfehler
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMMessfehlerObject()
		 * @generated
		 */
		EDataType ENUM_MESSFEHLER_OBJECT = eINSTANCE.getENUMMessfehlerObject();

		/**
		 * The meta object literal for the '<em>ENUMPZB Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMPZBArt
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMPZBArtObject()
		 * @generated
		 */
		EDataType ENUMPZB_ART_OBJECT = eINSTANCE.getENUMPZBArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Wirksamkeit Fstr Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMWirksamkeitFstr
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMWirksamkeitFstrObject()
		 * @generated
		 */
		EDataType ENUM_WIRKSAMKEIT_FSTR_OBJECT = eINSTANCE.getENUMWirksamkeitFstrObject();

		/**
		 * The meta object literal for the '<em>ENUM Wirksamkeit Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.PZB.ENUMWirksamkeit
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getENUMWirksamkeitObject()
		 * @generated
		 */
		EDataType ENUM_WIRKSAMKEIT_OBJECT = eINSTANCE.getENUMWirksamkeitObject();

		/**
		 * The meta object literal for the '<em>GUE Abstand Abweichend Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Abstand_Abweichend_Type()
		 * @generated
		 */
		EDataType GUE_ABSTAND_ABWEICHEND_TYPE = eINSTANCE.getGUE_Abstand_Abweichend_Type();

		/**
		 * The meta object literal for the '<em>GUE Messstrecke Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getGUE_Messstrecke_Type()
		 * @generated
		 */
		EDataType GUE_MESSSTRECKE_TYPE = eINSTANCE.getGUE_Messstrecke_Type();

		/**
		 * The meta object literal for the '<em>Prioritaet Gefahrstelle Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPrioritaet_Gefahrstelle_Type()
		 * @generated
		 */
		EDataType PRIORITAET_GEFAHRSTELLE_TYPE = eINSTANCE.getPrioritaet_Gefahrstelle_Type();

		/**
		 * The meta object literal for the '<em>Pruefgeschwindigkeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPruefgeschwindigkeit_Type()
		 * @generated
		 */
		EDataType PRUEFGESCHWINDIGKEIT_TYPE = eINSTANCE.getPruefgeschwindigkeit_Type();

		/**
		 * The meta object literal for the '<em>Pruefzeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPruefzeit_Type()
		 * @generated
		 */
		EDataType PRUEFZEIT_TYPE = eINSTANCE.getPruefzeit_Type();

		/**
		 * The meta object literal for the '<em>PZB Abstand GM Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl#getPZB_Abstand_GM_Type()
		 * @generated
		 */
		EDataType PZB_ABSTAND_GM_TYPE = eINSTANCE.getPZB_Abstand_GM_Type();

	}

} //PZBPackage
