/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

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

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Bes_Langer_Einfahrweg_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_V_La_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Individualisierung_Weitere_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Laenge_Gestufte_V_Signalisierung_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_TSR_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Projektierungsfall_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Telegrammnummer_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ueberwachung_Laenge_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Start_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Ziel_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Vorsignalabstand_TypeClass;

import org.eclipse.set.model.planpro.Verweise.ID_Signal_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT ESG Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getAbstandBesLangerEinfahrweg <em>Abstand Bes Langer Einfahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getDPTypVLa <em>DP Typ VLa</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getESGIndividuelleMerkmale <em>ESG Individuelle Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getESGSpezifischeMerkmale <em>ESG Spezifische Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getIDMassgebendesZielsignal <em>ID Massgebendes Zielsignal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getIndividualisierungWeitere <em>Individualisierung Weitere</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getLaengeGestufteVSignalisierung <em>Laenge Gestufte VSignalisierung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getNIDTSR <em>NIDTSR</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getProjektierungsfall <em>Projektierungsfall</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getTelegrammnummer <em>Telegrammnummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getUeberwachungLaenge <em>Ueberwachung Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getVStart <em>VStart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getVZiel <em>VZiel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ESG_Merkmale_AttributeGroupImpl#getVorsignalabstand <em>Vorsignalabstand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_ESG_Merkmale_AttributeGroupImpl extends EObjectImpl implements FT_ESG_Merkmale_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAbstandBesLangerEinfahrweg() <em>Abstand Bes Langer Einfahrweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandBesLangerEinfahrweg()
	 * @generated
	 * @ordered
	 */
	protected Abstand_Bes_Langer_Einfahrweg_TypeClass abstandBesLangerEinfahrweg;

	/**
	 * The cached value of the '{@link #getDPTypVLa() <em>DP Typ VLa</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypVLa()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_V_La_TypeClass dPTypVLa;

	/**
	 * The cached value of the '{@link #getESGIndividuelleMerkmale() <em>ESG Individuelle Merkmale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESGIndividuelleMerkmale()
	 * @generated
	 * @ordered
	 */
	protected EList<ESG_Individuelle_Merkmale_AttributeGroup> eSGIndividuelleMerkmale;

	/**
	 * The cached value of the '{@link #getESGSpezifischeMerkmale() <em>ESG Spezifische Merkmale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESGSpezifischeMerkmale()
	 * @generated
	 * @ordered
	 */
	protected EList<ESG_Spezifische_Merkmale_AttributeGroup> eSGSpezifischeMerkmale;

	/**
	 * The cached value of the '{@link #getIDMassgebendesZielsignal() <em>ID Massgebendes Zielsignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDMassgebendesZielsignal()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_ohne_Proxy_TypeClass iDMassgebendesZielsignal;

	/**
	 * The cached value of the '{@link #getIndividualisierungWeitere() <em>Individualisierung Weitere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualisierungWeitere()
	 * @generated
	 * @ordered
	 */
	protected Individualisierung_Weitere_TypeClass individualisierungWeitere;

	/**
	 * The cached value of the '{@link #getLaengeGestufteVSignalisierung() <em>Laenge Gestufte VSignalisierung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaengeGestufteVSignalisierung()
	 * @generated
	 * @ordered
	 */
	protected Laenge_Gestufte_V_Signalisierung_TypeClass laengeGestufteVSignalisierung;

	/**
	 * The cached value of the '{@link #getNIDTSR() <em>NIDTSR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNIDTSR()
	 * @generated
	 * @ordered
	 */
	protected NID_TSR_TypeClass nIDTSR;

	/**
	 * The cached value of the '{@link #getProjektierungsfall() <em>Projektierungsfall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjektierungsfall()
	 * @generated
	 * @ordered
	 */
	protected Projektierungsfall_TypeClass projektierungsfall;

	/**
	 * The cached value of the '{@link #getTelegrammnummer() <em>Telegrammnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegrammnummer()
	 * @generated
	 * @ordered
	 */
	protected Telegrammnummer_TypeClass telegrammnummer;

	/**
	 * The cached value of the '{@link #getUeberwachungLaenge() <em>Ueberwachung Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeberwachungLaenge()
	 * @generated
	 * @ordered
	 */
	protected Ueberwachung_Laenge_TypeClass ueberwachungLaenge;

	/**
	 * The cached value of the '{@link #getVStart() <em>VStart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVStart()
	 * @generated
	 * @ordered
	 */
	protected V_Start_TypeClass vStart;

	/**
	 * The cached value of the '{@link #getVZiel() <em>VZiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVZiel()
	 * @generated
	 * @ordered
	 */
	protected V_Ziel_TypeClass vZiel;

	/**
	 * The cached value of the '{@link #getVorsignalabstand() <em>Vorsignalabstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorsignalabstand()
	 * @generated
	 * @ordered
	 */
	protected Vorsignalabstand_TypeClass vorsignalabstand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_ESG_Merkmale_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Bes_Langer_Einfahrweg_TypeClass getAbstandBesLangerEinfahrweg() {
		return abstandBesLangerEinfahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandBesLangerEinfahrweg(Abstand_Bes_Langer_Einfahrweg_TypeClass newAbstandBesLangerEinfahrweg, NotificationChain msgs) {
		Abstand_Bes_Langer_Einfahrweg_TypeClass oldAbstandBesLangerEinfahrweg = abstandBesLangerEinfahrweg;
		abstandBesLangerEinfahrweg = newAbstandBesLangerEinfahrweg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ABSTAND_BES_LANGER_EINFAHRWEG, oldAbstandBesLangerEinfahrweg, newAbstandBesLangerEinfahrweg);
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
	public void setAbstandBesLangerEinfahrweg(Abstand_Bes_Langer_Einfahrweg_TypeClass newAbstandBesLangerEinfahrweg) {
		if (newAbstandBesLangerEinfahrweg != abstandBesLangerEinfahrweg) {
			NotificationChain msgs = null;
			if (abstandBesLangerEinfahrweg != null)
				msgs = ((InternalEObject)abstandBesLangerEinfahrweg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ABSTAND_BES_LANGER_EINFAHRWEG, null, msgs);
			if (newAbstandBesLangerEinfahrweg != null)
				msgs = ((InternalEObject)newAbstandBesLangerEinfahrweg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ABSTAND_BES_LANGER_EINFAHRWEG, null, msgs);
			msgs = basicSetAbstandBesLangerEinfahrweg(newAbstandBesLangerEinfahrweg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ABSTAND_BES_LANGER_EINFAHRWEG, newAbstandBesLangerEinfahrweg, newAbstandBesLangerEinfahrweg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_V_La_TypeClass getDPTypVLa() {
		return dPTypVLa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypVLa(DP_Typ_V_La_TypeClass newDPTypVLa, NotificationChain msgs) {
		DP_Typ_V_La_TypeClass oldDPTypVLa = dPTypVLa;
		dPTypVLa = newDPTypVLa;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA, oldDPTypVLa, newDPTypVLa);
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
	public void setDPTypVLa(DP_Typ_V_La_TypeClass newDPTypVLa) {
		if (newDPTypVLa != dPTypVLa) {
			NotificationChain msgs = null;
			if (dPTypVLa != null)
				msgs = ((InternalEObject)dPTypVLa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA, null, msgs);
			if (newDPTypVLa != null)
				msgs = ((InternalEObject)newDPTypVLa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA, null, msgs);
			msgs = basicSetDPTypVLa(newDPTypVLa, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA, newDPTypVLa, newDPTypVLa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ESG_Individuelle_Merkmale_AttributeGroup> getESGIndividuelleMerkmale() {
		if (eSGIndividuelleMerkmale == null) {
			eSGIndividuelleMerkmale = new EObjectContainmentEList<ESG_Individuelle_Merkmale_AttributeGroup>(ESG_Individuelle_Merkmale_AttributeGroup.class, this, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_INDIVIDUELLE_MERKMALE);
		}
		return eSGIndividuelleMerkmale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ESG_Spezifische_Merkmale_AttributeGroup> getESGSpezifischeMerkmale() {
		if (eSGSpezifischeMerkmale == null) {
			eSGSpezifischeMerkmale = new EObjectContainmentEList<ESG_Spezifische_Merkmale_AttributeGroup>(ESG_Spezifische_Merkmale_AttributeGroup.class, this, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_SPEZIFISCHE_MERKMALE);
		}
		return eSGSpezifischeMerkmale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_ohne_Proxy_TypeClass getIDMassgebendesZielsignal() {
		return iDMassgebendesZielsignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDMassgebendesZielsignal(ID_Signal_ohne_Proxy_TypeClass newIDMassgebendesZielsignal, NotificationChain msgs) {
		ID_Signal_ohne_Proxy_TypeClass oldIDMassgebendesZielsignal = iDMassgebendesZielsignal;
		iDMassgebendesZielsignal = newIDMassgebendesZielsignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ID_MASSGEBENDES_ZIELSIGNAL, oldIDMassgebendesZielsignal, newIDMassgebendesZielsignal);
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
	public void setIDMassgebendesZielsignal(ID_Signal_ohne_Proxy_TypeClass newIDMassgebendesZielsignal) {
		if (newIDMassgebendesZielsignal != iDMassgebendesZielsignal) {
			NotificationChain msgs = null;
			if (iDMassgebendesZielsignal != null)
				msgs = ((InternalEObject)iDMassgebendesZielsignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ID_MASSGEBENDES_ZIELSIGNAL, null, msgs);
			if (newIDMassgebendesZielsignal != null)
				msgs = ((InternalEObject)newIDMassgebendesZielsignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ID_MASSGEBENDES_ZIELSIGNAL, null, msgs);
			msgs = basicSetIDMassgebendesZielsignal(newIDMassgebendesZielsignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ID_MASSGEBENDES_ZIELSIGNAL, newIDMassgebendesZielsignal, newIDMassgebendesZielsignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Individualisierung_Weitere_TypeClass getIndividualisierungWeitere() {
		return individualisierungWeitere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividualisierungWeitere(Individualisierung_Weitere_TypeClass newIndividualisierungWeitere, NotificationChain msgs) {
		Individualisierung_Weitere_TypeClass oldIndividualisierungWeitere = individualisierungWeitere;
		individualisierungWeitere = newIndividualisierungWeitere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__INDIVIDUALISIERUNG_WEITERE, oldIndividualisierungWeitere, newIndividualisierungWeitere);
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
	public void setIndividualisierungWeitere(Individualisierung_Weitere_TypeClass newIndividualisierungWeitere) {
		if (newIndividualisierungWeitere != individualisierungWeitere) {
			NotificationChain msgs = null;
			if (individualisierungWeitere != null)
				msgs = ((InternalEObject)individualisierungWeitere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__INDIVIDUALISIERUNG_WEITERE, null, msgs);
			if (newIndividualisierungWeitere != null)
				msgs = ((InternalEObject)newIndividualisierungWeitere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__INDIVIDUALISIERUNG_WEITERE, null, msgs);
			msgs = basicSetIndividualisierungWeitere(newIndividualisierungWeitere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__INDIVIDUALISIERUNG_WEITERE, newIndividualisierungWeitere, newIndividualisierungWeitere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Laenge_Gestufte_V_Signalisierung_TypeClass getLaengeGestufteVSignalisierung() {
		return laengeGestufteVSignalisierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaengeGestufteVSignalisierung(Laenge_Gestufte_V_Signalisierung_TypeClass newLaengeGestufteVSignalisierung, NotificationChain msgs) {
		Laenge_Gestufte_V_Signalisierung_TypeClass oldLaengeGestufteVSignalisierung = laengeGestufteVSignalisierung;
		laengeGestufteVSignalisierung = newLaengeGestufteVSignalisierung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LAENGE_GESTUFTE_VSIGNALISIERUNG, oldLaengeGestufteVSignalisierung, newLaengeGestufteVSignalisierung);
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
	public void setLaengeGestufteVSignalisierung(Laenge_Gestufte_V_Signalisierung_TypeClass newLaengeGestufteVSignalisierung) {
		if (newLaengeGestufteVSignalisierung != laengeGestufteVSignalisierung) {
			NotificationChain msgs = null;
			if (laengeGestufteVSignalisierung != null)
				msgs = ((InternalEObject)laengeGestufteVSignalisierung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LAENGE_GESTUFTE_VSIGNALISIERUNG, null, msgs);
			if (newLaengeGestufteVSignalisierung != null)
				msgs = ((InternalEObject)newLaengeGestufteVSignalisierung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LAENGE_GESTUFTE_VSIGNALISIERUNG, null, msgs);
			msgs = basicSetLaengeGestufteVSignalisierung(newLaengeGestufteVSignalisierung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LAENGE_GESTUFTE_VSIGNALISIERUNG, newLaengeGestufteVSignalisierung, newLaengeGestufteVSignalisierung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_TSR_TypeClass getNIDTSR() {
		return nIDTSR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNIDTSR(NID_TSR_TypeClass newNIDTSR, NotificationChain msgs) {
		NID_TSR_TypeClass oldNIDTSR = nIDTSR;
		nIDTSR = newNIDTSR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__NIDTSR, oldNIDTSR, newNIDTSR);
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
	public void setNIDTSR(NID_TSR_TypeClass newNIDTSR) {
		if (newNIDTSR != nIDTSR) {
			NotificationChain msgs = null;
			if (nIDTSR != null)
				msgs = ((InternalEObject)nIDTSR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__NIDTSR, null, msgs);
			if (newNIDTSR != null)
				msgs = ((InternalEObject)newNIDTSR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__NIDTSR, null, msgs);
			msgs = basicSetNIDTSR(newNIDTSR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__NIDTSR, newNIDTSR, newNIDTSR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Projektierungsfall_TypeClass getProjektierungsfall() {
		return projektierungsfall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjektierungsfall(Projektierungsfall_TypeClass newProjektierungsfall, NotificationChain msgs) {
		Projektierungsfall_TypeClass oldProjektierungsfall = projektierungsfall;
		projektierungsfall = newProjektierungsfall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__PROJEKTIERUNGSFALL, oldProjektierungsfall, newProjektierungsfall);
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
	public void setProjektierungsfall(Projektierungsfall_TypeClass newProjektierungsfall) {
		if (newProjektierungsfall != projektierungsfall) {
			NotificationChain msgs = null;
			if (projektierungsfall != null)
				msgs = ((InternalEObject)projektierungsfall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__PROJEKTIERUNGSFALL, null, msgs);
			if (newProjektierungsfall != null)
				msgs = ((InternalEObject)newProjektierungsfall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__PROJEKTIERUNGSFALL, null, msgs);
			msgs = basicSetProjektierungsfall(newProjektierungsfall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__PROJEKTIERUNGSFALL, newProjektierungsfall, newProjektierungsfall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegrammnummer_TypeClass getTelegrammnummer() {
		return telegrammnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegrammnummer(Telegrammnummer_TypeClass newTelegrammnummer, NotificationChain msgs) {
		Telegrammnummer_TypeClass oldTelegrammnummer = telegrammnummer;
		telegrammnummer = newTelegrammnummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER, oldTelegrammnummer, newTelegrammnummer);
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
	public void setTelegrammnummer(Telegrammnummer_TypeClass newTelegrammnummer) {
		if (newTelegrammnummer != telegrammnummer) {
			NotificationChain msgs = null;
			if (telegrammnummer != null)
				msgs = ((InternalEObject)telegrammnummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER, null, msgs);
			if (newTelegrammnummer != null)
				msgs = ((InternalEObject)newTelegrammnummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER, null, msgs);
			msgs = basicSetTelegrammnummer(newTelegrammnummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER, newTelegrammnummer, newTelegrammnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberwachung_Laenge_TypeClass getUeberwachungLaenge() {
		return ueberwachungLaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUeberwachungLaenge(Ueberwachung_Laenge_TypeClass newUeberwachungLaenge, NotificationChain msgs) {
		Ueberwachung_Laenge_TypeClass oldUeberwachungLaenge = ueberwachungLaenge;
		ueberwachungLaenge = newUeberwachungLaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE, oldUeberwachungLaenge, newUeberwachungLaenge);
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
	public void setUeberwachungLaenge(Ueberwachung_Laenge_TypeClass newUeberwachungLaenge) {
		if (newUeberwachungLaenge != ueberwachungLaenge) {
			NotificationChain msgs = null;
			if (ueberwachungLaenge != null)
				msgs = ((InternalEObject)ueberwachungLaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE, null, msgs);
			if (newUeberwachungLaenge != null)
				msgs = ((InternalEObject)newUeberwachungLaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE, null, msgs);
			msgs = basicSetUeberwachungLaenge(newUeberwachungLaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE, newUeberwachungLaenge, newUeberwachungLaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Start_TypeClass getVStart() {
		return vStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVStart(V_Start_TypeClass newVStart, NotificationChain msgs) {
		V_Start_TypeClass oldVStart = vStart;
		vStart = newVStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VSTART, oldVStart, newVStart);
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
	public void setVStart(V_Start_TypeClass newVStart) {
		if (newVStart != vStart) {
			NotificationChain msgs = null;
			if (vStart != null)
				msgs = ((InternalEObject)vStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VSTART, null, msgs);
			if (newVStart != null)
				msgs = ((InternalEObject)newVStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VSTART, null, msgs);
			msgs = basicSetVStart(newVStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VSTART, newVStart, newVStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Ziel_TypeClass getVZiel() {
		return vZiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVZiel(V_Ziel_TypeClass newVZiel, NotificationChain msgs) {
		V_Ziel_TypeClass oldVZiel = vZiel;
		vZiel = newVZiel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VZIEL, oldVZiel, newVZiel);
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
	public void setVZiel(V_Ziel_TypeClass newVZiel) {
		if (newVZiel != vZiel) {
			NotificationChain msgs = null;
			if (vZiel != null)
				msgs = ((InternalEObject)vZiel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VZIEL, null, msgs);
			if (newVZiel != null)
				msgs = ((InternalEObject)newVZiel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VZIEL, null, msgs);
			msgs = basicSetVZiel(newVZiel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VZIEL, newVZiel, newVZiel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vorsignalabstand_TypeClass getVorsignalabstand() {
		return vorsignalabstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVorsignalabstand(Vorsignalabstand_TypeClass newVorsignalabstand, NotificationChain msgs) {
		Vorsignalabstand_TypeClass oldVorsignalabstand = vorsignalabstand;
		vorsignalabstand = newVorsignalabstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VORSIGNALABSTAND, oldVorsignalabstand, newVorsignalabstand);
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
	public void setVorsignalabstand(Vorsignalabstand_TypeClass newVorsignalabstand) {
		if (newVorsignalabstand != vorsignalabstand) {
			NotificationChain msgs = null;
			if (vorsignalabstand != null)
				msgs = ((InternalEObject)vorsignalabstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VORSIGNALABSTAND, null, msgs);
			if (newVorsignalabstand != null)
				msgs = ((InternalEObject)newVorsignalabstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VORSIGNALABSTAND, null, msgs);
			msgs = basicSetVorsignalabstand(newVorsignalabstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VORSIGNALABSTAND, newVorsignalabstand, newVorsignalabstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ABSTAND_BES_LANGER_EINFAHRWEG:
				return basicSetAbstandBesLangerEinfahrweg(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA:
				return basicSetDPTypVLa(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_INDIVIDUELLE_MERKMALE:
				return ((InternalEList<?>)getESGIndividuelleMerkmale()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_SPEZIFISCHE_MERKMALE:
				return ((InternalEList<?>)getESGSpezifischeMerkmale()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ID_MASSGEBENDES_ZIELSIGNAL:
				return basicSetIDMassgebendesZielsignal(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__INDIVIDUALISIERUNG_WEITERE:
				return basicSetIndividualisierungWeitere(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LAENGE_GESTUFTE_VSIGNALISIERUNG:
				return basicSetLaengeGestufteVSignalisierung(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__NIDTSR:
				return basicSetNIDTSR(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__PROJEKTIERUNGSFALL:
				return basicSetProjektierungsfall(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER:
				return basicSetTelegrammnummer(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE:
				return basicSetUeberwachungLaenge(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VSTART:
				return basicSetVStart(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VZIEL:
				return basicSetVZiel(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VORSIGNALABSTAND:
				return basicSetVorsignalabstand(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ABSTAND_BES_LANGER_EINFAHRWEG:
				return getAbstandBesLangerEinfahrweg();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA:
				return getDPTypVLa();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_INDIVIDUELLE_MERKMALE:
				return getESGIndividuelleMerkmale();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_SPEZIFISCHE_MERKMALE:
				return getESGSpezifischeMerkmale();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ID_MASSGEBENDES_ZIELSIGNAL:
				return getIDMassgebendesZielsignal();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__INDIVIDUALISIERUNG_WEITERE:
				return getIndividualisierungWeitere();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LAENGE_GESTUFTE_VSIGNALISIERUNG:
				return getLaengeGestufteVSignalisierung();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__NIDTSR:
				return getNIDTSR();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__PROJEKTIERUNGSFALL:
				return getProjektierungsfall();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER:
				return getTelegrammnummer();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE:
				return getUeberwachungLaenge();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VSTART:
				return getVStart();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VZIEL:
				return getVZiel();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VORSIGNALABSTAND:
				return getVorsignalabstand();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
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
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ABSTAND_BES_LANGER_EINFAHRWEG:
				setAbstandBesLangerEinfahrweg((Abstand_Bes_Langer_Einfahrweg_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA:
				setDPTypVLa((DP_Typ_V_La_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_INDIVIDUELLE_MERKMALE:
				getESGIndividuelleMerkmale().clear();
				getESGIndividuelleMerkmale().addAll((Collection<? extends ESG_Individuelle_Merkmale_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_SPEZIFISCHE_MERKMALE:
				getESGSpezifischeMerkmale().clear();
				getESGSpezifischeMerkmale().addAll((Collection<? extends ESG_Spezifische_Merkmale_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ID_MASSGEBENDES_ZIELSIGNAL:
				setIDMassgebendesZielsignal((ID_Signal_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__INDIVIDUALISIERUNG_WEITERE:
				setIndividualisierungWeitere((Individualisierung_Weitere_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LAENGE_GESTUFTE_VSIGNALISIERUNG:
				setLaengeGestufteVSignalisierung((Laenge_Gestufte_V_Signalisierung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__NIDTSR:
				setNIDTSR((NID_TSR_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__PROJEKTIERUNGSFALL:
				setProjektierungsfall((Projektierungsfall_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER:
				setTelegrammnummer((Telegrammnummer_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE:
				setUeberwachungLaenge((Ueberwachung_Laenge_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VSTART:
				setVStart((V_Start_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VZIEL:
				setVZiel((V_Ziel_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VORSIGNALABSTAND:
				setVorsignalabstand((Vorsignalabstand_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ABSTAND_BES_LANGER_EINFAHRWEG:
				setAbstandBesLangerEinfahrweg((Abstand_Bes_Langer_Einfahrweg_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA:
				setDPTypVLa((DP_Typ_V_La_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_INDIVIDUELLE_MERKMALE:
				getESGIndividuelleMerkmale().clear();
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_SPEZIFISCHE_MERKMALE:
				getESGSpezifischeMerkmale().clear();
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ID_MASSGEBENDES_ZIELSIGNAL:
				setIDMassgebendesZielsignal((ID_Signal_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__INDIVIDUALISIERUNG_WEITERE:
				setIndividualisierungWeitere((Individualisierung_Weitere_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LAENGE_GESTUFTE_VSIGNALISIERUNG:
				setLaengeGestufteVSignalisierung((Laenge_Gestufte_V_Signalisierung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__NIDTSR:
				setNIDTSR((NID_TSR_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__PROJEKTIERUNGSFALL:
				setProjektierungsfall((Projektierungsfall_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER:
				setTelegrammnummer((Telegrammnummer_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE:
				setUeberwachungLaenge((Ueberwachung_Laenge_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VSTART:
				setVStart((V_Start_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VZIEL:
				setVZiel((V_Ziel_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VORSIGNALABSTAND:
				setVorsignalabstand((Vorsignalabstand_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ABSTAND_BES_LANGER_EINFAHRWEG:
				return abstandBesLangerEinfahrweg != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA:
				return dPTypVLa != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_INDIVIDUELLE_MERKMALE:
				return eSGIndividuelleMerkmale != null && !eSGIndividuelleMerkmale.isEmpty();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_SPEZIFISCHE_MERKMALE:
				return eSGSpezifischeMerkmale != null && !eSGSpezifischeMerkmale.isEmpty();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ID_MASSGEBENDES_ZIELSIGNAL:
				return iDMassgebendesZielsignal != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__INDIVIDUALISIERUNG_WEITERE:
				return individualisierungWeitere != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LAENGE_GESTUFTE_VSIGNALISIERUNG:
				return laengeGestufteVSignalisierung != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__NIDTSR:
				return nIDTSR != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__PROJEKTIERUNGSFALL:
				return projektierungsfall != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER:
				return telegrammnummer != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE:
				return ueberwachungLaenge != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VSTART:
				return vStart != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VZIEL:
				return vZiel != null;
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VORSIGNALABSTAND:
				return vorsignalabstand != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //FT_ESG_Merkmale_AttributeGroupImpl
