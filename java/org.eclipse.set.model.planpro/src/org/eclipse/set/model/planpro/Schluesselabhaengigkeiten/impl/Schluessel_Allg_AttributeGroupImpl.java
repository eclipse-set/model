/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Bartform_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schluessel Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl.Schluessel_Allg_AttributeGroupImpl#getSchluesselBartform <em>Schluessel Bartform</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl.Schluessel_Allg_AttributeGroupImpl#getSchluesselGruppe <em>Schluessel Gruppe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schluessel_Allg_AttributeGroupImpl extends EObjectImpl implements Schluessel_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getSchluesselBartform() <em>Schluessel Bartform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchluesselBartform()
	 * @generated
	 * @ordered
	 */
	protected Schluessel_Bartform_TypeClass schluesselBartform;

	/**
	 * The cached value of the '{@link #getSchluesselGruppe() <em>Schluessel Gruppe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchluesselGruppe()
	 * @generated
	 * @ordered
	 */
	protected Schluessel_Gruppe_TypeClass schluesselGruppe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schluessel_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluessel_Bartform_TypeClass getSchluesselBartform() {
		return schluesselBartform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchluesselBartform(Schluessel_Bartform_TypeClass newSchluesselBartform, NotificationChain msgs) {
		Schluessel_Bartform_TypeClass oldSchluesselBartform = schluesselBartform;
		schluesselBartform = newSchluesselBartform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_BARTFORM, oldSchluesselBartform, newSchluesselBartform);
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
	public void setSchluesselBartform(Schluessel_Bartform_TypeClass newSchluesselBartform) {
		if (newSchluesselBartform != schluesselBartform) {
			NotificationChain msgs = null;
			if (schluesselBartform != null)
				msgs = ((InternalEObject)schluesselBartform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_BARTFORM, null, msgs);
			if (newSchluesselBartform != null)
				msgs = ((InternalEObject)newSchluesselBartform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_BARTFORM, null, msgs);
			msgs = basicSetSchluesselBartform(newSchluesselBartform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_BARTFORM, newSchluesselBartform, newSchluesselBartform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluessel_Gruppe_TypeClass getSchluesselGruppe() {
		return schluesselGruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchluesselGruppe(Schluessel_Gruppe_TypeClass newSchluesselGruppe, NotificationChain msgs) {
		Schluessel_Gruppe_TypeClass oldSchluesselGruppe = schluesselGruppe;
		schluesselGruppe = newSchluesselGruppe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_GRUPPE, oldSchluesselGruppe, newSchluesselGruppe);
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
	public void setSchluesselGruppe(Schluessel_Gruppe_TypeClass newSchluesselGruppe) {
		if (newSchluesselGruppe != schluesselGruppe) {
			NotificationChain msgs = null;
			if (schluesselGruppe != null)
				msgs = ((InternalEObject)schluesselGruppe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_GRUPPE, null, msgs);
			if (newSchluesselGruppe != null)
				msgs = ((InternalEObject)newSchluesselGruppe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_GRUPPE, null, msgs);
			msgs = basicSetSchluesselGruppe(newSchluesselGruppe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_GRUPPE, newSchluesselGruppe, newSchluesselGruppe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_BARTFORM:
				return basicSetSchluesselBartform(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_GRUPPE:
				return basicSetSchluesselGruppe(null, msgs);
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_BARTFORM:
				return getSchluesselBartform();
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_GRUPPE:
				return getSchluesselGruppe();
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_BARTFORM:
				setSchluesselBartform((Schluessel_Bartform_TypeClass)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_GRUPPE:
				setSchluesselGruppe((Schluessel_Gruppe_TypeClass)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_BARTFORM:
				setSchluesselBartform((Schluessel_Bartform_TypeClass)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_GRUPPE:
				setSchluesselGruppe((Schluessel_Gruppe_TypeClass)null);
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_BARTFORM:
				return schluesselBartform != null;
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_GRUPPE:
				return schluesselGruppe != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Schluessel_Allg_AttributeGroupImpl
