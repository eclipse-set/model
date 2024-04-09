/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass;
import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signalbegriff ID Type Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#getAnmerkungen <em>Anmerkungen</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#isBeleuchtbar <em>Beleuchtbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#isGeltungsbereichDS <em>Geltungsbereich DS</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#isGeltungsbereichDV <em>Geltungsbereich DV</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#isGeltungsbereichSBahnB <em>Geltungsbereich SBahn B</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#isGeltungsbereichSBahnHH <em>Geltungsbereich SBahn HH</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#getGueltigAb <em>Gueltig Ab</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#getGueltigBis <em>Gueltig Bis</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#getKurzbezeichnungDS <em>Kurzbezeichnung DS</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#getKurzbezeichnungDV <em>Kurzbezeichnung DV</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#getLangbezeichnung <em>Langbezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#isSchaltbar <em>Schaltbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl#isZusatzMoeglich <em>Zusatz Moeglich</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Signalbegriff_ID_TypeClassImpl extends EObjectImpl implements Signalbegriff_ID_TypeClass {
	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnmerkungen() <em>Anmerkungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnmerkungen()
	 * @generated
	 * @ordered
	 */
	protected static final String ANMERKUNGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnmerkungen() <em>Anmerkungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnmerkungen()
	 * @generated
	 * @ordered
	 */
	protected String anmerkungen = ANMERKUNGEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isBeleuchtbar() <em>Beleuchtbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeleuchtbar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BELEUCHTBAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBeleuchtbar() <em>Beleuchtbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeleuchtbar()
	 * @generated
	 * @ordered
	 */
	protected boolean beleuchtbar = BELEUCHTBAR_EDEFAULT;

	/**
	 * This is true if the Beleuchtbar attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean beleuchtbarESet;

	/**
	 * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected static final String BESCHREIBUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected String beschreibung = BESCHREIBUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #isGeltungsbereichDS() <em>Geltungsbereich DS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeltungsbereichDS()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GELTUNGSBEREICH_DS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeltungsbereichDS() <em>Geltungsbereich DS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeltungsbereichDS()
	 * @generated
	 * @ordered
	 */
	protected boolean geltungsbereichDS = GELTUNGSBEREICH_DS_EDEFAULT;

	/**
	 * This is true if the Geltungsbereich DS attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geltungsbereichDSESet;

	/**
	 * The default value of the '{@link #isGeltungsbereichDV() <em>Geltungsbereich DV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeltungsbereichDV()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GELTUNGSBEREICH_DV_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeltungsbereichDV() <em>Geltungsbereich DV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeltungsbereichDV()
	 * @generated
	 * @ordered
	 */
	protected boolean geltungsbereichDV = GELTUNGSBEREICH_DV_EDEFAULT;

	/**
	 * This is true if the Geltungsbereich DV attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geltungsbereichDVESet;

	/**
	 * The default value of the '{@link #isGeltungsbereichSBahnB() <em>Geltungsbereich SBahn B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeltungsbereichSBahnB()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GELTUNGSBEREICH_SBAHN_B_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeltungsbereichSBahnB() <em>Geltungsbereich SBahn B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeltungsbereichSBahnB()
	 * @generated
	 * @ordered
	 */
	protected boolean geltungsbereichSBahnB = GELTUNGSBEREICH_SBAHN_B_EDEFAULT;

	/**
	 * This is true if the Geltungsbereich SBahn B attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geltungsbereichSBahnBESet;

	/**
	 * The default value of the '{@link #isGeltungsbereichSBahnHH() <em>Geltungsbereich SBahn HH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeltungsbereichSBahnHH()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GELTUNGSBEREICH_SBAHN_HH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeltungsbereichSBahnHH() <em>Geltungsbereich SBahn HH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeltungsbereichSBahnHH()
	 * @generated
	 * @ordered
	 */
	protected boolean geltungsbereichSBahnHH = GELTUNGSBEREICH_SBAHN_HH_EDEFAULT;

	/**
	 * This is true if the Geltungsbereich SBahn HH attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geltungsbereichSBahnHHESet;

	/**
	 * The default value of the '{@link #getGueltigAb() <em>Gueltig Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGueltigAb()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GUELTIG_AB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGueltigAb() <em>Gueltig Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGueltigAb()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gueltigAb = GUELTIG_AB_EDEFAULT;

	/**
	 * The default value of the '{@link #getGueltigBis() <em>Gueltig Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGueltigBis()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GUELTIG_BIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGueltigBis() <em>Gueltig Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGueltigBis()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gueltigBis = GUELTIG_BIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getKurzbezeichnungDS() <em>Kurzbezeichnung DS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKurzbezeichnungDS()
	 * @generated
	 * @ordered
	 */
	protected static final String KURZBEZEICHNUNG_DS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKurzbezeichnungDS() <em>Kurzbezeichnung DS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKurzbezeichnungDS()
	 * @generated
	 * @ordered
	 */
	protected String kurzbezeichnungDS = KURZBEZEICHNUNG_DS_EDEFAULT;

	/**
	 * The default value of the '{@link #getKurzbezeichnungDV() <em>Kurzbezeichnung DV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKurzbezeichnungDV()
	 * @generated
	 * @ordered
	 */
	protected static final String KURZBEZEICHNUNG_DV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKurzbezeichnungDV() <em>Kurzbezeichnung DV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKurzbezeichnungDV()
	 * @generated
	 * @ordered
	 */
	protected String kurzbezeichnungDV = KURZBEZEICHNUNG_DV_EDEFAULT;

	/**
	 * The default value of the '{@link #getLangbezeichnung() <em>Langbezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangbezeichnung()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGBEZEICHNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangbezeichnung() <em>Langbezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangbezeichnung()
	 * @generated
	 * @ordered
	 */
	protected String langbezeichnung = LANGBEZEICHNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #isSchaltbar() <em>Schaltbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSchaltbar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCHALTBAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSchaltbar() <em>Schaltbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSchaltbar()
	 * @generated
	 * @ordered
	 */
	protected boolean schaltbar = SCHALTBAR_EDEFAULT;

	/**
	 * This is true if the Schaltbar attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schaltbarESet;

	/**
	 * The default value of the '{@link #isZusatzMoeglich() <em>Zusatz Moeglich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZusatzMoeglich()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSATZ_MOEGLICH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZusatzMoeglich() <em>Zusatz Moeglich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZusatzMoeglich()
	 * @generated
	 * @ordered
	 */
	protected boolean zusatzMoeglich = ZUSATZ_MOEGLICH_EDEFAULT;

	/**
	 * This is true if the Zusatz Moeglich attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zusatzMoeglichESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signalbegriff_ID_TypeClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnmerkungen() {
		return anmerkungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnmerkungen(String newAnmerkungen) {
		String oldAnmerkungen = anmerkungen;
		anmerkungen = newAnmerkungen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN, oldAnmerkungen, anmerkungen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBeleuchtbar() {
		return beleuchtbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeleuchtbar(boolean newBeleuchtbar) {
		boolean oldBeleuchtbar = beleuchtbar;
		beleuchtbar = newBeleuchtbar;
		boolean oldBeleuchtbarESet = beleuchtbarESet;
		beleuchtbarESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR, oldBeleuchtbar, beleuchtbar, !oldBeleuchtbarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBeleuchtbar() {
		boolean oldBeleuchtbar = beleuchtbar;
		boolean oldBeleuchtbarESet = beleuchtbarESet;
		beleuchtbar = BELEUCHTBAR_EDEFAULT;
		beleuchtbarESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR, oldBeleuchtbar, BELEUCHTBAR_EDEFAULT, oldBeleuchtbarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBeleuchtbar() {
		return beleuchtbarESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeschreibung(String newBeschreibung) {
		String oldBeschreibung = beschreibung;
		beschreibung = newBeschreibung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG, oldBeschreibung, beschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGeltungsbereichDS() {
		return geltungsbereichDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeltungsbereichDS(boolean newGeltungsbereichDS) {
		boolean oldGeltungsbereichDS = geltungsbereichDS;
		geltungsbereichDS = newGeltungsbereichDS;
		boolean oldGeltungsbereichDSESet = geltungsbereichDSESet;
		geltungsbereichDSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS, oldGeltungsbereichDS, geltungsbereichDS, !oldGeltungsbereichDSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGeltungsbereichDS() {
		boolean oldGeltungsbereichDS = geltungsbereichDS;
		boolean oldGeltungsbereichDSESet = geltungsbereichDSESet;
		geltungsbereichDS = GELTUNGSBEREICH_DS_EDEFAULT;
		geltungsbereichDSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS, oldGeltungsbereichDS, GELTUNGSBEREICH_DS_EDEFAULT, oldGeltungsbereichDSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGeltungsbereichDS() {
		return geltungsbereichDSESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGeltungsbereichDV() {
		return geltungsbereichDV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeltungsbereichDV(boolean newGeltungsbereichDV) {
		boolean oldGeltungsbereichDV = geltungsbereichDV;
		geltungsbereichDV = newGeltungsbereichDV;
		boolean oldGeltungsbereichDVESet = geltungsbereichDVESet;
		geltungsbereichDVESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV, oldGeltungsbereichDV, geltungsbereichDV, !oldGeltungsbereichDVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGeltungsbereichDV() {
		boolean oldGeltungsbereichDV = geltungsbereichDV;
		boolean oldGeltungsbereichDVESet = geltungsbereichDVESet;
		geltungsbereichDV = GELTUNGSBEREICH_DV_EDEFAULT;
		geltungsbereichDVESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV, oldGeltungsbereichDV, GELTUNGSBEREICH_DV_EDEFAULT, oldGeltungsbereichDVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGeltungsbereichDV() {
		return geltungsbereichDVESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGeltungsbereichSBahnB() {
		return geltungsbereichSBahnB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeltungsbereichSBahnB(boolean newGeltungsbereichSBahnB) {
		boolean oldGeltungsbereichSBahnB = geltungsbereichSBahnB;
		geltungsbereichSBahnB = newGeltungsbereichSBahnB;
		boolean oldGeltungsbereichSBahnBESet = geltungsbereichSBahnBESet;
		geltungsbereichSBahnBESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B, oldGeltungsbereichSBahnB, geltungsbereichSBahnB, !oldGeltungsbereichSBahnBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGeltungsbereichSBahnB() {
		boolean oldGeltungsbereichSBahnB = geltungsbereichSBahnB;
		boolean oldGeltungsbereichSBahnBESet = geltungsbereichSBahnBESet;
		geltungsbereichSBahnB = GELTUNGSBEREICH_SBAHN_B_EDEFAULT;
		geltungsbereichSBahnBESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B, oldGeltungsbereichSBahnB, GELTUNGSBEREICH_SBAHN_B_EDEFAULT, oldGeltungsbereichSBahnBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGeltungsbereichSBahnB() {
		return geltungsbereichSBahnBESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGeltungsbereichSBahnHH() {
		return geltungsbereichSBahnHH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeltungsbereichSBahnHH(boolean newGeltungsbereichSBahnHH) {
		boolean oldGeltungsbereichSBahnHH = geltungsbereichSBahnHH;
		geltungsbereichSBahnHH = newGeltungsbereichSBahnHH;
		boolean oldGeltungsbereichSBahnHHESet = geltungsbereichSBahnHHESet;
		geltungsbereichSBahnHHESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH, oldGeltungsbereichSBahnHH, geltungsbereichSBahnHH, !oldGeltungsbereichSBahnHHESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGeltungsbereichSBahnHH() {
		boolean oldGeltungsbereichSBahnHH = geltungsbereichSBahnHH;
		boolean oldGeltungsbereichSBahnHHESet = geltungsbereichSBahnHHESet;
		geltungsbereichSBahnHH = GELTUNGSBEREICH_SBAHN_HH_EDEFAULT;
		geltungsbereichSBahnHHESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH, oldGeltungsbereichSBahnHH, GELTUNGSBEREICH_SBAHN_HH_EDEFAULT, oldGeltungsbereichSBahnHHESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGeltungsbereichSBahnHH() {
		return geltungsbereichSBahnHHESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getGueltigAb() {
		return gueltigAb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGueltigAb(XMLGregorianCalendar newGueltigAb) {
		XMLGregorianCalendar oldGueltigAb = gueltigAb;
		gueltigAb = newGueltigAb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB, oldGueltigAb, gueltigAb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getGueltigBis() {
		return gueltigBis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGueltigBis(XMLGregorianCalendar newGueltigBis) {
		XMLGregorianCalendar oldGueltigBis = gueltigBis;
		gueltigBis = newGueltigBis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS, oldGueltigBis, gueltigBis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKurzbezeichnungDS() {
		return kurzbezeichnungDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKurzbezeichnungDS(String newKurzbezeichnungDS) {
		String oldKurzbezeichnungDS = kurzbezeichnungDS;
		kurzbezeichnungDS = newKurzbezeichnungDS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS, oldKurzbezeichnungDS, kurzbezeichnungDS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKurzbezeichnungDV() {
		return kurzbezeichnungDV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKurzbezeichnungDV(String newKurzbezeichnungDV) {
		String oldKurzbezeichnungDV = kurzbezeichnungDV;
		kurzbezeichnungDV = newKurzbezeichnungDV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV, oldKurzbezeichnungDV, kurzbezeichnungDV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangbezeichnung() {
		return langbezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangbezeichnung(String newLangbezeichnung) {
		String oldLangbezeichnung = langbezeichnung;
		langbezeichnung = newLangbezeichnung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG, oldLangbezeichnung, langbezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSchaltbar() {
		return schaltbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchaltbar(boolean newSchaltbar) {
		boolean oldSchaltbar = schaltbar;
		schaltbar = newSchaltbar;
		boolean oldSchaltbarESet = schaltbarESet;
		schaltbarESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR, oldSchaltbar, schaltbar, !oldSchaltbarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSchaltbar() {
		boolean oldSchaltbar = schaltbar;
		boolean oldSchaltbarESet = schaltbarESet;
		schaltbar = SCHALTBAR_EDEFAULT;
		schaltbarESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR, oldSchaltbar, SCHALTBAR_EDEFAULT, oldSchaltbarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSchaltbar() {
		return schaltbarESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZusatzMoeglich() {
		return zusatzMoeglich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZusatzMoeglich(boolean newZusatzMoeglich) {
		boolean oldZusatzMoeglich = zusatzMoeglich;
		zusatzMoeglich = newZusatzMoeglich;
		boolean oldZusatzMoeglichESet = zusatzMoeglichESet;
		zusatzMoeglichESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH, oldZusatzMoeglich, zusatzMoeglich, !oldZusatzMoeglichESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZusatzMoeglich() {
		boolean oldZusatzMoeglich = zusatzMoeglich;
		boolean oldZusatzMoeglichESet = zusatzMoeglichESet;
		zusatzMoeglich = ZUSATZ_MOEGLICH_EDEFAULT;
		zusatzMoeglichESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH, oldZusatzMoeglich, ZUSATZ_MOEGLICH_EDEFAULT, oldZusatzMoeglichESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZusatzMoeglich() {
		return zusatzMoeglichESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL:
				return getSymbol();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN:
				return getAnmerkungen();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR:
				return isBeleuchtbar();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG:
				return getBeschreibung();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS:
				return isGeltungsbereichDS();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV:
				return isGeltungsbereichDV();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B:
				return isGeltungsbereichSBahnB();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH:
				return isGeltungsbereichSBahnHH();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB:
				return getGueltigAb();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS:
				return getGueltigBis();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS:
				return getKurzbezeichnungDS();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV:
				return getKurzbezeichnungDV();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG:
				return getLangbezeichnung();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR:
				return isSchaltbar();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH:
				return isZusatzMoeglich();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL:
				setSymbol((String)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN:
				setAnmerkungen((String)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR:
				setBeleuchtbar((Boolean)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG:
				setBeschreibung((String)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS:
				setGeltungsbereichDS((Boolean)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV:
				setGeltungsbereichDV((Boolean)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B:
				setGeltungsbereichSBahnB((Boolean)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH:
				setGeltungsbereichSBahnHH((Boolean)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB:
				setGueltigAb((XMLGregorianCalendar)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS:
				setGueltigBis((XMLGregorianCalendar)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS:
				setKurzbezeichnungDS((String)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV:
				setKurzbezeichnungDV((String)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG:
				setLangbezeichnung((String)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR:
				setSchaltbar((Boolean)newValue);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH:
				setZusatzMoeglich((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN:
				setAnmerkungen(ANMERKUNGEN_EDEFAULT);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR:
				unsetBeleuchtbar();
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG:
				setBeschreibung(BESCHREIBUNG_EDEFAULT);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS:
				unsetGeltungsbereichDS();
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV:
				unsetGeltungsbereichDV();
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B:
				unsetGeltungsbereichSBahnB();
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH:
				unsetGeltungsbereichSBahnHH();
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB:
				setGueltigAb(GUELTIG_AB_EDEFAULT);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS:
				setGueltigBis(GUELTIG_BIS_EDEFAULT);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS:
				setKurzbezeichnungDS(KURZBEZEICHNUNG_DS_EDEFAULT);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV:
				setKurzbezeichnungDV(KURZBEZEICHNUNG_DV_EDEFAULT);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG:
				setLangbezeichnung(LANGBEZEICHNUNG_EDEFAULT);
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR:
				unsetSchaltbar();
				return;
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH:
				unsetZusatzMoeglich();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN:
				return ANMERKUNGEN_EDEFAULT == null ? anmerkungen != null : !ANMERKUNGEN_EDEFAULT.equals(anmerkungen);
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR:
				return isSetBeleuchtbar();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG:
				return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS:
				return isSetGeltungsbereichDS();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV:
				return isSetGeltungsbereichDV();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B:
				return isSetGeltungsbereichSBahnB();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH:
				return isSetGeltungsbereichSBahnHH();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB:
				return GUELTIG_AB_EDEFAULT == null ? gueltigAb != null : !GUELTIG_AB_EDEFAULT.equals(gueltigAb);
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS:
				return GUELTIG_BIS_EDEFAULT == null ? gueltigBis != null : !GUELTIG_BIS_EDEFAULT.equals(gueltigBis);
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS:
				return KURZBEZEICHNUNG_DS_EDEFAULT == null ? kurzbezeichnungDS != null : !KURZBEZEICHNUNG_DS_EDEFAULT.equals(kurzbezeichnungDS);
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV:
				return KURZBEZEICHNUNG_DV_EDEFAULT == null ? kurzbezeichnungDV != null : !KURZBEZEICHNUNG_DV_EDEFAULT.equals(kurzbezeichnungDV);
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG:
				return LANGBEZEICHNUNG_EDEFAULT == null ? langbezeichnung != null : !LANGBEZEICHNUNG_EDEFAULT.equals(langbezeichnung);
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR:
				return isSetSchaltbar();
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH:
				return isSetZusatzMoeglich();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (symbol: ");
		result.append(symbol);
		result.append(", anmerkungen: ");
		result.append(anmerkungen);
		result.append(", beleuchtbar: ");
		if (beleuchtbarESet) result.append(beleuchtbar); else result.append("<unset>");
		result.append(", beschreibung: ");
		result.append(beschreibung);
		result.append(", geltungsbereichDS: ");
		if (geltungsbereichDSESet) result.append(geltungsbereichDS); else result.append("<unset>");
		result.append(", geltungsbereichDV: ");
		if (geltungsbereichDVESet) result.append(geltungsbereichDV); else result.append("<unset>");
		result.append(", geltungsbereichSBahnB: ");
		if (geltungsbereichSBahnBESet) result.append(geltungsbereichSBahnB); else result.append("<unset>");
		result.append(", geltungsbereichSBahnHH: ");
		if (geltungsbereichSBahnHHESet) result.append(geltungsbereichSBahnHH); else result.append("<unset>");
		result.append(", gueltigAb: ");
		result.append(gueltigAb);
		result.append(", gueltigBis: ");
		result.append(gueltigBis);
		result.append(", kurzbezeichnungDS: ");
		result.append(kurzbezeichnungDS);
		result.append(", kurzbezeichnungDV: ");
		result.append(kurzbezeichnungDV);
		result.append(", langbezeichnung: ");
		result.append(langbezeichnung);
		result.append(", schaltbar: ");
		if (schaltbarESet) result.append(schaltbar); else result.append("<unset>");
		result.append(", zusatzMoeglich: ");
		if (zusatzMoeglichESet) result.append(zusatzMoeglich); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //Signalbegriff_ID_TypeClassImpl
