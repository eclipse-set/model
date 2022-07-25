/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Elektrischer_Antrieb_Anzahl_TypeClass;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Elektrischer_Antrieb_Lage_TypeClass;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Geschwindigkeit_L_TypeClass;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Geschwindigkeit_R_TypeClass;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Herzstueck_Antriebe_TypeClass;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Kreuzungsgleis_TypeClass;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichensignal_TypeClass;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Zungenpruefkontakt_Anzahl_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zungenpaar Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.Zungenpaar_AttributeGroupImpl#getElektrischerAntriebAnzahl <em>Elektrischer Antrieb Anzahl</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.Zungenpaar_AttributeGroupImpl#getElektrischerAntriebLage <em>Elektrischer Antrieb Lage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.Zungenpaar_AttributeGroupImpl#getGeschwindigkeitL <em>Geschwindigkeit L</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.Zungenpaar_AttributeGroupImpl#getGeschwindigkeitR <em>Geschwindigkeit R</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.Zungenpaar_AttributeGroupImpl#getHerzstueckAntriebe <em>Herzstueck Antriebe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.Zungenpaar_AttributeGroupImpl#getKreuzungsgleis <em>Kreuzungsgleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.Zungenpaar_AttributeGroupImpl#getWeichensignal <em>Weichensignal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.Zungenpaar_AttributeGroupImpl#getZungenpruefkontaktAnzahl <em>Zungenpruefkontakt Anzahl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Zungenpaar_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Zungenpaar_AttributeGroup {
	/**
	 * The cached value of the '{@link #getElektrischerAntriebAnzahl() <em>Elektrischer Antrieb Anzahl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElektrischerAntriebAnzahl()
	 * @generated
	 * @ordered
	 */
	protected Elektrischer_Antrieb_Anzahl_TypeClass elektrischerAntriebAnzahl;

	/**
	 * The cached value of the '{@link #getElektrischerAntriebLage() <em>Elektrischer Antrieb Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElektrischerAntriebLage()
	 * @generated
	 * @ordered
	 */
	protected Elektrischer_Antrieb_Lage_TypeClass elektrischerAntriebLage;

	/**
	 * The cached value of the '{@link #getGeschwindigkeitL() <em>Geschwindigkeit L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschwindigkeitL()
	 * @generated
	 * @ordered
	 */
	protected Geschwindigkeit_L_TypeClass geschwindigkeitL;

	/**
	 * The cached value of the '{@link #getGeschwindigkeitR() <em>Geschwindigkeit R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschwindigkeitR()
	 * @generated
	 * @ordered
	 */
	protected Geschwindigkeit_R_TypeClass geschwindigkeitR;

	/**
	 * The cached value of the '{@link #getHerzstueckAntriebe() <em>Herzstueck Antriebe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerzstueckAntriebe()
	 * @generated
	 * @ordered
	 */
	protected Herzstueck_Antriebe_TypeClass herzstueckAntriebe;

	/**
	 * The cached value of the '{@link #getKreuzungsgleis() <em>Kreuzungsgleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKreuzungsgleis()
	 * @generated
	 * @ordered
	 */
	protected Kreuzungsgleis_TypeClass kreuzungsgleis;

	/**
	 * The cached value of the '{@link #getWeichensignal() <em>Weichensignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeichensignal()
	 * @generated
	 * @ordered
	 */
	protected Weichensignal_TypeClass weichensignal;

	/**
	 * The cached value of the '{@link #getZungenpruefkontaktAnzahl() <em>Zungenpruefkontakt Anzahl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZungenpruefkontaktAnzahl()
	 * @generated
	 * @ordered
	 */
	protected Zungenpruefkontakt_Anzahl_TypeClass zungenpruefkontaktAnzahl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Zungenpaar_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.ZUNGENPAAR_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Elektrischer_Antrieb_Anzahl_TypeClass getElektrischerAntriebAnzahl() {
		return elektrischerAntriebAnzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElektrischerAntriebAnzahl(Elektrischer_Antrieb_Anzahl_TypeClass newElektrischerAntriebAnzahl, NotificationChain msgs) {
		Elektrischer_Antrieb_Anzahl_TypeClass oldElektrischerAntriebAnzahl = elektrischerAntriebAnzahl;
		elektrischerAntriebAnzahl = newElektrischerAntriebAnzahl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL, oldElektrischerAntriebAnzahl, newElektrischerAntriebAnzahl);
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
	public void setElektrischerAntriebAnzahl(Elektrischer_Antrieb_Anzahl_TypeClass newElektrischerAntriebAnzahl) {
		if (newElektrischerAntriebAnzahl != elektrischerAntriebAnzahl) {
			NotificationChain msgs = null;
			if (elektrischerAntriebAnzahl != null)
				msgs = ((InternalEObject)elektrischerAntriebAnzahl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL, null, msgs);
			if (newElektrischerAntriebAnzahl != null)
				msgs = ((InternalEObject)newElektrischerAntriebAnzahl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL, null, msgs);
			msgs = basicSetElektrischerAntriebAnzahl(newElektrischerAntriebAnzahl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL, newElektrischerAntriebAnzahl, newElektrischerAntriebAnzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Elektrischer_Antrieb_Lage_TypeClass getElektrischerAntriebLage() {
		return elektrischerAntriebLage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElektrischerAntriebLage(Elektrischer_Antrieb_Lage_TypeClass newElektrischerAntriebLage, NotificationChain msgs) {
		Elektrischer_Antrieb_Lage_TypeClass oldElektrischerAntriebLage = elektrischerAntriebLage;
		elektrischerAntriebLage = newElektrischerAntriebLage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE, oldElektrischerAntriebLage, newElektrischerAntriebLage);
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
	public void setElektrischerAntriebLage(Elektrischer_Antrieb_Lage_TypeClass newElektrischerAntriebLage) {
		if (newElektrischerAntriebLage != elektrischerAntriebLage) {
			NotificationChain msgs = null;
			if (elektrischerAntriebLage != null)
				msgs = ((InternalEObject)elektrischerAntriebLage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE, null, msgs);
			if (newElektrischerAntriebLage != null)
				msgs = ((InternalEObject)newElektrischerAntriebLage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE, null, msgs);
			msgs = basicSetElektrischerAntriebLage(newElektrischerAntriebLage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE, newElektrischerAntriebLage, newElektrischerAntriebLage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschwindigkeit_L_TypeClass getGeschwindigkeitL() {
		return geschwindigkeitL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeschwindigkeitL(Geschwindigkeit_L_TypeClass newGeschwindigkeitL, NotificationChain msgs) {
		Geschwindigkeit_L_TypeClass oldGeschwindigkeitL = geschwindigkeitL;
		geschwindigkeitL = newGeschwindigkeitL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L, oldGeschwindigkeitL, newGeschwindigkeitL);
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
	public void setGeschwindigkeitL(Geschwindigkeit_L_TypeClass newGeschwindigkeitL) {
		if (newGeschwindigkeitL != geschwindigkeitL) {
			NotificationChain msgs = null;
			if (geschwindigkeitL != null)
				msgs = ((InternalEObject)geschwindigkeitL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L, null, msgs);
			if (newGeschwindigkeitL != null)
				msgs = ((InternalEObject)newGeschwindigkeitL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L, null, msgs);
			msgs = basicSetGeschwindigkeitL(newGeschwindigkeitL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L, newGeschwindigkeitL, newGeschwindigkeitL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschwindigkeit_R_TypeClass getGeschwindigkeitR() {
		return geschwindigkeitR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeschwindigkeitR(Geschwindigkeit_R_TypeClass newGeschwindigkeitR, NotificationChain msgs) {
		Geschwindigkeit_R_TypeClass oldGeschwindigkeitR = geschwindigkeitR;
		geschwindigkeitR = newGeschwindigkeitR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R, oldGeschwindigkeitR, newGeschwindigkeitR);
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
	public void setGeschwindigkeitR(Geschwindigkeit_R_TypeClass newGeschwindigkeitR) {
		if (newGeschwindigkeitR != geschwindigkeitR) {
			NotificationChain msgs = null;
			if (geschwindigkeitR != null)
				msgs = ((InternalEObject)geschwindigkeitR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R, null, msgs);
			if (newGeschwindigkeitR != null)
				msgs = ((InternalEObject)newGeschwindigkeitR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R, null, msgs);
			msgs = basicSetGeschwindigkeitR(newGeschwindigkeitR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R, newGeschwindigkeitR, newGeschwindigkeitR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Herzstueck_Antriebe_TypeClass getHerzstueckAntriebe() {
		return herzstueckAntriebe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHerzstueckAntriebe(Herzstueck_Antriebe_TypeClass newHerzstueckAntriebe, NotificationChain msgs) {
		Herzstueck_Antriebe_TypeClass oldHerzstueckAntriebe = herzstueckAntriebe;
		herzstueckAntriebe = newHerzstueckAntriebe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__HERZSTUECK_ANTRIEBE, oldHerzstueckAntriebe, newHerzstueckAntriebe);
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
	public void setHerzstueckAntriebe(Herzstueck_Antriebe_TypeClass newHerzstueckAntriebe) {
		if (newHerzstueckAntriebe != herzstueckAntriebe) {
			NotificationChain msgs = null;
			if (herzstueckAntriebe != null)
				msgs = ((InternalEObject)herzstueckAntriebe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__HERZSTUECK_ANTRIEBE, null, msgs);
			if (newHerzstueckAntriebe != null)
				msgs = ((InternalEObject)newHerzstueckAntriebe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__HERZSTUECK_ANTRIEBE, null, msgs);
			msgs = basicSetHerzstueckAntriebe(newHerzstueckAntriebe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__HERZSTUECK_ANTRIEBE, newHerzstueckAntriebe, newHerzstueckAntriebe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kreuzungsgleis_TypeClass getKreuzungsgleis() {
		return kreuzungsgleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKreuzungsgleis(Kreuzungsgleis_TypeClass newKreuzungsgleis, NotificationChain msgs) {
		Kreuzungsgleis_TypeClass oldKreuzungsgleis = kreuzungsgleis;
		kreuzungsgleis = newKreuzungsgleis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__KREUZUNGSGLEIS, oldKreuzungsgleis, newKreuzungsgleis);
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
	public void setKreuzungsgleis(Kreuzungsgleis_TypeClass newKreuzungsgleis) {
		if (newKreuzungsgleis != kreuzungsgleis) {
			NotificationChain msgs = null;
			if (kreuzungsgleis != null)
				msgs = ((InternalEObject)kreuzungsgleis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__KREUZUNGSGLEIS, null, msgs);
			if (newKreuzungsgleis != null)
				msgs = ((InternalEObject)newKreuzungsgleis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__KREUZUNGSGLEIS, null, msgs);
			msgs = basicSetKreuzungsgleis(newKreuzungsgleis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__KREUZUNGSGLEIS, newKreuzungsgleis, newKreuzungsgleis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weichensignal_TypeClass getWeichensignal() {
		return weichensignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeichensignal(Weichensignal_TypeClass newWeichensignal, NotificationChain msgs) {
		Weichensignal_TypeClass oldWeichensignal = weichensignal;
		weichensignal = newWeichensignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__WEICHENSIGNAL, oldWeichensignal, newWeichensignal);
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
	public void setWeichensignal(Weichensignal_TypeClass newWeichensignal) {
		if (newWeichensignal != weichensignal) {
			NotificationChain msgs = null;
			if (weichensignal != null)
				msgs = ((InternalEObject)weichensignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__WEICHENSIGNAL, null, msgs);
			if (newWeichensignal != null)
				msgs = ((InternalEObject)newWeichensignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__WEICHENSIGNAL, null, msgs);
			msgs = basicSetWeichensignal(newWeichensignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__WEICHENSIGNAL, newWeichensignal, newWeichensignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zungenpruefkontakt_Anzahl_TypeClass getZungenpruefkontaktAnzahl() {
		return zungenpruefkontaktAnzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZungenpruefkontaktAnzahl(Zungenpruefkontakt_Anzahl_TypeClass newZungenpruefkontaktAnzahl, NotificationChain msgs) {
		Zungenpruefkontakt_Anzahl_TypeClass oldZungenpruefkontaktAnzahl = zungenpruefkontaktAnzahl;
		zungenpruefkontaktAnzahl = newZungenpruefkontaktAnzahl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ZUNGENPRUEFKONTAKT_ANZAHL, oldZungenpruefkontaktAnzahl, newZungenpruefkontaktAnzahl);
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
	public void setZungenpruefkontaktAnzahl(Zungenpruefkontakt_Anzahl_TypeClass newZungenpruefkontaktAnzahl) {
		if (newZungenpruefkontaktAnzahl != zungenpruefkontaktAnzahl) {
			NotificationChain msgs = null;
			if (zungenpruefkontaktAnzahl != null)
				msgs = ((InternalEObject)zungenpruefkontaktAnzahl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ZUNGENPRUEFKONTAKT_ANZAHL, null, msgs);
			if (newZungenpruefkontaktAnzahl != null)
				msgs = ((InternalEObject)newZungenpruefkontaktAnzahl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ZUNGENPRUEFKONTAKT_ANZAHL, null, msgs);
			msgs = basicSetZungenpruefkontaktAnzahl(newZungenpruefkontaktAnzahl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ZUNGENPRUEFKONTAKT_ANZAHL, newZungenpruefkontaktAnzahl, newZungenpruefkontaktAnzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL:
				return basicSetElektrischerAntriebAnzahl(null, msgs);
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE:
				return basicSetElektrischerAntriebLage(null, msgs);
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L:
				return basicSetGeschwindigkeitL(null, msgs);
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R:
				return basicSetGeschwindigkeitR(null, msgs);
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__HERZSTUECK_ANTRIEBE:
				return basicSetHerzstueckAntriebe(null, msgs);
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__KREUZUNGSGLEIS:
				return basicSetKreuzungsgleis(null, msgs);
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__WEICHENSIGNAL:
				return basicSetWeichensignal(null, msgs);
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ZUNGENPRUEFKONTAKT_ANZAHL:
				return basicSetZungenpruefkontaktAnzahl(null, msgs);
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
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL:
				return getElektrischerAntriebAnzahl();
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE:
				return getElektrischerAntriebLage();
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L:
				return getGeschwindigkeitL();
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R:
				return getGeschwindigkeitR();
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__HERZSTUECK_ANTRIEBE:
				return getHerzstueckAntriebe();
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__KREUZUNGSGLEIS:
				return getKreuzungsgleis();
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__WEICHENSIGNAL:
				return getWeichensignal();
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ZUNGENPRUEFKONTAKT_ANZAHL:
				return getZungenpruefkontaktAnzahl();
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
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL:
				setElektrischerAntriebAnzahl((Elektrischer_Antrieb_Anzahl_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE:
				setElektrischerAntriebLage((Elektrischer_Antrieb_Lage_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L:
				setGeschwindigkeitL((Geschwindigkeit_L_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R:
				setGeschwindigkeitR((Geschwindigkeit_R_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__HERZSTUECK_ANTRIEBE:
				setHerzstueckAntriebe((Herzstueck_Antriebe_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__KREUZUNGSGLEIS:
				setKreuzungsgleis((Kreuzungsgleis_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__WEICHENSIGNAL:
				setWeichensignal((Weichensignal_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ZUNGENPRUEFKONTAKT_ANZAHL:
				setZungenpruefkontaktAnzahl((Zungenpruefkontakt_Anzahl_TypeClass)newValue);
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
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL:
				setElektrischerAntriebAnzahl((Elektrischer_Antrieb_Anzahl_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE:
				setElektrischerAntriebLage((Elektrischer_Antrieb_Lage_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L:
				setGeschwindigkeitL((Geschwindigkeit_L_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R:
				setGeschwindigkeitR((Geschwindigkeit_R_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__HERZSTUECK_ANTRIEBE:
				setHerzstueckAntriebe((Herzstueck_Antriebe_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__KREUZUNGSGLEIS:
				setKreuzungsgleis((Kreuzungsgleis_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__WEICHENSIGNAL:
				setWeichensignal((Weichensignal_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ZUNGENPRUEFKONTAKT_ANZAHL:
				setZungenpruefkontaktAnzahl((Zungenpruefkontakt_Anzahl_TypeClass)null);
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
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_ANZAHL:
				return elektrischerAntriebAnzahl != null;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ELEKTRISCHER_ANTRIEB_LAGE:
				return elektrischerAntriebLage != null;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_L:
				return geschwindigkeitL != null;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__GESCHWINDIGKEIT_R:
				return geschwindigkeitR != null;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__HERZSTUECK_ANTRIEBE:
				return herzstueckAntriebe != null;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__KREUZUNGSGLEIS:
				return kreuzungsgleis != null;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__WEICHENSIGNAL:
				return weichensignal != null;
			case Weichen_und_GleissperrenPackage.ZUNGENPAAR_ATTRIBUTE_GROUP__ZUNGENPRUEFKONTAKT_ANZAHL:
				return zungenpruefkontaktAnzahl != null;
		}
		return super.eIsSet(featureID);
	}

} //Zungenpaar_AttributeGroupImpl
