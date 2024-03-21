/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zuglenkung;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_ZL_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL Signalgruppe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Gruppe von Signalen (Haupt-, Sperrsignale), die von der Zug- bzw. Rangierlenkung für die Vorzugregelung benötigt wird. DB-Regelwerk 819.0732 A06 Im PT1 erfolgt die Angabe in einer gesonderten Tabelle, für die es im Regelwerk z. Zt. keine Vorgabe gibt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Signalgruppe#getIDZL <em>IDZL</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Signalgruppe#getZLSignalgruppeAllg <em>ZL Signalgruppe Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe()
 * @model extendedMetaData="name='CZL_Signalgruppe' kind='elementOnly'"
 * @generated
 */
public interface ZL_Signalgruppe extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDZL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige ZL, der die Signalgruppe zugeordnet ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZL</em>' containment reference.
	 * @see #setIDZL(ID_ZL_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe_IDZL()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZL'"
	 * @generated
	 */
	ID_ZL_TypeClass getIDZL();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Signalgruppe#getIDZL <em>IDZL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZL</em>' containment reference.
	 * @see #getIDZL()
	 * @generated
	 */
	void setIDZL(ID_ZL_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZL Signalgruppe Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZL Signalgruppe Allg</em>' containment reference.
	 * @see #setZLSignalgruppeAllg(ZL_Signalgruppe_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe_ZLSignalgruppeAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZL_Signalgruppe_Allg'"
	 * @generated
	 */
	ZL_Signalgruppe_Allg_AttributeGroup getZLSignalgruppeAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Signalgruppe#getZLSignalgruppeAllg <em>ZL Signalgruppe Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZL Signalgruppe Allg</em>' containment reference.
	 * @see #getZLSignalgruppeAllg()
	 * @generated
	 */
	void setZLSignalgruppeAllg(ZL_Signalgruppe_Allg_AttributeGroup value);

} // ZL_Signalgruppe
