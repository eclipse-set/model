/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte.impl;

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

import org.eclipse.set.model.planpro.Basisobjekte.BV_Darstellung_In_Plan_TypeClass;
import org.eclipse.set.model.planpro.Basisobjekte.BV_Kategorie_TypeClass;
import org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Rolle_TypeClass;
import org.eclipse.set.model.planpro.Basisobjekte.Bestandsrelevanz_TypeClass;
import org.eclipse.set.model.planpro.Basisobjekte.Kommentar_TypeClass;
import org.eclipse.set.model.planpro.Basisobjekte.Kurztext_TypeClass;
import org.eclipse.set.model.planpro.Basisobjekte.Zeit_Bearbeitungsvermerk_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bearbeitungsvermerk Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl#getBearbeitungsvermerkRolle <em>Bearbeitungsvermerk Rolle</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl#getBestandsrelevanz <em>Bestandsrelevanz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl#getBVDarstellungInPlan <em>BV Darstellung In Plan</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl#getBVKategorie <em>BV Kategorie</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl#getKommentar <em>Kommentar</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl#getKurztext <em>Kurztext</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Bearbeitungsvermerk_Allg_AttributeGroupImpl#getZeitBearbeitungsvermerk <em>Zeit Bearbeitungsvermerk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bearbeitungsvermerk_Allg_AttributeGroupImpl extends EObjectImpl implements Bearbeitungsvermerk_Allg_AttributeGroup {
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
	 * The cached value of the '{@link #getBVDarstellungInPlan() <em>BV Darstellung In Plan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBVDarstellungInPlan()
	 * @generated
	 * @ordered
	 */
	protected EList<BV_Darstellung_In_Plan_TypeClass> bVDarstellungInPlan;

	/**
	 * The cached value of the '{@link #getBVKategorie() <em>BV Kategorie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBVKategorie()
	 * @generated
	 * @ordered
	 */
	protected BV_Kategorie_TypeClass bVKategorie;

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
	public EList<BV_Darstellung_In_Plan_TypeClass> getBVDarstellungInPlan() {
		if (bVDarstellungInPlan == null) {
			bVDarstellungInPlan = new EObjectContainmentEList<BV_Darstellung_In_Plan_TypeClass>(BV_Darstellung_In_Plan_TypeClass.class, this, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_DARSTELLUNG_IN_PLAN);
		}
		return bVDarstellungInPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BV_Kategorie_TypeClass getBVKategorie() {
		return bVKategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBVKategorie(BV_Kategorie_TypeClass newBVKategorie, NotificationChain msgs) {
		BV_Kategorie_TypeClass oldBVKategorie = bVKategorie;
		bVKategorie = newBVKategorie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_KATEGORIE, oldBVKategorie, newBVKategorie);
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
	public void setBVKategorie(BV_Kategorie_TypeClass newBVKategorie) {
		if (newBVKategorie != bVKategorie) {
			NotificationChain msgs = null;
			if (bVKategorie != null)
				msgs = ((InternalEObject)bVKategorie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_KATEGORIE, null, msgs);
			if (newBVKategorie != null)
				msgs = ((InternalEObject)newBVKategorie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_KATEGORIE, null, msgs);
			msgs = basicSetBVKategorie(newBVKategorie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_KATEGORIE, newBVKategorie, newBVKategorie));
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE:
				return basicSetBearbeitungsvermerkRolle(null, msgs);
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ:
				return basicSetBestandsrelevanz(null, msgs);
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_DARSTELLUNG_IN_PLAN:
				return ((InternalEList<?>)getBVDarstellungInPlan()).basicRemove(otherEnd, msgs);
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_KATEGORIE:
				return basicSetBVKategorie(null, msgs);
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE:
				return getBearbeitungsvermerkRolle();
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ:
				return getBestandsrelevanz();
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_DARSTELLUNG_IN_PLAN:
				return getBVDarstellungInPlan();
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_KATEGORIE:
				return getBVKategorie();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE:
				setBearbeitungsvermerkRolle((Bearbeitungsvermerk_Rolle_TypeClass)newValue);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ:
				setBestandsrelevanz((Bestandsrelevanz_TypeClass)newValue);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_DARSTELLUNG_IN_PLAN:
				getBVDarstellungInPlan().clear();
				getBVDarstellungInPlan().addAll((Collection<? extends BV_Darstellung_In_Plan_TypeClass>)newValue);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_KATEGORIE:
				setBVKategorie((BV_Kategorie_TypeClass)newValue);
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE:
				setBearbeitungsvermerkRolle((Bearbeitungsvermerk_Rolle_TypeClass)null);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ:
				setBestandsrelevanz((Bestandsrelevanz_TypeClass)null);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_DARSTELLUNG_IN_PLAN:
				getBVDarstellungInPlan().clear();
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_KATEGORIE:
				setBVKategorie((BV_Kategorie_TypeClass)null);
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE:
				return bearbeitungsvermerkRolle != null;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ:
				return bestandsrelevanz != null;
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_DARSTELLUNG_IN_PLAN:
				return bVDarstellungInPlan != null && !bVDarstellungInPlan.isEmpty();
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_KATEGORIE:
				return bVKategorie != null;
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
