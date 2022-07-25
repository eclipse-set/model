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
 * A representation of the model object '<em><b>Vz Sperrstrecke Vorgeschaltet Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getBeeinflussungStrassenverkehr <em>Beeinflussung Strassenverkehr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDAB <em>Raeumstrecke DAB</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDBK <em>Raeumstrecke DBK</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDCK <em>Raeumstrecke DCK</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDSKStrich <em>Raeumstrecke DSK Strich</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup()
 * @model extendedMetaData="name='CVz_Sperrstrecke_Vorgeschaltet' kind='elementOnly'"
 * @generated
 */
public interface Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Beeinflussung Strassenverkehr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nur bei BUESTRA: Beeinflussung des Straßenverkehrs (Parameter tK1 gemäß Ril 815.0051).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beeinflussung Strassenverkehr</em>' containment reference.
	 * @see #setBeeinflussungStrassenverkehr(Beeinflussung_Strassenverkehr_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_BeeinflussungStrassenverkehr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Beeinflussung_Strassenverkehr'"
	 * @generated
	 */
	Beeinflussung_Strassenverkehr_TypeClass getBeeinflussungStrassenverkehr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getBeeinflussungStrassenverkehr <em>Beeinflussung Strassenverkehr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beeinflussung Strassenverkehr</em>' containment reference.
	 * @see #getBeeinflussungStrassenverkehr()
	 * @generated
	 */
	void setBeeinflussungStrassenverkehr(Beeinflussung_Strassenverkehr_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Raeumstrecke DAB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Räumstrecke dAB gemäß Ril 815.0033A01 (vorgeschaltete Lichtzeichen).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raeumstrecke DAB</em>' containment reference.
	 * @see #setRaeumstreckeDAB(Raeumstrecke_DAB_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDAB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Raeumstrecke_DAB'"
	 * @generated
	 */
	Raeumstrecke_DAB_TypeClass getRaeumstreckeDAB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDAB <em>Raeumstrecke DAB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raeumstrecke DAB</em>' containment reference.
	 * @see #getRaeumstreckeDAB()
	 * @generated
	 */
	void setRaeumstreckeDAB(Raeumstrecke_DAB_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Raeumstrecke DBK</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Räumstrecke dBK gemäß Ril 815.0033A01 (vorgeschaltete Lichtzeichen).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raeumstrecke DBK</em>' containment reference.
	 * @see #setRaeumstreckeDBK(Raeumstrecke_DBK_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDBK()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Raeumstrecke_DBK'"
	 * @generated
	 */
	Raeumstrecke_DBK_TypeClass getRaeumstreckeDBK();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDBK <em>Raeumstrecke DBK</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raeumstrecke DBK</em>' containment reference.
	 * @see #getRaeumstreckeDBK()
	 * @generated
	 */
	void setRaeumstreckeDBK(Raeumstrecke_DBK_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Raeumstrecke DCK</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Räumstrecke dCK gemäß Ril 815.0033A01 (vorgeschaltete Lichtzeichen).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raeumstrecke DCK</em>' containment reference.
	 * @see #setRaeumstreckeDCK(Raeumstrecke_DCK_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDCK()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Raeumstrecke_DCK'"
	 * @generated
	 */
	Raeumstrecke_DCK_TypeClass getRaeumstreckeDCK();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDCK <em>Raeumstrecke DCK</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raeumstrecke DCK</em>' containment reference.
	 * @see #getRaeumstreckeDCK()
	 * @generated
	 */
	void setRaeumstreckeDCK(Raeumstrecke_DCK_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Raeumstrecke DSK Strich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Räumstrecke dSK\u0027 gemäß Ril 815.0033A01 (vorgeschaltete Lichtzeichen).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raeumstrecke DSK Strich</em>' containment reference.
	 * @see #setRaeumstreckeDSKStrich(Raeumstrecke_DSK_Strich_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDSKStrich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Raeumstrecke_DSK_Strich'"
	 * @generated
	 */
	Raeumstrecke_DSK_Strich_TypeClass getRaeumstreckeDSKStrich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup#getRaeumstreckeDSKStrich <em>Raeumstrecke DSK Strich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raeumstrecke DSK Strich</em>' containment reference.
	 * @see #getRaeumstreckeDSKStrich()
	 * @generated
	 */
	void setRaeumstreckeDSKStrich(Raeumstrecke_DSK_Strich_TypeClass value);

} // Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup
