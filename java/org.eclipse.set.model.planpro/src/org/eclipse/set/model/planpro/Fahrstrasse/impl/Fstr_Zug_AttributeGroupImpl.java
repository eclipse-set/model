/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse.impl;

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

import org.eclipse.set.model.planpro.Fahrstrasse.Automatische_Einstellung_TypeClass;
import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Vsigabstand_Verkuerzt_TypeClass;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Art_TypeClass;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup;

import org.eclipse.set.model.planpro.Verweise.ID_BUE_Einschaltung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Zug Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl#getAutomatischeEinstellung <em>Automatische Einstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl#getFstrVsigabstandVerkuerzt <em>Fstr Vsigabstand Verkuerzt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl#getFstrZugArt <em>Fstr Zug Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl#getFstrZugDWeg <em>Fstr Zug DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl#getIDSignalGruppenausfahrt <em>ID Signal Gruppenausfahrt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_Zug_AttributeGroupImpl extends EObjectImpl implements Fstr_Zug_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAutomatischeEinstellung() <em>Automatische Einstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomatischeEinstellung()
	 * @generated
	 * @ordered
	 */
	protected Automatische_Einstellung_TypeClass automatischeEinstellung;

	/**
	 * The cached value of the '{@link #getFstrVsigabstandVerkuerzt() <em>Fstr Vsigabstand Verkuerzt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrVsigabstandVerkuerzt()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Vsigabstand_Verkuerzt_TypeClass fstrVsigabstandVerkuerzt;

	/**
	 * The cached value of the '{@link #getFstrZugArt() <em>Fstr Zug Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrZugArt()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Zug_Art_TypeClass fstrZugArt;

	/**
	 * The cached value of the '{@link #getFstrZugDWeg() <em>Fstr Zug DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrZugDWeg()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Zug_DWeg_AttributeGroup fstrZugDWeg;

	/**
	 * The cached value of the '{@link #getIDBUEEinschaltung() <em>IDBUE Einschaltung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEEinschaltung()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_BUE_Einschaltung_TypeClass> iDBUEEinschaltung;

	/**
	 * The cached value of the '{@link #getIDSignalGruppenausfahrt() <em>ID Signal Gruppenausfahrt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalGruppenausfahrt()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_TypeClass iDSignalGruppenausfahrt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_Zug_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Automatische_Einstellung_TypeClass getAutomatischeEinstellung() {
		return automatischeEinstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutomatischeEinstellung(Automatische_Einstellung_TypeClass newAutomatischeEinstellung, NotificationChain msgs) {
		Automatische_Einstellung_TypeClass oldAutomatischeEinstellung = automatischeEinstellung;
		automatischeEinstellung = newAutomatischeEinstellung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG, oldAutomatischeEinstellung, newAutomatischeEinstellung);
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
	public void setAutomatischeEinstellung(Automatische_Einstellung_TypeClass newAutomatischeEinstellung) {
		if (newAutomatischeEinstellung != automatischeEinstellung) {
			NotificationChain msgs = null;
			if (automatischeEinstellung != null)
				msgs = ((InternalEObject)automatischeEinstellung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG, null, msgs);
			if (newAutomatischeEinstellung != null)
				msgs = ((InternalEObject)newAutomatischeEinstellung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG, null, msgs);
			msgs = basicSetAutomatischeEinstellung(newAutomatischeEinstellung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG, newAutomatischeEinstellung, newAutomatischeEinstellung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Vsigabstand_Verkuerzt_TypeClass getFstrVsigabstandVerkuerzt() {
		return fstrVsigabstandVerkuerzt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrVsigabstandVerkuerzt(Fstr_Vsigabstand_Verkuerzt_TypeClass newFstrVsigabstandVerkuerzt, NotificationChain msgs) {
		Fstr_Vsigabstand_Verkuerzt_TypeClass oldFstrVsigabstandVerkuerzt = fstrVsigabstandVerkuerzt;
		fstrVsigabstandVerkuerzt = newFstrVsigabstandVerkuerzt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT, oldFstrVsigabstandVerkuerzt, newFstrVsigabstandVerkuerzt);
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
	public void setFstrVsigabstandVerkuerzt(Fstr_Vsigabstand_Verkuerzt_TypeClass newFstrVsigabstandVerkuerzt) {
		if (newFstrVsigabstandVerkuerzt != fstrVsigabstandVerkuerzt) {
			NotificationChain msgs = null;
			if (fstrVsigabstandVerkuerzt != null)
				msgs = ((InternalEObject)fstrVsigabstandVerkuerzt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT, null, msgs);
			if (newFstrVsigabstandVerkuerzt != null)
				msgs = ((InternalEObject)newFstrVsigabstandVerkuerzt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT, null, msgs);
			msgs = basicSetFstrVsigabstandVerkuerzt(newFstrVsigabstandVerkuerzt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT, newFstrVsigabstandVerkuerzt, newFstrVsigabstandVerkuerzt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_Art_TypeClass getFstrZugArt() {
		return fstrZugArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrZugArt(Fstr_Zug_Art_TypeClass newFstrZugArt, NotificationChain msgs) {
		Fstr_Zug_Art_TypeClass oldFstrZugArt = fstrZugArt;
		fstrZugArt = newFstrZugArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART, oldFstrZugArt, newFstrZugArt);
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
	public void setFstrZugArt(Fstr_Zug_Art_TypeClass newFstrZugArt) {
		if (newFstrZugArt != fstrZugArt) {
			NotificationChain msgs = null;
			if (fstrZugArt != null)
				msgs = ((InternalEObject)fstrZugArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART, null, msgs);
			if (newFstrZugArt != null)
				msgs = ((InternalEObject)newFstrZugArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART, null, msgs);
			msgs = basicSetFstrZugArt(newFstrZugArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART, newFstrZugArt, newFstrZugArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_DWeg_AttributeGroup getFstrZugDWeg() {
		return fstrZugDWeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrZugDWeg(Fstr_Zug_DWeg_AttributeGroup newFstrZugDWeg, NotificationChain msgs) {
		Fstr_Zug_DWeg_AttributeGroup oldFstrZugDWeg = fstrZugDWeg;
		fstrZugDWeg = newFstrZugDWeg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG, oldFstrZugDWeg, newFstrZugDWeg);
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
	public void setFstrZugDWeg(Fstr_Zug_DWeg_AttributeGroup newFstrZugDWeg) {
		if (newFstrZugDWeg != fstrZugDWeg) {
			NotificationChain msgs = null;
			if (fstrZugDWeg != null)
				msgs = ((InternalEObject)fstrZugDWeg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG, null, msgs);
			if (newFstrZugDWeg != null)
				msgs = ((InternalEObject)newFstrZugDWeg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG, null, msgs);
			msgs = basicSetFstrZugDWeg(newFstrZugDWeg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG, newFstrZugDWeg, newFstrZugDWeg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_BUE_Einschaltung_TypeClass> getIDBUEEinschaltung() {
		if (iDBUEEinschaltung == null) {
			iDBUEEinschaltung = new EObjectContainmentEList<ID_BUE_Einschaltung_TypeClass>(ID_BUE_Einschaltung_TypeClass.class, this, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG);
		}
		return iDBUEEinschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_TypeClass getIDSignalGruppenausfahrt() {
		return iDSignalGruppenausfahrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSignalGruppenausfahrt(ID_Signal_TypeClass newIDSignalGruppenausfahrt, NotificationChain msgs) {
		ID_Signal_TypeClass oldIDSignalGruppenausfahrt = iDSignalGruppenausfahrt;
		iDSignalGruppenausfahrt = newIDSignalGruppenausfahrt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT, oldIDSignalGruppenausfahrt, newIDSignalGruppenausfahrt);
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
	public void setIDSignalGruppenausfahrt(ID_Signal_TypeClass newIDSignalGruppenausfahrt) {
		if (newIDSignalGruppenausfahrt != iDSignalGruppenausfahrt) {
			NotificationChain msgs = null;
			if (iDSignalGruppenausfahrt != null)
				msgs = ((InternalEObject)iDSignalGruppenausfahrt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT, null, msgs);
			if (newIDSignalGruppenausfahrt != null)
				msgs = ((InternalEObject)newIDSignalGruppenausfahrt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT, null, msgs);
			msgs = basicSetIDSignalGruppenausfahrt(newIDSignalGruppenausfahrt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT, newIDSignalGruppenausfahrt, newIDSignalGruppenausfahrt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				return basicSetAutomatischeEinstellung(null, msgs);
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT:
				return basicSetFstrVsigabstandVerkuerzt(null, msgs);
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART:
				return basicSetFstrZugArt(null, msgs);
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG:
				return basicSetFstrZugDWeg(null, msgs);
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG:
				return ((InternalEList<?>)getIDBUEEinschaltung()).basicRemove(otherEnd, msgs);
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT:
				return basicSetIDSignalGruppenausfahrt(null, msgs);
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
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				return getAutomatischeEinstellung();
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT:
				return getFstrVsigabstandVerkuerzt();
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART:
				return getFstrZugArt();
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG:
				return getFstrZugDWeg();
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG:
				return getIDBUEEinschaltung();
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT:
				return getIDSignalGruppenausfahrt();
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
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				setAutomatischeEinstellung((Automatische_Einstellung_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT:
				setFstrVsigabstandVerkuerzt((Fstr_Vsigabstand_Verkuerzt_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART:
				setFstrZugArt((Fstr_Zug_Art_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG:
				setFstrZugDWeg((Fstr_Zug_DWeg_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG:
				getIDBUEEinschaltung().clear();
				getIDBUEEinschaltung().addAll((Collection<? extends ID_BUE_Einschaltung_TypeClass>)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT:
				setIDSignalGruppenausfahrt((ID_Signal_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				setAutomatischeEinstellung((Automatische_Einstellung_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT:
				setFstrVsigabstandVerkuerzt((Fstr_Vsigabstand_Verkuerzt_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART:
				setFstrZugArt((Fstr_Zug_Art_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG:
				setFstrZugDWeg((Fstr_Zug_DWeg_AttributeGroup)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG:
				getIDBUEEinschaltung().clear();
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT:
				setIDSignalGruppenausfahrt((ID_Signal_TypeClass)null);
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
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				return automatischeEinstellung != null;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT:
				return fstrVsigabstandVerkuerzt != null;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART:
				return fstrZugArt != null;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG:
				return fstrZugDWeg != null;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG:
				return iDBUEEinschaltung != null && !iDBUEEinschaltung.isEmpty();
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT:
				return iDSignalGruppenausfahrt != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_Zug_AttributeGroupImpl
