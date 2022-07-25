/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Gleis.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Bereich_ObjektImpl;

import org.eclipse.set.model.model1902.Gleis.Baubereich_Art_TypeClass;
import org.eclipse.set.model.model1902.Gleis.GleisPackage;
import org.eclipse.set.model.model1902.Gleis.Gleis_Baubereich;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gleis Baubereich</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Gleis.impl.Gleis_BaubereichImpl#getBaubereichArt <em>Baubereich Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Gleis_BaubereichImpl extends Bereich_ObjektImpl implements Gleis_Baubereich {
	/**
	 * The cached value of the '{@link #getBaubereichArt() <em>Baubereich Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaubereichArt()
	 * @generated
	 * @ordered
	 */
	protected Baubereich_Art_TypeClass baubereichArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gleis_BaubereichImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GleisPackage.Literals.GLEIS_BAUBEREICH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Baubereich_Art_TypeClass getBaubereichArt() {
		return baubereichArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaubereichArt(Baubereich_Art_TypeClass newBaubereichArt, NotificationChain msgs) {
		Baubereich_Art_TypeClass oldBaubereichArt = baubereichArt;
		baubereichArt = newBaubereichArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_BAUBEREICH__BAUBEREICH_ART, oldBaubereichArt, newBaubereichArt);
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
	public void setBaubereichArt(Baubereich_Art_TypeClass newBaubereichArt) {
		if (newBaubereichArt != baubereichArt) {
			NotificationChain msgs = null;
			if (baubereichArt != null)
				msgs = ((InternalEObject)baubereichArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_BAUBEREICH__BAUBEREICH_ART, null, msgs);
			if (newBaubereichArt != null)
				msgs = ((InternalEObject)newBaubereichArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_BAUBEREICH__BAUBEREICH_ART, null, msgs);
			msgs = basicSetBaubereichArt(newBaubereichArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_BAUBEREICH__BAUBEREICH_ART, newBaubereichArt, newBaubereichArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GleisPackage.GLEIS_BAUBEREICH__BAUBEREICH_ART:
				return basicSetBaubereichArt(null, msgs);
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
			case GleisPackage.GLEIS_BAUBEREICH__BAUBEREICH_ART:
				return getBaubereichArt();
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
			case GleisPackage.GLEIS_BAUBEREICH__BAUBEREICH_ART:
				setBaubereichArt((Baubereich_Art_TypeClass)newValue);
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
			case GleisPackage.GLEIS_BAUBEREICH__BAUBEREICH_ART:
				setBaubereichArt((Baubereich_Art_TypeClass)null);
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
			case GleisPackage.GLEIS_BAUBEREICH__BAUBEREICH_ART:
				return baubereichArt != null;
		}
		return super.eIsSet(featureID);
	}

} //Gleis_BaubereichImpl
