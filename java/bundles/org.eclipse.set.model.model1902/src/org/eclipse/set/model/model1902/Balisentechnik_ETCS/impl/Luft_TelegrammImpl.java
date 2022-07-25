/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm;

import org.eclipse.set.model.model1902.BasisTypen.Eigenschaften_Datei_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Balise_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Binaerdatei_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Fachtelegramm_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Luft Telegramm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getEigenschaftenBinaerdatei <em>Eigenschaften Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getEigenschaftenBinaerdateiHilfe <em>Eigenschaften Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDBaliseUebertragung <em>ID Balise Uebertragung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDBinaerdatei <em>ID Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDBinaerdateiHilfe <em>ID Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Luft_TelegrammImpl extends Basis_ObjektImpl implements Luft_Telegramm {
	/**
	 * The cached value of the '{@link #getEigenschaftenBinaerdatei() <em>Eigenschaften Binaerdatei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEigenschaftenBinaerdatei()
	 * @generated
	 * @ordered
	 */
	protected Eigenschaften_Datei_AttributeGroup eigenschaftenBinaerdatei;

	/**
	 * The cached value of the '{@link #getEigenschaftenBinaerdateiHilfe() <em>Eigenschaften Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEigenschaftenBinaerdateiHilfe()
	 * @generated
	 * @ordered
	 */
	protected Eigenschaften_Datei_AttributeGroup eigenschaftenBinaerdateiHilfe;

	/**
	 * The cached value of the '{@link #getIDAnhangEADoku() <em>ID Anhang EA Doku</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangEADoku()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangEADoku;

	/**
	 * The cached value of the '{@link #getIDBaliseUebertragung() <em>ID Balise Uebertragung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBaliseUebertragung()
	 * @generated
	 * @ordered
	 */
	protected ID_Balise_ohne_Proxy_TypeClass iDBaliseUebertragung;

	/**
	 * The cached value of the '{@link #getIDBinaerdatei() <em>ID Binaerdatei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBinaerdatei()
	 * @generated
	 * @ordered
	 */
	protected ID_Binaerdatei_ohne_Proxy_TypeClass iDBinaerdatei;

	/**
	 * The cached value of the '{@link #getIDBinaerdateiHilfe() <em>ID Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBinaerdateiHilfe()
	 * @generated
	 * @ordered
	 */
	protected ID_Binaerdatei_ohne_Proxy_TypeClass iDBinaerdateiHilfe;

	/**
	 * The cached value of the '{@link #getIDFachtelegramm() <em>ID Fachtelegramm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFachtelegramm()
	 * @generated
	 * @ordered
	 */
	protected ID_Fachtelegramm_TypeClass iDFachtelegramm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Luft_TelegrammImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eigenschaften_Datei_AttributeGroup getEigenschaftenBinaerdatei() {
		return eigenschaftenBinaerdatei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEigenschaftenBinaerdatei(Eigenschaften_Datei_AttributeGroup newEigenschaftenBinaerdatei, NotificationChain msgs) {
		Eigenschaften_Datei_AttributeGroup oldEigenschaftenBinaerdatei = eigenschaftenBinaerdatei;
		eigenschaftenBinaerdatei = newEigenschaftenBinaerdatei;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI, oldEigenschaftenBinaerdatei, newEigenschaftenBinaerdatei);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEigenschaftenBinaerdatei(Eigenschaften_Datei_AttributeGroup newEigenschaftenBinaerdatei) {
		if (newEigenschaftenBinaerdatei != eigenschaftenBinaerdatei) {
			NotificationChain msgs = null;
			if (eigenschaftenBinaerdatei != null)
				msgs = ((InternalEObject)eigenschaftenBinaerdatei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI, null, msgs);
			if (newEigenschaftenBinaerdatei != null)
				msgs = ((InternalEObject)newEigenschaftenBinaerdatei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI, null, msgs);
			msgs = basicSetEigenschaftenBinaerdatei(newEigenschaftenBinaerdatei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI, newEigenschaftenBinaerdatei, newEigenschaftenBinaerdatei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eigenschaften_Datei_AttributeGroup getEigenschaftenBinaerdateiHilfe() {
		return eigenschaftenBinaerdateiHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEigenschaftenBinaerdateiHilfe(Eigenschaften_Datei_AttributeGroup newEigenschaftenBinaerdateiHilfe, NotificationChain msgs) {
		Eigenschaften_Datei_AttributeGroup oldEigenschaftenBinaerdateiHilfe = eigenschaftenBinaerdateiHilfe;
		eigenschaftenBinaerdateiHilfe = newEigenschaftenBinaerdateiHilfe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE, oldEigenschaftenBinaerdateiHilfe, newEigenschaftenBinaerdateiHilfe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEigenschaftenBinaerdateiHilfe(Eigenschaften_Datei_AttributeGroup newEigenschaftenBinaerdateiHilfe) {
		if (newEigenschaftenBinaerdateiHilfe != eigenschaftenBinaerdateiHilfe) {
			NotificationChain msgs = null;
			if (eigenschaftenBinaerdateiHilfe != null)
				msgs = ((InternalEObject)eigenschaftenBinaerdateiHilfe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE, null, msgs);
			if (newEigenschaftenBinaerdateiHilfe != null)
				msgs = ((InternalEObject)newEigenschaftenBinaerdateiHilfe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE, null, msgs);
			msgs = basicSetEigenschaftenBinaerdateiHilfe(newEigenschaftenBinaerdateiHilfe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE, newEigenschaftenBinaerdateiHilfe, newEigenschaftenBinaerdateiHilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangEADoku() {
		return iDAnhangEADoku;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangEADoku(ID_Anhang_TypeClass newIDAnhangEADoku, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangEADoku = iDAnhangEADoku;
		iDAnhangEADoku = newIDAnhangEADoku;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU, oldIDAnhangEADoku, newIDAnhangEADoku);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangEADoku(ID_Anhang_TypeClass newIDAnhangEADoku) {
		if (newIDAnhangEADoku != iDAnhangEADoku) {
			NotificationChain msgs = null;
			if (iDAnhangEADoku != null)
				msgs = ((InternalEObject)iDAnhangEADoku).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU, null, msgs);
			if (newIDAnhangEADoku != null)
				msgs = ((InternalEObject)newIDAnhangEADoku).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU, null, msgs);
			msgs = basicSetIDAnhangEADoku(newIDAnhangEADoku, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU, newIDAnhangEADoku, newIDAnhangEADoku));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Balise_ohne_Proxy_TypeClass getIDBaliseUebertragung() {
		return iDBaliseUebertragung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBaliseUebertragung(ID_Balise_ohne_Proxy_TypeClass newIDBaliseUebertragung, NotificationChain msgs) {
		ID_Balise_ohne_Proxy_TypeClass oldIDBaliseUebertragung = iDBaliseUebertragung;
		iDBaliseUebertragung = newIDBaliseUebertragung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG, oldIDBaliseUebertragung, newIDBaliseUebertragung);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBaliseUebertragung(ID_Balise_ohne_Proxy_TypeClass newIDBaliseUebertragung) {
		if (newIDBaliseUebertragung != iDBaliseUebertragung) {
			NotificationChain msgs = null;
			if (iDBaliseUebertragung != null)
				msgs = ((InternalEObject)iDBaliseUebertragung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG, null, msgs);
			if (newIDBaliseUebertragung != null)
				msgs = ((InternalEObject)newIDBaliseUebertragung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG, null, msgs);
			msgs = basicSetIDBaliseUebertragung(newIDBaliseUebertragung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG, newIDBaliseUebertragung, newIDBaliseUebertragung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Binaerdatei_ohne_Proxy_TypeClass getIDBinaerdatei() {
		return iDBinaerdatei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBinaerdatei(ID_Binaerdatei_ohne_Proxy_TypeClass newIDBinaerdatei, NotificationChain msgs) {
		ID_Binaerdatei_ohne_Proxy_TypeClass oldIDBinaerdatei = iDBinaerdatei;
		iDBinaerdatei = newIDBinaerdatei;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI, oldIDBinaerdatei, newIDBinaerdatei);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBinaerdatei(ID_Binaerdatei_ohne_Proxy_TypeClass newIDBinaerdatei) {
		if (newIDBinaerdatei != iDBinaerdatei) {
			NotificationChain msgs = null;
			if (iDBinaerdatei != null)
				msgs = ((InternalEObject)iDBinaerdatei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI, null, msgs);
			if (newIDBinaerdatei != null)
				msgs = ((InternalEObject)newIDBinaerdatei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI, null, msgs);
			msgs = basicSetIDBinaerdatei(newIDBinaerdatei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI, newIDBinaerdatei, newIDBinaerdatei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Binaerdatei_ohne_Proxy_TypeClass getIDBinaerdateiHilfe() {
		return iDBinaerdateiHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBinaerdateiHilfe(ID_Binaerdatei_ohne_Proxy_TypeClass newIDBinaerdateiHilfe, NotificationChain msgs) {
		ID_Binaerdatei_ohne_Proxy_TypeClass oldIDBinaerdateiHilfe = iDBinaerdateiHilfe;
		iDBinaerdateiHilfe = newIDBinaerdateiHilfe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE, oldIDBinaerdateiHilfe, newIDBinaerdateiHilfe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBinaerdateiHilfe(ID_Binaerdatei_ohne_Proxy_TypeClass newIDBinaerdateiHilfe) {
		if (newIDBinaerdateiHilfe != iDBinaerdateiHilfe) {
			NotificationChain msgs = null;
			if (iDBinaerdateiHilfe != null)
				msgs = ((InternalEObject)iDBinaerdateiHilfe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE, null, msgs);
			if (newIDBinaerdateiHilfe != null)
				msgs = ((InternalEObject)newIDBinaerdateiHilfe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE, null, msgs);
			msgs = basicSetIDBinaerdateiHilfe(newIDBinaerdateiHilfe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE, newIDBinaerdateiHilfe, newIDBinaerdateiHilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fachtelegramm_TypeClass getIDFachtelegramm() {
		return iDFachtelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFachtelegramm(ID_Fachtelegramm_TypeClass newIDFachtelegramm, NotificationChain msgs) {
		ID_Fachtelegramm_TypeClass oldIDFachtelegramm = iDFachtelegramm;
		iDFachtelegramm = newIDFachtelegramm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM, oldIDFachtelegramm, newIDFachtelegramm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFachtelegramm(ID_Fachtelegramm_TypeClass newIDFachtelegramm) {
		if (newIDFachtelegramm != iDFachtelegramm) {
			NotificationChain msgs = null;
			if (iDFachtelegramm != null)
				msgs = ((InternalEObject)iDFachtelegramm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM, null, msgs);
			if (newIDFachtelegramm != null)
				msgs = ((InternalEObject)newIDFachtelegramm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM, null, msgs);
			msgs = basicSetIDFachtelegramm(newIDFachtelegramm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM, newIDFachtelegramm, newIDFachtelegramm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI:
				return basicSetEigenschaftenBinaerdatei(null, msgs);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE:
				return basicSetEigenschaftenBinaerdateiHilfe(null, msgs);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU:
				return basicSetIDAnhangEADoku(null, msgs);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				return basicSetIDBaliseUebertragung(null, msgs);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI:
				return basicSetIDBinaerdatei(null, msgs);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE:
				return basicSetIDBinaerdateiHilfe(null, msgs);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				return basicSetIDFachtelegramm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI:
				return getEigenschaftenBinaerdatei();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE:
				return getEigenschaftenBinaerdateiHilfe();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU:
				return getIDAnhangEADoku();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				return getIDBaliseUebertragung();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI:
				return getIDBinaerdatei();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE:
				return getIDBinaerdateiHilfe();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				return getIDFachtelegramm();
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI:
				setEigenschaftenBinaerdatei((Eigenschaften_Datei_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE:
				setEigenschaftenBinaerdateiHilfe((Eigenschaften_Datei_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU:
				setIDAnhangEADoku((ID_Anhang_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				setIDBaliseUebertragung((ID_Balise_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI:
				setIDBinaerdatei((ID_Binaerdatei_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE:
				setIDBinaerdateiHilfe((ID_Binaerdatei_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				setIDFachtelegramm((ID_Fachtelegramm_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI:
				setEigenschaftenBinaerdatei((Eigenschaften_Datei_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE:
				setEigenschaftenBinaerdateiHilfe((Eigenschaften_Datei_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU:
				setIDAnhangEADoku((ID_Anhang_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				setIDBaliseUebertragung((ID_Balise_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI:
				setIDBinaerdatei((ID_Binaerdatei_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE:
				setIDBinaerdateiHilfe((ID_Binaerdatei_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				setIDFachtelegramm((ID_Fachtelegramm_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI:
				return eigenschaftenBinaerdatei != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE:
				return eigenschaftenBinaerdateiHilfe != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU:
				return iDAnhangEADoku != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				return iDBaliseUebertragung != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI:
				return iDBinaerdatei != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE:
				return iDBinaerdateiHilfe != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				return iDFachtelegramm != null;
		}
		return super.eIsSet(featureID);
	}

} //Luft_TelegrammImpl
