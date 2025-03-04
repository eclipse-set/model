/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Reduziert_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Massgebende_Neigung_Mind_Sig_150_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Massgebende_Neigung_Mind_Sig_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Solllaenge_Mind_Sig_150_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Solllaenge_Mind_Sig_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZBS Signal Signalabstand Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZBS_Signal_Signalabstand_AttributeGroupImpl#getAbstandReduziert <em>Abstand Reduziert</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZBS_Signal_Signalabstand_AttributeGroupImpl#getMassgebendeNeigungMindSig <em>Massgebende Neigung Mind Sig</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZBS_Signal_Signalabstand_AttributeGroupImpl#getMassgebendeNeigungMindSig150 <em>Massgebende Neigung Mind Sig150</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZBS_Signal_Signalabstand_AttributeGroupImpl#getSolllaengeMindSig <em>Solllaenge Mind Sig</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZBS_Signal_Signalabstand_AttributeGroupImpl#getSolllaengeMindSig150 <em>Solllaenge Mind Sig150</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZBS_Signal_Signalabstand_AttributeGroupImpl extends EObjectImpl implements ZBS_Signal_Signalabstand_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAbstandReduziert() <em>Abstand Reduziert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandReduziert()
	 * @generated
	 * @ordered
	 */
	protected Abstand_Reduziert_TypeClass abstandReduziert;

	/**
	 * The cached value of the '{@link #getMassgebendeNeigungMindSig() <em>Massgebende Neigung Mind Sig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassgebendeNeigungMindSig()
	 * @generated
	 * @ordered
	 */
	protected Massgebende_Neigung_Mind_Sig_TypeClass massgebendeNeigungMindSig;

	/**
	 * The cached value of the '{@link #getMassgebendeNeigungMindSig150() <em>Massgebende Neigung Mind Sig150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassgebendeNeigungMindSig150()
	 * @generated
	 * @ordered
	 */
	protected Massgebende_Neigung_Mind_Sig_150_TypeClass massgebendeNeigungMindSig150;

	/**
	 * The cached value of the '{@link #getSolllaengeMindSig() <em>Solllaenge Mind Sig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolllaengeMindSig()
	 * @generated
	 * @ordered
	 */
	protected Solllaenge_Mind_Sig_TypeClass solllaengeMindSig;

	/**
	 * The cached value of the '{@link #getSolllaengeMindSig150() <em>Solllaenge Mind Sig150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolllaengeMindSig150()
	 * @generated
	 * @ordered
	 */
	protected Solllaenge_Mind_Sig_150_TypeClass solllaengeMindSig150;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZBS_Signal_Signalabstand_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Signal_Signalabstand_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Reduziert_TypeClass getAbstandReduziert() {
		return abstandReduziert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandReduziert(Abstand_Reduziert_TypeClass newAbstandReduziert, NotificationChain msgs) {
		Abstand_Reduziert_TypeClass oldAbstandReduziert = abstandReduziert;
		abstandReduziert = newAbstandReduziert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__ABSTAND_REDUZIERT, oldAbstandReduziert, newAbstandReduziert);
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
	public void setAbstandReduziert(Abstand_Reduziert_TypeClass newAbstandReduziert) {
		if (newAbstandReduziert != abstandReduziert) {
			NotificationChain msgs = null;
			if (abstandReduziert != null)
				msgs = ((InternalEObject)abstandReduziert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__ABSTAND_REDUZIERT, null, msgs);
			if (newAbstandReduziert != null)
				msgs = ((InternalEObject)newAbstandReduziert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__ABSTAND_REDUZIERT, null, msgs);
			msgs = basicSetAbstandReduziert(newAbstandReduziert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__ABSTAND_REDUZIERT, newAbstandReduziert, newAbstandReduziert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massgebende_Neigung_Mind_Sig_TypeClass getMassgebendeNeigungMindSig() {
		return massgebendeNeigungMindSig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassgebendeNeigungMindSig(Massgebende_Neigung_Mind_Sig_TypeClass newMassgebendeNeigungMindSig, NotificationChain msgs) {
		Massgebende_Neigung_Mind_Sig_TypeClass oldMassgebendeNeigungMindSig = massgebendeNeigungMindSig;
		massgebendeNeigungMindSig = newMassgebendeNeigungMindSig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG, oldMassgebendeNeigungMindSig, newMassgebendeNeigungMindSig);
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
	public void setMassgebendeNeigungMindSig(Massgebende_Neigung_Mind_Sig_TypeClass newMassgebendeNeigungMindSig) {
		if (newMassgebendeNeigungMindSig != massgebendeNeigungMindSig) {
			NotificationChain msgs = null;
			if (massgebendeNeigungMindSig != null)
				msgs = ((InternalEObject)massgebendeNeigungMindSig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG, null, msgs);
			if (newMassgebendeNeigungMindSig != null)
				msgs = ((InternalEObject)newMassgebendeNeigungMindSig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG, null, msgs);
			msgs = basicSetMassgebendeNeigungMindSig(newMassgebendeNeigungMindSig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG, newMassgebendeNeigungMindSig, newMassgebendeNeigungMindSig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massgebende_Neigung_Mind_Sig_150_TypeClass getMassgebendeNeigungMindSig150() {
		return massgebendeNeigungMindSig150;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassgebendeNeigungMindSig150(Massgebende_Neigung_Mind_Sig_150_TypeClass newMassgebendeNeigungMindSig150, NotificationChain msgs) {
		Massgebende_Neigung_Mind_Sig_150_TypeClass oldMassgebendeNeigungMindSig150 = massgebendeNeigungMindSig150;
		massgebendeNeigungMindSig150 = newMassgebendeNeigungMindSig150;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG150, oldMassgebendeNeigungMindSig150, newMassgebendeNeigungMindSig150);
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
	public void setMassgebendeNeigungMindSig150(Massgebende_Neigung_Mind_Sig_150_TypeClass newMassgebendeNeigungMindSig150) {
		if (newMassgebendeNeigungMindSig150 != massgebendeNeigungMindSig150) {
			NotificationChain msgs = null;
			if (massgebendeNeigungMindSig150 != null)
				msgs = ((InternalEObject)massgebendeNeigungMindSig150).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG150, null, msgs);
			if (newMassgebendeNeigungMindSig150 != null)
				msgs = ((InternalEObject)newMassgebendeNeigungMindSig150).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG150, null, msgs);
			msgs = basicSetMassgebendeNeigungMindSig150(newMassgebendeNeigungMindSig150, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG150, newMassgebendeNeigungMindSig150, newMassgebendeNeigungMindSig150));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Solllaenge_Mind_Sig_TypeClass getSolllaengeMindSig() {
		return solllaengeMindSig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolllaengeMindSig(Solllaenge_Mind_Sig_TypeClass newSolllaengeMindSig, NotificationChain msgs) {
		Solllaenge_Mind_Sig_TypeClass oldSolllaengeMindSig = solllaengeMindSig;
		solllaengeMindSig = newSolllaengeMindSig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG, oldSolllaengeMindSig, newSolllaengeMindSig);
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
	public void setSolllaengeMindSig(Solllaenge_Mind_Sig_TypeClass newSolllaengeMindSig) {
		if (newSolllaengeMindSig != solllaengeMindSig) {
			NotificationChain msgs = null;
			if (solllaengeMindSig != null)
				msgs = ((InternalEObject)solllaengeMindSig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG, null, msgs);
			if (newSolllaengeMindSig != null)
				msgs = ((InternalEObject)newSolllaengeMindSig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG, null, msgs);
			msgs = basicSetSolllaengeMindSig(newSolllaengeMindSig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG, newSolllaengeMindSig, newSolllaengeMindSig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Solllaenge_Mind_Sig_150_TypeClass getSolllaengeMindSig150() {
		return solllaengeMindSig150;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolllaengeMindSig150(Solllaenge_Mind_Sig_150_TypeClass newSolllaengeMindSig150, NotificationChain msgs) {
		Solllaenge_Mind_Sig_150_TypeClass oldSolllaengeMindSig150 = solllaengeMindSig150;
		solllaengeMindSig150 = newSolllaengeMindSig150;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG150, oldSolllaengeMindSig150, newSolllaengeMindSig150);
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
	public void setSolllaengeMindSig150(Solllaenge_Mind_Sig_150_TypeClass newSolllaengeMindSig150) {
		if (newSolllaengeMindSig150 != solllaengeMindSig150) {
			NotificationChain msgs = null;
			if (solllaengeMindSig150 != null)
				msgs = ((InternalEObject)solllaengeMindSig150).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG150, null, msgs);
			if (newSolllaengeMindSig150 != null)
				msgs = ((InternalEObject)newSolllaengeMindSig150).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG150, null, msgs);
			msgs = basicSetSolllaengeMindSig150(newSolllaengeMindSig150, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG150, newSolllaengeMindSig150, newSolllaengeMindSig150));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__ABSTAND_REDUZIERT:
				return basicSetAbstandReduziert(null, msgs);
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG:
				return basicSetMassgebendeNeigungMindSig(null, msgs);
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG150:
				return basicSetMassgebendeNeigungMindSig150(null, msgs);
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG:
				return basicSetSolllaengeMindSig(null, msgs);
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG150:
				return basicSetSolllaengeMindSig150(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__ABSTAND_REDUZIERT:
				return getAbstandReduziert();
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG:
				return getMassgebendeNeigungMindSig();
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG150:
				return getMassgebendeNeigungMindSig150();
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG:
				return getSolllaengeMindSig();
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG150:
				return getSolllaengeMindSig150();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__ABSTAND_REDUZIERT:
				setAbstandReduziert((Abstand_Reduziert_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG:
				setMassgebendeNeigungMindSig((Massgebende_Neigung_Mind_Sig_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG150:
				setMassgebendeNeigungMindSig150((Massgebende_Neigung_Mind_Sig_150_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG:
				setSolllaengeMindSig((Solllaenge_Mind_Sig_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG150:
				setSolllaengeMindSig150((Solllaenge_Mind_Sig_150_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__ABSTAND_REDUZIERT:
				setAbstandReduziert((Abstand_Reduziert_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG:
				setMassgebendeNeigungMindSig((Massgebende_Neigung_Mind_Sig_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG150:
				setMassgebendeNeigungMindSig150((Massgebende_Neigung_Mind_Sig_150_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG:
				setSolllaengeMindSig((Solllaenge_Mind_Sig_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG150:
				setSolllaengeMindSig150((Solllaenge_Mind_Sig_150_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__ABSTAND_REDUZIERT:
				return abstandReduziert != null;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG:
				return massgebendeNeigungMindSig != null;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG150:
				return massgebendeNeigungMindSig150 != null;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG:
				return solllaengeMindSig != null;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG150:
				return solllaengeMindSig150 != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZBS_Signal_Signalabstand_AttributeGroupImpl
