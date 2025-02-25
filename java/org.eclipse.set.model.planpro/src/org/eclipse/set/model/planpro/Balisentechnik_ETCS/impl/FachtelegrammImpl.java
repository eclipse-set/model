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
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Fachtelegramm;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Wirkrichtung_In_Datenpunkt_TypeClass;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_AnhangBearbeitungsvermerk_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fachtelegramm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FachtelegrammImpl#getFTFahrwegTeile <em>FT Fahrweg Teile</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FachtelegrammImpl#getIDDokuTelegrammkodierung <em>ID Doku Telegrammkodierung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FachtelegrammImpl#getWirkrichtungInDatenpunkt <em>Wirkrichtung In Datenpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FachtelegrammImpl#getFTESGMerkmale <em>FTESG Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FachtelegrammImpl#getFTETCSL2Merkmale <em>FTETCSL2 Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FachtelegrammImpl#getFTETCSTransMerkmale <em>FTETCS Trans Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FachtelegrammImpl#getFTGNTMerkmale <em>FTGNT Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FachtelegrammImpl#getFTZBSMerkmale <em>FTZBS Merkmale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FachtelegrammImpl extends Basis_ObjektImpl implements Fachtelegramm {
	/**
	 * The cached value of the '{@link #getFTFahrwegTeile() <em>FT Fahrweg Teile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTFahrwegTeile()
	 * @generated
	 * @ordered
	 */
	protected EList<FT_Fahrweg_Teile_AttributeGroup> fTFahrwegTeile;

	/**
	 * The cached value of the '{@link #getIDDokuTelegrammkodierung() <em>ID Doku Telegrammkodierung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDDokuTelegrammkodierung()
	 * @generated
	 * @ordered
	 */
	protected ID_AnhangBearbeitungsvermerk_TypeClass iDDokuTelegrammkodierung;

	/**
	 * The cached value of the '{@link #getWirkrichtungInDatenpunkt() <em>Wirkrichtung In Datenpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWirkrichtungInDatenpunkt()
	 * @generated
	 * @ordered
	 */
	protected Wirkrichtung_In_Datenpunkt_TypeClass wirkrichtungInDatenpunkt;

	/**
	 * The cached value of the '{@link #getFTESGMerkmale() <em>FTESG Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTESGMerkmale()
	 * @generated
	 * @ordered
	 */
	protected FT_ESG_Merkmale_AttributeGroup fTESGMerkmale;

	/**
	 * The cached value of the '{@link #getFTETCSL2Merkmale() <em>FTETCSL2 Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTETCSL2Merkmale()
	 * @generated
	 * @ordered
	 */
	protected FT_ETCS_L2_Merkmale_AttributeGroup fTETCSL2Merkmale;

	/**
	 * The cached value of the '{@link #getFTETCSTransMerkmale() <em>FTETCS Trans Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTETCSTransMerkmale()
	 * @generated
	 * @ordered
	 */
	protected FT_ETCS_Trans_Merkmale_AttributeGroup fTETCSTransMerkmale;

	/**
	 * The cached value of the '{@link #getFTGNTMerkmale() <em>FTGNT Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTGNTMerkmale()
	 * @generated
	 * @ordered
	 */
	protected FT_GNT_Merkmale_AttributeGroup fTGNTMerkmale;

	/**
	 * The cached value of the '{@link #getFTZBSMerkmale() <em>FTZBS Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTZBSMerkmale()
	 * @generated
	 * @ordered
	 */
	protected FT_ZBS_Merkmale_AttributeGroup fTZBSMerkmale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FachtelegrammImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FT_Fahrweg_Teile_AttributeGroup> getFTFahrwegTeile() {
		if (fTFahrwegTeile == null) {
			fTFahrwegTeile = new EObjectContainmentEList<FT_Fahrweg_Teile_AttributeGroup>(FT_Fahrweg_Teile_AttributeGroup.class, this, Balisentechnik_ETCSPackage.FACHTELEGRAMM__FT_FAHRWEG_TEILE);
		}
		return fTFahrwegTeile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_AnhangBearbeitungsvermerk_TypeClass getIDDokuTelegrammkodierung() {
		return iDDokuTelegrammkodierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDDokuTelegrammkodierung(ID_AnhangBearbeitungsvermerk_TypeClass newIDDokuTelegrammkodierung, NotificationChain msgs) {
		ID_AnhangBearbeitungsvermerk_TypeClass oldIDDokuTelegrammkodierung = iDDokuTelegrammkodierung;
		iDDokuTelegrammkodierung = newIDDokuTelegrammkodierung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__ID_DOKU_TELEGRAMMKODIERUNG, oldIDDokuTelegrammkodierung, newIDDokuTelegrammkodierung);
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
	public void setIDDokuTelegrammkodierung(ID_AnhangBearbeitungsvermerk_TypeClass newIDDokuTelegrammkodierung) {
		if (newIDDokuTelegrammkodierung != iDDokuTelegrammkodierung) {
			NotificationChain msgs = null;
			if (iDDokuTelegrammkodierung != null)
				msgs = ((InternalEObject)iDDokuTelegrammkodierung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__ID_DOKU_TELEGRAMMKODIERUNG, null, msgs);
			if (newIDDokuTelegrammkodierung != null)
				msgs = ((InternalEObject)newIDDokuTelegrammkodierung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__ID_DOKU_TELEGRAMMKODIERUNG, null, msgs);
			msgs = basicSetIDDokuTelegrammkodierung(newIDDokuTelegrammkodierung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__ID_DOKU_TELEGRAMMKODIERUNG, newIDDokuTelegrammkodierung, newIDDokuTelegrammkodierung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirkrichtung_In_Datenpunkt_TypeClass getWirkrichtungInDatenpunkt() {
		return wirkrichtungInDatenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWirkrichtungInDatenpunkt(Wirkrichtung_In_Datenpunkt_TypeClass newWirkrichtungInDatenpunkt, NotificationChain msgs) {
		Wirkrichtung_In_Datenpunkt_TypeClass oldWirkrichtungInDatenpunkt = wirkrichtungInDatenpunkt;
		wirkrichtungInDatenpunkt = newWirkrichtungInDatenpunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__WIRKRICHTUNG_IN_DATENPUNKT, oldWirkrichtungInDatenpunkt, newWirkrichtungInDatenpunkt);
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
	public void setWirkrichtungInDatenpunkt(Wirkrichtung_In_Datenpunkt_TypeClass newWirkrichtungInDatenpunkt) {
		if (newWirkrichtungInDatenpunkt != wirkrichtungInDatenpunkt) {
			NotificationChain msgs = null;
			if (wirkrichtungInDatenpunkt != null)
				msgs = ((InternalEObject)wirkrichtungInDatenpunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__WIRKRICHTUNG_IN_DATENPUNKT, null, msgs);
			if (newWirkrichtungInDatenpunkt != null)
				msgs = ((InternalEObject)newWirkrichtungInDatenpunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__WIRKRICHTUNG_IN_DATENPUNKT, null, msgs);
			msgs = basicSetWirkrichtungInDatenpunkt(newWirkrichtungInDatenpunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__WIRKRICHTUNG_IN_DATENPUNKT, newWirkrichtungInDatenpunkt, newWirkrichtungInDatenpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ESG_Merkmale_AttributeGroup getFTESGMerkmale() {
		return fTESGMerkmale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTESGMerkmale(FT_ESG_Merkmale_AttributeGroup newFTESGMerkmale, NotificationChain msgs) {
		FT_ESG_Merkmale_AttributeGroup oldFTESGMerkmale = fTESGMerkmale;
		fTESGMerkmale = newFTESGMerkmale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTESG_MERKMALE, oldFTESGMerkmale, newFTESGMerkmale);
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
	public void setFTESGMerkmale(FT_ESG_Merkmale_AttributeGroup newFTESGMerkmale) {
		if (newFTESGMerkmale != fTESGMerkmale) {
			NotificationChain msgs = null;
			if (fTESGMerkmale != null)
				msgs = ((InternalEObject)fTESGMerkmale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTESG_MERKMALE, null, msgs);
			if (newFTESGMerkmale != null)
				msgs = ((InternalEObject)newFTESGMerkmale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTESG_MERKMALE, null, msgs);
			msgs = basicSetFTESGMerkmale(newFTESGMerkmale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTESG_MERKMALE, newFTESGMerkmale, newFTESGMerkmale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ETCS_L2_Merkmale_AttributeGroup getFTETCSL2Merkmale() {
		return fTETCSL2Merkmale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTETCSL2Merkmale(FT_ETCS_L2_Merkmale_AttributeGroup newFTETCSL2Merkmale, NotificationChain msgs) {
		FT_ETCS_L2_Merkmale_AttributeGroup oldFTETCSL2Merkmale = fTETCSL2Merkmale;
		fTETCSL2Merkmale = newFTETCSL2Merkmale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCSL2_MERKMALE, oldFTETCSL2Merkmale, newFTETCSL2Merkmale);
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
	public void setFTETCSL2Merkmale(FT_ETCS_L2_Merkmale_AttributeGroup newFTETCSL2Merkmale) {
		if (newFTETCSL2Merkmale != fTETCSL2Merkmale) {
			NotificationChain msgs = null;
			if (fTETCSL2Merkmale != null)
				msgs = ((InternalEObject)fTETCSL2Merkmale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCSL2_MERKMALE, null, msgs);
			if (newFTETCSL2Merkmale != null)
				msgs = ((InternalEObject)newFTETCSL2Merkmale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCSL2_MERKMALE, null, msgs);
			msgs = basicSetFTETCSL2Merkmale(newFTETCSL2Merkmale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCSL2_MERKMALE, newFTETCSL2Merkmale, newFTETCSL2Merkmale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ETCS_Trans_Merkmale_AttributeGroup getFTETCSTransMerkmale() {
		return fTETCSTransMerkmale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTETCSTransMerkmale(FT_ETCS_Trans_Merkmale_AttributeGroup newFTETCSTransMerkmale, NotificationChain msgs) {
		FT_ETCS_Trans_Merkmale_AttributeGroup oldFTETCSTransMerkmale = fTETCSTransMerkmale;
		fTETCSTransMerkmale = newFTETCSTransMerkmale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCS_TRANS_MERKMALE, oldFTETCSTransMerkmale, newFTETCSTransMerkmale);
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
	public void setFTETCSTransMerkmale(FT_ETCS_Trans_Merkmale_AttributeGroup newFTETCSTransMerkmale) {
		if (newFTETCSTransMerkmale != fTETCSTransMerkmale) {
			NotificationChain msgs = null;
			if (fTETCSTransMerkmale != null)
				msgs = ((InternalEObject)fTETCSTransMerkmale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCS_TRANS_MERKMALE, null, msgs);
			if (newFTETCSTransMerkmale != null)
				msgs = ((InternalEObject)newFTETCSTransMerkmale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCS_TRANS_MERKMALE, null, msgs);
			msgs = basicSetFTETCSTransMerkmale(newFTETCSTransMerkmale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCS_TRANS_MERKMALE, newFTETCSTransMerkmale, newFTETCSTransMerkmale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_GNT_Merkmale_AttributeGroup getFTGNTMerkmale() {
		return fTGNTMerkmale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTGNTMerkmale(FT_GNT_Merkmale_AttributeGroup newFTGNTMerkmale, NotificationChain msgs) {
		FT_GNT_Merkmale_AttributeGroup oldFTGNTMerkmale = fTGNTMerkmale;
		fTGNTMerkmale = newFTGNTMerkmale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTGNT_MERKMALE, oldFTGNTMerkmale, newFTGNTMerkmale);
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
	public void setFTGNTMerkmale(FT_GNT_Merkmale_AttributeGroup newFTGNTMerkmale) {
		if (newFTGNTMerkmale != fTGNTMerkmale) {
			NotificationChain msgs = null;
			if (fTGNTMerkmale != null)
				msgs = ((InternalEObject)fTGNTMerkmale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTGNT_MERKMALE, null, msgs);
			if (newFTGNTMerkmale != null)
				msgs = ((InternalEObject)newFTGNTMerkmale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTGNT_MERKMALE, null, msgs);
			msgs = basicSetFTGNTMerkmale(newFTGNTMerkmale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTGNT_MERKMALE, newFTGNTMerkmale, newFTGNTMerkmale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ZBS_Merkmale_AttributeGroup getFTZBSMerkmale() {
		return fTZBSMerkmale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTZBSMerkmale(FT_ZBS_Merkmale_AttributeGroup newFTZBSMerkmale, NotificationChain msgs) {
		FT_ZBS_Merkmale_AttributeGroup oldFTZBSMerkmale = fTZBSMerkmale;
		fTZBSMerkmale = newFTZBSMerkmale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTZBS_MERKMALE, oldFTZBSMerkmale, newFTZBSMerkmale);
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
	public void setFTZBSMerkmale(FT_ZBS_Merkmale_AttributeGroup newFTZBSMerkmale) {
		if (newFTZBSMerkmale != fTZBSMerkmale) {
			NotificationChain msgs = null;
			if (fTZBSMerkmale != null)
				msgs = ((InternalEObject)fTZBSMerkmale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTZBS_MERKMALE, null, msgs);
			if (newFTZBSMerkmale != null)
				msgs = ((InternalEObject)newFTZBSMerkmale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTZBS_MERKMALE, null, msgs);
			msgs = basicSetFTZBSMerkmale(newFTZBSMerkmale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTZBS_MERKMALE, newFTZBSMerkmale, newFTZBSMerkmale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FT_FAHRWEG_TEILE:
				return ((InternalEList<?>)getFTFahrwegTeile()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__ID_DOKU_TELEGRAMMKODIERUNG:
				return basicSetIDDokuTelegrammkodierung(null, msgs);
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__WIRKRICHTUNG_IN_DATENPUNKT:
				return basicSetWirkrichtungInDatenpunkt(null, msgs);
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTESG_MERKMALE:
				return basicSetFTESGMerkmale(null, msgs);
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCSL2_MERKMALE:
				return basicSetFTETCSL2Merkmale(null, msgs);
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCS_TRANS_MERKMALE:
				return basicSetFTETCSTransMerkmale(null, msgs);
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTGNT_MERKMALE:
				return basicSetFTGNTMerkmale(null, msgs);
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTZBS_MERKMALE:
				return basicSetFTZBSMerkmale(null, msgs);
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
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FT_FAHRWEG_TEILE:
				return getFTFahrwegTeile();
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__ID_DOKU_TELEGRAMMKODIERUNG:
				return getIDDokuTelegrammkodierung();
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__WIRKRICHTUNG_IN_DATENPUNKT:
				return getWirkrichtungInDatenpunkt();
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTESG_MERKMALE:
				return getFTESGMerkmale();
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCSL2_MERKMALE:
				return getFTETCSL2Merkmale();
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCS_TRANS_MERKMALE:
				return getFTETCSTransMerkmale();
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTGNT_MERKMALE:
				return getFTGNTMerkmale();
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTZBS_MERKMALE:
				return getFTZBSMerkmale();
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
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FT_FAHRWEG_TEILE:
				getFTFahrwegTeile().clear();
				getFTFahrwegTeile().addAll((Collection<? extends FT_Fahrweg_Teile_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__ID_DOKU_TELEGRAMMKODIERUNG:
				setIDDokuTelegrammkodierung((ID_AnhangBearbeitungsvermerk_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__WIRKRICHTUNG_IN_DATENPUNKT:
				setWirkrichtungInDatenpunkt((Wirkrichtung_In_Datenpunkt_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTESG_MERKMALE:
				setFTESGMerkmale((FT_ESG_Merkmale_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCSL2_MERKMALE:
				setFTETCSL2Merkmale((FT_ETCS_L2_Merkmale_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCS_TRANS_MERKMALE:
				setFTETCSTransMerkmale((FT_ETCS_Trans_Merkmale_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTGNT_MERKMALE:
				setFTGNTMerkmale((FT_GNT_Merkmale_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTZBS_MERKMALE:
				setFTZBSMerkmale((FT_ZBS_Merkmale_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FT_FAHRWEG_TEILE:
				getFTFahrwegTeile().clear();
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__ID_DOKU_TELEGRAMMKODIERUNG:
				setIDDokuTelegrammkodierung((ID_AnhangBearbeitungsvermerk_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__WIRKRICHTUNG_IN_DATENPUNKT:
				setWirkrichtungInDatenpunkt((Wirkrichtung_In_Datenpunkt_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTESG_MERKMALE:
				setFTESGMerkmale((FT_ESG_Merkmale_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCSL2_MERKMALE:
				setFTETCSL2Merkmale((FT_ETCS_L2_Merkmale_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCS_TRANS_MERKMALE:
				setFTETCSTransMerkmale((FT_ETCS_Trans_Merkmale_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTGNT_MERKMALE:
				setFTGNTMerkmale((FT_GNT_Merkmale_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTZBS_MERKMALE:
				setFTZBSMerkmale((FT_ZBS_Merkmale_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FT_FAHRWEG_TEILE:
				return fTFahrwegTeile != null && !fTFahrwegTeile.isEmpty();
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__ID_DOKU_TELEGRAMMKODIERUNG:
				return iDDokuTelegrammkodierung != null;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__WIRKRICHTUNG_IN_DATENPUNKT:
				return wirkrichtungInDatenpunkt != null;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTESG_MERKMALE:
				return fTESGMerkmale != null;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCSL2_MERKMALE:
				return fTETCSL2Merkmale != null;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCS_TRANS_MERKMALE:
				return fTETCSTransMerkmale != null;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTGNT_MERKMALE:
				return fTGNTMerkmale != null;
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTZBS_MERKMALE:
				return fTZBSMerkmale != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //FachtelegrammImpl
