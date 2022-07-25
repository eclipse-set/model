/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GFR Tripelspiegel Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup#getMontagehoehe <em>Montagehoehe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup#getPegel <em>Pegel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup#getWinkelAlpha <em>Winkel Alpha</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getGFR_Tripelspiegel_Allg_AttributeGroup()
 * @model extendedMetaData="name='CGFR_Tripelspiegel_Allg' kind='elementOnly'"
 * @generated
 */
public interface GFR_Tripelspiegel_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Montagehoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Höhe, in der der Tripelspiegel angebracht ist (Rücklaufdatum PT 2).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Montagehoehe</em>' containment reference.
	 * @see #setMontagehoehe(Montagehoehe_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getGFR_Tripelspiegel_Allg_AttributeGroup_Montagehoehe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Montagehoehe'"
	 * @generated
	 */
	Montagehoehe_TypeClass getMontagehoehe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup#getMontagehoehe <em>Montagehoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Montagehoehe</em>' containment reference.
	 * @see #getMontagehoehe()
	 * @generated
	 */
	void setMontagehoehe(Montagehoehe_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Pegel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rücklaufdatum (PT 2)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pegel</em>' containment reference.
	 * @see #setPegel(Pegel_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getGFR_Tripelspiegel_Allg_AttributeGroup_Pegel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Pegel'"
	 * @generated
	 */
	Pegel_TypeClass getPegel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup#getPegel <em>Pegel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pegel</em>' containment reference.
	 * @see #getPegel()
	 * @generated
	 */
	void setPegel(Pegel_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Winkel Alpha</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Winkel des Tripelspiegels ausgehend von der Linie GFR-Anlage - Tripelspiegel 1. Die Zählung erfolgt entgegen des Uhrzeigersinns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Winkel Alpha</em>' containment reference.
	 * @see #setWinkelAlpha(Winkel_Alpha_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getGFR_Tripelspiegel_Allg_AttributeGroup_WinkelAlpha()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Winkel_Alpha'"
	 * @generated
	 */
	Winkel_Alpha_TypeClass getWinkelAlpha();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup#getWinkelAlpha <em>Winkel Alpha</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winkel Alpha</em>' containment reference.
	 * @see #getWinkelAlpha()
	 * @generated
	 */
	void setWinkelAlpha(Winkel_Alpha_TypeClass value);

} // GFR_Tripelspiegel_Allg_AttributeGroup
