/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.Baulast_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Fahrbahn_Befestigung_Gleis_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Fahrbahn_Befestigung_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Fahrbahn_Breite_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Klassifizierung_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Kreuzungswinkel_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Anlage Strasse Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Strasse_Allg_AttributeGroupImpl#getBaulast <em>Baulast</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Strasse_Allg_AttributeGroupImpl#getFahrbahnBefestigung <em>Fahrbahn Befestigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Strasse_Allg_AttributeGroupImpl#getFahrbahnBefestigungGleis <em>Fahrbahn Befestigung Gleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Strasse_Allg_AttributeGroupImpl#getFahrbahnBreite <em>Fahrbahn Breite</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Strasse_Allg_AttributeGroupImpl#getKlassifizierung <em>Klassifizierung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Strasse_Allg_AttributeGroupImpl#getKreuzungswinkel <em>Kreuzungswinkel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Anlage_Strasse_Allg_AttributeGroupImpl extends EObjectImpl implements BUE_Anlage_Strasse_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBaulast() <em>Baulast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaulast()
	 * @generated
	 * @ordered
	 */
	protected Baulast_TypeClass baulast;

	/**
	 * The cached value of the '{@link #getFahrbahnBefestigung() <em>Fahrbahn Befestigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFahrbahnBefestigung()
	 * @generated
	 * @ordered
	 */
	protected Fahrbahn_Befestigung_TypeClass fahrbahnBefestigung;

	/**
	 * The cached value of the '{@link #getFahrbahnBefestigungGleis() <em>Fahrbahn Befestigung Gleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFahrbahnBefestigungGleis()
	 * @generated
	 * @ordered
	 */
	protected Fahrbahn_Befestigung_Gleis_TypeClass fahrbahnBefestigungGleis;

	/**
	 * The cached value of the '{@link #getFahrbahnBreite() <em>Fahrbahn Breite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFahrbahnBreite()
	 * @generated
	 * @ordered
	 */
	protected Fahrbahn_Breite_TypeClass fahrbahnBreite;

	/**
	 * The cached value of the '{@link #getKlassifizierung() <em>Klassifizierung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKlassifizierung()
	 * @generated
	 * @ordered
	 */
	protected Klassifizierung_TypeClass klassifizierung;

	/**
	 * The cached value of the '{@link #getKreuzungswinkel() <em>Kreuzungswinkel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKreuzungswinkel()
	 * @generated
	 * @ordered
	 */
	protected Kreuzungswinkel_TypeClass kreuzungswinkel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Anlage_Strasse_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Anlage_Strasse_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Baulast_TypeClass getBaulast() {
		return baulast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaulast(Baulast_TypeClass newBaulast, NotificationChain msgs) {
		Baulast_TypeClass oldBaulast = baulast;
		baulast = newBaulast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__BAULAST, oldBaulast, newBaulast);
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
	public void setBaulast(Baulast_TypeClass newBaulast) {
		if (newBaulast != baulast) {
			NotificationChain msgs = null;
			if (baulast != null)
				msgs = ((InternalEObject)baulast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__BAULAST, null, msgs);
			if (newBaulast != null)
				msgs = ((InternalEObject)newBaulast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__BAULAST, null, msgs);
			msgs = basicSetBaulast(newBaulast, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__BAULAST, newBaulast, newBaulast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fahrbahn_Befestigung_TypeClass getFahrbahnBefestigung() {
		return fahrbahnBefestigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFahrbahnBefestigung(Fahrbahn_Befestigung_TypeClass newFahrbahnBefestigung, NotificationChain msgs) {
		Fahrbahn_Befestigung_TypeClass oldFahrbahnBefestigung = fahrbahnBefestigung;
		fahrbahnBefestigung = newFahrbahnBefestigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG, oldFahrbahnBefestigung, newFahrbahnBefestigung);
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
	public void setFahrbahnBefestigung(Fahrbahn_Befestigung_TypeClass newFahrbahnBefestigung) {
		if (newFahrbahnBefestigung != fahrbahnBefestigung) {
			NotificationChain msgs = null;
			if (fahrbahnBefestigung != null)
				msgs = ((InternalEObject)fahrbahnBefestigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG, null, msgs);
			if (newFahrbahnBefestigung != null)
				msgs = ((InternalEObject)newFahrbahnBefestigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG, null, msgs);
			msgs = basicSetFahrbahnBefestigung(newFahrbahnBefestigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG, newFahrbahnBefestigung, newFahrbahnBefestigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fahrbahn_Befestigung_Gleis_TypeClass getFahrbahnBefestigungGleis() {
		return fahrbahnBefestigungGleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFahrbahnBefestigungGleis(Fahrbahn_Befestigung_Gleis_TypeClass newFahrbahnBefestigungGleis, NotificationChain msgs) {
		Fahrbahn_Befestigung_Gleis_TypeClass oldFahrbahnBefestigungGleis = fahrbahnBefestigungGleis;
		fahrbahnBefestigungGleis = newFahrbahnBefestigungGleis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG_GLEIS, oldFahrbahnBefestigungGleis, newFahrbahnBefestigungGleis);
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
	public void setFahrbahnBefestigungGleis(Fahrbahn_Befestigung_Gleis_TypeClass newFahrbahnBefestigungGleis) {
		if (newFahrbahnBefestigungGleis != fahrbahnBefestigungGleis) {
			NotificationChain msgs = null;
			if (fahrbahnBefestigungGleis != null)
				msgs = ((InternalEObject)fahrbahnBefestigungGleis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG_GLEIS, null, msgs);
			if (newFahrbahnBefestigungGleis != null)
				msgs = ((InternalEObject)newFahrbahnBefestigungGleis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG_GLEIS, null, msgs);
			msgs = basicSetFahrbahnBefestigungGleis(newFahrbahnBefestigungGleis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG_GLEIS, newFahrbahnBefestigungGleis, newFahrbahnBefestigungGleis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fahrbahn_Breite_TypeClass getFahrbahnBreite() {
		return fahrbahnBreite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFahrbahnBreite(Fahrbahn_Breite_TypeClass newFahrbahnBreite, NotificationChain msgs) {
		Fahrbahn_Breite_TypeClass oldFahrbahnBreite = fahrbahnBreite;
		fahrbahnBreite = newFahrbahnBreite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BREITE, oldFahrbahnBreite, newFahrbahnBreite);
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
	public void setFahrbahnBreite(Fahrbahn_Breite_TypeClass newFahrbahnBreite) {
		if (newFahrbahnBreite != fahrbahnBreite) {
			NotificationChain msgs = null;
			if (fahrbahnBreite != null)
				msgs = ((InternalEObject)fahrbahnBreite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BREITE, null, msgs);
			if (newFahrbahnBreite != null)
				msgs = ((InternalEObject)newFahrbahnBreite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BREITE, null, msgs);
			msgs = basicSetFahrbahnBreite(newFahrbahnBreite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BREITE, newFahrbahnBreite, newFahrbahnBreite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Klassifizierung_TypeClass getKlassifizierung() {
		return klassifizierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKlassifizierung(Klassifizierung_TypeClass newKlassifizierung, NotificationChain msgs) {
		Klassifizierung_TypeClass oldKlassifizierung = klassifizierung;
		klassifizierung = newKlassifizierung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KLASSIFIZIERUNG, oldKlassifizierung, newKlassifizierung);
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
	public void setKlassifizierung(Klassifizierung_TypeClass newKlassifizierung) {
		if (newKlassifizierung != klassifizierung) {
			NotificationChain msgs = null;
			if (klassifizierung != null)
				msgs = ((InternalEObject)klassifizierung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KLASSIFIZIERUNG, null, msgs);
			if (newKlassifizierung != null)
				msgs = ((InternalEObject)newKlassifizierung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KLASSIFIZIERUNG, null, msgs);
			msgs = basicSetKlassifizierung(newKlassifizierung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KLASSIFIZIERUNG, newKlassifizierung, newKlassifizierung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kreuzungswinkel_TypeClass getKreuzungswinkel() {
		return kreuzungswinkel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKreuzungswinkel(Kreuzungswinkel_TypeClass newKreuzungswinkel, NotificationChain msgs) {
		Kreuzungswinkel_TypeClass oldKreuzungswinkel = kreuzungswinkel;
		kreuzungswinkel = newKreuzungswinkel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KREUZUNGSWINKEL, oldKreuzungswinkel, newKreuzungswinkel);
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
	public void setKreuzungswinkel(Kreuzungswinkel_TypeClass newKreuzungswinkel) {
		if (newKreuzungswinkel != kreuzungswinkel) {
			NotificationChain msgs = null;
			if (kreuzungswinkel != null)
				msgs = ((InternalEObject)kreuzungswinkel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KREUZUNGSWINKEL, null, msgs);
			if (newKreuzungswinkel != null)
				msgs = ((InternalEObject)newKreuzungswinkel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KREUZUNGSWINKEL, null, msgs);
			msgs = basicSetKreuzungswinkel(newKreuzungswinkel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KREUZUNGSWINKEL, newKreuzungswinkel, newKreuzungswinkel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__BAULAST:
				return basicSetBaulast(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG:
				return basicSetFahrbahnBefestigung(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG_GLEIS:
				return basicSetFahrbahnBefestigungGleis(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BREITE:
				return basicSetFahrbahnBreite(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KLASSIFIZIERUNG:
				return basicSetKlassifizierung(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KREUZUNGSWINKEL:
				return basicSetKreuzungswinkel(null, msgs);
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
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__BAULAST:
				return getBaulast();
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG:
				return getFahrbahnBefestigung();
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG_GLEIS:
				return getFahrbahnBefestigungGleis();
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BREITE:
				return getFahrbahnBreite();
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KLASSIFIZIERUNG:
				return getKlassifizierung();
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KREUZUNGSWINKEL:
				return getKreuzungswinkel();
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
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__BAULAST:
				setBaulast((Baulast_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG:
				setFahrbahnBefestigung((Fahrbahn_Befestigung_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG_GLEIS:
				setFahrbahnBefestigungGleis((Fahrbahn_Befestigung_Gleis_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BREITE:
				setFahrbahnBreite((Fahrbahn_Breite_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KLASSIFIZIERUNG:
				setKlassifizierung((Klassifizierung_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KREUZUNGSWINKEL:
				setKreuzungswinkel((Kreuzungswinkel_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__BAULAST:
				setBaulast((Baulast_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG:
				setFahrbahnBefestigung((Fahrbahn_Befestigung_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG_GLEIS:
				setFahrbahnBefestigungGleis((Fahrbahn_Befestigung_Gleis_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BREITE:
				setFahrbahnBreite((Fahrbahn_Breite_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KLASSIFIZIERUNG:
				setKlassifizierung((Klassifizierung_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KREUZUNGSWINKEL:
				setKreuzungswinkel((Kreuzungswinkel_TypeClass)null);
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
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__BAULAST:
				return baulast != null;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG:
				return fahrbahnBefestigung != null;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BEFESTIGUNG_GLEIS:
				return fahrbahnBefestigungGleis != null;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__FAHRBAHN_BREITE:
				return fahrbahnBreite != null;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KLASSIFIZIERUNG:
				return klassifizierung != null;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP__KREUZUNGSWINKEL:
				return kreuzungswinkel != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_Anlage_Strasse_Allg_AttributeGroupImpl
