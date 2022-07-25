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
 * A representation of the model object '<em><b>Block Anlage Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Anlage_Allg_AttributeGroup#getSchaltung <em>Schaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Anlage_Allg_AttributeGroup#getSchutzuebertrager <em>Schutzuebertrager</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Anlage_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBlock_Anlage_Allg' kind='elementOnly'"
 * @generated
 */
public interface Block_Anlage_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Schaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausführung der Schaltung für die Übertragung der Blockinformationen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schaltung</em>' containment reference.
	 * @see #setSchaltung(Schaltung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Anlage_Allg_AttributeGroup_Schaltung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schaltung'"
	 * @generated
	 */
	Schaltung_TypeClass getSchaltung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Anlage_Allg_AttributeGroup#getSchaltung <em>Schaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schaltung</em>' containment reference.
	 * @see #getSchaltung()
	 * @generated
	 */
	void setSchaltung(Schaltung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Schutzuebertrager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Schaltung des Streckenblocks ist mit Schutzübertrager ausgerüstet. Die konkrete Anzahl der Schutzübertrager ergibt sich aus der Beeinflussungsberechnung, die nicht Bestandteil des Modells ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schutzuebertrager</em>' containment reference.
	 * @see #setSchutzuebertrager(Schutzuebertrager_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Anlage_Allg_AttributeGroup_Schutzuebertrager()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schutzuebertrager'"
	 * @generated
	 */
	Schutzuebertrager_TypeClass getSchutzuebertrager();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Anlage_Allg_AttributeGroup#getSchutzuebertrager <em>Schutzuebertrager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schutzuebertrager</em>' containment reference.
	 * @see #getSchutzuebertrager()
	 * @generated
	 */
	void setSchutzuebertrager(Schutzuebertrager_TypeClass value);

} // Block_Anlage_Allg_AttributeGroup
