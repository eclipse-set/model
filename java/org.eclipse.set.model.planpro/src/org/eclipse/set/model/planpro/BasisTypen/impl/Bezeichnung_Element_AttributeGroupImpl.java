/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.BasisTypen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Aussenanlage_TypeClass;
import org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Element_AttributeGroup;
import org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Lageplan_Kurz_TypeClass;
import org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Lageplan_Lang_TypeClass;
import org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Tabelle_TypeClass;
import org.eclipse.set.model.planpro.BasisTypen.Kennzahl_TypeClass;
import org.eclipse.set.model.planpro.BasisTypen.Oertlicher_Elementname_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bezeichnung Element Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.BasisTypen.impl.Bezeichnung_Element_AttributeGroupImpl#getBezeichnungAussenanlage <em>Bezeichnung Aussenanlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.BasisTypen.impl.Bezeichnung_Element_AttributeGroupImpl#getBezeichnungLageplanKurz <em>Bezeichnung Lageplan Kurz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.BasisTypen.impl.Bezeichnung_Element_AttributeGroupImpl#getBezeichnungLageplanLang <em>Bezeichnung Lageplan Lang</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.BasisTypen.impl.Bezeichnung_Element_AttributeGroupImpl#getBezeichnungTabelle <em>Bezeichnung Tabelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.BasisTypen.impl.Bezeichnung_Element_AttributeGroupImpl#getKennzahl <em>Kennzahl</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.BasisTypen.impl.Bezeichnung_Element_AttributeGroupImpl#getOertlicherElementname <em>Oertlicher Elementname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bezeichnung_Element_AttributeGroupImpl extends EObjectImpl implements Bezeichnung_Element_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungAussenanlage() <em>Bezeichnung Aussenanlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungAussenanlage()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Aussenanlage_TypeClass bezeichnungAussenanlage;

	/**
	 * The cached value of the '{@link #getBezeichnungLageplanKurz() <em>Bezeichnung Lageplan Kurz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungLageplanKurz()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Lageplan_Kurz_TypeClass bezeichnungLageplanKurz;

	/**
	 * The cached value of the '{@link #getBezeichnungLageplanLang() <em>Bezeichnung Lageplan Lang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungLageplanLang()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Lageplan_Lang_TypeClass bezeichnungLageplanLang;

	/**
	 * The cached value of the '{@link #getBezeichnungTabelle() <em>Bezeichnung Tabelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungTabelle()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Tabelle_TypeClass bezeichnungTabelle;

	/**
	 * The cached value of the '{@link #getKennzahl() <em>Kennzahl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennzahl()
	 * @generated
	 * @ordered
	 */
	protected Kennzahl_TypeClass kennzahl;

	/**
	 * The cached value of the '{@link #getOertlicherElementname() <em>Oertlicher Elementname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOertlicherElementname()
	 * @generated
	 * @ordered
	 */
	protected Oertlicher_Elementname_TypeClass oertlicherElementname;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bezeichnung_Element_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisTypenPackage.Literals.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Aussenanlage_TypeClass getBezeichnungAussenanlage() {
		return bezeichnungAussenanlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungAussenanlage(Bezeichnung_Aussenanlage_TypeClass newBezeichnungAussenanlage, NotificationChain msgs) {
		Bezeichnung_Aussenanlage_TypeClass oldBezeichnungAussenanlage = bezeichnungAussenanlage;
		bezeichnungAussenanlage = newBezeichnungAussenanlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_AUSSENANLAGE, oldBezeichnungAussenanlage, newBezeichnungAussenanlage);
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
	public void setBezeichnungAussenanlage(Bezeichnung_Aussenanlage_TypeClass newBezeichnungAussenanlage) {
		if (newBezeichnungAussenanlage != bezeichnungAussenanlage) {
			NotificationChain msgs = null;
			if (bezeichnungAussenanlage != null)
				msgs = ((InternalEObject)bezeichnungAussenanlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_AUSSENANLAGE, null, msgs);
			if (newBezeichnungAussenanlage != null)
				msgs = ((InternalEObject)newBezeichnungAussenanlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_AUSSENANLAGE, null, msgs);
			msgs = basicSetBezeichnungAussenanlage(newBezeichnungAussenanlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_AUSSENANLAGE, newBezeichnungAussenanlage, newBezeichnungAussenanlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Lageplan_Kurz_TypeClass getBezeichnungLageplanKurz() {
		return bezeichnungLageplanKurz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungLageplanKurz(Bezeichnung_Lageplan_Kurz_TypeClass newBezeichnungLageplanKurz, NotificationChain msgs) {
		Bezeichnung_Lageplan_Kurz_TypeClass oldBezeichnungLageplanKurz = bezeichnungLageplanKurz;
		bezeichnungLageplanKurz = newBezeichnungLageplanKurz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_KURZ, oldBezeichnungLageplanKurz, newBezeichnungLageplanKurz);
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
	public void setBezeichnungLageplanKurz(Bezeichnung_Lageplan_Kurz_TypeClass newBezeichnungLageplanKurz) {
		if (newBezeichnungLageplanKurz != bezeichnungLageplanKurz) {
			NotificationChain msgs = null;
			if (bezeichnungLageplanKurz != null)
				msgs = ((InternalEObject)bezeichnungLageplanKurz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_KURZ, null, msgs);
			if (newBezeichnungLageplanKurz != null)
				msgs = ((InternalEObject)newBezeichnungLageplanKurz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_KURZ, null, msgs);
			msgs = basicSetBezeichnungLageplanKurz(newBezeichnungLageplanKurz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_KURZ, newBezeichnungLageplanKurz, newBezeichnungLageplanKurz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Lageplan_Lang_TypeClass getBezeichnungLageplanLang() {
		return bezeichnungLageplanLang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungLageplanLang(Bezeichnung_Lageplan_Lang_TypeClass newBezeichnungLageplanLang, NotificationChain msgs) {
		Bezeichnung_Lageplan_Lang_TypeClass oldBezeichnungLageplanLang = bezeichnungLageplanLang;
		bezeichnungLageplanLang = newBezeichnungLageplanLang;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_LANG, oldBezeichnungLageplanLang, newBezeichnungLageplanLang);
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
	public void setBezeichnungLageplanLang(Bezeichnung_Lageplan_Lang_TypeClass newBezeichnungLageplanLang) {
		if (newBezeichnungLageplanLang != bezeichnungLageplanLang) {
			NotificationChain msgs = null;
			if (bezeichnungLageplanLang != null)
				msgs = ((InternalEObject)bezeichnungLageplanLang).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_LANG, null, msgs);
			if (newBezeichnungLageplanLang != null)
				msgs = ((InternalEObject)newBezeichnungLageplanLang).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_LANG, null, msgs);
			msgs = basicSetBezeichnungLageplanLang(newBezeichnungLageplanLang, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_LANG, newBezeichnungLageplanLang, newBezeichnungLageplanLang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Tabelle_TypeClass getBezeichnungTabelle() {
		return bezeichnungTabelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungTabelle(Bezeichnung_Tabelle_TypeClass newBezeichnungTabelle, NotificationChain msgs) {
		Bezeichnung_Tabelle_TypeClass oldBezeichnungTabelle = bezeichnungTabelle;
		bezeichnungTabelle = newBezeichnungTabelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_TABELLE, oldBezeichnungTabelle, newBezeichnungTabelle);
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
	public void setBezeichnungTabelle(Bezeichnung_Tabelle_TypeClass newBezeichnungTabelle) {
		if (newBezeichnungTabelle != bezeichnungTabelle) {
			NotificationChain msgs = null;
			if (bezeichnungTabelle != null)
				msgs = ((InternalEObject)bezeichnungTabelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_TABELLE, null, msgs);
			if (newBezeichnungTabelle != null)
				msgs = ((InternalEObject)newBezeichnungTabelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_TABELLE, null, msgs);
			msgs = basicSetBezeichnungTabelle(newBezeichnungTabelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_TABELLE, newBezeichnungTabelle, newBezeichnungTabelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kennzahl_TypeClass getKennzahl() {
		return kennzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKennzahl(Kennzahl_TypeClass newKennzahl, NotificationChain msgs) {
		Kennzahl_TypeClass oldKennzahl = kennzahl;
		kennzahl = newKennzahl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__KENNZAHL, oldKennzahl, newKennzahl);
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
	public void setKennzahl(Kennzahl_TypeClass newKennzahl) {
		if (newKennzahl != kennzahl) {
			NotificationChain msgs = null;
			if (kennzahl != null)
				msgs = ((InternalEObject)kennzahl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__KENNZAHL, null, msgs);
			if (newKennzahl != null)
				msgs = ((InternalEObject)newKennzahl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__KENNZAHL, null, msgs);
			msgs = basicSetKennzahl(newKennzahl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__KENNZAHL, newKennzahl, newKennzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlicher_Elementname_TypeClass getOertlicherElementname() {
		return oertlicherElementname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOertlicherElementname(Oertlicher_Elementname_TypeClass newOertlicherElementname, NotificationChain msgs) {
		Oertlicher_Elementname_TypeClass oldOertlicherElementname = oertlicherElementname;
		oertlicherElementname = newOertlicherElementname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__OERTLICHER_ELEMENTNAME, oldOertlicherElementname, newOertlicherElementname);
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
	public void setOertlicherElementname(Oertlicher_Elementname_TypeClass newOertlicherElementname) {
		if (newOertlicherElementname != oertlicherElementname) {
			NotificationChain msgs = null;
			if (oertlicherElementname != null)
				msgs = ((InternalEObject)oertlicherElementname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__OERTLICHER_ELEMENTNAME, null, msgs);
			if (newOertlicherElementname != null)
				msgs = ((InternalEObject)newOertlicherElementname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__OERTLICHER_ELEMENTNAME, null, msgs);
			msgs = basicSetOertlicherElementname(newOertlicherElementname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__OERTLICHER_ELEMENTNAME, newOertlicherElementname, newOertlicherElementname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_AUSSENANLAGE:
				return basicSetBezeichnungAussenanlage(null, msgs);
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_KURZ:
				return basicSetBezeichnungLageplanKurz(null, msgs);
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_LANG:
				return basicSetBezeichnungLageplanLang(null, msgs);
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_TABELLE:
				return basicSetBezeichnungTabelle(null, msgs);
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__KENNZAHL:
				return basicSetKennzahl(null, msgs);
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__OERTLICHER_ELEMENTNAME:
				return basicSetOertlicherElementname(null, msgs);
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
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_AUSSENANLAGE:
				return getBezeichnungAussenanlage();
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_KURZ:
				return getBezeichnungLageplanKurz();
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_LANG:
				return getBezeichnungLageplanLang();
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_TABELLE:
				return getBezeichnungTabelle();
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__KENNZAHL:
				return getKennzahl();
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__OERTLICHER_ELEMENTNAME:
				return getOertlicherElementname();
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
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_AUSSENANLAGE:
				setBezeichnungAussenanlage((Bezeichnung_Aussenanlage_TypeClass)newValue);
				return;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_KURZ:
				setBezeichnungLageplanKurz((Bezeichnung_Lageplan_Kurz_TypeClass)newValue);
				return;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_LANG:
				setBezeichnungLageplanLang((Bezeichnung_Lageplan_Lang_TypeClass)newValue);
				return;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_TABELLE:
				setBezeichnungTabelle((Bezeichnung_Tabelle_TypeClass)newValue);
				return;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__KENNZAHL:
				setKennzahl((Kennzahl_TypeClass)newValue);
				return;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__OERTLICHER_ELEMENTNAME:
				setOertlicherElementname((Oertlicher_Elementname_TypeClass)newValue);
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
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_AUSSENANLAGE:
				setBezeichnungAussenanlage((Bezeichnung_Aussenanlage_TypeClass)null);
				return;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_KURZ:
				setBezeichnungLageplanKurz((Bezeichnung_Lageplan_Kurz_TypeClass)null);
				return;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_LANG:
				setBezeichnungLageplanLang((Bezeichnung_Lageplan_Lang_TypeClass)null);
				return;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_TABELLE:
				setBezeichnungTabelle((Bezeichnung_Tabelle_TypeClass)null);
				return;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__KENNZAHL:
				setKennzahl((Kennzahl_TypeClass)null);
				return;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__OERTLICHER_ELEMENTNAME:
				setOertlicherElementname((Oertlicher_Elementname_TypeClass)null);
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
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_AUSSENANLAGE:
				return bezeichnungAussenanlage != null;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_KURZ:
				return bezeichnungLageplanKurz != null;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_LANG:
				return bezeichnungLageplanLang != null;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_TABELLE:
				return bezeichnungTabelle != null;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__KENNZAHL:
				return kennzahl != null;
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__OERTLICHER_ELEMENTNAME:
				return oertlicherElementname != null;
		}
		return super.eIsSet(featureID);
	}

} //Bezeichnung_Element_AttributeGroupImpl
