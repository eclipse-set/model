/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Weichen_und_Gleissperren;

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
 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenFactory
 * @model kind="package"
 * @generated
 */
public interface Weichen_und_GleissperrenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Weichen_und_Gleissperren";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Weichen_und_Gleissperren/1.10.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsWeichen_und_Gleissperren";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Weichen_und_GleissperrenPackage eINSTANCE = org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Auffahrortung_TypeClassImpl <em>Auffahrortung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Auffahrortung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getAuffahrortung_TypeClass()
	 * @generated
	 */
	int AUFFAHRORTUNG_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFFAHRORTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFFAHRORTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auffahrortung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFFAHRORTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Austausch_Antriebe_TypeClassImpl <em>Austausch Antriebe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Austausch_Antriebe_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getAustausch_Antriebe_TypeClass()
	 * @generated
	 */
	int AUSTAUSCH_ANTRIEBE_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSTAUSCH_ANTRIEBE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSTAUSCH_ANTRIEBE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Austausch Antriebe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSTAUSCH_ANTRIEBE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Auswurfrichtung_TypeClassImpl <em>Auswurfrichtung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Auswurfrichtung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getAuswurfrichtung_TypeClass()
	 * @generated
	 */
	int AUSWURFRICHTUNG_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSWURFRICHTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSWURFRICHTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auswurfrichtung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSWURFRICHTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Besonderes_Fahrwegelement_TypeClassImpl <em>Besonderes Fahrwegelement Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Besonderes_Fahrwegelement_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getBesonderes_Fahrwegelement_TypeClass()
	 * @generated
	 */
	int BESONDERES_FAHRWEGELEMENT_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESONDERES_FAHRWEGELEMENT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESONDERES_FAHRWEGELEMENT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Besonderes Fahrwegelement Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESONDERES_FAHRWEGELEMENT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Elektrischer_Antrieb_Anzahl_TypeClassImpl <em>Elektrischer Antrieb Anzahl Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Elektrischer_Antrieb_Anzahl_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getElektrischer_Antrieb_Anzahl_TypeClass()
	 * @generated
	 */
	int ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elektrischer Antrieb Anzahl Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Elektrischer_Antrieb_Lage_TypeClassImpl <em>Elektrischer Antrieb Lage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Elektrischer_Antrieb_Lage_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getElektrischer_Antrieb_Lage_TypeClass()
	 * @generated
	 */
	int ELEKTRISCHER_ANTRIEB_LAGE_TYPE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEKTRISCHER_ANTRIEB_LAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEKTRISCHER_ANTRIEB_LAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elektrischer Antrieb Lage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEKTRISCHER_ANTRIEB_LAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Element_Lage_TypeClassImpl <em>Element Lage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Element_Lage_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getElement_Lage_TypeClass()
	 * @generated
	 */
	int ELEMENT_LAGE_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Lage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Entgleisungsschuh_AttributeGroupImpl <em>Entgleisungsschuh Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Entgleisungsschuh_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getEntgleisungsschuh_AttributeGroup()
	 * @generated
	 */
	int ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Auswurfrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__AUSWURFRICHTUNG = 0;

	/**
	 * The feature id for the '<em><b>Gleissperrensignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__GLEISSPERRENSIGNAL = 1;

	/**
	 * The feature id for the '<em><b>Schutzschiene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__SCHUTZSCHIENE = 2;

	/**
	 * The number of structural features of the '<em>Entgleisungsschuh Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Geschwindigkeit_L_TypeClassImpl <em>Geschwindigkeit LType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Geschwindigkeit_L_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGeschwindigkeit_L_TypeClass()
	 * @generated
	 */
	int GESCHWINDIGKEIT_LTYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEIT_LTYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEIT_LTYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geschwindigkeit LType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEIT_LTYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Geschwindigkeit_R_TypeClassImpl <em>Geschwindigkeit RType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Geschwindigkeit_R_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGeschwindigkeit_R_TypeClass()
	 * @generated
	 */
	int GESCHWINDIGKEIT_RTYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEIT_RTYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEIT_RTYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geschwindigkeit RType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEIT_RTYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleis_AbschlussImpl <em>Gleis Abschluss</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleis_AbschlussImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGleis_Abschluss()
	 * @generated
	 */
	int GLEIS_ABSCHLUSS = 10;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHLUSS__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHLUSS__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHLUSS__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHLUSS__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.PUNKT_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHLUSS__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHLUSS__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHLUSS__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>Gleis Abschluss Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHLUSS__GLEIS_ABSCHLUSS_ART = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gleis Abschluss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHLUSS_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleis_Abschluss_Art_TypeClassImpl <em>Gleis Abschluss Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleis_Abschluss_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGleis_Abschluss_Art_TypeClass()
	 * @generated
	 */
	int GLEIS_ABSCHLUSS_ART_TYPE_CLASS = 11;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHLUSS_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHLUSS_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gleis Abschluss Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHLUSS_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperre_Betriebsart_TypeClassImpl <em>Gleissperre Betriebsart Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperre_Betriebsart_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGleissperre_Betriebsart_TypeClass()
	 * @generated
	 */
	int GLEISSPERRE_BETRIEBSART_TYPE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISSPERRE_BETRIEBSART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISSPERRE_BETRIEBSART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gleissperre Betriebsart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISSPERRE_BETRIEBSART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperre_Element_AttributeGroupImpl <em>Gleissperre Element Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperre_Element_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGleissperre_Element_AttributeGroup()
	 * @generated
	 */
	int GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP = 13;

	/**
	 * The feature id for the '<em><b>Gleissperre Betriebsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_BETRIEBSART = 0;

	/**
	 * The feature id for the '<em><b>Gleissperre Vorzugslage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_VORZUGSLAGE = 1;

	/**
	 * The number of structural features of the '<em>Gleissperre Element Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperre_Vorzugslage_TypeClassImpl <em>Gleissperre Vorzugslage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperre_Vorzugslage_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGleissperre_Vorzugslage_TypeClass()
	 * @generated
	 */
	int GLEISSPERRE_VORZUGSLAGE_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISSPERRE_VORZUGSLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISSPERRE_VORZUGSLAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gleissperre Vorzugslage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISSPERRE_VORZUGSLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperrensignal_TypeClassImpl <em>Gleissperrensignal Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperrensignal_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGleissperrensignal_TypeClass()
	 * @generated
	 */
	int GLEISSPERRENSIGNAL_TYPE_CLASS = 15;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISSPERRENSIGNAL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISSPERRENSIGNAL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gleissperrensignal Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISSPERRENSIGNAL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.GZ_Freimeldung_L_AttributeGroupImpl <em>GZ Freimeldung LAttribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.GZ_Freimeldung_L_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGZ_Freimeldung_L_AttributeGroup()
	 * @generated
	 */
	int GZ_FREIMELDUNG_LATTRIBUTE_GROUP = 16;

	/**
	 * The feature id for the '<em><b>Element Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ELEMENT_LAGE = 0;

	/**
	 * The feature id for the '<em><b>ID Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ID_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>GZ Freimeldung LAttribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GZ_FREIMELDUNG_LATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.GZ_Freimeldung_R_AttributeGroupImpl <em>GZ Freimeldung RAttribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.GZ_Freimeldung_R_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGZ_Freimeldung_R_AttributeGroup()
	 * @generated
	 */
	int GZ_FREIMELDUNG_RATTRIBUTE_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Element Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ELEMENT_LAGE = 0;

	/**
	 * The feature id for the '<em><b>ID Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ID_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>GZ Freimeldung RAttribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GZ_FREIMELDUNG_RATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Herzstueck_Antriebe_TypeClassImpl <em>Herzstueck Antriebe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Herzstueck_Antriebe_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getHerzstueck_Antriebe_TypeClass()
	 * @generated
	 */
	int HERZSTUECK_ANTRIEBE_TYPE_CLASS = 18;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERZSTUECK_ANTRIEBE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERZSTUECK_ANTRIEBE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Herzstueck Antriebe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERZSTUECK_ANTRIEBE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Isolierfall_TypeClassImpl <em>Isolierfall Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Isolierfall_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getIsolierfall_TypeClass()
	 * @generated
	 */
	int ISOLIERFALL_TYPE_CLASS = 19;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOLIERFALL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOLIERFALL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Isolierfall Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOLIERFALL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Kr_KrW_Seitenzuordnung_TypeClassImpl <em>Kr Kr WSeitenzuordnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Kr_KrW_Seitenzuordnung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getKr_KrW_Seitenzuordnung_TypeClass()
	 * @generated
	 */
	int KR_KR_WSEITENZUORDNUNG_TYPE_CLASS = 20;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KR_KR_WSEITENZUORDNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KR_KR_WSEITENZUORDNUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kr Kr WSeitenzuordnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KR_KR_WSEITENZUORDNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Kreuzung_AttributeGroupImpl <em>Kreuzung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Kreuzung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getKreuzung_AttributeGroup()
	 * @generated
	 */
	int KREUZUNG_ATTRIBUTE_GROUP = 21;

	/**
	 * The feature id for the '<em><b>Elektrischer Antrieb Anzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREUZUNG_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL = 0;

	/**
	 * The feature id for the '<em><b>Elektrischer Antrieb Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREUZUNG_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE = 1;

	/**
	 * The feature id for the '<em><b>Geschwindigkeit L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREUZUNG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L = 2;

	/**
	 * The feature id for the '<em><b>Geschwindigkeit R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREUZUNG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R = 3;

	/**
	 * The number of structural features of the '<em>Kreuzung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREUZUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Kreuzungsgleis_TypeClassImpl <em>Kreuzungsgleis Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Kreuzungsgleis_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getKreuzungsgleis_TypeClass()
	 * @generated
	 */
	int KREUZUNGSGLEIS_TYPE_CLASS = 22;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREUZUNGSGLEIS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREUZUNGSGLEIS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kreuzungsgleis Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREUZUNGSGLEIS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Schutzschiene_TypeClassImpl <em>Schutzschiene Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Schutzschiene_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getSchutzschiene_TypeClass()
	 * @generated
	 */
	int SCHUTZSCHIENE_TYPE_CLASS = 23;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUTZSCHIENE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUTZSCHIENE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schutzschiene Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUTZSCHIENE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Stammgleis_TypeClassImpl <em>Stammgleis Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Stammgleis_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getStammgleis_TypeClass()
	 * @generated
	 */
	int STAMMGLEIS_TYPE_CLASS = 24;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAMMGLEIS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAMMGLEIS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stammgleis Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAMMGLEIS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Vorzugslage_Automatik_TypeClassImpl <em>Vorzugslage Automatik Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Vorzugslage_Automatik_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getVorzugslage_Automatik_TypeClass()
	 * @generated
	 */
	int VORZUGSLAGE_AUTOMATIK_TYPE_CLASS = 25;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORZUGSLAGE_AUTOMATIK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORZUGSLAGE_AUTOMATIK_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vorzugslage Automatik Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORZUGSLAGE_AUTOMATIK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_AnlageImpl <em>WKr Anlage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_AnlageImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Anlage()
	 * @generated
	 */
	int WKR_ANLAGE = 26;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ANLAGE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ANLAGE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ANLAGE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ANLAGE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ANLAGE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Anhang DWS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ANLAGE__ID_ANHANG_DWS = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ANLAGE__ID_SIGNAL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>WKr Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ANLAGE__WKR_ANLAGE_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>WKr Anlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ANLAGE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Anlage_Allg_AttributeGroupImpl <em>WKr Anlage Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Anlage_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	int WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP = 27;

	/**
	 * The feature id for the '<em><b>Isolierfall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__ISOLIERFALL = 0;

	/**
	 * The feature id for the '<em><b>WKr Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_ART = 1;

	/**
	 * The feature id for the '<em><b>WKr Grundform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_GRUNDFORM = 2;

	/**
	 * The number of structural features of the '<em>WKr Anlage Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Art_TypeClassImpl <em>WKr Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Art_TypeClass()
	 * @generated
	 */
	int WKR_ART_TYPE_CLASS = 28;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WKr Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Grundform_TypeClassImpl <em>WKr Grundform Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Grundform_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Grundform_TypeClass()
	 * @generated
	 */
	int WKR_GRUNDFORM_TYPE_CLASS = 29;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GRUNDFORM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GRUNDFORM_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WKr Grundform Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GRUNDFORM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl <em>WKr Gsp Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Gsp_Element()
	 * @generated
	 */
	int WKR_GSP_ELEMENT = 30;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Regelzeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT__ID_REGELZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Stellelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT__ID_STELLELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>IDW Kr Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT__IDW_KR_ANLAGE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ID Weichenlaufkette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>WKr Gsp Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gleissperre Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Weiche Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT__WEICHE_ELEMENT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>WKr Gsp Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_Element_Allg_AttributeGroupImpl <em>WKr Gsp Element Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_Element_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Gsp_Element_Allg_AttributeGroup()
	 * @generated
	 */
	int WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP = 31;

	/**
	 * The feature id for the '<em><b>Kr Kr WSeitenzuordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__KR_KR_WSEITENZUORDNUNG = 0;

	/**
	 * The feature id for the '<em><b>Vorzugslage Automatik</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORZUGSLAGE_AUTOMATIK = 1;

	/**
	 * The feature id for the '<em><b>WKr Gsp Stellart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__WKR_GSP_STELLART = 2;

	/**
	 * The number of structural features of the '<em>WKr Gsp Element Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_KomponenteImpl <em>WKr Gsp Komponente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_KomponenteImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Gsp_Komponente()
	 * @generated
	 */
	int WKR_GSP_KOMPONENTE = 32;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.PUNKT_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>Austausch Antriebe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__AUSTAUSCH_ANTRIEBE = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Regelzeichnung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__ID_REGELZEICHNUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDW Kr Gsp Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__IDW_KR_GSP_ELEMENT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Besonderes Fahrwegelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entgleisungsschuh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Kreuzung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__KREUZUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Zungenpaar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE__ZUNGENPAAR = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>WKr Gsp Komponente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_KOMPONENTE_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_Stellart_TypeClassImpl <em>WKr Gsp Stellart Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_Stellart_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Gsp_Stellart_TypeClass()
	 * @generated
	 */
	int WKR_GSP_STELLART_TYPE_CLASS = 33;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_STELLART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_STELLART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WKr Gsp Stellart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WKR_GSP_STELLART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weiche_Betriebsart_TypeClassImpl <em>Weiche Betriebsart Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weiche_Betriebsart_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeiche_Betriebsart_TypeClass()
	 * @generated
	 */
	int WEICHE_BETRIEBSART_TYPE_CLASS = 34;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_BETRIEBSART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_BETRIEBSART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weiche Betriebsart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_BETRIEBSART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weiche_Element_AttributeGroupImpl <em>Weiche Element Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weiche_Element_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeiche_Element_AttributeGroup()
	 * @generated
	 */
	int WEICHE_ELEMENT_ATTRIBUTE_GROUP = 35;

	/**
	 * The feature id for the '<em><b>Auffahrortung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG = 0;

	/**
	 * The feature id for the '<em><b>GZ Freimeldung L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L = 1;

	/**
	 * The feature id for the '<em><b>GZ Freimeldung R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R = 2;

	/**
	 * The feature id for the '<em><b>ID Grenzzeichen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_GRENZZEICHEN = 3;

	/**
	 * The feature id for the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_SIGNAL = 4;

	/**
	 * The feature id for the '<em><b>Weiche Betriebsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART = 5;

	/**
	 * The feature id for the '<em><b>Weiche Vorzugslage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE = 6;

	/**
	 * The number of structural features of the '<em>Weiche Element Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_ELEMENT_ATTRIBUTE_GROUP_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weiche_Vorzugslage_TypeClassImpl <em>Weiche Vorzugslage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weiche_Vorzugslage_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeiche_Vorzugslage_TypeClass()
	 * @generated
	 */
	int WEICHE_VORZUGSLAGE_TYPE_CLASS = 36;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_VORZUGSLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_VORZUGSLAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weiche Vorzugslage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHE_VORZUGSLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.WeichenlaufketteImpl <em>Weichenlaufkette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.WeichenlaufketteImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeichenlaufkette()
	 * @generated
	 */
	int WEICHENLAUFKETTE = 37;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weichenlaufkette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichenlaufkette_ZuordnungImpl <em>Weichenlaufkette Zuordnung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichenlaufkette_ZuordnungImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeichenlaufkette_Zuordnung()
	 * @generated
	 */
	int WEICHENLAUFKETTE_ZUORDNUNG = 38;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE_ZUORDNUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE_ZUORDNUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE_ZUORDNUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE_ZUORDNUNG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE_ZUORDNUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Weichenlaufkette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weichenlaufkette Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENLAUFKETTE_ZUORDNUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichensignal_TypeClassImpl <em>Weichensignal Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichensignal_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeichensignal_TypeClass()
	 * @generated
	 */
	int WEICHENSIGNAL_TYPE_CLASS = 39;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENSIGNAL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENSIGNAL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weichensignal Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEICHENSIGNAL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Zungenpaar_AttributeGroupImpl <em>Zungenpaar Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Zungenpaar_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getZungenpaar_AttributeGroup()
	 * @generated
	 */
	int ZUNGENPAAR_ATTRIBUTE_GROUP = 40;

	/**
	 * The feature id for the '<em><b>Elektrischer Antrieb Anzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL = 0;

	/**
	 * The feature id for the '<em><b>Elektrischer Antrieb Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE = 1;

	/**
	 * The feature id for the '<em><b>Geschwindigkeit L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L = 2;

	/**
	 * The feature id for the '<em><b>Geschwindigkeit R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R = 3;

	/**
	 * The feature id for the '<em><b>Herzstueck Antriebe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUNGENPAAR_ATTRIBUTE_GROUP__HERZSTUECK_ANTRIEBE = 4;

	/**
	 * The feature id for the '<em><b>Kreuzungsgleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUNGENPAAR_ATTRIBUTE_GROUP__KREUZUNGSGLEIS = 5;

	/**
	 * The feature id for the '<em><b>Stammgleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUNGENPAAR_ATTRIBUTE_GROUP__STAMMGLEIS = 6;

	/**
	 * The feature id for the '<em><b>Weichensignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUNGENPAAR_ATTRIBUTE_GROUP__WEICHENSIGNAL = 7;

	/**
	 * The feature id for the '<em><b>Zungenpruefkontakt Anzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUNGENPAAR_ATTRIBUTE_GROUP__ZUNGENPRUEFKONTAKT_ANZAHL = 8;

	/**
	 * The number of structural features of the '<em>Zungenpaar Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUNGENPAAR_ATTRIBUTE_GROUP_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Zungenpruefkontakt_Anzahl_TypeClassImpl <em>Zungenpruefkontakt Anzahl Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Zungenpruefkontakt_Anzahl_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getZungenpruefkontakt_Anzahl_TypeClass()
	 * @generated
	 */
	int ZUNGENPRUEFKONTAKT_ANZAHL_TYPE_CLASS = 41;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUNGENPRUEFKONTAKT_ANZAHL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUNGENPRUEFKONTAKT_ANZAHL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zungenpruefkontakt Anzahl Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUNGENPRUEFKONTAKT_ANZAHL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMBesonderesFahrwegelement <em>ENUM Besonderes Fahrwegelement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMBesonderesFahrwegelement
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMBesonderesFahrwegelement()
	 * @generated
	 */
	int ENUM_BESONDERES_FAHRWEGELEMENT = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElektrischerAntriebLage <em>ENUM Elektrischer Antrieb Lage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElektrischerAntriebLage
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMElektrischerAntriebLage()
	 * @generated
	 */
	int ENUM_ELEKTRISCHER_ANTRIEB_LAGE = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElementLage <em>ENUM Element Lage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElementLage
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMElementLage()
	 * @generated
	 */
	int ENUM_ELEMENT_LAGE = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleisAbschlussArt <em>ENUM Gleis Abschluss Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleisAbschlussArt
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleisAbschlussArt()
	 * @generated
	 */
	int ENUM_GLEIS_ABSCHLUSS_ART = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreBetriebsart <em>ENUM Gleissperre Betriebsart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreBetriebsart
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleissperreBetriebsart()
	 * @generated
	 */
	int ENUM_GLEISSPERRE_BETRIEBSART = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperrensignal <em>ENUM Gleissperrensignal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperrensignal
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleissperrensignal()
	 * @generated
	 */
	int ENUM_GLEISSPERRENSIGNAL = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreVorzugslage <em>ENUM Gleissperre Vorzugslage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreVorzugslage
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleissperreVorzugslage()
	 * @generated
	 */
	int ENUM_GLEISSPERRE_VORZUGSLAGE = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeicheBetriebsart <em>ENUM Weiche Betriebsart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeicheBetriebsart
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWeicheBetriebsart()
	 * @generated
	 */
	int ENUM_WEICHE_BETRIEBSART = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeichensignal <em>ENUM Weichensignal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeichensignal
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWeichensignal()
	 * @generated
	 */
	int ENUM_WEICHENSIGNAL = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrArt <em>ENUMW Kr Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrArt
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWKrArt()
	 * @generated
	 */
	int ENUMW_KR_ART = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrGspStellart <em>ENUMW Kr Gsp Stellart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrGspStellart
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWKrGspStellart()
	 * @generated
	 */
	int ENUMW_KR_GSP_STELLART = 52;

	/**
	 * The meta object id for the '<em>CAuswurfrichtung</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getCAuswurfrichtung()
	 * @generated
	 */
	int CAUSWURFRICHTUNG = 53;

	/**
	 * The meta object id for the '<em>Elektrischer Antrieb Anzahl Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getElektrischer_Antrieb_Anzahl_Type()
	 * @generated
	 */
	int ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE = 54;

	/**
	 * The meta object id for the '<em>ENUM Besonderes Fahrwegelement Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMBesonderesFahrwegelement
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMBesonderesFahrwegelementObject()
	 * @generated
	 */
	int ENUM_BESONDERES_FAHRWEGELEMENT_OBJECT = 55;

	/**
	 * The meta object id for the '<em>ENUM Elektrischer Antrieb Lage Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElektrischerAntriebLage
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMElektrischerAntriebLageObject()
	 * @generated
	 */
	int ENUM_ELEKTRISCHER_ANTRIEB_LAGE_OBJECT = 56;

	/**
	 * The meta object id for the '<em>ENUM Element Lage Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElementLage
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMElementLageObject()
	 * @generated
	 */
	int ENUM_ELEMENT_LAGE_OBJECT = 57;

	/**
	 * The meta object id for the '<em>ENUM Gleis Abschluss Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleisAbschlussArt
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleisAbschlussArtObject()
	 * @generated
	 */
	int ENUM_GLEIS_ABSCHLUSS_ART_OBJECT = 58;

	/**
	 * The meta object id for the '<em>ENUM Gleissperre Betriebsart Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreBetriebsart
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleissperreBetriebsartObject()
	 * @generated
	 */
	int ENUM_GLEISSPERRE_BETRIEBSART_OBJECT = 59;

	/**
	 * The meta object id for the '<em>ENUM Gleissperrensignal Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperrensignal
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleissperrensignalObject()
	 * @generated
	 */
	int ENUM_GLEISSPERRENSIGNAL_OBJECT = 60;

	/**
	 * The meta object id for the '<em>ENUM Gleissperre Vorzugslage Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreVorzugslage
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleissperreVorzugslageObject()
	 * @generated
	 */
	int ENUM_GLEISSPERRE_VORZUGSLAGE_OBJECT = 61;

	/**
	 * The meta object id for the '<em>ENUM Weiche Betriebsart Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeicheBetriebsart
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWeicheBetriebsartObject()
	 * @generated
	 */
	int ENUM_WEICHE_BETRIEBSART_OBJECT = 62;

	/**
	 * The meta object id for the '<em>ENUM Weichensignal Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeichensignal
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWeichensignalObject()
	 * @generated
	 */
	int ENUM_WEICHENSIGNAL_OBJECT = 63;

	/**
	 * The meta object id for the '<em>ENUMW Kr Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrArt
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWKrArtObject()
	 * @generated
	 */
	int ENUMW_KR_ART_OBJECT = 64;

	/**
	 * The meta object id for the '<em>ENUMW Kr Gsp Stellart Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrGspStellart
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWKrGspStellartObject()
	 * @generated
	 */
	int ENUMW_KR_GSP_STELLART_OBJECT = 65;

	/**
	 * The meta object id for the '<em>Geschwindigkeit LType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGeschwindigkeit_L_Type()
	 * @generated
	 */
	int GESCHWINDIGKEIT_LTYPE = 66;

	/**
	 * The meta object id for the '<em>Geschwindigkeit RType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGeschwindigkeit_R_Type()
	 * @generated
	 */
	int GESCHWINDIGKEIT_RTYPE = 67;

	/**
	 * The meta object id for the '<em>Herzstueck Antriebe Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getHerzstueck_Antriebe_Type()
	 * @generated
	 */
	int HERZSTUECK_ANTRIEBE_TYPE = 68;

	/**
	 * The meta object id for the '<em>Isolierfall Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getIsolierfall_Type()
	 * @generated
	 */
	int ISOLIERFALL_TYPE = 69;

	/**
	 * The meta object id for the '<em>Kr Kr WSeitenzuordnung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getKr_KrW_Seitenzuordnung_Type()
	 * @generated
	 */
	int KR_KR_WSEITENZUORDNUNG_TYPE = 70;

	/**
	 * The meta object id for the '<em>Kreuzungsgleis Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getKreuzungsgleis_Type()
	 * @generated
	 */
	int KREUZUNGSGLEIS_TYPE = 71;

	/**
	 * The meta object id for the '<em>Stammgleis Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getStammgleis_Type()
	 * @generated
	 */
	int STAMMGLEIS_TYPE = 72;

	/**
	 * The meta object id for the '<em>WKr Grundform Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Grundform_Type()
	 * @generated
	 */
	int WKR_GRUNDFORM_TYPE = 73;

	/**
	 * The meta object id for the '<em>Weiche Vorzugslage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeiche_Vorzugslage_Type()
	 * @generated
	 */
	int WEICHE_VORZUGSLAGE_TYPE = 74;

	/**
	 * The meta object id for the '<em>Zungenpruefkontakt Anzahl Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getZungenpruefkontakt_Anzahl_Type()
	 * @generated
	 */
	int ZUNGENPRUEFKONTAKT_ANZAHL_TYPE = 75;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Auffahrortung_TypeClass <em>Auffahrortung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auffahrortung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Auffahrortung_TypeClass
	 * @generated
	 */
	EClass getAuffahrortung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Auffahrortung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Auffahrortung_TypeClass#getWert()
	 * @see #getAuffahrortung_TypeClass()
	 * @generated
	 */
	EAttribute getAuffahrortung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Austausch_Antriebe_TypeClass <em>Austausch Antriebe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Austausch Antriebe Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Austausch_Antriebe_TypeClass
	 * @generated
	 */
	EClass getAustausch_Antriebe_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Austausch_Antriebe_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Austausch_Antriebe_TypeClass#getWert()
	 * @see #getAustausch_Antriebe_TypeClass()
	 * @generated
	 */
	EAttribute getAustausch_Antriebe_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Auswurfrichtung_TypeClass <em>Auswurfrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auswurfrichtung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Auswurfrichtung_TypeClass
	 * @generated
	 */
	EClass getAuswurfrichtung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Auswurfrichtung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Auswurfrichtung_TypeClass#getWert()
	 * @see #getAuswurfrichtung_TypeClass()
	 * @generated
	 */
	EAttribute getAuswurfrichtung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Besonderes_Fahrwegelement_TypeClass <em>Besonderes Fahrwegelement Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Besonderes Fahrwegelement Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Besonderes_Fahrwegelement_TypeClass
	 * @generated
	 */
	EClass getBesonderes_Fahrwegelement_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Besonderes_Fahrwegelement_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Besonderes_Fahrwegelement_TypeClass#getWert()
	 * @see #getBesonderes_Fahrwegelement_TypeClass()
	 * @generated
	 */
	EAttribute getBesonderes_Fahrwegelement_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Elektrischer_Antrieb_Anzahl_TypeClass <em>Elektrischer Antrieb Anzahl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elektrischer Antrieb Anzahl Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Elektrischer_Antrieb_Anzahl_TypeClass
	 * @generated
	 */
	EClass getElektrischer_Antrieb_Anzahl_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Elektrischer_Antrieb_Anzahl_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Elektrischer_Antrieb_Anzahl_TypeClass#getWert()
	 * @see #getElektrischer_Antrieb_Anzahl_TypeClass()
	 * @generated
	 */
	EAttribute getElektrischer_Antrieb_Anzahl_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Elektrischer_Antrieb_Lage_TypeClass <em>Elektrischer Antrieb Lage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elektrischer Antrieb Lage Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Elektrischer_Antrieb_Lage_TypeClass
	 * @generated
	 */
	EClass getElektrischer_Antrieb_Lage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Elektrischer_Antrieb_Lage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Elektrischer_Antrieb_Lage_TypeClass#getWert()
	 * @see #getElektrischer_Antrieb_Lage_TypeClass()
	 * @generated
	 */
	EAttribute getElektrischer_Antrieb_Lage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Element_Lage_TypeClass <em>Element Lage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Lage Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Element_Lage_TypeClass
	 * @generated
	 */
	EClass getElement_Lage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Element_Lage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Element_Lage_TypeClass#getWert()
	 * @see #getElement_Lage_TypeClass()
	 * @generated
	 */
	EAttribute getElement_Lage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup <em>Entgleisungsschuh Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entgleisungsschuh Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup
	 * @generated
	 */
	EClass getEntgleisungsschuh_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup#getAuswurfrichtung <em>Auswurfrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auswurfrichtung</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup#getAuswurfrichtung()
	 * @see #getEntgleisungsschuh_AttributeGroup()
	 * @generated
	 */
	EReference getEntgleisungsschuh_AttributeGroup_Auswurfrichtung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup#getGleissperrensignal <em>Gleissperrensignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gleissperrensignal</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup#getGleissperrensignal()
	 * @see #getEntgleisungsschuh_AttributeGroup()
	 * @generated
	 */
	EReference getEntgleisungsschuh_AttributeGroup_Gleissperrensignal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup#getSchutzschiene <em>Schutzschiene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schutzschiene</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup#getSchutzschiene()
	 * @see #getEntgleisungsschuh_AttributeGroup()
	 * @generated
	 */
	EReference getEntgleisungsschuh_AttributeGroup_Schutzschiene();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Geschwindigkeit_L_TypeClass <em>Geschwindigkeit LType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geschwindigkeit LType Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Geschwindigkeit_L_TypeClass
	 * @generated
	 */
	EClass getGeschwindigkeit_L_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Geschwindigkeit_L_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Geschwindigkeit_L_TypeClass#getWert()
	 * @see #getGeschwindigkeit_L_TypeClass()
	 * @generated
	 */
	EAttribute getGeschwindigkeit_L_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Geschwindigkeit_R_TypeClass <em>Geschwindigkeit RType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geschwindigkeit RType Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Geschwindigkeit_R_TypeClass
	 * @generated
	 */
	EClass getGeschwindigkeit_R_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Geschwindigkeit_R_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Geschwindigkeit_R_TypeClass#getWert()
	 * @see #getGeschwindigkeit_R_TypeClass()
	 * @generated
	 */
	EAttribute getGeschwindigkeit_R_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss <em>Gleis Abschluss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleis Abschluss</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss
	 * @generated
	 */
	EClass getGleis_Abschluss();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss#getGleisAbschlussArt <em>Gleis Abschluss Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gleis Abschluss Art</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss#getGleisAbschlussArt()
	 * @see #getGleis_Abschluss()
	 * @generated
	 */
	EReference getGleis_Abschluss_GleisAbschlussArt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss_Art_TypeClass <em>Gleis Abschluss Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleis Abschluss Art Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss_Art_TypeClass
	 * @generated
	 */
	EClass getGleis_Abschluss_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss_Art_TypeClass#getWert()
	 * @see #getGleis_Abschluss_Art_TypeClass()
	 * @generated
	 */
	EAttribute getGleis_Abschluss_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Betriebsart_TypeClass <em>Gleissperre Betriebsart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleissperre Betriebsart Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Betriebsart_TypeClass
	 * @generated
	 */
	EClass getGleissperre_Betriebsart_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Betriebsart_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Betriebsart_TypeClass#getWert()
	 * @see #getGleissperre_Betriebsart_TypeClass()
	 * @generated
	 */
	EAttribute getGleissperre_Betriebsart_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup <em>Gleissperre Element Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleissperre Element Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup
	 * @generated
	 */
	EClass getGleissperre_Element_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup#getGleissperreBetriebsart <em>Gleissperre Betriebsart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gleissperre Betriebsart</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup#getGleissperreBetriebsart()
	 * @see #getGleissperre_Element_AttributeGroup()
	 * @generated
	 */
	EReference getGleissperre_Element_AttributeGroup_GleissperreBetriebsart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup#getGleissperreVorzugslage <em>Gleissperre Vorzugslage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gleissperre Vorzugslage</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup#getGleissperreVorzugslage()
	 * @see #getGleissperre_Element_AttributeGroup()
	 * @generated
	 */
	EReference getGleissperre_Element_AttributeGroup_GleissperreVorzugslage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Vorzugslage_TypeClass <em>Gleissperre Vorzugslage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleissperre Vorzugslage Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Vorzugslage_TypeClass
	 * @generated
	 */
	EClass getGleissperre_Vorzugslage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Vorzugslage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperre_Vorzugslage_TypeClass#getWert()
	 * @see #getGleissperre_Vorzugslage_TypeClass()
	 * @generated
	 */
	EAttribute getGleissperre_Vorzugslage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperrensignal_TypeClass <em>Gleissperrensignal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleissperrensignal Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperrensignal_TypeClass
	 * @generated
	 */
	EClass getGleissperrensignal_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperrensignal_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleissperrensignal_TypeClass#getWert()
	 * @see #getGleissperrensignal_TypeClass()
	 * @generated
	 */
	EAttribute getGleissperrensignal_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_L_AttributeGroup <em>GZ Freimeldung LAttribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GZ Freimeldung LAttribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_L_AttributeGroup
	 * @generated
	 */
	EClass getGZ_Freimeldung_L_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_L_AttributeGroup#getElementLage <em>Element Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Lage</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_L_AttributeGroup#getElementLage()
	 * @see #getGZ_Freimeldung_L_AttributeGroup()
	 * @generated
	 */
	EReference getGZ_Freimeldung_L_AttributeGroup_ElementLage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_L_AttributeGroup#getIDElement <em>ID Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Element</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_L_AttributeGroup#getIDElement()
	 * @see #getGZ_Freimeldung_L_AttributeGroup()
	 * @generated
	 */
	EReference getGZ_Freimeldung_L_AttributeGroup_IDElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup <em>GZ Freimeldung RAttribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GZ Freimeldung RAttribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup
	 * @generated
	 */
	EClass getGZ_Freimeldung_R_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup#getElementLage <em>Element Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Lage</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup#getElementLage()
	 * @see #getGZ_Freimeldung_R_AttributeGroup()
	 * @generated
	 */
	EReference getGZ_Freimeldung_R_AttributeGroup_ElementLage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup#getIDElement <em>ID Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Element</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup#getIDElement()
	 * @see #getGZ_Freimeldung_R_AttributeGroup()
	 * @generated
	 */
	EReference getGZ_Freimeldung_R_AttributeGroup_IDElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Herzstueck_Antriebe_TypeClass <em>Herzstueck Antriebe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Herzstueck Antriebe Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Herzstueck_Antriebe_TypeClass
	 * @generated
	 */
	EClass getHerzstueck_Antriebe_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Herzstueck_Antriebe_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Herzstueck_Antriebe_TypeClass#getWert()
	 * @see #getHerzstueck_Antriebe_TypeClass()
	 * @generated
	 */
	EAttribute getHerzstueck_Antriebe_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Isolierfall_TypeClass <em>Isolierfall Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Isolierfall Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Isolierfall_TypeClass
	 * @generated
	 */
	EClass getIsolierfall_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Isolierfall_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Isolierfall_TypeClass#getWert()
	 * @see #getIsolierfall_TypeClass()
	 * @generated
	 */
	EAttribute getIsolierfall_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kr_KrW_Seitenzuordnung_TypeClass <em>Kr Kr WSeitenzuordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kr Kr WSeitenzuordnung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kr_KrW_Seitenzuordnung_TypeClass
	 * @generated
	 */
	EClass getKr_KrW_Seitenzuordnung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kr_KrW_Seitenzuordnung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kr_KrW_Seitenzuordnung_TypeClass#getWert()
	 * @see #getKr_KrW_Seitenzuordnung_TypeClass()
	 * @generated
	 */
	EAttribute getKr_KrW_Seitenzuordnung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup <em>Kreuzung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kreuzung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup
	 * @generated
	 */
	EClass getKreuzung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getElektrischerAntriebAnzahl <em>Elektrischer Antrieb Anzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elektrischer Antrieb Anzahl</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getElektrischerAntriebAnzahl()
	 * @see #getKreuzung_AttributeGroup()
	 * @generated
	 */
	EReference getKreuzung_AttributeGroup_ElektrischerAntriebAnzahl();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getElektrischerAntriebLage <em>Elektrischer Antrieb Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elektrischer Antrieb Lage</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getElektrischerAntriebLage()
	 * @see #getKreuzung_AttributeGroup()
	 * @generated
	 */
	EReference getKreuzung_AttributeGroup_ElektrischerAntriebLage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getGeschwindigkeitL <em>Geschwindigkeit L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschwindigkeit L</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getGeschwindigkeitL()
	 * @see #getKreuzung_AttributeGroup()
	 * @generated
	 */
	EReference getKreuzung_AttributeGroup_GeschwindigkeitL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getGeschwindigkeitR <em>Geschwindigkeit R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschwindigkeit R</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getGeschwindigkeitR()
	 * @see #getKreuzung_AttributeGroup()
	 * @generated
	 */
	EReference getKreuzung_AttributeGroup_GeschwindigkeitR();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzungsgleis_TypeClass <em>Kreuzungsgleis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kreuzungsgleis Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzungsgleis_TypeClass
	 * @generated
	 */
	EClass getKreuzungsgleis_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzungsgleis_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzungsgleis_TypeClass#getWert()
	 * @see #getKreuzungsgleis_TypeClass()
	 * @generated
	 */
	EAttribute getKreuzungsgleis_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Schutzschiene_TypeClass <em>Schutzschiene Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schutzschiene Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Schutzschiene_TypeClass
	 * @generated
	 */
	EClass getSchutzschiene_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Schutzschiene_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Schutzschiene_TypeClass#getWert()
	 * @see #getSchutzschiene_TypeClass()
	 * @generated
	 */
	EAttribute getSchutzschiene_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Stammgleis_TypeClass <em>Stammgleis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stammgleis Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Stammgleis_TypeClass
	 * @generated
	 */
	EClass getStammgleis_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Stammgleis_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Stammgleis_TypeClass#getWert()
	 * @see #getStammgleis_TypeClass()
	 * @generated
	 */
	EAttribute getStammgleis_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Vorzugslage_Automatik_TypeClass <em>Vorzugslage Automatik Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vorzugslage Automatik Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Vorzugslage_Automatik_TypeClass
	 * @generated
	 */
	EClass getVorzugslage_Automatik_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Vorzugslage_Automatik_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Vorzugslage_Automatik_TypeClass#getWert()
	 * @see #getVorzugslage_Automatik_TypeClass()
	 * @generated
	 */
	EAttribute getVorzugslage_Automatik_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage <em>WKr Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WKr Anlage</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage
	 * @generated
	 */
	EClass getW_Kr_Anlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage#getIDAnhangDWS <em>ID Anhang DWS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Anhang DWS</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage#getIDAnhangDWS()
	 * @see #getW_Kr_Anlage()
	 * @generated
	 */
	EReference getW_Kr_Anlage_IDAnhangDWS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage#getIDSignal <em>ID Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage#getIDSignal()
	 * @see #getW_Kr_Anlage()
	 * @generated
	 */
	EReference getW_Kr_Anlage_IDSignal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage#getWKrAnlageAllg <em>WKr Anlage Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WKr Anlage Allg</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage#getWKrAnlageAllg()
	 * @see #getW_Kr_Anlage()
	 * @generated
	 */
	EReference getW_Kr_Anlage_WKrAnlageAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup <em>WKr Anlage Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WKr Anlage Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup
	 * @generated
	 */
	EClass getW_Kr_Anlage_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup#getIsolierfall <em>Isolierfall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Isolierfall</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup#getIsolierfall()
	 * @see #getW_Kr_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getW_Kr_Anlage_Allg_AttributeGroup_Isolierfall();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup#getWKrArt <em>WKr Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WKr Art</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup#getWKrArt()
	 * @see #getW_Kr_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getW_Kr_Anlage_Allg_AttributeGroup_WKrArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup#getWKrGrundform <em>WKr Grundform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WKr Grundform</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup#getWKrGrundform()
	 * @see #getW_Kr_Anlage_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getW_Kr_Anlage_Allg_AttributeGroup_WKrGrundform();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Art_TypeClass <em>WKr Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WKr Art Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Art_TypeClass
	 * @generated
	 */
	EClass getW_Kr_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Art_TypeClass#getWert()
	 * @see #getW_Kr_Art_TypeClass()
	 * @generated
	 */
	EAttribute getW_Kr_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Grundform_TypeClass <em>WKr Grundform Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WKr Grundform Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Grundform_TypeClass
	 * @generated
	 */
	EClass getW_Kr_Grundform_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Grundform_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Grundform_TypeClass#getWert()
	 * @see #getW_Kr_Grundform_TypeClass()
	 * @generated
	 */
	EAttribute getW_Kr_Grundform_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element <em>WKr Gsp Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WKr Gsp Element</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element
	 * @generated
	 */
	EClass getW_Kr_Gsp_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getBezeichnung()
	 * @see #getW_Kr_Gsp_Element()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Element_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDRegelzeichnung <em>ID Regelzeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Regelzeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDRegelzeichnung()
	 * @see #getW_Kr_Gsp_Element()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Element_IDRegelzeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDStellelement <em>ID Stellelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Stellelement</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDStellelement()
	 * @see #getW_Kr_Gsp_Element()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Element_IDStellelement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDWKrAnlage <em>IDW Kr Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDW Kr Anlage</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDWKrAnlage()
	 * @see #getW_Kr_Gsp_Element()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Element_IDWKrAnlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Weichenlaufkette</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDWeichenlaufkette()
	 * @see #getW_Kr_Gsp_Element()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Element_IDWeichenlaufkette();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getWKrGspElementAllg <em>WKr Gsp Element Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WKr Gsp Element Allg</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getWKrGspElementAllg()
	 * @see #getW_Kr_Gsp_Element()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Element_WKrGspElementAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getGleissperreElement <em>Gleissperre Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gleissperre Element</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getGleissperreElement()
	 * @see #getW_Kr_Gsp_Element()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Element_GleissperreElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getWeicheElement <em>Weiche Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weiche Element</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getWeicheElement()
	 * @see #getW_Kr_Gsp_Element()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Element_WeicheElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup <em>WKr Gsp Element Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WKr Gsp Element Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup
	 * @generated
	 */
	EClass getW_Kr_Gsp_Element_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup#getKrKrWSeitenzuordnung <em>Kr Kr WSeitenzuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kr Kr WSeitenzuordnung</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup#getKrKrWSeitenzuordnung()
	 * @see #getW_Kr_Gsp_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Element_Allg_AttributeGroup_KrKrWSeitenzuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup#getVorzugslageAutomatik <em>Vorzugslage Automatik</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vorzugslage Automatik</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup#getVorzugslageAutomatik()
	 * @see #getW_Kr_Gsp_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Element_Allg_AttributeGroup_VorzugslageAutomatik();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup#getWKrGspStellart <em>WKr Gsp Stellart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WKr Gsp Stellart</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup#getWKrGspStellart()
	 * @see #getW_Kr_Gsp_Element_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Element_Allg_AttributeGroup_WKrGspStellart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente <em>WKr Gsp Komponente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WKr Gsp Komponente</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente
	 * @generated
	 */
	EClass getW_Kr_Gsp_Komponente();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getAustauschAntriebe <em>Austausch Antriebe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Austausch Antriebe</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getAustauschAntriebe()
	 * @see #getW_Kr_Gsp_Komponente()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Komponente_AustauschAntriebe();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getIDRegelzeichnung <em>ID Regelzeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Regelzeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getIDRegelzeichnung()
	 * @see #getW_Kr_Gsp_Komponente()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Komponente_IDRegelzeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getIDWKrGspElement <em>IDW Kr Gsp Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDW Kr Gsp Element</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getIDWKrGspElement()
	 * @see #getW_Kr_Gsp_Komponente()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Komponente_IDWKrGspElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getBesonderesFahrwegelement <em>Besonderes Fahrwegelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Besonderes Fahrwegelement</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getBesonderesFahrwegelement()
	 * @see #getW_Kr_Gsp_Komponente()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Komponente_BesonderesFahrwegelement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getEntgleisungsschuh <em>Entgleisungsschuh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entgleisungsschuh</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getEntgleisungsschuh()
	 * @see #getW_Kr_Gsp_Komponente()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Komponente_Entgleisungsschuh();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getKreuzung <em>Kreuzung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kreuzung</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getKreuzung()
	 * @see #getW_Kr_Gsp_Komponente()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Komponente_Kreuzung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getZungenpaar <em>Zungenpaar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zungenpaar</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getZungenpaar()
	 * @see #getW_Kr_Gsp_Komponente()
	 * @generated
	 */
	EReference getW_Kr_Gsp_Komponente_Zungenpaar();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Stellart_TypeClass <em>WKr Gsp Stellart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WKr Gsp Stellart Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Stellart_TypeClass
	 * @generated
	 */
	EClass getW_Kr_Gsp_Stellart_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Stellart_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Stellart_TypeClass#getWert()
	 * @see #getW_Kr_Gsp_Stellart_TypeClass()
	 * @generated
	 */
	EAttribute getW_Kr_Gsp_Stellart_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Betriebsart_TypeClass <em>Weiche Betriebsart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weiche Betriebsart Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Betriebsart_TypeClass
	 * @generated
	 */
	EClass getWeiche_Betriebsart_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Betriebsart_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Betriebsart_TypeClass#getWert()
	 * @see #getWeiche_Betriebsart_TypeClass()
	 * @generated
	 */
	EAttribute getWeiche_Betriebsart_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup <em>Weiche Element Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weiche Element Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup
	 * @generated
	 */
	EClass getWeiche_Element_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getAuffahrortung <em>Auffahrortung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auffahrortung</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getAuffahrortung()
	 * @see #getWeiche_Element_AttributeGroup()
	 * @generated
	 */
	EReference getWeiche_Element_AttributeGroup_Auffahrortung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getGZFreimeldungL <em>GZ Freimeldung L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GZ Freimeldung L</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getGZFreimeldungL()
	 * @see #getWeiche_Element_AttributeGroup()
	 * @generated
	 */
	EReference getWeiche_Element_AttributeGroup_GZFreimeldungL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getGZFreimeldungR <em>GZ Freimeldung R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GZ Freimeldung R</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getGZFreimeldungR()
	 * @see #getWeiche_Element_AttributeGroup()
	 * @generated
	 */
	EReference getWeiche_Element_AttributeGroup_GZFreimeldungR();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getIDGrenzzeichen <em>ID Grenzzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Grenzzeichen</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getIDGrenzzeichen()
	 * @see #getWeiche_Element_AttributeGroup()
	 * @generated
	 */
	EReference getWeiche_Element_AttributeGroup_IDGrenzzeichen();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getIDSignal <em>ID Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getIDSignal()
	 * @see #getWeiche_Element_AttributeGroup()
	 * @generated
	 */
	EReference getWeiche_Element_AttributeGroup_IDSignal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getWeicheBetriebsart <em>Weiche Betriebsart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weiche Betriebsart</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getWeicheBetriebsart()
	 * @see #getWeiche_Element_AttributeGroup()
	 * @generated
	 */
	EReference getWeiche_Element_AttributeGroup_WeicheBetriebsart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getWeicheVorzugslage <em>Weiche Vorzugslage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weiche Vorzugslage</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getWeicheVorzugslage()
	 * @see #getWeiche_Element_AttributeGroup()
	 * @generated
	 */
	EReference getWeiche_Element_AttributeGroup_WeicheVorzugslage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Vorzugslage_TypeClass <em>Weiche Vorzugslage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weiche Vorzugslage Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Vorzugslage_TypeClass
	 * @generated
	 */
	EClass getWeiche_Vorzugslage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Vorzugslage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Vorzugslage_TypeClass#getWert()
	 * @see #getWeiche_Vorzugslage_TypeClass()
	 * @generated
	 */
	EAttribute getWeiche_Vorzugslage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette <em>Weichenlaufkette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weichenlaufkette</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette
	 * @generated
	 */
	EClass getWeichenlaufkette();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette#getBezeichnung()
	 * @see #getWeichenlaufkette()
	 * @generated
	 */
	EReference getWeichenlaufkette_Bezeichnung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung <em>Weichenlaufkette Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weichenlaufkette Zuordnung</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung
	 * @generated
	 */
	EClass getWeichenlaufkette_Zuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDSignal <em>ID Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDSignal()
	 * @see #getWeichenlaufkette_Zuordnung()
	 * @generated
	 */
	EReference getWeichenlaufkette_Zuordnung_IDSignal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Weichenlaufkette</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDWeichenlaufkette()
	 * @see #getWeichenlaufkette_Zuordnung()
	 * @generated
	 */
	EReference getWeichenlaufkette_Zuordnung_IDWeichenlaufkette();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichensignal_TypeClass <em>Weichensignal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weichensignal Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichensignal_TypeClass
	 * @generated
	 */
	EClass getWeichensignal_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichensignal_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichensignal_TypeClass#getWert()
	 * @see #getWeichensignal_TypeClass()
	 * @generated
	 */
	EAttribute getWeichensignal_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup <em>Zungenpaar Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zungenpaar Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup
	 * @generated
	 */
	EClass getZungenpaar_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getElektrischerAntriebAnzahl <em>Elektrischer Antrieb Anzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elektrischer Antrieb Anzahl</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getElektrischerAntriebAnzahl()
	 * @see #getZungenpaar_AttributeGroup()
	 * @generated
	 */
	EReference getZungenpaar_AttributeGroup_ElektrischerAntriebAnzahl();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getElektrischerAntriebLage <em>Elektrischer Antrieb Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elektrischer Antrieb Lage</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getElektrischerAntriebLage()
	 * @see #getZungenpaar_AttributeGroup()
	 * @generated
	 */
	EReference getZungenpaar_AttributeGroup_ElektrischerAntriebLage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getGeschwindigkeitL <em>Geschwindigkeit L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschwindigkeit L</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getGeschwindigkeitL()
	 * @see #getZungenpaar_AttributeGroup()
	 * @generated
	 */
	EReference getZungenpaar_AttributeGroup_GeschwindigkeitL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getGeschwindigkeitR <em>Geschwindigkeit R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschwindigkeit R</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getGeschwindigkeitR()
	 * @see #getZungenpaar_AttributeGroup()
	 * @generated
	 */
	EReference getZungenpaar_AttributeGroup_GeschwindigkeitR();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getHerzstueckAntriebe <em>Herzstueck Antriebe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Herzstueck Antriebe</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getHerzstueckAntriebe()
	 * @see #getZungenpaar_AttributeGroup()
	 * @generated
	 */
	EReference getZungenpaar_AttributeGroup_HerzstueckAntriebe();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getKreuzungsgleis <em>Kreuzungsgleis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kreuzungsgleis</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getKreuzungsgleis()
	 * @see #getZungenpaar_AttributeGroup()
	 * @generated
	 */
	EReference getZungenpaar_AttributeGroup_Kreuzungsgleis();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getStammgleis <em>Stammgleis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stammgleis</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getStammgleis()
	 * @see #getZungenpaar_AttributeGroup()
	 * @generated
	 */
	EReference getZungenpaar_AttributeGroup_Stammgleis();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getWeichensignal <em>Weichensignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weichensignal</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getWeichensignal()
	 * @see #getZungenpaar_AttributeGroup()
	 * @generated
	 */
	EReference getZungenpaar_AttributeGroup_Weichensignal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getZungenpruefkontaktAnzahl <em>Zungenpruefkontakt Anzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zungenpruefkontakt Anzahl</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getZungenpruefkontaktAnzahl()
	 * @see #getZungenpaar_AttributeGroup()
	 * @generated
	 */
	EReference getZungenpaar_AttributeGroup_ZungenpruefkontaktAnzahl();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpruefkontakt_Anzahl_TypeClass <em>Zungenpruefkontakt Anzahl Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zungenpruefkontakt Anzahl Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpruefkontakt_Anzahl_TypeClass
	 * @generated
	 */
	EClass getZungenpruefkontakt_Anzahl_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpruefkontakt_Anzahl_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpruefkontakt_Anzahl_TypeClass#getWert()
	 * @see #getZungenpruefkontakt_Anzahl_TypeClass()
	 * @generated
	 */
	EAttribute getZungenpruefkontakt_Anzahl_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMBesonderesFahrwegelement <em>ENUM Besonderes Fahrwegelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Besonderes Fahrwegelement</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMBesonderesFahrwegelement
	 * @generated
	 */
	EEnum getENUMBesonderesFahrwegelement();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElektrischerAntriebLage <em>ENUM Elektrischer Antrieb Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Elektrischer Antrieb Lage</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElektrischerAntriebLage
	 * @generated
	 */
	EEnum getENUMElektrischerAntriebLage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElementLage <em>ENUM Element Lage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Element Lage</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElementLage
	 * @generated
	 */
	EEnum getENUMElementLage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleisAbschlussArt <em>ENUM Gleis Abschluss Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Gleis Abschluss Art</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleisAbschlussArt
	 * @generated
	 */
	EEnum getENUMGleisAbschlussArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreBetriebsart <em>ENUM Gleissperre Betriebsart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Gleissperre Betriebsart</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreBetriebsart
	 * @generated
	 */
	EEnum getENUMGleissperreBetriebsart();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperrensignal <em>ENUM Gleissperrensignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Gleissperrensignal</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperrensignal
	 * @generated
	 */
	EEnum getENUMGleissperrensignal();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreVorzugslage <em>ENUM Gleissperre Vorzugslage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Gleissperre Vorzugslage</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreVorzugslage
	 * @generated
	 */
	EEnum getENUMGleissperreVorzugslage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeicheBetriebsart <em>ENUM Weiche Betriebsart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Weiche Betriebsart</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeicheBetriebsart
	 * @generated
	 */
	EEnum getENUMWeicheBetriebsart();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeichensignal <em>ENUM Weichensignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Weichensignal</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeichensignal
	 * @generated
	 */
	EEnum getENUMWeichensignal();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrArt <em>ENUMW Kr Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMW Kr Art</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrArt
	 * @generated
	 */
	EEnum getENUMWKrArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrGspStellart <em>ENUMW Kr Gsp Stellart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMW Kr Gsp Stellart</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrGspStellart
	 * @generated
	 */
	EEnum getENUMWKrGspStellart();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts <em>CAuswurfrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CAuswurfrichtung</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts"
	 *        extendedMetaData="name='CAuswurfrichtung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts'"
	 * @generated
	 */
	EDataType getCAuswurfrichtung();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Elektrischer Antrieb Anzahl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Elektrischer Antrieb Anzahl Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TElektrischer_Antrieb_Anzahl' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[0-9]|1[0-5]'"
	 * @generated
	 */
	EDataType getElektrischer_Antrieb_Anzahl_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMBesonderesFahrwegelement <em>ENUM Besonderes Fahrwegelement Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Besonderes Fahrwegelement Object</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMBesonderesFahrwegelement
	 * @model instanceClass="org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMBesonderesFahrwegelement"
	 *        extendedMetaData="name='ENUMBesonderes_Fahrwegelement:Object' baseType='ENUMBesonderes_Fahrwegelement'"
	 * @generated
	 */
	EDataType getENUMBesonderesFahrwegelementObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElektrischerAntriebLage <em>ENUM Elektrischer Antrieb Lage Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Elektrischer Antrieb Lage Object</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElektrischerAntriebLage
	 * @model instanceClass="org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElektrischerAntriebLage"
	 *        extendedMetaData="name='ENUMElektrischer_Antrieb_Lage:Object' baseType='ENUMElektrischer_Antrieb_Lage'"
	 * @generated
	 */
	EDataType getENUMElektrischerAntriebLageObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElementLage <em>ENUM Element Lage Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Element Lage Object</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElementLage
	 * @model instanceClass="org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElementLage"
	 *        extendedMetaData="name='ENUMElement_Lage:Object' baseType='ENUMElement_Lage'"
	 * @generated
	 */
	EDataType getENUMElementLageObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleisAbschlussArt <em>ENUM Gleis Abschluss Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Gleis Abschluss Art Object</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleisAbschlussArt
	 * @model instanceClass="org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleisAbschlussArt"
	 *        extendedMetaData="name='ENUMGleis_Abschluss_Art:Object' baseType='ENUMGleis_Abschluss_Art'"
	 * @generated
	 */
	EDataType getENUMGleisAbschlussArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreBetriebsart <em>ENUM Gleissperre Betriebsart Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Gleissperre Betriebsart Object</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreBetriebsart
	 * @model instanceClass="org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreBetriebsart"
	 *        extendedMetaData="name='ENUMGleissperre_Betriebsart:Object' baseType='ENUMGleissperre_Betriebsart'"
	 * @generated
	 */
	EDataType getENUMGleissperreBetriebsartObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperrensignal <em>ENUM Gleissperrensignal Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Gleissperrensignal Object</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperrensignal
	 * @model instanceClass="org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperrensignal"
	 *        extendedMetaData="name='ENUMGleissperrensignal:Object' baseType='ENUMGleissperrensignal'"
	 * @generated
	 */
	EDataType getENUMGleissperrensignalObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreVorzugslage <em>ENUM Gleissperre Vorzugslage Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Gleissperre Vorzugslage Object</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreVorzugslage
	 * @model instanceClass="org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreVorzugslage"
	 *        extendedMetaData="name='ENUMGleissperre_Vorzugslage:Object' baseType='ENUMGleissperre_Vorzugslage'"
	 * @generated
	 */
	EDataType getENUMGleissperreVorzugslageObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeicheBetriebsart <em>ENUM Weiche Betriebsart Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Weiche Betriebsart Object</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeicheBetriebsart
	 * @model instanceClass="org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeicheBetriebsart"
	 *        extendedMetaData="name='ENUMWeiche_Betriebsart:Object' baseType='ENUMWeiche_Betriebsart'"
	 * @generated
	 */
	EDataType getENUMWeicheBetriebsartObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeichensignal <em>ENUM Weichensignal Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Weichensignal Object</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeichensignal
	 * @model instanceClass="org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeichensignal"
	 *        extendedMetaData="name='ENUMWeichensignal:Object' baseType='ENUMWeichensignal'"
	 * @generated
	 */
	EDataType getENUMWeichensignalObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrArt <em>ENUMW Kr Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMW Kr Art Object</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrArt
	 * @model instanceClass="org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrArt"
	 *        extendedMetaData="name='ENUMW_Kr_Art:Object' baseType='ENUMW_Kr_Art'"
	 * @generated
	 */
	EDataType getENUMWKrArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrGspStellart <em>ENUMW Kr Gsp Stellart Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMW Kr Gsp Stellart Object</em>'.
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrGspStellart
	 * @model instanceClass="org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrGspStellart"
	 *        extendedMetaData="name='ENUMW_Kr_Gsp_Stellart:Object' baseType='ENUMW_Kr_Gsp_Stellart'"
	 * @generated
	 */
	EDataType getENUMWKrGspStellartObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Geschwindigkeit LType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Geschwindigkeit LType</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TGeschwindigkeit_L' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit'"
	 * @generated
	 */
	EDataType getGeschwindigkeit_L_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Geschwindigkeit RType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Geschwindigkeit RType</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TGeschwindigkeit_R' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit'"
	 * @generated
	 */
	EDataType getGeschwindigkeit_R_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Herzstueck Antriebe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Herzstueck Antriebe Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='THerzstueck_Antriebe' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9]|1[0-5]'"
	 * @generated
	 */
	EDataType getHerzstueck_Antriebe_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Isolierfall Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Isolierfall Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TIsolierfall' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{1,20}'"
	 * @generated
	 */
	EDataType getIsolierfall_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts <em>Kr Kr WSeitenzuordnung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kr Kr WSeitenzuordnung Type</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts"
	 *        extendedMetaData="name='TKr_KrW_Seitenzuordnung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts'"
	 * @generated
	 */
	EDataType getKr_KrW_Seitenzuordnung_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts <em>Kreuzungsgleis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kreuzungsgleis Type</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts"
	 *        extendedMetaData="name='TKreuzungsgleis' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts'"
	 * @generated
	 */
	EDataType getKreuzungsgleis_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts <em>Stammgleis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stammgleis Type</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts"
	 *        extendedMetaData="name='TStammgleis' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts'"
	 * @generated
	 */
	EDataType getStammgleis_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>WKr Grundform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>WKr Grundform Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TW_Kr_Grundform' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText' pattern='.{1,50}'"
	 * @generated
	 */
	EDataType getW_Kr_Grundform_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts <em>Weiche Vorzugslage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Weiche Vorzugslage Type</em>'.
	 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
	 * @model instanceClass="org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts"
	 *        extendedMetaData="name='TWeiche_Vorzugslage' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts'"
	 * @generated
	 */
	EDataType getWeiche_Vorzugslage_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Zungenpruefkontakt Anzahl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Zungenpruefkontakt Anzahl Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TZungenpruefkontakt_Anzahl' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[0-9]|1[0-5]'"
	 * @generated
	 */
	EDataType getZungenpruefkontakt_Anzahl_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Weichen_und_GleissperrenFactory getWeichen_und_GleissperrenFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Auffahrortung_TypeClassImpl <em>Auffahrortung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Auffahrortung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getAuffahrortung_TypeClass()
		 * @generated
		 */
		EClass AUFFAHRORTUNG_TYPE_CLASS = eINSTANCE.getAuffahrortung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUFFAHRORTUNG_TYPE_CLASS__WERT = eINSTANCE.getAuffahrortung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Austausch_Antriebe_TypeClassImpl <em>Austausch Antriebe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Austausch_Antriebe_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getAustausch_Antriebe_TypeClass()
		 * @generated
		 */
		EClass AUSTAUSCH_ANTRIEBE_TYPE_CLASS = eINSTANCE.getAustausch_Antriebe_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSTAUSCH_ANTRIEBE_TYPE_CLASS__WERT = eINSTANCE.getAustausch_Antriebe_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Auswurfrichtung_TypeClassImpl <em>Auswurfrichtung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Auswurfrichtung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getAuswurfrichtung_TypeClass()
		 * @generated
		 */
		EClass AUSWURFRICHTUNG_TYPE_CLASS = eINSTANCE.getAuswurfrichtung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSWURFRICHTUNG_TYPE_CLASS__WERT = eINSTANCE.getAuswurfrichtung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Besonderes_Fahrwegelement_TypeClassImpl <em>Besonderes Fahrwegelement Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Besonderes_Fahrwegelement_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getBesonderes_Fahrwegelement_TypeClass()
		 * @generated
		 */
		EClass BESONDERES_FAHRWEGELEMENT_TYPE_CLASS = eINSTANCE.getBesonderes_Fahrwegelement_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BESONDERES_FAHRWEGELEMENT_TYPE_CLASS__WERT = eINSTANCE.getBesonderes_Fahrwegelement_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Elektrischer_Antrieb_Anzahl_TypeClassImpl <em>Elektrischer Antrieb Anzahl Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Elektrischer_Antrieb_Anzahl_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getElektrischer_Antrieb_Anzahl_TypeClass()
		 * @generated
		 */
		EClass ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE_CLASS = eINSTANCE.getElektrischer_Antrieb_Anzahl_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE_CLASS__WERT = eINSTANCE.getElektrischer_Antrieb_Anzahl_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Elektrischer_Antrieb_Lage_TypeClassImpl <em>Elektrischer Antrieb Lage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Elektrischer_Antrieb_Lage_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getElektrischer_Antrieb_Lage_TypeClass()
		 * @generated
		 */
		EClass ELEKTRISCHER_ANTRIEB_LAGE_TYPE_CLASS = eINSTANCE.getElektrischer_Antrieb_Lage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEKTRISCHER_ANTRIEB_LAGE_TYPE_CLASS__WERT = eINSTANCE.getElektrischer_Antrieb_Lage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Element_Lage_TypeClassImpl <em>Element Lage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Element_Lage_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getElement_Lage_TypeClass()
		 * @generated
		 */
		EClass ELEMENT_LAGE_TYPE_CLASS = eINSTANCE.getElement_Lage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_LAGE_TYPE_CLASS__WERT = eINSTANCE.getElement_Lage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Entgleisungsschuh_AttributeGroupImpl <em>Entgleisungsschuh Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Entgleisungsschuh_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getEntgleisungsschuh_AttributeGroup()
		 * @generated
		 */
		EClass ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP = eINSTANCE.getEntgleisungsschuh_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Auswurfrichtung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__AUSWURFRICHTUNG = eINSTANCE.getEntgleisungsschuh_AttributeGroup_Auswurfrichtung();

		/**
		 * The meta object literal for the '<em><b>Gleissperrensignal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__GLEISSPERRENSIGNAL = eINSTANCE.getEntgleisungsschuh_AttributeGroup_Gleissperrensignal();

		/**
		 * The meta object literal for the '<em><b>Schutzschiene</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__SCHUTZSCHIENE = eINSTANCE.getEntgleisungsschuh_AttributeGroup_Schutzschiene();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Geschwindigkeit_L_TypeClassImpl <em>Geschwindigkeit LType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Geschwindigkeit_L_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGeschwindigkeit_L_TypeClass()
		 * @generated
		 */
		EClass GESCHWINDIGKEIT_LTYPE_CLASS = eINSTANCE.getGeschwindigkeit_L_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GESCHWINDIGKEIT_LTYPE_CLASS__WERT = eINSTANCE.getGeschwindigkeit_L_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Geschwindigkeit_R_TypeClassImpl <em>Geschwindigkeit RType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Geschwindigkeit_R_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGeschwindigkeit_R_TypeClass()
		 * @generated
		 */
		EClass GESCHWINDIGKEIT_RTYPE_CLASS = eINSTANCE.getGeschwindigkeit_R_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GESCHWINDIGKEIT_RTYPE_CLASS__WERT = eINSTANCE.getGeschwindigkeit_R_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleis_AbschlussImpl <em>Gleis Abschluss</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleis_AbschlussImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGleis_Abschluss()
		 * @generated
		 */
		EClass GLEIS_ABSCHLUSS = eINSTANCE.getGleis_Abschluss();

		/**
		 * The meta object literal for the '<em><b>Gleis Abschluss Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLEIS_ABSCHLUSS__GLEIS_ABSCHLUSS_ART = eINSTANCE.getGleis_Abschluss_GleisAbschlussArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleis_Abschluss_Art_TypeClassImpl <em>Gleis Abschluss Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleis_Abschluss_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGleis_Abschluss_Art_TypeClass()
		 * @generated
		 */
		EClass GLEIS_ABSCHLUSS_ART_TYPE_CLASS = eINSTANCE.getGleis_Abschluss_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLEIS_ABSCHLUSS_ART_TYPE_CLASS__WERT = eINSTANCE.getGleis_Abschluss_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperre_Betriebsart_TypeClassImpl <em>Gleissperre Betriebsart Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperre_Betriebsart_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGleissperre_Betriebsart_TypeClass()
		 * @generated
		 */
		EClass GLEISSPERRE_BETRIEBSART_TYPE_CLASS = eINSTANCE.getGleissperre_Betriebsart_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLEISSPERRE_BETRIEBSART_TYPE_CLASS__WERT = eINSTANCE.getGleissperre_Betriebsart_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperre_Element_AttributeGroupImpl <em>Gleissperre Element Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperre_Element_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGleissperre_Element_AttributeGroup()
		 * @generated
		 */
		EClass GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP = eINSTANCE.getGleissperre_Element_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Gleissperre Betriebsart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_BETRIEBSART = eINSTANCE.getGleissperre_Element_AttributeGroup_GleissperreBetriebsart();

		/**
		 * The meta object literal for the '<em><b>Gleissperre Vorzugslage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_VORZUGSLAGE = eINSTANCE.getGleissperre_Element_AttributeGroup_GleissperreVorzugslage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperre_Vorzugslage_TypeClassImpl <em>Gleissperre Vorzugslage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperre_Vorzugslage_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGleissperre_Vorzugslage_TypeClass()
		 * @generated
		 */
		EClass GLEISSPERRE_VORZUGSLAGE_TYPE_CLASS = eINSTANCE.getGleissperre_Vorzugslage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLEISSPERRE_VORZUGSLAGE_TYPE_CLASS__WERT = eINSTANCE.getGleissperre_Vorzugslage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperrensignal_TypeClassImpl <em>Gleissperrensignal Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Gleissperrensignal_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGleissperrensignal_TypeClass()
		 * @generated
		 */
		EClass GLEISSPERRENSIGNAL_TYPE_CLASS = eINSTANCE.getGleissperrensignal_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLEISSPERRENSIGNAL_TYPE_CLASS__WERT = eINSTANCE.getGleissperrensignal_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.GZ_Freimeldung_L_AttributeGroupImpl <em>GZ Freimeldung LAttribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.GZ_Freimeldung_L_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGZ_Freimeldung_L_AttributeGroup()
		 * @generated
		 */
		EClass GZ_FREIMELDUNG_LATTRIBUTE_GROUP = eINSTANCE.getGZ_Freimeldung_L_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Element Lage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ELEMENT_LAGE = eINSTANCE.getGZ_Freimeldung_L_AttributeGroup_ElementLage();

		/**
		 * The meta object literal for the '<em><b>ID Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ID_ELEMENT = eINSTANCE.getGZ_Freimeldung_L_AttributeGroup_IDElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.GZ_Freimeldung_R_AttributeGroupImpl <em>GZ Freimeldung RAttribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.GZ_Freimeldung_R_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGZ_Freimeldung_R_AttributeGroup()
		 * @generated
		 */
		EClass GZ_FREIMELDUNG_RATTRIBUTE_GROUP = eINSTANCE.getGZ_Freimeldung_R_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Element Lage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ELEMENT_LAGE = eINSTANCE.getGZ_Freimeldung_R_AttributeGroup_ElementLage();

		/**
		 * The meta object literal for the '<em><b>ID Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ID_ELEMENT = eINSTANCE.getGZ_Freimeldung_R_AttributeGroup_IDElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Herzstueck_Antriebe_TypeClassImpl <em>Herzstueck Antriebe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Herzstueck_Antriebe_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getHerzstueck_Antriebe_TypeClass()
		 * @generated
		 */
		EClass HERZSTUECK_ANTRIEBE_TYPE_CLASS = eINSTANCE.getHerzstueck_Antriebe_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERZSTUECK_ANTRIEBE_TYPE_CLASS__WERT = eINSTANCE.getHerzstueck_Antriebe_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Isolierfall_TypeClassImpl <em>Isolierfall Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Isolierfall_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getIsolierfall_TypeClass()
		 * @generated
		 */
		EClass ISOLIERFALL_TYPE_CLASS = eINSTANCE.getIsolierfall_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISOLIERFALL_TYPE_CLASS__WERT = eINSTANCE.getIsolierfall_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Kr_KrW_Seitenzuordnung_TypeClassImpl <em>Kr Kr WSeitenzuordnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Kr_KrW_Seitenzuordnung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getKr_KrW_Seitenzuordnung_TypeClass()
		 * @generated
		 */
		EClass KR_KR_WSEITENZUORDNUNG_TYPE_CLASS = eINSTANCE.getKr_KrW_Seitenzuordnung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KR_KR_WSEITENZUORDNUNG_TYPE_CLASS__WERT = eINSTANCE.getKr_KrW_Seitenzuordnung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Kreuzung_AttributeGroupImpl <em>Kreuzung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Kreuzung_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getKreuzung_AttributeGroup()
		 * @generated
		 */
		EClass KREUZUNG_ATTRIBUTE_GROUP = eINSTANCE.getKreuzung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Elektrischer Antrieb Anzahl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KREUZUNG_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL = eINSTANCE.getKreuzung_AttributeGroup_ElektrischerAntriebAnzahl();

		/**
		 * The meta object literal for the '<em><b>Elektrischer Antrieb Lage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KREUZUNG_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE = eINSTANCE.getKreuzung_AttributeGroup_ElektrischerAntriebLage();

		/**
		 * The meta object literal for the '<em><b>Geschwindigkeit L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KREUZUNG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L = eINSTANCE.getKreuzung_AttributeGroup_GeschwindigkeitL();

		/**
		 * The meta object literal for the '<em><b>Geschwindigkeit R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KREUZUNG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R = eINSTANCE.getKreuzung_AttributeGroup_GeschwindigkeitR();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Kreuzungsgleis_TypeClassImpl <em>Kreuzungsgleis Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Kreuzungsgleis_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getKreuzungsgleis_TypeClass()
		 * @generated
		 */
		EClass KREUZUNGSGLEIS_TYPE_CLASS = eINSTANCE.getKreuzungsgleis_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KREUZUNGSGLEIS_TYPE_CLASS__WERT = eINSTANCE.getKreuzungsgleis_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Schutzschiene_TypeClassImpl <em>Schutzschiene Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Schutzschiene_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getSchutzschiene_TypeClass()
		 * @generated
		 */
		EClass SCHUTZSCHIENE_TYPE_CLASS = eINSTANCE.getSchutzschiene_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHUTZSCHIENE_TYPE_CLASS__WERT = eINSTANCE.getSchutzschiene_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Stammgleis_TypeClassImpl <em>Stammgleis Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Stammgleis_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getStammgleis_TypeClass()
		 * @generated
		 */
		EClass STAMMGLEIS_TYPE_CLASS = eINSTANCE.getStammgleis_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAMMGLEIS_TYPE_CLASS__WERT = eINSTANCE.getStammgleis_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Vorzugslage_Automatik_TypeClassImpl <em>Vorzugslage Automatik Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Vorzugslage_Automatik_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getVorzugslage_Automatik_TypeClass()
		 * @generated
		 */
		EClass VORZUGSLAGE_AUTOMATIK_TYPE_CLASS = eINSTANCE.getVorzugslage_Automatik_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORZUGSLAGE_AUTOMATIK_TYPE_CLASS__WERT = eINSTANCE.getVorzugslage_Automatik_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_AnlageImpl <em>WKr Anlage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_AnlageImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Anlage()
		 * @generated
		 */
		EClass WKR_ANLAGE = eINSTANCE.getW_Kr_Anlage();

		/**
		 * The meta object literal for the '<em><b>ID Anhang DWS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_ANLAGE__ID_ANHANG_DWS = eINSTANCE.getW_Kr_Anlage_IDAnhangDWS();

		/**
		 * The meta object literal for the '<em><b>ID Signal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_ANLAGE__ID_SIGNAL = eINSTANCE.getW_Kr_Anlage_IDSignal();

		/**
		 * The meta object literal for the '<em><b>WKr Anlage Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_ANLAGE__WKR_ANLAGE_ALLG = eINSTANCE.getW_Kr_Anlage_WKrAnlageAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Anlage_Allg_AttributeGroupImpl <em>WKr Anlage Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Anlage_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Anlage_Allg_AttributeGroup()
		 * @generated
		 */
		EClass WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getW_Kr_Anlage_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Isolierfall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__ISOLIERFALL = eINSTANCE.getW_Kr_Anlage_Allg_AttributeGroup_Isolierfall();

		/**
		 * The meta object literal for the '<em><b>WKr Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_ART = eINSTANCE.getW_Kr_Anlage_Allg_AttributeGroup_WKrArt();

		/**
		 * The meta object literal for the '<em><b>WKr Grundform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_GRUNDFORM = eINSTANCE.getW_Kr_Anlage_Allg_AttributeGroup_WKrGrundform();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Art_TypeClassImpl <em>WKr Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Art_TypeClass()
		 * @generated
		 */
		EClass WKR_ART_TYPE_CLASS = eINSTANCE.getW_Kr_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WKR_ART_TYPE_CLASS__WERT = eINSTANCE.getW_Kr_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Grundform_TypeClassImpl <em>WKr Grundform Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Grundform_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Grundform_TypeClass()
		 * @generated
		 */
		EClass WKR_GRUNDFORM_TYPE_CLASS = eINSTANCE.getW_Kr_Grundform_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WKR_GRUNDFORM_TYPE_CLASS__WERT = eINSTANCE.getW_Kr_Grundform_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl <em>WKr Gsp Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Gsp_Element()
		 * @generated
		 */
		EClass WKR_GSP_ELEMENT = eINSTANCE.getW_Kr_Gsp_Element();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_ELEMENT__BEZEICHNUNG = eINSTANCE.getW_Kr_Gsp_Element_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Regelzeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_ELEMENT__ID_REGELZEICHNUNG = eINSTANCE.getW_Kr_Gsp_Element_IDRegelzeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Stellelement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_ELEMENT__ID_STELLELEMENT = eINSTANCE.getW_Kr_Gsp_Element_IDStellelement();

		/**
		 * The meta object literal for the '<em><b>IDW Kr Anlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_ELEMENT__IDW_KR_ANLAGE = eINSTANCE.getW_Kr_Gsp_Element_IDWKrAnlage();

		/**
		 * The meta object literal for the '<em><b>ID Weichenlaufkette</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE = eINSTANCE.getW_Kr_Gsp_Element_IDWeichenlaufkette();

		/**
		 * The meta object literal for the '<em><b>WKr Gsp Element Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG = eINSTANCE.getW_Kr_Gsp_Element_WKrGspElementAllg();

		/**
		 * The meta object literal for the '<em><b>Gleissperre Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT = eINSTANCE.getW_Kr_Gsp_Element_GleissperreElement();

		/**
		 * The meta object literal for the '<em><b>Weiche Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_ELEMENT__WEICHE_ELEMENT = eINSTANCE.getW_Kr_Gsp_Element_WeicheElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_Element_Allg_AttributeGroupImpl <em>WKr Gsp Element Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_Element_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Gsp_Element_Allg_AttributeGroup()
		 * @generated
		 */
		EClass WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getW_Kr_Gsp_Element_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Kr Kr WSeitenzuordnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__KR_KR_WSEITENZUORDNUNG = eINSTANCE.getW_Kr_Gsp_Element_Allg_AttributeGroup_KrKrWSeitenzuordnung();

		/**
		 * The meta object literal for the '<em><b>Vorzugslage Automatik</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORZUGSLAGE_AUTOMATIK = eINSTANCE.getW_Kr_Gsp_Element_Allg_AttributeGroup_VorzugslageAutomatik();

		/**
		 * The meta object literal for the '<em><b>WKr Gsp Stellart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__WKR_GSP_STELLART = eINSTANCE.getW_Kr_Gsp_Element_Allg_AttributeGroup_WKrGspStellart();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_KomponenteImpl <em>WKr Gsp Komponente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_KomponenteImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Gsp_Komponente()
		 * @generated
		 */
		EClass WKR_GSP_KOMPONENTE = eINSTANCE.getW_Kr_Gsp_Komponente();

		/**
		 * The meta object literal for the '<em><b>Austausch Antriebe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_KOMPONENTE__AUSTAUSCH_ANTRIEBE = eINSTANCE.getW_Kr_Gsp_Komponente_AustauschAntriebe();

		/**
		 * The meta object literal for the '<em><b>ID Regelzeichnung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_KOMPONENTE__ID_REGELZEICHNUNG = eINSTANCE.getW_Kr_Gsp_Komponente_IDRegelzeichnung();

		/**
		 * The meta object literal for the '<em><b>IDW Kr Gsp Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_KOMPONENTE__IDW_KR_GSP_ELEMENT = eINSTANCE.getW_Kr_Gsp_Komponente_IDWKrGspElement();

		/**
		 * The meta object literal for the '<em><b>Besonderes Fahrwegelement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT = eINSTANCE.getW_Kr_Gsp_Komponente_BesonderesFahrwegelement();

		/**
		 * The meta object literal for the '<em><b>Entgleisungsschuh</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH = eINSTANCE.getW_Kr_Gsp_Komponente_Entgleisungsschuh();

		/**
		 * The meta object literal for the '<em><b>Kreuzung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_KOMPONENTE__KREUZUNG = eINSTANCE.getW_Kr_Gsp_Komponente_Kreuzung();

		/**
		 * The meta object literal for the '<em><b>Zungenpaar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WKR_GSP_KOMPONENTE__ZUNGENPAAR = eINSTANCE.getW_Kr_Gsp_Komponente_Zungenpaar();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_Stellart_TypeClassImpl <em>WKr Gsp Stellart Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.W_Kr_Gsp_Stellart_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Gsp_Stellart_TypeClass()
		 * @generated
		 */
		EClass WKR_GSP_STELLART_TYPE_CLASS = eINSTANCE.getW_Kr_Gsp_Stellart_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WKR_GSP_STELLART_TYPE_CLASS__WERT = eINSTANCE.getW_Kr_Gsp_Stellart_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weiche_Betriebsart_TypeClassImpl <em>Weiche Betriebsart Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weiche_Betriebsart_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeiche_Betriebsart_TypeClass()
		 * @generated
		 */
		EClass WEICHE_BETRIEBSART_TYPE_CLASS = eINSTANCE.getWeiche_Betriebsart_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEICHE_BETRIEBSART_TYPE_CLASS__WERT = eINSTANCE.getWeiche_Betriebsart_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weiche_Element_AttributeGroupImpl <em>Weiche Element Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weiche_Element_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeiche_Element_AttributeGroup()
		 * @generated
		 */
		EClass WEICHE_ELEMENT_ATTRIBUTE_GROUP = eINSTANCE.getWeiche_Element_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Auffahrortung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG = eINSTANCE.getWeiche_Element_AttributeGroup_Auffahrortung();

		/**
		 * The meta object literal for the '<em><b>GZ Freimeldung L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L = eINSTANCE.getWeiche_Element_AttributeGroup_GZFreimeldungL();

		/**
		 * The meta object literal for the '<em><b>GZ Freimeldung R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R = eINSTANCE.getWeiche_Element_AttributeGroup_GZFreimeldungR();

		/**
		 * The meta object literal for the '<em><b>ID Grenzzeichen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_GRENZZEICHEN = eINSTANCE.getWeiche_Element_AttributeGroup_IDGrenzzeichen();

		/**
		 * The meta object literal for the '<em><b>ID Signal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_SIGNAL = eINSTANCE.getWeiche_Element_AttributeGroup_IDSignal();

		/**
		 * The meta object literal for the '<em><b>Weiche Betriebsart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART = eINSTANCE.getWeiche_Element_AttributeGroup_WeicheBetriebsart();

		/**
		 * The meta object literal for the '<em><b>Weiche Vorzugslage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE = eINSTANCE.getWeiche_Element_AttributeGroup_WeicheVorzugslage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weiche_Vorzugslage_TypeClassImpl <em>Weiche Vorzugslage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weiche_Vorzugslage_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeiche_Vorzugslage_TypeClass()
		 * @generated
		 */
		EClass WEICHE_VORZUGSLAGE_TYPE_CLASS = eINSTANCE.getWeiche_Vorzugslage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEICHE_VORZUGSLAGE_TYPE_CLASS__WERT = eINSTANCE.getWeiche_Vorzugslage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.WeichenlaufketteImpl <em>Weichenlaufkette</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.WeichenlaufketteImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeichenlaufkette()
		 * @generated
		 */
		EClass WEICHENLAUFKETTE = eINSTANCE.getWeichenlaufkette();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEICHENLAUFKETTE__BEZEICHNUNG = eINSTANCE.getWeichenlaufkette_Bezeichnung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichenlaufkette_ZuordnungImpl <em>Weichenlaufkette Zuordnung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichenlaufkette_ZuordnungImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeichenlaufkette_Zuordnung()
		 * @generated
		 */
		EClass WEICHENLAUFKETTE_ZUORDNUNG = eINSTANCE.getWeichenlaufkette_Zuordnung();

		/**
		 * The meta object literal for the '<em><b>ID Signal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL = eINSTANCE.getWeichenlaufkette_Zuordnung_IDSignal();

		/**
		 * The meta object literal for the '<em><b>ID Weichenlaufkette</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE = eINSTANCE.getWeichenlaufkette_Zuordnung_IDWeichenlaufkette();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichensignal_TypeClassImpl <em>Weichensignal Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichensignal_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeichensignal_TypeClass()
		 * @generated
		 */
		EClass WEICHENSIGNAL_TYPE_CLASS = eINSTANCE.getWeichensignal_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEICHENSIGNAL_TYPE_CLASS__WERT = eINSTANCE.getWeichensignal_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Zungenpaar_AttributeGroupImpl <em>Zungenpaar Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Zungenpaar_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getZungenpaar_AttributeGroup()
		 * @generated
		 */
		EClass ZUNGENPAAR_ATTRIBUTE_GROUP = eINSTANCE.getZungenpaar_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Elektrischer Antrieb Anzahl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL = eINSTANCE.getZungenpaar_AttributeGroup_ElektrischerAntriebAnzahl();

		/**
		 * The meta object literal for the '<em><b>Elektrischer Antrieb Lage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE = eINSTANCE.getZungenpaar_AttributeGroup_ElektrischerAntriebLage();

		/**
		 * The meta object literal for the '<em><b>Geschwindigkeit L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L = eINSTANCE.getZungenpaar_AttributeGroup_GeschwindigkeitL();

		/**
		 * The meta object literal for the '<em><b>Geschwindigkeit R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R = eINSTANCE.getZungenpaar_AttributeGroup_GeschwindigkeitR();

		/**
		 * The meta object literal for the '<em><b>Herzstueck Antriebe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUNGENPAAR_ATTRIBUTE_GROUP__HERZSTUECK_ANTRIEBE = eINSTANCE.getZungenpaar_AttributeGroup_HerzstueckAntriebe();

		/**
		 * The meta object literal for the '<em><b>Kreuzungsgleis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUNGENPAAR_ATTRIBUTE_GROUP__KREUZUNGSGLEIS = eINSTANCE.getZungenpaar_AttributeGroup_Kreuzungsgleis();

		/**
		 * The meta object literal for the '<em><b>Stammgleis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUNGENPAAR_ATTRIBUTE_GROUP__STAMMGLEIS = eINSTANCE.getZungenpaar_AttributeGroup_Stammgleis();

		/**
		 * The meta object literal for the '<em><b>Weichensignal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUNGENPAAR_ATTRIBUTE_GROUP__WEICHENSIGNAL = eINSTANCE.getZungenpaar_AttributeGroup_Weichensignal();

		/**
		 * The meta object literal for the '<em><b>Zungenpruefkontakt Anzahl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUNGENPAAR_ATTRIBUTE_GROUP__ZUNGENPRUEFKONTAKT_ANZAHL = eINSTANCE.getZungenpaar_AttributeGroup_ZungenpruefkontaktAnzahl();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Zungenpruefkontakt_Anzahl_TypeClassImpl <em>Zungenpruefkontakt Anzahl Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Zungenpruefkontakt_Anzahl_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getZungenpruefkontakt_Anzahl_TypeClass()
		 * @generated
		 */
		EClass ZUNGENPRUEFKONTAKT_ANZAHL_TYPE_CLASS = eINSTANCE.getZungenpruefkontakt_Anzahl_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUNGENPRUEFKONTAKT_ANZAHL_TYPE_CLASS__WERT = eINSTANCE.getZungenpruefkontakt_Anzahl_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMBesonderesFahrwegelement <em>ENUM Besonderes Fahrwegelement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMBesonderesFahrwegelement
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMBesonderesFahrwegelement()
		 * @generated
		 */
		EEnum ENUM_BESONDERES_FAHRWEGELEMENT = eINSTANCE.getENUMBesonderesFahrwegelement();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElektrischerAntriebLage <em>ENUM Elektrischer Antrieb Lage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElektrischerAntriebLage
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMElektrischerAntriebLage()
		 * @generated
		 */
		EEnum ENUM_ELEKTRISCHER_ANTRIEB_LAGE = eINSTANCE.getENUMElektrischerAntriebLage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElementLage <em>ENUM Element Lage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElementLage
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMElementLage()
		 * @generated
		 */
		EEnum ENUM_ELEMENT_LAGE = eINSTANCE.getENUMElementLage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleisAbschlussArt <em>ENUM Gleis Abschluss Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleisAbschlussArt
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleisAbschlussArt()
		 * @generated
		 */
		EEnum ENUM_GLEIS_ABSCHLUSS_ART = eINSTANCE.getENUMGleisAbschlussArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreBetriebsart <em>ENUM Gleissperre Betriebsart</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreBetriebsart
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleissperreBetriebsart()
		 * @generated
		 */
		EEnum ENUM_GLEISSPERRE_BETRIEBSART = eINSTANCE.getENUMGleissperreBetriebsart();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperrensignal <em>ENUM Gleissperrensignal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperrensignal
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleissperrensignal()
		 * @generated
		 */
		EEnum ENUM_GLEISSPERRENSIGNAL = eINSTANCE.getENUMGleissperrensignal();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreVorzugslage <em>ENUM Gleissperre Vorzugslage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreVorzugslage
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleissperreVorzugslage()
		 * @generated
		 */
		EEnum ENUM_GLEISSPERRE_VORZUGSLAGE = eINSTANCE.getENUMGleissperreVorzugslage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeicheBetriebsart <em>ENUM Weiche Betriebsart</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeicheBetriebsart
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWeicheBetriebsart()
		 * @generated
		 */
		EEnum ENUM_WEICHE_BETRIEBSART = eINSTANCE.getENUMWeicheBetriebsart();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeichensignal <em>ENUM Weichensignal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeichensignal
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWeichensignal()
		 * @generated
		 */
		EEnum ENUM_WEICHENSIGNAL = eINSTANCE.getENUMWeichensignal();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrArt <em>ENUMW Kr Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrArt
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWKrArt()
		 * @generated
		 */
		EEnum ENUMW_KR_ART = eINSTANCE.getENUMWKrArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrGspStellart <em>ENUMW Kr Gsp Stellart</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrGspStellart
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWKrGspStellart()
		 * @generated
		 */
		EEnum ENUMW_KR_GSP_STELLART = eINSTANCE.getENUMWKrGspStellart();

		/**
		 * The meta object literal for the '<em>CAuswurfrichtung</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getCAuswurfrichtung()
		 * @generated
		 */
		EDataType CAUSWURFRICHTUNG = eINSTANCE.getCAuswurfrichtung();

		/**
		 * The meta object literal for the '<em>Elektrischer Antrieb Anzahl Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getElektrischer_Antrieb_Anzahl_Type()
		 * @generated
		 */
		EDataType ELEKTRISCHER_ANTRIEB_ANZAHL_TYPE = eINSTANCE.getElektrischer_Antrieb_Anzahl_Type();

		/**
		 * The meta object literal for the '<em>ENUM Besonderes Fahrwegelement Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMBesonderesFahrwegelement
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMBesonderesFahrwegelementObject()
		 * @generated
		 */
		EDataType ENUM_BESONDERES_FAHRWEGELEMENT_OBJECT = eINSTANCE.getENUMBesonderesFahrwegelementObject();

		/**
		 * The meta object literal for the '<em>ENUM Elektrischer Antrieb Lage Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElektrischerAntriebLage
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMElektrischerAntriebLageObject()
		 * @generated
		 */
		EDataType ENUM_ELEKTRISCHER_ANTRIEB_LAGE_OBJECT = eINSTANCE.getENUMElektrischerAntriebLageObject();

		/**
		 * The meta object literal for the '<em>ENUM Element Lage Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMElementLage
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMElementLageObject()
		 * @generated
		 */
		EDataType ENUM_ELEMENT_LAGE_OBJECT = eINSTANCE.getENUMElementLageObject();

		/**
		 * The meta object literal for the '<em>ENUM Gleis Abschluss Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleisAbschlussArt
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleisAbschlussArtObject()
		 * @generated
		 */
		EDataType ENUM_GLEIS_ABSCHLUSS_ART_OBJECT = eINSTANCE.getENUMGleisAbschlussArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Gleissperre Betriebsart Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreBetriebsart
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleissperreBetriebsartObject()
		 * @generated
		 */
		EDataType ENUM_GLEISSPERRE_BETRIEBSART_OBJECT = eINSTANCE.getENUMGleissperreBetriebsartObject();

		/**
		 * The meta object literal for the '<em>ENUM Gleissperrensignal Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperrensignal
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleissperrensignalObject()
		 * @generated
		 */
		EDataType ENUM_GLEISSPERRENSIGNAL_OBJECT = eINSTANCE.getENUMGleissperrensignalObject();

		/**
		 * The meta object literal for the '<em>ENUM Gleissperre Vorzugslage Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMGleissperreVorzugslage
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMGleissperreVorzugslageObject()
		 * @generated
		 */
		EDataType ENUM_GLEISSPERRE_VORZUGSLAGE_OBJECT = eINSTANCE.getENUMGleissperreVorzugslageObject();

		/**
		 * The meta object literal for the '<em>ENUM Weiche Betriebsart Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeicheBetriebsart
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWeicheBetriebsartObject()
		 * @generated
		 */
		EDataType ENUM_WEICHE_BETRIEBSART_OBJECT = eINSTANCE.getENUMWeicheBetriebsartObject();

		/**
		 * The meta object literal for the '<em>ENUM Weichensignal Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWeichensignal
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWeichensignalObject()
		 * @generated
		 */
		EDataType ENUM_WEICHENSIGNAL_OBJECT = eINSTANCE.getENUMWeichensignalObject();

		/**
		 * The meta object literal for the '<em>ENUMW Kr Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrArt
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWKrArtObject()
		 * @generated
		 */
		EDataType ENUMW_KR_ART_OBJECT = eINSTANCE.getENUMWKrArtObject();

		/**
		 * The meta object literal for the '<em>ENUMW Kr Gsp Stellart Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.ENUMWKrGspStellart
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getENUMWKrGspStellartObject()
		 * @generated
		 */
		EDataType ENUMW_KR_GSP_STELLART_OBJECT = eINSTANCE.getENUMWKrGspStellartObject();

		/**
		 * The meta object literal for the '<em>Geschwindigkeit LType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGeschwindigkeit_L_Type()
		 * @generated
		 */
		EDataType GESCHWINDIGKEIT_LTYPE = eINSTANCE.getGeschwindigkeit_L_Type();

		/**
		 * The meta object literal for the '<em>Geschwindigkeit RType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getGeschwindigkeit_R_Type()
		 * @generated
		 */
		EDataType GESCHWINDIGKEIT_RTYPE = eINSTANCE.getGeschwindigkeit_R_Type();

		/**
		 * The meta object literal for the '<em>Herzstueck Antriebe Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getHerzstueck_Antriebe_Type()
		 * @generated
		 */
		EDataType HERZSTUECK_ANTRIEBE_TYPE = eINSTANCE.getHerzstueck_Antriebe_Type();

		/**
		 * The meta object literal for the '<em>Isolierfall Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getIsolierfall_Type()
		 * @generated
		 */
		EDataType ISOLIERFALL_TYPE = eINSTANCE.getIsolierfall_Type();

		/**
		 * The meta object literal for the '<em>Kr Kr WSeitenzuordnung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getKr_KrW_Seitenzuordnung_Type()
		 * @generated
		 */
		EDataType KR_KR_WSEITENZUORDNUNG_TYPE = eINSTANCE.getKr_KrW_Seitenzuordnung_Type();

		/**
		 * The meta object literal for the '<em>Kreuzungsgleis Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getKreuzungsgleis_Type()
		 * @generated
		 */
		EDataType KREUZUNGSGLEIS_TYPE = eINSTANCE.getKreuzungsgleis_Type();

		/**
		 * The meta object literal for the '<em>Stammgleis Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getStammgleis_Type()
		 * @generated
		 */
		EDataType STAMMGLEIS_TYPE = eINSTANCE.getStammgleis_Type();

		/**
		 * The meta object literal for the '<em>WKr Grundform Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getW_Kr_Grundform_Type()
		 * @generated
		 */
		EDataType WKR_GRUNDFORM_TYPE = eINSTANCE.getW_Kr_Grundform_Type();

		/**
		 * The meta object literal for the '<em>Weiche Vorzugslage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getWeiche_Vorzugslage_Type()
		 * @generated
		 */
		EDataType WEICHE_VORZUGSLAGE_TYPE = eINSTANCE.getWeiche_Vorzugslage_Type();

		/**
		 * The meta object literal for the '<em>Zungenpruefkontakt Anzahl Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl#getZungenpruefkontakt_Anzahl_Type()
		 * @generated
		 */
		EDataType ZUNGENPRUEFKONTAKT_ANZAHL_TYPE = eINSTANCE.getZungenpruefkontakt_Anzahl_Type();

	}

} //Weichen_und_GleissperrenPackage
