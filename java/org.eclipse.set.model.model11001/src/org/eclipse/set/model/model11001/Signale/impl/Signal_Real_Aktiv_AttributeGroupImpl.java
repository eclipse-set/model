/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Signale.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Signale.Auto_Einstellung_TypeClass;
import org.eclipse.set.model.model11001.Signale.Signal_Real_Aktiv_AttributeGroup;
import org.eclipse.set.model.model11001.Signale.SignalePackage;
import org.eclipse.set.model.model11001.Signale.Sonstige_Zulaessige_Anordnung_TypeClass;
import org.eclipse.set.model.model11001.Signale.Tunnelsignal_TypeClass;

import org.eclipse.set.model.model11001.Verweise.ID_Stellelement_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Real Aktiv Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl#getAutoEinstellung <em>Auto Einstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl#getIDStellelement <em>ID Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl#getSonstigeZulaessigeAnordnung <em>Sonstige Zulaessige Anordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_Aktiv_AttributeGroupImpl#getTunnelsignal <em>Tunnelsignal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Real_Aktiv_AttributeGroupImpl extends EObjectImpl implements Signal_Real_Aktiv_AttributeGroup {
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
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__SONSTIGE_ZULAESSIGE_ANORDNUNG:
				return sonstigeZulaessigeAnordnung != null;
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP__TUNNELSIGNAL:
				return tunnelsignal != null;
		}
		return super.eIsSet(featureID);
	}

} //Signal_Real_Aktiv_AttributeGroupImpl
