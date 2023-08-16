/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Anordnung_Im_DP_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balise_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balise_Geraetestand_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisenhalter_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Fabrikat_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Hersteller_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Hinweis_Balisenbefestigung_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Montageabweichung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Balise Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Balise_Allg_AttributeGroupImpl#getAnordnungImDP <em>Anordnung Im DP</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Balise_Allg_AttributeGroupImpl#getBaliseGeraetestand <em>Balise Geraetestand</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Balise_Allg_AttributeGroupImpl#getBalisenhalter <em>Balisenhalter</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Balise_Allg_AttributeGroupImpl#getFabrikat <em>Fabrikat</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Balise_Allg_AttributeGroupImpl#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Balise_Allg_AttributeGroupImpl#getHinweisBalisenbefestigung <em>Hinweis Balisenbefestigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Balise_Allg_AttributeGroupImpl#getMontageabweichung <em>Montageabweichung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Balise_Allg_AttributeGroupImpl extends EObjectImpl implements Balise_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnordnungImDP() <em>Anordnung Im DP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnordnungImDP()
	 * @generated
	 * @ordered
	 */
	protected Anordnung_Im_DP_TypeClass anordnungImDP;

	/**
	 * The cached value of the '{@link #getBaliseGeraetestand() <em>Balise Geraetestand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaliseGeraetestand()
	 * @generated
	 * @ordered
	 */
	protected Balise_Geraetestand_TypeClass baliseGeraetestand;

	/**
	 * The cached value of the '{@link #getBalisenhalter() <em>Balisenhalter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalisenhalter()
	 * @generated
	 * @ordered
	 */
	protected Balisenhalter_TypeClass balisenhalter;

	/**
	 * The cached value of the '{@link #getFabrikat() <em>Fabrikat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFabrikat()
	 * @generated
	 * @ordered
	 */
	protected Fabrikat_TypeClass fabrikat;

	/**
	 * The cached value of the '{@link #getHersteller() <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHersteller()
	 * @generated
	 * @ordered
	 */
	protected Hersteller_TypeClass hersteller;

	/**
	 * The cached value of the '{@link #getHinweisBalisenbefestigung() <em>Hinweis Balisenbefestigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHinweisBalisenbefestigung()
	 * @generated
	 * @ordered
	 */
	protected Hinweis_Balisenbefestigung_TypeClass hinweisBalisenbefestigung;

	/**
	 * The cached value of the '{@link #getMontageabweichung() <em>Montageabweichung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontageabweichung()
	 * @generated
	 * @ordered
	 */
	protected Montageabweichung_TypeClass montageabweichung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Balise_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBalise_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anordnung_Im_DP_TypeClass getAnordnungImDP() {
		return anordnungImDP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnordnungImDP(Anordnung_Im_DP_TypeClass newAnordnungImDP, NotificationChain msgs) {
		Anordnung_Im_DP_TypeClass oldAnordnungImDP = anordnungImDP;
		anordnungImDP = newAnordnungImDP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__ANORDNUNG_IM_DP, oldAnordnungImDP, newAnordnungImDP);
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
	public void setAnordnungImDP(Anordnung_Im_DP_TypeClass newAnordnungImDP) {
		if (newAnordnungImDP != anordnungImDP) {
			NotificationChain msgs = null;
			if (anordnungImDP != null)
				msgs = ((InternalEObject)anordnungImDP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__ANORDNUNG_IM_DP, null, msgs);
			if (newAnordnungImDP != null)
				msgs = ((InternalEObject)newAnordnungImDP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__ANORDNUNG_IM_DP, null, msgs);
			msgs = basicSetAnordnungImDP(newAnordnungImDP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__ANORDNUNG_IM_DP, newAnordnungImDP, newAnordnungImDP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balise_Geraetestand_TypeClass getBaliseGeraetestand() {
		return baliseGeraetestand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaliseGeraetestand(Balise_Geraetestand_TypeClass newBaliseGeraetestand, NotificationChain msgs) {
		Balise_Geraetestand_TypeClass oldBaliseGeraetestand = baliseGeraetestand;
		baliseGeraetestand = newBaliseGeraetestand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISE_GERAETESTAND, oldBaliseGeraetestand, newBaliseGeraetestand);
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
	public void setBaliseGeraetestand(Balise_Geraetestand_TypeClass newBaliseGeraetestand) {
		if (newBaliseGeraetestand != baliseGeraetestand) {
			NotificationChain msgs = null;
			if (baliseGeraetestand != null)
				msgs = ((InternalEObject)baliseGeraetestand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISE_GERAETESTAND, null, msgs);
			if (newBaliseGeraetestand != null)
				msgs = ((InternalEObject)newBaliseGeraetestand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISE_GERAETESTAND, null, msgs);
			msgs = basicSetBaliseGeraetestand(newBaliseGeraetestand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISE_GERAETESTAND, newBaliseGeraetestand, newBaliseGeraetestand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balisenhalter_TypeClass getBalisenhalter() {
		return balisenhalter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBalisenhalter(Balisenhalter_TypeClass newBalisenhalter, NotificationChain msgs) {
		Balisenhalter_TypeClass oldBalisenhalter = balisenhalter;
		balisenhalter = newBalisenhalter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISENHALTER, oldBalisenhalter, newBalisenhalter);
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
	public void setBalisenhalter(Balisenhalter_TypeClass newBalisenhalter) {
		if (newBalisenhalter != balisenhalter) {
			NotificationChain msgs = null;
			if (balisenhalter != null)
				msgs = ((InternalEObject)balisenhalter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISENHALTER, null, msgs);
			if (newBalisenhalter != null)
				msgs = ((InternalEObject)newBalisenhalter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISENHALTER, null, msgs);
			msgs = basicSetBalisenhalter(newBalisenhalter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISENHALTER, newBalisenhalter, newBalisenhalter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fabrikat_TypeClass getFabrikat() {
		return fabrikat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFabrikat(Fabrikat_TypeClass newFabrikat, NotificationChain msgs) {
		Fabrikat_TypeClass oldFabrikat = fabrikat;
		fabrikat = newFabrikat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__FABRIKAT, oldFabrikat, newFabrikat);
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
	public void setFabrikat(Fabrikat_TypeClass newFabrikat) {
		if (newFabrikat != fabrikat) {
			NotificationChain msgs = null;
			if (fabrikat != null)
				msgs = ((InternalEObject)fabrikat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__FABRIKAT, null, msgs);
			if (newFabrikat != null)
				msgs = ((InternalEObject)newFabrikat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__FABRIKAT, null, msgs);
			msgs = basicSetFabrikat(newFabrikat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__FABRIKAT, newFabrikat, newFabrikat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hersteller_TypeClass getHersteller() {
		return hersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHersteller(Hersteller_TypeClass newHersteller, NotificationChain msgs) {
		Hersteller_TypeClass oldHersteller = hersteller;
		hersteller = newHersteller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HERSTELLER, oldHersteller, newHersteller);
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
	public void setHersteller(Hersteller_TypeClass newHersteller) {
		if (newHersteller != hersteller) {
			NotificationChain msgs = null;
			if (hersteller != null)
				msgs = ((InternalEObject)hersteller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			if (newHersteller != null)
				msgs = ((InternalEObject)newHersteller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			msgs = basicSetHersteller(newHersteller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HERSTELLER, newHersteller, newHersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hinweis_Balisenbefestigung_TypeClass getHinweisBalisenbefestigung() {
		return hinweisBalisenbefestigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHinweisBalisenbefestigung(Hinweis_Balisenbefestigung_TypeClass newHinweisBalisenbefestigung, NotificationChain msgs) {
		Hinweis_Balisenbefestigung_TypeClass oldHinweisBalisenbefestigung = hinweisBalisenbefestigung;
		hinweisBalisenbefestigung = newHinweisBalisenbefestigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HINWEIS_BALISENBEFESTIGUNG, oldHinweisBalisenbefestigung, newHinweisBalisenbefestigung);
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
	public void setHinweisBalisenbefestigung(Hinweis_Balisenbefestigung_TypeClass newHinweisBalisenbefestigung) {
		if (newHinweisBalisenbefestigung != hinweisBalisenbefestigung) {
			NotificationChain msgs = null;
			if (hinweisBalisenbefestigung != null)
				msgs = ((InternalEObject)hinweisBalisenbefestigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HINWEIS_BALISENBEFESTIGUNG, null, msgs);
			if (newHinweisBalisenbefestigung != null)
				msgs = ((InternalEObject)newHinweisBalisenbefestigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HINWEIS_BALISENBEFESTIGUNG, null, msgs);
			msgs = basicSetHinweisBalisenbefestigung(newHinweisBalisenbefestigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HINWEIS_BALISENBEFESTIGUNG, newHinweisBalisenbefestigung, newHinweisBalisenbefestigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Montageabweichung_TypeClass getMontageabweichung() {
		return montageabweichung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMontageabweichung(Montageabweichung_TypeClass newMontageabweichung, NotificationChain msgs) {
		Montageabweichung_TypeClass oldMontageabweichung = montageabweichung;
		montageabweichung = newMontageabweichung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__MONTAGEABWEICHUNG, oldMontageabweichung, newMontageabweichung);
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
	public void setMontageabweichung(Montageabweichung_TypeClass newMontageabweichung) {
		if (newMontageabweichung != montageabweichung) {
			NotificationChain msgs = null;
			if (montageabweichung != null)
				msgs = ((InternalEObject)montageabweichung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__MONTAGEABWEICHUNG, null, msgs);
			if (newMontageabweichung != null)
				msgs = ((InternalEObject)newMontageabweichung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__MONTAGEABWEICHUNG, null, msgs);
			msgs = basicSetMontageabweichung(newMontageabweichung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__MONTAGEABWEICHUNG, newMontageabweichung, newMontageabweichung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__ANORDNUNG_IM_DP:
				return basicSetAnordnungImDP(null, msgs);
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISE_GERAETESTAND:
				return basicSetBaliseGeraetestand(null, msgs);
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISENHALTER:
				return basicSetBalisenhalter(null, msgs);
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__FABRIKAT:
				return basicSetFabrikat(null, msgs);
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return basicSetHersteller(null, msgs);
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HINWEIS_BALISENBEFESTIGUNG:
				return basicSetHinweisBalisenbefestigung(null, msgs);
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__MONTAGEABWEICHUNG:
				return basicSetMontageabweichung(null, msgs);
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
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__ANORDNUNG_IM_DP:
				return getAnordnungImDP();
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISE_GERAETESTAND:
				return getBaliseGeraetestand();
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISENHALTER:
				return getBalisenhalter();
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__FABRIKAT:
				return getFabrikat();
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return getHersteller();
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HINWEIS_BALISENBEFESTIGUNG:
				return getHinweisBalisenbefestigung();
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__MONTAGEABWEICHUNG:
				return getMontageabweichung();
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
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__ANORDNUNG_IM_DP:
				setAnordnungImDP((Anordnung_Im_DP_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISE_GERAETESTAND:
				setBaliseGeraetestand((Balise_Geraetestand_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISENHALTER:
				setBalisenhalter((Balisenhalter_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__FABRIKAT:
				setFabrikat((Fabrikat_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HINWEIS_BALISENBEFESTIGUNG:
				setHinweisBalisenbefestigung((Hinweis_Balisenbefestigung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__MONTAGEABWEICHUNG:
				setMontageabweichung((Montageabweichung_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__ANORDNUNG_IM_DP:
				setAnordnungImDP((Anordnung_Im_DP_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISE_GERAETESTAND:
				setBaliseGeraetestand((Balise_Geraetestand_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISENHALTER:
				setBalisenhalter((Balisenhalter_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__FABRIKAT:
				setFabrikat((Fabrikat_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HINWEIS_BALISENBEFESTIGUNG:
				setHinweisBalisenbefestigung((Hinweis_Balisenbefestigung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__MONTAGEABWEICHUNG:
				setMontageabweichung((Montageabweichung_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__ANORDNUNG_IM_DP:
				return anordnungImDP != null;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISE_GERAETESTAND:
				return baliseGeraetestand != null;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__BALISENHALTER:
				return balisenhalter != null;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__FABRIKAT:
				return fabrikat != null;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return hersteller != null;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__HINWEIS_BALISENBEFESTIGUNG:
				return hinweisBalisenbefestigung != null;
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP__MONTAGEABWEICHUNG:
				return montageabweichung != null;
		}
		return super.eIsSet(featureID);
	}

} //Balise_Allg_AttributeGroupImpl
