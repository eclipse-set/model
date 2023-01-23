/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PZB.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.PZB.GUE_Abstand_Abweichend_TypeClass;
import org.eclipse.set.model.model11001.PZB.GUE_Anordnung_TypeClass;
import org.eclipse.set.model.model11001.PZB.GUE_Bauart_TypeClass;
import org.eclipse.set.model.model11001.PZB.GUE_Energieversorgung_TypeClass;
import org.eclipse.set.model.model11001.PZB.GUE_Messstrecke_TypeClass;
import org.eclipse.set.model.model11001.PZB.Messfehler_TypeClass;
import org.eclipse.set.model.model11001.PZB.PZBPackage;
import org.eclipse.set.model.model11001.PZB.PZB_Element_GUE_AttributeGroup;
import org.eclipse.set.model.model11001.PZB.Pruefgeschwindigkeit_TypeClass;
import org.eclipse.set.model.model11001.PZB.Pruefzeit_TypeClass;

import org.eclipse.set.model.model11001.Verweise.ID_PZB_Element_Mitnutzung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element GUE Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_GUE_AttributeGroupImpl#getGUEAbstandAbweichend <em>GUE Abstand Abweichend</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_GUE_AttributeGroupImpl#getGUEAnordnung <em>GUE Anordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_GUE_AttributeGroupImpl#getGUEBauart <em>GUE Bauart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_GUE_AttributeGroupImpl#getGUEEnergieversorgung <em>GUE Energieversorgung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_GUE_AttributeGroupImpl#getGUEMessstrecke <em>GUE Messstrecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_GUE_AttributeGroupImpl#getIDPZBElementMitnutzung <em>IDPZB Element Mitnutzung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_GUE_AttributeGroupImpl#getMessfehler <em>Messfehler</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_GUE_AttributeGroupImpl#getPruefgeschwindigkeit <em>Pruefgeschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_GUE_AttributeGroupImpl#getPruefzeit <em>Pruefzeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Element_GUE_AttributeGroupImpl extends EObjectImpl implements PZB_Element_GUE_AttributeGroup {
	/**
	 * The cached value of the '{@link #getGUEAbstandAbweichend() <em>GUE Abstand Abweichend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUEAbstandAbweichend()
	 * @generated
	 * @ordered
	 */
	protected GUE_Abstand_Abweichend_TypeClass gUEAbstandAbweichend;

	/**
	 * The cached value of the '{@link #getGUEAnordnung() <em>GUE Anordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUEAnordnung()
	 * @generated
	 * @ordered
	 */
	protected GUE_Anordnung_TypeClass gUEAnordnung;

	/**
	 * The cached value of the '{@link #getGUEBauart() <em>GUE Bauart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUEBauart()
	 * @generated
	 * @ordered
	 */
	protected GUE_Bauart_TypeClass gUEBauart;

	/**
	 * The cached value of the '{@link #getGUEEnergieversorgung() <em>GUE Energieversorgung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUEEnergieversorgung()
	 * @generated
	 * @ordered
	 */
	protected GUE_Energieversorgung_TypeClass gUEEnergieversorgung;

	/**
	 * The cached value of the '{@link #getGUEMessstrecke() <em>GUE Messstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUEMessstrecke()
	 * @generated
	 * @ordered
	 */
	protected GUE_Messstrecke_TypeClass gUEMessstrecke;

	/**
	 * The cached value of the '{@link #getIDPZBElementMitnutzung() <em>IDPZB Element Mitnutzung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDPZBElementMitnutzung()
	 * @generated
	 * @ordered
	 */
	protected ID_PZB_Element_Mitnutzung_TypeClass iDPZBElementMitnutzung;

	/**
	 * The cached value of the '{@link #getMessfehler() <em>Messfehler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessfehler()
	 * @generated
	 * @ordered
	 */
	protected Messfehler_TypeClass messfehler;

	/**
	 * The cached value of the '{@link #getPruefgeschwindigkeit() <em>Pruefgeschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefgeschwindigkeit()
	 * @generated
	 * @ordered
	 */
	protected Pruefgeschwindigkeit_TypeClass pruefgeschwindigkeit;

	/**
	 * The cached value of the '{@link #getPruefzeit() <em>Pruefzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefzeit()
	 * @generated
	 * @ordered
	 */
	protected Pruefzeit_TypeClass pruefzeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_GUE_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GUE_Abstand_Abweichend_TypeClass getGUEAbstandAbweichend() {
		return gUEAbstandAbweichend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGUEAbstandAbweichend(GUE_Abstand_Abweichend_TypeClass newGUEAbstandAbweichend, NotificationChain msgs) {
		GUE_Abstand_Abweichend_TypeClass oldGUEAbstandAbweichend = gUEAbstandAbweichend;
		gUEAbstandAbweichend = newGUEAbstandAbweichend;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ABSTAND_ABWEICHEND, oldGUEAbstandAbweichend, newGUEAbstandAbweichend);
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
	public void setGUEAbstandAbweichend(GUE_Abstand_Abweichend_TypeClass newGUEAbstandAbweichend) {
		if (newGUEAbstandAbweichend != gUEAbstandAbweichend) {
			NotificationChain msgs = null;
			if (gUEAbstandAbweichend != null)
				msgs = ((InternalEObject)gUEAbstandAbweichend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ABSTAND_ABWEICHEND, null, msgs);
			if (newGUEAbstandAbweichend != null)
				msgs = ((InternalEObject)newGUEAbstandAbweichend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ABSTAND_ABWEICHEND, null, msgs);
			msgs = basicSetGUEAbstandAbweichend(newGUEAbstandAbweichend, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ABSTAND_ABWEICHEND, newGUEAbstandAbweichend, newGUEAbstandAbweichend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GUE_Anordnung_TypeClass getGUEAnordnung() {
		return gUEAnordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGUEAnordnung(GUE_Anordnung_TypeClass newGUEAnordnung, NotificationChain msgs) {
		GUE_Anordnung_TypeClass oldGUEAnordnung = gUEAnordnung;
		gUEAnordnung = newGUEAnordnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ANORDNUNG, oldGUEAnordnung, newGUEAnordnung);
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
	public void setGUEAnordnung(GUE_Anordnung_TypeClass newGUEAnordnung) {
		if (newGUEAnordnung != gUEAnordnung) {
			NotificationChain msgs = null;
			if (gUEAnordnung != null)
				msgs = ((InternalEObject)gUEAnordnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ANORDNUNG, null, msgs);
			if (newGUEAnordnung != null)
				msgs = ((InternalEObject)newGUEAnordnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ANORDNUNG, null, msgs);
			msgs = basicSetGUEAnordnung(newGUEAnordnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ANORDNUNG, newGUEAnordnung, newGUEAnordnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GUE_Bauart_TypeClass getGUEBauart() {
		return gUEBauart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGUEBauart(GUE_Bauart_TypeClass newGUEBauart, NotificationChain msgs) {
		GUE_Bauart_TypeClass oldGUEBauart = gUEBauart;
		gUEBauart = newGUEBauart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_BAUART, oldGUEBauart, newGUEBauart);
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
	public void setGUEBauart(GUE_Bauart_TypeClass newGUEBauart) {
		if (newGUEBauart != gUEBauart) {
			NotificationChain msgs = null;
			if (gUEBauart != null)
				msgs = ((InternalEObject)gUEBauart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_BAUART, null, msgs);
			if (newGUEBauart != null)
				msgs = ((InternalEObject)newGUEBauart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_BAUART, null, msgs);
			msgs = basicSetGUEBauart(newGUEBauart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_BAUART, newGUEBauart, newGUEBauart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GUE_Energieversorgung_TypeClass getGUEEnergieversorgung() {
		return gUEEnergieversorgung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGUEEnergieversorgung(GUE_Energieversorgung_TypeClass newGUEEnergieversorgung, NotificationChain msgs) {
		GUE_Energieversorgung_TypeClass oldGUEEnergieversorgung = gUEEnergieversorgung;
		gUEEnergieversorgung = newGUEEnergieversorgung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ENERGIEVERSORGUNG, oldGUEEnergieversorgung, newGUEEnergieversorgung);
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
	public void setGUEEnergieversorgung(GUE_Energieversorgung_TypeClass newGUEEnergieversorgung) {
		if (newGUEEnergieversorgung != gUEEnergieversorgung) {
			NotificationChain msgs = null;
			if (gUEEnergieversorgung != null)
				msgs = ((InternalEObject)gUEEnergieversorgung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ENERGIEVERSORGUNG, null, msgs);
			if (newGUEEnergieversorgung != null)
				msgs = ((InternalEObject)newGUEEnergieversorgung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ENERGIEVERSORGUNG, null, msgs);
			msgs = basicSetGUEEnergieversorgung(newGUEEnergieversorgung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ENERGIEVERSORGUNG, newGUEEnergieversorgung, newGUEEnergieversorgung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GUE_Messstrecke_TypeClass getGUEMessstrecke() {
		return gUEMessstrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGUEMessstrecke(GUE_Messstrecke_TypeClass newGUEMessstrecke, NotificationChain msgs) {
		GUE_Messstrecke_TypeClass oldGUEMessstrecke = gUEMessstrecke;
		gUEMessstrecke = newGUEMessstrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_MESSSTRECKE, oldGUEMessstrecke, newGUEMessstrecke);
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
	public void setGUEMessstrecke(GUE_Messstrecke_TypeClass newGUEMessstrecke) {
		if (newGUEMessstrecke != gUEMessstrecke) {
			NotificationChain msgs = null;
			if (gUEMessstrecke != null)
				msgs = ((InternalEObject)gUEMessstrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_MESSSTRECKE, null, msgs);
			if (newGUEMessstrecke != null)
				msgs = ((InternalEObject)newGUEMessstrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_MESSSTRECKE, null, msgs);
			msgs = basicSetGUEMessstrecke(newGUEMessstrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_MESSSTRECKE, newGUEMessstrecke, newGUEMessstrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_PZB_Element_Mitnutzung_TypeClass getIDPZBElementMitnutzung() {
		return iDPZBElementMitnutzung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDPZBElementMitnutzung(ID_PZB_Element_Mitnutzung_TypeClass newIDPZBElementMitnutzung, NotificationChain msgs) {
		ID_PZB_Element_Mitnutzung_TypeClass oldIDPZBElementMitnutzung = iDPZBElementMitnutzung;
		iDPZBElementMitnutzung = newIDPZBElementMitnutzung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__IDPZB_ELEMENT_MITNUTZUNG, oldIDPZBElementMitnutzung, newIDPZBElementMitnutzung);
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
	public void setIDPZBElementMitnutzung(ID_PZB_Element_Mitnutzung_TypeClass newIDPZBElementMitnutzung) {
		if (newIDPZBElementMitnutzung != iDPZBElementMitnutzung) {
			NotificationChain msgs = null;
			if (iDPZBElementMitnutzung != null)
				msgs = ((InternalEObject)iDPZBElementMitnutzung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__IDPZB_ELEMENT_MITNUTZUNG, null, msgs);
			if (newIDPZBElementMitnutzung != null)
				msgs = ((InternalEObject)newIDPZBElementMitnutzung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__IDPZB_ELEMENT_MITNUTZUNG, null, msgs);
			msgs = basicSetIDPZBElementMitnutzung(newIDPZBElementMitnutzung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__IDPZB_ELEMENT_MITNUTZUNG, newIDPZBElementMitnutzung, newIDPZBElementMitnutzung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Messfehler_TypeClass getMessfehler() {
		return messfehler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessfehler(Messfehler_TypeClass newMessfehler, NotificationChain msgs) {
		Messfehler_TypeClass oldMessfehler = messfehler;
		messfehler = newMessfehler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__MESSFEHLER, oldMessfehler, newMessfehler);
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
	public void setMessfehler(Messfehler_TypeClass newMessfehler) {
		if (newMessfehler != messfehler) {
			NotificationChain msgs = null;
			if (messfehler != null)
				msgs = ((InternalEObject)messfehler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__MESSFEHLER, null, msgs);
			if (newMessfehler != null)
				msgs = ((InternalEObject)newMessfehler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__MESSFEHLER, null, msgs);
			msgs = basicSetMessfehler(newMessfehler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__MESSFEHLER, newMessfehler, newMessfehler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefgeschwindigkeit_TypeClass getPruefgeschwindigkeit() {
		return pruefgeschwindigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPruefgeschwindigkeit(Pruefgeschwindigkeit_TypeClass newPruefgeschwindigkeit, NotificationChain msgs) {
		Pruefgeschwindigkeit_TypeClass oldPruefgeschwindigkeit = pruefgeschwindigkeit;
		pruefgeschwindigkeit = newPruefgeschwindigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFGESCHWINDIGKEIT, oldPruefgeschwindigkeit, newPruefgeschwindigkeit);
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
	public void setPruefgeschwindigkeit(Pruefgeschwindigkeit_TypeClass newPruefgeschwindigkeit) {
		if (newPruefgeschwindigkeit != pruefgeschwindigkeit) {
			NotificationChain msgs = null;
			if (pruefgeschwindigkeit != null)
				msgs = ((InternalEObject)pruefgeschwindigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFGESCHWINDIGKEIT, null, msgs);
			if (newPruefgeschwindigkeit != null)
				msgs = ((InternalEObject)newPruefgeschwindigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFGESCHWINDIGKEIT, null, msgs);
			msgs = basicSetPruefgeschwindigkeit(newPruefgeschwindigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFGESCHWINDIGKEIT, newPruefgeschwindigkeit, newPruefgeschwindigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefzeit_TypeClass getPruefzeit() {
		return pruefzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPruefzeit(Pruefzeit_TypeClass newPruefzeit, NotificationChain msgs) {
		Pruefzeit_TypeClass oldPruefzeit = pruefzeit;
		pruefzeit = newPruefzeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFZEIT, oldPruefzeit, newPruefzeit);
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
	public void setPruefzeit(Pruefzeit_TypeClass newPruefzeit) {
		if (newPruefzeit != pruefzeit) {
			NotificationChain msgs = null;
			if (pruefzeit != null)
				msgs = ((InternalEObject)pruefzeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFZEIT, null, msgs);
			if (newPruefzeit != null)
				msgs = ((InternalEObject)newPruefzeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFZEIT, null, msgs);
			msgs = basicSetPruefzeit(newPruefzeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFZEIT, newPruefzeit, newPruefzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ABSTAND_ABWEICHEND:
				return basicSetGUEAbstandAbweichend(null, msgs);
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ANORDNUNG:
				return basicSetGUEAnordnung(null, msgs);
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_BAUART:
				return basicSetGUEBauart(null, msgs);
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ENERGIEVERSORGUNG:
				return basicSetGUEEnergieversorgung(null, msgs);
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_MESSSTRECKE:
				return basicSetGUEMessstrecke(null, msgs);
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__IDPZB_ELEMENT_MITNUTZUNG:
				return basicSetIDPZBElementMitnutzung(null, msgs);
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__MESSFEHLER:
				return basicSetMessfehler(null, msgs);
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFGESCHWINDIGKEIT:
				return basicSetPruefgeschwindigkeit(null, msgs);
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFZEIT:
				return basicSetPruefzeit(null, msgs);
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
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ABSTAND_ABWEICHEND:
				return getGUEAbstandAbweichend();
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ANORDNUNG:
				return getGUEAnordnung();
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_BAUART:
				return getGUEBauart();
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ENERGIEVERSORGUNG:
				return getGUEEnergieversorgung();
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_MESSSTRECKE:
				return getGUEMessstrecke();
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__IDPZB_ELEMENT_MITNUTZUNG:
				return getIDPZBElementMitnutzung();
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__MESSFEHLER:
				return getMessfehler();
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFGESCHWINDIGKEIT:
				return getPruefgeschwindigkeit();
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFZEIT:
				return getPruefzeit();
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
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ABSTAND_ABWEICHEND:
				setGUEAbstandAbweichend((GUE_Abstand_Abweichend_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ANORDNUNG:
				setGUEAnordnung((GUE_Anordnung_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_BAUART:
				setGUEBauart((GUE_Bauart_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ENERGIEVERSORGUNG:
				setGUEEnergieversorgung((GUE_Energieversorgung_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_MESSSTRECKE:
				setGUEMessstrecke((GUE_Messstrecke_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__IDPZB_ELEMENT_MITNUTZUNG:
				setIDPZBElementMitnutzung((ID_PZB_Element_Mitnutzung_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__MESSFEHLER:
				setMessfehler((Messfehler_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFGESCHWINDIGKEIT:
				setPruefgeschwindigkeit((Pruefgeschwindigkeit_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFZEIT:
				setPruefzeit((Pruefzeit_TypeClass)newValue);
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
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ABSTAND_ABWEICHEND:
				setGUEAbstandAbweichend((GUE_Abstand_Abweichend_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ANORDNUNG:
				setGUEAnordnung((GUE_Anordnung_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_BAUART:
				setGUEBauart((GUE_Bauart_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ENERGIEVERSORGUNG:
				setGUEEnergieversorgung((GUE_Energieversorgung_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_MESSSTRECKE:
				setGUEMessstrecke((GUE_Messstrecke_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__IDPZB_ELEMENT_MITNUTZUNG:
				setIDPZBElementMitnutzung((ID_PZB_Element_Mitnutzung_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__MESSFEHLER:
				setMessfehler((Messfehler_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFGESCHWINDIGKEIT:
				setPruefgeschwindigkeit((Pruefgeschwindigkeit_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFZEIT:
				setPruefzeit((Pruefzeit_TypeClass)null);
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
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ABSTAND_ABWEICHEND:
				return gUEAbstandAbweichend != null;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ANORDNUNG:
				return gUEAnordnung != null;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_BAUART:
				return gUEBauart != null;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ENERGIEVERSORGUNG:
				return gUEEnergieversorgung != null;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_MESSSTRECKE:
				return gUEMessstrecke != null;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__IDPZB_ELEMENT_MITNUTZUNG:
				return iDPZBElementMitnutzung != null;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__MESSFEHLER:
				return messfehler != null;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFGESCHWINDIGKEIT:
				return pruefgeschwindigkeit != null;
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFZEIT:
				return pruefzeit != null;
		}
		return super.eIsSet(featureID);
	}

} //PZB_Element_GUE_AttributeGroupImpl
