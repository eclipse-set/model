/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Metallteil_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Oberstrombegrenzung_Gueterzug_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Oberstrombegrenzung_Reisezug_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Verbot_Anhalten_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Verbot_Regenerative_Bremse_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Verbot_WB_Art_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_SE_Ausruestung_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Streckeneigenschaft;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Bereich_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Streckeneigenschaft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_StreckeneigenschaftImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_StreckeneigenschaftImpl#getMetallteil <em>Metallteil</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_StreckeneigenschaftImpl#getOberstrombegrenzungGueterzug <em>Oberstrombegrenzung Gueterzug</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_StreckeneigenschaftImpl#getOberstrombegrenzungReisezug <em>Oberstrombegrenzung Reisezug</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_StreckeneigenschaftImpl#getVerbotAnhalten <em>Verbot Anhalten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_StreckeneigenschaftImpl#getVerbotRegenerativeBremse <em>Verbot Regenerative Bremse</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_StreckeneigenschaftImpl#getVerbotWBArt <em>Verbot WB Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_StreckeneigenschaftImpl#getZUBSEAusruestung <em>ZUBSE Ausruestung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_StreckeneigenschaftImpl extends Bereich_ObjektImpl implements ZUB_Streckeneigenschaft {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getMetallteil() <em>Metallteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetallteil()
	 * @generated
	 * @ordered
	 */
	protected Metallteil_TypeClass metallteil;

	/**
	 * The cached value of the '{@link #getOberstrombegrenzungGueterzug() <em>Oberstrombegrenzung Gueterzug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOberstrombegrenzungGueterzug()
	 * @generated
	 * @ordered
	 */
	protected Oberstrombegrenzung_Gueterzug_TypeClass oberstrombegrenzungGueterzug;

	/**
	 * The cached value of the '{@link #getOberstrombegrenzungReisezug() <em>Oberstrombegrenzung Reisezug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOberstrombegrenzungReisezug()
	 * @generated
	 * @ordered
	 */
	protected Oberstrombegrenzung_Reisezug_TypeClass oberstrombegrenzungReisezug;

	/**
	 * The cached value of the '{@link #getVerbotAnhalten() <em>Verbot Anhalten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbotAnhalten()
	 * @generated
	 * @ordered
	 */
	protected Verbot_Anhalten_TypeClass verbotAnhalten;

	/**
	 * The cached value of the '{@link #getVerbotRegenerativeBremse() <em>Verbot Regenerative Bremse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbotRegenerativeBremse()
	 * @generated
	 * @ordered
	 */
	protected Verbot_Regenerative_Bremse_TypeClass verbotRegenerativeBremse;

	/**
	 * The cached value of the '{@link #getVerbotWBArt() <em>Verbot WB Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbotWBArt()
	 * @generated
	 * @ordered
	 */
	protected Verbot_WB_Art_TypeClass verbotWBArt;

	/**
	 * The cached value of the '{@link #getZUBSEAusruestung() <em>ZUBSE Ausruestung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUBSEAusruestung()
	 * @generated
	 * @ordered
	 */
	protected ZUB_SE_Ausruestung_AttributeGroup zUBSEAusruestung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_StreckeneigenschaftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metallteil_TypeClass getMetallteil() {
		return metallteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetallteil(Metallteil_TypeClass newMetallteil, NotificationChain msgs) {
		Metallteil_TypeClass oldMetallteil = metallteil;
		metallteil = newMetallteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__METALLTEIL, oldMetallteil, newMetallteil);
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
	public void setMetallteil(Metallteil_TypeClass newMetallteil) {
		if (newMetallteil != metallteil) {
			NotificationChain msgs = null;
			if (metallteil != null)
				msgs = ((InternalEObject)metallteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__METALLTEIL, null, msgs);
			if (newMetallteil != null)
				msgs = ((InternalEObject)newMetallteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__METALLTEIL, null, msgs);
			msgs = basicSetMetallteil(newMetallteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__METALLTEIL, newMetallteil, newMetallteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oberstrombegrenzung_Gueterzug_TypeClass getOberstrombegrenzungGueterzug() {
		return oberstrombegrenzungGueterzug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOberstrombegrenzungGueterzug(Oberstrombegrenzung_Gueterzug_TypeClass newOberstrombegrenzungGueterzug, NotificationChain msgs) {
		Oberstrombegrenzung_Gueterzug_TypeClass oldOberstrombegrenzungGueterzug = oberstrombegrenzungGueterzug;
		oberstrombegrenzungGueterzug = newOberstrombegrenzungGueterzug;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_GUETERZUG, oldOberstrombegrenzungGueterzug, newOberstrombegrenzungGueterzug);
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
	public void setOberstrombegrenzungGueterzug(Oberstrombegrenzung_Gueterzug_TypeClass newOberstrombegrenzungGueterzug) {
		if (newOberstrombegrenzungGueterzug != oberstrombegrenzungGueterzug) {
			NotificationChain msgs = null;
			if (oberstrombegrenzungGueterzug != null)
				msgs = ((InternalEObject)oberstrombegrenzungGueterzug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_GUETERZUG, null, msgs);
			if (newOberstrombegrenzungGueterzug != null)
				msgs = ((InternalEObject)newOberstrombegrenzungGueterzug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_GUETERZUG, null, msgs);
			msgs = basicSetOberstrombegrenzungGueterzug(newOberstrombegrenzungGueterzug, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_GUETERZUG, newOberstrombegrenzungGueterzug, newOberstrombegrenzungGueterzug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oberstrombegrenzung_Reisezug_TypeClass getOberstrombegrenzungReisezug() {
		return oberstrombegrenzungReisezug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOberstrombegrenzungReisezug(Oberstrombegrenzung_Reisezug_TypeClass newOberstrombegrenzungReisezug, NotificationChain msgs) {
		Oberstrombegrenzung_Reisezug_TypeClass oldOberstrombegrenzungReisezug = oberstrombegrenzungReisezug;
		oberstrombegrenzungReisezug = newOberstrombegrenzungReisezug;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_REISEZUG, oldOberstrombegrenzungReisezug, newOberstrombegrenzungReisezug);
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
	public void setOberstrombegrenzungReisezug(Oberstrombegrenzung_Reisezug_TypeClass newOberstrombegrenzungReisezug) {
		if (newOberstrombegrenzungReisezug != oberstrombegrenzungReisezug) {
			NotificationChain msgs = null;
			if (oberstrombegrenzungReisezug != null)
				msgs = ((InternalEObject)oberstrombegrenzungReisezug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_REISEZUG, null, msgs);
			if (newOberstrombegrenzungReisezug != null)
				msgs = ((InternalEObject)newOberstrombegrenzungReisezug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_REISEZUG, null, msgs);
			msgs = basicSetOberstrombegrenzungReisezug(newOberstrombegrenzungReisezug, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_REISEZUG, newOberstrombegrenzungReisezug, newOberstrombegrenzungReisezug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verbot_Anhalten_TypeClass getVerbotAnhalten() {
		return verbotAnhalten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerbotAnhalten(Verbot_Anhalten_TypeClass newVerbotAnhalten, NotificationChain msgs) {
		Verbot_Anhalten_TypeClass oldVerbotAnhalten = verbotAnhalten;
		verbotAnhalten = newVerbotAnhalten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_ANHALTEN, oldVerbotAnhalten, newVerbotAnhalten);
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
	public void setVerbotAnhalten(Verbot_Anhalten_TypeClass newVerbotAnhalten) {
		if (newVerbotAnhalten != verbotAnhalten) {
			NotificationChain msgs = null;
			if (verbotAnhalten != null)
				msgs = ((InternalEObject)verbotAnhalten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_ANHALTEN, null, msgs);
			if (newVerbotAnhalten != null)
				msgs = ((InternalEObject)newVerbotAnhalten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_ANHALTEN, null, msgs);
			msgs = basicSetVerbotAnhalten(newVerbotAnhalten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_ANHALTEN, newVerbotAnhalten, newVerbotAnhalten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verbot_Regenerative_Bremse_TypeClass getVerbotRegenerativeBremse() {
		return verbotRegenerativeBremse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerbotRegenerativeBremse(Verbot_Regenerative_Bremse_TypeClass newVerbotRegenerativeBremse, NotificationChain msgs) {
		Verbot_Regenerative_Bremse_TypeClass oldVerbotRegenerativeBremse = verbotRegenerativeBremse;
		verbotRegenerativeBremse = newVerbotRegenerativeBremse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_REGENERATIVE_BREMSE, oldVerbotRegenerativeBremse, newVerbotRegenerativeBremse);
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
	public void setVerbotRegenerativeBremse(Verbot_Regenerative_Bremse_TypeClass newVerbotRegenerativeBremse) {
		if (newVerbotRegenerativeBremse != verbotRegenerativeBremse) {
			NotificationChain msgs = null;
			if (verbotRegenerativeBremse != null)
				msgs = ((InternalEObject)verbotRegenerativeBremse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_REGENERATIVE_BREMSE, null, msgs);
			if (newVerbotRegenerativeBremse != null)
				msgs = ((InternalEObject)newVerbotRegenerativeBremse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_REGENERATIVE_BREMSE, null, msgs);
			msgs = basicSetVerbotRegenerativeBremse(newVerbotRegenerativeBremse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_REGENERATIVE_BREMSE, newVerbotRegenerativeBremse, newVerbotRegenerativeBremse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verbot_WB_Art_TypeClass getVerbotWBArt() {
		return verbotWBArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerbotWBArt(Verbot_WB_Art_TypeClass newVerbotWBArt, NotificationChain msgs) {
		Verbot_WB_Art_TypeClass oldVerbotWBArt = verbotWBArt;
		verbotWBArt = newVerbotWBArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_WB_ART, oldVerbotWBArt, newVerbotWBArt);
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
	public void setVerbotWBArt(Verbot_WB_Art_TypeClass newVerbotWBArt) {
		if (newVerbotWBArt != verbotWBArt) {
			NotificationChain msgs = null;
			if (verbotWBArt != null)
				msgs = ((InternalEObject)verbotWBArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_WB_ART, null, msgs);
			if (newVerbotWBArt != null)
				msgs = ((InternalEObject)newVerbotWBArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_WB_ART, null, msgs);
			msgs = basicSetVerbotWBArt(newVerbotWBArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_WB_ART, newVerbotWBArt, newVerbotWBArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_SE_Ausruestung_AttributeGroup getZUBSEAusruestung() {
		return zUBSEAusruestung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZUBSEAusruestung(ZUB_SE_Ausruestung_AttributeGroup newZUBSEAusruestung, NotificationChain msgs) {
		ZUB_SE_Ausruestung_AttributeGroup oldZUBSEAusruestung = zUBSEAusruestung;
		zUBSEAusruestung = newZUBSEAusruestung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__ZUBSE_AUSRUESTUNG, oldZUBSEAusruestung, newZUBSEAusruestung);
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
	public void setZUBSEAusruestung(ZUB_SE_Ausruestung_AttributeGroup newZUBSEAusruestung) {
		if (newZUBSEAusruestung != zUBSEAusruestung) {
			NotificationChain msgs = null;
			if (zUBSEAusruestung != null)
				msgs = ((InternalEObject)zUBSEAusruestung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__ZUBSE_AUSRUESTUNG, null, msgs);
			if (newZUBSEAusruestung != null)
				msgs = ((InternalEObject)newZUBSEAusruestung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__ZUBSE_AUSRUESTUNG, null, msgs);
			msgs = basicSetZUBSEAusruestung(newZUBSEAusruestung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__ZUBSE_AUSRUESTUNG, newZUBSEAusruestung, newZUBSEAusruestung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__METALLTEIL:
				return basicSetMetallteil(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_GUETERZUG:
				return basicSetOberstrombegrenzungGueterzug(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_REISEZUG:
				return basicSetOberstrombegrenzungReisezug(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_ANHALTEN:
				return basicSetVerbotAnhalten(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_REGENERATIVE_BREMSE:
				return basicSetVerbotRegenerativeBremse(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_WB_ART:
				return basicSetVerbotWBArt(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__ZUBSE_AUSRUESTUNG:
				return basicSetZUBSEAusruestung(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__BEZEICHNUNG:
				return getBezeichnung();
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__METALLTEIL:
				return getMetallteil();
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_GUETERZUG:
				return getOberstrombegrenzungGueterzug();
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_REISEZUG:
				return getOberstrombegrenzungReisezug();
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_ANHALTEN:
				return getVerbotAnhalten();
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_REGENERATIVE_BREMSE:
				return getVerbotRegenerativeBremse();
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_WB_ART:
				return getVerbotWBArt();
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__ZUBSE_AUSRUESTUNG:
				return getZUBSEAusruestung();
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
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__BEZEICHNUNG:
				setBezeichnung((ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__METALLTEIL:
				setMetallteil((Metallteil_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_GUETERZUG:
				setOberstrombegrenzungGueterzug((Oberstrombegrenzung_Gueterzug_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_REISEZUG:
				setOberstrombegrenzungReisezug((Oberstrombegrenzung_Reisezug_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_ANHALTEN:
				setVerbotAnhalten((Verbot_Anhalten_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_REGENERATIVE_BREMSE:
				setVerbotRegenerativeBremse((Verbot_Regenerative_Bremse_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_WB_ART:
				setVerbotWBArt((Verbot_WB_Art_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__ZUBSE_AUSRUESTUNG:
				setZUBSEAusruestung((ZUB_SE_Ausruestung_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__BEZEICHNUNG:
				setBezeichnung((ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__METALLTEIL:
				setMetallteil((Metallteil_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_GUETERZUG:
				setOberstrombegrenzungGueterzug((Oberstrombegrenzung_Gueterzug_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_REISEZUG:
				setOberstrombegrenzungReisezug((Oberstrombegrenzung_Reisezug_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_ANHALTEN:
				setVerbotAnhalten((Verbot_Anhalten_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_REGENERATIVE_BREMSE:
				setVerbotRegenerativeBremse((Verbot_Regenerative_Bremse_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_WB_ART:
				setVerbotWBArt((Verbot_WB_Art_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__ZUBSE_AUSRUESTUNG:
				setZUBSEAusruestung((ZUB_SE_Ausruestung_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__BEZEICHNUNG:
				return bezeichnung != null;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__METALLTEIL:
				return metallteil != null;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_GUETERZUG:
				return oberstrombegrenzungGueterzug != null;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_REISEZUG:
				return oberstrombegrenzungReisezug != null;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_ANHALTEN:
				return verbotAnhalten != null;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_REGENERATIVE_BREMSE:
				return verbotRegenerativeBremse != null;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_WB_ART:
				return verbotWBArt != null;
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__ZUBSE_AUSRUESTUNG:
				return zUBSEAusruestung != null;
		}
		return super.eIsSet(featureID);
	}

} //ZUB_StreckeneigenschaftImpl
