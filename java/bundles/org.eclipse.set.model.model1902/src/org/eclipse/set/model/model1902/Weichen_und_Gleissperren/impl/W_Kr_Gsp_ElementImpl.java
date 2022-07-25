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

import org.eclipse.set.model.model1902.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Regelzeichnung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Stellelement_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Anlage_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Weichenlaufkette_TypeClass;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Element;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WKr Gsp Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getIDStellelement <em>ID Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getIDWKrAnlage <em>IDW Kr Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getWKrGspElementAllg <em>WKr Gsp Element Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getGleissperreElement <em>Gleissperre Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getWeicheElement <em>Weiche Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class W_Kr_Gsp_ElementImpl extends Basis_ObjektImpl implements W_Kr_Gsp_Element {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Element_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDRegelzeichnung() <em>ID Regelzeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRegelzeichnung()
	 * @generated
	 * @ordered
	 */
	protected ID_Regelzeichnung_TypeClass iDRegelzeichnung;

	/**
	 * The cached value of the '{@link #getIDStellelement() <em>ID Stellelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStellelement()
	 * @generated
	 * @ordered
	 */
	protected ID_Stellelement_TypeClass iDStellelement;

	/**
	 * The cached value of the '{@link #getIDWKrAnlage() <em>IDW Kr Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWKrAnlage()
	 * @generated
	 * @ordered
	 */
	protected ID_W_Kr_Anlage_TypeClass iDWKrAnlage;

	/**
	 * The cached value of the '{@link #getIDWeichenlaufkette() <em>ID Weichenlaufkette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWeichenlaufkette()
	 * @generated
	 * @ordered
	 */
	protected ID_Weichenlaufkette_TypeClass iDWeichenlaufkette;

	/**
	 * The cached value of the '{@link #getWKrGspElementAllg() <em>WKr Gsp Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWKrGspElementAllg()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Gsp_Element_Allg_AttributeGroup wKrGspElementAllg;

	/**
	 * The cached value of the '{@link #getGleissperreElement() <em>Gleissperre Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleissperreElement()
	 * @generated
	 * @ordered
	 */
	protected Gleissperre_Element_AttributeGroup gleissperreElement;

	/**
	 * The cached value of the '{@link #getWeicheElement() <em>Weiche Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeicheElement()
	 * @generated
	 * @ordered
	 */
	protected Weiche_Element_AttributeGroup weicheElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected W_Kr_Gsp_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.WKR_GSP_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Element_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bezeichnung_Element_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Regelzeichnung_TypeClass getIDRegelzeichnung() {
		return iDRegelzeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDRegelzeichnung(ID_Regelzeichnung_TypeClass newIDRegelzeichnung, NotificationChain msgs) {
		ID_Regelzeichnung_TypeClass oldIDRegelzeichnung = iDRegelzeichnung;
		iDRegelzeichnung = newIDRegelzeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG, oldIDRegelzeichnung, newIDRegelzeichnung);
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
	public void setIDRegelzeichnung(ID_Regelzeichnung_TypeClass newIDRegelzeichnung) {
		if (newIDRegelzeichnung != iDRegelzeichnung) {
			NotificationChain msgs = null;
			if (iDRegelzeichnung != null)
				msgs = ((InternalEObject)iDRegelzeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG, null, msgs);
			if (newIDRegelzeichnung != null)
				msgs = ((InternalEObject)newIDRegelzeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG, null, msgs);
			msgs = basicSetIDRegelzeichnung(newIDRegelzeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG, newIDRegelzeichnung, newIDRegelzeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Stellelement_TypeClass getIDStellelement() {
		return iDStellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDStellelement(ID_Stellelement_TypeClass newIDStellelement, NotificationChain msgs) {
		ID_Stellelement_TypeClass oldIDStellelement = iDStellelement;
		iDStellelement = newIDStellelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT, oldIDStellelement, newIDStellelement);
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
	public void setIDStellelement(ID_Stellelement_TypeClass newIDStellelement) {
		if (newIDStellelement != iDStellelement) {
			NotificationChain msgs = null;
			if (iDStellelement != null)
				msgs = ((InternalEObject)iDStellelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT, null, msgs);
			if (newIDStellelement != null)
				msgs = ((InternalEObject)newIDStellelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT, null, msgs);
			msgs = basicSetIDStellelement(newIDStellelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT, newIDStellelement, newIDStellelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_W_Kr_Anlage_TypeClass getIDWKrAnlage() {
		return iDWKrAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDWKrAnlage(ID_W_Kr_Anlage_TypeClass newIDWKrAnlage, NotificationChain msgs) {
		ID_W_Kr_Anlage_TypeClass oldIDWKrAnlage = iDWKrAnlage;
		iDWKrAnlage = newIDWKrAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE, oldIDWKrAnlage, newIDWKrAnlage);
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
	public void setIDWKrAnlage(ID_W_Kr_Anlage_TypeClass newIDWKrAnlage) {
		if (newIDWKrAnlage != iDWKrAnlage) {
			NotificationChain msgs = null;
			if (iDWKrAnlage != null)
				msgs = ((InternalEObject)iDWKrAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE, null, msgs);
			if (newIDWKrAnlage != null)
				msgs = ((InternalEObject)newIDWKrAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE, null, msgs);
			msgs = basicSetIDWKrAnlage(newIDWKrAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE, newIDWKrAnlage, newIDWKrAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Weichenlaufkette_TypeClass getIDWeichenlaufkette() {
		return iDWeichenlaufkette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDWeichenlaufkette(ID_Weichenlaufkette_TypeClass newIDWeichenlaufkette, NotificationChain msgs) {
		ID_Weichenlaufkette_TypeClass oldIDWeichenlaufkette = iDWeichenlaufkette;
		iDWeichenlaufkette = newIDWeichenlaufkette;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE, oldIDWeichenlaufkette, newIDWeichenlaufkette);
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
	public void setIDWeichenlaufkette(ID_Weichenlaufkette_TypeClass newIDWeichenlaufkette) {
		if (newIDWeichenlaufkette != iDWeichenlaufkette) {
			NotificationChain msgs = null;
			if (iDWeichenlaufkette != null)
				msgs = ((InternalEObject)iDWeichenlaufkette).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE, null, msgs);
			if (newIDWeichenlaufkette != null)
				msgs = ((InternalEObject)newIDWeichenlaufkette).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE, null, msgs);
			msgs = basicSetIDWeichenlaufkette(newIDWeichenlaufkette, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE, newIDWeichenlaufkette, newIDWeichenlaufkette));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element_Allg_AttributeGroup getWKrGspElementAllg() {
		return wKrGspElementAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWKrGspElementAllg(W_Kr_Gsp_Element_Allg_AttributeGroup newWKrGspElementAllg, NotificationChain msgs) {
		W_Kr_Gsp_Element_Allg_AttributeGroup oldWKrGspElementAllg = wKrGspElementAllg;
		wKrGspElementAllg = newWKrGspElementAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG, oldWKrGspElementAllg, newWKrGspElementAllg);
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
	public void setWKrGspElementAllg(W_Kr_Gsp_Element_Allg_AttributeGroup newWKrGspElementAllg) {
		if (newWKrGspElementAllg != wKrGspElementAllg) {
			NotificationChain msgs = null;
			if (wKrGspElementAllg != null)
				msgs = ((InternalEObject)wKrGspElementAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG, null, msgs);
			if (newWKrGspElementAllg != null)
				msgs = ((InternalEObject)newWKrGspElementAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG, null, msgs);
			msgs = basicSetWKrGspElementAllg(newWKrGspElementAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG, newWKrGspElementAllg, newWKrGspElementAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleissperre_Element_AttributeGroup getGleissperreElement() {
		return gleissperreElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGleissperreElement(Gleissperre_Element_AttributeGroup newGleissperreElement, NotificationChain msgs) {
		Gleissperre_Element_AttributeGroup oldGleissperreElement = gleissperreElement;
		gleissperreElement = newGleissperreElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT, oldGleissperreElement, newGleissperreElement);
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
	public void setGleissperreElement(Gleissperre_Element_AttributeGroup newGleissperreElement) {
		if (newGleissperreElement != gleissperreElement) {
			NotificationChain msgs = null;
			if (gleissperreElement != null)
				msgs = ((InternalEObject)gleissperreElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT, null, msgs);
			if (newGleissperreElement != null)
				msgs = ((InternalEObject)newGleissperreElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT, null, msgs);
			msgs = basicSetGleissperreElement(newGleissperreElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT, newGleissperreElement, newGleissperreElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weiche_Element_AttributeGroup getWeicheElement() {
		return weicheElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeicheElement(Weiche_Element_AttributeGroup newWeicheElement, NotificationChain msgs) {
		Weiche_Element_AttributeGroup oldWeicheElement = weicheElement;
		weicheElement = newWeicheElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT, oldWeicheElement, newWeicheElement);
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
	public void setWeicheElement(Weiche_Element_AttributeGroup newWeicheElement) {
		if (newWeicheElement != weicheElement) {
			NotificationChain msgs = null;
			if (weicheElement != null)
				msgs = ((InternalEObject)weicheElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT, null, msgs);
			if (newWeicheElement != null)
				msgs = ((InternalEObject)newWeicheElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT, null, msgs);
			msgs = basicSetWeicheElement(newWeicheElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT, newWeicheElement, newWeicheElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG:
				return basicSetIDRegelzeichnung(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT:
				return basicSetIDStellelement(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE:
				return basicSetIDWKrAnlage(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE:
				return basicSetIDWeichenlaufkette(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG:
				return basicSetWKrGspElementAllg(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT:
				return basicSetGleissperreElement(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT:
				return basicSetWeicheElement(null, msgs);
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG:
				return getBezeichnung();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG:
				return getIDRegelzeichnung();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT:
				return getIDStellelement();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE:
				return getIDWKrAnlage();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE:
				return getIDWeichenlaufkette();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG:
				return getWKrGspElementAllg();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT:
				return getGleissperreElement();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT:
				return getWeicheElement();
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG:
				setIDRegelzeichnung((ID_Regelzeichnung_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT:
				setIDStellelement((ID_Stellelement_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE:
				setIDWKrAnlage((ID_W_Kr_Anlage_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE:
				setIDWeichenlaufkette((ID_Weichenlaufkette_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG:
				setWKrGspElementAllg((W_Kr_Gsp_Element_Allg_AttributeGroup)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT:
				setGleissperreElement((Gleissperre_Element_AttributeGroup)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT:
				setWeicheElement((Weiche_Element_AttributeGroup)newValue);
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG:
				setIDRegelzeichnung((ID_Regelzeichnung_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT:
				setIDStellelement((ID_Stellelement_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE:
				setIDWKrAnlage((ID_W_Kr_Anlage_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE:
				setIDWeichenlaufkette((ID_Weichenlaufkette_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG:
				setWKrGspElementAllg((W_Kr_Gsp_Element_Allg_AttributeGroup)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT:
				setGleissperreElement((Gleissperre_Element_AttributeGroup)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT:
				setWeicheElement((Weiche_Element_AttributeGroup)null);
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG:
				return bezeichnung != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG:
				return iDRegelzeichnung != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT:
				return iDStellelement != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE:
				return iDWKrAnlage != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE:
				return iDWeichenlaufkette != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG:
				return wKrGspElementAllg != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT:
				return gleissperreElement != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT:
				return weicheElement != null;
		}
		return super.eIsSet(featureID);
	}

} //W_Kr_Gsp_ElementImpl
