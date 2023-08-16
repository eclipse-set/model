/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ortung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.model11001.Ortung.FMA_Element;
import org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Ortung.FMA_Element_Anschluss_AttributeGroup;
import org.eclipse.set.model.model11001.Ortung.OrtungPackage;

import org.eclipse.set.model.model11001.Verweise.ID_FMA_Anlage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMA Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_ElementImpl#getFMAElementAllg <em>FMA Element Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_ElementImpl#getFMAElementAnschluss <em>FMA Element Anschluss</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.impl.FMA_ElementImpl#getIDFMAAnlage <em>IDFMA Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMA_ElementImpl extends Punkt_ObjektImpl implements FMA_Element {
	/**
	 * The cached value of the '{@link #getFMAElementAllg() <em>FMA Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAElementAllg()
	 * @generated
	 * @ordered
	 */
	protected FMA_Element_Allg_AttributeGroup fMAElementAllg;

	/**
	 * The cached value of the '{@link #getFMAElementAnschluss() <em>FMA Element Anschluss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAElementAnschluss()
	 * @generated
	 * @ordered
	 */
	protected FMA_Element_Anschluss_AttributeGroup fMAElementAnschluss;

	/**
	 * The cached value of the '{@link #getIDFMAAnlage() <em>IDFMA Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFMAAnlage()
	 * @generated
	 * @ordered
	 */
	protected ID_FMA_Anlage_TypeClass iDFMAAnlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMA_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.FMA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Element_Allg_AttributeGroup getFMAElementAllg() {
		return fMAElementAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAElementAllg(FMA_Element_Allg_AttributeGroup newFMAElementAllg, NotificationChain msgs) {
		FMA_Element_Allg_AttributeGroup oldFMAElementAllg = fMAElementAllg;
		fMAElementAllg = newFMAElementAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG, oldFMAElementAllg, newFMAElementAllg);
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
	public void setFMAElementAllg(FMA_Element_Allg_AttributeGroup newFMAElementAllg) {
		if (newFMAElementAllg != fMAElementAllg) {
			NotificationChain msgs = null;
			if (fMAElementAllg != null)
				msgs = ((InternalEObject)fMAElementAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG, null, msgs);
			if (newFMAElementAllg != null)
				msgs = ((InternalEObject)newFMAElementAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG, null, msgs);
			msgs = basicSetFMAElementAllg(newFMAElementAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG, newFMAElementAllg, newFMAElementAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Element_Anschluss_AttributeGroup getFMAElementAnschluss() {
		return fMAElementAnschluss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAElementAnschluss(FMA_Element_Anschluss_AttributeGroup newFMAElementAnschluss, NotificationChain msgs) {
		FMA_Element_Anschluss_AttributeGroup oldFMAElementAnschluss = fMAElementAnschluss;
		fMAElementAnschluss = newFMAElementAnschluss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS, oldFMAElementAnschluss, newFMAElementAnschluss);
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
	public void setFMAElementAnschluss(FMA_Element_Anschluss_AttributeGroup newFMAElementAnschluss) {
		if (newFMAElementAnschluss != fMAElementAnschluss) {
			NotificationChain msgs = null;
			if (fMAElementAnschluss != null)
				msgs = ((InternalEObject)fMAElementAnschluss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS, null, msgs);
			if (newFMAElementAnschluss != null)
				msgs = ((InternalEObject)newFMAElementAnschluss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS, null, msgs);
			msgs = basicSetFMAElementAnschluss(newFMAElementAnschluss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS, newFMAElementAnschluss, newFMAElementAnschluss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_FMA_Anlage_TypeClass getIDFMAAnlage() {
		return iDFMAAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFMAAnlage(ID_FMA_Anlage_TypeClass newIDFMAAnlage, NotificationChain msgs) {
		ID_FMA_Anlage_TypeClass oldIDFMAAnlage = iDFMAAnlage;
		iDFMAAnlage = newIDFMAAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE, oldIDFMAAnlage, newIDFMAAnlage);
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
	public void setIDFMAAnlage(ID_FMA_Anlage_TypeClass newIDFMAAnlage) {
		if (newIDFMAAnlage != iDFMAAnlage) {
			NotificationChain msgs = null;
			if (iDFMAAnlage != null)
				msgs = ((InternalEObject)iDFMAAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE, null, msgs);
			if (newIDFMAAnlage != null)
				msgs = ((InternalEObject)newIDFMAAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE, null, msgs);
			msgs = basicSetIDFMAAnlage(newIDFMAAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE, newIDFMAAnlage, newIDFMAAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG:
				return basicSetFMAElementAllg(null, msgs);
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS:
				return basicSetFMAElementAnschluss(null, msgs);
			case OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE:
				return basicSetIDFMAAnlage(null, msgs);
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
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG:
				return getFMAElementAllg();
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS:
				return getFMAElementAnschluss();
			case OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE:
				return getIDFMAAnlage();
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
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG:
				setFMAElementAllg((FMA_Element_Allg_AttributeGroup)newValue);
				return;
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS:
				setFMAElementAnschluss((FMA_Element_Anschluss_AttributeGroup)newValue);
				return;
			case OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE:
				setIDFMAAnlage((ID_FMA_Anlage_TypeClass)newValue);
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
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG:
				setFMAElementAllg((FMA_Element_Allg_AttributeGroup)null);
				return;
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS:
				setFMAElementAnschluss((FMA_Element_Anschluss_AttributeGroup)null);
				return;
			case OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE:
				setIDFMAAnlage((ID_FMA_Anlage_TypeClass)null);
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
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG:
				return fMAElementAllg != null;
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS:
				return fMAElementAnschluss != null;
			case OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE:
				return iDFMAAnlage != null;
		}
		return super.eIsSet(featureID);
	}

} //FMA_ElementImpl
