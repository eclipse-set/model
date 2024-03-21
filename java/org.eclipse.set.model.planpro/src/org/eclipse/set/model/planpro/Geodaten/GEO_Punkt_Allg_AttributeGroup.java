/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEO Punkt Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGEOKoordinatensystem <em>GEO Koordinatensystem</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKX <em>GKX</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKY <em>GKY</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKZ <em>GKZ</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Punkt_Allg_AttributeGroup()
 * @model extendedMetaData="name='CGEO_Punkt_Allg' kind='elementOnly'"
 * @generated
 */
public interface GEO_Punkt_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>GEO Koordinatensystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der topographischen Koordinaten des Geo-Punkts, in der Regel in LSys-Koordinaten. Neben den eigentlichen Koordinaten (x, y, z) wird auch das konkrete Koordinatensystem in der Bezeichnung dargestellt. Bei übergreifenden Koordinaten in Grenzbereichen, die nicht mit LSys darstellbar sind, ist der Wert \"sonstige\" zu verwenden und das Koordinatensystem mittels Bearbeitungsvermerk anzugeben. Folgende Wertigkeiten (3 Zeichen) liefert das Attribut LSys (s. a. Spezifikation Gleisnetzdaten der DB): 1. Zeichen: C Meridianstreifen 6° östliche Länge; D Meridianstreifen 9° östliche Länge; E Meridianstreifen 12° östliche Länge; F Meridianstreifen 15° östliche Länge. 2. Zeichen: A System RD/83 - Bessel-Ellipsoid, Datumspunkt Rauenberg (westliche Bundesländer, Sachsen); B System PD/83 - Bessel-Ellipsoid, Datumspunkt Potsdam (Thüringen); C System 42/83 - Krassowski-Ellipsoid, Datumspunkt Pulkowo (Brandenburg, Mecklenburg, Sachsen-Anhalt); R DB-Referenzsystem (Kartesische Koordinaten); S System Soldner - Netz 88, Datumspunkt Müggelberg (Berlin). 3. Zeichen: 0 DB-GIS Bezugsystem; A..9 Sonstige kartesische Koordinaten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEO Koordinatensystem</em>' containment reference.
	 * @see #setGEOKoordinatensystem(GEO_Koordinatensystem_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Punkt_Allg_AttributeGroup_GEOKoordinatensystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GEO_Koordinatensystem'"
	 * @generated
	 */
	GEO_Koordinatensystem_TypeClass getGEOKoordinatensystem();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGEOKoordinatensystem <em>GEO Koordinatensystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEO Koordinatensystem</em>' containment reference.
	 * @see #getGEOKoordinatensystem()
	 * @generated
	 */
	void setGEOKoordinatensystem(GEO_Koordinatensystem_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GKX</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ost-Wert, Rechtswert oder Latitude des definierten Koordinatensystems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GKX</em>' containment reference.
	 * @see #setGKX(GK_X_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Punkt_Allg_AttributeGroup_GKX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GK_X'"
	 * @generated
	 */
	GK_X_TypeClass getGKX();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKX <em>GKX</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GKX</em>' containment reference.
	 * @see #getGKX()
	 * @generated
	 */
	void setGKX(GK_X_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GKY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nord-Wert, Hochwert oder Longitude des definierten Koordinatensystems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GKY</em>' containment reference.
	 * @see #setGKY(GK_Y_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Punkt_Allg_AttributeGroup_GKY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GK_Y'"
	 * @generated
	 */
	GK_Y_TypeClass getGKY();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKY <em>GKY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GKY</em>' containment reference.
	 * @see #getGKY()
	 * @generated
	 */
	void setGKY(GK_Y_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GKZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Höhen-Wert oder Altitude des definierten Koordinatensystems. Aktuell steht die z-Koordinate dem System nicht zur Verfügung. Die z-Koordinate für den GEO_Punkt könnte durch Interpolation vorhandener Höhenpunkte Links und Rechts generiert werden. Wenn zu einem späteren Zeitpunkt die z-Koordinaten mitgeliefert werden, könnten die Höhenpunkte durch die z-Koordinaten ersetzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GKZ</em>' containment reference.
	 * @see #setGKZ(GK_Z_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Punkt_Allg_AttributeGroup_GKZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GK_Z'"
	 * @generated
	 */
	GK_Z_TypeClass getGKZ();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKZ <em>GKZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GKZ</em>' containment reference.
	 * @see #getGKZ()
	 * @generated
	 */
	void setGKZ(GK_Z_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Plan Quelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quelle der Geo-Kante, des Geo-Knotens, des Höhenpunkts, der Höhenlinie, der Überhöhung bzw. der Überhöhungslinie. Bei Auswahl von „sonstige“ ist zwingend ein Bearbeitungsvermerk anzugeben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan Quelle</em>' containment reference.
	 * @see #setPlanQuelle(Plan_Quelle_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Punkt_Allg_AttributeGroup_PlanQuelle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Plan_Quelle'"
	 * @generated
	 */
	Plan_Quelle_TypeClass getPlanQuelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Quelle</em>' containment reference.
	 * @see #getPlanQuelle()
	 * @generated
	 */
	void setPlanQuelle(Plan_Quelle_TypeClass value);

} // GEO_Punkt_Allg_AttributeGroup
