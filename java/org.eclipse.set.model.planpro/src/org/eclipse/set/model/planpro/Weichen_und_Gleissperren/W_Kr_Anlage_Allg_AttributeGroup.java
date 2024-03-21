/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Weichen_und_Gleissperren;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WKr Anlage Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup#getIsolierfall <em>Isolierfall</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup#getWKrArt <em>WKr Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup#getWKrGrundform <em>WKr Grundform</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Anlage_Allg_AttributeGroup()
 * @model extendedMetaData="name='CW_Kr_Anlage_Allg' kind='elementOnly'"
 * @generated
 */
public interface W_Kr_Anlage_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Isolierfall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Isolierung der Weiche. Es wird bei der Verwendung von Gleisstromkreisen zur Freimeldung die Bezeichnung des Isolierfalls gemäß dem Katalog der Weichenisolierung angegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Isolierfall</em>' containment reference.
	 * @see #setIsolierfall(Isolierfall_TypeClass)
	 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Anlage_Allg_AttributeGroup_Isolierfall()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Isolierfall'"
	 * @generated
	 */
	Isolierfall_TypeClass getIsolierfall();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup#getIsolierfall <em>Isolierfall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolierfall</em>' containment reference.
	 * @see #getIsolierfall()
	 * @generated
	 */
	void setIsolierfall(Isolierfall_TypeClass value);

	/**
	 * Returns the value of the '<em><b>WKr Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibt die W Kr Anlage bezüglich ihrer konstruktiven Art. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WKr Art</em>' containment reference.
	 * @see #setWKrArt(W_Kr_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Anlage_Allg_AttributeGroup_WKrArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='W_Kr_Art'"
	 * @generated
	 */
	W_Kr_Art_TypeClass getWKrArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup#getWKrArt <em>WKr Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WKr Art</em>' containment reference.
	 * @see #getWKrArt()
	 * @generated
	 */
	void setWKrArt(W_Kr_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>WKr Grundform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der vollständigen Weichengrundform gemäß Ril. 800.0120. Die Schreibweise erfolgt grundsätzlich mit Leerzeichen! Beispiele: EW 60 - 1200 - 1:18,5 - fb; Kr 54 - 1:18,5; DKW 49 - 190 - 1:9. DB-Regerwerk Ril. 800.0120 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WKr Grundform</em>' containment reference.
	 * @see #setWKrGrundform(W_Kr_Grundform_TypeClass)
	 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Anlage_Allg_AttributeGroup_WKrGrundform()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='W_Kr_Grundform'"
	 * @generated
	 */
	W_Kr_Grundform_TypeClass getWKrGrundform();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup#getWKrGrundform <em>WKr Grundform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WKr Grundform</em>' containment reference.
	 * @see #getWKrGrundform()
	 * @generated
	 */
	void setWKrGrundform(W_Kr_Grundform_TypeClass value);

} // W_Kr_Anlage_Allg_AttributeGroup
