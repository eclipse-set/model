/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Signale.Befestigung_Art_TypeClass;
import org.eclipse.set.model.planpro.Signale.Fundament_Art_TypeClass;
import org.eclipse.set.model.planpro.Signale.Hoehe_Fundamentoberkante_TypeClass;
import org.eclipse.set.model.planpro.Signale.Obere_Lichtpunkthoehe_TypeClass;
import org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.SignalePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Befestigung Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Befestigung_Allg_AttributeGroupImpl#getBefestigungArt <em>Befestigung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Befestigung_Allg_AttributeGroupImpl#getFundamentArt <em>Fundament Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Befestigung_Allg_AttributeGroupImpl#getHoeheFundamentoberkante <em>Hoehe Fundamentoberkante</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Befestigung_Allg_AttributeGroupImpl#getObereLichtpunkthoehe <em>Obere Lichtpunkthoehe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Befestigung_Allg_AttributeGroupImpl extends EObjectImpl implements Signal_Befestigung_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBefestigungArt() <em>Befestigung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefestigungArt()
	 * @generated
	 * @ordered
	 */
	protected Befestigung_Art_TypeClass befestigungArt;

	/**
	 * The cached value of the '{@link #getFundamentArt() <em>Fundament Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundamentArt()
	 * @generated
	 * @ordered
	 */
	protected Fundament_Art_TypeClass fundamentArt;

	/**
	 * The cached value of the '{@link #getHoeheFundamentoberkante() <em>Hoehe Fundamentoberkante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheFundamentoberkante()
	 * @generated
	 * @ordered
	 */
	protected Hoehe_Fundamentoberkante_TypeClass hoeheFundamentoberkante;

	/**
	 * The cached value of the '{@link #getObereLichtpunkthoehe() <em>Obere Lichtpunkthoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObereLichtpunkthoehe()
	 * @generated
	 * @ordered
	 */
	protected Obere_Lichtpunkthoehe_TypeClass obereLichtpunkthoehe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Befestigung_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Befestigung_Art_TypeClass getBefestigungArt() {
		return befestigungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefestigungArt(Befestigung_Art_TypeClass newBefestigungArt, NotificationChain msgs) {
		Befestigung_Art_TypeClass oldBefestigungArt = befestigungArt;
		befestigungArt = newBefestigungArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__BEFESTIGUNG_ART, oldBefestigungArt, newBefestigungArt);
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
	public void setBefestigungArt(Befestigung_Art_TypeClass newBefestigungArt) {
		if (newBefestigungArt != befestigungArt) {
			NotificationChain msgs = null;
			if (befestigungArt != null)
				msgs = ((InternalEObject)befestigungArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__BEFESTIGUNG_ART, null, msgs);
			if (newBefestigungArt != null)
				msgs = ((InternalEObject)newBefestigungArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__BEFESTIGUNG_ART, null, msgs);
			msgs = basicSetBefestigungArt(newBefestigungArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__BEFESTIGUNG_ART, newBefestigungArt, newBefestigungArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fundament_Art_TypeClass getFundamentArt() {
		return fundamentArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFundamentArt(Fundament_Art_TypeClass newFundamentArt, NotificationChain msgs) {
		Fundament_Art_TypeClass oldFundamentArt = fundamentArt;
		fundamentArt = newFundamentArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__FUNDAMENT_ART, oldFundamentArt, newFundamentArt);
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
	public void setFundamentArt(Fundament_Art_TypeClass newFundamentArt) {
		if (newFundamentArt != fundamentArt) {
			NotificationChain msgs = null;
			if (fundamentArt != null)
				msgs = ((InternalEObject)fundamentArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__FUNDAMENT_ART, null, msgs);
			if (newFundamentArt != null)
				msgs = ((InternalEObject)newFundamentArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__FUNDAMENT_ART, null, msgs);
			msgs = basicSetFundamentArt(newFundamentArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__FUNDAMENT_ART, newFundamentArt, newFundamentArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehe_Fundamentoberkante_TypeClass getHoeheFundamentoberkante() {
		return hoeheFundamentoberkante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoeheFundamentoberkante(Hoehe_Fundamentoberkante_TypeClass newHoeheFundamentoberkante, NotificationChain msgs) {
		Hoehe_Fundamentoberkante_TypeClass oldHoeheFundamentoberkante = hoeheFundamentoberkante;
		hoeheFundamentoberkante = newHoeheFundamentoberkante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__HOEHE_FUNDAMENTOBERKANTE, oldHoeheFundamentoberkante, newHoeheFundamentoberkante);
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
	public void setHoeheFundamentoberkante(Hoehe_Fundamentoberkante_TypeClass newHoeheFundamentoberkante) {
		if (newHoeheFundamentoberkante != hoeheFundamentoberkante) {
			NotificationChain msgs = null;
			if (hoeheFundamentoberkante != null)
				msgs = ((InternalEObject)hoeheFundamentoberkante).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__HOEHE_FUNDAMENTOBERKANTE, null, msgs);
			if (newHoeheFundamentoberkante != null)
				msgs = ((InternalEObject)newHoeheFundamentoberkante).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__HOEHE_FUNDAMENTOBERKANTE, null, msgs);
			msgs = basicSetHoeheFundamentoberkante(newHoeheFundamentoberkante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__HOEHE_FUNDAMENTOBERKANTE, newHoeheFundamentoberkante, newHoeheFundamentoberkante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Obere_Lichtpunkthoehe_TypeClass getObereLichtpunkthoehe() {
		return obereLichtpunkthoehe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObereLichtpunkthoehe(Obere_Lichtpunkthoehe_TypeClass newObereLichtpunkthoehe, NotificationChain msgs) {
		Obere_Lichtpunkthoehe_TypeClass oldObereLichtpunkthoehe = obereLichtpunkthoehe;
		obereLichtpunkthoehe = newObereLichtpunkthoehe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__OBERE_LICHTPUNKTHOEHE, oldObereLichtpunkthoehe, newObereLichtpunkthoehe);
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
	public void setObereLichtpunkthoehe(Obere_Lichtpunkthoehe_TypeClass newObereLichtpunkthoehe) {
		if (newObereLichtpunkthoehe != obereLichtpunkthoehe) {
			NotificationChain msgs = null;
			if (obereLichtpunkthoehe != null)
				msgs = ((InternalEObject)obereLichtpunkthoehe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__OBERE_LICHTPUNKTHOEHE, null, msgs);
			if (newObereLichtpunkthoehe != null)
				msgs = ((InternalEObject)newObereLichtpunkthoehe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__OBERE_LICHTPUNKTHOEHE, null, msgs);
			msgs = basicSetObereLichtpunkthoehe(newObereLichtpunkthoehe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__OBERE_LICHTPUNKTHOEHE, newObereLichtpunkthoehe, newObereLichtpunkthoehe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__BEFESTIGUNG_ART:
				return basicSetBefestigungArt(null, msgs);
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__FUNDAMENT_ART:
				return basicSetFundamentArt(null, msgs);
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__HOEHE_FUNDAMENTOBERKANTE:
				return basicSetHoeheFundamentoberkante(null, msgs);
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__OBERE_LICHTPUNKTHOEHE:
				return basicSetObereLichtpunkthoehe(null, msgs);
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
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__BEFESTIGUNG_ART:
				return getBefestigungArt();
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__FUNDAMENT_ART:
				return getFundamentArt();
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__HOEHE_FUNDAMENTOBERKANTE:
				return getHoeheFundamentoberkante();
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__OBERE_LICHTPUNKTHOEHE:
				return getObereLichtpunkthoehe();
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
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__BEFESTIGUNG_ART:
				setBefestigungArt((Befestigung_Art_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__FUNDAMENT_ART:
				setFundamentArt((Fundament_Art_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__HOEHE_FUNDAMENTOBERKANTE:
				setHoeheFundamentoberkante((Hoehe_Fundamentoberkante_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__OBERE_LICHTPUNKTHOEHE:
				setObereLichtpunkthoehe((Obere_Lichtpunkthoehe_TypeClass)newValue);
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
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__BEFESTIGUNG_ART:
				setBefestigungArt((Befestigung_Art_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__FUNDAMENT_ART:
				setFundamentArt((Fundament_Art_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__HOEHE_FUNDAMENTOBERKANTE:
				setHoeheFundamentoberkante((Hoehe_Fundamentoberkante_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__OBERE_LICHTPUNKTHOEHE:
				setObereLichtpunkthoehe((Obere_Lichtpunkthoehe_TypeClass)null);
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
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__BEFESTIGUNG_ART:
				return befestigungArt != null;
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__FUNDAMENT_ART:
				return fundamentArt != null;
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__HOEHE_FUNDAMENTOBERKANTE:
				return hoeheFundamentoberkante != null;
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP__OBERE_LICHTPUNKTHOEHE:
				return obereLichtpunkthoehe != null;
		}
		return super.eIsSet(featureID);
	}

} //Signal_Befestigung_Allg_AttributeGroupImpl
