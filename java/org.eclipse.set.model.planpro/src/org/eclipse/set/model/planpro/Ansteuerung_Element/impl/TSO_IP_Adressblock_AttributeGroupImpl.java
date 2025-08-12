/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Blau_V4_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Blau_V6_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Grau_V4_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.IP_Adressblock_Grau_V6_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Regionalbereich_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.TSO_IP_AB_Teilsystem_AttributeGroup;
import org.eclipse.set.model.planpro.Ansteuerung_Element.TSO_IP_Adressblock_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSO IP Adressblock Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.TSO_IP_Adressblock_AttributeGroupImpl#getIPAdressblockBlauV4 <em>IP Adressblock Blau V4</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.TSO_IP_Adressblock_AttributeGroupImpl#getIPAdressblockBlauV6 <em>IP Adressblock Blau V6</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.TSO_IP_Adressblock_AttributeGroupImpl#getIPAdressblockGrauV4 <em>IP Adressblock Grau V4</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.TSO_IP_Adressblock_AttributeGroupImpl#getIPAdressblockGrauV6 <em>IP Adressblock Grau V6</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.TSO_IP_Adressblock_AttributeGroupImpl#getRegionalbereich <em>Regionalbereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.TSO_IP_Adressblock_AttributeGroupImpl#getTSOIPABTeilsystem <em>TSOIPAB Teilsystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSO_IP_Adressblock_AttributeGroupImpl extends EObjectImpl implements TSO_IP_Adressblock_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIPAdressblockBlauV4() <em>IP Adressblock Blau V4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAdressblockBlauV4()
	 * @generated
	 * @ordered
	 */
	protected IP_Adressblock_Blau_V4_TypeClass iPAdressblockBlauV4;

	/**
	 * The cached value of the '{@link #getIPAdressblockBlauV6() <em>IP Adressblock Blau V6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAdressblockBlauV6()
	 * @generated
	 * @ordered
	 */
	protected IP_Adressblock_Blau_V6_TypeClass iPAdressblockBlauV6;

	/**
	 * The cached value of the '{@link #getIPAdressblockGrauV4() <em>IP Adressblock Grau V4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAdressblockGrauV4()
	 * @generated
	 * @ordered
	 */
	protected IP_Adressblock_Grau_V4_TypeClass iPAdressblockGrauV4;

	/**
	 * The cached value of the '{@link #getIPAdressblockGrauV6() <em>IP Adressblock Grau V6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAdressblockGrauV6()
	 * @generated
	 * @ordered
	 */
	protected IP_Adressblock_Grau_V6_TypeClass iPAdressblockGrauV6;

	/**
	 * The cached value of the '{@link #getRegionalbereich() <em>Regionalbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionalbereich()
	 * @generated
	 * @ordered
	 */
	protected Regionalbereich_TypeClass regionalbereich;

	/**
	 * The cached value of the '{@link #getTSOIPABTeilsystem() <em>TSOIPAB Teilsystem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSOIPABTeilsystem()
	 * @generated
	 * @ordered
	 */
	protected EList<TSO_IP_AB_Teilsystem_AttributeGroup> tSOIPABTeilsystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSO_IP_Adressblock_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adressblock_Blau_V4_TypeClass getIPAdressblockBlauV4() {
		return iPAdressblockBlauV4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPAdressblockBlauV4(IP_Adressblock_Blau_V4_TypeClass newIPAdressblockBlauV4, NotificationChain msgs) {
		IP_Adressblock_Blau_V4_TypeClass oldIPAdressblockBlauV4 = iPAdressblockBlauV4;
		iPAdressblockBlauV4 = newIPAdressblockBlauV4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4, oldIPAdressblockBlauV4, newIPAdressblockBlauV4);
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
	public void setIPAdressblockBlauV4(IP_Adressblock_Blau_V4_TypeClass newIPAdressblockBlauV4) {
		if (newIPAdressblockBlauV4 != iPAdressblockBlauV4) {
			NotificationChain msgs = null;
			if (iPAdressblockBlauV4 != null)
				msgs = ((InternalEObject)iPAdressblockBlauV4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4, null, msgs);
			if (newIPAdressblockBlauV4 != null)
				msgs = ((InternalEObject)newIPAdressblockBlauV4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4, null, msgs);
			msgs = basicSetIPAdressblockBlauV4(newIPAdressblockBlauV4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4, newIPAdressblockBlauV4, newIPAdressblockBlauV4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adressblock_Blau_V6_TypeClass getIPAdressblockBlauV6() {
		return iPAdressblockBlauV6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPAdressblockBlauV6(IP_Adressblock_Blau_V6_TypeClass newIPAdressblockBlauV6, NotificationChain msgs) {
		IP_Adressblock_Blau_V6_TypeClass oldIPAdressblockBlauV6 = iPAdressblockBlauV6;
		iPAdressblockBlauV6 = newIPAdressblockBlauV6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6, oldIPAdressblockBlauV6, newIPAdressblockBlauV6);
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
	public void setIPAdressblockBlauV6(IP_Adressblock_Blau_V6_TypeClass newIPAdressblockBlauV6) {
		if (newIPAdressblockBlauV6 != iPAdressblockBlauV6) {
			NotificationChain msgs = null;
			if (iPAdressblockBlauV6 != null)
				msgs = ((InternalEObject)iPAdressblockBlauV6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6, null, msgs);
			if (newIPAdressblockBlauV6 != null)
				msgs = ((InternalEObject)newIPAdressblockBlauV6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6, null, msgs);
			msgs = basicSetIPAdressblockBlauV6(newIPAdressblockBlauV6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6, newIPAdressblockBlauV6, newIPAdressblockBlauV6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adressblock_Grau_V4_TypeClass getIPAdressblockGrauV4() {
		return iPAdressblockGrauV4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPAdressblockGrauV4(IP_Adressblock_Grau_V4_TypeClass newIPAdressblockGrauV4, NotificationChain msgs) {
		IP_Adressblock_Grau_V4_TypeClass oldIPAdressblockGrauV4 = iPAdressblockGrauV4;
		iPAdressblockGrauV4 = newIPAdressblockGrauV4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4, oldIPAdressblockGrauV4, newIPAdressblockGrauV4);
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
	public void setIPAdressblockGrauV4(IP_Adressblock_Grau_V4_TypeClass newIPAdressblockGrauV4) {
		if (newIPAdressblockGrauV4 != iPAdressblockGrauV4) {
			NotificationChain msgs = null;
			if (iPAdressblockGrauV4 != null)
				msgs = ((InternalEObject)iPAdressblockGrauV4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4, null, msgs);
			if (newIPAdressblockGrauV4 != null)
				msgs = ((InternalEObject)newIPAdressblockGrauV4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4, null, msgs);
			msgs = basicSetIPAdressblockGrauV4(newIPAdressblockGrauV4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4, newIPAdressblockGrauV4, newIPAdressblockGrauV4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adressblock_Grau_V6_TypeClass getIPAdressblockGrauV6() {
		return iPAdressblockGrauV6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPAdressblockGrauV6(IP_Adressblock_Grau_V6_TypeClass newIPAdressblockGrauV6, NotificationChain msgs) {
		IP_Adressblock_Grau_V6_TypeClass oldIPAdressblockGrauV6 = iPAdressblockGrauV6;
		iPAdressblockGrauV6 = newIPAdressblockGrauV6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6, oldIPAdressblockGrauV6, newIPAdressblockGrauV6);
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
	public void setIPAdressblockGrauV6(IP_Adressblock_Grau_V6_TypeClass newIPAdressblockGrauV6) {
		if (newIPAdressblockGrauV6 != iPAdressblockGrauV6) {
			NotificationChain msgs = null;
			if (iPAdressblockGrauV6 != null)
				msgs = ((InternalEObject)iPAdressblockGrauV6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6, null, msgs);
			if (newIPAdressblockGrauV6 != null)
				msgs = ((InternalEObject)newIPAdressblockGrauV6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6, null, msgs);
			msgs = basicSetIPAdressblockGrauV6(newIPAdressblockGrauV6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6, newIPAdressblockGrauV6, newIPAdressblockGrauV6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regionalbereich_TypeClass getRegionalbereich() {
		return regionalbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionalbereich(Regionalbereich_TypeClass newRegionalbereich, NotificationChain msgs) {
		Regionalbereich_TypeClass oldRegionalbereich = regionalbereich;
		regionalbereich = newRegionalbereich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH, oldRegionalbereich, newRegionalbereich);
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
	public void setRegionalbereich(Regionalbereich_TypeClass newRegionalbereich) {
		if (newRegionalbereich != regionalbereich) {
			NotificationChain msgs = null;
			if (regionalbereich != null)
				msgs = ((InternalEObject)regionalbereich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH, null, msgs);
			if (newRegionalbereich != null)
				msgs = ((InternalEObject)newRegionalbereich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH, null, msgs);
			msgs = basicSetRegionalbereich(newRegionalbereich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH, newRegionalbereich, newRegionalbereich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSO_IP_AB_Teilsystem_AttributeGroup> getTSOIPABTeilsystem() {
		if (tSOIPABTeilsystem == null) {
			tSOIPABTeilsystem = new EObjectContainmentEList<TSO_IP_AB_Teilsystem_AttributeGroup>(TSO_IP_AB_Teilsystem_AttributeGroup.class, this, Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__TSOIPAB_TEILSYSTEM);
		}
		return tSOIPABTeilsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4:
				return basicSetIPAdressblockBlauV4(null, msgs);
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6:
				return basicSetIPAdressblockBlauV6(null, msgs);
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4:
				return basicSetIPAdressblockGrauV4(null, msgs);
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6:
				return basicSetIPAdressblockGrauV6(null, msgs);
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH:
				return basicSetRegionalbereich(null, msgs);
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__TSOIPAB_TEILSYSTEM:
				return ((InternalEList<?>)getTSOIPABTeilsystem()).basicRemove(otherEnd, msgs);
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
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4:
				return getIPAdressblockBlauV4();
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6:
				return getIPAdressblockBlauV6();
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4:
				return getIPAdressblockGrauV4();
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6:
				return getIPAdressblockGrauV6();
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH:
				return getRegionalbereich();
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__TSOIPAB_TEILSYSTEM:
				return getTSOIPABTeilsystem();
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
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4:
				setIPAdressblockBlauV4((IP_Adressblock_Blau_V4_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6:
				setIPAdressblockBlauV6((IP_Adressblock_Blau_V6_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4:
				setIPAdressblockGrauV4((IP_Adressblock_Grau_V4_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6:
				setIPAdressblockGrauV6((IP_Adressblock_Grau_V6_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH:
				setRegionalbereich((Regionalbereich_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__TSOIPAB_TEILSYSTEM:
				getTSOIPABTeilsystem().clear();
				getTSOIPABTeilsystem().addAll((Collection<? extends TSO_IP_AB_Teilsystem_AttributeGroup>)newValue);
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
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4:
				setIPAdressblockBlauV4((IP_Adressblock_Blau_V4_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6:
				setIPAdressblockBlauV6((IP_Adressblock_Blau_V6_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4:
				setIPAdressblockGrauV4((IP_Adressblock_Grau_V4_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6:
				setIPAdressblockGrauV6((IP_Adressblock_Grau_V6_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH:
				setRegionalbereich((Regionalbereich_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__TSOIPAB_TEILSYSTEM:
				getTSOIPABTeilsystem().clear();
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
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4:
				return iPAdressblockBlauV4 != null;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6:
				return iPAdressblockBlauV6 != null;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4:
				return iPAdressblockGrauV4 != null;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6:
				return iPAdressblockGrauV6 != null;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH:
				return regionalbereich != null;
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__TSOIPAB_TEILSYSTEM:
				return tSOIPABTeilsystem != null && !tSOIPABTeilsystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TSO_IP_Adressblock_AttributeGroupImpl
