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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Gefahrpunktabstand_Abweichend_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal_DWeg_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal_TBV_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Technischer_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getETCSGefahrpunktabstandAbweichend <em>ETCS Gefahrpunktabstand Abweichend</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getETCSSignalAllg <em>ETCS Signal Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getETCSSignalDWeg <em>ETCS Signal DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getETCSSignalTBV <em>ETCS Signal TBV</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getIDETCSGefahrpunkt <em>IDETCS Gefahrpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getIDETCSGefahrpunkt2 <em>IDETCS Gefahrpunkt2</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getIDHOAFBOA <em>IDHOAFBOA</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getIDSignal <em>ID Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_SignalImpl extends Basis_ObjektImpl implements ETCS_Signal {
	/**
	 * The cached value of the '{@link #getETCSGefahrpunktabstandAbweichend() <em>ETCS Gefahrpunktabstand Abweichend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSGefahrpunktabstandAbweichend()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Gefahrpunktabstand_Abweichend_TypeClass eTCSGefahrpunktabstandAbweichend;

	/**
	 * The cached value of the '{@link #getETCSSignalAllg() <em>ETCS Signal Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSSignalAllg()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Signal_Allg_AttributeGroup eTCSSignalAllg;

	/**
	 * The cached value of the '{@link #getETCSSignalDWeg() <em>ETCS Signal DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSSignalDWeg()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Signal_DWeg_AttributeGroup eTCSSignalDWeg;

	/**
	 * The cached value of the '{@link #getETCSSignalTBV() <em>ETCS Signal TBV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSSignalTBV()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Signal_TBV_AttributeGroup eTCSSignalTBV;

	/**
	 * The cached value of the '{@link #getIDETCSGefahrpunkt() <em>IDETCS Gefahrpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDETCSGefahrpunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_Markanter_Punkt_TypeClass iDETCSGefahrpunkt;

	/**
	 * The cached value of the '{@link #getIDETCSGefahrpunkt2() <em>IDETCS Gefahrpunkt2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDETCSGefahrpunkt2()
	 * @generated
	 * @ordered
	 */
	protected ID_Markanter_Punkt_TypeClass iDETCSGefahrpunkt2;

	/**
	 * The cached value of the '{@link #getIDHOAFBOA() <em>IDHOAFBOA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDHOAFBOA()
	 * @generated
	 * @ordered
	 */
	protected ID_Technischer_Punkt_TypeClass iDHOAFBOA;

	/**
	 * The cached value of the '{@link #getIDRBC() <em>IDRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_RBC_TypeClass> iDRBC;

	/**
	 * The cached value of the '{@link #getIDSignal() <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignal()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_ohne_Proxy_TypeClass iDSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Gefahrpunktabstand_Abweichend_TypeClass getETCSGefahrpunktabstandAbweichend() {
		return eTCSGefahrpunktabstandAbweichend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSGefahrpunktabstandAbweichend(ETCS_Gefahrpunktabstand_Abweichend_TypeClass newETCSGefahrpunktabstandAbweichend, NotificationChain msgs) {
		ETCS_Gefahrpunktabstand_Abweichend_TypeClass oldETCSGefahrpunktabstandAbweichend = eTCSGefahrpunktabstandAbweichend;
		eTCSGefahrpunktabstandAbweichend = newETCSGefahrpunktabstandAbweichend;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND, oldETCSGefahrpunktabstandAbweichend, newETCSGefahrpunktabstandAbweichend);
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
	public void setETCSGefahrpunktabstandAbweichend(ETCS_Gefahrpunktabstand_Abweichend_TypeClass newETCSGefahrpunktabstandAbweichend) {
		if (newETCSGefahrpunktabstandAbweichend != eTCSGefahrpunktabstandAbweichend) {
			NotificationChain msgs = null;
			if (eTCSGefahrpunktabstandAbweichend != null)
				msgs = ((InternalEObject)eTCSGefahrpunktabstandAbweichend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND, null, msgs);
			if (newETCSGefahrpunktabstandAbweichend != null)
				msgs = ((InternalEObject)newETCSGefahrpunktabstandAbweichend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND, null, msgs);
			msgs = basicSetETCSGefahrpunktabstandAbweichend(newETCSGefahrpunktabstandAbweichend, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND, newETCSGefahrpunktabstandAbweichend, newETCSGefahrpunktabstandAbweichend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Signal_Allg_AttributeGroup getETCSSignalAllg() {
		return eTCSSignalAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSSignalAllg(ETCS_Signal_Allg_AttributeGroup newETCSSignalAllg, NotificationChain msgs) {
		ETCS_Signal_Allg_AttributeGroup oldETCSSignalAllg = eTCSSignalAllg;
		eTCSSignalAllg = newETCSSignalAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG, oldETCSSignalAllg, newETCSSignalAllg);
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
	public void setETCSSignalAllg(ETCS_Signal_Allg_AttributeGroup newETCSSignalAllg) {
		if (newETCSSignalAllg != eTCSSignalAllg) {
			NotificationChain msgs = null;
			if (eTCSSignalAllg != null)
				msgs = ((InternalEObject)eTCSSignalAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG, null, msgs);
			if (newETCSSignalAllg != null)
				msgs = ((InternalEObject)newETCSSignalAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG, null, msgs);
			msgs = basicSetETCSSignalAllg(newETCSSignalAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG, newETCSSignalAllg, newETCSSignalAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Signal_DWeg_AttributeGroup getETCSSignalDWeg() {
		return eTCSSignalDWeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSSignalDWeg(ETCS_Signal_DWeg_AttributeGroup newETCSSignalDWeg, NotificationChain msgs) {
		ETCS_Signal_DWeg_AttributeGroup oldETCSSignalDWeg = eTCSSignalDWeg;
		eTCSSignalDWeg = newETCSSignalDWeg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG, oldETCSSignalDWeg, newETCSSignalDWeg);
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
	public void setETCSSignalDWeg(ETCS_Signal_DWeg_AttributeGroup newETCSSignalDWeg) {
		if (newETCSSignalDWeg != eTCSSignalDWeg) {
			NotificationChain msgs = null;
			if (eTCSSignalDWeg != null)
				msgs = ((InternalEObject)eTCSSignalDWeg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG, null, msgs);
			if (newETCSSignalDWeg != null)
				msgs = ((InternalEObject)newETCSSignalDWeg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG, null, msgs);
			msgs = basicSetETCSSignalDWeg(newETCSSignalDWeg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG, newETCSSignalDWeg, newETCSSignalDWeg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Signal_TBV_AttributeGroup getETCSSignalTBV() {
		return eTCSSignalTBV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSSignalTBV(ETCS_Signal_TBV_AttributeGroup newETCSSignalTBV, NotificationChain msgs) {
		ETCS_Signal_TBV_AttributeGroup oldETCSSignalTBV = eTCSSignalTBV;
		eTCSSignalTBV = newETCSSignalTBV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV, oldETCSSignalTBV, newETCSSignalTBV);
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
	public void setETCSSignalTBV(ETCS_Signal_TBV_AttributeGroup newETCSSignalTBV) {
		if (newETCSSignalTBV != eTCSSignalTBV) {
			NotificationChain msgs = null;
			if (eTCSSignalTBV != null)
				msgs = ((InternalEObject)eTCSSignalTBV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV, null, msgs);
			if (newETCSSignalTBV != null)
				msgs = ((InternalEObject)newETCSSignalTBV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV, null, msgs);
			msgs = basicSetETCSSignalTBV(newETCSSignalTBV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV, newETCSSignalTBV, newETCSSignalTBV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Markanter_Punkt_TypeClass getIDETCSGefahrpunkt() {
		return iDETCSGefahrpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDETCSGefahrpunkt(ID_Markanter_Punkt_TypeClass newIDETCSGefahrpunkt, NotificationChain msgs) {
		ID_Markanter_Punkt_TypeClass oldIDETCSGefahrpunkt = iDETCSGefahrpunkt;
		iDETCSGefahrpunkt = newIDETCSGefahrpunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT, oldIDETCSGefahrpunkt, newIDETCSGefahrpunkt);
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
	public void setIDETCSGefahrpunkt(ID_Markanter_Punkt_TypeClass newIDETCSGefahrpunkt) {
		if (newIDETCSGefahrpunkt != iDETCSGefahrpunkt) {
			NotificationChain msgs = null;
			if (iDETCSGefahrpunkt != null)
				msgs = ((InternalEObject)iDETCSGefahrpunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT, null, msgs);
			if (newIDETCSGefahrpunkt != null)
				msgs = ((InternalEObject)newIDETCSGefahrpunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT, null, msgs);
			msgs = basicSetIDETCSGefahrpunkt(newIDETCSGefahrpunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT, newIDETCSGefahrpunkt, newIDETCSGefahrpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Markanter_Punkt_TypeClass getIDETCSGefahrpunkt2() {
		return iDETCSGefahrpunkt2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDETCSGefahrpunkt2(ID_Markanter_Punkt_TypeClass newIDETCSGefahrpunkt2, NotificationChain msgs) {
		ID_Markanter_Punkt_TypeClass oldIDETCSGefahrpunkt2 = iDETCSGefahrpunkt2;
		iDETCSGefahrpunkt2 = newIDETCSGefahrpunkt2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT2, oldIDETCSGefahrpunkt2, newIDETCSGefahrpunkt2);
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
	public void setIDETCSGefahrpunkt2(ID_Markanter_Punkt_TypeClass newIDETCSGefahrpunkt2) {
		if (newIDETCSGefahrpunkt2 != iDETCSGefahrpunkt2) {
			NotificationChain msgs = null;
			if (iDETCSGefahrpunkt2 != null)
				msgs = ((InternalEObject)iDETCSGefahrpunkt2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT2, null, msgs);
			if (newIDETCSGefahrpunkt2 != null)
				msgs = ((InternalEObject)newIDETCSGefahrpunkt2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT2, null, msgs);
			msgs = basicSetIDETCSGefahrpunkt2(newIDETCSGefahrpunkt2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT2, newIDETCSGefahrpunkt2, newIDETCSGefahrpunkt2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Technischer_Punkt_TypeClass getIDHOAFBOA() {
		return iDHOAFBOA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDHOAFBOA(ID_Technischer_Punkt_TypeClass newIDHOAFBOA, NotificationChain msgs) {
		ID_Technischer_Punkt_TypeClass oldIDHOAFBOA = iDHOAFBOA;
		iDHOAFBOA = newIDHOAFBOA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA, oldIDHOAFBOA, newIDHOAFBOA);
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
	public void setIDHOAFBOA(ID_Technischer_Punkt_TypeClass newIDHOAFBOA) {
		if (newIDHOAFBOA != iDHOAFBOA) {
			NotificationChain msgs = null;
			if (iDHOAFBOA != null)
				msgs = ((InternalEObject)iDHOAFBOA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA, null, msgs);
			if (newIDHOAFBOA != null)
				msgs = ((InternalEObject)newIDHOAFBOA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA, null, msgs);
			msgs = basicSetIDHOAFBOA(newIDHOAFBOA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA, newIDHOAFBOA, newIDHOAFBOA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_RBC_TypeClass> getIDRBC() {
		if (iDRBC == null) {
			iDRBC = new EObjectContainmentEList<ID_RBC_TypeClass>(ID_RBC_TypeClass.class, this, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDRBC);
		}
		return iDRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_ohne_Proxy_TypeClass getIDSignal() {
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSignal(ID_Signal_ohne_Proxy_TypeClass newIDSignal, NotificationChain msgs) {
		ID_Signal_ohne_Proxy_TypeClass oldIDSignal = iDSignal;
		iDSignal = newIDSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL, oldIDSignal, newIDSignal);
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
	public void setIDSignal(ID_Signal_ohne_Proxy_TypeClass newIDSignal) {
		if (newIDSignal != iDSignal) {
			NotificationChain msgs = null;
			if (iDSignal != null)
				msgs = ((InternalEObject)iDSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL, null, msgs);
			if (newIDSignal != null)
				msgs = ((InternalEObject)newIDSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL, null, msgs);
			msgs = basicSetIDSignal(newIDSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL, newIDSignal, newIDSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND:
				return basicSetETCSGefahrpunktabstandAbweichend(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG:
				return basicSetETCSSignalAllg(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG:
				return basicSetETCSSignalDWeg(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV:
				return basicSetETCSSignalTBV(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT:
				return basicSetIDETCSGefahrpunkt(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT2:
				return basicSetIDETCSGefahrpunkt2(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA:
				return basicSetIDHOAFBOA(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDRBC:
				return ((InternalEList<?>)getIDRBC()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL:
				return basicSetIDSignal(null, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND:
				return getETCSGefahrpunktabstandAbweichend();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG:
				return getETCSSignalAllg();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG:
				return getETCSSignalDWeg();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV:
				return getETCSSignalTBV();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT:
				return getIDETCSGefahrpunkt();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT2:
				return getIDETCSGefahrpunkt2();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA:
				return getIDHOAFBOA();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDRBC:
				return getIDRBC();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL:
				return getIDSignal();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND:
				setETCSGefahrpunktabstandAbweichend((ETCS_Gefahrpunktabstand_Abweichend_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG:
				setETCSSignalAllg((ETCS_Signal_Allg_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG:
				setETCSSignalDWeg((ETCS_Signal_DWeg_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV:
				setETCSSignalTBV((ETCS_Signal_TBV_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT:
				setIDETCSGefahrpunkt((ID_Markanter_Punkt_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT2:
				setIDETCSGefahrpunkt2((ID_Markanter_Punkt_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA:
				setIDHOAFBOA((ID_Technischer_Punkt_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDRBC:
				getIDRBC().clear();
				getIDRBC().addAll((Collection<? extends ID_RBC_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL:
				setIDSignal((ID_Signal_ohne_Proxy_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND:
				setETCSGefahrpunktabstandAbweichend((ETCS_Gefahrpunktabstand_Abweichend_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG:
				setETCSSignalAllg((ETCS_Signal_Allg_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG:
				setETCSSignalDWeg((ETCS_Signal_DWeg_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV:
				setETCSSignalTBV((ETCS_Signal_TBV_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT:
				setIDETCSGefahrpunkt((ID_Markanter_Punkt_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT2:
				setIDETCSGefahrpunkt2((ID_Markanter_Punkt_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA:
				setIDHOAFBOA((ID_Technischer_Punkt_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDRBC:
				getIDRBC().clear();
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL:
				setIDSignal((ID_Signal_ohne_Proxy_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND:
				return eTCSGefahrpunktabstandAbweichend != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG:
				return eTCSSignalAllg != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG:
				return eTCSSignalDWeg != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV:
				return eTCSSignalTBV != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT:
				return iDETCSGefahrpunkt != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT2:
				return iDETCSGefahrpunkt2 != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA:
				return iDHOAFBOA != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDRBC:
				return iDRBC != null && !iDRBC.isEmpty();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL:
				return iDSignal != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ETCS_SignalImpl
