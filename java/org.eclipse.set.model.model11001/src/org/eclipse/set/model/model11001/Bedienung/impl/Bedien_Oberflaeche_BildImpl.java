/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Bedienung.Bedien_Oberflaeche_Bild;
import org.eclipse.set.model.model11001.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Bedienung.BedienungPackage;

import org.eclipse.set.model.model11001.Verweise.ID_Bedien_Oberflaeche_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Oertlichkeit_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Oberflaeche Bild</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_Oberflaeche_BildImpl#getBedienOberflaecheBildAllg <em>Bedien Oberflaeche Bild Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_Oberflaeche_BildImpl#getIDBedienOberflaeche <em>ID Bedien Oberflaeche</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_Oberflaeche_BildImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Oberflaeche_BildImpl extends Basis_ObjektImpl implements Bedien_Oberflaeche_Bild {
	/**
	 * The cached value of the '{@link #getBedienOberflaecheBildAllg() <em>Bedien Oberflaeche Bild Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienOberflaecheBildAllg()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Oberflaeche_Bild_Allg_AttributeGroup bedienOberflaecheBildAllg;

	/**
	 * The cached value of the '{@link #getIDBedienOberflaeche() <em>ID Bedien Oberflaeche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienOberflaeche()
	 * @generated
	 * @ordered
	 */
	protected ID_Bedien_Oberflaeche_TypeClass iDBedienOberflaeche;

	/**
	 * The cached value of the '{@link #getIDOertlichkeit() <em>ID Oertlichkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected ID_Oertlichkeit_Proxy_TypeClass iDOertlichkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Oberflaeche_BildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_OBERFLAECHE_BILD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Oberflaeche_Bild_Allg_AttributeGroup getBedienOberflaecheBildAllg() {
		return bedienOberflaecheBildAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienOberflaecheBildAllg(Bedien_Oberflaeche_Bild_Allg_AttributeGroup newBedienOberflaecheBildAllg, NotificationChain msgs) {
		Bedien_Oberflaeche_Bild_Allg_AttributeGroup oldBedienOberflaecheBildAllg = bedienOberflaecheBildAllg;
		bedienOberflaecheBildAllg = newBedienOberflaecheBildAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG, oldBedienOberflaecheBildAllg, newBedienOberflaecheBildAllg);
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
	public void setBedienOberflaecheBildAllg(Bedien_Oberflaeche_Bild_Allg_AttributeGroup newBedienOberflaecheBildAllg) {
		if (newBedienOberflaecheBildAllg != bedienOberflaecheBildAllg) {
			NotificationChain msgs = null;
			if (bedienOberflaecheBildAllg != null)
				msgs = ((InternalEObject)bedienOberflaecheBildAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG, null, msgs);
			if (newBedienOberflaecheBildAllg != null)
				msgs = ((InternalEObject)newBedienOberflaecheBildAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG, null, msgs);
			msgs = basicSetBedienOberflaecheBildAllg(newBedienOberflaecheBildAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG, newBedienOberflaecheBildAllg, newBedienOberflaecheBildAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Oberflaeche_TypeClass getIDBedienOberflaeche() {
		return iDBedienOberflaeche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBedienOberflaeche(ID_Bedien_Oberflaeche_TypeClass newIDBedienOberflaeche, NotificationChain msgs) {
		ID_Bedien_Oberflaeche_TypeClass oldIDBedienOberflaeche = iDBedienOberflaeche;
		iDBedienOberflaeche = newIDBedienOberflaeche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE, oldIDBedienOberflaeche, newIDBedienOberflaeche);
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
	public void setIDBedienOberflaeche(ID_Bedien_Oberflaeche_TypeClass newIDBedienOberflaeche) {
		if (newIDBedienOberflaeche != iDBedienOberflaeche) {
			NotificationChain msgs = null;
			if (iDBedienOberflaeche != null)
				msgs = ((InternalEObject)iDBedienOberflaeche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE, null, msgs);
			if (newIDBedienOberflaeche != null)
				msgs = ((InternalEObject)newIDBedienOberflaeche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE, null, msgs);
			msgs = basicSetIDBedienOberflaeche(newIDBedienOberflaeche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE, newIDBedienOberflaeche, newIDBedienOberflaeche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_Proxy_TypeClass getIDOertlichkeit() {
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDOertlichkeit(ID_Oertlichkeit_Proxy_TypeClass newIDOertlichkeit, NotificationChain msgs) {
		ID_Oertlichkeit_Proxy_TypeClass oldIDOertlichkeit = iDOertlichkeit;
		iDOertlichkeit = newIDOertlichkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT, oldIDOertlichkeit, newIDOertlichkeit);
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
	public void setIDOertlichkeit(ID_Oertlichkeit_Proxy_TypeClass newIDOertlichkeit) {
		if (newIDOertlichkeit != iDOertlichkeit) {
			NotificationChain msgs = null;
			if (iDOertlichkeit != null)
				msgs = ((InternalEObject)iDOertlichkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT, null, msgs);
			if (newIDOertlichkeit != null)
				msgs = ((InternalEObject)newIDOertlichkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT, null, msgs);
			msgs = basicSetIDOertlichkeit(newIDOertlichkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT, newIDOertlichkeit, newIDOertlichkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG:
				return basicSetBedienOberflaecheBildAllg(null, msgs);
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE:
				return basicSetIDBedienOberflaeche(null, msgs);
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT:
				return basicSetIDOertlichkeit(null, msgs);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG:
				return getBedienOberflaecheBildAllg();
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE:
				return getIDBedienOberflaeche();
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT:
				return getIDOertlichkeit();
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG:
				setBedienOberflaecheBildAllg((Bedien_Oberflaeche_Bild_Allg_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE:
				setIDBedienOberflaeche((ID_Bedien_Oberflaeche_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT:
				setIDOertlichkeit((ID_Oertlichkeit_Proxy_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG:
				setBedienOberflaecheBildAllg((Bedien_Oberflaeche_Bild_Allg_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE:
				setIDBedienOberflaeche((ID_Bedien_Oberflaeche_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT:
				setIDOertlichkeit((ID_Oertlichkeit_Proxy_TypeClass)null);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG:
				return bedienOberflaecheBildAllg != null;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE:
				return iDBedienOberflaeche != null;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT:
				return iDOertlichkeit != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Oberflaeche_BildImpl
