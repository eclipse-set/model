/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Medien_und_Trassen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Trasse_Knoten;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Trasse_Knoten_Art_TypeClass;

import org.eclipse.set.model.planpro.Verweise.ID_Anschluss_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trasse Knoten</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Trasse_KnotenImpl#getIDAnschlussElement <em>ID Anschluss Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Trasse_KnotenImpl#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Trasse_KnotenImpl#getTrasseKnotenArt <em>Trasse Knoten Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Trasse_KnotenImpl extends Basis_ObjektImpl implements Trasse_Knoten {
	/**
	 * The cached value of the '{@link #getIDAnschlussElement() <em>ID Anschluss Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnschlussElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Anschluss_Element_TypeClass> iDAnschlussElement;

	/**
	 * The cached value of the '{@link #getIDGEOKnoten() <em>IDGEO Knoten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOKnoten()
	 * @generated
	 * @ordered
	 */
	protected ID_GEO_Knoten_TypeClass iDGEOKnoten;

	/**
	 * The cached value of the '{@link #getTrasseKnotenArt() <em>Trasse Knoten Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrasseKnotenArt()
	 * @generated
	 * @ordered
	 */
	protected Trasse_Knoten_Art_TypeClass trasseKnotenArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Trasse_KnotenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Medien_und_TrassenPackage.Literals.TRASSE_KNOTEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Anschluss_Element_TypeClass> getIDAnschlussElement() {
		if (iDAnschlussElement == null) {
			iDAnschlussElement = new EObjectContainmentEList<ID_Anschluss_Element_TypeClass>(ID_Anschluss_Element_TypeClass.class, this, Medien_und_TrassenPackage.TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT);
		}
		return iDAnschlussElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GEO_Knoten_TypeClass getIDGEOKnoten() {
		return iDGEOKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGEOKnoten(ID_GEO_Knoten_TypeClass newIDGEOKnoten, NotificationChain msgs) {
		ID_GEO_Knoten_TypeClass oldIDGEOKnoten = iDGEOKnoten;
		iDGEOKnoten = newIDGEOKnoten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN, oldIDGEOKnoten, newIDGEOKnoten);
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
	public void setIDGEOKnoten(ID_GEO_Knoten_TypeClass newIDGEOKnoten) {
		if (newIDGEOKnoten != iDGEOKnoten) {
			NotificationChain msgs = null;
			if (iDGEOKnoten != null)
				msgs = ((InternalEObject)iDGEOKnoten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN, null, msgs);
			if (newIDGEOKnoten != null)
				msgs = ((InternalEObject)newIDGEOKnoten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN, null, msgs);
			msgs = basicSetIDGEOKnoten(newIDGEOKnoten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN, newIDGEOKnoten, newIDGEOKnoten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trasse_Knoten_Art_TypeClass getTrasseKnotenArt() {
		return trasseKnotenArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrasseKnotenArt(Trasse_Knoten_Art_TypeClass newTrasseKnotenArt, NotificationChain msgs) {
		Trasse_Knoten_Art_TypeClass oldTrasseKnotenArt = trasseKnotenArt;
		trasseKnotenArt = newTrasseKnotenArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART, oldTrasseKnotenArt, newTrasseKnotenArt);
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
	public void setTrasseKnotenArt(Trasse_Knoten_Art_TypeClass newTrasseKnotenArt) {
		if (newTrasseKnotenArt != trasseKnotenArt) {
			NotificationChain msgs = null;
			if (trasseKnotenArt != null)
				msgs = ((InternalEObject)trasseKnotenArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART, null, msgs);
			if (newTrasseKnotenArt != null)
				msgs = ((InternalEObject)newTrasseKnotenArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART, null, msgs);
			msgs = basicSetTrasseKnotenArt(newTrasseKnotenArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART, newTrasseKnotenArt, newTrasseKnotenArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT:
				return ((InternalEList<?>)getIDAnschlussElement()).basicRemove(otherEnd, msgs);
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN:
				return basicSetIDGEOKnoten(null, msgs);
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART:
				return basicSetTrasseKnotenArt(null, msgs);
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
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT:
				return getIDAnschlussElement();
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN:
				return getIDGEOKnoten();
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART:
				return getTrasseKnotenArt();
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
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT:
				getIDAnschlussElement().clear();
				getIDAnschlussElement().addAll((Collection<? extends ID_Anschluss_Element_TypeClass>)newValue);
				return;
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN:
				setIDGEOKnoten((ID_GEO_Knoten_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART:
				setTrasseKnotenArt((Trasse_Knoten_Art_TypeClass)newValue);
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
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT:
				getIDAnschlussElement().clear();
				return;
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN:
				setIDGEOKnoten((ID_GEO_Knoten_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART:
				setTrasseKnotenArt((Trasse_Knoten_Art_TypeClass)null);
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
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT:
				return iDAnschlussElement != null && !iDAnschlussElement.isEmpty();
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN:
				return iDGEOKnoten != null;
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART:
				return trasseKnotenArt != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Trasse_KnotenImpl
