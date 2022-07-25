/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.Bf_Kennung_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.Koppelunterstation_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZBS_Adresse_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZBS_Anbindung_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation_Bf_Nr_AttributeGroup;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Unterstation Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Unterstation_Allg_AttributeGroupImpl#getBfKennung <em>Bf Kennung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Unterstation_Allg_AttributeGroupImpl#getKoppelunterstation <em>Koppelunterstation</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Unterstation_Allg_AttributeGroupImpl#getZBSAdresse <em>ZBS Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Unterstation_Allg_AttributeGroupImpl#getZBSAnbindung <em>ZBS Anbindung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Unterstation_Allg_AttributeGroupImpl#getZNUnterstationBfNr <em>ZN Unterstation Bf Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_Unterstation_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZN_Unterstation_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBfKennung() <em>Bf Kennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBfKennung()
	 * @generated
	 * @ordered
	 */
	protected Bf_Kennung_TypeClass bfKennung;

	/**
	 * The cached value of the '{@link #getKoppelunterstation() <em>Koppelunterstation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKoppelunterstation()
	 * @generated
	 * @ordered
	 */
	protected Koppelunterstation_TypeClass koppelunterstation;

	/**
	 * The cached value of the '{@link #getZBSAdresse() <em>ZBS Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSAdresse()
	 * @generated
	 * @ordered
	 */
	protected ZBS_Adresse_TypeClass zBSAdresse;

	/**
	 * The cached value of the '{@link #getZBSAnbindung() <em>ZBS Anbindung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSAnbindung()
	 * @generated
	 * @ordered
	 */
	protected ZBS_Anbindung_TypeClass zBSAnbindung;

	/**
	 * The cached value of the '{@link #getZNUnterstationBfNr() <em>ZN Unterstation Bf Nr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNUnterstationBfNr()
	 * @generated
	 * @ordered
	 */
	protected EList<ZN_Unterstation_Bf_Nr_AttributeGroup> zNUnterstationBfNr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_Unterstation_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bf_Kennung_TypeClass getBfKennung() {
		return bfKennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBfKennung(Bf_Kennung_TypeClass newBfKennung, NotificationChain msgs) {
		Bf_Kennung_TypeClass oldBfKennung = bfKennung;
		bfKennung = newBfKennung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__BF_KENNUNG, oldBfKennung, newBfKennung);
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
	public void setBfKennung(Bf_Kennung_TypeClass newBfKennung) {
		if (newBfKennung != bfKennung) {
			NotificationChain msgs = null;
			if (bfKennung != null)
				msgs = ((InternalEObject)bfKennung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__BF_KENNUNG, null, msgs);
			if (newBfKennung != null)
				msgs = ((InternalEObject)newBfKennung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__BF_KENNUNG, null, msgs);
			msgs = basicSetBfKennung(newBfKennung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__BF_KENNUNG, newBfKennung, newBfKennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Koppelunterstation_TypeClass getKoppelunterstation() {
		return koppelunterstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKoppelunterstation(Koppelunterstation_TypeClass newKoppelunterstation, NotificationChain msgs) {
		Koppelunterstation_TypeClass oldKoppelunterstation = koppelunterstation;
		koppelunterstation = newKoppelunterstation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__KOPPELUNTERSTATION, oldKoppelunterstation, newKoppelunterstation);
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
	public void setKoppelunterstation(Koppelunterstation_TypeClass newKoppelunterstation) {
		if (newKoppelunterstation != koppelunterstation) {
			NotificationChain msgs = null;
			if (koppelunterstation != null)
				msgs = ((InternalEObject)koppelunterstation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__KOPPELUNTERSTATION, null, msgs);
			if (newKoppelunterstation != null)
				msgs = ((InternalEObject)newKoppelunterstation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__KOPPELUNTERSTATION, null, msgs);
			msgs = basicSetKoppelunterstation(newKoppelunterstation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__KOPPELUNTERSTATION, newKoppelunterstation, newKoppelunterstation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Adresse_TypeClass getZBSAdresse() {
		return zBSAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBSAdresse(ZBS_Adresse_TypeClass newZBSAdresse, NotificationChain msgs) {
		ZBS_Adresse_TypeClass oldZBSAdresse = zBSAdresse;
		zBSAdresse = newZBSAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ADRESSE, oldZBSAdresse, newZBSAdresse);
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
	public void setZBSAdresse(ZBS_Adresse_TypeClass newZBSAdresse) {
		if (newZBSAdresse != zBSAdresse) {
			NotificationChain msgs = null;
			if (zBSAdresse != null)
				msgs = ((InternalEObject)zBSAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ADRESSE, null, msgs);
			if (newZBSAdresse != null)
				msgs = ((InternalEObject)newZBSAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ADRESSE, null, msgs);
			msgs = basicSetZBSAdresse(newZBSAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ADRESSE, newZBSAdresse, newZBSAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Anbindung_TypeClass getZBSAnbindung() {
		return zBSAnbindung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBSAnbindung(ZBS_Anbindung_TypeClass newZBSAnbindung, NotificationChain msgs) {
		ZBS_Anbindung_TypeClass oldZBSAnbindung = zBSAnbindung;
		zBSAnbindung = newZBSAnbindung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ANBINDUNG, oldZBSAnbindung, newZBSAnbindung);
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
	public void setZBSAnbindung(ZBS_Anbindung_TypeClass newZBSAnbindung) {
		if (newZBSAnbindung != zBSAnbindung) {
			NotificationChain msgs = null;
			if (zBSAnbindung != null)
				msgs = ((InternalEObject)zBSAnbindung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ANBINDUNG, null, msgs);
			if (newZBSAnbindung != null)
				msgs = ((InternalEObject)newZBSAnbindung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ANBINDUNG, null, msgs);
			msgs = basicSetZBSAnbindung(newZBSAnbindung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ANBINDUNG, newZBSAnbindung, newZBSAnbindung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZN_Unterstation_Bf_Nr_AttributeGroup> getZNUnterstationBfNr() {
		if (zNUnterstationBfNr == null) {
			zNUnterstationBfNr = new EObjectContainmentEList<ZN_Unterstation_Bf_Nr_AttributeGroup>(ZN_Unterstation_Bf_Nr_AttributeGroup.class, this, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZN_UNTERSTATION_BF_NR);
		}
		return zNUnterstationBfNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__BF_KENNUNG:
				return basicSetBfKennung(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__KOPPELUNTERSTATION:
				return basicSetKoppelunterstation(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ADRESSE:
				return basicSetZBSAdresse(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ANBINDUNG:
				return basicSetZBSAnbindung(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZN_UNTERSTATION_BF_NR:
				return ((InternalEList<?>)getZNUnterstationBfNr()).basicRemove(otherEnd, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__BF_KENNUNG:
				return getBfKennung();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__KOPPELUNTERSTATION:
				return getKoppelunterstation();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ADRESSE:
				return getZBSAdresse();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ANBINDUNG:
				return getZBSAnbindung();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZN_UNTERSTATION_BF_NR:
				return getZNUnterstationBfNr();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__BF_KENNUNG:
				setBfKennung((Bf_Kennung_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__KOPPELUNTERSTATION:
				setKoppelunterstation((Koppelunterstation_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ADRESSE:
				setZBSAdresse((ZBS_Adresse_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ANBINDUNG:
				setZBSAnbindung((ZBS_Anbindung_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZN_UNTERSTATION_BF_NR:
				getZNUnterstationBfNr().clear();
				getZNUnterstationBfNr().addAll((Collection<? extends ZN_Unterstation_Bf_Nr_AttributeGroup>)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__BF_KENNUNG:
				setBfKennung((Bf_Kennung_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__KOPPELUNTERSTATION:
				setKoppelunterstation((Koppelunterstation_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ADRESSE:
				setZBSAdresse((ZBS_Adresse_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ANBINDUNG:
				setZBSAnbindung((ZBS_Anbindung_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZN_UNTERSTATION_BF_NR:
				getZNUnterstationBfNr().clear();
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__BF_KENNUNG:
				return bfKennung != null;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__KOPPELUNTERSTATION:
				return koppelunterstation != null;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ADRESSE:
				return zBSAdresse != null;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ANBINDUNG:
				return zBSAnbindung != null;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZN_UNTERSTATION_BF_NR:
				return zNUnterstationBfNr != null && !zNUnterstationBfNr.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZN_Unterstation_Allg_AttributeGroupImpl
