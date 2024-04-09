/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Flankenschutz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_W_Lage_TypeClass;
import org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fla Schutz WGsp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_W_Gsp_AttributeGroupImpl#getFlaWLage <em>Fla WLage</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_W_Gsp_AttributeGroupImpl#getIDFlaWGspElement <em>ID Fla WGsp Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fla_Schutz_W_Gsp_AttributeGroupImpl extends EObjectImpl implements Fla_Schutz_W_Gsp_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFlaWLage() <em>Fla WLage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaWLage()
	 * @generated
	 * @ordered
	 */
	protected Fla_W_Lage_TypeClass flaWLage;

	/**
	 * The cached value of the '{@link #getIDFlaWGspElement() <em>ID Fla WGsp Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaWGspElement()
	 * @generated
	 * @ordered
	 */
	protected ID_W_Kr_Gsp_Element_TypeClass iDFlaWGspElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fla_Schutz_W_Gsp_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlankenschutzPackage.Literals.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_W_Lage_TypeClass getFlaWLage() {
		return flaWLage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlaWLage(Fla_W_Lage_TypeClass newFlaWLage, NotificationChain msgs) {
		Fla_W_Lage_TypeClass oldFlaWLage = flaWLage;
		flaWLage = newFlaWLage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE, oldFlaWLage, newFlaWLage);
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
	public void setFlaWLage(Fla_W_Lage_TypeClass newFlaWLage) {
		if (newFlaWLage != flaWLage) {
			NotificationChain msgs = null;
			if (flaWLage != null)
				msgs = ((InternalEObject)flaWLage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE, null, msgs);
			if (newFlaWLage != null)
				msgs = ((InternalEObject)newFlaWLage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE, null, msgs);
			msgs = basicSetFlaWLage(newFlaWLage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE, newFlaWLage, newFlaWLage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_W_Kr_Gsp_Element_TypeClass getIDFlaWGspElement() {
		return iDFlaWGspElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFlaWGspElement(ID_W_Kr_Gsp_Element_TypeClass newIDFlaWGspElement, NotificationChain msgs) {
		ID_W_Kr_Gsp_Element_TypeClass oldIDFlaWGspElement = iDFlaWGspElement;
		iDFlaWGspElement = newIDFlaWGspElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT, oldIDFlaWGspElement, newIDFlaWGspElement);
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
	public void setIDFlaWGspElement(ID_W_Kr_Gsp_Element_TypeClass newIDFlaWGspElement) {
		if (newIDFlaWGspElement != iDFlaWGspElement) {
			NotificationChain msgs = null;
			if (iDFlaWGspElement != null)
				msgs = ((InternalEObject)iDFlaWGspElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT, null, msgs);
			if (newIDFlaWGspElement != null)
				msgs = ((InternalEObject)newIDFlaWGspElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT, null, msgs);
			msgs = basicSetIDFlaWGspElement(newIDFlaWGspElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT, newIDFlaWGspElement, newIDFlaWGspElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE:
				return basicSetFlaWLage(null, msgs);
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT:
				return basicSetIDFlaWGspElement(null, msgs);
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
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE:
				return getFlaWLage();
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT:
				return getIDFlaWGspElement();
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
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE:
				setFlaWLage((Fla_W_Lage_TypeClass)newValue);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT:
				setIDFlaWGspElement((ID_W_Kr_Gsp_Element_TypeClass)newValue);
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
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE:
				setFlaWLage((Fla_W_Lage_TypeClass)null);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT:
				setIDFlaWGspElement((ID_W_Kr_Gsp_Element_TypeClass)null);
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
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE:
				return flaWLage != null;
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT:
				return iDFlaWGspElement != null;
		}
		return super.eIsSet(featureID);
	}

} //Fla_Schutz_W_Gsp_AttributeGroupImpl
