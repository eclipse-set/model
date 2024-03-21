/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse;

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
 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrasseFactory
 * @model kind="package"
 * @generated
 */
public interface FahrstrassePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Fahrstrasse";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Fahrstrasse/1.10.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsFahrstrasse";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FahrstrassePackage eINSTANCE = org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Aufloesung_Ssp_Zielgleis_TypeClassImpl <em>Aufloesung Ssp Zielgleis Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Aufloesung_Ssp_Zielgleis_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getAufloesung_Ssp_Zielgleis_TypeClass()
	 * @generated
	 */
	int AUFLOESUNG_SSP_ZIELGLEIS_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFLOESUNG_SSP_ZIELGLEIS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFLOESUNG_SSP_ZIELGLEIS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aufloesung Ssp Zielgleis Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFLOESUNG_SSP_ZIELGLEIS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Aufloesung_Verzoegerung_TypeClassImpl <em>Aufloesung Verzoegerung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Aufloesung_Verzoegerung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getAufloesung_Verzoegerung_TypeClass()
	 * @generated
	 */
	int AUFLOESUNG_VERZOEGERUNG_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFLOESUNG_VERZOEGERUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFLOESUNG_VERZOEGERUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aufloesung Verzoegerung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFLOESUNG_VERZOEGERUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Automatische_Einstellung_TypeClassImpl <em>Automatische Einstellung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Automatische_Einstellung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getAutomatische_Einstellung_TypeClass()
	 * @generated
	 */
	int AUTOMATISCHE_EINSTELLUNG_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATISCHE_EINSTELLUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATISCHE_EINSTELLUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Automatische Einstellung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATISCHE_EINSTELLUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Bezeichnung_Fstr_DWeg_TypeClassImpl <em>Bezeichnung Fstr DWeg Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Bezeichnung_Fstr_DWeg_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getBezeichnung_Fstr_DWeg_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_FSTR_DWEG_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_FSTR_DWEG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_FSTR_DWEG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Fstr DWeg Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_FSTR_DWEG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Bezeichnung_Markanter_Punkt_TypeClassImpl <em>Bezeichnung Markanter Punkt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Bezeichnung_Markanter_Punkt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getBezeichnung_Markanter_Punkt_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_MARKANTER_PUNKT_TYPE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_MARKANTER_PUNKT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_MARKANTER_PUNKT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Markanter Punkt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_MARKANTER_PUNKT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_Reihenfolge_TypeClassImpl <em>DWeg Reihenfolge Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_Reihenfolge_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getDWeg_Reihenfolge_TypeClass()
	 * @generated
	 */
	int DWEG_REIHENFOLGE_TYPE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_REIHENFOLGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_REIHENFOLGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DWeg Reihenfolge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_REIHENFOLGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_V_Aufwertung_Verzicht_TypeClassImpl <em>DWeg VAufwertung Verzicht Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_V_Aufwertung_Verzicht_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getDWeg_V_Aufwertung_Verzicht_TypeClass()
	 * @generated
	 */
	int DWEG_VAUFWERTUNG_VERZICHT_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_VAUFWERTUNG_VERZICHT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_VAUFWERTUNG_VERZICHT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DWeg VAufwertung Verzicht Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_VAUFWERTUNG_VERZICHT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_V_TypeClassImpl <em>DWeg VType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_V_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getDWeg_V_TypeClass()
	 * @generated
	 */
	int DWEG_VTYPE_CLASS = 7;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_VTYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_VTYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DWeg VType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_VTYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_Vorzug_TypeClassImpl <em>DWeg Vorzug Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_Vorzug_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getDWeg_Vorzug_TypeClass()
	 * @generated
	 */
	int DWEG_VORZUG_TYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_VORZUG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_VORZUG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DWeg Vorzug Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_VORZUG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Element_Verschluss_TypeClassImpl <em>Element Verschluss Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Element_Verschluss_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getElement_Verschluss_TypeClass()
	 * @generated
	 */
	int ELEMENT_VERSCHLUSS_TYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VERSCHLUSS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VERSCHLUSS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Verschluss Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VERSCHLUSS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.F_Bedienung_TypeClassImpl <em>FBedienung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.F_Bedienung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getF_Bedienung_TypeClass()
	 * @generated
	 */
	int FBEDIENUNG_TYPE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBEDIENUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBEDIENUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FBedienung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBEDIENUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_AbhaengigkeitImpl <em>Fstr Abhaengigkeit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_AbhaengigkeitImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Abhaengigkeit()
	 * @generated
	 */
	int FSTR_ABHAENGIGKEIT = 11;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ABHAENGIGKEIT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ABHAENGIGKEIT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ABHAENGIGKEIT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ABHAENGIGKEIT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ABHAENGIGKEIT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Fstr Fahrweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fstr Abhaengigkeit Ssp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Bedien Anzeige Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fstr Abhaengigkeit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ABHAENGIGKEIT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl <em>Fstr Abhaengigkeit Ssp Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Abhaengigkeit_Ssp_AttributeGroup()
	 * @generated
	 */
	int FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Aufloesung Ssp Zielgleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS = 0;

	/**
	 * The feature id for the '<em><b>ID Schluesselsperre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE = 1;

	/**
	 * The number of structural features of the '<em>Fstr Abhaengigkeit Ssp Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_AneinanderImpl <em>Fstr Aneinander</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_AneinanderImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Aneinander()
	 * @generated
	 */
	int FSTR_ANEINANDER = 13;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Fstr Aneinander Bedienstring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER__FSTR_ANEINANDER_BEDIENSTRING = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fstr Aneinander</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Aneinander_Bedienstring_TypeClassImpl <em>Fstr Aneinander Bedienstring Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Aneinander_Bedienstring_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Aneinander_Bedienstring_TypeClass()
	 * @generated
	 */
	int FSTR_ANEINANDER_BEDIENSTRING_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER_BEDIENSTRING_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER_BEDIENSTRING_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fstr Aneinander Bedienstring Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER_BEDIENSTRING_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Aneinander_ZuordnungImpl <em>Fstr Aneinander Zuordnung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Aneinander_ZuordnungImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Aneinander_Zuordnung()
	 * @generated
	 */
	int FSTR_ANEINANDER_ZUORDNUNG = 15;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER_ZUORDNUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER_ZUORDNUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER_ZUORDNUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER_ZUORDNUNG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER_ZUORDNUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Fstr Aneinander</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fstr Aneinander Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ANEINANDER_ZUORDNUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Bedienstring_TypeClassImpl <em>Fstr Bedienstring Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Bedienstring_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Bedienstring_TypeClass()
	 * @generated
	 */
	int FSTR_BEDIENSTRING_TYPE_CLASS = 16;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_BEDIENSTRING_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_BEDIENSTRING_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fstr Bedienstring Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_BEDIENSTRING_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWegImpl <em>Fstr DWeg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWegImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_DWeg()
	 * @generated
	 */
	int FSTR_DWEG = 17;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fstr DWeg Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG__FSTR_DWEG_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fstr DWeg Spezifisch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG__FSTR_DWEG_SPEZIFISCH = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>IDFMA Anlage Freimeldung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ID Fstr Fahrweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG__ID_FSTR_FAHRWEG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>IDPZB Gefahrpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG__IDPZB_GEFAHRPUNKT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Fstr DWeg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Allg_AttributeGroupImpl <em>Fstr DWeg Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_DWeg_Allg_AttributeGroup()
	 * @generated
	 */
	int FSTR_DWEG_ALLG_ATTRIBUTE_GROUP = 18;

	/**
	 * The feature id for the '<em><b>Laenge Soll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL = 0;

	/**
	 * The feature id for the '<em><b>Massgebende Neigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG = 1;

	/**
	 * The number of structural features of the '<em>Fstr DWeg Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Bezeichnung_AttributeGroupImpl <em>Fstr DWeg Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_DWeg_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP = 19;

	/**
	 * The feature id for the '<em><b>Bezeichnung Fstr DWeg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_FSTR_DWEG = 0;

	/**
	 * The number of structural features of the '<em>Fstr DWeg Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Spezifisch_AttributeGroupImpl <em>Fstr DWeg Spezifisch Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Spezifisch_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_DWeg_Spezifisch_AttributeGroup()
	 * @generated
	 */
	int FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP = 20;

	/**
	 * The feature id for the '<em><b>Aufloesung Verzoegerung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__AUFLOESUNG_VERZOEGERUNG = 0;

	/**
	 * The feature id for the '<em><b>DWeg Reihenfolge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_REIHENFOLGE = 1;

	/**
	 * The feature id for the '<em><b>DWeg V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_V = 2;

	/**
	 * The feature id for the '<em><b>DWeg VAufwertung Verzicht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_VAUFWERTUNG_VERZICHT = 3;

	/**
	 * The feature id for the '<em><b>IDFMA Anlage Zielgleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__IDFMA_ANLAGE_ZIELGLEIS = 4;

	/**
	 * The number of structural features of the '<em>Fstr DWeg Spezifisch Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_W_KrImpl <em>Fstr DWeg WKr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_W_KrImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_DWeg_W_Kr()
	 * @generated
	 */
	int FSTR_DWEG_WKR = 21;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_WKR__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_WKR__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_WKR__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_WKR__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_WKR__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Element Verschluss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Fstr DWeg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_WKR__ID_FSTR_DWEG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDW Kr Gsp Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fstr DWeg WKr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_DWEG_WKR_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_FahrwegImpl <em>Fstr Fahrweg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_FahrwegImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Fahrweg()
	 * @generated
	 */
	int FSTR_FAHRWEG = 22;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_FAHRWEG__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_FAHRWEG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_FAHRWEG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_FAHRWEG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BEREICH_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_FAHRWEG__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_FAHRWEG__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>Fstr VHg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_FAHRWEG__FSTR_VHG = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_FAHRWEG__ID_START = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Ziel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_FAHRWEG__ID_ZIEL = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Signal Charakter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_FAHRWEG__START_SIGNAL_CHARAKTER = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fstr Fahrweg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_FAHRWEG_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Mittel_Art_TypeClassImpl <em>Fstr Mittel Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Mittel_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Mittel_Art_TypeClass()
	 * @generated
	 */
	int FSTR_MITTEL_ART_TYPE_CLASS = 23;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_MITTEL_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_MITTEL_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fstr Mittel Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_MITTEL_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Mittel_AttributeGroupImpl <em>Fstr Mittel Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Mittel_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Mittel_AttributeGroup()
	 * @generated
	 */
	int FSTR_MITTEL_ATTRIBUTE_GROUP = 24;

	/**
	 * The feature id for the '<em><b>Fstr Mittel Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_ART = 0;

	/**
	 * The feature id for the '<em><b>Fstr Mittel VAufwertung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_VAUFWERTUNG = 1;

	/**
	 * The number of structural features of the '<em>Fstr Mittel Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_MITTEL_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Mittel_V_Aufwertung_TypeClassImpl <em>Fstr Mittel VAufwertung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Mittel_V_Aufwertung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Mittel_V_Aufwertung_TypeClass()
	 * @generated
	 */
	int FSTR_MITTEL_VAUFWERTUNG_TYPE_CLASS = 25;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_MITTEL_VAUFWERTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_MITTEL_VAUFWERTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fstr Mittel VAufwertung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_MITTEL_VAUFWERTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_NichthaltfallImpl <em>Fstr Nichthaltfall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_NichthaltfallImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Nichthaltfall()
	 * @generated
	 */
	int FSTR_NICHTHALTFALL = 26;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_NICHTHALTFALL__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_NICHTHALTFALL__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_NICHTHALTFALL__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_NICHTHALTFALL__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_NICHTHALTFALL__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDFMA Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_NICHTHALTFALL__IDFMA_ANLAGE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Fstr Fahrweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fstr Nichthaltfall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_NICHTHALTFALL_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_Art_TypeClassImpl <em>Fstr Rangier Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Rangier_Art_TypeClass()
	 * @generated
	 */
	int FSTR_RANGIER_ART_TYPE_CLASS = 27;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fstr Rangier Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_AttributeGroupImpl <em>Fstr Rangier Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Rangier_AttributeGroup()
	 * @generated
	 */
	int FSTR_RANGIER_ATTRIBUTE_GROUP = 28;

	/**
	 * The feature id for the '<em><b>Automatische Einstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG = 0;

	/**
	 * The feature id for the '<em><b>Fstr Rangier Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_ATTRIBUTE_GROUP__FSTR_RANGIER_ART = 1;

	/**
	 * The feature id for the '<em><b>IDFMA Anlage Rangier Frei</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_ATTRIBUTE_GROUP__IDFMA_ANLAGE_RANGIER_FREI = 2;

	/**
	 * The feature id for the '<em><b>Rangier Gegenfahrtausschluss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_ATTRIBUTE_GROUP__RANGIER_GEGENFAHRTAUSSCHLUSS = 3;

	/**
	 * The number of structural features of the '<em>Fstr Rangier Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_Fla_ZuordnungImpl <em>Fstr Rangier Fla Zuordnung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_Fla_ZuordnungImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Rangier_Fla_Zuordnung()
	 * @generated
	 */
	int FSTR_RANGIER_FLA_ZUORDNUNG = 29;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_FLA_ZUORDNUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_FLA_ZUORDNUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_FLA_ZUORDNUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_FLA_ZUORDNUNG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_FLA_ZUORDNUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Fla Schutz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Fstr Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fstr Rangier Fla Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_RANGIER_FLA_ZUORDNUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Reihenfolge_TypeClassImpl <em>Fstr Reihenfolge Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Reihenfolge_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Reihenfolge_TypeClass()
	 * @generated
	 */
	int FSTR_REIHENFOLGE_TYPE_CLASS = 30;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_REIHENFOLGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_REIHENFOLGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fstr Reihenfolge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_REIHENFOLGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_SignalisierungImpl <em>Fstr Signalisierung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_SignalisierungImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Signalisierung()
	 * @generated
	 */
	int FSTR_SIGNALISIERUNG = 31;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_SIGNALISIERUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_SIGNALISIERUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_SIGNALISIERUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_SIGNALISIERUNG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_SIGNALISIERUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Signal Signalbegriff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Signal Signalbegriff Ziel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fstr Signalisierung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_SIGNALISIERUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_UmfahrpunktImpl <em>Fstr Umfahrpunkt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_UmfahrpunktImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Umfahrpunkt()
	 * @generated
	 */
	int FSTR_UMFAHRPUNKT = 32;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_UMFAHRPUNKT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_UMFAHRPUNKT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_UMFAHRPUNKT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_UMFAHRPUNKT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_UMFAHRPUNKT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Fstr Fahrweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Umfahrpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fstr Umfahrpunkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_UMFAHRPUNKT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_V_Hg_TypeClassImpl <em>Fstr VHg Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_V_Hg_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_V_Hg_TypeClass()
	 * @generated
	 */
	int FSTR_VHG_TYPE_CLASS = 33;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_VHG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_VHG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fstr VHg Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_VHG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_V_TypeClassImpl <em>Fstr VType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_V_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_V_TypeClass()
	 * @generated
	 */
	int FSTR_VTYPE_CLASS = 34;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_VTYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_VTYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fstr VType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_VTYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Vsigabstand_Verkuerzt_TypeClassImpl <em>Fstr Vsigabstand Verkuerzt Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Vsigabstand_Verkuerzt_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Vsigabstand_Verkuerzt_TypeClass()
	 * @generated
	 */
	int FSTR_VSIGABSTAND_VERKUERZT_TYPE_CLASS = 35;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_VSIGABSTAND_VERKUERZT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_VSIGABSTAND_VERKUERZT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fstr Vsigabstand Verkuerzt Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_VSIGABSTAND_VERKUERZT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_Art_TypeClassImpl <em>Fstr Zug Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Zug_Art_TypeClass()
	 * @generated
	 */
	int FSTR_ZUG_ART_TYPE_CLASS = 36;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fstr Zug Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl <em>Fstr Zug Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Zug_AttributeGroup()
	 * @generated
	 */
	int FSTR_ZUG_ATTRIBUTE_GROUP = 37;

	/**
	 * The feature id for the '<em><b>Automatische Einstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG = 0;

	/**
	 * The feature id for the '<em><b>Fstr Vsigabstand Verkuerzt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT = 1;

	/**
	 * The feature id for the '<em><b>Fstr Zug Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART = 2;

	/**
	 * The feature id for the '<em><b>Fstr Zug DWeg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG = 3;

	/**
	 * The feature id for the '<em><b>IDBUE Einschaltung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG = 4;

	/**
	 * The feature id for the '<em><b>ID Signal Gruppenausfahrt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT = 5;

	/**
	 * The number of structural features of the '<em>Fstr Zug Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_ATTRIBUTE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_DWeg_AttributeGroupImpl <em>Fstr Zug DWeg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_DWeg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Zug_DWeg_AttributeGroup()
	 * @generated
	 */
	int FSTR_ZUG_DWEG_ATTRIBUTE_GROUP = 38;

	/**
	 * The feature id for the '<em><b>DWeg Vorzug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__DWEG_VORZUG = 0;

	/**
	 * The feature id for the '<em><b>ID Fstr DWeg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__ID_FSTR_DWEG = 1;

	/**
	 * The number of structural features of the '<em>Fstr Zug DWeg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_DWEG_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_RangierImpl <em>Fstr Zug Rangier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_RangierImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Zug_Rangier()
	 * @generated
	 */
	int FSTR_ZUG_RANGIER = 39;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Fstr Zug Rangier Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER__FSTR_ZUG_RANGIER_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Fstr Ausschluss Besonders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER__ID_FSTR_AUSSCHLUSS_BESONDERS = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Fstr Fahrweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER__ID_FSTR_FAHRWEG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fstr Mittel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER__FSTR_MITTEL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fstr Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER__FSTR_RANGIER = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fstr Zug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER__FSTR_ZUG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Fstr Zug Rangier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_Rangier_Allg_AttributeGroupImpl <em>Fstr Zug Rangier Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_Rangier_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Zug_Rangier_Allg_AttributeGroup()
	 * @generated
	 */
	int FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP = 40;

	/**
	 * The feature id for the '<em><b>FBedienung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FBEDIENUNG = 0;

	/**
	 * The feature id for the '<em><b>Fstr Bedienstring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_BEDIENSTRING = 1;

	/**
	 * The feature id for the '<em><b>Fstr Reihenfolge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_REIHENFOLGE = 2;

	/**
	 * The feature id for the '<em><b>Fstr V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_V = 3;

	/**
	 * The number of structural features of the '<em>Fstr Zug Rangier Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Laenge_Soll_TypeClassImpl <em>Laenge Soll Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Laenge_Soll_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getLaenge_Soll_TypeClass()
	 * @generated
	 */
	int LAENGE_SOLL_TYPE_CLASS = 41;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAENGE_SOLL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAENGE_SOLL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Laenge Soll Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAENGE_SOLL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Markanter_PunktImpl <em>Markanter Punkt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Markanter_PunktImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getMarkanter_Punkt()
	 * @generated
	 */
	int MARKANTER_PUNKT = 42;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKANTER_PUNKT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKANTER_PUNKT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKANTER_PUNKT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKANTER_PUNKT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKANTER_PUNKT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKANTER_PUNKT__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDD Weg Erlaubnisabhaengig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Markante Stelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKANTER_PUNKT__ID_MARKANTE_STELLE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Markanter Punkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKANTER_PUNKT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Markanter_Punkt_Bezeichnung_AttributeGroupImpl <em>Markanter Punkt Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Markanter_Punkt_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getMarkanter_Punkt_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP = 43;

	/**
	 * The feature id for the '<em><b>Bezeichnung Markanter Punkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_MARKANTER_PUNKT = 0;

	/**
	 * The number of structural features of the '<em>Markanter Punkt Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Massgebende_Neigung_TypeClassImpl <em>Massgebende Neigung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Massgebende_Neigung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getMassgebende_Neigung_TypeClass()
	 * @generated
	 */
	int MASSGEBENDE_NEIGUNG_TYPE_CLASS = 44;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSGEBENDE_NEIGUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSGEBENDE_NEIGUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Massgebende Neigung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSGEBENDE_NEIGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Rangier_Gegenfahrtausschluss_TypeClassImpl <em>Rangier Gegenfahrtausschluss Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Rangier_Gegenfahrtausschluss_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getRangier_Gegenfahrtausschluss_TypeClass()
	 * @generated
	 */
	int RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS = 45;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rangier Gegenfahrtausschluss Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Sonstiger_PunktImpl <em>Sonstiger Punkt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Sonstiger_PunktImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getSonstiger_Punkt()
	 * @generated
	 */
	int SONSTIGER_PUNKT = 46;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGER_PUNKT__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGER_PUNKT__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGER_PUNKT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGER_PUNKT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.PUNKT_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGER_PUNKT__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGER_PUNKT__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGER_PUNKT__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>ID Beginn Bereich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGER_PUNKT__ID_BEGINN_BEREICH = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sonstiger Punkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGER_PUNKT_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Start_Signal_Charakter_TypeClassImpl <em>Start Signal Charakter Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Start_Signal_Charakter_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getStart_Signal_Charakter_TypeClass()
	 * @generated
	 */
	int START_SIGNAL_CHARAKTER_TYPE_CLASS = 47;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SIGNAL_CHARAKTER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SIGNAL_CHARAKTER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Signal Charakter Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SIGNAL_CHARAKTER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMAufloesungSspZielgleis <em>ENUM Aufloesung Ssp Zielgleis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMAufloesungSspZielgleis
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMAufloesungSspZielgleis()
	 * @generated
	 */
	int ENUM_AUFLOESUNG_SSP_ZIELGLEIS = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMAutomatischeEinstellung <em>ENUM Automatische Einstellung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMAutomatischeEinstellung
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMAutomatischeEinstellung()
	 * @generated
	 */
	int ENUM_AUTOMATISCHE_EINSTELLUNG = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrMittelArt <em>ENUM Fstr Mittel Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrMittelArt
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMFstrMittelArt()
	 * @generated
	 */
	int ENUM_FSTR_MITTEL_ART = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrRangierArt <em>ENUM Fstr Rangier Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrRangierArt
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMFstrRangierArt()
	 * @generated
	 */
	int ENUM_FSTR_RANGIER_ART = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrZugArt <em>ENUM Fstr Zug Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrZugArt
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMFstrZugArt()
	 * @generated
	 */
	int ENUM_FSTR_ZUG_ART = 52;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMRangierGegenfahrtausschluss <em>ENUM Rangier Gegenfahrtausschluss</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMRangierGegenfahrtausschluss
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMRangierGegenfahrtausschluss()
	 * @generated
	 */
	int ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS = 53;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMStartSignalCharakter <em>ENUM Start Signal Charakter</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMStartSignalCharakter
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMStartSignalCharakter()
	 * @generated
	 */
	int ENUM_START_SIGNAL_CHARAKTER = 54;

	/**
	 * The meta object id for the '<em>Aufloesung Verzoegerung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getAufloesung_Verzoegerung_Type()
	 * @generated
	 */
	int AUFLOESUNG_VERZOEGERUNG_TYPE = 55;

	/**
	 * The meta object id for the '<em>Bezeichnung Fstr DWeg Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getBezeichnung_Fstr_DWeg_Type()
	 * @generated
	 */
	int BEZEICHNUNG_FSTR_DWEG_TYPE = 56;

	/**
	 * The meta object id for the '<em>Bezeichnung Markanter Punkt Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getBezeichnung_Markanter_Punkt_Type()
	 * @generated
	 */
	int BEZEICHNUNG_MARKANTER_PUNKT_TYPE = 57;

	/**
	 * The meta object id for the '<em>DWeg Reihenfolge Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getDWeg_Reihenfolge_Type()
	 * @generated
	 */
	int DWEG_REIHENFOLGE_TYPE = 58;

	/**
	 * The meta object id for the '<em>DWeg VType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getDWeg_V_Type()
	 * @generated
	 */
	int DWEG_VTYPE = 59;

	/**
	 * The meta object id for the '<em>ENUM Aufloesung Ssp Zielgleis Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMAufloesungSspZielgleis
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMAufloesungSspZielgleisObject()
	 * @generated
	 */
	int ENUM_AUFLOESUNG_SSP_ZIELGLEIS_OBJECT = 60;

	/**
	 * The meta object id for the '<em>ENUM Automatische Einstellung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMAutomatischeEinstellung
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMAutomatischeEinstellungObject()
	 * @generated
	 */
	int ENUM_AUTOMATISCHE_EINSTELLUNG_OBJECT = 61;

	/**
	 * The meta object id for the '<em>ENUM Fstr Mittel Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrMittelArt
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMFstrMittelArtObject()
	 * @generated
	 */
	int ENUM_FSTR_MITTEL_ART_OBJECT = 62;

	/**
	 * The meta object id for the '<em>ENUM Fstr Rangier Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrRangierArt
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMFstrRangierArtObject()
	 * @generated
	 */
	int ENUM_FSTR_RANGIER_ART_OBJECT = 63;

	/**
	 * The meta object id for the '<em>ENUM Fstr Zug Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrZugArt
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMFstrZugArtObject()
	 * @generated
	 */
	int ENUM_FSTR_ZUG_ART_OBJECT = 64;

	/**
	 * The meta object id for the '<em>ENUM Rangier Gegenfahrtausschluss Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMRangierGegenfahrtausschluss
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMRangierGegenfahrtausschlussObject()
	 * @generated
	 */
	int ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_OBJECT = 65;

	/**
	 * The meta object id for the '<em>ENUM Start Signal Charakter Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMStartSignalCharakter
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMStartSignalCharakterObject()
	 * @generated
	 */
	int ENUM_START_SIGNAL_CHARAKTER_OBJECT = 66;

	/**
	 * The meta object id for the '<em>Fstr Aneinander Bedienstring Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Aneinander_Bedienstring_Type()
	 * @generated
	 */
	int FSTR_ANEINANDER_BEDIENSTRING_TYPE = 67;

	/**
	 * The meta object id for the '<em>Fstr Bedienstring Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Bedienstring_Type()
	 * @generated
	 */
	int FSTR_BEDIENSTRING_TYPE = 68;

	/**
	 * The meta object id for the '<em>Fstr Reihenfolge Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Reihenfolge_Type()
	 * @generated
	 */
	int FSTR_REIHENFOLGE_TYPE = 69;

	/**
	 * The meta object id for the '<em>Fstr VHg Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_V_Hg_Type()
	 * @generated
	 */
	int FSTR_VHG_TYPE = 70;

	/**
	 * The meta object id for the '<em>Fstr VType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_V_Type()
	 * @generated
	 */
	int FSTR_VTYPE = 71;

	/**
	 * The meta object id for the '<em>Laenge Soll Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getLaenge_Soll_Type()
	 * @generated
	 */
	int LAENGE_SOLL_TYPE = 72;

	/**
	 * The meta object id for the '<em>Massgebende Neigung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getMassgebende_Neigung_Type()
	 * @generated
	 */
	int MASSGEBENDE_NEIGUNG_TYPE = 73;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Aufloesung_Ssp_Zielgleis_TypeClass <em>Aufloesung Ssp Zielgleis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aufloesung Ssp Zielgleis Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Aufloesung_Ssp_Zielgleis_TypeClass
	 * @generated
	 */
	EClass getAufloesung_Ssp_Zielgleis_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Aufloesung_Ssp_Zielgleis_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Aufloesung_Ssp_Zielgleis_TypeClass#getWert()
	 * @see #getAufloesung_Ssp_Zielgleis_TypeClass()
	 * @generated
	 */
	EAttribute getAufloesung_Ssp_Zielgleis_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Aufloesung_Verzoegerung_TypeClass <em>Aufloesung Verzoegerung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aufloesung Verzoegerung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Aufloesung_Verzoegerung_TypeClass
	 * @generated
	 */
	EClass getAufloesung_Verzoegerung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Aufloesung_Verzoegerung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Aufloesung_Verzoegerung_TypeClass#getWert()
	 * @see #getAufloesung_Verzoegerung_TypeClass()
	 * @generated
	 */
	EAttribute getAufloesung_Verzoegerung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Automatische_Einstellung_TypeClass <em>Automatische Einstellung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automatische Einstellung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Automatische_Einstellung_TypeClass
	 * @generated
	 */
	EClass getAutomatische_Einstellung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Automatische_Einstellung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Automatische_Einstellung_TypeClass#getWert()
	 * @see #getAutomatische_Einstellung_TypeClass()
	 * @generated
	 */
	EAttribute getAutomatische_Einstellung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Bezeichnung_Fstr_DWeg_TypeClass <em>Bezeichnung Fstr DWeg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Fstr DWeg Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Bezeichnung_Fstr_DWeg_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Fstr_DWeg_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Bezeichnung_Fstr_DWeg_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Bezeichnung_Fstr_DWeg_TypeClass#getWert()
	 * @see #getBezeichnung_Fstr_DWeg_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Fstr_DWeg_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Bezeichnung_Markanter_Punkt_TypeClass <em>Bezeichnung Markanter Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Markanter Punkt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Bezeichnung_Markanter_Punkt_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Markanter_Punkt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Bezeichnung_Markanter_Punkt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Bezeichnung_Markanter_Punkt_TypeClass#getWert()
	 * @see #getBezeichnung_Markanter_Punkt_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Markanter_Punkt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.DWeg_Reihenfolge_TypeClass <em>DWeg Reihenfolge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DWeg Reihenfolge Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.DWeg_Reihenfolge_TypeClass
	 * @generated
	 */
	EClass getDWeg_Reihenfolge_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.DWeg_Reihenfolge_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.DWeg_Reihenfolge_TypeClass#getWert()
	 * @see #getDWeg_Reihenfolge_TypeClass()
	 * @generated
	 */
	EAttribute getDWeg_Reihenfolge_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.DWeg_V_Aufwertung_Verzicht_TypeClass <em>DWeg VAufwertung Verzicht Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DWeg VAufwertung Verzicht Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.DWeg_V_Aufwertung_Verzicht_TypeClass
	 * @generated
	 */
	EClass getDWeg_V_Aufwertung_Verzicht_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.DWeg_V_Aufwertung_Verzicht_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.DWeg_V_Aufwertung_Verzicht_TypeClass#getWert()
	 * @see #getDWeg_V_Aufwertung_Verzicht_TypeClass()
	 * @generated
	 */
	EAttribute getDWeg_V_Aufwertung_Verzicht_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.DWeg_V_TypeClass <em>DWeg VType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DWeg VType Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.DWeg_V_TypeClass
	 * @generated
	 */
	EClass getDWeg_V_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.DWeg_V_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.DWeg_V_TypeClass#getWert()
	 * @see #getDWeg_V_TypeClass()
	 * @generated
	 */
	EAttribute getDWeg_V_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.DWeg_Vorzug_TypeClass <em>DWeg Vorzug Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DWeg Vorzug Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.DWeg_Vorzug_TypeClass
	 * @generated
	 */
	EClass getDWeg_Vorzug_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.DWeg_Vorzug_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.DWeg_Vorzug_TypeClass#getWert()
	 * @see #getDWeg_Vorzug_TypeClass()
	 * @generated
	 */
	EAttribute getDWeg_Vorzug_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Element_Verschluss_TypeClass <em>Element Verschluss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Verschluss Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Element_Verschluss_TypeClass
	 * @generated
	 */
	EClass getElement_Verschluss_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Element_Verschluss_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Element_Verschluss_TypeClass#getWert()
	 * @see #getElement_Verschluss_TypeClass()
	 * @generated
	 */
	EAttribute getElement_Verschluss_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.F_Bedienung_TypeClass <em>FBedienung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FBedienung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.F_Bedienung_TypeClass
	 * @generated
	 */
	EClass getF_Bedienung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.F_Bedienung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.F_Bedienung_TypeClass#getWert()
	 * @see #getF_Bedienung_TypeClass()
	 * @generated
	 */
	EAttribute getF_Bedienung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit <em>Fstr Abhaengigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Abhaengigkeit</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit
	 * @generated
	 */
	EClass getFstr_Abhaengigkeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr Fahrweg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit#getIDFstrFahrweg()
	 * @see #getFstr_Abhaengigkeit()
	 * @generated
	 */
	EReference getFstr_Abhaengigkeit_IDFstrFahrweg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit#getFstrAbhaengigkeitSsp <em>Fstr Abhaengigkeit Ssp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Abhaengigkeit Ssp</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit#getFstrAbhaengigkeitSsp()
	 * @see #getFstr_Abhaengigkeit()
	 * @generated
	 */
	EReference getFstr_Abhaengigkeit_FstrAbhaengigkeitSsp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bedien Anzeige Element</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit#getIDBedienAnzeigeElement()
	 * @see #getFstr_Abhaengigkeit()
	 * @generated
	 */
	EReference getFstr_Abhaengigkeit_IDBedienAnzeigeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup <em>Fstr Abhaengigkeit Ssp Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Abhaengigkeit Ssp Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup
	 * @generated
	 */
	EClass getFstr_Abhaengigkeit_Ssp_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getAufloesungSspZielgleis <em>Aufloesung Ssp Zielgleis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aufloesung Ssp Zielgleis</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getAufloesungSspZielgleis()
	 * @see #getFstr_Abhaengigkeit_Ssp_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Abhaengigkeit_Ssp_AttributeGroup_AufloesungSspZielgleis();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Schluesselsperre</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getIDSchluesselsperre()
	 * @see #getFstr_Abhaengigkeit_Ssp_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Abhaengigkeit_Ssp_AttributeGroup_IDSchluesselsperre();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander <em>Fstr Aneinander</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Aneinander</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander
	 * @generated
	 */
	EClass getFstr_Aneinander();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander#getFstrAneinanderBedienstring <em>Fstr Aneinander Bedienstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Aneinander Bedienstring</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander#getFstrAneinanderBedienstring()
	 * @see #getFstr_Aneinander()
	 * @generated
	 */
	EReference getFstr_Aneinander_FstrAneinanderBedienstring();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Bedienstring_TypeClass <em>Fstr Aneinander Bedienstring Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Aneinander Bedienstring Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Bedienstring_TypeClass
	 * @generated
	 */
	EClass getFstr_Aneinander_Bedienstring_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Bedienstring_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Bedienstring_TypeClass#getWert()
	 * @see #getFstr_Aneinander_Bedienstring_TypeClass()
	 * @generated
	 */
	EAttribute getFstr_Aneinander_Bedienstring_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Zuordnung <em>Fstr Aneinander Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Aneinander Zuordnung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Zuordnung
	 * @generated
	 */
	EClass getFstr_Aneinander_Zuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrAneinander <em>ID Fstr Aneinander</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr Aneinander</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrAneinander()
	 * @see #getFstr_Aneinander_Zuordnung()
	 * @generated
	 */
	EReference getFstr_Aneinander_Zuordnung_IDFstrAneinander();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr Zug Rangier</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrZugRangier()
	 * @see #getFstr_Aneinander_Zuordnung()
	 * @generated
	 */
	EReference getFstr_Aneinander_Zuordnung_IDFstrZugRangier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Bedienstring_TypeClass <em>Fstr Bedienstring Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Bedienstring Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Bedienstring_TypeClass
	 * @generated
	 */
	EClass getFstr_Bedienstring_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Bedienstring_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Bedienstring_TypeClass#getWert()
	 * @see #getFstr_Bedienstring_TypeClass()
	 * @generated
	 */
	EAttribute getFstr_Bedienstring_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg <em>Fstr DWeg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr DWeg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg
	 * @generated
	 */
	EClass getFstr_DWeg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg#getBezeichnung()
	 * @see #getFstr_DWeg()
	 * @generated
	 */
	EReference getFstr_DWeg_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg#getFstrDWegAllg <em>Fstr DWeg Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr DWeg Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg#getFstrDWegAllg()
	 * @see #getFstr_DWeg()
	 * @generated
	 */
	EReference getFstr_DWeg_FstrDWegAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg#getFstrDWegSpezifisch <em>Fstr DWeg Spezifisch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr DWeg Spezifisch</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg#getFstrDWegSpezifisch()
	 * @see #getFstr_DWeg()
	 * @generated
	 */
	EReference getFstr_DWeg_FstrDWegSpezifisch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg#getIDFMAAnlageFreimeldung <em>IDFMA Anlage Freimeldung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IDFMA Anlage Freimeldung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg#getIDFMAAnlageFreimeldung()
	 * @see #getFstr_DWeg()
	 * @generated
	 */
	EReference getFstr_DWeg_IDFMAAnlageFreimeldung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr Fahrweg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg#getIDFstrFahrweg()
	 * @see #getFstr_DWeg()
	 * @generated
	 */
	EReference getFstr_DWeg_IDFstrFahrweg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg#getIDPZBGefahrpunkt <em>IDPZB Gefahrpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDPZB Gefahrpunkt</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg#getIDPZBGefahrpunkt()
	 * @see #getFstr_DWeg()
	 * @generated
	 */
	EReference getFstr_DWeg_IDPZBGefahrpunkt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup <em>Fstr DWeg Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr DWeg Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup
	 * @generated
	 */
	EClass getFstr_DWeg_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup#getLaengeSoll <em>Laenge Soll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Laenge Soll</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup#getLaengeSoll()
	 * @see #getFstr_DWeg_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_DWeg_Allg_AttributeGroup_LaengeSoll();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup#getMassgebendeNeigung <em>Massgebende Neigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Massgebende Neigung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup#getMassgebendeNeigung()
	 * @see #getFstr_DWeg_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_DWeg_Allg_AttributeGroup_MassgebendeNeigung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Bezeichnung_AttributeGroup <em>Fstr DWeg Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr DWeg Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getFstr_DWeg_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Bezeichnung_AttributeGroup#getBezeichnungFstrDWeg <em>Bezeichnung Fstr DWeg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Fstr DWeg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Bezeichnung_AttributeGroup#getBezeichnungFstrDWeg()
	 * @see #getFstr_DWeg_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_DWeg_Bezeichnung_AttributeGroup_BezeichnungFstrDWeg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup <em>Fstr DWeg Spezifisch Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr DWeg Spezifisch Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup
	 * @generated
	 */
	EClass getFstr_DWeg_Spezifisch_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getAufloesungVerzoegerung <em>Aufloesung Verzoegerung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aufloesung Verzoegerung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getAufloesungVerzoegerung()
	 * @see #getFstr_DWeg_Spezifisch_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_DWeg_Spezifisch_AttributeGroup_AufloesungVerzoegerung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getDWegReihenfolge <em>DWeg Reihenfolge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DWeg Reihenfolge</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getDWegReihenfolge()
	 * @see #getFstr_DWeg_Spezifisch_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_DWeg_Spezifisch_AttributeGroup_DWegReihenfolge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getDWegV <em>DWeg V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DWeg V</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getDWegV()
	 * @see #getFstr_DWeg_Spezifisch_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_DWeg_Spezifisch_AttributeGroup_DWegV();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getDWegVAufwertungVerzicht <em>DWeg VAufwertung Verzicht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DWeg VAufwertung Verzicht</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getDWegVAufwertungVerzicht()
	 * @see #getFstr_DWeg_Spezifisch_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_DWeg_Spezifisch_AttributeGroup_DWegVAufwertungVerzicht();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getIDFMAAnlageZielgleis <em>IDFMA Anlage Zielgleis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDFMA Anlage Zielgleis</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getIDFMAAnlageZielgleis()
	 * @see #getFstr_DWeg_Spezifisch_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_DWeg_Spezifisch_AttributeGroup_IDFMAAnlageZielgleis();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_W_Kr <em>Fstr DWeg WKr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr DWeg WKr</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_W_Kr
	 * @generated
	 */
	EClass getFstr_DWeg_W_Kr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_W_Kr#getElementVerschluss <em>Element Verschluss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Verschluss</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_W_Kr#getElementVerschluss()
	 * @see #getFstr_DWeg_W_Kr()
	 * @generated
	 */
	EReference getFstr_DWeg_W_Kr_ElementVerschluss();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_W_Kr#getIDFstrDWeg <em>ID Fstr DWeg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr DWeg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_W_Kr#getIDFstrDWeg()
	 * @see #getFstr_DWeg_W_Kr()
	 * @generated
	 */
	EReference getFstr_DWeg_W_Kr_IDFstrDWeg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_W_Kr#getIDWKrGspElement <em>IDW Kr Gsp Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDW Kr Gsp Element</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_W_Kr#getIDWKrGspElement()
	 * @see #getFstr_DWeg_W_Kr()
	 * @generated
	 */
	EReference getFstr_DWeg_W_Kr_IDWKrGspElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Fahrweg <em>Fstr Fahrweg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Fahrweg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Fahrweg
	 * @generated
	 */
	EClass getFstr_Fahrweg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Fahrweg#getFstrVHg <em>Fstr VHg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr VHg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Fahrweg#getFstrVHg()
	 * @see #getFstr_Fahrweg()
	 * @generated
	 */
	EReference getFstr_Fahrweg_FstrVHg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Fahrweg#getIDStart <em>ID Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Start</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Fahrweg#getIDStart()
	 * @see #getFstr_Fahrweg()
	 * @generated
	 */
	EReference getFstr_Fahrweg_IDStart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Fahrweg#getIDZiel <em>ID Ziel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Ziel</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Fahrweg#getIDZiel()
	 * @see #getFstr_Fahrweg()
	 * @generated
	 */
	EReference getFstr_Fahrweg_IDZiel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Fahrweg#getStartSignalCharakter <em>Start Signal Charakter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Signal Charakter</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Fahrweg#getStartSignalCharakter()
	 * @see #getFstr_Fahrweg()
	 * @generated
	 */
	EReference getFstr_Fahrweg_StartSignalCharakter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_Art_TypeClass <em>Fstr Mittel Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Mittel Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_Art_TypeClass
	 * @generated
	 */
	EClass getFstr_Mittel_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_Art_TypeClass#getWert()
	 * @see #getFstr_Mittel_Art_TypeClass()
	 * @generated
	 */
	EAttribute getFstr_Mittel_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_AttributeGroup <em>Fstr Mittel Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Mittel Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_AttributeGroup
	 * @generated
	 */
	EClass getFstr_Mittel_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_AttributeGroup#getFstrMittelArt <em>Fstr Mittel Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Mittel Art</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_AttributeGroup#getFstrMittelArt()
	 * @see #getFstr_Mittel_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Mittel_AttributeGroup_FstrMittelArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_AttributeGroup#getFstrMittelVAufwertung <em>Fstr Mittel VAufwertung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Mittel VAufwertung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_AttributeGroup#getFstrMittelVAufwertung()
	 * @see #getFstr_Mittel_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Mittel_AttributeGroup_FstrMittelVAufwertung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_V_Aufwertung_TypeClass <em>Fstr Mittel VAufwertung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Mittel VAufwertung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_V_Aufwertung_TypeClass
	 * @generated
	 */
	EClass getFstr_Mittel_V_Aufwertung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_V_Aufwertung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Mittel_V_Aufwertung_TypeClass#getWert()
	 * @see #getFstr_Mittel_V_Aufwertung_TypeClass()
	 * @generated
	 */
	EAttribute getFstr_Mittel_V_Aufwertung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Nichthaltfall <em>Fstr Nichthaltfall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Nichthaltfall</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Nichthaltfall
	 * @generated
	 */
	EClass getFstr_Nichthaltfall();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Nichthaltfall#getIDFMAAnlage <em>IDFMA Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDFMA Anlage</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Nichthaltfall#getIDFMAAnlage()
	 * @see #getFstr_Nichthaltfall()
	 * @generated
	 */
	EReference getFstr_Nichthaltfall_IDFMAAnlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Nichthaltfall#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr Fahrweg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Nichthaltfall#getIDFstrFahrweg()
	 * @see #getFstr_Nichthaltfall()
	 * @generated
	 */
	EReference getFstr_Nichthaltfall_IDFstrFahrweg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_Art_TypeClass <em>Fstr Rangier Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Rangier Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_Art_TypeClass
	 * @generated
	 */
	EClass getFstr_Rangier_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_Art_TypeClass#getWert()
	 * @see #getFstr_Rangier_Art_TypeClass()
	 * @generated
	 */
	EAttribute getFstr_Rangier_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_AttributeGroup <em>Fstr Rangier Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Rangier Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_AttributeGroup
	 * @generated
	 */
	EClass getFstr_Rangier_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_AttributeGroup#getAutomatischeEinstellung <em>Automatische Einstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Automatische Einstellung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_AttributeGroup#getAutomatischeEinstellung()
	 * @see #getFstr_Rangier_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Rangier_AttributeGroup_AutomatischeEinstellung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_AttributeGroup#getFstrRangierArt <em>Fstr Rangier Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Rangier Art</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_AttributeGroup#getFstrRangierArt()
	 * @see #getFstr_Rangier_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Rangier_AttributeGroup_FstrRangierArt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_AttributeGroup#getIDFMAAnlageRangierFrei <em>IDFMA Anlage Rangier Frei</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IDFMA Anlage Rangier Frei</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_AttributeGroup#getIDFMAAnlageRangierFrei()
	 * @see #getFstr_Rangier_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Rangier_AttributeGroup_IDFMAAnlageRangierFrei();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_AttributeGroup#getRangierGegenfahrtausschluss <em>Rangier Gegenfahrtausschluss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rangier Gegenfahrtausschluss</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_AttributeGroup#getRangierGegenfahrtausschluss()
	 * @see #getFstr_Rangier_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Rangier_AttributeGroup_RangierGegenfahrtausschluss();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung <em>Fstr Rangier Fla Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Rangier Fla Zuordnung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung
	 * @generated
	 */
	EClass getFstr_Rangier_Fla_Zuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fla Schutz</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFlaSchutz()
	 * @see #getFstr_Rangier_Fla_Zuordnung()
	 * @generated
	 */
	EReference getFstr_Rangier_Fla_Zuordnung_IDFlaSchutz();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFstrRangier <em>ID Fstr Rangier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr Rangier</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFstrRangier()
	 * @see #getFstr_Rangier_Fla_Zuordnung()
	 * @generated
	 */
	EReference getFstr_Rangier_Fla_Zuordnung_IDFstrRangier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Reihenfolge_TypeClass <em>Fstr Reihenfolge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Reihenfolge Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Reihenfolge_TypeClass
	 * @generated
	 */
	EClass getFstr_Reihenfolge_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Reihenfolge_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Reihenfolge_TypeClass#getWert()
	 * @see #getFstr_Reihenfolge_TypeClass()
	 * @generated
	 */
	EAttribute getFstr_Reihenfolge_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Signalisierung <em>Fstr Signalisierung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Signalisierung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Signalisierung
	 * @generated
	 */
	EClass getFstr_Signalisierung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Signalisierung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr Zug Rangier</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Signalisierung#getIDFstrZugRangier()
	 * @see #getFstr_Signalisierung()
	 * @generated
	 */
	EReference getFstr_Signalisierung_IDFstrZugRangier();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriff <em>ID Signal Signalbegriff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal Signalbegriff</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriff()
	 * @see #getFstr_Signalisierung()
	 * @generated
	 */
	EReference getFstr_Signalisierung_IDSignalSignalbegriff();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriffZiel <em>ID Signal Signalbegriff Ziel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal Signalbegriff Ziel</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriffZiel()
	 * @see #getFstr_Signalisierung()
	 * @generated
	 */
	EReference getFstr_Signalisierung_IDSignalSignalbegriffZiel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Umfahrpunkt <em>Fstr Umfahrpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Umfahrpunkt</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Umfahrpunkt
	 * @generated
	 */
	EClass getFstr_Umfahrpunkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Umfahrpunkt#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr Fahrweg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Umfahrpunkt#getIDFstrFahrweg()
	 * @see #getFstr_Umfahrpunkt()
	 * @generated
	 */
	EReference getFstr_Umfahrpunkt_IDFstrFahrweg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Umfahrpunkt#getIDUmfahrpunkt <em>ID Umfahrpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Umfahrpunkt</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Umfahrpunkt#getIDUmfahrpunkt()
	 * @see #getFstr_Umfahrpunkt()
	 * @generated
	 */
	EReference getFstr_Umfahrpunkt_IDUmfahrpunkt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_V_Hg_TypeClass <em>Fstr VHg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr VHg Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_V_Hg_TypeClass
	 * @generated
	 */
	EClass getFstr_V_Hg_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_V_Hg_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_V_Hg_TypeClass#getWert()
	 * @see #getFstr_V_Hg_TypeClass()
	 * @generated
	 */
	EAttribute getFstr_V_Hg_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_V_TypeClass <em>Fstr VType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr VType Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_V_TypeClass
	 * @generated
	 */
	EClass getFstr_V_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_V_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_V_TypeClass#getWert()
	 * @see #getFstr_V_TypeClass()
	 * @generated
	 */
	EAttribute getFstr_V_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Vsigabstand_Verkuerzt_TypeClass <em>Fstr Vsigabstand Verkuerzt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Vsigabstand Verkuerzt Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Vsigabstand_Verkuerzt_TypeClass
	 * @generated
	 */
	EClass getFstr_Vsigabstand_Verkuerzt_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Vsigabstand_Verkuerzt_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Vsigabstand_Verkuerzt_TypeClass#getWert()
	 * @see #getFstr_Vsigabstand_Verkuerzt_TypeClass()
	 * @generated
	 */
	EAttribute getFstr_Vsigabstand_Verkuerzt_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Art_TypeClass <em>Fstr Zug Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Zug Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Art_TypeClass
	 * @generated
	 */
	EClass getFstr_Zug_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Art_TypeClass#getWert()
	 * @see #getFstr_Zug_Art_TypeClass()
	 * @generated
	 */
	EAttribute getFstr_Zug_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup <em>Fstr Zug Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Zug Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup
	 * @generated
	 */
	EClass getFstr_Zug_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup#getAutomatischeEinstellung <em>Automatische Einstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Automatische Einstellung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup#getAutomatischeEinstellung()
	 * @see #getFstr_Zug_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Zug_AttributeGroup_AutomatischeEinstellung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup#getFstrVsigabstandVerkuerzt <em>Fstr Vsigabstand Verkuerzt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Vsigabstand Verkuerzt</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup#getFstrVsigabstandVerkuerzt()
	 * @see #getFstr_Zug_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Zug_AttributeGroup_FstrVsigabstandVerkuerzt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup#getFstrZugArt <em>Fstr Zug Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Zug Art</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup#getFstrZugArt()
	 * @see #getFstr_Zug_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Zug_AttributeGroup_FstrZugArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup#getFstrZugDWeg <em>Fstr Zug DWeg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Zug DWeg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup#getFstrZugDWeg()
	 * @see #getFstr_Zug_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Zug_AttributeGroup_FstrZugDWeg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IDBUE Einschaltung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup#getIDBUEEinschaltung()
	 * @see #getFstr_Zug_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Zug_AttributeGroup_IDBUEEinschaltung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup#getIDSignalGruppenausfahrt <em>ID Signal Gruppenausfahrt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal Gruppenausfahrt</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup#getIDSignalGruppenausfahrt()
	 * @see #getFstr_Zug_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Zug_AttributeGroup_IDSignalGruppenausfahrt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup <em>Fstr Zug DWeg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Zug DWeg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup
	 * @generated
	 */
	EClass getFstr_Zug_DWeg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getDWegVorzug <em>DWeg Vorzug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DWeg Vorzug</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getDWegVorzug()
	 * @see #getFstr_Zug_DWeg_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Zug_DWeg_AttributeGroup_DWegVorzug();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getIDFstrDWeg <em>ID Fstr DWeg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr DWeg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getIDFstrDWeg()
	 * @see #getFstr_Zug_DWeg_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Zug_DWeg_AttributeGroup_IDFstrDWeg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier <em>Fstr Zug Rangier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Zug Rangier</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier
	 * @generated
	 */
	EClass getFstr_Zug_Rangier();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier#getFstrZugRangierAllg <em>Fstr Zug Rangier Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Zug Rangier Allg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier#getFstrZugRangierAllg()
	 * @see #getFstr_Zug_Rangier()
	 * @generated
	 */
	EReference getFstr_Zug_Rangier_FstrZugRangierAllg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier#getIDFstrAusschlussBesonders <em>ID Fstr Ausschluss Besonders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Fstr Ausschluss Besonders</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier#getIDFstrAusschlussBesonders()
	 * @see #getFstr_Zug_Rangier()
	 * @generated
	 */
	EReference getFstr_Zug_Rangier_IDFstrAusschlussBesonders();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr Fahrweg</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier#getIDFstrFahrweg()
	 * @see #getFstr_Zug_Rangier()
	 * @generated
	 */
	EReference getFstr_Zug_Rangier_IDFstrFahrweg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier#getFstrMittel <em>Fstr Mittel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Mittel</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier#getFstrMittel()
	 * @see #getFstr_Zug_Rangier()
	 * @generated
	 */
	EReference getFstr_Zug_Rangier_FstrMittel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier#getFstrRangier <em>Fstr Rangier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Rangier</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier#getFstrRangier()
	 * @see #getFstr_Zug_Rangier()
	 * @generated
	 */
	EReference getFstr_Zug_Rangier_FstrRangier();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier#getFstrZug <em>Fstr Zug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Zug</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier#getFstrZug()
	 * @see #getFstr_Zug_Rangier()
	 * @generated
	 */
	EReference getFstr_Zug_Rangier_FstrZug();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup <em>Fstr Zug Rangier Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Zug Rangier Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup
	 * @generated
	 */
	EClass getFstr_Zug_Rangier_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFBedienung <em>FBedienung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FBedienung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFBedienung()
	 * @see #getFstr_Zug_Rangier_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Zug_Rangier_Allg_AttributeGroup_FBedienung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrBedienstring <em>Fstr Bedienstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Bedienstring</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrBedienstring()
	 * @see #getFstr_Zug_Rangier_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Zug_Rangier_Allg_AttributeGroup_FstrBedienstring();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrReihenfolge <em>Fstr Reihenfolge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Reihenfolge</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrReihenfolge()
	 * @see #getFstr_Zug_Rangier_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Zug_Rangier_Allg_AttributeGroup_FstrReihenfolge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrV <em>Fstr V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr V</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrV()
	 * @see #getFstr_Zug_Rangier_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getFstr_Zug_Rangier_Allg_AttributeGroup_FstrV();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Laenge_Soll_TypeClass <em>Laenge Soll Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Laenge Soll Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Laenge_Soll_TypeClass
	 * @generated
	 */
	EClass getLaenge_Soll_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Laenge_Soll_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Laenge_Soll_TypeClass#getWert()
	 * @see #getLaenge_Soll_TypeClass()
	 * @generated
	 */
	EAttribute getLaenge_Soll_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt <em>Markanter Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markanter Punkt</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt
	 * @generated
	 */
	EClass getMarkanter_Punkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt#getBezeichnung()
	 * @see #getMarkanter_Punkt()
	 * @generated
	 */
	EReference getMarkanter_Punkt_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt#getIDDWegErlaubnisabhaengig <em>IDD Weg Erlaubnisabhaengig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDD Weg Erlaubnisabhaengig</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt#getIDDWegErlaubnisabhaengig()
	 * @see #getMarkanter_Punkt()
	 * @generated
	 */
	EReference getMarkanter_Punkt_IDDWegErlaubnisabhaengig();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt#getIDMarkanteStelle <em>ID Markante Stelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Markante Stelle</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt#getIDMarkanteStelle()
	 * @see #getMarkanter_Punkt()
	 * @generated
	 */
	EReference getMarkanter_Punkt_IDMarkanteStelle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt_Bezeichnung_AttributeGroup <em>Markanter Punkt Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markanter Punkt Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getMarkanter_Punkt_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt_Bezeichnung_AttributeGroup#getBezeichnungMarkanterPunkt <em>Bezeichnung Markanter Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Markanter Punkt</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt_Bezeichnung_AttributeGroup#getBezeichnungMarkanterPunkt()
	 * @see #getMarkanter_Punkt_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getMarkanter_Punkt_Bezeichnung_AttributeGroup_BezeichnungMarkanterPunkt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Massgebende_Neigung_TypeClass <em>Massgebende Neigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Massgebende Neigung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Massgebende_Neigung_TypeClass
	 * @generated
	 */
	EClass getMassgebende_Neigung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Massgebende_Neigung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Massgebende_Neigung_TypeClass#getWert()
	 * @see #getMassgebende_Neigung_TypeClass()
	 * @generated
	 */
	EAttribute getMassgebende_Neigung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Rangier_Gegenfahrtausschluss_TypeClass <em>Rangier Gegenfahrtausschluss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rangier Gegenfahrtausschluss Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Rangier_Gegenfahrtausschluss_TypeClass
	 * @generated
	 */
	EClass getRangier_Gegenfahrtausschluss_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Rangier_Gegenfahrtausschluss_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Rangier_Gegenfahrtausschluss_TypeClass#getWert()
	 * @see #getRangier_Gegenfahrtausschluss_TypeClass()
	 * @generated
	 */
	EAttribute getRangier_Gegenfahrtausschluss_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Sonstiger_Punkt <em>Sonstiger Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sonstiger Punkt</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Sonstiger_Punkt
	 * @generated
	 */
	EClass getSonstiger_Punkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Fahrstrasse.Sonstiger_Punkt#getIDBeginnBereich <em>ID Beginn Bereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Beginn Bereich</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Sonstiger_Punkt#getIDBeginnBereich()
	 * @see #getSonstiger_Punkt()
	 * @generated
	 */
	EReference getSonstiger_Punkt_IDBeginnBereich();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Fahrstrasse.Start_Signal_Charakter_TypeClass <em>Start Signal Charakter Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Signal Charakter Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Start_Signal_Charakter_TypeClass
	 * @generated
	 */
	EClass getStart_Signal_Charakter_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Fahrstrasse.Start_Signal_Charakter_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.Start_Signal_Charakter_TypeClass#getWert()
	 * @see #getStart_Signal_Charakter_TypeClass()
	 * @generated
	 */
	EAttribute getStart_Signal_Charakter_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMAufloesungSspZielgleis <em>ENUM Aufloesung Ssp Zielgleis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Aufloesung Ssp Zielgleis</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMAufloesungSspZielgleis
	 * @generated
	 */
	EEnum getENUMAufloesungSspZielgleis();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMAutomatischeEinstellung <em>ENUM Automatische Einstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Automatische Einstellung</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMAutomatischeEinstellung
	 * @generated
	 */
	EEnum getENUMAutomatischeEinstellung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrMittelArt <em>ENUM Fstr Mittel Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Fstr Mittel Art</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrMittelArt
	 * @generated
	 */
	EEnum getENUMFstrMittelArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrRangierArt <em>ENUM Fstr Rangier Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Fstr Rangier Art</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrRangierArt
	 * @generated
	 */
	EEnum getENUMFstrRangierArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrZugArt <em>ENUM Fstr Zug Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Fstr Zug Art</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrZugArt
	 * @generated
	 */
	EEnum getENUMFstrZugArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMRangierGegenfahrtausschluss <em>ENUM Rangier Gegenfahrtausschluss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Rangier Gegenfahrtausschluss</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMRangierGegenfahrtausschluss
	 * @generated
	 */
	EEnum getENUMRangierGegenfahrtausschluss();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMStartSignalCharakter <em>ENUM Start Signal Charakter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Start Signal Charakter</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMStartSignalCharakter
	 * @generated
	 */
	EEnum getENUMStartSignalCharakter();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Aufloesung Verzoegerung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Aufloesung Verzoegerung Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TAufloesung_Verzoegerung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TSekunde' pattern='0|[1-9][0-9]{0,1}|1[0-1][0-9]|120'"
	 * @generated
	 */
	EDataType getAufloesung_Verzoegerung_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Fstr DWeg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Fstr DWeg Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Fstr_DWeg' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TZeichenkette' pattern='[a-zA-Z0-9_]{1,3}'"
	 * @generated
	 */
	EDataType getBezeichnung_Fstr_DWeg_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Markanter Punkt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Markanter Punkt Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Markanter_Punkt' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{1,30}'"
	 * @generated
	 */
	EDataType getBezeichnung_Markanter_Punkt_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>DWeg Reihenfolge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DWeg Reihenfolge Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TDWeg_Reihenfolge' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9]|1[0-5]'"
	 * @generated
	 */
	EDataType getDWeg_Reihenfolge_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>DWeg VType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DWeg VType</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TDWeg_V' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='20|30|40|60|100|160'"
	 * @generated
	 */
	EDataType getDWeg_V_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMAufloesungSspZielgleis <em>ENUM Aufloesung Ssp Zielgleis Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Aufloesung Ssp Zielgleis Object</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMAufloesungSspZielgleis
	 * @model instanceClass="org.eclipse.set.model.planpro.Fahrstrasse.ENUMAufloesungSspZielgleis"
	 *        extendedMetaData="name='ENUMAufloesung_Ssp_Zielgleis:Object' baseType='ENUMAufloesung_Ssp_Zielgleis'"
	 * @generated
	 */
	EDataType getENUMAufloesungSspZielgleisObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMAutomatischeEinstellung <em>ENUM Automatische Einstellung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Automatische Einstellung Object</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMAutomatischeEinstellung
	 * @model instanceClass="org.eclipse.set.model.planpro.Fahrstrasse.ENUMAutomatischeEinstellung"
	 *        extendedMetaData="name='ENUMAutomatische_Einstellung:Object' baseType='ENUMAutomatische_Einstellung'"
	 * @generated
	 */
	EDataType getENUMAutomatischeEinstellungObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrMittelArt <em>ENUM Fstr Mittel Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Fstr Mittel Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrMittelArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrMittelArt"
	 *        extendedMetaData="name='ENUMFstr_Mittel_Art:Object' baseType='ENUMFstr_Mittel_Art'"
	 * @generated
	 */
	EDataType getENUMFstrMittelArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrRangierArt <em>ENUM Fstr Rangier Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Fstr Rangier Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrRangierArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrRangierArt"
	 *        extendedMetaData="name='ENUMFstr_Rangier_Art:Object' baseType='ENUMFstr_Rangier_Art'"
	 * @generated
	 */
	EDataType getENUMFstrRangierArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrZugArt <em>ENUM Fstr Zug Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Fstr Zug Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrZugArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrZugArt"
	 *        extendedMetaData="name='ENUMFstr_Zug_Art:Object' baseType='ENUMFstr_Zug_Art'"
	 * @generated
	 */
	EDataType getENUMFstrZugArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMRangierGegenfahrtausschluss <em>ENUM Rangier Gegenfahrtausschluss Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Rangier Gegenfahrtausschluss Object</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMRangierGegenfahrtausschluss
	 * @model instanceClass="org.eclipse.set.model.planpro.Fahrstrasse.ENUMRangierGegenfahrtausschluss"
	 *        extendedMetaData="name='ENUMRangier_Gegenfahrtausschluss:Object' baseType='ENUMRangier_Gegenfahrtausschluss'"
	 * @generated
	 */
	EDataType getENUMRangierGegenfahrtausschlussObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMStartSignalCharakter <em>ENUM Start Signal Charakter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Start Signal Charakter Object</em>'.
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMStartSignalCharakter
	 * @model instanceClass="org.eclipse.set.model.planpro.Fahrstrasse.ENUMStartSignalCharakter"
	 *        extendedMetaData="name='ENUMStart_Signal_Charakter:Object' baseType='ENUMStart_Signal_Charakter'"
	 * @generated
	 */
	EDataType getENUMStartSignalCharakterObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fstr Aneinander Bedienstring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fstr Aneinander Bedienstring Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TFstr_Aneinander_Bedienstring' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{3,20}'"
	 * @generated
	 */
	EDataType getFstr_Aneinander_Bedienstring_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fstr Bedienstring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fstr Bedienstring Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TFstr_Bedienstring' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{3,26}'"
	 * @generated
	 */
	EDataType getFstr_Bedienstring_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Fstr Reihenfolge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fstr Reihenfolge Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TFstr_Reihenfolge' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[0-9]|[12][0-9]|30'"
	 * @generated
	 */
	EDataType getFstr_Reihenfolge_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Fstr VHg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fstr VHg Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TFstr_V_Hg' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit'"
	 * @generated
	 */
	EDataType getFstr_V_Hg_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Fstr VType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fstr VType</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TFstr_V' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit' pattern='20|30|40|50|60|70|80|90|100|110|120|130|140|150'"
	 * @generated
	 */
	EDataType getFstr_V_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Laenge Soll Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Laenge Soll Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TLaenge_Soll' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter' pattern='0|[1-9][0-9]{0,1}|[1-2][0-9]{2}|300'"
	 * @generated
	 */
	EDataType getLaenge_Soll_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Massgebende Neigung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Massgebende Neigung Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TMassgebende_Neigung' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='-([1-9]|[1-7][0-9]|80)\\.[0-9]{2}|-0\\.[1-9][0-9]|-0\\.0[1-9]|[0-9]\\.[0-9]{2}|[1-7][0-9]\\.[0-9]{2}|80\\.00'"
	 * @generated
	 */
	EDataType getMassgebende_Neigung_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FahrstrasseFactory getFahrstrasseFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Aufloesung_Ssp_Zielgleis_TypeClassImpl <em>Aufloesung Ssp Zielgleis Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Aufloesung_Ssp_Zielgleis_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getAufloesung_Ssp_Zielgleis_TypeClass()
		 * @generated
		 */
		EClass AUFLOESUNG_SSP_ZIELGLEIS_TYPE_CLASS = eINSTANCE.getAufloesung_Ssp_Zielgleis_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUFLOESUNG_SSP_ZIELGLEIS_TYPE_CLASS__WERT = eINSTANCE.getAufloesung_Ssp_Zielgleis_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Aufloesung_Verzoegerung_TypeClassImpl <em>Aufloesung Verzoegerung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Aufloesung_Verzoegerung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getAufloesung_Verzoegerung_TypeClass()
		 * @generated
		 */
		EClass AUFLOESUNG_VERZOEGERUNG_TYPE_CLASS = eINSTANCE.getAufloesung_Verzoegerung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUFLOESUNG_VERZOEGERUNG_TYPE_CLASS__WERT = eINSTANCE.getAufloesung_Verzoegerung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Automatische_Einstellung_TypeClassImpl <em>Automatische Einstellung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Automatische_Einstellung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getAutomatische_Einstellung_TypeClass()
		 * @generated
		 */
		EClass AUTOMATISCHE_EINSTELLUNG_TYPE_CLASS = eINSTANCE.getAutomatische_Einstellung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATISCHE_EINSTELLUNG_TYPE_CLASS__WERT = eINSTANCE.getAutomatische_Einstellung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Bezeichnung_Fstr_DWeg_TypeClassImpl <em>Bezeichnung Fstr DWeg Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Bezeichnung_Fstr_DWeg_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getBezeichnung_Fstr_DWeg_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_FSTR_DWEG_TYPE_CLASS = eINSTANCE.getBezeichnung_Fstr_DWeg_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_FSTR_DWEG_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Fstr_DWeg_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Bezeichnung_Markanter_Punkt_TypeClassImpl <em>Bezeichnung Markanter Punkt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Bezeichnung_Markanter_Punkt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getBezeichnung_Markanter_Punkt_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_MARKANTER_PUNKT_TYPE_CLASS = eINSTANCE.getBezeichnung_Markanter_Punkt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_MARKANTER_PUNKT_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Markanter_Punkt_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_Reihenfolge_TypeClassImpl <em>DWeg Reihenfolge Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_Reihenfolge_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getDWeg_Reihenfolge_TypeClass()
		 * @generated
		 */
		EClass DWEG_REIHENFOLGE_TYPE_CLASS = eINSTANCE.getDWeg_Reihenfolge_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWEG_REIHENFOLGE_TYPE_CLASS__WERT = eINSTANCE.getDWeg_Reihenfolge_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_V_Aufwertung_Verzicht_TypeClassImpl <em>DWeg VAufwertung Verzicht Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_V_Aufwertung_Verzicht_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getDWeg_V_Aufwertung_Verzicht_TypeClass()
		 * @generated
		 */
		EClass DWEG_VAUFWERTUNG_VERZICHT_TYPE_CLASS = eINSTANCE.getDWeg_V_Aufwertung_Verzicht_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWEG_VAUFWERTUNG_VERZICHT_TYPE_CLASS__WERT = eINSTANCE.getDWeg_V_Aufwertung_Verzicht_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_V_TypeClassImpl <em>DWeg VType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_V_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getDWeg_V_TypeClass()
		 * @generated
		 */
		EClass DWEG_VTYPE_CLASS = eINSTANCE.getDWeg_V_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWEG_VTYPE_CLASS__WERT = eINSTANCE.getDWeg_V_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_Vorzug_TypeClassImpl <em>DWeg Vorzug Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.DWeg_Vorzug_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getDWeg_Vorzug_TypeClass()
		 * @generated
		 */
		EClass DWEG_VORZUG_TYPE_CLASS = eINSTANCE.getDWeg_Vorzug_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWEG_VORZUG_TYPE_CLASS__WERT = eINSTANCE.getDWeg_Vorzug_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Element_Verschluss_TypeClassImpl <em>Element Verschluss Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Element_Verschluss_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getElement_Verschluss_TypeClass()
		 * @generated
		 */
		EClass ELEMENT_VERSCHLUSS_TYPE_CLASS = eINSTANCE.getElement_Verschluss_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_VERSCHLUSS_TYPE_CLASS__WERT = eINSTANCE.getElement_Verschluss_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.F_Bedienung_TypeClassImpl <em>FBedienung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.F_Bedienung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getF_Bedienung_TypeClass()
		 * @generated
		 */
		EClass FBEDIENUNG_TYPE_CLASS = eINSTANCE.getF_Bedienung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FBEDIENUNG_TYPE_CLASS__WERT = eINSTANCE.getF_Bedienung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_AbhaengigkeitImpl <em>Fstr Abhaengigkeit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_AbhaengigkeitImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Abhaengigkeit()
		 * @generated
		 */
		EClass FSTR_ABHAENGIGKEIT = eINSTANCE.getFstr_Abhaengigkeit();

		/**
		 * The meta object literal for the '<em><b>ID Fstr Fahrweg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG = eINSTANCE.getFstr_Abhaengigkeit_IDFstrFahrweg();

		/**
		 * The meta object literal for the '<em><b>Fstr Abhaengigkeit Ssp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP = eINSTANCE.getFstr_Abhaengigkeit_FstrAbhaengigkeitSsp();

		/**
		 * The meta object literal for the '<em><b>ID Bedien Anzeige Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT = eINSTANCE.getFstr_Abhaengigkeit_IDBedienAnzeigeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl <em>Fstr Abhaengigkeit Ssp Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Abhaengigkeit_Ssp_AttributeGroup()
		 * @generated
		 */
		EClass FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP = eINSTANCE.getFstr_Abhaengigkeit_Ssp_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Aufloesung Ssp Zielgleis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS = eINSTANCE.getFstr_Abhaengigkeit_Ssp_AttributeGroup_AufloesungSspZielgleis();

		/**
		 * The meta object literal for the '<em><b>ID Schluesselsperre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE = eINSTANCE.getFstr_Abhaengigkeit_Ssp_AttributeGroup_IDSchluesselsperre();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_AneinanderImpl <em>Fstr Aneinander</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_AneinanderImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Aneinander()
		 * @generated
		 */
		EClass FSTR_ANEINANDER = eINSTANCE.getFstr_Aneinander();

		/**
		 * The meta object literal for the '<em><b>Fstr Aneinander Bedienstring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ANEINANDER__FSTR_ANEINANDER_BEDIENSTRING = eINSTANCE.getFstr_Aneinander_FstrAneinanderBedienstring();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Aneinander_Bedienstring_TypeClassImpl <em>Fstr Aneinander Bedienstring Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Aneinander_Bedienstring_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Aneinander_Bedienstring_TypeClass()
		 * @generated
		 */
		EClass FSTR_ANEINANDER_BEDIENSTRING_TYPE_CLASS = eINSTANCE.getFstr_Aneinander_Bedienstring_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSTR_ANEINANDER_BEDIENSTRING_TYPE_CLASS__WERT = eINSTANCE.getFstr_Aneinander_Bedienstring_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Aneinander_ZuordnungImpl <em>Fstr Aneinander Zuordnung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Aneinander_ZuordnungImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Aneinander_Zuordnung()
		 * @generated
		 */
		EClass FSTR_ANEINANDER_ZUORDNUNG = eINSTANCE.getFstr_Aneinander_Zuordnung();

		/**
		 * The meta object literal for the '<em><b>ID Fstr Aneinander</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER = eINSTANCE.getFstr_Aneinander_Zuordnung_IDFstrAneinander();

		/**
		 * The meta object literal for the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER = eINSTANCE.getFstr_Aneinander_Zuordnung_IDFstrZugRangier();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Bedienstring_TypeClassImpl <em>Fstr Bedienstring Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Bedienstring_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Bedienstring_TypeClass()
		 * @generated
		 */
		EClass FSTR_BEDIENSTRING_TYPE_CLASS = eINSTANCE.getFstr_Bedienstring_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSTR_BEDIENSTRING_TYPE_CLASS__WERT = eINSTANCE.getFstr_Bedienstring_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWegImpl <em>Fstr DWeg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWegImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_DWeg()
		 * @generated
		 */
		EClass FSTR_DWEG = eINSTANCE.getFstr_DWeg();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG__BEZEICHNUNG = eINSTANCE.getFstr_DWeg_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>Fstr DWeg Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG__FSTR_DWEG_ALLG = eINSTANCE.getFstr_DWeg_FstrDWegAllg();

		/**
		 * The meta object literal for the '<em><b>Fstr DWeg Spezifisch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG__FSTR_DWEG_SPEZIFISCH = eINSTANCE.getFstr_DWeg_FstrDWegSpezifisch();

		/**
		 * The meta object literal for the '<em><b>IDFMA Anlage Freimeldung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG = eINSTANCE.getFstr_DWeg_IDFMAAnlageFreimeldung();

		/**
		 * The meta object literal for the '<em><b>ID Fstr Fahrweg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG__ID_FSTR_FAHRWEG = eINSTANCE.getFstr_DWeg_IDFstrFahrweg();

		/**
		 * The meta object literal for the '<em><b>IDPZB Gefahrpunkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG__IDPZB_GEFAHRPUNKT = eINSTANCE.getFstr_DWeg_IDPZBGefahrpunkt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Allg_AttributeGroupImpl <em>Fstr DWeg Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_DWeg_Allg_AttributeGroup()
		 * @generated
		 */
		EClass FSTR_DWEG_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getFstr_DWeg_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Laenge Soll</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL = eINSTANCE.getFstr_DWeg_Allg_AttributeGroup_LaengeSoll();

		/**
		 * The meta object literal for the '<em><b>Massgebende Neigung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG = eINSTANCE.getFstr_DWeg_Allg_AttributeGroup_MassgebendeNeigung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Bezeichnung_AttributeGroupImpl <em>Fstr DWeg Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_DWeg_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getFstr_DWeg_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Fstr DWeg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_FSTR_DWEG = eINSTANCE.getFstr_DWeg_Bezeichnung_AttributeGroup_BezeichnungFstrDWeg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Spezifisch_AttributeGroupImpl <em>Fstr DWeg Spezifisch Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Spezifisch_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_DWeg_Spezifisch_AttributeGroup()
		 * @generated
		 */
		EClass FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP = eINSTANCE.getFstr_DWeg_Spezifisch_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Aufloesung Verzoegerung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__AUFLOESUNG_VERZOEGERUNG = eINSTANCE.getFstr_DWeg_Spezifisch_AttributeGroup_AufloesungVerzoegerung();

		/**
		 * The meta object literal for the '<em><b>DWeg Reihenfolge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_REIHENFOLGE = eINSTANCE.getFstr_DWeg_Spezifisch_AttributeGroup_DWegReihenfolge();

		/**
		 * The meta object literal for the '<em><b>DWeg V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_V = eINSTANCE.getFstr_DWeg_Spezifisch_AttributeGroup_DWegV();

		/**
		 * The meta object literal for the '<em><b>DWeg VAufwertung Verzicht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_VAUFWERTUNG_VERZICHT = eINSTANCE.getFstr_DWeg_Spezifisch_AttributeGroup_DWegVAufwertungVerzicht();

		/**
		 * The meta object literal for the '<em><b>IDFMA Anlage Zielgleis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__IDFMA_ANLAGE_ZIELGLEIS = eINSTANCE.getFstr_DWeg_Spezifisch_AttributeGroup_IDFMAAnlageZielgleis();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_W_KrImpl <em>Fstr DWeg WKr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_W_KrImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_DWeg_W_Kr()
		 * @generated
		 */
		EClass FSTR_DWEG_WKR = eINSTANCE.getFstr_DWeg_W_Kr();

		/**
		 * The meta object literal for the '<em><b>Element Verschluss</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS = eINSTANCE.getFstr_DWeg_W_Kr_ElementVerschluss();

		/**
		 * The meta object literal for the '<em><b>ID Fstr DWeg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG_WKR__ID_FSTR_DWEG = eINSTANCE.getFstr_DWeg_W_Kr_IDFstrDWeg();

		/**
		 * The meta object literal for the '<em><b>IDW Kr Gsp Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT = eINSTANCE.getFstr_DWeg_W_Kr_IDWKrGspElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_FahrwegImpl <em>Fstr Fahrweg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_FahrwegImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Fahrweg()
		 * @generated
		 */
		EClass FSTR_FAHRWEG = eINSTANCE.getFstr_Fahrweg();

		/**
		 * The meta object literal for the '<em><b>Fstr VHg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_FAHRWEG__FSTR_VHG = eINSTANCE.getFstr_Fahrweg_FstrVHg();

		/**
		 * The meta object literal for the '<em><b>ID Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_FAHRWEG__ID_START = eINSTANCE.getFstr_Fahrweg_IDStart();

		/**
		 * The meta object literal for the '<em><b>ID Ziel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_FAHRWEG__ID_ZIEL = eINSTANCE.getFstr_Fahrweg_IDZiel();

		/**
		 * The meta object literal for the '<em><b>Start Signal Charakter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_FAHRWEG__START_SIGNAL_CHARAKTER = eINSTANCE.getFstr_Fahrweg_StartSignalCharakter();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Mittel_Art_TypeClassImpl <em>Fstr Mittel Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Mittel_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Mittel_Art_TypeClass()
		 * @generated
		 */
		EClass FSTR_MITTEL_ART_TYPE_CLASS = eINSTANCE.getFstr_Mittel_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSTR_MITTEL_ART_TYPE_CLASS__WERT = eINSTANCE.getFstr_Mittel_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Mittel_AttributeGroupImpl <em>Fstr Mittel Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Mittel_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Mittel_AttributeGroup()
		 * @generated
		 */
		EClass FSTR_MITTEL_ATTRIBUTE_GROUP = eINSTANCE.getFstr_Mittel_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Fstr Mittel Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_ART = eINSTANCE.getFstr_Mittel_AttributeGroup_FstrMittelArt();

		/**
		 * The meta object literal for the '<em><b>Fstr Mittel VAufwertung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_VAUFWERTUNG = eINSTANCE.getFstr_Mittel_AttributeGroup_FstrMittelVAufwertung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Mittel_V_Aufwertung_TypeClassImpl <em>Fstr Mittel VAufwertung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Mittel_V_Aufwertung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Mittel_V_Aufwertung_TypeClass()
		 * @generated
		 */
		EClass FSTR_MITTEL_VAUFWERTUNG_TYPE_CLASS = eINSTANCE.getFstr_Mittel_V_Aufwertung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSTR_MITTEL_VAUFWERTUNG_TYPE_CLASS__WERT = eINSTANCE.getFstr_Mittel_V_Aufwertung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_NichthaltfallImpl <em>Fstr Nichthaltfall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_NichthaltfallImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Nichthaltfall()
		 * @generated
		 */
		EClass FSTR_NICHTHALTFALL = eINSTANCE.getFstr_Nichthaltfall();

		/**
		 * The meta object literal for the '<em><b>IDFMA Anlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_NICHTHALTFALL__IDFMA_ANLAGE = eINSTANCE.getFstr_Nichthaltfall_IDFMAAnlage();

		/**
		 * The meta object literal for the '<em><b>ID Fstr Fahrweg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG = eINSTANCE.getFstr_Nichthaltfall_IDFstrFahrweg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_Art_TypeClassImpl <em>Fstr Rangier Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Rangier_Art_TypeClass()
		 * @generated
		 */
		EClass FSTR_RANGIER_ART_TYPE_CLASS = eINSTANCE.getFstr_Rangier_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSTR_RANGIER_ART_TYPE_CLASS__WERT = eINSTANCE.getFstr_Rangier_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_AttributeGroupImpl <em>Fstr Rangier Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Rangier_AttributeGroup()
		 * @generated
		 */
		EClass FSTR_RANGIER_ATTRIBUTE_GROUP = eINSTANCE.getFstr_Rangier_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Automatische Einstellung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_RANGIER_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG = eINSTANCE.getFstr_Rangier_AttributeGroup_AutomatischeEinstellung();

		/**
		 * The meta object literal for the '<em><b>Fstr Rangier Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_RANGIER_ATTRIBUTE_GROUP__FSTR_RANGIER_ART = eINSTANCE.getFstr_Rangier_AttributeGroup_FstrRangierArt();

		/**
		 * The meta object literal for the '<em><b>IDFMA Anlage Rangier Frei</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_RANGIER_ATTRIBUTE_GROUP__IDFMA_ANLAGE_RANGIER_FREI = eINSTANCE.getFstr_Rangier_AttributeGroup_IDFMAAnlageRangierFrei();

		/**
		 * The meta object literal for the '<em><b>Rangier Gegenfahrtausschluss</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_RANGIER_ATTRIBUTE_GROUP__RANGIER_GEGENFAHRTAUSSCHLUSS = eINSTANCE.getFstr_Rangier_AttributeGroup_RangierGegenfahrtausschluss();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_Fla_ZuordnungImpl <em>Fstr Rangier Fla Zuordnung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_Fla_ZuordnungImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Rangier_Fla_Zuordnung()
		 * @generated
		 */
		EClass FSTR_RANGIER_FLA_ZUORDNUNG = eINSTANCE.getFstr_Rangier_Fla_Zuordnung();

		/**
		 * The meta object literal for the '<em><b>ID Fla Schutz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ = eINSTANCE.getFstr_Rangier_Fla_Zuordnung_IDFlaSchutz();

		/**
		 * The meta object literal for the '<em><b>ID Fstr Rangier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER = eINSTANCE.getFstr_Rangier_Fla_Zuordnung_IDFstrRangier();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Reihenfolge_TypeClassImpl <em>Fstr Reihenfolge Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Reihenfolge_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Reihenfolge_TypeClass()
		 * @generated
		 */
		EClass FSTR_REIHENFOLGE_TYPE_CLASS = eINSTANCE.getFstr_Reihenfolge_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSTR_REIHENFOLGE_TYPE_CLASS__WERT = eINSTANCE.getFstr_Reihenfolge_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_SignalisierungImpl <em>Fstr Signalisierung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_SignalisierungImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Signalisierung()
		 * @generated
		 */
		EClass FSTR_SIGNALISIERUNG = eINSTANCE.getFstr_Signalisierung();

		/**
		 * The meta object literal for the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER = eINSTANCE.getFstr_Signalisierung_IDFstrZugRangier();

		/**
		 * The meta object literal for the '<em><b>ID Signal Signalbegriff</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF = eINSTANCE.getFstr_Signalisierung_IDSignalSignalbegriff();

		/**
		 * The meta object literal for the '<em><b>ID Signal Signalbegriff Ziel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL = eINSTANCE.getFstr_Signalisierung_IDSignalSignalbegriffZiel();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_UmfahrpunktImpl <em>Fstr Umfahrpunkt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_UmfahrpunktImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Umfahrpunkt()
		 * @generated
		 */
		EClass FSTR_UMFAHRPUNKT = eINSTANCE.getFstr_Umfahrpunkt();

		/**
		 * The meta object literal for the '<em><b>ID Fstr Fahrweg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG = eINSTANCE.getFstr_Umfahrpunkt_IDFstrFahrweg();

		/**
		 * The meta object literal for the '<em><b>ID Umfahrpunkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT = eINSTANCE.getFstr_Umfahrpunkt_IDUmfahrpunkt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_V_Hg_TypeClassImpl <em>Fstr VHg Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_V_Hg_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_V_Hg_TypeClass()
		 * @generated
		 */
		EClass FSTR_VHG_TYPE_CLASS = eINSTANCE.getFstr_V_Hg_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSTR_VHG_TYPE_CLASS__WERT = eINSTANCE.getFstr_V_Hg_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_V_TypeClassImpl <em>Fstr VType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_V_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_V_TypeClass()
		 * @generated
		 */
		EClass FSTR_VTYPE_CLASS = eINSTANCE.getFstr_V_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSTR_VTYPE_CLASS__WERT = eINSTANCE.getFstr_V_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Vsigabstand_Verkuerzt_TypeClassImpl <em>Fstr Vsigabstand Verkuerzt Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Vsigabstand_Verkuerzt_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Vsigabstand_Verkuerzt_TypeClass()
		 * @generated
		 */
		EClass FSTR_VSIGABSTAND_VERKUERZT_TYPE_CLASS = eINSTANCE.getFstr_Vsigabstand_Verkuerzt_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSTR_VSIGABSTAND_VERKUERZT_TYPE_CLASS__WERT = eINSTANCE.getFstr_Vsigabstand_Verkuerzt_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_Art_TypeClassImpl <em>Fstr Zug Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Zug_Art_TypeClass()
		 * @generated
		 */
		EClass FSTR_ZUG_ART_TYPE_CLASS = eINSTANCE.getFstr_Zug_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSTR_ZUG_ART_TYPE_CLASS__WERT = eINSTANCE.getFstr_Zug_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl <em>Fstr Zug Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Zug_AttributeGroup()
		 * @generated
		 */
		EClass FSTR_ZUG_ATTRIBUTE_GROUP = eINSTANCE.getFstr_Zug_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Automatische Einstellung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG = eINSTANCE.getFstr_Zug_AttributeGroup_AutomatischeEinstellung();

		/**
		 * The meta object literal for the '<em><b>Fstr Vsigabstand Verkuerzt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT = eINSTANCE.getFstr_Zug_AttributeGroup_FstrVsigabstandVerkuerzt();

		/**
		 * The meta object literal for the '<em><b>Fstr Zug Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART = eINSTANCE.getFstr_Zug_AttributeGroup_FstrZugArt();

		/**
		 * The meta object literal for the '<em><b>Fstr Zug DWeg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG = eINSTANCE.getFstr_Zug_AttributeGroup_FstrZugDWeg();

		/**
		 * The meta object literal for the '<em><b>IDBUE Einschaltung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG = eINSTANCE.getFstr_Zug_AttributeGroup_IDBUEEinschaltung();

		/**
		 * The meta object literal for the '<em><b>ID Signal Gruppenausfahrt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT = eINSTANCE.getFstr_Zug_AttributeGroup_IDSignalGruppenausfahrt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_DWeg_AttributeGroupImpl <em>Fstr Zug DWeg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_DWeg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Zug_DWeg_AttributeGroup()
		 * @generated
		 */
		EClass FSTR_ZUG_DWEG_ATTRIBUTE_GROUP = eINSTANCE.getFstr_Zug_DWeg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>DWeg Vorzug</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__DWEG_VORZUG = eINSTANCE.getFstr_Zug_DWeg_AttributeGroup_DWegVorzug();

		/**
		 * The meta object literal for the '<em><b>ID Fstr DWeg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__ID_FSTR_DWEG = eINSTANCE.getFstr_Zug_DWeg_AttributeGroup_IDFstrDWeg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_RangierImpl <em>Fstr Zug Rangier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_RangierImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Zug_Rangier()
		 * @generated
		 */
		EClass FSTR_ZUG_RANGIER = eINSTANCE.getFstr_Zug_Rangier();

		/**
		 * The meta object literal for the '<em><b>Fstr Zug Rangier Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_RANGIER__FSTR_ZUG_RANGIER_ALLG = eINSTANCE.getFstr_Zug_Rangier_FstrZugRangierAllg();

		/**
		 * The meta object literal for the '<em><b>ID Fstr Ausschluss Besonders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_RANGIER__ID_FSTR_AUSSCHLUSS_BESONDERS = eINSTANCE.getFstr_Zug_Rangier_IDFstrAusschlussBesonders();

		/**
		 * The meta object literal for the '<em><b>ID Fstr Fahrweg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_RANGIER__ID_FSTR_FAHRWEG = eINSTANCE.getFstr_Zug_Rangier_IDFstrFahrweg();

		/**
		 * The meta object literal for the '<em><b>Fstr Mittel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_RANGIER__FSTR_MITTEL = eINSTANCE.getFstr_Zug_Rangier_FstrMittel();

		/**
		 * The meta object literal for the '<em><b>Fstr Rangier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_RANGIER__FSTR_RANGIER = eINSTANCE.getFstr_Zug_Rangier_FstrRangier();

		/**
		 * The meta object literal for the '<em><b>Fstr Zug</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_RANGIER__FSTR_ZUG = eINSTANCE.getFstr_Zug_Rangier_FstrZug();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_Rangier_Allg_AttributeGroupImpl <em>Fstr Zug Rangier Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_Rangier_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Zug_Rangier_Allg_AttributeGroup()
		 * @generated
		 */
		EClass FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getFstr_Zug_Rangier_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>FBedienung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FBEDIENUNG = eINSTANCE.getFstr_Zug_Rangier_Allg_AttributeGroup_FBedienung();

		/**
		 * The meta object literal for the '<em><b>Fstr Bedienstring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_BEDIENSTRING = eINSTANCE.getFstr_Zug_Rangier_Allg_AttributeGroup_FstrBedienstring();

		/**
		 * The meta object literal for the '<em><b>Fstr Reihenfolge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_REIHENFOLGE = eINSTANCE.getFstr_Zug_Rangier_Allg_AttributeGroup_FstrReihenfolge();

		/**
		 * The meta object literal for the '<em><b>Fstr V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_V = eINSTANCE.getFstr_Zug_Rangier_Allg_AttributeGroup_FstrV();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Laenge_Soll_TypeClassImpl <em>Laenge Soll Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Laenge_Soll_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getLaenge_Soll_TypeClass()
		 * @generated
		 */
		EClass LAENGE_SOLL_TYPE_CLASS = eINSTANCE.getLaenge_Soll_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAENGE_SOLL_TYPE_CLASS__WERT = eINSTANCE.getLaenge_Soll_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Markanter_PunktImpl <em>Markanter Punkt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Markanter_PunktImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getMarkanter_Punkt()
		 * @generated
		 */
		EClass MARKANTER_PUNKT = eINSTANCE.getMarkanter_Punkt();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKANTER_PUNKT__BEZEICHNUNG = eINSTANCE.getMarkanter_Punkt_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>IDD Weg Erlaubnisabhaengig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG = eINSTANCE.getMarkanter_Punkt_IDDWegErlaubnisabhaengig();

		/**
		 * The meta object literal for the '<em><b>ID Markante Stelle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKANTER_PUNKT__ID_MARKANTE_STELLE = eINSTANCE.getMarkanter_Punkt_IDMarkanteStelle();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Markanter_Punkt_Bezeichnung_AttributeGroupImpl <em>Markanter Punkt Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Markanter_Punkt_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getMarkanter_Punkt_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getMarkanter_Punkt_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Markanter Punkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_MARKANTER_PUNKT = eINSTANCE.getMarkanter_Punkt_Bezeichnung_AttributeGroup_BezeichnungMarkanterPunkt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Massgebende_Neigung_TypeClassImpl <em>Massgebende Neigung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Massgebende_Neigung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getMassgebende_Neigung_TypeClass()
		 * @generated
		 */
		EClass MASSGEBENDE_NEIGUNG_TYPE_CLASS = eINSTANCE.getMassgebende_Neigung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASSGEBENDE_NEIGUNG_TYPE_CLASS__WERT = eINSTANCE.getMassgebende_Neigung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Rangier_Gegenfahrtausschluss_TypeClassImpl <em>Rangier Gegenfahrtausschluss Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Rangier_Gegenfahrtausschluss_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getRangier_Gegenfahrtausschluss_TypeClass()
		 * @generated
		 */
		EClass RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS = eINSTANCE.getRangier_Gegenfahrtausschluss_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS__WERT = eINSTANCE.getRangier_Gegenfahrtausschluss_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Sonstiger_PunktImpl <em>Sonstiger Punkt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Sonstiger_PunktImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getSonstiger_Punkt()
		 * @generated
		 */
		EClass SONSTIGER_PUNKT = eINSTANCE.getSonstiger_Punkt();

		/**
		 * The meta object literal for the '<em><b>ID Beginn Bereich</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONSTIGER_PUNKT__ID_BEGINN_BEREICH = eINSTANCE.getSonstiger_Punkt_IDBeginnBereich();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Start_Signal_Charakter_TypeClassImpl <em>Start Signal Charakter Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.Start_Signal_Charakter_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getStart_Signal_Charakter_TypeClass()
		 * @generated
		 */
		EClass START_SIGNAL_CHARAKTER_TYPE_CLASS = eINSTANCE.getStart_Signal_Charakter_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_SIGNAL_CHARAKTER_TYPE_CLASS__WERT = eINSTANCE.getStart_Signal_Charakter_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMAufloesungSspZielgleis <em>ENUM Aufloesung Ssp Zielgleis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMAufloesungSspZielgleis
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMAufloesungSspZielgleis()
		 * @generated
		 */
		EEnum ENUM_AUFLOESUNG_SSP_ZIELGLEIS = eINSTANCE.getENUMAufloesungSspZielgleis();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMAutomatischeEinstellung <em>ENUM Automatische Einstellung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMAutomatischeEinstellung
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMAutomatischeEinstellung()
		 * @generated
		 */
		EEnum ENUM_AUTOMATISCHE_EINSTELLUNG = eINSTANCE.getENUMAutomatischeEinstellung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrMittelArt <em>ENUM Fstr Mittel Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrMittelArt
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMFstrMittelArt()
		 * @generated
		 */
		EEnum ENUM_FSTR_MITTEL_ART = eINSTANCE.getENUMFstrMittelArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrRangierArt <em>ENUM Fstr Rangier Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrRangierArt
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMFstrRangierArt()
		 * @generated
		 */
		EEnum ENUM_FSTR_RANGIER_ART = eINSTANCE.getENUMFstrRangierArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrZugArt <em>ENUM Fstr Zug Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrZugArt
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMFstrZugArt()
		 * @generated
		 */
		EEnum ENUM_FSTR_ZUG_ART = eINSTANCE.getENUMFstrZugArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMRangierGegenfahrtausschluss <em>ENUM Rangier Gegenfahrtausschluss</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMRangierGegenfahrtausschluss
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMRangierGegenfahrtausschluss()
		 * @generated
		 */
		EEnum ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS = eINSTANCE.getENUMRangierGegenfahrtausschluss();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Fahrstrasse.ENUMStartSignalCharakter <em>ENUM Start Signal Charakter</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMStartSignalCharakter
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMStartSignalCharakter()
		 * @generated
		 */
		EEnum ENUM_START_SIGNAL_CHARAKTER = eINSTANCE.getENUMStartSignalCharakter();

		/**
		 * The meta object literal for the '<em>Aufloesung Verzoegerung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getAufloesung_Verzoegerung_Type()
		 * @generated
		 */
		EDataType AUFLOESUNG_VERZOEGERUNG_TYPE = eINSTANCE.getAufloesung_Verzoegerung_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung Fstr DWeg Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getBezeichnung_Fstr_DWeg_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_FSTR_DWEG_TYPE = eINSTANCE.getBezeichnung_Fstr_DWeg_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung Markanter Punkt Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getBezeichnung_Markanter_Punkt_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_MARKANTER_PUNKT_TYPE = eINSTANCE.getBezeichnung_Markanter_Punkt_Type();

		/**
		 * The meta object literal for the '<em>DWeg Reihenfolge Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getDWeg_Reihenfolge_Type()
		 * @generated
		 */
		EDataType DWEG_REIHENFOLGE_TYPE = eINSTANCE.getDWeg_Reihenfolge_Type();

		/**
		 * The meta object literal for the '<em>DWeg VType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getDWeg_V_Type()
		 * @generated
		 */
		EDataType DWEG_VTYPE = eINSTANCE.getDWeg_V_Type();

		/**
		 * The meta object literal for the '<em>ENUM Aufloesung Ssp Zielgleis Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMAufloesungSspZielgleis
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMAufloesungSspZielgleisObject()
		 * @generated
		 */
		EDataType ENUM_AUFLOESUNG_SSP_ZIELGLEIS_OBJECT = eINSTANCE.getENUMAufloesungSspZielgleisObject();

		/**
		 * The meta object literal for the '<em>ENUM Automatische Einstellung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMAutomatischeEinstellung
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMAutomatischeEinstellungObject()
		 * @generated
		 */
		EDataType ENUM_AUTOMATISCHE_EINSTELLUNG_OBJECT = eINSTANCE.getENUMAutomatischeEinstellungObject();

		/**
		 * The meta object literal for the '<em>ENUM Fstr Mittel Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrMittelArt
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMFstrMittelArtObject()
		 * @generated
		 */
		EDataType ENUM_FSTR_MITTEL_ART_OBJECT = eINSTANCE.getENUMFstrMittelArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Fstr Rangier Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrRangierArt
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMFstrRangierArtObject()
		 * @generated
		 */
		EDataType ENUM_FSTR_RANGIER_ART_OBJECT = eINSTANCE.getENUMFstrRangierArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Fstr Zug Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMFstrZugArt
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMFstrZugArtObject()
		 * @generated
		 */
		EDataType ENUM_FSTR_ZUG_ART_OBJECT = eINSTANCE.getENUMFstrZugArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Rangier Gegenfahrtausschluss Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMRangierGegenfahrtausschluss
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMRangierGegenfahrtausschlussObject()
		 * @generated
		 */
		EDataType ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_OBJECT = eINSTANCE.getENUMRangierGegenfahrtausschlussObject();

		/**
		 * The meta object literal for the '<em>ENUM Start Signal Charakter Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.ENUMStartSignalCharakter
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getENUMStartSignalCharakterObject()
		 * @generated
		 */
		EDataType ENUM_START_SIGNAL_CHARAKTER_OBJECT = eINSTANCE.getENUMStartSignalCharakterObject();

		/**
		 * The meta object literal for the '<em>Fstr Aneinander Bedienstring Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Aneinander_Bedienstring_Type()
		 * @generated
		 */
		EDataType FSTR_ANEINANDER_BEDIENSTRING_TYPE = eINSTANCE.getFstr_Aneinander_Bedienstring_Type();

		/**
		 * The meta object literal for the '<em>Fstr Bedienstring Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Bedienstring_Type()
		 * @generated
		 */
		EDataType FSTR_BEDIENSTRING_TYPE = eINSTANCE.getFstr_Bedienstring_Type();

		/**
		 * The meta object literal for the '<em>Fstr Reihenfolge Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_Reihenfolge_Type()
		 * @generated
		 */
		EDataType FSTR_REIHENFOLGE_TYPE = eINSTANCE.getFstr_Reihenfolge_Type();

		/**
		 * The meta object literal for the '<em>Fstr VHg Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_V_Hg_Type()
		 * @generated
		 */
		EDataType FSTR_VHG_TYPE = eINSTANCE.getFstr_V_Hg_Type();

		/**
		 * The meta object literal for the '<em>Fstr VType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getFstr_V_Type()
		 * @generated
		 */
		EDataType FSTR_VTYPE = eINSTANCE.getFstr_V_Type();

		/**
		 * The meta object literal for the '<em>Laenge Soll Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getLaenge_Soll_Type()
		 * @generated
		 */
		EDataType LAENGE_SOLL_TYPE = eINSTANCE.getLaenge_Soll_Type();

		/**
		 * The meta object literal for the '<em>Massgebende Neigung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl#getMassgebende_Neigung_Type()
		 * @generated
		 */
		EDataType MASSGEBENDE_NEIGUNG_TYPE = eINSTANCE.getMassgebende_Neigung_Type();

	}

} //FahrstrassePackage
