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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_TBV_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.TBV_Meldepunkt_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.TBV_Tunnelbereich_Laenge_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.TBV_Tunnelsignal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS Signal TBV Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.ETCS_Signal_TBV_AttributeGroupImpl#getTBVMeldepunkt <em>TBV Meldepunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.ETCS_Signal_TBV_AttributeGroupImpl#getTBVTunnelbereichLaenge <em>TBV Tunnelbereich Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.ETCS_Signal_TBV_AttributeGroupImpl#getTBVTunnelsignal <em>TBV Tunnelsignal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_Signal_TBV_AttributeGroupImpl extends EObjectImpl implements ETCS_Signal_TBV_AttributeGroup {
	/**
	 * The cached value of the '{@link #getTBVMeldepunkt() <em>TBV Meldepunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTBVMeldepunkt()
	 * @generated
	 * @ordered
	 */
	protected TBV_Meldepunkt_TypeClass tBVMeldepunkt;

	/**
	 * The cached value of the '{@link #getTBVTunnelbereichLaenge() <em>TBV Tunnelbereich Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTBVTunnelbereichLaenge()
	 * @generated
	 * @ordered
	 */
	protected TBV_Tunnelbereich_Laenge_TypeClass tBVTunnelbereichLaenge;

	/**
	 * The cached value of the '{@link #getTBVTunnelsignal() <em>TBV Tunnelsignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTBVTunnelsignal()
	 * @generated
	 * @ordered
	 */
	protected TBV_Tunnelsignal_TypeClass tBVTunnelsignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_Signal_TBV_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_TBV_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBV_Meldepunkt_TypeClass getTBVMeldepunkt() {
		return tBVMeldepunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTBVMeldepunkt(TBV_Meldepunkt_TypeClass newTBVMeldepunkt, NotificationChain msgs) {
		TBV_Meldepunkt_TypeClass oldTBVMeldepunkt = tBVMeldepunkt;
		tBVMeldepunkt = newTBVMeldepunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_MELDEPUNKT, oldTBVMeldepunkt, newTBVMeldepunkt);
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
	public void setTBVMeldepunkt(TBV_Meldepunkt_TypeClass newTBVMeldepunkt) {
		if (newTBVMeldepunkt != tBVMeldepunkt) {
			NotificationChain msgs = null;
			if (tBVMeldepunkt != null)
				msgs = ((InternalEObject)tBVMeldepunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_MELDEPUNKT, null, msgs);
			if (newTBVMeldepunkt != null)
				msgs = ((InternalEObject)newTBVMeldepunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_MELDEPUNKT, null, msgs);
			msgs = basicSetTBVMeldepunkt(newTBVMeldepunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_MELDEPUNKT, newTBVMeldepunkt, newTBVMeldepunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBV_Tunnelbereich_Laenge_TypeClass getTBVTunnelbereichLaenge() {
		return tBVTunnelbereichLaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTBVTunnelbereichLaenge(TBV_Tunnelbereich_Laenge_TypeClass newTBVTunnelbereichLaenge, NotificationChain msgs) {
		TBV_Tunnelbereich_Laenge_TypeClass oldTBVTunnelbereichLaenge = tBVTunnelbereichLaenge;
		tBVTunnelbereichLaenge = newTBVTunnelbereichLaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELBEREICH_LAENGE, oldTBVTunnelbereichLaenge, newTBVTunnelbereichLaenge);
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
	public void setTBVTunnelbereichLaenge(TBV_Tunnelbereich_Laenge_TypeClass newTBVTunnelbereichLaenge) {
		if (newTBVTunnelbereichLaenge != tBVTunnelbereichLaenge) {
			NotificationChain msgs = null;
			if (tBVTunnelbereichLaenge != null)
				msgs = ((InternalEObject)tBVTunnelbereichLaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELBEREICH_LAENGE, null, msgs);
			if (newTBVTunnelbereichLaenge != null)
				msgs = ((InternalEObject)newTBVTunnelbereichLaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELBEREICH_LAENGE, null, msgs);
			msgs = basicSetTBVTunnelbereichLaenge(newTBVTunnelbereichLaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELBEREICH_LAENGE, newTBVTunnelbereichLaenge, newTBVTunnelbereichLaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBV_Tunnelsignal_TypeClass getTBVTunnelsignal() {
		return tBVTunnelsignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTBVTunnelsignal(TBV_Tunnelsignal_TypeClass newTBVTunnelsignal, NotificationChain msgs) {
		TBV_Tunnelsignal_TypeClass oldTBVTunnelsignal = tBVTunnelsignal;
		tBVTunnelsignal = newTBVTunnelsignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELSIGNAL, oldTBVTunnelsignal, newTBVTunnelsignal);
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
	public void setTBVTunnelsignal(TBV_Tunnelsignal_TypeClass newTBVTunnelsignal) {
		if (newTBVTunnelsignal != tBVTunnelsignal) {
			NotificationChain msgs = null;
			if (tBVTunnelsignal != null)
				msgs = ((InternalEObject)tBVTunnelsignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELSIGNAL, null, msgs);
			if (newTBVTunnelsignal != null)
				msgs = ((InternalEObject)newTBVTunnelsignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELSIGNAL, null, msgs);
			msgs = basicSetTBVTunnelsignal(newTBVTunnelsignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELSIGNAL, newTBVTunnelsignal, newTBVTunnelsignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_MELDEPUNKT:
				return basicSetTBVMeldepunkt(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELBEREICH_LAENGE:
				return basicSetTBVTunnelbereichLaenge(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELSIGNAL:
				return basicSetTBVTunnelsignal(null, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_MELDEPUNKT:
				return getTBVMeldepunkt();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELBEREICH_LAENGE:
				return getTBVTunnelbereichLaenge();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELSIGNAL:
				return getTBVTunnelsignal();
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_MELDEPUNKT:
				setTBVMeldepunkt((TBV_Meldepunkt_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELBEREICH_LAENGE:
				setTBVTunnelbereichLaenge((TBV_Tunnelbereich_Laenge_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELSIGNAL:
				setTBVTunnelsignal((TBV_Tunnelsignal_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_MELDEPUNKT:
				setTBVMeldepunkt((TBV_Meldepunkt_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELBEREICH_LAENGE:
				setTBVTunnelbereichLaenge((TBV_Tunnelbereich_Laenge_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELSIGNAL:
				setTBVTunnelsignal((TBV_Tunnelsignal_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_MELDEPUNKT:
				return tBVMeldepunkt != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELBEREICH_LAENGE:
				return tBVTunnelbereichLaenge != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP__TBV_TUNNELSIGNAL:
				return tBVTunnelsignal != null;
		}
		return super.eIsSet(featureID);
	}

} //ETCS_Signal_TBV_AttributeGroupImpl
