/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Basisobjekte.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.model.model1902.Basisobjekte.LO_Ausgabestand_TypeClass;
import org.eclipse.set.model.model1902.Basisobjekte.LO_DB_Freigabe_TypeClass;
import org.eclipse.set.model.model1902.Basisobjekte.LO_Datum_Herstellung_TypeClass;
import org.eclipse.set.model.model1902.Basisobjekte.LO_EMA_Nr_TypeClass;
import org.eclipse.set.model.model1902.Basisobjekte.LO_Firmensachnummer_TypeClass;
import org.eclipse.set.model.model1902.Basisobjekte.LO_Material_AttributeGroup;
import org.eclipse.set.model.model1902.Basisobjekte.LO_Seriennummer_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LO Material Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.LO_Material_AttributeGroupImpl#getLOAusgabestand <em>LO Ausgabestand</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.LO_Material_AttributeGroupImpl#getLODatumHerstellung <em>LO Datum Herstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.LO_Material_AttributeGroupImpl#getLODBFreigabe <em>LODB Freigabe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.LO_Material_AttributeGroupImpl#getLOEMANr <em>LOEMA Nr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.LO_Material_AttributeGroupImpl#getLOFirmensachnummer <em>LO Firmensachnummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.LO_Material_AttributeGroupImpl#getLOSeriennummer <em>LO Seriennummer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LO_Material_AttributeGroupImpl extends MinimalEObjectImpl.Container implements LO_Material_AttributeGroup {
	/**
	 * The cached value of the '{@link #getLOAusgabestand() <em>LO Ausgabestand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOAusgabestand()
	 * @generated
	 * @ordered
	 */
	protected LO_Ausgabestand_TypeClass lOAusgabestand;

	/**
	 * The cached value of the '{@link #getLODatumHerstellung() <em>LO Datum Herstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLODatumHerstellung()
	 * @generated
	 * @ordered
	 */
	protected LO_Datum_Herstellung_TypeClass lODatumHerstellung;

	/**
	 * The cached value of the '{@link #getLODBFreigabe() <em>LODB Freigabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLODBFreigabe()
	 * @generated
	 * @ordered
	 */
	protected LO_DB_Freigabe_TypeClass lODBFreigabe;

	/**
	 * The cached value of the '{@link #getLOEMANr() <em>LOEMA Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOEMANr()
	 * @generated
	 * @ordered
	 */
	protected LO_EMA_Nr_TypeClass lOEMANr;

	/**
	 * The cached value of the '{@link #getLOFirmensachnummer() <em>LO Firmensachnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOFirmensachnummer()
	 * @generated
	 * @ordered
	 */
	protected LO_Firmensachnummer_TypeClass lOFirmensachnummer;

	/**
	 * The cached value of the '{@link #getLOSeriennummer() <em>LO Seriennummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOSeriennummer()
	 * @generated
	 * @ordered
	 */
	protected LO_Seriennummer_TypeClass lOSeriennummer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LO_Material_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.LO_MATERIAL_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_Ausgabestand_TypeClass getLOAusgabestand() {
		return lOAusgabestand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLOAusgabestand(LO_Ausgabestand_TypeClass newLOAusgabestand, NotificationChain msgs) {
		LO_Ausgabestand_TypeClass oldLOAusgabestand = lOAusgabestand;
		lOAusgabestand = newLOAusgabestand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND, oldLOAusgabestand, newLOAusgabestand);
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
	public void setLOAusgabestand(LO_Ausgabestand_TypeClass newLOAusgabestand) {
		if (newLOAusgabestand != lOAusgabestand) {
			NotificationChain msgs = null;
			if (lOAusgabestand != null)
				msgs = ((InternalEObject)lOAusgabestand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND, null, msgs);
			if (newLOAusgabestand != null)
				msgs = ((InternalEObject)newLOAusgabestand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND, null, msgs);
			msgs = basicSetLOAusgabestand(newLOAusgabestand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND, newLOAusgabestand, newLOAusgabestand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_Datum_Herstellung_TypeClass getLODatumHerstellung() {
		return lODatumHerstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLODatumHerstellung(LO_Datum_Herstellung_TypeClass newLODatumHerstellung, NotificationChain msgs) {
		LO_Datum_Herstellung_TypeClass oldLODatumHerstellung = lODatumHerstellung;
		lODatumHerstellung = newLODatumHerstellung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG, oldLODatumHerstellung, newLODatumHerstellung);
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
	public void setLODatumHerstellung(LO_Datum_Herstellung_TypeClass newLODatumHerstellung) {
		if (newLODatumHerstellung != lODatumHerstellung) {
			NotificationChain msgs = null;
			if (lODatumHerstellung != null)
				msgs = ((InternalEObject)lODatumHerstellung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG, null, msgs);
			if (newLODatumHerstellung != null)
				msgs = ((InternalEObject)newLODatumHerstellung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG, null, msgs);
			msgs = basicSetLODatumHerstellung(newLODatumHerstellung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG, newLODatumHerstellung, newLODatumHerstellung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_DB_Freigabe_TypeClass getLODBFreigabe() {
		return lODBFreigabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLODBFreigabe(LO_DB_Freigabe_TypeClass newLODBFreigabe, NotificationChain msgs) {
		LO_DB_Freigabe_TypeClass oldLODBFreigabe = lODBFreigabe;
		lODBFreigabe = newLODBFreigabe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE, oldLODBFreigabe, newLODBFreigabe);
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
	public void setLODBFreigabe(LO_DB_Freigabe_TypeClass newLODBFreigabe) {
		if (newLODBFreigabe != lODBFreigabe) {
			NotificationChain msgs = null;
			if (lODBFreigabe != null)
				msgs = ((InternalEObject)lODBFreigabe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE, null, msgs);
			if (newLODBFreigabe != null)
				msgs = ((InternalEObject)newLODBFreigabe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE, null, msgs);
			msgs = basicSetLODBFreigabe(newLODBFreigabe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE, newLODBFreigabe, newLODBFreigabe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_EMA_Nr_TypeClass getLOEMANr() {
		return lOEMANr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLOEMANr(LO_EMA_Nr_TypeClass newLOEMANr, NotificationChain msgs) {
		LO_EMA_Nr_TypeClass oldLOEMANr = lOEMANr;
		lOEMANr = newLOEMANr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR, oldLOEMANr, newLOEMANr);
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
	public void setLOEMANr(LO_EMA_Nr_TypeClass newLOEMANr) {
		if (newLOEMANr != lOEMANr) {
			NotificationChain msgs = null;
			if (lOEMANr != null)
				msgs = ((InternalEObject)lOEMANr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR, null, msgs);
			if (newLOEMANr != null)
				msgs = ((InternalEObject)newLOEMANr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR, null, msgs);
			msgs = basicSetLOEMANr(newLOEMANr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR, newLOEMANr, newLOEMANr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_Firmensachnummer_TypeClass getLOFirmensachnummer() {
		return lOFirmensachnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLOFirmensachnummer(LO_Firmensachnummer_TypeClass newLOFirmensachnummer, NotificationChain msgs) {
		LO_Firmensachnummer_TypeClass oldLOFirmensachnummer = lOFirmensachnummer;
		lOFirmensachnummer = newLOFirmensachnummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER, oldLOFirmensachnummer, newLOFirmensachnummer);
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
	public void setLOFirmensachnummer(LO_Firmensachnummer_TypeClass newLOFirmensachnummer) {
		if (newLOFirmensachnummer != lOFirmensachnummer) {
			NotificationChain msgs = null;
			if (lOFirmensachnummer != null)
				msgs = ((InternalEObject)lOFirmensachnummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER, null, msgs);
			if (newLOFirmensachnummer != null)
				msgs = ((InternalEObject)newLOFirmensachnummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER, null, msgs);
			msgs = basicSetLOFirmensachnummer(newLOFirmensachnummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER, newLOFirmensachnummer, newLOFirmensachnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_Seriennummer_TypeClass getLOSeriennummer() {
		return lOSeriennummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLOSeriennummer(LO_Seriennummer_TypeClass newLOSeriennummer, NotificationChain msgs) {
		LO_Seriennummer_TypeClass oldLOSeriennummer = lOSeriennummer;
		lOSeriennummer = newLOSeriennummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER, oldLOSeriennummer, newLOSeriennummer);
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
	public void setLOSeriennummer(LO_Seriennummer_TypeClass newLOSeriennummer) {
		if (newLOSeriennummer != lOSeriennummer) {
			NotificationChain msgs = null;
			if (lOSeriennummer != null)
				msgs = ((InternalEObject)lOSeriennummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER, null, msgs);
			if (newLOSeriennummer != null)
				msgs = ((InternalEObject)newLOSeriennummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER, null, msgs);
			msgs = basicSetLOSeriennummer(newLOSeriennummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER, newLOSeriennummer, newLOSeriennummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND:
				return basicSetLOAusgabestand(null, msgs);
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG:
				return basicSetLODatumHerstellung(null, msgs);
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE:
				return basicSetLODBFreigabe(null, msgs);
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR:
				return basicSetLOEMANr(null, msgs);
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER:
				return basicSetLOFirmensachnummer(null, msgs);
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER:
				return basicSetLOSeriennummer(null, msgs);
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
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND:
				return getLOAusgabestand();
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG:
				return getLODatumHerstellung();
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE:
				return getLODBFreigabe();
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR:
				return getLOEMANr();
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER:
				return getLOFirmensachnummer();
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER:
				return getLOSeriennummer();
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
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND:
				setLOAusgabestand((LO_Ausgabestand_TypeClass)newValue);
				return;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG:
				setLODatumHerstellung((LO_Datum_Herstellung_TypeClass)newValue);
				return;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE:
				setLODBFreigabe((LO_DB_Freigabe_TypeClass)newValue);
				return;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR:
				setLOEMANr((LO_EMA_Nr_TypeClass)newValue);
				return;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER:
				setLOFirmensachnummer((LO_Firmensachnummer_TypeClass)newValue);
				return;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER:
				setLOSeriennummer((LO_Seriennummer_TypeClass)newValue);
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
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND:
				setLOAusgabestand((LO_Ausgabestand_TypeClass)null);
				return;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG:
				setLODatumHerstellung((LO_Datum_Herstellung_TypeClass)null);
				return;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE:
				setLODBFreigabe((LO_DB_Freigabe_TypeClass)null);
				return;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR:
				setLOEMANr((LO_EMA_Nr_TypeClass)null);
				return;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER:
				setLOFirmensachnummer((LO_Firmensachnummer_TypeClass)null);
				return;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER:
				setLOSeriennummer((LO_Seriennummer_TypeClass)null);
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
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND:
				return lOAusgabestand != null;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG:
				return lODatumHerstellung != null;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE:
				return lODBFreigabe != null;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR:
				return lOEMANr != null;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER:
				return lOFirmensachnummer != null;
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER:
				return lOSeriennummer != null;
		}
		return super.eIsSet(featureID);
	}

} //LO_Material_AttributeGroupImpl
