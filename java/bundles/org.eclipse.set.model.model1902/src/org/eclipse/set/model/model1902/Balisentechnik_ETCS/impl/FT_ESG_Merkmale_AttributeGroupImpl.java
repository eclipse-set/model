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

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bremsweg_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_V_La_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Subtyp_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Typ_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.LfdNr_in_Telegr_Spec_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT ESG Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getBremsweg <em>Bremsweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getDPTypVLa <em>DP Typ VLa</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getESGIndividuelleMerkmale <em>ESG Individuelle Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getESGSpezifischeMerkmale <em>ESG Spezifische Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getFTESGSubtyp <em>FTESG Subtyp</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getFTESGTyp <em>FTESG Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getLfdNrInTelegrSpec <em>Lfd Nr In Telegr Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_ESG_Merkmale_AttributeGroupImpl extends MinimalEObjectImpl.Container implements FT_ESG_Merkmale_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBremsweg() <em>Bremsweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBremsweg()
	 * @generated
	 * @ordered
	 */
	protected Bremsweg_TypeClass bremsweg;

	/**
	 * The cached value of the '{@link #getDPTypVLa() <em>DP Typ VLa</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypVLa()
	 * @generated
	 * @ordered
	 */
	protected EList<DP_Typ_V_La_TypeClass> dPTypVLa;

	/**
	 * The cached value of the '{@link #getESGIndividuelleMerkmale() <em>ESG Individuelle Merkmale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESGIndividuelleMerkmale()
	 * @generated
	 * @ordered
	 */
	protected EList<ESG_Individuelle_Merkmale_AttributeGroup> eSGIndividuelleMerkmale;

	/**
	 * The cached value of the '{@link #getESGSpezifischeMerkmale() <em>ESG Spezifische Merkmale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESGSpezifischeMerkmale()
	 * @generated
	 * @ordered
	 */
	protected EList<ESG_Spezifische_Merkmale_AttributeGroup> eSGSpezifischeMerkmale;

	/**
	 * The cached value of the '{@link #getFTESGSubtyp() <em>FTESG Subtyp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTESGSubtyp()
	 * @generated
	 * @ordered
	 */
	protected FT_ESG_Subtyp_TypeClass fTESGSubtyp;

	/**
	 * The cached value of the '{@link #getFTESGTyp() <em>FTESG Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTESGTyp()
	 * @generated
	 * @ordered
	 */
	protected FT_ESG_Typ_TypeClass fTESGTyp;

	/**
	 * The cached value of the '{@link #getLfdNrInTelegrSpec() <em>Lfd Nr In Telegr Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLfdNrInTelegrSpec()
	 * @generated
	 * @ordered
	 */
	protected LfdNr_in_Telegr_Spec_TypeClass lfdNrInTelegrSpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_ESG_Merkmale_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bremsweg_TypeClass getBremsweg() {
		return bremsweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBremsweg(Bremsweg_TypeClass newBremsweg, NotificationChain msgs) {
		Bremsweg_TypeClass oldBremsweg = bremsweg;
		bremsweg = newBremsweg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__BREMSWEG, oldBremsweg, newBremsweg);
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
	public void setBremsweg(Bremsweg_TypeClass newBremsweg) {
		if (newBremsweg != bremsweg) {
			NotificationChain msgs = null;
			if (bremsweg != null)
				msgs = ((InternalEObject)bremsweg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__BREMSWEG, null, msgs);
			if (newBremsweg != null)
				msgs = ((InternalEObject)newBremsweg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__BREMSWEG, null, msgs);
			msgs = basicSetBremsweg(newBremsweg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__BREMSWEG, newBremsweg, newBremsweg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DP_Typ_V_La_TypeClass> getDPTypVLa() {
		if (dPTypVLa == null) {
			dPTypVLa = new EObjectContainmentEList<DP_Typ_V_La_TypeClass>(DP_Typ_V_La_TypeClass.class, this, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA);
		}
		return dPTypVLa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ESG_Individuelle_Merkmale_AttributeGroup> getESGIndividuelleMerkmale() {
		if (eSGIndividuelleMerkmale == null) {
			eSGIndividuelleMerkmale = new EObjectContainmentEList<ESG_Individuelle_Merkmale_AttributeGroup>(ESG_Individuelle_Merkmale_AttributeGroup.class, this, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_INDIVIDUELLE_MERKMALE);
		}
		return eSGIndividuelleMerkmale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ESG_Spezifische_Merkmale_AttributeGroup> getESGSpezifischeMerkmale() {
		if (eSGSpezifischeMerkmale == null) {
			eSGSpezifischeMerkmale = new EObjectContainmentEList<ESG_Spezifische_Merkmale_AttributeGroup>(ESG_Spezifische_Merkmale_AttributeGroup.class, this, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_SPEZIFISCHE_MERKMALE);
		}
		return eSGSpezifischeMerkmale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ESG_Subtyp_TypeClass getFTESGSubtyp() {
		return fTESGSubtyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTESGSubtyp(FT_ESG_Subtyp_TypeClass newFTESGSubtyp, NotificationChain msgs) {
		FT_ESG_Subtyp_TypeClass oldFTESGSubtyp = fTESGSubtyp;
		fTESGSubtyp = newFTESGSubtyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_SUBTYP, oldFTESGSubtyp, newFTESGSubtyp);
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
	public void setFTESGSubtyp(FT_ESG_Subtyp_TypeClass newFTESGSubtyp) {
		if (newFTESGSubtyp != fTESGSubtyp) {
			NotificationChain msgs = null;
			if (fTESGSubtyp != null)
				msgs = ((InternalEObject)fTESGSubtyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_SUBTYP, null, msgs);
			if (newFTESGSubtyp != null)
				msgs = ((InternalEObject)newFTESGSubtyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_SUBTYP, null, msgs);
			msgs = basicSetFTESGSubtyp(newFTESGSubtyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_SUBTYP, newFTESGSubtyp, newFTESGSubtyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ESG_Typ_TypeClass getFTESGTyp() {
		return fTESGTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTESGTyp(FT_ESG_Typ_TypeClass newFTESGTyp, NotificationChain msgs) {
		FT_ESG_Typ_TypeClass oldFTESGTyp = fTESGTyp;
		fTESGTyp = newFTESGTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_TYP, oldFTESGTyp, newFTESGTyp);
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
	public void setFTESGTyp(FT_ESG_Typ_TypeClass newFTESGTyp) {
		if (newFTESGTyp != fTESGTyp) {
			NotificationChain msgs = null;
			if (fTESGTyp != null)
				msgs = ((InternalEObject)fTESGTyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_TYP, null, msgs);
			if (newFTESGTyp != null)
				msgs = ((InternalEObject)newFTESGTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_TYP, null, msgs);
			msgs = basicSetFTESGTyp(newFTESGTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_TYP, newFTESGTyp, newFTESGTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LfdNr_in_Telegr_Spec_TypeClass getLfdNrInTelegrSpec() {
		return lfdNrInTelegrSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLfdNrInTelegrSpec(LfdNr_in_Telegr_Spec_TypeClass newLfdNrInTelegrSpec, NotificationChain msgs) {
		LfdNr_in_Telegr_Spec_TypeClass oldLfdNrInTelegrSpec = lfdNrInTelegrSpec;
		lfdNrInTelegrSpec = newLfdNrInTelegrSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LFD_NR_IN_TELEGR_SPEC, oldLfdNrInTelegrSpec, newLfdNrInTelegrSpec);
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
	public void setLfdNrInTelegrSpec(LfdNr_in_Telegr_Spec_TypeClass newLfdNrInTelegrSpec) {
		if (newLfdNrInTelegrSpec != lfdNrInTelegrSpec) {
			NotificationChain msgs = null;
			if (lfdNrInTelegrSpec != null)
				msgs = ((InternalEObject)lfdNrInTelegrSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LFD_NR_IN_TELEGR_SPEC, null, msgs);
			if (newLfdNrInTelegrSpec != null)
				msgs = ((InternalEObject)newLfdNrInTelegrSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LFD_NR_IN_TELEGR_SPEC, null, msgs);
			msgs = basicSetLfdNrInTelegrSpec(newLfdNrInTelegrSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LFD_NR_IN_TELEGR_SPEC, newLfdNrInTelegrSpec, newLfdNrInTelegrSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__BREMSWEG:
				return basicSetBremsweg(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA:
				return ((InternalEList<?>)getDPTypVLa()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_INDIVIDUELLE_MERKMALE:
				return ((InternalEList<?>)getESGIndividuelleMerkmale()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_SPEZIFISCHE_MERKMALE:
				return ((InternalEList<?>)getESGSpezifischeMerkmale()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_SUBTYP:
				return basicSetFTESGSubtyp(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_TYP:
				return basicSetFTESGTyp(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LFD_NR_IN_TELEGR_SPEC:
				return basicSetLfdNrInTelegrSpec(null, msgs);
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
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__BREMSWEG:
				return getBremsweg();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA:
				return getDPTypVLa();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_INDIVIDUELLE_MERKMALE:
				return getESGIndividuelleMerkmale();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_SPEZIFISCHE_MERKMALE:
				return getESGSpezifischeMerkmale();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_SUBTYP:
				return getFTESGSubtyp();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_TYP:
				return getFTESGTyp();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LFD_NR_IN_TELEGR_SPEC:
				return getLfdNrInTelegrSpec();
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
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__BREMSWEG:
				setBremsweg((Bremsweg_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA:
				getDPTypVLa().clear();
				getDPTypVLa().addAll((Collection<? extends DP_Typ_V_La_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_INDIVIDUELLE_MERKMALE:
				getESGIndividuelleMerkmale().clear();
				getESGIndividuelleMerkmale().addAll((Collection<? extends ESG_Individuelle_Merkmale_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_SPEZIFISCHE_MERKMALE:
				getESGSpezifischeMerkmale().clear();
				getESGSpezifischeMerkmale().addAll((Collection<? extends ESG_Spezifische_Merkmale_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_SUBTYP:
				setFTESGSubtyp((FT_ESG_Subtyp_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_TYP:
				setFTESGTyp((FT_ESG_Typ_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LFD_NR_IN_TELEGR_SPEC:
				setLfdNrInTelegrSpec((LfdNr_in_Telegr_Spec_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__BREMSWEG:
				setBremsweg((Bremsweg_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA:
				getDPTypVLa().clear();
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_INDIVIDUELLE_MERKMALE:
				getESGIndividuelleMerkmale().clear();
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_SPEZIFISCHE_MERKMALE:
				getESGSpezifischeMerkmale().clear();
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_SUBTYP:
				setFTESGSubtyp((FT_ESG_Subtyp_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_TYP:
				setFTESGTyp((FT_ESG_Typ_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LFD_NR_IN_TELEGR_SPEC:
				setLfdNrInTelegrSpec((LfdNr_in_Telegr_Spec_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__BREMSWEG:
				return bremsweg != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA:
				return dPTypVLa != null && !dPTypVLa.isEmpty();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_INDIVIDUELLE_MERKMALE:
				return eSGIndividuelleMerkmale != null && !eSGIndividuelleMerkmale.isEmpty();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_SPEZIFISCHE_MERKMALE:
				return eSGSpezifischeMerkmale != null && !eSGSpezifischeMerkmale.isEmpty();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_SUBTYP:
				return fTESGSubtyp != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__FTESG_TYP:
				return fTESGTyp != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LFD_NR_IN_TELEGR_SPEC:
				return lfdNrInTelegrSpec != null;
		}
		return super.eIsSet(featureID);
	}

} //FT_ESG_Merkmale_AttributeGroupImpl
