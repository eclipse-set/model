/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Block;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Block_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Gleis_Bezeichnung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Technische Einrichtungen für die blocktechnische Sicherung von Zugfahrten auf Streckengleisen. Die zugehörige Bezeichnung des Streckengleises wird über das Objekt Gleis Bezeichnung ermittelt. Die Klammern der Gleisbezeichnung für Streckengleise sind Bestandteil der Gleisbezeichnung. Für die Darstellung der Streckendaten für eine Blockstrecke wird über das Objekt Block Element das Objekt Block Strecke verwendet. Ist Streckenblock geplant, wird einem Streckengleis eine Block_Anlage zugeordnet. Bei einer zweigleisigen Strecke, bei der beide Streckengleise mit Streckenblock ausgerüstet sind, wird den beiden Streckengleisen jeweils eine eigene Block_Anlage zugeordnet. Eine Block_Anlage verfügt über zwei Block_Elemente A und B (Blockendstellen), die entsprechend der Regelfahrrichtung zugewiesen werden. Bei eingleisigen Strecken ergibt sich der Richtungssinn A - B aus der Streckenkilometrierung. Eine Ausnahme bildet der Stichstreckenblock, dem nur ein Block Element zugeordnet wird. Als Zusammenfassung aller Objekte wird auch die Bezeichnung Block verwendet. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Anlage#getBlockAnlageAllg <em>Block Anlage Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Anlage#getIDBlockElementA <em>ID Block Element A</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Anlage#getIDBlockElementB <em>ID Block Element B</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Anlage#getIDGleisBezeichnung <em>ID Gleis Bezeichnung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Anlage()
 * @model extendedMetaData="name='CBlock_Anlage' kind='elementOnly'"
 * @generated
 */
public interface Block_Anlage extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Block Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Anlage Allg</em>' containment reference.
	 * @see #setBlockAnlageAllg(Block_Anlage_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Anlage_BlockAnlageAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Block_Anlage_Allg'"
	 * @generated
	 */
	Block_Anlage_Allg_AttributeGroup getBlockAnlageAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Anlage#getBlockAnlageAllg <em>Block Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Anlage Allg</em>' containment reference.
	 * @see #getBlockAnlageAllg()
	 * @generated
	 */
	void setBlockAnlageAllg(Block_Anlage_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Block Element A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Block_Element am Anfang einer Blockanlage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Block Element A</em>' containment reference.
	 * @see #setIDBlockElementA(ID_Block_Element_TypeClass)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Anlage_IDBlockElementA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Block_Element_A'"
	 * @generated
	 */
	ID_Block_Element_TypeClass getIDBlockElementA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Anlage#getIDBlockElementA <em>ID Block Element A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Block Element A</em>' containment reference.
	 * @see #getIDBlockElementA()
	 * @generated
	 */
	void setIDBlockElementA(ID_Block_Element_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Block Element B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Block_Element am Ende einer Blockanlage. Die Angabe ist nur bei Stichstreckenblock nicht erforderlich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Block Element B</em>' containment reference.
	 * @see #setIDBlockElementB(ID_Block_Element_TypeClass)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Anlage_IDBlockElementB()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Block_Element_B'"
	 * @generated
	 */
	ID_Block_Element_TypeClass getIDBlockElementB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Anlage#getIDBlockElementB <em>ID Block Element B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Block Element B</em>' containment reference.
	 * @see #getIDBlockElementB()
	 * @generated
	 */
	void setIDBlockElementB(ID_Block_Element_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Gleis Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das zugehörige Streckengleis als Träger der Bezeichnung des Streckengleises zwischen den beiden Blockendstellen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Gleis Bezeichnung</em>' containment reference.
	 * @see #setIDGleisBezeichnung(ID_Gleis_Bezeichnung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Anlage_IDGleisBezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Gleis_Bezeichnung'"
	 * @generated
	 */
	ID_Gleis_Bezeichnung_TypeClass getIDGleisBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Anlage#getIDGleisBezeichnung <em>ID Gleis Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Gleis Bezeichnung</em>' containment reference.
	 * @see #getIDGleisBezeichnung()
	 * @generated
	 */
	void setIDGleisBezeichnung(ID_Gleis_Bezeichnung_TypeClass value);

} // Block_Anlage
