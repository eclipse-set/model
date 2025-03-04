/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Hersteller_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Art_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Geraetestand_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Typ_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Modul Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LEU_Modul_Allg_AttributeGroupImpl#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LEU_Modul_Allg_AttributeGroupImpl#getLEUModulArt <em>LEU Modul Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LEU_Modul_Allg_AttributeGroupImpl#getLEUModulGeraetestand <em>LEU Modul Geraetestand</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LEU_Modul_Allg_AttributeGroupImpl#getLEUModulTyp <em>LEU Modul Typ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_Modul_Allg_AttributeGroupImpl extends EObjectImpl implements LEU_Modul_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getHersteller() <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHersteller()
	 * @generated
	 * @ordered
	 */
	protected Hersteller_TypeClass hersteller;

	/**
	 * The cached value of the '{@link #getLEUModulArt() <em>LEU Modul Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUModulArt()
	 * @generated
	 * @ordered
	 */
	protected LEU_Modul_Art_TypeClass lEUModulArt;

	/**
	 * The cached value of the '{@link #getLEUModulGeraetestand() <em>LEU Modul Geraetestand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUModulGeraetestand()
	 * @generated
	 * @ordered
	 */
	protected LEU_Modul_Geraetestand_TypeClass lEUModulGeraetestand;

	/**
	 * The cached value of the '{@link #getLEUModulTyp() <em>LEU Modul Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUModulTyp()
	 * @generated
	 * @ordered
	 */
	protected LEU_Modul_Typ_TypeClass lEUModulTyp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_Modul_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Modul_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hersteller_TypeClass getHersteller() {
		return hersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHersteller(Hersteller_TypeClass newHersteller, NotificationChain msgs) {
		Hersteller_TypeClass oldHersteller = hersteller;
		hersteller = newHersteller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__HERSTELLER, oldHersteller, newHersteller);
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
	public void setHersteller(Hersteller_TypeClass newHersteller) {
		if (newHersteller != hersteller) {
			NotificationChain msgs = null;
			if (hersteller != null)
				msgs = ((InternalEObject)hersteller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			if (newHersteller != null)
				msgs = ((InternalEObject)newHersteller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			msgs = basicSetHersteller(newHersteller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__HERSTELLER, newHersteller, newHersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul_Art_TypeClass getLEUModulArt() {
		return lEUModulArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUModulArt(LEU_Modul_Art_TypeClass newLEUModulArt, NotificationChain msgs) {
		LEU_Modul_Art_TypeClass oldLEUModulArt = lEUModulArt;
		lEUModulArt = newLEUModulArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_ART, oldLEUModulArt, newLEUModulArt);
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
	public void setLEUModulArt(LEU_Modul_Art_TypeClass newLEUModulArt) {
		if (newLEUModulArt != lEUModulArt) {
			NotificationChain msgs = null;
			if (lEUModulArt != null)
				msgs = ((InternalEObject)lEUModulArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_ART, null, msgs);
			if (newLEUModulArt != null)
				msgs = ((InternalEObject)newLEUModulArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_ART, null, msgs);
			msgs = basicSetLEUModulArt(newLEUModulArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_ART, newLEUModulArt, newLEUModulArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul_Geraetestand_TypeClass getLEUModulGeraetestand() {
		return lEUModulGeraetestand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUModulGeraetestand(LEU_Modul_Geraetestand_TypeClass newLEUModulGeraetestand, NotificationChain msgs) {
		LEU_Modul_Geraetestand_TypeClass oldLEUModulGeraetestand = lEUModulGeraetestand;
		lEUModulGeraetestand = newLEUModulGeraetestand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_GERAETESTAND, oldLEUModulGeraetestand, newLEUModulGeraetestand);
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
	public void setLEUModulGeraetestand(LEU_Modul_Geraetestand_TypeClass newLEUModulGeraetestand) {
		if (newLEUModulGeraetestand != lEUModulGeraetestand) {
			NotificationChain msgs = null;
			if (lEUModulGeraetestand != null)
				msgs = ((InternalEObject)lEUModulGeraetestand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_GERAETESTAND, null, msgs);
			if (newLEUModulGeraetestand != null)
				msgs = ((InternalEObject)newLEUModulGeraetestand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_GERAETESTAND, null, msgs);
			msgs = basicSetLEUModulGeraetestand(newLEUModulGeraetestand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_GERAETESTAND, newLEUModulGeraetestand, newLEUModulGeraetestand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul_Typ_TypeClass getLEUModulTyp() {
		return lEUModulTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUModulTyp(LEU_Modul_Typ_TypeClass newLEUModulTyp, NotificationChain msgs) {
		LEU_Modul_Typ_TypeClass oldLEUModulTyp = lEUModulTyp;
		lEUModulTyp = newLEUModulTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_TYP, oldLEUModulTyp, newLEUModulTyp);
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
	public void setLEUModulTyp(LEU_Modul_Typ_TypeClass newLEUModulTyp) {
		if (newLEUModulTyp != lEUModulTyp) {
			NotificationChain msgs = null;
			if (lEUModulTyp != null)
				msgs = ((InternalEObject)lEUModulTyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_TYP, null, msgs);
			if (newLEUModulTyp != null)
				msgs = ((InternalEObject)newLEUModulTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_TYP, null, msgs);
			msgs = basicSetLEUModulTyp(newLEUModulTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_TYP, newLEUModulTyp, newLEUModulTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return basicSetHersteller(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_ART:
				return basicSetLEUModulArt(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_GERAETESTAND:
				return basicSetLEUModulGeraetestand(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_TYP:
				return basicSetLEUModulTyp(null, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return getHersteller();
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_ART:
				return getLEUModulArt();
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_GERAETESTAND:
				return getLEUModulGeraetestand();
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_TYP:
				return getLEUModulTyp();
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_ART:
				setLEUModulArt((LEU_Modul_Art_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_GERAETESTAND:
				setLEUModulGeraetestand((LEU_Modul_Geraetestand_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_TYP:
				setLEUModulTyp((LEU_Modul_Typ_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_ART:
				setLEUModulArt((LEU_Modul_Art_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_GERAETESTAND:
				setLEUModulGeraetestand((LEU_Modul_Geraetestand_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_TYP:
				setLEUModulTyp((LEU_Modul_Typ_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return hersteller != null;
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_ART:
				return lEUModulArt != null;
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_GERAETESTAND:
				return lEUModulGeraetestand != null;
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP__LEU_MODUL_TYP:
				return lEUModulTyp != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //LEU_Modul_Allg_AttributeGroupImpl
