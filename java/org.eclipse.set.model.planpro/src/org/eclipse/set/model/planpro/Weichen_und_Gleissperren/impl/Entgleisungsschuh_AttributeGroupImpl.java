/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Auswurfrichtung_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleissperrensignal_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Schutzschiene_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entgleisungsschuh Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl.Entgleisungsschuh_AttributeGroupImpl#getAuswurfrichtung <em>Auswurfrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl.Entgleisungsschuh_AttributeGroupImpl#getGleissperrensignal <em>Gleissperrensignal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl.Entgleisungsschuh_AttributeGroupImpl#getSchutzschiene <em>Schutzschiene</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Entgleisungsschuh_AttributeGroupImpl extends EObjectImpl implements Entgleisungsschuh_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAuswurfrichtung() <em>Auswurfrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuswurfrichtung()
	 * @generated
	 * @ordered
	 */
	protected Auswurfrichtung_TypeClass auswurfrichtung;

	/**
	 * The cached value of the '{@link #getGleissperrensignal() <em>Gleissperrensignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleissperrensignal()
	 * @generated
	 * @ordered
	 */
	protected Gleissperrensignal_TypeClass gleissperrensignal;

	/**
	 * The cached value of the '{@link #getSchutzschiene() <em>Schutzschiene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchutzschiene()
	 * @generated
	 * @ordered
	 */
	protected Schutzschiene_TypeClass schutzschiene;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Entgleisungsschuh_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Auswurfrichtung_TypeClass getAuswurfrichtung() {
		return auswurfrichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuswurfrichtung(Auswurfrichtung_TypeClass newAuswurfrichtung, NotificationChain msgs) {
		Auswurfrichtung_TypeClass oldAuswurfrichtung = auswurfrichtung;
		auswurfrichtung = newAuswurfrichtung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__AUSWURFRICHTUNG, oldAuswurfrichtung, newAuswurfrichtung);
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
	public void setAuswurfrichtung(Auswurfrichtung_TypeClass newAuswurfrichtung) {
		if (newAuswurfrichtung != auswurfrichtung) {
			NotificationChain msgs = null;
			if (auswurfrichtung != null)
				msgs = ((InternalEObject)auswurfrichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__AUSWURFRICHTUNG, null, msgs);
			if (newAuswurfrichtung != null)
				msgs = ((InternalEObject)newAuswurfrichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__AUSWURFRICHTUNG, null, msgs);
			msgs = basicSetAuswurfrichtung(newAuswurfrichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__AUSWURFRICHTUNG, newAuswurfrichtung, newAuswurfrichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleissperrensignal_TypeClass getGleissperrensignal() {
		return gleissperrensignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGleissperrensignal(Gleissperrensignal_TypeClass newGleissperrensignal, NotificationChain msgs) {
		Gleissperrensignal_TypeClass oldGleissperrensignal = gleissperrensignal;
		gleissperrensignal = newGleissperrensignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__GLEISSPERRENSIGNAL, oldGleissperrensignal, newGleissperrensignal);
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
	public void setGleissperrensignal(Gleissperrensignal_TypeClass newGleissperrensignal) {
		if (newGleissperrensignal != gleissperrensignal) {
			NotificationChain msgs = null;
			if (gleissperrensignal != null)
				msgs = ((InternalEObject)gleissperrensignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__GLEISSPERRENSIGNAL, null, msgs);
			if (newGleissperrensignal != null)
				msgs = ((InternalEObject)newGleissperrensignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__GLEISSPERRENSIGNAL, null, msgs);
			msgs = basicSetGleissperrensignal(newGleissperrensignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__GLEISSPERRENSIGNAL, newGleissperrensignal, newGleissperrensignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schutzschiene_TypeClass getSchutzschiene() {
		return schutzschiene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchutzschiene(Schutzschiene_TypeClass newSchutzschiene, NotificationChain msgs) {
		Schutzschiene_TypeClass oldSchutzschiene = schutzschiene;
		schutzschiene = newSchutzschiene;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__SCHUTZSCHIENE, oldSchutzschiene, newSchutzschiene);
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
	public void setSchutzschiene(Schutzschiene_TypeClass newSchutzschiene) {
		if (newSchutzschiene != schutzschiene) {
			NotificationChain msgs = null;
			if (schutzschiene != null)
				msgs = ((InternalEObject)schutzschiene).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__SCHUTZSCHIENE, null, msgs);
			if (newSchutzschiene != null)
				msgs = ((InternalEObject)newSchutzschiene).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__SCHUTZSCHIENE, null, msgs);
			msgs = basicSetSchutzschiene(newSchutzschiene, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__SCHUTZSCHIENE, newSchutzschiene, newSchutzschiene));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__AUSWURFRICHTUNG:
				return basicSetAuswurfrichtung(null, msgs);
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__GLEISSPERRENSIGNAL:
				return basicSetGleissperrensignal(null, msgs);
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__SCHUTZSCHIENE:
				return basicSetSchutzschiene(null, msgs);
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
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__AUSWURFRICHTUNG:
				return getAuswurfrichtung();
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__GLEISSPERRENSIGNAL:
				return getGleissperrensignal();
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__SCHUTZSCHIENE:
				return getSchutzschiene();
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
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__AUSWURFRICHTUNG:
				setAuswurfrichtung((Auswurfrichtung_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__GLEISSPERRENSIGNAL:
				setGleissperrensignal((Gleissperrensignal_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__SCHUTZSCHIENE:
				setSchutzschiene((Schutzschiene_TypeClass)newValue);
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
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__AUSWURFRICHTUNG:
				setAuswurfrichtung((Auswurfrichtung_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__GLEISSPERRENSIGNAL:
				setGleissperrensignal((Gleissperrensignal_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__SCHUTZSCHIENE:
				setSchutzschiene((Schutzschiene_TypeClass)null);
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
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__AUSWURFRICHTUNG:
				return auswurfrichtung != null;
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__GLEISSPERRENSIGNAL:
				return gleissperrensignal != null;
			case Weichen_und_GleissperrenPackage.ENTGLEISUNGSSCHUH_ATTRIBUTE_GROUP__SCHUTZSCHIENE:
				return schutzschiene != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Entgleisungsschuh_AttributeGroupImpl
