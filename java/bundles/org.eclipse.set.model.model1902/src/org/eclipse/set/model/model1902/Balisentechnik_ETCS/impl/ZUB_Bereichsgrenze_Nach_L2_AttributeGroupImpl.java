/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

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

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Abstand_Grenze_Bereich_C_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Baseline_SRS_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Einstieg_Ohne_Rueckw_Sig_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prioritaet_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup;

import org.eclipse.set.model.model1902.Verweise.ID_RBC_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bereichsgrenze Nach L2 Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getAbstandGrenzeBereichC <em>Abstand Grenze Bereich C</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getBaselineSRS <em>Baseline SRS</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getBgrenzeNachL2BedEinstieg <em>Bgrenze Nach L2 Bed Einstieg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getEinstiegOhneRueckwSig <em>Einstieg Ohne Rueckw Sig</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getIDRBCNachGrenze <em>IDRBC Nach Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getIDSignalZufahrtsicherungL2oS <em>ID Signal Zufahrtsicherung L2o S</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getPrioritaet <em>Prioritaet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZUB_Bereichsgrenze_Nach_L2_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAbstandGrenzeBereichC() <em>Abstand Grenze Bereich C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandGrenzeBereichC()
	 * @generated
	 * @ordered
	 */
	protected Abstand_Grenze_Bereich_C_TypeClass abstandGrenzeBereichC;

	/**
	 * The cached value of the '{@link #getBaselineSRS() <em>Baseline SRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaselineSRS()
	 * @generated
	 * @ordered
	 */
	protected Baseline_SRS_TypeClass baselineSRS;

	/**
	 * The cached value of the '{@link #getBgrenzeNachL2BedEinstieg() <em>Bgrenze Nach L2 Bed Einstieg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgrenzeNachL2BedEinstieg()
	 * @generated
	 * @ordered
	 */
	protected EList<Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup> bgrenzeNachL2BedEinstieg;

	/**
	 * The cached value of the '{@link #getEinstiegOhneRueckwSig() <em>Einstieg Ohne Rueckw Sig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinstiegOhneRueckwSig()
	 * @generated
	 * @ordered
	 */
	protected Einstieg_Ohne_Rueckw_Sig_TypeClass einstiegOhneRueckwSig;

	/**
	 * The cached value of the '{@link #getIDRBCNachGrenze() <em>IDRBC Nach Grenze</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRBCNachGrenze()
	 * @generated
	 * @ordered
	 */
	protected ID_RBC_TypeClass iDRBCNachGrenze;

	/**
	 * The cached value of the '{@link #getIDSignalZufahrtsicherungL2oS() <em>ID Signal Zufahrtsicherung L2o S</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalZufahrtsicherungL2oS()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Signal_TypeClass> iDSignalZufahrtsicherungL2oS;

	/**
	 * The cached value of the '{@link #getPrioritaet() <em>Prioritaet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioritaet()
	 * @generated
	 * @ordered
	 */
	protected Prioritaet_TypeClass prioritaet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Grenze_Bereich_C_TypeClass getAbstandGrenzeBereichC() {
		return abstandGrenzeBereichC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandGrenzeBereichC(Abstand_Grenze_Bereich_C_TypeClass newAbstandGrenzeBereichC, NotificationChain msgs) {
		Abstand_Grenze_Bereich_C_TypeClass oldAbstandGrenzeBereichC = abstandGrenzeBereichC;
		abstandGrenzeBereichC = newAbstandGrenzeBereichC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C, oldAbstandGrenzeBereichC, newAbstandGrenzeBereichC);
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
	public void setAbstandGrenzeBereichC(Abstand_Grenze_Bereich_C_TypeClass newAbstandGrenzeBereichC) {
		if (newAbstandGrenzeBereichC != abstandGrenzeBereichC) {
			NotificationChain msgs = null;
			if (abstandGrenzeBereichC != null)
				msgs = ((InternalEObject)abstandGrenzeBereichC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C, null, msgs);
			if (newAbstandGrenzeBereichC != null)
				msgs = ((InternalEObject)newAbstandGrenzeBereichC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C, null, msgs);
			msgs = basicSetAbstandGrenzeBereichC(newAbstandGrenzeBereichC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C, newAbstandGrenzeBereichC, newAbstandGrenzeBereichC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Baseline_SRS_TypeClass getBaselineSRS() {
		return baselineSRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaselineSRS(Baseline_SRS_TypeClass newBaselineSRS, NotificationChain msgs) {
		Baseline_SRS_TypeClass oldBaselineSRS = baselineSRS;
		baselineSRS = newBaselineSRS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SRS, oldBaselineSRS, newBaselineSRS);
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
	public void setBaselineSRS(Baseline_SRS_TypeClass newBaselineSRS) {
		if (newBaselineSRS != baselineSRS) {
			NotificationChain msgs = null;
			if (baselineSRS != null)
				msgs = ((InternalEObject)baselineSRS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SRS, null, msgs);
			if (newBaselineSRS != null)
				msgs = ((InternalEObject)newBaselineSRS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SRS, null, msgs);
			msgs = basicSetBaselineSRS(newBaselineSRS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SRS, newBaselineSRS, newBaselineSRS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup> getBgrenzeNachL2BedEinstieg() {
		if (bgrenzeNachL2BedEinstieg == null) {
			bgrenzeNachL2BedEinstieg = new EObjectContainmentEList<Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup>(Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BGRENZE_NACH_L2_BED_EINSTIEG);
		}
		return bgrenzeNachL2BedEinstieg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einstieg_Ohne_Rueckw_Sig_TypeClass getEinstiegOhneRueckwSig() {
		return einstiegOhneRueckwSig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinstiegOhneRueckwSig(Einstieg_Ohne_Rueckw_Sig_TypeClass newEinstiegOhneRueckwSig, NotificationChain msgs) {
		Einstieg_Ohne_Rueckw_Sig_TypeClass oldEinstiegOhneRueckwSig = einstiegOhneRueckwSig;
		einstiegOhneRueckwSig = newEinstiegOhneRueckwSig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG, oldEinstiegOhneRueckwSig, newEinstiegOhneRueckwSig);
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
	public void setEinstiegOhneRueckwSig(Einstieg_Ohne_Rueckw_Sig_TypeClass newEinstiegOhneRueckwSig) {
		if (newEinstiegOhneRueckwSig != einstiegOhneRueckwSig) {
			NotificationChain msgs = null;
			if (einstiegOhneRueckwSig != null)
				msgs = ((InternalEObject)einstiegOhneRueckwSig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG, null, msgs);
			if (newEinstiegOhneRueckwSig != null)
				msgs = ((InternalEObject)newEinstiegOhneRueckwSig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG, null, msgs);
			msgs = basicSetEinstiegOhneRueckwSig(newEinstiegOhneRueckwSig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG, newEinstiegOhneRueckwSig, newEinstiegOhneRueckwSig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_RBC_TypeClass getIDRBCNachGrenze() {
		return iDRBCNachGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDRBCNachGrenze(ID_RBC_TypeClass newIDRBCNachGrenze, NotificationChain msgs) {
		ID_RBC_TypeClass oldIDRBCNachGrenze = iDRBCNachGrenze;
		iDRBCNachGrenze = newIDRBCNachGrenze;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, oldIDRBCNachGrenze, newIDRBCNachGrenze);
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
	public void setIDRBCNachGrenze(ID_RBC_TypeClass newIDRBCNachGrenze) {
		if (newIDRBCNachGrenze != iDRBCNachGrenze) {
			NotificationChain msgs = null;
			if (iDRBCNachGrenze != null)
				msgs = ((InternalEObject)iDRBCNachGrenze).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, null, msgs);
			if (newIDRBCNachGrenze != null)
				msgs = ((InternalEObject)newIDRBCNachGrenze).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, null, msgs);
			msgs = basicSetIDRBCNachGrenze(newIDRBCNachGrenze, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, newIDRBCNachGrenze, newIDRBCNachGrenze));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Signal_TypeClass> getIDSignalZufahrtsicherungL2oS() {
		if (iDSignalZufahrtsicherungL2oS == null) {
			iDSignalZufahrtsicherungL2oS = new EObjectContainmentEList<ID_Signal_TypeClass>(ID_Signal_TypeClass.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ID_SIGNAL_ZUFAHRTSICHERUNG_L2O_S);
		}
		return iDSignalZufahrtsicherungL2oS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prioritaet_TypeClass getPrioritaet() {
		return prioritaet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrioritaet(Prioritaet_TypeClass newPrioritaet, NotificationChain msgs) {
		Prioritaet_TypeClass oldPrioritaet = prioritaet;
		prioritaet = newPrioritaet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET, oldPrioritaet, newPrioritaet);
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
	public void setPrioritaet(Prioritaet_TypeClass newPrioritaet) {
		if (newPrioritaet != prioritaet) {
			NotificationChain msgs = null;
			if (prioritaet != null)
				msgs = ((InternalEObject)prioritaet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET, null, msgs);
			if (newPrioritaet != null)
				msgs = ((InternalEObject)newPrioritaet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET, null, msgs);
			msgs = basicSetPrioritaet(newPrioritaet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET, newPrioritaet, newPrioritaet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C:
				return basicSetAbstandGrenzeBereichC(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SRS:
				return basicSetBaselineSRS(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BGRENZE_NACH_L2_BED_EINSTIEG:
				return ((InternalEList<?>)getBgrenzeNachL2BedEinstieg()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG:
				return basicSetEinstiegOhneRueckwSig(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				return basicSetIDRBCNachGrenze(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ID_SIGNAL_ZUFAHRTSICHERUNG_L2O_S:
				return ((InternalEList<?>)getIDSignalZufahrtsicherungL2oS()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET:
				return basicSetPrioritaet(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C:
				return getAbstandGrenzeBereichC();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SRS:
				return getBaselineSRS();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BGRENZE_NACH_L2_BED_EINSTIEG:
				return getBgrenzeNachL2BedEinstieg();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG:
				return getEinstiegOhneRueckwSig();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				return getIDRBCNachGrenze();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ID_SIGNAL_ZUFAHRTSICHERUNG_L2O_S:
				return getIDSignalZufahrtsicherungL2oS();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET:
				return getPrioritaet();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C:
				setAbstandGrenzeBereichC((Abstand_Grenze_Bereich_C_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SRS:
				setBaselineSRS((Baseline_SRS_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BGRENZE_NACH_L2_BED_EINSTIEG:
				getBgrenzeNachL2BedEinstieg().clear();
				getBgrenzeNachL2BedEinstieg().addAll((Collection<? extends Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG:
				setEinstiegOhneRueckwSig((Einstieg_Ohne_Rueckw_Sig_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				setIDRBCNachGrenze((ID_RBC_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ID_SIGNAL_ZUFAHRTSICHERUNG_L2O_S:
				getIDSignalZufahrtsicherungL2oS().clear();
				getIDSignalZufahrtsicherungL2oS().addAll((Collection<? extends ID_Signal_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET:
				setPrioritaet((Prioritaet_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C:
				setAbstandGrenzeBereichC((Abstand_Grenze_Bereich_C_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SRS:
				setBaselineSRS((Baseline_SRS_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BGRENZE_NACH_L2_BED_EINSTIEG:
				getBgrenzeNachL2BedEinstieg().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG:
				setEinstiegOhneRueckwSig((Einstieg_Ohne_Rueckw_Sig_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				setIDRBCNachGrenze((ID_RBC_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ID_SIGNAL_ZUFAHRTSICHERUNG_L2O_S:
				getIDSignalZufahrtsicherungL2oS().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET:
				setPrioritaet((Prioritaet_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C:
				return abstandGrenzeBereichC != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SRS:
				return baselineSRS != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BGRENZE_NACH_L2_BED_EINSTIEG:
				return bgrenzeNachL2BedEinstieg != null && !bgrenzeNachL2BedEinstieg.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG:
				return einstiegOhneRueckwSig != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				return iDRBCNachGrenze != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ID_SIGNAL_ZUFAHRTSICHERUNG_L2O_S:
				return iDSignalZufahrtsicherungL2oS != null && !iDSignalZufahrtsicherungL2oS.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET:
				return prioritaet != null;
		}
		return super.eIsSet(featureID);
	}

} //ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl
