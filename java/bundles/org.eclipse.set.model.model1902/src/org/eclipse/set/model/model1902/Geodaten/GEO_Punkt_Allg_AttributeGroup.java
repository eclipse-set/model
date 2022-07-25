/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten;

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
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKX <em>GKX</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKY <em>GKY</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKZ <em>GKZ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGEOKoordinatenSystemLSys <em>GEO Koordinaten System LSys</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGEOKoordinatenSystemSonstige <em>GEO Koordinaten System Sonstige</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGEO_Punkt_Allg_AttributeGroup()
 * @model extendedMetaData="name='CGEO_Punkt_Allg' kind='elementOnly'"
 * @generated
 */
public interface GEO_Punkt_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>GKX</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ost-Wert, Rechtswert oder Latitude des definierten Koordinatensystems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GKX</em>' containment reference.
	 * @see #setGKX(GK_X_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGEO_Punkt_Allg_AttributeGroup_GKX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GK_X'"
	 * @generated
	 */
	GK_X_TypeClass getGKX();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKX <em>GKX</em>}' containment reference.
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
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGEO_Punkt_Allg_AttributeGroup_GKY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GK_Y'"
	 * @generated
	 */
	GK_Y_TypeClass getGKY();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKY <em>GKY</em>}' containment reference.
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
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGEO_Punkt_Allg_AttributeGroup_GKZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GK_Z'"
	 * @generated
	 */
	GK_Z_TypeClass getGKZ();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGKZ <em>GKZ</em>}' containment reference.
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
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGEO_Punkt_Allg_AttributeGroup_PlanQuelle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Plan_Quelle'"
	 * @generated
	 */
	Plan_Quelle_TypeClass getPlanQuelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Quelle</em>' containment reference.
	 * @see #getPlanQuelle()
	 * @generated
	 */
	void setPlanQuelle(Plan_Quelle_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GEO Koordinaten System LSys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der topographischen Koordinaten des Geo-Punkts in LSys-Koordinaten. Die Darstellung von topographischen Koordinaten erfolgt fürGeo-Punkte in der Regel in LSys-Koordinaten. Neben den eigentlichen Koordinaten (x, y, z) wird auch das konkrete Koordinatensystem in der Bezeichnung dargestellt. Bei übergreifenden Koordinaten in Grenzbereichen, die nicht mit LSys darstellbar sind, ist das Koordinatensystem sonstige zu verwenden. Folgende Wertigkeiten (3 Zeichen) liefert das Attribut LSys(s. a. Spezifikation Gleisnetzdaten der DB): 1. Zeichen: C Meridianstreifen 6° östliche Länge; D Meridianstreifen 9° östliche Länge; E Meridianstreifen 12° östliche Länge; F Meridianstreifen 15° östliche Länge. 2. Zeichen: A System RD/83 - Bessel-Ellipsoid, Datumspunkt Rauenberg (westliche Bundesländer, Sachsen); B System PD/83 - Bessel-Ellipsoid, Datumspunkt Potsdam (Thüringen); C System 42/83 - Krassowski-Ellipsoid, Datumspunkt Pulkowo (Brandenburg, Mecklenburg, Sachsen-Anhalt); R DB-Referenzsystem (Kartesische Koordinaten); S System Soldner - Netz 88, Datumspunkt Müggelberg (Berlin). 3. Zeichen: 0 DB-GIS Bezugsystem; A..9 Sonstige kartesische Koordinaten. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEO Koordinaten System LSys</em>' containment reference.
	 * @see #setGEOKoordinatenSystemLSys(GEO_KoordinatenSystem_LSys_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGEO_Punkt_Allg_AttributeGroup_GEOKoordinatenSystemLSys()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GEO_KoordinatenSystem_LSys'"
	 * @generated
	 */
	GEO_KoordinatenSystem_LSys_TypeClass getGEOKoordinatenSystemLSys();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGEOKoordinatenSystemLSys <em>GEO Koordinaten System LSys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEO Koordinaten System LSys</em>' containment reference.
	 * @see #getGEOKoordinatenSystemLSys()
	 * @generated
	 */
	void setGEOKoordinatenSystemLSys(GEO_KoordinatenSystem_LSys_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GEO Koordinaten System Sonstige</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sonstiges Geo-Koordinatensystem. Das Attribut ist nur dann zu verwenden, wenn das verwendete Koordinatensystem für den GEO Punkt nicht den LSys-Koordinaten entspricht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEO Koordinaten System Sonstige</em>' containment reference.
	 * @see #setGEOKoordinatenSystemSonstige(GEO_KoordinatenSystem_Sonstige_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGEO_Punkt_Allg_AttributeGroup_GEOKoordinatenSystemSonstige()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GEO_KoordinatenSystem_Sonstige'"
	 * @generated
	 */
	GEO_KoordinatenSystem_Sonstige_TypeClass getGEOKoordinatenSystemSonstige();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup#getGEOKoordinatenSystemSonstige <em>GEO Koordinaten System Sonstige</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEO Koordinaten System Sonstige</em>' containment reference.
	 * @see #getGEOKoordinatenSystemSonstige()
	 * @generated
	 */
	void setGEOKoordinatenSystemSonstige(GEO_KoordinatenSystem_Sonstige_TypeClass value);

} // GEO_Punkt_Allg_AttributeGroup
