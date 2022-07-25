/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.PlanPro.Bauphase_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Bauzustand_Kurzbezeichnung_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Bauzustand_Langbezeichnung_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Datum_Abschluss_Einzel_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Datum_Regelwerksstand_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Index_Ausgabe_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Informativ_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Laufende_Nummer_Ausgabe_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;
import org.eclipse.set.model.model1902.PlanPro.Planung_E_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.PlanPro.Planung_E_Art_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Planung_Phase_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planung EAllg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_E_Allg_AttributeGroupImpl#getBauphase <em>Bauphase</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_E_Allg_AttributeGroupImpl#getBauzustandKurzbezeichnung <em>Bauzustand Kurzbezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_E_Allg_AttributeGroupImpl#getBauzustandLangbezeichnung <em>Bauzustand Langbezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_E_Allg_AttributeGroupImpl#getDatumAbschlussEinzel <em>Datum Abschluss Einzel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_E_Allg_AttributeGroupImpl#getDatumRegelwerksstand <em>Datum Regelwerksstand</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_E_Allg_AttributeGroupImpl#getIndexAusgabe <em>Index Ausgabe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_E_Allg_AttributeGroupImpl#getInformativ <em>Informativ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_E_Allg_AttributeGroupImpl#getLaufendeNummerAusgabe <em>Laufende Nummer Ausgabe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_E_Allg_AttributeGroupImpl#getPlanungEArt <em>Planung EArt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_E_Allg_AttributeGroupImpl#getPlanungPhase <em>Planung Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Planung_E_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Planung_E_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBauphase() <em>Bauphase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBauphase()
	 * @generated
	 * @ordered
	 */
	protected Bauphase_TypeClass bauphase;

	/**
	 * The cached value of the '{@link #getBauzustandKurzbezeichnung() <em>Bauzustand Kurzbezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBauzustandKurzbezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bauzustand_Kurzbezeichnung_TypeClass bauzustandKurzbezeichnung;

	/**
	 * The cached value of the '{@link #getBauzustandLangbezeichnung() <em>Bauzustand Langbezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBauzustandLangbezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bauzustand_Langbezeichnung_TypeClass bauzustandLangbezeichnung;

	/**
	 * The cached value of the '{@link #getDatumAbschlussEinzel() <em>Datum Abschluss Einzel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatumAbschlussEinzel()
	 * @generated
	 * @ordered
	 */
	protected Datum_Abschluss_Einzel_TypeClass datumAbschlussEinzel;

	/**
	 * The cached value of the '{@link #getDatumRegelwerksstand() <em>Datum Regelwerksstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatumRegelwerksstand()
	 * @generated
	 * @ordered
	 */
	protected Datum_Regelwerksstand_TypeClass datumRegelwerksstand;

	/**
	 * The cached value of the '{@link #getIndexAusgabe() <em>Index Ausgabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexAusgabe()
	 * @generated
	 * @ordered
	 */
	protected Index_Ausgabe_TypeClass indexAusgabe;

	/**
	 * The cached value of the '{@link #getInformativ() <em>Informativ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformativ()
	 * @generated
	 * @ordered
	 */
	protected Informativ_TypeClass informativ;

	/**
	 * The cached value of the '{@link #getLaufendeNummerAusgabe() <em>Laufende Nummer Ausgabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaufendeNummerAusgabe()
	 * @generated
	 * @ordered
	 */
	protected Laufende_Nummer_Ausgabe_TypeClass laufendeNummerAusgabe;

	/**
	 * The cached value of the '{@link #getPlanungEArt() <em>Planung EArt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungEArt()
	 * @generated
	 * @ordered
	 */
	protected Planung_E_Art_TypeClass planungEArt;

	/**
	 * The cached value of the '{@link #getPlanungPhase() <em>Planung Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungPhase()
	 * @generated
	 * @ordered
	 */
	protected Planung_Phase_TypeClass planungPhase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Planung_E_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bauphase_TypeClass getBauphase() {
		return bauphase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBauphase(Bauphase_TypeClass newBauphase, NotificationChain msgs) {
		Bauphase_TypeClass oldBauphase = bauphase;
		bauphase = newBauphase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUPHASE, oldBauphase, newBauphase);
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
	public void setBauphase(Bauphase_TypeClass newBauphase) {
		if (newBauphase != bauphase) {
			NotificationChain msgs = null;
			if (bauphase != null)
				msgs = ((InternalEObject)bauphase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUPHASE, null, msgs);
			if (newBauphase != null)
				msgs = ((InternalEObject)newBauphase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUPHASE, null, msgs);
			msgs = basicSetBauphase(newBauphase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUPHASE, newBauphase, newBauphase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bauzustand_Kurzbezeichnung_TypeClass getBauzustandKurzbezeichnung() {
		return bauzustandKurzbezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBauzustandKurzbezeichnung(Bauzustand_Kurzbezeichnung_TypeClass newBauzustandKurzbezeichnung, NotificationChain msgs) {
		Bauzustand_Kurzbezeichnung_TypeClass oldBauzustandKurzbezeichnung = bauzustandKurzbezeichnung;
		bauzustandKurzbezeichnung = newBauzustandKurzbezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_KURZBEZEICHNUNG, oldBauzustandKurzbezeichnung, newBauzustandKurzbezeichnung);
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
	public void setBauzustandKurzbezeichnung(Bauzustand_Kurzbezeichnung_TypeClass newBauzustandKurzbezeichnung) {
		if (newBauzustandKurzbezeichnung != bauzustandKurzbezeichnung) {
			NotificationChain msgs = null;
			if (bauzustandKurzbezeichnung != null)
				msgs = ((InternalEObject)bauzustandKurzbezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_KURZBEZEICHNUNG, null, msgs);
			if (newBauzustandKurzbezeichnung != null)
				msgs = ((InternalEObject)newBauzustandKurzbezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_KURZBEZEICHNUNG, null, msgs);
			msgs = basicSetBauzustandKurzbezeichnung(newBauzustandKurzbezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_KURZBEZEICHNUNG, newBauzustandKurzbezeichnung, newBauzustandKurzbezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bauzustand_Langbezeichnung_TypeClass getBauzustandLangbezeichnung() {
		return bauzustandLangbezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBauzustandLangbezeichnung(Bauzustand_Langbezeichnung_TypeClass newBauzustandLangbezeichnung, NotificationChain msgs) {
		Bauzustand_Langbezeichnung_TypeClass oldBauzustandLangbezeichnung = bauzustandLangbezeichnung;
		bauzustandLangbezeichnung = newBauzustandLangbezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_LANGBEZEICHNUNG, oldBauzustandLangbezeichnung, newBauzustandLangbezeichnung);
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
	public void setBauzustandLangbezeichnung(Bauzustand_Langbezeichnung_TypeClass newBauzustandLangbezeichnung) {
		if (newBauzustandLangbezeichnung != bauzustandLangbezeichnung) {
			NotificationChain msgs = null;
			if (bauzustandLangbezeichnung != null)
				msgs = ((InternalEObject)bauzustandLangbezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_LANGBEZEICHNUNG, null, msgs);
			if (newBauzustandLangbezeichnung != null)
				msgs = ((InternalEObject)newBauzustandLangbezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_LANGBEZEICHNUNG, null, msgs);
			msgs = basicSetBauzustandLangbezeichnung(newBauzustandLangbezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_LANGBEZEICHNUNG, newBauzustandLangbezeichnung, newBauzustandLangbezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_Abschluss_Einzel_TypeClass getDatumAbschlussEinzel() {
		return datumAbschlussEinzel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatumAbschlussEinzel(Datum_Abschluss_Einzel_TypeClass newDatumAbschlussEinzel, NotificationChain msgs) {
		Datum_Abschluss_Einzel_TypeClass oldDatumAbschlussEinzel = datumAbschlussEinzel;
		datumAbschlussEinzel = newDatumAbschlussEinzel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_EINZEL, oldDatumAbschlussEinzel, newDatumAbschlussEinzel);
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
	public void setDatumAbschlussEinzel(Datum_Abschluss_Einzel_TypeClass newDatumAbschlussEinzel) {
		if (newDatumAbschlussEinzel != datumAbschlussEinzel) {
			NotificationChain msgs = null;
			if (datumAbschlussEinzel != null)
				msgs = ((InternalEObject)datumAbschlussEinzel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_EINZEL, null, msgs);
			if (newDatumAbschlussEinzel != null)
				msgs = ((InternalEObject)newDatumAbschlussEinzel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_EINZEL, null, msgs);
			msgs = basicSetDatumAbschlussEinzel(newDatumAbschlussEinzel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_EINZEL, newDatumAbschlussEinzel, newDatumAbschlussEinzel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_Regelwerksstand_TypeClass getDatumRegelwerksstand() {
		return datumRegelwerksstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatumRegelwerksstand(Datum_Regelwerksstand_TypeClass newDatumRegelwerksstand, NotificationChain msgs) {
		Datum_Regelwerksstand_TypeClass oldDatumRegelwerksstand = datumRegelwerksstand;
		datumRegelwerksstand = newDatumRegelwerksstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_REGELWERKSSTAND, oldDatumRegelwerksstand, newDatumRegelwerksstand);
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
	public void setDatumRegelwerksstand(Datum_Regelwerksstand_TypeClass newDatumRegelwerksstand) {
		if (newDatumRegelwerksstand != datumRegelwerksstand) {
			NotificationChain msgs = null;
			if (datumRegelwerksstand != null)
				msgs = ((InternalEObject)datumRegelwerksstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_REGELWERKSSTAND, null, msgs);
			if (newDatumRegelwerksstand != null)
				msgs = ((InternalEObject)newDatumRegelwerksstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_REGELWERKSSTAND, null, msgs);
			msgs = basicSetDatumRegelwerksstand(newDatumRegelwerksstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_REGELWERKSSTAND, newDatumRegelwerksstand, newDatumRegelwerksstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Index_Ausgabe_TypeClass getIndexAusgabe() {
		return indexAusgabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexAusgabe(Index_Ausgabe_TypeClass newIndexAusgabe, NotificationChain msgs) {
		Index_Ausgabe_TypeClass oldIndexAusgabe = indexAusgabe;
		indexAusgabe = newIndexAusgabe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INDEX_AUSGABE, oldIndexAusgabe, newIndexAusgabe);
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
	public void setIndexAusgabe(Index_Ausgabe_TypeClass newIndexAusgabe) {
		if (newIndexAusgabe != indexAusgabe) {
			NotificationChain msgs = null;
			if (indexAusgabe != null)
				msgs = ((InternalEObject)indexAusgabe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INDEX_AUSGABE, null, msgs);
			if (newIndexAusgabe != null)
				msgs = ((InternalEObject)newIndexAusgabe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INDEX_AUSGABE, null, msgs);
			msgs = basicSetIndexAusgabe(newIndexAusgabe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INDEX_AUSGABE, newIndexAusgabe, newIndexAusgabe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Informativ_TypeClass getInformativ() {
		return informativ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformativ(Informativ_TypeClass newInformativ, NotificationChain msgs) {
		Informativ_TypeClass oldInformativ = informativ;
		informativ = newInformativ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INFORMATIV, oldInformativ, newInformativ);
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
	public void setInformativ(Informativ_TypeClass newInformativ) {
		if (newInformativ != informativ) {
			NotificationChain msgs = null;
			if (informativ != null)
				msgs = ((InternalEObject)informativ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INFORMATIV, null, msgs);
			if (newInformativ != null)
				msgs = ((InternalEObject)newInformativ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INFORMATIV, null, msgs);
			msgs = basicSetInformativ(newInformativ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INFORMATIV, newInformativ, newInformativ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Laufende_Nummer_Ausgabe_TypeClass getLaufendeNummerAusgabe() {
		return laufendeNummerAusgabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaufendeNummerAusgabe(Laufende_Nummer_Ausgabe_TypeClass newLaufendeNummerAusgabe, NotificationChain msgs) {
		Laufende_Nummer_Ausgabe_TypeClass oldLaufendeNummerAusgabe = laufendeNummerAusgabe;
		laufendeNummerAusgabe = newLaufendeNummerAusgabe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__LAUFENDE_NUMMER_AUSGABE, oldLaufendeNummerAusgabe, newLaufendeNummerAusgabe);
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
	public void setLaufendeNummerAusgabe(Laufende_Nummer_Ausgabe_TypeClass newLaufendeNummerAusgabe) {
		if (newLaufendeNummerAusgabe != laufendeNummerAusgabe) {
			NotificationChain msgs = null;
			if (laufendeNummerAusgabe != null)
				msgs = ((InternalEObject)laufendeNummerAusgabe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__LAUFENDE_NUMMER_AUSGABE, null, msgs);
			if (newLaufendeNummerAusgabe != null)
				msgs = ((InternalEObject)newLaufendeNummerAusgabe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__LAUFENDE_NUMMER_AUSGABE, null, msgs);
			msgs = basicSetLaufendeNummerAusgabe(newLaufendeNummerAusgabe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__LAUFENDE_NUMMER_AUSGABE, newLaufendeNummerAusgabe, newLaufendeNummerAusgabe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_E_Art_TypeClass getPlanungEArt() {
		return planungEArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanungEArt(Planung_E_Art_TypeClass newPlanungEArt, NotificationChain msgs) {
		Planung_E_Art_TypeClass oldPlanungEArt = planungEArt;
		planungEArt = newPlanungEArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_EART, oldPlanungEArt, newPlanungEArt);
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
	public void setPlanungEArt(Planung_E_Art_TypeClass newPlanungEArt) {
		if (newPlanungEArt != planungEArt) {
			NotificationChain msgs = null;
			if (planungEArt != null)
				msgs = ((InternalEObject)planungEArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_EART, null, msgs);
			if (newPlanungEArt != null)
				msgs = ((InternalEObject)newPlanungEArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_EART, null, msgs);
			msgs = basicSetPlanungEArt(newPlanungEArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_EART, newPlanungEArt, newPlanungEArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_Phase_TypeClass getPlanungPhase() {
		return planungPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanungPhase(Planung_Phase_TypeClass newPlanungPhase, NotificationChain msgs) {
		Planung_Phase_TypeClass oldPlanungPhase = planungPhase;
		planungPhase = newPlanungPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_PHASE, oldPlanungPhase, newPlanungPhase);
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
	public void setPlanungPhase(Planung_Phase_TypeClass newPlanungPhase) {
		if (newPlanungPhase != planungPhase) {
			NotificationChain msgs = null;
			if (planungPhase != null)
				msgs = ((InternalEObject)planungPhase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_PHASE, null, msgs);
			if (newPlanungPhase != null)
				msgs = ((InternalEObject)newPlanungPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_PHASE, null, msgs);
			msgs = basicSetPlanungPhase(newPlanungPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_PHASE, newPlanungPhase, newPlanungPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUPHASE:
				return basicSetBauphase(null, msgs);
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_KURZBEZEICHNUNG:
				return basicSetBauzustandKurzbezeichnung(null, msgs);
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_LANGBEZEICHNUNG:
				return basicSetBauzustandLangbezeichnung(null, msgs);
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_EINZEL:
				return basicSetDatumAbschlussEinzel(null, msgs);
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_REGELWERKSSTAND:
				return basicSetDatumRegelwerksstand(null, msgs);
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INDEX_AUSGABE:
				return basicSetIndexAusgabe(null, msgs);
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INFORMATIV:
				return basicSetInformativ(null, msgs);
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__LAUFENDE_NUMMER_AUSGABE:
				return basicSetLaufendeNummerAusgabe(null, msgs);
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_EART:
				return basicSetPlanungEArt(null, msgs);
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_PHASE:
				return basicSetPlanungPhase(null, msgs);
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
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUPHASE:
				return getBauphase();
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_KURZBEZEICHNUNG:
				return getBauzustandKurzbezeichnung();
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_LANGBEZEICHNUNG:
				return getBauzustandLangbezeichnung();
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_EINZEL:
				return getDatumAbschlussEinzel();
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_REGELWERKSSTAND:
				return getDatumRegelwerksstand();
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INDEX_AUSGABE:
				return getIndexAusgabe();
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INFORMATIV:
				return getInformativ();
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__LAUFENDE_NUMMER_AUSGABE:
				return getLaufendeNummerAusgabe();
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_EART:
				return getPlanungEArt();
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_PHASE:
				return getPlanungPhase();
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
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUPHASE:
				setBauphase((Bauphase_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_KURZBEZEICHNUNG:
				setBauzustandKurzbezeichnung((Bauzustand_Kurzbezeichnung_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_LANGBEZEICHNUNG:
				setBauzustandLangbezeichnung((Bauzustand_Langbezeichnung_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_EINZEL:
				setDatumAbschlussEinzel((Datum_Abschluss_Einzel_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_REGELWERKSSTAND:
				setDatumRegelwerksstand((Datum_Regelwerksstand_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INDEX_AUSGABE:
				setIndexAusgabe((Index_Ausgabe_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INFORMATIV:
				setInformativ((Informativ_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__LAUFENDE_NUMMER_AUSGABE:
				setLaufendeNummerAusgabe((Laufende_Nummer_Ausgabe_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_EART:
				setPlanungEArt((Planung_E_Art_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_PHASE:
				setPlanungPhase((Planung_Phase_TypeClass)newValue);
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
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUPHASE:
				setBauphase((Bauphase_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_KURZBEZEICHNUNG:
				setBauzustandKurzbezeichnung((Bauzustand_Kurzbezeichnung_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_LANGBEZEICHNUNG:
				setBauzustandLangbezeichnung((Bauzustand_Langbezeichnung_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_EINZEL:
				setDatumAbschlussEinzel((Datum_Abschluss_Einzel_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_REGELWERKSSTAND:
				setDatumRegelwerksstand((Datum_Regelwerksstand_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INDEX_AUSGABE:
				setIndexAusgabe((Index_Ausgabe_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INFORMATIV:
				setInformativ((Informativ_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__LAUFENDE_NUMMER_AUSGABE:
				setLaufendeNummerAusgabe((Laufende_Nummer_Ausgabe_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_EART:
				setPlanungEArt((Planung_E_Art_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_PHASE:
				setPlanungPhase((Planung_Phase_TypeClass)null);
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
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUPHASE:
				return bauphase != null;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_KURZBEZEICHNUNG:
				return bauzustandKurzbezeichnung != null;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_LANGBEZEICHNUNG:
				return bauzustandLangbezeichnung != null;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_EINZEL:
				return datumAbschlussEinzel != null;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_REGELWERKSSTAND:
				return datumRegelwerksstand != null;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INDEX_AUSGABE:
				return indexAusgabe != null;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INFORMATIV:
				return informativ != null;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__LAUFENDE_NUMMER_AUSGABE:
				return laufendeNummerAusgabe != null;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_EART:
				return planungEArt != null;
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_PHASE:
				return planungPhase != null;
		}
		return super.eIsSet(featureID);
	}

} //Planung_E_Allg_AttributeGroupImpl
