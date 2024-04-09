/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Anlage VAllg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMaxSchiene <em>VMax Schiene</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMaxStrasse <em>VMax Strasse</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMinFussweg <em>VMin Fussweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMinSchiene <em>VMin Schiene</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMinStrasse <em>VMin Strasse</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_V_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBUE_Anlage_V_Allg' kind='elementOnly'"
 * @generated
 */
public interface BUE_Anlage_V_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>VMax Schiene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zulässige gleisbezogene Geschwindkeit im im Bereich der Einschaltstrecke bzw. im BÜ-Bereich (vE).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VMax Schiene</em>' containment reference.
	 * @see #setVMaxSchiene(V_Max_Schiene_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_V_Allg_AttributeGroup_VMaxSchiene()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='V_Max_Schiene'"
	 * @generated
	 */
	V_Max_Schiene_TypeClass getVMaxSchiene();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMaxSchiene <em>VMax Schiene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VMax Schiene</em>' containment reference.
	 * @see #getVMaxSchiene()
	 * @generated
	 */
	void setVMaxSchiene(V_Max_Schiene_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VMax Strasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zulässige Geschwindkeit auf der den BÜ kreuzenden Straße (vST).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VMax Strasse</em>' containment reference.
	 * @see #setVMaxStrasse(V_Max_Strasse_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_V_Allg_AttributeGroup_VMaxStrasse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='V_Max_Strasse'"
	 * @generated
	 */
	V_Max_Strasse_TypeClass getVMaxStrasse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMaxStrasse <em>VMax Strasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VMax Strasse</em>' containment reference.
	 * @see #getVMaxStrasse()
	 * @generated
	 */
	void setVMaxStrasse(V_Max_Strasse_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VMin Fussweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimale Räumgeschwindigkeit von Fußgängern auf dem den BÜ kreuzenden Weg in m/s (vF). Zulässig sind 1,0 bis 1,5 m/s bzw. 0,5 oder 0,8 m/s bei technischer Reisendensicherung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VMin Fussweg</em>' containment reference.
	 * @see #setVMinFussweg(V_Min_Fussweg_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_V_Allg_AttributeGroup_VMinFussweg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='V_Min_Fussweg'"
	 * @generated
	 */
	V_Min_Fussweg_TypeClass getVMinFussweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMinFussweg <em>VMin Fussweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VMin Fussweg</em>' containment reference.
	 * @see #getVMinFussweg()
	 * @generated
	 */
	void setVMinFussweg(V_Min_Fussweg_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VMin Schiene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geschwindkeit des langsamsten Regelzugs im Bereich der Einschaltstrecke bzw. im BÜ-Bereich (vEL).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VMin Schiene</em>' containment reference.
	 * @see #setVMinSchiene(V_Min_Schiene_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_V_Allg_AttributeGroup_VMinSchiene()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='V_Min_Schiene'"
	 * @generated
	 */
	V_Min_Schiene_TypeClass getVMinSchiene();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMinSchiene <em>VMin Schiene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VMin Schiene</em>' containment reference.
	 * @see #getVMinSchiene()
	 * @generated
	 */
	void setVMinSchiene(V_Min_Schiene_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VMin Strasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimale Räumgeschwindigkeit von Fahrzeugen auf der den BÜ kreuzenden Straße (vST). Zulässig sind 5 oder 10 km/h.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VMin Strasse</em>' containment reference.
	 * @see #setVMinStrasse(V_Min_Strasse_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_V_Allg_AttributeGroup_VMinStrasse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='V_Min_Strasse'"
	 * @generated
	 */
	V_Min_Strasse_TypeClass getVMinStrasse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup#getVMinStrasse <em>VMin Strasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VMin Strasse</em>' containment reference.
	 * @see #getVMinStrasse()
	 * @generated
	 */
	void setVMinStrasse(V_Min_Strasse_TypeClass value);

} // BUE_Anlage_V_Allg_AttributeGroup
