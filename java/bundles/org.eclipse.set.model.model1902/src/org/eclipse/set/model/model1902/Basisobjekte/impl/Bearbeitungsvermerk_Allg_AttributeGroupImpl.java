/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Basisobjekte.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.model.model1902.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Basisobjekte.Bearbeitungsvermerk_Kennung_TypeClass;
import org.eclipse.set.model.model1902.Basisobjekte.Bearbeitungsvermerk_Rolle_TypeClass;
import org.eclipse.set.model.model1902.Basisobjekte.Bestandsrelevanz_TypeClass;
import org.eclipse.set.model.model1902.Basisobjekte.Kommentar_TypeClass;
import org.eclipse.set.model.model1902.Basisobjekte.Kurztext_TypeClass;
import org.eclipse.set.model.model1902.Basisobjekte.Zeit_Bearbeitungsvermerk_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bearbeitungsvermerk Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl#getBearbeitungsvermerkKennung <em>Bearbeitungsvermerk Kennung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl#getBearbeitungsvermerkRolle <em>Bearbeitungsvermerk Rolle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl#getBestandsrelevanz <em>Bestandsrelevanz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl#getKommentar <em>Kommentar</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl#getKurztext <em>Kurztext</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl#getZeitBearbeitungsvermerk <em>Zeit Bearbeitungsvermerk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bearbeitungsvermerk_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Bearbeitungsvermerk_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBearbeitungsvermerkKennung() <em>Bearbeitungsvermerk Kennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeitungsvermerkKennung()
	 * @generated
	 * @ordered
	 */
	protected Bearbeitungsvermerk_Kennung_TypeClass bearbeitungsvermerkKennung;

	/**
	 * The cached value of the '{@link #getBearbeitungsvermerkRolle() <em>Bearbeitungsvermerk Rolle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeitungsvermerkRolle()
	 * @generated
	 * @ordered
	 */
	protected Bearbeitungsvermerk_Rolle_TypeClass bearbeitungsvermerkRolle;

	/**
	 * The cached value of the '{@link #getBestandsrelevanz() <em>Bestandsrelevanz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestandsrelevanz()
	 * @generated
	 * @ordered
	 */
	protected Bestandsrelevanz_TypeClass bestandsrelevanz;

	/**
	 * The cached value of the '{@link #getKommentar() <em>Kommentar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommentar()
	 * @generated
	 * @ordered
	 */
	protected Kommentar_TypeClass kommentar;

	/**
	 * The cached value of the '{@link #getKurztext() <em>Kurztext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKurztext()
	 * @generated
	 * @ordered
	 */
	protected Kurztext_TypeClass kurztext;

	/**
	 * The cached value of the '{@link #getZeitBearbeitungsvermerk() <em>Zeit Bearbeitungsvermerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitBearbeitungsvermerk()
	 * @generated
	 * @ordered
	 */
	protected Zeit_Bearbeitungsvermerk_TypeClass zeitBearbeitungsvermerk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bearbeitungsvermerk_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bearbeitungsvermerk_Kennung_TypeClass getBearbeitungsvermerkKennung() {
		return bearbeitungsvermerkKennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBearbeitungsvermerkKennung(Bearbeitungsvermerk_Kennung_TypeClass newBearbeitungsvermerkKennung, NotificationChain msgs) {
		Bearbeitungsvermerk_Kennung_TypeClass oldBearbeitungsvermerkKennung = bearbeitungsvermerkKennung;
		bearbeitungsvermerkKennung = newBearbeitungsvermerkKennung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_KENNUNG, oldBearbeitungsvermerkKennung, newBearbeitungsvermerkKennung);
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
	public void setBearbeitungsvermerkKennung(Bearbeitungsvermerk_Kennung_TypeClass newBearbeitungsvermerkKennung) {
		if (newBearbeitungsvermerkKennung != bearbeitungsvermerkKennung) {
			NotificationChain msgs = null;
			if (bearbeitungsvermerkKennung != null)
				msgs = ((InternalEObject)bearbeitungsvermerkKennung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_KENNUNG, null, msgs);
			if (newBearbeitungsvermerkKennung != null)
				msgs = ((InternalEObject)newBearbeitungsvermerkKennung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_KENNUNG, null, msgs);
			msgs = basicSetBearbeitungsvermerkKennung(newBearbeitungsvermerkKennung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_KENNUNG, newBearbeitungsvermerkKennung, newBearbeitungsvermerkKennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bearbeitungsvermerk_Rolle_TypeClass getBearbeitungsvermerkRolle() {
		return bearbeitungsvermerkRolle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBearbeitungsvermerkRolle(Bearbeitungsvermerk_Rolle_TypeClass newBearbeitungsvermerkRolle, NotificationChain msgs) {
		Bearbeitungsvermerk_Rolle_TypeClass oldBearbeitungsvermerkRolle = bearbeitungsvermerkRolle;
		bearbeitungsvermerkRolle = newBearbeitungsvermerkRolle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE, oldBearbeitungsvermerkRolle, newBearbeitungsvermerkRolle);
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
	public void setBearbeitungsvermerkRolle(Bearbeitungsvermerk_Rolle_TypeClass newBearbeitungsvermerkRolle) {
		if (newBearbeitungsvermerkRolle != bearbeitungsvermerkRolle) {
			NotificationChain msgs = null;
			if (bearbeitungsvermerkRolle != null)
				msgs = ((InternalEObject)bearbeitungsvermerkRolle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE, null, msgs);
			if (newBearbeitungsvermerkRolle != null)
				msgs = ((InternalEObject)newBearbeitungsvermerkRolle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE, null, msgs);
			msgs = basicSetBearbeitungsvermerkRolle(newBearbeitungsvermerkRolle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE, newBearbeitungsvermerkRolle, newBearbeitungsvermerkRolle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bestandsrelevanz_TypeClass getBestandsrelevanz() {
		return bestandsrelevanz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBestandsrelevanz(Bestandsrelevanz_TypeClass newBestandsrelevanz, NotificationChain msgs) {
		Bestandsrelevanz_TypeClass oldBestandsrelevanz = bestandsrelevanz;
		bestandsrelevanz = newBestandsrelevanz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ, oldBestandsrelevanz, newBestandsrelevanz);
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
	public void setBestandsrelevanz(Bestandsrelevanz_TypeClass newBestandsrelevanz) {
		if (newBestandsrelevanz != bestandsrelevanz) {
			NotificationChain msgs = null;
			if (bestandsrelevanz != null)
				msgs = ((InternalEObject)bestandsrelevanz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ, null, msgs);
			if (newBestandsrelevanz != null)
				msgs = ((InternalEObject)newBestandsrelevanz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ, null, msgs);
			msgs = basicSetBestandsrelevanz(newBestandsrelevanz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ, newBestandsrelevanz, newBestandsrelevanz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kommentar_TypeClass getKommentar() {
		return kommentar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKommentar(Kommentar_TypeClass newKommentar, NotificationChain msgs) {
		Kommentar_TypeClass oldKommentar = kommentar;
		kommentar = newKommentar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KOMMENTAR, oldKommentar, newKommentar);
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
	public void setKommentar(Kommentar_TypeClass newKommentar) {
		if (newKommentar != kommentar) {
			NotificationChain msgs = null;
			if (kommentar != null)
				msgs = ((InternalEObject)kommentar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KOMMENTAR, null, msgs);
			if (newKommentar != null)
				msgs = ((InternalEObject)newKommentar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KOMMENTAR, null, msgs);
			msgs = basicSetKommentar(newKommentar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KOMMENTAR, newKommentar, newKommentar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kurztext_TypeClass getKurztext() {
		return kurztext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKurztext(Kurztext_TypeClass newKurztext, NotificationChain msgs) {
		Kurztext_TypeClass oldKurztext = kurztext;
		kurztext = newKurztext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KURZTEXT, oldKurztext, newKurztext);
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
	public void setKurztext(Kurztext_TypeClass newKurztext) {
		if (newKurztext != kurztext) {
			NotificationChain msgs = null;
			if (kurztext != null)
				msgs = ((InternalEObject)kurztext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KURZTEXT, null, msgs);
			if (newKurztext != null)
				msgs = ((InternalEObject)newKurztext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KURZTEXT, null, msgs);
			msgs = basicSetKurztext(newKurztext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KURZTEXT, newKurztext, newKurztext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zeit_Bearbeitungsvermerk_TypeClass getZeitBearbeitungsvermerk() {
		return zeitBearbeitungsvermerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZeitBearbeitungsvermerk(Zeit_Bearbeitungsvermerk_TypeClass newZeitBearbeitungsvermerk, NotificationChain msgs) {
		Zeit_Bearbeitungsvermerk_TypeClass oldZeitBearbeitungsvermerk = zeitBearbeitungsvermerk;
		zeitBearbeitungsvermerk = newZeitBearbeitungsvermerk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__ZEIT_BEARBEITUNGSVERMERK, oldZeitBearbeitungsvermerk, newZeitBearbeitungsvermerk);
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
	public void setZeitBearbeitungsvermerk(Zeit_Bearbeitungsvermerk_TypeClass newZeitBearbeitungsvermerk) {
		if (newZeitBearbeitungsvermerk != zeitBearbeitungsvermerk) {
			NotificationChain msgs = null;
			if (zeitBearbeitungsvermerk != null)
				msgs = ((InternalEObject)zeitBearbeitungsvermerk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__ZEIT_BEARBEITUNGSVERMERK, null, msgs);
			if (newZeitBearbeitungsvermerk != null)
				msgs = ((InternalEObject)newZeitBearbeitungsvermerk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__ZEIT_BEARBEITUNGSVERMERK, null, msgs);
			msgs = basicSetZeitBearbeitungsvermerk(newZeitBearbeitungsvermerk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__ZEIT_BEARBEITUNGSVERMERK, newZeitBearbeitungsvermerk, newZeitBearbeitungsvermerk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_KENNUNG:
				return basicSetBearbeitungsvermerkKennung(null, msgs);
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE:
				return basicSetBearbeitungsvermerkRolle(null, msgs);
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ:
				return basicSetBestandsrelevanz(null, msgs);
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KOMMENTAR:
				return basicSetKommentar(null, msgs);
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KURZTEXT:
				return basicSetKurztext(null, msgs);
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__ZEIT_BEARBEITUNGSVERMERK:
				return basicSetZeitBearbeitungsvermerk(null, msgs);
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_KENNUNG:
				return getBearbeitungsvermerkKennung();
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE:
				return getBearbeitungsvermerkRolle();
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ:
				return getBestandsrelevanz();
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KOMMENTAR:
				return getKommentar();
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KURZTEXT:
				return getKurztext();
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__ZEIT_BEARBEITUNGSVERMERK:
				return getZeitBearbeitungsvermerk();
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_KENNUNG:
				setBearbeitungsvermerkKennung((Bearbeitungsvermerk_Kennung_TypeClass)newValue);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE:
				setBearbeitungsvermerkRolle((Bearbeitungsvermerk_Rolle_TypeClass)newValue);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ:
				setBestandsrelevanz((Bestandsrelevanz_TypeClass)newValue);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KOMMENTAR:
				setKommentar((Kommentar_TypeClass)newValue);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KURZTEXT:
				setKurztext((Kurztext_TypeClass)newValue);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__ZEIT_BEARBEITUNGSVERMERK:
				setZeitBearbeitungsvermerk((Zeit_Bearbeitungsvermerk_TypeClass)newValue);
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_KENNUNG:
				setBearbeitungsvermerkKennung((Bearbeitungsvermerk_Kennung_TypeClass)null);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE:
				setBearbeitungsvermerkRolle((Bearbeitungsvermerk_Rolle_TypeClass)null);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ:
				setBestandsrelevanz((Bestandsrelevanz_TypeClass)null);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KOMMENTAR:
				setKommentar((Kommentar_TypeClass)null);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KURZTEXT:
				setKurztext((Kurztext_TypeClass)null);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__ZEIT_BEARBEITUNGSVERMERK:
				setZeitBearbeitungsvermerk((Zeit_Bearbeitungsvermerk_TypeClass)null);
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_KENNUNG:
				return bearbeitungsvermerkKennung != null;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE:
				return bearbeitungsvermerkRolle != null;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ:
				return bestandsrelevanz != null;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KOMMENTAR:
				return kommentar != null;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KURZTEXT:
				return kurztext != null;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__ZEIT_BEARBEITUNGSVERMERK:
				return zeitBearbeitungsvermerk != null;
		}
		return super.eIsSet(featureID);
	}

} //Bearbeitungsvermerk_Allg_AttributeGroupImpl
