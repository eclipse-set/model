/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Flankenschutz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Flankenschutz.Fla_Schutz_Signal_AttributeGroup;
import org.eclipse.set.model.model1902.Flankenschutz.Fla_Signal_Zielsperrung_TypeClass;
import org.eclipse.set.model.model1902.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fla Schutz Signal Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Flankenschutz.impl.Fla_Schutz_Signal_AttributeGroupImpl#getFlaSignalZielsperrung <em>Fla Signal Zielsperrung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Flankenschutz.impl.Fla_Schutz_Signal_AttributeGroupImpl#getIDFlaSignal <em>ID Fla Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fla_Schutz_Signal_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Fla_Schutz_Signal_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFlaSignalZielsperrung() <em>Fla Signal Zielsperrung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaSignalZielsperrung()
	 * @generated
	 * @ordered
	 */
	protected Fla_Signal_Zielsperrung_TypeClass flaSignalZielsperrung;

	/**
	 * The cached value of the '{@link #getIDFlaSignal() <em>ID Fla Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaSignal()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_TypeClass iDFlaSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fla_Schutz_Signal_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlankenschutzPackage.Literals.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Signal_Zielsperrung_TypeClass getFlaSignalZielsperrung() {
		return flaSignalZielsperrung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlaSignalZielsperrung(Fla_Signal_Zielsperrung_TypeClass newFlaSignalZielsperrung, NotificationChain msgs) {
		Fla_Signal_Zielsperrung_TypeClass oldFlaSignalZielsperrung = flaSignalZielsperrung;
		flaSignalZielsperrung = newFlaSignalZielsperrung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG, oldFlaSignalZielsperrung, newFlaSignalZielsperrung);
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
	public void setFlaSignalZielsperrung(Fla_Signal_Zielsperrung_TypeClass newFlaSignalZielsperrung) {
		if (newFlaSignalZielsperrung != flaSignalZielsperrung) {
			NotificationChain msgs = null;
			if (flaSignalZielsperrung != null)
				msgs = ((InternalEObject)flaSignalZielsperrung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG, null, msgs);
			if (newFlaSignalZielsperrung != null)
				msgs = ((InternalEObject)newFlaSignalZielsperrung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG, null, msgs);
			msgs = basicSetFlaSignalZielsperrung(newFlaSignalZielsperrung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG, newFlaSignalZielsperrung, newFlaSignalZielsperrung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_TypeClass getIDFlaSignal() {
		return iDFlaSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFlaSignal(ID_Signal_TypeClass newIDFlaSignal, NotificationChain msgs) {
		ID_Signal_TypeClass oldIDFlaSignal = iDFlaSignal;
		iDFlaSignal = newIDFlaSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL, oldIDFlaSignal, newIDFlaSignal);
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
	public void setIDFlaSignal(ID_Signal_TypeClass newIDFlaSignal) {
		if (newIDFlaSignal != iDFlaSignal) {
			NotificationChain msgs = null;
			if (iDFlaSignal != null)
				msgs = ((InternalEObject)iDFlaSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL, null, msgs);
			if (newIDFlaSignal != null)
				msgs = ((InternalEObject)newIDFlaSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL, null, msgs);
			msgs = basicSetIDFlaSignal(newIDFlaSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL, newIDFlaSignal, newIDFlaSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG:
				return basicSetFlaSignalZielsperrung(null, msgs);
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL:
				return basicSetIDFlaSignal(null, msgs);
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
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG:
				return getFlaSignalZielsperrung();
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL:
				return getIDFlaSignal();
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
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG:
				setFlaSignalZielsperrung((Fla_Signal_Zielsperrung_TypeClass)newValue);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL:
				setIDFlaSignal((ID_Signal_TypeClass)newValue);
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
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG:
				setFlaSignalZielsperrung((Fla_Signal_Zielsperrung_TypeClass)null);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL:
				setIDFlaSignal((ID_Signal_TypeClass)null);
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
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG:
				return flaSignalZielsperrung != null;
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL:
				return iDFlaSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //Fla_Schutz_Signal_AttributeGroupImpl
