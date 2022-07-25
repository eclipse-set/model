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
 * A representation of the model object '<em><b>LEU Schaltkasten Position Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Position_AttributeGroup#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Position_AttributeGroup#getPositionSonstige <em>Position Sonstige</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Position_AttributeGroup()
 * @model extendedMetaData="name='CLEU_Schaltkasten_Position' kind='elementOnly'"
 * @generated
 */
public interface LEU_Schaltkasten_Position_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Position des LEU-Schaltkastens in Relation zur Wirkrichtung des betrieblichen Bezugspunkts (Signal). Die Ermittlung erfolgt über die zughörigen Datenpunkte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Position_AttributeGroup_Position()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Position'"
	 * @generated
	 */
	Position_TypeClass getPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Position_AttributeGroup#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Position Sonstige</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sonstige Position des LEU-Schaltkastens, sofern das Attribut \"Position\" nicht verwendet werden kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Sonstige</em>' containment reference.
	 * @see #setPositionSonstige(Position_Sonstige_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Position_AttributeGroup_PositionSonstige()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Position_Sonstige'"
	 * @generated
	 */
	Position_Sonstige_TypeClass getPositionSonstige();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Position_AttributeGroup#getPositionSonstige <em>Position Sonstige</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Sonstige</em>' containment reference.
	 * @see #getPositionSonstige()
	 * @generated
	 */
	void setPositionSonstige(Position_Sonstige_TypeClass value);

} // LEU_Schaltkasten_Position_AttributeGroup
