/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Signalbegriffe_Struktur;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriffe_StrukturFactory
 * @model kind="package"
 * @generated
 */
public interface Signalbegriffe_StrukturPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Signalbegriffe_Struktur";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plan-pro.org/modell/Signalbegriffe_Struktur/1.6.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nsSignalbegriffe_Struktur";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Signalbegriffe_StrukturPackage eINSTANCE = org.eclipse.set.model.model11001.Signalbegriffe_Struktur.impl.Signalbegriffe_StrukturPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl <em>Signalbegriff ID Type Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.impl.Signalbegriffe_StrukturPackageImpl#getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL = 0;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN = 1;

	/**
	 * The feature id for the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR = 2;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG = 3;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS = 4;

	/**
	 * The feature id for the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV = 5;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B = 6;

	/**
	 * The feature id for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH = 7;

	/**
	 * The feature id for the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB = 8;

	/**
	 * The feature id for the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS = 9;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS = 10;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV = 11;

	/**
	 * The feature id for the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG = 12;

	/**
	 * The feature id for the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR = 13;

	/**
	 * The feature id for the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH = 14;

	/**
	 * The number of structural features of the '<em>Signalbegriff ID Type Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNALBEGRIFF_ID_TYPE_CLASS_FEATURE_COUNT = 15;


	/**
	 * Returns the meta object for class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass <em>Signalbegriff ID Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signalbegriff ID Type Class</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass
	 * @generated
	 */
	EClass getSignalbegriff_ID_TypeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getSymbol()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getAnmerkungen <em>Anmerkungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anmerkungen</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getAnmerkungen()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_Anmerkungen();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isBeleuchtbar <em>Beleuchtbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beleuchtbar</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isBeleuchtbar()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_Beleuchtbar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getBeschreibung()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_Beschreibung();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichDS <em>Geltungsbereich DS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geltungsbereich DS</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichDS()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_GeltungsbereichDS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichDV <em>Geltungsbereich DV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geltungsbereich DV</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichDV()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_GeltungsbereichDV();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichSBahnB <em>Geltungsbereich SBahn B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geltungsbereich SBahn B</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichSBahnB()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnB();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichSBahnHH <em>Geltungsbereich SBahn HH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geltungsbereich SBahn HH</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichSBahnHH()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnHH();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getGueltigAb <em>Gueltig Ab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gueltig Ab</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getGueltigAb()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_GueltigAb();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getGueltigBis <em>Gueltig Bis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gueltig Bis</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getGueltigBis()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_GueltigBis();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getKurzbezeichnungDS <em>Kurzbezeichnung DS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kurzbezeichnung DS</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getKurzbezeichnungDS()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_KurzbezeichnungDS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getKurzbezeichnungDV <em>Kurzbezeichnung DV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kurzbezeichnung DV</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getKurzbezeichnungDV()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_KurzbezeichnungDV();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getLangbezeichnung <em>Langbezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Langbezeichnung</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getLangbezeichnung()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_Langbezeichnung();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isSchaltbar <em>Schaltbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schaltbar</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isSchaltbar()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_Schaltbar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isZusatzMoeglich <em>Zusatz Moeglich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusatz Moeglich</em>'.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isZusatzMoeglich()
	 * @see #getSignalbegriff_ID_TypeClass()
	 * @generated
	 */
	EAttribute getSignalbegriff_ID_TypeClass_ZusatzMoeglich();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Signalbegriffe_StrukturFactory getSignalbegriffe_StrukturFactory();

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
		 * The meta object literal for the '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl <em>Signalbegriff ID Type Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl
		 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.impl.Signalbegriffe_StrukturPackageImpl#getSignalbegriff_ID_TypeClass()
		 * @generated
		 */
		EClass SIGNALBEGRIFF_ID_TYPE_CLASS = eINSTANCE.getSignalbegriff_ID_TypeClass();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL = eINSTANCE.getSignalbegriff_ID_TypeClass_Symbol();

		/**
		 * The meta object literal for the '<em><b>Anmerkungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN = eINSTANCE.getSignalbegriff_ID_TypeClass_Anmerkungen();

		/**
		 * The meta object literal for the '<em><b>Beleuchtbar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR = eINSTANCE.getSignalbegriff_ID_TypeClass_Beleuchtbar();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG = eINSTANCE.getSignalbegriff_ID_TypeClass_Beschreibung();

		/**
		 * The meta object literal for the '<em><b>Geltungsbereich DS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS = eINSTANCE.getSignalbegriff_ID_TypeClass_GeltungsbereichDS();

		/**
		 * The meta object literal for the '<em><b>Geltungsbereich DV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV = eINSTANCE.getSignalbegriff_ID_TypeClass_GeltungsbereichDV();

		/**
		 * The meta object literal for the '<em><b>Geltungsbereich SBahn B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B = eINSTANCE.getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnB();

		/**
		 * The meta object literal for the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH = eINSTANCE.getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnHH();

		/**
		 * The meta object literal for the '<em><b>Gueltig Ab</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB = eINSTANCE.getSignalbegriff_ID_TypeClass_GueltigAb();

		/**
		 * The meta object literal for the '<em><b>Gueltig Bis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS = eINSTANCE.getSignalbegriff_ID_TypeClass_GueltigBis();

		/**
		 * The meta object literal for the '<em><b>Kurzbezeichnung DS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS = eINSTANCE.getSignalbegriff_ID_TypeClass_KurzbezeichnungDS();

		/**
		 * The meta object literal for the '<em><b>Kurzbezeichnung DV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV = eINSTANCE.getSignalbegriff_ID_TypeClass_KurzbezeichnungDV();

		/**
		 * The meta object literal for the '<em><b>Langbezeichnung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG = eINSTANCE.getSignalbegriff_ID_TypeClass_Langbezeichnung();

		/**
		 * The meta object literal for the '<em><b>Schaltbar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR = eINSTANCE.getSignalbegriff_ID_TypeClass_Schaltbar();

		/**
		 * The meta object literal for the '<em><b>Zusatz Moeglich</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH = eINSTANCE.getSignalbegriff_ID_TypeClass_ZusatzMoeglich();

	}

} //Signalbegriffe_StrukturPackage
