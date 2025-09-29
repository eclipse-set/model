/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signalbegriffe_Ril_301;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

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
 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Factory
 * @model kind="package"
 * @generated
 */
public interface Signalbegriffe_Ril_301Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Signalbegriffe_Ril_301";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Signalbegriffe_Ril_301/1.10.0.3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsSignalbegriffe_Ril_301";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Signalbegriffe_Ril_301Package eINSTANCE = org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BSVAUESImpl <em>BSVAUES</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BSVAUESImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBSVAUES()
	 * @generated
	 */
	int BSVAUES = 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>BSVAUES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVAUES_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BSVRVAImpl <em>BSVRVA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BSVRVAImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBSVRVA()
	 * @generated
	 */
	int BSVRVA = 1;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>BSVRVA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSVRVA_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BSWdhImpl <em>BS Wdh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BSWdhImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBSWdh()
	 * @generated
	 */
	int BS_WDH = 2;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>BS Wdh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_WDH_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BSZBSBerImpl <em>BSZBS Ber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BSZBSBerImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBSZBSBer()
	 * @generated
	 */
	int BSZBS_BER = 3;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>BSZBS Ber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSZBS_BER_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BSZusatzImpl <em>BS Zusatz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BSZusatzImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBSZusatz()
	 * @generated
	 */
	int BS_ZUSATZ = 4;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>BS Zusatz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_ZUSATZ_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue00LpImpl <em>Bue00 Lp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue00LpImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue00Lp()
	 * @generated
	 */
	int BUE00_LP = 5;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue00 Lp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE00_LP_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue01LpImpl <em>Bue01 Lp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue01LpImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue01Lp()
	 * @generated
	 */
	int BUE01_LP = 6;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue01 Lp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_LP_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue01SImpl <em>Bue01 S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue01SImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue01S()
	 * @generated
	 */
	int BUE01_S = 7;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue01 S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE01_S_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue02LpImpl <em>Bue02 Lp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue02LpImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue02Lp()
	 * @generated
	 */
	int BUE02_LP = 8;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue02 Lp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_LP_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue02SImpl <em>Bue02 S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue02SImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue02S()
	 * @generated
	 */
	int BUE02_S = 9;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue02 S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE02_S_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue10LpBliImpl <em>Bue10 Lp Bli</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue10LpBliImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue10LpBli()
	 * @generated
	 */
	int BUE10_LP_BLI = 10;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue10 Lp Bli</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE10_LP_BLI_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue11LpBliImpl <em>Bue11 Lp Bli</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue11LpBliImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue11LpBli()
	 * @generated
	 */
	int BUE11_LP_BLI = 11;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue11 Lp Bli</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_LP_BLI_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue11SBliImpl <em>Bue11 SBli</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue11SBliImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue11SBli()
	 * @generated
	 */
	int BUE11_SBLI = 12;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue11 SBli</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE11_SBLI_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue12LpStImpl <em>Bue12 Lp St</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue12LpStImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue12LpSt()
	 * @generated
	 */
	int BUE12_LP_ST = 13;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue12 Lp St</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_LP_ST_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue12SStImpl <em>Bue12 SSt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue12SStImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue12SSt()
	 * @generated
	 */
	int BUE12_SST = 14;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue12 SSt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE12_SST_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue2Impl <em>Bue2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue2()
	 * @generated
	 */
	int BUE2 = 15;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue21RImpl <em>Bue21 R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue21RImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue21R()
	 * @generated
	 */
	int BUE21_R = 16;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue21 R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE21_R_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue22RImpl <em>Bue22 R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue22RImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue22R()
	 * @generated
	 */
	int BUE22_R = 17;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue22 R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE22_R_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue23RImpl <em>Bue23 R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue23RImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue23R()
	 * @generated
	 */
	int BUE23_R = 18;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue23 R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE23_R_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue3Impl <em>Bue3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue3Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue3()
	 * @generated
	 */
	int BUE3 = 19;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE3_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue4Impl <em>Bue4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue4Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue4()
	 * @generated
	 */
	int BUE4 = 20;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE4_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue5Impl <em>Bue5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Bue5Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBue5()
	 * @generated
	 */
	int BUE5 = 21;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE5_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BueATImpl <em>Bue AT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BueATImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBueAT()
	 * @generated
	 */
	int BUE_AT = 22;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue AT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BueATZusatzImpl <em>Bue AT Zusatz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BueATZusatzImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBueATZusatz()
	 * @generated
	 */
	int BUE_AT_ZUSATZ = 23;

	/**
	 * The number of structural features of the '<em>Bue AT Zusatz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_AT_ZUSATZ_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BueKTImpl <em>Bue KT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.BueKTImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBueKT()
	 * @generated
	 */
	int BUE_KT = 24;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Bue KT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUE_KT_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El1Impl <em>El1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getEl1()
	 * @generated
	 */
	int EL1 = 25;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El1vImpl <em>El1v</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El1vImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getEl1v()
	 * @generated
	 */
	int EL1V = 26;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El1v</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL1V_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El2Impl <em>El2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getEl2()
	 * @generated
	 */
	int EL2 = 27;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El3Impl <em>El3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El3Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getEl3()
	 * @generated
	 */
	int EL3 = 28;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL3_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El34ZusatzImpl <em>El34 Zusatz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El34ZusatzImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getEl34Zusatz()
	 * @generated
	 */
	int EL34_ZUSATZ = 29;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El34 Zusatz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El34ZusatzKombiImpl <em>El34 Zusatz Kombi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El34ZusatzKombiImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getEl34ZusatzKombi()
	 * @generated
	 */
	int EL34_ZUSATZ_KOMBI = 30;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El34 Zusatz Kombi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL34_ZUSATZ_KOMBI_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El4Impl <em>El4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El4Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getEl4()
	 * @generated
	 */
	int EL4 = 31;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL4_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El5Impl <em>El5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El5Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getEl5()
	 * @generated
	 */
	int EL5 = 32;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL5_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El6Impl <em>El6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.El6Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getEl6()
	 * @generated
	 */
	int EL6 = 33;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL6_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ElPfBImpl <em>El Pf B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ElPfBImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getElPfB()
	 * @generated
	 */
	int EL_PF_B = 34;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El Pf B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_B_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ElPfLImpl <em>El Pf L</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ElPfLImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getElPfL()
	 * @generated
	 */
	int EL_PF_L = 35;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El Pf L</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_L_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ElPfOImpl <em>El Pf O</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ElPfOImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getElPfO()
	 * @generated
	 */
	int EL_PF_O = 36;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El Pf O</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_O_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ElPfRImpl <em>El Pf R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ElPfRImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getElPfR()
	 * @generated
	 */
	int EL_PF_R = 37;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El Pf R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PF_R_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ElTACImpl <em>El TAC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ElTACImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getElTAC()
	 * @generated
	 */
	int EL_TAC = 38;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El TAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TAC_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ElTDCImpl <em>El TDC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ElTDCImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getElTDC()
	 * @generated
	 */
	int EL_TDC = 39;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>El TDC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TDC_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl1Impl <em>Hl1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl1()
	 * @generated
	 */
	int HL1 = 40;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl10Impl <em>Hl10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl10Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl10()
	 * @generated
	 */
	int HL10 = 41;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL10_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl11Impl <em>Hl11</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl11Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl11()
	 * @generated
	 */
	int HL11 = 42;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL11_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl12aImpl <em>Hl12a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl12aImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl12a()
	 * @generated
	 */
	int HL12A = 43;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl12a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12A_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl12bImpl <em>Hl12b</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl12bImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl12b()
	 * @generated
	 */
	int HL12B = 44;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl12b</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL12B_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl2Impl <em>Hl2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl2()
	 * @generated
	 */
	int HL2 = 45;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl3aImpl <em>Hl3a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl3aImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl3a()
	 * @generated
	 */
	int HL3A = 46;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl3a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3A_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl3bImpl <em>Hl3b</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl3bImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl3b()
	 * @generated
	 */
	int HL3B = 47;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl3b</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL3B_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl4Impl <em>Hl4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl4Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl4()
	 * @generated
	 */
	int HL4 = 48;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL4_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl5Impl <em>Hl5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl5Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl5()
	 * @generated
	 */
	int HL5 = 49;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL5_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl6aImpl <em>Hl6a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl6aImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl6a()
	 * @generated
	 */
	int HL6A = 50;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl6a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6A_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl6bImpl <em>Hl6b</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl6bImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl6b()
	 * @generated
	 */
	int HL6B = 51;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl6b</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL6B_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl7Impl <em>Hl7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl7Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl7()
	 * @generated
	 */
	int HL7 = 52;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL7_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl8Impl <em>Hl8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl8Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl8()
	 * @generated
	 */
	int HL8 = 53;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL8_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl9aImpl <em>Hl9a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl9aImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl9a()
	 * @generated
	 */
	int HL9A = 54;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl9a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9A_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl9bImpl <em>Hl9b</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hl9bImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHl9b()
	 * @generated
	 */
	int HL9B = 55;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hl9b</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL9B_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp0Impl <em>Hp0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp0Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHp0()
	 * @generated
	 */
	int HP0 = 56;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hp0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp02LpImpl <em>Hp02 Lp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp02LpImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHp02Lp()
	 * @generated
	 */
	int HP02_LP = 57;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hp02 Lp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP02_LP_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp0FImpl <em>Hp0 F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp0FImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHp0F()
	 * @generated
	 */
	int HP0_F = 58;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hp0 F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP0_F_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp1Impl <em>Hp1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHp1()
	 * @generated
	 */
	int HP1 = 59;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hp1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp1FImpl <em>Hp1 F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp1FImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHp1F()
	 * @generated
	 */
	int HP1_F = 60;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hp1 F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP1_F_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp2Impl <em>Hp2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHp2()
	 * @generated
	 */
	int HP2 = 61;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hp2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp2FImpl <em>Hp2 F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Hp2FImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getHp2F()
	 * @generated
	 */
	int HP2_F = 62;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Hp2 F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP2_F_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.KlImpl <em>Kl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.KlImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getKl()
	 * @generated
	 */
	int KL = 63;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Kl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KL_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ks1Impl <em>Ks1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ks1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getKs1()
	 * @generated
	 */
	int KS1 = 64;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ks1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ks2Impl <em>Ks2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ks2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getKs2()
	 * @generated
	 */
	int KS2 = 65;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ks2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf1Impl <em>Lf1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getLf1()
	 * @generated
	 */
	int LF1 = 66;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Lf1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf12Impl <em>Lf12</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf12Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getLf12()
	 * @generated
	 */
	int LF12 = 67;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Lf12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF12_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf1WdhImpl <em>Lf1 Wdh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf1WdhImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getLf1Wdh()
	 * @generated
	 */
	int LF1_WDH = 68;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Lf1 Wdh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF1_WDH_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf2Impl <em>Lf2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getLf2()
	 * @generated
	 */
	int LF2 = 69;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Lf2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf3Impl <em>Lf3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf3Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getLf3()
	 * @generated
	 */
	int LF3 = 70;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Lf3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF3_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf4DSImpl <em>Lf4 DS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf4DSImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getLf4DS()
	 * @generated
	 */
	int LF4_DS = 71;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Lf4 DS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DS_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf4DVImpl <em>Lf4 DV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf4DVImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getLf4DV()
	 * @generated
	 */
	int LF4_DV = 72;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Lf4 DV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF4_DV_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf5DSImpl <em>Lf5 DS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf5DSImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getLf5DS()
	 * @generated
	 */
	int LF5_DS = 73;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Lf5 DS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DS_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf5DVImpl <em>Lf5 DV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf5DVImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getLf5DV()
	 * @generated
	 */
	int LF5_DV = 74;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Lf5 DV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF5_DV_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf6Impl <em>Lf6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf6Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getLf6()
	 * @generated
	 */
	int LF6 = 75;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Lf6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF6_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf7Impl <em>Lf7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Lf7Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getLf7()
	 * @generated
	 */
	int LF7 = 76;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Lf7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF7_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.LfPfLImpl <em>Lf Pf L</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.LfPfLImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getLfPfL()
	 * @generated
	 */
	int LF_PF_L = 77;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Lf Pf L</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_L_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.LfPfRImpl <em>Lf Pf R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.LfPfRImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getLfPfR()
	 * @generated
	 */
	int LF_PF_R = 78;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Lf Pf R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LF_PF_R_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsGeDImpl <em>Ms Ge D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsGeDImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getMsGeD()
	 * @generated
	 */
	int MS_GE_D = 79;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ms Ge D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_GE_D_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsRtImpl <em>Ms Rt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsRtImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getMsRt()
	 * @generated
	 */
	int MS_RT = 80;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ms Rt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_RT_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsSkGeImpl <em>Ms Sk Ge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsSkGeImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getMsSkGe()
	 * @generated
	 */
	int MS_SK_GE = 81;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ms Sk Ge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_GE_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsSkRtImpl <em>Ms Sk Rt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsSkRtImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getMsSkRt()
	 * @generated
	 */
	int MS_SK_RT = 82;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ms Sk Rt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_SK_RT_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsUESWdhImpl <em>Ms UES Wdh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsUESWdhImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getMsUESWdh()
	 * @generated
	 */
	int MS_UES_WDH = 83;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ms UES Wdh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_UES_WDH_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsVwImpl <em>Ms Vw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsVwImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getMsVw()
	 * @generated
	 */
	int MS_VW = 84;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ms Vw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_VW_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsWs2swPImpl <em>Ms Ws2sw P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsWs2swPImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getMsWs2swP()
	 * @generated
	 */
	int MS_WS2SW_P = 85;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ms Ws2sw P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS2SW_P_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsWsGeWsImpl <em>Ms Ws Ge Ws</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsWsGeWsImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getMsWsGeWs()
	 * @generated
	 */
	int MS_WS_GE_WS = 86;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ms Ws Ge Ws</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_GE_WS_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsWsRtWsImpl <em>Ms Ws Rt Ws</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsWsRtWsImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getMsWsRtWs()
	 * @generated
	 */
	int MS_WS_RT_WS = 87;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ms Ws Rt Ws</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_RT_WS_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsWsSwWsImpl <em>Ms Ws Sw Ws</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.MsWsSwWsImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getMsWsSwWs()
	 * @generated
	 */
	int MS_WS_SW_WS = 88;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ms Ws Sw Ws</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_WS_SW_WS_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne1Impl <em>Ne1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe1()
	 * @generated
	 */
	int NE1 = 89;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne12Impl <em>Ne12</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne12Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe12()
	 * @generated
	 */
	int NE12 = 90;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE12_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne13aImpl <em>Ne13a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne13aImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe13a()
	 * @generated
	 */
	int NE13A = 91;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne13a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13A_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne13bImpl <em>Ne13b</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne13bImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe13b()
	 * @generated
	 */
	int NE13B = 92;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne13b</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE13B_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne14Impl <em>Ne14</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne14Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe14()
	 * @generated
	 */
	int NE14 = 93;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne14</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE14_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne2Impl <em>Ne2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe2()
	 * @generated
	 */
	int NE2 = 94;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne2VRVAImpl <em>Ne2 VRVA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne2VRVAImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe2VRVA()
	 * @generated
	 */
	int NE2_VRVA = 95;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne2 VRVA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE2_VRVA_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne31strImpl <em>Ne31str</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne31strImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe31str()
	 * @generated
	 */
	int NE31STR = 96;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne31str</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE31STR_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne32strImpl <em>Ne32str</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne32strImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe32str()
	 * @generated
	 */
	int NE32STR = 97;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne32str</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE32STR_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne33strImpl <em>Ne33str</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne33strImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe33str()
	 * @generated
	 */
	int NE33STR = 98;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne33str</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE33STR_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne34strImpl <em>Ne34str</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne34strImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe34str()
	 * @generated
	 */
	int NE34STR = 99;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne34str</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE34STR_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne35strImpl <em>Ne35str</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne35strImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe35str()
	 * @generated
	 */
	int NE35STR = 100;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne35str</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE35STR_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne4Impl <em>Ne4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne4Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe4()
	 * @generated
	 */
	int NE4 = 101;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE4_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne5Impl <em>Ne5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne5Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe5()
	 * @generated
	 */
	int NE5 = 102;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE5_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne6Impl <em>Ne6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne6Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe6()
	 * @generated
	 */
	int NE6 = 103;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE6_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne7aImpl <em>Ne7a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne7aImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe7a()
	 * @generated
	 */
	int NE7A = 104;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne7a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7A_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne7bImpl <em>Ne7b</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ne7bImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getNe7b()
	 * @generated
	 */
	int NE7B = 105;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ne7b</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE7B_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzAutoETImpl <em>Oz Auto ET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzAutoETImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzAutoET()
	 * @generated
	 */
	int OZ_AUTO_ET = 106;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz Auto ET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_ET_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzAutoHETImpl <em>Oz Auto HET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzAutoHETImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzAutoHET()
	 * @generated
	 */
	int OZ_AUTO_HET = 107;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz Auto HET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_AUTO_HET_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzBkImpl <em>Oz Bk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzBkImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzBk()
	 * @generated
	 */
	int OZ_BK = 108;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz Bk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_BK_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzETImpl <em>Oz ET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzETImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzET()
	 * @generated
	 */
	int OZ_ET = 109;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz ET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ET_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzFaImpl <em>Oz Fa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzFaImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzFa()
	 * @generated
	 */
	int OZ_FA = 110;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz Fa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FA_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzFakImpl <em>Oz Fak</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzFakImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzFak()
	 * @generated
	 */
	int OZ_FAK = 111;

	/**
	 * The number of structural features of the '<em>Oz Fak</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_FAK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzGSMRImpl <em>Oz GSMR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzGSMRImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzGSMR()
	 * @generated
	 */
	int OZ_GSMR = 112;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz GSMR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_GSMR_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzHETImpl <em>Oz HET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzHETImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzHET()
	 * @generated
	 */
	int OZ_HET = 113;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz HET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HET_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzHMImpl <em>Oz HM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzHMImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzHM()
	 * @generated
	 */
	int OZ_HM = 114;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz HM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_HM_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzICEImpl <em>Oz ICE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzICEImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzICE()
	 * @generated
	 */
	int OZ_ICE = 115;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz ICE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ICE_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzLZBBerImpl <em>Oz LZB Ber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzLZBBerImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzLZBBer()
	 * @generated
	 */
	int OZ_LZB_BER = 116;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz LZB Ber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_LZB_BER_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzOBGrenzeImpl <em>Oz OB Grenze</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzOBGrenzeImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzOBGrenze()
	 * @generated
	 */
	int OZ_OB_GRENZE = 117;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz OB Grenze</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_OB_GRENZE_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzPZB2000HzImpl <em>Oz PZB2000 Hz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzPZB2000HzImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzPZB2000Hz()
	 * @generated
	 */
	int OZ_PZB2000_HZ = 118;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz PZB2000 Hz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZB2000_HZ_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzPZBBUEImpl <em>Oz PZBBUE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzPZBBUEImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzPZBBUE()
	 * @generated
	 */
	int OZ_PZBBUE = 119;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz PZBBUE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_PZBBUE_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzZfImpl <em>Oz Zf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzZfImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzZf()
	 * @generated
	 */
	int OZ_ZF = 120;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Oz Zf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZF_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzZuglImpl <em>Oz Zugl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.OzZuglImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOzZugl()
	 * @generated
	 */
	int OZ_ZUGL = 121;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZUGL__SYMBOL = 0;

	/**
	 * The number of structural features of the '<em>Oz Zugl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OZ_ZUGL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Pf2Impl <em>Pf2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Pf2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getPf2()
	 * @generated
	 */
	int PF2 = 122;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Pf2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PF2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ra10Impl <em>Ra10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ra10Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getRa10()
	 * @generated
	 */
	int RA10 = 123;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ra10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA10_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ra11Impl <em>Ra11</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ra11Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getRa11()
	 * @generated
	 */
	int RA11 = 124;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ra11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ra11bImpl <em>Ra11b</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ra11bImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getRa11b()
	 * @generated
	 */
	int RA11B = 125;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ra11b</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA11B_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ra12Impl <em>Ra12</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ra12Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getRa12()
	 * @generated
	 */
	int RA12 = 126;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ra12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA12_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ra13Impl <em>Ra13</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ra13Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getRa13()
	 * @generated
	 */
	int RA13 = 127;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ra13</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA13_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sh0Impl <em>Sh0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sh0Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSh0()
	 * @generated
	 */
	int SH0 = 128;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Sh0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH0_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sh1Impl <em>Sh1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sh1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSh1()
	 * @generated
	 */
	int SH1 = 129;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Sh1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sh2Impl <em>Sh2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sh2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSh2()
	 * @generated
	 */
	int SH2 = 130;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Sh2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sk1Impl <em>Sk1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sk1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSk1()
	 * @generated
	 */
	int SK1 = 131;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Sk1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sk2Impl <em>Sk2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sk2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSk2()
	 * @generated
	 */
	int SK2 = 132;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Sk2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So1Impl <em>So1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSo1()
	 * @generated
	 */
	int SO1 = 133;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>So1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So106Impl <em>So106</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So106Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSo106()
	 * @generated
	 */
	int SO106 = 134;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>So106</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO106_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So14Impl <em>So14</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So14Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSo14()
	 * @generated
	 */
	int SO14 = 135;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>So14</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO14_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So15Impl <em>So15</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So15Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSo15()
	 * @generated
	 */
	int SO15 = 136;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>So15</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO15_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So191PImpl <em>So191 P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So191PImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSo191P()
	 * @generated
	 */
	int SO191_P = 137;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>So191 P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO191_P_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So192PImpl <em>So192 P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So192PImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSo192P()
	 * @generated
	 */
	int SO192_P = 138;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>So192 P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO192_P_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So193PImpl <em>So193 P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So193PImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSo193P()
	 * @generated
	 */
	int SO193_P = 139;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>So193 P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO193_P_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So20Impl <em>So20</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.So20Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSo20()
	 * @generated
	 */
	int SO20 = 140;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>So20</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO20_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv0Impl <em>Sv0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv0Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSv0()
	 * @generated
	 */
	int SV0 = 141;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Sv0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV0_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv1Impl <em>Sv1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSv1()
	 * @generated
	 */
	int SV1 = 142;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Sv1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv2Impl <em>Sv2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSv2()
	 * @generated
	 */
	int SV2 = 143;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Sv2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv3Impl <em>Sv3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv3Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSv3()
	 * @generated
	 */
	int SV3 = 144;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Sv3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV3_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv4Impl <em>Sv4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv4Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSv4()
	 * @generated
	 */
	int SV4 = 145;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Sv4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV4_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv5Impl <em>Sv5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv5Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSv5()
	 * @generated
	 */
	int SV5 = 146;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Sv5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV5_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv6Impl <em>Sv6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Sv6Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSv6()
	 * @generated
	 */
	int SV6 = 147;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Sv6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV6_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.SvWPfImpl <em>Sv WPf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.SvWPfImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getSvWPf()
	 * @generated
	 */
	int SV_WPF = 148;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Sv WPf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SV_WPF_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ts1Impl <em>Ts1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ts1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getTs1()
	 * @generated
	 */
	int TS1 = 149;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ts1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ts2Impl <em>Ts2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ts2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getTs2()
	 * @generated
	 */
	int TS2 = 150;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ts2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ts3Impl <em>Ts3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Ts3Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getTs3()
	 * @generated
	 */
	int TS3 = 151;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ts3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS3_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.UkrImpl <em>Ukr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.UkrImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getUkr()
	 * @generated
	 */
	int UKR = 152;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Ukr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UKR_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr0Impl <em>Vr0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr0Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getVr0()
	 * @generated
	 */
	int VR0 = 153;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Vr0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr0FImpl <em>Vr0 F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr0FImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getVr0F()
	 * @generated
	 */
	int VR0_F = 154;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Vr0 F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR0_F_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr1Impl <em>Vr1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getVr1()
	 * @generated
	 */
	int VR1 = 155;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Vr1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr12FImpl <em>Vr12 F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr12FImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getVr12F()
	 * @generated
	 */
	int VR12_F = 156;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Vr12 F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR12_F_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr1FImpl <em>Vr1 F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr1FImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getVr1F()
	 * @generated
	 */
	int VR1_F = 157;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Vr1 F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR1_F_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr2Impl <em>Vr2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getVr2()
	 * @generated
	 */
	int VR2 = 158;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Vr2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr2FImpl <em>Vr2 F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Vr2FImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getVr2F()
	 * @generated
	 */
	int VR2_F = 159;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Vr2 F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VR2_F_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn1Impl <em>Wn1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getWn1()
	 * @generated
	 */
	int WN1 = 160;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Wn1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn2Impl <em>Wn2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getWn2()
	 * @generated
	 */
	int WN2 = 161;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Wn2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn3Impl <em>Wn3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn3Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getWn3()
	 * @generated
	 */
	int WN3 = 162;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Wn3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN3_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn4Impl <em>Wn4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn4Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getWn4()
	 * @generated
	 */
	int WN4 = 163;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Wn4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN4_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn5Impl <em>Wn5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn5Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getWn5()
	 * @generated
	 */
	int WN5 = 164;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Wn5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN5_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn6Impl <em>Wn6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn6Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getWn6()
	 * @generated
	 */
	int WN6 = 165;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Wn6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN6_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn7Impl <em>Wn7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Wn7Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getWn7()
	 * @generated
	 */
	int WN7 = 166;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Wn7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN7_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.WvsImpl <em>Wvs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.WvsImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getWvs()
	 * @generated
	 */
	int WVS = 167;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Wvs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVS_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ZlOImpl <em>Zl O</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ZlOImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZlO()
	 * @generated
	 */
	int ZL_O = 168;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zl O</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_O_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ZlUImpl <em>Zl U</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.ZlUImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZlU()
	 * @generated
	 */
	int ZL_U = 169;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zl U</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZL_U_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp10Impl <em>Zp10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp10Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZp10()
	 * @generated
	 */
	int ZP10 = 170;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zp10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp10LsImpl <em>Zp10 Ls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp10LsImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZp10Ls()
	 * @generated
	 */
	int ZP10_LS = 171;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zp10 Ls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP10_LS_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp6Impl <em>Zp6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp6Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZp6()
	 * @generated
	 */
	int ZP6 = 172;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zp6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP6_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp7Impl <em>Zp7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp7Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZp7()
	 * @generated
	 */
	int ZP7 = 173;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zp7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP7_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp8Impl <em>Zp8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp8Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZp8()
	 * @generated
	 */
	int ZP8 = 174;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zp8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP8_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp9Impl <em>Zp9</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp9Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZp9()
	 * @generated
	 */
	int ZP9 = 175;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zp9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp9LsImpl <em>Zp9 Ls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zp9LsImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZp9Ls()
	 * @generated
	 */
	int ZP9_LS = 176;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zp9 Ls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZP9_LS_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs1Impl <em>Zs1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs1Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs1()
	 * @generated
	 */
	int ZS1 = 177;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs10Impl <em>Zs10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs10Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs10()
	 * @generated
	 */
	int ZS10 = 178;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS10_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs103Impl <em>Zs103</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs103Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs103()
	 * @generated
	 */
	int ZS103 = 179;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs103</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS103_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs12Impl <em>Zs12</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs12Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs12()
	 * @generated
	 */
	int ZS12 = 180;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS12_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs13Impl <em>Zs13</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs13Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs13()
	 * @generated
	 */
	int ZS13 = 181;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs13</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS13_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs1AImpl <em>Zs1 A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs1AImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs1A()
	 * @generated
	 */
	int ZS1_A = 182;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs1 A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS1_A_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs2Impl <em>Zs2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs2Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs2()
	 * @generated
	 */
	int ZS2 = 183;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs2vImpl <em>Zs2v</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs2vImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs2v()
	 * @generated
	 */
	int ZS2V = 184;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs2v</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS2V_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs3Impl <em>Zs3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs3Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs3()
	 * @generated
	 */
	int ZS3 = 185;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs3vImpl <em>Zs3v</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs3vImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs3v()
	 * @generated
	 */
	int ZS3V = 186;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs3v</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS3V_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs6Impl <em>Zs6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs6Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs6()
	 * @generated
	 */
	int ZS6 = 187;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS6_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs7Impl <em>Zs7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs7Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs7()
	 * @generated
	 */
	int ZS7 = 188;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS7_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs8Impl <em>Zs8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs8Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs8()
	 * @generated
	 */
	int ZS8 = 189;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs8AImpl <em>Zs8 A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs8AImpl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs8A()
	 * @generated
	 */
	int ZS8_A = 190;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs8 A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS8_A_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs9Impl <em>Zs9</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Zs9Impl
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getZs9()
	 * @generated
	 */
	int ZS9 = 191;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__SYMBOL = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__ANMERKUNGEN = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__BELEUCHTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__BESCHREIBUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__GELTUNGSBEREICH_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__GELTUNGSBEREICH_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__GELTUNGSBEREICH_SBAHN_B = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__GELTUNGSBEREICH_SBAHN_HH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__GUELTIG_AB = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__GUELTIG_BIS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__KURZBEZEICHNUNG_DS = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__KURZBEZEICHNUNG_DV = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__LANGBEZEICHNUNG = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__SCHALTBAR = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9__ZUSATZ_MOEGLICH = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH;

	/**
	 * The number of structural features of the '<em>Zs9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZS9_FEATURE_COUNT = Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolEl34Zusatz <em>ENUM Symbol El34 Zusatz</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolEl34Zusatz
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolEl34Zusatz()
	 * @generated
	 */
	int ENUM_SYMBOL_EL34_ZUSATZ = 192;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1 <em>ENUM Symbol Lf1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf1()
	 * @generated
	 */
	int ENUM_SYMBOL_LF1 = 193;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf12 <em>ENUM Symbol Lf12</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf12
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf12()
	 * @generated
	 */
	int ENUM_SYMBOL_LF12 = 194;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1Wdh <em>ENUM Symbol Lf1 Wdh</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1Wdh
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf1Wdh()
	 * @generated
	 */
	int ENUM_SYMBOL_LF1_WDH = 195;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DS <em>ENUM Symbol Lf4 DS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DS
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf4DS()
	 * @generated
	 */
	int ENUM_SYMBOL_LF4_DS = 196;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DV <em>ENUM Symbol Lf4 DV</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DV
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf4DV()
	 * @generated
	 */
	int ENUM_SYMBOL_LF4_DV = 197;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf6 <em>ENUM Symbol Lf6</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf6
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf6()
	 * @generated
	 */
	int ENUM_SYMBOL_LF6 = 198;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf7 <em>ENUM Symbol Lf7</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf7
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf7()
	 * @generated
	 */
	int ENUM_SYMBOL_LF7 = 199;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2 <em>ENUM Symbol Zs2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolZs2()
	 * @generated
	 */
	int ENUM_SYMBOL_ZS2 = 200;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2v <em>ENUM Symbol Zs2v</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2v
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolZs2v()
	 * @generated
	 */
	int ENUM_SYMBOL_ZS2V = 201;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3 <em>ENUM Symbol Zs3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolZs3()
	 * @generated
	 */
	int ENUM_SYMBOL_ZS3 = 202;

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3v <em>ENUM Symbol Zs3v</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3v
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolZs3v()
	 * @generated
	 */
	int ENUM_SYMBOL_ZS3V = 203;

	/**
	 * The meta object id for the '<em>BS Zusatz Symbol Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getBS_Zusatz_Symbol_Type()
	 * @generated
	 */
	int BS_ZUSATZ_SYMBOL_TYPE = 204;

	/**
	 * The meta object id for the '<em>ENUM Symbol El34 Zusatz Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolEl34Zusatz
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolEl34ZusatzObject()
	 * @generated
	 */
	int ENUM_SYMBOL_EL34_ZUSATZ_OBJECT = 205;

	/**
	 * The meta object id for the '<em>ENUM Symbol Lf12 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf12
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf12Object()
	 * @generated
	 */
	int ENUM_SYMBOL_LF12_OBJECT = 206;

	/**
	 * The meta object id for the '<em>ENUM Symbol Lf1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf1Object()
	 * @generated
	 */
	int ENUM_SYMBOL_LF1_OBJECT = 207;

	/**
	 * The meta object id for the '<em>ENUM Symbol Lf1 Wdh Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1Wdh
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf1WdhObject()
	 * @generated
	 */
	int ENUM_SYMBOL_LF1_WDH_OBJECT = 208;

	/**
	 * The meta object id for the '<em>ENUM Symbol Lf4 DS Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DS
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf4DSObject()
	 * @generated
	 */
	int ENUM_SYMBOL_LF4_DS_OBJECT = 209;

	/**
	 * The meta object id for the '<em>ENUM Symbol Lf4 DV Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DV
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf4DVObject()
	 * @generated
	 */
	int ENUM_SYMBOL_LF4_DV_OBJECT = 210;

	/**
	 * The meta object id for the '<em>ENUM Symbol Lf6 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf6
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf6Object()
	 * @generated
	 */
	int ENUM_SYMBOL_LF6_OBJECT = 211;

	/**
	 * The meta object id for the '<em>ENUM Symbol Lf7 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf7
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolLf7Object()
	 * @generated
	 */
	int ENUM_SYMBOL_LF7_OBJECT = 212;

	/**
	 * The meta object id for the '<em>ENUM Symbol Zs2 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolZs2Object()
	 * @generated
	 */
	int ENUM_SYMBOL_ZS2_OBJECT = 213;

	/**
	 * The meta object id for the '<em>ENUM Symbol Zs2v Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2v
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolZs2vObject()
	 * @generated
	 */
	int ENUM_SYMBOL_ZS2V_OBJECT = 214;

	/**
	 * The meta object id for the '<em>ENUM Symbol Zs3 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolZs3Object()
	 * @generated
	 */
	int ENUM_SYMBOL_ZS3_OBJECT = 215;

	/**
	 * The meta object id for the '<em>ENUM Symbol Zs3v Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3v
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getENUMSymbolZs3vObject()
	 * @generated
	 */
	int ENUM_SYMBOL_ZS3V_OBJECT = 216;

	/**
	 * The meta object id for the '<em>Oz Zugl Symbol Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl#getOz_Zugl_Symbol_Type()
	 * @generated
	 */
	int OZ_ZUGL_SYMBOL_TYPE = 217;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BSVAUES <em>BSVAUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSVAUES</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BSVAUES
	 * @generated
	 */
	EClass getBSVAUES();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BSVRVA <em>BSVRVA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSVRVA</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BSVRVA
	 * @generated
	 */
	EClass getBSVRVA();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BSWdh <em>BS Wdh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BS Wdh</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BSWdh
	 * @generated
	 */
	EClass getBSWdh();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BSZBSBer <em>BSZBS Ber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSZBS Ber</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BSZBSBer
	 * @generated
	 */
	EClass getBSZBSBer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BSZusatz <em>BS Zusatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BS Zusatz</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BSZusatz
	 * @generated
	 */
	EClass getBSZusatz();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue00Lp <em>Bue00 Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue00 Lp</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue00Lp
	 * @generated
	 */
	EClass getBue00Lp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue01Lp <em>Bue01 Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue01 Lp</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue01Lp
	 * @generated
	 */
	EClass getBue01Lp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue01S <em>Bue01 S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue01 S</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue01S
	 * @generated
	 */
	EClass getBue01S();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue02Lp <em>Bue02 Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue02 Lp</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue02Lp
	 * @generated
	 */
	EClass getBue02Lp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue02S <em>Bue02 S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue02 S</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue02S
	 * @generated
	 */
	EClass getBue02S();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue10LpBli <em>Bue10 Lp Bli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue10 Lp Bli</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue10LpBli
	 * @generated
	 */
	EClass getBue10LpBli();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue11LpBli <em>Bue11 Lp Bli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue11 Lp Bli</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue11LpBli
	 * @generated
	 */
	EClass getBue11LpBli();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue11SBli <em>Bue11 SBli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue11 SBli</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue11SBli
	 * @generated
	 */
	EClass getBue11SBli();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue12LpSt <em>Bue12 Lp St</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue12 Lp St</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue12LpSt
	 * @generated
	 */
	EClass getBue12LpSt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue12SSt <em>Bue12 SSt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue12 SSt</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue12SSt
	 * @generated
	 */
	EClass getBue12SSt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue2 <em>Bue2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue2
	 * @generated
	 */
	EClass getBue2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue21R <em>Bue21 R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue21 R</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue21R
	 * @generated
	 */
	EClass getBue21R();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue22R <em>Bue22 R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue22 R</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue22R
	 * @generated
	 */
	EClass getBue22R();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue23R <em>Bue23 R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue23 R</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue23R
	 * @generated
	 */
	EClass getBue23R();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue3 <em>Bue3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue3</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue3
	 * @generated
	 */
	EClass getBue3();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue4 <em>Bue4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue4</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue4
	 * @generated
	 */
	EClass getBue4();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue5 <em>Bue5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue5</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Bue5
	 * @generated
	 */
	EClass getBue5();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BueAT <em>Bue AT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue AT</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BueAT
	 * @generated
	 */
	EClass getBueAT();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BueATZusatz <em>Bue AT Zusatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue AT Zusatz</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BueATZusatz
	 * @generated
	 */
	EClass getBueATZusatz();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BueKT <em>Bue KT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bue KT</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.BueKT
	 * @generated
	 */
	EClass getBueKT();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El1 <em>El1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El1
	 * @generated
	 */
	EClass getEl1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El1v <em>El1v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El1v</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El1v
	 * @generated
	 */
	EClass getEl1v();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El2 <em>El2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El2
	 * @generated
	 */
	EClass getEl2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El3 <em>El3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El3</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El3
	 * @generated
	 */
	EClass getEl3();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El34Zusatz <em>El34 Zusatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El34 Zusatz</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El34Zusatz
	 * @generated
	 */
	EClass getEl34Zusatz();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El34ZusatzKombi <em>El34 Zusatz Kombi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El34 Zusatz Kombi</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El34ZusatzKombi
	 * @generated
	 */
	EClass getEl34ZusatzKombi();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El4 <em>El4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El4</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El4
	 * @generated
	 */
	EClass getEl4();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El5 <em>El5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El5</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El5
	 * @generated
	 */
	EClass getEl5();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El6 <em>El6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El6</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El6
	 * @generated
	 */
	EClass getEl6();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ElPfB <em>El Pf B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El Pf B</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ElPfB
	 * @generated
	 */
	EClass getElPfB();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ElPfL <em>El Pf L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El Pf L</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ElPfL
	 * @generated
	 */
	EClass getElPfL();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ElPfO <em>El Pf O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El Pf O</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ElPfO
	 * @generated
	 */
	EClass getElPfO();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ElPfR <em>El Pf R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El Pf R</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ElPfR
	 * @generated
	 */
	EClass getElPfR();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ElTAC <em>El TAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El TAC</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ElTAC
	 * @generated
	 */
	EClass getElTAC();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ElTDC <em>El TDC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El TDC</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ElTDC
	 * @generated
	 */
	EClass getElTDC();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl1 <em>Hl1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl1
	 * @generated
	 */
	EClass getHl1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl10 <em>Hl10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl10</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl10
	 * @generated
	 */
	EClass getHl10();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl11 <em>Hl11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl11</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl11
	 * @generated
	 */
	EClass getHl11();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl12a <em>Hl12a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl12a</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl12a
	 * @generated
	 */
	EClass getHl12a();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl12b <em>Hl12b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl12b</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl12b
	 * @generated
	 */
	EClass getHl12b();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl2 <em>Hl2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl2
	 * @generated
	 */
	EClass getHl2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl3a <em>Hl3a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl3a</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl3a
	 * @generated
	 */
	EClass getHl3a();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl3b <em>Hl3b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl3b</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl3b
	 * @generated
	 */
	EClass getHl3b();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl4 <em>Hl4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl4</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl4
	 * @generated
	 */
	EClass getHl4();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl5 <em>Hl5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl5</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl5
	 * @generated
	 */
	EClass getHl5();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl6a <em>Hl6a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl6a</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl6a
	 * @generated
	 */
	EClass getHl6a();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl6b <em>Hl6b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl6b</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl6b
	 * @generated
	 */
	EClass getHl6b();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl7 <em>Hl7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl7</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl7
	 * @generated
	 */
	EClass getHl7();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl8 <em>Hl8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl8</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl8
	 * @generated
	 */
	EClass getHl8();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl9a <em>Hl9a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl9a</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl9a
	 * @generated
	 */
	EClass getHl9a();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl9b <em>Hl9b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hl9b</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl9b
	 * @generated
	 */
	EClass getHl9b();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp0 <em>Hp0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp0</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp0
	 * @generated
	 */
	EClass getHp0();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp02Lp <em>Hp02 Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp02 Lp</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp02Lp
	 * @generated
	 */
	EClass getHp02Lp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp0F <em>Hp0 F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp0 F</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp0F
	 * @generated
	 */
	EClass getHp0F();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp1 <em>Hp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp1
	 * @generated
	 */
	EClass getHp1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp1F <em>Hp1 F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp1 F</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp1F
	 * @generated
	 */
	EClass getHp1F();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp2 <em>Hp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp2
	 * @generated
	 */
	EClass getHp2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp2F <em>Hp2 F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp2 F</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hp2F
	 * @generated
	 */
	EClass getHp2F();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Kl <em>Kl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kl</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Kl
	 * @generated
	 */
	EClass getKl();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ks1 <em>Ks1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ks1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ks1
	 * @generated
	 */
	EClass getKs1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ks2 <em>Ks2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ks2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ks2
	 * @generated
	 */
	EClass getKs2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf1 <em>Lf1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lf1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf1
	 * @generated
	 */
	EClass getLf1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf12 <em>Lf12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lf12</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf12
	 * @generated
	 */
	EClass getLf12();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf1Wdh <em>Lf1 Wdh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lf1 Wdh</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf1Wdh
	 * @generated
	 */
	EClass getLf1Wdh();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf2 <em>Lf2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lf2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf2
	 * @generated
	 */
	EClass getLf2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf3 <em>Lf3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lf3</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf3
	 * @generated
	 */
	EClass getLf3();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf4DS <em>Lf4 DS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lf4 DS</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf4DS
	 * @generated
	 */
	EClass getLf4DS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf4DV <em>Lf4 DV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lf4 DV</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf4DV
	 * @generated
	 */
	EClass getLf4DV();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf5DS <em>Lf5 DS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lf5 DS</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf5DS
	 * @generated
	 */
	EClass getLf5DS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf5DV <em>Lf5 DV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lf5 DV</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf5DV
	 * @generated
	 */
	EClass getLf5DV();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf6 <em>Lf6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lf6</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf6
	 * @generated
	 */
	EClass getLf6();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf7 <em>Lf7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lf7</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Lf7
	 * @generated
	 */
	EClass getLf7();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.LfPfL <em>Lf Pf L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lf Pf L</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.LfPfL
	 * @generated
	 */
	EClass getLfPfL();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.LfPfR <em>Lf Pf R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lf Pf R</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.LfPfR
	 * @generated
	 */
	EClass getLfPfR();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsGeD <em>Ms Ge D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ms Ge D</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsGeD
	 * @generated
	 */
	EClass getMsGeD();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsRt <em>Ms Rt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ms Rt</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsRt
	 * @generated
	 */
	EClass getMsRt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsSkGe <em>Ms Sk Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ms Sk Ge</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsSkGe
	 * @generated
	 */
	EClass getMsSkGe();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsSkRt <em>Ms Sk Rt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ms Sk Rt</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsSkRt
	 * @generated
	 */
	EClass getMsSkRt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsUESWdh <em>Ms UES Wdh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ms UES Wdh</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsUESWdh
	 * @generated
	 */
	EClass getMsUESWdh();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsVw <em>Ms Vw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ms Vw</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsVw
	 * @generated
	 */
	EClass getMsVw();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsWs2swP <em>Ms Ws2sw P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ms Ws2sw P</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsWs2swP
	 * @generated
	 */
	EClass getMsWs2swP();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsWsGeWs <em>Ms Ws Ge Ws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ms Ws Ge Ws</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsWsGeWs
	 * @generated
	 */
	EClass getMsWsGeWs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsWsRtWs <em>Ms Ws Rt Ws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ms Ws Rt Ws</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsWsRtWs
	 * @generated
	 */
	EClass getMsWsRtWs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsWsSwWs <em>Ms Ws Sw Ws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ms Ws Sw Ws</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.MsWsSwWs
	 * @generated
	 */
	EClass getMsWsSwWs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne1 <em>Ne1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne1
	 * @generated
	 */
	EClass getNe1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne12 <em>Ne12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne12</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne12
	 * @generated
	 */
	EClass getNe12();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne13a <em>Ne13a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne13a</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne13a
	 * @generated
	 */
	EClass getNe13a();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne13b <em>Ne13b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne13b</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne13b
	 * @generated
	 */
	EClass getNe13b();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne14 <em>Ne14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne14</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne14
	 * @generated
	 */
	EClass getNe14();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne2 <em>Ne2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne2
	 * @generated
	 */
	EClass getNe2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne2VRVA <em>Ne2 VRVA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne2 VRVA</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne2VRVA
	 * @generated
	 */
	EClass getNe2VRVA();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne31str <em>Ne31str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne31str</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne31str
	 * @generated
	 */
	EClass getNe31str();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne32str <em>Ne32str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne32str</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne32str
	 * @generated
	 */
	EClass getNe32str();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne33str <em>Ne33str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne33str</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne33str
	 * @generated
	 */
	EClass getNe33str();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne34str <em>Ne34str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne34str</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne34str
	 * @generated
	 */
	EClass getNe34str();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne35str <em>Ne35str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne35str</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne35str
	 * @generated
	 */
	EClass getNe35str();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne4 <em>Ne4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne4</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne4
	 * @generated
	 */
	EClass getNe4();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne5 <em>Ne5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne5</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne5
	 * @generated
	 */
	EClass getNe5();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne6 <em>Ne6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne6</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne6
	 * @generated
	 */
	EClass getNe6();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne7a <em>Ne7a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne7a</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne7a
	 * @generated
	 */
	EClass getNe7a();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne7b <em>Ne7b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ne7b</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ne7b
	 * @generated
	 */
	EClass getNe7b();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzAutoET <em>Oz Auto ET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz Auto ET</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzAutoET
	 * @generated
	 */
	EClass getOzAutoET();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzAutoHET <em>Oz Auto HET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz Auto HET</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzAutoHET
	 * @generated
	 */
	EClass getOzAutoHET();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzBk <em>Oz Bk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz Bk</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzBk
	 * @generated
	 */
	EClass getOzBk();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzET <em>Oz ET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz ET</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzET
	 * @generated
	 */
	EClass getOzET();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzFa <em>Oz Fa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz Fa</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzFa
	 * @generated
	 */
	EClass getOzFa();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzFak <em>Oz Fak</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz Fak</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzFak
	 * @generated
	 */
	EClass getOzFak();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzGSMR <em>Oz GSMR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz GSMR</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzGSMR
	 * @generated
	 */
	EClass getOzGSMR();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzHET <em>Oz HET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz HET</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzHET
	 * @generated
	 */
	EClass getOzHET();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzHM <em>Oz HM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz HM</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzHM
	 * @generated
	 */
	EClass getOzHM();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzICE <em>Oz ICE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz ICE</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzICE
	 * @generated
	 */
	EClass getOzICE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzLZBBer <em>Oz LZB Ber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz LZB Ber</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzLZBBer
	 * @generated
	 */
	EClass getOzLZBBer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzOBGrenze <em>Oz OB Grenze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz OB Grenze</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzOBGrenze
	 * @generated
	 */
	EClass getOzOBGrenze();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzPZB2000Hz <em>Oz PZB2000 Hz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz PZB2000 Hz</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzPZB2000Hz
	 * @generated
	 */
	EClass getOzPZB2000Hz();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzPZBBUE <em>Oz PZBBUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz PZBBUE</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzPZBBUE
	 * @generated
	 */
	EClass getOzPZBBUE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzZf <em>Oz Zf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz Zf</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzZf
	 * @generated
	 */
	EClass getOzZf();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzZugl <em>Oz Zugl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oz Zugl</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzZugl
	 * @generated
	 */
	EClass getOzZugl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzZugl#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzZugl#getSymbol()
	 * @see #getOzZugl()
	 * @generated
	 */
	EAttribute getOzZugl_Symbol();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Pf2 <em>Pf2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pf2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Pf2
	 * @generated
	 */
	EClass getPf2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ra10 <em>Ra10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ra10</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ra10
	 * @generated
	 */
	EClass getRa10();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ra11 <em>Ra11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ra11</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ra11
	 * @generated
	 */
	EClass getRa11();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ra11b <em>Ra11b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ra11b</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ra11b
	 * @generated
	 */
	EClass getRa11b();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ra12 <em>Ra12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ra12</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ra12
	 * @generated
	 */
	EClass getRa12();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ra13 <em>Ra13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ra13</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ra13
	 * @generated
	 */
	EClass getRa13();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sh0 <em>Sh0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sh0</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sh0
	 * @generated
	 */
	EClass getSh0();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sh1 <em>Sh1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sh1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sh1
	 * @generated
	 */
	EClass getSh1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sh2 <em>Sh2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sh2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sh2
	 * @generated
	 */
	EClass getSh2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sk1 <em>Sk1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sk1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sk1
	 * @generated
	 */
	EClass getSk1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sk2 <em>Sk2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sk2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sk2
	 * @generated
	 */
	EClass getSk2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So1 <em>So1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So1
	 * @generated
	 */
	EClass getSo1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So106 <em>So106</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So106</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So106
	 * @generated
	 */
	EClass getSo106();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So14 <em>So14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So14</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So14
	 * @generated
	 */
	EClass getSo14();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So15 <em>So15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So15</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So15
	 * @generated
	 */
	EClass getSo15();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So191P <em>So191 P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So191 P</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So191P
	 * @generated
	 */
	EClass getSo191P();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So192P <em>So192 P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So192 P</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So192P
	 * @generated
	 */
	EClass getSo192P();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So193P <em>So193 P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So193 P</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So193P
	 * @generated
	 */
	EClass getSo193P();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So20 <em>So20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So20</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.So20
	 * @generated
	 */
	EClass getSo20();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv0 <em>Sv0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv0</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv0
	 * @generated
	 */
	EClass getSv0();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv1 <em>Sv1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv1
	 * @generated
	 */
	EClass getSv1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv2 <em>Sv2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv2
	 * @generated
	 */
	EClass getSv2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv3 <em>Sv3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv3</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv3
	 * @generated
	 */
	EClass getSv3();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv4 <em>Sv4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv4</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv4
	 * @generated
	 */
	EClass getSv4();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv5 <em>Sv5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv5</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv5
	 * @generated
	 */
	EClass getSv5();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv6 <em>Sv6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv6</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Sv6
	 * @generated
	 */
	EClass getSv6();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.SvWPf <em>Sv WPf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv WPf</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.SvWPf
	 * @generated
	 */
	EClass getSvWPf();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ts1 <em>Ts1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ts1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ts1
	 * @generated
	 */
	EClass getTs1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ts2 <em>Ts2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ts2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ts2
	 * @generated
	 */
	EClass getTs2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ts3 <em>Ts3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ts3</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ts3
	 * @generated
	 */
	EClass getTs3();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ukr <em>Ukr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ukr</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Ukr
	 * @generated
	 */
	EClass getUkr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr0 <em>Vr0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vr0</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr0
	 * @generated
	 */
	EClass getVr0();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr0F <em>Vr0 F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vr0 F</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr0F
	 * @generated
	 */
	EClass getVr0F();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr1 <em>Vr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vr1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr1
	 * @generated
	 */
	EClass getVr1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr12F <em>Vr12 F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vr12 F</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr12F
	 * @generated
	 */
	EClass getVr12F();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr1F <em>Vr1 F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vr1 F</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr1F
	 * @generated
	 */
	EClass getVr1F();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr2 <em>Vr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vr2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr2
	 * @generated
	 */
	EClass getVr2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr2F <em>Vr2 F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vr2 F</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr2F
	 * @generated
	 */
	EClass getVr2F();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn1 <em>Wn1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wn1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn1
	 * @generated
	 */
	EClass getWn1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn2 <em>Wn2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wn2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn2
	 * @generated
	 */
	EClass getWn2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn3 <em>Wn3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wn3</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn3
	 * @generated
	 */
	EClass getWn3();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn4 <em>Wn4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wn4</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn4
	 * @generated
	 */
	EClass getWn4();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn5 <em>Wn5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wn5</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn5
	 * @generated
	 */
	EClass getWn5();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn6 <em>Wn6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wn6</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn6
	 * @generated
	 */
	EClass getWn6();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn7 <em>Wn7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wn7</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wn7
	 * @generated
	 */
	EClass getWn7();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wvs <em>Wvs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wvs</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Wvs
	 * @generated
	 */
	EClass getWvs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ZlO <em>Zl O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zl O</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ZlO
	 * @generated
	 */
	EClass getZlO();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ZlU <em>Zl U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zl U</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ZlU
	 * @generated
	 */
	EClass getZlU();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp10 <em>Zp10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zp10</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp10
	 * @generated
	 */
	EClass getZp10();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp10Ls <em>Zp10 Ls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zp10 Ls</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp10Ls
	 * @generated
	 */
	EClass getZp10Ls();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp6 <em>Zp6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zp6</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp6
	 * @generated
	 */
	EClass getZp6();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp7 <em>Zp7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zp7</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp7
	 * @generated
	 */
	EClass getZp7();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp8 <em>Zp8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zp8</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp8
	 * @generated
	 */
	EClass getZp8();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp9 <em>Zp9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zp9</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp9
	 * @generated
	 */
	EClass getZp9();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp9Ls <em>Zp9 Ls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zp9 Ls</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp9Ls
	 * @generated
	 */
	EClass getZp9Ls();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs1 <em>Zs1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs1
	 * @generated
	 */
	EClass getZs1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs10 <em>Zs10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs10</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs10
	 * @generated
	 */
	EClass getZs10();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs103 <em>Zs103</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs103</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs103
	 * @generated
	 */
	EClass getZs103();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs12 <em>Zs12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs12</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs12
	 * @generated
	 */
	EClass getZs12();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs13 <em>Zs13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs13</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs13
	 * @generated
	 */
	EClass getZs13();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs1A <em>Zs1 A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs1 A</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs1A
	 * @generated
	 */
	EClass getZs1A();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs2 <em>Zs2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs2
	 * @generated
	 */
	EClass getZs2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs2v <em>Zs2v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs2v</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs2v
	 * @generated
	 */
	EClass getZs2v();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs3 <em>Zs3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs3</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs3
	 * @generated
	 */
	EClass getZs3();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs3v <em>Zs3v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs3v</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs3v
	 * @generated
	 */
	EClass getZs3v();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs6 <em>Zs6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs6</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs6
	 * @generated
	 */
	EClass getZs6();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs7 <em>Zs7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs7</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs7
	 * @generated
	 */
	EClass getZs7();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs8 <em>Zs8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs8</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs8
	 * @generated
	 */
	EClass getZs8();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs8A <em>Zs8 A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs8 A</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs8A
	 * @generated
	 */
	EClass getZs8A();

	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs9 <em>Zs9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zs9</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zs9
	 * @generated
	 */
	EClass getZs9();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolEl34Zusatz <em>ENUM Symbol El34 Zusatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Symbol El34 Zusatz</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolEl34Zusatz
	 * @generated
	 */
	EEnum getENUMSymbolEl34Zusatz();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1 <em>ENUM Symbol Lf1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Symbol Lf1</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1
	 * @generated
	 */
	EEnum getENUMSymbolLf1();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf12 <em>ENUM Symbol Lf12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Symbol Lf12</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf12
	 * @generated
	 */
	EEnum getENUMSymbolLf12();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1Wdh <em>ENUM Symbol Lf1 Wdh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Symbol Lf1 Wdh</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1Wdh
	 * @generated
	 */
	EEnum getENUMSymbolLf1Wdh();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DS <em>ENUM Symbol Lf4 DS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Symbol Lf4 DS</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DS
	 * @generated
	 */
	EEnum getENUMSymbolLf4DS();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DV <em>ENUM Symbol Lf4 DV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Symbol Lf4 DV</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DV
	 * @generated
	 */
	EEnum getENUMSymbolLf4DV();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf6 <em>ENUM Symbol Lf6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Symbol Lf6</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf6
	 * @generated
	 */
	EEnum getENUMSymbolLf6();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf7 <em>ENUM Symbol Lf7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Symbol Lf7</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf7
	 * @generated
	 */
	EEnum getENUMSymbolLf7();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2 <em>ENUM Symbol Zs2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Symbol Zs2</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2
	 * @generated
	 */
	EEnum getENUMSymbolZs2();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2v <em>ENUM Symbol Zs2v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Symbol Zs2v</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2v
	 * @generated
	 */
	EEnum getENUMSymbolZs2v();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3 <em>ENUM Symbol Zs3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Symbol Zs3</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3
	 * @generated
	 */
	EEnum getENUMSymbolZs3();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3v <em>ENUM Symbol Zs3v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENUM Symbol Zs3v</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3v
	 * @generated
	 */
	EEnum getENUMSymbolZs3v();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>BS Zusatz Symbol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BS Zusatz Symbol Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TBS_Zusatz_Symbol' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='.{1,30}'"
	 * @generated
	 */
	EDataType getBS_Zusatz_Symbol_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolEl34Zusatz <em>ENUM Symbol El34 Zusatz Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Symbol El34 Zusatz Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolEl34Zusatz
	 * @model instanceClass="org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolEl34Zusatz"
	 *        extendedMetaData="name='ENUMSymbol_El_3_4_Zusatz:Object' baseType='ENUMSymbol_El_3_4_Zusatz'"
	 * @generated
	 */
	EDataType getENUMSymbolEl34ZusatzObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf12 <em>ENUM Symbol Lf12 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Symbol Lf12 Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf12
	 * @model instanceClass="org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf12"
	 *        extendedMetaData="name='ENUMSymbol_Lf_1_2:Object' baseType='ENUMSymbol_Lf_1_2'"
	 * @generated
	 */
	EDataType getENUMSymbolLf12Object();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1 <em>ENUM Symbol Lf1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Symbol Lf1 Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1
	 * @model instanceClass="org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1"
	 *        extendedMetaData="name='ENUMSymbol_Lf_1:Object' baseType='ENUMSymbol_Lf_1'"
	 * @generated
	 */
	EDataType getENUMSymbolLf1Object();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1Wdh <em>ENUM Symbol Lf1 Wdh Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Symbol Lf1 Wdh Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1Wdh
	 * @model instanceClass="org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf1Wdh"
	 *        extendedMetaData="name='ENUMSymbol_Lf_1_Wdh:Object' baseType='ENUMSymbol_Lf_1_Wdh'"
	 * @generated
	 */
	EDataType getENUMSymbolLf1WdhObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DS <em>ENUM Symbol Lf4 DS Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Symbol Lf4 DS Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DS
	 * @model instanceClass="org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DS"
	 *        extendedMetaData="name='ENUMSymbol_Lf_4_DS:Object' baseType='ENUMSymbol_Lf_4_DS'"
	 * @generated
	 */
	EDataType getENUMSymbolLf4DSObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DV <em>ENUM Symbol Lf4 DV Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Symbol Lf4 DV Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DV
	 * @model instanceClass="org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf4DV"
	 *        extendedMetaData="name='ENUMSymbol_Lf_4_DV:Object' baseType='ENUMSymbol_Lf_4_DV'"
	 * @generated
	 */
	EDataType getENUMSymbolLf4DVObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf6 <em>ENUM Symbol Lf6 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Symbol Lf6 Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf6
	 * @model instanceClass="org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf6"
	 *        extendedMetaData="name='ENUMSymbol_Lf_6:Object' baseType='ENUMSymbol_Lf_6'"
	 * @generated
	 */
	EDataType getENUMSymbolLf6Object();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf7 <em>ENUM Symbol Lf7 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Symbol Lf7 Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf7
	 * @model instanceClass="org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolLf7"
	 *        extendedMetaData="name='ENUMSymbol_Lf_7:Object' baseType='ENUMSymbol_Lf_7'"
	 * @generated
	 */
	EDataType getENUMSymbolLf7Object();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2 <em>ENUM Symbol Zs2 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Symbol Zs2 Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2
	 * @model instanceClass="org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2"
	 *        extendedMetaData="name='ENUMSymbol_Zs_2:Object' baseType='ENUMSymbol_Zs_2'"
	 * @generated
	 */
	EDataType getENUMSymbolZs2Object();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2v <em>ENUM Symbol Zs2v Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Symbol Zs2v Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2v
	 * @model instanceClass="org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs2v"
	 *        extendedMetaData="name='ENUMSymbol_Zs_2v:Object' baseType='ENUMSymbol_Zs_2v'"
	 * @generated
	 */
	EDataType getENUMSymbolZs2vObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3 <em>ENUM Symbol Zs3 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Symbol Zs3 Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3
	 * @model instanceClass="org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3"
	 *        extendedMetaData="name='ENUMSymbol_Zs_3:Object' baseType='ENUMSymbol_Zs_3'"
	 * @generated
	 */
	EDataType getENUMSymbolZs3Object();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3v <em>ENUM Symbol Zs3v Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENUM Symbol Zs3v Object</em>'.
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3v
	 * @model instanceClass="org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.ENUMSymbolZs3v"
	 *        extendedMetaData="name='ENUMSymbol_Zs_3v:Object' baseType='ENUMSymbol_Zs_3v'"
	 * @generated
	 */
	EDataType getENUMSymbolZs3vObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oz Zugl Symbol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Oz Zugl Symbol Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TOz_Zugl_Symbol' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='.{1,30}'"
	 * @generated
	 */
	EDataType getOz_Zugl_Symbol_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Signalbegriffe_Ril_301Factory getSignalbegriffe_Ril_301Factory();

} //Signalbegriffe_Ril_301Package
