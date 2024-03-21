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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETCS Kante Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Kante_Bezeichnung_AttributeGroup#getBezeichnungETCSKante <em>Bezeichnung ETCS Kante</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CETCS_Kante_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface ETCS_Kante_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung ETCS Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der ETCS-Kante.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung ETCS Kante</em>' containment reference.
	 * @see #setBezeichnungETCSKante(Bezeichnung_ETCS_Kante_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante_Bezeichnung_AttributeGroup_BezeichnungETCSKante()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_ETCS_Kante'"
	 * @generated
	 */
	Bezeichnung_ETCS_Kante_TypeClass getBezeichnungETCSKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Kante_Bezeichnung_AttributeGroup#getBezeichnungETCSKante <em>Bezeichnung ETCS Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung ETCS Kante</em>' containment reference.
	 * @see #getBezeichnungETCSKante()
	 * @generated
	 */
	void setBezeichnungETCSKante(Bezeichnung_ETCS_Kante_TypeClass value);

} // ETCS_Kante_Bezeichnung_AttributeGroup
