/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Schaltkasten Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Bezeichnung_AttributeGroup#getNummerSchaltkasten <em>Nummer Schaltkasten</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CLEU_Schaltkasten_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface LEU_Schaltkasten_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Nummer Schaltkasten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer des Schaltkastens, die der Bezeichnung der LEU-Anlage für die Bezeichnung des LEU-Schaltkastens angefügt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nummer Schaltkasten</em>' containment reference.
	 * @see #setNummerSchaltkasten(Nummer_Schaltkasten_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Bezeichnung_AttributeGroup_NummerSchaltkasten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Nummer_Schaltkasten'"
	 * @generated
	 */
	Nummer_Schaltkasten_TypeClass getNummerSchaltkasten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Bezeichnung_AttributeGroup#getNummerSchaltkasten <em>Nummer Schaltkasten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nummer Schaltkasten</em>' containment reference.
	 * @see #getNummerSchaltkasten()
	 * @generated
	 */
	void setNummerSchaltkasten(Nummer_Schaltkasten_TypeClass value);

} // LEU_Schaltkasten_Bezeichnung_AttributeGroup
