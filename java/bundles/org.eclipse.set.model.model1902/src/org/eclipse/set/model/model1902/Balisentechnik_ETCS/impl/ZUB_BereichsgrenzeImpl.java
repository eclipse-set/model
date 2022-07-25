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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_GNT_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Oertlichkeit_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bereichsgrenze</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_BereichsgrenzeImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_BereichsgrenzeImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_BereichsgrenzeImpl#getZUBBereichsgrenzeAllg <em>ZUB Bereichsgrenze Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_BereichsgrenzeImpl#getZUBBereichsgrenzeNachESG <em>ZUB Bereichsgrenze Nach ESG</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_BereichsgrenzeImpl#getZUBBereichsgrenzeNachGNT <em>ZUB Bereichsgrenze Nach GNT</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_BereichsgrenzeImpl#getZUBBereichsgrenzeNachL2 <em>ZUB Bereichsgrenze Nach L2</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_BereichsgrenzeImpl#getZUBBereichsgrenzeNachLZB <em>ZUB Bereichsgrenze Nach LZB</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_BereichsgrenzeImpl#getZUBBereichsgrenzeNachOhne <em>ZUB Bereichsgrenze Nach Ohne</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_BereichsgrenzeImpl#getZUBBereichsgrenzeNachPZB <em>ZUB Bereichsgrenze Nach PZB</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_BereichsgrenzeImpl#getZUBBereichsgrenzeNachSonstige <em>ZUB Bereichsgrenze Nach Sonstige</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_BereichsgrenzeImpl#getZUBBgrenzeRBCWechsel <em>ZUB Bgrenze RBC Wechsel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_BereichsgrenzeImpl extends Punkt_ObjektImpl implements ZUB_Bereichsgrenze {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup bezeichnung;

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
	 * The cached value of the '{@link #getZUBBereichsgrenzeAllg() <em>ZUB Bereichsgrenze Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUBBereichsgrenzeAllg()
	 * @generated
	 * @ordered
	 */
	protected ZUB_Bereichsgrenze_Allg_AttributeGroup zUBBereichsgrenzeAllg;

	/**
	 * The cached value of the '{@link #getZUBBereichsgrenzeNachESG() <em>ZUB Bereichsgrenze Nach ESG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUBBereichsgrenzeNachESG()
	 * @generated
	 * @ordered
	 */
	protected EList<ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup> zUBBereichsgrenzeNachESG;

	/**
	 * The cached value of the '{@link #getZUBBereichsgrenzeNachGNT() <em>ZUB Bereichsgrenze Nach GNT</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUBBereichsgrenzeNachGNT()
	 * @generated
	 * @ordered
	 */
	protected EList<ZUB_Bereichsgrenze_Nach_GNT_AttributeGroup> zUBBereichsgrenzeNachGNT;

	/**
	 * The cached value of the '{@link #getZUBBereichsgrenzeNachL2() <em>ZUB Bereichsgrenze Nach L2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUBBereichsgrenzeNachL2()
	 * @generated
	 * @ordered
	 */
	protected EList<ZUB_Bereichsgrenze_Nach_L2_AttributeGroup> zUBBereichsgrenzeNachL2;

	/**
	 * The cached value of the '{@link #getZUBBereichsgrenzeNachLZB() <em>ZUB Bereichsgrenze Nach LZB</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUBBereichsgrenzeNachLZB()
	 * @generated
	 * @ordered
	 */
	protected EList<ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup> zUBBereichsgrenzeNachLZB;

	/**
	 * The cached value of the '{@link #getZUBBereichsgrenzeNachOhne() <em>ZUB Bereichsgrenze Nach Ohne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUBBereichsgrenzeNachOhne()
	 * @generated
	 * @ordered
	 */
	protected EList<ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup> zUBBereichsgrenzeNachOhne;

	/**
	 * The cached value of the '{@link #getZUBBereichsgrenzeNachPZB() <em>ZUB Bereichsgrenze Nach PZB</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUBBereichsgrenzeNachPZB()
	 * @generated
	 * @ordered
	 */
	protected EList<ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup> zUBBereichsgrenzeNachPZB;

	/**
	 * The cached value of the '{@link #getZUBBereichsgrenzeNachSonstige() <em>ZUB Bereichsgrenze Nach Sonstige</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUBBereichsgrenzeNachSonstige()
	 * @generated
	 * @ordered
	 */
	protected EList<ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup> zUBBereichsgrenzeNachSonstige;

	/**
	 * The cached value of the '{@link #getZUBBgrenzeRBCWechsel() <em>ZUB Bgrenze RBC Wechsel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUBBgrenzeRBCWechsel()
	 * @generated
	 * @ordered
	 */
	protected EList<ZUB_Bgrenze_RBC_Wechsel_AttributeGroup> zUBBgrenzeRBCWechsel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_BereichsgrenzeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ID_OERTLICHKEIT, oldIDOertlichkeit, newIDOertlichkeit);
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
				msgs = ((InternalEObject)iDOertlichkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ID_OERTLICHKEIT, null, msgs);
			if (newIDOertlichkeit != null)
				msgs = ((InternalEObject)newIDOertlichkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ID_OERTLICHKEIT, null, msgs);
			msgs = basicSetIDOertlichkeit(newIDOertlichkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ID_OERTLICHKEIT, newIDOertlichkeit, newIDOertlichkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze_Allg_AttributeGroup getZUBBereichsgrenzeAllg() {
		return zUBBereichsgrenzeAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZUBBereichsgrenzeAllg(ZUB_Bereichsgrenze_Allg_AttributeGroup newZUBBereichsgrenzeAllg, NotificationChain msgs) {
		ZUB_Bereichsgrenze_Allg_AttributeGroup oldZUBBereichsgrenzeAllg = zUBBereichsgrenzeAllg;
		zUBBereichsgrenzeAllg = newZUBBereichsgrenzeAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_ALLG, oldZUBBereichsgrenzeAllg, newZUBBereichsgrenzeAllg);
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
	public void setZUBBereichsgrenzeAllg(ZUB_Bereichsgrenze_Allg_AttributeGroup newZUBBereichsgrenzeAllg) {
		if (newZUBBereichsgrenzeAllg != zUBBereichsgrenzeAllg) {
			NotificationChain msgs = null;
			if (zUBBereichsgrenzeAllg != null)
				msgs = ((InternalEObject)zUBBereichsgrenzeAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_ALLG, null, msgs);
			if (newZUBBereichsgrenzeAllg != null)
				msgs = ((InternalEObject)newZUBBereichsgrenzeAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_ALLG, null, msgs);
			msgs = basicSetZUBBereichsgrenzeAllg(newZUBBereichsgrenzeAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_ALLG, newZUBBereichsgrenzeAllg, newZUBBereichsgrenzeAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup> getZUBBereichsgrenzeNachESG() {
		if (zUBBereichsgrenzeNachESG == null) {
			zUBBereichsgrenzeNachESG = new EObjectContainmentEList<ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup>(ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_ESG);
		}
		return zUBBereichsgrenzeNachESG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZUB_Bereichsgrenze_Nach_GNT_AttributeGroup> getZUBBereichsgrenzeNachGNT() {
		if (zUBBereichsgrenzeNachGNT == null) {
			zUBBereichsgrenzeNachGNT = new EObjectContainmentEList<ZUB_Bereichsgrenze_Nach_GNT_AttributeGroup>(ZUB_Bereichsgrenze_Nach_GNT_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_GNT);
		}
		return zUBBereichsgrenzeNachGNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZUB_Bereichsgrenze_Nach_L2_AttributeGroup> getZUBBereichsgrenzeNachL2() {
		if (zUBBereichsgrenzeNachL2 == null) {
			zUBBereichsgrenzeNachL2 = new EObjectContainmentEList<ZUB_Bereichsgrenze_Nach_L2_AttributeGroup>(ZUB_Bereichsgrenze_Nach_L2_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_L2);
		}
		return zUBBereichsgrenzeNachL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup> getZUBBereichsgrenzeNachLZB() {
		if (zUBBereichsgrenzeNachLZB == null) {
			zUBBereichsgrenzeNachLZB = new EObjectContainmentEList<ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup>(ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_LZB);
		}
		return zUBBereichsgrenzeNachLZB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup> getZUBBereichsgrenzeNachOhne() {
		if (zUBBereichsgrenzeNachOhne == null) {
			zUBBereichsgrenzeNachOhne = new EObjectContainmentEList<ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup>(ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_OHNE);
		}
		return zUBBereichsgrenzeNachOhne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup> getZUBBereichsgrenzeNachPZB() {
		if (zUBBereichsgrenzeNachPZB == null) {
			zUBBereichsgrenzeNachPZB = new EObjectContainmentEList<ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup>(ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_PZB);
		}
		return zUBBereichsgrenzeNachPZB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup> getZUBBereichsgrenzeNachSonstige() {
		if (zUBBereichsgrenzeNachSonstige == null) {
			zUBBereichsgrenzeNachSonstige = new EObjectContainmentEList<ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup>(ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_SONSTIGE);
		}
		return zUBBereichsgrenzeNachSonstige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZUB_Bgrenze_RBC_Wechsel_AttributeGroup> getZUBBgrenzeRBCWechsel() {
		if (zUBBgrenzeRBCWechsel == null) {
			zUBBgrenzeRBCWechsel = new EObjectContainmentEList<ZUB_Bgrenze_RBC_Wechsel_AttributeGroup>(ZUB_Bgrenze_RBC_Wechsel_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BGRENZE_RBC_WECHSEL);
		}
		return zUBBgrenzeRBCWechsel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ID_OERTLICHKEIT:
				return basicSetIDOertlichkeit(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_ALLG:
				return basicSetZUBBereichsgrenzeAllg(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_ESG:
				return ((InternalEList<?>)getZUBBereichsgrenzeNachESG()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_GNT:
				return ((InternalEList<?>)getZUBBereichsgrenzeNachGNT()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_L2:
				return ((InternalEList<?>)getZUBBereichsgrenzeNachL2()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_LZB:
				return ((InternalEList<?>)getZUBBereichsgrenzeNachLZB()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_OHNE:
				return ((InternalEList<?>)getZUBBereichsgrenzeNachOhne()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_PZB:
				return ((InternalEList<?>)getZUBBereichsgrenzeNachPZB()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_SONSTIGE:
				return ((InternalEList<?>)getZUBBereichsgrenzeNachSonstige()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BGRENZE_RBC_WECHSEL:
				return ((InternalEList<?>)getZUBBgrenzeRBCWechsel()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__BEZEICHNUNG:
				return getBezeichnung();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ID_OERTLICHKEIT:
				return getIDOertlichkeit();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_ALLG:
				return getZUBBereichsgrenzeAllg();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_ESG:
				return getZUBBereichsgrenzeNachESG();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_GNT:
				return getZUBBereichsgrenzeNachGNT();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_L2:
				return getZUBBereichsgrenzeNachL2();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_LZB:
				return getZUBBereichsgrenzeNachLZB();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_OHNE:
				return getZUBBereichsgrenzeNachOhne();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_PZB:
				return getZUBBereichsgrenzeNachPZB();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_SONSTIGE:
				return getZUBBereichsgrenzeNachSonstige();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BGRENZE_RBC_WECHSEL:
				return getZUBBgrenzeRBCWechsel();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__BEZEICHNUNG:
				setBezeichnung((ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ID_OERTLICHKEIT:
				setIDOertlichkeit((ID_Oertlichkeit_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_ALLG:
				setZUBBereichsgrenzeAllg((ZUB_Bereichsgrenze_Allg_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_ESG:
				getZUBBereichsgrenzeNachESG().clear();
				getZUBBereichsgrenzeNachESG().addAll((Collection<? extends ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_GNT:
				getZUBBereichsgrenzeNachGNT().clear();
				getZUBBereichsgrenzeNachGNT().addAll((Collection<? extends ZUB_Bereichsgrenze_Nach_GNT_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_L2:
				getZUBBereichsgrenzeNachL2().clear();
				getZUBBereichsgrenzeNachL2().addAll((Collection<? extends ZUB_Bereichsgrenze_Nach_L2_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_LZB:
				getZUBBereichsgrenzeNachLZB().clear();
				getZUBBereichsgrenzeNachLZB().addAll((Collection<? extends ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_OHNE:
				getZUBBereichsgrenzeNachOhne().clear();
				getZUBBereichsgrenzeNachOhne().addAll((Collection<? extends ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_PZB:
				getZUBBereichsgrenzeNachPZB().clear();
				getZUBBereichsgrenzeNachPZB().addAll((Collection<? extends ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_SONSTIGE:
				getZUBBereichsgrenzeNachSonstige().clear();
				getZUBBereichsgrenzeNachSonstige().addAll((Collection<? extends ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BGRENZE_RBC_WECHSEL:
				getZUBBgrenzeRBCWechsel().clear();
				getZUBBgrenzeRBCWechsel().addAll((Collection<? extends ZUB_Bgrenze_RBC_Wechsel_AttributeGroup>)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__BEZEICHNUNG:
				setBezeichnung((ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ID_OERTLICHKEIT:
				setIDOertlichkeit((ID_Oertlichkeit_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_ALLG:
				setZUBBereichsgrenzeAllg((ZUB_Bereichsgrenze_Allg_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_ESG:
				getZUBBereichsgrenzeNachESG().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_GNT:
				getZUBBereichsgrenzeNachGNT().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_L2:
				getZUBBereichsgrenzeNachL2().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_LZB:
				getZUBBereichsgrenzeNachLZB().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_OHNE:
				getZUBBereichsgrenzeNachOhne().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_PZB:
				getZUBBereichsgrenzeNachPZB().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_SONSTIGE:
				getZUBBereichsgrenzeNachSonstige().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BGRENZE_RBC_WECHSEL:
				getZUBBgrenzeRBCWechsel().clear();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__BEZEICHNUNG:
				return bezeichnung != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ID_OERTLICHKEIT:
				return iDOertlichkeit != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_ALLG:
				return zUBBereichsgrenzeAllg != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_ESG:
				return zUBBereichsgrenzeNachESG != null && !zUBBereichsgrenzeNachESG.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_GNT:
				return zUBBereichsgrenzeNachGNT != null && !zUBBereichsgrenzeNachGNT.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_L2:
				return zUBBereichsgrenzeNachL2 != null && !zUBBereichsgrenzeNachL2.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_LZB:
				return zUBBereichsgrenzeNachLZB != null && !zUBBereichsgrenzeNachLZB.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_OHNE:
				return zUBBereichsgrenzeNachOhne != null && !zUBBereichsgrenzeNachOhne.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_PZB:
				return zUBBereichsgrenzeNachPZB != null && !zUBBereichsgrenzeNachPZB.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_SONSTIGE:
				return zUBBereichsgrenzeNachSonstige != null && !zUBBereichsgrenzeNachSonstige.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BGRENZE_RBC_WECHSEL:
				return zUBBgrenzeRBCWechsel != null && !zUBBgrenzeRBCWechsel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZUB_BereichsgrenzeImpl
