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
 * A representation of the model object '<em><b>Verkehrszeichen Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup#getAbstandGehwegFahrbahn <em>Abstand Gehweg Fahrbahn</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup#getAusrichtung <em>Ausrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup#getAusrichtungWinkel <em>Ausrichtung Winkel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Allg_AttributeGroup()
 * @model extendedMetaData="name='CVerkehrszeichen_Allg' kind='elementOnly'"
 * @generated
 */
public interface Verkehrszeichen_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstand Gehweg Fahrbahn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand von der Mitte des Verkehrszeichens zur nächstgelegenen Gehweg- bzw. Fahrbahnkante.Der seitlicher Abstand zur Gleisachse ist über die Eigenschaft \"Punkt_Objekt\" abgebildet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstand Gehweg Fahrbahn</em>' containment reference.
	 * @see #setAbstandGehwegFahrbahn(Abstand_Gehweg_Fahrbahn_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Allg_AttributeGroup_AbstandGehwegFahrbahn()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Abstand_Gehweg_Fahrbahn'"
	 * @generated
	 */
	Abstand_Gehweg_Fahrbahn_TypeClass getAbstandGehwegFahrbahn();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup#getAbstandGehwegFahrbahn <em>Abstand Gehweg Fahrbahn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstand Gehweg Fahrbahn</em>' containment reference.
	 * @see #getAbstandGehwegFahrbahn()
	 * @generated
	 */
	void setAbstandGehwegFahrbahn(Abstand_Gehweg_Fahrbahn_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ausrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generelle Ausrichtung des Verkehrszeichens in Bezug auf die Topologierichtung der TOP_Kante, an der das Verkehrszeichen verortet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausrichtung</em>' containment reference.
	 * @see #setAusrichtung(Ausrichtung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Allg_AttributeGroup_Ausrichtung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ausrichtung'"
	 * @generated
	 */
	Ausrichtung_TypeClass getAusrichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup#getAusrichtung <em>Ausrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausrichtung</em>' containment reference.
	 * @see #getAusrichtung()
	 * @generated
	 */
	void setAusrichtung(Ausrichtung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ausrichtung Winkel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausrichtungswinkel des Verkehrszeichens in Bezug auf die Tangente am Verortungspunkt auf der topologischen Kante. Ein direkter Bezug zur Straßenachse ist nicht möglich, da der Straßenverlauf zunächst nur als Bild eingebunden wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausrichtung Winkel</em>' containment reference.
	 * @see #setAusrichtungWinkel(Ausrichtung_Winkel_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Allg_AttributeGroup_AusrichtungWinkel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ausrichtung_Winkel'"
	 * @generated
	 */
	Ausrichtung_Winkel_TypeClass getAusrichtungWinkel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup#getAusrichtungWinkel <em>Ausrichtung Winkel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausrichtung Winkel</em>' containment reference.
	 * @see #getAusrichtungWinkel()
	 * @generated
	 */
	void setAusrichtungWinkel(Ausrichtung_Winkel_TypeClass value);

} // Verkehrszeichen_Allg_AttributeGroup
