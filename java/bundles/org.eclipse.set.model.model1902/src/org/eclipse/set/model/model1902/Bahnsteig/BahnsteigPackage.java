/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnsteig;

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
 * @see org.eclipse.set.model.model1902.Bahnsteig.BahnsteigFactory
 * @model kind="package"
 * @generated
 */
public interface BahnsteigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Bahnsteig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Bahnsteig/1.9.0.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsBahnsteig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BahnsteigPackage eINSTANCE = org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_AnlageImpl <em>Bahnsteig Anlage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_AnlageImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Anlage()
	 * @generated
	 */
	int BAHNSTEIG_ANLAGE = 0;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ANLAGE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ANLAGE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ANLAGE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ANLAGE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ANLAGE__BEZEICHNUNG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bahnsteig Anlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ANLAGE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bahnsteig Anlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ANLAGE_OPERATION_COUNT = BasisobjektePackage.BASIS_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Anlage_Bezeichnung_AttributeGroupImpl <em>Bahnsteig Anlage Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Anlage_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Anlage_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Bezeichnung Bahnsteig Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_ANLAGE = 0;

	/**
	 * The number of structural features of the '<em>Bahnsteig Anlage Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bahnsteig Anlage Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_DachImpl <em>Bahnsteig Dach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_DachImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Dach()
	 * @generated
	 */
	int BAHNSTEIG_DACH = 2;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_DACH__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_DACH__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_DACH__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_DACH__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_DACH__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>ID Bahnsteig Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bahnsteig Dach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_DACH_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bahnsteig Dach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_DACH_OPERATION_COUNT = BasisobjektePackage.BEREICH_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_KanteImpl <em>Bahnsteig Kante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_KanteImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Kante()
	 * @generated
	 */
	int BAHNSTEIG_KANTE = 3;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>Bahnsteig Kante Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE__BEZEICHNUNG = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID Bahnsteig Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bahnsteig Kante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bahnsteig Kante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE_OPERATION_COUNT = BasisobjektePackage.BEREICH_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Kante_Allg_AttributeGroupImpl <em>Bahnsteig Kante Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Kante_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	int BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Lage Zum Gleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__LAGE_ZUM_GLEIS = 0;

	/**
	 * The feature id for the '<em><b>Systemhoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__SYSTEMHOEHE = 1;

	/**
	 * The number of structural features of the '<em>Bahnsteig Kante Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bahnsteig Kante Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Kante_Bezeichnung_AttributeGroupImpl <em>Bahnsteig Kante Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Kante_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Kante_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Bezeichnung Bahnsteig Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_KANTE = 0;

	/**
	 * The number of structural features of the '<em>Bahnsteig Kante Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bahnsteig Kante Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_ZugangImpl <em>Bahnsteig Zugang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_ZugangImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Zugang()
	 * @generated
	 */
	int BAHNSTEIG_ZUGANG = 6;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG__IDENTITAET = BasisobjektePackage.PUNKT_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG__BASIS_OBJEKT_ALLG = BasisobjektePackage.PUNKT_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.PUNKT_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG__OBJEKTREFERENZEN = BasisobjektePackage.PUNKT_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG__PUNKT_OBJEKT_STRECKE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE;

	/**
	 * The feature id for the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG__PUNKT_OBJEKT_TOP_KANTE = BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE;

	/**
	 * The feature id for the '<em><b>Bahnsteig Zugang Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID Bahnsteig Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bahnsteig Zugang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG_FEATURE_COUNT = BasisobjektePackage.PUNKT_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bahnsteig Zugang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG_OPERATION_COUNT = BasisobjektePackage.PUNKT_OBJEKT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Zugang_Allg_AttributeGroupImpl <em>Bahnsteig Zugang Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Zugang_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Zugang_Allg_AttributeGroup()
	 * @generated
	 */
	int BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Bahnsteig Zugang Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG_ART = 0;

	/**
	 * The feature id for the '<em><b>Hauptzugang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__HAUPTZUGANG = 1;

	/**
	 * The number of structural features of the '<em>Bahnsteig Zugang Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bahnsteig Zugang Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Zugang_Art_TypeClassImpl <em>Bahnsteig Zugang Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Zugang_Art_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Zugang_Art_TypeClass()
	 * @generated
	 */
	int BAHNSTEIG_ZUGANG_ART_TYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bahnsteig Zugang Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bahnsteig Zugang Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNSTEIG_ZUGANG_ART_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bezeichnung_Bahnsteig_Anlage_TypeClassImpl <em>Bezeichnung Bahnsteig Anlage Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bezeichnung_Bahnsteig_Anlage_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBezeichnung_Bahnsteig_Anlage_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Bahnsteig Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bezeichnung Bahnsteig Anlage Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bezeichnung_Bahnsteig_Kante_TypeClassImpl <em>Bezeichnung Bahnsteig Kante Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bezeichnung_Bahnsteig_Kante_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBezeichnung_Bahnsteig_Kante_TypeClass()
	 * @generated
	 */
	int BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bezeichnung Bahnsteig Kante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bezeichnung Bahnsteig Kante Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Hauptzugang_TypeClassImpl <em>Hauptzugang Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Hauptzugang_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getHauptzugang_TypeClass()
	 * @generated
	 */
	int HAUPTZUGANG_TYPE_CLASS = 11;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTZUGANG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTZUGANG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hauptzugang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTZUGANG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hauptzugang Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTZUGANG_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Lage_Zum_Gleis_TypeClassImpl <em>Lage Zum Gleis Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Lage_Zum_Gleis_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getLage_Zum_Gleis_TypeClass()
	 * @generated
	 */
	int LAGE_ZUM_GLEIS_TYPE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGE_ZUM_GLEIS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGE_ZUM_GLEIS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lage Zum Gleis Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGE_ZUM_GLEIS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lage Zum Gleis Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGE_ZUM_GLEIS_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Systemhoehe_TypeClassImpl <em>Systemhoehe Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Systemhoehe_TypeClassImpl
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getSystemhoehe_TypeClass()
	 * @generated
	 */
	int SYSTEMHOEHE_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMHOEHE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMHOEHE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Systemhoehe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMHOEHE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Systemhoehe Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMHOEHE_TYPE_CLASS_OPERATION_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.ENUMBahnsteigZugangArt <em>ENUM Bahnsteig Zugang Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.ENUMBahnsteigZugangArt
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getENUMBahnsteigZugangArt()
	 * @generated
	 */
	int ENUM_BAHNSTEIG_ZUGANG_ART = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model1902.Bahnsteig.ENUMSystemhoehe <em>ENUM Systemhoehe</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.ENUMSystemhoehe
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getENUMSystemhoehe()
	 * @generated
	 */
	int ENUM_SYSTEMHOEHE = 15;

	/**
	 * The meta object id for the '<em>Bezeichnung Bahnsteig Anlage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBezeichnung_Bahnsteig_Anlage_Type()
	 * @generated
	 */
	int BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE = 16;

	/**
	 * The meta object id for the '<em>Bezeichnung Bahnsteig Kante Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBezeichnung_Bahnsteig_Kante_Type()
	 * @generated
	 */
	int BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE = 17;

	/**
	 * The meta object id for the '<em>ENUM Bahnsteig Zugang Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.ENUMBahnsteigZugangArt
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getENUMBahnsteigZugangArtObject()
	 * @generated
	 */
	int ENUM_BAHNSTEIG_ZUGANG_ART_OBJECT = 18;

	/**
	 * The meta object id for the '<em>ENUM Systemhoehe Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.ENUMSystemhoehe
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getENUMSystemhoeheObject()
	 * @generated
	 */
	int ENUM_SYSTEMHOEHE_OBJECT = 19;

	/**
	 * The meta object id for the '<em>Hauptzugang Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getHauptzugang_Type()
	 * @generated
	 */
	int HAUPTZUGANG_TYPE = 20;

	/**
	 * The meta object id for the '<em>Hauptzugang Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getHauptzugang_TypeObject()
	 * @generated
	 */
	int HAUPTZUGANG_TYPE_OBJECT = 21;

	/**
	 * The meta object id for the '<em>Lage Zum Gleis Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model1902.BasisTypen.ENUMLinksRechts
	 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getLage_Zum_Gleis_Type()
	 * @generated
	 */
	int LAGE_ZUM_GLEIS_TYPE = 22;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Anlage <em>Bahnsteig Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bahnsteig Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Anlage
	 * @generated
	 */
	EClass getBahnsteig_Anlage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Anlage#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Anlage#getBezeichnung()
	 * @see #getBahnsteig_Anlage()
	 * @generated
	 */
	EReference getBahnsteig_Anlage_Bezeichnung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Anlage_Bezeichnung_AttributeGroup <em>Bahnsteig Anlage Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bahnsteig Anlage Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Anlage_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getBahnsteig_Anlage_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Anlage_Bezeichnung_AttributeGroup#getBezeichnungBahnsteigAnlage <em>Bezeichnung Bahnsteig Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Bahnsteig Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Anlage_Bezeichnung_AttributeGroup#getBezeichnungBahnsteigAnlage()
	 * @see #getBahnsteig_Anlage_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getBahnsteig_Anlage_Bezeichnung_AttributeGroup_BezeichnungBahnsteigAnlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Dach <em>Bahnsteig Dach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bahnsteig Dach</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Dach
	 * @generated
	 */
	EClass getBahnsteig_Dach();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Dach#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bahnsteig Kante</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Dach#getIDBahnsteigKante()
	 * @see #getBahnsteig_Dach()
	 * @generated
	 */
	EReference getBahnsteig_Dach_IDBahnsteigKante();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante <em>Bahnsteig Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bahnsteig Kante</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante
	 * @generated
	 */
	EClass getBahnsteig_Kante();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante#getBahnsteigKanteAllg <em>Bahnsteig Kante Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bahnsteig Kante Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante#getBahnsteigKanteAllg()
	 * @see #getBahnsteig_Kante()
	 * @generated
	 */
	EReference getBahnsteig_Kante_BahnsteigKanteAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante#getBezeichnung()
	 * @see #getBahnsteig_Kante()
	 * @generated
	 */
	EReference getBahnsteig_Kante_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bahnsteig Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante#getIDBahnsteigAnlage()
	 * @see #getBahnsteig_Kante()
	 * @generated
	 */
	EReference getBahnsteig_Kante_IDBahnsteigAnlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup <em>Bahnsteig Kante Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bahnsteig Kante Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBahnsteig_Kante_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup#getLageZumGleis <em>Lage Zum Gleis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lage Zum Gleis</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup#getLageZumGleis()
	 * @see #getBahnsteig_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBahnsteig_Kante_Allg_AttributeGroup_LageZumGleis();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup#getSystemhoehe <em>Systemhoehe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Systemhoehe</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup#getSystemhoehe()
	 * @see #getBahnsteig_Kante_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBahnsteig_Kante_Allg_AttributeGroup_Systemhoehe();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante_Bezeichnung_AttributeGroup <em>Bahnsteig Kante Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bahnsteig Kante Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getBahnsteig_Kante_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante_Bezeichnung_AttributeGroup#getBezeichnungBahnsteigKante <em>Bezeichnung Bahnsteig Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung Bahnsteig Kante</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante_Bezeichnung_AttributeGroup#getBezeichnungBahnsteigKante()
	 * @see #getBahnsteig_Kante_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getBahnsteig_Kante_Bezeichnung_AttributeGroup_BezeichnungBahnsteigKante();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang <em>Bahnsteig Zugang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bahnsteig Zugang</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang
	 * @generated
	 */
	EClass getBahnsteig_Zugang();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang#getBahnsteigZugangAllg <em>Bahnsteig Zugang Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bahnsteig Zugang Allg</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang#getBahnsteigZugangAllg()
	 * @see #getBahnsteig_Zugang()
	 * @generated
	 */
	EReference getBahnsteig_Zugang_BahnsteigZugangAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Bahnsteig Anlage</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang#getIDBahnsteigAnlage()
	 * @see #getBahnsteig_Zugang()
	 * @generated
	 */
	EReference getBahnsteig_Zugang_IDBahnsteigAnlage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup <em>Bahnsteig Zugang Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bahnsteig Zugang Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup
	 * @generated
	 */
	EClass getBahnsteig_Zugang_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup#getBahnsteigZugangArt <em>Bahnsteig Zugang Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bahnsteig Zugang Art</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup#getBahnsteigZugangArt()
	 * @see #getBahnsteig_Zugang_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBahnsteig_Zugang_Allg_AttributeGroup_BahnsteigZugangArt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup#getHauptzugang <em>Hauptzugang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hauptzugang</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup#getHauptzugang()
	 * @see #getBahnsteig_Zugang_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getBahnsteig_Zugang_Allg_AttributeGroup_Hauptzugang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang_Art_TypeClass <em>Bahnsteig Zugang Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bahnsteig Zugang Art Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang_Art_TypeClass
	 * @generated
	 */
	EClass getBahnsteig_Zugang_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang_Art_TypeClass#getWert()
	 * @see #getBahnsteig_Zugang_Art_TypeClass()
	 * @generated
	 */
	EAttribute getBahnsteig_Zugang_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Bezeichnung_Bahnsteig_Anlage_TypeClass <em>Bezeichnung Bahnsteig Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Bahnsteig Anlage Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bezeichnung_Bahnsteig_Anlage_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Bahnsteig_Anlage_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnsteig.Bezeichnung_Bahnsteig_Anlage_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bezeichnung_Bahnsteig_Anlage_TypeClass#getWert()
	 * @see #getBezeichnung_Bahnsteig_Anlage_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Bahnsteig_Anlage_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Bezeichnung_Bahnsteig_Kante_TypeClass <em>Bezeichnung Bahnsteig Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezeichnung Bahnsteig Kante Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bezeichnung_Bahnsteig_Kante_TypeClass
	 * @generated
	 */
	EClass getBezeichnung_Bahnsteig_Kante_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnsteig.Bezeichnung_Bahnsteig_Kante_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Bezeichnung_Bahnsteig_Kante_TypeClass#getWert()
	 * @see #getBezeichnung_Bahnsteig_Kante_TypeClass()
	 * @generated
	 */
	EAttribute getBezeichnung_Bahnsteig_Kante_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Hauptzugang_TypeClass <em>Hauptzugang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hauptzugang Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Hauptzugang_TypeClass
	 * @generated
	 */
	EClass getHauptzugang_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnsteig.Hauptzugang_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Hauptzugang_TypeClass#getWert()
	 * @see #getHauptzugang_TypeClass()
	 * @generated
	 */
	EAttribute getHauptzugang_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Lage_Zum_Gleis_TypeClass <em>Lage Zum Gleis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lage Zum Gleis Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Lage_Zum_Gleis_TypeClass
	 * @generated
	 */
	EClass getLage_Zum_Gleis_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnsteig.Lage_Zum_Gleis_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Lage_Zum_Gleis_TypeClass#getWert()
	 * @see #getLage_Zum_Gleis_TypeClass()
	 * @generated
	 */
	EAttribute getLage_Zum_Gleis_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model1902.Bahnsteig.Systemhoehe_TypeClass <em>Systemhoehe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systemhoehe Type Class</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Systemhoehe_TypeClass
	 * @generated
	 */
	EClass getSystemhoehe_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model1902.Bahnsteig.Systemhoehe_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.Systemhoehe_TypeClass#getWert()
	 * @see #getSystemhoehe_TypeClass()
	 * @generated
	 */
	EAttribute getSystemhoehe_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnsteig.ENUMBahnsteigZugangArt <em>ENUM Bahnsteig Zugang Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Bahnsteig Zugang Art</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.ENUMBahnsteigZugangArt
	 * @generated
	 */
	EEnum getENUMBahnsteigZugangArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model1902.Bahnsteig.ENUMSystemhoehe <em>ENUM Systemhoehe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Systemhoehe</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.ENUMSystemhoehe
	 * @generated
	 */
	EEnum getENUMSystemhoehe();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Bahnsteig Anlage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Bahnsteig Anlage Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Bahnsteig_Anlage' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText'"
	 * @generated
	 */
	EDataType getBezeichnung_Bahnsteig_Anlage_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bezeichnung Bahnsteig Kante Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezeichnung Bahnsteig Kante Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBezeichnung_Bahnsteig_Kante' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText'"
	 * @generated
	 */
	EDataType getBezeichnung_Bahnsteig_Kante_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnsteig.ENUMBahnsteigZugangArt <em>ENUM Bahnsteig Zugang Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Bahnsteig Zugang Art Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.ENUMBahnsteigZugangArt
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnsteig.ENUMBahnsteigZugangArt"
	 *        extendedMetaData="name='ENUMBahnsteig_Zugang_Art:Object' baseType='ENUMBahnsteig_Zugang_Art'"
	 * @generated
	 */
	EDataType getENUMBahnsteigZugangArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.Bahnsteig.ENUMSystemhoehe <em>ENUM Systemhoehe Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Systemhoehe Object</em>'.
	 * @see org.eclipse.set.model.model1902.Bahnsteig.ENUMSystemhoehe
	 * @model instanceClass="org.eclipse.set.model.model1902.Bahnsteig.ENUMSystemhoehe"
	 *        extendedMetaData="name='ENUMSystemhoehe:Object' baseType='ENUMSystemhoehe'"
	 * @generated
	 */
	EDataType getENUMSystemhoeheObject();

	/**
	 * Returns the meta object for data type '<em>Hauptzugang Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hauptzugang Type</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='THauptzugang' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean'"
	 * @generated
	 */
	EDataType getHauptzugang_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Hauptzugang Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hauptzugang Type Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='THauptzugang:Object' baseType='THauptzugang'"
	 * @generated
	 */
	EDataType getHauptzugang_TypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model1902.BasisTypen.ENUMLinksRechts <em>Lage Zum Gleis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lage Zum Gleis Type</em>'.
	 * @see org.eclipse.set.model.model1902.BasisTypen.ENUMLinksRechts
	 * @model instanceClass="org.eclipse.set.model.model1902.BasisTypen.ENUMLinksRechts"
	 *        extendedMetaData="name='TLage_Zum_Gleis' baseType='http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TLinksRechts'"
	 * @generated
	 */
	EDataType getLage_Zum_Gleis_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BahnsteigFactory getBahnsteigFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_AnlageImpl <em>Bahnsteig Anlage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_AnlageImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Anlage()
		 * @generated
		 */
		EClass BAHNSTEIG_ANLAGE = eINSTANCE.getBahnsteig_Anlage();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNSTEIG_ANLAGE__BEZEICHNUNG = eINSTANCE.getBahnsteig_Anlage_Bezeichnung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Anlage_Bezeichnung_AttributeGroupImpl <em>Bahnsteig Anlage Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Anlage_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Anlage_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getBahnsteig_Anlage_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Bahnsteig Anlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_ANLAGE = eINSTANCE.getBahnsteig_Anlage_Bezeichnung_AttributeGroup_BezeichnungBahnsteigAnlage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_DachImpl <em>Bahnsteig Dach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_DachImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Dach()
		 * @generated
		 */
		EClass BAHNSTEIG_DACH = eINSTANCE.getBahnsteig_Dach();

		/**
		 * The meta object literal for the '<em><b>ID Bahnsteig Kante</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE = eINSTANCE.getBahnsteig_Dach_IDBahnsteigKante();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_KanteImpl <em>Bahnsteig Kante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_KanteImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Kante()
		 * @generated
		 */
		EClass BAHNSTEIG_KANTE = eINSTANCE.getBahnsteig_Kante();

		/**
		 * The meta object literal for the '<em><b>Bahnsteig Kante Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG = eINSTANCE.getBahnsteig_Kante_BahnsteigKanteAllg();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNSTEIG_KANTE__BEZEICHNUNG = eINSTANCE.getBahnsteig_Kante_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>ID Bahnsteig Anlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE = eINSTANCE.getBahnsteig_Kante_IDBahnsteigAnlage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Kante_Allg_AttributeGroupImpl <em>Bahnsteig Kante Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Kante_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Kante_Allg_AttributeGroup()
		 * @generated
		 */
		EClass BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getBahnsteig_Kante_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Lage Zum Gleis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__LAGE_ZUM_GLEIS = eINSTANCE.getBahnsteig_Kante_Allg_AttributeGroup_LageZumGleis();

		/**
		 * The meta object literal for the '<em><b>Systemhoehe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__SYSTEMHOEHE = eINSTANCE.getBahnsteig_Kante_Allg_AttributeGroup_Systemhoehe();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Kante_Bezeichnung_AttributeGroupImpl <em>Bahnsteig Kante Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Kante_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Kante_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getBahnsteig_Kante_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung Bahnsteig Kante</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_KANTE = eINSTANCE.getBahnsteig_Kante_Bezeichnung_AttributeGroup_BezeichnungBahnsteigKante();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_ZugangImpl <em>Bahnsteig Zugang</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_ZugangImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Zugang()
		 * @generated
		 */
		EClass BAHNSTEIG_ZUGANG = eINSTANCE.getBahnsteig_Zugang();

		/**
		 * The meta object literal for the '<em><b>Bahnsteig Zugang Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG = eINSTANCE.getBahnsteig_Zugang_BahnsteigZugangAllg();

		/**
		 * The meta object literal for the '<em><b>ID Bahnsteig Anlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE = eINSTANCE.getBahnsteig_Zugang_IDBahnsteigAnlage();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Zugang_Allg_AttributeGroupImpl <em>Bahnsteig Zugang Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Zugang_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Zugang_Allg_AttributeGroup()
		 * @generated
		 */
		EClass BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getBahnsteig_Zugang_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bahnsteig Zugang Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG_ART = eINSTANCE.getBahnsteig_Zugang_Allg_AttributeGroup_BahnsteigZugangArt();

		/**
		 * The meta object literal for the '<em><b>Hauptzugang</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__HAUPTZUGANG = eINSTANCE.getBahnsteig_Zugang_Allg_AttributeGroup_Hauptzugang();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Zugang_Art_TypeClassImpl <em>Bahnsteig Zugang Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bahnsteig_Zugang_Art_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBahnsteig_Zugang_Art_TypeClass()
		 * @generated
		 */
		EClass BAHNSTEIG_ZUGANG_ART_TYPE_CLASS = eINSTANCE.getBahnsteig_Zugang_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAHNSTEIG_ZUGANG_ART_TYPE_CLASS__WERT = eINSTANCE.getBahnsteig_Zugang_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bezeichnung_Bahnsteig_Anlage_TypeClassImpl <em>Bezeichnung Bahnsteig Anlage Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bezeichnung_Bahnsteig_Anlage_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBezeichnung_Bahnsteig_Anlage_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE_CLASS = eINSTANCE.getBezeichnung_Bahnsteig_Anlage_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Bahnsteig_Anlage_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Bezeichnung_Bahnsteig_Kante_TypeClassImpl <em>Bezeichnung Bahnsteig Kante Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Bezeichnung_Bahnsteig_Kante_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBezeichnung_Bahnsteig_Kante_TypeClass()
		 * @generated
		 */
		EClass BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE_CLASS = eINSTANCE.getBezeichnung_Bahnsteig_Kante_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE_CLASS__WERT = eINSTANCE.getBezeichnung_Bahnsteig_Kante_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Hauptzugang_TypeClassImpl <em>Hauptzugang Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Hauptzugang_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getHauptzugang_TypeClass()
		 * @generated
		 */
		EClass HAUPTZUGANG_TYPE_CLASS = eINSTANCE.getHauptzugang_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAUPTZUGANG_TYPE_CLASS__WERT = eINSTANCE.getHauptzugang_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Lage_Zum_Gleis_TypeClassImpl <em>Lage Zum Gleis Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Lage_Zum_Gleis_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getLage_Zum_Gleis_TypeClass()
		 * @generated
		 */
		EClass LAGE_ZUM_GLEIS_TYPE_CLASS = eINSTANCE.getLage_Zum_Gleis_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAGE_ZUM_GLEIS_TYPE_CLASS__WERT = eINSTANCE.getLage_Zum_Gleis_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.impl.Systemhoehe_TypeClassImpl <em>Systemhoehe Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.Systemhoehe_TypeClassImpl
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getSystemhoehe_TypeClass()
		 * @generated
		 */
		EClass SYSTEMHOEHE_TYPE_CLASS = eINSTANCE.getSystemhoehe_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEMHOEHE_TYPE_CLASS__WERT = eINSTANCE.getSystemhoehe_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.ENUMBahnsteigZugangArt <em>ENUM Bahnsteig Zugang Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.ENUMBahnsteigZugangArt
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getENUMBahnsteigZugangArt()
		 * @generated
		 */
		EEnum ENUM_BAHNSTEIG_ZUGANG_ART = eINSTANCE.getENUMBahnsteigZugangArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model1902.Bahnsteig.ENUMSystemhoehe <em>ENUM Systemhoehe</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.ENUMSystemhoehe
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getENUMSystemhoehe()
		 * @generated
		 */
		EEnum ENUM_SYSTEMHOEHE = eINSTANCE.getENUMSystemhoehe();

		/**
		 * The meta object literal for the '<em>Bezeichnung Bahnsteig Anlage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBezeichnung_Bahnsteig_Anlage_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE = eINSTANCE.getBezeichnung_Bahnsteig_Anlage_Type();

		/**
		 * The meta object literal for the '<em>Bezeichnung Bahnsteig Kante Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getBezeichnung_Bahnsteig_Kante_Type()
		 * @generated
		 */
		EDataType BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE = eINSTANCE.getBezeichnung_Bahnsteig_Kante_Type();

		/**
		 * The meta object literal for the '<em>ENUM Bahnsteig Zugang Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.ENUMBahnsteigZugangArt
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getENUMBahnsteigZugangArtObject()
		 * @generated
		 */
		EDataType ENUM_BAHNSTEIG_ZUGANG_ART_OBJECT = eINSTANCE.getENUMBahnsteigZugangArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Systemhoehe Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.ENUMSystemhoehe
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getENUMSystemhoeheObject()
		 * @generated
		 */
		EDataType ENUM_SYSTEMHOEHE_OBJECT = eINSTANCE.getENUMSystemhoeheObject();

		/**
		 * The meta object literal for the '<em>Hauptzugang Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getHauptzugang_Type()
		 * @generated
		 */
		EDataType HAUPTZUGANG_TYPE = eINSTANCE.getHauptzugang_Type();

		/**
		 * The meta object literal for the '<em>Hauptzugang Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getHauptzugang_TypeObject()
		 * @generated
		 */
		EDataType HAUPTZUGANG_TYPE_OBJECT = eINSTANCE.getHauptzugang_TypeObject();

		/**
		 * The meta object literal for the '<em>Lage Zum Gleis Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model1902.BasisTypen.ENUMLinksRechts
		 * @see org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl#getLage_Zum_Gleis_Type()
		 * @generated
		 */
		EDataType LAGE_ZUM_GLEIS_TYPE = eINSTANCE.getLage_Zum_Gleis_Type();

	}

} //BahnsteigPackage
