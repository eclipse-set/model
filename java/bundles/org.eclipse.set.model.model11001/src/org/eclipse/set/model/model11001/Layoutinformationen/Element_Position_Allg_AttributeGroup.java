/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Layoutinformationen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Geodaten.GEO_Punkt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Position Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position_Allg_AttributeGroup#getDarstellungRichtungswinkel <em>Darstellung Richtungswinkel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position_Allg_AttributeGroup#getDarstellungGEOPunkt <em>Darstellung GEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position_Allg_AttributeGroup#getDarstellungPolygonzug <em>Darstellung Polygonzug</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getElement_Position_Allg_AttributeGroup()
 * @model extendedMetaData="name='CElement_Position_Allg' kind='elementOnly'"
 * @generated
 */
public interface Element_Position_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Darstellung Richtungswinkel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Richtungswinkel für die Darstellung in [gon]. Es gilt nachfolgende Zuordnung der Richtung: Nord = 0,0 gon Ost = 100,0 gon Süd = 200,0 gon West = 300,0 gon. Originale negative Werte werden durch Addition von 400.0 gon normalisiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Darstellung Richtungswinkel</em>' containment reference.
	 * @see #setDarstellungRichtungswinkel(Darstellung_Richtungswinkel_TypeClass)
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getElement_Position_Allg_AttributeGroup_DarstellungRichtungswinkel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Darstellung_Richtungswinkel'"
	 * @generated
	 */
	Darstellung_Richtungswinkel_TypeClass getDarstellungRichtungswinkel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position_Allg_AttributeGroup#getDarstellungRichtungswinkel <em>Darstellung Richtungswinkel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Darstellung Richtungswinkel</em>' containment reference.
	 * @see #getDarstellungRichtungswinkel()
	 * @generated
	 */
	void setDarstellungRichtungswinkel(Darstellung_Richtungswinkel_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Darstellung GEO Punkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Geodaten.GEO_Punkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen GEO_Punkt zur Angabe der Position, an der das Symbol für das Fachobjekt im referenzierten Lageplan dargestellt werden soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Darstellung GEO Punkt</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getElement_Position_Allg_AttributeGroup_DarstellungGEOPunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Darstellung_GEO_Punkt'"
	 * @generated
	 */
	EList<GEO_Punkt> getDarstellungGEOPunkt();

	/**
	 * Returns the value of the '<em><b>Darstellung Polygonzug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Polygonzug zur Darstellung des Fachobjekts unter Nutzung des GML-Standards. Die Information wird nur gegeben, wenn kein Standard-Symbol zur Anwendung kommt und sich die Darstellung nicht einfach algorithmisch herleiten lässt (z. B. Grenzlinie NB_Zone).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Darstellung Polygonzug</em>' containment reference.
	 * @see #setDarstellungPolygonzug(Darstellung_Polygonzug_TypeClass)
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getElement_Position_Allg_AttributeGroup_DarstellungPolygonzug()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Darstellung_Polygonzug'"
	 * @generated
	 */
	Darstellung_Polygonzug_TypeClass getDarstellungPolygonzug();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position_Allg_AttributeGroup#getDarstellungPolygonzug <em>Darstellung Polygonzug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Darstellung Polygonzug</em>' containment reference.
	 * @see #getDarstellungPolygonzug()
	 * @generated
	 */
	void setDarstellungPolygonzug(Darstellung_Polygonzug_TypeClass value);

} // Element_Position_Allg_AttributeGroup
