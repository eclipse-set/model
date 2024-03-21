/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Ortung.FMA_Anlage;
import org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Kaskade_AttributeGroup;
import org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup;
import org.eclipse.set.model.planpro.Ortung.OrtungPackage;

import org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Gleis_Abschnitt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMA Anlage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_AnlageImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_AnlageImpl#getFMAAnlageAllg <em>FMA Anlage Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_AnlageImpl#getFMAAnlageElektrMerkmale <em>FMA Anlage Elektr Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_AnlageImpl#getFMAAnlageKaskade <em>FMA Anlage Kaskade</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_AnlageImpl#getFMAAnlageUebertragungFMinfo <em>FMA Anlage Uebertragung FMinfo</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_AnlageImpl#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_AnlageImpl#getIDGleisfreimeldeInnenanlage <em>ID Gleisfreimelde Innenanlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMA_AnlageImpl extends Basis_ObjektImpl implements FMA_Anlage {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected FMA_Anlage_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getFMAAnlageAllg() <em>FMA Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAAnlageAllg()
	 * @generated
	 * @ordered
	 */
	protected FMA_Anlage_Allg_AttributeGroup fMAAnlageAllg;

	/**
	 * The cached value of the '{@link #getFMAAnlageElektrMerkmale() <em>FMA Anlage Elektr Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAAnlageElektrMerkmale()
	 * @generated
	 * @ordered
	 */
	protected FMA_Anlage_Elektr_Merkmale_AttributeGroup fMAAnlageElektrMerkmale;

	/**
	 * The cached value of the '{@link #getFMAAnlageKaskade() <em>FMA Anlage Kaskade</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAAnlageKaskade()
	 * @generated
	 * @ordered
	 */
	protected FMA_Anlage_Kaskade_AttributeGroup fMAAnlageKaskade;

	/**
	 * The cached value of the '{@link #getFMAAnlageUebertragungFMinfo() <em>FMA Anlage Uebertragung FMinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAAnlageUebertragungFMinfo()
	 * @generated
	 * @ordered
	 */
	protected FMA_Anlage_Uebertragung_FMinfo_AttributeGroup fMAAnlageUebertragungFMinfo;

	/**
	 * The cached value of the '{@link #getIDGleisAbschnitt() <em>ID Gleis Abschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisAbschnitt()
	 * @generated
	 * @ordered
	 */
	protected ID_Gleis_Abschnitt_TypeClass iDGleisAbschnitt;

	/**
	 * The cached value of the '{@link #getIDGleisfreimeldeInnenanlage() <em>ID Gleisfreimelde Innenanlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisfreimeldeInnenanlage()
	 * @generated
	 * @ordered
	 */
	protected ID_Aussenelementansteuerung_TypeClass iDGleisfreimeldeInnenanlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMA_AnlageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.FMA_ANLAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(FMA_Anlage_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		FMA_Anlage_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(FMA_Anlage_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage_Allg_AttributeGroup getFMAAnlageAllg() {
		return fMAAnlageAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAAnlageAllg(FMA_Anlage_Allg_AttributeGroup newFMAAnlageAllg, NotificationChain msgs) {
		FMA_Anlage_Allg_AttributeGroup oldFMAAnlageAllg = fMAAnlageAllg;
		fMAAnlageAllg = newFMAAnlageAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ALLG, oldFMAAnlageAllg, newFMAAnlageAllg);
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
	public void setFMAAnlageAllg(FMA_Anlage_Allg_AttributeGroup newFMAAnlageAllg) {
		if (newFMAAnlageAllg != fMAAnlageAllg) {
			NotificationChain msgs = null;
			if (fMAAnlageAllg != null)
				msgs = ((InternalEObject)fMAAnlageAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ALLG, null, msgs);
			if (newFMAAnlageAllg != null)
				msgs = ((InternalEObject)newFMAAnlageAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ALLG, null, msgs);
			msgs = basicSetFMAAnlageAllg(newFMAAnlageAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ALLG, newFMAAnlageAllg, newFMAAnlageAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage_Elektr_Merkmale_AttributeGroup getFMAAnlageElektrMerkmale() {
		return fMAAnlageElektrMerkmale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAAnlageElektrMerkmale(FMA_Anlage_Elektr_Merkmale_AttributeGroup newFMAAnlageElektrMerkmale, NotificationChain msgs) {
		FMA_Anlage_Elektr_Merkmale_AttributeGroup oldFMAAnlageElektrMerkmale = fMAAnlageElektrMerkmale;
		fMAAnlageElektrMerkmale = newFMAAnlageElektrMerkmale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE, oldFMAAnlageElektrMerkmale, newFMAAnlageElektrMerkmale);
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
	public void setFMAAnlageElektrMerkmale(FMA_Anlage_Elektr_Merkmale_AttributeGroup newFMAAnlageElektrMerkmale) {
		if (newFMAAnlageElektrMerkmale != fMAAnlageElektrMerkmale) {
			NotificationChain msgs = null;
			if (fMAAnlageElektrMerkmale != null)
				msgs = ((InternalEObject)fMAAnlageElektrMerkmale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE, null, msgs);
			if (newFMAAnlageElektrMerkmale != null)
				msgs = ((InternalEObject)newFMAAnlageElektrMerkmale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE, null, msgs);
			msgs = basicSetFMAAnlageElektrMerkmale(newFMAAnlageElektrMerkmale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE, newFMAAnlageElektrMerkmale, newFMAAnlageElektrMerkmale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage_Kaskade_AttributeGroup getFMAAnlageKaskade() {
		return fMAAnlageKaskade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAAnlageKaskade(FMA_Anlage_Kaskade_AttributeGroup newFMAAnlageKaskade, NotificationChain msgs) {
		FMA_Anlage_Kaskade_AttributeGroup oldFMAAnlageKaskade = fMAAnlageKaskade;
		fMAAnlageKaskade = newFMAAnlageKaskade;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_KASKADE, oldFMAAnlageKaskade, newFMAAnlageKaskade);
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
	public void setFMAAnlageKaskade(FMA_Anlage_Kaskade_AttributeGroup newFMAAnlageKaskade) {
		if (newFMAAnlageKaskade != fMAAnlageKaskade) {
			NotificationChain msgs = null;
			if (fMAAnlageKaskade != null)
				msgs = ((InternalEObject)fMAAnlageKaskade).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_KASKADE, null, msgs);
			if (newFMAAnlageKaskade != null)
				msgs = ((InternalEObject)newFMAAnlageKaskade).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_KASKADE, null, msgs);
			msgs = basicSetFMAAnlageKaskade(newFMAAnlageKaskade, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_KASKADE, newFMAAnlageKaskade, newFMAAnlageKaskade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage_Uebertragung_FMinfo_AttributeGroup getFMAAnlageUebertragungFMinfo() {
		return fMAAnlageUebertragungFMinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAAnlageUebertragungFMinfo(FMA_Anlage_Uebertragung_FMinfo_AttributeGroup newFMAAnlageUebertragungFMinfo, NotificationChain msgs) {
		FMA_Anlage_Uebertragung_FMinfo_AttributeGroup oldFMAAnlageUebertragungFMinfo = fMAAnlageUebertragungFMinfo;
		fMAAnlageUebertragungFMinfo = newFMAAnlageUebertragungFMinfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO, oldFMAAnlageUebertragungFMinfo, newFMAAnlageUebertragungFMinfo);
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
	public void setFMAAnlageUebertragungFMinfo(FMA_Anlage_Uebertragung_FMinfo_AttributeGroup newFMAAnlageUebertragungFMinfo) {
		if (newFMAAnlageUebertragungFMinfo != fMAAnlageUebertragungFMinfo) {
			NotificationChain msgs = null;
			if (fMAAnlageUebertragungFMinfo != null)
				msgs = ((InternalEObject)fMAAnlageUebertragungFMinfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO, null, msgs);
			if (newFMAAnlageUebertragungFMinfo != null)
				msgs = ((InternalEObject)newFMAAnlageUebertragungFMinfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO, null, msgs);
			msgs = basicSetFMAAnlageUebertragungFMinfo(newFMAAnlageUebertragungFMinfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO, newFMAAnlageUebertragungFMinfo, newFMAAnlageUebertragungFMinfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Gleis_Abschnitt_TypeClass getIDGleisAbschnitt() {
		return iDGleisAbschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGleisAbschnitt(ID_Gleis_Abschnitt_TypeClass newIDGleisAbschnitt, NotificationChain msgs) {
		ID_Gleis_Abschnitt_TypeClass oldIDGleisAbschnitt = iDGleisAbschnitt;
		iDGleisAbschnitt = newIDGleisAbschnitt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__ID_GLEIS_ABSCHNITT, oldIDGleisAbschnitt, newIDGleisAbschnitt);
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
	public void setIDGleisAbschnitt(ID_Gleis_Abschnitt_TypeClass newIDGleisAbschnitt) {
		if (newIDGleisAbschnitt != iDGleisAbschnitt) {
			NotificationChain msgs = null;
			if (iDGleisAbschnitt != null)
				msgs = ((InternalEObject)iDGleisAbschnitt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__ID_GLEIS_ABSCHNITT, null, msgs);
			if (newIDGleisAbschnitt != null)
				msgs = ((InternalEObject)newIDGleisAbschnitt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__ID_GLEIS_ABSCHNITT, null, msgs);
			msgs = basicSetIDGleisAbschnitt(newIDGleisAbschnitt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__ID_GLEIS_ABSCHNITT, newIDGleisAbschnitt, newIDGleisAbschnitt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Aussenelementansteuerung_TypeClass getIDGleisfreimeldeInnenanlage() {
		return iDGleisfreimeldeInnenanlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGleisfreimeldeInnenanlage(ID_Aussenelementansteuerung_TypeClass newIDGleisfreimeldeInnenanlage, NotificationChain msgs) {
		ID_Aussenelementansteuerung_TypeClass oldIDGleisfreimeldeInnenanlage = iDGleisfreimeldeInnenanlage;
		iDGleisfreimeldeInnenanlage = newIDGleisfreimeldeInnenanlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE, oldIDGleisfreimeldeInnenanlage, newIDGleisfreimeldeInnenanlage);
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
	public void setIDGleisfreimeldeInnenanlage(ID_Aussenelementansteuerung_TypeClass newIDGleisfreimeldeInnenanlage) {
		if (newIDGleisfreimeldeInnenanlage != iDGleisfreimeldeInnenanlage) {
			NotificationChain msgs = null;
			if (iDGleisfreimeldeInnenanlage != null)
				msgs = ((InternalEObject)iDGleisfreimeldeInnenanlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE, null, msgs);
			if (newIDGleisfreimeldeInnenanlage != null)
				msgs = ((InternalEObject)newIDGleisfreimeldeInnenanlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE, null, msgs);
			msgs = basicSetIDGleisfreimeldeInnenanlage(newIDGleisfreimeldeInnenanlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE, newIDGleisfreimeldeInnenanlage, newIDGleisfreimeldeInnenanlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.FMA_ANLAGE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ALLG:
				return basicSetFMAAnlageAllg(null, msgs);
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE:
				return basicSetFMAAnlageElektrMerkmale(null, msgs);
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_KASKADE:
				return basicSetFMAAnlageKaskade(null, msgs);
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO:
				return basicSetFMAAnlageUebertragungFMinfo(null, msgs);
			case OrtungPackage.FMA_ANLAGE__ID_GLEIS_ABSCHNITT:
				return basicSetIDGleisAbschnitt(null, msgs);
			case OrtungPackage.FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE:
				return basicSetIDGleisfreimeldeInnenanlage(null, msgs);
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
			case OrtungPackage.FMA_ANLAGE__BEZEICHNUNG:
				return getBezeichnung();
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ALLG:
				return getFMAAnlageAllg();
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE:
				return getFMAAnlageElektrMerkmale();
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_KASKADE:
				return getFMAAnlageKaskade();
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO:
				return getFMAAnlageUebertragungFMinfo();
			case OrtungPackage.FMA_ANLAGE__ID_GLEIS_ABSCHNITT:
				return getIDGleisAbschnitt();
			case OrtungPackage.FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE:
				return getIDGleisfreimeldeInnenanlage();
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
			case OrtungPackage.FMA_ANLAGE__BEZEICHNUNG:
				setBezeichnung((FMA_Anlage_Bezeichnung_AttributeGroup)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ALLG:
				setFMAAnlageAllg((FMA_Anlage_Allg_AttributeGroup)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE:
				setFMAAnlageElektrMerkmale((FMA_Anlage_Elektr_Merkmale_AttributeGroup)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_KASKADE:
				setFMAAnlageKaskade((FMA_Anlage_Kaskade_AttributeGroup)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO:
				setFMAAnlageUebertragungFMinfo((FMA_Anlage_Uebertragung_FMinfo_AttributeGroup)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE__ID_GLEIS_ABSCHNITT:
				setIDGleisAbschnitt((ID_Gleis_Abschnitt_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE:
				setIDGleisfreimeldeInnenanlage((ID_Aussenelementansteuerung_TypeClass)newValue);
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
			case OrtungPackage.FMA_ANLAGE__BEZEICHNUNG:
				setBezeichnung((FMA_Anlage_Bezeichnung_AttributeGroup)null);
				return;
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ALLG:
				setFMAAnlageAllg((FMA_Anlage_Allg_AttributeGroup)null);
				return;
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE:
				setFMAAnlageElektrMerkmale((FMA_Anlage_Elektr_Merkmale_AttributeGroup)null);
				return;
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_KASKADE:
				setFMAAnlageKaskade((FMA_Anlage_Kaskade_AttributeGroup)null);
				return;
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO:
				setFMAAnlageUebertragungFMinfo((FMA_Anlage_Uebertragung_FMinfo_AttributeGroup)null);
				return;
			case OrtungPackage.FMA_ANLAGE__ID_GLEIS_ABSCHNITT:
				setIDGleisAbschnitt((ID_Gleis_Abschnitt_TypeClass)null);
				return;
			case OrtungPackage.FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE:
				setIDGleisfreimeldeInnenanlage((ID_Aussenelementansteuerung_TypeClass)null);
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
			case OrtungPackage.FMA_ANLAGE__BEZEICHNUNG:
				return bezeichnung != null;
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ALLG:
				return fMAAnlageAllg != null;
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE:
				return fMAAnlageElektrMerkmale != null;
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_KASKADE:
				return fMAAnlageKaskade != null;
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO:
				return fMAAnlageUebertragungFMinfo != null;
			case OrtungPackage.FMA_ANLAGE__ID_GLEIS_ABSCHNITT:
				return iDGleisAbschnitt != null;
			case OrtungPackage.FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE:
				return iDGleisfreimeldeInnenanlage != null;
		}
		return super.eIsSet(featureID);
	}

} //FMA_AnlageImpl
