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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL Signalgruppe Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Signalgruppe_Allg_AttributeGroup#getSignalgruppeBezeichner <em>Signalgruppe Bezeichner</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZL_Signalgruppe_Allg' kind='elementOnly'"
 * @generated
 */
public interface ZL_Signalgruppe_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Signalgruppe Bezeichner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichner der Signalgruppe für ZL und GBT. Die Bezeichnung ist mit dem Besteller abzustimmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signalgruppe Bezeichner</em>' containment reference.
	 * @see #setSignalgruppeBezeichner(Signalgruppe_Bezeichner_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe_Allg_AttributeGroup_SignalgruppeBezeichner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signalgruppe_Bezeichner'"
	 * @generated
	 */
	Signalgruppe_Bezeichner_TypeClass getSignalgruppeBezeichner();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Signalgruppe_Allg_AttributeGroup#getSignalgruppeBezeichner <em>Signalgruppe Bezeichner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalgruppe Bezeichner</em>' containment reference.
	 * @see #getSignalgruppeBezeichner()
	 * @generated
	 */
	void setSignalgruppeBezeichner(Signalgruppe_Bezeichner_TypeClass value);

} // ZL_Signalgruppe_Allg_AttributeGroup
