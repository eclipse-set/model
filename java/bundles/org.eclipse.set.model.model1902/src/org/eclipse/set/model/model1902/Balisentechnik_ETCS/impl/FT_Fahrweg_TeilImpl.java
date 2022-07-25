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
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_Fahrweg_Teil;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_Fahrweg_Teil_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Start_W_Element_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Ziel_W_Element_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Datenpunkt_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT Fahrweg Teil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getFTFahrwegTeilAllg <em>FT Fahrweg Teil Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getIDZielDatenpunkt <em>ID Ziel Datenpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getIDZielSignal <em>ID Ziel Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getZielWElement <em>Ziel WElement</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getIDStartDatenpunkt <em>ID Start Datenpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getIDStartSignal <em>ID Start Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getStartWElement <em>Start WElement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_Fahrweg_TeilImpl extends Basis_ObjektImpl implements FT_Fahrweg_Teil {
	/**
	 * The cached value of the '{@link #getFTFahrwegTeilAllg() <em>FT Fahrweg Teil Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTFahrwegTeilAllg()
	 * @generated
	 * @ordered
	 */
	protected FT_Fahrweg_Teil_Allg_AttributeGroup fTFahrwegTeilAllg;

	/**
	 * The cached value of the '{@link #getIDZielDatenpunkt() <em>ID Ziel Datenpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZielDatenpunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_Datenpunkt_TypeClass iDZielDatenpunkt;

	/**
	 * The cached value of the '{@link #getIDZielSignal() <em>ID Ziel Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZielSignal()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_TypeClass iDZielSignal;

	/**
	 * The cached value of the '{@link #getZielWElement() <em>Ziel WElement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZielWElement()
	 * @generated
	 * @ordered
	 */
	protected Ziel_W_Element_AttributeGroup zielWElement;

	/**
	 * The cached value of the '{@link #getIDStartDatenpunkt() <em>ID Start Datenpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStartDatenpunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_Datenpunkt_TypeClass iDStartDatenpunkt;

	/**
	 * The cached value of the '{@link #getIDStartSignal() <em>ID Start Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStartSignal()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_TypeClass iDStartSignal;

	/**
	 * The cached value of the '{@link #getStartWElement() <em>Start WElement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartWElement()
	 * @generated
	 * @ordered
	 */
	protected Start_W_Element_AttributeGroup startWElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_Fahrweg_TeilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_Fahrweg_Teil_Allg_AttributeGroup getFTFahrwegTeilAllg() {
		return fTFahrwegTeilAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTFahrwegTeilAllg(FT_Fahrweg_Teil_Allg_AttributeGroup newFTFahrwegTeilAllg, NotificationChain msgs) {
		FT_Fahrweg_Teil_Allg_AttributeGroup oldFTFahrwegTeilAllg = fTFahrwegTeilAllg;
		fTFahrwegTeilAllg = newFTFahrwegTeilAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG, oldFTFahrwegTeilAllg, newFTFahrwegTeilAllg);
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
	public void setFTFahrwegTeilAllg(FT_Fahrweg_Teil_Allg_AttributeGroup newFTFahrwegTeilAllg) {
		if (newFTFahrwegTeilAllg != fTFahrwegTeilAllg) {
			NotificationChain msgs = null;
			if (fTFahrwegTeilAllg != null)
				msgs = ((InternalEObject)fTFahrwegTeilAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG, null, msgs);
			if (newFTFahrwegTeilAllg != null)
				msgs = ((InternalEObject)newFTFahrwegTeilAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG, null, msgs);
			msgs = basicSetFTFahrwegTeilAllg(newFTFahrwegTeilAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG, newFTFahrwegTeilAllg, newFTFahrwegTeilAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Datenpunkt_TypeClass getIDZielDatenpunkt() {
		return iDZielDatenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZielDatenpunkt(ID_Datenpunkt_TypeClass newIDZielDatenpunkt, NotificationChain msgs) {
		ID_Datenpunkt_TypeClass oldIDZielDatenpunkt = iDZielDatenpunkt;
		iDZielDatenpunkt = newIDZielDatenpunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT, oldIDZielDatenpunkt, newIDZielDatenpunkt);
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
	public void setIDZielDatenpunkt(ID_Datenpunkt_TypeClass newIDZielDatenpunkt) {
		if (newIDZielDatenpunkt != iDZielDatenpunkt) {
			NotificationChain msgs = null;
			if (iDZielDatenpunkt != null)
				msgs = ((InternalEObject)iDZielDatenpunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT, null, msgs);
			if (newIDZielDatenpunkt != null)
				msgs = ((InternalEObject)newIDZielDatenpunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT, null, msgs);
			msgs = basicSetIDZielDatenpunkt(newIDZielDatenpunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT, newIDZielDatenpunkt, newIDZielDatenpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_TypeClass getIDZielSignal() {
		return iDZielSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZielSignal(ID_Signal_TypeClass newIDZielSignal, NotificationChain msgs) {
		ID_Signal_TypeClass oldIDZielSignal = iDZielSignal;
		iDZielSignal = newIDZielSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL, oldIDZielSignal, newIDZielSignal);
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
	public void setIDZielSignal(ID_Signal_TypeClass newIDZielSignal) {
		if (newIDZielSignal != iDZielSignal) {
			NotificationChain msgs = null;
			if (iDZielSignal != null)
				msgs = ((InternalEObject)iDZielSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL, null, msgs);
			if (newIDZielSignal != null)
				msgs = ((InternalEObject)newIDZielSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL, null, msgs);
			msgs = basicSetIDZielSignal(newIDZielSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL, newIDZielSignal, newIDZielSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ziel_W_Element_AttributeGroup getZielWElement() {
		return zielWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZielWElement(Ziel_W_Element_AttributeGroup newZielWElement, NotificationChain msgs) {
		Ziel_W_Element_AttributeGroup oldZielWElement = zielWElement;
		zielWElement = newZielWElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT, oldZielWElement, newZielWElement);
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
	public void setZielWElement(Ziel_W_Element_AttributeGroup newZielWElement) {
		if (newZielWElement != zielWElement) {
			NotificationChain msgs = null;
			if (zielWElement != null)
				msgs = ((InternalEObject)zielWElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT, null, msgs);
			if (newZielWElement != null)
				msgs = ((InternalEObject)newZielWElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT, null, msgs);
			msgs = basicSetZielWElement(newZielWElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT, newZielWElement, newZielWElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Datenpunkt_TypeClass getIDStartDatenpunkt() {
		return iDStartDatenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDStartDatenpunkt(ID_Datenpunkt_TypeClass newIDStartDatenpunkt, NotificationChain msgs) {
		ID_Datenpunkt_TypeClass oldIDStartDatenpunkt = iDStartDatenpunkt;
		iDStartDatenpunkt = newIDStartDatenpunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT, oldIDStartDatenpunkt, newIDStartDatenpunkt);
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
	public void setIDStartDatenpunkt(ID_Datenpunkt_TypeClass newIDStartDatenpunkt) {
		if (newIDStartDatenpunkt != iDStartDatenpunkt) {
			NotificationChain msgs = null;
			if (iDStartDatenpunkt != null)
				msgs = ((InternalEObject)iDStartDatenpunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT, null, msgs);
			if (newIDStartDatenpunkt != null)
				msgs = ((InternalEObject)newIDStartDatenpunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT, null, msgs);
			msgs = basicSetIDStartDatenpunkt(newIDStartDatenpunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT, newIDStartDatenpunkt, newIDStartDatenpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_TypeClass getIDStartSignal() {
		return iDStartSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDStartSignal(ID_Signal_TypeClass newIDStartSignal, NotificationChain msgs) {
		ID_Signal_TypeClass oldIDStartSignal = iDStartSignal;
		iDStartSignal = newIDStartSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL, oldIDStartSignal, newIDStartSignal);
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
	public void setIDStartSignal(ID_Signal_TypeClass newIDStartSignal) {
		if (newIDStartSignal != iDStartSignal) {
			NotificationChain msgs = null;
			if (iDStartSignal != null)
				msgs = ((InternalEObject)iDStartSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL, null, msgs);
			if (newIDStartSignal != null)
				msgs = ((InternalEObject)newIDStartSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL, null, msgs);
			msgs = basicSetIDStartSignal(newIDStartSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL, newIDStartSignal, newIDStartSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start_W_Element_AttributeGroup getStartWElement() {
		return startWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartWElement(Start_W_Element_AttributeGroup newStartWElement, NotificationChain msgs) {
		Start_W_Element_AttributeGroup oldStartWElement = startWElement;
		startWElement = newStartWElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT, oldStartWElement, newStartWElement);
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
	public void setStartWElement(Start_W_Element_AttributeGroup newStartWElement) {
		if (newStartWElement != startWElement) {
			NotificationChain msgs = null;
			if (startWElement != null)
				msgs = ((InternalEObject)startWElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT, null, msgs);
			if (newStartWElement != null)
				msgs = ((InternalEObject)newStartWElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT, null, msgs);
			msgs = basicSetStartWElement(newStartWElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT, newStartWElement, newStartWElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG:
				return basicSetFTFahrwegTeilAllg(null, msgs);
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT:
				return basicSetIDZielDatenpunkt(null, msgs);
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL:
				return basicSetIDZielSignal(null, msgs);
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT:
				return basicSetZielWElement(null, msgs);
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT:
				return basicSetIDStartDatenpunkt(null, msgs);
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL:
				return basicSetIDStartSignal(null, msgs);
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT:
				return basicSetStartWElement(null, msgs);
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG:
				return getFTFahrwegTeilAllg();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT:
				return getIDZielDatenpunkt();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL:
				return getIDZielSignal();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT:
				return getZielWElement();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT:
				return getIDStartDatenpunkt();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL:
				return getIDStartSignal();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT:
				return getStartWElement();
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG:
				setFTFahrwegTeilAllg((FT_Fahrweg_Teil_Allg_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT:
				setIDZielDatenpunkt((ID_Datenpunkt_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL:
				setIDZielSignal((ID_Signal_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT:
				setZielWElement((Ziel_W_Element_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT:
				setIDStartDatenpunkt((ID_Datenpunkt_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL:
				setIDStartSignal((ID_Signal_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT:
				setStartWElement((Start_W_Element_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG:
				setFTFahrwegTeilAllg((FT_Fahrweg_Teil_Allg_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT:
				setIDZielDatenpunkt((ID_Datenpunkt_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL:
				setIDZielSignal((ID_Signal_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT:
				setZielWElement((Ziel_W_Element_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT:
				setIDStartDatenpunkt((ID_Datenpunkt_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL:
				setIDStartSignal((ID_Signal_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT:
				setStartWElement((Start_W_Element_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG:
				return fTFahrwegTeilAllg != null;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT:
				return iDZielDatenpunkt != null;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL:
				return iDZielSignal != null;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT:
				return zielWElement != null;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT:
				return iDStartDatenpunkt != null;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL:
				return iDStartSignal != null;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT:
				return startWElement != null;
		}
		return super.eIsSet(featureID);
	}

} //FT_Fahrweg_TeilImpl
