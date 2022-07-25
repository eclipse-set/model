/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Geodaten.GeodatenPackage;
import org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Art_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Ab_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.Oertlichkeit_Gueltig_Bis_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oertlichkeit Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Allg_AttributeGroupImpl#getOertlichkeitArt <em>Oertlichkeit Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Allg_AttributeGroupImpl#getOertlichkeitGueltigAb <em>Oertlichkeit Gueltig Ab</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Oertlichkeit_Allg_AttributeGroupImpl#getOertlichkeitGueltigBis <em>Oertlichkeit Gueltig Bis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Oertlichkeit_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Oertlichkeit_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getOertlichkeitArt() <em>Oertlichkeit Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOertlichkeitArt()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit_Art_TypeClass oertlichkeitArt;

	/**
	 * The cached value of the '{@link #getOertlichkeitGueltigAb() <em>Oertlichkeit Gueltig Ab</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOertlichkeitGueltigAb()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit_Gueltig_Ab_TypeClass oertlichkeitGueltigAb;

	/**
	 * The cached value of the '{@link #getOertlichkeitGueltigBis() <em>Oertlichkeit Gueltig Bis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOertlichkeitGueltigBis()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit_Gueltig_Bis_TypeClass oertlichkeitGueltigBis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Oertlichkeit_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Art_TypeClass getOertlichkeitArt() {
		return oertlichkeitArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOertlichkeitArt(Oertlichkeit_Art_TypeClass newOertlichkeitArt, NotificationChain msgs) {
		Oertlichkeit_Art_TypeClass oldOertlichkeitArt = oertlichkeitArt;
		oertlichkeitArt = newOertlichkeitArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_ART, oldOertlichkeitArt, newOertlichkeitArt);
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
	public void setOertlichkeitArt(Oertlichkeit_Art_TypeClass newOertlichkeitArt) {
		if (newOertlichkeitArt != oertlichkeitArt) {
			NotificationChain msgs = null;
			if (oertlichkeitArt != null)
				msgs = ((InternalEObject)oertlichkeitArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_ART, null, msgs);
			if (newOertlichkeitArt != null)
				msgs = ((InternalEObject)newOertlichkeitArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_ART, null, msgs);
			msgs = basicSetOertlichkeitArt(newOertlichkeitArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_ART, newOertlichkeitArt, newOertlichkeitArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Gueltig_Ab_TypeClass getOertlichkeitGueltigAb() {
		return oertlichkeitGueltigAb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOertlichkeitGueltigAb(Oertlichkeit_Gueltig_Ab_TypeClass newOertlichkeitGueltigAb, NotificationChain msgs) {
		Oertlichkeit_Gueltig_Ab_TypeClass oldOertlichkeitGueltigAb = oertlichkeitGueltigAb;
		oertlichkeitGueltigAb = newOertlichkeitGueltigAb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_AB, oldOertlichkeitGueltigAb, newOertlichkeitGueltigAb);
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
	public void setOertlichkeitGueltigAb(Oertlichkeit_Gueltig_Ab_TypeClass newOertlichkeitGueltigAb) {
		if (newOertlichkeitGueltigAb != oertlichkeitGueltigAb) {
			NotificationChain msgs = null;
			if (oertlichkeitGueltigAb != null)
				msgs = ((InternalEObject)oertlichkeitGueltigAb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_AB, null, msgs);
			if (newOertlichkeitGueltigAb != null)
				msgs = ((InternalEObject)newOertlichkeitGueltigAb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_AB, null, msgs);
			msgs = basicSetOertlichkeitGueltigAb(newOertlichkeitGueltigAb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_AB, newOertlichkeitGueltigAb, newOertlichkeitGueltigAb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Gueltig_Bis_TypeClass getOertlichkeitGueltigBis() {
		return oertlichkeitGueltigBis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOertlichkeitGueltigBis(Oertlichkeit_Gueltig_Bis_TypeClass newOertlichkeitGueltigBis, NotificationChain msgs) {
		Oertlichkeit_Gueltig_Bis_TypeClass oldOertlichkeitGueltigBis = oertlichkeitGueltigBis;
		oertlichkeitGueltigBis = newOertlichkeitGueltigBis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_BIS, oldOertlichkeitGueltigBis, newOertlichkeitGueltigBis);
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
	public void setOertlichkeitGueltigBis(Oertlichkeit_Gueltig_Bis_TypeClass newOertlichkeitGueltigBis) {
		if (newOertlichkeitGueltigBis != oertlichkeitGueltigBis) {
			NotificationChain msgs = null;
			if (oertlichkeitGueltigBis != null)
				msgs = ((InternalEObject)oertlichkeitGueltigBis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_BIS, null, msgs);
			if (newOertlichkeitGueltigBis != null)
				msgs = ((InternalEObject)newOertlichkeitGueltigBis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_BIS, null, msgs);
			msgs = basicSetOertlichkeitGueltigBis(newOertlichkeitGueltigBis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_BIS, newOertlichkeitGueltigBis, newOertlichkeitGueltigBis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_ART:
				return basicSetOertlichkeitArt(null, msgs);
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_AB:
				return basicSetOertlichkeitGueltigAb(null, msgs);
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_BIS:
				return basicSetOertlichkeitGueltigBis(null, msgs);
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
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_ART:
				return getOertlichkeitArt();
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_AB:
				return getOertlichkeitGueltigAb();
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_BIS:
				return getOertlichkeitGueltigBis();
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
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_ART:
				setOertlichkeitArt((Oertlichkeit_Art_TypeClass)newValue);
				return;
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_AB:
				setOertlichkeitGueltigAb((Oertlichkeit_Gueltig_Ab_TypeClass)newValue);
				return;
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_BIS:
				setOertlichkeitGueltigBis((Oertlichkeit_Gueltig_Bis_TypeClass)newValue);
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
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_ART:
				setOertlichkeitArt((Oertlichkeit_Art_TypeClass)null);
				return;
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_AB:
				setOertlichkeitGueltigAb((Oertlichkeit_Gueltig_Ab_TypeClass)null);
				return;
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_BIS:
				setOertlichkeitGueltigBis((Oertlichkeit_Gueltig_Bis_TypeClass)null);
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
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_ART:
				return oertlichkeitArt != null;
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_AB:
				return oertlichkeitGueltigAb != null;
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_BIS:
				return oertlichkeitGueltigBis != null;
		}
		return super.eIsSet(featureID);
	}

} //Oertlichkeit_Allg_AttributeGroupImpl
