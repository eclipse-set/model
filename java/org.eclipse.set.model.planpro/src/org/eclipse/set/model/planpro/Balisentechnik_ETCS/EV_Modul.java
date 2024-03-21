/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EV Modul</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Energieversorgungsmodul. Einheit, die die Energieversorgung aller Ihr zugeordneten Elemente sicherstellt. Das EV-Modul kann physisch (eigenes Element) oder virtuell (Energie-Abgriff von bestehendem Element) sein.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul#getEVModulAusgang <em>EV Modul Ausgang</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul#getEVModulPhysisch <em>EV Modul Physisch</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul#getEVModulVirtuell <em>EV Modul Virtuell</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul()
 * @model extendedMetaData="name='CEV_Modul' kind='elementOnly'"
 * @generated
 */
public interface EV_Modul extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>EV Modul Ausgang</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EV Modul Ausgang</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_EVModulAusgang()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EV_Modul_Ausgang'"
	 * @generated
	 */
	EList<EV_Modul_Ausgang_AttributeGroup> getEVModulAusgang();

	/**
	 * Returns the value of the '<em><b>EV Modul Physisch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EV Modul Physisch</em>' containment reference.
	 * @see #setEVModulPhysisch(EV_Modul_Physisch_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_EVModulPhysisch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EV_Modul_Physisch'"
	 * @generated
	 */
	EV_Modul_Physisch_AttributeGroup getEVModulPhysisch();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul#getEVModulPhysisch <em>EV Modul Physisch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EV Modul Physisch</em>' containment reference.
	 * @see #getEVModulPhysisch()
	 * @generated
	 */
	void setEVModulPhysisch(EV_Modul_Physisch_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>EV Modul Virtuell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EV Modul Virtuell</em>' containment reference.
	 * @see #setEVModulVirtuell(EV_Modul_Virtuell_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_EVModulVirtuell()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EV_Modul_Virtuell'"
	 * @generated
	 */
	EV_Modul_Virtuell_AttributeGroup getEVModulVirtuell();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul#getEVModulVirtuell <em>EV Modul Virtuell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EV Modul Virtuell</em>' containment reference.
	 * @see #getEVModulVirtuell()
	 * @generated
	 */
	void setEVModulVirtuell(EV_Modul_Virtuell_AttributeGroup value);

} // EV_Modul
