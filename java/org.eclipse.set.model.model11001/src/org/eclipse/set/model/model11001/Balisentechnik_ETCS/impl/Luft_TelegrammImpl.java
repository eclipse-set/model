/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.LT_Binaerdatei_Hilfe_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Luft_Telegramm;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Telegramm_Index_TypeClass;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Verweise.ID_Balise_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Fachtelegramm_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Luft Telegramm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDBaliseUebertragung <em>ID Balise Uebertragung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getLTBinaerdateiHilfe <em>LT Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getLTBinaerdaten <em>LT Binaerdaten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getTelegrammIndex <em>Telegramm Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Luft_TelegrammImpl extends Basis_ObjektImpl implements Luft_Telegramm {
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
	 * The cached value of the '{@link #getIDFachtelegramm() <em>ID Fachtelegramm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFachtelegramm()
	 * @generated
	 * @ordered
	 */
	protected ID_Fachtelegramm_TypeClass iDFachtelegramm;

	/**
	 * The cached value of the '{@link #getLTBinaerdateiHilfe() <em>LT Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLTBinaerdateiHilfe()
	 * @generated
	 * @ordered
	 */
	protected LT_Binaerdatei_Hilfe_AttributeGroup lTBinaerdateiHilfe;

	/**
	 * The cached value of the '{@link #getLTBinaerdaten() <em>LT Binaerdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLTBinaerdaten()
	 * @generated
	 * @ordered
	 */
	protected LT_Binaerdaten_AttributeGroup lTBinaerdaten;

	/**
	 * The cached value of the '{@link #getTelegrammIndex() <em>Telegramm Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegrammIndex()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_Index_TypeClass telegrammIndex;

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
	public LT_Binaerdatei_Hilfe_AttributeGroup getLTBinaerdateiHilfe() {
		return lTBinaerdateiHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLTBinaerdateiHilfe(LT_Binaerdatei_Hilfe_AttributeGroup newLTBinaerdateiHilfe, NotificationChain msgs) {
		LT_Binaerdatei_Hilfe_AttributeGroup oldLTBinaerdateiHilfe = lTBinaerdateiHilfe;
		lTBinaerdateiHilfe = newLTBinaerdateiHilfe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE, oldLTBinaerdateiHilfe, newLTBinaerdateiHilfe);
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
	public void setLTBinaerdateiHilfe(LT_Binaerdatei_Hilfe_AttributeGroup newLTBinaerdateiHilfe) {
		if (newLTBinaerdateiHilfe != lTBinaerdateiHilfe) {
			NotificationChain msgs = null;
			if (lTBinaerdateiHilfe != null)
				msgs = ((InternalEObject)lTBinaerdateiHilfe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE, null, msgs);
			if (newLTBinaerdateiHilfe != null)
				msgs = ((InternalEObject)newLTBinaerdateiHilfe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE, null, msgs);
			msgs = basicSetLTBinaerdateiHilfe(newLTBinaerdateiHilfe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE, newLTBinaerdateiHilfe, newLTBinaerdateiHilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LT_Binaerdaten_AttributeGroup getLTBinaerdaten() {
		return lTBinaerdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLTBinaerdaten(LT_Binaerdaten_AttributeGroup newLTBinaerdaten, NotificationChain msgs) {
		LT_Binaerdaten_AttributeGroup oldLTBinaerdaten = lTBinaerdaten;
		lTBinaerdaten = newLTBinaerdaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN, oldLTBinaerdaten, newLTBinaerdaten);
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
	public void setLTBinaerdaten(LT_Binaerdaten_AttributeGroup newLTBinaerdaten) {
		if (newLTBinaerdaten != lTBinaerdaten) {
			NotificationChain msgs = null;
			if (lTBinaerdaten != null)
				msgs = ((InternalEObject)lTBinaerdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN, null, msgs);
			if (newLTBinaerdaten != null)
				msgs = ((InternalEObject)newLTBinaerdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN, null, msgs);
			msgs = basicSetLTBinaerdaten(newLTBinaerdaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN, newLTBinaerdaten, newLTBinaerdaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_Index_TypeClass getTelegrammIndex() {
		return telegrammIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegrammIndex(Telegramm_Index_TypeClass newTelegrammIndex, NotificationChain msgs) {
		Telegramm_Index_TypeClass oldTelegrammIndex = telegrammIndex;
		telegrammIndex = newTelegrammIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX, oldTelegrammIndex, newTelegrammIndex);
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
	public void setTelegrammIndex(Telegramm_Index_TypeClass newTelegrammIndex) {
		if (newTelegrammIndex != telegrammIndex) {
			NotificationChain msgs = null;
			if (telegrammIndex != null)
				msgs = ((InternalEObject)telegrammIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX, null, msgs);
			if (newTelegrammIndex != null)
				msgs = ((InternalEObject)newTelegrammIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX, null, msgs);
			msgs = basicSetTelegrammIndex(newTelegrammIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX, newTelegrammIndex, newTelegrammIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				return basicSetIDBaliseUebertragung(null, msgs);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				return basicSetIDFachtelegramm(null, msgs);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE:
				return basicSetLTBinaerdateiHilfe(null, msgs);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN:
				return basicSetLTBinaerdaten(null, msgs);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX:
				return basicSetTelegrammIndex(null, msgs);
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				return getIDBaliseUebertragung();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				return getIDFachtelegramm();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE:
				return getLTBinaerdateiHilfe();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN:
				return getLTBinaerdaten();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX:
				return getTelegrammIndex();
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				setIDBaliseUebertragung((ID_Balise_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				setIDFachtelegramm((ID_Fachtelegramm_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE:
				setLTBinaerdateiHilfe((LT_Binaerdatei_Hilfe_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN:
				setLTBinaerdaten((LT_Binaerdaten_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX:
				setTelegrammIndex((Telegramm_Index_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				setIDBaliseUebertragung((ID_Balise_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				setIDFachtelegramm((ID_Fachtelegramm_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE:
				setLTBinaerdateiHilfe((LT_Binaerdatei_Hilfe_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN:
				setLTBinaerdaten((LT_Binaerdaten_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX:
				setTelegrammIndex((Telegramm_Index_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				return iDBaliseUebertragung != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				return iDFachtelegramm != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE:
				return lTBinaerdateiHilfe != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN:
				return lTBinaerdaten != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX:
				return telegrammIndex != null;
		}
		return super.eIsSet(featureID);
	}

} //Luft_TelegrammImpl
