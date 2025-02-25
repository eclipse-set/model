/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Geodaten.GEO_Punkt;

import org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_Polygonzug_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_Richtungswinkel_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Element_Position_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Position Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Position_Allg_AttributeGroupImpl#getDarstellungRichtungswinkel <em>Darstellung Richtungswinkel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Position_Allg_AttributeGroupImpl#getDarstellungGEOPunkt <em>Darstellung GEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Position_Allg_AttributeGroupImpl#getDarstellungPolygonzug <em>Darstellung Polygonzug</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Element_Position_Allg_AttributeGroupImpl extends EObjectImpl implements Element_Position_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDarstellungRichtungswinkel() <em>Darstellung Richtungswinkel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDarstellungRichtungswinkel()
	 * @generated
	 * @ordered
	 */
	protected Darstellung_Richtungswinkel_TypeClass darstellungRichtungswinkel;

	/**
	 * The cached value of the '{@link #getDarstellungGEOPunkt() <em>Darstellung GEO Punkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDarstellungGEOPunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<GEO_Punkt> darstellungGEOPunkt;

	/**
	 * The cached value of the '{@link #getDarstellungPolygonzug() <em>Darstellung Polygonzug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDarstellungPolygonzug()
	 * @generated
	 * @ordered
	 */
	protected Darstellung_Polygonzug_TypeClass darstellungPolygonzug;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element_Position_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutinformationenPackage.Literals.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Darstellung_Richtungswinkel_TypeClass getDarstellungRichtungswinkel() {
		return darstellungRichtungswinkel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDarstellungRichtungswinkel(Darstellung_Richtungswinkel_TypeClass newDarstellungRichtungswinkel, NotificationChain msgs) {
		Darstellung_Richtungswinkel_TypeClass oldDarstellungRichtungswinkel = darstellungRichtungswinkel;
		darstellungRichtungswinkel = newDarstellungRichtungswinkel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_RICHTUNGSWINKEL, oldDarstellungRichtungswinkel, newDarstellungRichtungswinkel);
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
	public void setDarstellungRichtungswinkel(Darstellung_Richtungswinkel_TypeClass newDarstellungRichtungswinkel) {
		if (newDarstellungRichtungswinkel != darstellungRichtungswinkel) {
			NotificationChain msgs = null;
			if (darstellungRichtungswinkel != null)
				msgs = ((InternalEObject)darstellungRichtungswinkel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_RICHTUNGSWINKEL, null, msgs);
			if (newDarstellungRichtungswinkel != null)
				msgs = ((InternalEObject)newDarstellungRichtungswinkel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_RICHTUNGSWINKEL, null, msgs);
			msgs = basicSetDarstellungRichtungswinkel(newDarstellungRichtungswinkel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_RICHTUNGSWINKEL, newDarstellungRichtungswinkel, newDarstellungRichtungswinkel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GEO_Punkt> getDarstellungGEOPunkt() {
		if (darstellungGEOPunkt == null) {
			darstellungGEOPunkt = new EObjectContainmentEList<GEO_Punkt>(GEO_Punkt.class, this, LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_GEO_PUNKT);
		}
		return darstellungGEOPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Darstellung_Polygonzug_TypeClass getDarstellungPolygonzug() {
		return darstellungPolygonzug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDarstellungPolygonzug(Darstellung_Polygonzug_TypeClass newDarstellungPolygonzug, NotificationChain msgs) {
		Darstellung_Polygonzug_TypeClass oldDarstellungPolygonzug = darstellungPolygonzug;
		darstellungPolygonzug = newDarstellungPolygonzug;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_POLYGONZUG, oldDarstellungPolygonzug, newDarstellungPolygonzug);
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
	public void setDarstellungPolygonzug(Darstellung_Polygonzug_TypeClass newDarstellungPolygonzug) {
		if (newDarstellungPolygonzug != darstellungPolygonzug) {
			NotificationChain msgs = null;
			if (darstellungPolygonzug != null)
				msgs = ((InternalEObject)darstellungPolygonzug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_POLYGONZUG, null, msgs);
			if (newDarstellungPolygonzug != null)
				msgs = ((InternalEObject)newDarstellungPolygonzug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_POLYGONZUG, null, msgs);
			msgs = basicSetDarstellungPolygonzug(newDarstellungPolygonzug, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_POLYGONZUG, newDarstellungPolygonzug, newDarstellungPolygonzug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_RICHTUNGSWINKEL:
				return basicSetDarstellungRichtungswinkel(null, msgs);
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_GEO_PUNKT:
				return ((InternalEList<?>)getDarstellungGEOPunkt()).basicRemove(otherEnd, msgs);
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_POLYGONZUG:
				return basicSetDarstellungPolygonzug(null, msgs);
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
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_RICHTUNGSWINKEL:
				return getDarstellungRichtungswinkel();
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_GEO_PUNKT:
				return getDarstellungGEOPunkt();
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_POLYGONZUG:
				return getDarstellungPolygonzug();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_RICHTUNGSWINKEL:
				setDarstellungRichtungswinkel((Darstellung_Richtungswinkel_TypeClass)newValue);
				return;
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_GEO_PUNKT:
				getDarstellungGEOPunkt().clear();
				getDarstellungGEOPunkt().addAll((Collection<? extends GEO_Punkt>)newValue);
				return;
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_POLYGONZUG:
				setDarstellungPolygonzug((Darstellung_Polygonzug_TypeClass)newValue);
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
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_RICHTUNGSWINKEL:
				setDarstellungRichtungswinkel((Darstellung_Richtungswinkel_TypeClass)null);
				return;
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_GEO_PUNKT:
				getDarstellungGEOPunkt().clear();
				return;
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_POLYGONZUG:
				setDarstellungPolygonzug((Darstellung_Polygonzug_TypeClass)null);
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
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_RICHTUNGSWINKEL:
				return darstellungRichtungswinkel != null;
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_GEO_PUNKT:
				return darstellungGEOPunkt != null && !darstellungGEOPunkt.isEmpty();
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_POLYGONZUG:
				return darstellungPolygonzug != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Element_Position_Allg_AttributeGroupImpl
