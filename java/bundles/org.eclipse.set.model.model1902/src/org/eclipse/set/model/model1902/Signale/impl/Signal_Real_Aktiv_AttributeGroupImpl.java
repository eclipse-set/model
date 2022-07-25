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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Signale.Auto_Einstellung_TypeClass;
import org.eclipse.set.model.model1902.Signale.Signal_Funktion_TypeClass;
import org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup;
import org.eclipse.set.model.model1902.Signale.SignalePackage;
import org.eclipse.set.model.model1902.Signale.Signalsicht_Erreichbar_TypeClass;
import org.eclipse.set.model.model1902.Signale.Signalsicht_Mindest_TypeClass;
import org.eclipse.set.model.model1902.Signale.Signalsicht_Soll_TypeClass;
import org.eclipse.set.model.model1902.Signale.Sonstige_Zulaessige_Anordnung_TypeClass;
import org.eclipse.set.model.model1902.Signale.Tunnelsignal_TypeClass;

import org.eclipse.set.model.model1902.Verweise.ID_Stellelement_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Real Aktiv Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl#getAutoEinstellung <em>Auto Einstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl#getIDStellelement <em>ID Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl#getSignalFunktion <em>Signal Funktion</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl#getSignalsichtErreichbar <em>Signalsicht Erreichbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl#getSignalsichtMindest <em>Signalsicht Mindest</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl#getSignalsichtSoll <em>Signalsicht Soll</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl#getSonstigeZulaessigeAnordnung <em>Sonstige Zulaessige Anordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl#getTunnelsignal <em>Tunnelsignal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Real_Aktiv_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Signal_Real_Aktiv_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAutoEinstellung() <em>Auto Einstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoEinstellung()
	 * @generated
	 * @ordered
	 */
	protected Auto_Einstellung_TypeClass autoEinstellung;

	/**
	 * The cached value of the '{@link #getIDStellelement() <em>ID Stellelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStellelement()
	 * @generated
	 * @ordered
	 */
	protected ID_Stellelement_TypeClass iDStellelement;

	/**
	 * The cached value of the '{@link #getSignalFunktion() <em>Signal Funktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalFunktion()
	 * @generated
	 * @ordered
	 */
	protected Signal_Funktion_TypeClass signalFunktion;

	/**
	 * The cached value of the '{@link #getSignalsichtErreichbar() <em>Signalsicht Erreichbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalsichtErreichbar()
	 * @generated
	 * @ordered
	 */
	protected Signalsicht_Erreichbar_TypeClass signalsichtErreichbar;

	/**
	 * The cached value of the '{@link #getSignalsichtMindest() <em>Signalsicht Mindest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalsichtMindest()
	 * @generated
	 * @ordered
	 */
	protected Signalsicht_Mindest_TypeClass signalsichtMindest;

	/**
	 * The cached value of the '{@link #getSignalsichtSoll() <em>Signalsicht Soll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalsichtSoll()
	 * @generated
	 * @ordered
	 */
	protected Signalsicht_Soll_TypeClass signalsichtSoll;

	/**
	 * The cached value of the '{@link #getSonstigeZulaessigeAnordnung() <em>Sonstige Zulaessige Anordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonstigeZulaessigeAnordnung()
	 * @generated
	 * @ordered
	 */
	protected Sonstige_Zulaessige_Anordnung_TypeClass sonstigeZulaessigeAnordnung;

	/**
	 * The cached value of the '{@link #getTunnelsignal() <em>Tunnelsignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTunnelsignal()
	 * @generated
	 * @ordered
	 */
	protected Tunnelsignal_TypeClass tunnelsignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Real_Aktiv_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Auto_Einstellung_TypeClass getAutoEinstellung() {
		return autoEinstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoEinstellung(Auto_Einstellung_TypeClass newAutoEinstellung, NotificationChain msgs) {
		Auto_Einstellung_TypeClass oldAutoEinstellung = autoEinstellung;
		autoEinstellung = newAutoEinstellung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG, oldAutoEinstellung, newAutoEinstellung);
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
	public void setAutoEinstellung(Auto_Einstellung_TypeClass newAutoEinstellung) {
		if (newAutoEinstellung != autoEinstellung) {
			NotificationChain msgs = null;
			if (autoEinstellung != null)
				msgs = ((InternalEObject)autoEinstellung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG, null, msgs);
			if (newAutoEinstellung != null)
				msgs = ((InternalEObject)newAutoEinstellung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG, null, msgs);
			msgs = basicSetAutoEinstellung(newAutoEinstellung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG, newAutoEinstellung, newAutoEinstellung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Stellelement_TypeClass getIDStellelement() {
		return iDStellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDStellelement(ID_Stellelement_TypeClass newIDStellelement, NotificationChain msgs) {
		ID_Stellelement_TypeClass oldIDStellelement = iDStellelement;
		iDStellelement = newIDStellelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__ID_STELLELEMENT, oldIDStellelement, newIDStellelement);
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
	public void setIDStellelement(ID_Stellelement_TypeClass newIDStellelement) {
		if (newIDStellelement != iDStellelement) {
			NotificationChain msgs = null;
			if (iDStellelement != null)
				msgs = ((InternalEObject)iDStellelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__ID_STELLELEMENT, null, msgs);
			if (newIDStellelement != null)
				msgs = ((InternalEObject)newIDStellelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__ID_STELLELEMENT, null, msgs);
			msgs = basicSetIDStellelement(newIDStellelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__ID_STELLELEMENT, newIDStellelement, newIDStellelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Funktion_TypeClass getSignalFunktion() {
		return signalFunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalFunktion(Signal_Funktion_TypeClass newSignalFunktion, NotificationChain msgs) {
		Signal_Funktion_TypeClass oldSignalFunktion = signalFunktion;
		signalFunktion = newSignalFunktion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNAL_FUNKTION, oldSignalFunktion, newSignalFunktion);
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
	public void setSignalFunktion(Signal_Funktion_TypeClass newSignalFunktion) {
		if (newSignalFunktion != signalFunktion) {
			NotificationChain msgs = null;
			if (signalFunktion != null)
				msgs = ((InternalEObject)signalFunktion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNAL_FUNKTION, null, msgs);
			if (newSignalFunktion != null)
				msgs = ((InternalEObject)newSignalFunktion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNAL_FUNKTION, null, msgs);
			msgs = basicSetSignalFunktion(newSignalFunktion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNAL_FUNKTION, newSignalFunktion, newSignalFunktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalsicht_Erreichbar_TypeClass getSignalsichtErreichbar() {
		return signalsichtErreichbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalsichtErreichbar(Signalsicht_Erreichbar_TypeClass newSignalsichtErreichbar, NotificationChain msgs) {
		Signalsicht_Erreichbar_TypeClass oldSignalsichtErreichbar = signalsichtErreichbar;
		signalsichtErreichbar = newSignalsichtErreichbar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR, oldSignalsichtErreichbar, newSignalsichtErreichbar);
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
	public void setSignalsichtErreichbar(Signalsicht_Erreichbar_TypeClass newSignalsichtErreichbar) {
		if (newSignalsichtErreichbar != signalsichtErreichbar) {
			NotificationChain msgs = null;
			if (signalsichtErreichbar != null)
				msgs = ((InternalEObject)signalsichtErreichbar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR, null, msgs);
			if (newSignalsichtErreichbar != null)
				msgs = ((InternalEObject)newSignalsichtErreichbar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR, null, msgs);
			msgs = basicSetSignalsichtErreichbar(newSignalsichtErreichbar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR, newSignalsichtErreichbar, newSignalsichtErreichbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalsicht_Mindest_TypeClass getSignalsichtMindest() {
		return signalsichtMindest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalsichtMindest(Signalsicht_Mindest_TypeClass newSignalsichtMindest, NotificationChain msgs) {
		Signalsicht_Mindest_TypeClass oldSignalsichtMindest = signalsichtMindest;
		signalsichtMindest = newSignalsichtMindest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST, oldSignalsichtMindest, newSignalsichtMindest);
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
	public void setSignalsichtMindest(Signalsicht_Mindest_TypeClass newSignalsichtMindest) {
		if (newSignalsichtMindest != signalsichtMindest) {
			NotificationChain msgs = null;
			if (signalsichtMindest != null)
				msgs = ((InternalEObject)signalsichtMindest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST, null, msgs);
			if (newSignalsichtMindest != null)
				msgs = ((InternalEObject)newSignalsichtMindest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST, null, msgs);
			msgs = basicSetSignalsichtMindest(newSignalsichtMindest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST, newSignalsichtMindest, newSignalsichtMindest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalsicht_Soll_TypeClass getSignalsichtSoll() {
		return signalsichtSoll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalsichtSoll(Signalsicht_Soll_TypeClass newSignalsichtSoll, NotificationChain msgs) {
		Signalsicht_Soll_TypeClass oldSignalsichtSoll = signalsichtSoll;
		signalsichtSoll = newSignalsichtSoll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL, oldSignalsichtSoll, newSignalsichtSoll);
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
	public void setSignalsichtSoll(Signalsicht_Soll_TypeClass newSignalsichtSoll) {
		if (newSignalsichtSoll != signalsichtSoll) {
			NotificationChain msgs = null;
			if (signalsichtSoll != null)
				msgs = ((InternalEObject)signalsichtSoll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL, null, msgs);
			if (newSignalsichtSoll != null)
				msgs = ((InternalEObject)newSignalsichtSoll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL, null, msgs);
			msgs = basicSetSignalsichtSoll(newSignalsichtSoll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL, newSignalsichtSoll, newSignalsichtSoll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sonstige_Zulaessige_Anordnung_TypeClass getSonstigeZulaessigeAnordnung() {
		return sonstigeZulaessigeAnordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSonstigeZulaessigeAnordnung(Sonstige_Zulaessige_Anordnung_TypeClass newSonstigeZulaessigeAnordnung, NotificationChain msgs) {
		Sonstige_Zulaessige_Anordnung_TypeClass oldSonstigeZulaessigeAnordnung = sonstigeZulaessigeAnordnung;
		sonstigeZulaessigeAnordnung = newSonstigeZulaessigeAnordnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SONSTIGE_ZULAESSIGE_ANORDNUNG, oldSonstigeZulaessigeAnordnung, newSonstigeZulaessigeAnordnung);
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
	public void setSonstigeZulaessigeAnordnung(Sonstige_Zulaessige_Anordnung_TypeClass newSonstigeZulaessigeAnordnung) {
		if (newSonstigeZulaessigeAnordnung != sonstigeZulaessigeAnordnung) {
			NotificationChain msgs = null;
			if (sonstigeZulaessigeAnordnung != null)
				msgs = ((InternalEObject)sonstigeZulaessigeAnordnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SONSTIGE_ZULAESSIGE_ANORDNUNG, null, msgs);
			if (newSonstigeZulaessigeAnordnung != null)
				msgs = ((InternalEObject)newSonstigeZulaessigeAnordnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SONSTIGE_ZULAESSIGE_ANORDNUNG, null, msgs);
			msgs = basicSetSonstigeZulaessigeAnordnung(newSonstigeZulaessigeAnordnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SONSTIGE_ZULAESSIGE_ANORDNUNG, newSonstigeZulaessigeAnordnung, newSonstigeZulaessigeAnordnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tunnelsignal_TypeClass getTunnelsignal() {
		return tunnelsignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTunnelsignal(Tunnelsignal_TypeClass newTunnelsignal, NotificationChain msgs) {
		Tunnelsignal_TypeClass oldTunnelsignal = tunnelsignal;
		tunnelsignal = newTunnelsignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__TUNNELSIGNAL, oldTunnelsignal, newTunnelsignal);
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
	public void setTunnelsignal(Tunnelsignal_TypeClass newTunnelsignal) {
		if (newTunnelsignal != tunnelsignal) {
			NotificationChain msgs = null;
			if (tunnelsignal != null)
				msgs = ((InternalEObject)tunnelsignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__TUNNELSIGNAL, null, msgs);
			if (newTunnelsignal != null)
				msgs = ((InternalEObject)newTunnelsignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__TUNNELSIGNAL, null, msgs);
			msgs = basicSetTunnelsignal(newTunnelsignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__TUNNELSIGNAL, newTunnelsignal, newTunnelsignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG:
				return basicSetAutoEinstellung(null, msgs);
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__ID_STELLELEMENT:
				return basicSetIDStellelement(null, msgs);
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNAL_FUNKTION:
				return basicSetSignalFunktion(null, msgs);
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR:
				return basicSetSignalsichtErreichbar(null, msgs);
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST:
				return basicSetSignalsichtMindest(null, msgs);
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL:
				return basicSetSignalsichtSoll(null, msgs);
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SONSTIGE_ZULAESSIGE_ANORDNUNG:
				return basicSetSonstigeZulaessigeAnordnung(null, msgs);
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__TUNNELSIGNAL:
				return basicSetTunnelsignal(null, msgs);
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
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG:
				return getAutoEinstellung();
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__ID_STELLELEMENT:
				return getIDStellelement();
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNAL_FUNKTION:
				return getSignalFunktion();
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR:
				return getSignalsichtErreichbar();
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST:
				return getSignalsichtMindest();
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL:
				return getSignalsichtSoll();
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SONSTIGE_ZULAESSIGE_ANORDNUNG:
				return getSonstigeZulaessigeAnordnung();
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__TUNNELSIGNAL:
				return getTunnelsignal();
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
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG:
				setAutoEinstellung((Auto_Einstellung_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__ID_STELLELEMENT:
				setIDStellelement((ID_Stellelement_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNAL_FUNKTION:
				setSignalFunktion((Signal_Funktion_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR:
				setSignalsichtErreichbar((Signalsicht_Erreichbar_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST:
				setSignalsichtMindest((Signalsicht_Mindest_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL:
				setSignalsichtSoll((Signalsicht_Soll_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SONSTIGE_ZULAESSIGE_ANORDNUNG:
				setSonstigeZulaessigeAnordnung((Sonstige_Zulaessige_Anordnung_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__TUNNELSIGNAL:
				setTunnelsignal((Tunnelsignal_TypeClass)newValue);
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
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG:
				setAutoEinstellung((Auto_Einstellung_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__ID_STELLELEMENT:
				setIDStellelement((ID_Stellelement_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNAL_FUNKTION:
				setSignalFunktion((Signal_Funktion_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR:
				setSignalsichtErreichbar((Signalsicht_Erreichbar_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST:
				setSignalsichtMindest((Signalsicht_Mindest_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL:
				setSignalsichtSoll((Signalsicht_Soll_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SONSTIGE_ZULAESSIGE_ANORDNUNG:
				setSonstigeZulaessigeAnordnung((Sonstige_Zulaessige_Anordnung_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__TUNNELSIGNAL:
				setTunnelsignal((Tunnelsignal_TypeClass)null);
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
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG:
				return autoEinstellung != null;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__ID_STELLELEMENT:
				return iDStellelement != null;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNAL_FUNKTION:
				return signalFunktion != null;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR:
				return signalsichtErreichbar != null;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST:
				return signalsichtMindest != null;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL:
				return signalsichtSoll != null;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SONSTIGE_ZULAESSIGE_ANORDNUNG:
				return sonstigeZulaessigeAnordnung != null;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__TUNNELSIGNAL:
				return tunnelsignal != null;
		}
		return super.eIsSet(featureID);
	}

} //Signal_Real_Aktiv_AttributeGroupImpl
