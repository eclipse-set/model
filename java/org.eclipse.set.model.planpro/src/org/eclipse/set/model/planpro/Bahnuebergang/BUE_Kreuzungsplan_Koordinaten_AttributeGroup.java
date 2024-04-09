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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Kreuzungsplan Koordinaten Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup#getIDGEOPunkt <em>IDGEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup#getPixelKoordinateX <em>Pixel Koordinate X</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup#getPixelKoordinateY <em>Pixel Koordinate Y</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_Koordinaten_AttributeGroup()
 * @model extendedMetaData="name='CBUE_Kreuzungsplan_Koordinaten' kind='elementOnly'"
 * @generated
 */
public interface BUE_Kreuzungsplan_Koordinaten_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IDGEO Punkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen GEO_Punkt zur geografischen Verortung des Bildpunktes. Eine Mehrfachangabe ist bei Verortung in unterschiedlichen Koordinatensystemen notwendig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Punkt</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_Koordinaten_AttributeGroup_IDGEOPunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Punkt'"
	 * @generated
	 */
	EList<ID_GEO_Punkt_ohne_Proxy_TypeClass> getIDGEOPunkt();

	/**
	 * Returns the value of the '<em><b>Pixel Koordinate X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X-Wert der Raster-Koordinate zur Positionierung des bautechnischen Kreuzungsplans, der der BÜ-Planung zugrunde liegt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pixel Koordinate X</em>' containment reference.
	 * @see #setPixelKoordinateX(Pixel_Koordinate_X_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_Koordinaten_AttributeGroup_PixelKoordinateX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pixel_Koordinate_X'"
	 * @generated
	 */
	Pixel_Koordinate_X_TypeClass getPixelKoordinateX();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup#getPixelKoordinateX <em>Pixel Koordinate X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pixel Koordinate X</em>' containment reference.
	 * @see #getPixelKoordinateX()
	 * @generated
	 */
	void setPixelKoordinateX(Pixel_Koordinate_X_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Pixel Koordinate Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Y-Wert der Raster-Koordinate zur Positionierung des bautechnischen Kreuzungsplans, der der BÜ-Planung zugrunde liegt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pixel Koordinate Y</em>' containment reference.
	 * @see #setPixelKoordinateY(Pixel_Koordinate_Y_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_Koordinaten_AttributeGroup_PixelKoordinateY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pixel_Koordinate_Y'"
	 * @generated
	 */
	Pixel_Koordinate_Y_TypeClass getPixelKoordinateY();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup#getPixelKoordinateY <em>Pixel Koordinate Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pixel Koordinate Y</em>' containment reference.
	 * @see #getPixelKoordinateY()
	 * @generated
	 */
	void setPixelKoordinateY(Pixel_Koordinate_Y_TypeClass value);

} // BUE_Kreuzungsplan_Koordinaten_AttributeGroup
