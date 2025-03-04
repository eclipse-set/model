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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Prog_Datei_Gruppe;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Komponente_Programmiert_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prog Datei Gruppe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Prog_Datei_GruppeImpl#getIDKomponenteProgrammiert <em>ID Komponente Programmiert</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Prog_Datei_GruppeImpl#getProgDateiEinzel <em>Prog Datei Einzel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Prog_Datei_GruppeImpl extends Basis_ObjektImpl implements Prog_Datei_Gruppe {
	/**
	 * The cached value of the '{@link #getIDKomponenteProgrammiert() <em>ID Komponente Programmiert</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDKomponenteProgrammiert()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Komponente_Programmiert_TypeClass> iDKomponenteProgrammiert;

	/**
	 * The cached value of the '{@link #getProgDateiEinzel() <em>Prog Datei Einzel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgDateiEinzel()
	 * @generated
	 * @ordered
	 */
	protected EList<Prog_Datei_Einzel_AttributeGroup> progDateiEinzel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Prog_Datei_GruppeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getProg_Datei_Gruppe();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Komponente_Programmiert_TypeClass> getIDKomponenteProgrammiert() {
		if (iDKomponenteProgrammiert == null) {
			iDKomponenteProgrammiert = new EObjectContainmentEList<ID_Komponente_Programmiert_TypeClass>(ID_Komponente_Programmiert_TypeClass.class, this, Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__ID_KOMPONENTE_PROGRAMMIERT);
		}
		return iDKomponenteProgrammiert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Prog_Datei_Einzel_AttributeGroup> getProgDateiEinzel() {
		if (progDateiEinzel == null) {
			progDateiEinzel = new EObjectContainmentEList<Prog_Datei_Einzel_AttributeGroup>(Prog_Datei_Einzel_AttributeGroup.class, this, Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__PROG_DATEI_EINZEL);
		}
		return progDateiEinzel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__ID_KOMPONENTE_PROGRAMMIERT:
				return ((InternalEList<?>)getIDKomponenteProgrammiert()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__PROG_DATEI_EINZEL:
				return ((InternalEList<?>)getProgDateiEinzel()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__ID_KOMPONENTE_PROGRAMMIERT:
				return getIDKomponenteProgrammiert();
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__PROG_DATEI_EINZEL:
				return getProgDateiEinzel();
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__ID_KOMPONENTE_PROGRAMMIERT:
				getIDKomponenteProgrammiert().clear();
				getIDKomponenteProgrammiert().addAll((Collection<? extends ID_Komponente_Programmiert_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__PROG_DATEI_EINZEL:
				getProgDateiEinzel().clear();
				getProgDateiEinzel().addAll((Collection<? extends Prog_Datei_Einzel_AttributeGroup>)newValue);
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__ID_KOMPONENTE_PROGRAMMIERT:
				getIDKomponenteProgrammiert().clear();
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__PROG_DATEI_EINZEL:
				getProgDateiEinzel().clear();
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__ID_KOMPONENTE_PROGRAMMIERT:
				return iDKomponenteProgrammiert != null && !iDKomponenteProgrammiert.isEmpty();
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__PROG_DATEI_EINZEL:
				return progDateiEinzel != null && !progDateiEinzel.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Prog_Datei_GruppeImpl
