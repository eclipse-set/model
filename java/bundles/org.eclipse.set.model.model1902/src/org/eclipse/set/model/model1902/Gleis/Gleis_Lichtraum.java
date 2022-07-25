/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Gleis;

import org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gleis Lichtraum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bereich, in dem besondere Lichtraumbedingungen vorhanden sind. Es werden nur die Bereiche angegeben, in denen von der EBO abweichende und LST-relevante Lichtraumbedingungen vorhanden oder zu beachten sind. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Gleis.Gleis_Lichtraum#getLichtraumprofil <em>Lichtraumprofil</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Gleis.GleisPackage#getGleis_Lichtraum()
 * @model extendedMetaData="name='CGleis_Lichtraum' kind='elementOnly'"
 * @generated
 */
public interface Gleis_Lichtraum extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Lichtraumprofil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des von der EBO abweichenden Lichtraumprofils. Bei Auswahl des ENUM-Werts \"sonstige\" ist mittels Bearbeitungsvermerk eine Profilzeichnung als Anhang beizulegen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lichtraumprofil</em>' containment reference.
	 * @see #setLichtraumprofil(Lichtraumprofil_TypeClass)
	 * @see org.eclipse.set.model.model1902.Gleis.GleisPackage#getGleis_Lichtraum_Lichtraumprofil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Lichtraumprofil'"
	 * @generated
	 */
	Lichtraumprofil_TypeClass getLichtraumprofil();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Gleis.Gleis_Lichtraum#getLichtraumprofil <em>Lichtraumprofil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lichtraumprofil</em>' containment reference.
	 * @see #getLichtraumprofil()
	 * @generated
	 */
	void setLichtraumprofil(Lichtraumprofil_TypeClass value);

} // Gleis_Lichtraum
