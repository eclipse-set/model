/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Signale.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.model1902.Signale.PZB_Schutzstrecke_Soll_TypeClass;
import org.eclipse.set.model.model1902.Signale.Signal;
import org.eclipse.set.model.model1902.Signale.Signal_Fiktiv_AttributeGroup;
import org.eclipse.set.model.model1902.Signale.Signal_Fstr_AttributeGroup;
import org.eclipse.set.model.model1902.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup;
import org.eclipse.set.model.model1902.Signale.Signal_Fstr_S_AttributeGroup;
import org.eclipse.set.model.model1902.Signale.Signal_Real_AttributeGroup;
import org.eclipse.set.model.model1902.Signale.SignalePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.SignalImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.SignalImpl#getPZBSchutzstreckeSoll <em>PZB Schutzstrecke Soll</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.SignalImpl#getSignalFstr <em>Signal Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.SignalImpl#getSignalFstrAusInselgleis <em>Signal Fstr Aus Inselgleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.SignalImpl#getSignalFstrS <em>Signal Fstr S</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.SignalImpl#getSignalFiktiv <em>Signal Fiktiv</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.SignalImpl#getSignalReal <em>Signal Real</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalImpl extends Punkt_ObjektImpl implements Signal {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Element_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getPZBSchutzstreckeSoll() <em>PZB Schutzstrecke Soll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBSchutzstreckeSoll()
	 * @generated
	 * @ordered
	 */
	protected PZB_Schutzstrecke_Soll_TypeClass pZBSchutzstreckeSoll;

	/**
	 * The cached value of the '{@link #getSignalFstr() <em>Signal Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalFstr()
	 * @generated
	 * @ordered
	 */
	protected Signal_Fstr_AttributeGroup signalFstr;

	/**
	 * The cached value of the '{@link #getSignalFstrAusInselgleis() <em>Signal Fstr Aus Inselgleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalFstrAusInselgleis()
	 * @generated
	 * @ordered
	 */
	protected Signal_Fstr_Aus_Inselgleis_AttributeGroup signalFstrAusInselgleis;

	/**
	 * The cached value of the '{@link #getSignalFstrS() <em>Signal Fstr S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalFstrS()
	 * @generated
	 * @ordered
	 */
	protected Signal_Fstr_S_AttributeGroup signalFstrS;

	/**
	 * The cached value of the '{@link #getSignalFiktiv() <em>Signal Fiktiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalFiktiv()
	 * @generated
	 * @ordered
	 */
	protected Signal_Fiktiv_AttributeGroup signalFiktiv;

	/**
	 * The cached value of the '{@link #getSignalReal() <em>Signal Real</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalReal()
	 * @generated
	 * @ordered
	 */
	protected Signal_Real_AttributeGroup signalReal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Element_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bezeichnung_Element_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Schutzstrecke_Soll_TypeClass getPZBSchutzstreckeSoll() {
		return pZBSchutzstreckeSoll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPZBSchutzstreckeSoll(PZB_Schutzstrecke_Soll_TypeClass newPZBSchutzstreckeSoll, NotificationChain msgs) {
		PZB_Schutzstrecke_Soll_TypeClass oldPZBSchutzstreckeSoll = pZBSchutzstreckeSoll;
		pZBSchutzstreckeSoll = newPZBSchutzstreckeSoll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__PZB_SCHUTZSTRECKE_SOLL, oldPZBSchutzstreckeSoll, newPZBSchutzstreckeSoll);
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
	public void setPZBSchutzstreckeSoll(PZB_Schutzstrecke_Soll_TypeClass newPZBSchutzstreckeSoll) {
		if (newPZBSchutzstreckeSoll != pZBSchutzstreckeSoll) {
			NotificationChain msgs = null;
			if (pZBSchutzstreckeSoll != null)
				msgs = ((InternalEObject)pZBSchutzstreckeSoll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__PZB_SCHUTZSTRECKE_SOLL, null, msgs);
			if (newPZBSchutzstreckeSoll != null)
				msgs = ((InternalEObject)newPZBSchutzstreckeSoll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__PZB_SCHUTZSTRECKE_SOLL, null, msgs);
			msgs = basicSetPZBSchutzstreckeSoll(newPZBSchutzstreckeSoll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__PZB_SCHUTZSTRECKE_SOLL, newPZBSchutzstreckeSoll, newPZBSchutzstreckeSoll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Fstr_AttributeGroup getSignalFstr() {
		return signalFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalFstr(Signal_Fstr_AttributeGroup newSignalFstr, NotificationChain msgs) {
		Signal_Fstr_AttributeGroup oldSignalFstr = signalFstr;
		signalFstr = newSignalFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__SIGNAL_FSTR, oldSignalFstr, newSignalFstr);
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
	public void setSignalFstr(Signal_Fstr_AttributeGroup newSignalFstr) {
		if (newSignalFstr != signalFstr) {
			NotificationChain msgs = null;
			if (signalFstr != null)
				msgs = ((InternalEObject)signalFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__SIGNAL_FSTR, null, msgs);
			if (newSignalFstr != null)
				msgs = ((InternalEObject)newSignalFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__SIGNAL_FSTR, null, msgs);
			msgs = basicSetSignalFstr(newSignalFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__SIGNAL_FSTR, newSignalFstr, newSignalFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Fstr_Aus_Inselgleis_AttributeGroup getSignalFstrAusInselgleis() {
		return signalFstrAusInselgleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalFstrAusInselgleis(Signal_Fstr_Aus_Inselgleis_AttributeGroup newSignalFstrAusInselgleis, NotificationChain msgs) {
		Signal_Fstr_Aus_Inselgleis_AttributeGroup oldSignalFstrAusInselgleis = signalFstrAusInselgleis;
		signalFstrAusInselgleis = newSignalFstrAusInselgleis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS, oldSignalFstrAusInselgleis, newSignalFstrAusInselgleis);
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
	public void setSignalFstrAusInselgleis(Signal_Fstr_Aus_Inselgleis_AttributeGroup newSignalFstrAusInselgleis) {
		if (newSignalFstrAusInselgleis != signalFstrAusInselgleis) {
			NotificationChain msgs = null;
			if (signalFstrAusInselgleis != null)
				msgs = ((InternalEObject)signalFstrAusInselgleis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS, null, msgs);
			if (newSignalFstrAusInselgleis != null)
				msgs = ((InternalEObject)newSignalFstrAusInselgleis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS, null, msgs);
			msgs = basicSetSignalFstrAusInselgleis(newSignalFstrAusInselgleis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS, newSignalFstrAusInselgleis, newSignalFstrAusInselgleis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Fstr_S_AttributeGroup getSignalFstrS() {
		return signalFstrS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalFstrS(Signal_Fstr_S_AttributeGroup newSignalFstrS, NotificationChain msgs) {
		Signal_Fstr_S_AttributeGroup oldSignalFstrS = signalFstrS;
		signalFstrS = newSignalFstrS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__SIGNAL_FSTR_S, oldSignalFstrS, newSignalFstrS);
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
	public void setSignalFstrS(Signal_Fstr_S_AttributeGroup newSignalFstrS) {
		if (newSignalFstrS != signalFstrS) {
			NotificationChain msgs = null;
			if (signalFstrS != null)
				msgs = ((InternalEObject)signalFstrS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__SIGNAL_FSTR_S, null, msgs);
			if (newSignalFstrS != null)
				msgs = ((InternalEObject)newSignalFstrS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__SIGNAL_FSTR_S, null, msgs);
			msgs = basicSetSignalFstrS(newSignalFstrS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__SIGNAL_FSTR_S, newSignalFstrS, newSignalFstrS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Fiktiv_AttributeGroup getSignalFiktiv() {
		return signalFiktiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalFiktiv(Signal_Fiktiv_AttributeGroup newSignalFiktiv, NotificationChain msgs) {
		Signal_Fiktiv_AttributeGroup oldSignalFiktiv = signalFiktiv;
		signalFiktiv = newSignalFiktiv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__SIGNAL_FIKTIV, oldSignalFiktiv, newSignalFiktiv);
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
	public void setSignalFiktiv(Signal_Fiktiv_AttributeGroup newSignalFiktiv) {
		if (newSignalFiktiv != signalFiktiv) {
			NotificationChain msgs = null;
			if (signalFiktiv != null)
				msgs = ((InternalEObject)signalFiktiv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__SIGNAL_FIKTIV, null, msgs);
			if (newSignalFiktiv != null)
				msgs = ((InternalEObject)newSignalFiktiv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__SIGNAL_FIKTIV, null, msgs);
			msgs = basicSetSignalFiktiv(newSignalFiktiv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__SIGNAL_FIKTIV, newSignalFiktiv, newSignalFiktiv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Real_AttributeGroup getSignalReal() {
		return signalReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalReal(Signal_Real_AttributeGroup newSignalReal, NotificationChain msgs) {
		Signal_Real_AttributeGroup oldSignalReal = signalReal;
		signalReal = newSignalReal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__SIGNAL_REAL, oldSignalReal, newSignalReal);
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
	public void setSignalReal(Signal_Real_AttributeGroup newSignalReal) {
		if (newSignalReal != signalReal) {
			NotificationChain msgs = null;
			if (signalReal != null)
				msgs = ((InternalEObject)signalReal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__SIGNAL_REAL, null, msgs);
			if (newSignalReal != null)
				msgs = ((InternalEObject)newSignalReal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL__SIGNAL_REAL, null, msgs);
			msgs = basicSetSignalReal(newSignalReal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL__SIGNAL_REAL, newSignalReal, newSignalReal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case SignalePackage.SIGNAL__PZB_SCHUTZSTRECKE_SOLL:
				return basicSetPZBSchutzstreckeSoll(null, msgs);
			case SignalePackage.SIGNAL__SIGNAL_FSTR:
				return basicSetSignalFstr(null, msgs);
			case SignalePackage.SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS:
				return basicSetSignalFstrAusInselgleis(null, msgs);
			case SignalePackage.SIGNAL__SIGNAL_FSTR_S:
				return basicSetSignalFstrS(null, msgs);
			case SignalePackage.SIGNAL__SIGNAL_FIKTIV:
				return basicSetSignalFiktiv(null, msgs);
			case SignalePackage.SIGNAL__SIGNAL_REAL:
				return basicSetSignalReal(null, msgs);
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
			case SignalePackage.SIGNAL__BEZEICHNUNG:
				return getBezeichnung();
			case SignalePackage.SIGNAL__PZB_SCHUTZSTRECKE_SOLL:
				return getPZBSchutzstreckeSoll();
			case SignalePackage.SIGNAL__SIGNAL_FSTR:
				return getSignalFstr();
			case SignalePackage.SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS:
				return getSignalFstrAusInselgleis();
			case SignalePackage.SIGNAL__SIGNAL_FSTR_S:
				return getSignalFstrS();
			case SignalePackage.SIGNAL__SIGNAL_FIKTIV:
				return getSignalFiktiv();
			case SignalePackage.SIGNAL__SIGNAL_REAL:
				return getSignalReal();
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
			case SignalePackage.SIGNAL__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)newValue);
				return;
			case SignalePackage.SIGNAL__PZB_SCHUTZSTRECKE_SOLL:
				setPZBSchutzstreckeSoll((PZB_Schutzstrecke_Soll_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL__SIGNAL_FSTR:
				setSignalFstr((Signal_Fstr_AttributeGroup)newValue);
				return;
			case SignalePackage.SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS:
				setSignalFstrAusInselgleis((Signal_Fstr_Aus_Inselgleis_AttributeGroup)newValue);
				return;
			case SignalePackage.SIGNAL__SIGNAL_FSTR_S:
				setSignalFstrS((Signal_Fstr_S_AttributeGroup)newValue);
				return;
			case SignalePackage.SIGNAL__SIGNAL_FIKTIV:
				setSignalFiktiv((Signal_Fiktiv_AttributeGroup)newValue);
				return;
			case SignalePackage.SIGNAL__SIGNAL_REAL:
				setSignalReal((Signal_Real_AttributeGroup)newValue);
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
			case SignalePackage.SIGNAL__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)null);
				return;
			case SignalePackage.SIGNAL__PZB_SCHUTZSTRECKE_SOLL:
				setPZBSchutzstreckeSoll((PZB_Schutzstrecke_Soll_TypeClass)null);
				return;
			case SignalePackage.SIGNAL__SIGNAL_FSTR:
				setSignalFstr((Signal_Fstr_AttributeGroup)null);
				return;
			case SignalePackage.SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS:
				setSignalFstrAusInselgleis((Signal_Fstr_Aus_Inselgleis_AttributeGroup)null);
				return;
			case SignalePackage.SIGNAL__SIGNAL_FSTR_S:
				setSignalFstrS((Signal_Fstr_S_AttributeGroup)null);
				return;
			case SignalePackage.SIGNAL__SIGNAL_FIKTIV:
				setSignalFiktiv((Signal_Fiktiv_AttributeGroup)null);
				return;
			case SignalePackage.SIGNAL__SIGNAL_REAL:
				setSignalReal((Signal_Real_AttributeGroup)null);
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
			case SignalePackage.SIGNAL__BEZEICHNUNG:
				return bezeichnung != null;
			case SignalePackage.SIGNAL__PZB_SCHUTZSTRECKE_SOLL:
				return pZBSchutzstreckeSoll != null;
			case SignalePackage.SIGNAL__SIGNAL_FSTR:
				return signalFstr != null;
			case SignalePackage.SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS:
				return signalFstrAusInselgleis != null;
			case SignalePackage.SIGNAL__SIGNAL_FSTR_S:
				return signalFstrS != null;
			case SignalePackage.SIGNAL__SIGNAL_FIKTIV:
				return signalFiktiv != null;
			case SignalePackage.SIGNAL__SIGNAL_REAL:
				return signalReal != null;
		}
		return super.eIsSet(featureID);
	}

} //SignalImpl
