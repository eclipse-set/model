/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Geodaten.GeodatenPackage;
import org.eclipse.set.model.model11001.Geodaten.Oertlichkeit_Abkuerzung_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.Oertlichkeit_Kurzname_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Oertlichkeit_Langname_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oertlichkeit Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.Oertlichkeit_Bezeichnung_AttributeGroupImpl#getOertlichkeitAbkuerzung <em>Oertlichkeit Abkuerzung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.Oertlichkeit_Bezeichnung_AttributeGroupImpl#getOertlichkeitKurzname <em>Oertlichkeit Kurzname</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.Oertlichkeit_Bezeichnung_AttributeGroupImpl#getOertlichkeitLangname <em>Oertlichkeit Langname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Oertlichkeit_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Oertlichkeit_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getOertlichkeitAbkuerzung() <em>Oertlichkeit Abkuerzung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOertlichkeitAbkuerzung()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit_Abkuerzung_TypeClass oertlichkeitAbkuerzung;

	/**
	 * The cached value of the '{@link #getOertlichkeitKurzname() <em>Oertlichkeit Kurzname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOertlichkeitKurzname()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit_Kurzname_TypeClass oertlichkeitKurzname;

	/**
	 * The cached value of the '{@link #getOertlichkeitLangname() <em>Oertlichkeit Langname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOertlichkeitLangname()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit_Langname_TypeClass oertlichkeitLangname;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Oertlichkeit_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Abkuerzung_TypeClass getOertlichkeitAbkuerzung() {
		return oertlichkeitAbkuerzung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOertlichkeitAbkuerzung(Oertlichkeit_Abkuerzung_TypeClass newOertlichkeitAbkuerzung, NotificationChain msgs) {
		Oertlichkeit_Abkuerzung_TypeClass oldOertlichkeitAbkuerzung = oertlichkeitAbkuerzung;
		oertlichkeitAbkuerzung = newOertlichkeitAbkuerzung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG, oldOertlichkeitAbkuerzung, newOertlichkeitAbkuerzung);
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
	public void setOertlichkeitAbkuerzung(Oertlichkeit_Abkuerzung_TypeClass newOertlichkeitAbkuerzung) {
		if (newOertlichkeitAbkuerzung != oertlichkeitAbkuerzung) {
			NotificationChain msgs = null;
			if (oertlichkeitAbkuerzung != null)
				msgs = ((InternalEObject)oertlichkeitAbkuerzung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG, null, msgs);
			if (newOertlichkeitAbkuerzung != null)
				msgs = ((InternalEObject)newOertlichkeitAbkuerzung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG, null, msgs);
			msgs = basicSetOertlichkeitAbkuerzung(newOertlichkeitAbkuerzung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG, newOertlichkeitAbkuerzung, newOertlichkeitAbkuerzung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Kurzname_TypeClass getOertlichkeitKurzname() {
		return oertlichkeitKurzname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOertlichkeitKurzname(Oertlichkeit_Kurzname_TypeClass newOertlichkeitKurzname, NotificationChain msgs) {
		Oertlichkeit_Kurzname_TypeClass oldOertlichkeitKurzname = oertlichkeitKurzname;
		oertlichkeitKurzname = newOertlichkeitKurzname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME, oldOertlichkeitKurzname, newOertlichkeitKurzname);
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
	public void setOertlichkeitKurzname(Oertlichkeit_Kurzname_TypeClass newOertlichkeitKurzname) {
		if (newOertlichkeitKurzname != oertlichkeitKurzname) {
			NotificationChain msgs = null;
			if (oertlichkeitKurzname != null)
				msgs = ((InternalEObject)oertlichkeitKurzname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME, null, msgs);
			if (newOertlichkeitKurzname != null)
				msgs = ((InternalEObject)newOertlichkeitKurzname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME, null, msgs);
			msgs = basicSetOertlichkeitKurzname(newOertlichkeitKurzname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME, newOertlichkeitKurzname, newOertlichkeitKurzname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Langname_TypeClass getOertlichkeitLangname() {
		return oertlichkeitLangname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOertlichkeitLangname(Oertlichkeit_Langname_TypeClass newOertlichkeitLangname, NotificationChain msgs) {
		Oertlichkeit_Langname_TypeClass oldOertlichkeitLangname = oertlichkeitLangname;
		oertlichkeitLangname = newOertlichkeitLangname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME, oldOertlichkeitLangname, newOertlichkeitLangname);
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
	public void setOertlichkeitLangname(Oertlichkeit_Langname_TypeClass newOertlichkeitLangname) {
		if (newOertlichkeitLangname != oertlichkeitLangname) {
			NotificationChain msgs = null;
			if (oertlichkeitLangname != null)
				msgs = ((InternalEObject)oertlichkeitLangname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME, null, msgs);
			if (newOertlichkeitLangname != null)
				msgs = ((InternalEObject)newOertlichkeitLangname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME, null, msgs);
			msgs = basicSetOertlichkeitLangname(newOertlichkeitLangname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME, newOertlichkeitLangname, newOertlichkeitLangname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG:
				return basicSetOertlichkeitAbkuerzung(null, msgs);
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME:
				return basicSetOertlichkeitKurzname(null, msgs);
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME:
				return basicSetOertlichkeitLangname(null, msgs);
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
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG:
				return getOertlichkeitAbkuerzung();
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME:
				return getOertlichkeitKurzname();
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME:
				return getOertlichkeitLangname();
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
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG:
				setOertlichkeitAbkuerzung((Oertlichkeit_Abkuerzung_TypeClass)newValue);
				return;
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME:
				setOertlichkeitKurzname((Oertlichkeit_Kurzname_TypeClass)newValue);
				return;
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME:
				setOertlichkeitLangname((Oertlichkeit_Langname_TypeClass)newValue);
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
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG:
				setOertlichkeitAbkuerzung((Oertlichkeit_Abkuerzung_TypeClass)null);
				return;
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME:
				setOertlichkeitKurzname((Oertlichkeit_Kurzname_TypeClass)null);
				return;
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME:
				setOertlichkeitLangname((Oertlichkeit_Langname_TypeClass)null);
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
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG:
				return oertlichkeitAbkuerzung != null;
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME:
				return oertlichkeitKurzname != null;
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME:
				return oertlichkeitLangname != null;
		}
		return super.eIsSet(featureID);
	}

} //Oertlichkeit_Bezeichnung_AttributeGroupImpl
