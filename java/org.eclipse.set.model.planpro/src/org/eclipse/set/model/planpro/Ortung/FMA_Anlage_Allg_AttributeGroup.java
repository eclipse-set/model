/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMA Anlage Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMAArt <em>FMA Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMAHilffreimeldung <em>FMA Hilffreimeldung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMAIsolierung <em>FMA Isolierung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMATyp <em>FMA Typ</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Allg_AttributeGroup()
 * @model extendedMetaData="name='CFMA_Anlage_Allg' kind='elementOnly'"
 * @generated
 */
public interface FMA_Anlage_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>FMA Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Gleisfreimeldeanlage. DB-Regelwerk Im bisherigen PT1 ist dies nur mittelbar durch die vorgenommenen Eintragungen in den jeweiligen Bereichen der Freimeldetabelle erkennbar. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Art</em>' containment reference.
	 * @see #setFMAArt(FMA_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Allg_AttributeGroup_FMAArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FMA_Art'"
	 * @generated
	 */
	FMA_Art_TypeClass getFMAArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMAArt <em>FMA Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Art</em>' containment reference.
	 * @see #getFMAArt()
	 * @generated
	 */
	void setFMAArt(FMA_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Hilffreimeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gibt an, ob eine Hilfsfreimeldung eingerichtet ist. Wertzuordnung: true - Hilfsfreimeldung eingerichtet, false - Hilfsfreimeldung nicht eingerichtet. DB-Regelwerk Planungsdaten: Freimeldetabelle, Spalte 18 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Hilffreimeldung</em>' containment reference.
	 * @see #setFMAHilffreimeldung(FMA_Hilffreimeldung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Allg_AttributeGroup_FMAHilffreimeldung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FMA_Hilffreimeldung'"
	 * @generated
	 */
	FMA_Hilffreimeldung_TypeClass getFMAHilffreimeldung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMAHilffreimeldung <em>FMA Hilffreimeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Hilffreimeldung</em>' containment reference.
	 * @see #getFMAHilffreimeldung()
	 * @generated
	 */
	void setFMAHilffreimeldung(FMA_Hilffreimeldung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Isolierung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Isolierung bei Gleisstromkreisen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Isolierung</em>' containment reference.
	 * @see #setFMAIsolierung(FMA_Isolierung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Allg_AttributeGroup_FMAIsolierung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Isolierung'"
	 * @generated
	 */
	FMA_Isolierung_TypeClass getFMAIsolierung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMAIsolierung <em>FMA Isolierung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Isolierung</em>' containment reference.
	 * @see #getFMAIsolierung()
	 * @generated
	 */
	void setFMAIsolierung(FMA_Isolierung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vollständige Bezeichnung des technischen Typs der Gleisfreimeldeanlage. Beispiele: AZ SM[E], FTG S 917 W, GF 100 zu WM 74. DB-Regelwerk Planungsdaten: Freimeldetabelle, Spalte 3, 7 oder 12 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Typ</em>' containment reference.
	 * @see #setFMATyp(FMA_Typ_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Allg_AttributeGroup_FMATyp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Typ'"
	 * @generated
	 */
	FMA_Typ_TypeClass getFMATyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Allg_AttributeGroup#getFMATyp <em>FMA Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Typ</em>' containment reference.
	 * @see #getFMATyp()
	 * @generated
	 */
	void setFMATyp(FMA_Typ_TypeClass value);

} // FMA_Anlage_Allg_AttributeGroup
