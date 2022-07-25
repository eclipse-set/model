/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ortung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Ortung.FMA_Art_TypeClass;
import org.eclipse.set.model.model1902.Ortung.FMA_Hilffreimeldung_TypeClass;
import org.eclipse.set.model.model1902.Ortung.FMA_Isolierung_TypeClass;
import org.eclipse.set.model.model1902.Ortung.FMA_Typ_TypeClass;
import org.eclipse.set.model.model1902.Ortung.OrtungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMA Anlage Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.impl.FMA_Anlage_Allg_AttributeGroupImpl#getFMAArt <em>FMA Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.impl.FMA_Anlage_Allg_AttributeGroupImpl#getFMAHilffreimeldung <em>FMA Hilffreimeldung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.impl.FMA_Anlage_Allg_AttributeGroupImpl#getFMAIsolierung <em>FMA Isolierung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.impl.FMA_Anlage_Allg_AttributeGroupImpl#getFMATyp <em>FMA Typ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMA_Anlage_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements FMA_Anlage_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFMAArt() <em>FMA Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAArt()
	 * @generated
	 * @ordered
	 */
	protected FMA_Art_TypeClass fMAArt;

	/**
	 * The cached value of the '{@link #getFMAHilffreimeldung() <em>FMA Hilffreimeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAHilffreimeldung()
	 * @generated
	 * @ordered
	 */
	protected FMA_Hilffreimeldung_TypeClass fMAHilffreimeldung;

	/**
	 * The cached value of the '{@link #getFMAIsolierung() <em>FMA Isolierung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAIsolierung()
	 * @generated
	 * @ordered
	 */
	protected FMA_Isolierung_TypeClass fMAIsolierung;

	/**
	 * The cached value of the '{@link #getFMATyp() <em>FMA Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMATyp()
	 * @generated
	 * @ordered
	 */
	protected FMA_Typ_TypeClass fMATyp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMA_Anlage_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Art_TypeClass getFMAArt() {
		return fMAArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAArt(FMA_Art_TypeClass newFMAArt, NotificationChain msgs) {
		FMA_Art_TypeClass oldFMAArt = fMAArt;
		fMAArt = newFMAArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ART, oldFMAArt, newFMAArt);
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
	public void setFMAArt(FMA_Art_TypeClass newFMAArt) {
		if (newFMAArt != fMAArt) {
			NotificationChain msgs = null;
			if (fMAArt != null)
				msgs = ((InternalEObject)fMAArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ART, null, msgs);
			if (newFMAArt != null)
				msgs = ((InternalEObject)newFMAArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ART, null, msgs);
			msgs = basicSetFMAArt(newFMAArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ART, newFMAArt, newFMAArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Hilffreimeldung_TypeClass getFMAHilffreimeldung() {
		return fMAHilffreimeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAHilffreimeldung(FMA_Hilffreimeldung_TypeClass newFMAHilffreimeldung, NotificationChain msgs) {
		FMA_Hilffreimeldung_TypeClass oldFMAHilffreimeldung = fMAHilffreimeldung;
		fMAHilffreimeldung = newFMAHilffreimeldung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_HILFFREIMELDUNG, oldFMAHilffreimeldung, newFMAHilffreimeldung);
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
	public void setFMAHilffreimeldung(FMA_Hilffreimeldung_TypeClass newFMAHilffreimeldung) {
		if (newFMAHilffreimeldung != fMAHilffreimeldung) {
			NotificationChain msgs = null;
			if (fMAHilffreimeldung != null)
				msgs = ((InternalEObject)fMAHilffreimeldung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_HILFFREIMELDUNG, null, msgs);
			if (newFMAHilffreimeldung != null)
				msgs = ((InternalEObject)newFMAHilffreimeldung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_HILFFREIMELDUNG, null, msgs);
			msgs = basicSetFMAHilffreimeldung(newFMAHilffreimeldung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_HILFFREIMELDUNG, newFMAHilffreimeldung, newFMAHilffreimeldung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Isolierung_TypeClass getFMAIsolierung() {
		return fMAIsolierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAIsolierung(FMA_Isolierung_TypeClass newFMAIsolierung, NotificationChain msgs) {
		FMA_Isolierung_TypeClass oldFMAIsolierung = fMAIsolierung;
		fMAIsolierung = newFMAIsolierung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ISOLIERUNG, oldFMAIsolierung, newFMAIsolierung);
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
	public void setFMAIsolierung(FMA_Isolierung_TypeClass newFMAIsolierung) {
		if (newFMAIsolierung != fMAIsolierung) {
			NotificationChain msgs = null;
			if (fMAIsolierung != null)
				msgs = ((InternalEObject)fMAIsolierung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ISOLIERUNG, null, msgs);
			if (newFMAIsolierung != null)
				msgs = ((InternalEObject)newFMAIsolierung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ISOLIERUNG, null, msgs);
			msgs = basicSetFMAIsolierung(newFMAIsolierung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ISOLIERUNG, newFMAIsolierung, newFMAIsolierung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Typ_TypeClass getFMATyp() {
		return fMATyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMATyp(FMA_Typ_TypeClass newFMATyp, NotificationChain msgs) {
		FMA_Typ_TypeClass oldFMATyp = fMATyp;
		fMATyp = newFMATyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_TYP, oldFMATyp, newFMATyp);
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
	public void setFMATyp(FMA_Typ_TypeClass newFMATyp) {
		if (newFMATyp != fMATyp) {
			NotificationChain msgs = null;
			if (fMATyp != null)
				msgs = ((InternalEObject)fMATyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_TYP, null, msgs);
			if (newFMATyp != null)
				msgs = ((InternalEObject)newFMATyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_TYP, null, msgs);
			msgs = basicSetFMATyp(newFMATyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_TYP, newFMATyp, newFMATyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ART:
				return basicSetFMAArt(null, msgs);
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_HILFFREIMELDUNG:
				return basicSetFMAHilffreimeldung(null, msgs);
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ISOLIERUNG:
				return basicSetFMAIsolierung(null, msgs);
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_TYP:
				return basicSetFMATyp(null, msgs);
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
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ART:
				return getFMAArt();
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_HILFFREIMELDUNG:
				return getFMAHilffreimeldung();
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ISOLIERUNG:
				return getFMAIsolierung();
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_TYP:
				return getFMATyp();
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
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ART:
				setFMAArt((FMA_Art_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_HILFFREIMELDUNG:
				setFMAHilffreimeldung((FMA_Hilffreimeldung_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ISOLIERUNG:
				setFMAIsolierung((FMA_Isolierung_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_TYP:
				setFMATyp((FMA_Typ_TypeClass)newValue);
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
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ART:
				setFMAArt((FMA_Art_TypeClass)null);
				return;
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_HILFFREIMELDUNG:
				setFMAHilffreimeldung((FMA_Hilffreimeldung_TypeClass)null);
				return;
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ISOLIERUNG:
				setFMAIsolierung((FMA_Isolierung_TypeClass)null);
				return;
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_TYP:
				setFMATyp((FMA_Typ_TypeClass)null);
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
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ART:
				return fMAArt != null;
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_HILFFREIMELDUNG:
				return fMAHilffreimeldung != null;
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ISOLIERUNG:
				return fMAIsolierung != null;
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_TYP:
				return fMATyp != null;
		}
		return super.eIsSet(featureID);
	}

} //FMA_Anlage_Allg_AttributeGroupImpl
