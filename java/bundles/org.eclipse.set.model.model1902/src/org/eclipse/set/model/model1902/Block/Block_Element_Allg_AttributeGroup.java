/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Block;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Element_Allg_AttributeGroup#getBlockBauform <em>Block Bauform</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Element_Allg_AttributeGroup#getRueckblockwecker <em>Rueckblockwecker</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Element_Allg_AttributeGroup#getVorblockwecker <em>Vorblockwecker</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Element_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBlock_Element_Allg' kind='elementOnly'"
 * @generated
 */
public interface Block_Element_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Block Bauform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technische Ausprägung der Blockbauform an den beiden Enden einer Blockanlage. Eine Blockstrecke beginnt und endet an einer Betriebsstelle, zu der jeweils ein Block Element mit der entsprechenden Block_Bauform zugeordnet wird. DB-Regelwerk Ril 482.9001A07, Seite 1 und 5 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block Bauform</em>' containment reference.
	 * @see #setBlockBauform(Block_Bauform_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Element_Allg_AttributeGroup_BlockBauform()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Block_Bauform'"
	 * @generated
	 */
	Block_Bauform_TypeClass getBlockBauform();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Element_Allg_AttributeGroup#getBlockBauform <em>Block Bauform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Bauform</em>' containment reference.
	 * @see #getBlockBauform()
	 * @generated
	 */
	void setBlockBauform(Block_Bauform_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Rueckblockwecker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für den Streckenblock des Streckengleises ist ein Rückblockwecker eingerichtet. Mit dieser technischen Einrichtung wird eine akustische Meldung beim Eintreffen des Rückblocks von der Gegenstelle ausgegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rueckblockwecker</em>' containment reference.
	 * @see #setRueckblockwecker(Rueckblockwecker_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Element_Allg_AttributeGroup_Rueckblockwecker()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Rueckblockwecker'"
	 * @generated
	 */
	Rueckblockwecker_TypeClass getRueckblockwecker();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Element_Allg_AttributeGroup#getRueckblockwecker <em>Rueckblockwecker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rueckblockwecker</em>' containment reference.
	 * @see #getRueckblockwecker()
	 * @generated
	 */
	void setRueckblockwecker(Rueckblockwecker_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Vorblockwecker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für den Streckenblock des Streckengleises ist ein Vorkblockwecker eingerichtet. Mit dieser technischen Einrichtung wird eine akustische Meldung beim Eintreffen des Vorblocks von der Gegenstelle ausgegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vorblockwecker</em>' containment reference.
	 * @see #setVorblockwecker(Vorblockwecker_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Element_Allg_AttributeGroup_Vorblockwecker()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Vorblockwecker'"
	 * @generated
	 */
	Vorblockwecker_TypeClass getVorblockwecker();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Element_Allg_AttributeGroup#getVorblockwecker <em>Vorblockwecker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorblockwecker</em>' containment reference.
	 * @see #getVorblockwecker()
	 * @generated
	 */
	void setVorblockwecker(Vorblockwecker_TypeClass value);

} // Block_Element_Allg_AttributeGroup
