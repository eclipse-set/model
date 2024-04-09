/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnsteig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bahnsteig Zugang Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup#getBahnsteigZugangArt <em>Bahnsteig Zugang Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup#getHauptzugang <em>Hauptzugang</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage#getBahnsteig_Zugang_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBahnsteig_Zugang_Allg' kind='elementOnly'"
 * @generated
 */
public interface Bahnsteig_Zugang_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bahnsteig Zugang Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Zugangs zum Bahnsteig. Das Attribut dient nur dazu, im INA-Erhebungsbogen die Zugänge zum Bahnsteig grob zu unterscheiden. DB-Regelwerk Eintrag im INA-Erhebungsbogen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bahnsteig Zugang Art</em>' containment reference.
	 * @see #setBahnsteigZugangArt(Bahnsteig_Zugang_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage#getBahnsteig_Zugang_Allg_AttributeGroup_BahnsteigZugangArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bahnsteig_Zugang_Art'"
	 * @generated
	 */
	Bahnsteig_Zugang_Art_TypeClass getBahnsteigZugangArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup#getBahnsteigZugangArt <em>Bahnsteig Zugang Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bahnsteig Zugang Art</em>' containment reference.
	 * @see #getBahnsteigZugangArt()
	 * @generated
	 */
	void setBahnsteigZugangArt(Bahnsteig_Zugang_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hauptzugang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Bahnsteig Zugang ein Hauptzugang ist (true) oder noicht (false). Die Angabe ist für die INA-Berechnung relevant. Je Bahnsteig Anlage darf nur ein Hauptzugang bestimmt werden. DB-Regelwerk Eintrag im INA-Erhebungsbogen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hauptzugang</em>' containment reference.
	 * @see #setHauptzugang(Hauptzugang_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage#getBahnsteig_Zugang_Allg_AttributeGroup_Hauptzugang()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Hauptzugang'"
	 * @generated
	 */
	Hauptzugang_TypeClass getHauptzugang();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup#getHauptzugang <em>Hauptzugang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauptzugang</em>' containment reference.
	 * @see #getHauptzugang()
	 * @generated
	 */
	void setHauptzugang(Hauptzugang_TypeClass value);

} // Bahnsteig_Zugang_Allg_AttributeGroup
