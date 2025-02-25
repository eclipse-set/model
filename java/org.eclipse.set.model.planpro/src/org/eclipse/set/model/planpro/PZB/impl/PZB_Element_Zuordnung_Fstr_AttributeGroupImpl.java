/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PZB.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.PZB.PZBPackage;
import org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup;
import org.eclipse.set.model.planpro.PZB.Wirksamkeit_Fstr_TypeClass;

import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element Zuordnung Fstr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_Fstr_AttributeGroupImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_Zuordnung_Fstr_AttributeGroupImpl#getWirksamkeitFstr <em>Wirksamkeit Fstr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Element_Zuordnung_Fstr_AttributeGroupImpl extends EObjectImpl implements PZB_Element_Zuordnung_Fstr_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDFstrZugRangier() <em>ID Fstr Zug Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrZugRangier()
	 * @generated
	 * @ordered
	 */
	protected ID_Fstr_Zug_Rangier_TypeClass iDFstrZugRangier;

	/**
	 * The cached value of the '{@link #getWirksamkeitFstr() <em>Wirksamkeit Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWirksamkeitFstr()
	 * @generated
	 * @ordered
	 */
	protected Wirksamkeit_Fstr_TypeClass wirksamkeitFstr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_Zuordnung_Fstr_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Zug_Rangier_TypeClass getIDFstrZugRangier() {
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrZugRangier, NotificationChain msgs) {
		ID_Fstr_Zug_Rangier_TypeClass oldIDFstrZugRangier = iDFstrZugRangier;
		iDFstrZugRangier = newIDFstrZugRangier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, newIDFstrZugRangier);
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
	public void setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrZugRangier) {
		if (newIDFstrZugRangier != iDFstrZugRangier) {
			NotificationChain msgs = null;
			if (iDFstrZugRangier != null)
				msgs = ((InternalEObject)iDFstrZugRangier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, null, msgs);
			if (newIDFstrZugRangier != null)
				msgs = ((InternalEObject)newIDFstrZugRangier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, null, msgs);
			msgs = basicSetIDFstrZugRangier(newIDFstrZugRangier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, newIDFstrZugRangier, newIDFstrZugRangier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirksamkeit_Fstr_TypeClass getWirksamkeitFstr() {
		return wirksamkeitFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWirksamkeitFstr(Wirksamkeit_Fstr_TypeClass newWirksamkeitFstr, NotificationChain msgs) {
		Wirksamkeit_Fstr_TypeClass oldWirksamkeitFstr = wirksamkeitFstr;
		wirksamkeitFstr = newWirksamkeitFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR, oldWirksamkeitFstr, newWirksamkeitFstr);
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
	public void setWirksamkeitFstr(Wirksamkeit_Fstr_TypeClass newWirksamkeitFstr) {
		if (newWirksamkeitFstr != wirksamkeitFstr) {
			NotificationChain msgs = null;
			if (wirksamkeitFstr != null)
				msgs = ((InternalEObject)wirksamkeitFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR, null, msgs);
			if (newWirksamkeitFstr != null)
				msgs = ((InternalEObject)newWirksamkeitFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR, null, msgs);
			msgs = basicSetWirksamkeitFstr(newWirksamkeitFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR, newWirksamkeitFstr, newWirksamkeitFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				return basicSetIDFstrZugRangier(null, msgs);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR:
				return basicSetWirksamkeitFstr(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				return getIDFstrZugRangier();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR:
				return getWirksamkeitFstr();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR:
				setWirksamkeitFstr((Wirksamkeit_Fstr_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR:
				setWirksamkeitFstr((Wirksamkeit_Fstr_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				return iDFstrZugRangier != null;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR:
				return wirksamkeitFstr != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //PZB_Element_Zuordnung_Fstr_AttributeGroupImpl
