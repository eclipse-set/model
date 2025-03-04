/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BSO_Teilsystem_Art_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;
import org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Blau_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.IP_Adressblock_Grau_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BSO IP AB Teilsystem Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.BSO_IP_AB_Teilsystem_AttributeGroupImpl#getBSOTeilsystemArt <em>BSO Teilsystem Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.BSO_IP_AB_Teilsystem_AttributeGroupImpl#getIPAdressblockBlau <em>IP Adressblock Blau</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.BSO_IP_AB_Teilsystem_AttributeGroupImpl#getIPAdressblockGrau <em>IP Adressblock Grau</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSO_IP_AB_Teilsystem_AttributeGroupImpl extends EObjectImpl implements BSO_IP_AB_Teilsystem_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBSOTeilsystemArt() <em>BSO Teilsystem Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBSOTeilsystemArt()
	 * @generated
	 * @ordered
	 */
	protected BSO_Teilsystem_Art_TypeClass bSOTeilsystemArt;

	/**
	 * The cached value of the '{@link #getIPAdressblockBlau() <em>IP Adressblock Blau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAdressblockBlau()
	 * @generated
	 * @ordered
	 */
	protected IP_Adressblock_Blau_TypeClass iPAdressblockBlau;

	/**
	 * The cached value of the '{@link #getIPAdressblockGrau() <em>IP Adressblock Grau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAdressblockGrau()
	 * @generated
	 * @ordered
	 */
	protected IP_Adressblock_Grau_TypeClass iPAdressblockGrau;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BSO_IP_AB_Teilsystem_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSO_Teilsystem_Art_TypeClass getBSOTeilsystemArt() {
		return bSOTeilsystemArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBSOTeilsystemArt(BSO_Teilsystem_Art_TypeClass newBSOTeilsystemArt, NotificationChain msgs) {
		BSO_Teilsystem_Art_TypeClass oldBSOTeilsystemArt = bSOTeilsystemArt;
		bSOTeilsystemArt = newBSOTeilsystemArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__BSO_TEILSYSTEM_ART, oldBSOTeilsystemArt, newBSOTeilsystemArt);
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
	public void setBSOTeilsystemArt(BSO_Teilsystem_Art_TypeClass newBSOTeilsystemArt) {
		if (newBSOTeilsystemArt != bSOTeilsystemArt) {
			NotificationChain msgs = null;
			if (bSOTeilsystemArt != null)
				msgs = ((InternalEObject)bSOTeilsystemArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__BSO_TEILSYSTEM_ART, null, msgs);
			if (newBSOTeilsystemArt != null)
				msgs = ((InternalEObject)newBSOTeilsystemArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__BSO_TEILSYSTEM_ART, null, msgs);
			msgs = basicSetBSOTeilsystemArt(newBSOTeilsystemArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__BSO_TEILSYSTEM_ART, newBSOTeilsystemArt, newBSOTeilsystemArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adressblock_Blau_TypeClass getIPAdressblockBlau() {
		return iPAdressblockBlau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPAdressblockBlau(IP_Adressblock_Blau_TypeClass newIPAdressblockBlau, NotificationChain msgs) {
		IP_Adressblock_Blau_TypeClass oldIPAdressblockBlau = iPAdressblockBlau;
		iPAdressblockBlau = newIPAdressblockBlau;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU, oldIPAdressblockBlau, newIPAdressblockBlau);
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
	public void setIPAdressblockBlau(IP_Adressblock_Blau_TypeClass newIPAdressblockBlau) {
		if (newIPAdressblockBlau != iPAdressblockBlau) {
			NotificationChain msgs = null;
			if (iPAdressblockBlau != null)
				msgs = ((InternalEObject)iPAdressblockBlau).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU, null, msgs);
			if (newIPAdressblockBlau != null)
				msgs = ((InternalEObject)newIPAdressblockBlau).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU, null, msgs);
			msgs = basicSetIPAdressblockBlau(newIPAdressblockBlau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU, newIPAdressblockBlau, newIPAdressblockBlau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adressblock_Grau_TypeClass getIPAdressblockGrau() {
		return iPAdressblockGrau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPAdressblockGrau(IP_Adressblock_Grau_TypeClass newIPAdressblockGrau, NotificationChain msgs) {
		IP_Adressblock_Grau_TypeClass oldIPAdressblockGrau = iPAdressblockGrau;
		iPAdressblockGrau = newIPAdressblockGrau;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU, oldIPAdressblockGrau, newIPAdressblockGrau);
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
	public void setIPAdressblockGrau(IP_Adressblock_Grau_TypeClass newIPAdressblockGrau) {
		if (newIPAdressblockGrau != iPAdressblockGrau) {
			NotificationChain msgs = null;
			if (iPAdressblockGrau != null)
				msgs = ((InternalEObject)iPAdressblockGrau).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU, null, msgs);
			if (newIPAdressblockGrau != null)
				msgs = ((InternalEObject)newIPAdressblockGrau).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU, null, msgs);
			msgs = basicSetIPAdressblockGrau(newIPAdressblockGrau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU, newIPAdressblockGrau, newIPAdressblockGrau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__BSO_TEILSYSTEM_ART:
				return basicSetBSOTeilsystemArt(null, msgs);
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU:
				return basicSetIPAdressblockBlau(null, msgs);
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU:
				return basicSetIPAdressblockGrau(null, msgs);
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
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__BSO_TEILSYSTEM_ART:
				return getBSOTeilsystemArt();
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU:
				return getIPAdressblockBlau();
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU:
				return getIPAdressblockGrau();
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
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__BSO_TEILSYSTEM_ART:
				setBSOTeilsystemArt((BSO_Teilsystem_Art_TypeClass)newValue);
				return;
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU:
				setIPAdressblockBlau((IP_Adressblock_Blau_TypeClass)newValue);
				return;
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU:
				setIPAdressblockGrau((IP_Adressblock_Grau_TypeClass)newValue);
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
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__BSO_TEILSYSTEM_ART:
				setBSOTeilsystemArt((BSO_Teilsystem_Art_TypeClass)null);
				return;
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU:
				setIPAdressblockBlau((IP_Adressblock_Blau_TypeClass)null);
				return;
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU:
				setIPAdressblockGrau((IP_Adressblock_Grau_TypeClass)null);
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
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__BSO_TEILSYSTEM_ART:
				return bSOTeilsystemArt != null;
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU:
				return iPAdressblockBlau != null;
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU:
				return iPAdressblockGrau != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //BSO_IP_AB_Teilsystem_AttributeGroupImpl
