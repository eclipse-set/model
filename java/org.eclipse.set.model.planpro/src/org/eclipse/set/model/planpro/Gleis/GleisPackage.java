/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Gleis;

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
 * @see org.eclipse.set.model.planpro.Gleis.GleisFactory
 * @model kind="package"
 * @generated
 */
public interface GleisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Gleis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Gleis/1.10.0.3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsGleis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GleisPackage eINSTANCE = org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Baubereich_Art_TypeClassImpl <em>Baubereich Art Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Baubereich_Art_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getBaubereich_Art_TypeClass()
	 * @generated
	 */
	int BAUBEREICH_ART_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUBEREICH_ART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUBEREICH_ART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Baubereich Art Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUBEREICH_ART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Bez_Gleis_Bezeichnung_TypeClassImpl <em>Bez Gleis Bezeichnung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Bez_Gleis_Bezeichnung_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getBez_Gleis_Bezeichnung_TypeClass()
	 * @generated
	 */
	int BEZ_GLEIS_BEZEICHNUNG_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_GLEIS_BEZEICHNUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_GLEIS_BEZEICHNUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bez Gleis Bezeichnung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZ_GLEIS_BEZEICHNUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Fahrstrom_TypeClassImpl <em>Fahrstrom Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Fahrstrom_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getFahrstrom_TypeClass()
	 * @generated
	 */
	int FAHRSTROM_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRSTROM_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRSTROM_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fahrstrom Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAHRSTROM_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Geschwindigkeit_TypeClassImpl <em>Geschwindigkeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Geschwindigkeit_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGeschwindigkeit_TypeClass()
	 * @generated
	 */
	int GESCHWINDIGKEIT_TYPE_CLASS = 3;

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
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_AbschnittImpl <em>Gleis Abschnitt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_AbschnittImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Abschnitt()
	 * @generated
	 */
	int GLEIS_ABSCHNITT = 4;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHNITT__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHNITT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHNITT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHNITT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BEREICH_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHNITT__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHNITT__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHNITT__BEZEICHNUNG = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geschwindigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHNITT__GESCHWINDIGKEIT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gleis Abschnitt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ABSCHNITT_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_ArtImpl <em>Gleis Art</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_ArtImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Art()
	 * @generated
	 */
	int GLEIS_ART = 5;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ART__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ART__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ART__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ART__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BEREICH_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ART__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ART__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>Gleisart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ART__GLEISART = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gleis Art</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_ART_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_BaubereichImpl <em>Gleis Baubereich</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_BaubereichImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Baubereich()
	 * @generated
	 */
	int GLEIS_BAUBEREICH = 6;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BAUBEREICH__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BAUBEREICH__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BAUBEREICH__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BAUBEREICH__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BEREICH_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BAUBEREICH__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BAUBEREICH__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>Baubereich Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BAUBEREICH__BAUBEREICH_ART = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gleis Baubereich</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BAUBEREICH_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_BezeichnungImpl <em>Gleis Bezeichnung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_BezeichnungImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Bezeichnung()
	 * @generated
	 */
	int GLEIS_BEZEICHNUNG = 7;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BEZEICHNUNG__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BEZEICHNUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BEZEICHNUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BEZEICHNUNG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BEREICH_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BEZEICHNUNG__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BEZEICHNUNG__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BEZEICHNUNG__BEZEICHNUNG = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gleis Bezeichnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BEZEICHNUNG_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_Bezeichnung_Bezeichnung_AttributeGroupImpl <em>Gleis Bezeichnung Bezeichnung Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_Bezeichnung_Bezeichnung_AttributeGroupImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Bezeichnung_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	int GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Bez Gleis Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_GLEIS_BEZEICHNUNG = 0;

	/**
	 * The number of structural features of the '<em>Gleis Bezeichnung Bezeichnung Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_FahrbahnImpl <em>Gleis Fahrbahn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_FahrbahnImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Fahrbahn()
	 * @generated
	 */
	int GLEIS_FAHRBAHN = 9;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_FAHRBAHN__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_FAHRBAHN__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_FAHRBAHN__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_FAHRBAHN__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BEREICH_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_FAHRBAHN__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_FAHRBAHN__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>Konstruktion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_FAHRBAHN__KONSTRUKTION = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gleis Fahrbahn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_FAHRBAHN_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_LichtraumImpl <em>Gleis Lichtraum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_LichtraumImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Lichtraum()
	 * @generated
	 */
	int GLEIS_LICHTRAUM = 10;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_LICHTRAUM__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_LICHTRAUM__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_LICHTRAUM__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_LICHTRAUM__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BEREICH_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_LICHTRAUM__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_LICHTRAUM__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>Lichtraumprofil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_LICHTRAUM__LICHTRAUMPROFIL = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gleis Lichtraum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_LICHTRAUM_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_SchaltgruppeImpl <em>Gleis Schaltgruppe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_SchaltgruppeImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Schaltgruppe()
	 * @generated
	 */
	int GLEIS_SCHALTGRUPPE = 11;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_SCHALTGRUPPE__IDENTITAET = BasisobjektePackage.BEREICH_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_SCHALTGRUPPE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BEREICH_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_SCHALTGRUPPE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BEREICH_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_SCHALTGRUPPE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BEREICH_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_SCHALTGRUPPE__OBJEKTREFERENZEN = BasisobjektePackage.BEREICH_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_SCHALTGRUPPE__BEREICH_OBJEKT_TEILBEREICH = BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_SCHALTGRUPPE__BEZEICHNUNG = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fahrstrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_SCHALTGRUPPE__FAHRSTROM = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gleis Schaltgruppe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEIS_SCHALTGRUPPE_FEATURE_COUNT = BasisobjektePackage.BEREICH_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleisart_TypeClassImpl <em>Gleisart Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleisart_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleisart_TypeClass()
	 * @generated
	 */
	int GLEISART_TYPE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISART_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISART_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gleisart Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLEISART_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Konstruktion_TypeClassImpl <em>Konstruktion Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Konstruktion_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getKonstruktion_TypeClass()
	 * @generated
	 */
	int KONSTRUKTION_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONSTRUKTION_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONSTRUKTION_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Konstruktion Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONSTRUKTION_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Lichtraumprofil_TypeClassImpl <em>Lichtraumprofil Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.impl.Lichtraumprofil_TypeClassImpl
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getLichtraumprofil_TypeClass()
	 * @generated
	 */
	int LICHTRAUMPROFIL_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICHTRAUMPROFIL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICHTRAUMPROFIL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lichtraumprofil Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICHTRAUMPROFIL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.ENUMBaubereichArt <em>ENUM Baubereich Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMBaubereichArt
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMBaubereichArt()
	 * @generated
	 */
	int ENUM_BAUBEREICH_ART = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.ENUMGleisart <em>ENUM Gleisart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMGleisart
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMGleisart()
	 * @generated
	 */
	int ENUM_GLEISART = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.ENUMKonstruktion <em>ENUM Konstruktion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMKonstruktion
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMKonstruktion()
	 * @generated
	 */
	int ENUM_KONSTRUKTION = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Gleis.ENUMLichtraumprofil <em>ENUM Lichtraumprofil</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMLichtraumprofil
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMLichtraumprofil()
	 * @generated
	 */
	int ENUM_LICHTRAUMPROFIL = 18;

	/**
	 * The meta object id for the '<em>Bez Gleis Bezeichnung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getBez_Gleis_Bezeichnung_Type()
	 * @generated
	 */
	int BEZ_GLEIS_BEZEICHNUNG_TYPE = 19;

	/**
	 * The meta object id for the '<em>ENUM Baubereich Art Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMBaubereichArt
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMBaubereichArtObject()
	 * @generated
	 */
	int ENUM_BAUBEREICH_ART_OBJECT = 20;

	/**
	 * The meta object id for the '<em>ENUM Gleisart Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMGleisart
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMGleisartObject()
	 * @generated
	 */
	int ENUM_GLEISART_OBJECT = 21;

	/**
	 * The meta object id for the '<em>ENUM Konstruktion Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMKonstruktion
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMKonstruktionObject()
	 * @generated
	 */
	int ENUM_KONSTRUKTION_OBJECT = 22;

	/**
	 * The meta object id for the '<em>ENUM Lichtraumprofil Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMLichtraumprofil
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMLichtraumprofilObject()
	 * @generated
	 */
	int ENUM_LICHTRAUMPROFIL_OBJECT = 23;

	/**
	 * The meta object id for the '<em>Fahrstrom Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.BasisTypen.ENUMFahrstrom
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getFahrstrom_Type()
	 * @generated
	 */
	int FAHRSTROM_TYPE = 24;

	/**
	 * The meta object id for the '<em>Geschwindigkeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGeschwindigkeit_Type()
	 * @generated
	 */
	int GESCHWINDIGKEIT_TYPE = 25;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Baubereich_Art_TypeClass <em>Baubereich Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baubereich Art Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Baubereich_Art_TypeClass
	 * @generated
	 */
	EClass getBaubereich_Art_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Gleis.Baubereich_Art_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Baubereich_Art_TypeClass#getWert()
	 * @see #getBaubereich_Art_TypeClass()
	 * @generated
	 */
	EAttribute getBaubereich_Art_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Bez_Gleis_Bezeichnung_TypeClass <em>Bez Gleis Bezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bez Gleis Bezeichnung Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Bez_Gleis_Bezeichnung_TypeClass
	 * @generated
	 */
	EClass getBez_Gleis_Bezeichnung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Gleis.Bez_Gleis_Bezeichnung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Bez_Gleis_Bezeichnung_TypeClass#getWert()
	 * @see #getBez_Gleis_Bezeichnung_TypeClass()
	 * @generated
	 */
	EAttribute getBez_Gleis_Bezeichnung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Fahrstrom_TypeClass <em>Fahrstrom Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fahrstrom Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Fahrstrom_TypeClass
	 * @generated
	 */
	EClass getFahrstrom_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Gleis.Fahrstrom_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Fahrstrom_TypeClass#getWert()
	 * @see #getFahrstrom_TypeClass()
	 * @generated
	 */
	EAttribute getFahrstrom_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Geschwindigkeit_TypeClass <em>Geschwindigkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geschwindigkeit Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Geschwindigkeit_TypeClass
	 * @generated
	 */
	EClass getGeschwindigkeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Gleis.Geschwindigkeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Geschwindigkeit_TypeClass#getWert()
	 * @see #getGeschwindigkeit_TypeClass()
	 * @generated
	 */
	EAttribute getGeschwindigkeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Abschnitt <em>Gleis Abschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleis Abschnitt</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Abschnitt
	 * @generated
	 */
	EClass getGleis_Abschnitt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Abschnitt#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Abschnitt#getBezeichnung()
	 * @see #getGleis_Abschnitt()
	 * @generated
	 */
	EReference getGleis_Abschnitt_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Abschnitt#getGeschwindigkeit <em>Geschwindigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschwindigkeit</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Abschnitt#getGeschwindigkeit()
	 * @see #getGleis_Abschnitt()
	 * @generated
	 */
	EReference getGleis_Abschnitt_Geschwindigkeit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Art <em>Gleis Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleis Art</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Art
	 * @generated
	 */
	EClass getGleis_Art();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Art#getGleisart <em>Gleisart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gleisart</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Art#getGleisart()
	 * @see #getGleis_Art()
	 * @generated
	 */
	EReference getGleis_Art_Gleisart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Baubereich <em>Gleis Baubereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleis Baubereich</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Baubereich
	 * @generated
	 */
	EClass getGleis_Baubereich();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Baubereich#getBaubereichArt <em>Baubereich Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Baubereich Art</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Baubereich#getBaubereichArt()
	 * @see #getGleis_Baubereich()
	 * @generated
	 */
	EReference getGleis_Baubereich_BaubereichArt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Bezeichnung <em>Gleis Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleis Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Bezeichnung
	 * @generated
	 */
	EClass getGleis_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Bezeichnung#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Bezeichnung#getBezeichnung()
	 * @see #getGleis_Bezeichnung()
	 * @generated
	 */
	EReference getGleis_Bezeichnung_Bezeichnung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Bezeichnung_Bezeichnung_AttributeGroup <em>Gleis Bezeichnung Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleis Bezeichnung Bezeichnung Attribute Group</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Bezeichnung_Bezeichnung_AttributeGroup
	 * @generated
	 */
	EClass getGleis_Bezeichnung_Bezeichnung_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Bezeichnung_Bezeichnung_AttributeGroup#getBezGleisBezeichnung <em>Bez Gleis Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bez Gleis Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Bezeichnung_Bezeichnung_AttributeGroup#getBezGleisBezeichnung()
	 * @see #getGleis_Bezeichnung_Bezeichnung_AttributeGroup()
	 * @generated
	 */
	EReference getGleis_Bezeichnung_Bezeichnung_AttributeGroup_BezGleisBezeichnung();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Fahrbahn <em>Gleis Fahrbahn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleis Fahrbahn</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Fahrbahn
	 * @generated
	 */
	EClass getGleis_Fahrbahn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Fahrbahn#getKonstruktion <em>Konstruktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Konstruktion</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Fahrbahn#getKonstruktion()
	 * @see #getGleis_Fahrbahn()
	 * @generated
	 */
	EReference getGleis_Fahrbahn_Konstruktion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Lichtraum <em>Gleis Lichtraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleis Lichtraum</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Lichtraum
	 * @generated
	 */
	EClass getGleis_Lichtraum();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Lichtraum#getLichtraumprofil <em>Lichtraumprofil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lichtraumprofil</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Lichtraum#getLichtraumprofil()
	 * @see #getGleis_Lichtraum()
	 * @generated
	 */
	EReference getGleis_Lichtraum_Lichtraumprofil();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Schaltgruppe <em>Gleis Schaltgruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleis Schaltgruppe</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Schaltgruppe
	 * @generated
	 */
	EClass getGleis_Schaltgruppe();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Schaltgruppe#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezeichnung</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Schaltgruppe#getBezeichnung()
	 * @see #getGleis_Schaltgruppe()
	 * @generated
	 */
	EReference getGleis_Schaltgruppe_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Schaltgruppe#getFahrstrom <em>Fahrstrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fahrstrom</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleis_Schaltgruppe#getFahrstrom()
	 * @see #getGleis_Schaltgruppe()
	 * @generated
	 */
	EReference getGleis_Schaltgruppe_Fahrstrom();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Gleisart_TypeClass <em>Gleisart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gleisart Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleisart_TypeClass
	 * @generated
	 */
	EClass getGleisart_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Gleis.Gleisart_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Gleisart_TypeClass#getWert()
	 * @see #getGleisart_TypeClass()
	 * @generated
	 */
	EAttribute getGleisart_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Konstruktion_TypeClass <em>Konstruktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Konstruktion Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Konstruktion_TypeClass
	 * @generated
	 */
	EClass getKonstruktion_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Gleis.Konstruktion_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Konstruktion_TypeClass#getWert()
	 * @see #getKonstruktion_TypeClass()
	 * @generated
	 */
	EAttribute getKonstruktion_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Gleis.Lichtraumprofil_TypeClass <em>Lichtraumprofil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lichtraumprofil Type Class</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Lichtraumprofil_TypeClass
	 * @generated
	 */
	EClass getLichtraumprofil_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Gleis.Lichtraumprofil_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.Lichtraumprofil_TypeClass#getWert()
	 * @see #getLichtraumprofil_TypeClass()
	 * @generated
	 */
	EAttribute getLichtraumprofil_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Gleis.ENUMBaubereichArt <em>ENUM Baubereich Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Baubereich Art</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMBaubereichArt
	 * @generated
	 */
	EEnum getENUMBaubereichArt();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Gleis.ENUMGleisart <em>ENUM Gleisart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Gleisart</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMGleisart
	 * @generated
	 */
	EEnum getENUMGleisart();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Gleis.ENUMKonstruktion <em>ENUM Konstruktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Konstruktion</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMKonstruktion
	 * @generated
	 */
	EEnum getENUMKonstruktion();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Gleis.ENUMLichtraumprofil <em>ENUM Lichtraumprofil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Lichtraumprofil</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMLichtraumprofil
	 * @generated
	 */
	EEnum getENUMLichtraumprofil();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bez Gleis Bezeichnung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bez Gleis Bezeichnung Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBez_Gleis_Bezeichnung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText'"
	 * @generated
	 */
	EDataType getBez_Gleis_Bezeichnung_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Gleis.ENUMBaubereichArt <em>ENUM Baubereich Art Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Baubereich Art Object</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMBaubereichArt
	 * @model instanceClass="org.eclipse.set.model.planpro.Gleis.ENUMBaubereichArt"
	 *        extendedMetaData="name='ENUMBaubereich_Art:Object' baseType='ENUMBaubereich_Art'"
	 * @generated
	 */
	EDataType getENUMBaubereichArtObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Gleis.ENUMGleisart <em>ENUM Gleisart Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Gleisart Object</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMGleisart
	 * @model instanceClass="org.eclipse.set.model.planpro.Gleis.ENUMGleisart"
	 *        extendedMetaData="name='ENUMGleisart:Object' baseType='ENUMGleisart'"
	 * @generated
	 */
	EDataType getENUMGleisartObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Gleis.ENUMKonstruktion <em>ENUM Konstruktion Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Konstruktion Object</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMKonstruktion
	 * @model instanceClass="org.eclipse.set.model.planpro.Gleis.ENUMKonstruktion"
	 *        extendedMetaData="name='ENUMKonstruktion:Object' baseType='ENUMKonstruktion'"
	 * @generated
	 */
	EDataType getENUMKonstruktionObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Gleis.ENUMLichtraumprofil <em>ENUM Lichtraumprofil Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Lichtraumprofil Object</em>'.
	 * @see org.eclipse.set.model.planpro.Gleis.ENUMLichtraumprofil
	 * @model instanceClass="org.eclipse.set.model.planpro.Gleis.ENUMLichtraumprofil"
	 *        extendedMetaData="name='ENUMLichtraumprofil:Object' baseType='ENUMLichtraumprofil'"
	 * @generated
	 */
	EDataType getENUMLichtraumprofilObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.BasisTypen.ENUMFahrstrom <em>Fahrstrom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fahrstrom Type</em>'.
	 * @see org.eclipse.set.model.planpro.BasisTypen.ENUMFahrstrom
	 * @model instanceClass="org.eclipse.set.model.planpro.BasisTypen.ENUMFahrstrom"
	 *        extendedMetaData="name='TFahrstrom' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TFahrstrom'"
	 * @generated
	 */
	EDataType getFahrstrom_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Geschwindigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Geschwindigkeit Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TGeschwindigkeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TGeschwindigkeit'"
	 * @generated
	 */
	EDataType getGeschwindigkeit_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GleisFactory getGleisFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Baubereich_Art_TypeClassImpl <em>Baubereich Art Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Baubereich_Art_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getBaubereich_Art_TypeClass()
		 * @generated
		 */
		EClass BAUBEREICH_ART_TYPE_CLASS = eINSTANCE.getBaubereich_Art_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAUBEREICH_ART_TYPE_CLASS__WERT = eINSTANCE.getBaubereich_Art_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Bez_Gleis_Bezeichnung_TypeClassImpl <em>Bez Gleis Bezeichnung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Bez_Gleis_Bezeichnung_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getBez_Gleis_Bezeichnung_TypeClass()
		 * @generated
		 */
		EClass BEZ_GLEIS_BEZEICHNUNG_TYPE_CLASS = eINSTANCE.getBez_Gleis_Bezeichnung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEZ_GLEIS_BEZEICHNUNG_TYPE_CLASS__WERT = eINSTANCE.getBez_Gleis_Bezeichnung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Fahrstrom_TypeClassImpl <em>Fahrstrom Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Fahrstrom_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getFahrstrom_TypeClass()
		 * @generated
		 */
		EClass FAHRSTROM_TYPE_CLASS = eINSTANCE.getFahrstrom_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAHRSTROM_TYPE_CLASS__WERT = eINSTANCE.getFahrstrom_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Geschwindigkeit_TypeClassImpl <em>Geschwindigkeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Geschwindigkeit_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGeschwindigkeit_TypeClass()
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
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_AbschnittImpl <em>Gleis Abschnitt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_AbschnittImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Abschnitt()
		 * @generated
		 */
		EClass GLEIS_ABSCHNITT = eINSTANCE.getGleis_Abschnitt();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLEIS_ABSCHNITT__BEZEICHNUNG = eINSTANCE.getGleis_Abschnitt_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>Geschwindigkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLEIS_ABSCHNITT__GESCHWINDIGKEIT = eINSTANCE.getGleis_Abschnitt_Geschwindigkeit();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_ArtImpl <em>Gleis Art</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_ArtImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Art()
		 * @generated
		 */
		EClass GLEIS_ART = eINSTANCE.getGleis_Art();

		/**
		 * The meta object literal for the '<em><b>Gleisart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLEIS_ART__GLEISART = eINSTANCE.getGleis_Art_Gleisart();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_BaubereichImpl <em>Gleis Baubereich</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_BaubereichImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Baubereich()
		 * @generated
		 */
		EClass GLEIS_BAUBEREICH = eINSTANCE.getGleis_Baubereich();

		/**
		 * The meta object literal for the '<em><b>Baubereich Art</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLEIS_BAUBEREICH__BAUBEREICH_ART = eINSTANCE.getGleis_Baubereich_BaubereichArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_BezeichnungImpl <em>Gleis Bezeichnung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_BezeichnungImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Bezeichnung()
		 * @generated
		 */
		EClass GLEIS_BEZEICHNUNG = eINSTANCE.getGleis_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLEIS_BEZEICHNUNG__BEZEICHNUNG = eINSTANCE.getGleis_Bezeichnung_Bezeichnung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_Bezeichnung_Bezeichnung_AttributeGroupImpl <em>Gleis Bezeichnung Bezeichnung Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_Bezeichnung_Bezeichnung_AttributeGroupImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Bezeichnung_Bezeichnung_AttributeGroup()
		 * @generated
		 */
		EClass GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP = eINSTANCE.getGleis_Bezeichnung_Bezeichnung_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Bez Gleis Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_GLEIS_BEZEICHNUNG = eINSTANCE.getGleis_Bezeichnung_Bezeichnung_AttributeGroup_BezGleisBezeichnung();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_FahrbahnImpl <em>Gleis Fahrbahn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_FahrbahnImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Fahrbahn()
		 * @generated
		 */
		EClass GLEIS_FAHRBAHN = eINSTANCE.getGleis_Fahrbahn();

		/**
		 * The meta object literal for the '<em><b>Konstruktion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLEIS_FAHRBAHN__KONSTRUKTION = eINSTANCE.getGleis_Fahrbahn_Konstruktion();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_LichtraumImpl <em>Gleis Lichtraum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_LichtraumImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Lichtraum()
		 * @generated
		 */
		EClass GLEIS_LICHTRAUM = eINSTANCE.getGleis_Lichtraum();

		/**
		 * The meta object literal for the '<em><b>Lichtraumprofil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLEIS_LICHTRAUM__LICHTRAUMPROFIL = eINSTANCE.getGleis_Lichtraum_Lichtraumprofil();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_SchaltgruppeImpl <em>Gleis Schaltgruppe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleis_SchaltgruppeImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleis_Schaltgruppe()
		 * @generated
		 */
		EClass GLEIS_SCHALTGRUPPE = eINSTANCE.getGleis_Schaltgruppe();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLEIS_SCHALTGRUPPE__BEZEICHNUNG = eINSTANCE.getGleis_Schaltgruppe_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>Fahrstrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLEIS_SCHALTGRUPPE__FAHRSTROM = eINSTANCE.getGleis_Schaltgruppe_Fahrstrom();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Gleisart_TypeClassImpl <em>Gleisart Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Gleisart_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGleisart_TypeClass()
		 * @generated
		 */
		EClass GLEISART_TYPE_CLASS = eINSTANCE.getGleisart_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLEISART_TYPE_CLASS__WERT = eINSTANCE.getGleisart_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Konstruktion_TypeClassImpl <em>Konstruktion Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Konstruktion_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getKonstruktion_TypeClass()
		 * @generated
		 */
		EClass KONSTRUKTION_TYPE_CLASS = eINSTANCE.getKonstruktion_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONSTRUKTION_TYPE_CLASS__WERT = eINSTANCE.getKonstruktion_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.impl.Lichtraumprofil_TypeClassImpl <em>Lichtraumprofil Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.impl.Lichtraumprofil_TypeClassImpl
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getLichtraumprofil_TypeClass()
		 * @generated
		 */
		EClass LICHTRAUMPROFIL_TYPE_CLASS = eINSTANCE.getLichtraumprofil_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICHTRAUMPROFIL_TYPE_CLASS__WERT = eINSTANCE.getLichtraumprofil_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.ENUMBaubereichArt <em>ENUM Baubereich Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.ENUMBaubereichArt
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMBaubereichArt()
		 * @generated
		 */
		EEnum ENUM_BAUBEREICH_ART = eINSTANCE.getENUMBaubereichArt();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.ENUMGleisart <em>ENUM Gleisart</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.ENUMGleisart
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMGleisart()
		 * @generated
		 */
		EEnum ENUM_GLEISART = eINSTANCE.getENUMGleisart();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.ENUMKonstruktion <em>ENUM Konstruktion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.ENUMKonstruktion
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMKonstruktion()
		 * @generated
		 */
		EEnum ENUM_KONSTRUKTION = eINSTANCE.getENUMKonstruktion();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.planpro.Gleis.ENUMLichtraumprofil <em>ENUM Lichtraumprofil</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.ENUMLichtraumprofil
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMLichtraumprofil()
		 * @generated
		 */
		EEnum ENUM_LICHTRAUMPROFIL = eINSTANCE.getENUMLichtraumprofil();

		/**
		 * The meta object literal for the '<em>Bez Gleis Bezeichnung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getBez_Gleis_Bezeichnung_Type()
		 * @generated
		 */
		EDataType BEZ_GLEIS_BEZEICHNUNG_TYPE = eINSTANCE.getBez_Gleis_Bezeichnung_Type();

		/**
		 * The meta object literal for the '<em>ENUM Baubereich Art Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.ENUMBaubereichArt
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMBaubereichArtObject()
		 * @generated
		 */
		EDataType ENUM_BAUBEREICH_ART_OBJECT = eINSTANCE.getENUMBaubereichArtObject();

		/**
		 * The meta object literal for the '<em>ENUM Gleisart Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.ENUMGleisart
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMGleisartObject()
		 * @generated
		 */
		EDataType ENUM_GLEISART_OBJECT = eINSTANCE.getENUMGleisartObject();

		/**
		 * The meta object literal for the '<em>ENUM Konstruktion Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.ENUMKonstruktion
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMKonstruktionObject()
		 * @generated
		 */
		EDataType ENUM_KONSTRUKTION_OBJECT = eINSTANCE.getENUMKonstruktionObject();

		/**
		 * The meta object literal for the '<em>ENUM Lichtraumprofil Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.Gleis.ENUMLichtraumprofil
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getENUMLichtraumprofilObject()
		 * @generated
		 */
		EDataType ENUM_LICHTRAUMPROFIL_OBJECT = eINSTANCE.getENUMLichtraumprofilObject();

		/**
		 * The meta object literal for the '<em>Fahrstrom Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.planpro.BasisTypen.ENUMFahrstrom
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getFahrstrom_Type()
		 * @generated
		 */
		EDataType FAHRSTROM_TYPE = eINSTANCE.getFahrstrom_Type();

		/**
		 * The meta object literal for the '<em>Geschwindigkeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl#getGeschwindigkeit_Type()
		 * @generated
		 */
		EDataType GESCHWINDIGKEIT_TYPE = eINSTANCE.getGeschwindigkeit_Type();

	}

} //GleisPackage
