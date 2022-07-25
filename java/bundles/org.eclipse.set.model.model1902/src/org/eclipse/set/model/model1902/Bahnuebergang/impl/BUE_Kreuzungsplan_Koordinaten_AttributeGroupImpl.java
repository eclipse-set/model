/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.model1902.Bahnuebergang.Pixel_Koordinate_X_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.Pixel_Koordinate_Y_TypeClass;

import org.eclipse.set.model.model1902.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Kreuzungsplan Koordinaten Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl#getIDGEOPunkt <em>IDGEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl#getPixelKoordinateX <em>Pixel Koordinate X</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl#getPixelKoordinateY <em>Pixel Koordinate Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl extends MinimalEObjectImpl.Container implements BUE_Kreuzungsplan_Koordinaten_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDGEOPunkt() <em>IDGEO Punkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOPunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_GEO_Punkt_ohne_Proxy_TypeClass iDGEOPunkt;

	/**
	 * The cached value of the '{@link #getPixelKoordinateX() <em>Pixel Koordinate X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixelKoordinateX()
	 * @generated
	 * @ordered
	 */
	protected Pixel_Koordinate_X_TypeClass pixelKoordinateX;

	/**
	 * The cached value of the '{@link #getPixelKoordinateY() <em>Pixel Koordinate Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixelKoordinateY()
	 * @generated
	 * @ordered
	 */
	protected Pixel_Koordinate_Y_TypeClass pixelKoordinateY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Kreuzungsplan_Koordinaten_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GEO_Punkt_ohne_Proxy_TypeClass getIDGEOPunkt() {
		return iDGEOPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGEOPunkt(ID_GEO_Punkt_ohne_Proxy_TypeClass newIDGEOPunkt, NotificationChain msgs) {
		ID_GEO_Punkt_ohne_Proxy_TypeClass oldIDGEOPunkt = iDGEOPunkt;
		iDGEOPunkt = newIDGEOPunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT, oldIDGEOPunkt, newIDGEOPunkt);
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
	public void setIDGEOPunkt(ID_GEO_Punkt_ohne_Proxy_TypeClass newIDGEOPunkt) {
		if (newIDGEOPunkt != iDGEOPunkt) {
			NotificationChain msgs = null;
			if (iDGEOPunkt != null)
				msgs = ((InternalEObject)iDGEOPunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT, null, msgs);
			if (newIDGEOPunkt != null)
				msgs = ((InternalEObject)newIDGEOPunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT, null, msgs);
			msgs = basicSetIDGEOPunkt(newIDGEOPunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT, newIDGEOPunkt, newIDGEOPunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pixel_Koordinate_X_TypeClass getPixelKoordinateX() {
		return pixelKoordinateX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPixelKoordinateX(Pixel_Koordinate_X_TypeClass newPixelKoordinateX, NotificationChain msgs) {
		Pixel_Koordinate_X_TypeClass oldPixelKoordinateX = pixelKoordinateX;
		pixelKoordinateX = newPixelKoordinateX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X, oldPixelKoordinateX, newPixelKoordinateX);
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
	public void setPixelKoordinateX(Pixel_Koordinate_X_TypeClass newPixelKoordinateX) {
		if (newPixelKoordinateX != pixelKoordinateX) {
			NotificationChain msgs = null;
			if (pixelKoordinateX != null)
				msgs = ((InternalEObject)pixelKoordinateX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X, null, msgs);
			if (newPixelKoordinateX != null)
				msgs = ((InternalEObject)newPixelKoordinateX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X, null, msgs);
			msgs = basicSetPixelKoordinateX(newPixelKoordinateX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X, newPixelKoordinateX, newPixelKoordinateX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pixel_Koordinate_Y_TypeClass getPixelKoordinateY() {
		return pixelKoordinateY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPixelKoordinateY(Pixel_Koordinate_Y_TypeClass newPixelKoordinateY, NotificationChain msgs) {
		Pixel_Koordinate_Y_TypeClass oldPixelKoordinateY = pixelKoordinateY;
		pixelKoordinateY = newPixelKoordinateY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y, oldPixelKoordinateY, newPixelKoordinateY);
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
	public void setPixelKoordinateY(Pixel_Koordinate_Y_TypeClass newPixelKoordinateY) {
		if (newPixelKoordinateY != pixelKoordinateY) {
			NotificationChain msgs = null;
			if (pixelKoordinateY != null)
				msgs = ((InternalEObject)pixelKoordinateY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y, null, msgs);
			if (newPixelKoordinateY != null)
				msgs = ((InternalEObject)newPixelKoordinateY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y, null, msgs);
			msgs = basicSetPixelKoordinateY(newPixelKoordinateY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y, newPixelKoordinateY, newPixelKoordinateY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT:
				return basicSetIDGEOPunkt(null, msgs);
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X:
				return basicSetPixelKoordinateX(null, msgs);
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y:
				return basicSetPixelKoordinateY(null, msgs);
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT:
				return getIDGEOPunkt();
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X:
				return getPixelKoordinateX();
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y:
				return getPixelKoordinateY();
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT:
				setIDGEOPunkt((ID_GEO_Punkt_ohne_Proxy_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X:
				setPixelKoordinateX((Pixel_Koordinate_X_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y:
				setPixelKoordinateY((Pixel_Koordinate_Y_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT:
				setIDGEOPunkt((ID_GEO_Punkt_ohne_Proxy_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X:
				setPixelKoordinateX((Pixel_Koordinate_X_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y:
				setPixelKoordinateY((Pixel_Koordinate_Y_TypeClass)null);
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT:
				return iDGEOPunkt != null;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X:
				return pixelKoordinateX != null;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y:
				return pixelKoordinateY != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl
