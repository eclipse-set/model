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

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Flankenschutz.Fla_Zwieschutz;
import org.eclipse.set.model.model1902.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup;
import org.eclipse.set.model.model1902.Flankenschutz.FlankenschutzPackage;
import org.eclipse.set.model.model1902.Flankenschutz.Zwieschutz_Art_TypeClass;

import org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Gsp_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fla Zwieschutz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Flankenschutz.impl.Fla_ZwieschutzImpl#getFlaZwieschutzElement <em>Fla Zwieschutz Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Flankenschutz.impl.Fla_ZwieschutzImpl#getIDWElement <em>IDW Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Flankenschutz.impl.Fla_ZwieschutzImpl#getZwieschutzArt <em>Zwieschutz Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fla_ZwieschutzImpl extends Basis_ObjektImpl implements Fla_Zwieschutz {
	/**
	 * The cached value of the '{@link #getFlaZwieschutzElement() <em>Fla Zwieschutz Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaZwieschutzElement()
	 * @generated
	 * @ordered
	 */
	protected Fla_Zwieschutz_Element_AttributeGroup flaZwieschutzElement;

	/**
	 * The cached value of the '{@link #getIDWElement() <em>IDW Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWElement()
	 * @generated
	 * @ordered
	 */
	protected ID_W_Kr_Gsp_Element_TypeClass iDWElement;

	/**
	 * The cached value of the '{@link #getZwieschutzArt() <em>Zwieschutz Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZwieschutzArt()
	 * @generated
	 * @ordered
	 */
	protected Zwieschutz_Art_TypeClass zwieschutzArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fla_ZwieschutzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Zwieschutz_Element_AttributeGroup getFlaZwieschutzElement() {
		return flaZwieschutzElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlaZwieschutzElement(Fla_Zwieschutz_Element_AttributeGroup newFlaZwieschutzElement, NotificationChain msgs) {
		Fla_Zwieschutz_Element_AttributeGroup oldFlaZwieschutzElement = flaZwieschutzElement;
		flaZwieschutzElement = newFlaZwieschutzElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ__FLA_ZWIESCHUTZ_ELEMENT, oldFlaZwieschutzElement, newFlaZwieschutzElement);
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
	public void setFlaZwieschutzElement(Fla_Zwieschutz_Element_AttributeGroup newFlaZwieschutzElement) {
		if (newFlaZwieschutzElement != flaZwieschutzElement) {
			NotificationChain msgs = null;
			if (flaZwieschutzElement != null)
				msgs = ((InternalEObject)flaZwieschutzElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_ZWIESCHUTZ__FLA_ZWIESCHUTZ_ELEMENT, null, msgs);
			if (newFlaZwieschutzElement != null)
				msgs = ((InternalEObject)newFlaZwieschutzElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_ZWIESCHUTZ__FLA_ZWIESCHUTZ_ELEMENT, null, msgs);
			msgs = basicSetFlaZwieschutzElement(newFlaZwieschutzElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ__FLA_ZWIESCHUTZ_ELEMENT, newFlaZwieschutzElement, newFlaZwieschutzElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_W_Kr_Gsp_Element_TypeClass getIDWElement() {
		return iDWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDWElement(ID_W_Kr_Gsp_Element_TypeClass newIDWElement, NotificationChain msgs) {
		ID_W_Kr_Gsp_Element_TypeClass oldIDWElement = iDWElement;
		iDWElement = newIDWElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ__IDW_ELEMENT, oldIDWElement, newIDWElement);
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
	public void setIDWElement(ID_W_Kr_Gsp_Element_TypeClass newIDWElement) {
		if (newIDWElement != iDWElement) {
			NotificationChain msgs = null;
			if (iDWElement != null)
				msgs = ((InternalEObject)iDWElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_ZWIESCHUTZ__IDW_ELEMENT, null, msgs);
			if (newIDWElement != null)
				msgs = ((InternalEObject)newIDWElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_ZWIESCHUTZ__IDW_ELEMENT, null, msgs);
			msgs = basicSetIDWElement(newIDWElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ__IDW_ELEMENT, newIDWElement, newIDWElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zwieschutz_Art_TypeClass getZwieschutzArt() {
		return zwieschutzArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZwieschutzArt(Zwieschutz_Art_TypeClass newZwieschutzArt, NotificationChain msgs) {
		Zwieschutz_Art_TypeClass oldZwieschutzArt = zwieschutzArt;
		zwieschutzArt = newZwieschutzArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ__ZWIESCHUTZ_ART, oldZwieschutzArt, newZwieschutzArt);
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
	public void setZwieschutzArt(Zwieschutz_Art_TypeClass newZwieschutzArt) {
		if (newZwieschutzArt != zwieschutzArt) {
			NotificationChain msgs = null;
			if (zwieschutzArt != null)
				msgs = ((InternalEObject)zwieschutzArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_ZWIESCHUTZ__ZWIESCHUTZ_ART, null, msgs);
			if (newZwieschutzArt != null)
				msgs = ((InternalEObject)newZwieschutzArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_ZWIESCHUTZ__ZWIESCHUTZ_ART, null, msgs);
			msgs = basicSetZwieschutzArt(newZwieschutzArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ__ZWIESCHUTZ_ART, newZwieschutzArt, newZwieschutzArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__FLA_ZWIESCHUTZ_ELEMENT:
				return basicSetFlaZwieschutzElement(null, msgs);
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__IDW_ELEMENT:
				return basicSetIDWElement(null, msgs);
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__ZWIESCHUTZ_ART:
				return basicSetZwieschutzArt(null, msgs);
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
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__FLA_ZWIESCHUTZ_ELEMENT:
				return getFlaZwieschutzElement();
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__IDW_ELEMENT:
				return getIDWElement();
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__ZWIESCHUTZ_ART:
				return getZwieschutzArt();
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
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__FLA_ZWIESCHUTZ_ELEMENT:
				setFlaZwieschutzElement((Fla_Zwieschutz_Element_AttributeGroup)newValue);
				return;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__IDW_ELEMENT:
				setIDWElement((ID_W_Kr_Gsp_Element_TypeClass)newValue);
				return;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__ZWIESCHUTZ_ART:
				setZwieschutzArt((Zwieschutz_Art_TypeClass)newValue);
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
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__FLA_ZWIESCHUTZ_ELEMENT:
				setFlaZwieschutzElement((Fla_Zwieschutz_Element_AttributeGroup)null);
				return;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__IDW_ELEMENT:
				setIDWElement((ID_W_Kr_Gsp_Element_TypeClass)null);
				return;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__ZWIESCHUTZ_ART:
				setZwieschutzArt((Zwieschutz_Art_TypeClass)null);
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
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__FLA_ZWIESCHUTZ_ELEMENT:
				return flaZwieschutzElement != null;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__IDW_ELEMENT:
				return iDWElement != null;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ__ZWIESCHUTZ_ART:
				return zwieschutzArt != null;
		}
		return super.eIsSet(featureID);
	}

} //Fla_ZwieschutzImpl
