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

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_Hinweis_Funktion_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ZBS_Merkmale_La_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ZBS_Typ_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.LM_G_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Laenge_1_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Massgebende_Neig_1_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Massgebende_Neig_Schutzstrecke_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Mastschild_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Schutzstrecke_Erforderlich_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Schutzstrecke_Vorhanden_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Telegrammnummer_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Ueberwachung_Laenge_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.VGR_1_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.VGR_2_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.V_Befehl_R_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.V_Befehl_Z_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.V_Frei_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.V_Zul_Strecke_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT ZBS Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getFTHinweisFunktion <em>FT Hinweis Funktion</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getFTZBSMerkmaleLa <em>FTZBS Merkmale La</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getFTZBSTyp <em>FTZBS Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getLaenge1 <em>Laenge1</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getLMG <em>LMG</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getMassgebendeNeig1 <em>Massgebende Neig1</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getMassgebendeNeigSchutzstrecke <em>Massgebende Neig Schutzstrecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getMastschild <em>Mastschild</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getSchutzstreckeErforderlich <em>Schutzstrecke Erforderlich</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getSchutzstreckeVorhanden <em>Schutzstrecke Vorhanden</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getTelegrammnummer <em>Telegrammnummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getUeberwachungLaenge <em>Ueberwachung Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getVBefehlR <em>VBefehl R</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getVBefehlZ <em>VBefehl Z</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getVFrei <em>VFrei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getVZulStrecke <em>VZul Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getVGR1 <em>VGR1</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_AttributeGroupImpl#getVGR2 <em>VGR2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_ZBS_Merkmale_AttributeGroupImpl extends EObjectImpl implements FT_ZBS_Merkmale_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFTHinweisFunktion() <em>FT Hinweis Funktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTHinweisFunktion()
	 * @generated
	 * @ordered
	 */
	protected FT_Hinweis_Funktion_TypeClass fTHinweisFunktion;

	/**
	 * The cached value of the '{@link #getFTZBSMerkmaleLa() <em>FTZBS Merkmale La</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTZBSMerkmaleLa()
	 * @generated
	 * @ordered
	 */
	protected EList<FT_ZBS_Merkmale_La_AttributeGroup> fTZBSMerkmaleLa;

	/**
	 * The cached value of the '{@link #getFTZBSTyp() <em>FTZBS Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTZBSTyp()
	 * @generated
	 * @ordered
	 */
	protected FT_ZBS_Typ_TypeClass fTZBSTyp;

	/**
	 * The cached value of the '{@link #getLaenge1() <em>Laenge1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaenge1()
	 * @generated
	 * @ordered
	 */
	protected Laenge_1_TypeClass laenge1;

	/**
	 * The cached value of the '{@link #getLMG() <em>LMG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLMG()
	 * @generated
	 * @ordered
	 */
	protected LM_G_TypeClass lMG;

	/**
	 * The cached value of the '{@link #getMassgebendeNeig1() <em>Massgebende Neig1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassgebendeNeig1()
	 * @generated
	 * @ordered
	 */
	protected Massgebende_Neig_1_TypeClass massgebendeNeig1;

	/**
	 * The cached value of the '{@link #getMassgebendeNeigSchutzstrecke() <em>Massgebende Neig Schutzstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassgebendeNeigSchutzstrecke()
	 * @generated
	 * @ordered
	 */
	protected Massgebende_Neig_Schutzstrecke_TypeClass massgebendeNeigSchutzstrecke;

	/**
	 * The cached value of the '{@link #getMastschild() <em>Mastschild</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMastschild()
	 * @generated
	 * @ordered
	 */
	protected Mastschild_TypeClass mastschild;

	/**
	 * The cached value of the '{@link #getSchutzstreckeErforderlich() <em>Schutzstrecke Erforderlich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchutzstreckeErforderlich()
	 * @generated
	 * @ordered
	 */
	protected Schutzstrecke_Erforderlich_TypeClass schutzstreckeErforderlich;

	/**
	 * The cached value of the '{@link #getSchutzstreckeVorhanden() <em>Schutzstrecke Vorhanden</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchutzstreckeVorhanden()
	 * @generated
	 * @ordered
	 */
	protected Schutzstrecke_Vorhanden_TypeClass schutzstreckeVorhanden;

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
	 * The cached value of the '{@link #getVBefehlR() <em>VBefehl R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVBefehlR()
	 * @generated
	 * @ordered
	 */
	protected V_Befehl_R_TypeClass vBefehlR;

	/**
	 * The cached value of the '{@link #getVBefehlZ() <em>VBefehl Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVBefehlZ()
	 * @generated
	 * @ordered
	 */
	protected V_Befehl_Z_TypeClass vBefehlZ;

	/**
	 * The cached value of the '{@link #getVFrei() <em>VFrei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVFrei()
	 * @generated
	 * @ordered
	 */
	protected V_Frei_TypeClass vFrei;

	/**
	 * The cached value of the '{@link #getVZulStrecke() <em>VZul Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVZulStrecke()
	 * @generated
	 * @ordered
	 */
	protected V_Zul_Strecke_TypeClass vZulStrecke;

	/**
	 * The cached value of the '{@link #getVGR1() <em>VGR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVGR1()
	 * @generated
	 * @ordered
	 */
	protected VGR_1_TypeClass vGR1;

	/**
	 * The cached value of the '{@link #getVGR2() <em>VGR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVGR2()
	 * @generated
	 * @ordered
	 */
	protected VGR_2_TypeClass vGR2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_ZBS_Merkmale_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_Hinweis_Funktion_TypeClass getFTHinweisFunktion() {
		return fTHinweisFunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTHinweisFunktion(FT_Hinweis_Funktion_TypeClass newFTHinweisFunktion, NotificationChain msgs) {
		FT_Hinweis_Funktion_TypeClass oldFTHinweisFunktion = fTHinweisFunktion;
		fTHinweisFunktion = newFTHinweisFunktion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FT_HINWEIS_FUNKTION, oldFTHinweisFunktion, newFTHinweisFunktion);
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
	public void setFTHinweisFunktion(FT_Hinweis_Funktion_TypeClass newFTHinweisFunktion) {
		if (newFTHinweisFunktion != fTHinweisFunktion) {
			NotificationChain msgs = null;
			if (fTHinweisFunktion != null)
				msgs = ((InternalEObject)fTHinweisFunktion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FT_HINWEIS_FUNKTION, null, msgs);
			if (newFTHinweisFunktion != null)
				msgs = ((InternalEObject)newFTHinweisFunktion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FT_HINWEIS_FUNKTION, null, msgs);
			msgs = basicSetFTHinweisFunktion(newFTHinweisFunktion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FT_HINWEIS_FUNKTION, newFTHinweisFunktion, newFTHinweisFunktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FT_ZBS_Merkmale_La_AttributeGroup> getFTZBSMerkmaleLa() {
		if (fTZBSMerkmaleLa == null) {
			fTZBSMerkmaleLa = new EObjectContainmentEList<FT_ZBS_Merkmale_La_AttributeGroup>(FT_ZBS_Merkmale_La_AttributeGroup.class, this, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_MERKMALE_LA);
		}
		return fTZBSMerkmaleLa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ZBS_Typ_TypeClass getFTZBSTyp() {
		return fTZBSTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTZBSTyp(FT_ZBS_Typ_TypeClass newFTZBSTyp, NotificationChain msgs) {
		FT_ZBS_Typ_TypeClass oldFTZBSTyp = fTZBSTyp;
		fTZBSTyp = newFTZBSTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_TYP, oldFTZBSTyp, newFTZBSTyp);
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
	public void setFTZBSTyp(FT_ZBS_Typ_TypeClass newFTZBSTyp) {
		if (newFTZBSTyp != fTZBSTyp) {
			NotificationChain msgs = null;
			if (fTZBSTyp != null)
				msgs = ((InternalEObject)fTZBSTyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_TYP, null, msgs);
			if (newFTZBSTyp != null)
				msgs = ((InternalEObject)newFTZBSTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_TYP, null, msgs);
			msgs = basicSetFTZBSTyp(newFTZBSTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_TYP, newFTZBSTyp, newFTZBSTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Laenge_1_TypeClass getLaenge1() {
		return laenge1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaenge1(Laenge_1_TypeClass newLaenge1, NotificationChain msgs) {
		Laenge_1_TypeClass oldLaenge1 = laenge1;
		laenge1 = newLaenge1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LAENGE1, oldLaenge1, newLaenge1);
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
	public void setLaenge1(Laenge_1_TypeClass newLaenge1) {
		if (newLaenge1 != laenge1) {
			NotificationChain msgs = null;
			if (laenge1 != null)
				msgs = ((InternalEObject)laenge1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LAENGE1, null, msgs);
			if (newLaenge1 != null)
				msgs = ((InternalEObject)newLaenge1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LAENGE1, null, msgs);
			msgs = basicSetLaenge1(newLaenge1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LAENGE1, newLaenge1, newLaenge1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LM_G_TypeClass getLMG() {
		return lMG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLMG(LM_G_TypeClass newLMG, NotificationChain msgs) {
		LM_G_TypeClass oldLMG = lMG;
		lMG = newLMG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LMG, oldLMG, newLMG);
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
	public void setLMG(LM_G_TypeClass newLMG) {
		if (newLMG != lMG) {
			NotificationChain msgs = null;
			if (lMG != null)
				msgs = ((InternalEObject)lMG).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LMG, null, msgs);
			if (newLMG != null)
				msgs = ((InternalEObject)newLMG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LMG, null, msgs);
			msgs = basicSetLMG(newLMG, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LMG, newLMG, newLMG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massgebende_Neig_1_TypeClass getMassgebendeNeig1() {
		return massgebendeNeig1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassgebendeNeig1(Massgebende_Neig_1_TypeClass newMassgebendeNeig1, NotificationChain msgs) {
		Massgebende_Neig_1_TypeClass oldMassgebendeNeig1 = massgebendeNeig1;
		massgebendeNeig1 = newMassgebendeNeig1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG1, oldMassgebendeNeig1, newMassgebendeNeig1);
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
	public void setMassgebendeNeig1(Massgebende_Neig_1_TypeClass newMassgebendeNeig1) {
		if (newMassgebendeNeig1 != massgebendeNeig1) {
			NotificationChain msgs = null;
			if (massgebendeNeig1 != null)
				msgs = ((InternalEObject)massgebendeNeig1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG1, null, msgs);
			if (newMassgebendeNeig1 != null)
				msgs = ((InternalEObject)newMassgebendeNeig1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG1, null, msgs);
			msgs = basicSetMassgebendeNeig1(newMassgebendeNeig1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG1, newMassgebendeNeig1, newMassgebendeNeig1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massgebende_Neig_Schutzstrecke_TypeClass getMassgebendeNeigSchutzstrecke() {
		return massgebendeNeigSchutzstrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassgebendeNeigSchutzstrecke(Massgebende_Neig_Schutzstrecke_TypeClass newMassgebendeNeigSchutzstrecke, NotificationChain msgs) {
		Massgebende_Neig_Schutzstrecke_TypeClass oldMassgebendeNeigSchutzstrecke = massgebendeNeigSchutzstrecke;
		massgebendeNeigSchutzstrecke = newMassgebendeNeigSchutzstrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG_SCHUTZSTRECKE, oldMassgebendeNeigSchutzstrecke, newMassgebendeNeigSchutzstrecke);
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
	public void setMassgebendeNeigSchutzstrecke(Massgebende_Neig_Schutzstrecke_TypeClass newMassgebendeNeigSchutzstrecke) {
		if (newMassgebendeNeigSchutzstrecke != massgebendeNeigSchutzstrecke) {
			NotificationChain msgs = null;
			if (massgebendeNeigSchutzstrecke != null)
				msgs = ((InternalEObject)massgebendeNeigSchutzstrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG_SCHUTZSTRECKE, null, msgs);
			if (newMassgebendeNeigSchutzstrecke != null)
				msgs = ((InternalEObject)newMassgebendeNeigSchutzstrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG_SCHUTZSTRECKE, null, msgs);
			msgs = basicSetMassgebendeNeigSchutzstrecke(newMassgebendeNeigSchutzstrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG_SCHUTZSTRECKE, newMassgebendeNeigSchutzstrecke, newMassgebendeNeigSchutzstrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mastschild_TypeClass getMastschild() {
		return mastschild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMastschild(Mastschild_TypeClass newMastschild, NotificationChain msgs) {
		Mastschild_TypeClass oldMastschild = mastschild;
		mastschild = newMastschild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASTSCHILD, oldMastschild, newMastschild);
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
	public void setMastschild(Mastschild_TypeClass newMastschild) {
		if (newMastschild != mastschild) {
			NotificationChain msgs = null;
			if (mastschild != null)
				msgs = ((InternalEObject)mastschild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASTSCHILD, null, msgs);
			if (newMastschild != null)
				msgs = ((InternalEObject)newMastschild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASTSCHILD, null, msgs);
			msgs = basicSetMastschild(newMastschild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASTSCHILD, newMastschild, newMastschild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schutzstrecke_Erforderlich_TypeClass getSchutzstreckeErforderlich() {
		return schutzstreckeErforderlich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchutzstreckeErforderlich(Schutzstrecke_Erforderlich_TypeClass newSchutzstreckeErforderlich, NotificationChain msgs) {
		Schutzstrecke_Erforderlich_TypeClass oldSchutzstreckeErforderlich = schutzstreckeErforderlich;
		schutzstreckeErforderlich = newSchutzstreckeErforderlich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_ERFORDERLICH, oldSchutzstreckeErforderlich, newSchutzstreckeErforderlich);
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
	public void setSchutzstreckeErforderlich(Schutzstrecke_Erforderlich_TypeClass newSchutzstreckeErforderlich) {
		if (newSchutzstreckeErforderlich != schutzstreckeErforderlich) {
			NotificationChain msgs = null;
			if (schutzstreckeErforderlich != null)
				msgs = ((InternalEObject)schutzstreckeErforderlich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_ERFORDERLICH, null, msgs);
			if (newSchutzstreckeErforderlich != null)
				msgs = ((InternalEObject)newSchutzstreckeErforderlich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_ERFORDERLICH, null, msgs);
			msgs = basicSetSchutzstreckeErforderlich(newSchutzstreckeErforderlich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_ERFORDERLICH, newSchutzstreckeErforderlich, newSchutzstreckeErforderlich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schutzstrecke_Vorhanden_TypeClass getSchutzstreckeVorhanden() {
		return schutzstreckeVorhanden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchutzstreckeVorhanden(Schutzstrecke_Vorhanden_TypeClass newSchutzstreckeVorhanden, NotificationChain msgs) {
		Schutzstrecke_Vorhanden_TypeClass oldSchutzstreckeVorhanden = schutzstreckeVorhanden;
		schutzstreckeVorhanden = newSchutzstreckeVorhanden;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_VORHANDEN, oldSchutzstreckeVorhanden, newSchutzstreckeVorhanden);
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
	public void setSchutzstreckeVorhanden(Schutzstrecke_Vorhanden_TypeClass newSchutzstreckeVorhanden) {
		if (newSchutzstreckeVorhanden != schutzstreckeVorhanden) {
			NotificationChain msgs = null;
			if (schutzstreckeVorhanden != null)
				msgs = ((InternalEObject)schutzstreckeVorhanden).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_VORHANDEN, null, msgs);
			if (newSchutzstreckeVorhanden != null)
				msgs = ((InternalEObject)newSchutzstreckeVorhanden).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_VORHANDEN, null, msgs);
			msgs = basicSetSchutzstreckeVorhanden(newSchutzstreckeVorhanden, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_VORHANDEN, newSchutzstreckeVorhanden, newSchutzstreckeVorhanden));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER, oldTelegrammnummer, newTelegrammnummer);
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
				msgs = ((InternalEObject)telegrammnummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER, null, msgs);
			if (newTelegrammnummer != null)
				msgs = ((InternalEObject)newTelegrammnummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER, null, msgs);
			msgs = basicSetTelegrammnummer(newTelegrammnummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER, newTelegrammnummer, newTelegrammnummer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE, oldUeberwachungLaenge, newUeberwachungLaenge);
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
				msgs = ((InternalEObject)ueberwachungLaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE, null, msgs);
			if (newUeberwachungLaenge != null)
				msgs = ((InternalEObject)newUeberwachungLaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE, null, msgs);
			msgs = basicSetUeberwachungLaenge(newUeberwachungLaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE, newUeberwachungLaenge, newUeberwachungLaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Befehl_R_TypeClass getVBefehlR() {
		return vBefehlR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVBefehlR(V_Befehl_R_TypeClass newVBefehlR, NotificationChain msgs) {
		V_Befehl_R_TypeClass oldVBefehlR = vBefehlR;
		vBefehlR = newVBefehlR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_R, oldVBefehlR, newVBefehlR);
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
	public void setVBefehlR(V_Befehl_R_TypeClass newVBefehlR) {
		if (newVBefehlR != vBefehlR) {
			NotificationChain msgs = null;
			if (vBefehlR != null)
				msgs = ((InternalEObject)vBefehlR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_R, null, msgs);
			if (newVBefehlR != null)
				msgs = ((InternalEObject)newVBefehlR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_R, null, msgs);
			msgs = basicSetVBefehlR(newVBefehlR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_R, newVBefehlR, newVBefehlR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Befehl_Z_TypeClass getVBefehlZ() {
		return vBefehlZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVBefehlZ(V_Befehl_Z_TypeClass newVBefehlZ, NotificationChain msgs) {
		V_Befehl_Z_TypeClass oldVBefehlZ = vBefehlZ;
		vBefehlZ = newVBefehlZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_Z, oldVBefehlZ, newVBefehlZ);
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
	public void setVBefehlZ(V_Befehl_Z_TypeClass newVBefehlZ) {
		if (newVBefehlZ != vBefehlZ) {
			NotificationChain msgs = null;
			if (vBefehlZ != null)
				msgs = ((InternalEObject)vBefehlZ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_Z, null, msgs);
			if (newVBefehlZ != null)
				msgs = ((InternalEObject)newVBefehlZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_Z, null, msgs);
			msgs = basicSetVBefehlZ(newVBefehlZ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_Z, newVBefehlZ, newVBefehlZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Frei_TypeClass getVFrei() {
		return vFrei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVFrei(V_Frei_TypeClass newVFrei, NotificationChain msgs) {
		V_Frei_TypeClass oldVFrei = vFrei;
		vFrei = newVFrei;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VFREI, oldVFrei, newVFrei);
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
	public void setVFrei(V_Frei_TypeClass newVFrei) {
		if (newVFrei != vFrei) {
			NotificationChain msgs = null;
			if (vFrei != null)
				msgs = ((InternalEObject)vFrei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VFREI, null, msgs);
			if (newVFrei != null)
				msgs = ((InternalEObject)newVFrei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VFREI, null, msgs);
			msgs = basicSetVFrei(newVFrei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VFREI, newVFrei, newVFrei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Zul_Strecke_TypeClass getVZulStrecke() {
		return vZulStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVZulStrecke(V_Zul_Strecke_TypeClass newVZulStrecke, NotificationChain msgs) {
		V_Zul_Strecke_TypeClass oldVZulStrecke = vZulStrecke;
		vZulStrecke = newVZulStrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VZUL_STRECKE, oldVZulStrecke, newVZulStrecke);
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
	public void setVZulStrecke(V_Zul_Strecke_TypeClass newVZulStrecke) {
		if (newVZulStrecke != vZulStrecke) {
			NotificationChain msgs = null;
			if (vZulStrecke != null)
				msgs = ((InternalEObject)vZulStrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VZUL_STRECKE, null, msgs);
			if (newVZulStrecke != null)
				msgs = ((InternalEObject)newVZulStrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VZUL_STRECKE, null, msgs);
			msgs = basicSetVZulStrecke(newVZulStrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VZUL_STRECKE, newVZulStrecke, newVZulStrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VGR_1_TypeClass getVGR1() {
		return vGR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVGR1(VGR_1_TypeClass newVGR1, NotificationChain msgs) {
		VGR_1_TypeClass oldVGR1 = vGR1;
		vGR1 = newVGR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR1, oldVGR1, newVGR1);
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
	public void setVGR1(VGR_1_TypeClass newVGR1) {
		if (newVGR1 != vGR1) {
			NotificationChain msgs = null;
			if (vGR1 != null)
				msgs = ((InternalEObject)vGR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR1, null, msgs);
			if (newVGR1 != null)
				msgs = ((InternalEObject)newVGR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR1, null, msgs);
			msgs = basicSetVGR1(newVGR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR1, newVGR1, newVGR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VGR_2_TypeClass getVGR2() {
		return vGR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVGR2(VGR_2_TypeClass newVGR2, NotificationChain msgs) {
		VGR_2_TypeClass oldVGR2 = vGR2;
		vGR2 = newVGR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR2, oldVGR2, newVGR2);
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
	public void setVGR2(VGR_2_TypeClass newVGR2) {
		if (newVGR2 != vGR2) {
			NotificationChain msgs = null;
			if (vGR2 != null)
				msgs = ((InternalEObject)vGR2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR2, null, msgs);
			if (newVGR2 != null)
				msgs = ((InternalEObject)newVGR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR2, null, msgs);
			msgs = basicSetVGR2(newVGR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR2, newVGR2, newVGR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FT_HINWEIS_FUNKTION:
				return basicSetFTHinweisFunktion(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_MERKMALE_LA:
				return ((InternalEList<?>)getFTZBSMerkmaleLa()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_TYP:
				return basicSetFTZBSTyp(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LAENGE1:
				return basicSetLaenge1(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LMG:
				return basicSetLMG(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG1:
				return basicSetMassgebendeNeig1(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG_SCHUTZSTRECKE:
				return basicSetMassgebendeNeigSchutzstrecke(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASTSCHILD:
				return basicSetMastschild(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_ERFORDERLICH:
				return basicSetSchutzstreckeErforderlich(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_VORHANDEN:
				return basicSetSchutzstreckeVorhanden(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER:
				return basicSetTelegrammnummer(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE:
				return basicSetUeberwachungLaenge(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_R:
				return basicSetVBefehlR(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_Z:
				return basicSetVBefehlZ(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VFREI:
				return basicSetVFrei(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VZUL_STRECKE:
				return basicSetVZulStrecke(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR1:
				return basicSetVGR1(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR2:
				return basicSetVGR2(null, msgs);
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
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FT_HINWEIS_FUNKTION:
				return getFTHinweisFunktion();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_MERKMALE_LA:
				return getFTZBSMerkmaleLa();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_TYP:
				return getFTZBSTyp();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LAENGE1:
				return getLaenge1();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LMG:
				return getLMG();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG1:
				return getMassgebendeNeig1();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG_SCHUTZSTRECKE:
				return getMassgebendeNeigSchutzstrecke();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASTSCHILD:
				return getMastschild();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_ERFORDERLICH:
				return getSchutzstreckeErforderlich();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_VORHANDEN:
				return getSchutzstreckeVorhanden();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER:
				return getTelegrammnummer();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE:
				return getUeberwachungLaenge();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_R:
				return getVBefehlR();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_Z:
				return getVBefehlZ();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VFREI:
				return getVFrei();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VZUL_STRECKE:
				return getVZulStrecke();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR1:
				return getVGR1();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR2:
				return getVGR2();
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
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FT_HINWEIS_FUNKTION:
				setFTHinweisFunktion((FT_Hinweis_Funktion_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_MERKMALE_LA:
				getFTZBSMerkmaleLa().clear();
				getFTZBSMerkmaleLa().addAll((Collection<? extends FT_ZBS_Merkmale_La_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_TYP:
				setFTZBSTyp((FT_ZBS_Typ_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LAENGE1:
				setLaenge1((Laenge_1_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LMG:
				setLMG((LM_G_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG1:
				setMassgebendeNeig1((Massgebende_Neig_1_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG_SCHUTZSTRECKE:
				setMassgebendeNeigSchutzstrecke((Massgebende_Neig_Schutzstrecke_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASTSCHILD:
				setMastschild((Mastschild_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_ERFORDERLICH:
				setSchutzstreckeErforderlich((Schutzstrecke_Erforderlich_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_VORHANDEN:
				setSchutzstreckeVorhanden((Schutzstrecke_Vorhanden_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER:
				setTelegrammnummer((Telegrammnummer_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE:
				setUeberwachungLaenge((Ueberwachung_Laenge_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_R:
				setVBefehlR((V_Befehl_R_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_Z:
				setVBefehlZ((V_Befehl_Z_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VFREI:
				setVFrei((V_Frei_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VZUL_STRECKE:
				setVZulStrecke((V_Zul_Strecke_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR1:
				setVGR1((VGR_1_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR2:
				setVGR2((VGR_2_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FT_HINWEIS_FUNKTION:
				setFTHinweisFunktion((FT_Hinweis_Funktion_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_MERKMALE_LA:
				getFTZBSMerkmaleLa().clear();
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_TYP:
				setFTZBSTyp((FT_ZBS_Typ_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LAENGE1:
				setLaenge1((Laenge_1_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LMG:
				setLMG((LM_G_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG1:
				setMassgebendeNeig1((Massgebende_Neig_1_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG_SCHUTZSTRECKE:
				setMassgebendeNeigSchutzstrecke((Massgebende_Neig_Schutzstrecke_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASTSCHILD:
				setMastschild((Mastschild_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_ERFORDERLICH:
				setSchutzstreckeErforderlich((Schutzstrecke_Erforderlich_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_VORHANDEN:
				setSchutzstreckeVorhanden((Schutzstrecke_Vorhanden_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER:
				setTelegrammnummer((Telegrammnummer_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE:
				setUeberwachungLaenge((Ueberwachung_Laenge_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_R:
				setVBefehlR((V_Befehl_R_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_Z:
				setVBefehlZ((V_Befehl_Z_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VFREI:
				setVFrei((V_Frei_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VZUL_STRECKE:
				setVZulStrecke((V_Zul_Strecke_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR1:
				setVGR1((VGR_1_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR2:
				setVGR2((VGR_2_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FT_HINWEIS_FUNKTION:
				return fTHinweisFunktion != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_MERKMALE_LA:
				return fTZBSMerkmaleLa != null && !fTZBSMerkmaleLa.isEmpty();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_TYP:
				return fTZBSTyp != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LAENGE1:
				return laenge1 != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LMG:
				return lMG != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG1:
				return massgebendeNeig1 != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG_SCHUTZSTRECKE:
				return massgebendeNeigSchutzstrecke != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASTSCHILD:
				return mastschild != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_ERFORDERLICH:
				return schutzstreckeErforderlich != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_VORHANDEN:
				return schutzstreckeVorhanden != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER:
				return telegrammnummer != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE:
				return ueberwachungLaenge != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_R:
				return vBefehlR != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_Z:
				return vBefehlZ != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VFREI:
				return vFrei != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VZUL_STRECKE:
				return vZulStrecke != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR1:
				return vGR1 != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR2:
				return vGR2 != null;
		}
		return super.eIsSet(featureID);
	}

} //FT_ZBS_Merkmale_AttributeGroupImpl
