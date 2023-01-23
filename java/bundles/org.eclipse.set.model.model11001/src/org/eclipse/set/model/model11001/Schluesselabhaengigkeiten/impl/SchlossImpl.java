/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss;
import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_BUE_AttributeGroup;
import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup;
import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup;
import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup;
import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup;
import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup;
import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_In_Grdst_Eingeschl_TypeClass;
import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;
import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Technisch_Berechtigter_TypeClass;

import org.eclipse.set.model.model11001.Verweise.ID_Schluessel_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schloss</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl#getIDSchluessel <em>ID Schluessel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl#getSchluesselInGrdstEingeschl <em>Schluessel In Grdst Eingeschl</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl#getSchlossBUE <em>Schloss BUE</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl#getSchlossGsp <em>Schloss Gsp</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl#getSchlossSk <em>Schloss Sk</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl#getSchlossSonderanlage <em>Schloss Sonderanlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl#getSchlossSsp <em>Schloss Ssp</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl#getSchlossW <em>Schloss W</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchlossImpl#getTechnischBerechtigter <em>Technisch Berechtigter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchlossImpl extends Basis_ObjektImpl implements Schloss {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Schloss_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDSchluessel() <em>ID Schluessel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSchluessel()
	 * @generated
	 * @ordered
	 */
	protected ID_Schluessel_TypeClass iDSchluessel;

	/**
	 * The cached value of the '{@link #getSchluesselInGrdstEingeschl() <em>Schluessel In Grdst Eingeschl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchluesselInGrdstEingeschl()
	 * @generated
	 * @ordered
	 */
	protected Schluessel_In_Grdst_Eingeschl_TypeClass schluesselInGrdstEingeschl;

	/**
	 * The cached value of the '{@link #getSchlossBUE() <em>Schloss BUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchlossBUE()
	 * @generated
	 * @ordered
	 */
	protected Schloss_BUE_AttributeGroup schlossBUE;

	/**
	 * The cached value of the '{@link #getSchlossGsp() <em>Schloss Gsp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchlossGsp()
	 * @generated
	 * @ordered
	 */
	protected Schloss_Gsp_AttributeGroup schlossGsp;

	/**
	 * The cached value of the '{@link #getSchlossSk() <em>Schloss Sk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchlossSk()
	 * @generated
	 * @ordered
	 */
	protected Schloss_Sk_AttributeGroup schlossSk;

	/**
	 * The cached value of the '{@link #getSchlossSonderanlage() <em>Schloss Sonderanlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchlossSonderanlage()
	 * @generated
	 * @ordered
	 */
	protected Schloss_Sonderanlage_AttributeGroup schlossSonderanlage;

	/**
	 * The cached value of the '{@link #getSchlossSsp() <em>Schloss Ssp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchlossSsp()
	 * @generated
	 * @ordered
	 */
	protected Schloss_Ssp_AttributeGroup schlossSsp;

	/**
	 * The cached value of the '{@link #getSchlossW() <em>Schloss W</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchlossW()
	 * @generated
	 * @ordered
	 */
	protected Schloss_W_AttributeGroup schlossW;

	/**
	 * The cached value of the '{@link #getTechnischBerechtigter() <em>Technisch Berechtigter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnischBerechtigter()
	 * @generated
	 * @ordered
	 */
	protected Technisch_Berechtigter_TypeClass technischBerechtigter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchlossImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLOSS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Schloss_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Schloss_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Schloss_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Schluessel_TypeClass getIDSchluessel() {
		return iDSchluessel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSchluessel(ID_Schluessel_TypeClass newIDSchluessel, NotificationChain msgs) {
		ID_Schluessel_TypeClass oldIDSchluessel = iDSchluessel;
		iDSchluessel = newIDSchluessel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__ID_SCHLUESSEL, oldIDSchluessel, newIDSchluessel);
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
	public void setIDSchluessel(ID_Schluessel_TypeClass newIDSchluessel) {
		if (newIDSchluessel != iDSchluessel) {
			NotificationChain msgs = null;
			if (iDSchluessel != null)
				msgs = ((InternalEObject)iDSchluessel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__ID_SCHLUESSEL, null, msgs);
			if (newIDSchluessel != null)
				msgs = ((InternalEObject)newIDSchluessel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__ID_SCHLUESSEL, null, msgs);
			msgs = basicSetIDSchluessel(newIDSchluessel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__ID_SCHLUESSEL, newIDSchluessel, newIDSchluessel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluessel_In_Grdst_Eingeschl_TypeClass getSchluesselInGrdstEingeschl() {
		return schluesselInGrdstEingeschl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchluesselInGrdstEingeschl(Schluessel_In_Grdst_Eingeschl_TypeClass newSchluesselInGrdstEingeschl, NotificationChain msgs) {
		Schluessel_In_Grdst_Eingeschl_TypeClass oldSchluesselInGrdstEingeschl = schluesselInGrdstEingeschl;
		schluesselInGrdstEingeschl = newSchluesselInGrdstEingeschl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL, oldSchluesselInGrdstEingeschl, newSchluesselInGrdstEingeschl);
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
	public void setSchluesselInGrdstEingeschl(Schluessel_In_Grdst_Eingeschl_TypeClass newSchluesselInGrdstEingeschl) {
		if (newSchluesselInGrdstEingeschl != schluesselInGrdstEingeschl) {
			NotificationChain msgs = null;
			if (schluesselInGrdstEingeschl != null)
				msgs = ((InternalEObject)schluesselInGrdstEingeschl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL, null, msgs);
			if (newSchluesselInGrdstEingeschl != null)
				msgs = ((InternalEObject)newSchluesselInGrdstEingeschl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL, null, msgs);
			msgs = basicSetSchluesselInGrdstEingeschl(newSchluesselInGrdstEingeschl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL, newSchluesselInGrdstEingeschl, newSchluesselInGrdstEingeschl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_BUE_AttributeGroup getSchlossBUE() {
		return schlossBUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchlossBUE(Schloss_BUE_AttributeGroup newSchlossBUE, NotificationChain msgs) {
		Schloss_BUE_AttributeGroup oldSchlossBUE = schlossBUE;
		schlossBUE = newSchlossBUE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_BUE, oldSchlossBUE, newSchlossBUE);
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
	public void setSchlossBUE(Schloss_BUE_AttributeGroup newSchlossBUE) {
		if (newSchlossBUE != schlossBUE) {
			NotificationChain msgs = null;
			if (schlossBUE != null)
				msgs = ((InternalEObject)schlossBUE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_BUE, null, msgs);
			if (newSchlossBUE != null)
				msgs = ((InternalEObject)newSchlossBUE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_BUE, null, msgs);
			msgs = basicSetSchlossBUE(newSchlossBUE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_BUE, newSchlossBUE, newSchlossBUE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_Gsp_AttributeGroup getSchlossGsp() {
		return schlossGsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchlossGsp(Schloss_Gsp_AttributeGroup newSchlossGsp, NotificationChain msgs) {
		Schloss_Gsp_AttributeGroup oldSchlossGsp = schlossGsp;
		schlossGsp = newSchlossGsp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_GSP, oldSchlossGsp, newSchlossGsp);
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
	public void setSchlossGsp(Schloss_Gsp_AttributeGroup newSchlossGsp) {
		if (newSchlossGsp != schlossGsp) {
			NotificationChain msgs = null;
			if (schlossGsp != null)
				msgs = ((InternalEObject)schlossGsp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_GSP, null, msgs);
			if (newSchlossGsp != null)
				msgs = ((InternalEObject)newSchlossGsp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_GSP, null, msgs);
			msgs = basicSetSchlossGsp(newSchlossGsp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_GSP, newSchlossGsp, newSchlossGsp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_Sk_AttributeGroup getSchlossSk() {
		return schlossSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchlossSk(Schloss_Sk_AttributeGroup newSchlossSk, NotificationChain msgs) {
		Schloss_Sk_AttributeGroup oldSchlossSk = schlossSk;
		schlossSk = newSchlossSk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SK, oldSchlossSk, newSchlossSk);
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
	public void setSchlossSk(Schloss_Sk_AttributeGroup newSchlossSk) {
		if (newSchlossSk != schlossSk) {
			NotificationChain msgs = null;
			if (schlossSk != null)
				msgs = ((InternalEObject)schlossSk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SK, null, msgs);
			if (newSchlossSk != null)
				msgs = ((InternalEObject)newSchlossSk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SK, null, msgs);
			msgs = basicSetSchlossSk(newSchlossSk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SK, newSchlossSk, newSchlossSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_Sonderanlage_AttributeGroup getSchlossSonderanlage() {
		return schlossSonderanlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchlossSonderanlage(Schloss_Sonderanlage_AttributeGroup newSchlossSonderanlage, NotificationChain msgs) {
		Schloss_Sonderanlage_AttributeGroup oldSchlossSonderanlage = schlossSonderanlage;
		schlossSonderanlage = newSchlossSonderanlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SONDERANLAGE, oldSchlossSonderanlage, newSchlossSonderanlage);
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
	public void setSchlossSonderanlage(Schloss_Sonderanlage_AttributeGroup newSchlossSonderanlage) {
		if (newSchlossSonderanlage != schlossSonderanlage) {
			NotificationChain msgs = null;
			if (schlossSonderanlage != null)
				msgs = ((InternalEObject)schlossSonderanlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SONDERANLAGE, null, msgs);
			if (newSchlossSonderanlage != null)
				msgs = ((InternalEObject)newSchlossSonderanlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SONDERANLAGE, null, msgs);
			msgs = basicSetSchlossSonderanlage(newSchlossSonderanlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SONDERANLAGE, newSchlossSonderanlage, newSchlossSonderanlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_Ssp_AttributeGroup getSchlossSsp() {
		return schlossSsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchlossSsp(Schloss_Ssp_AttributeGroup newSchlossSsp, NotificationChain msgs) {
		Schloss_Ssp_AttributeGroup oldSchlossSsp = schlossSsp;
		schlossSsp = newSchlossSsp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SSP, oldSchlossSsp, newSchlossSsp);
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
	public void setSchlossSsp(Schloss_Ssp_AttributeGroup newSchlossSsp) {
		if (newSchlossSsp != schlossSsp) {
			NotificationChain msgs = null;
			if (schlossSsp != null)
				msgs = ((InternalEObject)schlossSsp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SSP, null, msgs);
			if (newSchlossSsp != null)
				msgs = ((InternalEObject)newSchlossSsp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SSP, null, msgs);
			msgs = basicSetSchlossSsp(newSchlossSsp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SSP, newSchlossSsp, newSchlossSsp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_W_AttributeGroup getSchlossW() {
		return schlossW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchlossW(Schloss_W_AttributeGroup newSchlossW, NotificationChain msgs) {
		Schloss_W_AttributeGroup oldSchlossW = schlossW;
		schlossW = newSchlossW;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_W, oldSchlossW, newSchlossW);
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
	public void setSchlossW(Schloss_W_AttributeGroup newSchlossW) {
		if (newSchlossW != schlossW) {
			NotificationChain msgs = null;
			if (schlossW != null)
				msgs = ((InternalEObject)schlossW).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_W, null, msgs);
			if (newSchlossW != null)
				msgs = ((InternalEObject)newSchlossW).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_W, null, msgs);
			msgs = basicSetSchlossW(newSchlossW, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_W, newSchlossW, newSchlossW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technisch_Berechtigter_TypeClass getTechnischBerechtigter() {
		return technischBerechtigter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnischBerechtigter(Technisch_Berechtigter_TypeClass newTechnischBerechtigter, NotificationChain msgs) {
		Technisch_Berechtigter_TypeClass oldTechnischBerechtigter = technischBerechtigter;
		technischBerechtigter = newTechnischBerechtigter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__TECHNISCH_BERECHTIGTER, oldTechnischBerechtigter, newTechnischBerechtigter);
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
	public void setTechnischBerechtigter(Technisch_Berechtigter_TypeClass newTechnischBerechtigter) {
		if (newTechnischBerechtigter != technischBerechtigter) {
			NotificationChain msgs = null;
			if (technischBerechtigter != null)
				msgs = ((InternalEObject)technischBerechtigter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__TECHNISCH_BERECHTIGTER, null, msgs);
			if (newTechnischBerechtigter != null)
				msgs = ((InternalEObject)newTechnischBerechtigter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS__TECHNISCH_BERECHTIGTER, null, msgs);
			msgs = basicSetTechnischBerechtigter(newTechnischBerechtigter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS__TECHNISCH_BERECHTIGTER, newTechnischBerechtigter, newTechnischBerechtigter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLOSS__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS__ID_SCHLUESSEL:
				return basicSetIDSchluessel(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL:
				return basicSetSchluesselInGrdstEingeschl(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_BUE:
				return basicSetSchlossBUE(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_GSP:
				return basicSetSchlossGsp(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SK:
				return basicSetSchlossSk(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SONDERANLAGE:
				return basicSetSchlossSonderanlage(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SSP:
				return basicSetSchlossSsp(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_W:
				return basicSetSchlossW(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS__TECHNISCH_BERECHTIGTER:
				return basicSetTechnischBerechtigter(null, msgs);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS__BEZEICHNUNG:
				return getBezeichnung();
			case SchluesselabhaengigkeitenPackage.SCHLOSS__ID_SCHLUESSEL:
				return getIDSchluessel();
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL:
				return getSchluesselInGrdstEingeschl();
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_BUE:
				return getSchlossBUE();
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_GSP:
				return getSchlossGsp();
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SK:
				return getSchlossSk();
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SONDERANLAGE:
				return getSchlossSonderanlage();
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SSP:
				return getSchlossSsp();
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_W:
				return getSchlossW();
			case SchluesselabhaengigkeitenPackage.SCHLOSS__TECHNISCH_BERECHTIGTER:
				return getTechnischBerechtigter();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS__BEZEICHNUNG:
				setBezeichnung((Schloss_Bezeichnung_AttributeGroup)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__ID_SCHLUESSEL:
				setIDSchluessel((ID_Schluessel_TypeClass)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL:
				setSchluesselInGrdstEingeschl((Schluessel_In_Grdst_Eingeschl_TypeClass)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_BUE:
				setSchlossBUE((Schloss_BUE_AttributeGroup)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_GSP:
				setSchlossGsp((Schloss_Gsp_AttributeGroup)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SK:
				setSchlossSk((Schloss_Sk_AttributeGroup)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SONDERANLAGE:
				setSchlossSonderanlage((Schloss_Sonderanlage_AttributeGroup)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SSP:
				setSchlossSsp((Schloss_Ssp_AttributeGroup)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_W:
				setSchlossW((Schloss_W_AttributeGroup)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__TECHNISCH_BERECHTIGTER:
				setTechnischBerechtigter((Technisch_Berechtigter_TypeClass)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS__BEZEICHNUNG:
				setBezeichnung((Schloss_Bezeichnung_AttributeGroup)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__ID_SCHLUESSEL:
				setIDSchluessel((ID_Schluessel_TypeClass)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL:
				setSchluesselInGrdstEingeschl((Schluessel_In_Grdst_Eingeschl_TypeClass)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_BUE:
				setSchlossBUE((Schloss_BUE_AttributeGroup)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_GSP:
				setSchlossGsp((Schloss_Gsp_AttributeGroup)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SK:
				setSchlossSk((Schloss_Sk_AttributeGroup)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SONDERANLAGE:
				setSchlossSonderanlage((Schloss_Sonderanlage_AttributeGroup)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SSP:
				setSchlossSsp((Schloss_Ssp_AttributeGroup)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_W:
				setSchlossW((Schloss_W_AttributeGroup)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__TECHNISCH_BERECHTIGTER:
				setTechnischBerechtigter((Technisch_Berechtigter_TypeClass)null);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS__BEZEICHNUNG:
				return bezeichnung != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__ID_SCHLUESSEL:
				return iDSchluessel != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL:
				return schluesselInGrdstEingeschl != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_BUE:
				return schlossBUE != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_GSP:
				return schlossGsp != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SK:
				return schlossSk != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SONDERANLAGE:
				return schlossSonderanlage != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SSP:
				return schlossSsp != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_W:
				return schlossW != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS__TECHNISCH_BERECHTIGTER:
				return technischBerechtigter != null;
		}
		return super.eIsSet(featureID);
	}

} //SchlossImpl
