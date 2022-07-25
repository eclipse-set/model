/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bremsweg_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_ESG_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GESG_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Individuell_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Lfd_Nr_Am_Bezugspunkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Typ GESG Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Typ_GESG_AttributeGroupImpl#getBremsweg <em>Bremsweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Typ_GESG_AttributeGroupImpl#getDPTypESG <em>DP Typ ESG</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Typ_GESG_AttributeGroupImpl#getIndividuell <em>Individuell</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Typ_GESG_AttributeGroupImpl#getLfdNrAmBezugspunkt <em>Lfd Nr Am Bezugspunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Typ_GESG_AttributeGroupImpl extends MinimalEObjectImpl.Container implements DP_Typ_GESG_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBremsweg() <em>Bremsweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBremsweg()
	 * @generated
	 * @ordered
	 */
	protected Bremsweg_TypeClass bremsweg;

	/**
	 * The cached value of the '{@link #getDPTypESG() <em>DP Typ ESG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypESG()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_ESG_TypeClass dPTypESG;

	/**
	 * The cached value of the '{@link #getIndividuell() <em>Individuell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividuell()
	 * @generated
	 * @ordered
	 */
	protected Individuell_TypeClass individuell;

	/**
	 * The cached value of the '{@link #getLfdNrAmBezugspunkt() <em>Lfd Nr Am Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLfdNrAmBezugspunkt()
	 * @generated
	 * @ordered
	 */
	protected Lfd_Nr_Am_Bezugspunkt_TypeClass lfdNrAmBezugspunkt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Typ_GESG_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Typ_GESG_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bremsweg_TypeClass getBremsweg() {
		return bremsweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBremsweg(Bremsweg_TypeClass newBremsweg, NotificationChain msgs) {
		Bremsweg_TypeClass oldBremsweg = bremsweg;
		bremsweg = newBremsweg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__BREMSWEG, oldBremsweg, newBremsweg);
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
	public void setBremsweg(Bremsweg_TypeClass newBremsweg) {
		if (newBremsweg != bremsweg) {
			NotificationChain msgs = null;
			if (bremsweg != null)
				msgs = ((InternalEObject)bremsweg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__BREMSWEG, null, msgs);
			if (newBremsweg != null)
				msgs = ((InternalEObject)newBremsweg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__BREMSWEG, null, msgs);
			msgs = basicSetBremsweg(newBremsweg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__BREMSWEG, newBremsweg, newBremsweg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_ESG_TypeClass getDPTypESG() {
		return dPTypESG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypESG(DP_Typ_ESG_TypeClass newDPTypESG, NotificationChain msgs) {
		DP_Typ_ESG_TypeClass oldDPTypESG = dPTypESG;
		dPTypESG = newDPTypESG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG, oldDPTypESG, newDPTypESG);
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
	public void setDPTypESG(DP_Typ_ESG_TypeClass newDPTypESG) {
		if (newDPTypESG != dPTypESG) {
			NotificationChain msgs = null;
			if (dPTypESG != null)
				msgs = ((InternalEObject)dPTypESG).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG, null, msgs);
			if (newDPTypESG != null)
				msgs = ((InternalEObject)newDPTypESG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG, null, msgs);
			msgs = basicSetDPTypESG(newDPTypESG, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG, newDPTypESG, newDPTypESG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Individuell_TypeClass getIndividuell() {
		return individuell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividuell(Individuell_TypeClass newIndividuell, NotificationChain msgs) {
		Individuell_TypeClass oldIndividuell = individuell;
		individuell = newIndividuell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__INDIVIDUELL, oldIndividuell, newIndividuell);
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
	public void setIndividuell(Individuell_TypeClass newIndividuell) {
		if (newIndividuell != individuell) {
			NotificationChain msgs = null;
			if (individuell != null)
				msgs = ((InternalEObject)individuell).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__INDIVIDUELL, null, msgs);
			if (newIndividuell != null)
				msgs = ((InternalEObject)newIndividuell).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__INDIVIDUELL, null, msgs);
			msgs = basicSetIndividuell(newIndividuell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__INDIVIDUELL, newIndividuell, newIndividuell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lfd_Nr_Am_Bezugspunkt_TypeClass getLfdNrAmBezugspunkt() {
		return lfdNrAmBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLfdNrAmBezugspunkt(Lfd_Nr_Am_Bezugspunkt_TypeClass newLfdNrAmBezugspunkt, NotificationChain msgs) {
		Lfd_Nr_Am_Bezugspunkt_TypeClass oldLfdNrAmBezugspunkt = lfdNrAmBezugspunkt;
		lfdNrAmBezugspunkt = newLfdNrAmBezugspunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT, oldLfdNrAmBezugspunkt, newLfdNrAmBezugspunkt);
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
	public void setLfdNrAmBezugspunkt(Lfd_Nr_Am_Bezugspunkt_TypeClass newLfdNrAmBezugspunkt) {
		if (newLfdNrAmBezugspunkt != lfdNrAmBezugspunkt) {
			NotificationChain msgs = null;
			if (lfdNrAmBezugspunkt != null)
				msgs = ((InternalEObject)lfdNrAmBezugspunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT, null, msgs);
			if (newLfdNrAmBezugspunkt != null)
				msgs = ((InternalEObject)newLfdNrAmBezugspunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT, null, msgs);
			msgs = basicSetLfdNrAmBezugspunkt(newLfdNrAmBezugspunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT, newLfdNrAmBezugspunkt, newLfdNrAmBezugspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__BREMSWEG:
				return basicSetBremsweg(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG:
				return basicSetDPTypESG(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__INDIVIDUELL:
				return basicSetIndividuell(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT:
				return basicSetLfdNrAmBezugspunkt(null, msgs);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__BREMSWEG:
				return getBremsweg();
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG:
				return getDPTypESG();
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__INDIVIDUELL:
				return getIndividuell();
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT:
				return getLfdNrAmBezugspunkt();
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
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__BREMSWEG:
				setBremsweg((Bremsweg_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG:
				setDPTypESG((DP_Typ_ESG_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__INDIVIDUELL:
				setIndividuell((Individuell_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT:
				setLfdNrAmBezugspunkt((Lfd_Nr_Am_Bezugspunkt_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__BREMSWEG:
				setBremsweg((Bremsweg_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG:
				setDPTypESG((DP_Typ_ESG_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__INDIVIDUELL:
				setIndividuell((Individuell_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT:
				setLfdNrAmBezugspunkt((Lfd_Nr_Am_Bezugspunkt_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__BREMSWEG:
				return bremsweg != null;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG:
				return dPTypESG != null;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__INDIVIDUELL:
				return individuell != null;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT:
				return lfdNrAmBezugspunkt != null;
		}
		return super.eIsSet(featureID);
	}

} //DP_Typ_GESG_AttributeGroupImpl
