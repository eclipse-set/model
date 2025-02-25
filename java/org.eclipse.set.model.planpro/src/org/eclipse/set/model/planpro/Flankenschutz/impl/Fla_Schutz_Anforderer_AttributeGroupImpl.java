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

import org.eclipse.set.model.planpro.Flankenschutz.EKW_Kr_Anteil_TypeClass;
import org.eclipse.set.model.planpro.Flankenschutz.Fahrt_Ueber_TypeClass;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup;
import org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.planpro.Verweise.ID_Anforderer_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fla Schutz Anforderer Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Anforderer_AttributeGroupImpl#getEKWKrAnteil <em>EKW Kr Anteil</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Anforderer_AttributeGroupImpl#getFahrtUeber <em>Fahrt Ueber</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Schutz_Anforderer_AttributeGroupImpl#getIDAnfordererElement <em>ID Anforderer Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fla_Schutz_Anforderer_AttributeGroupImpl extends EObjectImpl implements Fla_Schutz_Anforderer_AttributeGroup {
	/**
	 * The cached value of the '{@link #getEKWKrAnteil() <em>EKW Kr Anteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEKWKrAnteil()
	 * @generated
	 * @ordered
	 */
	protected EKW_Kr_Anteil_TypeClass eKWKrAnteil;

	/**
	 * The cached value of the '{@link #getFahrtUeber() <em>Fahrt Ueber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFahrtUeber()
	 * @generated
	 * @ordered
	 */
	protected Fahrt_Ueber_TypeClass fahrtUeber;

	/**
	 * The cached value of the '{@link #getIDAnfordererElement() <em>ID Anforderer Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnfordererElement()
	 * @generated
	 * @ordered
	 */
	protected ID_Anforderer_Element_TypeClass iDAnfordererElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fla_Schutz_Anforderer_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlankenschutzPackage.Literals.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EKW_Kr_Anteil_TypeClass getEKWKrAnteil() {
		return eKWKrAnteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEKWKrAnteil(EKW_Kr_Anteil_TypeClass newEKWKrAnteil, NotificationChain msgs) {
		EKW_Kr_Anteil_TypeClass oldEKWKrAnteil = eKWKrAnteil;
		eKWKrAnteil = newEKWKrAnteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__EKW_KR_ANTEIL, oldEKWKrAnteil, newEKWKrAnteil);
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
	public void setEKWKrAnteil(EKW_Kr_Anteil_TypeClass newEKWKrAnteil) {
		if (newEKWKrAnteil != eKWKrAnteil) {
			NotificationChain msgs = null;
			if (eKWKrAnteil != null)
				msgs = ((InternalEObject)eKWKrAnteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__EKW_KR_ANTEIL, null, msgs);
			if (newEKWKrAnteil != null)
				msgs = ((InternalEObject)newEKWKrAnteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__EKW_KR_ANTEIL, null, msgs);
			msgs = basicSetEKWKrAnteil(newEKWKrAnteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__EKW_KR_ANTEIL, newEKWKrAnteil, newEKWKrAnteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fahrt_Ueber_TypeClass getFahrtUeber() {
		return fahrtUeber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFahrtUeber(Fahrt_Ueber_TypeClass newFahrtUeber, NotificationChain msgs) {
		Fahrt_Ueber_TypeClass oldFahrtUeber = fahrtUeber;
		fahrtUeber = newFahrtUeber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__FAHRT_UEBER, oldFahrtUeber, newFahrtUeber);
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
	public void setFahrtUeber(Fahrt_Ueber_TypeClass newFahrtUeber) {
		if (newFahrtUeber != fahrtUeber) {
			NotificationChain msgs = null;
			if (fahrtUeber != null)
				msgs = ((InternalEObject)fahrtUeber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__FAHRT_UEBER, null, msgs);
			if (newFahrtUeber != null)
				msgs = ((InternalEObject)newFahrtUeber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__FAHRT_UEBER, null, msgs);
			msgs = basicSetFahrtUeber(newFahrtUeber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__FAHRT_UEBER, newFahrtUeber, newFahrtUeber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anforderer_Element_TypeClass getIDAnfordererElement() {
		return iDAnfordererElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnfordererElement(ID_Anforderer_Element_TypeClass newIDAnfordererElement, NotificationChain msgs) {
		ID_Anforderer_Element_TypeClass oldIDAnfordererElement = iDAnfordererElement;
		iDAnfordererElement = newIDAnfordererElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__ID_ANFORDERER_ELEMENT, oldIDAnfordererElement, newIDAnfordererElement);
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
	public void setIDAnfordererElement(ID_Anforderer_Element_TypeClass newIDAnfordererElement) {
		if (newIDAnfordererElement != iDAnfordererElement) {
			NotificationChain msgs = null;
			if (iDAnfordererElement != null)
				msgs = ((InternalEObject)iDAnfordererElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__ID_ANFORDERER_ELEMENT, null, msgs);
			if (newIDAnfordererElement != null)
				msgs = ((InternalEObject)newIDAnfordererElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__ID_ANFORDERER_ELEMENT, null, msgs);
			msgs = basicSetIDAnfordererElement(newIDAnfordererElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__ID_ANFORDERER_ELEMENT, newIDAnfordererElement, newIDAnfordererElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__EKW_KR_ANTEIL:
				return basicSetEKWKrAnteil(null, msgs);
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__FAHRT_UEBER:
				return basicSetFahrtUeber(null, msgs);
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__ID_ANFORDERER_ELEMENT:
				return basicSetIDAnfordererElement(null, msgs);
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
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__EKW_KR_ANTEIL:
				return getEKWKrAnteil();
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__FAHRT_UEBER:
				return getFahrtUeber();
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__ID_ANFORDERER_ELEMENT:
				return getIDAnfordererElement();
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
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__EKW_KR_ANTEIL:
				setEKWKrAnteil((EKW_Kr_Anteil_TypeClass)newValue);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__FAHRT_UEBER:
				setFahrtUeber((Fahrt_Ueber_TypeClass)newValue);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__ID_ANFORDERER_ELEMENT:
				setIDAnfordererElement((ID_Anforderer_Element_TypeClass)newValue);
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
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__EKW_KR_ANTEIL:
				setEKWKrAnteil((EKW_Kr_Anteil_TypeClass)null);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__FAHRT_UEBER:
				setFahrtUeber((Fahrt_Ueber_TypeClass)null);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__ID_ANFORDERER_ELEMENT:
				setIDAnfordererElement((ID_Anforderer_Element_TypeClass)null);
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
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__EKW_KR_ANTEIL:
				return eKWKrAnteil != null;
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__FAHRT_UEBER:
				return fahrtUeber != null;
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__ID_ANFORDERER_ELEMENT:
				return iDAnfordererElement != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fla_Schutz_Anforderer_AttributeGroupImpl
