/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten;

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
 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenFactory
 * @model kind="package"
 * @generated
 */
public interface GeodatenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Geodaten";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Geodaten/1.9.0.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsGeodaten";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeodatenPackage eINSTANCE = org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Bezeichnung_Strecke_TypeClassImpl <em>Bezeichnung Strecke Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Bezeichnung_Strecke_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getBezeichnung_Strecke_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_STRECKE_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_STRECKE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_STRECKE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Strecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_STRECKE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bezeichnung Strecke Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_STRECKE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Form_TypeClassImpl <em>GEO Form Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Form_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Form_TypeClass()
	 * @generated
	 */
	int GEO_FORM_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FORM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FORM_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GEO Form Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FORM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GEO Form Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FORM_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_KanteImpl <em>GEO Kante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_KanteImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Kante()
	 * @generated
	 */
	int GEO_KANTE = 2;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>GEO Kante Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE__GEO_KANTE_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDGEO Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE__IDGEO_ART = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDGEO Knoten A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE__IDGEO_KNOTEN_A = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>IDGEO Knoten B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE__IDGEO_KNOTEN_B = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>GEO Kante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>GEO Kante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Kante_Allg_AttributeGroupImpl <em>GEO Kante Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Kante_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	int GEO_KANTE_ALLG_ATTRIBUTE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>GEO Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_FORM = 0;

	/**
	 * The feature id for the '<em><b>GEO Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_LAENGE = 1;

	/**
	 * The feature id for the '<em><b>GEO Radius A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_A = 2;

	/**
	 * The feature id for the '<em><b>GEO Radius B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_B = 3;

	/**
	 * The feature id for the '<em><b>GEO Richtungswinkel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RICHTUNGSWINKEL = 4;

	/**
	 * The feature id for the '<em><b>Plan Quelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE = 5;

	/**
	 * The number of structural features of the '<em>GEO Kante Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>GEO Kante Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KANTE_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_KnotenImpl <em>GEO Knoten</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_KnotenImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Knoten()
	 * @generated
	 */
	int GEO_KNOTEN = 4;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KNOTEN__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KNOTEN__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KNOTEN__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KNOTEN__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>GEOPAD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KNOTEN__GEOPAD = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GEO Knoten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KNOTEN_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GEO Knoten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KNOTEN_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_KoordinatenSystem_LSys_TypeClassImpl <em>GEO Koordinaten System LSys Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_KoordinatenSystem_LSys_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_KoordinatenSystem_LSys_TypeClass()
	 * @generated
	 */
	int GEO_KOORDINATEN_SYSTEM_LSYS_TYPE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KOORDINATEN_SYSTEM_LSYS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KOORDINATEN_SYSTEM_LSYS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GEO Koordinaten System LSys Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KOORDINATEN_SYSTEM_LSYS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GEO Koordinaten System LSys Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KOORDINATEN_SYSTEM_LSYS_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_KoordinatenSystem_Sonstige_TypeClassImpl <em>GEO Koordinaten System Sonstige Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_KoordinatenSystem_Sonstige_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_KoordinatenSystem_Sonstige_TypeClass()
	 * @generated
	 */
	int GEO_KOORDINATEN_SYSTEM_SONSTIGE_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KOORDINATEN_SYSTEM_SONSTIGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KOORDINATEN_SYSTEM_SONSTIGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GEO Koordinaten System Sonstige Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KOORDINATEN_SYSTEM_SONSTIGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GEO Koordinaten System Sonstige Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_KOORDINATEN_SYSTEM_SONSTIGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Laenge_TypeClassImpl <em>GEO Laenge Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Laenge_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Laenge_TypeClass()
	 * @generated
	 */
	int GEO_LAENGE_TYPE_CLASS = 7;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LAENGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LAENGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GEO Laenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LAENGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GEO Laenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LAENGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_PAD_TypeClassImpl <em>GEO PAD Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_PAD_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_PAD_TypeClass()
	 * @generated
	 */
	int GEO_PAD_TYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PAD_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PAD_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GEO PAD Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PAD_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GEO PAD Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PAD_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_PunktImpl <em>GEO Punkt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_PunktImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Punkt()
	 * @generated
	 */
	int GEO_PUNKT = 9;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>GEO Punkt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT__GEO_PUNKT_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDGEO Knoten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT__IDGEO_KNOTEN = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GEO Punkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GEO Punkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl <em>GEO Punkt Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Punkt_Allg_AttributeGroup()
	 * @generated
	 */
	int GEO_PUNKT_ALLG_ATTRIBUTE_GROUP = 10;

	/**
	 * The feature id for the '<em><b>GKX</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX = 0;

	/**
	 * The feature id for the '<em><b>GKY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY = 1;

	/**
	 * The feature id for the '<em><b>GKZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ = 2;

	/**
	 * The feature id for the '<em><b>Plan Quelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE = 3;

	/**
	 * The feature id for the '<em><b>GEO Koordinaten System LSys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_LSYS = 4;

	/**
	 * The feature id for the '<em><b>GEO Koordinaten System Sonstige</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_SONSTIGE = 5;

	/**
	 * The number of structural features of the '<em>GEO Punkt Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>GEO Punkt Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_PUNKT_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Radius_A_TypeClassImpl <em>GEO Radius AType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Radius_A_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Radius_A_TypeClass()
	 * @generated
	 */
	int GEO_RADIUS_ATYPE_CLASS = 11;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_RADIUS_ATYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_RADIUS_ATYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GEO Radius AType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_RADIUS_ATYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GEO Radius AType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_RADIUS_ATYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Radius_B_TypeClassImpl <em>GEO Radius BType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Radius_B_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Radius_B_TypeClass()
	 * @generated
	 */
	int GEO_RADIUS_BTYPE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_RADIUS_BTYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_RADIUS_BTYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GEO Radius BType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_RADIUS_BTYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GEO Radius BType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_RADIUS_BTYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Richtungswinkel_TypeClassImpl <em>GEO Richtungswinkel Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Richtungswinkel_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Richtungswinkel_TypeClass()
	 * @generated
	 */
	int GEO_RICHTUNGSWINKEL_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_RICHTUNGSWINKEL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_RICHTUNGSWINKEL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GEO Richtungswinkel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_RICHTUNGSWINKEL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GEO Richtungswinkel Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_RICHTUNGSWINKEL_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Geschwindigkeit_TypeClassImpl <em>Geschwindigkeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Geschwindigkeit_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGeschwindigkeit_TypeClass()
	 * @generated
	 */
	int GESCHWINDIGKEIT_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geschwindigkeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Geschwindigkeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEIT_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GeschwindigkeitsprofilImpl <em>Geschwindigkeitsprofil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeschwindigkeitsprofilImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGeschwindigkeitsprofil()
	 * @generated
	 */
	int GESCHWINDIGKEITSPROFIL = 15;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEITSPROFIL__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEITSPROFIL__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEITSPROFIL__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEITSPROFIL__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEITSPROFIL__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>Geschwindigkeitsprofil Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEITSPROFIL__GESCHWINDIGKEITSPROFIL_ALLG = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geschwindigkeitsprofil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEITSPROFIL_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Geschwindigkeitsprofil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEITSPROFIL_OPERATION_COUNT = BasisobjektePackage.BEREICH_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Geschwindigkeitsprofil_Allg_AttributeGroupImpl <em>Geschwindigkeitsprofil Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Geschwindigkeitsprofil_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGeschwindigkeitsprofil_Allg_AttributeGroup()
	 * @generated
	 */
	int GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP = 16;

	/**
	 * The feature id for the '<em><b>Geschwindigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT = 0;

	/**
	 * The feature id for the '<em><b>VProfil Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART = 1;

	/**
	 * The feature id for the '<em><b>Wirkrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__WIRKRICHTUNG = 2;

	/**
	 * The number of structural features of the '<em>Geschwindigkeitsprofil Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Geschwindigkeitsprofil Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GK_X_TypeClassImpl <em>GK XType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GK_X_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGK_X_TypeClass()
	 * @generated
	 */
	int GK_XTYPE_CLASS = 17;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_XTYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_XTYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GK XType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_XTYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GK XType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_XTYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GK_Y_TypeClassImpl <em>GK YType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GK_Y_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGK_Y_TypeClass()
	 * @generated
	 */
	int GK_YTYPE_CLASS = 18;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_YTYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_YTYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GK YType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_YTYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GK YType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_YTYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GK_Z_TypeClassImpl <em>GK ZType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GK_Z_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGK_Z_TypeClass()
	 * @generated
	 */
	int GK_ZTYPE_CLASS = 19;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_ZTYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_ZTYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GK ZType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_ZTYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GK ZType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_ZTYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.HoehenlinieImpl <em>Hoehenlinie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.HoehenlinieImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenlinie()
	 * @generated
	 */
	int HOEHENLINIE = 20;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Hoehenlinie Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE__HOEHENLINIE_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Hoehenpunkt A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE__ID_HOEHENPUNKT_A = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Hoehenpunkt B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE__ID_HOEHENPUNKT_B = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hoehenlinie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hoehenlinie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Allg_AttributeGroupImpl <em>Hoehenlinie Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenlinie_Allg_AttributeGroup()
	 * @generated
	 */
	int HOEHENLINIE_ALLG_ATTRIBUTE_GROUP = 21;

	/**
	 * The feature id for the '<em><b>Hoehenlinie Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_FORM = 0;

	/**
	 * The feature id for the '<em><b>Hoehenlinie Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_LAENGE = 1;

	/**
	 * The feature id for the '<em><b>Plan Quelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE = 2;

	/**
	 * The number of structural features of the '<em>Hoehenlinie Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hoehenlinie Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Form_TypeClassImpl <em>Hoehenlinie Form Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Form_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenlinie_Form_TypeClass()
	 * @generated
	 */
	int HOEHENLINIE_FORM_TYPE_CLASS = 22;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_FORM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_FORM_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hoehenlinie Form Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_FORM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hoehenlinie Form Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_FORM_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Laenge_TypeClassImpl <em>Hoehenlinie Laenge Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Laenge_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenlinie_Laenge_TypeClass()
	 * @generated
	 */
	int HOEHENLINIE_LAENGE_TYPE_CLASS = 23;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_LAENGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_LAENGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hoehenlinie Laenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_LAENGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hoehenlinie Laenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENLINIE_LAENGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.HoehenpunktImpl <em>Hoehenpunkt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.HoehenpunktImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenpunkt()
	 * @generated
	 */
	int HOEHENPUNKT = 24;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>Hoehenpunkt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT__HOEHENPUNKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hoehenpunkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hoehenpunkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_OPERATION_COUNT = BasisobjektePackage.PUNKT_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenpunkt_Allg_AttributeGroupImpl <em>Hoehenpunkt Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Hoehenpunkt_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenpunkt_Allg_AttributeGroup()
	 * @generated
	 */
	int HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP = 25;

	/**
	 * The feature id for the '<em><b>GEOPAD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__GEOPAD = 0;

	/**
	 * The feature id for the '<em><b>Hoehenpunkt Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_DATUM = 1;

	/**
	 * The feature id for the '<em><b>Hoehenpunkt Hoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_HOEHE = 2;

	/**
	 * The feature id for the '<em><b>HSystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HSYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Neigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__NEIGUNG = 4;

	/**
	 * The feature id for the '<em><b>Plan Quelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE = 5;

	/**
	 * The number of structural features of the '<em>Hoehenpunkt Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Hoehenpunkt Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenpunkt_Datum_TypeClassImpl <em>Hoehenpunkt Datum Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Hoehenpunkt_Datum_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenpunkt_Datum_TypeClass()
	 * @generated
	 */
	int HOEHENPUNKT_DATUM_TYPE_CLASS = 26;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_DATUM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_DATUM_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hoehenpunkt Datum Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_DATUM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hoehenpunkt Datum Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_DATUM_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenpunkt_Hoehe_TypeClassImpl <em>Hoehenpunkt Hoehe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Hoehenpunkt_Hoehe_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenpunkt_Hoehe_TypeClass()
	 * @generated
	 */
	int HOEHENPUNKT_HOEHE_TYPE_CLASS = 27;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_HOEHE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_HOEHE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hoehenpunkt Hoehe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_HOEHE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hoehenpunkt Hoehe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOEHENPUNKT_HOEHE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.HSystem_TypeClassImpl <em>HSystem Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.HSystem_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHSystem_TypeClass()
	 * @generated
	 */
	int HSYSTEM_TYPE_CLASS = 28;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSYSTEM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSYSTEM_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HSystem Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSYSTEM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HSystem Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSYSTEM_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Knotenname_TypeClassImpl <em>Knotenname Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Knotenname_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getKnotenname_TypeClass()
	 * @generated
	 */
	int KNOTENNAME_TYPE_CLASS = 29;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOTENNAME_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOTENNAME_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Knotenname Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOTENNAME_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Knotenname Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOTENNAME_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Neigung_TypeClassImpl <em>Neigung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Neigung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getNeigung_TypeClass()
	 * @generated
	 */
	int NEIGUNG_TYPE_CLASS = 30;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEIGUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEIGUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neigung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEIGUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Neigung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEIGUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.OertlichkeitImpl <em>Oertlichkeit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.OertlichkeitImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit()
	 * @generated
	 */
	int OERTLICHKEIT = 31;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT__ID_OERTLICHKEIT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Strecke Punkt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT__ID_STRECKE_PUNKT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Oertlichkeit Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT__OERTLICHKEIT_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Oertlichkeit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Oertlichkeit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Abkuerzung_TypeClassImpl <em>Oertlichkeit Abkuerzung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Abkuerzung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Abkuerzung_TypeClass()
	 * @generated
	 */
	int OERTLICHKEIT_ABKUERZUNG_TYPE_CLASS = 32;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_ABKUERZUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_ABKUERZUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Oertlichkeit Abkuerzung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_ABKUERZUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Oertlichkeit Abkuerzung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_ABKUERZUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Allg_AttributeGroupImpl <em>Oertlichkeit Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Allg_AttributeGroup()
	 * @generated
	 */
	int OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP = 33;

	/**
	 * The feature id for the '<em><b>Oertlichkeit Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_ART = 0;

	/**
	 * The feature id for the '<em><b>Oertlichkeit Gueltig Ab</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_AB = 1;

	/**
	 * The feature id for the '<em><b>Oertlichkeit Gueltig Bis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_BIS = 2;

	/**
	 * The number of structural features of the '<em>Oertlichkeit Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Oertlichkeit Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Art_TypeClassImpl <em>Oertlichkeit Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Art_TypeClass()
	 * @generated
	 */
	int OERTLICHKEIT_ART_TYPE_CLASS = 34;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Oertlichkeit Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Oertlichkeit Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_ART_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Bezeichnung_AttributeGroupImpl <em>Oertlichkeit Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP = 35;

	/**
	 * The feature id for the '<em><b>Oertlichkeit Abkuerzung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG = 0;

	/**
	 * The feature id for the '<em><b>Oertlichkeit Kurzname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME = 1;

	/**
	 * The feature id for the '<em><b>Oertlichkeit Langname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME = 2;

	/**
	 * The number of structural features of the '<em>Oertlichkeit Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Oertlichkeit Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Gueltig_Ab_TypeClassImpl <em>Oertlichkeit Gueltig Ab Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Gueltig_Ab_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Gueltig_Ab_TypeClass()
	 * @generated
	 */
	int OERTLICHKEIT_GUELTIG_AB_TYPE_CLASS = 36;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_GUELTIG_AB_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_GUELTIG_AB_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Oertlichkeit Gueltig Ab Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_GUELTIG_AB_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Oertlichkeit Gueltig Ab Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_GUELTIG_AB_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Gueltig_Bis_TypeClassImpl <em>Oertlichkeit Gueltig Bis Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Gueltig_Bis_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Gueltig_Bis_TypeClass()
	 * @generated
	 */
	int OERTLICHKEIT_GUELTIG_BIS_TYPE_CLASS = 37;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_GUELTIG_BIS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_GUELTIG_BIS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Oertlichkeit Gueltig Bis Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_GUELTIG_BIS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Oertlichkeit Gueltig Bis Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_GUELTIG_BIS_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Kurzname_TypeClassImpl <em>Oertlichkeit Kurzname Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Kurzname_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Kurzname_TypeClass()
	 * @generated
	 */
	int OERTLICHKEIT_KURZNAME_TYPE_CLASS = 38;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_KURZNAME_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_KURZNAME_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Oertlichkeit Kurzname Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_KURZNAME_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Oertlichkeit Kurzname Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_KURZNAME_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Langname_TypeClassImpl <em>Oertlichkeit Langname Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Langname_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Langname_TypeClass()
	 * @generated
	 */
	int OERTLICHKEIT_LANGNAME_TYPE_CLASS = 39;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_LANGNAME_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_LANGNAME_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Oertlichkeit Langname Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_LANGNAME_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Oertlichkeit Langname Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OERTLICHKEIT_LANGNAME_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Plan_Quelle_TypeClassImpl <em>Plan Quelle Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Plan_Quelle_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getPlan_Quelle_TypeClass()
	 * @generated
	 */
	int PLAN_QUELLE_TYPE_CLASS = 40;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_QUELLE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_QUELLE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plan Quelle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_QUELLE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Plan Quelle Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_QUELLE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.StreckeImpl <em>Strecke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.StreckeImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getStrecke()
	 * @generated
	 */
	int STRECKE = 41;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE__BEZEICHNUNG = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strecke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Strecke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_OPERATION_COUNT = BasisobjektePackage.BEREICH_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Strecke_Bezeichnung_AttributeGroupImpl <em>Strecke Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Strecke_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getStrecke_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP = 42;

	/**
	 * The feature id for the '<em><b>Bezeichnung Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE = 0;

	/**
	 * The number of structural features of the '<em>Strecke Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Strecke Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Strecke_Meter_TypeClassImpl <em>Strecke Meter Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Strecke_Meter_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getStrecke_Meter_TypeClass()
	 * @generated
	 */
	int STRECKE_METER_TYPE_CLASS = 43;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_METER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_METER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strecke Meter Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_METER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Strecke Meter Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_METER_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Strecke_PunktImpl <em>Strecke Punkt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Strecke_PunktImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getStrecke_Punkt()
	 * @generated
	 */
	int STRECKE_PUNKT = 44;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_PUNKT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_PUNKT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_PUNKT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_PUNKT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDGEO Knoten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_PUNKT__IDGEO_KNOTEN = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_PUNKT__ID_STRECKE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Strecke Meter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_PUNKT__STRECKE_METER = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Strecke Punkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_PUNKT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Strecke Punkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRECKE_PUNKT_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TB_Art_TypeClassImpl <em>TB Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.TB_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTB_Art_TypeClass()
	 * @generated
	 */
	int TB_ART_TYPE_CLASS = 45;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TB Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TB Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_ART_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TB_Beschreibung_TypeClassImpl <em>TB Beschreibung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.TB_Beschreibung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTB_Beschreibung_TypeClass()
	 * @generated
	 */
	int TB_BESCHREIBUNG_TYPE_CLASS = 46;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_BESCHREIBUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_BESCHREIBUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TB Beschreibung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_BESCHREIBUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TB Beschreibung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_BESCHREIBUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Technischer_BereichImpl <em>Technischer Bereich</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Technischer_BereichImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTechnischer_Bereich()
	 * @generated
	 */
	int TECHNISCHER_BEREICH = 47;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_BEREICH__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_BEREICH__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_BEREICH__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_BEREICH__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_BEREICH__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>TB Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_BEREICH__TB_ART = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TB Beschreibung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_BEREICH__TB_BESCHREIBUNG = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Technischer Bereich</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_BEREICH_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Technischer Bereich</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_BEREICH_OPERATION_COUNT = BasisobjektePackage.BEREICH_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Technischer_PunktImpl <em>Technischer Punkt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Technischer_PunktImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTechnischer_Punkt()
	 * @generated
	 */
	int TECHNISCHER_PUNKT = 48;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_PUNKT__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_PUNKT__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_PUNKT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_PUNKT__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_PUNKT__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_PUNKT__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>TP Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_PUNKT__TP_ART = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TP Beschreibung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_PUNKT__TP_BESCHREIBUNG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Technischer Punkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_PUNKT_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Technischer Punkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNISCHER_PUNKT_OPERATION_COUNT = BasisobjektePackage.PUNKT_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TOP_Anschluss_A_TypeClassImpl <em>TOP Anschluss AType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.TOP_Anschluss_A_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Anschluss_A_TypeClass()
	 * @generated
	 */
	int TOP_ANSCHLUSS_ATYPE_CLASS = 49;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_ANSCHLUSS_ATYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_ANSCHLUSS_ATYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TOP Anschluss AType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_ANSCHLUSS_ATYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TOP Anschluss AType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_ANSCHLUSS_ATYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TOP_Anschluss_B_TypeClassImpl <em>TOP Anschluss BType Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.TOP_Anschluss_B_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Anschluss_B_TypeClass()
	 * @generated
	 */
	int TOP_ANSCHLUSS_BTYPE_CLASS = 50;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_ANSCHLUSS_BTYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_ANSCHLUSS_BTYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TOP Anschluss BType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_ANSCHLUSS_BTYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TOP Anschluss BType Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_ANSCHLUSS_BTYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TOP_KanteImpl <em>TOP Kante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.TOP_KanteImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Kante()
	 * @generated
	 */
	int TOP_KANTE = 51;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDTOP Knoten A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE__IDTOP_KNOTEN_A = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDTOP Knoten B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE__IDTOP_KNOTEN_B = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>TOP Kante Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE__TOP_KANTE_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TOP Kante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TOP Kante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TOP_Kante_Allg_AttributeGroupImpl <em>TOP Kante Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.TOP_Kante_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	int TOP_KANTE_ALLG_ATTRIBUTE_GROUP = 52;

	/**
	 * The feature id for the '<em><b>TOP Anschluss A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_A = 0;

	/**
	 * The feature id for the '<em><b>TOP Anschluss B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_B = 1;

	/**
	 * The feature id for the '<em><b>TOP Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_LAENGE = 2;

	/**
	 * The number of structural features of the '<em>TOP Kante Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TOP Kante Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KANTE_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TOP_KnotenImpl <em>TOP Knoten</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.TOP_KnotenImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Knoten()
	 * @generated
	 */
	int TOP_KNOTEN = 53;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KNOTEN__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KNOTEN__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KNOTEN__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KNOTEN__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDGEO Knoten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KNOTEN__IDGEO_KNOTEN = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Knotenname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KNOTEN__KNOTENNAME = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TOP Knoten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KNOTEN_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TOP Knoten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_KNOTEN_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TOP_Laenge_TypeClassImpl <em>TOP Laenge Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.TOP_Laenge_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Laenge_TypeClass()
	 * @generated
	 */
	int TOP_LAENGE_TYPE_CLASS = 54;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAENGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAENGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TOP Laenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAENGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TOP Laenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAENGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TP_Art_TypeClassImpl <em>TP Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.TP_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTP_Art_TypeClass()
	 * @generated
	 */
	int TP_ART_TYPE_CLASS = 55;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TP Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TP Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_ART_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TP_Beschreibung_TypeClassImpl <em>TP Beschreibung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.TP_Beschreibung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTP_Beschreibung_TypeClass()
	 * @generated
	 */
	int TP_BESCHREIBUNG_TYPE_CLASS = 56;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_BESCHREIBUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_BESCHREIBUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TP Beschreibung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_BESCHREIBUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TP Beschreibung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_BESCHREIBUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.UeberhoehungImpl <em>Ueberhoehung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.UeberhoehungImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehung()
	 * @generated
	 */
	int UEBERHOEHUNG = 57;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>Ueberhoehung Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG__UEBERHOEHUNG_ALLG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ueberhoehung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ueberhoehung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_OPERATION_COUNT = BasisobjektePackage.PUNKT_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehung_Allg_AttributeGroupImpl <em>Ueberhoehung Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehung_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehung_Allg_AttributeGroup()
	 * @generated
	 */
	int UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP = 58;

	/**
	 * The feature id for the '<em><b>GEOPAD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__GEOPAD = 0;

	/**
	 * The feature id for the '<em><b>Plan Quelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE = 1;

	/**
	 * The feature id for the '<em><b>Ueberhoehung Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_DATUM = 2;

	/**
	 * The feature id for the '<em><b>Ueberhoehung Hoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_HOEHE = 3;

	/**
	 * The number of structural features of the '<em>Ueberhoehung Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ueberhoehung Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehung_Datum_TypeClassImpl <em>Ueberhoehung Datum Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehung_Datum_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehung_Datum_TypeClass()
	 * @generated
	 */
	int UEBERHOEHUNG_DATUM_TYPE_CLASS = 59;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_DATUM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_DATUM_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ueberhoehung Datum Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_DATUM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ueberhoehung Datum Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_DATUM_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehung_Hoehe_TypeClassImpl <em>Ueberhoehung Hoehe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehung_Hoehe_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehung_Hoehe_TypeClass()
	 * @generated
	 */
	int UEBERHOEHUNG_HOEHE_TYPE_CLASS = 60;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_HOEHE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_HOEHE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ueberhoehung Hoehe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_HOEHE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ueberhoehung Hoehe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNG_HOEHE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.UeberhoehungslinieImpl <em>Ueberhoehungslinie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.UeberhoehungslinieImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehungslinie()
	 * @generated
	 */
	int UEBERHOEHUNGSLINIE = 61;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Ueberhoehung A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Ueberhoehung B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ueberhoehungslinie Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ueberhoehungslinie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ueberhoehungslinie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Allg_AttributeGroupImpl <em>Ueberhoehungslinie Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehungslinie_Allg_AttributeGroup()
	 * @generated
	 */
	int UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP = 62;

	/**
	 * The feature id for the '<em><b>Plan Quelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE = 0;

	/**
	 * The feature id for the '<em><b>Ueberhoehungslinie Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_FORM = 1;

	/**
	 * The feature id for the '<em><b>Ueberhoehungslinie Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_LAENGE = 2;

	/**
	 * The number of structural features of the '<em>Ueberhoehungslinie Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ueberhoehungslinie Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Form_TypeClassImpl <em>Ueberhoehungslinie Form Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Form_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehungslinie_Form_TypeClass()
	 * @generated
	 */
	int UEBERHOEHUNGSLINIE_FORM_TYPE_CLASS = 63;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_FORM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_FORM_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ueberhoehungslinie Form Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_FORM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ueberhoehungslinie Form Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_FORM_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Laenge_TypeClassImpl <em>Ueberhoehungslinie Laenge Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Laenge_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehungslinie_Laenge_TypeClass()
	 * @generated
	 */
	int UEBERHOEHUNGSLINIE_LAENGE_TYPE_CLASS = 64;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_LAENGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_LAENGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ueberhoehungslinie Laenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_LAENGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ueberhoehungslinie Laenge Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEBERHOEHUNGSLINIE_LAENGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.V_Profil_Art_TypeClassImpl <em>VProfil Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.V_Profil_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getV_Profil_Art_TypeClass()
	 * @generated
	 */
	int VPROFIL_ART_TYPE_CLASS = 65;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPROFIL_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPROFIL_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VProfil Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPROFIL_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VProfil Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPROFIL_ART_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Wirkrichtung_TypeClassImpl <em>Wirkrichtung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.Wirkrichtung_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getWirkrichtung_TypeClass()
	 * @generated
	 */
	int WIRKRICHTUNG_TYPE_CLASS = 66;

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
	 * The number of operations of the '<em>Wirkrichtung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRKRICHTUNG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMGEOForm <em>ENUMGEO Form</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMGEOForm
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMGEOForm()
	 * @generated
	 */
	int ENUMGEO_FORM = 67;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMHoehenlinieForm <em>ENUM Hoehenlinie Form</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMHoehenlinieForm
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMHoehenlinieForm()
	 * @generated
	 */
	int ENUM_HOEHENLINIE_FORM = 68;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMHSystem <em>ENUMH System</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMHSystem
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMHSystem()
	 * @generated
	 */
	int ENUMH_SYSTEM = 69;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMOertlichkeitArt <em>ENUM Oertlichkeit Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMOertlichkeitArt
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMOertlichkeitArt()
	 * @generated
	 */
	int ENUM_OERTLICHKEIT_ART = 70;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMPlanQuelle <em>ENUM Plan Quelle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMPlanQuelle
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMPlanQuelle()
	 * @generated
	 */
	int ENUM_PLAN_QUELLE = 71;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMTBArt <em>ENUMTB Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTBArt
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMTBArt()
	 * @generated
	 */
	int ENUMTB_ART = 72;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMTOPAnschluss <em>ENUMTOP Anschluss</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTOPAnschluss
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMTOPAnschluss()
	 * @generated
	 */
	int ENUMTOP_ANSCHLUSS = 73;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMTPArt <em>ENUMTP Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTPArt
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMTPArt()
	 * @generated
	 */
	int ENUMTP_ART = 74;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMUeberhoehungslinieForm <em>ENUM Ueberhoehungslinie Form</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMUeberhoehungslinieForm
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMUeberhoehungslinieForm()
	 * @generated
	 */
	int ENUM_UEBERHOEHUNGSLINIE_FORM = 75;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMVProfilArt <em>ENUMV Profil Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMVProfilArt
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMVProfilArt()
	 * @generated
	 */
	int ENUMV_PROFIL_ART = 76;

	/**
	 * The meta object id for the '<em>Bezeichnung Strecke Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getBezeichnung_Strecke_Type()
	 * @generated
	 */
	int BEZEICHNUNG_STRECKE_TYPE = 77;

	/**
	 * The meta object id for the '<em>ENUMGEO Form Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMGEOForm
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMGEOFormObject()
	 * @generated
	 */
	int ENUMGEO_FORM_OBJECT = 78;

	/**
	 * The meta object id for the '<em>ENUM Hoehenlinie Form Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMHoehenlinieForm
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMHoehenlinieFormObject()
	 * @generated
	 */
	int ENUM_HOEHENLINIE_FORM_OBJECT = 79;

	/**
	 * The meta object id for the '<em>ENUMH System Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMHSystem
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMHSystemObject()
	 * @generated
	 */
	int ENUMH_SYSTEM_OBJECT = 80;

	/**
	 * The meta object id for the '<em>ENUM Oertlichkeit Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMOertlichkeitArt
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMOertlichkeitArtObject()
	 * @generated
	 */
	int ENUM_OERTLICHKEIT_ART_OBJECT = 81;

	/**
	 * The meta object id for the '<em>ENUM Plan Quelle Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMPlanQuelle
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMPlanQuelleObject()
	 * @generated
	 */
	int ENUM_PLAN_QUELLE_OBJECT = 82;

	/**
	 * The meta object id for the '<em>ENUMTB Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTBArt
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMTBArtObject()
	 * @generated
	 */
	int ENUMTB_ART_OBJECT = 83;

	/**
	 * The meta object id for the '<em>ENUMTOP Anschluss Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTOPAnschluss
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMTOPAnschlussObject()
	 * @generated
	 */
	int ENUMTOP_ANSCHLUSS_OBJECT = 84;

	/**
	 * The meta object id for the '<em>ENUMTP Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTPArt
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMTPArtObject()
	 * @generated
	 */
	int ENUMTP_ART_OBJECT = 85;

	/**
	 * The meta object id for the '<em>ENUM Ueberhoehungslinie Form Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMUeberhoehungslinieForm
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMUeberhoehungslinieFormObject()
	 * @generated
	 */
	int ENUM_UEBERHOEHUNGSLINIE_FORM_OBJECT = 86;

	/**
	 * The meta object id for the '<em>ENUMV Profil Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMVProfilArt
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMVProfilArtObject()
	 * @generated
	 */
	int ENUMV_PROFIL_ART_OBJECT = 87;

	/**
	 * The meta object id for the '<em>GEO Koordinaten System LSys Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_KoordinatenSystem_LSys_Type()
	 * @generated
	 */
	int GEO_KOORDINATEN_SYSTEM_LSYS_TYPE = 88;

	/**
	 * The meta object id for the '<em>GEO Koordinaten System Sonstige Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_KoordinatenSystem_Sonstige_Type()
	 * @generated
	 */
	int GEO_KOORDINATEN_SYSTEM_SONSTIGE_TYPE = 89;

	/**
	 * The meta object id for the '<em>GEO Laenge Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Laenge_Type()
	 * @generated
	 */
	int GEO_LAENGE_TYPE = 90;

	/**
	 * The meta object id for the '<em>GEO PAD Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_PAD_Type()
	 * @generated
	 */
	int GEO_PAD_TYPE = 91;

	/**
	 * The meta object id for the '<em>GEO Radius AType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Radius_A_Type()
	 * @generated
	 */
	int GEO_RADIUS_ATYPE = 92;

	/**
	 * The meta object id for the '<em>GEO Radius BType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Radius_B_Type()
	 * @generated
	 */
	int GEO_RADIUS_BTYPE = 93;

	/**
	 * The meta object id for the '<em>GEO Richtungswinkel Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Richtungswinkel_Type()
	 * @generated
	 */
	int GEO_RICHTUNGSWINKEL_TYPE = 94;

	/**
	 * The meta object id for the '<em>Geschwindigkeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGeschwindigkeit_Type()
	 * @generated
	 */
	int GESCHWINDIGKEIT_TYPE = 95;

	/**
	 * The meta object id for the '<em>GK XType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGK_X_Type()
	 * @generated
	 */
	int GK_XTYPE = 96;

	/**
	 * The meta object id for the '<em>GK YType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGK_Y_Type()
	 * @generated
	 */
	int GK_YTYPE = 97;

	/**
	 * The meta object id for the '<em>GK ZType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGK_Z_Type()
	 * @generated
	 */
	int GK_ZTYPE = 98;

	/**
	 * The meta object id for the '<em>Hoehenlinie Laenge Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenlinie_Laenge_Type()
	 * @generated
	 */
	int HOEHENLINIE_LAENGE_TYPE = 99;

	/**
	 * The meta object id for the '<em>Hoehenpunkt Hoehe Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenpunkt_Hoehe_Type()
	 * @generated
	 */
	int HOEHENPUNKT_HOEHE_TYPE = 100;

	/**
	 * The meta object id for the '<em>Knotenname Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getKnotenname_Type()
	 * @generated
	 */
	int KNOTENNAME_TYPE = 101;

	/**
	 * The meta object id for the '<em>Neigung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getNeigung_Type()
	 * @generated
	 */
	int NEIGUNG_TYPE = 102;

	/**
	 * The meta object id for the '<em>Oertlichkeit Abkuerzung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Abkuerzung_Type()
	 * @generated
	 */
	int OERTLICHKEIT_ABKUERZUNG_TYPE = 103;

	/**
	 * The meta object id for the '<em>Oertlichkeit Kurzname Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Kurzname_Type()
	 * @generated
	 */
	int OERTLICHKEIT_KURZNAME_TYPE = 104;

	/**
	 * The meta object id for the '<em>Oertlichkeit Langname Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Langname_Type()
	 * @generated
	 */
	int OERTLICHKEIT_LANGNAME_TYPE = 105;

	/**
	 * The meta object id for the '<em>Strecke Meter Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getStrecke_Meter_Type()
	 * @generated
	 */
	int STRECKE_METER_TYPE = 106;

	/**
	 * The meta object id for the '<em>TB Beschreibung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTB_Beschreibung_Type()
	 * @generated
	 */
	int TB_BESCHREIBUNG_TYPE = 107;

	/**
	 * The meta object id for the '<em>TOP Laenge Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Laenge_Type()
	 * @generated
	 */
	int TOP_LAENGE_TYPE = 108;

	/**
	 * The meta object id for the '<em>TP Beschreibung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTP_Beschreibung_Type()
	 * @generated
	 */
	int TP_BESCHREIBUNG_TYPE = 109;

	/**
	 * The meta object id for the '<em>Ueberhoehung Hoehe Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehung_Hoehe_Type()
	 * @generated
	 */
	int UEBERHOEHUNG_HOEHE_TYPE = 110;

	/**
	 * The meta object id for the '<em>Ueberhoehungslinie Laenge Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehungslinie_Laenge_Type()
	 * @generated
	 */
	int UEBERHOEHUNGSLINIE_LAENGE_TYPE = 111;

	/**
	 * The meta object id for the '<em>Wirkrichtung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.BasisTypen.ENUMWirkrichtung
	 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getWirkrichtung_Type()
	 * @generated
	 */
	int WIRKRICHTUNG_TYPE = 112;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Bezeichnung_Strecke_TypeClass <em>Bezeichnung Strecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Strecke Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Bezeichnung_Strecke_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Strecke_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Bezeichnung_Strecke_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Bezeichnung_Strecke_TypeClass#getWert()
	 * @see #getBezeichnung_Strecke_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Strecke_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Form_TypeClass <em>GEO Form Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEO Form Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Form_TypeClass
	 * @generated
	 */
	EClass getGEO_Form_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Form_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Form_TypeClass#getWert()
	 * @see #getGEO_Form_TypeClass()
	 * @generated
	 */
	EAttribute getGEO_Form_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante <em>GEO Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEO Kante</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante
	 * @generated
	 */
	EClass getGEO_Kante();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante#getGEOKanteAllg <em>GEO Kante Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GEO Kante Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante#getGEOKanteAllg()
	 * @see #getGEO_Kante()
	 * @generated
	 */
	EReference getGEO_Kante_GEOKanteAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante#getIDGEOArt <em>IDGEO Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDGEO Art</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante#getIDGEOArt()
	 * @see #getGEO_Kante()
	 * @generated
	 */
	EReference getGEO_Kante_IDGEOArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante#getIDGEOKnotenA <em>IDGEO Knoten A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDGEO Knoten A</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante#getIDGEOKnotenA()
	 * @see #getGEO_Kante()
	 * @generated
	 */
	EReference getGEO_Kante_IDGEOKnotenA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante#getIDGEOKnotenB <em>IDGEO Knoten B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDGEO Knoten B</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante#getIDGEOKnotenB()
	 * @see #getGEO_Kante()
	 * @generated
	 */
	EReference getGEO_Kante_IDGEOKnotenB();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup <em>GEO Kante Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEO Kante Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup
	 * @generated
	 */
	EClass getGEO_Kante_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEOForm <em>GEO Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GEO Form</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEOForm()
	 * @see #getGEO_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGEO_Kante_Allg_AttributeGroup_GEOForm();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEOLaenge <em>GEO Laenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GEO Laenge</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEOLaenge()
	 * @see #getGEO_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGEO_Kante_Allg_AttributeGroup_GEOLaenge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEORadiusA <em>GEO Radius A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GEO Radius A</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEORadiusA()
	 * @see #getGEO_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGEO_Kante_Allg_AttributeGroup_GEORadiusA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEORadiusB <em>GEO Radius B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GEO Radius B</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEORadiusB()
	 * @see #getGEO_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGEO_Kante_Allg_AttributeGroup_GEORadiusB();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEORichtungswinkel <em>GEO Richtungswinkel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GEO Richtungswinkel</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEORichtungswinkel()
	 * @see #getGEO_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGEO_Kante_Allg_AttributeGroup_GEORichtungswinkel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Quelle</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup#getPlanQuelle()
	 * @see #getGEO_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGEO_Kante_Allg_AttributeGroup_PlanQuelle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Knoten <em>GEO Knoten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEO Knoten</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Knoten
	 * @generated
	 */
	EClass getGEO_Knoten();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Knoten#getGEOPAD <em>GEOPAD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GEOPAD</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Knoten#getGEOPAD()
	 * @see #getGEO_Knoten()
	 * @generated
	 */
	EReference getGEO_Knoten_GEOPAD();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_LSys_TypeClass <em>GEO Koordinaten System LSys Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEO Koordinaten System LSys Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_LSys_TypeClass
	 * @generated
	 */
	EClass getGEO_KoordinatenSystem_LSys_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_LSys_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_LSys_TypeClass#getWert()
	 * @see #getGEO_KoordinatenSystem_LSys_TypeClass()
	 * @generated
	 */
	EAttribute getGEO_KoordinatenSystem_LSys_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_Sonstige_TypeClass <em>GEO Koordinaten System Sonstige Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEO Koordinaten System Sonstige Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_Sonstige_TypeClass
	 * @generated
	 */
	EClass getGEO_KoordinatenSystem_Sonstige_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_Sonstige_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_Sonstige_TypeClass#getWert()
	 * @see #getGEO_KoordinatenSystem_Sonstige_TypeClass()
	 * @generated
	 */
	EAttribute getGEO_KoordinatenSystem_Sonstige_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Laenge_TypeClass <em>GEO Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEO Laenge Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Laenge_TypeClass
	 * @generated
	 */
	EClass getGEO_Laenge_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Laenge_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Laenge_TypeClass#getWert()
	 * @see #getGEO_Laenge_TypeClass()
	 * @generated
	 */
	EAttribute getGEO_Laenge_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_PAD_TypeClass <em>GEO PAD Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEO PAD Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_PAD_TypeClass
	 * @generated
	 */
	EClass getGEO_PAD_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.GEO_PAD_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_PAD_TypeClass#getWert()
	 * @see #getGEO_PAD_TypeClass()
	 * @generated
	 */
	EAttribute getGEO_PAD_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt <em>GEO Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEO Punkt</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Punkt
	 * @generated
	 */
	EClass getGEO_Punkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt#getGEOPunktAllg <em>GEO Punkt Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GEO Punkt Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Punkt#getGEOPunktAllg()
	 * @see #getGEO_Punkt()
	 * @generated
	 */
	EReference getGEO_Punkt_GEOPunktAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt#getIDGEOKnoten <em>IDGEO Knoten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDGEO Knoten</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Punkt#getIDGEOKnoten()
	 * @see #getGEO_Punkt()
	 * @generated
	 */
	EReference getGEO_Punkt_IDGEOKnoten();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup <em>GEO Punkt Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEO Punkt Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup
	 * @generated
	 */
	EClass getGEO_Punkt_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKX <em>GKX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GKX</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKX()
	 * @see #getGEO_Punkt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGEO_Punkt_Allg_AttributeGroup_GKX();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKY <em>GKY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GKY</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKY()
	 * @see #getGEO_Punkt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGEO_Punkt_Allg_AttributeGroup_GKY();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKZ <em>GKZ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GKZ</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKZ()
	 * @see #getGEO_Punkt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGEO_Punkt_Allg_AttributeGroup_GKZ();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Quelle</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getPlanQuelle()
	 * @see #getGEO_Punkt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGEO_Punkt_Allg_AttributeGroup_PlanQuelle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGEOKoordinatenSystemLSys <em>GEO Koordinaten System LSys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GEO Koordinaten System LSys</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGEOKoordinatenSystemLSys()
	 * @see #getGEO_Punkt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGEO_Punkt_Allg_AttributeGroup_GEOKoordinatenSystemLSys();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGEOKoordinatenSystemSonstige <em>GEO Koordinaten System Sonstige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GEO Koordinaten System Sonstige</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGEOKoordinatenSystemSonstige()
	 * @see #getGEO_Punkt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGEO_Punkt_Allg_AttributeGroup_GEOKoordinatenSystemSonstige();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Radius_A_TypeClass <em>GEO Radius AType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEO Radius AType Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Radius_A_TypeClass
	 * @generated
	 */
	EClass getGEO_Radius_A_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Radius_A_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Radius_A_TypeClass#getWert()
	 * @see #getGEO_Radius_A_TypeClass()
	 * @generated
	 */
	EAttribute getGEO_Radius_A_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Radius_B_TypeClass <em>GEO Radius BType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEO Radius BType Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Radius_B_TypeClass
	 * @generated
	 */
	EClass getGEO_Radius_B_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Radius_B_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Radius_B_TypeClass#getWert()
	 * @see #getGEO_Radius_B_TypeClass()
	 * @generated
	 */
	EAttribute getGEO_Radius_B_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Richtungswinkel_TypeClass <em>GEO Richtungswinkel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEO Richtungswinkel Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Richtungswinkel_TypeClass
	 * @generated
	 */
	EClass getGEO_Richtungswinkel_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Richtungswinkel_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GEO_Richtungswinkel_TypeClass#getWert()
	 * @see #getGEO_Richtungswinkel_TypeClass()
	 * @generated
	 */
	EAttribute getGEO_Richtungswinkel_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeit_TypeClass <em>Geschwindigkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geschwindigkeit Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Geschwindigkeit_TypeClass
	 * @generated
	 */
	EClass getGeschwindigkeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Geschwindigkeit_TypeClass#getWert()
	 * @see #getGeschwindigkeit_TypeClass()
	 * @generated
	 */
	EAttribute getGeschwindigkeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil <em>Geschwindigkeitsprofil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geschwindigkeitsprofil</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil
	 * @generated
	 */
	EClass getGeschwindigkeitsprofil();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil#getGeschwindigkeitsprofilAllg <em>Geschwindigkeitsprofil Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschwindigkeitsprofil Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil#getGeschwindigkeitsprofilAllg()
	 * @see #getGeschwindigkeitsprofil()
	 * @generated
	 */
	EReference getGeschwindigkeitsprofil_GeschwindigkeitsprofilAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup <em>Geschwindigkeitsprofil Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geschwindigkeitsprofil Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup
	 * @generated
	 */
	EClass getGeschwindigkeitsprofil_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getGeschwindigkeit <em>Geschwindigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschwindigkeit</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getGeschwindigkeit()
	 * @see #getGeschwindigkeitsprofil_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGeschwindigkeitsprofil_Allg_AttributeGroup_Geschwindigkeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getVProfilArt <em>VProfil Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VProfil Art</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getVProfilArt()
	 * @see #getGeschwindigkeitsprofil_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGeschwindigkeitsprofil_Allg_AttributeGroup_VProfilArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getWirkrichtung <em>Wirkrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wirkrichtung</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getWirkrichtung()
	 * @see #getGeschwindigkeitsprofil_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getGeschwindigkeitsprofil_Allg_AttributeGroup_Wirkrichtung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GK_X_TypeClass <em>GK XType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GK XType Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GK_X_TypeClass
	 * @generated
	 */
	EClass getGK_X_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.GK_X_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GK_X_TypeClass#getWert()
	 * @see #getGK_X_TypeClass()
	 * @generated
	 */
	EAttribute getGK_X_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GK_Y_TypeClass <em>GK YType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GK YType Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GK_Y_TypeClass
	 * @generated
	 */
	EClass getGK_Y_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.GK_Y_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GK_Y_TypeClass#getWert()
	 * @see #getGK_Y_TypeClass()
	 * @generated
	 */
	EAttribute getGK_Y_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.GK_Z_TypeClass <em>GK ZType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GK ZType Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GK_Z_TypeClass
	 * @generated
	 */
	EClass getGK_Z_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.GK_Z_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.GK_Z_TypeClass#getWert()
	 * @see #getGK_Z_TypeClass()
	 * @generated
	 */
	EAttribute getGK_Z_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie <em>Hoehenlinie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hoehenlinie</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie
	 * @generated
	 */
	EClass getHoehenlinie();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie#getHoehenlinieAllg <em>Hoehenlinie Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hoehenlinie Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie#getHoehenlinieAllg()
	 * @see #getHoehenlinie()
	 * @generated
	 */
	EReference getHoehenlinie_HoehenlinieAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie#getIDHoehenpunktA <em>ID Hoehenpunkt A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Hoehenpunkt A</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie#getIDHoehenpunktA()
	 * @see #getHoehenlinie()
	 * @generated
	 */
	EReference getHoehenlinie_IDHoehenpunktA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie#getIDHoehenpunktB <em>ID Hoehenpunkt B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Hoehenpunkt B</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie#getIDHoehenpunktB()
	 * @see #getHoehenlinie()
	 * @generated
	 */
	EReference getHoehenlinie_IDHoehenpunktB();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Allg_AttributeGroup <em>Hoehenlinie Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hoehenlinie Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Allg_AttributeGroup
	 * @generated
	 */
	EClass getHoehenlinie_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Allg_AttributeGroup#getHoehenlinieForm <em>Hoehenlinie Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hoehenlinie Form</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Allg_AttributeGroup#getHoehenlinieForm()
	 * @see #getHoehenlinie_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getHoehenlinie_Allg_AttributeGroup_HoehenlinieForm();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Allg_AttributeGroup#getHoehenlinieLaenge <em>Hoehenlinie Laenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hoehenlinie Laenge</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Allg_AttributeGroup#getHoehenlinieLaenge()
	 * @see #getHoehenlinie_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getHoehenlinie_Allg_AttributeGroup_HoehenlinieLaenge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Quelle</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Allg_AttributeGroup#getPlanQuelle()
	 * @see #getHoehenlinie_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getHoehenlinie_Allg_AttributeGroup_PlanQuelle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Form_TypeClass <em>Hoehenlinie Form Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hoehenlinie Form Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Form_TypeClass
	 * @generated
	 */
	EClass getHoehenlinie_Form_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Form_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Form_TypeClass#getWert()
	 * @see #getHoehenlinie_Form_TypeClass()
	 * @generated
	 */
	EAttribute getHoehenlinie_Form_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Laenge_TypeClass <em>Hoehenlinie Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hoehenlinie Laenge Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Laenge_TypeClass
	 * @generated
	 */
	EClass getHoehenlinie_Laenge_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Laenge_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Laenge_TypeClass#getWert()
	 * @see #getHoehenlinie_Laenge_TypeClass()
	 * @generated
	 */
	EAttribute getHoehenlinie_Laenge_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt <em>Hoehenpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hoehenpunkt</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt
	 * @generated
	 */
	EClass getHoehenpunkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt#getHoehenpunktAllg <em>Hoehenpunkt Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hoehenpunkt Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt#getHoehenpunktAllg()
	 * @see #getHoehenpunkt()
	 * @generated
	 */
	EReference getHoehenpunkt_HoehenpunktAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup <em>Hoehenpunkt Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hoehenpunkt Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup
	 * @generated
	 */
	EClass getHoehenpunkt_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getGEOPAD <em>GEOPAD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GEOPAD</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getGEOPAD()
	 * @see #getHoehenpunkt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getHoehenpunkt_Allg_AttributeGroup_GEOPAD();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getHoehenpunktDatum <em>Hoehenpunkt Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hoehenpunkt Datum</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getHoehenpunktDatum()
	 * @see #getHoehenpunkt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getHoehenpunkt_Allg_AttributeGroup_HoehenpunktDatum();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getHoehenpunktHoehe <em>Hoehenpunkt Hoehe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hoehenpunkt Hoehe</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getHoehenpunktHoehe()
	 * @see #getHoehenpunkt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getHoehenpunkt_Allg_AttributeGroup_HoehenpunktHoehe();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getHSystem <em>HSystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HSystem</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getHSystem()
	 * @see #getHoehenpunkt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getHoehenpunkt_Allg_AttributeGroup_HSystem();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getNeigung <em>Neigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Neigung</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getNeigung()
	 * @see #getHoehenpunkt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getHoehenpunkt_Allg_AttributeGroup_Neigung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Quelle</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getPlanQuelle()
	 * @see #getHoehenpunkt_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getHoehenpunkt_Allg_AttributeGroup_PlanQuelle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Datum_TypeClass <em>Hoehenpunkt Datum Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hoehenpunkt Datum Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Datum_TypeClass
	 * @generated
	 */
	EClass getHoehenpunkt_Datum_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Datum_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Datum_TypeClass#getWert()
	 * @see #getHoehenpunkt_Datum_TypeClass()
	 * @generated
	 */
	EAttribute getHoehenpunkt_Datum_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Hoehe_TypeClass <em>Hoehenpunkt Hoehe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hoehenpunkt Hoehe Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Hoehe_TypeClass
	 * @generated
	 */
	EClass getHoehenpunkt_Hoehe_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Hoehe_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt_Hoehe_TypeClass#getWert()
	 * @see #getHoehenpunkt_Hoehe_TypeClass()
	 * @generated
	 */
	EAttribute getHoehenpunkt_Hoehe_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.HSystem_TypeClass <em>HSystem Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSystem Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.HSystem_TypeClass
	 * @generated
	 */
	EClass getHSystem_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.HSystem_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.HSystem_TypeClass#getWert()
	 * @see #getHSystem_TypeClass()
	 * @generated
	 */
	EAttribute getHSystem_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Knotenname_TypeClass <em>Knotenname Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knotenname Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Knotenname_TypeClass
	 * @generated
	 */
	EClass getKnotenname_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Knotenname_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Knotenname_TypeClass#getWert()
	 * @see #getKnotenname_TypeClass()
	 * @generated
	 */
	EAttribute getKnotenname_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Neigung_TypeClass <em>Neigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neigung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Neigung_TypeClass
	 * @generated
	 */
	EClass getNeigung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Neigung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Neigung_TypeClass#getWert()
	 * @see #getNeigung_TypeClass()
	 * @generated
	 */
	EAttribute getNeigung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit <em>Oertlichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oertlichkeit</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit
	 * @generated
	 */
	EClass getOertlichkeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit#getBezeichnung()
	 * @see #getOertlichkeit()
	 * @generated
	 */
	EReference getOertlichkeit_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit#getIDOertlichkeit <em>ID Oertlichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Oertlichkeit</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit#getIDOertlichkeit()
	 * @see #getOertlichkeit()
	 * @generated
	 */
	EReference getOertlichkeit_IDOertlichkeit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit#getIDStreckePunkt <em>ID Strecke Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Strecke Punkt</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit#getIDStreckePunkt()
	 * @see #getOertlichkeit()
	 * @generated
	 */
	EReference getOertlichkeit_IDStreckePunkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit#getOertlichkeitAllg <em>Oertlichkeit Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oertlichkeit Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit#getOertlichkeitAllg()
	 * @see #getOertlichkeit()
	 * @generated
	 */
	EReference getOertlichkeit_OertlichkeitAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Abkuerzung_TypeClass <em>Oertlichkeit Abkuerzung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oertlichkeit Abkuerzung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Abkuerzung_TypeClass
	 * @generated
	 */
	EClass getOertlichkeit_Abkuerzung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Abkuerzung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Abkuerzung_TypeClass#getWert()
	 * @see #getOertlichkeit_Abkuerzung_TypeClass()
	 * @generated
	 */
	EAttribute getOertlichkeit_Abkuerzung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Allg_AttributeGroup <em>Oertlichkeit Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oertlichkeit Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Allg_AttributeGroup
	 * @generated
	 */
	EClass getOertlichkeit_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Allg_AttributeGroup#getOertlichkeitArt <em>Oertlichkeit Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oertlichkeit Art</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Allg_AttributeGroup#getOertlichkeitArt()
	 * @see #getOertlichkeit_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getOertlichkeit_Allg_AttributeGroup_OertlichkeitArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Allg_AttributeGroup#getOertlichkeitGueltigAb <em>Oertlichkeit Gueltig Ab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oertlichkeit Gueltig Ab</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Allg_AttributeGroup#getOertlichkeitGueltigAb()
	 * @see #getOertlichkeit_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigAb();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Allg_AttributeGroup#getOertlichkeitGueltigBis <em>Oertlichkeit Gueltig Bis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oertlichkeit Gueltig Bis</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Allg_AttributeGroup#getOertlichkeitGueltigBis()
	 * @see #getOertlichkeit_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigBis();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Art_TypeClass <em>Oertlichkeit Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oertlichkeit Art Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Art_TypeClass
	 * @generated
	 */
	EClass getOertlichkeit_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Art_TypeClass#getWert()
	 * @see #getOertlichkeit_Art_TypeClass()
	 * @generated
	 */
	EAttribute getOertlichkeit_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup <em>Oertlichkeit Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oertlichkeit Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getOertlichkeit_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup#getOertlichkeitAbkuerzung <em>Oertlichkeit Abkuerzung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oertlichkeit Abkuerzung</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup#getOertlichkeitAbkuerzung()
	 * @see #getOertlichkeit_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitAbkuerzung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup#getOertlichkeitKurzname <em>Oertlichkeit Kurzname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oertlichkeit Kurzname</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup#getOertlichkeitKurzname()
	 * @see #getOertlichkeit_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitKurzname();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup#getOertlichkeitLangname <em>Oertlichkeit Langname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oertlichkeit Langname</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup#getOertlichkeitLangname()
	 * @see #getOertlichkeit_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitLangname();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Ab_TypeClass <em>Oertlichkeit Gueltig Ab Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oertlichkeit Gueltig Ab Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Ab_TypeClass
	 * @generated
	 */
	EClass getOertlichkeit_Gueltig_Ab_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Ab_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Ab_TypeClass#getWert()
	 * @see #getOertlichkeit_Gueltig_Ab_TypeClass()
	 * @generated
	 */
	EAttribute getOertlichkeit_Gueltig_Ab_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Bis_TypeClass <em>Oertlichkeit Gueltig Bis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oertlichkeit Gueltig Bis Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Bis_TypeClass
	 * @generated
	 */
	EClass getOertlichkeit_Gueltig_Bis_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Bis_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Bis_TypeClass#getWert()
	 * @see #getOertlichkeit_Gueltig_Bis_TypeClass()
	 * @generated
	 */
	EAttribute getOertlichkeit_Gueltig_Bis_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Kurzname_TypeClass <em>Oertlichkeit Kurzname Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oertlichkeit Kurzname Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Kurzname_TypeClass
	 * @generated
	 */
	EClass getOertlichkeit_Kurzname_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Kurzname_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Kurzname_TypeClass#getWert()
	 * @see #getOertlichkeit_Kurzname_TypeClass()
	 * @generated
	 */
	EAttribute getOertlichkeit_Kurzname_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Langname_TypeClass <em>Oertlichkeit Langname Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oertlichkeit Langname Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Langname_TypeClass
	 * @generated
	 */
	EClass getOertlichkeit_Langname_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Langname_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Langname_TypeClass#getWert()
	 * @see #getOertlichkeit_Langname_TypeClass()
	 * @generated
	 */
	EAttribute getOertlichkeit_Langname_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Plan_Quelle_TypeClass <em>Plan Quelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Quelle Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Plan_Quelle_TypeClass
	 * @generated
	 */
	EClass getPlan_Quelle_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Plan_Quelle_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Plan_Quelle_TypeClass#getWert()
	 * @see #getPlan_Quelle_TypeClass()
	 * @generated
	 */
	EAttribute getPlan_Quelle_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Strecke <em>Strecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strecke</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke
	 * @generated
	 */
	EClass getStrecke();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Strecke#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke#getBezeichnung()
	 * @see #getStrecke()
	 * @generated
	 */
	EReference getStrecke_Bezeichnung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Bezeichnung_AttributeGroup <em>Strecke Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strecke Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getStrecke_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Bezeichnung_AttributeGroup#getBezeichnungStrecke <em>Bezeichnung Strecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Strecke</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke_Bezeichnung_AttributeGroup#getBezeichnungStrecke()
	 * @see #getStrecke_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getStrecke_Bezeichnung_AttributeGroup_BezeichnungStrecke();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Meter_TypeClass <em>Strecke Meter Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strecke Meter Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke_Meter_TypeClass
	 * @generated
	 */
	EClass getStrecke_Meter_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Meter_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke_Meter_TypeClass#getWert()
	 * @see #getStrecke_Meter_TypeClass()
	 * @generated
	 */
	EAttribute getStrecke_Meter_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt <em>Strecke Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strecke Punkt</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt
	 * @generated
	 */
	EClass getStrecke_Punkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt#getIDGEOKnoten <em>IDGEO Knoten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDGEO Knoten</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt#getIDGEOKnoten()
	 * @see #getStrecke_Punkt()
	 * @generated
	 */
	EReference getStrecke_Punkt_IDGEOKnoten();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt#getIDStrecke <em>ID Strecke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Strecke</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt#getIDStrecke()
	 * @see #getStrecke_Punkt()
	 * @generated
	 */
	EReference getStrecke_Punkt_IDStrecke();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt#getStreckeMeter <em>Strecke Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strecke Meter</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt#getStreckeMeter()
	 * @see #getStrecke_Punkt()
	 * @generated
	 */
	EReference getStrecke_Punkt_StreckeMeter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.TB_Art_TypeClass <em>TB Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TB Art Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TB_Art_TypeClass
	 * @generated
	 */
	EClass getTB_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.TB_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TB_Art_TypeClass#getWert()
	 * @see #getTB_Art_TypeClass()
	 * @generated
	 */
	EAttribute getTB_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.TB_Beschreibung_TypeClass <em>TB Beschreibung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TB Beschreibung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TB_Beschreibung_TypeClass
	 * @generated
	 */
	EClass getTB_Beschreibung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.TB_Beschreibung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TB_Beschreibung_TypeClass#getWert()
	 * @see #getTB_Beschreibung_TypeClass()
	 * @generated
	 */
	EAttribute getTB_Beschreibung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Technischer_Bereich <em>Technischer Bereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technischer Bereich</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Technischer_Bereich
	 * @generated
	 */
	EClass getTechnischer_Bereich();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Technischer_Bereich#getTBArt <em>TB Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TB Art</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Technischer_Bereich#getTBArt()
	 * @see #getTechnischer_Bereich()
	 * @generated
	 */
	EReference getTechnischer_Bereich_TBArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Technischer_Bereich#getTBBeschreibung <em>TB Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TB Beschreibung</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Technischer_Bereich#getTBBeschreibung()
	 * @see #getTechnischer_Bereich()
	 * @generated
	 */
	EReference getTechnischer_Bereich_TBBeschreibung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt <em>Technischer Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technischer Punkt</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt
	 * @generated
	 */
	EClass getTechnischer_Punkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt#getTPArt <em>TP Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TP Art</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt#getTPArt()
	 * @see #getTechnischer_Punkt()
	 * @generated
	 */
	EReference getTechnischer_Punkt_TPArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt#getTPBeschreibung <em>TP Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TP Beschreibung</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt#getTPBeschreibung()
	 * @see #getTechnischer_Punkt()
	 * @generated
	 */
	EReference getTechnischer_Punkt_TPBeschreibung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Anschluss_A_TypeClass <em>TOP Anschluss AType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOP Anschluss AType Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Anschluss_A_TypeClass
	 * @generated
	 */
	EClass getTOP_Anschluss_A_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Anschluss_A_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Anschluss_A_TypeClass#getWert()
	 * @see #getTOP_Anschluss_A_TypeClass()
	 * @generated
	 */
	EAttribute getTOP_Anschluss_A_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Anschluss_B_TypeClass <em>TOP Anschluss BType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOP Anschluss BType Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Anschluss_B_TypeClass
	 * @generated
	 */
	EClass getTOP_Anschluss_B_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Anschluss_B_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Anschluss_B_TypeClass#getWert()
	 * @see #getTOP_Anschluss_B_TypeClass()
	 * @generated
	 */
	EAttribute getTOP_Anschluss_B_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante <em>TOP Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOP Kante</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Kante
	 * @generated
	 */
	EClass getTOP_Kante();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante#getIDTOPKnotenA <em>IDTOP Knoten A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDTOP Knoten A</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Kante#getIDTOPKnotenA()
	 * @see #getTOP_Kante()
	 * @generated
	 */
	EReference getTOP_Kante_IDTOPKnotenA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante#getIDTOPKnotenB <em>IDTOP Knoten B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDTOP Knoten B</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Kante#getIDTOPKnotenB()
	 * @see #getTOP_Kante()
	 * @generated
	 */
	EReference getTOP_Kante_IDTOPKnotenB();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante#getTOPKanteAllg <em>TOP Kante Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TOP Kante Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Kante#getTOPKanteAllg()
	 * @see #getTOP_Kante()
	 * @generated
	 */
	EReference getTOP_Kante_TOPKanteAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup <em>TOP Kante Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOP Kante Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup
	 * @generated
	 */
	EClass getTOP_Kante_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup#getTOPAnschlussA <em>TOP Anschluss A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TOP Anschluss A</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup#getTOPAnschlussA()
	 * @see #getTOP_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getTOP_Kante_Allg_AttributeGroup_TOPAnschlussA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup#getTOPAnschlussB <em>TOP Anschluss B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TOP Anschluss B</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup#getTOPAnschlussB()
	 * @see #getTOP_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getTOP_Kante_Allg_AttributeGroup_TOPAnschlussB();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup#getTOPLaenge <em>TOP Laenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TOP Laenge</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup#getTOPLaenge()
	 * @see #getTOP_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getTOP_Kante_Allg_AttributeGroup_TOPLaenge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Knoten <em>TOP Knoten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOP Knoten</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Knoten
	 * @generated
	 */
	EClass getTOP_Knoten();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Knoten#getIDGEOKnoten <em>IDGEO Knoten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDGEO Knoten</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Knoten#getIDGEOKnoten()
	 * @see #getTOP_Knoten()
	 * @generated
	 */
	EReference getTOP_Knoten_IDGEOKnoten();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Knoten#getKnotenname <em>Knotenname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Knotenname</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Knoten#getKnotenname()
	 * @see #getTOP_Knoten()
	 * @generated
	 */
	EReference getTOP_Knoten_Knotenname();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Laenge_TypeClass <em>TOP Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOP Laenge Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Laenge_TypeClass
	 * @generated
	 */
	EClass getTOP_Laenge_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Laenge_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TOP_Laenge_TypeClass#getWert()
	 * @see #getTOP_Laenge_TypeClass()
	 * @generated
	 */
	EAttribute getTOP_Laenge_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.TP_Art_TypeClass <em>TP Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TP Art Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TP_Art_TypeClass
	 * @generated
	 */
	EClass getTP_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.TP_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TP_Art_TypeClass#getWert()
	 * @see #getTP_Art_TypeClass()
	 * @generated
	 */
	EAttribute getTP_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.TP_Beschreibung_TypeClass <em>TP Beschreibung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TP Beschreibung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TP_Beschreibung_TypeClass
	 * @generated
	 */
	EClass getTP_Beschreibung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.TP_Beschreibung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.TP_Beschreibung_TypeClass#getWert()
	 * @see #getTP_Beschreibung_TypeClass()
	 * @generated
	 */
	EAttribute getTP_Beschreibung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung <em>Ueberhoehung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ueberhoehung</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung
	 * @generated
	 */
	EClass getUeberhoehung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung#getUeberhoehungAllg <em>Ueberhoehung Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ueberhoehung Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung#getUeberhoehungAllg()
	 * @see #getUeberhoehung()
	 * @generated
	 */
	EReference getUeberhoehung_UeberhoehungAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup <em>Ueberhoehung Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ueberhoehung Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup
	 * @generated
	 */
	EClass getUeberhoehung_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getGEOPAD <em>GEOPAD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GEOPAD</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getGEOPAD()
	 * @see #getUeberhoehung_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getUeberhoehung_Allg_AttributeGroup_GEOPAD();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Quelle</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getPlanQuelle()
	 * @see #getUeberhoehung_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getUeberhoehung_Allg_AttributeGroup_PlanQuelle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getUeberhoehungDatum <em>Ueberhoehung Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ueberhoehung Datum</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getUeberhoehungDatum()
	 * @see #getUeberhoehung_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getUeberhoehung_Allg_AttributeGroup_UeberhoehungDatum();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getUeberhoehungHoehe <em>Ueberhoehung Hoehe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ueberhoehung Hoehe</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getUeberhoehungHoehe()
	 * @see #getUeberhoehung_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getUeberhoehung_Allg_AttributeGroup_UeberhoehungHoehe();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Datum_TypeClass <em>Ueberhoehung Datum Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ueberhoehung Datum Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Datum_TypeClass
	 * @generated
	 */
	EClass getUeberhoehung_Datum_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Datum_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Datum_TypeClass#getWert()
	 * @see #getUeberhoehung_Datum_TypeClass()
	 * @generated
	 */
	EAttribute getUeberhoehung_Datum_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Hoehe_TypeClass <em>Ueberhoehung Hoehe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ueberhoehung Hoehe Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Hoehe_TypeClass
	 * @generated
	 */
	EClass getUeberhoehung_Hoehe_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Hoehe_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Hoehe_TypeClass#getWert()
	 * @see #getUeberhoehung_Hoehe_TypeClass()
	 * @generated
	 */
	EAttribute getUeberhoehung_Hoehe_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie <em>Ueberhoehungslinie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ueberhoehungslinie</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie
	 * @generated
	 */
	EClass getUeberhoehungslinie();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie#getIDUeberhoehungA <em>ID Ueberhoehung A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Ueberhoehung A</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie#getIDUeberhoehungA()
	 * @see #getUeberhoehungslinie()
	 * @generated
	 */
	EReference getUeberhoehungslinie_IDUeberhoehungA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie#getIDUeberhoehungB <em>ID Ueberhoehung B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Ueberhoehung B</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie#getIDUeberhoehungB()
	 * @see #getUeberhoehungslinie()
	 * @generated
	 */
	EReference getUeberhoehungslinie_IDUeberhoehungB();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie#getUeberhoehungslinieAllg <em>Ueberhoehungslinie Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ueberhoehungslinie Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie#getUeberhoehungslinieAllg()
	 * @see #getUeberhoehungslinie()
	 * @generated
	 */
	EReference getUeberhoehungslinie_UeberhoehungslinieAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup <em>Ueberhoehungslinie Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ueberhoehungslinie Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup
	 * @generated
	 */
	EClass getUeberhoehungslinie_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Quelle</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup#getPlanQuelle()
	 * @see #getUeberhoehungslinie_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getUeberhoehungslinie_Allg_AttributeGroup_PlanQuelle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup#getUeberhoehungslinieForm <em>Ueberhoehungslinie Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ueberhoehungslinie Form</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup#getUeberhoehungslinieForm()
	 * @see #getUeberhoehungslinie_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieForm();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup#getUeberhoehungslinieLaenge <em>Ueberhoehungslinie Laenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ueberhoehungslinie Laenge</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup#getUeberhoehungslinieLaenge()
	 * @see #getUeberhoehungslinie_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieLaenge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Form_TypeClass <em>Ueberhoehungslinie Form Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ueberhoehungslinie Form Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Form_TypeClass
	 * @generated
	 */
	EClass getUeberhoehungslinie_Form_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Form_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Form_TypeClass#getWert()
	 * @see #getUeberhoehungslinie_Form_TypeClass()
	 * @generated
	 */
	EAttribute getUeberhoehungslinie_Form_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Laenge_TypeClass <em>Ueberhoehungslinie Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ueberhoehungslinie Laenge Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Laenge_TypeClass
	 * @generated
	 */
	EClass getUeberhoehungslinie_Laenge_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Laenge_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Laenge_TypeClass#getWert()
	 * @see #getUeberhoehungslinie_Laenge_TypeClass()
	 * @generated
	 */
	EAttribute getUeberhoehungslinie_Laenge_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.V_Profil_Art_TypeClass <em>VProfil Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VProfil Art Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.V_Profil_Art_TypeClass
	 * @generated
	 */
	EClass getV_Profil_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.V_Profil_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.V_Profil_Art_TypeClass#getWert()
	 * @see #getV_Profil_Art_TypeClass()
	 * @generated
	 */
	EAttribute getV_Profil_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Geodaten.Wirkrichtung_TypeClass <em>Wirkrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wirkrichtung Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Wirkrichtung_TypeClass
	 * @generated
	 */
	EClass getWirkrichtung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Geodaten.Wirkrichtung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.Wirkrichtung_TypeClass#getWert()
	 * @see #getWirkrichtung_TypeClass()
	 * @generated
	 */
	EAttribute getWirkrichtung_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Geodaten.ENUMGEOForm <em>ENUMGEO Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMGEO Form</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMGEOForm
	 * @generated
	 */
	EEnum getENUMGEOForm();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Geodaten.ENUMHoehenlinieForm <em>ENUM Hoehenlinie Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Hoehenlinie Form</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMHoehenlinieForm
	 * @generated
	 */
	EEnum getENUMHoehenlinieForm();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Geodaten.ENUMHSystem <em>ENUMH System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMH System</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMHSystem
	 * @generated
	 */
	EEnum getENUMHSystem();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Geodaten.ENUMOertlichkeitArt <em>ENUM Oertlichkeit Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Oertlichkeit Art</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMOertlichkeitArt
	 * @generated
	 */
	EEnum getENUMOertlichkeitArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Geodaten.ENUMPlanQuelle <em>ENUM Plan Quelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Plan Quelle</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMPlanQuelle
	 * @generated
	 */
	EEnum getENUMPlanQuelle();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Geodaten.ENUMTBArt <em>ENUMTB Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMTB Art</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTBArt
	 * @generated
	 */
	EEnum getENUMTBArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Geodaten.ENUMTOPAnschluss <em>ENUMTOP Anschluss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMTOP Anschluss</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTOPAnschluss
	 * @generated
	 */
	EEnum getENUMTOPAnschluss();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Geodaten.ENUMTPArt <em>ENUMTP Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMTP Art</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTPArt
	 * @generated
	 */
	EEnum getENUMTPArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Geodaten.ENUMUeberhoehungslinieForm <em>ENUM Ueberhoehungslinie Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Ueberhoehungslinie Form</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMUeberhoehungslinieForm
	 * @generated
	 */
	EEnum getENUMUeberhoehungslinieForm();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Geodaten.ENUMVProfilArt <em>ENUMV Profil Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMV Profil Art</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMVProfilArt
	 * @generated
	 */
	EEnum getENUMVProfilArt();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Strecke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Strecke Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Strecke' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText' pattern='[0-9]{4}(\\-[a-zA-Z0-9])?'"
	 * @generated
	 */
	EDataType getBezeichnung_Strecke_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Geodaten.ENUMGEOForm <em>ENUMGEO Form Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMGEO Form Object</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMGEOForm
	 * @model instanceClass="org.eclipse.set.model.model1902.Geodaten.ENUMGEOForm"
	 *        extendedMetaData="name='ENUMGEO_Form:Object' baseType='ENUMGEO_Form'"
	 * @generated
	 */
	EDataType getENUMGEOFormObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Geodaten.ENUMHoehenlinieForm <em>ENUM Hoehenlinie Form Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Hoehenlinie Form Object</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMHoehenlinieForm
	 * @model instanceClass="org.eclipse.set.model.model1902.Geodaten.ENUMHoehenlinieForm"
	 *        extendedMetaData="name='ENUMHoehenlinie_Form:Object' baseType='ENUMHoehenlinie_Form'"
	 * @generated
	 */
	EDataType getENUMHoehenlinieFormObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Geodaten.ENUMHSystem <em>ENUMH System Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMH System Object</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMHSystem
	 * @model instanceClass="org.eclipse.set.model.model1902.Geodaten.ENUMHSystem"
	 *        extendedMetaData="name='ENUMHSystem:Object' baseType='ENUMHSystem'"
	 * @generated
	 */
	EDataType getENUMHSystemObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Geodaten.ENUMOertlichkeitArt <em>ENUM Oertlichkeit Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Oertlichkeit Art Object</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMOertlichkeitArt
	 * @model instanceClass="org.eclipse.set.model.model1902.Geodaten.ENUMOertlichkeitArt"
	 *        extendedMetaData="name='ENUMOertlichkeit_Art:Object' baseType='ENUMOertlichkeit_Art'"
	 * @generated
	 */
	EDataType getENUMOertlichkeitArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Geodaten.ENUMPlanQuelle <em>ENUM Plan Quelle Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Plan Quelle Object</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMPlanQuelle
	 * @model instanceClass="org.eclipse.set.model.model1902.Geodaten.ENUMPlanQuelle"
	 *        extendedMetaData="name='ENUMPlan_Quelle:Object' baseType='ENUMPlan_Quelle'"
	 * @generated
	 */
	EDataType getENUMPlanQuelleObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Geodaten.ENUMTBArt <em>ENUMTB Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMTB Art Object</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTBArt
	 * @model instanceClass="org.eclipse.set.model.model1902.Geodaten.ENUMTBArt"
	 *        extendedMetaData="name='ENUMTB_Art:Object' baseType='ENUMTB_Art'"
	 * @generated
	 */
	EDataType getENUMTBArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Geodaten.ENUMTOPAnschluss <em>ENUMTOP Anschluss Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMTOP Anschluss Object</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTOPAnschluss
	 * @model instanceClass="org.eclipse.set.model.model1902.Geodaten.ENUMTOPAnschluss"
	 *        extendedMetaData="name='ENUMTOP_Anschluss:Object' baseType='ENUMTOP_Anschluss'"
	 * @generated
	 */
	EDataType getENUMTOPAnschlussObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Geodaten.ENUMTPArt <em>ENUMTP Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMTP Art Object</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTPArt
	 * @model instanceClass="org.eclipse.set.model.model1902.Geodaten.ENUMTPArt"
	 *        extendedMetaData="name='ENUMTP_Art:Object' baseType='ENUMTP_Art'"
	 * @generated
	 */
	EDataType getENUMTPArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Geodaten.ENUMUeberhoehungslinieForm <em>ENUM Ueberhoehungslinie Form Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Ueberhoehungslinie Form Object</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMUeberhoehungslinieForm
	 * @model instanceClass="org.eclipse.set.model.model1902.Geodaten.ENUMUeberhoehungslinieForm"
	 *        extendedMetaData="name='ENUMUeberhoehungslinie_Form:Object' baseType='ENUMUeberhoehungslinie_Form'"
	 * @generated
	 */
	EDataType getENUMUeberhoehungslinieFormObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Geodaten.ENUMVProfilArt <em>ENUMV Profil Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMV Profil Art Object</em>'.
	 * @see org.eclipse.set.model.model1902.Geodaten.ENUMVProfilArt
	 * @model instanceClass="org.eclipse.set.model.model1902.Geodaten.ENUMVProfilArt"
	 *        extendedMetaData="name='ENUMV_Profil_Art:Object' baseType='ENUMV_Profil_Art'"
	 * @generated
	 */
	EDataType getENUMVProfilArtObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>GEO Koordinaten System LSys Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GEO Koordinaten System LSys Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TGEO_KoordinatenSystem_LSys' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TZeichenkette' pattern='[C-F][A-C|R|S][0-9A-Z]'"
	 * @generated
	 */
	EDataType getGEO_KoordinatenSystem_LSys_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>GEO Koordinaten System Sonstige Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GEO Koordinaten System Sonstige Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TGEO_KoordinatenSystem_Sonstige' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TZeichenkette'"
	 * @generated
	 */
	EDataType getGEO_KoordinatenSystem_Sonstige_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>GEO Laenge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GEO Laenge Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TGEO_Laenge' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter' pattern='-?(0|[1-9][0-9]{0,3})\\.[0-9]{5}'"
	 * @generated
	 */
	EDataType getGEO_Laenge_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>GEO PAD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GEO PAD Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TGEO_PAD' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText' pattern='.{1,20}'"
	 * @generated
	 */
	EDataType getGEO_PAD_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>GEO Radius AType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GEO Radius AType</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TGEO_Radius_A' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter' pattern='0\\.00000|(-?[1-9][0-9]{1,4}\\.[0-9]{5})'"
	 * @generated
	 */
	EDataType getGEO_Radius_A_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>GEO Radius BType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GEO Radius BType</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TGEO_Radius_B' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter' pattern='0\\.00000|(-?[1-9][0-9]{1,4}\\.[0-9]{5})'"
	 * @generated
	 */
	EDataType getGEO_Radius_B_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>GEO Richtungswinkel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GEO Richtungswinkel Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TGEO_Richtungswinkel' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='(0|[1-9][0-9]{0,1}|[1-3][0-9]{2})\\.[0-9]{5}'"
	 * @generated
	 */
	EDataType getGEO_Richtungswinkel_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Geschwindigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Geschwindigkeit Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TGeschwindigkeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TGeschwindigkeit'"
	 * @generated
	 */
	EDataType getGeschwindigkeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>GK XType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GK XType</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TGK_X' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='((0|(-?[1-9][0-9]{0,}))\\.[0-9]{5})|(-0\\.([1-9][0-9]{4}|[0-9][1-9][0-9]{3}|[0-9]{2}[1-9][0-9]{2}|[0-9]{3}[1-9][0-9]|[0-9]{4}[1-9]))'"
	 * @generated
	 */
	EDataType getGK_X_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>GK YType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GK YType</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TGK_Y' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='((0|(-?[1-9][0-9]{0,}))\\.[0-9]{5})|(-0\\.([1-9][0-9]{4}|[0-9][1-9][0-9]{3}|[0-9]{2}[1-9][0-9]{2}|[0-9]{3}[1-9][0-9]|[0-9]{4}[1-9]))'"
	 * @generated
	 */
	EDataType getGK_Y_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>GK ZType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GK ZType</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TGK_Z' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='((0|(-?[1-9][0-9]{0,}))\\.[0-9]{5})|(-0\\.([1-9][0-9]{4}|[0-9][1-9][0-9]{3}|[0-9]{2}[1-9][0-9]{2}|[0-9]{3}[1-9][0-9]|[0-9]{4}[1-9]))'"
	 * @generated
	 */
	EDataType getGK_Z_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Hoehenlinie Laenge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hoehenlinie Laenge Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='THoehenlinie_Laenge' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter' pattern='(0|[1-9][0-9]{0,4})\\.[0-9]{3}'"
	 * @generated
	 */
	EDataType getHoehenlinie_Laenge_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Hoehenpunkt Hoehe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hoehenpunkt Hoehe Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='THoehenpunkt_Hoehe' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='-100\\.000|-([1-9][0-9]{0,1}\\.[0-9]{3})|(-0\\.[1-9][0-9]{2}|-0\\.0[1-9][0-9]|-0\\.0[0-9][1-9])|((0|[1-9][0-9]{0,2}|[1-2][0-9]{3})\\.[0-9]{3})|3000\\.000'"
	 * @generated
	 */
	EDataType getHoehenpunkt_Hoehe_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Knotenname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Knotenname Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TKnotenname' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText' pattern='.{1,20}'"
	 * @generated
	 */
	EDataType getKnotenname_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Neigung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Neigung Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TNeigung' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='-100\\.000|-([1-9][0-9]{0,1}\\.[0-9]{3})|(-0\\.[1-9][0-9]{2}|-0\\.0[1-9][0-9]|-0\\.0[0-9][1-9])|((0|[1-9][0-9]{0,1})\\.[0-9]{3})|100\\.000'"
	 * @generated
	 */
	EDataType getNeigung_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oertlichkeit Abkuerzung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Oertlichkeit Abkuerzung Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TOertlichkeit_Abkuerzung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText' pattern='[A-Z]{2,5}'"
	 * @generated
	 */
	EDataType getOertlichkeit_Abkuerzung_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oertlichkeit Kurzname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Oertlichkeit Kurzname Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TOertlichkeit_Kurzname' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText' pattern='.{1,16}'"
	 * @generated
	 */
	EDataType getOertlichkeit_Kurzname_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oertlichkeit Langname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Oertlichkeit Langname Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TOertlichkeit_Langname' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText' pattern='.{1,40}'"
	 * @generated
	 */
	EDataType getOertlichkeit_Langname_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Strecke Meter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Strecke Meter Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TStrecke_Meter' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter' pattern='-?(0|[1-9][0-9]{0,5})\\.[0-9]{3}'"
	 * @generated
	 */
	EDataType getStrecke_Meter_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TB Beschreibung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TB Beschreibung Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TTB_Beschreibung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TFreiText'"
	 * @generated
	 */
	EDataType getTB_Beschreibung_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>TOP Laenge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TOP Laenge Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TTOP_Laenge' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter' pattern='(0|[1-9][0-9]{0,4})\\.[0-9]{3}'"
	 * @generated
	 */
	EDataType getTOP_Laenge_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TP Beschreibung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TP Beschreibung Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TTP_Beschreibung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TFreiText'"
	 * @generated
	 */
	EDataType getTP_Beschreibung_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Ueberhoehung Hoehe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ueberhoehung Hoehe Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TUeberhoehung_Hoehe' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter' pattern='0\\.[01][0-9][0-9]|0\\.200'"
	 * @generated
	 */
	EDataType getUeberhoehung_Hoehe_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Ueberhoehungslinie Laenge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ueberhoehungslinie Laenge Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TUeberhoehungslinie_Laenge' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TMeter' pattern='(0|[1-9][0-9]{0,4})\\.[0-9]{3}'"
	 * @generated
	 */
	EDataType getUeberhoehungslinie_Laenge_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.BasisTypen.ENUMWirkrichtung <em>Wirkrichtung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Wirkrichtung Type</em>'.
	 * @see org.eclipse.set.model.model1902.BasisTypen.ENUMWirkrichtung
	 * @model instanceClass="org.eclipse.set.model.model1902.BasisTypen.ENUMWirkrichtung"
	 *        extendedMetaData="name='TWirkrichtung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TWirkrichtung'"
	 * @generated
	 */
	EDataType getWirkrichtung_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeodatenFactory getGeodatenFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Bezeichnung_Strecke_TypeClassImpl <em>Bezeichnung Strecke Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Bezeichnung_Strecke_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getBezeichnung_Strecke_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_STRECKE_TYPE_CLASS = eINSTANCE.getBezeichnung_Strecke_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_STRECKE_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Strecke_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Form_TypeClassImpl <em>GEO Form Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Form_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Form_TypeClass()
		 * @generated
		 */
		EClass GEO_FORM_TYPE_CLASS = eINSTANCE.getGEO_Form_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_FORM_TYPE_CLASS__WERT = eINSTANCE.getGEO_Form_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_KanteImpl <em>GEO Kante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_KanteImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Kante()
		 * @generated
		 */
		EClass GEO_KANTE = eINSTANCE.getGEO_Kante();

		/**
		 * The meta object literal for the '<em><b>GEO Kante Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_KANTE__GEO_KANTE_ALLG = eINSTANCE.getGEO_Kante_GEOKanteAllg();

		/**
		 * The meta object literal for the '<em><b>IDGEO Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_KANTE__IDGEO_ART = eINSTANCE.getGEO_Kante_IDGEOArt();

		/**
		 * The meta object literal for the '<em><b>IDGEO Knoten A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_KANTE__IDGEO_KNOTEN_A = eINSTANCE.getGEO_Kante_IDGEOKnotenA();

		/**
		 * The meta object literal for the '<em><b>IDGEO Knoten B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_KANTE__IDGEO_KNOTEN_B = eINSTANCE.getGEO_Kante_IDGEOKnotenB();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Kante_Allg_AttributeGroupImpl <em>GEO Kante Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Kante_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Kante_Allg_AttributeGroup()
		 * @generated
		 */
		EClass GEO_KANTE_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getGEO_Kante_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>GEO Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_FORM = eINSTANCE.getGEO_Kante_Allg_AttributeGroup_GEOForm();

		/**
		 * The meta object literal for the '<em><b>GEO Laenge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_LAENGE = eINSTANCE.getGEO_Kante_Allg_AttributeGroup_GEOLaenge();

		/**
		 * The meta object literal for the '<em><b>GEO Radius A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_A = eINSTANCE.getGEO_Kante_Allg_AttributeGroup_GEORadiusA();

		/**
		 * The meta object literal for the '<em><b>GEO Radius B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_B = eINSTANCE.getGEO_Kante_Allg_AttributeGroup_GEORadiusB();

		/**
		 * The meta object literal for the '<em><b>GEO Richtungswinkel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RICHTUNGSWINKEL = eINSTANCE.getGEO_Kante_Allg_AttributeGroup_GEORichtungswinkel();

		/**
		 * The meta object literal for the '<em><b>Plan Quelle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_KANTE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE = eINSTANCE.getGEO_Kante_Allg_AttributeGroup_PlanQuelle();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_KnotenImpl <em>GEO Knoten</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_KnotenImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Knoten()
		 * @generated
		 */
		EClass GEO_KNOTEN = eINSTANCE.getGEO_Knoten();

		/**
		 * The meta object literal for the '<em><b>GEOPAD</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_KNOTEN__GEOPAD = eINSTANCE.getGEO_Knoten_GEOPAD();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_KoordinatenSystem_LSys_TypeClassImpl <em>GEO Koordinaten System LSys Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_KoordinatenSystem_LSys_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_KoordinatenSystem_LSys_TypeClass()
		 * @generated
		 */
		EClass GEO_KOORDINATEN_SYSTEM_LSYS_TYPE_CLASS = eINSTANCE.getGEO_KoordinatenSystem_LSys_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_KOORDINATEN_SYSTEM_LSYS_TYPE_CLASS__WERT = eINSTANCE.getGEO_KoordinatenSystem_LSys_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_KoordinatenSystem_Sonstige_TypeClassImpl <em>GEO Koordinaten System Sonstige Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_KoordinatenSystem_Sonstige_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_KoordinatenSystem_Sonstige_TypeClass()
		 * @generated
		 */
		EClass GEO_KOORDINATEN_SYSTEM_SONSTIGE_TYPE_CLASS = eINSTANCE.getGEO_KoordinatenSystem_Sonstige_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_KOORDINATEN_SYSTEM_SONSTIGE_TYPE_CLASS__WERT = eINSTANCE.getGEO_KoordinatenSystem_Sonstige_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Laenge_TypeClassImpl <em>GEO Laenge Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Laenge_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Laenge_TypeClass()
		 * @generated
		 */
		EClass GEO_LAENGE_TYPE_CLASS = eINSTANCE.getGEO_Laenge_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_LAENGE_TYPE_CLASS__WERT = eINSTANCE.getGEO_Laenge_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_PAD_TypeClassImpl <em>GEO PAD Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_PAD_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_PAD_TypeClass()
		 * @generated
		 */
		EClass GEO_PAD_TYPE_CLASS = eINSTANCE.getGEO_PAD_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_PAD_TYPE_CLASS__WERT = eINSTANCE.getGEO_PAD_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_PunktImpl <em>GEO Punkt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_PunktImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Punkt()
		 * @generated
		 */
		EClass GEO_PUNKT = eINSTANCE.getGEO_Punkt();

		/**
		 * The meta object literal for the '<em><b>GEO Punkt Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_PUNKT__GEO_PUNKT_ALLG = eINSTANCE.getGEO_Punkt_GEOPunktAllg();

		/**
		 * The meta object literal for the '<em><b>IDGEO Knoten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_PUNKT__IDGEO_KNOTEN = eINSTANCE.getGEO_Punkt_IDGEOKnoten();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl <em>GEO Punkt Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Punkt_Allg_AttributeGroup()
		 * @generated
		 */
		EClass GEO_PUNKT_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getGEO_Punkt_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>GKX</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX = eINSTANCE.getGEO_Punkt_Allg_AttributeGroup_GKX();

		/**
		 * The meta object literal for the '<em><b>GKY</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY = eINSTANCE.getGEO_Punkt_Allg_AttributeGroup_GKY();

		/**
		 * The meta object literal for the '<em><b>GKZ</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ = eINSTANCE.getGEO_Punkt_Allg_AttributeGroup_GKZ();

		/**
		 * The meta object literal for the '<em><b>Plan Quelle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE = eINSTANCE.getGEO_Punkt_Allg_AttributeGroup_PlanQuelle();

		/**
		 * The meta object literal for the '<em><b>GEO Koordinaten System LSys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_LSYS = eINSTANCE.getGEO_Punkt_Allg_AttributeGroup_GEOKoordinatenSystemLSys();

		/**
		 * The meta object literal for the '<em><b>GEO Koordinaten System Sonstige</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_SONSTIGE = eINSTANCE.getGEO_Punkt_Allg_AttributeGroup_GEOKoordinatenSystemSonstige();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Radius_A_TypeClassImpl <em>GEO Radius AType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Radius_A_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Radius_A_TypeClass()
		 * @generated
		 */
		EClass GEO_RADIUS_ATYPE_CLASS = eINSTANCE.getGEO_Radius_A_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_RADIUS_ATYPE_CLASS__WERT = eINSTANCE.getGEO_Radius_A_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Radius_B_TypeClassImpl <em>GEO Radius BType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Radius_B_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Radius_B_TypeClass()
		 * @generated
		 */
		EClass GEO_RADIUS_BTYPE_CLASS = eINSTANCE.getGEO_Radius_B_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_RADIUS_BTYPE_CLASS__WERT = eINSTANCE.getGEO_Radius_B_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Richtungswinkel_TypeClassImpl <em>GEO Richtungswinkel Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GEO_Richtungswinkel_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Richtungswinkel_TypeClass()
		 * @generated
		 */
		EClass GEO_RICHTUNGSWINKEL_TYPE_CLASS = eINSTANCE.getGEO_Richtungswinkel_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_RICHTUNGSWINKEL_TYPE_CLASS__WERT = eINSTANCE.getGEO_Richtungswinkel_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Geschwindigkeit_TypeClassImpl <em>Geschwindigkeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Geschwindigkeit_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGeschwindigkeit_TypeClass()
		 * @generated
		 */
		EClass GESCHWINDIGKEIT_TYPE_CLASS = eINSTANCE.getGeschwindigkeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GESCHWINDIGKEIT_TYPE_CLASS__WERT = eINSTANCE.getGeschwindigkeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GeschwindigkeitsprofilImpl <em>Geschwindigkeitsprofil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeschwindigkeitsprofilImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGeschwindigkeitsprofil()
		 * @generated
		 */
		EClass GESCHWINDIGKEITSPROFIL = eINSTANCE.getGeschwindigkeitsprofil();

		/**
		 * The meta object literal for the '<em><b>Geschwindigkeitsprofil Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GESCHWINDIGKEITSPROFIL__GESCHWINDIGKEITSPROFIL_ALLG = eINSTANCE.getGeschwindigkeitsprofil_GeschwindigkeitsprofilAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Geschwindigkeitsprofil_Allg_AttributeGroupImpl <em>Geschwindigkeitsprofil Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Geschwindigkeitsprofil_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGeschwindigkeitsprofil_Allg_AttributeGroup()
		 * @generated
		 */
		EClass GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getGeschwindigkeitsprofil_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Geschwindigkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT = eINSTANCE.getGeschwindigkeitsprofil_Allg_AttributeGroup_Geschwindigkeit();

		/**
		 * The meta object literal for the '<em><b>VProfil Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART = eINSTANCE.getGeschwindigkeitsprofil_Allg_AttributeGroup_VProfilArt();

		/**
		 * The meta object literal for the '<em><b>Wirkrichtung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__WIRKRICHTUNG = eINSTANCE.getGeschwindigkeitsprofil_Allg_AttributeGroup_Wirkrichtung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GK_X_TypeClassImpl <em>GK XType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GK_X_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGK_X_TypeClass()
		 * @generated
		 */
		EClass GK_XTYPE_CLASS = eINSTANCE.getGK_X_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GK_XTYPE_CLASS__WERT = eINSTANCE.getGK_X_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GK_Y_TypeClassImpl <em>GK YType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GK_Y_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGK_Y_TypeClass()
		 * @generated
		 */
		EClass GK_YTYPE_CLASS = eINSTANCE.getGK_Y_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GK_YTYPE_CLASS__WERT = eINSTANCE.getGK_Y_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.GK_Z_TypeClassImpl <em>GK ZType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GK_Z_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGK_Z_TypeClass()
		 * @generated
		 */
		EClass GK_ZTYPE_CLASS = eINSTANCE.getGK_Z_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GK_ZTYPE_CLASS__WERT = eINSTANCE.getGK_Z_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.HoehenlinieImpl <em>Hoehenlinie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.HoehenlinieImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenlinie()
		 * @generated
		 */
		EClass HOEHENLINIE = eINSTANCE.getHoehenlinie();

		/**
		 * The meta object literal for the '<em><b>Hoehenlinie Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOEHENLINIE__HOEHENLINIE_ALLG = eINSTANCE.getHoehenlinie_HoehenlinieAllg();

		/**
		 * The meta object literal for the '<em><b>ID Hoehenpunkt A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOEHENLINIE__ID_HOEHENPUNKT_A = eINSTANCE.getHoehenlinie_IDHoehenpunktA();

		/**
		 * The meta object literal for the '<em><b>ID Hoehenpunkt B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOEHENLINIE__ID_HOEHENPUNKT_B = eINSTANCE.getHoehenlinie_IDHoehenpunktB();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Allg_AttributeGroupImpl <em>Hoehenlinie Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenlinie_Allg_AttributeGroup()
		 * @generated
		 */
		EClass HOEHENLINIE_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getHoehenlinie_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Hoehenlinie Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_FORM = eINSTANCE.getHoehenlinie_Allg_AttributeGroup_HoehenlinieForm();

		/**
		 * The meta object literal for the '<em><b>Hoehenlinie Laenge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_LAENGE = eINSTANCE.getHoehenlinie_Allg_AttributeGroup_HoehenlinieLaenge();

		/**
		 * The meta object literal for the '<em><b>Plan Quelle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE = eINSTANCE.getHoehenlinie_Allg_AttributeGroup_PlanQuelle();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Form_TypeClassImpl <em>Hoehenlinie Form Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Form_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenlinie_Form_TypeClass()
		 * @generated
		 */
		EClass HOEHENLINIE_FORM_TYPE_CLASS = eINSTANCE.getHoehenlinie_Form_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOEHENLINIE_FORM_TYPE_CLASS__WERT = eINSTANCE.getHoehenlinie_Form_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Laenge_TypeClassImpl <em>Hoehenlinie Laenge Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Laenge_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenlinie_Laenge_TypeClass()
		 * @generated
		 */
		EClass HOEHENLINIE_LAENGE_TYPE_CLASS = eINSTANCE.getHoehenlinie_Laenge_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOEHENLINIE_LAENGE_TYPE_CLASS__WERT = eINSTANCE.getHoehenlinie_Laenge_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.HoehenpunktImpl <em>Hoehenpunkt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.HoehenpunktImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenpunkt()
		 * @generated
		 */
		EClass HOEHENPUNKT = eINSTANCE.getHoehenpunkt();

		/**
		 * The meta object literal for the '<em><b>Hoehenpunkt Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOEHENPUNKT__HOEHENPUNKT_ALLG = eINSTANCE.getHoehenpunkt_HoehenpunktAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenpunkt_Allg_AttributeGroupImpl <em>Hoehenpunkt Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Hoehenpunkt_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenpunkt_Allg_AttributeGroup()
		 * @generated
		 */
		EClass HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getHoehenpunkt_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>GEOPAD</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__GEOPAD = eINSTANCE.getHoehenpunkt_Allg_AttributeGroup_GEOPAD();

		/**
		 * The meta object literal for the '<em><b>Hoehenpunkt Datum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_DATUM = eINSTANCE.getHoehenpunkt_Allg_AttributeGroup_HoehenpunktDatum();

		/**
		 * The meta object literal for the '<em><b>Hoehenpunkt Hoehe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_HOEHE = eINSTANCE.getHoehenpunkt_Allg_AttributeGroup_HoehenpunktHoehe();

		/**
		 * The meta object literal for the '<em><b>HSystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HSYSTEM = eINSTANCE.getHoehenpunkt_Allg_AttributeGroup_HSystem();

		/**
		 * The meta object literal for the '<em><b>Neigung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__NEIGUNG = eINSTANCE.getHoehenpunkt_Allg_AttributeGroup_Neigung();

		/**
		 * The meta object literal for the '<em><b>Plan Quelle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE = eINSTANCE.getHoehenpunkt_Allg_AttributeGroup_PlanQuelle();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenpunkt_Datum_TypeClassImpl <em>Hoehenpunkt Datum Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Hoehenpunkt_Datum_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenpunkt_Datum_TypeClass()
		 * @generated
		 */
		EClass HOEHENPUNKT_DATUM_TYPE_CLASS = eINSTANCE.getHoehenpunkt_Datum_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOEHENPUNKT_DATUM_TYPE_CLASS__WERT = eINSTANCE.getHoehenpunkt_Datum_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenpunkt_Hoehe_TypeClassImpl <em>Hoehenpunkt Hoehe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Hoehenpunkt_Hoehe_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenpunkt_Hoehe_TypeClass()
		 * @generated
		 */
		EClass HOEHENPUNKT_HOEHE_TYPE_CLASS = eINSTANCE.getHoehenpunkt_Hoehe_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOEHENPUNKT_HOEHE_TYPE_CLASS__WERT = eINSTANCE.getHoehenpunkt_Hoehe_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.HSystem_TypeClassImpl <em>HSystem Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.HSystem_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHSystem_TypeClass()
		 * @generated
		 */
		EClass HSYSTEM_TYPE_CLASS = eINSTANCE.getHSystem_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HSYSTEM_TYPE_CLASS__WERT = eINSTANCE.getHSystem_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Knotenname_TypeClassImpl <em>Knotenname Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Knotenname_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getKnotenname_TypeClass()
		 * @generated
		 */
		EClass KNOTENNAME_TYPE_CLASS = eINSTANCE.getKnotenname_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOTENNAME_TYPE_CLASS__WERT = eINSTANCE.getKnotenname_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Neigung_TypeClassImpl <em>Neigung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Neigung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getNeigung_TypeClass()
		 * @generated
		 */
		EClass NEIGUNG_TYPE_CLASS = eINSTANCE.getNeigung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEIGUNG_TYPE_CLASS__WERT = eINSTANCE.getNeigung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.OertlichkeitImpl <em>Oertlichkeit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.OertlichkeitImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit()
		 * @generated
		 */
		EClass OERTLICHKEIT = eINSTANCE.getOertlichkeit();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OERTLICHKEIT__BEZEICHNUNG = eINSTANCE.getOertlichkeit_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Oertlichkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OERTLICHKEIT__ID_OERTLICHKEIT = eINSTANCE.getOertlichkeit_IDOertlichkeit();

		/**
		 * The meta object literal for the '<em><b>ID Strecke Punkt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OERTLICHKEIT__ID_STRECKE_PUNKT = eINSTANCE.getOertlichkeit_IDStreckePunkt();

		/**
		 * The meta object literal for the '<em><b>Oertlichkeit Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OERTLICHKEIT__OERTLICHKEIT_ALLG = eINSTANCE.getOertlichkeit_OertlichkeitAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Abkuerzung_TypeClassImpl <em>Oertlichkeit Abkuerzung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Abkuerzung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Abkuerzung_TypeClass()
		 * @generated
		 */
		EClass OERTLICHKEIT_ABKUERZUNG_TYPE_CLASS = eINSTANCE.getOertlichkeit_Abkuerzung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OERTLICHKEIT_ABKUERZUNG_TYPE_CLASS__WERT = eINSTANCE.getOertlichkeit_Abkuerzung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Allg_AttributeGroupImpl <em>Oertlichkeit Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Allg_AttributeGroup()
		 * @generated
		 */
		EClass OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getOertlichkeit_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Oertlichkeit Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_ART = eINSTANCE.getOertlichkeit_Allg_AttributeGroup_OertlichkeitArt();

		/**
		 * The meta object literal for the '<em><b>Oertlichkeit Gueltig Ab</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_AB = eINSTANCE.getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigAb();

		/**
		 * The meta object literal for the '<em><b>Oertlichkeit Gueltig Bis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_BIS = eINSTANCE.getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigBis();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Art_TypeClassImpl <em>Oertlichkeit Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Art_TypeClass()
		 * @generated
		 */
		EClass OERTLICHKEIT_ART_TYPE_CLASS = eINSTANCE.getOertlichkeit_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OERTLICHKEIT_ART_TYPE_CLASS__WERT = eINSTANCE.getOertlichkeit_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Bezeichnung_AttributeGroupImpl <em>Oertlichkeit Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getOertlichkeit_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Oertlichkeit Abkuerzung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG = eINSTANCE.getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitAbkuerzung();

		/**
		 * The meta object literal for the '<em><b>Oertlichkeit Kurzname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME = eINSTANCE.getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitKurzname();

		/**
		 * The meta object literal for the '<em><b>Oertlichkeit Langname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME = eINSTANCE.getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitLangname();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Gueltig_Ab_TypeClassImpl <em>Oertlichkeit Gueltig Ab Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Gueltig_Ab_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Gueltig_Ab_TypeClass()
		 * @generated
		 */
		EClass OERTLICHKEIT_GUELTIG_AB_TYPE_CLASS = eINSTANCE.getOertlichkeit_Gueltig_Ab_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OERTLICHKEIT_GUELTIG_AB_TYPE_CLASS__WERT = eINSTANCE.getOertlichkeit_Gueltig_Ab_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Gueltig_Bis_TypeClassImpl <em>Oertlichkeit Gueltig Bis Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Gueltig_Bis_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Gueltig_Bis_TypeClass()
		 * @generated
		 */
		EClass OERTLICHKEIT_GUELTIG_BIS_TYPE_CLASS = eINSTANCE.getOertlichkeit_Gueltig_Bis_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OERTLICHKEIT_GUELTIG_BIS_TYPE_CLASS__WERT = eINSTANCE.getOertlichkeit_Gueltig_Bis_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Kurzname_TypeClassImpl <em>Oertlichkeit Kurzname Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Kurzname_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Kurzname_TypeClass()
		 * @generated
		 */
		EClass OERTLICHKEIT_KURZNAME_TYPE_CLASS = eINSTANCE.getOertlichkeit_Kurzname_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OERTLICHKEIT_KURZNAME_TYPE_CLASS__WERT = eINSTANCE.getOertlichkeit_Kurzname_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Langname_TypeClassImpl <em>Oertlichkeit Langname Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Langname_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Langname_TypeClass()
		 * @generated
		 */
		EClass OERTLICHKEIT_LANGNAME_TYPE_CLASS = eINSTANCE.getOertlichkeit_Langname_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OERTLICHKEIT_LANGNAME_TYPE_CLASS__WERT = eINSTANCE.getOertlichkeit_Langname_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Plan_Quelle_TypeClassImpl <em>Plan Quelle Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Plan_Quelle_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getPlan_Quelle_TypeClass()
		 * @generated
		 */
		EClass PLAN_QUELLE_TYPE_CLASS = eINSTANCE.getPlan_Quelle_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_QUELLE_TYPE_CLASS__WERT = eINSTANCE.getPlan_Quelle_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.StreckeImpl <em>Strecke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.StreckeImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getStrecke()
		 * @generated
		 */
		EClass STRECKE = eINSTANCE.getStrecke();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRECKE__BEZEICHNUNG = eINSTANCE.getStrecke_Bezeichnung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Strecke_Bezeichnung_AttributeGroupImpl <em>Strecke Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Strecke_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getStrecke_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getStrecke_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Strecke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE = eINSTANCE.getStrecke_Bezeichnung_AttributeGroup_BezeichnungStrecke();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Strecke_Meter_TypeClassImpl <em>Strecke Meter Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Strecke_Meter_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getStrecke_Meter_TypeClass()
		 * @generated
		 */
		EClass STRECKE_METER_TYPE_CLASS = eINSTANCE.getStrecke_Meter_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRECKE_METER_TYPE_CLASS__WERT = eINSTANCE.getStrecke_Meter_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Strecke_PunktImpl <em>Strecke Punkt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Strecke_PunktImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getStrecke_Punkt()
		 * @generated
		 */
		EClass STRECKE_PUNKT = eINSTANCE.getStrecke_Punkt();

		/**
		 * The meta object literal for the '<em><b>IDGEO Knoten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRECKE_PUNKT__IDGEO_KNOTEN = eINSTANCE.getStrecke_Punkt_IDGEOKnoten();

		/**
		 * The meta object literal for the '<em><b>ID Strecke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRECKE_PUNKT__ID_STRECKE = eINSTANCE.getStrecke_Punkt_IDStrecke();

		/**
		 * The meta object literal for the '<em><b>Strecke Meter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRECKE_PUNKT__STRECKE_METER = eINSTANCE.getStrecke_Punkt_StreckeMeter();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TB_Art_TypeClassImpl <em>TB Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.TB_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTB_Art_TypeClass()
		 * @generated
		 */
		EClass TB_ART_TYPE_CLASS = eINSTANCE.getTB_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TB_ART_TYPE_CLASS__WERT = eINSTANCE.getTB_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TB_Beschreibung_TypeClassImpl <em>TB Beschreibung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.TB_Beschreibung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTB_Beschreibung_TypeClass()
		 * @generated
		 */
		EClass TB_BESCHREIBUNG_TYPE_CLASS = eINSTANCE.getTB_Beschreibung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TB_BESCHREIBUNG_TYPE_CLASS__WERT = eINSTANCE.getTB_Beschreibung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Technischer_BereichImpl <em>Technischer Bereich</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Technischer_BereichImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTechnischer_Bereich()
		 * @generated
		 */
		EClass TECHNISCHER_BEREICH = eINSTANCE.getTechnischer_Bereich();

		/**
		 * The meta object literal for the '<em><b>TB Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNISCHER_BEREICH__TB_ART = eINSTANCE.getTechnischer_Bereich_TBArt();

		/**
		 * The meta object literal for the '<em><b>TB Beschreibung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNISCHER_BEREICH__TB_BESCHREIBUNG = eINSTANCE.getTechnischer_Bereich_TBBeschreibung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Technischer_PunktImpl <em>Technischer Punkt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Technischer_PunktImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTechnischer_Punkt()
		 * @generated
		 */
		EClass TECHNISCHER_PUNKT = eINSTANCE.getTechnischer_Punkt();

		/**
		 * The meta object literal for the '<em><b>TP Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNISCHER_PUNKT__TP_ART = eINSTANCE.getTechnischer_Punkt_TPArt();

		/**
		 * The meta object literal for the '<em><b>TP Beschreibung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNISCHER_PUNKT__TP_BESCHREIBUNG = eINSTANCE.getTechnischer_Punkt_TPBeschreibung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TOP_Anschluss_A_TypeClassImpl <em>TOP Anschluss AType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.TOP_Anschluss_A_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Anschluss_A_TypeClass()
		 * @generated
		 */
		EClass TOP_ANSCHLUSS_ATYPE_CLASS = eINSTANCE.getTOP_Anschluss_A_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_ANSCHLUSS_ATYPE_CLASS__WERT = eINSTANCE.getTOP_Anschluss_A_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TOP_Anschluss_B_TypeClassImpl <em>TOP Anschluss BType Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.TOP_Anschluss_B_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Anschluss_B_TypeClass()
		 * @generated
		 */
		EClass TOP_ANSCHLUSS_BTYPE_CLASS = eINSTANCE.getTOP_Anschluss_B_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_ANSCHLUSS_BTYPE_CLASS__WERT = eINSTANCE.getTOP_Anschluss_B_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TOP_KanteImpl <em>TOP Kante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.TOP_KanteImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Kante()
		 * @generated
		 */
		EClass TOP_KANTE = eINSTANCE.getTOP_Kante();

		/**
		 * The meta object literal for the '<em><b>IDTOP Knoten A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_KANTE__IDTOP_KNOTEN_A = eINSTANCE.getTOP_Kante_IDTOPKnotenA();

		/**
		 * The meta object literal for the '<em><b>IDTOP Knoten B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_KANTE__IDTOP_KNOTEN_B = eINSTANCE.getTOP_Kante_IDTOPKnotenB();

		/**
		 * The meta object literal for the '<em><b>TOP Kante Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_KANTE__TOP_KANTE_ALLG = eINSTANCE.getTOP_Kante_TOPKanteAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TOP_Kante_Allg_AttributeGroupImpl <em>TOP Kante Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.TOP_Kante_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Kante_Allg_AttributeGroup()
		 * @generated
		 */
		EClass TOP_KANTE_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getTOP_Kante_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>TOP Anschluss A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_A = eINSTANCE.getTOP_Kante_Allg_AttributeGroup_TOPAnschlussA();

		/**
		 * The meta object literal for the '<em><b>TOP Anschluss B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_B = eINSTANCE.getTOP_Kante_Allg_AttributeGroup_TOPAnschlussB();

		/**
		 * The meta object literal for the '<em><b>TOP Laenge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_LAENGE = eINSTANCE.getTOP_Kante_Allg_AttributeGroup_TOPLaenge();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TOP_KnotenImpl <em>TOP Knoten</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.TOP_KnotenImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Knoten()
		 * @generated
		 */
		EClass TOP_KNOTEN = eINSTANCE.getTOP_Knoten();

		/**
		 * The meta object literal for the '<em><b>IDGEO Knoten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_KNOTEN__IDGEO_KNOTEN = eINSTANCE.getTOP_Knoten_IDGEOKnoten();

		/**
		 * The meta object literal for the '<em><b>Knotenname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_KNOTEN__KNOTENNAME = eINSTANCE.getTOP_Knoten_Knotenname();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TOP_Laenge_TypeClassImpl <em>TOP Laenge Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.TOP_Laenge_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Laenge_TypeClass()
		 * @generated
		 */
		EClass TOP_LAENGE_TYPE_CLASS = eINSTANCE.getTOP_Laenge_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_LAENGE_TYPE_CLASS__WERT = eINSTANCE.getTOP_Laenge_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TP_Art_TypeClassImpl <em>TP Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.TP_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTP_Art_TypeClass()
		 * @generated
		 */
		EClass TP_ART_TYPE_CLASS = eINSTANCE.getTP_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TP_ART_TYPE_CLASS__WERT = eINSTANCE.getTP_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.TP_Beschreibung_TypeClassImpl <em>TP Beschreibung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.TP_Beschreibung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTP_Beschreibung_TypeClass()
		 * @generated
		 */
		EClass TP_BESCHREIBUNG_TYPE_CLASS = eINSTANCE.getTP_Beschreibung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TP_BESCHREIBUNG_TYPE_CLASS__WERT = eINSTANCE.getTP_Beschreibung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.UeberhoehungImpl <em>Ueberhoehung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.UeberhoehungImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehung()
		 * @generated
		 */
		EClass UEBERHOEHUNG = eINSTANCE.getUeberhoehung();

		/**
		 * The meta object literal for the '<em><b>Ueberhoehung Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEBERHOEHUNG__UEBERHOEHUNG_ALLG = eINSTANCE.getUeberhoehung_UeberhoehungAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehung_Allg_AttributeGroupImpl <em>Ueberhoehung Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehung_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehung_Allg_AttributeGroup()
		 * @generated
		 */
		EClass UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getUeberhoehung_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>GEOPAD</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__GEOPAD = eINSTANCE.getUeberhoehung_Allg_AttributeGroup_GEOPAD();

		/**
		 * The meta object literal for the '<em><b>Plan Quelle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE = eINSTANCE.getUeberhoehung_Allg_AttributeGroup_PlanQuelle();

		/**
		 * The meta object literal for the '<em><b>Ueberhoehung Datum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_DATUM = eINSTANCE.getUeberhoehung_Allg_AttributeGroup_UeberhoehungDatum();

		/**
		 * The meta object literal for the '<em><b>Ueberhoehung Hoehe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_HOEHE = eINSTANCE.getUeberhoehung_Allg_AttributeGroup_UeberhoehungHoehe();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehung_Datum_TypeClassImpl <em>Ueberhoehung Datum Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehung_Datum_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehung_Datum_TypeClass()
		 * @generated
		 */
		EClass UEBERHOEHUNG_DATUM_TYPE_CLASS = eINSTANCE.getUeberhoehung_Datum_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UEBERHOEHUNG_DATUM_TYPE_CLASS__WERT = eINSTANCE.getUeberhoehung_Datum_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehung_Hoehe_TypeClassImpl <em>Ueberhoehung Hoehe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehung_Hoehe_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehung_Hoehe_TypeClass()
		 * @generated
		 */
		EClass UEBERHOEHUNG_HOEHE_TYPE_CLASS = eINSTANCE.getUeberhoehung_Hoehe_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UEBERHOEHUNG_HOEHE_TYPE_CLASS__WERT = eINSTANCE.getUeberhoehung_Hoehe_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.UeberhoehungslinieImpl <em>Ueberhoehungslinie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.UeberhoehungslinieImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehungslinie()
		 * @generated
		 */
		EClass UEBERHOEHUNGSLINIE = eINSTANCE.getUeberhoehungslinie();

		/**
		 * The meta object literal for the '<em><b>ID Ueberhoehung A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A = eINSTANCE.getUeberhoehungslinie_IDUeberhoehungA();

		/**
		 * The meta object literal for the '<em><b>ID Ueberhoehung B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B = eINSTANCE.getUeberhoehungslinie_IDUeberhoehungB();

		/**
		 * The meta object literal for the '<em><b>Ueberhoehungslinie Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG = eINSTANCE.getUeberhoehungslinie_UeberhoehungslinieAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Allg_AttributeGroupImpl <em>Ueberhoehungslinie Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehungslinie_Allg_AttributeGroup()
		 * @generated
		 */
		EClass UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getUeberhoehungslinie_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Plan Quelle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE = eINSTANCE.getUeberhoehungslinie_Allg_AttributeGroup_PlanQuelle();

		/**
		 * The meta object literal for the '<em><b>Ueberhoehungslinie Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_FORM = eINSTANCE.getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieForm();

		/**
		 * The meta object literal for the '<em><b>Ueberhoehungslinie Laenge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_LAENGE = eINSTANCE.getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieLaenge();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Form_TypeClassImpl <em>Ueberhoehungslinie Form Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Form_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehungslinie_Form_TypeClass()
		 * @generated
		 */
		EClass UEBERHOEHUNGSLINIE_FORM_TYPE_CLASS = eINSTANCE.getUeberhoehungslinie_Form_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UEBERHOEHUNGSLINIE_FORM_TYPE_CLASS__WERT = eINSTANCE.getUeberhoehungslinie_Form_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Laenge_TypeClassImpl <em>Ueberhoehungslinie Laenge Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Laenge_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehungslinie_Laenge_TypeClass()
		 * @generated
		 */
		EClass UEBERHOEHUNGSLINIE_LAENGE_TYPE_CLASS = eINSTANCE.getUeberhoehungslinie_Laenge_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UEBERHOEHUNGSLINIE_LAENGE_TYPE_CLASS__WERT = eINSTANCE.getUeberhoehungslinie_Laenge_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.V_Profil_Art_TypeClassImpl <em>VProfil Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.V_Profil_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getV_Profil_Art_TypeClass()
		 * @generated
		 */
		EClass VPROFIL_ART_TYPE_CLASS = eINSTANCE.getV_Profil_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPROFIL_ART_TYPE_CLASS__WERT = eINSTANCE.getV_Profil_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.impl.Wirkrichtung_TypeClassImpl <em>Wirkrichtung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.Wirkrichtung_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getWirkrichtung_TypeClass()
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
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMGEOForm <em>ENUMGEO Form</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMGEOForm
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMGEOForm()
		 * @generated
		 */
		EEnum ENUMGEO_FORM = eINSTANCE.getENUMGEOForm();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMHoehenlinieForm <em>ENUM Hoehenlinie Form</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMHoehenlinieForm
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMHoehenlinieForm()
		 * @generated
		 */
		EEnum ENUM_HOEHENLINIE_FORM = eINSTANCE.getENUMHoehenlinieForm();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMHSystem <em>ENUMH System</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMHSystem
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMHSystem()
		 * @generated
		 */
		EEnum ENUMH_SYSTEM = eINSTANCE.getENUMHSystem();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMOertlichkeitArt <em>ENUM Oertlichkeit Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMOertlichkeitArt
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMOertlichkeitArt()
		 * @generated
		 */
		EEnum ENUM_OERTLICHKEIT_ART = eINSTANCE.getENUMOertlichkeitArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMPlanQuelle <em>ENUM Plan Quelle</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMPlanQuelle
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMPlanQuelle()
		 * @generated
		 */
		EEnum ENUM_PLAN_QUELLE = eINSTANCE.getENUMPlanQuelle();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMTBArt <em>ENUMTB Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTBArt
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMTBArt()
		 * @generated
		 */
		EEnum ENUMTB_ART = eINSTANCE.getENUMTBArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMTOPAnschluss <em>ENUMTOP Anschluss</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTOPAnschluss
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMTOPAnschluss()
		 * @generated
		 */
		EEnum ENUMTOP_ANSCHLUSS = eINSTANCE.getENUMTOPAnschluss();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMTPArt <em>ENUMTP Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTPArt
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMTPArt()
		 * @generated
		 */
		EEnum ENUMTP_ART = eINSTANCE.getENUMTPArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMUeberhoehungslinieForm <em>ENUM Ueberhoehungslinie Form</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMUeberhoehungslinieForm
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMUeberhoehungslinieForm()
		 * @generated
		 */
		EEnum ENUM_UEBERHOEHUNGSLINIE_FORM = eINSTANCE.getENUMUeberhoehungslinieForm();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Geodaten.ENUMVProfilArt <em>ENUMV Profil Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMVProfilArt
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMVProfilArt()
		 * @generated
		 */
		EEnum ENUMV_PROFIL_ART = eINSTANCE.getENUMVProfilArt();

		/**
		 * The meta object literal for the '<em>Bezeichnung Strecke Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getBezeichnung_Strecke_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_STRECKE_TYPE = eINSTANCE.getBezeichnung_Strecke_Type();

		/**
		 * The meta object literal for the '<em>ENUMGEO Form Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMGEOForm
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMGEOFormObject()
		 * @generated
		 */
		EDataType ENUMGEO_FORM_OBJECT = eINSTANCE.getENUMGEOFormObject();

		/**
		 * The meta object literal for the '<em>ENUM Hoehenlinie Form Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMHoehenlinieForm
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMHoehenlinieFormObject()
		 * @generated
		 */
		EDataType ENUM_HOEHENLINIE_FORM_OBJECT = eINSTANCE.getENUMHoehenlinieFormObject();

		/**
		 * The meta object literal for the '<em>ENUMH System Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMHSystem
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMHSystemObject()
		 * @generated
		 */
		EDataType ENUMH_SYSTEM_OBJECT = eINSTANCE.getENUMHSystemObject();

		/**
		 * The meta object literal for the '<em>ENUM Oertlichkeit Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMOertlichkeitArt
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMOertlichkeitArtObject()
		 * @generated
		 */
		EDataType ENUM_OERTLICHKEIT_ART_OBJECT = eINSTANCE.getENUMOertlichkeitArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Plan Quelle Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMPlanQuelle
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMPlanQuelleObject()
		 * @generated
		 */
		EDataType ENUM_PLAN_QUELLE_OBJECT = eINSTANCE.getENUMPlanQuelleObject();

		/**
		 * The meta object literal for the '<em>ENUMTB Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTBArt
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMTBArtObject()
		 * @generated
		 */
		EDataType ENUMTB_ART_OBJECT = eINSTANCE.getENUMTBArtObject();

		/**
		 * The meta object literal for the '<em>ENUMTOP Anschluss Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTOPAnschluss
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMTOPAnschlussObject()
		 * @generated
		 */
		EDataType ENUMTOP_ANSCHLUSS_OBJECT = eINSTANCE.getENUMTOPAnschlussObject();

		/**
		 * The meta object literal for the '<em>ENUMTP Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMTPArt
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMTPArtObject()
		 * @generated
		 */
		EDataType ENUMTP_ART_OBJECT = eINSTANCE.getENUMTPArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Ueberhoehungslinie Form Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMUeberhoehungslinieForm
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMUeberhoehungslinieFormObject()
		 * @generated
		 */
		EDataType ENUM_UEBERHOEHUNGSLINIE_FORM_OBJECT = eINSTANCE.getENUMUeberhoehungslinieFormObject();

		/**
		 * The meta object literal for the '<em>ENUMV Profil Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Geodaten.ENUMVProfilArt
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getENUMVProfilArtObject()
		 * @generated
		 */
		EDataType ENUMV_PROFIL_ART_OBJECT = eINSTANCE.getENUMVProfilArtObject();

		/**
		 * The meta object literal for the '<em>GEO Koordinaten System LSys Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_KoordinatenSystem_LSys_Type()
		 * @generated
		 */
		EDataType GEO_KOORDINATEN_SYSTEM_LSYS_TYPE = eINSTANCE.getGEO_KoordinatenSystem_LSys_Type();

		/**
		 * The meta object literal for the '<em>GEO Koordinaten System Sonstige Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_KoordinatenSystem_Sonstige_Type()
		 * @generated
		 */
		EDataType GEO_KOORDINATEN_SYSTEM_SONSTIGE_TYPE = eINSTANCE.getGEO_KoordinatenSystem_Sonstige_Type();

		/**
		 * The meta object literal for the '<em>GEO Laenge Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Laenge_Type()
		 * @generated
		 */
		EDataType GEO_LAENGE_TYPE = eINSTANCE.getGEO_Laenge_Type();

		/**
		 * The meta object literal for the '<em>GEO PAD Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_PAD_Type()
		 * @generated
		 */
		EDataType GEO_PAD_TYPE = eINSTANCE.getGEO_PAD_Type();

		/**
		 * The meta object literal for the '<em>GEO Radius AType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Radius_A_Type()
		 * @generated
		 */
		EDataType GEO_RADIUS_ATYPE = eINSTANCE.getGEO_Radius_A_Type();

		/**
		 * The meta object literal for the '<em>GEO Radius BType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Radius_B_Type()
		 * @generated
		 */
		EDataType GEO_RADIUS_BTYPE = eINSTANCE.getGEO_Radius_B_Type();

		/**
		 * The meta object literal for the '<em>GEO Richtungswinkel Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGEO_Richtungswinkel_Type()
		 * @generated
		 */
		EDataType GEO_RICHTUNGSWINKEL_TYPE = eINSTANCE.getGEO_Richtungswinkel_Type();

		/**
		 * The meta object literal for the '<em>Geschwindigkeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGeschwindigkeit_Type()
		 * @generated
		 */
		EDataType GESCHWINDIGKEIT_TYPE = eINSTANCE.getGeschwindigkeit_Type();

		/**
		 * The meta object literal for the '<em>GK XType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGK_X_Type()
		 * @generated
		 */
		EDataType GK_XTYPE = eINSTANCE.getGK_X_Type();

		/**
		 * The meta object literal for the '<em>GK YType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGK_Y_Type()
		 * @generated
		 */
		EDataType GK_YTYPE = eINSTANCE.getGK_Y_Type();

		/**
		 * The meta object literal for the '<em>GK ZType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getGK_Z_Type()
		 * @generated
		 */
		EDataType GK_ZTYPE = eINSTANCE.getGK_Z_Type();

		/**
		 * The meta object literal for the '<em>Hoehenlinie Laenge Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenlinie_Laenge_Type()
		 * @generated
		 */
		EDataType HOEHENLINIE_LAENGE_TYPE = eINSTANCE.getHoehenlinie_Laenge_Type();

		/**
		 * The meta object literal for the '<em>Hoehenpunkt Hoehe Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getHoehenpunkt_Hoehe_Type()
		 * @generated
		 */
		EDataType HOEHENPUNKT_HOEHE_TYPE = eINSTANCE.getHoehenpunkt_Hoehe_Type();

		/**
		 * The meta object literal for the '<em>Knotenname Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getKnotenname_Type()
		 * @generated
		 */
		EDataType KNOTENNAME_TYPE = eINSTANCE.getKnotenname_Type();

		/**
		 * The meta object literal for the '<em>Neigung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getNeigung_Type()
		 * @generated
		 */
		EDataType NEIGUNG_TYPE = eINSTANCE.getNeigung_Type();

		/**
		 * The meta object literal for the '<em>Oertlichkeit Abkuerzung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Abkuerzung_Type()
		 * @generated
		 */
		EDataType OERTLICHKEIT_ABKUERZUNG_TYPE = eINSTANCE.getOertlichkeit_Abkuerzung_Type();

		/**
		 * The meta object literal for the '<em>Oertlichkeit Kurzname Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Kurzname_Type()
		 * @generated
		 */
		EDataType OERTLICHKEIT_KURZNAME_TYPE = eINSTANCE.getOertlichkeit_Kurzname_Type();

		/**
		 * The meta object literal for the '<em>Oertlichkeit Langname Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getOertlichkeit_Langname_Type()
		 * @generated
		 */
		EDataType OERTLICHKEIT_LANGNAME_TYPE = eINSTANCE.getOertlichkeit_Langname_Type();

		/**
		 * The meta object literal for the '<em>Strecke Meter Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getStrecke_Meter_Type()
		 * @generated
		 */
		EDataType STRECKE_METER_TYPE = eINSTANCE.getStrecke_Meter_Type();

		/**
		 * The meta object literal for the '<em>TB Beschreibung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTB_Beschreibung_Type()
		 * @generated
		 */
		EDataType TB_BESCHREIBUNG_TYPE = eINSTANCE.getTB_Beschreibung_Type();

		/**
		 * The meta object literal for the '<em>TOP Laenge Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTOP_Laenge_Type()
		 * @generated
		 */
		EDataType TOP_LAENGE_TYPE = eINSTANCE.getTOP_Laenge_Type();

		/**
		 * The meta object literal for the '<em>TP Beschreibung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getTP_Beschreibung_Type()
		 * @generated
		 */
		EDataType TP_BESCHREIBUNG_TYPE = eINSTANCE.getTP_Beschreibung_Type();

		/**
		 * The meta object literal for the '<em>Ueberhoehung Hoehe Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehung_Hoehe_Type()
		 * @generated
		 */
		EDataType UEBERHOEHUNG_HOEHE_TYPE = eINSTANCE.getUeberhoehung_Hoehe_Type();

		/**
		 * The meta object literal for the '<em>Ueberhoehungslinie Laenge Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getUeberhoehungslinie_Laenge_Type()
		 * @generated
		 */
		EDataType UEBERHOEHUNGSLINIE_LAENGE_TYPE = eINSTANCE.getUeberhoehungslinie_Laenge_Type();

		/**
		 * The meta object literal for the '<em>Wirkrichtung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.BasisTypen.ENUMWirkrichtung
		 * @see org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl#getWirkrichtung_Type()
		 * @generated
		 */
		EDataType WIRKRICHTUNG_TYPE = eINSTANCE.getWirkrichtung_Type();

	}

} //GeodatenPackage
