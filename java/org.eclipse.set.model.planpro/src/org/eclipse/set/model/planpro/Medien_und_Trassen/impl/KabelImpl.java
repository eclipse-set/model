/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Medien_und_Trassen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Element_AttributeGroup;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage;

import org.eclipse.set.model.planpro.Verweise.ID_Trasse_Kante_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kabel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.KabelImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.KabelImpl#getIDTrasseKante <em>ID Trasse Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.KabelImpl#getKabelAllg <em>Kabel Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.KabelImpl#getKabelElement <em>Kabel Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KabelImpl extends Basis_ObjektImpl implements Kabel {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Kabel_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDTrasseKante() <em>ID Trasse Kante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDTrasseKante()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Trasse_Kante_TypeClass> iDTrasseKante;

	/**
	 * The cached value of the '{@link #getKabelAllg() <em>Kabel Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabelAllg()
	 * @generated
	 * @ordered
	 */
	protected Kabel_Allg_AttributeGroup kabelAllg;

	/**
	 * The cached value of the '{@link #getKabelElement() <em>Kabel Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Kabel_Element_AttributeGroup> kabelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Medien_und_TrassenPackage.Literals.KABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Kabel_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Kabel_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Kabel_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Trasse_Kante_TypeClass> getIDTrasseKante() {
		if (iDTrasseKante == null) {
			iDTrasseKante = new EObjectContainmentEList<ID_Trasse_Kante_TypeClass>(ID_Trasse_Kante_TypeClass.class, this, Medien_und_TrassenPackage.KABEL__ID_TRASSE_KANTE);
		}
		return iDTrasseKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Allg_AttributeGroup getKabelAllg() {
		return kabelAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKabelAllg(Kabel_Allg_AttributeGroup newKabelAllg, NotificationChain msgs) {
		Kabel_Allg_AttributeGroup oldKabelAllg = kabelAllg;
		kabelAllg = newKabelAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL__KABEL_ALLG, oldKabelAllg, newKabelAllg);
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
	public void setKabelAllg(Kabel_Allg_AttributeGroup newKabelAllg) {
		if (newKabelAllg != kabelAllg) {
			NotificationChain msgs = null;
			if (kabelAllg != null)
				msgs = ((InternalEObject)kabelAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL__KABEL_ALLG, null, msgs);
			if (newKabelAllg != null)
				msgs = ((InternalEObject)newKabelAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL__KABEL_ALLG, null, msgs);
			msgs = basicSetKabelAllg(newKabelAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL__KABEL_ALLG, newKabelAllg, newKabelAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Kabel_Element_AttributeGroup> getKabelElement() {
		if (kabelElement == null) {
			kabelElement = new EObjectContainmentEList<Kabel_Element_AttributeGroup>(Kabel_Element_AttributeGroup.class, this, Medien_und_TrassenPackage.KABEL__KABEL_ELEMENT);
		}
		return kabelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Medien_und_TrassenPackage.KABEL__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Medien_und_TrassenPackage.KABEL__ID_TRASSE_KANTE:
				return ((InternalEList<?>)getIDTrasseKante()).basicRemove(otherEnd, msgs);
			case Medien_und_TrassenPackage.KABEL__KABEL_ALLG:
				return basicSetKabelAllg(null, msgs);
			case Medien_und_TrassenPackage.KABEL__KABEL_ELEMENT:
				return ((InternalEList<?>)getKabelElement()).basicRemove(otherEnd, msgs);
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
			case Medien_und_TrassenPackage.KABEL__BEZEICHNUNG:
				return getBezeichnung();
			case Medien_und_TrassenPackage.KABEL__ID_TRASSE_KANTE:
				return getIDTrasseKante();
			case Medien_und_TrassenPackage.KABEL__KABEL_ALLG:
				return getKabelAllg();
			case Medien_und_TrassenPackage.KABEL__KABEL_ELEMENT:
				return getKabelElement();
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
			case Medien_und_TrassenPackage.KABEL__BEZEICHNUNG:
				setBezeichnung((Kabel_Bezeichnung_AttributeGroup)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL__ID_TRASSE_KANTE:
				getIDTrasseKante().clear();
				getIDTrasseKante().addAll((Collection<? extends ID_Trasse_Kante_TypeClass>)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL__KABEL_ALLG:
				setKabelAllg((Kabel_Allg_AttributeGroup)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL__KABEL_ELEMENT:
				getKabelElement().clear();
				getKabelElement().addAll((Collection<? extends Kabel_Element_AttributeGroup>)newValue);
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
			case Medien_und_TrassenPackage.KABEL__BEZEICHNUNG:
				setBezeichnung((Kabel_Bezeichnung_AttributeGroup)null);
				return;
			case Medien_und_TrassenPackage.KABEL__ID_TRASSE_KANTE:
				getIDTrasseKante().clear();
				return;
			case Medien_und_TrassenPackage.KABEL__KABEL_ALLG:
				setKabelAllg((Kabel_Allg_AttributeGroup)null);
				return;
			case Medien_und_TrassenPackage.KABEL__KABEL_ELEMENT:
				getKabelElement().clear();
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
			case Medien_und_TrassenPackage.KABEL__BEZEICHNUNG:
				return bezeichnung != null;
			case Medien_und_TrassenPackage.KABEL__ID_TRASSE_KANTE:
				return iDTrasseKante != null && !iDTrasseKante.isEmpty();
			case Medien_und_TrassenPackage.KABEL__KABEL_ALLG:
				return kabelAllg != null;
			case Medien_und_TrassenPackage.KABEL__KABEL_ELEMENT:
				return kabelElement != null && !kabelElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KabelImpl
