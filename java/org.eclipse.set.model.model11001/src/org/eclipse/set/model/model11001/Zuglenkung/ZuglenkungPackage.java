/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zuglenkung;

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
 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungFactory
 * @model kind="package"
 * @generated
 */
public interface ZuglenkungPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Zuglenkung";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Zuglenkung/1.10.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsZuglenkung";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ZuglenkungPackage eINSTANCE = org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Annaeherungsgeschwindigkeit_TypeClassImpl <em>Annaeherungsgeschwindigkeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Annaeherungsgeschwindigkeit_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getAnnaeherungsgeschwindigkeit_TypeClass()
	 * @generated
	 */
	int ANNAEHERUNGSGESCHWINDIGKEIT_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNAEHERUNGSGESCHWINDIGKEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNAEHERUNGSGESCHWINDIGKEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annaeherungsgeschwindigkeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNAEHERUNGSGESCHWINDIGKEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Anzahl_Wiederhol_ZL_Anstoesse_TypeClassImpl <em>Anzahl Wiederhol ZL Anstoesse Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Anzahl_Wiederhol_ZL_Anstoesse_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getAnzahl_Wiederhol_ZL_Anstoesse_TypeClass()
	 * @generated
	 */
	int ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anzahl Wiederhol ZL Anstoesse Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Deadlockpruefung_TypeClassImpl <em>Deadlockpruefung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Deadlockpruefung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getDeadlockpruefung_TypeClass()
	 * @generated
	 */
	int DEADLOCKPRUEFUNG_TYPE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCKPRUEFUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCKPRUEFUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deadlockpruefung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCKPRUEFUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.DWeg_Prio_TypeClassImpl <em>DWeg Prio Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.DWeg_Prio_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getDWeg_Prio_TypeClass()
	 * @generated
	 */
	int DWEG_PRIO_TYPE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_PRIO_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_PRIO_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DWeg Prio Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWEG_PRIO_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Einstellkontrollzeit_TypeClassImpl <em>Einstellkontrollzeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Einstellkontrollzeit_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getEinstellkontrollzeit_TypeClass()
	 * @generated
	 */
	int EINSTELLKONTROLLZEIT_TYPE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSTELLKONTROLLZEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSTELLKONTROLLZEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Einstellkontrollzeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSTELLKONTROLLZEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Fstr_Bildezeit_TypeClassImpl <em>Fstr Bildezeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Fstr_Bildezeit_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getFstr_Bildezeit_TypeClass()
	 * @generated
	 */
	int FSTR_BILDEZEIT_TYPE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_BILDEZEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_BILDEZEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fstr Bildezeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTR_BILDEZEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.FUEM_Auswertung_TypeClassImpl <em>FUEM Auswertung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.FUEM_Auswertung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getFUEM_Auswertung_TypeClass()
	 * @generated
	 */
	int FUEM_AUSWERTUNG_TYPE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEM_AUSWERTUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEM_AUSWERTUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FUEM Auswertung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUEM_AUSWERTUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.GK_TypeClassImpl <em>GK Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.GK_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getGK_TypeClass()
	 * @generated
	 */
	int GK_TYPE_CLASS = 7;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GK Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.GKZSS_TypeClassImpl <em>GKZSS Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.GKZSS_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getGKZSS_TypeClass()
	 * @generated
	 */
	int GKZSS_TYPE_CLASS = 8;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GKZSS_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GKZSS_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GKZSS Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GKZSS_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Lenkabbruchzeit_TypeClassImpl <em>Lenkabbruchzeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Lenkabbruchzeit_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getLenkabbruchzeit_TypeClass()
	 * @generated
	 */
	int LENKABBRUCHZEIT_TYPE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENKABBRUCHZEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENKABBRUCHZEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lenkabbruchzeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENKABBRUCHZEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Lenkziffernstellen_TypeClassImpl <em>Lenkziffernstellen Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Lenkziffernstellen_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getLenkziffernstellen_TypeClass()
	 * @generated
	 */
	int LENKZIFFERNSTELLEN_TYPE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENKZIFFERNSTELLEN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENKZIFFERNSTELLEN_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lenkziffernstellen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENKZIFFERNSTELLEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Personal_Reaktionszeit_TypeClassImpl <em>Personal Reaktionszeit Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Personal_Reaktionszeit_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getPersonal_Reaktionszeit_TypeClass()
	 * @generated
	 */
	int PERSONAL_REAKTIONSZEIT_TYPE_CLASS = 11;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_REAKTIONSZEIT_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_REAKTIONSZEIT_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Personal Reaktionszeit Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_REAKTIONSZEIT_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Sichtzeit_Vorsignal_TypeClassImpl <em>Sichtzeit Vorsignal Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Sichtzeit_Vorsignal_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getSichtzeit_Vorsignal_TypeClass()
	 * @generated
	 */
	int SICHTZEIT_VORSIGNAL_TYPE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SICHTZEIT_VORSIGNAL_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SICHTZEIT_VORSIGNAL_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sichtzeit Vorsignal Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SICHTZEIT_VORSIGNAL_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Signalgruppe_Bezeichner_TypeClassImpl <em>Signalgruppe Bezeichner Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Signalgruppe_Bezeichner_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getSignalgruppe_Bezeichner_TypeClass()
	 * @generated
	 */
	int SIGNALGRUPPE_BEZEICHNER_TYPE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALGRUPPE_BEZEICHNER_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALGRUPPE_BEZEICHNER_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signalgruppe Bezeichner Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALGRUPPE_BEZEICHNER_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Tv_GK_TypeClassImpl <em>Tv GK Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Tv_GK_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getTv_GK_TypeClass()
	 * @generated
	 */
	int TV_GK_TYPE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_GK_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_GK_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tv GK Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_GK_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Vmax_Annaeherung_TypeClassImpl <em>Vmax Annaeherung Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Vmax_Annaeherung_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getVmax_Annaeherung_TypeClass()
	 * @generated
	 */
	int VMAX_ANNAEHERUNG_TYPE_CLASS = 15;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMAX_ANNAEHERUNG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMAX_ANNAEHERUNG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vmax Annaeherung Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMAX_ANNAEHERUNG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZLImpl <em>ZL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZLImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL()
	 * @generated
	 */
	int ZL = 16;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDESTW Zentraleinheit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL__IDESTW_ZENTRALEINHEIT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDZN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL__IDZN = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZL Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL__ZL_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ZLZN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL__ZLZN = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ZL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Allg_AttributeGroupImpl <em>ZL Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Allg_AttributeGroup()
	 * @generated
	 */
	int ZL_ALLG_ATTRIBUTE_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Anzahl Wiederhol ZL Anstoesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_ALLG_ATTRIBUTE_GROUP__ANZAHL_WIEDERHOL_ZL_ANSTOESSE = 0;

	/**
	 * The feature id for the '<em><b>Deadlockpruefung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_ALLG_ATTRIBUTE_GROUP__DEADLOCKPRUEFUNG = 1;

	/**
	 * The feature id for the '<em><b>Einstellkontrollzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_ALLG_ATTRIBUTE_GROUP__EINSTELLKONTROLLZEIT = 2;

	/**
	 * The feature id for the '<em><b>Lenkabbruchzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_ALLG_ATTRIBUTE_GROUP__LENKABBRUCHZEIT = 3;

	/**
	 * The feature id for the '<em><b>Personal Reaktionszeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_ALLG_ATTRIBUTE_GROUP__PERSONAL_REAKTIONSZEIT = 4;

	/**
	 * The number of structural features of the '<em>ZL Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_DLP_AbschnittImpl <em>ZL DLP Abschnitt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_DLP_AbschnittImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_DLP_Abschnitt()
	 * @generated
	 */
	int ZL_DLP_ABSCHNITT = 18;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_ABSCHNITT__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_ABSCHNITT__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_ABSCHNITT__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_ABSCHNITT__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_ABSCHNITT__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Gleis Abschnitt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDZLDLP Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_ABSCHNITT__IDZLDLP_FSTR = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ZL DLP Abschnitt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_ABSCHNITT_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_DLP_FstrImpl <em>ZL DLP Fstr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_DLP_FstrImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_DLP_Fstr()
	 * @generated
	 */
	int ZL_DLP_FSTR = 19;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_FSTR__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_FSTR__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_FSTR__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_FSTR__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_FSTR__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDZL Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_FSTR__IDZL_FSTR = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ZL DLP Fstr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_DLP_FSTR_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_FstrImpl <em>ZL Fstr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_FstrImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr()
	 * @generated
	 */
	int ZL_FSTR = 20;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR__ID_FSTR_ZUG_RANGIER = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDZL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR__IDZL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IDZL Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR__IDZL_FSTR = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ZL Fstr Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR__ZL_FSTR_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ZL Fstr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Allg_AttributeGroupImpl <em>ZL Fstr Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr_Allg_AttributeGroup()
	 * @generated
	 */
	int ZL_FSTR_ALLG_ATTRIBUTE_GROUP = 21;

	/**
	 * The feature id for the '<em><b>Annaeherungsgeschwindigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ALLG_ATTRIBUTE_GROUP__ANNAEHERUNGSGESCHWINDIGKEIT = 0;

	/**
	 * The feature id for the '<em><b>DWeg Prio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ALLG_ATTRIBUTE_GROUP__DWEG_PRIO = 1;

	/**
	 * The feature id for the '<em><b>Fstr Bildezeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FSTR_BILDEZEIT = 2;

	/**
	 * The feature id for the '<em><b>FUEM Auswertung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FUEM_AUSWERTUNG = 3;

	/**
	 * The feature id for the '<em><b>Sichtzeit Vorsignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ALLG_ATTRIBUTE_GROUP__SICHTZEIT_VORSIGNAL = 4;

	/**
	 * The number of structural features of the '<em>ZL Fstr Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_AnstossImpl <em>ZL Fstr Anstoss</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_AnstossImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr_Anstoss()
	 * @generated
	 */
	int ZL_FSTR_ANSTOSS = 22;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Vorsignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS__ID_VORSIGNAL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDZL Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS__IDZL_FSTR = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZL Fstr Anstoss Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ZL Fstr Anstoss GK</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ID Einschaltpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>IDZN Anzeigefeld Anstoss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>ZL Fstr Anstoss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Anstoss_Allg_AttributeGroupImpl <em>ZL Fstr Anstoss Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Anstoss_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr_Anstoss_Allg_AttributeGroup()
	 * @generated
	 */
	int ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP = 23;

	/**
	 * The feature id for the '<em><b>GKZSS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__GKZSS = 0;

	/**
	 * The feature id for the '<em><b>Vmax Annaeherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__VMAX_ANNAEHERUNG = 1;

	/**
	 * The feature id for the '<em><b>ZL Fstr Zuschlag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__ZL_FSTR_ZUSCHLAG = 2;

	/**
	 * The number of structural features of the '<em>ZL Fstr Anstoss Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Anstoss_GK_AttributeGroupImpl <em>ZL Fstr Anstoss GK Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Anstoss_GK_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr_Anstoss_GK_AttributeGroup()
	 * @generated
	 */
	int ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP = 24;

	/**
	 * The feature id for the '<em><b>GK</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__GK = 0;

	/**
	 * The feature id for the '<em><b>Tv GK</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__TV_GK = 1;

	/**
	 * The number of structural features of the '<em>ZL Fstr Anstoss GK Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Zuschlag_TypeClassImpl <em>ZL Fstr Zuschlag Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Zuschlag_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr_Zuschlag_TypeClass()
	 * @generated
	 */
	int ZL_FSTR_ZUSCHLAG_TYPE_CLASS = 25;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ZUSCHLAG_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ZUSCHLAG_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ZL Fstr Zuschlag Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_FSTR_ZUSCHLAG_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_SignalgruppeImpl <em>ZL Signalgruppe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_SignalgruppeImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Signalgruppe()
	 * @generated
	 */
	int ZL_SIGNALGRUPPE = 26;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>IDZL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE__IDZL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ZL Signalgruppe Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ZL Signalgruppe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Signalgruppe_Allg_AttributeGroupImpl <em>ZL Signalgruppe Allg Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Signalgruppe_Allg_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Signalgruppe_Allg_AttributeGroup()
	 * @generated
	 */
	int ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP = 27;

	/**
	 * The feature id for the '<em><b>Signalgruppe Bezeichner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP__SIGNALGRUPPE_BEZEICHNER = 0;

	/**
	 * The number of structural features of the '<em>ZL Signalgruppe Allg Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Signalgruppe_ZuordnungImpl <em>ZL Signalgruppe Zuordnung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Signalgruppe_ZuordnungImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Signalgruppe_Zuordnung()
	 * @generated
	 */
	int ZL_SIGNALGRUPPE_ZUORDNUNG = 28;

	/**
	 * The feature id for the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE_ZUORDNUNG__IDENTITAET = BasisobjektePackage.BASIS_OBJEKT__IDENTITAET;

	/**
	 * The feature id for the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE_ZUORDNUNG__BASIS_OBJEKT_ALLG = BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE_ZUORDNUNG__ID_BEARBEITUNGSVERMERK = BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE_ZUORDNUNG__ID_OERTLICHKEIT_AUSGABE = BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE;

	/**
	 * The feature id for the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE_ZUORDNUNG__OBJEKTREFERENZEN = BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN;

	/**
	 * The feature id for the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IDZL Signalgruppe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ZL Signalgruppe Zuordnung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_SIGNALGRUPPE_ZUORDNUNG_FEATURE_COUNT = BasisobjektePackage.BASIS_OBJEKT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_ZN_AttributeGroupImpl <em>ZL ZN Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_ZN_AttributeGroupImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_ZN_AttributeGroup()
	 * @generated
	 */
	int ZL_ZN_ATTRIBUTE_GROUP = 29;

	/**
	 * The feature id for the '<em><b>Lenkziffernstellen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_ZN_ATTRIBUTE_GROUP__LENKZIFFERNSTELLEN = 0;

	/**
	 * The feature id for the '<em><b>ZN Stellen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_ZN_ATTRIBUTE_GROUP__ZN_STELLEN = 1;

	/**
	 * The number of structural features of the '<em>ZL ZN Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_ZN_ATTRIBUTE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZN_Stellen_TypeClassImpl <em>ZN Stellen Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZN_Stellen_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZN_Stellen_TypeClass()
	 * @generated
	 */
	int ZN_STELLEN_TYPE_CLASS = 30;

	/**
	 * The feature id for the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZN_STELLEN_TYPE_CLASS__ID_BEARBEITUNGSVERMERK = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZN_STELLEN_TYPE_CLASS__WERT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ZN Stellen Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZN_STELLEN_TYPE_CLASS_FEATURE_COUNT = BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.ENUMLenkziffernstellen <em>ENUM Lenkziffernstellen</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ENUMLenkziffernstellen
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getENUMLenkziffernstellen()
	 * @generated
	 */
	int ENUM_LENKZIFFERNSTELLEN = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Zuglenkung.ENUMZNStellen <em>ENUMZN Stellen</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ENUMZNStellen
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getENUMZNStellen()
	 * @generated
	 */
	int ENUMZN_STELLEN = 32;

	/**
	 * The meta object id for the '<em>Annaeherungsgeschwindigkeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getAnnaeherungsgeschwindigkeit_Type()
	 * @generated
	 */
	int ANNAEHERUNGSGESCHWINDIGKEIT_TYPE = 33;

	/**
	 * The meta object id for the '<em>Anzahl Wiederhol ZL Anstoesse Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getAnzahl_Wiederhol_ZL_Anstoesse_Type()
	 * @generated
	 */
	int ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE = 34;

	/**
	 * The meta object id for the '<em>DWeg Prio Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getDWeg_Prio_Type()
	 * @generated
	 */
	int DWEG_PRIO_TYPE = 35;

	/**
	 * The meta object id for the '<em>Einstellkontrollzeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getEinstellkontrollzeit_Type()
	 * @generated
	 */
	int EINSTELLKONTROLLZEIT_TYPE = 36;

	/**
	 * The meta object id for the '<em>ENUM Lenkziffernstellen Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ENUMLenkziffernstellen
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getENUMLenkziffernstellenObject()
	 * @generated
	 */
	int ENUM_LENKZIFFERNSTELLEN_OBJECT = 37;

	/**
	 * The meta object id for the '<em>ENUMZN Stellen Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ENUMZNStellen
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getENUMZNStellenObject()
	 * @generated
	 */
	int ENUMZN_STELLEN_OBJECT = 38;

	/**
	 * The meta object id for the '<em>Fstr Bildezeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getFstr_Bildezeit_Type()
	 * @generated
	 */
	int FSTR_BILDEZEIT_TYPE = 39;

	/**
	 * The meta object id for the '<em>GK Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getGK_Type()
	 * @generated
	 */
	int GK_TYPE = 40;

	/**
	 * The meta object id for the '<em>Lenkabbruchzeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getLenkabbruchzeit_Type()
	 * @generated
	 */
	int LENKABBRUCHZEIT_TYPE = 41;

	/**
	 * The meta object id for the '<em>Personal Reaktionszeit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getPersonal_Reaktionszeit_Type()
	 * @generated
	 */
	int PERSONAL_REAKTIONSZEIT_TYPE = 42;

	/**
	 * The meta object id for the '<em>Sichtzeit Vorsignal Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getSichtzeit_Vorsignal_Type()
	 * @generated
	 */
	int SICHTZEIT_VORSIGNAL_TYPE = 43;

	/**
	 * The meta object id for the '<em>Signalgruppe Bezeichner Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getSignalgruppe_Bezeichner_Type()
	 * @generated
	 */
	int SIGNALGRUPPE_BEZEICHNER_TYPE = 44;

	/**
	 * The meta object id for the '<em>Tv GK Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getTv_GK_Type()
	 * @generated
	 */
	int TV_GK_TYPE = 45;

	/**
	 * The meta object id for the '<em>Vmax Annaeherung Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getVmax_Annaeherung_Type()
	 * @generated
	 */
	int VMAX_ANNAEHERUNG_TYPE = 46;

	/**
	 * The meta object id for the '<em>ZL Fstr Zuschlag Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr_Zuschlag_Type()
	 * @generated
	 */
	int ZL_FSTR_ZUSCHLAG_TYPE = 47;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.Annaeherungsgeschwindigkeit_TypeClass <em>Annaeherungsgeschwindigkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annaeherungsgeschwindigkeit Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Annaeherungsgeschwindigkeit_TypeClass
	 * @generated
	 */
	EClass getAnnaeherungsgeschwindigkeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.Annaeherungsgeschwindigkeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Annaeherungsgeschwindigkeit_TypeClass#getWert()
	 * @see #getAnnaeherungsgeschwindigkeit_TypeClass()
	 * @generated
	 */
	EAttribute getAnnaeherungsgeschwindigkeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.Anzahl_Wiederhol_ZL_Anstoesse_TypeClass <em>Anzahl Wiederhol ZL Anstoesse Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anzahl Wiederhol ZL Anstoesse Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Anzahl_Wiederhol_ZL_Anstoesse_TypeClass
	 * @generated
	 */
	EClass getAnzahl_Wiederhol_ZL_Anstoesse_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.Anzahl_Wiederhol_ZL_Anstoesse_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Anzahl_Wiederhol_ZL_Anstoesse_TypeClass#getWert()
	 * @see #getAnzahl_Wiederhol_ZL_Anstoesse_TypeClass()
	 * @generated
	 */
	EAttribute getAnzahl_Wiederhol_ZL_Anstoesse_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.Deadlockpruefung_TypeClass <em>Deadlockpruefung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadlockpruefung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Deadlockpruefung_TypeClass
	 * @generated
	 */
	EClass getDeadlockpruefung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.Deadlockpruefung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Deadlockpruefung_TypeClass#getWert()
	 * @see #getDeadlockpruefung_TypeClass()
	 * @generated
	 */
	EAttribute getDeadlockpruefung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.DWeg_Prio_TypeClass <em>DWeg Prio Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DWeg Prio Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.DWeg_Prio_TypeClass
	 * @generated
	 */
	EClass getDWeg_Prio_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.DWeg_Prio_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.DWeg_Prio_TypeClass#getWert()
	 * @see #getDWeg_Prio_TypeClass()
	 * @generated
	 */
	EAttribute getDWeg_Prio_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.Einstellkontrollzeit_TypeClass <em>Einstellkontrollzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einstellkontrollzeit Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Einstellkontrollzeit_TypeClass
	 * @generated
	 */
	EClass getEinstellkontrollzeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.Einstellkontrollzeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Einstellkontrollzeit_TypeClass#getWert()
	 * @see #getEinstellkontrollzeit_TypeClass()
	 * @generated
	 */
	EAttribute getEinstellkontrollzeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.Fstr_Bildezeit_TypeClass <em>Fstr Bildezeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fstr Bildezeit Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Fstr_Bildezeit_TypeClass
	 * @generated
	 */
	EClass getFstr_Bildezeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.Fstr_Bildezeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Fstr_Bildezeit_TypeClass#getWert()
	 * @see #getFstr_Bildezeit_TypeClass()
	 * @generated
	 */
	EAttribute getFstr_Bildezeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.FUEM_Auswertung_TypeClass <em>FUEM Auswertung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FUEM Auswertung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.FUEM_Auswertung_TypeClass
	 * @generated
	 */
	EClass getFUEM_Auswertung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.FUEM_Auswertung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.FUEM_Auswertung_TypeClass#getWert()
	 * @see #getFUEM_Auswertung_TypeClass()
	 * @generated
	 */
	EAttribute getFUEM_Auswertung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.GK_TypeClass <em>GK Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GK Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.GK_TypeClass
	 * @generated
	 */
	EClass getGK_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.GK_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.GK_TypeClass#getWert()
	 * @see #getGK_TypeClass()
	 * @generated
	 */
	EAttribute getGK_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.GKZSS_TypeClass <em>GKZSS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GKZSS Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.GKZSS_TypeClass
	 * @generated
	 */
	EClass getGKZSS_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.GKZSS_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.GKZSS_TypeClass#getWert()
	 * @see #getGKZSS_TypeClass()
	 * @generated
	 */
	EAttribute getGKZSS_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.Lenkabbruchzeit_TypeClass <em>Lenkabbruchzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lenkabbruchzeit Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Lenkabbruchzeit_TypeClass
	 * @generated
	 */
	EClass getLenkabbruchzeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.Lenkabbruchzeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Lenkabbruchzeit_TypeClass#getWert()
	 * @see #getLenkabbruchzeit_TypeClass()
	 * @generated
	 */
	EAttribute getLenkabbruchzeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.Lenkziffernstellen_TypeClass <em>Lenkziffernstellen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lenkziffernstellen Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Lenkziffernstellen_TypeClass
	 * @generated
	 */
	EClass getLenkziffernstellen_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.Lenkziffernstellen_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Lenkziffernstellen_TypeClass#getWert()
	 * @see #getLenkziffernstellen_TypeClass()
	 * @generated
	 */
	EAttribute getLenkziffernstellen_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.Personal_Reaktionszeit_TypeClass <em>Personal Reaktionszeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Reaktionszeit Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Personal_Reaktionszeit_TypeClass
	 * @generated
	 */
	EClass getPersonal_Reaktionszeit_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.Personal_Reaktionszeit_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Personal_Reaktionszeit_TypeClass#getWert()
	 * @see #getPersonal_Reaktionszeit_TypeClass()
	 * @generated
	 */
	EAttribute getPersonal_Reaktionszeit_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.Sichtzeit_Vorsignal_TypeClass <em>Sichtzeit Vorsignal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sichtzeit Vorsignal Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Sichtzeit_Vorsignal_TypeClass
	 * @generated
	 */
	EClass getSichtzeit_Vorsignal_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.Sichtzeit_Vorsignal_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Sichtzeit_Vorsignal_TypeClass#getWert()
	 * @see #getSichtzeit_Vorsignal_TypeClass()
	 * @generated
	 */
	EAttribute getSichtzeit_Vorsignal_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.Signalgruppe_Bezeichner_TypeClass <em>Signalgruppe Bezeichner Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signalgruppe Bezeichner Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Signalgruppe_Bezeichner_TypeClass
	 * @generated
	 */
	EClass getSignalgruppe_Bezeichner_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.Signalgruppe_Bezeichner_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Signalgruppe_Bezeichner_TypeClass#getWert()
	 * @see #getSignalgruppe_Bezeichner_TypeClass()
	 * @generated
	 */
	EAttribute getSignalgruppe_Bezeichner_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.Tv_GK_TypeClass <em>Tv GK Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tv GK Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Tv_GK_TypeClass
	 * @generated
	 */
	EClass getTv_GK_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.Tv_GK_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Tv_GK_TypeClass#getWert()
	 * @see #getTv_GK_TypeClass()
	 * @generated
	 */
	EAttribute getTv_GK_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.Vmax_Annaeherung_TypeClass <em>Vmax Annaeherung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vmax Annaeherung Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Vmax_Annaeherung_TypeClass
	 * @generated
	 */
	EClass getVmax_Annaeherung_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.Vmax_Annaeherung_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.Vmax_Annaeherung_TypeClass#getWert()
	 * @see #getVmax_Annaeherung_TypeClass()
	 * @generated
	 */
	EAttribute getVmax_Annaeherung_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL <em>ZL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL
	 * @generated
	 */
	EClass getZL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDESTW Zentraleinheit</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL#getIDESTWZentraleinheit()
	 * @see #getZL()
	 * @generated
	 */
	EReference getZL_IDESTWZentraleinheit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL#getIDZN <em>IDZN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDZN</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL#getIDZN()
	 * @see #getZL()
	 * @generated
	 */
	EReference getZL_IDZN();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL#getZLAllg <em>ZL Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ZL Allg</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL#getZLAllg()
	 * @see #getZL()
	 * @generated
	 */
	EReference getZL_ZLAllg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL#getZLZN <em>ZLZN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ZLZN</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL#getZLZN()
	 * @see #getZL()
	 * @generated
	 */
	EReference getZL_ZLZN();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup <em>ZL Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup
	 * @generated
	 */
	EClass getZL_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getAnzahlWiederholZLAnstoesse <em>Anzahl Wiederhol ZL Anstoesse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anzahl Wiederhol ZL Anstoesse</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getAnzahlWiederholZLAnstoesse()
	 * @see #getZL_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Allg_AttributeGroup_AnzahlWiederholZLAnstoesse();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getDeadlockpruefung <em>Deadlockpruefung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deadlockpruefung</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getDeadlockpruefung()
	 * @see #getZL_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Allg_AttributeGroup_Deadlockpruefung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getEinstellkontrollzeit <em>Einstellkontrollzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einstellkontrollzeit</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getEinstellkontrollzeit()
	 * @see #getZL_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Allg_AttributeGroup_Einstellkontrollzeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getLenkabbruchzeit <em>Lenkabbruchzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lenkabbruchzeit</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getLenkabbruchzeit()
	 * @see #getZL_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Allg_AttributeGroup_Lenkabbruchzeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getPersonalReaktionszeit <em>Personal Reaktionszeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personal Reaktionszeit</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getPersonalReaktionszeit()
	 * @see #getZL_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Allg_AttributeGroup_PersonalReaktionszeit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_DLP_Abschnitt <em>ZL DLP Abschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL DLP Abschnitt</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_DLP_Abschnitt
	 * @generated
	 */
	EClass getZL_DLP_Abschnitt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_DLP_Abschnitt#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ID Gleis Abschnitt</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_DLP_Abschnitt#getIDGleisAbschnitt()
	 * @see #getZL_DLP_Abschnitt()
	 * @generated
	 */
	EReference getZL_DLP_Abschnitt_IDGleisAbschnitt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_DLP_Abschnitt#getIDZLDLPFstr <em>IDZLDLP Fstr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDZLDLP Fstr</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_DLP_Abschnitt#getIDZLDLPFstr()
	 * @see #getZL_DLP_Abschnitt()
	 * @generated
	 */
	EReference getZL_DLP_Abschnitt_IDZLDLPFstr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_DLP_Fstr <em>ZL DLP Fstr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL DLP Fstr</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_DLP_Fstr
	 * @generated
	 */
	EClass getZL_DLP_Fstr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_DLP_Fstr#getIDZLFstr <em>IDZL Fstr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDZL Fstr</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_DLP_Fstr#getIDZLFstr()
	 * @see #getZL_DLP_Fstr()
	 * @generated
	 */
	EReference getZL_DLP_Fstr_IDZLFstr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr <em>ZL Fstr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL Fstr</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr
	 * @generated
	 */
	EClass getZL_Fstr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Fstr Zug Rangier</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr#getIDFstrZugRangier()
	 * @see #getZL_Fstr()
	 * @generated
	 */
	EReference getZL_Fstr_IDFstrZugRangier();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr#getIDZL <em>IDZL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDZL</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr#getIDZL()
	 * @see #getZL_Fstr()
	 * @generated
	 */
	EReference getZL_Fstr_IDZL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr#getIDZLFstr <em>IDZL Fstr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDZL Fstr</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr#getIDZLFstr()
	 * @see #getZL_Fstr()
	 * @generated
	 */
	EReference getZL_Fstr_IDZLFstr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr#getZLFstrAllg <em>ZL Fstr Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ZL Fstr Allg</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr#getZLFstrAllg()
	 * @see #getZL_Fstr()
	 * @generated
	 */
	EReference getZL_Fstr_ZLFstrAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup <em>ZL Fstr Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL Fstr Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup
	 * @generated
	 */
	EClass getZL_Fstr_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getAnnaeherungsgeschwindigkeit <em>Annaeherungsgeschwindigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annaeherungsgeschwindigkeit</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getAnnaeherungsgeschwindigkeit()
	 * @see #getZL_Fstr_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Fstr_Allg_AttributeGroup_Annaeherungsgeschwindigkeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getDWegPrio <em>DWeg Prio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DWeg Prio</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getDWegPrio()
	 * @see #getZL_Fstr_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Fstr_Allg_AttributeGroup_DWegPrio();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getFstrBildezeit <em>Fstr Bildezeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fstr Bildezeit</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getFstrBildezeit()
	 * @see #getZL_Fstr_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Fstr_Allg_AttributeGroup_FstrBildezeit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getFUEMAuswertung <em>FUEM Auswertung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FUEM Auswertung</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getFUEMAuswertung()
	 * @see #getZL_Fstr_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Fstr_Allg_AttributeGroup_FUEMAuswertung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getSichtzeitVorsignal <em>Sichtzeit Vorsignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sichtzeit Vorsignal</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getSichtzeitVorsignal()
	 * @see #getZL_Fstr_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Fstr_Allg_AttributeGroup_SichtzeitVorsignal();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss <em>ZL Fstr Anstoss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL Fstr Anstoss</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss
	 * @generated
	 */
	EClass getZL_Fstr_Anstoss();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss#getIDVorsignal <em>ID Vorsignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Vorsignal</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss#getIDVorsignal()
	 * @see #getZL_Fstr_Anstoss()
	 * @generated
	 */
	EReference getZL_Fstr_Anstoss_IDVorsignal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss#getIDZLFstr <em>IDZL Fstr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDZL Fstr</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss#getIDZLFstr()
	 * @see #getZL_Fstr_Anstoss()
	 * @generated
	 */
	EReference getZL_Fstr_Anstoss_IDZLFstr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss#getZLFstrAnstossAllg <em>ZL Fstr Anstoss Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ZL Fstr Anstoss Allg</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss#getZLFstrAnstossAllg()
	 * @see #getZL_Fstr_Anstoss()
	 * @generated
	 */
	EReference getZL_Fstr_Anstoss_ZLFstrAnstossAllg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss#getZLFstrAnstossGK <em>ZL Fstr Anstoss GK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ZL Fstr Anstoss GK</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss#getZLFstrAnstossGK()
	 * @see #getZL_Fstr_Anstoss()
	 * @generated
	 */
	EReference getZL_Fstr_Anstoss_ZLFstrAnstossGK();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss#getIDEinschaltpunkt <em>ID Einschaltpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Einschaltpunkt</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss#getIDEinschaltpunkt()
	 * @see #getZL_Fstr_Anstoss()
	 * @generated
	 */
	EReference getZL_Fstr_Anstoss_IDEinschaltpunkt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss#getIDZNAnzeigefeldAnstoss <em>IDZN Anzeigefeld Anstoss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDZN Anzeigefeld Anstoss</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss#getIDZNAnzeigefeldAnstoss()
	 * @see #getZL_Fstr_Anstoss()
	 * @generated
	 */
	EReference getZL_Fstr_Anstoss_IDZNAnzeigefeldAnstoss();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup <em>ZL Fstr Anstoss Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL Fstr Anstoss Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup
	 * @generated
	 */
	EClass getZL_Fstr_Anstoss_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup#getGKZSS <em>GKZSS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GKZSS</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup#getGKZSS()
	 * @see #getZL_Fstr_Anstoss_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Fstr_Anstoss_Allg_AttributeGroup_GKZSS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup#getVmaxAnnaeherung <em>Vmax Annaeherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vmax Annaeherung</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup#getVmaxAnnaeherung()
	 * @see #getZL_Fstr_Anstoss_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Fstr_Anstoss_Allg_AttributeGroup_VmaxAnnaeherung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup#getZLFstrZuschlag <em>ZL Fstr Zuschlag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ZL Fstr Zuschlag</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup#getZLFstrZuschlag()
	 * @see #getZL_Fstr_Anstoss_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Fstr_Anstoss_Allg_AttributeGroup_ZLFstrZuschlag();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup <em>ZL Fstr Anstoss GK Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL Fstr Anstoss GK Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup
	 * @generated
	 */
	EClass getZL_Fstr_Anstoss_GK_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup#getGK <em>GK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GK</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup#getGK()
	 * @see #getZL_Fstr_Anstoss_GK_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Fstr_Anstoss_GK_AttributeGroup_GK();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup#getTvGK <em>Tv GK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tv GK</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup#getTvGK()
	 * @see #getZL_Fstr_Anstoss_GK_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Fstr_Anstoss_GK_AttributeGroup_TvGK();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Zuschlag_TypeClass <em>ZL Fstr Zuschlag Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL Fstr Zuschlag Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Zuschlag_TypeClass
	 * @generated
	 */
	EClass getZL_Fstr_Zuschlag_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Zuschlag_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Zuschlag_TypeClass#getWert()
	 * @see #getZL_Fstr_Zuschlag_TypeClass()
	 * @generated
	 */
	EAttribute getZL_Fstr_Zuschlag_TypeClass_Wert();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe <em>ZL Signalgruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL Signalgruppe</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe
	 * @generated
	 */
	EClass getZL_Signalgruppe();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe#getIDZL <em>IDZL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDZL</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe#getIDZL()
	 * @see #getZL_Signalgruppe()
	 * @generated
	 */
	EReference getZL_Signalgruppe_IDZL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe#getZLSignalgruppeAllg <em>ZL Signalgruppe Allg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ZL Signalgruppe Allg</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe#getZLSignalgruppeAllg()
	 * @see #getZL_Signalgruppe()
	 * @generated
	 */
	EReference getZL_Signalgruppe_ZLSignalgruppeAllg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe_Allg_AttributeGroup <em>ZL Signalgruppe Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL Signalgruppe Allg Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe_Allg_AttributeGroup
	 * @generated
	 */
	EClass getZL_Signalgruppe_Allg_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe_Allg_AttributeGroup#getSignalgruppeBezeichner <em>Signalgruppe Bezeichner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signalgruppe Bezeichner</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe_Allg_AttributeGroup#getSignalgruppeBezeichner()
	 * @see #getZL_Signalgruppe_Allg_AttributeGroup()
	 * @generated
	 */
	EReference getZL_Signalgruppe_Allg_AttributeGroup_SignalgruppeBezeichner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe_Zuordnung <em>ZL Signalgruppe Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL Signalgruppe Zuordnung</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe_Zuordnung
	 * @generated
	 */
	EClass getZL_Signalgruppe_Zuordnung();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDSignal <em>ID Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID Signal</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDSignal()
	 * @see #getZL_Signalgruppe_Zuordnung()
	 * @generated
	 */
	EReference getZL_Signalgruppe_Zuordnung_IDSignal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDZLSignalgruppe <em>IDZL Signalgruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IDZL Signalgruppe</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDZLSignalgruppe()
	 * @see #getZL_Signalgruppe_Zuordnung()
	 * @generated
	 */
	EReference getZL_Signalgruppe_Zuordnung_IDZLSignalgruppe();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_ZN_AttributeGroup <em>ZL ZN Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZL ZN Attribute Group</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_ZN_AttributeGroup
	 * @generated
	 */
	EClass getZL_ZN_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_ZN_AttributeGroup#getLenkziffernstellen <em>Lenkziffernstellen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lenkziffernstellen</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_ZN_AttributeGroup#getLenkziffernstellen()
	 * @see #getZL_ZN_AttributeGroup()
	 * @generated
	 */
	EReference getZL_ZN_AttributeGroup_Lenkziffernstellen();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_ZN_AttributeGroup#getZNStellen <em>ZN Stellen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ZN Stellen</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZL_ZN_AttributeGroup#getZNStellen()
	 * @see #getZL_ZN_AttributeGroup()
	 * @generated
	 */
	EReference getZL_ZN_AttributeGroup_ZNStellen();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Zuglenkung.ZN_Stellen_TypeClass <em>ZN Stellen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZN Stellen Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZN_Stellen_TypeClass
	 * @generated
	 */
	EClass getZN_Stellen_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Zuglenkung.ZN_Stellen_TypeClass#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZN_Stellen_TypeClass#getWert()
	 * @see #getZN_Stellen_TypeClass()
	 * @generated
	 */
	EAttribute getZN_Stellen_TypeClass_Wert();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Zuglenkung.ENUMLenkziffernstellen <em>ENUM Lenkziffernstellen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Lenkziffernstellen</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ENUMLenkziffernstellen
	 * @generated
	 */
	EEnum getENUMLenkziffernstellen();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.model11001.Zuglenkung.ENUMZNStellen <em>ENUMZN Stellen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUMZN Stellen</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ENUMZNStellen
	 * @generated
	 */
	EEnum getENUMZNStellen();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Annaeherungsgeschwindigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Annaeherungsgeschwindigkeit Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TAnnaeherungsgeschwindigkeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit' pattern='[4-9][0-9]|1[0-5][0-9]|160'"
	 * @generated
	 */
	EDataType getAnnaeherungsgeschwindigkeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Anzahl Wiederhol ZL Anstoesse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Anzahl Wiederhol ZL Anstoesse Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TAnzahl_Wiederhol_ZL_Anstoesse' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[1-9]|10'"
	 * @generated
	 */
	EDataType getAnzahl_Wiederhol_ZL_Anstoesse_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>DWeg Prio Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DWeg Prio Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TDWeg_Prio' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[0-4]'"
	 * @generated
	 */
	EDataType getDWeg_Prio_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Einstellkontrollzeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Einstellkontrollzeit Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TEinstellkontrollzeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TSekunde' pattern='[1-9][0-9]{0,1}|1[0-9]{2}|200'"
	 * @generated
	 */
	EDataType getEinstellkontrollzeit_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Zuglenkung.ENUMLenkziffernstellen <em>ENUM Lenkziffernstellen Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Lenkziffernstellen Object</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ENUMLenkziffernstellen
	 * @model instanceClass="org.eclipse.set.model.model11001.Zuglenkung.ENUMLenkziffernstellen"
	 *        extendedMetaData="name='ENUMLenkziffernstellen:Object' baseType='ENUMLenkziffernstellen'"
	 * @generated
	 */
	EDataType getENUMLenkziffernstellenObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.model11001.Zuglenkung.ENUMZNStellen <em>ENUMZN Stellen Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUMZN Stellen Object</em>'.
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ENUMZNStellen
	 * @model instanceClass="org.eclipse.set.model.model11001.Zuglenkung.ENUMZNStellen"
	 *        extendedMetaData="name='ENUMZN_Stellen:Object' baseType='ENUMZN_Stellen'"
	 * @generated
	 */
	EDataType getENUMZNStellenObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Fstr Bildezeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fstr Bildezeit Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TFstr_Bildezeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TSekunde' pattern='0|[1-9][0-9]{0,1}|[1-8][0-9]{2}|900'"
	 * @generated
	 */
	EDataType getFstr_Bildezeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>GK Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GK Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TGK' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit' pattern='[4-9][0-9]|1[0-5][0-9]|160'"
	 * @generated
	 */
	EDataType getGK_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Lenkabbruchzeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lenkabbruchzeit Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TLenkabbruchzeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TSekunde' pattern='0|[1-9][0-9]{0,2}|1[01][0-9]{2}|1200'"
	 * @generated
	 */
	EDataType getLenkabbruchzeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Personal Reaktionszeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Personal Reaktionszeit Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TPersonal_Reaktionszeit' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TSekunde' pattern='1[5-9]|[23][0-9]|4[0-5]'"
	 * @generated
	 */
	EDataType getPersonal_Reaktionszeit_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Sichtzeit Vorsignal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sichtzeit Vorsignal Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TSichtzeit_Vorsignal' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TSekunde' pattern='0|1[0-9]|20'"
	 * @generated
	 */
	EDataType getSichtzeit_Vorsignal_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Signalgruppe Bezeichner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signalgruppe Bezeichner Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TSignalgruppe_Bezeichner' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TZeichenkette'"
	 * @generated
	 */
	EDataType getSignalgruppe_Bezeichner_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Tv GK Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tv GK Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TTv_GK' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TSekunde' pattern='0|[1-9][0-9]{0,1}|[1-2][0-9]{2}|300'"
	 * @generated
	 */
	EDataType getTv_GK_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Vmax Annaeherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vmax Annaeherung Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TVmax_Annaeherung' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit'"
	 * @generated
	 */
	EDataType getVmax_Annaeherung_Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>ZL Fstr Zuschlag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ZL Fstr Zuschlag Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TZL_Fstr_Zuschlag' baseType='http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TSekunde'"
	 * @generated
	 */
	EDataType getZL_Fstr_Zuschlag_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ZuglenkungFactory getZuglenkungFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Annaeherungsgeschwindigkeit_TypeClassImpl <em>Annaeherungsgeschwindigkeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Annaeherungsgeschwindigkeit_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getAnnaeherungsgeschwindigkeit_TypeClass()
		 * @generated
		 */
		EClass ANNAEHERUNGSGESCHWINDIGKEIT_TYPE_CLASS = eINSTANCE.getAnnaeherungsgeschwindigkeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNAEHERUNGSGESCHWINDIGKEIT_TYPE_CLASS__WERT = eINSTANCE.getAnnaeherungsgeschwindigkeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Anzahl_Wiederhol_ZL_Anstoesse_TypeClassImpl <em>Anzahl Wiederhol ZL Anstoesse Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Anzahl_Wiederhol_ZL_Anstoesse_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getAnzahl_Wiederhol_ZL_Anstoesse_TypeClass()
		 * @generated
		 */
		EClass ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE_CLASS = eINSTANCE.getAnzahl_Wiederhol_ZL_Anstoesse_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE_CLASS__WERT = eINSTANCE.getAnzahl_Wiederhol_ZL_Anstoesse_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Deadlockpruefung_TypeClassImpl <em>Deadlockpruefung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Deadlockpruefung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getDeadlockpruefung_TypeClass()
		 * @generated
		 */
		EClass DEADLOCKPRUEFUNG_TYPE_CLASS = eINSTANCE.getDeadlockpruefung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEADLOCKPRUEFUNG_TYPE_CLASS__WERT = eINSTANCE.getDeadlockpruefung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.DWeg_Prio_TypeClassImpl <em>DWeg Prio Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.DWeg_Prio_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getDWeg_Prio_TypeClass()
		 * @generated
		 */
		EClass DWEG_PRIO_TYPE_CLASS = eINSTANCE.getDWeg_Prio_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DWEG_PRIO_TYPE_CLASS__WERT = eINSTANCE.getDWeg_Prio_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Einstellkontrollzeit_TypeClassImpl <em>Einstellkontrollzeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Einstellkontrollzeit_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getEinstellkontrollzeit_TypeClass()
		 * @generated
		 */
		EClass EINSTELLKONTROLLZEIT_TYPE_CLASS = eINSTANCE.getEinstellkontrollzeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINSTELLKONTROLLZEIT_TYPE_CLASS__WERT = eINSTANCE.getEinstellkontrollzeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Fstr_Bildezeit_TypeClassImpl <em>Fstr Bildezeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Fstr_Bildezeit_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getFstr_Bildezeit_TypeClass()
		 * @generated
		 */
		EClass FSTR_BILDEZEIT_TYPE_CLASS = eINSTANCE.getFstr_Bildezeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSTR_BILDEZEIT_TYPE_CLASS__WERT = eINSTANCE.getFstr_Bildezeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.FUEM_Auswertung_TypeClassImpl <em>FUEM Auswertung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.FUEM_Auswertung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getFUEM_Auswertung_TypeClass()
		 * @generated
		 */
		EClass FUEM_AUSWERTUNG_TYPE_CLASS = eINSTANCE.getFUEM_Auswertung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUEM_AUSWERTUNG_TYPE_CLASS__WERT = eINSTANCE.getFUEM_Auswertung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.GK_TypeClassImpl <em>GK Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.GK_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getGK_TypeClass()
		 * @generated
		 */
		EClass GK_TYPE_CLASS = eINSTANCE.getGK_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GK_TYPE_CLASS__WERT = eINSTANCE.getGK_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.GKZSS_TypeClassImpl <em>GKZSS Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.GKZSS_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getGKZSS_TypeClass()
		 * @generated
		 */
		EClass GKZSS_TYPE_CLASS = eINSTANCE.getGKZSS_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GKZSS_TYPE_CLASS__WERT = eINSTANCE.getGKZSS_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Lenkabbruchzeit_TypeClassImpl <em>Lenkabbruchzeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Lenkabbruchzeit_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getLenkabbruchzeit_TypeClass()
		 * @generated
		 */
		EClass LENKABBRUCHZEIT_TYPE_CLASS = eINSTANCE.getLenkabbruchzeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENKABBRUCHZEIT_TYPE_CLASS__WERT = eINSTANCE.getLenkabbruchzeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Lenkziffernstellen_TypeClassImpl <em>Lenkziffernstellen Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Lenkziffernstellen_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getLenkziffernstellen_TypeClass()
		 * @generated
		 */
		EClass LENKZIFFERNSTELLEN_TYPE_CLASS = eINSTANCE.getLenkziffernstellen_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENKZIFFERNSTELLEN_TYPE_CLASS__WERT = eINSTANCE.getLenkziffernstellen_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Personal_Reaktionszeit_TypeClassImpl <em>Personal Reaktionszeit Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Personal_Reaktionszeit_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getPersonal_Reaktionszeit_TypeClass()
		 * @generated
		 */
		EClass PERSONAL_REAKTIONSZEIT_TYPE_CLASS = eINSTANCE.getPersonal_Reaktionszeit_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_REAKTIONSZEIT_TYPE_CLASS__WERT = eINSTANCE.getPersonal_Reaktionszeit_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Sichtzeit_Vorsignal_TypeClassImpl <em>Sichtzeit Vorsignal Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Sichtzeit_Vorsignal_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getSichtzeit_Vorsignal_TypeClass()
		 * @generated
		 */
		EClass SICHTZEIT_VORSIGNAL_TYPE_CLASS = eINSTANCE.getSichtzeit_Vorsignal_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SICHTZEIT_VORSIGNAL_TYPE_CLASS__WERT = eINSTANCE.getSichtzeit_Vorsignal_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Signalgruppe_Bezeichner_TypeClassImpl <em>Signalgruppe Bezeichner Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Signalgruppe_Bezeichner_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getSignalgruppe_Bezeichner_TypeClass()
		 * @generated
		 */
		EClass SIGNALGRUPPE_BEZEICHNER_TYPE_CLASS = eINSTANCE.getSignalgruppe_Bezeichner_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALGRUPPE_BEZEICHNER_TYPE_CLASS__WERT = eINSTANCE.getSignalgruppe_Bezeichner_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Tv_GK_TypeClassImpl <em>Tv GK Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Tv_GK_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getTv_GK_TypeClass()
		 * @generated
		 */
		EClass TV_GK_TYPE_CLASS = eINSTANCE.getTv_GK_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TV_GK_TYPE_CLASS__WERT = eINSTANCE.getTv_GK_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.Vmax_Annaeherung_TypeClassImpl <em>Vmax Annaeherung Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.Vmax_Annaeherung_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getVmax_Annaeherung_TypeClass()
		 * @generated
		 */
		EClass VMAX_ANNAEHERUNG_TYPE_CLASS = eINSTANCE.getVmax_Annaeherung_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VMAX_ANNAEHERUNG_TYPE_CLASS__WERT = eINSTANCE.getVmax_Annaeherung_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZLImpl <em>ZL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZLImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL()
		 * @generated
		 */
		EClass ZL = eINSTANCE.getZL();

		/**
		 * The meta object literal for the '<em><b>IDESTW Zentraleinheit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL__IDESTW_ZENTRALEINHEIT = eINSTANCE.getZL_IDESTWZentraleinheit();

		/**
		 * The meta object literal for the '<em><b>IDZN</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL__IDZN = eINSTANCE.getZL_IDZN();

		/**
		 * The meta object literal for the '<em><b>ZL Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL__ZL_ALLG = eINSTANCE.getZL_ZLAllg();

		/**
		 * The meta object literal for the '<em><b>ZLZN</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL__ZLZN = eINSTANCE.getZL_ZLZN();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Allg_AttributeGroupImpl <em>ZL Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Allg_AttributeGroup()
		 * @generated
		 */
		EClass ZL_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getZL_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Anzahl Wiederhol ZL Anstoesse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_ALLG_ATTRIBUTE_GROUP__ANZAHL_WIEDERHOL_ZL_ANSTOESSE = eINSTANCE.getZL_Allg_AttributeGroup_AnzahlWiederholZLAnstoesse();

		/**
		 * The meta object literal for the '<em><b>Deadlockpruefung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_ALLG_ATTRIBUTE_GROUP__DEADLOCKPRUEFUNG = eINSTANCE.getZL_Allg_AttributeGroup_Deadlockpruefung();

		/**
		 * The meta object literal for the '<em><b>Einstellkontrollzeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_ALLG_ATTRIBUTE_GROUP__EINSTELLKONTROLLZEIT = eINSTANCE.getZL_Allg_AttributeGroup_Einstellkontrollzeit();

		/**
		 * The meta object literal for the '<em><b>Lenkabbruchzeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_ALLG_ATTRIBUTE_GROUP__LENKABBRUCHZEIT = eINSTANCE.getZL_Allg_AttributeGroup_Lenkabbruchzeit();

		/**
		 * The meta object literal for the '<em><b>Personal Reaktionszeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_ALLG_ATTRIBUTE_GROUP__PERSONAL_REAKTIONSZEIT = eINSTANCE.getZL_Allg_AttributeGroup_PersonalReaktionszeit();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_DLP_AbschnittImpl <em>ZL DLP Abschnitt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_DLP_AbschnittImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_DLP_Abschnitt()
		 * @generated
		 */
		EClass ZL_DLP_ABSCHNITT = eINSTANCE.getZL_DLP_Abschnitt();

		/**
		 * The meta object literal for the '<em><b>ID Gleis Abschnitt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT = eINSTANCE.getZL_DLP_Abschnitt_IDGleisAbschnitt();

		/**
		 * The meta object literal for the '<em><b>IDZLDLP Fstr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_DLP_ABSCHNITT__IDZLDLP_FSTR = eINSTANCE.getZL_DLP_Abschnitt_IDZLDLPFstr();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_DLP_FstrImpl <em>ZL DLP Fstr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_DLP_FstrImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_DLP_Fstr()
		 * @generated
		 */
		EClass ZL_DLP_FSTR = eINSTANCE.getZL_DLP_Fstr();

		/**
		 * The meta object literal for the '<em><b>IDZL Fstr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_DLP_FSTR__IDZL_FSTR = eINSTANCE.getZL_DLP_Fstr_IDZLFstr();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_FstrImpl <em>ZL Fstr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_FstrImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr()
		 * @generated
		 */
		EClass ZL_FSTR = eINSTANCE.getZL_Fstr();

		/**
		 * The meta object literal for the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR__ID_FSTR_ZUG_RANGIER = eINSTANCE.getZL_Fstr_IDFstrZugRangier();

		/**
		 * The meta object literal for the '<em><b>IDZL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR__IDZL = eINSTANCE.getZL_Fstr_IDZL();

		/**
		 * The meta object literal for the '<em><b>IDZL Fstr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR__IDZL_FSTR = eINSTANCE.getZL_Fstr_IDZLFstr();

		/**
		 * The meta object literal for the '<em><b>ZL Fstr Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR__ZL_FSTR_ALLG = eINSTANCE.getZL_Fstr_ZLFstrAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Allg_AttributeGroupImpl <em>ZL Fstr Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr_Allg_AttributeGroup()
		 * @generated
		 */
		EClass ZL_FSTR_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getZL_Fstr_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Annaeherungsgeschwindigkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ALLG_ATTRIBUTE_GROUP__ANNAEHERUNGSGESCHWINDIGKEIT = eINSTANCE.getZL_Fstr_Allg_AttributeGroup_Annaeherungsgeschwindigkeit();

		/**
		 * The meta object literal for the '<em><b>DWeg Prio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ALLG_ATTRIBUTE_GROUP__DWEG_PRIO = eINSTANCE.getZL_Fstr_Allg_AttributeGroup_DWegPrio();

		/**
		 * The meta object literal for the '<em><b>Fstr Bildezeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FSTR_BILDEZEIT = eINSTANCE.getZL_Fstr_Allg_AttributeGroup_FstrBildezeit();

		/**
		 * The meta object literal for the '<em><b>FUEM Auswertung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FUEM_AUSWERTUNG = eINSTANCE.getZL_Fstr_Allg_AttributeGroup_FUEMAuswertung();

		/**
		 * The meta object literal for the '<em><b>Sichtzeit Vorsignal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ALLG_ATTRIBUTE_GROUP__SICHTZEIT_VORSIGNAL = eINSTANCE.getZL_Fstr_Allg_AttributeGroup_SichtzeitVorsignal();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_AnstossImpl <em>ZL Fstr Anstoss</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_AnstossImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr_Anstoss()
		 * @generated
		 */
		EClass ZL_FSTR_ANSTOSS = eINSTANCE.getZL_Fstr_Anstoss();

		/**
		 * The meta object literal for the '<em><b>ID Vorsignal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ANSTOSS__ID_VORSIGNAL = eINSTANCE.getZL_Fstr_Anstoss_IDVorsignal();

		/**
		 * The meta object literal for the '<em><b>IDZL Fstr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ANSTOSS__IDZL_FSTR = eINSTANCE.getZL_Fstr_Anstoss_IDZLFstr();

		/**
		 * The meta object literal for the '<em><b>ZL Fstr Anstoss Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG = eINSTANCE.getZL_Fstr_Anstoss_ZLFstrAnstossAllg();

		/**
		 * The meta object literal for the '<em><b>ZL Fstr Anstoss GK</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK = eINSTANCE.getZL_Fstr_Anstoss_ZLFstrAnstossGK();

		/**
		 * The meta object literal for the '<em><b>ID Einschaltpunkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT = eINSTANCE.getZL_Fstr_Anstoss_IDEinschaltpunkt();

		/**
		 * The meta object literal for the '<em><b>IDZN Anzeigefeld Anstoss</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS = eINSTANCE.getZL_Fstr_Anstoss_IDZNAnzeigefeldAnstoss();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Anstoss_Allg_AttributeGroupImpl <em>ZL Fstr Anstoss Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Anstoss_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr_Anstoss_Allg_AttributeGroup()
		 * @generated
		 */
		EClass ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getZL_Fstr_Anstoss_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>GKZSS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__GKZSS = eINSTANCE.getZL_Fstr_Anstoss_Allg_AttributeGroup_GKZSS();

		/**
		 * The meta object literal for the '<em><b>Vmax Annaeherung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__VMAX_ANNAEHERUNG = eINSTANCE.getZL_Fstr_Anstoss_Allg_AttributeGroup_VmaxAnnaeherung();

		/**
		 * The meta object literal for the '<em><b>ZL Fstr Zuschlag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__ZL_FSTR_ZUSCHLAG = eINSTANCE.getZL_Fstr_Anstoss_Allg_AttributeGroup_ZLFstrZuschlag();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Anstoss_GK_AttributeGroupImpl <em>ZL Fstr Anstoss GK Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Anstoss_GK_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr_Anstoss_GK_AttributeGroup()
		 * @generated
		 */
		EClass ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP = eINSTANCE.getZL_Fstr_Anstoss_GK_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>GK</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__GK = eINSTANCE.getZL_Fstr_Anstoss_GK_AttributeGroup_GK();

		/**
		 * The meta object literal for the '<em><b>Tv GK</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__TV_GK = eINSTANCE.getZL_Fstr_Anstoss_GK_AttributeGroup_TvGK();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Zuschlag_TypeClassImpl <em>ZL Fstr Zuschlag Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Zuschlag_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr_Zuschlag_TypeClass()
		 * @generated
		 */
		EClass ZL_FSTR_ZUSCHLAG_TYPE_CLASS = eINSTANCE.getZL_Fstr_Zuschlag_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZL_FSTR_ZUSCHLAG_TYPE_CLASS__WERT = eINSTANCE.getZL_Fstr_Zuschlag_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_SignalgruppeImpl <em>ZL Signalgruppe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_SignalgruppeImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Signalgruppe()
		 * @generated
		 */
		EClass ZL_SIGNALGRUPPE = eINSTANCE.getZL_Signalgruppe();

		/**
		 * The meta object literal for the '<em><b>IDZL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_SIGNALGRUPPE__IDZL = eINSTANCE.getZL_Signalgruppe_IDZL();

		/**
		 * The meta object literal for the '<em><b>ZL Signalgruppe Allg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG = eINSTANCE.getZL_Signalgruppe_ZLSignalgruppeAllg();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Signalgruppe_Allg_AttributeGroupImpl <em>ZL Signalgruppe Allg Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Signalgruppe_Allg_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Signalgruppe_Allg_AttributeGroup()
		 * @generated
		 */
		EClass ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP = eINSTANCE.getZL_Signalgruppe_Allg_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Signalgruppe Bezeichner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP__SIGNALGRUPPE_BEZEICHNER = eINSTANCE.getZL_Signalgruppe_Allg_AttributeGroup_SignalgruppeBezeichner();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Signalgruppe_ZuordnungImpl <em>ZL Signalgruppe Zuordnung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Signalgruppe_ZuordnungImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Signalgruppe_Zuordnung()
		 * @generated
		 */
		EClass ZL_SIGNALGRUPPE_ZUORDNUNG = eINSTANCE.getZL_Signalgruppe_Zuordnung();

		/**
		 * The meta object literal for the '<em><b>ID Signal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL = eINSTANCE.getZL_Signalgruppe_Zuordnung_IDSignal();

		/**
		 * The meta object literal for the '<em><b>IDZL Signalgruppe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE = eINSTANCE.getZL_Signalgruppe_Zuordnung_IDZLSignalgruppe();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_ZN_AttributeGroupImpl <em>ZL ZN Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_ZN_AttributeGroupImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_ZN_AttributeGroup()
		 * @generated
		 */
		EClass ZL_ZN_ATTRIBUTE_GROUP = eINSTANCE.getZL_ZN_AttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Lenkziffernstellen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_ZN_ATTRIBUTE_GROUP__LENKZIFFERNSTELLEN = eINSTANCE.getZL_ZN_AttributeGroup_Lenkziffernstellen();

		/**
		 * The meta object literal for the '<em><b>ZN Stellen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZL_ZN_ATTRIBUTE_GROUP__ZN_STELLEN = eINSTANCE.getZL_ZN_AttributeGroup_ZNStellen();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZN_Stellen_TypeClassImpl <em>ZN Stellen Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZN_Stellen_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZN_Stellen_TypeClass()
		 * @generated
		 */
		EClass ZN_STELLEN_TYPE_CLASS = eINSTANCE.getZN_Stellen_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZN_STELLEN_TYPE_CLASS__WERT = eINSTANCE.getZN_Stellen_TypeClass_Wert();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.ENUMLenkziffernstellen <em>ENUM Lenkziffernstellen</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.ENUMLenkziffernstellen
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getENUMLenkziffernstellen()
		 * @generated
		 */
		EEnum ENUM_LENKZIFFERNSTELLEN = eINSTANCE.getENUMLenkziffernstellen();

		/**
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Zuglenkung.ENUMZNStellen <em>ENUMZN Stellen</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.ENUMZNStellen
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getENUMZNStellen()
		 * @generated
		 */
		EEnum ENUMZN_STELLEN = eINSTANCE.getENUMZNStellen();

		/**
		 * The meta object literal for the '<em>Annaeherungsgeschwindigkeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getAnnaeherungsgeschwindigkeit_Type()
		 * @generated
		 */
		EDataType ANNAEHERUNGSGESCHWINDIGKEIT_TYPE = eINSTANCE.getAnnaeherungsgeschwindigkeit_Type();

		/**
		 * The meta object literal for the '<em>Anzahl Wiederhol ZL Anstoesse Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getAnzahl_Wiederhol_ZL_Anstoesse_Type()
		 * @generated
		 */
		EDataType ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE = eINSTANCE.getAnzahl_Wiederhol_ZL_Anstoesse_Type();

		/**
		 * The meta object literal for the '<em>DWeg Prio Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getDWeg_Prio_Type()
		 * @generated
		 */
		EDataType DWEG_PRIO_TYPE = eINSTANCE.getDWeg_Prio_Type();

		/**
		 * The meta object literal for the '<em>Einstellkontrollzeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getEinstellkontrollzeit_Type()
		 * @generated
		 */
		EDataType EINSTELLKONTROLLZEIT_TYPE = eINSTANCE.getEinstellkontrollzeit_Type();

		/**
		 * The meta object literal for the '<em>ENUM Lenkziffernstellen Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.ENUMLenkziffernstellen
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getENUMLenkziffernstellenObject()
		 * @generated
		 */
		EDataType ENUM_LENKZIFFERNSTELLEN_OBJECT = eINSTANCE.getENUMLenkziffernstellenObject();

		/**
		 * The meta object literal for the '<em>ENUMZN Stellen Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Zuglenkung.ENUMZNStellen
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getENUMZNStellenObject()
		 * @generated
		 */
		EDataType ENUMZN_STELLEN_OBJECT = eINSTANCE.getENUMZNStellenObject();

		/**
		 * The meta object literal for the '<em>Fstr Bildezeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getFstr_Bildezeit_Type()
		 * @generated
		 */
		EDataType FSTR_BILDEZEIT_TYPE = eINSTANCE.getFstr_Bildezeit_Type();

		/**
		 * The meta object literal for the '<em>GK Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getGK_Type()
		 * @generated
		 */
		EDataType GK_TYPE = eINSTANCE.getGK_Type();

		/**
		 * The meta object literal for the '<em>Lenkabbruchzeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getLenkabbruchzeit_Type()
		 * @generated
		 */
		EDataType LENKABBRUCHZEIT_TYPE = eINSTANCE.getLenkabbruchzeit_Type();

		/**
		 * The meta object literal for the '<em>Personal Reaktionszeit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getPersonal_Reaktionszeit_Type()
		 * @generated
		 */
		EDataType PERSONAL_REAKTIONSZEIT_TYPE = eINSTANCE.getPersonal_Reaktionszeit_Type();

		/**
		 * The meta object literal for the '<em>Sichtzeit Vorsignal Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getSichtzeit_Vorsignal_Type()
		 * @generated
		 */
		EDataType SICHTZEIT_VORSIGNAL_TYPE = eINSTANCE.getSichtzeit_Vorsignal_Type();

		/**
		 * The meta object literal for the '<em>Signalgruppe Bezeichner Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getSignalgruppe_Bezeichner_Type()
		 * @generated
		 */
		EDataType SIGNALGRUPPE_BEZEICHNER_TYPE = eINSTANCE.getSignalgruppe_Bezeichner_Type();

		/**
		 * The meta object literal for the '<em>Tv GK Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getTv_GK_Type()
		 * @generated
		 */
		EDataType TV_GK_TYPE = eINSTANCE.getTv_GK_Type();

		/**
		 * The meta object literal for the '<em>Vmax Annaeherung Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getVmax_Annaeherung_Type()
		 * @generated
		 */
		EDataType VMAX_ANNAEHERUNG_TYPE = eINSTANCE.getVmax_Annaeherung_Type();

		/**
		 * The meta object literal for the '<em>ZL Fstr Zuschlag Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl#getZL_Fstr_Zuschlag_Type()
		 * @generated
		 */
		EDataType ZL_FSTR_ZUSCHLAG_TYPE = eINSTANCE.getZL_Fstr_Zuschlag_Type();

	}

} //ZuglenkungPackage
