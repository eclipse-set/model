/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Flankenschutz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz;
import org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup;
import org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz_Signal_AttributeGroup;
import org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup;
import org.eclipse.set.model.model11001.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup;
import org.eclipse.set.model.model11001.Flankenschutz.Fla_Verzicht_TypeClass;
import org.eclipse.set.model.model11001.Flankenschutz.FlankenschutzPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fla Schutz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Flankenschutz.impl.Fla_SchutzImpl#getFlaSchutzAnforderer <em>Fla Schutz Anforderer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Flankenschutz.impl.Fla_SchutzImpl#getFlaSchutzSignal <em>Fla Schutz Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Flankenschutz.impl.Fla_SchutzImpl#getFlaSchutzWGsp <em>Fla Schutz WGsp</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Flankenschutz.impl.Fla_SchutzImpl#getFlaSchutzWeitergabe <em>Fla Schutz Weitergabe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Flankenschutz.impl.Fla_SchutzImpl#getFlaVerzicht <em>Fla Verzicht</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fla_SchutzImpl extends Basis_ObjektImpl implements Fla_Schutz {
	/**
	 * The cached value of the '{@link #getFlaSchutzAnforderer() <em>Fla Schutz Anforderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaSchutzAnforderer()
	 * @generated
	 * @ordered
	 */
	protected Fla_Schutz_Anforderer_AttributeGroup flaSchutzAnforderer;

	/**
	 * The cached value of the '{@link #getFlaSchutzSignal() <em>Fla Schutz Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaSchutzSignal()
	 * @generated
	 * @ordered
	 */
	protected Fla_Schutz_Signal_AttributeGroup flaSchutzSignal;

	/**
	 * The cached value of the '{@link #getFlaSchutzWGsp() <em>Fla Schutz WGsp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaSchutzWGsp()
	 * @generated
	 * @ordered
	 */
	protected Fla_Schutz_W_Gsp_AttributeGroup flaSchutzWGsp;

	/**
	 * The cached value of the '{@link #getFlaSchutzWeitergabe() <em>Fla Schutz Weitergabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaSchutzWeitergabe()
	 * @generated
	 * @ordered
	 */
	protected Fla_Schutz_Weitergabe_AttributeGroup flaSchutzWeitergabe;

	/**
	 * The cached value of the '{@link #getFlaVerzicht() <em>Fla Verzicht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaVerzicht()
	 * @generated
	 * @ordered
	 */
	protected Fla_Verzicht_TypeClass flaVerzicht;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fla_SchutzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlankenschutzPackage.Literals.FLA_SCHUTZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz_Anforderer_AttributeGroup getFlaSchutzAnforderer() {
		return flaSchutzAnforderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlaSchutzAnforderer(Fla_Schutz_Anforderer_AttributeGroup newFlaSchutzAnforderer, NotificationChain msgs) {
		Fla_Schutz_Anforderer_AttributeGroup oldFlaSchutzAnforderer = flaSchutzAnforderer;
		flaSchutzAnforderer = newFlaSchutzAnforderer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_ANFORDERER, oldFlaSchutzAnforderer, newFlaSchutzAnforderer);
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
	public void setFlaSchutzAnforderer(Fla_Schutz_Anforderer_AttributeGroup newFlaSchutzAnforderer) {
		if (newFlaSchutzAnforderer != flaSchutzAnforderer) {
			NotificationChain msgs = null;
			if (flaSchutzAnforderer != null)
				msgs = ((InternalEObject)flaSchutzAnforderer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_ANFORDERER, null, msgs);
			if (newFlaSchutzAnforderer != null)
				msgs = ((InternalEObject)newFlaSchutzAnforderer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_ANFORDERER, null, msgs);
			msgs = basicSetFlaSchutzAnforderer(newFlaSchutzAnforderer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_ANFORDERER, newFlaSchutzAnforderer, newFlaSchutzAnforderer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz_Signal_AttributeGroup getFlaSchutzSignal() {
		return flaSchutzSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlaSchutzSignal(Fla_Schutz_Signal_AttributeGroup newFlaSchutzSignal, NotificationChain msgs) {
		Fla_Schutz_Signal_AttributeGroup oldFlaSchutzSignal = flaSchutzSignal;
		flaSchutzSignal = newFlaSchutzSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_SIGNAL, oldFlaSchutzSignal, newFlaSchutzSignal);
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
	public void setFlaSchutzSignal(Fla_Schutz_Signal_AttributeGroup newFlaSchutzSignal) {
		if (newFlaSchutzSignal != flaSchutzSignal) {
			NotificationChain msgs = null;
			if (flaSchutzSignal != null)
				msgs = ((InternalEObject)flaSchutzSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_SIGNAL, null, msgs);
			if (newFlaSchutzSignal != null)
				msgs = ((InternalEObject)newFlaSchutzSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_SIGNAL, null, msgs);
			msgs = basicSetFlaSchutzSignal(newFlaSchutzSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_SIGNAL, newFlaSchutzSignal, newFlaSchutzSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz_W_Gsp_AttributeGroup getFlaSchutzWGsp() {
		return flaSchutzWGsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlaSchutzWGsp(Fla_Schutz_W_Gsp_AttributeGroup newFlaSchutzWGsp, NotificationChain msgs) {
		Fla_Schutz_W_Gsp_AttributeGroup oldFlaSchutzWGsp = flaSchutzWGsp;
		flaSchutzWGsp = newFlaSchutzWGsp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WGSP, oldFlaSchutzWGsp, newFlaSchutzWGsp);
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
	public void setFlaSchutzWGsp(Fla_Schutz_W_Gsp_AttributeGroup newFlaSchutzWGsp) {
		if (newFlaSchutzWGsp != flaSchutzWGsp) {
			NotificationChain msgs = null;
			if (flaSchutzWGsp != null)
				msgs = ((InternalEObject)flaSchutzWGsp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WGSP, null, msgs);
			if (newFlaSchutzWGsp != null)
				msgs = ((InternalEObject)newFlaSchutzWGsp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WGSP, null, msgs);
			msgs = basicSetFlaSchutzWGsp(newFlaSchutzWGsp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WGSP, newFlaSchutzWGsp, newFlaSchutzWGsp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz_Weitergabe_AttributeGroup getFlaSchutzWeitergabe() {
		return flaSchutzWeitergabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlaSchutzWeitergabe(Fla_Schutz_Weitergabe_AttributeGroup newFlaSchutzWeitergabe, NotificationChain msgs) {
		Fla_Schutz_Weitergabe_AttributeGroup oldFlaSchutzWeitergabe = flaSchutzWeitergabe;
		flaSchutzWeitergabe = newFlaSchutzWeitergabe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WEITERGABE, oldFlaSchutzWeitergabe, newFlaSchutzWeitergabe);
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
	public void setFlaSchutzWeitergabe(Fla_Schutz_Weitergabe_AttributeGroup newFlaSchutzWeitergabe) {
		if (newFlaSchutzWeitergabe != flaSchutzWeitergabe) {
			NotificationChain msgs = null;
			if (flaSchutzWeitergabe != null)
				msgs = ((InternalEObject)flaSchutzWeitergabe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WEITERGABE, null, msgs);
			if (newFlaSchutzWeitergabe != null)
				msgs = ((InternalEObject)newFlaSchutzWeitergabe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WEITERGABE, null, msgs);
			msgs = basicSetFlaSchutzWeitergabe(newFlaSchutzWeitergabe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WEITERGABE, newFlaSchutzWeitergabe, newFlaSchutzWeitergabe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Verzicht_TypeClass getFlaVerzicht() {
		return flaVerzicht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlaVerzicht(Fla_Verzicht_TypeClass newFlaVerzicht, NotificationChain msgs) {
		Fla_Verzicht_TypeClass oldFlaVerzicht = flaVerzicht;
		flaVerzicht = newFlaVerzicht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ__FLA_VERZICHT, oldFlaVerzicht, newFlaVerzicht);
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
	public void setFlaVerzicht(Fla_Verzicht_TypeClass newFlaVerzicht) {
		if (newFlaVerzicht != flaVerzicht) {
			NotificationChain msgs = null;
			if (flaVerzicht != null)
				msgs = ((InternalEObject)flaVerzicht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ__FLA_VERZICHT, null, msgs);
			if (newFlaVerzicht != null)
				msgs = ((InternalEObject)newFlaVerzicht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ__FLA_VERZICHT, null, msgs);
			msgs = basicSetFlaVerzicht(newFlaVerzicht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ__FLA_VERZICHT, newFlaVerzicht, newFlaVerzicht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_ANFORDERER:
				return basicSetFlaSchutzAnforderer(null, msgs);
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_SIGNAL:
				return basicSetFlaSchutzSignal(null, msgs);
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WGSP:
				return basicSetFlaSchutzWGsp(null, msgs);
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WEITERGABE:
				return basicSetFlaSchutzWeitergabe(null, msgs);
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_VERZICHT:
				return basicSetFlaVerzicht(null, msgs);
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
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_ANFORDERER:
				return getFlaSchutzAnforderer();
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_SIGNAL:
				return getFlaSchutzSignal();
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WGSP:
				return getFlaSchutzWGsp();
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WEITERGABE:
				return getFlaSchutzWeitergabe();
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_VERZICHT:
				return getFlaVerzicht();
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
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_ANFORDERER:
				setFlaSchutzAnforderer((Fla_Schutz_Anforderer_AttributeGroup)newValue);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_SIGNAL:
				setFlaSchutzSignal((Fla_Schutz_Signal_AttributeGroup)newValue);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WGSP:
				setFlaSchutzWGsp((Fla_Schutz_W_Gsp_AttributeGroup)newValue);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WEITERGABE:
				setFlaSchutzWeitergabe((Fla_Schutz_Weitergabe_AttributeGroup)newValue);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_VERZICHT:
				setFlaVerzicht((Fla_Verzicht_TypeClass)newValue);
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
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_ANFORDERER:
				setFlaSchutzAnforderer((Fla_Schutz_Anforderer_AttributeGroup)null);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_SIGNAL:
				setFlaSchutzSignal((Fla_Schutz_Signal_AttributeGroup)null);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WGSP:
				setFlaSchutzWGsp((Fla_Schutz_W_Gsp_AttributeGroup)null);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WEITERGABE:
				setFlaSchutzWeitergabe((Fla_Schutz_Weitergabe_AttributeGroup)null);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_VERZICHT:
				setFlaVerzicht((Fla_Verzicht_TypeClass)null);
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
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_ANFORDERER:
				return flaSchutzAnforderer != null;
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_SIGNAL:
				return flaSchutzSignal != null;
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WGSP:
				return flaSchutzWGsp != null;
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_SCHUTZ_WEITERGABE:
				return flaSchutzWeitergabe != null;
			case FlankenschutzPackage.FLA_SCHUTZ__FLA_VERZICHT:
				return flaVerzicht != null;
		}
		return super.eIsSet(featureID);
	}

} //Fla_SchutzImpl
