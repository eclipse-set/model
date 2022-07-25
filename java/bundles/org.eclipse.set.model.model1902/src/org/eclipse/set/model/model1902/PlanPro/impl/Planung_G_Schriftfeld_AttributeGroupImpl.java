/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.PlanPro.Bauabschnitt_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Bezeichnung_Anlage_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Bezeichnung_Planung_Gruppe_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Bezeichnung_Unteranlage_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Organisation;
import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;
import org.eclipse.set.model.model1902.PlanPro.Planung_G_Schriftfeld_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planung GSchriftfeld Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_G_Schriftfeld_AttributeGroupImpl#getBauabschnitt <em>Bauabschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_G_Schriftfeld_AttributeGroupImpl#getBezeichnungAnlage <em>Bezeichnung Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_G_Schriftfeld_AttributeGroupImpl#getBezeichnungPlanungGruppe <em>Bezeichnung Planung Gruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_G_Schriftfeld_AttributeGroupImpl#getBezeichnungUnteranlage <em>Bezeichnung Unteranlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_G_Schriftfeld_AttributeGroupImpl#getPlanungsbuero <em>Planungsbuero</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Planung_G_Schriftfeld_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Planung_G_Schriftfeld_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBauabschnitt() <em>Bauabschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBauabschnitt()
	 * @generated
	 * @ordered
	 */
	protected Bauabschnitt_TypeClass bauabschnitt;

	/**
	 * The cached value of the '{@link #getBezeichnungAnlage() <em>Bezeichnung Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungAnlage()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Anlage_TypeClass bezeichnungAnlage;

	/**
	 * The cached value of the '{@link #getBezeichnungPlanungGruppe() <em>Bezeichnung Planung Gruppe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungPlanungGruppe()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Planung_Gruppe_TypeClass bezeichnungPlanungGruppe;

	/**
	 * The cached value of the '{@link #getBezeichnungUnteranlage() <em>Bezeichnung Unteranlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungUnteranlage()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Unteranlage_TypeClass bezeichnungUnteranlage;

	/**
	 * The cached value of the '{@link #getPlanungsbuero() <em>Planungsbuero</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungsbuero()
	 * @generated
	 * @ordered
	 */
	protected Organisation planungsbuero;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Planung_G_Schriftfeld_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPlanung_G_Schriftfeld_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bauabschnitt_TypeClass getBauabschnitt() {
		return bauabschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBauabschnitt(Bauabschnitt_TypeClass newBauabschnitt, NotificationChain msgs) {
		Bauabschnitt_TypeClass oldBauabschnitt = bauabschnitt;
		bauabschnitt = newBauabschnitt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BAUABSCHNITT, oldBauabschnitt, newBauabschnitt);
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
	public void setBauabschnitt(Bauabschnitt_TypeClass newBauabschnitt) {
		if (newBauabschnitt != bauabschnitt) {
			NotificationChain msgs = null;
			if (bauabschnitt != null)
				msgs = ((InternalEObject)bauabschnitt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BAUABSCHNITT, null, msgs);
			if (newBauabschnitt != null)
				msgs = ((InternalEObject)newBauabschnitt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BAUABSCHNITT, null, msgs);
			msgs = basicSetBauabschnitt(newBauabschnitt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BAUABSCHNITT, newBauabschnitt, newBauabschnitt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Anlage_TypeClass getBezeichnungAnlage() {
		return bezeichnungAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungAnlage(Bezeichnung_Anlage_TypeClass newBezeichnungAnlage, NotificationChain msgs) {
		Bezeichnung_Anlage_TypeClass oldBezeichnungAnlage = bezeichnungAnlage;
		bezeichnungAnlage = newBezeichnungAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_ANLAGE, oldBezeichnungAnlage, newBezeichnungAnlage);
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
	public void setBezeichnungAnlage(Bezeichnung_Anlage_TypeClass newBezeichnungAnlage) {
		if (newBezeichnungAnlage != bezeichnungAnlage) {
			NotificationChain msgs = null;
			if (bezeichnungAnlage != null)
				msgs = ((InternalEObject)bezeichnungAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_ANLAGE, null, msgs);
			if (newBezeichnungAnlage != null)
				msgs = ((InternalEObject)newBezeichnungAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_ANLAGE, null, msgs);
			msgs = basicSetBezeichnungAnlage(newBezeichnungAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_ANLAGE, newBezeichnungAnlage, newBezeichnungAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Planung_Gruppe_TypeClass getBezeichnungPlanungGruppe() {
		return bezeichnungPlanungGruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungPlanungGruppe(Bezeichnung_Planung_Gruppe_TypeClass newBezeichnungPlanungGruppe, NotificationChain msgs) {
		Bezeichnung_Planung_Gruppe_TypeClass oldBezeichnungPlanungGruppe = bezeichnungPlanungGruppe;
		bezeichnungPlanungGruppe = newBezeichnungPlanungGruppe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_GRUPPE, oldBezeichnungPlanungGruppe, newBezeichnungPlanungGruppe);
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
	public void setBezeichnungPlanungGruppe(Bezeichnung_Planung_Gruppe_TypeClass newBezeichnungPlanungGruppe) {
		if (newBezeichnungPlanungGruppe != bezeichnungPlanungGruppe) {
			NotificationChain msgs = null;
			if (bezeichnungPlanungGruppe != null)
				msgs = ((InternalEObject)bezeichnungPlanungGruppe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_GRUPPE, null, msgs);
			if (newBezeichnungPlanungGruppe != null)
				msgs = ((InternalEObject)newBezeichnungPlanungGruppe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_GRUPPE, null, msgs);
			msgs = basicSetBezeichnungPlanungGruppe(newBezeichnungPlanungGruppe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_GRUPPE, newBezeichnungPlanungGruppe, newBezeichnungPlanungGruppe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Unteranlage_TypeClass getBezeichnungUnteranlage() {
		return bezeichnungUnteranlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungUnteranlage(Bezeichnung_Unteranlage_TypeClass newBezeichnungUnteranlage, NotificationChain msgs) {
		Bezeichnung_Unteranlage_TypeClass oldBezeichnungUnteranlage = bezeichnungUnteranlage;
		bezeichnungUnteranlage = newBezeichnungUnteranlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_UNTERANLAGE, oldBezeichnungUnteranlage, newBezeichnungUnteranlage);
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
	public void setBezeichnungUnteranlage(Bezeichnung_Unteranlage_TypeClass newBezeichnungUnteranlage) {
		if (newBezeichnungUnteranlage != bezeichnungUnteranlage) {
			NotificationChain msgs = null;
			if (bezeichnungUnteranlage != null)
				msgs = ((InternalEObject)bezeichnungUnteranlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_UNTERANLAGE, null, msgs);
			if (newBezeichnungUnteranlage != null)
				msgs = ((InternalEObject)newBezeichnungUnteranlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_UNTERANLAGE, null, msgs);
			msgs = basicSetBezeichnungUnteranlage(newBezeichnungUnteranlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_UNTERANLAGE, newBezeichnungUnteranlage, newBezeichnungUnteranlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organisation getPlanungsbuero() {
		return planungsbuero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanungsbuero(Organisation newPlanungsbuero, NotificationChain msgs) {
		Organisation oldPlanungsbuero = planungsbuero;
		planungsbuero = newPlanungsbuero;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__PLANUNGSBUERO, oldPlanungsbuero, newPlanungsbuero);
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
	public void setPlanungsbuero(Organisation newPlanungsbuero) {
		if (newPlanungsbuero != planungsbuero) {
			NotificationChain msgs = null;
			if (planungsbuero != null)
				msgs = ((InternalEObject)planungsbuero).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__PLANUNGSBUERO, null, msgs);
			if (newPlanungsbuero != null)
				msgs = ((InternalEObject)newPlanungsbuero).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__PLANUNGSBUERO, null, msgs);
			msgs = basicSetPlanungsbuero(newPlanungsbuero, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__PLANUNGSBUERO, newPlanungsbuero, newPlanungsbuero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BAUABSCHNITT:
				return basicSetBauabschnitt(null, msgs);
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_ANLAGE:
				return basicSetBezeichnungAnlage(null, msgs);
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_GRUPPE:
				return basicSetBezeichnungPlanungGruppe(null, msgs);
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_UNTERANLAGE:
				return basicSetBezeichnungUnteranlage(null, msgs);
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__PLANUNGSBUERO:
				return basicSetPlanungsbuero(null, msgs);
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
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BAUABSCHNITT:
				return getBauabschnitt();
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_ANLAGE:
				return getBezeichnungAnlage();
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_GRUPPE:
				return getBezeichnungPlanungGruppe();
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_UNTERANLAGE:
				return getBezeichnungUnteranlage();
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__PLANUNGSBUERO:
				return getPlanungsbuero();
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
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BAUABSCHNITT:
				setBauabschnitt((Bauabschnitt_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_ANLAGE:
				setBezeichnungAnlage((Bezeichnung_Anlage_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_GRUPPE:
				setBezeichnungPlanungGruppe((Bezeichnung_Planung_Gruppe_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_UNTERANLAGE:
				setBezeichnungUnteranlage((Bezeichnung_Unteranlage_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__PLANUNGSBUERO:
				setPlanungsbuero((Organisation)newValue);
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
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BAUABSCHNITT:
				setBauabschnitt((Bauabschnitt_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_ANLAGE:
				setBezeichnungAnlage((Bezeichnung_Anlage_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_GRUPPE:
				setBezeichnungPlanungGruppe((Bezeichnung_Planung_Gruppe_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_UNTERANLAGE:
				setBezeichnungUnteranlage((Bezeichnung_Unteranlage_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__PLANUNGSBUERO:
				setPlanungsbuero((Organisation)null);
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
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BAUABSCHNITT:
				return bauabschnitt != null;
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_ANLAGE:
				return bezeichnungAnlage != null;
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_GRUPPE:
				return bezeichnungPlanungGruppe != null;
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__BEZEICHNUNG_UNTERANLAGE:
				return bezeichnungUnteranlage != null;
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP__PLANUNGSBUERO:
				return planungsbuero != null;
		}
		return super.eIsSet(featureID);
	}

} //Planung_G_Schriftfeld_AttributeGroupImpl
