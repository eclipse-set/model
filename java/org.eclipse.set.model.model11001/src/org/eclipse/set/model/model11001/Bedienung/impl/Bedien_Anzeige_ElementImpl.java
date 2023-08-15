/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Bedienung.Bedien_Anzeige_Element;
import org.eclipse.set.model.model11001.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Bedienung.Bedien_Anzeige_Element_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Bedienung.BedienungPackage;

import org.eclipse.set.model.model11001.Verweise.ID_Bedien_Einrichtung_Oertlich_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Verknuepftes_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Anzeige Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_Anzeige_ElementImpl#getBedienAnzeigeElementAllg <em>Bedien Anzeige Element Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_Anzeige_ElementImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_Anzeige_ElementImpl#getIDBedienEinrichtungOertlich <em>ID Bedien Einrichtung Oertlich</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_Anzeige_ElementImpl#getIDVerknuepftesElement <em>ID Verknuepftes Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Anzeige_ElementImpl extends Basis_ObjektImpl implements Bedien_Anzeige_Element {
	/**
	 * The cached value of the '{@link #getBedienAnzeigeElementAllg() <em>Bedien Anzeige Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienAnzeigeElementAllg()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Anzeige_Element_Allg_AttributeGroup bedienAnzeigeElementAllg;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Anzeige_Element_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDBedienEinrichtungOertlich() <em>ID Bedien Einrichtung Oertlich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienEinrichtungOertlich()
	 * @generated
	 * @ordered
	 */
	protected ID_Bedien_Einrichtung_Oertlich_TypeClass iDBedienEinrichtungOertlich;

	/**
	 * The cached value of the '{@link #getIDVerknuepftesElement() <em>ID Verknuepftes Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDVerknuepftesElement()
	 * @generated
	 * @ordered
	 */
	protected ID_Verknuepftes_Element_TypeClass iDVerknuepftesElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Anzeige_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_ANZEIGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anzeige_Element_Allg_AttributeGroup getBedienAnzeigeElementAllg() {
		return bedienAnzeigeElementAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienAnzeigeElementAllg(Bedien_Anzeige_Element_Allg_AttributeGroup newBedienAnzeigeElementAllg, NotificationChain msgs) {
		Bedien_Anzeige_Element_Allg_AttributeGroup oldBedienAnzeigeElementAllg = bedienAnzeigeElementAllg;
		bedienAnzeigeElementAllg = newBedienAnzeigeElementAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG, oldBedienAnzeigeElementAllg, newBedienAnzeigeElementAllg);
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
	public void setBedienAnzeigeElementAllg(Bedien_Anzeige_Element_Allg_AttributeGroup newBedienAnzeigeElementAllg) {
		if (newBedienAnzeigeElementAllg != bedienAnzeigeElementAllg) {
			NotificationChain msgs = null;
			if (bedienAnzeigeElementAllg != null)
				msgs = ((InternalEObject)bedienAnzeigeElementAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG, null, msgs);
			if (newBedienAnzeigeElementAllg != null)
				msgs = ((InternalEObject)newBedienAnzeigeElementAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG, null, msgs);
			msgs = basicSetBedienAnzeigeElementAllg(newBedienAnzeigeElementAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG, newBedienAnzeigeElementAllg, newBedienAnzeigeElementAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anzeige_Element_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bedien_Anzeige_Element_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bedien_Anzeige_Element_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bedien_Anzeige_Element_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Einrichtung_Oertlich_TypeClass getIDBedienEinrichtungOertlich() {
		return iDBedienEinrichtungOertlich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBedienEinrichtungOertlich(ID_Bedien_Einrichtung_Oertlich_TypeClass newIDBedienEinrichtungOertlich, NotificationChain msgs) {
		ID_Bedien_Einrichtung_Oertlich_TypeClass oldIDBedienEinrichtungOertlich = iDBedienEinrichtungOertlich;
		iDBedienEinrichtungOertlich = newIDBedienEinrichtungOertlich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH, oldIDBedienEinrichtungOertlich, newIDBedienEinrichtungOertlich);
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
	public void setIDBedienEinrichtungOertlich(ID_Bedien_Einrichtung_Oertlich_TypeClass newIDBedienEinrichtungOertlich) {
		if (newIDBedienEinrichtungOertlich != iDBedienEinrichtungOertlich) {
			NotificationChain msgs = null;
			if (iDBedienEinrichtungOertlich != null)
				msgs = ((InternalEObject)iDBedienEinrichtungOertlich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH, null, msgs);
			if (newIDBedienEinrichtungOertlich != null)
				msgs = ((InternalEObject)newIDBedienEinrichtungOertlich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH, null, msgs);
			msgs = basicSetIDBedienEinrichtungOertlich(newIDBedienEinrichtungOertlich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH, newIDBedienEinrichtungOertlich, newIDBedienEinrichtungOertlich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Verknuepftes_Element_TypeClass getIDVerknuepftesElement() {
		return iDVerknuepftesElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDVerknuepftesElement(ID_Verknuepftes_Element_TypeClass newIDVerknuepftesElement, NotificationChain msgs) {
		ID_Verknuepftes_Element_TypeClass oldIDVerknuepftesElement = iDVerknuepftesElement;
		iDVerknuepftesElement = newIDVerknuepftesElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT, oldIDVerknuepftesElement, newIDVerknuepftesElement);
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
	public void setIDVerknuepftesElement(ID_Verknuepftes_Element_TypeClass newIDVerknuepftesElement) {
		if (newIDVerknuepftesElement != iDVerknuepftesElement) {
			NotificationChain msgs = null;
			if (iDVerknuepftesElement != null)
				msgs = ((InternalEObject)iDVerknuepftesElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT, null, msgs);
			if (newIDVerknuepftesElement != null)
				msgs = ((InternalEObject)newIDVerknuepftesElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT, null, msgs);
			msgs = basicSetIDVerknuepftesElement(newIDVerknuepftesElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT, newIDVerknuepftesElement, newIDVerknuepftesElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG:
				return basicSetBedienAnzeigeElementAllg(null, msgs);
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH:
				return basicSetIDBedienEinrichtungOertlich(null, msgs);
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT:
				return basicSetIDVerknuepftesElement(null, msgs);
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG:
				return getBedienAnzeigeElementAllg();
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG:
				return getBezeichnung();
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH:
				return getIDBedienEinrichtungOertlich();
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT:
				return getIDVerknuepftesElement();
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG:
				setBedienAnzeigeElementAllg((Bedien_Anzeige_Element_Allg_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG:
				setBezeichnung((Bedien_Anzeige_Element_Bezeichnung_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH:
				setIDBedienEinrichtungOertlich((ID_Bedien_Einrichtung_Oertlich_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT:
				setIDVerknuepftesElement((ID_Verknuepftes_Element_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG:
				setBedienAnzeigeElementAllg((Bedien_Anzeige_Element_Allg_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG:
				setBezeichnung((Bedien_Anzeige_Element_Bezeichnung_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH:
				setIDBedienEinrichtungOertlich((ID_Bedien_Einrichtung_Oertlich_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT:
				setIDVerknuepftesElement((ID_Verknuepftes_Element_TypeClass)null);
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG:
				return bedienAnzeigeElementAllg != null;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG:
				return bezeichnung != null;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH:
				return iDBedienEinrichtungOertlich != null;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT:
				return iDVerknuepftesElement != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Anzeige_ElementImpl
